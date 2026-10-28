package com.whoop.domain.model.teams;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/domain/model/teams/PrivacyType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DETAIL", "SUMMARY", "HIDDEN", "isAtLeast", "", "other", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum PrivacyType {
    DETAIL(0),
    SUMMARY(1),
    HIDDEN(2);

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final int value;

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PrivacyType.values().length];
            try {
                iArr[PrivacyType.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrivacyType.SUMMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrivacyType.DETAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    PrivacyType(int i13) {
        this.value = i13;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }

    public final boolean isAtLeast(PrivacyType other) {
        AbstractC22676k.m65750j(other, "other");
        int i13 = WhenMappings.$EnumSwitchMapping$0[other.ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 == 3) {
                    return this == DETAIL;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (this != SUMMARY && this != DETAIL) {
                return false;
            }
        }
        return true;
    }
}
