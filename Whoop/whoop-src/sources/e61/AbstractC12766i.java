package e61;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import aq1.C1910d;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.service.network.model.UserSessionDto;
import d61.InterfaceC11732a;
import dx2.C12430a;
import g61.C15529b;
import g61.EnumC15530c;
import g61.EnumC15533f;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j61.C21369c;
import j61.C21372f;
import j61.C21373g;
import j61.C21374h;
import j61.EnumC21367a;
import j61.EnumC21368b;
import j61.EnumC21371e;
import j61.EnumC21375i;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.C25271y;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p181h2.C16618c;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p699b70.C2775a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import p91.C29007a;
import wb3.AbstractC37056f;
import yy0.C39889c;

/* JADX INFO: renamed from: e61.i */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0004\u001a=\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u000f\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00102\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u001d\u001a\u000f\u0010\u001f\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "i", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "e", "", "description", "", "includeColoredLine", "includeAverage", "includeAnnotations", "includeLabel", "Lj61/h;", "r", "(Ljava/lang/String;ZZZZ)Lj61/h;", "", "Lj61/c;", "q", "(ZZZ)Ljava/util/List;", "Lg61/b;", "t", "()Lg61/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "p", "Lj61/f;", "u", "(Z)Ljava/util/List;", "v", "()Ljava/util/List;", "n", "o", "()Lj61/c;", "Lj61/g;", "m", "(Ljava/lang/String;)Lj61/g;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12766i {

    /* JADX INFO: renamed from: e61.i$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f43674w = new a();

        /* JADX INFO: renamed from: a */
        public final long m35768a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m35768a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: e61.i$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f43675w = new b();

        /* JADX INFO: renamed from: a */
        public final long m35769a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentAction();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m35769a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: e61.i$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f43676w = new c();

        /* JADX INFO: renamed from: a */
        public final long m35770a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m35770a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: e61.i$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f43677w = new d();

        /* JADX INFO: renamed from: a */
        public final long m35771a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m35771a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: e61.i$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f43678w = new e();

        /* JADX INFO: renamed from: a */
        public final long m35772a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m35772a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: e61.i$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f43679w = new f();

        /* JADX INFO: renamed from: a */
        public final long m35773a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite20();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m35773a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: e61.i$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f43680w = new g();

        /* JADX INFO: renamed from: a */
        public final long m35774a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryLowRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m35774a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: e61.i$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f43681w = new h();

        /* JADX INFO: renamed from: a */
        public final long m35775a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryLowRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m35775a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: e61.i$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f43682w = new i();

        /* JADX INFO: renamed from: a */
        public final long m35776a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryMediumRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m35776a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: e61.i$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final j f43683w = new j();

        /* JADX INFO: renamed from: a */
        public final long m35777a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryHighRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m35777a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: e61.i$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final k f43684w = new k();

        /* JADX INFO: renamed from: a */
        public final long m35778a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecoveryHighRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m35778a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: e61.i$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final l f43685w = new l();

        /* JADX INFO: renamed from: a */
        public final long m35779a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m35779a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: e61.i$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final m f43686w = new m();

        /* JADX INFO: renamed from: a */
        public final long m35780a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrainZone4();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m35780a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: e61.i$n */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final n f43687w = new n();

        /* JADX INFO: renamed from: a */
        public final long m35781a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m35781a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: e61.i$o */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final o f43688w = new o();

        /* JADX INFO: renamed from: a */
        public final long m35782a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrainZone4();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m35782a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: e61.i$p */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final p f43689w = new p();

        /* JADX INFO: renamed from: a */
        public final long m35783a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m35783a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: e61.i$q */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final q f43690w = new q();

        /* JADX INFO: renamed from: a */
        public final long m35784a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrain();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m35784a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m35749e(Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1511117702);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier = c2314t;
            }
            C12767j c12767j = new C12767j();
            Modifier modifierMo3471e = AbstractC1102d.m3407d(1.0f, c2314t).mo3471e(modifier);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(10 * 4), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
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
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = a.f43674w;
                c28655q.m87172p0(objM87133R);
            }
            c12767j.m35787b(m35751g(p745y81.Function1.m125323a((Function1) objM87133R), "AVG", null, 4, null), c28655q, 0);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = b.f43675w;
                c28655q.m87172p0(objM87133R2);
            }
            c12767j.m35787b(m35751g(p745y81.Function1.m125323a((Function1) objM87133R2), "AVG", null, 4, null), c28655q, 0);
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = c.f43676w;
                c28655q.m87172p0(objM87133R3);
            }
            c12767j.m35787b(m35751g(p745y81.Function1.m125323a((Function1) objM87133R3), "AVG", null, 4, null), c28655q, 0);
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = d.f43677w;
                c28655q.m87172p0(objM87133R4);
            }
            c12767j.m35787b(m35750f(p745y81.Function1.m125323a((Function1) objM87133R4), "", "AVG"), c28655q, 0);
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = e.f43678w;
                c28655q.m87172p0(objM87133R5);
            }
            c12767j.m35787b(m35750f(p745y81.Function1.m125323a((Function1) objM87133R5), "AVG", "AVG"), c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2775a(i13, i14, 5, modifier);
        }
    }

    /* JADX INFO: renamed from: f */
    private static final C21369c m35750f(InterfaceC39332e interfaceC39332e, String str, String str2) {
        return new C21369c(0.0f, 0.6f, 1.0f, 0.2f, interfaceC39332e, EnumC21367a.Y_AXIS, EnumC21371e.AVERAGE_MARKER, AbstractC8693b.m21278l(str), AbstractC8693b.m21278l(str2), null, null, false, 0.0f, 7680, null);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C21369c m35751g(InterfaceC39332e interfaceC39332e, String str, String str2, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str2 = "";
        }
        return m35750f(interfaceC39332e, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m35752h(Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m35749e(modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    public static final void m35753i(Modifier modifier, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1816041680);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            modifier3 = i16 != 0 ? C2314t.f9131w : modifier2;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(InterfaceC11732a.b.f37977a);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            C21374h c21374hM35763s = m35763s("Plane Graph", true, true, false, false, 24, null);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C12430a(19);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
            InterfaceC11732a interfaceC11732a = (InterfaceC11732a) interfaceC28601c1.getValue();
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C1910d(23, interfaceC28601c1);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC12765h.m35733o(modifier3, c21374hM35763s, null, null, null, null, interfaceC4339a, interfaceC11732a, (Function1) objM87133R3, null, null, null, C12759b.f43640a.m35708b(), c28655q, (i15 & 14) | 102236160, 384, 3644);
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2775a(i13, i14, 4, modifier3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m35754j() {
        System.out.println((Object) "Clicked!!");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m35755k(InterfaceC28601c1 interfaceC28601c1, InterfaceC11732a it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC28601c1.setValue(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m35756l(Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m35753i(modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    private static final C21373g m35757m(String str) {
        return new C21373g(AbstractC8693b.m21278l(str), null, null, null, 14, null);
    }

    /* JADX INFO: renamed from: n */
    private static final List<C21369c> m35758n() {
        EnumC21367a enumC21367a = EnumC21367a.X_AND_Y_AXES;
        EnumC21371e enumC21371e = EnumC21371e.VERTICAL_AXIS;
        return AbstractC37056f.m118959K(new C21369c(0.4f, 0.0f, 0.0f, 0.0f, null, enumC21367a, enumC21371e, AbstractC8693b.m21278l("65"), null, AbstractC8693b.m21278l("bpm"), EnumC21368b.NUMERIC, false, 0.0f, 6430, null), new C21369c(0.85f, 0.0f, 0.0f, 0.7f, p745y81.Function1.m125323a(f.f43679w), enumC21367a, enumC21371e, AbstractC8693b.m21278l("Mar. 6, 2024"), null, AbstractC8693b.m21278l("(Due Date)"), EnumC21368b.TEXTUAL, false, 0.0f, 6406, null));
    }

    /* JADX INFO: renamed from: o */
    private static final C21369c m35759o() {
        return new C21369c(0.0f, 0.6f, 1.0f, 0.2f, null, EnumC21367a.Y_AXIS, EnumC21371e.AVERAGE_MARKER, null, null, null, null, false, 0.0f, 8080, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    private static final C15529b m35760p() {
        TextResource textResource = null;
        float f13 = 0.0f;
        float f14 = 0.0f;
        EnumC16313m0 enumC16313m0 = null;
        int i13 = 34;
        DefaultConstructorMarker defaultConstructorMarker = null;
        TextResource textResource2 = null;
        EnumC16313m0 enumC16313m1 = null;
        InterfaceC39332e interfaceC39332e = null;
        return new C15529b(0.0f, AbstractC37056f.m118959K(new C39889c(AbstractC8693b.m21278l("0%"), textResource, p745y81.Function1.m125323a(g.f43680w), f13, f14, enumC16313m0, 34, null), new C39889c(AbstractC8693b.m21278l("25%"), textResource2, p745y81.Function1.m125323a(h.f43681w), f13, 0.25f, enumC16313m1, i13, defaultConstructorMarker), new C39889c(AbstractC8693b.m21278l("50%"), textResource2, p745y81.Function1.m125323a(i.f43682w), f13, 0.5f, enumC16313m1, i13, defaultConstructorMarker), new C39889c(AbstractC8693b.m21278l("75%"), textResource2, p745y81.Function1.m125323a(j.f43683w), f13, 0.75f, enumC16313m1, i13, defaultConstructorMarker), new C39889c(AbstractC8693b.m21278l("100%"), textResource2, p745y81.Function1.m125323a(k.f43684w), f13, 1.0f, enumC16313m1, i13, defaultConstructorMarker)), 0.0f, null, null, false, 0 == true ? 1 : 0, interfaceC39332e, 253, null);
    }

    /* JADX INFO: renamed from: q */
    public static final List<C21369c> m35761q(boolean z4, boolean z13, boolean z14) {
        List listM118958J = C25271y.f99162w;
        if (!z4) {
            return listM118958J;
        }
        if (z14) {
            return m35758n();
        }
        List<C21369c> listM35766v = m35766v();
        if (z13) {
            listM118958J = AbstractC37056f.m118958J(m35759o());
        }
        return AbstractC25265s.m74129g1(listM35766v, listM118958J);
    }

    /* JADX INFO: renamed from: r */
    public static final C21374h m35762r(String description, boolean z4, boolean z13, boolean z14, boolean z15) {
        AbstractC22676k.m65750j(description, "description");
        return new C21374h(m35767w(), m35760p(), m35764t(), null, new C16618c(0.0f, 0.04f, 0.0f, 0.04f), m35765u(z4), m35761q(z14, z13, z15), m35757m(description), false, false, null, 0L, 0.0f, 7944, null);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ C21374h m35763s(String str, boolean z4, boolean z13, boolean z14, boolean z15, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z13 = false;
        }
        if ((i13 & 8) != 0) {
            z14 = false;
        }
        if ((i13 & 16) != 0) {
            z15 = false;
        }
        return m35762r(str, z4, z13, z14, z15);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    private static final C15529b m35764t() {
        return new C15529b(0.15f, AbstractC37056f.m118959K(new C39889c(AbstractC8693b.m21278l("Sun"), AbstractC8693b.m21278l(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE), null, 0.125f, 0.0f, null, 52, null), new C39889c(AbstractC8693b.m21278l("Mon"), AbstractC8693b.m21278l("2"), null, 0.25f, 0.0f, null, 52, null), new C39889c(AbstractC8693b.m21278l("Tue"), AbstractC8693b.m21278l("3"), null, 0.375f, 0.0f, null, 52, null), new C39889c(AbstractC8693b.m21278l("Wed"), AbstractC8693b.m21278l("4"), null, 0.5f, 0.0f, null, 52, null), new C39889c(AbstractC8693b.m21278l("Thu"), AbstractC8693b.m21278l("5"), null, 0.625f, 0.0f, null, 52, null), new C39889c(AbstractC8693b.m21278l("Fri"), AbstractC8693b.m21278l("6"), null, 0.75f, 0.0f, null, 52, null), new C39889c(AbstractC8693b.m21278l("Sat"), AbstractC8693b.m21278l("7"), p745y81.Function1.m125323a(l.f43685w), 0.875f, 0.0f, 0 == true ? 1 : 0, 48, null)), 0.0f, null, null, false, null, null, 252, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public static final List<C21372f> m35765u(boolean z4) {
        C21372f c21372f = new C21372f(1.0f, null, null, null, null, null, null, 126, null);
        C21372f c21372f2 = new C21372f(0.75f, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 126, null);
        C21372f c21372f3 = new C21372f(0.5f, p745y81.Function1.m125323a(z4 ? m.f43686w : n.f43687w), null, null, null, null, null, 124, null);
        C21372f c21372f4 = new C21372f(0.25f, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 126, null);
        C21372f c21372f5 = new C21372f(0.0f, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 126, null);
        EnumC15533f enumC15533f = EnumC15533f.Y_AXIS;
        DefaultConstructorMarker defaultConstructorMarker = null;
        C29007a c29007a = null;
        String str = null;
        EnumC21375i enumC21375i = null;
        InterfaceC39332e interfaceC39332e = null;
        return AbstractC37056f.m118959K(c21372f, c21372f2, c21372f3, c21372f4, c21372f5, new C21372f(0.75f, 0 == true ? 1 : 0, enumC15533f, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 122, null), new C21372f(0.5f, p745y81.Function1.m125323a(z4 ? o.f43688w : p.f43689w), enumC15533f, c29007a, str, enumC21375i, interfaceC39332e, 120, defaultConstructorMarker), new C21372f(0.25f, null, enumC15533f, c29007a, str, enumC21375i, interfaceC39332e, 122, defaultConstructorMarker));
    }

    /* JADX INFO: renamed from: v */
    private static final List<C21369c> m35766v() {
        EnumC21367a enumC21367a = EnumC21367a.X_AXIS;
        EnumC21371e enumC21371e = EnumC21371e.REGION_HIGHLIGHT;
        return AbstractC37056f.m118959K(new C21369c(0.875f, 0.0f, 0.14285715f, 1.0f, null, enumC21367a, enumC21371e, null, null, null, null, false, 0.0f, 8080, null), new C21369c(0.5f, 0.25f, 1.0f, 0.25f, null, EnumC21367a.Y_AXIS, enumC21371e, null, null, null, null, false, 0.0f, 8080, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    private static final C15529b m35767w() {
        InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a(q.f43690w);
        int i13 = 34;
        TextResource textResource = null;
        float f13 = 1.0f;
        float f14 = 0.0f;
        EnumC16313m0 enumC16313m0 = null;
        TextResource textResource2 = null;
        boolean z4 = false;
        EnumC15530c enumC15530c = null;
        InterfaceC39332e interfaceC39332e = null;
        return new C15529b(0.0f, AbstractC37056f.m118959K(new C39889c(AbstractC8693b.m21278l(UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE), textResource, interfaceC39332eM125323a, f13, f14, enumC16313m0, i13, null), new C39889c(AbstractC8693b.m21278l("5"), textResource, interfaceC39332eM125323a, f13, 0.25f, enumC16313m0, i13, 0 == true ? 1 : 0), new C39889c(AbstractC8693b.m21278l("10"), textResource, interfaceC39332eM125323a, f13, 0.5f, enumC16313m0, i13, 0 == true ? 1 : 0), new C39889c(AbstractC8693b.m21278l("15"), textResource, interfaceC39332eM125323a, f13, 0.75f, enumC16313m0, i13, 0 == true ? 1 : 0), new C39889c(AbstractC8693b.m21278l("21"), textResource, interfaceC39332eM125323a, f13, 1.0f, enumC16313m0, i13, 0 == true ? 1 : 0)), 0.0f, 0 == true ? 1 : 0, textResource2, z4, enumC15530c, interfaceC39332e, 253, null);
    }
}
