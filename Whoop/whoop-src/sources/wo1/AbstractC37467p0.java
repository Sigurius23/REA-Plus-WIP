package wo1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bm0.C3412o;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import e93.AbstractC12889b;
import hc3.AbstractC17176i;
import hy0.AbstractC17808z1;
import hy0.C17731c2;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.List;
import jd2.C21612a;
import kd1.C22411w;
import l83.C23454a0;
import l83.InterfaceC23459e;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.EnumC22935a1;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p739ui0.C35015q;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import ro1.AbstractC31635g;
import so1.C32827m0;
import so1.C32829n0;
import v31.C35608d;
import vl0.C36100c;
import w71.C36891k;
import wb3.AbstractC37056f;
import x81.C38072d;
import xn1.AbstractC38480c;
import yn1.AbstractC39672a;

/* JADX INFO: renamed from: wo1.p0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\b\u0010\t\u001aK\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u0013\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lso1/n0;", "viewState", "Lkotlin/Function1;", "Lro1/g;", "Ll83/a0;", "onNavigationEvent", "Lyn1/a;", "onAnalyticEvent", "r", "(Lso1/n0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/util/TextResource;", "title", "Lcom/whoop/navigation/e;", "navigationAction", "k", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "Lso1/m0;", "cycleStats", "o", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37467p0 {

    /* JADX INFO: renamed from: wo1.p0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f160306w = new a();

        /* JADX INFO: renamed from: a */
        public final long m120092a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getGreyL1();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m120092a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: wo1.p0$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f160307w = new b();

        /* JADX INFO: renamed from: a */
        public final long m120093a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getGreyL1();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m120093a((C39336i) obj));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:65:0x0161  */
    /* JADX WARN: Code duplicated, block: B:67:0x017b  */
    /* JADX WARN: Code duplicated, block: B:70:0x018c  */
    /* JADX WARN: Code duplicated, block: B:73:0x01be  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:86:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:87:0x01de  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:94:0x0205  */
    /* JADX WARN: Code duplicated, block: B:96:0x0214  */
    /* JADX WARN: Code duplicated, block: B:99:0x021e  */
    /* JADX INFO: renamed from: k */
    private static final void m120079k(TextResource textResource, C9598e c9598e, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        boolean z4;
        Function1 function4;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C38072d c38072d;
        Object objM87133R;
        Object objM87133R2;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R3;
        Object objM87133R4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2134767812);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(textResource) : c28655q.m87157i(textResource) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(c9598e) : c28655q.m87157i(c9598e) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        int i16 = i14 & 8;
        if (i16 == 0) {
            if ((i13 & 3072) == 0) {
                function3 = function2;
                i15 |= c28655q.m87157i(function3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C37445e0(5);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                } else {
                    function4 = function3;
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, TextResource.$stable | (i15 & 14));
                c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getSh4(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q;
                if (c9598e != null) {
                    c28655q.m87150e0(-1259057277);
                    AbstractC27274q.d dVar = AbstractC27274q.d.f109141f;
                    int iM46245w = c38072d.m121951d().getTinyIcons().getTinyInformation();
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = a.f160306w;
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = b.f160307w;
                        c28655q.m87172p0(objM87133R2);
                    }
                    C27270o c27270o = new C27270o(dVar, iM46245w, interfaceC39332eM125323a, p745y81.Function1.m125323a((Function1) objM87133R2), null, false, false, false, 0.0f, false, MessageListItemViewType.GIPHY, null);
                    String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164865l);
                    Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t, "TypicalCycleInformationButtonTag");
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((i15 & 112) != 32 || ((i15 & 64) != 0 && c28655q.m87157i(c9598e))) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z17 = z14 | z13;
                    if ((i15 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z17 | z15;
                    objM87133R3 = c28655q.m87133R();
                    if (z16 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C37449g0(function1, c9598e, function4);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC27242b1.m82092d(c27270o, strM92103Y, null, modifierM3599a, (InterfaceC4339a) objM87133R3, c28655q, C27270o.f109105k | 3072, 4);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1258350942);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
                function4 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C36891k((Object) textResource, (Object) c9598e, function1, (InterfaceC23459e) function4, i13, i14, 3);
            }
        }
        i15 |= 3072;
        function3 = function2;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C37445e0(5);
                    c28655q.m87172p0(objM87133R4);
                }
                function4 = (Function1) objM87133R4;
            } else {
                function4 = function3;
            }
            c2314t = C2314t.f9131w;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            String strM21274h2 = AbstractC8693b.m21274h(textResource, c28655q, TextResource.$stable | (i15 & 14));
            c38072d = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h2, null, c38072d.m121949b(c28655q, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getSh4(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            if (c9598e != null) {
                c28655q.m87150e0(-1259057277);
                AbstractC27274q.d dVar2 = AbstractC27274q.d.f109141f;
                int iM46245w2 = c38072d.m121951d().getTinyIcons().getTinyInformation();
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = a.f160306w;
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC39332e interfaceC39332eM125323a2 = p745y81.Function1.m125323a((Function1) objM87133R);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = b.f160307w;
                    c28655q.m87172p0(objM87133R2);
                }
                C27270o c27270o2 = new C27270o(dVar2, iM46245w2, interfaceC39332eM125323a2, p745y81.Function1.m125323a((Function1) objM87133R2), null, false, false, false, 0.0f, false, MessageListItemViewType.GIPHY, null);
                String strM92103Y2 = AbstractC30060g.m92103Y(c28655q, AbstractC38480c.f164865l);
                Modifier modifierM3599a2 = AbstractC1136a.m3599a(c2314t, "TypicalCycleInformationButtonTag");
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i15 & 112) != 32) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                boolean z18 = z14 | z13;
                if ((i15 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z18 | z15;
                objM87133R3 = c28655q.m87133R();
                if (z16) {
                    objM87133R3 = new C37449g0(function1, c9598e, function4);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C37449g0(function1, c9598e, function4);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC27242b1.m82092d(c27270o2, strM92103Y2, null, modifierM3599a2, (InterfaceC4339a) objM87133R3, c28655q, C27270o.f109105k | 3072, 4);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1258350942);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
            function4 = function3;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36891k((Object) textResource, (Object) c9598e, function1, (InterfaceC23459e) function4, i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m120080l(AbstractC39672a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m120081m(Function1 function1, C9598e c9598e, Function1 function2) {
        function1.invoke(new AbstractC31635g.e(c9598e));
        function2.invoke(AbstractC39672a.c0.f170738a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m120082n(TextResource textResource, C9598e c9598e, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m120079k(textResource, c9598e, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r25v3, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r3v11, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r3v13, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r3v9, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r7v6, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: o */
    private static final void m120083o(List<C32827m0> list, Composer composer, int i13) {
        ?? r10;
        boolean z4;
        ?? r14;
        List<C32827m0> list2 = list;
        C2306l c2306l = C2299e.f9107J;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1144009703);
        int i14 = 2;
        int i15 = (i13 & 6) == 0 ? i13 | (c28655q.m87157i(list2) ? 4 : 2) : i13;
        boolean z13 = true;
        ?? r15 = 0;
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            long jM125370W0 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10();
            float f13 = 1.0f;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            boolean zM87157i = c28655q.m87157i(list2) | c28655q.m87151f(jM125370W0);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C21612a(list2, 2, jM125370W0);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3478a = AbstractC1125a.m3478a(modifierM3409f, (Function1) objM87133R);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3478a);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(1066528940);
            int i16 = 0;
            ?? r16 = c28655q;
            for (Object obj : list2) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C32827m0 c32827m0 = (C32827m0) obj;
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(f13, c2314t), i16 == 0 ? (float) r15 : i14 * 8, 0.0f, i16 == AbstractC37056f.m118951C(list2) ? (float) r15 : i14 * 8, 0.0f, 10);
                if (f13 <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM31988g = AbstractC11895b.m31988g(modifierM3398t, z13, f13);
                C22957g c22957g = AbstractC22977m.f90652c;
                C2305k c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, r16, r15);
                int iHashCode2 = Long.hashCode(r16.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = r16.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(r16, modifierM31988g);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                r16.m87158i0();
                if (r16.f115903S) {
                    r16.m87163l(c0213j2);
                } else {
                    r16.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(r16, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(r16, c0209i3, interfaceC28653p1M87165m2);
                C0209i c0209i4 = C0217k.f732j;
                if (r16.f115903S || !AbstractC22676k.m65745e(r16.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, r16, iHashCode2, c0209i4);
                }
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(r16, c0209i5, modifierM118962N2);
                Modifier modifierM3399u = AbstractC1099a.m3399u(c2314t, EnumC22935a1.f90537w);
                TextResource textResourceM103007a = c32827m0.getTitleDisplay();
                int i18 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResourceM103007a, r16, i18);
                C2314t c2314t2 = c2314t;
                ?? r17 = C38072d.f163053a;
                int i19 = C38072d.f163054b;
                C2886a c2886aM8438s = r17.m121952e(r16, i19).getH5();
                long jM125385c1 = r17.m121949b(r16, i19).getWhite70();
                int i24 = C2886a.f11498d << 18;
                ?? r25 = r16;
                C2306l c2306l2 = c2306l;
                AbstractC30795n.m94707h(strM21274h, modifierM3399u, jM125385c1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8438s, null, r25, 48, i24, 196600);
                float f14 = 4;
                float f15 = 2 * f14;
                AbstractC22953f.m66715b(r25, AbstractC1102d.m3419p(f15, c2314t2));
                C2306l c2306l3 = C2299e.f9109L;
                float f16 = f14 * 1;
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(f16, c2305k), c2306l3, r25, 54);
                int iHashCode3 = Long.hashCode(r25.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = r25.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(r25, c2314t2);
                r25.m87158i0();
                if (r25.f115903S) {
                    r25.m87163l(c0213j2);
                } else {
                    r25.m87178s0();
                }
                AbstractC28683x.m87239G(r25, c0209i2, c22994r1M66759a2);
                AbstractC28683x.m87239G(r25, c0209i3, interfaceC28653p1M87165m3);
                if (r25.f115903S || !AbstractC22676k.m65745e(r25.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, r25, iHashCode3, c0209i4);
                }
                AbstractC28683x.m87239G(r25, c0209i5, modifierM118962N3);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(AbstractC8693b.m21271e(c32827m0.getValueDisplay(), AbstractC8693b.m21278l("-")), r25, i18), null, r17.m121949b(r25, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r17.m121952e(r25, i19).getN5(), null, r25, 0, i24, 196602);
                ?? r18 = r25;
                if (AbstractC8693b.m21270d(c32827m0.getVariance())) {
                    r18.m87150e0(-1550110751);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c32827m0.getVariance(), r18, i18), new VerticalAlignElement(c2306l2), r17.m121949b(r18, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r17.m121952e(r18, i19).getN8(), null, r18, 0, i24, 196600);
                    ?? r19 = r18;
                    z4 = false;
                    r19.m87173q(false);
                    r14 = r19;
                } else {
                    z4 = false;
                    r18.m87150e0(-1549803510);
                    r18.m87173q(false);
                    r14 = r18;
                }
                boolean z14 = z4;
                ?? r26 = r14;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c32827m0.getUnits(), r14, i18), AbstractC1099a.m3398t(new VerticalAlignElement(c2306l3), 0.0f, 0.0f, 0.0f, f16, 7), r17.m121949b(r14, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, r17.m121952e(r14, i19).getB2(), null, r26, 0, i24 | 3072, 188408);
                ?? r24 = r26;
                AbstractC17176i.m48516r(r24, true, c2314t2, f15, r24);
                if (c32827m0.getTrend() != null) {
                    r24.m87150e0(-1869878699);
                    AbstractC17808z1.m51175c(c32827m0.getTrend(), r24, C17731c2.f68917p);
                    r24.m87173q(z14);
                } else {
                    r24.m87150e0(-1869823922);
                    r24.m87173q(z14);
                }
                r24.m87173q(true);
                r15 = z14;
                z13 = true;
                c2314t = c2314t2;
                i16 = i17;
                c2306l = c2306l2;
                f13 = 1.0f;
                i14 = 2;
                list2 = list;
                r16 = r24;
            }
            r16.m87173q(r15);
            r16.m87173q(z13);
            r10 = r16;
        } else {
            c28655q.m87138X();
            r10 = c28655q;
        }
        C28677v1 c28677v1M87180u = r10.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3412o(list, i13, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m120084p(List list, long j7, InterfaceC22131e interfaceC22131e) {
        InterfaceC22131e drawBehind = interfaceC22131e;
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        if (list.size() > 1) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)) / list.size();
            int size = list.size();
            int i13 = 1;
            while (i13 < size) {
                float f13 = i13 * fIntBitsToFloat;
                drawBehind.mo732d0(j7, (((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo731d() & 4294967295L)))) & 4294967295L), (496 & 8) != 0 ? 0.0f : drawBehind.mo743q0(1), (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : null);
                i13++;
                drawBehind = interfaceC22131e;
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m120085q(List list, int i13, Composer composer, int i14) {
        m120083o(list, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:63:0x0175  */
    /* JADX WARN: Code duplicated, block: B:66:0x018f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0191  */
    /* JADX WARN: Code duplicated, block: B:70:0x0199  */
    /* JADX WARN: Code duplicated, block: B:72:0x019d  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: r */
    public static final void m120086r(C32829n0 viewState, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        int i16;
        Function1 function4;
        int i17;
        boolean z4;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function7;
        Function1 function8;
        int iHashCode;
        C2314t c2314t;
        C0213j c0213j;
        C0209i c0209i;
        Function1 function9;
        C2314t c2314t2;
        C28676v0 c28676v1;
        int i18;
        int i19;
        int i24;
        Object objM87133R;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(832734728);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i25 = i14 & 2;
        if (i25 == 0) {
            if ((i13 & 48) == 0) {
                function3 = function1;
                i15 |= c28655q.m87157i(function3) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i25 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C37445e0(3);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function7 = (Function1) objM87133R3;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C37445e0(4);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function8 = (Function1) objM87133R2;
                    } else {
                        function8 = function4;
                    }
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    Function1 function10 = function8;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    c2314t = C2314t.f9131w;
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    if (viewState.getShowSectionTitle()) {
                        c28655q.m87150e0(1542278626);
                        String strM21274h = AbstractC8693b.m21274h(viewState.getTitleDisplay(), c28655q, TextResource.$stable);
                        C38072d c38072d = C38072d.f163053a;
                        int i26 = C38072d.f163054b;
                        function9 = function7;
                        c28676v1 = c28676v0;
                        i18 = 0;
                        c2314t2 = c2314t;
                        AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i26).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i26).getT3(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                        c28655q = c28655q;
                        AbstractC31061c.m95650z(2, 8, c2314t2, c28655q, false);
                    } else {
                        function9 = function7;
                        c2314t2 = c2314t;
                        c28676v1 = c28676v0;
                        i18 = 0;
                        c28655q.m87150e0(1542538096);
                        c28655q.m87173q(false);
                    }
                    boolean zM87157i = c28655q.m87157i(viewState);
                    if ((i15 & 112) == 32) {
                        i19 = 1;
                    } else {
                        i19 = i18;
                    }
                    i24 = (zM87157i ? 1 : 0) | i19;
                    objM87133R = c28655q.m87133R();
                    if (i24 == 0 || objM87133R == c28676v1) {
                        objM87133R = new C35015q(viewState, function9, 29);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC12889b.m36263b(AbstractC1092a.m3362g(c2314t2, false, null, null, (InterfaceC4339a) objM87133R, 15), C22411w.f87680a.m64535a().m64090c(), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), null, i18 * 4, AbstractC37817c.m121344e(-832630449, c28655q, new C36100c((Object) viewState, (Object) function9, (Object) function10, 5)), c28655q, 1769472, 24);
                    c28655q.m87173q(true);
                    function5 = function9;
                    function6 = function10;
                } else {
                    c28655q.m87138X();
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C35608d((Object) viewState, function5, (InterfaceC23459e) function6, i13, i14, 29);
                }
            }
            i15 |= 384;
            function4 = function2;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C37445e0(3);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function7 = (Function1) objM87133R3;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C37445e0(4);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function8 = (Function1) objM87133R2;
                } else {
                    function8 = function4;
                }
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                Function1 function11 = function8;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                c2314t = C2314t.f9131w;
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                if (viewState.getShowSectionTitle()) {
                    c28655q.m87150e0(1542278626);
                    String strM21274h2 = AbstractC8693b.m21274h(viewState.getTitleDisplay(), c28655q, TextResource.$stable);
                    C38072d c38072d2 = C38072d.f163053a;
                    int i27 = C38072d.f163054b;
                    function9 = function7;
                    c28676v1 = c28676v0;
                    i18 = 0;
                    c2314t2 = c2314t;
                    AbstractC30795n.m94707h(strM21274h2, null, c38072d2.m121949b(c28655q, i27).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i27).getT3(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                    c28655q = c28655q;
                    AbstractC31061c.m95650z(2, 8, c2314t2, c28655q, false);
                } else {
                    function9 = function7;
                    c2314t2 = c2314t;
                    c28676v1 = c28676v0;
                    i18 = 0;
                    c28655q.m87150e0(1542538096);
                    c28655q.m87173q(false);
                }
                boolean zM87157i2 = c28655q.m87157i(viewState);
                if ((i15 & 112) == 32) {
                    i19 = 1;
                } else {
                    i19 = i18;
                }
                i24 = (zM87157i2 ? 1 : 0) | i19;
                objM87133R = c28655q.m87133R();
                if (i24 == 0) {
                    objM87133R = new C35015q(viewState, function9, 29);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C35015q(viewState, function9, 29);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC12889b.m36263b(AbstractC1092a.m3362g(c2314t2, false, null, null, (InterfaceC4339a) objM87133R, 15), C22411w.f87680a.m64535a().m64090c(), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), null, i18 * 4, AbstractC37817c.m121344e(-832630449, c28655q, new C36100c((Object) viewState, (Object) function9, (Object) function11, 5)), c28655q, 1769472, 24);
                c28655q.m87173q(true);
                function5 = function9;
                function6 = function11;
            } else {
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35608d((Object) viewState, function5, (InterfaceC23459e) function6, i13, i14, 29);
            }
        }
        i15 |= 48;
        function3 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function4 = function2;
                if (c28655q.m87157i(function4)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C37445e0(3);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function7 = (Function1) objM87133R3;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C37445e0(4);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function8 = (Function1) objM87133R2;
                } else {
                    function8 = function4;
                }
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                Function1 function12 = function8;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                c2314t = C2314t.f9131w;
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                if (viewState.getShowSectionTitle()) {
                    c28655q.m87150e0(1542278626);
                    String strM21274h3 = AbstractC8693b.m21274h(viewState.getTitleDisplay(), c28655q, TextResource.$stable);
                    C38072d c38072d3 = C38072d.f163053a;
                    int i28 = C38072d.f163054b;
                    function9 = function7;
                    c28676v1 = c28676v0;
                    i18 = 0;
                    c2314t2 = c2314t;
                    AbstractC30795n.m94707h(strM21274h3, null, c38072d3.m121949b(c28655q, i28).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i28).getT3(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                    c28655q = c28655q;
                    AbstractC31061c.m95650z(2, 8, c2314t2, c28655q, false);
                } else {
                    function9 = function7;
                    c2314t2 = c2314t;
                    c28676v1 = c28676v0;
                    i18 = 0;
                    c28655q.m87150e0(1542538096);
                    c28655q.m87173q(false);
                }
                boolean zM87157i3 = c28655q.m87157i(viewState);
                if ((i15 & 112) == 32) {
                    i19 = 1;
                } else {
                    i19 = i18;
                }
                i24 = (zM87157i3 ? 1 : 0) | i19;
                objM87133R = c28655q.m87133R();
                if (i24 == 0) {
                    objM87133R = new C35015q(viewState, function9, 29);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C35015q(viewState, function9, 29);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC12889b.m36263b(AbstractC1092a.m3362g(c2314t2, false, null, null, (InterfaceC4339a) objM87133R, 15), C22411w.f87680a.m64535a().m64090c(), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), null, i18 * 4, AbstractC37817c.m121344e(-832630449, c28655q, new C36100c((Object) viewState, (Object) function9, (Object) function12, 5)), c28655q, 1769472, 24);
                c28655q.m87173q(true);
                function5 = function9;
                function6 = function12;
            } else {
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35608d((Object) viewState, function5, (InterfaceC23459e) function6, i13, i14, 29);
            }
        }
        i15 |= 384;
        function4 = function2;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i25 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C37445e0(3);
                    c28655q.m87172p0(objM87133R3);
                }
                function7 = (Function1) objM87133R3;
            } else {
                function7 = function3;
            }
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C37445e0(4);
                    c28655q.m87172p0(objM87133R2);
                }
                function8 = (Function1) objM87133R2;
            } else {
                function8 = function4;
            }
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            Function1 function13 = function8;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            c2314t = C2314t.f9131w;
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            if (viewState.getShowSectionTitle()) {
                c28655q.m87150e0(1542278626);
                String strM21274h4 = AbstractC8693b.m21274h(viewState.getTitleDisplay(), c28655q, TextResource.$stable);
                C38072d c38072d4 = C38072d.f163053a;
                int i29 = C38072d.f163054b;
                function9 = function7;
                c28676v1 = c28676v0;
                i18 = 0;
                c2314t2 = c2314t;
                AbstractC30795n.m94707h(strM21274h4, null, c38072d4.m121949b(c28655q, i29).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, i29).getT3(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q;
                AbstractC31061c.m95650z(2, 8, c2314t2, c28655q, false);
            } else {
                function9 = function7;
                c2314t2 = c2314t;
                c28676v1 = c28676v0;
                i18 = 0;
                c28655q.m87150e0(1542538096);
                c28655q.m87173q(false);
            }
            boolean zM87157i4 = c28655q.m87157i(viewState);
            if ((i15 & 112) == 32) {
                i19 = 1;
            } else {
                i19 = i18;
            }
            i24 = (zM87157i4 ? 1 : 0) | i19;
            objM87133R = c28655q.m87133R();
            if (i24 == 0) {
                objM87133R = new C35015q(viewState, function9, 29);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C35015q(viewState, function9, 29);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC12889b.m36263b(AbstractC1092a.m3362g(c2314t2, false, null, null, (InterfaceC4339a) objM87133R, 15), C22411w.f87680a.m64535a().m64090c(), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), null, i18 * 4, AbstractC37817c.m121344e(-832630449, c28655q, new C36100c((Object) viewState, (Object) function9, (Object) function13, 5)), c28655q, 1769472, 24);
            c28655q.m87173q(true);
            function5 = function9;
            function6 = function13;
        } else {
            c28655q.m87138X();
            function5 = function3;
            function6 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35608d((Object) viewState, function5, (InterfaceC23459e) function6, i13, i14, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m120087s(AbstractC31635g it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m120088t(AbstractC39672a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m120089u(C32829n0 c32829n0, Function1 function1) {
        if (c32829n0.getInfoButtonDestination() != null) {
            function1.invoke(new AbstractC31635g.e(c32829n0.getInfoButtonDestination()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m120090v(C32829n0 c32829n0, Function1 function1, Function1 function2, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 8;
            float f14 = 2 * f13;
            float f15 = 3 * f13;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3397s = AbstractC1099a.m3397s(c2314t, f14, f14, f14, f15);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3397s);
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
            m120079k(c32829n0.getTileTitleDisplay(), c32829n0.getInfoButtonDestination(), function1, function2, c28655q, TextResource.$stable | (C9598e.f28134d << 3), 0);
            float f16 = 4;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f16 * f16, c2314t));
            m120083o(c32829n0.m103016c(), c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m120091w(C32829n0 c32829n0, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m120086r(c32829n0, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
