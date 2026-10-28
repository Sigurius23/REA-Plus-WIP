package qk2;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: qk2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b8\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\r\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\bR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u0017\u0010 \u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\bR\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b!\u0010\bR\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u0017\u0010)\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b\u001b\u0010\bR\u0017\u0010*\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b\u000f\u0010\bR\u0017\u0010-\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u0017\u0010/\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u00100\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u0017\u00101\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u0015\u0010\bR\u0017\u00102\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b&\u0010\bR\u0017\u00103\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b(\u0010\bR\u0017\u00104\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b+\u0010\bR\u0017\u00105\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b.\u0010\bR\u0017\u00107\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u00109\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010;\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b#\u0010\b¨\u0006<"}, m65681d2 = {"Lqk2/e;", "", "<init>", "()V", "Ly3/f;", "b", "F", "a", "()F", "BaseTrackHeight", "c", "d", "FillBaseGap", "k", "MaxFillHeight", "e", "v", "ZoneThumbWidth", "f", "u", "ZoneThumbHeight", "g", "t", "ZoneThumbCornerRadius", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "s", "ZoneThumbBorderWidth", "i", "r", "ZoneThumbBelowBaseTrack", "j", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "ZoneTimeLabelTopPadding", "getZoneTimeLabelHeight-D9Ej5fM", "ZoneTimeLabelHeight", "l", "o", "ZoneBarGap", "m", "GoalMarkerLabelHeight", "n", "GoalMarkerDashHeight", "GoalCheckmarkAboveDashGap", "p", "getGoalMarkerReserve-D9Ej5fM", "GoalMarkerReserve", "q", "GoalCheckmarkSize", "GoalDashOn", "GoalDashOff", "ZoneBarChartHeight", "ZoneBarChartHeightWithGoals", "ZoneBarRowHeight", "ZoneBarRowHeightWithGoals", "x", "CompactZoneBarChartHeight", "y", "CompactZoneBarRowHeight", "z", "MinVisibleFillHeight", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30449e {

    /* JADX INFO: renamed from: a */
    public static final C30449e f125125a = new C30449e();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final float BaseTrackHeight;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final float FillBaseGap;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final float MaxFillHeight;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final float ZoneThumbWidth;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final float ZoneThumbHeight;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final float ZoneThumbCornerRadius;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final float ZoneThumbBorderWidth;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final float ZoneThumbBelowBaseTrack;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final float ZoneTimeLabelTopPadding;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static final float ZoneTimeLabelHeight;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private static final float ZoneBarGap;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private static final float GoalMarkerLabelHeight;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private static final float GoalMarkerDashHeight;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private static final float GoalCheckmarkAboveDashGap;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private static final float GoalMarkerReserve;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private static final float GoalCheckmarkSize;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private static final float GoalDashOn;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private static final float GoalDashOff;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private static final float ZoneBarChartHeight;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private static final float ZoneBarChartHeightWithGoals;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private static final float ZoneBarRowHeight;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private static final float ZoneBarRowHeightWithGoals;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private static final float CompactZoneBarChartHeight;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private static final float CompactZoneBarRowHeight;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private static final float MinVisibleFillHeight;

    static {
        float f13 = 2;
        float f14 = 4;
        float f15 = f13 * f14;
        BaseTrackHeight = f15;
        float f16 = (float) 0.25d;
        float f17 = 8;
        float f18 = f16 * f17;
        FillBaseGap = f18;
        float f19 = 25 * f14;
        MaxFillHeight = f19;
        ZoneThumbWidth = f15;
        float f24 = 6 * f14;
        ZoneThumbHeight = f24;
        float f25 = (float) 0.5d;
        float f26 = f25 * f14;
        ZoneThumbCornerRadius = f26;
        float f27 = f16 * f14;
        ZoneThumbBorderWidth = f27;
        float f28 = (f24 - f15) / f13;
        ZoneThumbBelowBaseTrack = f28;
        float f29 = f25 * f17;
        ZoneTimeLabelTopPadding = f29;
        float f34 = ((float) 5.25d) * f14;
        ZoneTimeLabelHeight = f34;
        ZoneBarGap = f29;
        float f35 = f14 * f14;
        GoalMarkerLabelHeight = f35;
        GoalMarkerDashHeight = f27;
        GoalCheckmarkAboveDashGap = f29;
        float f36 = f35 + f29 + f27;
        GoalMarkerReserve = f36;
        GoalCheckmarkSize = ((float) 3.5d) * f14;
        GoalDashOn = ((float) 0.75d) * f14;
        GoalDashOff = f26;
        float f37 = f19 + f18 + f15;
        ZoneBarChartHeight = f37;
        float f38 = f36 + f37;
        ZoneBarChartHeightWithGoals = f38;
        ZoneBarRowHeight = f37 + f28 + f29 + f34;
        ZoneBarRowHeightWithGoals = f38 + f28 + f29 + f34;
        float f39 = f15 + f28;
        CompactZoneBarChartHeight = f39;
        CompactZoneBarRowHeight = f39 + f28 + f29 + f34;
        MinVisibleFillHeight = f26;
    }

    private C30449e() {
    }

    /* JADX INFO: renamed from: a */
    public final float m93185a() {
        return BaseTrackHeight;
    }

    /* JADX INFO: renamed from: b */
    public final float m93186b() {
        return CompactZoneBarChartHeight;
    }

    /* JADX INFO: renamed from: c */
    public final float m93187c() {
        return CompactZoneBarRowHeight;
    }

    /* JADX INFO: renamed from: d */
    public final float m93188d() {
        return FillBaseGap;
    }

    /* JADX INFO: renamed from: e */
    public final float m93189e() {
        return GoalCheckmarkAboveDashGap;
    }

    /* JADX INFO: renamed from: f */
    public final float m93190f() {
        return GoalCheckmarkSize;
    }

    /* JADX INFO: renamed from: g */
    public final float m93191g() {
        return GoalDashOff;
    }

    /* JADX INFO: renamed from: h */
    public final float m93192h() {
        return GoalDashOn;
    }

    /* JADX INFO: renamed from: i */
    public final float m93193i() {
        return GoalMarkerDashHeight;
    }

    /* JADX INFO: renamed from: j */
    public final float m93194j() {
        return GoalMarkerLabelHeight;
    }

    /* JADX INFO: renamed from: k */
    public final float m93195k() {
        return MaxFillHeight;
    }

    /* JADX INFO: renamed from: l */
    public final float m93196l() {
        return MinVisibleFillHeight;
    }

    /* JADX INFO: renamed from: m */
    public final float m93197m() {
        return ZoneBarChartHeight;
    }

    /* JADX INFO: renamed from: n */
    public final float m93198n() {
        return ZoneBarChartHeightWithGoals;
    }

    /* JADX INFO: renamed from: o */
    public final float m93199o() {
        return ZoneBarGap;
    }

    /* JADX INFO: renamed from: p */
    public final float m93200p() {
        return ZoneBarRowHeight;
    }

    /* JADX INFO: renamed from: q */
    public final float m93201q() {
        return ZoneBarRowHeightWithGoals;
    }

    /* JADX INFO: renamed from: r */
    public final float m93202r() {
        return ZoneThumbBelowBaseTrack;
    }

    /* JADX INFO: renamed from: s */
    public final float m93203s() {
        return ZoneThumbBorderWidth;
    }

    /* JADX INFO: renamed from: t */
    public final float m93204t() {
        return ZoneThumbCornerRadius;
    }

    /* JADX INFO: renamed from: u */
    public final float m93205u() {
        return ZoneThumbHeight;
    }

    /* JADX INFO: renamed from: v */
    public final float m93206v() {
        return ZoneThumbWidth;
    }

    /* JADX INFO: renamed from: w */
    public final float m93207w() {
        return ZoneTimeLabelTopPadding;
    }
}
