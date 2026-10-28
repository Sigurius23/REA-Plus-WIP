package com.whoop.coaching.sleepcoach.wizard;

import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1630u0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.local.room.entity.SmartAlarmUserInfo;
import com.whoop.data.remote.domain.dto.SmartAlarmGoalType;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.sleep.coach.data.network.model.FormattedTimeInBed;
import com.whoop.sleep.coach.data.network.model.HarvardSleepAdviceDto;
import com.whoop.sleep.coach.data.network.model.NeedBreakdownFormatted;
import com.whoop.sleep.coach.data.network.model.OptimalEndpointsFormatted;
import com.whoop.sleep.coach.data.network.model.RecommendedTimeInBedFormatted;
import ec3.InterfaceC13062m;
import f93.InterfaceC14292d;
import hj0.AbstractC17356o;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import j93.InterfaceC21493z;
import jp0.InterfaceC21847a;
import kp0.AbstractC22734a;
import kp0.AbstractC22748o;
import kp0.C22736c;
import kp0.C22737d;
import kp0.C22739f;
import kp0.C22740g;
import kp0.C22744k;
import kp0.C22745l;
import kp0.C22746m;
import kp0.C22747n;
import kp0.C22750q;
import kp0.C22751r;
import l83.C23454a0;
import l83.C23465k;
import lp0.C24641l;
import m83.AbstractC25247g0;
import mp0.AbstractC25855t0;
import mp0.C25838l;
import mp0.EnumC25817b;
import mp0.EnumC25842n;
import or2.C28180m;
import org.joda.time.DateTime;
import org.joda.time.IllegalInstantException;
import org.joda.time.Instant;
import org.joda.time.LocalTime;
import org.joda.time.ReadableInstant;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qe2.AbstractC30314g;
import qf2.C30327f;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tf2.AbstractC33767a;
import tr2.InterfaceC34116n;
import z82.C40191e;

/* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b#\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0016J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0016J\r\u0010\u001a\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u0016J\u0015\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0014¢\u0006\u0004\b\u001f\u0010\u0016J\u001d\u0010$\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J%\u0010(\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 2\u0006\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020\"¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0014H\u0002¢\u0006\u0004\b*\u0010\u0016J\u0019\u0010-\u001a\u00020\u00142\b\u0010,\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\b-\u0010.J\u001f\u00102\u001a\u00020\u00142\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020+H\u0002¢\u0006\u0004\b2\u00103J/\u00106\u001a\u00020\u00142\u0006\u00100\u001a\u00020/2\n\b\u0002\u00101\u001a\u0004\u0018\u00010+2\n\b\u0002\u00105\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u0002092\u0006\u00108\u001a\u00020+H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020<2\u0006\u00108\u001a\u00020+H\u0002¢\u0006\u0004\b=\u0010>J\u001f\u0010@\u001a\u0002092\u0006\u0010?\u001a\u0002092\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b@\u0010AJ\u001f\u0010B\u001a\u0002092\u0006\u0010?\u001a\u0002092\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\bB\u0010AJ\u001f\u0010C\u001a\u0002092\u0006\u0010?\u001a\u0002092\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\bC\u0010AJ)\u0010J\u001a\u00020D2\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020F2\b\b\u0002\u0010I\u001a\u00020HH\u0002¢\u0006\u0004\bJ\u0010KJ\u001f\u0010N\u001a\u00020M2\u0006\u00100\u001a\u00020/2\u0006\u0010L\u001a\u00020<H\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010R\u001a\u00020\"2\u0006\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\bR\u0010SJ3\u0010X\u001a\u00020D2\u0006\u0010T\u001a\u00020F2\u0006\u0010U\u001a\u00020D2\b\u0010V\u001a\u0004\u0018\u00010D2\b\u0010W\u001a\u0004\u0018\u00010DH\u0002¢\u0006\u0004\bX\u0010YJ\u001f\u0010[\u001a\u00020Z2\u0006\u00100\u001a\u00020/2\u0006\u0010L\u001a\u00020<H\u0002¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020\u0014H\u0002¢\u0006\u0004\b]\u0010\u0016J\u0019\u0010_\u001a\u00020<2\b\u0010^\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\b_\u0010>R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u001d\u0010s\u001a\b\u0012\u0004\u0012\u0002090n8\u0006¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u0018\u0010v\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u001a\u0010|\u001a\u00020w8\u0016X\u0096D¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R/\u0010?\u001a\u0002092\u0006\u0010}\u001a\u0002098B@BX\u0082\u008e\u0002¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R \u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u0002090n8\u0006¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010p\u001a\u0005\b\u0085\u0001\u0010rR \u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020 0n8\u0006¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010p\u001a\u0005\b\u0088\u0001\u0010rR\u001b\u0010\u008c\u0001\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R2\u00101\u001a\u0004\u0018\u00010+2\b\u0010}\u001a\u0004\u0018\u00010+8B@BX\u0082\u008e\u0002¢\u0006\u0015\n\u0004\bJ\u0010\u007f\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0005\b\u008f\u0001\u0010.R \u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020+0n8\u0006¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010p\u001a\u0005\b\u0091\u0001\u0010rR\u0018\u0010\u0094\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010\u001dR\u0019\u0010\u0095\u0001\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010uR\u0015\u0010\u0096\u0001\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u001f\u0010\u0099\u0001\u001a\u000b \u0097\u0001*\u0004\u0018\u00010H0H8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b6\u0010\u0098\u0001¨\u0006\u009a\u0001"}, m65681d2 = {"Lcom/whoop/coaching/sleepcoach/wizard/h;", "Lhj0/o;", "Lcom/whoop/coaching/sleepcoach/wizard/b;", "conductorRepository", "Lqf2/f;", "smartAlarmRepository", "Ljp0/a;", "harvardSleepCoachRepository", "Lrr2/c;", "crashReporter", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lz82/e;", "eventDispatcher", "Ltr2/n;", "logger", "Lbc3/c0;", "coroutineScope", "<init>", "(Lcom/whoop/coaching/sleepcoach/wizard/b;Lqf2/f;Ljp0/a;Lrr2/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Lz82/e;Ltr2/n;Lbc3/c0;)V", "Ll83/a0;", "onCleared", "()V", "m0", "x0", "o0", "j0", "Lmp0/n;", "lowBatteryPopUpDismissEvent", "Z", "(Lmp0/n;)V", "W", "Lcom/whoop/coaching/sleepcoach/wizard/c;", "lowBatteryPopState", "", "isPopUpVisible", "q0", "(Lcom/whoop/coaching/sleepcoach/wizard/c;Z)V", "isPopUpDismissied", "isViewBeenShowing", "r0", "(Lcom/whoop/coaching/sleepcoach/wizard/c;ZZ)V", "n0", "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;", "smartAlarmuserInfo", "y0", "(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;)V", "Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;", "sleepAdviceDto", "smartAlarmUserInfo", "Y", "(Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;)V", "Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;", "smartAlarmCurrentViewState", "X", "(Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;)V", "userInfo", "Lcom/whoop/coaching/sleepcoach/wizard/g;", "z0", "(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;)Lcom/whoop/coaching/sleepcoach/wizard/g;", "Lkp0/a;", "V", "(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;)Lkp0/a;", "viewState", "s0", "(Lcom/whoop/coaching/sleepcoach/wizard/g;Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;)Lcom/whoop/coaching/sleepcoach/wizard/g;", "u0", "t0", "Lorg/joda/time/LocalTime;", "wakeUpTime", "", "sleepTime", "Lorg/joda/time/DateTime;", "now", "S", "(Lorg/joda/time/LocalTime;ILorg/joda/time/DateTime;)Lorg/joda/time/LocalTime;", "alarmType", "Lkp0/g;", "b0", "(Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;Lkp0/a;)Lkp0/g;", "Llp0/l;", "tonightsSleepWindow", "l0", "(Llp0/l;)Z", "alarmWakeWindowMinutes", "alarmWakeWindowEnd", "sleepCoachOptimalWindowStart", "sleepCoachOptimalWindowEnd", "p0", "(ILorg/joda/time/LocalTime;Lorg/joda/time/LocalTime;Lorg/joda/time/LocalTime;)Lorg/joda/time/LocalTime;", "Lmp0/l;", "d0", "(Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;Lkp0/a;)Lmp0/l;", "k0", "smartAlarmInfo", "c0", "E", "Lcom/whoop/coaching/sleepcoach/wizard/b;", "F", "Lqf2/f;", "G", "Ljp0/a;", "H", "Lrr2/c;", "I", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "J", "Lz82/e;", "K", "Ltr2/n;", "Landroidx/lifecycle/p0;", "L", "Landroidx/lifecycle/p0;", "e0", "()Landroidx/lifecycle/p0;", "loadSleepGraphDto", "M", "Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;", "uiUpdate", "", "N", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "logTag", "<set-?>", "O", "Lf93/d;", "getViewState", "()Lcom/whoop/coaching/sleepcoach/wizard/g;", "w0", "(Lcom/whoop/coaching/sleepcoach/wizard/g;)V", "P", "i0", "viewStateLiveData", "Q", "f0", "lowBatteryPopUpLiveData", "R", "Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;", "sleepAdvice", "g0", "()Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;", "v0", "T", "h0", "smartAlarmUserInfoLiveData", "U", "shouldPullFromCache", "currentUserInput", "isWeeklyPlanSleepPlannerV2FFOn", "kotlin.jvm.PlatformType", "Lorg/joda/time/DateTime;", "referenceDate", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C6246h extends AbstractC17356o {

    /* JADX INFO: renamed from: Y */
    static final /* synthetic */ InterfaceC21493z[] f24670Y;

    /* JADX INFO: renamed from: Z */
    public static final int f24671Z;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C6240b conductorRepository;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C30327f smartAlarmRepository;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC21847a harvardSleepCoachRepository;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final C40191e eventDispatcher;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final AbstractC1615p0 loadSleepGraphDto;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private ConductorViewState uiUpdate;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final InterfaceC14292d viewState;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final AbstractC1615p0 viewStateLiveData;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final AbstractC1615p0 lowBatteryPopUpLiveData;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private HarvardSleepAdviceDto sleepAdvice;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private final InterfaceC14292d smartAlarmUserInfo;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private final AbstractC1615p0 smartAlarmUserInfoLiveData;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private boolean shouldPullFromCache;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private ConductorViewState currentUserInput;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private final boolean isWeeklyPlanSleepPlannerV2FFOn;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private final DateTime referenceDate;

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.h$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f24692a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f24693b;

        static {
            int[] iArr = new int[SmartAlarmGoalType.values().length];
            try {
                iArr[SmartAlarmGoalType.EXACT_TIME_GET_BY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SmartAlarmGoalType.EXACT_TIME_PERFORM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SmartAlarmGoalType.EXACT_TIME_PEAK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SmartAlarmGoalType.EXACT_TIME_WEEKLY_PLAN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SmartAlarmGoalType.EXACT_TIME_SLEEP_HOURS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SmartAlarmGoalType.SLEEP_HEALTH_GET_BY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SmartAlarmGoalType.SLEEP_HEALTH_PERFORM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SmartAlarmGoalType.SLEEP_HEALTH_PEAK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SmartAlarmGoalType.IN_THE_GREEN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SmartAlarmGoalType.EXACT_TIME_OPTIMIZE_SLEEP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f24692a = iArr;
            int[] iArr2 = new int[EnumC25842n.values().length];
            try {
                iArr2[EnumC25842n.CLOSE_EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[EnumC25842n.LOW_BATTERY_INDICATOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            f24693b = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.h$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.wizard.TonightsSleepContainerViewModel$initSmartAlarmSettingsData$1", m100430f = "TonightsSleepContainerViewModel.kt", m100431l = {603, 606}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f24694w;

        /* JADX INFO: renamed from: x */
        int f24695x;

        /* JADX INFO: renamed from: y */
        int f24696y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C6246h.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0094  */
        /* JADX WARN: Code duplicated, block: B:28:0x0099  */
        /* JADX WARN: Code duplicated, block: B:31:0x009e  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:37:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:38:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:40:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:49:0x00e5  */
        /* JADX WARN: Code duplicated, block: B:50:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:53:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:54:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:58:0x0119  */
        /* JADX WARN: Code duplicated, block: B:59:0x011b  */
        /* JADX WARN: Code duplicated, block: B:61:0x011e  */
        /* JADX WARN: Code duplicated, block: B:62:0x0120  */
        /* JADX WARN: Code duplicated, block: B:65:0x0129  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v21 */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C6246h c6246h;
            Object objM92680l;
            Object objM92678j;
            int i13;
            AbstractC22734a abstractC22734a;
            int windowMinutes;
            AbstractC22734a abstractC22734a2;
            ?? r10;
            SmartAlarmUserInfo smartAlarmUserInfoM18744g0;
            boolean scheduleEnabled;
            SmartAlarmUserInfo smartAlarmUserInfoM18744g1;
            boolean scheduleEnabled2;
            boolean z4;
            boolean z13;
            boolean z14;
            boolean z15;
            SmartAlarmUserInfo smartAlarmUserInfoM18744g2;
            boolean scheduleEnabled3;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.f24696y;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                c6246h = C6246h.this;
                C30327f c30327f = c6246h.smartAlarmRepository;
                this.f24694w = c6246h;
                this.f24696y = 1;
                objM92680l = c30327f.m92680l(this);
                if (objM92680l != enumC31071a) {
                }
                return enumC31071a;
            }
            if (i14 == 1) {
                c6246h = (C6246h) this.f24694w;
                AbstractC34132o.m107864I(obj);
                objM92680l = obj;
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.f24695x;
                abstractC22734a = (AbstractC22734a) this.f24694w;
                AbstractC34132o.m107864I(obj);
                objM92678j = obj;
            }
            abstractC22734a2 = abstractC22734a;
            windowMinutes = ((Number) objM92678j).intValue();
            r10 = i13;
            smartAlarmUserInfoM18744g0 = C6246h.this.m18744g0();
            if (smartAlarmUserInfoM18744g0 != null) {
                scheduleEnabled = smartAlarmUserInfoM18744g0.getScheduleEnabled();
            } else {
                scheduleEnabled = false;
            }
            if (abstractC22734a2 instanceof C22736c) {
                C6246h c6246h2 = C6246h.this;
                if (r10 != 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                smartAlarmUserInfoM18744g2 = c6246h2.m18744g0();
                if (smartAlarmUserInfoM18744g2 != null) {
                    scheduleEnabled3 = smartAlarmUserInfoM18744g2.getScheduleEnabled();
                } else {
                    scheduleEnabled3 = false;
                }
                c6246h2.m18754w0(new C6245g(abstractC22734a2, 0, z15, null, null, null, null, null, null, false, scheduleEnabled3, MessageListItemViewType.POLL, null));
            } else {
                if ((abstractC22734a2 instanceof C22747n) && !(abstractC22734a2 instanceof C22739f)) {
                    throw new NoWhenBranchMatchedException();
                }
                C6246h c6246h3 = C6246h.this;
                smartAlarmUserInfoM18744g1 = c6246h3.m18744g0();
                if (smartAlarmUserInfoM18744g1 != null) {
                    scheduleEnabled2 = smartAlarmUserInfoM18744g1.getScheduleEnabled();
                } else {
                    scheduleEnabled2 = false;
                }
                if (r10 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                c6246h3.m18754w0(new C6245g(abstractC22734a2, windowMinutes, z4, null, null, null, null, null, null, false, scheduleEnabled2, MessageListItemViewType.UNREAD_SEPARATOR, null));
            }
            C6240b c6240b = C6246h.this.conductorRepository;
            ConductorViewState conductorViewStateM18640r = C6246h.this.conductorRepository.m18640r();
            if (r10 != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (r10 != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            HarvardSleepAdviceDto harvardSleepAdviceDto = C6246h.this.sleepAdvice;
            c6240b.m18631B(ConductorViewState.copy$default(conductorViewStateM18640r, abstractC22734a2, abstractC22734a2, z13, z14, windowMinutes, scheduleEnabled, false, null, null, false, harvardSleepAdviceDto != null ? harvardSleepAdviceDto.getEligibleForSmartAlarms() : false, null, 3008, null));
            return C23454a0.f92919a;
            c6246h.m18752v0((SmartAlarmUserInfo) objM92680l);
            SmartAlarmUserInfo smartAlarmUserInfoM18744g3 = C6246h.this.m18744g0();
            boolean smartAlarmEnabled = smartAlarmUserInfoM18744g3 != null ? smartAlarmUserInfoM18744g3.getSmartAlarmEnabled() : false;
            C6246h c6246h4 = C6246h.this;
            AbstractC22734a abstractC22734aM18742c0 = c6246h4.m18742c0(c6246h4.m18744g0());
            SmartAlarmUserInfo smartAlarmUserInfoM18744g4 = C6246h.this.m18744g0();
            if (smartAlarmUserInfoM18744g4 == null) {
                C30327f c30327f2 = C6246h.this.smartAlarmRepository;
                this.f24694w = abstractC22734aM18742c0;
                this.f24695x = smartAlarmEnabled ? 1 : 0;
                this.f24696y = 2;
                objM92678j = c30327f2.m92678j(this);
                if (objM92678j != enumC31071a) {
                    i13 = smartAlarmEnabled ? 1 : 0;
                    abstractC22734a = abstractC22734aM18742c0;
                    abstractC22734a2 = abstractC22734a;
                    windowMinutes = ((Number) objM92678j).intValue();
                    r10 = i13;
                }
                return enumC31071a;
            }
            windowMinutes = smartAlarmUserInfoM18744g4.getWindowMinutes();
            abstractC22734a2 = abstractC22734aM18742c0;
            r10 = smartAlarmEnabled;
            smartAlarmUserInfoM18744g0 = C6246h.this.m18744g0();
            if (smartAlarmUserInfoM18744g0 != null) {
                scheduleEnabled = smartAlarmUserInfoM18744g0.getScheduleEnabled();
            } else {
                scheduleEnabled = false;
            }
            if (abstractC22734a2 instanceof C22736c) {
                C6246h c6246h5 = C6246h.this;
                if (r10 != 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                smartAlarmUserInfoM18744g2 = c6246h5.m18744g0();
                if (smartAlarmUserInfoM18744g2 != null) {
                    scheduleEnabled3 = smartAlarmUserInfoM18744g2.getScheduleEnabled();
                } else {
                    scheduleEnabled3 = false;
                }
                c6246h5.m18754w0(new C6245g(abstractC22734a2, 0, z15, null, null, null, null, null, null, false, scheduleEnabled3, MessageListItemViewType.POLL, null));
            } else {
                if (abstractC22734a2 instanceof C22747n) {
                }
                C6246h c6246h6 = C6246h.this;
                smartAlarmUserInfoM18744g1 = c6246h6.m18744g0();
                if (smartAlarmUserInfoM18744g1 != null) {
                    scheduleEnabled2 = smartAlarmUserInfoM18744g1.getScheduleEnabled();
                } else {
                    scheduleEnabled2 = false;
                }
                if (r10 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                c6246h6.m18754w0(new C6245g(abstractC22734a2, windowMinutes, z4, null, null, null, null, null, null, false, scheduleEnabled2, MessageListItemViewType.UNREAD_SEPARATOR, null));
            }
            C6240b c6240b2 = C6246h.this.conductorRepository;
            ConductorViewState conductorViewStateM18640r2 = C6246h.this.conductorRepository.m18640r();
            if (r10 != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (r10 != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            HarvardSleepAdviceDto harvardSleepAdviceDto2 = C6246h.this.sleepAdvice;
            c6240b2.m18631B(ConductorViewState.copy$default(conductorViewStateM18640r2, abstractC22734a2, abstractC22734a2, z13, z14, windowMinutes, scheduleEnabled, false, null, null, false, harvardSleepAdviceDto2 != null ? harvardSleepAdviceDto2.getEligibleForSmartAlarms() : false, null, 3008, null));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.h$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.wizard.TonightsSleepContainerViewModel$onCreate$1", m100430f = "TonightsSleepContainerViewModel.kt", m100431l = {112, 120, 134}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f24698w;

        /* JADX INFO: renamed from: x */
        int f24699x;

        /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.h$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.wizard.TonightsSleepContainerViewModel$onCreate$1$2", m100430f = "TonightsSleepContainerViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;", "it", "Ll83/a0;", "<anonymous>", "(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f24701w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f24702x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C6246h f24703y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C6246h c6246h, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f24703y = c6246h;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f24703y, interfaceC30057d);
                aVar.f24702x = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(SmartAlarmUserInfo smartAlarmUserInfo, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(smartAlarmUserInfo, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                SmartAlarmUserInfo smartAlarmUserInfo = (SmartAlarmUserInfo) this.f24702x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f24701w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                this.f24703y.m18756y0(smartAlarmUserInfo);
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.h$c$b */
        @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.wizard.TonightsSleepContainerViewModel$onCreate$1$3", m100430f = "TonightsSleepContainerViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;", "cachedAlarm", "Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;", "userInputAlarm", "Ll83/k;", "<anonymous>", "(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;)Ll83/k;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements Function3 {

            /* JADX INFO: renamed from: w */
            int f24704w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f24705x;

            /* JADX INFO: renamed from: y */
            /* synthetic */ Object f24706y;

            public b(InterfaceC30057d<? super b> interfaceC30057d) {
                super(3, interfaceC30057d);
            }

            @Override // p715kotlin.jvm.functions.Function3
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(SmartAlarmUserInfo smartAlarmUserInfo, ConductorViewState conductorViewState, InterfaceC30057d<? super C23465k> interfaceC30057d) {
                b bVar = new b(interfaceC30057d);
                bVar.f24705x = smartAlarmUserInfo;
                bVar.f24706y = conductorViewState;
                return bVar.invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                SmartAlarmUserInfo smartAlarmUserInfo = (SmartAlarmUserInfo) this.f24705x;
                ConductorViewState conductorViewState = (ConductorViewState) this.f24706y;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f24704w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return new C23465k(smartAlarmUserInfo, conductorViewState);
            }
        }

        /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.h$c$c, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41381c<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C6246h f24707w;

            public C41381c(C6246h c6246h) {
                this.f24707w = c6246h;
            }

            /* JADX WARN: Code duplicated, block: B:21:0x006f  */
            /* JADX WARN: Code duplicated, block: B:23:0x0077  */
            /* JADX WARN: Code duplicated, block: B:25:0x007f  */
            /* JADX WARN: Code duplicated, block: B:26:0x0082  */
            /* JADX WARN: Code duplicated, block: B:28:0x0085  */
            /* JADX WARN: Code duplicated, block: B:31:0x008d  */
            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(C23465k c23465k, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                AbstractC22734a currentAlarm;
                C22747n c22747n;
                ConductorViewState conductorViewState = this.f24707w.currentUserInput;
                Object obj = c23465k.f92938x;
                Object obj2 = c23465k.f92938x;
                if (!AbstractC22676k.m65745e(conductorViewState, obj)) {
                    this.f24707w.currentUserInput = (ConductorViewState) obj2;
                    HarvardSleepAdviceDto harvardSleepAdviceDto = this.f24707w.sleepAdvice;
                    if (harvardSleepAdviceDto != null) {
                        C6246h c6246h = this.f24707w;
                        ConductorViewState conductorViewStateCopy$default = (ConductorViewState) obj2;
                        if (c6246h.shouldPullFromCache) {
                            conductorViewStateCopy$default = null;
                        } else if (conductorViewStateCopy$default.getCurrentAlarm() instanceof C22747n) {
                            AbstractC22734a currentAlarm2 = conductorViewStateCopy$default.getCurrentAlarm();
                            C22747n c22747n2 = currentAlarm2 instanceof C22747n ? (C22747n) currentAlarm2 : null;
                            if ((c22747n2 != null ? c22747n2.getSleepPercent() : null) instanceof C22750q) {
                                conductorViewStateCopy$default = ConductorViewState.copy$default(conductorViewStateCopy$default, C6240b.INSTANCE.m18650b(), null, false, false, 0, false, false, null, null, false, false, null, 4094, null);
                            } else if (conductorViewStateCopy$default.getCurrentAlarm() instanceof C22747n) {
                                currentAlarm = conductorViewStateCopy$default.getCurrentAlarm();
                                if (currentAlarm instanceof C22747n) {
                                    c22747n = (C22747n) currentAlarm;
                                } else {
                                    c22747n = null;
                                }
                                if ((c22747n != null ? c22747n.getSleepPercent() : null) instanceof C22751r) {
                                    conductorViewStateCopy$default = ConductorViewState.copy$default(conductorViewStateCopy$default, C6240b.INSTANCE.m18650b(), null, false, false, 0, false, false, null, null, false, false, null, 4094, null);
                                }
                            }
                        } else if (conductorViewStateCopy$default.getCurrentAlarm() instanceof C22747n) {
                            currentAlarm = conductorViewStateCopy$default.getCurrentAlarm();
                            if (currentAlarm instanceof C22747n) {
                                c22747n = (C22747n) currentAlarm;
                            } else {
                                c22747n = null;
                            }
                            if ((c22747n != null ? c22747n.getSleepPercent() : null) instanceof C22751r) {
                                conductorViewStateCopy$default = ConductorViewState.copy$default(conductorViewStateCopy$default, C6240b.INSTANCE.m18650b(), null, false, false, 0, false, false, null, null, false, false, null, 4094, null);
                            }
                        }
                        c6246h.uiUpdate = conductorViewStateCopy$default;
                        c6246h.m18739X(harvardSleepAdviceDto, (SmartAlarmUserInfo) c23465k.f92937w, c6246h.uiUpdate);
                    }
                }
                return C23454a0.f92919a;
            }
        }

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C6246h.this.new c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0103, code lost:
        
            if (r4.collect(r11, r10) == r0) goto L28;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 265
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.coaching.sleepcoach.wizard.C6246h.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.h$d */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0006\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\b\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"com/whoop/coaching/sleepcoach/wizard/h$d", "Lf93/d;", "", "thisRef", "Lj93/z;", "property", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "value", "Ll83/a0;", "setValue", "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC14292d {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private C6245g value;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C6246h f24709x;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Object obj, C6246h c6246h) {
            this.f24709x = c6246h;
            this.value = obj;
        }

        @Override // f93.InterfaceC14291c
        public C6245g getValue(Object thisRef, InterfaceC21493z property) {
            AbstractC22676k.m65750j(property, "property");
            return this.value;
        }

        @Override // f93.InterfaceC14292d
        public void setValue(Object thisRef, InterfaceC21493z property, C6245g value) {
            AbstractC22676k.m65750j(property, "property");
            this.value = value;
            C6246h c6246h = this.f24709x;
            c6246h.m49140v(c6246h.getViewStateLiveData(), value);
        }
    }

    /* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.h$e */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0006\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\b\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"com/whoop/coaching/sleepcoach/wizard/h$e", "Lf93/d;", "", "thisRef", "Lj93/z;", "property", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "value", "Ll83/a0;", "setValue", "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC14292d {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private SmartAlarmUserInfo value;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C6246h f24711x;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Object obj, C6246h c6246h) {
            this.f24711x = c6246h;
            this.value = obj;
        }

        @Override // f93.InterfaceC14291c
        public SmartAlarmUserInfo getValue(Object thisRef, InterfaceC21493z property) {
            AbstractC22676k.m65750j(property, "property");
            return this.value;
        }

        @Override // f93.InterfaceC14292d
        public void setValue(Object thisRef, InterfaceC21493z property, SmartAlarmUserInfo value) {
            AbstractC22676k.m65750j(property, "property");
            this.value = value;
            C6246h c6246h = this.f24711x;
            c6246h.m49140v(c6246h.getSmartAlarmUserInfoLiveData(), value);
        }
    }

    static {
        C22686q c22686q = new C22686q(C6246h.class, "viewState", "getViewState()Lcom/whoop/coaching/sleepcoach/wizard/SleepGraphViewState;", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f24670Y = new InterfaceC21493z[]{c22673i0.mutableProperty1(c22686q), AbstractC11895b.m31990i(C6246h.class, "smartAlarmUserInfo", "getSmartAlarmUserInfo()Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;", 0, c22673i0)};
        f24671Z = 8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6246h(C6240b conductorRepository, C30327f smartAlarmRepository, InterfaceC21847a harvardSleepCoachRepository, InterfaceC31766c crashReporter, FeatureFlagChecker featureFlagChecker, C40191e eventDispatcher, InterfaceC34116n logger, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(conductorRepository, "conductorRepository");
        AbstractC22676k.m65750j(smartAlarmRepository, "smartAlarmRepository");
        AbstractC22676k.m65750j(harvardSleepCoachRepository, "harvardSleepCoachRepository");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(eventDispatcher, "eventDispatcher");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.conductorRepository = conductorRepository;
        this.smartAlarmRepository = smartAlarmRepository;
        this.harvardSleepCoachRepository = harvardSleepCoachRepository;
        this.crashReporter = crashReporter;
        this.featureFlagChecker = featureFlagChecker;
        this.eventDispatcher = eventDispatcher;
        this.logger = logger;
        this.loadSleepGraphDto = new C1630u0();
        this.logTag = "TonightsSleepContainerViewModel";
        this.viewState = new d(new C6245g(null, 0, false, null, null, null, null, null, null, false, false, 2047, null), this);
        this.viewStateLiveData = new C1630u0();
        this.lowBatteryPopUpLiveData = conductorRepository.m18634l();
        this.smartAlarmUserInfo = new e(null, this);
        this.smartAlarmUserInfoLiveData = new C1630u0();
        this.shouldPullFromCache = true;
        this.isWeeklyPlanSleepPlannerV2FFOn = featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_SLEEP_PLANER_V2);
        this.referenceDate = new DateTime(0L).plusYears(30);
    }

    /* JADX INFO: renamed from: S */
    private final LocalTime m18736S(LocalTime wakeUpTime, int sleepTime, DateTime now) {
        DateTime dateTimeM106769a;
        try {
            dateTimeM106769a = AbstractC33767a.m106769a(wakeUpTime, now);
        } catch (IllegalArgumentException e5) {
            if (!IllegalInstantException.isIllegalInstant(e5)) {
                throw e5;
            }
            this.crashReporter.mo98626g(e5, "Server told us an illegal wake time " + wakeUpTime + " for tz " + now.getZone());
            dateTimeM106769a = null;
        }
        if (dateTimeM106769a != null) {
            LocalTime localTime = dateTimeM106769a.minusMillis(sleepTime).toLocalTime();
            AbstractC22676k.m65747g(localTime);
            return localTime;
        }
        LocalTime localTimeMinusMillis = wakeUpTime.minusMillis(sleepTime);
        AbstractC22676k.m65747g(localTimeMinusMillis);
        return localTimeMinusMillis;
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ LocalTime m18737U(C6246h c6246h, LocalTime localTime, int i13, DateTime dateTime, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            dateTime = DateTime.now();
            AbstractC22676k.m65749i(dateTime, "now(...)");
        }
        return c6246h.m18736S(localTime, i13, dateTime);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: V */
    private final AbstractC22734a m18738V(SmartAlarmUserInfo userInfo) {
        LocalTime upperBoundLocalTime = userInfo.getUpperBoundLocalTime();
        String goalType = userInfo.getGoal().getGoalType();
        switch (goalType.hashCode()) {
            case -1994483947:
                if (goalType.equals("EXACT_TIME_WEEKLY_PLAN")) {
                    Integer weeklyPlanGoal = userInfo.getWeeklyPlanGoal();
                    return new C22736c(upperBoundLocalTime, new C22750q(weeklyPlanGoal != null ? weeklyPlanGoal.intValue() : 0));
                }
                break;
            case -1905802670:
                if (goalType.equals("EXACT_TIME_GET_BY")) {
                    return new C22736c(upperBoundLocalTime, C22737d.f89416z);
                }
                break;
            case -1686629967:
                if (goalType.equals("EXACT_TIME_PEAK")) {
                    return new C22736c(upperBoundLocalTime, C22745l.f89475z);
                }
                break;
            case -1421213862:
                if (goalType.equals("SLEEP_HEALTH_PEAK")) {
                    return new C22747n(upperBoundLocalTime, C22745l.f89475z);
                }
                break;
            case -1119630041:
                if (goalType.equals("EXACT_TIME_OPTIMIZE_SLEEP")) {
                    return new C22736c(upperBoundLocalTime, new C22744k(AbstractC30314g.f124308f));
                }
                break;
            case -243996229:
                if (goalType.equals("SLEEP_HEALTH_GET_BY")) {
                    return new C22747n(upperBoundLocalTime, C22737d.f89416z);
                }
                break;
            case -57026853:
                if (goalType.equals("IN_THE_GREEN")) {
                    return new C22739f(upperBoundLocalTime);
                }
                break;
            case 421070566:
                if (goalType.equals("SLEEP_HEALTH_PERFORM")) {
                    return new C22747n(upperBoundLocalTime, C22746m.f89477z);
                }
                break;
            case 444678447:
                if (goalType.equals("EXACT_TIME_PERFORM")) {
                    return new C22736c(upperBoundLocalTime, C22746m.f89477z);
                }
                break;
            case 1356360277:
                if (goalType.equals("EXACT_TIME_SLEEP_HOURS")) {
                    String weeklyPlanHourGoal = userInfo.getWeeklyPlanHourGoal();
                    if (weeklyPlanHourGoal == null) {
                        weeklyPlanHourGoal = "";
                    }
                    return new C22736c(upperBoundLocalTime, new C22751r(weeklyPlanHourGoal));
                }
                break;
        }
        return new C22736c(upperBoundLocalTime, C22746m.f89477z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public final void m18739X(HarvardSleepAdviceDto sleepAdviceDto, SmartAlarmUserInfo smartAlarmUserInfo, ConductorViewState smartAlarmCurrentViewState) {
        C6245g c6245g;
        C6245g c6245gM18750t0;
        if (smartAlarmUserInfo != null && smartAlarmCurrentViewState != null) {
            c6245g = new C6245g(smartAlarmCurrentViewState.getCurrentAlarm(), smartAlarmUserInfo.getWindowMinutes(), smartAlarmCurrentViewState.getCurrentSelectedAlarm(), null, null, null, null, null, null, false, smartAlarmUserInfo.getScheduleEnabled(), MessageListItemViewType.UNREAD_SEPARATOR, null);
        } else if (smartAlarmUserInfo == null || smartAlarmCurrentViewState != null) {
            ConductorViewState conductorViewStateM18640r = this.conductorRepository.m18640r();
            c6245g = new C6245g(conductorViewStateM18640r.getCurrentAlarm(), 0, conductorViewStateM18640r.getCurrentSelectedAlarm(), null, null, null, null, null, null, false, conductorViewStateM18640r.getScheduleEnabled(), MessageListItemViewType.POLL, null);
        } else {
            c6245g = m18758z0(smartAlarmUserInfo);
        }
        AbstractC22734a alarmType = c6245g.getAlarmType();
        if (alarmType instanceof C22736c) {
            c6245gM18750t0 = m18749s0(c6245g, sleepAdviceDto);
        } else if (alarmType instanceof C22747n) {
            c6245gM18750t0 = m18751u0(c6245g, sleepAdviceDto);
        } else {
            if (!(alarmType instanceof C22739f)) {
                throw new NoWhenBranchMatchedException();
            }
            c6245gM18750t0 = m18750t0(c6245g, sleepAdviceDto);
        }
        m18754w0(c6245gM18750t0);
        m49138t(this.loadSleepGraphDto, c6245gM18750t0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public final void m18740Y(HarvardSleepAdviceDto sleepAdviceDto, SmartAlarmUserInfo smartAlarmUserInfo) {
        C6245g c6245gM18750t0;
        C6245g c6245gM18758z0 = m18758z0(smartAlarmUserInfo);
        AbstractC22734a alarmType = c6245gM18758z0.getAlarmType();
        if (alarmType instanceof C22736c) {
            c6245gM18750t0 = m18749s0(c6245gM18758z0, sleepAdviceDto);
        } else if (alarmType instanceof C22747n) {
            c6245gM18750t0 = m18751u0(c6245gM18758z0, sleepAdviceDto);
        } else {
            if (!(alarmType instanceof C22739f)) {
                throw new NoWhenBranchMatchedException();
            }
            c6245gM18750t0 = m18750t0(c6245gM18758z0, sleepAdviceDto);
        }
        m49138t(this.loadSleepGraphDto, c6245gM18750t0);
    }

    /* JADX INFO: renamed from: b0 */
    private final C22740g m18741b0(HarvardSleepAdviceDto sleepAdviceDto, AbstractC22734a alarmType) {
        int i13;
        C25838l c25838lM18743d0 = m18743d0(sleepAdviceDto, alarmType);
        if (!this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_SLEEP_PLANER_V2) || !this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.SLEEP_PLANNER_CEREAL_BOX)) {
            i13 = alarmType.m65814a() instanceof C22751r ? AbstractC30314g.f124276R0 : AbstractC30314g.f124274Q0;
        } else if (!(alarmType instanceof C22747n) || (((C22747n) alarmType).getSleepPercent() instanceof C22750q)) {
            boolean z4 = alarmType instanceof C22736c;
            if (z4 && (((C22736c) alarmType).getSleepPercent() instanceof C22750q)) {
                i13 = AbstractC30314g.f124283V;
            } else if (z4 && (((C22736c) alarmType).getSleepPercent() instanceof C22751r)) {
                i13 = AbstractC30314g.f124279T;
            } else {
                i13 = (z4 && (((C22736c) alarmType).getSleepPercent() instanceof C22744k)) ? AbstractC30314g.f124277S : AbstractC30314g.f124281U;
            }
        } else {
            i13 = AbstractC30314g.f124281U;
        }
        int i14 = i13;
        String percentageGoal = c25838lM18743d0.getPercentageGoal();
        String percentage = alarmType.m65814a() instanceof C22751r ? "" : c25838lM18743d0.getPercentage();
        NeedBreakdownFormatted needBreakdownFormatted = sleepAdviceDto.getNeedBreakdownFormatted();
        String totalNeed = needBreakdownFormatted.getTotalNeed();
        String baselineNeed = needBreakdownFormatted.getBaselineNeed();
        String strainNeed = needBreakdownFormatted.getStrainNeed();
        String debtNeed = needBreakdownFormatted.getDebtNeed();
        String napsNeed = needBreakdownFormatted.getNapsNeed();
        String awakeTime = c25838lM18743d0.getAwakeTime();
        String recommendedTimeInBed = c25838lM18743d0.getRecommendedTimeInBed();
        boolean z13 = alarmType instanceof C22736c;
        return new C22740g(totalNeed, baselineNeed, strainNeed, debtNeed, napsNeed, percentage, i14, percentageGoal, awakeTime, recommendedTimeInBed, (z13 && (((C22736c) alarmType).getSleepPercent() instanceof C22744k)) || (z13 && (((C22736c) alarmType).getSleepPercent() instanceof C22750q)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public final AbstractC22734a m18742c0(SmartAlarmUserInfo smartAlarmInfo) {
        if (smartAlarmInfo == null) {
            return C6240b.INSTANCE.m18650b();
        }
        LocalTime upperBoundLocalTime = smartAlarmInfo.getUpperBoundLocalTime();
        switch (a.f24692a[smartAlarmInfo.getGoal().ordinal()]) {
            case 1:
                return new C22736c(upperBoundLocalTime, C22737d.f89416z);
            case 2:
                return new C22736c(upperBoundLocalTime, C22746m.f89477z);
            case 3:
                return new C22736c(upperBoundLocalTime, C22745l.f89475z);
            case 4:
                Integer weeklyPlanGoal = smartAlarmInfo.getWeeklyPlanGoal();
                return new C22736c(upperBoundLocalTime, new C22750q(weeklyPlanGoal != null ? weeklyPlanGoal.intValue() : 0));
            case 5:
                String weeklyPlanHourGoal = smartAlarmInfo.getWeeklyPlanHourGoal();
                if (weeklyPlanHourGoal == null) {
                    weeklyPlanHourGoal = "";
                }
                return new C22736c(upperBoundLocalTime, new C22751r(weeklyPlanHourGoal));
            case 6:
                return new C22747n(upperBoundLocalTime, C22737d.f89416z);
            case 7:
                return new C22747n(upperBoundLocalTime, C22746m.f89477z);
            case 8:
                return new C22747n(upperBoundLocalTime, C22745l.f89475z);
            case 9:
                return new C22739f(upperBoundLocalTime);
            case 10:
                return new C22736c(upperBoundLocalTime, new C22744k(AbstractC30314g.f124308f));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: d0 */
    private final C25838l m18743d0(HarvardSleepAdviceDto sleepAdviceDto, AbstractC22734a alarmType) {
        String sleepAdjustmentTimeString;
        String estimatedAwakeTimeString;
        String recommendedTimeInBedTimeString;
        String sleepAdjustmentTimeString2;
        String estimatedAwakeTimeString2;
        String recommendedTimeInBedTimeString2;
        String sleepNeedTimeString;
        String estimatedAwakeTimeString3;
        String recommendedTimeInBedTimeString3;
        String sleepAdjustmentTimeString3;
        String estimatedAwakeTimeString4;
        String recommendedTimeInBedTimeString4;
        FormattedTimeInBed peak = sleepAdviceDto.getRecommendedTimeInBedFormatted().getPeak();
        FormattedTimeInBed perform = sleepAdviceDto.getRecommendedTimeInBedFormatted().getPerform();
        FormattedTimeInBed getBy = sleepAdviceDto.getRecommendedTimeInBedFormatted().getGetBy();
        FormattedTimeInBed optimizeSleep = this.isWeeklyPlanSleepPlannerV2FFOn ? sleepAdviceDto.getRecommendedTimeInBedFormatted().getOptimizeSleep() : sleepAdviceDto.getRecommendedTimeInBedFormatted().getWeeklyPlan();
        FormattedTimeInBed hoursOfSleep = sleepAdviceDto.getRecommendedTimeInBedFormatted().getHoursOfSleep();
        FormattedTimeInBed optimizeSleep2 = sleepAdviceDto.getRecommendedTimeInBedFormatted().getOptimizeSleep();
        String str = "";
        if (!(alarmType instanceof C22736c)) {
            if (alarmType instanceof C22739f) {
                return new C25838l(C22745l.f89475z.getValue() + "%", peak.getSleepNeedTimeString(), peak.getEstimatedAwakeTimeString(), peak.getRecommendedTimeInBedTimeString());
            }
            if (!(alarmType instanceof C22747n)) {
                throw new NoWhenBranchMatchedException();
            }
            C22747n c22747n = (C22747n) alarmType;
            AbstractC22748o sleepPercent = c22747n.getSleepPercent();
            C22745l c22745l = C22745l.f89475z;
            if (AbstractC22676k.m65745e(sleepPercent, c22745l)) {
                return new C25838l(c22745l.getValue() + "%", peak.getSleepNeedTimeString(), peak.getEstimatedAwakeTimeString(), peak.getRecommendedTimeInBedTimeString());
            }
            C22746m c22746m = C22746m.f89477z;
            if (AbstractC22676k.m65745e(sleepPercent, c22746m)) {
                return new C25838l(c22746m.getValue() + "%", perform.getSleepNeedTimeString(), perform.getEstimatedAwakeTimeString(), perform.getRecommendedTimeInBedTimeString());
            }
            C22737d c22737d = C22737d.f89416z;
            if (AbstractC22676k.m65745e(sleepPercent, c22737d)) {
                return new C25838l(c22737d.getValue() + "%", getBy.getSleepNeedTimeString(), getBy.getEstimatedAwakeTimeString(), getBy.getRecommendedTimeInBedTimeString());
            }
            if (sleepPercent instanceof C22744k) {
                if (optimizeSleep2 == null || (sleepAdjustmentTimeString = optimizeSleep2.getSleepAdjustmentTimeString()) == null) {
                    sleepAdjustmentTimeString = "";
                }
                if (optimizeSleep2 == null || (estimatedAwakeTimeString = optimizeSleep2.getEstimatedAwakeTimeString()) == null) {
                    estimatedAwakeTimeString = "";
                }
                if (optimizeSleep2 != null && (recommendedTimeInBedTimeString = optimizeSleep2.getRecommendedTimeInBedTimeString()) != null) {
                    str = recommendedTimeInBedTimeString;
                }
                return new C25838l("100", sleepAdjustmentTimeString, estimatedAwakeTimeString, str);
            }
            this.logger.mo85222m("Unsupported SleepGoal type: " + c22747n.getSleepPercent(), new AbstractC30556a.a[0]);
            return new C25838l(c22745l.getValue() + "%", peak.getSleepNeedTimeString(), peak.getEstimatedAwakeTimeString(), peak.getRecommendedTimeInBedTimeString());
        }
        C22736c c22736c = (C22736c) alarmType;
        AbstractC22748o sleepPercent2 = c22736c.getSleepPercent();
        C22745l c22745l2 = C22745l.f89475z;
        if (AbstractC22676k.m65745e(sleepPercent2, c22745l2)) {
            return new C25838l(c22745l2.getValue() + "%", peak.getSleepNeedTimeString(), peak.getEstimatedAwakeTimeString(), peak.getRecommendedTimeInBedTimeString());
        }
        C22746m c22746m2 = C22746m.f89477z;
        if (AbstractC22676k.m65745e(sleepPercent2, c22746m2)) {
            return new C25838l(c22746m2.getValue() + "%", perform.getSleepNeedTimeString(), perform.getEstimatedAwakeTimeString(), perform.getRecommendedTimeInBedTimeString());
        }
        C22737d c22737d2 = C22737d.f89416z;
        if (AbstractC22676k.m65745e(sleepPercent2, c22737d2)) {
            return new C25838l(c22737d2.getValue() + "%", getBy.getSleepNeedTimeString(), getBy.getEstimatedAwakeTimeString(), getBy.getRecommendedTimeInBedTimeString());
        }
        if (sleepPercent2 instanceof C22750q) {
            String str2 = ((C22750q) c22736c.getSleepPercent()).getValue() + "%";
            if (optimizeSleep == null || (sleepAdjustmentTimeString3 = optimizeSleep.getSleepAdjustmentTimeString()) == null) {
                sleepAdjustmentTimeString3 = "";
            }
            if (optimizeSleep == null || (estimatedAwakeTimeString4 = optimizeSleep.getEstimatedAwakeTimeString()) == null) {
                estimatedAwakeTimeString4 = "";
            }
            if (optimizeSleep != null && (recommendedTimeInBedTimeString4 = optimizeSleep.getRecommendedTimeInBedTimeString()) != null) {
                str = recommendedTimeInBedTimeString4;
            }
            return new C25838l(str2, sleepAdjustmentTimeString3, estimatedAwakeTimeString4, str);
        }
        if (sleepPercent2 instanceof C22751r) {
            if (hoursOfSleep == null || (sleepNeedTimeString = hoursOfSleep.getSleepNeedTimeString()) == null) {
                sleepNeedTimeString = "";
            }
            if (hoursOfSleep == null || (estimatedAwakeTimeString3 = hoursOfSleep.getEstimatedAwakeTimeString()) == null) {
                estimatedAwakeTimeString3 = "";
            }
            if (hoursOfSleep == null || (recommendedTimeInBedTimeString3 = hoursOfSleep.getRecommendedTimeInBedTimeString()) == null) {
                recommendedTimeInBedTimeString3 = "";
            }
            return new C25838l("", sleepNeedTimeString, estimatedAwakeTimeString3, recommendedTimeInBedTimeString3);
        }
        if (!(sleepPercent2 instanceof C22744k)) {
            throw new NoWhenBranchMatchedException();
        }
        if (optimizeSleep2 == null || (sleepAdjustmentTimeString2 = optimizeSleep2.getSleepAdjustmentTimeString()) == null) {
            sleepAdjustmentTimeString2 = "";
        }
        if (optimizeSleep2 == null || (estimatedAwakeTimeString2 = optimizeSleep2.getEstimatedAwakeTimeString()) == null) {
            estimatedAwakeTimeString2 = "";
        }
        if (optimizeSleep2 == null || (recommendedTimeInBedTimeString2 = optimizeSleep2.getRecommendedTimeInBedTimeString()) == null) {
            recommendedTimeInBedTimeString2 = "";
        }
        return new C25838l("", sleepAdjustmentTimeString2, estimatedAwakeTimeString2, recommendedTimeInBedTimeString2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public final SmartAlarmUserInfo m18744g0() {
        return (SmartAlarmUserInfo) this.smartAlarmUserInfo.getValue(this, f24670Y[1]);
    }

    /* JADX INFO: renamed from: k0 */
    private final void m18745k0() {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new b(null), 3);
    }

    /* JADX INFO: renamed from: l0 */
    private final boolean m18746l0(C24641l tonightsSleepWindow) {
        return tonightsSleepWindow.getStartTime().isBeforeNow();
    }

    /* JADX INFO: renamed from: n0 */
    private final void m18747n0() {
        this.shouldPullFromCache = true;
        C6240b c6240b = this.conductorRepository;
        c6240b.m18644v(c6240b.m18633k().m76153a(EnumC25817b.COLLAPSED_STATE_FLOW));
    }

    /* JADX INFO: renamed from: p0 */
    private final LocalTime m18748p0(int alarmWakeWindowMinutes, LocalTime alarmWakeWindowEnd, LocalTime sleepCoachOptimalWindowStart, LocalTime sleepCoachOptimalWindowEnd) {
        if (sleepCoachOptimalWindowStart != null && sleepCoachOptimalWindowEnd != null) {
            DateTime dateTimeM106770b = AbstractC33767a.m106770b(alarmWakeWindowEnd, null, 2, null);
            ReadableInstant readableInstantMinusMinutes = dateTimeM106770b.minusMinutes(alarmWakeWindowMinutes);
            if (!readableInstantMinusMinutes.isBefore(dateTimeM106770b)) {
                throw new IllegalStateException("wake window contract violation; this should never happen");
            }
            DateTime dateTimeM106770b2 = AbstractC33767a.m106770b(sleepCoachOptimalWindowEnd, null, 2, null);
            DateTime dateTimeM106771c = AbstractC33767a.m106771c(sleepCoachOptimalWindowStart, dateTimeM106770b2);
            m49136n().mo85228t("selectWakeUpTimeForSleepHealthGoal optimalSleep stare: " + dateTimeM106771c + " optimal end : " + dateTimeM106770b2 + " sleepCoachOptimalWindowStart: " + sleepCoachOptimalWindowStart + " sleepCoachOptimalWindowEnd " + sleepCoachOptimalWindowEnd + " currentTime : " + DateTime.now() + " alarmWakeWindowMinutes: " + alarmWakeWindowMinutes + " alarmWakeWindowEnd: " + alarmWakeWindowEnd, new AbstractC30556a.a[0]);
            if (!dateTimeM106771c.isBefore(dateTimeM106770b2)) {
                throw new IllegalStateException("optimal sleep window contract violation; this should never happen");
            }
            if (!dateTimeM106770b2.isBefore(readableInstantMinusMinutes) && !dateTimeM106770b.isBefore(dateTimeM106771c) && !dateTimeM106770b.isBefore(dateTimeM106770b2)) {
                return sleepCoachOptimalWindowEnd;
            }
        }
        return alarmWakeWindowEnd;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:72:0x0129  */
    /* JADX WARN: Code duplicated, block: B:74:0x0133  */
    /* JADX WARN: Code duplicated, block: B:75:0x0138  */
    /* JADX WARN: Code duplicated, block: B:76:0x013a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0156  */
    /* JADX WARN: Code duplicated, block: B:85:0x0160  */
    /* JADX WARN: Code duplicated, block: B:86:0x0165  */
    /* JADX WARN: Code duplicated, block: B:87:0x0167  */
    /* JADX WARN: Code duplicated, block: B:94:0x0181  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a7  */
    /* JADX INFO: renamed from: s0 */
    private final C6245g m18749s0(C6245g viewState, HarvardSleepAdviceDto sleepAdviceDto) {
        int recommendedTimeInBed;
        FormattedTimeInBed weeklyPlan;
        String recommendedTimeInBedTimeString;
        String str;
        FormattedTimeInBed weeklyPlan2;
        FormattedTimeInBed optimizeSleep;
        OptimalEndpointsFormatted optimalEndpointsFormatted;
        String start;
        LocalTime localTime;
        OptimalEndpointsFormatted optimalEndpointsFormatted2;
        String end;
        LocalTime localTime2;
        C24641l c24641l;
        String strM76378a;
        String strM76379b;
        AbstractC22734a alarmType = viewState.getAlarmType();
        AbstractC22676k.m65748h(alarmType, "null cannot be cast to non-null type com.whoop.coaching.sleepcoach.harvard.ExactTime");
        C22736c c22736c = (C22736c) alarmType;
        RecommendedTimeInBedFormatted recommendedTimeInBedFormatted = sleepAdviceDto.getRecommendedTimeInBedFormatted();
        AbstractC22748o sleepPercent = c22736c.getSleepPercent();
        C22745l c22745l = C22745l.f89475z;
        if (AbstractC22676k.m65745e(sleepPercent, c22745l)) {
            recommendedTimeInBed = recommendedTimeInBedFormatted.getPeak().getRecommendedTimeInBed();
        } else if (AbstractC22676k.m65745e(sleepPercent, C22746m.f89477z)) {
            recommendedTimeInBed = recommendedTimeInBedFormatted.getPerform().getRecommendedTimeInBed();
        } else if (AbstractC22676k.m65745e(sleepPercent, C22737d.f89416z)) {
            recommendedTimeInBed = recommendedTimeInBedFormatted.getGetBy().getRecommendedTimeInBed();
        } else if (sleepPercent instanceof C22750q) {
            if (!this.isWeeklyPlanSleepPlannerV2FFOn ? (weeklyPlan = recommendedTimeInBedFormatted.getWeeklyPlan()) != null : (weeklyPlan = recommendedTimeInBedFormatted.getOptimizeSleep()) != null) {
                recommendedTimeInBed = 0;
            } else {
                recommendedTimeInBed = weeklyPlan.getRecommendedTimeInBed();
            }
        } else if (sleepPercent instanceof C22751r) {
            FormattedTimeInBed hoursOfSleep = recommendedTimeInBedFormatted.getHoursOfSleep();
            if (hoursOfSleep != null) {
                recommendedTimeInBed = hoursOfSleep.getRecommendedTimeInBed();
            } else {
                recommendedTimeInBed = 0;
            }
        } else {
            if (!(sleepPercent instanceof C22744k)) {
                throw new NoWhenBranchMatchedException();
            }
            FormattedTimeInBed optimizeSleep2 = recommendedTimeInBedFormatted.getOptimizeSleep();
            if (optimizeSleep2 != null) {
                recommendedTimeInBed = optimizeSleep2.getRecommendedTimeInBed();
            } else {
                recommendedTimeInBed = 0;
            }
        }
        AbstractC22748o sleepPercent2 = c22736c.getSleepPercent();
        if (AbstractC22676k.m65745e(sleepPercent2, c22745l)) {
            recommendedTimeInBedTimeString = recommendedTimeInBedFormatted.getPeak().getRecommendedTimeInBedTimeString();
        } else if (AbstractC22676k.m65745e(sleepPercent2, C22746m.f89477z)) {
            recommendedTimeInBedTimeString = recommendedTimeInBedFormatted.getPerform().getRecommendedTimeInBedTimeString();
        } else {
            if (!AbstractC22676k.m65745e(sleepPercent2, C22737d.f89416z)) {
                if (sleepPercent2 instanceof C22750q) {
                    if (!this.isWeeklyPlanSleepPlannerV2FFOn ? (weeklyPlan2 = recommendedTimeInBedFormatted.getWeeklyPlan()) == null || (recommendedTimeInBedTimeString = weeklyPlan2.getRecommendedTimeInBedTimeString()) == null : (optimizeSleep = recommendedTimeInBedFormatted.getOptimizeSleep()) == null || (recommendedTimeInBedTimeString = optimizeSleep.getRecommendedTimeInBedTimeString()) == null) {
                        str = "";
                    }
                } else if (sleepPercent2 instanceof C22751r) {
                    FormattedTimeInBed hoursOfSleep2 = recommendedTimeInBedFormatted.getHoursOfSleep();
                    if (hoursOfSleep2 == null || (recommendedTimeInBedTimeString = hoursOfSleep2.getRecommendedTimeInBedTimeString()) == null) {
                        str = "";
                    }
                } else {
                    if (!(sleepPercent2 instanceof C22744k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    FormattedTimeInBed optimizeSleep3 = recommendedTimeInBedFormatted.getOptimizeSleep();
                    if (optimizeSleep3 == null || (recommendedTimeInBedTimeString = optimizeSleep3.getRecommendedTimeInBedTimeString()) == null) {
                        str = "";
                    }
                }
                LocalTime latestWakeTime = ((C22736c) viewState.getAlarmType()).getLatestWakeTime();
                LocalTime localTimeM18737U = m18737U(this, latestWakeTime, recommendedTimeInBed, null, 4, null);
                C22740g c22740gM18741b0 = m18741b0(sleepAdviceDto, viewState.getAlarmType());
                if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_SLEEP_PLANER_V2)) {
                    strM76379b = AbstractC25855t0.m76379b(c22736c.getSleepPercent(), recommendedTimeInBedFormatted);
                    if (strM76379b != null) {
                        localTime = LocalTime.parse(strM76379b);
                    } else {
                        localTime = null;
                    }
                } else {
                    optimalEndpointsFormatted = recommendedTimeInBedFormatted.getPeak().getOptimalEndpointsFormatted();
                    if (optimalEndpointsFormatted != null || (start = optimalEndpointsFormatted.getStart()) == null) {
                        localTime = null;
                    } else {
                        localTime = LocalTime.parse(start);
                    }
                }
                if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_SLEEP_PLANER_V2)) {
                    strM76378a = AbstractC25855t0.m76378a(c22736c.getSleepPercent(), recommendedTimeInBedFormatted);
                    if (strM76378a != null) {
                        localTime2 = LocalTime.parse(strM76378a);
                    } else {
                        localTime2 = null;
                    }
                } else {
                    optimalEndpointsFormatted2 = recommendedTimeInBedFormatted.getPeak().getOptimalEndpointsFormatted();
                    if (optimalEndpointsFormatted2 != null || (end = optimalEndpointsFormatted2.getEnd()) == null) {
                        localTime2 = null;
                    } else {
                        localTime2 = LocalTime.parse(end);
                    }
                }
                if (localTime2 != null) {
                    DateTime referenceDate = this.referenceDate;
                    AbstractC22676k.m65749i(referenceDate, "referenceDate");
                    DateTime dateTimeM106769a = AbstractC33767a.m106769a(localTime2, referenceDate);
                    AbstractC22676k.m65747g(localTime);
                    Instant instant = AbstractC33767a.m106771c(localTime, dateTimeM106769a).toInstant();
                    AbstractC22676k.m65749i(instant, "toInstant(...)");
                    Instant instant2 = dateTimeM106769a.toInstant();
                    AbstractC22676k.m65749i(instant2, "toInstant(...)");
                    c24641l = new C24641l(instant, instant2);
                } else {
                    c24641l = null;
                }
                DateTime referenceDate2 = this.referenceDate;
                AbstractC22676k.m65749i(referenceDate2, "referenceDate");
                DateTime dateTimeM106769a2 = AbstractC33767a.m106769a(latestWakeTime, referenceDate2);
                Instant instant3 = AbstractC33767a.m106771c(localTimeM18737U, dateTimeM106769a2).toInstant();
                AbstractC22676k.m65749i(instant3, "toInstant(...)");
                Instant instant4 = dateTimeM106769a2.toInstant();
                AbstractC22676k.m65749i(instant4, "toInstant(...)");
                C24641l c24641l2 = new C24641l(instant3, instant4);
                DateTime dateTimeM106770b = AbstractC33767a.m106770b(latestWakeTime, null, 2, null);
                Instant instant5 = AbstractC33767a.m106771c(localTimeM18737U, dateTimeM106770b).toInstant();
                AbstractC22676k.m65749i(instant5, "toInstant(...)");
                Instant instant6 = dateTimeM106770b.toInstant();
                AbstractC22676k.m65749i(instant6, "toInstant(...)");
                return C6245g.m18706b(viewState, null, 0, false, latestWakeTime, localTimeM18737U, str, c22740gM18741b0, c24641l, c24641l2, m18746l0(new C24641l(instant5, instant6)), false, 1031, null);
            }
            recommendedTimeInBedTimeString = recommendedTimeInBedFormatted.getGetBy().getRecommendedTimeInBedTimeString();
        }
        str = recommendedTimeInBedTimeString;
        LocalTime latestWakeTime2 = ((C22736c) viewState.getAlarmType()).getLatestWakeTime();
        LocalTime localTimeM18737U2 = m18737U(this, latestWakeTime2, recommendedTimeInBed, null, 4, null);
        C22740g c22740gM18741b1 = m18741b0(sleepAdviceDto, viewState.getAlarmType());
        if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_SLEEP_PLANER_V2)) {
            strM76379b = AbstractC25855t0.m76379b(c22736c.getSleepPercent(), recommendedTimeInBedFormatted);
            if (strM76379b != null) {
                localTime = LocalTime.parse(strM76379b);
            } else {
                localTime = null;
            }
        } else {
            optimalEndpointsFormatted = recommendedTimeInBedFormatted.getPeak().getOptimalEndpointsFormatted();
            if (optimalEndpointsFormatted != null) {
                localTime = null;
            } else {
                localTime = null;
            }
        }
        if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_SLEEP_PLANER_V2)) {
            strM76378a = AbstractC25855t0.m76378a(c22736c.getSleepPercent(), recommendedTimeInBedFormatted);
            if (strM76378a != null) {
                localTime2 = LocalTime.parse(strM76378a);
            } else {
                localTime2 = null;
            }
        } else {
            optimalEndpointsFormatted2 = recommendedTimeInBedFormatted.getPeak().getOptimalEndpointsFormatted();
            if (optimalEndpointsFormatted2 != null) {
                localTime2 = null;
            } else {
                localTime2 = null;
            }
        }
        if (localTime2 != null) {
            DateTime referenceDate3 = this.referenceDate;
            AbstractC22676k.m65749i(referenceDate3, "referenceDate");
            DateTime dateTimeM106769a3 = AbstractC33767a.m106769a(localTime2, referenceDate3);
            AbstractC22676k.m65747g(localTime);
            Instant instant7 = AbstractC33767a.m106771c(localTime, dateTimeM106769a3).toInstant();
            AbstractC22676k.m65749i(instant7, "toInstant(...)");
            Instant instant8 = dateTimeM106769a3.toInstant();
            AbstractC22676k.m65749i(instant8, "toInstant(...)");
            c24641l = new C24641l(instant7, instant8);
        } else {
            c24641l = null;
        }
        DateTime referenceDate4 = this.referenceDate;
        AbstractC22676k.m65749i(referenceDate4, "referenceDate");
        DateTime dateTimeM106769a4 = AbstractC33767a.m106769a(latestWakeTime2, referenceDate4);
        Instant instant9 = AbstractC33767a.m106771c(localTimeM18737U2, dateTimeM106769a4).toInstant();
        AbstractC22676k.m65749i(instant9, "toInstant(...)");
        Instant instant10 = dateTimeM106769a4.toInstant();
        AbstractC22676k.m65749i(instant10, "toInstant(...)");
        C24641l c24641l3 = new C24641l(instant9, instant10);
        DateTime dateTimeM106770b2 = AbstractC33767a.m106770b(latestWakeTime2, null, 2, null);
        Instant instant11 = AbstractC33767a.m106771c(localTimeM18737U2, dateTimeM106770b2).toInstant();
        AbstractC22676k.m65749i(instant11, "toInstant(...)");
        Instant instant12 = dateTimeM106770b2.toInstant();
        AbstractC22676k.m65749i(instant12, "toInstant(...)");
        return C6245g.m18706b(viewState, null, 0, false, latestWakeTime2, localTimeM18737U2, str, c22740gM18741b1, c24641l, c24641l3, m18746l0(new C24641l(instant11, instant12)), false, 1031, null);
    }

    /* JADX INFO: renamed from: t0 */
    private final C6245g m18750t0(C6245g viewState, HarvardSleepAdviceDto sleepAdviceDto) {
        C24641l c24641l;
        String end;
        String start;
        int recommendedTimeInBed = sleepAdviceDto.getRecommendedTimeInBedFormatted().getPeak().getRecommendedTimeInBed();
        OptimalEndpointsFormatted optimalEndpointsFormatted = sleepAdviceDto.getRecommendedTimeInBedFormatted().getPeak().getOptimalEndpointsFormatted();
        LocalTime localTime = (optimalEndpointsFormatted == null || (start = optimalEndpointsFormatted.getStart()) == null) ? null : LocalTime.parse(start);
        OptimalEndpointsFormatted optimalEndpointsFormatted2 = sleepAdviceDto.getRecommendedTimeInBedFormatted().getPeak().getOptimalEndpointsFormatted();
        LocalTime localTimeM18748p0 = m18748p0(viewState.getWakeWindowMinutes(), viewState.getAlarmType().getLatestWakeTime(), localTime, (optimalEndpointsFormatted2 == null || (end = optimalEndpointsFormatted2.getEnd()) == null) ? null : LocalTime.parse(end));
        LocalTime localTimeM18737U = m18737U(this, localTimeM18748p0, recommendedTimeInBed, null, 4, null);
        C22740g c22740gM18741b0 = m18741b0(sleepAdviceDto, viewState.getAlarmType());
        OptimalEndpointsFormatted optimalEndpointsFormatted3 = sleepAdviceDto.getRecommendedTimeInBedFormatted().getPeak().getOptimalEndpointsFormatted();
        if (optimalEndpointsFormatted3 != null) {
            LocalTime localTime2 = LocalTime.parse(optimalEndpointsFormatted3.getEnd());
            AbstractC22676k.m65749i(localTime2, "parse(...)");
            DateTime referenceDate = this.referenceDate;
            AbstractC22676k.m65749i(referenceDate, "referenceDate");
            DateTime dateTimeM106769a = AbstractC33767a.m106769a(localTime2, referenceDate);
            LocalTime localTime3 = LocalTime.parse(optimalEndpointsFormatted3.getStart());
            AbstractC22676k.m65749i(localTime3, "parse(...)");
            Instant instant = AbstractC33767a.m106771c(localTime3, dateTimeM106769a).toInstant();
            AbstractC22676k.m65749i(instant, "toInstant(...)");
            Instant instant2 = dateTimeM106769a.toInstant();
            AbstractC22676k.m65749i(instant2, "toInstant(...)");
            c24641l = new C24641l(instant, instant2);
        } else {
            c24641l = null;
        }
        DateTime referenceDate2 = this.referenceDate;
        AbstractC22676k.m65749i(referenceDate2, "referenceDate");
        DateTime dateTimeM106769a2 = AbstractC33767a.m106769a(localTimeM18748p0, referenceDate2);
        Instant instant3 = AbstractC33767a.m106771c(localTimeM18737U, dateTimeM106769a2).toInstant();
        AbstractC22676k.m65749i(instant3, "toInstant(...)");
        Instant instant4 = dateTimeM106769a2.toInstant();
        AbstractC22676k.m65749i(instant4, "toInstant(...)");
        C24641l c24641l2 = new C24641l(instant3, instant4);
        DateTime dateTimeM106770b = AbstractC33767a.m106770b(localTimeM18748p0, null, 2, null);
        Instant instant5 = AbstractC33767a.m106771c(localTimeM18737U, dateTimeM106770b).toInstant();
        AbstractC22676k.m65749i(instant5, "toInstant(...)");
        Instant instant6 = dateTimeM106770b.toInstant();
        AbstractC22676k.m65749i(instant6, "toInstant(...)");
        return C6245g.m18706b(viewState, null, 0, false, localTimeM18748p0, localTimeM18737U, c22740gM18741b0.getRecommendedTimeInBed(), c22740gM18741b0, c24641l, c24641l2, m18746l0(new C24641l(instant5, instant6)), false, 1031, null);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:107:0x0204  */
    /* JADX WARN: Code duplicated, block: B:108:0x0206  */
    /* JADX WARN: Code duplicated, block: B:110:0x0210  */
    /* JADX WARN: Code duplicated, block: B:115:0x022e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0254  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:51:0x0109  */
    /* JADX WARN: Code duplicated, block: B:52:0x010e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0112  */
    /* JADX WARN: Code duplicated, block: B:56:0x0118  */
    /* JADX WARN: Code duplicated, block: B:59:0x0123  */
    /* JADX WARN: Code duplicated, block: B:62:0x0143  */
    /* JADX WARN: Code duplicated, block: B:64:0x014d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0152  */
    /* JADX WARN: Code duplicated, block: B:66:0x0154  */
    /* JADX WARN: Code duplicated, block: B:68:0x0158  */
    /* JADX WARN: Code duplicated, block: B:70:0x0162  */
    /* JADX WARN: Code duplicated, block: B:71:0x0167  */
    /* JADX WARN: Code duplicated, block: B:73:0x016b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0175  */
    /* JADX WARN: Code duplicated, block: B:76:0x017a  */
    /* JADX WARN: Code duplicated, block: B:78:0x017e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0184  */
    /* JADX WARN: Code duplicated, block: B:83:0x018f  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:90:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e3  */
    /* JADX WARN: Instruction removed from duplicated block: B:59:0x0123, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:83:0x018f, please report this as an issue */
    /* JADX INFO: renamed from: u0 */
    private final C6245g m18751u0(C6245g viewState, HarvardSleepAdviceDto sleepAdviceDto) {
        int recommendedTimeInBed;
        String str;
        String recommendedTimeInBedTimeString;
        AbstractC22748o sleepPercent;
        String end;
        FormattedTimeInBed optimizeSleep;
        OptimalEndpointsFormatted optimalEndpointsFormatted;
        OptimalEndpointsFormatted optimalEndpointsFormatted2;
        OptimalEndpointsFormatted optimalEndpointsFormatted3;
        AbstractC22748o sleepPercent2;
        FormattedTimeInBed optimizeSleep2;
        OptimalEndpointsFormatted optimalEndpointsFormatted4;
        OptimalEndpointsFormatted optimalEndpointsFormatted5;
        OptimalEndpointsFormatted optimalEndpointsFormatted6;
        LocalTime localTime;
        LocalTime localTime2;
        OptimalEndpointsFormatted optimalEndpointsFormatted7;
        String start;
        LocalTime localTime3;
        OptimalEndpointsFormatted optimalEndpointsFormatted8;
        String end2;
        LocalTime localTime4;
        C24641l c24641l;
        String strM76378a;
        String strM76379b;
        OptimalEndpointsFormatted optimalEndpointsFormatted9;
        OptimalEndpointsFormatted optimalEndpointsFormatted10;
        AbstractC22734a alarmType = viewState.getAlarmType();
        AbstractC22676k.m65748h(alarmType, "null cannot be cast to non-null type com.whoop.coaching.sleepcoach.harvard.SleepGoal");
        C22747n c22747n = (C22747n) alarmType;
        RecommendedTimeInBedFormatted recommendedTimeInBedFormatted = sleepAdviceDto.getRecommendedTimeInBedFormatted();
        AbstractC22748o sleepPercent3 = c22747n.getSleepPercent();
        if (sleepPercent3 instanceof C22745l) {
            recommendedTimeInBed = recommendedTimeInBedFormatted.getPeak().getRecommendedTimeInBed();
        } else if (sleepPercent3 instanceof C22746m) {
            recommendedTimeInBed = recommendedTimeInBedFormatted.getPerform().getRecommendedTimeInBed();
        } else if (sleepPercent3 instanceof C22737d) {
            recommendedTimeInBed = recommendedTimeInBedFormatted.getGetBy().getRecommendedTimeInBed();
        } else {
            if (sleepPercent3 instanceof C22744k) {
                FormattedTimeInBed optimizeSleep3 = recommendedTimeInBedFormatted.getOptimizeSleep();
                if (optimizeSleep3 != null) {
                    recommendedTimeInBed = optimizeSleep3.getRecommendedTimeInBed();
                }
            } else {
                this.logger.mo85222m("Unsupported SleepGoal type: " + c22747n.getSleepPercent(), new AbstractC30556a.a[0]);
            }
            recommendedTimeInBed = 0;
        }
        AbstractC22748o sleepPercent4 = c22747n.getSleepPercent();
        String start2 = "";
        if (AbstractC22676k.m65745e(sleepPercent4, C22745l.f89475z)) {
            recommendedTimeInBedTimeString = recommendedTimeInBedFormatted.getPeak().getRecommendedTimeInBedTimeString();
        } else if (AbstractC22676k.m65745e(sleepPercent4, C22746m.f89477z)) {
            recommendedTimeInBedTimeString = recommendedTimeInBedFormatted.getPerform().getRecommendedTimeInBedTimeString();
        } else {
            if (!AbstractC22676k.m65745e(sleepPercent4, C22737d.f89416z)) {
                if (sleepPercent4 instanceof C22744k) {
                    FormattedTimeInBed optimizeSleep4 = recommendedTimeInBedFormatted.getOptimizeSleep();
                    if (optimizeSleep4 == null || (recommendedTimeInBedTimeString = optimizeSleep4.getRecommendedTimeInBedTimeString()) == null) {
                    }
                    sleepPercent = c22747n.getSleepPercent();
                    if (sleepPercent instanceof C22745l) {
                        optimalEndpointsFormatted10 = recommendedTimeInBedFormatted.getPeak().getOptimalEndpointsFormatted();
                        if (optimalEndpointsFormatted10 != null) {
                            end = optimalEndpointsFormatted10.getEnd();
                        } else {
                            end = null;
                        }
                    } else if (sleepPercent instanceof C22746m) {
                        optimalEndpointsFormatted3 = recommendedTimeInBedFormatted.getPerform().getOptimalEndpointsFormatted();
                        if (optimalEndpointsFormatted3 != null) {
                            end = optimalEndpointsFormatted3.getEnd();
                        } else {
                            end = null;
                        }
                    } else if (sleepPercent instanceof C22737d) {
                        optimalEndpointsFormatted2 = recommendedTimeInBedFormatted.getGetBy().getOptimalEndpointsFormatted();
                        if (optimalEndpointsFormatted2 != null) {
                            end = optimalEndpointsFormatted2.getEnd();
                        } else {
                            end = null;
                        }
                    } else if (sleepPercent instanceof C22744k) {
                        optimizeSleep = recommendedTimeInBedFormatted.getOptimizeSleep();
                        if (optimizeSleep != null || (optimalEndpointsFormatted = optimizeSleep.getOptimalEndpointsFormatted()) == null) {
                            end = null;
                        } else {
                            end = optimalEndpointsFormatted.getEnd();
                        }
                    } else {
                        this.logger.mo85222m("Unsupported SleepGoal type: " + c22747n.getSleepPercent(), new AbstractC30556a.a[0]);
                        end = "";
                    }
                    sleepPercent2 = c22747n.getSleepPercent();
                    if (sleepPercent2 instanceof C22745l) {
                        optimalEndpointsFormatted9 = recommendedTimeInBedFormatted.getPeak().getOptimalEndpointsFormatted();
                        if (optimalEndpointsFormatted9 != null) {
                            start2 = optimalEndpointsFormatted9.getStart();
                        } else {
                            start2 = null;
                        }
                    } else if (sleepPercent2 instanceof C22746m) {
                        optimalEndpointsFormatted6 = recommendedTimeInBedFormatted.getPerform().getOptimalEndpointsFormatted();
                        if (optimalEndpointsFormatted6 != null) {
                            start2 = optimalEndpointsFormatted6.getStart();
                        } else {
                            start2 = null;
                        }
                    } else if (sleepPercent2 instanceof C22737d) {
                        optimalEndpointsFormatted5 = recommendedTimeInBedFormatted.getGetBy().getOptimalEndpointsFormatted();
                        if (optimalEndpointsFormatted5 != null) {
                            start2 = optimalEndpointsFormatted5.getStart();
                        } else {
                            start2 = null;
                        }
                    } else if (sleepPercent2 instanceof C22744k) {
                        optimizeSleep2 = recommendedTimeInBedFormatted.getOptimizeSleep();
                        if (optimizeSleep2 != null || (optimalEndpointsFormatted4 = optimizeSleep2.getOptimalEndpointsFormatted()) == null) {
                            start2 = null;
                        } else {
                            start2 = optimalEndpointsFormatted4.getStart();
                        }
                    } else {
                        this.logger.mo85222m("Unsupported SleepGoal type: " + c22747n.getSleepPercent(), new AbstractC30556a.a[0]);
                    }
                    int wakeWindowMinutes = viewState.getWakeWindowMinutes();
                    LocalTime latestWakeTime = c22747n.getLatestWakeTime();
                    if (start2 != null) {
                        localTime = LocalTime.parse(start2);
                    } else {
                        localTime = null;
                    }
                    if (end != null) {
                        localTime2 = LocalTime.parse(end);
                    } else {
                        localTime2 = null;
                    }
                    if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_SLEEP_PLANER_V2)) {
                        strM76379b = AbstractC25855t0.m76379b(c22747n.getSleepPercent(), recommendedTimeInBedFormatted);
                        if (strM76379b != null) {
                            localTime3 = LocalTime.parse(strM76379b);
                        } else {
                            localTime3 = null;
                        }
                    } else {
                        optimalEndpointsFormatted7 = recommendedTimeInBedFormatted.getPeak().getOptimalEndpointsFormatted();
                        if (optimalEndpointsFormatted7 != null || (start = optimalEndpointsFormatted7.getStart()) == null) {
                            localTime3 = null;
                        } else {
                            localTime3 = LocalTime.parse(start);
                        }
                    }
                    if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_SLEEP_PLANER_V2)) {
                        strM76378a = AbstractC25855t0.m76378a(c22747n.getSleepPercent(), recommendedTimeInBedFormatted);
                        if (strM76378a != null) {
                            localTime4 = LocalTime.parse(strM76378a);
                        } else {
                            localTime4 = null;
                        }
                    } else {
                        optimalEndpointsFormatted8 = recommendedTimeInBedFormatted.getPeak().getOptimalEndpointsFormatted();
                        if (optimalEndpointsFormatted8 != null || (end2 = optimalEndpointsFormatted8.getEnd()) == null) {
                            localTime4 = null;
                        } else {
                            localTime4 = LocalTime.parse(end2);
                        }
                    }
                    LocalTime localTimeM18748p0 = m18748p0(wakeWindowMinutes, latestWakeTime, localTime, localTime2);
                    C22740g c22740gM18741b0 = m18741b0(sleepAdviceDto, viewState.getAlarmType());
                    if (localTime4 != null) {
                        DateTime referenceDate = this.referenceDate;
                        AbstractC22676k.m65749i(referenceDate, "referenceDate");
                        DateTime dateTimeM106769a = AbstractC33767a.m106769a(localTime4, referenceDate);
                        AbstractC22676k.m65747g(localTime3);
                        Instant instant = AbstractC33767a.m106771c(localTime3, dateTimeM106769a).toInstant();
                        AbstractC22676k.m65749i(instant, "toInstant(...)");
                        Instant instant2 = dateTimeM106769a.toInstant();
                        AbstractC22676k.m65749i(instant2, "toInstant(...)");
                        c24641l = new C24641l(instant, instant2);
                    } else {
                        c24641l = null;
                    }
                    LocalTime localTimeM18737U = m18737U(this, localTimeM18748p0, recommendedTimeInBed, null, 4, null);
                    DateTime referenceDate2 = this.referenceDate;
                    AbstractC22676k.m65749i(referenceDate2, "referenceDate");
                    DateTime dateTimeM106769a2 = AbstractC33767a.m106769a(localTimeM18748p0, referenceDate2);
                    Instant instant3 = AbstractC33767a.m106771c(localTimeM18737U, dateTimeM106769a2).toInstant();
                    AbstractC22676k.m65749i(instant3, "toInstant(...)");
                    Instant instant4 = dateTimeM106769a2.toInstant();
                    AbstractC22676k.m65749i(instant4, "toInstant(...)");
                    C24641l c24641l2 = new C24641l(instant3, instant4);
                    DateTime dateTimeM106770b = AbstractC33767a.m106770b(localTimeM18748p0, null, 2, null);
                    Instant instant5 = AbstractC33767a.m106771c(localTimeM18737U, dateTimeM106770b).toInstant();
                    AbstractC22676k.m65749i(instant5, "toInstant(...)");
                    Instant instant6 = dateTimeM106770b.toInstant();
                    AbstractC22676k.m65749i(instant6, "toInstant(...)");
                    return C6245g.m18706b(viewState, null, 0, false, localTimeM18748p0, localTimeM18737U, str, c22740gM18741b0, c24641l, c24641l2, m18746l0(new C24641l(instant5, instant6)), false, 1031, null);
                }
                this.logger.mo85222m("Unsupported SleepGoal type: " + c22747n.getSleepPercent(), new AbstractC30556a.a[0]);
                str = "";
                sleepPercent = c22747n.getSleepPercent();
                if (sleepPercent instanceof C22745l) {
                    optimalEndpointsFormatted10 = recommendedTimeInBedFormatted.getPeak().getOptimalEndpointsFormatted();
                    if (optimalEndpointsFormatted10 != null) {
                        end = optimalEndpointsFormatted10.getEnd();
                    } else {
                        end = null;
                    }
                } else if (sleepPercent instanceof C22746m) {
                    optimalEndpointsFormatted3 = recommendedTimeInBedFormatted.getPerform().getOptimalEndpointsFormatted();
                    if (optimalEndpointsFormatted3 != null) {
                        end = optimalEndpointsFormatted3.getEnd();
                    } else {
                        end = null;
                    }
                } else if (sleepPercent instanceof C22737d) {
                    optimalEndpointsFormatted2 = recommendedTimeInBedFormatted.getGetBy().getOptimalEndpointsFormatted();
                    if (optimalEndpointsFormatted2 != null) {
                        end = optimalEndpointsFormatted2.getEnd();
                    } else {
                        end = null;
                    }
                } else if (sleepPercent instanceof C22744k) {
                    optimizeSleep = recommendedTimeInBedFormatted.getOptimizeSleep();
                    if (optimizeSleep != null) {
                        end = null;
                    } else {
                        end = null;
                    }
                } else {
                    this.logger.mo85222m("Unsupported SleepGoal type: " + c22747n.getSleepPercent(), new AbstractC30556a.a[0]);
                    end = "";
                }
                sleepPercent2 = c22747n.getSleepPercent();
                if (sleepPercent2 instanceof C22745l) {
                    optimalEndpointsFormatted9 = recommendedTimeInBedFormatted.getPeak().getOptimalEndpointsFormatted();
                    if (optimalEndpointsFormatted9 != null) {
                        start2 = optimalEndpointsFormatted9.getStart();
                    } else {
                        start2 = null;
                    }
                } else if (sleepPercent2 instanceof C22746m) {
                    optimalEndpointsFormatted6 = recommendedTimeInBedFormatted.getPerform().getOptimalEndpointsFormatted();
                    if (optimalEndpointsFormatted6 != null) {
                        start2 = optimalEndpointsFormatted6.getStart();
                    } else {
                        start2 = null;
                    }
                } else if (sleepPercent2 instanceof C22737d) {
                    optimalEndpointsFormatted5 = recommendedTimeInBedFormatted.getGetBy().getOptimalEndpointsFormatted();
                    if (optimalEndpointsFormatted5 != null) {
                        start2 = optimalEndpointsFormatted5.getStart();
                    } else {
                        start2 = null;
                    }
                } else if (sleepPercent2 instanceof C22744k) {
                    optimizeSleep2 = recommendedTimeInBedFormatted.getOptimizeSleep();
                    if (optimizeSleep2 != null) {
                        start2 = null;
                    } else {
                        start2 = null;
                    }
                } else {
                    this.logger.mo85222m("Unsupported SleepGoal type: " + c22747n.getSleepPercent(), new AbstractC30556a.a[0]);
                }
                int wakeWindowMinutes2 = viewState.getWakeWindowMinutes();
                LocalTime latestWakeTime2 = c22747n.getLatestWakeTime();
                if (start2 != null) {
                    localTime = LocalTime.parse(start2);
                } else {
                    localTime = null;
                }
                if (end != null) {
                    localTime2 = LocalTime.parse(end);
                } else {
                    localTime2 = null;
                }
                if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_SLEEP_PLANER_V2)) {
                    strM76379b = AbstractC25855t0.m76379b(c22747n.getSleepPercent(), recommendedTimeInBedFormatted);
                    if (strM76379b != null) {
                        localTime3 = LocalTime.parse(strM76379b);
                    } else {
                        localTime3 = null;
                    }
                } else {
                    optimalEndpointsFormatted7 = recommendedTimeInBedFormatted.getPeak().getOptimalEndpointsFormatted();
                    if (optimalEndpointsFormatted7 != null) {
                        localTime3 = null;
                    } else {
                        localTime3 = null;
                    }
                }
                if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_SLEEP_PLANER_V2)) {
                    strM76378a = AbstractC25855t0.m76378a(c22747n.getSleepPercent(), recommendedTimeInBedFormatted);
                    if (strM76378a != null) {
                        localTime4 = LocalTime.parse(strM76378a);
                    } else {
                        localTime4 = null;
                    }
                } else {
                    optimalEndpointsFormatted8 = recommendedTimeInBedFormatted.getPeak().getOptimalEndpointsFormatted();
                    if (optimalEndpointsFormatted8 != null) {
                        localTime4 = null;
                    } else {
                        localTime4 = null;
                    }
                }
                LocalTime localTimeM18748p1 = m18748p0(wakeWindowMinutes2, latestWakeTime2, localTime, localTime2);
                C22740g c22740gM18741b1 = m18741b0(sleepAdviceDto, viewState.getAlarmType());
                if (localTime4 != null) {
                    DateTime referenceDate3 = this.referenceDate;
                    AbstractC22676k.m65749i(referenceDate3, "referenceDate");
                    DateTime dateTimeM106769a3 = AbstractC33767a.m106769a(localTime4, referenceDate3);
                    AbstractC22676k.m65747g(localTime3);
                    Instant instant7 = AbstractC33767a.m106771c(localTime3, dateTimeM106769a3).toInstant();
                    AbstractC22676k.m65749i(instant7, "toInstant(...)");
                    Instant instant8 = dateTimeM106769a3.toInstant();
                    AbstractC22676k.m65749i(instant8, "toInstant(...)");
                    c24641l = new C24641l(instant7, instant8);
                } else {
                    c24641l = null;
                }
                LocalTime localTimeM18737U2 = m18737U(this, localTimeM18748p1, recommendedTimeInBed, null, 4, null);
                DateTime referenceDate4 = this.referenceDate;
                AbstractC22676k.m65749i(referenceDate4, "referenceDate");
                DateTime dateTimeM106769a4 = AbstractC33767a.m106769a(localTimeM18748p1, referenceDate4);
                Instant instant9 = AbstractC33767a.m106771c(localTimeM18737U2, dateTimeM106769a4).toInstant();
                AbstractC22676k.m65749i(instant9, "toInstant(...)");
                Instant instant10 = dateTimeM106769a4.toInstant();
                AbstractC22676k.m65749i(instant10, "toInstant(...)");
                C24641l c24641l3 = new C24641l(instant9, instant10);
                DateTime dateTimeM106770b2 = AbstractC33767a.m106770b(localTimeM18748p1, null, 2, null);
                Instant instant11 = AbstractC33767a.m106771c(localTimeM18737U2, dateTimeM106770b2).toInstant();
                AbstractC22676k.m65749i(instant11, "toInstant(...)");
                Instant instant12 = dateTimeM106770b2.toInstant();
                AbstractC22676k.m65749i(instant12, "toInstant(...)");
                return C6245g.m18706b(viewState, null, 0, false, localTimeM18748p1, localTimeM18737U2, str, c22740gM18741b1, c24641l, c24641l3, m18746l0(new C24641l(instant11, instant12)), false, 1031, null);
            }
            recommendedTimeInBedTimeString = recommendedTimeInBedFormatted.getGetBy().getRecommendedTimeInBedTimeString();
        }
        str = recommendedTimeInBedTimeString;
        sleepPercent = c22747n.getSleepPercent();
        if (sleepPercent instanceof C22745l) {
            optimalEndpointsFormatted10 = recommendedTimeInBedFormatted.getPeak().getOptimalEndpointsFormatted();
            if (optimalEndpointsFormatted10 != null) {
                end = optimalEndpointsFormatted10.getEnd();
            } else {
                end = null;
            }
        } else if (sleepPercent instanceof C22746m) {
            optimalEndpointsFormatted3 = recommendedTimeInBedFormatted.getPerform().getOptimalEndpointsFormatted();
            if (optimalEndpointsFormatted3 != null) {
                end = optimalEndpointsFormatted3.getEnd();
            } else {
                end = null;
            }
        } else if (sleepPercent instanceof C22737d) {
            optimalEndpointsFormatted2 = recommendedTimeInBedFormatted.getGetBy().getOptimalEndpointsFormatted();
            if (optimalEndpointsFormatted2 != null) {
                end = optimalEndpointsFormatted2.getEnd();
            } else {
                end = null;
            }
        } else if (sleepPercent instanceof C22744k) {
            optimizeSleep = recommendedTimeInBedFormatted.getOptimizeSleep();
            if (optimizeSleep != null) {
                end = null;
            } else {
                end = null;
            }
        } else {
            this.logger.mo85222m("Unsupported SleepGoal type: " + c22747n.getSleepPercent(), new AbstractC30556a.a[0]);
            end = "";
        }
        sleepPercent2 = c22747n.getSleepPercent();
        if (sleepPercent2 instanceof C22745l) {
            optimalEndpointsFormatted9 = recommendedTimeInBedFormatted.getPeak().getOptimalEndpointsFormatted();
            if (optimalEndpointsFormatted9 != null) {
                start2 = optimalEndpointsFormatted9.getStart();
            } else {
                start2 = null;
            }
        } else if (sleepPercent2 instanceof C22746m) {
            optimalEndpointsFormatted6 = recommendedTimeInBedFormatted.getPerform().getOptimalEndpointsFormatted();
            if (optimalEndpointsFormatted6 != null) {
                start2 = optimalEndpointsFormatted6.getStart();
            } else {
                start2 = null;
            }
        } else if (sleepPercent2 instanceof C22737d) {
            optimalEndpointsFormatted5 = recommendedTimeInBedFormatted.getGetBy().getOptimalEndpointsFormatted();
            if (optimalEndpointsFormatted5 != null) {
                start2 = optimalEndpointsFormatted5.getStart();
            } else {
                start2 = null;
            }
        } else if (sleepPercent2 instanceof C22744k) {
            optimizeSleep2 = recommendedTimeInBedFormatted.getOptimizeSleep();
            if (optimizeSleep2 != null) {
                start2 = null;
            } else {
                start2 = null;
            }
        } else {
            this.logger.mo85222m("Unsupported SleepGoal type: " + c22747n.getSleepPercent(), new AbstractC30556a.a[0]);
        }
        int wakeWindowMinutes3 = viewState.getWakeWindowMinutes();
        LocalTime latestWakeTime3 = c22747n.getLatestWakeTime();
        if (start2 != null) {
            localTime = LocalTime.parse(start2);
        } else {
            localTime = null;
        }
        if (end != null) {
            localTime2 = LocalTime.parse(end);
        } else {
            localTime2 = null;
        }
        if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_SLEEP_PLANER_V2)) {
            strM76379b = AbstractC25855t0.m76379b(c22747n.getSleepPercent(), recommendedTimeInBedFormatted);
            if (strM76379b != null) {
                localTime3 = LocalTime.parse(strM76379b);
            } else {
                localTime3 = null;
            }
        } else {
            optimalEndpointsFormatted7 = recommendedTimeInBedFormatted.getPeak().getOptimalEndpointsFormatted();
            if (optimalEndpointsFormatted7 != null) {
                localTime3 = null;
            } else {
                localTime3 = null;
            }
        }
        if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_SLEEP_PLANER_V2)) {
            strM76378a = AbstractC25855t0.m76378a(c22747n.getSleepPercent(), recommendedTimeInBedFormatted);
            if (strM76378a != null) {
                localTime4 = LocalTime.parse(strM76378a);
            } else {
                localTime4 = null;
            }
        } else {
            optimalEndpointsFormatted8 = recommendedTimeInBedFormatted.getPeak().getOptimalEndpointsFormatted();
            if (optimalEndpointsFormatted8 != null) {
                localTime4 = null;
            } else {
                localTime4 = null;
            }
        }
        LocalTime localTimeM18748p2 = m18748p0(wakeWindowMinutes3, latestWakeTime3, localTime, localTime2);
        C22740g c22740gM18741b2 = m18741b0(sleepAdviceDto, viewState.getAlarmType());
        if (localTime4 != null) {
            DateTime referenceDate5 = this.referenceDate;
            AbstractC22676k.m65749i(referenceDate5, "referenceDate");
            DateTime dateTimeM106769a5 = AbstractC33767a.m106769a(localTime4, referenceDate5);
            AbstractC22676k.m65747g(localTime3);
            Instant instant13 = AbstractC33767a.m106771c(localTime3, dateTimeM106769a5).toInstant();
            AbstractC22676k.m65749i(instant13, "toInstant(...)");
            Instant instant14 = dateTimeM106769a5.toInstant();
            AbstractC22676k.m65749i(instant14, "toInstant(...)");
            c24641l = new C24641l(instant13, instant14);
        } else {
            c24641l = null;
        }
        LocalTime localTimeM18737U3 = m18737U(this, localTimeM18748p2, recommendedTimeInBed, null, 4, null);
        DateTime referenceDate6 = this.referenceDate;
        AbstractC22676k.m65749i(referenceDate6, "referenceDate");
        DateTime dateTimeM106769a6 = AbstractC33767a.m106769a(localTimeM18748p2, referenceDate6);
        Instant instant15 = AbstractC33767a.m106771c(localTimeM18737U3, dateTimeM106769a6).toInstant();
        AbstractC22676k.m65749i(instant15, "toInstant(...)");
        Instant instant16 = dateTimeM106769a6.toInstant();
        AbstractC22676k.m65749i(instant16, "toInstant(...)");
        C24641l c24641l4 = new C24641l(instant15, instant16);
        DateTime dateTimeM106770b3 = AbstractC33767a.m106770b(localTimeM18748p2, null, 2, null);
        Instant instant17 = AbstractC33767a.m106771c(localTimeM18737U3, dateTimeM106770b3).toInstant();
        AbstractC22676k.m65749i(instant17, "toInstant(...)");
        Instant instant18 = dateTimeM106770b3.toInstant();
        AbstractC22676k.m65749i(instant18, "toInstant(...)");
        return C6245g.m18706b(viewState, null, 0, false, localTimeM18748p2, localTimeM18737U3, str, c22740gM18741b2, c24641l, c24641l4, m18746l0(new C24641l(instant17, instant18)), false, 1031, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public final void m18752v0(SmartAlarmUserInfo smartAlarmUserInfo) {
        this.smartAlarmUserInfo.setValue(this, f24670Y[1], smartAlarmUserInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public final void m18754w0(C6245g c6245g) {
        this.viewState.setValue(this, f24670Y[0], c6245g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public final void m18756y0(SmartAlarmUserInfo smartAlarmuserInfo) {
        C22750q c22750q;
        if (smartAlarmuserInfo != null) {
            C6240b c6240b = this.conductorRepository;
            ConductorViewState conductorViewStateM18640r = c6240b.m18640r();
            AbstractC22734a abstractC22734aM18742c0 = m18742c0(smartAlarmuserInfo);
            AbstractC22734a abstractC22734aM18742c1 = m18742c0(smartAlarmuserInfo);
            boolean smartAlarmEnabled = smartAlarmuserInfo.getSmartAlarmEnabled();
            boolean smartAlarmEnabled2 = smartAlarmuserInfo.getSmartAlarmEnabled();
            int windowMinutes = smartAlarmuserInfo.getWindowMinutes();
            boolean scheduleEnabled = smartAlarmuserInfo.getScheduleEnabled();
            C22751r c22751r = null;
            if (smartAlarmuserInfo.getWeeklyPlanGoal() != null) {
                Integer weeklyPlanGoal = smartAlarmuserInfo.getWeeklyPlanGoal();
                AbstractC22676k.m65747g(weeklyPlanGoal);
                c22750q = new C22750q(weeklyPlanGoal.intValue());
            } else {
                c22750q = null;
            }
            if (smartAlarmuserInfo.getWeeklyPlanHourGoal() != null) {
                String weeklyPlanHourGoal = smartAlarmuserInfo.getWeeklyPlanHourGoal();
                AbstractC22676k.m65747g(weeklyPlanHourGoal);
                c22751r = new C22751r(weeklyPlanHourGoal);
            }
            C22751r c22751r2 = c22751r;
            HarvardSleepAdviceDto harvardSleepAdviceDto = this.sleepAdvice;
            c6240b.m18631B(ConductorViewState.copy$default(conductorViewStateM18640r, abstractC22734aM18742c0, abstractC22734aM18742c1, smartAlarmEnabled, smartAlarmEnabled2, windowMinutes, scheduleEnabled, false, c22750q, c22751r2, false, harvardSleepAdviceDto != null ? harvardSleepAdviceDto.getEligibleForSmartAlarms() : false, new C22744k(AbstractC30314g.f124308f), 576, null));
        }
    }

    /* JADX INFO: renamed from: z0 */
    private final C6245g m18758z0(SmartAlarmUserInfo userInfo) {
        return new C6245g(m18738V(userInfo), userInfo.getWindowMinutes(), userInfo.getSmartAlarmEnabled(), null, null, null, null, null, null, false, userInfo.getScheduleEnabled(), MessageListItemViewType.UNREAD_SEPARATOR, null);
    }

    /* JADX INFO: renamed from: W */
    public final void m18759W() {
        this.conductorRepository.m18646x(new C6241c(this.smartAlarmRepository.m92681m().m65138g() && this.conductorRepository.m18640r().isAlarmEnabledPreviously(), this.conductorRepository.m18640r().getCurrentAlarm().getLatestWakeTime(), false, null, 12, null));
    }

    /* JADX INFO: renamed from: Z */
    public final void m18760Z(EnumC25842n lowBatteryPopUpDismissEvent) {
        AbstractC22676k.m65750j(lowBatteryPopUpDismissEvent, "lowBatteryPopUpDismissEvent");
        C6240b c6240b = this.conductorRepository;
        c6240b.m18646x(new C6241c(false, c6240b.m18640r().getCurrentAlarm().getLatestWakeTime(), false, lowBatteryPopUpDismissEvent, 4, null));
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final AbstractC1615p0 getLoadSleepGraphDto() {
        return this.loadSleepGraphDto;
    }

    /* JADX INFO: renamed from: f0, reason: from getter */
    public final AbstractC1615p0 getLowBatteryPopUpLiveData() {
        return this.lowBatteryPopUpLiveData;
    }

    /* JADX INFO: renamed from: h0, reason: from getter */
    public final AbstractC1615p0 getSmartAlarmUserInfoLiveData() {
        return this.smartAlarmUserInfoLiveData;
    }

    /* JADX INFO: renamed from: i0, reason: from getter */
    public final AbstractC1615p0 getViewStateLiveData() {
        return this.viewStateLiveData;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m18765j0() {
        if (this.smartAlarmRepository.m92681m().m65138g()) {
            m18760Z(EnumC25842n.CLOSE_EVENT);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m18766m0() {
        this.shouldPullFromCache = true;
        m18745k0();
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new c(null), 3);
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m18767o0() {
        this.eventDispatcher.m129043l0("Press", "Sleep Coach - Press Optimal Sleep", "", AbstractC31061c.m95645u("object", "Optimal Sleep"));
    }

    @Override // hj0.AbstractC17356o, androidx.lifecycle.AbstractC1637w1
    public void onCleared() {
        super.onCleared();
        m18747n0();
    }

    /* JADX INFO: renamed from: q0 */
    public final void m18768q0(C6241c lowBatteryPopState, boolean isPopUpVisible) {
        AbstractC22676k.m65750j(lowBatteryPopState, "lowBatteryPopState");
        if (isPopUpVisible) {
            this.eventDispatcher.m129043l0("View", "Sleep Coach - View Low Battery Alert", "", AbstractC25247g0.m73990Y(new C23465k("source", lowBatteryPopState.getPopUpDismissedState() == EnumC25842n.LOW_BATTERY_INDICATOR ? "Low Battery Indicator" : "Screen View"), new C23465k("object", "Low Battery Alert")));
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m18769r0(C6241c lowBatteryPopState, boolean isPopUpDismissied, boolean isViewBeenShowing) {
        String str;
        AbstractC22676k.m65750j(lowBatteryPopState, "lowBatteryPopState");
        if (isPopUpDismissied && isViewBeenShowing && lowBatteryPopState.getPopUpDismissedState() != EnumC25842n.NOT_DISMISS_ACTION) {
            int i13 = a.f24693b[lowBatteryPopState.getPopUpDismissedState().ordinal()];
            if (i13 != 1) {
                str = i13 != 2 ? "Others" : "Low Battery Indicator";
            } else {
                str = "X";
            }
            this.eventDispatcher.m129043l0("View", "Sleep Coach - Dismiss Low Battery Alert", "", AbstractC25247g0.m73990Y(new C23465k("source", str), new C23465k("object", "Low Battery Alert")));
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m18770x0() {
        this.conductorRepository.m18643u(EnumC25817b.SLEEP_GOAL_FLOW);
    }

    public /* synthetic */ C6246h(C6240b c6240b, C30327f c30327f, InterfaceC21847a interfaceC21847a, InterfaceC31766c interfaceC31766c, FeatureFlagChecker featureFlagChecker, C40191e c40191e, InterfaceC34116n interfaceC34116n, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c6240b, c30327f, interfaceC21847a, interfaceC31766c, featureFlagChecker, c40191e, interfaceC34116n, (i13 & 128) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
