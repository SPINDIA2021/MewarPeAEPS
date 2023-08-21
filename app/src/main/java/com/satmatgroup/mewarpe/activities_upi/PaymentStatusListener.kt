package com.satmatgroup.mewarpe.activities_upi

interface PaymentStatusListener {
    fun onTransactionCompleted(transactionDetails: TransactionDetails?)
    fun onTransactionSuccess()
    fun onTransactionSubmitted()
    fun onTransactionFailed()
    fun onTransactionCancelled()
    fun onAppNotFound()
}