package com.whoop.realtime.presentation;

import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.whoop.data.remote.domain.dto.CycleMetadataResponseDto;
import com.whoop.data.remote.domain.dto.SleepDataDto;
import com.whoop.data.remote.domain.dto.StrainDataDto;
import com.whoop.domain.model.StrainRecoveryMapping;
import com.whoop.domain.model.User;
import com.whoop.p069ui.WhoopSwitch;
import com.whoop.p069ui.activities.realtime.SportCategory;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.realtime.presentation.views.StrainCoachGoalPicker;
import com.whoop.service.network.model.Sport;
import e50.C12723b;
import ge3.AbstractC15751g;
import gi0.AbstractC15887f;
import gi0.AbstractC15888g;
import i93.C18279e;
import i93.InterfaceC18280f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import k52.AbstractC22210f;
import l83.C23454a0;
import lh3.C24082e;
import lm2.C24517c;
import lm2.C24518d;
import lm2.InterfaceC24516b;
import no0.C26944e0;
import o52.C27566m0;
import o52.EnumC27584v0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p92.C29021j;
import t83.InterfaceC33616a;
import wb3.AbstractC37056f;
import ze1.C40588d;

/* JADX INFO: renamed from: com.whoop.realtime.presentation.m */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0002DGB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u0018J\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u0015¢\u0006\u0004\b$\u0010\u0018J\u0015\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020)¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u000e¢\u0006\u0004\b0\u00101J\u001d\u00104\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\u000e2\u0006\u00103\u001a\u00020\u000e¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\u0002062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b7\u00108J\u001d\u0010:\u001a\u0002062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u000e¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u0002062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b<\u00108J\u0017\u0010?\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010=H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\u000eH\u0002¢\u0006\u0004\bB\u0010CR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR*\u0010U\u001a\u00020N2\u0006\u0010O\u001a\u00020N8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010W\u001a\u00020\u000e2\u0006\u0010O\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b<\u0010K\u001a\u0004\bV\u00101R(\u0010[\u001a\u0004\u0018\u00010\u00122\b\u0010O\u001a\u0004\u0018\u00010\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010\u0014R(\u0010^\u001a\u0004\u0018\u00010\u00122\b\u0010O\u001a\u0004\u0018\u00010\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\\\u0010Y\u001a\u0004\b]\u0010\u0014R$\u0010`\u001a\u00020\u000e2\u0006\u0010O\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b0\u0010K\u001a\u0004\b_\u00101R\u0018\u0010b\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010aR\u0018\u0010d\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010aR\u0018\u0010f\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010eR\u0018\u0010h\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010gR\u0018\u0010i\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010aR\u0018\u0010k\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010jR\u0018\u0010n\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0016\u0010p\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010oR\u001e\u0010r\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010qR\u0018\u0010t\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010sR$\u0010u\u001a\u00020\u000e2\u0006\u0010O\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010K\u001a\u0004\bX\u00101R(\u0010z\u001a\u0004\u0018\u00010v2\b\u0010O\u001a\u0004\u0018\u00010v8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b$\u0010w\u001a\u0004\bx\u0010yR(\u0010}\u001a\u0004\u0018\u00010>2\b\u0010O\u001a\u0004\u0018\u00010>8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b!\u0010{\u001a\u0004\b\\\u0010|R\u0019\u0010\u0081\u0001\u001a\u00020v8\u0006¢\u0006\r\n\u0004\b\u001d\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R*\u0010\u0089\u0001\u001a\u00030\u0082\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R*\u0010\u008b\u0001\u001a\u00030\u0082\u00012\u0007\u0010O\u001a\u00030\u0082\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\b\u008a\u0001\u0010\u0084\u0001\u001a\u0005\bl\u0010\u0086\u0001R\u001c\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0019\u0010\u008c\u0001R\u001c\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010\u008c\u0001¨\u0006\u008f\u0001"}, m65681d2 = {"Lcom/whoop/realtime/presentation/m;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lp92/j;", "mapper", "Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;", "cycleMetadata", "Ll83/a0;", "n", "(Lp92/j;Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;)V", "Llh3/e;", "", "A", "()Llh3/e;", "z", "Lcom/whoop/domain/model/StrainRecoveryMapping;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/domain/model/StrainRecoveryMapping;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "p", "(Landroid/view/View;)V", "y", "s", "Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;", "picker", "v", "(Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;)V", "Lcom/whoop/ui/WhoopSwitch;", "switch", "u", "(Lcom/whoop/ui/WhoopSwitch;)V", "dial", "t", "Landroid/widget/ImageButton;", "button", "r", "(Landroid/widget/ImageButton;)V", "Landroid/widget/TextView;", "q", "(Landroid/widget/TextView;)V", "Llm2/b;", "activity", "B", "(Llm2/b;)V", "g", "()D", "activityStrain", "dayStrain", "c", "(DD)D", "", "m", "(Landroid/content/Context;)Ljava/lang/String;", "strain", "i", "(Landroid/content/Context;D)Ljava/lang/String;", "d", "Li93/f;", "", "j", "()Li93/f;", "scaled", "E", "(D)D", "a", "Landroid/content/Context;", "Lo52/v0;", "b", "Lo52/v0;", "getStrainCoachViewModelState", "()Lo52/v0;", "D", "(Lo52/v0;)V", "strainCoachViewModelState", "Lcom/whoop/realtime/presentation/m$b;", "value", "Lcom/whoop/realtime/presentation/m$b;", "l", "()Lcom/whoop/realtime/presentation/m$b;", "C", "(Lcom/whoop/realtime/presentation/m$b;)V", "strainCoachState", "k", "pickedStrainGoal", "e", "Lcom/whoop/domain/model/StrainRecoveryMapping;", "getPickedStrainMapping", "pickedStrainMapping", "f", "getPickedStrainMappingForCoachingLanding", "pickedStrainMappingForCoachingLanding", "getEstimatedDayStrain", "estimatedDayStrain", "Landroid/view/View;", "strainCoachBottomSheet", "unlockedViewContainer", "lockedViewContainer", "Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;", "goalPicker", "Lcom/whoop/ui/WhoopSwitch;", "coachSwitch", "miniDialContainer", "Landroid/widget/ImageButton;", "lockedHelpButton", "o", "Landroid/widget/TextView;", "coachLockedText", "F", "optimalGoal", "Li93/f;", "optimalRange", "Llm2/b;", "selectedActivity", "currentDayStrain", "", "Ljava/lang/Integer;", "getCurrentRecoveryScore", "()Ljava/lang/Integer;", "currentRecoveryScore", "Ljava/lang/Float;", "()Ljava/lang/Float;", "currentRecoveryPct", "I", "getCurrentRecoveryCount", "()I", "currentRecoveryCount", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Z", "getDayStrainAlreadyExceeded", "()Z", "setDayStrainAlreadyExceeded", "(Z)V", "dayStrainAlreadyExceeded", "x", "isCurrentlyBlackedOut", "Llh3/e;", "pickedStrainGoalSubject", "estimatedDayStrainSubject", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9889m {

    /* JADX INFO: renamed from: B */
    public static final int f29033B = 8;

    /* JADX INFO: renamed from: C */
    private static final int f29034C = 4;

    /* JADX INFO: renamed from: D */
    private static final double f29035D = 0.0d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private EnumC27584v0 strainCoachViewModelState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private b strainCoachState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private double pickedStrainGoal;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private StrainRecoveryMapping pickedStrainMapping;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private StrainRecoveryMapping pickedStrainMappingForCoachingLanding;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private double estimatedDayStrain;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private View strainCoachBottomSheet;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private View unlockedViewContainer;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private View lockedViewContainer;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private StrainCoachGoalPicker goalPicker;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private WhoopSwitch coachSwitch;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private View miniDialContainer;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private ImageButton lockedHelpButton;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private TextView coachLockedText;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private float optimalGoal;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private InterfaceC18280f optimalRange;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private InterfaceC24516b selectedActivity;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private double currentDayStrain;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private Integer currentRecoveryScore;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private Float currentRecoveryPct;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final int currentRecoveryCount;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private boolean dayStrainAlreadyExceeded;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private boolean isCurrentlyBlackedOut;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C24082e pickedStrainGoalSubject;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C24082e estimatedDayStrainSubject;

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.m$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/realtime/presentation/m$b;", "", "<init>", "(Ljava/lang/String;I)V", "ON", "OFF", "LOCKED", "HIDDEN", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum b {
        ON,
        OFF,
        LOCKED,
        HIDDEN;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.m$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f29063a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f29064b;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.LOCKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.HIDDEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f29063a = iArr;
            int[] iArr2 = new int[EnumC27584v0.values().length];
            try {
                iArr2[EnumC27584v0.RECOVERY_AND_STRAIN_PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC27584v0.STRAIN_COACH_STATUS_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f29064b = iArr2;
        }
    }

    public C9889m(Context context) {
        AbstractC22676k.m65750j(context, "context");
        this.context = context;
        this.strainCoachViewModelState = EnumC27584v0.NO_RECOVERY_AND_STRAIN_PENDING;
        this.strainCoachState = b.ON;
        this.currentDayStrain = f29035D;
        this.currentRecoveryCount = C12723b.m35566a().m35573h().m84091e();
        this.pickedStrainGoalSubject = C24082e.m71000Y();
        this.estimatedDayStrainSubject = C24082e.m71000Y();
    }

    /* JADX INFO: renamed from: E */
    private final double m24120E(double scaled) {
        List<List<Double>> list = AbstractC15888g.f60009a;
        AbstractC22676k.m65747g(list);
        int iM118951C = AbstractC37056f.m118951C(list);
        double dDoubleValue = 0.0d;
        if (iM118951C >= 0) {
            int i13 = 0;
            boolean z4 = false;
            while (true) {
                Double d3 = list.get(i13).get(1);
                int i14 = i13 + 1;
                Double d14 = list.get(Math.min(i14, AbstractC37056f.m118951C(list))).get(1);
                if (!z4 && scaled >= d3.doubleValue() && scaled < d14.doubleValue()) {
                    Double d15 = list.get(i13).get(0);
                    AbstractC22676k.m65749i(d15, "get(...)");
                    dDoubleValue = d15.doubleValue();
                    z4 = true;
                }
                if (i13 == iM118951C) {
                    break;
                }
                i13 = i14;
            }
        }
        return dDoubleValue;
    }

    /* JADX INFO: renamed from: j */
    private final InterfaceC18280f m24123j() {
        InterfaceC24516b interfaceC24516b;
        if (this.dayStrainAlreadyExceeded || (interfaceC24516b = this.selectedActivity) == null || (interfaceC24516b instanceof C24517c)) {
            return null;
        }
        boolean z4 = interfaceC24516b instanceof C24518d;
        Sport sportM71421k = ((C24518d) interfaceC24516b).m71421k();
        return ((sportM71421k != null ? sportM71421k.getCategory() : null) == SportCategory.CARDIOVASCULAR) & z4 ? this.optimalRange : this.optimalRange;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m24124w(C9889m c9889m, Float f13) {
        double dFloatValue = ((double) f13.floatValue()) * 21.0d;
        c9889m.pickedStrainGoal = dFloatValue;
        c9889m.estimatedDayStrain = c9889m.m24130c(dFloatValue, c9889m.currentDayStrain);
        c9889m.pickedStrainGoalSubject.onNext(Double.valueOf(c9889m.pickedStrainGoal));
        c9889m.estimatedDayStrainSubject.onNext(Double.valueOf(c9889m.estimatedDayStrain));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final void m24125x(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final C24082e getPickedStrainGoalSubject() {
        return this.pickedStrainGoalSubject;
    }

    /* JADX INFO: renamed from: B */
    public final void m24127B(InterfaceC24516b activity) {
        AbstractC22676k.m65750j(activity, "activity");
        this.selectedActivity = activity;
        InterfaceC18280f interfaceC18280fM24123j = m24123j();
        C18279e c18279e = interfaceC18280fM24123j != null ? new C18279e(((Number) interfaceC18280fM24123j.getStart()).floatValue() * 0.04761905f, ((Number) interfaceC18280fM24123j.mo52651d()).floatValue() * 0.04761905f) : null;
        if (c18279e == null) {
            StrainCoachGoalPicker strainCoachGoalPicker = this.goalPicker;
            if (strainCoachGoalPicker != null) {
                strainCoachGoalPicker.m24198E(0.0f, 1.0f);
                return;
            }
            return;
        }
        StrainCoachGoalPicker strainCoachGoalPicker2 = this.goalPicker;
        if (strainCoachGoalPicker2 != null) {
            strainCoachGoalPicker2.m24198E(c18279e.f71131w, c18279e.f71132x);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m24128C(b value) {
        AbstractC22676k.m65750j(value, "value");
        this.strainCoachState = value;
        int i13 = c.f29063a[value.ordinal()];
        if (i13 == 1) {
            View view = this.unlockedViewContainer;
            if (view != null) {
                view.setVisibility(8);
            }
            View view2 = this.lockedViewContainer;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            WhoopSwitch whoopSwitch = this.coachSwitch;
            if (whoopSwitch != null) {
                whoopSwitch.setChecked(false);
            }
            WhoopSwitch whoopSwitch2 = this.coachSwitch;
            if (whoopSwitch2 != null) {
                whoopSwitch2.setEnabled(false);
            }
            View view3 = this.miniDialContainer;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            ImageButton imageButton = this.lockedHelpButton;
            if (imageButton != null) {
                imageButton.setVisibility(0);
                return;
            }
            return;
        }
        if (i13 == 2) {
            View view4 = this.strainCoachBottomSheet;
            if (view4 != null) {
                view4.setVisibility(8);
                return;
            }
            return;
        }
        View view5 = this.unlockedViewContainer;
        if (view5 != null) {
            view5.setVisibility(0);
        }
        View view6 = this.lockedViewContainer;
        if (view6 != null) {
            view6.setVisibility(8);
        }
        WhoopSwitch whoopSwitch3 = this.coachSwitch;
        if (whoopSwitch3 != null) {
            whoopSwitch3.setEnabled(true);
        }
        View view7 = this.miniDialContainer;
        if (view7 != null) {
            view7.setVisibility(0);
        }
        ImageButton imageButton2 = this.lockedHelpButton;
        if (imageButton2 != null) {
            imageButton2.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m24129D(EnumC27584v0 enumC27584v0) {
        AbstractC22676k.m65750j(enumC27584v0, "<set-?>");
        this.strainCoachViewModelState = enumC27584v0;
    }

    /* JADX INFO: renamed from: c */
    public final double m24130c(double activityStrain, double dayStrain) {
        return dayStrain < 0.09d ? activityStrain : Math.max(AbstractC15887f.m44809j(m24120E(dayStrain) + m24120E(activityStrain)), Math.max(activityStrain, dayStrain));
    }

    /* JADX WARN: Code duplicated, block: B:212:0x025e  */
    /* JADX WARN: Code duplicated, block: B:213:0x0263  */
    /* JADX WARN: Code duplicated, block: B:220:0x0279  */
    /* JADX INFO: renamed from: d */
    public final String m24131d(Context context) {
        String firstName;
        String value;
        SportCategory category;
        int i13;
        int i14;
        Integer num;
        int iIntValue;
        String strMo71415h;
        AbstractC22676k.m65750j(context, "context");
        User userM84055f = C12723b.m35566a().m35572g().m84055f();
        int maxHeartRate = userM84055f != null ? (int) (userM84055f.getMaxHeartRate() * 0.3f) : 0;
        if (userM84055f == null || (firstName = userM84055f.getFirstName()) == null) {
            firstName = "???";
        }
        String str = firstName;
        float f13 = (float) this.currentDayStrain;
        InterfaceC24516b interfaceC24516b = this.selectedActivity;
        InterfaceC18280f interfaceC18280f = this.optimalRange;
        float fFloatValue = interfaceC18280f != null ? ((Number) interfaceC18280f.getStart()).floatValue() : 0.0f;
        InterfaceC18280f interfaceC18280f2 = this.optimalRange;
        float fFloatValue2 = interfaceC18280f2 != null ? ((Number) interfaceC18280f2.mo52651d()).floatValue() : Float.MAX_VALUE;
        if (this.dayStrainAlreadyExceeded) {
            String string = context.getString(AbstractC22210f.f86470d0);
            AbstractC22676k.m65749i(string, "getString(...)");
            return string;
        }
        if (this.pickedStrainGoal > 20.899999618530273d) {
            value = "impossible";
        } else if ((this.currentRecoveryScore == null) || (this.optimalRange == null)) {
            value = "null";
        } else if (interfaceC24516b instanceof C24518d) {
            Sport sportM71421k = ((C24518d) interfaceC24516b).m71421k();
            value = (sportM71421k == null || (category = sportM71421k.getCategory()) == null) ? null : category.getValue();
        } else {
            value = "restorative";
        }
        if (value != null) {
            switch (value.hashCode()) {
                case -2141384043:
                    i13 = maxHeartRate;
                    if (value.equals("impossible")) {
                        i14 = AbstractC22210f.f86455X0;
                        break;
                    }
                    break;
                case -2120890375:
                    if (!value.equals("cardiovascular")) {
                        i13 = maxHeartRate;
                    } else {
                        float f14 = this.optimalGoal;
                        if (f13 <= f14) {
                            double d3 = this.pickedStrainGoal;
                            if (d3 >= 0.10000000149011612d) {
                                int i15 = maxHeartRate;
                                double d14 = fFloatValue;
                                if ((d3 < d14) && (d3 < 6.0d)) {
                                    i14 = AbstractC22210f.f86456Y;
                                } else if ((d3 < d14) && (d3 >= 6.0d)) {
                                    i14 = AbstractC22210f.f86458Z;
                                } else {
                                    i13 = i15;
                                    if (d3 != f14) {
                                        double d15 = fFloatValue2;
                                        if ((d3 >= d14) && (d3 < d15)) {
                                            i14 = AbstractC22210f.f86464b0;
                                        } else if ((d3 > d15) && (f13 > fFloatValue2)) {
                                            i14 = AbstractC22210f.f86467c0;
                                        } else {
                                            i14 = d3 <= d15 ? AbstractC22210f.f86476f0 : AbstractC22210f.f86473e0;
                                        }
                                    } else {
                                        i14 = AbstractC22210f.f86461a0;
                                    }
                                }
                                i13 = i15;
                            } else {
                                i14 = AbstractC22210f.f86454X;
                            }
                        } else {
                            i14 = AbstractC22210f.f86470d0;
                        }
                        i13 = maxHeartRate;
                    }
                    break;
                case -1440008455:
                    if (!value.equals("non-cardiovascular")) {
                        i13 = maxHeartRate;
                    } else {
                        double d16 = this.pickedStrainGoal;
                        if (0.0d <= d16 && d16 <= 0.10000000149011612d) {
                            i14 = AbstractC22210f.f86527w0;
                        } else if (0.0d <= d16 && d16 <= 6.0d) {
                            i14 = AbstractC22210f.f86530x0;
                        } else if (0.0d <= d16 && d16 <= 10.0d) {
                            i14 = AbstractC22210f.f86533y0;
                        } else if (0.0d > d16 || d16 > 14.0d) {
                            i14 = (0.0d > d16 || d16 > 18.0d) ? AbstractC22210f.f86411B0 : AbstractC22210f.f86408A0;
                        } else {
                            i14 = AbstractC22210f.f86536z0;
                        }
                        i13 = maxHeartRate;
                    }
                    break;
                case 3392903:
                    if (!value.equals("null")) {
                        i13 = maxHeartRate;
                    } else {
                        double d17 = this.pickedStrainGoal;
                        if (0.0d <= d17 && d17 <= 0.10000000149011612d) {
                            int i16 = c.f29064b[this.strainCoachViewModelState.ordinal()];
                            i14 = i16 != 1 ? i16 != 2 ? AbstractC22210f.f86413C0 : AbstractC22210f.f86528w1 : AbstractC22210f.f86525v1;
                        } else if (0.0d <= d17 && d17 <= 6.0d) {
                            i14 = AbstractC22210f.f86415D0;
                        } else if (0.0d <= d17 && d17 <= 10.0d) {
                            i14 = AbstractC22210f.f86417E0;
                        } else if (0.0d > d17 || d17 > 14.0d) {
                            i14 = (0.0d > d17 || d17 > 18.0d) ? AbstractC22210f.f86423H0 : AbstractC22210f.f86421G0;
                        } else {
                            i14 = AbstractC22210f.f86419F0;
                        }
                        i13 = maxHeartRate;
                    }
                    break;
                case 327209326:
                    if (!value.equals("restorative")) {
                        i13 = maxHeartRate;
                    } else {
                        double d18 = this.pickedStrainGoal;
                        i14 = (0.0d > d18 || d18 > 0.10000000149011612d) ? (0.0d > d18 || d18 > 6.0d) ? AbstractC22210f.f86429K0 : AbstractC22210f.f86427J0 : AbstractC22210f.f86425I0;
                        i13 = maxHeartRate;
                    }
                    break;
                case 838887168:
                    if (!value.equals("muscular")) {
                        i13 = maxHeartRate;
                    } else {
                        double d19 = this.pickedStrainGoal;
                        if (0.0d <= d19 && d19 <= 0.10000000149011612d) {
                            i14 = AbstractC22210f.f86509q0;
                        } else if (0.0d <= d19 && d19 <= 6.0d) {
                            i14 = AbstractC22210f.f86512r0;
                        } else if (0.0d <= d19 && d19 <= 10.0d) {
                            i14 = AbstractC22210f.f86515s0;
                        } else if (0.0d > d19 || d19 > 14.0d) {
                            i14 = (0.0d > d19 || d19 > 18.0d) ? AbstractC22210f.f86524v0 : AbstractC22210f.f86521u0;
                        } else {
                            i14 = AbstractC22210f.f86518t0;
                        }
                        i13 = maxHeartRate;
                    }
                    break;
                default:
                    i13 = maxHeartRate;
                    break;
            }
            Double dValueOf = Double.valueOf(this.pickedStrainGoal);
            num = this.currentRecoveryScore;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            Integer numValueOf = Integer.valueOf(iIntValue);
            Float fValueOf = Float.valueOf(this.optimalGoal);
            if (interfaceC24516b != null || (strMo71415h = interfaceC24516b.mo71415h(context)) == null) {
                strMo71415h = "";
            }
            String string2 = context.getString(i14, dValueOf, str, numValueOf, fValueOf, strMo71415h, Integer.valueOf(i13));
            AbstractC22676k.m65749i(string2, "getString(...)");
            return string2;
        }
        i13 = maxHeartRate;
        i14 = AbstractC22210f.f86413C0;
        Double dValueOf2 = Double.valueOf(this.pickedStrainGoal);
        num = this.currentRecoveryScore;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        Integer numValueOf2 = Integer.valueOf(iIntValue);
        Float fValueOf2 = Float.valueOf(this.optimalGoal);
        if (interfaceC24516b != null) {
            strMo71415h = "";
        } else {
            strMo71415h = "";
        }
        String string3 = context.getString(i14, dValueOf2, str, numValueOf2, fValueOf2, strMo71415h, Integer.valueOf(i13));
        AbstractC22676k.m65749i(string3, "getString(...)");
        return string3;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final double getCurrentDayStrain() {
        return this.currentDayStrain;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Float getCurrentRecoveryPct() {
        return this.currentRecoveryPct;
    }

    /* JADX INFO: renamed from: g */
    public final double m24134g() {
        InterfaceC24516b interfaceC24516b;
        if (this.dayStrainAlreadyExceeded || (interfaceC24516b = this.selectedActivity) == null) {
            return 0.0d;
        }
        if (interfaceC24516b instanceof C24517c) {
            return 1.0d;
        }
        boolean z4 = interfaceC24516b instanceof C24518d;
        C24518d c24518d = (C24518d) interfaceC24516b;
        Sport sportM71421k = c24518d.m71421k();
        if (AbstractC22676k.m65745e(sportM71421k != null ? sportM71421k.getName() : null, "Meditation") && z4) {
            return 1.0d;
        }
        Sport sportM71421k2 = c24518d.m71421k();
        if (((sportM71421k2 != null ? sportM71421k2.getCategory() : null) == SportCategory.CARDIOVASCULAR) && z4) {
            return this.optimalGoal;
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: h */
    public final StrainRecoveryMapping m24135h() {
        WhoopSwitch whoopSwitch = this.coachSwitch;
        if ((whoopSwitch == null || whoopSwitch.isChecked()) && !this.dayStrainAlreadyExceeded) {
            return this.pickedStrainMapping;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final String m24136i(Context context, double strain) {
        int i13;
        AbstractC22676k.m65750j(context, "context");
        if (this.currentRecoveryScore == null) {
            return m24139m(context);
        }
        InterfaceC18280f interfaceC18280f = this.optimalRange;
        if (strain < (interfaceC18280f != null ? ((Number) interfaceC18280f.getStart()).floatValue() : 0.0f)) {
            i13 = AbstractC22210f.f86418F;
        } else if (strain > 20.899999618530273d) {
            i13 = AbstractC22210f.f86532y;
        } else {
            InterfaceC18280f interfaceC18280f2 = this.optimalRange;
            i13 = strain > ((double) (interfaceC18280f2 != null ? ((Number) interfaceC18280f2.mo52651d()).floatValue() : Float.MAX_VALUE)) ? AbstractC22210f.f86412C : AbstractC22210f.f86410B;
        }
        String string = context.getString(i13);
        AbstractC22676k.m65749i(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final double getPickedStrainGoal() {
        return this.pickedStrainGoal;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final b getStrainCoachState() {
        return this.strainCoachState;
    }

    /* JADX INFO: renamed from: m */
    public final String m24139m(Context context) {
        int i13;
        AbstractC22676k.m65750j(context, "context");
        InterfaceC18280f interfaceC18280fM24123j = m24123j();
        if (interfaceC18280fM24123j == null) {
            double d3 = this.pickedStrainGoal;
            if (d3 == 0.0d) {
                i13 = AbstractC22210f.f86420G;
            } else if (0.0d <= d3 && d3 <= 6.0d) {
                i13 = AbstractC22210f.f86416E;
            } else if (0.0d <= d3 && d3 <= 10.0d) {
                i13 = AbstractC22210f.f86535z;
            } else if (0.0d <= d3 && d3 <= 14.0d) {
                i13 = AbstractC22210f.f86407A;
            } else if (0.0d > d3 || d3 > 18.0d) {
                i13 = (0.0d > d3 || d3 > 20.899999618530273d) ? AbstractC22210f.f86532y : AbstractC22210f.f86529x;
            } else {
                i13 = AbstractC22210f.f86422H;
            }
        } else {
            float fFloatValue = ((Number) interfaceC18280fM24123j.getStart()).floatValue();
            float fFloatValue2 = ((Number) interfaceC18280fM24123j.mo52651d()).floatValue();
            double d14 = this.pickedStrainGoal;
            if (d14 == 0.0d) {
                i13 = AbstractC22210f.f86420G;
            } else if (1.401298464324817E-45d <= d14 && d14 <= fFloatValue) {
                i13 = AbstractC22210f.f86418F;
            } else if (fFloatValue > d14 || d14 > fFloatValue2) {
                i13 = (((double) fFloatValue2) > d14 || d14 > 20.899999618530273d) ? AbstractC22210f.f86532y : AbstractC22210f.f86412C;
            } else {
                i13 = AbstractC22210f.f86410B;
            }
        }
        String string = context.getString(i13);
        AbstractC22676k.m65749i(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: n */
    public final void m24140n(C29021j mapper, CycleMetadataResponseDto cycleMetadata) {
        AbstractC22676k.m65750j(mapper, "mapper");
        if (cycleMetadata != null) {
            StrainDataDto strain = cycleMetadata.getCycleMetadata().getStrain();
            this.currentDayStrain = strain != null ? strain.getScaledStrain() : f29035D;
            SleepDataDto sleep = cycleMetadata.getCycleMetadata().getSleep();
            Integer numValueOf = sleep != null ? Integer.valueOf(sleep.getRecoveryScore()) : null;
            this.currentRecoveryScore = numValueOf;
            this.currentRecoveryPct = numValueOf != null ? Float.valueOf(numValueOf.intValue() / 100.0f) : null;
            this.isCurrentlyBlackedOut = cycleMetadata.getStealthModeEnabled();
        }
        Integer num = this.currentRecoveryScore;
        if (num != null && !this.isCurrentlyBlackedOut) {
            this.pickedStrainMapping = mapper.m88256a(num.intValue(), this.currentDayStrain);
            this.pickedStrainMappingForCoachingLanding = mapper.m88257c(num.intValue(), this.currentDayStrain);
            StrainRecoveryMapping strainRecoveryMapping = this.pickedStrainMapping;
            if (strainRecoveryMapping != null) {
                this.optimalGoal = (float) strainRecoveryMapping.getRecStrain();
                InterfaceC18280f recStrainPercentRange = strainRecoveryMapping.getRecStrainPercentRange();
                C18279e c18279e = new C18279e(((Number) recStrainPercentRange.getStart()).floatValue() * 21.0f, ((Number) recStrainPercentRange.mo52651d()).floatValue() * 21.0f);
                if (this.optimalGoal <= 0.0f) {
                    this.dayStrainAlreadyExceeded = true;
                }
                this.optimalRange = c18279e;
            }
        }
        if (this.currentRecoveryCount < f29034C) {
            m24128C(b.LOCKED);
            TextView textView = this.coachLockedText;
            if (textView != null) {
                textView.setText(this.context.getString(AbstractC22210f.f86409A1));
            }
            this.optimalGoal = 0.0f;
        }
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getIsCurrentlyBlackedOut() {
        return this.isCurrentlyBlackedOut;
    }

    /* JADX INFO: renamed from: p */
    public final void m24142p(View view) {
        AbstractC22676k.m65750j(view, "view");
        this.strainCoachBottomSheet = view;
    }

    /* JADX INFO: renamed from: q */
    public final void m24143q(TextView view) {
        AbstractC22676k.m65750j(view, "view");
        this.coachLockedText = view;
    }

    /* JADX INFO: renamed from: r */
    public final void m24144r(ImageButton button) {
        AbstractC22676k.m65750j(button, "button");
        this.lockedHelpButton = button;
    }

    /* JADX INFO: renamed from: s */
    public final void m24145s(View view) {
        AbstractC22676k.m65750j(view, "view");
        this.lockedViewContainer = view;
    }

    /* JADX INFO: renamed from: t */
    public final void m24146t(View dial) {
        AbstractC22676k.m65750j(dial, "dial");
        this.miniDialContainer = dial;
    }

    /* JADX INFO: renamed from: u */
    public final void m24147u(WhoopSwitch whoopSwitch) {
        AbstractC22676k.m65750j(whoopSwitch, "switch");
        this.coachSwitch = whoopSwitch;
    }

    /* JADX INFO: renamed from: v */
    public final void m24148v(StrainCoachGoalPicker picker) {
        AbstractC22676k.m65750j(picker, "picker");
        this.goalPicker = picker;
        C40588d<Float> c40588dM24196A = picker.m24196A();
        if (c40588dM24196A != null) {
            c40588dM24196A.m122661K(new C27566m0(new C26944e0(this, 12), 7));
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m24149y(View view) {
        AbstractC22676k.m65750j(view, "view");
        this.unlockedViewContainer = view;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final C24082e getEstimatedDayStrainSubject() {
        return this.estimatedDayStrainSubject;
    }
}
