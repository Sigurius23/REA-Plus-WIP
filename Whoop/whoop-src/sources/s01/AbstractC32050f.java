package s01;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import d13.AbstractC11478a;
import gb1.AbstractC15673b0;
import gb1.AbstractC15676d;
import gb1.AbstractC15693u;
import ge3.AbstractC15751g;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l83.C23454a0;
import m83.AbstractC25267u;
import ny0.AbstractC27282u;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p134f2.C14015d;
import p134f2.C14018g;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17916v0;
import p208i2.C17919x;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33248e;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p730qt2.C30599e;
import q63.AbstractC30007c;
import q81.C30047e;
import q81.C30048f;
import qb0.C30179a;
import qz0.AbstractC30795n;
import rm2.C31604d;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: s01.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\"\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0017\u0010!\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001d\"\u0017\u0010$\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001d\"\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006¢\u0006\f\n\u0004\b%\u0010\u0013\u001a\u0004\b&\u0010'¨\u0006)"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ls01/d;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "k", "(Landroidx/compose/ui/Modifier;Ls01/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "s", "(Landroidx/compose/ui/Modifier;Ls01/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "n", "(Landroidx/compose/ui/Modifier;Ls01/d;Landroidx/compose/runtime/Composer;I)V", "p", "(Landroidx/compose/runtime/Composer;I)V", "", "Li2/x;", "a", "Ljava/util/List;", "aiGradientSemiTransparent", "Li2/t;", "b", "Li2/t;", "aiGradientBorderBrush", "Lcom/whoop/design/util/TextResource;", "c", "Lcom/whoop/design/util/TextResource;", "getSampleVow", "()Lcom/whoop/design/util/TextResource;", "sampleVow", "d", "getSampleVowCopyChange", "sampleVowCopyChange", "e", "getSampleEntryText", "sampleEntryText", "f", "getSampleWhoopCoachVowStates", "()Ljava/util/List;", "sampleWhoopCoachVowStates", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32050f {

    /* JADX INFO: renamed from: a */
    private static final List<C17919x> f132933a;

    /* JADX INFO: renamed from: b */
    private static final AbstractC17911t f132934b;

    /* JADX INFO: renamed from: c */
    private static final TextResource f132935c;

    /* JADX INFO: renamed from: d */
    private static final TextResource f132936d;

    /* JADX INFO: renamed from: e */
    private static final TextResource f132937e;

    /* JADX INFO: renamed from: f */
    private static final List<C32048d> f132938f;

    /* JADX INFO: renamed from: s01.f$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f132939a;

        static {
            int[] iArr = new int[EnumC32047c.values().length];
            try {
                iArr[EnumC32047c.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC32047c.COACH_GRADIENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC32047c.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f132939a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List<C17919x> listM44049m = AbstractC15673b0.m44049m();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM44049m, 10));
        Iterator<T> it = listM44049m.iterator();
        while (it.hasNext()) {
            arrayList.add(new C17919x(C17919x.m51541c(0.5f, ((C17919x) it.next()).f69639a)));
        }
        f132933a = arrayList;
        f132934b = AbstractC15693u.m44155b(AbstractC17911t.f69612b, arrayList, null, 0, 315.0f, false, 22, null);
        TextResource textResourceM21278l = AbstractC8693b.m21278l("Spending 23 minutes in your highest heart rate zones made this sparring session too strenuous to help your body recover.");
        f132935c = textResourceM21278l;
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("On nights where you get at least 7 hours of sleep, you see increased Sleep Performance and a 10% boost to your Recovery. Try going to bed by 10pm to make sure you hit your mark.");
        f132936d = textResourceM21278l2;
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l("Learn more in WHOOP Coach");
        f132937e = textResourceM21278l3;
        int i13 = 124;
        EnumC16313m0 enumC16313m0 = null;
        String str = null;
        C9598e c9598e = null;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        f132938f = AbstractC37056f.m118959K(new C32048d(textResourceM21278l, textResourceM21278l3, enumC16313m0, str, c9598e, null, null, i13, null), new C32048d(textResourceM21278l, AbstractC8693b.m21267a(), enumC16313m0, str, c9598e, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i13, 0 == true ? 1 : 0), new C32048d(textResourceM21278l2, AbstractC11478a.m30853e(Locale.ROOT, "Learn more with Coach", "toUpperCase(...)"), EnumC16313m0.ARROW_FORWARD, objArr3, objArr, null, objArr2, 120, null));
    }

    /* JADX INFO: renamed from: k */
    public static final void m99607k(Modifier modifier, C32048d state, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        Function1 function2;
        Function1 function3;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(344490512);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(state) : c28655q.m87157i(state) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            Modifier modifier3 = i16 != 0 ? C2314t.f9131w : modifier;
            if (i17 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C31604d(23);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            if (AbstractC8693b.m21270d(state.getEntryText())) {
                c28655q.m87150e0(2040127726);
                m99615s(modifier3, state, function3, c28655q, (i15 & 896) | (i15 & 14) | (C9598e.f28134d << 3) | (i15 & 112));
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(2040200669);
                m99610n(modifier3, state, c28655q, (i15 & 112) | (i15 & 14) | (C9598e.f28134d << 3));
                c28655q.m87173q(false);
            }
            modifier2 = modifier3;
            function2 = function3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30179a(i13, i14, 24, modifier2, state, function2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m99608l(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m99609m(Modifier modifier, C32048d c32048d, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m99607k(modifier, c32048d, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final void m99610n(Modifier modifier, C32048d c32048d, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-879035026);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q2.m87153g(c32048d) : c28655q2.m87157i(c32048d) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            String strM21274h = AbstractC8693b.m21274h(c32048d.getVow(), c28655q2, 0);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier);
            C38072d c38072d = C38072d.f163053a;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(strM21274h, modifierM3409f, c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getB1(), null, c28655q, 0, 0, 196600);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30047e(modifier, (InterfaceC25312u) c32048d, i13, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m99611o(Modifier modifier, C32048d c32048d, int i13, Composer composer, int i14) {
        m99610n(modifier, c32048d, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    public static final void m99612p(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(437997908);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(8, AbstractC1102d.m3421r(AbstractC15673b0.m44008S(c2314t), 400, 1200));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            c28655q.m87150e0(2122326759);
            int i14 = 0;
            for (Object obj : f132938f) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C32048d c32048d = (C32048d) obj;
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C31604d(26);
                    c28655q.m87172p0(objM87133R);
                }
                m99607k(c2314t, c32048d, (Function1) objM87133R, c28655q, (C9598e.f28134d << 3) | 390, 0);
                if (i14 < f132938f.size()) {
                    c28655q.m87150e0(-570794162);
                    AbstractC30007c.m91851u(c2314t, 20, c28655q, false);
                } else {
                    c28655q.m87150e0(-514721006);
                    c28655q.m87173q(false);
                }
                i14 = i15;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30048f(i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m99613q(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m99614r(int i13, Composer composer, int i14) {
        m99612p(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
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
    /* JADX INFO: renamed from: s */
    private static final void m99615s(Modifier modifier, C32048d c32048d, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        int i15;
        Modifier modifierM44456i;
        Modifier modifierM3358c;
        C0209i c0209i;
        C0209i c0209i2;
        ?? r10;
        int i16;
        Object obj;
        C0209i c0209i3;
        C2314t c2314t;
        InterfaceC4339a interfaceC4339a;
        C28655q c28655q2;
        C2886a c2886aM8430k;
        C38072d c38072d;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(1785987270);
        if ((i13 & 6) == 0) {
            i14 = (c28655q3.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q3.m87153g(c32048d) : c28655q3.m87157i(c32048d) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q3.m87157i(function1) ? 256 : 128;
        }
        if (c28655q3.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Object objM87133R = c28655q3.m87133R();
            Object obj2 = C28635l.f115821a;
            if (objM87133R == obj2) {
                C33248e c33248e = new C33248e(12);
                C33252i c33252i = AbstractC33253j.f138651a;
                objM87133R = new C33252i(c33248e, c33248e, c33248e, c33248e);
                c28655q3.m87172p0(objM87133R);
            }
            C33252i c33252i2 = (C33252i) objM87133R;
            EnumC32047c enumC32047cM99595h = c32048d.getStyle();
            int[] iArr = a.f132939a;
            int i17 = iArr[enumC32047cM99595h.ordinal()];
            C2314t c2314t2 = C2314t.f9131w;
            if (i17 != 1) {
                if (i17 == 2) {
                    c28655q3.m87150e0(-1653139446);
                    c28655q3.m87173q(false);
                    modifierM44456i = AbstractC15751g.m44456i((float) 1.5d, c2314t2, AbstractC15673b0.m43972A(), c33252i2);
                } else {
                    if (i17 != 3) {
                        throw AbstractC11895b.m32003v(-1653145150, c28655q3, false);
                    }
                    c28655q3.m87150e0(-1653135825);
                    modifierM44456i = AbstractC15751g.m44455h(c2314t2, (float) 1.5d, C38072d.f163053a.m121949b(c28655q3, 6).getRecovery(), c33252i2);
                    c28655q3.m87173q(false);
                }
                i15 = 1;
            } else {
                c28655q3.m87150e0(-1653143320);
                c28655q3.m87173q(false);
                i15 = 1;
                modifierM44456i = AbstractC15751g.m44456i(1, c2314t2, f132934b, c33252i2);
            }
            int i18 = iArr[c32048d.getStyle().ordinal()];
            C17916v0 c17916v0 = AbstractC17918w0.f69621a;
            if (i18 == i15) {
                c28655q3.m87150e0(-1653130217);
                modifierM3358c = AbstractC1092a.m3358c(c2314t2, C38072d.f163053a.m121949b(c28655q3, 6).getTransparent(), c17916v0);
                c28655q3.m87173q(false);
            } else if (i18 == 2) {
                c28655q3.m87150e0(-1653126889);
                c28655q3.m87173q(false);
                modifierM3358c = AbstractC1092a.m3357b(c2314t2, AbstractC15673b0.m44002P(), null, 0.0f, 6);
            } else {
                if (i18 != 3) {
                    throw AbstractC11895b.m32003v(-1653132091, c28655q3, false);
                }
                c28655q3.m87150e0(-1653123882);
                modifierM3358c = AbstractC1092a.m3358c(c2314t2, C38072d.f163053a.m121949b(c28655q3, 6).getRecovery10(), c17916v0);
                c28655q3.m87173q(false);
            }
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier);
            boolean z4 = ((i14 & 112) == 32 || ((i14 & 64) != 0 && c28655q3.m87157i(c32048d))) | ((i14 & 896) == 256);
            Object objM87133R2 = c28655q3.m87133R();
            int i19 = 25;
            if (z4 || objM87133R2 == obj2) {
                objM87133R2 = new C30599e(i19, function1, c32048d);
                c28655q3.m87172p0(objM87133R2);
            }
            Modifier modifierMo3471e = AbstractC37056f.m118994r(AbstractC1092a.m3362g(modifierM3409f, false, null, null, (InterfaceC4339a) objM87133R2, 15), c33252i2).mo3471e(modifierM44456i).mo3471e(modifierM3358c);
            float f13 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f13, modifierMo3471e);
            float f14 = 1 * f13;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9110M, c28655q3, 6);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a2 = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a2);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i4 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i4, c23010xM66775a);
            C0209i c0209i5 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m);
            C0209i c0209i6 = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i6);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i7, modifierM118962N);
            TextResource textResourceM99593f = c32048d.getHeader();
            if (textResourceM99593f == null) {
                c28655q3.m87150e0(-1608712063);
                c28655q3.m87173q(false);
                c0209i = c0209i7;
                r10 = 0;
                i16 = 6;
                obj = obj2;
                c0209i2 = c0209i6;
                interfaceC4339a = interfaceC4339a2;
                c0209i3 = c0209i4;
                c2314t = c2314t2;
                c28655q2 = c28655q3;
            } else {
                c28655q3.m87150e0(-1608712062);
                String strM21274h = AbstractC8693b.m21274h(textResourceM99593f, c28655q3, 0);
                C38072d c38072d2 = C38072d.f163053a;
                c0209i = c0209i7;
                c0209i2 = c0209i6;
                r10 = 0;
                i16 = 6;
                obj = obj2;
                c0209i3 = c0209i4;
                c2314t = c2314t2;
                interfaceC4339a = interfaceC4339a2;
                AbstractC30795n.m94707h(strM21274h, null, c38072d2.m121949b(c28655q3, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q3, 6).getB1(), null, c28655q3, 0, 0, 196602);
                C28655q c28655q4 = c28655q3;
                c28655q4.m87173q(false);
                c28655q2 = c28655q4;
            }
            String strM21274h2 = AbstractC8693b.m21274h(c32048d.getVow(), c28655q2, r10);
            C38072d c38072d3 = C38072d.f163053a;
            C2886a c2886aM8420a = c38072d3.m121952e(c28655q2, i16).getB1();
            long jM73366B = c32048d.getStyle() == EnumC32047c.NORMAL ? AbstractC25012a.m73366B(c28655q2, 1610686342, c38072d3, c28655q2, i16) : AbstractC25012a.m73370c(c28655q2, 1610687427, c38072d3, c28655q2, i16);
            c28655q2.m87173q(r10);
            C28655q c28655q5 = c28655q2;
            AbstractC30795n.m94707h(strM21274h2, null, jM73366B, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q5, 0, 0, 196602);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q5, 48);
            int iHashCode2 = Long.hashCode(c28655q5.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q5.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q5, c2314t);
            c28655q5.m87158i0();
            if (c28655q5.f115903S) {
                c28655q5.m87163l(interfaceC4339a);
            } else {
                c28655q5.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q5, c0209i3, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q5, c0209i5, interfaceC28653p1M87165m2);
            if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q5, c0209i, modifierM118962N2);
            String strM21274h3 = AbstractC8693b.m21274h(c32048d.getEntryText(), c28655q5, r10);
            boolean z13 = c32048d.getStyle() != EnumC32047c.INFO ? 1 : r10;
            Object objM87133R3 = c28655q5.m87133R();
            Object obj3 = obj;
            if (objM87133R3 == obj3) {
                objM87133R3 = new C31604d(24);
                c28655q5.m87172p0(objM87133R3);
            }
            Modifier modifierM44099b = AbstractC15676d.m44099b(c2314t, z13, (Function1) objM87133R3);
            if (c32048d.getIcon() == null) {
                c28655q5.m87150e0(389423554);
                C38072d c38072d4 = c38072d3;
                c2886aM8430k = c38072d4.m121952e(c28655q5, i16).getB1();
                c38072d = c38072d4;
            } else {
                C38072d c38072d5 = c38072d3;
                c28655q5.m87150e0(389424515);
                c2886aM8430k = c38072d5.m121952e(c28655q5, i16).getBtS();
                c38072d = c38072d5;
            }
            c28655q5.m87173q(r10);
            AbstractC30795n.m94707h(strM21274h3, modifierM44099b, c38072d.m121949b(c28655q5, i16).getRecovery(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8430k, null, c28655q5, 0, 0, 196600);
            C28655q c28655q6 = c28655q5;
            EnumC16313m0 enumC16313m0M99594g = c32048d.getIcon();
            if (enumC16313m0M99594g == null) {
                c28655q6.m87150e0(-812624308);
                c28655q6.m87173q(r10);
            } else {
                c28655q6.m87150e0(-812624307);
                float f15 = 4;
                Modifier modifierM3488c = AbstractC1127a.m3488c(AbstractC1102d.m3419p(f15 * f15, AbstractC1099a.m3398t(c2314t, f14, 0.0f, 0.0f, 0.0f, 14)), 0.0f, 0.0f, 0.99f, 0.0f, 0.0f, 0.0f, null, null, 0, 524283);
                Object objM87133R4 = c28655q6.m87133R();
                if (objM87133R4 == obj3) {
                    objM87133R4 = new C31604d(25);
                    c28655q6.m87172p0(objM87133R4);
                }
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m0M99594g.toWhoopIcon(), c28655q6, i16), null, AbstractC1125a.m3479b(modifierM3488c, (Function1) objM87133R4), 0L, c28655q6, 48, 8);
                c28655q6.m87173q(r10);
            }
            c28655q6.m87173q(true);
            c28655q6.m87173q(true);
            c28655q = c28655q6;
        } else {
            c28655q3.m87138X();
            c28655q = c28655q3;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32049e(modifier, c32048d, function1, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m99616t(Function1 function1, C32048d c32048d) {
        function1.invoke(c32048d);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final Modifier m99617u(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC27282u.m82299o(C2314t.f9131w, AbstractC15673b0.m43972A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C14018g m99618v(C14015d drawWithCache) {
        AbstractC22676k.m65750j(drawWithCache, "$this$drawWithCache");
        return drawWithCache.m39910a(new C31604d(27));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m99619w(InterfaceC22129c onDrawWithContent) {
        AbstractC22676k.m65750j(onDrawWithContent, "$this$onDrawWithContent");
        ((C0238p0) onDrawWithContent).m728a();
        InterfaceC22131e.m63385u(onDrawWithContent, AbstractC15673b0.m43972A(), 0L, 0L, 0.0f, null, 9, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m99620x(Modifier modifier, C32048d c32048d, Function1 function1, int i13, Composer composer, int i14) {
        m99615s(modifier, c32048d, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
