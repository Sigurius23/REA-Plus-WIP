package s80;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2662y3;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c31.EnumC3921e;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.presentation.edit.C9722a;
import d70.C11748b;
import ge3.AbstractC15751g;
import j80.InterfaceC21413a;
import kd1.AbstractC22403o;
import l83.C23454a0;
import mf0.C25503b;
import ny0.AbstractC27265l0;
import ny0.EnumC27269n0;
import org.joda.time.LocalDate;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p292l1.AbstractC23079d0;
import p292l1.AbstractC23092f1;
import p292l1.C23067b0;
import p292l1.C23104h1;
import p292l1.C23204y;
import p292l1.InterfaceC23098g1;
import p292l1.InterfaceC23142n3;
import p353o0.C27325i;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p392p3.C28780r;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p714k80.AbstractC22288q;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p727py0.C29616a;
import p733ry2.C31918g;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s51.C32205b;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x60.AbstractC38022b;
import x81.C38072d;

/* JADX INFO: renamed from: s80.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0018²\u0006\u000e\u0010\u0015\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00168\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ls80/d;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "j", "(Landroidx/compose/ui/Modifier;Ls80/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ll1/g1;", "state", "Lkotlin/Function0;", "onDismiss", "onDateSelected", "s", "(Ll1/g1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "Ll1/y;", "z", "(Landroidx/compose/runtime/Composer;I)Ll1/y;", "", "showPicker", "", "selectedDate", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32255c {

    /* JADX INFO: renamed from: s80.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.birthday.BirthdayScreenKt$ActivationFlowBirthdayView$1$1", m100430f = "BirthdayScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f133504w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f133505x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f133506y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f133505x = function1;
            this.f133506y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f133505x, this.f133506y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f133504w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f133505x.invoke(AbstractC32255c.m100365m(this.f133506y) != null ? EnumC3921e.ENABLE : EnumC3921e.DISABLE);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: s80.c$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"s80/c$b", "Ll1/n3;", "", "utcTimeMillis", "", "isSelectableDate", "(J)Z", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC23142n3 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C32256d f133507a;

        public b(C32256d c32256d) {
            this.f133507a = c32256d;
        }

        @Override // p292l1.InterfaceC23142n3
        public boolean isSelectableDate(long utcTimeMillis) {
            return utcTimeMillis <= this.f133507a.getMinAgeMillis() && this.f133507a.getMaxAgeMillis() + 1 <= utcTimeMillis;
        }

        @Override // p292l1.InterfaceC23142n3
        public /* bridge */ boolean isSelectableYear(int i13) {
            return true;
        }
    }

    /* JADX INFO: renamed from: s80.c$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f133508w = new c();

        /* JADX INFO: renamed from: a */
        public final long m100379a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandBlack();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m100379a((C39336i) obj));
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:104:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:108:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:110:0x03da  */
    /* JADX WARN: Code duplicated, block: B:64:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:73:0x027b  */
    /* JADX WARN: Code duplicated, block: B:76:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:78:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:83:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x0302  */
    /* JADX WARN: Code duplicated, block: B:91:0x0378  */
    /* JADX WARN: Code duplicated, block: B:93:0x038a  */
    /* JADX WARN: Code duplicated, block: B:94:0x038c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0396  */
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
    /* JADX INFO: renamed from: j */
    public static final void m100362j(Modifier modifier, C32256d viewState, final Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        float f13;
        int iHashCode;
        Object objM87133R;
        int iHashCode2;
        String strM100365m;
        boolean z4;
        boolean z13;
        Object objM87133R2;
        final InterfaceC28601c1 interfaceC28601c1;
        final InterfaceC28601c1 interfaceC28601c2;
        int i16;
        boolean z14;
        boolean z15;
        Object objM87133R3;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1900514057);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        int i18 = i15;
        if (c28655q.m87135U(i18 & 1, (i18 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i17 != 0 ? c2314t : modifier2;
            final C23104h1 c23104h1M67082p = AbstractC23092f1.m67082p(null, Long.valueOf(viewState.getMinAgeMillis()), viewState.getYearRange(), new b(viewState), c28655q, 1);
            Object objM87133R4 = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getShowPickerByDefault()));
                c28655q.m87172p0(objM87133R4);
            }
            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R4;
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87272z(viewState.getBirthdayPrefill());
                c28655q.m87172p0(objM87133R5);
            }
            InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
            String strM100365m2 = m100365m(interfaceC28601c4);
            int i19 = i18 & 896;
            boolean z16 = i19 == 256;
            Object objM87133R6 = c28655q.m87133R();
            if (z16 || objM87133R6 == c28676v0) {
                objM87133R6 = new a(onViewEvent, interfaceC28601c4, null);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, strM100365m2);
            float f14 = 2;
            float f15 = 8;
            float f16 = f14 * f15;
            Modifier modifierMo3471e = AbstractC30060g.m92116f0(AbstractC1099a.m3397s(AbstractC1102d.m3407d(1.0f, AbstractC22953f.m66723l(c2314t)), f16, f16, f16, 13 * f15), AbstractC30060g.m92099U(0, c28655q, 1), 14).mo3471e(modifier4);
            C22957g c22957g = AbstractC22977m.f90653d;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 6);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            Modifier modifier5 = modifier4;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                f13 = f14;
            } else {
                f13 = f14;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                AbstractC22288q.m64032b(viewState.getImage(), viewState.getTitle(), viewState.getSubtitle(), c28655q, AbstractC22403o.f87638a | (TextResource.$stable << 3), 0);
                float f17 = 4;
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, f17 * f15, 0.0f, 0.0f, 13);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                float f18 = 1;
                Modifier modifierM3395q = AbstractC1099a.m3395q(c2314t, f18 * f17, f13 * f17);
                String strM21273g = AbstractC8693b.m21273g(AbstractC38022b.f162890c, c28655q, 0);
                C38072d c38072d = C38072d.f163053a;
                int i24 = C38072d.f163054b;
                C2886a c2886aM8433n = c38072d.m121952e(c28655q, i24).getFormLabelMedium();
                long jM125385c1 = c38072d.m121949b(c28655q, i24).getWhite70();
                C28780r c28780r = C28780r.f116542I;
                int i25 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21273g, modifierM3395q, jM125385c1, 0L, null, c28780r, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8433n, null, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, i25, 196568);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(c2314t, "BIRTHDAY_PICKER_TEST_TAG"));
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C27325i(20, interfaceC28601c3);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3394p = AbstractC1099a.m3394p(f16, AbstractC15751g.m44455h(AbstractC1092a.m3362g(modifierM3409f, false, null, null, (InterfaceC4339a) objM87133R, 15), f18, c38072d.m121949b(c28655q, i24).getWhite10(), AbstractC33253j.m105489e(3 * f17)));
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                strM100365m = m100365m(interfaceC28601c4);
                if (strM100365m == null) {
                    strM100365m = "--";
                }
                AbstractC30795n.m94707h(strM100365m, null, c38072d.m121949b(c28655q, i24).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i24).getB1(), null, c28655q, 0, i25, 196602);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAction().getPencil(), c28655q, 6), "", AbstractC1102d.m3419p(6 * f17, c2314t), c38072d.m121949b(c28655q, i24).getBrandWhite(), c28655q, 432, 0);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                if (m100363k(interfaceC28601c3)) {
                    c28655q.m87150e0(-1128144999);
                    boolean zM87153g = c28655q.m87153g(c23104h1M67082p);
                    if (i19 == 256) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z13 = zM87153g | z4;
                    objM87133R2 = c28655q.m87133R();
                    if (!z13 || objM87133R2 == c28676v0) {
                        final int i26 = 0;
                        interfaceC28601c1 = interfaceC28601c3;
                        interfaceC28601c2 = interfaceC28601c4;
                        i16 = i19;
                        InterfaceC4339a interfaceC4339a = new InterfaceC4339a() { // from class: s80.b
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i26) {
                                    case 0:
                                        return AbstractC32255c.m100368p(c23104h1M67082p, onViewEvent, interfaceC28601c2, interfaceC28601c1);
                                    default:
                                        return AbstractC32255c.m100369q(c23104h1M67082p, onViewEvent, interfaceC28601c2, interfaceC28601c1);
                                }
                            }
                        };
                        c28655q.m87172p0(interfaceC4339a);
                        objM87133R2 = interfaceC4339a;
                    } else {
                        interfaceC28601c1 = interfaceC28601c3;
                        i16 = i19;
                        interfaceC28601c2 = interfaceC28601c4;
                    }
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    boolean zM87153g2 = c28655q.m87153g(c23104h1M67082p);
                    if (i16 == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = zM87153g2 | z14;
                    objM87133R3 = c28655q.m87133R();
                    if (z15 || objM87133R3 == c28676v0) {
                        final int i27 = 1;
                        objM87133R3 = new InterfaceC4339a() { // from class: s80.b
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                switch (i27) {
                                    case 0:
                                        return AbstractC32255c.m100368p(c23104h1M67082p, onViewEvent, interfaceC28601c2, interfaceC28601c1);
                                    default:
                                        return AbstractC32255c.m100369q(c23104h1M67082p, onViewEvent, interfaceC28601c2, interfaceC28601c1);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    }
                    m100371s(c23104h1M67082p, interfaceC4339a2, (InterfaceC4339a) objM87133R3, c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1127170545);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                modifier3 = modifier5;
            }
            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            AbstractC22288q.m64032b(viewState.getImage(), viewState.getTitle(), viewState.getSubtitle(), c28655q, AbstractC22403o.f87638a | (TextResource.$stable << 3), 0);
            float f19 = 4;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, f19 * f15, 0.0f, 0.0f, 13);
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N4);
            float f110 = 1;
            Modifier modifierM3395q2 = AbstractC1099a.m3395q(c2314t, f110 * f19, f13 * f19);
            String strM21273g2 = AbstractC8693b.m21273g(AbstractC38022b.f162890c, c28655q, 0);
            C38072d c38072d2 = C38072d.f163053a;
            int i28 = C38072d.f163054b;
            C2886a c2886aM8433n2 = c38072d2.m121952e(c28655q, i28).getFormLabelMedium();
            long jM125385c2 = c38072d2.m121949b(c28655q, i28).getWhite70();
            C28780r c28780r2 = C28780r.f116542I;
            int i29 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21273g2, modifierM3395q2, jM125385c2, 0L, null, c28780r2, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8433n2, null, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, i29, 196568);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(c2314t, "BIRTHDAY_PICKER_TEST_TAG"));
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = new C27325i(20, interfaceC28601c3);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(f16, AbstractC15751g.m44455h(AbstractC1092a.m3362g(modifierM3409f2, false, null, null, (InterfaceC4339a) objM87133R, 15), f110, c38072d2.m121949b(c28655q, i28).getWhite10(), AbstractC33253j.m105489e(3 * f19)));
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m5);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N5);
            strM100365m = m100365m(interfaceC28601c4);
            if (strM100365m == null) {
                strM100365m = "--";
            }
            AbstractC30795n.m94707h(strM100365m, null, c38072d2.m121949b(c28655q, i28).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i28).getB1(), null, c28655q, 0, i29, 196602);
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d2.m121951d().getAction().getPencil(), c28655q, 6), "", AbstractC1102d.m3419p(6 * f19, c2314t), c38072d2.m121949b(c28655q, i28).getBrandWhite(), c28655q, 432, 0);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            if (m100363k(interfaceC28601c3)) {
                c28655q.m87150e0(-1128144999);
                boolean zM87153g3 = c28655q.m87153g(c23104h1M67082p);
                if (i19 == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z13 = zM87153g3 | z4;
                objM87133R2 = c28655q.m87133R();
                if (z13) {
                    final int i210 = 0;
                    interfaceC28601c1 = interfaceC28601c3;
                    interfaceC28601c2 = interfaceC28601c4;
                    i16 = i19;
                    InterfaceC4339a interfaceC4339a3 = new InterfaceC4339a() { // from class: s80.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i210) {
                                case 0:
                                    return AbstractC32255c.m100368p(c23104h1M67082p, onViewEvent, interfaceC28601c2, interfaceC28601c1);
                                default:
                                    return AbstractC32255c.m100369q(c23104h1M67082p, onViewEvent, interfaceC28601c2, interfaceC28601c1);
                            }
                        }
                    };
                    c28655q.m87172p0(interfaceC4339a3);
                    objM87133R2 = interfaceC4339a3;
                } else {
                    final int i211 = 0;
                    interfaceC28601c1 = interfaceC28601c3;
                    interfaceC28601c2 = interfaceC28601c4;
                    i16 = i19;
                    InterfaceC4339a interfaceC4339a4 = new InterfaceC4339a() { // from class: s80.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i211) {
                                case 0:
                                    return AbstractC32255c.m100368p(c23104h1M67082p, onViewEvent, interfaceC28601c2, interfaceC28601c1);
                                default:
                                    return AbstractC32255c.m100369q(c23104h1M67082p, onViewEvent, interfaceC28601c2, interfaceC28601c1);
                            }
                        }
                    };
                    c28655q.m87172p0(interfaceC4339a4);
                    objM87133R2 = interfaceC4339a4;
                }
                InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                boolean zM87153g4 = c28655q.m87153g(c23104h1M67082p);
                if (i16 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87153g4 | z14;
                objM87133R3 = c28655q.m87133R();
                if (z15) {
                    final int i212 = 1;
                    objM87133R3 = new InterfaceC4339a() { // from class: s80.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i212) {
                                case 0:
                                    return AbstractC32255c.m100368p(c23104h1M67082p, onViewEvent, interfaceC28601c2, interfaceC28601c1);
                                default:
                                    return AbstractC32255c.m100369q(c23104h1M67082p, onViewEvent, interfaceC28601c2, interfaceC28601c1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                } else {
                    final int i213 = 1;
                    objM87133R3 = new InterfaceC4339a() { // from class: s80.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i213) {
                                case 0:
                                    return AbstractC32255c.m100368p(c23104h1M67082p, onViewEvent, interfaceC28601c2, interfaceC28601c1);
                                default:
                                    return AbstractC32255c.m100369q(c23104h1M67082p, onViewEvent, interfaceC28601c2, interfaceC28601c1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                m100371s(c23104h1M67082p, interfaceC4339a5, (InterfaceC4339a) objM87133R3, c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1127170545);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32205b(modifier3, viewState, onViewEvent, i13, i14, 5);
        }
    }

    /* JADX INFO: renamed from: k */
    private static final boolean m100363k(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: l */
    private static final void m100364l(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final String m100365m(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: n */
    private static final void m100366n(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m100367o(InterfaceC28601c1 interfaceC28601c1) {
        m100364l(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m100368p(InterfaceC23098g1 interfaceC23098g1, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        Long lM67085b = ((C23104h1) interfaceC23098g1).m67085b();
        if (lM67085b != null) {
            LocalDate localDateM100390a = C32257e.f133518a.m100390a(lM67085b.longValue());
            m100366n(interfaceC28601c1, localDateM100390a.toString());
            function1.invoke(new InterfaceC21413a.e0(new C11748b(localDateM100390a)));
        }
        m100364l(interfaceC28601c2, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m100369q(InterfaceC23098g1 interfaceC23098g1, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        Long lM67085b = ((C23104h1) interfaceC23098g1).m67085b();
        if (lM67085b != null) {
            LocalDate localDateM100390a = C32257e.f133518a.m100390a(lM67085b.longValue());
            m100366n(interfaceC28601c1, localDateM100390a.toString());
            function1.invoke(new InterfaceC21413a.e0(new C11748b(localDateM100390a)));
        }
        m100364l(interfaceC28601c2, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m100370r(Modifier modifier, C32256d c32256d, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m100362j(modifier, c32256d, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private static final void m100371s(InterfaceC23098g1 interfaceC23098g1, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1954480044);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(interfaceC23098g1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a2) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Modifier modifierM3599a = AbstractC1136a.m3599a(C2314t.f9131w, "BIRTHDAY_PICKER_DIALOG_TEST_TAG");
            C23204y c23204yM100378z = m100378z(c28655q, 0);
            boolean z4 = (i14 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C31918g(interfaceC4339a, 1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC23079d0.m67054a((InterfaceC4339a) objM87133R, AbstractC37817c.m121344e(1721106750, c28655q, new C2662y3(interfaceC4339a2, 6)), modifierM3599a, null, null, 0.0f, c23204yM100378z, null, AbstractC37817c.m121344e(1008547925, c28655q, new C9722a(interfaceC23098g1, 3)), c28655q, 100663728, 184);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25503b(interfaceC23098g1, interfaceC4339a, interfaceC4339a2, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m100372t(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m100373u(InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            EnumC27269n0 enumC27269n0 = EnumC27269n0.TextMedium;
            TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC38022b.f162873N);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = c.f133508w;
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R);
            boolean zM87153g = c28655q.m87153g(interfaceC4339a);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new C29616a(interfaceC4339a, 20);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC27265l0.m82217i(null, enumC27269n0, c8688bM21277k, null, null, false, interfaceC39332eM125323a, null, false, false, null, null, (Function1) objM87133R2, c28655q, (TextResource.C8688b.f25889c << 6) | 48, 0, 4025);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m100374v(InterfaceC4339a interfaceC4339a, Object it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m100375w(InterfaceC23098g1 interfaceC23098g1, InterfaceC23013y DatePickerDialog, Composer composer, int i13) {
        AbstractC22676k.m65750j(DatePickerDialog, "$this$DatePickerDialog");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC23092f1.m67068b(interfaceC23098g1, null, null, m100378z(c28655q, 0), null, null, false, null, c28655q, 1572864);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m100376x(InterfaceC23098g1 interfaceC23098g1, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, Composer composer, int i14) {
        m100371s(interfaceC23098g1, interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    private static final C23204y m100378z(Composer composer, int i13) {
        C23067b0 c23067b0 = C23067b0.f90984a;
        C38072d c38072d = C38072d.f163053a;
        int i14 = C38072d.f163054b;
        long jM125426w = c38072d.m121949b(composer, i14).getBrandBlack();
        long jM125426w2 = c38072d.m121949b(composer, i14).getBrandBlack();
        long jM125426w3 = c38072d.m121949b(composer, i14).getBrandBlack();
        long jM125430y = c38072d.m121949b(composer, i14).getBrandWhite();
        long jM125426w4 = c38072d.m121949b(composer, i14).getBrandBlack();
        return C23067b0.m67042c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c38072d.m121949b(composer, i14).getBrandBlack(), c38072d.m121949b(composer, i14).getBrandWhite(), jM125426w4, 0L, 0L, jM125430y, jM125426w3, jM125426w2, jM125426w, 0L, composer, 31814911);
    }
}
