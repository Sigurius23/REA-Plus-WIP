package com.whoop.weightlifting.feature.active.activeworkout.domain;

import androidx.lifecycle.C1601k1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.weightlifting.data.WeightliftingApi;
import com.whoop.weightlifting.data.domain.CompletedSetData;
import com.whoop.weightlifting.data.domain.StrapLaterality;
import com.whoop.weightlifting.data.domain.StrapLocation;
import com.whoop.weightlifting.data.domain.VolumeInputFormat;
import com.whoop.weightlifting.data.domain.WeightliftingWorkoutKt;
import com.whoop.weightlifting.data.domain.WorkoutExercise;
import com.whoop.weightlifting.data.domain.WorkoutGroup;
import com.whoop.weightlifting.data.domain.WorkoutSessionState;
import com.whoop.weightlifting.data.domain.WorkoutSet;
import com.whoop.weightlifting.data.domain.WorkoutTemplate;
import com.whoop.weightlifting.data.domain.WorkoutTemplateKt;
import com.whoop.weightlifting.data.dto.WeightliftingWorkoutDto;
import com.whoop.weightlifting.data.dto.WorkoutTemplateDto;
import com.whoop.weightlifting.workmanagers.SavingWorkoutInBackgroundWorker;
import com.whoop.weightlifting.workmanagers.UpdatingTemplateInBackgroundWorker;
import dt0.InterfaceC12362e;
import du2.AbstractC12378b;
import du2.EnumC12379c;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13075p1;
import fi0.InterfaceC14515a;
import fu2.C14788c;
import fu2.C14789d;
import fu2.C14794i;
import fu2.InterfaceC14786a;
import fu2.InterfaceC14787b;
import fu2.InterfaceC14792g;
import i92.InterfaceC18260e;
import ih0.AbstractC18489d0;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iu2.C20938b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import l83.C23465k;
import lf1.C24003m;
import lf1.EnumC24004n;
import lu2.C24755e;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25272z;
import mi1.C25575d;
import nu2.AbstractC27147d;
import nu2.EnumC27144a;
import or2.AbstractC28181m0;
import or2.AbstractC28190p0;
import org.joda.time.DateTime;
import org.joda.time.Seconds;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p218ic.AbstractC18377p0;
import p218ic.InterfaceC18355e0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22665e0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.AbstractC34386b;
import u02.InterfaceC34385a;
import u92.C34660d;
import wb3.AbstractC37056f;
import wm0.C37378a;
import y82.EnumC39339b;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: com.whoop.weightlifting.feature.active.activeworkout.domain.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000²\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J6\u0010.\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010-\u001a\u00020,H\u0086@¢\u0006\u0004\b.\u0010/J*\u00106\u001a\u0004\u0018\u00010&2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0082@¢\u0006\u0004\b6\u00107J\u0015\u0010:\u001a\u0004\u0018\u000109*\u000208H\u0002¢\u0006\u0004\b:\u0010;J\u0013\u0010<\u001a\u00020&*\u00020&H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u0004\u0018\u00010&*\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b>\u0010=J\u0013\u0010?\u001a\u00020&*\u00020&H\u0002¢\u0006\u0004\b?\u0010=J\u0013\u0010@\u001a\u00020&*\u00020&H\u0002¢\u0006\u0004\b@\u0010=J+\u0010D\u001a\u00020&*\u00020&2\u0006\u0010+\u001a\u00020*2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u000204H\u0002¢\u0006\u0004\bD\u0010EJ\u0013\u0010F\u001a\u000204*\u00020&H\u0002¢\u0006\u0004\bF\u0010GJ\u001b\u0010H\u001a\u00020&*\u00020&2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bH\u0010IJ\u0013\u0010J\u001a\u000204*\u00020&H\u0002¢\u0006\u0004\bJ\u0010GJ$\u0010K\u001a\u00020&*\u00020&2\u0006\u0010+\u001a\u00020*2\u0006\u0010B\u001a\u00020AH\u0082@¢\u0006\u0004\bK\u0010LJ\u0013\u0010M\u001a\u00020&*\u00020&H\u0002¢\u0006\u0004\bM\u0010=J\u0010\u0010N\u001a\u000204H\u0082@¢\u0006\u0004\bN\u0010OJ\u0013\u0010P\u001a\u00020&*\u00020&H\u0002¢\u0006\u0004\bP\u0010=J\u001b\u0010R\u001a\u00020&*\u00020&2\u0006\u0010Q\u001a\u000209H\u0002¢\u0006\u0004\bR\u0010SJ\u001b\u0010V\u001a\u00020&*\u00020&2\u0006\u0010U\u001a\u00020TH\u0002¢\u0006\u0004\bV\u0010WJ\u001c\u0010X\u001a\u00020&*\u00020&2\u0006\u0010-\u001a\u00020,H\u0082@¢\u0006\u0004\bX\u0010YJ\u0014\u0010Z\u001a\u00020&*\u00020&H\u0082@¢\u0006\u0004\bZ\u0010[J \u0010^\u001a\u00020&*\u00020&2\n\u0010]\u001a\u0006\u0012\u0002\b\u00030\\H\u0082@¢\u0006\u0004\b^\u0010_J\u001c\u0010`\u001a\u00020&*\u00020&2\u0006\u0010-\u001a\u00020,H\u0082@¢\u0006\u0004\b`\u0010YJ\u0013\u0010a\u001a\u00020&*\u00020&H\u0002¢\u0006\u0004\ba\u0010=J#\u0010e\u001a\u00020&*\u00020&2\u0006\u0010c\u001a\u00020b2\u0006\u0010d\u001a\u00020bH\u0002¢\u0006\u0004\be\u0010fJ\u0013\u0010g\u001a\u00020&*\u00020&H\u0002¢\u0006\u0004\bg\u0010=J%\u0010k\u001a\u00020&*\u00020&2\u0006\u0010)\u001a\u00020h2\b\b\u0002\u0010j\u001a\u00020iH\u0002¢\u0006\u0004\bk\u0010lJ\u001b\u0010n\u001a\u00020&*\u00020&2\u0006\u0010)\u001a\u00020mH\u0002¢\u0006\u0004\bn\u0010oJ\u0013\u0010p\u001a\u00020&*\u00020&H\u0002¢\u0006\u0004\bp\u0010=J\u001b\u0010r\u001a\u00020&*\u00020&2\u0006\u0010q\u001a\u000209H\u0002¢\u0006\u0004\br\u0010SJ\u0013\u0010s\u001a\u00020&*\u00020&H\u0002¢\u0006\u0004\bs\u0010=J\u0013\u0010t\u001a\u00020&*\u00020&H\u0002¢\u0006\u0004\bt\u0010=J#\u0010v\u001a\u00020&*\u00020&2\u0006\u0010)\u001a\u00020u2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\bv\u0010wJ\u001b\u0010y\u001a\u00020x*\u00020&2\u0006\u0010)\u001a\u00020uH\u0002¢\u0006\u0004\by\u0010zJ\u001b\u0010|\u001a\u00020x*\u00020&2\u0006\u0010)\u001a\u00020{H\u0002¢\u0006\u0004\b|\u0010}J\u001c\u0010\u007f\u001a\u00020x*\u00020&2\u0006\u0010)\u001a\u00020~H\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0015\u0010\u0081\u0001\u001a\u00020&*\u00020&H\u0002¢\u0006\u0005\b\u0081\u0001\u0010=J\u001e\u0010\u0082\u0001\u001a\u00020&*\u00020&2\u0006\u0010)\u001a\u00020uH\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J%\u0010\u0084\u0001\u001a\u00020&*\u00020&2\u0006\u0010c\u001a\u00020b2\u0006\u0010d\u001a\u00020bH\u0002¢\u0006\u0005\b\u0084\u0001\u0010fJ&\u0010\u0086\u0001\u001a\u00020&*\u00020&2\u0006\u0010c\u001a\u00020b2\u0007\u0010\u0085\u0001\u001a\u00020bH\u0002¢\u0006\u0005\b\u0086\u0001\u0010fJ\u001e\u0010\u0087\u0001\u001a\u00020&*\u00020&2\u0006\u0010)\u001a\u00020uH\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0083\u0001J%\u0010\u0088\u0001\u001a\u00020&*\u00020&2\u0006\u0010)\u001a\u00020u2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0005\b\u0088\u0001\u0010wJ/\u0010\u0089\u0001\u001a\u00020&*\u00020&2\u0006\u0010c\u001a\u00020b2\u0006\u0010d\u001a\u00020b2\u0007\u0010\u0085\u0001\u001a\u00020bH\u0002¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J7\u0010\u008b\u0001\u001a\u00020&*\u00020&2\u0006\u0010c\u001a\u00020b2\u0006\u0010d\u001a\u00020b2\u0007\u0010\u0085\u0001\u001a\u00020b2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0015\u0010\u008d\u0001\u001a\u00020&*\u00020&H\u0002¢\u0006\u0005\b\u008d\u0001\u0010=J\u001e\u0010\u008e\u0001\u001a\u00020&*\u00020&2\u0006\u0010c\u001a\u00020bH\u0002¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0015\u0010\u0090\u0001\u001a\u00020&*\u00020&H\u0002¢\u0006\u0005\b\u0090\u0001\u0010=J+\u0010\u0094\u0001\u001a\u0004\u0018\u000109*\u00020&2\u0011\b\u0002\u0010\u0093\u0001\u001a\n\u0012\u0005\u0012\u00030\u0092\u00010\u0091\u0001H\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J+\u0010\u0097\u0001\u001a\u00020x*\u00020&2\u0006\u0010+\u001a\u00020*2\u000b\b\u0002\u0010\u0096\u0001\u001a\u0004\u0018\u00010bH\u0002¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u0015\u0010\u0099\u0001\u001a\u00020&*\u00020&H\u0002¢\u0006\u0005\b\u0099\u0001\u0010=J)\u0010\u009a\u0001\u001a\u00020&*\u00020&2\u0011\b\u0002\u0010\u0093\u0001\u001a\n\u0012\u0005\u0012\u00030\u0092\u00010\u0091\u0001H\u0002¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0015\u0010\u009c\u0001\u001a\u00020&*\u00020&H\u0002¢\u0006\u0005\b\u009c\u0001\u0010=J \u0010\u009e\u0001\u001a\u00020&*\u00020&2\b\u0010\u009d\u0001\u001a\u00030\u0092\u0001H\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J)\u0010¢\u0001\u001a\u0006\u0012\u0002\b\u00030\\2\b\u0010¡\u0001\u001a\u00030 \u00012\u0006\u0010-\u001a\u00020,H\u0082@¢\u0006\u0006\b¢\u0001\u0010£\u0001J!\u0010¤\u0001\u001a\u00020x*\u00020&2\b\u0010¡\u0001\u001a\u00030 \u0001H\u0082@¢\u0006\u0006\b¤\u0001\u0010¥\u0001J/\u0010¨\u0001\u001a\u00020x2\u0007\u0010¦\u0001\u001a\u00020i2\u0007\u0010§\u0001\u001a\u00020i2\b\u0010¡\u0001\u001a\u00030 \u0001H\u0082@¢\u0006\u0006\b¨\u0001\u0010©\u0001J \u0010«\u0001\u001a\u00020x*\u00020&2\u0007\u0010ª\u0001\u001a\u000208H\u0082@¢\u0006\u0006\b«\u0001\u0010¬\u0001J%\u0010®\u0001\u001a\u00020x2\u0007\u0010¦\u0001\u001a\u00020i2\u0007\u0010\u00ad\u0001\u001a\u00020iH\u0082@¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u0017\u0010°\u0001\u001a\u00030 \u0001*\u00020&H\u0002¢\u0006\u0006\b°\u0001\u0010±\u0001J\u001a\u0010²\u0001\u001a\u00020x2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0006\b²\u0001\u0010³\u0001J?\u0010¶\u0001\u001a\u00020&*\u00020&2\b\u0010¡\u0001\u001a\u00030 \u00012\u0006\u0010-\u001a\u00020,2\t\b\u0002\u0010´\u0001\u001a\u0002042\t\b\u0002\u0010µ\u0001\u001a\u000204H\u0082@¢\u0006\u0006\b¶\u0001\u0010·\u0001J4\u0010¸\u0001\u001a\u00020&*\u00020&2\b\u0010¡\u0001\u001a\u00030 \u00012\u0006\u0010-\u001a\u00020,2\t\b\u0002\u0010´\u0001\u001a\u000204H\u0082@¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u001b\u0010»\u0001\u001a\u00020x2\u0007\u0010º\u0001\u001a\u00020iH\u0002¢\u0006\u0006\b»\u0001\u0010¼\u0001J\u001a\u0010½\u0001\u001a\u0006\u0012\u0002\b\u00030\\*\u00020&H\u0082@¢\u0006\u0005\b½\u0001\u0010[J)\u0010¿\u0001\u001a\u00020&*\u00020&2\u0006\u0010)\u001a\u00020(2\t\u0010¾\u0001\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0006\b¿\u0001\u0010À\u0001J\u0016\u0010Á\u0001\u001a\u000204*\u00020(H\u0002¢\u0006\u0006\bÁ\u0001\u0010Â\u0001JA\u0010Ç\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010Ã\u00012%\u0010Æ\u0001\u001a \b\u0001\u0012\u0004\u0012\u00020*\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000Å\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010Ä\u0001H\u0082@¢\u0006\u0006\bÇ\u0001\u0010È\u0001J\u001e\u0010É\u0001\u001a\u00020&*\u00020&2\u0006\u0010)\u001a\u00020uH\u0002¢\u0006\u0006\bÉ\u0001\u0010\u0083\u0001JH\u0010Ë\u0001\u001a\n\u0012\u0005\u0012\u00030\u0092\u00010\u0091\u0001*\u00020&2\u000f\u0010Ê\u0001\u001a\n\u0012\u0005\u0012\u00030\u0092\u00010\u0091\u00012\u0006\u0010c\u001a\u00020b2\u0006\u0010d\u001a\u00020b2\u0007\u0010\u0085\u0001\u001a\u00020bH\u0002¢\u0006\u0006\bË\u0001\u0010Ì\u0001J%\u0010Î\u0001\u001a\u0011\u0012\u0004\u0012\u00020i\u0012\u0006\u0012\u0004\u0018\u00010\u00010Í\u0001*\u00020&H\u0002¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001R\u0016\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÜ\u0001\u0010Ý\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÞ\u0001\u0010ß\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\bà\u0001\u0010á\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R\u0016\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\b\n\u0006\bæ\u0001\u0010ç\u0001R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bè\u0001\u0010é\u0001R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bê\u0001\u0010ë\u0001R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bì\u0001\u0010í\u0001R\u0016\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bî\u0001\u0010ï\u0001R\u0016\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÉ\u0001\u0010ð\u0001R!\u0010ô\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010ò\u00010ñ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÇ\u0001\u0010ó\u0001¨\u0006õ\u0001"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;", "", "Lzr2/a;", "dateAndTimeProvider", "Lfu2/d;", "editableWorkoutSharedInteractor", "Liu2/b;", "weightliftingRepository", "Lcom/whoop/weightlifting/data/WeightliftingApi;", "weightliftingApi", "Li92/e;", "networkMonitor", "Ltr2/n;", "logger", "Lwm0/a;", "scopeCoordinator", "Lfu2/i;", "strengthTrainerInteractor", "Lfi0/a;", "baseAnalytics", "Lu92/d;", "prefsStore", "Lin2/d;", "dispatcherFactory", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lmi1/d;", "hapticsWrapper", "Lic/p0;", "workManager", "Llu2/e;", "weightliftingSerializer", "Ldt0/e;", "processNowApi", "Llf1/m;", "simplerStrengthExperimentHelper", "<init>", "(Lzr2/a;Lfu2/d;Liu2/b;Lcom/whoop/weightlifting/data/WeightliftingApi;Li92/e;Ltr2/n;Lwm0/a;Lfu2/i;Lfi0/a;Lu92/d;Lin2/d;Lcom/whoop/data/repositories/FeatureFlagChecker;Lmi1/d;Lic/p0;Llu2/e;Ldt0/e;Llf1/m;)V", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "activeWorkout", "Lfu2/a;", "action", "Lbc3/c0;", "activeWorkoutScope", "Landroidx/lifecycle/k1;", "savedStateHandle", "X", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/a;Lbc3/c0;Landroidx/lifecycle/k1;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/weightlifting/data/domain/StrapLocation;", "strapLocation", "Lcom/whoop/weightlifting/data/domain/StrapLaterality;", "strapLaterality", "", "isQuickStart", "x0", "(Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;ZLq83/d;)Ljava/lang/Object;", "Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;", "I", "(Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;", "B", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "k0", "i0", "y", "Ldu2/c;", "onScreen", "fromIcon", "w0", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lbc3/c0;Ldu2/c;Z)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "x", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Z", "A", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ldu2/c;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "u0", "y0", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lbc3/c0;Ldu2/c;Lq83/d;)Ljava/lang/Object;", "z", "l0", "(Lq83/d;)Ljava/lang/Object;", "s", "nextSetPosition", "H0", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "Lnu2/a;", "asyncProcess", "v0", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lnu2/a;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "m0", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Landroidx/lifecycle/k1;Lq83/d;)Ljava/lang/Object;", "L0", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lq83/d;)Ljava/lang/Object;", "Lu02/a;", "apiCall", "V", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lu02/a;Lq83/d;)Ljava/lang/Object;", "n0", "z0", "", "groupIndex", "exerciseIndex", "Y", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;II)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "Z", "Lfu2/a$j;", "", "analyticsAction", "a0", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/a$j;Ljava/lang/String;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "Lfu2/a$x;", "K0", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/a$x;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "E0", "undoSetPosition", "F0", "u", "G0", "Lfu2/b$n;", "U", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/b$n;Lbc3/c0;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "Ll83/a0;", "D0", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/b$n;)V", "Lfu2/b$a;", "A0", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/b$a;)V", "Lfu2/b$j;", "C0", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/b$j;)V", "B0", "h0", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/b$n;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "d0", "setIndex", "e0", "c0", "O0", "O", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;III)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "W", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;IIILbc3/c0;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "L", "R", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;I)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "N", "", "Ljava/util/UUID;", "idsOfSetsToSkip", "D", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/util/Set;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;", "numMillis", "q0", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lbc3/c0;Ljava/lang/Integer;)V", "t", "I0", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/util/Set;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "v", "exerciseId", "j0", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/util/UUID;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;", "completedWorkout", "o0", "(Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Landroidx/lifecycle/k1;Lq83/d;)Ljava/lang/Object;", "p0", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Lq83/d;)Ljava/lang/Object;", "workoutStartTimeInMillis", "serializedWorkout", "f0", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Lq83/d;)Ljava/lang/Object;", "workoutTemplate", "N0", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;Lq83/d;)Ljava/lang/Object;", "serializedWorkoutTemplate", "g0", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;", "M", "(Landroidx/lifecycle/k1;)V", "alsoFailedToUpdateTemplate", "isServerError", "S", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Landroidx/lifecycle/k1;ZZLq83/d;)Ljava/lang/Object;", "P", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Landroidx/lifecycle/k1;ZLq83/d;)Ljava/lang/Object;", "failureReason", "s0", "(Ljava/lang/String;)V", "M0", "previousWorkout", "C", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/a;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "t0", "(Lfu2/a;)Z", "T", "Lkotlin/Function2;", "Lq83/d;", "block", "r", "(Lc93/m;Lq83/d;)Ljava/lang/Object;", "q", "origSetIds", "K", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/util/Set;III)Ljava/util/Set;", "", "J", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Ljava/util/Map;", "a", "Lzr2/a;", "b", "Lfu2/d;", "c", "Liu2/b;", "d", "Lcom/whoop/weightlifting/data/WeightliftingApi;", "e", "Li92/e;", "f", "Ltr2/n;", "g", "Lwm0/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lfu2/i;", "i", "Lfi0/a;", "j", "Lu92/d;", "k", "Lin2/d;", "l", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "m", "Lmi1/d;", "n", "Lic/p0;", "o", "Llu2/e;", "p", "Ldt0/e;", "Llf1/m;", "Lec3/p1;", "Lbc3/k1;", "Lec3/p1;", "setTimerHapticsJob", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10769b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C14789d editableWorkoutSharedInteractor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C20938b weightliftingRepository;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final WeightliftingApi weightliftingApi;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC18260e networkMonitor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C37378a scopeCoordinator;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C14794i strengthTrainerInteractor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C34660d prefsStore;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC18732d dispatcherFactory;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C25575d hapticsWrapper;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final AbstractC18377p0 workManager;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final C24755e weightliftingSerializer;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final InterfaceC12362e processNowApi;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final C24003m simplerStrengthExperimentHelper;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final InterfaceC13075p1 setTimerHapticsJob;

    /* JADX INFO: renamed from: com.whoop.weightlifting.feature.active.activeworkout.domain.b$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkoutInteractor", m100430f = "ActiveWorkoutInteractor.kt", m100431l = {1031, 1033}, m100432m = "handleRecoverableSaveWorkoutError", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f32887E;

        /* JADX INFO: renamed from: G */
        int f32889G;

        /* JADX INFO: renamed from: w */
        Object f32890w;

        /* JADX INFO: renamed from: x */
        Object f32891x;

        /* JADX INFO: renamed from: y */
        Object f32892y;

        /* JADX INFO: renamed from: z */
        boolean f32893z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f32887E = obj;
            this.f32889G |= Integer.MIN_VALUE;
            return C10769b.this.m28284P(null, null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.feature.active.activeworkout.domain.b$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkoutInteractor", m100430f = "ActiveWorkoutInteractor.kt", m100431l = {538}, m100432m = "handleUpdateTemplateResponse", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f32894E;

        /* JADX INFO: renamed from: w */
        Object f32895w;

        /* JADX INFO: renamed from: x */
        Object f32896x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f32897y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f32897y = obj;
            this.f32894E |= Integer.MIN_VALUE;
            return C10769b.this.m28290V(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.feature.active.activeworkout.domain.b$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkoutInteractor", m100430f = "ActiveWorkoutInteractor.kt", m100431l = {186, 197, 202, 203, 204}, m100432m = "interact", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f32899E;

        /* JADX INFO: renamed from: G */
        int f32901G;

        /* JADX INFO: renamed from: w */
        Object f32902w;

        /* JADX INFO: renamed from: x */
        Object f32903x;

        /* JADX INFO: renamed from: y */
        Object f32904y;

        /* JADX INFO: renamed from: z */
        Object f32905z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f32899E = obj;
            this.f32901G |= Integer.MIN_VALUE;
            return C10769b.this.m28346X(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.feature.active.activeworkout.domain.b$d */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkoutInteractor$prepareToEnqueueSavingWorkoutInBackgroundWorker$2", m100430f = "ActiveWorkoutInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lic/e0;", "<anonymous>", "(Lbc3/c0;)Lic/e0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ WeightliftingWorkoutDto f32906E;

        /* JADX INFO: renamed from: w */
        int f32907w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f32908x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C10769b f32909y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f32910z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, C10769b c10769b, String str2, WeightliftingWorkoutDto weightliftingWorkoutDto, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f32908x = str;
            this.f32909y = c10769b;
            this.f32910z = str2;
            this.f32906E = weightliftingWorkoutDto;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f32908x, this.f32909y, this.f32910z, this.f32906E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC18355e0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f32907w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            String strM30461o = AbstractC11266d.m30461o(SharedPreferenceConstants.STRENGTH_TRAINER_WORKOUT_FOR_BACKGROUND_SAVE_PREFIX, this.f32908x);
            this.f32909y.prefsStore.m109543v(strM30461o, this.f32910z);
            SavingWorkoutInBackgroundWorker.Companion companion = SavingWorkoutInBackgroundWorker.INSTANCE;
            AbstractC18377p0 abstractC18377p0 = this.f32909y.workManager;
            String name = this.f32906E.getName();
            if (name == null) {
                name = "";
            }
            return SavingWorkoutInBackgroundWorker.Companion.m28373d(companion, abstractC18377p0, name, strM30461o, this.f32908x, null, 16, null);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.feature.active.activeworkout.domain.b$e */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkoutInteractor$prepareToEnqueueUpdatingTemplateInBackgroundWorker$2", m100430f = "ActiveWorkoutInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lic/e0;", "<anonymous>", "(Lbc3/c0;)Lic/e0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f32911w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f32912x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C10769b f32913y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f32914z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, C10769b c10769b, String str2, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f32912x = str;
            this.f32913y = c10769b;
            this.f32914z = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f32912x, this.f32913y, this.f32914z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC18355e0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f32911w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            String strM30461o = AbstractC11266d.m30461o(SharedPreferenceConstants.STRENGTH_TRAINER_TEMPLATE_FOR_BACKGROUND_UPDATE_PREFIX, this.f32912x);
            this.f32913y.prefsStore.m109543v(strM30461o, this.f32914z);
            return UpdatingTemplateInBackgroundWorker.Companion.m28392d(UpdatingTemplateInBackgroundWorker.INSTANCE, this.f32913y.workManager, strM30461o, this.f32912x, null, 8, null);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.feature.active.activeworkout.domain.b$f */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkoutInteractor$saveWorkout$2", m100430f = "ActiveWorkoutInteractor.kt", m100431l = {508, 514, 520, 525}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ ActiveWorkout f32915E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C1601k1 f32916F;

        /* JADX INFO: renamed from: w */
        Object f32917w;

        /* JADX INFO: renamed from: x */
        Object f32918x;

        /* JADX INFO: renamed from: y */
        int f32919y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ActiveWorkout activeWorkout, C1601k1 c1601k1, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f32915E = activeWorkout;
            this.f32916F = c1601k1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C10769b.this.new f(this.f32915E, this.f32916F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super ActiveWorkout> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x00e3, code lost:
        
            if (r0 == r9) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x010c, code lost:
        
            if (r0 == r9) goto L39;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r28) {
            /*
                Method dump skipped, instruction units count: 280
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.weightlifting.feature.active.activeworkout.domain.C10769b.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.feature.active.activeworkout.domain.b$g */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkoutInteractor$saveWorkoutAndUpdateTemplate$2", m100430f = "ActiveWorkoutInteractor.kt", m100431l = {550, 560, 561, 561, 566, 563, 573, 570}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        Object f32921E;

        /* JADX INFO: renamed from: F */
        Object f32922F;

        /* JADX INFO: renamed from: G */
        Object f32923G;

        /* JADX INFO: renamed from: H */
        Object f32924H;

        /* JADX INFO: renamed from: I */
        int f32925I;

        /* JADX INFO: renamed from: J */
        private /* synthetic */ Object f32926J;

        /* JADX INFO: renamed from: L */
        final /* synthetic */ ActiveWorkout f32928L;

        /* JADX INFO: renamed from: M */
        final /* synthetic */ C1601k1 f32929M;

        /* JADX INFO: renamed from: w */
        Object f32930w;

        /* JADX INFO: renamed from: x */
        Object f32931x;

        /* JADX INFO: renamed from: y */
        Object f32932y;

        /* JADX INFO: renamed from: z */
        Object f32933z;

        /* JADX INFO: renamed from: com.whoop.weightlifting.feature.active.activeworkout.domain.b$g$a */
        @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkoutInteractor$saveWorkoutAndUpdateTemplate$2$saveResponse$1", m100430f = "ActiveWorkoutInteractor.kt", m100431l = {557}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lu02/a;", "<anonymous>", "(Lbc3/c0;)Lu02/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f32934w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C10769b f32935x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ WeightliftingWorkoutDto f32936y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C1601k1 f32937z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C10769b c10769b, WeightliftingWorkoutDto weightliftingWorkoutDto, C1601k1 c1601k1, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f32935x = c10769b;
                this.f32936y = weightliftingWorkoutDto;
                this.f32937z = c1601k1;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f32935x, this.f32936y, this.f32937z, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC34385a<?>> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f32934w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C10769b c10769b = this.f32935x;
                WeightliftingWorkoutDto weightliftingWorkoutDto = this.f32936y;
                C1601k1 c1601k1 = this.f32937z;
                this.f32934w = 1;
                Object objM28323o0 = c10769b.m28323o0(weightliftingWorkoutDto, c1601k1, this);
                return objM28323o0 == enumC31071a ? enumC31071a : objM28323o0;
            }
        }

        /* JADX INFO: renamed from: com.whoop.weightlifting.feature.active.activeworkout.domain.b$g$b */
        @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkoutInteractor$saveWorkoutAndUpdateTemplate$2$updateResponse$1", m100430f = "ActiveWorkoutInteractor.kt", m100431l = {558}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lu02/a;", "<anonymous>", "(Lbc3/c0;)Lu02/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f32938w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C10769b f32939x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ ActiveWorkout f32940y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C10769b c10769b, ActiveWorkout activeWorkout, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f32939x = c10769b;
                this.f32940y = activeWorkout;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f32939x, this.f32940y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC34385a<?>> interfaceC30057d) {
                return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f32938w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C10769b c10769b = this.f32939x;
                ActiveWorkout activeWorkout = this.f32940y;
                this.f32938w = 1;
                Object objM28279M0 = c10769b.m28279M0(activeWorkout, this);
                return objM28279M0 == enumC31071a ? enumC31071a : objM28279M0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ActiveWorkout activeWorkout, C1601k1 c1601k1, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f32928L = activeWorkout;
            this.f32929M = c1601k1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = C10769b.this.new g(this.f32928L, this.f32929M, interfaceC30057d);
            gVar.f32926J = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super ActiveWorkout> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0150  */
        /* JADX WARN: Code duplicated, block: B:30:0x016c  */
        /* JADX WARN: Code duplicated, block: B:36:0x018d  */
        /* JADX WARN: Code duplicated, block: B:38:0x0191  */
        /* JADX WARN: Code duplicated, block: B:41:0x01b4  */
        /* JADX WARN: Code duplicated, block: B:47:0x01e5  */
        /* JADX WARN: Code duplicated, block: B:49:0x01e9  */
        /* JADX WARN: Code duplicated, block: B:52:0x020b  */
        /* JADX WARN: Code duplicated, block: B:58:0x0233  */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0186, code lost:
        
            if (r13 == r1) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x01df, code lost:
        
            if (r13 == r1) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x022d, code lost:
        
            if (r13 == r1) goto L55;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 592
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.weightlifting.feature.active.activeworkout.domain.C10769b.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.feature.active.activeworkout.domain.b$h */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkoutInteractor", m100430f = "ActiveWorkoutInteractor.kt", m100431l = {912, 920}, m100432m = "saveWorkoutApiCall", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f32941E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f32942F;

        /* JADX INFO: renamed from: H */
        int f32944H;

        /* JADX INFO: renamed from: w */
        Object f32945w;

        /* JADX INFO: renamed from: x */
        Object f32946x;

        /* JADX INFO: renamed from: y */
        Object f32947y;

        /* JADX INFO: renamed from: z */
        Object f32948z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f32942F = obj;
            this.f32944H |= Integer.MIN_VALUE;
            return C10769b.this.m28323o0(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.feature.active.activeworkout.domain.b$i */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkoutInteractor$saveWorkoutApiCall$2", m100430f = "ActiveWorkoutInteractor.kt", m100431l = {913}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f32949w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ WeightliftingWorkoutDto f32951y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(WeightliftingWorkoutDto weightliftingWorkoutDto, InterfaceC30057d<? super i> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f32951y = weightliftingWorkoutDto;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C10769b.this.new i(this.f32951y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f32949w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            WeightliftingApi weightliftingApi = C10769b.this.weightliftingApi;
            WeightliftingWorkoutDto weightliftingWorkoutDto = this.f32951y;
            this.f32949w = 1;
            Object objSaveWeightliftingWorkout = weightliftingApi.saveWeightliftingWorkout(weightliftingWorkoutDto, this);
            return objSaveWeightliftingWorkout == enumC31071a ? enumC31071a : objSaveWeightliftingWorkout;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((i) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.feature.active.activeworkout.domain.b$j */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkoutInteractor", m100430f = "ActiveWorkoutInteractor.kt", m100431l = {941}, m100432m = "saveWorkoutInBackground", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f32952E;

        /* JADX INFO: renamed from: F */
        int f32953F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f32954G;

        /* JADX INFO: renamed from: I */
        int f32956I;

        /* JADX INFO: renamed from: w */
        Object f32957w;

        /* JADX INFO: renamed from: x */
        Object f32958x;

        /* JADX INFO: renamed from: y */
        Object f32959y;

        /* JADX INFO: renamed from: z */
        Object f32960z;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f32954G = obj;
            this.f32956I |= Integer.MIN_VALUE;
            return C10769b.this.m28325p0(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.feature.active.activeworkout.domain.b$k */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkoutInteractor$scheduleSetTimerHaptics$1", m100430f = "ActiveWorkoutInteractor.kt", m100431l = {883, 884}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Integer f32961E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C10769b f32962F;

        /* JADX INFO: renamed from: w */
        Object f32963w;

        /* JADX INFO: renamed from: x */
        int f32964x;

        /* JADX INFO: renamed from: y */
        int f32965y;

        /* JADX INFO: renamed from: z */
        int f32966z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Integer num, C10769b c10769b, InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f32961E = num;
            this.f32962F = c10769b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new k(this.f32961E, this.f32962F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
        
            if (r4.m28317l0(r7) == r0) goto L18;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r7.f32966z
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r8)
                goto L5a
            L10:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L18:
                int r1 = r7.f32965y
                int r3 = r7.f32964x
                java.lang.Object r4 = r7.f32963w
                com.whoop.weightlifting.feature.active.activeworkout.domain.b r4 = (com.whoop.weightlifting.feature.active.activeworkout.domain.C10769b) r4
                p505ts.AbstractC34132o.m107864I(r8)
                goto L4a
            L24:
                p505ts.AbstractC34132o.m107864I(r8)
                java.lang.Integer r8 = r7.f32961E
                if (r8 == 0) goto L5a
                com.whoop.weightlifting.feature.active.activeworkout.domain.b r4 = r7.f32962F
                int r8 = r8.intValue()
                kotlin.time.Duration$Companion r1 = p715kotlin.time.Duration.INSTANCE
                kotlin.time.DurationUnit r1 = p715kotlin.time.DurationUnit.MILLISECONDS
                long r5 = p715kotlin.time.DurationKt.toDuration(r8, r1)
                r7.f32963w = r4
                r7.f32964x = r8
                r1 = 0
                r7.f32965y = r1
                r7.f32966z = r3
                java.lang.Object r3 = bc3.AbstractC3034m0.m8783c(r5, r7)
                if (r3 != r0) goto L49
                goto L59
            L49:
                r3 = r8
            L4a:
                r8 = 0
                r7.f32963w = r8
                r7.f32964x = r3
                r7.f32965y = r1
                r7.f32966z = r2
                java.lang.Object r8 = com.whoop.weightlifting.feature.active.activeworkout.domain.C10769b.m28312j(r4, r7)
                if (r8 != r0) goto L5a
            L59:
                return r0
            L5a:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.weightlifting.feature.active.activeworkout.domain.C10769b.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.feature.active.activeworkout.domain.b$l */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkoutInteractor", m100430f = "ActiveWorkoutInteractor.kt", m100431l = {224}, m100432m = "startWorkout", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        boolean f32967E;

        /* JADX INFO: renamed from: F */
        int f32968F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f32969G;

        /* JADX INFO: renamed from: I */
        int f32971I;

        /* JADX INFO: renamed from: w */
        Object f32972w;

        /* JADX INFO: renamed from: x */
        Object f32973x;

        /* JADX INFO: renamed from: y */
        Object f32974y;

        /* JADX INFO: renamed from: z */
        Object f32975z;

        public l(InterfaceC30057d<? super l> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f32969G = obj;
            this.f32971I |= Integer.MIN_VALUE;
            return C10769b.this.m28341x0(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.feature.active.activeworkout.domain.b$m */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkoutInteractor", m100430f = "ActiveWorkoutInteractor.kt", m100431l = {436, 437}, m100432m = "toggleStartEndSet", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f32977F;

        /* JADX INFO: renamed from: w */
        Object f32978w;

        /* JADX INFO: renamed from: x */
        Object f32979x;

        /* JADX INFO: renamed from: y */
        Object f32980y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f32981z;

        public m(InterfaceC30057d<? super m> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f32981z = obj;
            this.f32977F |= Integer.MIN_VALUE;
            return C10769b.this.m28343y0(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.feature.active.activeworkout.domain.b$n */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkoutInteractor$updateTemplate$2", m100430f = "ActiveWorkoutInteractor.kt", m100431l = {533, 533}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class n extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ ActiveWorkout f32982E;

        /* JADX INFO: renamed from: w */
        Object f32983w;

        /* JADX INFO: renamed from: x */
        Object f32984x;

        /* JADX INFO: renamed from: y */
        int f32985y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ActiveWorkout activeWorkout, InterfaceC30057d<? super n> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f32982E = activeWorkout;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C10769b.this.new n(this.f32982E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super ActiveWorkout> interfaceC30057d) {
            return ((n) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ActiveWorkout activeWorkout;
            C10769b c10769b;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f32985y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C10769b c10769b2 = C10769b.this;
                activeWorkout = this.f32982E;
                this.f32983w = c10769b2;
                this.f32984x = activeWorkout;
                this.f32985y = 1;
                Object objM28279M0 = c10769b2.m28279M0(activeWorkout, this);
                if (objM28279M0 != enumC31071a) {
                    c10769b = c10769b2;
                    obj = objM28279M0;
                }
            }
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            activeWorkout = (ActiveWorkout) this.f32984x;
            c10769b = (C10769b) this.f32983w;
            AbstractC34132o.m107864I(obj);
            this.f32983w = null;
            this.f32984x = null;
            this.f32985y = 2;
            Object objM28290V = c10769b.m28290V(activeWorkout, (InterfaceC34385a) obj, this);
            return objM28290V == enumC31071a ? enumC31071a : objM28290V;
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.feature.active.activeworkout.domain.b$o */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkoutInteractor$updateTemplateApiCall$2", m100430f = "ActiveWorkoutInteractor.kt", m100431l = {1053}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class o extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f32987w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ ActiveWorkout f32989y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ActiveWorkout activeWorkout, InterfaceC30057d<? super o> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f32989y = activeWorkout;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C10769b.this.new o(this.f32989y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f32987w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            WeightliftingApi weightliftingApi = C10769b.this.weightliftingApi;
            long jLongValue = this.f32989y.getWorkoutTemplateId().longValue();
            WorkoutTemplateDto dto = WorkoutTemplateKt.toDto(this.f32989y.getWorkoutTemplate());
            this.f32987w = 1;
            Object objUpdateWorkoutTemplate = weightliftingApi.updateWorkoutTemplate(jLongValue, dto, this);
            return objUpdateWorkoutTemplate == enumC31071a ? enumC31071a : objUpdateWorkoutTemplate;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((o) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C10769b(InterfaceC41070a dateAndTimeProvider, C14789d editableWorkoutSharedInteractor, C20938b weightliftingRepository, WeightliftingApi weightliftingApi, InterfaceC18260e networkMonitor, InterfaceC34116n logger, C37378a scopeCoordinator, C14794i strengthTrainerInteractor, InterfaceC14515a baseAnalytics, C34660d prefsStore, InterfaceC18732d dispatcherFactory, FeatureFlagChecker featureFlagChecker, C25575d hapticsWrapper, AbstractC18377p0 workManager, C24755e weightliftingSerializer, InterfaceC12362e processNowApi, C24003m simplerStrengthExperimentHelper) {
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(editableWorkoutSharedInteractor, "editableWorkoutSharedInteractor");
        AbstractC22676k.m65750j(weightliftingRepository, "weightliftingRepository");
        AbstractC22676k.m65750j(weightliftingApi, "weightliftingApi");
        AbstractC22676k.m65750j(networkMonitor, "networkMonitor");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        AbstractC22676k.m65750j(strengthTrainerInteractor, "strengthTrainerInteractor");
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        AbstractC22676k.m65750j(prefsStore, "prefsStore");
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(hapticsWrapper, "hapticsWrapper");
        AbstractC22676k.m65750j(workManager, "workManager");
        AbstractC22676k.m65750j(weightliftingSerializer, "weightliftingSerializer");
        AbstractC22676k.m65750j(processNowApi, "processNowApi");
        AbstractC22676k.m65750j(simplerStrengthExperimentHelper, "simplerStrengthExperimentHelper");
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.editableWorkoutSharedInteractor = editableWorkoutSharedInteractor;
        this.weightliftingRepository = weightliftingRepository;
        this.weightliftingApi = weightliftingApi;
        this.networkMonitor = networkMonitor;
        this.logger = logger;
        this.scopeCoordinator = scopeCoordinator;
        this.strengthTrainerInteractor = strengthTrainerInteractor;
        this.baseAnalytics = baseAnalytics;
        this.prefsStore = prefsStore;
        this.dispatcherFactory = dispatcherFactory;
        this.featureFlagChecker = featureFlagChecker;
        this.hapticsWrapper = hapticsWrapper;
        this.workManager = workManager;
        this.weightliftingSerializer = weightliftingSerializer;
        this.processNowApi = processNowApi;
        this.simplerStrengthExperimentHelper = simplerStrengthExperimentHelper;
        this.setTimerHapticsJob = AbstractC13091v.m36593c(null);
    }

    /* JADX INFO: renamed from: A */
    private final ActiveWorkout m28254A(ActiveWorkout activeWorkout, EnumC12379c enumC12379c) {
        WorkoutSet currentSet;
        WorkoutExercise currentExercise;
        if (!(activeWorkout.getCurrentSetState() instanceof CurrentSetState.Active) || activeWorkout.getGroups().isEmpty() || (currentSet = activeWorkout.getCurrentSet()) == null || (currentExercise = activeWorkout.getCurrentExercise()) == null) {
            return activeWorkout;
        }
        AbstractC12378b.m34742l(this.baseAnalytics, "End Set", activeWorkout.getWorkoutTemplateId(), currentExercise.getExercise().getExerciseId(), activeWorkout.getCompletedSetData().size() + 1, enumC12379c, null, 32, null);
        DateTime dateTimeMo133364c = this.dateAndTimeProvider.mo133364c();
        return m28273J0(this, m28336v(ActiveWorkout.copy$default(m28335u0(activeWorkout) ? m28299c0(activeWorkout, new InterfaceC14787b.q(activeWorkout.getCurrentGroupIndex(), activeWorkout.getCurrentExerciseIndex(), activeWorkout.getCurrentSetIndex(), new WorkoutSet(currentSet.getNumberOfRepsAsInt(), Integer.valueOf(Seconds.secondsBetween(((CurrentSetState.Active) activeWorkout.getCurrentSetState()).getStartTime(), dateTimeMo133364c).getSeconds()), currentSet.getWeightAsFloat()).getTime(), true)) : activeWorkout, null, null, null, null, null, null, null, null, new CurrentSetState.Rest(dateTimeMo133364c, false, 2, (DefaultConstructorMarker) null), AbstractC25247g0.m73996e0(activeWorkout.getCompletedSetData(), new C23465k(currentSet.getId(), new CompletedSetData(new DateTimeRange(((CurrentSetState.Active) activeWorkout.getCurrentSetState()).getStartTime(), dateTimeMo133364c, null, null, 12, null), currentExercise.getExercise().getTrackable(), activeWorkout.getStrapLocation(), activeWorkout.getStrapLaterality(), ((CurrentSetState.Active) activeWorkout.getCurrentSetState()).getWasEditedAfterStarting()))), null, null, null, null, null, false, null, false, 261375, null)), null, 1, null);
    }

    /* JADX INFO: renamed from: A0 */
    private final void m28255A0(ActiveWorkout activeWorkout, InterfaceC14787b.a aVar) {
        List<WorkoutExercise> exercises;
        WorkoutExercise workoutExercise;
        WorkoutGroup workoutGroup = (WorkoutGroup) AbstractC25265s.m74102I0(aVar.getGroupIndex(), activeWorkout.getGroups());
        if (workoutGroup == null || (exercises = workoutGroup.getExercises()) == null || (workoutExercise = (WorkoutExercise) AbstractC25265s.m74100H0(exercises)) == null) {
            return;
        }
        this.baseAnalytics.mo41428k(workoutExercise.getExercise().getExerciseId(), "Add Set", "", "Workout Builder", AbstractC25247g0.m73990Y(new C23465k("workoutId", activeWorkout.getWorkoutTemplateId()), new C23465k("setNumber", Integer.valueOf(workoutExercise.getSets().size() + 1))));
    }

    /* JADX INFO: renamed from: B */
    private final ActiveWorkout m28256B(ActiveWorkout activeWorkout) {
        if (activeWorkout.getGroups().isEmpty()) {
            return activeWorkout;
        }
        this.baseAnalytics.mo41428k("", "End Workout", "", "Workout Builder", AbstractC25247g0.m73989X(new C23465k("workoutId", activeWorkout.getWorkoutTemplateId())));
        boolean zHasSameContentAs = new WorkoutTemplate(activeWorkout.getParentTemplateId(), activeWorkout.getWorkoutTemplateId(), activeWorkout.getName(), activeWorkout.getGroups(), (String) null, 16, (DefaultConstructorMarker) null).hasSameContentAs(new WorkoutTemplate(activeWorkout.getParentTemplateId(), activeWorkout.getWorkoutTemplateId(), activeWorkout.getName(), activeWorkout.getOriginalGroups(), (String) null, 16, (DefaultConstructorMarker) null));
        boolean z4 = !zHasSameContentAs;
        boolean z13 = false;
        boolean z14 = (zHasSameContentAs || activeWorkout.getWorkoutTemplateId() == null) ? false : true;
        if (!zHasSameContentAs && activeWorkout.getWorkoutTemplateId() != null) {
            z13 = true;
        }
        return ActiveWorkout.copy$default(activeWorkout, null, null, null, null, null, null, null, null, null, null, null, null, WorkoutAnalytics.copy$default(activeWorkout.getAnalytics(), 0, 0, 0, 0, 0, 0, 0, z4, null, null, false, 1919, null), null, new InterfaceC10768a.b.c(z14, z13), false, null, false, 241663, null);
    }

    /* JADX INFO: renamed from: B0 */
    private final ActiveWorkout m28257B0(ActiveWorkout activeWorkout) {
        if (activeWorkout.isSimpleStrengthLogging()) {
            this.baseAnalytics.mo41428k("", "Enter Add Exercise", "", "Workout Builder", AbstractC25247g0.m73989X(new C23465k("workoutId", activeWorkout.getWorkoutTemplateId())));
        }
        return activeWorkout;
    }

    /* JADX INFO: renamed from: C */
    private final ActiveWorkout m28258C(ActiveWorkout activeWorkout, InterfaceC14786a interfaceC14786a, ActiveWorkout activeWorkout2) {
        C10769b c10769b;
        InterfaceC3027k1 interfaceC3027k1;
        InterfaceC3027k1 interfaceC3027k2;
        if (!(activeWorkout.getCurrentSetState() instanceof CurrentSetState.Active) && (interfaceC3027k1 = (InterfaceC3027k1) ((C13045h2) this.setTimerHapticsJob).getValue()) != null && interfaceC3027k1.isActive() && (interfaceC3027k2 = (InterfaceC3027k1) ((C13045h2) this.setTimerHapticsJob).getValue()) != null) {
            interfaceC3027k2.cancel((CancellationException) null);
        }
        if (activeWorkout.getGroups().isEmpty()) {
            if (!AbstractC22676k.m65745e(activeWorkout.getWorkoutTemplate(), activeWorkout2 != null ? activeWorkout2.getWorkoutTemplate() : null)) {
                this.strengthTrainerInteractor.m42546j(new InterfaceC14792g.i(activeWorkout.getWorkoutTemplate()));
            }
            if (m28333t0(interfaceC14786a) && !activeWorkout.equals(activeWorkout2)) {
                this.weightliftingRepository.m58191D(activeWorkout);
            }
            return activeWorkout;
        }
        List<WorkoutGroup> groups = activeWorkout.getGroups();
        ArrayList arrayList = new ArrayList();
        for (Object obj : groups) {
            if (AbstractC27147d.m81638b((WorkoutGroup) obj, activeWorkout.getCompletedSetData().keySet())) {
                arrayList.add(obj);
            }
        }
        List<WorkoutGroup> groups2 = activeWorkout.getGroups();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : groups2) {
            if (!AbstractC27147d.m81638b((WorkoutGroup) obj2, activeWorkout.getCompletedSetData().keySet())) {
                arrayList2.add(obj2);
            }
        }
        boolean z4 = !AbstractC22676k.m65745e(activeWorkout.getPositionInWorkout(), activeWorkout2 != null ? activeWorkout2.getPositionInWorkout() : null) && activeWorkout.getNumSetsLeft() > 0;
        WorkoutExercise currentExercise = activeWorkout.getCurrentExercise();
        UUID id4 = currentExercise != null ? currentExercise.getId() : null;
        ActiveWorkout activeWorkoutCopy$default = ActiveWorkout.copy$default(activeWorkout, null, null, null, AbstractC25265s.m74129g1(arrayList, arrayList2), null, (!z4 || id4 == null) ? activeWorkout.getIdsOfExpandedExercises() : AbstractC12350b.m34555D(id4, activeWorkout.getIdsOfExpandedExercises()), null, null, activeWorkout.getFinishedFinalSet() ? new CurrentSetState.Cooldown(activeWorkout.getCurrentSetState().getStartTime()) : activeWorkout.getCurrentSetState(), null, null, null, null, null, null, false, null, false, 261847, null);
        if (AbstractC22676k.m65745e(activeWorkoutCopy$default.getWorkoutTemplate(), activeWorkout2 != null ? activeWorkout2.getWorkoutTemplate() : null)) {
            c10769b = this;
        } else {
            c10769b = this;
            c10769b.strengthTrainerInteractor.m42546j(new InterfaceC14792g.i(activeWorkoutCopy$default.getWorkoutTemplate()));
        }
        if (c10769b.m28333t0(interfaceC14786a) && !activeWorkoutCopy$default.equals(activeWorkout2)) {
            c10769b.weightliftingRepository.m58191D(activeWorkoutCopy$default);
        }
        return activeWorkoutCopy$default;
    }

    /* JADX INFO: renamed from: C0 */
    private final void m28259C0(ActiveWorkout activeWorkout, InterfaceC14787b.j jVar) {
        List<WorkoutExercise> exercises;
        WorkoutExercise workoutExercise;
        WorkoutGroup workoutGroup = (WorkoutGroup) AbstractC25265s.m74102I0(jVar.getGroupIndex(), activeWorkout.getGroups());
        if (workoutGroup == null || (exercises = workoutGroup.getExercises()) == null || (workoutExercise = (WorkoutExercise) AbstractC25265s.m74100H0(exercises)) == null) {
            return;
        }
        this.baseAnalytics.mo41428k(workoutExercise.getExercise().getExerciseId(), "Remove Set", "", "Workout Builder", AbstractC25247g0.m73990Y(new C23465k("workoutId", activeWorkout.getWorkoutTemplateId()), new C23465k("setNumber", Integer.valueOf(jVar.getSetIndex() + 1))));
    }

    /* JADX INFO: renamed from: D */
    private final PositionInWorkout m28260D(ActiveWorkout activeWorkout, Set<UUID> set) {
        if (!activeWorkout.getGroups().isEmpty() && !activeWorkout.getFinishedFinalSet()) {
            C22665e0 c22665e0 = new C22665e0();
            c22665e0.f89334w = activeWorkout.getCurrentGroupIndex();
            C22665e0 c22665e1 = new C22665e0();
            c22665e1.f89334w = activeWorkout.getCurrentExerciseIndex();
            C22665e0 c22665e2 = new C22665e0();
            c22665e2.f89334w = activeWorkout.getCurrentSetIndex();
            while (set.contains(m28268H(c22665e2, c22665e1, activeWorkout, c22665e0).getId())) {
                if (c22665e1.f89334w == AbstractC37056f.m118951C(m28266G(activeWorkout, c22665e0).getExercises())) {
                    c22665e2.f89334w++;
                }
                c22665e1.f89334w = (c22665e1.f89334w + 1) % m28266G(activeWorkout, c22665e0).getExercises().size();
                if (c22665e2.f89334w > AbstractC37056f.m118951C(m28264F(c22665e1, activeWorkout, c22665e0).getSets())) {
                    c22665e0.f89334w = (c22665e0.f89334w + 1) % activeWorkout.getGroups().size();
                    c22665e1.f89334w = 0;
                    c22665e2.f89334w = 0;
                }
            }
            return new PositionInWorkout(m28266G(activeWorkout, c22665e0).getId(), m28264F(c22665e1, activeWorkout, c22665e0).getId(), m28268H(c22665e2, c22665e1, activeWorkout, c22665e0).getId());
        }
        return activeWorkout.getPositionInWorkout();
    }

    /* JADX INFO: renamed from: D0 */
    private final void m28261D0(ActiveWorkout activeWorkout, InterfaceC14787b.n nVar) {
        if (activeWorkout.isSimpleStrengthLogging()) {
            if (nVar instanceof InterfaceC14787b.a) {
                m28255A0(activeWorkout, (InterfaceC14787b.a) nVar);
            } else if (nVar instanceof InterfaceC14787b.j) {
                m28259C0(activeWorkout, (InterfaceC14787b.j) nVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public static /* synthetic */ PositionInWorkout m28262E(C10769b c10769b, ActiveWorkout activeWorkout, Set set, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            set = activeWorkout.getCompletedSetData().keySet();
        }
        return c10769b.m28260D(activeWorkout, set);
    }

    /* JADX INFO: renamed from: E0 */
    private final ActiveWorkout m28263E0(ActiveWorkout activeWorkout) {
        PositionInWorkout setPositionById;
        UUID lastCompletedSetId = activeWorkout.getLastCompletedSetId();
        return (lastCompletedSetId == null || (setPositionById = activeWorkout.getSetPositionById(lastCompletedSetId)) == null) ? activeWorkout : m28295a0(activeWorkout, new InterfaceC14786a.j(setPositionById), "Undo Last Completed From Menu");
    }

    /* JADX INFO: renamed from: F */
    private static final WorkoutExercise m28264F(C22665e0 c22665e0, ActiveWorkout activeWorkout, C22665e0 c22665e1) {
        return m28266G(activeWorkout, c22665e1).getExercises().get(c22665e0.f89334w);
    }

    /* JADX INFO: renamed from: F0 */
    private final ActiveWorkout m28265F0(ActiveWorkout activeWorkout, PositionInWorkout positionInWorkout) {
        if (activeWorkout.getCurrentDialog() instanceof InterfaceC10768a.b.d) {
            InterfaceC14515a.m41418i(this.baseAnalytics, "Undo Set", "Confirmed Undo", null, "Workout Builder", null, null, 52, null);
        } else {
            int iM74104J0 = AbstractC25265s.m74104J0(activeWorkout.getCompletedSetData().keySet(), positionInWorkout.getSetId()) + 1;
            InterfaceC14515a interfaceC14515a = this.baseAnalytics;
            UUID lastCompletedSetId = activeWorkout.getLastCompletedSetId();
            interfaceC14515a.mo41428k("Undo Set", "Uncompleted Set", (lastCompletedSetId == null || !lastCompletedSetId.equals(positionInWorkout.getSetId())) ? "" : "Is Last Completed Set", "Workout Builder", AbstractC25247g0.m73990Y(new C23465k("workoutId", activeWorkout.getWorkoutTemplateId()), new C23465k("setNumber", Integer.valueOf(iM74104J0))));
        }
        return ActiveWorkout.copy$default(activeWorkout, null, null, null, null, null, null, null, positionInWorkout, activeWorkout.getCurrentSetState() instanceof CurrentSetState.Cooldown ? new CurrentSetState.Rest(((CurrentSetState.Cooldown) activeWorkout.getCurrentSetState()).getStartTime(), false, 2, (DefaultConstructorMarker) null) : activeWorkout.getCurrentSetState(), AbstractC25247g0.m73991Z(positionInWorkout.getSetId(), activeWorkout.getCompletedSetData()), null, null, null, null, null, false, null, false, 244863, null);
    }

    /* JADX INFO: renamed from: G */
    private static final WorkoutGroup m28266G(ActiveWorkout activeWorkout, C22665e0 c22665e0) {
        return activeWorkout.getGroups().get(c22665e0.f89334w);
    }

    /* JADX INFO: renamed from: G0 */
    private final ActiveWorkout m28267G0(ActiveWorkout activeWorkout) {
        return ActiveWorkout.copy$default(activeWorkout, null, null, null, null, null, null, null, null, null, null, null, null, WorkoutAnalytics.copy$default(activeWorkout.getAnalytics(), 0, 0, 0, 0, activeWorkout.getAnalytics().getNumDragAndDrops() + 1, 0, 0, false, null, null, false, 2031, null), null, null, false, null, false, 258047, null);
    }

    /* JADX INFO: renamed from: H */
    private static final WorkoutSet m28268H(C22665e0 c22665e0, C22665e0 c22665e1, ActiveWorkout activeWorkout, C22665e0 c22665e2) {
        return m28264F(c22665e1, activeWorkout, c22665e2).getSets().get(c22665e0.f89334w);
    }

    /* JADX INFO: renamed from: H0 */
    private final ActiveWorkout m28269H0(ActiveWorkout activeWorkout, PositionInWorkout positionInWorkout) {
        return AbstractC27147d.m81637a(activeWorkout.getCurrentSetState()) ? ActiveWorkout.copy$default(activeWorkout, null, null, null, null, null, null, null, positionInWorkout, null, null, null, null, WorkoutAnalytics.copy$default(activeWorkout.getAnalytics(), 0, 0, 0, 0, 0, activeWorkout.getAnalytics().getNumTimesPlayButtonClicked() + 1, 0, false, null, null, false, 2015, null), null, null, false, null, false, 257919, null) : activeWorkout;
    }

    /* JADX INFO: renamed from: I */
    private final PositionInWorkout m28270I(WorkoutTemplate workoutTemplate) {
        WorkoutExercise workoutExercise;
        WorkoutSet workoutSet;
        WorkoutGroup workoutGroup = (WorkoutGroup) AbstractC25265s.m74100H0(workoutTemplate.getGroups());
        if (workoutGroup == null || (workoutExercise = (WorkoutExercise) AbstractC25265s.m74100H0(workoutGroup.getExercises())) == null || (workoutSet = (WorkoutSet) AbstractC25265s.m74100H0(workoutExercise.getSets())) == null) {
            return null;
        }
        return new PositionInWorkout(workoutGroup.getId(), workoutExercise.getId(), workoutSet.getId());
    }

    /* JADX INFO: renamed from: I0 */
    private final ActiveWorkout m28271I0(ActiveWorkout activeWorkout, Set<UUID> set) {
        return ActiveWorkout.copy$default(activeWorkout, null, null, null, null, null, null, null, m28260D(activeWorkout, set), null, null, null, null, null, null, null, false, null, false, 262015, null);
    }

    /* JADX INFO: renamed from: J */
    private final Map<String, Object> m28272J(ActiveWorkout activeWorkout) {
        C23465k c23465k = new C23465k("workoutId", activeWorkout.getWorkoutTemplateId());
        C23465k c23465k2 = new C23465k("workoutName", activeWorkout.getName());
        C23465k c23465k3 = new C23465k("numberOfExercisesAdded", Integer.valueOf(activeWorkout.getAnalytics().getNumExercisesAddedDuringWorkout()));
        C23465k c23465k4 = new C23465k("numberOfExerciseRemoved", Integer.valueOf(activeWorkout.getAnalytics().getNumExercisesRemovedDuringWorkout()));
        C23465k c23465k5 = new C23465k("numberOfSetsAdded", Integer.valueOf(activeWorkout.getAnalytics().getNumSetsAddedDuringWorkout()));
        C23465k c23465k6 = new C23465k("numberOfSetsRemoved", Integer.valueOf(activeWorkout.getAnalytics().getNumSetsRemovedDuringWorkout()));
        C23465k c23465k7 = new C23465k("numberOfDragAndDrop", Integer.valueOf(activeWorkout.getAnalytics().getNumDragAndDrops()));
        C23465k c23465k8 = new C23465k("numberOfTimesPlayButtonWasClicked", Integer.valueOf(activeWorkout.getAnalytics().getNumTimesPlayButtonClicked()));
        C23465k c23465k9 = new C23465k("numberOfSetsCancelled", Integer.valueOf(activeWorkout.getAnalytics().getNumSetsCancelled()));
        C23465k c23465k10 = new C23465k("numberOfSetsCompleted", Integer.valueOf(activeWorkout.getCompletedSetData().size()));
        Iterator<T> it = activeWorkout.getOriginalGroups().iterator();
        int totalSets = 0;
        while (it.hasNext()) {
            totalSets += ((WorkoutGroup) it.next()).getTotalSets();
        }
        return AbstractC25247g0.m73995d0(AbstractC25247g0.m73990Y(c23465k, c23465k2, c23465k3, c23465k4, c23465k5, c23465k6, c23465k7, c23465k8, c23465k9, c23465k10, new C23465k("numberOfSetsOriginallyPlanned", Integer.valueOf(totalSets)), new C23465k("changedTemplete", Boolean.valueOf(activeWorkout.getAnalytics().getChangedTemplate())), new C23465k("numberOfSetsRepsEdited", Integer.valueOf(activeWorkout.getAnalytics().getSetIdsRepsEditedDuringWorkout().size())), new C23465k("numberOfSetsWeightEdited", Integer.valueOf(activeWorkout.getAnalytics().getSetIdsWeightEditedDuringWorkout().size())), new C23465k("rpe", activeWorkout.getRpe()), new C23465k("originId", activeWorkout.getParentTemplateId())), activeWorkout.getAnalytics().isQuickStart() ? AbstractC31061c.m95645u("source", "quick_start") : C25272z.f99163w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ ActiveWorkout m28273J0(C10769b c10769b, ActiveWorkout activeWorkout, Set set, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            set = activeWorkout.getCompletedSetData().keySet();
        }
        return c10769b.m28271I0(activeWorkout, set);
    }

    /* JADX INFO: renamed from: K */
    private final Set<UUID> m28274K(ActiveWorkout activeWorkout, Set<UUID> set, int i13, int i14, int i15) {
        List<WorkoutExercise> exercises;
        WorkoutExercise workoutExercise;
        List<WorkoutSet> sets;
        WorkoutSet workoutSet;
        WorkoutGroup workoutGroup = (WorkoutGroup) AbstractC25265s.m74102I0(i13, activeWorkout.getGroups());
        return (workoutGroup == null || (exercises = workoutGroup.getExercises()) == null || (workoutExercise = (WorkoutExercise) AbstractC25265s.m74102I0(i14, exercises)) == null || (sets = workoutExercise.getSets()) == null || (workoutSet = (WorkoutSet) AbstractC25265s.m74102I0(i15, sets)) == null) ? set : AbstractC12350b.m34555D(workoutSet.getId(), set);
    }

    /* JADX INFO: renamed from: K0 */
    private final ActiveWorkout m28275K0(ActiveWorkout activeWorkout, InterfaceC14786a.x xVar) {
        return ActiveWorkout.copy$default(activeWorkout, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(xVar.getRpe()), null, false, null, false, 253951, null);
    }

    /* JADX INFO: renamed from: L */
    private final ActiveWorkout m28276L(ActiveWorkout activeWorkout) {
        if (!(activeWorkout.getCurrentSetState() instanceof CurrentSetState.Cooldown)) {
            return activeWorkout;
        }
        return ActiveWorkout.copy$default(activeWorkout, null, null, null, null, null, null, null, m28262E(this, activeWorkout, null, 1, null), new CurrentSetState.Rest(((CurrentSetState.Cooldown) activeWorkout.getCurrentSetState()).getStartTime(), false, 2, (DefaultConstructorMarker) null), null, null, null, null, null, null, false, null, false, 261759, null);
    }

    /* JADX INFO: renamed from: L0 */
    private final Object m28277L0(ActiveWorkout activeWorkout, InterfaceC30057d<? super ActiveWorkout> interfaceC30057d) {
        return m28328r(new n(activeWorkout, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: M */
    private final void m28278M(C1601k1 savedStateHandle) {
        savedStateHandle.m5004e(Boolean.TRUE, "workoutCompleted");
        this.weightliftingRepository.m58193q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public final Object m28279M0(ActiveWorkout activeWorkout, InterfaceC30057d<? super InterfaceC34385a<?>> interfaceC30057d) {
        if (activeWorkout.getWorkoutTemplateId() != null) {
            return InterfaceC34385a.Companion.m108729b(InterfaceC34385a.INSTANCE, this.logger, null, "failed to update workout template edited during session", new o(activeWorkout, null), interfaceC30057d, 2, null);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX INFO: renamed from: N */
    private final ActiveWorkout m28280N(ActiveWorkout activeWorkout) {
        return m28334u(m28273J0(this, activeWorkout, null, 1, null));
    }

    /* JADX INFO: renamed from: N0 */
    private final Object m28281N0(ActiveWorkout activeWorkout, WorkoutTemplate workoutTemplate, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        String strValueOf = String.valueOf(activeWorkout.getStartTime().getMillis());
        String strM72490d = this.weightliftingSerializer.m72490d(workoutTemplate);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (strM72490d == null || workoutTemplate.getWorkoutTemplateKey() == null) {
            this.logger.mo85222m("Failed to start UpdatingTemplateInBackgroundWorker because of serializedWorkoutTemplate and/or workoutTemplateKey is null", new AbstractC30556a.a[0]);
            return c23454a0;
        }
        Object objM28307g0 = m28307g0(strValueOf, strM72490d, interfaceC30057d);
        return objM28307g0 == EnumC31071a.f128113w ? objM28307g0 : c23454a0;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008f  */
    /* JADX INFO: renamed from: O */
    private final ActiveWorkout m28282O(ActiveWorkout activeWorkout, int i13, int i14, int i15) {
        List<WorkoutExercise> exercises;
        WorkoutExercise workoutExercise;
        List<WorkoutSet> sets;
        WorkoutSet workoutSet;
        UUID id4;
        CurrentSetState currentSetState;
        WorkoutGroup workoutGroup = (WorkoutGroup) AbstractC25265s.m74102I0(i13, activeWorkout.getGroups());
        if (workoutGroup == null || (exercises = workoutGroup.getExercises()) == null || (workoutExercise = (WorkoutExercise) AbstractC25265s.m74102I0(i14, exercises)) == null || (sets = workoutExercise.getSets()) == null || (workoutSet = (WorkoutSet) AbstractC25265s.m74102I0(i15, sets)) == null || (id4 = workoutSet.getId()) == null) {
            return activeWorkout;
        }
        CompletedSetData completedSetData = activeWorkout.getCompletedSetData().get(id4);
        Map<UUID, CompletedSetData> mapM73996e0 = completedSetData != null ? AbstractC25247g0.m73996e0(AbstractC25247g0.m73991Z(id4, activeWorkout.getCompletedSetData()), new C23465k(id4, CompletedSetData.copy$default(completedSetData, null, false, null, null, true, 15, null))) : activeWorkout.getCompletedSetData();
        if (activeWorkout.getCurrentSetState() instanceof CurrentSetState.Active) {
            WorkoutSet currentSet = activeWorkout.getCurrentSet();
            if (id4.equals(currentSet != null ? currentSet.getId() : null)) {
                currentSetState = CurrentSetState.Active.copy$default((CurrentSetState.Active) activeWorkout.getCurrentSetState(), null, true, 1, null);
            } else {
                currentSetState = activeWorkout.getCurrentSetState();
            }
        } else {
            currentSetState = activeWorkout.getCurrentSetState();
        }
        return ActiveWorkout.copy$default(activeWorkout, null, null, null, null, null, null, null, null, currentSetState, mapM73996e0, null, null, null, null, null, false, null, false, 261375, null);
    }

    /* JADX INFO: renamed from: O0 */
    private final ActiveWorkout m28283O0(ActiveWorkout activeWorkout, InterfaceC14787b.n nVar, InterfaceC2994c0 interfaceC2994c0) {
        if (nVar instanceof InterfaceC14787b.p) {
            InterfaceC14787b.p pVar = (InterfaceC14787b.p) nVar;
            return m28282O(activeWorkout, pVar.getGroupIndex(), pVar.getExerciseIndex(), pVar.getSetIndex());
        }
        if (nVar instanceof InterfaceC14787b.q) {
            InterfaceC14787b.q qVar = (InterfaceC14787b.q) nVar;
            return m28291W(activeWorkout, qVar.getGroupIndex(), qVar.getExerciseIndex(), qVar.getSetIndex(), interfaceC2994c0);
        }
        if (nVar instanceof InterfaceC14787b.r) {
            InterfaceC14787b.r rVar = (InterfaceC14787b.r) nVar;
            return m28282O(activeWorkout, rVar.getGroupIndex(), rVar.getExerciseIndex(), rVar.getSetIndex());
        }
        if (nVar instanceof InterfaceC14787b.a) {
            return m28276L(activeWorkout);
        }
        if (nVar instanceof InterfaceC14787b.j) {
            return m28286R(activeWorkout, ((InterfaceC14787b.j) nVar).getGroupIndex());
        }
        return nVar instanceof InterfaceC14787b.d ? m28280N(activeWorkout) : activeWorkout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: P */
    public final Object m28284P(ActiveWorkout activeWorkout, WeightliftingWorkoutDto weightliftingWorkoutDto, C1601k1 c1601k1, boolean z4, InterfaceC30057d<? super ActiveWorkout> interfaceC30057d) {
        a aVar;
        C1601k1 c1601k2;
        boolean z13;
        ActiveWorkout activeWorkout2;
        ActiveWorkout activeWorkout3;
        C1601k1 c1601k3;
        ActiveWorkout activeWorkout4 = activeWorkout;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f32889G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f32889G = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f32887E;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = aVar.f32889G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            aVar.f32890w = activeWorkout4;
            aVar.f32891x = null;
            c1601k2 = c1601k1;
            aVar.f32892y = c1601k2;
            z13 = z4;
            aVar.f32893z = z13;
            aVar.f32889G = 1;
            if (m28325p0(activeWorkout4, weightliftingWorkoutDto, aVar) != obj2) {
            }
            return obj2;
        }
        if (i14 == 1) {
            boolean z14 = aVar.f32893z;
            C1601k1 c1601k4 = (C1601k1) aVar.f32892y;
            ActiveWorkout activeWorkout5 = (ActiveWorkout) aVar.f32890w;
            AbstractC34132o.m107864I(obj);
            c1601k2 = c1601k4;
            z13 = z14;
            activeWorkout4 = activeWorkout5;
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1601k3 = (C1601k1) aVar.f32892y;
            activeWorkout3 = (ActiveWorkout) aVar.f32890w;
            AbstractC34132o.m107864I(obj);
        }
        c1601k2 = c1601k3;
        activeWorkout2 = activeWorkout3;
        m28278M(c1601k2);
        return ActiveWorkout.copy$default(activeWorkout2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, InterfaceC10768a.a.e.f32861a, false, null, false, 245759, null);
        if (z13) {
            WorkoutTemplate workoutTemplate = activeWorkout4.getWorkoutTemplate();
            aVar.f32890w = activeWorkout4;
            aVar.f32891x = null;
            aVar.f32892y = c1601k2;
            aVar.f32893z = z13;
            aVar.f32889G = 2;
            if (m28281N0(activeWorkout4, workoutTemplate, aVar) != obj2) {
                activeWorkout3 = activeWorkout4;
                c1601k3 = c1601k2;
                c1601k2 = c1601k3;
                activeWorkout2 = activeWorkout3;
            }
            return obj2;
        }
        activeWorkout2 = activeWorkout4;
        m28278M(c1601k2);
        return ActiveWorkout.copy$default(activeWorkout2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, InterfaceC10768a.a.e.f32861a, false, null, false, 245759, null);
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ Object m28285Q(C10769b c10769b, ActiveWorkout activeWorkout, WeightliftingWorkoutDto weightliftingWorkoutDto, C1601k1 c1601k1, boolean z4, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        return c10769b.m28284P(activeWorkout, weightliftingWorkoutDto, c1601k1, z4, interfaceC30057d);
    }

    /* JADX INFO: renamed from: R */
    private final ActiveWorkout m28286R(ActiveWorkout activeWorkout, int i13) {
        Set<UUID> idsOfExpandedExercises;
        PositionInWorkout positionInWorkoutM28262E = m28262E(this, activeWorkout, null, 1, null);
        WorkoutGroup workoutGroup = (WorkoutGroup) AbstractC25265s.m74102I0(i13, activeWorkout.getGroups());
        if (workoutGroup == null || !AbstractC27147d.m81638b(workoutGroup, activeWorkout.getCompletedSetData().keySet())) {
            idsOfExpandedExercises = activeWorkout.getIdsOfExpandedExercises();
        } else {
            Set<UUID> idsOfExpandedExercises2 = activeWorkout.getIdsOfExpandedExercises();
            List<WorkoutExercise> exercises = activeWorkout.getGroups().get(i13).getExercises();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(exercises, 10));
            Iterator<T> it = exercises.iterator();
            while (it.hasNext()) {
                arrayList.add(((WorkoutExercise) it.next()).getId());
            }
            idsOfExpandedExercises = AbstractC12350b.m34605z(idsOfExpandedExercises2, AbstractC25265s.m74103I1(arrayList));
        }
        return ActiveWorkout.copy$default(activeWorkout, null, null, null, null, null, idsOfExpandedExercises, null, positionInWorkoutM28262E, null, null, null, null, null, null, null, false, null, false, 261983, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public final Object m28287S(ActiveWorkout activeWorkout, WeightliftingWorkoutDto weightliftingWorkoutDto, C1601k1 c1601k1, boolean z4, boolean z13, InterfaceC30057d<? super ActiveWorkout> interfaceC30057d) {
        return z13 ? m28284P(activeWorkout, weightliftingWorkoutDto, c1601k1, z4, interfaceC30057d) : ActiveWorkout.copy$default(activeWorkout, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new InterfaceC10768a.a.InterfaceC41434a.C41435a(z4), false, null, false, 245759, null);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ Object m28288T(C10769b c10769b, ActiveWorkout activeWorkout, WeightliftingWorkoutDto weightliftingWorkoutDto, C1601k1 c1601k1, boolean z4, boolean z13, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        if ((i13 & 8) != 0) {
            z13 = false;
        }
        return c10769b.m28287S(activeWorkout, weightliftingWorkoutDto, c1601k1, z4, z13, interfaceC30057d);
    }

    /* JADX INFO: renamed from: U */
    private final ActiveWorkout m28289U(ActiveWorkout activeWorkout, InterfaceC14787b.n nVar, InterfaceC2994c0 interfaceC2994c0) {
        m28261D0(activeWorkout, nVar);
        return m28283O0(m28299c0(m28309h0(m28326q(activeWorkout, nVar), nVar), nVar), nVar, interfaceC2994c0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: V */
    public final Object m28290V(ActiveWorkout activeWorkout, InterfaceC34385a<?> interfaceC34385a, InterfaceC30057d<? super ActiveWorkout> interfaceC30057d) {
        b bVar;
        ActiveWorkout activeWorkout2;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f32894E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f32894E = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f32897y;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = bVar.f32894E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (interfaceC34385a instanceof InterfaceC34385a.c) {
                return ActiveWorkout.copy$default(activeWorkout, null, null, null, null, null, null, null, null, null, null, null, null, null, null, InterfaceC10768a.a.c.f32859a, false, null, false, 245759, null);
            }
            if (!(interfaceC34385a instanceof InterfaceC34385a.b.C42432b) && (!(interfaceC34385a instanceof InterfaceC34385a.b.a) || !AbstractC34386b.m108738c((InterfaceC34385a.b.a) interfaceC34385a))) {
                return ActiveWorkout.copy$default(activeWorkout, null, null, null, null, null, null, null, null, null, null, null, null, null, null, InterfaceC10768a.a.b.f32858a, false, null, false, 245759, null);
            }
            activeWorkout2 = activeWorkout;
            WorkoutTemplate workoutTemplate = activeWorkout2.getWorkoutTemplate();
            bVar.f32895w = activeWorkout2;
            bVar.f32896x = null;
            bVar.f32894E = 1;
            if (m28281N0(activeWorkout2, workoutTemplate, bVar) == obj2) {
                return obj2;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activeWorkout2 = (ActiveWorkout) bVar.f32895w;
            AbstractC34132o.m107864I(obj);
        }
        return ActiveWorkout.copy$default(activeWorkout2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, InterfaceC10768a.a.f.f32862a, false, null, false, 245759, null);
    }

    /* JADX INFO: renamed from: W */
    private final ActiveWorkout m28291W(ActiveWorkout activeWorkout, int i13, int i14, int i15, InterfaceC2994c0 interfaceC2994c0) {
        List<WorkoutExercise> exercises;
        WorkoutExercise workoutExercise;
        List<WorkoutSet> sets;
        WorkoutSet workoutSet;
        UUID id4;
        WorkoutSet currentSet;
        WorkoutGroup workoutGroup = (WorkoutGroup) AbstractC25265s.m74102I0(i13, activeWorkout.getGroups());
        if (workoutGroup != null && (exercises = workoutGroup.getExercises()) != null && (workoutExercise = (WorkoutExercise) AbstractC25265s.m74102I0(i14, exercises)) != null && (sets = workoutExercise.getSets()) != null && (workoutSet = (WorkoutSet) AbstractC25265s.m74102I0(i15, sets)) != null && (id4 = workoutSet.getId()) != null && (currentSet = activeWorkout.getCurrentSet()) != null && id4.equals(currentSet.getId()) && (activeWorkout.getCurrentSetState() instanceof CurrentSetState.Active)) {
            Integer timeAsIntSeconds = currentSet.getTimeAsIntSeconds();
            int iIntValue = timeAsIntSeconds != null ? timeAsIntSeconds.intValue() * 1000 : Integer.MIN_VALUE;
            long millis = this.dateAndTimeProvider.mo133364c().getMillis() - ((CurrentSetState.Active) activeWorkout.getCurrentSetState()).getStartTime().getMillis();
            if (millis < iIntValue) {
                m28327q0(activeWorkout, interfaceC2994c0, Integer.valueOf(iIntValue - ((int) millis)));
                return activeWorkout;
            }
            InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) ((C13045h2) this.setTimerHapticsJob).getValue();
            if (interfaceC3027k1 != null) {
                interfaceC3027k1.cancel((CancellationException) null);
            }
        }
        return activeWorkout;
    }

    /* JADX INFO: renamed from: Y */
    private final ActiveWorkout m28292Y(ActiveWorkout activeWorkout, int i13, int i14) {
        return ActiveWorkout.copy$default(activeWorkout, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new InterfaceC10768a.b.a(i13, i14), false, null, false, 245759, null);
    }

    /* JADX INFO: renamed from: Z */
    private final ActiveWorkout m28293Z(ActiveWorkout activeWorkout) {
        return ActiveWorkout.copy$default(activeWorkout, null, null, null, null, null, null, null, null, null, null, null, null, null, null, InterfaceC10768a.b.C41436b.f32865a, false, null, false, 245759, null);
    }

    /* JADX INFO: renamed from: a0 */
    private final ActiveWorkout m28295a0(ActiveWorkout activeWorkout, InterfaceC14786a.j jVar, String str) {
        if (!this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.STRENGTH_TRAINER_UNDO_SETS) || (!(activeWorkout.getCurrentSetState() instanceof CurrentSetState.Rest) && !(activeWorkout.getCurrentSetState() instanceof CurrentSetState.Cooldown))) {
            return activeWorkout;
        }
        InterfaceC14515a interfaceC14515a = this.baseAnalytics;
        UUID lastCompletedSetId = activeWorkout.getLastCompletedSetId();
        interfaceC14515a.mo41424f("Undo Set", str, (lastCompletedSetId == null || !lastCompletedSetId.equals(jVar.getUndoSetPosition().getSetId())) ? "" : "Is Last Completed Set", "Workout Builder");
        return ActiveWorkout.copy$default(activeWorkout, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new InterfaceC10768a.b.d(jVar.getUndoSetPosition()), false, null, false, 245759, null);
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ ActiveWorkout m28297b0(C10769b c10769b, ActiveWorkout activeWorkout, InterfaceC14786a.j jVar, String str, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = "Tapped on Icon";
        }
        return c10769b.m28295a0(activeWorkout, jVar, str);
    }

    /* JADX INFO: renamed from: c0 */
    private final ActiveWorkout m28299c0(ActiveWorkout activeWorkout, InterfaceC14787b.n nVar) {
        C14788c c14788cM42515t = this.editableWorkoutSharedInteractor.m42515t(new C14788c(activeWorkout.getGroups(), activeWorkout.getIdsOfExpandedExercises(), activeWorkout.getManuallyEditedSetIds(), activeWorkout.getCompletedSetData().keySet()), nVar);
        return ActiveWorkout.copy$default(activeWorkout, null, null, null, c14788cM42515t.m42470f(), null, c14788cM42515t.m42471g(), null, null, null, null, null, null, null, null, null, false, c14788cM42515t.m42472h(), false, 196567, null);
    }

    /* JADX INFO: renamed from: d0 */
    private final ActiveWorkout m28301d0(ActiveWorkout activeWorkout, int i13, int i14) {
        List<WorkoutExercise> exercises;
        WorkoutExercise workoutExercise;
        WorkoutSet currentSet;
        WorkoutGroup workoutGroup = (WorkoutGroup) AbstractC25265s.m74102I0(i13, activeWorkout.getGroups());
        if (workoutGroup == null || (exercises = workoutGroup.getExercises()) == null || (workoutExercise = (WorkoutExercise) AbstractC25265s.m74102I0(i14, exercises)) == null || (currentSet = activeWorkout.getCurrentSet()) == null || !workoutExercise.getSets().contains(currentSet)) {
            return activeWorkout;
        }
        ActiveWorkout activeWorkoutM28332t = m28332t(activeWorkout);
        List<WorkoutSet> sets = workoutExercise.getSets();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sets, 10));
        Iterator<T> it = sets.iterator();
        while (it.hasNext()) {
            arrayList.add(((WorkoutSet) it.next()).getId());
        }
        return m28313j0(m28271I0(activeWorkoutM28332t, AbstractC25265s.m74103I1(arrayList)), workoutExercise.getId());
    }

    /* JADX INFO: renamed from: e0 */
    private final ActiveWorkout m28303e0(ActiveWorkout activeWorkout, int i13, int i14) {
        List<WorkoutExercise> exercises;
        WorkoutGroup workoutGroup = (WorkoutGroup) AbstractC25265s.m74102I0(i13, activeWorkout.getGroups());
        if (workoutGroup == null || (exercises = workoutGroup.getExercises()) == null) {
            return activeWorkout;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = exercises.iterator();
        while (it.hasNext()) {
            WorkoutSet workoutSet = (WorkoutSet) AbstractC25265s.m74102I0(i14, ((WorkoutExercise) it.next()).getSets());
            if (workoutSet != null) {
                arrayList.add(workoutSet);
            }
        }
        WorkoutSet currentSet = activeWorkout.getCurrentSet();
        if (currentSet == null || !arrayList.contains(currentSet)) {
            return activeWorkout;
        }
        ActiveWorkout activeWorkoutM28332t = m28332t(activeWorkout);
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((WorkoutSet) it3.next()).getId());
        }
        return m28271I0(activeWorkoutM28332t, AbstractC25265s.m74103I1(arrayList2));
    }

    /* JADX INFO: renamed from: f0 */
    private final Object m28305f0(String str, String str2, WeightliftingWorkoutDto weightliftingWorkoutDto, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM8705K = AbstractC3006f0.m8705K(this.dispatcherFactory.getIO(), new d(str, this, str2, weightliftingWorkoutDto, null), interfaceC30057d);
        return objM8705K == EnumC31071a.f128113w ? objM8705K : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g0 */
    private final Object m28307g0(String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM8705K = AbstractC3006f0.m8705K(this.dispatcherFactory.getIO(), new e(str, this, str2, null), interfaceC30057d);
        return objM8705K == EnumC31071a.f128113w ? objM8705K : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h0 */
    private final ActiveWorkout m28309h0(ActiveWorkout activeWorkout, InterfaceC14787b.n nVar) {
        if (nVar instanceof InterfaceC14787b.d) {
            InterfaceC14787b.d dVar = (InterfaceC14787b.d) nVar;
            return m28301d0(activeWorkout, dVar.getGroupIndex(), dVar.getExerciseIndex());
        }
        if (!(nVar instanceof InterfaceC14787b.j)) {
            return activeWorkout;
        }
        InterfaceC14787b.j jVar = (InterfaceC14787b.j) nVar;
        return m28303e0(activeWorkout, jVar.getGroupIndex(), jVar.getSetIndex());
    }

    /* JADX INFO: renamed from: i0 */
    private final ActiveWorkout m28311i0(ActiveWorkout activeWorkout) {
        PositionInWorkout positionInWorkoutM28262E;
        WorkoutTemplate workoutTemplateM42545h = this.strengthTrainerInteractor.m42545h();
        if (!AbstractC22676k.m65745e(workoutTemplateM42545h.getWorkoutTemplateKey(), activeWorkout.getWorkoutTemplate().getWorkoutTemplateKey()) || workoutTemplateM42545h.equals(activeWorkout.getWorkoutTemplate())) {
            return activeWorkout;
        }
        Set setM34605z = AbstractC12350b.m34605z(workoutTemplateM42545h.getAllExerciseIds(), activeWorkout.getWorkoutTemplate().getAllExerciseIds());
        boolean z4 = (activeWorkout.getCurrentSetState() instanceof CurrentSetState.Cooldown) && !setM34605z.isEmpty();
        ActiveWorkout activeWorkoutCopy$default = ActiveWorkout.copy$default(activeWorkout, null, null, null, workoutTemplateM42545h.getGroups(), null, AbstractC12350b.m34556E(activeWorkout.getIdsOfExpandedExercises(), setM34605z), null, null, z4 ? new CurrentSetState.Rest(((CurrentSetState.Cooldown) activeWorkout.getCurrentSetState()).getStartTime(), false, 2, (DefaultConstructorMarker) null) : activeWorkout.getCurrentSetState(), null, null, null, WorkoutAnalytics.copy$default(activeWorkout.getAnalytics(), setM34605z.size() + activeWorkout.getAnalytics().getNumExercisesAddedDuringWorkout(), 0, 0, 0, 0, 0, 0, false, null, null, false, 2046, null), null, null, false, null, false, 257751, null);
        if (activeWorkoutCopy$default.getPositionInWorkout() == null) {
            positionInWorkoutM28262E = m28270I(workoutTemplateM42545h);
        } else {
            positionInWorkoutM28262E = z4 ? m28262E(this, activeWorkoutCopy$default, null, 1, null) : activeWorkoutCopy$default.getPositionInWorkout();
        }
        return ActiveWorkout.copy$default(activeWorkoutCopy$default, null, null, null, null, null, null, null, positionInWorkoutM28262E, null, null, null, null, null, null, null, false, null, false, 262015, null);
    }

    /* JADX INFO: renamed from: j0 */
    private final ActiveWorkout m28313j0(ActiveWorkout activeWorkout, UUID uuid) {
        return ActiveWorkout.copy$default(activeWorkout, null, null, null, null, null, AbstractC12350b.m34604y(uuid, activeWorkout.getIdsOfExpandedExercises()), null, null, null, null, null, null, null, null, null, false, null, false, 262111, null);
    }

    /* JADX INFO: renamed from: k0 */
    private final ActiveWorkout m28315k0(ActiveWorkout activeWorkout) {
        if (activeWorkout != null) {
            return activeWorkout;
        }
        WorkoutSessionState workoutSessionStateM58194t = this.weightliftingRepository.m58194t();
        ActiveWorkout lastSavedActiveWorkout = workoutSessionStateM58194t != null ? workoutSessionStateM58194t.getLastSavedActiveWorkout() : null;
        if (lastSavedActiveWorkout != null) {
            return m28332t(lastSavedActiveWorkout);
        }
        this.logger.mo85226q("RestoreWorkout called but no saved active workout is available", new AbstractC30556a.a[0]);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public final Object m28317l0(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return this.hapticsWrapper.m75196f(interfaceC30057d);
    }

    /* JADX INFO: renamed from: m0 */
    private final Object m28319m0(ActiveWorkout activeWorkout, C1601k1 c1601k1, InterfaceC30057d<? super ActiveWorkout> interfaceC30057d) {
        return m28328r(new f(activeWorkout, c1601k1, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: n0 */
    private final Object m28321n0(ActiveWorkout activeWorkout, C1601k1 c1601k1, InterfaceC30057d<? super ActiveWorkout> interfaceC30057d) {
        return m28328r(new g(activeWorkout, c1601k1, null), interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: o0 */
    public final Object m28323o0(WeightliftingWorkoutDto weightliftingWorkoutDto, C1601k1 c1601k1, InterfaceC30057d<? super InterfaceC34385a<?>> interfaceC30057d) {
        h hVar;
        Object obj;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i13 = hVar.f32944H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hVar.f32944H = i13 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        h hVar2 = hVar;
        Object objM108729b = hVar2.f32942F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = hVar2.f32944H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            i iVar = new i(weightliftingWorkoutDto, null);
            hVar2.f32945w = null;
            hVar2.f32946x = c1601k1;
            hVar2.f32944H = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "failed to save weightlifting workout", iVar, hVar2, 2, null);
            if (objM108729b != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            c1601k1 = (C1601k1) hVar2.f32946x;
            AbstractC34132o.m107864I(objM108729b);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = hVar2.f32947y;
            c1601k1 = (C1601k1) hVar2.f32946x;
            AbstractC34132o.m107864I(objM108729b);
        }
        m28278M(c1601k1);
        return obj;
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            if (interfaceC34385a instanceof InterfaceC34385a.b.C42432b) {
                m28331s0("Timeout");
                return objM108729b;
            }
            if (!(interfaceC34385a instanceof InterfaceC34385a.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            m28331s0(AbstractC2875y.m8295h(((InterfaceC34385a.b.a) interfaceC34385a).getErrorCode(), "error "));
            return objM108729b;
        }
        this.prefsStore.m109538q(SharedPreferenceConstants.DAY_ZERO_TASK_ACTIVITY_COMPLETED, true);
        C37378a c37378a = this.scopeCoordinator;
        hVar2.f32945w = null;
        hVar2.f32946x = c1601k1;
        hVar2.f32947y = objM108729b;
        hVar2.f32948z = null;
        hVar2.f32941E = 0;
        hVar2.f32944H = 2;
        if (C37378a.m119655c(c37378a, null, hVar2, 1, null) != enumC31071a) {
            obj = objM108729b;
            m28278M(c1601k1);
            return obj;
        }
        return enumC31071a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p0 */
    public final Object m28325p0(ActiveWorkout activeWorkout, WeightliftingWorkoutDto weightliftingWorkoutDto, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        j jVar;
        if (interfaceC30057d instanceof j) {
            jVar = (j) interfaceC30057d;
            int i13 = jVar.f32956I;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                jVar.f32956I = i13 - Integer.MIN_VALUE;
            } else {
                jVar = new j(interfaceC30057d);
            }
        } else {
            jVar = new j(interfaceC30057d);
        }
        Object obj = jVar.f32954G;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = jVar.f32956I;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            String strValueOf = String.valueOf(activeWorkout.getStartTime().getMillis());
            String strM72489c = this.weightliftingSerializer.m72489c(weightliftingWorkoutDto);
            if (strM72489c != null) {
                jVar.f32957w = null;
                jVar.f32958x = null;
                jVar.f32959y = null;
                jVar.f32960z = null;
                jVar.f32952E = null;
                jVar.f32953F = 0;
                jVar.f32956I = 1;
                if (m28305f0(strValueOf, strM72489c, weightliftingWorkoutDto, jVar) == obj2) {
                    return obj2;
                }
            } else {
                this.logger.mo85222m("Failed to start SavingWorkoutInBackgroundWorker because of serializedWorkout being null", new AbstractC30556a.a[0]);
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    private final ActiveWorkout m28326q(ActiveWorkout activeWorkout, InterfaceC14787b.n nVar) {
        WorkoutAnalytics analytics;
        List<WorkoutExercise> exercises;
        WorkoutExercise workoutExercise;
        List<WorkoutSet> sets;
        List<WorkoutExercise> exercises2;
        List<WorkoutExercise> exercises3;
        List<WorkoutExercise> exercises4;
        int size = 0;
        if (nVar instanceof InterfaceC14787b.a) {
            WorkoutAnalytics analytics2 = activeWorkout.getAnalytics();
            int numSetsAddedDuringWorkout = activeWorkout.getAnalytics().getNumSetsAddedDuringWorkout();
            InterfaceC14787b.a aVar = (InterfaceC14787b.a) nVar;
            WorkoutGroup workoutGroup = (WorkoutGroup) AbstractC25265s.m74102I0(aVar.getGroupIndex(), activeWorkout.getGroups());
            if (workoutGroup != null && (exercises4 = workoutGroup.getExercises()) != null) {
                size = exercises4.size();
            }
            analytics = AbstractC25265s.m74102I0(aVar.getGroupIndex(), activeWorkout.getGroups()) != null ? WorkoutAnalytics.copy$default(analytics2, 0, 0, numSetsAddedDuringWorkout + size, 0, 0, 0, 0, false, null, null, false, 2043, null) : null;
            if (analytics == null) {
                analytics = activeWorkout.getAnalytics();
            }
        } else if (nVar instanceof InterfaceC14787b.d) {
            WorkoutAnalytics workoutAnalyticsCopy$default = WorkoutAnalytics.copy$default(activeWorkout.getAnalytics(), 0, activeWorkout.getAnalytics().getNumExercisesRemovedDuringWorkout() + 1, 0, 0, 0, 0, 0, false, null, null, false, 2045, null);
            InterfaceC14787b.d dVar = (InterfaceC14787b.d) nVar;
            WorkoutGroup workoutGroup2 = (WorkoutGroup) AbstractC25265s.m74102I0(dVar.getGroupIndex(), activeWorkout.getGroups());
            analytics = ((workoutGroup2 == null || (exercises3 = workoutGroup2.getExercises()) == null) ? null : (WorkoutExercise) AbstractC25265s.m74102I0(dVar.getExerciseIndex(), exercises3)) != null ? workoutAnalyticsCopy$default : null;
            if (analytics == null) {
                analytics = activeWorkout.getAnalytics();
            }
        } else if (nVar instanceof InterfaceC14787b.j) {
            WorkoutAnalytics analytics3 = activeWorkout.getAnalytics();
            int numSetsRemovedDuringWorkout = activeWorkout.getAnalytics().getNumSetsRemovedDuringWorkout();
            InterfaceC14787b.j jVar = (InterfaceC14787b.j) nVar;
            WorkoutGroup workoutGroup3 = (WorkoutGroup) AbstractC25265s.m74102I0(jVar.getGroupIndex(), activeWorkout.getGroups());
            if (workoutGroup3 != null && (exercises2 = workoutGroup3.getExercises()) != null) {
                size = exercises2.size();
            }
            WorkoutAnalytics workoutAnalyticsCopy$default2 = WorkoutAnalytics.copy$default(analytics3, 0, 0, 0, numSetsRemovedDuringWorkout + size, 0, 0, 0, false, null, null, false, 2039, null);
            WorkoutGroup workoutGroup4 = (WorkoutGroup) AbstractC25265s.m74102I0(jVar.getGroupIndex(), activeWorkout.getGroups());
            analytics = ((workoutGroup4 == null || (exercises = workoutGroup4.getExercises()) == null || (workoutExercise = (WorkoutExercise) AbstractC25265s.m74096F0(exercises)) == null || (sets = workoutExercise.getSets()) == null) ? null : (WorkoutSet) AbstractC25265s.m74102I0(jVar.getSetIndex(), sets)) != null ? workoutAnalyticsCopy$default2 : null;
            if (analytics == null) {
                analytics = activeWorkout.getAnalytics();
            }
        } else if (nVar instanceof InterfaceC14787b.p) {
            InterfaceC14787b.p pVar = (InterfaceC14787b.p) nVar;
            analytics = WorkoutAnalytics.copy$default(activeWorkout.getAnalytics(), 0, 0, 0, 0, 0, 0, 0, false, m28274K(activeWorkout, activeWorkout.getAnalytics().getSetIdsRepsEditedDuringWorkout(), pVar.getGroupIndex(), pVar.getExerciseIndex(), pVar.getSetIndex()), null, false, 1791, null);
        } else if (nVar instanceof InterfaceC14787b.q) {
            InterfaceC14787b.q qVar = (InterfaceC14787b.q) nVar;
            analytics = WorkoutAnalytics.copy$default(activeWorkout.getAnalytics(), 0, 0, 0, 0, 0, 0, 0, false, m28274K(activeWorkout, activeWorkout.getAnalytics().getSetIdsRepsEditedDuringWorkout(), qVar.getGroupIndex(), qVar.getExerciseIndex(), qVar.getSetIndex()), null, false, 1791, null);
        } else if (nVar instanceof InterfaceC14787b.r) {
            InterfaceC14787b.r rVar = (InterfaceC14787b.r) nVar;
            analytics = WorkoutAnalytics.copy$default(activeWorkout.getAnalytics(), 0, 0, 0, 0, 0, 0, 0, false, null, m28274K(activeWorkout, activeWorkout.getAnalytics().getSetIdsWeightEditedDuringWorkout(), rVar.getGroupIndex(), rVar.getExerciseIndex(), rVar.getSetIndex()), false, 1535, null);
        } else {
            analytics = activeWorkout.getAnalytics();
        }
        return ActiveWorkout.copy$default(activeWorkout, null, null, null, null, null, null, null, null, null, null, null, null, analytics, null, null, false, null, false, 258047, null);
    }

    /* JADX INFO: renamed from: q0 */
    private final void m28327q0(ActiveWorkout activeWorkout, InterfaceC2994c0 interfaceC2994c0, Integer num) {
        AbstractC28181m0.m85298b(interfaceC2994c0, this.setTimerHapticsJob, null, new k(num, this, null), 2, null);
    }

    /* JADX INFO: renamed from: r */
    private final <T> Object m28328r(InterfaceC4351m interfaceC4351m, InterfaceC30057d<? super T> interfaceC30057d) {
        return AbstractC28190p0.m85321a(1500L, interfaceC4351m, interfaceC30057d);
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m28329r0(C10769b c10769b, ActiveWorkout activeWorkout, InterfaceC2994c0 interfaceC2994c0, Integer num, int i13, Object obj) {
        Integer timeAsIntSeconds;
        if ((i13 & 2) != 0) {
            WorkoutSet currentSet = activeWorkout.getCurrentSet();
            num = (currentSet == null || (timeAsIntSeconds = currentSet.getTimeAsIntSeconds()) == null) ? null : Integer.valueOf(timeAsIntSeconds.intValue() * 1000);
        }
        c10769b.m28327q0(activeWorkout, interfaceC2994c0, num);
    }

    /* JADX INFO: renamed from: s */
    private final ActiveWorkout m28330s(ActiveWorkout activeWorkout) {
        this.baseAnalytics.mo41428k("Leave Set", "Pause Workout", "", "Workout Builder", AbstractC25247g0.m73990Y(new C23465k("workoutId", activeWorkout.getWorkoutTemplateId()), new C23465k("setNumber", Integer.valueOf(activeWorkout.getCompletedSetData().size() + 1))));
        return ActiveWorkout.copy$default(activeWorkout, null, null, null, null, null, null, null, null, activeWorkout.getCompletedSetData().isEmpty() ? new CurrentSetState.Warmup(this.dateAndTimeProvider.mo133364c()) : new CurrentSetState.Rest(this.dateAndTimeProvider.mo133364c(), true), null, null, null, WorkoutAnalytics.copy$default(activeWorkout.getAnalytics(), 0, 0, 0, 0, 0, 0, activeWorkout.getAnalytics().getNumSetsCancelled() + 1, false, null, null, false, 1983, null), null, null, false, null, false, 257791, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public final void m28331s0(String failureReason) {
        InterfaceC14515a.m41418i(this.baseAnalytics, "Save Workout", EnumC39339b.RESULT_FAILURE, null, "Workout Builder", null, AbstractC31061c.m95645u("failureReason", failureReason), 20, null);
    }

    /* JADX INFO: renamed from: t */
    private final ActiveWorkout m28332t(ActiveWorkout activeWorkout) {
        return activeWorkout.getCurrentSetState() instanceof CurrentSetState.Active ? m28330s(activeWorkout) : activeWorkout;
    }

    /* JADX INFO: renamed from: t0 */
    private final boolean m28333t0(InterfaceC14786a interfaceC14786a) {
        if ((interfaceC14786a instanceof InterfaceC14786a.e) || (interfaceC14786a instanceof InterfaceC14786a.d) || (interfaceC14786a instanceof InterfaceC14786a.r) || (interfaceC14786a instanceof InterfaceC14786a.k) || (interfaceC14786a instanceof InterfaceC14787b.n)) {
            return true;
        }
        return this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.WEIGHTLIFTING_INTERACTIVE_NOTIFICATIONS) && (interfaceC14786a instanceof InterfaceC14786a.q);
    }

    /* JADX INFO: renamed from: u */
    private final ActiveWorkout m28334u(ActiveWorkout activeWorkout) {
        if (activeWorkout.getCurrentDialog() instanceof InterfaceC10768a.b.C41436b) {
            this.baseAnalytics.mo41424f("", "Discard Workout - Cancel", "", "Workout Builder");
        }
        return ActiveWorkout.copy$default(activeWorkout, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, 237567, null);
    }

    /* JADX INFO: renamed from: u0 */
    private final boolean m28335u0(ActiveWorkout activeWorkout) {
        WorkoutSet currentSet;
        WorkoutExercise currentExercise = activeWorkout.getCurrentExercise();
        return currentExercise != null && (currentSet = activeWorkout.getCurrentSet()) != null && currentExercise.getExercise().getVolumeInputFormat() == VolumeInputFormat.Time && currentSet.getTimeAsIntSeconds() == null;
    }

    /* JADX INFO: renamed from: v */
    private final ActiveWorkout m28336v(ActiveWorkout activeWorkout) {
        WorkoutExercise currentExercise = activeWorkout.getCurrentExercise();
        if (currentExercise != null) {
            List<WorkoutSet> sets = currentExercise.getSets();
            if (!(sets instanceof Collection) || !sets.isEmpty()) {
                Iterator<T> it = sets.iterator();
                while (it.hasNext()) {
                    if (!activeWorkout.getCompletedSetData().containsKey(((WorkoutSet) it.next()).getId())) {
                    }
                }
            }
            return ActiveWorkout.copy$default(activeWorkout, null, null, null, null, null, AbstractC12350b.m34604y(currentExercise.getId(), activeWorkout.getIdsOfExpandedExercises()), null, null, null, null, null, null, null, null, null, false, null, false, 262111, null);
        }
        return activeWorkout;
    }

    /* JADX INFO: renamed from: v0 */
    private final ActiveWorkout m28337v0(ActiveWorkout activeWorkout, EnumC27144a enumC27144a) {
        return ActiveWorkout.copy$default(activeWorkout, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new InterfaceC10768a.a.d(enumC27144a), false, null, false, 245759, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final WeightliftingWorkoutDto m28338w(ActiveWorkout activeWorkout) {
        InterfaceC14515a.m41418i(this.baseAnalytics, "Save Workout", "End Workout", null, "Workout Builder", null, m28272J(activeWorkout), 20, null);
        return WeightliftingWorkoutKt.toDto(activeWorkout.toCompletedWeightliftingWorkout(this.dateAndTimeProvider.mo133364c()));
    }

    /* JADX INFO: renamed from: w0 */
    private final ActiveWorkout m28339w0(ActiveWorkout activeWorkout, InterfaceC2994c0 interfaceC2994c0, EnumC12379c enumC12379c, boolean z4) {
        if ((activeWorkout.getCurrentSetState() instanceof CurrentSetState.Active) || activeWorkout.getGroups().isEmpty()) {
            return activeWorkout;
        }
        AbstractC12378b.m34742l(this.baseAnalytics, "Start Set", activeWorkout.getWorkoutTemplateId(), null, activeWorkout.getCompletedSetData().size() + 1, enumC12379c, z4 ? "From Triangle" : "", 4, null);
        if (m28340x(activeWorkout)) {
            m28329r0(this, activeWorkout, interfaceC2994c0, null, 2, null);
        }
        return ActiveWorkout.copy$default(activeWorkout, null, null, null, null, null, null, null, null, new CurrentSetState.Active(this.dateAndTimeProvider.mo133364c(), false, 2, (DefaultConstructorMarker) null), null, null, null, null, null, null, false, null, false, 261887, null);
    }

    /* JADX INFO: renamed from: x */
    private final boolean m28340x(ActiveWorkout activeWorkout) {
        WorkoutSet currentSet;
        Integer timeAsIntSeconds;
        WorkoutExercise currentExercise = activeWorkout.getCurrentExercise();
        return (currentExercise == null || (currentSet = activeWorkout.getCurrentSet()) == null || currentExercise.getExercise().getVolumeInputFormat() != VolumeInputFormat.Time || (timeAsIntSeconds = currentSet.getTimeAsIntSeconds()) == null || timeAsIntSeconds.intValue() <= 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: x0 */
    public final Object m28341x0(StrapLocation strapLocation, StrapLaterality strapLaterality, boolean z4, InterfaceC30057d<? super ActiveWorkout> interfaceC30057d) {
        l lVar;
        WorkoutTemplate workoutTemplateM42545h;
        PositionInWorkout positionInWorkoutM28270I;
        StrapLocation strapLocation2;
        StrapLaterality strapLaterality2;
        boolean z13;
        if (interfaceC30057d instanceof l) {
            lVar = (l) interfaceC30057d;
            int i13 = lVar.f32971I;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lVar.f32971I = i13 - Integer.MIN_VALUE;
            } else {
                lVar = new l(interfaceC30057d);
            }
        } else {
            lVar = new l(interfaceC30057d);
        }
        Object objM70812a = lVar.f32969G;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = lVar.f32971I;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM70812a);
            workoutTemplateM42545h = this.strengthTrainerInteractor.m42545h();
            positionInWorkoutM28270I = m28270I(workoutTemplateM42545h);
            C24003m c24003m = this.simplerStrengthExperimentHelper;
            lVar.f32972w = strapLocation;
            lVar.f32973x = strapLaterality;
            lVar.f32974y = workoutTemplateM42545h;
            lVar.f32975z = positionInWorkoutM28270I;
            lVar.f32967E = z4;
            lVar.f32968F = 0;
            lVar.f32971I = 1;
            objM70812a = c24003m.m70812a(lVar);
            if (objM70812a == enumC31071a) {
                return enumC31071a;
            }
            strapLocation2 = strapLocation;
            strapLaterality2 = strapLaterality;
            z13 = z4;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z14 = lVar.f32967E;
            positionInWorkoutM28270I = (PositionInWorkout) lVar.f32975z;
            workoutTemplateM42545h = (WorkoutTemplate) lVar.f32974y;
            StrapLaterality strapLaterality3 = (StrapLaterality) lVar.f32973x;
            StrapLocation strapLocation3 = (StrapLocation) lVar.f32972w;
            AbstractC34132o.m107864I(objM70812a);
            strapLocation2 = strapLocation3;
            z13 = z14;
            strapLaterality2 = strapLaterality3;
        }
        PositionInWorkout positionInWorkout = positionInWorkoutM28270I;
        boolean z15 = objM70812a == EnumC24004n.CHECKMARK;
        if (positionInWorkout != null || z13) {
            this.baseAnalytics.mo41428k("", "Start Workout", "", "Workout Builder", AbstractC25247g0.m73990Y(new C23465k("workoutId", workoutTemplateM42545h.getWorkoutTemplateKey()), new C23465k("strapLocation", AbstractC18489d0.m53370k(strapLaterality2.name(), " ", strapLocation2.name()))));
            return new ActiveWorkout(workoutTemplateM42545h.getName(), workoutTemplateM42545h.getParentTemplateKey(), workoutTemplateM42545h.getWorkoutTemplateKey(), workoutTemplateM42545h.getGroups(), null, workoutTemplateM42545h.getAllExerciseIds(), this.dateAndTimeProvider.mo133364c(), positionInWorkout, new CurrentSetState.Warmup(this.dateAndTimeProvider.mo133364c()), C25272z.f99163w, strapLocation2, strapLaterality2, new WorkoutAnalytics(0, 0, 0, 0, 0, 0, 0, false, (Set) null, (Set) null, z13, 1023, (DefaultConstructorMarker) null), null, null, false, null, z15, 122896, null);
        }
        this.logger.mo85226q("Unable to start workout because workout template has no startable sets", new AbstractC30556a.a[0]);
        InterfaceC14515a.m41418i(this.baseAnalytics, "Start Workout", EnumC39339b.RESULT_FAILURE, null, "Workout Builder", null, AbstractC25247g0.m73990Y(new C23465k("failureReason", "invalid_workout_template_on_start_workout"), new C23465k("workoutId", workoutTemplateM42545h.getWorkoutTemplateKey()), new C23465k("strapLocation", AbstractC18489d0.m53370k(strapLaterality2.name(), " ", strapLocation2.name()))), 20, null);
        return null;
    }

    /* JADX INFO: renamed from: y */
    private final ActiveWorkout m28342y(ActiveWorkout activeWorkout) {
        this.weightliftingRepository.m58193q();
        this.baseAnalytics.mo41428k("", "Discard Workout", "", "Workout Builder", m28272J(activeWorkout));
        return ActiveWorkout.copy$default(activeWorkout, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, false, 229375, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x0088  */
    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX INFO: renamed from: y0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m28343y0(com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkout r6, bc3.InterfaceC2994c0 r7, du2.EnumC12379c r8, q83.InterfaceC30057d<? super com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkout> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.whoop.weightlifting.feature.active.activeworkout.domain.C10769b.m
            if (r0 == 0) goto L13
            r0 = r9
            com.whoop.weightlifting.feature.active.activeworkout.domain.b$m r0 = (com.whoop.weightlifting.feature.active.activeworkout.domain.C10769b.m) r0
            int r1 = r0.f32977F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32977F = r1
            goto L18
        L13:
            com.whoop.weightlifting.feature.active.activeworkout.domain.b$m r0 = new com.whoop.weightlifting.feature.active.activeworkout.domain.b$m
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f32981z
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f32977F
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L50
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r6 = r0.f32980y
            du2.c r6 = (du2.EnumC12379c) r6
            java.lang.Object r7 = r0.f32979x
            bc3.c0 r7 = (bc3.InterfaceC2994c0) r7
            java.lang.Object r7 = r0.f32978w
            com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkout r7 = (com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkout) r7
            p505ts.AbstractC34132o.m107864I(r9)
            goto L9a
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            java.lang.Object r6 = r0.f32980y
            r8 = r6
            du2.c r8 = (du2.EnumC12379c) r8
            java.lang.Object r6 = r0.f32979x
            r7 = r6
            bc3.c0 r7 = (bc3.InterfaceC2994c0) r7
            java.lang.Object r6 = r0.f32978w
            com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkout r6 = (com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkout) r6
            p505ts.AbstractC34132o.m107864I(r9)
            goto L72
        L50:
            p505ts.AbstractC34132o.m107864I(r9)
            com.whoop.weightlifting.feature.active.activeworkout.domain.CurrentSetState r9 = r6.getCurrentSetState()
            boolean r9 = r9 instanceof com.whoop.weightlifting.feature.active.activeworkout.domain.CurrentSetState.Rest
            if (r9 != 0) goto L63
            com.whoop.weightlifting.feature.active.activeworkout.domain.CurrentSetState r9 = r6.getCurrentSetState()
            boolean r9 = r9 instanceof com.whoop.weightlifting.feature.active.activeworkout.domain.CurrentSetState.Warmup
            if (r9 == 0) goto L80
        L63:
            r0.f32978w = r6
            r0.f32979x = r7
            r0.f32980y = r8
            r0.f32977F = r4
            java.lang.Object r9 = r5.m28317l0(r0)
            if (r9 != r1) goto L72
            goto L97
        L72:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L80
            r9 = 0
            com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkout r6 = r5.m28339w0(r6, r7, r8, r9)
            return r6
        L80:
            com.whoop.weightlifting.feature.active.activeworkout.domain.CurrentSetState r7 = r6.getCurrentSetState()
            boolean r7 = r7 instanceof com.whoop.weightlifting.feature.active.activeworkout.domain.CurrentSetState.Active
            if (r7 == 0) goto La8
            r0.f32978w = r6
            r7 = 0
            r0.f32979x = r7
            r0.f32980y = r8
            r0.f32977F = r3
            java.lang.Object r9 = r5.m28317l0(r0)
            if (r9 != r1) goto L98
        L97:
            return r1
        L98:
            r7 = r6
            r6 = r8
        L9a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            if (r8 == 0) goto La7
            com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkout r6 = r5.m28254A(r7, r6)
            return r6
        La7:
            return r7
        La8:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.weightlifting.feature.active.activeworkout.domain.C10769b.m28343y0(com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkout, bc3.c0, du2.c, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: z */
    private final ActiveWorkout m28344z(ActiveWorkout activeWorkout) {
        WorkoutSet currentSet;
        WorkoutExercise currentExercise;
        if ((activeWorkout.getCurrentSetState() instanceof CurrentSetState.Cooldown) || activeWorkout.getGroups().isEmpty() || (currentSet = activeWorkout.getCurrentSet()) == null || (currentExercise = activeWorkout.getCurrentExercise()) == null) {
            return activeWorkout;
        }
        AbstractC12378b.m34742l(this.baseAnalytics, "Complete Set", activeWorkout.getWorkoutTemplateId(), currentExercise.getExercise().getExerciseId(), activeWorkout.getCompletedSetData().size() + 1, EnumC12379c.EXERCISES, null, 32, null);
        DateTime dateTimeMo133364c = this.dateAndTimeProvider.mo133364c();
        CurrentSetState.Rest rest = new CurrentSetState.Rest(dateTimeMo133364c, false, 2, (DefaultConstructorMarker) null);
        Map<UUID, CompletedSetData> completedSetData = activeWorkout.getCompletedSetData();
        UUID id4 = currentSet.getId();
        DateTime dateTimePlusMillis = dateTimeMo133364c.plusMillis(1);
        AbstractC22676k.m65749i(dateTimePlusMillis, "plusMillis(...)");
        return m28273J0(this, m28336v(ActiveWorkout.copy$default(activeWorkout, null, null, null, null, null, null, null, null, rest, AbstractC25247g0.m73996e0(completedSetData, new C23465k(id4, new CompletedSetData(new DateTimeRange(dateTimeMo133364c, dateTimePlusMillis, null, null, 12, null), currentExercise.getExercise().getTrackable(), activeWorkout.getStrapLocation(), activeWorkout.getStrapLaterality(), false))), null, null, null, null, null, false, null, false, 261375, null)), null, 1, null);
    }

    /* JADX INFO: renamed from: z0 */
    private final ActiveWorkout m28345z0(ActiveWorkout activeWorkout) {
        return !(activeWorkout.getCurrentDialog() instanceof InterfaceC10768a.b.c) ? activeWorkout : ActiveWorkout.copy$default(activeWorkout, null, null, null, null, null, null, null, null, null, null, null, null, null, null, InterfaceC10768a.b.c.m28249c((InterfaceC10768a.b.c) activeWorkout.getCurrentDialog(), false, !((InterfaceC10768a.b.c) activeWorkout.getCurrentDialog()).getShouldUpdateTemplate(), 1, null), false, null, false, 245759, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c9, code lost:
    
        if (r14 == r1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x014e, code lost:
    
        if (r14 == r1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a7, code lost:
    
        if (r14 == r1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c3, code lost:
    
        if (r14 == r1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01df, code lost:
    
        if (r14 == r1) goto L99;
     */
    /* JADX INFO: renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m28346X(com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkout r10, fu2.InterfaceC14786a r11, bc3.InterfaceC2994c0 r12, androidx.lifecycle.C1601k1 r13, q83.InterfaceC30057d<? super com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkout> r14) {
        /*
            Method dump skipped, instruction units count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.weightlifting.feature.active.activeworkout.domain.C10769b.m28346X(com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkout, fu2.a, bc3.c0, androidx.lifecycle.k1, q83.d):java.lang.Object");
    }

    public /* synthetic */ C10769b(InterfaceC41070a interfaceC41070a, C14789d c14789d, C20938b c20938b, WeightliftingApi weightliftingApi, InterfaceC18260e interfaceC18260e, InterfaceC34116n interfaceC34116n, C37378a c37378a, C14794i c14794i, InterfaceC14515a interfaceC14515a, C34660d c34660d, InterfaceC18732d interfaceC18732d, FeatureFlagChecker featureFlagChecker, C25575d c25575d, AbstractC18377p0 abstractC18377p0, C24755e c24755e, InterfaceC12362e interfaceC12362e, C24003m c24003m, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC41070a, c14789d, c20938b, weightliftingApi, interfaceC18260e, (i13 & 32) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ActiveWorkoutInteractor") : interfaceC34116n, c37378a, c14794i, interfaceC14515a, c34660d, interfaceC18732d, featureFlagChecker, c25575d, abstractC18377p0, c24755e, interfaceC12362e, c24003m);
    }
}
