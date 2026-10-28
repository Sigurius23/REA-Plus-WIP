package c41;

import b91.EnumC2888c;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.service.network.model.UserSessionDto;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.List;
import k81.C22295e;
import k81.EnumC22291a;
import ny0.C27256h;
import p715kotlin.Metadata;
import p720m91.C25306o;
import p736sz0.C33169c0;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: c41.j3 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010 \n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0011\u0010\u0017R\u0017\u0010\u001d\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017R\u0017\u0010 \u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\"\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b!\u0010\u0017R\u0017\u0010%\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b#\u0010\u0015\u001a\u0004\b$\u0010\u0017R\u0017\u0010(\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b&\u0010\u0015\u001a\u0004\b'\u0010\u0017R\u0017\u0010+\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b)\u0010\u0015\u001a\u0004\b*\u0010\u0017R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020\u00130,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00104\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b2\u0010\u0015\u001a\u0004\b3\u0010\u0017R\u0017\u00106\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b5\u0010\u0015\u001a\u0004\b\u000e\u0010\u0017R\u0017\u00109\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b7\u0010\u0015\u001a\u0004\b8\u0010\u0017R\u0017\u0010<\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b:\u0010\u0015\u001a\u0004\b;\u0010\u0017R\u0017\u0010?\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b=\u0010\u0015\u001a\u0004\b>\u0010\u0017R\u0017\u0010B\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b@\u0010\u0015\u001a\u0004\bA\u0010\u0017R\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00130,8\u0006¢\u0006\f\n\u0004\bC\u0010.\u001a\u0004\b\u001e\u00100R\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010GR\u0014\u0010L\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010GR\u0014\u0010N\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010GR\u0014\u0010P\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010GR\u0014\u0010R\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010GR\u0014\u0010T\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010GR\u0014\u0010V\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010GR\u001d\u0010X\u001a\b\u0012\u0004\u0012\u00020E0,8\u0006¢\u0006\f\n\u0004\bW\u0010.\u001a\u0004\b\u001b\u00100R\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010^\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010[R\u001d\u0010`\u001a\b\u0012\u0004\u0012\u00020E0,8\u0006¢\u0006\f\n\u0004\b_\u0010.\u001a\u0004\b\u0014\u00100R\u001d\u0010b\u001a\b\u0012\u0004\u0012\u00020E0,8\u0006¢\u0006\f\n\u0004\ba\u0010.\u001a\u0004\b\u0019\u00100¨\u0006c"}, m65681d2 = {"Lc41/j3;", "", "<init>", "()V", "", "id", "label", "value", "Ly81/f;", "color", "Lk81/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly81/f;)Lk81/e;", "Lcom/whoop/design/util/TextResource;", "b", "Lcom/whoop/design/util/TextResource;", "healthMonitorTitle", "c", "stressMonitorTitle", "Lc41/i3;", "d", "Lc41/i3;", "getHmStateOk", "()Lc41/i3;", "hmStateOk", "e", "hmStateOkCaret", "f", "getHmElevated", "hmElevated", "g", "getHmOutOfRange", "hmOutOfRange", "getHmNoData", "hmNoData", "i", "getHmCalibratingState", "hmCalibratingState", "j", "getHmDataHidden", "hmDataHidden", "k", "getHmPending", "hmPending", "", "l", "Ljava/util/List;", "a", "()Ljava/util/List;", "healthMonitorSamples", "m", "getHighStress", "highStress", "n", "highStressWithCaret", "o", "getMediumStress", "mediumStress", "p", "getLowStress", "lowStress", "q", "getNoStressData", "noStressData", "r", "getStressCalibrating", "stressCalibrating", "s", "stressMonitorSamples", "Lc41/e5;", "t", "Lc41/e5;", "splitMiniMonitorSample1", "u", "splitMiniMonitorSample2", "v", "splitMiniMonitorSample3", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "splitMiniMonitorSample4", "x", "splitMiniMonitorSample5", "y", "splitMiniMonitorSample6", "z", "splitMiniMonitorSample7", "A", "splitMiniMonitorSample8", "B", "splitMiniMonitorSamples", "Lny0/h;", "C", "Lny0/h;", "addActivityCardButtonSample", "D", "startActivityCardButtonSample", "E", "splitContainerCardButtonStateSample", "F", "splitContainerDividerStateSample", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4051j3 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private static final C4018e5 splitMiniMonitorSample8;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private static final List<C4018e5> splitMiniMonitorSamples;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private static final C27256h addActivityCardButtonSample;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private static final C27256h startActivityCardButtonSample;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private static final List<C4018e5> splitContainerCardButtonStateSample;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private static final List<C4018e5> splitContainerDividerStateSample;

    /* JADX INFO: renamed from: G */
    public static final int f16443G;

    /* JADX INFO: renamed from: a */
    public static final C4051j3 f16444a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final TextResource healthMonitorTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final TextResource stressMonitorTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final C4044i3 hmStateOk;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final C4044i3 hmStateOkCaret;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final C4044i3 hmElevated;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final C4044i3 hmOutOfRange;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final C4044i3 hmNoData;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final C4044i3 hmCalibratingState;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final C4044i3 hmDataHidden;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static final C4044i3 hmPending;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private static final List<C4044i3> healthMonitorSamples;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private static final C4044i3 highStress;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private static final C4044i3 highStressWithCaret;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private static final C4044i3 mediumStress;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private static final C4044i3 lowStress;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private static final C4044i3 noStressData;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private static final C4044i3 stressCalibrating;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private static final List<C4044i3> stressMonitorSamples;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private static final C4018e5 splitMiniMonitorSample1;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private static final C4018e5 splitMiniMonitorSample2;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private static final C4018e5 splitMiniMonitorSample3;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private static final C4018e5 splitMiniMonitorSample4;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private static final C4018e5 splitMiniMonitorSample5;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private static final C4018e5 splitMiniMonitorSample6;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private static final C4018e5 splitMiniMonitorSample7;

    static {
        C4051j3 c4051j3 = new C4051j3();
        f16444a = c4051j3;
        TextResource textResourceM21278l = AbstractC8693b.m21278l("HEALTH MONITOR");
        healthMonitorTitle = textResourceM21278l;
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("STRESS MONITOR");
        stressMonitorTitle = textResourceM21278l2;
        C4044i3 c4044i3 = new C4044i3(textResourceM21278l, null, AbstractC8693b.m21278l("WITHIN RANGE"), AbstractC8693b.m21278l("5/5 Metrics"), null, EnumC16313m0.TINY_CHECKMARK, EnumC4142w3.OK, null, 146, null);
        hmStateOk = c4044i3;
        EnumC16313m0 enumC16313m0 = EnumC16313m0.TINY_CARET_FORWARD;
        C4044i3 c4044i3M12333b = C4044i3.m12333b(c4044i3, null, enumC16313m0, null, null, null, null, null, null, 253, null);
        hmStateOkCaret = c4044i3M12333b;
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l("ELEVATED");
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l("Respiratory Rate");
        EnumC16313m0 enumC16313m1 = EnumC16313m0.TINY_ATTENTION;
        C4044i3 c4044i4 = new C4044i3(textResourceM21278l, null, textResourceM21278l3, textResourceM21278l4, null, enumC16313m1, EnumC4142w3.WARNING, null, 146, null);
        hmElevated = c4044i4;
        C4044i3 c4044i5 = new C4044i3(textResourceM21278l, null, AbstractC8693b.m21278l("OUT OF RANGE"), AbstractC8693b.m21278l("3/5 Metrics"), null, enumC16313m1, EnumC4142w3.ALERT, null, 146, null);
        hmOutOfRange = c4044i5;
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l("No Data Available");
        EnumC16313m0 enumC16313m2 = EnumC16313m0.MISSING_DATA;
        EnumC4142w3 enumC4142w3 = EnumC4142w3.NO_DATA;
        C4044i3 c4044i6 = new C4044i3(textResourceM21278l, null, textResourceM21278l5, null, null, enumC16313m2, enumC4142w3, null, 154, null);
        hmNoData = c4044i6;
        TextResource textResourceM21278l6 = AbstractC8693b.m21278l("Calibrating");
        EnumC16313m0 enumC16313m3 = EnumC16313m0.STRAP;
        EnumC4142w3 enumC4142w4 = EnumC4142w3.CALIBRATING;
        C4044i3 c4044i7 = new C4044i3(textResourceM21278l, null, textResourceM21278l6, null, null, enumC16313m3, enumC4142w4, null, 154, null);
        hmCalibratingState = c4044i7;
        C4044i3 c4044i8 = new C4044i3(textResourceM21278l, null, AbstractC8693b.m21278l("Data Hidden"), null, null, EnumC16313m0.SCORE_HIDDEN, EnumC4142w3.DATA_HIDDEN, null, 154, null);
        hmDataHidden = c4044i8;
        C4044i3 c4044i9 = new C4044i3(textResourceM21278l, null, AbstractC8693b.m21278l("Pending"), null, null, EnumC16313m0.SLEEP, EnumC4142w3.PENDING, null, 154, null);
        hmPending = c4044i9;
        healthMonitorSamples = AbstractC37056f.m118959K(c4044i3, c4044i3M12333b, c4044i4, c4044i5, c4044i6, c4044i7, c4044i8, c4044i9);
        C4044i3 c4044i10 = new C4044i3(textResourceM21278l2, null, AbstractC8693b.m21278l("HIGH"), AbstractC8693b.m21278l("4:31pm"), AbstractC8693b.m21278l("2.5"), null, EnumC4142w3.HIGH, null, 162, null);
        highStress = c4044i10;
        C4044i3 c4044i3M12333b2 = C4044i3.m12333b(c4044i10, null, enumC16313m0, null, null, null, null, null, null, 253, null);
        highStressWithCaret = c4044i3M12333b2;
        C4044i3 c4044i11 = new C4044i3(textResourceM21278l2, null, AbstractC8693b.m21278l("MEDIUM"), AbstractC8693b.m21278l("4:31pm"), AbstractC8693b.m21278l("1.5"), null, EnumC4142w3.MEDIUM, null, 162, null);
        mediumStress = c4044i11;
        C4044i3 c4044i12 = new C4044i3(textResourceM21278l2, null, AbstractC8693b.m21278l("LOW"), AbstractC8693b.m21278l("4:31pm"), AbstractC8693b.m21278l("0.5"), null, EnumC4142w3.LOW, null, 162, null);
        lowStress = c4044i12;
        C4044i3 c4044i13 = new C4044i3(textResourceM21278l2, null, AbstractC8693b.m21278l("No Data Available"), null, null, enumC16313m2, enumC4142w3, null, 154, null);
        noStressData = c4044i13;
        C4044i3 c4044i14 = new C4044i3(textResourceM21278l2, null, AbstractC8693b.m21278l("MEDIUM"), AbstractC8693b.m21278l("Calibrating"), AbstractC8693b.m21278l("1.5"), null, enumC4142w4, null, 162, null);
        stressCalibrating = c4044i14;
        stressMonitorSamples = AbstractC37056f.m118959K(c4044i10, c4044i3M12333b2, c4044i11, c4044i12, c4044i13, c4044i14);
        C4018e5 c4018e5 = new C4018e5(c4044i3, c4044i10, false, 4, null);
        splitMiniMonitorSample1 = c4018e5;
        C4018e5 c4018e6 = new C4018e5(c4044i3M12333b, c4044i3M12333b2, false, 4, null);
        splitMiniMonitorSample2 = c4018e6;
        C4018e5 c4018e7 = new C4018e5(c4044i4, c4044i11, false, 4, null);
        splitMiniMonitorSample3 = c4018e7;
        C4018e5 c4018e8 = new C4018e5(c4044i5, c4044i12, false, 4, null);
        splitMiniMonitorSample4 = c4018e8;
        C4018e5 c4018e9 = new C4018e5(c4044i6, c4044i13, false, 4, null);
        splitMiniMonitorSample5 = c4018e9;
        C4018e5 c4018e10 = new C4018e5(c4044i7, c4044i14, false, 4, null);
        splitMiniMonitorSample6 = c4018e10;
        C4018e5 c4018e11 = new C4018e5(c4044i8, c4044i13, false, 4, null);
        splitMiniMonitorSample7 = c4018e11;
        C4018e5 c4018e12 = new C4018e5(c4044i9, c4044i12, false, 4, null);
        splitMiniMonitorSample8 = c4018e12;
        splitMiniMonitorSamples = AbstractC37056f.m118959K(c4018e5, c4018e6, c4018e7, c4018e8, c4018e9, c4018e10, c4018e11, c4018e12);
        C27256h c27256h = new C27256h(AbstractC8693b.m21278l("ADD ACTIVITY"), EnumC16313m0.ADD, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33554428, null);
        addActivityCardButtonSample = c27256h;
        C27256h c27256h2 = new C27256h(AbstractC8693b.m21278l("START ACTIVITY"), EnumC16313m0.START_ACTIVITY, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, 33554428, null);
        startActivityCardButtonSample = c27256h2;
        splitContainerCardButtonStateSample = AbstractC37056f.m118958J(new C4018e5(c27256h, c27256h2, false, 4, null));
        splitContainerDividerStateSample = AbstractC37056f.m118959K(new C4018e5(c4051j3.m12386h("months_earned", "MONTHS EARNED", "2", EnumC39333f.BRAND_WHITE), c4051j3.m12386h("pending_referrals", "PENDING REFERRALS", UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE, EnumC39333f.WHITE_70), true), new C4018e5(c27256h, c27256h2, true));
        f16443G = 8;
    }

    private C4051j3() {
    }

    /* JADX INFO: renamed from: h */
    private final C22295e m12386h(String id4, String label, String value, EnumC39333f color) {
        return new C22295e(id4, null, null, AbstractC37056f.m118959K(new C25306o(new C33169c0(label, EnumC2888c.SH4, color, 5, null, null, null, null, false, null, MessageListItemViewType.GIPHY, null), null, 2, null), new C25306o(new C33169c0(value, EnumC2888c.T2, color, 5, null, null, null, null, false, null, MessageListItemViewType.GIPHY, null), null, 2, null)), 0.0f, 0.0f, 0.0f, EnumC22291a.LEADING, false, 368, null);
    }

    /* JADX INFO: renamed from: a */
    public final List<C4044i3> m12387a() {
        return healthMonitorSamples;
    }

    /* JADX INFO: renamed from: b */
    public final C4044i3 m12388b() {
        return highStressWithCaret;
    }

    /* JADX INFO: renamed from: c */
    public final C4044i3 m12389c() {
        return hmStateOkCaret;
    }

    /* JADX INFO: renamed from: d */
    public final List<C4018e5> m12390d() {
        return splitContainerCardButtonStateSample;
    }

    /* JADX INFO: renamed from: e */
    public final List<C4018e5> m12391e() {
        return splitContainerDividerStateSample;
    }

    /* JADX INFO: renamed from: f */
    public final List<C4018e5> m12392f() {
        return splitMiniMonitorSamples;
    }

    /* JADX INFO: renamed from: g */
    public final List<C4044i3> m12393g() {
        return stressMonitorSamples;
    }
}
