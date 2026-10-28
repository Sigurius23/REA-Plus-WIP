package io.getstream.chat.android.client;

import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.C3075y1;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.core.internal.coroutines.DispatcherProvider;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import l83.C23454a0;
import l83.InterfaceC23462h;
import m83.C25235a0;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"Lio/getstream/chat/android/client/StreamLifecycleObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lbc3/c0;", "scope", "Landroidx/lifecycle/x;", "lifecycle", "<init>", "(Lbc3/c0;Landroidx/lifecycle/x;)V", "Lio/getstream/chat/android/client/LifecycleHandler;", "handler", "Ll83/a0;", "observe", "(Lio/getstream/chat/android/client/LifecycleHandler;Lq83/d;)Ljava/lang/Object;", "dispose", "Landroidx/lifecycle/g0;", "owner", "onResume", "(Landroidx/lifecycle/g0;)V", "onStop", "Lbc3/c0;", "Landroidx/lifecycle/x;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "", "recurringResumeEvent", "Z", "", "handlers", "Ljava/util/Set;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isObserving", "Ljava/util/concurrent/atomic/AtomicBoolean;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StreamLifecycleObserver implements DefaultLifecycleObserver {
    private Set<? extends LifecycleHandler> handlers;
    private final AtomicBoolean isObserving;
    private final AbstractC1638x lifecycle;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private boolean recurringResumeEvent;
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.StreamLifecycleObserver$dispose$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.StreamLifecycleObserver$dispose$2", m100430f = "StreamLifecycleObserver.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190002 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ LifecycleHandler $handler;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190002(LifecycleHandler lifecycleHandler, InterfaceC30057d<? super C190002> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$handler = lifecycleHandler;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return StreamLifecycleObserver.this.new C190002(this.$handler, interfaceC30057d);
        }

        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C190002 c190002 = (C190002) create(interfaceC2994c0, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c190002.invokeSuspend(c23454a0);
            return c23454a0;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            StreamLifecycleObserver streamLifecycleObserver = StreamLifecycleObserver.this;
            streamLifecycleObserver.handlers = AbstractC12350b.m34604y(this.$handler, streamLifecycleObserver.handlers);
            if (StreamLifecycleObserver.this.handlers.isEmpty() && StreamLifecycleObserver.this.isObserving.compareAndSet(true, false)) {
                StreamLifecycleObserver.this.lifecycle.mo4988d(StreamLifecycleObserver.this);
                C2345k logger = StreamLifecycleObserver.this.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, "[dispose] unsubscribed", null);
                }
            }
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2994c0) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.StreamLifecycleObserver$observe$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.StreamLifecycleObserver$observe$2", m100430f = "StreamLifecycleObserver.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190012 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ LifecycleHandler $handler;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190012(LifecycleHandler lifecycleHandler, InterfaceC30057d<? super C190012> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$handler = lifecycleHandler;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return StreamLifecycleObserver.this.new C190012(this.$handler, interfaceC30057d);
        }

        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C190012 c190012 = (C190012) create(interfaceC2994c0, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c190012.invokeSuspend(c23454a0);
            return c23454a0;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            StreamLifecycleObserver streamLifecycleObserver = StreamLifecycleObserver.this;
            streamLifecycleObserver.handlers = AbstractC12350b.m34555D(this.$handler, streamLifecycleObserver.handlers);
            if (StreamLifecycleObserver.this.isObserving.compareAndSet(false, true)) {
                StreamLifecycleObserver.this.recurringResumeEvent = false;
                StreamLifecycleObserver.this.lifecycle.mo4986a(StreamLifecycleObserver.this);
                C2345k logger = StreamLifecycleObserver.this.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, "[observe] subscribed", null);
                }
            }
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2994c0) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.StreamLifecycleObserver$onResume$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.StreamLifecycleObserver$onResume$2", m100430f = "StreamLifecycleObserver.kt", m100431l = {67}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190022 extends AbstractC32275i implements InterfaceC4351m {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        public C190022(InterfaceC30057d<? super C190022> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return StreamLifecycleObserver.this.new C190022(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C190022) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            int i13;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.label;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                it = StreamLifecycleObserver.this.handlers.iterator();
                i13 = 0;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.I$0;
                it = (Iterator) this.L$1;
                AbstractC34132o.m107864I(obj);
            }
            while (it.hasNext()) {
                LifecycleHandler lifecycleHandler = (LifecycleHandler) it.next();
                this.L$0 = null;
                this.L$1 = it;
                this.L$2 = null;
                this.L$3 = null;
                this.I$0 = i13;
                this.I$1 = 0;
                this.label = 1;
                if (lifecycleHandler.resume(this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.StreamLifecycleObserver$onStop$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.StreamLifecycleObserver$onStop$1", m100430f = "StreamLifecycleObserver.kt", m100431l = {76}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190031 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ InterfaceC1585g0 $owner;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190031(InterfaceC1585g0 interfaceC1585g0, InterfaceC30057d<? super C190031> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$owner = interfaceC1585g0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return StreamLifecycleObserver.this.new C190031(this.$owner, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C190031) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            int i13;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.label;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C2345k logger = StreamLifecycleObserver.this.getLogger();
                InterfaceC1585g0 interfaceC1585g0 = this.$owner;
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, "[onStop] owner: " + interfaceC1585g0, null);
                }
                it = StreamLifecycleObserver.this.handlers.iterator();
                i13 = 0;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.I$0;
                it = (Iterator) this.L$1;
                AbstractC34132o.m107864I(obj);
            }
            while (it.hasNext()) {
                LifecycleHandler lifecycleHandler = (LifecycleHandler) it.next();
                this.L$0 = null;
                this.L$1 = it;
                this.L$2 = null;
                this.L$3 = null;
                this.I$0 = i13;
                this.I$1 = 0;
                this.label = 1;
                if (lifecycleHandler.stopped(this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }
    }

    public StreamLifecycleObserver(InterfaceC2994c0 scope, AbstractC1638x lifecycle) {
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(lifecycle, "lifecycle");
        this.scope = scope;
        this.lifecycle = lifecycle;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:LifecycleObserver");
        this.handlers = C25235a0.f99113w;
        this.isObserving = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    public final Object dispose(LifecycleHandler lifecycleHandler, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM8705K = AbstractC3006f0.m8705K(C3075y1.f12109w.plus(DispatcherProvider.INSTANCE.getMain()), new C190002(lifecycleHandler, null), interfaceC30057d);
        return objM8705K == EnumC31071a.f128113w ? objM8705K : C23454a0.f92919a;
    }

    public final Object observe(LifecycleHandler lifecycleHandler, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM8705K = AbstractC3006f0.m8705K(DispatcherProvider.INSTANCE.getMain(), new C190012(lifecycleHandler, null), interfaceC30057d);
        return objM8705K == EnumC31071a.f128113w ? objM8705K : C23454a0.f92919a;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[onResume] owner: " + owner + ", recurringResumeEvent: " + this.recurringResumeEvent, null);
        }
        if (this.recurringResumeEvent) {
            AbstractC3006f0.m8732z(this.scope, null, null, new C190022(null), 3);
        }
        this.recurringResumeEvent = true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        AbstractC3006f0.m8732z(this.scope, null, null, new C190031(owner, null), 3);
    }
}
