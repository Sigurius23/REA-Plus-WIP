package hl0;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: hl0.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lhl0/f;", "Lod1/g;", "Lhl0/c;", "Lkotlin/time/Duration;", "delay", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "J", "b", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17397f implements InterfaceC27844g<C17394c, C17394c> {

    /* JADX INFO: renamed from: c */
    private static final long f67360c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long delay;

    /* JADX INFO: renamed from: hl0.f$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.feedback.FeedbackToastTimerInteractor$interact$$inlined$flatMapLatest$1", m100430f = "FeedbackToastTimerInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f67362w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f67363x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f67364y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C17397f f67365z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, C17397f c17397f) {
            super(3, interfaceC30057d);
            this.f67365z = c17397f;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, C17394c c17394c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f67365z);
            bVar.f67363x = interfaceC13062m;
            bVar.f67364y = c17394c;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f67362w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f67363x;
                C17394c c17394c = (C17394c) this.f67364y;
                InterfaceC13058l c13084s1 = c17394c.getShowToast() ? new C13084s1(new c(c17394c, this.f67365z, null)) : new C0456u(c17394c, 1);
                this.f67363x = null;
                this.f67364y = null;
                this.f67362w = 1;
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
            return invoke((InterfaceC13062m) obj, (C17394c) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: hl0.f$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.bot.domain.feedback.FeedbackToastTimerInteractor$interact$1$1", m100430f = "FeedbackToastTimerInteractor.kt", m100431l = {C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER, C1533u.RECORDING_METHOD_FIELD_NUMBER, 24}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lhl0/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f67366w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f67367x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C17394c f67368y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C17397f f67369z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C17394c c17394c, C17397f c17397f, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f67368y = c17394c;
            this.f67369z = c17397f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f67368y, this.f67369z, interfaceC30057d);
            cVar.f67367x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
        
            if (r0.emit(r11, r10) == r1) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = r10.f67367x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r10.f67366w
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L27
                if (r2 == r5) goto L23
                if (r2 == r4) goto L1f
                if (r2 != r3) goto L17
                p505ts.AbstractC34132o.m107864I(r11)
                goto L5f
            L17:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1f:
                p505ts.AbstractC34132o.m107864I(r11)
                goto L48
            L23:
                p505ts.AbstractC34132o.m107864I(r11)
                goto L37
            L27:
                p505ts.AbstractC34132o.m107864I(r11)
                hl0.c r11 = r10.f67368y
                r10.f67367x = r0
                r10.f67366w = r5
                java.lang.Object r11 = r0.emit(r11, r10)
                if (r11 != r1) goto L37
                goto L5e
            L37:
                hl0.f r11 = r10.f67369z
                long r5 = hl0.C17397f.m49238c(r11)
                r10.f67367x = r0
                r10.f67366w = r4
                java.lang.Object r11 = bc3.AbstractC3034m0.m8783c(r5, r10)
                if (r11 != r1) goto L48
                goto L5e
            L48:
                hl0.c r4 = r10.f67368y
                r8 = 5
                r9 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                hl0.c r11 = hl0.C17394c.m49231b(r4, r5, r6, r7, r8, r9)
                r2 = 0
                r10.f67367x = r2
                r10.f67366w = r3
                java.lang.Object r11 = r0.emit(r11, r10)
                if (r11 != r1) goto L5f
            L5e:
                return r1
            L5f:
                l83.a0 r11 = l83.C23454a0.f92919a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: hl0.C17397f.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        Duration.Companion companion = Duration.INSTANCE;
        f67360c = DurationKt.toDuration(1.5d, DurationUnit.SECONDS);
    }

    public /* synthetic */ C17397f(long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j7);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new b(null, this));
    }

    private C17397f(long j7) {
        this.delay = j7;
    }

    public /* synthetic */ C17397f(long j7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? f67360c : j7, null);
    }
}
