package p034bl;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p185h6.InterfaceC16954i;
import p185h6.RunnableC16957l;
import p185h6.ThreadFactoryC16946a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: bl.d */
/* JADX INFO: loaded from: classes.dex */
public final class C3364d implements InterfaceC16954i {

    /* JADX INFO: renamed from: a */
    public final Context f13108a;

    public C3364d(Context context, int i13) {
        switch (i13) {
            case 1:
                this.f13108a = context.getApplicationContext();
                break;
            default:
                this.f13108a = context;
                break;
        }
    }

    @Override // p185h6.InterfaceC16954i
    /* JADX INFO: renamed from: a */
    public void mo9715a(AbstractC37056f abstractC37056f) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC16946a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC16957l(this, abstractC37056f, threadPoolExecutor, 0));
    }
}
