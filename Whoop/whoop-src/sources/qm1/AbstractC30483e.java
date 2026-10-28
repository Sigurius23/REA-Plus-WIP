package qm1;

import a81.C0556g;
import android.content.Context;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.animation.AbstractC1091c;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import aw0.C2108h;
import b30.C2549j2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.home.domain.models.BorderAnimation;
import com.whoop.home.domain.models.ContainerBorderStyle;
import com.whoop.home.domain.models.CustomAnimationContainerViewState;
import com.whoop.home.domain.models.DayZeroCardsViewState;
import d11.AbstractC11471f;
import d11.C11475j;
import fi0.InterfaceC14515a;
import g40.C15348f0;
import gb1.AbstractC15673b0;
import gb1.AbstractC15676d;
import ge3.AbstractC15751g;
import gy0.AbstractC16276e;
import h01.C16550q;
import h01.EnumC16533a;
import java.util.Iterator;
import java.util.List;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23459e;
import l83.InterfaceC23462h;
import m01.AbstractC24879g;
import nf3.C26669a;
import no.nordicsemi.android.dfu.DfuBaseService;
import om1.C28029c;
import om1.C28030d;
import om1.C28031e;
import om1.C28032f;
import om1.C28033g;
import om1.C28034h;
import om1.InterfaceC28027a;
import om1.InterfaceC28028b;
import oq1.C28119c;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p040c0.AbstractC3730c1;
import p040c0.AbstractC3736e1;
import p040c0.AbstractC3788w0;
import p040c0.InterfaceC3747i0;
import p043c4.AbstractC3975r;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p077d0.AbstractC11391p2;
import p077d0.C11347e2;
import p077d0.C11362i1;
import p132f0.C13825t;
import p181h2.C16617b;
import p208i2.AbstractC17911t;
import p208i2.C17919x;
import p249jc.AbstractC21598x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22989q;
import p353o0.C27325i;
import p389p0.C28557w0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39147y;
import p636y3.C39174f;
import p710im1.AbstractC18667e0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import pf3.C29155a;
import pm1.C29356a;
import pm1.C29358c;
import q12.C29802c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qa1.C30112a;
import qb0.C30179a;
import qe0.C30301b;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;
import xf3.C38266c;

/* JADX INFO: renamed from: qm1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001aC\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\f*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001aC\u0010&\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010\"2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060$H\u0003¢\u0006\u0004\b&\u0010'¨\u00062²\u0006\f\u0010)\u001a\u00020(8\nX\u008a\u0084\u0002²\u0006\f\u0010+\u001a\u00020*8\nX\u008a\u0084\u0002²\u0006\f\u0010-\u001a\u00020,8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\u0010\u0010.\u001a\u0004\u0018\u00010\"8\n@\nX\u008a\u008e\u0002²\u0006\f\u00100\u001a\u00020/8\nX\u008a\u0084\u0002²\u0006\f\u00101\u001a\u00020/8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/whoop/home/domain/models/DayZeroCardsViewState;", "viewStateFromServer", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "H", "(Landroidx/compose/ui/Modifier;Lcom/whoop/home/domain/models/DayZeroCardsViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lqm1/b;", "viewState", "", "isHomeGlowOn", "Lkotlin/Function2;", "t", "(Landroidx/compose/ui/Modifier;Lqm1/b;ZLc93/m;Landroidx/compose/runtime/Composer;II)V", "Lh01/a;", "S", "(Lh01/a;)Z", "Lom1/a;", "transition", "Lc0/c1;", "Q", "(Lom1/a;)Lc0/c1;", "Lom1/b;", "Lc0/e1;", "R", "(Lom1/b;)Lc0/e1;", "triggerConfetti", "", "animatingCardKey", "Lcom/whoop/home/domain/models/ContainerBorderStyle;", "containerBorderStyle", "Lh2/b;", AnalyticsRequestV2.HEADER_ORIGIN, "Lkotlin/Function0;", "onOriginReset", "p", "(ZLjava/lang/String;Lcom/whoop/home/domain/models/ContainerBorderStyle;Lh2/b;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lfi0/a;", "baseAnalytics", "Lpm1/c;", "viewModel", "confettiOrigin", "Ly3/f;", "borderWidth", "reversedBorderWidth", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30483e {

    /* JADX INFO: renamed from: qm1.e$a */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.dayZeroNotificationCards.view.DayZeroNotificationCardsWrapperKt$DayZeroConfettiEffect$1$1", m100430f = "DayZeroNotificationCardsWrapper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f125252w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC4339a f125253x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f125253x = interfaceC4339a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f125253x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f125252w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f125253x.invoke();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qm1.e$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f125254w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f125255x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f125256y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f125254w = c38266c;
            this.f125255x = interfaceC35951a;
            this.f125256y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            return this.f125254w.m122602a(this.f125256y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), this.f125255x);
        }
    }

    /* JADX INFO: renamed from: qm1.e$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f125257w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f125258x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f125259y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f125257w = c38266c;
            this.f125258x = interfaceC35951a;
            this.f125259y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [fi0.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC14515a invoke() {
            return this.f125257w.m122602a(this.f125259y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), this.f125258x);
        }
    }

    /* JADX INFO: renamed from: qm1.e$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f125260w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f125261x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f125262y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f125263z;

        /* JADX INFO: renamed from: qm1.e$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f125264w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C21647a c21647a) {
                super(0);
                this.f125264w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f125264w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f125260w = c38266c;
            this.f125261x = interfaceC35951a;
            this.f125262y = interfaceC4339a;
            this.f125263z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, pm1.c] */
        @Override // c93.InterfaceC4339a
        public final C29358c invoke() {
            return AbstractC21598x.m60668X(this.f125260w, this.f125261x, new a(this.f125263z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29358c.class), null, this.f125262y);
        }
    }

    /* JADX INFO: renamed from: qm1.e$e */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.dayZeroNotificationCards.view.DayZeroNotificationCardsWrapperKt$DayZeroNotificationCardsWrapper$2$1", m100430f = "DayZeroNotificationCardsWrapper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f125265w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ DayZeroCardsViewState f125266x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC23462h f125267y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(DayZeroCardsViewState dayZeroCardsViewState, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f125266x = dayZeroCardsViewState;
            this.f125267y = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f125266x, this.f125267y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f125265w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC30483e.m93310L(this.f125267y).m89469n(new C29356a(this.f125266x, null, 2, null));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qm1.e$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class f {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f125268a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f125269b;

        static {
            int[] iArr = new int[BorderAnimation.values().length];
            try {
                iArr[BorderAnimation.INITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BorderAnimation.FINAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BorderAnimation.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f125268a = iArr;
            int[] iArr2 = new int[ContainerBorderStyle.values().length];
            try {
                iArr2[ContainerBorderStyle.AI_COACH.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ContainerBorderStyle.ONBOARDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f125269b = iArr2;
        }
    }

    /* JADX INFO: renamed from: A */
    private static final float m93299A(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: renamed from: B */
    private static final float m93300B(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m93301C(InterfaceC28601c1 interfaceC28601c1, InterfaceC39147y coordinates) {
        AbstractC22676k.m65750j(coordinates, "coordinates");
        long jMo3510E = coordinates.mo3510E(0L);
        m93342y(interfaceC28601c1, new C16617b((((long) Float.floatToRawIntBits((((int) (coordinates.mo3541n() >> 32)) / 2.0f) + Float.intBitsToFloat((int) (jMo3510E >> 32)))) << 32) | (((long) Float.floatToRawIntBits((((int) (coordinates.mo3541n() & 4294967295L)) / 2.0f) + Float.intBitsToFloat((int) (jMo3510E & 4294967295L)))) & 4294967295L)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m93302D(CustomAnimationContainerViewState customAnimationContainerViewState, final InterfaceC4351m interfaceC4351m, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        EnumC16533a style;
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        final InterfaceC25312u completed = AbstractC22676k.m65745e(customAnimationContainerViewState.getStatus(), "COMPLETED") ? customAnimationContainerViewState.getCompleted() : customAnimationContainerViewState.getInitial();
        if (completed == null) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-1758865473);
            c28655q.m87173q(false);
        } else {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(-1758865472);
            boolean z4 = completed instanceof C16550q;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4) {
                c28655q2.m87150e0(-698238301);
                C16550q c16550q = (C16550q) completed;
                boolean showBorder = customAnimationContainerViewState.getHighlightCard() ? false : c16550q.getShowBorder();
                if (customAnimationContainerViewState.getHighlightCard()) {
                    style = m93317S(c16550q.getStyle()) ? EnumC16533a.HAL : EnumC16533a.ONBOARDING_BG_GRADIENT;
                } else {
                    style = c16550q.getStyle();
                }
                C16550q c16550qM46793b = C16550q.m46793b(c16550q, null, null, null, null, false, null, style, null, null, null, null, false, showBorder, false, false, null, false, null, null, null, null, 2092991, null);
                C25307p c25307pM54175b = AbstractC18667e0.m54175b();
                boolean zM87153g = c28655q2.m87153g(interfaceC4351m) | c28655q2.m87157i(completed);
                Object objM87133R = c28655q2.m87133R();
                if (zM87153g || objM87133R == c28676v0) {
                    final int i14 = 0;
                    objM87133R = new Function1() { // from class: qm1.d
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i14) {
                                case 0:
                                    return AbstractC30483e.m93303E(interfaceC4351m, completed, obj);
                                default:
                                    return AbstractC30483e.m93304F(interfaceC4351m, completed, obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC25303l.m74291r(c16550qM46793b, c25307pM54175b, null, (Function1) objM87133R, c28655q2, C16550q.f63696v | (C25307p.f99300b << 3), 4);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-698205840);
                C25307p c25307pM54175b2 = AbstractC18667e0.m54175b();
                boolean zM87153g2 = c28655q2.m87153g(interfaceC4351m) | c28655q2.m87157i(completed);
                Object objM87133R2 = c28655q2.m87133R();
                if (zM87153g2 || objM87133R2 == c28676v0) {
                    final int i15 = 1;
                    objM87133R2 = new Function1() { // from class: qm1.d
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i15) {
                                case 0:
                                    return AbstractC30483e.m93303E(interfaceC4351m, completed, obj);
                                default:
                                    return AbstractC30483e.m93304F(interfaceC4351m, completed, obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC25303l.m74291r(completed, c25307pM54175b2, null, (Function1) objM87133R2, c28655q2, C25307p.f99300b << 3, 4);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m93303E(InterfaceC4351m interfaceC4351m, InterfaceC25312u interfaceC25312u, Object event) {
        AbstractC22676k.m65750j(event, "event");
        interfaceC4351m.invoke(event, interfaceC25312u);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m93304F(InterfaceC4351m interfaceC4351m, InterfaceC25312u interfaceC25312u, Object event) {
        AbstractC22676k.m65750j(event, "event");
        interfaceC4351m.invoke(event, interfaceC25312u);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m93305G(Modifier modifier, C30480b c30480b, boolean z4, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) {
        m93337t(modifier, c30480b, z4, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080  */
    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    /* JADX WARN: Code duplicated, block: B:47:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00df  */
    /* JADX WARN: Code duplicated, block: B:56:0x0112  */
    /* JADX WARN: Code duplicated, block: B:59:0x012e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0187  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x01df  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:83:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: H */
    public static final void m93306H(Modifier modifier, DayZeroCardsViewState viewStateFromServer, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        int i16;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        C26669a c26669a;
        C38266c c38266c;
        boolean zM87153g;
        Object objM87133R;
        InterfaceC23462h interfaceC23462h;
        C26669a c26669a2;
        C38266c c38266c2;
        boolean zM87153g2;
        Object objM87133R2;
        InterfaceC23462h interfaceC23462h2;
        boolean zIsFeatureEnabled;
        Context context;
        C26669a c26669a3;
        C38266c c38266c3;
        C21647a c21647aM114690r;
        boolean zM87153g3;
        Object objM87133R3;
        InterfaceC23462h interfaceC23462h3;
        boolean z13;
        boolean zM87157i;
        Object objM87133R4;
        boolean z14;
        Object objM87133R5;
        Function1 function5;
        Object objM87133R6;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(viewStateFromServer, "viewStateFromServer");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(118807364);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(viewStateFromServer) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            i16 = i15;
            if ((i16 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C30301b(9);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function4 = (Function1) objM87133R6;
                } else {
                    function4 = function2;
                }
                c28655q.m87152f0(1903845737);
                c26669a = C29155a.f118017b;
                if (c26669a != null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                c38266c = c26669a.f106046a.f159364d;
                c28655q.m87152f0(-3686552);
                zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
                objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new b(c38266c, null, null));
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                interfaceC23462h = (InterfaceC23462h) objM87133R;
                c28655q.m87173q(false);
                c28655q.m87152f0(1903845737);
                c26669a2 = C29155a.f118017b;
                if (c26669a2 != null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                c38266c2 = c26669a2.f106046a.f159364d;
                c28655q.m87152f0(-3686552);
                zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(null);
                objM87133R2 = c28655q.m87133R();
                if (zM87153g2 || objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new c(c38266c2, null, null));
                    c28655q.m87172p0(objM87133R2);
                }
                c28655q.m87173q(false);
                interfaceC23462h2 = (InterfaceC23462h) objM87133R2;
                c28655q.m87173q(false);
                zIsFeatureEnabled = m93308J(interfaceC23462h).isFeatureEnabled(OnboardingFeatureFlag.HOME_GLOW_HUG);
                context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                c28655q.m87152f0(-1688186518);
                c26669a3 = C29155a.f118017b;
                if (c26669a3 != null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                c38266c3 = c26669a3.f106046a.f159364d;
                c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
                zM87153g3 = c28655q.m87153g(null) | c28655q.m87153g(null);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g3 || objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new d(c38266c3, null, null, c21647aM114690r));
                    c28655q.m87172p0(objM87133R3);
                }
                c28655q.m87173q(false);
                interfaceC23462h3 = (InterfaceC23462h) objM87133R3;
                c28655q.m87173q(false);
                z13 = false;
                InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(m93310L(interfaceC23462h3).getViewState(), new C30480b(null, null, null, false, null, 30, null), null, c28655q, 0, 2);
                C29358c c29358cM93310L = m93310L(interfaceC23462h3);
                zM87157i = c28655q.m87157i(interfaceC23462h3) | c28655q.m87157i(viewStateFromServer);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i || objM87133R4 == c28676v0) {
                    objM87133R4 = new e(viewStateFromServer, interfaceC23462h3, null);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87254h(c29358cM93310L, viewStateFromServer, (InterfaceC4351m) objM87133R4, c28655q);
                C30480b c30480bM93311M = m93311M(interfaceC28601c1M87260n);
                boolean zM87157i2 = c28655q.m87157i(interfaceC23462h3) | c28655q.m87157i(viewStateFromServer) | c28655q.m87157i(interfaceC23462h2) | c28655q.m87157i(context);
                if ((i16 & 896) == 256) {
                    z13 = true;
                }
                z14 = zM87157i2 | z13;
                objM87133R5 = c28655q.m87133R();
                if (!z14 || objM87133R5 == c28676v0) {
                    Function1 function6 = function4;
                    C0556g c0556g = new C0556g((Object) viewStateFromServer, (Object) context, function6, (Object) interfaceC23462h3, (Object) interfaceC23462h2, 16);
                    function5 = function6;
                    c28655q.m87172p0(c0556g);
                    objM87133R5 = c0556g;
                } else {
                    function5 = function4;
                }
                m93337t(modifier, c30480bM93311M, zIsFeatureEnabled, (InterfaceC4351m) objM87133R5, c28655q, i16 & 14, 0);
                function3 = function5;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30179a(i13, i14, 7, modifier, viewStateFromServer, function3);
            }
        }
        i15 |= 384;
        function2 = function1;
        i16 = i15;
        if ((i16 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C30301b(9);
                    c28655q.m87172p0(objM87133R6);
                }
                function4 = (Function1) objM87133R6;
            } else {
                function4 = function2;
            }
            c28655q.m87152f0(1903845737);
            c26669a = C29155a.f118017b;
            if (c26669a != null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            c38266c = c26669a.f106046a.f159364d;
            c28655q.m87152f0(-3686552);
            zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
            objM87133R = c28655q.m87133R();
            if (zM87153g) {
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new b(c38266c, null, null));
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new b(c38266c, null, null));
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            interfaceC23462h = (InterfaceC23462h) objM87133R;
            c28655q.m87173q(false);
            c28655q.m87152f0(1903845737);
            c26669a2 = C29155a.f118017b;
            if (c26669a2 != null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            c38266c2 = c26669a2.f106046a.f159364d;
            c28655q.m87152f0(-3686552);
            zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(null);
            objM87133R2 = c28655q.m87133R();
            if (zM87153g2) {
                objM87133R2 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new c(c38266c2, null, null));
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new c(c38266c2, null, null));
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87173q(false);
            interfaceC23462h2 = (InterfaceC23462h) objM87133R2;
            c28655q.m87173q(false);
            zIsFeatureEnabled = m93308J(interfaceC23462h).isFeatureEnabled(OnboardingFeatureFlag.HOME_GLOW_HUG);
            context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            c28655q.m87152f0(-1688186518);
            c26669a3 = C29155a.f118017b;
            if (c26669a3 != null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            c38266c3 = c26669a3.f106046a.f159364d;
            c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
            zM87153g3 = c28655q.m87153g(null) | c28655q.m87153g(null);
            objM87133R3 = c28655q.m87133R();
            if (zM87153g3) {
                objM87133R3 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new d(c38266c3, null, null, c21647aM114690r));
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new d(c38266c3, null, null, c21647aM114690r));
                c28655q.m87172p0(objM87133R3);
            }
            c28655q.m87173q(false);
            interfaceC23462h3 = (InterfaceC23462h) objM87133R3;
            c28655q.m87173q(false);
            z13 = false;
            InterfaceC28601c1 interfaceC28601c1M87260n2 = AbstractC28683x.m87260n(m93310L(interfaceC23462h3).getViewState(), new C30480b(null, null, null, false, null, 30, null), null, c28655q, 0, 2);
            C29358c c29358cM93310L2 = m93310L(interfaceC23462h3);
            zM87157i = c28655q.m87157i(interfaceC23462h3) | c28655q.m87157i(viewStateFromServer);
            objM87133R4 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R4 = new e(viewStateFromServer, interfaceC23462h3, null);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new e(viewStateFromServer, interfaceC23462h3, null);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87254h(c29358cM93310L2, viewStateFromServer, (InterfaceC4351m) objM87133R4, c28655q);
            C30480b c30480bM93311M2 = m93311M(interfaceC28601c1M87260n2);
            boolean zM87157i3 = c28655q.m87157i(interfaceC23462h3) | c28655q.m87157i(viewStateFromServer) | c28655q.m87157i(interfaceC23462h2) | c28655q.m87157i(context);
            if ((i16 & 896) == 256) {
                z13 = true;
            }
            z14 = zM87157i3 | z13;
            objM87133R5 = c28655q.m87133R();
            if (z14) {
                Function1 function7 = function4;
                C0556g c0556g2 = new C0556g((Object) viewStateFromServer, (Object) context, function7, (Object) interfaceC23462h3, (Object) interfaceC23462h2, 16);
                function5 = function7;
                c28655q.m87172p0(c0556g2);
                objM87133R5 = c0556g2;
            } else {
                Function1 function8 = function4;
                C0556g c0556g3 = new C0556g((Object) viewStateFromServer, (Object) context, function8, (Object) interfaceC23462h3, (Object) interfaceC23462h2, 16);
                function5 = function8;
                c28655q.m87172p0(c0556g3);
                objM87133R5 = c0556g3;
            }
            m93337t(modifier, c30480bM93311M2, zIsFeatureEnabled, (InterfaceC4351m) objM87133R5, c28655q, i16 & 14, 0);
            function3 = function5;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30179a(i13, i14, 7, modifier, viewStateFromServer, function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m93307I(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: J */
    private static final FeatureFlagChecker m93308J(InterfaceC23462h interfaceC23462h) {
        return (FeatureFlagChecker) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: K */
    private static final InterfaceC14515a m93309K(InterfaceC23462h interfaceC23462h) {
        return (InterfaceC14515a) interfaceC23462h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C29358c m93310L(InterfaceC23462h interfaceC23462h) {
        return (C29358c) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: M */
    private static final C30480b m93311M(InterfaceC28670t2 interfaceC28670t2) {
        return (C30480b) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m93312N(DayZeroCardsViewState dayZeroCardsViewState, Context context, Function1 function1, InterfaceC23462h interfaceC23462h, InterfaceC23462h interfaceC23462h2, Object event, Object state) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(state, "state");
        if (state instanceof C16550q) {
            C16550q c16550q = (C16550q) state;
            m93310L(interfaceC23462h).m89469n(new C29356a(dayZeroCardsViewState, c16550q.getAppNotificationType()));
            AbstractC30479a.m93289a(m93309K(interfaceC23462h2), c16550q.getTitle().resolve(context).toString());
            function1.invoke(event);
        } else {
            function1.invoke(event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m93313O(Modifier modifier, DayZeroCardsViewState dayZeroCardsViewState, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m93306H(modifier, dayZeroCardsViewState, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Q */
    private static final AbstractC3730c1 m93315Q(InterfaceC28027a interfaceC28027a) {
        if (AbstractC22676k.m65745e(interfaceC28027a, C28030d.f113094a)) {
            return AbstractC3730c1.f15251a;
        }
        if (AbstractC22676k.m65745e(interfaceC28027a, C28029c.f113093a)) {
            return AbstractC3788w0.m11576d(new C11347e2(500, 1000, AbstractC11333b0.f36312c), null, 12);
        }
        if (AbstractC22676k.m65745e(interfaceC28027a, C28032f.f113096a)) {
            return AbstractC3788w0.m11579g(AbstractC11348f.m30574v(1000, 0, null, 6), 1.0f, 4);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: R */
    private static final AbstractC3736e1 m93316R(InterfaceC28028b interfaceC28028b) {
        if (AbstractC22676k.m65745e(interfaceC28028b, C28031e.f113095a)) {
            return AbstractC3736e1.f15289a;
        }
        if (AbstractC22676k.m65745e(interfaceC28028b, C28033g.f113097a)) {
            return AbstractC3788w0.m11580h(AbstractC11348f.m30574v(1000, 0, null, 6), 0L, 6);
        }
        if (AbstractC22676k.m65745e(interfaceC28028b, C28034h.f113098a)) {
            return AbstractC3788w0.m11584l(AbstractC11348f.m30574v(600, 0, null, 6), C2299e.f9109L, null, 12);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: S */
    private static final boolean m93317S(EnumC16533a enumC16533a) {
        return enumC16533a == EnumC16533a.AI_COACH || enumC16533a == EnumC16533a.HAL;
    }

    /* JADX INFO: renamed from: p */
    private static final void m93333p(boolean z4, String str, ContainerBorderStyle containerBorderStyle, C16617b c16617b, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        boolean z13;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2111188777);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87149e(containerBorderStyle == null ? -1 : containerBorderStyle.ordinal()) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(c16617b) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 16384 : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            boolean z14 = (i14 & 57344) == 16384;
            Object objM87133R = c28655q.m87133R();
            if (z14 || objM87133R == C28635l.f115821a) {
                objM87133R = new a(interfaceC4339a, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, str);
            List listM118958J = (containerBorderStyle != null ? f.f125269b[containerBorderStyle.ordinal()] : -1) == 1 ? AbstractC37056f.m118958J(new C17919x(AbstractC15673b0.m44053o())) : AbstractC37056f.m118958J(new C17919x(AbstractC15673b0.m44055p()));
            if (z4) {
                c28655q.m87150e0(-1627835122);
                if (c16617b == null) {
                    c28655q.m87150e0(1076718771);
                    c28655q.m87173q(false);
                    z13 = false;
                } else {
                    c28655q.m87150e0(1076718772);
                    C37816b c37816bM121344e = AbstractC37817c.m121344e(-1760355111, c28655q, new C15348f0(c16617b.f63937a, listM118958J, 6));
                    z13 = false;
                    AbstractC3975r.m12005b(null, 0L, null, null, c37816bM121344e, c28655q, 24576, 15);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z13);
            } else {
                c28655q.m87150e0(1077054347);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2549j2(z4, str, containerBorderStyle, c16617b, interfaceC4339a, i13, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m93334q(long j7, List list, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C30112a(28);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC24879g.m72953d(modifierM3407d, fIntBitsToFloat, fIntBitsToFloat2, list, 0, true, (InterfaceC4339a) objM87133R, c28655q, 1769478, 16);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m93335r() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m93336s(boolean z4, String str, ContainerBorderStyle containerBorderStyle, C16617b c16617b, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m93333p(z4, str, containerBorderStyle, c16617b, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:104:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:107:0x0206  */
    /* JADX WARN: Code duplicated, block: B:110:0x0236  */
    /* JADX WARN: Code duplicated, block: B:115:0x0255  */
    /* JADX WARN: Code duplicated, block: B:118:0x0266  */
    /* JADX WARN: Code duplicated, block: B:119:0x0269  */
    /* JADX WARN: Code duplicated, block: B:121:0x0275  */
    /* JADX WARN: Code duplicated, block: B:124:0x028d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0290  */
    /* JADX WARN: Code duplicated, block: B:128:0x0293 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x0295  */
    /* JADX WARN: Code duplicated, block: B:130:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:136:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:138:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:145:0x0310  */
    /* JADX WARN: Code duplicated, block: B:148:0x0344  */
    /* JADX WARN: Code duplicated, block: B:149:0x0348  */
    /* JADX WARN: Code duplicated, block: B:152:0x035b  */
    /* JADX WARN: Code duplicated, block: B:154:0x0369  */
    /* JADX WARN: Code duplicated, block: B:160:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:163:0x03df  */
    /* JADX WARN: Code duplicated, block: B:166:0x013b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x03ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x02b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:47:0x0091  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:59:0x0102  */
    /* JADX WARN: Code duplicated, block: B:63:0x011b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0145  */
    /* JADX WARN: Code duplicated, block: B:73:0x014a  */
    /* JADX WARN: Code duplicated, block: B:75:0x014d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0152  */
    /* JADX WARN: Code duplicated, block: B:79:0x015d  */
    /* JADX WARN: Code duplicated, block: B:83:0x018d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0195  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:98:0x01be  */
    /* JADX WARN: Code duplicated, block: B:99:0x01cd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public static final void m93337t(Modifier modifier, C30480b viewState, boolean z4, InterfaceC4351m interfaceC4351m, Composer composer, int i13, int i14) {
        InterfaceC4351m interfaceC4351m2;
        int i15;
        boolean z13;
        InterfaceC4351m interfaceC4351m3;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        Object obj;
        InterfaceC4351m interfaceC4351m4;
        List<CustomAnimationContainerViewState> listM93291a;
        C2314t c2314t;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Iterator<T> it;
        Object next;
        CustomAnimationContainerViewState customAnimationContainerViewState;
        String key;
        ContainerBorderStyle containerBorderStyle;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        CustomAnimationContainerViewState customAnimationContainerViewState2;
        InterfaceC4351m interfaceC4351m5;
        int i16;
        C28655q c28655q2;
        int i17;
        int i18;
        CustomAnimationContainerViewState customAnimationContainerViewState3;
        int i19;
        float f13;
        C11362i1 c11362i1M30573u;
        int i24;
        int i25;
        AbstractC17911t abstractC17911tM43972A;
        int i26;
        C13825t c13825tM30800y;
        C13825t c13825tM30800y2;
        C13825t c13825tM30800y3;
        int i27;
        Modifier modifierM3355a;
        InterfaceC28601c1 interfaceC28601c3;
        int i28;
        boolean z14;
        Modifier modifierM3500d;
        int iHashCode;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i;
        Modifier modifierM44456i;
        InterfaceC25312u initial;
        AbstractC17911t abstractC17911tM43983F0;
        float f14;
        CustomAnimationContainerViewState customAnimationContainerViewState4;
        C28655q c28655q3;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        boolean z15 = z4;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(801636872);
        int i29 = (i13 & 6) == 0 ? (c28655q4.m87153g(modifier) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i29 |= c28655q4.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i29 |= c28655q4.m87155h(z15) ? 256 : 128;
        }
        int i34 = i14 & 8;
        if (i34 == 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4351m2 = interfaceC4351m;
                i29 |= c28655q4.m87157i(interfaceC4351m2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 = 1;
            if ((i29 & 1171) != 1170) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q4.m87135U(i29 & 1, z13)) {
                obj = C28635l.f115821a;
                if (i34 != 0) {
                    objM87133R5 = c28655q4.m87133R();
                    if (objM87133R5 == obj) {
                        objM87133R5 = new C28557w0(27);
                        c28655q4.m87172p0(objM87133R5);
                    }
                    interfaceC4351m4 = (InterfaceC4351m) objM87133R5;
                } else {
                    interfaceC4351m4 = interfaceC4351m2;
                }
                listM93291a = viewState.m93291a();
                c2314t = C2314t.f9131w;
                if (listM93291a == null) {
                    c28655q4.m87150e0(1546153447);
                    Modifier modifierM3419p = AbstractC1102d.m3419p(12 * 4, c2314t);
                    InterfaceC35689r0.d dVarM113128a = InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d));
                    objM87133R3 = c28655q4.m87133R();
                    if (objM87133R3 == obj) {
                        objM87133R3 = new C30112a(29);
                        c28655q4.m87172p0(objM87133R3);
                    }
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                    objM87133R4 = c28655q4.m87133R();
                    if (objM87133R4 == obj) {
                        objM87133R4 = new C30301b(10);
                        c28655q4.m87172p0(objM87133R4);
                    }
                    AbstractC35684p.m113047h(modifierM3419p, dVarM113128a, false, 0.0f, 0, interfaceC4339a2, (Function1) objM87133R4, null, null, c28655q4, 1769478, 412);
                    C28655q c28655q5 = c28655q4;
                    c28655q5.m87173q(false);
                    interfaceC4351m5 = interfaceC4351m4;
                    c28655q3 = c28655q5;
                } else {
                    c28655q4.m87150e0(1546603133);
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == obj) {
                        objM87133R = AbstractC28683x.m87272z(null);
                        c28655q4.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    it = viewState.m93291a().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        customAnimationContainerViewState4 = (CustomAnimationContainerViewState) next;
                        if (!AbstractC22676k.m65745e(customAnimationContainerViewState4.getKey(), viewState.getKeyToAnimate()) && customAnimationContainerViewState4.getVisibility()) {
                            break;
                        }
                    }
                    customAnimationContainerViewState = (CustomAnimationContainerViewState) next;
                    InterfaceC4351m interfaceC4351m6 = interfaceC4351m4;
                    boolean zM93295e = viewState.getTriggerConfetti();
                    if (customAnimationContainerViewState != null) {
                        key = customAnimationContainerViewState.getKey();
                    } else {
                        key = null;
                    }
                    if (customAnimationContainerViewState != null) {
                        containerBorderStyle = customAnimationContainerViewState.getContainerBorderStyle();
                    } else {
                        containerBorderStyle = null;
                    }
                    C16617b c16617bM93341x = m93341x(interfaceC28601c1);
                    objM87133R2 = c28655q4.m87133R();
                    if (objM87133R2 == obj) {
                        objM87133R2 = new C27325i(17, interfaceC28601c1);
                        c28655q4.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                    interfaceC28601c2 = interfaceC28601c1;
                    customAnimationContainerViewState2 = customAnimationContainerViewState;
                    interfaceC4351m5 = interfaceC4351m6;
                    i16 = 0;
                    m93333p(zM93295e, key, containerBorderStyle, c16617bM93341x, interfaceC4339a3, c28655q4, 24576);
                    c28655q2 = c28655q4;
                    i17 = 0;
                    for (Object obj2 : viewState.m93291a()) {
                        i18 = i17 + 1;
                        if (i17 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        customAnimationContainerViewState3 = (CustomAnimationContainerViewState) obj2;
                        BorderAnimation animateBorder = customAnimationContainerViewState3.getAnimateBorder();
                        int[] iArr = f.f125268a;
                        i19 = iArr[animateBorder.ordinal()];
                        if (i19 == i15 && i19 != 2) {
                            if (i19 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f13 = i16;
                        } else if (z15) {
                            f13 = 3;
                        } else {
                            f13 = (float) 1.5d;
                        }
                        if (z15) {
                            c11362i1M30573u = AbstractC11348f.m30573u(0.2f, 200.0f, 4, null);
                        } else {
                            Object obj3 = AbstractC11391p2.f36529a;
                            c11362i1M30573u = AbstractC11348f.m30573u(0.0f, 0.0f, 3, new C39174f(0.1f));
                        }
                        InterfaceC28670t2 interfaceC28670t2M30587a = AbstractC11352g.m30587a(f13, c11362i1M30573u, "borderAnimationInitial", c28655q2, 384, 8);
                        InterfaceC28670t2 interfaceC28670t2M30587a2 = AbstractC11352g.m30587a(f13, c11362i1M30573u, "borderAnimationFinal", c28655q2, 384, 8);
                        i24 = f.f125269b[customAnimationContainerViewState3.getContainerBorderStyle().ordinal()];
                        if (i24 != i15) {
                            i25 = 2;
                            if (i24 == 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            abstractC17911tM43972A = AbstractC15673b0.m43983F0();
                        } else {
                            i25 = 2;
                            abstractC17911tM43972A = AbstractC15673b0.m43972A();
                        }
                        C11475j c11475j = new C11475j(p712j91.Function1.m60318a(abstractC17911tM43972A), 0.0f, i25, null);
                        float fM93299A = m93299A(interfaceC28670t2M30587a);
                        i26 = C11475j.f36886c;
                        c13825tM30800y = AbstractC11471f.m30800y(c11475j, fM93299A, c28655q2, i26);
                        c13825tM30800y2 = AbstractC11471f.m30800y(new C11475j(p712j91.Function1.m60318a(abstractC17911tM43972A), 0.0f, i25, null), m93300B(interfaceC28670t2M30587a2), c28655q2, i26);
                        if (customAnimationContainerViewState3.getHighlightCard()) {
                            c28655q2.m87150e0(1903759283);
                            initial = customAnimationContainerViewState3.getInitial();
                            if ((initial instanceof C16550q) || !m93317S(((C16550q) initial).getStyle())) {
                                abstractC17911tM43983F0 = AbstractC15673b0.m43983F0();
                            } else {
                                abstractC17911tM43983F0 = AbstractC15673b0.m43972A();
                            }
                            C11475j c11475j2 = new C11475j(p712j91.Function1.m60318a(abstractC17911tM43983F0), 0.0f, 2, null);
                            if (z15) {
                                f14 = 3;
                            } else {
                                f14 = (float) 1.5d;
                            }
                            c13825tM30800y3 = AbstractC11471f.m30800y(c11475j2, f14, c28655q2, i26);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(1904224996);
                            c28655q2.m87173q(false);
                            c13825tM30800y3 = null;
                        }
                        i27 = iArr[customAnimationContainerViewState3.getAnimateBorder().ordinal()];
                        if (i27 != 1) {
                            if (i27 != 2) {
                                modifierM3355a = AbstractC1091c.m3355a(AbstractC15751g.m44454g(modifier, c13825tM30800y2, AbstractC33253j.m105489e(3 * 4)), null, 3);
                            } else {
                                if (i27 == 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (c13825tM30800y3 != null) {
                                    modifierM44456i = AbstractC15751g.m44456i(c13825tM30800y3.f49345a, c2314t, c13825tM30800y3.f49346b, AbstractC33253j.m105489e(3 * 4));
                                } else {
                                    modifierM44456i = null;
                                }
                                modifierM3355a = AbstractC1091c.m3355a(AbstractC15676d.m44103f(modifier, modifierM44456i), null, 3);
                            }
                            if (customAnimationContainerViewState3 == customAnimationContainerViewState2 || m93341x(interfaceC28601c2) != null) {
                                interfaceC28601c3 = interfaceC28601c2;
                                i28 = 2;
                                z14 = false;
                                c28655q2.m87150e0(1905507776);
                                c28655q2.m87173q(false);
                                modifierM3500d = c2314t;
                            } else {
                                c28655q2.m87150e0(1905119780);
                                Object objM87133R6 = c28655q2.m87133R();
                                if (objM87133R6 == obj) {
                                    interfaceC28601c3 = interfaceC28601c2;
                                    i28 = 2;
                                    objM87133R6 = new C29802c(i28, interfaceC28601c3);
                                    c28655q2.m87172p0(objM87133R6);
                                } else {
                                    interfaceC28601c3 = interfaceC28601c2;
                                    i28 = 2;
                                }
                                modifierM3500d = AbstractC1131a.m3500d(c2314t, (Function1) objM87133R6);
                                z14 = false;
                                c28655q2.m87173q(false);
                            }
                            Modifier modifierMo3471e = modifierM3355a.mo3471e(modifierM3500d);
                            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, z14);
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierMo3471e);
                            InterfaceC0221l.f734a.getClass();
                            interfaceC4339a = C0217k.f724b;
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(interfaceC4339a);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                            c0209i = C0217k.f732j;
                            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                            boolean visibility = customAnimationContainerViewState3.getVisibility();
                            AbstractC3730c1 abstractC3730c1M93315Q = m93315Q(viewState.getEnterTransition());
                            AbstractC3736e1 abstractC3736e1M93316R = m93316R(viewState.getExitTransition());
                            C37816b c37816bM121344e = AbstractC37817c.m121344e(1847911508, c28655q2, new C28119c(9, customAnimationContainerViewState3, interfaceC4351m5));
                            C2314t c2314t2 = c2314t;
                            C28655q c28655q6 = c28655q2;
                            AbstractC1090b.m3351f(visibility, null, abstractC3730c1M93315Q, abstractC3736e1M93316R, null, c37816bM121344e, c28655q6, ProfileVerifier.CompilationStatus.f6515xf2722a21, 18);
                            C28655q c28655q7 = c28655q6;
                            c28655q7.m87173q(true);
                            AbstractC22953f.m66715b(c28655q7, AbstractC1099a.m3394p(1 * 8, c2314t2));
                            interfaceC28601c2 = interfaceC28601c3;
                            c2314t = c2314t2;
                            customAnimationContainerViewState2 = customAnimationContainerViewState2;
                            i15 = 1;
                            i17 = i18;
                            i16 = 0;
                            z15 = z4;
                            c28655q2 = c28655q7;
                        } else {
                            modifierM3355a = AbstractC1091c.m3355a(AbstractC15751g.m44454g(modifier, c13825tM30800y, AbstractC33253j.m105489e(3 * 4)), null, 3);
                        }
                        if (customAnimationContainerViewState3 == customAnimationContainerViewState2) {
                            interfaceC28601c3 = interfaceC28601c2;
                            i28 = 2;
                            z14 = false;
                            c28655q2.m87150e0(1905507776);
                            c28655q2.m87173q(false);
                            modifierM3500d = c2314t;
                        } else {
                            interfaceC28601c3 = interfaceC28601c2;
                            i28 = 2;
                            z14 = false;
                            c28655q2.m87150e0(1905507776);
                            c28655q2.m87173q(false);
                            modifierM3500d = c2314t;
                        }
                        Modifier modifierMo3471e2 = modifierM3355a.mo3471e(modifierM3500d);
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, z14);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e2);
                        InterfaceC0221l.f734a.getClass();
                        interfaceC4339a = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(interfaceC4339a);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d2);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                        boolean visibility2 = customAnimationContainerViewState3.getVisibility();
                        AbstractC3730c1 abstractC3730c1M93315Q2 = m93315Q(viewState.getEnterTransition());
                        AbstractC3736e1 abstractC3736e1M93316R2 = m93316R(viewState.getExitTransition());
                        C37816b c37816bM121344e2 = AbstractC37817c.m121344e(1847911508, c28655q2, new C28119c(9, customAnimationContainerViewState3, interfaceC4351m5));
                        C2314t c2314t3 = c2314t;
                        C28655q c28655q8 = c28655q2;
                        AbstractC1090b.m3351f(visibility2, null, abstractC3730c1M93315Q2, abstractC3736e1M93316R2, null, c37816bM121344e2, c28655q8, ProfileVerifier.CompilationStatus.f6515xf2722a21, 18);
                        C28655q c28655q9 = c28655q8;
                        c28655q9.m87173q(true);
                        AbstractC22953f.m66715b(c28655q9, AbstractC1099a.m3394p(1 * 8, c2314t3));
                        interfaceC28601c2 = interfaceC28601c3;
                        c2314t = c2314t3;
                        customAnimationContainerViewState2 = customAnimationContainerViewState2;
                        i15 = 1;
                        i17 = i18;
                        i16 = 0;
                        z15 = z4;
                        c28655q2 = c28655q9;
                    }
                    c28655q2.m87173q(i16);
                    c28655q3 = c28655q2;
                }
                interfaceC4351m3 = interfaceC4351m5;
                c28655q = c28655q3;
            } else {
                c28655q4.m87138X();
                interfaceC4351m3 = interfaceC4351m2;
                c28655q = c28655q4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2108h(modifier, (Object) viewState, z4, (InterfaceC23459e) interfaceC4351m3, i13, i14, 27);
            }
        }
        i29 |= 3072;
        interfaceC4351m2 = interfaceC4351m;
        i15 = 1;
        if ((i29 & 1171) != 1170) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q4.m87135U(i29 & 1, z13)) {
            obj = C28635l.f115821a;
            if (i34 != 0) {
                objM87133R5 = c28655q4.m87133R();
                if (objM87133R5 == obj) {
                    objM87133R5 = new C28557w0(27);
                    c28655q4.m87172p0(objM87133R5);
                }
                interfaceC4351m4 = (InterfaceC4351m) objM87133R5;
            } else {
                interfaceC4351m4 = interfaceC4351m2;
            }
            listM93291a = viewState.m93291a();
            c2314t = C2314t.f9131w;
            if (listM93291a == null) {
                c28655q4.m87150e0(1546153447);
                Modifier modifierM3419p2 = AbstractC1102d.m3419p(12 * 4, c2314t);
                InterfaceC35689r0.d dVarM113128a2 = InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d));
                objM87133R3 = c28655q4.m87133R();
                if (objM87133R3 == obj) {
                    objM87133R3 = new C30112a(29);
                    c28655q4.m87172p0(objM87133R3);
                }
                InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                objM87133R4 = c28655q4.m87133R();
                if (objM87133R4 == obj) {
                    objM87133R4 = new C30301b(10);
                    c28655q4.m87172p0(objM87133R4);
                }
                AbstractC35684p.m113047h(modifierM3419p2, dVarM113128a2, false, 0.0f, 0, interfaceC4339a4, (Function1) objM87133R4, null, null, c28655q4, 1769478, 412);
                C28655q c28655q10 = c28655q4;
                c28655q10.m87173q(false);
                interfaceC4351m5 = interfaceC4351m4;
                c28655q3 = c28655q10;
            } else {
                c28655q4.m87150e0(1546603133);
                objM87133R = c28655q4.m87133R();
                if (objM87133R == obj) {
                    objM87133R = AbstractC28683x.m87272z(null);
                    c28655q4.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                it = viewState.m93291a().iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        customAnimationContainerViewState4 = (CustomAnimationContainerViewState) next;
                        if (!AbstractC22676k.m65745e(customAnimationContainerViewState4.getKey(), viewState.getKeyToAnimate())) {
                        }
                    }
                }
                customAnimationContainerViewState = (CustomAnimationContainerViewState) next;
                InterfaceC4351m interfaceC4351m7 = interfaceC4351m4;
                boolean zM93295e2 = viewState.getTriggerConfetti();
                if (customAnimationContainerViewState != null) {
                    key = customAnimationContainerViewState.getKey();
                } else {
                    key = null;
                }
                if (customAnimationContainerViewState != null) {
                    containerBorderStyle = customAnimationContainerViewState.getContainerBorderStyle();
                } else {
                    containerBorderStyle = null;
                }
                C16617b c16617bM93341x2 = m93341x(interfaceC28601c1);
                objM87133R2 = c28655q4.m87133R();
                if (objM87133R2 == obj) {
                    objM87133R2 = new C27325i(17, interfaceC28601c1);
                    c28655q4.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                interfaceC28601c2 = interfaceC28601c1;
                customAnimationContainerViewState2 = customAnimationContainerViewState;
                interfaceC4351m5 = interfaceC4351m7;
                i16 = 0;
                m93333p(zM93295e2, key, containerBorderStyle, c16617bM93341x2, interfaceC4339a5, c28655q4, 24576);
                c28655q2 = c28655q4;
                i17 = 0;
                while (r16.hasNext()) {
                    i18 = i17 + 1;
                    if (i17 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    customAnimationContainerViewState3 = (CustomAnimationContainerViewState) obj2;
                    BorderAnimation animateBorder2 = customAnimationContainerViewState3.getAnimateBorder();
                    int[] iArr2 = f.f125268a;
                    i19 = iArr2[animateBorder2.ordinal()];
                    if (i19 == i15) {
                        if (z15) {
                            f13 = 3;
                        } else {
                            f13 = (float) 1.5d;
                        }
                    } else if (z15) {
                        f13 = 3;
                    } else {
                        f13 = (float) 1.5d;
                    }
                    if (z15) {
                        Object obj4 = AbstractC11391p2.f36529a;
                        c11362i1M30573u = AbstractC11348f.m30573u(0.0f, 0.0f, 3, new C39174f(0.1f));
                    } else {
                        c11362i1M30573u = AbstractC11348f.m30573u(0.2f, 200.0f, 4, null);
                    }
                    InterfaceC28670t2 interfaceC28670t2M30587a3 = AbstractC11352g.m30587a(f13, c11362i1M30573u, "borderAnimationInitial", c28655q2, 384, 8);
                    InterfaceC28670t2 interfaceC28670t2M30587a4 = AbstractC11352g.m30587a(f13, c11362i1M30573u, "borderAnimationFinal", c28655q2, 384, 8);
                    i24 = f.f125269b[customAnimationContainerViewState3.getContainerBorderStyle().ordinal()];
                    if (i24 != i15) {
                        i25 = 2;
                        if (i24 == 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        abstractC17911tM43972A = AbstractC15673b0.m43983F0();
                    } else {
                        i25 = 2;
                        abstractC17911tM43972A = AbstractC15673b0.m43972A();
                    }
                    C11475j c11475j3 = new C11475j(p712j91.Function1.m60318a(abstractC17911tM43972A), 0.0f, i25, null);
                    float fM93299A2 = m93299A(interfaceC28670t2M30587a3);
                    i26 = C11475j.f36886c;
                    c13825tM30800y = AbstractC11471f.m30800y(c11475j3, fM93299A2, c28655q2, i26);
                    c13825tM30800y2 = AbstractC11471f.m30800y(new C11475j(p712j91.Function1.m60318a(abstractC17911tM43972A), 0.0f, i25, null), m93300B(interfaceC28670t2M30587a4), c28655q2, i26);
                    if (customAnimationContainerViewState3.getHighlightCard()) {
                        c28655q2.m87150e0(1903759283);
                        initial = customAnimationContainerViewState3.getInitial();
                        if (initial instanceof C16550q) {
                            abstractC17911tM43983F0 = AbstractC15673b0.m43983F0();
                        } else {
                            abstractC17911tM43983F0 = AbstractC15673b0.m43983F0();
                        }
                        C11475j c11475j4 = new C11475j(p712j91.Function1.m60318a(abstractC17911tM43983F0), 0.0f, 2, null);
                        if (z15) {
                            f14 = 3;
                        } else {
                            f14 = (float) 1.5d;
                        }
                        c13825tM30800y3 = AbstractC11471f.m30800y(c11475j4, f14, c28655q2, i26);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(1904224996);
                        c28655q2.m87173q(false);
                        c13825tM30800y3 = null;
                    }
                    i27 = iArr2[customAnimationContainerViewState3.getAnimateBorder().ordinal()];
                    if (i27 != 1) {
                        if (i27 != 2) {
                            modifierM3355a = AbstractC1091c.m3355a(AbstractC15751g.m44454g(modifier, c13825tM30800y2, AbstractC33253j.m105489e(3 * 4)), null, 3);
                        } else {
                            if (i27 == 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (c13825tM30800y3 != null) {
                                modifierM44456i = AbstractC15751g.m44456i(c13825tM30800y3.f49345a, c2314t, c13825tM30800y3.f49346b, AbstractC33253j.m105489e(3 * 4));
                            } else {
                                modifierM44456i = null;
                            }
                            modifierM3355a = AbstractC1091c.m3355a(AbstractC15676d.m44103f(modifier, modifierM44456i), null, 3);
                        }
                        if (customAnimationContainerViewState3 == customAnimationContainerViewState2) {
                            interfaceC28601c3 = interfaceC28601c2;
                            i28 = 2;
                            z14 = false;
                            c28655q2.m87150e0(1905507776);
                            c28655q2.m87173q(false);
                            modifierM3500d = c2314t;
                        } else {
                            interfaceC28601c3 = interfaceC28601c2;
                            i28 = 2;
                            z14 = false;
                            c28655q2.m87150e0(1905507776);
                            c28655q2.m87173q(false);
                            modifierM3500d = c2314t;
                        }
                        Modifier modifierMo3471e3 = modifierM3355a.mo3471e(modifierM3500d);
                        InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, z14);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e3);
                        InterfaceC0221l.f734a.getClass();
                        interfaceC4339a = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(interfaceC4339a);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d3);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                        boolean visibility3 = customAnimationContainerViewState3.getVisibility();
                        AbstractC3730c1 abstractC3730c1M93315Q3 = m93315Q(viewState.getEnterTransition());
                        AbstractC3736e1 abstractC3736e1M93316R3 = m93316R(viewState.getExitTransition());
                        C37816b c37816bM121344e3 = AbstractC37817c.m121344e(1847911508, c28655q2, new C28119c(9, customAnimationContainerViewState3, interfaceC4351m5));
                        C2314t c2314t4 = c2314t;
                        C28655q c28655q11 = c28655q2;
                        AbstractC1090b.m3351f(visibility3, null, abstractC3730c1M93315Q3, abstractC3736e1M93316R3, null, c37816bM121344e3, c28655q11, ProfileVerifier.CompilationStatus.f6515xf2722a21, 18);
                        C28655q c28655q12 = c28655q11;
                        c28655q12.m87173q(true);
                        AbstractC22953f.m66715b(c28655q12, AbstractC1099a.m3394p(1 * 8, c2314t4));
                        interfaceC28601c2 = interfaceC28601c3;
                        c2314t = c2314t4;
                        customAnimationContainerViewState2 = customAnimationContainerViewState2;
                        i15 = 1;
                        i17 = i18;
                        i16 = 0;
                        z15 = z4;
                        c28655q2 = c28655q12;
                    } else {
                        modifierM3355a = AbstractC1091c.m3355a(AbstractC15751g.m44454g(modifier, c13825tM30800y, AbstractC33253j.m105489e(3 * 4)), null, 3);
                    }
                    if (customAnimationContainerViewState3 == customAnimationContainerViewState2) {
                        interfaceC28601c3 = interfaceC28601c2;
                        i28 = 2;
                        z14 = false;
                        c28655q2.m87150e0(1905507776);
                        c28655q2.m87173q(false);
                        modifierM3500d = c2314t;
                    } else {
                        interfaceC28601c3 = interfaceC28601c2;
                        i28 = 2;
                        z14 = false;
                        c28655q2.m87150e0(1905507776);
                        c28655q2.m87173q(false);
                        modifierM3500d = c2314t;
                    }
                    Modifier modifierMo3471e4 = modifierM3355a.mo3471e(modifierM3500d);
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, z14);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e4);
                    InterfaceC0221l.f734a.getClass();
                    interfaceC4339a = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(interfaceC4339a);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d4);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
                    boolean visibility4 = customAnimationContainerViewState3.getVisibility();
                    AbstractC3730c1 abstractC3730c1M93315Q4 = m93315Q(viewState.getEnterTransition());
                    AbstractC3736e1 abstractC3736e1M93316R4 = m93316R(viewState.getExitTransition());
                    C37816b c37816bM121344e4 = AbstractC37817c.m121344e(1847911508, c28655q2, new C28119c(9, customAnimationContainerViewState3, interfaceC4351m5));
                    C2314t c2314t5 = c2314t;
                    C28655q c28655q13 = c28655q2;
                    AbstractC1090b.m3351f(visibility4, null, abstractC3730c1M93315Q4, abstractC3736e1M93316R4, null, c37816bM121344e4, c28655q13, ProfileVerifier.CompilationStatus.f6515xf2722a21, 18);
                    C28655q c28655q14 = c28655q13;
                    c28655q14.m87173q(true);
                    AbstractC22953f.m66715b(c28655q14, AbstractC1099a.m3394p(1 * 8, c2314t5));
                    interfaceC28601c2 = interfaceC28601c3;
                    c2314t = c2314t5;
                    customAnimationContainerViewState2 = customAnimationContainerViewState2;
                    i15 = 1;
                    i17 = i18;
                    i16 = 0;
                    z15 = z4;
                    c28655q2 = c28655q14;
                }
                c28655q2.m87173q(i16);
                c28655q3 = c28655q2;
            }
            interfaceC4351m3 = interfaceC4351m5;
            c28655q = c28655q3;
        } else {
            c28655q4.m87138X();
            interfaceC4351m3 = interfaceC4351m2;
            c28655q = c28655q4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2108h(modifier, (Object) viewState, z4, (InterfaceC23459e) interfaceC4351m3, i13, i14, 27);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m93338u(Object event, Object state) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(state, "state");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m93339v() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m93340w(float f13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    private static final C16617b m93341x(InterfaceC28601c1 interfaceC28601c1) {
        return (C16617b) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: y */
    private static final void m93342y(InterfaceC28601c1 interfaceC28601c1, C16617b c16617b) {
        interfaceC28601c1.setValue(c16617b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m93343z(InterfaceC28601c1 interfaceC28601c1) {
        m93342y(interfaceC28601c1, null);
        return C23454a0.f92919a;
    }
}
