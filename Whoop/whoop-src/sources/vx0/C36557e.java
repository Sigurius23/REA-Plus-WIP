package vx0;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import com.whoop.ble.api.scan.ScanFailure;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13045h2;
import ec3.C13100y;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import ft0.InterfaceC14765a;
import ft0.InterfaceC14766b;
import ft0.InterfaceC14767c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import mj0.AbstractC25617f;
import mj0.C25616e;
import nj0.InterfaceC26750f;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: vx0.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0012\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Lvx0/e;", "Landroidx/lifecycle/w1;", "Lft0/c;", "whoopDeviceManager", "<init>", "(Lft0/c;)V", "Ll83/a0;", "o", "()V", "p", "Lmj0/e;", "candidate", "n", "(Lmj0/e;)V", "Lmj0/d;", "deviceId", "q", "(Ljava/lang/String;)V", "onCleared", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lft0/c;", "Lec3/p1;", "Lvx0/d;", "x", "Lec3/p1;", "_uiState", "Lec3/f2;", "y", "Lec3/f2;", "l", "()Lec3/f2;", "uiState", "Lbc3/k1;", "z", "Lbc3/k1;", "scanJob", "debug-tools_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36557e extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC14767c whoopDeviceManager;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13075p1 _uiState;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13037f2 uiState;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private InterfaceC3027k1 scanJob;

    /* JADX INFO: renamed from: vx0.e$a */
    @InterfaceC32271e(m100429c = "com.whoop.debug.whoopble.WhoopBleDebugViewModel$1", m100430f = "WhoopBleDebugViewModel.kt", m100431l = {32}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f156516w;

        /* JADX INFO: renamed from: vx0.e$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42570a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C36557e f156518w;

            public C42570a(C36557e c36557e) {
                this.f156518w = c36557e;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<? extends InterfaceC14766b> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                List<? extends InterfaceC14766b> list2 = list;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC14766b) it.next()).getId());
                }
                Set setM74103I1 = AbstractC25265s.m74103I1(arrayList);
                InterfaceC13075p1 interfaceC13075p1 = this.f156518w._uiState;
                while (true) {
                    C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
                    Object value = c13045h2.getValue();
                    C36556d c36556d = (C36556d) value;
                    List<C25616e> listM117260d = c36556d.m117260d();
                    ArrayList arrayList2 = new ArrayList();
                    for (T t14 : listM117260d) {
                        if (!setM74103I1.contains(((C25616e) t14).getAddress())) {
                            arrayList2.add(t14);
                        }
                    }
                    List<? extends InterfaceC14766b> list3 = list;
                    if (c13045h2.m36569i(value, C36556d.m117257b(c36556d, list3, null, false, arrayList2, null, false, 54, null))) {
                        return C23454a0.f92919a;
                    }
                    list = list3;
                }
            }
        }

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36557e.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f156516w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13037f2 interfaceC13037f2Mo42332b = C36557e.this.whoopDeviceManager.mo42332b();
                C42570a c42570a = new C42570a(C36557e.this);
                this.f156516w = 1;
                if (interfaceC13037f2Mo42332b.collect(c42570a, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: vx0.e$b */
    @InterfaceC32271e(m100429c = "com.whoop.debug.whoopble.WhoopBleDebugViewModel$2", m100430f = "WhoopBleDebugViewModel.kt", m100431l = {44}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f156519w;

        /* JADX INFO: renamed from: vx0.e$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C36557e f156521w;

            public a(C36557e c36557e) {
                this.f156521w = c36557e;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(InterfaceC14765a interfaceC14765a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                InterfaceC13075p1 interfaceC13075p1 = this.f156521w._uiState;
                while (true) {
                    C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
                    Object value = c13045h2.getValue();
                    InterfaceC14765a interfaceC14765a2 = interfaceC14765a;
                    if (c13045h2.m36569i(value, C36556d.m117257b((C36556d) value, null, interfaceC14765a2, false, null, null, false, 61, null))) {
                        return C23454a0.f92919a;
                    }
                    interfaceC14765a = interfaceC14765a2;
                }
            }
        }

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36557e.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f156519w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13037f2 interfaceC13037f2Mo42334d = C36557e.this.whoopDeviceManager.mo42334d();
                a aVar = new a(C36557e.this);
                this.f156519w = 1;
                if (interfaceC13037f2Mo42334d.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: vx0.e$c */
    @InterfaceC32271e(m100429c = "com.whoop.debug.whoopble.WhoopBleDebugViewModel$pair$1", m100430f = "WhoopBleDebugViewModel.kt", m100431l = {108}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f156522w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C25616e f156524y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C25616e c25616e, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f156524y = c25616e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36557e.this.new c(this.f156524y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C13045h2 c13045h2;
            Object value;
            Object objMo42335e;
            C13045h2 c13045h3;
            Object value2;
            C13045h2 c13045h4;
            Object value3;
            C36556d c36556d;
            String str;
            ArrayList arrayList;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f156522w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13075p1 interfaceC13075p1 = C36557e.this._uiState;
                C25616e c25616e = this.f156524y;
                do {
                    c13045h2 = (C13045h2) interfaceC13075p1;
                    value = c13045h2.getValue();
                } while (!c13045h2.m36569i(value, C36556d.m117257b((C36556d) value, null, null, false, null, AbstractC11895b.m31996o("Pairing ", c25616e.getAdvertisingName(), "…"), true, 15, null)));
                InterfaceC14767c interfaceC14767c = C36557e.this.whoopDeviceManager;
                C25616e c25616e2 = this.f156524y;
                this.f156522w = 1;
                objMo42335e = interfaceC14767c.mo42335e(c25616e2, this);
                if (objMo42335e == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objMo42335e = ((C23468n) obj).f92940w;
            }
            C36557e c36557e = C36557e.this;
            C25616e c25616e3 = this.f156524y;
            if (!(objMo42335e instanceof C23467m)) {
                InterfaceC14766b interfaceC14766b = (InterfaceC14766b) objMo42335e;
                InterfaceC13075p1 interfaceC13075p2 = c36557e._uiState;
                do {
                    c13045h4 = (C13045h2) interfaceC13075p2;
                    value3 = c13045h4.getValue();
                    c36556d = (C36556d) value3;
                    str = "Paired " + interfaceC14766b.getId() + " (" + interfaceC14766b.getProtocol() + "). Connected to Ready.";
                    List<C25616e> listM117260d = c36556d.m117260d();
                    arrayList = new ArrayList();
                    for (Object obj2 : listM117260d) {
                        if (!AbstractC25617f.m75348b(((C25616e) obj2).getAddress(), c25616e3.getAddress())) {
                            arrayList.add(obj2);
                        }
                    }
                } while (!c13045h4.m36569i(value3, C36556d.m117257b(c36556d, null, null, false, arrayList, str, false, 7, null)));
            }
            C36557e c36557e2 = C36557e.this;
            Throwable thM68037a = C23468n.m68037a(objMo42335e);
            if (thM68037a != null) {
                InterfaceC13075p1 interfaceC13075p3 = c36557e2._uiState;
                do {
                    c13045h3 = (C13045h2) interfaceC13075p3;
                    value2 = c13045h3.getValue();
                } while (!c13045h3.m36569i(value2, C36556d.m117257b((C36556d) value2, null, null, false, null, AbstractC11266d.m30461o("Pair failed: ", thM68037a.getMessage()), false, 15, null)));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vx0.e$d */
    @InterfaceC32271e(m100429c = "com.whoop.debug.whoopble.WhoopBleDebugViewModel$startScan$2", m100430f = "WhoopBleDebugViewModel.kt", m100431l = {78}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f156525w;

        /* JADX INFO: renamed from: vx0.e$d$a */
        @InterfaceC32271e(m100429c = "com.whoop.debug.whoopble.WhoopBleDebugViewModel$startScan$2$1", m100430f = "WhoopBleDebugViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "Lmj0/e;", "", "error", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function3 {

            /* JADX INFO: renamed from: w */
            int f156527w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f156528x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C36557e f156529y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C36557e c36557e, InterfaceC30057d<? super a> interfaceC30057d) {
                super(3, interfaceC30057d);
                this.f156529y = c36557e;
            }

            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                a aVar = new a(this.f156529y, interfaceC30057d);
                aVar.f156528x = th3;
                return aVar.invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                C13045h2 c13045h2;
                Object value;
                C36556d c36556d;
                String strM8296i;
                Throwable th3 = (Throwable) this.f156528x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f156527w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC13075p1 interfaceC13075p1 = this.f156529y._uiState;
                do {
                    c13045h2 = (C13045h2) interfaceC13075p1;
                    value = c13045h2.getValue();
                    c36556d = (C36556d) value;
                    if (AbstractC22676k.m65745e(th3, ScanFailure.PermissionDenied.f24070w)) {
                        strM8296i = "BLE permission missing. Grant BLUETOOTH_SCAN/CONNECT in system settings.";
                    } else if (AbstractC22676k.m65745e(th3, ScanFailure.BluetoothOff.f24067w)) {
                        strM8296i = "Bluetooth is off.";
                    } else if (AbstractC22676k.m65745e(th3, ScanFailure.BluetoothUnsupported.f24068w)) {
                        strM8296i = "No Bluetooth adapter on this device.";
                    } else if (AbstractC22676k.m65745e(th3, ScanFailure.LocationServicesOff.f24069w)) {
                        strM8296i = "Turn Location on. Below Android 12 a BLE scan returns nothing without it.";
                    } else {
                        strM8296i = th3 instanceof ScanFailure.Rejected ? AbstractC2875y.m8296i(((ScanFailure.Rejected) th3).getCode(), "Platform rejected the scan (code ", "). Too many scan restarts?") : AbstractC11266d.m30461o("Scan failed: ", th3.getMessage());
                    }
                } while (!c13045h2.m36569i(value, C36556d.m117257b(c36556d, null, null, false, null, strM8296i, false, 47, null)));
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: vx0.e$d$b */
        @InterfaceC32271e(m100429c = "com.whoop.debug.whoopble.WhoopBleDebugViewModel$startScan$2$2", m100430f = "WhoopBleDebugViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lec3/m;", "Lmj0/e;", "", "it", "Ll83/a0;", "<anonymous>", "(Lec3/m;Ljava/lang/Throwable;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements Function3 {

            /* JADX INFO: renamed from: w */
            int f156530w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C36557e f156531x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C36557e c36557e, InterfaceC30057d<? super b> interfaceC30057d) {
                super(3, interfaceC30057d);
                this.f156531x = c36557e;
            }

            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(InterfaceC13062m interfaceC13062m, Throwable th3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return new b(this.f156531x, interfaceC30057d).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                C13045h2 c13045h2;
                Object value;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f156530w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC13075p1 interfaceC13075p1 = this.f156531x._uiState;
                do {
                    c13045h2 = (C13045h2) interfaceC13075p1;
                    value = c13045h2.getValue();
                } while (!c13045h2.m36569i(value, C36556d.m117257b((C36556d) value, null, null, false, null, null, false, 59, null)));
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: vx0.e$d$c */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class c<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C36557e f156532w;

            public c(C36557e c36557e) {
                this.f156532w = c36557e;
            }

            /* JADX WARN: Code duplicated, block: B:19:0x0058  */
            /* JADX WARN: Code duplicated, block: B:22:0x0062  */
            /* JADX WARN: Code duplicated, block: B:27:0x0091  */
            /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
            /* JADX WARN: Code duplicated, block: B:40:0x00ac A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:41:0x0076 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:42:? A[LOOP:1: B:20:0x005c->B:42:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:45:0x00a6 A[SYNTHETIC] */
            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(C25616e c25616e, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                C13045h2 c13045h2;
                Object value;
                C36556d c36556dM117257b;
                List<C25616e> listM117260d;
                Iterator<T> it;
                ArrayList arrayList;
                InterfaceC13075p1 interfaceC13075p1 = this.f156532w._uiState;
                do {
                    c13045h2 = (C13045h2) interfaceC13075p1;
                    value = c13045h2.getValue();
                    c36556dM117257b = (C36556d) value;
                    List<InterfaceC14766b> listM117261e = c36556dM117257b.m117261e();
                    if ((listM117261e instanceof Collection) && listM117261e.isEmpty()) {
                        listM117260d = c36556dM117257b.m117260d();
                        if (!(listM117260d instanceof Collection)) {
                            it = listM117260d.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    arrayList = AbstractC25265s.m74128f1(c25616e, c36556dM117257b.m117260d());
                                    break;
                                }
                                if (AbstractC25617f.m75348b(((C25616e) it.next()).getAddress(), c25616e.getAddress())) {
                                    List<C25616e> listM117260d2 = c36556dM117257b.m117260d();
                                    arrayList = new ArrayList(AbstractC25267u.m74163i0(listM117260d2, 10));
                                    while (r3.hasNext()) {
                                        if (AbstractC25617f.m75348b(c25616e.getAddress(), c25616e.getAddress())) {
                                            c25616e = c25616e;
                                        }
                                        arrayList.add(c25616e);
                                    }
                                    break;
                                    break;
                                }
                            }
                        } else {
                            it = listM117260d.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    arrayList = AbstractC25265s.m74128f1(c25616e, c36556dM117257b.m117260d());
                                    break;
                                }
                                if (AbstractC25617f.m75348b(((C25616e) it.next()).getAddress(), c25616e.getAddress())) {
                                    List<C25616e> listM117260d3 = c36556dM117257b.m117260d();
                                    arrayList = new ArrayList(AbstractC25267u.m74163i0(listM117260d3, 10));
                                    for (C25616e c25616e2 : listM117260d3) {
                                        if (AbstractC25617f.m75348b(c25616e2.getAddress(), c25616e.getAddress())) {
                                            c25616e2 = c25616e;
                                        }
                                        arrayList.add(c25616e2);
                                    }
                                    break;
                                    break;
                                }
                            }
                        }
                        c36556dM117257b = C36556d.m117257b(c36556dM117257b, null, null, false, arrayList, null, false, 55, null);
                    } else {
                        Iterator<T> it3 = listM117261e.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                listM117260d = c36556dM117257b.m117260d();
                                if (!(listM117260d instanceof Collection) && listM117260d.isEmpty()) {
                                    arrayList = AbstractC25265s.m74128f1(c25616e, c36556dM117257b.m117260d());
                                    break;
                                }
                                it = listM117260d.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        arrayList = AbstractC25265s.m74128f1(c25616e, c36556dM117257b.m117260d());
                                        break;
                                    }
                                    if (AbstractC25617f.m75348b(((C25616e) it.next()).getAddress(), c25616e.getAddress())) {
                                        List<C25616e> listM117260d4 = c36556dM117257b.m117260d();
                                        arrayList = new ArrayList(AbstractC25267u.m74163i0(listM117260d4, 10));
                                        while (r3.hasNext()) {
                                            if (AbstractC25617f.m75348b(c25616e2.getAddress(), c25616e.getAddress())) {
                                                c25616e2 = c25616e;
                                            }
                                            arrayList.add(c25616e2);
                                        }
                                        break;
                                    }
                                }
                                c36556dM117257b = C36556d.m117257b(c36556dM117257b, null, null, false, arrayList, null, false, 55, null);
                            } else if (AbstractC22676k.m65745e(((InterfaceC14766b) it3.next()).getId(), c25616e.getAddress())) {
                            }
                        }
                    }
                } while (!c13045h2.m36569i(value, c36556dM117257b));
                return C23454a0.f92919a;
            }
        }

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36557e.this.new d(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f156525w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13100y c13100y = new C13100y(new C13015a0(C36557e.this.whoopDeviceManager.mo42331a(InterfaceC26750f.INSTANCE.m79625c()), new a(C36557e.this, null)), new b(C36557e.this, null));
                c cVar = new c(C36557e.this);
                this.f156525w = 1;
                if (c13100y.collect(cVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: vx0.e$e */
    @InterfaceC32271e(m100429c = "com.whoop.debug.whoopble.WhoopBleDebugViewModel$unpair$1", m100430f = "WhoopBleDebugViewModel.kt", m100431l = {132}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f156533w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f156535y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f156535y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36557e.this.new e(this.f156535y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C13045h2 c13045h2;
            Object value;
            C13045h2 c13045h3;
            Object value2;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f156533w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13075p1 interfaceC13075p1 = C36557e.this._uiState;
                String str = this.f156535y;
                do {
                    c13045h2 = (C13045h2) interfaceC13075p1;
                    value = c13045h2.getValue();
                } while (!c13045h2.m36569i(value, C36556d.m117257b((C36556d) value, null, null, false, null, AbstractC11895b.m31996o("Unpairing ", str, "…"), true, 15, null)));
                InterfaceC14767c interfaceC14767c = C36557e.this.whoopDeviceManager;
                String str2 = this.f156535y;
                this.f156533w = 1;
                if (interfaceC14767c.mo42333c(str2, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            InterfaceC13075p1 interfaceC13075p2 = C36557e.this._uiState;
            String str3 = this.f156535y;
            do {
                c13045h3 = (C13045h2) interfaceC13075p2;
                value2 = c13045h3.getValue();
            } while (!c13045h3.m36569i(value2, C36556d.m117257b((C36556d) value2, null, null, false, null, AbstractC11266d.m30461o("Unpaired ", str3), false, 15, null)));
            return C23454a0.f92919a;
        }
    }

    public C36557e(InterfaceC14767c whoopDeviceManager) {
        AbstractC22676k.m65750j(whoopDeviceManager, "whoopDeviceManager");
        this.whoopDeviceManager = whoopDeviceManager;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new C36556d(null, null, false, null, null, false, 63, null));
        this._uiState = c13045h2M36593c;
        this.uiState = AbstractC13091v.m36598h(c13045h2M36593c);
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new a(null), 3);
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new b(null), 3);
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final InterfaceC13037f2 getUiState() {
        return this.uiState;
    }

    /* JADX INFO: renamed from: n */
    public final void m117268n(C25616e candidate) {
        AbstractC22676k.m65750j(candidate, "candidate");
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new c(candidate, null), 3);
    }

    /* JADX INFO: renamed from: o */
    public final void m117269o() {
        C13045h2 c13045h2;
        Object value;
        if (((C36556d) ((C13045h2) this._uiState).getValue()).getScanning()) {
            return;
        }
        m117270p();
        InterfaceC13075p1 interfaceC13075p1 = this._uiState;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, C36556d.m117257b((C36556d) value, null, null, true, C25271y.f99162w, null, false, 35, null)));
        this.scanJob = AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new d(null), 3);
    }

    @Override // androidx.lifecycle.AbstractC1637w1
    public void onCleared() {
        m117270p();
        super.onCleared();
    }

    /* JADX INFO: renamed from: p */
    public final void m117270p() {
        C13045h2 c13045h2;
        Object value;
        InterfaceC3027k1 interfaceC3027k1 = this.scanJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        this.scanJob = null;
        if (((C36556d) ((C13045h2) this._uiState).getValue()).getScanning()) {
            InterfaceC13075p1 interfaceC13075p1 = this._uiState;
            do {
                c13045h2 = (C13045h2) interfaceC13075p1;
                value = c13045h2.getValue();
            } while (!c13045h2.m36569i(value, C36556d.m117257b((C36556d) value, null, null, false, null, null, false, 59, null)));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m117271q(String deviceId) {
        AbstractC22676k.m65750j(deviceId, "deviceId");
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new e(deviceId, null), 3);
    }
}
