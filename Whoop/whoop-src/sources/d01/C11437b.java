package d01;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: d01.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\r\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000f\u0010\bR\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\b¨\u0006\u001e"}, m65681d2 = {"Ld01/b;", "", "<init>", "()V", "Ly3/f;", "b", "F", "g", "()F", "minHeightDp", "c", "d", "horizontalPadding", "k", "verticalPadding", "e", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "rowSpacing", "f", "i", "titleSubtitleSpacing", "leadingIconSize", "leadingImageSize", "j", "trailingIconSize", "avatarStackDiameter", "avatarStackOverlap", "l", "a", "avatarStackBorder", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final class C11437b {

    /* JADX INFO: renamed from: a */
    public static final C11437b f36666a = new C11437b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final float minHeightDp = 60;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final float horizontalPadding;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final float verticalPadding;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final float rowSpacing;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final float titleSubtitleSpacing;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final float leadingIconSize;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final float leadingImageSize;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final float trailingIconSize;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final float avatarStackDiameter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static final float avatarStackOverlap;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private static final float avatarStackBorder;

    static {
        float f13 = 8;
        horizontalPadding = 2 * f13;
        float f14 = (float) 1.5d;
        verticalPadding = f14 * f13;
        float f15 = 4;
        float f16 = 3 * f15;
        rowSpacing = f16;
        titleSubtitleSpacing = ((float) 0.5d) * f15;
        float f17 = 6 * f15;
        leadingIconSize = f17;
        leadingImageSize = f13 * f15;
        trailingIconSize = f15 * f15;
        avatarStackDiameter = f17;
        avatarStackOverlap = f16;
        avatarStackBorder = f14;
    }

    private C11437b() {
    }

    /* JADX INFO: renamed from: a */
    public final float m30679a() {
        return avatarStackBorder;
    }

    /* JADX INFO: renamed from: b */
    public final float m30680b() {
        return avatarStackDiameter;
    }

    /* JADX INFO: renamed from: c */
    public final float m30681c() {
        return avatarStackOverlap;
    }

    /* JADX INFO: renamed from: d */
    public final float m30682d() {
        return horizontalPadding;
    }

    /* JADX INFO: renamed from: e */
    public final float m30683e() {
        return leadingIconSize;
    }

    /* JADX INFO: renamed from: f */
    public final float m30684f() {
        return leadingImageSize;
    }

    /* JADX INFO: renamed from: g */
    public final float m30685g() {
        return minHeightDp;
    }

    /* JADX INFO: renamed from: h */
    public final float m30686h() {
        return rowSpacing;
    }

    /* JADX INFO: renamed from: i */
    public final float m30687i() {
        return titleSubtitleSpacing;
    }

    /* JADX INFO: renamed from: j */
    public final float m30688j() {
        return trailingIconSize;
    }

    /* JADX INFO: renamed from: k */
    public final float m30689k() {
        return verticalPadding;
    }
}
