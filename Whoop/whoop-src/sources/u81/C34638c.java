package u81;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import t81.C33599e;

/* JADX INFO: renamed from: u81.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lu81/c;", "", "<init>", "()V", "", "currentZoom", "Lt81/e;", "zoomToggleState", "a", "(FLt81/e;)F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34638c {

    /* JADX INFO: renamed from: a */
    public static final C34638c f145937a = new C34638c();

    private C34638c() {
    }

    /* JADX INFO: renamed from: a */
    public final float m109474a(float currentZoom, C33599e zoomToggleState) {
        AbstractC22676k.m65750j(zoomToggleState, "zoomToggleState");
        return currentZoom >= zoomToggleState.getZoomInLevel() ? zoomToggleState.getZoomOutLevel() : zoomToggleState.getZoomInLevel();
    }
}
