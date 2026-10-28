package p736sz0;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.EnumC2888c;
import c13.AbstractC3855a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import dp0.C12253i;
import e93.AbstractC12889b;
import fy1.C14873i;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import iz0.AbstractC21048g;
import iz0.C21053l;
import j50.C21330b;
import java.io.IOException;
import java.util.ArrayList;
import l31.AbstractC23317k;
import l83.C23454a0;
import m83.C25235a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27282u;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p355o2.C27430e;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import q81.C30048f;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: sz0.b0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a?\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lsz0/c0;", "state", "", "maxLines", "minLines", "Lv63/c;", "overflow", "Ll83/a0;", "d", "(Landroidx/compose/ui/Modifier;Lsz0/c0;IIILandroidx/compose/runtime/Composer;II)V", "Lgz0/m0;", "icon", "e", "(Lgz0/m0;Landroidx/compose/runtime/Composer;I)V", "g", "(Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33166b0 {

    /* JADX INFO: renamed from: sz0.b0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f138309w = new a();

        /* JADX INFO: renamed from: a */
        public final long m105059a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite70();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m105059a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: sz0.b0$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC4351m {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public final void m105060a(Composer composer, int i13) throws XmlPullParserException, IOException {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(394506239);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            AbstractC33166b0.m105053d(null, AbstractC23317k.m67504b(), 0, 0, 0, c28655q, 48, 29);
            AbstractC33166b0.m105053d(null, AbstractC23317k.m67506d(), 0, 0, 0, c28655q, 48, 29);
            AbstractC33166b0.m105053d(null, AbstractC23317k.m67505c(), 0, 0, 0, c28655q, 48, 29);
            AbstractC33166b0.m105053d(null, AbstractC23317k.m67503a(), 0, 0, 0, c28655q, 48, 29);
            EnumC2888c enumC2888c = EnumC2888c.B2;
            EnumC39333f enumC39333f = EnumC39333f.WHITE_70;
            AbstractC33166b0.m105053d(null, new C33169c0("73 biomarkers tested", enumC2888c, enumC39333f, 5, EnumC16313m0.EDUCATION, null, null, null, false, null, 992, null), 0, 0, 0, c28655q, 0, 29);
            AbstractC33166b0.m105053d(null, new C33169c0("Only visible to you", EnumC2888c.B4, enumC39333f, 5, EnumC16313m0.SCORE_HIDDEN, null, 0 == true ? 1 : 0, null, false, EnumC33232y.LEADING, 224, null), 0, 0, 0, c28655q, 0, 29);
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws XmlPullParserException, IOException {
            m105060a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0126  */
    /* JADX WARN: Code duplicated, block: B:108:0x0128  */
    /* JADX WARN: Code duplicated, block: B:112:0x013b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0148  */
    /* JADX WARN: Code duplicated, block: B:118:0x0151  */
    /* JADX WARN: Code duplicated, block: B:119:0x0156  */
    /* JADX WARN: Code duplicated, block: B:122:0x017f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0183  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:132:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:135:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:138:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:140:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:145:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:152:0x0217  */
    /* JADX WARN: Code duplicated, block: B:155:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:156:0x02ca  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: d */
    public static final void m105053d(Modifier modifier, final C33169c0 state, int i13, int i14, int i15, Composer composer, final int i16, final int i17) throws XmlPullParserException, IOException {
        Modifier modifier2;
        int i18;
        int i19;
        int iIntValue;
        int i24;
        final Modifier modifier3;
        C28655q c28655q;
        final int i25;
        final int i26;
        final int i27;
        int iIntValue2;
        int i28;
        int i29;
        int i34;
        int i35;
        EnumC16313m0 enumC16313m0M105076h;
        Modifier modifierM3409f;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z4;
        Modifier layoutWeightElement;
        AbstractC17911t abstractC17911tM105074f;
        Modifier modifierM82299o;
        boolean z13;
        EnumC16313m0 enumC16313m0;
        boolean z14;
        int i36;
        int i37;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(605661418);
        int i38 = i17 & 1;
        int i39 = 2;
        if (i38 != 0) {
            i18 = i16 | 6;
            modifier2 = modifier;
        } else if ((i16 & 6) == 0) {
            modifier2 = modifier;
            i18 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i16;
        } else {
            modifier2 = modifier;
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            i18 |= c28655q2.m87153g(state) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            if ((i17 & 4) == 0) {
                i19 = i13;
                int i44 = c28655q2.m87149e(i19) ? 256 : 128;
                i18 |= i44;
            } else {
                i19 = i13;
            }
            i18 |= i44;
        } else {
            i19 = i13;
        }
        if ((i16 & 3072) == 0) {
            if ((i17 & 8) == 0) {
                iIntValue = i14;
                if (c28655q2.m87149e(iIntValue)) {
                    i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i18 |= i37;
            } else {
                iIntValue = i14;
            }
            i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i18 |= i37;
        } else {
            iIntValue = i14;
        }
        if ((i16 & 24576) == 0) {
            if ((i17 & 16) == 0) {
                i24 = i15;
                if (c28655q2.m87149e(i24)) {
                    i36 = DfuBaseService.ERROR_CONNECTION_MASK;
                }
                i18 |= i36;
            } else {
                i24 = i15;
            }
            i36 = DfuBaseService.ERROR_REMOTE_MASK;
            i18 |= i36;
        } else {
            i24 = i15;
        }
        if (c28655q2.m87135U(i18 & 1, (i18 & 9363) != 9362)) {
            c28655q2.m87140Z();
            int i45 = i16 & 1;
            C2314t c2314t = C2314t.f9131w;
            if (i45 == 0 || c28655q2.m87118C()) {
                if (i38 != 0) {
                    modifier2 = c2314t;
                }
                if ((i17 & 4) != 0) {
                    Integer numM105078j = state.getMaxLines();
                    if (numM105078j != null) {
                        iIntValue2 = numM105078j.intValue();
                    } else {
                        iIntValue2 = state.getIcon() != null ? 1 : Integer.MAX_VALUE;
                    }
                    i18 &= -897;
                } else {
                    iIntValue2 = i19;
                }
                if ((i17 & 8) != 0) {
                    Integer numM105079k = state.getMinLines();
                    i18 &= -7169;
                    iIntValue = numM105079k != null ? numM105079k.intValue() : 1;
                }
                if ((i17 & 16) != 0) {
                    if (state.getMaxLines() == null && state.getIcon() == null) {
                        i39 = 1;
                    }
                    i28 = i18 & (-57345);
                    i29 = i39;
                    i34 = iIntValue;
                } else {
                    i28 = i18;
                }
                c28655q2.m87175r();
                if (iIntValue2 < 1) {
                    i35 = 1;
                } else {
                    i35 = iIntValue2;
                }
                int iM36284n = AbstractC12889b.m36284n(i34, 1, i35);
                enumC16313m0M105076h = state.getIcon();
                if (state.getIconPosition() != EnumC33232y.LEADING) {
                    enumC16313m0M105076h = null;
                }
                EnumC16313m0 enumC16313m0M105076h2 = state.getIconPosition() == EnumC33232y.TRAILING ? state.getIcon() : null;
                if (state.getFillWidth()) {
                    modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier2);
                } else {
                    modifierM3409f = modifier2;
                }
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q2, 48);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                int i46 = iIntValue2;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                if (enumC16313m0M105076h == null) {
                    c28655q2.m87150e0(556258568);
                    c28655q2.m87173q(false);
                    z4 = true;
                } else {
                    c28655q2.m87150e0(556258569);
                    m105054e(enumC16313m0M105076h, c28655q2, 0);
                    z4 = true;
                    AbstractC18489d0.m53381v(1, 8, c2314t, c28655q2, false);
                }
                if (state.getFillWidth()) {
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    layoutWeightElement = new LayoutWeightElement(1.0f, false);
                } else {
                    layoutWeightElement = c2314t;
                }
                abstractC17911tM105074f = state.getColorBrush();
                if (abstractC17911tM105074f != null || (modifierM82299o = AbstractC27282u.m82299o(c2314t, abstractC17911tM105074f)) == null) {
                    modifierM82299o = c2314t;
                }
                Modifier modifierMo3471e = layoutWeightElement.mo3471e(modifierM82299o);
                String strM21274h = AbstractC8693b.m21274h(AbstractC8693b.m21278l(state.getText()), c28655q2, 0);
                if (state.getIcon() == null || !state.getFillWidth()) {
                    z13 = false;
                } else {
                    z13 = z4;
                }
                enumC16313m0 = enumC16313m0M105076h2;
                int i47 = i29;
                AbstractC21048g.m58807M(strM21274h, modifierMo3471e, z13, C21053l.f79834a.m58880a(C23285v0.m67364b(EnumC2888c.INSTANCE.m8402a(state.getStyle()).getStyle(), 0L, 0L, null, null, 0L, state.getAlignment(), 0L, null, null, 16744447), state.getColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q2, 0, ProfileVerifier.CompilationStatus.f6515xf2722a21, 32764), null, i35, iM36284n, i47, false, c28655q2, (i28 << 9) & 29360128, 272);
                if (enumC16313m0 == null) {
                    c28655q2.m87150e0(557072008);
                    c28655q2.m87173q(false);
                    z14 = true;
                } else {
                    c28655q2.m87150e0(557072009);
                    z14 = true;
                    AbstractC38963t7.m124386p(1, 8, c2314t, c28655q2);
                    m105054e(enumC16313m0, c28655q2, 0);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(z14);
                modifier3 = modifier2;
                c28655q = c28655q2;
                i27 = i47;
                i26 = i34;
                i25 = i46;
            } else {
                c28655q2.m87138X();
                if ((i17 & 4) != 0) {
                    i18 &= -897;
                }
                if ((i17 & 8) != 0) {
                    i18 &= -7169;
                }
                if ((i17 & 16) != 0) {
                    i18 &= -57345;
                }
                i28 = i18;
                iIntValue2 = i19;
            }
            i34 = iIntValue;
            i29 = i24;
            c28655q2.m87175r();
            if (iIntValue2 < 1) {
                i35 = 1;
            } else {
                i35 = iIntValue2;
            }
            int iM36284n2 = AbstractC12889b.m36284n(i34, 1, i35);
            enumC16313m0M105076h = state.getIcon();
            if (state.getIconPosition() != EnumC33232y.LEADING) {
                enumC16313m0M105076h = null;
            }
            if (state.getIconPosition() == EnumC33232y.TRAILING) {
            }
            if (state.getFillWidth()) {
                modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier2);
            } else {
                modifierM3409f = modifier2;
            }
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q2, 48);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            int i48 = iIntValue2;
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
            if (enumC16313m0M105076h == null) {
                c28655q2.m87150e0(556258568);
                c28655q2.m87173q(false);
                z4 = true;
            } else {
                c28655q2.m87150e0(556258569);
                m105054e(enumC16313m0M105076h, c28655q2, 0);
                z4 = true;
                AbstractC18489d0.m53381v(1, 8, c2314t, c28655q2, false);
            }
            if (state.getFillWidth()) {
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                layoutWeightElement = new LayoutWeightElement(1.0f, false);
            } else {
                layoutWeightElement = c2314t;
            }
            abstractC17911tM105074f = state.getColorBrush();
            if (abstractC17911tM105074f != null) {
                modifierM82299o = c2314t;
            } else {
                modifierM82299o = c2314t;
            }
            Modifier modifierMo3471e2 = layoutWeightElement.mo3471e(modifierM82299o);
            String strM21274h2 = AbstractC8693b.m21274h(AbstractC8693b.m21278l(state.getText()), c28655q2, 0);
            if (state.getIcon() == null) {
                z13 = false;
            } else {
                z13 = false;
            }
            enumC16313m0 = enumC16313m0M105076h2;
            int i49 = i29;
            AbstractC21048g.m58807M(strM21274h2, modifierMo3471e2, z13, C21053l.f79834a.m58880a(C23285v0.m67364b(EnumC2888c.INSTANCE.m8402a(state.getStyle()).getStyle(), 0L, 0L, null, null, 0L, state.getAlignment(), 0L, null, null, 16744447), state.getColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q2, 0, ProfileVerifier.CompilationStatus.f6515xf2722a21, 32764), null, i35, iM36284n2, i49, false, c28655q2, (i28 << 9) & 29360128, 272);
            if (enumC16313m0 == null) {
                c28655q2.m87150e0(557072008);
                c28655q2.m87173q(false);
                z14 = true;
            } else {
                c28655q2.m87150e0(557072009);
                z14 = true;
                AbstractC38963t7.m124386p(1, 8, c2314t, c28655q2);
                m105054e(enumC16313m0, c28655q2, 0);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(z14);
            modifier3 = modifier2;
            c28655q = c28655q2;
            i27 = i49;
            i26 = i34;
            i25 = i48;
        } else {
            c28655q2.m87138X();
            modifier3 = modifier2;
            c28655q = c28655q2;
            i25 = i19;
            i26 = iIntValue;
            i27 = i24;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.a0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue3 = ((Integer) obj2).intValue();
                    return AbstractC33166b0.m105058i(modifier3, state, i25, i26, i27, i16, i17, (Composer) obj, iIntValue3);
                }
            };
        }
    }

    /* JADX INFO: renamed from: e */
    private static final void m105054e(EnumC16313m0 enumC16313m0, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-522269139);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87149e(enumC16313m0.ordinal()) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C27430e c27430eM107874S = AbstractC34132o.m107874S(enumC16313m0.toWhoopIcon(), c28655q, 6);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = a.f138309w;
                c28655q.m87172p0(objM87133R);
            }
            long jMo134584toComposableColorWaAFU9c = p745y81.Function1.m125323a((Function1) objM87133R).mo134584toComposableColorWaAFU9c(c28655q, 0);
            float f13 = 4;
            AbstractC15005f3.m43108b(c27430eM107874S, null, AbstractC1102d.m3419p(f13 * f13, C2314t.f9131w), jMo134584toComposableColorWaAFU9c, c28655q, 432, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21330b(enumC16313m0, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m105055f(EnumC16313m0 enumC16313m0, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m105054e(enumC16313m0, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    public static final void m105056g(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2120943657);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new b()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30048f(i13, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m105057h(int i13, Composer composer, int i14) {
        m105056g(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m105058i(Modifier modifier, C33169c0 c33169c0, int i13, int i14, int i15, int i16, int i17, Composer composer, int i18) throws XmlPullParserException, IOException {
        m105053d(modifier, c33169c0, i13, i14, i15, composer, AbstractC28683x.m87244L(i16 | 1), i17);
        return C23454a0.f92919a;
    }
}
