package lm0;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Set;
import l83.C23454a0;
import m83.C25235a0;
import p000.AbstractC11266d;
import p007a6.InterfaceC0422g;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p138f6.AbstractC14134f;
import p138f6.C14129a;
import p138f6.C14132d;
import p319m4.AbstractC25012a;
import p479s4.AbstractC32122c;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22659b0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: lm0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\b\u0007*\u0001?\u0018\u0000 C2\u00020\u0001:\u0001DB=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001d\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0082@¢\u0006\u0004\b \u0010\u001aJ\u001a\u0010!\u001a\u00020\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0082@¢\u0006\u0004\b!\u0010\u001aJ!\u0010#\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\"\u001a\u00020\u001fH\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00132\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00132\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b+\u0010*J\u000f\u0010,\u001a\u00020\u0013H\u0000¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0013H\u0000¢\u0006\u0004\b.\u0010-J\u0019\u0010/\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\r2\u0006\u00102\u001a\u00020\rH\u0000¢\u0006\u0004\b3\u00104J\u001f\u00105\u001a\u00020\u001f2\u0006\u00101\u001a\u00020\r2\u0006\u00102\u001a\u00020\rH\u0000¢\u0006\u0004\b5\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00109R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010:R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006E"}, m65681d2 = {"Llm0/d;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/content/Context;", "context", "Lfi0/a;", "analytics", "La6/g;", "Lf6/f;", "dataStorePreferences", "Lbc3/c0;", "coroutineScope", "Ltr2/n;", "logger", "", "sdkInt", "<init>", "(Landroid/content/Context;Lfi0/a;La6/g;Lbc3/c0;Ltr2/n;I)V", "Landroid/content/Intent;", "intent", "Ll83/a0;", "r", "(Landroid/content/Intent;)V", "q", "Landroid/bluetooth/BluetoothDevice;", "device", "p", "(Landroid/bluetooth/BluetoothDevice;Lq83/d;)Ljava/lang/Object;", "", "bondLossReason", "y", "(Landroid/bluetooth/BluetoothDevice;Ljava/lang/String;)V", "", "v", "B", "wasDevicePreviouslyLost", "z", "(Landroid/bluetooth/BluetoothDevice;Z)V", "o", "(Landroid/content/Intent;)Landroid/bluetooth/BluetoothDevice;", "Landroidx/lifecycle/g0;", "owner", "onCreate", "(Landroidx/lifecycle/g0;)V", "onDestroy", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "()V", "A", "n", "(Landroid/content/Intent;)Ljava/lang/String;", "bondState", "previousBondState", "u", "(II)Z", "t", "Landroid/content/Context;", "x", "Lfi0/a;", "La6/g;", "Lbc3/c0;", "E", "Ltr2/n;", "F", "I", "lm0/d$g", "G", "Llm0/d$g;", "receiver", "H", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24509d implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: I */
    private static final C14132d f95620I = AbstractC15751g.m44442V("bond_loss_reported_devices");

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final int sdkInt;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final g receiver;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC0422g dataStorePreferences;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: lm0.d$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.broadcastlisteners.BondLossReceiver", m100430f = "BondLossReceiver.kt", m100431l = {142}, m100432m = "handleBondRestored", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f95628E;

        /* JADX INFO: renamed from: w */
        Object f95629w;

        /* JADX INFO: renamed from: x */
        Object f95630x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f95631y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f95631y = obj;
            this.f95628E |= Integer.MIN_VALUE;
            return C24509d.this.m71363p(null, this);
        }
    }

    /* JADX INFO: renamed from: lm0.d$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.broadcastlisteners.BondLossReceiver$handleBondRestored$2", m100430f = "BondLossReceiver.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f95633w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f95634x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f95635y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f95635y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f95635y, interfaceC30057d);
            cVar.f95634x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f95634x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f95633w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Set set = (Set) c14129a.mo40227b(C24509d.f95620I);
            if (set == null) {
                set = C25235a0.f99113w;
            }
            c14129a.m40230g(C24509d.f95620I, AbstractC12350b.m34604y(this.f95635y, set));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: lm0.d$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.broadcastlisteners.BondLossReceiver$handleBondStateChange$1", m100430f = "BondLossReceiver.kt", m100431l = {129, 130}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        boolean f95636w;

        /* JADX INFO: renamed from: x */
        int f95637x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ BluetoothDevice f95639z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(BluetoothDevice bluetoothDevice, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f95639z = bluetoothDevice;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C24509d.this.new d(this.f95639z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            boolean z4;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f95637x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C24509d c24509d = C24509d.this;
                BluetoothDevice bluetoothDevice = this.f95639z;
                this.f95637x = 1;
                obj = c24509d.m71352B(bluetoothDevice, this);
                if (obj != enumC31071a) {
                }
                return enumC31071a;
            }
            if (i13 == 1) {
                AbstractC34132o.m107864I(obj);
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z4 = this.f95636w;
                AbstractC34132o.m107864I(obj);
            }
            C24509d.this.m71368z(this.f95639z, z4);
            return C23454a0.f92919a;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            C24509d c24509d2 = C24509d.this;
            BluetoothDevice bluetoothDevice2 = this.f95639z;
            this.f95636w = zBooleanValue;
            this.f95637x = 2;
            if (c24509d2.m71363p(bluetoothDevice2, this) != enumC31071a) {
                z4 = zBooleanValue;
                C24509d.this.m71368z(this.f95639z, z4);
                return C23454a0.f92919a;
            }
            return enumC31071a;
        }
    }

    /* JADX INFO: renamed from: lm0.d$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.broadcastlisteners.BondLossReceiver", m100430f = "BondLossReceiver.kt", m100431l = {169}, m100432m = "markBondLossReported", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f95641F;

        /* JADX INFO: renamed from: w */
        Object f95642w;

        /* JADX INFO: renamed from: x */
        Object f95643x;

        /* JADX INFO: renamed from: y */
        Object f95644y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f95645z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f95645z = obj;
            this.f95641F |= Integer.MIN_VALUE;
            return C24509d.this.m71366v(null, this);
        }
    }

    /* JADX INFO: renamed from: lm0.d$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.broadcastlisteners.BondLossReceiver$markBondLossReported$2", m100430f = "BondLossReceiver.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f95646w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f95647x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C22659b0 f95648y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f95649z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C22659b0 c22659b0, String str, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f95648y = c22659b0;
            this.f95649z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = new f(this.f95648y, this.f95649z, interfaceC30057d);
            fVar.f95647x = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f95647x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f95646w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Set set = (Set) c14129a.mo40227b(C24509d.f95620I);
            if (set == null) {
                set = C25235a0.f99113w;
            }
            this.f95648y.f89329w = set.contains(this.f95649z);
            if (!this.f95648y.f89329w) {
                c14129a.m40230g(C24509d.f95620I, AbstractC12350b.m34555D(this.f95649z, set));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: lm0.d$g */
    @Metadata(m65680d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"lm0/d$g", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Ll83/a0;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends BroadcastReceiver {
        public g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(intent, "intent");
            String action = intent.getAction();
            if (action != null) {
                int iHashCode = action.hashCode();
                if (iHashCode == 1695159015) {
                    if (action.equals("android.bluetooth.device.action.KEY_MISSING")) {
                        C24509d.this.m71365r(intent);
                    }
                } else if (iHashCode == 2116862345 && action.equals("android.bluetooth.device.action.BOND_STATE_CHANGED")) {
                    C24509d.this.m71364q(intent);
                }
            }
        }
    }

    /* JADX INFO: renamed from: lm0.d$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.broadcastlisteners.BondLossReceiver$trackBondLossEvent$1", m100430f = "BondLossReceiver.kt", m100431l = {151}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f95651w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ BluetoothDevice f95653y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f95654z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(BluetoothDevice bluetoothDevice, String str, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f95653y = bluetoothDevice;
            this.f95654z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C24509d.this.new h(this.f95653y, this.f95654z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f95651w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C24509d c24509d = C24509d.this;
                BluetoothDevice bluetoothDevice = this.f95653y;
                this.f95651w = 1;
                obj = c24509d.m71366v(bluetoothDevice, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                InterfaceC14515a.m41418i(C24509d.this.analytics, null, "Detected", null, "Bond Loss", null, AbstractC31061c.m95645u("bond_loss_reason", this.f95654z), 21, null);
                InterfaceC34116n interfaceC34116n = C24509d.this.logger;
                BluetoothDevice bluetoothDevice2 = this.f95653y;
                interfaceC34116n.mo85216g(AbstractC31061c.m95640p("Bond loss event tracked - Device: ", bluetoothDevice2 != null ? bluetoothDevice2.getAddress() : null, ", Reason: ", this.f95654z), new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: lm0.d$i */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.broadcastlisteners.BondLossReceiver", m100430f = "BondLossReceiver.kt", m100431l = {181}, m100432m = "wasDevicePreviouslyLost", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f95655E;

        /* JADX INFO: renamed from: w */
        Object f95656w;

        /* JADX INFO: renamed from: x */
        Object f95657x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f95658y;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f95658y = obj;
            this.f95655E |= Integer.MIN_VALUE;
            return C24509d.this.m71352B(null, this);
        }
    }

    public C24509d(Context context, InterfaceC14515a analytics, InterfaceC0422g dataStorePreferences, InterfaceC2994c0 coroutineScope, InterfaceC34116n logger, int i13) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(dataStorePreferences, "dataStorePreferences");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(logger, "logger");
        this.context = context;
        this.analytics = analytics;
        this.dataStorePreferences = dataStorePreferences;
        this.coroutineScope = coroutineScope;
        this.logger = logger;
        this.sdkInt = i13;
        this.receiver = new g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: B */
    public final Object m71352B(BluetoothDevice bluetoothDevice, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        i iVar;
        String address;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i13 = iVar.f95655E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iVar.f95655E = i13 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        Object objM36575A = iVar.f95658y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = iVar.f95655E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM36575A);
            if (bluetoothDevice == null || (address = bluetoothDevice.getAddress()) == null) {
                return Boolean.FALSE;
            }
            InterfaceC13058l data = this.dataStorePreferences.getData();
            iVar.f95656w = null;
            iVar.f95657x = address;
            iVar.f95655E = 1;
            objM36575A = AbstractC13091v.m36575A(data, iVar);
            if (objM36575A == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            address = (String) iVar.f95657x;
            AbstractC34132o.m107864I(objM36575A);
        }
        Set set = (Set) ((AbstractC14134f) objM36575A).mo40227b(f95620I);
        if (set == null) {
            set = C25235a0.f99113w;
        }
        return Boolean.valueOf(set.contains(address));
    }

    /* JADX INFO: renamed from: o */
    private final BluetoothDevice m71362o(Intent intent) {
        return this.sdkInt >= 33 ? (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE", BluetoothDevice.class) : (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public final Object m71363p(BluetoothDevice bluetoothDevice, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        b bVar;
        String address;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f95628E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f95628E = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f95631y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f95628E;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (bluetoothDevice != null && (address = bluetoothDevice.getAddress()) != null) {
                InterfaceC0422g interfaceC0422g = this.dataStorePreferences;
                c cVar = new c(address, null);
                bVar.f95629w = null;
                bVar.f95630x = address;
                bVar.f95628E = 1;
                if (AbstractC17269i.m48861G(interfaceC0422g, cVar, bVar) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return c23454a0;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        address = (String) bVar.f95630x;
        AbstractC34132o.m107864I(obj);
        this.logger.mo85216g(AbstractC11266d.m30461o("Bond restored - re-enabled tracking for: ", address), new AbstractC30556a.a[0]);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final void m71364q(Intent intent) {
        BluetoothDevice bluetoothDeviceM71362o = m71362o(intent);
        int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", Integer.MIN_VALUE);
        int intExtra2 = intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", Integer.MIN_VALUE);
        if (m71372u(intExtra, intExtra2)) {
            this.logger.mo85216g(AbstractC2875y.m8300m("Bond restored: ", bluetoothDeviceM71362o != null ? bluetoothDeviceM71362o.getName() : null, " (", bluetoothDeviceM71362o != null ? bluetoothDeviceM71362o.getAddress() : null, ")"), new AbstractC30556a.a[0]);
            AbstractC3006f0.m8732z(this.coroutineScope, null, null, new d(bluetoothDeviceM71362o, null), 3);
        } else if (m71371t(intExtra, intExtra2)) {
            this.logger.mo85226q(AbstractC2875y.m8300m("Bond lost: ", bluetoothDeviceM71362o != null ? bluetoothDeviceM71362o.getName() : null, " (", bluetoothDeviceM71362o != null ? bluetoothDeviceM71362o.getAddress() : null, ")"), new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final void m71365r(Intent intent) {
        BluetoothDevice bluetoothDeviceM71362o = m71362o(intent);
        String strM71370n = m71370n(intent);
        this.logger.mo85216g(AbstractC25012a.m73376i(bluetoothDeviceM71362o != null ? bluetoothDeviceM71362o.getAddress() : null, ")", AbstractC11895b.m32001t("Bond key missing - Reason: ", strM71370n, ", Device: ", bluetoothDeviceM71362o != null ? bluetoothDeviceM71362o.getName() : null, " (")), new AbstractC30556a.a[0]);
        m71367y(bluetoothDeviceM71362o, strM71370n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: v */
    public final Object m71366v(BluetoothDevice bluetoothDevice, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        e eVar;
        String address;
        C22659b0 c22659b0;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f95641F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f95641F = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object obj = eVar.f95645z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar.f95641F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (bluetoothDevice == null || (address = bluetoothDevice.getAddress()) == null) {
                return Boolean.TRUE;
            }
            C22659b0 c22659b1 = new C22659b0();
            InterfaceC0422g interfaceC0422g = this.dataStorePreferences;
            f fVar = new f(c22659b1, address, null);
            eVar.f95642w = null;
            eVar.f95643x = null;
            eVar.f95644y = c22659b1;
            eVar.f95641F = 1;
            if (AbstractC17269i.m48861G(interfaceC0422g, fVar, eVar) == enumC31071a) {
                return enumC31071a;
            }
            c22659b0 = c22659b1;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22659b0 = (C22659b0) eVar.f95644y;
            AbstractC34132o.m107864I(obj);
        }
        return Boolean.valueOf(!c22659b0.f89329w);
    }

    /* JADX INFO: renamed from: y */
    private final void m71367y(BluetoothDevice device, String bondLossReason) {
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new h(device, bondLossReason, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public final void m71368z(BluetoothDevice device, boolean wasDevicePreviouslyLost) {
        InterfaceC14515a.m41418i(this.analytics, null, "Recovered", null, "Bond Loss", null, AbstractC36095b.m114688p(Boolean.valueOf(wasDevicePreviouslyLost), "was_device_previously_reported_lost"), 21, null);
        this.logger.mo85216g(AbstractC11266d.m30461o("Bond Loss recovered event tracked - Device: ", device != null ? device.getAddress() : null), new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: A */
    public final void m71369A() {
        try {
            this.context.unregisterReceiver(this.receiver);
            this.logger.mo85216g("BondLossReceiver unregistered", new AbstractC30556a.a[0]);
        } catch (IllegalArgumentException unused) {
            this.logger.mo85226q("BondLossReceiver was already unregistered", new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: n */
    public final String m71370n(Intent intent) {
        int intExtra;
        AbstractC22676k.m65750j(intent, "intent");
        if (this.sdkInt < 36 || (intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_LOSS_REASON", -1)) == -1) {
            return null;
        }
        if (intExtra == 0) {
            return "unknown";
        }
        if (intExtra == 1) {
            return "Bluetooth authentication failure";
        }
        if (intExtra == 2) {
            return "Bluetooth incoming pairing";
        }
        if (intExtra == 3) {
            return "LE encryption failure";
        }
        if (intExtra == 4) {
            return "LE incoming pairing";
        }
        this.logger.mo85226q(AbstractC2875y.m8295h(intExtra, "Unrecognized bond loss reason: "), new AbstractC30556a.a[0]);
        return AbstractC2875y.m8295h(intExtra, "unrecognized_");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        m71373w();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        m71369A();
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

    /* JADX INFO: renamed from: t */
    public final boolean m71371t(int bondState, int previousBondState) {
        return bondState == 10 && previousBondState == 12;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m71372u(int bondState, int previousBondState) {
        if (bondState == 12) {
            return previousBondState == 10 || previousBondState == 11;
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final void m71373w() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        if (this.sdkInt >= 36) {
            intentFilter.addAction("android.bluetooth.device.action.KEY_MISSING");
        }
        AbstractC32122c.registerReceiver(this.context, this.receiver, intentFilter, 2);
        this.logger.mo85216g("BondLossReceiver registered - Actions: ".concat(this.sdkInt >= 36 ? "ACTION_KEY_MISSING + ACTION_BOND_STATE_CHANGED" : "ACTION_BOND_STATE_CHANGED"), new AbstractC30556a.a[0]);
    }
}
