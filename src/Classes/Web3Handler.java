/*
 * %W% %E% Hamza Yasin
 *
 * Copyright (c) 2017-2018 Miranz Technology. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Miranz
 * technology. You shall not disclose such Confidential Information and 
 * shall use it only in accordance with the terms of the license agreement 
 * you entered into with Miranz.
 *
 */


package Classes;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.web3j.crypto.CipherException;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.methods.response.EthGetBalance;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.exceptions.TransactionTimeoutException;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.Transfer;
import org.web3j.utils.Convert;

/**
 * This class is written for basic functions of Ethereum and web3j integration
 * Because it's handling all the basic function of web3j so that's why we named
 * it as a web3Handler.
 *
 * @version 1.10 25 Aug 2017
 * @author Hamza Yasin
 */

public class Web3Handler {
    /** String variable 'network' is used for selecting which network you want to use*/
    public static String network;
    /** Web3j variable 'web3' is used to implement all the functions, exist in Web3j Library*/
    public static Web3j web3;
    /** Credentials variable 'credentials' is used to implement all the functions, exist in Credentials Library*/
    public static Credentials credentials;
     /**
      * web3Connection function is used to create the connection with the end-client node. // I uses Infura API.
      * @param string is used to concatenate the address of network connected with the API.  
      * @return 
      */
    public static boolean web3Connection(String string){
        web3 = Web3j.build(new HttpService("https://" + string + ".infura.io/wrtnuPnxYVCkCoeWWzs1"));
        return web3 != null;
    }
     /**
      * loadCredentials function is used to load the UTC-JSON file from a particular path. 
      * @param password  is used to access your UTC-JSON file.  
      * @param path is used to give a path where your UTC-JSON file is located.
      * @throws IOException
      * @throws CipherException
      */
    public static void loadCredentials(String password, String path) throws IOException, CipherException {
        credentials = WalletUtils.loadCredentials(password, path);
    }
      /**
      * generateWallet function is used to generate the UTC-JSON file against a particular password on static path (Here it is Desktop). 
      * @param password  is used to access your UTC-JSON file.  
      * @throws IOException
      * @throws CipherException
      * @throws InvalidAlgorithmParameterException
      * @throws NoSuchAlgorithmException
      * @throws NoSuchProviderException
      */
     public static void generateWallet(String password) throws IOException, CipherException, InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchProviderException {
        WalletUtils.generateFullNewWalletFile(password, new File("C:\\Users\\mubas\\Desktop"));
    }
      /**
      * transaction function is used to send funds from your address to another Ethereum address. 
      * @param address   is a TO address or a address where you want to transfer funds.  
      * @param amount   is a amount you want to send.
      * @throws TransactionTimeoutException
      * @throws IOException
      * @throws InterruptedException
      * @return
      */
    public static TransactionReceipt transaction(String address, double amount) throws InterruptedException, IOException, TransactionTimeoutException {
        return Transfer.sendFunds( web3, credentials, address, BigDecimal.valueOf(amount), Convert.Unit.ETHER); 
    }
    /**
      * getBalance function is used to get Balance and it returns the BigInteger value. 
      * @throws InterruptedException
      * @throws ExecutionException
      * @return
      */
    public static BigInteger getBalance() throws InterruptedException, ExecutionException{
        Future<EthGetBalance> ethGetBalanceFuture = web3.ethGetBalance(credentials.getAddress(), DefaultBlockParameterName.LATEST).sendAsync();
        return ethGetBalanceFuture.get().getBalance();
    }
    
}