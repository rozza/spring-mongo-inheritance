package com.example.springmongoinheritance.models;

public final class ReturnStd extends ReturnBase {

        private boolean stdTypeIndicator;

    public ReturnStd() {
    }

    public ReturnStd(final String transactionDt, final String payerReturnType, final String transactionCd, final boolean stdTypeIndicator) {
        super(transactionDt, payerReturnType, transactionCd);
        this.stdTypeIndicator = stdTypeIndicator;
    }

    public boolean isStdTypeIndicator() {
        return stdTypeIndicator;
    }

    public ReturnStd setStdTypeIndicator(final boolean stdTypeIndicator) {
        this.stdTypeIndicator = stdTypeIndicator;
        return this;
    }

    @Override
    public String toString() {
        return "ReturnStd{" +
                "stdTypeIndicator=" + stdTypeIndicator
                + super.toString();
    }
}
