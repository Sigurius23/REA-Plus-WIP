package q31;

import com.whoop.service.network.model.UserSessionDto;
import p715kotlin.Metadata;
import p736sz0.C33168c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: q31.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u0018"}, m65681d2 = {"Lq31/e;", "", "<init>", "()V", "Lq31/a;", "b", "Lq31/a;", "annotatedSegmentItem1", "c", "annotatedSegmentItem2", "d", "annotatedSegmentItem3", "Lq31/f;", "e", "Lq31/f;", "a", "()Lq31/f;", "threeTabsSegmentContent", "f", "getTwoTabsSegmentSampleState", "twoTabsSegmentSampleState", "g", "getTwoTabsSegmentWithSubtitleSampleState", "twoTabsSegmentWithSubtitleSampleState", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29947e {

    /* JADX INFO: renamed from: a */
    public static final C29947e f122284a = new C29947e();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final C29943a annotatedSegmentItem1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final C29943a annotatedSegmentItem2;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final C29943a annotatedSegmentItem3;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final C29948f threeTabsSegmentContent;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final C29948f twoTabsSegmentSampleState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final C29948f twoTabsSegmentWithSubtitleSampleState;

    /* JADX INFO: renamed from: h */
    public static final int f122291h;

    static {
        C29943a c29943a = new C29943a(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE, "Segment 1", null, AbstractC37056f.m118958J(new C33168c("Content for Segment 1, Item 1", false, 2, null)), null, null, 48, null);
        annotatedSegmentItem1 = c29943a;
        C29943a c29943a2 = new C29943a("2", "Segment 2", null, AbstractC37056f.m118958J(new C33168c("Different Content for Segment 2", false, 2, null)), null, null, 48, null);
        annotatedSegmentItem2 = c29943a2;
        C29943a c29943a3 = new C29943a("3", "Segment 3", null, AbstractC37056f.m118958J(new C33168c("More Content Here (Segment 3)", false, 2, null)), null, null, 48, null);
        annotatedSegmentItem3 = c29943a3;
        threeTabsSegmentContent = new C29948f(UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE, null, 1, AbstractC37056f.m118959K(c29943a, c29943a2, c29943a3), false, 18, null);
        twoTabsSegmentSampleState = new C29948f(UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE, null, 0, AbstractC37056f.m118959K(c29943a, c29943a3), false, 18, null);
        twoTabsSegmentWithSubtitleSampleState = new C29948f(UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE, null, 0, AbstractC37056f.m118959K(C29943a.m91577b(c29943a, null, null, "Sub Text 1", null, null, null, 59, null), C29943a.m91577b(c29943a3, null, null, "Sub Text 3", null, null, null, 59, null)), false, 18, null);
        f122291h = 8;
    }

    private C29947e() {
    }

    /* JADX INFO: renamed from: a */
    public final C29948f m91608a() {
        return threeTabsSegmentContent;
    }
}
