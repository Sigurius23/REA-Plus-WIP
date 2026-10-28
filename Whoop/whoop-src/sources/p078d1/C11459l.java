package p078d1;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import bi.AbstractC3269g;
import e93.AbstractC12889b;
import j93.AbstractC21478l0;
import p027b3.AbstractC2378g1;
import p043c4.AbstractC3979v;
import p181h2.C16618c;
import p208i2.AbstractC17918w0;
import p208i2.C17896l0;
import p294l3.C23277r0;
import p294l3.C23283u0;
import p412q3.C29891y;
import p412q3.InterfaceC29884r;
import p571w3.EnumC36774j;
import p635y2.InterfaceC39147y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d1.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C11459l {

    /* JADX INFO: renamed from: a */
    public final C11448a f36759a;

    /* JADX INFO: renamed from: b */
    public final C11457j f36760b;

    /* JADX INFO: renamed from: d */
    public boolean f36762d;

    /* JADX INFO: renamed from: e */
    public boolean f36763e;

    /* JADX INFO: renamed from: f */
    public boolean f36764f;

    /* JADX INFO: renamed from: g */
    public boolean f36765g;

    /* JADX INFO: renamed from: h */
    public boolean f36766h;

    /* JADX INFO: renamed from: i */
    public boolean f36767i;

    /* JADX INFO: renamed from: j */
    public C29891y f36768j;

    /* JADX INFO: renamed from: k */
    public C23277r0 f36769k;

    /* JADX INFO: renamed from: l */
    public InterfaceC29884r f36770l;

    /* JADX INFO: renamed from: m */
    public C16618c f36771m;

    /* JADX INFO: renamed from: n */
    public C16618c f36772n;

    /* JADX INFO: renamed from: c */
    public final Object f36761c = new Object();

    /* JADX INFO: renamed from: o */
    public final CursorAnchorInfo.Builder f36773o = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: p */
    public final float[] f36774p = C17896l0.m51471a();

    /* JADX INFO: renamed from: q */
    public final Matrix f36775q = new Matrix();

    public C11459l(C11448a c11448a, C11457j c11457j) {
        this.f36759a = c11448a;
        this.f36760b = c11457j;
    }

    /* JADX INFO: renamed from: a */
    public final void m30756a() {
        C11457j c11457j = this.f36760b;
        InputMethodManager inputMethodManagerM30754y = c11457j.m30754y();
        View view = (View) c11457j.f36753x;
        if (!inputMethodManagerM30754y.isActive(view) || this.f36768j == null || this.f36770l == null || this.f36769k == null || this.f36771m == null || this.f36772n == null) {
            return;
        }
        float[] fArr = this.f36774p;
        C17896l0.m51474d(fArr);
        InterfaceC39147y interfaceC39147y = (InterfaceC39147y) this.f36759a.f36725w.f36758R.getValue();
        if (interfaceC39147y != null) {
            if (!interfaceC39147y.mo3532g()) {
                interfaceC39147y = null;
            }
            if (interfaceC39147y != null) {
                interfaceC39147y.mo3515N(fArr);
            }
        }
        C16618c c16618c = this.f36772n;
        AbstractC22676k.m65747g(c16618c);
        float f13 = -c16618c.f63939a;
        C16618c c16618c2 = this.f36772n;
        AbstractC22676k.m65747g(c16618c2);
        C17896l0.m51477g(fArr, f13, -c16618c2.f63940b);
        Matrix matrix = this.f36775q;
        AbstractC17918w0.m51499A(matrix, fArr);
        C29891y c29891y = this.f36768j;
        AbstractC22676k.m65747g(c29891y);
        long j7 = c29891y.f122126b;
        InterfaceC29884r interfaceC29884r = this.f36770l;
        AbstractC22676k.m65747g(interfaceC29884r);
        C23277r0 c23277r0 = this.f36769k;
        AbstractC22676k.m65747g(c23277r0);
        C16618c c16618c3 = this.f36771m;
        AbstractC22676k.m65747g(c16618c3);
        C16618c c16618c4 = this.f36772n;
        AbstractC22676k.m65747g(c16618c4);
        boolean z4 = this.f36764f;
        boolean z13 = this.f36765g;
        boolean z14 = this.f36766h;
        boolean z15 = this.f36767i;
        CursorAnchorInfo.Builder builder = this.f36773o;
        builder.reset();
        builder.setMatrix(matrix);
        C23283u0 c23283u0 = c29891y.f122127c;
        int iM67360f = C23283u0.m67360f(j7);
        builder.setSelectionRange(iM67360f, C23283u0.m67359e(j7));
        if (z4 && iM67360f >= 0) {
            int iMo15749x = interfaceC29884r.mo15749x(iM67360f);
            C16618c c16618cM67334c = c23277r0.m67334c(iMo15749x);
            float fM36283m = AbstractC12889b.m36283m(c16618cM67334c.f63939a, 0.0f, (int) (c23277r0.f92229c >> 32));
            boolean zM9514u = AbstractC3269g.m9514u(c16618c3, fM36283m, c16618cM67334c.f63940b);
            boolean zM9514u2 = AbstractC3269g.m9514u(c16618c3, fM36283m, c16618cM67334c.f63942d);
            boolean z16 = c23277r0.m67332a(iMo15749x) == EnumC36774j.f157348x;
            int i13 = (zM9514u || zM9514u2) ? 1 : 0;
            if (!zM9514u || !zM9514u2) {
                i13 |= 2;
            }
            if (z16) {
                i13 |= 4;
            }
            int i14 = i13;
            float f14 = c16618cM67334c.f63940b;
            float f15 = c16618cM67334c.f63942d;
            builder.setInsertionMarkerLocation(fM36283m, f14, f15, f15, i14);
        }
        if (z13) {
            int iM67360f2 = c23283u0 != null ? C23283u0.m67360f(c23283u0.f92253a) : -1;
            int iM67359e = c23283u0 != null ? C23283u0.m67359e(c23283u0.f92253a) : -1;
            if (iM67360f2 >= 0 && iM67360f2 < iM67359e) {
                builder.setComposingText(iM67360f2, c29891y.f122125a.f92135x.subSequence(iM67360f2, iM67359e));
                int iMo15749x2 = interfaceC29884r.mo15749x(iM67360f2);
                int iMo15749x3 = interfaceC29884r.mo15749x(iM67359e);
                float[] fArr2 = new float[(iMo15749x3 - iMo15749x2) * 4];
                c23277r0.f92228b.m67371a(AbstractC21478l0.m60431f(iMo15749x2, iMo15749x3), fArr2);
                int i15 = iM67360f2;
                while (i15 < iM67359e) {
                    int iMo15749x4 = interfaceC29884r.mo15749x(i15);
                    int i16 = (iMo15749x4 - iMo15749x2) * 4;
                    float f16 = fArr2[i16];
                    int i17 = iM67359e;
                    float f17 = fArr2[i16 + 1];
                    int i18 = iMo15749x2;
                    float f18 = fArr2[i16 + 2];
                    float f19 = fArr2[i16 + 3];
                    int i19 = i15;
                    int i24 = (c16618c3.f63939a < f18 ? 1 : 0) & (f16 < c16618c3.f63941c ? 1 : 0) & (c16618c3.f63940b < f19 ? 1 : 0) & (f17 < c16618c3.f63942d ? 1 : 0);
                    if (!AbstractC3269g.m9514u(c16618c3, f16, f17) || !AbstractC3269g.m9514u(c16618c3, f18, f19)) {
                        i24 |= 2;
                    }
                    if (c23277r0.m67332a(iMo15749x4) == EnumC36774j.f157348x) {
                        i24 |= 4;
                    }
                    builder.addCharacterBounds(i19, f16, f17, f18, f19, i24);
                    i15 = i19 + 1;
                    iM67359e = i17;
                    iMo15749x2 = i18;
                }
            }
        }
        int i25 = Build.VERSION.SDK_INT;
        if (i25 >= 33 && z14) {
            AbstractC3979v.m12019j(builder, c16618c4);
        }
        if (i25 >= 34 && z15) {
            AbstractC2378g1.m7326a(builder, c23277r0, c16618c3);
        }
        c11457j.m30754y().updateCursorAnchorInfo(view, builder.build());
        this.f36763e = false;
    }
}
