package rm1;

import am2.C1024j;
import am2.C1025j0;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bb2.C2928d;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.profile.view.C9754e;
import e93.AbstractC12889b;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13062m;
import h01.InterfaceC16556w;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import live.hms.video.error.ErrorCodes;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26949h;
import nw0.C27198e;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p040c0.AbstractC3730c1;
import p040c0.AbstractC3788w0;
import p040c0.C3733d1;
import p040c0.C3739f1;
import p040c0.InterfaceC3747i0;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p077d0.C11347e2;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p411q2.InterfaceC29805a;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p636y3.C39178j;
import p636y3.InterfaceC39171c;
import p710im1.AbstractC18667e0;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p741vn1.AbstractC36203g;
import p741vn1.EnumC36197a;
import p741vn1.EnumC36205i;
import p741vn1.Function0;
import pj2.C29308g;
import q83.InterfaceC30057d;
import r61.C30985h;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import re1.C31314a;
import ri2.C31469a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tl1.C33919c;
import un1.AbstractC35097c;
import un1.EnumC35102h;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: rm1.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a·\u0001\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00072\u001a\b\u0002\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00072\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u00072\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006$²\u0006\u000e\u0010\u0018\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u001b\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u001d8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010 \u001a\u00020\u001f8\nX\u008a\u0084\u0002²\u0006\f\u0010!\u001a\u00020\u001f8\nX\u008a\u0084\u0002²\u0006\f\u0010#\u001a\u00020\"8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lvn1/g$c;", "viewState", "", "hasAiCoach", "Lkotlin/Function0;", "Ll83/a0;", "onShimmerFinished", "Lkotlin/Function1;", "onAllCardsDismissed", "Lkotlin/Function2;", "", "Lvn1/a;", "onReadCard", "", "onViewEvent", "hideReplayButton", "Lvn1/i;", "changeNotificationCardDismissAnimation", "", "Lh01/w;", "listOfCards", "isDayOneAnimationCompleted", "o", "(Lvn1/g$c;ZLc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Ljava/util/List;ZLandroidx/compose/runtime/Composer;II)V", "showListOfCards", "showNextStackedCard", "showNumberOfCards", "isAnimationComplete", "shouldPlayAnimation", "Lun1/h;", "transitionState", "", "rotation", "replayButtonOffsetPercent", "Ly3/f;", "counterPadding", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31594h {

    /* JADX INFO: renamed from: rm1.h$a */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.dayonetransition.DayOneNotificationCardStateKt$DayOneNotificationCardState$7$1", m100430f = "DayOneNotificationCardState.kt", m100431l = {65}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f130557w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f130558x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f130559y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f130560z;

        /* JADX INFO: renamed from: rm1.h$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42282a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC28601c1 f130561w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC28601c1 f130562x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC28601c1 f130563y;

            /* JADX INFO: renamed from: rm1.h$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.home.view.dayonetransition.DayOneNotificationCardStateKt$DayOneNotificationCardState$7$1$1", m100430f = "DayOneNotificationCardState.kt", m100431l = {68, 70}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42283a extends AbstractC32269c {

                /* JADX INFO: renamed from: w */
                Object f130564w;

                /* JADX INFO: renamed from: x */
                /* synthetic */ Object f130565x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ C42282a<T> f130566y;

                /* JADX INFO: renamed from: z */
                int f130567z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C42283a(C42282a<? super T> c42282a, InterfaceC30057d<? super C42283a> interfaceC30057d) {
                    super(interfaceC30057d);
                    this.f130566y = c42282a;
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f130565x = obj;
                    this.f130567z |= Integer.MIN_VALUE;
                    return this.f130566y.emit(null, this);
                }
            }

            public C42282a(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3) {
                this.f130561w = interfaceC28601c1;
                this.f130562x = interfaceC28601c2;
                this.f130563y = interfaceC28601c3;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
            
                if (bc3.AbstractC3034m0.m8782b(1000, r0) == r1) goto L23;
             */
            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(tl1.AbstractC33918b r9, q83.InterfaceC30057d<? super l83.C23454a0> r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof rm1.AbstractC31594h.a.C42282a.C42283a
                    if (r0 == 0) goto L13
                    r0 = r10
                    rm1.h$a$a$a r0 = (rm1.AbstractC31594h.a.C42282a.C42283a) r0
                    int r1 = r0.f130567z
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f130567z = r1
                    goto L18
                L13:
                    rm1.h$a$a$a r0 = new rm1.h$a$a$a
                    r0.<init>(r8, r10)
                L18:
                    java.lang.Object r10 = r0.f130565x
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r0.f130567z
                    r3 = 0
                    r4 = 1000(0x3e8, double:4.94E-321)
                    r6 = 2
                    r7 = 1
                    if (r2 == 0) goto L41
                    if (r2 == r7) goto L39
                    if (r2 != r6) goto L31
                    java.lang.Object r9 = r0.f130564w
                    tl1.b r9 = (tl1.AbstractC33918b) r9
                    p505ts.AbstractC34132o.m107864I(r10)
                    goto L69
                L31:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L39:
                    java.lang.Object r9 = r0.f130564w
                    tl1.b r9 = (tl1.AbstractC33918b) r9
                    p505ts.AbstractC34132o.m107864I(r10)
                    goto L59
                L41:
                    p505ts.AbstractC34132o.m107864I(r10)
                    boolean r9 = r9 instanceof tl1.AbstractC33918b.b
                    if (r9 == 0) goto L75
                    p1.c1 r9 = r8.f130561w
                    r10 = 0
                    rm1.AbstractC31594h.m97419V(r9, r10)
                    r0.f130564w = r3
                    r0.f130567z = r7
                    java.lang.Object r9 = bc3.AbstractC3034m0.m8782b(r4, r0)
                    if (r9 != r1) goto L59
                    goto L68
                L59:
                    p1.c1 r9 = r8.f130562x
                    rm1.AbstractC31594h.m97415R(r9, r7)
                    r0.f130564w = r3
                    r0.f130567z = r6
                    java.lang.Object r9 = bc3.AbstractC3034m0.m8782b(r4, r0)
                    if (r9 != r1) goto L69
                L68:
                    return r1
                L69:
                    p1.c1 r9 = r8.f130563y
                    rm1.AbstractC31594h.m97416S(r9, r7)
                    tl1.c$a r9 = tl1.C33919c.INSTANCE
                    tl1.b$a r10 = tl1.AbstractC33918b.a.f142102a
                    r9.m107297b(r10)
                L75:
                    l83.a0 r9 = l83.C23454a0.f92919a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: rm1.AbstractC31594h.a.C42282a.emit(tl1.b, q83.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f130558x = interfaceC28601c1;
            this.f130559y = interfaceC28601c2;
            this.f130560z = interfaceC28601c3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f130558x, this.f130559y, this.f130560z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f130557w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13037f2 interfaceC13037f2M107296a = C33919c.INSTANCE.m107296a();
                C42282a c42282a = new C42282a(this.f130558x, this.f130559y, this.f130560z);
                this.f130557w = 1;
                if (interfaceC13037f2M107296a.collect(c42282a, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: rm1.h$b */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.dayonetransition.DayOneNotificationCardStateKt$DayOneNotificationCardState$9$1", m100430f = "DayOneNotificationCardState.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f130568E;

        /* JADX INFO: renamed from: w */
        int f130569w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC36203g.c f130570x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f130571y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f130572z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC36203g.c cVar, InterfaceC4339a interfaceC4339a, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f130570x = cVar;
            this.f130571y = interfaceC4339a;
            this.f130572z = function1;
            this.f130568E = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f130570x, this.f130571y, this.f130572z, this.f130568E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f130569w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC36203g.c cVar = this.f130570x;
            if (cVar == null) {
                cVar = null;
            }
            if (cVar != null) {
                InterfaceC4339a interfaceC4339a = this.f130571y;
                Function1 function1 = this.f130572z;
                InterfaceC28601c1 interfaceC28601c1 = this.f130568E;
                if (cVar.getCardStackSize() > 0) {
                    interfaceC4339a.invoke();
                    AbstractC31594h.m97445z(interfaceC28601c1, true);
                }
                if (!AbstractC31594h.m97444y(interfaceC28601c1) && cVar.getCardStackSize() == 0) {
                    function1.invoke(Boolean.FALSE);
                }
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: A */
    private static final EnumC35102h m97398A(InterfaceC28601c1 interfaceC28601c1) {
        return (EnumC35102h) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: B */
    private static final void m97399B(InterfaceC28601c1 interfaceC28601c1, EnumC35102h enumC35102h) {
        interfaceC28601c1.setValue(enumC35102h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m97400C(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, float f13) {
        m97399B(interfaceC28601c1, EnumC35102h.NORMAL);
        m97445z(interfaceC28601c2, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    private static final float m97401D(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m97402E(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, float f13) {
        m97445z(interfaceC28601c1, false);
        m97399B(interfaceC28601c2, EnumC35102h.NORMAL);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F */
    private static final float m97403F(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m97404G(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H */
    private static final float m97405H(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m97406I(Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C29308g(function1, interfaceC28601c1, 3);
            c28655q.m87172p0(objM87133R);
        }
        Function0.m115217c((InterfaceC4339a) objM87133R, c28655q, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m97407J(Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        m97399B(interfaceC28601c1, EnumC35102h.REPLAY);
        function1.invoke(Boolean.TRUE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C39178j m97408K(float f13, InterfaceC28670t2 interfaceC28670t2, InterfaceC39171c offset) {
        AbstractC22676k.m65750j(offset, "$this$offset");
        offset.getDensity();
        return new C39178j((((long) 0) << 32) | (((long) AbstractC12889b.m36258X((f13 * m97403F(interfaceC28670t2)) + offset.mo743q0(1 * 8))) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m97409L(AbstractC36203g.c cVar, Function1 function1, InterfaceC4351m interfaceC4351m, InterfaceC29805a interfaceC29805a) {
        InterfaceC16556w interfaceC16556wM115208c = cVar.getCardToDisplay();
        if (interfaceC16556wM115208c != null) {
            function1.invoke(EnumC36205i.LEFT_SWIPE);
            interfaceC4351m.invoke(interfaceC16556wM115208c.getId(), EnumC36197a.TAP);
            interfaceC29805a.mo7428a(0);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m97410M(AbstractC36203g.c cVar, boolean z4, InterfaceC4339a interfaceC4339a, Function1 function1, InterfaceC4351m interfaceC4351m, Function1 function2, InterfaceC4339a interfaceC4339a2, Function1 function3, List list, boolean z13, int i13, int i14, Composer composer, int i15) {
        m97434o(cVar, z4, interfaceC4339a, function1, interfaceC4351m, function2, interfaceC4339a2, function3, list, z13, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m97411N() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m97412O(EnumC36205i enumC36205i) {
        AbstractC22676k.m65750j(enumC36205i, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: P */
    private static final boolean m97413P(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final void m97414Q(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX WARN: Code duplicated, block: B:103:0x012c  */
    /* JADX WARN: Code duplicated, block: B:104:0x012e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0137 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x0139  */
    /* JADX WARN: Code duplicated, block: B:111:0x013e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0144  */
    /* JADX WARN: Code duplicated, block: B:115:0x0150  */
    /* JADX WARN: Code duplicated, block: B:117:0x0153  */
    /* JADX WARN: Code duplicated, block: B:119:0x0159  */
    /* JADX WARN: Code duplicated, block: B:121:0x0166  */
    /* JADX WARN: Code duplicated, block: B:123:0x0169  */
    /* JADX WARN: Code duplicated, block: B:125:0x016f  */
    /* JADX WARN: Code duplicated, block: B:127:0x017b  */
    /* JADX WARN: Code duplicated, block: B:129:0x017f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0185  */
    /* JADX WARN: Code duplicated, block: B:133:0x0192  */
    /* JADX WARN: Code duplicated, block: B:135:0x0196  */
    /* JADX WARN: Code duplicated, block: B:137:0x019c  */
    /* JADX WARN: Code duplicated, block: B:139:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:151:0x01db  */
    /* JADX WARN: Code duplicated, block: B:154:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:157:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:160:0x0210  */
    /* JADX WARN: Code duplicated, block: B:163:0x0226  */
    /* JADX WARN: Code duplicated, block: B:165:0x022e  */
    /* JADX WARN: Code duplicated, block: B:166:0x0246  */
    /* JADX WARN: Code duplicated, block: B:168:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:171:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:174:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:177:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:183:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:186:0x0303  */
    /* JADX WARN: Code duplicated, block: B:187:0x0305  */
    /* JADX WARN: Code duplicated, block: B:190:0x030b  */
    /* JADX WARN: Code duplicated, block: B:191:0x030d  */
    /* JADX WARN: Code duplicated, block: B:194:0x0315 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:197:0x031f  */
    /* JADX WARN: Code duplicated, block: B:200:0x034b  */
    /* JADX WARN: Code duplicated, block: B:202:0x0350  */
    /* JADX WARN: Code duplicated, block: B:205:0x0368  */
    /* JADX WARN: Code duplicated, block: B:208:0x038e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:213:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:216:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:218:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:221:0x0436  */
    /* JADX WARN: Code duplicated, block: B:222:0x043a  */
    /* JADX WARN: Code duplicated, block: B:225:0x044d  */
    /* JADX WARN: Code duplicated, block: B:227:0x045b  */
    /* JADX WARN: Code duplicated, block: B:230:0x0469  */
    /* JADX WARN: Code duplicated, block: B:238:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:241:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:245:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:248:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:252:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:255:0x0540 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:256:0x0542  */
    /* JADX WARN: Code duplicated, block: B:259:0x055b  */
    /* JADX WARN: Code duplicated, block: B:261:0x0561  */
    /* JADX WARN: Code duplicated, block: B:267:0x057c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:272:0x0588  */
    /* JADX WARN: Code duplicated, block: B:275:0x059c  */
    /* JADX WARN: Code duplicated, block: B:282:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:284:0x05af  */
    /* JADX WARN: Code duplicated, block: B:285:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:288:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:289:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:292:0x05cb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:293:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:295:0x060e  */
    /* JADX WARN: Code duplicated, block: B:298:0x0623  */
    /* JADX WARN: Code duplicated, block: B:300:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:89:0x0100  */
    /* JADX WARN: Code duplicated, block: B:91:0x0106  */
    /* JADX WARN: Code duplicated, block: B:92:0x0109  */
    /* JADX WARN: Code duplicated, block: B:96:0x0113  */
    /* JADX WARN: Code duplicated, block: B:98:0x0119  */
    /* JADX WARN: Code duplicated, block: B:99:0x011c  */
    /* JADX INFO: renamed from: o */
    public static final void m97434o(AbstractC36203g.c viewState, boolean z4, InterfaceC4339a interfaceC4339a, Function1 function1, InterfaceC4351m interfaceC4351m, Function1 function2, InterfaceC4339a interfaceC4339a2, Function1 function3, List<? extends InterfaceC16556w> list, boolean z13, Composer composer, int i13, int i14) {
        int i15;
        boolean z14;
        int i16;
        InterfaceC4339a interfaceC4339a3;
        int i17;
        int i18;
        Function1 function4;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        boolean z15;
        C28655q c28655q;
        InterfaceC4351m interfaceC4351m2;
        InterfaceC4339a interfaceC4339a4;
        boolean z16;
        InterfaceC4339a interfaceC4339a5;
        Function1 function5;
        Function1 function6;
        Function1 function7;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a6;
        Function1 function8;
        InterfaceC4351m interfaceC4351m3;
        Function1 function9;
        InterfaceC4339a interfaceC4339a7;
        Function1 function10;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c3;
        Object objM87133R4;
        InterfaceC28601c1 interfaceC28601c4;
        Object objM87133R5;
        Function1 function11;
        C28655q c28655q2;
        InterfaceC28601c1 interfaceC28601c5;
        int i36;
        boolean z17;
        int i37;
        Object objM87133R6;
        InterfaceC28601c1 interfaceC28601c6;
        Object objM87133R7;
        InterfaceC28601c1 interfaceC28601c7;
        InterfaceC29805a interfaceC29805a;
        int i38;
        boolean z18;
        boolean z19;
        boolean z24;
        boolean z25;
        Object objM87133R8;
        InterfaceC4339a interfaceC4339a8;
        Function1 function12;
        EnumC35102h enumC35102hM97398A;
        EnumC35102h enumC35102h;
        float f13;
        float f14;
        int i39;
        InterfaceC28601c1 interfaceC28601c8;
        Object objM87133R9;
        Object objM87133R10;
        InterfaceC28670t2 interfaceC28670t2M30588b;
        float fMo743q0;
        int i44;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z26;
        C28655q c28655q3;
        InterfaceC16556w interfaceC16556wM115211f;
        boolean z27;
        C28655q c28655q4;
        int i45;
        Function1 function13;
        boolean zM87147d;
        Object objM87133R11;
        boolean z28;
        boolean z29;
        boolean z34;
        boolean z35;
        boolean zM87157i;
        Object objM87133R12;
        Object objM87133R13;
        Object objM87133R14;
        Object objM87133R15;
        Object objM87133R16;
        Object objM87133R17;
        Object objM87133R18;
        int i46;
        int i47;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q5 = (C28655q) composer;
        c28655q5.m87154g0(-874249047);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q5.m87153g(viewState) : c28655q5.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i48 = i14 & 2;
        if (i48 == 0) {
            if ((i13 & 48) == 0) {
                z14 = z4;
                i15 |= c28655q5.m87155h(z14) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    interfaceC4339a3 = interfaceC4339a;
                    if (c28655q5.m87157i(interfaceC4339a3)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        function4 = function1;
                        if (c28655q5.m87157i(function4)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 16;
                    if (i24 != 0) {
                        if ((i13 & 24576) == 0) {
                            if (c28655q5.m87157i(interfaceC4351m)) {
                                i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                            } else {
                                i25 = DfuBaseService.ERROR_REMOTE_MASK;
                            }
                            i15 |= i25;
                        }
                        i26 = i14 & 32;
                        if (i26 != 0) {
                            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q5.m87157i(function2)) {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i15 |= i27;
                        }
                        i28 = i14 & 64;
                        if (i28 != 0) {
                            i15 |= 1572864;
                        } else if ((i13 & 1572864) == 0) {
                            if (c28655q5.m87157i(interfaceC4339a2)) {
                                i29 = 1048576;
                            } else {
                                i29 = 524288;
                            }
                            i15 |= i29;
                        }
                        i34 = i14 & 128;
                        if (i34 != 0) {
                            i15 |= 12582912;
                        } else if ((i13 & 12582912) == 0) {
                            if (c28655q5.m87157i(function3)) {
                                i35 = 8388608;
                            } else {
                                i35 = 4194304;
                            }
                            i15 |= i35;
                        }
                        if ((i13 & 100663296) == 0) {
                            if (c28655q5.m87157i(list)) {
                                i47 = 67108864;
                            } else {
                                i47 = AndroidSDKConstants.FLAG_MUTABLE;
                            }
                            i15 |= i47;
                        }
                        if ((i13 & 805306368) == 0) {
                            if (c28655q5.m87155h(z13)) {
                                i46 = 536870912;
                            } else {
                                i46 = 268435456;
                            }
                            i15 |= i46;
                        }
                        if ((i15 & 306783379) != 306783378) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c28655q5.m87135U(i15 & 1, z15)) {
                            if (i48 != 0) {
                                z14 = false;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i16 != 0) {
                                objM87133R18 = c28655q5.m87133R();
                                if (objM87133R18 == c28676v0) {
                                    objM87133R18 = new C31469a(3);
                                    c28655q5.m87172p0(objM87133R18);
                                }
                                interfaceC4339a6 = (InterfaceC4339a) objM87133R18;
                            } else {
                                interfaceC4339a6 = interfaceC4339a3;
                            }
                            if (i18 != 0) {
                                objM87133R17 = c28655q5.m87133R();
                                if (objM87133R17 == c28676v0) {
                                    objM87133R17 = new C30985h(28);
                                    c28655q5.m87172p0(objM87133R17);
                                }
                                function8 = (Function1) objM87133R17;
                            } else {
                                function8 = function4;
                            }
                            if (i24 != 0) {
                                objM87133R16 = c28655q5.m87133R();
                                if (objM87133R16 == c28676v0) {
                                    objM87133R16 = new C31314a(7);
                                    c28655q5.m87172p0(objM87133R16);
                                }
                                interfaceC4351m3 = (InterfaceC4351m) objM87133R16;
                            } else {
                                interfaceC4351m3 = interfaceC4351m;
                            }
                            if (i26 != 0) {
                                objM87133R15 = c28655q5.m87133R();
                                if (objM87133R15 == c28676v0) {
                                    objM87133R15 = new C30985h(29);
                                    c28655q5.m87172p0(objM87133R15);
                                }
                                function9 = (Function1) objM87133R15;
                            } else {
                                function9 = function2;
                            }
                            if (i28 != 0) {
                                objM87133R14 = c28655q5.m87133R();
                                if (objM87133R14 == c28676v0) {
                                    objM87133R14 = new C31469a(4);
                                    c28655q5.m87172p0(objM87133R14);
                                }
                                interfaceC4339a7 = (InterfaceC4339a) objM87133R14;
                            } else {
                                interfaceC4339a7 = interfaceC4339a2;
                            }
                            if (i34 != 0) {
                                objM87133R13 = c28655q5.m87133R();
                                if (objM87133R13 == c28676v0) {
                                    objM87133R13 = new C31593g(0);
                                    c28655q5.m87172p0(objM87133R13);
                                }
                                function10 = (Function1) objM87133R13;
                            } else {
                                function10 = function3;
                            }
                            objM87133R = c28655q5.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                                c28655q5.m87172p0(objM87133R);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                            objM87133R2 = c28655q5.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                                c28655q5.m87172p0(objM87133R2);
                            }
                            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                            objM87133R3 = c28655q5.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                                c28655q5.m87172p0(objM87133R3);
                            }
                            interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                            InterfaceC4339a interfaceC4339a9 = interfaceC4339a6;
                            objM87133R4 = c28655q5.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = AbstractC31061c.m95647w(z13, c28655q5);
                            }
                            interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                            objM87133R5 = c28655q5.m87133R();
                            function11 = function8;
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new a(interfaceC28601c1, interfaceC28601c2, interfaceC28601c3, null);
                                c28655q5.m87172p0(objM87133R5);
                            }
                            AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                            if (m97441v(interfaceC28601c4)) {
                                c28655q2 = c28655q5;
                                z14 = z14;
                                interfaceC4351m3 = interfaceC4351m3;
                                interfaceC28601c3 = interfaceC28601c3;
                                interfaceC28601c5 = interfaceC28601c2;
                                i36 = 1048576;
                                z17 = false;
                                i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                                c28655q2.m87150e0(-69524583);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q5.m87150e0(1660299335);
                                if (list == null) {
                                    c28655q5.m87150e0(-70328166);
                                    c28655q5.m87173q(false);
                                    c28655q2 = c28655q5;
                                    i36 = 1048576;
                                    i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                                    z17 = false;
                                    interfaceC28601c5 = interfaceC28601c2;
                                } else {
                                    c28655q5.m87150e0(-70328165);
                                    boolean zM97413P = m97413P(interfaceC28601c1);
                                    C3733d1 c3733d1 = AbstractC3730c1.f15251a;
                                    C3739f1 c3739f1M11563a = AbstractC3788w0.m11584l(AbstractC11348f.m30574v(ErrorCodes.TracksErrors.cGenericTrack, 0, null, 6), C2299e.f9107J, null, 12).m11563a(AbstractC3788w0.m11578f(AbstractC11348f.m30574v(ErrorCodes.TracksErrors.cGenericTrack, 0, null, 6), 2));
                                    C37816b c37816bM121344e = AbstractC37817c.m121344e(2039574871, c28655q5, new C26949h(viewState, list, function9, 13));
                                    i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                                    z17 = false;
                                    i36 = 1048576;
                                    interfaceC28601c5 = interfaceC28601c2;
                                    AbstractC1090b.m3351f(zM97413P, null, c3733d1, c3739f1M11563a, null, c37816bM121344e, c28655q5, 199680, 18);
                                    c28655q2 = c28655q5;
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87173q(z17);
                            }
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            interfaceC28601c6 = (InterfaceC28601c1) objM87133R6;
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = AbstractC28683x.m87272z(EnumC35102h.NORMAL);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            interfaceC28601c7 = (InterfaceC28601c1) objM87133R7;
                            interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                            i38 = i15 & 14;
                            if (i38 != 4 || ((i15 & 8) != 0 && c28655q2.m87157i(viewState))) {
                                z18 = true;
                            } else {
                                z18 = z17;
                            }
                            if ((i15 & 3670016) == i36) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            boolean z36 = z18 | z19;
                            if ((i15 & 7168) == i37) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            z25 = z36 | z24;
                            objM87133R8 = c28655q2.m87133R();
                            if (!z25 || objM87133R8 == c28676v0) {
                                InterfaceC4339a interfaceC4339a10 = interfaceC4339a7;
                                objM87133R8 = new b(viewState, interfaceC4339a10, function11, interfaceC28601c6, null);
                                interfaceC4339a8 = interfaceC4339a10;
                                function12 = function11;
                                c28655q2.m87172p0(objM87133R8);
                            } else {
                                function12 = function11;
                                interfaceC4339a8 = interfaceC4339a7;
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, viewState);
                            enumC35102hM97398A = m97398A(interfaceC28601c7);
                            enumC35102h = EnumC35102h.NORMAL;
                            f13 = 0.0f;
                            if (enumC35102hM97398A == enumC35102h) {
                                f14 = 0.0f;
                            } else {
                                f14 = -90.0f;
                            }
                            i39 = i15;
                            interfaceC28601c8 = interfaceC28601c5;
                            float f15 = f14;
                            InterfaceC4339a interfaceC4339a11 = interfaceC4339a8;
                            C11347e2 c11347e2M30574v = AbstractC11348f.m30574v(500, 0, null, 6);
                            objM87133R9 = c28655q2.m87133R();
                            if (objM87133R9 == c28676v0) {
                                objM87133R9 = new C1024j(7, interfaceC28601c7, interfaceC28601c6);
                                c28655q2.m87172p0(objM87133R9);
                            }
                            InterfaceC28670t2 interfaceC28670t2M30588b2 = AbstractC11352g.m30588b(f15, c11347e2M30574v, "itemRotationAnimation", (Function1) objM87133R9, c28655q2, 27696, 4);
                            if (m97398A(interfaceC28601c7) != enumC35102h && z14) {
                                f13 = 1.0f;
                            }
                            C11347e2 c11347e2M30574v2 = AbstractC11348f.m30574v(500, 0, null, 6);
                            objM87133R10 = c28655q2.m87133R();
                            if (objM87133R10 == c28676v0) {
                                objM87133R10 = new C1024j(8, r47, interfaceC28601c7);
                                c28655q2.m87172p0(objM87133R10);
                            }
                            interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v2, "replayButtonOffsetAnimation", (Function1) objM87133R10, c28655q2, 27696, 4);
                            fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).mo743q0(4 * 35);
                            if (viewState.getCardStackSize() > 0) {
                                i44 = 1;
                            } else {
                                i44 = 0;
                            }
                            InterfaceC28670t2 interfaceC28670t2M30587a = AbstractC11352g.m30587a(i44 * 8, null, "counterPaddingAnimation", c28655q2, 384, 10);
                            C2314t c2314t = C2314t.f9131w;
                            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            InterfaceC28601c1 interfaceC28601c9 = interfaceC28601c3;
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
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
                            if (viewState.getCardStackSize() == 0 || !m97444y(r47)) {
                                z26 = false;
                                c28655q2.m87150e0(-512086241);
                                c28655q2.m87173q(false);
                                c28655q3 = c28655q2;
                            } else {
                                c28655q2.m87150e0(-512587883);
                                c28655q3 = c28655q2;
                                AbstractC1090b.m3351f(m97398A(interfaceC28601c7) == enumC35102h, null, null, AbstractC3788w0.m11578f(AbstractC11348f.m30574v(500, 0, null, 6), 2), null, AbstractC37817c.m121344e(-874078128, c28655q2, new C9754e(function12, interfaceC28601c7, 1)), c28655q3, 199680, 22);
                                z26 = false;
                                c28655q3.m87173q(false);
                            }
                            InterfaceC16556w interfaceC16556wM115208c = viewState.getCardToDisplay();
                            if (!m97437r(interfaceC28601c8) || m97441v(interfaceC28601c4)) {
                                interfaceC16556wM115211f = viewState.getNextCard();
                            } else {
                                interfaceC16556wM115211f = null;
                            }
                            if (!m97437r(interfaceC28601c8) || m97441v(interfaceC28601c4)) {
                                z27 = true;
                            } else {
                                z27 = z26;
                            }
                            c28655q4 = c28655q3;
                            i45 = i39 & 29360128;
                            function13 = function10;
                            AbstractC31592f.m97385i(interfaceC16556wM115208c, interfaceC16556wM115211f, viewState.getCardStackSize(), z27, function9, interfaceC4351m3, viewState.getNotificationCardDismissAnimation(), function13, c28655q4, ((i39 >> 3) & 57344) | ((i39 << 3) & 458752) | i45, 0);
                            Modifier modifierM3398t = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t, C2299e.f9116y), 0.0f, 0.0f, m97405H(interfaceC28670t2M30587a), 0.0f, 11);
                            zM87147d = c28655q4.m87147d(fMo743q0) | c28655q4.m87153g(interfaceC28670t2M30588b);
                            objM87133R11 = c28655q4.m87133R();
                            if (zM87147d || objM87133R11 == c28676v0) {
                                objM87133R11 = new C2928d(fMo743q0, interfaceC28670t2M30588b, 1);
                                c28655q4.m87172p0(objM87133R11);
                            }
                            Modifier modifierM3390l = AbstractC1099a.m3390l(modifierM3398t, (Function1) objM87133R11);
                            int iM115207b = viewState.getCardStackSize();
                            boolean z37 = (m97398A(interfaceC28601c7) != enumC35102h && m97439t(interfaceC28601c9)) || m97441v(interfaceC28601c4);
                            boolean zM115214i = viewState.getIsUpdating();
                            boolean zM97444y = m97444y(r47);
                            float fM97401D = m97401D(interfaceC28670t2M30588b2);
                            if (!viewState.getPlayShimmer() || m97439t(interfaceC28601c9)) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            boolean zM115209d = viewState.getHighlightCounter();
                            EnumC35102h enumC35102hM97398A2 = m97398A(interfaceC28601c7);
                            C3733d1 c3733d1M11577e = AbstractC3788w0.m11577e(null, 3);
                            if (i38 != 4 || ((i39 & 8) != 0 && c28655q4.m87157i(viewState))) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            if (i45 == 8388608) {
                                z34 = true;
                            } else {
                                z34 = false;
                            }
                            boolean z38 = z34 | z29;
                            if ((i39 & 57344) == 16384) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            zM87157i = z38 | z35 | c28655q4.m87157i(interfaceC29805a);
                            objM87133R12 = c28655q4.m87133R();
                            if (zM87157i || objM87133R12 == c28676v0) {
                                objM87133R12 = new C27198e((Object) viewState, function13, (Object) interfaceC4351m3, (Object) interfaceC29805a, 12);
                                c28655q4.m87172p0(objM87133R12);
                            }
                            AbstractC35097c.m111000c(modifierM3390l, iM115207b, z37, fM97401D, zM115214i, zM97444y, z28, zM115209d, enumC35102hM97398A2, interfaceC4339a9, c3733d1M11577e, (InterfaceC4339a) objM87133R12, c28655q4, (i39 << 21) & 1879048192, 6, 0);
                            c28655q = c28655q4;
                            c28655q.m87173q(true);
                            function7 = function13;
                            function5 = function12;
                            interfaceC4339a5 = interfaceC4339a9;
                            z16 = z14;
                            interfaceC4351m2 = interfaceC4351m3;
                            interfaceC4339a4 = interfaceC4339a11;
                            function6 = function9;
                        } else {
                            c28655q = c28655q5;
                            c28655q.m87138X();
                            interfaceC4351m2 = interfaceC4351m;
                            interfaceC4339a4 = interfaceC4339a2;
                            z16 = z14;
                            interfaceC4339a5 = interfaceC4339a3;
                            function5 = function4;
                            function6 = function2;
                            function7 = function3;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C1025j0(viewState, z16, interfaceC4339a5, function5, interfaceC4351m2, function6, interfaceC4339a4, function7, list, z13, i13, i14);
                        }
                    }
                    i15 |= 24576;
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q5.m87157i(function2)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                    i28 = i14 & 64;
                    if (i28 != 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (c28655q5.m87157i(interfaceC4339a2)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i15 |= i29;
                    }
                    i34 = i14 & 128;
                    if (i34 != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (c28655q5.m87157i(function3)) {
                            i35 = 8388608;
                        } else {
                            i35 = 4194304;
                        }
                        i15 |= i35;
                    }
                    if ((i13 & 100663296) == 0) {
                        if (c28655q5.m87157i(list)) {
                            i47 = 67108864;
                        } else {
                            i47 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i47;
                    }
                    if ((i13 & 805306368) == 0) {
                        if (c28655q5.m87155h(z13)) {
                            i46 = 536870912;
                        } else {
                            i46 = 268435456;
                        }
                        i15 |= i46;
                    }
                    if ((i15 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c28655q5.m87135U(i15 & 1, z15)) {
                        if (i48 != 0) {
                            z14 = false;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R18 = c28655q5.m87133R();
                            if (objM87133R18 == c28676v0) {
                                objM87133R18 = new C31469a(3);
                                c28655q5.m87172p0(objM87133R18);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R18;
                        } else {
                            interfaceC4339a6 = interfaceC4339a3;
                        }
                        if (i18 != 0) {
                            objM87133R17 = c28655q5.m87133R();
                            if (objM87133R17 == c28676v0) {
                                objM87133R17 = new C30985h(28);
                                c28655q5.m87172p0(objM87133R17);
                            }
                            function8 = (Function1) objM87133R17;
                        } else {
                            function8 = function4;
                        }
                        if (i24 != 0) {
                            objM87133R16 = c28655q5.m87133R();
                            if (objM87133R16 == c28676v0) {
                                objM87133R16 = new C31314a(7);
                                c28655q5.m87172p0(objM87133R16);
                            }
                            interfaceC4351m3 = (InterfaceC4351m) objM87133R16;
                        } else {
                            interfaceC4351m3 = interfaceC4351m;
                        }
                        if (i26 != 0) {
                            objM87133R15 = c28655q5.m87133R();
                            if (objM87133R15 == c28676v0) {
                                objM87133R15 = new C30985h(29);
                                c28655q5.m87172p0(objM87133R15);
                            }
                            function9 = (Function1) objM87133R15;
                        } else {
                            function9 = function2;
                        }
                        if (i28 != 0) {
                            objM87133R14 = c28655q5.m87133R();
                            if (objM87133R14 == c28676v0) {
                                objM87133R14 = new C31469a(4);
                                c28655q5.m87172p0(objM87133R14);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R14;
                        } else {
                            interfaceC4339a7 = interfaceC4339a2;
                        }
                        if (i34 != 0) {
                            objM87133R13 = c28655q5.m87133R();
                            if (objM87133R13 == c28676v0) {
                                objM87133R13 = new C31593g(0);
                                c28655q5.m87172p0(objM87133R13);
                            }
                            function10 = (Function1) objM87133R13;
                        } else {
                            function10 = function3;
                        }
                        objM87133R = c28655q5.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                            c28655q5.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        objM87133R2 = c28655q5.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q5.m87172p0(objM87133R2);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                        objM87133R3 = c28655q5.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q5.m87172p0(objM87133R3);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                        InterfaceC4339a interfaceC4339a12 = interfaceC4339a6;
                        objM87133R4 = c28655q5.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC31061c.m95647w(z13, c28655q5);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                        objM87133R5 = c28655q5.m87133R();
                        function11 = function8;
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new a(interfaceC28601c1, interfaceC28601c2, interfaceC28601c3, null);
                            c28655q5.m87172p0(objM87133R5);
                        }
                        AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                        if (m97441v(interfaceC28601c4)) {
                            c28655q5.m87150e0(1660299335);
                            if (list == null) {
                                c28655q5.m87150e0(-70328166);
                                c28655q5.m87173q(false);
                                c28655q2 = c28655q5;
                                i36 = 1048576;
                                i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                                z17 = false;
                                interfaceC28601c5 = interfaceC28601c2;
                            } else {
                                c28655q5.m87150e0(-70328165);
                                boolean zM97413P2 = m97413P(interfaceC28601c1);
                                C3733d1 c3733d2 = AbstractC3730c1.f15251a;
                                C3739f1 c3739f1M11563a2 = AbstractC3788w0.m11584l(AbstractC11348f.m30574v(ErrorCodes.TracksErrors.cGenericTrack, 0, null, 6), C2299e.f9107J, null, 12).m11563a(AbstractC3788w0.m11578f(AbstractC11348f.m30574v(ErrorCodes.TracksErrors.cGenericTrack, 0, null, 6), 2));
                                C37816b c37816bM121344e2 = AbstractC37817c.m121344e(2039574871, c28655q5, new C26949h(viewState, list, function9, 13));
                                i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                                z17 = false;
                                i36 = 1048576;
                                interfaceC28601c5 = interfaceC28601c2;
                                AbstractC1090b.m3351f(zM97413P2, null, c3733d2, c3739f1M11563a2, null, c37816bM121344e2, c28655q5, 199680, 18);
                                c28655q2 = c28655q5;
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(z17);
                        } else {
                            c28655q2 = c28655q5;
                            z14 = z14;
                            interfaceC4351m3 = interfaceC4351m3;
                            interfaceC28601c3 = interfaceC28601c3;
                            interfaceC28601c5 = interfaceC28601c2;
                            i36 = 1048576;
                            z17 = false;
                            i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            c28655q2.m87150e0(-69524583);
                            c28655q2.m87173q(false);
                        }
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC28601c6 = (InterfaceC28601c1) objM87133R6;
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC28683x.m87272z(EnumC35102h.NORMAL);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        interfaceC28601c7 = (InterfaceC28601c1) objM87133R7;
                        interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                        i38 = i15 & 14;
                        if (i38 != 4) {
                            z18 = true;
                        } else {
                            z18 = true;
                        }
                        if ((i15 & 3670016) == i36) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean z39 = z18 | z19;
                        if ((i15 & 7168) == i37) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = z39 | z24;
                        objM87133R8 = c28655q2.m87133R();
                        if (z25) {
                            InterfaceC4339a interfaceC4339a13 = interfaceC4339a7;
                            objM87133R8 = new b(viewState, interfaceC4339a13, function11, interfaceC28601c6, null);
                            interfaceC4339a8 = interfaceC4339a13;
                            function12 = function11;
                            c28655q2.m87172p0(objM87133R8);
                        } else {
                            InterfaceC4339a interfaceC4339a14 = interfaceC4339a7;
                            objM87133R8 = new b(viewState, interfaceC4339a14, function11, interfaceC28601c6, null);
                            interfaceC4339a8 = interfaceC4339a14;
                            function12 = function11;
                            c28655q2.m87172p0(objM87133R8);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, viewState);
                        enumC35102hM97398A = m97398A(interfaceC28601c7);
                        enumC35102h = EnumC35102h.NORMAL;
                        f13 = 0.0f;
                        if (enumC35102hM97398A == enumC35102h) {
                            f14 = 0.0f;
                        } else {
                            f14 = -90.0f;
                        }
                        i39 = i15;
                        interfaceC28601c8 = interfaceC28601c5;
                        float f16 = f14;
                        InterfaceC4339a interfaceC4339a15 = interfaceC4339a8;
                        C11347e2 c11347e2M30574v3 = AbstractC11348f.m30574v(500, 0, null, 6);
                        objM87133R9 = c28655q2.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C1024j(7, interfaceC28601c7, interfaceC28601c6);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        InterfaceC28670t2 interfaceC28670t2M30588b3 = AbstractC11352g.m30588b(f16, c11347e2M30574v3, "itemRotationAnimation", (Function1) objM87133R9, c28655q2, 27696, 4);
                        if (m97398A(interfaceC28601c7) != enumC35102h) {
                            f13 = 1.0f;
                        }
                        C11347e2 c11347e2M30574v4 = AbstractC11348f.m30574v(500, 0, null, 6);
                        objM87133R10 = c28655q2.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C1024j(8, r47, interfaceC28601c7);
                            c28655q2.m87172p0(objM87133R10);
                        }
                        interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v4, "replayButtonOffsetAnimation", (Function1) objM87133R10, c28655q2, 27696, 4);
                        fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).mo743q0(4 * 35);
                        if (viewState.getCardStackSize() > 0) {
                            i44 = 1;
                        } else {
                            i44 = 0;
                        }
                        InterfaceC28670t2 interfaceC28670t2M30587a2 = AbstractC11352g.m30587a(i44 * 8, null, "counterPaddingAnimation", c28655q2, 384, 10);
                        C2314t c2314t2 = C2314t.f9131w;
                        Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        InterfaceC28601c1 interfaceC28601c10 = interfaceC28601c3;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3409f2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
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
                        if (viewState.getCardStackSize() == 0) {
                            z26 = false;
                            c28655q2.m87150e0(-512086241);
                            c28655q2.m87173q(false);
                            c28655q3 = c28655q2;
                        } else {
                            z26 = false;
                            c28655q2.m87150e0(-512086241);
                            c28655q2.m87173q(false);
                            c28655q3 = c28655q2;
                        }
                        InterfaceC16556w interfaceC16556wM115208c2 = viewState.getCardToDisplay();
                        if (m97437r(interfaceC28601c8)) {
                            interfaceC16556wM115211f = viewState.getNextCard();
                        } else {
                            interfaceC16556wM115211f = viewState.getNextCard();
                        }
                        if (m97437r(interfaceC28601c8)) {
                            z27 = true;
                        } else {
                            z27 = true;
                        }
                        c28655q4 = c28655q3;
                        i45 = i39 & 29360128;
                        function13 = function10;
                        AbstractC31592f.m97385i(interfaceC16556wM115208c2, interfaceC16556wM115211f, viewState.getCardStackSize(), z27, function9, interfaceC4351m3, viewState.getNotificationCardDismissAnimation(), function13, c28655q4, ((i39 >> 3) & 57344) | ((i39 << 3) & 458752) | i45, 0);
                        Modifier modifierM3398t2 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t2, C2299e.f9116y), 0.0f, 0.0f, m97405H(interfaceC28670t2M30587a2), 0.0f, 11);
                        zM87147d = c28655q4.m87147d(fMo743q0) | c28655q4.m87153g(interfaceC28670t2M30588b);
                        objM87133R11 = c28655q4.m87133R();
                        if (zM87147d) {
                            objM87133R11 = new C2928d(fMo743q0, interfaceC28670t2M30588b, 1);
                            c28655q4.m87172p0(objM87133R11);
                        } else {
                            objM87133R11 = new C2928d(fMo743q0, interfaceC28670t2M30588b, 1);
                            c28655q4.m87172p0(objM87133R11);
                        }
                        Modifier modifierM3390l2 = AbstractC1099a.m3390l(modifierM3398t2, (Function1) objM87133R11);
                        int iM115207b2 = viewState.getCardStackSize();
                        if (m97398A(interfaceC28601c7) != enumC35102h) {
                        }
                        boolean zM115214i2 = viewState.getIsUpdating();
                        boolean zM97444y2 = m97444y(r47);
                        float fM97401D2 = m97401D(interfaceC28670t2M30588b3);
                        if (viewState.getPlayShimmer()) {
                            z28 = true;
                        } else {
                            z28 = true;
                        }
                        boolean zM115209d2 = viewState.getHighlightCounter();
                        EnumC35102h enumC35102hM97398A3 = m97398A(interfaceC28601c7);
                        C3733d1 c3733d1M11577e2 = AbstractC3788w0.m11577e(null, 3);
                        if (i38 != 4) {
                            z29 = true;
                        } else {
                            z29 = true;
                        }
                        if (i45 == 8388608) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                        boolean z310 = z34 | z29;
                        if ((i39 & 57344) == 16384) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        zM87157i = z310 | z35 | c28655q4.m87157i(interfaceC29805a);
                        objM87133R12 = c28655q4.m87133R();
                        if (zM87157i) {
                            objM87133R12 = new C27198e((Object) viewState, function13, (Object) interfaceC4351m3, (Object) interfaceC29805a, 12);
                            c28655q4.m87172p0(objM87133R12);
                        } else {
                            objM87133R12 = new C27198e((Object) viewState, function13, (Object) interfaceC4351m3, (Object) interfaceC29805a, 12);
                            c28655q4.m87172p0(objM87133R12);
                        }
                        AbstractC35097c.m111000c(modifierM3390l2, iM115207b2, z37, fM97401D2, zM115214i2, zM97444y2, z28, zM115209d2, enumC35102hM97398A3, interfaceC4339a12, c3733d1M11577e2, (InterfaceC4339a) objM87133R12, c28655q4, (i39 << 21) & 1879048192, 6, 0);
                        c28655q = c28655q4;
                        c28655q.m87173q(true);
                        function7 = function13;
                        function5 = function12;
                        interfaceC4339a5 = interfaceC4339a12;
                        z16 = z14;
                        interfaceC4351m2 = interfaceC4351m3;
                        interfaceC4339a4 = interfaceC4339a15;
                        function6 = function9;
                    } else {
                        c28655q = c28655q5;
                        c28655q.m87138X();
                        interfaceC4351m2 = interfaceC4351m;
                        interfaceC4339a4 = interfaceC4339a2;
                        z16 = z14;
                        interfaceC4339a5 = interfaceC4339a3;
                        function5 = function4;
                        function6 = function2;
                        function7 = function3;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C1025j0(viewState, z16, interfaceC4339a5, function5, interfaceC4351m2, function6, interfaceC4339a4, function7, list, z13, i13, i14);
                    }
                }
                i15 |= 3072;
                function4 = function1;
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        if (c28655q5.m87157i(interfaceC4351m)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q5.m87157i(function2)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                    i28 = i14 & 64;
                    if (i28 != 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (c28655q5.m87157i(interfaceC4339a2)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i15 |= i29;
                    }
                    i34 = i14 & 128;
                    if (i34 != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (c28655q5.m87157i(function3)) {
                            i35 = 8388608;
                        } else {
                            i35 = 4194304;
                        }
                        i15 |= i35;
                    }
                    if ((i13 & 100663296) == 0) {
                        if (c28655q5.m87157i(list)) {
                            i47 = 67108864;
                        } else {
                            i47 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i47;
                    }
                    if ((i13 & 805306368) == 0) {
                        if (c28655q5.m87155h(z13)) {
                            i46 = 536870912;
                        } else {
                            i46 = 268435456;
                        }
                        i15 |= i46;
                    }
                    if ((i15 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c28655q5.m87135U(i15 & 1, z15)) {
                        if (i48 != 0) {
                            z14 = false;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R18 = c28655q5.m87133R();
                            if (objM87133R18 == c28676v0) {
                                objM87133R18 = new C31469a(3);
                                c28655q5.m87172p0(objM87133R18);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R18;
                        } else {
                            interfaceC4339a6 = interfaceC4339a3;
                        }
                        if (i18 != 0) {
                            objM87133R17 = c28655q5.m87133R();
                            if (objM87133R17 == c28676v0) {
                                objM87133R17 = new C30985h(28);
                                c28655q5.m87172p0(objM87133R17);
                            }
                            function8 = (Function1) objM87133R17;
                        } else {
                            function8 = function4;
                        }
                        if (i24 != 0) {
                            objM87133R16 = c28655q5.m87133R();
                            if (objM87133R16 == c28676v0) {
                                objM87133R16 = new C31314a(7);
                                c28655q5.m87172p0(objM87133R16);
                            }
                            interfaceC4351m3 = (InterfaceC4351m) objM87133R16;
                        } else {
                            interfaceC4351m3 = interfaceC4351m;
                        }
                        if (i26 != 0) {
                            objM87133R15 = c28655q5.m87133R();
                            if (objM87133R15 == c28676v0) {
                                objM87133R15 = new C30985h(29);
                                c28655q5.m87172p0(objM87133R15);
                            }
                            function9 = (Function1) objM87133R15;
                        } else {
                            function9 = function2;
                        }
                        if (i28 != 0) {
                            objM87133R14 = c28655q5.m87133R();
                            if (objM87133R14 == c28676v0) {
                                objM87133R14 = new C31469a(4);
                                c28655q5.m87172p0(objM87133R14);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R14;
                        } else {
                            interfaceC4339a7 = interfaceC4339a2;
                        }
                        if (i34 != 0) {
                            objM87133R13 = c28655q5.m87133R();
                            if (objM87133R13 == c28676v0) {
                                objM87133R13 = new C31593g(0);
                                c28655q5.m87172p0(objM87133R13);
                            }
                            function10 = (Function1) objM87133R13;
                        } else {
                            function10 = function3;
                        }
                        objM87133R = c28655q5.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                            c28655q5.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        objM87133R2 = c28655q5.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q5.m87172p0(objM87133R2);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                        objM87133R3 = c28655q5.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q5.m87172p0(objM87133R3);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                        InterfaceC4339a interfaceC4339a16 = interfaceC4339a6;
                        objM87133R4 = c28655q5.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC31061c.m95647w(z13, c28655q5);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                        objM87133R5 = c28655q5.m87133R();
                        function11 = function8;
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new a(interfaceC28601c1, interfaceC28601c2, interfaceC28601c3, null);
                            c28655q5.m87172p0(objM87133R5);
                        }
                        AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                        if (m97441v(interfaceC28601c4)) {
                            c28655q5.m87150e0(1660299335);
                            if (list == null) {
                                c28655q5.m87150e0(-70328166);
                                c28655q5.m87173q(false);
                                c28655q2 = c28655q5;
                                i36 = 1048576;
                                i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                                z17 = false;
                                interfaceC28601c5 = interfaceC28601c2;
                            } else {
                                c28655q5.m87150e0(-70328165);
                                boolean zM97413P3 = m97413P(interfaceC28601c1);
                                C3733d1 c3733d3 = AbstractC3730c1.f15251a;
                                C3739f1 c3739f1M11563a3 = AbstractC3788w0.m11584l(AbstractC11348f.m30574v(ErrorCodes.TracksErrors.cGenericTrack, 0, null, 6), C2299e.f9107J, null, 12).m11563a(AbstractC3788w0.m11578f(AbstractC11348f.m30574v(ErrorCodes.TracksErrors.cGenericTrack, 0, null, 6), 2));
                                C37816b c37816bM121344e3 = AbstractC37817c.m121344e(2039574871, c28655q5, new C26949h(viewState, list, function9, 13));
                                i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                                z17 = false;
                                i36 = 1048576;
                                interfaceC28601c5 = interfaceC28601c2;
                                AbstractC1090b.m3351f(zM97413P3, null, c3733d3, c3739f1M11563a3, null, c37816bM121344e3, c28655q5, 199680, 18);
                                c28655q2 = c28655q5;
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(z17);
                        } else {
                            c28655q2 = c28655q5;
                            z14 = z14;
                            interfaceC4351m3 = interfaceC4351m3;
                            interfaceC28601c3 = interfaceC28601c3;
                            interfaceC28601c5 = interfaceC28601c2;
                            i36 = 1048576;
                            z17 = false;
                            i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            c28655q2.m87150e0(-69524583);
                            c28655q2.m87173q(false);
                        }
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC28601c6 = (InterfaceC28601c1) objM87133R6;
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC28683x.m87272z(EnumC35102h.NORMAL);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        interfaceC28601c7 = (InterfaceC28601c1) objM87133R7;
                        interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                        i38 = i15 & 14;
                        if (i38 != 4) {
                            z18 = true;
                        } else {
                            z18 = true;
                        }
                        if ((i15 & 3670016) == i36) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean z311 = z18 | z19;
                        if ((i15 & 7168) == i37) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = z311 | z24;
                        objM87133R8 = c28655q2.m87133R();
                        if (z25) {
                            InterfaceC4339a interfaceC4339a17 = interfaceC4339a7;
                            objM87133R8 = new b(viewState, interfaceC4339a17, function11, interfaceC28601c6, null);
                            interfaceC4339a8 = interfaceC4339a17;
                            function12 = function11;
                            c28655q2.m87172p0(objM87133R8);
                        } else {
                            InterfaceC4339a interfaceC4339a18 = interfaceC4339a7;
                            objM87133R8 = new b(viewState, interfaceC4339a18, function11, interfaceC28601c6, null);
                            interfaceC4339a8 = interfaceC4339a18;
                            function12 = function11;
                            c28655q2.m87172p0(objM87133R8);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, viewState);
                        enumC35102hM97398A = m97398A(interfaceC28601c7);
                        enumC35102h = EnumC35102h.NORMAL;
                        f13 = 0.0f;
                        if (enumC35102hM97398A == enumC35102h) {
                            f14 = 0.0f;
                        } else {
                            f14 = -90.0f;
                        }
                        i39 = i15;
                        interfaceC28601c8 = interfaceC28601c5;
                        float f17 = f14;
                        InterfaceC4339a interfaceC4339a19 = interfaceC4339a8;
                        C11347e2 c11347e2M30574v5 = AbstractC11348f.m30574v(500, 0, null, 6);
                        objM87133R9 = c28655q2.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C1024j(7, interfaceC28601c7, interfaceC28601c6);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        InterfaceC28670t2 interfaceC28670t2M30588b4 = AbstractC11352g.m30588b(f17, c11347e2M30574v5, "itemRotationAnimation", (Function1) objM87133R9, c28655q2, 27696, 4);
                        if (m97398A(interfaceC28601c7) != enumC35102h) {
                            f13 = 1.0f;
                        }
                        C11347e2 c11347e2M30574v6 = AbstractC11348f.m30574v(500, 0, null, 6);
                        objM87133R10 = c28655q2.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C1024j(8, r47, interfaceC28601c7);
                            c28655q2.m87172p0(objM87133R10);
                        }
                        interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v6, "replayButtonOffsetAnimation", (Function1) objM87133R10, c28655q2, 27696, 4);
                        fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).mo743q0(4 * 35);
                        if (viewState.getCardStackSize() > 0) {
                            i44 = 1;
                        } else {
                            i44 = 0;
                        }
                        InterfaceC28670t2 interfaceC28670t2M30587a3 = AbstractC11352g.m30587a(i44 * 8, null, "counterPaddingAnimation", c28655q2, 384, 10);
                        C2314t c2314t3 = C2314t.f9131w;
                        Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t3);
                        InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        InterfaceC28601c1 interfaceC28601c11 = interfaceC28601c3;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3409f3);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
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
                        if (viewState.getCardStackSize() == 0) {
                            z26 = false;
                            c28655q2.m87150e0(-512086241);
                            c28655q2.m87173q(false);
                            c28655q3 = c28655q2;
                        } else {
                            z26 = false;
                            c28655q2.m87150e0(-512086241);
                            c28655q2.m87173q(false);
                            c28655q3 = c28655q2;
                        }
                        InterfaceC16556w interfaceC16556wM115208c3 = viewState.getCardToDisplay();
                        if (m97437r(interfaceC28601c8)) {
                            interfaceC16556wM115211f = viewState.getNextCard();
                        } else {
                            interfaceC16556wM115211f = viewState.getNextCard();
                        }
                        if (m97437r(interfaceC28601c8)) {
                            z27 = true;
                        } else {
                            z27 = true;
                        }
                        c28655q4 = c28655q3;
                        i45 = i39 & 29360128;
                        function13 = function10;
                        AbstractC31592f.m97385i(interfaceC16556wM115208c3, interfaceC16556wM115211f, viewState.getCardStackSize(), z27, function9, interfaceC4351m3, viewState.getNotificationCardDismissAnimation(), function13, c28655q4, ((i39 >> 3) & 57344) | ((i39 << 3) & 458752) | i45, 0);
                        Modifier modifierM3398t3 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t3, C2299e.f9116y), 0.0f, 0.0f, m97405H(interfaceC28670t2M30587a3), 0.0f, 11);
                        zM87147d = c28655q4.m87147d(fMo743q0) | c28655q4.m87153g(interfaceC28670t2M30588b);
                        objM87133R11 = c28655q4.m87133R();
                        if (zM87147d) {
                            objM87133R11 = new C2928d(fMo743q0, interfaceC28670t2M30588b, 1);
                            c28655q4.m87172p0(objM87133R11);
                        } else {
                            objM87133R11 = new C2928d(fMo743q0, interfaceC28670t2M30588b, 1);
                            c28655q4.m87172p0(objM87133R11);
                        }
                        Modifier modifierM3390l3 = AbstractC1099a.m3390l(modifierM3398t3, (Function1) objM87133R11);
                        int iM115207b3 = viewState.getCardStackSize();
                        if (m97398A(interfaceC28601c7) != enumC35102h) {
                        }
                        boolean zM115214i3 = viewState.getIsUpdating();
                        boolean zM97444y3 = m97444y(r47);
                        float fM97401D3 = m97401D(interfaceC28670t2M30588b4);
                        if (viewState.getPlayShimmer()) {
                            z28 = true;
                        } else {
                            z28 = true;
                        }
                        boolean zM115209d3 = viewState.getHighlightCounter();
                        EnumC35102h enumC35102hM97398A4 = m97398A(interfaceC28601c7);
                        C3733d1 c3733d1M11577e3 = AbstractC3788w0.m11577e(null, 3);
                        if (i38 != 4) {
                            z29 = true;
                        } else {
                            z29 = true;
                        }
                        if (i45 == 8388608) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                        boolean z312 = z34 | z29;
                        if ((i39 & 57344) == 16384) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        zM87157i = z312 | z35 | c28655q4.m87157i(interfaceC29805a);
                        objM87133R12 = c28655q4.m87133R();
                        if (zM87157i) {
                            objM87133R12 = new C27198e((Object) viewState, function13, (Object) interfaceC4351m3, (Object) interfaceC29805a, 12);
                            c28655q4.m87172p0(objM87133R12);
                        } else {
                            objM87133R12 = new C27198e((Object) viewState, function13, (Object) interfaceC4351m3, (Object) interfaceC29805a, 12);
                            c28655q4.m87172p0(objM87133R12);
                        }
                        AbstractC35097c.m111000c(modifierM3390l3, iM115207b3, z37, fM97401D3, zM115214i3, zM97444y3, z28, zM115209d3, enumC35102hM97398A4, interfaceC4339a16, c3733d1M11577e3, (InterfaceC4339a) objM87133R12, c28655q4, (i39 << 21) & 1879048192, 6, 0);
                        c28655q = c28655q4;
                        c28655q.m87173q(true);
                        function7 = function13;
                        function5 = function12;
                        interfaceC4339a5 = interfaceC4339a16;
                        z16 = z14;
                        interfaceC4351m2 = interfaceC4351m3;
                        interfaceC4339a4 = interfaceC4339a19;
                        function6 = function9;
                    } else {
                        c28655q = c28655q5;
                        c28655q.m87138X();
                        interfaceC4351m2 = interfaceC4351m;
                        interfaceC4339a4 = interfaceC4339a2;
                        z16 = z14;
                        interfaceC4339a5 = interfaceC4339a3;
                        function5 = function4;
                        function6 = function2;
                        function7 = function3;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C1025j0(viewState, z16, interfaceC4339a5, function5, interfaceC4351m2, function6, interfaceC4339a4, function7, list, z13, i13, i14);
                    }
                }
                i15 |= 24576;
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q5.m87157i(function2)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                i28 = i14 & 64;
                if (i28 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c28655q5.m87157i(interfaceC4339a2)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i15 |= i29;
                }
                i34 = i14 & 128;
                if (i34 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c28655q5.m87157i(function3)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i15 |= i35;
                }
                if ((i13 & 100663296) == 0) {
                    if (c28655q5.m87157i(list)) {
                        i47 = 67108864;
                    } else {
                        i47 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i47;
                }
                if ((i13 & 805306368) == 0) {
                    if (c28655q5.m87155h(z13)) {
                        i46 = 536870912;
                    } else {
                        i46 = 268435456;
                    }
                    i15 |= i46;
                }
                if ((i15 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q5.m87135U(i15 & 1, z15)) {
                    if (i48 != 0) {
                        z14 = false;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R18 = c28655q5.m87133R();
                        if (objM87133R18 == c28676v0) {
                            objM87133R18 = new C31469a(3);
                            c28655q5.m87172p0(objM87133R18);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R18;
                    } else {
                        interfaceC4339a6 = interfaceC4339a3;
                    }
                    if (i18 != 0) {
                        objM87133R17 = c28655q5.m87133R();
                        if (objM87133R17 == c28676v0) {
                            objM87133R17 = new C30985h(28);
                            c28655q5.m87172p0(objM87133R17);
                        }
                        function8 = (Function1) objM87133R17;
                    } else {
                        function8 = function4;
                    }
                    if (i24 != 0) {
                        objM87133R16 = c28655q5.m87133R();
                        if (objM87133R16 == c28676v0) {
                            objM87133R16 = new C31314a(7);
                            c28655q5.m87172p0(objM87133R16);
                        }
                        interfaceC4351m3 = (InterfaceC4351m) objM87133R16;
                    } else {
                        interfaceC4351m3 = interfaceC4351m;
                    }
                    if (i26 != 0) {
                        objM87133R15 = c28655q5.m87133R();
                        if (objM87133R15 == c28676v0) {
                            objM87133R15 = new C30985h(29);
                            c28655q5.m87172p0(objM87133R15);
                        }
                        function9 = (Function1) objM87133R15;
                    } else {
                        function9 = function2;
                    }
                    if (i28 != 0) {
                        objM87133R14 = c28655q5.m87133R();
                        if (objM87133R14 == c28676v0) {
                            objM87133R14 = new C31469a(4);
                            c28655q5.m87172p0(objM87133R14);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R14;
                    } else {
                        interfaceC4339a7 = interfaceC4339a2;
                    }
                    if (i34 != 0) {
                        objM87133R13 = c28655q5.m87133R();
                        if (objM87133R13 == c28676v0) {
                            objM87133R13 = new C31593g(0);
                            c28655q5.m87172p0(objM87133R13);
                        }
                        function10 = (Function1) objM87133R13;
                    } else {
                        function10 = function3;
                    }
                    objM87133R = c28655q5.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                        c28655q5.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q5.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q5.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R3);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                    InterfaceC4339a interfaceC4339a110 = interfaceC4339a6;
                    objM87133R4 = c28655q5.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC31061c.m95647w(z13, c28655q5);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q5.m87133R();
                    function11 = function8;
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new a(interfaceC28601c1, interfaceC28601c2, interfaceC28601c3, null);
                        c28655q5.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                    if (m97441v(interfaceC28601c4)) {
                        c28655q5.m87150e0(1660299335);
                        if (list == null) {
                            c28655q5.m87150e0(-70328166);
                            c28655q5.m87173q(false);
                            c28655q2 = c28655q5;
                            i36 = 1048576;
                            i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            z17 = false;
                            interfaceC28601c5 = interfaceC28601c2;
                        } else {
                            c28655q5.m87150e0(-70328165);
                            boolean zM97413P4 = m97413P(interfaceC28601c1);
                            C3733d1 c3733d4 = AbstractC3730c1.f15251a;
                            C3739f1 c3739f1M11563a4 = AbstractC3788w0.m11584l(AbstractC11348f.m30574v(ErrorCodes.TracksErrors.cGenericTrack, 0, null, 6), C2299e.f9107J, null, 12).m11563a(AbstractC3788w0.m11578f(AbstractC11348f.m30574v(ErrorCodes.TracksErrors.cGenericTrack, 0, null, 6), 2));
                            C37816b c37816bM121344e4 = AbstractC37817c.m121344e(2039574871, c28655q5, new C26949h(viewState, list, function9, 13));
                            i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            z17 = false;
                            i36 = 1048576;
                            interfaceC28601c5 = interfaceC28601c2;
                            AbstractC1090b.m3351f(zM97413P4, null, c3733d4, c3739f1M11563a4, null, c37816bM121344e4, c28655q5, 199680, 18);
                            c28655q2 = c28655q5;
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z17);
                    } else {
                        c28655q2 = c28655q5;
                        z14 = z14;
                        interfaceC4351m3 = interfaceC4351m3;
                        interfaceC28601c3 = interfaceC28601c3;
                        interfaceC28601c5 = interfaceC28601c2;
                        i36 = 1048576;
                        z17 = false;
                        i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        c28655q2.m87150e0(-69524583);
                        c28655q2.m87173q(false);
                    }
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC28601c6 = (InterfaceC28601c1) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC28683x.m87272z(EnumC35102h.NORMAL);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    interfaceC28601c7 = (InterfaceC28601c1) objM87133R7;
                    interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                    i38 = i15 & 14;
                    if (i38 != 4) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    if ((i15 & 3670016) == i36) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z313 = z18 | z19;
                    if ((i15 & 7168) == i37) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = z313 | z24;
                    objM87133R8 = c28655q2.m87133R();
                    if (z25) {
                        InterfaceC4339a interfaceC4339a111 = interfaceC4339a7;
                        objM87133R8 = new b(viewState, interfaceC4339a111, function11, interfaceC28601c6, null);
                        interfaceC4339a8 = interfaceC4339a111;
                        function12 = function11;
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        InterfaceC4339a interfaceC4339a112 = interfaceC4339a7;
                        objM87133R8 = new b(viewState, interfaceC4339a112, function11, interfaceC28601c6, null);
                        interfaceC4339a8 = interfaceC4339a112;
                        function12 = function11;
                        c28655q2.m87172p0(objM87133R8);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, viewState);
                    enumC35102hM97398A = m97398A(interfaceC28601c7);
                    enumC35102h = EnumC35102h.NORMAL;
                    f13 = 0.0f;
                    if (enumC35102hM97398A == enumC35102h) {
                        f14 = 0.0f;
                    } else {
                        f14 = -90.0f;
                    }
                    i39 = i15;
                    interfaceC28601c8 = interfaceC28601c5;
                    float f18 = f14;
                    InterfaceC4339a interfaceC4339a113 = interfaceC4339a8;
                    C11347e2 c11347e2M30574v7 = AbstractC11348f.m30574v(500, 0, null, 6);
                    objM87133R9 = c28655q2.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C1024j(7, interfaceC28601c7, interfaceC28601c6);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    InterfaceC28670t2 interfaceC28670t2M30588b5 = AbstractC11352g.m30588b(f18, c11347e2M30574v7, "itemRotationAnimation", (Function1) objM87133R9, c28655q2, 27696, 4);
                    if (m97398A(interfaceC28601c7) != enumC35102h) {
                        f13 = 1.0f;
                    }
                    C11347e2 c11347e2M30574v8 = AbstractC11348f.m30574v(500, 0, null, 6);
                    objM87133R10 = c28655q2.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C1024j(8, r47, interfaceC28601c7);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v8, "replayButtonOffsetAnimation", (Function1) objM87133R10, c28655q2, 27696, 4);
                    fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).mo743q0(4 * 35);
                    if (viewState.getCardStackSize() > 0) {
                        i44 = 1;
                    } else {
                        i44 = 0;
                    }
                    InterfaceC28670t2 interfaceC28670t2M30587a4 = AbstractC11352g.m30587a(i44 * 8, null, "counterPaddingAnimation", c28655q2, 384, 10);
                    C2314t c2314t4 = C2314t.f9131w;
                    Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t4);
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    InterfaceC28601c1 interfaceC28601c12 = interfaceC28601c3;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3409f4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
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
                    if (viewState.getCardStackSize() == 0) {
                        z26 = false;
                        c28655q2.m87150e0(-512086241);
                        c28655q2.m87173q(false);
                        c28655q3 = c28655q2;
                    } else {
                        z26 = false;
                        c28655q2.m87150e0(-512086241);
                        c28655q2.m87173q(false);
                        c28655q3 = c28655q2;
                    }
                    InterfaceC16556w interfaceC16556wM115208c4 = viewState.getCardToDisplay();
                    if (m97437r(interfaceC28601c8)) {
                        interfaceC16556wM115211f = viewState.getNextCard();
                    } else {
                        interfaceC16556wM115211f = viewState.getNextCard();
                    }
                    if (m97437r(interfaceC28601c8)) {
                        z27 = true;
                    } else {
                        z27 = true;
                    }
                    c28655q4 = c28655q3;
                    i45 = i39 & 29360128;
                    function13 = function10;
                    AbstractC31592f.m97385i(interfaceC16556wM115208c4, interfaceC16556wM115211f, viewState.getCardStackSize(), z27, function9, interfaceC4351m3, viewState.getNotificationCardDismissAnimation(), function13, c28655q4, ((i39 >> 3) & 57344) | ((i39 << 3) & 458752) | i45, 0);
                    Modifier modifierM3398t4 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t4, C2299e.f9116y), 0.0f, 0.0f, m97405H(interfaceC28670t2M30587a4), 0.0f, 11);
                    zM87147d = c28655q4.m87147d(fMo743q0) | c28655q4.m87153g(interfaceC28670t2M30588b);
                    objM87133R11 = c28655q4.m87133R();
                    if (zM87147d) {
                        objM87133R11 = new C2928d(fMo743q0, interfaceC28670t2M30588b, 1);
                        c28655q4.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C2928d(fMo743q0, interfaceC28670t2M30588b, 1);
                        c28655q4.m87172p0(objM87133R11);
                    }
                    Modifier modifierM3390l4 = AbstractC1099a.m3390l(modifierM3398t4, (Function1) objM87133R11);
                    int iM115207b4 = viewState.getCardStackSize();
                    if (m97398A(interfaceC28601c7) != enumC35102h) {
                    }
                    boolean zM115214i4 = viewState.getIsUpdating();
                    boolean zM97444y4 = m97444y(r47);
                    float fM97401D4 = m97401D(interfaceC28670t2M30588b5);
                    if (viewState.getPlayShimmer()) {
                        z28 = true;
                    } else {
                        z28 = true;
                    }
                    boolean zM115209d4 = viewState.getHighlightCounter();
                    EnumC35102h enumC35102hM97398A5 = m97398A(interfaceC28601c7);
                    C3733d1 c3733d1M11577e4 = AbstractC3788w0.m11577e(null, 3);
                    if (i38 != 4) {
                        z29 = true;
                    } else {
                        z29 = true;
                    }
                    if (i45 == 8388608) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    boolean z314 = z34 | z29;
                    if ((i39 & 57344) == 16384) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    zM87157i = z314 | z35 | c28655q4.m87157i(interfaceC29805a);
                    objM87133R12 = c28655q4.m87133R();
                    if (zM87157i) {
                        objM87133R12 = new C27198e((Object) viewState, function13, (Object) interfaceC4351m3, (Object) interfaceC29805a, 12);
                        c28655q4.m87172p0(objM87133R12);
                    } else {
                        objM87133R12 = new C27198e((Object) viewState, function13, (Object) interfaceC4351m3, (Object) interfaceC29805a, 12);
                        c28655q4.m87172p0(objM87133R12);
                    }
                    AbstractC35097c.m111000c(modifierM3390l4, iM115207b4, z37, fM97401D4, zM115214i4, zM97444y4, z28, zM115209d4, enumC35102hM97398A5, interfaceC4339a110, c3733d1M11577e4, (InterfaceC4339a) objM87133R12, c28655q4, (i39 << 21) & 1879048192, 6, 0);
                    c28655q = c28655q4;
                    c28655q.m87173q(true);
                    function7 = function13;
                    function5 = function12;
                    interfaceC4339a5 = interfaceC4339a110;
                    z16 = z14;
                    interfaceC4351m2 = interfaceC4351m3;
                    interfaceC4339a4 = interfaceC4339a113;
                    function6 = function9;
                } else {
                    c28655q = c28655q5;
                    c28655q.m87138X();
                    interfaceC4351m2 = interfaceC4351m;
                    interfaceC4339a4 = interfaceC4339a2;
                    z16 = z14;
                    interfaceC4339a5 = interfaceC4339a3;
                    function5 = function4;
                    function6 = function2;
                    function7 = function3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C1025j0(viewState, z16, interfaceC4339a5, function5, interfaceC4351m2, function6, interfaceC4339a4, function7, list, z13, i13, i14);
                }
            }
            i15 |= 384;
            interfaceC4339a3 = interfaceC4339a;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function4 = function1;
                    if (c28655q5.m87157i(function4)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        if (c28655q5.m87157i(interfaceC4351m)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q5.m87157i(function2)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                    i28 = i14 & 64;
                    if (i28 != 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (c28655q5.m87157i(interfaceC4339a2)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i15 |= i29;
                    }
                    i34 = i14 & 128;
                    if (i34 != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (c28655q5.m87157i(function3)) {
                            i35 = 8388608;
                        } else {
                            i35 = 4194304;
                        }
                        i15 |= i35;
                    }
                    if ((i13 & 100663296) == 0) {
                        if (c28655q5.m87157i(list)) {
                            i47 = 67108864;
                        } else {
                            i47 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i47;
                    }
                    if ((i13 & 805306368) == 0) {
                        if (c28655q5.m87155h(z13)) {
                            i46 = 536870912;
                        } else {
                            i46 = 268435456;
                        }
                        i15 |= i46;
                    }
                    if ((i15 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c28655q5.m87135U(i15 & 1, z15)) {
                        if (i48 != 0) {
                            z14 = false;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R18 = c28655q5.m87133R();
                            if (objM87133R18 == c28676v0) {
                                objM87133R18 = new C31469a(3);
                                c28655q5.m87172p0(objM87133R18);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R18;
                        } else {
                            interfaceC4339a6 = interfaceC4339a3;
                        }
                        if (i18 != 0) {
                            objM87133R17 = c28655q5.m87133R();
                            if (objM87133R17 == c28676v0) {
                                objM87133R17 = new C30985h(28);
                                c28655q5.m87172p0(objM87133R17);
                            }
                            function8 = (Function1) objM87133R17;
                        } else {
                            function8 = function4;
                        }
                        if (i24 != 0) {
                            objM87133R16 = c28655q5.m87133R();
                            if (objM87133R16 == c28676v0) {
                                objM87133R16 = new C31314a(7);
                                c28655q5.m87172p0(objM87133R16);
                            }
                            interfaceC4351m3 = (InterfaceC4351m) objM87133R16;
                        } else {
                            interfaceC4351m3 = interfaceC4351m;
                        }
                        if (i26 != 0) {
                            objM87133R15 = c28655q5.m87133R();
                            if (objM87133R15 == c28676v0) {
                                objM87133R15 = new C30985h(29);
                                c28655q5.m87172p0(objM87133R15);
                            }
                            function9 = (Function1) objM87133R15;
                        } else {
                            function9 = function2;
                        }
                        if (i28 != 0) {
                            objM87133R14 = c28655q5.m87133R();
                            if (objM87133R14 == c28676v0) {
                                objM87133R14 = new C31469a(4);
                                c28655q5.m87172p0(objM87133R14);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R14;
                        } else {
                            interfaceC4339a7 = interfaceC4339a2;
                        }
                        if (i34 != 0) {
                            objM87133R13 = c28655q5.m87133R();
                            if (objM87133R13 == c28676v0) {
                                objM87133R13 = new C31593g(0);
                                c28655q5.m87172p0(objM87133R13);
                            }
                            function10 = (Function1) objM87133R13;
                        } else {
                            function10 = function3;
                        }
                        objM87133R = c28655q5.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                            c28655q5.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        objM87133R2 = c28655q5.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q5.m87172p0(objM87133R2);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                        objM87133R3 = c28655q5.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q5.m87172p0(objM87133R3);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                        InterfaceC4339a interfaceC4339a114 = interfaceC4339a6;
                        objM87133R4 = c28655q5.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC31061c.m95647w(z13, c28655q5);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                        objM87133R5 = c28655q5.m87133R();
                        function11 = function8;
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new a(interfaceC28601c1, interfaceC28601c2, interfaceC28601c3, null);
                            c28655q5.m87172p0(objM87133R5);
                        }
                        AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                        if (m97441v(interfaceC28601c4)) {
                            c28655q5.m87150e0(1660299335);
                            if (list == null) {
                                c28655q5.m87150e0(-70328166);
                                c28655q5.m87173q(false);
                                c28655q2 = c28655q5;
                                i36 = 1048576;
                                i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                                z17 = false;
                                interfaceC28601c5 = interfaceC28601c2;
                            } else {
                                c28655q5.m87150e0(-70328165);
                                boolean zM97413P5 = m97413P(interfaceC28601c1);
                                C3733d1 c3733d5 = AbstractC3730c1.f15251a;
                                C3739f1 c3739f1M11563a5 = AbstractC3788w0.m11584l(AbstractC11348f.m30574v(ErrorCodes.TracksErrors.cGenericTrack, 0, null, 6), C2299e.f9107J, null, 12).m11563a(AbstractC3788w0.m11578f(AbstractC11348f.m30574v(ErrorCodes.TracksErrors.cGenericTrack, 0, null, 6), 2));
                                C37816b c37816bM121344e5 = AbstractC37817c.m121344e(2039574871, c28655q5, new C26949h(viewState, list, function9, 13));
                                i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                                z17 = false;
                                i36 = 1048576;
                                interfaceC28601c5 = interfaceC28601c2;
                                AbstractC1090b.m3351f(zM97413P5, null, c3733d5, c3739f1M11563a5, null, c37816bM121344e5, c28655q5, 199680, 18);
                                c28655q2 = c28655q5;
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(z17);
                        } else {
                            c28655q2 = c28655q5;
                            z14 = z14;
                            interfaceC4351m3 = interfaceC4351m3;
                            interfaceC28601c3 = interfaceC28601c3;
                            interfaceC28601c5 = interfaceC28601c2;
                            i36 = 1048576;
                            z17 = false;
                            i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            c28655q2.m87150e0(-69524583);
                            c28655q2.m87173q(false);
                        }
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC28601c6 = (InterfaceC28601c1) objM87133R6;
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC28683x.m87272z(EnumC35102h.NORMAL);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        interfaceC28601c7 = (InterfaceC28601c1) objM87133R7;
                        interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                        i38 = i15 & 14;
                        if (i38 != 4) {
                            z18 = true;
                        } else {
                            z18 = true;
                        }
                        if ((i15 & 3670016) == i36) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean z315 = z18 | z19;
                        if ((i15 & 7168) == i37) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = z315 | z24;
                        objM87133R8 = c28655q2.m87133R();
                        if (z25) {
                            InterfaceC4339a interfaceC4339a115 = interfaceC4339a7;
                            objM87133R8 = new b(viewState, interfaceC4339a115, function11, interfaceC28601c6, null);
                            interfaceC4339a8 = interfaceC4339a115;
                            function12 = function11;
                            c28655q2.m87172p0(objM87133R8);
                        } else {
                            InterfaceC4339a interfaceC4339a116 = interfaceC4339a7;
                            objM87133R8 = new b(viewState, interfaceC4339a116, function11, interfaceC28601c6, null);
                            interfaceC4339a8 = interfaceC4339a116;
                            function12 = function11;
                            c28655q2.m87172p0(objM87133R8);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, viewState);
                        enumC35102hM97398A = m97398A(interfaceC28601c7);
                        enumC35102h = EnumC35102h.NORMAL;
                        f13 = 0.0f;
                        if (enumC35102hM97398A == enumC35102h) {
                            f14 = 0.0f;
                        } else {
                            f14 = -90.0f;
                        }
                        i39 = i15;
                        interfaceC28601c8 = interfaceC28601c5;
                        float f19 = f14;
                        InterfaceC4339a interfaceC4339a117 = interfaceC4339a8;
                        C11347e2 c11347e2M30574v9 = AbstractC11348f.m30574v(500, 0, null, 6);
                        objM87133R9 = c28655q2.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C1024j(7, interfaceC28601c7, interfaceC28601c6);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        InterfaceC28670t2 interfaceC28670t2M30588b6 = AbstractC11352g.m30588b(f19, c11347e2M30574v9, "itemRotationAnimation", (Function1) objM87133R9, c28655q2, 27696, 4);
                        if (m97398A(interfaceC28601c7) != enumC35102h) {
                            f13 = 1.0f;
                        }
                        C11347e2 c11347e2M30574v10 = AbstractC11348f.m30574v(500, 0, null, 6);
                        objM87133R10 = c28655q2.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C1024j(8, r47, interfaceC28601c7);
                            c28655q2.m87172p0(objM87133R10);
                        }
                        interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v10, "replayButtonOffsetAnimation", (Function1) objM87133R10, c28655q2, 27696, 4);
                        fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).mo743q0(4 * 35);
                        if (viewState.getCardStackSize() > 0) {
                            i44 = 1;
                        } else {
                            i44 = 0;
                        }
                        InterfaceC28670t2 interfaceC28670t2M30587a5 = AbstractC11352g.m30587a(i44 * 8, null, "counterPaddingAnimation", c28655q2, 384, 10);
                        C2314t c2314t5 = C2314t.f9131w;
                        Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t5);
                        InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        InterfaceC28601c1 interfaceC28601c13 = interfaceC28601c3;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3409f5);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d5);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m5);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N5);
                        if (viewState.getCardStackSize() == 0) {
                            z26 = false;
                            c28655q2.m87150e0(-512086241);
                            c28655q2.m87173q(false);
                            c28655q3 = c28655q2;
                        } else {
                            z26 = false;
                            c28655q2.m87150e0(-512086241);
                            c28655q2.m87173q(false);
                            c28655q3 = c28655q2;
                        }
                        InterfaceC16556w interfaceC16556wM115208c5 = viewState.getCardToDisplay();
                        if (m97437r(interfaceC28601c8)) {
                            interfaceC16556wM115211f = viewState.getNextCard();
                        } else {
                            interfaceC16556wM115211f = viewState.getNextCard();
                        }
                        if (m97437r(interfaceC28601c8)) {
                            z27 = true;
                        } else {
                            z27 = true;
                        }
                        c28655q4 = c28655q3;
                        i45 = i39 & 29360128;
                        function13 = function10;
                        AbstractC31592f.m97385i(interfaceC16556wM115208c5, interfaceC16556wM115211f, viewState.getCardStackSize(), z27, function9, interfaceC4351m3, viewState.getNotificationCardDismissAnimation(), function13, c28655q4, ((i39 >> 3) & 57344) | ((i39 << 3) & 458752) | i45, 0);
                        Modifier modifierM3398t5 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t5, C2299e.f9116y), 0.0f, 0.0f, m97405H(interfaceC28670t2M30587a5), 0.0f, 11);
                        zM87147d = c28655q4.m87147d(fMo743q0) | c28655q4.m87153g(interfaceC28670t2M30588b);
                        objM87133R11 = c28655q4.m87133R();
                        if (zM87147d) {
                            objM87133R11 = new C2928d(fMo743q0, interfaceC28670t2M30588b, 1);
                            c28655q4.m87172p0(objM87133R11);
                        } else {
                            objM87133R11 = new C2928d(fMo743q0, interfaceC28670t2M30588b, 1);
                            c28655q4.m87172p0(objM87133R11);
                        }
                        Modifier modifierM3390l5 = AbstractC1099a.m3390l(modifierM3398t5, (Function1) objM87133R11);
                        int iM115207b5 = viewState.getCardStackSize();
                        if (m97398A(interfaceC28601c7) != enumC35102h) {
                        }
                        boolean zM115214i5 = viewState.getIsUpdating();
                        boolean zM97444y5 = m97444y(r47);
                        float fM97401D5 = m97401D(interfaceC28670t2M30588b6);
                        if (viewState.getPlayShimmer()) {
                            z28 = true;
                        } else {
                            z28 = true;
                        }
                        boolean zM115209d5 = viewState.getHighlightCounter();
                        EnumC35102h enumC35102hM97398A6 = m97398A(interfaceC28601c7);
                        C3733d1 c3733d1M11577e5 = AbstractC3788w0.m11577e(null, 3);
                        if (i38 != 4) {
                            z29 = true;
                        } else {
                            z29 = true;
                        }
                        if (i45 == 8388608) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                        boolean z316 = z34 | z29;
                        if ((i39 & 57344) == 16384) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        zM87157i = z316 | z35 | c28655q4.m87157i(interfaceC29805a);
                        objM87133R12 = c28655q4.m87133R();
                        if (zM87157i) {
                            objM87133R12 = new C27198e((Object) viewState, function13, (Object) interfaceC4351m3, (Object) interfaceC29805a, 12);
                            c28655q4.m87172p0(objM87133R12);
                        } else {
                            objM87133R12 = new C27198e((Object) viewState, function13, (Object) interfaceC4351m3, (Object) interfaceC29805a, 12);
                            c28655q4.m87172p0(objM87133R12);
                        }
                        AbstractC35097c.m111000c(modifierM3390l5, iM115207b5, z37, fM97401D5, zM115214i5, zM97444y5, z28, zM115209d5, enumC35102hM97398A6, interfaceC4339a114, c3733d1M11577e5, (InterfaceC4339a) objM87133R12, c28655q4, (i39 << 21) & 1879048192, 6, 0);
                        c28655q = c28655q4;
                        c28655q.m87173q(true);
                        function7 = function13;
                        function5 = function12;
                        interfaceC4339a5 = interfaceC4339a114;
                        z16 = z14;
                        interfaceC4351m2 = interfaceC4351m3;
                        interfaceC4339a4 = interfaceC4339a117;
                        function6 = function9;
                    } else {
                        c28655q = c28655q5;
                        c28655q.m87138X();
                        interfaceC4351m2 = interfaceC4351m;
                        interfaceC4339a4 = interfaceC4339a2;
                        z16 = z14;
                        interfaceC4339a5 = interfaceC4339a3;
                        function5 = function4;
                        function6 = function2;
                        function7 = function3;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C1025j0(viewState, z16, interfaceC4339a5, function5, interfaceC4351m2, function6, interfaceC4339a4, function7, list, z13, i13, i14);
                    }
                }
                i15 |= 24576;
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q5.m87157i(function2)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                i28 = i14 & 64;
                if (i28 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c28655q5.m87157i(interfaceC4339a2)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i15 |= i29;
                }
                i34 = i14 & 128;
                if (i34 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c28655q5.m87157i(function3)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i15 |= i35;
                }
                if ((i13 & 100663296) == 0) {
                    if (c28655q5.m87157i(list)) {
                        i47 = 67108864;
                    } else {
                        i47 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i47;
                }
                if ((i13 & 805306368) == 0) {
                    if (c28655q5.m87155h(z13)) {
                        i46 = 536870912;
                    } else {
                        i46 = 268435456;
                    }
                    i15 |= i46;
                }
                if ((i15 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q5.m87135U(i15 & 1, z15)) {
                    if (i48 != 0) {
                        z14 = false;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R18 = c28655q5.m87133R();
                        if (objM87133R18 == c28676v0) {
                            objM87133R18 = new C31469a(3);
                            c28655q5.m87172p0(objM87133R18);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R18;
                    } else {
                        interfaceC4339a6 = interfaceC4339a3;
                    }
                    if (i18 != 0) {
                        objM87133R17 = c28655q5.m87133R();
                        if (objM87133R17 == c28676v0) {
                            objM87133R17 = new C30985h(28);
                            c28655q5.m87172p0(objM87133R17);
                        }
                        function8 = (Function1) objM87133R17;
                    } else {
                        function8 = function4;
                    }
                    if (i24 != 0) {
                        objM87133R16 = c28655q5.m87133R();
                        if (objM87133R16 == c28676v0) {
                            objM87133R16 = new C31314a(7);
                            c28655q5.m87172p0(objM87133R16);
                        }
                        interfaceC4351m3 = (InterfaceC4351m) objM87133R16;
                    } else {
                        interfaceC4351m3 = interfaceC4351m;
                    }
                    if (i26 != 0) {
                        objM87133R15 = c28655q5.m87133R();
                        if (objM87133R15 == c28676v0) {
                            objM87133R15 = new C30985h(29);
                            c28655q5.m87172p0(objM87133R15);
                        }
                        function9 = (Function1) objM87133R15;
                    } else {
                        function9 = function2;
                    }
                    if (i28 != 0) {
                        objM87133R14 = c28655q5.m87133R();
                        if (objM87133R14 == c28676v0) {
                            objM87133R14 = new C31469a(4);
                            c28655q5.m87172p0(objM87133R14);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R14;
                    } else {
                        interfaceC4339a7 = interfaceC4339a2;
                    }
                    if (i34 != 0) {
                        objM87133R13 = c28655q5.m87133R();
                        if (objM87133R13 == c28676v0) {
                            objM87133R13 = new C31593g(0);
                            c28655q5.m87172p0(objM87133R13);
                        }
                        function10 = (Function1) objM87133R13;
                    } else {
                        function10 = function3;
                    }
                    objM87133R = c28655q5.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                        c28655q5.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q5.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q5.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R3);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                    InterfaceC4339a interfaceC4339a118 = interfaceC4339a6;
                    objM87133R4 = c28655q5.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC31061c.m95647w(z13, c28655q5);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q5.m87133R();
                    function11 = function8;
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new a(interfaceC28601c1, interfaceC28601c2, interfaceC28601c3, null);
                        c28655q5.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                    if (m97441v(interfaceC28601c4)) {
                        c28655q5.m87150e0(1660299335);
                        if (list == null) {
                            c28655q5.m87150e0(-70328166);
                            c28655q5.m87173q(false);
                            c28655q2 = c28655q5;
                            i36 = 1048576;
                            i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            z17 = false;
                            interfaceC28601c5 = interfaceC28601c2;
                        } else {
                            c28655q5.m87150e0(-70328165);
                            boolean zM97413P6 = m97413P(interfaceC28601c1);
                            C3733d1 c3733d6 = AbstractC3730c1.f15251a;
                            C3739f1 c3739f1M11563a6 = AbstractC3788w0.m11584l(AbstractC11348f.m30574v(ErrorCodes.TracksErrors.cGenericTrack, 0, null, 6), C2299e.f9107J, null, 12).m11563a(AbstractC3788w0.m11578f(AbstractC11348f.m30574v(ErrorCodes.TracksErrors.cGenericTrack, 0, null, 6), 2));
                            C37816b c37816bM121344e6 = AbstractC37817c.m121344e(2039574871, c28655q5, new C26949h(viewState, list, function9, 13));
                            i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            z17 = false;
                            i36 = 1048576;
                            interfaceC28601c5 = interfaceC28601c2;
                            AbstractC1090b.m3351f(zM97413P6, null, c3733d6, c3739f1M11563a6, null, c37816bM121344e6, c28655q5, 199680, 18);
                            c28655q2 = c28655q5;
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z17);
                    } else {
                        c28655q2 = c28655q5;
                        z14 = z14;
                        interfaceC4351m3 = interfaceC4351m3;
                        interfaceC28601c3 = interfaceC28601c3;
                        interfaceC28601c5 = interfaceC28601c2;
                        i36 = 1048576;
                        z17 = false;
                        i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        c28655q2.m87150e0(-69524583);
                        c28655q2.m87173q(false);
                    }
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC28601c6 = (InterfaceC28601c1) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC28683x.m87272z(EnumC35102h.NORMAL);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    interfaceC28601c7 = (InterfaceC28601c1) objM87133R7;
                    interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                    i38 = i15 & 14;
                    if (i38 != 4) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    if ((i15 & 3670016) == i36) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z317 = z18 | z19;
                    if ((i15 & 7168) == i37) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = z317 | z24;
                    objM87133R8 = c28655q2.m87133R();
                    if (z25) {
                        InterfaceC4339a interfaceC4339a119 = interfaceC4339a7;
                        objM87133R8 = new b(viewState, interfaceC4339a119, function11, interfaceC28601c6, null);
                        interfaceC4339a8 = interfaceC4339a119;
                        function12 = function11;
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        InterfaceC4339a interfaceC4339a1110 = interfaceC4339a7;
                        objM87133R8 = new b(viewState, interfaceC4339a1110, function11, interfaceC28601c6, null);
                        interfaceC4339a8 = interfaceC4339a1110;
                        function12 = function11;
                        c28655q2.m87172p0(objM87133R8);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, viewState);
                    enumC35102hM97398A = m97398A(interfaceC28601c7);
                    enumC35102h = EnumC35102h.NORMAL;
                    f13 = 0.0f;
                    if (enumC35102hM97398A == enumC35102h) {
                        f14 = 0.0f;
                    } else {
                        f14 = -90.0f;
                    }
                    i39 = i15;
                    interfaceC28601c8 = interfaceC28601c5;
                    float f110 = f14;
                    InterfaceC4339a interfaceC4339a1111 = interfaceC4339a8;
                    C11347e2 c11347e2M30574v11 = AbstractC11348f.m30574v(500, 0, null, 6);
                    objM87133R9 = c28655q2.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C1024j(7, interfaceC28601c7, interfaceC28601c6);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    InterfaceC28670t2 interfaceC28670t2M30588b7 = AbstractC11352g.m30588b(f110, c11347e2M30574v11, "itemRotationAnimation", (Function1) objM87133R9, c28655q2, 27696, 4);
                    if (m97398A(interfaceC28601c7) != enumC35102h) {
                        f13 = 1.0f;
                    }
                    C11347e2 c11347e2M30574v12 = AbstractC11348f.m30574v(500, 0, null, 6);
                    objM87133R10 = c28655q2.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C1024j(8, r47, interfaceC28601c7);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v12, "replayButtonOffsetAnimation", (Function1) objM87133R10, c28655q2, 27696, 4);
                    fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).mo743q0(4 * 35);
                    if (viewState.getCardStackSize() > 0) {
                        i44 = 1;
                    } else {
                        i44 = 0;
                    }
                    InterfaceC28670t2 interfaceC28670t2M30587a6 = AbstractC11352g.m30587a(i44 * 8, null, "counterPaddingAnimation", c28655q2, 384, 10);
                    C2314t c2314t6 = C2314t.f9131w;
                    Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t6);
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    InterfaceC28601c1 interfaceC28601c14 = interfaceC28601c3;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3409f6);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d6);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m6);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N6);
                    if (viewState.getCardStackSize() == 0) {
                        z26 = false;
                        c28655q2.m87150e0(-512086241);
                        c28655q2.m87173q(false);
                        c28655q3 = c28655q2;
                    } else {
                        z26 = false;
                        c28655q2.m87150e0(-512086241);
                        c28655q2.m87173q(false);
                        c28655q3 = c28655q2;
                    }
                    InterfaceC16556w interfaceC16556wM115208c6 = viewState.getCardToDisplay();
                    if (m97437r(interfaceC28601c8)) {
                        interfaceC16556wM115211f = viewState.getNextCard();
                    } else {
                        interfaceC16556wM115211f = viewState.getNextCard();
                    }
                    if (m97437r(interfaceC28601c8)) {
                        z27 = true;
                    } else {
                        z27 = true;
                    }
                    c28655q4 = c28655q3;
                    i45 = i39 & 29360128;
                    function13 = function10;
                    AbstractC31592f.m97385i(interfaceC16556wM115208c6, interfaceC16556wM115211f, viewState.getCardStackSize(), z27, function9, interfaceC4351m3, viewState.getNotificationCardDismissAnimation(), function13, c28655q4, ((i39 >> 3) & 57344) | ((i39 << 3) & 458752) | i45, 0);
                    Modifier modifierM3398t6 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t6, C2299e.f9116y), 0.0f, 0.0f, m97405H(interfaceC28670t2M30587a6), 0.0f, 11);
                    zM87147d = c28655q4.m87147d(fMo743q0) | c28655q4.m87153g(interfaceC28670t2M30588b);
                    objM87133R11 = c28655q4.m87133R();
                    if (zM87147d) {
                        objM87133R11 = new C2928d(fMo743q0, interfaceC28670t2M30588b, 1);
                        c28655q4.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C2928d(fMo743q0, interfaceC28670t2M30588b, 1);
                        c28655q4.m87172p0(objM87133R11);
                    }
                    Modifier modifierM3390l6 = AbstractC1099a.m3390l(modifierM3398t6, (Function1) objM87133R11);
                    int iM115207b6 = viewState.getCardStackSize();
                    if (m97398A(interfaceC28601c7) != enumC35102h) {
                    }
                    boolean zM115214i6 = viewState.getIsUpdating();
                    boolean zM97444y6 = m97444y(r47);
                    float fM97401D6 = m97401D(interfaceC28670t2M30588b7);
                    if (viewState.getPlayShimmer()) {
                        z28 = true;
                    } else {
                        z28 = true;
                    }
                    boolean zM115209d6 = viewState.getHighlightCounter();
                    EnumC35102h enumC35102hM97398A7 = m97398A(interfaceC28601c7);
                    C3733d1 c3733d1M11577e6 = AbstractC3788w0.m11577e(null, 3);
                    if (i38 != 4) {
                        z29 = true;
                    } else {
                        z29 = true;
                    }
                    if (i45 == 8388608) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    boolean z318 = z34 | z29;
                    if ((i39 & 57344) == 16384) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    zM87157i = z318 | z35 | c28655q4.m87157i(interfaceC29805a);
                    objM87133R12 = c28655q4.m87133R();
                    if (zM87157i) {
                        objM87133R12 = new C27198e((Object) viewState, function13, (Object) interfaceC4351m3, (Object) interfaceC29805a, 12);
                        c28655q4.m87172p0(objM87133R12);
                    } else {
                        objM87133R12 = new C27198e((Object) viewState, function13, (Object) interfaceC4351m3, (Object) interfaceC29805a, 12);
                        c28655q4.m87172p0(objM87133R12);
                    }
                    AbstractC35097c.m111000c(modifierM3390l6, iM115207b6, z37, fM97401D6, zM115214i6, zM97444y6, z28, zM115209d6, enumC35102hM97398A7, interfaceC4339a118, c3733d1M11577e6, (InterfaceC4339a) objM87133R12, c28655q4, (i39 << 21) & 1879048192, 6, 0);
                    c28655q = c28655q4;
                    c28655q.m87173q(true);
                    function7 = function13;
                    function5 = function12;
                    interfaceC4339a5 = interfaceC4339a118;
                    z16 = z14;
                    interfaceC4351m2 = interfaceC4351m3;
                    interfaceC4339a4 = interfaceC4339a1111;
                    function6 = function9;
                } else {
                    c28655q = c28655q5;
                    c28655q.m87138X();
                    interfaceC4351m2 = interfaceC4351m;
                    interfaceC4339a4 = interfaceC4339a2;
                    z16 = z14;
                    interfaceC4339a5 = interfaceC4339a3;
                    function5 = function4;
                    function6 = function2;
                    function7 = function3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C1025j0(viewState, z16, interfaceC4339a5, function5, interfaceC4351m2, function6, interfaceC4339a4, function7, list, z13, i13, i14);
                }
            }
            i15 |= 3072;
            function4 = function1;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c28655q5.m87157i(interfaceC4351m)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q5.m87157i(function2)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                i28 = i14 & 64;
                if (i28 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c28655q5.m87157i(interfaceC4339a2)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i15 |= i29;
                }
                i34 = i14 & 128;
                if (i34 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c28655q5.m87157i(function3)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i15 |= i35;
                }
                if ((i13 & 100663296) == 0) {
                    if (c28655q5.m87157i(list)) {
                        i47 = 67108864;
                    } else {
                        i47 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i47;
                }
                if ((i13 & 805306368) == 0) {
                    if (c28655q5.m87155h(z13)) {
                        i46 = 536870912;
                    } else {
                        i46 = 268435456;
                    }
                    i15 |= i46;
                }
                if ((i15 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q5.m87135U(i15 & 1, z15)) {
                    if (i48 != 0) {
                        z14 = false;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R18 = c28655q5.m87133R();
                        if (objM87133R18 == c28676v0) {
                            objM87133R18 = new C31469a(3);
                            c28655q5.m87172p0(objM87133R18);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R18;
                    } else {
                        interfaceC4339a6 = interfaceC4339a3;
                    }
                    if (i18 != 0) {
                        objM87133R17 = c28655q5.m87133R();
                        if (objM87133R17 == c28676v0) {
                            objM87133R17 = new C30985h(28);
                            c28655q5.m87172p0(objM87133R17);
                        }
                        function8 = (Function1) objM87133R17;
                    } else {
                        function8 = function4;
                    }
                    if (i24 != 0) {
                        objM87133R16 = c28655q5.m87133R();
                        if (objM87133R16 == c28676v0) {
                            objM87133R16 = new C31314a(7);
                            c28655q5.m87172p0(objM87133R16);
                        }
                        interfaceC4351m3 = (InterfaceC4351m) objM87133R16;
                    } else {
                        interfaceC4351m3 = interfaceC4351m;
                    }
                    if (i26 != 0) {
                        objM87133R15 = c28655q5.m87133R();
                        if (objM87133R15 == c28676v0) {
                            objM87133R15 = new C30985h(29);
                            c28655q5.m87172p0(objM87133R15);
                        }
                        function9 = (Function1) objM87133R15;
                    } else {
                        function9 = function2;
                    }
                    if (i28 != 0) {
                        objM87133R14 = c28655q5.m87133R();
                        if (objM87133R14 == c28676v0) {
                            objM87133R14 = new C31469a(4);
                            c28655q5.m87172p0(objM87133R14);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R14;
                    } else {
                        interfaceC4339a7 = interfaceC4339a2;
                    }
                    if (i34 != 0) {
                        objM87133R13 = c28655q5.m87133R();
                        if (objM87133R13 == c28676v0) {
                            objM87133R13 = new C31593g(0);
                            c28655q5.m87172p0(objM87133R13);
                        }
                        function10 = (Function1) objM87133R13;
                    } else {
                        function10 = function3;
                    }
                    objM87133R = c28655q5.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                        c28655q5.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q5.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q5.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R3);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                    InterfaceC4339a interfaceC4339a1112 = interfaceC4339a6;
                    objM87133R4 = c28655q5.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC31061c.m95647w(z13, c28655q5);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q5.m87133R();
                    function11 = function8;
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new a(interfaceC28601c1, interfaceC28601c2, interfaceC28601c3, null);
                        c28655q5.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                    if (m97441v(interfaceC28601c4)) {
                        c28655q5.m87150e0(1660299335);
                        if (list == null) {
                            c28655q5.m87150e0(-70328166);
                            c28655q5.m87173q(false);
                            c28655q2 = c28655q5;
                            i36 = 1048576;
                            i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            z17 = false;
                            interfaceC28601c5 = interfaceC28601c2;
                        } else {
                            c28655q5.m87150e0(-70328165);
                            boolean zM97413P7 = m97413P(interfaceC28601c1);
                            C3733d1 c3733d7 = AbstractC3730c1.f15251a;
                            C3739f1 c3739f1M11563a7 = AbstractC3788w0.m11584l(AbstractC11348f.m30574v(ErrorCodes.TracksErrors.cGenericTrack, 0, null, 6), C2299e.f9107J, null, 12).m11563a(AbstractC3788w0.m11578f(AbstractC11348f.m30574v(ErrorCodes.TracksErrors.cGenericTrack, 0, null, 6), 2));
                            C37816b c37816bM121344e7 = AbstractC37817c.m121344e(2039574871, c28655q5, new C26949h(viewState, list, function9, 13));
                            i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            z17 = false;
                            i36 = 1048576;
                            interfaceC28601c5 = interfaceC28601c2;
                            AbstractC1090b.m3351f(zM97413P7, null, c3733d7, c3739f1M11563a7, null, c37816bM121344e7, c28655q5, 199680, 18);
                            c28655q2 = c28655q5;
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z17);
                    } else {
                        c28655q2 = c28655q5;
                        z14 = z14;
                        interfaceC4351m3 = interfaceC4351m3;
                        interfaceC28601c3 = interfaceC28601c3;
                        interfaceC28601c5 = interfaceC28601c2;
                        i36 = 1048576;
                        z17 = false;
                        i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        c28655q2.m87150e0(-69524583);
                        c28655q2.m87173q(false);
                    }
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC28601c6 = (InterfaceC28601c1) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC28683x.m87272z(EnumC35102h.NORMAL);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    interfaceC28601c7 = (InterfaceC28601c1) objM87133R7;
                    interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                    i38 = i15 & 14;
                    if (i38 != 4) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    if ((i15 & 3670016) == i36) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z319 = z18 | z19;
                    if ((i15 & 7168) == i37) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = z319 | z24;
                    objM87133R8 = c28655q2.m87133R();
                    if (z25) {
                        InterfaceC4339a interfaceC4339a1113 = interfaceC4339a7;
                        objM87133R8 = new b(viewState, interfaceC4339a1113, function11, interfaceC28601c6, null);
                        interfaceC4339a8 = interfaceC4339a1113;
                        function12 = function11;
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        InterfaceC4339a interfaceC4339a1114 = interfaceC4339a7;
                        objM87133R8 = new b(viewState, interfaceC4339a1114, function11, interfaceC28601c6, null);
                        interfaceC4339a8 = interfaceC4339a1114;
                        function12 = function11;
                        c28655q2.m87172p0(objM87133R8);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, viewState);
                    enumC35102hM97398A = m97398A(interfaceC28601c7);
                    enumC35102h = EnumC35102h.NORMAL;
                    f13 = 0.0f;
                    if (enumC35102hM97398A == enumC35102h) {
                        f14 = 0.0f;
                    } else {
                        f14 = -90.0f;
                    }
                    i39 = i15;
                    interfaceC28601c8 = interfaceC28601c5;
                    float f111 = f14;
                    InterfaceC4339a interfaceC4339a1115 = interfaceC4339a8;
                    C11347e2 c11347e2M30574v13 = AbstractC11348f.m30574v(500, 0, null, 6);
                    objM87133R9 = c28655q2.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C1024j(7, interfaceC28601c7, interfaceC28601c6);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    InterfaceC28670t2 interfaceC28670t2M30588b8 = AbstractC11352g.m30588b(f111, c11347e2M30574v13, "itemRotationAnimation", (Function1) objM87133R9, c28655q2, 27696, 4);
                    if (m97398A(interfaceC28601c7) != enumC35102h) {
                        f13 = 1.0f;
                    }
                    C11347e2 c11347e2M30574v14 = AbstractC11348f.m30574v(500, 0, null, 6);
                    objM87133R10 = c28655q2.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C1024j(8, r47, interfaceC28601c7);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v14, "replayButtonOffsetAnimation", (Function1) objM87133R10, c28655q2, 27696, 4);
                    fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).mo743q0(4 * 35);
                    if (viewState.getCardStackSize() > 0) {
                        i44 = 1;
                    } else {
                        i44 = 0;
                    }
                    InterfaceC28670t2 interfaceC28670t2M30587a7 = AbstractC11352g.m30587a(i44 * 8, null, "counterPaddingAnimation", c28655q2, 384, 10);
                    C2314t c2314t7 = C2314t.f9131w;
                    Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t7);
                    InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    InterfaceC28601c1 interfaceC28601c15 = interfaceC28601c3;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM3409f7);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d7);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m7);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N7);
                    if (viewState.getCardStackSize() == 0) {
                        z26 = false;
                        c28655q2.m87150e0(-512086241);
                        c28655q2.m87173q(false);
                        c28655q3 = c28655q2;
                    } else {
                        z26 = false;
                        c28655q2.m87150e0(-512086241);
                        c28655q2.m87173q(false);
                        c28655q3 = c28655q2;
                    }
                    InterfaceC16556w interfaceC16556wM115208c7 = viewState.getCardToDisplay();
                    if (m97437r(interfaceC28601c8)) {
                        interfaceC16556wM115211f = viewState.getNextCard();
                    } else {
                        interfaceC16556wM115211f = viewState.getNextCard();
                    }
                    if (m97437r(interfaceC28601c8)) {
                        z27 = true;
                    } else {
                        z27 = true;
                    }
                    c28655q4 = c28655q3;
                    i45 = i39 & 29360128;
                    function13 = function10;
                    AbstractC31592f.m97385i(interfaceC16556wM115208c7, interfaceC16556wM115211f, viewState.getCardStackSize(), z27, function9, interfaceC4351m3, viewState.getNotificationCardDismissAnimation(), function13, c28655q4, ((i39 >> 3) & 57344) | ((i39 << 3) & 458752) | i45, 0);
                    Modifier modifierM3398t7 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t7, C2299e.f9116y), 0.0f, 0.0f, m97405H(interfaceC28670t2M30587a7), 0.0f, 11);
                    zM87147d = c28655q4.m87147d(fMo743q0) | c28655q4.m87153g(interfaceC28670t2M30588b);
                    objM87133R11 = c28655q4.m87133R();
                    if (zM87147d) {
                        objM87133R11 = new C2928d(fMo743q0, interfaceC28670t2M30588b, 1);
                        c28655q4.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C2928d(fMo743q0, interfaceC28670t2M30588b, 1);
                        c28655q4.m87172p0(objM87133R11);
                    }
                    Modifier modifierM3390l7 = AbstractC1099a.m3390l(modifierM3398t7, (Function1) objM87133R11);
                    int iM115207b7 = viewState.getCardStackSize();
                    if (m97398A(interfaceC28601c7) != enumC35102h) {
                    }
                    boolean zM115214i7 = viewState.getIsUpdating();
                    boolean zM97444y7 = m97444y(r47);
                    float fM97401D7 = m97401D(interfaceC28670t2M30588b8);
                    if (viewState.getPlayShimmer()) {
                        z28 = true;
                    } else {
                        z28 = true;
                    }
                    boolean zM115209d7 = viewState.getHighlightCounter();
                    EnumC35102h enumC35102hM97398A8 = m97398A(interfaceC28601c7);
                    C3733d1 c3733d1M11577e7 = AbstractC3788w0.m11577e(null, 3);
                    if (i38 != 4) {
                        z29 = true;
                    } else {
                        z29 = true;
                    }
                    if (i45 == 8388608) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    boolean z3110 = z34 | z29;
                    if ((i39 & 57344) == 16384) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    zM87157i = z3110 | z35 | c28655q4.m87157i(interfaceC29805a);
                    objM87133R12 = c28655q4.m87133R();
                    if (zM87157i) {
                        objM87133R12 = new C27198e((Object) viewState, function13, (Object) interfaceC4351m3, (Object) interfaceC29805a, 12);
                        c28655q4.m87172p0(objM87133R12);
                    } else {
                        objM87133R12 = new C27198e((Object) viewState, function13, (Object) interfaceC4351m3, (Object) interfaceC29805a, 12);
                        c28655q4.m87172p0(objM87133R12);
                    }
                    AbstractC35097c.m111000c(modifierM3390l7, iM115207b7, z37, fM97401D7, zM115214i7, zM97444y7, z28, zM115209d7, enumC35102hM97398A8, interfaceC4339a1112, c3733d1M11577e7, (InterfaceC4339a) objM87133R12, c28655q4, (i39 << 21) & 1879048192, 6, 0);
                    c28655q = c28655q4;
                    c28655q.m87173q(true);
                    function7 = function13;
                    function5 = function12;
                    interfaceC4339a5 = interfaceC4339a1112;
                    z16 = z14;
                    interfaceC4351m2 = interfaceC4351m3;
                    interfaceC4339a4 = interfaceC4339a1115;
                    function6 = function9;
                } else {
                    c28655q = c28655q5;
                    c28655q.m87138X();
                    interfaceC4351m2 = interfaceC4351m;
                    interfaceC4339a4 = interfaceC4339a2;
                    z16 = z14;
                    interfaceC4339a5 = interfaceC4339a3;
                    function5 = function4;
                    function6 = function2;
                    function7 = function3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C1025j0(viewState, z16, interfaceC4339a5, function5, interfaceC4351m2, function6, interfaceC4339a4, function7, list, z13, i13, i14);
                }
            }
            i15 |= 24576;
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q5.m87157i(function2)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i27;
            }
            i28 = i14 & 64;
            if (i28 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q5.m87157i(interfaceC4339a2)) {
                    i29 = 1048576;
                } else {
                    i29 = 524288;
                }
                i15 |= i29;
            }
            i34 = i14 & 128;
            if (i34 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c28655q5.m87157i(function3)) {
                    i35 = 8388608;
                } else {
                    i35 = 4194304;
                }
                i15 |= i35;
            }
            if ((i13 & 100663296) == 0) {
                if (c28655q5.m87157i(list)) {
                    i47 = 67108864;
                } else {
                    i47 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i47;
            }
            if ((i13 & 805306368) == 0) {
                if (c28655q5.m87155h(z13)) {
                    i46 = 536870912;
                } else {
                    i46 = 268435456;
                }
                i15 |= i46;
            }
            if ((i15 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q5.m87135U(i15 & 1, z15)) {
                if (i48 != 0) {
                    z14 = false;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R18 = c28655q5.m87133R();
                    if (objM87133R18 == c28676v0) {
                        objM87133R18 = new C31469a(3);
                        c28655q5.m87172p0(objM87133R18);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R18;
                } else {
                    interfaceC4339a6 = interfaceC4339a3;
                }
                if (i18 != 0) {
                    objM87133R17 = c28655q5.m87133R();
                    if (objM87133R17 == c28676v0) {
                        objM87133R17 = new C30985h(28);
                        c28655q5.m87172p0(objM87133R17);
                    }
                    function8 = (Function1) objM87133R17;
                } else {
                    function8 = function4;
                }
                if (i24 != 0) {
                    objM87133R16 = c28655q5.m87133R();
                    if (objM87133R16 == c28676v0) {
                        objM87133R16 = new C31314a(7);
                        c28655q5.m87172p0(objM87133R16);
                    }
                    interfaceC4351m3 = (InterfaceC4351m) objM87133R16;
                } else {
                    interfaceC4351m3 = interfaceC4351m;
                }
                if (i26 != 0) {
                    objM87133R15 = c28655q5.m87133R();
                    if (objM87133R15 == c28676v0) {
                        objM87133R15 = new C30985h(29);
                        c28655q5.m87172p0(objM87133R15);
                    }
                    function9 = (Function1) objM87133R15;
                } else {
                    function9 = function2;
                }
                if (i28 != 0) {
                    objM87133R14 = c28655q5.m87133R();
                    if (objM87133R14 == c28676v0) {
                        objM87133R14 = new C31469a(4);
                        c28655q5.m87172p0(objM87133R14);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R14;
                } else {
                    interfaceC4339a7 = interfaceC4339a2;
                }
                if (i34 != 0) {
                    objM87133R13 = c28655q5.m87133R();
                    if (objM87133R13 == c28676v0) {
                        objM87133R13 = new C31593g(0);
                        c28655q5.m87172p0(objM87133R13);
                    }
                    function10 = (Function1) objM87133R13;
                } else {
                    function10 = function3;
                }
                objM87133R = c28655q5.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                    c28655q5.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q5.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q5.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q5.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q5.m87172p0(objM87133R3);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                InterfaceC4339a interfaceC4339a1116 = interfaceC4339a6;
                objM87133R4 = c28655q5.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC31061c.m95647w(z13, c28655q5);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                objM87133R5 = c28655q5.m87133R();
                function11 = function8;
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new a(interfaceC28601c1, interfaceC28601c2, interfaceC28601c3, null);
                    c28655q5.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                if (m97441v(interfaceC28601c4)) {
                    c28655q5.m87150e0(1660299335);
                    if (list == null) {
                        c28655q5.m87150e0(-70328166);
                        c28655q5.m87173q(false);
                        c28655q2 = c28655q5;
                        i36 = 1048576;
                        i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        z17 = false;
                        interfaceC28601c5 = interfaceC28601c2;
                    } else {
                        c28655q5.m87150e0(-70328165);
                        boolean zM97413P8 = m97413P(interfaceC28601c1);
                        C3733d1 c3733d8 = AbstractC3730c1.f15251a;
                        C3739f1 c3739f1M11563a8 = AbstractC3788w0.m11584l(AbstractC11348f.m30574v(ErrorCodes.TracksErrors.cGenericTrack, 0, null, 6), C2299e.f9107J, null, 12).m11563a(AbstractC3788w0.m11578f(AbstractC11348f.m30574v(ErrorCodes.TracksErrors.cGenericTrack, 0, null, 6), 2));
                        C37816b c37816bM121344e8 = AbstractC37817c.m121344e(2039574871, c28655q5, new C26949h(viewState, list, function9, 13));
                        i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        z17 = false;
                        i36 = 1048576;
                        interfaceC28601c5 = interfaceC28601c2;
                        AbstractC1090b.m3351f(zM97413P8, null, c3733d8, c3739f1M11563a8, null, c37816bM121344e8, c28655q5, 199680, 18);
                        c28655q2 = c28655q5;
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z17);
                } else {
                    c28655q2 = c28655q5;
                    z14 = z14;
                    interfaceC4351m3 = interfaceC4351m3;
                    interfaceC28601c3 = interfaceC28601c3;
                    interfaceC28601c5 = interfaceC28601c2;
                    i36 = 1048576;
                    z17 = false;
                    i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    c28655q2.m87150e0(-69524583);
                    c28655q2.m87173q(false);
                }
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R6);
                }
                interfaceC28601c6 = (InterfaceC28601c1) objM87133R6;
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC28683x.m87272z(EnumC35102h.NORMAL);
                    c28655q2.m87172p0(objM87133R7);
                }
                interfaceC28601c7 = (InterfaceC28601c1) objM87133R7;
                interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                i38 = i15 & 14;
                if (i38 != 4) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if ((i15 & 3670016) == i36) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z3111 = z18 | z19;
                if ((i15 & 7168) == i37) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = z3111 | z24;
                objM87133R8 = c28655q2.m87133R();
                if (z25) {
                    InterfaceC4339a interfaceC4339a1117 = interfaceC4339a7;
                    objM87133R8 = new b(viewState, interfaceC4339a1117, function11, interfaceC28601c6, null);
                    interfaceC4339a8 = interfaceC4339a1117;
                    function12 = function11;
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    InterfaceC4339a interfaceC4339a1118 = interfaceC4339a7;
                    objM87133R8 = new b(viewState, interfaceC4339a1118, function11, interfaceC28601c6, null);
                    interfaceC4339a8 = interfaceC4339a1118;
                    function12 = function11;
                    c28655q2.m87172p0(objM87133R8);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, viewState);
                enumC35102hM97398A = m97398A(interfaceC28601c7);
                enumC35102h = EnumC35102h.NORMAL;
                f13 = 0.0f;
                if (enumC35102hM97398A == enumC35102h) {
                    f14 = 0.0f;
                } else {
                    f14 = -90.0f;
                }
                i39 = i15;
                interfaceC28601c8 = interfaceC28601c5;
                float f112 = f14;
                InterfaceC4339a interfaceC4339a1119 = interfaceC4339a8;
                C11347e2 c11347e2M30574v15 = AbstractC11348f.m30574v(500, 0, null, 6);
                objM87133R9 = c28655q2.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = new C1024j(7, interfaceC28601c7, interfaceC28601c6);
                    c28655q2.m87172p0(objM87133R9);
                }
                InterfaceC28670t2 interfaceC28670t2M30588b9 = AbstractC11352g.m30588b(f112, c11347e2M30574v15, "itemRotationAnimation", (Function1) objM87133R9, c28655q2, 27696, 4);
                if (m97398A(interfaceC28601c7) != enumC35102h) {
                    f13 = 1.0f;
                }
                C11347e2 c11347e2M30574v16 = AbstractC11348f.m30574v(500, 0, null, 6);
                objM87133R10 = c28655q2.m87133R();
                if (objM87133R10 == c28676v0) {
                    objM87133R10 = new C1024j(8, r47, interfaceC28601c7);
                    c28655q2.m87172p0(objM87133R10);
                }
                interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v16, "replayButtonOffsetAnimation", (Function1) objM87133R10, c28655q2, 27696, 4);
                fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).mo743q0(4 * 35);
                if (viewState.getCardStackSize() > 0) {
                    i44 = 1;
                } else {
                    i44 = 0;
                }
                InterfaceC28670t2 interfaceC28670t2M30587a8 = AbstractC11352g.m30587a(i44 * 8, null, "counterPaddingAnimation", c28655q2, 384, 10);
                C2314t c2314t8 = C2314t.f9131w;
                Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t8);
                InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                InterfaceC28601c1 interfaceC28601c16 = interfaceC28601c3;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM3409f8);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d8);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m8);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N8);
                if (viewState.getCardStackSize() == 0) {
                    z26 = false;
                    c28655q2.m87150e0(-512086241);
                    c28655q2.m87173q(false);
                    c28655q3 = c28655q2;
                } else {
                    z26 = false;
                    c28655q2.m87150e0(-512086241);
                    c28655q2.m87173q(false);
                    c28655q3 = c28655q2;
                }
                InterfaceC16556w interfaceC16556wM115208c8 = viewState.getCardToDisplay();
                if (m97437r(interfaceC28601c8)) {
                    interfaceC16556wM115211f = viewState.getNextCard();
                } else {
                    interfaceC16556wM115211f = viewState.getNextCard();
                }
                if (m97437r(interfaceC28601c8)) {
                    z27 = true;
                } else {
                    z27 = true;
                }
                c28655q4 = c28655q3;
                i45 = i39 & 29360128;
                function13 = function10;
                AbstractC31592f.m97385i(interfaceC16556wM115208c8, interfaceC16556wM115211f, viewState.getCardStackSize(), z27, function9, interfaceC4351m3, viewState.getNotificationCardDismissAnimation(), function13, c28655q4, ((i39 >> 3) & 57344) | ((i39 << 3) & 458752) | i45, 0);
                Modifier modifierM3398t8 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t8, C2299e.f9116y), 0.0f, 0.0f, m97405H(interfaceC28670t2M30587a8), 0.0f, 11);
                zM87147d = c28655q4.m87147d(fMo743q0) | c28655q4.m87153g(interfaceC28670t2M30588b);
                objM87133R11 = c28655q4.m87133R();
                if (zM87147d) {
                    objM87133R11 = new C2928d(fMo743q0, interfaceC28670t2M30588b, 1);
                    c28655q4.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new C2928d(fMo743q0, interfaceC28670t2M30588b, 1);
                    c28655q4.m87172p0(objM87133R11);
                }
                Modifier modifierM3390l8 = AbstractC1099a.m3390l(modifierM3398t8, (Function1) objM87133R11);
                int iM115207b8 = viewState.getCardStackSize();
                if (m97398A(interfaceC28601c7) != enumC35102h) {
                }
                boolean zM115214i8 = viewState.getIsUpdating();
                boolean zM97444y8 = m97444y(r47);
                float fM97401D8 = m97401D(interfaceC28670t2M30588b9);
                if (viewState.getPlayShimmer()) {
                    z28 = true;
                } else {
                    z28 = true;
                }
                boolean zM115209d8 = viewState.getHighlightCounter();
                EnumC35102h enumC35102hM97398A9 = m97398A(interfaceC28601c7);
                C3733d1 c3733d1M11577e8 = AbstractC3788w0.m11577e(null, 3);
                if (i38 != 4) {
                    z29 = true;
                } else {
                    z29 = true;
                }
                if (i45 == 8388608) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                boolean z3112 = z34 | z29;
                if ((i39 & 57344) == 16384) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                zM87157i = z3112 | z35 | c28655q4.m87157i(interfaceC29805a);
                objM87133R12 = c28655q4.m87133R();
                if (zM87157i) {
                    objM87133R12 = new C27198e((Object) viewState, function13, (Object) interfaceC4351m3, (Object) interfaceC29805a, 12);
                    c28655q4.m87172p0(objM87133R12);
                } else {
                    objM87133R12 = new C27198e((Object) viewState, function13, (Object) interfaceC4351m3, (Object) interfaceC29805a, 12);
                    c28655q4.m87172p0(objM87133R12);
                }
                AbstractC35097c.m111000c(modifierM3390l8, iM115207b8, z37, fM97401D8, zM115214i8, zM97444y8, z28, zM115209d8, enumC35102hM97398A9, interfaceC4339a1116, c3733d1M11577e8, (InterfaceC4339a) objM87133R12, c28655q4, (i39 << 21) & 1879048192, 6, 0);
                c28655q = c28655q4;
                c28655q.m87173q(true);
                function7 = function13;
                function5 = function12;
                interfaceC4339a5 = interfaceC4339a1116;
                z16 = z14;
                interfaceC4351m2 = interfaceC4351m3;
                interfaceC4339a4 = interfaceC4339a1119;
                function6 = function9;
            } else {
                c28655q = c28655q5;
                c28655q.m87138X();
                interfaceC4351m2 = interfaceC4351m;
                interfaceC4339a4 = interfaceC4339a2;
                z16 = z14;
                interfaceC4339a5 = interfaceC4339a3;
                function5 = function4;
                function6 = function2;
                function7 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C1025j0(viewState, z16, interfaceC4339a5, function5, interfaceC4351m2, function6, interfaceC4339a4, function7, list, z13, i13, i14);
            }
        }
        i15 |= 48;
        z14 = z4;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a3 = interfaceC4339a;
                if (c28655q5.m87157i(interfaceC4339a3)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function4 = function1;
                    if (c28655q5.m87157i(function4)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        if (c28655q5.m87157i(interfaceC4351m)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q5.m87157i(function2)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                    i28 = i14 & 64;
                    if (i28 != 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (c28655q5.m87157i(interfaceC4339a2)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i15 |= i29;
                    }
                    i34 = i14 & 128;
                    if (i34 != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (c28655q5.m87157i(function3)) {
                            i35 = 8388608;
                        } else {
                            i35 = 4194304;
                        }
                        i15 |= i35;
                    }
                    if ((i13 & 100663296) == 0) {
                        if (c28655q5.m87157i(list)) {
                            i47 = 67108864;
                        } else {
                            i47 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i15 |= i47;
                    }
                    if ((i13 & 805306368) == 0) {
                        if (c28655q5.m87155h(z13)) {
                            i46 = 536870912;
                        } else {
                            i46 = 268435456;
                        }
                        i15 |= i46;
                    }
                    if ((i15 & 306783379) != 306783378) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c28655q5.m87135U(i15 & 1, z15)) {
                        if (i48 != 0) {
                            z14 = false;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R18 = c28655q5.m87133R();
                            if (objM87133R18 == c28676v0) {
                                objM87133R18 = new C31469a(3);
                                c28655q5.m87172p0(objM87133R18);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R18;
                        } else {
                            interfaceC4339a6 = interfaceC4339a3;
                        }
                        if (i18 != 0) {
                            objM87133R17 = c28655q5.m87133R();
                            if (objM87133R17 == c28676v0) {
                                objM87133R17 = new C30985h(28);
                                c28655q5.m87172p0(objM87133R17);
                            }
                            function8 = (Function1) objM87133R17;
                        } else {
                            function8 = function4;
                        }
                        if (i24 != 0) {
                            objM87133R16 = c28655q5.m87133R();
                            if (objM87133R16 == c28676v0) {
                                objM87133R16 = new C31314a(7);
                                c28655q5.m87172p0(objM87133R16);
                            }
                            interfaceC4351m3 = (InterfaceC4351m) objM87133R16;
                        } else {
                            interfaceC4351m3 = interfaceC4351m;
                        }
                        if (i26 != 0) {
                            objM87133R15 = c28655q5.m87133R();
                            if (objM87133R15 == c28676v0) {
                                objM87133R15 = new C30985h(29);
                                c28655q5.m87172p0(objM87133R15);
                            }
                            function9 = (Function1) objM87133R15;
                        } else {
                            function9 = function2;
                        }
                        if (i28 != 0) {
                            objM87133R14 = c28655q5.m87133R();
                            if (objM87133R14 == c28676v0) {
                                objM87133R14 = new C31469a(4);
                                c28655q5.m87172p0(objM87133R14);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R14;
                        } else {
                            interfaceC4339a7 = interfaceC4339a2;
                        }
                        if (i34 != 0) {
                            objM87133R13 = c28655q5.m87133R();
                            if (objM87133R13 == c28676v0) {
                                objM87133R13 = new C31593g(0);
                                c28655q5.m87172p0(objM87133R13);
                            }
                            function10 = (Function1) objM87133R13;
                        } else {
                            function10 = function3;
                        }
                        objM87133R = c28655q5.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                            c28655q5.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        objM87133R2 = c28655q5.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q5.m87172p0(objM87133R2);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                        objM87133R3 = c28655q5.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q5.m87172p0(objM87133R3);
                        }
                        interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                        InterfaceC4339a interfaceC4339a11110 = interfaceC4339a6;
                        objM87133R4 = c28655q5.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC31061c.m95647w(z13, c28655q5);
                        }
                        interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                        objM87133R5 = c28655q5.m87133R();
                        function11 = function8;
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new a(interfaceC28601c1, interfaceC28601c2, interfaceC28601c3, null);
                            c28655q5.m87172p0(objM87133R5);
                        }
                        AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                        if (m97441v(interfaceC28601c4)) {
                            c28655q5.m87150e0(1660299335);
                            if (list == null) {
                                c28655q5.m87150e0(-70328166);
                                c28655q5.m87173q(false);
                                c28655q2 = c28655q5;
                                i36 = 1048576;
                                i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                                z17 = false;
                                interfaceC28601c5 = interfaceC28601c2;
                            } else {
                                c28655q5.m87150e0(-70328165);
                                boolean zM97413P9 = m97413P(interfaceC28601c1);
                                C3733d1 c3733d9 = AbstractC3730c1.f15251a;
                                C3739f1 c3739f1M11563a9 = AbstractC3788w0.m11584l(AbstractC11348f.m30574v(ErrorCodes.TracksErrors.cGenericTrack, 0, null, 6), C2299e.f9107J, null, 12).m11563a(AbstractC3788w0.m11578f(AbstractC11348f.m30574v(ErrorCodes.TracksErrors.cGenericTrack, 0, null, 6), 2));
                                C37816b c37816bM121344e9 = AbstractC37817c.m121344e(2039574871, c28655q5, new C26949h(viewState, list, function9, 13));
                                i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                                z17 = false;
                                i36 = 1048576;
                                interfaceC28601c5 = interfaceC28601c2;
                                AbstractC1090b.m3351f(zM97413P9, null, c3733d9, c3739f1M11563a9, null, c37816bM121344e9, c28655q5, 199680, 18);
                                c28655q2 = c28655q5;
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(z17);
                        } else {
                            c28655q2 = c28655q5;
                            z14 = z14;
                            interfaceC4351m3 = interfaceC4351m3;
                            interfaceC28601c3 = interfaceC28601c3;
                            interfaceC28601c5 = interfaceC28601c2;
                            i36 = 1048576;
                            z17 = false;
                            i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            c28655q2.m87150e0(-69524583);
                            c28655q2.m87173q(false);
                        }
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC28601c6 = (InterfaceC28601c1) objM87133R6;
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = AbstractC28683x.m87272z(EnumC35102h.NORMAL);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        interfaceC28601c7 = (InterfaceC28601c1) objM87133R7;
                        interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                        i38 = i15 & 14;
                        if (i38 != 4) {
                            z18 = true;
                        } else {
                            z18 = true;
                        }
                        if ((i15 & 3670016) == i36) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean z3113 = z18 | z19;
                        if ((i15 & 7168) == i37) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = z3113 | z24;
                        objM87133R8 = c28655q2.m87133R();
                        if (z25) {
                            InterfaceC4339a interfaceC4339a11111 = interfaceC4339a7;
                            objM87133R8 = new b(viewState, interfaceC4339a11111, function11, interfaceC28601c6, null);
                            interfaceC4339a8 = interfaceC4339a11111;
                            function12 = function11;
                            c28655q2.m87172p0(objM87133R8);
                        } else {
                            InterfaceC4339a interfaceC4339a11112 = interfaceC4339a7;
                            objM87133R8 = new b(viewState, interfaceC4339a11112, function11, interfaceC28601c6, null);
                            interfaceC4339a8 = interfaceC4339a11112;
                            function12 = function11;
                            c28655q2.m87172p0(objM87133R8);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, viewState);
                        enumC35102hM97398A = m97398A(interfaceC28601c7);
                        enumC35102h = EnumC35102h.NORMAL;
                        f13 = 0.0f;
                        if (enumC35102hM97398A == enumC35102h) {
                            f14 = 0.0f;
                        } else {
                            f14 = -90.0f;
                        }
                        i39 = i15;
                        interfaceC28601c8 = interfaceC28601c5;
                        float f113 = f14;
                        InterfaceC4339a interfaceC4339a11113 = interfaceC4339a8;
                        C11347e2 c11347e2M30574v17 = AbstractC11348f.m30574v(500, 0, null, 6);
                        objM87133R9 = c28655q2.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C1024j(7, interfaceC28601c7, interfaceC28601c6);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        InterfaceC28670t2 interfaceC28670t2M30588b10 = AbstractC11352g.m30588b(f113, c11347e2M30574v17, "itemRotationAnimation", (Function1) objM87133R9, c28655q2, 27696, 4);
                        if (m97398A(interfaceC28601c7) != enumC35102h) {
                            f13 = 1.0f;
                        }
                        C11347e2 c11347e2M30574v18 = AbstractC11348f.m30574v(500, 0, null, 6);
                        objM87133R10 = c28655q2.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C1024j(8, r47, interfaceC28601c7);
                            c28655q2.m87172p0(objM87133R10);
                        }
                        interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v18, "replayButtonOffsetAnimation", (Function1) objM87133R10, c28655q2, 27696, 4);
                        fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).mo743q0(4 * 35);
                        if (viewState.getCardStackSize() > 0) {
                            i44 = 1;
                        } else {
                            i44 = 0;
                        }
                        InterfaceC28670t2 interfaceC28670t2M30587a9 = AbstractC11352g.m30587a(i44 * 8, null, "counterPaddingAnimation", c28655q2, 384, 10);
                        C2314t c2314t9 = C2314t.f9131w;
                        Modifier modifierM3409f9 = AbstractC1102d.m3409f(1.0f, c2314t9);
                        InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        InterfaceC28601c1 interfaceC28601c17 = interfaceC28601c3;
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                        Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM3409f9);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d9);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m9);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N9);
                        if (viewState.getCardStackSize() == 0) {
                            z26 = false;
                            c28655q2.m87150e0(-512086241);
                            c28655q2.m87173q(false);
                            c28655q3 = c28655q2;
                        } else {
                            z26 = false;
                            c28655q2.m87150e0(-512086241);
                            c28655q2.m87173q(false);
                            c28655q3 = c28655q2;
                        }
                        InterfaceC16556w interfaceC16556wM115208c9 = viewState.getCardToDisplay();
                        if (m97437r(interfaceC28601c8)) {
                            interfaceC16556wM115211f = viewState.getNextCard();
                        } else {
                            interfaceC16556wM115211f = viewState.getNextCard();
                        }
                        if (m97437r(interfaceC28601c8)) {
                            z27 = true;
                        } else {
                            z27 = true;
                        }
                        c28655q4 = c28655q3;
                        i45 = i39 & 29360128;
                        function13 = function10;
                        AbstractC31592f.m97385i(interfaceC16556wM115208c9, interfaceC16556wM115211f, viewState.getCardStackSize(), z27, function9, interfaceC4351m3, viewState.getNotificationCardDismissAnimation(), function13, c28655q4, ((i39 >> 3) & 57344) | ((i39 << 3) & 458752) | i45, 0);
                        Modifier modifierM3398t9 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t9, C2299e.f9116y), 0.0f, 0.0f, m97405H(interfaceC28670t2M30587a9), 0.0f, 11);
                        zM87147d = c28655q4.m87147d(fMo743q0) | c28655q4.m87153g(interfaceC28670t2M30588b);
                        objM87133R11 = c28655q4.m87133R();
                        if (zM87147d) {
                            objM87133R11 = new C2928d(fMo743q0, interfaceC28670t2M30588b, 1);
                            c28655q4.m87172p0(objM87133R11);
                        } else {
                            objM87133R11 = new C2928d(fMo743q0, interfaceC28670t2M30588b, 1);
                            c28655q4.m87172p0(objM87133R11);
                        }
                        Modifier modifierM3390l9 = AbstractC1099a.m3390l(modifierM3398t9, (Function1) objM87133R11);
                        int iM115207b9 = viewState.getCardStackSize();
                        if (m97398A(interfaceC28601c7) != enumC35102h) {
                        }
                        boolean zM115214i9 = viewState.getIsUpdating();
                        boolean zM97444y9 = m97444y(r47);
                        float fM97401D9 = m97401D(interfaceC28670t2M30588b10);
                        if (viewState.getPlayShimmer()) {
                            z28 = true;
                        } else {
                            z28 = true;
                        }
                        boolean zM115209d9 = viewState.getHighlightCounter();
                        EnumC35102h enumC35102hM97398A10 = m97398A(interfaceC28601c7);
                        C3733d1 c3733d1M11577e9 = AbstractC3788w0.m11577e(null, 3);
                        if (i38 != 4) {
                            z29 = true;
                        } else {
                            z29 = true;
                        }
                        if (i45 == 8388608) {
                            z34 = true;
                        } else {
                            z34 = false;
                        }
                        boolean z3114 = z34 | z29;
                        if ((i39 & 57344) == 16384) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        zM87157i = z3114 | z35 | c28655q4.m87157i(interfaceC29805a);
                        objM87133R12 = c28655q4.m87133R();
                        if (zM87157i) {
                            objM87133R12 = new C27198e((Object) viewState, function13, (Object) interfaceC4351m3, (Object) interfaceC29805a, 12);
                            c28655q4.m87172p0(objM87133R12);
                        } else {
                            objM87133R12 = new C27198e((Object) viewState, function13, (Object) interfaceC4351m3, (Object) interfaceC29805a, 12);
                            c28655q4.m87172p0(objM87133R12);
                        }
                        AbstractC35097c.m111000c(modifierM3390l9, iM115207b9, z37, fM97401D9, zM115214i9, zM97444y9, z28, zM115209d9, enumC35102hM97398A10, interfaceC4339a11110, c3733d1M11577e9, (InterfaceC4339a) objM87133R12, c28655q4, (i39 << 21) & 1879048192, 6, 0);
                        c28655q = c28655q4;
                        c28655q.m87173q(true);
                        function7 = function13;
                        function5 = function12;
                        interfaceC4339a5 = interfaceC4339a11110;
                        z16 = z14;
                        interfaceC4351m2 = interfaceC4351m3;
                        interfaceC4339a4 = interfaceC4339a11113;
                        function6 = function9;
                    } else {
                        c28655q = c28655q5;
                        c28655q.m87138X();
                        interfaceC4351m2 = interfaceC4351m;
                        interfaceC4339a4 = interfaceC4339a2;
                        z16 = z14;
                        interfaceC4339a5 = interfaceC4339a3;
                        function5 = function4;
                        function6 = function2;
                        function7 = function3;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C1025j0(viewState, z16, interfaceC4339a5, function5, interfaceC4351m2, function6, interfaceC4339a4, function7, list, z13, i13, i14);
                    }
                }
                i15 |= 24576;
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q5.m87157i(function2)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                i28 = i14 & 64;
                if (i28 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c28655q5.m87157i(interfaceC4339a2)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i15 |= i29;
                }
                i34 = i14 & 128;
                if (i34 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c28655q5.m87157i(function3)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i15 |= i35;
                }
                if ((i13 & 100663296) == 0) {
                    if (c28655q5.m87157i(list)) {
                        i47 = 67108864;
                    } else {
                        i47 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i47;
                }
                if ((i13 & 805306368) == 0) {
                    if (c28655q5.m87155h(z13)) {
                        i46 = 536870912;
                    } else {
                        i46 = 268435456;
                    }
                    i15 |= i46;
                }
                if ((i15 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q5.m87135U(i15 & 1, z15)) {
                    if (i48 != 0) {
                        z14 = false;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R18 = c28655q5.m87133R();
                        if (objM87133R18 == c28676v0) {
                            objM87133R18 = new C31469a(3);
                            c28655q5.m87172p0(objM87133R18);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R18;
                    } else {
                        interfaceC4339a6 = interfaceC4339a3;
                    }
                    if (i18 != 0) {
                        objM87133R17 = c28655q5.m87133R();
                        if (objM87133R17 == c28676v0) {
                            objM87133R17 = new C30985h(28);
                            c28655q5.m87172p0(objM87133R17);
                        }
                        function8 = (Function1) objM87133R17;
                    } else {
                        function8 = function4;
                    }
                    if (i24 != 0) {
                        objM87133R16 = c28655q5.m87133R();
                        if (objM87133R16 == c28676v0) {
                            objM87133R16 = new C31314a(7);
                            c28655q5.m87172p0(objM87133R16);
                        }
                        interfaceC4351m3 = (InterfaceC4351m) objM87133R16;
                    } else {
                        interfaceC4351m3 = interfaceC4351m;
                    }
                    if (i26 != 0) {
                        objM87133R15 = c28655q5.m87133R();
                        if (objM87133R15 == c28676v0) {
                            objM87133R15 = new C30985h(29);
                            c28655q5.m87172p0(objM87133R15);
                        }
                        function9 = (Function1) objM87133R15;
                    } else {
                        function9 = function2;
                    }
                    if (i28 != 0) {
                        objM87133R14 = c28655q5.m87133R();
                        if (objM87133R14 == c28676v0) {
                            objM87133R14 = new C31469a(4);
                            c28655q5.m87172p0(objM87133R14);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R14;
                    } else {
                        interfaceC4339a7 = interfaceC4339a2;
                    }
                    if (i34 != 0) {
                        objM87133R13 = c28655q5.m87133R();
                        if (objM87133R13 == c28676v0) {
                            objM87133R13 = new C31593g(0);
                            c28655q5.m87172p0(objM87133R13);
                        }
                        function10 = (Function1) objM87133R13;
                    } else {
                        function10 = function3;
                    }
                    objM87133R = c28655q5.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                        c28655q5.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q5.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q5.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R3);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                    InterfaceC4339a interfaceC4339a11114 = interfaceC4339a6;
                    objM87133R4 = c28655q5.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC31061c.m95647w(z13, c28655q5);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q5.m87133R();
                    function11 = function8;
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new a(interfaceC28601c1, interfaceC28601c2, interfaceC28601c3, null);
                        c28655q5.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                    if (m97441v(interfaceC28601c4)) {
                        c28655q5.m87150e0(1660299335);
                        if (list == null) {
                            c28655q5.m87150e0(-70328166);
                            c28655q5.m87173q(false);
                            c28655q2 = c28655q5;
                            i36 = 1048576;
                            i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            z17 = false;
                            interfaceC28601c5 = interfaceC28601c2;
                        } else {
                            c28655q5.m87150e0(-70328165);
                            boolean zM97413P10 = m97413P(interfaceC28601c1);
                            C3733d1 c3733d10 = AbstractC3730c1.f15251a;
                            C3739f1 c3739f1M11563a10 = AbstractC3788w0.m11584l(AbstractC11348f.m30574v(ErrorCodes.TracksErrors.cGenericTrack, 0, null, 6), C2299e.f9107J, null, 12).m11563a(AbstractC3788w0.m11578f(AbstractC11348f.m30574v(ErrorCodes.TracksErrors.cGenericTrack, 0, null, 6), 2));
                            C37816b c37816bM121344e10 = AbstractC37817c.m121344e(2039574871, c28655q5, new C26949h(viewState, list, function9, 13));
                            i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            z17 = false;
                            i36 = 1048576;
                            interfaceC28601c5 = interfaceC28601c2;
                            AbstractC1090b.m3351f(zM97413P10, null, c3733d10, c3739f1M11563a10, null, c37816bM121344e10, c28655q5, 199680, 18);
                            c28655q2 = c28655q5;
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z17);
                    } else {
                        c28655q2 = c28655q5;
                        z14 = z14;
                        interfaceC4351m3 = interfaceC4351m3;
                        interfaceC28601c3 = interfaceC28601c3;
                        interfaceC28601c5 = interfaceC28601c2;
                        i36 = 1048576;
                        z17 = false;
                        i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        c28655q2.m87150e0(-69524583);
                        c28655q2.m87173q(false);
                    }
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC28601c6 = (InterfaceC28601c1) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC28683x.m87272z(EnumC35102h.NORMAL);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    interfaceC28601c7 = (InterfaceC28601c1) objM87133R7;
                    interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                    i38 = i15 & 14;
                    if (i38 != 4) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    if ((i15 & 3670016) == i36) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z3115 = z18 | z19;
                    if ((i15 & 7168) == i37) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = z3115 | z24;
                    objM87133R8 = c28655q2.m87133R();
                    if (z25) {
                        InterfaceC4339a interfaceC4339a11115 = interfaceC4339a7;
                        objM87133R8 = new b(viewState, interfaceC4339a11115, function11, interfaceC28601c6, null);
                        interfaceC4339a8 = interfaceC4339a11115;
                        function12 = function11;
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        InterfaceC4339a interfaceC4339a11116 = interfaceC4339a7;
                        objM87133R8 = new b(viewState, interfaceC4339a11116, function11, interfaceC28601c6, null);
                        interfaceC4339a8 = interfaceC4339a11116;
                        function12 = function11;
                        c28655q2.m87172p0(objM87133R8);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, viewState);
                    enumC35102hM97398A = m97398A(interfaceC28601c7);
                    enumC35102h = EnumC35102h.NORMAL;
                    f13 = 0.0f;
                    if (enumC35102hM97398A == enumC35102h) {
                        f14 = 0.0f;
                    } else {
                        f14 = -90.0f;
                    }
                    i39 = i15;
                    interfaceC28601c8 = interfaceC28601c5;
                    float f114 = f14;
                    InterfaceC4339a interfaceC4339a11117 = interfaceC4339a8;
                    C11347e2 c11347e2M30574v19 = AbstractC11348f.m30574v(500, 0, null, 6);
                    objM87133R9 = c28655q2.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C1024j(7, interfaceC28601c7, interfaceC28601c6);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    InterfaceC28670t2 interfaceC28670t2M30588b11 = AbstractC11352g.m30588b(f114, c11347e2M30574v19, "itemRotationAnimation", (Function1) objM87133R9, c28655q2, 27696, 4);
                    if (m97398A(interfaceC28601c7) != enumC35102h) {
                        f13 = 1.0f;
                    }
                    C11347e2 c11347e2M30574v110 = AbstractC11348f.m30574v(500, 0, null, 6);
                    objM87133R10 = c28655q2.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C1024j(8, r47, interfaceC28601c7);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v110, "replayButtonOffsetAnimation", (Function1) objM87133R10, c28655q2, 27696, 4);
                    fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).mo743q0(4 * 35);
                    if (viewState.getCardStackSize() > 0) {
                        i44 = 1;
                    } else {
                        i44 = 0;
                    }
                    InterfaceC28670t2 interfaceC28670t2M30587a10 = AbstractC11352g.m30587a(i44 * 8, null, "counterPaddingAnimation", c28655q2, 384, 10);
                    C2314t c2314t10 = C2314t.f9131w;
                    Modifier modifierM3409f10 = AbstractC1102d.m3409f(1.0f, c2314t10);
                    InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    InterfaceC28601c1 interfaceC28601c18 = interfaceC28601c3;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierM3409f10);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d10);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m10);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N10);
                    if (viewState.getCardStackSize() == 0) {
                        z26 = false;
                        c28655q2.m87150e0(-512086241);
                        c28655q2.m87173q(false);
                        c28655q3 = c28655q2;
                    } else {
                        z26 = false;
                        c28655q2.m87150e0(-512086241);
                        c28655q2.m87173q(false);
                        c28655q3 = c28655q2;
                    }
                    InterfaceC16556w interfaceC16556wM115208c10 = viewState.getCardToDisplay();
                    if (m97437r(interfaceC28601c8)) {
                        interfaceC16556wM115211f = viewState.getNextCard();
                    } else {
                        interfaceC16556wM115211f = viewState.getNextCard();
                    }
                    if (m97437r(interfaceC28601c8)) {
                        z27 = true;
                    } else {
                        z27 = true;
                    }
                    c28655q4 = c28655q3;
                    i45 = i39 & 29360128;
                    function13 = function10;
                    AbstractC31592f.m97385i(interfaceC16556wM115208c10, interfaceC16556wM115211f, viewState.getCardStackSize(), z27, function9, interfaceC4351m3, viewState.getNotificationCardDismissAnimation(), function13, c28655q4, ((i39 >> 3) & 57344) | ((i39 << 3) & 458752) | i45, 0);
                    Modifier modifierM3398t10 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t10, C2299e.f9116y), 0.0f, 0.0f, m97405H(interfaceC28670t2M30587a10), 0.0f, 11);
                    zM87147d = c28655q4.m87147d(fMo743q0) | c28655q4.m87153g(interfaceC28670t2M30588b);
                    objM87133R11 = c28655q4.m87133R();
                    if (zM87147d) {
                        objM87133R11 = new C2928d(fMo743q0, interfaceC28670t2M30588b, 1);
                        c28655q4.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C2928d(fMo743q0, interfaceC28670t2M30588b, 1);
                        c28655q4.m87172p0(objM87133R11);
                    }
                    Modifier modifierM3390l10 = AbstractC1099a.m3390l(modifierM3398t10, (Function1) objM87133R11);
                    int iM115207b10 = viewState.getCardStackSize();
                    if (m97398A(interfaceC28601c7) != enumC35102h) {
                    }
                    boolean zM115214i10 = viewState.getIsUpdating();
                    boolean zM97444y10 = m97444y(r47);
                    float fM97401D10 = m97401D(interfaceC28670t2M30588b11);
                    if (viewState.getPlayShimmer()) {
                        z28 = true;
                    } else {
                        z28 = true;
                    }
                    boolean zM115209d10 = viewState.getHighlightCounter();
                    EnumC35102h enumC35102hM97398A11 = m97398A(interfaceC28601c7);
                    C3733d1 c3733d1M11577e10 = AbstractC3788w0.m11577e(null, 3);
                    if (i38 != 4) {
                        z29 = true;
                    } else {
                        z29 = true;
                    }
                    if (i45 == 8388608) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    boolean z3116 = z34 | z29;
                    if ((i39 & 57344) == 16384) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    zM87157i = z3116 | z35 | c28655q4.m87157i(interfaceC29805a);
                    objM87133R12 = c28655q4.m87133R();
                    if (zM87157i) {
                        objM87133R12 = new C27198e((Object) viewState, function13, (Object) interfaceC4351m3, (Object) interfaceC29805a, 12);
                        c28655q4.m87172p0(objM87133R12);
                    } else {
                        objM87133R12 = new C27198e((Object) viewState, function13, (Object) interfaceC4351m3, (Object) interfaceC29805a, 12);
                        c28655q4.m87172p0(objM87133R12);
                    }
                    AbstractC35097c.m111000c(modifierM3390l10, iM115207b10, z37, fM97401D10, zM115214i10, zM97444y10, z28, zM115209d10, enumC35102hM97398A11, interfaceC4339a11114, c3733d1M11577e10, (InterfaceC4339a) objM87133R12, c28655q4, (i39 << 21) & 1879048192, 6, 0);
                    c28655q = c28655q4;
                    c28655q.m87173q(true);
                    function7 = function13;
                    function5 = function12;
                    interfaceC4339a5 = interfaceC4339a11114;
                    z16 = z14;
                    interfaceC4351m2 = interfaceC4351m3;
                    interfaceC4339a4 = interfaceC4339a11117;
                    function6 = function9;
                } else {
                    c28655q = c28655q5;
                    c28655q.m87138X();
                    interfaceC4351m2 = interfaceC4351m;
                    interfaceC4339a4 = interfaceC4339a2;
                    z16 = z14;
                    interfaceC4339a5 = interfaceC4339a3;
                    function5 = function4;
                    function6 = function2;
                    function7 = function3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C1025j0(viewState, z16, interfaceC4339a5, function5, interfaceC4351m2, function6, interfaceC4339a4, function7, list, z13, i13, i14);
                }
            }
            i15 |= 3072;
            function4 = function1;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c28655q5.m87157i(interfaceC4351m)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q5.m87157i(function2)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                i28 = i14 & 64;
                if (i28 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c28655q5.m87157i(interfaceC4339a2)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i15 |= i29;
                }
                i34 = i14 & 128;
                if (i34 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c28655q5.m87157i(function3)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i15 |= i35;
                }
                if ((i13 & 100663296) == 0) {
                    if (c28655q5.m87157i(list)) {
                        i47 = 67108864;
                    } else {
                        i47 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i47;
                }
                if ((i13 & 805306368) == 0) {
                    if (c28655q5.m87155h(z13)) {
                        i46 = 536870912;
                    } else {
                        i46 = 268435456;
                    }
                    i15 |= i46;
                }
                if ((i15 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q5.m87135U(i15 & 1, z15)) {
                    if (i48 != 0) {
                        z14 = false;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R18 = c28655q5.m87133R();
                        if (objM87133R18 == c28676v0) {
                            objM87133R18 = new C31469a(3);
                            c28655q5.m87172p0(objM87133R18);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R18;
                    } else {
                        interfaceC4339a6 = interfaceC4339a3;
                    }
                    if (i18 != 0) {
                        objM87133R17 = c28655q5.m87133R();
                        if (objM87133R17 == c28676v0) {
                            objM87133R17 = new C30985h(28);
                            c28655q5.m87172p0(objM87133R17);
                        }
                        function8 = (Function1) objM87133R17;
                    } else {
                        function8 = function4;
                    }
                    if (i24 != 0) {
                        objM87133R16 = c28655q5.m87133R();
                        if (objM87133R16 == c28676v0) {
                            objM87133R16 = new C31314a(7);
                            c28655q5.m87172p0(objM87133R16);
                        }
                        interfaceC4351m3 = (InterfaceC4351m) objM87133R16;
                    } else {
                        interfaceC4351m3 = interfaceC4351m;
                    }
                    if (i26 != 0) {
                        objM87133R15 = c28655q5.m87133R();
                        if (objM87133R15 == c28676v0) {
                            objM87133R15 = new C30985h(29);
                            c28655q5.m87172p0(objM87133R15);
                        }
                        function9 = (Function1) objM87133R15;
                    } else {
                        function9 = function2;
                    }
                    if (i28 != 0) {
                        objM87133R14 = c28655q5.m87133R();
                        if (objM87133R14 == c28676v0) {
                            objM87133R14 = new C31469a(4);
                            c28655q5.m87172p0(objM87133R14);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R14;
                    } else {
                        interfaceC4339a7 = interfaceC4339a2;
                    }
                    if (i34 != 0) {
                        objM87133R13 = c28655q5.m87133R();
                        if (objM87133R13 == c28676v0) {
                            objM87133R13 = new C31593g(0);
                            c28655q5.m87172p0(objM87133R13);
                        }
                        function10 = (Function1) objM87133R13;
                    } else {
                        function10 = function3;
                    }
                    objM87133R = c28655q5.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                        c28655q5.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q5.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q5.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R3);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                    InterfaceC4339a interfaceC4339a11118 = interfaceC4339a6;
                    objM87133R4 = c28655q5.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC31061c.m95647w(z13, c28655q5);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q5.m87133R();
                    function11 = function8;
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new a(interfaceC28601c1, interfaceC28601c2, interfaceC28601c3, null);
                        c28655q5.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                    if (m97441v(interfaceC28601c4)) {
                        c28655q5.m87150e0(1660299335);
                        if (list == null) {
                            c28655q5.m87150e0(-70328166);
                            c28655q5.m87173q(false);
                            c28655q2 = c28655q5;
                            i36 = 1048576;
                            i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            z17 = false;
                            interfaceC28601c5 = interfaceC28601c2;
                        } else {
                            c28655q5.m87150e0(-70328165);
                            boolean zM97413P11 = m97413P(interfaceC28601c1);
                            C3733d1 c3733d11 = AbstractC3730c1.f15251a;
                            C3739f1 c3739f1M11563a11 = AbstractC3788w0.m11584l(AbstractC11348f.m30574v(ErrorCodes.TracksErrors.cGenericTrack, 0, null, 6), C2299e.f9107J, null, 12).m11563a(AbstractC3788w0.m11578f(AbstractC11348f.m30574v(ErrorCodes.TracksErrors.cGenericTrack, 0, null, 6), 2));
                            C37816b c37816bM121344e11 = AbstractC37817c.m121344e(2039574871, c28655q5, new C26949h(viewState, list, function9, 13));
                            i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            z17 = false;
                            i36 = 1048576;
                            interfaceC28601c5 = interfaceC28601c2;
                            AbstractC1090b.m3351f(zM97413P11, null, c3733d11, c3739f1M11563a11, null, c37816bM121344e11, c28655q5, 199680, 18);
                            c28655q2 = c28655q5;
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z17);
                    } else {
                        c28655q2 = c28655q5;
                        z14 = z14;
                        interfaceC4351m3 = interfaceC4351m3;
                        interfaceC28601c3 = interfaceC28601c3;
                        interfaceC28601c5 = interfaceC28601c2;
                        i36 = 1048576;
                        z17 = false;
                        i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        c28655q2.m87150e0(-69524583);
                        c28655q2.m87173q(false);
                    }
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC28601c6 = (InterfaceC28601c1) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC28683x.m87272z(EnumC35102h.NORMAL);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    interfaceC28601c7 = (InterfaceC28601c1) objM87133R7;
                    interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                    i38 = i15 & 14;
                    if (i38 != 4) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    if ((i15 & 3670016) == i36) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z3117 = z18 | z19;
                    if ((i15 & 7168) == i37) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = z3117 | z24;
                    objM87133R8 = c28655q2.m87133R();
                    if (z25) {
                        InterfaceC4339a interfaceC4339a11119 = interfaceC4339a7;
                        objM87133R8 = new b(viewState, interfaceC4339a11119, function11, interfaceC28601c6, null);
                        interfaceC4339a8 = interfaceC4339a11119;
                        function12 = function11;
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        InterfaceC4339a interfaceC4339a111110 = interfaceC4339a7;
                        objM87133R8 = new b(viewState, interfaceC4339a111110, function11, interfaceC28601c6, null);
                        interfaceC4339a8 = interfaceC4339a111110;
                        function12 = function11;
                        c28655q2.m87172p0(objM87133R8);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, viewState);
                    enumC35102hM97398A = m97398A(interfaceC28601c7);
                    enumC35102h = EnumC35102h.NORMAL;
                    f13 = 0.0f;
                    if (enumC35102hM97398A == enumC35102h) {
                        f14 = 0.0f;
                    } else {
                        f14 = -90.0f;
                    }
                    i39 = i15;
                    interfaceC28601c8 = interfaceC28601c5;
                    float f115 = f14;
                    InterfaceC4339a interfaceC4339a111111 = interfaceC4339a8;
                    C11347e2 c11347e2M30574v111 = AbstractC11348f.m30574v(500, 0, null, 6);
                    objM87133R9 = c28655q2.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C1024j(7, interfaceC28601c7, interfaceC28601c6);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    InterfaceC28670t2 interfaceC28670t2M30588b12 = AbstractC11352g.m30588b(f115, c11347e2M30574v111, "itemRotationAnimation", (Function1) objM87133R9, c28655q2, 27696, 4);
                    if (m97398A(interfaceC28601c7) != enumC35102h) {
                        f13 = 1.0f;
                    }
                    C11347e2 c11347e2M30574v112 = AbstractC11348f.m30574v(500, 0, null, 6);
                    objM87133R10 = c28655q2.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C1024j(8, r47, interfaceC28601c7);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v112, "replayButtonOffsetAnimation", (Function1) objM87133R10, c28655q2, 27696, 4);
                    fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).mo743q0(4 * 35);
                    if (viewState.getCardStackSize() > 0) {
                        i44 = 1;
                    } else {
                        i44 = 0;
                    }
                    InterfaceC28670t2 interfaceC28670t2M30587a11 = AbstractC11352g.m30587a(i44 * 8, null, "counterPaddingAnimation", c28655q2, 384, 10);
                    C2314t c2314t11 = C2314t.f9131w;
                    Modifier modifierM3409f11 = AbstractC1102d.m3409f(1.0f, c2314t11);
                    InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    InterfaceC28601c1 interfaceC28601c19 = interfaceC28601c3;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, modifierM3409f11);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d11);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m11);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N11);
                    if (viewState.getCardStackSize() == 0) {
                        z26 = false;
                        c28655q2.m87150e0(-512086241);
                        c28655q2.m87173q(false);
                        c28655q3 = c28655q2;
                    } else {
                        z26 = false;
                        c28655q2.m87150e0(-512086241);
                        c28655q2.m87173q(false);
                        c28655q3 = c28655q2;
                    }
                    InterfaceC16556w interfaceC16556wM115208c11 = viewState.getCardToDisplay();
                    if (m97437r(interfaceC28601c8)) {
                        interfaceC16556wM115211f = viewState.getNextCard();
                    } else {
                        interfaceC16556wM115211f = viewState.getNextCard();
                    }
                    if (m97437r(interfaceC28601c8)) {
                        z27 = true;
                    } else {
                        z27 = true;
                    }
                    c28655q4 = c28655q3;
                    i45 = i39 & 29360128;
                    function13 = function10;
                    AbstractC31592f.m97385i(interfaceC16556wM115208c11, interfaceC16556wM115211f, viewState.getCardStackSize(), z27, function9, interfaceC4351m3, viewState.getNotificationCardDismissAnimation(), function13, c28655q4, ((i39 >> 3) & 57344) | ((i39 << 3) & 458752) | i45, 0);
                    Modifier modifierM3398t11 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t11, C2299e.f9116y), 0.0f, 0.0f, m97405H(interfaceC28670t2M30587a11), 0.0f, 11);
                    zM87147d = c28655q4.m87147d(fMo743q0) | c28655q4.m87153g(interfaceC28670t2M30588b);
                    objM87133R11 = c28655q4.m87133R();
                    if (zM87147d) {
                        objM87133R11 = new C2928d(fMo743q0, interfaceC28670t2M30588b, 1);
                        c28655q4.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C2928d(fMo743q0, interfaceC28670t2M30588b, 1);
                        c28655q4.m87172p0(objM87133R11);
                    }
                    Modifier modifierM3390l11 = AbstractC1099a.m3390l(modifierM3398t11, (Function1) objM87133R11);
                    int iM115207b11 = viewState.getCardStackSize();
                    if (m97398A(interfaceC28601c7) != enumC35102h) {
                    }
                    boolean zM115214i11 = viewState.getIsUpdating();
                    boolean zM97444y11 = m97444y(r47);
                    float fM97401D11 = m97401D(interfaceC28670t2M30588b12);
                    if (viewState.getPlayShimmer()) {
                        z28 = true;
                    } else {
                        z28 = true;
                    }
                    boolean zM115209d11 = viewState.getHighlightCounter();
                    EnumC35102h enumC35102hM97398A12 = m97398A(interfaceC28601c7);
                    C3733d1 c3733d1M11577e11 = AbstractC3788w0.m11577e(null, 3);
                    if (i38 != 4) {
                        z29 = true;
                    } else {
                        z29 = true;
                    }
                    if (i45 == 8388608) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    boolean z3118 = z34 | z29;
                    if ((i39 & 57344) == 16384) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    zM87157i = z3118 | z35 | c28655q4.m87157i(interfaceC29805a);
                    objM87133R12 = c28655q4.m87133R();
                    if (zM87157i) {
                        objM87133R12 = new C27198e((Object) viewState, function13, (Object) interfaceC4351m3, (Object) interfaceC29805a, 12);
                        c28655q4.m87172p0(objM87133R12);
                    } else {
                        objM87133R12 = new C27198e((Object) viewState, function13, (Object) interfaceC4351m3, (Object) interfaceC29805a, 12);
                        c28655q4.m87172p0(objM87133R12);
                    }
                    AbstractC35097c.m111000c(modifierM3390l11, iM115207b11, z37, fM97401D11, zM115214i11, zM97444y11, z28, zM115209d11, enumC35102hM97398A12, interfaceC4339a11118, c3733d1M11577e11, (InterfaceC4339a) objM87133R12, c28655q4, (i39 << 21) & 1879048192, 6, 0);
                    c28655q = c28655q4;
                    c28655q.m87173q(true);
                    function7 = function13;
                    function5 = function12;
                    interfaceC4339a5 = interfaceC4339a11118;
                    z16 = z14;
                    interfaceC4351m2 = interfaceC4351m3;
                    interfaceC4339a4 = interfaceC4339a111111;
                    function6 = function9;
                } else {
                    c28655q = c28655q5;
                    c28655q.m87138X();
                    interfaceC4351m2 = interfaceC4351m;
                    interfaceC4339a4 = interfaceC4339a2;
                    z16 = z14;
                    interfaceC4339a5 = interfaceC4339a3;
                    function5 = function4;
                    function6 = function2;
                    function7 = function3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C1025j0(viewState, z16, interfaceC4339a5, function5, interfaceC4351m2, function6, interfaceC4339a4, function7, list, z13, i13, i14);
                }
            }
            i15 |= 24576;
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q5.m87157i(function2)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i27;
            }
            i28 = i14 & 64;
            if (i28 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q5.m87157i(interfaceC4339a2)) {
                    i29 = 1048576;
                } else {
                    i29 = 524288;
                }
                i15 |= i29;
            }
            i34 = i14 & 128;
            if (i34 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c28655q5.m87157i(function3)) {
                    i35 = 8388608;
                } else {
                    i35 = 4194304;
                }
                i15 |= i35;
            }
            if ((i13 & 100663296) == 0) {
                if (c28655q5.m87157i(list)) {
                    i47 = 67108864;
                } else {
                    i47 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i47;
            }
            if ((i13 & 805306368) == 0) {
                if (c28655q5.m87155h(z13)) {
                    i46 = 536870912;
                } else {
                    i46 = 268435456;
                }
                i15 |= i46;
            }
            if ((i15 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q5.m87135U(i15 & 1, z15)) {
                if (i48 != 0) {
                    z14 = false;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R18 = c28655q5.m87133R();
                    if (objM87133R18 == c28676v0) {
                        objM87133R18 = new C31469a(3);
                        c28655q5.m87172p0(objM87133R18);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R18;
                } else {
                    interfaceC4339a6 = interfaceC4339a3;
                }
                if (i18 != 0) {
                    objM87133R17 = c28655q5.m87133R();
                    if (objM87133R17 == c28676v0) {
                        objM87133R17 = new C30985h(28);
                        c28655q5.m87172p0(objM87133R17);
                    }
                    function8 = (Function1) objM87133R17;
                } else {
                    function8 = function4;
                }
                if (i24 != 0) {
                    objM87133R16 = c28655q5.m87133R();
                    if (objM87133R16 == c28676v0) {
                        objM87133R16 = new C31314a(7);
                        c28655q5.m87172p0(objM87133R16);
                    }
                    interfaceC4351m3 = (InterfaceC4351m) objM87133R16;
                } else {
                    interfaceC4351m3 = interfaceC4351m;
                }
                if (i26 != 0) {
                    objM87133R15 = c28655q5.m87133R();
                    if (objM87133R15 == c28676v0) {
                        objM87133R15 = new C30985h(29);
                        c28655q5.m87172p0(objM87133R15);
                    }
                    function9 = (Function1) objM87133R15;
                } else {
                    function9 = function2;
                }
                if (i28 != 0) {
                    objM87133R14 = c28655q5.m87133R();
                    if (objM87133R14 == c28676v0) {
                        objM87133R14 = new C31469a(4);
                        c28655q5.m87172p0(objM87133R14);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R14;
                } else {
                    interfaceC4339a7 = interfaceC4339a2;
                }
                if (i34 != 0) {
                    objM87133R13 = c28655q5.m87133R();
                    if (objM87133R13 == c28676v0) {
                        objM87133R13 = new C31593g(0);
                        c28655q5.m87172p0(objM87133R13);
                    }
                    function10 = (Function1) objM87133R13;
                } else {
                    function10 = function3;
                }
                objM87133R = c28655q5.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                    c28655q5.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q5.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q5.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q5.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q5.m87172p0(objM87133R3);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                InterfaceC4339a interfaceC4339a111112 = interfaceC4339a6;
                objM87133R4 = c28655q5.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC31061c.m95647w(z13, c28655q5);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                objM87133R5 = c28655q5.m87133R();
                function11 = function8;
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new a(interfaceC28601c1, interfaceC28601c2, interfaceC28601c3, null);
                    c28655q5.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                if (m97441v(interfaceC28601c4)) {
                    c28655q5.m87150e0(1660299335);
                    if (list == null) {
                        c28655q5.m87150e0(-70328166);
                        c28655q5.m87173q(false);
                        c28655q2 = c28655q5;
                        i36 = 1048576;
                        i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        z17 = false;
                        interfaceC28601c5 = interfaceC28601c2;
                    } else {
                        c28655q5.m87150e0(-70328165);
                        boolean zM97413P12 = m97413P(interfaceC28601c1);
                        C3733d1 c3733d12 = AbstractC3730c1.f15251a;
                        C3739f1 c3739f1M11563a12 = AbstractC3788w0.m11584l(AbstractC11348f.m30574v(ErrorCodes.TracksErrors.cGenericTrack, 0, null, 6), C2299e.f9107J, null, 12).m11563a(AbstractC3788w0.m11578f(AbstractC11348f.m30574v(ErrorCodes.TracksErrors.cGenericTrack, 0, null, 6), 2));
                        C37816b c37816bM121344e12 = AbstractC37817c.m121344e(2039574871, c28655q5, new C26949h(viewState, list, function9, 13));
                        i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        z17 = false;
                        i36 = 1048576;
                        interfaceC28601c5 = interfaceC28601c2;
                        AbstractC1090b.m3351f(zM97413P12, null, c3733d12, c3739f1M11563a12, null, c37816bM121344e12, c28655q5, 199680, 18);
                        c28655q2 = c28655q5;
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z17);
                } else {
                    c28655q2 = c28655q5;
                    z14 = z14;
                    interfaceC4351m3 = interfaceC4351m3;
                    interfaceC28601c3 = interfaceC28601c3;
                    interfaceC28601c5 = interfaceC28601c2;
                    i36 = 1048576;
                    z17 = false;
                    i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    c28655q2.m87150e0(-69524583);
                    c28655q2.m87173q(false);
                }
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R6);
                }
                interfaceC28601c6 = (InterfaceC28601c1) objM87133R6;
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC28683x.m87272z(EnumC35102h.NORMAL);
                    c28655q2.m87172p0(objM87133R7);
                }
                interfaceC28601c7 = (InterfaceC28601c1) objM87133R7;
                interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                i38 = i15 & 14;
                if (i38 != 4) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if ((i15 & 3670016) == i36) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z3119 = z18 | z19;
                if ((i15 & 7168) == i37) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = z3119 | z24;
                objM87133R8 = c28655q2.m87133R();
                if (z25) {
                    InterfaceC4339a interfaceC4339a111113 = interfaceC4339a7;
                    objM87133R8 = new b(viewState, interfaceC4339a111113, function11, interfaceC28601c6, null);
                    interfaceC4339a8 = interfaceC4339a111113;
                    function12 = function11;
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    InterfaceC4339a interfaceC4339a111114 = interfaceC4339a7;
                    objM87133R8 = new b(viewState, interfaceC4339a111114, function11, interfaceC28601c6, null);
                    interfaceC4339a8 = interfaceC4339a111114;
                    function12 = function11;
                    c28655q2.m87172p0(objM87133R8);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, viewState);
                enumC35102hM97398A = m97398A(interfaceC28601c7);
                enumC35102h = EnumC35102h.NORMAL;
                f13 = 0.0f;
                if (enumC35102hM97398A == enumC35102h) {
                    f14 = 0.0f;
                } else {
                    f14 = -90.0f;
                }
                i39 = i15;
                interfaceC28601c8 = interfaceC28601c5;
                float f116 = f14;
                InterfaceC4339a interfaceC4339a111115 = interfaceC4339a8;
                C11347e2 c11347e2M30574v113 = AbstractC11348f.m30574v(500, 0, null, 6);
                objM87133R9 = c28655q2.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = new C1024j(7, interfaceC28601c7, interfaceC28601c6);
                    c28655q2.m87172p0(objM87133R9);
                }
                InterfaceC28670t2 interfaceC28670t2M30588b13 = AbstractC11352g.m30588b(f116, c11347e2M30574v113, "itemRotationAnimation", (Function1) objM87133R9, c28655q2, 27696, 4);
                if (m97398A(interfaceC28601c7) != enumC35102h) {
                    f13 = 1.0f;
                }
                C11347e2 c11347e2M30574v114 = AbstractC11348f.m30574v(500, 0, null, 6);
                objM87133R10 = c28655q2.m87133R();
                if (objM87133R10 == c28676v0) {
                    objM87133R10 = new C1024j(8, r47, interfaceC28601c7);
                    c28655q2.m87172p0(objM87133R10);
                }
                interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v114, "replayButtonOffsetAnimation", (Function1) objM87133R10, c28655q2, 27696, 4);
                fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).mo743q0(4 * 35);
                if (viewState.getCardStackSize() > 0) {
                    i44 = 1;
                } else {
                    i44 = 0;
                }
                InterfaceC28670t2 interfaceC28670t2M30587a12 = AbstractC11352g.m30587a(i44 * 8, null, "counterPaddingAnimation", c28655q2, 384, 10);
                C2314t c2314t12 = C2314t.f9131w;
                Modifier modifierM3409f12 = AbstractC1102d.m3409f(1.0f, c2314t12);
                InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                InterfaceC28601c1 interfaceC28601c110 = interfaceC28601c3;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q2.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q2, modifierM3409f12);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d12);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m12);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N12);
                if (viewState.getCardStackSize() == 0) {
                    z26 = false;
                    c28655q2.m87150e0(-512086241);
                    c28655q2.m87173q(false);
                    c28655q3 = c28655q2;
                } else {
                    z26 = false;
                    c28655q2.m87150e0(-512086241);
                    c28655q2.m87173q(false);
                    c28655q3 = c28655q2;
                }
                InterfaceC16556w interfaceC16556wM115208c12 = viewState.getCardToDisplay();
                if (m97437r(interfaceC28601c8)) {
                    interfaceC16556wM115211f = viewState.getNextCard();
                } else {
                    interfaceC16556wM115211f = viewState.getNextCard();
                }
                if (m97437r(interfaceC28601c8)) {
                    z27 = true;
                } else {
                    z27 = true;
                }
                c28655q4 = c28655q3;
                i45 = i39 & 29360128;
                function13 = function10;
                AbstractC31592f.m97385i(interfaceC16556wM115208c12, interfaceC16556wM115211f, viewState.getCardStackSize(), z27, function9, interfaceC4351m3, viewState.getNotificationCardDismissAnimation(), function13, c28655q4, ((i39 >> 3) & 57344) | ((i39 << 3) & 458752) | i45, 0);
                Modifier modifierM3398t12 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t12, C2299e.f9116y), 0.0f, 0.0f, m97405H(interfaceC28670t2M30587a12), 0.0f, 11);
                zM87147d = c28655q4.m87147d(fMo743q0) | c28655q4.m87153g(interfaceC28670t2M30588b);
                objM87133R11 = c28655q4.m87133R();
                if (zM87147d) {
                    objM87133R11 = new C2928d(fMo743q0, interfaceC28670t2M30588b, 1);
                    c28655q4.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new C2928d(fMo743q0, interfaceC28670t2M30588b, 1);
                    c28655q4.m87172p0(objM87133R11);
                }
                Modifier modifierM3390l12 = AbstractC1099a.m3390l(modifierM3398t12, (Function1) objM87133R11);
                int iM115207b12 = viewState.getCardStackSize();
                if (m97398A(interfaceC28601c7) != enumC35102h) {
                }
                boolean zM115214i12 = viewState.getIsUpdating();
                boolean zM97444y12 = m97444y(r47);
                float fM97401D12 = m97401D(interfaceC28670t2M30588b13);
                if (viewState.getPlayShimmer()) {
                    z28 = true;
                } else {
                    z28 = true;
                }
                boolean zM115209d12 = viewState.getHighlightCounter();
                EnumC35102h enumC35102hM97398A13 = m97398A(interfaceC28601c7);
                C3733d1 c3733d1M11577e12 = AbstractC3788w0.m11577e(null, 3);
                if (i38 != 4) {
                    z29 = true;
                } else {
                    z29 = true;
                }
                if (i45 == 8388608) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                boolean z31110 = z34 | z29;
                if ((i39 & 57344) == 16384) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                zM87157i = z31110 | z35 | c28655q4.m87157i(interfaceC29805a);
                objM87133R12 = c28655q4.m87133R();
                if (zM87157i) {
                    objM87133R12 = new C27198e((Object) viewState, function13, (Object) interfaceC4351m3, (Object) interfaceC29805a, 12);
                    c28655q4.m87172p0(objM87133R12);
                } else {
                    objM87133R12 = new C27198e((Object) viewState, function13, (Object) interfaceC4351m3, (Object) interfaceC29805a, 12);
                    c28655q4.m87172p0(objM87133R12);
                }
                AbstractC35097c.m111000c(modifierM3390l12, iM115207b12, z37, fM97401D12, zM115214i12, zM97444y12, z28, zM115209d12, enumC35102hM97398A13, interfaceC4339a111112, c3733d1M11577e12, (InterfaceC4339a) objM87133R12, c28655q4, (i39 << 21) & 1879048192, 6, 0);
                c28655q = c28655q4;
                c28655q.m87173q(true);
                function7 = function13;
                function5 = function12;
                interfaceC4339a5 = interfaceC4339a111112;
                z16 = z14;
                interfaceC4351m2 = interfaceC4351m3;
                interfaceC4339a4 = interfaceC4339a111115;
                function6 = function9;
            } else {
                c28655q = c28655q5;
                c28655q.m87138X();
                interfaceC4351m2 = interfaceC4351m;
                interfaceC4339a4 = interfaceC4339a2;
                z16 = z14;
                interfaceC4339a5 = interfaceC4339a3;
                function5 = function4;
                function6 = function2;
                function7 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C1025j0(viewState, z16, interfaceC4339a5, function5, interfaceC4351m2, function6, interfaceC4339a4, function7, list, z13, i13, i14);
            }
        }
        i15 |= 384;
        interfaceC4339a3 = interfaceC4339a;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                function4 = function1;
                if (c28655q5.m87157i(function4)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c28655q5.m87157i(interfaceC4351m)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q5.m87157i(function2)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                i28 = i14 & 64;
                if (i28 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c28655q5.m87157i(interfaceC4339a2)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i15 |= i29;
                }
                i34 = i14 & 128;
                if (i34 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c28655q5.m87157i(function3)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i15 |= i35;
                }
                if ((i13 & 100663296) == 0) {
                    if (c28655q5.m87157i(list)) {
                        i47 = 67108864;
                    } else {
                        i47 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i47;
                }
                if ((i13 & 805306368) == 0) {
                    if (c28655q5.m87155h(z13)) {
                        i46 = 536870912;
                    } else {
                        i46 = 268435456;
                    }
                    i15 |= i46;
                }
                if ((i15 & 306783379) != 306783378) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q5.m87135U(i15 & 1, z15)) {
                    if (i48 != 0) {
                        z14 = false;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R18 = c28655q5.m87133R();
                        if (objM87133R18 == c28676v0) {
                            objM87133R18 = new C31469a(3);
                            c28655q5.m87172p0(objM87133R18);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R18;
                    } else {
                        interfaceC4339a6 = interfaceC4339a3;
                    }
                    if (i18 != 0) {
                        objM87133R17 = c28655q5.m87133R();
                        if (objM87133R17 == c28676v0) {
                            objM87133R17 = new C30985h(28);
                            c28655q5.m87172p0(objM87133R17);
                        }
                        function8 = (Function1) objM87133R17;
                    } else {
                        function8 = function4;
                    }
                    if (i24 != 0) {
                        objM87133R16 = c28655q5.m87133R();
                        if (objM87133R16 == c28676v0) {
                            objM87133R16 = new C31314a(7);
                            c28655q5.m87172p0(objM87133R16);
                        }
                        interfaceC4351m3 = (InterfaceC4351m) objM87133R16;
                    } else {
                        interfaceC4351m3 = interfaceC4351m;
                    }
                    if (i26 != 0) {
                        objM87133R15 = c28655q5.m87133R();
                        if (objM87133R15 == c28676v0) {
                            objM87133R15 = new C30985h(29);
                            c28655q5.m87172p0(objM87133R15);
                        }
                        function9 = (Function1) objM87133R15;
                    } else {
                        function9 = function2;
                    }
                    if (i28 != 0) {
                        objM87133R14 = c28655q5.m87133R();
                        if (objM87133R14 == c28676v0) {
                            objM87133R14 = new C31469a(4);
                            c28655q5.m87172p0(objM87133R14);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R14;
                    } else {
                        interfaceC4339a7 = interfaceC4339a2;
                    }
                    if (i34 != 0) {
                        objM87133R13 = c28655q5.m87133R();
                        if (objM87133R13 == c28676v0) {
                            objM87133R13 = new C31593g(0);
                            c28655q5.m87172p0(objM87133R13);
                        }
                        function10 = (Function1) objM87133R13;
                    } else {
                        function10 = function3;
                    }
                    objM87133R = c28655q5.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                        c28655q5.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q5.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q5.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q5.m87172p0(objM87133R3);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                    InterfaceC4339a interfaceC4339a111116 = interfaceC4339a6;
                    objM87133R4 = c28655q5.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC31061c.m95647w(z13, c28655q5);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                    objM87133R5 = c28655q5.m87133R();
                    function11 = function8;
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new a(interfaceC28601c1, interfaceC28601c2, interfaceC28601c3, null);
                        c28655q5.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                    if (m97441v(interfaceC28601c4)) {
                        c28655q5.m87150e0(1660299335);
                        if (list == null) {
                            c28655q5.m87150e0(-70328166);
                            c28655q5.m87173q(false);
                            c28655q2 = c28655q5;
                            i36 = 1048576;
                            i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            z17 = false;
                            interfaceC28601c5 = interfaceC28601c2;
                        } else {
                            c28655q5.m87150e0(-70328165);
                            boolean zM97413P13 = m97413P(interfaceC28601c1);
                            C3733d1 c3733d13 = AbstractC3730c1.f15251a;
                            C3739f1 c3739f1M11563a13 = AbstractC3788w0.m11584l(AbstractC11348f.m30574v(ErrorCodes.TracksErrors.cGenericTrack, 0, null, 6), C2299e.f9107J, null, 12).m11563a(AbstractC3788w0.m11578f(AbstractC11348f.m30574v(ErrorCodes.TracksErrors.cGenericTrack, 0, null, 6), 2));
                            C37816b c37816bM121344e13 = AbstractC37817c.m121344e(2039574871, c28655q5, new C26949h(viewState, list, function9, 13));
                            i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            z17 = false;
                            i36 = 1048576;
                            interfaceC28601c5 = interfaceC28601c2;
                            AbstractC1090b.m3351f(zM97413P13, null, c3733d13, c3739f1M11563a13, null, c37816bM121344e13, c28655q5, 199680, 18);
                            c28655q2 = c28655q5;
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(z17);
                    } else {
                        c28655q2 = c28655q5;
                        z14 = z14;
                        interfaceC4351m3 = interfaceC4351m3;
                        interfaceC28601c3 = interfaceC28601c3;
                        interfaceC28601c5 = interfaceC28601c2;
                        i36 = 1048576;
                        z17 = false;
                        i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        c28655q2.m87150e0(-69524583);
                        c28655q2.m87173q(false);
                    }
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC28601c6 = (InterfaceC28601c1) objM87133R6;
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = AbstractC28683x.m87272z(EnumC35102h.NORMAL);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    interfaceC28601c7 = (InterfaceC28601c1) objM87133R7;
                    interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                    i38 = i15 & 14;
                    if (i38 != 4) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    if ((i15 & 3670016) == i36) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z31111 = z18 | z19;
                    if ((i15 & 7168) == i37) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = z31111 | z24;
                    objM87133R8 = c28655q2.m87133R();
                    if (z25) {
                        InterfaceC4339a interfaceC4339a111117 = interfaceC4339a7;
                        objM87133R8 = new b(viewState, interfaceC4339a111117, function11, interfaceC28601c6, null);
                        interfaceC4339a8 = interfaceC4339a111117;
                        function12 = function11;
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        InterfaceC4339a interfaceC4339a111118 = interfaceC4339a7;
                        objM87133R8 = new b(viewState, interfaceC4339a111118, function11, interfaceC28601c6, null);
                        interfaceC4339a8 = interfaceC4339a111118;
                        function12 = function11;
                        c28655q2.m87172p0(objM87133R8);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, viewState);
                    enumC35102hM97398A = m97398A(interfaceC28601c7);
                    enumC35102h = EnumC35102h.NORMAL;
                    f13 = 0.0f;
                    if (enumC35102hM97398A == enumC35102h) {
                        f14 = 0.0f;
                    } else {
                        f14 = -90.0f;
                    }
                    i39 = i15;
                    interfaceC28601c8 = interfaceC28601c5;
                    float f117 = f14;
                    InterfaceC4339a interfaceC4339a111119 = interfaceC4339a8;
                    C11347e2 c11347e2M30574v115 = AbstractC11348f.m30574v(500, 0, null, 6);
                    objM87133R9 = c28655q2.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C1024j(7, interfaceC28601c7, interfaceC28601c6);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    InterfaceC28670t2 interfaceC28670t2M30588b14 = AbstractC11352g.m30588b(f117, c11347e2M30574v115, "itemRotationAnimation", (Function1) objM87133R9, c28655q2, 27696, 4);
                    if (m97398A(interfaceC28601c7) != enumC35102h) {
                        f13 = 1.0f;
                    }
                    C11347e2 c11347e2M30574v116 = AbstractC11348f.m30574v(500, 0, null, 6);
                    objM87133R10 = c28655q2.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C1024j(8, r47, interfaceC28601c7);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v116, "replayButtonOffsetAnimation", (Function1) objM87133R10, c28655q2, 27696, 4);
                    fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).mo743q0(4 * 35);
                    if (viewState.getCardStackSize() > 0) {
                        i44 = 1;
                    } else {
                        i44 = 0;
                    }
                    InterfaceC28670t2 interfaceC28670t2M30587a13 = AbstractC11352g.m30587a(i44 * 8, null, "counterPaddingAnimation", c28655q2, 384, 10);
                    C2314t c2314t13 = C2314t.f9131w;
                    Modifier modifierM3409f13 = AbstractC1102d.m3409f(1.0f, c2314t13);
                    InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    InterfaceC28601c1 interfaceC28601c111 = interfaceC28601c3;
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q2.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q2, modifierM3409f13);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d13);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m13);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N13);
                    if (viewState.getCardStackSize() == 0) {
                        z26 = false;
                        c28655q2.m87150e0(-512086241);
                        c28655q2.m87173q(false);
                        c28655q3 = c28655q2;
                    } else {
                        z26 = false;
                        c28655q2.m87150e0(-512086241);
                        c28655q2.m87173q(false);
                        c28655q3 = c28655q2;
                    }
                    InterfaceC16556w interfaceC16556wM115208c13 = viewState.getCardToDisplay();
                    if (m97437r(interfaceC28601c8)) {
                        interfaceC16556wM115211f = viewState.getNextCard();
                    } else {
                        interfaceC16556wM115211f = viewState.getNextCard();
                    }
                    if (m97437r(interfaceC28601c8)) {
                        z27 = true;
                    } else {
                        z27 = true;
                    }
                    c28655q4 = c28655q3;
                    i45 = i39 & 29360128;
                    function13 = function10;
                    AbstractC31592f.m97385i(interfaceC16556wM115208c13, interfaceC16556wM115211f, viewState.getCardStackSize(), z27, function9, interfaceC4351m3, viewState.getNotificationCardDismissAnimation(), function13, c28655q4, ((i39 >> 3) & 57344) | ((i39 << 3) & 458752) | i45, 0);
                    Modifier modifierM3398t13 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t13, C2299e.f9116y), 0.0f, 0.0f, m97405H(interfaceC28670t2M30587a13), 0.0f, 11);
                    zM87147d = c28655q4.m87147d(fMo743q0) | c28655q4.m87153g(interfaceC28670t2M30588b);
                    objM87133R11 = c28655q4.m87133R();
                    if (zM87147d) {
                        objM87133R11 = new C2928d(fMo743q0, interfaceC28670t2M30588b, 1);
                        c28655q4.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C2928d(fMo743q0, interfaceC28670t2M30588b, 1);
                        c28655q4.m87172p0(objM87133R11);
                    }
                    Modifier modifierM3390l13 = AbstractC1099a.m3390l(modifierM3398t13, (Function1) objM87133R11);
                    int iM115207b13 = viewState.getCardStackSize();
                    if (m97398A(interfaceC28601c7) != enumC35102h) {
                    }
                    boolean zM115214i13 = viewState.getIsUpdating();
                    boolean zM97444y13 = m97444y(r47);
                    float fM97401D13 = m97401D(interfaceC28670t2M30588b14);
                    if (viewState.getPlayShimmer()) {
                        z28 = true;
                    } else {
                        z28 = true;
                    }
                    boolean zM115209d13 = viewState.getHighlightCounter();
                    EnumC35102h enumC35102hM97398A14 = m97398A(interfaceC28601c7);
                    C3733d1 c3733d1M11577e13 = AbstractC3788w0.m11577e(null, 3);
                    if (i38 != 4) {
                        z29 = true;
                    } else {
                        z29 = true;
                    }
                    if (i45 == 8388608) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    boolean z31112 = z34 | z29;
                    if ((i39 & 57344) == 16384) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    zM87157i = z31112 | z35 | c28655q4.m87157i(interfaceC29805a);
                    objM87133R12 = c28655q4.m87133R();
                    if (zM87157i) {
                        objM87133R12 = new C27198e((Object) viewState, function13, (Object) interfaceC4351m3, (Object) interfaceC29805a, 12);
                        c28655q4.m87172p0(objM87133R12);
                    } else {
                        objM87133R12 = new C27198e((Object) viewState, function13, (Object) interfaceC4351m3, (Object) interfaceC29805a, 12);
                        c28655q4.m87172p0(objM87133R12);
                    }
                    AbstractC35097c.m111000c(modifierM3390l13, iM115207b13, z37, fM97401D13, zM115214i13, zM97444y13, z28, zM115209d13, enumC35102hM97398A14, interfaceC4339a111116, c3733d1M11577e13, (InterfaceC4339a) objM87133R12, c28655q4, (i39 << 21) & 1879048192, 6, 0);
                    c28655q = c28655q4;
                    c28655q.m87173q(true);
                    function7 = function13;
                    function5 = function12;
                    interfaceC4339a5 = interfaceC4339a111116;
                    z16 = z14;
                    interfaceC4351m2 = interfaceC4351m3;
                    interfaceC4339a4 = interfaceC4339a111119;
                    function6 = function9;
                } else {
                    c28655q = c28655q5;
                    c28655q.m87138X();
                    interfaceC4351m2 = interfaceC4351m;
                    interfaceC4339a4 = interfaceC4339a2;
                    z16 = z14;
                    interfaceC4339a5 = interfaceC4339a3;
                    function5 = function4;
                    function6 = function2;
                    function7 = function3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C1025j0(viewState, z16, interfaceC4339a5, function5, interfaceC4351m2, function6, interfaceC4339a4, function7, list, z13, i13, i14);
                }
            }
            i15 |= 24576;
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q5.m87157i(function2)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i27;
            }
            i28 = i14 & 64;
            if (i28 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q5.m87157i(interfaceC4339a2)) {
                    i29 = 1048576;
                } else {
                    i29 = 524288;
                }
                i15 |= i29;
            }
            i34 = i14 & 128;
            if (i34 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c28655q5.m87157i(function3)) {
                    i35 = 8388608;
                } else {
                    i35 = 4194304;
                }
                i15 |= i35;
            }
            if ((i13 & 100663296) == 0) {
                if (c28655q5.m87157i(list)) {
                    i47 = 67108864;
                } else {
                    i47 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i47;
            }
            if ((i13 & 805306368) == 0) {
                if (c28655q5.m87155h(z13)) {
                    i46 = 536870912;
                } else {
                    i46 = 268435456;
                }
                i15 |= i46;
            }
            if ((i15 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q5.m87135U(i15 & 1, z15)) {
                if (i48 != 0) {
                    z14 = false;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R18 = c28655q5.m87133R();
                    if (objM87133R18 == c28676v0) {
                        objM87133R18 = new C31469a(3);
                        c28655q5.m87172p0(objM87133R18);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R18;
                } else {
                    interfaceC4339a6 = interfaceC4339a3;
                }
                if (i18 != 0) {
                    objM87133R17 = c28655q5.m87133R();
                    if (objM87133R17 == c28676v0) {
                        objM87133R17 = new C30985h(28);
                        c28655q5.m87172p0(objM87133R17);
                    }
                    function8 = (Function1) objM87133R17;
                } else {
                    function8 = function4;
                }
                if (i24 != 0) {
                    objM87133R16 = c28655q5.m87133R();
                    if (objM87133R16 == c28676v0) {
                        objM87133R16 = new C31314a(7);
                        c28655q5.m87172p0(objM87133R16);
                    }
                    interfaceC4351m3 = (InterfaceC4351m) objM87133R16;
                } else {
                    interfaceC4351m3 = interfaceC4351m;
                }
                if (i26 != 0) {
                    objM87133R15 = c28655q5.m87133R();
                    if (objM87133R15 == c28676v0) {
                        objM87133R15 = new C30985h(29);
                        c28655q5.m87172p0(objM87133R15);
                    }
                    function9 = (Function1) objM87133R15;
                } else {
                    function9 = function2;
                }
                if (i28 != 0) {
                    objM87133R14 = c28655q5.m87133R();
                    if (objM87133R14 == c28676v0) {
                        objM87133R14 = new C31469a(4);
                        c28655q5.m87172p0(objM87133R14);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R14;
                } else {
                    interfaceC4339a7 = interfaceC4339a2;
                }
                if (i34 != 0) {
                    objM87133R13 = c28655q5.m87133R();
                    if (objM87133R13 == c28676v0) {
                        objM87133R13 = new C31593g(0);
                        c28655q5.m87172p0(objM87133R13);
                    }
                    function10 = (Function1) objM87133R13;
                } else {
                    function10 = function3;
                }
                objM87133R = c28655q5.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                    c28655q5.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q5.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q5.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q5.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q5.m87172p0(objM87133R3);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                InterfaceC4339a interfaceC4339a1111110 = interfaceC4339a6;
                objM87133R4 = c28655q5.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC31061c.m95647w(z13, c28655q5);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                objM87133R5 = c28655q5.m87133R();
                function11 = function8;
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new a(interfaceC28601c1, interfaceC28601c2, interfaceC28601c3, null);
                    c28655q5.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                if (m97441v(interfaceC28601c4)) {
                    c28655q5.m87150e0(1660299335);
                    if (list == null) {
                        c28655q5.m87150e0(-70328166);
                        c28655q5.m87173q(false);
                        c28655q2 = c28655q5;
                        i36 = 1048576;
                        i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        z17 = false;
                        interfaceC28601c5 = interfaceC28601c2;
                    } else {
                        c28655q5.m87150e0(-70328165);
                        boolean zM97413P14 = m97413P(interfaceC28601c1);
                        C3733d1 c3733d14 = AbstractC3730c1.f15251a;
                        C3739f1 c3739f1M11563a14 = AbstractC3788w0.m11584l(AbstractC11348f.m30574v(ErrorCodes.TracksErrors.cGenericTrack, 0, null, 6), C2299e.f9107J, null, 12).m11563a(AbstractC3788w0.m11578f(AbstractC11348f.m30574v(ErrorCodes.TracksErrors.cGenericTrack, 0, null, 6), 2));
                        C37816b c37816bM121344e14 = AbstractC37817c.m121344e(2039574871, c28655q5, new C26949h(viewState, list, function9, 13));
                        i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        z17 = false;
                        i36 = 1048576;
                        interfaceC28601c5 = interfaceC28601c2;
                        AbstractC1090b.m3351f(zM97413P14, null, c3733d14, c3739f1M11563a14, null, c37816bM121344e14, c28655q5, 199680, 18);
                        c28655q2 = c28655q5;
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z17);
                } else {
                    c28655q2 = c28655q5;
                    z14 = z14;
                    interfaceC4351m3 = interfaceC4351m3;
                    interfaceC28601c3 = interfaceC28601c3;
                    interfaceC28601c5 = interfaceC28601c2;
                    i36 = 1048576;
                    z17 = false;
                    i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    c28655q2.m87150e0(-69524583);
                    c28655q2.m87173q(false);
                }
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R6);
                }
                interfaceC28601c6 = (InterfaceC28601c1) objM87133R6;
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC28683x.m87272z(EnumC35102h.NORMAL);
                    c28655q2.m87172p0(objM87133R7);
                }
                interfaceC28601c7 = (InterfaceC28601c1) objM87133R7;
                interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                i38 = i15 & 14;
                if (i38 != 4) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if ((i15 & 3670016) == i36) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z31113 = z18 | z19;
                if ((i15 & 7168) == i37) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = z31113 | z24;
                objM87133R8 = c28655q2.m87133R();
                if (z25) {
                    InterfaceC4339a interfaceC4339a1111111 = interfaceC4339a7;
                    objM87133R8 = new b(viewState, interfaceC4339a1111111, function11, interfaceC28601c6, null);
                    interfaceC4339a8 = interfaceC4339a1111111;
                    function12 = function11;
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    InterfaceC4339a interfaceC4339a1111112 = interfaceC4339a7;
                    objM87133R8 = new b(viewState, interfaceC4339a1111112, function11, interfaceC28601c6, null);
                    interfaceC4339a8 = interfaceC4339a1111112;
                    function12 = function11;
                    c28655q2.m87172p0(objM87133R8);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, viewState);
                enumC35102hM97398A = m97398A(interfaceC28601c7);
                enumC35102h = EnumC35102h.NORMAL;
                f13 = 0.0f;
                if (enumC35102hM97398A == enumC35102h) {
                    f14 = 0.0f;
                } else {
                    f14 = -90.0f;
                }
                i39 = i15;
                interfaceC28601c8 = interfaceC28601c5;
                float f118 = f14;
                InterfaceC4339a interfaceC4339a1111113 = interfaceC4339a8;
                C11347e2 c11347e2M30574v117 = AbstractC11348f.m30574v(500, 0, null, 6);
                objM87133R9 = c28655q2.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = new C1024j(7, interfaceC28601c7, interfaceC28601c6);
                    c28655q2.m87172p0(objM87133R9);
                }
                InterfaceC28670t2 interfaceC28670t2M30588b15 = AbstractC11352g.m30588b(f118, c11347e2M30574v117, "itemRotationAnimation", (Function1) objM87133R9, c28655q2, 27696, 4);
                if (m97398A(interfaceC28601c7) != enumC35102h) {
                    f13 = 1.0f;
                }
                C11347e2 c11347e2M30574v118 = AbstractC11348f.m30574v(500, 0, null, 6);
                objM87133R10 = c28655q2.m87133R();
                if (objM87133R10 == c28676v0) {
                    objM87133R10 = new C1024j(8, r47, interfaceC28601c7);
                    c28655q2.m87172p0(objM87133R10);
                }
                interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v118, "replayButtonOffsetAnimation", (Function1) objM87133R10, c28655q2, 27696, 4);
                fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).mo743q0(4 * 35);
                if (viewState.getCardStackSize() > 0) {
                    i44 = 1;
                } else {
                    i44 = 0;
                }
                InterfaceC28670t2 interfaceC28670t2M30587a14 = AbstractC11352g.m30587a(i44 * 8, null, "counterPaddingAnimation", c28655q2, 384, 10);
                C2314t c2314t14 = C2314t.f9131w;
                Modifier modifierM3409f14 = AbstractC1102d.m3409f(1.0f, c2314t14);
                InterfaceC39127r0 interfaceC39127r0M66763d14 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                InterfaceC28601c1 interfaceC28601c112 = interfaceC28601c3;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q2.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q2, modifierM3409f14);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d14);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m14);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N14);
                if (viewState.getCardStackSize() == 0) {
                    z26 = false;
                    c28655q2.m87150e0(-512086241);
                    c28655q2.m87173q(false);
                    c28655q3 = c28655q2;
                } else {
                    z26 = false;
                    c28655q2.m87150e0(-512086241);
                    c28655q2.m87173q(false);
                    c28655q3 = c28655q2;
                }
                InterfaceC16556w interfaceC16556wM115208c14 = viewState.getCardToDisplay();
                if (m97437r(interfaceC28601c8)) {
                    interfaceC16556wM115211f = viewState.getNextCard();
                } else {
                    interfaceC16556wM115211f = viewState.getNextCard();
                }
                if (m97437r(interfaceC28601c8)) {
                    z27 = true;
                } else {
                    z27 = true;
                }
                c28655q4 = c28655q3;
                i45 = i39 & 29360128;
                function13 = function10;
                AbstractC31592f.m97385i(interfaceC16556wM115208c14, interfaceC16556wM115211f, viewState.getCardStackSize(), z27, function9, interfaceC4351m3, viewState.getNotificationCardDismissAnimation(), function13, c28655q4, ((i39 >> 3) & 57344) | ((i39 << 3) & 458752) | i45, 0);
                Modifier modifierM3398t14 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t14, C2299e.f9116y), 0.0f, 0.0f, m97405H(interfaceC28670t2M30587a14), 0.0f, 11);
                zM87147d = c28655q4.m87147d(fMo743q0) | c28655q4.m87153g(interfaceC28670t2M30588b);
                objM87133R11 = c28655q4.m87133R();
                if (zM87147d) {
                    objM87133R11 = new C2928d(fMo743q0, interfaceC28670t2M30588b, 1);
                    c28655q4.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new C2928d(fMo743q0, interfaceC28670t2M30588b, 1);
                    c28655q4.m87172p0(objM87133R11);
                }
                Modifier modifierM3390l14 = AbstractC1099a.m3390l(modifierM3398t14, (Function1) objM87133R11);
                int iM115207b14 = viewState.getCardStackSize();
                if (m97398A(interfaceC28601c7) != enumC35102h) {
                }
                boolean zM115214i14 = viewState.getIsUpdating();
                boolean zM97444y14 = m97444y(r47);
                float fM97401D14 = m97401D(interfaceC28670t2M30588b15);
                if (viewState.getPlayShimmer()) {
                    z28 = true;
                } else {
                    z28 = true;
                }
                boolean zM115209d14 = viewState.getHighlightCounter();
                EnumC35102h enumC35102hM97398A15 = m97398A(interfaceC28601c7);
                C3733d1 c3733d1M11577e14 = AbstractC3788w0.m11577e(null, 3);
                if (i38 != 4) {
                    z29 = true;
                } else {
                    z29 = true;
                }
                if (i45 == 8388608) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                boolean z31114 = z34 | z29;
                if ((i39 & 57344) == 16384) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                zM87157i = z31114 | z35 | c28655q4.m87157i(interfaceC29805a);
                objM87133R12 = c28655q4.m87133R();
                if (zM87157i) {
                    objM87133R12 = new C27198e((Object) viewState, function13, (Object) interfaceC4351m3, (Object) interfaceC29805a, 12);
                    c28655q4.m87172p0(objM87133R12);
                } else {
                    objM87133R12 = new C27198e((Object) viewState, function13, (Object) interfaceC4351m3, (Object) interfaceC29805a, 12);
                    c28655q4.m87172p0(objM87133R12);
                }
                AbstractC35097c.m111000c(modifierM3390l14, iM115207b14, z37, fM97401D14, zM115214i14, zM97444y14, z28, zM115209d14, enumC35102hM97398A15, interfaceC4339a1111110, c3733d1M11577e14, (InterfaceC4339a) objM87133R12, c28655q4, (i39 << 21) & 1879048192, 6, 0);
                c28655q = c28655q4;
                c28655q.m87173q(true);
                function7 = function13;
                function5 = function12;
                interfaceC4339a5 = interfaceC4339a1111110;
                z16 = z14;
                interfaceC4351m2 = interfaceC4351m3;
                interfaceC4339a4 = interfaceC4339a1111113;
                function6 = function9;
            } else {
                c28655q = c28655q5;
                c28655q.m87138X();
                interfaceC4351m2 = interfaceC4351m;
                interfaceC4339a4 = interfaceC4339a2;
                z16 = z14;
                interfaceC4339a5 = interfaceC4339a3;
                function5 = function4;
                function6 = function2;
                function7 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C1025j0(viewState, z16, interfaceC4339a5, function5, interfaceC4351m2, function6, interfaceC4339a4, function7, list, z13, i13, i14);
            }
        }
        i15 |= 3072;
        function4 = function1;
        i24 = i14 & 16;
        if (i24 != 0) {
            if ((i13 & 24576) == 0) {
                if (c28655q5.m87157i(interfaceC4351m)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q5.m87157i(function2)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i27;
            }
            i28 = i14 & 64;
            if (i28 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q5.m87157i(interfaceC4339a2)) {
                    i29 = 1048576;
                } else {
                    i29 = 524288;
                }
                i15 |= i29;
            }
            i34 = i14 & 128;
            if (i34 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c28655q5.m87157i(function3)) {
                    i35 = 8388608;
                } else {
                    i35 = 4194304;
                }
                i15 |= i35;
            }
            if ((i13 & 100663296) == 0) {
                if (c28655q5.m87157i(list)) {
                    i47 = 67108864;
                } else {
                    i47 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i47;
            }
            if ((i13 & 805306368) == 0) {
                if (c28655q5.m87155h(z13)) {
                    i46 = 536870912;
                } else {
                    i46 = 268435456;
                }
                i15 |= i46;
            }
            if ((i15 & 306783379) != 306783378) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q5.m87135U(i15 & 1, z15)) {
                if (i48 != 0) {
                    z14 = false;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R18 = c28655q5.m87133R();
                    if (objM87133R18 == c28676v0) {
                        objM87133R18 = new C31469a(3);
                        c28655q5.m87172p0(objM87133R18);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R18;
                } else {
                    interfaceC4339a6 = interfaceC4339a3;
                }
                if (i18 != 0) {
                    objM87133R17 = c28655q5.m87133R();
                    if (objM87133R17 == c28676v0) {
                        objM87133R17 = new C30985h(28);
                        c28655q5.m87172p0(objM87133R17);
                    }
                    function8 = (Function1) objM87133R17;
                } else {
                    function8 = function4;
                }
                if (i24 != 0) {
                    objM87133R16 = c28655q5.m87133R();
                    if (objM87133R16 == c28676v0) {
                        objM87133R16 = new C31314a(7);
                        c28655q5.m87172p0(objM87133R16);
                    }
                    interfaceC4351m3 = (InterfaceC4351m) objM87133R16;
                } else {
                    interfaceC4351m3 = interfaceC4351m;
                }
                if (i26 != 0) {
                    objM87133R15 = c28655q5.m87133R();
                    if (objM87133R15 == c28676v0) {
                        objM87133R15 = new C30985h(29);
                        c28655q5.m87172p0(objM87133R15);
                    }
                    function9 = (Function1) objM87133R15;
                } else {
                    function9 = function2;
                }
                if (i28 != 0) {
                    objM87133R14 = c28655q5.m87133R();
                    if (objM87133R14 == c28676v0) {
                        objM87133R14 = new C31469a(4);
                        c28655q5.m87172p0(objM87133R14);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R14;
                } else {
                    interfaceC4339a7 = interfaceC4339a2;
                }
                if (i34 != 0) {
                    objM87133R13 = c28655q5.m87133R();
                    if (objM87133R13 == c28676v0) {
                        objM87133R13 = new C31593g(0);
                        c28655q5.m87172p0(objM87133R13);
                    }
                    function10 = (Function1) objM87133R13;
                } else {
                    function10 = function3;
                }
                objM87133R = c28655q5.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                    c28655q5.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q5.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q5.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q5.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q5.m87172p0(objM87133R3);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                InterfaceC4339a interfaceC4339a1111114 = interfaceC4339a6;
                objM87133R4 = c28655q5.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC31061c.m95647w(z13, c28655q5);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
                objM87133R5 = c28655q5.m87133R();
                function11 = function8;
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new a(interfaceC28601c1, interfaceC28601c2, interfaceC28601c3, null);
                    c28655q5.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
                if (m97441v(interfaceC28601c4)) {
                    c28655q5.m87150e0(1660299335);
                    if (list == null) {
                        c28655q5.m87150e0(-70328166);
                        c28655q5.m87173q(false);
                        c28655q2 = c28655q5;
                        i36 = 1048576;
                        i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        z17 = false;
                        interfaceC28601c5 = interfaceC28601c2;
                    } else {
                        c28655q5.m87150e0(-70328165);
                        boolean zM97413P15 = m97413P(interfaceC28601c1);
                        C3733d1 c3733d15 = AbstractC3730c1.f15251a;
                        C3739f1 c3739f1M11563a15 = AbstractC3788w0.m11584l(AbstractC11348f.m30574v(ErrorCodes.TracksErrors.cGenericTrack, 0, null, 6), C2299e.f9107J, null, 12).m11563a(AbstractC3788w0.m11578f(AbstractC11348f.m30574v(ErrorCodes.TracksErrors.cGenericTrack, 0, null, 6), 2));
                        C37816b c37816bM121344e15 = AbstractC37817c.m121344e(2039574871, c28655q5, new C26949h(viewState, list, function9, 13));
                        i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        z17 = false;
                        i36 = 1048576;
                        interfaceC28601c5 = interfaceC28601c2;
                        AbstractC1090b.m3351f(zM97413P15, null, c3733d15, c3739f1M11563a15, null, c37816bM121344e15, c28655q5, 199680, 18);
                        c28655q2 = c28655q5;
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(z17);
                } else {
                    c28655q2 = c28655q5;
                    z14 = z14;
                    interfaceC4351m3 = interfaceC4351m3;
                    interfaceC28601c3 = interfaceC28601c3;
                    interfaceC28601c5 = interfaceC28601c2;
                    i36 = 1048576;
                    z17 = false;
                    i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    c28655q2.m87150e0(-69524583);
                    c28655q2.m87173q(false);
                }
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R6);
                }
                interfaceC28601c6 = (InterfaceC28601c1) objM87133R6;
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC28683x.m87272z(EnumC35102h.NORMAL);
                    c28655q2.m87172p0(objM87133R7);
                }
                interfaceC28601c7 = (InterfaceC28601c1) objM87133R7;
                interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
                i38 = i15 & 14;
                if (i38 != 4) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if ((i15 & 3670016) == i36) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z31115 = z18 | z19;
                if ((i15 & 7168) == i37) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = z31115 | z24;
                objM87133R8 = c28655q2.m87133R();
                if (z25) {
                    InterfaceC4339a interfaceC4339a1111115 = interfaceC4339a7;
                    objM87133R8 = new b(viewState, interfaceC4339a1111115, function11, interfaceC28601c6, null);
                    interfaceC4339a8 = interfaceC4339a1111115;
                    function12 = function11;
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    InterfaceC4339a interfaceC4339a1111116 = interfaceC4339a7;
                    objM87133R8 = new b(viewState, interfaceC4339a1111116, function11, interfaceC28601c6, null);
                    interfaceC4339a8 = interfaceC4339a1111116;
                    function12 = function11;
                    c28655q2.m87172p0(objM87133R8);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, viewState);
                enumC35102hM97398A = m97398A(interfaceC28601c7);
                enumC35102h = EnumC35102h.NORMAL;
                f13 = 0.0f;
                if (enumC35102hM97398A == enumC35102h) {
                    f14 = 0.0f;
                } else {
                    f14 = -90.0f;
                }
                i39 = i15;
                interfaceC28601c8 = interfaceC28601c5;
                float f119 = f14;
                InterfaceC4339a interfaceC4339a1111117 = interfaceC4339a8;
                C11347e2 c11347e2M30574v119 = AbstractC11348f.m30574v(500, 0, null, 6);
                objM87133R9 = c28655q2.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = new C1024j(7, interfaceC28601c7, interfaceC28601c6);
                    c28655q2.m87172p0(objM87133R9);
                }
                InterfaceC28670t2 interfaceC28670t2M30588b16 = AbstractC11352g.m30588b(f119, c11347e2M30574v119, "itemRotationAnimation", (Function1) objM87133R9, c28655q2, 27696, 4);
                if (m97398A(interfaceC28601c7) != enumC35102h) {
                    f13 = 1.0f;
                }
                C11347e2 c11347e2M30574v1110 = AbstractC11348f.m30574v(500, 0, null, 6);
                objM87133R10 = c28655q2.m87133R();
                if (objM87133R10 == c28676v0) {
                    objM87133R10 = new C1024j(8, r47, interfaceC28601c7);
                    c28655q2.m87172p0(objM87133R10);
                }
                interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v1110, "replayButtonOffsetAnimation", (Function1) objM87133R10, c28655q2, 27696, 4);
                fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).mo743q0(4 * 35);
                if (viewState.getCardStackSize() > 0) {
                    i44 = 1;
                } else {
                    i44 = 0;
                }
                InterfaceC28670t2 interfaceC28670t2M30587a15 = AbstractC11352g.m30587a(i44 * 8, null, "counterPaddingAnimation", c28655q2, 384, 10);
                C2314t c2314t15 = C2314t.f9131w;
                Modifier modifierM3409f15 = AbstractC1102d.m3409f(1.0f, c2314t15);
                InterfaceC39127r0 interfaceC39127r0M66763d15 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                InterfaceC28601c1 interfaceC28601c113 = interfaceC28601c3;
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q2.m87165m();
                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q2, modifierM3409f15);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d15);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m15);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N15);
                if (viewState.getCardStackSize() == 0) {
                    z26 = false;
                    c28655q2.m87150e0(-512086241);
                    c28655q2.m87173q(false);
                    c28655q3 = c28655q2;
                } else {
                    z26 = false;
                    c28655q2.m87150e0(-512086241);
                    c28655q2.m87173q(false);
                    c28655q3 = c28655q2;
                }
                InterfaceC16556w interfaceC16556wM115208c15 = viewState.getCardToDisplay();
                if (m97437r(interfaceC28601c8)) {
                    interfaceC16556wM115211f = viewState.getNextCard();
                } else {
                    interfaceC16556wM115211f = viewState.getNextCard();
                }
                if (m97437r(interfaceC28601c8)) {
                    z27 = true;
                } else {
                    z27 = true;
                }
                c28655q4 = c28655q3;
                i45 = i39 & 29360128;
                function13 = function10;
                AbstractC31592f.m97385i(interfaceC16556wM115208c15, interfaceC16556wM115211f, viewState.getCardStackSize(), z27, function9, interfaceC4351m3, viewState.getNotificationCardDismissAnimation(), function13, c28655q4, ((i39 >> 3) & 57344) | ((i39 << 3) & 458752) | i45, 0);
                Modifier modifierM3398t15 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t15, C2299e.f9116y), 0.0f, 0.0f, m97405H(interfaceC28670t2M30587a15), 0.0f, 11);
                zM87147d = c28655q4.m87147d(fMo743q0) | c28655q4.m87153g(interfaceC28670t2M30588b);
                objM87133R11 = c28655q4.m87133R();
                if (zM87147d) {
                    objM87133R11 = new C2928d(fMo743q0, interfaceC28670t2M30588b, 1);
                    c28655q4.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new C2928d(fMo743q0, interfaceC28670t2M30588b, 1);
                    c28655q4.m87172p0(objM87133R11);
                }
                Modifier modifierM3390l15 = AbstractC1099a.m3390l(modifierM3398t15, (Function1) objM87133R11);
                int iM115207b15 = viewState.getCardStackSize();
                if (m97398A(interfaceC28601c7) != enumC35102h) {
                }
                boolean zM115214i15 = viewState.getIsUpdating();
                boolean zM97444y15 = m97444y(r47);
                float fM97401D15 = m97401D(interfaceC28670t2M30588b16);
                if (viewState.getPlayShimmer()) {
                    z28 = true;
                } else {
                    z28 = true;
                }
                boolean zM115209d15 = viewState.getHighlightCounter();
                EnumC35102h enumC35102hM97398A16 = m97398A(interfaceC28601c7);
                C3733d1 c3733d1M11577e15 = AbstractC3788w0.m11577e(null, 3);
                if (i38 != 4) {
                    z29 = true;
                } else {
                    z29 = true;
                }
                if (i45 == 8388608) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                boolean z31116 = z34 | z29;
                if ((i39 & 57344) == 16384) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                zM87157i = z31116 | z35 | c28655q4.m87157i(interfaceC29805a);
                objM87133R12 = c28655q4.m87133R();
                if (zM87157i) {
                    objM87133R12 = new C27198e((Object) viewState, function13, (Object) interfaceC4351m3, (Object) interfaceC29805a, 12);
                    c28655q4.m87172p0(objM87133R12);
                } else {
                    objM87133R12 = new C27198e((Object) viewState, function13, (Object) interfaceC4351m3, (Object) interfaceC29805a, 12);
                    c28655q4.m87172p0(objM87133R12);
                }
                AbstractC35097c.m111000c(modifierM3390l15, iM115207b15, z37, fM97401D15, zM115214i15, zM97444y15, z28, zM115209d15, enumC35102hM97398A16, interfaceC4339a1111114, c3733d1M11577e15, (InterfaceC4339a) objM87133R12, c28655q4, (i39 << 21) & 1879048192, 6, 0);
                c28655q = c28655q4;
                c28655q.m87173q(true);
                function7 = function13;
                function5 = function12;
                interfaceC4339a5 = interfaceC4339a1111114;
                z16 = z14;
                interfaceC4351m2 = interfaceC4351m3;
                interfaceC4339a4 = interfaceC4339a1111117;
                function6 = function9;
            } else {
                c28655q = c28655q5;
                c28655q.m87138X();
                interfaceC4351m2 = interfaceC4351m;
                interfaceC4339a4 = interfaceC4339a2;
                z16 = z14;
                interfaceC4339a5 = interfaceC4339a3;
                function5 = function4;
                function6 = function2;
                function7 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C1025j0(viewState, z16, interfaceC4339a5, function5, interfaceC4351m2, function6, interfaceC4339a4, function7, list, z13, i13, i14);
            }
        }
        i15 |= 24576;
        i26 = i14 & 32;
        if (i26 != 0) {
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q5.m87157i(function2)) {
                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i27;
        }
        i28 = i14 & 64;
        if (i28 != 0) {
            i15 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            if (c28655q5.m87157i(interfaceC4339a2)) {
                i29 = 1048576;
            } else {
                i29 = 524288;
            }
            i15 |= i29;
        }
        i34 = i14 & 128;
        if (i34 != 0) {
            i15 |= 12582912;
        } else if ((i13 & 12582912) == 0) {
            if (c28655q5.m87157i(function3)) {
                i35 = 8388608;
            } else {
                i35 = 4194304;
            }
            i15 |= i35;
        }
        if ((i13 & 100663296) == 0) {
            if (c28655q5.m87157i(list)) {
                i47 = 67108864;
            } else {
                i47 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i15 |= i47;
        }
        if ((i13 & 805306368) == 0) {
            if (c28655q5.m87155h(z13)) {
                i46 = 536870912;
            } else {
                i46 = 268435456;
            }
            i15 |= i46;
        }
        if ((i15 & 306783379) != 306783378) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c28655q5.m87135U(i15 & 1, z15)) {
            if (i48 != 0) {
                z14 = false;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R18 = c28655q5.m87133R();
                if (objM87133R18 == c28676v0) {
                    objM87133R18 = new C31469a(3);
                    c28655q5.m87172p0(objM87133R18);
                }
                interfaceC4339a6 = (InterfaceC4339a) objM87133R18;
            } else {
                interfaceC4339a6 = interfaceC4339a3;
            }
            if (i18 != 0) {
                objM87133R17 = c28655q5.m87133R();
                if (objM87133R17 == c28676v0) {
                    objM87133R17 = new C30985h(28);
                    c28655q5.m87172p0(objM87133R17);
                }
                function8 = (Function1) objM87133R17;
            } else {
                function8 = function4;
            }
            if (i24 != 0) {
                objM87133R16 = c28655q5.m87133R();
                if (objM87133R16 == c28676v0) {
                    objM87133R16 = new C31314a(7);
                    c28655q5.m87172p0(objM87133R16);
                }
                interfaceC4351m3 = (InterfaceC4351m) objM87133R16;
            } else {
                interfaceC4351m3 = interfaceC4351m;
            }
            if (i26 != 0) {
                objM87133R15 = c28655q5.m87133R();
                if (objM87133R15 == c28676v0) {
                    objM87133R15 = new C30985h(29);
                    c28655q5.m87172p0(objM87133R15);
                }
                function9 = (Function1) objM87133R15;
            } else {
                function9 = function2;
            }
            if (i28 != 0) {
                objM87133R14 = c28655q5.m87133R();
                if (objM87133R14 == c28676v0) {
                    objM87133R14 = new C31469a(4);
                    c28655q5.m87172p0(objM87133R14);
                }
                interfaceC4339a7 = (InterfaceC4339a) objM87133R14;
            } else {
                interfaceC4339a7 = interfaceC4339a2;
            }
            if (i34 != 0) {
                objM87133R13 = c28655q5.m87133R();
                if (objM87133R13 == c28676v0) {
                    objM87133R13 = new C31593g(0);
                    c28655q5.m87172p0(objM87133R13);
                }
                function10 = (Function1) objM87133R13;
            } else {
                function10 = function3;
            }
            objM87133R = c28655q5.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q5.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q5.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q5.m87172p0(objM87133R2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            objM87133R3 = c28655q5.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q5.m87172p0(objM87133R3);
            }
            interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
            InterfaceC4339a interfaceC4339a1111118 = interfaceC4339a6;
            objM87133R4 = c28655q5.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC31061c.m95647w(z13, c28655q5);
            }
            interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
            objM87133R5 = c28655q5.m87133R();
            function11 = function8;
            if (objM87133R5 == c28676v0) {
                objM87133R5 = new a(interfaceC28601c1, interfaceC28601c2, interfaceC28601c3, null);
                c28655q5.m87172p0(objM87133R5);
            }
            AbstractC28683x.m87253g(c28655q5, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
            if (m97441v(interfaceC28601c4)) {
                c28655q5.m87150e0(1660299335);
                if (list == null) {
                    c28655q5.m87150e0(-70328166);
                    c28655q5.m87173q(false);
                    c28655q2 = c28655q5;
                    i36 = 1048576;
                    i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    z17 = false;
                    interfaceC28601c5 = interfaceC28601c2;
                } else {
                    c28655q5.m87150e0(-70328165);
                    boolean zM97413P16 = m97413P(interfaceC28601c1);
                    C3733d1 c3733d16 = AbstractC3730c1.f15251a;
                    C3739f1 c3739f1M11563a16 = AbstractC3788w0.m11584l(AbstractC11348f.m30574v(ErrorCodes.TracksErrors.cGenericTrack, 0, null, 6), C2299e.f9107J, null, 12).m11563a(AbstractC3788w0.m11578f(AbstractC11348f.m30574v(ErrorCodes.TracksErrors.cGenericTrack, 0, null, 6), 2));
                    C37816b c37816bM121344e16 = AbstractC37817c.m121344e(2039574871, c28655q5, new C26949h(viewState, list, function9, 13));
                    i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    z17 = false;
                    i36 = 1048576;
                    interfaceC28601c5 = interfaceC28601c2;
                    AbstractC1090b.m3351f(zM97413P16, null, c3733d16, c3739f1M11563a16, null, c37816bM121344e16, c28655q5, 199680, 18);
                    c28655q2 = c28655q5;
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(z17);
            } else {
                c28655q2 = c28655q5;
                z14 = z14;
                interfaceC4351m3 = interfaceC4351m3;
                interfaceC28601c3 = interfaceC28601c3;
                interfaceC28601c5 = interfaceC28601c2;
                i36 = 1048576;
                z17 = false;
                i37 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                c28655q2.m87150e0(-69524583);
                c28655q2.m87173q(false);
            }
            objM87133R6 = c28655q2.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R6);
            }
            interfaceC28601c6 = (InterfaceC28601c1) objM87133R6;
            objM87133R7 = c28655q2.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = AbstractC28683x.m87272z(EnumC35102h.NORMAL);
                c28655q2.m87172p0(objM87133R7);
            }
            interfaceC28601c7 = (InterfaceC28601c1) objM87133R7;
            interfaceC29805a = (InterfaceC29805a) c28655q2.m87161k(AbstractC2453v1.f9573l);
            i38 = i15 & 14;
            if (i38 != 4) {
                z18 = true;
            } else {
                z18 = true;
            }
            if ((i15 & 3670016) == i36) {
                z19 = true;
            } else {
                z19 = false;
            }
            boolean z31117 = z18 | z19;
            if ((i15 & 7168) == i37) {
                z24 = true;
            } else {
                z24 = false;
            }
            z25 = z31117 | z24;
            objM87133R8 = c28655q2.m87133R();
            if (z25) {
                InterfaceC4339a interfaceC4339a1111119 = interfaceC4339a7;
                objM87133R8 = new b(viewState, interfaceC4339a1111119, function11, interfaceC28601c6, null);
                interfaceC4339a8 = interfaceC4339a1111119;
                function12 = function11;
                c28655q2.m87172p0(objM87133R8);
            } else {
                InterfaceC4339a interfaceC4339a11111110 = interfaceC4339a7;
                objM87133R8 = new b(viewState, interfaceC4339a11111110, function11, interfaceC28601c6, null);
                interfaceC4339a8 = interfaceC4339a11111110;
                function12 = function11;
                c28655q2.m87172p0(objM87133R8);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, viewState);
            enumC35102hM97398A = m97398A(interfaceC28601c7);
            enumC35102h = EnumC35102h.NORMAL;
            f13 = 0.0f;
            if (enumC35102hM97398A == enumC35102h) {
                f14 = 0.0f;
            } else {
                f14 = -90.0f;
            }
            i39 = i15;
            interfaceC28601c8 = interfaceC28601c5;
            float f1110 = f14;
            InterfaceC4339a interfaceC4339a11111111 = interfaceC4339a8;
            C11347e2 c11347e2M30574v1111 = AbstractC11348f.m30574v(500, 0, null, 6);
            objM87133R9 = c28655q2.m87133R();
            if (objM87133R9 == c28676v0) {
                objM87133R9 = new C1024j(7, interfaceC28601c7, interfaceC28601c6);
                c28655q2.m87172p0(objM87133R9);
            }
            InterfaceC28670t2 interfaceC28670t2M30588b17 = AbstractC11352g.m30588b(f1110, c11347e2M30574v1111, "itemRotationAnimation", (Function1) objM87133R9, c28655q2, 27696, 4);
            if (m97398A(interfaceC28601c7) != enumC35102h) {
                f13 = 1.0f;
            }
            C11347e2 c11347e2M30574v1112 = AbstractC11348f.m30574v(500, 0, null, 6);
            objM87133R10 = c28655q2.m87133R();
            if (objM87133R10 == c28676v0) {
                objM87133R10 = new C1024j(8, r47, interfaceC28601c7);
                c28655q2.m87172p0(objM87133R10);
            }
            interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v1112, "replayButtonOffsetAnimation", (Function1) objM87133R10, c28655q2, 27696, 4);
            fMo743q0 = ((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).mo743q0(4 * 35);
            if (viewState.getCardStackSize() > 0) {
                i44 = 1;
            } else {
                i44 = 0;
            }
            InterfaceC28670t2 interfaceC28670t2M30587a16 = AbstractC11352g.m30587a(i44 * 8, null, "counterPaddingAnimation", c28655q2, 384, 10);
            C2314t c2314t16 = C2314t.f9131w;
            Modifier modifierM3409f16 = AbstractC1102d.m3409f(1.0f, c2314t16);
            InterfaceC39127r0 interfaceC39127r0M66763d16 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            InterfaceC28601c1 interfaceC28601c114 = interfaceC28601c3;
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q2.m87165m();
            Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q2, modifierM3409f16);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d16);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m16);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N16);
            if (viewState.getCardStackSize() == 0) {
                z26 = false;
                c28655q2.m87150e0(-512086241);
                c28655q2.m87173q(false);
                c28655q3 = c28655q2;
            } else {
                z26 = false;
                c28655q2.m87150e0(-512086241);
                c28655q2.m87173q(false);
                c28655q3 = c28655q2;
            }
            InterfaceC16556w interfaceC16556wM115208c16 = viewState.getCardToDisplay();
            if (m97437r(interfaceC28601c8)) {
                interfaceC16556wM115211f = viewState.getNextCard();
            } else {
                interfaceC16556wM115211f = viewState.getNextCard();
            }
            if (m97437r(interfaceC28601c8)) {
                z27 = true;
            } else {
                z27 = true;
            }
            c28655q4 = c28655q3;
            i45 = i39 & 29360128;
            function13 = function10;
            AbstractC31592f.m97385i(interfaceC16556wM115208c16, interfaceC16556wM115211f, viewState.getCardStackSize(), z27, function9, interfaceC4351m3, viewState.getNotificationCardDismissAnimation(), function13, c28655q4, ((i39 >> 3) & 57344) | ((i39 << 3) & 458752) | i45, 0);
            Modifier modifierM3398t16 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t16, C2299e.f9116y), 0.0f, 0.0f, m97405H(interfaceC28670t2M30587a16), 0.0f, 11);
            zM87147d = c28655q4.m87147d(fMo743q0) | c28655q4.m87153g(interfaceC28670t2M30588b);
            objM87133R11 = c28655q4.m87133R();
            if (zM87147d) {
                objM87133R11 = new C2928d(fMo743q0, interfaceC28670t2M30588b, 1);
                c28655q4.m87172p0(objM87133R11);
            } else {
                objM87133R11 = new C2928d(fMo743q0, interfaceC28670t2M30588b, 1);
                c28655q4.m87172p0(objM87133R11);
            }
            Modifier modifierM3390l16 = AbstractC1099a.m3390l(modifierM3398t16, (Function1) objM87133R11);
            int iM115207b16 = viewState.getCardStackSize();
            if (m97398A(interfaceC28601c7) != enumC35102h) {
            }
            boolean zM115214i16 = viewState.getIsUpdating();
            boolean zM97444y16 = m97444y(r47);
            float fM97401D16 = m97401D(interfaceC28670t2M30588b17);
            if (viewState.getPlayShimmer()) {
                z28 = true;
            } else {
                z28 = true;
            }
            boolean zM115209d16 = viewState.getHighlightCounter();
            EnumC35102h enumC35102hM97398A17 = m97398A(interfaceC28601c7);
            C3733d1 c3733d1M11577e16 = AbstractC3788w0.m11577e(null, 3);
            if (i38 != 4) {
                z29 = true;
            } else {
                z29 = true;
            }
            if (i45 == 8388608) {
                z34 = true;
            } else {
                z34 = false;
            }
            boolean z31118 = z34 | z29;
            if ((i39 & 57344) == 16384) {
                z35 = true;
            } else {
                z35 = false;
            }
            zM87157i = z31118 | z35 | c28655q4.m87157i(interfaceC29805a);
            objM87133R12 = c28655q4.m87133R();
            if (zM87157i) {
                objM87133R12 = new C27198e((Object) viewState, function13, (Object) interfaceC4351m3, (Object) interfaceC29805a, 12);
                c28655q4.m87172p0(objM87133R12);
            } else {
                objM87133R12 = new C27198e((Object) viewState, function13, (Object) interfaceC4351m3, (Object) interfaceC29805a, 12);
                c28655q4.m87172p0(objM87133R12);
            }
            AbstractC35097c.m111000c(modifierM3390l16, iM115207b16, z37, fM97401D16, zM115214i16, zM97444y16, z28, zM115209d16, enumC35102hM97398A17, interfaceC4339a1111118, c3733d1M11577e16, (InterfaceC4339a) objM87133R12, c28655q4, (i39 << 21) & 1879048192, 6, 0);
            c28655q = c28655q4;
            c28655q.m87173q(true);
            function7 = function13;
            function5 = function12;
            interfaceC4339a5 = interfaceC4339a1111118;
            z16 = z14;
            interfaceC4351m2 = interfaceC4351m3;
            interfaceC4339a4 = interfaceC4339a11111111;
            function6 = function9;
        } else {
            c28655q = c28655q5;
            c28655q.m87138X();
            interfaceC4351m2 = interfaceC4351m;
            interfaceC4339a4 = interfaceC4339a2;
            z16 = z14;
            interfaceC4339a5 = interfaceC4339a3;
            function5 = function4;
            function6 = function2;
            function7 = function3;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1025j0(viewState, z16, interfaceC4339a5, function5, interfaceC4351m2, function6, interfaceC4339a4, function7, list, z13, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m97435p() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m97436q(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    private static final boolean m97437r(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final void m97438s(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: t */
    private static final boolean m97439t(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final void m97440u(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: v */
    private static final boolean m97441v(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m97442w(AbstractC36203g.c cVar, List list, Function1 function1, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        if (cVar.getCardToDisplay() == null) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(72702025);
            c28655q.m87173q(false);
        } else {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(72702026);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * 8), C2299e.f9110M, c28655q2, 6);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            c28655q2.m87150e0(469783607);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC25303l.m74291r((InterfaceC16556w) it.next(), AbstractC18667e0.m54175b(), null, function1, c28655q2, C25307p.f99300b << 3, 4);
            }
            AbstractC25012a.m73392y(c28655q2, false, true, false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m97443x(String str, EnumC36197a enumC36197a) {
        AbstractC22676k.m65750j(str, "<unused var>");
        AbstractC22676k.m65750j(enumC36197a, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final boolean m97444y(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final void m97445z(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }
}
