package cz;

import my.EnumC26028b;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: cz.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C11188a {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11188a)) {
            return false;
        }
        EnumC26028b enumC26028b = EnumC26028b.Full;
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + AbstractC2875y.m8289b(EnumC26028b.None.hashCode() * 31, 31, false);
    }

    public final String toString() {
        return "CustomerPermissions(removePaymentMethod=" + EnumC26028b.None + ", canRemoveLastPaymentMethod=false, canUpdateFullPaymentMethodDetails=false)";
    }
}
