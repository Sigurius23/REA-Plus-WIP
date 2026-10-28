package iq0;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: iq0.d0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m65681d2 = {"Liq0/d0;", "", "", "displayValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getDisplayValue", "()Ljava/lang/String;", "ALL_NEW_MESSAGES", "MENTIONS_ONLY", "NONE", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC20824d0 {
    ALL_NEW_MESSAGES("all"),
    MENTIONS_ONLY("mentions_only"),
    NONE("none");

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final String displayValue;

    EnumC20824d0(String str) {
        this.displayValue = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final String getDisplayValue() {
        return this.displayValue;
    }
}
