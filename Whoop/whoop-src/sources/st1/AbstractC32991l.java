package st1;

import android.view.View;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.EnumC1632v;
import androidx.recyclerview.widget.AbstractC1707m0;
import b91.C2886a;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ht1.EnumC17628e;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import io.sentry.config.AbstractC20301a;
import j11.AbstractC21211n;
import java.util.Arrays;
import java.util.List;
import js2.C21929g;
import kd1.AbstractC22392e;
import l83.C23454a0;
import m83.AbstractC25260n;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import org.joda.time.DateTimeConstants;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.C23016z;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28620h0;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p734sl0.C32618h3;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import pf.AbstractC29125c;
import q81.C30048f;
import q83.InterfaceC30057d;
import qt1.C30587a;
import qt1.C30588b;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import rs1.AbstractC31793e;
import rt1.C31805c;
import rt1.C31806d;
import rt1.C31809g;
import rt1.InterfaceC31804b;
import rt1.InterfaceC31810h;
import s51.C32205b;
import s51.C32209f;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sc0.C32355c;
import sg2.C32458i;
import sg2.C32469t;
import so2.C32848f;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: st1.l */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\u001a7\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a5\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00102\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a+\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00102\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00152\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0018\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d\"\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001d¨\u0006#²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lrt1/g;", "viewModel", "Lkotlin/Function1;", "Lrt1/b$e;", "Ll83/a0;", "onNavEvent", "Lht1/e;", "selectedWrist", "B", "(Lrt1/g;Lkotlin/jvm/functions/Function1;Lht1/e;Landroidx/compose/runtime/Composer;II)V", "Lrt1/h;", "viewState", "Lrt1/b;", "onEvent", "C", "(Lrt1/h;Lkotlin/jvm/functions/Function1;Lht1/e;Landroidx/compose/runtime/Composer;II)V", "Lrt1/h$b;", "Q", "(Lrt1/h$b;Lkotlin/jvm/functions/Function1;Lht1/e;Landroidx/compose/runtime/Composer;II)V", "J", "(Lrt1/h$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lrt1/h$a;", "t", "(Lrt1/h$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "y", "(Landroidx/compose/runtime/Composer;I)V", "", "Lqt1/a;", "a", "[Lqt1/a;", "graphPoints", "b", "graphPointsWithNulls", "c", "graphPointsWithNullsInTwoChunks", "labrador_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32991l {

    /* JADX INFO: renamed from: a */
    private static final C30587a[] f137369a;

    /* JADX INFO: renamed from: b */
    private static final C30587a[] f137370b;

    /* JADX INFO: renamed from: c */
    private static final C30587a[] f137371c;

    /* JADX INFO: renamed from: st1.l$a */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.reading.view.LabradorReadingScreenKt$FullScreenModalScreens$1$4$1", m100430f = "LabradorReadingScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f137372w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC31810h.a f137373x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f137374y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC31810h.a aVar, Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f137373x = aVar;
            this.f137374y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f137373x, this.f137374y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f137372w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC31804b interfaceC31804bM98822e = this.f137373x.getFollowUpEvent();
            if (interfaceC31804bM98822e != null) {
                this.f137374y.invoke(interfaceC31804bM98822e);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: st1.l$b */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"st1/l$b", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f137375a;

        public b(View view) {
            this.f137375a = view;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            this.f137375a.setKeepScreenOn(false);
        }
    }

    /* JADX INFO: renamed from: st1.l$c */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.reading.view.LabradorReadingScreenKt$LabradorReadingScreen$2$1", m100430f = "LabradorReadingScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f137376w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C31809g f137377x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C31809g c31809g, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f137377x = c31809g;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f137377x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f137376w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f137377x.m98817p(InterfaceC31804b.d.f131724a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: st1.l$d */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.reading.view.LabradorReadingScreenKt$LabradorReadingScreen$4$1", m100430f = "LabradorReadingScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lbc3/c0;", "Landroidx/lifecycle/x;", "it", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;Landroidx/lifecycle/x;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f137378w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C31809g f137379x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C31809g c31809g, InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f137379x = c31809g;
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, AbstractC1638x abstractC1638x, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return new d(this.f137379x, interfaceC30057d).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f137378w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f137379x.m98817p(InterfaceC31804b.a.f131721a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: st1.l$e */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.reading.view.LabradorReadingScreenKt$LabradorReadingScreen$7$1", m100430f = "LabradorReadingScreen.kt", m100431l = {AttachmentConstants.MAX_UPLOAD_SIZE_IN_MB}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f137380w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f137381x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f137382y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z4, Function1 function1, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f137381x = z4;
            this.f137382y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f137381x, this.f137382y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f137380w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (this.f137381x) {
                    this.f137380w = 1;
                    if (AbstractC3034m0.m8782b(1500L, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
                return C23454a0.f92919a;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f137382y.invoke(InterfaceC31804b.g.f131726a);
            return C23454a0.f92919a;
        }
    }

    static {
        C30587a[] c30587aArr = {new C30587a(0, 34), new C30587a(1, 43), new C30587a(2, 53), new C30587a(3, 43), new C30587a(4, 30), new C30587a(5, 0), new C30587a(6, -42), new C30587a(7, -74), new C30587a(8, -75), new C30587a(9, -64), new C30587a(10, -58), new C30587a(11, -58), new C30587a(12, -59), new C30587a(13, -6), new C30587a(14, 150), new C30587a(15, 406), new C30587a(16, 505), new C30587a(17, 268), new C30587a(18, -42), new C30587a(19, -219), new C30587a(20, -276), new C30587a(21, -261), new C30587a(22, -209), new C30587a(23, -164), new C30587a(24, -142), new C30587a(25, -99), new C30587a(26, -81), new C30587a(27, -85), new C30587a(28, -57), new C30587a(29, -39), new C30587a(30, -14), new C30587a(31, 22), new C30587a(32, 44), new C30587a(33, 54), new C30587a(34, 65), new C30587a(35, 95), new C30587a(36, 96), new C30587a(37, 86), new C30587a(38, 99), new C30587a(39, 105), new C30587a(40, 84), new C30587a(41, 43), new C30587a(42, 0), new C30587a(43, -55), new C30587a(44, -104), new C30587a(45, -133), new C30587a(46, -151), new C30587a(47, -158), new C30587a(48, -155), new C30587a(49, -124), new C30587a(50, -103), new C30587a(51, -77), new C30587a(52, -30), new C30587a(53, -11), new C30587a(54, 13), new C30587a(55, 26), new C30587a(56, 24), new C30587a(57, 35), new C30587a(58, 42), new C30587a(59, 60), new C30587a(60, 71), new C30587a(61, 74), new C30587a(62, 82), new C30587a(63, 67), new C30587a(64, 63), new C30587a(65, 74), new C30587a(66, 54), new C30587a(67, 33), new C30587a(68, 31), new C30587a(69, 27), new C30587a(70, 32), new C30587a(71, 49), new C30587a(72, 54), new C30587a(73, 39), new C30587a(74, 19), new C30587a(75, 24), new C30587a(76, 31), new C30587a(77, 27), new C30587a(78, 2), new C30587a(79, -3), new C30587a(80, 4), new C30587a(81, -16), new C30587a(82, -22), new C30587a(83, -6), new C30587a(84, 10), new C30587a(85, 15), new C30587a(86, -7), new C30587a(87, -23), new C30587a(88, -14), new C30587a(89, 13), new C30587a(90, 31), new C30587a(91, 31), new C30587a(92, 30), new C30587a(93, 21), new C30587a(94, -17), new C30587a(95, -60), new C30587a(96, -73), new C30587a(97, -67), new C30587a(98, -63), new C30587a(99, -58), new C30587a(100, -41), new C30587a(101, 26), new C30587a(102, 199), new C30587a(103, 423), new C30587a(104, 459), new C30587a(105, 213), new C30587a(106, -60), new C30587a(107, -204), new C30587a(108, -248), new C30587a(109, -248), new C30587a(110, -215), new C30587a(111, -184), new C30587a(112, -155), new C30587a(113, -124), new C30587a(114, -98), new C30587a(115, -59), new C30587a(116, -40), new C30587a(117, -27), new C30587a(118, -19), new C30587a(119, -24), new C30587a(120, 11), new C30587a(121, 64), new C30587a(122, 108), new C30587a(123, 131), new C30587a(124, 142), new C30587a(125, 145), new C30587a(126, 137), new C30587a(127, 127), new C30587a(128, 81), new C30587a(129, 31), new C30587a(130, -7), new C30587a(131, -68), new C30587a(132, -103), new C30587a(133, -125), new C30587a(134, -172), new C30587a(135, -152), new C30587a(136, -101), new C30587a(137, -78), new C30587a(138, -79), new C30587a(139, -93), new C30587a(140, -76), new C30587a(141, -48), new C30587a(142, -42), new C30587a(143, -40), new C30587a(144, -36), new C30587a(145, -10), new C30587a(146, 16), new C30587a(147, 23), new C30587a(148, 23), new C30587a(149, 21), new C30587a(150, 18), new C30587a(151, 15), new C30587a(152, -2), new C30587a(153, 0), new C30587a(154, 18), new C30587a(155, 19), new C30587a(156, 27), new C30587a(157, 36), new C30587a(158, 45), new C30587a(159, 35), new C30587a(160, 20), new C30587a(161, 22), new C30587a(162, 26), new C30587a(163, 27), new C30587a(164, 21), new C30587a(165, 18), new C30587a(166, 25), new C30587a(167, 16), new C30587a(DateTimeConstants.HOURS_PER_WEEK, 23), new C30587a(169, 32), new C30587a(170, 20), new C30587a(171, 21), new C30587a(172, 36), new C30587a(173, 23), new C30587a(174, 14), new C30587a(175, 10), new C30587a(176, -16), new C30587a(177, -15), new C30587a(178, 1), new C30587a(179, 10), new C30587a(180, 7), new C30587a(181, 3), new C30587a(182, 4), new C30587a(183, -6), new C30587a(184, -8), new C30587a(185, 6), new C30587a(186, -10), new C30587a(187, -40), new C30587a(188, -48), new C30587a(189, -61), new C30587a(190, -57), new C30587a(191, -46), new C30587a(192, -19), new C30587a(193, 65), new C30587a(194, 286), new C30587a(195, 532), new C30587a(196, 501), new C30587a(197, 231), new C30587a(198, -51), new C30587a(199, -226), new C30587a(200, -276), new C30587a(201, -252), new C30587a(202, -205), new C30587a(203, -172), new C30587a(204, -134), new C30587a(205, -85), new C30587a(206, -65), new C30587a(207, -71), new C30587a(208, -59), new C30587a(209, -51), new C30587a(210, -45), new C30587a(211, -12), new C30587a(212, 32), new C30587a(213, 62), new C30587a(214, 61), new C30587a(215, 62), new C30587a(216, 70), new C30587a(217, 79), new C30587a(218, 89), new C30587a(219, 86), new C30587a(220, 64), new C30587a(221, 16), new C30587a(222, -38), new C30587a(223, -71), new C30587a(224, -106), new C30587a(225, -118), new C30587a(226, -121), new C30587a(227, -127), new C30587a(228, -115), new C30587a(229, -97), new C30587a(230, -72), new C30587a(231, -64), new C30587a(232, -52), new C30587a(233, -16), new C30587a(234, 1), new C30587a(235, 0), new C30587a(236, 6), new C30587a(237, 4), new C30587a(238, 24), new C30587a(239, 34), new C30587a(240, 23), new C30587a(241, 23), new C30587a(242, 5), new C30587a(243, 2), new C30587a(244, 28), new C30587a(245, 37), new C30587a(246, 53), new C30587a(247, 49), new C30587a(248, 21), new C30587a(249, 17), new C30587a(AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION, 27), new C30587a(251, 47), new C30587a(252, 48), new C30587a(253, 41), new C30587a(254, 31), new C30587a(255, 22), new C30587a(256, 33), new C30587a(257, 29), new C30587a(258, 21), new C30587a(259, 21), new C30587a(260, 33), new C30587a(261, 41), new C30587a(262, 63), new C30587a(263, 41), new C30587a(264, 4), new C30587a(265, 16), new C30587a(266, 12), new C30587a(267, 9), new C30587a(268, 4), new C30587a(269, 9), new C30587a(270, 10), new C30587a(271, 6), new C30587a(272, 15), new C30587a(273, 16), new C30587a(274, 17), new C30587a(275, -4), new C30587a(276, -5), new C30587a(277, 5), new C30587a(278, 12), new C30587a(279, 34), new C30587a(280, 25), new C30587a(281, 0), new C30587a(282, -27), new C30587a(DfuBaseService.NOTIFICATION_ID, -35), new C30587a(284, -52), new C30587a(285, -55), new C30587a(286, -62), new C30587a(287, -61), new C30587a(288, -22), new C30587a(289, 96), new C30587a(290, 354), new C30587a(291, 542), new C30587a(292, 412), new C30587a(293, 119), new C30587a(294, -112), new C30587a(295, -245), new C30587a(296, -279), new C30587a(297, -261), new C30587a(298, -223), new C30587a(299, -181)};
        f137369a = c30587aArr;
        Object[] objArrCopyOf = Arrays.copyOf(c30587aArr, c30587aArr.length);
        AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
        C30587a[] c30587aArr2 = (C30587a[]) objArrCopyOf;
        for (int i13 = 135; i13 < 151; i13++) {
            c30587aArr2[i13] = C30587a.m93824d(c30587aArr2[i13], 0, null, 1, null);
        }
        f137370b = c30587aArr2;
        f137371c = (C30587a[]) AbstractC25260n.m74032H0(AbstractC25260n.m74072m0(150, 299, c30587aArr2), AbstractC25260n.m74072m0(0, 149, c30587aArr2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m104149A(int i13, Composer composer, int i14) {
        m104192y(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    public static final void m104150B(C31809g viewModel, Function1 function1, EnumC17628e enumC17628e, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        EnumC17628e enumC17628e2;
        Function1 function3;
        AbstractC22676k.m65750j(viewModel, "viewModel");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-622186644);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewModel) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87149e(enumC17628e == null ? -1 : enumC17628e.ordinal()) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C32618h3(19);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            EnumC17628e enumC17628e3 = i17 != 0 ? EnumC17628e.RIGHT : enumC17628e;
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(viewModel.getViewState(), InterfaceC31810h.a.INSTANCE.m98830a(), null, c28655q, 0, 2);
            boolean zM87157i = c28655q.m87157i(viewModel);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new c(viewModel, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, viewModel);
            boolean zM87157i2 = c28655q.m87157i(viewModel);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C32355c(viewModel, 2);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R3, false, c28655q, 0, 1);
            m104192y(c28655q, 0);
            EnumC1632v enumC1632v = EnumC1632v.ON_PAUSE;
            boolean zM87157i3 = c28655q.m87157i(viewModel);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i3 || objM87133R4 == c28676v0) {
                objM87133R4 = new d(viewModel, null);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC22392e.m64443d(enumC1632v, (Function3) objM87133R4, c28655q, 6);
            InterfaceC31810h interfaceC31810hM104153E = m104153E(interfaceC28601c1M87260n);
            boolean zM87157i4 = c28655q.m87157i(viewModel) | ((i15 & 112) == 32);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i4 || objM87133R5 == c28676v0) {
                objM87133R5 = new C32469t(4, function3, viewModel);
                c28655q.m87172p0(objM87133R5);
            }
            EnumC17628e enumC17628e4 = enumC17628e3;
            m104151C(interfaceC31810hM104153E, (Function1) objM87133R5, enumC17628e4, c28655q, i15 & 896, 0);
            function2 = function3;
            enumC17628e2 = enumC17628e4;
        } else {
            c28655q.m87138X();
            function2 = function1;
            enumC17628e2 = enumC17628e;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32205b(i13, i14, 15, viewModel, enumC17628e2, function2);
        }
    }

    /* JADX INFO: renamed from: C */
    public static final void m104151C(InterfaceC31810h viewState, Function1 onEvent, EnumC17628e enumC17628e, Composer composer, int i13, int i14) {
        int i15;
        EnumC17628e enumC17628e2;
        EnumC17628e enumC17628e3;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-544061228);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87149e(enumC17628e == null ? -1 : enumC17628e.ordinal()) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            EnumC17628e enumC17628e4 = i16 != 0 ? EnumC17628e.RIGHT : enumC17628e;
            boolean z4 = viewState instanceof InterfaceC31810h.b;
            boolean z13 = z4 && ((InterfaceC31810h.b) viewState).getIsCheckmarkVisible();
            Boolean boolValueOf = Boolean.valueOf(z13);
            boolean zM87155h = ((i15 & 112) == 32) | c28655q.m87155h(z13);
            Object objM87133R = c28655q.m87133R();
            if (zM87155h || objM87133R == C28635l.f115821a) {
                objM87133R = new e(z13, onEvent, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, boolValueOf);
            if (viewState instanceof InterfaceC31810h.a) {
                c28655q.m87150e0(1143187188);
                m104187t((InterfaceC31810h.a) viewState, onEvent, c28655q, i15 & 126);
                c28655q.m87173q(false);
                enumC17628e3 = enumC17628e4;
            } else {
                if (!z4) {
                    throw AbstractC11895b.m32003v(1143185376, c28655q, false);
                }
                c28655q.m87150e0(1079185889);
                Modifier modifierM94757f = AbstractC30802r.m94757f(C2314t.f9131w, 1.0f);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM94757f);
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
                AbstractC32985f.m104131c(0.0f, 0.0f, 0L, 0.0f, 0.0f, 0.0f, c28655q, 0, 63);
                InterfaceC31810h.b bVar = (InterfaceC31810h.b) viewState;
                enumC17628e3 = enumC17628e4;
                m104165Q(bVar, onEvent, enumC17628e3, c28655q, i15 & 1022, 0);
                m104158J(bVar, onEvent, c28655q, i15 & 126);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            enumC17628e2 = enumC17628e3;
        } else {
            c28655q.m87138X();
            enumC17628e2 = enumC17628e;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32205b(i13, i14, 16, viewState, enumC17628e2, onEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m104152D(InterfaceC31804b.e it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E */
    private static final InterfaceC31810h m104153E(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC31810h) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m104154F(C31809g c31809g) {
        c31809g.m98817p(InterfaceC31804b.a.f131721a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m104155G(Function1 function1, C31809g c31809g, InterfaceC31804b event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC31804b.e) {
            function1.invoke(event);
        } else {
            if (!(event instanceof InterfaceC31804b.i)) {
                throw new NoWhenBranchMatchedException();
            }
            c31809g.m98817p((InterfaceC31804b.i) event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m104156H(C31809g c31809g, Function1 function1, EnumC17628e enumC17628e, int i13, int i14, Composer composer, int i15) {
        m104150B(c31809g, function1, enumC17628e, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m104157I(InterfaceC31810h interfaceC31810h, Function1 function1, EnumC17628e enumC17628e, int i13, int i14, Composer composer, int i15) {
        m104151C(interfaceC31810h, function1, enumC17628e, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: J */
    public static final void m104158J(final InterfaceC31810h.b viewState, final Function1 onEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-466501);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            final int i15 = 0;
            AbstractC29125c.m88520b(Boolean.valueOf(viewState.getReadingFailedDialogViewState() != null), null, null, "", AbstractC37817c.m121344e(-1060581958, c28655q, new Function3() { // from class: st1.k
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i16 = i15;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (i16) {
                        case 0:
                            return AbstractC32991l.m104159K(viewState, onEvent, zBooleanValue, composer2, iIntValue);
                        default:
                            return AbstractC32991l.m104162N(viewState, onEvent, zBooleanValue, composer2, iIntValue);
                    }
                }
            }), c28655q, 27648, 6);
            final int i16 = 1;
            AbstractC29125c.m88520b(Boolean.valueOf(viewState.getReadingInitialInconclusiveDialogViewState() != null), null, null, "", AbstractC37817c.m121344e(-886380687, c28655q, new Function3() { // from class: st1.k
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i17 = i16;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (i17) {
                        case 0:
                            return AbstractC32991l.m104159K(viewState, onEvent, zBooleanValue, composer2, iIntValue);
                        default:
                            return AbstractC32991l.m104162N(viewState, onEvent, zBooleanValue, composer2, iIntValue);
                    }
                }
            }), c28655q, 27648, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32848f(viewState, onEvent, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m104159K(InterfaceC31810h.b bVar, Function1 function1, boolean z4, Composer composer, int i13) {
        int i14;
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87155h(z4) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (!c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87138X();
        } else if (!z4 || bVar.getReadingFailedDialogViewState() == null) {
            c28655q.m87150e0(-2016871928);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-2017569614);
            C31805c c31805cM98852u = bVar.getReadingFailedDialogViewState();
            TextResource textResourceM98803e = c31805cM98852u.getTitle();
            TextResource textResourceM98799a = c31805cM98852u.getMessage();
            TextResource textResourceM98800b = c31805cM98852u.getPrimaryButtonText();
            TextResource textResourceM98802d = c31805cM98852u.getSecondaryButtonText();
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(c31805cM98852u);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C32209f(function1, c31805cM98852u, 8);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87153g2 = c28655q.m87153g(function1);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C32458i(function1, 4);
                c28655q.m87172p0(objM87133R2);
            }
            int i15 = TextResource.$stable;
            AbstractC21211n.m59497o(null, textResourceM98803e, textResourceM98799a, textResourceM98800b, false, null, null, null, null, textResourceM98802d, null, false, false, null, null, false, 5, null, null, null, false, null, null, interfaceC4339a, (InterfaceC4339a) objM87133R2, null, null, null, c28655q, (i15 << 3) | (i15 << 6) | (i15 << 9) | (i15 << 27), 384, 0, 243199473);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m104160L(Function1 function1, C31805c c31805c) {
        InterfaceC31804b interfaceC31804bM98801c = c31805c.getSecondaryButtonClickEvent();
        if (interfaceC31804bM98801c == null) {
            interfaceC31804bM98801c = InterfaceC31804b.b.f131722a;
        }
        function1.invoke(interfaceC31804bM98801c);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m104161M(Function1 function1) {
        function1.invoke(InterfaceC31804b.f.f131725a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m104162N(InterfaceC31810h.b bVar, Function1 function1, boolean z4, Composer composer, int i13) {
        int i14;
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87155h(z4) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (!c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87138X();
        } else if (!z4 || bVar.getReadingInitialInconclusiveDialogViewState() == null) {
            c28655q.m87150e0(-707484655);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-707992063);
            C31806d c31806dM98853v = bVar.getReadingInitialInconclusiveDialogViewState();
            TextResource textResourceM98807d = c31806dM98853v.getTitle();
            TextResource textResourceM98804a = c31806dM98853v.getMessage();
            TextResource textResourceM98806c = c31806dM98853v.getPrimaryButtonText();
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(c31806dM98853v);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C32209f(function1, c31806dM98853v, 7);
                c28655q.m87172p0(objM87133R);
            }
            int i15 = TextResource.$stable;
            AbstractC21211n.m59497o(null, textResourceM98807d, textResourceM98804a, textResourceM98806c, false, null, null, null, null, null, null, false, false, null, null, false, 5, null, null, null, false, null, null, null, (InterfaceC4339a) objM87133R, null, null, null, c28655q, (i15 << 3) | (i15 << 6) | (i15 << 9), 384, 0, 251588593);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m104163O(Function1 function1, C31806d c31806d) {
        InterfaceC31804b interfaceC31804bM98805b = c31806d.getPrimaryButtonClickEvent();
        if (interfaceC31804bM98805b == null) {
            interfaceC31804bM98805b = InterfaceC31804b.d.f131724a;
        }
        function1.invoke(interfaceC31804bM98805b);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m104164P(InterfaceC31810h.b bVar, Function1 function1, int i13, Composer composer, int i14) {
        m104158J(bVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Q */
    public static final void m104165Q(InterfaceC31810h.b viewState, Function1 onEvent, EnumC17628e enumC17628e, Composer composer, int i13, int i14) {
        int i15;
        EnumC17628e enumC17628e2;
        float f13;
        boolean z4;
        C2314t c2314t;
        C23454a0 c23454a0;
        int i16;
        Modifier modifierMo3471e;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1637353469);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87149e(enumC17628e == null ? -1 : enumC17628e.ordinal()) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            EnumC17628e enumC17628e3 = i17 != 0 ? EnumC17628e.RIGHT : enumC17628e;
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90656g, C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
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
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            int i18 = i15;
            AbstractC6719b.m20143d(null, new AbstractC6721d.a(viewState.getPageTitle(), null, null, null, null, null, false, null, null, null, null, null, null, null, null, 32766, null), null, null, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 61);
            c28655q = c28655q;
            float f14 = 8;
            AbstractC11266d.m30469w(2, f14, c2314t2, c28655q);
            int i19 = i18 & 14;
            AbstractC32988i.m104147b(viewState, c28655q, i19);
            boolean zM98798e = viewState.getCalibration().getIsCalibrating();
            C23016z c23016z = C23016z.f90757a;
            if (zM98798e) {
                c28655q.m87150e0(-877317308);
                float f15 = 1 * f14;
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c23016z.m66779c(c2314t2, true, 1.0f)), f15, 0.0f, f15, 0.0f, 10);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
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
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t2, "calibrating");
                TextResource textResourceM98797d = viewState.getCalibration().getCalibrationTile();
                int i24 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResourceM98797d, c28655q, i24);
                C38072d c38072d = C38072d.f163053a;
                int i25 = C38072d.f163054b;
                C2886a c2886aM8416N = c38072d.m121952e(c28655q, i25).getT1();
                long jM125430y = c38072d.m121949b(c28655q, i25).getBrandWhite();
                int i26 = C2886a.f11498d << 18;
                f13 = f14;
                AbstractC30795n.m94707h(strM21274h, modifierM3599a, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8416N, null, c28655q, 48, i26, 196600);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getCalibration().getCalibrationBody(), c28655q, i24), null, c38072d.m121949b(c28655q, i25).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i25).getT4(), null, c28655q, 0, i26, 196602);
                c28655q = c28655q;
                i16 = 1;
                c28655q.m87173q(true);
                z4 = false;
                c28655q.m87173q(false);
                c2314t = c2314t2;
            } else {
                f13 = f14;
                z4 = false;
                if (viewState.getIsInstructionImageVisible()) {
                    c28655q.m87150e0(-876311358);
                    Modifier modifierM66779c = c23016z.m66779c(c2314t2, true, 1.0f);
                    if (enumC17628e3 == EnumC17628e.LEFT) {
                        c2314t = c2314t2;
                        modifierMo3471e = modifierM66779c.mo3471e(AbstractC1127a.m3488c(c2314t2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0, 524159));
                    } else {
                        c2314t = c2314t2;
                        modifierMo3471e = modifierM66779c.mo3471e(c2314t);
                    }
                    AbstractC35684p.m113047h(modifierMo3471e, InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC31793e.f131614a)), false, 1.5f, 0, null, null, C39102j.f168202d, null, c28655q, 12585984, 372);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                    i16 = 1;
                } else {
                    c2314t = c2314t2;
                    c28655q.m87150e0(-875788047);
                    List<C30588b> listM98849r = viewState.m98849r();
                    if (listM98849r == null) {
                        c28655q.m87150e0(-875770130);
                        c28655q.m87173q(false);
                        c23454a0 = null;
                    } else {
                        c28655q.m87150e0(-875770129);
                        if (viewState.getIsCheckmarkVisible()) {
                            c28655q.m87150e0(1878117038);
                            AbstractC32987h.m104136c(c23016z.m66779c(AbstractC1102d.m3407d(1.0f, c2314t), true, 1.0f), 0.0f, 0.0f, false, listM98849r, c28655q, 3072, 6);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1878405710);
                            AbstractC32987h.m104136c(c23016z.m66779c(AbstractC1102d.m3407d(1.0f, c2314t), true, 1.0f), 0.0f, 0.0f, false, listM98849r, c28655q, 3072, 6);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                        c23454a0 = C23454a0.f92919a;
                    }
                    if (c23454a0 == null) {
                        c28655q.m87150e0(387412531);
                        i16 = 1;
                        AbstractC22953f.m66715b(c28655q, c23016z.m66779c(c2314t, true, 1.0f));
                    } else {
                        i16 = 1;
                        c28655q.m87150e0(387390769);
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(false);
                }
            }
            AbstractC32982c.m104127e(viewState, c28655q, i19);
            float f16 = f13;
            AbstractC11266d.m30469w(i16, f16, c2314t, c28655q);
            AbstractC32994o.m104219b(viewState, c28655q, i19);
            if (viewState.getIsCheckmarkVisible()) {
                c28655q.m87150e0(-874189811);
                AbstractC25012a.m73388u(16, f16, c2314t, c28655q, z4);
            } else {
                c28655q.m87150e0(-874813996);
                float f17 = 5 * f16;
                Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), f17, f17);
                EnumC27284v enumC27284v = EnumC27284v.TextLarge;
                String strM21274h2 = AbstractC8693b.m21274h(viewState.getPrimaryButtonText(), c28655q, TextResource.$stable);
                long jM125430y2 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite();
                boolean zM87157i = c28655q.m87157i(viewState) | ((i18 & 112) == 32 ? true : z4);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C32209f(6, viewState, onEvent);
                    c28655q.m87172p0(objM87133R);
                }
                C28655q c28655q2 = c28655q;
                AbstractC27282u.m82292h(modifierM3395q, enumC27284v, strM21274h2, false, jM125430y2, null, false, (InterfaceC4339a) objM87133R, c28655q2, 54, 104);
                c28655q = c28655q2;
                c28655q.m87173q(z4);
            }
            c28655q.m87173q(true);
            enumC17628e2 = enumC17628e3;
        } else {
            c28655q.m87138X();
            enumC17628e2 = enumC17628e;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32205b(i13, i14, 14, viewState, enumC17628e2, onEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m104166R(InterfaceC31810h.b bVar, Function1 function1) {
        if (bVar.getReadingUnsuccessful()) {
            function1.invoke(InterfaceC31804b.h.f131727a);
        } else {
            function1.invoke(InterfaceC31804b.a.f131721a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m104167S(InterfaceC31810h.b bVar, Function1 function1, EnumC17628e enumC17628e, int i13, int i14, Composer composer, int i15) {
        m104165Q(bVar, function1, enumC17628e, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private static final void m104187t(final InterfaceC31810h.a aVar, final Function1 function1, Composer composer, int i13) {
        int i14;
        Function1 function2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(21965909);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(aVar) : c28655q.m87157i(aVar) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            boolean z4 = aVar.getType() instanceof AbstractC33208p0.h;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4) {
                c28655q.m87150e0(-1789009932);
                boolean zM87157i = c28655q.m87157i(aVar) | ((i14 & 112) == 32);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    final int i15 = 0;
                    objM87133R = new InterfaceC4339a() { // from class: st1.j
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i15) {
                                case 0:
                                    return AbstractC32991l.m104188u(aVar, function1);
                                case 1:
                                    return AbstractC32991l.m104189v(aVar, function1);
                                default:
                                    return AbstractC32991l.m104190w(aVar, function1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, (InterfaceC4339a) objM87133R, 3, null), aVar.getSupportText(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                c28655q.m87173q(false);
                function2 = function1;
            } else {
                c28655q.m87150e0(-1788705884);
                int i16 = i14;
                AbstractC33208p0 abstractC33208p0M98829l = aVar.getType();
                TextResource textResourceM98828k = aVar.getSupportText();
                TextResource textResourceM98825h = aVar.getPrimaryButtonText();
                int i17 = i16 & 112;
                boolean zM87157i2 = c28655q.m87157i(aVar) | (i17 == 32);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i2 || objM87133R2 == c28676v0) {
                    final int i18 = 1;
                    objM87133R2 = new InterfaceC4339a() { // from class: st1.j
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i18) {
                                case 0:
                                    return AbstractC32991l.m104188u(aVar, function1);
                                case 1:
                                    return AbstractC32991l.m104189v(aVar, function1);
                                default:
                                    return AbstractC32991l.m104190w(aVar, function1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                TextResource textResourceM98827j = aVar.getSecondaryButtonText();
                boolean zM87157i3 = c28655q.m87157i(aVar) | (i17 == 32);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87157i3 || objM87133R3 == c28676v0) {
                    final int i19 = 2;
                    objM87133R3 = new InterfaceC4339a() { // from class: st1.j
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    return AbstractC32991l.m104188u(aVar, function1);
                                case 1:
                                    return AbstractC32991l.m104189v(aVar, function1);
                                default:
                                    return AbstractC32991l.m104190w(aVar, function1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                boolean zM98823f = aVar.getOverlayBackground();
                int i24 = 196608 | AbstractC33208p0.f138461d;
                int i25 = TextResource.$stable;
                AbstractC33199m0.m105214F(abstractC33208p0M98829l, textResourceM98828k, null, textResourceM98825h, interfaceC4339a, true, false, textResourceM98827j, interfaceC4339a2, null, false, zM98823f, c28655q, i24 | (i25 << 3) | (i25 << 9) | (i25 << 21), 0, 1604);
                InterfaceC31804b interfaceC31804bM98822e = aVar.getFollowUpEvent();
                boolean zM87157i4 = c28655q.m87157i(aVar) | (i17 == 32);
                Object objM87133R4 = c28655q.m87133R();
                if (zM87157i4 || objM87133R4 == c28676v0) {
                    function2 = function1;
                    objM87133R4 = new a(aVar, function2, null);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    function2 = function1;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, interfaceC31804bM98822e);
                c28655q.m87173q(false);
            }
        } else {
            function2 = function1;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32848f(aVar, function2, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m104188u(InterfaceC31810h.a aVar, Function1 function1) {
        InterfaceC31804b interfaceC31804bM98822e = aVar.getFollowUpEvent();
        if (interfaceC31804bM98822e != null) {
            function1.invoke(interfaceC31804bM98822e);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m104189v(InterfaceC31810h.a aVar, Function1 function1) {
        InterfaceC31804b interfaceC31804bM98824g = aVar.getPrimaryButtonClickEvent();
        if (interfaceC31804bM98824g != null) {
            function1.invoke(interfaceC31804bM98824g);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m104190w(InterfaceC31810h.a aVar, Function1 function1) {
        InterfaceC31804b interfaceC31804bM98826i = aVar.getSecondaryButtonClickEvent();
        if (interfaceC31804bM98826i != null) {
            function1.invoke(interfaceC31804bM98826i);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m104191x(InterfaceC31810h.a aVar, Function1 function1, int i13, Composer composer, int i14) {
        m104187t(aVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    private static final void m104192y(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-868574075);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            View view = (View) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4980f);
            boolean zM87157i = c28655q.m87157i(view);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C21929g(view, 2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R, c28655q);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30048f(i13, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final InterfaceC28620h0 m104193z(View view, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        view.setKeepScreenOn(true);
        return new b(view);
    }
}
