package p92;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import androidx.lifecycle.AbstractC1615p0;
import androidx.recyclerview.widget.AbstractC1707m0;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.google.android.gms.common.api.C4975f;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.whoop.analytics.strain.model.BiologicalSex;
import com.whoop.analytics.strain.model.HeartRateTimestamp;
import com.whoop.analytics.strain.model.StrainScore;
import com.whoop.analytics.strain.model.UserProfile;
import com.whoop.analytics.strain.model.util.ModelUtilities;
import com.whoop.data.repositories.RestingHeartRate;
import com.whoop.data.repositories.StartActivityRepository;
import com.whoop.domain.model.FitnessLevel;
import com.whoop.domain.model.Gender;
import com.whoop.domain.model.GenderBaseline;
import com.whoop.domain.model.User;
import com.whoop.p069ui.C10594l;
import com.whoop.service.network.model.UserState;
import com.whoop.weeklyplan.api.WeeklyPlanApiKt;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import g83.C15581g;
import gi0.AbstractC15883b;
import gi0.AbstractC15887f;
import hc3.AbstractC17182o;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import kh3.C22488a;
import l73.AbstractC23412c;
import l83.C23454a0;
import l83.C23465k;
import l83.InterfaceC23462h;
import lh3.C24082e;
import live.hms.video.utils.HMSConstantsKt;
import mi1.C25575d;
import no.nordicsemi.android.dfu.DfuBaseService;
import o52.C27566m0;
import or2.C28187o0;
import ox0.C28448b;
import p395p6.C28884h1;
import p503tp.AbstractC34036g;
import p503tp.AbstractC34037h;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rd1.C31245d;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sj0.C32562a;
import tr2.InterfaceC34116n;
import w73.C36928n;
import wb3.AbstractC37056f;
import xg3.C38280g;
import z82.C40191e;
import z92.InterfaceC40205a;
import ze1.C40588d;

/* JADX INFO: renamed from: p92.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000¬\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001aBw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\u0013\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%¢\u0006\u0004\b'\u0010(J\u0019\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0%0)¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u001f¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u001f¢\u0006\u0004\b/\u0010.J\u0013\u00101\u001a\b\u0012\u0004\u0012\u00020&00¢\u0006\u0004\b1\u00102J\u0013\u00104\u001a\b\u0012\u0004\u0012\u00020&03¢\u0006\u0004\b4\u00105J\u0013\u00106\u001a\b\u0012\u0004\u0012\u00020\u001d03¢\u0006\u0004\b6\u00105J\u0013\u00107\u001a\b\u0012\u0004\u0012\u00020&03¢\u0006\u0004\b7\u00105J#\u0010:\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&08j\u0002`903¢\u0006\u0004\b:\u00105J\u0013\u0010;\u001a\b\u0012\u0004\u0012\u00020&03¢\u0006\u0004\b;\u00105J\u0013\u0010<\u001a\b\u0012\u0004\u0012\u00020\"03¢\u0006\u0004\b<\u00105J\u0013\u0010>\u001a\b\u0012\u0004\u0012\u00020=03¢\u0006\u0004\b>\u00105J\u0013\u0010@\u001a\b\u0012\u0004\u0012\u00020?03¢\u0006\u0004\b@\u00105J\u0013\u0010A\u001a\b\u0012\u0004\u0012\u00020?03¢\u0006\u0004\bA\u00105J\u0017\u0010D\u001a\u00020\u001f2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020\u001f2\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bH\u0010IJ\u0015\u0010J\u001a\b\u0012\u0004\u0012\u00020B03H\u0002¢\u0006\u0004\bJ\u00105J\u0015\u0010K\u001a\b\u0012\u0004\u0012\u00020F03H\u0002¢\u0006\u0004\bK\u00105J\u0010\u0010M\u001a\u00020LH\u0082@¢\u0006\u0004\bM\u0010NJ\u0018\u0010P\u001a\u00020\u001d2\u0006\u0010O\u001a\u00020BH\u0082@¢\u0006\u0004\bP\u0010QJ\u0018\u0010S\u001a\u00020\u001d2\u0006\u0010R\u001a\u00020BH\u0082@¢\u0006\u0004\bS\u0010QJ'\u0010U\u001a\u0012\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&08j\u0002`92\u0006\u0010T\u001a\u00020&H\u0002¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\u001fH\u0002¢\u0006\u0004\bW\u0010.J\u0017\u0010Y\u001a\u00020\u001f2\u0006\u0010X\u001a\u00020\u001dH\u0002¢\u0006\u0004\bY\u0010!J\u000f\u0010Z\u001a\u00020\u001fH\u0002¢\u0006\u0004\bZ\u0010.J'\u0010_\u001a\u00020L2\u0006\u0010\\\u001a\u00020[2\u0006\u0010^\u001a\u00020]2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b_\u0010`R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u001a\u0010z\u001a\b\u0012\u0004\u0012\u00020&0w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u001a\u0010|\u001a\b\u0012\u0004\u0012\u00020\u001d0w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010yR\u001a\u0010~\u001a\b\u0012\u0004\u0012\u00020&0w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010yR\u001d\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020&0\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R,\u0010\u0084\u0001\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&08j\u0002`90w8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010yR\u001c\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020&0w8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010yR\u001e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00020\"0\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001e\u0010\u008c\u0001\u001a\t\u0012\u0004\u0012\u00020=0\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0089\u0001R\u001e\u0010\u008e\u0001\u001a\t\u0012\u0004\u0012\u00020?0\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u0089\u0001R\u001e\u0010\u0090\u0001\u001a\t\u0012\u0004\u0012\u00020?0\u0087\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0089\u0001R\u0018\u0010\u0094\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0018\u0010\u0098\u0001\u001a\u00030\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0019\u0010\u009b\u0001\u001a\u00030\u0099\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010#R\u001a\u0010\u009f\u0001\u001a\u00030\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0019\u0010¢\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0018\u0010£\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bP\u0010¡\u0001R\u0017\u0010X\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b_\u0010¡\u0001R\u0018\u0010¥\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¤\u0001\u0010ZR\u001b\u0010§\u0001\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010¦\u0001R\u0016\u0010¨\u0001\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b'\u0010¦\u0001R\u0017\u0010©\u0001\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010MR\u0017\u0010ª\u0001\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010MR\u0017\u0010«\u0001\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010MR@\u0010¯\u0001\u001a*\u0012\r\u0012\u000b \u00ad\u0001*\u0004\u0018\u00010&0& \u00ad\u0001*\u0013\u0012\r\u0012\u000b \u00ad\u0001*\u0004\u0018\u00010&0&\u0018\u00010%0¬\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bM\u0010®\u0001R\u0017\u0010°\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010ZR\u001f\u0010³\u0001\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b;\u0010±\u0001\u001a\u0006\b¡\u0001\u0010²\u0001R\u0018\u0010µ\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b@\u0010´\u0001R\u001b\u0010¸\u0001\u001a\u0005\u0018\u00010¶\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b<\u0010·\u0001R\u001a\u0010º\u0001\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bJ\u0010¹\u0001R\u0017\u0010»\u0001\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010UR\u0019\u0010¾\u0001\u001a\u00030¼\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b1\u0010½\u0001R\u0017\u0010¿\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010ZR\u0017\u0010Â\u0001\u001a\u00030À\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b:\u0010Á\u0001¨\u0006Ã\u0001"}, m65681d2 = {"Lp92/h;", "", "Landroid/content/Context;", "serviceContext", "Lz92/a;", "userInfoAccessor", "Lp92/c;", "gpsDataStore", "Lcom/whoop/data/repositories/StartActivityRepository;", "startActivityRepository", "Lrd1/d;", "rtStateMachine", "Lcom/whoop/data/repositories/RestingHeartRate;", "restingHr", "Lmi1/d;", "hapticsWrapper", "Lz82/e;", "eventDispatcher", "Lp92/i;", "realTimeStreamController", "Lp92/d;", "notifier", "Lbc3/c0;", "coroutineScope", "Lkotlin/Function1;", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "fusedClientProvider", "<init>", "(Landroid/content/Context;Lz92/a;Lp92/c;Lcom/whoop/data/repositories/StartActivityRepository;Lrd1/d;Lcom/whoop/data/repositories/RestingHeartRate;Lmi1/d;Lz82/e;Lp92/i;Lp92/d;Lbc3/c0;Lkotlin/jvm/functions/Function1;)V", "", WeeklyPlanApiKt.GOAL, "Ll83/a0;", "b0", "(D)V", "", "J", "()Z", "", "", "E", "()Ljava/util/List;", "Landroidx/lifecycle/p0;", "Lcom/whoop/data/local/room/entity/GpsDto;", "H", "()Landroidx/lifecycle/p0;", "c0", "()V", "h0", "Ll73/c;", "P", "()Ll73/c;", "Lxg3/g;", "O", "()Lxg3/g;", "V", "Q", "Ll83/k;", "Lcom/whoop/util/HeartRateStat;", "R", "K", "M", "Lp92/h$a;", "S", "", "L", "U", "Lsj0/a;", "hrResult", "W", "(Lsj0/a;)V", "Landroid/location/Location;", "newLocation", "X", "(Landroid/location/Location;)V", "N", "T", "Lcom/whoop/analytics/strain/model/UserProfile;", "I", "(Lq83/d;)Ljava/lang/Object;", "realTimeHrStream", "A", "(Lsj0/a;Lq83/d;)Ljava/lang/Object;", "heartRate", "G", "hr", "F", "(I)Ll83/k;", "Y", "strainGoal", "a0", "Z", "Lcom/whoop/domain/model/User;", UserState.Sources.USER, "Lcom/whoop/domain/model/UserProfile;", "userProfile", "B", "(Lcom/whoop/domain/model/User;Lcom/whoop/domain/model/UserProfile;Lcom/whoop/data/repositories/RestingHeartRate;)Lcom/whoop/analytics/strain/model/UserProfile;", "a", "Landroid/content/Context;", "b", "Lz92/a;", "c", "Lp92/c;", "d", "Lcom/whoop/data/repositories/StartActivityRepository;", "e", "Lrd1/d;", "f", "Lcom/whoop/data/repositories/RestingHeartRate;", "g", "Lmi1/d;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lz82/e;", "i", "Lp92/i;", "j", "Lp92/d;", "k", "Lbc3/c0;", "Lze1/d;", "l", "Lze1/d;", "heartRateSubject", "m", "strainSubject", "n", "heartRateZoneSubject", "Lg83/g;", "o", "Lg83/g;", "heartRateSubjectRx2", "p", "heartRateStatsSubject", "q", "calorieSubject", "Llh3/e;", "r", "Llh3/e;", "goalReachedSubject", "s", "locationSubject", "t", "distanceSubject", "u", "paceSubject", "Ltr2/n;", "v", "Ltr2/n;", "logger", "Lp92/f;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lp92/f;", "realTimeRecordingStore", "", "x", "startTime", "Lcom/whoop/analytics/strain/model/StrainScore;", "y", "Lcom/whoop/analytics/strain/model/StrainScore;", "currentStrainScore", "z", "D", "currentRawScore", "currentCalories", "C", "goalReached", "Lcom/whoop/analytics/strain/model/UserProfile;", "profileCache", "defaultAnaUserProfile", "currentMaxHr", "hrSum", "hrCount", "", "kotlin.jvm.PlatformType", "Ljava/util/List;", "hrHistory", "skippedFirstHRPoint", "Ll83/h;", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "locationClient", "Ltp/g;", "Ltp/g;", "locationCallback", "Landroid/location/Location;", "lastLocation", "distanceTravelled", "Lor2/o0;", "Lor2/o0;", "kalmanFilter", "started", "Lcom/whoop/ui/l;", "Lcom/whoop/ui/l;", "subscriptionHandler", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@SuppressLint({"NewApi"})
public final class C29019h {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private double currentCalories;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private double strainGoal;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private boolean goalReached;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private UserProfile profileCache;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final UserProfile defaultAnaUserProfile;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private int currentMaxHr;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private int hrSum;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private int hrCount;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private List<Integer> hrHistory;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private boolean skippedFirstHRPoint;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC23462h fusedLocationClient;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private FusedLocationProviderClient locationClient;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private AbstractC34036g locationCallback;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private Location lastLocation;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private float distanceTravelled;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private C28187o0 kalmanFilter;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private boolean started;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final C10594l subscriptionHandler;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context serviceContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC40205a userInfoAccessor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C29014c gpsDataStore;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final StartActivityRepository startActivityRepository;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C31245d rtStateMachine;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final RestingHeartRate restingHr;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C25575d hapticsWrapper;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C40191e eventDispatcher;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C29020i realTimeStreamController;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC29015d notifier;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C40588d<Integer> heartRateSubject;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C40588d<Double> strainSubject;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final C40588d<Integer> heartRateZoneSubject;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final C15581g heartRateSubjectRx2;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final C40588d<C23465k> heartRateStatsSubject;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final C40588d<Integer> calorieSubject;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final C24082e goalReachedSubject;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final C24082e locationSubject;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final C24082e distanceSubject;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final C24082e paceSubject;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C29017f realTimeRecordingStore;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private long startTime;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private StrainScore currentStrainScore;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private double currentRawScore;

    /* JADX INFO: renamed from: p92.h$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lp92/h$a;", "", "Landroid/location/Location;", "location", "", "time", "<init>", "(Landroid/location/Location;J)V", "a", "(Landroid/location/Location;J)Lp92/h$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/location/Location;", "c", "()Landroid/location/Location;", "b", "J", "d", "()J", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Location location;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final long time;

        public a(Location location, long j7) {
            AbstractC22676k.m65750j(location, "location");
            this.location = location;
            this.time = j7;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ a m88247b(a aVar, Location location, long j7, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                location = aVar.location;
            }
            if ((i13 & 2) != 0) {
                j7 = aVar.time;
            }
            return aVar.m88248a(location, j7);
        }

        /* JADX INFO: renamed from: a */
        public final a m88248a(Location location, long time) {
            AbstractC22676k.m65750j(location, "location");
            return new a(location, time);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Location getLocation() {
            return this.location;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getTime() {
            return this.time;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.location, aVar.location) && this.time == aVar.time;
        }

        public int hashCode() {
            return Long.hashCode(this.time) + (this.location.hashCode() * 31);
        }

        public String toString() {
            return "RoutePoint(location=" + this.location + ", time=" + this.time + ")";
        }
    }

    /* JADX INFO: renamed from: p92.h$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f117458a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f117459b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f117460c;

        static {
            int[] iArr = new int[FitnessLevel.values().length];
            try {
                iArr[FitnessLevel.RECREATIONAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FitnessLevel.SERIOUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FitnessLevel.INACTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FitnessLevel.TACTICAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FitnessLevel.COLLEGIATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FitnessLevel.PROFESSIONAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f117458a = iArr;
            int[] iArr2 = new int[GenderBaseline.values().length];
            try {
                iArr2[GenderBaseline.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[GenderBaseline.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f117459b = iArr2;
            int[] iArr3 = new int[Gender.values().length];
            try {
                iArr3[Gender.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[Gender.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[Gender.NON_BINARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[Gender.PREFER_NOT_TO_SAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            f117460c = iArr3;
        }
    }

    /* JADX INFO: renamed from: p92.h$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.realtime.RealTimeStrainController", m100430f = "RealTimeStrainController.kt", m100431l = {326}, m100432m = "calculateStrainScore", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f117462F;

        /* JADX INFO: renamed from: w */
        Object f117463w;

        /* JADX INFO: renamed from: x */
        Object f117464x;

        /* JADX INFO: renamed from: y */
        Object f117465y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f117466z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f117466z = obj;
            this.f117462F |= Integer.MIN_VALUE;
            return C29019h.this.m88187A(null, this);
        }
    }

    /* JADX INFO: renamed from: p92.h$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.realtime.RealTimeStrainController", m100430f = "RealTimeStrainController.kt", m100431l = {335}, m100432m = "getHeartRateZone", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f117467w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f117468x;

        /* JADX INFO: renamed from: z */
        int f117470z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f117468x = obj;
            this.f117470z |= Integer.MIN_VALUE;
            return C29019h.this.m88192G(null, this);
        }
    }

    /* JADX INFO: renamed from: p92.h$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.realtime.RealTimeStrainController", m100430f = "RealTimeStrainController.kt", m100431l = {306}, m100432m = "getProfile", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f117471w;

        /* JADX INFO: renamed from: y */
        int f117473y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f117471w = obj;
            this.f117473y |= Integer.MIN_VALUE;
            return C29019h.this.m88193I(this);
        }
    }

    /* JADX INFO: renamed from: p92.h$f */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"p92/h$f", "Ltp/g;", "Lcom/google/android/gms/location/LocationResult;", "p0", "Ll83/a0;", "onLocationResult", "(Lcom/google/android/gms/location/LocationResult;)V", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC34036g {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C24082e f117474a;

        public f(C24082e c24082e) {
            this.f117474a = c24082e;
        }

        @Override // p503tp.AbstractC34036g
        public void onLocationResult(LocationResult p13) {
            AbstractC22676k.m65750j(p13, "p0");
            this.f117474a.onNext(p13.m15632b());
        }
    }

    /* JADX INFO: renamed from: p92.h$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.realtime.RealTimeStrainController$onHRUpdate$1", m100430f = "RealTimeStrainController.kt", m100431l = {241, AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f117475w;

        /* JADX INFO: renamed from: x */
        int f117476x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C32562a f117478z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C32562a c32562a, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f117478z = c32562a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C29019h.this.new g(this.f117478z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Exception {
            C40588d c40588d;
            C40588d c40588d2;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f117476x;
            if (i13 != 0) {
                if (i13 == 1) {
                    c40588d = (C40588d) this.f117475w;
                    AbstractC34132o.m107864I(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c40588d2 = (C40588d) this.f117475w;
                    AbstractC34132o.m107864I(obj);
                }
                c40588d2.onNext(new Integer((int) (((Number) obj).doubleValue() * ((double) 100))));
                return C23454a0.f92919a;
            }
            AbstractC34132o.m107864I(obj);
            C29019h.this.hrCount++;
            C29019h.this.heartRateSubject.onNext(new Integer(this.f117478z.getHeartRate()));
            C29019h.this.heartRateSubjectRx2.onNext(new Integer(this.f117478z.getHeartRate()));
            c40588d = C29019h.this.strainSubject;
            C29019h c29019h = C29019h.this;
            C32562a c32562a = this.f117478z;
            this.f117475w = c40588d;
            this.f117476x = 1;
            obj = c29019h.m88187A(c32562a, this);
            if (obj != enumC31071a) {
            }
            return enumC31071a;
            c40588d.onNext(obj);
            C29019h.this.heartRateStatsSubject.onNext(C29019h.this.m88191F(this.f117478z.getHeartRate()));
            C29019h.this.calorieSubject.onNext(new Integer((int) C29019h.this.currentCalories));
            if (C29019h.this.strainGoal > 0.0d && !C29019h.this.goalReached && AbstractC15887f.m44809j(C29019h.this.currentRawScore) > C29019h.this.strainGoal) {
                C29019h.this.m88198Y();
            }
            C40588d c40588d3 = C29019h.this.heartRateZoneSubject;
            C29019h c29019h2 = C29019h.this;
            C32562a c32562a2 = this.f117478z;
            this.f117475w = c40588d3;
            this.f117476x = 2;
            Object objM88192G = c29019h2.m88192G(c32562a2, this);
            if (objM88192G != enumC31071a) {
                c40588d2 = c40588d3;
                obj = objM88192G;
                c40588d2.onNext(new Integer((int) (((Number) obj).doubleValue() * ((double) 100))));
                return C23454a0.f92919a;
            }
            return enumC31071a;
        }
    }

    /* JADX INFO: renamed from: p92.h$h */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.realtime.RealTimeStrainController$sendHapticAlertOnGoalReached$1", m100430f = "RealTimeStrainController.kt", m100431l = {367}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f117479w;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C29019h.this.new h(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f117479w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C25575d c25575d = C29019h.this.hapticsWrapper;
                this.f117479w = 1;
                obj = c25575d.m75196f(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            C29019h.this.eventDispatcher.m129023Z(Boolean.valueOf(((Boolean) obj).booleanValue()));
            return C23454a0.f92919a;
        }
    }

    public C29019h(Context serviceContext, InterfaceC40205a userInfoAccessor, C29014c gpsDataStore, StartActivityRepository startActivityRepository, C31245d rtStateMachine, RestingHeartRate restingHr, C25575d hapticsWrapper, C40191e eventDispatcher, C29020i realTimeStreamController, InterfaceC29015d notifier, InterfaceC2994c0 coroutineScope, Function1 fusedClientProvider) {
        AbstractC22676k.m65750j(serviceContext, "serviceContext");
        AbstractC22676k.m65750j(userInfoAccessor, "userInfoAccessor");
        AbstractC22676k.m65750j(gpsDataStore, "gpsDataStore");
        AbstractC22676k.m65750j(startActivityRepository, "startActivityRepository");
        AbstractC22676k.m65750j(rtStateMachine, "rtStateMachine");
        AbstractC22676k.m65750j(restingHr, "restingHr");
        AbstractC22676k.m65750j(hapticsWrapper, "hapticsWrapper");
        AbstractC22676k.m65750j(eventDispatcher, "eventDispatcher");
        AbstractC22676k.m65750j(realTimeStreamController, "realTimeStreamController");
        AbstractC22676k.m65750j(notifier, "notifier");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(fusedClientProvider, "fusedClientProvider");
        this.serviceContext = serviceContext;
        this.userInfoAccessor = userInfoAccessor;
        this.gpsDataStore = gpsDataStore;
        this.startActivityRepository = startActivityRepository;
        this.rtStateMachine = rtStateMachine;
        this.restingHr = restingHr;
        this.hapticsWrapper = hapticsWrapper;
        this.eventDispatcher = eventDispatcher;
        this.realTimeStreamController = realTimeStreamController;
        this.notifier = notifier;
        this.coroutineScope = coroutineScope;
        C40588d<Integer> c40588dM131622Y = C40588d.m131622Y();
        AbstractC22676k.m65749i(c40588dM131622Y, "createSingle(...)");
        this.heartRateSubject = c40588dM131622Y;
        C40588d<Double> c40588dM131622Y2 = C40588d.m131622Y();
        AbstractC22676k.m65749i(c40588dM131622Y2, "createSingle(...)");
        this.strainSubject = c40588dM131622Y2;
        C40588d<Integer> c40588dM131622Y3 = C40588d.m131622Y();
        AbstractC22676k.m65749i(c40588dM131622Y3, "createSingle(...)");
        this.heartRateZoneSubject = c40588dM131622Y3;
        this.heartRateSubjectRx2 = C15581g.m43877e();
        C40588d<C23465k> c40588dM131622Y4 = C40588d.m131622Y();
        AbstractC22676k.m65749i(c40588dM131622Y4, "createSingle(...)");
        this.heartRateStatsSubject = c40588dM131622Y4;
        C40588d<Integer> c40588dM131622Y5 = C40588d.m131622Y();
        AbstractC22676k.m65749i(c40588dM131622Y5, "createSingle(...)");
        this.calorieSubject = c40588dM131622Y5;
        this.goalReachedSubject = C24082e.m71000Y();
        this.locationSubject = C24082e.m71000Y();
        this.distanceSubject = C24082e.m71000Y();
        this.paceSubject = C24082e.m71000Y();
        this.logger = InterfaceC34116n.INSTANCE.m107848a("RealTimeStrainController");
        C29017f c29017f = new C29017f(serviceContext);
        this.realTimeRecordingStore = c29017f;
        this.startTime = c29017f.m88178b() != null ? c29017f.m88178b().m88170c() : System.currentTimeMillis();
        StrainScore strainScoreWithState = ModelUtilities.DefaultStrainScore.withState(ModelUtilities.DefaultAnalyticsState);
        AbstractC22676k.m65749i(strainScoreWithState, "withState(...)");
        this.currentStrainScore = strainScoreWithState;
        UserProfile userProfileBuild = UserProfile.builder().setId(0).setBirthday(OffsetDateTime.now().minusYears(35L).toInstant().toEpochMilli()).setBiologicalSex(BiologicalSex.nonBinaryNew).setFitnessLevel(com.whoop.analytics.strain.model.FitnessLevel.inactive).setHeight(1.71d).setWeight(73.0d).setRestingHeartRate(restingHr.getValue()).setMaxHeartRate(184.0d).build();
        AbstractC22676k.m65749i(userProfileBuild, "build(...)");
        this.defaultAnaUserProfile = userProfileBuild;
        this.hrHistory = Collections.synchronizedList(new ArrayList());
        this.fusedLocationClient = AbstractC30060g.m92088H(new C28448b(15, fusedClientProvider, this));
        this.locationClient = m88190D();
        this.kalmanFilter = new C28187o0();
        this.subscriptionHandler = new C10594l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: A */
    public final Object m88187A(C32562a c32562a, InterfaceC30057d<? super Double> interfaceC30057d) throws Exception {
        c cVar;
        List listM118958J;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f117462F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f117462F = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM88193I = cVar.f117466z;
        Object obj = EnumC31071a.f128113w;
        int i14 = cVar.f117462F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM88193I);
            HeartRateTimestamp.Builder builder = HeartRateTimestamp.builder();
            builder.setTime(c32562a.getTimeStamp().m41583j());
            builder.setHeartRate(c32562a.getHeartRate());
            listM118958J = AbstractC37056f.m118958J(builder.build());
            cVar.f117463w = null;
            cVar.f117464x = null;
            cVar.f117465y = listM118958J;
            cVar.f117462F = 1;
            objM88193I = m88193I(cVar);
            if (objM88193I == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            listM118958J = (List) cVar.f117465y;
            AbstractC34132o.m107864I(objM88193I);
        }
        StrainScore strainScoreM44810k = AbstractC15887f.m44810k((UserProfile) objM88193I, listM118958J, this.currentStrainScore.getState().get());
        AbstractC22676k.m65747g(strainScoreM44810k);
        this.currentStrainScore = strainScoreM44810k;
        double d3 = this.currentRawScore;
        Double d14 = strainScoreM44810k.getStrainScore().get();
        AbstractC22676k.m65749i(d14, "get(...)");
        this.currentRawScore = d14.doubleValue() + d3;
        double d15 = this.currentCalories;
        Double d16 = strainScoreM44810k.getKilojoules().get();
        AbstractC22676k.m65749i(d16, "get(...)");
        double dM44787e = AbstractC15883b.m44787e(d16.doubleValue()) + d15;
        this.currentCalories = dM44787e;
        this.realTimeRecordingStore.m88185j(dM44787e);
        return new Double(AbstractC15887f.m44809j(this.currentRawScore));
    }

    /* JADX INFO: renamed from: B */
    private final UserProfile m88188B(User user, com.whoop.domain.model.UserProfile userProfile, RestingHeartRate restingHr) {
        com.whoop.analytics.strain.model.FitnessLevel fitnessLevel;
        BiologicalSex biologicalSex;
        UserProfile.Builder builder = UserProfile.builder();
        builder.setId(user.getId());
        builder.setBirthday(userProfile.getBirthday().toDateTimeAtStartOfDay().getMillis());
        switch (b.f117458a[userProfile.getFitnessLevel().ordinal()]) {
            case 1:
                fitnessLevel = com.whoop.analytics.strain.model.FitnessLevel.recreational_enthusiast;
                break;
            case 2:
                fitnessLevel = com.whoop.analytics.strain.model.FitnessLevel.recreational_enthusiast;
                break;
            case 3:
                fitnessLevel = com.whoop.analytics.strain.model.FitnessLevel.inactive;
                break;
            case 4:
                fitnessLevel = com.whoop.analytics.strain.model.FitnessLevel.tactical;
                break;
            case 5:
                fitnessLevel = com.whoop.analytics.strain.model.FitnessLevel.collegiate;
                break;
            case 6:
                fitnessLevel = com.whoop.analytics.strain.model.FitnessLevel.professional;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        builder.setFitnessLevel(fitnessLevel);
        int i13 = b.f117460c[userProfile.getGender().ordinal()];
        if (i13 == 1) {
            biologicalSex = BiologicalSex.maleNew;
        } else if (i13 == 2) {
            biologicalSex = BiologicalSex.femaleNew;
        } else {
            if (i13 != 3 && i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            GenderBaseline.Companion companion = GenderBaseline.INSTANCE;
            String physiologicalBaseline = userProfile.getPhysiologicalBaseline();
            if (physiologicalBaseline == null) {
                physiologicalBaseline = GenderBaseline.AVERAGE_OF_BOTH.getValue();
            }
            int i14 = b.f117459b[companion.fromName(physiologicalBaseline).ordinal()];
            if (i14 != 1) {
                biologicalSex = i14 != 2 ? BiologicalSex.nonBinaryNew : BiologicalSex.femaleNew;
            } else {
                biologicalSex = BiologicalSex.maleNew;
            }
        }
        builder.setBiologicalSex(biologicalSex);
        builder.setMaxHeartRate(user.getMaxHeartRate());
        builder.setRestingHeartRate(restingHr.getValue());
        builder.setHeight(user.getHeightMeters());
        builder.setWeight(user.getWeightKg());
        UserProfile userProfileBuild = builder.build();
        AbstractC22676k.m65749i(userProfileBuild, "build(...)");
        return userProfileBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final FusedLocationProviderClient m88189C(Function1 function1, C29019h c29019h) {
        return (FusedLocationProviderClient) function1.invoke(c29019h.serviceContext);
    }

    /* JADX INFO: renamed from: D */
    private final FusedLocationProviderClient m88190D() {
        return (FusedLocationProviderClient) this.fusedLocationClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public final C23465k m88191F(int hr3) {
        if (this.skippedFirstHRPoint) {
            this.currentMaxHr = Math.max(this.currentMaxHr, hr3);
            this.hrHistory.add(Integer.valueOf(hr3));
            this.hrSum += hr3;
        } else {
            this.skippedFirstHRPoint = true;
        }
        return new C23465k(Integer.valueOf(this.currentMaxHr), Integer.valueOf(this.hrSum / this.hrCount));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: G */
    public final Object m88192G(C32562a c32562a, InterfaceC30057d<? super Double> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f117470z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f117470z = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object objM88193I = dVar.f117468x;
        Object obj = EnumC31071a.f128113w;
        int i14 = dVar.f117470z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM88193I);
            dVar.f117467w = c32562a;
            dVar.f117470z = 1;
            objM88193I = m88193I(dVar);
            if (objM88193I == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c32562a = (C32562a) dVar.f117467w;
            AbstractC34132o.m107864I(objM88193I);
        }
        return new Double(AbstractC12889b.m36282l(((double) c32562a.getHeartRate()) / (((UserProfile) objM88193I).getMaxHeartRate() + ((double) 3)), 0.0d, 1.0d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: I */
    public final Object m88193I(InterfaceC30057d<? super UserProfile> interfaceC30057d) {
        e eVar;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f117473y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f117473y = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object objM36575A = eVar.f117471w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar.f117473y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM36575A);
            UserProfile userProfile = this.profileCache;
            if (userProfile != null) {
                return userProfile;
            }
            InterfaceC13058l user = this.userInfoAccessor.getUser();
            eVar.f117473y = 1;
            objM36575A = AbstractC13091v.m36575A(user, eVar);
            if (objM36575A == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM36575A);
        }
        User user2 = (User) objM36575A;
        com.whoop.domain.model.UserProfile profile = user2 != null ? user2.getProfile() : null;
        if (user2 == null || profile == null) {
            return this.defaultAnaUserProfile;
        }
        UserProfile userProfileM88188B = m88188B(user2, profile, this.restingHr);
        this.profileCache = userProfileM88188B;
        return userProfileM88188B;
    }

    /* JADX INFO: renamed from: N */
    private final C38280g<C32562a> m88194N() {
        C38280g<C32562a> c38280gM96241P = this.rtStateMachine.m96241P();
        AbstractC22676k.m65749i(c38280gM96241P, "observeHeartData(...)");
        return c38280gM96241P;
    }

    /* JADX INFO: renamed from: T */
    private final C38280g<Location> m88195T() {
        C24082e c24082eM71000Y = C24082e.m71000Y();
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.m15630k(100);
        locationRequest.m15629i(HMSConstantsKt.TIMEOUT_FOR_LOW_SPEED_INDICATOR_MILLIS);
        locationRequest.m15628h(2000L);
        f fVar = new f(c24082eM71000Y);
        this.locationCallback = fVar;
        this.locationClient.requestLocationUpdates(locationRequest, fVar, Looper.myLooper());
        return c24082eM71000Y;
    }

    /* JADX INFO: renamed from: W */
    private final void m88196W(C32562a hrResult) {
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new g(hrResult, null), 3);
    }

    /* JADX INFO: renamed from: X */
    private final void m88197X(Location newLocation) {
        a aVar = new a(newLocation, System.currentTimeMillis());
        this.gpsDataStore.m88167k(aVar);
        a aVarM85309a = this.kalmanFilter.m85309a(aVar);
        this.locationSubject.onNext(aVarM85309a);
        Location location = aVarM85309a.getLocation();
        Location location2 = this.lastLocation;
        if (location2 == null) {
            this.lastLocation = new Location(location);
            return;
        }
        float fDistanceTo = location2.distanceTo(location);
        if (fDistanceTo > 1.0f) {
            this.distanceTravelled += fDistanceTo;
            this.lastLocation = new Location(location);
            this.distanceSubject.onNext(Float.valueOf(this.distanceTravelled));
            float fCurrentTimeMillis = System.currentTimeMillis() - this.startTime > 0 ? this.distanceTravelled / ((System.currentTimeMillis() - this.startTime) / 1000) : 0.0f;
            if (fCurrentTimeMillis > 0.0f) {
                this.paceSubject.onNext(Float.valueOf(fCurrentTimeMillis));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public final void m88198Y() {
        this.goalReached = true;
        this.goalReachedSubject.onNext(Boolean.TRUE);
        m88201a0(this.strainGoal);
        m88199Z();
    }

    /* JADX INFO: renamed from: Z */
    private final void m88199Z() {
        InterfaceC2994c0 interfaceC2994c0 = this.coroutineScope;
        C22365e c22365e = AbstractC3050q0.f12077a;
        AbstractC3006f0.m8732z(interfaceC2994c0, ExecutorC22364d.f87316w, null, new h(null), 2);
    }

    /* JADX INFO: renamed from: a0 */
    private final void m88201a0(double strainGoal) {
        this.notifier.mo83778a(strainGoal, this.serviceContext, this.realTimeStreamController);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m88205d0(C29019h c29019h, C32562a c32562a) {
        if (c32562a != null) {
            c29019h.m88196W(c32562a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final void m88207e0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C23454a0 m88209f0(C29019h c29019h, Location location) {
        AbstractC22676k.m65747g(location);
        c29019h.m88197X(location);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final FusedLocationProviderClient m88210g(Context ctx) {
        AbstractC22676k.m65750j(ctx, "ctx");
        C4975f c4975f = AbstractC34037h.f142695a;
        return new FusedLocationProviderClient(ctx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final void m88211g0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: E */
    public final List<Integer> m88231E() {
        ArrayList arrayList;
        List<Integer> hrHistory = this.hrHistory;
        AbstractC22676k.m65749i(hrHistory, "hrHistory");
        synchronized (hrHistory) {
            arrayList = new ArrayList();
            List<Integer> hrHistory2 = this.hrHistory;
            AbstractC22676k.m65749i(hrHistory2, "hrHistory");
            arrayList.addAll(hrHistory2);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: H */
    public final AbstractC1615p0 m88232H() {
        return this.gpsDataStore.m88165f(this.startTime, System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: J */
    public final boolean m88233J() {
        return this.strainGoal != 0.0d && AbstractC15887f.m44809j(this.currentRawScore) >= this.strainGoal;
    }

    /* JADX INFO: renamed from: K */
    public final C38280g<Integer> m88234K() {
        return this.calorieSubject;
    }

    /* JADX INFO: renamed from: L */
    public final C38280g<Float> m88235L() {
        return this.distanceSubject;
    }

    /* JADX INFO: renamed from: M */
    public final C38280g<Boolean> m88236M() {
        return this.goalReachedSubject;
    }

    /* JADX INFO: renamed from: O */
    public final C38280g<Integer> m88237O() {
        return this.heartRateSubject;
    }

    /* JADX INFO: renamed from: P */
    public final AbstractC23412c m88238P() {
        C15581g c15581g = this.heartRateSubjectRx2;
        c15581g.getClass();
        return new C36928n(c15581g);
    }

    /* JADX INFO: renamed from: Q */
    public final C38280g<Integer> m88239Q() {
        return this.heartRateZoneSubject;
    }

    /* JADX INFO: renamed from: R */
    public final C38280g<C23465k> m88240R() {
        return this.heartRateStatsSubject;
    }

    /* JADX INFO: renamed from: S */
    public final C38280g<a> m88241S() {
        return this.locationSubject;
    }

    /* JADX INFO: renamed from: U */
    public final C38280g<Float> m88242U() {
        return this.paceSubject;
    }

    /* JADX INFO: renamed from: V */
    public final C38280g<Double> m88243V() {
        return this.strainSubject;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m88244b0(double goal) {
        this.strainGoal = goal;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m88245c0() {
        if (this.started) {
            this.logger.mo85216g("STRAINCOACH RealTimeStrainController start called but was already started", new AbstractC30556a.a[0]);
            return;
        }
        this.logger.mo85216g("STRAINCOACH RealTimeStrainController start - subscribing to heartdata and location", new AbstractC30556a.a[0]);
        final int i13 = 0;
        this.subscriptionHandler.m27330a(m88194N().m122652B(C22488a.m64989a().f88182b).m122661K(new C27566m0(new Function1(this) { // from class: p92.g

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C29019h f117411x;

            {
                this.f117411x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        return C29019h.m88205d0(this.f117411x, (C32562a) obj);
                    default:
                        return C29019h.m88209f0(this.f117411x, (Location) obj);
                }
            }
        }, 8)));
        if (this.startActivityRepository.getTrackRoute()) {
            final int i14 = 1;
            this.subscriptionHandler.m27330a(m88195T().m122652B(C22488a.m64989a().f88182b).m122661K(new C27566m0(new Function1(this) { // from class: p92.g

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ C29019h f117411x;

                {
                    this.f117411x = this;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i14) {
                        case 0:
                            return C29019h.m88205d0(this.f117411x, (C32562a) obj);
                        default:
                            return C29019h.m88209f0(this.f117411x, (Location) obj);
                    }
                }
            }, 9)));
        }
        this.startTime = this.realTimeRecordingStore.m88178b() != null ? this.realTimeRecordingStore.m88178b().m88170c() : System.currentTimeMillis();
        this.started = true;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m88246h0() {
        if (!this.started) {
            this.logger.mo85216g("STRAINCOACH RealTimeStrainController stop called but was already stopped", new AbstractC30556a.a[0]);
            return;
        }
        this.logger.mo85216g("STRAINCOACH RealTimeStrainController stop -- unsubscribing heartdata and location", new AbstractC30556a.a[0]);
        this.subscriptionHandler.m27331b();
        this.started = false;
        this.realTimeRecordingStore.m88184i();
        AbstractC34036g abstractC34036g = this.locationCallback;
        if (abstractC34036g != null) {
            this.locationClient.removeLocationUpdates(abstractC34036g);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C29019h(Context context, InterfaceC40205a interfaceC40205a, C29014c c29014c, StartActivityRepository startActivityRepository, C31245d c31245d, RestingHeartRate restingHeartRate, C25575d c25575d, C40191e c40191e, C29020i c29020i, InterfaceC29015d interfaceC29015d, InterfaceC2994c0 interfaceC2994c0, Function1 function1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        InterfaceC2994c0 interfaceC2994c0M8708b;
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            interfaceC2994c0M8708b = AbstractC3006f0.m8708b(AbstractC17182o.f65999a.mo8825s().plus(AbstractC3006f0.m8710d()));
        } else {
            interfaceC2994c0M8708b = interfaceC2994c0;
        }
        this(context, interfaceC40205a, c29014c, startActivityRepository, c31245d, restingHeartRate, c25575d, c40191e, c29020i, interfaceC29015d, interfaceC2994c0M8708b, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? new C28884h1(9) : function1);
    }
}
