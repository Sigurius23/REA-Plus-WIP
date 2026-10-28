package v41;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c41.C4141w2;
import c93.InterfaceC4352n;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import java.util.List;
import java.util.Locale;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22973k1;
import p315m0.AbstractC24868a;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p602x1.C37816b;
import p635y2.InterfaceC39147y;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p72.C28958a;
import p720m91.AbstractC25303l;
import qz0.AbstractC30795n;
import s90.C32290f;
import v01.C35509k;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: v41.j */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001aW\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012²\u0006\u000e\u0010\u0011\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ll0/k1;", "horizontalPadding", "Lcom/whoop/design/util/TextResource;", "headline", "subHeadline", "", "Lc41/w2;", "listOfItems", "Lkotlin/Function1;", "", "Ll83/a0;", "onKeyMetricClicked", "d", "(Landroidx/compose/ui/Modifier;Ll0/k1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "minHeight", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35672j {

    /* JADX INFO: renamed from: v41.j$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function3 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC28601c1 f151610w;

        /* JADX INFO: renamed from: v41.j$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42523a implements Function1 {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC28601c1 f151611w;

            public C42523a(InterfaceC28601c1 interfaceC28601c1) {
                this.f151611w = interfaceC28601c1;
            }

            /* JADX INFO: renamed from: a */
            public final void m112993a(InterfaceC39147y it) {
                AbstractC22676k.m65750j(it, "it");
                if (((int) (it.mo3541n() & 4294967295L)) > AbstractC35672j.m112986f(this.f151611w)) {
                    AbstractC35672j.m112987g(this.f151611w, (int) (it.mo3541n() & 4294967295L));
                }
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m112993a((InterfaceC39147y) obj);
                return C23454a0.f92919a;
            }
        }

        public a(InterfaceC28601c1 interfaceC28601c1) {
            this.f151610w = interfaceC28601c1;
        }

        /* JADX INFO: renamed from: a */
        public final Modifier m112992a(C4141w2 it, Composer composer, int i13) {
            AbstractC22676k.m65750j(it, "it");
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(150969612);
            Modifier modifierM3405b = AbstractC1102d.m3405b(C2314t.f9131w, 0.0f, ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo733e0(AbstractC35672j.m112986f(this.f151610w)), 1);
            InterfaceC28601c1 interfaceC28601c1 = this.f151610w;
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C42523a(interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3500d = AbstractC1131a.m3500d(modifierM3405b, (Function1) objM87133R);
            c28655q.m87173q(false);
            return modifierM3500d;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m112992a((C4141w2) obj, (Composer) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: v41.j$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f151612w;

        public b(Function1 function1) {
            this.f151612w = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m112994a(Object it) {
            AbstractC22676k.m65750j(it, "it");
            this.f151612w.invoke(it);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m112994a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: v41.j$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f151613w = new c();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C4141w2 c4141w2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: v41.j$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f151614w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f151615x;

        public d(Function1 function1, List list) {
            this.f151614w = function1;
            this.f151615x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m112996a(int i13) {
            return this.f151614w.invoke(this.f151615x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m112996a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: v41.j$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f151616w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f151617x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f151618y;

        public e(List list, Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
            this.f151616w = list;
            this.f151617x = function1;
            this.f151618y = interfaceC28601c1;
        }

        /* JADX INFO: renamed from: a */
        public final void m112997a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            C4141w2 c4141w2 = (C4141w2) this.f151616w.get(i13);
            c28655q.m87150e0(-692596680);
            a aVar = new a(this.f151618y);
            boolean zM87153g = c28655q.m87153g(this.f151617x);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new b(this.f151617x);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(c4141w2, null, aVar, (Function1) objM87133R, c28655q, 0, 2);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m112997a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:104:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:108:0x0267  */
    /* JADX WARN: Code duplicated, block: B:111:0x0270  */
    /* JADX WARN: Code duplicated, block: B:114:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:118:0x02d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:122:0x0306  */
    /* JADX WARN: Code duplicated, block: B:125:0x0313  */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x005f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:33:0x006f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0075  */
    /* JADX WARN: Code duplicated, block: B:36:0x0078  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    /* JADX WARN: Code duplicated, block: B:43:0x0088  */
    /* JADX WARN: Code duplicated, block: B:47:0x0091  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:82:0x011b  */
    /* JADX WARN: Code duplicated, block: B:83:0x011f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0134  */
    /* JADX WARN: Code duplicated, block: B:88:0x0142  */
    /* JADX WARN: Code duplicated, block: B:91:0x018c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0190  */
    /* JADX WARN: Code duplicated, block: B:95:0x019d  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ab  */
    /* JADX INFO: renamed from: d */
    public static final void m112984d(Modifier modifier, InterfaceC22973k1 interfaceC22973k1, TextResource headline, TextResource subHeadline, List<C4141w2> listOfItems, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        InterfaceC22973k1 interfaceC22973k2;
        int i16;
        Function1 function2;
        int i17;
        int i18;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        Function1 function3;
        InterfaceC22973k1 interfaceC22973k3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        InterfaceC22973k1 interfaceC22973k1M3379a;
        C28676v0 c28676v0;
        Function1 function4;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        Function1 function5;
        boolean z13;
        boolean z14;
        Object objM87133R2;
        Object objM87133R3;
        int i19;
        int i24;
        int i25;
        AbstractC22676k.m65750j(headline, "headline");
        AbstractC22676k.m65750j(subHeadline, "subHeadline");
        AbstractC22676k.m65750j(listOfItems, "listOfItems");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(208140128);
        int i26 = i14 & 1;
        if (i26 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        int i27 = i14 & 2;
        if (i27 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC22973k2 = interfaceC22973k1;
                i15 |= c28655q2.m87153g(interfaceC22973k2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q2.m87153g(headline)) {
                    i25 = 256;
                } else {
                    i25 = 128;
                }
                i15 |= i25;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q2.m87153g(subHeadline)) {
                    i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i24;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q2.m87157i(listOfItems)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            i16 = i14 & 32;
            if (i16 != 0) {
                if ((196608 & i13) == 0) {
                    function2 = function1;
                    if (c28655q2.m87157i(function2)) {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i17;
                }
                i18 = i15;
                if ((i18 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i18 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i26 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i27 != 0) {
                        interfaceC22973k1M3379a = AbstractC1099a.m3379a(2 * 8, 0.0f, 2);
                    } else {
                        interfaceC22973k1M3379a = interfaceC22973k2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C35509k(4);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function4 = (Function1) objM87133R3;
                    } else {
                        function4 = function2;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11895b.m32005x(0, c28655q2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                    InterfaceC22973k1 interfaceC22973k4 = interfaceC22973k1M3379a;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifier2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
                    C0209i c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    Modifier modifier4 = modifier2;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                    float f13 = 1 * 8;
                    Modifier modifierM3393o = AbstractC1099a.m3393o(interfaceC22973k4, AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f13, 7));
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q2, 48);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3393o);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                    String strM21274h = AbstractC8693b.m21274h(headline, c28655q2, (i18 >> 6) & 14);
                    Locale locale = Locale.ROOT;
                    String upperCase = strM21274h.toUpperCase(locale);
                    AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                    if (2.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
                    C38072d c38072d = C38072d.f163053a;
                    function5 = function4;
                    AbstractC30795n.m94707h(upperCase, layoutWeightElement, c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getH4(), null, c28655q2, 0, 0, 196088);
                    String upperCase2 = AbstractC8693b.m21274h(subHeadline, c28655q2, (i18 >> 9) & 14).toUpperCase(locale);
                    AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                    if (3.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    AbstractC30795n.m94707h(upperCase2, new LayoutWeightElement(3.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 3.0f, true), c38072d.m121949b(c28655q2, 6).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getSh5(), null, c28655q2, 0, 0, 196088);
                    c28655q2.m87173q(true);
                    C22971k c22971kM66746i = AbstractC22977m.m66746i(f13);
                    boolean zM87157i = c28655q2.m87157i(listOfItems);
                    if ((i18 & 458752) == 131072) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87157i | z13;
                    objM87133R2 = c28655q2.m87133R();
                    if (z14 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C32290f((Object) listOfItems, function5, (Object) interfaceC28601c1, 21);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC22973k2 = interfaceC22973k4;
                    AbstractC22674j.m65718d(null, null, interfaceC22973k2, c22971kM66746i, null, null, false, null, (Function1) objM87133R2, c28655q2, ((i18 << 3) & 896) | 24576, 491);
                    c28655q = c28655q2;
                    c28655q.m87173q(true);
                    function3 = function5;
                    modifier3 = modifier4;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    function3 = function2;
                }
                interfaceC22973k3 = interfaceC22973k2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C28958a(modifier3, interfaceC22973k3, headline, subHeadline, listOfItems, function3, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            function2 = function1;
            i18 = i15;
            if ((i18 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i18 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i26 != 0) {
                    modifier2 = c2314t;
                }
                if (i27 != 0) {
                    interfaceC22973k1M3379a = AbstractC1099a.m3379a(2 * 8, 0.0f, 2);
                } else {
                    interfaceC22973k1M3379a = interfaceC22973k2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C35509k(4);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11895b.m32005x(0, c28655q2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                InterfaceC22973k1 interfaceC22973k5 = interfaceC22973k1M3379a;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifier2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i5 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a2);
                C0209i c0209i6 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                Modifier modifier5 = modifier2;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N3);
                float f14 = 1 * 8;
                Modifier modifierM3393o2 = AbstractC1099a.m3393o(interfaceC22973k5, AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f14, 7));
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q2, 48);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3393o2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
                String strM21274h2 = AbstractC8693b.m21274h(headline, c28655q2, (i18 >> 6) & 14);
                Locale locale2 = Locale.ROOT;
                String upperCase3 = strM21274h2.toUpperCase(locale2);
                AbstractC22676k.m65749i(upperCase3, "toUpperCase(...)");
                if (2.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
                C38072d c38072d2 = C38072d.f163053a;
                function5 = function4;
                AbstractC30795n.m94707h(upperCase3, layoutWeightElement2, c38072d2.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, 6).getH4(), null, c28655q2, 0, 0, 196088);
                String upperCase4 = AbstractC8693b.m21274h(subHeadline, c28655q2, (i18 >> 9) & 14).toUpperCase(locale2);
                AbstractC22676k.m65749i(upperCase4, "toUpperCase(...)");
                if (3.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC30795n.m94707h(upperCase4, new LayoutWeightElement(3.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 3.0f, true), c38072d2.m121949b(c28655q2, 6).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, 6).getSh5(), null, c28655q2, 0, 0, 196088);
                c28655q2.m87173q(true);
                C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f14);
                boolean zM87157i2 = c28655q2.m87157i(listOfItems);
                if ((i18 & 458752) == 131072) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87157i2 | z13;
                objM87133R2 = c28655q2.m87133R();
                if (z14) {
                    objM87133R2 = new C32290f((Object) listOfItems, function5, (Object) interfaceC28601c1, 21);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C32290f((Object) listOfItems, function5, (Object) interfaceC28601c1, 21);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC22973k2 = interfaceC22973k5;
                AbstractC22674j.m65718d(null, null, interfaceC22973k2, c22971kM66746i2, null, null, false, null, (Function1) objM87133R2, c28655q2, ((i18 << 3) & 896) | 24576, 491);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                function3 = function5;
                modifier3 = modifier5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            interfaceC22973k3 = interfaceC22973k2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28958a(modifier3, interfaceC22973k3, headline, subHeadline, listOfItems, function3, i13, i14);
            }
        }
        i15 |= 48;
        interfaceC22973k2 = interfaceC22973k1;
        if ((i13 & 384) == 0) {
            if (c28655q2.m87153g(headline)) {
                i25 = 256;
            } else {
                i25 = 128;
            }
            i15 |= i25;
        }
        if ((i13 & 3072) == 0) {
            if (c28655q2.m87153g(subHeadline)) {
                i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i24 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i24;
        }
        if ((i13 & 24576) == 0) {
            if (c28655q2.m87157i(listOfItems)) {
                i19 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i19 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i19;
        }
        i16 = i14 & 32;
        if (i16 != 0) {
            if ((196608 & i13) == 0) {
                function2 = function1;
                if (c28655q2.m87157i(function2)) {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i17;
            }
            i18 = i15;
            if ((i18 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i18 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i26 != 0) {
                    modifier2 = c2314t;
                }
                if (i27 != 0) {
                    interfaceC22973k1M3379a = AbstractC1099a.m3379a(2 * 8, 0.0f, 2);
                } else {
                    interfaceC22973k1M3379a = interfaceC22973k2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C35509k(4);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11895b.m32005x(0, c28655q2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                InterfaceC22973k1 interfaceC22973k6 = interfaceC22973k1M3379a;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifier2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i8 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i8, c23010xM66775a3);
                C0209i c0209i9 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC28653p1M87165m5);
                c0209i = C0217k.f732j;
                Modifier modifier6 = modifier2;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i10 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N5);
                float f15 = 1 * 8;
                Modifier modifierM3393o3 = AbstractC1099a.m3393o(interfaceC22973k6, AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f15, 7));
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q2, 48);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3393o3);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i8, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC28653p1M87165m6);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i10, modifierM118962N6);
                String strM21274h3 = AbstractC8693b.m21274h(headline, c28655q2, (i18 >> 6) & 14);
                Locale locale3 = Locale.ROOT;
                String upperCase5 = strM21274h3.toUpperCase(locale3);
                AbstractC22676k.m65749i(upperCase5, "toUpperCase(...)");
                if (2.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
                C38072d c38072d3 = C38072d.f163053a;
                function5 = function4;
                AbstractC30795n.m94707h(upperCase5, layoutWeightElement3, c38072d3.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q2, 6).getH4(), null, c28655q2, 0, 0, 196088);
                String upperCase6 = AbstractC8693b.m21274h(subHeadline, c28655q2, (i18 >> 9) & 14).toUpperCase(locale3);
                AbstractC22676k.m65749i(upperCase6, "toUpperCase(...)");
                if (3.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC30795n.m94707h(upperCase6, new LayoutWeightElement(3.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 3.0f, true), c38072d3.m121949b(c28655q2, 6).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q2, 6).getSh5(), null, c28655q2, 0, 0, 196088);
                c28655q2.m87173q(true);
                C22971k c22971kM66746i3 = AbstractC22977m.m66746i(f15);
                boolean zM87157i3 = c28655q2.m87157i(listOfItems);
                if ((i18 & 458752) == 131072) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87157i3 | z13;
                objM87133R2 = c28655q2.m87133R();
                if (z14) {
                    objM87133R2 = new C32290f((Object) listOfItems, function5, (Object) interfaceC28601c1, 21);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C32290f((Object) listOfItems, function5, (Object) interfaceC28601c1, 21);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC22973k2 = interfaceC22973k6;
                AbstractC22674j.m65718d(null, null, interfaceC22973k2, c22971kM66746i3, null, null, false, null, (Function1) objM87133R2, c28655q2, ((i18 << 3) & 896) | 24576, 491);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                function3 = function5;
                modifier3 = modifier6;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            interfaceC22973k3 = interfaceC22973k2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28958a(modifier3, interfaceC22973k3, headline, subHeadline, listOfItems, function3, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        function2 = function1;
        i18 = i15;
        if ((i18 & 74899) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i18 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i26 != 0) {
                modifier2 = c2314t;
            }
            if (i27 != 0) {
                interfaceC22973k1M3379a = AbstractC1099a.m3379a(2 * 8, 0.0f, 2);
            } else {
                interfaceC22973k1M3379a = interfaceC22973k2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C35509k(4);
                    c28655q2.m87172p0(objM87133R3);
                }
                function4 = (Function1) objM87133R3;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11895b.m32005x(0, c28655q2);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            InterfaceC22973k1 interfaceC22973k7 = interfaceC22973k1M3379a;
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifier2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i11 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i11, c23010xM66775a4);
            C0209i c0209i12 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC28653p1M87165m7);
            c0209i = C0217k.f732j;
            Modifier modifier7 = modifier2;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i13 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N7);
            float f16 = 1 * 8;
            Modifier modifierM3393o4 = AbstractC1099a.m3393o(interfaceC22973k7, AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f16, 7));
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q2, 48);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM3393o4);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i11, c22994r1M66759a4);
            AbstractC28683x.m87239G(c28655q2, c0209i12, interfaceC28653p1M87165m8);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N8);
            String strM21274h4 = AbstractC8693b.m21274h(headline, c28655q2, (i18 >> 6) & 14);
            Locale locale4 = Locale.ROOT;
            String upperCase7 = strM21274h4.toUpperCase(locale4);
            AbstractC22676k.m65749i(upperCase7, "toUpperCase(...)");
            if (2.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
            C38072d c38072d4 = C38072d.f163053a;
            function5 = function4;
            AbstractC30795n.m94707h(upperCase7, layoutWeightElement4, c38072d4.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q2, 6).getH4(), null, c28655q2, 0, 0, 196088);
            String upperCase8 = AbstractC8693b.m21274h(subHeadline, c28655q2, (i18 >> 9) & 14).toUpperCase(locale4);
            AbstractC22676k.m65749i(upperCase8, "toUpperCase(...)");
            if (3.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC30795n.m94707h(upperCase8, new LayoutWeightElement(3.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 3.0f, true), c38072d4.m121949b(c28655q2, 6).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q2, 6).getSh5(), null, c28655q2, 0, 0, 196088);
            c28655q2.m87173q(true);
            C22971k c22971kM66746i4 = AbstractC22977m.m66746i(f16);
            boolean zM87157i4 = c28655q2.m87157i(listOfItems);
            if ((i18 & 458752) == 131072) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = zM87157i4 | z13;
            objM87133R2 = c28655q2.m87133R();
            if (z14) {
                objM87133R2 = new C32290f((Object) listOfItems, function5, (Object) interfaceC28601c1, 21);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C32290f((Object) listOfItems, function5, (Object) interfaceC28601c1, 21);
                c28655q2.m87172p0(objM87133R2);
            }
            interfaceC22973k2 = interfaceC22973k7;
            AbstractC22674j.m65718d(null, null, interfaceC22973k2, c22971kM66746i4, null, null, false, null, (Function1) objM87133R2, c28655q2, ((i18 << 3) & 896) | 24576, 491);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            function3 = function5;
            modifier3 = modifier7;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        interfaceC22973k3 = interfaceC22973k2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28958a(modifier3, interfaceC22973k3, headline, subHeadline, listOfItems, function3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m112985e(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final int m112986f(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final void m112987g(InterfaceC28601c1 interfaceC28601c1, int i13) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m112988h(List list, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC26064q LazyRow) {
        AbstractC22676k.m65750j(LazyRow, "$this$LazyRow");
        C26053f c26053f = (C26053f) LazyRow;
        c26053f.m77529r(list.size(), null, new d(c.f151613w, list), new C37816b(new e(list, function1, interfaceC28601c1), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m112989i(Modifier modifier, InterfaceC22973k1 interfaceC22973k1, TextResource textResource, TextResource textResource2, List list, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m112984d(modifier, interfaceC22973k1, textResource, textResource2, list, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
