package com.whoop.domain.model.event;

import p319m4.AbstractC25012a;
import qr2.AbstractC30556a;
import tr2.AbstractC34111i;

/* JADX INFO: loaded from: classes4.dex */
public class LoggableEvent extends AbstractC30556a {
    public final int level;
    public final String message;
    public final String messageTag;
    public final Throwable throwable;

    public LoggableEvent(int i13, String str, String str2, Throwable th3, long j7, AbstractC30556a.a... aVarArr) {
        super(j7, aVarArr);
        this.level = i13;
        this.messageTag = str;
        this.message = str2;
        this.throwable = th3;
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(AbstractC34111i.m107840a(this.level));
        sb4.append(": ");
        if (this.messageTag != null) {
            sb4.append("(");
            sb4.append(this.messageTag);
            sb4.append(") ");
        }
        return AbstractC25012a.m73376i(this.message, "\n", sb4);
    }
}
