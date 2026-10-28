package b51;

import p715kotlin.Metadata;

/* JADX INFO: renamed from: b51.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\r\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001c\u0010\u0013\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001c\u0010\u0016\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\f¨\u0006\u0017À\u0006\u0003"}, m65681d2 = {"Lb51/a;", "", "", "px", "py", "", "c", "(II)Z", "", "a", "()F", "setX", "(F)V", "x", "b", "setY", "y", "getWidth", "setWidth", "width", "getHeight", "setHeight", "height", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC2737a {
    /* JADX INFO: renamed from: a */
    float mo7709a();

    /* JADX INFO: renamed from: b */
    float mo7710b();

    /* JADX INFO: renamed from: c */
    default boolean mo7711c(int px, int py3) {
        float f13 = px;
        if (f13 < mo7709a()) {
            return false;
        }
        if (f13 > getWidth() + mo7709a()) {
            return false;
        }
        float f14 = py3;
        if (f14 >= mo7710b()) {
            return f14 <= getHeight() + mo7710b();
        }
        return false;
    }

    float getHeight();

    float getWidth();
}
