package mq2;

import am2.C1024j;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.p018ui.layout.AbstractC1132b;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import id2.C18421f;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p031b9.AbstractC2875y;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p077d0.C11347e2;
import p088dc.AbstractC11895b;
import p208i2.C17881e1;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p635y2.AbstractC39125q1;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39147y;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import xq2.EnumC38591t;

/* JADX INFO: renamed from: mq2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aI\u0010\u000b\u001a\u00020\t2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a%\u0010\u0011\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0010\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a,\u0010\u0016\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017\u001a=\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\r2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a9\u0010%\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\r2\u0006\u0010 \u001a\u00020\r2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\rH\u0002¢\u0006\u0004\b%\u0010&\u001a'\u0010'\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\rH\u0002¢\u0006\u0004\b'\u0010(\u001a'\u0010)\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\rH\u0002¢\u0006\u0004\b)\u0010(\u001a'\u0010-\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020\rH\u0002¢\u0006\u0004\b-\u0010.¨\u00063²\u0006\u0010\u0010\u001b\u001a\u0004\u0018\u00010\r8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\"\u001a\u00020!8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010/\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\u0010\u00101\u001a\u0004\u0018\u0001008\n@\nX\u008a\u008e\u0002²\u0006\u0010\u00102\u001a\u0004\u0018\u0001008\n@\nX\u008a\u008e\u0002²\u0006\f\u0010#\u001a\u00020\r8\nX\u008a\u0084\u0002²\u0006\f\u0010$\u001a\u00020\r8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lmq2/b;", "animationCoordinator", "", "isCurrentStep", "", "index", "Lkotlin/Function0;", "", "currentTimeMillis", "Ll83/a0;", "content", "f", "(Lmq2/b;ZILc93/a;Lc93/m;Landroidx/compose/runtime/Composer;II)V", "", "T", "(Landroidx/compose/runtime/Composer;I)F", "lastStepChangeTime", "X", "(Lc93/a;J)Z", "S", "(I)J", "getCardCurrentY", "Y", "(Lc93/a;ZLq83/d;)Ljava/lang/Object;", "Ly2/y;", "coordinates", "hasCapturedPosition", "cardCurrentY", "Lkotlin/Function1;", "onPositionCaptured", "V", "(Ly2/y;ZLjava/lang/Float;Lkotlin/jvm/functions/Function1;)V", "targetTopCenterY", "Lmq2/d;", "animationState", "enterProgress", "exitProgress", "U", "(Ljava/lang/Float;FLmq2/d;FF)F", "R", "(Lmq2/d;FF)F", "Q", "start", "end", "t", "W", "(FFF)F", "skipAnimation", "Lbc3/k1;", "enterJob", "exitJob", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25894g {

    /* JADX INFO: renamed from: mq2.g$a */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.view.components.animation.ChronologicalCardAnimatorKt$ChronologicalCardAnimator$2$1", m100430f = "ChronologicalCardAnimator.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f102178E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f102179F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28601c1 f102180G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ InterfaceC28601c1 f102181H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ InterfaceC28601c1 f102182I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ InterfaceC28601c1 f102183J;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ InterfaceC28601c1 f102184K;

        /* JADX INFO: renamed from: L */
        final /* synthetic */ int f102185L;

        /* JADX INFO: renamed from: w */
        int f102186w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f102187x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f102188y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f102189z;

        /* JADX INFO: renamed from: mq2.g$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.user.journey.view.components.animation.ChronologicalCardAnimatorKt$ChronologicalCardAnimator$2$1$1", m100430f = "ChronologicalCardAnimator.kt", m100431l = {95, 96}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C42021a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ InterfaceC28601c1 f102190E;

            /* JADX INFO: renamed from: w */
            int f102191w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ int f102192x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ boolean f102193y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ InterfaceC28601c1 f102194z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42021a(int i13, boolean z4, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super C42021a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f102192x = i13;
                this.f102193y = z4;
                this.f102194z = interfaceC28601c1;
                this.f102190E = interfaceC28601c2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: h */
            public static final Float m76606h(InterfaceC28601c1 interfaceC28601c1) {
                return AbstractC25894g.m76592n(interfaceC28601c1);
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C42021a(this.f102192x, this.f102193y, this.f102194z, this.f102190E, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C42021a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
            
                if (mq2.AbstractC25894g.m76578Y(r1, r7, r6) == r0) goto L15;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r6.f102191w
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1c
                    if (r1 == r3) goto L18
                    if (r1 != r2) goto L10
                    p505ts.AbstractC34132o.m107864I(r7)
                    goto L40
                L10:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L18:
                    p505ts.AbstractC34132o.m107864I(r7)
                    goto L2e
                L1c:
                    p505ts.AbstractC34132o.m107864I(r7)
                    int r7 = r6.f102192x
                    long r4 = mq2.AbstractC25894g.m76572S(r7)
                    r6.f102191w = r3
                    java.lang.Object r7 = bc3.AbstractC3034m0.m8782b(r4, r6)
                    if (r7 != r0) goto L2e
                    goto L3f
                L2e:
                    p1.c1 r7 = r6.f102194z
                    mq2.f r1 = new mq2.f
                    r1.<init>()
                    boolean r7 = r6.f102193y
                    r6.f102191w = r2
                    java.lang.Object r7 = mq2.AbstractC25894g.m76569P(r1, r7, r6)
                    if (r7 != r0) goto L40
                L3f:
                    return r0
                L40:
                    boolean r7 = r6.f102193y
                    if (r7 == 0) goto L4b
                    p1.c1 r7 = r6.f102190E
                    mq2.d r0 = mq2.EnumC25891d.ENTERING
                    mq2.AbstractC25894g.m76568O(r7, r0)
                L4b:
                    l83.a0 r7 = l83.C23454a0.f92919a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: mq2.AbstractC25894g.a.C42021a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z4, InterfaceC4339a interfaceC4339a, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28601c1 interfaceC28601c4, InterfaceC28601c1 interfaceC28601c5, InterfaceC28601c1 interfaceC28601c6, InterfaceC28601c1 interfaceC28601c7, int i13, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f102188y = z4;
            this.f102189z = interfaceC4339a;
            this.f102178E = interfaceC28601c1;
            this.f102179F = interfaceC28601c2;
            this.f102180G = interfaceC28601c3;
            this.f102181H = interfaceC28601c4;
            this.f102182I = interfaceC28601c5;
            this.f102183J = interfaceC28601c6;
            this.f102184K = interfaceC28601c7;
            this.f102185L = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(this.f102188y, this.f102189z, this.f102178E, this.f102179F, this.f102180G, this.f102181H, this.f102182I, this.f102183J, this.f102184K, this.f102185L, interfaceC30057d);
            aVar.f102187x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f102187x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f102186w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC3027k1 interfaceC3027k1M76590l = AbstractC25894g.m76590l(this.f102178E);
            if (interfaceC3027k1M76590l != null) {
                interfaceC3027k1M76590l.cancel((CancellationException) null);
            }
            AbstractC25894g.m76591m(this.f102178E, null);
            if (this.f102188y) {
                InterfaceC3027k1 interfaceC3027k1M76593o = AbstractC25894g.m76593o(this.f102179F);
                if (interfaceC3027k1M76593o != null) {
                    interfaceC3027k1M76593o.cancel((CancellationException) null);
                }
                AbstractC25894g.m76594p(this.f102179F, null);
                AbstractC25894g.m76600v(this.f102180G, null);
                AbstractC25894g.m76603y(this.f102181H, false);
                boolean zM76577X = AbstractC25894g.m76577X(this.f102189z, AbstractC25894g.m76588j(this.f102182I));
                AbstractC25894g.m76589k(this.f102182I, ((Number) this.f102189z.invoke()).longValue());
                if (zM76577X) {
                    AbstractC25894g.m76587i(this.f102183J, true);
                    AbstractC25894g.m76554A(this.f102184K, EnumC25891d.ENTERED);
                } else {
                    AbstractC25894g.m76587i(this.f102183J, false);
                    AbstractC25894g.m76554A(this.f102184K, EnumC25891d.WAITING_TO_ENTER);
                    AbstractC25894g.m76591m(this.f102178E, AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C42021a(this.f102185L, this.f102188y, this.f102180G, this.f102184K, null), 3));
                }
            } else if (AbstractC25894g.m76604z(this.f102184K) != EnumC25891d.EXITING && AbstractC25894g.m76604z(this.f102184K) != EnumC25891d.WAITING_TO_EXIT) {
                AbstractC25894g.m76554A(this.f102184K, EnumC25891d.WAITING_TO_ENTER);
                AbstractC25894g.m76587i(this.f102183J, false);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mq2.g$b */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.view.components.animation.ChronologicalCardAnimatorKt$ChronologicalCardAnimator$3$1", m100430f = "ChronologicalCardAnimator.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f102195w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f102196x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f102197y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC28601c1 interfaceC28601c1, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f102196x = interfaceC28601c1;
            this.f102197y = interfaceC28670t2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f102196x, this.f102197y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f102195w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC25894g.m76604z(this.f102196x) == EnumC25891d.ENTERING && AbstractC25894g.m76595q(this.f102197y) >= 1.0f) {
                AbstractC25894g.m76554A(this.f102196x, EnumC25891d.ENTERED);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mq2.g$c */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.view.components.animation.ChronologicalCardAnimatorKt$ChronologicalCardAnimator$4$1", m100430f = "ChronologicalCardAnimator.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f102198E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f102199F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ int f102200G;

        /* JADX INFO: renamed from: w */
        int f102201w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f102202x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C25889b f102203y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f102204z;

        /* JADX INFO: renamed from: mq2.g$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.user.journey.view.components.animation.ChronologicalCardAnimatorKt$ChronologicalCardAnimator$4$1$1", m100430f = "ChronologicalCardAnimator.kt", m100431l = {138}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f102205w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ int f102206x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC28601c1 f102207y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i13, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f102206x = i13;
                this.f102207y = interfaceC28601c1;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f102206x, this.f102207y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f102205w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    long jM76572S = AbstractC25894g.m76572S(this.f102206x);
                    this.f102205w = 1;
                    if (AbstractC3034m0.m8782b(jM76572S, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                AbstractC25894g.m76554A(this.f102207y, EnumC25891d.EXITING);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C25889b c25889b, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, int i13, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f102203y = c25889b;
            this.f102204z = interfaceC28601c1;
            this.f102198E = interfaceC28601c2;
            this.f102199F = interfaceC28601c3;
            this.f102200G = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f102203y, this.f102204z, this.f102198E, this.f102199F, this.f102200G, interfaceC30057d);
            cVar.f102202x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC28601c1 interfaceC28601c1M76548f;
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f102202x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f102201w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C25889b c25889b = this.f102203y;
            EnumC38591t enumC38591t = (c25889b == null || (interfaceC28601c1M76548f = c25889b.getCurrentDirection()) == null) ? null : (EnumC38591t) interfaceC28601c1M76548f.getValue();
            if (enumC38591t == EnumC38591t.FORWARD || enumC38591t == EnumC38591t.BACKWARD) {
                InterfaceC3027k1 interfaceC3027k1M76590l = AbstractC25894g.m76590l(this.f102204z);
                if (interfaceC3027k1M76590l != null) {
                    interfaceC3027k1M76590l.cancel((CancellationException) null);
                }
                InterfaceC3027k1 interfaceC3027k1M76593o = AbstractC25894g.m76593o(this.f102198E);
                if (interfaceC3027k1M76593o != null) {
                    interfaceC3027k1M76593o.cancel((CancellationException) null);
                }
                if (AbstractC25894g.m76604z(this.f102199F) == EnumC25891d.ENTERED) {
                    AbstractC25894g.m76554A(this.f102199F, EnumC25891d.WAITING_TO_EXIT);
                    AbstractC25894g.m76594p(this.f102198E, AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new a(this.f102200G, this.f102199F, null), 3));
                }
            } else if (enumC38591t == null) {
                InterfaceC3027k1 interfaceC3027k1M76593o2 = AbstractC25894g.m76593o(this.f102198E);
                if (interfaceC3027k1M76593o2 != null) {
                    interfaceC3027k1M76593o2.cancel((CancellationException) null);
                }
                AbstractC25894g.m76594p(this.f102198E, null);
                if (AbstractC25894g.m76604z(this.f102199F) == EnumC25891d.WAITING_TO_EXIT || AbstractC25894g.m76604z(this.f102199F) == EnumC25891d.EXITING) {
                    AbstractC25894g.m76554A(this.f102199F, EnumC25891d.ENTERED);
                }
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mq2.g$d */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.view.components.animation.ChronologicalCardAnimatorKt$ChronologicalCardAnimator$5$1", m100430f = "ChronologicalCardAnimator.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f102208w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C25889b f102209x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f102210y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28670t2 f102211z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C25889b c25889b, InterfaceC28601c1 interfaceC28601c1, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f102209x = c25889b;
            this.f102210y = interfaceC28601c1;
            this.f102211z = interfaceC28670t2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f102209x, this.f102210y, this.f102211z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC28601c1 interfaceC28601c1M76548f;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f102208w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC25894g.m76604z(this.f102210y) == EnumC25891d.EXITING && AbstractC25894g.m76596r(this.f102211z) >= 1.0f) {
                C25889b c25889b = this.f102209x;
                if (((c25889b == null || (interfaceC28601c1M76548f = c25889b.getCurrentDirection()) == null) ? null : (EnumC38591t) interfaceC28601c1M76548f.getValue()) != null) {
                    this.f102209x.m76549g();
                }
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mq2.g$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f102212a;

        static {
            int[] iArr = new int[EnumC25891d.values().length];
            try {
                iArr[EnumC25891d.EXITING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC25891d.WAITING_TO_EXIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC25891d.ENTERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC25891d.ENTERING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC25891d.WAITING_TO_ENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f102212a = iArr;
        }
    }

    /* JADX INFO: renamed from: mq2.g$f */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.view.components.animation.ChronologicalCardAnimatorKt", m100430f = "ChronologicalCardAnimator.kt", m100431l = {249}, m100432m = "waitForPositionCapture", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f102213E;

        /* JADX INFO: renamed from: w */
        Object f102214w;

        /* JADX INFO: renamed from: x */
        boolean f102215x;

        /* JADX INFO: renamed from: y */
        int f102216y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f102217z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f102217z = obj;
            this.f102213E |= Integer.MIN_VALUE;
            return AbstractC25894g.m76578Y(null, false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final void m76554A(InterfaceC28601c1 interfaceC28601c1, EnumC25891d enumC25891d) {
        interfaceC28601c1.setValue(enumC25891d);
    }

    /* JADX INFO: renamed from: Q */
    private static final float m76570Q(EnumC25891d enumC25891d, float f13, float f14) {
        int i13 = e.f102212a[enumC25891d.ordinal()];
        if (i13 == 1) {
            return m76576W(1.0f, 0.0f, f14);
        }
        if (i13 == 2 || i13 == 3) {
            return 1.0f;
        }
        if (i13 == 4) {
            return m76576W(0.0f, 1.0f, f13);
        }
        if (i13 == 5) {
            return 0.0f;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: R */
    private static final float m76571R(EnumC25891d enumC25891d, float f13, float f14) {
        int i13 = e.f102212a[enumC25891d.ordinal()];
        if (i13 == 1) {
            return m76576W(1.0f, 0.0f, f14);
        }
        if (i13 == 2 || i13 == 3) {
            return 1.0f;
        }
        if (i13 == 4) {
            return m76576W(0.0f, 1.0f, f13);
        }
        if (i13 == 5) {
            return 0.0f;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: S */
    public static final long m76572S(int i13) {
        if (i13 == 0) {
            return 0L;
        }
        return ((long) i13) * 220;
    }

    /* JADX INFO: renamed from: T */
    private static final float m76573T(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
        c28655q.m87150e0(1005895866);
        float fMo743q0 = interfaceC39171c.mo743q0(((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenHeightDp);
        c28655q.m87173q(false);
        return fMo743q0 * 0.2f;
    }

    /* JADX INFO: renamed from: U */
    private static final float m76574U(Float f13, float f14, EnumC25891d enumC25891d, float f15, float f16) {
        if (f13 == null) {
            return 0.0f;
        }
        float fFloatValue = f13.floatValue();
        int i13 = e.f102212a[enumC25891d.ordinal()];
        if (i13 == 1) {
            return m76576W(0.0f, f14 - fFloatValue, f16);
        }
        if (i13 == 2 || i13 == 3) {
            return 0.0f;
        }
        if (i13 == 4) {
            return m76576W(f14 - fFloatValue, 0.0f, f15);
        }
        if (i13 == 5) {
            return f14 - fFloatValue;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: V */
    private static final void m76575V(InterfaceC39147y interfaceC39147y, boolean z4, Float f13, Function1 function1) {
        if (!z4 || f13 == null) {
            function1.invoke(Float.valueOf(Float.intBitsToFloat((int) (AbstractC39125q1.m124660f(interfaceC39147y).m47198d() & 4294967295L))));
        }
    }

    /* JADX INFO: renamed from: W */
    private static final float m76576W(float f13, float f14, float f15) {
        return AbstractC2875y.m8288a(f14, f13, f15, f13);
    }

    /* JADX INFO: renamed from: X */
    public static final boolean m76577X(InterfaceC4339a currentTimeMillis, long j7) {
        AbstractC22676k.m65750j(currentTimeMillis, "currentTimeMillis");
        return ((j7 > 0L ? 1 : (j7 == 0L ? 0 : -1)) == 0 ? Long.MAX_VALUE : ((Number) currentTimeMillis.invoke()).longValue() - j7) < 200;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0058 -> B:24:0x005a). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: Y */
    public static final Object m76578Y(InterfaceC4339a interfaceC4339a, boolean z4, InterfaceC30057d<? super Float> interfaceC30057d) {
        f fVar;
        int i13;
        InterfaceC4339a interfaceC4339a2;
        int i14;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i15 = fVar.f102213E;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                fVar.f102213E = i15 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        Object obj = fVar.f102217z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i16 = fVar.f102213E;
        if (i16 == 0) {
            AbstractC34132o.m107864I(obj);
            i13 = 0;
            if (interfaceC4339a.invoke() == null || i13 >= 10 || !z4) {
                return interfaceC4339a.invoke();
            }
            fVar.f102214w = interfaceC4339a;
            fVar.f102215x = z4;
            fVar.f102216y = i13;
            fVar.f102213E = 1;
            if (AbstractC3034m0.m8782b(16L, fVar) == enumC31071a) {
                return enumC31071a;
            }
            interfaceC4339a2 = interfaceC4339a;
            i14 = i13;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i14 = fVar.f102216y;
            z4 = fVar.f102215x;
            interfaceC4339a2 = (InterfaceC4339a) fVar.f102214w;
            AbstractC34132o.m107864I(obj);
        }
        i13 = i14 + 1;
        interfaceC4339a = interfaceC4339a2;
        if (interfaceC4339a.invoke() == null) {
        }
        return interfaceC4339a.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0163  */
    /* JADX WARN: Code duplicated, block: B:103:0x0180  */
    /* JADX WARN: Code duplicated, block: B:107:0x018d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0197  */
    /* JADX WARN: Code duplicated, block: B:111:0x019d  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ce A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:118:0x01df  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:125:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:128:0x0200 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x0202  */
    /* JADX WARN: Code duplicated, block: B:134:0x0230  */
    /* JADX WARN: Code duplicated, block: B:137:0x025e  */
    /* JADX WARN: Code duplicated, block: B:140:0x026b  */
    /* JADX WARN: Code duplicated, block: B:143:0x027b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:144:0x027d  */
    /* JADX WARN: Code duplicated, block: B:147:0x0299  */
    /* JADX WARN: Code duplicated, block: B:150:0x02be A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:154:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:155:0x0300  */
    /* JADX WARN: Code duplicated, block: B:158:0x0313  */
    /* JADX WARN: Code duplicated, block: B:160:0x0321  */
    /* JADX WARN: Code duplicated, block: B:162:0x0336  */
    /* JADX WARN: Code duplicated, block: B:165:0x0342  */
    /* JADX WARN: Code duplicated, block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:76:0x0109  */
    /* JADX WARN: Code duplicated, block: B:79:0x0120  */
    /* JADX WARN: Code duplicated, block: B:82:0x0131  */
    /* JADX WARN: Code duplicated, block: B:85:0x0144  */
    /* JADX WARN: Code duplicated, block: B:86:0x0146  */
    /* JADX WARN: Code duplicated, block: B:89:0x014b  */
    /* JADX WARN: Code duplicated, block: B:90:0x014d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0153  */
    /* JADX WARN: Code duplicated, block: B:94:0x0155  */
    /* JADX WARN: Code duplicated, block: B:97:0x015d A[ADDED_TO_REGION] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static final void m76584f(C25889b c25889b, boolean z4, int i13, InterfaceC4339a interfaceC4339a, InterfaceC4351m content, Composer composer, int i14, int i15) {
        int i16;
        int i17;
        InterfaceC4339a interfaceC4339a2;
        int i18;
        boolean z13;
        int i19;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        int i24;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        final float fM76573T;
        Object objM87133R;
        final InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R3;
        final InterfaceC28601c1 interfaceC28601c3;
        Object objM87133R4;
        InterfaceC28601c1 interfaceC28601c4;
        Object objM87133R5;
        InterfaceC28601c1 interfaceC28601c5;
        Object objM87133R6;
        InterfaceC28601c1 interfaceC28601c6;
        Object objM87133R7;
        InterfaceC28601c1 interfaceC28601c7;
        boolean z14;
        boolean z15;
        int i25;
        boolean z16;
        boolean z17;
        Object objM87133R8;
        float f13;
        C11347e2 c11347e2M30574v;
        final InterfaceC28670t2 interfaceC28670t2M30588b;
        boolean zM87153g;
        Object objM87133R9;
        EnumC38591t enumC38591t;
        boolean z18;
        boolean z19;
        Object cVar;
        int i26;
        int i27;
        int i28;
        final InterfaceC28670t2 interfaceC28670t2M30588b2;
        EnumC38591t enumC38591t2;
        boolean zM87153g2;
        Object objM87133R10;
        Object objM87133R11;
        boolean zM87147d;
        Object objM87133R12;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        InterfaceC28601c1 interfaceC28601c1M76548f;
        InterfaceC28601c1 interfaceC28601c1M76548f2;
        Object objM87133R13;
        int i29;
        AbstractC22676k.m65750j(content, "content");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(792571534);
        if ((i14 & 6) == 0) {
            i16 = (c28655q.m87157i(c25889b) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        int i34 = i15 & 4;
        if (i34 == 0) {
            if ((i14 & 384) == 0) {
                i16 |= c28655q.m87149e(i13) ? 256 : 128;
            }
            i17 = i15 & 8;
            if (i17 != 0) {
                if ((i14 & 3072) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i18 = 2048;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i16 |= i18;
                }
                if ((i14 & 24576) == 0) {
                    if (c28655q.m87157i(content)) {
                        i29 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i29 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i16 |= i29;
                }
                if ((i16 & 9363) != 9362) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i16 & 1, z13)) {
                    if (i34 != 0) {
                        i24 = 0;
                    } else {
                        i24 = i13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i17 != 0) {
                        objM87133R13 = c28655q.m87133R();
                        if (objM87133R13 == c28676v0) {
                            objM87133R13 = new C25888a(2);
                            c28655q.m87172p0(objM87133R13);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R13;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    fM76573T = m76573T(c28655q, 0);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(null);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(EnumC25891d.WAITING_TO_ENTER);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R4);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87272z(0L);
                        c28655q.m87172p0(objM87133R5);
                    }
                    interfaceC28601c5 = (InterfaceC28601c1) objM87133R5;
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(null);
                        c28655q.m87172p0(objM87133R6);
                    }
                    interfaceC28601c6 = (InterfaceC28601c1) objM87133R6;
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC28683x.m87272z(null);
                        c28655q.m87172p0(objM87133R7);
                    }
                    interfaceC28601c7 = (InterfaceC28601c1) objM87133R7;
                    Boolean boolValueOf = Boolean.valueOf(z4);
                    if ((i16 & 112) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i16 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z24 = z14 | z15;
                    i25 = i16 & 896;
                    if (i25 == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z24 | z16;
                    objM87133R8 = c28655q.m87133R();
                    if (z17 || objM87133R8 == c28676v0) {
                        objM87133R8 = new a(z4, interfaceC4339a4, interfaceC28601c6, interfaceC28601c7, interfaceC28601c1, interfaceC28601c2, interfaceC28601c5, interfaceC28601c4, interfaceC28601c3, i24, null);
                        c28655q.m87172p0(objM87133R8);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R8, boolValueOf);
                    if (m76604z(interfaceC28601c3) != EnumC25891d.ENTERING || m76604z(interfaceC28601c3) == EnumC25891d.ENTERED) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    if (m76586h(interfaceC28601c4)) {
                        c11347e2M30574v = AbstractC11348f.m30574v(0, 0, null, 6);
                    } else {
                        c11347e2M30574v = AbstractC11348f.m30574v(400, 0, AbstractC11333b0.f36310a, 2);
                    }
                    interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v, "enter", null, c28655q, 3072, 20);
                    Float fValueOf = Float.valueOf(m76595q(interfaceC28670t2M30588b));
                    zM87153g = c28655q.m87153g(interfaceC28670t2M30588b);
                    objM87133R9 = c28655q.m87133R();
                    if (zM87153g || objM87133R9 == c28676v0) {
                        objM87133R9 = new b(interfaceC28601c3, interfaceC28670t2M30588b, null);
                        c28655q.m87172p0(objM87133R9);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R9, fValueOf);
                    if (c25889b != null || (interfaceC28601c1M76548f2 = c25889b.getCurrentDirection()) == null) {
                        enumC38591t = null;
                    } else {
                        enumC38591t = (EnumC38591t) interfaceC28601c1M76548f2.getValue();
                    }
                    boolean zM87157i = c28655q.m87157i(c25889b);
                    if (i25 == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z18 | zM87157i;
                    Object objM87133R14 = c28655q.m87133R();
                    if (!z19 || objM87133R14 == c28676v0) {
                        i26 = i16;
                        i27 = 0;
                        i28 = 2;
                        cVar = new c(c25889b, interfaceC28601c6, interfaceC28601c7, interfaceC28601c3, i24, null);
                        c28655q.m87172p0(cVar);
                    } else {
                        i26 = i16;
                        cVar = objM87133R14;
                        i27 = 0;
                        i28 = 2;
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) cVar, enumC38591t);
                    boolean z25 = i27;
                    interfaceC28670t2M30588b2 = AbstractC11352g.m30588b(m76604z(interfaceC28601c3) == EnumC25891d.EXITING ? 1.0f : 0.0f, AbstractC11348f.m30574v(400, i27, AbstractC11333b0.f36310a, i28), "exit", null, c28655q, 3072, 20);
                    Float fValueOf2 = Float.valueOf(m76596r(interfaceC28670t2M30588b2));
                    EnumC25891d enumC25891dM76604z = m76604z(interfaceC28601c3);
                    if (c25889b != null || (interfaceC28601c1M76548f = c25889b.getCurrentDirection()) == null) {
                        enumC38591t2 = null;
                    } else {
                        enumC38591t2 = (EnumC38591t) interfaceC28601c1M76548f.getValue();
                    }
                    zM87153g2 = c28655q.m87153g(interfaceC28670t2M30588b2) | c28655q.m87157i(c25889b);
                    objM87133R10 = c28655q.m87133R();
                    if (zM87153g2 || objM87133R10 == c28676v0) {
                        objM87133R10 = new d(c25889b, interfaceC28601c3, interfaceC28670t2M30588b2, null);
                        c28655q.m87172p0(objM87133R10);
                    }
                    AbstractC28683x.m87255i(fValueOf2, enumC25891dM76604z, enumC38591t2, (InterfaceC4351m) objM87133R10, c28655q);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
                    objM87133R11 = c28655q.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C1024j(5, interfaceC28601c2, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R11);
                    }
                    Modifier modifierM3501a = AbstractC1132b.m3501a(modifierM3409f, (Function1) objM87133R11);
                    zM87147d = c28655q.m87147d(fM76573T) | c28655q.m87153g(interfaceC28670t2M30588b) | c28655q.m87153g(interfaceC28670t2M30588b2);
                    objM87133R12 = c28655q.m87133R();
                    if (zM87147d || objM87133R12 == c28676v0) {
                        objM87133R12 = new Function1() { // from class: mq2.e
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC25894g.m76599u(fM76573T, interfaceC28601c1, interfaceC28601c3, interfaceC28670t2M30588b, interfaceC28670t2M30588b2, (InterfaceC17886g0) obj);
                            }
                        };
                        c28655q.m87172p0(objM87133R12);
                    }
                    Modifier modifierM3486a = AbstractC1127a.m3486a(modifierM3501a, (Function1) objM87133R12);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, z25);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3486a);
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
                    AbstractC11895b.m32007z((i26 >> 12) & 14, content, c28655q, true);
                    interfaceC4339a3 = interfaceC4339a4;
                    i19 = i24;
                } else {
                    c28655q.m87138X();
                    i19 = i13;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C18421f(c25889b, z4, i19, interfaceC4339a3, content, i14, i15);
                }
            }
            i16 |= 3072;
            interfaceC4339a2 = interfaceC4339a;
            if ((i14 & 24576) == 0) {
                if (c28655q.m87157i(content)) {
                    i29 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i29 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i16 |= i29;
            }
            if ((i16 & 9363) != 9362) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i16 & 1, z13)) {
                if (i34 != 0) {
                    i24 = 0;
                } else {
                    i24 = i13;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R13 = c28655q.m87133R();
                    if (objM87133R13 == c28676v0) {
                        objM87133R13 = new C25888a(2);
                        c28655q.m87172p0(objM87133R13);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R13;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                fM76573T = m76573T(c28655q, 0);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(null);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(EnumC25891d.WAITING_TO_ENTER);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R4);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(0L);
                    c28655q.m87172p0(objM87133R5);
                }
                interfaceC28601c5 = (InterfaceC28601c1) objM87133R5;
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC28683x.m87272z(null);
                    c28655q.m87172p0(objM87133R6);
                }
                interfaceC28601c6 = (InterfaceC28601c1) objM87133R6;
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC28683x.m87272z(null);
                    c28655q.m87172p0(objM87133R7);
                }
                interfaceC28601c7 = (InterfaceC28601c1) objM87133R7;
                Boolean boolValueOf2 = Boolean.valueOf(z4);
                if ((i16 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i16 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z26 = z14 | z15;
                i25 = i16 & 896;
                if (i25 == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z26 | z16;
                objM87133R8 = c28655q.m87133R();
                if (z17) {
                    objM87133R8 = new a(z4, interfaceC4339a4, interfaceC28601c6, interfaceC28601c7, interfaceC28601c1, interfaceC28601c2, interfaceC28601c5, interfaceC28601c4, interfaceC28601c3, i24, null);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new a(z4, interfaceC4339a4, interfaceC28601c6, interfaceC28601c7, interfaceC28601c1, interfaceC28601c2, interfaceC28601c5, interfaceC28601c4, interfaceC28601c3, i24, null);
                    c28655q.m87172p0(objM87133R8);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R8, boolValueOf2);
                if (m76604z(interfaceC28601c3) != EnumC25891d.ENTERING) {
                    f13 = 1.0f;
                } else {
                    f13 = 1.0f;
                }
                if (m76586h(interfaceC28601c4)) {
                    c11347e2M30574v = AbstractC11348f.m30574v(0, 0, null, 6);
                } else {
                    c11347e2M30574v = AbstractC11348f.m30574v(400, 0, AbstractC11333b0.f36310a, 2);
                }
                interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v, "enter", null, c28655q, 3072, 20);
                Float fValueOf3 = Float.valueOf(m76595q(interfaceC28670t2M30588b));
                zM87153g = c28655q.m87153g(interfaceC28670t2M30588b);
                objM87133R9 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R9 = new b(interfaceC28601c3, interfaceC28670t2M30588b, null);
                    c28655q.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new b(interfaceC28601c3, interfaceC28670t2M30588b, null);
                    c28655q.m87172p0(objM87133R9);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R9, fValueOf3);
                if (c25889b != null) {
                    enumC38591t = null;
                } else {
                    enumC38591t = null;
                }
                boolean zM87157i2 = c28655q.m87157i(c25889b);
                if (i25 == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z18 | zM87157i2;
                Object objM87133R15 = c28655q.m87133R();
                if (z19) {
                    i26 = i16;
                    i27 = 0;
                    i28 = 2;
                    cVar = new c(c25889b, interfaceC28601c6, interfaceC28601c7, interfaceC28601c3, i24, null);
                    c28655q.m87172p0(cVar);
                } else {
                    i26 = i16;
                    i27 = 0;
                    i28 = 2;
                    cVar = new c(c25889b, interfaceC28601c6, interfaceC28601c7, interfaceC28601c3, i24, null);
                    c28655q.m87172p0(cVar);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) cVar, enumC38591t);
                boolean z27 = i27;
                interfaceC28670t2M30588b2 = AbstractC11352g.m30588b(m76604z(interfaceC28601c3) == EnumC25891d.EXITING ? 1.0f : 0.0f, AbstractC11348f.m30574v(400, i27, AbstractC11333b0.f36310a, i28), "exit", null, c28655q, 3072, 20);
                Float fValueOf4 = Float.valueOf(m76596r(interfaceC28670t2M30588b2));
                EnumC25891d enumC25891dM76604z2 = m76604z(interfaceC28601c3);
                if (c25889b != null) {
                    enumC38591t2 = null;
                } else {
                    enumC38591t2 = null;
                }
                zM87153g2 = c28655q.m87153g(interfaceC28670t2M30588b2) | c28655q.m87157i(c25889b);
                objM87133R10 = c28655q.m87133R();
                if (zM87153g2) {
                    objM87133R10 = new d(c25889b, interfaceC28601c3, interfaceC28670t2M30588b2, null);
                    c28655q.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new d(c25889b, interfaceC28601c3, interfaceC28670t2M30588b2, null);
                    c28655q.m87172p0(objM87133R10);
                }
                AbstractC28683x.m87255i(fValueOf4, enumC25891dM76604z2, enumC38591t2, (InterfaceC4351m) objM87133R10, c28655q);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
                objM87133R11 = c28655q.m87133R();
                if (objM87133R11 == c28676v0) {
                    objM87133R11 = new C1024j(5, interfaceC28601c2, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R11);
                }
                Modifier modifierM3501a2 = AbstractC1132b.m3501a(modifierM3409f2, (Function1) objM87133R11);
                zM87147d = c28655q.m87147d(fM76573T) | c28655q.m87153g(interfaceC28670t2M30588b) | c28655q.m87153g(interfaceC28670t2M30588b2);
                objM87133R12 = c28655q.m87133R();
                if (zM87147d) {
                    objM87133R12 = new Function1() { // from class: mq2.e
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC25894g.m76599u(fM76573T, interfaceC28601c1, interfaceC28601c3, interfaceC28670t2M30588b, interfaceC28670t2M30588b2, (InterfaceC17886g0) obj);
                        }
                    };
                    c28655q.m87172p0(objM87133R12);
                } else {
                    objM87133R12 = new Function1() { // from class: mq2.e
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC25894g.m76599u(fM76573T, interfaceC28601c1, interfaceC28601c3, interfaceC28670t2M30588b, interfaceC28670t2M30588b2, (InterfaceC17886g0) obj);
                        }
                    };
                    c28655q.m87172p0(objM87133R12);
                }
                Modifier modifierM3486a2 = AbstractC1127a.m3486a(modifierM3501a2, (Function1) objM87133R12);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, z27);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3486a2);
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
                AbstractC11895b.m32007z((i26 >> 12) & 14, content, c28655q, true);
                interfaceC4339a3 = interfaceC4339a4;
                i19 = i24;
            } else {
                c28655q.m87138X();
                i19 = i13;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C18421f(c25889b, z4, i19, interfaceC4339a3, content, i14, i15);
            }
        }
        i16 |= 384;
        i17 = i15 & 8;
        if (i17 != 0) {
            if ((i14 & 3072) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a2)) {
                    i18 = 2048;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i16 |= i18;
            }
            if ((i14 & 24576) == 0) {
                if (c28655q.m87157i(content)) {
                    i29 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i29 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i16 |= i29;
            }
            if ((i16 & 9363) != 9362) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i16 & 1, z13)) {
                if (i34 != 0) {
                    i24 = 0;
                } else {
                    i24 = i13;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R13 = c28655q.m87133R();
                    if (objM87133R13 == c28676v0) {
                        objM87133R13 = new C25888a(2);
                        c28655q.m87172p0(objM87133R13);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R13;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                fM76573T = m76573T(c28655q, 0);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(null);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(EnumC25891d.WAITING_TO_ENTER);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R4);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87272z(0L);
                    c28655q.m87172p0(objM87133R5);
                }
                interfaceC28601c5 = (InterfaceC28601c1) objM87133R5;
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC28683x.m87272z(null);
                    c28655q.m87172p0(objM87133R6);
                }
                interfaceC28601c6 = (InterfaceC28601c1) objM87133R6;
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC28683x.m87272z(null);
                    c28655q.m87172p0(objM87133R7);
                }
                interfaceC28601c7 = (InterfaceC28601c1) objM87133R7;
                Boolean boolValueOf3 = Boolean.valueOf(z4);
                if ((i16 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i16 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z28 = z14 | z15;
                i25 = i16 & 896;
                if (i25 == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z28 | z16;
                objM87133R8 = c28655q.m87133R();
                if (z17) {
                    objM87133R8 = new a(z4, interfaceC4339a4, interfaceC28601c6, interfaceC28601c7, interfaceC28601c1, interfaceC28601c2, interfaceC28601c5, interfaceC28601c4, interfaceC28601c3, i24, null);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new a(z4, interfaceC4339a4, interfaceC28601c6, interfaceC28601c7, interfaceC28601c1, interfaceC28601c2, interfaceC28601c5, interfaceC28601c4, interfaceC28601c3, i24, null);
                    c28655q.m87172p0(objM87133R8);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R8, boolValueOf3);
                if (m76604z(interfaceC28601c3) != EnumC25891d.ENTERING) {
                    f13 = 1.0f;
                } else {
                    f13 = 1.0f;
                }
                if (m76586h(interfaceC28601c4)) {
                    c11347e2M30574v = AbstractC11348f.m30574v(0, 0, null, 6);
                } else {
                    c11347e2M30574v = AbstractC11348f.m30574v(400, 0, AbstractC11333b0.f36310a, 2);
                }
                interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v, "enter", null, c28655q, 3072, 20);
                Float fValueOf5 = Float.valueOf(m76595q(interfaceC28670t2M30588b));
                zM87153g = c28655q.m87153g(interfaceC28670t2M30588b);
                objM87133R9 = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R9 = new b(interfaceC28601c3, interfaceC28670t2M30588b, null);
                    c28655q.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new b(interfaceC28601c3, interfaceC28670t2M30588b, null);
                    c28655q.m87172p0(objM87133R9);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R9, fValueOf5);
                if (c25889b != null) {
                    enumC38591t = null;
                } else {
                    enumC38591t = null;
                }
                boolean zM87157i3 = c28655q.m87157i(c25889b);
                if (i25 == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z18 | zM87157i3;
                Object objM87133R16 = c28655q.m87133R();
                if (z19) {
                    i26 = i16;
                    i27 = 0;
                    i28 = 2;
                    cVar = new c(c25889b, interfaceC28601c6, interfaceC28601c7, interfaceC28601c3, i24, null);
                    c28655q.m87172p0(cVar);
                } else {
                    i26 = i16;
                    i27 = 0;
                    i28 = 2;
                    cVar = new c(c25889b, interfaceC28601c6, interfaceC28601c7, interfaceC28601c3, i24, null);
                    c28655q.m87172p0(cVar);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) cVar, enumC38591t);
                boolean z29 = i27;
                interfaceC28670t2M30588b2 = AbstractC11352g.m30588b(m76604z(interfaceC28601c3) == EnumC25891d.EXITING ? 1.0f : 0.0f, AbstractC11348f.m30574v(400, i27, AbstractC11333b0.f36310a, i28), "exit", null, c28655q, 3072, 20);
                Float fValueOf6 = Float.valueOf(m76596r(interfaceC28670t2M30588b2));
                EnumC25891d enumC25891dM76604z3 = m76604z(interfaceC28601c3);
                if (c25889b != null) {
                    enumC38591t2 = null;
                } else {
                    enumC38591t2 = null;
                }
                zM87153g2 = c28655q.m87153g(interfaceC28670t2M30588b2) | c28655q.m87157i(c25889b);
                objM87133R10 = c28655q.m87133R();
                if (zM87153g2) {
                    objM87133R10 = new d(c25889b, interfaceC28601c3, interfaceC28670t2M30588b2, null);
                    c28655q.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new d(c25889b, interfaceC28601c3, interfaceC28670t2M30588b2, null);
                    c28655q.m87172p0(objM87133R10);
                }
                AbstractC28683x.m87255i(fValueOf6, enumC25891dM76604z3, enumC38591t2, (InterfaceC4351m) objM87133R10, c28655q);
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
                objM87133R11 = c28655q.m87133R();
                if (objM87133R11 == c28676v0) {
                    objM87133R11 = new C1024j(5, interfaceC28601c2, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R11);
                }
                Modifier modifierM3501a3 = AbstractC1132b.m3501a(modifierM3409f3, (Function1) objM87133R11);
                zM87147d = c28655q.m87147d(fM76573T) | c28655q.m87153g(interfaceC28670t2M30588b) | c28655q.m87153g(interfaceC28670t2M30588b2);
                objM87133R12 = c28655q.m87133R();
                if (zM87147d) {
                    objM87133R12 = new Function1() { // from class: mq2.e
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC25894g.m76599u(fM76573T, interfaceC28601c1, interfaceC28601c3, interfaceC28670t2M30588b, interfaceC28670t2M30588b2, (InterfaceC17886g0) obj);
                        }
                    };
                    c28655q.m87172p0(objM87133R12);
                } else {
                    objM87133R12 = new Function1() { // from class: mq2.e
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC25894g.m76599u(fM76573T, interfaceC28601c1, interfaceC28601c3, interfaceC28670t2M30588b, interfaceC28670t2M30588b2, (InterfaceC17886g0) obj);
                        }
                    };
                    c28655q.m87172p0(objM87133R12);
                }
                Modifier modifierM3486a3 = AbstractC1127a.m3486a(modifierM3501a3, (Function1) objM87133R12);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9102E, z29);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3486a3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                AbstractC11895b.m32007z((i26 >> 12) & 14, content, c28655q, true);
                interfaceC4339a3 = interfaceC4339a4;
                i19 = i24;
            } else {
                c28655q.m87138X();
                i19 = i13;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C18421f(c25889b, z4, i19, interfaceC4339a3, content, i14, i15);
            }
        }
        i16 |= 3072;
        interfaceC4339a2 = interfaceC4339a;
        if ((i14 & 24576) == 0) {
            if (c28655q.m87157i(content)) {
                i29 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i29 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 |= i29;
        }
        if ((i16 & 9363) != 9362) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i16 & 1, z13)) {
            if (i34 != 0) {
                i24 = 0;
            } else {
                i24 = i13;
            }
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R13 = c28655q.m87133R();
                if (objM87133R13 == c28676v0) {
                    objM87133R13 = new C25888a(2);
                    c28655q.m87172p0(objM87133R13);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R13;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            fM76573T = m76573T(c28655q, 0);
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(EnumC25891d.WAITING_TO_ENTER);
                c28655q.m87172p0(objM87133R3);
            }
            interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
            objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R4);
            }
            interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
            objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87272z(0L);
                c28655q.m87172p0(objM87133R5);
            }
            interfaceC28601c5 = (InterfaceC28601c1) objM87133R5;
            objM87133R6 = c28655q.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R6);
            }
            interfaceC28601c6 = (InterfaceC28601c1) objM87133R6;
            objM87133R7 = c28655q.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R7);
            }
            interfaceC28601c7 = (InterfaceC28601c1) objM87133R7;
            Boolean boolValueOf4 = Boolean.valueOf(z4);
            if ((i16 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            if ((i16 & 7168) == 2048) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z210 = z14 | z15;
            i25 = i16 & 896;
            if (i25 == 256) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = z210 | z16;
            objM87133R8 = c28655q.m87133R();
            if (z17) {
                objM87133R8 = new a(z4, interfaceC4339a4, interfaceC28601c6, interfaceC28601c7, interfaceC28601c1, interfaceC28601c2, interfaceC28601c5, interfaceC28601c4, interfaceC28601c3, i24, null);
                c28655q.m87172p0(objM87133R8);
            } else {
                objM87133R8 = new a(z4, interfaceC4339a4, interfaceC28601c6, interfaceC28601c7, interfaceC28601c1, interfaceC28601c2, interfaceC28601c5, interfaceC28601c4, interfaceC28601c3, i24, null);
                c28655q.m87172p0(objM87133R8);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R8, boolValueOf4);
            if (m76604z(interfaceC28601c3) != EnumC25891d.ENTERING) {
                f13 = 1.0f;
            } else {
                f13 = 1.0f;
            }
            if (m76586h(interfaceC28601c4)) {
                c11347e2M30574v = AbstractC11348f.m30574v(0, 0, null, 6);
            } else {
                c11347e2M30574v = AbstractC11348f.m30574v(400, 0, AbstractC11333b0.f36310a, 2);
            }
            interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v, "enter", null, c28655q, 3072, 20);
            Float fValueOf7 = Float.valueOf(m76595q(interfaceC28670t2M30588b));
            zM87153g = c28655q.m87153g(interfaceC28670t2M30588b);
            objM87133R9 = c28655q.m87133R();
            if (zM87153g) {
                objM87133R9 = new b(interfaceC28601c3, interfaceC28670t2M30588b, null);
                c28655q.m87172p0(objM87133R9);
            } else {
                objM87133R9 = new b(interfaceC28601c3, interfaceC28670t2M30588b, null);
                c28655q.m87172p0(objM87133R9);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R9, fValueOf7);
            if (c25889b != null) {
                enumC38591t = null;
            } else {
                enumC38591t = null;
            }
            boolean zM87157i4 = c28655q.m87157i(c25889b);
            if (i25 == 256) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = z18 | zM87157i4;
            Object objM87133R17 = c28655q.m87133R();
            if (z19) {
                i26 = i16;
                i27 = 0;
                i28 = 2;
                cVar = new c(c25889b, interfaceC28601c6, interfaceC28601c7, interfaceC28601c3, i24, null);
                c28655q.m87172p0(cVar);
            } else {
                i26 = i16;
                i27 = 0;
                i28 = 2;
                cVar = new c(c25889b, interfaceC28601c6, interfaceC28601c7, interfaceC28601c3, i24, null);
                c28655q.m87172p0(cVar);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) cVar, enumC38591t);
            boolean z211 = i27;
            interfaceC28670t2M30588b2 = AbstractC11352g.m30588b(m76604z(interfaceC28601c3) == EnumC25891d.EXITING ? 1.0f : 0.0f, AbstractC11348f.m30574v(400, i27, AbstractC11333b0.f36310a, i28), "exit", null, c28655q, 3072, 20);
            Float fValueOf8 = Float.valueOf(m76596r(interfaceC28670t2M30588b2));
            EnumC25891d enumC25891dM76604z4 = m76604z(interfaceC28601c3);
            if (c25889b != null) {
                enumC38591t2 = null;
            } else {
                enumC38591t2 = null;
            }
            zM87153g2 = c28655q.m87153g(interfaceC28670t2M30588b2) | c28655q.m87157i(c25889b);
            objM87133R10 = c28655q.m87133R();
            if (zM87153g2) {
                objM87133R10 = new d(c25889b, interfaceC28601c3, interfaceC28670t2M30588b2, null);
                c28655q.m87172p0(objM87133R10);
            } else {
                objM87133R10 = new d(c25889b, interfaceC28601c3, interfaceC28670t2M30588b2, null);
                c28655q.m87172p0(objM87133R10);
            }
            AbstractC28683x.m87255i(fValueOf8, enumC25891dM76604z4, enumC38591t2, (InterfaceC4351m) objM87133R10, c28655q);
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            objM87133R11 = c28655q.m87133R();
            if (objM87133R11 == c28676v0) {
                objM87133R11 = new C1024j(5, interfaceC28601c2, interfaceC28601c1);
                c28655q.m87172p0(objM87133R11);
            }
            Modifier modifierM3501a4 = AbstractC1132b.m3501a(modifierM3409f4, (Function1) objM87133R11);
            zM87147d = c28655q.m87147d(fM76573T) | c28655q.m87153g(interfaceC28670t2M30588b) | c28655q.m87153g(interfaceC28670t2M30588b2);
            objM87133R12 = c28655q.m87133R();
            if (zM87147d) {
                objM87133R12 = new Function1() { // from class: mq2.e
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC25894g.m76599u(fM76573T, interfaceC28601c1, interfaceC28601c3, interfaceC28670t2M30588b, interfaceC28670t2M30588b2, (InterfaceC17886g0) obj);
                    }
                };
                c28655q.m87172p0(objM87133R12);
            } else {
                objM87133R12 = new Function1() { // from class: mq2.e
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC25894g.m76599u(fM76573T, interfaceC28601c1, interfaceC28601c3, interfaceC28670t2M30588b, interfaceC28670t2M30588b2, (InterfaceC17886g0) obj);
                    }
                };
                c28655q.m87172p0(objM87133R12);
            }
            Modifier modifierM3486a4 = AbstractC1127a.m3486a(modifierM3501a4, (Function1) objM87133R12);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9102E, z211);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3486a4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
            AbstractC11895b.m32007z((i26 >> 12) & 14, content, c28655q, true);
            interfaceC4339a3 = interfaceC4339a4;
            i19 = i24;
        } else {
            c28655q.m87138X();
            i19 = i13;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18421f(c25889b, z4, i19, interfaceC4339a3, content, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final long m76585g() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: h */
    private static final boolean m76586h(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final void m76587i(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final long m76588j(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m76589k(InterfaceC28601c1 interfaceC28601c1, long j7) {
        interfaceC28601c1.setValue(Long.valueOf(j7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final InterfaceC3027k1 m76590l(InterfaceC28601c1 interfaceC28601c1) {
        return (InterfaceC3027k1) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final void m76591m(InterfaceC28601c1 interfaceC28601c1, InterfaceC3027k1 interfaceC3027k1) {
        interfaceC28601c1.setValue(interfaceC3027k1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final Float m76592n(InterfaceC28601c1 interfaceC28601c1) {
        return (Float) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final InterfaceC3027k1 m76593o(InterfaceC28601c1 interfaceC28601c1) {
        return (InterfaceC3027k1) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final void m76594p(InterfaceC28601c1 interfaceC28601c1, InterfaceC3027k1 interfaceC3027k1) {
        interfaceC28601c1.setValue(interfaceC3027k1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final float m76595q(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final float m76596r(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m76597s(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC39147y coordinates) {
        AbstractC22676k.m65750j(coordinates, "coordinates");
        m76575V(coordinates, m76602x(interfaceC28601c1), m76592n(interfaceC28601c2), new C1024j(6, interfaceC28601c2, interfaceC28601c1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m76598t(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, float f13) {
        m76600v(interfaceC28601c1, Float.valueOf(f13));
        m76603y(interfaceC28601c2, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m76599u(float f13, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        float fM76574U = m76574U(m76592n(interfaceC28601c1), f13, m76604z(interfaceC28601c2), m76595q(interfaceC28670t2), m76596r(interfaceC28670t3));
        float fM76571R = m76571R(m76604z(interfaceC28601c2), m76595q(interfaceC28670t2), m76596r(interfaceC28670t3));
        float fM76570Q = m76570Q(m76604z(interfaceC28601c2), m76595q(interfaceC28670t2), m76596r(interfaceC28670t3));
        C17920x0 c17920x0 = (C17920x0) graphicsLayer;
        c17920x0.m51550E(fM76574U);
        c17920x0.m51560p(fM76571R);
        c17920x0.m51561r(fM76571R);
        c17920x0.m51551a(fM76570Q);
        int i13 = C17881e1.f69567c;
        c17920x0.m51565y(C17881e1.f69566b);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final void m76600v(InterfaceC28601c1 interfaceC28601c1, Float f13) {
        interfaceC28601c1.setValue(f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m76601w(C25889b c25889b, boolean z4, int i13, InterfaceC4339a interfaceC4339a, InterfaceC4351m interfaceC4351m, int i14, int i15, Composer composer, int i16) {
        m76584f(c25889b, z4, i13, interfaceC4339a, interfaceC4351m, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    private static final boolean m76602x(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final void m76603y(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final EnumC25891d m76604z(InterfaceC28601c1 interfaceC28601c1) {
        return (EnumC25891d) interfaceC28601c1.getValue();
    }
}
