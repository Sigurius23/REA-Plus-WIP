package com.google.common.util.concurrent;

import java.util.Objects;
import p097ds.AbstractC12313p;
import p097ds.AbstractC12314q;
import p690zr.AbstractC41032j0;

/* JADX INFO: loaded from: classes6.dex */
public final class CycleDetectingLockFactory$PotentialDeadlockException extends IllegalStateException {
    static {
        AbstractC41032j0.m133263l(3, AbstractC12314q.class.getName(), "com.google.common.util.concurrent.CycleDetectingLockFactory$PotentialDeadlockException", AbstractC12313p.class.getName());
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        Objects.requireNonNull(message);
        StringBuilder sb4 = new StringBuilder(message);
        for (Throwable cause = null; cause != null; cause = cause.getCause()) {
            sb4.append(", ");
            sb4.append(cause.getMessage());
        }
        return sb4.toString();
    }
}
