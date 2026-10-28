package l31;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.domain.model.UnitSystem;
import gz0.EnumC16313m0;
import hy0.EnumC17727b2;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import k71.C22241a0;
import l83.C23454a0;
import live.hms.video.error.ErrorCodes;
import no.nordicsemi.android.dfu.DfuBaseService;
import o11.AbstractC27407m;
import o11.C27411q;
import o11.InterfaceC27402h;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.InterfaceC22968j;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.AbstractC25303l;
import p736sz0.C33182g1;
import p736sz0.C33210q;
import p736sz0.EnumC33185h1;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: l31.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0002\u001a\u000f\u0010\u0005\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0002\u001a\u000f\u0010\u0006\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0002\u001a\u000f\u0010\u0007\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\u0002\u001a\u000f\u0010\b\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\u0002\u001a\u000f\u0010\t\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\u0002\u001a\u000f\u0010\n\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u0002\u001a\u000f\u0010\u000b\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\u0002\u001a\u000f\u0010\f\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\f\u0010\u0002\u001a\u000f\u0010\r\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\r\u0010\u0002\"\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0019\u001a\u00020\u00148\u0006X\u0086D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0017\u0010\u001c\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012\"\u0014\u0010\u001e\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0010\"\u0014\u0010 \u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0010\"\u0014\u0010\"\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0010\"\u0014\u0010$\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0010\"\u0017\u0010*\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0017\u0010-\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)\"\u0017\u00100\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)\"\u0014\u00102\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010'\"\u0014\u00104\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010'\"\u0014\u00105\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010\"\u0014\u00107\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0010\"\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00109\"\u0014\u0010<\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00109\"\u0014\u0010=\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00109\"\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@\"\u0014\u0010B\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00109\"\u0014\u0010D\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u00109\"\u0014\u0010E\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u00109\"\u0014\u0010G\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u00109\"\u0014\u0010H\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00109\"\u0014\u0010J\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u00109\"\u0014\u0010M\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010L\"\u0014\u0010O\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010L\"\u0014\u0010P\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010L\"\u0014\u0010R\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010L\"\u0014\u0010S\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010L\"\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010V\"\u0014\u0010X\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010V\"\u0014\u0010Z\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010V\"\u0014\u0010[\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010V\"\u0014\u0010]\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010V\"\u0014\u0010^\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010V\"\u0014\u0010`\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010L\"\u0014\u0010a\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010L\"\u0014\u0010b\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010L\"\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020d0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010e\"\u0017\u0010l\u001a\u00020g8\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k¨\u0006m"}, m65681d2 = {"Ll83/a0;", "u", "(Landroidx/compose/runtime/Composer;I)V", "s", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "m", "G", "I", "E", "C", "A", "o", "q", "y", "Lcom/whoop/design/util/TextResource;", "a", "Lcom/whoop/design/util/TextResource;", "M", "()Lcom/whoop/design/util/TextResource;", "sampleExerciseTitle", "", "b", "Ljava/lang/String;", "getSampleExerciseName", "()Ljava/lang/String;", "sampleExerciseName", "c", "K", "sampleExerciseSubtitle", "d", "sampleExerciseStandardNameTitle", "e", "sampleExerciseLongerNameTitle", "f", "sampleExerciseLongestNameTitle", "g", "sampleExerciseLongSubtitle", "Lo11/h$b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lo11/h$b;", "L", "()Lo11/h$b;", "sampleExerciseTileEditContent", "i", "getSampleExerciseTileContentWithInfoText", "sampleExerciseTileContentWithInfoText", "j", "getSampleExerciseTileInProgressContentWithAddAndRemoveSet", "sampleExerciseTileInProgressContentWithAddAndRemoveSet", "k", "sampleExerciseTileInProgressContent", "l", "sampleExerciseTileCompletedContent", "sampleWorkoutSummaryTitle", "n", "sampleWorkoutSummarySubtitle", "Lsz0/q;", "Lsz0/q;", "sampleTonnageStat", "p", "sampleRepsStat", "sampleIntensityStat", "Lsz0/g1;", "r", "Lsz0/g1;", "sampleStatTrend", "sampleSetsStat", "t", "sampleSetsStatActiveWorkout", "sampleRepsStatActiveWorkout", "v", "sampleWeightStatActiveWorkout", "sampleTonnageStatWithTrend", "x", "sampleRepsStatWithTrend", "Lo11/h$c;", "Lo11/h$c;", "exerciseSummaryContentSample1", "z", "exerciseSummaryContentSample2", "exerciseSummaryContentSample3", "B", "exerciseSummaryContentSample4", "exerciseSummaryContentSample5", "Lo11/h$a;", "D", "Lo11/h$a;", "exerciseSummaryContentSample6", "exerciseSummaryContentDetailsWithStatRowAchievementIcons", "F", "exerciseSummaryContentDetailsIntensityOmit", "exerciseSummaryContentDetailsIntensityLongLabels", "H", "exerciseSummaryContentDetailsIntensityWideValue", "exerciseSummaryContentDetailsIntensityPopulated", "J", "exerciseSummaryContentSample7", "exerciseSummaryContentWithIntensity", "exerciseSummaryContentWithoutIntensity", "", "", "Ljava/util/List;", "sampleAchievementIcons", "Ll0/j;", "N", "Ll0/j;", "getColumnArrangement", "()Ll0/j;", "columnArrangement", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23313g {

    /* JADX INFO: renamed from: A */
    private static final InterfaceC27402h.c f92379A;

    /* JADX INFO: renamed from: B */
    private static final InterfaceC27402h.c f92380B;

    /* JADX INFO: renamed from: C */
    private static final InterfaceC27402h.c f92381C;

    /* JADX INFO: renamed from: D */
    private static final InterfaceC27402h.a f92382D;

    /* JADX INFO: renamed from: E */
    private static final InterfaceC27402h.a f92383E;

    /* JADX INFO: renamed from: F */
    private static final InterfaceC27402h.a f92384F;

    /* JADX INFO: renamed from: G */
    private static final InterfaceC27402h.a f92385G;

    /* JADX INFO: renamed from: H */
    private static final InterfaceC27402h.a f92386H;

    /* JADX INFO: renamed from: I */
    private static final InterfaceC27402h.a f92387I;

    /* JADX INFO: renamed from: J */
    private static final InterfaceC27402h.c f92388J;

    /* JADX INFO: renamed from: K */
    private static final InterfaceC27402h.c f92389K;

    /* JADX INFO: renamed from: L */
    private static final InterfaceC27402h.c f92390L;

    /* JADX INFO: renamed from: M */
    private static final List<Integer> f92391M;

    /* JADX INFO: renamed from: N */
    private static final InterfaceC22968j f92392N;

    /* JADX INFO: renamed from: a */
    private static final TextResource f92393a = AbstractC8693b.m21278l("Bench Press - BB");

    /* JADX INFO: renamed from: b */
    private static final String f92394b = "Bench Press - BB";

    /* JADX INFO: renamed from: c */
    private static final TextResource f92395c = AbstractC8693b.m21278l("3 Sets");

    /* JADX INFO: renamed from: d */
    private static final TextResource f92396d = AbstractC8693b.m21278l("Bench Press - Barbell");

    /* JADX INFO: renamed from: e */
    private static final TextResource f92397e = AbstractC8693b.m21278l("Backward Lunge - Alternating - Bodyweight");

    /* JADX INFO: renamed from: f */
    private static final TextResource f92398f = AbstractC8693b.m21278l("Backward Lunge - Alternating - Bodyweight with additional sets and reps");

    /* JADX INFO: renamed from: g */
    private static final TextResource f92399g = AbstractC8693b.m21278l("12 Sets · 174 Reps · Alternating Tempo · Bodyweight Only");

    /* JADX INFO: renamed from: h */
    private static final InterfaceC27402h.b f92400h;

    /* JADX INFO: renamed from: i */
    private static final InterfaceC27402h.b f92401i;

    /* JADX INFO: renamed from: j */
    private static final InterfaceC27402h.b f92402j;

    /* JADX INFO: renamed from: k */
    private static final InterfaceC27402h.b f92403k;

    /* JADX INFO: renamed from: l */
    private static final InterfaceC27402h.b f92404l;

    /* JADX INFO: renamed from: m */
    private static final TextResource f92405m;

    /* JADX INFO: renamed from: n */
    private static final TextResource f92406n;

    /* JADX INFO: renamed from: o */
    private static final C33210q f92407o;

    /* JADX INFO: renamed from: p */
    private static final C33210q f92408p;

    /* JADX INFO: renamed from: q */
    private static final C33210q f92409q;

    /* JADX INFO: renamed from: r */
    private static final C33182g1 f92410r;

    /* JADX INFO: renamed from: s */
    private static final C33210q f92411s;

    /* JADX INFO: renamed from: t */
    private static final C33210q f92412t;

    /* JADX INFO: renamed from: u */
    private static final C33210q f92413u;

    /* JADX INFO: renamed from: v */
    private static final C33210q f92414v;

    /* JADX INFO: renamed from: w */
    private static final C33210q f92415w;

    /* JADX INFO: renamed from: x */
    private static final C33210q f92416x;

    /* JADX INFO: renamed from: y */
    private static final InterfaceC27402h.c f92417y;

    /* JADX INFO: renamed from: z */
    private static final InterfaceC27402h.c f92418z;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        ArrayList arrayList = new ArrayList(3);
        for (int i13 = 0; i13 < 3; i13++) {
            arrayList.add(AbstractC23320n.m67515d());
        }
        C23454a0 c23454a0 = C23454a0.f92919a;
        InterfaceC27402h.b bVar = new InterfaceC27402h.b(arrayList, UnitSystem.METRIC, null, null, false, true, false, false, false, c23454a0, c23454a0, c23454a0, 476, null);
        f92400h = bVar;
        DefaultConstructorMarker defaultConstructorMarker = null;
        TextResource textResource = null;
        boolean z4 = false;
        f92401i = InterfaceC27402h.b.m82618c(bVar, null, null, null, AbstractC8693b.m21278l("Input the combined weight of both dumbbells."), false, false, false, false, false, null, null, null, 4087, null);
        List listM118959K = AbstractC37056f.m118959K(AbstractC23320n.m67512a(), AbstractC23320n.m67514c(), AbstractC23320n.m67513b(), AbstractC23320n.m67516e());
        UnitSystem unitSystem = UnitSystem.IMPERIAL;
        TextResource textResource2 = null;
        f92402j = new InterfaceC27402h.b(listM118959K, unitSystem, textResource, textResource2, z4, true, true, true, true, c23454a0, c23454a0, c23454a0, 28, defaultConstructorMarker);
        f92403k = new InterfaceC27402h.b(AbstractC37056f.m118959K(AbstractC23320n.m67512a(), AbstractC23320n.m67514c(), AbstractC23320n.m67513b(), AbstractC23320n.m67516e()), unitSystem, textResource, textResource2, z4, false, false, false, false, c23454a0, c23454a0, null, 2556, defaultConstructorMarker);
        ArrayList arrayList2 = new ArrayList(3);
        for (int i14 = 0; i14 < 3; i14++) {
            arrayList2.add(AbstractC23320n.m67512a());
        }
        f92404l = new InterfaceC27402h.b(arrayList2, UnitSystem.IMPERIAL, null, null, false, false, false, false, false, c23454a0, c23454a0, null, 2556, null);
        f92405m = AbstractC8693b.m21278l("5 Exercises");
        f92406n = AbstractC8693b.m21278l("18 Sets");
        Integer num = null;
        C33210q c33210q = new C33210q(null, AbstractC8693b.m21278l("22,076"), num, AbstractC8693b.m21278l("lbs"), null, null, AbstractC8693b.m21278l("TONNAGE"), false, null, null, null, false, 4021, null);
        f92407o = c33210q;
        C33210q c33210q2 = new C33210q(num, AbstractC8693b.m21278l("174"), 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, null, AbstractC8693b.m21278l("REPS"), false, 0 == true ? 1 : 0, null, null, false, 4029, null);
        f92408p = c33210q2;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        C33210q c33210q3 = new C33210q(null, AbstractC8693b.m21278l("82"), null, AbstractC8693b.m21278l("%"), EnumC33185h1.NUMBER, null, AbstractC8693b.m21278l("INTENSITY"), false, null, 0 == true ? 1 : 0, null, false, ErrorCodes.WebrtcErrors.cICEFailure, defaultConstructorMarker2);
        f92409q = c33210q3;
        C33182g1 c33182g1 = new C33182g1(AbstractC8693b.m21278l("12%"), EnumC17727b2.POSITIVE);
        f92410r = c33182g1;
        EnumC39333f enumC39333f = null;
        C33210q c33210q4 = new C33210q(null, AbstractC8693b.m21278l("5"), null, null, null, null, AbstractC8693b.m21278l("SETS"), false, null, enumC39333f, null, false, 4029, null);
        f92411s = c33210q4;
        C33210q c33210q5 = new C33210q(null, AbstractC8693b.m21278l("3/3"), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, AbstractC8693b.m21278l("SETS"), false, enumC39333f, 0 == true ? 1 : 0, null, false, 4029, null);
        f92412t = c33210q5;
        C33210q c33210q6 = new C33210q(null, AbstractC8693b.m21278l("12"), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, AbstractC8693b.m21278l("REPS"), false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, false, 4029, null);
        f92413u = c33210q6;
        TextResource textResource3 = null;
        C33210q c33210q7 = new C33210q(textResource3, AbstractC8693b.m21278l("70"), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, AbstractC8693b.m21278l("LBS"), false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, false, 4029, null);
        f92414v = c33210q7;
        C33210q c33210qM105317b = C33210q.m105317b(c33210q, null, null, null, null, null, c33182g1, null, false, null, null, null, false, 4063, null);
        f92415w = c33210qM105317b;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        C33210q c33210qM105317b2 = C33210q.m105317b(c33210q2, null, null, null, null, null, c33182g1, null, false, null, null, null, false, 4063, null);
        f92416x = c33210qM105317b2;
        int i15 = 8;
        boolean z13 = false;
        f92417y = new InterfaceC27402h.c(c33210q, c33210q2, c33210q3, z13, i15, defaultConstructorMarker3);
        f92418z = new InterfaceC27402h.c(c33210qM105317b, null, c33210qM105317b2, false, 8, 0 == true ? 1 : 0);
        f92379A = new InterfaceC27402h.c(c33210q, null, c33210q2, z13, i15, defaultConstructorMarker3);
        f92380B = new InterfaceC27402h.c(c33210q4, c33210q2, c33210q3, true);
        f92381C = new InterfaceC27402h.c(c33210q, null, c33210qM105317b2, true);
        int i16 = 24;
        TextResource textResource4 = null;
        boolean z14 = false;
        TextResource textResource5 = null;
        TextResource textResource6 = null;
        TextResource textResource7 = null;
        TextResource textResource8 = null;
        f92382D = new InterfaceC27402h.a(AbstractC8693b.m21278l("REPS"), AbstractC8693b.m21278l("WEIGHT"), AbstractC8693b.m21278l("AVG HR"), AbstractC8693b.m21278l("lbs"), AbstractC8693b.m21278l("bpm"), AbstractC8693b.m21278l("2860"), AbstractC8693b.m21278l("18"), AbstractC8693b.m21278l("TOTAL"), AbstractC37056f.m118959K(new C27411q(AbstractC8693b.m21278l("93"), AbstractC8693b.m21278l("20"), AbstractC8693b.m21278l("45"), null, null, 24, null), new C27411q(AbstractC8693b.m21278l("99"), AbstractC8693b.m21278l("12"), AbstractC8693b.m21278l("135"), textResource4, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0), new C27411q(AbstractC8693b.m21278l("86"), AbstractC8693b.m21278l("8"), AbstractC8693b.m21278l("155"), textResource4, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0), new C27411q(AbstractC8693b.m21278l("99"), AbstractC8693b.m21278l("6"), AbstractC8693b.m21278l("155"), textResource4, 0 == true ? 1 : 0, i16, 0 == true ? 1 : 0), new C27411q(AbstractC8693b.m21278l("111"), AbstractC8693b.m21278l("8"), AbstractC8693b.m21278l("135"), textResource3, null, 24, 0 == true ? 1 : 0)), false, z14, null, textResource5, textResource6, textResource7, textResource8, 65024, null);
        TextResource textResourceM21278l = AbstractC8693b.m21278l("REPS");
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("WEIGHT");
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l("AVG HR");
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l("lbs");
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l("bpm");
        TextResource textResourceM21278l6 = AbstractC8693b.m21278l("2860");
        TextResource textResourceM21278l7 = AbstractC8693b.m21278l("18");
        TextResource textResourceM21278l8 = AbstractC8693b.m21278l("TOTAL");
        TextResource textResourceM21278l9 = AbstractC8693b.m21278l("93");
        TextResource textResourceM21278l10 = AbstractC8693b.m21278l("20");
        TextResource textResourceM21278l11 = AbstractC8693b.m21278l("45");
        C38072d c38072d = C38072d.f163053a;
        int i17 = 8;
        f92383E = new InterfaceC27402h.a(textResourceM21278l, textResourceM21278l2, textResourceM21278l3, textResourceM21278l4, textResourceM21278l5, textResourceM21278l6, textResourceM21278l7, textResourceM21278l8, AbstractC37056f.m118959K(new C27411q(textResourceM21278l9, textResourceM21278l10, textResourceM21278l11, textResource3, Integer.valueOf(c38072d.m121951d().getVarious().getBadgeGold()), i17, 0 == true ? 1 : 0), new C27411q(AbstractC8693b.m21278l("99"), AbstractC8693b.m21278l("12"), AbstractC8693b.m21278l("135"), textResource3, Integer.valueOf(c38072d.m121951d().getVarious().getBadgeSilver()), i17, 0 == true ? 1 : 0), new C27411q(AbstractC8693b.m21278l("86"), AbstractC8693b.m21278l("8"), AbstractC8693b.m21278l("155"), textResource3, null, i17, 0 == true ? 1 : 0), new C27411q(AbstractC8693b.m21278l("99"), AbstractC8693b.m21278l("6"), AbstractC8693b.m21278l("155"), textResource3, Integer.valueOf(c38072d.m121951d().getVarious().getBadgeBronze()), i17, 0 == true ? 1 : 0), new C27411q(AbstractC8693b.m21278l("111"), AbstractC8693b.m21278l("8"), AbstractC8693b.m21278l("135"), 0 == true ? 1 : 0, null, 8, defaultConstructorMarker2)), z14, false, textResource5, textResource6, textResource7, textResource8, null, 65024, null);
        f92384F = new InterfaceC27402h.a(AbstractC8693b.m21278l("REPS"), AbstractC8693b.m21278l("WEIGHT"), AbstractC8693b.m21278l("AVG HR"), AbstractC8693b.m21278l("lbs"), AbstractC8693b.m21278l("bpm"), AbstractC8693b.m21278l("2860"), AbstractC8693b.m21278l("18"), AbstractC8693b.m21278l("TOTAL\nREPS"), AbstractC37056f.m118959K(new C27411q(AbstractC8693b.m21278l("--"), AbstractC8693b.m21278l("20"), AbstractC8693b.m21278l("45"), null, Integer.valueOf(c38072d.m121951d().getVarious().getBadgeGold())), new C27411q(AbstractC8693b.m21278l("--"), AbstractC8693b.m21278l("12"), AbstractC8693b.m21278l("135"), null, Integer.valueOf(c38072d.m121951d().getVarious().getBadgeSilver()))), true, false, AbstractC8693b.m21278l("INTENSITY"), AbstractC8693b.m21278l("% of 1RM"), textResource8, AbstractC8693b.m21278l("VOLUME\nLOAD"), AbstractC8693b.m21278l("AVERAGE\nINTENSITY"), DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, null);
        f92385G = new InterfaceC27402h.a(AbstractC8693b.m21278l("WIEDERHOLUNGEN"), AbstractC8693b.m21278l("GEWICHT"), AbstractC8693b.m21278l("DURCHSCHN. HF"), AbstractC8693b.m21278l("kg"), AbstractC8693b.m21278l("bpm"), AbstractC8693b.m21278l("84"), AbstractC8693b.m21278l("14"), AbstractC8693b.m21278l("WIEDERHOLUNGEN\nGESAMT"), AbstractC37056f.m118959K(new C27411q(AbstractC8693b.m21278l("--"), AbstractC8693b.m21278l("8"), AbstractC8693b.m21278l("79,5"), AbstractC8693b.m21278l("65"), Integer.valueOf(c38072d.m121951d().getVarious().getBadgeBronze())), new C27411q(AbstractC8693b.m21278l("--"), AbstractC8693b.m21278l("12"), AbstractC8693b.m21278l("79,5"), AbstractC8693b.m21278l("72"), Integer.valueOf(c38072d.m121951d().getVarious().getBadgeSilver())), new C27411q(AbstractC8693b.m21278l("--"), AbstractC8693b.m21278l("2"), AbstractC8693b.m21278l("83,9"), AbstractC8693b.m21278l("88"), Integer.valueOf(c38072d.m121951d().getVarious().getBadgeGold()))), true, true, AbstractC8693b.m21278l("INTENSITÄT"), AbstractC8693b.m21278l("% des 1RM"), AbstractC8693b.m21278l("74"), AbstractC8693b.m21278l("VOLUMEN\nLAST"), AbstractC8693b.m21278l("DURCHSCHNITTLICHE\nINTENSITÄT"));
        f92386H = new InterfaceC27402h.a(AbstractC8693b.m21278l("RÉPÉTITIONS"), AbstractC8693b.m21278l("CHARGE"), AbstractC8693b.m21278l("FC MOYENNE"), AbstractC8693b.m21278l("kg"), AbstractC8693b.m21278l("bpm"), AbstractC8693b.m21278l("84"), AbstractC8693b.m21278l("14"), AbstractC8693b.m21278l("TOTAL\nRÉPÉTITIONS"), AbstractC37056f.m118959K(new C27411q(AbstractC8693b.m21278l("--"), AbstractC8693b.m21278l("8"), AbstractC8693b.m21278l("102,5"), AbstractC8693b.m21278l("65"), Integer.valueOf(c38072d.m121951d().getVarious().getBadgeBronze())), new C27411q(AbstractC8693b.m21278l("--"), AbstractC8693b.m21278l("12"), AbstractC8693b.m21278l("102,5"), AbstractC8693b.m21278l("72"), Integer.valueOf(c38072d.m121951d().getVarious().getBadgeSilver())), new C27411q(AbstractC8693b.m21278l("--"), AbstractC8693b.m21278l("2"), AbstractC8693b.m21278l("127,5"), AbstractC8693b.m21278l("100"), Integer.valueOf(c38072d.m121951d().getVarious().getBadgeGold()))), true, true, AbstractC8693b.m21278l("INTENSITÉ"), AbstractC8693b.m21278l("% du 1RM"), AbstractC8693b.m21278l("100"), AbstractC8693b.m21278l("VOLUME\nCHARGE"), AbstractC8693b.m21278l("INTENSITÉ\nMOYENNE"));
        f92387I = new InterfaceC27402h.a(AbstractC8693b.m21278l("REPS"), AbstractC8693b.m21278l("WEIGHT"), AbstractC8693b.m21278l("AVG HR"), AbstractC8693b.m21278l("lbs"), AbstractC8693b.m21278l("bpm"), AbstractC8693b.m21278l("185"), AbstractC8693b.m21278l("14"), AbstractC8693b.m21278l("TOTAL\nREPS"), AbstractC37056f.m118959K(new C27411q(AbstractC8693b.m21278l("--"), AbstractC8693b.m21278l("8"), AbstractC8693b.m21278l("175"), AbstractC8693b.m21278l("65"), Integer.valueOf(c38072d.m121951d().getVarious().getBadgeBronze())), new C27411q(AbstractC8693b.m21278l("--"), AbstractC8693b.m21278l("4"), AbstractC8693b.m21278l("175"), AbstractC8693b.m21278l("72"), Integer.valueOf(c38072d.m121951d().getVarious().getBadgeSilver())), new C27411q(AbstractC8693b.m21278l("--"), AbstractC8693b.m21278l("2"), AbstractC8693b.m21278l("185"), AbstractC8693b.m21278l("88"), Integer.valueOf(c38072d.m121951d().getVarious().getBadgeGold()))), true, true, AbstractC8693b.m21278l("INTENSITY"), AbstractC8693b.m21278l("% of 1RM"), AbstractC8693b.m21278l("74"), AbstractC8693b.m21278l("VOLUME\nLOAD"), AbstractC8693b.m21278l("AVERAGE\nINTENSITY"));
        f92388J = new InterfaceC27402h.c(c33210q5, c33210q6, c33210q7, true);
        int i18 = 8;
        DefaultConstructorMarker defaultConstructorMarker4 = null;
        boolean z15 = false;
        f92389K = new InterfaceC27402h.c(c33210q, c33210q2, c33210q3, z15, i18, defaultConstructorMarker4);
        f92390L = new InterfaceC27402h.c(c33210q, c33210q2, null, z15, i18, defaultConstructorMarker4);
        f92391M = AbstractC37056f.m118959K(Integer.valueOf(c38072d.m121951d().getVarious().getBadgeGold()), Integer.valueOf(c38072d.m121951d().getVarious().getBadgeSilver()));
        f92392N = AbstractC22977m.m66746i(2 * 8);
    }

    /* JADX INFO: renamed from: A */
    public static final void m67432A(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1210002616);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(f92392N, C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC25303l.m74291r(new AbstractC27407m.d.a(f92393a, null, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", null, null, null, f92382D, false, null, false, false, null, null, null, 16314, null), null, null, null, c28655q, 0, 14);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22241a0(i13, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m67433B(int i13, Composer composer, int i14) {
        m67432A(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    public static final void m67434C(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1418753351);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(f92392N, C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            TextResource textResource = f92396d;
            TextResource textResource2 = f92395c;
            C38072d c38072d = C38072d.f163053a;
            int iM31981D = AbstractC11895b.m31981D(c38072d);
            List<Integer> list = f92391M;
            InterfaceC27402h.c cVar = f92389K;
            TextResource textResource3 = null;
            boolean z4 = false;
            C23454a0 c23454a0 = C23454a0.f92919a;
            AbstractC25303l.m74291r(new AbstractC27407m.d.a(textResource, textResource2, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", null, null, textResource3, cVar, false, null, z4, false, Integer.valueOf(iM31981D), c23454a0, list, 1976, null), null, null, null, c28655q, 0, 14);
            TextResource textResource4 = f92397e;
            int i14 = 1976;
            DefaultConstructorMarker defaultConstructorMarker = null;
            Object obj = null;
            Object obj2 = null;
            Object obj3 = null;
            boolean z13 = false;
            boolean z14 = false;
            AbstractC25303l.m74291r(new AbstractC27407m.d.a(textResource4, textResource2, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", textResource3, obj, obj2, cVar, z4, obj3, z13, z14, Integer.valueOf(AbstractC11895b.m31981D(c38072d)), c23454a0, list, i14, defaultConstructorMarker), null, null, null, c28655q, 0, 14);
            AbstractC25303l.m74291r(new AbstractC27407m.d.a(f92398f, textResource2, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", textResource3, obj, obj2, cVar, z4, obj3, z13, z14, Integer.valueOf(AbstractC11895b.m31981D(c38072d)), c23454a0, list, i14, defaultConstructorMarker), null, null, null, c28655q, 0, 14);
            TextResource textResource5 = f92399g;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            TextResource textResource6 = null;
            Object obj4 = null;
            Object obj5 = null;
            boolean z15 = false;
            Object obj6 = null;
            boolean z16 = false;
            boolean z17 = false;
            AbstractC25303l.m74291r(new AbstractC27407m.d.a(textResource4, textResource5, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", textResource6, obj4, obj5, cVar, z15, obj6, z16, z17, Integer.valueOf(AbstractC11895b.m31981D(c38072d)), c23454a0, list, 1976, defaultConstructorMarker2), null, null, null, c28655q, 0, 14);
            AbstractC25303l.m74291r(new AbstractC27407m.d.a(textResource4, textResource5, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", textResource6, obj4, obj5, cVar, z15, obj6, z16, z17, Integer.valueOf(AbstractC11895b.m31981D(c38072d)), c23454a0, null, 10168, defaultConstructorMarker2), null, null, null, c28655q, 0, 14);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22241a0(i13, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m67435D(int i13, Composer composer, int i14) {
        m67434C(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E */
    public static final void m67436E(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(235294898);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            TextResource textResource = f92393a;
            TextResource textResource2 = f92406n;
            InterfaceC27402h.c cVar = f92417y;
            DefaultConstructorMarker defaultConstructorMarker = null;
            TextResource textResource3 = null;
            Object obj = null;
            Object obj2 = null;
            boolean z4 = false;
            Object obj3 = null;
            boolean z13 = false;
            Integer num = null;
            Object obj4 = null;
            List list = null;
            AbstractC25303l.m74291r(new AbstractC27407m.d.a(textResource, textResource2, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", textResource3, obj, obj2, cVar, z4, obj3, false, z13, num, obj4, list, 16312, defaultConstructorMarker), null, null, null, c28655q, 0, 14);
            boolean z14 = true;
            AbstractC25303l.m74291r(new AbstractC27407m.d.a(textResource, textResource2, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", textResource3, obj, obj2, f92380B, z4, obj3, z14, z13, num, obj4, list, 15800, defaultConstructorMarker), null, null, null, c28655q, 0, 14);
            AbstractC25303l.m74291r(new AbstractC27407m.d.a(textResource, AbstractC8693b.m21278l("Next"), "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", textResource3, obj, obj2, f92388J, z4, obj3, z14, true, num, obj4, list, 14776, defaultConstructorMarker), null, null, null, c28655q, 0, 14);
            boolean z15 = false;
            boolean z16 = false;
            AbstractC25303l.m74291r(new AbstractC27407m.d.a(textResource, textResource2, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", textResource3, obj, obj2, f92381C, z4, obj3, z15, z16, num, obj4, list, 16312, defaultConstructorMarker), null, null, null, c28655q, 0, 14);
            AbstractC25303l.m74291r(new AbstractC27407m.d.a(textResource, textResource2, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", textResource3, obj, obj2, cVar, z4, obj3, z15, z16, num, obj4, list, 16184, defaultConstructorMarker), null, null, null, c28655q, 0, 14);
            C38072d c38072d = C38072d.f163053a;
            int iM31981D = AbstractC11895b.m31981D(c38072d);
            List<Integer> list2 = f92391M;
            InterfaceC27402h.c cVar2 = f92389K;
            Integer numValueOf = Integer.valueOf(iM31981D);
            int i14 = 1976;
            C23454a0 c23454a0 = C23454a0.f92919a;
            AbstractC25303l.m74291r(new AbstractC27407m.d.a(textResource, textResource2, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", textResource3, obj, obj2, cVar2, z4, obj3, z15, z16, numValueOf, c23454a0, list2, i14, defaultConstructorMarker), null, null, null, c28655q, 0, 14);
            AbstractC25303l.m74291r(new AbstractC27407m.d.a(textResource, f92395c, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", textResource3, obj, obj2, f92390L, z4, obj3, z15, z16, Integer.valueOf(AbstractC11895b.m31981D(c38072d)), c23454a0, list2, i14, defaultConstructorMarker), null, null, null, c28655q, 0, 14);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22241a0(i13, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m67437F(int i13, Composer composer, int i14) {
        m67436E(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G */
    public static final void m67438G(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-697350470);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(f92392N, C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            m67436E(c28655q, 0);
            m67434C(c28655q, 0);
            m67440I(c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22241a0(i13, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m67439H(int i13, Composer composer, int i14) {
        m67438G(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: I */
    public static final void m67440I(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1213570771);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            TextResource textResource = f92405m;
            TextResource textResource2 = f92406n;
            InterfaceC27402h.c cVar = f92418z;
            int i14 = 112;
            DefaultConstructorMarker defaultConstructorMarker = null;
            boolean z4 = false;
            Integer num = null;
            Object obj = null;
            List list = null;
            AbstractC25303l.m74291r(new AbstractC27407m.d.b(textResource, textResource2, cVar, z4, num, obj, list, i14, defaultConstructorMarker), null, null, null, c28655q, 0, 14);
            InterfaceC27402h.c cVar2 = f92379A;
            AbstractC25303l.m74291r(new AbstractC27407m.d.b(textResource, textResource2, cVar2, z4, num, obj, list, i14, defaultConstructorMarker), null, null, null, c28655q, 0, 14);
            int i15 = 120;
            AbstractC25303l.m74291r(new AbstractC27407m.d.b(textResource, textResource2, cVar, z4, num, obj, list, i15, defaultConstructorMarker), null, null, null, c28655q, 0, 14);
            AbstractC25303l.m74291r(new AbstractC27407m.d.b(textResource, textResource2, cVar2, z4, num, obj, list, i15, defaultConstructorMarker), null, null, null, c28655q, 0, 14);
            int whoopIcon = EnumC16313m0.CARET_FORWARD.toWhoopIcon();
            AbstractC25303l.m74291r(new AbstractC27407m.d.b(textResource, textResource2, f92389K, z4, Integer.valueOf(whoopIcon), C23454a0.f92919a, f92391M, 8, defaultConstructorMarker), null, null, null, c28655q, 0, 14);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22241a0(i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m67441J(int i13, Composer composer, int i14) {
        m67440I(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: K */
    public static final TextResource m67442K() {
        return f92395c;
    }

    /* JADX INFO: renamed from: L */
    public static final InterfaceC27402h.b m67443L() {
        return f92400h;
    }

    /* JADX INFO: renamed from: M */
    public static final TextResource m67444M() {
        return f92393a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static final void m67457m(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1046159201);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(f92392N, C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            UUID uuidRandomUUID = UUID.randomUUID();
            AbstractC22676k.m65749i(uuidRandomUUID, "randomUUID(...)");
            TextResource textResource = f92393a;
            TextResource textResource2 = f92395c;
            InterfaceC27402h.b bVar = f92404l;
            C23454a0 c23454a0 = C23454a0.f92919a;
            TextResource textResource3 = null;
            AbstractC25303l.m74291r(new AbstractC27407m.b.C42105b(true, uuidRandomUUID, textResource, textResource2, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", null, 0, c23454a0, textResource3, false, bVar, false, ErrorCodes.InitAPIErrors.cHTTPError, null), null, null, null, c28655q, 0, 14);
            UUID uuidRandomUUID2 = UUID.randomUUID();
            AbstractC22676k.m65749i(uuidRandomUUID2, "randomUUID(...)");
            DefaultConstructorMarker defaultConstructorMarker = null;
            boolean z4 = true;
            Object obj = null;
            boolean z13 = false;
            AbstractC25303l.m74291r(new AbstractC27407m.b.C42105b(z4, uuidRandomUUID2, textResource, textResource2, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", textResource3, 0 == true ? 1 : 0, c23454a0, obj, true, bVar, z13, ErrorCodes.InitAPIErrors.cHTTPError, defaultConstructorMarker), null, null, null, c28655q, 0, 14);
            UUID uuidRandomUUID3 = UUID.randomUUID();
            AbstractC22676k.m65749i(uuidRandomUUID3, "randomUUID(...)");
            int i14 = 352;
            AbstractC25303l.m74291r(new AbstractC27407m.b.C42105b(z4, uuidRandomUUID3, textResource, textResource2, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", textResource3, 0 == true ? 1 : 0, c23454a0, obj, false, bVar, z13, i14, defaultConstructorMarker), null, null, null, c28655q, 0, 14);
            UUID uuidRandomUUID4 = UUID.randomUUID();
            AbstractC22676k.m65749i(uuidRandomUUID4, "randomUUID(...)");
            AbstractC25303l.m74291r(new AbstractC27407m.b.C42105b(z4, uuidRandomUUID4, textResource, textResource2, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", textResource3, 0 == true ? 1 : 0, c23454a0, obj, true, bVar, z13, i14, defaultConstructorMarker), null, null, null, c28655q, 0, 14);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22241a0(i13, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m67458n(int i13, Composer composer, int i14) {
        m67457m(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    public static final void m67459o(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-92664509);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            AbstractC25303l.m74291r(new AbstractC27407m.d.a(f92393a, null, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", null, null, null, f92384F, false, null, false, false, Integer.valueOf(AbstractC11895b.m31981D(C38072d.f163053a)), C23454a0.f92919a, null, 10170, null), null, null, null, c28655q, 0, 14);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22241a0(i13, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m67460p(int i13, Composer composer, int i14) {
        m67459o(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    public static final void m67461q(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1782140040);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            AbstractC25303l.m74291r(new AbstractC27407m.d.a(f92393a, null, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", null, null, null, f92387I, false, null, false, false, Integer.valueOf(AbstractC11895b.m31981D(C38072d.f163053a)), C23454a0.f92919a, null, 10170, null), null, null, null, c28655q, 0, 14);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22241a0(i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m67462r(int i13, Composer composer, int i14) {
        m67461q(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    public static final void m67463s(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1013830960);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(f92392N, C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            TextResource textResource = f92393a;
            TextResource textResource2 = f92395c;
            DefaultConstructorMarker defaultConstructorMarker = null;
            TextResource textResource3 = null;
            boolean z4 = false;
            AbstractC25303l.m74291r(new AbstractC27407m.a("", textResource, textResource2, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", textResource3, z4, 48, defaultConstructorMarker), null, null, null, c28655q, 0, 14);
            AbstractC25303l.m74291r(new AbstractC27407m.a("", textResource, textResource2, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", textResource3, z4, 16, defaultConstructorMarker), null, null, null, c28655q, 0, 14);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22241a0(i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m67464t(int i13, Composer composer, int i14) {
        m67463s(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    public static final void m67465u(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1705410950);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(f92392N, C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            UUID uuidRandomUUID = UUID.randomUUID();
            AbstractC22676k.m65749i(uuidRandomUUID, "randomUUID(...)");
            TextResource textResource = f92393a;
            TextResource textResource2 = f92395c;
            InterfaceC27402h.b bVar = f92400h;
            C23454a0 c23454a0 = C23454a0.f92919a;
            AbstractC25303l.m74291r(new AbstractC27407m.b.a(uuidRandomUUID, textResource, textResource2, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", null, 0, c23454a0, null, false, bVar, false, 1200, null), null, null, null, c28655q, 0, 14);
            UUID uuidRandomUUID2 = UUID.randomUUID();
            AbstractC22676k.m65749i(uuidRandomUUID2, "randomUUID(...)");
            DefaultConstructorMarker defaultConstructorMarker = null;
            TextResource textResource3 = null;
            Object obj = null;
            boolean z4 = false;
            AbstractC25303l.m74291r(new AbstractC27407m.b.a(uuidRandomUUID2, textResource, textResource2, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", textResource3, 0, c23454a0, obj, true, bVar, z4, 1200, defaultConstructorMarker), null, null, null, c28655q, 0, 14);
            UUID uuidRandomUUID3 = UUID.randomUUID();
            AbstractC22676k.m65749i(uuidRandomUUID3, "randomUUID(...)");
            AbstractC25303l.m74291r(new AbstractC27407m.b.a(uuidRandomUUID3, textResource, textResource2, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", textResource3, C38072d.f163053a.m121951d().getVarious().getDrag(), c23454a0, obj, false, bVar, z4, 1168, defaultConstructorMarker), null, null, null, c28655q, 0, 14);
            UUID uuidRandomUUID4 = UUID.randomUUID();
            AbstractC22676k.m65749i(uuidRandomUUID4, "randomUUID(...)");
            int i14 = 0;
            AbstractC25303l.m74291r(new AbstractC27407m.b.a(uuidRandomUUID4, textResource, textResource2, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", textResource3, i14, c23454a0, obj, true, f92401i, z4, 1200, defaultConstructorMarker), null, null, null, c28655q, 0, 14);
            UUID uuidRandomUUID5 = UUID.randomUUID();
            AbstractC22676k.m65749i(uuidRandomUUID5, "randomUUID(...)");
            int i15 = 176;
            AbstractC25303l.m74291r(new AbstractC27407m.b.a(uuidRandomUUID5, textResource, textResource2, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", textResource3, i14, c23454a0, obj, false, bVar, z4, i15, defaultConstructorMarker), null, null, null, c28655q, 0, 14);
            UUID uuidRandomUUID6 = UUID.randomUUID();
            AbstractC22676k.m65749i(uuidRandomUUID6, "randomUUID(...)");
            AbstractC25303l.m74291r(new AbstractC27407m.b.a(uuidRandomUUID6, textResource, textResource2, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", textResource3, i14, c23454a0, obj, true, bVar, z4, i15, defaultConstructorMarker), null, null, null, c28655q, 0, 14);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22241a0(i13, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m67466v(int i13, Composer composer, int i14) {
        m67465u(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public static final void m67467w(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(81816814);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(f92392N, C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            UUID uuidRandomUUID = UUID.randomUUID();
            AbstractC22676k.m65749i(uuidRandomUUID, "randomUUID(...)");
            TextResource textResource = f92393a;
            TextResource textResource2 = f92395c;
            InterfaceC27402h.b bVar = f92403k;
            TextResource textResource3 = null;
            C23454a0 c23454a0 = C23454a0.f92919a;
            AbstractC25303l.m74291r(new AbstractC27407m.b.C42105b(false, uuidRandomUUID, textResource, textResource2, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", null, 0, c23454a0, textResource3, false, bVar, false, 2401, null), null, null, null, c28655q, 0, 14);
            UUID uuidRandomUUID2 = UUID.randomUUID();
            AbstractC22676k.m65749i(uuidRandomUUID2, "randomUUID(...)");
            int i14 = 2401;
            DefaultConstructorMarker defaultConstructorMarker = null;
            boolean z4 = false;
            Object obj = null;
            boolean z13 = true;
            boolean z14 = false;
            AbstractC25303l.m74291r(new AbstractC27407m.b.C42105b(z4, uuidRandomUUID2, textResource, textResource2, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", textResource3, 0 == true ? 1 : 0, c23454a0, obj, z13, f92402j, z14, i14, defaultConstructorMarker), null, null, null, c28655q, 0, 14);
            UUID uuidRandomUUID3 = UUID.randomUUID();
            AbstractC22676k.m65749i(uuidRandomUUID3, "randomUUID(...)");
            AbstractC25303l.m74291r(new AbstractC27407m.b.C42105b(z4, uuidRandomUUID3, textResource, textResource2, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", textResource3, 0 == true ? 1 : 0, c23454a0, obj, z13, bVar, z14, i14, defaultConstructorMarker), null, null, null, c28655q, 0, 14);
            UUID uuidRandomUUID4 = UUID.randomUUID();
            AbstractC22676k.m65749i(uuidRandomUUID4, "randomUUID(...)");
            int i15 = 353;
            AbstractC25303l.m74291r(new AbstractC27407m.b.C42105b(z4, uuidRandomUUID4, textResource, textResource2, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", textResource3, 0 == true ? 1 : 0, c23454a0, obj, false, bVar, z14, i15, defaultConstructorMarker), null, null, null, c28655q, 0, 14);
            UUID uuidRandomUUID5 = UUID.randomUUID();
            AbstractC22676k.m65749i(uuidRandomUUID5, "randomUUID(...)");
            AbstractC25303l.m74291r(new AbstractC27407m.b.C42105b(z4, uuidRandomUUID5, textResource, textResource2, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", textResource3, 0 == true ? 1 : 0, c23454a0, obj, true, bVar, z14, i15, defaultConstructorMarker), null, null, null, c28655q, 0, 14);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22241a0(i13, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m67468x(int i13, Composer composer, int i14) {
        m67467w(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    public static final void m67469y(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1529853906);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(f92392N, C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            TextResource textResource = f92393a;
            TextResource textResource2 = null;
            C23454a0 c23454a0 = C23454a0.f92919a;
            Object obj = null;
            AbstractC25303l.m74291r(new AbstractC27407m.c.a("BENCH_PRESS_BB", textResource, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", textResource2, c23454a0, c23454a0, obj, false, 200, null), null, null, null, c28655q, 0, 14);
            int i14 = 72;
            DefaultConstructorMarker defaultConstructorMarker = null;
            AbstractC25303l.m74291r(new AbstractC27407m.c.C42106c("BENCH_PRESS_BB", textResource, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", textResource2, c23454a0, c23454a0, obj, i14, defaultConstructorMarker), null, null, null, c28655q, 0, 14);
            AbstractC25303l.m74291r(new AbstractC27407m.c.b("BENCH_PRESS_BB", textResource, "https://dh6o7n168ts9.cloudfront.net/exercises/BENCHPRESS_BARBELL.jpg", textResource2, c23454a0, c23454a0, obj, i14, defaultConstructorMarker), null, null, null, c28655q, 0, 14);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22241a0(i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m67470z(int i13, Composer composer, int i14) {
        m67469y(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
