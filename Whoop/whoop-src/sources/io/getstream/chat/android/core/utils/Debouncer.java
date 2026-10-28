package io.getstream.chat.android.core.utils;

import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import io.getstream.chat.android.core.internal.coroutines.DispatcherProvider;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000f\u001a\u00020\t2\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/core/utils/Debouncer;", "", "", "debounceMs", "Lbc3/c0;", "scope", "<init>", "(JLbc3/c0;)V", "Lkotlin/Function0;", "Ll83/a0;", "work", "submit", "(Lc93/a;)V", "Lkotlin/Function1;", "Lq83/d;", "submitSuspendable", "(Lkotlin/jvm/functions/Function1;)V", "cancelLastDebounce", "()V", "shutdown", "J", "Lbc3/c0;", "Lbc3/k1;", "job", "Lbc3/k1;", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class Debouncer {
    private final long debounceMs;
    private InterfaceC3027k1 job;
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: io.getstream.chat.android.core.utils.Debouncer$submit$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.core.utils.Debouncer$submit$1", m100430f = "Debouncer.kt", m100431l = {46}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194631 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ InterfaceC4339a $work;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194631(InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super C194631> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$work = interfaceC4339a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return Debouncer.this.new C194631(this.$work, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C194631) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                long j7 = Debouncer.this.debounceMs;
                this.label = 1;
                if (AbstractC3034m0.m8782b(j7, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.$work.invoke();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.core.utils.Debouncer$submitSuspendable$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.core.utils.Debouncer$submitSuspendable$1", m100430f = "Debouncer.kt", m100431l = {58, 59}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194641 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Function1 $work;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194641(Function1 function1, InterfaceC30057d<? super C194641> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$work = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return Debouncer.this.new C194641(this.$work, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C194641) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
        
            if (r7.invoke(r6) == r0) goto L15;
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
                int r1 = r6.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r7)
                goto L39
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
                io.getstream.chat.android.core.utils.Debouncer r7 = io.getstream.chat.android.core.utils.Debouncer.this
                long r4 = io.getstream.chat.android.core.utils.Debouncer.access$getDebounceMs$p(r7)
                r6.label = r3
                java.lang.Object r7 = bc3.AbstractC3034m0.m8782b(r4, r6)
                if (r7 != r0) goto L2e
                goto L38
            L2e:
                kotlin.jvm.functions.Function1 r7 = r6.$work
                r6.label = r2
                java.lang.Object r7 = r7.invoke(r6)
                if (r7 != r0) goto L39
            L38:
                return r0
            L39:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.core.utils.Debouncer.C194641.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public Debouncer(long j7, InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(scope, "scope");
        this.debounceMs = j7;
        this.scope = scope;
    }

    public final void cancelLastDebounce() {
        InterfaceC3027k1 interfaceC3027k1 = this.job;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
    }

    public final void shutdown() {
        AbstractC3006f0.m8714h(this.scope, null);
    }

    public final void submit(InterfaceC4339a work) {
        AbstractC22676k.m65750j(work, "work");
        InterfaceC3027k1 interfaceC3027k1 = this.job;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        this.job = AbstractC3006f0.m8732z(this.scope, null, null, new C194631(work, null), 3);
    }

    public final void submitSuspendable(Function1 work) {
        AbstractC22676k.m65750j(work, "work");
        InterfaceC3027k1 interfaceC3027k1 = this.job;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        this.job = AbstractC3006f0.m8732z(this.scope, null, null, new C194641(work, null), 3);
    }

    public /* synthetic */ Debouncer(long j7, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j7, (i13 & 2) != 0 ? AbstractC3006f0.m8708b(DispatcherProvider.INSTANCE.getMain()) : interfaceC2994c0);
    }
}
