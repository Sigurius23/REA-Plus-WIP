package com.google.firebase.installations;

import com.google.firebase.FirebaseException;
import p529uo.AbstractC35135w;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseInstallationsException extends FirebaseException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseInstallationsException(String str) {
        super(str);
        AbstractC35135w.m111093e(str, "Detail message must not be empty");
    }
}
