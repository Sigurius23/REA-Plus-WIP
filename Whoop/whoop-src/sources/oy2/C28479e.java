package oy2;

import androidx.core.app.NotificationCompat;
import androidx.room.AbstractC1848z0;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.C3075y1;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3061u;
import c93.InterfaceC4351m;
import ci2.InterfaceC4733b;
import com.whoop.whooplabs.C10823a;
import com.whoop.whooplabs.WhoopLabsService;
import com.whoop.whooplabs.data.domain.LabsCampaign;
import com.whoop.whooplabs.data.domain.LabsSession;
import com.whoop.whooplabs.data.domain.OptionSelection;
import com.whoop.whooplabs.data.domain.ProtocolStepType;
import com.whoop.whooplabs.data.domain.ProtocolStepWithOptions;
import com.whoop.whooplabs.data.domain.SurveyProvider;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignStepConfigResponse;
import com.whoop.whooplabs.data.room.entity.ProtocolStepMysticReading;
import com.whoop.whooplabs.data.room.entity.ProtocolStepResult;
import com.whoop.whooplabs.data.room.entity.RemoteCampaign;
import com.whoop.whooplabs.data.room.entity.WhoopLabsStudy;
import dc3.InterfaceC11936u;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ex2.C13731b;
import ex2.C13732c;
import gt0.InterfaceC16183e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import ks0.AbstractC22820a;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.C25271y;
import my2.AbstractC26034a;
import mz2.C26045d;
import nf3.C26669a;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26944e0;
import no0.C26954j0;
import nr0.C27072e;
import of3.InterfaceC27903a;
import org.joda.time.DateTime;
import org.joda.time.Days;
import ov2.C28402f;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p719m22.C24947b;
import py2.C29626a;
import py2.C29627b;
import py2.C29628c;
import py2.C29629d;
import py2.C29630e;
import py2.C29631f;
import py2.C29632g;
import py2.C29633h;
import py2.C29634i;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uf3.C34911a;
import yw2.C39830b;
import zr2.InterfaceC41070a;
import zw2.AbstractC41177a;
import zw2.C41178b;

/* JADX INFO: renamed from: oy2.e */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0002©\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ>\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00162\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0080@¢\u0006\u0004\b!\u0010\"J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u00162\u0006\u0010#\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b$\u0010%J \u0010(\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020 H\u0082@¢\u0006\u0004\b(\u0010)J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020 0\u00162\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020 0\u00162\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b.\u0010-J'\u00102\u001a\b\u0012\u0004\u0012\u00020 0\u00162\u0006\u00100\u001a\u00020/2\b\u00101\u001a\u0004\u0018\u00010/H\u0002¢\u0006\u0004\b2\u00103J.\u0010:\u001a\u0002092\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u00105\u001a\u0002042\f\u00108\u001a\b\u0012\u0004\u0012\u00020706H\u0082@¢\u0006\u0004\b:\u0010;J;\u0010=\u001a\b\u0012\u0004\u0012\u0002090\u00162\u0006\u0010<\u001a\u00020/2\u0006\u00105\u001a\u0002042\u0006\u0010\u001d\u001a\u00020\u001c2\f\u00108\u001a\b\u0012\u0004\u0012\u00020706H\u0002¢\u0006\u0004\b=\u0010>J%\u0010?\u001a\b\u0012\u0004\u0012\u00020 0\u00162\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/H\u0002¢\u0006\u0004\b?\u0010@J&\u0010C\u001a\u00020B2\u0006\u0010A\u001a\u00020/2\f\u00108\u001a\b\u0012\u0004\u0012\u00020706H\u0082@¢\u0006\u0004\bC\u0010DJ&\u0010F\u001a\u00020B2\u0006\u0010E\u001a\u00020/2\f\u00108\u001a\b\u0012\u0004\u0012\u00020706H\u0082@¢\u0006\u0004\bF\u0010DJ\u0018\u0010G\u001a\u00020\u00192\u0006\u00105\u001a\u000204H\u0082@¢\u0006\u0004\bG\u0010HJ%\u0010K\u001a\b\u0012\u0004\u0012\u00020 0\u00162\u0006\u00100\u001a\u00020/2\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bK\u0010LJ\u0010\u0010M\u001a\u00020 H\u0082@¢\u0006\u0004\bM\u0010NJ\u0010\u0010O\u001a\u00020 H\u0082@¢\u0006\u0004\bO\u0010NJ\u0018\u0010P\u001a\u00020 2\u0006\u00100\u001a\u00020/H\u0082@¢\u0006\u0004\bP\u0010QJ\u0010\u0010R\u001a\u00020 H\u0082@¢\u0006\u0004\bR\u0010NJ\u0018\u0010T\u001a\u00020 2\u0006\u0010S\u001a\u00020*H\u0082@¢\u0006\u0004\bT\u0010UJ\u0010\u0010V\u001a\u00020 H\u0082@¢\u0006\u0004\bV\u0010NJ'\u0010Y\u001a\u00020B2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010X\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\bY\u0010ZJ%\u0010_\u001a\u00020\u00192\u0006\u0010[\u001a\u00020\u00192\f\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\\H\u0002¢\u0006\u0004\b_\u0010`J\u0017\u0010a\u001a\u00020B2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\ba\u0010bJ\u0017\u0010c\u001a\u00020B2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\bc\u0010bJ\u0017\u0010d\u001a\u00020B2\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bd\u0010eJ\u0017\u0010f\u001a\u00020B2\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bf\u0010eJ\u001f\u0010h\u001a\u00020B2\u0006\u0010J\u001a\u00020I2\u0006\u0010g\u001a\u00020*H\u0002¢\u0006\u0004\bh\u0010iJ\u001d\u0010k\u001a\b\u0012\u0004\u0012\u00020 0\u00162\u0006\u0010j\u001a\u00020*H\u0002¢\u0006\u0004\bk\u0010-J\u001d\u0010m\u001a\b\u0012\u0004\u0012\u00020 0\u00162\u0006\u0010l\u001a\u00020*H\u0002¢\u0006\u0004\bm\u0010-J\u0018\u0010o\u001a\u00020B2\u0006\u0010n\u001a\u00020*H\u0082@¢\u0006\u0004\bo\u0010UJ-\u0010t\u001a\u00020\u00192\b\u0010q\u001a\u0004\u0018\u00010p2\u0012\u0010s\u001a\u000e\u0012\u0004\u0012\u00020p\u0012\u0004\u0012\u00020\u00190rH\u0002¢\u0006\u0004\bt\u0010uJ \u0010x\u001a\u00020B2\u0006\u0010v\u001a\u00020/2\u0006\u0010w\u001a\u00020/H\u0082@¢\u0006\u0004\bx\u0010yJ8\u0010}\u001a\u00020B2\u0006\u0010z\u001a\u00020/2\u0006\u0010{\u001a\u00020/2\u0006\u0010|\u001a\u00020/2\u0006\u0010v\u001a\u00020/2\u0006\u0010w\u001a\u00020/H\u0082@¢\u0006\u0004\b}\u0010~J\u001a\u0010\u0080\u0001\u001a\u00020 2\u0006\u0010\u007f\u001a\u00020/H\u0082@¢\u0006\u0005\b\u0080\u0001\u0010QR\u0016\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R&\u0010\u009a\u0001\u001a\u0011\u0012\u0005\u0012\u00030\u0096\u0001\u0012\u0005\u0012\u00030\u0097\u00010\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0018\u0010\u009e\u0001\u001a\u00030\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0018\u0010¢\u0001\u001a\u00030\u009f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u001d\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u00020 0\u00168\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0016\u00100\u001a\u00020/8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R\u0016\u00101\u001a\u00020/8BX\u0082\u0004¢\u0006\b\u001a\u0006\b¨\u0001\u0010§\u0001¨\u0006ª\u0001"}, m65681d2 = {"Loy2/e;", "Lof3/a;", "Lex2/c;", "labsRepository", "Lcom/whoop/whooplabs/a;", "serviceConnector", "Lbc3/c0;", "coroutineScope", "Lzr2/a;", "dateAndTimeProvider", "Loy2/f;", "logger", "Lex2/b;", "labsCampaignRepository", "Lzw2/b;", "analytics", "Lci2/b;", "whoopStrapProvider", "Lgt0/e;", "fwUpdateApi", "<init>", "(Lex2/c;Lcom/whoop/whooplabs/a;Lbc3/c0;Lzr2/a;Loy2/f;Lex2/b;Lzw2/b;Lci2/b;Lgt0/e;)V", "Lec3/l;", "Loy2/a;", "upstream", "Loy2/b;", "s0", "(Lec3/l;)Lec3/l;", "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;", "study", "Lcom/whoop/whooplabs/WhoopLabsService;", NotificationCompat.CATEGORY_SERVICE, "Loy2/l;", "m0", "(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Lex2/c;Lzw2/b;Lzr2/a;Lcom/whoop/whooplabs/WhoopLabsService;Lq83/d;)Ljava/lang/Object;", "action", "r0", "(Loy2/a;Lq83/d;)Ljava/lang/Object;", "Loy2/e$a;", "internalState", "w0", "(Loy2/e$a;Loy2/l;Lq83/d;)Ljava/lang/Object;", "", "address", "g0", "(Ljava/lang/String;)Lec3/l;", "O0", "", "campaignId", "sessionId", "a1", "(ILjava/lang/Integer;)Lec3/l;", "Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;", "remoteCampaign", "", "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;", "protocolStepResults", "Loy2/l$b;", "p0", "(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "currentStep", "b1", "(ILcom/whoop/whooplabs/data/room/entity/RemoteCampaign;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Ljava/util/List;)Lec3/l;", "t0", "(II)Lec3/l;", "currentProtocolStepNo", "Ll83/a0;", "Y0", "(ILjava/util/List;Lq83/d;)Ljava/lang/Object;", "stepNumber", "Z0", "h0", "(Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/whooplabs/data/domain/SurveyProvider;", "surveyProvider", "d1", "(ILcom/whoop/whooplabs/data/domain/SurveyProvider;)Lec3/l;", "e0", "(Lq83/d;)Ljava/lang/Object;", "o0", "i0", "(ILq83/d;)Ljava/lang/Object;", "l0", "comment", "f0", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "k0", "requiredRegex", "blockedRegex", "R0", "(Ljava/lang/String;Ljava/lang/String;)V", "domainState", "", "Lyw2/b;", "devices", "d0", "(Loy2/b;Ljava/util/List;)Loy2/b;", "U0", "(I)V", "T0", "W0", "(Lcom/whoop/whooplabs/data/domain/SurveyProvider;)V", "X0", "error", "V0", "(Lcom/whoop/whooplabs/data/domain/SurveyProvider;Ljava/lang/String;)V", "key", "v0", "value", "u0", "input", "Q0", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;", "config", "Lkotlin/Function1;", "onSuccess", "e1", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;Lkotlin/jvm/functions/Function1;)Loy2/b;", "hour", "minutes", "c1", "(IILq83/d;)Ljava/lang/Object;", "year", "month", "day", "j0", "(IIIIILq83/d;)Ljava/lang/Object;", "attempt", "P0", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lex2/c;", "x", "Lcom/whoop/whooplabs/a;", "y", "Lbc3/c0;", "z", "Lzr2/a;", "E", "Loy2/f;", "F", "Lex2/b;", "G", "Lzw2/b;", "H", "Lci2/b;", "I", "Lgt0/e;", "J", "Lcom/whoop/whooplabs/WhoopLabsService;", "", "Lcom/whoop/whooplabs/data/domain/ProtocolStepType;", "Loy2/m;", "K", "Ljava/util/Map;", "stepHandlers", "Lbc3/u;", "L", "Lbc3/u;", "scannerJob", "Lmz2/d;", "M", "Lmz2/d;", "scanner", "N", "Lec3/l;", "hrDevicesFlow", "n0", "()I", "q0", "a", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28479e implements InterfaceC27903a {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C28480f logger;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C13731b labsCampaignRepository;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C41178b analytics;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC16183e fwUpdateApi;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private WhoopLabsService service;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final Map<ProtocolStepType, InterfaceC28487m> stepHandlers;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC3061u scannerJob;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final C26045d scanner;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final InterfaceC13058l hrDevicesFlow;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C13732c labsRepository;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C10823a serviceConnector;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: oy2.e$a0 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor$retryConnectingBtHr$1", m100430f = "CampaignStepsInteractor.kt", m100431l = {552, 553, 562, 563, 566, 569}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Loy2/l;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a0 extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f115048F;

        /* JADX INFO: renamed from: w */
        Object f115049w;

        /* JADX INFO: renamed from: x */
        boolean f115050x;

        /* JADX INFO: renamed from: y */
        int f115051y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f115052z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(String str, InterfaceC30057d<? super a0> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f115048F = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a0 a0Var = C28479e.this.new a0(this.f115048F, interfaceC30057d);
            a0Var.f115052z = obj;
            return a0Var;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a0) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x005d  */
        /* JADX WARN: Code duplicated, block: B:20:0x0078  */
        /* JADX WARN: Code duplicated, block: B:23:0x008d  */
        /* JADX WARN: Code duplicated, block: B:25:0x0095  */
        /* JADX WARN: Code duplicated, block: B:28:0x00a5 A[PHI: r6
          0x00a5: PHI (r6v18 java.lang.Object) = (r6v17 java.lang.Object), (r6v0 java.lang.Object) binds: [B:26:0x00a2, B:7:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:30:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:33:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:38:0x00f4  */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00cc, code lost:
        
            if (r0.emit(r2, r5) == r1) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00ee, code lost:
        
            if (r0.emit(r2, r5) == r1) goto L35;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                Method dump skipped, instruction units count: 268
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: oy2.C28479e.a0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: oy2.e$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor", m100430f = "CampaignStepsInteractor.kt", m100431l = {757}, m100432m = "addCommentClicked", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f115053w;

        /* JADX INFO: renamed from: y */
        int f115055y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f115053w = obj;
            this.f115055y |= Integer.MIN_VALUE;
            return C28479e.this.m86654e0(this);
        }
    }

    /* JADX INFO: renamed from: oy2.e$b0 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor", m100430f = "CampaignStepsInteractor.kt", m100431l = {972}, m100432m = "retryWebView", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b0 extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        int f115056w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f115057x;

        /* JADX INFO: renamed from: z */
        int f115059z;

        public b0(InterfaceC30057d<? super b0> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f115057x = obj;
            this.f115059z |= Integer.MIN_VALUE;
            return C28479e.this.m86620P0(0, this);
        }
    }

    /* JADX INFO: renamed from: oy2.e$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor$btHrClicked$1", m100430f = "CampaignStepsInteractor.kt", m100431l = {537, 540, 543, 546}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Loy2/l;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f115060E;

        /* JADX INFO: renamed from: w */
        boolean f115061w;

        /* JADX INFO: renamed from: x */
        int f115062x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f115063y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f115060E = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C28479e.this.new c(this.f115060E, interfaceC30057d);
            cVar.f115063y = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0080  */
        /* JADX WARN: Code duplicated, block: B:29:0x009f  */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x009c, code lost:
        
            if (r0.emit(r2, r8) == r1) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00bb, code lost:
        
            if (r0.emit(r2, r8) == r1) goto L31;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 201
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: oy2.C28479e.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: oy2.e$c0 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor", m100430f = "CampaignStepsInteractor.kt", m100431l = {920, 921, 923}, m100432m = "saveInput", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c0 extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f115065E;

        /* JADX INFO: renamed from: G */
        int f115067G;

        /* JADX INFO: renamed from: w */
        Object f115068w;

        /* JADX INFO: renamed from: x */
        Object f115069x;

        /* JADX INFO: renamed from: y */
        Object f115070y;

        /* JADX INFO: renamed from: z */
        Object f115071z;

        public c0(InterfaceC30057d<? super c0> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f115065E = obj;
            this.f115067G |= Integer.MIN_VALUE;
            return C28479e.this.m86622Q0(null, this);
        }
    }

    /* JADX INFO: renamed from: oy2.e$d */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor", m100430f = "CampaignStepsInteractor.kt", m100431l = {729}, m100432m = "cancelStudy", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f115072w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f115073x;

        /* JADX INFO: renamed from: z */
        int f115075z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f115073x = obj;
            this.f115075z |= Integer.MIN_VALUE;
            return C28479e.this.m86661h0(null, this);
        }
    }

    /* JADX INFO: renamed from: oy2.e$d0 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor$setup$1", m100430f = "CampaignStepsInteractor.kt", m100431l = {575, 585, 588, 589, 591, 592, 602, 608, 616, 617, 620, 623, 633, 635, 637, 652, 654}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ldc3/u;", "Loy2/l;", "Ll83/a0;", "<anonymous>", "(Ldc3/u;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d0 extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        Object f115076E;

        /* JADX INFO: renamed from: F */
        Object f115077F;

        /* JADX INFO: renamed from: G */
        Object f115078G;

        /* JADX INFO: renamed from: H */
        Object f115079H;

        /* JADX INFO: renamed from: I */
        int f115080I;

        /* JADX INFO: renamed from: J */
        int f115081J;

        /* JADX INFO: renamed from: K */
        int f115082K;

        /* JADX INFO: renamed from: L */
        private /* synthetic */ Object f115083L;

        /* JADX INFO: renamed from: N */
        final /* synthetic */ int f115085N;

        /* JADX INFO: renamed from: O */
        final /* synthetic */ Integer f115086O;

        /* JADX INFO: renamed from: w */
        Object f115087w;

        /* JADX INFO: renamed from: x */
        Object f115088x;

        /* JADX INFO: renamed from: y */
        Object f115089y;

        /* JADX INFO: renamed from: z */
        Object f115090z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(int i13, Integer num, InterfaceC30057d<? super d0> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f115085N = i13;
            this.f115086O = num;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d0 d0Var = C28479e.this.new d0(this.f115085N, this.f115086O, interfaceC30057d);
            d0Var.f115083L = obj;
            return d0Var;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC11936u interfaceC11936u, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d0) create(interfaceC11936u, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:102:0x0411 A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:10:0x0040, B:15:0x005e, B:116:0x04ff, B:18:0x007f, B:113:0x04e2, B:21:0x00a0, B:109:0x04b1, B:24:0x00c7, B:100:0x0409, B:102:0x0411, B:105:0x045d, B:27:0x00fc, B:94:0x03d4, B:96:0x03df, B:120:0x052d, B:121:0x0534, B:30:0x012e, B:67:0x02cc, B:69:0x02de, B:71:0x02e4, B:74:0x0325, B:76:0x0333, B:90:0x038b, B:79:0x033d, B:80:0x0341, B:82:0x0347, B:84:0x0358, B:86:0x0362, B:33:0x0150, B:63:0x0294, B:36:0x0171, B:59:0x025e, B:39:0x0189, B:55:0x0237, B:40:0x0191, B:49:0x020f, B:51:0x0219, B:122:0x0535, B:123:0x053c, B:46:0x01d4), top: B:132:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:104:0x045b  */
        /* JADX WARN: Code duplicated, block: B:105:0x045d A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:10:0x0040, B:15:0x005e, B:116:0x04ff, B:18:0x007f, B:113:0x04e2, B:21:0x00a0, B:109:0x04b1, B:24:0x00c7, B:100:0x0409, B:102:0x0411, B:105:0x045d, B:27:0x00fc, B:94:0x03d4, B:96:0x03df, B:120:0x052d, B:121:0x0534, B:30:0x012e, B:67:0x02cc, B:69:0x02de, B:71:0x02e4, B:74:0x0325, B:76:0x0333, B:90:0x038b, B:79:0x033d, B:80:0x0341, B:82:0x0347, B:84:0x0358, B:86:0x0362, B:33:0x0150, B:63:0x0294, B:36:0x0171, B:59:0x025e, B:39:0x0189, B:55:0x0237, B:40:0x0191, B:49:0x020f, B:51:0x0219, B:122:0x0535, B:123:0x053c, B:46:0x01d4), top: B:132:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:107:0x04aa  */
        /* JADX WARN: Code duplicated, block: B:108:0x04ac  */
        /* JADX WARN: Code duplicated, block: B:111:0x04dd  */
        /* JADX WARN: Code duplicated, block: B:112:0x04df  */
        /* JADX WARN: Code duplicated, block: B:115:0x04fd  */
        /* JADX WARN: Code duplicated, block: B:116:0x04ff A[Catch: Exception -> 0x0045, PHI: r0 r4
          0x04ff: PHI (r0v53 int) = (r0v51 int), (r0v59 int) binds: [B:114:0x04fb, B:16:0x0061] A[DONT_GENERATE, DONT_INLINE]
          0x04ff: PHI (r4v61 java.lang.Object) = (r4v58 java.lang.Object), (r4v74 java.lang.Object) binds: [B:114:0x04fb, B:16:0x0061] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0045, blocks: (B:10:0x0040, B:15:0x005e, B:116:0x04ff, B:18:0x007f, B:113:0x04e2, B:21:0x00a0, B:109:0x04b1, B:24:0x00c7, B:100:0x0409, B:102:0x0411, B:105:0x045d, B:27:0x00fc, B:94:0x03d4, B:96:0x03df, B:120:0x052d, B:121:0x0534, B:30:0x012e, B:67:0x02cc, B:69:0x02de, B:71:0x02e4, B:74:0x0325, B:76:0x0333, B:90:0x038b, B:79:0x033d, B:80:0x0341, B:82:0x0347, B:84:0x0358, B:86:0x0362, B:33:0x0150, B:63:0x0294, B:36:0x0171, B:59:0x025e, B:39:0x0189, B:55:0x0237, B:40:0x0191, B:49:0x020f, B:51:0x0219, B:122:0x0535, B:123:0x053c, B:46:0x01d4), top: B:132:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:118:0x052a  */
        /* JADX WARN: Code duplicated, block: B:119:0x052b  */
        /* JADX WARN: Code duplicated, block: B:120:0x052d A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:10:0x0040, B:15:0x005e, B:116:0x04ff, B:18:0x007f, B:113:0x04e2, B:21:0x00a0, B:109:0x04b1, B:24:0x00c7, B:100:0x0409, B:102:0x0411, B:105:0x045d, B:27:0x00fc, B:94:0x03d4, B:96:0x03df, B:120:0x052d, B:121:0x0534, B:30:0x012e, B:67:0x02cc, B:69:0x02de, B:71:0x02e4, B:74:0x0325, B:76:0x0333, B:90:0x038b, B:79:0x033d, B:80:0x0341, B:82:0x0347, B:84:0x0358, B:86:0x0362, B:33:0x0150, B:63:0x0294, B:36:0x0171, B:59:0x025e, B:39:0x0189, B:55:0x0237, B:40:0x0191, B:49:0x020f, B:51:0x0219, B:122:0x0535, B:123:0x053c, B:46:0x01d4), top: B:132:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:122:0x0535 A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:10:0x0040, B:15:0x005e, B:116:0x04ff, B:18:0x007f, B:113:0x04e2, B:21:0x00a0, B:109:0x04b1, B:24:0x00c7, B:100:0x0409, B:102:0x0411, B:105:0x045d, B:27:0x00fc, B:94:0x03d4, B:96:0x03df, B:120:0x052d, B:121:0x0534, B:30:0x012e, B:67:0x02cc, B:69:0x02de, B:71:0x02e4, B:74:0x0325, B:76:0x0333, B:90:0x038b, B:79:0x033d, B:80:0x0341, B:82:0x0347, B:84:0x0358, B:86:0x0362, B:33:0x0150, B:63:0x0294, B:36:0x0171, B:59:0x025e, B:39:0x0189, B:55:0x0237, B:40:0x0191, B:49:0x020f, B:51:0x0219, B:122:0x0535, B:123:0x053c, B:46:0x01d4), top: B:132:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:133:0x038b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:134:0x0358 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:48:0x020d  */
        /* JADX WARN: Code duplicated, block: B:49:0x020f A[Catch: Exception -> 0x0045, PHI: r4
          0x020f: PHI (r4v20 java.lang.Object) = (r4v19 java.lang.Object), (r4v24 java.lang.Object) binds: [B:47:0x020b, B:41:0x0194] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0045, blocks: (B:10:0x0040, B:15:0x005e, B:116:0x04ff, B:18:0x007f, B:113:0x04e2, B:21:0x00a0, B:109:0x04b1, B:24:0x00c7, B:100:0x0409, B:102:0x0411, B:105:0x045d, B:27:0x00fc, B:94:0x03d4, B:96:0x03df, B:120:0x052d, B:121:0x0534, B:30:0x012e, B:67:0x02cc, B:69:0x02de, B:71:0x02e4, B:74:0x0325, B:76:0x0333, B:90:0x038b, B:79:0x033d, B:80:0x0341, B:82:0x0347, B:84:0x0358, B:86:0x0362, B:33:0x0150, B:63:0x0294, B:36:0x0171, B:59:0x025e, B:39:0x0189, B:55:0x0237, B:40:0x0191, B:49:0x020f, B:51:0x0219, B:122:0x0535, B:123:0x053c, B:46:0x01d4), top: B:132:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:51:0x0219 A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:10:0x0040, B:15:0x005e, B:116:0x04ff, B:18:0x007f, B:113:0x04e2, B:21:0x00a0, B:109:0x04b1, B:24:0x00c7, B:100:0x0409, B:102:0x0411, B:105:0x045d, B:27:0x00fc, B:94:0x03d4, B:96:0x03df, B:120:0x052d, B:121:0x0534, B:30:0x012e, B:67:0x02cc, B:69:0x02de, B:71:0x02e4, B:74:0x0325, B:76:0x0333, B:90:0x038b, B:79:0x033d, B:80:0x0341, B:82:0x0347, B:84:0x0358, B:86:0x0362, B:33:0x0150, B:63:0x0294, B:36:0x0171, B:59:0x025e, B:39:0x0189, B:55:0x0237, B:40:0x0191, B:49:0x020f, B:51:0x0219, B:122:0x0535, B:123:0x053c, B:46:0x01d4), top: B:132:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:53:0x0232  */
        /* JADX WARN: Code duplicated, block: B:54:0x0234  */
        /* JADX WARN: Code duplicated, block: B:57:0x0257  */
        /* JADX WARN: Code duplicated, block: B:58:0x0259  */
        /* JADX WARN: Code duplicated, block: B:61:0x0287  */
        /* JADX WARN: Code duplicated, block: B:62:0x0289  */
        /* JADX WARN: Code duplicated, block: B:65:0x02c4  */
        /* JADX WARN: Code duplicated, block: B:66:0x02c6  */
        /* JADX WARN: Code duplicated, block: B:69:0x02de A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:10:0x0040, B:15:0x005e, B:116:0x04ff, B:18:0x007f, B:113:0x04e2, B:21:0x00a0, B:109:0x04b1, B:24:0x00c7, B:100:0x0409, B:102:0x0411, B:105:0x045d, B:27:0x00fc, B:94:0x03d4, B:96:0x03df, B:120:0x052d, B:121:0x0534, B:30:0x012e, B:67:0x02cc, B:69:0x02de, B:71:0x02e4, B:74:0x0325, B:76:0x0333, B:90:0x038b, B:79:0x033d, B:80:0x0341, B:82:0x0347, B:84:0x0358, B:86:0x0362, B:33:0x0150, B:63:0x0294, B:36:0x0171, B:59:0x025e, B:39:0x0189, B:55:0x0237, B:40:0x0191, B:49:0x020f, B:51:0x0219, B:122:0x0535, B:123:0x053c, B:46:0x01d4), top: B:132:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:74:0x0325 A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:10:0x0040, B:15:0x005e, B:116:0x04ff, B:18:0x007f, B:113:0x04e2, B:21:0x00a0, B:109:0x04b1, B:24:0x00c7, B:100:0x0409, B:102:0x0411, B:105:0x045d, B:27:0x00fc, B:94:0x03d4, B:96:0x03df, B:120:0x052d, B:121:0x0534, B:30:0x012e, B:67:0x02cc, B:69:0x02de, B:71:0x02e4, B:74:0x0325, B:76:0x0333, B:90:0x038b, B:79:0x033d, B:80:0x0341, B:82:0x0347, B:84:0x0358, B:86:0x0362, B:33:0x0150, B:63:0x0294, B:36:0x0171, B:59:0x025e, B:39:0x0189, B:55:0x0237, B:40:0x0191, B:49:0x020f, B:51:0x0219, B:122:0x0535, B:123:0x053c, B:46:0x01d4), top: B:132:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:76:0x0333 A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:10:0x0040, B:15:0x005e, B:116:0x04ff, B:18:0x007f, B:113:0x04e2, B:21:0x00a0, B:109:0x04b1, B:24:0x00c7, B:100:0x0409, B:102:0x0411, B:105:0x045d, B:27:0x00fc, B:94:0x03d4, B:96:0x03df, B:120:0x052d, B:121:0x0534, B:30:0x012e, B:67:0x02cc, B:69:0x02de, B:71:0x02e4, B:74:0x0325, B:76:0x0333, B:90:0x038b, B:79:0x033d, B:80:0x0341, B:82:0x0347, B:84:0x0358, B:86:0x0362, B:33:0x0150, B:63:0x0294, B:36:0x0171, B:59:0x025e, B:39:0x0189, B:55:0x0237, B:40:0x0191, B:49:0x020f, B:51:0x0219, B:122:0x0535, B:123:0x053c, B:46:0x01d4), top: B:132:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:79:0x033d A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:10:0x0040, B:15:0x005e, B:116:0x04ff, B:18:0x007f, B:113:0x04e2, B:21:0x00a0, B:109:0x04b1, B:24:0x00c7, B:100:0x0409, B:102:0x0411, B:105:0x045d, B:27:0x00fc, B:94:0x03d4, B:96:0x03df, B:120:0x052d, B:121:0x0534, B:30:0x012e, B:67:0x02cc, B:69:0x02de, B:71:0x02e4, B:74:0x0325, B:76:0x0333, B:90:0x038b, B:79:0x033d, B:80:0x0341, B:82:0x0347, B:84:0x0358, B:86:0x0362, B:33:0x0150, B:63:0x0294, B:36:0x0171, B:59:0x025e, B:39:0x0189, B:55:0x0237, B:40:0x0191, B:49:0x020f, B:51:0x0219, B:122:0x0535, B:123:0x053c, B:46:0x01d4), top: B:132:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:82:0x0347 A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:10:0x0040, B:15:0x005e, B:116:0x04ff, B:18:0x007f, B:113:0x04e2, B:21:0x00a0, B:109:0x04b1, B:24:0x00c7, B:100:0x0409, B:102:0x0411, B:105:0x045d, B:27:0x00fc, B:94:0x03d4, B:96:0x03df, B:120:0x052d, B:121:0x0534, B:30:0x012e, B:67:0x02cc, B:69:0x02de, B:71:0x02e4, B:74:0x0325, B:76:0x0333, B:90:0x038b, B:79:0x033d, B:80:0x0341, B:82:0x0347, B:84:0x0358, B:86:0x0362, B:33:0x0150, B:63:0x0294, B:36:0x0171, B:59:0x025e, B:39:0x0189, B:55:0x0237, B:40:0x0191, B:49:0x020f, B:51:0x0219, B:122:0x0535, B:123:0x053c, B:46:0x01d4), top: B:132:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:86:0x0362 A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:10:0x0040, B:15:0x005e, B:116:0x04ff, B:18:0x007f, B:113:0x04e2, B:21:0x00a0, B:109:0x04b1, B:24:0x00c7, B:100:0x0409, B:102:0x0411, B:105:0x045d, B:27:0x00fc, B:94:0x03d4, B:96:0x03df, B:120:0x052d, B:121:0x0534, B:30:0x012e, B:67:0x02cc, B:69:0x02de, B:71:0x02e4, B:74:0x0325, B:76:0x0333, B:90:0x038b, B:79:0x033d, B:80:0x0341, B:82:0x0347, B:84:0x0358, B:86:0x0362, B:33:0x0150, B:63:0x0294, B:36:0x0171, B:59:0x025e, B:39:0x0189, B:55:0x0237, B:40:0x0191, B:49:0x020f, B:51:0x0219, B:122:0x0535, B:123:0x053c, B:46:0x01d4), top: B:132:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:88:0x0386  */
        /* JADX WARN: Code duplicated, block: B:89:0x0388 A[LOOP:0: B:80:0x0341->B:89:0x0388, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:92:0x03d1  */
        /* JADX WARN: Code duplicated, block: B:93:0x03d3  */
        /* JADX WARN: Code duplicated, block: B:96:0x03df A[Catch: Exception -> 0x0045, TryCatch #0 {Exception -> 0x0045, blocks: (B:10:0x0040, B:15:0x005e, B:116:0x04ff, B:18:0x007f, B:113:0x04e2, B:21:0x00a0, B:109:0x04b1, B:24:0x00c7, B:100:0x0409, B:102:0x0411, B:105:0x045d, B:27:0x00fc, B:94:0x03d4, B:96:0x03df, B:120:0x052d, B:121:0x0534, B:30:0x012e, B:67:0x02cc, B:69:0x02de, B:71:0x02e4, B:74:0x0325, B:76:0x0333, B:90:0x038b, B:79:0x033d, B:80:0x0341, B:82:0x0347, B:84:0x0358, B:86:0x0362, B:33:0x0150, B:63:0x0294, B:36:0x0171, B:59:0x025e, B:39:0x0189, B:55:0x0237, B:40:0x0191, B:49:0x020f, B:51:0x0219, B:122:0x0535, B:123:0x053c, B:46:0x01d4), top: B:132:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:98:0x0400  */
        /* JADX WARN: Code duplicated, block: B:99:0x0402  */
        /* JADX WARN: Code restructure failed: missing block: B:128:0x059e, code lost:
        
            if (wb3.AbstractC37056f.m118984h(r2, new ou1.C28376a(7), r19) == r3) goto L129;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:102:0x0411, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:105:0x045d, please report this as an issue */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 1484
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: oy2.C28479e.d0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: oy2.e$e */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor", m100430f = "CampaignStepsInteractor.kt", m100431l = {787}, m100432m = "cancelStudyClicked", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        int f115091w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f115092x;

        /* JADX INFO: renamed from: z */
        int f115094z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f115092x = obj;
            this.f115094z |= Integer.MIN_VALUE;
            return C28479e.this.m86663i0(0, this);
        }
    }

    /* JADX INFO: renamed from: oy2.e$e0 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor$showStep$1", m100430f = "CampaignStepsInteractor.kt", m100431l = {667, 668}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Loy2/l$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e0 extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        private /* synthetic */ Object f115095E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ RemoteCampaign f115096F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ int f115097G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ C28479e f115098H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ WhoopLabsStudy f115099I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ List<ProtocolStepResult> f115100J;

        /* JADX INFO: renamed from: w */
        Object f115101w;

        /* JADX INFO: renamed from: x */
        Object f115102x;

        /* JADX INFO: renamed from: y */
        Object f115103y;

        /* JADX INFO: renamed from: z */
        int f115104z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(RemoteCampaign remoteCampaign, int i13, C28479e c28479e, WhoopLabsStudy whoopLabsStudy, List<ProtocolStepResult> list, InterfaceC30057d<? super e0> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f115096F = remoteCampaign;
            this.f115097G = i13;
            this.f115098H = c28479e;
            this.f115099I = whoopLabsStudy;
            this.f115100J = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e0 e0Var = new e0(this.f115096F, this.f115097G, this.f115098H, this.f115099I, this.f115100J, interfaceC30057d);
            e0Var.f115095E = obj;
            return e0Var;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e0) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0084, code lost:
        
            if (r0.emit(r2, r8) == r1) goto L17;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f115095E
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r8.f115104z
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L35
                if (r2 == r4) goto L29
                if (r2 != r3) goto L21
                java.lang.Object r0 = r8.f115103y
                oy2.b$f r0 = (oy2.InterfaceC28476b.f) r0
                java.lang.Object r0 = r8.f115102x
                oy2.m r0 = (oy2.InterfaceC28487m) r0
                java.lang.Object r0 = r8.f115101w
                com.whoop.whooplabs.data.domain.ProtocolStepWithOptions r0 = (com.whoop.whooplabs.data.domain.ProtocolStepWithOptions) r0
                p505ts.AbstractC34132o.m107864I(r9)
                goto L87
            L21:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L29:
                java.lang.Object r2 = r8.f115102x
                oy2.m r2 = (oy2.InterfaceC28487m) r2
                java.lang.Object r2 = r8.f115101w
                com.whoop.whooplabs.data.domain.ProtocolStepWithOptions r2 = (com.whoop.whooplabs.data.domain.ProtocolStepWithOptions) r2
                p505ts.AbstractC34132o.m107864I(r9)
                goto L6f
            L35:
                p505ts.AbstractC34132o.m107864I(r9)
                com.whoop.whooplabs.data.room.entity.RemoteCampaign r9 = r8.f115096F
                java.util.List r9 = r9.getProtocolSteps()
                int r2 = r8.f115097G
                java.lang.Object r9 = r9.get(r2)
                com.whoop.whooplabs.data.domain.ProtocolStepWithOptions r9 = (com.whoop.whooplabs.data.domain.ProtocolStepWithOptions) r9
                oy2.e r2 = r8.f115098H
                java.util.Map r2 = oy2.C28479e.m86613M(r2)
                com.whoop.whooplabs.data.domain.ProtocolStep r6 = r9.getProtocolStep()
                com.whoop.whooplabs.data.domain.ProtocolStepType r6 = r6.getStepType()
                java.lang.Object r2 = r2.get(r6)
                oy2.m r2 = (oy2.InterfaceC28487m) r2
                if (r2 == 0) goto L8a
                com.whoop.whooplabs.data.room.entity.WhoopLabsStudy r6 = r8.f115099I
                java.util.List<com.whoop.whooplabs.data.room.entity.ProtocolStepResult> r7 = r8.f115100J
                r8.f115095E = r0
                r8.f115101w = r5
                r8.f115102x = r5
                r8.f115104z = r4
                java.lang.Object r9 = r2.mo86773a(r9, r6, r7, r8)
                if (r9 != r1) goto L6f
                goto L86
            L6f:
                oy2.b$f r9 = (oy2.InterfaceC28476b.f) r9
                oy2.l$b r2 = new oy2.l$b
                r2.<init>(r9)
                r8.f115095E = r5
                r8.f115101w = r5
                r8.f115102x = r5
                r8.f115103y = r5
                r8.f115104z = r3
                java.lang.Object r9 = r0.emit(r2, r8)
                if (r9 != r1) goto L87
            L86:
                return r1
            L87:
                l83.a0 r9 = l83.C23454a0.f92919a
                return r9
            L8a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                com.whoop.whooplabs.data.domain.ProtocolStep r9 = r9.getProtocolStep()
                com.whoop.whooplabs.data.domain.ProtocolStepType r9 = r9.getStepType()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "No handler found for step type: "
                r1.<init>(r2)
                r1.append(r9)
                java.lang.String r9 = r1.toString()
                java.lang.String r9 = r9.toString()
                r0.<init>(r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: oy2.C28479e.e0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: oy2.e$f */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor", m100430f = "CampaignStepsInteractor.kt", m100431l = {956, 957, 962}, m100432m = "dateTimeChanged", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f115105E;

        /* JADX INFO: renamed from: F */
        int f115106F;

        /* JADX INFO: renamed from: G */
        Object f115107G;

        /* JADX INFO: renamed from: H */
        Object f115108H;

        /* JADX INFO: renamed from: I */
        Object f115109I;

        /* JADX INFO: renamed from: J */
        Object f115110J;

        /* JADX INFO: renamed from: K */
        Object f115111K;

        /* JADX INFO: renamed from: L */
        /* synthetic */ Object f115112L;

        /* JADX INFO: renamed from: N */
        int f115114N;

        /* JADX INFO: renamed from: w */
        int f115115w;

        /* JADX INFO: renamed from: x */
        int f115116x;

        /* JADX INFO: renamed from: y */
        int f115117y;

        /* JADX INFO: renamed from: z */
        int f115118z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f115112L = obj;
            this.f115114N |= Integer.MIN_VALUE;
            return C28479e.this.m86665j0(0, 0, 0, 0, 0, this);
        }
    }

    /* JADX INFO: renamed from: oy2.e$f0 */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f0 implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f115119w;

        /* JADX INFO: renamed from: oy2.e$f0$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f115120w;

            /* JADX INFO: renamed from: oy2.e$f0$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor$special$$inlined$map$1$2", m100430f = "CampaignStepsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42147a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f115121E;

                /* JADX INFO: renamed from: F */
                Object f115122F;

                /* JADX INFO: renamed from: G */
                Object f115123G;

                /* JADX INFO: renamed from: H */
                int f115124H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f115125w;

                /* JADX INFO: renamed from: x */
                int f115126x;

                /* JADX INFO: renamed from: y */
                Object f115127y;

                public C42147a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f115125w = obj;
                    this.f115126x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f115120w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42147a c42147a;
                if (interfaceC30057d instanceof C42147a) {
                    c42147a = (C42147a) interfaceC30057d;
                    int i13 = c42147a.f115126x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42147a.f115126x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42147a = new C42147a(interfaceC30057d);
                    }
                } else {
                    c42147a = new C42147a(interfaceC30057d);
                }
                Object obj2 = c42147a.f115125w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42147a.f115126x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f115120w;
                    AbstractC28486l.p pVar = new AbstractC28486l.p((List) obj);
                    c42147a.f115127y = null;
                    c42147a.f115121E = null;
                    c42147a.f115122F = null;
                    c42147a.f115123G = null;
                    c42147a.f115124H = 0;
                    c42147a.f115126x = 1;
                    if (interfaceC13062m.emit(pVar, c42147a) == enumC31071a) {
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

        public f0(InterfaceC13058l interfaceC13058l) {
            this.f115119w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f115119w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: oy2.e$g */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor", m100430f = "CampaignStepsInteractor.kt", m100431l = {820}, m100432m = "dismissCancelScreen", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f115129w;

        /* JADX INFO: renamed from: y */
        int f115131y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f115129w = obj;
            this.f115131y |= Integer.MIN_VALUE;
            return C28479e.this.m86667k0(this);
        }
    }

    /* JADX INFO: renamed from: oy2.e$g0 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor", m100430f = "CampaignStepsInteractor.kt", m100431l = {942, 943, 946}, m100432m = "timePickerChanged", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g0 extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f115132E;

        /* JADX INFO: renamed from: F */
        Object f115133F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f115134G;

        /* JADX INFO: renamed from: I */
        int f115136I;

        /* JADX INFO: renamed from: w */
        int f115137w;

        /* JADX INFO: renamed from: x */
        int f115138x;

        /* JADX INFO: renamed from: y */
        int f115139y;

        /* JADX INFO: renamed from: z */
        Object f115140z;

        public g0(InterfaceC30057d<? super g0> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f115134G = obj;
            this.f115136I |= Integer.MIN_VALUE;
            return C28479e.this.m86649c1(0, 0, this);
        }
    }

    /* JADX INFO: renamed from: oy2.e$h */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor", m100430f = "CampaignStepsInteractor.kt", m100431l = {803}, m100432m = "dismissDialogs", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f115141w;

        /* JADX INFO: renamed from: y */
        int f115143y;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f115141w = obj;
            this.f115143y |= Integer.MIN_VALUE;
            return C28479e.this.m86669l0(this);
        }
    }

    /* JADX INFO: renamed from: oy2.e$h0 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor$webViewSubmitted$1", m100430f = "CampaignStepsInteractor.kt", m100431l = {735, 736, 744, 749}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Loy2/l;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h0 extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        private /* synthetic */ Object f115144E;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ int f115146G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ SurveyProvider f115147H;

        /* JADX INFO: renamed from: w */
        Object f115148w;

        /* JADX INFO: renamed from: x */
        Object f115149x;

        /* JADX INFO: renamed from: y */
        Object f115150y;

        /* JADX INFO: renamed from: z */
        int f115151z;

        /* JADX INFO: renamed from: oy2.e$h0$a */
        @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor$webViewSubmitted$1$1", m100430f = "CampaignStepsInteractor.kt", m100431l = {740}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f115152w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C28479e f115153x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ ProtocolStepResult f115154y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C28479e c28479e, ProtocolStepResult protocolStepResult, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f115153x = c28479e;
                this.f115154y = protocolStepResult;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f115153x, this.f115154y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f115152w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C13732c c13732c = this.f115153x.labsRepository;
                    ProtocolStepResult protocolStepResult = this.f115154y;
                    this.f115152w = 1;
                    if (c13732c.m39003w(protocolStepResult, this) == enumC31071a) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(int i13, SurveyProvider surveyProvider, InterfaceC30057d<? super h0> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f115146G = i13;
            this.f115147H = surveyProvider;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h0 h0Var = C28479e.this.new h0(this.f115146G, this.f115147H, interfaceC30057d);
            h0Var.f115144E = obj;
            return h0Var;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h0) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x00ef, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r2, r0, r24) == r3) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0123, code lost:
        
            if (r2.emit(r0, r24) == r3) goto L32;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instruction units count: 297
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: oy2.C28479e.h0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: oy2.e$i */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor$endStudy$2", m100430f = "CampaignStepsInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lec3/l;", "Loy2/l;", "<anonymous>", "(Lbc3/c0;)Lec3/l;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ WhoopLabsService f115155E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C41178b f115156F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC41070a f115157G;

        /* JADX INFO: renamed from: w */
        int f115158w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ WhoopLabsStudy f115159x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C13732c f115160y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C28479e f115161z;

        /* JADX INFO: renamed from: oy2.e$i$a */
        @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor$endStudy$2$1", m100430f = "CampaignStepsInteractor.kt", m100431l = {995, AbstractC1848z0.MAX_BIND_PARAMETER_CNT, 1002, 1003, MessageListItemViewType.CUSTOM_ATTACHMENTS, 1019, 1035, 1041}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Loy2/l;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            int f115162E;

            /* JADX INFO: renamed from: F */
            boolean f115163F;

            /* JADX INFO: renamed from: G */
            int f115164G;

            /* JADX INFO: renamed from: H */
            private /* synthetic */ Object f115165H;

            /* JADX INFO: renamed from: I */
            final /* synthetic */ WhoopLabsStudy f115166I;

            /* JADX INFO: renamed from: J */
            final /* synthetic */ C13732c f115167J;

            /* JADX INFO: renamed from: K */
            final /* synthetic */ C28479e f115168K;

            /* JADX INFO: renamed from: L */
            final /* synthetic */ WhoopLabsService f115169L;

            /* JADX INFO: renamed from: M */
            final /* synthetic */ C41178b f115170M;

            /* JADX INFO: renamed from: N */
            final /* synthetic */ InterfaceC41070a f115171N;

            /* JADX INFO: renamed from: w */
            Object f115172w;

            /* JADX INFO: renamed from: x */
            Object f115173x;

            /* JADX INFO: renamed from: y */
            Object f115174y;

            /* JADX INFO: renamed from: z */
            Object f115175z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WhoopLabsStudy whoopLabsStudy, C13732c c13732c, C28479e c28479e, WhoopLabsService whoopLabsService, C41178b c41178b, InterfaceC41070a interfaceC41070a, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f115166I = whoopLabsStudy;
                this.f115167J = c13732c;
                this.f115168K = c28479e;
                this.f115169L = whoopLabsService;
                this.f115170M = c41178b;
                this.f115171N = interfaceC41070a;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f115166I, this.f115167J, this.f115168K, this.f115169L, this.f115170M, this.f115171N, interfaceC30057d);
                aVar.f115165H = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code duplicated, block: B:35:0x00d8  */
            /* JADX WARN: Code duplicated, block: B:36:0x00da A[Catch: Exception -> 0x0091, PHI: r6 r10 r11
              0x00da: PHI (r6v7 int) = (r6v6 int), (r6v9 int) binds: [B:34:0x00d6, B:25:0x008e] A[DONT_GENERATE, DONT_INLINE]
              0x00da: PHI (r10v2 com.whoop.whooplabs.data.room.entity.WhoopLabsStudy) = 
              (r10v1 com.whoop.whooplabs.data.room.entity.WhoopLabsStudy)
              (r10v4 com.whoop.whooplabs.data.room.entity.WhoopLabsStudy)
             binds: [B:34:0x00d6, B:25:0x008e] A[DONT_GENERATE, DONT_INLINE]
              0x00da: PHI (r11v3 java.lang.Object) = (r11v2 java.lang.Object), (r11v11 java.lang.Object) binds: [B:34:0x00d6, B:25:0x008e] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {Exception -> 0x0091, blocks: (B:24:0x008b, B:36:0x00da, B:38:0x00e9, B:40:0x00f4, B:33:0x00c7), top: B:70:0x0014 }] */
            /* JADX WARN: Code duplicated, block: B:38:0x00e9 A[Catch: Exception -> 0x0091, TryCatch #2 {Exception -> 0x0091, blocks: (B:24:0x008b, B:36:0x00da, B:38:0x00e9, B:40:0x00f4, B:33:0x00c7), top: B:70:0x0014 }] */
            /* JADX WARN: Code duplicated, block: B:39:0x00f3  */
            /* JADX WARN: Code duplicated, block: B:43:0x0126  */
            /* JADX WARN: Code duplicated, block: B:46:0x013d  */
            /* JADX WARN: Code duplicated, block: B:47:0x013f A[Catch: Exception -> 0x005b, PHI: r3 r6
              0x013f: PHI (r3v9 int) = (r3v7 int), (r3v10 int) binds: [B:45:0x013b, B:18:0x006d] A[DONT_GENERATE, DONT_INLINE]
              0x013f: PHI (r6v13 java.lang.Integer) = (r6v10 java.lang.Integer), (r6v15 java.lang.Integer) binds: [B:45:0x013b, B:18:0x006d] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x005b, blocks: (B:13:0x0054, B:50:0x0156, B:53:0x016c, B:55:0x0189, B:56:0x01d0, B:59:0x01eb, B:61:0x0208, B:62:0x024f, B:18:0x006d, B:47:0x013f, B:21:0x0080, B:44:0x0128), top: B:70:0x0014 }] */
            /* JADX WARN: Code duplicated, block: B:49:0x0154  */
            /* JADX WARN: Code duplicated, block: B:50:0x0156 A[Catch: Exception -> 0x005b, PHI: r3 r6 r10
              0x0156: PHI (r3v11 int) = (r3v9 int), (r3v12 int) binds: [B:48:0x0152, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]
              0x0156: PHI (r6v16 java.lang.Integer) = (r6v13 java.lang.Integer), (r6v18 java.lang.Integer) binds: [B:48:0x0152, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE]
              0x0156: PHI (r10v17 java.lang.Object) = (r10v12 java.lang.Object), (r10v24 java.lang.Object) binds: [B:48:0x0152, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x005b, blocks: (B:13:0x0054, B:50:0x0156, B:53:0x016c, B:55:0x0189, B:56:0x01d0, B:59:0x01eb, B:61:0x0208, B:62:0x024f, B:18:0x006d, B:47:0x013f, B:21:0x0080, B:44:0x0128), top: B:70:0x0014 }] */
            /* JADX WARN: Code duplicated, block: B:53:0x016c A[Catch: Exception -> 0x005b, TRY_ENTER, TryCatch #0 {Exception -> 0x005b, blocks: (B:13:0x0054, B:50:0x0156, B:53:0x016c, B:55:0x0189, B:56:0x01d0, B:59:0x01eb, B:61:0x0208, B:62:0x024f, B:18:0x006d, B:47:0x013f, B:21:0x0080, B:44:0x0128), top: B:70:0x0014 }] */
            /* JADX WARN: Code duplicated, block: B:55:0x0189 A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:13:0x0054, B:50:0x0156, B:53:0x016c, B:55:0x0189, B:56:0x01d0, B:59:0x01eb, B:61:0x0208, B:62:0x024f, B:18:0x006d, B:47:0x013f, B:21:0x0080, B:44:0x0128), top: B:70:0x0014 }] */
            /* JADX WARN: Code duplicated, block: B:58:0x01e9  */
            /* JADX WARN: Code duplicated, block: B:59:0x01eb A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:13:0x0054, B:50:0x0156, B:53:0x016c, B:55:0x0189, B:56:0x01d0, B:59:0x01eb, B:61:0x0208, B:62:0x024f, B:18:0x006d, B:47:0x013f, B:21:0x0080, B:44:0x0128), top: B:70:0x0014 }] */
            /* JADX WARN: Code duplicated, block: B:61:0x0208 A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:13:0x0054, B:50:0x0156, B:53:0x016c, B:55:0x0189, B:56:0x01d0, B:59:0x01eb, B:61:0x0208, B:62:0x024f, B:18:0x006d, B:47:0x013f, B:21:0x0080, B:44:0x0128), top: B:70:0x0014 }] */
            /* JADX WARN: Code restructure failed: missing block: B:63:0x0266, code lost:
            
                if (r4.emit(r0, r22) == r5) goto L67;
             */
            /* JADX WARN: Code restructure failed: missing block: B:66:0x028a, code lost:
            
                if (r4.emit(r0, r22) == r5) goto L67;
             */
            /* JADX WARN: Instruction removed from duplicated block: B:53:0x016c, please report this as an issue */
            /* JADX WARN: Instruction removed from duplicated block: B:59:0x01eb, please report this as an issue */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r23) {
                /*
                    Method dump skipped, instruction units count: 678
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: oy2.C28479e.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(WhoopLabsStudy whoopLabsStudy, C13732c c13732c, C28479e c28479e, WhoopLabsService whoopLabsService, C41178b c41178b, InterfaceC41070a interfaceC41070a, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f115159x = whoopLabsStudy;
            this.f115160y = c13732c;
            this.f115161z = c28479e;
            this.f115155E = whoopLabsService;
            this.f115156F = c41178b;
            this.f115157G = interfaceC41070a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new i(this.f115159x, this.f115160y, this.f115161z, this.f115155E, this.f115156F, this.f115157G, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
            return ((i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f115158w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return new C13084s1(new a(this.f115159x, this.f115160y, this.f115161z, this.f115155E, this.f115156F, this.f115157G, null));
        }
    }

    /* JADX INFO: renamed from: oy2.e$j */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor", m100430f = "CampaignStepsInteractor.kt", m100431l = {769, 770, 771, 777}, m100432m = "getCurrentDomainStep", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f115176E;

        /* JADX INFO: renamed from: G */
        int f115178G;

        /* JADX INFO: renamed from: w */
        Object f115179w;

        /* JADX INFO: renamed from: x */
        Object f115180x;

        /* JADX INFO: renamed from: y */
        Object f115181y;

        /* JADX INFO: renamed from: z */
        Object f115182z;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f115176E = obj;
            this.f115178G |= Integer.MIN_VALUE;
            return C28479e.this.m86674o0(this);
        }
    }

    /* JADX INFO: renamed from: oy2.e$k */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor$getCurrentDomainStep$2", m100430f = "CampaignStepsInteractor.kt", m100431l = {775}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f115183w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ ProtocolStepResult f115185y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ProtocolStepResult protocolStepResult, InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f115185y = protocolStepResult;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C28479e.this.new k(this.f115185y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f115183w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13732c c13732c = C28479e.this.labsRepository;
                ProtocolStepResult protocolStepResult = this.f115185y;
                this.f115183w = 1;
                if (c13732c.m39003w(protocolStepResult, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: oy2.e$l */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor", m100430f = "CampaignStepsInteractor.kt", m100431l = {659, 660}, m100432m = "getCurrentState", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f115186E;

        /* JADX INFO: renamed from: G */
        int f115188G;

        /* JADX INFO: renamed from: w */
        Object f115189w;

        /* JADX INFO: renamed from: x */
        Object f115190x;

        /* JADX INFO: renamed from: y */
        Object f115191y;

        /* JADX INFO: renamed from: z */
        int f115192z;

        public l(InterfaceC30057d<? super l> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f115186E = obj;
            this.f115188G |= Integer.MIN_VALUE;
            return C28479e.this.m86676p0(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: oy2.e$m */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor", m100430f = "CampaignStepsInteractor.kt", m100431l = {123, 124, 125, 127, 130, 131, 158}, m100432m = "handleAction", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f115193w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f115194x;

        /* JADX INFO: renamed from: z */
        int f115196z;

        public m(InterfaceC30057d<? super m> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f115194x = obj;
            this.f115196z |= Integer.MIN_VALUE;
            return C28479e.this.m86680r0(null, this);
        }
    }

    /* JADX INFO: renamed from: oy2.e$n */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor$handleAction$2", m100430f = "CampaignStepsInteractor.kt", m100431l = {120}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Loy2/l;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class n extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f115197w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f115198x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC28475a f115200z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(AbstractC28475a abstractC28475a, InterfaceC30057d<? super n> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f115200z = abstractC28475a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            n nVar = C28479e.this.new n(this.f115200z, interfaceC30057d);
            nVar.f115198x = obj;
            return nVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((n) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f115198x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f115197w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C28479e c28479e = C28479e.this;
                InterfaceC13058l interfaceC13058lM86652d1 = c28479e.m86652d1(c28479e.m86672n0(), ((AbstractC28475a.b0) this.f115200z).getSurveyProvider());
                this.f115198x = null;
                this.f115197w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM86652d1, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: oy2.e$o */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor$handleAction$3", m100430f = "CampaignStepsInteractor.kt", m100431l = {147, 148}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Loy2/l;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class o extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f115201w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f115202x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC28475a f115204z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(AbstractC28475a abstractC28475a, InterfaceC30057d<? super o> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f115204z = abstractC28475a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            o oVar = C28479e.this.new o(this.f115204z, interfaceC30057d);
            oVar.f115202x = obj;
            return oVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((o) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f115202x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f115201w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r7)
                goto L61
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1c:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L40
            L20:
                p505ts.AbstractC34132o.m107864I(r7)
                oy2.e r7 = oy2.C28479e.this
                oy2.a r2 = r6.f115204z
                oy2.a$a0 r2 = (oy2.AbstractC28475a.a0) r2
                int r2 = r2.getHour()
                oy2.a r5 = r6.f115204z
                oy2.a$a0 r5 = (oy2.AbstractC28475a.a0) r5
                int r5 = r5.getMinutes()
                r6.f115202x = r0
                r6.f115201w = r4
                java.lang.Object r7 = oy2.C28479e.m86645b0(r7, r2, r5, r6)
                if (r7 != r1) goto L40
                goto L60
            L40:
                oy2.l$c0 r7 = new oy2.l$c0
                oy2.a r2 = r6.f115204z
                oy2.a$a0 r2 = (oy2.AbstractC28475a.a0) r2
                int r2 = r2.getHour()
                oy2.a r4 = r6.f115204z
                oy2.a$a0 r4 = (oy2.AbstractC28475a.a0) r4
                int r4 = r4.getMinutes()
                r7.<init>(r2, r4)
                r2 = 0
                r6.f115202x = r2
                r6.f115201w = r3
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L61
            L60:
                return r1
            L61:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: oy2.C28479e.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: oy2.e$p */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor$handleAction$4", m100430f = "CampaignStepsInteractor.kt", m100431l = {154, 155}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ldc3/u;", "Loy2/l;", "Ll83/a0;", "<anonymous>", "(Ldc3/u;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class p extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f115205w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f115206x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC28475a f115208z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(AbstractC28475a abstractC28475a, InterfaceC30057d<? super p> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f115208z = abstractC28475a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            p pVar = C28479e.this.new p(this.f115208z, interfaceC30057d);
            pVar.f115206x = obj;
            return pVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC11936u interfaceC11936u, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((p) create(interfaceC11936u, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x00a3, code lost:
        
            if (((dc3.C11935t) r7).f39041z.mo32219t(r10, r17) == r8) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r6 = r17
                java.lang.Object r0 = r6.f115206x
                r7 = r0
                dc3.u r7 = (dc3.InterfaceC11936u) r7
                r83.a r8 = r83.EnumC31071a.f128113w
                int r0 = r6.f115205w
                r9 = 2
                r1 = 1
                if (r0 == 0) goto L24
                if (r0 == r1) goto L20
                if (r0 != r9) goto L18
                p505ts.AbstractC34132o.m107864I(r18)
                goto La6
            L18:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L20:
                p505ts.AbstractC34132o.m107864I(r18)
                goto L61
            L24:
                p505ts.AbstractC34132o.m107864I(r18)
                oy2.e r0 = oy2.C28479e.this
                oy2.a r2 = r6.f115208z
                oy2.a$g r2 = (oy2.AbstractC28475a.g) r2
                int r2 = r2.getYear()
                oy2.a r3 = r6.f115208z
                oy2.a$g r3 = (oy2.AbstractC28475a.g) r3
                int r3 = r3.getMonth()
                oy2.a r4 = r6.f115208z
                oy2.a$g r4 = (oy2.AbstractC28475a.g) r4
                int r4 = r4.getDay()
                oy2.a r5 = r6.f115208z
                oy2.a$g r5 = (oy2.AbstractC28475a.g) r5
                int r5 = r5.getHour()
                oy2.a r10 = r6.f115208z
                oy2.a$g r10 = (oy2.AbstractC28475a.g) r10
                int r10 = r10.getMinutes()
                r6.f115206x = r7
                r6.f115205w = r1
                r1 = r2
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r10
                java.lang.Object r0 = oy2.C28479e.m86686v(r0, r1, r2, r3, r4, r5, r6)
                if (r0 != r8) goto L61
                goto La5
            L61:
                oy2.l$e r10 = new oy2.l$e
                oy2.a r0 = r6.f115208z
                oy2.a$g r0 = (oy2.AbstractC28475a.g) r0
                int r11 = r0.getYear()
                oy2.a r0 = r6.f115208z
                oy2.a$g r0 = (oy2.AbstractC28475a.g) r0
                int r12 = r0.getMonth()
                oy2.a r0 = r6.f115208z
                oy2.a$g r0 = (oy2.AbstractC28475a.g) r0
                int r13 = r0.getDay()
                oy2.a r0 = r6.f115208z
                oy2.a$g r0 = (oy2.AbstractC28475a.g) r0
                int r14 = r0.getHour()
                oy2.a r0 = r6.f115208z
                oy2.a$g r0 = (oy2.AbstractC28475a.g) r0
                int r15 = r0.getMinutes()
                oy2.a r0 = r6.f115208z
                oy2.a$g r0 = (oy2.AbstractC28475a.g) r0
                boolean r16 = r0.getIsUserInteraction()
                r10.<init>(r11, r12, r13, r14, r15, r16)
                r0 = 0
                r6.f115206x = r0
                r6.f115205w = r9
                dc3.t r7 = (dc3.C11935t) r7
                dc3.h r0 = r7.f39041z
                java.lang.Object r0 = r0.mo32219t(r10, r6)
                if (r0 != r8) goto La6
            La5:
                return r8
            La6:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: oy2.C28479e.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: oy2.e$q */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor$interact$$inlined$flatMapLatest$1", m100430f = "CampaignStepsInteractor.kt", m100431l = {190, 189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class q extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        Object f115209E;

        /* JADX INFO: renamed from: F */
        Object f115210F;

        /* JADX INFO: renamed from: G */
        Object f115211G;

        /* JADX INFO: renamed from: H */
        int f115212H;

        /* JADX INFO: renamed from: w */
        int f115213w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f115214x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f115215y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C28479e f115216z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(InterfaceC30057d interfaceC30057d, C28479e c28479e) {
            super(3, interfaceC30057d);
            this.f115216z = c28479e;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC28475a abstractC28475a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            q qVar = new q(interfaceC30057d, this.f115216z);
            qVar.f115214x = interfaceC13062m;
            qVar.f115215y = abstractC28475a;
            return qVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r1, (ec3.InterfaceC13058l) r8, r7) == r0) goto L15;
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
                int r1 = r7.f115213w
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L31
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r7.f115214x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r8)
                goto L6a
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                java.lang.Object r1 = r7.f115211G
                oy2.a r1 = (oy2.AbstractC28475a) r1
                java.lang.Object r1 = r7.f115210F
                q83.d r1 = (q83.InterfaceC30057d) r1
                java.lang.Object r1 = r7.f115209E
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                java.lang.Object r3 = r7.f115214x
                ec3.m r3 = (ec3.InterfaceC13062m) r3
                p505ts.AbstractC34132o.m107864I(r8)
                goto L55
            L31:
                p505ts.AbstractC34132o.m107864I(r8)
                java.lang.Object r8 = r7.f115214x
                r1 = r8
                ec3.m r1 = (ec3.InterfaceC13062m) r1
                java.lang.Object r8 = r7.f115215y
                oy2.a r8 = (oy2.AbstractC28475a) r8
                oy2.e r5 = r7.f115216z
                r7.f115214x = r4
                r7.f115215y = r4
                r7.f115209E = r1
                r7.f115210F = r4
                r7.f115211G = r4
                r6 = 0
                r7.f115212H = r6
                r7.f115213w = r3
                java.lang.Object r8 = oy2.C28479e.m86617O(r5, r8, r7)
                if (r8 != r0) goto L55
                goto L69
            L55:
                ec3.l r8 = (ec3.InterfaceC13058l) r8
                r7.f115214x = r4
                r7.f115215y = r4
                r7.f115209E = r4
                r7.f115210F = r4
                r7.f115211G = r4
                r7.f115213w = r2
                java.lang.Object r8 = ec3.AbstractC13091v.m36613w(r1, r8, r7)
                if (r8 != r0) goto L6a
            L69:
                return r0
            L6a:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: oy2.C28479e.q.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC28475a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: oy2.e$r */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f115217w;

        /* JADX INFO: renamed from: oy2.e$r$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f115218w;

            /* JADX INFO: renamed from: oy2.e$r$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor$interact$$inlined$map$1$2", m100430f = "CampaignStepsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42148a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f115219E;

                /* JADX INFO: renamed from: F */
                Object f115220F;

                /* JADX INFO: renamed from: G */
                Object f115221G;

                /* JADX INFO: renamed from: H */
                int f115222H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f115223w;

                /* JADX INFO: renamed from: x */
                int f115224x;

                /* JADX INFO: renamed from: y */
                Object f115225y;

                public C42148a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f115223w = obj;
                    this.f115224x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f115218w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42148a c42148a;
                if (interfaceC30057d instanceof C42148a) {
                    c42148a = (C42148a) interfaceC30057d;
                    int i13 = c42148a.f115224x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42148a.f115224x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42148a = new C42148a(interfaceC30057d);
                    }
                } else {
                    c42148a = new C42148a(interfaceC30057d);
                }
                Object obj2 = c42148a.f115223w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42148a.f115224x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f115218w;
                    InterfaceC28476b domainState = ((a) obj).getDomainState();
                    c42148a.f115225y = null;
                    c42148a.f115219E = null;
                    c42148a.f115220F = null;
                    c42148a.f115221G = null;
                    c42148a.f115222H = 0;
                    c42148a.f115224x = 1;
                    if (interfaceC13062m.emit(domainState, c42148a) == enumC31071a) {
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

        public r(InterfaceC13058l interfaceC13058l) {
            this.f115217w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f115217w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: oy2.e$s */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor$interact$2", m100430f = "CampaignStepsInteractor.kt", m100431l = {111}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Loy2/e$a;", "internalState", "Loy2/l;", "action", "<anonymous>", "(Loy2/e$a;Loy2/l;)Loy2/e$a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class s extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f115227w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f115228x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f115229y;

        public s(InterfaceC30057d<? super s> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a aVar, AbstractC28486l abstractC28486l, InterfaceC30057d<? super a> interfaceC30057d) {
            s sVar = C28479e.this.new s(interfaceC30057d);
            sVar.f115228x = aVar;
            sVar.f115229y = abstractC28486l;
            return sVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            a aVar = (a) this.f115228x;
            AbstractC28486l abstractC28486l = (AbstractC28486l) this.f115229y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f115227w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C28479e c28479e = C28479e.this;
            this.f115228x = null;
            this.f115229y = null;
            this.f115227w = 1;
            Object objM86689w0 = c28479e.m86689w0(aVar, abstractC28486l, this);
            return objM86689w0 == enumC31071a ? enumC31071a : objM86689w0;
        }
    }

    /* JADX INFO: renamed from: oy2.e$t */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor$nextStepClicked$1", m100430f = "CampaignStepsInteractor.kt", m100431l = {673, 675, 676, 681, 685, 685, 687, 689, 691, 692, 697}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Loy2/l;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class t extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        Object f115231E;

        /* JADX INFO: renamed from: F */
        int f115232F;

        /* JADX INFO: renamed from: G */
        int f115233G;

        /* JADX INFO: renamed from: H */
        int f115234H;

        /* JADX INFO: renamed from: I */
        private /* synthetic */ Object f115235I;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ int f115237K;

        /* JADX INFO: renamed from: L */
        final /* synthetic */ int f115238L;

        /* JADX INFO: renamed from: w */
        Object f115239w;

        /* JADX INFO: renamed from: x */
        Object f115240x;

        /* JADX INFO: renamed from: y */
        Object f115241y;

        /* JADX INFO: renamed from: z */
        Object f115242z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(int i13, int i14, InterfaceC30057d<? super t> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f115237K = i13;
            this.f115238L = i14;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            t tVar = C28479e.this.new t(this.f115237K, this.f115238L, interfaceC30057d);
            tVar.f115235I = obj;
            return tVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((t) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:41:0x0132  */
        /* JADX WARN: Code duplicated, block: B:42:0x0134  */
        /* JADX WARN: Code duplicated, block: B:45:0x0157  */
        /* JADX WARN: Code duplicated, block: B:46:0x0159  */
        /* JADX WARN: Code duplicated, block: B:49:0x01a3  */
        /* JADX WARN: Code duplicated, block: B:50:0x01a5  */
        /* JADX WARN: Code duplicated, block: B:53:0x01b2 A[Catch: Exception -> 0x003b, TryCatch #0 {Exception -> 0x003b, blocks: (B:9:0x0036, B:14:0x0056, B:75:0x0286, B:17:0x0073, B:72:0x0269, B:20:0x008c, B:68:0x022e, B:23:0x00ac, B:59:0x01e9, B:26:0x00c6, B:51:0x01aa, B:53:0x01b2, B:55:0x01cc, B:62:0x0206, B:63:0x020b, B:64:0x020c, B:29:0x00db, B:47:0x015f, B:32:0x00ee, B:43:0x0139, B:33:0x00f4, B:39:0x0112, B:36:0x00fd), top: B:83:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:55:0x01cc A[Catch: Exception -> 0x003b, TryCatch #0 {Exception -> 0x003b, blocks: (B:9:0x0036, B:14:0x0056, B:75:0x0286, B:17:0x0073, B:72:0x0269, B:20:0x008c, B:68:0x022e, B:23:0x00ac, B:59:0x01e9, B:26:0x00c6, B:51:0x01aa, B:53:0x01b2, B:55:0x01cc, B:62:0x0206, B:63:0x020b, B:64:0x020c, B:29:0x00db, B:47:0x015f, B:32:0x00ee, B:43:0x0139, B:33:0x00f4, B:39:0x0112, B:36:0x00fd), top: B:83:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:57:0x01e5  */
        /* JADX WARN: Code duplicated, block: B:58:0x01e7  */
        /* JADX WARN: Code duplicated, block: B:61:0x0204  */
        /* JADX WARN: Code duplicated, block: B:62:0x0206 A[Catch: Exception -> 0x003b, TryCatch #0 {Exception -> 0x003b, blocks: (B:9:0x0036, B:14:0x0056, B:75:0x0286, B:17:0x0073, B:72:0x0269, B:20:0x008c, B:68:0x022e, B:23:0x00ac, B:59:0x01e9, B:26:0x00c6, B:51:0x01aa, B:53:0x01b2, B:55:0x01cc, B:62:0x0206, B:63:0x020b, B:64:0x020c, B:29:0x00db, B:47:0x015f, B:32:0x00ee, B:43:0x0139, B:33:0x00f4, B:39:0x0112, B:36:0x00fd), top: B:83:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:64:0x020c A[Catch: Exception -> 0x003b, TryCatch #0 {Exception -> 0x003b, blocks: (B:9:0x0036, B:14:0x0056, B:75:0x0286, B:17:0x0073, B:72:0x0269, B:20:0x008c, B:68:0x022e, B:23:0x00ac, B:59:0x01e9, B:26:0x00c6, B:51:0x01aa, B:53:0x01b2, B:55:0x01cc, B:62:0x0206, B:63:0x020b, B:64:0x020c, B:29:0x00db, B:47:0x015f, B:32:0x00ee, B:43:0x0139, B:33:0x00f4, B:39:0x0112, B:36:0x00fd), top: B:83:0x000e }] */
        /* JADX WARN: Code duplicated, block: B:66:0x0228  */
        /* JADX WARN: Code duplicated, block: B:67:0x022a  */
        /* JADX WARN: Code duplicated, block: B:70:0x0265  */
        /* JADX WARN: Code duplicated, block: B:71:0x0267  */
        /* JADX WARN: Code duplicated, block: B:74:0x0285  */
        /* JADX WARN: Code duplicated, block: B:75:0x0286 A[Catch: Exception -> 0x003b, PHI: r0 r1 r2 r3 r4
          0x0286: PHI (r0v26 int) = (r0v24 int), (r0v29 int) binds: [B:73:0x0283, B:14:0x0056] A[DONT_GENERATE, DONT_INLINE]
          0x0286: PHI (r1v36 int) = (r1v34 int), (r1v37 int) binds: [B:73:0x0283, B:14:0x0056] A[DONT_GENERATE, DONT_INLINE]
          0x0286: PHI (r2v31 java.util.List) = (r2v26 java.util.List), (r2v36 java.util.List) binds: [B:73:0x0283, B:14:0x0056] A[DONT_GENERATE, DONT_INLINE]
          0x0286: PHI (r3v35 com.whoop.whooplabs.data.room.entity.WhoopLabsStudy) = 
          (r3v32 com.whoop.whooplabs.data.room.entity.WhoopLabsStudy)
          (r3v37 com.whoop.whooplabs.data.room.entity.WhoopLabsStudy)
         binds: [B:73:0x0283, B:14:0x0056] A[DONT_GENERATE, DONT_INLINE]
          0x0286: PHI (r4v25 com.whoop.whooplabs.data.room.entity.RemoteCampaign) = 
          (r4v20 com.whoop.whooplabs.data.room.entity.RemoteCampaign)
          (r4v29 com.whoop.whooplabs.data.room.entity.RemoteCampaign)
         binds: [B:73:0x0283, B:14:0x0056] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x003b, blocks: (B:9:0x0036, B:14:0x0056, B:75:0x0286, B:17:0x0073, B:72:0x0269, B:20:0x008c, B:68:0x022e, B:23:0x00ac, B:59:0x01e9, B:26:0x00c6, B:51:0x01aa, B:53:0x01b2, B:55:0x01cc, B:62:0x0206, B:63:0x020b, B:64:0x020c, B:29:0x00db, B:47:0x015f, B:32:0x00ee, B:43:0x0139, B:33:0x00f4, B:39:0x0112, B:36:0x00fd), top: B:83:0x000e }] */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x02a4, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r7, r2, r25) == r8) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x02db, code lost:
        
            if (r7.emit(r0, r25) == r8) goto L80;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instruction units count: 766
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: oy2.C28479e.t.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: oy2.e$u */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor$numberInputEntered$1", m100430f = "CampaignStepsInteractor.kt", m100431l = {906, 907, 910, 911}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Loy2/l;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class u extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f115243E;

        /* JADX INFO: renamed from: F */
        private /* synthetic */ Object f115244F;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ String f115246H;

        /* JADX INFO: renamed from: w */
        Object f115247w;

        /* JADX INFO: renamed from: x */
        Object f115248x;

        /* JADX INFO: renamed from: y */
        Object f115249y;

        /* JADX INFO: renamed from: z */
        int f115250z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String str, InterfaceC30057d<? super u> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f115246H = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            u uVar = C28479e.this.new u(this.f115246H, interfaceC30057d);
            uVar.f115244F = obj;
            return uVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((u) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:36:0x00f1 A[Catch: Exception -> 0x002c, PHI: r3
          0x00f1: PHI (r3v12 int) = (r3v11 int), (r3v15 int) binds: [B:34:0x00ee, B:16:0x0045] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x002c, blocks: (B:9:0x0027, B:16:0x0045, B:36:0x00f1, B:19:0x0050, B:33:0x00a0, B:22:0x0059, B:30:0x0086, B:25:0x0062, B:27:0x006a, B:39:0x010b, B:40:0x010e), top: B:48:0x0011 }] */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0108, code lost:
        
            if (r0.emit(r6, r26) == r2) goto L38;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                Method dump skipped, instruction units count: 324
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: oy2.C28479e.u.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: oy2.e$v */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor$optionSelected$1", m100430f = "CampaignStepsInteractor.kt", m100431l = {891, 892, 895, 896}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Loy2/l;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class v extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f115251E;

        /* JADX INFO: renamed from: F */
        private /* synthetic */ Object f115252F;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ String f115254H;

        /* JADX INFO: renamed from: w */
        Object f115255w;

        /* JADX INFO: renamed from: x */
        Object f115256x;

        /* JADX INFO: renamed from: y */
        Object f115257y;

        /* JADX INFO: renamed from: z */
        int f115258z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(String str, InterfaceC30057d<? super v> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f115254H = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            v vVar = C28479e.this.new v(this.f115254H, interfaceC30057d);
            vVar.f115252F = obj;
            return vVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((v) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00ee  */
        /* JADX WARN: Code duplicated, block: B:36:0x00ef A[Catch: Exception -> 0x002c, PHI: r3
          0x00ef: PHI (r3v12 int) = (r3v11 int), (r3v15 int) binds: [B:34:0x00ec, B:16:0x0045] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x002c, blocks: (B:9:0x0027, B:16:0x0045, B:36:0x00ef, B:19:0x0050, B:33:0x00a0, B:22:0x0059, B:30:0x0086, B:25:0x0062, B:27:0x006a, B:39:0x0109, B:40:0x010c), top: B:48:0x0011 }] */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0106, code lost:
        
            if (r0.emit(r6, r26) == r2) goto L38;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                Method dump skipped, instruction units count: 322
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: oy2.C28479e.v.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: oy2.e$w */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor$reduce$10$3$1", m100430f = "CampaignStepsInteractor.kt", m100431l = {345}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class w extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f115259w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ ProtocolStepResult f115261y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(ProtocolStepResult protocolStepResult, InterfaceC30057d<? super w> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f115261y = protocolStepResult;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C28479e.this.new w(this.f115261y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((w) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f115259w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13732c c13732c = C28479e.this.labsRepository;
                ProtocolStepResult protocolStepResult = this.f115261y;
                this.f115259w = 1;
                if (c13732c.m39003w(protocolStepResult, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: oy2.e$x */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor$reduce$11$3$1", m100430f = "CampaignStepsInteractor.kt", m100431l = {364}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class x extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f115262w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ ProtocolStepResult f115264y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(ProtocolStepResult protocolStepResult, InterfaceC30057d<? super x> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f115264y = protocolStepResult;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C28479e.this.new x(this.f115264y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((x) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f115262w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13732c c13732c = C28479e.this.labsRepository;
                ProtocolStepResult protocolStepResult = this.f115264y;
                this.f115262w = 1;
                if (c13732c.m39003w(protocolStepResult, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: oy2.e$y */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor", m100430f = "CampaignStepsInteractor.kt", m100431l = {302, 450}, m100432m = "reduce", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f115265E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f115266F;

        /* JADX INFO: renamed from: H */
        int f115268H;

        /* JADX INFO: renamed from: w */
        Object f115269w;

        /* JADX INFO: renamed from: x */
        Object f115270x;

        /* JADX INFO: renamed from: y */
        Object f115271y;

        /* JADX INFO: renamed from: z */
        Object f115272z;

        public y(InterfaceC30057d<? super y> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f115266F = obj;
            this.f115268H |= Integer.MIN_VALUE;
            return C28479e.this.m86689w0(null, null, this);
        }
    }

    /* JADX INFO: renamed from: oy2.e$z */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor$reduce$9$3$1", m100430f = "CampaignStepsInteractor.kt", m100431l = {327}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class z extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f115273w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ ProtocolStepResult f115275y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(ProtocolStepResult protocolStepResult, InterfaceC30057d<? super z> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f115275y = protocolStepResult;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C28479e.this.new z(this.f115275y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((z) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f115273w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13732c c13732c = C28479e.this.labsRepository;
                ProtocolStepResult protocolStepResult = this.f115275y;
                this.f115273w = 1;
                if (c13732c.m39003w(protocolStepResult, this) == enumC31071a) {
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

    public C28479e(C13732c labsRepository, C10823a serviceConnector, InterfaceC2994c0 coroutineScope, InterfaceC41070a dateAndTimeProvider, C28480f logger, C13731b labsCampaignRepository, C41178b analytics, InterfaceC4733b whoopStrapProvider, InterfaceC16183e fwUpdateApi) {
        AbstractC22676k.m65750j(labsRepository, "labsRepository");
        AbstractC22676k.m65750j(serviceConnector, "serviceConnector");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(labsCampaignRepository, "labsCampaignRepository");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(fwUpdateApi, "fwUpdateApi");
        this.labsRepository = labsRepository;
        this.serviceConnector = serviceConnector;
        this.coroutineScope = coroutineScope;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.logger = logger;
        this.labsCampaignRepository = labsCampaignRepository;
        this.analytics = analytics;
        this.whoopStrapProvider = whoopStrapProvider;
        this.fwUpdateApi = fwUpdateApi;
        this.stepHandlers = AbstractC25247g0.m73990Y(new C23465k(ProtocolStepType.TYPEFORM, new C29634i()), new C23465k(ProtocolStepType.BP, new C29626a()), new C23465k(ProtocolStepType.BTHR, new C29627b()), new C23465k(ProtocolStepType.INSTRUCTION, new C29632g()), new C23465k(ProtocolStepType.SELECTION, new C29630e()), new C23465k(ProtocolStepType.NUMBER_INPUT, new C29629d()), new C23465k(ProtocolStepType.TEXT_INPUT, new C29631f()), new C23465k(ProtocolStepType.TIME_PICKER, new C29633h()), new C23465k(ProtocolStepType.DATETIME_PICKER, new C29628c()));
        this.scannerJob = AbstractC3006f0.m8710d();
        C26045d c26045d = (C26045d) getKoin().f106046a.f159364d.m122602a(new C27072e(this, 22), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C26045d.class), null);
        this.scanner = c26045d;
        this.hrDevicesFlow = AbstractC13091v.m36610t(new f0(c26045d.getDeviceList()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final InterfaceC28476b m86590A0(CampaignStepConfigResponse config) {
        AbstractC22676k.m65750j(config, "config");
        return new InterfaceC28476b.o(config.getSubmitErrorTitle(), config.getSubmitErrorBody(), config.getErrorCta(), config.getErrorDiscard());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final InterfaceC28476b m86592B0(C28479e c28479e, a aVar, CampaignStepConfigResponse config) {
        InterfaceC28476b.g gVarM86509i;
        AbstractC22676k.m65750j(config, "config");
        InterfaceC28476b domainState = aVar.getDomainState();
        InterfaceC28476b.g gVar = (InterfaceC28476b.g) (!(domainState instanceof InterfaceC28476b.g) ? null : domainState);
        if (gVar != null && (gVarM86509i = InterfaceC28476b.g.m86509i(gVar, null, null, null, false, false, null, new C28488n(config.getWebViewErrorTitle(), config.getWebViewErrorBody(), config.getWebViewPositiveCta(), config.getWebViewNegativeCta()), 0, null, null, null, null, null, false, true, 0, null, 114623, null)) != null) {
            return gVarM86509i;
        }
        c28479e.logger.m86709y("Error casting " + domainState);
        return domainState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final InterfaceC28476b m86594C0(CampaignStepConfigResponse config) {
        AbstractC22676k.m65750j(config, "config");
        return new InterfaceC28476b.r(config.getSuccessText(), config.getSuccessSubtext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final InterfaceC28476b m86596D0(C28479e c28479e, CampaignStepConfigResponse config) {
        AbstractC22676k.m65750j(config, "config");
        return new InterfaceC28476b.s(c28479e.m86672n0(), config.getSuccessIcon(), config.getSubmittedText(), config.getSuccessBackgroundUrl(), config.getSubmittedCta(), config.getNavigationAction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final InterfaceC28476b m86598E0(CampaignStepConfigResponse config) {
        AbstractC22676k.m65750j(config, "config");
        return new InterfaceC28476b.t(config.getSubmittingText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final ProtocolStepMysticReading m86600F0(ProtocolStepMysticReading initBpReading, Integer num) {
        AbstractC22676k.m65750j(initBpReading, "initBpReading");
        return ProtocolStepMysticReading.copy$default(initBpReading, null, null, num, null, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final InterfaceC28476b.c m86602G0(InterfaceC28476b.c validateBpInput) {
        AbstractC22676k.m65750j(validateBpInput, "$this$validateBpInput");
        return InterfaceC28476b.c.m86448i(validateBpInput, null, null, null, false, false, null, null, null, null, null, null, 0, 0, null, null, null, false, null, null, 0, 0, null, null, null, false, null, null, 0, 0, null, null, null, false, null, false, true, false, -1, 23, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final C23454a0 m86604H0(C28479e c28479e, ProtocolStepResult it) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC3006f0.m8732z(c28479e.coroutineScope, null, null, c28479e.new z(it, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final ProtocolStepMysticReading m86606I0(ProtocolStepMysticReading initBpReading, Integer num) {
        AbstractC22676k.m65750j(initBpReading, "initBpReading");
        return ProtocolStepMysticReading.copy$default(initBpReading, null, null, null, num, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final InterfaceC28476b.c m86608J0(InterfaceC28476b.c validateBpInput) {
        AbstractC22676k.m65750j(validateBpInput, "$this$validateBpInput");
        return InterfaceC28476b.c.m86448i(validateBpInput, null, null, null, false, false, null, null, null, null, null, null, 0, 0, null, null, null, false, null, null, 0, 0, null, null, null, false, null, null, 0, 0, null, null, null, false, null, false, false, true, -1, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final C23454a0 m86610K0(C28479e c28479e, ProtocolStepResult it) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC3006f0.m8732z(c28479e.coroutineScope, null, null, c28479e.new w(it, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final ProtocolStepMysticReading m86612L0(ProtocolStepMysticReading initBpReading, Integer num) {
        AbstractC22676k.m65750j(initBpReading, "initBpReading");
        return ProtocolStepMysticReading.copy$default(initBpReading, null, num, null, null, 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final InterfaceC28476b.c m86614M0(InterfaceC28476b.c validateBpInput) {
        AbstractC22676k.m65750j(validateBpInput, "$this$validateBpInput");
        return InterfaceC28476b.c.m86448i(validateBpInput, null, null, null, false, false, null, null, null, null, null, null, 0, 0, null, null, null, false, null, null, 0, 0, null, null, null, false, null, null, 0, 0, null, null, null, false, null, true, false, false, -1, 27, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final C23454a0 m86616N0(C28479e c28479e, ProtocolStepResult it) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC3006f0.m8732z(c28479e.coroutineScope, null, null, c28479e.new x(it, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: O0 */
    private final InterfaceC13058l m86618O0(String address) {
        return new C13084s1(new a0(address, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: P0 */
    public final Object m86620P0(int i13, InterfaceC30057d<? super AbstractC28486l> interfaceC30057d) {
        b0 b0Var;
        int i14 = i13;
        if (interfaceC30057d instanceof b0) {
            b0Var = (b0) interfaceC30057d;
            int i15 = b0Var.f115059z;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                b0Var.f115059z = i15 - Integer.MIN_VALUE;
            } else {
                b0Var = new b0(interfaceC30057d);
            }
        } else {
            b0Var = new b0(interfaceC30057d);
        }
        Object objM86674o0 = b0Var.f115057x;
        Object obj = EnumC31071a.f128113w;
        int i16 = b0Var.f115059z;
        if (i16 == 0) {
            AbstractC34132o.m107864I(objM86674o0);
            this.logger.m86707A("Retrying webView, attempt: " + i14);
            b0Var.f115056w = i14;
            b0Var.f115059z = 1;
            objM86674o0 = m86674o0(b0Var);
            if (objM86674o0 == obj) {
                return obj;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i14 = b0Var.f115056w;
            AbstractC34132o.m107864I(objM86674o0);
        }
        AbstractC28486l abstractC28486l = (AbstractC28486l) objM86674o0;
        if (!(abstractC28486l instanceof AbstractC28486l.b)) {
            return abstractC28486l;
        }
        AbstractC28486l.b bVar = (AbstractC28486l.b) abstractC28486l;
        return bVar.getCampaignStepDomainState() instanceof InterfaceC28476b.g ? new AbstractC28486l.b(InterfaceC28476b.g.m86509i((InterfaceC28476b.g) bVar.getCampaignStepDomainState(), null, null, null, false, false, null, null, 0, null, null, null, null, null, false, false, i14 + 1, null, 98303, null)) : abstractC28486l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00db, code lost:
    
        if (r4.m39003w(r0, r2) == r3) goto L39;
     */
    /* JADX INFO: renamed from: Q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m86622Q0(java.lang.String r26, q83.InterfaceC30057d<? super l83.C23454a0> r27) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oy2.C28479e.m86622Q0(java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: R0 */
    private final void m86624R0(String requiredRegex, String blockedRegex) {
        this.logger.m86707A("scanning for hr devices, requiredRegex: " + requiredRegex + ", blockedRegex: " + blockedRegex);
        C26045d.m77500o(this.scanner, null, requiredRegex, blockedRegex, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final C34911a m86626S0(C28479e c28479e) {
        return new C34911a(AbstractC25260n.m74055Z0(new Object[]{AbstractC3006f0.m8696B(c28479e.coroutineScope, c28479e.scannerJob)}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T0 */
    public final void m86628T0(int campaignId) {
        this.analytics.m133828a(new AbstractC41177a.e(null, String.valueOf(campaignId), 1, 0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U0 */
    public final void m86630U0(int campaignId) {
        this.analytics.m133828a(new AbstractC41177a.j(null, String.valueOf(campaignId), 1, 0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public final void m86632V0(SurveyProvider surveyProvider, String error) {
        this.analytics.m133828a(new AbstractC41177a.m(null, surveyProvider.name(), AbstractC31061c.m95645u("Survey error", error), 1, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W0 */
    private final void m86634W0(SurveyProvider surveyProvider) {
        this.analytics.m133828a(new AbstractC41177a.n(null, surveyProvider.name(), 1, 0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X0 */
    public final void m86636X0(SurveyProvider surveyProvider) {
        this.analytics.m133828a(new AbstractC41177a.l(null, surveyProvider.name(), 1, 0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public final Object m86638Y0(int i13, List<ProtocolStepResult> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        ProtocolStepResult protocolStepResultCopy$default = ProtocolStepResult.copy$default(list.get(i13), 0, 0, 0, null, this.dateAndTimeProvider.mo133364c(), null, false, null, null, null, null, null, 4079, null);
        list.set(i13, protocolStepResultCopy$default);
        Object objM39003w = this.labsRepository.m39003w(protocolStepResultCopy$default, interfaceC30057d);
        return objM39003w == EnumC31071a.f128113w ? objM39003w : C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public final Object m86640Z0(int i13, List<ProtocolStepResult> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        ProtocolStepResult protocolStepResult = list.get(i13);
        DateTime startTimestamp = protocolStepResult.getStartTimestamp();
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (startTimestamp == null) {
            ProtocolStepResult protocolStepResultCopy$default = ProtocolStepResult.copy$default(protocolStepResult, 0, 0, 0, this.dateAndTimeProvider.mo133364c(), null, null, false, null, null, null, null, null, 4087, null);
            list.set(i13, protocolStepResultCopy$default);
            Object objM39003w = this.labsRepository.m39003w(protocolStepResultCopy$default, interfaceC30057d);
            if (objM39003w == EnumC31071a.f128113w) {
                return objM39003w;
            }
        }
        return c23454a0;
    }

    /* JADX INFO: renamed from: a1 */
    private final InterfaceC13058l m86643a1(int campaignId, Integer sessionId) {
        return AbstractC13091v.m36602l(new d0(campaignId, sessionId, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public final InterfaceC13058l m86646b1(int currentStep, RemoteCampaign remoteCampaign, WhoopLabsStudy study, List<ProtocolStepResult> protocolStepResults) {
        return new C13084s1(new e0(remoteCampaign, currentStep, this, study, protocolStepResults, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0101, code lost:
    
        if (r0.m39003w(r11, r2) == r3) goto L39;
     */
    /* JADX INFO: renamed from: c1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m86649c1(int r29, int r30, q83.InterfaceC30057d<? super l83.C23454a0> r31) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oy2.C28479e.m86649c1(int, int, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: d0 */
    private final InterfaceC28476b m86651d0(InterfaceC28476b domainState, List<C39830b> devices) {
        return domainState instanceof InterfaceC28476b.a ? InterfaceC28476b.a.m86419i((InterfaceC28476b.a) domainState, null, null, null, false, false, null, null, devices, false, false, null, null, 3967, null) : domainState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public final InterfaceC13058l m86652d1(int campaignId, SurveyProvider surveyProvider) {
        return new C13084s1(new h0(campaignId, surveyProvider, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e0 */
    public final Object m86654e0(InterfaceC30057d<? super AbstractC28486l> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f115055y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f115055y = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM86674o0 = bVar.f115053w;
        Object obj = EnumC31071a.f128113w;
        int i14 = bVar.f115055y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM86674o0);
            this.logger.m86707A("Add comment clicked");
            bVar.f115055y = 1;
            objM86674o0 = m86674o0(bVar);
            if (objM86674o0 == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM86674o0);
        }
        AbstractC28486l abstractC28486l = (AbstractC28486l) objM86674o0;
        return abstractC28486l instanceof AbstractC28486l.b ? new AbstractC28486l.b(InterfaceC28476b.l.f114983a.mo86416e(((AbstractC28486l.b) abstractC28486l).getCampaignStepDomainState(), true)) : abstractC28486l;
    }

    /* JADX INFO: renamed from: e1 */
    private final InterfaceC28476b m86655e1(CampaignStepConfigResponse config, Function1 onSuccess) {
        if (config != null) {
            return (InterfaceC28476b) onSuccess.invoke(config);
        }
        this.logger.m86709y("Error: Config is null");
        return new InterfaceC28476b.m(m86672n0(), Integer.valueOf(m86678q0()), null, null, null, null, 60, null);
    }

    /* JADX INFO: renamed from: f0 */
    private final Object m86657f0(String str, InterfaceC30057d<? super AbstractC28486l> interfaceC30057d) {
        this.logger.m86707A("Add comment confirmed");
        WhoopLabsService whoopLabsService = this.service;
        if (whoopLabsService != null) {
            whoopLabsService.m28468h(str);
            return m86669l0(interfaceC30057d);
        }
        AbstractC22676k.m65757q(NotificationCompat.CATEGORY_SERVICE);
        throw null;
    }

    /* JADX INFO: renamed from: g0 */
    private final InterfaceC13058l m86659g0(String address) {
        return new C13084s1(new c(address, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h0 */
    public final Object m86661h0(RemoteCampaign remoteCampaign, InterfaceC30057d<? super InterfaceC28476b> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f115075z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f115075z = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object obj = dVar.f115073x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f115075z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            WhoopLabsService whoopLabsService = this.service;
            if (whoopLabsService == null) {
                AbstractC22676k.m65757q(NotificationCompat.CATEGORY_SERVICE);
                throw null;
            }
            DateTime startTime = whoopLabsService.m28476r().getStartTime();
            if (startTime != null) {
                C41178b c41178b = this.analytics;
                WhoopLabsService whoopLabsService2 = this.service;
                if (whoopLabsService2 == null) {
                    AbstractC22676k.m65757q(NotificationCompat.CATEGORY_SERVICE);
                    throw null;
                }
                String strValueOf = String.valueOf(whoopLabsService2.m28476r().getCampaignId());
                C23465k c23465k = new C23465k("Day Number", new Integer(Days.daysBetween(startTime.toLocalDate(), this.dateAndTimeProvider.mo133365d()).getDays() + 1));
                LabsSession session = remoteCampaign.getCampaign().getSession();
                c41178b.m133828a(new AbstractC41177a.c(null, strValueOf, AbstractC25247g0.m73990Y(c23465k, new C23465k("Session ID", session != null ? new Integer(session.getCampaignSessionId()) : null)), 1, null));
            }
            WhoopLabsService whoopLabsService3 = this.service;
            if (whoopLabsService3 == null) {
                AbstractC22676k.m65757q(NotificationCompat.CATEGORY_SERVICE);
                throw null;
            }
            dVar.f115072w = remoteCampaign;
            dVar.f115075z = 1;
            if (whoopLabsService3.m28469i(dVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteCampaign = (RemoteCampaign) dVar.f115072w;
            AbstractC34132o.m107864I(obj);
        }
        return new InterfaceC28476b.k(remoteCampaign.getCampaign().getCampaignId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i0 */
    public final Object m86663i0(int i13, InterfaceC30057d<? super AbstractC28486l> interfaceC30057d) {
        e eVar;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i14 = eVar.f115094z;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f115094z = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object objM86674o0 = eVar.f115092x;
        Object obj = EnumC31071a.f128113w;
        int i15 = eVar.f115094z;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(objM86674o0);
                eVar.f115091w = i13;
                eVar.f115094z = 1;
                objM86674o0 = m86674o0(eVar);
                if (objM86674o0 == obj) {
                    return obj;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = eVar.f115091w;
                AbstractC34132o.m107864I(objM86674o0);
            }
            AbstractC28486l abstractC28486l = (AbstractC28486l) objM86674o0;
            return abstractC28486l instanceof AbstractC28486l.b ? new AbstractC28486l.b(InterfaceC28476b.l.f114983a.mo86417f(((AbstractC28486l.b) abstractC28486l).getCampaignStepDomainState(), true)) : abstractC28486l;
        } catch (Exception e5) {
            AbstractC3006f0.m8721o(eVar.getContext());
            this.logger.m86710z("Error getting current step for campaign " + i13, e5);
            return AbstractC28486l.m.f115339a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:39:0x00f2 A[Catch: Exception -> 0x0049, TryCatch #0 {Exception -> 0x0049, blocks: (B:14:0x0044, B:21:0x0064, B:37:0x00dc, B:39:0x00f2, B:40:0x00f8, B:24:0x0075, B:33:0x00b6, B:27:0x0083, B:29:0x0087, B:43:0x015d, B:44:0x0160), top: B:52:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x015a, code lost:
    
        if (r0.m39003w(r14, r2) == r3) goto L42;
     */
    /* JADX INFO: renamed from: j0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m86665j0(int r32, int r33, int r34, int r35, int r36, q83.InterfaceC30057d<? super l83.C23454a0> r37) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oy2.C28479e.m86665j0(int, int, int, int, int, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k0 */
    public final Object m86667k0(InterfaceC30057d<? super AbstractC28486l> interfaceC30057d) {
        g gVar;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f115131y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f115131y = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        Object objM86674o0 = gVar.f115129w;
        Object obj = EnumC31071a.f128113w;
        int i14 = gVar.f115131y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM86674o0);
            gVar.f115131y = 1;
            objM86674o0 = m86674o0(gVar);
            if (objM86674o0 == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM86674o0);
        }
        AbstractC28486l abstractC28486l = (AbstractC28486l) objM86674o0;
        return abstractC28486l instanceof AbstractC28486l.b ? new AbstractC28486l.b(InterfaceC28476b.l.f114983a.mo86417f(((AbstractC28486l.b) abstractC28486l).getCampaignStepDomainState(), false)) : abstractC28486l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l0 */
    public final Object m86669l0(InterfaceC30057d<? super AbstractC28486l> interfaceC30057d) {
        h hVar;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i13 = hVar.f115143y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hVar.f115143y = i13 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        Object objM86674o0 = hVar.f115141w;
        Object obj = EnumC31071a.f128113w;
        int i14 = hVar.f115143y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM86674o0);
            hVar.f115143y = 1;
            objM86674o0 = m86674o0(hVar);
            if (objM86674o0 == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM86674o0);
        }
        AbstractC28486l abstractC28486l = (AbstractC28486l) objM86674o0;
        return abstractC28486l instanceof AbstractC28486l.b ? new AbstractC28486l.b(InterfaceC28476b.l.f114983a.mo86416e(((AbstractC28486l.b) abstractC28486l).getCampaignStepDomainState(), false)) : abstractC28486l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public final int m86672n0() {
        WhoopLabsService whoopLabsService = this.service;
        if (whoopLabsService != null) {
            return whoopLabsService.m28476r().getCampaignId();
        }
        AbstractC22676k.m65757q(NotificationCompat.CATEGORY_SERVICE);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ad A[Catch: Exception -> 0x0045, PHI: r0 r4 r7
      0x00ad: PHI (r0v12 java.lang.Object) = (r0v11 java.lang.Object), (r0v1 java.lang.Object) binds: [B:37:0x00aa, B:22:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x00ad: PHI (r4v8 com.whoop.whooplabs.data.room.entity.RemoteCampaign) = (r4v7 com.whoop.whooplabs.data.room.entity.RemoteCampaign), (r4v12 com.whoop.whooplabs.data.room.entity.RemoteCampaign) binds: [B:37:0x00aa, B:22:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x00ad: PHI (r7v3 com.whoop.whooplabs.data.room.entity.WhoopLabsStudy) = (r7v2 com.whoop.whooplabs.data.room.entity.WhoopLabsStudy), (r7v6 com.whoop.whooplabs.data.room.entity.WhoopLabsStudy) binds: [B:37:0x00aa, B:22:0x0058] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0045, blocks: (B:15:0x0040, B:42:0x0103, B:22:0x0058, B:39:0x00ad, B:25:0x0060, B:36:0x0094, B:26:0x0065, B:32:0x007c, B:29:0x006c), top: B:46:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0100, code lost:
    
        if (r0 == r3) goto L41;
     */
    /* JADX INFO: renamed from: o0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m86674o0(q83.InterfaceC30057d<? super oy2.AbstractC28486l> r25) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oy2.C28479e.m86674o0(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p0 */
    public final Object m86676p0(WhoopLabsStudy whoopLabsStudy, RemoteCampaign remoteCampaign, List<ProtocolStepResult> list, InterfaceC30057d<? super AbstractC28486l.b> interfaceC30057d) {
        l lVar;
        WhoopLabsStudy whoopLabsStudy2;
        int i13;
        if (interfaceC30057d instanceof l) {
            lVar = (l) interfaceC30057d;
            int i14 = lVar.f115188G;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f115188G = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(interfaceC30057d);
            }
        } else {
            lVar = new l(interfaceC30057d);
        }
        Object obj = lVar.f115186E;
        Object obj2 = EnumC31071a.f128113w;
        int i15 = lVar.f115188G;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            int protocolStep = whoopLabsStudy.getProtocolStep();
            lVar.f115189w = whoopLabsStudy;
            lVar.f115190x = remoteCampaign;
            lVar.f115191y = list;
            lVar.f115192z = protocolStep;
            lVar.f115188G = 1;
            if (m86640Z0(protocolStep, list, lVar) != obj2) {
                whoopLabsStudy2 = whoopLabsStudy;
                i13 = protocolStep;
            }
        }
        if (i15 != 1) {
            if (i15 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        i13 = lVar.f115192z;
        list = (List) lVar.f115191y;
        remoteCampaign = (RemoteCampaign) lVar.f115190x;
        whoopLabsStudy2 = (WhoopLabsStudy) lVar.f115189w;
        AbstractC34132o.m107864I(obj);
        InterfaceC13058l interfaceC13058lM86646b1 = m86646b1(i13, remoteCampaign, whoopLabsStudy2, list);
        lVar.f115189w = null;
        lVar.f115190x = null;
        lVar.f115191y = null;
        lVar.f115192z = i13;
        lVar.f115188G = 2;
        Object objM36575A = AbstractC13091v.m36575A(interfaceC13058lM86646b1, lVar);
        return objM36575A == obj2 ? obj2 : objM36575A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public final int m86678q0() {
        WhoopLabsService whoopLabsService = this.service;
        if (whoopLabsService != null) {
            return whoopLabsService.m28476r().getStudyId();
        }
        AbstractC22676k.m65757q(NotificationCompat.CATEGORY_SERVICE);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02b8, code lost:
    
        if (r10 == r0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b7, code lost:
    
        if (r10 == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d6, code lost:
    
        if (r10 == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f1, code lost:
    
        if (r10 == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0185, code lost:
    
        if (r10 == r0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a1, code lost:
    
        if (r10 == r0) goto L150;
     */
    /* JADX INFO: renamed from: r0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m86680r0(oy2.AbstractC28475a r9, q83.InterfaceC30057d<? super ec3.InterfaceC13058l> r10) {
        /*
            Method dump skipped, instruction units count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oy2.C28479e.m86680r0(oy2.a, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public final InterfaceC13058l m86683t0(int campaignId, int sessionId) {
        return new C13084s1(new t(campaignId, sessionId, null));
    }

    /* JADX INFO: renamed from: u0 */
    private final InterfaceC13058l m86685u0(String value) {
        return new C13084s1(new u(value, null));
    }

    /* JADX INFO: renamed from: v0 */
    private final InterfaceC13058l m86687v0(String key) {
        return new C13084s1(new v(key, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:139:0x0414 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:163:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:178:0x0512  */
    /* JADX WARN: Code duplicated, block: B:193:0x0573  */
    /* JADX WARN: Code duplicated, block: B:279:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:306:0x0866  */
    /* JADX WARN: Code duplicated, block: B:313:0x088f  */
    /* JADX WARN: Code duplicated, block: B:343:0x0951  */
    /* JADX WARN: Code duplicated, block: B:358:0x09c1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Instruction removed from duplicated block: B:163:0x04b1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:178:0x0512, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:193:0x0573, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:279:0x07bb, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:313:0x088f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:343:0x0951, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:358:0x09c1, please report this as an issue */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: w0 */
    public final Object m86689w0(final a aVar, AbstractC28486l abstractC28486l, InterfaceC30057d<? super a> interfaceC30057d) {
        y yVar;
        a aVar2;
        InterfaceC28476b.f fVarMo86418g;
        a aVar3;
        InterfaceC28476b.d dVarM86486i;
        Object next;
        InterfaceC28476b interfaceC28476bMo86413b;
        Object next2;
        InterfaceC28476b domainState;
        Object objM86661h0;
        a aVar4;
        LabsCampaign campaign;
        LabsSession session;
        LabsCampaign campaign2;
        C28483i inputConfig;
        C28483i inputConfig2;
        C28483i inputConfig3;
        C28483i inputConfig4;
        a aVarM86698b;
        InterfaceC28476b domainState2;
        InterfaceC28476b.h hVar;
        InterfaceC28476b interfaceC28476b;
        InterfaceC28476b.h hVarM86527i;
        AbstractC28486l abstractC28486l2 = abstractC28486l;
        if (interfaceC30057d instanceof y) {
            yVar = (y) interfaceC30057d;
            int i13 = yVar.f115268H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                yVar.f115268H = i13 - Integer.MIN_VALUE;
            } else {
                yVar = new y(interfaceC30057d);
            }
        } else {
            yVar = new y(interfaceC30057d);
        }
        Object obj = yVar.f115266F;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = yVar.f115268H;
        strM86734d = null;
        String strM86734d = null;
        num = null;
        num = null;
        Integer num = null;
        Object obj3 = null;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (abstractC28486l2 instanceof AbstractC28486l.w) {
                return a.m86698b(aVar, null, null, null, ((AbstractC28486l.w) abstractC28486l2).getStudyConfig(), null, null, 0, null, null, null, null, null, null, null, 16375, null);
            }
            if (abstractC28486l2 instanceof AbstractC28486l.v) {
                AbstractC28486l.v vVar = (AbstractC28486l.v) abstractC28486l2;
                return a.m86698b(aVar, InterfaceC28476b.q.f115003a, vVar.m86770b(), null, vVar.getStudyConfig(), vVar.getRemoteCampaign(), null, 0, null, null, null, null, null, null, null, 16356, null);
            }
            if (abstractC28486l2 instanceof AbstractC28486l.q) {
                return a.m86698b(aVar, InterfaceC28476b.q.f115003a, null, null, null, null, null, 0, null, null, null, null, null, null, null, 16382, null);
            }
            if (abstractC28486l2 instanceof AbstractC28486l.i) {
                AbstractC28486l.i iVar = (AbstractC28486l.i) abstractC28486l2;
                return a.m86698b(aVar, new InterfaceC28476b.m(iVar.getCampaignId(), iVar.getSessionId(), null, null, null, null, 60, null), null, null, null, null, null, 0, null, null, null, null, null, null, null, 16382, null);
            }
            if (abstractC28486l2 instanceof AbstractC28486l.b) {
                int currentStep = aVar.getCurrentStep();
                DateTime lastStepTime = aVar.getLastStepTime();
                RemoteCampaign remoteCampaign = aVar.getRemoteCampaign();
                AbstractC22676k.m65747g(remoteCampaign);
                AbstractC28490p abstractC28490pM86787a = AbstractC28491q.m86787a(currentStep, lastStepTime, remoteCampaign.getProtocolSteps(), this.dateAndTimeProvider);
                Integer lastLoggedStep = aVar.getLastLoggedStep();
                int currentStep2 = aVar.getCurrentStep();
                if (lastLoggedStep == null || lastLoggedStep.intValue() != currentStep2) {
                    C28480f c28480f = this.logger;
                    ProtocolStepWithOptions protocolStepWithOptions = aVar.getRemoteCampaign().getProtocolSteps().get(aVar.getCurrentStep());
                    LabsSession session2 = aVar.getRemoteCampaign().getCampaign().getSession();
                    c28480f.m86708B(protocolStepWithOptions, abstractC28490pM86787a, session2 != null ? new Integer(session2.getCampaignSessionId()) : null);
                    WhoopLabsService whoopLabsService = this.service;
                    if (whoopLabsService == null) {
                        AbstractC22676k.m65757q(NotificationCompat.CATEGORY_SERVICE);
                        throw null;
                    }
                    DateTime startTime = whoopLabsService.m28476r().getStartTime();
                    if (startTime != null) {
                        C41178b c41178b = this.analytics;
                        WhoopLabsService whoopLabsService2 = this.service;
                        if (whoopLabsService2 == null) {
                            AbstractC22676k.m65757q(NotificationCompat.CATEGORY_SERVICE);
                            throw null;
                        }
                        String strValueOf = String.valueOf(whoopLabsService2.m28476r().getCampaignId());
                        C23465k c23465k = new C23465k("Day Number", new Integer(Days.daysBetween(startTime.toLocalDate(), this.dateAndTimeProvider.mo133365d()).getDays() + 1));
                        LabsSession session3 = aVar.getRemoteCampaign().getCampaign().getSession();
                        c41178b.m133828a(new AbstractC41177a.h(null, strValueOf, AbstractC25247g0.m73990Y(c23465k, new C23465k("Session ID", session3 != null ? new Integer(session3.getCampaignSessionId()) : null), new C23465k("Step ID", new Integer(aVar.getRemoteCampaign().getProtocolSteps().get(aVar.getCurrentStep()).getProtocolStep().getId()))), 1, null));
                    }
                }
                AbstractC28486l.b bVar = (AbstractC28486l.b) abstractC28486l2;
                InterfaceC28476b interfaceC28476bM86655e1 = m86655e1(aVar.getStudyConfig(), new C26954j0(this, bVar, abstractC28490pM86787a, 8));
                DateTime dateTimeMo86785b = abstractC28490pM86787a.getStartTime();
                InterfaceC28476b.f fVarM86742a = bVar.getCampaignStepDomainState();
                InterfaceC28476b.h hVar2 = fVarM86742a instanceof InterfaceC28476b.h ? (InterfaceC28476b.h) fVarM86742a : null;
                Integer numM86735e = (hVar2 == null || (inputConfig4 = hVar2.getInputConfig()) == null) ? null : inputConfig4.getMin();
                InterfaceC28476b.f fVarM86742a2 = bVar.getCampaignStepDomainState();
                InterfaceC28476b.h hVar3 = fVarM86742a2 instanceof InterfaceC28476b.h ? (InterfaceC28476b.h) fVarM86742a2 : null;
                String strM86736f = (hVar3 == null || (inputConfig3 = hVar3.getInputConfig()) == null) ? null : inputConfig3.getMinErrorText();
                InterfaceC28476b.f fVarM86742a3 = bVar.getCampaignStepDomainState();
                InterfaceC28476b.h hVar4 = fVarM86742a3 instanceof InterfaceC28476b.h ? (InterfaceC28476b.h) fVarM86742a3 : null;
                Integer numM86733c = (hVar4 == null || (inputConfig2 = hVar4.getInputConfig()) == null) ? null : inputConfig2.getMax();
                InterfaceC28476b.f fVarM86742a4 = bVar.getCampaignStepDomainState();
                InterfaceC28476b.h hVar5 = fVarM86742a4 instanceof InterfaceC28476b.h ? (InterfaceC28476b.h) fVarM86742a4 : null;
                if (hVar5 != null && (inputConfig = hVar5.getInputConfig()) != null) {
                    strM86734d = inputConfig.getMaxErrorText();
                }
                return a.m86698b(aVar, interfaceC28476bM86655e1, null, null, null, null, dateTimeMo86785b, 0, null, null, numM86735e, numM86733c, strM86736f, strM86734d, new Integer(aVar.getCurrentStep()), 478, null);
            }
            if (abstractC28486l2 instanceof AbstractC28486l.m) {
                return a.m86698b(aVar, m86655e1(aVar.getStudyConfig(), new C28402f(11)), null, null, null, null, null, 0, null, null, null, null, null, null, null, 16382, null);
            }
            if (abstractC28486l2 instanceof AbstractC28486l.n) {
                return a.m86698b(aVar, new InterfaceC28476b.p(AbstractC22820a.f89923d, AbstractC22820a.f89921b, AbstractC22820a.f89922c), null, null, null, null, null, 0, null, null, null, null, null, null, null, 16382, null);
            }
            if (abstractC28486l2 instanceof AbstractC28486l.x) {
                this.scanner.m77504p();
                this.scannerJob.cancel((CancellationException) null);
                return a.m86698b(aVar, m86655e1(aVar.getStudyConfig(), new C28402f(6)), null, null, null, null, null, 0, null, null, null, null, null, null, null, 16382, null);
            }
            if (abstractC28486l2 instanceof AbstractC28486l.y) {
                C28480f c28480f2 = this.logger;
                RemoteCampaign remoteCampaign2 = aVar.getRemoteCampaign();
                Integer num2 = (remoteCampaign2 == null || (campaign2 = remoteCampaign2.getCampaign()) == null) ? null : new Integer(campaign2.getCampaignId());
                RemoteCampaign remoteCampaign3 = aVar.getRemoteCampaign();
                if (remoteCampaign3 != null && (campaign = remoteCampaign3.getCampaign()) != null && (session = campaign.getSession()) != null) {
                    num = new Integer(session.getCampaignSessionId());
                }
                c28480f2.m86707A("Session Submitted successfully, campaignId: " + num2 + ", sessionId: " + num);
                final int i15 = 0;
                return a.m86698b(aVar, m86655e1(aVar.getStudyConfig(), new Function1(this) { // from class: oy2.c

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ C28479e f115015x;

                    {
                        this.f115015x = this;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        switch (i15) {
                            case 0:
                                return C28479e.m86596D0(this.f115015x, (CampaignStepConfigResponse) obj4);
                            case 1:
                                return C28479e.m86604H0(this.f115015x, (ProtocolStepResult) obj4);
                            case 2:
                                return C28479e.m86610K0(this.f115015x, (ProtocolStepResult) obj4);
                            default:
                                return C28479e.m86616N0(this.f115015x, (ProtocolStepResult) obj4);
                        }
                    }
                }), null, null, null, null, null, 0, null, null, null, null, null, null, null, 16382, null);
            }
            if (AbstractC22676k.m65745e(abstractC28486l2, AbstractC28486l.z.f115356a)) {
                return a.m86698b(aVar, m86655e1(aVar.getStudyConfig(), new C28402f(7)), null, null, null, null, null, 0, null, null, null, null, null, null, null, 16382, null);
            }
            aVar2 = aVar;
            if (abstractC28486l2 instanceof AbstractC28486l.c) {
                this.scanner.m77504p();
                this.scannerJob.cancel((CancellationException) null);
                if (aVar2.getRemoteCampaign() != null) {
                    RemoteCampaign remoteCampaign4 = aVar2.getRemoteCampaign();
                    yVar.f115269w = aVar2;
                    yVar.f115270x = abstractC28486l2;
                    yVar.f115271y = null;
                    yVar.f115272z = aVar2;
                    yVar.f115265E = 0;
                    yVar.f115268H = 1;
                    objM86661h0 = m86661h0(remoteCampaign4, yVar);
                    if (objM86661h0 != obj2) {
                        aVar4 = aVar2;
                        aVarM86698b = a.m86698b(aVar4, (InterfaceC28476b) objM86661h0, null, null, null, null, null, 0, null, null, null, null, null, null, null, 16382, null);
                        if (aVarM86698b != null) {
                            return aVarM86698b;
                        }
                    }
                }
            } else {
                if (abstractC28486l2 instanceof AbstractC28486l.d0) {
                    return a.m86698b(aVar, null, null, null, null, null, null, ((AbstractC28486l.d0) abstractC28486l2).getStep(), null, null, null, null, null, null, null, 16319, null);
                }
                if (AbstractC22676k.m65745e(abstractC28486l2, AbstractC28486l.h.f115331a) || AbstractC22676k.m65745e(abstractC28486l2, AbstractC28486l.r.f115344a)) {
                    return aVar;
                }
                if (abstractC28486l2 instanceof AbstractC28486l.g) {
                    InterfaceC28476b domainState3 = aVar.getDomainState();
                    InterfaceC28476b.c cVar = (InterfaceC28476b.c) (domainState3 instanceof InterfaceC28476b.c ? domainState3 : null);
                    if (cVar != null) {
                        final int i16 = 1;
                        InterfaceC28476b interfaceC28476bM77452a = AbstractC26034a.m77452a(cVar, ((AbstractC28486l.g) abstractC28486l2).getReading(), this.dateAndTimeProvider, new C24947b(27), new C28402f(8), new Function1(this) { // from class: oy2.c

                            /* JADX INFO: renamed from: x */
                            public final /* synthetic */ C28479e f115015x;

                            {
                                this.f115015x = this;
                            }

                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i16) {
                                    case 0:
                                        return C28479e.m86596D0(this.f115015x, (CampaignStepConfigResponse) obj4);
                                    case 1:
                                        return C28479e.m86604H0(this.f115015x, (ProtocolStepResult) obj4);
                                    case 2:
                                        return C28479e.m86610K0(this.f115015x, (ProtocolStepResult) obj4);
                                    default:
                                        return C28479e.m86616N0(this.f115015x, (ProtocolStepResult) obj4);
                                }
                            }
                        });
                        if (interfaceC28476bM77452a == null) {
                            this.logger.m86709y("Error casting " + domainState3);
                        } else {
                            domainState3 = interfaceC28476bM77452a;
                        }
                    } else {
                        this.logger.m86709y("Error casting " + domainState3);
                    }
                    return a.m86698b(aVar, domainState3, null, null, null, null, null, 0, null, null, null, null, null, null, null, 16382, null);
                }
                if (abstractC28486l2 instanceof AbstractC28486l.o) {
                    InterfaceC28476b domainState4 = aVar.getDomainState();
                    InterfaceC28476b.c cVar2 = (InterfaceC28476b.c) (domainState4 instanceof InterfaceC28476b.c ? domainState4 : null);
                    if (cVar2 != null) {
                        final int i17 = 2;
                        InterfaceC28476b interfaceC28476bM77452a2 = AbstractC26034a.m77452a(cVar2, ((AbstractC28486l.o) abstractC28486l2).getReading(), this.dateAndTimeProvider, new C24947b(28), new C28402f(9), new Function1(this) { // from class: oy2.c

                            /* JADX INFO: renamed from: x */
                            public final /* synthetic */ C28479e f115015x;

                            {
                                this.f115015x = this;
                            }

                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i17) {
                                    case 0:
                                        return C28479e.m86596D0(this.f115015x, (CampaignStepConfigResponse) obj4);
                                    case 1:
                                        return C28479e.m86604H0(this.f115015x, (ProtocolStepResult) obj4);
                                    case 2:
                                        return C28479e.m86610K0(this.f115015x, (ProtocolStepResult) obj4);
                                    default:
                                        return C28479e.m86616N0(this.f115015x, (ProtocolStepResult) obj4);
                                }
                            }
                        });
                        if (interfaceC28476bM77452a2 == null) {
                            this.logger.m86709y("Error casting " + domainState4);
                        } else {
                            domainState4 = interfaceC28476bM77452a2;
                        }
                    } else {
                        this.logger.m86709y("Error casting " + domainState4);
                    }
                    return a.m86698b(aVar, domainState4, null, null, null, null, null, 0, null, null, null, null, null, null, null, 16382, null);
                }
                if (abstractC28486l2 instanceof AbstractC28486l.a0) {
                    InterfaceC28476b domainState5 = aVar.getDomainState();
                    InterfaceC28476b.c cVar3 = (InterfaceC28476b.c) (domainState5 instanceof InterfaceC28476b.c ? domainState5 : null);
                    if (cVar3 != null) {
                        final int i18 = 3;
                        InterfaceC28476b interfaceC28476bM77452a3 = AbstractC26034a.m77452a(cVar3, ((AbstractC28486l.a0) abstractC28486l2).getReading(), this.dateAndTimeProvider, new C24947b(29), new C28402f(10), new Function1(this) { // from class: oy2.c

                            /* JADX INFO: renamed from: x */
                            public final /* synthetic */ C28479e f115015x;

                            {
                                this.f115015x = this;
                            }

                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i18) {
                                    case 0:
                                        return C28479e.m86596D0(this.f115015x, (CampaignStepConfigResponse) obj4);
                                    case 1:
                                        return C28479e.m86604H0(this.f115015x, (ProtocolStepResult) obj4);
                                    case 2:
                                        return C28479e.m86610K0(this.f115015x, (ProtocolStepResult) obj4);
                                    default:
                                        return C28479e.m86616N0(this.f115015x, (ProtocolStepResult) obj4);
                                }
                            }
                        });
                        if (interfaceC28476bM77452a3 == null) {
                            this.logger.m86709y("Error casting " + domainState5);
                        } else {
                            domainState5 = interfaceC28476bM77452a3;
                        }
                    } else {
                        this.logger.m86709y("Error casting " + domainState5);
                    }
                    return a.m86698b(aVar, domainState5, null, null, null, null, null, 0, null, null, null, null, null, null, null, 16382, null);
                }
                if (abstractC28486l2 instanceof AbstractC28486l.d) {
                    Iterator it = ((Iterable) this.scanner.getDeviceList().getValue()).iterator();
                    do {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                    } while (!AbstractC22676k.m65745e(((C39830b) next2).getAddress(), ((AbstractC28486l.d) abstractC28486l2).getAddress()));
                    C39830b c39830b = (C39830b) next2;
                    if (c39830b != null) {
                        c39830b.m127787h(true);
                    }
                    Iterator it3 = ((Iterable) this.scanner.getDeviceList().getValue()).iterator();
                    while (it3.hasNext()) {
                        ((C39830b) it3.next()).m127786g(false);
                    }
                    InterfaceC28476b interfaceC28476bM86651d0 = m86651d0(aVar.getDomainState(), (List) this.scanner.getDeviceList().getValue());
                    InterfaceC28476b.a aVar5 = interfaceC28476bM86651d0 instanceof InterfaceC28476b.a ? (InterfaceC28476b.a) interfaceC28476bM86651d0 : null;
                    if (aVar5 == null || (domainState = InterfaceC28476b.q.f115003a.mo86413b(aVar5, true)) == null) {
                        this.logger.m86709y("Error: error casting ConnectingDevice");
                        domainState = aVar.getDomainState();
                    }
                    return a.m86698b(aVar, domainState, null, null, null, null, null, 0, null, null, null, null, null, null, null, 16382, null);
                }
                if (abstractC28486l2 instanceof AbstractC28486l.f) {
                    Iterator it4 = ((Iterable) this.scanner.getDeviceList().getValue()).iterator();
                    do {
                        if (!it4.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it4.next();
                    } while (!AbstractC22676k.m65745e(((C39830b) next).getAddress(), ((AbstractC28486l.f) abstractC28486l2).getAddress()));
                    C39830b c39830b2 = (C39830b) next;
                    if (c39830b2 != null) {
                        c39830b2.m127787h(false);
                        c39830b2.m127786g(true);
                    }
                    InterfaceC28476b domainState6 = aVar.getDomainState();
                    InterfaceC28476b.a aVar6 = (InterfaceC28476b.a) (domainState6 instanceof InterfaceC28476b.a ? domainState6 : null);
                    if (aVar6 == null || (interfaceC28476bMo86413b = aVar6.mo86413b(aVar6, false)) == null) {
                        this.logger.m86709y("Error casting " + domainState6);
                    } else {
                        domainState6 = interfaceC28476bMo86413b;
                    }
                    return a.m86698b(aVar, m86651d0(domainState6, (List) this.scanner.getDeviceList().getValue()), null, null, null, null, null, 0, null, null, null, null, null, null, null, 16382, null);
                }
                if (abstractC28486l2 instanceof AbstractC28486l.j) {
                    for (Object obj4 : (Iterable) this.scanner.getDeviceList().getValue()) {
                        if (AbstractC22676k.m65745e(((C39830b) obj4).getAddress(), ((AbstractC28486l.j) abstractC28486l2).getAddress())) {
                            obj3 = obj4;
                            break;
                        }
                    }
                    C39830b c39830b3 = (C39830b) obj3;
                    if (c39830b3 != null) {
                        c39830b3.m127787h(false);
                        c39830b3.m127786g(false);
                    }
                    final AbstractC28486l.j jVar = (AbstractC28486l.j) abstractC28486l2;
                    final int i19 = 1;
                    return a.m86698b(aVar, m86655e1(aVar.getStudyConfig(), new Function1(this) { // from class: oy2.d

                        /* JADX INFO: renamed from: x */
                        public final /* synthetic */ C28479e f115017x;

                        {
                            this.f115017x = this;
                        }

                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            switch (i19) {
                                case 0:
                                    return C28479e.m86592B0(this.f115017x, (C28479e.a) jVar, (CampaignStepConfigResponse) obj5);
                                default:
                                    return C28479e.m86693y0(this.f115017x, (AbstractC28486l.j) jVar, (CampaignStepConfigResponse) obj5);
                            }
                        }
                    }), null, null, null, null, null, 0, null, null, null, null, null, null, null, 16382, null);
                }
                if (abstractC28486l2 instanceof AbstractC28486l.l) {
                    return a.m86698b(aVar, m86655e1(aVar.getStudyConfig(), new C26944e0((AbstractC28486l.l) abstractC28486l2, 19)), null, null, null, null, null, 0, null, null, null, null, null, null, null, 16382, null);
                }
                if (abstractC28486l2 instanceof AbstractC28486l.t) {
                    InterfaceC28476b domainState7 = aVar.getDomainState();
                    InterfaceC28476b.e eVar = (InterfaceC28476b.e) (domainState7 instanceof InterfaceC28476b.e ? domainState7 : null);
                    if (eVar != null) {
                        AbstractC28486l.t tVar = (AbstractC28486l.t) abstractC28486l2;
                        InterfaceC28476b.e eVarM86498i = AbstractC22676k.m65745e(eVar.getSelected(), tVar.getKey()) ? InterfaceC28476b.e.m86498i(eVar, null, null, null, false, false, null, null, null, null, false, 767, null) : InterfaceC28476b.e.m86498i(eVar, null, null, null, false, false, null, null, null, tVar.getKey(), false, 767, null);
                        if (eVarM86498i == null) {
                            this.logger.m86709y("Error casting " + domainState7);
                        } else {
                            domainState7 = eVarM86498i;
                        }
                    } else {
                        this.logger.m86709y("Error casting " + domainState7);
                    }
                    return a.m86698b(aVar, domainState7, null, null, null, null, null, 0, null, null, null, null, null, null, null, 16382, null);
                }
                if (abstractC28486l2 instanceof AbstractC28486l.s) {
                    InterfaceC28476b domainState8 = aVar.getDomainState();
                    InterfaceC28476b.d dVar = (InterfaceC28476b.d) (domainState8 instanceof InterfaceC28476b.d ? domainState8 : null);
                    if (dVar == null || (dVarM86486i = InterfaceC28476b.d.m86486i(dVar, null, null, null, false, false, null, null, false, null, ((AbstractC28486l.s) abstractC28486l2).getValue(), null, 1535, null)) == null) {
                        this.logger.m86709y("Error casting " + domainState8);
                    } else {
                        domainState8 = dVarM86486i;
                    }
                    return a.m86698b(aVar, domainState8, null, null, null, null, null, 0, null, null, null, null, null, null, null, 16382, null);
                }
                if (!(abstractC28486l2 instanceof AbstractC28486l.b0)) {
                    if (abstractC28486l2 instanceof AbstractC28486l.u) {
                        int currentStep3 = aVar.getCurrentStep();
                        DateTime lastStepTime2 = aVar.getLastStepTime();
                        RemoteCampaign remoteCampaign5 = aVar.getRemoteCampaign();
                        AbstractC22676k.m65747g(remoteCampaign5);
                        AbstractC28490p abstractC28490pM86787a2 = AbstractC28491q.m86787a(currentStep3, lastStepTime2, remoteCampaign5.getProtocolSteps(), this.dateAndTimeProvider);
                        InterfaceC28476b domainState9 = aVar.getDomainState();
                        InterfaceC28476b.f fVar = (InterfaceC28476b.f) (domainState9 instanceof InterfaceC28476b.f ? domainState9 : null);
                        if (fVar == null || (fVarMo86418g = fVar.mo86418g(fVar, abstractC28490pM86787a2)) == null) {
                            this.logger.m86709y("Error casting " + domainState9);
                        } else {
                            domainState9 = fVarMo86418g;
                        }
                        return a.m86698b(aVar, domainState9, null, null, null, null, null, 0, null, null, null, null, null, null, null, 16382, null);
                    }
                    if (abstractC28486l2 instanceof AbstractC28486l.c0) {
                        InterfaceC28476b domainState10 = aVar.getDomainState();
                        InterfaceC28476b.j jVar2 = (InterfaceC28476b.j) (domainState10 instanceof InterfaceC28476b.j ? domainState10 : null);
                        if (jVar2 != null) {
                            AbstractC28486l.c0 c0Var = (AbstractC28486l.c0) abstractC28486l2;
                            InterfaceC28476b.j jVarM86550i = InterfaceC28476b.j.m86550i(jVar2, null, null, null, false, false, null, null, c0Var.getHour(), c0Var.getMinutes(), 127, null);
                            if (jVarM86550i == null) {
                                this.logger.m86709y("Error casting " + domainState10);
                            } else {
                                domainState10 = jVarM86550i;
                            }
                        } else {
                            this.logger.m86709y("Error casting " + domainState10);
                        }
                        return a.m86698b(aVar, domainState10, null, null, null, null, null, 0, null, null, null, null, null, null, null, 16382, null);
                    }
                    if (abstractC28486l2 instanceof AbstractC28486l.e) {
                        InterfaceC28476b domainState11 = aVar.getDomainState();
                        InterfaceC28476b.b bVar2 = (InterfaceC28476b.b) (domainState11 instanceof InterfaceC28476b.b ? domainState11 : null);
                        if (bVar2 != null) {
                            AbstractC28486l.e eVar2 = (AbstractC28486l.e) abstractC28486l2;
                            InterfaceC28476b.b bVarM86432i = InterfaceC28476b.b.m86432i(bVar2, null, null, null, false, false, null, eVar2.getIsUserInteraction(), false, null, eVar2.getYear(), eVar2.getMonth(), eVar2.getDay(), eVar2.getHour(), eVar2.getMinutes(), null, 16831, null);
                            if (bVarM86432i == null) {
                                this.logger.m86709y("Error casting " + domainState11);
                            } else {
                                domainState11 = bVarM86432i;
                            }
                        } else {
                            this.logger.m86709y("Error casting " + domainState11);
                        }
                        return a.m86698b(aVar, domainState11, null, null, null, null, null, 0, null, null, null, null, null, null, null, 16382, null);
                    }
                    if (abstractC28486l2 instanceof AbstractC28486l.k) {
                        AbstractC28486l.k kVar = (AbstractC28486l.k) abstractC28486l2;
                        this.logger.m86707A("Error loading web view: " + kVar.getMessage());
                        m86632V0(kVar.getSurveyProvider(), kVar.getMessage());
                        final int i24 = 0;
                        return a.m86698b(aVar, m86655e1(aVar.getStudyConfig(), new Function1(this) { // from class: oy2.d

                            /* JADX INFO: renamed from: x */
                            public final /* synthetic */ C28479e f115017x;

                            {
                                this.f115017x = this;
                            }

                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                switch (i24) {
                                    case 0:
                                        return C28479e.m86592B0(this.f115017x, (C28479e.a) aVar, (CampaignStepConfigResponse) obj5);
                                    default:
                                        return C28479e.m86693y0(this.f115017x, (AbstractC28486l.j) aVar, (CampaignStepConfigResponse) obj5);
                                }
                            }
                        }), null, null, null, null, null, 0, null, null, null, null, null, null, null, 16382, null);
                    }
                    if (abstractC28486l2 instanceof AbstractC28486l.p) {
                        AbstractC28486l.p pVar = (AbstractC28486l.p) abstractC28486l2;
                        return a.m86698b(aVar, m86651d0(aVar.getDomainState(), pVar.m86766a()), null, null, null, null, null, 0, pVar.m86766a(), null, null, null, null, null, null, 16254, null);
                    }
                    if (!AbstractC22676k.m65745e(abstractC28486l2, AbstractC28486l.a.f115313a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC28476b domainState12 = aVar.getDomainState();
                    InterfaceC28476b.a aVar7 = (InterfaceC28476b.a) (domainState12 instanceof InterfaceC28476b.a ? domainState12 : null);
                    if (aVar7 != null) {
                        m86624R0(aVar7.getRequiredRegex(), aVar7.getBlockedRegex());
                        return aVar;
                    }
                    this.logger.m86709y("Error casting " + domainState12);
                    return aVar;
                }
                String strM86743a = ((AbstractC28486l.b0) abstractC28486l2).getText();
                yVar.f115269w = aVar;
                yVar.f115270x = abstractC28486l2;
                yVar.f115268H = 2;
                if (m86622Q0(strM86743a, yVar) != obj2) {
                    aVar3 = aVar;
                    domainState2 = aVar3.getDomainState();
                    hVar = (InterfaceC28476b.h) (domainState2 instanceof InterfaceC28476b.h ? domainState2 : null);
                    if (hVar != null) {
                        this.logger.m86709y("Error casting " + domainState2);
                        interfaceC28476b = domainState2;
                    } else {
                        this.logger.m86709y("Error casting " + domainState2);
                        interfaceC28476b = domainState2;
                    }
                    return a.m86698b(aVar3, interfaceC28476b, null, null, null, null, null, 0, null, null, null, null, null, null, null, 16382, null);
                }
            }
            return obj2;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC28486l2 = (AbstractC28486l) yVar.f115270x;
            a aVar8 = (a) yVar.f115269w;
            AbstractC34132o.m107864I(obj);
            aVar3 = aVar8;
            domainState2 = aVar3.getDomainState();
            hVar = (InterfaceC28476b.h) (domainState2 instanceof InterfaceC28476b.h ? domainState2 : null);
            if (hVar != null || (hVarM86527i = InterfaceC28476b.h.m86527i(hVar, null, null, null, false, false, null, 0, null, false, null, ((AbstractC28486l.b0) abstractC28486l2).getText(), 1023, null)) == null) {
                this.logger.m86709y("Error casting " + domainState2);
                interfaceC28476b = domainState2;
            } else {
                interfaceC28476b = hVarM86527i;
            }
            return a.m86698b(aVar3, interfaceC28476b, null, null, null, null, null, 0, null, null, null, null, null, null, null, 16382, null);
        }
        a aVar9 = (a) yVar.f115272z;
        AbstractC28486l abstractC28486l3 = (AbstractC28486l) yVar.f115270x;
        a aVar10 = (a) yVar.f115269w;
        AbstractC34132o.m107864I(obj);
        objM86661h0 = obj;
        aVar2 = aVar10;
        aVar4 = aVar9;
        abstractC28486l2 = abstractC28486l3;
        aVarM86698b = a.m86698b(aVar4, (InterfaceC28476b) objM86661h0, null, null, null, null, null, 0, null, null, null, null, null, null, null, 16382, null);
        if (aVarM86698b != null) {
            return aVarM86698b;
        }
        AbstractC28486l.c cVar4 = (AbstractC28486l.c) abstractC28486l2;
        return a.m86698b(aVar2, new InterfaceC28476b.m(cVar4.getCampaignId(), new Integer(cVar4.getSessionId()), null, null, null, null, 60, null), null, null, null, null, null, 0, null, null, null, null, null, null, null, 16382, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final InterfaceC28476b m86691x0(C28479e c28479e, AbstractC28486l abstractC28486l, AbstractC28490p abstractC28490p, CampaignStepConfigResponse config) {
        InterfaceC28476b.f fVarMo86418g;
        AbstractC22676k.m65750j(config, "config");
        AbstractC28486l.b bVar = (AbstractC28486l.b) abstractC28486l;
        InterfaceC28476b interfaceC28476bM86651d0 = c28479e.m86651d0(bVar.getCampaignStepDomainState(), (List) c28479e.scanner.getDeviceList().getValue());
        InterfaceC28476b.f fVar = (InterfaceC28476b.f) (!(interfaceC28476bM86651d0 instanceof InterfaceC28476b.f) ? null : interfaceC28476bM86651d0);
        if (fVar != null && (fVarMo86418g = fVar.mo86418g(fVar.mo86417f(fVar.mo86414c(fVar, fVar.mo86415d(config)), bVar.getCampaignStepDomainState().getIsCancelStudyShowing()), abstractC28490p)) != null) {
            return fVarMo86418g;
        }
        c28479e.logger.m86709y("Error casting " + interfaceC28476bM86651d0);
        return interfaceC28476bM86651d0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final InterfaceC28476b m86693y0(C28479e c28479e, AbstractC28486l abstractC28486l, CampaignStepConfigResponse config) {
        AbstractC22676k.m65750j(config, "config");
        return new InterfaceC28476b.n(c28479e.m86672n0(), ((AbstractC28486l.j) abstractC28486l).getAddress(), config.getStartErrorTitle(), config.getStartErrorBtHrFailedBody(), config.getStartErrorPositiveCta(), config.getCancelDialogPositiveCta());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final InterfaceC28476b m86695z0(AbstractC28486l abstractC28486l, CampaignStepConfigResponse config) {
        AbstractC22676k.m65750j(config, "config");
        AbstractC28486l.l lVar = (AbstractC28486l.l) abstractC28486l;
        return new InterfaceC28476b.m(lVar.getCampaignId(), lVar.getSessionId(), config.getStartErrorTitle(), config.getStartErrorMissingStrapBody(), config.getStartErrorPositiveCta(), config.getStartErrorNegativeCta());
    }

    @Override // of3.InterfaceC27903a
    public /* bridge */ C26669a getKoin() {
        return AbstractC34132o.m107856A(this);
    }

    /* JADX INFO: renamed from: m0 */
    public final Object m86696m0(WhoopLabsStudy whoopLabsStudy, C13732c c13732c, C41178b c41178b, InterfaceC41070a interfaceC41070a, WhoopLabsService whoopLabsService, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
        return AbstractC3006f0.m8705K(C3075y1.f12109w, new i(whoopLabsStudy, c13732c, this, whoopLabsService, c41178b, interfaceC41070a, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: s0 */
    public final InterfaceC13058l m86697s0(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36610t(new r(new C13060l1(new a(InterfaceC28476b.q.f115003a, null, null, null, null, null, 0, null, null, null, null, null, null, null, 16382, null), AbstractC13091v.m36584J(AbstractC13091v.m36590P(upstream, new q(null, this)), this.hrDevicesFlow), new s(null))));
    }

    /* JADX INFO: renamed from: oy2.e$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b(\b\u0082\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001b\u0010\u001cJÄ\u0001\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010'\u001a\u0004\b(\u0010)R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b(\u00102\u001a\u0004\b3\u00104R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b9\u0010;R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b7\u0010<\u001a\u0004\b.\u0010\"R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00048\u0006¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b=\u0010-R\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b>\u0010+\u001a\u0004\b?\u0010-R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\bE\u0010CR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010 R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bI\u0010G\u001a\u0004\bJ\u0010 R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bK\u0010A\u001a\u0004\b5\u0010C¨\u0006L"}, m65681d2 = {"Loy2/e$a;", "", "Loy2/b;", "domainState", "", "Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;", "steps", "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;", "study", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;", "studyConfig", "Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;", "remoteCampaign", "Lorg/joda/time/DateTime;", "lastStepTime", "", "currentStep", "Lyw2/b;", "hrDevices", "Lcom/whoop/whooplabs/data/domain/OptionSelection;", "options", "minLength", "maxLength", "", "minLengthText", "maxLengthText", "lastLoggedStep", "<init>", "(Loy2/b;Ljava/util/List;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;Lorg/joda/time/DateTime;ILjava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "a", "(Loy2/b;Ljava/util/List;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;Lorg/joda/time/DateTime;ILjava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Loy2/e$a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loy2/b;", "d", "()Loy2/b;", "b", "Ljava/util/List;", "getSteps", "()Ljava/util/List;", "c", "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;", "getStudy", "()Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;", "e", "Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;", "g", "()Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;", "f", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "I", "getHrDevices", "i", "getOptions", "j", "Ljava/lang/Integer;", "getMinLength", "()Ljava/lang/Integer;", "k", "getMaxLength", "l", "Ljava/lang/String;", "getMinLengthText", "m", "getMaxLengthText", "n", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC28476b domainState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<ProtocolStepWithOptions> steps;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final WhoopLabsStudy study;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final CampaignStepConfigResponse studyConfig;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final RemoteCampaign remoteCampaign;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final DateTime lastStepTime;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final int currentStep;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final List<C39830b> hrDevices;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final List<OptionSelection> options;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final Integer minLength;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final Integer maxLength;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final String minLengthText;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final String maxLengthText;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final Integer lastLoggedStep;

        public a(InterfaceC28476b domainState, List<ProtocolStepWithOptions> list, WhoopLabsStudy whoopLabsStudy, CampaignStepConfigResponse campaignStepConfigResponse, RemoteCampaign remoteCampaign, DateTime dateTime, int i13, List<C39830b> hrDevices, List<OptionSelection> list2, Integer num, Integer num2, String str, String str2, Integer num3) {
            AbstractC22676k.m65750j(domainState, "domainState");
            AbstractC22676k.m65750j(hrDevices, "hrDevices");
            this.domainState = domainState;
            this.steps = list;
            this.study = whoopLabsStudy;
            this.studyConfig = campaignStepConfigResponse;
            this.remoteCampaign = remoteCampaign;
            this.lastStepTime = dateTime;
            this.currentStep = i13;
            this.hrDevices = hrDevices;
            this.options = list2;
            this.minLength = num;
            this.maxLength = num2;
            this.minLengthText = str;
            this.maxLengthText = str2;
            this.lastLoggedStep = num3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ a m86698b(a aVar, InterfaceC28476b interfaceC28476b, List list, WhoopLabsStudy whoopLabsStudy, CampaignStepConfigResponse campaignStepConfigResponse, RemoteCampaign remoteCampaign, DateTime dateTime, int i13, List list2, List list3, Integer num, Integer num2, String str, String str2, Integer num3, int i14, Object obj) {
            return aVar.m86699a((i14 & 1) != 0 ? aVar.domainState : interfaceC28476b, (i14 & 2) != 0 ? aVar.steps : list, (i14 & 4) != 0 ? aVar.study : whoopLabsStudy, (i14 & 8) != 0 ? aVar.studyConfig : campaignStepConfigResponse, (i14 & 16) != 0 ? aVar.remoteCampaign : remoteCampaign, (i14 & 32) != 0 ? aVar.lastStepTime : dateTime, (i14 & 64) != 0 ? aVar.currentStep : i13, (i14 & 128) != 0 ? aVar.hrDevices : list2, (i14 & 256) != 0 ? aVar.options : list3, (i14 & 512) != 0 ? aVar.minLength : num, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? aVar.maxLength : num2, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? aVar.minLengthText : str, (i14 & 4096) != 0 ? aVar.maxLengthText : str2, (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? aVar.lastLoggedStep : num3);
        }

        /* JADX INFO: renamed from: a */
        public final a m86699a(InterfaceC28476b domainState, List<ProtocolStepWithOptions> steps, WhoopLabsStudy study, CampaignStepConfigResponse studyConfig, RemoteCampaign remoteCampaign, DateTime lastStepTime, int currentStep, List<C39830b> hrDevices, List<OptionSelection> options, Integer minLength, Integer maxLength, String minLengthText, String maxLengthText, Integer lastLoggedStep) {
            AbstractC22676k.m65750j(domainState, "domainState");
            AbstractC22676k.m65750j(hrDevices, "hrDevices");
            return new a(domainState, steps, study, studyConfig, remoteCampaign, lastStepTime, currentStep, hrDevices, options, minLength, maxLength, minLengthText, maxLengthText, lastLoggedStep);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getCurrentStep() {
            return this.currentStep;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final InterfaceC28476b getDomainState() {
            return this.domainState;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Integer getLastLoggedStep() {
            return this.lastLoggedStep;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.domainState, aVar.domainState) && AbstractC22676k.m65745e(this.steps, aVar.steps) && AbstractC22676k.m65745e(this.study, aVar.study) && AbstractC22676k.m65745e(this.studyConfig, aVar.studyConfig) && AbstractC22676k.m65745e(this.remoteCampaign, aVar.remoteCampaign) && AbstractC22676k.m65745e(this.lastStepTime, aVar.lastStepTime) && this.currentStep == aVar.currentStep && AbstractC22676k.m65745e(this.hrDevices, aVar.hrDevices) && AbstractC22676k.m65745e(this.options, aVar.options) && AbstractC22676k.m65745e(this.minLength, aVar.minLength) && AbstractC22676k.m65745e(this.maxLength, aVar.maxLength) && AbstractC22676k.m65745e(this.minLengthText, aVar.minLengthText) && AbstractC22676k.m65745e(this.maxLengthText, aVar.maxLengthText) && AbstractC22676k.m65745e(this.lastLoggedStep, aVar.lastLoggedStep);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final DateTime getLastStepTime() {
            return this.lastStepTime;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final RemoteCampaign getRemoteCampaign() {
            return this.remoteCampaign;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final CampaignStepConfigResponse getStudyConfig() {
            return this.studyConfig;
        }

        public int hashCode() {
            int iHashCode = this.domainState.hashCode() * 31;
            List<ProtocolStepWithOptions> list = this.steps;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            WhoopLabsStudy whoopLabsStudy = this.study;
            int iHashCode3 = (iHashCode2 + (whoopLabsStudy == null ? 0 : whoopLabsStudy.hashCode())) * 31;
            CampaignStepConfigResponse campaignStepConfigResponse = this.studyConfig;
            int iHashCode4 = (iHashCode3 + (campaignStepConfigResponse == null ? 0 : campaignStepConfigResponse.hashCode())) * 31;
            RemoteCampaign remoteCampaign = this.remoteCampaign;
            int iHashCode5 = (iHashCode4 + (remoteCampaign == null ? 0 : remoteCampaign.hashCode())) * 31;
            DateTime dateTime = this.lastStepTime;
            int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.currentStep, (iHashCode5 + (dateTime == null ? 0 : dateTime.hashCode())) * 31, 31), 31, this.hrDevices);
            List<OptionSelection> list2 = this.options;
            int iHashCode6 = (iM31983b + (list2 == null ? 0 : list2.hashCode())) * 31;
            Integer num = this.minLength;
            int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.maxLength;
            int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str = this.minLengthText;
            int iHashCode9 = (iHashCode8 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.maxLengthText;
            int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num3 = this.lastLoggedStep;
            return iHashCode10 + (num3 != null ? num3.hashCode() : 0);
        }

        public String toString() {
            InterfaceC28476b interfaceC28476b = this.domainState;
            List<ProtocolStepWithOptions> list = this.steps;
            WhoopLabsStudy whoopLabsStudy = this.study;
            CampaignStepConfigResponse campaignStepConfigResponse = this.studyConfig;
            RemoteCampaign remoteCampaign = this.remoteCampaign;
            DateTime dateTime = this.lastStepTime;
            int i13 = this.currentStep;
            List<C39830b> list2 = this.hrDevices;
            List<OptionSelection> list3 = this.options;
            Integer num = this.minLength;
            Integer num2 = this.maxLength;
            String str = this.minLengthText;
            String str2 = this.maxLengthText;
            Integer num3 = this.lastLoggedStep;
            StringBuilder sb4 = new StringBuilder("Accumulator(domainState=");
            sb4.append(interfaceC28476b);
            sb4.append(", steps=");
            sb4.append(list);
            sb4.append(", study=");
            sb4.append(whoopLabsStudy);
            sb4.append(", studyConfig=");
            sb4.append(campaignStepConfigResponse);
            sb4.append(", remoteCampaign=");
            sb4.append(remoteCampaign);
            sb4.append(", lastStepTime=");
            sb4.append(dateTime);
            sb4.append(", currentStep=");
            sb4.append(i13);
            sb4.append(", hrDevices=");
            sb4.append(list2);
            sb4.append(", options=");
            sb4.append(list3);
            sb4.append(", minLength=");
            sb4.append(num);
            sb4.append(", maxLength=");
            AbstractC13673n.m38577x(num2, ", minLengthText=", str, ", maxLengthText=", sb4);
            sb4.append(str2);
            sb4.append(", lastLoggedStep=");
            sb4.append(num3);
            sb4.append(")");
            return sb4.toString();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ a(InterfaceC28476b interfaceC28476b, List list, WhoopLabsStudy whoopLabsStudy, CampaignStepConfigResponse campaignStepConfigResponse, RemoteCampaign remoteCampaign, DateTime dateTime, int i13, List list2, List list3, Integer num, Integer num2, String str, String str2, Integer num3, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            List list4 = (i14 & 2) != 0 ? null : list;
            WhoopLabsStudy whoopLabsStudy2 = (i14 & 4) != 0 ? null : whoopLabsStudy;
            CampaignStepConfigResponse campaignStepConfigResponse2 = (i14 & 8) != 0 ? null : campaignStepConfigResponse;
            RemoteCampaign remoteCampaign2 = (i14 & 16) != 0 ? null : remoteCampaign;
            DateTime dateTime2 = (i14 & 32) != 0 ? null : dateTime;
            int i15 = (i14 & 64) != 0 ? 0 : i13;
            int i16 = i14 & 128;
            List list5 = C25271y.f99162w;
            this(interfaceC28476b, list4, whoopLabsStudy2, campaignStepConfigResponse2, remoteCampaign2, dateTime2, i15, i16 != 0 ? list5 : list2, (i14 & 256) == 0 ? list3 : list5, (i14 & 512) != 0 ? null : num, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : num2, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str, (i14 & 4096) != 0 ? null : str2, (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : num3);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C28479e(C13732c c13732c, C10823a c10823a, InterfaceC2994c0 interfaceC2994c0, InterfaceC41070a interfaceC41070a, C28480f c28480f, C13731b c13731b, C41178b c41178b, InterfaceC4733b interfaceC4733b, InterfaceC16183e interfaceC16183e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 4) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            interfaceC2994c0 = AbstractC3006f0.m8708b(ExecutorC22364d.f87316w);
        }
        this(c13732c, c10823a, interfaceC2994c0, interfaceC41070a, c28480f, c13731b, c41178b, interfaceC4733b, interfaceC16183e);
    }
}
