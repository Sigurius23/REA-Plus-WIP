package d41;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: d41.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m65681d2 = {"Ld41/g;", "", "Ly3/f;", "height", "width", "<init>", "(Ljava/lang/String;IFF)V", "F", "getHeight-D9Ej5fM", "()F", "getWidth-D9Ej5fM", "SMALL", "LARGE", "FULLWIDTH", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC11681g {
    SMALL(190, 160),
    LARGE(260, 240),
    FULLWIDTH(216, 300);

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    private final float height;
    private final float width;

    EnumC11681g(float f13, float f14) {
        this.height = f13;
        this.width = f14;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    /* JADX INFO: renamed from: getHeight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: getWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getWidth() {
        return this.width;
    }
}
