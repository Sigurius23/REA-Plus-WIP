package com.whoop.data.repositories;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/data/repositories/Resolution;", "", "stepSize", "", "<init>", "(Ljava/lang/String;II)V", "getStepSize", "()I", "HIGH", "MEDIUM", "LOW", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum Resolution {
    HIGH(6),
    MEDIUM(60),
    LOW(600);

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final int stepSize;

    Resolution(int i13) {
        this.stepSize = i13;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final int getStepSize() {
        return this.stepSize;
    }
}
