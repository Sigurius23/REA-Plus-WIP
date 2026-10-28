package e31;

import com.whoop.design.util.AbstractC8693b;
import gy0.AbstractC16272a;
import gy0.AbstractC16277f;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p736sz0.AbstractC33208p0;
import p736sz0.Function0;

/* JADX INFO: renamed from: e31.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u0010"}, m65681d2 = {"Le31/d;", "", "<init>", "()V", "Le31/c;", "b", "Le31/c;", "a", "()Le31/c;", "loadingModalState", "c", "d", "successLoadingModalState", "networkErrorModalState", "e", "serverErrorModalState", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12612d {

    /* JADX INFO: renamed from: a */
    public static final C12612d f43056a = new C12612d();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final C12611c loadingModalState = new C12611c(null, AbstractC33208p0.c.f138471e, null, null, null, null, 61, null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final C12611c successLoadingModalState = new C12611c(null, new AbstractC33208p0.h(AbstractC8693b.m21277k(AbstractC16277f.f62321e2), 0, null, 6, null), null, null, null, null, 61, null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final C12611c networkErrorModalState = new C12611c(null, Function0.m105280v(), AbstractC8693b.m21277k(AbstractC16277f.f62283T1), new C12609a(AbstractC8693b.m21277k(AbstractC16277f.f62292W1), null, null, 6, null), null, null, 49, null);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final C12611c serverErrorModalState = new C12611c(null, AbstractC12613e.m35370a(), AbstractC8693b.m21277k(AbstractC16277f.f62344k1), null, new C12609a(AbstractC8693b.m21278l("RELOAD"), null, Integer.valueOf(new AbstractC22403o.a(AbstractC16272a.f61920F2).getId()), 2, null), null, 41, null);

    private C12612d() {
    }

    /* JADX INFO: renamed from: a */
    public final C12611c m35366a() {
        return loadingModalState;
    }

    /* JADX INFO: renamed from: b */
    public final C12611c m35367b() {
        return networkErrorModalState;
    }

    /* JADX INFO: renamed from: c */
    public final C12611c m35368c() {
        return serverErrorModalState;
    }

    /* JADX INFO: renamed from: d */
    public final C12611c m35369d() {
        return successLoadingModalState;
    }
}
