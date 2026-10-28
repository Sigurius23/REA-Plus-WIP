package p281kj;

import androidx.room.C1778e;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import com.amplitude.android.engagement.C4861a;
import com.google.crypto.tink.internal.C5101l0;
import hc3.AbstractC17182o;
import java.util.LinkedHashMap;
import kc3.C22365e;
import p005a3.C0227m1;
import p007a6.C0448q;
import p173gj.C15903d;
import p197hj.C17319b;
import p197hj.C17332o;
import p197hj.EnumC17339v;
import p255jk.C21743a;
import p282kk.EnumC22535d;
import p282kk.InterfaceC22536e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: kj.b */
/* JADX INFO: loaded from: classes.dex */
public final class C22507b implements InterfaceC22536e {

    /* JADX INFO: renamed from: E */
    public String f88206E;

    /* JADX INFO: renamed from: F */
    public String f88207F;

    /* JADX INFO: renamed from: G */
    public Long f88208G;

    /* JADX INFO: renamed from: H */
    public C17319b f88209H;

    /* JADX INFO: renamed from: w */
    public final C4861a f88211w;

    /* JADX INFO: renamed from: x */
    public C15903d f88212x;

    /* JADX INFO: renamed from: z */
    public boolean f88214z;

    /* JADX INFO: renamed from: y */
    public final C5101l0 f88213y = new C5101l0("AmplitudeEngagementPlugin");

    /* JADX INFO: renamed from: I */
    public final EnumC22535d f88210I = EnumC22535d.f88574x;

    public C22507b(C4861a c4861a) {
        this.f88211w = c4861a;
    }

    @Override // p282kk.InterfaceC22536e
    /* JADX INFO: renamed from: a */
    public final C21743a mo15042a(C21743a c21743a) {
        LinkedHashMap linkedHashMap;
        Object obj;
        m65009c(c21743a.f83629a, c21743a.f83630b);
        Long l7 = c21743a.f83633e;
        InterfaceC30057d interfaceC30057d = null;
        if (l7 != null) {
            Long l12 = this.f88208G;
            this.f88208G = l7;
            if (l12 != null && !l12.equals(l7)) {
                C22365e c22365e = AbstractC3050q0.f12077a;
                AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(AbstractC17182o.f65999a), null, null, new C1778e(this, c21743a, interfaceC30057d, 21), 3);
            }
        }
        if (AbstractC22676k.m65745e(c21743a.mo61353a(), "[Amplitude] Screen Viewed") && (linkedHashMap = c21743a.f83625N) != null && (obj = linkedHashMap.get("[Amplitude] Screen Name")) != null && (obj instanceof String)) {
            C22365e c22365e2 = AbstractC3050q0.f12077a;
            AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(AbstractC17182o.f65999a), null, null, new C1778e(this, obj, interfaceC30057d, 22), 3);
        }
        C22365e c22365e3 = AbstractC3050q0.f12077a;
        AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(AbstractC17182o.f65999a), null, null, new C0448q(this, c21743a, null, 7), 3);
        this.f88213y.m16030H(new C17332o(1, c21743a));
        return c21743a;
    }

    @Override // p282kk.InterfaceC22536e
    /* JADX INFO: renamed from: b */
    public final void mo15043b(C15903d c15903d) {
        this.f88212x = c15903d;
        String str = c15903d.f60139l != null ? c15903d.m44882c().f125070a.m13958y().f125060a : null;
        if (str == null || AbstractC39414r.m125890i0(str)) {
            str = null;
        }
        String str2 = c15903d.f60139l != null ? c15903d.m44882c().f125070a.m13958y().f125061b : null;
        EnumC17339v logLevel = this.f88211w.f20261b.getOptions().getLogLevel();
        C5101l0 c5101l0 = this.f88213y;
        c5101l0.getClass();
        AbstractC22676k.m65750j(logLevel, "logLevel");
        c5101l0.f21444y = logLevel;
        c5101l0.m16030H(new C22506a(str, str2, 1));
        m65009c(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public final void m65009c(String str, String str2) {
        this.f88213y.m16030H(new C22506a(str, str2, 0));
        String str3 = this.f88206E;
        String str4 = this.f88207F;
        this.f88206E = str;
        this.f88207F = str2;
        boolean z4 = this.f88214z;
        C4861a c4861a = this.f88211w;
        if (z4) {
            if (AbstractC22676k.m65745e(str, str3) && AbstractC22676k.m65745e(str2, str4)) {
                return;
            } else {
                c4861a.m15522h();
            }
        }
        if (str == null || AbstractC39414r.m125890i0(str)) {
            return;
        }
        this.f88214z = true;
        C17319b c17319b = new C17319b(str, str2, new Function1[]{new C0227m1(this, 22)}, null, 8);
        c4861a.m15515a(c17319b);
        this.f88209H = c17319b;
    }

    @Override // p282kk.InterfaceC22536e
    public final EnumC22535d getType() {
        return this.f88210I;
    }
}
