package androidx.lifecycle;

import android.bluetooth.BluetoothDevice;
import android.os.Process;
import android.os.StrictMode;
import android.view.Choreographer;
import androidx.health.platform.client.proto.C1533u;
import androidx.room.ExecutorC1834u1;
import b23.C2342h;
import bc3.C3033m;
import cc3.C4419b;
import com.amplitude.android.engagement.C4861a;
import com.amplitude.quickjs.wrapper.QuickJSContext;
import com.google.crypto.tink.internal.C5101l0;
import com.mapbox.common.LifecycleState;
import com.mapbox.common.LifecycleUtils;
import en0.AbstractC13363a;
import gt.C16174m;
import gt.C16175n;
import ht.ThreadFactoryC17612a;
import io.sentry.C20315e;
import io.sentry.C20323e7;
import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20408l1;
import io.sentry.InterfaceC20602v0;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.C20071e0;
import io.sentry.android.core.internal.util.C20116q;
import io.sentry.android.ndk.C20177b;
import io.sentry.cache.C20283f;
import io.sentry.cache.tape.AbstractC20289f;
import io.sentry.ndk.NativeScope;
import io.sentry.protocol.C20470c;
import io.sentry.protocol.C20481h0;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import l83.C23454a0;
import lc3.C23832b;
import lc3.C23836f;
import lc3.InterfaceC23837g;
import nc.C26557a;
import p014aj.C0928c;
import p034bl.C3363c;
import p114eb.AbstractC12979o0;
import p161g.AbstractActivityC14909l;
import p161g.C14923z;
import p222ij.C18587m;
import p222ij.C18588n;
import p222ij.C18594t;
import p249jc.AbstractC21598x;
import p249jc.C21586l;
import p692zt.C41113q;
import p715kotlin.jvm.functions.Function1;
import st.InterfaceC32956a;
import t92.AbstractC33664b;

/* JADX INFO: renamed from: androidx.lifecycle.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1605m implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f6275w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f6276x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f6277y;

    public /* synthetic */ RunnableC1605m(int i13, Object obj, Object obj2) {
        this.f6275w = i13;
        this.f6277y = obj;
        this.f6276x = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2342h c2342h;
        switch (this.f6275w) {
            case 0:
                C1608n c1608n = (C1608n) this.f6277y;
                if (!c1608n.f6284d.offer((Runnable) this.f6276x)) {
                    throw new IllegalStateException("cannot enqueue any more runnables");
                }
                c1608n.m5007a();
                return;
            case 1:
                Runnable runnable = (Runnable) this.f6276x;
                ExecutorC1834u1 executorC1834u1 = (ExecutorC1834u1) this.f6277y;
                try {
                    runnable.run();
                    return;
                } finally {
                    executorC1834u1.m5453a();
                }
            case 2:
                ((C3033m) this.f6277y).m8758C((C4419b) this.f6276x);
                return;
            case 3:
                LifecycleUtils.getLifecycleState$lambda$24$lambda$20$lambda$19$lambda$18((Function1) this.f6277y, (LifecycleState) this.f6276x);
                return;
            case 4:
                AbstractC13363a.m37626e((AbstractC13363a) this.f6277y, this.f6276x);
                return;
            case 5:
                AbstractActivityC14909l abstractActivityC14909l = (AbstractActivityC14909l) this.f6277y;
                abstractActivityC14909l.getLifecycle().mo4986a(new C1641y(1, (C14923z) this.f6276x, abstractActivityC14909l));
                return;
            case 6:
                C16175n c16175n = (C16175n) this.f6277y;
                InterfaceC32956a interfaceC32956a = (InterfaceC32956a) this.f6276x;
                if (c16175n.f61465b != C16175n.f61463d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (c16175n) {
                    c2342h = c16175n.f61464a;
                    c16175n.f61464a = null;
                    c16175n.f61465b = interfaceC32956a;
                    break;
                }
                c2342h.getClass();
                return;
            case 7:
                C16174m c16174m = (C16174m) this.f6277y;
                InterfaceC32956a interfaceC32956a2 = (InterfaceC32956a) this.f6276x;
                synchronized (c16174m) {
                    try {
                        if (c16174m.f61461b == null) {
                            c16174m.f61460a.add(interfaceC32956a2);
                        } else {
                            c16174m.f61461b.add(interfaceC32956a2.get());
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            case 8:
                ThreadFactoryC17612a threadFactoryC17612a = (ThreadFactoryC17612a) this.f6277y;
                Runnable runnable2 = (Runnable) this.f6276x;
                Process.setThreadPriority(threadFactoryC17612a.f68311y);
                StrictMode.ThreadPolicy threadPolicy = threadFactoryC17612a.f68312z;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 9:
                C18587m c18587m = (C18587m) this.f6277y;
                CountDownLatch countDownLatch = (CountDownLatch) this.f6276x;
                try {
                    try {
                        System.loadLibrary("quickjs-android-wrapper");
                        c18587m.f72607e = QuickJSContext.create();
                        c18587m.f72608f = new C41113q(c18587m);
                        C41113q c41113q = new C41113q(c18587m);
                        c41113q.f177224x = "nudgeServices";
                        c18587m.f72609g = c41113q;
                        new C18594t(c18587m);
                        new C0928c(c18587m, c18587m.f72604b);
                        c18587m.f72611i = new C18588n(c18587m);
                        c18587m.m53804d();
                        c18587m.m53805e();
                        c18587m.f72612j.m119209O();
                        c18587m.m53803c();
                    } finally {
                        countDownLatch.countDown();
                    }
                    break;
                } catch (Exception e5) {
                    C4861a.f20259o.m16032K("Failed to load bundle", e5);
                }
                return;
            case 10:
                ActivityLifecycleIntegration.m55890h((InterfaceC20408l1) this.f6277y, (InterfaceC20408l1) this.f6276x);
                return;
            case 11:
                ((C20071e0) this.f6277y).m55942h((InterfaceC20602v0) this.f6276x);
                return;
            case 12:
                C20116q c20116q = (C20116q) this.f6277y;
                InterfaceC20602v0 interfaceC20602v0 = (InterfaceC20602v0) this.f6276x;
                try {
                    c20116q.f75569J = Choreographer.getInstance();
                    return;
                } catch (Throwable th4) {
                    interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th4);
                    return;
                }
            case 13:
                C20177b c20177b = (C20177b) this.f6277y;
                C20315e c20315e = (C20315e) this.f6276x;
                C20513q6 c20513q6 = c20177b.f75784a;
                EnumC20436n5 enumC20436n5 = c20315e.f76290I;
                String strMo56236b = null;
                String lowerCase = enumC20436n5 != null ? enumC20436n5.name().toLowerCase(Locale.ROOT) : null;
                String strM60667W = AbstractC21598x.m60667W(c20315e.m56469b());
                try {
                    ConcurrentHashMap concurrentHashMap = c20315e.f76287F;
                    if (!concurrentHashMap.isEmpty()) {
                        strMo56236b = c20513q6.getSerializer().mo56236b(concurrentHashMap);
                    }
                    break;
                } catch (Throwable th5) {
                    c20513q6.getLogger().mo16058i(EnumC20436n5.ERROR, th5, "Breadcrumb data is not serializable.", new Object[0]);
                }
                String str = strMo56236b;
                NativeScope nativeScope = c20177b.f75785b;
                String str2 = c20315e.f76295z;
                String str3 = c20315e.f76288G;
                String str4 = c20315e.f76286E;
                nativeScope.getClass();
                NativeScope.nativeAddBreadcrumb(lowerCase, str2, str3, str4, strM60667W, str);
                return;
            case 14:
                C20177b c20177b2 = (C20177b) this.f6277y;
                String str5 = (String) this.f6276x;
                c20177b2.f75785b.getClass();
                NativeScope.nativeRemoveTag(str5);
                return;
            case 15:
                C20177b c20177b3 = (C20177b) this.f6277y;
                C20481h0 c20481h0 = (C20481h0) this.f6276x;
                NativeScope nativeScope2 = c20177b3.f75785b;
                if (c20481h0 == null) {
                    nativeScope2.getClass();
                    NativeScope.nativeRemoveUser();
                    return;
                }
                String str6 = c20481h0.f76688x;
                String str7 = c20481h0.f76687w;
                String str8 = c20481h0.f76690z;
                String str9 = c20481h0.f76689y;
                nativeScope2.getClass();
                NativeScope.nativeSetUser(str6, str7, str8, str9);
                return;
            case 16:
                C20177b c20177b4 = (C20177b) this.f6277y;
                C20323e7 c20323e7 = (C20323e7) this.f6276x;
                NativeScope nativeScope3 = c20177b4.f75785b;
                String string = c20323e7.f76321w.toString();
                String string2 = c20323e7.f76322x.toString();
                nativeScope3.getClass();
                NativeScope.nativeSetTrace(string, string2);
                return;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C20283f c20283f = (C20283f) this.f6277y;
                C20481h0 c20481h1 = (C20481h0) this.f6276x;
                if (c20481h1 == null) {
                    c20283f.m56265a("user.json");
                    return;
                } else {
                    c20283f.m56268g(c20481h1, "user.json");
                    return;
                }
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                ((C20283f) this.f6277y).m56268g((Map) this.f6276x, "tags.json");
                return;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C20283f c20283f2 = (C20283f) this.f6277y;
                try {
                    ((AbstractC20289f) c20283f2.f76166b.m56714a()).mo56270m((C20315e) this.f6276x);
                    return;
                } catch (IOException e13) {
                    c20283f2.f76165a.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to add breadcrumb to file queue", e13);
                    return;
                }
            case 20:
                ((C20283f) this.f6277y).m56268g((C20470c) this.f6276x, "contexts.json");
                return;
            case 21:
                C20283f c20283f3 = (C20283f) this.f6277y;
                String str10 = (String) this.f6276x;
                if (str10 == null) {
                    c20283f3.m56265a("transaction.json");
                    return;
                } else {
                    c20283f3.m56268g(str10, "transaction.json");
                    return;
                }
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                C20283f c20283f4 = (C20283f) this.f6277y;
                try {
                    ((Runnable) this.f6276x).run();
                    return;
                } catch (Throwable th6) {
                    c20283f4.f76165a.getLogger().mo16060j(EnumC20436n5.ERROR, "Serialization task failed", th6);
                    return;
                }
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                Runnable runnable3 = (Runnable) this.f6276x;
                CountDownLatch countDownLatch2 = (CountDownLatch) this.f6277y;
                runnable3.run();
                countDownLatch2.countDown();
                return;
            case 24:
                ((C5101l0) ((C3363c) this.f6277y).f13106y).m16061j0((C21586l) this.f6276x, 3);
                return;
            case 25:
                ((C23836f) ((InterfaceC23837g) this.f6277y)).m70042g((C23832b) this.f6276x, C23454a0.f92919a);
                return;
            case 26:
                ExecutorC1834u1 executorC1834u2 = (ExecutorC1834u1) this.f6277y;
                Runnable runnable4 = (Runnable) this.f6276x;
                executorC1834u2.getClass();
                try {
                    runnable4.run();
                    return;
                } finally {
                    executorC1834u2.m5453a();
                }
            case 27:
                List list = (List) this.f6277y;
                AbstractC12979o0 abstractC12979o0 = (AbstractC12979o0) this.f6276x;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((C26557a) it.next()).m78686a(abstractC12979o0.f44831e);
                }
                return;
            default:
                AbstractC33664b.m106334c2((AbstractC33664b) this.f6277y, (BluetoothDevice) this.f6276x);
                return;
        }
    }

    public /* synthetic */ RunnableC1605m(ActivityLifecycleIntegration activityLifecycleIntegration, InterfaceC20408l1 interfaceC20408l1, InterfaceC20408l1 interfaceC20408l2) {
        this.f6275w = 10;
        this.f6277y = interfaceC20408l1;
        this.f6276x = interfaceC20408l2;
    }

    public /* synthetic */ RunnableC1605m(Runnable runnable, Object obj, int i13) {
        this.f6275w = i13;
        this.f6276x = runnable;
        this.f6277y = obj;
    }
}
