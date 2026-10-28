package e81;

import a01.C0088h;
import a01.EnumC0093m;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.service.network.model.UserSessionDto;
import e93.AbstractC12889b;
import gz0.EnumC16313m0;
import hy0.C17731c2;
import hy0.EnumC17727b2;
import i93.C18284j;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25243e0;
import m83.AbstractC25267u;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: e81.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0007J\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0007J\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\"\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010$\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010&\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b%\u0010!R\u0017\u0010(\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b'\u0010!R\u0017\u0010*\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b)\u0010!R\u0017\u0010,\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b+\u0010!R\u0017\u0010.\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b-\u0010!R\u0017\u00100\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b-\u0010\u001f\u001a\u0004\b/\u0010!R\u0017\u00102\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b1\u0010!R\u0017\u00104\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b3\u0010!R\u0017\u00106\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b3\u0010\u001f\u001a\u0004\b5\u0010!R\u0017\u00108\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b1\u0010\u001f\u001a\u0004\b7\u0010!R\u0017\u0010:\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b9\u0010!¨\u0006;"}, m65681d2 = {"Le81/b;", "", "<init>", "()V", "", "Le81/j0;", "f", "()Ljava/util/List;", "g", "c", "e", "d", "Le81/i0;", "", "u", "(Le81/i0;)Ljava/lang/String;", "Lhy0/b2;", "v", "(Le81/i0;)Lhy0/b2;", "La01/m;", "t", "(Le81/i0;)La01/m;", "", "count", "b", "(I)Ljava/util/List;", "slices", "La01/h;", "a", "(Ljava/util/List;)Ljava/util/List;", "Le81/n;", "Le81/n;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Le81/n;", "emptyState", "r", "smallScaleEmptyState", "q", "sevenOfEightState", "j", "fullEightState", "k", "fullSixtyState", "n", "populatedStateInRange", "i", "emptyStatePieBottom", "o", "populatedStateInRangePieBottomWithNavigation", "m", "fullSixtyStatePieBottomWithNavigation", "l", "fullSixtyStatePieBottomWithBiomarkers", "s", "veryLongTextExample", "getSampleBiomarkerPieChartSection", "sampleBiomarkerPieChartSection", "p", "sampleBiomarkerPieChartSectionPieRight", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12818b {

    /* JADX INFO: renamed from: a */
    public static final C12818b f43896a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final C12840n emptyState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final C12840n smallScaleEmptyState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final C12840n sevenOfEightState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final C12840n fullEightState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final C12840n fullSixtyState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final C12840n populatedStateInRange;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final C12840n emptyStatePieBottom;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final C12840n populatedStateInRangePieBottomWithNavigation;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final C12840n fullSixtyStatePieBottomWithNavigation;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static final C12840n fullSixtyStatePieBottomWithBiomarkers;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private static final C12840n veryLongTextExample;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private static final C12840n sampleBiomarkerPieChartSection;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private static final C12840n sampleBiomarkerPieChartSectionPieRight;

    /* JADX INFO: renamed from: o */
    public static final int f43910o;

    /* JADX INFO: renamed from: e81.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f43911a;

        static {
            int[] iArr = new int[EnumC12833i0.values().length];
            try {
                iArr[EnumC12833i0.OPTIMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC12833i0.SUFFICIENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC12833i0.OUT_OF_RANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC12833i0.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f43911a = iArr;
        }
    }

    static {
        C12818b c12818b = new C12818b();
        f43896a = c12818b;
        EnumC12838l enumC12838l = EnumC12838l.PIE_LEFT;
        C12827f0 c12827f0 = new C12827f0("empty_pie_chart", false, c12818b.m35894b(60));
        C12816a c12816a = new C12816a("0/60", "BIOMARKERS", null, null);
        TextResource.C8691e c8691e = new TextResource.C8691e("Optimal");
        EnumC17727b2 enumC17727b2 = EnumC17727b2.POSITIVE_RANGE;
        C12837k0 c12837k0 = new C12837k0(new C17731c2(c8691e, true, enumC17727b2, false, null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32760, null), "--");
        TextResource.C8691e c8691e2 = new TextResource.C8691e("Sufficient");
        EnumC17727b2 enumC17727b3 = EnumC17727b2.SUFFICIENT_BLUE;
        EnumC16313m0 enumC16313m0 = EnumC16313m0.TINY_ELLIPSE;
        C12837k0 c12837k1 = new C12837k0(new C17731c2(c8691e2, true, enumC17727b3, false, enumC16313m0, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32744, null), "--");
        TextResource.C8691e c8691e3 = new TextResource.C8691e("Out of Range");
        EnumC17727b2 enumC17727b4 = EnumC17727b2.CONCERN_RANGE;
        List listM118959K = AbstractC37056f.m118959K(c12837k0, c12837k1, new C12837k0(new C17731c2(c8691e3, true, enumC17727b4, false, null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32760, null), "--"));
        EnumC12839m enumC12839m = EnumC12839m.DEFAULT;
        C12840n c12840n = new C12840n("empty_biomarker_pie_chart_section", enumC12838l, c12827f0, c12816a, listM118959K, null, null, enumC12839m, 0.0f, 288, null);
        emptyState = c12840n;
        smallScaleEmptyState = new C12840n("small_empty_biomarker_pie_chart_section", enumC12838l, new C12827f0("small_empty_pie_chart", false, c12818b.m35894b(8), 2, null), new C12816a("0/8", "BIOMARKERS", null, null), AbstractC37056f.m118959K(new C12837k0(new C17731c2(new TextResource.C8691e("Optimal"), true, enumC17727b2, false, null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32760, null), "--"), new C12837k0(new C17731c2(new TextResource.C8691e("Sufficient"), true, enumC17727b3, false, enumC16313m0, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32744, null), "--"), new C12837k0(new C17731c2(new TextResource.C8691e("Out of Range"), true, enumC17727b4, false, null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32760, null), "--")), null, null, enumC12839m, 0.0f, 288, null);
        sevenOfEightState = new C12840n("seven_of_eight_biomarker_pie_chart_section", enumC12838l, new C12827f0("seven_of_eight_pie_chart", false, c12818b.m35889g(), 2, null), new C12816a("7/8", "BIOMARKERS", null, null), AbstractC37056f.m118959K(new C12837k0(new C17731c2(new TextResource.C8691e("Optimal"), true, enumC17727b2, false, null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32760, null), "5"), new C12837k0(new C17731c2(new TextResource.C8691e("Sufficient"), true, enumC17727b3, false, enumC16313m0, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32744, null), "2"), new C12837k0(new C17731c2(new TextResource.C8691e("Out of Range"), true, enumC17727b4, false, null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32760, null), UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE)), null, null, enumC12839m, 0.0f, 288, null);
        fullEightState = new C12840n("full_eight_biomarker_pie_chart_section", enumC12838l, new C12827f0("full_eight_pie_chart", false, c12818b.m35885c(), 2, null), new C12816a("8", "BIOMARKERS", null, null), AbstractC37056f.m118959K(new C12837k0(new C17731c2(new TextResource.C8691e("Optimal"), true, enumC17727b2, false, null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32760, null), "5"), new C12837k0(new C17731c2(new TextResource.C8691e("Sufficient"), true, enumC17727b3, false, enumC16313m0, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32744, null), "3"), new C12837k0(new C17731c2(new TextResource.C8691e("Out of Range"), true, enumC17727b4, false, null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32760, null), UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE)), null, null, enumC12839m, 0.0f, 288, null);
        fullSixtyState = new C12840n("full_sixty_biomarker_pie_chart_section", enumC12838l, new C12827f0("full_sixty_pie_chart", false, c12818b.m35887e(), 2, null), new C12816a("60", "BIOMARKERS", null, null), AbstractC37056f.m118959K(new C12837k0(new C17731c2(new TextResource.C8691e("Optimal"), true, enumC17727b2, false, null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32760, null), "49"), new C12837k0(new C17731c2(new TextResource.C8691e("In-Range"), true, enumC17727b3, false, enumC16313m0, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32744, null), "8"), new C12837k0(new C17731c2(new TextResource.C8691e("Out of Range"), true, enumC17727b4, false, null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32760, null), "3")), null, "Last updated: Apr 24, 2025", enumC12839m, 0.0f, 288, null);
        C12840n c12840n2 = new C12840n("populated_in_range_biomarker_pie_chart_section", enumC12838l, new C12827f0("populated_in_range_pie_chart", false, c12818b.m35888f()), new C12816a("12/60", "BIOMARKERS", null, null), AbstractC37056f.m118959K(new C12837k0(new C17731c2(new TextResource.C8691e("Optimal"), true, enumC17727b2, false, null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32760, null), "10"), new C12837k0(new C17731c2(new TextResource.C8691e("In-Range"), true, enumC17727b3, false, enumC16313m0, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32744, null), UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE), new C12837k0(new C17731c2(new TextResource.C8691e("Out of Range"), true, enumC17727b4, false, null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32760, null), UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE)), null, "Last updated: Apr 24, 2025", enumC12839m, 0.0f, 288, null);
        populatedStateInRange = c12840n2;
        EnumC12838l enumC12838l2 = EnumC12838l.PIE_BOTTOM;
        emptyStatePieBottom = C12840n.m36029c(c12840n, null, enumC12838l2, null, null, C25271y.f99162w, null, null, null, 0.0f, 493, null);
        C12816a pieChartContent = c12840n2.getPieChartContent();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.CARET_FORWARD;
        AppScreen.C9318g6 c9318g6 = AppScreen.C9318g6.f27632w;
        populatedStateInRangePieBottomWithNavigation = C12840n.m36029c(c12840n2, null, enumC12838l2, null, C12816a.m35879b(pieChartContent, null, null, enumC16313m1, new C9598e(c9318g6, null, null, 6, null), 3, null), null, null, null, null, 0.0f, 501, null);
        C12840n c12840n3 = new C12840n("full_sixty_pie_bottom_with_navigation_biomarker_pie_chart_section", enumC12838l2, new C12827f0("full_sixty_pie_bottom_with_navigation_pie_chart", false, c12818b.m35886d(), 2, null), new C12816a("60", "BIOMARKERS", enumC16313m1, new C9598e(c9318g6, null, null, 6, null)), AbstractC37056f.m118959K(new C12837k0(new C17731c2(new TextResource.C8691e("Optimal"), true, enumC17727b2, false, null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32760, null), "53"), new C12837k0(new C17731c2(new TextResource.C8691e("Sufficient"), true, enumC17727b3, false, enumC16313m0, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32744, null), "6"), new C12837k0(new C17731c2(new TextResource.C8691e("Out of Range"), true, enumC17727b4, false, null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32760, null), UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE)), null, null, enumC12839m, 0.0f, 288, null);
        fullSixtyStatePieBottomWithNavigation = c12840n3;
        fullSixtyStatePieBottomWithBiomarkers = C12840n.m36029c(c12840n3, "full_sixty_pie_bottom_with_biomarkers_biomarker_pie_chart_section", null, null, null, null, c12818b.m35893a(c12818b.m35886d()), null, EnumC12839m.TILES, 0.8f, 94, null);
        veryLongTextExample = C12840n.m36029c(c12840n3, null, null, null, new C12816a("9000000000000000", "BIOMARKERSBIOMARKERS BIOMARKERSBIOMARKERS BIOMARKERSBIOMARKERS BIOMARKERSBIOMARKERS", enumC16313m1, new C9598e(c9318g6, null, null, 6, null)), null, null, "This is a very long caption that should be truncated if it exceeds the maximum length allowed for the caption in the UI. This is a very long caption that should be truncated if it exceeds the maximum length allowed for the caption in the UI.", null, 0.0f, 439, null);
        sampleBiomarkerPieChartSection = c12840n2;
        sampleBiomarkerPieChartSectionPieRight = C12840n.m36029c(c12840n2, null, EnumC12838l.PIE_RIGHT, null, null, null, null, null, null, 0.0f, 509, null);
        f43910o = 8;
    }

    private C12818b() {
    }

    /* JADX INFO: renamed from: c */
    private final List<C12835j0> m35885c() {
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < 5; i13++) {
            arrayList.add(new C12835j0(EnumC12833i0.OPTIMAL));
        }
        for (int i14 = 0; i14 < 3; i14++) {
            arrayList.add(new C12835j0(EnumC12833i0.SUFFICIENT));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    private final List<C12835j0> m35886d() {
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < 53; i13++) {
            arrayList.add(new C12835j0(EnumC12833i0.OPTIMAL));
        }
        for (int i14 = 0; i14 < 6; i14++) {
            arrayList.add(new C12835j0(EnumC12833i0.SUFFICIENT));
        }
        arrayList.add(new C12835j0(EnumC12833i0.OUT_OF_RANGE));
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    private final List<C12835j0> m35887e() {
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < 49; i13++) {
            arrayList.add(new C12835j0(EnumC12833i0.OPTIMAL));
        }
        for (int i14 = 0; i14 < 8; i14++) {
            arrayList.add(new C12835j0(EnumC12833i0.SUFFICIENT));
        }
        for (int i15 = 0; i15 < 3; i15++) {
            arrayList.add(new C12835j0(EnumC12833i0.OUT_OF_RANGE));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    private final List<C12835j0> m35888f() {
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < 10; i13++) {
            arrayList.add(new C12835j0(EnumC12833i0.OPTIMAL));
        }
        arrayList.add(new C12835j0(EnumC12833i0.SUFFICIENT));
        arrayList.add(new C12835j0(EnumC12833i0.OUT_OF_RANGE));
        for (int i14 = 0; i14 < 48; i14++) {
            arrayList.add(new C12835j0(EnumC12833i0.NONE));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    private final List<C12835j0> m35889g() {
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < 5; i13++) {
            arrayList.add(new C12835j0(EnumC12833i0.OPTIMAL));
        }
        for (int i14 = 0; i14 < 2; i14++) {
            arrayList.add(new C12835j0(EnumC12833i0.SUFFICIENT));
        }
        arrayList.add(new C12835j0(EnumC12833i0.NONE));
        return arrayList;
    }

    /* JADX INFO: renamed from: t */
    private final EnumC0093m m35890t(EnumC12833i0 enumC12833i0) {
        int i13 = a.f43911a[enumC12833i0.ordinal()];
        if (i13 == 1) {
            return EnumC0093m.OPTIMAL;
        }
        if (i13 == 2) {
            return EnumC0093m.SUFFICIENT;
        }
        if (i13 == 3) {
            return EnumC0093m.OUT_OF_RANGE;
        }
        if (i13 == 4) {
            return EnumC0093m.UNAVAILABLE;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: u */
    private final String m35891u(EnumC12833i0 enumC12833i0) {
        int i13 = a.f43911a[enumC12833i0.ordinal()];
        if (i13 == 1) {
            return "Optimal";
        }
        if (i13 == 2) {
            return "Sufficient";
        }
        if (i13 == 3) {
            return "Out of Range";
        }
        if (i13 == 4) {
            return "Unavailable";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: v */
    private final EnumC17727b2 m35892v(EnumC12833i0 enumC12833i0) {
        int i13 = a.f43911a[enumC12833i0.ordinal()];
        if (i13 == 1) {
            return EnumC17727b2.POSITIVE_RANGE;
        }
        if (i13 == 2) {
            return EnumC17727b2.SUFFICIENT_BLUE;
        }
        if (i13 == 3) {
            return EnumC17727b2.CONCERN_RANGE;
        }
        if (i13 == 4) {
            return EnumC17727b2.NEUTRAL;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: a */
    public final List<C0088h> m35893a(List<C12835j0> slices) {
        AbstractC22676k.m65750j(slices, "slices");
        List<C12835j0> list = slices;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            C12835j0 c12835j0 = (C12835j0) obj;
            String str = (String) AbstractC12820c.f43918a.get(i13 % AbstractC12820c.f43918a.size());
            String strM8295h = AbstractC2875y.m8295h(i13, "biomarker_");
            EnumC16313m0 enumC16313m0 = EnumC16313m0.CARET_FORWARD;
            String str2 = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(((double) (i13 % 7)) + 1.5d)}, 1));
            C12818b c12818b = f43896a;
            arrayList.add(new C0088h(strM8295h, str, enumC16313m0, str2, "mg/dL", c12818b.m35890t(c12835j0.getStyle()), new C17731c2(new TextResource.C8691e(c12818b.m35891u(c12835j0.getStyle())), true, c12818b.m35892v(c12835j0.getStyle()), false, null, null, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32760, null), null, null, null, null, null, null, null, null, false, 32640, null));
            i13 = i14;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final List<C12835j0> m35894b(int count) {
        C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, count);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284jM36278i0, 10));
        Iterator it = c18284jM36278i0.iterator();
        while (it.hasNext()) {
            ((AbstractC25243e0) it).nextInt();
            arrayList.add(new C12835j0(EnumC12833i0.NONE));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public final C12840n m35895h() {
        return emptyState;
    }

    /* JADX INFO: renamed from: i */
    public final C12840n m35896i() {
        return emptyStatePieBottom;
    }

    /* JADX INFO: renamed from: j */
    public final C12840n m35897j() {
        return fullEightState;
    }

    /* JADX INFO: renamed from: k */
    public final C12840n m35898k() {
        return fullSixtyState;
    }

    /* JADX INFO: renamed from: l */
    public final C12840n m35899l() {
        return fullSixtyStatePieBottomWithBiomarkers;
    }

    /* JADX INFO: renamed from: m */
    public final C12840n m35900m() {
        return fullSixtyStatePieBottomWithNavigation;
    }

    /* JADX INFO: renamed from: n */
    public final C12840n m35901n() {
        return populatedStateInRange;
    }

    /* JADX INFO: renamed from: o */
    public final C12840n m35902o() {
        return populatedStateInRangePieBottomWithNavigation;
    }

    /* JADX INFO: renamed from: p */
    public final C12840n m35903p() {
        return sampleBiomarkerPieChartSectionPieRight;
    }

    /* JADX INFO: renamed from: q */
    public final C12840n m35904q() {
        return sevenOfEightState;
    }

    /* JADX INFO: renamed from: r */
    public final C12840n m35905r() {
        return smallScaleEmptyState;
    }

    /* JADX INFO: renamed from: s */
    public final C12840n m35906s() {
        return veryLongTextExample;
    }
}
