package com.google.android.gms.tasks;

import p073cq.C11052u;

/* JADX INFO: loaded from: classes6.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    /* JADX INFO: renamed from: a */
    public static IllegalStateException m15636a(C11052u c11052u) {
        String strConcat;
        if (!c11052u.isComplete()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception exception = c11052u.getException();
        if (exception != null) {
            strConcat = "failure";
        } else if (c11052u.isSuccessful()) {
            strConcat = "result ".concat(String.valueOf(c11052u.getResult()));
        } else {
            strConcat = c11052u.f34670d ? "cancellation" : "unknown issue";
        }
        return new DuplicateTaskCompletionException("Complete with: ".concat(strConcat), exception);
    }
}
