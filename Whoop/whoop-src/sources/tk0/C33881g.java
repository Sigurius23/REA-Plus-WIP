package tk0;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.ble.api.scan.ScanFailure;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.internal.state.plugin.logic.channel.internal.TypingEventPruner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import mj0.AbstractC25617f;
import mj0.C25616e;
import nj0.InterfaceC26750f;
import oj0.InterfaceC27978a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import te0.AbstractC33745d;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: tk0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 +2\u00020\u0001:\u0002# B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u0010*\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, m65681d2 = {"Ltk0/g;", "Loj0/a;", "Ltk0/d;", "platformScanner", "Ltk0/e;", "preconditions", "Ltr2/n;", "logger", "Lbc3/c0;", "scope", "<init>", "(Ltk0/d;Ltk0/e;Ltr2/n;Lbc3/c0;)V", "Lec3/l;", "Ltk0/g$b;", "l", "()Lec3/l;", "Lcom/whoop/ble/api/scan/ScanFailure;", "failure", "", "k", "(Lcom/whoop/ble/api/scan/ScanFailure;)J", "Ltk0/f;", "report", "Lmj0/e;", "m", "(Ltk0/f;)Lmj0/e;", "", "n", "(Ljava/lang/Throwable;)Lcom/whoop/ble/api/scan/ScanFailure;", "", "Lnj0/f;", "filter", "a", "(Ljava/util/Set;)Lec3/l;", "Ltk0/d;", "b", "Ltk0/e;", "c", "Ltr2/n;", "Lec3/t1;", "d", "Lec3/t1;", "shared", "e", "whoop-ble-transport_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33881g implements InterfaceC27978a {

    /* JADX INFO: renamed from: e */
    private static final a f141913e = new a(null);

    /* JADX INFO: renamed from: f */
    private static final Set<UUID> f141914f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC33878d platformScanner;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC33879e preconditions;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC13087t1 shared;

    /* JADX INFO: renamed from: tk0.g$a */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, m65681d2 = {"Ltk0/g$a;", "", "<init>", "()V", "", "Ljava/util/UUID;", "WHOOP_SERVICE_IDS", "Ljava/util/Set;", "a", "()Ljava/util/Set;", "", "SCAN_STOP_TIMEOUT_MS", "J", "FAILURE_RETRY_DELAY_MS", "REJECTED_RETRY_DELAY_MS", "whoop-ble-transport_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Set<UUID> m107152a() {
            return C33881g.f141914f;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: tk0.g$b */
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Ltk0/g$b;", "", "b", "a", "Ltk0/g$b$a;", "Ltk0/g$b$b;", "whoop-ble-transport_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface b {

        /* JADX INFO: renamed from: tk0.g$b$a */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ltk0/g$b$a;", "Ltk0/g$b;", "Lcom/whoop/ble/api/scan/ScanFailure;", "failure", "<init>", "(Lcom/whoop/ble/api/scan/ScanFailure;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/ble/api/scan/ScanFailure;", "()Lcom/whoop/ble/api/scan/ScanFailure;", "whoop-ble-transport_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a implements b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final ScanFailure failure;

            public a(ScanFailure failure) {
                AbstractC22676k.m65750j(failure, "failure");
                this.failure = failure;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ScanFailure getFailure() {
                return this.failure;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof a) && AbstractC22676k.m65745e(this.failure, ((a) other).failure);
            }

            public int hashCode() {
                return this.failure.hashCode();
            }

            public String toString() {
                return "Failed(failure=" + this.failure + ")";
            }
        }

        /* JADX INFO: renamed from: tk0.g$b$b, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Ltk0/g$b$b;", "Ltk0/g$b;", "", "Lmj0/e;", "devices", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "whoop-ble-transport_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C42397b implements b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final List<C25616e> devices;

            public C42397b(List<C25616e> devices) {
                AbstractC22676k.m65750j(devices, "devices");
                this.devices = devices;
            }

            /* JADX INFO: renamed from: a */
            public final List<C25616e> m107154a() {
                return this.devices;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof C42397b) && AbstractC22676k.m65745e(this.devices, ((C42397b) other).devices);
            }

            public int hashCode() {
                return this.devices.hashCode();
            }

            public String toString() {
                return AbstractC33745d.m106654m("Reports(devices=", ")", this.devices);
            }
        }
    }

    /* JADX INFO: renamed from: tk0.g$c */
    @InterfaceC32271e(m100429c = "com.whoop.ble.transport.scan.WhoopBleScannerImpl$scan$$inlined$transform$1", m100430f = "WhoopBleScannerImpl.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"R", "Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f141921w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f141922x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13058l f141923y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Set f141924z;

        /* JADX INFO: renamed from: tk0.g$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f141925w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ Set f141926x;

            /* JADX INFO: renamed from: tk0.g$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.ble.transport.scan.WhoopBleScannerImpl$scan$$inlined$transform$1$1", m100430f = "WhoopBleScannerImpl.kt", m100431l = {40}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42398a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f141927E;

                /* JADX INFO: renamed from: F */
                Object f141928F;

                /* JADX INFO: renamed from: G */
                Object f141929G;

                /* JADX INFO: renamed from: H */
                Object f141930H;

                /* JADX INFO: renamed from: I */
                Object f141931I;

                /* JADX INFO: renamed from: J */
                Object f141932J;

                /* JADX INFO: renamed from: K */
                Object f141933K;

                /* JADX INFO: renamed from: L */
                int f141934L;

                /* JADX INFO: renamed from: M */
                int f141935M;

                /* JADX INFO: renamed from: N */
                int f141936N;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f141937w;

                /* JADX INFO: renamed from: x */
                int f141938x;

                /* JADX INFO: renamed from: z */
                Object f141940z;

                public C42398a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f141937w = obj;
                    this.f141938x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, Set set) {
                this.f141926x = set;
                this.f141925w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(T t14, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws ScanFailure {
                C42398a c42398a;
                Iterator<T> it;
                InterfaceC13062m interfaceC13062m;
                int i13;
                int i14;
                if (interfaceC30057d instanceof C42398a) {
                    c42398a = (C42398a) interfaceC30057d;
                    int i15 = c42398a.f141938x;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        c42398a.f141938x = i15 - Integer.MIN_VALUE;
                    } else {
                        c42398a = new C42398a(interfaceC30057d);
                    }
                } else {
                    c42398a = new C42398a(interfaceC30057d);
                }
                Object obj = c42398a.f141937w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i16 = c42398a.f141938x;
                if (i16 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC13062m interfaceC13062m2 = this.f141925w;
                    b bVar = (b) t14;
                    if (!(bVar instanceof b.C42397b)) {
                        if (bVar instanceof b.a) {
                            throw ((b.a) bVar).getFailure();
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    it = ((b.C42397b) bVar).m107154a().iterator();
                    interfaceC13062m = interfaceC13062m2;
                    i13 = 0;
                    i14 = 0;
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i13 = c42398a.f141935M;
                    i14 = c42398a.f141934L;
                    it = (Iterator) c42398a.f141931I;
                    interfaceC13062m = (InterfaceC13062m) c42398a.f141929G;
                    AbstractC34132o.m107864I(obj);
                }
                while (it.hasNext()) {
                    C25616e c25616e = (C25616e) it.next();
                    if (this.f141926x.contains(c25616e.getProtocol())) {
                        c42398a.f141940z = null;
                        c42398a.f141927E = null;
                        c42398a.f141928F = null;
                        c42398a.f141929G = interfaceC13062m;
                        c42398a.f141930H = null;
                        c42398a.f141931I = it;
                        c42398a.f141932J = null;
                        c42398a.f141933K = null;
                        c42398a.f141934L = i14;
                        c42398a.f141935M = i13;
                        c42398a.f141936N = 0;
                        c42398a.f141938x = 1;
                        if (interfaceC13062m.emit(c25616e, c42398a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d, Set set) {
            super(2, interfaceC30057d);
            this.f141923y = interfaceC13058l;
            this.f141924z = set;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f141923y, interfaceC30057d, this.f141924z);
            cVar.f141922x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f141921w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f141922x;
                InterfaceC13058l interfaceC13058l = this.f141923y;
                a aVar = new a(interfaceC13062m, this.f141924z);
                this.f141922x = null;
                this.f141921w = 1;
                if (interfaceC13058l.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: tk0.g$d */
    @InterfaceC32271e(m100429c = "com.whoop.ble.transport.scan.WhoopBleScannerImpl$scanSession$1", m100430f = "WhoopBleScannerImpl.kt", m100431l = {56, 69}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ltk0/g$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f141942w;

        /* JADX INFO: renamed from: x */
        int f141943x;

        /* JADX INFO: renamed from: y */
        int f141944y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f141945z;

        /* JADX INFO: renamed from: tk0.g$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f141946w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C33881g f141947x;

            public a(InterfaceC13062m interfaceC13062m, C33881g c33881g) {
                this.f141946w = interfaceC13062m;
                this.f141947x = c33881g;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<C33880f> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                InterfaceC13062m interfaceC13062m = this.f141946w;
                C33881g c33881g = this.f141947x;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    C25616e c25616eM107150m = c33881g.m107150m((C33880f) it.next());
                    if (c25616eM107150m != null) {
                        arrayList.add(c25616eM107150m);
                    }
                }
                Object objEmit = interfaceC13062m.emit(new b.C42397b(arrayList), interfaceC30057d);
                return objEmit == EnumC31071a.f128113w ? objEmit : C23454a0.f92919a;
            }
        }

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = C33881g.this.new d(interfaceC30057d);
            dVar.f141945z = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00cf, code lost:
        
            if (r1.emit(r0, r10) == r2) goto L27;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 214
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: tk0.C33881g.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: tk0.g$e */
    @InterfaceC32271e(m100429c = "com.whoop.ble.transport.scan.WhoopBleScannerImpl$shared$1", m100430f = "WhoopBleScannerImpl.kt", m100431l = {35, 38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ltk0/g$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f141948w;

        /* JADX INFO: renamed from: x */
        int f141949x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f141950y;

        /* JADX INFO: renamed from: tk0.g$e$a */
        @InterfaceC32271e(m100429c = "com.whoop.ble.transport.scan.WhoopBleScannerImpl$shared$1$1", m100430f = "WhoopBleScannerImpl.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ltk0/g$b;", "it", "Ll83/a0;", "<anonymous>", "(Ltk0/g$b;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f141952w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f141953x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C22669g0 f141954y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C22669g0 c22669g0, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f141954y = c22669g0;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f141954y, interfaceC30057d);
                aVar.f141953x = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(b bVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(bVar, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                b bVar = (b) this.f141953x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f141952w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                if (bVar instanceof b.a) {
                    this.f141954y.f89336w = ((b.a) bVar).getFailure();
                }
                return C23454a0.f92919a;
            }
        }

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = C33881g.this.new e(interfaceC30057d);
            eVar.f141950y = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0029  */
        /* JADX WARN: Code duplicated, block: B:14:0x0053  */
        /* JADX WARN: Code duplicated, block: B:17:0x0058  */
        /* JADX WARN: Code duplicated, block: B:20:0x005c A[PHI: r2
          0x005c: PHI (r2v2 kotlin.jvm.internal.g0) = (r2v1 kotlin.jvm.internal.g0), (r2v6 kotlin.jvm.internal.g0) binds: [B:18:0x0059, B:9:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0070 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // s83.AbstractC32267a
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = r9.f141950y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r9.f141949x
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L26
                if (r2 == r5) goto L1e
                if (r2 != r4) goto L16
                java.lang.Object r2 = r9.f141948w
                kotlin.jvm.internal.g0 r2 = (p715kotlin.jvm.internal.C22669g0) r2
                goto L26
            L16:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1e:
                java.lang.Object r2 = r9.f141948w
                kotlin.jvm.internal.g0 r2 = (p715kotlin.jvm.internal.C22669g0) r2
                p505ts.AbstractC34132o.m107864I(r10)
                goto L5c
            L26:
                p505ts.AbstractC34132o.m107864I(r10)
            L29:
                kotlin.jvm.internal.g0 r2 = new kotlin.jvm.internal.g0
                r2.<init>()
                tk0.g r10 = tk0.C33881g.this
                ec3.l r10 = tk0.C33881g.m107145h(r10)
                tk0.g$e$a r6 = new tk0.g$e$a
                r6.<init>(r2, r3)
                r9.f141950y = r0
                r9.f141948w = r2
                r9.f141949x = r5
                ec3.AbstractC13091v.m36615y(r0)
                ec3.e0 r7 = new ec3.e0
                r8 = 2
                r7.<init>(r8, r0, r6)
                java.lang.Object r10 = r10.collect(r7, r9)
                r83.a r6 = r83.EnumC31071a.f128113w
                l83.a0 r7 = l83.C23454a0.f92919a
                if (r10 != r6) goto L53
                goto L54
            L53:
                r10 = r7
            L54:
                r83.a r6 = r83.EnumC31071a.f128113w
                if (r10 != r6) goto L59
                r7 = r10
            L59:
                if (r7 != r1) goto L5c
                goto L72
            L5c:
                tk0.g r10 = tk0.C33881g.this
                java.lang.Object r2 = r2.f89336w
                com.whoop.ble.api.scan.ScanFailure r2 = (com.whoop.ble.api.scan.ScanFailure) r2
                long r6 = tk0.C33881g.m107144g(r10, r2)
                r9.f141950y = r0
                r9.f141948w = r3
                r9.f141949x = r4
                java.lang.Object r10 = bc3.AbstractC3034m0.m8782b(r6, r9)
                if (r10 != r1) goto L29
            L72:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: tk0.C33881g.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        Set<InterfaceC26750f> setM79624b = InterfaceC26750f.INSTANCE.m79624b();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(setM79624b, 10));
        Iterator<T> it = setM79624b.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC26750f) it.next()).mo79621c());
        }
        f141914f = AbstractC25265s.m74103I1(arrayList);
    }

    public C33881g(InterfaceC33878d platformScanner, InterfaceC33879e preconditions, InterfaceC34116n logger, InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(platformScanner, "platformScanner");
        AbstractC22676k.m65750j(preconditions, "preconditions");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(scope, "scope");
        this.platformScanner = platformScanner;
        this.preconditions = preconditions;
        this.logger = logger;
        this.shared = AbstractC13091v.m36586L(new C13084s1(new e(null)), scope, C13105z1.m36630a(2, 5000L), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final long m107148k(ScanFailure failure) {
        if (failure instanceof ScanFailure.Rejected) {
            return 30000L;
        }
        return TypingEventPruner.DEFAULT_DELAY_TIME_MS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final InterfaceC13058l m107149l() {
        return new C13084s1(new d(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final C25616e m107150m(C33880f report) {
        InterfaceC26750f interfaceC26750f;
        List<UUID> listM107138d = report.m107138d();
        InterfaceC26750f.Companion companion = InterfaceC26750f.INSTANCE;
        Iterator<T> it = listM107138d.iterator();
        while (true) {
            if (!it.hasNext()) {
                interfaceC26750f = null;
                break;
            }
            InterfaceC26750f interfaceC26750fM79623a = companion.m79623a((UUID) it.next());
            if (interfaceC26750fM79623a != null) {
                interfaceC26750f = interfaceC26750fM79623a;
                break;
            }
        }
        if (interfaceC26750f == null) {
            return null;
        }
        String strM75347a = AbstractC25617f.m75347a(report.getAddress());
        String advertisingName = report.getAdvertisingName();
        if (advertisingName == null) {
            advertisingName = "";
        }
        return new C25616e(strM75347a, advertisingName, report.getRssi(), interfaceC26750f, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final ScanFailure m107151n(Throwable th3) {
        if (th3 instanceof ScanFailure) {
            return (ScanFailure) th3;
        }
        return th3 instanceof SecurityException ? ScanFailure.PermissionDenied.f24070w : new ScanFailure.Unexpected(th3);
    }

    @Override // oj0.InterfaceC27978a
    /* JADX INFO: renamed from: a */
    public InterfaceC13058l mo84397a(Set<? extends InterfaceC26750f> filter) {
        AbstractC22676k.m65750j(filter, "filter");
        return new C13084s1(new c(this.shared, null, filter));
    }
}
