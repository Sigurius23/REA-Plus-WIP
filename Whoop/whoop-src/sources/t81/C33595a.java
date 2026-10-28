package t81;

import e93.AbstractC12889b;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: t81.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lt81/a;", "", "<init>", "()V", "Lh2/b;", "anchorPoint", "", "currentZoom", "targetZoom", "", "currentScrollPosition", "", "startVerticalAxisSize", "a", "(JFFID)I", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33595a {

    /* JADX INFO: renamed from: a */
    public static final C33595a f140188a = new C33595a();

    private C33595a() {
    }

    /* JADX INFO: renamed from: a */
    public final int m106103a(long anchorPoint, float currentZoom, float targetZoom, int currentScrollPosition, double startVerticalAxisSize) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (anchorPoint >> 32));
        int iM36258X = AbstractC12889b.m36258X((fIntBitsToFloat * targetZoom) - ((currentZoom * fIntBitsToFloat) - currentScrollPosition));
        if (iM36258X < 0) {
            return 0;
        }
        return iM36258X;
    }
}
