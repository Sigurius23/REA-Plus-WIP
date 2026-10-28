package pu2;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.domain.model.UnitSystem;
import com.whoop.domain.model.User;
import com.whoop.domain.model.UserProfile;
import com.whoop.weightlifting.data.domain.VolumeInputFormat;
import com.whoop.weightlifting.data.domain.WeightliftingExercise;
import com.whoop.weightlifting.data.domain.WorkoutExercise;
import com.whoop.weightlifting.data.domain.WorkoutGroup;
import com.whoop.weightlifting.data.domain.WorkoutSet;
import com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkout;
import com.whoop.weightlifting.feature.active.activeworkout.domain.CurrentSetState;
import com.whoop.weightlifting.feature.active.activeworkout.domain.InterfaceC10768a;
import com.whoop.weightlifting.feature.active.activeworkout.domain.PositionInWorkout;
import cu2.AbstractC11127g;
import cu2.AbstractC11128h;
import d13.AbstractC11478a;
import dq1.C12288a;
import du2.EnumC12379c;
import e93.AbstractC12889b;
import eu2.C13645b;
import fz0.C14889d;
import gy0.AbstractC16277f;
import hu2.C17657d;
import hu2.C17659f;
import hu2.C17660g;
import hu2.C17662i;
import hu2.InterfaceC17654a;
import i93.C18279e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iu2.AbstractC20939c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import k51.C22204c;
import l83.C23454a0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import n71.C26423d;
import n71.C26424e;
import n71.InterfaceC26425f;
import nu2.AbstractC27147d;
import nu2.C27146c;
import ny0.AbstractC27274q;
import o11.AbstractC27407m;
import o11.InterfaceC27402h;
import od1.C27858u;
import org.joda.time.DateTime;
import ox0.C28448b;
import p031b9.AbstractC2875y;
import p208i2.C17919x;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import pv2.C29581b;
import q81.AbstractC30043a;
import q81.C30044b;
import q81.C30045c;
import q81.EnumC30051i;
import q81.InterfaceC30052j;
import q83.InterfaceC30057d;
import r41.AbstractC30925i;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;
import y71.C39282o;
import yb0.AbstractC39383f;
import z92.InterfaceC40205a;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: pu2.i */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000ª\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J8\u0010\u001d\u001a\u00020\u0010*\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001a2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b \u0010!J\u0013\u0010#\u001a\u00020\u0010*\u00020\"H\u0002¢\u0006\u0004\b#\u0010$JB\u0010)\u001a\u00020(*\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\u0010&\u001a\u0004\u0018\u00010%2\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001aH\u0082@¢\u0006\u0004\b)\u0010*J\u0013\u0010,\u001a\u00020+*\u00020\u0016H\u0002¢\u0006\u0004\b,\u0010-J\u001b\u00100\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.*\u00020\u0016H\u0002¢\u0006\u0004\b0\u00101J\u001d\u00103\u001a\u000202*\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b3\u00104J3\u0010;\u001a\u00020:2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00172\b\u00105\u001a\u0004\u0018\u00010\u00172\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b;\u0010<J(\u0010?\u001a\u00020>2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001aH\u0082@¢\u0006\u0004\b?\u0010@J\u0014\u0010B\u001a\u00020A*\u00020\u0016H\u0082@¢\u0006\u0004\bB\u0010CJ\u0019\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\u001a*\u00020\u0016H\u0002¢\u0006\u0004\bE\u0010FJ\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u001a*\u00020\u0016H\u0082@¢\u0006\u0004\bH\u0010CJ`\u0010V\u001a\u00020G*\u00020I2\u0006\u0010J\u001a\u00020\u00172\f\u0010M\u001a\b\u0012\u0004\u0012\u00020L0K2\u0006\u0010O\u001a\u00020N2\u0006\u0010P\u001a\u00020N2\u0006\u0010Q\u001a\u00020L2\u0006\u0010S\u001a\u00020R2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020L0K2\u0006\u0010U\u001a\u00020NH\u0082@¢\u0006\u0004\bV\u0010WJ\u0080\u0001\u0010`\u001a\u00020_*\u00020X2\u0006\u0010Y\u001a\u00020I2\u0006\u0010J\u001a\u00020\u00172\u0006\u0010Z\u001a\u00020\u00172\f\u0010M\u001a\b\u0012\u0004\u0012\u00020L0K2\u0006\u0010[\u001a\u00020N2\u0006\u0010\\\u001a\u00020N2\u0006\u0010]\u001a\u00020N2\u0006\u0010Q\u001a\u00020L2\u0006\u0010S\u001a\u00020R2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020L0K2\u0006\u0010^\u001a\u00020L2\u0006\u0010U\u001a\u00020NH\u0082@¢\u0006\u0004\b`\u0010aJa\u0010i\u001a\u00020h*\u00020b2\u0006\u0010c\u001a\u00020\u00172\u0006\u0010d\u001a\u00020N2\u0006\u0010Q\u001a\u00020L2\u0006\u0010S\u001a\u00020R2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020L0K2\u0006\u0010^\u001a\u00020L2\u0006\u0010e\u001a\u00020L2\u0006\u0010g\u001a\u00020f2\u0006\u0010U\u001a\u00020NH\u0002¢\u0006\u0004\bi\u0010jJk\u0010s\u001a\u00020h*\u00020b2\u0006\u0010c\u001a\u00020\u00172\u0006\u0010l\u001a\u00020k2\u0006\u0010m\u001a\u00020k2\u0006\u0010n\u001a\u00020k2\u0006\u0010o\u001a\u00020N2\u0006\u0010p\u001a\u00020k2\u0006\u0010r\u001a\u00020q2\u0006\u0010S\u001a\u00020R2\u0006\u0010^\u001a\u00020L2\u0006\u0010e\u001a\u00020L2\u0006\u0010U\u001a\u00020NH\u0002¢\u0006\u0004\bs\u0010tJ[\u0010u\u001a\u00020h*\u00020b2\u0006\u0010c\u001a\u00020\u00172\u0006\u0010l\u001a\u00020k2\u0006\u0010m\u001a\u00020k2\u0006\u0010n\u001a\u00020k2\u0006\u0010o\u001a\u00020N2\u0006\u0010p\u001a\u00020k2\u0006\u0010r\u001a\u00020q2\u0006\u0010S\u001a\u00020R2\u0006\u0010U\u001a\u00020NH\u0002¢\u0006\u0004\bu\u0010vJk\u0010w\u001a\u00020h*\u00020b2\u0006\u0010c\u001a\u00020\u00172\u0006\u0010l\u001a\u00020k2\u0006\u0010m\u001a\u00020k2\u0006\u0010n\u001a\u00020k2\u0006\u0010o\u001a\u00020N2\u0006\u0010p\u001a\u00020k2\u0006\u0010r\u001a\u00020q2\u0006\u0010S\u001a\u00020R2\u0006\u0010^\u001a\u00020L2\u0006\u0010e\u001a\u00020L2\u0006\u0010U\u001a\u00020NH\u0002¢\u0006\u0004\bw\u0010tJ\u0017\u0010z\u001a\u00020\u00172\u0006\u0010y\u001a\u00020xH\u0002¢\u0006\u0004\bz\u0010{J\u0013\u0010}\u001a\u00020%*\u00020|H\u0002¢\u0006\u0004\b}\u0010~R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001a\u0010U\u001a\u00020N*\u00020\u00168BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001b\u0010\u008c\u0001\u001a\u00020N*\u00020\u00168BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008a\u0001¨\u0006\u008d\u0001"}, m65681d2 = {"Lpu2/i;", "", "Lzr2/a;", "dateAndTimeProvider", "Lod1/u;", "userContext", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lz92/a;", "userInfoAccessor", "Lpv2/b;", "hrZonesReducer", "<init>", "(Lzr2/a;Lod1/u;Lcom/whoop/data/repositories/FeatureFlagChecker;Lz92/a;Lpv2/b;)V", "Lnu2/c;", "domainState", "Lpu2/h;", "n", "(Lnu2/c;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/domain/model/UnitSystem;", "l", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "", "currentHeartRate", "currentSetTimeInSeconds", "", "Ldq1/a;", "hrZonesList", "m", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Lfz0/d;", "x", "(Ljava/util/List;Ljava/lang/Integer;)Ljava/util/List;", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$a;", "D", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$a;)Lpu2/h;", "Lpu2/a;", "dialogState", "hrZonesState", "Lpu2/h$e;", "F", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/Integer;Ljava/lang/Integer;Lpu2/a;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Lq81/b;", "y", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lq81/b;", "Leu2/b;", "Lhu2/a;", "s", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Leu2/b;", "Lq81/j;", "A", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/Integer;)Lq81/j;", "targetTimeInSeconds", "Lq81/i;", "style", "Lcom/whoop/design/util/TextResource$b;", "title", "Lq81/c;", "u", "(Ljava/lang/Integer;Ljava/lang/Integer;Lq81/i;Lcom/whoop/design/util/TextResource$b;)Lq81/c;", "hrZonesListState", "Ln71/d;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ljava/lang/Integer;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Lpu2/l;", "q", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lq83/d;)Ljava/lang/Object;", "Ly71/o;", "p", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Ljava/util/List;", "Leu2/p;", "B", "Lcom/whoop/weightlifting/data/domain/WorkoutGroup;", "groupIndex", "", "Ljava/util/UUID;", "idsOfExpandedExercises", "", "isLastGroup", "isOnlyGroup", "currentSetId", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;", "currentSetState", "completedSetIds", "showSimplifiedView", "G", "(Lcom/whoop/weightlifting/data/domain/WorkoutGroup;ILjava/util/Set;ZZLjava/util/UUID;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Set;ZLq83/d;)Ljava/lang/Object;", "Lcom/whoop/weightlifting/data/domain/WorkoutExercise;", "workoutGroup", "exerciseIndex", "isLastExercise", "isOnlyExercise", "isPartOfSuperset", "groupId", "Lo11/m$b$b;", "C", "(Lcom/whoop/weightlifting/data/domain/WorkoutExercise;Lcom/whoop/weightlifting/data/domain/WorkoutGroup;IILjava/util/Set;ZZZLjava/util/UUID;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Set;Ljava/util/UUID;ZLq83/d;)Ljava/lang/Object;", "Lcom/whoop/weightlifting/data/domain/WorkoutSet;", "setIndex", "noMoreSets", "exerciseId", "Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;", "volumeInputFormat", "Lr41/i;", "E", "(Lcom/whoop/weightlifting/data/domain/WorkoutSet;IZLjava/util/UUID;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Set;Ljava/util/UUID;Ljava/util/UUID;Lcom/whoop/weightlifting/data/domain/VolumeInputFormat;Z)Lr41/i;", "Lcom/whoop/design/util/TextResource;", "setNumberText", "repsText", "timeText", "useTimeEntry", "weightText", "Lq3/k;", "weightFieldImeAction", "r", "(Lcom/whoop/weightlifting/data/domain/WorkoutSet;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;ILcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/UUID;Ljava/util/UUID;Z)Lr41/i;", "t", "(Lcom/whoop/weightlifting/data/domain/WorkoutSet;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;ILcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Z)Lr41/i;", "v", "Lorg/joda/time/DateTime;", "startTime", "i", "(Lorg/joda/time/DateTime;)I", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b;", "o", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$b;)Lpu2/a;", "a", "Lzr2/a;", "b", "Lod1/u;", "c", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "d", "Lz92/a;", "e", "Lpv2/b;", "j", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Z", "k", "startOnExercisesTab", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29561i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C27858u userContext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC40205a userInfoAccessor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C29581b hrZonesReducer;

    /* JADX INFO: renamed from: pu2.i$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.presentation.ActiveWorkoutViewStateReducer", m100430f = "ActiveWorkoutViewStateReducer.kt", m100431l = {96}, m100432m = "getUnitSystem", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f120488w;

        /* JADX INFO: renamed from: y */
        int f120490y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f120488w = obj;
            this.f120490y |= Integer.MIN_VALUE;
            return C29561i.this.m90608l(this);
        }
    }

    /* JADX INFO: renamed from: pu2.i$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.presentation.ActiveWorkoutViewStateReducer", m100430f = "ActiveWorkoutViewStateReducer.kt", m100431l = {109}, m100432m = "reduce", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f120492F;

        /* JADX INFO: renamed from: w */
        Object f120493w;

        /* JADX INFO: renamed from: x */
        Object f120494x;

        /* JADX INFO: renamed from: y */
        int f120495y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f120496z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f120496z = obj;
            this.f120492F |= Integer.MIN_VALUE;
            return C29561i.this.m90622n(null, this);
        }
    }

    /* JADX INFO: renamed from: pu2.i$c */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f120497w = new c();

        /* JADX INFO: renamed from: a */
        public final long m90623a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentAction();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m90623a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: pu2.i$d */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f120498w = new d();

        /* JADX INFO: renamed from: a */
        public final long m90624a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentAlert();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m90624a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: pu2.i$e */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f120499w = new e();

        /* JADX INFO: renamed from: a */
        public final long m90625a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentAlert();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m90625a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: pu2.i$f */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f120500w = new f();

        /* JADX INFO: renamed from: a */
        public final long m90626a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentAction();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m90626a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: pu2.i$g */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.presentation.ActiveWorkoutViewStateReducer", m100430f = "ActiveWorkoutViewStateReducer.kt", m100431l = {320}, m100432m = "reduceBottomSlotState", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f120501E;

        /* JADX INFO: renamed from: F */
        Object f120502F;

        /* JADX INFO: renamed from: G */
        Object f120503G;

        /* JADX INFO: renamed from: H */
        Object f120504H;

        /* JADX INFO: renamed from: I */
        int f120505I;

        /* JADX INFO: renamed from: J */
        /* synthetic */ Object f120506J;

        /* JADX INFO: renamed from: L */
        int f120508L;

        /* JADX INFO: renamed from: w */
        Object f120509w;

        /* JADX INFO: renamed from: x */
        Object f120510x;

        /* JADX INFO: renamed from: y */
        Object f120511y;

        /* JADX INFO: renamed from: z */
        Object f120512z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f120506J = obj;
            this.f120508L |= Integer.MIN_VALUE;
            return C29561i.this.m90612q(null, this);
        }
    }

    /* JADX INFO: renamed from: pu2.i$h */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f120513w = new h();

        /* JADX INFO: renamed from: a */
        public final long m90627a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m90627a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: pu2.i$i */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f120514w = new i();

        /* JADX INFO: renamed from: a */
        public final long m90628a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentAction();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m90628a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: pu2.i$j */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final j f120515w = new j();

        /* JADX INFO: renamed from: a */
        public final long m90629a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m90629a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: pu2.i$k */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final k f120516w = new k();

        /* JADX INFO: renamed from: a */
        public final long m90630a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m90630a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: pu2.i$l */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final l f120517w = new l();

        /* JADX INFO: renamed from: a */
        public final long m90631a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m90631a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: pu2.i$m */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.presentation.ActiveWorkoutViewStateReducer", m100430f = "ActiveWorkoutViewStateReducer.kt", m100431l = {280}, m100432m = "reduceHeartRateMonitor", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f120518E;

        /* JADX INFO: renamed from: w */
        Object f120519w;

        /* JADX INFO: renamed from: x */
        Object f120520x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f120521y;

        public m(InterfaceC30057d<? super m> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f120521y = obj;
            this.f120518E |= Integer.MIN_VALUE;
            return C29561i.this.m90618w(null, null, this);
        }
    }

    /* JADX INFO: renamed from: pu2.i$n */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.presentation.ActiveWorkoutViewStateReducer", m100430f = "ActiveWorkoutViewStateReducer.kt", m100431l = {368}, m100432m = "reduceWorkoutGroups", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f120523E;

        /* JADX INFO: renamed from: F */
        Object f120524F;

        /* JADX INFO: renamed from: G */
        Object f120525G;

        /* JADX INFO: renamed from: H */
        Object f120526H;

        /* JADX INFO: renamed from: I */
        Object f120527I;

        /* JADX INFO: renamed from: J */
        int f120528J;

        /* JADX INFO: renamed from: K */
        int f120529K;

        /* JADX INFO: renamed from: L */
        int f120530L;

        /* JADX INFO: renamed from: M */
        int f120531M;

        /* JADX INFO: renamed from: N */
        int f120532N;

        /* JADX INFO: renamed from: O */
        /* synthetic */ Object f120533O;

        /* JADX INFO: renamed from: Q */
        int f120535Q;

        /* JADX INFO: renamed from: w */
        Object f120536w;

        /* JADX INFO: renamed from: x */
        Object f120537x;

        /* JADX INFO: renamed from: y */
        Object f120538y;

        /* JADX INFO: renamed from: z */
        Object f120539z;

        public n(InterfaceC30057d<? super n> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f120533O = obj;
            this.f120535Q |= Integer.MIN_VALUE;
            return C29561i.this.m90591B(null, this);
        }
    }

    /* JADX INFO: renamed from: pu2.i$o */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.presentation.ActiveWorkoutViewStateReducer", m100430f = "ActiveWorkoutViewStateReducer.kt", m100431l = {459}, m100432m = "toExerciseTileState", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f120540E;

        /* JADX INFO: renamed from: F */
        Object f120541F;

        /* JADX INFO: renamed from: G */
        Object f120542G;

        /* JADX INFO: renamed from: H */
        Object f120543H;

        /* JADX INFO: renamed from: I */
        Object f120544I;

        /* JADX INFO: renamed from: J */
        Object f120545J;

        /* JADX INFO: renamed from: K */
        Object f120546K;

        /* JADX INFO: renamed from: L */
        Object f120547L;

        /* JADX INFO: renamed from: M */
        Object f120548M;

        /* JADX INFO: renamed from: N */
        Object f120549N;

        /* JADX INFO: renamed from: O */
        Object f120550O;

        /* JADX INFO: renamed from: P */
        Object f120551P;

        /* JADX INFO: renamed from: Q */
        int f120552Q;

        /* JADX INFO: renamed from: R */
        int f120553R;

        /* JADX INFO: renamed from: S */
        int f120554S;

        /* JADX INFO: renamed from: T */
        int f120555T;

        /* JADX INFO: renamed from: U */
        boolean f120556U;

        /* JADX INFO: renamed from: V */
        boolean f120557V;

        /* JADX INFO: renamed from: W */
        boolean f120558W;

        /* JADX INFO: renamed from: X */
        boolean f120559X;

        /* JADX INFO: renamed from: Y */
        boolean f120560Y;

        /* JADX INFO: renamed from: Z */
        /* synthetic */ Object f120561Z;

        /* JADX INFO: renamed from: b0 */
        int f120563b0;

        /* JADX INFO: renamed from: w */
        Object f120564w;

        /* JADX INFO: renamed from: x */
        Object f120565x;

        /* JADX INFO: renamed from: y */
        Object f120566y;

        /* JADX INFO: renamed from: z */
        Object f120567z;

        public o(InterfaceC30057d<? super o> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f120561Z = obj;
            this.f120563b0 |= Integer.MIN_VALUE;
            return C29561i.this.m90592C(null, null, 0, 0, null, false, false, false, null, null, null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: pu2.i$p */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.presentation.ActiveWorkoutViewStateReducer", m100430f = "ActiveWorkoutViewStateReducer.kt", m100431l = {180, 181, 185}, m100432m = "toWorkingOutViewState", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f120568E;

        /* JADX INFO: renamed from: F */
        Object f120569F;

        /* JADX INFO: renamed from: G */
        Object f120570G;

        /* JADX INFO: renamed from: H */
        Object f120571H;

        /* JADX INFO: renamed from: I */
        Object f120572I;

        /* JADX INFO: renamed from: J */
        Object f120573J;

        /* JADX INFO: renamed from: K */
        boolean f120574K;

        /* JADX INFO: renamed from: L */
        boolean f120575L;

        /* JADX INFO: renamed from: M */
        /* synthetic */ Object f120576M;

        /* JADX INFO: renamed from: O */
        int f120578O;

        /* JADX INFO: renamed from: w */
        Object f120579w;

        /* JADX INFO: renamed from: x */
        Object f120580x;

        /* JADX INFO: renamed from: y */
        Object f120581y;

        /* JADX INFO: renamed from: z */
        Object f120582z;

        public p(InterfaceC30057d<? super p> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f120576M = obj;
            this.f120578O |= Integer.MIN_VALUE;
            return C29561i.this.m90595F(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: pu2.i$q */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.presentation.ActiveWorkoutViewStateReducer", m100430f = "ActiveWorkoutViewStateReducer.kt", m100431l = {394}, m100432m = "toWorkoutGroupState", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f120583E;

        /* JADX INFO: renamed from: F */
        Object f120584F;

        /* JADX INFO: renamed from: G */
        Object f120585G;

        /* JADX INFO: renamed from: H */
        Object f120586H;

        /* JADX INFO: renamed from: I */
        Object f120587I;

        /* JADX INFO: renamed from: J */
        Object f120588J;

        /* JADX INFO: renamed from: K */
        Object f120589K;

        /* JADX INFO: renamed from: L */
        Object f120590L;

        /* JADX INFO: renamed from: M */
        Object f120591M;

        /* JADX INFO: renamed from: N */
        int f120592N;

        /* JADX INFO: renamed from: O */
        int f120593O;

        /* JADX INFO: renamed from: P */
        int f120594P;

        /* JADX INFO: renamed from: Q */
        int f120595Q;

        /* JADX INFO: renamed from: R */
        int f120596R;

        /* JADX INFO: renamed from: S */
        int f120597S;

        /* JADX INFO: renamed from: T */
        int f120598T;

        /* JADX INFO: renamed from: U */
        int f120599U;

        /* JADX INFO: renamed from: V */
        boolean f120600V;

        /* JADX INFO: renamed from: W */
        boolean f120601W;

        /* JADX INFO: renamed from: X */
        boolean f120602X;

        /* JADX INFO: renamed from: Y */
        /* synthetic */ Object f120603Y;

        /* JADX INFO: renamed from: a0 */
        int f120605a0;

        /* JADX INFO: renamed from: w */
        Object f120606w;

        /* JADX INFO: renamed from: x */
        Object f120607x;

        /* JADX INFO: renamed from: y */
        Object f120608y;

        /* JADX INFO: renamed from: z */
        Object f120609z;

        public q(InterfaceC30057d<? super q> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f120603Y = obj;
            this.f120605a0 |= Integer.MIN_VALUE;
            return C29561i.this.m90596G(null, 0, null, false, false, null, null, null, false, this);
        }
    }

    public C29561i(InterfaceC41070a dateAndTimeProvider, C27858u userContext, FeatureFlagChecker featureFlagChecker, InterfaceC40205a userInfoAccessor, C29581b hrZonesReducer) {
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(userContext, "userContext");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(userInfoAccessor, "userInfoAccessor");
        AbstractC22676k.m65750j(hrZonesReducer, "hrZonesReducer");
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.userContext = userContext;
        this.featureFlagChecker = featureFlagChecker;
        this.userInfoAccessor = userInfoAccessor;
        this.hrZonesReducer = hrZonesReducer;
    }

    /* JADX INFO: renamed from: A */
    private final InterfaceC30052j m90590A(ActiveWorkout activeWorkout, Integer num) {
        EnumC30051i enumC30051i;
        TextResource.C8688b c8688bM21277k;
        CurrentSetState currentSetState = activeWorkout.getCurrentSetState();
        if (currentSetState instanceof CurrentSetState.Rest) {
            enumC30051i = EnumC30051i.REST;
        } else if (currentSetState instanceof CurrentSetState.Active) {
            enumC30051i = EnumC30051i.ACTIVE;
        } else if (currentSetState instanceof CurrentSetState.Warmup) {
            enumC30051i = EnumC30051i.WARMUP;
        } else {
            if (!(currentSetState instanceof CurrentSetState.Cooldown)) {
                throw new NoWhenBranchMatchedException();
            }
            enumC30051i = EnumC30051i.COOLDOWN;
        }
        CurrentSetState currentSetState2 = activeWorkout.getCurrentSetState();
        if (currentSetState2 instanceof CurrentSetState.Rest) {
            c8688bM21277k = AbstractC8693b.m21277k(AbstractC11128h.f35509t1);
        } else if (currentSetState2 instanceof CurrentSetState.Active) {
            c8688bM21277k = AbstractC8693b.m21277k(AbstractC11128h.f35430U);
        } else if (currentSetState2 instanceof CurrentSetState.Warmup) {
            c8688bM21277k = AbstractC8693b.m21277k(AbstractC11128h.f35435V1);
        } else {
            if (!(currentSetState2 instanceof CurrentSetState.Cooldown)) {
                throw new NoWhenBranchMatchedException();
            }
            c8688bM21277k = AbstractC8693b.m21277k(AbstractC11128h.f35475i0);
        }
        return m90616u(num, AbstractC29562j.m90632a(activeWorkout), enumC30051i, c8688bM21277k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x0096  */
    /* JADX WARN: Code duplicated, block: B:24:0x009e  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:31:0x00be  */
    /* JADX WARN: Code duplicated, block: B:34:0x010d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x010e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x010e -> B:36:0x0115). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: B */
    public final java.lang.Object m90591B(com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkout r21, q83.InterfaceC30057d<? super java.util.List<eu2.C13659p>> r22) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pu2.C29561i.m90591B(com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkout, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:72:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: C */
    public final Object m90592C(WorkoutExercise workoutExercise, WorkoutGroup workoutGroup, int i13, int i14, Set<UUID> set, boolean z4, boolean z13, boolean z14, UUID uuid, CurrentSetState currentSetState, Set<UUID> set2, UUID uuid2, boolean z15, InterfaceC30057d<? super AbstractC27407m.b.C42105b> interfaceC30057d) {
        o oVar;
        int i15;
        UUID uuid3;
        WorkoutExercise workoutExercise2;
        TextResource textResource;
        WorkoutGroup workoutGroup2;
        Set<UUID> set3;
        List list;
        boolean z16;
        TextResource.C8688b c8688b;
        boolean z17;
        TextResource textResource2;
        String str;
        int i16;
        C17660g c17660g;
        int i17;
        Object obj;
        int i18;
        Object obj2;
        TextResource textResource3;
        int i19;
        TextResource.C8689c c8689c;
        boolean z18;
        boolean z19;
        if (interfaceC30057d instanceof o) {
            oVar = (o) interfaceC30057d;
            int i24 = oVar.f120563b0;
            if ((i24 & Integer.MIN_VALUE) != 0) {
                oVar.f120563b0 = i24 - Integer.MIN_VALUE;
            } else {
                oVar = new o(interfaceC30057d);
            }
        } else {
            oVar = new o(interfaceC30057d);
        }
        o oVar2 = oVar;
        Object obj3 = oVar2.f120561Z;
        Object obj4 = EnumC31071a.f128113w;
        int i25 = oVar2.f120563b0;
        if (i25 == 0) {
            AbstractC34132o.m107864I(obj3);
            List<WorkoutSet> sets = workoutExercise.getSets();
            if (!(sets instanceof Collection) || !sets.isEmpty()) {
                Iterator<T> it = sets.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i15 = 1;
                        break;
                    }
                    if (!set2.contains(((WorkoutSet) it.next()).getId())) {
                        i15 = 0;
                        break;
                    }
                }
            } else {
                i15 = 1;
                break;
            }
            UUID id4 = workoutExercise.getId();
            TextResource textResourceM21278l = AbstractC8693b.m21278l(workoutExercise.getExercise().getName());
            TextResource.C8689c c8689c2 = new TextResource.C8689c(AbstractC11127g.f35369a, workoutExercise.getSets().size(), AbstractC37056f.m118958J(new TextResource.AbstractC8690d.b(new Integer(workoutExercise.getSets().size()))));
            String imageUrl = workoutExercise.getExercise().getImageUrl();
            int drag = !z14 ? C38072d.f163053a.m121951d().getVarious().getDrag() : C38072d.f163053a.m121951d().getTinyIcons().getDownArrow();
            C17660g c17660g2 = new C17660g(workoutExercise.getId());
            Object iVar = new InterfaceC17654a.i(workoutExercise.getExercise().getExerciseId());
            if (!this.featureFlagChecker.isFeatureEnabled("exercise-details-image-navigation-android")) {
                iVar = null;
            }
            if (iVar == null) {
                iVar = C23454a0.f92919a;
            }
            Object obj5 = iVar;
            boolean zContains = set.contains(workoutExercise.getId());
            List<WorkoutSet> sets2 = workoutExercise.getSets();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sets2, 10));
            TextResource.C8689c c8689c3 = c8689c2;
            int i26 = 0;
            for (Object obj6 : sets2) {
                int i27 = i26 + 1;
                if (i26 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                WorkoutSet workoutSet = (WorkoutSet) obj6;
                if (z4) {
                    c8689c = c8689c3;
                    boolean z24 = i26 == AbstractC37056f.m118951C(workoutExercise.getSets());
                    boolean z25 = zContains;
                    arrayList.add(m90594E(workoutSet, i26, z24, uuid, currentSetState, set2, uuid2, workoutExercise.getId(), workoutExercise.getExercise().getVolumeInputFormat(), z15));
                    c8689c3 = c8689c;
                    textResourceM21278l = textResourceM21278l;
                    id4 = id4;
                    i15 = i15;
                    i26 = i27;
                    imageUrl = imageUrl;
                    drag = drag;
                    c17660g2 = c17660g2;
                    obj5 = obj5;
                    zContains = z25;
                } else {
                    c8689c = c8689c3;
                }
                boolean z26 = zContains;
                arrayList.add(m90594E(workoutSet, i26, z24, uuid, currentSetState, set2, uuid2, workoutExercise.getId(), workoutExercise.getExercise().getVolumeInputFormat(), z15));
                c8689c3 = c8689c;
                textResourceM21278l = textResourceM21278l;
                id4 = id4;
                i15 = i15;
                i26 = i27;
                imageUrl = imageUrl;
                drag = drag;
                c17660g2 = c17660g2;
                obj5 = obj5;
                zContains = z26;
            }
            TextResource.C8689c c8689c4 = c8689c3;
            TextResource textResource4 = textResourceM21278l;
            String str2 = imageUrl;
            int i28 = drag;
            C17660g c17660g3 = c17660g2;
            boolean z27 = zContains;
            Object obj7 = obj5;
            int i29 = i15;
            uuid3 = id4;
            TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(workoutExercise.getExercise().getVolumeInputFormat() == VolumeInputFormat.Time ? AbstractC16277f.f62351m0 : AbstractC16277f.f62347l0);
            TextResource repsWeightInfoText = workoutExercise.getExercise().getRepsWeightInfoText();
            workoutExercise2 = workoutExercise;
            oVar2.f120564w = workoutExercise2;
            oVar2.f120565x = workoutGroup;
            oVar2.f120566y = null;
            oVar2.f120567z = null;
            oVar2.f120540E = null;
            oVar2.f120541F = set2;
            oVar2.f120542G = null;
            oVar2.f120543H = arrayList;
            oVar2.f120544I = c8688bM21277k;
            oVar2.f120545J = repsWeightInfoText;
            oVar2.f120546K = uuid3;
            oVar2.f120547L = textResource4;
            oVar2.f120548M = c8689c4;
            oVar2.f120549N = str2;
            oVar2.f120550O = c17660g3;
            oVar2.f120551P = obj7;
            oVar2.f120552Q = i13;
            oVar2.f120553R = i14;
            oVar2.f120556U = z4;
            oVar2.f120557V = z13;
            oVar2.f120558W = z14;
            oVar2.f120559X = z15;
            oVar2.f120554S = i29;
            oVar2.f120555T = i28;
            oVar2.f120560Y = z27;
            oVar2.f120563b0 = 1;
            Object objM90608l = m90608l(oVar2);
            if (objM90608l == obj4) {
                return obj4;
            }
            textResource = repsWeightInfoText;
            workoutGroup2 = workoutGroup;
            set3 = set2;
            list = arrayList;
            z16 = z27;
            c8688b = c8688bM21277k;
            z17 = z13;
            textResource2 = textResource4;
            str = str2;
            i16 = i14;
            c17660g = c17660g3;
            i17 = i13;
            obj = obj7;
            i18 = i29;
            obj2 = objM90608l;
            textResource3 = c8689c4;
            i19 = i28;
        } else {
            if (i25 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z28 = oVar2.f120560Y;
            int i34 = oVar2.f120555T;
            int i35 = oVar2.f120554S;
            z17 = oVar2.f120557V;
            i16 = oVar2.f120553R;
            i17 = oVar2.f120552Q;
            Object obj8 = oVar2.f120551P;
            C17660g c17660g4 = (C17660g) oVar2.f120550O;
            String str3 = (String) oVar2.f120549N;
            TextResource textResource5 = (TextResource) oVar2.f120548M;
            textResource2 = (TextResource) oVar2.f120547L;
            UUID uuid4 = (UUID) oVar2.f120546K;
            TextResource textResource6 = (TextResource) oVar2.f120545J;
            obj2 = obj3;
            TextResource.C8688b c8688b2 = (TextResource.C8688b) oVar2.f120544I;
            List list2 = (List) oVar2.f120543H;
            Set<UUID> set4 = (Set) oVar2.f120541F;
            workoutGroup2 = (WorkoutGroup) oVar2.f120565x;
            WorkoutExercise workoutExercise3 = (WorkoutExercise) oVar2.f120564w;
            AbstractC34132o.m107864I(obj2);
            c8688b = c8688b2;
            list = list2;
            textResource = textResource6;
            uuid3 = uuid4;
            workoutExercise2 = workoutExercise3;
            textResource3 = textResource5;
            str = str3;
            c17660g = c17660g4;
            obj = obj8;
            i18 = i35;
            i19 = i34;
            z16 = z28;
            set3 = set4;
        }
        UnitSystem unitSystem = (UnitSystem) obj2;
        List<WorkoutSet> sets3 = workoutExercise2.getSets();
        WorkoutGroup workoutGroup3 = workoutGroup2;
        if (!(sets3 instanceof Collection) || !sets3.isEmpty()) {
            Iterator<T> it3 = sets3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z18 = z17 ? false : true;
                } else if (set3.contains(((WorkoutSet) it3.next()).getId())) {
                }
            }
        } else if (z17) {
        }
        if (workoutExercise2.getSets().size() > 1) {
            List<WorkoutExercise> exercises = workoutGroup3.getExercises();
            if (!(exercises instanceof Collection) || !exercises.isEmpty()) {
                Iterator<T> it4 = exercises.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        if (set3.contains(((WorkoutSet) AbstractC25265s.m74112P0(((WorkoutExercise) it4.next()).getSets())).getId())) {
                            z19 = false;
                        }
                    }
                }
            }
            z19 = true;
        } else {
            z19 = false;
        }
        return new AbstractC27407m.b.C42105b(i18 != 0, uuid3, textResource2, textResource3, str, null, i19, c17660g, obj, z16, new InterfaceC27402h.b(list, unitSystem, c8688b, textResource, false, z18, true, true, z19, new C17657d(i17), new C17662i(i17, AbstractC37056f.m118951C(workoutExercise2.getSets())), new InterfaceC17654a.l(i17, i16), 16, null), false, 2080, null);
    }

    /* JADX INFO: renamed from: D */
    private final InterfaceC29560h m90593D(InterfaceC10768a.a aVar) {
        if (aVar instanceof InterfaceC10768a.a.d) {
            return new InterfaceC29560h.d(((InterfaceC10768a.a.d) aVar).getAsyncProcess());
        }
        if (aVar instanceof InterfaceC10768a.a.c) {
            return InterfaceC29560h.c.f120472a;
        }
        if (aVar instanceof InterfaceC10768a.a.InterfaceC41434a) {
            return new InterfaceC29560h.b(AbstractC8693b.m21277k(AbstractC11128h.f35506s1), AbstractC8693b.m21267a(), null, ((InterfaceC10768a.a.InterfaceC41434a) aVar).getAlsoFailedToUpdateTemplate() ? InterfaceC17654a.r.f68478w : InterfaceC17654a.q.f68477w, false, null, InterfaceC17654a.c.f68463w, false, 52, null);
        }
        if (aVar instanceof InterfaceC10768a.a.b) {
            return new InterfaceC29560h.b(AbstractC8693b.m21277k(AbstractC11128h.f35419Q0), AbstractC8693b.m21277k(AbstractC11128h.f35429T1), null, InterfaceC17654a.b0.f68462w, false, AbstractC8693b.m21277k(AbstractC11128h.f35374B0), InterfaceC17654a.j.f68470w, true, 20, null);
        }
        if (aVar instanceof InterfaceC10768a.a.f) {
            return new InterfaceC29560h.b(AbstractC8693b.m21277k(AbstractC11128h.f35405L1), AbstractC8693b.m21277k(AbstractC11128h.f35432U1), AbstractC8693b.m21277k(AbstractC11128h.f35409N), InterfaceC17654a.j.f68470w, false, null, null, true, 96, null);
        }
        if (aVar instanceof InterfaceC10768a.a.e) {
            return new InterfaceC29560h.b(AbstractC8693b.m21277k(AbstractC11128h.f35405L1), AbstractC8693b.m21277k(AbstractC11128h.f35384E1), AbstractC8693b.m21277k(AbstractC11128h.f35409N), InterfaceC17654a.j.f68470w, false, null, null, true, 96, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: E */
    private final AbstractC30925i m90594E(WorkoutSet workoutSet, int i13, boolean z4, UUID uuid, CurrentSetState currentSetState, Set<UUID> set, UUID uuid2, UUID uuid3, VolumeInputFormat volumeInputFormat, boolean z13) {
        TextResource textResourceM21278l = AbstractC8693b.m21278l(String.valueOf(i13 + 1));
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(workoutSet.getNumberOfReps());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(workoutSet.getTime());
        boolean z14 = volumeInputFormat == VolumeInputFormat.Time;
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(workoutSet.getWeight());
        int i14 = z4 ? 7 : 6;
        UUID id4 = workoutSet.getId();
        if (set.contains(id4)) {
            return m90613r(workoutSet, i13, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, z14, textResourceM21278l4, i14, currentSetState, uuid2, uuid3, z13);
        }
        return AbstractC22676k.m65745e(id4, uuid) ? m90615t(workoutSet, i13, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, z14, textResourceM21278l4, i14, currentSetState, z13) : m90617v(workoutSet, i13, textResourceM21278l, textResourceM21278l2, textResourceM21278l3, z14, textResourceM21278l4, i14, currentSetState, uuid2, uuid3, z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x0174  */
    /* JADX WARN: Code duplicated, block: B:38:0x0181  */
    /* JADX WARN: Code duplicated, block: B:41:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: F */
    public final Object m90595F(ActiveWorkout activeWorkout, Integer num, Integer num2, C29553a c29553a, List<C14889d> list, InterfaceC30057d<? super InterfaceC29560h.e> interfaceC30057d) {
        p pVar;
        C13645b<InterfaceC17654a> c13645bM90614s;
        boolean zM90606j;
        ActiveWorkout activeWorkout2;
        boolean z4;
        TextResource textResource;
        InterfaceC30052j interfaceC30052j;
        C29553a c29553a2;
        C30044b c30044b;
        boolean z13;
        TextResource textResource2;
        C30044b c30044b2;
        C29565m c29565m;
        C26423d c26423d;
        C13645b<InterfaceC17654a> c13645b;
        boolean z14;
        C29553a c29553a3;
        ActiveWorkout activeWorkout3;
        List list2;
        C13645b<InterfaceC17654a> c13645b2;
        boolean z15;
        C29553a c29553a4;
        boolean z16;
        C30044b c30044b3;
        C29565m c29565m2;
        if (interfaceC30057d instanceof p) {
            pVar = (p) interfaceC30057d;
            int i13 = pVar.f120578O;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                pVar.f120578O = i13 - Integer.MIN_VALUE;
            } else {
                pVar = new p(interfaceC30057d);
            }
        } else {
            pVar = new p(interfaceC30057d);
        }
        Object objM90591B = pVar.f120576M;
        Object obj = EnumC31071a.f128113w;
        int i14 = pVar.f120578O;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM90591B);
            TextResource textResourceM30853e = AbstractC11478a.m30853e(Locale.ROOT, activeWorkout.getName(), "toUpperCase(...)");
            C30044b c30044bM90620y = m90620y(activeWorkout);
            c13645bM90614s = activeWorkout.getGroups().isEmpty() ? null : m90614s(activeWorkout);
            zM90606j = m90606j(activeWorkout);
            boolean zM90607k = m90607k(activeWorkout);
            if (m90606j(activeWorkout)) {
                c29553a2 = c29553a;
                activeWorkout2 = activeWorkout;
                textResource2 = textResourceM30853e;
                c30044b2 = c30044bM90620y;
                c29565m = null;
                z4 = zM90607k;
                if (!activeWorkout2.getGroups().isEmpty()) {
                    list2 = C25271y.f99162w;
                    c13645b2 = c13645bM90614s;
                    z15 = zM90606j;
                    c29553a4 = c29553a2;
                    z16 = z4;
                    c30044b3 = c30044b2;
                    c29565m2 = c29565m;
                } else {
                    pVar.f120579w = activeWorkout2;
                    pVar.f120580x = null;
                    pVar.f120581y = null;
                    pVar.f120582z = c29553a2;
                    pVar.f120568E = null;
                    pVar.f120569F = textResource2;
                    pVar.f120570G = c30044b2;
                    pVar.f120571H = c13645bM90614s;
                    pVar.f120572I = c29565m;
                    pVar.f120573J = null;
                    pVar.f120574K = zM90606j;
                    pVar.f120575L = z4;
                    pVar.f120578O = 3;
                    objM90591B = m90591B(activeWorkout2, pVar);
                    if (objM90591B != obj) {
                        c13645b = c13645bM90614s;
                        z14 = zM90606j;
                        c29553a3 = c29553a2;
                        activeWorkout3 = activeWorkout2;
                        list2 = (List) objM90591B;
                        activeWorkout2 = activeWorkout3;
                        z15 = z14;
                        c13645b2 = c13645b;
                        c29553a4 = c29553a3;
                        z16 = z4;
                        c29565m2 = c29565m;
                        c30044b3 = c30044b2;
                    }
                }
                return new InterfaceC29560h.e(textResource2, c30044b3, c29565m2, new C29563k(list2), c13645b2, z15, z16, c29553a4, m90611p(activeWorkout2));
            }
            InterfaceC30052j interfaceC30052jM90590A = m90590A(activeWorkout, num2);
            pVar.f120579w = activeWorkout;
            pVar.f120580x = null;
            pVar.f120581y = null;
            pVar.f120582z = c29553a;
            pVar.f120568E = null;
            pVar.f120569F = textResourceM30853e;
            pVar.f120570G = c30044bM90620y;
            pVar.f120571H = c13645bM90614s;
            pVar.f120572I = interfaceC30052jM90590A;
            pVar.f120574K = zM90606j;
            pVar.f120575L = zM90607k;
            pVar.f120578O = 1;
            Object objM90618w = m90618w(num, list, pVar);
            if (objM90618w != obj) {
                activeWorkout2 = activeWorkout;
                z4 = zM90607k;
                textResource = textResourceM30853e;
                objM90591B = objM90618w;
                interfaceC30052j = interfaceC30052jM90590A;
                c29553a2 = c29553a;
                c30044b = c30044bM90620y;
                z13 = zM90606j;
            }
            return obj;
        }
        if (i14 == 1) {
            z4 = pVar.f120575L;
            z13 = pVar.f120574K;
            interfaceC30052j = (InterfaceC30052j) pVar.f120572I;
            c13645bM90614s = (C13645b) pVar.f120571H;
            c30044b = (C30044b) pVar.f120570G;
            textResource = (TextResource) pVar.f120569F;
            c29553a2 = (C29553a) pVar.f120582z;
            activeWorkout2 = (ActiveWorkout) pVar.f120579w;
            AbstractC34132o.m107864I(objM90591B);
        } else {
            if (i14 == 2) {
                z4 = pVar.f120575L;
                z13 = pVar.f120574K;
                c26423d = (C26423d) pVar.f120573J;
                interfaceC30052j = (InterfaceC30052j) pVar.f120572I;
                c13645bM90614s = (C13645b) pVar.f120571H;
                c30044b = (C30044b) pVar.f120570G;
                textResource = (TextResource) pVar.f120569F;
                c29553a2 = (C29553a) pVar.f120582z;
                activeWorkout2 = (ActiveWorkout) pVar.f120579w;
                AbstractC34132o.m107864I(objM90591B);
                C29565m c29565m3 = new C29565m(interfaceC30052j, c26423d, (C29564l) objM90591B);
                c30044b2 = c30044b;
                textResource2 = textResource;
                zM90606j = z13;
                c29565m = c29565m3;
                if (!activeWorkout2.getGroups().isEmpty()) {
                    pVar.f120579w = activeWorkout2;
                    pVar.f120580x = null;
                    pVar.f120581y = null;
                    pVar.f120582z = c29553a2;
                    pVar.f120568E = null;
                    pVar.f120569F = textResource2;
                    pVar.f120570G = c30044b2;
                    pVar.f120571H = c13645bM90614s;
                    pVar.f120572I = c29565m;
                    pVar.f120573J = null;
                    pVar.f120574K = zM90606j;
                    pVar.f120575L = z4;
                    pVar.f120578O = 3;
                    objM90591B = m90591B(activeWorkout2, pVar);
                    if (objM90591B != obj) {
                        c13645b = c13645bM90614s;
                        z14 = zM90606j;
                        c29553a3 = c29553a2;
                        activeWorkout3 = activeWorkout2;
                    }
                    return obj;
                }
                list2 = C25271y.f99162w;
                c13645b2 = c13645bM90614s;
                z15 = zM90606j;
                c29553a4 = c29553a2;
                z16 = z4;
                c30044b3 = c30044b2;
                c29565m2 = c29565m;
                return new InterfaceC29560h.e(textResource2, c30044b3, c29565m2, new C29563k(list2), c13645b2, z15, z16, c29553a4, m90611p(activeWorkout2));
            }
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z4 = pVar.f120575L;
            z14 = pVar.f120574K;
            c29565m = (C29565m) pVar.f120572I;
            c13645b = (C13645b) pVar.f120571H;
            c30044b2 = (C30044b) pVar.f120570G;
            textResource2 = (TextResource) pVar.f120569F;
            c29553a3 = (C29553a) pVar.f120582z;
            activeWorkout3 = (ActiveWorkout) pVar.f120579w;
            AbstractC34132o.m107864I(objM90591B);
        }
        list2 = (List) objM90591B;
        activeWorkout2 = activeWorkout3;
        z15 = z14;
        c13645b2 = c13645b;
        c29553a4 = c29553a3;
        z16 = z4;
        c29565m2 = c29565m;
        c30044b3 = c30044b2;
        return new InterfaceC29560h.e(textResource2, c30044b3, c29565m2, new C29563k(list2), c13645b2, z15, z16, c29553a4, m90611p(activeWorkout2));
        C26423d c26423d2 = (C26423d) objM90591B;
        pVar.f120579w = activeWorkout2;
        pVar.f120580x = null;
        pVar.f120581y = null;
        pVar.f120582z = c29553a2;
        pVar.f120568E = null;
        pVar.f120569F = textResource;
        pVar.f120570G = c30044b;
        pVar.f120571H = c13645bM90614s;
        pVar.f120572I = interfaceC30052j;
        pVar.f120573J = c26423d2;
        pVar.f120574K = z13;
        pVar.f120575L = z4;
        pVar.f120578O = 2;
        Object objM90612q = m90612q(activeWorkout2, pVar);
        if (objM90612q != obj) {
            c26423d = c26423d2;
            objM90591B = objM90612q;
            C29565m c29565m4 = new C29565m(interfaceC30052j, c26423d, (C29564l) objM90591B);
            c30044b2 = c30044b;
            textResource2 = textResource;
            zM90606j = z13;
            c29565m = c29565m4;
            if (!activeWorkout2.getGroups().isEmpty()) {
                list2 = C25271y.f99162w;
                c13645b2 = c13645bM90614s;
                z15 = zM90606j;
                c29553a4 = c29553a2;
                z16 = z4;
                c30044b3 = c30044b2;
                c29565m2 = c29565m;
            } else {
                pVar.f120579w = activeWorkout2;
                pVar.f120580x = null;
                pVar.f120581y = null;
                pVar.f120582z = c29553a2;
                pVar.f120568E = null;
                pVar.f120569F = textResource2;
                pVar.f120570G = c30044b2;
                pVar.f120571H = c13645bM90614s;
                pVar.f120572I = c29565m;
                pVar.f120573J = null;
                pVar.f120574K = zM90606j;
                pVar.f120575L = z4;
                pVar.f120578O = 3;
                objM90591B = m90591B(activeWorkout2, pVar);
                if (objM90591B != obj) {
                    c13645b = c13645bM90614s;
                    z14 = zM90606j;
                    c29553a3 = c29553a2;
                    activeWorkout3 = activeWorkout2;
                    list2 = (List) objM90591B;
                    activeWorkout2 = activeWorkout3;
                    z15 = z14;
                    c13645b2 = c13645b;
                    c29553a4 = c29553a3;
                    z16 = z4;
                    c29565m2 = c29565m;
                    c30044b3 = c30044b2;
                }
            }
            return new InterfaceC29560h.e(textResource2, c30044b3, c29565m2, new C29563k(list2), c13645b2, z15, z16, c29553a4, m90611p(activeWorkout2));
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:19:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:21:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:24:0x010b  */
    /* JADX WARN: Code duplicated, block: B:26:0x010e  */
    /* JADX WARN: Code duplicated, block: B:28:0x011e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0198 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0199  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r26v0, types: [pu2.i] */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0199 -> B:35:0x01b1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: G */
    public final java.lang.Object m90596G(com.whoop.weightlifting.data.domain.WorkoutGroup r27, int r28, java.util.Set<java.util.UUID> r29, boolean r30, boolean r31, java.util.UUID r32, com.whoop.weightlifting.feature.active.activeworkout.domain.CurrentSetState r33, java.util.Set<java.util.UUID> r34, boolean r35, q83.InterfaceC30057d<? super eu2.C13659p> r36) {
        /*
            Method dump skipped, instruction units count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pu2.C29561i.m90596G(com.whoop.weightlifting.data.domain.WorkoutGroup, int, java.util.Set, boolean, boolean, java.util.UUID, com.whoop.weightlifting.feature.active.activeworkout.domain.CurrentSetState, java.util.Set, boolean, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: i */
    private final int m90605i(DateTime startTime) {
        return (int) ((this.dateAndTimeProvider.mo133363b() - startTime.getMillis()) / ((long) 1000));
    }

    /* JADX INFO: renamed from: j */
    private final boolean m90606j(ActiveWorkout activeWorkout) {
        return activeWorkout.isSimpleStrengthLogging();
    }

    /* JADX INFO: renamed from: k */
    private final boolean m90607k(ActiveWorkout activeWorkout) {
        return m90606j(activeWorkout) || activeWorkout.getGroups().isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m90608l(InterfaceC30057d<? super UnitSystem> interfaceC30057d) {
        a aVar;
        UserProfile profile;
        UnitSystem unitSystem;
        UserProfile profile2;
        UnitSystem unitSystem2;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f120490y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f120490y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objMo129089c = aVar.f120488w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f120490y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo129089c);
            if (!this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.NEW_AUTH_USER_STORAGE)) {
                User userM84055f = this.userContext.m84055f();
                return (userM84055f == null || (profile = userM84055f.getProfile()) == null || (unitSystem = profile.getUnitSystem()) == null) ? AbstractC20939c.m58198a() : unitSystem;
            }
            InterfaceC40205a interfaceC40205a = this.userInfoAccessor;
            aVar.f120490y = 1;
            objMo129089c = interfaceC40205a.mo129089c(aVar);
            if (objMo129089c == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo129089c);
        }
        User user = (User) objMo129089c;
        return (user == null || (profile2 = user.getProfile()) == null || (unitSystem2 = profile2.getUnitSystem()) == null) ? AbstractC20939c.m58198a() : unitSystem2;
    }

    /* JADX INFO: renamed from: m */
    private final Object m90609m(ActiveWorkout activeWorkout, Integer num, Integer num2, List<C12288a> list, InterfaceC30057d<? super InterfaceC29560h> interfaceC30057d) {
        InterfaceC10768a currentDialog = activeWorkout.getCurrentDialog();
        if (currentDialog instanceof InterfaceC10768a.a) {
            return m90593D((InterfaceC10768a.a) activeWorkout.getCurrentDialog());
        }
        if (currentDialog instanceof InterfaceC10768a.b) {
            Object objM90595F = m90595F(activeWorkout, num, num2, m90610o((InterfaceC10768a.b) activeWorkout.getCurrentDialog()), m90619x(list, num), interfaceC30057d);
            return objM90595F == EnumC31071a.f128113w ? objM90595F : (InterfaceC29560h) objM90595F;
        }
        if (currentDialog != null) {
            throw new NoWhenBranchMatchedException();
        }
        Object objM90595F2 = m90595F(activeWorkout, num, num2, null, m90619x(list, num), interfaceC30057d);
        return objM90595F2 == EnumC31071a.f128113w ? objM90595F2 : (InterfaceC29560h) objM90595F2;
    }

    /* JADX INFO: renamed from: o */
    private final C29553a m90610o(InterfaceC10768a.b bVar) {
        if (!(bVar instanceof InterfaceC10768a.b.c)) {
            if (bVar instanceof InterfaceC10768a.b.a) {
                InterfaceC10768a.b.a aVar = (InterfaceC10768a.b.a) bVar;
                return new C29553a(AbstractC8693b.m21277k(AbstractC11128h.f35471h), AbstractC8693b.m21277k(AbstractC11128h.f35468g), AbstractC8693b.m21277k(AbstractC11128h.f35496p0), p745y81.Function1.m125323a(d.f120498w), null, null, false, null, new C17659f(aVar.getGroupIndex(), aVar.getExerciseIndex()), false, 752, null);
            }
            if (bVar instanceof InterfaceC10768a.b.C41436b) {
                return new C29553a(AbstractC8693b.m21277k(AbstractC11128h.f35377C0), AbstractC8693b.m21277k(AbstractC11128h.f35380D0), AbstractC8693b.m21277k(AbstractC11128h.f35415P), p745y81.Function1.m125323a(e.f120499w), null, null, false, null, InterfaceC17654a.d.f68464w, false, 752, null);
            }
            if (bVar instanceof InterfaceC10768a.b.d) {
                return new C29553a(AbstractC8693b.m21277k(AbstractC11128h.f35472h0), AbstractC8693b.m21277k(AbstractC11128h.f35469g0), AbstractC8693b.m21277k(AbstractC11128h.f35466f0), p745y81.Function1.m125323a(f.f120500w), null, null, false, null, new InterfaceC17654a.x(((InterfaceC10768a.b.d) bVar).getUndoSetPosition()), false, 752, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC11128h.f35521x1);
        TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC11128h.f35518w1);
        TextResource.C8688b c8688bM21277k3 = AbstractC8693b.m21277k(AbstractC11128h.f35401K0);
        InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a(c.f120497w);
        TextResource.C8688b c8688bM21277k4 = AbstractC8693b.m21277k(AbstractC11128h.f35370A);
        InterfaceC10768a.b.c cVar = (InterfaceC10768a.b.c) bVar;
        if (!cVar.getCanUpdateTemplate()) {
            c8688bM21277k4 = null;
        }
        return new C29553a(c8688bM21277k, c8688bM21277k2, c8688bM21277k3, interfaceC39332eM125323a, null, c8688bM21277k4, cVar.getShouldUpdateTemplate(), InterfaceC17654a.v.f68485w, (cVar.getCanUpdateTemplate() && cVar.getShouldUpdateTemplate()) ? InterfaceC17654a.r.f68478w : InterfaceC17654a.q.f68477w, true, 16, null);
    }

    /* JADX INFO: renamed from: p */
    private final List<C39282o> m90611p(ActiveWorkout activeWorkout) {
        C39282o.Companion companion = C39282o.INSTANCE;
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC11128h.f35457c0);
        C38072d c38072d = C38072d.f163053a;
        C39282o c39282oM125229d = C39282o.Companion.m125229d(companion, c8688bM21277k, null, null, null, null, new C39274g(AbstractC39383f.m125595a(c38072d), null, 2, null), null, null, null, null, null, null, null, null, false, false, null, false, null, null, InterfaceC17654a.b.f68461w, false, null, 7339998, null);
        if (!(activeWorkout.getCurrentSetState() instanceof CurrentSetState.Active)) {
            c39282oM125229d = null;
        }
        C39282o c39282o = c39282oM125229d;
        C39282o c39282oM125229d2 = C39282o.Companion.m125229d(companion, AbstractC8693b.m21277k(AbstractC11128h.f35426S1), null, null, null, null, new C39274g(c38072d.m121951d().getAction().getUndo(), null, 2, null), null, null, null, null, null, null, null, null, false, false, null, false, null, null, InterfaceC17654a.w.f68486w, false, null, 7339998, null);
        if (!this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.STRENGTH_TRAINER_UNDO_SETS) || activeWorkout.getLastCompletedSetId() == null || (!(activeWorkout.getCurrentSetState() instanceof CurrentSetState.Rest) && !(activeWorkout.getCurrentSetState() instanceof CurrentSetState.Cooldown))) {
            c39282oM125229d2 = null;
        }
        C39282o c39282o2 = c39282oM125229d2;
        C39282o c39282oM125229d3 = C39282o.Companion.m125229d(companion, AbstractC8693b.m21277k(AbstractC11128h.f35398J0), null, null, null, null, new C39274g(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getStopActivity(), null, 2, null), null, null, null, null, null, null, null, null, false, false, null, false, null, null, InterfaceC17654a.g.f68467w, false, null, 7339998, null);
        if (activeWorkout.getGroups().isEmpty() || (!m90606j(activeWorkout) && !(activeWorkout.getCurrentSetState() instanceof CurrentSetState.Rest) && !(activeWorkout.getCurrentSetState() instanceof CurrentSetState.Cooldown))) {
            c39282oM125229d3 = null;
        }
        return AbstractC25260n.m74077r0(new C39282o[]{c39282o, c39282o2, c39282oM125229d3, C39282o.Companion.m125229d(companion, AbstractC8693b.m21277k(AbstractC11128h.f35377C0), null, null, null, null, new C39274g(c38072d.m121951d().getAction().getDelete(), null, 2, null), null, null, null, null, null, null, null, null, false, false, null, false, null, null, InterfaceC17654a.m.f68473w, false, null, 7339998, null)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:72:0x0189  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: q */
    public final Object m90612q(ActiveWorkout activeWorkout, InterfaceC30057d<? super C29564l> interfaceC30057d) {
        g gVar;
        int i13;
        String str;
        TextResource textResourceM21278l;
        InterfaceC17654a.i iVar;
        String str2;
        TextResource.C8688b c8688b;
        int i14;
        Object obj;
        ActiveWorkout activeWorkout2;
        WeightliftingExercise exercise;
        WeightliftingExercise exercise2;
        WeightliftingExercise exercise3;
        InterfaceC25312u c22204c;
        InterfaceC25312u c22204c2;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i15 = gVar.f120508L;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                gVar.f120508L = i15 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        Object obj2 = gVar.f120506J;
        Object obj3 = EnumC31071a.f128113w;
        int i16 = gVar.f120508L;
        if (i16 == 0) {
            AbstractC34132o.m107864I(obj2);
            i13 = ((activeWorkout.getCurrentSetState() instanceof CurrentSetState.Cooldown) || ((activeWorkout.getCurrentSetState() instanceof CurrentSetState.Rest) && !((CurrentSetState.Rest) activeWorkout.getCurrentSetState()).getCancelled()) || ((activeWorkout.getCurrentSetState() instanceof CurrentSetState.Active) && activeWorkout.getCompletedSetData().isEmpty())) ? 1 : 0;
            CurrentSetState currentSetState = activeWorkout.getCurrentSetState();
            if (currentSetState instanceof CurrentSetState.Warmup) {
                c22204c2 = new C22204c(null, AbstractC8693b.m21277k(AbstractC11128h.f35444Y1), AbstractC8693b.m21277k(AbstractC11128h.f35441X1), null, 9, null);
            } else {
                if (currentSetState instanceof CurrentSetState.Cooldown) {
                    c22204c = new C22204c(null, AbstractC8693b.m21277k(AbstractC11128h.f35484l0), AbstractC8693b.m21277k(AbstractC11128h.f35481k0), null, 9, null);
                } else {
                    WorkoutExercise currentExercise = activeWorkout.getCurrentExercise();
                    String exerciseId = (currentExercise == null || (exercise3 = currentExercise.getExercise()) == null) ? null : exercise3.getExerciseId();
                    if (exerciseId == null) {
                        exerciseId = "";
                    }
                    str = exerciseId;
                    WorkoutExercise currentExercise2 = activeWorkout.getCurrentExercise();
                    textResourceM21278l = AbstractC8693b.m21278l((currentExercise2 == null || (exercise2 = currentExercise2.getExercise()) == null) ? null : exercise2.getName());
                    TextResource.C8688b c8688bM21277k = activeWorkout.getCurrentSetState() instanceof CurrentSetState.Rest ? AbstractC8693b.m21277k(AbstractC11128h.f35467f1) : null;
                    WorkoutExercise currentExercise3 = activeWorkout.getCurrentExercise();
                    String imageUrl = (currentExercise3 == null || (exercise = currentExercise3.getExercise()) == null) ? null : exercise.getImageUrl();
                    iVar = new InterfaceC17654a.i(str);
                    Object iVar2 = new InterfaceC17654a.i(str);
                    if (!this.featureFlagChecker.isFeatureEnabled("exercise-details-image-navigation-android")) {
                        iVar2 = null;
                    }
                    if (iVar2 == null) {
                        iVar2 = C23454a0.f92919a;
                    }
                    gVar.f120509w = null;
                    gVar.f120510x = str;
                    gVar.f120511y = textResourceM21278l;
                    gVar.f120512z = c8688bM21277k;
                    gVar.f120501E = imageUrl;
                    gVar.f120502F = iVar;
                    gVar.f120503G = iVar2;
                    gVar.f120504H = activeWorkout;
                    gVar.f120505I = i13;
                    gVar.f120508L = 1;
                    Object objM90608l = m90608l(gVar);
                    if (objM90608l == obj3) {
                        return obj3;
                    }
                    TextResource.C8688b c8688b2 = c8688bM21277k;
                    str2 = imageUrl;
                    c8688b = c8688b2;
                    i14 = i13;
                    obj2 = objM90608l;
                    obj = iVar2;
                    activeWorkout2 = activeWorkout;
                }
                c22204c2 = c22204c;
            }
            return new C29564l(c22204c2, i13 != 0);
        }
        if (i16 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i14 = gVar.f120505I;
        activeWorkout2 = (ActiveWorkout) gVar.f120504H;
        Object obj4 = gVar.f120503G;
        iVar = (InterfaceC17654a.i) gVar.f120502F;
        String str3 = (String) gVar.f120501E;
        TextResource.C8688b c8688b3 = (TextResource.C8688b) gVar.f120512z;
        textResourceM21278l = (TextResource) gVar.f120511y;
        str = (String) gVar.f120510x;
        AbstractC34132o.m107864I(obj2);
        str2 = str3;
        c8688b = c8688b3;
        obj = obj4;
        c22204c = new AbstractC27407m.d.a(textResourceM21278l, c8688b, str2, null, iVar, obj, AbstractC29562j.m90634c(activeWorkout2, (UnitSystem) obj2), false, new InterfaceC17654a.i(str), true, true, null, null, null, 14472, null);
        i13 = i14;
        c22204c2 = c22204c;
        return new C29564l(c22204c2, i13 != 0);
    }

    /* JADX INFO: renamed from: r */
    private final AbstractC30925i m90613r(WorkoutSet workoutSet, int i13, TextResource textResource, TextResource textResource2, TextResource textResource3, boolean z4, TextResource textResource4, int i14, CurrentSetState currentSetState, UUID uuid, UUID uuid2, boolean z13) {
        if (z13) {
            return new AbstractC30925i.b(workoutSet.getId(), i13, textResource, textResource2, textResource3, z4, textResource4, i14, (currentSetState instanceof CurrentSetState.Rest) || (currentSetState instanceof CurrentSetState.Cooldown), new InterfaceC17654a.x(new PositionInWorkout(uuid, uuid2, workoutSet.getId())), AbstractC2875y.m8290c(C38072d.f163053a), AbstractC16277f.f62287V, AbstractC27274q.g.f109144f, EnumC39333f.BRAND_BLACK, EnumC39333f.ACCENT_ACTION, true, true, null);
        }
        if (!this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.STRENGTH_TRAINER_UNDO_SETS)) {
            return new AbstractC30925i.a(workoutSet.getId(), i13, textResource, textResource2, textResource3, z4, textResource4, i14, null);
        }
        boolean z14 = currentSetState instanceof CurrentSetState.Rest;
        return new AbstractC30925i.b(workoutSet.getId(), i13, textResource, textResource2, textResource3, z4, textResource4, i14, z14 || (currentSetState instanceof CurrentSetState.Cooldown), (z14 || (currentSetState instanceof CurrentSetState.Cooldown)) ? new InterfaceC17654a.n(new PositionInWorkout(uuid, uuid2, workoutSet.getId())) : C23454a0.f92919a, 0, 0, null, null, null, false, false, 130048, null);
    }

    /* JADX INFO: renamed from: s */
    private final C13645b<InterfaceC17654a> m90614s(ActiveWorkout activeWorkout) {
        if (m90606j(activeWorkout)) {
            return new C13645b<>(AbstractC8693b.m21277k(AbstractC11128h.f35401K0), p745y81.Function1.m125323a(h.f120513w), false, InterfaceC17654a.g.f68467w, 4, null);
        }
        CurrentSetState currentSetState = activeWorkout.getCurrentSetState();
        if (currentSetState instanceof CurrentSetState.Rest) {
            return new C13645b<>(AbstractC8693b.m21277k(AbstractC11128h.f35391H), p745y81.Function1.m125323a(i.f120514w), false, new InterfaceC17654a.t(null, false, 3, null), 4, null);
        }
        if (currentSetState instanceof CurrentSetState.Active) {
            return new C13645b<>(AbstractC8693b.m21277k(AbstractC11128h.f35480k), p745y81.Function1.m125323a(j.f120515w), false, new InterfaceC17654a.f(null, 1, null), 4, null);
        }
        if (currentSetState instanceof CurrentSetState.Warmup) {
            return new C13645b<>(AbstractC8693b.m21277k(AbstractC11128h.f35408M1), p745y81.Function1.m125323a(k.f120516w), false, new InterfaceC17654a.t(null, false, 3, null), 4, null);
        }
        if (!(currentSetState instanceof CurrentSetState.Cooldown)) {
            throw new NoWhenBranchMatchedException();
        }
        return new C13645b<>(AbstractC8693b.m21277k(AbstractC11128h.f35401K0), p745y81.Function1.m125323a(l.f120517w), false, InterfaceC17654a.g.f68467w, 4, null);
    }

    /* JADX INFO: renamed from: t */
    private final AbstractC30925i m90615t(WorkoutSet workoutSet, int i13, TextResource textResource, TextResource textResource2, TextResource textResource3, boolean z4, TextResource textResource4, int i14, CurrentSetState currentSetState, boolean z13) {
        if (!z13) {
            return new AbstractC30925i.c(workoutSet.getId(), i13, textResource, textResource2, textResource3, z4, textResource4, i14, ((currentSetState instanceof CurrentSetState.Rest) || (currentSetState instanceof CurrentSetState.Warmup)) ? new InterfaceC17654a.t(EnumC12379c.EXERCISES, true) : C23454a0.f92919a, currentSetState instanceof CurrentSetState.Active, 0, null, null, null, false, 31744, null);
        }
        UUID id4 = workoutSet.getId();
        InterfaceC17654a.e eVar = InterfaceC17654a.e.f68465w;
        int iM8290c = AbstractC2875y.m8290c(C38072d.f163053a);
        AbstractC27274q.g gVar = AbstractC27274q.g.f109144f;
        EnumC39333f enumC39333f = EnumC39333f.WHITE_50;
        return new AbstractC30925i.c(id4, i13, textResource, textResource2, textResource3, z4, textResource4, i14, eVar, false, iM8290c, gVar, enumC39333f, enumC39333f, true, null);
    }

    /* JADX INFO: renamed from: u */
    private final C30045c m90616u(Integer currentSetTimeInSeconds, Integer targetTimeInSeconds, EnumC30051i style, TextResource.C8688b title) {
        TextResource textResourceM21267a;
        if (currentSetTimeInSeconds != null && targetTimeInSeconds != null && currentSetTimeInSeconds.intValue() >= targetTimeInSeconds.intValue()) {
            style = EnumC30051i.TARGET_TIME_ELAPSED;
        }
        if (currentSetTimeInSeconds == null || (textResourceM21267a = AbstractC8693b.m21278l(AbstractC30043a.m91991k(currentSetTimeInSeconds.intValue(), false, 2, null))) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        float fFloatValue = 1.0f;
        if (currentSetTimeInSeconds != null && targetTimeInSeconds != null && targetTimeInSeconds.intValue() > 0) {
            fFloatValue = ((Number) AbstractC12889b.m36288r(Float.valueOf(currentSetTimeInSeconds.intValue() / targetTimeInSeconds.intValue()), new C18279e(0.0f, 1.0f))).floatValue();
        }
        return new C30045c(style, title, textResourceM21267a, fFloatValue);
    }

    /* JADX INFO: renamed from: v */
    private final AbstractC30925i m90617v(WorkoutSet workoutSet, int i13, TextResource textResource, TextResource textResource2, TextResource textResource3, boolean z4, TextResource textResource4, int i14, CurrentSetState currentSetState, UUID uuid, UUID uuid2, boolean z13) {
        PositionInWorkout positionInWorkout = new PositionInWorkout(uuid, uuid2, workoutSet.getId());
        if (!z13) {
            return new AbstractC30925i.e(workoutSet.getId(), i13, textResource, textResource2, textResource3, z4, textResource4, i14, new InterfaceC17654a.z(positionInWorkout), AbstractC27147d.m81637a(currentSetState), 0, null, null, null, false, 31744, null);
        }
        UUID id4 = workoutSet.getId();
        InterfaceC17654a.z zVar = new InterfaceC17654a.z(positionInWorkout);
        boolean zM81637a = AbstractC27147d.m81637a(currentSetState);
        int iM8290c = AbstractC2875y.m8290c(C38072d.f163053a);
        EnumC39333f enumC39333f = EnumC39333f.WHITE_50;
        return new AbstractC30925i.e(id4, i13, textResource, textResource2, textResource3, z4, textResource4, i14, zVar, zM81637a, iM8290c, enumC39333f, AbstractC27274q.g.f109144f, enumC39333f, true, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: w */
    public final Object m90618w(Integer num, List<C14889d> list, InterfaceC30057d<? super C26423d> interfaceC30057d) {
        m mVar;
        UserProfile profile;
        UserProfile profile2;
        Integer num2 = num;
        List<C14889d> list2 = list;
        if (interfaceC30057d instanceof m) {
            mVar = (m) interfaceC30057d;
            int i13 = mVar.f120518E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                mVar.f120518E = i13 - Integer.MIN_VALUE;
            } else {
                mVar = new m(interfaceC30057d);
            }
        } else {
            mVar = new m(interfaceC30057d);
        }
        Object objMo129089c = mVar.f120521y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = mVar.f120518E;
        int maxHeartRate = Integer.MAX_VALUE;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo129089c);
            if (num2 == null) {
                return new C26423d(new InterfaceC26425f.b(list2), new C26424e(null, false, 1, null), 0.0f, 0.0f, 12, null);
            }
            if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.NEW_AUTH_USER_STORAGE)) {
                InterfaceC40205a interfaceC40205a = this.userInfoAccessor;
                mVar.f120519w = num2;
                mVar.f120520x = list2;
                mVar.f120518E = 1;
                objMo129089c = interfaceC40205a.mo129089c(mVar);
                if (objMo129089c == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                User userM84055f = this.userContext.m84055f();
                if (userM84055f != null && (profile = userM84055f.getProfile()) != null) {
                    maxHeartRate = profile.getMaxHeartRate();
                }
            }
            return new C26423d(new InterfaceC26425f.a(num2.intValue(), maxHeartRate, list2), new C26424e(null, false, 1, null), 0.0f, 0.0f, 12, null);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List<C14889d> list3 = (List) mVar.f120520x;
        Integer num3 = (Integer) mVar.f120519w;
        AbstractC34132o.m107864I(objMo129089c);
        list2 = list3;
        num2 = num3;
        User user = (User) objMo129089c;
        if (user != null && (profile2 = user.getProfile()) != null) {
            maxHeartRate = profile2.getMaxHeartRate();
        }
        return new C26423d(new InterfaceC26425f.a(num2.intValue(), maxHeartRate, list2), new C26424e(null, false, 1, null), 0.0f, 0.0f, 12, null);
    }

    /* JADX INFO: renamed from: x */
    private final List<C14889d> m90619x(List<C12288a> hrZonesList, Integer currentHeartRate) {
        C29581b c29581b = this.hrZonesReducer;
        if (hrZonesList == null) {
            hrZonesList = C25271y.f99162w;
        }
        return c29581b.m90692d(hrZonesList, currentHeartRate).m90688a();
    }

    /* JADX INFO: renamed from: y */
    private final C30044b m90620y(ActiveWorkout activeWorkout) {
        return new C30044b(m90605i(activeWorkout.getStartTime()), false, null, new C28448b(23, this, activeWorkout), true, null, false, 102, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final int m90621z(C29561i c29561i, ActiveWorkout activeWorkout) {
        return c29561i.m90605i(activeWorkout.getStartTime());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: n */
    public final Object m90622n(C27146c c27146c, InterfaceC30057d<? super InterfaceC29560h> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f120492F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f120492F = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object objM90609m = bVar2.f120496z;
        Object obj = EnumC31071a.f128113w;
        int i14 = bVar2.f120492F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM90609m);
            ActiveWorkout workoutState = c27146c.getWorkoutState();
            if (workoutState != null) {
                Integer currentHeartRate = c27146c.getCurrentHeartRate();
                Integer currentSetTimeInSeconds = c27146c.getCurrentSetTimeInSeconds();
                List<C12288a> listM81634c = c27146c.m81634c();
                bVar2.f120493w = null;
                bVar2.f120494x = null;
                bVar2.f120495y = 0;
                bVar2.f120492F = 1;
                objM90609m = m90609m(workoutState, currentHeartRate, currentSetTimeInSeconds, listM81634c, bVar2);
                if (objM90609m == obj) {
                    return obj;
                }
            }
            return InterfaceC29560h.a.f120462a;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(objM90609m);
        InterfaceC29560h interfaceC29560h = (InterfaceC29560h) objM90609m;
        if (interfaceC29560h != null) {
            return interfaceC29560h;
        }
        return InterfaceC29560h.a.f120462a;
    }
}
