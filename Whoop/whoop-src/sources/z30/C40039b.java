package z30;

import android.text.SpannableString;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z30.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C40039b {

    /* JADX INFO: renamed from: a */
    public final SpannableString f172758a;

    /* JADX INFO: renamed from: b */
    public final SpannableString f172759b;

    /* JADX INFO: renamed from: c */
    public final String f172760c;

    public C40039b(SpannableString spannableString, SpannableString spannableString2, String str) {
        this.f172758a = spannableString;
        this.f172759b = spannableString2;
        this.f172760c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40039b)) {
            return false;
        }
        C40039b c40039b = (C40039b) obj;
        return AbstractC22676k.m65745e(this.f172758a, c40039b.f172758a) && AbstractC22676k.m65745e(this.f172759b, c40039b.f172759b) && AbstractC22676k.m65745e(this.f172760c, c40039b.f172760c);
    }

    public final int hashCode() {
        return this.f172760c.hashCode() + ((this.f172759b.hashCode() + (this.f172758a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("AutocompletePrediction(primaryText=");
        sb4.append((Object) this.f172758a);
        sb4.append(", secondaryText=");
        sb4.append((Object) this.f172759b);
        sb4.append(", placeId=");
        return AbstractC25012a.m73376i(this.f172760c, ")", sb4);
    }
}
