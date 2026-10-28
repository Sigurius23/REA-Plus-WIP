package lm0;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import dc3.C11935t;
import dc3.InterfaceC11936u;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13022c;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: lm0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0016\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Llm0/a;", "", "Landroid/content/Context;", "context", "Landroid/content/IntentFilter;", "intentFilter", "Landroid/bluetooth/BluetoothAdapter;", "bluetoothAdapter", "Lbc3/c0;", "applicationScope", "Llm0/e;", "contextCompatWrapper", "<init>", "(Landroid/content/Context;Landroid/content/IntentFilter;Landroid/bluetooth/BluetoothAdapter;Lbc3/c0;Llm0/e;)V", "a", "Landroid/content/Context;", "b", "Landroid/content/IntentFilter;", "c", "Landroid/bluetooth/BluetoothAdapter;", "Lec3/l;", "Llm0/c;", "d", "Lec3/l;", "flow", "e", "()Lec3/l;", "bluetoothStateFlow", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24506a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final IntentFilter intentFilter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final BluetoothAdapter bluetoothAdapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC13058l flow;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC13058l bluetoothStateFlow;

    /* JADX INFO: renamed from: lm0.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.broadcastlisteners.BleStateChangeReceiver$bluetoothStateFlow$1", m100430f = "BleStateChangeReceiver.kt", m100431l = {49}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Llm0/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f95608w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f95609x;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f95609x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f95609x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f95608w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                EnumC24508c enumC24508c = EnumC24508c.ON;
                this.f95609x = null;
                this.f95608w = 1;
                if (interfaceC13062m.emit(enumC24508c, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: lm0.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.broadcastlisteners.BleStateChangeReceiver$flow$1", m100430f = "BleStateChangeReceiver.kt", m100431l = {43}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ldc3/u;", "Llm0/c;", "Ll83/a0;", "<anonymous>", "(Ldc3/u;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C24506a f95610E;

        /* JADX INFO: renamed from: w */
        Object f95611w;

        /* JADX INFO: renamed from: x */
        int f95612x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f95613y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C24510e f95614z;

        /* JADX INFO: renamed from: lm0.a$b$a */
        @Metadata(m65680d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"lm0/a$b$a", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Ll83/a0;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends BroadcastReceiver {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InterfaceC11936u f95615a;

            public a(InterfaceC11936u interfaceC11936u) {
                this.f95615a = interfaceC11936u;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                AbstractC22676k.m65750j(context, "context");
                AbstractC22676k.m65750j(intent, "intent");
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                if (intExtra == 10) {
                    ((C11935t) this.f95615a).mo32218s(EnumC24508c.OFF);
                } else {
                    if (intExtra != 12) {
                        return;
                    }
                    ((C11935t) this.f95615a).mo32218s(EnumC24508c.ON);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C24510e c24510e, C24506a c24506a, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f95614z = c24510e;
            this.f95610E = c24506a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final C23454a0 m71351h(C24506a c24506a, a aVar) {
            c24506a.context.unregisterReceiver(aVar);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f95614z, this.f95610E, interfaceC30057d);
            bVar.f95613y = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC11936u interfaceC11936u, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC11936u, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC11936u interfaceC11936u = (InterfaceC11936u) this.f95613y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f95612x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                final a aVar = new a(interfaceC11936u);
                this.f95614z.m71374a(this.f95610E.context, aVar, this.f95610E.intentFilter, 4);
                if (!this.f95610E.bluetoothAdapter.isEnabled()) {
                    ((C11935t) interfaceC11936u).mo32218s(EnumC24508c.OFF);
                }
                final C24506a c24506a = this.f95610E;
                InterfaceC4339a interfaceC4339a = new InterfaceC4339a() { // from class: lm0.b
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        return C24506a.b.m71351h(c24506a, aVar);
                    }
                };
                this.f95613y = null;
                this.f95611w = null;
                this.f95612x = 1;
                if (AbstractC37056f.m118984h(interfaceC11936u, interfaceC4339a, this) == enumC31071a) {
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

    public C24506a(Context context, IntentFilter intentFilter, BluetoothAdapter bluetoothAdapter, InterfaceC2994c0 applicationScope, C24510e contextCompatWrapper) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(intentFilter, "intentFilter");
        AbstractC22676k.m65750j(bluetoothAdapter, "bluetoothAdapter");
        AbstractC22676k.m65750j(applicationScope, "applicationScope");
        AbstractC22676k.m65750j(contextCompatWrapper, "contextCompatWrapper");
        this.context = context;
        this.intentFilter = intentFilter;
        this.bluetoothAdapter = bluetoothAdapter;
        C13022c c13022cM36600j = AbstractC13091v.m36600j(new b(contextCompatWrapper, this, null));
        this.flow = c13022cM36600j;
        this.bluetoothStateFlow = AbstractC13091v.m36586L(new C13015a0(new a(null), c13022cM36600j), applicationScope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC13058l getBluetoothStateFlow() {
        return this.bluetoothStateFlow;
    }

    public /* synthetic */ C24506a(Context context, IntentFilter intentFilter, BluetoothAdapter bluetoothAdapter, InterfaceC2994c0 interfaceC2994c0, C24510e c24510e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, intentFilter, bluetoothAdapter, interfaceC2994c0, (i13 & 16) != 0 ? new C24510e() : c24510e);
    }
}
