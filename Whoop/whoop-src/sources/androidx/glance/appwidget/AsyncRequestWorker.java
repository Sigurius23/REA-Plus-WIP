package androidx.glance.appwidget;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3069w1;
import bc3.AbstractC3076z;
import hc3.AbstractC17182o;
import kc3.C22365e;
import n20.C26175j;
import p218ic.C18358g;
import p451r6.C30960n;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m65681d2 = {"Landroidx/glance/appwidget/AsyncRequestWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "p6/t", "glance-appwidget"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class AsyncRequestWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: w */
    public final AbstractC3069w1 f5855w;

    /* JADX INFO: renamed from: x */
    public final C30960n f5856x;

    public AsyncRequestWorker(Context context, WorkerParameters workerParameters) {
        byte[] bArr;
        super(context, workerParameters);
        C22365e c22365e = AbstractC3050q0.f12077a;
        this.f5855w = AbstractC17182o.f65999a;
        C18358g c18358g = workerParameters.f7333b;
        c18358g.getClass();
        Object obj = c18358g.f71480a.get("request");
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            bArr = new byte[length];
            for (int i13 = 0; i13 < length; i13++) {
                Object obj2 = objArr[i13];
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Byte");
                }
                bArr[i13] = ((Byte) obj2).byteValue();
            }
        } else {
            bArr = null;
        }
        this.f5856x = C30960n.m95228F(bArr);
    }

    @Override // androidx.work.CoroutineWorker
    public final Object doWork(InterfaceC30057d interfaceC30057d) {
        return AbstractC3006f0.m8719m(new C26175j(this, (InterfaceC30057d) null, 12), interfaceC30057d);
    }

    @Override // androidx.work.CoroutineWorker
    public final AbstractC3076z getCoroutineContext() {
        return this.f5855w;
    }
}
