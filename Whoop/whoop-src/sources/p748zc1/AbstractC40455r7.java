package p748zc1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.EnumC2888c;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.models.GenericInteraction;
import gz0.EnumC16313m0;
import i91.AbstractC18247a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.C21166s;
import j02.C21173v0;
import java.util.ArrayList;
import l81.AbstractC23449d;
import l81.C23450e;
import l83.C23454a0;
import ny0.C27256h;
import ny0.EnumC27243c;
import ny0.EnumC27272p;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p698au1.C2059d;
import p712j91.InterfaceC21430b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: zc1.r7 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a)\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\f\u0010\u000b\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0013"}, m65681d2 = {"", "title", "Lny0/h;", "k", "(Ljava/lang/String;)Lny0/h;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "Ll83/a0;", "onBack", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "e", "Ll81/e;", "a", "Ll81/e;", "splitColumnSpaceBetweenSample", "b", "splitColumnScrollableSample", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40455r7 {

    /* JADX INFO: renamed from: a */
    private static final C23450e f174410a = new C23450e(AbstractC37056f.m118959K(m130783k("Welcome"), m130783k("Set up your profile"), m130783k("Review your goals")), AbstractC37056f.m118958J(m130783k("Continue")), null, null, 12, null);

    /* JADX INFO: renamed from: b */
    private static final C23450e f174411b;

    static {
        ArrayList arrayList = new ArrayList(40);
        int i13 = 0;
        while (i13 < 40) {
            i13++;
            arrayList.add(m130783k(AbstractC2875y.m8295h(i13, "Item ")));
        }
        f174411b = new C23450e(arrayList, AbstractC37056f.m118958J(m130783k("Continue")), null, null, 12, null);
    }

    /* JADX INFO: renamed from: e */
    public static final void m130777e(Modifier modifier, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q;
        Modifier modifier2;
        InterfaceC4339a interfaceC4339a2;
        InterfaceC4339a interfaceC4339a3;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(739886322);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            Modifier modifier3 = i16 != 0 ? C2314t.f9131w : modifier;
            if (i17 != 0) {
                Object objM87133R = c28655q2.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C40348h6(21);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC4339a3 = (InterfaceC4339a) objM87133R;
            } else {
                interfaceC4339a3 = interfaceC4339a;
            }
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, modifier3);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3407d);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            c28655q = c28655q2;
            InterfaceC4339a interfaceC4339a4 = interfaceC4339a3;
            AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Split Column - Scrollable")), null, interfaceC4339a4, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 << 6) & 7168), 53);
            C23450e c23450e = f174411b;
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC23449d.m68017h(c23450e, AbstractC38963t7.m124374d(1.0f, 1.0f, true), null, c28655q, C23450e.f92911e, 4);
            c28655q.m87173q(true);
            interfaceC4339a2 = interfaceC4339a4;
            modifier2 = modifier3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier2 = modifier;
            interfaceC4339a2 = interfaceC4339a;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2059d(modifier2, interfaceC4339a2, i13, i14, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m130778f() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m130779g(Modifier modifier, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m130777e(modifier, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public static final void m130780h(Modifier modifier, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q;
        Modifier modifier2;
        InterfaceC4339a interfaceC4339a2;
        InterfaceC4339a interfaceC4339a3;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1468785623);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            Modifier modifier3 = i16 != 0 ? C2314t.f9131w : modifier;
            if (i17 != 0) {
                Object objM87133R = c28655q2.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C40348h6(22);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC4339a3 = (InterfaceC4339a) objM87133R;
            } else {
                interfaceC4339a3 = interfaceC4339a;
            }
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, modifier3);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3407d);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            c28655q = c28655q2;
            InterfaceC4339a interfaceC4339a4 = interfaceC4339a3;
            AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Split Column - Space Between")), null, interfaceC4339a4, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 << 6) & 7168), 53);
            C23450e c23450e = f174410a;
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC23449d.m68017h(c23450e, AbstractC38963t7.m124374d(1.0f, 1.0f, true), null, c28655q, C23450e.f92911e, 4);
            c28655q.m87173q(true);
            interfaceC4339a2 = interfaceC4339a4;
            modifier2 = modifier3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier2 = modifier;
            interfaceC4339a2 = interfaceC4339a;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2059d(modifier2, interfaceC4339a2, i13, i14, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m130781i() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m130782j(Modifier modifier, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m130780h(modifier, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    private static final C27256h m130783k(String str) {
        AppScreen appScreen = null;
        NavigationScreenModel navigationScreenModel = null;
        C21173v0 c21173v0 = null;
        EnumC16313m0 enumC16313m0 = null;
        AbstractC18247a abstractC18247a = null;
        EnumC39333f enumC39333f = null;
        String str2 = null;
        String str3 = null;
        EnumC2888c enumC2888c = null;
        boolean z4 = false;
        boolean z13 = false;
        String str4 = null;
        boolean z14 = false;
        boolean z15 = false;
        AbstractC18247a abstractC18247a2 = null;
        Object obj = null;
        C21166s c21166s = null;
        EnumC27243c enumC27243c = null;
        GenericInteraction genericInteraction = null;
        InterfaceC21430b interfaceC21430b = null;
        AbstractC18247a abstractC18247a3 = null;
        Object[] objArr = 0 == true ? 1 : 0;
        return new C27256h(AbstractC8693b.m21278l(str), enumC16313m0, abstractC18247a, enumC39333f, str2, str3, EnumC27272p.DEFAULT, new C9598e(appScreen, navigationScreenModel, c21173v0, 7, null), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, enumC2888c, objArr, z4, z13, str4, z14, z15, abstractC18247a2, obj, c21166s, enumC27243c, genericInteraction, interfaceC21430b, abstractC18247a3, 33546044, null);
    }
}
