package zt2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4352n;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15676d;
import gb1.AbstractC15680h;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import ih0.AbstractC18489d0;
import java.util.List;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p132f0.C13825t;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.C22971k;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x30.C37894h1;
import x81.C38072d;
import yf1.C39516e;
import z51.C40103n;

/* JADX INFO: renamed from: zt2.m */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a/\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lzt2/n;", "recoveriesCounterState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "d", "(Lzt2/n;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lzt2/l;", "state", "", "goalId", "", "dayIndex", "g", "(Lzt2/l;Ljava/lang/String;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;II)V", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC41144m {

    /* JADX INFO: renamed from: zt2.m$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f177373w;

        public a(List list) {
            this.f177373w = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m133634a(int i13) {
            this.f177373w.get(i13);
            return null;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m133634a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: zt2.m$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f177374w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C41145n f177375x;

        public b(List list, C41145n c41145n) {
            this.f177374w = list;
            this.f177375x = c41145n;
        }

        /* JADX INFO: renamed from: a */
        public final void m133635a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
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
            C41143l c41143l = (C41143l) this.f177374w.get(i13);
            c28655q.m87150e0(1696544418);
            AbstractC41144m.m133632g(c41143l, this.f177375x.getGoalId(), Integer.valueOf(i13 + 1), c28655q, TextResource.$stable, 0);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m133635a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m133629d(C41145n recoveriesCounterState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(recoveriesCounterState, "recoveriesCounterState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1941650510);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(recoveriesCounterState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C22971k c22971kM66746i = AbstractC22977m.m66746i(3 * 4);
            boolean zM87157i = c28655q.m87157i(recoveriesCounterState);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C37894h1(recoveriesCounterState, 20);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC22674j.m65718d(modifierM3409f, null, null, c22971kM66746i, null, null, false, null, (Function1) objM87133R, c28655q, 24582, 494);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39516e(recoveriesCounterState, onViewEvent, i13, 27);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m133630e(C41145n c41145n, InterfaceC26064q LazyRow) {
        AbstractC22676k.m65750j(LazyRow, "$this$LazyRow");
        List<C41143l> listM133637b = c41145n.m133637b();
        ((C26053f) LazyRow).m77529r(listM133637b.size(), null, new a(listM133637b), new C37816b(new b(listM133637b, c41145n), true, 2039820996));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m133631f(C41145n c41145n, Function1 function1, int i13, Composer composer, int i14) {
        m133629d(c41145n, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:65:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x0176  */
    /* JADX WARN: Code duplicated, block: B:70:0x017a  */
    /* JADX WARN: Code duplicated, block: B:73:0x018d  */
    /* JADX WARN: Code duplicated, block: B:75:0x019b  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:83:0x0244  */
    /* JADX WARN: Code duplicated, block: B:85:0x0259  */
    /* JADX WARN: Code duplicated, block: B:88:0x0264  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static final void m133632g(C41143l state, String str, Integer num, Composer composer, int i13, int i14) {
        int i15;
        String str2;
        int i16;
        Integer num2;
        int i17;
        boolean z4;
        String str3;
        Integer num3;
        C28677v1 c28677v1M87180u;
        String str4;
        String str5;
        Integer num4;
        long neutral15;
        long jM53363d;
        long jM53363d2;
        String str6;
        C2314t c2314t;
        float f13;
        boolean z13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        long j7;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-866211103);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(state) : c28655q.m87157i(state) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                str2 = str;
                i15 |= c28655q.m87153g(str2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    num2 = num;
                    if (c28655q.m87153g(num2)) {
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
                    str4 = null;
                    if (i18 != 0) {
                        str5 = null;
                    } else {
                        str5 = str2;
                    }
                    if (i16 != 0) {
                        num4 = null;
                    } else {
                        num4 = num2;
                    }
                    if (state.getIsSelected()) {
                        c28655q.m87150e0(794791498);
                        neutral15 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getNeutral15();
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(794792172);
                        c28655q.m87173q(false);
                        neutral15 = C17919x.f69636m;
                    }
                    if (state.getIsSelected()) {
                        c28655q.m87150e0(794794537);
                        jM53363d = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getRecovery();
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(794795560);
                        jM53363d = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                    }
                    if (state.getIsSelected()) {
                        c28655q.m87150e0(794797835);
                        jM53363d2 = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                    } else {
                        c28655q.m87150e0(794798920);
                        jM53363d2 = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                    }
                    if (state.getIsSelected()) {
                        str6 = "Logged";
                    } else {
                        str6 = "NotLogged";
                    }
                    if (str5 != null && num4 != null) {
                        str4 = str5 + "_Day" + num4 + "_" + str6 + "_Circle";
                    }
                    c2314t = C2314t.f9131w;
                    Modifier modifierM44101d = AbstractC15676d.m44101d(c2314t, str4);
                    C13825t c13825tM48880a = AbstractC17269i.m48880a((float) 1.5d, jM53363d);
                    C33252i c33252i = AbstractC33253j.f138651a;
                    f13 = 4;
                    z13 = true;
                    Modifier modifierM44112a = AbstractC15680h.m44112a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3419p(8 * f13, AbstractC15751g.m44456i(c13825tM48880a.f49345a, modifierM44101d, c13825tM48880a.f49346b, c33252i)), c33252i), neutral15, AbstractC17918w0.f69621a), true);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44112a);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    if (state.getIcon() != null) {
                        c28655q.m87150e0(-284996157);
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(state.getIcon().toWhoopIcon(), c28655q, 6), AbstractC8693b.m21275i("null", c28655q, 6), AbstractC1102d.m3419p(3 * f13, c2314t), jM53363d2, c28655q, 384, 0);
                        c28655q.m87173q(false);
                        num4 = num4;
                    } else {
                        j7 = jM53363d2;
                        if (state.getNumber() != null) {
                            c28655q.m87150e0(-284695860);
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(state.getNumber(), c28655q, TextResource.$stable), null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getN8(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-284536985);
                            c28655q.m87173q(false);
                        }
                        z13 = true;
                    }
                    c28655q.m87173q(z13);
                    String str7 = str5;
                    num3 = num4;
                    str3 = str7;
                } else {
                    c28655q.m87138X();
                    str3 = str2;
                    num3 = num2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C40103n(state, str3, num3, i13, i14, 15);
                }
            }
            i15 |= 384;
            num2 = num;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                str4 = null;
                if (i18 != 0) {
                    str5 = null;
                } else {
                    str5 = str2;
                }
                if (i16 != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                if (state.getIsSelected()) {
                    c28655q.m87150e0(794791498);
                    neutral15 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getNeutral15();
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(794792172);
                    c28655q.m87173q(false);
                    neutral15 = C17919x.f69636m;
                }
                if (state.getIsSelected()) {
                    c28655q.m87150e0(794794537);
                    jM53363d = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getRecovery();
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(794795560);
                    jM53363d = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                }
                if (state.getIsSelected()) {
                    c28655q.m87150e0(794797835);
                    jM53363d2 = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                } else {
                    c28655q.m87150e0(794798920);
                    jM53363d2 = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                }
                if (state.getIsSelected()) {
                    str6 = "Logged";
                } else {
                    str6 = "NotLogged";
                }
                if (str5 != null) {
                    str4 = str5 + "_Day" + num4 + "_" + str6 + "_Circle";
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM44101d2 = AbstractC15676d.m44101d(c2314t, str4);
                C13825t c13825tM48880a2 = AbstractC17269i.m48880a((float) 1.5d, jM53363d);
                C33252i c33252i2 = AbstractC33253j.f138651a;
                f13 = 4;
                z13 = true;
                Modifier modifierM44112a2 = AbstractC15680h.m44112a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3419p(8 * f13, AbstractC15751g.m44456i(c13825tM48880a2.f49345a, modifierM44101d2, c13825tM48880a2.f49346b, c33252i2)), c33252i2), neutral15, AbstractC17918w0.f69621a), true);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM44112a2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                if (state.getIcon() != null) {
                    c28655q.m87150e0(-284996157);
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(state.getIcon().toWhoopIcon(), c28655q, 6), AbstractC8693b.m21275i("null", c28655q, 6), AbstractC1102d.m3419p(3 * f13, c2314t), jM53363d2, c28655q, 384, 0);
                    c28655q.m87173q(false);
                    num4 = num4;
                } else {
                    j7 = jM53363d2;
                    if (state.getNumber() != null) {
                        c28655q.m87150e0(-284695860);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(state.getNumber(), c28655q, TextResource.$stable), null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getN8(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-284536985);
                        c28655q.m87173q(false);
                    }
                    z13 = true;
                }
                c28655q.m87173q(z13);
                String str8 = str5;
                num3 = num4;
                str3 = str8;
            } else {
                c28655q.m87138X();
                str3 = str2;
                num3 = num2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C40103n(state, str3, num3, i13, i14, 15);
            }
        }
        i15 |= 48;
        str2 = str;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                num2 = num;
                if (c28655q.m87153g(num2)) {
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
                str4 = null;
                if (i18 != 0) {
                    str5 = null;
                } else {
                    str5 = str2;
                }
                if (i16 != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                if (state.getIsSelected()) {
                    c28655q.m87150e0(794791498);
                    neutral15 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getNeutral15();
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(794792172);
                    c28655q.m87173q(false);
                    neutral15 = C17919x.f69636m;
                }
                if (state.getIsSelected()) {
                    c28655q.m87150e0(794794537);
                    jM53363d = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getRecovery();
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(794795560);
                    jM53363d = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                }
                if (state.getIsSelected()) {
                    c28655q.m87150e0(794797835);
                    jM53363d2 = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                } else {
                    c28655q.m87150e0(794798920);
                    jM53363d2 = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                }
                if (state.getIsSelected()) {
                    str6 = "Logged";
                } else {
                    str6 = "NotLogged";
                }
                if (str5 != null) {
                    str4 = str5 + "_Day" + num4 + "_" + str6 + "_Circle";
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM44101d3 = AbstractC15676d.m44101d(c2314t, str4);
                C13825t c13825tM48880a3 = AbstractC17269i.m48880a((float) 1.5d, jM53363d);
                C33252i c33252i3 = AbstractC33253j.f138651a;
                f13 = 4;
                z13 = true;
                Modifier modifierM44112a3 = AbstractC15680h.m44112a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3419p(8 * f13, AbstractC15751g.m44456i(c13825tM48880a3.f49345a, modifierM44101d3, c13825tM48880a3.f49346b, c33252i3)), c33252i3), neutral15, AbstractC17918w0.f69621a), true);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM44112a3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                if (state.getIcon() != null) {
                    c28655q.m87150e0(-284996157);
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(state.getIcon().toWhoopIcon(), c28655q, 6), AbstractC8693b.m21275i("null", c28655q, 6), AbstractC1102d.m3419p(3 * f13, c2314t), jM53363d2, c28655q, 384, 0);
                    c28655q.m87173q(false);
                    num4 = num4;
                } else {
                    j7 = jM53363d2;
                    if (state.getNumber() != null) {
                        c28655q.m87150e0(-284695860);
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(state.getNumber(), c28655q, TextResource.$stable), null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getN8(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-284536985);
                        c28655q.m87173q(false);
                    }
                    z13 = true;
                }
                c28655q.m87173q(z13);
                String str9 = str5;
                num3 = num4;
                str3 = str9;
            } else {
                c28655q.m87138X();
                str3 = str2;
                num3 = num2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C40103n(state, str3, num3, i13, i14, 15);
            }
        }
        i15 |= 384;
        num2 = num;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            str4 = null;
            if (i18 != 0) {
                str5 = null;
            } else {
                str5 = str2;
            }
            if (i16 != 0) {
                num4 = null;
            } else {
                num4 = num2;
            }
            if (state.getIsSelected()) {
                c28655q.m87150e0(794791498);
                neutral15 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getNeutral15();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(794792172);
                c28655q.m87173q(false);
                neutral15 = C17919x.f69636m;
            }
            if (state.getIsSelected()) {
                c28655q.m87150e0(794794537);
                jM53363d = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getRecovery();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(794795560);
                jM53363d = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            }
            if (state.getIsSelected()) {
                c28655q.m87150e0(794797835);
                jM53363d2 = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            } else {
                c28655q.m87150e0(794798920);
                jM53363d2 = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            }
            if (state.getIsSelected()) {
                str6 = "Logged";
            } else {
                str6 = "NotLogged";
            }
            if (str5 != null) {
                str4 = str5 + "_Day" + num4 + "_" + str6 + "_Circle";
            }
            c2314t = C2314t.f9131w;
            Modifier modifierM44101d4 = AbstractC15676d.m44101d(c2314t, str4);
            C13825t c13825tM48880a4 = AbstractC17269i.m48880a((float) 1.5d, jM53363d);
            C33252i c33252i4 = AbstractC33253j.f138651a;
            f13 = 4;
            z13 = true;
            Modifier modifierM44112a4 = AbstractC15680h.m44112a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3419p(8 * f13, AbstractC15751g.m44456i(c13825tM48880a4.f49345a, modifierM44101d4, c13825tM48880a4.f49346b, c33252i4)), c33252i4), neutral15, AbstractC17918w0.f69621a), true);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM44112a4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            if (state.getIcon() != null) {
                c28655q.m87150e0(-284996157);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(state.getIcon().toWhoopIcon(), c28655q, 6), AbstractC8693b.m21275i("null", c28655q, 6), AbstractC1102d.m3419p(3 * f13, c2314t), jM53363d2, c28655q, 384, 0);
                c28655q.m87173q(false);
                num4 = num4;
            } else {
                j7 = jM53363d2;
                if (state.getNumber() != null) {
                    c28655q.m87150e0(-284695860);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(state.getNumber(), c28655q, TextResource.$stable), null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getN8(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-284536985);
                    c28655q.m87173q(false);
                }
                z13 = true;
            }
            c28655q.m87173q(z13);
            String str10 = str5;
            num3 = num4;
            str3 = str10;
        } else {
            c28655q.m87138X();
            str3 = str2;
            num3 = num2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40103n(state, str3, num3, i13, i14, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m133633h(C41143l c41143l, String str, Integer num, int i13, int i14, Composer composer, int i15) {
        m133632g(c41143l, str, num, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
