package com.whoop.weightlifting.feature.active.activeworkout.domain;

import androidx.annotation.Keep;
import androidx.profileinstaller.ProfileVerifier;
import c13.AbstractC3855a;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.weightlifting.data.domain.CompletedSetData;
import com.whoop.weightlifting.data.domain.CompletedSetData$$serializer;
import com.whoop.weightlifting.data.domain.StrapLaterality;
import com.whoop.weightlifting.data.domain.StrapLocation;
import com.whoop.weightlifting.data.domain.WeightliftingExercise;
import com.whoop.weightlifting.data.domain.WeightliftingWorkout;
import com.whoop.weightlifting.data.domain.WeightliftingWorkoutExercise;
import com.whoop.weightlifting.data.domain.WeightliftingWorkoutGroup;
import com.whoop.weightlifting.data.domain.WeightliftingWorkoutSet;
import com.whoop.weightlifting.data.domain.WorkoutExercise;
import com.whoop.weightlifting.data.domain.WorkoutGroup;
import com.whoop.weightlifting.data.domain.WorkoutGroup$$serializer;
import com.whoop.weightlifting.data.domain.WorkoutSet;
import com.whoop.weightlifting.data.domain.WorkoutTemplate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lu2.C24753c;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import no2.C26995a;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(m65680d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 \u00ad\u00012\u00020\u0001:\u0004®\u0001¯\u0001BÓ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010$\u001a\u00020!¢\u0006\u0004\b%\u0010&BÓ\u0001\b\u0010\u0012\u0006\u0010'\u001a\u00020\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010$\u001a\u00020!\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b%\u0010*J\u0015\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020\u000e¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u0004\u0018\u00010\u00102\u0006\u0010/\u001a\u00020\f¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b6\u00105J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b7\u00108J\u0016\u00109\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b9\u00108J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u001c\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0012\u0010J\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020!HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0016\u0010P\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003¢\u0006\u0004\bP\u0010;J\u0010\u0010Q\u001a\u00020!HÆ\u0003¢\u0006\u0004\bQ\u0010OJò\u0001\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010$\u001a\u00020!HÆ\u0001¢\u0006\u0004\bR\u0010SJ\u0010\u0010T\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bT\u00103J\u0010\u0010U\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\bU\u0010VJ\u001a\u0010X\u001a\u00020!2\b\u0010W\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bX\u0010YJ\u0013\u0010[\u001a\u00020Z*\u00020\bH\u0002¢\u0006\u0004\b[\u0010\\J\u0013\u0010_\u001a\u00020^*\u00020]H\u0002¢\u0006\u0004\b_\u0010`J\u001b\u0010e\u001a\u00020d*\u00020a2\u0006\u0010c\u001a\u00020bH\u0002¢\u0006\u0004\be\u0010fJ'\u0010o\u001a\u00020l2\u0006\u0010g\u001a\u00020\u00002\u0006\u0010i\u001a\u00020h2\u0006\u0010k\u001a\u00020jH\u0001¢\u0006\u0004\bm\u0010nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010p\u001a\u0004\bq\u00103R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010r\u001a\u0004\bs\u00105R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010r\u001a\u0004\bt\u00105R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010u\u001a\u0004\bv\u00108R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010u\u001a\u0004\bw\u00108R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010x\u001a\u0004\by\u0010;R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010z\u001a\u0004\b{\u0010=R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010|\u001a\u0004\b}\u0010?R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010~\u001a\u0004\b\u007f\u0010AR%\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\u000e\n\u0005\b\u0016\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010CR\u0019\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\u000e\n\u0005\b\u0018\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010ER\u0019\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\b\u001a\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010GR\u0019\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\u000e\n\u0005\b\u001c\u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010IR&\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u001e\u0010\u0088\u0001\u0012\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0005\b\u0089\u0001\u0010KR&\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b \u0010\u008c\u0001\u0012\u0006\b\u008e\u0001\u0010\u008b\u0001\u001a\u0005\b\u008d\u0001\u0010MR$\u0010\"\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\"\u0010\u008f\u0001\u0012\u0006\b\u0091\u0001\u0010\u008b\u0001\u001a\u0005\b\u0090\u0001\u0010OR\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\r\n\u0004\b#\u0010x\u001a\u0005\b\u0092\u0001\u0010;R\u0018\u0010$\u001a\u00020!8\u0006¢\u0006\r\n\u0005\b$\u0010\u008f\u0001\u001a\u0004\b$\u0010OR\u0015\u0010\u0096\u0001\u001a\u00030\u0093\u00018F¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0013\u0010\u0098\u0001\u001a\u00020\u001d8F¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010VR\u0016\u0010\u009b\u0001\u001a\u0004\u0018\u00010\b8F¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0013\u0010\u009d\u0001\u001a\u00020\u001d8F¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010VR\u0016\u0010 \u0001\u001a\u0004\u0018\u00010]8F¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0013\u0010¢\u0001\u001a\u00020\u001d8F¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010VR\u0016\u0010¥\u0001\u001a\u0004\u0018\u00010a8F¢\u0006\b\u001a\u0006\b£\u0001\u0010¤\u0001R\u0013\u0010§\u0001\u001a\u00020\u001d8F¢\u0006\u0007\u001a\u0005\b¦\u0001\u0010VR\u0013\u0010©\u0001\u001a\u00020!8F¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010OR\u0016\u0010¬\u0001\u001a\u0004\u0018\u00010\f8F¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001¨\u0006°\u0001"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "", "", "name", "", "parentTemplateId", "workoutTemplateId", "", "Lcom/whoop/weightlifting/data/domain/WorkoutGroup;", "groups", "originalGroups", "", "Ljava/util/UUID;", "idsOfExpandedExercises", "Lorg/joda/time/DateTime;", "startTime", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;", "positionInWorkout", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;", "currentSetState", "", "Lcom/whoop/weightlifting/data/domain/CompletedSetData;", "completedSetData", "Lcom/whoop/weightlifting/data/domain/StrapLocation;", "strapLocation", "Lcom/whoop/weightlifting/data/domain/StrapLaterality;", "strapLaterality", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;", "analytics", "", "rpe", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;", "currentDialog", "", "shouldReturnToWorkoutLibrary", "manuallyEditedSetIds", "isSimpleStrengthLogging", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;Z)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/util/Set;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "completedTime", "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;", "toCompletedWeightliftingWorkout", "(Lorg/joda/time/DateTime;)Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;", "id", "getSetPositionById", "(Ljava/util/UUID;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Long;", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "()Ljava/util/Set;", "component7", "()Lorg/joda/time/DateTime;", "component8", "()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;", "component9", "()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;", "component10", "()Ljava/util/Map;", "component11", "()Lcom/whoop/weightlifting/data/domain/StrapLocation;", "component12", "()Lcom/whoop/weightlifting/data/domain/StrapLaterality;", "component13", "()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;", "component14", "()Ljava/lang/Integer;", "component15", "()Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;", "component16", "()Z", "component17", "component18", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;Z)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutGroup;", "toWeightliftingWorkoutGroup", "(Lcom/whoop/weightlifting/data/domain/WorkoutGroup;)Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutGroup;", "Lcom/whoop/weightlifting/data/domain/WorkoutExercise;", "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;", "toWeightliftingWorkoutExercise", "(Lcom/whoop/weightlifting/data/domain/WorkoutExercise;)Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;", "Lcom/whoop/weightlifting/data/domain/WorkoutSet;", "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "exercise", "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;", "toWeightliftingWorkoutSet", "(Lcom/whoop/weightlifting/data/domain/WorkoutSet;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;)Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getName", "Ljava/lang/Long;", "getParentTemplateId", "getWorkoutTemplateId", "Ljava/util/List;", "getGroups", "getOriginalGroups", "Ljava/util/Set;", "getIdsOfExpandedExercises", "Lorg/joda/time/DateTime;", "getStartTime", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;", "getPositionInWorkout", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;", "getCurrentSetState", "Ljava/util/Map;", "getCompletedSetData", "Lcom/whoop/weightlifting/data/domain/StrapLocation;", "getStrapLocation", "Lcom/whoop/weightlifting/data/domain/StrapLaterality;", "getStrapLaterality", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;", "getAnalytics", "Ljava/lang/Integer;", "getRpe", "getRpe$annotations", "()V", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;", "getCurrentDialog", "getCurrentDialog$annotations", "Z", "getShouldReturnToWorkoutLibrary", "getShouldReturnToWorkoutLibrary$annotations", "getManuallyEditedSetIds", "Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;", "getWorkoutTemplate", "()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;", "workoutTemplate", "getCurrentGroupIndex", "currentGroupIndex", "getCurrentGroup", "()Lcom/whoop/weightlifting/data/domain/WorkoutGroup;", "currentGroup", "getCurrentExerciseIndex", "currentExerciseIndex", "getCurrentExercise", "()Lcom/whoop/weightlifting/data/domain/WorkoutExercise;", "currentExercise", "getCurrentSetIndex", "currentSetIndex", "getCurrentSet", "()Lcom/whoop/weightlifting/data/domain/WorkoutSet;", "currentSet", "getNumSetsLeft", "numSetsLeft", "getFinishedFinalSet", "finishedFinalSet", "getLastCompletedSetId", "()Ljava/util/UUID;", "lastCompletedSetId", "Companion", "$serializer", "a", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ActiveWorkout {
    private static final InterfaceC23462h[] $childSerializers;
    private final WorkoutAnalytics analytics;
    private final Map<UUID, CompletedSetData> completedSetData;
    private final InterfaceC10768a currentDialog;
    private final CurrentSetState currentSetState;
    private final List<WorkoutGroup> groups;
    private final Set<UUID> idsOfExpandedExercises;
    private final boolean isSimpleStrengthLogging;
    private final Set<UUID> manuallyEditedSetIds;
    private final String name;
    private final List<WorkoutGroup> originalGroups;
    private final Long parentTemplateId;
    private final PositionInWorkout positionInWorkout;
    private final Integer rpe;
    private final boolean shouldReturnToWorkoutLibrary;
    private final DateTime startTime;
    private final StrapLaterality strapLaterality;
    private final StrapLocation strapLocation;
    private final Long workoutTemplateId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkout$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ActiveWorkout$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C26995a(15)), AbstractC30060g.m92087G(enumC23463i, new C26995a(16)), AbstractC30060g.m92087G(enumC23463i, new C26995a(17)), AbstractC30060g.m92087G(enumC23463i, new C26995a(18)), null, AbstractC30060g.m92087G(enumC23463i, new C26995a(19)), AbstractC30060g.m92087G(enumC23463i, new C26995a(20)), AbstractC30060g.m92087G(enumC23463i, new C26995a(21)), AbstractC30060g.m92087G(enumC23463i, new C26995a(22)), null, AbstractC30060g.m92087G(enumC23463i, new C26995a(23)), null};
    }

    public /* synthetic */ ActiveWorkout(int i13, String str, Long l7, Long l12, List list, List list2, Set set, DateTime dateTime, PositionInWorkout positionInWorkout, CurrentSetState currentSetState, Map map, StrapLocation strapLocation, StrapLaterality strapLaterality, WorkoutAnalytics workoutAnalytics, Set set2, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        List list3 = list;
        if (4079 != (i13 & 4079)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 4079, ActiveWorkout$$serializer.INSTANCE.getDescriptor());
        }
        this.name = str;
        this.parentTemplateId = l7;
        this.workoutTemplateId = l12;
        this.groups = list3;
        this.originalGroups = (i13 & 16) != 0 ? list2 : list3;
        this.idsOfExpandedExercises = set;
        this.startTime = dateTime;
        this.positionInWorkout = positionInWorkout;
        this.currentSetState = currentSetState;
        this.completedSetData = map;
        this.strapLocation = strapLocation;
        this.strapLaterality = strapLaterality;
        if ((i13 & 4096) == 0) {
            this.analytics = new WorkoutAnalytics(0, 0, 0, 0, 0, 0, 0, false, (Set) null, (Set) null, false, 2047, (DefaultConstructorMarker) null);
        } else {
            this.analytics = workoutAnalytics;
        }
        this.rpe = null;
        this.currentDialog = null;
        this.shouldReturnToWorkoutLibrary = false;
        this.manuallyEditedSetIds = (i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0 ? C25235a0.f99113w : set2;
        if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0) {
            this.isSimpleStrengthLogging = false;
        } else {
            this.isSimpleStrengthLogging = z4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(WorkoutGroup$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(WorkoutGroup$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new LinkedHashSetSerializer(C24753c.f96791a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$2() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(DateTime.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$3() {
        return CurrentSetState.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$4() {
        return new LinkedHashMapSerializer(C24753c.f96791a, CompletedSetData$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$5() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.weightlifting.data.domain.StrapLocation", StrapLocation.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$6() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.weightlifting.data.domain.StrapLaterality", StrapLaterality.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$7() {
        return new LinkedHashSetSerializer(C24753c.f96791a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActiveWorkout copy$default(ActiveWorkout activeWorkout, String str, Long l7, Long l12, List list, List list2, Set set, DateTime dateTime, PositionInWorkout positionInWorkout, CurrentSetState currentSetState, Map map, StrapLocation strapLocation, StrapLaterality strapLaterality, WorkoutAnalytics workoutAnalytics, Integer num, InterfaceC10768a interfaceC10768a, boolean z4, Set set2, boolean z13, int i13, Object obj) {
        boolean z14;
        Set set3;
        String str2 = (i13 & 1) != 0 ? activeWorkout.name : str;
        Long l13 = (i13 & 2) != 0 ? activeWorkout.parentTemplateId : l7;
        Long l14 = (i13 & 4) != 0 ? activeWorkout.workoutTemplateId : l12;
        List list3 = (i13 & 8) != 0 ? activeWorkout.groups : list;
        List list4 = (i13 & 16) != 0 ? activeWorkout.originalGroups : list2;
        Set set4 = (i13 & 32) != 0 ? activeWorkout.idsOfExpandedExercises : set;
        DateTime dateTime2 = (i13 & 64) != 0 ? activeWorkout.startTime : dateTime;
        PositionInWorkout positionInWorkout2 = (i13 & 128) != 0 ? activeWorkout.positionInWorkout : positionInWorkout;
        CurrentSetState currentSetState2 = (i13 & 256) != 0 ? activeWorkout.currentSetState : currentSetState;
        Map map2 = (i13 & 512) != 0 ? activeWorkout.completedSetData : map;
        StrapLocation strapLocation2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? activeWorkout.strapLocation : strapLocation;
        StrapLaterality strapLaterality2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? activeWorkout.strapLaterality : strapLaterality;
        WorkoutAnalytics workoutAnalytics2 = (i13 & 4096) != 0 ? activeWorkout.analytics : workoutAnalytics;
        Integer num2 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? activeWorkout.rpe : num;
        String str3 = str2;
        InterfaceC10768a interfaceC10768a2 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? activeWorkout.currentDialog : interfaceC10768a;
        boolean z15 = (i13 & 32768) != 0 ? activeWorkout.shouldReturnToWorkoutLibrary : z4;
        Set set5 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? activeWorkout.manuallyEditedSetIds : set2;
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0) {
            set3 = set5;
            z14 = activeWorkout.isSimpleStrengthLogging;
        } else {
            z14 = z13;
            set3 = set5;
        }
        return activeWorkout.copy(str3, l13, l14, list3, list4, set4, dateTime2, positionInWorkout2, currentSetState2, map2, strapLocation2, strapLaterality2, workoutAnalytics2, num2, interfaceC10768a2, z15, set3, z14);
    }

    public static /* synthetic */ void getCurrentDialog$annotations() {
    }

    public static /* synthetic */ void getRpe$annotations() {
    }

    public static /* synthetic */ void getShouldReturnToWorkoutLibrary$annotations() {
    }

    private final WeightliftingWorkoutExercise toWeightliftingWorkoutExercise(WorkoutExercise workoutExercise) {
        WeightliftingExercise exercise = workoutExercise.getExercise();
        List<WorkoutSet> sets = workoutExercise.getSets();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sets, 10));
        Iterator<T> it = sets.iterator();
        while (it.hasNext()) {
            arrayList.add(toWeightliftingWorkoutSet((WorkoutSet) it.next(), workoutExercise.getExercise()));
        }
        return new WeightliftingWorkoutExercise(arrayList, exercise);
    }

    private final WeightliftingWorkoutGroup toWeightliftingWorkoutGroup(WorkoutGroup workoutGroup) {
        List<WorkoutExercise> exercises = workoutGroup.getExercises();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(exercises, 10));
        Iterator<T> it = exercises.iterator();
        while (it.hasNext()) {
            arrayList.add(toWeightliftingWorkoutExercise((WorkoutExercise) it.next()));
        }
        return new WeightliftingWorkoutGroup(arrayList);
    }

    private final WeightliftingWorkoutSet toWeightliftingWorkoutSet(WorkoutSet workoutSet, WeightliftingExercise weightliftingExercise) {
        Integer numValueOf = this.completedSetData.containsKey(workoutSet.getId()) ? Integer.valueOf(workoutSet.getNumberOfRepsAsInt()) : null;
        Integer timeAsIntSeconds = this.completedSetData.containsKey(workoutSet.getId()) ? workoutSet.getTimeAsIntSeconds() : null;
        Float fValueOf = this.completedSetData.containsKey(workoutSet.getId()) ? Float.valueOf(workoutSet.getWeightAsFloat()) : null;
        UUID id4 = workoutSet.getId();
        boolean trackable = weightliftingExercise.getTrackable();
        CompletedSetData completedSetData = this.completedSetData.get(workoutSet.getId());
        DateTimeRange during = completedSetData != null ? completedSetData.getDuring() : null;
        CompletedSetData completedSetData2 = this.completedSetData.get(workoutSet.getId());
        StrapLocation strapLocation = completedSetData2 != null ? completedSetData2.getStrapLocation() : null;
        CompletedSetData completedSetData3 = this.completedSetData.get(workoutSet.getId());
        return new WeightliftingWorkoutSet(numValueOf, timeAsIntSeconds, fValueOf, id4, trackable, during, strapLocation, completedSetData3 != null ? completedSetData3.getStrapLaterality() : null);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00d0  */
    public static final /* synthetic */ void write$Self$weightlifting_release(ActiveWorkout self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.name);
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, longSerializer, self.parentTemplateId);
        output.encodeNullableSerializableElement(serialDesc, 2, longSerializer, self.workoutTemplateId);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.groups);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.originalGroups, self.groups)) {
            output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.originalGroups);
        }
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.idsOfExpandedExercises);
        output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.startTime);
        output.encodeNullableSerializableElement(serialDesc, 7, PositionInWorkout$$serializer.INSTANCE, self.positionInWorkout);
        output.encodeSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.currentSetState);
        output.encodeSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.completedSetData);
        output.encodeSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.strapLocation);
        output.encodeSerializableElement(serialDesc, 11, (InterfaceC37145j) interfaceC23462hArr[11].getValue(), self.strapLaterality);
        if (output.shouldEncodeElementDefault(serialDesc, 12)) {
            output.encodeSerializableElement(serialDesc, 12, WorkoutAnalytics$$serializer.INSTANCE, self.analytics);
        } else {
            if (!AbstractC22676k.m65745e(self.analytics, new WorkoutAnalytics(0, 0, 0, 0, 0, 0, 0, false, (Set) null, (Set) null, false, 2047, (DefaultConstructorMarker) null))) {
                output.encodeSerializableElement(serialDesc, 12, WorkoutAnalytics$$serializer.INSTANCE, self.analytics);
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || !AbstractC22676k.m65745e(self.manuallyEditedSetIds, C25235a0.f99113w)) {
            output.encodeSerializableElement(serialDesc, 13, (InterfaceC37145j) interfaceC23462hArr[13].getValue(), self.manuallyEditedSetIds);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.isSimpleStrengthLogging) {
            output.encodeBooleanElement(serialDesc, 14, self.isSimpleStrengthLogging);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final Map<UUID, CompletedSetData> component10() {
        return this.completedSetData;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final StrapLocation getStrapLocation() {
        return this.strapLocation;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final StrapLaterality getStrapLaterality() {
        return this.strapLaterality;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final WorkoutAnalytics getAnalytics() {
        return this.analytics;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getRpe() {
        return this.rpe;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final InterfaceC10768a getCurrentDialog() {
        return this.currentDialog;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getShouldReturnToWorkoutLibrary() {
        return this.shouldReturnToWorkoutLibrary;
    }

    public final Set<UUID> component17() {
        return this.manuallyEditedSetIds;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getIsSimpleStrengthLogging() {
        return this.isSimpleStrengthLogging;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getParentTemplateId() {
        return this.parentTemplateId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getWorkoutTemplateId() {
        return this.workoutTemplateId;
    }

    public final List<WorkoutGroup> component4() {
        return this.groups;
    }

    public final List<WorkoutGroup> component5() {
        return this.originalGroups;
    }

    public final Set<UUID> component6() {
        return this.idsOfExpandedExercises;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final DateTime getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final PositionInWorkout getPositionInWorkout() {
        return this.positionInWorkout;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final CurrentSetState getCurrentSetState() {
        return this.currentSetState;
    }

    public final ActiveWorkout copy(String name, Long parentTemplateId, Long workoutTemplateId, List<WorkoutGroup> groups, List<WorkoutGroup> originalGroups, Set<UUID> idsOfExpandedExercises, DateTime startTime, PositionInWorkout positionInWorkout, CurrentSetState currentSetState, Map<UUID, CompletedSetData> completedSetData, StrapLocation strapLocation, StrapLaterality strapLaterality, WorkoutAnalytics analytics, Integer rpe, InterfaceC10768a currentDialog, boolean shouldReturnToWorkoutLibrary, Set<UUID> manuallyEditedSetIds, boolean isSimpleStrengthLogging) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(groups, "groups");
        AbstractC22676k.m65750j(originalGroups, "originalGroups");
        AbstractC22676k.m65750j(idsOfExpandedExercises, "idsOfExpandedExercises");
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(currentSetState, "currentSetState");
        AbstractC22676k.m65750j(completedSetData, "completedSetData");
        AbstractC22676k.m65750j(strapLocation, "strapLocation");
        AbstractC22676k.m65750j(strapLaterality, "strapLaterality");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(manuallyEditedSetIds, "manuallyEditedSetIds");
        return new ActiveWorkout(name, parentTemplateId, workoutTemplateId, groups, originalGroups, idsOfExpandedExercises, startTime, positionInWorkout, currentSetState, completedSetData, strapLocation, strapLaterality, analytics, rpe, currentDialog, shouldReturnToWorkoutLibrary, manuallyEditedSetIds, isSimpleStrengthLogging);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActiveWorkout)) {
            return false;
        }
        ActiveWorkout activeWorkout = (ActiveWorkout) other;
        return AbstractC22676k.m65745e(this.name, activeWorkout.name) && AbstractC22676k.m65745e(this.parentTemplateId, activeWorkout.parentTemplateId) && AbstractC22676k.m65745e(this.workoutTemplateId, activeWorkout.workoutTemplateId) && AbstractC22676k.m65745e(this.groups, activeWorkout.groups) && AbstractC22676k.m65745e(this.originalGroups, activeWorkout.originalGroups) && AbstractC22676k.m65745e(this.idsOfExpandedExercises, activeWorkout.idsOfExpandedExercises) && AbstractC22676k.m65745e(this.startTime, activeWorkout.startTime) && AbstractC22676k.m65745e(this.positionInWorkout, activeWorkout.positionInWorkout) && AbstractC22676k.m65745e(this.currentSetState, activeWorkout.currentSetState) && AbstractC22676k.m65745e(this.completedSetData, activeWorkout.completedSetData) && this.strapLocation == activeWorkout.strapLocation && this.strapLaterality == activeWorkout.strapLaterality && AbstractC22676k.m65745e(this.analytics, activeWorkout.analytics) && AbstractC22676k.m65745e(this.rpe, activeWorkout.rpe) && AbstractC22676k.m65745e(this.currentDialog, activeWorkout.currentDialog) && this.shouldReturnToWorkoutLibrary == activeWorkout.shouldReturnToWorkoutLibrary && AbstractC22676k.m65745e(this.manuallyEditedSetIds, activeWorkout.manuallyEditedSetIds) && this.isSimpleStrengthLogging == activeWorkout.isSimpleStrengthLogging;
    }

    public final WorkoutAnalytics getAnalytics() {
        return this.analytics;
    }

    public final Map<UUID, CompletedSetData> getCompletedSetData() {
        return this.completedSetData;
    }

    public final InterfaceC10768a getCurrentDialog() {
        return this.currentDialog;
    }

    public final WorkoutExercise getCurrentExercise() {
        List<WorkoutExercise> exercises;
        WorkoutGroup currentGroup = getCurrentGroup();
        if (currentGroup == null || (exercises = currentGroup.getExercises()) == null) {
            return null;
        }
        return (WorkoutExercise) AbstractC25265s.m74102I0(getCurrentExerciseIndex(), exercises);
    }

    public final int getCurrentExerciseIndex() {
        WorkoutGroup currentGroup;
        List<WorkoutExercise> exercises;
        PositionInWorkout positionInWorkout = this.positionInWorkout;
        if (positionInWorkout != null && (currentGroup = getCurrentGroup()) != null && (exercises = currentGroup.getExercises()) != null) {
            Iterator<WorkoutExercise> it = exercises.iterator();
            int i13 = 0;
            while (it.hasNext()) {
                if (AbstractC22676k.m65745e(it.next().getId(), positionInWorkout.getExerciseId())) {
                    return i13;
                }
                i13++;
            }
        }
        return -1;
    }

    public final WorkoutGroup getCurrentGroup() {
        return (WorkoutGroup) AbstractC25265s.m74102I0(getCurrentGroupIndex(), this.groups);
    }

    public final int getCurrentGroupIndex() {
        PositionInWorkout positionInWorkout = this.positionInWorkout;
        if (positionInWorkout != null) {
            Iterator<WorkoutGroup> it = this.groups.iterator();
            int i13 = 0;
            while (it.hasNext()) {
                if (AbstractC22676k.m65745e(it.next().getId(), positionInWorkout.getGroupId())) {
                    return i13;
                }
                i13++;
            }
        }
        return -1;
    }

    public final WorkoutSet getCurrentSet() {
        List<WorkoutSet> sets;
        WorkoutExercise currentExercise = getCurrentExercise();
        if (currentExercise == null || (sets = currentExercise.getSets()) == null) {
            return null;
        }
        return (WorkoutSet) AbstractC25265s.m74102I0(getCurrentSetIndex(), sets);
    }

    public final int getCurrentSetIndex() {
        WorkoutExercise currentExercise;
        List<WorkoutSet> sets;
        PositionInWorkout positionInWorkout = this.positionInWorkout;
        if (positionInWorkout != null && (currentExercise = getCurrentExercise()) != null && (sets = currentExercise.getSets()) != null) {
            Iterator<WorkoutSet> it = sets.iterator();
            int i13 = 0;
            while (it.hasNext()) {
                if (AbstractC22676k.m65745e(it.next().getId(), positionInWorkout.getSetId())) {
                    return i13;
                }
                i13++;
            }
        }
        return -1;
    }

    public final CurrentSetState getCurrentSetState() {
        return this.currentSetState;
    }

    public final boolean getFinishedFinalSet() {
        return !this.groups.isEmpty() && getNumSetsLeft() == 0;
    }

    public final List<WorkoutGroup> getGroups() {
        return this.groups;
    }

    public final Set<UUID> getIdsOfExpandedExercises() {
        return this.idsOfExpandedExercises;
    }

    public final UUID getLastCompletedSetId() {
        Object next;
        Iterator<T> it = this.completedSetData.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                DateTime upper = ((CompletedSetData) ((Map.Entry) next).getValue()).getDuring().getUpper();
                long millis = upper != null ? upper.getMillis() : 0L;
                do {
                    Object next2 = it.next();
                    DateTime upper2 = ((CompletedSetData) ((Map.Entry) next2).getValue()).getDuring().getUpper();
                    long millis2 = upper2 != null ? upper2.getMillis() : 0L;
                    if (millis < millis2) {
                        next = next2;
                        millis = millis2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (UUID) entry.getKey();
        }
        return null;
    }

    public final Set<UUID> getManuallyEditedSetIds() {
        return this.manuallyEditedSetIds;
    }

    public final String getName() {
        return this.name;
    }

    public final int getNumSetsLeft() {
        Iterator<T> it = this.groups.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            Iterator<T> it3 = ((WorkoutGroup) it.next()).getExercises().iterator();
            int size = 0;
            while (it3.hasNext()) {
                size += ((WorkoutExercise) it3.next()).getSets().size();
            }
            i13 += size;
        }
        return i13 - this.completedSetData.size();
    }

    public final List<WorkoutGroup> getOriginalGroups() {
        return this.originalGroups;
    }

    public final Long getParentTemplateId() {
        return this.parentTemplateId;
    }

    public final PositionInWorkout getPositionInWorkout() {
        return this.positionInWorkout;
    }

    public final Integer getRpe() {
        return this.rpe;
    }

    public final PositionInWorkout getSetPositionById(UUID id4) {
        AbstractC22676k.m65750j(id4, "id");
        for (WorkoutGroup workoutGroup : this.groups) {
            for (WorkoutExercise workoutExercise : workoutGroup.getExercises()) {
                for (WorkoutSet workoutSet : workoutExercise.getSets()) {
                    if (AbstractC22676k.m65745e(workoutSet.getId(), id4)) {
                        return new PositionInWorkout(workoutGroup.getId(), workoutExercise.getId(), workoutSet.getId());
                    }
                }
            }
        }
        return null;
    }

    public final boolean getShouldReturnToWorkoutLibrary() {
        return this.shouldReturnToWorkoutLibrary;
    }

    public final DateTime getStartTime() {
        return this.startTime;
    }

    public final StrapLaterality getStrapLaterality() {
        return this.strapLaterality;
    }

    public final StrapLocation getStrapLocation() {
        return this.strapLocation;
    }

    public final WorkoutTemplate getWorkoutTemplate() {
        return new WorkoutTemplate(this.parentTemplateId, this.workoutTemplateId, this.name, this.groups, (String) null, 16, (DefaultConstructorMarker) null);
    }

    public final Long getWorkoutTemplateId() {
        return this.workoutTemplateId;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        Long l7 = this.parentTemplateId;
        int iHashCode2 = (iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l12 = this.workoutTemplateId;
        int iHashCode3 = (this.startTime.hashCode() + AbstractC25012a.m73368a(this.idsOfExpandedExercises, AbstractC11895b.m31983b(AbstractC11895b.m31983b((iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31, 31, this.groups), 31, this.originalGroups), 31)) * 31;
        PositionInWorkout positionInWorkout = this.positionInWorkout;
        int iHashCode4 = (this.analytics.hashCode() + ((this.strapLaterality.hashCode() + ((this.strapLocation.hashCode() + AbstractC3855a.m11821e(this.completedSetData, (this.currentSetState.hashCode() + ((iHashCode3 + (positionInWorkout == null ? 0 : positionInWorkout.hashCode())) * 31)) * 31, 31)) * 31)) * 31)) * 31;
        Integer num = this.rpe;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        InterfaceC10768a interfaceC10768a = this.currentDialog;
        return Boolean.hashCode(this.isSimpleStrengthLogging) + AbstractC25012a.m73368a(this.manuallyEditedSetIds, AbstractC2875y.m8289b((iHashCode5 + (interfaceC10768a != null ? interfaceC10768a.hashCode() : 0)) * 31, 31, this.shouldReturnToWorkoutLibrary), 31);
    }

    public final boolean isSimpleStrengthLogging() {
        return this.isSimpleStrengthLogging;
    }

    public final WeightliftingWorkout toCompletedWeightliftingWorkout(DateTime completedTime) {
        AbstractC22676k.m65750j(completedTime, "completedTime");
        DateTimeRange dateTimeRange = new DateTimeRange(this.startTime, completedTime, null, null, 12, null);
        DateTimeZone zone = completedTime.getZone();
        AbstractC22676k.m65749i(zone, "getZone(...)");
        String str = this.name;
        Long l7 = this.workoutTemplateId;
        Integer num = this.rpe;
        Integer numValueOf = num != null ? Integer.valueOf((int) Math.ceil(num.intValue() / 2)) : null;
        List<WorkoutGroup> list = this.groups;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toWeightliftingWorkoutGroup((WorkoutGroup) it.next()));
        }
        return new WeightliftingWorkout(null, dateTimeRange, zone, str, 0.0d, 0.0d, 0.0d, 0.0d, l7, numValueOf, arrayList, this.isSimpleStrengthLogging, 1, null);
    }

    public String toString() {
        return "ActiveWorkout(name=" + this.name + ", parentTemplateId=" + this.parentTemplateId + ", workoutTemplateId=" + this.workoutTemplateId + ", groups=" + this.groups + ", originalGroups=" + this.originalGroups + ", idsOfExpandedExercises=" + this.idsOfExpandedExercises + ", startTime=" + this.startTime + ", positionInWorkout=" + this.positionInWorkout + ", currentSetState=" + this.currentSetState + ", completedSetData=" + this.completedSetData + ", strapLocation=" + this.strapLocation + ", strapLaterality=" + this.strapLaterality + ", analytics=" + this.analytics + ", rpe=" + this.rpe + ", currentDialog=" + this.currentDialog + ", shouldReturnToWorkoutLibrary=" + this.shouldReturnToWorkoutLibrary + ", manuallyEditedSetIds=" + this.manuallyEditedSetIds + ", isSimpleStrengthLogging=" + this.isSimpleStrengthLogging + ")";
    }

    public ActiveWorkout(String name, Long l7, Long l12, List<WorkoutGroup> groups, List<WorkoutGroup> originalGroups, Set<UUID> idsOfExpandedExercises, DateTime startTime, PositionInWorkout positionInWorkout, CurrentSetState currentSetState, Map<UUID, CompletedSetData> completedSetData, StrapLocation strapLocation, StrapLaterality strapLaterality, WorkoutAnalytics analytics, Integer num, InterfaceC10768a interfaceC10768a, boolean z4, Set<UUID> manuallyEditedSetIds, boolean z13) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(groups, "groups");
        AbstractC22676k.m65750j(originalGroups, "originalGroups");
        AbstractC22676k.m65750j(idsOfExpandedExercises, "idsOfExpandedExercises");
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(currentSetState, "currentSetState");
        AbstractC22676k.m65750j(completedSetData, "completedSetData");
        AbstractC22676k.m65750j(strapLocation, "strapLocation");
        AbstractC22676k.m65750j(strapLaterality, "strapLaterality");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(manuallyEditedSetIds, "manuallyEditedSetIds");
        this.name = name;
        this.parentTemplateId = l7;
        this.workoutTemplateId = l12;
        this.groups = groups;
        this.originalGroups = originalGroups;
        this.idsOfExpandedExercises = idsOfExpandedExercises;
        this.startTime = startTime;
        this.positionInWorkout = positionInWorkout;
        this.currentSetState = currentSetState;
        this.completedSetData = completedSetData;
        this.strapLocation = strapLocation;
        this.strapLaterality = strapLaterality;
        this.analytics = analytics;
        this.rpe = num;
        this.currentDialog = interfaceC10768a;
        this.shouldReturnToWorkoutLibrary = z4;
        this.manuallyEditedSetIds = manuallyEditedSetIds;
        this.isSimpleStrengthLogging = z13;
    }

    public /* synthetic */ ActiveWorkout(String str, Long l7, Long l12, List list, List list2, Set set, DateTime dateTime, PositionInWorkout positionInWorkout, CurrentSetState currentSetState, Map map, StrapLocation strapLocation, StrapLaterality strapLaterality, WorkoutAnalytics workoutAnalytics, Integer num, InterfaceC10768a interfaceC10768a, boolean z4, Set set2, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l7, l12, list, (i13 & 16) != 0 ? list : list2, set, dateTime, positionInWorkout, currentSetState, map, strapLocation, strapLaterality, (i13 & 4096) != 0 ? new WorkoutAnalytics(0, 0, 0, 0, 0, 0, 0, false, (Set) null, (Set) null, false, 2047, (DefaultConstructorMarker) null) : workoutAnalytics, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : num, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : interfaceC10768a, (32768 & i13) != 0 ? false : z4, (65536 & i13) != 0 ? C25235a0.f99113w : set2, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? false : z13);
    }
}
