package em1;

import am1.C1004a;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bm1.C3421d;
import bm1.InterfaceC3419b;
import c93.InterfaceC4351m;
import ca2.C4361a;
import ca2.EnumC4363c;
import ch.C4588i;
import cm1.C4811b;
import com.whoop.data.remote.domain.dto.PushNotificationMetricType;
import com.whoop.data.repositories.ConnectivityFeatureFlagsKt;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.LanguageRepositoryKt;
import com.whoop.data.repositories.NotificationRepository;
import com.whoop.domain.model.User;
import com.whoop.home.domain.models.AutopopMetadata;
import com.whoop.home.domain.models.HomeBffFeedResponse;
import com.whoop.home.domain.models.HomeResponseMetaData;
import com.whoop.navigation.C9598e;
import com.whoop.service.network.model.UserState;
import dc1.C11906c;
import dm1.AbstractC12177a;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13021b2;
import ec3.C13052j1;
import ec3.C13054k;
import ec3.C13060l1;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13075p1;
import fc3.C14380k;
import fm1.EnumC14603g;
import ge3.AbstractC15751g;
import gl1.C15967b;
import gm1.C15995e;
import gm1.C15996f;
import gt0.InterfaceC16183e;
import hj0.C17345d;
import il1.AbstractC18622a;
import il1.AbstractC18624b;
import il1.AbstractC18625b0;
import il1.AbstractC18626c;
import il1.AbstractC18627d;
import il1.AbstractC18630g;
import il1.AbstractC18634k;
import il1.AbstractC18636m;
import il1.AbstractC18638o;
import il1.AbstractC18643t;
import il1.AbstractC18644u;
import il1.AbstractC18645v;
import il1.AbstractC18649z;
import il1.C18628e;
import il1.C18632i;
import il1.C18639p;
import il1.C18641r;
import il1.C18646w;
import il1.C18648y;
import il1.InterfaceC18640q;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21164r;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import jl1.C21771b;
import kl1.C22563c;
import l83.C23454a0;
import l83.C23465k;
import ll1.C24503c;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import od1.AbstractC27845h;
import ol1.C28016b;
import or2.AbstractC28157e0;
import or2.C28180m;
import os0.InterfaceC28306b;
import p007a6.InterfaceC0422g;
import p031b9.AbstractC2875y;
import p138f6.C14129a;
import p138f6.C14132d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pl1.C29349a;
import pl1.C29350b;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rg1.C31388d;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sl1.AbstractC32703b;
import sl1.C32702a;
import sl1.C32705d;
import tl1.C33919c;
import tr2.InterfaceC34116n;
import u92.C34659c;
import ul1.C35064a;
import ul1.EnumC35066c;
import vh2.InterfaceC36049d;
import vl1.C36104b;
import wl1.AbstractC37355a;
import wl1.C37357c;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import z92.InterfaceC40205a;

/* JADX INFO: renamed from: em1.u */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000î\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u008f\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00107\u001a\u000206\u0012\f\u0010:\u001a\b\u0012\u0004\u0012\u00020908\u0012\u0006\u0010<\u001a\u00020;\u0012\b\b\u0002\u0010>\u001a\u00020=\u0012\u0006\u0010@\u001a\u00020?\u0012\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ\u0018\u0010H\u001a\u00020G2\u0006\u0010F\u001a\u00020EH\u0081@¢\u0006\u0004\bH\u0010IJ\u0015\u0010M\u001a\u00020L2\u0006\u0010K\u001a\u00020J¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020L2\b\u0010P\u001a\u0004\u0018\u00010O¢\u0006\u0004\bQ\u0010RJ\r\u0010S\u001a\u00020L¢\u0006\u0004\bS\u0010TJ\u0018\u0010W\u001a\u00020V2\u0006\u0010F\u001a\u00020UH\u0082@¢\u0006\u0004\bW\u0010XJ\u0017\u0010[\u001a\u00020Z2\u0006\u0010F\u001a\u00020YH\u0002¢\u0006\u0004\b[\u0010\\J\u0017\u0010_\u001a\u00020^2\u0006\u0010F\u001a\u00020]H\u0002¢\u0006\u0004\b_\u0010`J\u0017\u0010c\u001a\u00020b2\u0006\u0010F\u001a\u00020aH\u0002¢\u0006\u0004\bc\u0010dJ\u0017\u0010g\u001a\u00020f2\u0006\u0010F\u001a\u00020eH\u0002¢\u0006\u0004\bg\u0010hJ\u0017\u0010k\u001a\u00020j2\u0006\u0010F\u001a\u00020iH\u0002¢\u0006\u0004\bk\u0010lJ\u0017\u0010o\u001a\u00020n2\u0006\u0010F\u001a\u00020mH\u0002¢\u0006\u0004\bo\u0010pJ\u0017\u0010s\u001a\u00020r2\u0006\u0010F\u001a\u00020qH\u0002¢\u0006\u0004\bs\u0010tJ\u0017\u0010w\u001a\u00020v2\u0006\u0010F\u001a\u00020uH\u0002¢\u0006\u0004\bw\u0010xJ\u0017\u0010{\u001a\u00020z2\u0006\u0010F\u001a\u00020yH\u0002¢\u0006\u0004\b{\u0010|J\u0019\u0010~\u001a\u0004\u0018\u00010}2\u0006\u0010F\u001a\u00020UH\u0002¢\u0006\u0004\b~\u0010\u007fJ\u001b\u0010\u0081\u0001\u001a\u00020}2\u0007\u0010F\u001a\u00030\u0080\u0001H\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001c\u0010\u0085\u0001\u001a\u00030\u0084\u00012\u0007\u0010F\u001a\u00030\u0083\u0001H\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001c\u0010\u0089\u0001\u001a\u00030\u0088\u00012\u0007\u0010F\u001a\u00030\u0087\u0001H\u0002¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u001c\u0010\u008d\u0001\u001a\u00030\u008c\u00012\u0007\u0010F\u001a\u00030\u008b\u0001H\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u0013\u0010\u008f\u0001\u001a\u00020LH\u0082@¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001c\u0010\u0092\u0001\u001a\u00020L2\u0007\u0010K\u001a\u00030\u0091\u0001H\u0082@¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u001b\u0010\u0095\u0001\u001a\u00020L2\u0007\u0010K\u001a\u00030\u0094\u0001H\u0002¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u001c\u0010\u0099\u0001\u001a\u00020L2\b\u0010\u0098\u0001\u001a\u00030\u0097\u0001H\u0002¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u0019\u0010\u009b\u0001\u001a\u00020L2\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0005\b\u009b\u0001\u0010NJ\u001c\u0010\u009e\u0001\u001a\u00020L2\b\u0010\u009d\u0001\u001a\u00030\u009c\u0001H\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u001c\u0010¢\u0001\u001a\u00020L2\b\u0010¡\u0001\u001a\u00030 \u0001H\u0002¢\u0006\u0006\b¢\u0001\u0010£\u0001R\u0016\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0016\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u0016\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0016\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u0016\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u0016\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u0016\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u001b\u00103\u001a\u0002028\u0006¢\u0006\u0010\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001R\u0016\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u0016\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u001c\u0010:\u001a\b\u0012\u0004\u0012\u000209088\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u0016\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u0016\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u0016\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u0018\u0010Å\u0001\u001a\u00030Â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R\u001e\u0010É\u0001\u001a\t\u0012\u0004\u0012\u00020m0Æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001R\u001f\u0010Í\u0001\u001a\n\u0012\u0005\u0012\u00030 \u00010Ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R\u001e\u0010Ï\u0001\u001a\t\u0012\u0004\u0012\u00020E0Æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010È\u0001R\u001e\u0010Ñ\u0001\u001a\t\u0012\u0004\u0012\u00020a0Æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÐ\u0001\u0010È\u0001R\u001e\u0010Ó\u0001\u001a\t\u0012\u0004\u0012\u00020e0Æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÒ\u0001\u0010È\u0001R\u001e\u0010Õ\u0001\u001a\t\u0012\u0004\u0012\u00020i0Æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0001\u0010È\u0001R\u001e\u0010×\u0001\u001a\t\u0012\u0004\u0012\u00020q0Æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÖ\u0001\u0010È\u0001R\u001e\u0010Ù\u0001\u001a\t\u0012\u0004\u0012\u00020u0Æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0001\u0010È\u0001R\u001f\u0010Ü\u0001\u001a\n\u0012\u0005\u0012\u00030Ú\u00010Æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÛ\u0001\u0010È\u0001R\u001f\u0010Þ\u0001\u001a\n\u0012\u0005\u0012\u00030Ú\u00010Æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÝ\u0001\u0010È\u0001R\u001e\u0010à\u0001\u001a\t\u0012\u0004\u0012\u00020y0Æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bß\u0001\u0010È\u0001R\u001f\u0010â\u0001\u001a\n\u0012\u0005\u0012\u00030\u0080\u00010Æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bá\u0001\u0010È\u0001R\u001f\u0010ä\u0001\u001a\n\u0012\u0005\u0012\u00030\u0083\u00010Æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bã\u0001\u0010È\u0001R\u001f\u0010æ\u0001\u001a\n\u0012\u0005\u0012\u00030\u0087\u00010Æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bå\u0001\u0010È\u0001R\u001f\u0010è\u0001\u001a\n\u0012\u0005\u0012\u00030\u008b\u00010Æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bç\u0001\u0010È\u0001R\u001f\u0010í\u0001\u001a\n\u0012\u0005\u0012\u00030ê\u00010é\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bë\u0001\u0010ì\u0001R\u001f\u0010ð\u0001\u001a\n\u0012\u0005\u0012\u00030î\u00010Ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bï\u0001\u0010Ì\u0001R\u001e\u0010ñ\u0001\u001a\t\u0012\u0004\u0012\u00020U0Æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010È\u0001R\u001e\u0010ó\u0001\u001a\t\u0012\u0004\u0012\u00020U0Ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bò\u0001\u0010Ì\u0001R\u001e\u0010õ\u0001\u001a\n\u0012\u0005\u0012\u00030ô\u00010Ê\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b~\u0010Ì\u0001R\u001e\u0010ö\u0001\u001a\t\u0012\u0004\u0012\u00020Y0Æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010È\u0001R\u001e\u0010÷\u0001\u001a\t\u0012\u0004\u0012\u00020]0Æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010È\u0001R\u001f\u0010ù\u0001\u001a\n\u0012\u0005\u0012\u00030ø\u00010Ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010Ì\u0001R\u001f\u0010û\u0001\u001a\n\u0012\u0005\u0012\u00030ú\u00010Ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010Ì\u0001R\u001f\u0010ý\u0001\u001a\n\u0012\u0005\u0012\u00030ü\u00010Ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010Ì\u0001R\u001e\u0010ÿ\u0001\u001a\n\u0012\u0005\u0012\u00030þ\u00010Ê\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bQ\u0010Ì\u0001R\u001e\u0010\u0081\u0002\u001a\n\u0012\u0005\u0012\u00030\u0080\u00020Ê\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bM\u0010Ì\u0001R\u001f\u0010\u0084\u0002\u001a\n\u0012\u0005\u0012\u00030\u0082\u00020Ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0002\u0010Ì\u0001R\u001f\u0010\u0086\u0002\u001a\n\u0012\u0005\u0012\u00030\u0085\u00020Ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010Ì\u0001R\u001f\u0010\u0088\u0002\u001a\n\u0012\u0005\u0012\u00030\u0087\u00020Ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010Ì\u0001R\u001e\u0010\u0089\u0002\u001a\t\u0012\u0004\u0012\u00020}0Ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010Ì\u0001R\u001e\u0010\u008b\u0002\u001a\n\u0012\u0005\u0012\u00030\u008a\u00020Ê\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bS\u0010Ì\u0001R\u001f\u0010\u008c\u0002\u001a\n\u0012\u0005\u0012\u00030\u0084\u00010Ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010Ì\u0001R\u001e\u0010\u008e\u0002\u001a\n\u0012\u0005\u0012\u00030\u008d\u00020Ê\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b[\u0010Ì\u0001R\u001f\u0010\u0090\u0002\u001a\n\u0012\u0005\u0012\u00030\u008f\u00020Ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010Ì\u0001R\u001e\u0010\u0092\u0002\u001a\n\u0012\u0005\u0012\u00030\u0091\u00020Ê\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bw\u0010Ì\u0001R\u001e\u0010\u0093\u0002\u001a\n\u0012\u0005\u0012\u00030\u009c\u00010Ê\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bH\u0010Ì\u0001R\u001e\u0010\u0094\u0002\u001a\n\u0012\u0005\u0012\u00030Ú\u00010Ê\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bk\u0010Ì\u0001R\u001e\u0010\u0095\u0002\u001a\n\u0012\u0005\u0012\u00030Ú\u00010Ê\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bg\u0010Ì\u0001R1\u0010\u0098\u0002\u001a\u001d\u0012\u0018\u0012\u0016\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020O0\u0097\u0002\u0012\u0004\u0012\u00020O0\u0096\u00020Ê\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bs\u0010Ì\u0001R\u001e\u0010\u0099\u0002\u001a\n\u0012\u0005\u0012\u00030\u0097\u00010Ê\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bW\u0010Ì\u0001R$\u0010\u009d\u0002\u001a\n\u0012\u0005\u0012\u00030\u009a\u00020Ê\u00018\u0006¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010Ì\u0001\u001a\u0006\b\u009b\u0002\u0010\u009c\u0002R#\u0010\u009f\u0002\u001a\n\u0012\u0005\u0012\u00030\u009e\u00020Ê\u00018\u0006¢\u0006\u000f\n\u0005\bc\u0010Ì\u0001\u001a\u0006\bò\u0001\u0010\u009c\u0002¨\u0006 \u0002"}, m65681d2 = {"Lem1/u;", "Landroidx/lifecycle/w1;", "Lgm1/f;", "viewStateReducer", "Lil1/r;", "homeInteractor", "Lkl1/c;", "calendarInteractor", "Lil1/p;", "homeDomainCombiner", "Lsl1/d;", "strapDomainInteractor", "Lul1/a;", "dialogStateCombiner", "Lol1/b;", "processNowInteractor", "Lam1/a;", "homeOnboardingInteractor", "Lil1/i;", "dismissConfigInteractor", "Lil1/e;", "dismissAlertInteractor", "Lvl1/b;", "hideRecoveryInteractor", "Ltl1/c;", "dayOneTransitionInteractor", "Lcm1/b;", "weeklyPlanHomeTileInteractor", "Lbm1/d;", "streaksHomeInteractor", "Ljl1/b;", "autoPopInteractor", "Lwl1/c;", "inAppReviewInteractor", "Lpl1/b;", "connectivityIndicatorInteractor", "Lvh2/d;", "strapUnlockService", "Lrg1/d;", "fwApiInteractor", "Lil1/w;", "homeToolbarInteractor", "Lll1/c;", "pushNotificationPermissionsInteractor", "Lu92/c;", "ltoDismissStore", "Lz92/a;", "userInfoAccessor", "Lgt0/e;", "fwUpdateApi", "Lgl1/b;", "homeAnalyticsHelper", "Lcom/whoop/data/repositories/NotificationRepository;", "notificationRepository", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "La6/g;", "Lf6/f;", "prefsDataStore", "Lj02/r;", "deviceHomeDestinationSource", "Lbc3/c0;", "coroutineScope", "Lgm1/e;", "navigationReducer", "Lhj0/d;", "applicationLifecycle", "<init>", "(Lgm1/f;Lil1/r;Lkl1/c;Lil1/p;Lsl1/d;Lul1/a;Lol1/b;Lam1/a;Lil1/i;Lil1/e;Lvl1/b;Ltl1/c;Lcm1/b;Lbm1/d;Ljl1/b;Lwl1/c;Lpl1/b;Lvh2/d;Lrg1/d;Lil1/w;Lll1/c;Lu92/c;Lz92/a;Lgt0/e;Lgl1/b;Lcom/whoop/data/repositories/NotificationRepository;Lcom/whoop/data/repositories/FeatureFlagChecker;La6/g;Lj02/r;Lbc3/c0;Lgm1/e;Lhj0/d;)V", "Lem1/k;", "viewEvent", "Lil1/o;", "z0", "(Lem1/k;Lq83/d;)Ljava/lang/Object;", "Lem1/t;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "p0", "(Lem1/t;)V", "", "sourceId", "o0", "(Ljava/lang/String;)V", "u0", "()V", "Lem1/n;", "Lil1/u;", "D0", "(Lem1/n;Lq83/d;)Ljava/lang/Object;", "Lem1/i;", "Lil1/m;", "w0", "(Lem1/i;)Lil1/m;", "Lem1/q;", "Lil1/z;", "G0", "(Lem1/q;)Lil1/z;", "Lem1/p;", "Lil1/t;", "F0", "(Lem1/p;)Lil1/t;", "Lem1/e;", "Lil1/g;", "B0", "(Lem1/e;)Lil1/g;", "Lem1/d;", "Lil1/d;", "A0", "(Lem1/d;)Lil1/d;", "Lem1/j;", "Los0/b;", "H0", "(Lem1/j;)Los0/b;", "Lem1/h;", "Lil1/k;", "C0", "(Lem1/h;)Lil1/k;", "Lem1/c;", "Lil1/c;", "y0", "(Lem1/c;)Lil1/c;", "Lem1/b0;", "Lil1/b0;", "I0", "(Lem1/b0;)Lil1/b0;", "Lbm1/b;", "i0", "(Lem1/n;)Lbm1/b;", "Lem1/z;", "r0", "(Lem1/z;)Lbm1/b;", "Lem1/a;", "Lil1/a;", "v0", "(Lem1/a;)Lil1/a;", "Lem1/w;", "Lwl1/a;", "E0", "(Lem1/w;)Lwl1/a;", "Lem1/b;", "Lil1/b;", "x0", "(Lem1/b;)Lil1/b;", "n0", "(Lq83/d;)Ljava/lang/Object;", "Lem1/g;", "l0", "(Lem1/g;Lq83/d;)Ljava/lang/Object;", "Lem1/s;", "m0", "(Lem1/s;)V", "Lil1/q;", "result", "k0", "(Lil1/q;)V", "j0", "Lsl1/a;", "indicatorResult", "s0", "(Lsl1/a;)V", "Lsl1/b;", "it", "t0", "(Lsl1/b;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lvh2/d;", "x", "Lrg1/d;", "y", "Lil1/w;", "z", "Lll1/c;", "E", "Lu92/c;", "F", "Lz92/a;", "G", "Lgt0/e;", "H", "Lgl1/b;", "g0", "()Lgl1/b;", "I", "Lcom/whoop/data/repositories/NotificationRepository;", "J", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "K", "La6/g;", "L", "Lj02/r;", "M", "Lbc3/c0;", "N", "Lhj0/d;", "Ltr2/n;", "O", "Ltr2/n;", "logger", "Lec3/o1;", "P", "Lec3/o1;", "connTileEventFlow", "Lec3/l;", "Q", "Lec3/l;", "connTileDomainResult", "R", "dialogUpdateEventFlow", "S", "onboardingEventFlow", "T", "dismissConfigEventFlow", "U", "dismissAlertEventFlow", "V", "hideRecoveryEventFlow", "W", "dayOneTransitionEventFlow", "", "X", "homeToolbarGiftIconNewIndicatorEventFlow", "Y", "requiredPermissionsCheckEventFlow", "Z", "weeklyPlanHomeTileEventFlow", "a0", "streaksHomeEventFlow", "b0", "autoPopEventFlow", "c0", "inAppReviewEventFlow", "d0", "connectivityIndicatorEventFlow", "Lec3/p1;", "Lil1/y;", "e0", "Lec3/p1;", "journalPendingStateFlow", "Lul1/b;", "f0", "dialogDomainResult", "homeEventFlow", "h0", "homeFlow", "Lil1/v;", "homeFeedDomainState", "calendarEventFlow", "processNowEventFlow", "Lol1/a;", "processNowDomainState", "Lkl1/e;", "calendarDomainState", "Lam1/b;", "homeOnboardingDomainState", "Lil1/h;", "homeDismissConfigCtaState", "Lil1/f;", "homeDismissAlertTileState", "Lvl1/a;", "q0", "hideRecoveryDomainState", "Ltl1/a;", "dayOneTransitionDomainState", "Lcm1/a;", "weeklyPlanHomeTileDomainState", "streaksDomainActionFlow", "Lbm1/c;", "streaksHomeDomainState", "autoPopDestinationsFlow", "Ljl1/a;", "autoPopDomainState", "Lwl1/b;", "inAppReviewDomainState", "Lpl1/a;", "connectivityIndicatorDomainState", "strapIndicatorDomainResult", "homeToolbarGiftIconNewIndicatorResult", "requiredPermissionsCheckResult", "Ll83/k;", "", "ltoDismissedOfferIdsAndUserId", "homeDomainResult", "Lem1/v;", "getViewState", "()Lec3/l;", "viewState", "Ldm1/a;", "navigationState", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13347u extends AbstractC1637w1 {

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    private final InterfaceC13058l homeToolbarGiftIconNewIndicatorResult;

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    private final InterfaceC13058l requiredPermissionsCheckResult;

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    private final InterfaceC13058l ltoDismissedOfferIdsAndUserId;

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    private final InterfaceC13058l homeDomainResult;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C34659c ltoDismissStore;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC40205a userInfoAccessor;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    private final InterfaceC13058l navigationState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC16183e fwUpdateApi;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final C15967b homeAnalyticsHelper;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final NotificationRepository notificationRepository;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC0422g prefsDataStore;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC21164r deviceHomeDestinationSource;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final C17345d applicationLifecycle;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final InterfaceC13072o1 connTileEventFlow;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final InterfaceC13058l connTileDomainResult;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final InterfaceC13072o1 dialogUpdateEventFlow;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private final InterfaceC13072o1 onboardingEventFlow;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private final InterfaceC13072o1 dismissConfigEventFlow;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final InterfaceC13072o1 dismissAlertEventFlow;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private final InterfaceC13072o1 hideRecoveryEventFlow;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private final InterfaceC13072o1 dayOneTransitionEventFlow;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private final InterfaceC13072o1 homeToolbarGiftIconNewIndicatorEventFlow;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private final InterfaceC13072o1 requiredPermissionsCheckEventFlow;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private final InterfaceC13072o1 weeklyPlanHomeTileEventFlow;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    private final InterfaceC13072o1 streaksHomeEventFlow;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    private final InterfaceC13072o1 autoPopEventFlow;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    private final InterfaceC13072o1 inAppReviewEventFlow;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    private final InterfaceC13072o1 connectivityIndicatorEventFlow;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    private final InterfaceC13075p1 journalPendingStateFlow;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    private final InterfaceC13058l dialogDomainResult;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    private final InterfaceC13072o1 homeEventFlow;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    private final InterfaceC13058l homeFlow;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    private final InterfaceC13058l homeFeedDomainState;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    private final InterfaceC13072o1 calendarEventFlow;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    private final InterfaceC13072o1 processNowEventFlow;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    private final InterfaceC13058l processNowDomainState;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    private final InterfaceC13058l calendarDomainState;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    private final InterfaceC13058l homeOnboardingDomainState;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    private final InterfaceC13058l homeDismissConfigCtaState;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    private final InterfaceC13058l homeDismissAlertTileState;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    private final InterfaceC13058l hideRecoveryDomainState;

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    private final InterfaceC13058l dayOneTransitionDomainState;

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    private final InterfaceC13058l weeklyPlanHomeTileDomainState;

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    private final InterfaceC13058l streaksDomainActionFlow;

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    private final InterfaceC13058l streaksHomeDomainState;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    private final InterfaceC13058l autoPopDestinationsFlow;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC36049d strapUnlockService;

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    private final InterfaceC13058l autoPopDomainState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C31388d fwApiInteractor;

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    private final InterfaceC13058l inAppReviewDomainState;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C18646w homeToolbarInteractor;

    /* JADX INFO: renamed from: y0, reason: from kotlin metadata */
    private final InterfaceC13058l connectivityIndicatorDomainState;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C24503c pushNotificationPermissionsInteractor;

    /* JADX INFO: renamed from: z0, reason: from kotlin metadata */
    private final InterfaceC13058l strapIndicatorDomainResult;

    /* JADX INFO: renamed from: em1.u$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f46301a;

        static {
            int[] iArr = new int[EnumC13344r.values().length];
            try {
                iArr[EnumC13344r.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC13344r.CALENDAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC13344r.PULL_TO_REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f46301a = iArr;
        }
    }

    /* JADX INFO: renamed from: em1.u$a0 */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a0 implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f46302w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13347u f46303x;

        /* JADX INFO: renamed from: em1.u$a0$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f46304w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13347u f46305x;

            /* JADX INFO: renamed from: em1.u$a0$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes9.dex */
            @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$special$$inlined$map$11$2", m100430f = "HomeViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41536a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f46306E;

                /* JADX INFO: renamed from: F */
                Object f46307F;

                /* JADX INFO: renamed from: G */
                Object f46308G;

                /* JADX INFO: renamed from: H */
                int f46309H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f46310w;

                /* JADX INFO: renamed from: x */
                int f46311x;

                /* JADX INFO: renamed from: y */
                Object f46312y;

                public C41536a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f46310w = obj;
                    this.f46311x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C13347u c13347u) {
                this.f46304w = interfaceC13062m;
                this.f46305x = c13347u;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41536a c41536a;
                if (interfaceC30057d instanceof C41536a) {
                    c41536a = (C41536a) interfaceC30057d;
                    int i13 = c41536a.f46311x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41536a.f46311x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41536a = new C41536a(interfaceC30057d);
                    }
                } else {
                    c41536a = new C41536a(interfaceC30057d);
                }
                Object obj2 = c41536a.f46310w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41536a.f46311x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f46304w;
                    AbstractC18625b0 abstractC18625b0M37514I0 = this.f46305x.m37514I0((AbstractC13328b0) obj);
                    c41536a.f46312y = null;
                    c41536a.f46306E = null;
                    c41536a.f46307F = null;
                    c41536a.f46308G = null;
                    c41536a.f46309H = 0;
                    c41536a.f46311x = 1;
                    if (interfaceC13062m.emit(abstractC18625b0M37514I0, c41536a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public a0(InterfaceC13058l interfaceC13058l, C13347u c13347u) {
            this.f46302w = interfaceC13058l;
            this.f46303x = c13347u;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f46302w.collect(new a(interfaceC13062m, this.f46303x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$calendarDomainState$1$1", m100430f = "HomeViewModel.kt", m100431l = {208}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lem1/i;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f46314w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f46315x;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f46315x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f46315x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f46314w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC13335i.a aVar = new AbstractC13335i.a(0, EnumC14603g.OVERVIEW);
                this.f46315x = null;
                this.f46314w = 1;
                if (interfaceC13062m.emit(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$b0 */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b0 implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f46316w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13347u f46317x;

        /* JADX INFO: renamed from: em1.u$b0$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f46318w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13347u f46319x;

            /* JADX INFO: renamed from: em1.u$b0$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes9.dex */
            @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$special$$inlined$map$12$2", m100430f = "HomeViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41537a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f46320E;

                /* JADX INFO: renamed from: F */
                Object f46321F;

                /* JADX INFO: renamed from: G */
                Object f46322G;

                /* JADX INFO: renamed from: H */
                int f46323H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f46324w;

                /* JADX INFO: renamed from: x */
                int f46325x;

                /* JADX INFO: renamed from: y */
                Object f46326y;

                public C41537a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f46324w = obj;
                    this.f46325x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C13347u c13347u) {
                this.f46318w = interfaceC13062m;
                this.f46319x = c13347u;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41537a c41537a;
                if (interfaceC30057d instanceof C41537a) {
                    c41537a = (C41537a) interfaceC30057d;
                    int i13 = c41537a.f46325x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41537a.f46325x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41537a = new C41537a(interfaceC30057d);
                    }
                } else {
                    c41537a = new C41537a(interfaceC30057d);
                }
                Object obj2 = c41537a.f46324w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41537a.f46325x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f46318w;
                    InterfaceC3419b interfaceC3419bM37550r0 = this.f46319x.m37550r0((AbstractC13352z) obj);
                    c41537a.f46326y = null;
                    c41537a.f46320E = null;
                    c41537a.f46321F = null;
                    c41537a.f46322G = null;
                    c41537a.f46323H = 0;
                    c41537a.f46325x = 1;
                    if (interfaceC13062m.emit(interfaceC3419bM37550r0, c41537a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public b0(InterfaceC13058l interfaceC13058l, C13347u c13347u) {
            this.f46316w = interfaceC13058l;
            this.f46317x = c13347u;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f46316w.collect(new a(interfaceC13062m, this.f46317x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$c */
    @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$connTileDomainResult$2", m100430f = "HomeViewModel.kt", m100431l = {149}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Los0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f46328w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f46329x;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(interfaceC30057d);
            cVar.f46329x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f46329x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f46328w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC28306b.a aVar = InterfaceC28306b.a.f114123a;
                this.f46329x = null;
                this.f46328w = 1;
                if (interfaceC13062m.emit(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$c0 */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c0 implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f46330w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13347u f46331x;

        /* JADX INFO: renamed from: em1.u$c0$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f46332w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13347u f46333x;

            /* JADX INFO: renamed from: em1.u$c0$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$special$$inlined$map$13$2", m100430f = "HomeViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41538a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f46334E;

                /* JADX INFO: renamed from: F */
                Object f46335F;

                /* JADX INFO: renamed from: G */
                Object f46336G;

                /* JADX INFO: renamed from: H */
                int f46337H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f46338w;

                /* JADX INFO: renamed from: x */
                int f46339x;

                /* JADX INFO: renamed from: y */
                Object f46340y;

                public C41538a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f46338w = obj;
                    this.f46339x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C13347u c13347u) {
                this.f46332w = interfaceC13062m;
                this.f46333x = c13347u;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41538a c41538a;
                if (interfaceC30057d instanceof C41538a) {
                    c41538a = (C41538a) interfaceC30057d;
                    int i13 = c41538a.f46339x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41538a.f46339x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41538a = new C41538a(interfaceC30057d);
                    }
                } else {
                    c41538a = new C41538a(interfaceC30057d);
                }
                Object obj2 = c41538a.f46338w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41538a.f46339x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f46332w;
                    InterfaceC3419b interfaceC3419bM37536i0 = this.f46333x.m37536i0((AbstractC13340n) obj);
                    c41538a.f46340y = null;
                    c41538a.f46334E = null;
                    c41538a.f46335F = null;
                    c41538a.f46336G = null;
                    c41538a.f46337H = 0;
                    c41538a.f46339x = 1;
                    if (interfaceC13062m.emit(interfaceC3419bM37536i0, c41538a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public c0(InterfaceC13058l interfaceC13058l, C13347u c13347u) {
            this.f46330w = interfaceC13058l;
            this.f46331x = c13347u;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f46330w.collect(new a(interfaceC13062m, this.f46331x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$d */
    @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$connTileDomainResult$3", m100430f = "HomeViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lsl1/b;", "it", "Ll83/a0;", "<anonymous>", "(Lsl1/b;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f46342w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f46343x;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = C13347u.this.new d(interfaceC30057d);
            dVar.f46343x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC32703b abstractC32703b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(abstractC32703b, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC32703b abstractC32703b = (AbstractC32703b) this.f46343x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f46342w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C13347u.this.m37553t0(abstractC32703b);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$d0 */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d0 implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f46345w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13347u f46346x;

        /* JADX INFO: renamed from: em1.u$d0$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f46347w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13347u f46348x;

            /* JADX INFO: renamed from: em1.u$d0$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes9.dex */
            @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$special$$inlined$map$14$2", m100430f = "HomeViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41539a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f46349E;

                /* JADX INFO: renamed from: F */
                Object f46350F;

                /* JADX INFO: renamed from: G */
                Object f46351G;

                /* JADX INFO: renamed from: H */
                int f46352H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f46353w;

                /* JADX INFO: renamed from: x */
                int f46354x;

                /* JADX INFO: renamed from: y */
                Object f46355y;

                public C41539a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f46353w = obj;
                    this.f46354x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C13347u c13347u) {
                this.f46347w = interfaceC13062m;
                this.f46348x = c13347u;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41539a c41539a;
                if (interfaceC30057d instanceof C41539a) {
                    c41539a = (C41539a) interfaceC30057d;
                    int i13 = c41539a.f46354x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41539a.f46354x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41539a = new C41539a(interfaceC30057d);
                    }
                } else {
                    c41539a = new C41539a(interfaceC30057d);
                }
                Object obj2 = c41539a.f46353w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41539a.f46354x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f46347w;
                    AbstractC18622a abstractC18622aM37556v0 = this.f46348x.m37556v0((AbstractC13325a) obj);
                    c41539a.f46355y = null;
                    c41539a.f46349E = null;
                    c41539a.f46350F = null;
                    c41539a.f46351G = null;
                    c41539a.f46352H = 0;
                    c41539a.f46354x = 1;
                    if (interfaceC13062m.emit(abstractC18622aM37556v0, c41539a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public d0(InterfaceC13058l interfaceC13058l, C13347u c13347u) {
            this.f46345w = interfaceC13058l;
            this.f46346x = c13347u;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f46345w.collect(new a(interfaceC13062m, this.f46346x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$e */
    @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$connectivityIndicatorDomainState$2", m100430f = "HomeViewModel.kt", m100431l = {278}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lil1/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f46357w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f46358x;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(interfaceC30057d);
            eVar.f46358x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f46358x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f46357w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC18624b.a aVar = new AbstractC18624b.a(false);
                this.f46358x = null;
                this.f46357w = 1;
                if (interfaceC13062m.emit(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$e0 */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e0 implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f46359w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13347u f46360x;

        /* JADX INFO: renamed from: em1.u$e0$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f46361w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13347u f46362x;

            /* JADX INFO: renamed from: em1.u$e0$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes9.dex */
            @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$special$$inlined$map$15$2", m100430f = "HomeViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41540a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f46363E;

                /* JADX INFO: renamed from: F */
                Object f46364F;

                /* JADX INFO: renamed from: G */
                Object f46365G;

                /* JADX INFO: renamed from: H */
                int f46366H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f46367w;

                /* JADX INFO: renamed from: x */
                int f46368x;

                /* JADX INFO: renamed from: y */
                Object f46369y;

                public C41540a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f46367w = obj;
                    this.f46368x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C13347u c13347u) {
                this.f46361w = interfaceC13062m;
                this.f46362x = c13347u;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41540a c41540a;
                if (interfaceC30057d instanceof C41540a) {
                    c41540a = (C41540a) interfaceC30057d;
                    int i13 = c41540a.f46368x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41540a.f46368x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41540a = new C41540a(interfaceC30057d);
                    }
                } else {
                    c41540a = new C41540a(interfaceC30057d);
                }
                Object obj2 = c41540a.f46367w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41540a.f46368x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f46361w;
                    AbstractC37355a abstractC37355aM37506E0 = this.f46362x.m37506E0((AbstractC13349w) obj);
                    c41540a.f46369y = null;
                    c41540a.f46363E = null;
                    c41540a.f46364F = null;
                    c41540a.f46365G = null;
                    c41540a.f46366H = 0;
                    c41540a.f46368x = 1;
                    if (interfaceC13062m.emit(abstractC37355aM37506E0, c41540a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public e0(InterfaceC13058l interfaceC13058l, C13347u c13347u) {
            this.f46359w = interfaceC13058l;
            this.f46360x = c13347u;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f46359w.collect(new a(interfaceC13062m, this.f46360x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$f */
    @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$dialogDomainResult$2", m100430f = "HomeViewModel.kt", m100431l = {172}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lil1/o;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f46371w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f46372x;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = new f(interfaceC30057d);
            fVar.f46372x = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f46372x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f46371w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC18638o.b bVar = AbstractC18638o.b.f72957a;
                this.f46372x = null;
                this.f46371w = 1;
                if (interfaceC13062m.emit(bVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$f0 */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f0 implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f46373w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13347u f46374x;

        /* JADX INFO: renamed from: em1.u$f0$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f46375w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13347u f46376x;

            /* JADX INFO: renamed from: em1.u$f0$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$special$$inlined$map$16$2", m100430f = "HomeViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41541a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f46377E;

                /* JADX INFO: renamed from: F */
                Object f46378F;

                /* JADX INFO: renamed from: G */
                Object f46379G;

                /* JADX INFO: renamed from: H */
                int f46380H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f46381w;

                /* JADX INFO: renamed from: x */
                int f46382x;

                /* JADX INFO: renamed from: y */
                Object f46383y;

                public C41541a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f46381w = obj;
                    this.f46382x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C13347u c13347u) {
                this.f46375w = interfaceC13062m;
                this.f46376x = c13347u;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41541a c41541a;
                if (interfaceC30057d instanceof C41541a) {
                    c41541a = (C41541a) interfaceC30057d;
                    int i13 = c41541a.f46382x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41541a.f46382x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41541a = new C41541a(interfaceC30057d);
                    }
                } else {
                    c41541a = new C41541a(interfaceC30057d);
                }
                Object obj2 = c41541a.f46381w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41541a.f46382x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f46375w;
                    AbstractC18624b abstractC18624bM37559x0 = this.f46376x.m37559x0((AbstractC13327b) obj);
                    c41541a.f46383y = null;
                    c41541a.f46377E = null;
                    c41541a.f46378F = null;
                    c41541a.f46379G = null;
                    c41541a.f46380H = 0;
                    c41541a.f46382x = 1;
                    if (interfaceC13062m.emit(abstractC18624bM37559x0, c41541a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public f0(InterfaceC13058l interfaceC13058l, C13347u c13347u) {
            this.f46373w = interfaceC13058l;
            this.f46374x = c13347u;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f46373w.collect(new a(interfaceC13062m, this.f46374x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$g */
    @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$homeDismissAlertTileState$2", m100430f = "HomeViewModel.kt", m100431l = {232}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lil1/d;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f46385w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f46386x;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = new g(interfaceC30057d);
            gVar.f46386x = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f46386x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f46385w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC18627d.b bVar = AbstractC18627d.b.f72831a;
                this.f46386x = null;
                this.f46385w = 1;
                if (interfaceC13062m.emit(bVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$g0 */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g0 implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f46387w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15996f f46388x;

        /* JADX INFO: renamed from: em1.u$g0$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f46389w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C15996f f46390x;

            /* JADX INFO: renamed from: em1.u$g0$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$special$$inlined$map$17$2", m100430f = "HomeViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41542a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f46391E;

                /* JADX INFO: renamed from: F */
                Object f46392F;

                /* JADX INFO: renamed from: G */
                Object f46393G;

                /* JADX INFO: renamed from: H */
                int f46394H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f46395w;

                /* JADX INFO: renamed from: x */
                int f46396x;

                /* JADX INFO: renamed from: y */
                Object f46397y;

                public C41542a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f46395w = obj;
                    this.f46396x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C15996f c15996f) {
                this.f46389w = interfaceC13062m;
                this.f46390x = c15996f;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41542a c41542a;
                if (interfaceC30057d instanceof C41542a) {
                    c41542a = (C41542a) interfaceC30057d;
                    int i13 = c41542a.f46396x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41542a.f46396x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41542a = new C41542a(interfaceC30057d);
                    }
                } else {
                    c41542a = new C41542a(interfaceC30057d);
                }
                Object obj2 = c41542a.f46395w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41542a.f46396x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f46389w;
                    C13348v c13348vM45292p = this.f46390x.m45292p((InterfaceC18640q) obj);
                    c41542a.f46397y = null;
                    c41542a.f46391E = null;
                    c41542a.f46392F = null;
                    c41542a.f46393G = null;
                    c41542a.f46394H = 0;
                    c41542a.f46396x = 1;
                    if (interfaceC13062m.emit(c13348vM45292p, c41542a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public g0(InterfaceC13058l interfaceC13058l, C15996f c15996f) {
            this.f46387w = interfaceC13058l;
            this.f46388x = c15996f;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f46387w.collect(new a(interfaceC13062m, this.f46388x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$h */
    @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$homeDismissConfigCtaState$2", m100430f = "HomeViewModel.kt", m100431l = {227}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lil1/g;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f46399w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f46400x;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = new h(interfaceC30057d);
            hVar.f46400x = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f46400x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f46399w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC18630g.c cVar = AbstractC18630g.c.f72866a;
                this.f46400x = null;
                this.f46399w = 1;
                if (interfaceC13062m.emit(cVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$h0 */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h0 implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f46401w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13347u f46402x;

        /* JADX INFO: renamed from: em1.u$h0$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f46403w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13347u f46404x;

            /* JADX INFO: renamed from: em1.u$h0$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes9.dex */
            @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$special$$inlined$map$2$2", m100430f = "HomeViewModel.kt", m100431l = {51, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41543a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f46405E;

                /* JADX INFO: renamed from: F */
                Object f46406F;

                /* JADX INFO: renamed from: G */
                Object f46407G;

                /* JADX INFO: renamed from: H */
                Object f46408H;

                /* JADX INFO: renamed from: I */
                Object f46409I;

                /* JADX INFO: renamed from: J */
                Object f46410J;

                /* JADX INFO: renamed from: K */
                int f46411K;

                /* JADX INFO: renamed from: L */
                int f46412L;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f46413w;

                /* JADX INFO: renamed from: x */
                int f46414x;

                /* JADX INFO: renamed from: y */
                Object f46415y;

                public C41543a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f46413w = obj;
                    this.f46414x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C13347u c13347u) {
                this.f46403w = interfaceC13062m;
                this.f46404x = c13347u;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
            
                if (r2.emit(r9, r0) == r1) goto L22;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, q83.InterfaceC30057d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof em1.C13347u.h0.a.C41543a
                    if (r0 == 0) goto L13
                    r0 = r9
                    em1.u$h0$a$a r0 = (em1.C13347u.h0.a.C41543a) r0
                    int r1 = r0.f46414x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f46414x = r1
                    goto L18
                L13:
                    em1.u$h0$a$a r0 = new em1.u$h0$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f46413w
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r0.f46414x
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L55
                    if (r2 == r4) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f46407G
                    ec3.m r8 = (ec3.InterfaceC13062m) r8
                    java.lang.Object r8 = r0.f46405E
                    em1.u$h0$a$a r8 = (em1.C13347u.h0.a.C41543a) r8
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto L94
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    int r8 = r0.f46411K
                    java.lang.Object r2 = r0.f46410J
                    em1.k r2 = (em1.AbstractC13337k) r2
                    java.lang.Object r2 = r0.f46409I
                    q83.d r2 = (q83.InterfaceC30057d) r2
                    java.lang.Object r2 = r0.f46408H
                    ec3.m r2 = (ec3.InterfaceC13062m) r2
                    java.lang.Object r4 = r0.f46407G
                    ec3.m r4 = (ec3.InterfaceC13062m) r4
                    java.lang.Object r4 = r0.f46405E
                    em1.u$h0$a$a r4 = (em1.C13347u.h0.a.C41543a) r4
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto L7b
                L55:
                    p505ts.AbstractC34132o.m107864I(r9)
                    ec3.m r2 = r7.f46403w
                    em1.k r8 = (em1.AbstractC13337k) r8
                    em1.u r9 = r7.f46404x
                    r0.f46415y = r5
                    r0.f46405E = r5
                    r0.f46406F = r5
                    r0.f46407G = r5
                    r0.f46408H = r2
                    r0.f46409I = r5
                    r0.f46410J = r5
                    r6 = 0
                    r0.f46411K = r6
                    r0.f46412L = r6
                    r0.f46414x = r4
                    java.lang.Object r9 = r9.m37568z0(r8, r0)
                    if (r9 != r1) goto L7a
                    goto L93
                L7a:
                    r8 = r6
                L7b:
                    r0.f46415y = r5
                    r0.f46405E = r5
                    r0.f46406F = r5
                    r0.f46407G = r5
                    r0.f46408H = r5
                    r0.f46409I = r5
                    r0.f46410J = r5
                    r0.f46411K = r8
                    r0.f46414x = r3
                    java.lang.Object r8 = r2.emit(r9, r0)
                    if (r8 != r1) goto L94
                L93:
                    return r1
                L94:
                    l83.a0 r8 = l83.C23454a0.f92919a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: em1.C13347u.h0.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public h0(InterfaceC13058l interfaceC13058l, C13347u c13347u) {
            this.f46401w = interfaceC13058l;
            this.f46402x = c13347u;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f46401w.collect(new a(interfaceC13062m, this.f46402x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$i */
    @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$homeDomainResult$1", m100430f = "HomeViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lil1/q;", "it", "Ll83/a0;", "<anonymous>", "(Lil1/q;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f46417w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f46418x;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            i iVar = C13347u.this.new i(interfaceC30057d);
            iVar.f46418x = obj;
            return iVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC18640q interfaceC18640q, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC18640q, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC18640q interfaceC18640q = (InterfaceC18640q) this.f46418x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f46417w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C13347u.this.m37539k0(interfaceC18640q);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$i0 */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i0 implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f46420w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13347u f46421x;

        /* JADX INFO: renamed from: em1.u$i0$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f46422w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13347u f46423x;

            /* JADX INFO: renamed from: em1.u$i0$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$special$$inlined$map$3$2", m100430f = "HomeViewModel.kt", m100431l = {51, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41544a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f46424E;

                /* JADX INFO: renamed from: F */
                Object f46425F;

                /* JADX INFO: renamed from: G */
                Object f46426G;

                /* JADX INFO: renamed from: H */
                Object f46427H;

                /* JADX INFO: renamed from: I */
                Object f46428I;

                /* JADX INFO: renamed from: J */
                Object f46429J;

                /* JADX INFO: renamed from: K */
                int f46430K;

                /* JADX INFO: renamed from: L */
                int f46431L;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f46432w;

                /* JADX INFO: renamed from: x */
                int f46433x;

                /* JADX INFO: renamed from: y */
                Object f46434y;

                public C41544a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f46432w = obj;
                    this.f46433x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C13347u c13347u) {
                this.f46422w = interfaceC13062m;
                this.f46423x = c13347u;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
            
                if (r2.emit(r9, r0) == r1) goto L22;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, q83.InterfaceC30057d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof em1.C13347u.i0.a.C41544a
                    if (r0 == 0) goto L13
                    r0 = r9
                    em1.u$i0$a$a r0 = (em1.C13347u.i0.a.C41544a) r0
                    int r1 = r0.f46433x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f46433x = r1
                    goto L18
                L13:
                    em1.u$i0$a$a r0 = new em1.u$i0$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f46432w
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r0.f46433x
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L55
                    if (r2 == r4) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f46426G
                    ec3.m r8 = (ec3.InterfaceC13062m) r8
                    java.lang.Object r8 = r0.f46424E
                    em1.u$i0$a$a r8 = (em1.C13347u.i0.a.C41544a) r8
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto L94
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    int r8 = r0.f46430K
                    java.lang.Object r2 = r0.f46429J
                    em1.n r2 = (em1.AbstractC13340n) r2
                    java.lang.Object r2 = r0.f46428I
                    q83.d r2 = (q83.InterfaceC30057d) r2
                    java.lang.Object r2 = r0.f46427H
                    ec3.m r2 = (ec3.InterfaceC13062m) r2
                    java.lang.Object r4 = r0.f46426G
                    ec3.m r4 = (ec3.InterfaceC13062m) r4
                    java.lang.Object r4 = r0.f46424E
                    em1.u$i0$a$a r4 = (em1.C13347u.i0.a.C41544a) r4
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto L7b
                L55:
                    p505ts.AbstractC34132o.m107864I(r9)
                    ec3.m r2 = r7.f46422w
                    em1.n r8 = (em1.AbstractC13340n) r8
                    em1.u r9 = r7.f46423x
                    r0.f46434y = r5
                    r0.f46424E = r5
                    r0.f46425F = r5
                    r0.f46426G = r5
                    r0.f46427H = r2
                    r0.f46428I = r5
                    r0.f46429J = r5
                    r6 = 0
                    r0.f46430K = r6
                    r0.f46431L = r6
                    r0.f46433x = r4
                    java.lang.Object r9 = em1.C13347u.m37529Z(r9, r8, r0)
                    if (r9 != r1) goto L7a
                    goto L93
                L7a:
                    r8 = r6
                L7b:
                    r0.f46434y = r5
                    r0.f46424E = r5
                    r0.f46425F = r5
                    r0.f46426G = r5
                    r0.f46427H = r5
                    r0.f46428I = r5
                    r0.f46429J = r5
                    r0.f46430K = r8
                    r0.f46433x = r3
                    java.lang.Object r8 = r2.emit(r9, r0)
                    if (r8 != r1) goto L94
                L93:
                    return r1
                L94:
                    l83.a0 r8 = l83.C23454a0.f92919a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: em1.C13347u.i0.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public i0(InterfaceC13058l interfaceC13058l, C13347u c13347u) {
            this.f46420w = interfaceC13058l;
            this.f46421x = c13347u;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f46420w.collect(new a(interfaceC13062m, this.f46421x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$j */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$homeFlow$1$1", m100430f = "HomeViewModel.kt", m100431l = {183}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lem1/n;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f46436w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f46437x;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            j jVar = new j(interfaceC30057d);
            jVar.f46437x = obj;
            return jVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f46437x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f46436w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC13340n.c cVar = new AbstractC13340n.c(null, null, null, 7, null);
                this.f46437x = null;
                this.f46436w = 1;
                if (interfaceC13062m.emit(cVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$j0 */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j0 implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f46438w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13347u f46439x;

        /* JADX INFO: renamed from: em1.u$j0$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f46440w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13347u f46441x;

            /* JADX INFO: renamed from: em1.u$j0$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes9.dex */
            @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$special$$inlined$map$4$2", m100430f = "HomeViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41545a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f46442E;

                /* JADX INFO: renamed from: F */
                Object f46443F;

                /* JADX INFO: renamed from: G */
                Object f46444G;

                /* JADX INFO: renamed from: H */
                int f46445H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f46446w;

                /* JADX INFO: renamed from: x */
                int f46447x;

                /* JADX INFO: renamed from: y */
                Object f46448y;

                public C41545a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f46446w = obj;
                    this.f46447x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C13347u c13347u) {
                this.f46440w = interfaceC13062m;
                this.f46441x = c13347u;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41545a c41545a;
                if (interfaceC30057d instanceof C41545a) {
                    c41545a = (C41545a) interfaceC30057d;
                    int i13 = c41545a.f46447x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41545a.f46447x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41545a = new C41545a(interfaceC30057d);
                    }
                } else {
                    c41545a = new C41545a(interfaceC30057d);
                }
                Object obj2 = c41545a.f46446w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41545a.f46447x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f46440w;
                    AbstractC18649z abstractC18649zM37510G0 = this.f46441x.m37510G0((AbstractC13343q) obj);
                    c41545a.f46448y = null;
                    c41545a.f46442E = null;
                    c41545a.f46443F = null;
                    c41545a.f46444G = null;
                    c41545a.f46445H = 0;
                    c41545a.f46447x = 1;
                    if (interfaceC13062m.emit(abstractC18649zM37510G0, c41545a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public j0(InterfaceC13058l interfaceC13058l, C13347u c13347u) {
            this.f46438w = interfaceC13058l;
            this.f46439x = c13347u;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f46438w.collect(new a(interfaceC13062m, this.f46439x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$k */
    @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$homeOnboardingDomainState$2", m100430f = "HomeViewModel.kt", m100431l = {222}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lil1/t;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f46450w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f46451x;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            k kVar = new k(interfaceC30057d);
            kVar.f46451x = obj;
            return kVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f46451x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f46450w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC18643t.a aVar = AbstractC18643t.a.f73149a;
                this.f46451x = null;
                this.f46450w = 1;
                if (interfaceC13062m.emit(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$k0 */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k0 implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f46452w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13347u f46453x;

        /* JADX INFO: renamed from: em1.u$k0$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f46454w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13347u f46455x;

            /* JADX INFO: renamed from: em1.u$k0$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$special$$inlined$map$5$2", m100430f = "HomeViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41546a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f46456E;

                /* JADX INFO: renamed from: F */
                Object f46457F;

                /* JADX INFO: renamed from: G */
                Object f46458G;

                /* JADX INFO: renamed from: H */
                int f46459H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f46460w;

                /* JADX INFO: renamed from: x */
                int f46461x;

                /* JADX INFO: renamed from: y */
                Object f46462y;

                public C41546a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f46460w = obj;
                    this.f46461x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C13347u c13347u) {
                this.f46454w = interfaceC13062m;
                this.f46455x = c13347u;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41546a c41546a;
                if (interfaceC30057d instanceof C41546a) {
                    c41546a = (C41546a) interfaceC30057d;
                    int i13 = c41546a.f46461x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41546a.f46461x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41546a = new C41546a(interfaceC30057d);
                    }
                } else {
                    c41546a = new C41546a(interfaceC30057d);
                }
                Object obj2 = c41546a.f46460w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41546a.f46461x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f46454w;
                    AbstractC18636m abstractC18636mM37558w0 = this.f46455x.m37558w0((AbstractC13335i) obj);
                    c41546a.f46462y = null;
                    c41546a.f46456E = null;
                    c41546a.f46457F = null;
                    c41546a.f46458G = null;
                    c41546a.f46459H = 0;
                    c41546a.f46461x = 1;
                    if (interfaceC13062m.emit(abstractC18636mM37558w0, c41546a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public k0(InterfaceC13058l interfaceC13058l, C13347u c13347u) {
            this.f46452w = interfaceC13058l;
            this.f46453x = c13347u;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f46452w.collect(new a(interfaceC13062m, this.f46453x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$l */
    @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$homeToolbarGiftIconNewIndicatorResult$1", m100430f = "HomeViewModel.kt", m100431l = {307}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f46464w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f46465x;

        public l(InterfaceC30057d<? super l> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            l lVar = new l(interfaceC30057d);
            lVar.f46465x = obj;
            return lVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((l) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f46465x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f46464w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Boolean bool = Boolean.TRUE;
                this.f46465x = null;
                this.f46464w = 1;
                if (interfaceC13062m.emit(bool, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$l0 */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l0 implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f46466w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13347u f46467x;

        /* JADX INFO: renamed from: em1.u$l0$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f46468w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13347u f46469x;

            /* JADX INFO: renamed from: em1.u$l0$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes9.dex */
            @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$special$$inlined$map$6$2", m100430f = "HomeViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41547a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f46470E;

                /* JADX INFO: renamed from: F */
                Object f46471F;

                /* JADX INFO: renamed from: G */
                Object f46472G;

                /* JADX INFO: renamed from: H */
                int f46473H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f46474w;

                /* JADX INFO: renamed from: x */
                int f46475x;

                /* JADX INFO: renamed from: y */
                Object f46476y;

                public C41547a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f46474w = obj;
                    this.f46475x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C13347u c13347u) {
                this.f46468w = interfaceC13062m;
                this.f46469x = c13347u;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41547a c41547a;
                if (interfaceC30057d instanceof C41547a) {
                    c41547a = (C41547a) interfaceC30057d;
                    int i13 = c41547a.f46475x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41547a.f46475x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41547a = new C41547a(interfaceC30057d);
                    }
                } else {
                    c41547a = new C41547a(interfaceC30057d);
                }
                Object obj2 = c41547a.f46474w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41547a.f46475x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f46468w;
                    AbstractC18643t abstractC18643tM37508F0 = this.f46469x.m37508F0((AbstractC13342p) obj);
                    c41547a.f46476y = null;
                    c41547a.f46470E = null;
                    c41547a.f46471F = null;
                    c41547a.f46472G = null;
                    c41547a.f46473H = 0;
                    c41547a.f46475x = 1;
                    if (interfaceC13062m.emit(abstractC18643tM37508F0, c41547a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public l0(InterfaceC13058l interfaceC13058l, C13347u c13347u) {
            this.f46466w = interfaceC13058l;
            this.f46467x = c13347u;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f46466w.collect(new a(interfaceC13062m, this.f46467x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$m */
    @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$inAppReviewDomainState$2", m100430f = "HomeViewModel.kt", m100431l = {273}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lwl1/a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class m extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f46478w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f46479x;

        public m(InterfaceC30057d<? super m> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            m mVar = new m(interfaceC30057d);
            mVar.f46479x = obj;
            return mVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((m) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f46479x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f46478w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC37355a.c cVar = AbstractC37355a.c.f159778a;
                this.f46479x = null;
                this.f46478w = 1;
                if (interfaceC13062m.emit(cVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$m0 */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m0 implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f46480w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13347u f46481x;

        /* JADX INFO: renamed from: em1.u$m0$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f46482w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13347u f46483x;

            /* JADX INFO: renamed from: em1.u$m0$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes9.dex */
            @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$special$$inlined$map$7$2", m100430f = "HomeViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41548a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f46484E;

                /* JADX INFO: renamed from: F */
                Object f46485F;

                /* JADX INFO: renamed from: G */
                Object f46486G;

                /* JADX INFO: renamed from: H */
                int f46487H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f46488w;

                /* JADX INFO: renamed from: x */
                int f46489x;

                /* JADX INFO: renamed from: y */
                Object f46490y;

                public C41548a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f46488w = obj;
                    this.f46489x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C13347u c13347u) {
                this.f46482w = interfaceC13062m;
                this.f46483x = c13347u;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41548a c41548a;
                if (interfaceC30057d instanceof C41548a) {
                    c41548a = (C41548a) interfaceC30057d;
                    int i13 = c41548a.f46489x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41548a.f46489x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41548a = new C41548a(interfaceC30057d);
                    }
                } else {
                    c41548a = new C41548a(interfaceC30057d);
                }
                Object obj2 = c41548a.f46488w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41548a.f46489x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f46482w;
                    AbstractC18630g abstractC18630gM37500B0 = this.f46483x.m37500B0((AbstractC13331e) obj);
                    c41548a.f46490y = null;
                    c41548a.f46484E = null;
                    c41548a.f46485F = null;
                    c41548a.f46486G = null;
                    c41548a.f46487H = 0;
                    c41548a.f46489x = 1;
                    if (interfaceC13062m.emit(abstractC18630gM37500B0, c41548a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public m0(InterfaceC13058l interfaceC13058l, C13347u c13347u) {
            this.f46480w = interfaceC13058l;
            this.f46481x = c13347u;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f46480w.collect(new a(interfaceC13062m, this.f46481x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$n */
    @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$ltoDismissedOfferIdsAndUserId$1", m100430f = "HomeViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m65681d2 = {"", "", "pairs", "Lcom/whoop/domain/model/User;", UserState.Sources.USER, "Ll83/k;", "<anonymous>", "(Ljava/util/Set;Lcom/whoop/domain/model/User;)Ll83/k;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class n extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f46492w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f46493x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f46494y;

        public n(InterfaceC30057d<? super n> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Set<String> set, User user, InterfaceC30057d<? super C23465k> interfaceC30057d) {
            n nVar = new n(interfaceC30057d);
            nVar.f46493x = set;
            nVar.f46494y = user;
            return nVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Set set = (Set) this.f46493x;
            User user = (User) this.f46494y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f46492w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            String strValueOf = user != null ? String.valueOf(user.getId()) : null;
            if (strValueOf == null) {
                strValueOf = "";
            }
            ArrayList<String> arrayList = new ArrayList();
            for (Object obj2 : set) {
                if (AbstractC39421y.m125930O((String) obj2, strValueOf.concat(":"), false)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
            for (String str : arrayList) {
                arrayList2.add(AbstractC39414r.m125859E0(str, ":", str));
            }
            return new C23465k(AbstractC25265s.m74103I1(arrayList2), strValueOf);
        }
    }

    /* JADX INFO: renamed from: em1.u$n0 */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n0 implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f46495w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13347u f46496x;

        /* JADX INFO: renamed from: em1.u$n0$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f46497w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13347u f46498x;

            /* JADX INFO: renamed from: em1.u$n0$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes9.dex */
            @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$special$$inlined$map$8$2", m100430f = "HomeViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41549a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f46499E;

                /* JADX INFO: renamed from: F */
                Object f46500F;

                /* JADX INFO: renamed from: G */
                Object f46501G;

                /* JADX INFO: renamed from: H */
                int f46502H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f46503w;

                /* JADX INFO: renamed from: x */
                int f46504x;

                /* JADX INFO: renamed from: y */
                Object f46505y;

                public C41549a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f46503w = obj;
                    this.f46504x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C13347u c13347u) {
                this.f46497w = interfaceC13062m;
                this.f46498x = c13347u;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41549a c41549a;
                if (interfaceC30057d instanceof C41549a) {
                    c41549a = (C41549a) interfaceC30057d;
                    int i13 = c41549a.f46504x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41549a.f46504x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41549a = new C41549a(interfaceC30057d);
                    }
                } else {
                    c41549a = new C41549a(interfaceC30057d);
                }
                Object obj2 = c41549a.f46503w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41549a.f46504x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f46497w;
                    AbstractC18627d abstractC18627dM37498A0 = this.f46498x.m37498A0((AbstractC13330d) obj);
                    c41549a.f46505y = null;
                    c41549a.f46499E = null;
                    c41549a.f46500F = null;
                    c41549a.f46501G = null;
                    c41549a.f46502H = 0;
                    c41549a.f46504x = 1;
                    if (interfaceC13062m.emit(abstractC18627dM37498A0, c41549a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public n0(InterfaceC13058l interfaceC13058l, C13347u c13347u) {
            this.f46495w = interfaceC13058l;
            this.f46496x = c13347u;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f46495w.collect(new a(interfaceC13062m, this.f46496x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$o */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$processFwUpdate$2", m100430f = "HomeViewModel.kt", m100431l = {535, 536, 537, 539, 540}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class o extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f46507w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC13333g f46508x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C13347u f46509y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(AbstractC13333g abstractC13333g, C13347u c13347u, InterfaceC30057d<? super o> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f46508x = abstractC13333g;
            this.f46509y = c13347u;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new o(this.f46508x, this.f46509y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((o) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
        
            if (r8.m96656d(r7) == r0) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
        
            if (r8.m96655c(r7) == r0) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
        
            if (r8.m96653a(r7) == r0) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0099, code lost:
        
            if (r8.m96654b(r7) == r0) goto L41;
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
                int r1 = r7.f46507w
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L27
                if (r1 == r6) goto L22
                if (r1 == r5) goto L22
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                goto L22
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L78
            L22:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L9c
            L27:
                p505ts.AbstractC34132o.m107864I(r8)
                em1.g r8 = r7.f46508x
                boolean r1 = r8 instanceof em1.AbstractC13333g.c
                if (r1 != 0) goto L8d
                em1.g$b r1 = em1.AbstractC13333g.b.f46196a
                boolean r1 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r8, r1)
                if (r1 == 0) goto L39
                goto L8d
            L39:
                boolean r1 = r8 instanceof em1.AbstractC13333g.e
                if (r1 == 0) goto L4c
                em1.u r8 = r7.f46509y
                rg1.d r8 = em1.C13347u.m37555v(r8)
                r7.f46507w = r5
                java.lang.Object r8 = r8.m96656d(r7)
                if (r8 != r0) goto L9c
                goto L9b
            L4c:
                boolean r1 = r8 instanceof em1.AbstractC13333g.d
                if (r1 == 0) goto L5f
                em1.u r8 = r7.f46509y
                rg1.d r8 = em1.C13347u.m37555v(r8)
                r7.f46507w = r4
                java.lang.Object r8 = r8.m96655c(r7)
                if (r8 != r0) goto L9c
                goto L9b
            L5f:
                em1.g$a r1 = em1.AbstractC13333g.a.f46195a
                boolean r8 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r8, r1)
                if (r8 == 0) goto L87
                em1.u r8 = r7.f46509y
                ec3.o1 r8 = em1.C13347u.m37547q(r8)
                em1.k$c r1 = em1.AbstractC13337k.c.f46207a
                r7.f46507w = r3
                java.lang.Object r8 = r8.emit(r1, r7)
                if (r8 != r0) goto L78
                goto L9b
            L78:
                em1.u r8 = r7.f46509y
                rg1.d r8 = em1.C13347u.m37555v(r8)
                r7.f46507w = r2
                java.lang.Object r8 = r8.m96653a(r7)
                if (r8 != r0) goto L9c
                goto L9b
            L87:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            L8d:
                em1.u r8 = r7.f46509y
                rg1.d r8 = em1.C13347u.m37555v(r8)
                r7.f46507w = r6
                java.lang.Object r8 = r8.m96654b(r7)
                if (r8 != r0) goto L9c
            L9b:
                return r0
            L9c:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: em1.C13347u.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: em1.u$o0 */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o0 implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f46510w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13347u f46511x;

        /* JADX INFO: renamed from: em1.u$o0$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f46512w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13347u f46513x;

            /* JADX INFO: renamed from: em1.u$o0$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes9.dex */
            @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$special$$inlined$map$9$2", m100430f = "HomeViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41550a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f46514E;

                /* JADX INFO: renamed from: F */
                Object f46515F;

                /* JADX INFO: renamed from: G */
                Object f46516G;

                /* JADX INFO: renamed from: H */
                int f46517H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f46518w;

                /* JADX INFO: renamed from: x */
                int f46519x;

                /* JADX INFO: renamed from: y */
                Object f46520y;

                public C41550a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f46518w = obj;
                    this.f46519x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C13347u c13347u) {
                this.f46512w = interfaceC13062m;
                this.f46513x = c13347u;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41550a c41550a;
                if (interfaceC30057d instanceof C41550a) {
                    c41550a = (C41550a) interfaceC30057d;
                    int i13 = c41550a.f46519x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41550a.f46519x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41550a = new C41550a(interfaceC30057d);
                    }
                } else {
                    c41550a = new C41550a(interfaceC30057d);
                }
                Object obj2 = c41550a.f46518w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41550a.f46519x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f46512w;
                    AbstractC18634k abstractC18634kM37502C0 = this.f46513x.m37502C0((AbstractC13334h) obj);
                    c41550a.f46520y = null;
                    c41550a.f46514E = null;
                    c41550a.f46515F = null;
                    c41550a.f46516G = null;
                    c41550a.f46517H = 0;
                    c41550a.f46519x = 1;
                    if (interfaceC13062m.emit(abstractC18634kM37502C0, c41550a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public o0(InterfaceC13058l interfaceC13058l, C13347u c13347u) {
            this.f46510w = interfaceC13058l;
            this.f46511x = c13347u;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f46510w.collect(new a(interfaceC13062m, this.f46511x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$p */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$processHomeToolbarViewEvent$1", m100430f = "HomeViewModel.kt", m100431l = {549}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class p extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f46522w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC13345s f46523x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C13347u f46524y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(AbstractC13345s abstractC13345s, C13347u c13347u, InterfaceC30057d<? super p> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f46523x = abstractC13345s;
            this.f46524y = c13347u;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new p(this.f46523x, this.f46524y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((p) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f46522w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!(this.f46523x instanceof AbstractC13345s.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                C18646w c18646w = this.f46524y.homeToolbarInteractor;
                this.f46522w = 1;
                if (c18646w.m54075a(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$p0 */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p0 implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f46525w;

        /* JADX INFO: renamed from: em1.u$p0$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f46526w;

            /* JADX INFO: renamed from: em1.u$p0$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$special$$inlined$mapNotNull$1$2", m100430f = "HomeViewModel.kt", m100431l = {54}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41551a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f46527E;

                /* JADX INFO: renamed from: F */
                Object f46528F;

                /* JADX INFO: renamed from: G */
                Object f46529G;

                /* JADX INFO: renamed from: H */
                Object f46530H;

                /* JADX INFO: renamed from: I */
                int f46531I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f46532w;

                /* JADX INFO: renamed from: x */
                int f46533x;

                /* JADX INFO: renamed from: y */
                Object f46534y;

                public C41551a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f46532w = obj;
                    this.f46533x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f46526w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41551a c41551a;
                HomeResponseMetaData metadata;
                AutopopMetadata autopopMetadata;
                List<C9598e> destinations;
                if (interfaceC30057d instanceof C41551a) {
                    c41551a = (C41551a) interfaceC30057d;
                    int i13 = c41551a.f46533x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41551a.f46533x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41551a = new C41551a(interfaceC30057d);
                    }
                } else {
                    c41551a = new C41551a(interfaceC30057d);
                }
                Object obj2 = c41551a.f46532w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41551a.f46533x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f46526w;
                    HomeBffFeedResponse homeBffFeedResponseM54066c = ((AbstractC18645v.c) obj).getBffFeed();
                    AbstractC18622a.d dVar = (homeBffFeedResponseM54066c == null || (metadata = homeBffFeedResponseM54066c.getMetadata()) == null || (autopopMetadata = metadata.getAutopopMetadata()) == null || (destinations = autopopMetadata.getDestinations()) == null) ? null : new AbstractC18622a.d(destinations);
                    if (dVar != null) {
                        c41551a.f46534y = null;
                        c41551a.f46527E = null;
                        c41551a.f46528F = null;
                        c41551a.f46529G = null;
                        c41551a.f46530H = null;
                        c41551a.f46531I = 0;
                        c41551a.f46533x = 1;
                        if (interfaceC13062m.emit(dVar, c41551a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public p0(InterfaceC13058l interfaceC13058l) {
            this.f46525w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f46525w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$q */
    @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel", m100430f = "HomeViewModel.kt", m100431l = {524, 527}, m100432m = "processJournalReturned", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f46536w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f46537x;

        /* JADX INFO: renamed from: z */
        int f46539z;

        public q(InterfaceC30057d<? super q> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f46537x = obj;
            this.f46539z |= Integer.MIN_VALUE;
            return C13347u.this.m37544n0(this);
        }
    }

    /* JADX INFO: renamed from: em1.u$q0 */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q0 implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f46540w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15995e f46541x;

        /* JADX INFO: renamed from: em1.u$q0$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f46542w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C15995e f46543x;

            /* JADX INFO: renamed from: em1.u$q0$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$special$$inlined$mapNotNull$2$2", m100430f = "HomeViewModel.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41552a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f46544E;

                /* JADX INFO: renamed from: F */
                Object f46545F;

                /* JADX INFO: renamed from: G */
                Object f46546G;

                /* JADX INFO: renamed from: H */
                Object f46547H;

                /* JADX INFO: renamed from: I */
                int f46548I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f46549w;

                /* JADX INFO: renamed from: x */
                int f46550x;

                /* JADX INFO: renamed from: y */
                Object f46551y;

                public C41552a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f46549w = obj;
                    this.f46550x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C15995e c15995e) {
                this.f46542w = interfaceC13062m;
                this.f46543x = c15995e;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41552a c41552a;
                if (interfaceC30057d instanceof C41552a) {
                    c41552a = (C41552a) interfaceC30057d;
                    int i13 = c41552a.f46550x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41552a.f46550x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41552a = new C41552a(interfaceC30057d);
                    }
                } else {
                    c41552a = new C41552a(interfaceC30057d);
                }
                Object obj2 = c41552a.f46549w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41552a.f46550x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f46542w;
                    AbstractC12177a abstractC12177aM45265a = this.f46543x.m45265a((InterfaceC18640q.c) obj);
                    if (abstractC12177aM45265a != null) {
                        c41552a.f46551y = null;
                        c41552a.f46544E = null;
                        c41552a.f46545F = null;
                        c41552a.f46546G = null;
                        c41552a.f46547H = null;
                        c41552a.f46548I = 0;
                        c41552a.f46550x = 1;
                        if (interfaceC13062m.emit(abstractC12177aM45265a, c41552a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public q0(InterfaceC13058l interfaceC13058l, C15995e c15995e) {
            this.f46540w = interfaceC13058l;
            this.f46541x = c15995e;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f46540w.collect(new a(interfaceC13062m, this.f46541x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$r */
    @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$requiredPermissionsCheckResult$1", m100430f = "HomeViewModel.kt", m100431l = {313}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class r extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f46553w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f46554x;

        public r(InterfaceC30057d<? super r> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            r rVar = new r(interfaceC30057d);
            rVar.f46554x = obj;
            return rVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((r) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f46554x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f46553w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Boolean bool = Boolean.FALSE;
                this.f46554x = null;
                this.f46553w = 1;
                if (interfaceC13062m.emit(bool, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$r0 */
    @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$strapIndicatorDomainResult$1", m100430f = "HomeViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lsl1/a;", "upstreamValue", "Lpl1/a;", "connectivityIndicator", "<anonymous>", "(Lsl1/a;Lpl1/a;)Lsl1/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class r0 extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f46555w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f46556x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f46557y;

        public r0(InterfaceC30057d<? super r0> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C32702a c32702a, C29349a c29349a, InterfaceC30057d<? super C32702a> interfaceC30057d) {
            r0 r0Var = new r0(interfaceC30057d);
            r0Var.f46556x = c32702a;
            r0Var.f46557y = c29349a;
            return r0Var.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C32702a c32702a = (C32702a) this.f46556x;
            C29349a c29349a = (C29349a) this.f46557y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f46555w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C32702a.m102626b(c32702a, false, false, false, 0, false, null, null, false, c29349a.getIsVisible(), 255, null);
        }
    }

    /* JADX INFO: renamed from: em1.u$s */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$sendNotificationMetric$1$1", m100430f = "HomeViewModel.kt", m100431l = {605}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class s extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f46558w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f46560y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String str, InterfaceC30057d<? super s> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f46560y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C13347u.this.new s(this.f46560y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((s) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f46558w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                NotificationRepository notificationRepository = C13347u.this.notificationRepository;
                PushNotificationMetricType pushNotificationMetricType = PushNotificationMetricType.Opened;
                String str = this.f46560y;
                this.f46558w = 1;
                if (notificationRepository.sendPushNotificationMetric(pushNotificationMetricType, str, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$s0 */
    @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$strapIndicatorDomainResult$2$2", m100430f = "HomeViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lsl1/a;", "result", "Ll83/a0;", "<anonymous>", "(Lsl1/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class s0 extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f46561w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f46562x;

        public s0(InterfaceC30057d<? super s0> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            s0 s0Var = C13347u.this.new s0(interfaceC30057d);
            s0Var.f46562x = obj;
            return s0Var;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C32702a c32702a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((s0) create(c32702a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C32702a c32702a = (C32702a) this.f46562x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f46561w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (c32702a.getDataCatchingUpDomainResult().getState() == EnumC4363c.CATCHING_UP) {
                C13347u.this.logger.mo85228t(AbstractC2875y.m8295h(c32702a.getDataCatchingUpDomainResult().getMinutesBehind(), "Data catching up event triggered. Minutes behind: "), new AbstractC30556a.a[0]);
                C13347u.this.getHomeAnalyticsHelper().m45056G(c32702a.getDataCatchingUpDomainResult());
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$t */
    @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$sendViewEvent$1", m100430f = "HomeViewModel.kt", m100431l = {496, 497, 498, 499, 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, FrameMetricsAggregator.EVERY_DURATION, 512, 514}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class t extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f46564w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC13346t f46565x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C13347u f46566y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(InterfaceC13346t interfaceC13346t, C13347u c13347u, InterfaceC30057d<? super t> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f46565x = interfaceC13346t;
            this.f46566y = c13347u;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new t(this.f46565x, this.f46566y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((t) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
        
            if (r4.emit(r1, r3) == r0) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
        
            if (r4.emit(r1, r3) == r0) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
        
            if (r4.emit(r1, r3) == r0) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
        
            if (r4.emit(r1, r3) == r0) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
        
            if (r4.emit(r1, r3) == r0) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
        
            if (r4.emit(r1, r3) == r0) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00b6, code lost:
        
            if (r4.emit(r1, r3) == r0) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00ce, code lost:
        
            if (r4.emit(r1, r3) == r0) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00e6, code lost:
        
            if (r4.emit(r1, r3) == r0) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00fe, code lost:
        
            if (r4.emit(r1, r3) == r0) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0116, code lost:
        
            if (r4.emit(r1, r3) == r0) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x012e, code lost:
        
            if (r4.emit(r1, r3) == r0) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0142, code lost:
        
            if (r3.f46566y.m37541l0((em1.AbstractC13333g) r4, r3) == r0) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x0167, code lost:
        
            if (r4.emit(r1, r3) == r0) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x017e, code lost:
        
            if (r4.emit(r1, r3) == r0) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x0195, code lost:
        
            if (r4.emit(r1, r3) == r0) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x01c7, code lost:
        
            if (r4.m37544n0(r3) == r0) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x01c9, code lost:
        
            return r0;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                Method dump skipped, instruction units count: 502
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: em1.C13347u.t.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: em1.u$t0 */
    @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$strapIndicatorDomainResult$3", m100430f = "HomeViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lsl1/a;", "it", "Ll83/a0;", "<anonymous>", "(Lsl1/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class t0 extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f46567w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f46568x;

        public t0(InterfaceC30057d<? super t0> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            t0 t0Var = C13347u.this.new t0(interfaceC30057d);
            t0Var.f46568x = obj;
            return t0Var;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C32702a c32702a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((t0) create(c32702a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C32702a c32702a = (C32702a) this.f46568x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f46567w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (C13347u.this.featureFlagChecker.isFeatureEnabled(ConnectivityFeatureFlagsKt.HOME_CONNECTIVITY_INDICATOR_ANALYTICS_FIX) && c32702a.getIsConnectivityIndicatorVisible()) {
                C13347u.this.m37551s0(c32702a);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$u */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f46570w;

        /* JADX INFO: renamed from: em1.u$u$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f46571w;

            /* JADX INFO: renamed from: em1.u$u$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$special$$inlined$filterIsInstance$1$2", m100430f = "HomeViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41553a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f46573F;

                /* JADX INFO: renamed from: G */
                Object f46574G;

                /* JADX INFO: renamed from: H */
                int f46575H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f46576w;

                /* JADX INFO: renamed from: x */
                int f46577x;

                /* JADX INFO: renamed from: y */
                Object f46578y;

                /* JADX INFO: renamed from: z */
                Object f46579z;

                public C41553a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f46576w = obj;
                    this.f46577x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f46571w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41553a c41553a;
                if (interfaceC30057d instanceof C41553a) {
                    c41553a = (C41553a) interfaceC30057d;
                    int i13 = c41553a.f46577x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41553a.f46577x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41553a = new C41553a(interfaceC30057d);
                    }
                } else {
                    c41553a = new C41553a(interfaceC30057d);
                }
                Object obj2 = c41553a.f46576w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41553a.f46577x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f46571w;
                    if (obj instanceof AbstractC18645v.c) {
                        c41553a.f46578y = null;
                        c41553a.f46579z = null;
                        c41553a.f46573F = null;
                        c41553a.f46574G = null;
                        c41553a.f46575H = 0;
                        c41553a.f46577x = 1;
                        if (interfaceC13062m.emit(obj, c41553a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public u(InterfaceC13058l interfaceC13058l) {
            this.f46570w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f46570w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$u0 */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel", m100430f = "HomeViewModel.kt", m100431l = {389, 396}, m100432m = "viewEventToDialogAction$home_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u0 extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f46580w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f46581x;

        /* JADX INFO: renamed from: z */
        int f46583z;

        public u0(InterfaceC30057d<? super u0> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f46581x = obj;
            this.f46583z |= Integer.MIN_VALUE;
            return C13347u.this.m37568z0(null, this);
        }
    }

    /* JADX INFO: renamed from: em1.u$v */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f46584w;

        /* JADX INFO: renamed from: em1.u$v$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f46585w;

            /* JADX INFO: renamed from: em1.u$v$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$special$$inlined$filterIsInstance$2$2", m100430f = "HomeViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41554a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f46587F;

                /* JADX INFO: renamed from: G */
                Object f46588G;

                /* JADX INFO: renamed from: H */
                int f46589H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f46590w;

                /* JADX INFO: renamed from: x */
                int f46591x;

                /* JADX INFO: renamed from: y */
                Object f46592y;

                /* JADX INFO: renamed from: z */
                Object f46593z;

                public C41554a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f46590w = obj;
                    this.f46591x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f46585w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41554a c41554a;
                if (interfaceC30057d instanceof C41554a) {
                    c41554a = (C41554a) interfaceC30057d;
                    int i13 = c41554a.f46591x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41554a.f46591x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41554a = new C41554a(interfaceC30057d);
                    }
                } else {
                    c41554a = new C41554a(interfaceC30057d);
                }
                Object obj2 = c41554a.f46590w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41554a.f46591x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f46585w;
                    if (obj instanceof InterfaceC18640q.c) {
                        c41554a.f46592y = null;
                        c41554a.f46593z = null;
                        c41554a.f46587F = null;
                        c41554a.f46588G = null;
                        c41554a.f46589H = 0;
                        c41554a.f46591x = 1;
                        if (interfaceC13062m.emit(obj, c41554a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public v(InterfaceC13058l interfaceC13058l) {
            this.f46584w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f46584w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$v0 */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$viewEventToDialogAction$2", m100430f = "HomeViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "it", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class v0 extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f46594w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f46595x;

        public v0(InterfaceC30057d<? super v0> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            v0 v0Var = new v0(interfaceC30057d);
            v0Var.f46595x = obj;
            return v0Var;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((v0) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f46595x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f46594w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40230g(LanguageRepositoryKt.getKEY_SHOW_LANGUAGE_MODAL(), Boolean.FALSE);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$w */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$special$$inlined$flatMapLatest$1", m100430f = "HomeViewModel.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class w extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f46596w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f46597x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f46598y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C13347u f46599z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(InterfaceC30057d interfaceC30057d, C13347u c13347u) {
            super(3, interfaceC30057d);
            this.f46599z = c13347u;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, Boolean bool, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            w wVar = new w(interfaceC30057d, this.f46599z);
            wVar.f46597x = interfaceC13062m;
            wVar.f46598y = bool;
            return wVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c13015a0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f46596w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f46597x;
                if (((Boolean) this.f46598y).booleanValue()) {
                    c13015a0 = new C13015a0(new j(null), this.f46599z.homeEventFlow);
                } else {
                    c13015a0 = C13054k.f45116w;
                }
                this.f46597x = null;
                this.f46598y = null;
                this.f46596w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13015a0, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (Boolean) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: em1.u$w0 */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$viewEventToDialogAction$3", m100430f = "HomeViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "it", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class w0 extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f46600w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f46601x;

        public w0(InterfaceC30057d<? super w0> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            w0 w0Var = new w0(interfaceC30057d);
            w0Var.f46601x = obj;
            return w0Var;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((w0) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f46601x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f46600w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C14132d c14132dM44453f = AbstractC15751g.m44453f("DID_CRASH");
            Boolean bool = Boolean.FALSE;
            c14129a.getClass();
            c14129a.m40231h(c14132dM44453f, bool);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$x */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$special$$inlined$flatMapLatest$2", m100430f = "HomeViewModel.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class x extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f46602w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f46603x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f46604y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C13347u f46605z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(InterfaceC30057d interfaceC30057d, C13347u c13347u) {
            super(3, interfaceC30057d);
            this.f46605z = c13347u;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, Boolean bool, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            x xVar = new x(interfaceC30057d, this.f46605z);
            xVar.f46603x = interfaceC13062m;
            xVar.f46604y = bool;
            return xVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c13015a0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f46602w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f46603x;
                if (((Boolean) this.f46604y).booleanValue()) {
                    c13015a0 = new C13015a0(new b(null), this.f46605z.calendarEventFlow);
                } else {
                    c13015a0 = C13054k.f45116w;
                }
                this.f46603x = null;
                this.f46604y = null;
                this.f46602w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13015a0, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (Boolean) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: em1.u$x0 */
    @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel", m100430f = "HomeViewModel.kt", m100431l = {349, 349, 350, 350}, m100432m = "viewEventToHomeAction", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class x0 extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f46606E;

        /* JADX INFO: renamed from: w */
        Object f46607w;

        /* JADX INFO: renamed from: x */
        Object f46608x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f46609y;

        public x0(InterfaceC30057d<? super x0> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f46609y = obj;
            this.f46606E |= Integer.MIN_VALUE;
            return C13347u.this.m37504D0(null, this);
        }
    }

    /* JADX INFO: renamed from: em1.u$y */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f46611w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13347u f46612x;

        /* JADX INFO: renamed from: em1.u$y$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f46613w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13347u f46614x;

            /* JADX INFO: renamed from: em1.u$y$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes9.dex */
            @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$special$$inlined$map$1$2", m100430f = "HomeViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41555a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f46615E;

                /* JADX INFO: renamed from: F */
                Object f46616F;

                /* JADX INFO: renamed from: G */
                Object f46617G;

                /* JADX INFO: renamed from: H */
                int f46618H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f46619w;

                /* JADX INFO: renamed from: x */
                int f46620x;

                /* JADX INFO: renamed from: y */
                Object f46621y;

                public C41555a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f46619w = obj;
                    this.f46620x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C13347u c13347u) {
                this.f46613w = interfaceC13062m;
                this.f46614x = c13347u;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41555a c41555a;
                if (interfaceC30057d instanceof C41555a) {
                    c41555a = (C41555a) interfaceC30057d;
                    int i13 = c41555a.f46620x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41555a.f46620x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41555a = new C41555a(interfaceC30057d);
                    }
                } else {
                    c41555a = new C41555a(interfaceC30057d);
                }
                Object obj2 = c41555a.f46619w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41555a.f46620x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f46613w;
                    InterfaceC28306b interfaceC28306bM37512H0 = this.f46614x.m37512H0((AbstractC13336j) obj);
                    c41555a.f46621y = null;
                    c41555a.f46615E = null;
                    c41555a.f46616F = null;
                    c41555a.f46617G = null;
                    c41555a.f46618H = 0;
                    c41555a.f46620x = 1;
                    if (interfaceC13062m.emit(interfaceC28306bM37512H0, c41555a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public y(InterfaceC13058l interfaceC13058l, C13347u c13347u) {
            this.f46611w = interfaceC13058l;
            this.f46612x = c13347u;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f46611w.collect(new a(interfaceC13062m, this.f46612x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$y0 */
    @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$weeklyPlanHomeTileDomainState$2", m100430f = "HomeViewModel.kt", m100431l = {245}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lil1/b0;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class y0 extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f46623w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f46624x;

        public y0(InterfaceC30057d<? super y0> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            y0 y0Var = new y0(interfaceC30057d);
            y0Var.f46624x = obj;
            return y0Var;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((y0) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f46624x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f46623w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC18625b0.a aVar = new AbstractC18625b0.a(false);
                this.f46624x = null;
                this.f46623w = 1;
                if (interfaceC13062m.emit(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: em1.u$z */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class z implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f46625w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13347u f46626x;

        /* JADX INFO: renamed from: em1.u$z$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f46627w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13347u f46628x;

            /* JADX INFO: renamed from: em1.u$z$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes9.dex */
            @InterfaceC32271e(m100429c = "com.whoop.home.presentation.HomeViewModel$special$$inlined$map$10$2", m100430f = "HomeViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41556a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f46629E;

                /* JADX INFO: renamed from: F */
                Object f46630F;

                /* JADX INFO: renamed from: G */
                Object f46631G;

                /* JADX INFO: renamed from: H */
                int f46632H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f46633w;

                /* JADX INFO: renamed from: x */
                int f46634x;

                /* JADX INFO: renamed from: y */
                Object f46635y;

                public C41556a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f46633w = obj;
                    this.f46634x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C13347u c13347u) {
                this.f46627w = interfaceC13062m;
                this.f46628x = c13347u;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41556a c41556a;
                if (interfaceC30057d instanceof C41556a) {
                    c41556a = (C41556a) interfaceC30057d;
                    int i13 = c41556a.f46634x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41556a.f46634x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41556a = new C41556a(interfaceC30057d);
                    }
                } else {
                    c41556a = new C41556a(interfaceC30057d);
                }
                Object obj2 = c41556a.f46633w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41556a.f46634x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f46627w;
                    AbstractC18626c abstractC18626cM37561y0 = this.f46628x.m37561y0((AbstractC13329c) obj);
                    c41556a.f46635y = null;
                    c41556a.f46629E = null;
                    c41556a.f46630F = null;
                    c41556a.f46631G = null;
                    c41556a.f46632H = 0;
                    c41556a.f46634x = 1;
                    if (interfaceC13062m.emit(abstractC18626cM37561y0, c41556a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public z(InterfaceC13058l interfaceC13058l, C13347u c13347u) {
            this.f46625w = interfaceC13058l;
            this.f46626x = c13347u;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f46625w.collect(new a(interfaceC13062m, this.f46626x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13347u(C15996f viewStateReducer, C18641r homeInteractor, C22563c calendarInteractor, C18639p homeDomainCombiner, C32705d strapDomainInteractor, C35064a dialogStateCombiner, C28016b processNowInteractor, C1004a homeOnboardingInteractor, C18632i dismissConfigInteractor, C18628e dismissAlertInteractor, C36104b hideRecoveryInteractor, C33919c dayOneTransitionInteractor, C4811b weeklyPlanHomeTileInteractor, C3421d streaksHomeInteractor, C21771b autoPopInteractor, C37357c inAppReviewInteractor, C29350b connectivityIndicatorInteractor, InterfaceC36049d strapUnlockService, C31388d fwApiInteractor, C18646w homeToolbarInteractor, C24503c pushNotificationPermissionsInteractor, C34659c ltoDismissStore, InterfaceC40205a userInfoAccessor, InterfaceC16183e fwUpdateApi, C15967b homeAnalyticsHelper, NotificationRepository notificationRepository, FeatureFlagChecker featureFlagChecker, InterfaceC0422g prefsDataStore, InterfaceC21164r deviceHomeDestinationSource, InterfaceC2994c0 coroutineScope, C15995e navigationReducer, C17345d applicationLifecycle) {
        super(coroutineScope);
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        AbstractC22676k.m65750j(homeInteractor, "homeInteractor");
        AbstractC22676k.m65750j(calendarInteractor, "calendarInteractor");
        AbstractC22676k.m65750j(homeDomainCombiner, "homeDomainCombiner");
        AbstractC22676k.m65750j(strapDomainInteractor, "strapDomainInteractor");
        AbstractC22676k.m65750j(dialogStateCombiner, "dialogStateCombiner");
        AbstractC22676k.m65750j(processNowInteractor, "processNowInteractor");
        AbstractC22676k.m65750j(homeOnboardingInteractor, "homeOnboardingInteractor");
        AbstractC22676k.m65750j(dismissConfigInteractor, "dismissConfigInteractor");
        AbstractC22676k.m65750j(dismissAlertInteractor, "dismissAlertInteractor");
        AbstractC22676k.m65750j(hideRecoveryInteractor, "hideRecoveryInteractor");
        AbstractC22676k.m65750j(dayOneTransitionInteractor, "dayOneTransitionInteractor");
        AbstractC22676k.m65750j(weeklyPlanHomeTileInteractor, "weeklyPlanHomeTileInteractor");
        AbstractC22676k.m65750j(streaksHomeInteractor, "streaksHomeInteractor");
        AbstractC22676k.m65750j(autoPopInteractor, "autoPopInteractor");
        AbstractC22676k.m65750j(inAppReviewInteractor, "inAppReviewInteractor");
        AbstractC22676k.m65750j(connectivityIndicatorInteractor, "connectivityIndicatorInteractor");
        AbstractC22676k.m65750j(strapUnlockService, "strapUnlockService");
        AbstractC22676k.m65750j(fwApiInteractor, "fwApiInteractor");
        AbstractC22676k.m65750j(homeToolbarInteractor, "homeToolbarInteractor");
        AbstractC22676k.m65750j(pushNotificationPermissionsInteractor, "pushNotificationPermissionsInteractor");
        AbstractC22676k.m65750j(ltoDismissStore, "ltoDismissStore");
        AbstractC22676k.m65750j(userInfoAccessor, "userInfoAccessor");
        AbstractC22676k.m65750j(fwUpdateApi, "fwUpdateApi");
        AbstractC22676k.m65750j(homeAnalyticsHelper, "homeAnalyticsHelper");
        AbstractC22676k.m65750j(notificationRepository, "notificationRepository");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(prefsDataStore, "prefsDataStore");
        AbstractC22676k.m65750j(deviceHomeDestinationSource, "deviceHomeDestinationSource");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(navigationReducer, "navigationReducer");
        AbstractC22676k.m65750j(applicationLifecycle, "applicationLifecycle");
        this.strapUnlockService = strapUnlockService;
        this.fwApiInteractor = fwApiInteractor;
        this.homeToolbarInteractor = homeToolbarInteractor;
        this.pushNotificationPermissionsInteractor = pushNotificationPermissionsInteractor;
        this.ltoDismissStore = ltoDismissStore;
        this.userInfoAccessor = userInfoAccessor;
        this.fwUpdateApi = fwUpdateApi;
        this.homeAnalyticsHelper = homeAnalyticsHelper;
        this.notificationRepository = notificationRepository;
        this.featureFlagChecker = featureFlagChecker;
        this.prefsDataStore = prefsDataStore;
        this.deviceHomeDestinationSource = deviceHomeDestinationSource;
        this.coroutineScope = coroutineScope;
        this.applicationLifecycle = applicationLifecycle;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("HomeViewModel");
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.connTileEventFlow = c13096w1M36592b;
        C13052j1 c13052j1 = new C13052j1(AbstractC13091v.m36610t(AbstractC27845h.m83945a(new C13015a0(new c(null), new y(c13096w1M36592b, this)), strapDomainInteractor)), new d(null), 0);
        this.connTileDomainResult = c13052j1;
        C13096w1 c13096w1M36592b2 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.dialogUpdateEventFlow = c13096w1M36592b2;
        C13096w1 c13096w1M36592b3 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.onboardingEventFlow = c13096w1M36592b3;
        C13096w1 c13096w1M36592b4 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.dismissConfigEventFlow = c13096w1M36592b4;
        C13096w1 c13096w1M36592b5 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.dismissAlertEventFlow = c13096w1M36592b5;
        C13096w1 c13096w1M36592b6 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.hideRecoveryEventFlow = c13096w1M36592b6;
        C13096w1 c13096w1M36592b7 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.dayOneTransitionEventFlow = c13096w1M36592b7;
        C13096w1 c13096w1M36592b8 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.homeToolbarGiftIconNewIndicatorEventFlow = c13096w1M36592b8;
        C13096w1 c13096w1M36592b9 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.requiredPermissionsCheckEventFlow = c13096w1M36592b9;
        C13096w1 c13096w1M36592b10 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.weeklyPlanHomeTileEventFlow = c13096w1M36592b10;
        C13096w1 c13096w1M36592b11 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.streaksHomeEventFlow = c13096w1M36592b11;
        C13096w1 c13096w1M36592b12 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.autoPopEventFlow = c13096w1M36592b12;
        C13096w1 c13096w1M36592b13 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.inAppReviewEventFlow = c13096w1M36592b13;
        C13096w1 c13096w1M36592b14 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.connectivityIndicatorEventFlow = c13096w1M36592b14;
        this.journalPendingStateFlow = AbstractC13091v.m36593c(new C18648y(false, null, 3, null));
        InterfaceC13058l interfaceC13058lM83945a = AbstractC27845h.m83945a(new C13015a0(new f(null), new h0(c13096w1M36592b2, this)), dialogStateCombiner);
        this.dialogDomainResult = interfaceC13058lM83945a;
        this.homeEventFlow = AbstractC13091v.m36592b(0, 1, null, 5);
        C14380k c14380kM36590P = AbstractC13091v.m36590P(deviceHomeDestinationSource.getIsAvailable(), new w(null, this));
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(c14380kM36590P, coroutineScope, c13021b2, 1);
        this.homeFlow = c13078q1M36586L;
        C13078q1 c13078q1M36586L2 = AbstractC13091v.m36586L(AbstractC27845h.m83945a(new i0(c13078q1M36586L, this), homeInteractor), coroutineScope, c13021b2, 1);
        this.homeFeedDomainState = c13078q1M36586L2;
        this.calendarEventFlow = AbstractC13091v.m36592b(0, 1, null, 5);
        C13096w1 c13096w1M36592b15 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.processNowEventFlow = c13096w1M36592b15;
        InterfaceC13058l interfaceC13058lM83945a2 = AbstractC27845h.m83945a(new j0(c13096w1M36592b15, this), processNowInteractor);
        this.processNowDomainState = interfaceC13058lM83945a2;
        InterfaceC13058l interfaceC13058lM83945a3 = AbstractC27845h.m83945a(new k0(AbstractC13091v.m36590P(deviceHomeDestinationSource.getIsAvailable(), new x(null, this)), this), calendarInteractor);
        this.calendarDomainState = interfaceC13058lM83945a3;
        InterfaceC13058l interfaceC13058lM83945a4 = AbstractC27845h.m83945a(new C13015a0(new k(null), new l0(c13096w1M36592b3, this)), homeOnboardingInteractor);
        this.homeOnboardingDomainState = interfaceC13058lM83945a4;
        InterfaceC13058l interfaceC13058lM83945a5 = AbstractC27845h.m83945a(new C13015a0(new h(null), new m0(c13096w1M36592b4, this)), dismissConfigInteractor);
        this.homeDismissConfigCtaState = interfaceC13058lM83945a5;
        InterfaceC13058l interfaceC13058lM83945a6 = AbstractC27845h.m83945a(new C13015a0(new g(null), new n0(c13096w1M36592b5, this)), dismissAlertInteractor);
        this.homeDismissAlertTileState = interfaceC13058lM83945a6;
        InterfaceC13058l interfaceC13058lM83945a7 = AbstractC27845h.m83945a(new o0(c13096w1M36592b6, this), hideRecoveryInteractor);
        this.hideRecoveryDomainState = interfaceC13058lM83945a7;
        InterfaceC13058l interfaceC13058lM83945a8 = AbstractC27845h.m83945a(new z(c13096w1M36592b7, this), dayOneTransitionInteractor);
        this.dayOneTransitionDomainState = interfaceC13058lM83945a8;
        InterfaceC13058l interfaceC13058lM83945a9 = AbstractC27845h.m83945a(new C13015a0(new y0(null), new a0(c13096w1M36592b10, this)), weeklyPlanHomeTileInteractor);
        this.weeklyPlanHomeTileDomainState = interfaceC13058lM83945a9;
        b0 b0Var = new b0(c13096w1M36592b11, this);
        this.streaksDomainActionFlow = b0Var;
        InterfaceC13058l interfaceC13058lM83945a10 = AbstractC27845h.m83945a(AbstractC28157e0.m85207a(new C4588i(new c0(c13078q1M36586L, this), 2), b0Var), streaksHomeInteractor);
        this.streaksHomeDomainState = interfaceC13058lM83945a10;
        p0 p0Var = new p0(new u(c13078q1M36586L2));
        this.autoPopDestinationsFlow = p0Var;
        InterfaceC13058l interfaceC13058lM83945a11 = AbstractC27845h.m83945a(new C4588i(AbstractC28157e0.m85207a(new d0(c13096w1M36592b12, this), p0Var), 2), autoPopInteractor);
        this.autoPopDomainState = interfaceC13058lM83945a11;
        InterfaceC13058l interfaceC13058lM83945a12 = AbstractC27845h.m83945a(new C13015a0(new m(null), new e0(c13096w1M36592b13, this)), inAppReviewInteractor);
        this.inAppReviewDomainState = interfaceC13058lM83945a12;
        InterfaceC13058l interfaceC13058lM36610t = AbstractC13091v.m36610t(AbstractC27845h.m83945a(new C13015a0(new e(null), new f0(c13096w1M36592b14, this)), connectivityIndicatorInteractor));
        this.connectivityIndicatorDomainState = interfaceC13058lM36610t;
        C13060l1 c13060l1 = new C13060l1(strapDomainInteractor.getConnectivityIndicatorDomainResultFlow(), interfaceC13058lM36610t, new r0(null), 1);
        int i13 = 0;
        AbstractC13091v.m36582H(new C13052j1(AbstractC13091v.m36611u(c13060l1, new C11906c(26), AbstractC13091v.f45232b), new s0(null), i13), coroutineScope);
        C13052j1 c13052j2 = new C13052j1(AbstractC13091v.m36610t(c13060l1), new t0(null), i13);
        this.strapIndicatorDomainResult = c13052j2;
        C13015a0 c13015a0 = new C13015a0(new l(null), c13096w1M36592b8);
        this.homeToolbarGiftIconNewIndicatorResult = c13015a0;
        C13015a0 c13015a1 = new C13015a0(new r(null), AbstractC13091v.m36610t(c13096w1M36592b9));
        this.requiredPermissionsCheckResult = c13015a1;
        InterfaceC13058l interfaceC13058lM36610t2 = AbstractC13091v.m36610t(new C13060l1(ltoDismissStore.getDismissedUserOfferIdsFlow(), userInfoAccessor.getCom.whoop.service.network.model.UserState.Sources.USER java.lang.String(), new n(null), 1));
        this.ltoDismissedOfferIdsAndUserId = interfaceC13058lM36610t2;
        C13078q1 c13078q1M36586L3 = AbstractC13091v.m36586L(new C13052j1(homeDomainCombiner.m53966a(c13078q1M36586L2, interfaceC13058lM83945a3, c13052j2, c13052j1, interfaceC13058lM83945a, interfaceC13058lM83945a2, interfaceC13058lM83945a4, interfaceC13058lM83945a5, interfaceC13058lM83945a6, interfaceC13058lM83945a7, interfaceC13058lM83945a8, interfaceC13058lM83945a9, c13015a0, c13015a1, interfaceC13058lM83945a10, interfaceC13058lM83945a11, interfaceC13058lM83945a12, interfaceC13058lM36610t2), new i(null), 0), coroutineScope, c13021b2, 1);
        this.homeDomainResult = c13078q1M36586L3;
        this.viewState = new g0(c13078q1M36586L3, viewStateReducer);
        this.navigationState = AbstractC13091v.m36610t(new q0(new v(c13078q1M36586L3), navigationReducer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public final AbstractC18627d m37498A0(AbstractC13330d viewEvent) {
        if (viewEvent instanceof AbstractC13330d.a) {
            return new AbstractC18627d.a(((AbstractC13330d.a) viewEvent).getId());
        }
        if (viewEvent instanceof AbstractC13330d.b) {
            return AbstractC18627d.c.f72832a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public final AbstractC18630g m37500B0(AbstractC13331e viewEvent) {
        if (viewEvent instanceof AbstractC13331e.b) {
            return new AbstractC18630g.a(((AbstractC13331e.b) viewEvent).getCycleId());
        }
        if (viewEvent instanceof AbstractC13331e.a) {
            return AbstractC18630g.b.f72865a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public final AbstractC18634k m37502C0(AbstractC13334h viewEvent) {
        if (AbstractC22676k.m65745e(viewEvent, AbstractC13334h.a.f46200a)) {
            return AbstractC18634k.a.f72890a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x0099  */
    /* JADX WARN: Code duplicated, block: B:37:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: D0 */
    public final Object m37504D0(AbstractC13340n abstractC13340n, InterfaceC30057d<? super AbstractC18644u> interfaceC30057d) {
        x0 x0Var;
        AbstractC13340n abstractC13340n2;
        InterfaceC13072o1 interfaceC13072o1;
        AbstractC13340n abstractC13340n3;
        InterfaceC13072o1 interfaceC13072o2;
        Object objM71344g;
        AbstractC13340n abstractC13340n4;
        InterfaceC13072o1 interfaceC13072o3;
        AbstractC13340n abstractC13340n5;
        if (interfaceC30057d instanceof x0) {
            x0Var = (x0) interfaceC30057d;
            int i13 = x0Var.f46606E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                x0Var.f46606E = i13 - Integer.MIN_VALUE;
            } else {
                x0Var = new x0(interfaceC30057d);
            }
        } else {
            x0Var = new x0(interfaceC30057d);
        }
        Object obj = x0Var.f46609y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = x0Var.f46606E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (!(abstractC13340n instanceof AbstractC13340n.c)) {
                if (abstractC13340n instanceof AbstractC13340n.b) {
                    return new AbstractC18644u.b(((AbstractC13340n.b) abstractC13340n).getPillarType());
                }
                if (abstractC13340n instanceof AbstractC13340n.a) {
                    return new AbstractC18644u.a(((AbstractC13340n.a) abstractC13340n).getAction());
                }
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC13072o1 interfaceC13072o4 = this.homeToolbarGiftIconNewIndicatorEventFlow;
            C18646w c18646w = this.homeToolbarInteractor;
            x0Var.f46607w = abstractC13340n;
            x0Var.f46608x = interfaceC13072o4;
            x0Var.f46606E = 1;
            Object objM54076b = c18646w.m54076b(x0Var);
            if (objM54076b != enumC31071a) {
                abstractC13340n2 = abstractC13340n;
                interfaceC13072o1 = interfaceC13072o4;
                obj = objM54076b;
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            interfaceC13072o1 = (InterfaceC13072o1) x0Var.f46608x;
            abstractC13340n2 = (AbstractC13340n) x0Var.f46607w;
            AbstractC34132o.m107864I(obj);
        } else {
            if (i14 == 2) {
                abstractC13340n3 = (AbstractC13340n) x0Var.f46607w;
                AbstractC34132o.m107864I(obj);
                interfaceC13072o2 = this.requiredPermissionsCheckEventFlow;
                C24503c c24503c = this.pushNotificationPermissionsInteractor;
                x0Var.f46607w = abstractC13340n3;
                x0Var.f46608x = interfaceC13072o2;
                x0Var.f46606E = 3;
                objM71344g = c24503c.m71344g(x0Var);
                if (objM71344g != enumC31071a) {
                    abstractC13340n4 = abstractC13340n3;
                    interfaceC13072o3 = interfaceC13072o2;
                    obj = objM71344g;
                    x0Var.f46607w = abstractC13340n4;
                    x0Var.f46608x = null;
                    x0Var.f46606E = 4;
                    if (interfaceC13072o3.emit(obj, x0Var) != enumC31071a) {
                        abstractC13340n5 = abstractC13340n4;
                    }
                }
                return enumC31071a;
            }
            if (i14 == 3) {
                interfaceC13072o3 = (InterfaceC13072o1) x0Var.f46608x;
                abstractC13340n4 = (AbstractC13340n) x0Var.f46607w;
                AbstractC34132o.m107864I(obj);
                x0Var.f46607w = abstractC13340n4;
                x0Var.f46608x = null;
                x0Var.f46606E = 4;
                if (interfaceC13072o3.emit(obj, x0Var) != enumC31071a) {
                    abstractC13340n5 = abstractC13340n4;
                }
                return enumC31071a;
            }
            if (i14 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC13340n5 = (AbstractC13340n) x0Var.f46607w;
            AbstractC34132o.m107864I(obj);
        }
        AbstractC13340n.c cVar = (AbstractC13340n.c) abstractC13340n5;
        return new AbstractC18644u.c(cVar.getRequestDate(), cVar.getPillarType(), false, cVar.getRefreshType(), 4, null);
        x0Var.f46607w = abstractC13340n2;
        x0Var.f46608x = null;
        x0Var.f46606E = 2;
        if (interfaceC13072o1.emit(obj, x0Var) != enumC31071a) {
            abstractC13340n3 = abstractC13340n2;
            interfaceC13072o2 = this.requiredPermissionsCheckEventFlow;
            C24503c c24503c2 = this.pushNotificationPermissionsInteractor;
            x0Var.f46607w = abstractC13340n3;
            x0Var.f46608x = interfaceC13072o2;
            x0Var.f46606E = 3;
            objM71344g = c24503c2.m71344g(x0Var);
            if (objM71344g != enumC31071a) {
                abstractC13340n4 = abstractC13340n3;
                interfaceC13072o3 = interfaceC13072o2;
                obj = objM71344g;
                x0Var.f46607w = abstractC13340n4;
                x0Var.f46608x = null;
                x0Var.f46606E = 4;
                if (interfaceC13072o3.emit(obj, x0Var) != enumC31071a) {
                    abstractC13340n5 = abstractC13340n4;
                    AbstractC13340n.c cVar2 = (AbstractC13340n.c) abstractC13340n5;
                    return new AbstractC18644u.c(cVar2.getRequestDate(), cVar2.getPillarType(), false, cVar2.getRefreshType(), 4, null);
                }
            }
        }
        return enumC31071a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public final AbstractC37355a m37506E0(AbstractC13349w viewEvent) {
        if (AbstractC22676k.m65745e(viewEvent, AbstractC13349w.a.f46661a)) {
            return AbstractC37355a.a.f159776a;
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC13349w.b.f46662a)) {
            return AbstractC37355a.b.f159777a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public final AbstractC18643t m37508F0(AbstractC13342p viewEvent) {
        if (AbstractC22676k.m65745e(viewEvent, AbstractC13342p.a.f46232a)) {
            return AbstractC18643t.a.f73149a;
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC13342p.b.f46233a)) {
            return AbstractC18643t.c.f73151a;
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC13342p.c.f46234a)) {
            return AbstractC18643t.b.f73150a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public final AbstractC18649z m37510G0(AbstractC13343q viewEvent) {
        if (viewEvent instanceof AbstractC13343q.c) {
            return AbstractC18649z.c.f73186a;
        }
        if (viewEvent instanceof AbstractC13343q.a) {
            AbstractC13343q.a aVar = (AbstractC13343q.a) viewEvent;
            return new AbstractC18649z.a(aVar.getGpsEnabled(), aVar.getStartAt(), aVar.getSportId());
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC13343q.b.f46239a)) {
            return AbstractC18649z.b.f73185a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public final InterfaceC28306b m37512H0(AbstractC13336j viewEvent) {
        if (AbstractC22676k.m65745e(viewEvent, AbstractC13336j.b.f46204a)) {
            return InterfaceC28306b.b.f114124a;
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC13336j.a.f46203a)) {
            return InterfaceC28306b.a.f114123a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public final AbstractC18625b0 m37514I0(AbstractC13328b0 viewEvent) {
        if (viewEvent instanceof AbstractC13328b0.a) {
            return new AbstractC18625b0.a(((AbstractC13328b0.a) viewEvent).getIsExpanded());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public final InterfaceC3419b m37536i0(AbstractC13340n viewEvent) {
        if (viewEvent instanceof AbstractC13340n.c) {
            return InterfaceC3419b.b.f13328a;
        }
        if ((viewEvent instanceof AbstractC13340n.b) || (viewEvent instanceof AbstractC13340n.a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: j0 */
    private final void m37538j0(InterfaceC13346t event) {
        if (event instanceof AbstractC13340n.c) {
            AbstractC13340n.c cVar = (AbstractC13340n.c) event;
            int i13 = a.f46301a[cVar.getRefreshType().ordinal()];
            if (i13 == 1) {
                this.homeAnalyticsHelper.m45087o();
                return;
            } else if (i13 == 2) {
                this.homeAnalyticsHelper.m45053D(cVar.getPillarType(), cVar.getRequestDate());
                return;
            } else {
                if (i13 != 3) {
                    return;
                }
                this.homeAnalyticsHelper.m45052C(cVar.getPillarType());
                return;
            }
        }
        if (event instanceof AbstractC13337k.f) {
            this.homeAnalyticsHelper.m45070V();
            return;
        }
        if (event instanceof AbstractC13343q.c) {
            AbstractC13343q.c cVar2 = (AbstractC13343q.c) event;
            this.homeAnalyticsHelper.m45065Q(cVar2.getCycleId(), cVar2.getSource());
        } else if (event instanceof AbstractC13343q.a) {
            this.homeAnalyticsHelper.m45076d(((AbstractC13343q.a) event).getSource());
        } else if (event instanceof AbstractC13331e.b) {
            this.homeAnalyticsHelper.m45081i(true);
        } else if (event instanceof AbstractC13332f.a) {
            this.homeAnalyticsHelper.m45089q(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public final void m37539k0(InterfaceC18640q result) {
        if (result instanceof InterfaceC18640q.a) {
            if (((InterfaceC18640q.a) result).getHomeData().getBffFeed() != null || this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.HOME_ERROR_ANALYTICS_FIX)) {
                return;
            }
            this.homeAnalyticsHelper.m45067S();
            return;
        }
        if (result instanceof InterfaceC18640q.c) {
            InterfaceC18640q.c cVar = (InterfaceC18640q.c) result;
            if (cVar.getHomeData().getHomeDialogDomainResult().getIsVisible() && cVar.getHomeData().getHomeDialogDomainResult().getType() == EnumC35066c.HARD_TOMBSTONE) {
                this.homeAnalyticsHelper.m45058J();
            } else if (cVar.getHomeData().getHomeDialogDomainResult().getIsVisible() && cVar.getHomeData().getHomeDialogDomainResult().getType() == EnumC35066c.SOFT_TOMBSTONE) {
                this.homeAnalyticsHelper.m45062N();
            }
            if (this.featureFlagChecker.isFeatureEnabled(ConnectivityFeatureFlagsKt.HOME_CONNECTIVITY_INDICATOR_ANALYTICS_FIX)) {
                return;
            }
            m37551s0(cVar.getHomeData().getStrapStatusIconIndicatorResult());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public final Object m37541l0(AbstractC13333g abstractC13333g, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new o(abstractC13333g, this, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public final void m37542m0(AbstractC13345s event) {
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new p(event, this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (r9.emit(r5, r0) == r1) goto L28;
     */
    /* JADX INFO: renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m37544n0(q83.InterfaceC30057d<? super l83.C23454a0> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof em1.C13347u.q
            if (r0 == 0) goto L13
            r0 = r9
            em1.u$q r0 = (em1.C13347u.q) r0
            int r1 = r0.f46539z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46539z = r1
            goto L18
        L13:
            em1.u$q r0 = new em1.u$q
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f46537x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f46539z
            l83.a0 r3 = l83.C23454a0.f92919a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L41
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r0 = r0.f46536w
            il1.y r0 = (il1.C18648y) r0
            p505ts.AbstractC34132o.m107864I(r9)
            goto L91
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            java.lang.Object r2 = r0.f46536w
            il1.y r2 = (il1.C18648y) r2
            p505ts.AbstractC34132o.m107864I(r9)
            goto L6f
        L41:
            p505ts.AbstractC34132o.m107864I(r9)
            com.whoop.data.repositories.FeatureFlagChecker r9 = r8.featureFlagChecker
            java.lang.String r2 = "streaks-animation-reload-fix"
            boolean r9 = r9.isFeatureEnabled(r2)
            if (r9 != 0) goto L4f
            return r3
        L4f:
            ec3.p1 r9 = r8.journalPendingStateFlow
            ec3.h2 r9 = (ec3.C13045h2) r9
            java.lang.Object r9 = r9.getValue()
            r2 = r9
            il1.y r2 = (il1.C18648y) r2
            boolean r9 = r2.getPendingStreakAnimationReload()
            if (r9 == 0) goto L6f
            ec3.o1 r9 = r8.streaksHomeEventFlow
            em1.z$b r7 = em1.AbstractC13352z.b.f46666a
            r0.f46536w = r2
            r0.f46539z = r5
            java.lang.Object r9 = r9.emit(r7, r0)
            if (r9 != r1) goto L6f
            goto L90
        L6f:
            java.lang.String r9 = r2.getPendingJournalIdentifier()
            if (r9 == 0) goto L91
            ec3.o1 r9 = r8.autoPopEventFlow
            em1.a$b r5 = new em1.a$b
            com.whoop.navigation.AppScreen$b3 r7 = com.whoop.navigation.AppScreen.C9275b3.f27499w
            java.lang.String r7 = r7.getName()
            java.lang.String r2 = r2.getPendingJournalIdentifier()
            r5.<init>(r7, r2)
            r0.f46536w = r6
            r0.f46539z = r4
            java.lang.Object r9 = r9.emit(r5, r0)
            if (r9 != r1) goto L91
        L90:
            return r1
        L91:
            ec3.p1 r9 = r8.journalPendingStateFlow
        L93:
            r0 = r9
            ec3.h2 r0 = (ec3.C13045h2) r0
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            il1.y r2 = (il1.C18648y) r2
            il1.y r2 = new il1.y
            r4 = 0
            r5 = 3
            r2.<init>(r4, r6, r5, r6)
            boolean r0 = r0.m36569i(r1, r2)
            if (r0 == 0) goto L93
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: em1.C13347u.m37544n0(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C4361a m37548q0(C32702a it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getDataCatchingUpDomainResult();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public final InterfaceC3419b m37550r0(AbstractC13352z viewEvent) {
        if (viewEvent instanceof AbstractC13352z.a) {
            return new InterfaceC3419b.a(((AbstractC13352z.a) viewEvent).getStreaksValue());
        }
        if (viewEvent instanceof AbstractC13352z.b) {
            return InterfaceC3419b.c.f13329a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public final void m37551s0(C32702a indicatorResult) {
        if (((Boolean) this.applicationLifecycle.getAppForegroundFlow().getValue()).booleanValue()) {
            this.homeAnalyticsHelper.m45083k(indicatorResult);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public final void m37553t0(AbstractC32703b it) {
        if (((Boolean) this.applicationLifecycle.getAppForegroundFlow().getValue()).booleanValue()) {
            this.homeAnalyticsHelper.m45084l(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public final AbstractC18622a m37556v0(AbstractC13325a viewEvent) {
        if (viewEvent instanceof AbstractC13325a.b) {
            AbstractC13325a.b bVar = (AbstractC13325a.b) viewEvent;
            return new AbstractC18622a.c(bVar.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), bVar.getIdentifier());
        }
        if (!(viewEvent instanceof AbstractC13325a.a)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC13325a.a aVar = (AbstractC13325a.a) viewEvent;
        return new AbstractC18622a.b(aVar.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), aVar.getIdentifier());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public final AbstractC18636m m37558w0(AbstractC13335i viewEvent) {
        if (!(viewEvent instanceof AbstractC13335i.a)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC13335i.a aVar = (AbstractC13335i.a) viewEvent;
        return new AbstractC18636m.a(null, aVar.getMonthOffset(), aVar.getPillarType(), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public final AbstractC18624b m37559x0(AbstractC13327b viewEvent) {
        if (viewEvent instanceof AbstractC13327b.a) {
            return new AbstractC18624b.a(((AbstractC13327b.a) viewEvent).getIsVisible());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public final AbstractC18626c m37561y0(AbstractC13329c viewEvent) {
        if (viewEvent instanceof AbstractC13329c.b) {
            return new AbstractC18626c.c(((AbstractC13329c.b) viewEvent).getShow());
        }
        if (viewEvent instanceof AbstractC13329c.a) {
            return new AbstractC18626c.b(((AbstractC13329c.a) viewEvent).getFeatureId());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: g0, reason: from getter */
    public final C15967b getHomeAnalyticsHelper() {
        return this.homeAnalyticsHelper;
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: h0, reason: from getter */
    public final InterfaceC13058l getNavigationState() {
        return this.navigationState;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m37565o0(String sourceId) {
        if (sourceId != null) {
            AbstractC3006f0.m8732z(this.coroutineScope, null, null, new s(sourceId, null), 3);
            this.homeAnalyticsHelper.m45094w(sourceId);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m37566p0(InterfaceC13346t event) {
        AbstractC22676k.m65750j(event, "event");
        m37538j0(event);
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new t(event, this, null), 3);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m37567u0() {
        this.strapUnlockService.mo114449b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        if (hg3.AbstractC17269i.m48861G(r6, r7, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        if (hg3.AbstractC17269i.m48861G(r6, r7, r0) == r1) goto L35;
     */
    /* JADX INFO: renamed from: z0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m37568z0(em1.AbstractC13337k r6, q83.InterfaceC30057d<? super il1.AbstractC18638o> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof em1.C13347u.u0
            if (r0 == 0) goto L13
            r0 = r7
            em1.u$u0 r0 = (em1.C13347u.u0) r0
            int r1 = r0.f46583z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46583z = r1
            goto L18
        L13:
            em1.u$u0 r0 = new em1.u$u0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f46581x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f46583z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.f46580w
            em1.k r6 = (em1.AbstractC13337k) r6
            p505ts.AbstractC34132o.m107864I(r7)
            goto L8d
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.f46580w
            em1.k r6 = (em1.AbstractC13337k) r6
            p505ts.AbstractC34132o.m107864I(r7)
            goto L74
        L3e:
            p505ts.AbstractC34132o.m107864I(r7)
            boolean r7 = r6 instanceof em1.AbstractC13337k.c
            if (r7 == 0) goto L4d
            gl1.b r6 = r5.homeAnalyticsHelper
            r6.m45061M()
            il1.o$c r6 = il1.AbstractC18638o.c.f72958a
            return r6
        L4d:
            boolean r7 = r6 instanceof em1.AbstractC13337k.b
            if (r7 == 0) goto L5d
            il1.o$a r7 = new il1.o$a
            em1.k$b r6 = (em1.AbstractC13337k.b) r6
            android.companion.CompanionDeviceManager$Callback r6 = r6.getCallback()
            r7.<init>(r6)
            return r7
        L5d:
            boolean r7 = r6 instanceof em1.AbstractC13337k.e
            r2 = 0
            if (r7 == 0) goto L77
            a6.g r6 = r5.prefsDataStore
            em1.u$v0 r7 = new em1.u$v0
            r7.<init>(r2)
            r0.f46580w = r2
            r0.f46583z = r4
            java.lang.Object r6 = hg3.AbstractC17269i.m48861G(r6, r7, r0)
            if (r6 != r1) goto L74
            goto L8c
        L74:
            il1.o$c r6 = il1.AbstractC18638o.c.f72958a
            return r6
        L77:
            boolean r7 = r6 instanceof em1.AbstractC13337k.a
            if (r7 == 0) goto L90
            a6.g r6 = r5.prefsDataStore
            em1.u$w0 r7 = new em1.u$w0
            r7.<init>(r2)
            r0.f46580w = r2
            r0.f46583z = r3
            java.lang.Object r6 = hg3.AbstractC17269i.m48861G(r6, r7, r0)
            if (r6 != r1) goto L8d
        L8c:
            return r1
        L8d:
            il1.o$c r6 = il1.AbstractC18638o.c.f72958a
            return r6
        L90:
            boolean r6 = r6 instanceof em1.AbstractC13337k.d
            if (r6 == 0) goto L97
            il1.o$d r6 = il1.AbstractC18638o.d.f72959a
            return r6
        L97:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: em1.C13347u.m37568z0(em1.k, q83.d):java.lang.Object");
    }

    public /* synthetic */ C13347u(C15996f c15996f, C18641r c18641r, C22563c c22563c, C18639p c18639p, C32705d c32705d, C35064a c35064a, C28016b c28016b, C1004a c1004a, C18632i c18632i, C18628e c18628e, C36104b c36104b, C33919c c33919c, C4811b c4811b, C3421d c3421d, C21771b c21771b, C37357c c37357c, C29350b c29350b, InterfaceC36049d interfaceC36049d, C31388d c31388d, C18646w c18646w, C24503c c24503c, C34659c c34659c, InterfaceC40205a interfaceC40205a, InterfaceC16183e interfaceC16183e, C15967b c15967b, NotificationRepository notificationRepository, FeatureFlagChecker featureFlagChecker, InterfaceC0422g interfaceC0422g, InterfaceC21164r interfaceC21164r, InterfaceC2994c0 interfaceC2994c0, C15995e c15995e, C17345d c17345d, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c15996f, c18641r, c22563c, c18639p, c32705d, c35064a, c28016b, c1004a, c18632i, c18628e, c36104b, c33919c, c4811b, c3421d, c21771b, c37357c, c29350b, interfaceC36049d, c31388d, c18646w, c24503c, c34659c, interfaceC40205a, interfaceC16183e, c15967b, notificationRepository, featureFlagChecker, interfaceC0422g, interfaceC21164r, (i13 & 536870912) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0, c15995e, c17345d);
    }
}
