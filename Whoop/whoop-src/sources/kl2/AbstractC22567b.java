package kl2;

import a81.C0563n;
import am2.C1012d;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bf0.C3196h;
import c41.AbstractC4106r2;
import c41.C4092p2;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gy0.AbstractC16277f;
import gz0.AbstractC16319p0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.sentry.config.AbstractC20301a;
import j41.C21313a;
import jl2.EnumC21774a;
import js2.C21930h;
import kf0.C22429d;
import l83.C23454a0;
import ml2.InterfaceC25676a;
import nl2.C26816c;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.C15199y3;
import p291l0.AbstractC22989q;
import p291l0.InterfaceC23013y;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.EnumC33227v1;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35666g;
import wb3.AbstractC37056f;
import x21.AbstractC37861d;
import x21.C37858a;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: kl2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a;\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0010²\u0006\u000e\u0010\r\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lnl2/c$a;", "state", "Lbc3/c0;", "coroutineScope", "Lg1/y3;", "modalState", "Lkotlin/Function1;", "Lml2/a;", "Ll83/a0;", "onEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lnl2/c$a;Lbc3/c0;Lg1/y3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "numberPicker", "", "updateBottomSheet", "training_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22567b {

    /* JADX INFO: renamed from: kl2.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.training.hrsettings.view.compose.CustomZonesBottomSheetKt$CustomHrZonesBottomSheet$1$1$1$1", m100430f = "CustomZonesBottomSheet.kt", m100431l = {63}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f88801w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f88802x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C15199y3 c15199y3, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f88802x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f88802x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f88801w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f88802x;
                this.f88801w = 1;
                if (c15199y3.m43223d(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: kl2.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.training.hrsettings.view.compose.CustomZonesBottomSheetKt$CustomHrZonesBottomSheet$1$3$1$1", m100430f = "CustomZonesBottomSheet.kt", m100431l = {113}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f88803w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f88804x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C15199y3 c15199y3, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f88804x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f88804x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f88803w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f88804x;
                this.f88803w = 1;
                if (c15199y3.m43223d(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: h */
    public static final void m65317h(C26816c.a state, InterfaceC2994c0 coroutineScope, C15199y3 modalState, Function1 onEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(modalState, "modalState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1977551568);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(state) : c28655q2.m87157i(state) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(coroutineScope) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= (i13 & 512) == 0 ? c28655q2.m87153g(modalState) : c28655q2.m87157i(modalState) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87157i(onEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i15 = i14;
        if (c28655q2.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            C37858a numberPickerState = state.getNumberPickerState();
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC31061c.m95646v(numberPickerState.getCurrentValue(), c28655q2);
            }
            InterfaceC28593a1 interfaceC28593a1 = (InterfaceC28593a1) objM87133R;
            Object objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
            Modifier modifierM3406c = AbstractC1102d.m3406c(1.0f, C2314t.f9131w);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3406c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            C35666g c35666g = new C35666g(state.getTitle(), new C39274g(AbstractC16319p0.m46430a().getAction().getCross(), AbstractC8693b.m21277k(AbstractC16277f.f62253K)), null, null, null, 0.0f, 0.0f, 124, null);
            AbstractC35664f.a aVar = new AbstractC35664f.a(modalState);
            int i16 = i15 & 896;
            boolean zM87157i = c28655q2.m87157i(coroutineScope) | (i16 == 256 || ((i15 & 512) != 0 && c28655q2.m87157i(modalState)));
            Object objM87133R3 = c28655q2.m87133R();
            if (zM87157i || objM87133R3 == c28676v0) {
                objM87133R3 = new C3196h(coroutineScope, modalState, 13);
                c28655q2.m87172p0(objM87133R3);
            }
            AbstractC35660d.m112871m(null, c35666g, aVar, null, (InterfaceC4339a) objM87133R3, null, null, AbstractC37817c.m121344e(-341578168, c28655q2, new C0563n((Object) numberPickerState, (Object) state, onEvent, (Object) interfaceC28601c1, (Object) interfaceC28593a1, 8)), false, null, null, null, false, null, C22566a.f88799a.m65309b(), c28655q2, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.a.f151587c << 6), 24576, 16233);
            c28655q = c28655q2;
            boolean zM87157i2 = c28655q.m87157i(coroutineScope) | (i16 == 256 || ((i15 & 512) != 0 && c28655q.m87157i(modalState)));
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i2 || objM87133R4 == c28676v0) {
                objM87133R4 = new C3196h(coroutineScope, modalState, 14);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R4, false, c28655q, 0, 1);
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21313a(state, coroutineScope, modalState, onEvent, i13, 22);
        }
    }

    /* JADX INFO: renamed from: i */
    private static final int m65318i(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: j */
    private static final void m65319j(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: renamed from: k */
    private static final boolean m65320k(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: l */
    private static final void m65321l(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m65322m(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new a(c15199y3, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m65323n(C37858a c37858a, C26816c.a aVar, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28593a1 interfaceC28593a1, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            int currentValue = c37858a.getCurrentValue();
            int minimumValue = c37858a.getMinimumValue();
            int maximumValue = c37858a.getMaximumValue();
            boolean zM65320k = m65320k(interfaceC28601c1);
            boolean zM87157i = c28655q.m87157i(aVar) | c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C21930h(aVar, function1, interfaceC28593a1, 3);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function2 = (Function1) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C22429d(22);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC37861d.m121396i(null, currentValue, minimumValue, maximumValue, false, function2, (Function1) objM87133R2, zM65320k, false, null, null, c28655q, 102260742, 0, 1536);
            C4092p2 infoCalloutState = aVar.getInfoCalloutState();
            C2314t c2314t = C2314t.f9131w;
            if (infoCalloutState == null) {
                c28655q.m87150e0(-1176881095);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1176881094);
                AbstractC4106r2.m12647f(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 5 * 8, 7), infoCalloutState, null, c28655q, (C4092p2.f16593v << 3) | 6, 4);
                c28655q.m87173q(false);
            }
            float f13 = ((float) 5) * 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f13, 0.0f, f13, f13, 2);
            EnumC27284v enumC27284v = EnumC27284v.TextLarge;
            String strM21274h = AbstractC8693b.m21274h(aVar.getPrimaryButton().getTitle(), c28655q, TextResource.$stable);
            boolean enabled = aVar.getPrimaryButton().getEnabled();
            long recovery = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getRecovery();
            boolean zM87157i2 = c28655q.m87157i(aVar) | c28655q.m87153g(function1);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C1012d(aVar, function1, interfaceC28601c1, interfaceC28593a1);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC27282u.m82292h(modifierM3398t, enumC27284v, strM21274h, enabled, recovery, null, false, (InterfaceC4339a) objM87133R3, c28655q, 54, 96);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m65324o(C26816c.a aVar, Function1 function1, InterfaceC28593a1 interfaceC28593a1, int i13) {
        m65319j(interfaceC28593a1, i13);
        if (aVar instanceof C26816c.a.b) {
            function1.invoke(new InterfaceC25676a.b.q(m65318i(interfaceC28593a1)));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m65325p(int i13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m65326q(C26816c.a aVar, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28593a1 interfaceC28593a1) {
        m65321l(interfaceC28601c1, true);
        if (aVar instanceof C26816c.a.b) {
            int iM65318i = m65318i(interfaceC28593a1);
            C26816c.a.b bVar = (C26816c.a.b) aVar;
            EnumC33227v1 zoneValueType = bVar.getZoneValueType();
            EnumC21774a zoneId = bVar.getZoneId();
            Boolean isOutOfRange = bVar.getIsOutOfRange();
            function1.invoke(new InterfaceC25676a.b.g(iM65318i, zoneValueType, zoneId, isOutOfRange != null ? isOutOfRange.booleanValue() : false));
        } else {
            function1.invoke(new InterfaceC25676a.b.i(m65318i(interfaceC28593a1)));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m65327r(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new b(c15199y3, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m65328s(C26816c.a aVar, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, Function1 function1, int i13, Composer composer, int i14) {
        m65317h(aVar, interfaceC2994c0, c15199y3, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
