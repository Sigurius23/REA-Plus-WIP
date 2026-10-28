package o20;

import java.util.LinkedHashMap;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.EnumC29820h;

/* JADX INFO: renamed from: o20.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C27457b {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f110655a;

    /* JADX INFO: renamed from: b */
    public final EnumC29820h f110656b;

    public C27457b(LinkedHashMap linkedHashMap, EnumC29820h userRequestedReuse) {
        AbstractC22676k.m65750j(userRequestedReuse, "userRequestedReuse");
        this.f110655a = linkedHashMap;
        this.f110656b = userRequestedReuse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27457b)) {
            return false;
        }
        C27457b c27457b = (C27457b) obj;
        return this.f110655a.equals(c27457b.f110655a) && this.f110656b == c27457b.f110656b;
    }

    public final int hashCode() {
        return this.f110656b.hashCode() + (this.f110655a.hashCode() * 31);
    }

    public final String toString() {
        return "FormFieldValues(fieldValuePairs=" + this.f110655a + ", userRequestedReuse=" + this.f110656b + ")";
    }
}
