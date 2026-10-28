package b51;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: b51.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\"\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\"\u0010\u0006\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0011\"\u0004\b\u001a\u0010\u0013¨\u0006\u001b"}, m65681d2 = {"Lb51/b;", "Lb51/a;", "", "x", "y", "width", "height", "<init>", "(FFFF)V", "", "px", "py", "", "c", "(II)Z", "a", "F", "()F", "setX", "(F)V", "b", "setY", "getWidth", "setWidth", "d", "getHeight", "setHeight", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C2738b implements InterfaceC2737a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private float x;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private float y;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private float width;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float height;

    public C2738b(float f13, float f14, float f15, float f16) {
        this.x = f13;
        this.y = f14;
        this.width = f15;
        this.height = f16;
    }

    @Override // b51.InterfaceC2737a
    /* JADX INFO: renamed from: a, reason: from getter */
    public float getX() {
        return this.x;
    }

    @Override // b51.InterfaceC2737a
    /* JADX INFO: renamed from: b, reason: from getter */
    public float getY() {
        return this.y;
    }

    @Override // b51.InterfaceC2737a
    /* JADX INFO: renamed from: c */
    public boolean mo7711c(int px, int py3) {
        return super.mo7711c(px, py3);
    }

    @Override // b51.InterfaceC2737a
    public float getHeight() {
        return this.height;
    }

    @Override // b51.InterfaceC2737a
    public float getWidth() {
        return this.width;
    }

    public /* synthetic */ C2738b(float f13, float f14, float f15, float f16, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0.0f : f13, (i13 & 2) != 0 ? 0.0f : f14, (i13 & 4) != 0 ? 0.0f : f15, (i13 & 8) != 0 ? 0.0f : f16);
    }
}
