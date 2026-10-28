package qj0;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.C3075y1;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.models.MessageType;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kt0.InterfaceC22824b;
import l83.C23454a0;
import l83.C23468n;
import l83.InterfaceC23459e;
import m83.AbstractC25260n;
import mj0.EnumC25613b;
import mj0.InterfaceC25612a;
import nj0.EnumC26747c;
import nj0.InterfaceC26750f;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22656a;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.jvm.internal.InterfaceC22666f;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import pj0.InterfaceC29293a;
import pj0.InterfaceC29295c;
import pj0.InterfaceC29296d;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import t83.InterfaceC33616a;
import tr2.InterfaceC34116n;
import vk0.InterfaceC36081g;
import xj0.AbstractC38334b;
import zj0.C40727h;

/* JADX INFO: renamed from: qj0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0000\u0018\u0000 W2\u00020\u0001:\u0001XBK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\rH\u0002¢\u0006\u0004\b\"\u0010#J\u0018\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*H\u0002¢\u0006\u0004\b,\u0010-J#\u00100\u001a\u00020\u001d*\u0006\u0012\u0002\b\u00030.2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b2\u0010\u0018J\u000f\u00103\u001a\u00020\u000eH\u0016¢\u0006\u0004\b3\u00104J0\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:2\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b<\u0010=R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010N\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010P\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010\u001fR\u0016\u0010R\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010\u001fR\u0016\u0010T\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010\u001fR\u0016\u0010V\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010\u001f¨\u0006Y"}, m65681d2 = {"Lqj0/g;", "Lqj0/d;", "Lnj0/f;", "protocol", "Lpj0/a;", NotificationCompat.CATEGORY_TRANSPORT, "Lqj0/b;", "commands", "Lkt0/b;", "handshake", "Ljava/time/Clock;", "clock", "Lkotlin/Function1;", "Lmj0/b;", "Ll83/a0;", "onPhase", "Ltr2/n;", "logger", "<init>", "(Lnj0/f;Lpj0/a;Lqj0/b;Lkt0/b;Ljava/time/Clock;Lkotlin/jvm/functions/Function1;Ltr2/n;)V", "", "mayBond", "Lqj0/c;", "f0", "(ZLq83/d;)Ljava/lang/Object;", "Lpj0/c;", NotificationCompat.CATEGORY_EVENT, "C0", "(Lpj0/c;)V", "Lmj0/a;", "fallback", "Z", "(Lmj0/a;)Lmj0/a;", "phase", "d0", "(Lmj0/b;)V", "cause", "Lqj0/c$b;", "a0", "(Lmj0/a;Lq83/d;)Ljava/lang/Object;", "F0", "(Lq83/d;)Ljava/lang/Object;", "", "Ljava/util/UUID;", "c0", "()Ljava/util/List;", "Lpj0/d;", "characteristicId", "j0", "(Lpj0/d;Ljava/util/UUID;)Lmj0/a;", "g", "close", "()V", "Lvk0/g;", "task", "Lkotlin/time/Duration;", "timeout", "dualResponse", "Ll83/n;", "Lzj0/h;", "i", "(Lvk0/g;JZLq83/d;)Ljava/lang/Object;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lnj0/f;", "x", "Lpj0/a;", "y", "Lqj0/b;", "z", "Lkt0/b;", "E", "Ljava/time/Clock;", "F", "Lkotlin/jvm/functions/Function1;", "G", "Ltr2/n;", "H", "Lmj0/b;", "currentPhase", "I", "bondedThisAttempt", "J", "serviceMissing", "K", "servicesChanged", "L", "linkDropped", "M", "a", "whoop-ble_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30425g implements InterfaceC30422d {

    /* JADX INFO: renamed from: M */
    private static final a f124904M = new a(null);

    /* JADX INFO: renamed from: N */
    private static final long f124905N;

    /* JADX INFO: renamed from: O */
    private static final Set<Integer> f124906O;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final Function1 onPhase;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private EnumC25613b currentPhase;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private boolean bondedThisAttempt;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private boolean serviceMissing;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private boolean servicesChanged;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private boolean linkDropped;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC26750f protocol;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC29293a transport;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C30420b commands;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC22824b handshake;

    /* JADX INFO: renamed from: qj0.g$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lqj0/g$a;", "", "<init>", "()V", "whoop-ble_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: qj0.g$b */
    @InterfaceC32271e(m100429c = "com.whoop.ble.device.WhoopDeviceBle$connect$2", m100430f = "WhoopDeviceBle.kt", m100431l = {76, 79}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lqj0/c;", "<anonymous>", "(Lbc3/c0;)Lqj0/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: F */
        final /* synthetic */ boolean f124920F;

        /* JADX INFO: renamed from: w */
        Object f124921w;

        /* JADX INFO: renamed from: x */
        Object f124922x;

        /* JADX INFO: renamed from: y */
        int f124923y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f124924z;

        /* JADX INFO: renamed from: qj0.g$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.ble.device.WhoopDeviceBle$connect$2$1", m100430f = "WhoopDeviceBle.kt", m100431l = {80, 81}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lpj0/d;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)Lpj0/d;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f124925w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C30425g f124926x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C30425g c30425g, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f124926x = c30425g;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f124926x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC29296d<C23454a0>> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f124925w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    if (this.f124926x.bondedThisAttempt) {
                        C30425g c30425g = this.f124926x;
                        this.f124925w = 1;
                        if (c30425g.m93010F0(this) != enumC31071a) {
                        }
                    }
                }
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC29293a interfaceC29293a = this.f124926x.transport;
                this.f124925w = 2;
                Object objMo88907l = interfaceC29293a.mo88907l(this);
                return objMo88907l == enumC31071a ? enumC31071a : objMo88907l;
            }
        }

        /* JADX INFO: renamed from: qj0.g$b$b, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.ble.device.WhoopDeviceBle$connect$2$watcher$1", m100430f = "WhoopDeviceBle.kt", m100431l = {74}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C42226b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f124927w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C30425g f124928x;

            /* JADX INFO: renamed from: qj0.g$b$b$a */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final /* synthetic */ class a implements InterfaceC13062m, InterfaceC22666f {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ C30425g f124929w;

                public a(C30425g c30425g) {
                    this.f124929w = c30425g;
                }

                @Override // ec3.InterfaceC13062m
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(InterfaceC29295c interfaceC29295c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    Object objM93030h = C42226b.m93030h(this.f124929w, interfaceC29295c, interfaceC30057d);
                    return objM93030h == EnumC31071a.f128113w ? objM93030h : C23454a0.f92919a;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof InterfaceC13062m) && (obj instanceof InterfaceC22666f)) {
                        return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // p715kotlin.jvm.internal.InterfaceC22666f
                public final InterfaceC23459e getFunctionDelegate() {
                    return new C22656a(2, 4, C30425g.class, this.f124929w, "track", "track(Lcom/whoop/ble/api/transport/TransportEvent;)V");
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42226b(C30425g c30425g, InterfaceC30057d<? super C42226b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f124928x = c30425g;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: h */
            public static final /* synthetic */ Object m93030h(C30425g c30425g, InterfaceC29295c interfaceC29295c, InterfaceC30057d interfaceC30057d) {
                c30425g.m93009C0(interfaceC29295c);
                return C23454a0.f92919a;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C42226b(this.f124928x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C42226b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f124927w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13058l events = this.f124928x.transport.getEvents();
                    a aVar = new a(this.f124928x);
                    this.f124927w = 1;
                    if (events.collect(aVar, this) == enumC31071a) {
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
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z4, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f124920F = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = C30425g.this.new b(this.f124920F, interfaceC30057d);
            bVar.f124924z = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC30421c> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00c3  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC3027k1 interfaceC3027k1M8732z;
            InterfaceC3027k1 interfaceC3027k1;
            InterfaceC3027k1 interfaceC3027k2;
            C3075y1 c3075y1;
            a aVar;
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f124924z;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f124923y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C30425g.this.logger.mo85216g(AbstractC11266d.m30461o("connect: starting on ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(C30425g.this.protocol.getClass()).getSimpleName()), new AbstractC30556a.a[0]);
                C30425g.this.currentPhase = EnumC25613b.Linking;
                C30425g.this.bondedThisAttempt = false;
                C30425g.this.serviceMissing = false;
                C30425g.this.servicesChanged = false;
                C30425g.this.linkDropped = false;
                interfaceC3027k1M8732z = AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C42226b(C30425g.this, null), 3);
                try {
                    try {
                        C30425g c30425g = C30425g.this;
                        boolean z4 = this.f124920F;
                        this.f124924z = null;
                        this.f124921w = interfaceC3027k1M8732z;
                        this.f124923y = 1;
                        Object objM93022f0 = c30425g.m93022f0(z4, this);
                        if (objM93022f0 != enumC31071a) {
                            interfaceC3027k1 = interfaceC3027k1M8732z;
                            obj = objM93022f0;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        c3075y1 = C3075y1.f12109w;
                        aVar = new a(C30425g.this, null);
                        this.f124924z = null;
                        this.f124921w = interfaceC3027k1M8732z;
                        this.f124922x = e;
                        this.f124923y = 2;
                        if (AbstractC3006f0.m8705K(c3075y1, aVar, this) != enumC31071a) {
                            interfaceC3027k2 = interfaceC3027k1M8732z;
                            throw e;
                        }
                    }
                    return enumC31071a;
                } catch (Throwable th3) {
                    interfaceC3027k2 = interfaceC3027k1M8732z;
                    th = th3;
                    interfaceC3027k2.cancel((CancellationException) null);
                    throw th;
                }
            }
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e = (Exception) this.f124922x;
                interfaceC3027k2 = (InterfaceC3027k1) this.f124921w;
                try {
                    AbstractC34132o.m107864I(obj);
                    throw e;
                } catch (Throwable th4) {
                    th = th4;
                    interfaceC3027k2.cancel((CancellationException) null);
                    throw th;
                }
            }
            interfaceC3027k1 = (InterfaceC3027k1) this.f124921w;
            try {
                AbstractC34132o.m107864I(obj);
            } catch (Exception e13) {
                InterfaceC3027k1 interfaceC3027k3 = interfaceC3027k1;
                e = e13;
                interfaceC3027k1M8732z = interfaceC3027k3;
                c3075y1 = C3075y1.f12109w;
                aVar = new a(C30425g.this, null);
                this.f124924z = null;
                this.f124921w = interfaceC3027k1M8732z;
                this.f124922x = e;
                this.f124923y = 2;
                if (AbstractC3006f0.m8705K(c3075y1, aVar, this) != enumC31071a) {
                    interfaceC3027k2 = interfaceC3027k1M8732z;
                    throw e;
                }
                return enumC31071a;
            } catch (Throwable th5) {
                th = th5;
                interfaceC3027k2 = interfaceC3027k1;
                interfaceC3027k2.cancel((CancellationException) null);
                throw th;
            }
            InterfaceC30421c interfaceC30421c = (InterfaceC30421c) obj;
            interfaceC3027k1.cancel((CancellationException) null);
            return interfaceC30421c;
        }
    }

    /* JADX INFO: renamed from: qj0.g$c */
    @InterfaceC32271e(m100429c = "com.whoop.ble.device.WhoopDeviceBle", m100430f = "WhoopDeviceBle.kt", m100431l = {181, 182}, m100432m = MessageType.FAILED, m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f124930w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f124931x;

        /* JADX INFO: renamed from: z */
        int f124933z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f124931x = obj;
            this.f124933z |= Integer.MIN_VALUE;
            return C30425g.this.m93018a0(null, this);
        }
    }

    /* JADX INFO: renamed from: qj0.g$d */
    @InterfaceC32271e(m100429c = "com.whoop.ble.device.WhoopDeviceBle", m100430f = "WhoopDeviceBle.kt", m100431l = {102, 103, 104, 110, 113, 115, 116, 121, 122, 125, 130, 131, 132, 136, 137, 139, 144, 145, 147}, m100432m = "runPhases", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f124934E;

        /* JADX INFO: renamed from: F */
        Object f124935F;

        /* JADX INFO: renamed from: G */
        Object f124936G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f124937H;

        /* JADX INFO: renamed from: J */
        int f124939J;

        /* JADX INFO: renamed from: w */
        boolean f124940w;

        /* JADX INFO: renamed from: x */
        Object f124941x;

        /* JADX INFO: renamed from: y */
        Object f124942y;

        /* JADX INFO: renamed from: z */
        Object f124943z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f124937H = obj;
            this.f124939J |= Integer.MIN_VALUE;
            return C30425g.this.m93022f0(false, this);
        }
    }

    /* JADX INFO: renamed from: qj0.g$e */
    @InterfaceC32271e(m100429c = "com.whoop.ble.device.WhoopDeviceBle$runPhases$enabled$1", m100430f = "WhoopDeviceBle.kt", m100431l = {130}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lpj0/d;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)Lpj0/d;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f124944w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ UUID f124946y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(UUID uuid, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f124946y = uuid;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C30425g.this.new e(this.f124946y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC29296d<C23454a0>> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f124944w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC29293a interfaceC29293a = C30425g.this.transport;
            UUID uuid = this.f124946y;
            this.f124944w = 1;
            Object objMo88905i = interfaceC29293a.mo88905i(uuid, this);
            return objMo88905i == enumC31071a ? enumC31071a : objMo88905i;
        }
    }

    /* JADX INFO: renamed from: qj0.g$f */
    @InterfaceC32271e(m100429c = "com.whoop.ble.device.WhoopDeviceBle$runPhases$granted$1", m100430f = "WhoopDeviceBle.kt", m100431l = {121}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lpj0/d;", "", "<anonymous>", "(Lbc3/c0;)Lpj0/d;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f124947w;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C30425g.this.new f(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC29296d<Integer>> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f124947w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC29293a interfaceC29293a = C30425g.this.transport;
            int iMo79620b = C30425g.this.protocol.mo79620b();
            this.f124947w = 1;
            Object objMo88908p = interfaceC29293a.mo88908p(iMo79620b, this);
            return objMo88908p == enumC31071a ? enumC31071a : objMo88908p;
        }
    }

    /* JADX INFO: renamed from: qj0.g$g */
    @InterfaceC32271e(m100429c = "com.whoop.ble.device.WhoopDeviceBle$runPhases$linked$1", m100430f = "WhoopDeviceBle.kt", m100431l = {102}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lpj0/d;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)Lpj0/d;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f124949w;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C30425g.this.new g(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC29296d<C23454a0>> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f124949w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC29293a interfaceC29293a = C30425g.this.transport;
            this.f124949w = 1;
            Object objMo88903g = interfaceC29293a.mo88903g(false, this);
            return objMo88903g == enumC31071a ? enumC31071a : objMo88903g;
        }
    }

    /* JADX INFO: renamed from: qj0.g$h */
    @InterfaceC32271e(m100429c = "com.whoop.ble.device.WhoopDeviceBle", m100430f = "WhoopDeviceBle.kt", m100431l = {97}, m100432m = "sendTaskAndAwaitResponse-JXpvp54", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f124951E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f124952F;

        /* JADX INFO: renamed from: H */
        int f124954H;

        /* JADX INFO: renamed from: w */
        Object f124955w;

        /* JADX INFO: renamed from: x */
        long f124956x;

        /* JADX INFO: renamed from: y */
        boolean f124957y;

        /* JADX INFO: renamed from: z */
        int f124958z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f124952F = obj;
            this.f124954H |= Integer.MIN_VALUE;
            Object objMo79830i = C30425g.this.mo79830i(null, 0L, false, this);
            return objMo79830i == EnumC31071a.f128113w ? objMo79830i : new C23468n(objMo79830i);
        }
    }

    /* JADX INFO: renamed from: qj0.g$i */
    @InterfaceC32271e(m100429c = "com.whoop.ble.device.WhoopDeviceBle", m100430f = "WhoopDeviceBle.kt", m100431l = {188}, m100432m = "undoBond", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f124959w;

        /* JADX INFO: renamed from: y */
        int f124961y;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f124959w = obj;
            this.f124961y |= Integer.MIN_VALUE;
            return C30425g.this.m93010F0(this);
        }
    }

    static {
        Duration.Companion companion = Duration.INSTANCE;
        f124905N = DurationKt.toDuration(30, DurationUnit.SECONDS);
        f124906O = AbstractC25260n.m74059b1(new Integer[]{5, 8, 15, 137});
    }

    public C30425g(InterfaceC26750f protocol, InterfaceC29293a transport, C30420b commands, InterfaceC22824b handshake, Clock clock, Function1 onPhase, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(protocol, "protocol");
        AbstractC22676k.m65750j(transport, "transport");
        AbstractC22676k.m65750j(commands, "commands");
        AbstractC22676k.m65750j(handshake, "handshake");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(onPhase, "onPhase");
        AbstractC22676k.m65750j(logger, "logger");
        this.protocol = protocol;
        this.transport = transport;
        this.commands = commands;
        this.handshake = handshake;
        this.clock = clock;
        this.onPhase = onPhase;
        this.logger = logger;
        this.currentPhase = EnumC25613b.Linking;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public final void m93009C0(InterfaceC29295c event) {
        if (AbstractC22676k.m65745e(event, InterfaceC29295c.a.f118543a)) {
            m93021d0(EnumC25613b.DiscoveringServices);
            return;
        }
        if (event instanceof InterfaceC29295c.e) {
            if (((InterfaceC29295c.e) event).getHasRequiredService()) {
                return;
            }
            this.serviceMissing = true;
        } else {
            if (event instanceof InterfaceC29295c.c) {
                this.linkDropped = true;
                return;
            }
            if (event instanceof InterfaceC29295c.b) {
                this.linkDropped = true;
            } else if (AbstractC22676k.m65745e(event, InterfaceC29295c.f.f118548a)) {
                this.servicesChanged = true;
            } else if (!AbstractC22676k.m65745e(event, InterfaceC29295c.d.f118546a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: F0 */
    public final Object m93010F0(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        i iVar;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i13 = iVar.f124961y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iVar.f124961y = i13 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        Object objMo88909r = iVar.f124959w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = iVar.f124961y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo88909r);
            this.logger.mo85216g("connect: removing the bond this attempt created", new AbstractC30556a.a[0]);
            InterfaceC29293a interfaceC29293a = this.transport;
            iVar.f124961y = 1;
            objMo88909r = interfaceC29293a.mo88909r(iVar);
            if (objMo88909r == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo88909r);
        }
        InterfaceC29296d interfaceC29296d = (InterfaceC29296d) objMo88909r;
        if (!(interfaceC29296d instanceof InterfaceC29296d.e)) {
            this.logger.mo85226q("connect: the bond could not be removed (" + interfaceC29296d + ")", new AbstractC30556a.a[0]);
        }
        this.bondedThisAttempt = false;
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Z */
    private final InterfaceC25612a m93016Z(InterfaceC25612a fallback) {
        if (this.serviceMissing) {
            return InterfaceC25612a.g.f100483a;
        }
        if (this.servicesChanged) {
            return InterfaceC25612a.h.f100484a;
        }
        return this.linkDropped ? InterfaceC25612a.j.f100486a : fallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        if (r9.mo88907l(r0) == r1) goto L23;
     */
    /* JADX INFO: renamed from: a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m93018a0(mj0.InterfaceC25612a r8, q83.InterfaceC30057d<? super qj0.InterfaceC30421c.b> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof qj0.C30425g.c
            if (r0 == 0) goto L13
            r0 = r9
            qj0.g$c r0 = (qj0.C30425g.c) r0
            int r1 = r0.f124933z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f124933z = r1
            goto L18
        L13:
            qj0.g$c r0 = new qj0.g$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f124931x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f124933z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r8 = r0.f124930w
            mj0.a r8 = (mj0.InterfaceC25612a) r8
            p505ts.AbstractC34132o.m107864I(r9)
            goto L82
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.Object r8 = r0.f124930w
            mj0.a r8 = (mj0.InterfaceC25612a) r8
            p505ts.AbstractC34132o.m107864I(r9)
            goto L75
        L3e:
            p505ts.AbstractC34132o.m107864I(r9)
            tr2.n r9 = r7.logger
            mj0.b r2 = r7.currentPhase
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "connect: failed in "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r2 = " ("
            r5.append(r2)
            r5.append(r8)
            java.lang.String r2 = ")"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r5 = 0
            qr2.a$a[] r5 = new qr2.AbstractC30556a.a[r5]
            r9.mo85226q(r2, r5)
            boolean r9 = r7.bondedThisAttempt
            if (r9 == 0) goto L75
            r0.f124930w = r8
            r0.f124933z = r4
            java.lang.Object r9 = r7.m93010F0(r0)
            if (r9 != r1) goto L75
            goto L81
        L75:
            pj0.a r9 = r7.transport
            r0.f124930w = r8
            r0.f124933z = r3
            java.lang.Object r9 = r9.mo88907l(r0)
            if (r9 != r1) goto L82
        L81:
            return r1
        L82:
            qj0.c$b r9 = new qj0.c$b
            mj0.b r0 = r7.currentPhase
            r9.<init>(r0, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: qj0.C30425g.m93018a0(mj0.a, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: c0 */
    private final List<UUID> m93020c0() {
        InterfaceC33616a entries = EnumC26747c.getEntries();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entries) {
            if (((EnumC26747c) obj) != EnumC26747c.CmdToStrap) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UUID uuidM79609a = this.protocol.mo79622d().m79609a((EnumC26747c) it.next());
            if (uuidM79609a != null) {
                arrayList2.add(uuidM79609a);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: d0 */
    private final void m93021d0(EnumC25613b phase) {
        this.logger.mo85216g("phase: " + phase, new AbstractC30556a.a[0]);
        this.currentPhase = phase;
        this.onPhase.invoke(phase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:101:0x02a5 A[PHI: r1 r4 r6 r8 r13
      0x02a5: PHI (r1v53 java.lang.Object) = (r1v52 java.lang.Object), (r1v1 java.lang.Object) binds: [B:99:0x02a1, B:26:0x00cf] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r4v17 boolean) = (r4v16 boolean), (r4v18 boolean) binds: [B:99:0x02a1, B:26:0x00cf] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r6v4 java.util.UUID) = (r6v3 java.util.UUID), (r6v6 java.util.UUID) binds: [B:99:0x02a1, B:26:0x00cf] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r8v17 java.util.Iterator<java.util.UUID>) = (r8v15 java.util.Iterator<java.util.UUID>), (r8v19 java.util.Iterator<java.util.UUID>) binds: [B:99:0x02a1, B:26:0x00cf] A[DONT_GENERATE, DONT_INLINE]
      0x02a5: PHI (r13v2 qj0.g$d) = (r13v1 qj0.g$d), (r13v3 qj0.g$d) binds: [B:99:0x02a1, B:26:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:107:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:109:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:112:0x02e4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:96:0x027b A[PHI: r4 r8 r13
      0x027b: PHI (r4v16 boolean) = (r4v12 boolean), (r4v17 boolean) binds: [B:95:0x023e, B:108:0x02c8] A[DONT_GENERATE, DONT_INLINE]
      0x027b: PHI (r8v15 java.util.Iterator<java.util.UUID>) = (r8v12 java.util.Iterator<java.util.UUID>), (r8v17 java.util.Iterator<java.util.UUID>) binds: [B:95:0x023e, B:108:0x02c8] A[DONT_GENERATE, DONT_INLINE]
      0x027b: PHI (r13v1 qj0.g$d) = (r13v0 qj0.g$d), (r13v2 qj0.g$d) binds: [B:95:0x023e, B:108:0x02c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x0281  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x02a1 -> B:101:0x02a5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: f0 */
    public final java.lang.Object m93022f0(boolean r17, q83.InterfaceC30057d<? super qj0.InterfaceC30421c> r18) {
        /*
            Method dump skipped, instruction units count: 1094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qj0.C30425g.m93022f0(boolean, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: j0 */
    private final InterfaceC25612a m93023j0(InterfaceC29296d<?> interfaceC29296d, UUID uuid) {
        if (interfaceC29296d instanceof InterfaceC29296d.e) {
            throw new IllegalArgumentException("Success is not a failure cause");
        }
        if (interfaceC29296d instanceof InterfaceC29296d.c) {
            InterfaceC29296d.c cVar = (InterfaceC29296d.c) interfaceC29296d;
            return f124906O.contains(Integer.valueOf(cVar.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String())) ? InterfaceC25612a.b.f100478a : m93016Z(new InterfaceC25612a.e(cVar.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String()));
        }
        if (AbstractC22676k.m65745e(interfaceC29296d, InterfaceC29296d.b.f118550a)) {
            return m93016Z(InterfaceC25612a.j.f100486a);
        }
        if (AbstractC22676k.m65745e(interfaceC29296d, InterfaceC29296d.a.f118549a)) {
            return InterfaceC25612a.a.f100477a;
        }
        if (AbstractC22676k.m65745e(interfaceC29296d, InterfaceC29296d.d.f118552a)) {
            return uuid != null ? new InterfaceC25612a.d(uuid) : m93016Z(new InterfaceC25612a.i(new IllegalStateException("The request could not be issued")));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: v0 */
    public static /* synthetic */ InterfaceC25612a m93028v0(C30425g c30425g, InterfaceC29296d interfaceC29296d, UUID uuid, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            uuid = null;
        }
        return c30425g.m93023j0(interfaceC29296d, uuid);
    }

    @Override // qj0.InterfaceC30422d
    public void close() {
        this.transport.close();
    }

    @Override // qj0.InterfaceC30422d
    /* JADX INFO: renamed from: g */
    public Object mo93006g(boolean z4, InterfaceC30057d<? super InterfaceC30421c> interfaceC30057d) {
        return AbstractC3006f0.m8719m(new b(z4, null), interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // vk0.InterfaceC36083i
    /* JADX INFO: renamed from: i */
    public Object mo79830i(InterfaceC36081g interfaceC36081g, long j7, boolean z4, InterfaceC30057d<? super C23468n> interfaceC30057d) throws Throwable {
        h hVar;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i13 = hVar.f124954H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hVar.f124954H = i13 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        h hVar2 = hVar;
        Object objM92999j = hVar2.f124952F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = hVar2.f124954H;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM92999j);
                C30420b c30420b = this.commands;
                AbstractC22676k.m65748h(interfaceC36081g, "null cannot be cast to non-null type com.whoop.ble.packets.commandpackets.CommandPacket");
                hVar2.f124955w = null;
                hVar2.f124956x = j7;
                hVar2.f124957y = z4;
                hVar2.f124958z = 0;
                hVar2.f124951E = 0;
                hVar2.f124954H = 1;
                objM92999j = c30420b.m92999j((AbstractC38334b) interfaceC36081g, j7, z4, hVar2);
                if (objM92999j == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM92999j);
            }
            return (C40727h) objM92999j;
        } catch (CancellationException e5) {
            throw e5;
        } catch (Exception e13) {
            return AbstractC34132o.m107888l(e13);
        }
    }
}
