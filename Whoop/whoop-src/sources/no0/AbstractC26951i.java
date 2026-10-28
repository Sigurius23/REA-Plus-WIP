package no0;

import a81.InterfaceC0569t;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.design.models.items.SecondaryButtonModel;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.models.modal.BottomSheet;
import com.whoop.design.models.modal.BottomSheetHeight;
import com.whoop.design.models.modal.Modal;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15676d;
import ih0.AbstractC18489d0;
import io.sentry.config.AbstractC20301a;
import java.util.List;
import jb1.C21535a;
import js2.C21927e;
import js2.C21930h;
import kotlin.C2032u;
import l83.C23454a0;
import lc0.C23821c;
import lo0.C24574d;
import lo0.InterfaceC24615z;
import m31.C25002h;
import mf2.C25514e;
import mo0.AbstractC25739b;
import mx1.C26003i;
import ny0.AbstractC27265l0;
import ny0.C27256h;
import ny0.C27273p0;
import ny0.EnumC27269n0;
import org.joda.time.DateTimeConstants;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC23013y;
import p292l1.AbstractC23141n2;
import p292l1.C23196w3;
import p319m4.AbstractC25012a;
import p329n0.C26053f;
import p329n0.C26057j;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p392p3.C28780r;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p712j91.InterfaceC21430b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23613d4;
import p720m91.AbstractC25303l;
import p720m91.C25306o;
import p745y81.InterfaceC39332e;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v41.AbstractC35662e;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: no0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011²\u0006\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Llo0/d;", "viewState", "Lkotlin/Function1;", "Llo0/z;", "Ll83/a0;", "onEvent", "Landroidx/compose/ui/Modifier;", "modifier", "k", "(Llo0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/models/modal/BottomSheet;", "bottomSheet", "La81/t;", "q", "(Lcom/whoop/design/models/modal/BottomSheet;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/design/models/modal/AnyModal;", "presentedModal", "clinician-in-the-loop_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26951i {

    /* JADX INFO: renamed from: no0.i$a */
    @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.view.AppointmentSummaryFieldKt$ClinicianBottomSheet$1$1", m100430f = "AppointmentSummaryField.kt", m100431l = {163}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f107498w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C23196w3 f107499x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C23196w3 c23196w3, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f107499x = c23196w3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f107499x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f107498w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C23196w3 c23196w3 = this.f107499x;
                this.f107498w = 1;
                if (c23196w3.m67155g(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: no0.i$b */
    @InterfaceC32271e(m100429c = "com.whoop.clinicianintheloop.view.AppointmentSummaryFieldKt$ClinicianBottomSheet$2$1$1", m100430f = "AppointmentSummaryField.kt", m100431l = {DateTimeConstants.HOURS_PER_WEEK}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f107500w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C23196w3 f107501x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f107502y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C23196w3 c23196w3, Function1 function1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f107501x = c23196w3;
            this.f107502y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f107501x, this.f107502y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f107500w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C23196w3 c23196w3 = this.f107501x;
                this.f107500w = 1;
                if (c23196w3.m67152d(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f107502y.invoke(InterfaceC0569t.a.f2023a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: no0.i$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f107503w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C25306o f107504x;

        public c(Function1 function1, C25306o c25306o) {
            this.f107503w = function1;
            this.f107504x = c25306o;
        }

        /* JADX INFO: renamed from: a */
        public final void m80544a(Object event) {
            AbstractC22676k.m65750j(event, "event");
            this.f107503w.invoke(new InterfaceC0569t.b(event, this.f107504x.getState()));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m80544a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: no0.i$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f107505w = new d();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C25306o c25306o) {
            return null;
        }
    }

    /* JADX INFO: renamed from: no0.i$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f107506w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f107507x;

        public e(Function1 function1, List list) {
            this.f107506w = function1;
            this.f107507x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m80546a(int i13) {
            return this.f107506w.invoke(this.f107507x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m80546a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: no0.i$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f107508w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f107509x;

        public f(List list, Function1 function1) {
            this.f107508w = list;
            this.f107509x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m80547a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
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
            C25306o c25306o = (C25306o) this.f107508w.get(i13);
            c28655q.m87150e0(1873633170);
            boolean zM87153g = c28655q.m87153g(this.f107509x) | c28655q.m87157i(c25306o);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new c(this.f107509x, c25306o);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74290q(c25306o, null, null, (Function1) objM87133R, c28655q, C25306o.f99297c, 6);
            float f13 = 4;
            AbstractC25012a.m73388u(f13, f13, C2314t.f9131w, c28655q, false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m80547a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:55:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:57:0x01da  */
    /* JADX WARN: Code duplicated, block: B:58:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:61:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:64:0x0203  */
    /* JADX WARN: Code duplicated, block: B:67:0x0239  */
    /* JADX WARN: Code duplicated, block: B:70:0x0251  */
    /* JADX WARN: Code duplicated, block: B:71:0x0253  */
    /* JADX WARN: Code duplicated, block: B:75:0x025c  */
    /* JADX WARN: Code duplicated, block: B:78:0x026d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0272  */
    /* JADX WARN: Code duplicated, block: B:82:0x0278  */
    /* JADX WARN: Code duplicated, block: B:83:0x027b  */
    /* JADX WARN: Code duplicated, block: B:85:0x027f  */
    /* JADX WARN: Code duplicated, block: B:86:0x028f  */
    /* JADX WARN: Code duplicated, block: B:88:0x029c  */
    /* JADX WARN: Code duplicated, block: B:91:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static final void m80530k(C24574d viewState, Function1 onEvent, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC28601c1 interfaceC28601c1;
        SecondaryButtonModel secondaryButtonModelM71765a;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        C38072d c38072d;
        int i17;
        C28676v0 c28676v1;
        BottomSheet bottomSheet;
        boolean z13;
        Object objM87133R2;
        Function1 function1;
        AnyModal anyModalM80531l;
        Modal modal;
        BottomSheet bottomSheet2;
        C27273p0 c27273p0M68666p;
        C39274g c39274gM82265k;
        BottomSheet bottomSheet3;
        Object objM82258c;
        Object objM87133R3;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-367245410);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(onEvent) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                secondaryButtonModelM71765a = viewState.getCta();
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, modifier4), 0.0f, 12, 0.0f, 0.0f, 13);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(8), C2299e.f9110M, c28655q2, 6);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3398t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                TextResource textResourceM71767c = viewState.getTitle();
                i16 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResourceM71767c, c28655q2, i16);
                c38072d = C38072d.f163053a;
                int i19 = C38072d.f163054b;
                C2886a c2886aM8438s = c38072d.m121952e(c28655q2, i19).getH5();
                C28780r c28780r = C28780r.f116541H;
                long jM125430y = c38072d.m121949b(c28655q2, i19).getBrandWhite();
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                int i24 = C2886a.f11498d << 18;
                i17 = i15;
                Modifier modifier5 = modifier4;
                AbstractC30795n.m94707h(strM21274h, modifierM3409f, jM125430y, 0L, null, c28780r, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8438s, null, c28655q2, 196656, i24, 196568);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getDescription(), c28655q2, i16), AbstractC1102d.m3409f(1.0f, c2314t), c38072d.m121949b(c28655q2, i19).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 4, 0, null, c38072d.m121952e(c28655q2, i19).getB1(), null, c28655q2, 48, i24 | 3120, 186360);
                c28655q = c28655q2;
                if (secondaryButtonModelM71765a != null) {
                    c28655q.m87150e0(-1295206276);
                    c27273p0M68666p = AbstractC23613d4.m68666p(secondaryButtonModelM71765a);
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                    EnumC27269n0 enumC27269n0 = EnumC27269n0.TextSmall;
                    TextResource textResourceM82267m = c27273p0M68666p.getText();
                    c39274gM82265k = c27273p0M68666p.getRightIcon();
                    if (c39274gM82265k == null) {
                        bottomSheet3 = null;
                        c39274gM82265k = new C39274g(AbstractC18489d0.m53359E(c38072d), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
                    } else {
                        bottomSheet3 = null;
                    }
                    InterfaceC39332e interfaceC39332eM82268n = c27273p0M68666p.getTint();
                    InterfaceC21430b interfaceC21430bM82269o = c27273p0M68666p.getTintGradient();
                    objM82258c = c27273p0M68666p.getActionArgument();
                    if (objM82258c == null) {
                        objM82258c = c27273p0M68666p.getNavigationAction();
                    }
                    Object obj = objM82258c;
                    objM87133R3 = c28655q.m87133R();
                    c28676v1 = c28676v0;
                    if (objM87133R3 == c28676v1) {
                        objM87133R3 = new C21927e(18, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R3);
                    }
                    bottomSheet = bottomSheet3;
                    AbstractC27265l0.m82217i(modifierM3409f2, enumC27269n0, textResourceM82267m, null, c39274gM82265k, false, interfaceC39332eM82268n, interfaceC21430bM82269o, false, false, null, obj, (Function1) objM87133R3, c28655q, (i16 << 6) | 100663350 | (C39274g.f168929c << 12), 384, 1576);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28676v1 = c28676v0;
                    bottomSheet = null;
                    c28655q.m87150e0(-1294439398);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                if ((i17 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z13 || objM87133R2 == c28676v1) {
                    objM87133R2 = new C26947g(onEvent, interfaceC28601c1, 0);
                    c28655q.m87172p0(objM87133R2);
                }
                function1 = (Function1) objM87133R2;
                anyModalM80531l = m80531l(interfaceC28601c1);
                if (anyModalM80531l != null) {
                    modal = anyModalM80531l.getModal();
                } else {
                    modal = bottomSheet;
                }
                if (modal instanceof BottomSheet) {
                    bottomSheet2 = (BottomSheet) modal;
                } else {
                    bottomSheet2 = bottomSheet;
                }
                if (bottomSheet2 != null) {
                    c28655q.m87150e0(-1323628213);
                    m80536q(bottomSheet2, function1, c28655q, BottomSheet.$stable);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1323511932);
                    c28655q.m87173q(false);
                }
                modifier3 = modifier5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C25002h(i13, i14, 13, modifier3, viewState, onEvent);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            objM87133R = c28655q2.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(null);
                c28655q2.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            secondaryButtonModelM71765a = viewState.getCta();
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, modifier4), 0.0f, 12, 0.0f, 0.0f, 13);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(8), C2299e.f9110M, c28655q2, 6);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3398t2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
            TextResource textResourceM71767c2 = viewState.getTitle();
            i16 = TextResource.$stable;
            String strM21274h2 = AbstractC8693b.m21274h(textResourceM71767c2, c28655q2, i16);
            c38072d = C38072d.f163053a;
            int i110 = C38072d.f163054b;
            C2886a c2886aM8438s2 = c38072d.m121952e(c28655q2, i110).getH5();
            C28780r c28780r2 = C28780r.f116541H;
            long jM125430y2 = c38072d.m121949b(c28655q2, i110).getBrandWhite();
            Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
            int i25 = C2886a.f11498d << 18;
            i17 = i15;
            Modifier modifier6 = modifier4;
            AbstractC30795n.m94707h(strM21274h2, modifierM3409f3, jM125430y2, 0L, null, c28780r2, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8438s2, null, c28655q2, 196656, i25, 196568);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getDescription(), c28655q2, i16), AbstractC1102d.m3409f(1.0f, c2314t), c38072d.m121949b(c28655q2, i110).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 4, 0, null, c38072d.m121952e(c28655q2, i110).getB1(), null, c28655q2, 48, i25 | 3120, 186360);
            c28655q = c28655q2;
            if (secondaryButtonModelM71765a != null) {
                c28655q.m87150e0(-1295206276);
                c27273p0M68666p = AbstractC23613d4.m68666p(secondaryButtonModelM71765a);
                Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                EnumC27269n0 enumC27269n1 = EnumC27269n0.TextSmall;
                TextResource textResourceM82267m2 = c27273p0M68666p.getText();
                c39274gM82265k = c27273p0M68666p.getRightIcon();
                if (c39274gM82265k == null) {
                    bottomSheet3 = null;
                    c39274gM82265k = new C39274g(AbstractC18489d0.m53359E(c38072d), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
                } else {
                    bottomSheet3 = null;
                }
                InterfaceC39332e interfaceC39332eM82268n2 = c27273p0M68666p.getTint();
                InterfaceC21430b interfaceC21430bM82269o2 = c27273p0M68666p.getTintGradient();
                objM82258c = c27273p0M68666p.getActionArgument();
                if (objM82258c == null) {
                    objM82258c = c27273p0M68666p.getNavigationAction();
                }
                Object obj2 = objM82258c;
                objM87133R3 = c28655q.m87133R();
                c28676v1 = c28676v0;
                if (objM87133R3 == c28676v1) {
                    objM87133R3 = new C21927e(18, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R3);
                }
                bottomSheet = bottomSheet3;
                AbstractC27265l0.m82217i(modifierM3409f4, enumC27269n1, textResourceM82267m2, null, c39274gM82265k, false, interfaceC39332eM82268n2, interfaceC21430bM82269o2, false, false, null, obj2, (Function1) objM87133R3, c28655q, (i16 << 6) | 100663350 | (C39274g.f168929c << 12), 384, 1576);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28676v1 = c28676v0;
                bottomSheet = null;
                c28655q.m87150e0(-1294439398);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            if ((i17 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R2 = c28655q.m87133R();
            if (z13) {
                objM87133R2 = new C26947g(onEvent, interfaceC28601c1, 0);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C26947g(onEvent, interfaceC28601c1, 0);
                c28655q.m87172p0(objM87133R2);
            }
            function1 = (Function1) objM87133R2;
            anyModalM80531l = m80531l(interfaceC28601c1);
            if (anyModalM80531l != null) {
                modal = anyModalM80531l.getModal();
            } else {
                modal = bottomSheet;
            }
            if (modal instanceof BottomSheet) {
                bottomSheet2 = (BottomSheet) modal;
            } else {
                bottomSheet2 = bottomSheet;
            }
            if (bottomSheet2 != null) {
                c28655q.m87150e0(-1323628213);
                m80536q(bottomSheet2, function1, c28655q, BottomSheet.$stable);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1323511932);
                c28655q.m87173q(false);
            }
            modifier3 = modifier6;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25002h(i13, i14, 13, modifier3, viewState, onEvent);
        }
    }

    /* JADX INFO: renamed from: l */
    private static final AnyModal m80531l(InterfaceC28601c1 interfaceC28601c1) {
        return (AnyModal) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: m */
    private static final void m80532m(InterfaceC28601c1 interfaceC28601c1, AnyModal anyModal) {
        interfaceC28601c1.setValue(anyModal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m80533n(InterfaceC28601c1 interfaceC28601c1, Object rawEvent) {
        AbstractC22676k.m65750j(rawEvent, "rawEvent");
        if (rawEvent instanceof AnyModal) {
            m80532m(interfaceC28601c1, (AnyModal) rawEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m80534o(Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC0569t modalEvent) {
        AbstractC22676k.m65750j(modalEvent, "modalEvent");
        if (modalEvent instanceof InterfaceC0569t.a) {
            m80532m(interfaceC28601c1, null);
        } else if (modalEvent instanceof InterfaceC0569t.f) {
            m80532m(interfaceC28601c1, ((InterfaceC0569t.f) modalEvent).getModal());
        } else if (modalEvent instanceof InterfaceC0569t.b) {
            InterfaceC0569t.b bVar = (InterfaceC0569t.b) modalEvent;
            if ((bVar.getElement() instanceof C27273p0) || (bVar.getElement() instanceof C27256h)) {
                m80532m(interfaceC28601c1, null);
            } else {
                function1.invoke(new InterfaceC24615z.e(bVar.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String(), bVar.getElement()));
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m80535p(C24574d c24574d, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m80530k(c24574d, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    public static final void m80536q(BottomSheet bottomSheet, Function1 onEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(bottomSheet, "bottomSheet");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(777063627);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(bottomSheet) : c28655q.m87157i(bottomSheet) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            C23196w3 c23196w3M67125g = AbstractC23141n2.m67125g(6, null, c28655q, 2);
            List listM60536k = C21535a.m60536k(AbstractC25739b.m75910x(), bottomSheet.getItems(), null, 2, null);
            boolean zM87153g = c28655q.m87153g(c23196w3M67125g);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new a(c23196w3M67125g, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
            boolean zM87157i = ((i14 & 112) == 32) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87153g(c23196w3M67125g);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i || objM87133R3 == c28676v0) {
                objM87133R3 = new C26057j(interfaceC2994c0, c23196w3M67125g, onEvent, 2);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, false, c28655q, 0, 1);
            AbstractC28683x.m87247a(AbstractC25303l.m74272C().mo86977a(AbstractC25739b.m75911y()), AbstractC37817c.m121344e(1266811275, c28655q, new C2032u(c23196w3M67125g, onEvent, bottomSheet, listM60536k, 27)), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26003i(bottomSheet, onEvent, i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m80537r(InterfaceC2994c0 interfaceC2994c0, C23196w3 c23196w3, Function1 function1) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new b(c23196w3, function1, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m80538s(C23196w3 c23196w3, Function1 function1, BottomSheet bottomSheet, List list, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C25514e(function1, 17);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC35662e.m112943g(null, c23196w3, null, null, null, null, (InterfaceC4339a) objM87133R, null, false, null, null, false, AbstractC37817c.m121344e(-1800991375, c28655q, new C26949h(bottomSheet, list, function1, 0)), c28655q, 0, 384, 4029);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m80539t(Function1 function1) {
        function1.invoke(InterfaceC0569t.a.f2023a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m80540u(BottomSheet bottomSheet, List list, Function1 function1, InterfaceC23013y BottomSheetM3, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(BottomSheetM3, "$this$BottomSheetM3");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(BottomSheetM3) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), "clinician_bottom_sheet");
            boolean z4 = bottomSheet.getHeight() == BottomSheetHeight.FULL;
            boolean z13 = (i14 & 14) == 4;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z13 || objM87133R == c28676v0) {
                objM87133R = new C23821c(BottomSheetM3, 27);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM44099b = AbstractC15676d.m44099b(modifierM3599a, z4, (Function1) objM87133R);
            boolean zM87157i = c28655q.m87157i(list) | c28655q.m87153g(function1) | c28655q.m87157i(bottomSheet);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C21930h(list, bottomSheet, function1, 27);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC22674j.m65717c(modifierM44099b, null, null, null, null, null, false, null, (Function1) objM87133R2, c28655q, 0, 510);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final Modifier m80541v(InterfaceC23013y interfaceC23013y, Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return ((C23016z) interfaceC23013y).m66779c(applyIf, true, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m80542w(List list, BottomSheet bottomSheet, Function1 function1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        d dVar = d.f107505w;
        ((C26053f) LazyColumn).m77529r(list.size(), null, new e(dVar, list), new C37816b(new f(list, function1), true, 802480018));
        if (bottomSheet.getHeight() == BottomSheetHeight.FULL) {
            InterfaceC26064q.m77556b(LazyColumn, null, C26968q0.f107588a.m80771b(), 3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m80543x(BottomSheet bottomSheet, Function1 function1, int i13, Composer composer, int i14) {
        m80536q(bottomSheet, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
