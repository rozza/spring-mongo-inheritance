package com.example.springmongoinheritance.models;

public abstract class ReturnBase implements PayerReturn {

    private String transactionDt;
    private String payerReturnType;
    private String transactionCd;

    public ReturnBase() {
        super();
    }

    public ReturnBase(final String transactionDt, final String payerReturnType, final String transactionCd) {
        this.transactionDt = transactionDt;
        this.payerReturnType = payerReturnType;
        this.transactionCd = transactionCd;
    }

    public String getTransactionDt() {
        return transactionDt;
    }

    public ReturnBase setTransactionDt(final String transactionDt) {
        this.transactionDt = transactionDt;
        return this;
    }

    @Override
    public String getPayerReturnType() {
        return payerReturnType;
    }

    public ReturnBase setPayerReturnType(final String payerReturnType) {
        this.payerReturnType = payerReturnType;
        return this;
    }

    @Override
    public String getTransactionCd() {
        return transactionCd;
    }

    public ReturnBase setTransactionCd(final String transactionCd) {
        this.transactionCd = transactionCd;
        return this;
    }

    @Override
    public String toString() {
        return ", transactionDt='" + transactionDt + '\'' +
                ", payerReturnType='" + payerReturnType + '\'' +
                ", transactionCd='" + transactionCd + '\'' +
                '}';
    }
}