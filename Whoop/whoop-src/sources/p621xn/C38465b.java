package p621xn;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;
import p309lo.AbstractC24543a;
import p465rm.InterfaceC31529f;
import p537ux.C35331f0;

/* JADX INFO: renamed from: xn.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C38465b implements InterfaceC31529f {

    /* JADX INFO: renamed from: R */
    public static final C38465b f164723R = new C38465b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);

    /* JADX INFO: renamed from: S */
    public static final C35331f0 f164724S = new C35331f0(6);

    /* JADX INFO: renamed from: E */
    public final float f164725E;

    /* JADX INFO: renamed from: F */
    public final int f164726F;

    /* JADX INFO: renamed from: G */
    public final int f164727G;

    /* JADX INFO: renamed from: H */
    public final float f164728H;

    /* JADX INFO: renamed from: I */
    public final int f164729I;

    /* JADX INFO: renamed from: J */
    public final float f164730J;

    /* JADX INFO: renamed from: K */
    public final float f164731K;

    /* JADX INFO: renamed from: L */
    public final boolean f164732L;

    /* JADX INFO: renamed from: M */
    public final int f164733M;

    /* JADX INFO: renamed from: N */
    public final int f164734N;

    /* JADX INFO: renamed from: O */
    public final float f164735O;

    /* JADX INFO: renamed from: P */
    public final int f164736P;

    /* JADX INFO: renamed from: Q */
    public final float f164737Q;

    /* JADX INFO: renamed from: w */
    public final CharSequence f164738w;

    /* JADX INFO: renamed from: x */
    public final Layout.Alignment f164739x;

    /* JADX INFO: renamed from: y */
    public final Layout.Alignment f164740y;

    /* JADX INFO: renamed from: z */
    public final Bitmap f164741z;

    public C38465b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f13, int i13, int i14, float f14, int i15, int i16, float f15, float f16, float f17, boolean z4, int i17, int i18, float f18) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            AbstractC24543a.m71569e(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f164738w = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f164738w = charSequence.toString();
        } else {
            this.f164738w = null;
        }
        this.f164739x = alignment;
        this.f164740y = alignment2;
        this.f164741z = bitmap;
        this.f164725E = f13;
        this.f164726F = i13;
        this.f164727G = i14;
        this.f164728H = f14;
        this.f164729I = i15;
        this.f164730J = f16;
        this.f164731K = f17;
        this.f164732L = z4;
        this.f164733M = i17;
        this.f164734N = i16;
        this.f164735O = f15;
        this.f164736P = i18;
        this.f164737Q = f18;
    }

    /* JADX INFO: renamed from: a */
    public final C38464a m123259a() {
        C38464a c38464a = new C38464a();
        c38464a.f164706a = this.f164738w;
        c38464a.f164707b = this.f164741z;
        c38464a.f164708c = this.f164739x;
        c38464a.f164709d = this.f164740y;
        c38464a.f164710e = this.f164725E;
        c38464a.f164711f = this.f164726F;
        c38464a.f164712g = this.f164727G;
        c38464a.f164713h = this.f164728H;
        c38464a.f164714i = this.f164729I;
        c38464a.f164715j = this.f164734N;
        c38464a.f164716k = this.f164735O;
        c38464a.f164717l = this.f164730J;
        c38464a.f164718m = this.f164731K;
        c38464a.f164719n = this.f164732L;
        c38464a.f164720o = this.f164733M;
        c38464a.f164721p = this.f164736P;
        c38464a.f164722q = this.f164737Q;
        return c38464a;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (this == obj) {
            return true;
        }
        if (obj != null && C38465b.class == obj.getClass()) {
            C38465b c38465b = (C38465b) obj;
            Bitmap bitmap2 = c38465b.f164741z;
            if (TextUtils.equals(this.f164738w, c38465b.f164738w) && this.f164739x == c38465b.f164739x && this.f164740y == c38465b.f164740y && ((bitmap = this.f164741z) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.f164725E == c38465b.f164725E && this.f164726F == c38465b.f164726F && this.f164727G == c38465b.f164727G && this.f164728H == c38465b.f164728H && this.f164729I == c38465b.f164729I && this.f164730J == c38465b.f164730J && this.f164731K == c38465b.f164731K && this.f164732L == c38465b.f164732L && this.f164733M == c38465b.f164733M && this.f164734N == c38465b.f164734N && this.f164735O == c38465b.f164735O && this.f164736P == c38465b.f164736P && this.f164737Q == c38465b.f164737Q) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f164738w, this.f164739x, this.f164740y, this.f164741z, Float.valueOf(this.f164725E), Integer.valueOf(this.f164726F), Integer.valueOf(this.f164727G), Float.valueOf(this.f164728H), Integer.valueOf(this.f164729I), Float.valueOf(this.f164730J), Float.valueOf(this.f164731K), Boolean.valueOf(this.f164732L), Integer.valueOf(this.f164733M), Integer.valueOf(this.f164734N), Float.valueOf(this.f164735O), Integer.valueOf(this.f164736P), Float.valueOf(this.f164737Q)});
    }
}
