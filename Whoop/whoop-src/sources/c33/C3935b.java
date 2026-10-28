package c33;

import bc3.C2999d1;
import c93.InterfaceC4339a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c33.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C3935b extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: x */
    public static final C3935b f16065x;

    /* JADX INFO: renamed from: y */
    public static final C3935b f16066y;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16067w;

    static {
        int i13 = 0;
        f16065x = new C3935b(i13, 0);
        f16066y = new C3935b(i13, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3935b(int i13, int i14) {
        super(i13);
        this.f16067w = i14;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f16067w) {
            case 0:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC3934a(0));
                AbstractC22676k.m65749i(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
                return new C2999d1(executorServiceNewSingleThreadExecutor);
            default:
                return new C3939f();
        }
    }
}
