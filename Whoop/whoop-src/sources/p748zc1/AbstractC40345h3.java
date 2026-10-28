package p748zc1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c13.AbstractC3855a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.service.network.model.UserSessionDto;
import dp0.C12253i;
import fy1.C14873i;
import java.util.ArrayList;
import kd1.AbstractC22399k;
import l83.C23454a0;
import m83.C25235a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p208i2.C17919x;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p745y81.C39336i;
import p745y81.Function1;
import p745y81.InterfaceC39332e;
import qy0.AbstractC30773f;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;

/* JADX INFO: renamed from: zc1.h3 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", "b", "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40345h3 {

    /* JADX INFO: renamed from: zc1.h3$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m129869a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(-1370721168);
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            C23010x c23010xM73381n = AbstractC25012a.m73381n(1, 4, C2299e.f9111N, c28655q, 54);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM73381n);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC22399k.m64473c("Default", c28655q, 6);
            TextResource textResourceM21278l = AbstractC8693b.m21278l(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = b.f174274w;
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC39332e interfaceC39332eM125323a = Function1.m125323a((p715kotlin.jvm.functions.Function1) objM87133R);
            int i14 = TextResource.$stable << 3;
            AbstractC30773f.m94548v(null, textResourceM21278l, interfaceC39332eM125323a, null, null, null, null, null, null, null, false, null, null, null, 0.0f, false, 0.0f, false, false, null, c28655q, i14, 0, 1048569);
            AbstractC22399k.m64473c("With Legend", c28655q, 6);
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l("2");
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = k.f174283w;
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC39332e interfaceC39332eM125323a2 = Function1.m125323a((p715kotlin.jvm.functions.Function1) objM87133R2);
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = l.f174284w;
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC39332e interfaceC39332eM125323a3 = Function1.m125323a((p715kotlin.jvm.functions.Function1) objM87133R3);
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = m.f174285w;
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC30773f.m94548v(null, textResourceM21278l2, interfaceC39332eM125323a2, null, null, null, null, interfaceC39332eM125323a3, null, null, false, null, Function1.m125323a((p715kotlin.jvm.functions.Function1) objM87133R4), null, 0.0f, false, 0.0f, false, false, null, c28655q, i14, 0, 1044345);
            AbstractC22399k.m64473c("With Legend & Marker", c28655q, 6);
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l("3");
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = n.f174286w;
                c28655q.m87172p0(objM87133R5);
            }
            InterfaceC39332e interfaceC39332eM125323a4 = Function1.m125323a((p715kotlin.jvm.functions.Function1) objM87133R5);
            Object objM87133R6 = c28655q.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = o.f174287w;
                c28655q.m87172p0(objM87133R6);
            }
            InterfaceC39332e interfaceC39332eM125323a5 = Function1.m125323a((p715kotlin.jvm.functions.Function1) objM87133R6);
            Object objM87133R7 = c28655q.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = p.f174288w;
                c28655q.m87172p0(objM87133R7);
            }
            AbstractC30773f.m94548v(null, textResourceM21278l3, interfaceC39332eM125323a4, null, null, null, null, interfaceC39332eM125323a5, null, null, false, null, null, Function1.m125323a((p715kotlin.jvm.functions.Function1) objM87133R7), 0.0f, false, 0.0f, false, false, null, c28655q, i14, 0, 1040249);
            AbstractC22399k.m64473c("Low Recovery Color", c28655q, 6);
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l("4");
            Object objM87133R8 = c28655q.m87133R();
            if (objM87133R8 == c28676v0) {
                objM87133R8 = q.f174289w;
                c28655q.m87172p0(objM87133R8);
            }
            AbstractC30773f.m94548v(null, textResourceM21278l4, Function1.m125323a((p715kotlin.jvm.functions.Function1) objM87133R8), null, null, null, null, null, null, null, false, null, null, null, 0.0f, false, 0.0f, false, false, null, c28655q, i14, 0, 1048569);
            AbstractC22399k.m64473c("Low Recovery Legend", c28655q, 6);
            TextResource textResourceM21278l5 = AbstractC8693b.m21278l("5");
            Object objM87133R9 = c28655q.m87133R();
            if (objM87133R9 == c28676v0) {
                objM87133R9 = r.f174290w;
                c28655q.m87172p0(objM87133R9);
            }
            InterfaceC39332e interfaceC39332eM125323a6 = Function1.m125323a((p715kotlin.jvm.functions.Function1) objM87133R9);
            Object objM87133R10 = c28655q.m87133R();
            if (objM87133R10 == c28676v0) {
                objM87133R10 = c.f174275w;
                c28655q.m87172p0(objM87133R10);
            }
            AbstractC30773f.m94548v(null, textResourceM21278l5, interfaceC39332eM125323a6, null, null, null, null, Function1.m125323a((p715kotlin.jvm.functions.Function1) objM87133R10), null, null, false, null, null, null, 0.0f, false, 0.0f, false, false, null, c28655q, i14, 0, 1048441);
            AbstractC22399k.m64473c("White Border", c28655q, 6);
            TextResource textResourceM21278l6 = AbstractC8693b.m21278l("6");
            Object objM87133R11 = c28655q.m87133R();
            if (objM87133R11 == c28676v0) {
                objM87133R11 = d.f174276w;
                c28655q.m87172p0(objM87133R11);
            }
            InterfaceC39332e interfaceC39332eM125323a7 = Function1.m125323a((p715kotlin.jvm.functions.Function1) objM87133R11);
            Object objM87133R12 = c28655q.m87133R();
            if (objM87133R12 == c28676v0) {
                objM87133R12 = e.f174277w;
                c28655q.m87172p0(objM87133R12);
            }
            InterfaceC39332e interfaceC39332eM125323a8 = Function1.m125323a((p715kotlin.jvm.functions.Function1) objM87133R12);
            Object objM87133R13 = c28655q.m87133R();
            if (objM87133R13 == c28676v0) {
                objM87133R13 = f.f174278w;
                c28655q.m87172p0(objM87133R13);
            }
            AbstractC30773f.m94548v(null, textResourceM21278l6, interfaceC39332eM125323a7, null, null, null, null, null, null, null, false, null, Function1.m125323a((p715kotlin.jvm.functions.Function1) objM87133R13), interfaceC39332eM125323a8, 0.0f, false, 0.0f, false, false, null, c28655q, i14, 0, 1036281);
            AbstractC22399k.m64473c("Mix & Match", c28655q, 6);
            TextResource textResourceM21278l7 = AbstractC8693b.m21278l("7");
            Object objM87133R14 = c28655q.m87133R();
            if (objM87133R14 == c28676v0) {
                objM87133R14 = g.f174279w;
                c28655q.m87172p0(objM87133R14);
            }
            InterfaceC39332e interfaceC39332eM125323a9 = Function1.m125323a((p715kotlin.jvm.functions.Function1) objM87133R14);
            Object objM87133R15 = c28655q.m87133R();
            if (objM87133R15 == c28676v0) {
                objM87133R15 = h.f174280w;
                c28655q.m87172p0(objM87133R15);
            }
            InterfaceC39332e interfaceC39332eM125323a10 = Function1.m125323a((p715kotlin.jvm.functions.Function1) objM87133R15);
            Object objM87133R16 = c28655q.m87133R();
            if (objM87133R16 == c28676v0) {
                objM87133R16 = i.f174281w;
                c28655q.m87172p0(objM87133R16);
            }
            InterfaceC39332e interfaceC39332eM125323a11 = Function1.m125323a((p715kotlin.jvm.functions.Function1) objM87133R16);
            Object objM87133R17 = c28655q.m87133R();
            if (objM87133R17 == c28676v0) {
                objM87133R17 = j.f174282w;
                c28655q.m87172p0(objM87133R17);
            }
            AbstractC30773f.m94548v(null, textResourceM21278l7, interfaceC39332eM125323a9, null, interfaceC39332eM125323a10, null, null, null, null, null, false, null, interfaceC39332eM125323a11, Function1.m125323a((p715kotlin.jvm.functions.Function1) objM87133R17), 0.0f, false, 0.0f, false, true, null, c28655q, i14, 100663296, 774121);
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m129869a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: zc1.h3$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f174274w = new b();

        /* JADX INFO: renamed from: a */
        public final long m129870a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129870a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zc1.h3$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f174275w = new c();

        /* JADX INFO: renamed from: a */
        public final long m129871a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryLowRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129871a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zc1.h3$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f174276w = new d();

        /* JADX INFO: renamed from: a */
        public final long m129872a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryMediumRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129872a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zc1.h3$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f174277w = new e();

        /* JADX INFO: renamed from: a */
        public final long m129873a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129873a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zc1.h3$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f174278w = new f();

        /* JADX INFO: renamed from: a */
        public final long m129874a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129874a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zc1.h3$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f174279w = new g();

        /* JADX INFO: renamed from: a */
        public final long m129875a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryHighRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129875a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zc1.h3$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f174280w = new h();

        /* JADX INFO: renamed from: a */
        public final long m129876a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(0.7f, whoopColor.getSleepLightSleep());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129876a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zc1.h3$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f174281w = new i();

        /* JADX INFO: renamed from: a */
        public final long m129877a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrainZone5();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129877a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zc1.h3$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final j f174282w = new j();

        /* JADX INFO: renamed from: a */
        public final long m129878a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrainZone2();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129878a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zc1.h3$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final k f174283w = new k();

        /* JADX INFO: renamed from: a */
        public final long m129879a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129879a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zc1.h3$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final l f174284w = new l();

        /* JADX INFO: renamed from: a */
        public final long m129880a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129880a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zc1.h3$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final m f174285w = new m();

        /* JADX INFO: renamed from: a */
        public final long m129881a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129881a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zc1.h3$n */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final n f174286w = new n();

        /* JADX INFO: renamed from: a */
        public final long m129882a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129882a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zc1.h3$o */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final o f174287w = new o();

        /* JADX INFO: renamed from: a */
        public final long m129883a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129883a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zc1.h3$p */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final p f174288w = new p();

        /* JADX INFO: renamed from: a */
        public final long m129884a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandBlack();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129884a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zc1.h3$q */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final q f174289w = new q();

        /* JADX INFO: renamed from: a */
        public final long m129885a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryLowRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129885a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: zc1.h3$r */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final r f174290w = new r();

        /* JADX INFO: renamed from: a */
        public final long m129886a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryLowRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m129886a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m129867b(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1269000096);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new a()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40388l2(i13, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m129868c(int i13, Composer composer, int i14) {
        m129867b(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
