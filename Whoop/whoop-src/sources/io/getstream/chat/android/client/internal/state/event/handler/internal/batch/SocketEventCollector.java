package io.getstream.chat.android.client.internal.state.event.handler.internal.batch;

import androidx.core.app.NotificationCompat;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.C19383k;
import io.getstream.chat.android.client.api.state.C19031a;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.internal.state.event.handler.internal.utils.ChatEventUtilsKt;
import java.util.Date;
import java.util.List;
import l83.C23454a0;
import l83.InterfaceC23462h;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 42\u00020\u0001:\u00014B[\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u0012\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011B5\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u001e\u0010\u0019J\u0018\u0010 \u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0080@¢\u0006\u0004\b\u001f\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R0\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010$R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;", "", "Lbc3/c0;", "scope", "", "timeout", "timeLimit", "", "itemCountLimit", "Lkotlin/Function0;", "now", "Lkotlin/Function2;", "Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;", "Lq83/d;", "Ll83/a0;", "fireEvent", "<init>", "(Lbc3/c0;JJILc93/a;Lc93/m;)V", "(Lbc3/c0;Lc93/m;)V", "Lio/getstream/chat/android/client/events/ChatEvent;", NotificationCompat.CATEGORY_EVENT, "", "add", "(Lio/getstream/chat/android/client/events/ChatEvent;Lq83/d;)Ljava/lang/Object;", "firePostponed", "(Lq83/d;)Ljava/lang/Object;", "scheduleTimeout", "()V", "onItemCountLimit", "onTimeLimit", "doFire", "collect$stream_chat_android_client_release", "collect", "Lbc3/c0;", "J", "I", "Lc93/m;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Lmc3/a;", "mutex", "Lmc3/a;", "Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;", "postponed", "Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;", "Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/TimeoutJob;", "timeoutJob", "Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/TimeoutJob;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SocketEventCollector {
    private static final Companion Companion = new Companion();
    private static final int ITEM_COUNT_LIMIT = 200;
    private static final String TAG = "Chat:EventCollector";
    private static final long TIMEOUT = 300;
    private static final long TIME_LIMIT = 1000;
    private final InterfaceC4351m fireEvent;
    private final int itemCountLimit;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final InterfaceC25435a mutex;
    private final Postponed postponed;
    private final InterfaceC2994c0 scope;
    private final long timeLimit;
    private final long timeout;
    private final TimeoutJob timeoutJob;

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector$Companion;", "", "<init>", "()V", "TAG", "", "TIMEOUT", "", "TIME_LIMIT", "ITEM_COUNT_LIMIT", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.event.handler.internal.batch.SocketEventCollector$add$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.event.handler.internal.batch.SocketEventCollector", m100430f = "SocketEventCollector.kt", m100431l = {218, 92, 93}, m100432m = "add")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192851 extends AbstractC32269c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C192851(InterfaceC30057d<? super C192851> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SocketEventCollector.this.add(null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.event.handler.internal.batch.SocketEventCollector$firePostponed$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.event.handler.internal.batch.SocketEventCollector", m100430f = "SocketEventCollector.kt", m100431l = {218, 107}, m100432m = "firePostponed")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192861 extends AbstractC32269c {
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C192861(InterfaceC30057d<? super C192861> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SocketEventCollector.this.firePostponed(this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.event.handler.internal.batch.SocketEventCollector$scheduleTimeout$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.event.handler.internal.batch.SocketEventCollector$scheduleTimeout$1", m100430f = "SocketEventCollector.kt", m100431l = {114, 218, 117}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C192871 extends AbstractC32275i implements InterfaceC4351m {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;

        public C192871(InterfaceC30057d<? super C192871> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SocketEventCollector.this.new C192871(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C192871) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x008d  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC25435a interfaceC25435a;
            SocketEventCollector socketEventCollector;
            int i13;
            InterfaceC25435a interfaceC25435a2;
            Throwable th3;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.label;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                long j7 = SocketEventCollector.this.timeout;
                this.label = 1;
                if (AbstractC3034m0.m8782b(j7, this) != enumC31071a) {
                }
                return enumC31071a;
            }
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC25435a2 = (InterfaceC25435a) this.L$0;
                    try {
                        AbstractC34132o.m107864I(obj);
                        interfaceC25435a2.mo68214i(null);
                        return C23454a0.f92919a;
                    } catch (Throwable th4) {
                        th3 = th4;
                        interfaceC25435a2.mo68214i(null);
                        throw th3;
                    }
                }
                i13 = this.I$0;
                socketEventCollector = (SocketEventCollector) this.L$1;
                InterfaceC25435a interfaceC25435a3 = (InterfaceC25435a) this.L$0;
                AbstractC34132o.m107864I(obj);
                interfaceC25435a = interfaceC25435a3;
                try {
                    this.L$0 = interfaceC25435a;
                    this.L$1 = null;
                    this.I$0 = i13;
                    this.I$1 = 0;
                    this.label = 3;
                    if (socketEventCollector.doFire(this) != enumC31071a) {
                        interfaceC25435a2 = interfaceC25435a;
                        interfaceC25435a2.mo68214i(null);
                        return C23454a0.f92919a;
                    }
                    return enumC31071a;
                } catch (Throwable th5) {
                    interfaceC25435a2 = interfaceC25435a;
                    th3 = th5;
                    interfaceC25435a2.mo68214i(null);
                    throw th3;
                }
            }
            AbstractC34132o.m107864I(obj);
            C2345k logger = SocketEventCollector.this.getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.INFO;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "[scheduleTimeout] timeout is triggered", null);
            }
            interfaceC25435a = SocketEventCollector.this.mutex;
            SocketEventCollector socketEventCollector2 = SocketEventCollector.this;
            this.L$0 = interfaceC25435a;
            this.L$1 = socketEventCollector2;
            this.I$0 = 0;
            this.label = 2;
            if (interfaceC25435a.mo68211b(this) != enumC31071a) {
                socketEventCollector = socketEventCollector2;
                i13 = 0;
                this.L$0 = interfaceC25435a;
                this.L$1 = null;
                this.I$0 = i13;
                this.I$1 = 0;
                this.label = 3;
                if (socketEventCollector.doFire(this) != enumC31071a) {
                    interfaceC25435a2 = interfaceC25435a;
                    interfaceC25435a2.mo68214i(null);
                    return C23454a0.f92919a;
                }
            }
            return enumC31071a;
        }
    }

    public SocketEventCollector(InterfaceC2994c0 scope, long j7, long j13, int i13, InterfaceC4339a now, InterfaceC4351m fireEvent) {
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(now, "now");
        AbstractC22676k.m65750j(fireEvent, "fireEvent");
        this.scope = scope;
        this.timeout = j7;
        this.timeLimit = j13;
        this.itemCountLimit = i13;
        this.fireEvent = fireEvent;
        this.logger = AbstractC1772c1.m5382S(this, TAG);
        this.mutex = AbstractC25438d.m74669a();
        this.postponed = new Postponed(now);
        this.timeoutJob = new TimeoutJob();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010c, code lost:
    
        if (onTimeLimit(r3) == r4) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object add(io.getstream.chat.android.client.events.ChatEvent r17, q83.InterfaceC30057d<? super java.lang.Boolean> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.event.handler.internal.batch.SocketEventCollector.add(io.getstream.chat.android.client.events.ChatEvent, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object doFire(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        boolean zIsEmpty = this.postponed.isEmpty();
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (zIsEmpty) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "[doFire] rejected (postponed is empty)", null);
                return c23454a0;
            }
        } else {
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
            String str2 = logger2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                logger2.f9274b.log(enumC2341g2, str2, AbstractC2875y.m8295h(this.postponed.getSize(), "[doFire] postponed.size: "), null);
            }
            List<ChatEvent> listSortedBy = this.postponed.sortedBy(new C19031a(21));
            this.postponed.clear();
            this.timeoutJob.reset();
            Object objInvoke = this.fireEvent.invoke(new BatchEvent(0, listSortedBy, false, 1, null), interfaceC30057d);
            if (objInvoke == EnumC31071a.f128113w) {
                return objInvoke;
            }
        }
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Date doFire$lambda$12(ChatEvent it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getCreatedAt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object firePostponed(InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        C192861 c192861;
        InterfaceC25435a interfaceC25435a;
        int i13;
        InterfaceC25435a interfaceC25435a2;
        Throwable th3;
        if (interfaceC30057d instanceof C192861) {
            c192861 = (C192861) interfaceC30057d;
            int i14 = c192861.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c192861.label = i14 - Integer.MIN_VALUE;
            } else {
                c192861 = new C192861(interfaceC30057d);
            }
        } else {
            c192861 = new C192861(interfaceC30057d);
        }
        Object obj = c192861.result;
        Object obj2 = EnumC31071a.f128113w;
        int i15 = c192861.label;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj);
                C2345k logger = getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, "[firePostponed] no args", null);
                }
                interfaceC25435a = this.mutex;
                c192861.L$0 = interfaceC25435a;
                c192861.I$0 = 0;
                c192861.label = 1;
                if (interfaceC25435a.mo68211b(c192861) != obj2) {
                    i13 = 0;
                }
                return obj2;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC25435a2 = (InterfaceC25435a) c192861.L$0;
                try {
                    AbstractC34132o.m107864I(obj);
                    interfaceC25435a2.mo68214i(null);
                    return C23454a0.f92919a;
                } catch (Throwable th4) {
                    th3 = th4;
                    interfaceC25435a2.mo68214i(null);
                    throw th3;
                }
            }
            i13 = c192861.I$0;
            InterfaceC25435a interfaceC25435a3 = (InterfaceC25435a) c192861.L$0;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a3;
            this.timeoutJob.cancel();
            c192861.L$0 = interfaceC25435a;
            c192861.I$0 = i13;
            c192861.I$1 = 0;
            c192861.label = 2;
            if (doFire(c192861) != obj2) {
                interfaceC25435a2 = interfaceC25435a;
                interfaceC25435a2.mo68214i(null);
                return C23454a0.f92919a;
            }
            return obj2;
        } catch (Throwable th5) {
            interfaceC25435a2 = interfaceC25435a;
            th3 = th5;
            interfaceC25435a2.mo68214i(null);
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onItemCountLimit(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[onItemCountLimit] no args", null);
        }
        Object objDoFire = doFire(interfaceC30057d);
        return objDoFire == EnumC31071a.f128113w ? objDoFire : C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onTimeLimit(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[onTimeLimit] no args", null);
        }
        Object objDoFire = doFire(interfaceC30057d);
        return objDoFire == EnumC31071a.f128113w ? objDoFire : C23454a0.f92919a;
    }

    private final void scheduleTimeout() {
        this.timeoutJob.set(AbstractC3006f0.m8732z(this.scope, null, null, new C192871(null), 3));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object collect$stream_chat_android_client_release(ChatEvent chatEvent, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        SocketEventCollector$collect$1 socketEventCollector$collect$1;
        if (interfaceC30057d instanceof SocketEventCollector$collect$1) {
            socketEventCollector$collect$1 = (SocketEventCollector$collect$1) interfaceC30057d;
            int i13 = socketEventCollector$collect$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                socketEventCollector$collect$1.label = i13 - Integer.MIN_VALUE;
            } else {
                socketEventCollector$collect$1 = new SocketEventCollector$collect$1(this, interfaceC30057d);
            }
        } else {
            socketEventCollector$collect$1 = new SocketEventCollector$collect$1(this, interfaceC30057d);
        }
        Object objAdd = socketEventCollector$collect$1.result;
        Object obj = EnumC31071a.f128113w;
        int i14 = socketEventCollector$collect$1.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objAdd);
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, AbstractC25012a.m73374g(chatEvent.hashCode(), "[collect] event.type: '", ChatEventUtilsKt.getRealType(chatEvent), "', event.hash: "), null);
            }
            socketEventCollector$collect$1.L$0 = chatEvent;
            socketEventCollector$collect$1.label = 1;
            objAdd = add(chatEvent, socketEventCollector$collect$1);
            if (objAdd != obj) {
            }
        }
        if (i14 == 1) {
            chatEvent = (ChatEvent) socketEventCollector$collect$1.L$0;
            AbstractC34132o.m107864I(objAdd);
        } else {
            if (i14 != 2) {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objAdd);
                return c23454a0;
            }
            chatEvent = (ChatEvent) socketEventCollector$collect$1.L$0;
            AbstractC34132o.m107864I(objAdd);
        }
        BatchEvent batchEvent = new BatchEvent(0, AbstractC37056f.m118958J(chatEvent), false, 1, null);
        InterfaceC4351m interfaceC4351m = this.fireEvent;
        socketEventCollector$collect$1.L$0 = null;
        socketEventCollector$collect$1.L$1 = null;
        socketEventCollector$collect$1.label = 3;
        return interfaceC4351m.invoke(batchEvent, socketEventCollector$collect$1) == obj ? obj : c23454a0;
        if (!((Boolean) objAdd).booleanValue()) {
            socketEventCollector$collect$1.L$0 = chatEvent;
            socketEventCollector$collect$1.label = 2;
            if (firePostponed(socketEventCollector$collect$1) != obj) {
                BatchEvent batchEvent2 = new BatchEvent(0, AbstractC37056f.m118958J(chatEvent), false, 1, null);
                InterfaceC4351m interfaceC4351m2 = this.fireEvent;
                socketEventCollector$collect$1.L$0 = null;
                socketEventCollector$collect$1.L$1 = null;
                socketEventCollector$collect$1.label = 3;
                if (interfaceC4351m2.invoke(batchEvent2, socketEventCollector$collect$1) == obj) {
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SocketEventCollector(InterfaceC2994c0 scope, InterfaceC4351m fireEvent) {
        this(scope, 300L, 1000L, 200, new C19383k(3), fireEvent);
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(fireEvent, "fireEvent");
    }
}
