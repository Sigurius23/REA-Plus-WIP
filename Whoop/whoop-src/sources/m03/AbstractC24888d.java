package m03;

import android.content.Context;
import androidx.compose.runtime.Composer;
import d03.AbstractC11447b;
import i20.C17956k0;
import l83.C23454a0;
import p008a7.C0515f;
import p208i2.C17919x;
import p335n6.AbstractC26391h;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p463rj.AbstractC31484o;
import p470rv.AbstractC31834n;
import p545v6.InterfaceC35718g;
import p602x1.AbstractC37817c;
import p636y3.C39183o;
import p672z6.C40119b;
import p672z6.C40123f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import v63.AbstractC35745c;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: m03.d */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"", "ageValue", "subtitle", "Li2/x;", "subtitleColor", "Ll83/a0;", "c", "(Ljava/lang/String;Ljava/lang/String;JLandroidx/compose/runtime/Composer;I)V", "widget_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24888d {
    /* JADX INFO: renamed from: c */
    public static final void m72984c(String ageValue, String str, long j7, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(ageValue, "ageValue");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2098493091);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(ageValue) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87151f(j7) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            AbstractC31834n.m98892a(null, 0, 1, AbstractC37817c.m121344e(-1867077395, c28655q, new C24887c(ageValue, str, j7)), c28655q, 3072, 3);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17956k0(i13, ageValue, j7, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m72985d(String str, String str2, long j7, InterfaceC35718g Column, Composer composer, int i13) {
        AbstractC22676k.m65750j(Column, "$this$Column");
        long j13 = C17919x.f69629f;
        AbstractC31484o.m96953e(str, null, new C40123f(new C0515f(j13), new C39183o(AbstractC35745c.m113246h(28)), new C40119b(700), null, 120), 0, composer, 0, 10);
        C28655q c28655q = (C28655q) composer;
        String string = ((Context) c28655q.m87161k(AbstractC26391h.f104841b)).getString(AbstractC11447b.f36724g);
        AbstractC22676k.m65749i(string, "getString(...)");
        AbstractC31484o.m96953e(string, null, new C40123f(new C0515f(j13), new C39183o(AbstractC35745c.m113246h(10)), new C40119b(700), null, 120), 0, c28655q, 0, 10);
        if (str2 == null || AbstractC39414r.m125890i0(str2)) {
            c28655q.m87150e0(2019599413);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(2019334177);
            AbstractC31484o.m96953e(str2, null, new C40123f(new C0515f(j7), new C39183o(AbstractC35745c.m113246h(12)), new C40119b(500), null, 120), 0, c28655q, 0, 10);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m72986e(String str, String str2, long j7, int i13, Composer composer, int i14) {
        m72984c(str, str2, j7, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
