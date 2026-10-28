package io.getstream.chat.android.client.utils.buffer;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.InterfaceC13037f2;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.core.internal.coroutines.DispatcherProvider;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import l83.C23454a0;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
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
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0011J!\u0010\u0017\u001a\u00020\u000f2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\u0014\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010'R$\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010(¨\u0006)"}, m65681d2 = {"Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;", "T", "", "", "suffix", "", "bufferLimit", "Lec3/f2;", "", "customTrigger", "<init>", "(Ljava/lang/String;ILec3/f2;)V", "aboveSafetyThreshold", "()Z", "src", "Ll83/a0;", "propagateData", "(Ljava/lang/String;)V", "hold", "()V", "active", "Lkotlin/Function1;", "func", "subscribe", "(Lkotlin/jvm/functions/Function1;)V", "data", "enqueueData", "(Ljava/lang/Object;)V", "I", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Ljava/util/Queue;", "events", "Ljava/util/Queue;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lkotlin/jvm/functions/Function1;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StartStopBuffer<T> {
    private AtomicBoolean active;
    private final int bufferLimit;
    private final Queue<T> events;
    private Function1 func;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.utils.buffer.StartStopBuffer$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.utils.buffer.StartStopBuffer$1", m100430f = "StartStopBuffer.kt", m100431l = {48}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194511 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ InterfaceC13037f2 $customTrigger;
        int label;
        final /* synthetic */ StartStopBuffer<T> this$0;

        /* JADX INFO: renamed from: io.getstream.chat.android.client.utils.buffer.StartStopBuffer$1$1, reason: invalid class name */
        @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.utils.buffer.StartStopBuffer$1$1", m100430f = "StartStopBuffer.kt", m100431l = {}, m100432m = "invokeSuspend")
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"", "active", "Ll83/a0;", "<anonymous>", "(Z)V"}, m65682k = 3, m65683mv = {2, 2, 0})
        public static final class AnonymousClass1 extends AbstractC32275i implements InterfaceC4351m {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ StartStopBuffer<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(StartStopBuffer<T> startStopBuffer, InterfaceC30057d<? super AnonymousClass1> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.this$0 = startStopBuffer;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, interfaceC30057d);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // c93.InterfaceC4351m
            public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke(((Boolean) obj).booleanValue(), (InterfaceC30057d<? super C23454a0>) obj2);
                return C23454a0.f92919a;
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                boolean z4 = this.Z$0;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                C2345k logger = this.this$0.getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30462p("<init> active: ", z4), null);
                }
                if (z4) {
                    this.this$0.active("init");
                } else {
                    this.this$0.hold();
                }
                return C23454a0.f92919a;
            }

            public final Object invoke(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(Boolean.valueOf(z4), interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                anonymousClass1.invokeSuspend(c23454a0);
                return c23454a0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194511(InterfaceC13037f2 interfaceC13037f2, StartStopBuffer<T> startStopBuffer, InterfaceC30057d<? super C194511> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$customTrigger = interfaceC13037f2;
            this.this$0 = startStopBuffer;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C194511(this.$customTrigger, this.this$0, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C194511) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13037f2 interfaceC13037f2 = this.$customTrigger;
                if (interfaceC13037f2 != null) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (AbstractC13091v.m36604n(interfaceC13037f2, anonymousClass1, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: io.getstream.chat.android.client.utils.buffer.StartStopBuffer$propagateData$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.utils.buffer.StartStopBuffer$propagateData$1", m100430f = "StartStopBuffer.kt", m100431l = {92}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C194521 extends AbstractC32275i implements InterfaceC4351m {
        int I$0;
        Object L$0;
        int label;
        final /* synthetic */ StartStopBuffer<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194521(StartStopBuffer<T> startStopBuffer, InterfaceC30057d<? super C194521> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.this$0 = startStopBuffer;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C194521(this.this$0, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C194521) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0024  */
        /* JADX WARN: Code duplicated, block: B:13:0x0030  */
        /* JADX WARN: Code duplicated, block: B:19:0x005f A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005d -> B:20:0x0060). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:9:0x0018
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r6.label
                r2 = 1
                if (r1 == 0) goto L15
                if (r1 != r2) goto Ld
                p505ts.AbstractC34132o.m107864I(r7)
                goto L60
            Ld:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L15:
                p505ts.AbstractC34132o.m107864I(r7)
            L18:
                io.getstream.chat.android.client.utils.buffer.StartStopBuffer<T> r7 = r6.this$0
                java.util.concurrent.atomic.AtomicBoolean r7 = io.getstream.chat.android.client.utils.buffer.StartStopBuffer.access$getActive$p(r7)
                boolean r7 = r7.get()
                if (r7 == 0) goto L30
                io.getstream.chat.android.client.utils.buffer.StartStopBuffer<T> r7 = r6.this$0
                java.util.Queue r7 = io.getstream.chat.android.client.utils.buffer.StartStopBuffer.access$getEvents$p(r7)
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L38
            L30:
                io.getstream.chat.android.client.utils.buffer.StartStopBuffer<T> r7 = r6.this$0
                boolean r7 = io.getstream.chat.android.client.utils.buffer.StartStopBuffer.access$aboveSafetyThreshold(r7)
                if (r7 == 0) goto L63
            L38:
                io.getstream.chat.android.client.utils.buffer.StartStopBuffer<T> r7 = r6.this$0
                java.util.Queue r7 = io.getstream.chat.android.client.utils.buffer.StartStopBuffer.access$getEvents$p(r7)
                java.lang.Object r7 = r7.poll()
                if (r7 == 0) goto L18
                io.getstream.chat.android.client.utils.buffer.StartStopBuffer<T> r1 = r6.this$0
                io.getstream.chat.android.core.internal.coroutines.DispatcherProvider r3 = io.getstream.chat.android.core.internal.coroutines.DispatcherProvider.INSTANCE
                bc3.z r3 = r3.getMain()
                io.getstream.chat.android.client.utils.buffer.StartStopBuffer$propagateData$1$1$1 r4 = new io.getstream.chat.android.client.utils.buffer.StartStopBuffer$propagateData$1$1$1
                r5 = 0
                r4.<init>(r1, r7, r5)
                r6.L$0 = r5
                r7 = 0
                r6.I$0 = r7
                r6.label = r2
                java.lang.Object r7 = bc3.AbstractC3006f0.m8705K(r3, r4, r6)
                if (r7 != r0) goto L60
                return r0
            L60:
                l83.a0 r7 = (l83.C23454a0) r7
                goto L18
            L63:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.utils.buffer.StartStopBuffer.C194521.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public StartStopBuffer() {
        this(null, 0, null, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean aboveSafetyThreshold() {
        int size = this.events.size();
        int i13 = this.bufferLimit;
        return size > i13 && i13 != -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final void propagateData(String src) {
        AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(DispatcherProvider.INSTANCE.getIO()), null, null, new C194521(this, null), 3);
    }

    public final void active(String src) {
        AbstractC22676k.m65750j(src, "src");
        this.active.set(true);
        if (this.func != null) {
            propagateData(src);
        }
    }

    public final void enqueueData(T data) {
        this.events.offer(data);
        if (this.active.get() || aboveSafetyThreshold()) {
            propagateData("enqueue");
        }
    }

    public final void hold() {
        this.active.set(false);
    }

    public final void subscribe(Function1 func) {
        AbstractC22676k.m65750j(func, "func");
        this.func = func;
        if (this.active.get()) {
            propagateData("subscribe");
        }
    }

    public StartStopBuffer(String suffix, int i13, InterfaceC13037f2 interfaceC13037f2) {
        AbstractC22676k.m65750j(suffix, "suffix");
        this.bufferLimit = i13;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:StartStopBuffer-".concat(suffix));
        this.events = new ConcurrentLinkedQueue();
        this.active = new AtomicBoolean(true);
        AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(DispatcherProvider.INSTANCE.getIO()), null, null, new C194511(interfaceC13037f2, this, null), 3);
    }

    public /* synthetic */ StartStopBuffer(String str, int i13, InterfaceC13037f2 interfaceC13037f2, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? "Default" : str, (i14 & 2) != 0 ? -1 : i13, (i14 & 4) != 0 ? null : interfaceC13037f2);
    }
}
