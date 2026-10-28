package t21;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.InterfaceC11372l;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: t21.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0016\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u0017\u0010\u0018\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, m65681d2 = {"Lt21/a;", "", "<init>", "()V", "Ld0/l;", "Ly3/f;", "b", "Ld0/l;", "a", "()Ld0/l;", "ANIMATION_SPEC", "c", "F", "g", "()F", "PILL_HEIGHT_NORMAL", "d", "f", "PILL_HEIGHT_ANIMATED", "e", "ICON_SIZE_NORMAL", "ICON_SIZE_ANIMATED", "ICON_END_PADDING_NORMAL", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "ICON_END_PADDING_ANIMATED", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33343a {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final float PILL_HEIGHT_NORMAL;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final float PILL_HEIGHT_ANIMATED;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final float ICON_SIZE_NORMAL;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final float ICON_SIZE_ANIMATED;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final float ICON_END_PADDING_NORMAL;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final float ICON_END_PADDING_ANIMATED;

    /* JADX INFO: renamed from: a */
    public static final C33343a f139135a = new C33343a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final InterfaceC11372l ANIMATION_SPEC = AbstractC11348f.m30574v(300, 0, AbstractC11333b0.f36310a, 2);

    /* JADX INFO: renamed from: i */
    public static final int f139143i = 8;

    static {
        float f13 = 8;
        float f14 = 4;
        PILL_HEIGHT_NORMAL = f13 * f14;
        PILL_HEIGHT_ANIMATED = 9 * f14;
        ICON_SIZE_NORMAL = 6 * f14;
        ICON_SIZE_ANIMATED = 7 * f14;
        float f15 = ((float) 0.5d) * f13;
        ICON_END_PADDING_NORMAL = f15;
        ICON_END_PADDING_ANIMATED = f15;
    }

    private C33343a() {
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC11372l m105703a() {
        return ANIMATION_SPEC;
    }

    /* JADX INFO: renamed from: b */
    public final float m105704b() {
        return ICON_END_PADDING_ANIMATED;
    }

    /* JADX INFO: renamed from: c */
    public final float m105705c() {
        return ICON_END_PADDING_NORMAL;
    }

    /* JADX INFO: renamed from: d */
    public final float m105706d() {
        return ICON_SIZE_ANIMATED;
    }

    /* JADX INFO: renamed from: e */
    public final float m105707e() {
        return ICON_SIZE_NORMAL;
    }

    /* JADX INFO: renamed from: f */
    public final float m105708f() {
        return PILL_HEIGHT_ANIMATED;
    }

    /* JADX INFO: renamed from: g */
    public final float m105709g() {
        return PILL_HEIGHT_NORMAL;
    }
}
