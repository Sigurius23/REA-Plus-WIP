package y73;

import java.util.concurrent.ThreadFactory;
import l73.AbstractC23415f;
import l73.AbstractC23416g;

/* JADX INFO: renamed from: y73.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C39297i extends AbstractC23416g {

    /* JADX INFO: renamed from: b */
    public static final ThreadFactoryC39299k f169079b = new ThreadFactoryC39299k("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())), false);

    /* JADX INFO: renamed from: a */
    public final ThreadFactory f169080a = f169079b;

    @Override // l73.AbstractC23416g
    /* JADX INFO: renamed from: a */
    public final AbstractC23415f mo67908a() {
        return new C39298j(this.f169080a);
    }
}
