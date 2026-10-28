package ro;

import a33.C0352d;
import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC4980k;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jp.HandlerC21846d;
import o73.C27648a;
import p073cq.C11040i;
import p073cq.C11043l;
import p073cq.C11052u;
import p073cq.RunnableC11042k;
import p108e4.AbstractC12682p;
import p360o8.C27651c;
import p397p8.RunnableC28963a;
import p403pp.C29408d;
import p499t9.C33652u;
import p507tx.AbstractC34235f;
import p529uo.AbstractC35135w;
import p656yp.C39697d;
import to.C33980j0;

/* JADX INFO: renamed from: ro.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C31619d {

    /* JADX INFO: renamed from: a */
    public int f130645a;

    /* JADX INFO: renamed from: b */
    public C27651c f130646b;

    /* JADX INFO: renamed from: c */
    public final Context f130647c;

    /* JADX INFO: renamed from: d */
    public boolean f130648d;

    /* JADX INFO: renamed from: e */
    public boolean f130649e;

    /* JADX INFO: renamed from: f */
    public boolean f130650f;

    /* JADX INFO: renamed from: g */
    public boolean f130651g;

    /* JADX INFO: renamed from: h */
    public final Executor f130652h;

    /* JADX INFO: renamed from: i */
    public volatile RunnableC28963a f130653i;

    /* JADX INFO: renamed from: j */
    public volatile RunnableC28963a f130654j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f130655k;

    /* JADX INFO: renamed from: l */
    public Object f130656l;

    /* JADX INFO: renamed from: m */
    public final Object f130657m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C31619d(Context context, Set set) {
        this(context);
        this.f130655k = 0;
        this.f130656l = new Semaphore(0);
        this.f130657m = set;
    }

    /* JADX INFO: renamed from: a */
    public final void m97685a() {
        if (this.f130653i != null) {
            if (!this.f130648d) {
                this.f130651g = true;
            }
            if (this.f130654j != null) {
                this.f130653i.getClass();
                this.f130653i = null;
                return;
            }
            this.f130653i.getClass();
            RunnableC28963a runnableC28963a = this.f130653i;
            runnableC28963a.f117136z.set(true);
            if (runnableC28963a.f117134x.cancel(false)) {
                this.f130654j = this.f130653i;
            }
            this.f130653i = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m97686b(Object obj) {
        C27651c c27651c = this.f130646b;
        if (c27651c != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                c27651c.setValue(obj);
            } else {
                c27651c.postValue(obj);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m97687c() {
        if (this.f130654j != null || this.f130653i == null) {
            return;
        }
        this.f130653i.getClass();
        RunnableC28963a runnableC28963a = this.f130653i;
        Executor executor = this.f130652h;
        if (runnableC28963a.f117135y == 1) {
            runnableC28963a.f117135y = 2;
            runnableC28963a.f117133w.getClass();
            executor.execute(runnableC28963a.f117134x);
        } else {
            int iM35485e = AbstractC12682p.m35485e(runnableC28963a.f117135y);
            if (iM35485e == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (iM35485e == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("We should never reach this state");
        }
    }

    /* JADX INFO: renamed from: d */
    public final Object m97688d() {
        int iIndexOf;
        switch (this.f130655k) {
            case 0:
                Iterator it = ((Set) this.f130657m).iterator();
                if (it.hasNext()) {
                    ((AbstractC4980k) it.next()).getClass();
                    throw new UnsupportedOperationException();
                }
                try {
                    ((Semaphore) this.f130656l).tryAcquire(0, 5L, TimeUnit.SECONDS);
                    return null;
                } catch (InterruptedException e5) {
                    Log.i("GACSignInLoader", "Unexpected InterruptedException", e5);
                    Thread.currentThread().interrupt();
                    return null;
                }
            default:
                String[] strArrSplit = C27648a.m83579b0(this.f130647c.getApplicationContext(), "third_party_license_metadata", 0L, -1).split("\n");
                ArrayList arrayList = new ArrayList(strArrSplit.length);
                for (String str : strArrSplit) {
                    int iIndexOf2 = str.indexOf(32);
                    String[] strArrSplit2 = str.substring(0, iIndexOf2).split(":");
                    if (strArrSplit2.length != 2 || iIndexOf2 <= 0) {
                        Object[] objArr = {str};
                        StringBuilder sb4 = new StringBuilder(50);
                        char c3 = 0;
                        int i13 = 0;
                        while (c3 <= 0 && (iIndexOf = "Invalid license meta-data line:\n%s".indexOf("%s", i13)) != -1) {
                            sb4.append((CharSequence) "Invalid license meta-data line:\n%s", i13, iIndexOf);
                            sb4.append(objArr[0]);
                            i13 = iIndexOf + 2;
                            c3 = 1;
                        }
                        sb4.append((CharSequence) "Invalid license meta-data line:\n%s", i13, 34);
                        if (c3 <= 0) {
                            sb4.append(" [");
                            sb4.append(objArr[0]);
                            sb4.append(']');
                        }
                        throw new IllegalStateException(sb4.toString());
                    }
                    arrayList.add(new C29408d(Integer.parseInt(strArrSplit2[1]), str.substring(iIndexOf2 + 1), Long.parseLong(strArrSplit2[0])));
                }
                Collections.sort(arrayList);
                C39697d c39697d = (C39697d) ((C33652u) this.f130657m).f140441w;
                Task taskDoRead = c39697d.doRead(new C33980j0(c39697d, arrayList));
                TimeUnit timeUnit = TimeUnit.SECONDS;
                AbstractC35135w.m111095g(taskDoRead, "Task must not be null");
                AbstractC35135w.m111095g(timeUnit, "TimeUnit must not be null");
                C11043l c11043l = new C11043l();
                C11040i c11040i = new C11040i(c11043l);
                HandlerC21846d handlerC21846d = new HandlerC21846d(Looper.getMainLooper(), 3);
                handlerC21846d.postDelayed(new RunnableC11042k(0, c11040i), timeUnit.toMillis(2L));
                taskDoRead.addOnCompleteListener(new C0352d(handlerC21846d, c11040i, c11043l, 11));
                C11052u c11052u = c11040i.f34644a;
                try {
                    Tasks.await(c11052u);
                    return c11052u.isSuccessful() ? (List) c11052u.getResult() : arrayList;
                } catch (InterruptedException | ExecutionException e13) {
                    Log.w("OssLicensesLoader", "Error getting license list from service: ".concat(String.valueOf(e13.getMessage())));
                    return arrayList;
                }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m97689e() {
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder(64);
        AbstractC34235f.m108239y(sb4, this);
        sb4.append(" id=");
        return AbstractC18489d0.m53371l(sb4, this.f130645a, "}");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C31619d(Context context, C33652u c33652u) {
        this(context.getApplicationContext());
        this.f130655k = 1;
        this.f130657m = c33652u;
    }

    public C31619d(Context context) {
        ThreadPoolExecutor threadPoolExecutor = RunnableC28963a.f117127H;
        this.f130648d = false;
        this.f130649e = false;
        this.f130650f = true;
        this.f130651g = false;
        this.f130647c = context.getApplicationContext();
        this.f130652h = threadPoolExecutor;
    }
}
