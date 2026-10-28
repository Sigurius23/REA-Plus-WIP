package vg0;

import c93.InterfaceC4351m;
import com.whoop.p057ai.chat.api.AiChatApi;
import com.whoop.p057ai.chat.api.MarkTurnAsSeenRequestBody;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: vg0.h0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lvg0/h0;", "Lod1/g;", "Lvg0/g0;", "Lvg0/j0;", "Lcom/whoop/ai/chat/api/AiChatApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/ai/chat/api/AiChatApi;Ltr2/n;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/ai/chat/api/AiChatApi;", "b", "Ltr2/n;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35991h0 implements InterfaceC27844g<C35989g0, AbstractC35995j0> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AiChatApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: vg0.h0$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.MarkTurnAsSeenInteractor$interact$$inlined$flatMapLatest$1", m100430f = "MarkTurnAsSeenInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f153394w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f153395x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f153396y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C35991h0 f153397z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C35991h0 c35991h0) {
            super(3, interfaceC30057d);
            this.f153397z = c35991h0;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C35989g0 c35989g0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f153397z);
            aVar.f153395x = interfaceC13062m;
            aVar.f153396y = c35989g0;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f153394w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f153395x;
                C13084s1 c13084s1 = new C13084s1(new b((C35989g0) this.f153396y, this.f153397z, null));
                this.f153395x = null;
                this.f153396y = null;
                this.f153394w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (C35989g0) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: vg0.h0$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.MarkTurnAsSeenInteractor$interact$1$1", m100430f = "MarkTurnAsSeenInteractor.kt", m100431l = {46, 50, 54, 65, 70}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lvg0/j0;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C35991h0 f153398E;

        /* JADX INFO: renamed from: w */
        Object f153399w;

        /* JADX INFO: renamed from: x */
        int f153400x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f153401y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C35989g0 f153402z;

        /* JADX INFO: renamed from: vg0.h0$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.ai.chat.domain.interactors.MarkTurnAsSeenInteractor$interact$1$1$response$1", m100430f = "MarkTurnAsSeenInteractor.kt", m100431l = {55}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f153403w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C35991h0 f153404x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C35989g0 f153405y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C35991h0 c35991h0, C35989g0 c35989g0, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f153404x = c35991h0;
                this.f153405y = c35989g0;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f153404x, this.f153405y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f153403w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                AiChatApi aiChatApi = this.f153404x.api;
                String fingerprint = this.f153405y.getFingerprint();
                String turnId = this.f153405y.getTurnId();
                MarkTurnAsSeenRequestBody markTurnAsSeenRequestBody = new MarkTurnAsSeenRequestBody(new Long(this.f153405y.getTtfmtMs()), this.f153405y.getTtpiaMs());
                this.f153403w = 1;
                Object objMarkTurnAsSeen = aiChatApi.markTurnAsSeen(fingerprint, turnId, markTurnAsSeenRequestBody, this);
                return objMarkTurnAsSeen == enumC31071a ? enumC31071a : objMarkTurnAsSeen;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C35989g0 c35989g0, C35991h0 c35991h0, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f153402z = c35989g0;
            this.f153398E = c35991h0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f153402z, this.f153398E, interfaceC30057d);
            bVar.f153401y = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:36:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:38:0x00f1  */
        /* JADX WARN: Code duplicated, block: B:40:0x011f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:41:0x0120 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:42:0x0121  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM108729b;
            InterfaceC34385a interfaceC34385a;
            AbstractC35995j0.a aVar;
            AbstractC35995j0.b bVar;
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f153401y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f153400x;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 != 0) {
                if (i13 == 1) {
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                if (i13 == 2) {
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                if (i13 == 3) {
                    AbstractC34132o.m107864I(obj);
                    objM108729b = obj;
                    interfaceC34385a = (InterfaceC34385a) objM108729b;
                    if (interfaceC34385a instanceof InterfaceC34385a.c) {
                        InterfaceC34116n interfaceC34116n = this.f153398E.logger;
                        String turnId = this.f153402z.getTurnId();
                        Duration.Companion companion = Duration.INSTANCE;
                        StringBuilder sbM32000s = AbstractC11895b.m32000s("Turn marked as seen. TurnId: ", turnId, Duration.m134276getInWholeSecondsimpl(DurationKt.toDuration(this.f153402z.getTtfmtMs(), DurationUnit.MILLISECONDS)), " in: ");
                        sbM32000s.append("s");
                        interfaceC34116n.mo85219j(sbM32000s.toString(), new AbstractC30556a.a[0]);
                        bVar = AbstractC35995j0.b.f153435a;
                        this.f153401y = null;
                        this.f153399w = null;
                        this.f153400x = 4;
                        if (interfaceC13062m.emit(bVar, this) != enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (interfaceC34385a instanceof InterfaceC34385a.b) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f153398E.logger.mo85219j(AbstractC11266d.m30461o("Failed to mark turn as seen. TurnId: ", this.f153402z.getTurnId()), new AbstractC30556a.a[0]);
                        aVar = new AbstractC35995j0.a(((InterfaceC34385a.b) interfaceC34385a).getErrorMessage());
                        this.f153401y = null;
                        this.f153399w = null;
                        this.f153400x = 5;
                        if (interfaceC13062m.emit(aVar, this) != enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i13 != 4 && i13 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return c23454a0;
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC39414r.m125890i0(this.f153402z.getFingerprint())) {
                AbstractC35995j0.a aVar2 = new AbstractC35995j0.a("Conversation fingerprint is missing");
                this.f153401y = null;
                this.f153400x = 1;
                if (interfaceC13062m.emit(aVar2, this) != enumC31071a) {
                    return c23454a0;
                }
            } else if (AbstractC39414r.m125890i0(this.f153402z.getTurnId())) {
                AbstractC35995j0.a aVar3 = new AbstractC35995j0.a("Turn ID is missing");
                this.f153401y = null;
                this.f153400x = 2;
                if (interfaceC13062m.emit(aVar3, this) != enumC31071a) {
                    return c23454a0;
                }
            } else {
                InterfaceC34385a.Companion companion2 = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n2 = this.f153398E.logger;
                a aVar4 = new a(this.f153398E, this.f153402z, null);
                this.f153401y = interfaceC13062m;
                this.f153400x = 3;
                objM108729b = InterfaceC34385a.Companion.m108729b(companion2, interfaceC34116n2, null, null, aVar4, this, 6, null);
                if (objM108729b != enumC31071a) {
                    interfaceC34385a = (InterfaceC34385a) objM108729b;
                    if (interfaceC34385a instanceof InterfaceC34385a.c) {
                        InterfaceC34116n interfaceC34116n3 = this.f153398E.logger;
                        String turnId2 = this.f153402z.getTurnId();
                        Duration.Companion companion3 = Duration.INSTANCE;
                        StringBuilder sbM32000s2 = AbstractC11895b.m32000s("Turn marked as seen. TurnId: ", turnId2, Duration.m134276getInWholeSecondsimpl(DurationKt.toDuration(this.f153402z.getTtfmtMs(), DurationUnit.MILLISECONDS)), " in: ");
                        sbM32000s2.append("s");
                        interfaceC34116n3.mo85219j(sbM32000s2.toString(), new AbstractC30556a.a[0]);
                        bVar = AbstractC35995j0.b.f153435a;
                        this.f153401y = null;
                        this.f153399w = null;
                        this.f153400x = 4;
                        if (interfaceC13062m.emit(bVar, this) != enumC31071a) {
                            return c23454a0;
                        }
                    } else {
                        if (interfaceC34385a instanceof InterfaceC34385a.b) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f153398E.logger.mo85219j(AbstractC11266d.m30461o("Failed to mark turn as seen. TurnId: ", this.f153402z.getTurnId()), new AbstractC30556a.a[0]);
                        aVar = new AbstractC35995j0.a(((InterfaceC34385a.b) interfaceC34385a).getErrorMessage());
                        this.f153401y = null;
                        this.f153399w = null;
                        this.f153400x = 5;
                        if (interfaceC13062m.emit(aVar, this) != enumC31071a) {
                            return c23454a0;
                        }
                    }
                }
            }
            return enumC31071a;
        }
    }

    public C35991h0(AiChatApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new a(null, this));
    }

    public /* synthetic */ C35991h0(AiChatApi aiChatApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(aiChatApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("MarkTurnAsSeenInteractor") : interfaceC34116n);
    }
}
