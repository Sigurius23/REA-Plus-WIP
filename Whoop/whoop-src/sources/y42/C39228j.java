package y42;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.InterfaceC2994c0;
import c52.AbstractC4251b;
import ch.C4588i;
import d52.C11719a;
import ec3.AbstractC13091v;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p007a6.InterfaceC0422g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import qt0.InterfaceC30585a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import us0.InterfaceC35205a;
import us0.InterfaceC35209e;
import vk0.InterfaceC36076b;
import x42.InterfaceC37967d;
import z42.C40077a;
import z42.C40078b;
import z42.C40079c;
import z42.C40080d;

/* JADX INFO: renamed from: y42.j */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001d0%¢\u0006\u0004\b&\u0010'J\"\u0010*\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020(H\u0086@¢\u0006\u0004\b*\u0010+J\u0013\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001d0,¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR \u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001c\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006M"}, m65681d2 = {"Ly42/j;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Ltr2/n;", "logger", "Landroid/content/Context;", "context", "Landroid/bluetooth/BluetoothAdapter;", "bluetoothAdapter", "Ld52/a;", "puffinPacketParser", "Lbc3/c0;", "coroutineScope", "Lus0/e;", "connectivityAnalytics", "Lvk0/b;", "bleTaskExecutor", "Lx42/d;", "puffinMemfaultFactory", "Lqt0/a;", "bleScanner", "La6/g;", "Lf6/f;", "dataStorePreferences", "Lus0/a;", "backgroundUsageAggregator", "<init>", "(Ltr2/n;Landroid/content/Context;Landroid/bluetooth/BluetoothAdapter;Ld52/a;Lbc3/c0;Lus0/e;Lvk0/b;Lx42/d;Lqt0/a;La6/g;Lus0/a;)V", "", "macAddress", "Ly42/a;", "f", "(Ljava/lang/String;)Ly42/a;", "Landroidx/lifecycle/g0;", "owner", "Ll83/a0;", "onCreate", "(Landroidx/lifecycle/g0;)V", "", "d", "()Ljava/util/List;", "Lus0/d$c;", "source", "c", "(Ljava/lang/String;Lus0/d$c;Lq83/d;)Ljava/lang/Object;", "Lec3/t1;", "e", "()Lec3/t1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ltr2/n;", "x", "Landroid/content/Context;", "y", "Landroid/bluetooth/BluetoothAdapter;", "z", "Ld52/a;", "E", "Lbc3/c0;", "F", "Lus0/e;", "G", "Lvk0/b;", "H", "Lx42/d;", "I", "Lqt0/a;", "J", "La6/g;", "K", "Lus0/a;", "", "L", "Ljava/util/Map;", "puffins", "Lec3/o1;", "M", "Lec3/o1;", "connectedPuffinFlow", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39228j implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC35209e connectivityAnalytics;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC36076b bleTaskExecutor;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC37967d puffinMemfaultFactory;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC30585a bleScanner;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC0422g dataStorePreferences;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC35205a backgroundUsageAggregator;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final Map<String, InterfaceC39219a> puffins;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final InterfaceC13072o1 connectedPuffinFlow;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final BluetoothAdapter bluetoothAdapter;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C11719a puffinPacketParser;

    /* JADX INFO: renamed from: y42.j$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.ble.PuffinManager", m100430f = "PuffinManager.kt", m100431l = {81, 82, 87}, m100432m = "connectDevice", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f168656F;

        /* JADX INFO: renamed from: w */
        Object f168657w;

        /* JADX INFO: renamed from: x */
        Object f168658x;

        /* JADX INFO: renamed from: y */
        Object f168659y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f168660z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f168660z = obj;
            this.f168656F |= Integer.MIN_VALUE;
            return C39228j.this.m124992c(null, null, this);
        }
    }

    /* JADX INFO: renamed from: y42.j$b */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.ble.PuffinManager$onCreate$$inlined$flatMapLatest$1", m100430f = "PuffinManager.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f168661w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f168662x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f168663y;

        public b(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC39219a interfaceC39219a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f168662x = interfaceC13062m;
            bVar.f168663y = interfaceC39219a;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f168661w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f168662x;
                InterfaceC13087t1 interfaceC13087t1Mo124937l = ((InterfaceC39219a) this.f168663y).getConnectionStatus();
                this.f168662x = null;
                this.f168663y = null;
                this.f168661w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13087t1Mo124937l, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (InterfaceC39219a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: y42.j$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f168664w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C39228j f168665x;

        /* JADX INFO: renamed from: y42.j$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f168666w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C39228j f168667x;

            /* JADX INFO: renamed from: y42.j$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes10.dex */
            @InterfaceC32271e(m100429c = "com.whoop.puffin.ble.PuffinManager$onCreate$$inlined$map$1$2", m100430f = "PuffinManager.kt", m100431l = {54, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42676a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f168668E;

                /* JADX INFO: renamed from: F */
                Object f168669F;

                /* JADX INFO: renamed from: G */
                Object f168670G;

                /* JADX INFO: renamed from: H */
                Object f168671H;

                /* JADX INFO: renamed from: I */
                Object f168672I;

                /* JADX INFO: renamed from: J */
                Object f168673J;

                /* JADX INFO: renamed from: K */
                int f168674K;

                /* JADX INFO: renamed from: L */
                int f168675L;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f168676w;

                /* JADX INFO: renamed from: x */
                int f168677x;

                /* JADX INFO: renamed from: y */
                Object f168678y;

                public C42676a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f168676w = obj;
                    this.f168677x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C39228j c39228j) {
                this.f168666w = interfaceC13062m;
                this.f168667x = c39228j;
            }

            /* JADX WARN: Code duplicated, block: B:26:0x00b1 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42676a c42676a;
                InterfaceC13062m interfaceC13062m;
                int i13;
                int i14;
                if (interfaceC30057d instanceof C42676a) {
                    c42676a = (C42676a) interfaceC30057d;
                    int i15 = c42676a.f168677x;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        c42676a.f168677x = i15 - Integer.MIN_VALUE;
                    } else {
                        c42676a = new C42676a(interfaceC30057d);
                    }
                } else {
                    c42676a = new C42676a(interfaceC30057d);
                }
                Object obj2 = c42676a.f168676w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i16 = c42676a.f168677x;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (i16 != 0) {
                    if (i16 == 1) {
                        i14 = c42676a.f168674K;
                        interfaceC13062m = (InterfaceC13062m) c42676a.f168671H;
                        AbstractC34132o.m107864I(obj2);
                    } else {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj2);
                    }
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj2);
                interfaceC13062m = this.f168666w;
                i13 = 0;
                if (AbstractC22676k.m65745e((AbstractC4251b) obj, AbstractC4251b.c.f17284a)) {
                    this.f168667x.logger.mo85226q("Puffin disconnected, resetting connectedPuffinFlow to null", new AbstractC30556a.a[0]);
                    InterfaceC13072o1 interfaceC13072o1 = this.f168667x.connectedPuffinFlow;
                    c42676a.f168678y = null;
                    c42676a.f168668E = null;
                    c42676a.f168669F = null;
                    c42676a.f168670G = null;
                    c42676a.f168671H = interfaceC13062m;
                    c42676a.f168672I = null;
                    c42676a.f168673J = null;
                    c42676a.f168674K = 0;
                    c42676a.f168675L = 0;
                    c42676a.f168677x = 1;
                    if (interfaceC13072o1.emit(null, c42676a) != enumC31071a) {
                        i14 = 0;
                    }
                } else {
                    c42676a.f168678y = null;
                    c42676a.f168668E = null;
                    c42676a.f168669F = null;
                    c42676a.f168670G = null;
                    c42676a.f168671H = null;
                    c42676a.f168672I = null;
                    c42676a.f168673J = null;
                    c42676a.f168674K = i13;
                    c42676a.f168677x = 2;
                    if (interfaceC13062m.emit(c23454a0, c42676a) != enumC31071a) {
                        return c23454a0;
                    }
                }
                return enumC31071a;
                i13 = i14;
                c42676a.f168678y = null;
                c42676a.f168668E = null;
                c42676a.f168669F = null;
                c42676a.f168670G = null;
                c42676a.f168671H = null;
                c42676a.f168672I = null;
                c42676a.f168673J = null;
                c42676a.f168674K = i13;
                c42676a.f168677x = 2;
                if (interfaceC13062m.emit(c23454a0, c42676a) != enumC31071a) {
                    return enumC31071a;
                }
                return c23454a0;
            }
        }

        public c(InterfaceC13058l interfaceC13058l, C39228j c39228j) {
            this.f168664w = interfaceC13058l;
            this.f168665x = c39228j;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f168664w.collect(new a(interfaceC13062m, this.f168665x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C39228j(InterfaceC34116n logger, Context context, BluetoothAdapter bluetoothAdapter, C11719a puffinPacketParser, InterfaceC2994c0 coroutineScope, InterfaceC35209e connectivityAnalytics, InterfaceC36076b bleTaskExecutor, InterfaceC37967d puffinMemfaultFactory, InterfaceC30585a bleScanner, InterfaceC0422g dataStorePreferences, InterfaceC35205a backgroundUsageAggregator) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(bluetoothAdapter, "bluetoothAdapter");
        AbstractC22676k.m65750j(puffinPacketParser, "puffinPacketParser");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(connectivityAnalytics, "connectivityAnalytics");
        AbstractC22676k.m65750j(bleTaskExecutor, "bleTaskExecutor");
        AbstractC22676k.m65750j(puffinMemfaultFactory, "puffinMemfaultFactory");
        AbstractC22676k.m65750j(bleScanner, "bleScanner");
        AbstractC22676k.m65750j(dataStorePreferences, "dataStorePreferences");
        AbstractC22676k.m65750j(backgroundUsageAggregator, "backgroundUsageAggregator");
        this.logger = logger;
        this.context = context;
        this.bluetoothAdapter = bluetoothAdapter;
        this.puffinPacketParser = puffinPacketParser;
        this.coroutineScope = coroutineScope;
        this.connectivityAnalytics = connectivityAnalytics;
        this.bleTaskExecutor = bleTaskExecutor;
        this.puffinMemfaultFactory = puffinMemfaultFactory;
        this.bleScanner = bleScanner;
        this.dataStorePreferences = dataStorePreferences;
        this.backgroundUsageAggregator = backgroundUsageAggregator;
        this.puffins = new LinkedHashMap();
        this.connectedPuffinFlow = AbstractC13091v.m36592b(1, 0, null, 6);
    }

    /* JADX INFO: renamed from: f */
    private final InterfaceC39219a m124991f(String macAddress) {
        String str;
        try {
            str = macAddress;
            try {
                C39223e c39223e = new C39223e(null, this.coroutineScope, str, 1, null);
                C40077a c40077a = new C40077a(null, this.puffinPacketParser, this.coroutineScope, null, this.backgroundUsageAggregator, 9, null);
                C40079c c40079c = new C40079c(null, this.puffinPacketParser, this.coroutineScope, null, this.backgroundUsageAggregator, 9, null);
                C40078b c40078b = new C40078b(null, this.puffinPacketParser, this.coroutineScope, null, this.backgroundUsageAggregator, 9, null);
                C40080d c40080d = new C40080d(null, this.coroutineScope, null, this.backgroundUsageAggregator, 5, null);
                BluetoothDevice remoteDevice = this.bluetoothAdapter.getRemoteDevice(str);
                Context context = this.context;
                AbstractC22676k.m65747g(remoteDevice);
                C39226h c39226h = new C39226h(null, context, str, c39223e, remoteDevice, this.coroutineScope, null, this.connectivityAnalytics, c40077a, c40079c, c40078b, c40080d, this.bleTaskExecutor, this.bleScanner, this.dataStorePreferences, this.backgroundUsageAggregator, 65, null);
                c39226h.m124983l1();
                return c39226h;
            } catch (IllegalArgumentException unused) {
                this.logger.mo85222m(AbstractC11266d.m30461o("Invalid mac address - ", str), new AbstractC30556a.a[0]);
                return null;
            }
        } catch (IllegalArgumentException unused2) {
            str = macAddress;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e1, code lost:
    
        if (r14.emit(r12, r0) == r1) goto L39;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m124992c(java.lang.String r12, us0.InterfaceC35208d.c r13, q83.InterfaceC30057d<? super y42.InterfaceC39219a> r14) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y42.C39228j.m124992c(java.lang.String, us0.d$c, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: d */
    public final List<InterfaceC39219a> m124993d() {
        return AbstractC25265s.m74092D0(this.connectedPuffinFlow.getReplayCache());
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC13087t1 m124994e() {
        return AbstractC13091v.m36586L(new C4588i(this.connectedPuffinFlow, 2), this.coroutineScope, C13105z1.f45289b, 1);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        AbstractC13091v.m36582H(new c(AbstractC13091v.m36590P(new C4588i(this.connectedPuffinFlow, 2), new b(null)), this), this.coroutineScope);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onDestroy(InterfaceC1585g0 interfaceC1585g0) {
        super.onDestroy(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onPause(InterfaceC1585g0 interfaceC1585g0) {
        super.onPause(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onResume(InterfaceC1585g0 interfaceC1585g0) {
        super.onResume(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStart(InterfaceC1585g0 interfaceC1585g0) {
        super.onStart(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStop(InterfaceC1585g0 interfaceC1585g0) {
        super.onStop(interfaceC1585g0);
    }
}
