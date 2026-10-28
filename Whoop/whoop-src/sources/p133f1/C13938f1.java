package p133f1;

import android.view.textclassifier.TextClassification;
import p000.AbstractC11266d;
import p294l3.C23283u0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: f1.f1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13938f1 {

    /* JADX INFO: renamed from: a */
    public final CharSequence f49687a;

    /* JADX INFO: renamed from: b */
    public final long f49688b;

    /* JADX INFO: renamed from: c */
    public final TextClassification f49689c;

    public C13938f1(CharSequence charSequence, long j7, TextClassification textClassification) {
        this.f49687a = charSequence;
        this.f49688b = j7;
        this.f49689c = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13938f1)) {
            return false;
        }
        C13938f1 c13938f1 = (C13938f1) obj;
        return AbstractC22676k.m65745e(this.f49687a, c13938f1.f49687a) && C23283u0.m67356b(this.f49688b, c13938f1.f49688b) && AbstractC22676k.m65745e(this.f49689c, c13938f1.f49689c);
    }

    public final int hashCode() {
        int iHashCode = this.f49687a.hashCode() * 31;
        int i13 = C23283u0.f92252c;
        return this.f49689c.hashCode() + AbstractC11266d.m30451e(iHashCode, this.f49688b, 31);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.f49687a) + ", selection=" + ((Object) C23283u0.m67362h(this.f49688b)) + ", textClassification=" + this.f49689c + ')';
    }
}
