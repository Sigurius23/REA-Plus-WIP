package a61;

import a11.C0130h;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c13.AbstractC3855a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.AbstractC16319p0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import k71.C22259p;
import k71.EnumC22244c;
import kd1.AbstractC22403o;
import l83.C23454a0;
import live.hms.video.error.ErrorCodes;
import m83.C25271y;
import p000.AbstractC11266d;
import p004a2.C0155d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;
import x11.C37829c;
import y01.C39023f;
import y01.C39024g;

/* JADX INFO: renamed from: a61.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0002\u001a\u000f\u0010\u0005\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0005\u0010\u0002\u001a\u000f\u0010\u0006\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0006\u0010\u0002\u001a\u000f\u0010\u0007\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0007\u0010\u0002\u001a\u000f\u0010\b\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\b\u0010\u0002\u001a\u000f\u0010\t\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\t\u0010\u0002\u001a?\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015\u001a\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Ll83/a0;", "u", "(Landroidx/compose/runtime/Composer;I)V", "m", "o", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "q", "y", "s", "k", "", "totalProgress", "currentProgress", "", "leftText", "rightText", "Ly81/f;", "color", "rightTextColor", "Lk71/p;", "A", "(IILjava/lang/String;Ljava/lang/String;Ly81/f;Ly81/f;)Lk71/p;", "La61/e;", "E", "()La61/e;", "C", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC0471d {
    /* JADX INFO: renamed from: A */
    public static final C22259p m1146A(int i13, int i14, String leftText, String rightText, EnumC39333f color, EnumC39333f rightTextColor) {
        AbstractC22676k.m65750j(leftText, "leftText");
        AbstractC22676k.m65750j(rightText, "rightText");
        AbstractC22676k.m65750j(color, "color");
        AbstractC22676k.m65750j(rightTextColor, "rightTextColor");
        return new C22259p(AbstractC8693b.m21267a(), AbstractC8693b.m21267a(), new C39023f(i13, i14, color, EnumC39333f.BLACK_20, new C39024g(AbstractC8693b.m21278l(leftText), color), new C39024g(AbstractC8693b.m21278l(rightText), rightTextColor), null, 64, null));
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ C22259p m1147B(int i13, int i14, String str, String str2, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, int i15, Object obj) {
        if ((i15 & 32) != 0) {
            enumC39333f2 = EnumC39333f.WHITE_70;
        }
        return m1146A(i13, i14, str, str2, enumC39333f, enumC39333f2);
    }

    /* JADX INFO: renamed from: C */
    public static final C0472e m1148C() {
        TextResource textResourceM21278l = AbstractC8693b.m21278l("HR ZONES 1-3 TIME");
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("Get 1:20 more hours of Zone 1-3 training during activities this week to hit your goal.");
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l("50&");
        EnumC39333f enumC39333f = EnumC39333f.STRAIN_ZONE_2;
        return new C0472e(new C0155d(5), null, textResourceM21278l, textResourceM21278l3, textResourceM21278l2, null, m1147B(ErrorCodes.WebsocketMethodErrors.cServerErrors, 2500, "1:10", "2:30", enumC39333f, null, 32, null), AbstractC37056f.m118958J(new C0473f(AbstractC8693b.m21278l("1:15"), new AbstractC22403o.c("https://s3-us-west-2.amazonaws.com/icons.whoop.com/mobile/activities/yoga.png", 0, 0, 0, 14, null), AbstractC8693b.m21278l("Yoga"), enumC39333f)), null, null, 802, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m1149D() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E */
    public static final C0472e m1150E() {
        TextResource textResourceM21278l = AbstractC8693b.m21278l("HR ZONES 4-5 TIME");
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("Get 39 more minutes of Zone 4-5 training during activities this week to hit your goal.");
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l("78&");
        EnumC39333f enumC39333f = EnumC39333f.STRAIN_ZONE_4;
        C22259p c22259pM1147B = m1147B(ErrorCodes.WebsocketMethodErrors.cServerErrors, 3500, "2:51", "3:30", enumC39333f, null, 32, null);
        List listM118959K = AbstractC37056f.m118959K(new C0473f(AbstractC8693b.m21278l("1:24"), new AbstractC22403o.a(AbstractC3855a.m11817a()), AbstractC8693b.m21278l("Cycling"), enumC39333f), new C0473f(AbstractC8693b.m21278l("1:03"), new AbstractC22403o.a(AbstractC16319p0.m46430a().getActivities().getWeightlifting()), AbstractC8693b.m21278l("Weightlifting"), enumC39333f), new C0473f(AbstractC8693b.m21278l("0:24"), new AbstractC22403o.a(AbstractC16319p0.m46430a().getActivities().getRunning()), AbstractC8693b.m21278l("Running"), enumC39333f));
        return new C0472e(new C0155d(6), null, textResourceM21278l, textResourceM21278l3, textResourceM21278l2, EnumC22244c.DISABLED, c22259pM1147B, listM118959K, null, null, 770, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m1151F() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    public static final void m1162k(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(990508932);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            AbstractC0470c.m1137h(null, C0472e.m1178b(m1150E(), null, null, null, AbstractC8693b.m21278l("0%"), AbstractC8693b.m21278l("Log or add an activity today to start working towards your HR zones 4-5 goal."), null, m1147B(ErrorCodes.WebsocketMethodErrors.cServerErrors, 50, "0:00", "3:30", EnumC39333f.STRAIN_ZONE_4, null, 32, null), C25271y.f99162w, new C37829c(null, AbstractC8693b.m21267a(), AbstractC8693b.m21278l("add activity"), 1, null), null, 551, null), null, c28655q, 0, 5);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0130h(i13, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m1163l(int i13, Composer composer, int i14) {
        m1162k(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    public static final void m1164m(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-958060455);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * 8), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            m1166o(c28655q, 0);
            m1168q(c28655q, 0);
            m1162k(c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0130h(i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m1165n(int i13, Composer composer, int i14) {
        m1164m(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    public static final void m1166o(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1590079358);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            AbstractC0470c.m1137h(null, m1150E(), null, c28655q, 0, 5);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0130h(i13, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m1167p(int i13, Composer composer, int i14) {
        m1166o(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    public static final void m1168q(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-720048913);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            AbstractC0470c.m1137h(null, C0472e.m1178b(m1150E(), null, null, null, AbstractC8693b.m21278l("124%"), AbstractC8693b.m21278l("You’ve hit your time in HR zones 4-5 goal for the week. Nice job!"), EnumC22244c.ENABLED, m1147B(ErrorCodes.WebsocketMethodErrors.cServerErrors, ErrorCodes.WebsocketMethodErrors.cServerErrors, "2:51", "1:25", EnumC39333f.STRAIN_ZONE_4, null, 32, null), null, null, null, 903, null), null, c28655q, 0, 5);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0130h(i13, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m1169r(int i13, Composer composer, int i14) {
        m1168q(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    public static final void m1170s(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1014624954);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            AbstractC0470c.m1137h(null, C0472e.m1178b(m1148C(), null, null, null, AbstractC8693b.m21278l("0%"), AbstractC8693b.m21278l("Log an activity today to start working towards your HR zones 1-3 goal."), null, m1147B(ErrorCodes.WebsocketMethodErrors.cServerErrors, 50, "0:00", "2:30", EnumC39333f.STRAIN_ZONE_2, null, 32, null), C25271y.f99162w, new C37829c(null, AbstractC8693b.m21267a(), AbstractC8693b.m21278l("add activity"), 1, null), null, 551, null), null, c28655q, 0, 5);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0130h(i13, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m1171t(int i13, Composer composer, int i14) {
        m1170s(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    public static final void m1172u(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-210463773);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * 8), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            m1174w(c28655q, 0);
            m1176y(c28655q, 0);
            m1170s(c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0130h(i13, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m1173v(int i13, Composer composer, int i14) {
        m1172u(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    public static final void m1174w(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1443992076);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            AbstractC0470c.m1137h(null, m1148C(), null, c28655q, 0, 5);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0130h(i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m1175x(int i13, Composer composer, int i14) {
        m1174w(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    public static final void m1176y(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1754056357);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            AbstractC0470c.m1137h(null, C0472e.m1178b(m1148C(), null, null, null, AbstractC8693b.m21278l("100%"), AbstractC8693b.m21278l("You’ve hit your time in HR zones 1-3 goal for the week. Nice job!"), EnumC22244c.ENABLED, m1147B(ErrorCodes.WebsocketMethodErrors.cServerErrors, ErrorCodes.WebsocketMethodErrors.cServerErrors, "2:40", "2:35", EnumC39333f.STRAIN_ZONE_2, null, 32, null), null, null, null, 903, null), null, c28655q, 0, 5);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0130h(i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m1177z(int i13, Composer composer, int i14) {
        m1176y(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
