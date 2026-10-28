package com.whoop.data.remote.domain.request.onboarding;

import com.google.gson.annotations.SerializedName;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/data/remote/domain/request/onboarding/CheckAccountStartStateResponse;", "", "startState", "Lcom/whoop/data/remote/domain/request/onboarding/AccountStartState;", "<init>", "(Lcom/whoop/data/remote/domain/request/onboarding/AccountStartState;)V", "getStartState", "()Lcom/whoop/data/remote/domain/request/onboarding/AccountStartState;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class CheckAccountStartStateResponse {

    @SerializedName("start_state")
    private final AccountStartState startState;

    public CheckAccountStartStateResponse(AccountStartState startState) {
        AbstractC22676k.m65750j(startState, "startState");
        this.startState = startState;
    }

    public static /* synthetic */ CheckAccountStartStateResponse copy$default(CheckAccountStartStateResponse checkAccountStartStateResponse, AccountStartState accountStartState, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            accountStartState = checkAccountStartStateResponse.startState;
        }
        return checkAccountStartStateResponse.copy(accountStartState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AccountStartState getStartState() {
        return this.startState;
    }

    public final CheckAccountStartStateResponse copy(AccountStartState startState) {
        AbstractC22676k.m65750j(startState, "startState");
        return new CheckAccountStartStateResponse(startState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CheckAccountStartStateResponse) && this.startState == ((CheckAccountStartStateResponse) other).startState;
    }

    public final AccountStartState getStartState() {
        return this.startState;
    }

    public int hashCode() {
        return this.startState.hashCode();
    }

    public String toString() {
        return "CheckAccountStartStateResponse(startState=" + this.startState + ")";
    }
}
