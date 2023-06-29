package com.example.springmongoinheritance.models;

public final class ReturnIra extends ReturnBase {
    private boolean iraTypeIndicator;

    public ReturnIra() {
    }

    public ReturnIra(final String transactionDt, final String payerReturnType, final String transactionCd, final boolean iraTypeIndicator) {
        super(transactionDt, payerReturnType, transactionCd);
        this.iraTypeIndicator = iraTypeIndicator;
    }

    public boolean isIraTypeIndicator() {
        return iraTypeIndicator;
    }

    public ReturnIra setIraTypeIndicator(final boolean iraTypeIndicator) {
        this.iraTypeIndicator = iraTypeIndicator;
        return this;
    }

    @Override
    public String toString() {
        return "ReturnIra{" +
                "iraTypeIndicator=" + iraTypeIndicator
                + super.toString();
    }
}