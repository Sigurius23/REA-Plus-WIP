package xq2;

import androidx.compose.animation.AbstractC1091c;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c51.AbstractC4234k;
import c51.C4242s;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e93.AbstractC12889b;
import ge3.AbstractC15751g;
import iw0.C20986r;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import mq2.AbstractC25890c;
import mq2.C25889b;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p031b9.AbstractC2875y;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p098dt.AbstractC12350b;
import p132f0.C13797j1;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22976l1;
import p291l0.C23010x;
import p291l0.InterfaceC23004v;
import p329n0.AbstractC26071x;
import p329n0.C26061n;
import p329n0.C26062o;
import p329n0.C26068u;
import p329n0.InterfaceC26054g;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p634y1.AbstractC39038k;
import p635y2.InterfaceC39127r0;
import p636y3.C39169a;
import p636y3.C39174f;
import p636y3.InterfaceC39171c;
import p699b70.C2775a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p734sl0.C32643m3;
import p745y81.EnumC39333f;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import wq1.C37508b;
import x81.C38072d;
import xl0.C38448b;

/* JADX INFO: renamed from: xq2.c1 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u000e\u0010\b\u001a'\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a]\u0010%\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0003¢\u0006\u0004\b%\u0010&\u001a]\u0010(\u001a\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0003¢\u0006\u0004\b(\u0010)\u001aK\u00100\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00040\u001f2\u0006\u0010/\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b0\u00101\u001aE\u00109\u001a\u00020\u00042\f\u00104\u001a\b\u0012\u0004\u0012\u000203022\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u0002052\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u00108\u001a\u00020,H\u0003¢\u0006\u0004\b9\u0010:\u001a\u0019\u0010;\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b;\u0010<\u001a!\u0010?\u001a\u00020\u00042\u0006\u0010>\u001a\u00020=2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b?\u0010@\u001a\u001f\u0010C\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010B\u001a\u00020AH\u0003¢\u0006\u0004\bC\u0010D\"\u0014\u0010F\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010\u000e\"\u0014\u0010H\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010\u000e\"\u0014\u0010J\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010\u000e¨\u0006M²\u0006\u000e\u0010\u001e\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010-\u001a\u00020,8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010'\u001a\u0004\u0018\u00010\u000f8\nX\u008a\u0084\u0002²\u0006\u000e\u0010K\u001a\u00020,8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010L\u001a\u00020*8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lxq2/g1;", "viewState", "Ll83/a0;", "e0", "(Landroidx/compose/ui/Modifier;Lxq2/g1;Landroidx/compose/runtime/Composer;II)V", "B", "(Lxq2/g1;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "V", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V", "F", "", "index", "step", "total", "j0", "(III)I", "Ln0/u;", "listState", "Lp1/t2;", "k0", "(Ln0/u;Landroidx/compose/runtime/Composer;I)Lp1/t2;", "Lmq2/b;", "animationCoordinator", "ticksPerStep", "itemWidthPx", "currentCenterIndex", "Lkotlin/Function1;", "setCurrentCenterIndex", "Lxq2/f0;", "scrollController", "Lbc3/c0;", "scope", "R", "(Lmq2/b;IIIILkotlin/jvm/functions/Function1;Lxq2/f0;Lbc3/c0;Landroidx/compose/runtime/Composer;I)V", "centeredIndex", "T", "(Ljava/lang/Integer;IIIILkotlin/jvm/functions/Function1;Lxq2/f0;Lbc3/c0;Landroidx/compose/runtime/Composer;I)V", "", "maxWidth", "", "isInitialPositioned", "setInitialPositioned", "targetIndex", "D", "(FZLkotlin/jvm/functions/Function1;IILxq2/f0;Landroidx/compose/runtime/Composer;I)V", "", "Lxq2/g0;", "ticks", "Ly3/f;", "itemWidthDp", "sidePadDp", "userScrollEnabled", "Z", "(Ljava/util/List;IFFLn0/u;ZLandroidx/compose/runtime/Composer;I)V", "z", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lc51/s;", "amoeba", "u", "(Lc51/s;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lxq2/x;", "tickSpec", "X", "(Landroidx/compose/ui/Modifier;Lxq2/x;Landroidx/compose/runtime/Composer;I)V", "a", "MIN_TICK_WIDTH", "b", "MAX_TICK_WIDTH", "c", "TIMELINE_CONTAINER_HEIGHT", "hasAnimated", "heartbeatScale", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38554c1 {

    /* JADX INFO: renamed from: a */
    private static final float f165899a = 6;

    /* JADX INFO: renamed from: b */
    private static final float f165900b = 16;

    /* JADX INFO: renamed from: c */
    private static final float f165901c = 18 * 4;

    /* JADX INFO: renamed from: xq2.c1$a */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.view.components.steps.inreviewdesignitem.userjourneydesigncomponents.YearInReviewTimelineKt$AmoebaOverlay$1$1", m100430f = "YearInReviewTimeline.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f165902w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f165903x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f165903x = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f165903x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f165902w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!AbstractC38554c1.m123606v(this.f165903x)) {
                AbstractC38554c1.m123607w(this.f165903x, true);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: xq2.c1$b */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.view.components.steps.inreviewdesignitem.userjourneydesigncomponents.YearInReviewTimelineKt$TimelineInitialPositionEffect$1$1", m100430f = "YearInReviewTimeline.kt", m100431l = {441}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ int f165904E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ int f165905F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ Function1 f165906G;

        /* JADX INFO: renamed from: w */
        int f165907w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ float f165908x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f165909y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C38562f0 f165910z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f13, boolean z4, C38562f0 c38562f0, int i13, int i14, Function1 function1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f165908x = f13;
            this.f165909y = z4;
            this.f165910z = c38562f0;
            this.f165904E = i13;
            this.f165905F = i14;
            this.f165906G = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final C23454a0 m123612h(Function1 function1) {
            function1.invoke(Boolean.TRUE);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f165908x, this.f165909y, this.f165910z, this.f165904E, this.f165905F, this.f165906G, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f165907w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (this.f165908x > 0.0f && !this.f165909y) {
                    C38562f0 c38562f0 = this.f165910z;
                    int i14 = this.f165904E;
                    int i15 = this.f165905F;
                    C38557d1 c38557d1 = new C38557d1(this.f165906G, 0);
                    this.f165907w = 1;
                    if (C38562f0.m123630h(c38562f0, i14, i15, false, c38557d1, false, null, this, 48, null) == enumC31071a) {
                        return enumC31071a;
                    }
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

    /* JADX INFO: renamed from: xq2.c1$c */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.view.components.steps.inreviewdesignitem.userjourneydesigncomponents.YearInReviewTimelineKt$TimelineNavEffects$1$1", m100430f = "YearInReviewTimeline.kt", m100431l = {365, 373}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f165911E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C25889b f165912F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ int f165913G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ int f165914H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ InterfaceC28670t2 f165915I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ C38562f0 f165916J;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ int f165917K;

        /* JADX INFO: renamed from: L */
        final /* synthetic */ InterfaceC2994c0 f165918L;

        /* JADX INFO: renamed from: M */
        final /* synthetic */ Function1 f165919M;

        /* JADX INFO: renamed from: w */
        Object f165920w;

        /* JADX INFO: renamed from: x */
        int f165921x;

        /* JADX INFO: renamed from: y */
        int f165922y;

        /* JADX INFO: renamed from: z */
        int f165923z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C25889b c25889b, int i13, int i14, InterfaceC28670t2 interfaceC28670t2, C38562f0 c38562f0, int i15, InterfaceC2994c0 interfaceC2994c0, Function1 function1, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f165912F = c25889b;
            this.f165913G = i13;
            this.f165914H = i14;
            this.f165915I = interfaceC28670t2;
            this.f165916J = c38562f0;
            this.f165917K = i15;
            this.f165918L = interfaceC2994c0;
            this.f165919M = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final C23454a0 m123614h(Function1 function1, int i13, C25889b c25889b) {
            function1.invoke(Integer.valueOf(i13));
            c25889b.m76549g();
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f165912F, this.f165913G, this.f165914H, this.f165915I, this.f165916J, this.f165917K, this.f165918L, this.f165919M, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC28601c1 interfaceC28601c1M76548f;
            EnumC38591t enumC38591t;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f165911E;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C25889b c25889b = this.f165912F;
                if (c25889b != null && (interfaceC28601c1M76548f = c25889b.getCurrentDirection()) != null && (enumC38591t = (EnumC38591t) interfaceC28601c1M76548f.getValue()) != null && ((enumC38591t == EnumC38591t.FORWARD || enumC38591t == EnumC38591t.BACKWARD) && this.f165913G > 0 && this.f165914H > 0)) {
                    this.f165920w = enumC38591t;
                    this.f165911E = 1;
                    if (AbstractC3034m0.m8782b(200L, this) == enumC31071a) {
                    }
                    return enumC31071a;
                }
                return c23454a0;
            }
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            }
            enumC38591t = (EnumC38591t) this.f165920w;
            AbstractC34132o.m107864I(obj);
            int i14 = enumC38591t == EnumC38591t.FORWARD ? this.f165913G : -this.f165913G;
            int iM36284n = AbstractC12889b.m36284n(((Number) this.f165915I.getValue()).intValue() + i14, 0, this.f165914H - 1);
            final int iM123592j0 = AbstractC38554c1.m123592j0(iM36284n, this.f165913G, this.f165914H);
            if (iM123592j0 != ((Number) this.f165915I.getValue()).intValue()) {
                InterfaceC3027k1 interfaceC3027k1M123636e = this.f165916J.m123636e();
                if (interfaceC3027k1M123636e != null) {
                    interfaceC3027k1M123636e.cancel((CancellationException) null);
                }
                C38562f0 c38562f0 = this.f165916J;
                int i15 = this.f165917K;
                final Function1 function1 = this.f165919M;
                final C25889b c25889b2 = this.f165912F;
                InterfaceC4339a interfaceC4339a = new InterfaceC4339a() { // from class: xq2.e1
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        return AbstractC38554c1.c.m123614h(function1, iM123592j0, c25889b2);
                    }
                };
                InterfaceC2994c0 interfaceC2994c0 = this.f165918L;
                this.f165920w = null;
                this.f165921x = i14;
                this.f165922y = iM36284n;
                this.f165923z = iM123592j0;
                this.f165911E = 2;
                if (c38562f0.m123638g(iM123592j0, i15, true, interfaceC4339a, true, interfaceC2994c0, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                this.f165912F.m76549g();
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: xq2.c1$d */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.view.components.steps.inreviewdesignitem.userjourneydesigncomponents.YearInReviewTimelineKt$TimelineSnapEffects$1$1", m100430f = "YearInReviewTimeline.kt", m100431l = {409}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC2994c0 f165924E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ int f165925F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ int f165926G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ int f165927H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ Function1 f165928I;

        /* JADX INFO: renamed from: w */
        int f165929w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Integer f165930x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f165931y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C38562f0 f165932z;

        /* JADX INFO: renamed from: xq2.c1$d$a */
        @InterfaceC32271e(m100429c = "com.whoop.user.journey.view.components.steps.inreviewdesignitem.userjourneydesigncomponents.YearInReviewTimelineKt$TimelineSnapEffects$1$1$1", m100430f = "YearInReviewTimeline.kt", m100431l = {411, 419}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ Integer f165933E;

            /* JADX INFO: renamed from: F */
            final /* synthetic */ int f165934F;

            /* JADX INFO: renamed from: G */
            final /* synthetic */ int f165935G;

            /* JADX INFO: renamed from: H */
            final /* synthetic */ int f165936H;

            /* JADX INFO: renamed from: I */
            final /* synthetic */ Function1 f165937I;

            /* JADX INFO: renamed from: w */
            int f165938w;

            /* JADX INFO: renamed from: x */
            int f165939x;

            /* JADX INFO: renamed from: y */
            int f165940y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C38562f0 f165941z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C38562f0 c38562f0, Integer num, int i13, int i14, int i15, Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f165941z = c38562f0;
                this.f165933E = num;
                this.f165934F = i13;
                this.f165935G = i14;
                this.f165936H = i15;
                this.f165937I = function1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: h */
            public static final C23454a0 m123616h(Function1 function1, int i13) {
                function1.invoke(Integer.valueOf(i13));
                return C23454a0.f92919a;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f165941z, this.f165933E, this.f165934F, this.f165935G, this.f165936H, this.f165937I, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                Integer numM123635d;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f165940y;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f165940y = 1;
                    if (AbstractC3034m0.m8782b(250L, this) != enumC31071a) {
                    }
                    return enumC31071a;
                }
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                if (!this.f165941z.m123634c() && !this.f165941z.m123637f()) {
                    int iIntValue = this.f165933E.intValue();
                    int i14 = this.f165934F;
                    final int i15 = (iIntValue / i14) * i14;
                    int iAbs = Math.abs(i15 - this.f165935G);
                    if (i15 != this.f165935G && (((numM123635d = this.f165941z.m123635d()) == null || i15 != numM123635d.intValue()) && iAbs >= 1)) {
                        C38562f0 c38562f0 = this.f165941z;
                        int i16 = this.f165936H;
                        final Function1 function1 = this.f165937I;
                        InterfaceC4339a interfaceC4339a = new InterfaceC4339a() { // from class: xq2.f1
                            @Override // c93.InterfaceC4339a
                            public final Object invoke() {
                                return AbstractC38554c1.d.a.m123616h(function1, i15);
                            }
                        };
                        this.f165938w = i15;
                        this.f165939x = iAbs;
                        this.f165940y = 2;
                        if (C38562f0.m123630h(c38562f0, i15, i16, true, interfaceC4339a, false, null, this, 48, null) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                }
                return c23454a0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Integer num, int i13, C38562f0 c38562f0, InterfaceC2994c0 interfaceC2994c0, int i14, int i15, int i16, Function1 function1, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f165930x = num;
            this.f165931y = i13;
            this.f165932z = c38562f0;
            this.f165924E = interfaceC2994c0;
            this.f165925F = i14;
            this.f165926G = i15;
            this.f165927H = i16;
            this.f165928I = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f165930x, this.f165931y, this.f165932z, this.f165924E, this.f165925F, this.f165926G, this.f165927H, this.f165928I, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f165929w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (this.f165930x != null && this.f165931y != 0 && !this.f165932z.m123634c() && !this.f165932z.m123637f()) {
                    InterfaceC3027k1 interfaceC3027k1M123636e = this.f165932z.m123636e();
                    if (interfaceC3027k1M123636e != null) {
                        this.f165929w = 1;
                        if (AbstractC3006f0.m8716j(interfaceC3027k1M123636e, this) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                }
                return c23454a0;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C38562f0 c38562f0 = this.f165932z;
            c38562f0.m123639l(AbstractC3006f0.m8732z(this.f165924E, null, null, new a(c38562f0, this.f165930x, this.f165925F, this.f165926G, this.f165927H, this.f165928I, null), 3));
            return c23454a0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m123547A(Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m123610z(modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    private static final void m123548B(C38566g1 c38566g1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1257563977);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(c38566g1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            m123552F(c38566g1, c28655q, i14 & 14);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C38604z0(c38566g1, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m123549C(C38566g1 c38566g1, int i13, Composer composer, int i14) {
        m123548B(c38566g1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    private static final void m123550D(final float f13, final boolean z4, final Function1 function1, final int i13, final int i14, final C38562f0 c38562f0, Composer composer, final int i15) {
        float f14;
        int i16;
        boolean z13;
        Function1 function2;
        int i17;
        int i18;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2088226899);
        if ((i15 & 6) == 0) {
            f14 = f13;
            i16 = (c28655q.m87147d(f14) ? 4 : 2) | i15;
        } else {
            f14 = f13;
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            z13 = z4;
            i16 |= c28655q.m87155h(z13) ? 32 : 16;
        } else {
            z13 = z4;
        }
        if ((i15 & 384) == 0) {
            function2 = function1;
            i16 |= c28655q.m87157i(function2) ? 256 : 128;
        } else {
            function2 = function1;
        }
        if ((i15 & 3072) == 0) {
            i17 = i13;
            i16 |= c28655q.m87149e(i17) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            i17 = i13;
        }
        if ((i15 & 24576) == 0) {
            i18 = i14;
            i16 |= c28655q.m87149e(i18) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        } else {
            i18 = i14;
        }
        if ((196608 & i15) == 0) {
            i16 |= c28655q.m87157i(c38562f0) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q.m87135U(i16 & 1, (74899 & i16) != 74898)) {
            Object[] objArr = {Float.valueOf(f14), Boolean.valueOf(z13), Integer.valueOf(i17), Integer.valueOf(i18)};
            boolean zM87157i = ((i16 & 14) == 4) | ((i16 & 112) == 32) | c28655q.m87157i(c38562f0) | ((i16 & 7168) == 2048) | ((57344 & i16) == 16384) | ((i16 & 896) == 256);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                b bVar = new b(f13, z13, c38562f0, i17, i18, function2, null);
                c28655q.m87172p0(bVar);
                objM87133R = bVar;
            }
            AbstractC28683x.m87256j(objArr, (InterfaceC4351m) objM87133R, c28655q);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: xq2.x0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC38554c1.m123551E(f13, z4, function1, i13, i14, c38562f0, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m123551E(float f13, boolean z4, Function1 function1, int i13, int i14, C38562f0 c38562f0, int i15, Composer composer, int i16) {
        m123550D(f13, z4, function1, i13, i14, c38562f0, composer, AbstractC28683x.m87244L(i15 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F */
    private static final void m123552F(final C38566g1 c38566g1, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1351036137);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(c38566g1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            final InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
            final C25889b c25889b = (C25889b) c28655q2.m87161k(AbstractC25890c.m76553c());
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q2);
                c28655q2.m87172p0(objM87133R);
            }
            final InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            final C26068u c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q2, 3);
            final int iM123648c = c38566g1.getTicksPerStep();
            final List<C38565g0> listM123647b = c38566g1.m123647b();
            final int size = listM123647b.size();
            boolean zM87149e = c28655q2.m87149e(size) | c28655q2.m87149e(iM123648c);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87149e || objM87133R2 == c28676v0) {
                objM87133R2 = Integer.valueOf(size == 0 ? 0 : ((size / 2) / iM123648c) * iM123648c);
                c28655q2.m87172p0(objM87133R2);
            }
            int iIntValue = ((Number) objM87133R2).intValue();
            Object[] objArr = new Object[0];
            boolean zM87149e2 = c28655q2.m87149e(iIntValue);
            Object objM87133R3 = c28655q2.m87133R();
            if (zM87149e2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C20986r(iIntValue, 2);
                c28655q2.m87172p0(objM87133R3);
            }
            final InterfaceC28593a1 interfaceC28593a1 = (InterfaceC28593a1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) objM87133R3, c28655q2, 0);
            Object objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R4);
            }
            final InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R4;
            boolean zM87153g = c28655q2.m87153g(c26068uM77569a);
            Object objM87133R5 = c28655q2.m87133R();
            if (zM87153g || objM87133R5 == c28676v0) {
                objM87133R5 = new C38562f0(c26068uM77569a);
                c28655q2.m87172p0(objM87133R5);
            }
            final C38562f0 c38562f0 = (C38562f0) objM87133R5;
            final InterfaceC28670t2 interfaceC28670t2M123594k0 = m123594k0(c26068uM77569a, c28655q2, 0);
            c28655q = c28655q2;
            AbstractC22953f.m66714a(AbstractC37056f.m118995s(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), null, 3)), C2299e.f9102E, false, AbstractC37817c.m121344e(-1770458049, c28655q2, new Function3() { // from class: xq2.a1
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue2 = ((Integer) obj3).intValue();
                    return AbstractC38554c1.m123560N(interfaceC39171c, c25889b, iM123648c, size, interfaceC28593a1, c38562f0, interfaceC2994c0, interfaceC28670t2M123594k0, interfaceC28601c1, listM123647b, c26068uM77569a, c38566g1, (InterfaceC23004v) obj, (Composer) obj2, iIntValue2);
                }
            }), c28655q, 3126, 4);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C38604z0(c38566g1, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final InterfaceC28593a1 m123553G(int i13) {
        return new C28621h1(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m123554H(C38566g1 c38566g1, int i13, Composer composer, int i14) {
        m123552F(c38566g1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: I */
    private static final int m123555I(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: J */
    private static final void m123556J(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: renamed from: K */
    private static final boolean m123557K(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: L */
    private static final void m123558L(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: M */
    private static final Integer m123559M(InterfaceC28670t2 interfaceC28670t2) {
        return (Integer) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m123560N(InterfaceC39171c interfaceC39171c, C25889b c25889b, int i13, int i14, final InterfaceC28593a1 interfaceC28593a1, C38562f0 c38562f0, InterfaceC2994c0 interfaceC2994c0, InterfaceC28670t2 interfaceC28670t2, InterfaceC28601c1 interfaceC28601c1, List list, C26068u c26068u, C38566g1 c38566g1, InterfaceC23004v BoxWithConstraints, Composer composer, int i15) {
        int i16;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i15 & 6) == 0) {
            i16 = i15 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2);
        } else {
            i16 = i15;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i16 & 1, (i16 & 19) != 18)) {
            float fM124765i = C39169a.m124765i(((C1101c) BoxWithConstraints).f4585b);
            float fMo734f0 = interfaceC39171c.mo734f0(fM124765i);
            boolean zM87147d = c28655q.m87147d(fMo734f0);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87147d || objM87133R == c28676v0) {
                objM87133R = new C39174f(((C39174f) AbstractC12889b.m36289s(new C39174f(fMo734f0 / 50.0f), new C39174f(f165899a), new C39174f(f165900b))).f168413w);
                c28655q.m87172p0(objM87133R);
            }
            float f13 = ((C39174f) objM87133R).f168413w;
            float fMo743q0 = interfaceC39171c.mo743q0(f13);
            boolean zM87147d2 = c28655q.m87147d(fMo734f0) | c28655q.m87147d(f13);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87147d2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C39174f((fMo734f0 / 2.0f) - f13);
                c28655q.m87172p0(objM87133R2);
            }
            float f14 = ((C39174f) objM87133R2).f168413w;
            int i17 = (int) fMo743q0;
            int iM123555I = m123555I(interfaceC28593a1);
            boolean zM87153g = c28655q.m87153g(interfaceC28593a1);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87153g || objM87133R3 == c28676v0) {
                final int i18 = 0;
                objM87133R3 = new Function1() { // from class: xq2.b1
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i19 = i18;
                        int iIntValue = ((Integer) obj).intValue();
                        switch (i19) {
                            case 0:
                                return AbstractC38554c1.m123561O(interfaceC28593a1, iIntValue);
                            default:
                                return AbstractC38554c1.m123562P(interfaceC28593a1, iIntValue);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            m123564R(c25889b, i13, i14, i17, iM123555I, (Function1) objM87133R3, c38562f0, interfaceC2994c0, c28655q, 0);
            Integer numM123559M = m123559M(interfaceC28670t2);
            int iM123555I2 = m123555I(interfaceC28593a1);
            boolean zM87153g2 = c28655q.m87153g(interfaceC28593a1);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87153g2 || objM87133R4 == c28676v0) {
                final int i19 = 1;
                objM87133R4 = new Function1() { // from class: xq2.b1
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i110 = i19;
                        int iIntValue = ((Integer) obj).intValue();
                        switch (i110) {
                            case 0:
                                return AbstractC38554c1.m123561O(interfaceC28593a1, iIntValue);
                            default:
                                return AbstractC38554c1.m123562P(interfaceC28593a1, iIntValue);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            }
            m123566T(numM123559M, i13, i14, i17, iM123555I2, (Function1) objM87133R4, c38562f0, interfaceC2994c0, c28655q, 0);
            boolean zM123557K = m123557K(interfaceC28601c1);
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = new C38547a0(interfaceC28601c1, 1);
                c28655q.m87172p0(objM87133R5);
            }
            m123550D(fM124765i, zM123557K, (Function1) objM87133R5, m123555I(interfaceC28593a1), i17, c38562f0, c28655q, 384);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3419p = AbstractC1102d.m3419p(f165901c, AbstractC1102d.m3409f(1.0f, c2314t));
            C2307m c2307m = C2299e.f9102E;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3419p);
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
            m123572Z(list, i14, f13, f14, c26068u, false, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21);
            C4242s c4242sM123646a = c38566g1.getAmoeba();
            C1100b c1100b = C1100b.f4583a;
            if (c4242sM123646a != null) {
                c28655q.m87150e0(-6156370);
                m123605u(c38566g1.getAmoeba(), c1100b.mo3400a(c2314t, c2307m), c28655q, C4242s.f17232p, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-5978182);
                m123610z(c1100b.mo3400a(c2314t, c2307m), c28655q, 0, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m123561O(InterfaceC28593a1 interfaceC28593a1, int i13) {
        m123556J(interfaceC28593a1, i13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m123562P(InterfaceC28593a1 interfaceC28593a1, int i13) {
        m123556J(interfaceC28593a1, i13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m123563Q(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        m123558L(interfaceC28601c1, z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: R */
    private static final void m123564R(C25889b c25889b, int i13, int i14, int i15, int i16, Function1 function1, C38562f0 c38562f0, InterfaceC2994c0 interfaceC2994c0, Composer composer, int i17) {
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        Function1 function2;
        InterfaceC28601c1 interfaceC28601c1M76548f;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-191908934);
        if ((i17 & 6) == 0) {
            i18 = (c28655q.m87157i(c25889b) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 48) == 0) {
            i19 = i13;
            i18 |= c28655q.m87149e(i19) ? 32 : 16;
        } else {
            i19 = i13;
        }
        if ((i17 & 384) == 0) {
            i24 = i14;
            i18 |= c28655q.m87149e(i24) ? 256 : 128;
        } else {
            i24 = i14;
        }
        if ((i17 & 3072) == 0) {
            i25 = i15;
            i18 |= c28655q.m87149e(i25) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            i25 = i15;
        }
        if ((i17 & 24576) == 0) {
            i26 = i16;
            i18 |= c28655q.m87149e(i26) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        } else {
            i26 = i16;
        }
        if ((196608 & i17) == 0) {
            function2 = function1;
            i18 |= c28655q.m87157i(function2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        } else {
            function2 = function1;
        }
        if ((1572864 & i17) == 0) {
            i18 |= c28655q.m87157i(c38562f0) ? 1048576 : 524288;
        }
        if ((12582912 & i17) == 0) {
            i18 |= c28655q.m87157i(interfaceC2994c0) ? 8388608 : 4194304;
        }
        if (c28655q.m87135U(i18 & 1, (4793491 & i18) != 4793490)) {
            InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(Integer.valueOf(i26), c28655q);
            Object[] objArr = {(c25889b == null || (interfaceC28601c1M76548f = c25889b.getCurrentDirection()) == null) ? null : (EnumC38591t) interfaceC28601c1M76548f.getValue(), Integer.valueOf(i19), Integer.valueOf(i24), Integer.valueOf(i25)};
            boolean zM87157i = c28655q.m87157i(c25889b) | ((i18 & 112) == 32) | ((i18 & 896) == 256) | c28655q.m87153g(interfaceC28601c1M87238F) | c28655q.m87157i(c38562f0) | ((i18 & 7168) == 2048) | ((i18 & 458752) == 131072) | c28655q.m87157i(interfaceC2994c0);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                c cVar = new c(c25889b, i19, i24, interfaceC28601c1M87238F, c38562f0, i25, interfaceC2994c0, function2, null);
                c28655q.m87172p0(cVar);
                objM87133R = cVar;
            }
            AbstractC28683x.m87256j(objArr, (InterfaceC4351m) objM87133R, c28655q);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C38598w0(c25889b, i13, i14, i15, i26, function1, c38562f0, interfaceC2994c0, i17, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m123565S(C25889b c25889b, int i13, int i14, int i15, int i16, Function1 function1, C38562f0 c38562f0, InterfaceC2994c0 interfaceC2994c0, int i17, Composer composer, int i18) {
        m123564R(c25889b, i13, i14, i15, i16, function1, c38562f0, interfaceC2994c0, composer, AbstractC28683x.m87244L(i17 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: T */
    private static final void m123566T(Integer num, int i13, int i14, int i15, int i16, Function1 function1, C38562f0 c38562f0, InterfaceC2994c0 interfaceC2994c0, Composer composer, int i17) {
        int i18;
        int i19;
        int i24;
        int i25;
        Function1 function2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-529508124);
        if ((i17 & 6) == 0) {
            i18 = (c28655q.m87153g(num) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 48) == 0) {
            i18 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        if ((i17 & 384) == 0) {
            i19 = i14;
            i18 |= c28655q.m87149e(i19) ? 256 : 128;
        } else {
            i19 = i14;
        }
        if ((i17 & 3072) == 0) {
            i24 = i15;
            i18 |= c28655q.m87149e(i24) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            i24 = i15;
        }
        if ((i17 & 24576) == 0) {
            i25 = i16;
            i18 |= c28655q.m87149e(i25) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        } else {
            i25 = i16;
        }
        if ((196608 & i17) == 0) {
            function2 = function1;
            i18 |= c28655q.m87157i(function2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        } else {
            function2 = function1;
        }
        if ((i17 & 1572864) == 0) {
            i18 |= c28655q.m87157i(c38562f0) ? 1048576 : 524288;
        }
        if ((i17 & 12582912) == 0) {
            i18 |= c28655q.m87157i(interfaceC2994c0) ? 8388608 : 4194304;
        }
        if (c28655q.m87135U(i18 & 1, (i18 & 4793491) != 4793490)) {
            Object[] objArr = {num, Integer.valueOf(i13), Integer.valueOf(i19), Integer.valueOf(i24)};
            boolean zM87157i = ((i18 & 14) == 4) | ((i18 & 896) == 256) | c28655q.m87157i(c38562f0) | c28655q.m87157i(interfaceC2994c0) | ((i18 & 112) == 32) | ((57344 & i18) == 16384) | ((i18 & 7168) == 2048) | ((i18 & 458752) == 131072);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                d dVar = new d(num, i19, c38562f0, interfaceC2994c0, i13, i25, i15, function2, null);
                c28655q.m87172p0(dVar);
                objM87133R = dVar;
            }
            AbstractC28683x.m87256j(objArr, (InterfaceC4351m) objM87133R, c28655q);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C38598w0(num, i13, i14, i15, i16, function1, c38562f0, interfaceC2994c0, i17, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m123567U(Integer num, int i13, int i14, int i15, int i16, Function1 function1, C38562f0 c38562f0, InterfaceC2994c0 interfaceC2994c0, int i17, Composer composer, int i18) {
        m123566T(num, i13, i14, i15, i16, function1, c38562f0, interfaceC2994c0, composer, AbstractC28683x.m87244L(i17 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: V */
    private static final void m123568V(TextResource textResource, TextResource textResource2, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1714051241);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(textResource) : c28655q.m87157i(textResource) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(textResource2) : c28655q.m87157i(textResource2) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            Modifier modifierM3355a = AbstractC1091c.m3355a(C2314t.f9131w, null, 3);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 0.5d) * 8), C2299e.f9111N, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3355a);
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
            int i16 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, i16 | (i15 & 14));
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            C2886a c2886aM8437r = c38072d.m121952e(c28655q, i17).getH4();
            long jM125430y = c38072d.m121949b(c28655q, i17).getBrandWhite();
            int i18 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q, 0, i18, 196602);
            c28655q = c28655q;
            if (AbstractC22676k.m65745e(textResource2, AbstractC8693b.m21267a())) {
                c28655q.m87150e0(328490223);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(328315972);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q, i16 | ((i15 >> 3) & 14)), null, c38072d.m121949b(c28655q, i17).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB2(), null, c28655q, 0, i18, 196602);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C38572j0(textResource, textResource2, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m123569W(TextResource textResource, TextResource textResource2, int i13, Composer composer, int i14) {
        m123568V(textResource, textResource2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: X */
    private static final void m123570X(Modifier modifier, C38599x c38599x, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1974021370);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(c38599x) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            float f13 = 4;
            AbstractC22989q.m66760a(AbstractC31061c.m95629e(AbstractC1102d.m3411h(c38599x.getHeight(), AbstractC1102d.m3424u(c38599x.getWidth(), modifier)), f13, f13, c38599x.getColor().mo134584toComposableColorWaAFU9c(c28655q, 0)), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C38572j0(modifier, c38599x, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m123571Y(Modifier modifier, C38599x c38599x, int i13, Composer composer, int i14) {
        m123570X(modifier, c38599x, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Z */
    private static final void m123572Z(List<C38565g0> list, int i13, float f13, float f14, C26068u c26068u, boolean z4, Composer composer, int i14) {
        int i15;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(2100143315);
        if ((i14 & 6) == 0) {
            i15 = (c28655q2.m87157i(list) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q2.m87149e(i13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q2.m87147d(f13) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= c28655q2.m87147d(f14) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            i15 |= c28655q2.m87153g(c26068u) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i14) == 0) {
            i15 |= c28655q2.m87155h(z4) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q2.m87135U(i15 & 1, (74899 & i15) != 74898)) {
            C22976l1 c22976l1M3379a = AbstractC1099a.m3379a(f14, 0.0f, 2);
            C22971k c22971kM66746i = AbstractC22977m.m66746i(0);
            C2306l c2306l = C2299e.f9108K;
            boolean zM87157i = ((i15 & 112) == 32) | ((i15 & 896) == 256) | c28655q2.m87157i(list);
            Object objM87133R = c28655q2.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C13797j1(f13, list, i13);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q = c28655q2;
            AbstractC22674j.m65718d(null, c26068u, c22976l1M3379a, c22971kM66746i, c2306l, null, z4, null, (Function1) objM87133R, c28655q, ((i15 >> 9) & 112) | 221184 | ((i15 << 6) & 29360128), 329);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32643m3(list, i13, f13, f14, c26068u, z4, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m123574a0(int i13, final float f13, final List list, InterfaceC26064q LazyRow) {
        AbstractC22676k.m65750j(LazyRow, "$this$LazyRow");
        InterfaceC26064q.m77555a(LazyRow, i13, new C38448b(13), new C37816b(new InterfaceC4352n() { // from class: xq2.y0
            @Override // c93.InterfaceC4352n
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                int iIntValue = ((Integer) obj4).intValue();
                return AbstractC38554c1.m123578c0(f13, list, (InterfaceC1103a) obj, ((Integer) obj2).intValue(), (Composer) obj3, iIntValue);
            }
        }, true, 1163562623), 4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final Object m123576b0(int i13) {
        return AbstractC2875y.m8295h(i13, "tick-");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m123578c0(float f13, List list, InterfaceC1103a items, int i13, Composer composer, int i14) {
        AbstractC22676k.m65750j(items, "$this$items");
        if ((i14 & 48) == 0) {
            i14 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 145) != 144)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3424u = AbstractC1102d.m3424u(f13, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3424u);
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
            m123570X(c2314t, ((C38565g0) list.get(i13)).getSpec(), c28655q, 6);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m123580d0(List list, int i13, float f13, float f14, C26068u c26068u, boolean z4, int i14, Composer composer, int i15) {
        m123572Z(list, i13, f13, f14, c26068u, z4, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e0 */
    public static final void m123582e0(Modifier modifier, C38566g1 viewState, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-989321443);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(viewState) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 0.5d) * 8), C2299e.f9111N, c28655q, 54);
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
            m123548B(viewState, c28655q, (i15 >> 3) & 14);
            TextResource textResourceM123650e = viewState.getTitle();
            TextResource textResourceM123649d = viewState.getSubtitle();
            int i17 = TextResource.$stable;
            m123568V(textResourceM123650e, textResourceM123649d, c28655q, i17 | (i17 << 3));
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37508b(modifier2, i13, viewState, i14, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C23454a0 m123584f0(Modifier modifier, C38566g1 c38566g1, int i13, int i14, Composer composer, int i15) {
        m123582e0(modifier, c38566g1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final int m123592j0(int i13, int i14, int i15) {
        if (i15 <= 0) {
            return 0;
        }
        if (i14 <= 0) {
            return AbstractC12889b.m36284n(i13, 0, i15 - 1);
        }
        int iM36258X = AbstractC12889b.m36258X(i13 / i14) * i14;
        int i16 = i15 - 1;
        if (i16 < 0) {
            i16 = 0;
        }
        return AbstractC12889b.m36284n(iM36258X, 0, i16);
    }

    /* JADX INFO: renamed from: k0 */
    private static final InterfaceC28670t2 m123594k0(C26068u c26068u, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        if (objM87133R == C28635l.f115821a) {
            objM87133R = AbstractC28683x.m87264r(new C38557d1(c26068u, 4));
            c28655q.m87172p0(objM87133R);
        }
        return (InterfaceC28670t2) objM87133R;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: l0 */
    public static final Integer m123596l0(C26068u c26068u) {
        Object next;
        C26061n c26061nM77565h = c26068u.m77565h();
        if (!c26061nM77565h.f103177k.isEmpty()) {
            int iM77537e = (((int) (c26061nM77565h.m77537e() >> 32)) / 2) + c26061nM77565h.f103178l;
            Iterator it = ((Iterable) c26061nM77565h.f103177k).iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    C26062o c26062o = (C26062o) ((InterfaceC26054g) next);
                    int iAbs = Math.abs(((c26062o.f103199p / 2) + c26062o.f103198o) - iM77537e);
                    do {
                        Object next2 = it.next();
                        C26062o c26062o2 = (C26062o) ((InterfaceC26054g) next2);
                        int iAbs2 = Math.abs(((c26062o2.f103199p / 2) + c26062o2.f103198o) - iM77537e);
                        if (iAbs > iAbs2) {
                            next = next2;
                            iAbs = iAbs2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            InterfaceC26054g interfaceC26054g = (InterfaceC26054g) next;
            if (interfaceC26054g != null) {
                return Integer.valueOf(((C26062o) interfaceC26054g).f103184a);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:57:0x0119  */
    /* JADX WARN: Code duplicated, block: B:58:0x011d  */
    /* JADX WARN: Code duplicated, block: B:63:0x013e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0172  */
    /* JADX WARN: Code duplicated, block: B:68:0x017b  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
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
    /* JADX INFO: renamed from: u */
    private static final void m123605u(C4242s c4242s, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier3;
        boolean z13;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        boolean zM87153g;
        Object objM87133R2;
        float f13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1481870248);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c4242s) : c28655q.m87157i(c4242s) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier2;
                }
                if ((i15 & 14) != 4 || ((i15 & 8) != 0 && c28655q.m87153g(c4242s))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                zM87153g = c28655q.m87153g(interfaceC28601c1);
                objM87133R2 = c28655q.m87133R();
                if (zM87153g || objM87133R2 == c28676v0) {
                    objM87133R2 = new a(interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R2);
                }
                int i17 = C4242s.f17232p;
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c4242s);
                if (m123606v(interfaceC28601c1)) {
                    f13 = 1.0f;
                } else {
                    f13 = 1.15f;
                }
                Modifier modifierM3411h = AbstractC1102d.m3411h(c4242s.m13250r(), AbstractC1102d.m3424u(c4242s.m13251s(), AbstractC12350b.m34565N(m123608x(AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(1000, 0, null, 6), "heartbeat_scale", null, c28655q, 3120, 20)), modifier3)));
                long jM51517e = AbstractC17918w0.m51517e(4278585358L);
                C33252i c33252i = AbstractC33253j.f138651a;
                Modifier modifierM44455h = AbstractC15751g.m44455h(AbstractC1092a.m3358c(modifierM3411h, jM51517e, c33252i), 1, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), c33252i);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44455h);
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
                AbstractC4234k.m13178q(null, AbstractC1099a.m3392n(c2314t, 0.0f, 2 * 4, 1), null, AbstractC12350b.m34565N(1.4f, c2314t), null, null, c4242s, c28655q, (i17 << 18) | 3120 | ((i15 << 18) & 3670016), 53);
                c28655q = c28655q;
                c28655q.m87173q(true);
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C37508b(c4242s, i13, modifier2, i14, 11);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier2;
            }
            if ((i15 & 14) != 4) {
                z13 = true;
            } else {
                z13 = true;
            }
            objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (z13) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            zM87153g = c28655q.m87153g(interfaceC28601c1);
            objM87133R2 = c28655q.m87133R();
            if (zM87153g) {
                objM87133R2 = new a(interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new a(interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R2);
            }
            int i18 = C4242s.f17232p;
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c4242s);
            if (m123606v(interfaceC28601c1)) {
                f13 = 1.0f;
            } else {
                f13 = 1.15f;
            }
            Modifier modifierM3411h2 = AbstractC1102d.m3411h(c4242s.m13250r(), AbstractC1102d.m3424u(c4242s.m13251s(), AbstractC12350b.m34565N(m123608x(AbstractC11352g.m30588b(f13, AbstractC11348f.m30574v(1000, 0, null, 6), "heartbeat_scale", null, c28655q, 3120, 20)), modifier3)));
            long jM51517e2 = AbstractC17918w0.m51517e(4278585358L);
            C33252i c33252i2 = AbstractC33253j.f138651a;
            Modifier modifierM44455h2 = AbstractC15751g.m44455h(AbstractC1092a.m3358c(modifierM3411h2, jM51517e2, c33252i2), 1, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), c33252i2);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM44455h2);
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
            AbstractC4234k.m13178q(null, AbstractC1099a.m3392n(c2314t, 0.0f, 2 * 4, 1), null, AbstractC12350b.m34565N(1.4f, c2314t), null, null, c4242s, c28655q, (i18 << 18) | 3120 | ((i15 << 18) & 3670016), 53);
            c28655q = c28655q;
            c28655q.m87173q(true);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37508b(c4242s, i13, modifier2, i14, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final boolean m123606v(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final void m123607w(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: x */
    private static final float m123608x(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m123609y(C4242s c4242s, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m123605u(c4242s, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    private static final void m123610z(Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(284016462);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            float f13 = 4;
            m123570X(modifier, new C38599x(((float) 0.5d) * f13, 7 * f13, EnumC39333f.BRAND_WHITE, null), c28655q, (i15 & 14) | 48);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2775a(i13, i14, 29, modifier);
        }
    }
}
