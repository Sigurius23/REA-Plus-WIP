package p209i3;

import ad3.C0783z;
import android.view.autofill.AutofillManager;
import androidx.compose.p018ui.platform.AndroidComposeView;
import p002a0.AbstractC0050s;
import p002a0.C0023g0;
import p002a0.C0026h0;
import p002a0.C0047q0;
import p005a3.C0230n0;
import p042c2.C3859d;
import p042c2.C3861f;
import p042c2.C3864i;
import p294l3.C23254g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i3.r */
/* JADX INFO: loaded from: classes.dex */
public final class C18036r {

    /* JADX INFO: renamed from: a */
    public final C0230n0 f69995a;

    /* JADX INFO: renamed from: b */
    public final C18023e f69996b;

    /* JADX INFO: renamed from: c */
    public final AbstractC0050s f69997c;

    /* JADX INFO: renamed from: d */
    public final C0047q0 f69998d = new C0047q0(2);

    public C18036r(C0230n0 c0230n0, C18023e c18023e, C0023g0 c0023g0) {
        this.f69995a = c0230n0;
        this.f69996b = c18023e;
        this.f69997c = c0023g0;
    }

    /* JADX INFO: renamed from: a */
    public final C18034p m51794a() {
        return new C18034p(this.f69996b, false, this.f69995a, new C18030l());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    /* JADX INFO: renamed from: b */
    public final void m51795b(C0230n0 c0230n0, C18030l c18030l) {
        String str;
        C0047q0 c0047q0 = this.f69998d;
        Object[] objArr = c0047q0.f136a;
        int i13 = c0047q0.f137b;
        for (int i14 = 0; i14 < i13; i14++) {
            C3859d c3859d = (C3859d) objArr[i14];
            C0026h0 c0026h0 = c3859d.f15794h;
            AndroidComposeView androidComposeView = c3859d.f15789c;
            C0783z c0783z = c3859d.f15787a;
            C18030l c18030lM591I = c0230n0.m591I();
            int i15 = c0230n0.f795x;
            String str2 = null;
            if (c18030l != null) {
                Object objM129g = c18030l.f69980w.m129g(AbstractC18039u.f70022D);
                if (objM129g == null) {
                    objM129g = null;
                }
                C23254g c23254g = (C23254g) objM129g;
                if (c23254g != null) {
                    str = c23254g.f92135x;
                } else {
                    str = null;
                }
            } else {
                str = null;
            }
            if (c18030lM591I != null) {
                Object objM129g2 = c18030lM591I.f69980w.m129g(AbstractC18039u.f70022D);
                if (objM129g2 == null) {
                    objM129g2 = null;
                }
                C23254g c23254g2 = (C23254g) objM129g2;
                if (c23254g2 != null) {
                    str2 = c23254g2.f92135x;
                }
            }
            if (str != str2) {
                if (str == null) {
                    c0783z.m1871p(androidComposeView, i15, true);
                } else if (str2 == null) {
                    c0783z.m1871p(androidComposeView, i15, false);
                } else if (AbstractC22676k.m65745e((C3861f) AbstractC18037s.m51799d(c18030lM591I, AbstractC18039u.f70051r), C3864i.f15798a)) {
                    ((AutofillManager) c0783z.f2818x).notifyValueChanged(androidComposeView, i15, C3864i.m11845b(str2.toString()));
                }
            }
            boolean z4 = c18030l != null && c18030l.f69980w.m124b(AbstractC18039u.f70050q);
            boolean z13 = c18030lM591I != null && c18030lM591I.f69980w.m124b(AbstractC18039u.f70050q);
            if (z4 != z13) {
                if (z13) {
                    c0026h0.m61a(i15);
                } else {
                    c0026h0.m65e(i15);
                }
            }
        }
    }
}
