package be1;

import a61.C0468a;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c41.AbstractC4106r2;
import c41.C4092p2;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.AbstractC16319p0;
import hy0.AbstractC17755i2;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import j11.AbstractC21211n;
import java.util.List;
import java.util.WeakHashMap;
import kd1.C22411w;
import kotlin.C2040y;
import l83.C23454a0;
import n82.C26457c;
import n82.InterfaceC26456b;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27271o0;
import ny0.AbstractC27282u;
import ny0.AbstractC27292z;
import ny0.EnumC27284v;
import o82.AbstractC27660d;
import or2.C28205u0;
import org.joda.time.LocalDateTime;
import p000.AbstractC11266d;
import p000.C21061j;
import p000.C27314o;
import p000.C3718c;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C22957g;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p294l3.C23254g;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sp0.C32864d;
import sp0.C32870j;
import sp0.EnumC32861a;
import tp0.AbstractC34056a;
import tp0.AbstractC34057b;
import tp0.AbstractC34060e;
import tp0.EnumC34058c;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35666g;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.AbstractC39281n;
import y71.C39274g;
import y71.C39282o;
import yd1.AbstractC39457a;
import z90.AbstractC40203a;
import zd1.InterfaceC40547b;
import zd1.InterfaceC40549d;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: be1.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ac\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aO\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a?\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001aO\u0010\u0018\u001a\u00020\b2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0001\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a?\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006 ²\u0006\u000e\u0010\u001f\u001a\u00020\u001e8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lzd1/d;", "viewState", "Lor2/u0;", "localizedDateTimeFormatter", "Lzr2/a;", "dateAndTimeProvider", "Lkotlin/Function1;", "Lzd1/b;", "Ll83/a0;", "onEvent", "Ln82/b;", "onSelectActivityTypeEvent", "Lyd1/a;", "onNavigationEvent", "W", "(Lzd1/d;Lor2/u0;Lzr2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lzd1/d$a;", "Ltp0/c;", "onSectionSelected", "G", "(Lzd1/d$a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lor2/u0;Lzr2/a;Landroidx/compose/runtime/Composer;I)V", "q0", "(Lzd1/d$a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "onSectionClicked", "O", "(Lkotlin/jvm/functions/Function1;Lzd1/d$a;Lor2/u0;Lzr2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lzd1/d$e;", "onViewEvent", "l0", "(Lzd1/d$e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/design/util/TextResource;", "bottomSheetTitle", "add-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3173g {

    /* JADX INFO: renamed from: be1.g$a */
    @InterfaceC32271e(m100429c = "com.whoop.edit.view.compose.EditActivityScreenKt$EditActivityScreen$1$1", m100430f = "EditActivityScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f12415w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f12416x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ float f12417y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f12418z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C15199y3 c15199y3, float f13, Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f12416x = c15199y3;
            this.f12417y = f13;
            this.f12418z = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f12416x, this.f12417y, this.f12418z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f12415w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            EnumC15209z3 enumC15209z3M43221b = this.f12416x.m43221b();
            EnumC15209z3 enumC15209z3 = EnumC15209z3.f57106w;
            if (enumC15209z3M43221b == enumC15209z3 && this.f12416x.m43222c() == enumC15209z3 && ((Number) this.f12416x.f57060b.f55774k.getValue()).floatValue() == this.f12417y) {
                this.f12418z.invoke(InterfaceC40547b.i.f174468a);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: be1.g$b */
    @InterfaceC32271e(m100429c = "com.whoop.edit.view.compose.EditActivityScreenKt$FullScreenModalScreen$1$4$1", m100430f = "EditActivityScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f12419w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC40549d.e f12420x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f12421y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC40549d.e eVar, Function1 function1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f12420x = eVar;
            this.f12421y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f12420x, this.f12421y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f12419w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC40547b interfaceC40547bM131494j = this.f12420x.getFollowUpEvent();
            if (interfaceC40547bM131494j != null) {
                this.f12421y.invoke(interfaceC40547bM131494j);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: G */
    public static final void m9074G(InterfaceC40549d.a viewState, Function1 function1, Function1 function2, C28205u0 localizedDateTimeFormatter, InterfaceC41070a dateAndTimeProvider, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        Function1 function3;
        boolean z4;
        C2305k c2305k;
        C0209i c0209i;
        float f13;
        C2314t c2314t;
        int i15;
        C28655q c28655q2;
        Function1 function4;
        boolean z13;
        C2314t c2314t2;
        float f14;
        int i16;
        boolean z14;
        Function1 onSectionSelected = function1;
        Function1 onEvent = function2;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onSectionSelected, "onSectionSelected");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        AbstractC22676k.m65750j(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(570352649);
        if ((i13 & 6) == 0) {
            i14 = (c28655q3.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q3.m87157i(onSectionSelected) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q3.m87157i(onEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= (i13 & 4096) == 0 ? c28655q3.m87153g(localizedDateTimeFormatter) : c28655q3.m87157i(localizedDateTimeFormatter) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q3.m87157i(dateAndTimeProvider) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q3.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            WeakHashMap weakHashMap = C22944c2.f90553v;
            boolean zBooleanValue = ((Boolean) C22949e.m66712e(c28655q3).f90556c.f90544d.getValue()).booleanValue();
            C2314t c2314t3 = C2314t.f9131w;
            Modifier modifierM66720i = AbstractC22953f.m66720i(AbstractC1102d.m3407d(1.0f, c2314t3));
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k2, c28655q3, 0);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM66720i);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i2, c23010xM66775a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i5, modifierM118962N);
            if (0.7f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(new LayoutWeightElement(0.7f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.7f, true), AbstractC30060g.m92099U(0, c28655q3, 1), 14);
            float f15 = 8;
            C23010x c23010xM73381n = AbstractC25012a.m73381n(4, f15, c2305k2, c28655q3, 6);
            int iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM92116f0);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i2, c23010xM73381n);
            AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i5, modifierM118962N2);
            if (viewState.getIsSelectedActivityVisible()) {
                c28655q3.m87150e0(-940990358);
                function3 = function1;
                m9127q0(viewState, function3, onEvent, c28655q3, i14 & 1022);
                z4 = false;
                c28655q3.m87173q(false);
            } else {
                function3 = function1;
                z4 = false;
                c28655q3.m87150e0(-940902907);
                c28655q3.m87173q(false);
            }
            if (AbstractC8693b.m21270d(viewState.getActivityLabel())) {
                c28655q3.m87150e0(-940843852);
                String strM21274h = AbstractC8693b.m21274h(viewState.getActivityLabel(), c28655q3, TextResource.$stable);
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                c2305k = c2305k2;
                c2314t = c2314t3;
                i15 = 6;
                c0209i = c0209i4;
                f13 = f15;
                function4 = function1;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q3, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i17).getB2(), null, c28655q3, 0, C2886a.f11498d << 18, 196602);
                c28655q2 = c28655q3;
                c28655q2.m87173q(false);
            } else {
                c2305k = c2305k2;
                c0209i = c0209i4;
                f13 = f15;
                c2314t = c2314t3;
                i15 = 6;
                c28655q2 = c28655q3;
                function4 = function3;
                c28655q2.m87150e0(-940704507);
                c28655q2.m87173q(z4);
            }
            int i18 = 9;
            C28655q c28655q4 = c28655q2;
            AbstractC17755i2.m50938j(null, null, null, AbstractC8693b.m21277k(AbstractC40203a.f173541N), null, 0L, 0L, null, c28655q4, TextResource.C8688b.f25889c << 9, 247);
            int i19 = viewState.getIsSelectedActivityVisible() ? 100 : 80;
            int i24 = i14 & 112;
            boolean z15 = i24 == 32;
            Object objM87133R = c28655q4.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z15 || objM87133R == c28676v0) {
                objM87133R = new C0468a(function4, i18);
                c28655q4.m87172p0(objM87133R);
            }
            int i25 = i14 >> 3;
            onSectionSelected = function4;
            int i26 = i14;
            m9082O((Function1) objM87133R, viewState, localizedDateTimeFormatter, dateAndTimeProvider, onEvent, c28655q4, ((i14 << 3) & 112) | (C28205u0.f113964d << i15) | (i25 & 896) | (i25 & 7168) | ((i14 << 6) & 57344));
            onEvent = onEvent;
            TextResource textResourceM131464j = viewState.getLocationDividerTitleDisplay();
            int i27 = TextResource.$stable;
            int i28 = i27 << 9;
            C2305k c2305k3 = c2305k;
            AbstractC17755i2.m50938j(null, null, null, textResourceM131464j, null, 0L, 0L, null, c28655q4, i28, 247);
            C32870j c32870jM131459e = viewState.getCurrentStrapLocation();
            boolean z16 = viewState.getSelectedScreenSection() == EnumC34058c.STRAP_LOCATION;
            boolean z17 = i24 == 32;
            Object objM87133R2 = c28655q4.m87133R();
            if (z17 || objM87133R2 == c28676v0) {
                objM87133R2 = new C0468a(onSectionSelected, 10);
                c28655q4.m87172p0(objM87133R2);
            }
            Function1 function5 = (Function1) objM87133R2;
            TextResource textResourceM131465k = viewState.getLocationPromptDisplay();
            List<C32870j> listM131457c = viewState.m131457c();
            int i29 = i26 & 896;
            boolean z18 = i29 == 256;
            Object objM87133R3 = c28655q4.m87133R();
            if (z18 || objM87133R3 == c28676v0) {
                objM87133R3 = new C0468a(onEvent, 11);
                c28655q4.m87172p0(objM87133R3);
            }
            AbstractC34060e.m107654p(c32870jM131459e, z16, function5, textResourceM131465k, i19, listM131457c, (Function1) objM87133R3, c28655q4, i27 | i28, 0);
            c28655q = c28655q4;
            c28655q.m87173q(true);
            if (zBooleanValue) {
                z13 = true;
                c28655q.m87150e0(2130057295);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(2128610029);
                if (0.3f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                float f16 = f13;
                Modifier modifierM3394p = AbstractC1099a.m3394p(3 * f16, new LayoutWeightElement(0.3f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.3f, true));
                C23010x c23010xM73381n2 = AbstractC25012a.m73381n((float) 1.5d, f16, c2305k3, c28655q, 6);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM73381n2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                if (viewState.getIsPrimaryButtonV2()) {
                    c28655q.m87150e0(1450883537);
                    TextResource textResourceM131458d = viewState.getCallToActionDisplay();
                    c2314t2 = c2314t;
                    f14 = 1.0f;
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
                    boolean zM131466l = viewState.getPrimaryButtonEnabled();
                    boolean z19 = i29 == 256;
                    Object objM87133R4 = c28655q.m87133R();
                    if (z19 || objM87133R4 == c28676v0) {
                        objM87133R4 = new C27314o(onEvent, 18);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC27292z.m82343j(modifierM3409f, zM131466l, false, null, null, null, textResourceM131458d, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R4, c28655q, (i27 << 18) | 6, 0, 8124);
                    c28655q = c28655q;
                    z14 = false;
                    c28655q.m87173q(false);
                    i16 = i27;
                } else {
                    c2314t2 = c2314t;
                    f14 = 1.0f;
                    c28655q.m87150e0(1451265395);
                    EnumC27284v enumC27284v = EnumC27284v.TextLarge;
                    i16 = i27;
                    String strM21274h2 = AbstractC8693b.m21274h(viewState.getCallToActionDisplay(), c28655q, i16);
                    long accentAction = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getAccentAction();
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
                    boolean zM131466l2 = viewState.getPrimaryButtonEnabled();
                    boolean z24 = i29 == 256;
                    Object objM87133R5 = c28655q.m87133R();
                    if (z24 || objM87133R5 == c28676v0) {
                        objM87133R5 = new C27314o(onEvent, 19);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC27282u.m82292h(modifierM3409f2, enumC27284v, strM21274h2, zM131466l2, accentAction, null, false, (InterfaceC4339a) objM87133R5, c28655q, 54, 96);
                    c28655q = c28655q;
                    z14 = false;
                    c28655q.m87173q(false);
                }
                TextResource textResourceM131460f = viewState.getDeleteActivityText();
                if (textResourceM131460f == null) {
                    c28655q.m87150e0(1451782505);
                    c28655q.m87173q(z14);
                } else {
                    c28655q.m87150e0(1451782506);
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(f14, c2314t2);
                    boolean z25 = i29 == 256;
                    Object objM87133R6 = c28655q.m87133R();
                    if (z25 || objM87133R6 == c28676v0) {
                        objM87133R6 = new C27314o(onEvent, 20);
                        c28655q.m87172p0(objM87133R6);
                    }
                    C28655q c28655q5 = c28655q;
                    AbstractC27271o0.m82253b(modifierM3409f3, false, textResourceM131460f, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R6, c28655q5, (i16 << 6) | 6, 0, MessageListItemViewType.POLL);
                    c28655q = c28655q5;
                    z14 = false;
                    c28655q.m87173q(false);
                }
                z13 = true;
                c28655q.m87173q(true);
                c28655q.m87173q(z14);
            }
            c28655q.m87173q(z13);
        } else {
            c28655q = c28655q3;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3170d(viewState, onSectionSelected, onEvent, localizedDateTimeFormatter, dateAndTimeProvider, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m9075H(Function1 function1, EnumC34058c it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m9076I(Function1 function1, boolean z4) {
        function1.invoke(EnumC34058c.STRAP_LOCATION);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m9077J(Function1 function1, C32870j it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC40547b.s(it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m9078K(Function1 function1) {
        function1.invoke(InterfaceC40547b.p.f174481a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m9079L(Function1 function1) {
        function1.invoke(InterfaceC40547b.p.f174481a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m9080M(Function1 function1) {
        function1.invoke(InterfaceC40547b.g.f174466a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m9081N(InterfaceC40549d.a aVar, Function1 function1, Function1 function2, C28205u0 c28205u0, InterfaceC41070a interfaceC41070a, int i13, Composer composer, int i14) {
        m9074G(aVar, function1, function2, c28205u0, interfaceC41070a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: O */
    public static final void m9082O(Function1 onSectionClicked, InterfaceC40549d.a viewState, C28205u0 localizedDateTimeFormatter, InterfaceC41070a dateAndTimeProvider, Function1 onEvent, Composer composer, int i13) {
        int i14;
        Function1 function1;
        AbstractC22676k.m65750j(onSectionClicked, "onSectionClicked");
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1204216459);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(onSectionClicked) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= (i13 & 512) == 0 ? c28655q.m87153g(localizedDateTimeFormatter) : c28655q.m87157i(localizedDateTimeFormatter) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(dateAndTimeProvider) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
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
            float f13 = 2 * 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f13, 7);
            boolean z4 = viewState.getSelectedScreenSection() == EnumC34058c.START_DATE;
            int i15 = i14 & 14;
            boolean z13 = i15 == 4;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z13 || objM87133R == c28676v0) {
                objM87133R = new C27314o(onSectionClicked, 21);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean z14 = viewState.getSelectedScreenSection() == EnumC34058c.START_TIME;
            boolean z15 = i15 == 4;
            Object objM87133R2 = c28655q.m87133R();
            if (z15 || objM87133R2 == c28676v0) {
                objM87133R2 = new C27314o(onSectionClicked, 22);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
            int i16 = i14;
            C32864d c32864dM131469o = viewState.getStartTimePickerState();
            int i17 = i16 & 57344;
            boolean z16 = i17 == 16384;
            Object objM87133R3 = c28655q.m87133R();
            if (z16 || objM87133R3 == c28676v0) {
                objM87133R3 = new C0468a(onEvent, 12);
                c28655q.m87172p0(objM87133R3);
            }
            int i18 = C28205u0.f113964d << 18;
            int i19 = i16 << 12;
            int i24 = i19 & 3670016;
            int i25 = i19 & 29360128;
            AbstractC34057b.m107634e(modifierM3398t, z4, interfaceC4339a, z14, interfaceC4339a2, c32864dM131469o, localizedDateTimeFormatter, dateAndTimeProvider, (Function1) objM87133R3, c28655q, i18 | 6 | i24 | i25, 0);
            boolean z17 = viewState.getSelectedScreenSection() == EnumC34058c.END_DATE;
            boolean z18 = i15 == 4;
            Object objM87133R4 = c28655q.m87133R();
            if (z18 || objM87133R4 == c28676v0) {
                objM87133R4 = new C27314o(onSectionClicked, 23);
                c28655q.m87172p0(objM87133R4);
            }
            InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R4;
            boolean z19 = viewState.getSelectedScreenSection() == EnumC34058c.END_TIME;
            boolean z24 = i15 == 4;
            Object objM87133R5 = c28655q.m87133R();
            if (z24 || objM87133R5 == c28676v0) {
                objM87133R5 = new C27314o(onSectionClicked, 24);
                c28655q.m87172p0(objM87133R5);
            }
            InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R5;
            C32864d c32864dM131462h = viewState.getEndTimePickerState();
            boolean z25 = i17 == 16384;
            Object objM87133R6 = c28655q.m87133R();
            if (z25 || objM87133R6 == c28676v0) {
                function1 = onEvent;
                objM87133R6 = new C0468a(function1, 13);
                c28655q.m87172p0(objM87133R6);
            } else {
                function1 = onEvent;
            }
            AbstractC34057b.m107634e(null, z17, interfaceC4339a3, z19, interfaceC4339a4, c32864dM131462h, localizedDateTimeFormatter, dateAndTimeProvider, (Function1) objM87133R6, c28655q, i18 | i24 | i25, 1);
            C4092p2 c4092p2M131463i = viewState.getInfoCalloutState();
            if (c4092p2M131463i == null) {
                c28655q.m87150e0(-1262000373);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1262000372);
                AbstractC4106r2.m12647f(AbstractC1099a.m3398t(c2314t, 0.0f, f13, 0.0f, 0.0f, 13), c4092p2M131463i, null, c28655q, (C4092p2.f16593v << 3) | 6, 4);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            function1 = onEvent;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3170d(onSectionClicked, viewState, localizedDateTimeFormatter, dateAndTimeProvider, function1, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m9083P(Function1 function1) {
        function1.invoke(EnumC34058c.START_DATE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m9084Q(Function1 function1) {
        function1.invoke(EnumC34058c.START_TIME);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m9085R(Function1 function1, LocalDateTime it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC40547b.r(it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m9086S(Function1 function1) {
        function1.invoke(EnumC34058c.END_DATE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m9087T(Function1 function1) {
        function1.invoke(EnumC34058c.END_TIME);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m9088U(Function1 function1, LocalDateTime it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC40547b.h(it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m9089V(Function1 function1, InterfaceC40549d.a aVar, C28205u0 c28205u0, InterfaceC41070a interfaceC41070a, Function1 function2, int i13, Composer composer, int i14) {
        m9082O(function1, aVar, c28205u0, interfaceC41070a, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0287  */
    /* JADX WARN: Code duplicated, block: B:102:0x0289  */
    /* JADX WARN: Code duplicated, block: B:106:0x0292  */
    /* JADX WARN: Code duplicated, block: B:109:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:110:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:114:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:116:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:119:0x030b  */
    /* JADX WARN: Code duplicated, block: B:121:0x032c  */
    /* JADX WARN: Code duplicated, block: B:122:0x032e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0337  */
    /* JADX WARN: Code duplicated, block: B:129:0x0347  */
    /* JADX WARN: Code duplicated, block: B:130:0x0349  */
    /* JADX WARN: Code duplicated, block: B:134:0x0352  */
    /* JADX WARN: Code duplicated, block: B:136:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:139:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:147:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:149:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:150:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:154:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:157:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:158:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:166:0x040c  */
    /* JADX WARN: Code duplicated, block: B:170:0x0416  */
    /* JADX WARN: Code duplicated, block: B:173:0x046b  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:95:0x0243  */
    /* JADX WARN: Code duplicated, block: B:96:0x025f  */
    /* JADX WARN: Code duplicated, block: B:99:0x026c  */
    /* JADX INFO: renamed from: W */
    public static final void m9090W(InterfaceC40549d interfaceC40549d, C28205u0 localizedDateTimeFormatter, InterfaceC41070a dateAndTimeProvider, Function1 function1, Function1 onSelectActivityTypeEvent, Function1 onNavigationEvent, Composer composer, int i13) {
        int i14;
        C39274g c39274g;
        C39274g c39274g2;
        boolean z4;
        Object objM87133R;
        int i15;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R2;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objM87133R3;
        boolean z19;
        Object objM87133R4;
        boolean z24;
        Object objM87133R5;
        boolean z25;
        Object objM87133R6;
        boolean z26;
        Object objM87133R7;
        InterfaceC40549d viewState = interfaceC40549d;
        Function1 onEvent = function1;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        AbstractC22676k.m65750j(onSelectActivityTypeEvent, "onSelectActivityTypeEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1246675322);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(localizedDateTimeFormatter) : c28655q.m87157i(localizedDateTimeFormatter) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(dateAndTimeProvider) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(onSelectActivityTypeEvent) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            i14 |= c28655q.m87157i(onNavigationEvent) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q.m87135U(i14 & 1, (74899 & i14) != 74898)) {
            C15199y3 c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57107x, null, null, true, c28655q, 3078, 6);
            Object objM87133R8 = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R8 == c28676v0) {
                objM87133R8 = AbstractC28683x.m87272z(AbstractC8693b.m21267a());
                c28655q.m87172p0(objM87133R8);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R8;
            EnumC15209z3 enumC15209z3M43221b = c15199y3M3460c.m43221b();
            EnumC15209z3 enumC15209z3M43222c = c15199y3M3460c.m43222c();
            int i16 = i14 & 7168;
            boolean zM87157i = c28655q.m87157i(c15199y3M3460c) | (i16 == 2048);
            Object objM87133R9 = c28655q.m87133R();
            int i17 = i14;
            if (zM87157i || objM87133R9 == c28676v0) {
                objM87133R9 = new a(c15199y3M3460c, 1.0f, onEvent, null);
                c28655q.m87172p0(objM87133R9);
            }
            AbstractC28683x.m87254h(enumC15209z3M43221b, enumC15209z3M43222c, (InterfaceC4351m) objM87133R9, c28655q);
            Modifier modifierM3406c = AbstractC1102d.m3406c(0.8f, C2314t.f9131w);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3406c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            TextResource textResourceM9091X = m9091X(interfaceC28601c1);
            viewState = interfaceC40549d;
            if (viewState instanceof InterfaceC40549d.a) {
                c39274g2 = new C39274g(AbstractC16319p0.m46430a().getAction().getCross(), AbstractC8693b.m21277k(AbstractC40203a.f173544a));
            } else {
                if (viewState instanceof InterfaceC40549d.f) {
                    c39274g2 = new C39274g(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationBackward(), null, 2, null);
                } else {
                    c39274g = null;
                }
                C35666g c35666g = new C35666g(textResourceM9091X, c39274g, null, null, null, 0.0f, 0.0f, 124, null);
                AbstractC35664f.a aVar = new AbstractC35664f.a(c15199y3M3460c);
                if (i16 == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z4 || objM87133R == c28676v0) {
                    objM87133R = new C27314o(onEvent, 17);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                C2040y c2040y = new C2040y(viewState, onEvent, localizedDateTimeFormatter, dateAndTimeProvider, onSelectActivityTypeEvent, interfaceC28601c1);
                onEvent = onEvent;
                AbstractC35660d.m112871m(null, c35666g, aVar, null, interfaceC4339a, null, null, AbstractC37817c.m121344e(1013050270, c28655q, c2040y), false, null, null, null, false, null, C3167a.f12389a.m9067b(), c28655q, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.a.f151587c << 6), 24576, 16233);
                c28655q = c28655q;
                if (viewState instanceof InterfaceC40549d.e) {
                    c28655q.m87150e0(1533202964);
                    m9117l0((InterfaceC40549d.e) viewState, onEvent, onNavigationEvent, c28655q, (i17 & 14) | ((i17 >> 6) & 112) | ((i17 >> 9) & 896));
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1533327894);
                    c28655q.m87173q(false);
                }
                if (viewState instanceof InterfaceC40549d.d) {
                    c28655q.m87150e0(1533416709);
                    InterfaceC40549d.d dVar = (InterfaceC40549d.d) viewState;
                    TextResource textResourceM131483b = dVar.getDialogTitle();
                    C23254g c23254gM107629a = AbstractC34056a.m107629a(dVar.getDescription(), c28655q, 0);
                    TextResource textResourceM131484c = dVar.getPrimaryButtonText();
                    if (i16 == 2048) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (z25 || objM87133R6 == c28676v0) {
                        objM87133R6 = new C27314o(onEvent, 25);
                        c28655q.m87172p0(objM87133R6);
                    }
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R6;
                    if (i16 == 2048) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (z26 || objM87133R7 == c28676v0) {
                        objM87133R7 = new C27314o(onEvent, 26);
                        c28655q.m87172p0(objM87133R7);
                    }
                    InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R7;
                    int i18 = TextResource.$stable;
                    AbstractC21211n.m59497o(null, textResourceM131483b, null, textResourceM131484c, false, null, null, null, null, null, null, false, false, null, null, false, 0, null, c23254gM107629a, null, false, null, interfaceC4339a2, null, interfaceC4339a3, null, null, null, c28655q, (i18 << 3) | (i18 << 9), 384, 0, 247197685);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1533904246);
                    c28655q.m87173q(false);
                }
                if (viewState instanceof InterfaceC40549d.b) {
                    c28655q.m87150e0(1534013645);
                    InterfaceC40549d.b bVar = (InterfaceC40549d.b) viewState;
                    TextResource textResourceM131473b = bVar.getDialogTitle();
                    C23254g c23254gM107629a2 = AbstractC34056a.m107629a(bVar.getDescription(), c28655q, 0);
                    TextResource textResourceM131474c = bVar.getPrimaryButtonText();
                    EnumC39333f enumC39333f = EnumC39333f.ACCENT_POSITIVE_TREND;
                    TextResource textResourceM131475d = bVar.getSecondaryButtonText();
                    if (i16 == 2048) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (z19 || objM87133R4 == c28676v0) {
                        objM87133R4 = new C27314o(onEvent, 27);
                        c28655q.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R4;
                    if (i16 == 2048) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objM87133R5 = c28655q.m87133R();
                    if (z24 || objM87133R5 == c28676v0) {
                        objM87133R5 = new C27314o(onEvent, 28);
                        c28655q.m87172p0(objM87133R5);
                    }
                    int i19 = TextResource.$stable;
                    C28655q c28655q2 = c28655q;
                    AbstractC21211n.m59497o(null, textResourceM131473b, null, textResourceM131474c, false, enumC39333f, null, null, null, textResourceM131475d, null, false, true, null, null, false, 0, null, c23254gM107629a2, null, false, null, interfaceC4339a4, null, (InterfaceC4339a) objM87133R5, null, null, null, c28655q2, (i19 << 3) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i19 << 9) | (i19 << 27), 384, 0, 247197141);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1534678006);
                    c28655q.m87173q(false);
                }
                if (viewState instanceof InterfaceC40549d.c) {
                    c28655q.m87150e0(1534766914);
                    InterfaceC40549d.c cVar = (InterfaceC40549d.c) viewState;
                    TextResource textResourceM131481f = cVar.getTitle();
                    TextResource textResourceM131476a = cVar.getDescription();
                    TextResource textResourceM131479d = cVar.getPrimaryButtonText();
                    TextResource textResourceM131480e = cVar.getSecondaryButtonText();
                    i15 = i17 & 14;
                    if (i15 != 4 || ((i17 & 8) != 0 && c28655q.m87157i(viewState))) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (i16 == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z13 | z14;
                    objM87133R2 = c28655q.m87133R();
                    if (z15 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C3171e(viewState, onEvent);
                        c28655q.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                    if (i16 == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (i15 != 4 || ((i17 & 8) != 0 && c28655q.m87157i(viewState))) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z17 | z16;
                    objM87133R3 = c28655q.m87133R();
                    if (z18 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C3171e(onEvent, viewState);
                        c28655q.m87172p0(objM87133R3);
                    }
                    int i24 = TextResource.$stable;
                    C28655q c28655q3 = c28655q;
                    AbstractC21211n.m59497o(null, textResourceM131481f, textResourceM131476a, textResourceM131479d, false, null, null, null, null, textResourceM131480e, null, false, true, null, null, false, 0, null, null, null, false, null, interfaceC4339a5, null, (InterfaceC4339a) objM87133R3, null, null, null, c28655q3, (i24 << 3) | (i24 << 6) | (i24 << 9) | (i24 << 27), 384, 0, 247459313);
                    c28655q = c28655q3;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1535195830);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
            }
            c39274g = c39274g2;
            C35666g c35666g2 = new C35666g(textResourceM9091X, c39274g, null, null, null, 0.0f, 0.0f, 124, null);
            AbstractC35664f.a aVar2 = new AbstractC35664f.a(c15199y3M3460c);
            if (i16 == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z4) {
                objM87133R = new C27314o(onEvent, 17);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C27314o(onEvent, 17);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R;
            C2040y c2040y2 = new C2040y(viewState, onEvent, localizedDateTimeFormatter, dateAndTimeProvider, onSelectActivityTypeEvent, interfaceC28601c1);
            onEvent = onEvent;
            AbstractC35660d.m112871m(null, c35666g2, aVar2, null, interfaceC4339a6, null, null, AbstractC37817c.m121344e(1013050270, c28655q, c2040y2), false, null, null, null, false, null, C3167a.f12389a.m9067b(), c28655q, (C35666g.f151591h << 3) | 12582912 | (AbstractC35664f.a.f151587c << 6), 24576, 16233);
            c28655q = c28655q;
            if (viewState instanceof InterfaceC40549d.e) {
                c28655q.m87150e0(1533202964);
                m9117l0((InterfaceC40549d.e) viewState, onEvent, onNavigationEvent, c28655q, (i17 & 14) | ((i17 >> 6) & 112) | ((i17 >> 9) & 896));
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1533327894);
                c28655q.m87173q(false);
            }
            if (viewState instanceof InterfaceC40549d.d) {
                c28655q.m87150e0(1533416709);
                InterfaceC40549d.d dVar2 = (InterfaceC40549d.d) viewState;
                TextResource textResourceM131483b2 = dVar2.getDialogTitle();
                C23254g c23254gM107629a3 = AbstractC34056a.m107629a(dVar2.getDescription(), c28655q, 0);
                TextResource textResourceM131484c2 = dVar2.getPrimaryButtonText();
                if (i16 == 2048) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                objM87133R6 = c28655q.m87133R();
                if (z25) {
                    objM87133R6 = new C27314o(onEvent, 25);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C27314o(onEvent, 25);
                    c28655q.m87172p0(objM87133R6);
                }
                InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                if (i16 == 2048) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                objM87133R7 = c28655q.m87133R();
                if (z26) {
                    objM87133R7 = new C27314o(onEvent, 26);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C27314o(onEvent, 26);
                    c28655q.m87172p0(objM87133R7);
                }
                InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R7;
                int i110 = TextResource.$stable;
                AbstractC21211n.m59497o(null, textResourceM131483b2, null, textResourceM131484c2, false, null, null, null, null, null, null, false, false, null, null, false, 0, null, c23254gM107629a3, null, false, null, interfaceC4339a7, null, interfaceC4339a8, null, null, null, c28655q, (i110 << 3) | (i110 << 9), 384, 0, 247197685);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1533904246);
                c28655q.m87173q(false);
            }
            if (viewState instanceof InterfaceC40549d.b) {
                c28655q.m87150e0(1534013645);
                InterfaceC40549d.b bVar2 = (InterfaceC40549d.b) viewState;
                TextResource textResourceM131473b2 = bVar2.getDialogTitle();
                C23254g c23254gM107629a4 = AbstractC34056a.m107629a(bVar2.getDescription(), c28655q, 0);
                TextResource textResourceM131474c2 = bVar2.getPrimaryButtonText();
                EnumC39333f enumC39333f2 = EnumC39333f.ACCENT_POSITIVE_TREND;
                TextResource textResourceM131475d2 = bVar2.getSecondaryButtonText();
                if (i16 == 2048) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                objM87133R4 = c28655q.m87133R();
                if (z19) {
                    objM87133R4 = new C27314o(onEvent, 27);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C27314o(onEvent, 27);
                    c28655q.m87172p0(objM87133R4);
                }
                InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R4;
                if (i16 == 2048) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                objM87133R5 = c28655q.m87133R();
                if (z24) {
                    objM87133R5 = new C27314o(onEvent, 28);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C27314o(onEvent, 28);
                    c28655q.m87172p0(objM87133R5);
                }
                int i111 = TextResource.$stable;
                C28655q c28655q4 = c28655q;
                AbstractC21211n.m59497o(null, textResourceM131473b2, null, textResourceM131474c2, false, enumC39333f2, null, null, null, textResourceM131475d2, null, false, true, null, null, false, 0, null, c23254gM107629a4, null, false, null, interfaceC4339a9, null, (InterfaceC4339a) objM87133R5, null, null, null, c28655q4, (i111 << 3) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i111 << 9) | (i111 << 27), 384, 0, 247197141);
                c28655q = c28655q4;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1534678006);
                c28655q.m87173q(false);
            }
            if (viewState instanceof InterfaceC40549d.c) {
                c28655q.m87150e0(1534766914);
                InterfaceC40549d.c cVar2 = (InterfaceC40549d.c) viewState;
                TextResource textResourceM131481f2 = cVar2.getTitle();
                TextResource textResourceM131476a2 = cVar2.getDescription();
                TextResource textResourceM131479d2 = cVar2.getPrimaryButtonText();
                TextResource textResourceM131480e2 = cVar2.getSecondaryButtonText();
                i15 = i17 & 14;
                if (i15 != 4) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (i16 == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z13 | z14;
                objM87133R2 = c28655q.m87133R();
                if (z15) {
                    objM87133R2 = new C3171e(viewState, onEvent);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C3171e(viewState, onEvent);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) objM87133R2;
                if (i16 == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (i15 != 4) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                z18 = z17 | z16;
                objM87133R3 = c28655q.m87133R();
                if (z18) {
                    objM87133R3 = new C3171e(onEvent, viewState);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C3171e(onEvent, viewState);
                    c28655q.m87172p0(objM87133R3);
                }
                int i25 = TextResource.$stable;
                C28655q c28655q5 = c28655q;
                AbstractC21211n.m59497o(null, textResourceM131481f2, textResourceM131476a2, textResourceM131479d2, false, null, null, null, null, textResourceM131480e2, null, false, true, null, null, false, 0, null, null, null, false, null, interfaceC4339a10, null, (InterfaceC4339a) objM87133R3, null, null, null, c28655q5, (i25 << 3) | (i25 << 6) | (i25 << 9) | (i25 << 27), 384, 0, 247459313);
                c28655q = c28655q5;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1535195830);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3172f((Object) viewState, (Object) localizedDateTimeFormatter, (Object) dateAndTimeProvider, (Object) onEvent, (Object) onSelectActivityTypeEvent, (Object) onNavigationEvent, i13, 0);
        }
    }

    /* JADX INFO: renamed from: X */
    private static final TextResource m9091X(InterfaceC28601c1 interfaceC28601c1) {
        return (TextResource) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: Y */
    private static final void m9092Y(InterfaceC28601c1 interfaceC28601c1, TextResource textResource) {
        interfaceC28601c1.setValue(textResource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m9093Z(Function1 function1) {
        function1.invoke(new InterfaceC40547b.b(true));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m9095a0(InterfaceC40549d interfaceC40549d, Function1 function1, C28205u0 c28205u0, InterfaceC41070a interfaceC41070a, Function1 function2, InterfaceC28601c1 interfaceC28601c1, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            Modifier modifierM3406c = AbstractC1102d.m3406c(0.8f, C2314t.f9131w);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3406c);
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
            boolean z4 = interfaceC40549d instanceof InterfaceC40549d.a;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4) {
                c28655q.m87150e0(1704768852);
                InterfaceC40549d.a aVar = (InterfaceC40549d.a) interfaceC40549d;
                m9092Y(interfaceC28601c1, aVar.getEditActivityTitleDisplay());
                boolean zM87157i = c28655q.m87157i(interfaceC40549d) | c28655q.m87153g(function1);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new C3169c(0, aVar, function1);
                    c28655q.m87172p0(objM87133R);
                }
                m9074G(aVar, (Function1) objM87133R, function1, c28205u0, interfaceC41070a, c28655q, C28205u0.f113964d << 9);
                c28655q.m87173q(false);
            } else if (interfaceC40549d instanceof InterfaceC40549d.f) {
                c28655q.m87150e0(1705786272);
                InterfaceC40549d.f fVar = (InterfaceC40549d.f) interfaceC40549d;
                m9092Y(interfaceC28601c1, fVar.getSelectActivityTitleDisplay());
                C26457c c26457cM131508b = fVar.m131508b();
                boolean zM87153g = c28655q.m87153g(function2);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87153g || objM87133R2 == c28676v0) {
                    objM87133R2 = new C0468a(function2, 7);
                    c28655q.m87172p0(objM87133R2);
                }
                Function1 function3 = (Function1) objM87133R2;
                boolean zM87153g2 = c28655q.m87153g(function1);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87153g2 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C0468a(function1, 8);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC27660d.m83632i(c26457cM131508b, function3, (Function1) objM87133R3, c28655q, C26457c.f105074k);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1706460088);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m9097b0(InterfaceC40549d interfaceC40549d, Function1 function1, EnumC34058c selectedSection) {
        AbstractC22676k.m65750j(selectedSection, "selectedSection");
        if (selectedSection == ((InterfaceC40549d.a) interfaceC40549d).getSelectedScreenSection()) {
            function1.invoke(new InterfaceC40547b.n(EnumC34058c.NONE));
        } else {
            function1.invoke(new InterfaceC40547b.n(selectedSection));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m9099c0(Function1 function1, InterfaceC26456b selectActivityEvent) {
        AbstractC22676k.m65750j(selectActivityEvent, "selectActivityEvent");
        function1.invoke(selectActivityEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m9101d0(Function1 function1, String activityName) {
        AbstractC22676k.m65750j(activityName, "activityName");
        function1.invoke(new InterfaceC40547b.a(activityName));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m9103e0(Function1 function1) {
        function1.invoke(InterfaceC40547b.c.f174462a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C23454a0 m9105f0(Function1 function1) {
        function1.invoke(InterfaceC40547b.c.f174462a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C23454a0 m9107g0(Function1 function1) {
        function1.invoke(InterfaceC40547b.d.f174463a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C23454a0 m9109h0(Function1 function1) {
        function1.invoke(InterfaceC40547b.q.f174482a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m9111i0(InterfaceC40549d interfaceC40549d, Function1 function1) {
        InterfaceC40547b interfaceC40547bM131478c = ((InterfaceC40549d.c) interfaceC40549d).getOnDismiss();
        if (interfaceC40547bM131478c != null) {
            function1.invoke(interfaceC40547bM131478c);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C23454a0 m9113j0(Function1 function1, InterfaceC40549d interfaceC40549d) {
        function1.invoke(((InterfaceC40549d.c) interfaceC40549d).getOnApprove());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final C23454a0 m9115k0(InterfaceC40549d interfaceC40549d, C28205u0 c28205u0, InterfaceC41070a interfaceC41070a, Function1 function1, Function1 function2, Function1 function3, int i13, Composer composer, int i14) {
        m9090W(interfaceC40549d, c28205u0, interfaceC41070a, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l0 */
    public static final void m9117l0(final InterfaceC40549d.e viewState, final Function1 onViewEvent, final Function1 onNavigationEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1638561494);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onNavigationEvent) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            boolean z4 = viewState.getType() instanceof AbstractC33208p0.h;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4) {
                c28655q2.m87150e0(1763664687);
                TextResource title = viewState.getType().getTitle();
                boolean z13 = ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q2.m87157i(viewState))) | ((i14 & 896) == 256);
                Object objM87133R = c28655q2.m87133R();
                if (z13 || objM87133R == c28676v0) {
                    final int i15 = 2;
                    objM87133R = new InterfaceC4339a() { // from class: be1.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i15) {
                                case 0:
                                    return AbstractC3173g.m9121n0(viewState, onNavigationEvent);
                                case 1:
                                    return AbstractC3173g.m9123o0(viewState, onNavigationEvent);
                                default:
                                    return AbstractC3173g.m9119m0(viewState, onNavigationEvent);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC33199m0.m105214F(new AbstractC33208p0.h(title, 0L, (InterfaceC4339a) objM87133R, 2, null), viewState.getSupportText(), null, null, null, false, false, null, null, null, false, false, c28655q2, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            } else {
                c28655q2.m87150e0(1764248882);
                int i16 = i14;
                AbstractC33208p0 abstractC33208p0M131500p = viewState.getType();
                TextResource textResourceM131499o = viewState.getSupportText();
                TextResource textResourceM131496l = viewState.getPrimaryButtonText();
                int i17 = i16 & 112;
                boolean zM87157i = c28655q2.m87157i(viewState) | (i17 == 32);
                Object objM87133R2 = c28655q2.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    final int i18 = 0;
                    objM87133R2 = new InterfaceC4339a() { // from class: be1.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i18) {
                                case 0:
                                    return AbstractC3173g.m9121n0(viewState, onViewEvent);
                                case 1:
                                    return AbstractC3173g.m9123o0(viewState, onViewEvent);
                                default:
                                    return AbstractC3173g.m9119m0(viewState, onViewEvent);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                boolean zM21270d = AbstractC8693b.m21270d(viewState.getSecondaryButtonText());
                TextResource textResourceM131498n = viewState.getSecondaryButtonText();
                boolean zM87157i2 = c28655q2.m87157i(viewState) | (i17 == 32);
                Object objM87133R3 = c28655q2.m87133R();
                if (zM87157i2 || objM87133R3 == c28676v0) {
                    final int i19 = 1;
                    objM87133R3 = new InterfaceC4339a() { // from class: be1.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    return AbstractC3173g.m9121n0(viewState, onViewEvent);
                                case 1:
                                    return AbstractC3173g.m9123o0(viewState, onViewEvent);
                                default:
                                    return AbstractC3173g.m9119m0(viewState, onViewEvent);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R3);
                }
                int i24 = AbstractC33208p0.f138461d;
                int i25 = TextResource.$stable;
                AbstractC33199m0.m105214F(abstractC33208p0M131500p, textResourceM131499o, null, textResourceM131496l, interfaceC4339a, zM21270d, false, textResourceM131498n, (InterfaceC4339a) objM87133R3, null, false, false, c28655q2, i24 | (i25 << 3) | (i25 << 9) | (i25 << 21), 0, 3652);
                c28655q = c28655q2;
                InterfaceC40547b interfaceC40547bM131494j = viewState.getFollowUpEvent();
                boolean zM87157i3 = c28655q.m87157i(viewState) | (i17 == 32);
                Object objM87133R4 = c28655q.m87133R();
                if (zM87157i3 || objM87133R4 == c28676v0) {
                    objM87133R4 = new b(viewState, onViewEvent, null);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, interfaceC40547bM131494j);
                c28655q.m87173q(false);
            }
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21061j(viewState, onViewEvent, onNavigationEvent, i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C23454a0 m9119m0(InterfaceC40549d.e eVar, Function1 function1) {
        if (AbstractC22676k.m65745e(eVar.getBackToHomeScreen(), Boolean.TRUE)) {
            function1.invoke(AbstractC39457a.b.f169780a);
        } else {
            function1.invoke(AbstractC39457a.a.f169779a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C23454a0 m9121n0(InterfaceC40549d.e eVar, Function1 function1) {
        InterfaceC40547b interfaceC40547bM131495k = eVar.getPrimaryButtonClickEvent();
        if (interfaceC40547bM131495k != null) {
            function1.invoke(interfaceC40547bM131495k);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C23454a0 m9123o0(InterfaceC40549d.e eVar, Function1 function1) {
        InterfaceC40547b interfaceC40547bM131497m = eVar.getSecondaryButtonClickEvent();
        if (interfaceC40547bM131497m != null) {
            function1.invoke(interfaceC40547bM131497m);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final C23454a0 m9125p0(InterfaceC40549d.e eVar, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m9117l0(eVar, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q0 */
    public static final void m9127q0(InterfaceC40549d.a viewState, Function1 onSectionSelected, Function1 onEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onSectionSelected, "onSectionSelected");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(369237111);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onSectionSelected) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 0.0f, 2 * 8, 7);
            C22411w c22411w = C22411w.f87680a;
            Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC37056f.m118994r(modifierM3398t, c22411w.m64535a().m64090c()), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBlack10(), c22411w.m64535a().m64090c());
            C39282o c39282oM131467m = viewState.getSelectedActivityMenuItemState();
            boolean zM87157i = ((i14 & 112) == 32) | ((i14 & 896) == 256) | c28655q.m87157i(viewState);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C3718c(onSectionSelected, onEvent, viewState, 10);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC39281n.m125207c(modifierM3358c, c39282oM131467m, (InterfaceC4339a) objM87133R, c28655q, C39282o.f168987q << 3, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21061j(viewState, onSectionSelected, onEvent, i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C23454a0 m9129r0(Function1 function1, Function1 function2, InterfaceC40549d.a aVar) {
        function1.invoke(EnumC34058c.NONE);
        function2.invoke(new InterfaceC40547b.m(EnumC32861a.INSTANCE.m103132c(aVar.getActivityType())));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final C23454a0 m9131s0(InterfaceC40549d.a aVar, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m9127q0(aVar, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
