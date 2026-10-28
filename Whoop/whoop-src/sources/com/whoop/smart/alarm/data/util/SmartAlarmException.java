package com.whoop.smart.alarm.data.util;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/whoop/smart/alarm/data/util/SmartAlarmException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "smart-alarm_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SmartAlarmException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartAlarmException(String message, Throwable th3) {
        super(message, th3);
        AbstractC22676k.m65750j(message, "message");
    }
}
