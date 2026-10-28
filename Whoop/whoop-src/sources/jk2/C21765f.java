package jk2;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.InterfaceC11372l;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: jk2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0017\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0019\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u001b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u001d\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\u001e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u001f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010!\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u0017\u0010#\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010\f\u001a\u0004\b\u0006\u0010\u000e¨\u0006$"}, m65681d2 = {"Ljk2/f;", "", "<init>", "()V", "Ld0/l;", "Ly3/f;", "b", "Ld0/l;", "a", "()Ld0/l;", "ANIMATION_SPEC", "c", "F", "k", "()F", "TOOLBAR_HEIGHT_NORMAL", "d", "j", "TOOLBAR_HEIGHT_ANIMATED", "e", "g", "PILL_HEIGHT_NORMAL", "f", "PILL_HEIGHT_ANIMATED", "i", "PILL_OFFSET_NORMAL", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "PILL_OFFSET_ANIMATED", "getPILL_OFFSET_NONE-D9Ej5fM", "PILL_OFFSET_NONE", "FLAME_SIZE_NORMAL", "FLAME_SIZE_ANIMATED", "l", "FLAME_END_PADDING_NORMAL", "m", "FLAME_END_PADDING_ANIMATED", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21765f {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final float TOOLBAR_HEIGHT_NORMAL;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final float TOOLBAR_HEIGHT_ANIMATED;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final float PILL_HEIGHT_NORMAL;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final float PILL_HEIGHT_ANIMATED;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final float PILL_OFFSET_NORMAL;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final float PILL_OFFSET_ANIMATED;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final float PILL_OFFSET_NONE;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final float FLAME_SIZE_NORMAL;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static final float FLAME_SIZE_ANIMATED;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private static final float FLAME_END_PADDING_NORMAL;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private static final float FLAME_END_PADDING_ANIMATED;

    /* JADX INFO: renamed from: a */
    public static final C21765f f83729a = new C21765f();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final InterfaceC11372l ANIMATION_SPEC = AbstractC11348f.m30574v(300, 0, AbstractC11333b0.f36310a, 2);

    /* JADX INFO: renamed from: n */
    public static final int f83742n = 8;

    static {
        float f13 = 4;
        TOOLBAR_HEIGHT_NORMAL = 12 * f13;
        TOOLBAR_HEIGHT_ANIMATED = 13 * f13;
        float f14 = 8;
        PILL_HEIGHT_NORMAL = f14 * f13;
        PILL_HEIGHT_ANIMATED = 9 * f13;
        PILL_OFFSET_NORMAL = (-2) * f13;
        PILL_OFFSET_ANIMATED = (-3) * f13;
        PILL_OFFSET_NONE = 0 * f13;
        FLAME_SIZE_NORMAL = 6 * f13;
        FLAME_SIZE_ANIMATED = 7 * f13;
        float f15 = ((float) 0.5d) * f14;
        FLAME_END_PADDING_NORMAL = f15;
        FLAME_END_PADDING_ANIMATED = f15;
    }

    private C21765f() {
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC11372l m61487a() {
        return ANIMATION_SPEC;
    }

    /* JADX INFO: renamed from: b */
    public final float m61488b() {
        return FLAME_END_PADDING_ANIMATED;
    }

    /* JADX INFO: renamed from: c */
    public final float m61489c() {
        return FLAME_END_PADDING_NORMAL;
    }

    /* JADX INFO: renamed from: d */
    public final float m61490d() {
        return FLAME_SIZE_ANIMATED;
    }

    /* JADX INFO: renamed from: e */
    public final float m61491e() {
        return FLAME_SIZE_NORMAL;
    }

    /* JADX INFO: renamed from: f */
    public final float m61492f() {
        return PILL_HEIGHT_ANIMATED;
    }

    /* JADX INFO: renamed from: g */
    public final float m61493g() {
        return PILL_HEIGHT_NORMAL;
    }

    /* JADX INFO: renamed from: h */
    public final float m61494h() {
        return PILL_OFFSET_ANIMATED;
    }

    /* JADX INFO: renamed from: i */
    public final float m61495i() {
        return PILL_OFFSET_NORMAL;
    }

    /* JADX INFO: renamed from: j */
    public final float m61496j() {
        return TOOLBAR_HEIGHT_ANIMATED;
    }

    /* JADX INFO: renamed from: k */
    public final float m61497k() {
        return TOOLBAR_HEIGHT_NORMAL;
    }
}
