package p510u0;

import p000.AbstractC11266d;
import p412q3.C29877k;
import p412q3.C29878l;
import p412q3.C29879m;
import p412q3.C29880n;
import p478s3.C32096b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: u0.r0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34351r0 {

    /* JADX INFO: renamed from: e */
    public static final C34351r0 f144296e;

    /* JADX INFO: renamed from: a */
    public final int f144297a;

    /* JADX INFO: renamed from: b */
    public final Boolean f144298b;

    /* JADX INFO: renamed from: c */
    public final int f144299c;

    /* JADX INFO: renamed from: d */
    public final int f144300d;

    static {
        int i13 = 0;
        f144296e = new C34351r0(i13, i13, i13, 127);
    }

    public /* synthetic */ C34351r0(int i13, int i14, int i15, int i16) {
        this((i16 & 1) != 0 ? -1 : i13, (i16 & 2) != 0 ? null : Boolean.FALSE, (i16 & 4) != 0 ? 0 : i14, (i16 & 8) != 0 ? -1 : i15);
    }

    /* JADX INFO: renamed from: a */
    public final C29878l m108655a(boolean z4) {
        int i13 = this.f144297a;
        C29879m c29879m = new C29879m(i13);
        if (i13 == -1) {
            c29879m = null;
        }
        int i14 = c29879m != null ? c29879m.f122105a : 0;
        Boolean bool = this.f144298b;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        int i15 = this.f144299c;
        C29880n c29880n = new C29880n(i15);
        if (i15 == 0) {
            c29880n = null;
        }
        int i16 = c29880n != null ? c29880n.f122106a : 1;
        int i17 = this.f144300d;
        C29877k c29877k = i17 != -1 ? new C29877k(i17) : null;
        return new C29878l(z4, i14, zBooleanValue, i16, c29877k != null ? c29877k.f122097a : 1, C32096b.f133098y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34351r0)) {
            return false;
        }
        C34351r0 c34351r0 = (C34351r0) obj;
        return this.f144297a == c34351r0.f144297a && AbstractC22676k.m65745e(this.f144298b, c34351r0.f144298b) && this.f144299c == c34351r0.f144299c && this.f144300d == c34351r0.f144300d;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f144297a) * 31;
        Boolean bool = this.f144298b;
        return AbstractC11266d.m30448b(this.f144300d, AbstractC11266d.m30448b(this.f144299c, (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31), 29791);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) C29879m.m91502a(this.f144297a)) + ", autoCorrectEnabled=" + this.f144298b + ", keyboardType=" + ((Object) C29880n.m91503a(this.f144299c)) + ", imeAction=" + ((Object) C29877k.m91501a(this.f144300d)) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }

    public C34351r0(int i13, Boolean bool, int i14, int i15) {
        this.f144297a = i13;
        this.f144298b = bool;
        this.f144299c = i14;
        this.f144300d = i15;
    }
}
