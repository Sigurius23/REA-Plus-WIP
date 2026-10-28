package yw2;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import androidx.room.AbstractC1772c1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import bc3.InterfaceC3061u;
import c93.InterfaceC4351m;
import com.whoop.data.remote.api.FileDownloaderApi;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.util.TextResource;
import com.whoop.domain.model.User;
import com.whoop.domain.model.WhoopStrapInfo;
import com.whoop.whooplabs.data.domain.LabsCampaign;
import com.whoop.whooplabs.data.domain.LabsProtocol;
import com.whoop.whooplabs.data.domain.ProtocolStepWithOptions;
import com.whoop.whooplabs.data.network.WhoopLabsApi;
import com.whoop.whooplabs.data.room.entity.LastKnownStrapInfo;
import com.whoop.whooplabs.data.room.entity.ProtocolStepResult;
import com.whoop.whooplabs.data.room.entity.RemoteCampaign;
import com.whoop.whooplabs.data.room.entity.WhoopLabsHrDevice;
import com.whoop.whooplabs.data.room.entity.WhoopLabsHrDeviceKt;
import com.whoop.whooplabs.data.room.entity.WhoopLabsStudy;
import com.whoop.whooplabs.data.room.entity.WhoopLabsStudyKt;
import com.whoop.whooplabs.data.room.entity.WhoopLabsStudyTag;
import com.whoop.whooplabs.p070io.HrDeviceConnection;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import ec3.InterfaceC13087t1;
import ex2.C13732c;
import f93.InterfaceC14292d;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import jt0.InterfaceC21934a;
import l83.C23454a0;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import mz2.C26044c;
import mz2.C26046e;
import nf3.C26669a;
import no.nordicsemi.android.dfu.DfuBaseService;
import nz2.C27313g;
import of3.InterfaceC27903a;
import or2.C28144a0;
import or2.C28196r0;
import or2.C28199s0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDateTime;
import oz2.InterfaceC28499a;
import oz2.InterfaceC28501c;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22686q;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import retrofit2.HttpException;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import td1.InterfaceC33704b;
import tr2.InterfaceC34116n;
import ud3.AbstractC34799a1;
import ud3.AbstractC34846v0;
import ud3.C34818h0;
import ud3.C34834p0;
import ud3.C34844u0;
import yb3.AbstractC39421y;
import yb3.C39412p;
import z92.InterfaceC40205a;
import zr2.InterfaceC41070a;
import zw2.AbstractC41177a;
import zw2.C41178b;

/* JADX INFO: renamed from: yw2.h */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000¨\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B§\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010#\u001a\u00020\u0001\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,H\u0086@¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020,¢\u0006\u0004\b/\u00100J\u0018\u00103\u001a\u00020,2\u0006\u00102\u001a\u000201H\u0086@¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020,H\u0086@¢\u0006\u0004\b5\u0010.J\u0010\u00106\u001a\u00020,H\u0086@¢\u0006\u0004\b6\u0010.J\r\u00107\u001a\u00020,¢\u0006\u0004\b7\u00100J\u0010\u00109\u001a\u000208H\u0086@¢\u0006\u0004\b9\u0010.J\r\u0010:\u001a\u00020,¢\u0006\u0004\b:\u00100J\u0010\u0010;\u001a\u00020,H\u0086@¢\u0006\u0004\b;\u0010.J\u0010\u0010<\u001a\u000208H\u0086@¢\u0006\u0004\b<\u0010.J\u0017\u0010?\u001a\u00020,2\b\u0010>\u001a\u0004\u0018\u00010=¢\u0006\u0004\b?\u0010@J\u0018\u0010B\u001a\u0002082\u0006\u0010A\u001a\u00020=H\u0086@¢\u0006\u0004\bB\u0010CJ \u0010E\u001a\u0002082\u0006\u0010A\u001a\u00020=2\u0006\u0010D\u001a\u00020=H\u0087@¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u000208H\u0086@¢\u0006\u0004\bG\u0010.J\u0010\u0010H\u001a\u00020,H\u0086@¢\u0006\u0004\bH\u0010.J\u0010\u0010I\u001a\u00020,H\u0086@¢\u0006\u0004\bI\u0010.J\u0010\u0010J\u001a\u00020,H\u0082@¢\u0006\u0004\bJ\u0010.J\u0010\u0010K\u001a\u00020,H\u0082@¢\u0006\u0004\bK\u0010.J\u0010\u0010L\u001a\u00020,H\u0082@¢\u0006\u0004\bL\u0010.J\u0010\u0010M\u001a\u00020,H\u0082@¢\u0006\u0004\bM\u0010.J\u0018\u0010P\u001a\u00020,2\u0006\u0010O\u001a\u00020NH\u0082@¢\u0006\u0004\bP\u0010QJ\u0010\u0010R\u001a\u000208H\u0082@¢\u0006\u0004\bR\u0010.J\u001a\u0010T\u001a\u00020,2\b\b\u0002\u0010S\u001a\u000208H\u0082@¢\u0006\u0004\bT\u0010UJ\u001a\u0010X\u001a\u0002082\b\u0010W\u001a\u0004\u0018\u00010VH\u0082@¢\u0006\u0004\bX\u0010YJ\u0018\u0010\\\u001a\u0002082\u0006\u0010[\u001a\u00020ZH\u0082@¢\u0006\u0004\b\\\u0010]J\u0018\u0010^\u001a\u0002082\u0006\u0010[\u001a\u00020ZH\u0082@¢\u0006\u0004\b^\u0010]J\u0018\u0010`\u001a\u00020=2\u0006\u0010_\u001a\u00020=H\u0082@¢\u0006\u0004\b`\u0010CJ\u0017\u0010c\u001a\u00020,2\u0006\u0010b\u001a\u00020aH\u0002¢\u0006\u0004\bc\u0010dJ\u0010\u0010e\u001a\u000208H\u0082@¢\u0006\u0004\be\u0010.J\u0010\u0010f\u001a\u00020,H\u0082@¢\u0006\u0004\bf\u0010.J\u0010\u0010g\u001a\u000208H\u0082@¢\u0006\u0004\bg\u0010.J\u000f\u0010h\u001a\u000208H\u0002¢\u0006\u0004\bh\u0010iR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010jR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010kR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010lR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010mR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\bn\u0010|R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010\u007fR\u0015\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bB\u0010\u0080\u0001R\u0015\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bP\u0010\u0081\u0001R\u0015\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b-\u0010\u0082\u0001R\u0015\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b/\u0010\u0083\u0001R\u0015\u0010#\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b3\u0010\u0084\u0001R\u0015\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b5\u0010\u0085\u0001R\u0015\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b<\u0010\u0086\u0001R\u0015\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b6\u0010\u0087\u0001R\u0017\u0010\u008a\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bc\u0010\u0089\u0001R\u0018\u0010\u008c\u0001\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bf\u0010\u008b\u0001R*\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008d\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bT\u0010\u008e\u0001\u001a\u0005\br\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001a\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0016\u0010\u0096\u0001\u001a\u00030\u0095\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010vR\u001c\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0098\u0001R#\u0010\u009f\u0001\u001a\t\u0012\u0004\u0012\u0002080\u009a\u00018\u0006¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R#\u0010¢\u0001\u001a\n\u0012\u0005\u0012\u00030 \u00010\u009a\u00018\u0006¢\u0006\u000f\n\u0006\b¡\u0001\u0010\u009c\u0001\u001a\u0005\bz\u0010\u009e\u0001R3\u0010§\u0001\u001a\u00030 \u00012\b\u0010£\u0001\u001a\u00030 \u00018F@FX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\bR\u0010¤\u0001\u001a\u0005\bv\u0010¥\u0001\"\u0006\b\u009b\u0001\u0010¦\u0001R3\u0010«\u0001\u001a\u00030¨\u00012\b\u0010£\u0001\u001a\u00030¨\u00018B@BX\u0082\u008e\u0002¢\u0006\u0016\n\u0005\b9\u0010¤\u0001\u001a\u0005\b}\u0010©\u0001\"\u0006\b¡\u0001\u0010ª\u0001R8\u0010°\u0001\u001a\u0005\u0018\u00010¬\u00012\n\u0010£\u0001\u001a\u0005\u0018\u00010¬\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\bI\u0010¤\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b\u008b\u0001\u0010¯\u0001R$\u0010±\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¬\u00010\u009a\u00018\u0006¢\u0006\u000e\n\u0005\b\\\u0010\u009c\u0001\u001a\u0005\bp\u0010\u009e\u0001R\u001b\u0010µ\u0001\u001a\u00030²\u00018\u0006¢\u0006\u000e\n\u0005\b^\u0010³\u0001\u001a\u0005\bt\u0010´\u0001R\"\u0010º\u0001\u001a\t\u0012\u0004\u0012\u00020a0¶\u00018\u0006¢\u0006\u000f\n\u0005\bX\u0010·\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001R\u0017\u0010½\u0001\u001a\u00030»\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\be\u0010¼\u0001R\u001b\u0010À\u0001\u001a\u0005\u0018\u00010¾\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bg\u0010¿\u0001R\u0018\u0010Ä\u0001\u001a\u00030Á\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÂ\u0001\u0010Ã\u0001¨\u0006Å\u0001"}, m65681d2 = {"Lyw2/h;", "Lbc3/c0;", "Lof3/a;", "Lin2/d;", "dispatcherFactory", "Lz92/a;", "userInfoAccessor", "Ltr2/n;", "logger", "Lex2/c;", "labsRepository", "Lcom/whoop/data/remote/api/FileDownloaderApi;", "fileDownloaderApi", "Lor2/a0;", "fileManager", "Ltd1/b;", "whoopStrapProxy", "Lcom/whoop/whooplabs/data/network/WhoopLabsApi;", "whoopLabsApi", "Lmz2/e;", "fileWriter", "Lcom/whoop/whooplabs/io/HrDeviceConnection;", "hrDeviceConnection", "Lzr2/a;", "dateAndTimeProvider", "Lyw2/f;", "strapConnection", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lnz2/g;", "versionHelper", "Ljt0/a;", "connectivityAnalytics", "Lzw2/b;", "analyticsHelper", "applicationScope", "Loz2/c;", "btHrSubmissionScheduler", "Loz2/a;", "btHrPeriodicCheckScheduler", "Lyw2/a;", "btHrTimestampStore", "<init>", "(Lin2/d;Lz92/a;Ltr2/n;Lex2/c;Lcom/whoop/data/remote/api/FileDownloaderApi;Lor2/a0;Ltd1/b;Lcom/whoop/whooplabs/data/network/WhoopLabsApi;Lmz2/e;Lcom/whoop/whooplabs/io/HrDeviceConnection;Lzr2/a;Lyw2/f;Lcom/whoop/data/repositories/FeatureFlagChecker;Lnz2/g;Ljt0/a;Lzw2/b;Lbc3/c0;Loz2/c;Loz2/a;Lyw2/a;)V", "Ll83/a0;", "O", "(Lq83/d;)Ljava/lang/Object;", "P", "()V", "Lcom/whoop/whooplabs/data/domain/LabsCampaign;", "campaign", "Q", "(Lcom/whoop/whooplabs/data/domain/LabsCampaign;Lq83/d;)Ljava/lang/Object;", "R", "T", "x", "", "d0", "y", "r", "S", "", "note", "q", "(Ljava/lang/String;)V", "address", "M", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "filename", "v", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "k0", "e0", "s", "Y", "u", "t", "", "value", "N", "([BLq83/d;)Ljava/lang/Object;", "c0", "shouldDisconnect", "W", "(ZLq83/d;)Ljava/lang/Object;", "Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;", "whoopStrapInfo", "h0", "(Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;Lq83/d;)Ljava/lang/Object;", "Ljava/io/File;", "file", "f0", "(Ljava/io/File;Lq83/d;)Ljava/lang/Object;", "g0", "deviceAddress", "z", "Lcom/whoop/design/util/TextResource;", "error", "U", "(Lcom/whoop/design/util/TextResource;)V", "i0", "V", "j0", "L", "()Z", "Lin2/d;", "Lz92/a;", "Ltr2/n;", "Lex2/c;", "E", "Lcom/whoop/data/remote/api/FileDownloaderApi;", "F", "Lor2/a0;", "G", "Ltd1/b;", "H", "Lcom/whoop/whooplabs/data/network/WhoopLabsApi;", "I", "Lmz2/e;", "C", "()Lmz2/e;", "J", "Lcom/whoop/whooplabs/io/HrDeviceConnection;", "()Lcom/whoop/whooplabs/io/HrDeviceConnection;", "K", "Lzr2/a;", "Lyw2/f;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lnz2/g;", "Ljt0/a;", "Lzw2/b;", "Lbc3/c0;", "Loz2/c;", "Loz2/a;", "Lyw2/a;", "Lmc3/a;", "Lmc3/a;", "bthrUploadMutex", "Z", "hasLoggedBtHrTimerFinished", "Lorg/joda/time/DateTime;", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "setLastBtHrReceivedTime", "(Lorg/joda/time/DateTime;)V", "lastBtHrReceivedTime", "X", "Lcom/whoop/whooplabs/data/domain/LabsCampaign;", "", "userId", "Lmz2/c;", "Lmz2/c;", "hrConnectionMaintainer", "Lec3/p1;", "a0", "Lec3/p1;", "A", "()Lec3/p1;", "btHrMissing", "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;", "b0", "studyFlow", "<set-?>", "Lf93/d;", "()Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;", "(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;)V", "study", "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDevice;", "()Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDevice;", "(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDevice;)V", "whoopLabsHrDevice", "Lyw2/b;", "D", "()Lyw2/b;", "(Lyw2/b;)V", "hrDevice", "hrDeviceFlow", "Lor2/r0;", "Lor2/r0;", "()Lor2/r0;", "stopSelfAction", "Lor2/s0;", "Lor2/s0;", "B", "()Lor2/s0;", "errorAction", "Lbc3/u;", "Lbc3/u;", "supervisorJob", "Lbc3/k1;", "Lbc3/k1;", "bthrCollectionJob", "Lq83/j;", "getCoroutineContext", "()Lq83/j;", "coroutineContext", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39836h implements InterfaceC2994c0, InterfaceC27903a {

    /* JADX INFO: renamed from: k0 */
    static final /* synthetic */ InterfaceC21493z[] f171810k0;

    /* JADX INFO: renamed from: l0 */
    public static final int f171811l0;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final FileDownloaderApi fileDownloaderApi;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C28144a0 fileManager;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC33704b whoopStrapProxy;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final WhoopLabsApi whoopLabsApi;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final C26046e fileWriter;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final HrDeviceConnection hrDeviceConnection;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final C39834f strapConnection;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final C27313g versionHelper;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final InterfaceC21934a connectivityAnalytics;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final C41178b analyticsHelper;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final InterfaceC2994c0 applicationScope;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final InterfaceC28501c btHrSubmissionScheduler;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private final InterfaceC28499a btHrPeriodicCheckScheduler;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private final C39829a btHrTimestampStore;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final InterfaceC25435a bthrUploadMutex;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private boolean hasLoggedBtHrTimerFinished;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private DateTime lastBtHrReceivedTime;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private LabsCampaign campaign;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private final int userId;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private C26044c hrConnectionMaintainer;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    private final InterfaceC13075p1 btHrMissing;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    private final InterfaceC13075p1 studyFlow;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    private final InterfaceC14292d study;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    private final InterfaceC14292d whoopLabsHrDevice;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    private final InterfaceC14292d hrDevice;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    private final InterfaceC13075p1 hrDeviceFlow;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    private final C28196r0 stopSelfAction;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    private final C28199s0<TextResource> errorAction;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    private final InterfaceC3061u supervisorJob;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    private InterfaceC3027k1 bthrCollectionJob;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC18732d dispatcherFactory;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC40205a userInfoAccessor;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C13732c labsRepository;

    /* JADX INFO: renamed from: yw2.h$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel$addStudyTag$1", m100430f = "WhoopLabsServiceModel.kt", m100431l = {531}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f171848w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f171850y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f171850y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39836h.this.new a(this.f171850y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f171848w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13732c c13732c = C39836h.this.labsRepository;
                int campaignId = C39836h.this.m127856I().getCampaignId();
                LocalDateTime localDateTimeNow = LocalDateTime.now();
                AbstractC22676k.m65749i(localDateTimeNow, "now(...)");
                WhoopLabsStudyTag whoopLabsStudyTag = new WhoopLabsStudyTag(localDateTimeNow, this.f171850y, campaignId);
                this.f171848w = 1;
                if (c13732c.m39002v(whoopLabsStudyTag, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: yw2.h$a0 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel", m100430f = "WhoopLabsServiceModel.kt", m100431l = {643, 649}, m100432m = "stopAndSubmitHrDataIfNeeded", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a0 extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f171851w;

        /* JADX INFO: renamed from: y */
        int f171853y;

        public a0(InterfaceC30057d<? super a0> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171851w = obj;
            this.f171853y |= Integer.MIN_VALUE;
            return C39836h.this.m127868e0(this);
        }
    }

    /* JADX INFO: renamed from: yw2.h$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel", m100430f = "WhoopLabsServiceModel.kt", m100431l = {361, 365, 370, 374, 378}, m100432m = "cancelStudy", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        boolean f171854w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f171855x;

        /* JADX INFO: renamed from: z */
        int f171857z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171855x = obj;
            this.f171857z |= Integer.MIN_VALUE;
            return C39836h.this.m127871r(this);
        }
    }

    /* JADX INFO: renamed from: yw2.h$b0 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel$stopAndSubmitHrDataIfNeeded$2", m100430f = "WhoopLabsServiceModel.kt", m100431l = {645}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b0 extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f171858w;

        public b0(InterfaceC30057d<? super b0> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39836h.this.new b0(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f171858w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C39836h c39836h = C39836h.this;
                this.f171858w = 1;
                if (c39836h.m127873w(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: yw2.h$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel", m100430f = "WhoopLabsServiceModel.kt", m100431l = {231, 234}, m100432m = "checkAndCreateProtocolStepResults", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f171860E;

        /* JADX INFO: renamed from: F */
        Object f171861F;

        /* JADX INFO: renamed from: G */
        int f171862G;

        /* JADX INFO: renamed from: H */
        int f171863H;

        /* JADX INFO: renamed from: I */
        int f171864I;

        /* JADX INFO: renamed from: J */
        /* synthetic */ Object f171865J;

        /* JADX INFO: renamed from: L */
        int f171867L;

        /* JADX INFO: renamed from: w */
        Object f171868w;

        /* JADX INFO: renamed from: x */
        Object f171869x;

        /* JADX INFO: renamed from: y */
        Object f171870y;

        /* JADX INFO: renamed from: z */
        Object f171871z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171865J = obj;
            this.f171867L |= Integer.MIN_VALUE;
            return C39836h.this.m127845t(this);
        }
    }

    /* JADX INFO: renamed from: yw2.h$c0 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel$study$2$1", m100430f = "WhoopLabsServiceModel.kt", m100431l = {103}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c0 extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f171872w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ WhoopLabsStudy f171874y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(WhoopLabsStudy whoopLabsStudy, InterfaceC30057d<? super c0> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f171874y = whoopLabsStudy;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39836h.this.new c0(this.f171874y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f171872w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13075p1 studyFlow = C39836h.this.getStudyFlow();
                WhoopLabsStudy whoopLabsStudy = this.f171874y;
                this.f171872w = 1;
                ((C13045h2) studyFlow).emit(whoopLabsStudy, this);
                if (c23454a0 == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: yw2.h$d */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel$checkAndCreateProtocolStepResults$2$remoteCampaign$1", m100430f = "WhoopLabsServiceModel.kt", m100431l = {231}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f171875w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ LabsCampaign f171877y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(LabsCampaign labsCampaign, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f171877y = labsCampaign;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39836h.this.new d(this.f171877y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super RemoteCampaign> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f171875w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C13732c c13732c = C39836h.this.labsRepository;
            int campaignId = this.f171877y.getCampaignId();
            this.f171875w = 1;
            Object objM38995o = c13732c.m38995o(campaignId, this);
            return objM38995o == enumC31071a ? enumC31071a : objM38995o;
        }
    }

    /* JADX INFO: renamed from: yw2.h$d0 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel$study$2$2", m100430f = "WhoopLabsServiceModel.kt", m100431l = {106}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d0 extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f171878w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ WhoopLabsStudy f171880y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(WhoopLabsStudy whoopLabsStudy, InterfaceC30057d<? super d0> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f171880y = whoopLabsStudy;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39836h.this.new d0(this.f171880y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f171878w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (C39836h.this.m127856I().getCampaignId() != WhoopLabsStudyKt.getSTUDY_NOT_STARTED().getCampaignId()) {
                    C13732c c13732c = C39836h.this.labsRepository;
                    WhoopLabsStudy whoopLabsStudy = this.f171880y;
                    this.f171878w = 1;
                    if (c13732c.m39001u(whoopLabsStudy, this) == enumC31071a) {
                        return enumC31071a;
                    }
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

    /* JADX INFO: renamed from: yw2.h$e */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel", m100430f = "WhoopLabsServiceModel.kt", m100431l = {215}, m100432m = "checkAndDownloadProtocol", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f171881w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f171882x;

        /* JADX INFO: renamed from: z */
        int f171884z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171882x = obj;
            this.f171884z |= Integer.MIN_VALUE;
            return C39836h.this.m127846u(this);
        }
    }

    /* JADX INFO: renamed from: yw2.h$e0 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel", m100430f = "WhoopLabsServiceModel.kt", m100431l = {501}, m100432m = "submitHrData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e0 extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f171885E;

        /* JADX INFO: renamed from: w */
        Object f171886w;

        /* JADX INFO: renamed from: x */
        Object f171887x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f171888y;

        public e0(InterfaceC30057d<? super e0> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171888y = obj;
            this.f171885E |= Integer.MIN_VALUE;
            return C39836h.this.m127829f0(null, this);
        }
    }

    /* JADX INFO: renamed from: yw2.h$f */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel$checkAndDownloadProtocol$responseBody$1", m100430f = "WhoopLabsServiceModel.kt", m100431l = {216}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lud3/a1;", "<anonymous>", "(Lbc3/c0;)Lud3/a1;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f171890w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ LabsProtocol f171892y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(LabsProtocol labsProtocol, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f171892y = labsProtocol;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39836h.this.new f(this.f171892y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC34799a1> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f171890w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            FileDownloaderApi fileDownloaderApi = C39836h.this.fileDownloaderApi;
            String pdfUrl = this.f171892y.getPdfUrl();
            this.f171890w = 1;
            Object objDownloadFile = fileDownloaderApi.downloadFile(pdfUrl, this);
            return objDownloadFile == enumC31071a ? enumC31071a : objDownloadFile;
        }
    }

    /* JADX INFO: renamed from: yw2.h$f0 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel", m100430f = "WhoopLabsServiceModel.kt", m100431l = {515, 521, 522}, m100432m = "submitPartialHrData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f0 extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f171893E;

        /* JADX INFO: renamed from: w */
        Object f171894w;

        /* JADX INFO: renamed from: x */
        Object f171895x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f171896y;

        public f0(InterfaceC30057d<? super f0> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171896y = obj;
            this.f171893E |= Integer.MIN_VALUE;
            return C39836h.this.m127831g0(null, this);
        }
    }

    /* JADX INFO: renamed from: yw2.h$g */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel", m100430f = "WhoopLabsServiceModel.kt", m100431l = {551}, m100432m = "connectToDevice", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f171898E;

        /* JADX INFO: renamed from: w */
        Object f171899w;

        /* JADX INFO: renamed from: x */
        Object f171900x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f171901y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171901y = obj;
            this.f171898E |= Integer.MIN_VALUE;
            return C39836h.this.m127872v(null, null, this);
        }
    }

    /* JADX INFO: renamed from: yw2.h$g0 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel", m100430f = "WhoopLabsServiceModel.kt", m100431l = {468, 469, 477, 481}, m100432m = "submitStudy", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g0 extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f171903E;

        /* JADX INFO: renamed from: F */
        Object f171904F;

        /* JADX INFO: renamed from: G */
        Object f171905G;

        /* JADX INFO: renamed from: H */
        Object f171906H;

        /* JADX INFO: renamed from: I */
        Object f171907I;

        /* JADX INFO: renamed from: J */
        int f171908J;

        /* JADX INFO: renamed from: K */
        /* synthetic */ Object f171909K;

        /* JADX INFO: renamed from: M */
        int f171911M;

        /* JADX INFO: renamed from: w */
        Object f171912w;

        /* JADX INFO: renamed from: x */
        Object f171913x;

        /* JADX INFO: renamed from: y */
        Object f171914y;

        /* JADX INFO: renamed from: z */
        Object f171915z;

        public g0(InterfaceC30057d<? super g0> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171909K = obj;
            this.f171911M |= Integer.MIN_VALUE;
            return C39836h.this.m127833h0(null, this);
        }
    }

    /* JADX INFO: renamed from: yw2.h$h */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel", m100430f = "WhoopLabsServiceModel.kt", m100431l = {665, 595, 601, 603}, m100432m = "disconnectAndUploadHr", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f171916E;

        /* JADX INFO: renamed from: G */
        int f171918G;

        /* JADX INFO: renamed from: w */
        Object f171919w;

        /* JADX INFO: renamed from: x */
        Object f171920x;

        /* JADX INFO: renamed from: y */
        int f171921y;

        /* JADX INFO: renamed from: z */
        int f171922z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171916E = obj;
            this.f171918G |= Integer.MIN_VALUE;
            return C39836h.this.m127873w(this);
        }
    }

    /* JADX INFO: renamed from: yw2.h$h0 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel", m100430f = "WhoopLabsServiceModel.kt", m100431l = {578}, m100432m = "tryScheduleBtHrUpload", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h0 extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f171924F;

        /* JADX INFO: renamed from: w */
        int f171925w;

        /* JADX INFO: renamed from: x */
        int f171926x;

        /* JADX INFO: renamed from: y */
        Object f171927y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f171928z;

        public h0(InterfaceC30057d<? super h0> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171928z = obj;
            this.f171924F |= Integer.MIN_VALUE;
            return C39836h.this.m127835i0(this);
        }
    }

    /* JADX INFO: renamed from: yw2.h$i */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel$disconnectDevice$1", m100430f = "WhoopLabsServiceModel.kt", m100431l = {253}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f171929w;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39836h.this.new i(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f171929w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C39829a c39829a = C39836h.this.btHrTimestampStore;
                this.f171929w = 1;
                if (c39829a.m127772b(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: yw2.h$i0 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel", m100430f = "WhoopLabsServiceModel.kt", m100431l = {665, 613, 619}, m100432m = "uploadPartialHr", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i0 extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f171931E;

        /* JADX INFO: renamed from: G */
        int f171933G;

        /* JADX INFO: renamed from: w */
        Object f171934w;

        /* JADX INFO: renamed from: x */
        Object f171935x;

        /* JADX INFO: renamed from: y */
        int f171936y;

        /* JADX INFO: renamed from: z */
        int f171937z;

        public i0(InterfaceC30057d<? super i0> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171931E = obj;
            this.f171933G |= Integer.MIN_VALUE;
            return C39836h.this.m127837j0(this);
        }
    }

    /* JADX INFO: renamed from: yw2.h$j */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel$hrDevice$2$1", m100430f = "WhoopLabsServiceModel.kt", m100431l = {112}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f171938w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C39830b f171940y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C39830b c39830b, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f171940y = c39830b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39836h.this.new j(this.f171940y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f171938w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13075p1 hrDeviceFlow = C39836h.this.getHrDeviceFlow();
                C39830b c39830b = this.f171940y;
                this.f171938w = 1;
                ((C13045h2) hrDeviceFlow).emit(c39830b, this);
                if (c23454a0 == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: yw2.h$j0 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel", m100430f = "WhoopLabsServiceModel.kt", m100431l = {624, 626, 627, 629}, m100432m = "uploadPartialHrIfNeeded", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j0 extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f171941w;

        /* JADX INFO: renamed from: y */
        int f171943y;

        public j0(InterfaceC30057d<? super j0> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171941w = obj;
            this.f171943y |= Integer.MIN_VALUE;
            return C39836h.this.m127869k0(this);
        }
    }

    /* JADX INFO: renamed from: yw2.h$k */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel", m100430f = "WhoopLabsServiceModel.kt", m100431l = {535, 536}, m100432m = "onConnectDeviceClicked", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f171944E;

        /* JADX INFO: renamed from: w */
        Object f171945w;

        /* JADX INFO: renamed from: x */
        Object f171946x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f171947y;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171947y = obj;
            this.f171944E |= Integer.MIN_VALUE;
            return C39836h.this.m127858M(null, this);
        }
    }

    /* JADX INFO: renamed from: yw2.h$k0 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel$whoopLabsHrDevice$2$1", m100430f = "WhoopLabsServiceModel.kt", m100431l = {110}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k0 extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f171949w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ WhoopLabsHrDevice f171951y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(WhoopLabsHrDevice whoopLabsHrDevice, InterfaceC30057d<? super k0> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f171951y = whoopLabsHrDevice;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39836h.this.new k0(this.f171951y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f171949w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13732c c13732c = C39836h.this.labsRepository;
                WhoopLabsHrDevice whoopLabsHrDevice = this.f171951y;
                this.f171949w = 1;
                if (c13732c.m38998r(whoopLabsHrDevice, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: yw2.h$l */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel", m100430f = "WhoopLabsServiceModel.kt", m100431l = {269, 273, 274}, m100432m = "onHrDataAvailable", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f171952E;

        /* JADX INFO: renamed from: G */
        int f171954G;

        /* JADX INFO: renamed from: w */
        Object f171955w;

        /* JADX INFO: renamed from: x */
        Object f171956x;

        /* JADX INFO: renamed from: y */
        int f171957y;

        /* JADX INFO: renamed from: z */
        int f171958z;

        public l(InterfaceC30057d<? super l> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171952E = obj;
            this.f171954G |= Integer.MIN_VALUE;
            return C39836h.this.m127815N(null, this);
        }
    }

    /* JADX INFO: renamed from: yw2.h$m */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel", m100430f = "WhoopLabsServiceModel.kt", m100431l = {140, 141}, m100432m = "onServiceCreate", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f171959w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f171960x;

        /* JADX INFO: renamed from: z */
        int f171962z;

        public m(InterfaceC30057d<? super m> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171960x = obj;
            this.f171962z |= Integer.MIN_VALUE;
            return C39836h.this.m127859O(this);
        }
    }

    /* JADX INFO: renamed from: yw2.h$n */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel$onServiceCreate$2", m100430f = "WhoopLabsServiceModel.kt", m100431l = {128}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class n extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f171963w;

        /* JADX INFO: renamed from: yw2.h$n$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C39836h f171965w;

            public a(C39836h c39836h) {
                this.f171965w = c39836h;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(byte[] bArr, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws IOException {
                Object objM127815N = this.f171965w.m127815N(bArr, interfaceC30057d);
                return objM127815N == EnumC31071a.f128113w ? objM127815N : C23454a0.f92919a;
            }
        }

        public n(InterfaceC30057d<? super n> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39836h.this.new n(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((n) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f171963w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13087t1 dataFlow = C39836h.this.getHrDeviceConnection().getDataFlow();
                a aVar = new a(C39836h.this);
                this.f171963w = 1;
                if (dataFlow.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: yw2.h$o */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel$onServiceCreate$3", m100430f = "WhoopLabsServiceModel.kt", m100431l = {135}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class o extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f171966w;

        /* JADX INFO: renamed from: yw2.h$o$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C39836h f171968w;

            public a(C39836h c39836h) {
                this.f171968w = c39836h;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(byte[] bArr, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws IOException {
                Object objM127815N = this.f171968w.m127815N(bArr, interfaceC30057d);
                return objM127815N == EnumC31071a.f128113w ? objM127815N : C23454a0.f92919a;
            }
        }

        public o(InterfaceC30057d<? super o> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39836h.this.new o(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((o) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f171966w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13087t1 dataFlow = C39836h.this.getHrDeviceConnection().getDataFlow();
                a aVar = new a(C39836h.this);
                this.f171966w = 1;
                if (dataFlow.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: yw2.h$p */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel", m100430f = "WhoopLabsServiceModel.kt", m100431l = {152, 157, 158, 160, 161, 162}, m100432m = "onStartedOrRestartedWithCampaign", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f171969E;

        /* JADX INFO: renamed from: w */
        Object f171970w;

        /* JADX INFO: renamed from: x */
        Object f171971x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f171972y;

        public p(InterfaceC30057d<? super p> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171972y = obj;
            this.f171969E |= Integer.MIN_VALUE;
            return C39836h.this.m127861Q(null, this);
        }
    }

    /* JADX INFO: renamed from: yw2.h$q */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel", m100430f = "WhoopLabsServiceModel.kt", m100431l = {167, DateTimeConstants.HOURS_PER_WEEK, 169}, m100432m = "onStartedOrRestartedWithoutCampaign", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f171974w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f171975x;

        /* JADX INFO: renamed from: z */
        int f171977z;

        public q(InterfaceC30057d<? super q> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171975x = obj;
            this.f171977z |= Integer.MIN_VALUE;
            return C39836h.this.m127862R(this);
        }
    }

    /* JADX INFO: renamed from: yw2.h$r */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel", m100430f = "WhoopLabsServiceModel.kt", m100431l = {384, 388, 391, 394, 400, 415, 417, 419, 425, 429, 431}, m100432m = "onSubmitClicked", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f171978E;

        /* JADX INFO: renamed from: G */
        int f171980G;

        /* JADX INFO: renamed from: w */
        Object f171981w;

        /* JADX INFO: renamed from: x */
        Object f171982x;

        /* JADX INFO: renamed from: y */
        Object f171983y;

        /* JADX INFO: renamed from: z */
        int f171984z;

        public r(InterfaceC30057d<? super r> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171978E = obj;
            this.f171980G |= Integer.MIN_VALUE;
            return C39836h.this.m127863S(this);
        }
    }

    /* JADX INFO: renamed from: yw2.h$s */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel", m100430f = "WhoopLabsServiceModel.kt", m100431l = {588}, m100432m = "resetBtHrStoppingTimestamp", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f171985w;

        /* JADX INFO: renamed from: y */
        int f171987y;

        public s(InterfaceC30057d<? super s> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171985w = obj;
            this.f171987y |= Integer.MIN_VALUE;
            return C39836h.this.m127817V(this);
        }
    }

    /* JADX INFO: renamed from: yw2.h$t */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel", m100430f = "WhoopLabsServiceModel.kt", m100431l = {445, 449, 454, 455, 456, 457, 458, 459, 460, 461, 462}, m100432m = "resetStudy", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f171988E;

        /* JADX INFO: renamed from: G */
        int f171990G;

        /* JADX INFO: renamed from: w */
        boolean f171991w;

        /* JADX INFO: renamed from: x */
        int f171992x;

        /* JADX INFO: renamed from: y */
        int f171993y;

        /* JADX INFO: renamed from: z */
        Object f171994z;

        public t(InterfaceC30057d<? super t> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171988E = obj;
            this.f171990G |= Integer.MIN_VALUE;
            return C39836h.this.m127818W(false, this);
        }
    }

    /* JADX INFO: renamed from: yw2.h$u */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel", m100430f = "WhoopLabsServiceModel.kt", m100431l = {195}, m100432m = "saveLastStrapInfo", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f171995w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f171996x;

        /* JADX INFO: renamed from: z */
        int f171998z;

        public u(InterfaceC30057d<? super u> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171996x = obj;
            this.f171998z |= Integer.MIN_VALUE;
            return C39836h.this.m127820Y(this);
        }
    }

    /* JADX INFO: renamed from: yw2.h$v */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel", m100430f = "WhoopLabsServiceModel.kt", m100431l = {281}, m100432m = "shouldStopBtHr", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f171999w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f172000x;

        /* JADX INFO: renamed from: z */
        int f172002z;

        public v(InterfaceC30057d<? super v> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f172000x = obj;
            this.f172002z |= Integer.MIN_VALUE;
            return C39836h.this.m127825c0(this);
        }
    }

    /* JADX INFO: renamed from: yw2.h$w */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0006\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\b\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"yw2/h$w", "Lf93/d;", "", "thisRef", "Lj93/z;", "property", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "value", "Ll83/a0;", "setValue", "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w implements InterfaceC14292d {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private WhoopLabsStudy value;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C39836h f172004x;

        /* JADX WARN: Multi-variable type inference failed */
        public w(Object obj, C39836h c39836h) {
            this.f172004x = c39836h;
            this.value = obj;
        }

        @Override // f93.InterfaceC14291c
        public WhoopLabsStudy getValue(Object thisRef, InterfaceC21493z property) {
            AbstractC22676k.m65750j(property, "property");
            return this.value;
        }

        @Override // f93.InterfaceC14292d
        public void setValue(Object thisRef, InterfaceC21493z property, WhoopLabsStudy value) {
            AbstractC22676k.m65750j(property, "property");
            this.value = value;
            WhoopLabsStudy whoopLabsStudy = value;
            C39836h c39836h = this.f172004x;
            AbstractC3006f0.m8732z(c39836h, null, null, c39836h.new c0(whoopLabsStudy, null), 3);
            C39836h c39836h2 = this.f172004x;
            AbstractC3006f0.m8732z(c39836h2, c39836h2.dispatcherFactory.mo54465b(), null, this.f172004x.new d0(whoopLabsStudy, null), 2);
        }
    }

    /* JADX INFO: renamed from: yw2.h$x */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0006\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\b\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"yw2/h$x", "Lf93/d;", "", "thisRef", "Lj93/z;", "property", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "value", "Ll83/a0;", "setValue", "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class x implements InterfaceC14292d {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private WhoopLabsHrDevice value;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C39836h f172006x;

        /* JADX WARN: Multi-variable type inference failed */
        public x(Object obj, C39836h c39836h) {
            this.f172006x = c39836h;
            this.value = obj;
        }

        @Override // f93.InterfaceC14291c
        public WhoopLabsHrDevice getValue(Object thisRef, InterfaceC21493z property) {
            AbstractC22676k.m65750j(property, "property");
            return this.value;
        }

        @Override // f93.InterfaceC14292d
        public void setValue(Object thisRef, InterfaceC21493z property, WhoopLabsHrDevice value) {
            AbstractC22676k.m65750j(property, "property");
            this.value = value;
            C39836h c39836h = this.f172006x;
            AbstractC3006f0.m8732z(c39836h, c39836h.dispatcherFactory.mo54465b(), null, this.f172006x.new k0(value, null), 2);
        }
    }

    /* JADX INFO: renamed from: yw2.h$y */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0006\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\b\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"yw2/h$y", "Lf93/d;", "", "thisRef", "Lj93/z;", "property", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "value", "Ll83/a0;", "setValue", "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y implements InterfaceC14292d {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private C39830b value;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C39836h f172008x;

        /* JADX WARN: Multi-variable type inference failed */
        public y(Object obj, C39836h c39836h) {
            this.f172008x = c39836h;
            this.value = obj;
        }

        @Override // f93.InterfaceC14291c
        public C39830b getValue(Object thisRef, InterfaceC21493z property) {
            AbstractC22676k.m65750j(property, "property");
            return this.value;
        }

        @Override // f93.InterfaceC14292d
        public void setValue(Object thisRef, InterfaceC21493z property, C39830b value) {
            AbstractC22676k.m65750j(property, "property");
            this.value = value;
            C39836h c39836h = this.f172008x;
            AbstractC3006f0.m8732z(c39836h, null, null, c39836h.new j(value, null), 3);
        }
    }

    /* JADX INFO: renamed from: yw2.h$z */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceModel", m100430f = "WhoopLabsServiceModel.kt", m100431l = {295, 312, 321, 330, 340}, m100432m = "startStudy", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class z extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f172010F;

        /* JADX INFO: renamed from: w */
        Object f172011w;

        /* JADX INFO: renamed from: x */
        Object f172012x;

        /* JADX INFO: renamed from: y */
        Object f172013y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f172014z;

        public z(InterfaceC30057d<? super z> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f172014z = obj;
            this.f172010F |= Integer.MIN_VALUE;
            return C39836h.this.m127867d0(this);
        }
    }

    static {
        C22686q c22686q = new C22686q(C39836h.class, "study", "getStudy()Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f171810k0 = new InterfaceC21493z[]{c22673i0.mutableProperty1(c22686q), AbstractC11895b.m31990i(C39836h.class, "whoopLabsHrDevice", "getWhoopLabsHrDevice()Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDevice;", 0, c22673i0), AbstractC11895b.m31990i(C39836h.class, "hrDevice", "getHrDevice()Lcom/whoop/whooplabs/HrDevice;", 0, c22673i0)};
        f171811l0 = 8;
    }

    public C39836h(InterfaceC18732d dispatcherFactory, InterfaceC40205a userInfoAccessor, InterfaceC34116n logger, C13732c labsRepository, FileDownloaderApi fileDownloaderApi, C28144a0 fileManager, InterfaceC33704b whoopStrapProxy, WhoopLabsApi whoopLabsApi, C26046e fileWriter, HrDeviceConnection hrDeviceConnection, InterfaceC41070a dateAndTimeProvider, C39834f strapConnection, FeatureFlagChecker featureFlagChecker, C27313g versionHelper, InterfaceC21934a connectivityAnalytics, C41178b analyticsHelper, InterfaceC2994c0 applicationScope, InterfaceC28501c btHrSubmissionScheduler, InterfaceC28499a btHrPeriodicCheckScheduler, C39829a btHrTimestampStore) {
        int id4;
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        AbstractC22676k.m65750j(userInfoAccessor, "userInfoAccessor");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(labsRepository, "labsRepository");
        AbstractC22676k.m65750j(fileDownloaderApi, "fileDownloaderApi");
        AbstractC22676k.m65750j(fileManager, "fileManager");
        AbstractC22676k.m65750j(whoopStrapProxy, "whoopStrapProxy");
        AbstractC22676k.m65750j(whoopLabsApi, "whoopLabsApi");
        AbstractC22676k.m65750j(fileWriter, "fileWriter");
        AbstractC22676k.m65750j(hrDeviceConnection, "hrDeviceConnection");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(strapConnection, "strapConnection");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(versionHelper, "versionHelper");
        AbstractC22676k.m65750j(connectivityAnalytics, "connectivityAnalytics");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(applicationScope, "applicationScope");
        AbstractC22676k.m65750j(btHrSubmissionScheduler, "btHrSubmissionScheduler");
        AbstractC22676k.m65750j(btHrPeriodicCheckScheduler, "btHrPeriodicCheckScheduler");
        AbstractC22676k.m65750j(btHrTimestampStore, "btHrTimestampStore");
        this.dispatcherFactory = dispatcherFactory;
        this.userInfoAccessor = userInfoAccessor;
        this.logger = logger;
        this.labsRepository = labsRepository;
        this.fileDownloaderApi = fileDownloaderApi;
        this.fileManager = fileManager;
        this.whoopStrapProxy = whoopStrapProxy;
        this.whoopLabsApi = whoopLabsApi;
        this.fileWriter = fileWriter;
        this.hrDeviceConnection = hrDeviceConnection;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.strapConnection = strapConnection;
        this.featureFlagChecker = featureFlagChecker;
        this.versionHelper = versionHelper;
        this.connectivityAnalytics = connectivityAnalytics;
        this.analyticsHelper = analyticsHelper;
        this.applicationScope = applicationScope;
        this.btHrSubmissionScheduler = btHrSubmissionScheduler;
        this.btHrPeriodicCheckScheduler = btHrPeriodicCheckScheduler;
        this.btHrTimestampStore = btHrTimestampStore;
        this.bthrUploadMutex = AbstractC25438d.m74669a();
        User userMo129090d = userInfoAccessor.mo129090d();
        if (userMo129090d != null) {
            id4 = userMo129090d.getId();
        } else {
            logger.mo85222m("UserInfoAccessor.getUser() returned null", new AbstractC30556a.a[0]);
            id4 = 0;
        }
        this.userId = id4;
        this.btHrMissing = AbstractC13091v.m36593c(Boolean.FALSE);
        this.studyFlow = AbstractC13091v.m36593c(WhoopLabsStudyKt.getSTUDY_NOT_STARTED());
        this.study = new w(WhoopLabsStudyKt.getSTUDY_NOT_STARTED(), this);
        this.whoopLabsHrDevice = new x(WhoopLabsHrDeviceKt.getNO_HR_DEVICE(), this);
        this.hrDevice = new y(null, this);
        this.hrDeviceFlow = AbstractC13091v.m36593c(null);
        this.stopSelfAction = new C28196r0();
        this.errorAction = new C28199s0<>();
        this.supervisorJob = AbstractC3006f0.m8710d();
    }

    /* JADX INFO: renamed from: K */
    private final WhoopLabsHrDevice m127813K() {
        return (WhoopLabsHrDevice) this.whoopLabsHrDevice.getValue(this, f171810k0[1]);
    }

    /* JADX INFO: renamed from: L */
    private final boolean m127814L() {
        DateTime dateTime = this.lastBtHrReceivedTime;
        boolean z4 = false;
        if (dateTime != null && !dateTime.isBefore(this.dateAndTimeProvider.mo133364c().minusMinutes(10))) {
            z4 = true;
        }
        return !z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f8, code lost:
    
        if (m127873w(r3) == r4) goto L35;
     */
    /* JADX INFO: renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m127815N(byte[] r24, q83.InterfaceC30057d<? super l83.C23454a0> r25) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yw2.C39836h.m127815N(byte[], q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: U */
    private final void m127816U(TextResource error) {
        this.errorAction.m85347e(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: V */
    public final Object m127817V(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        s sVar;
        if (interfaceC30057d instanceof s) {
            sVar = (s) interfaceC30057d;
            int i13 = sVar.f171987y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                sVar.f171987y = i13 - Integer.MIN_VALUE;
            } else {
                sVar = new s(interfaceC30057d);
            }
        } else {
            sVar = new s(interfaceC30057d);
        }
        Object obj = sVar.f171985w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = sVar.f171987y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C39829a c39829a = this.btHrTimestampStore;
            sVar.f171987y = 1;
            if (c39829a.m127775f(sVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        this.hasLoggedBtHrTimerFinished = false;
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x0108  */
    /* JADX WARN: Code duplicated, block: B:38:0x0116  */
    /* JADX WARN: Code duplicated, block: B:42:0x0136  */
    /* JADX WARN: Code duplicated, block: B:46:0x014e A[PHI: r2 r3 r4 r6
      0x014e: PHI (r2v20 int) = (r2v18 int), (r2v21 int) binds: [B:44:0x014a, B:19:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x014e: PHI (r3v6 boolean) = (r3v4 boolean), (r3v7 boolean) binds: [B:44:0x014a, B:19:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x014e: PHI (r4v9 ex2.c) = (r4v6 ex2.c), (r4v11 ex2.c) binds: [B:44:0x014a, B:19:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x014e: PHI (r6v13 int) = (r6v11 int), (r6v14 int) binds: [B:44:0x014a, B:19:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x0161 A[PHI: r2 r3 r4 r6
      0x0161: PHI (r2v22 int) = (r2v20 int), (r2v23 int) binds: [B:47:0x015d, B:18:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0161: PHI (r3v8 boolean) = (r3v6 boolean), (r3v9 boolean) binds: [B:47:0x015d, B:18:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0161: PHI (r4v12 ex2.c) = (r4v9 ex2.c), (r4v14 ex2.c) binds: [B:47:0x015d, B:18:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0161: PHI (r6v15 int) = (r6v13 int), (r6v16 int) binds: [B:47:0x015d, B:18:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0173 A[PHI: r2 r3 r4 r6
      0x0173: PHI (r2v24 int) = (r2v22 int), (r2v25 int) binds: [B:50:0x0170, B:17:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r3v10 boolean) = (r3v8 boolean), (r3v11 boolean) binds: [B:50:0x0170, B:17:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r4v15 ex2.c) = (r4v12 ex2.c), (r4v17 ex2.c) binds: [B:50:0x0170, B:17:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r6v17 int) = (r6v15 int), (r6v18 int) binds: [B:50:0x0170, B:17:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0185 A[PHI: r2 r3 r4 r6
      0x0185: PHI (r2v26 int) = (r2v24 int), (r2v27 int) binds: [B:53:0x0182, B:16:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0185: PHI (r3v12 boolean) = (r3v10 boolean), (r3v13 boolean) binds: [B:53:0x0182, B:16:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0185: PHI (r4v18 ex2.c) = (r4v15 ex2.c), (r4v20 ex2.c) binds: [B:53:0x0182, B:16:0x005f] A[DONT_GENERATE, DONT_INLINE]
      0x0185: PHI (r6v19 int) = (r6v17 int), (r6v20 int) binds: [B:53:0x0182, B:16:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0198 A[PHI: r2 r3 r4 r6
      0x0198: PHI (r2v28 int) = (r2v26 int), (r2v29 int) binds: [B:56:0x0195, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0198: PHI (r3v14 boolean) = (r3v12 boolean), (r3v15 boolean) binds: [B:56:0x0195, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0198: PHI (r4v21 ex2.c) = (r4v18 ex2.c), (r4v23 ex2.c) binds: [B:56:0x0195, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0198: PHI (r6v21 int) = (r6v19 int), (r6v22 int) binds: [B:56:0x0195, B:15:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:61:0x01ab A[PHI: r2 r3 r4 r6
      0x01ab: PHI (r2v30 int) = (r2v28 int), (r2v31 int) binds: [B:59:0x01a8, B:14:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x01ab: PHI (r3v16 boolean) = (r3v14 boolean), (r3v17 boolean) binds: [B:59:0x01a8, B:14:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x01ab: PHI (r4v24 ex2.c) = (r4v21 ex2.c), (r4v26 ex2.c) binds: [B:59:0x01a8, B:14:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x01ab: PHI (r6v23 int) = (r6v21 int), (r6v24 int) binds: [B:59:0x01a8, B:14:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x01be A[PHI: r2 r3 r4 r6
      0x01be: PHI (r2v32 int) = (r2v30 int), (r2v33 int) binds: [B:62:0x01bb, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r3v18 boolean) = (r3v16 boolean), (r3v19 boolean) binds: [B:62:0x01bb, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r4v27 ex2.c) = (r4v24 ex2.c), (r4v29 ex2.c) binds: [B:62:0x01bb, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE]
      0x01be: PHI (r6v25 int) = (r6v23 int), (r6v28 int) binds: [B:62:0x01bb, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e7, code lost:
    
        if (m127817V(r0) == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01cf, code lost:
    
        if (r4.m38981a(r0) == r1) goto L66;
     */
    /* JADX INFO: renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m127818W(boolean r6, q83.InterfaceC30057d<? super l83.C23454a0> r7) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yw2.C39836h.m127818W(boolean, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ Object m127819X(C39836h c39836h, boolean z4, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = true;
        }
        return c39836h.m127818W(z4, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: Y */
    public final Object m127820Y(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        u uVar;
        if (interfaceC30057d instanceof u) {
            uVar = (u) interfaceC30057d;
            int i13 = uVar.f171998z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                uVar.f171998z = i13 - Integer.MIN_VALUE;
            } else {
                uVar = new u(interfaceC30057d);
            }
        } else {
            uVar = new u(interfaceC30057d);
        }
        Object obj = uVar.f171996x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = uVar.f171998z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                WhoopStrapInfo whoopStrapInfoMo106493f = this.whoopStrapProxy.mo106493f();
                if (whoopStrapInfoMo106493f != null) {
                    C13732c c13732c = this.labsRepository;
                    String rawSerialNumber = whoopStrapInfoMo106493f.getRawSerialNumber();
                    String strM84332d = whoopStrapInfoMo106493f.getHardwareVersion().m84332d();
                    String strMo84319a = whoopStrapInfoMo106493f.getMaximVersion().mo84319a();
                    String strMo84319a2 = whoopStrapInfoMo106493f.getBluetoothVersion().mo84319a();
                    String strM84360f = whoopStrapInfoMo106493f.getSigProcVersion().m84360f();
                    AbstractC22676k.m65749i(strM84360f, "toSemanticVersionString(...)");
                    LastKnownStrapInfo lastKnownStrapInfo = new LastKnownStrapInfo(rawSerialNumber, strM84332d, strMo84319a, strMo84319a2, strM84360f);
                    uVar.f171995w = null;
                    uVar.f171998z = 1;
                    if (c13732c.m39000t(lastKnownStrapInfo, uVar) == enumC31071a) {
                        return enumC31071a;
                    }
                }
                return C23454a0.f92919a;
            }
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        } catch (Exception e5) {
            this.logger.mo85222m(AbstractC31061c.m95640p("Couldn't save strap information: ", e5.getMessage(), " ", this.versionHelper.m82463a()), new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b0 */
    private final void m127823b0(WhoopLabsHrDevice whoopLabsHrDevice) {
        this.whoopLabsHrDevice.setValue(this, f171810k0[1], whoopLabsHrDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c0 */
    public final Object m127825c0(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        v vVar;
        if (interfaceC30057d instanceof v) {
            vVar = (v) interfaceC30057d;
            int i13 = vVar.f172002z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                vVar.f172002z = i13 - Integer.MIN_VALUE;
            } else {
                vVar = new v(interfaceC30057d);
            }
        } else {
            vVar = new v(interfaceC30057d);
        }
        Object objM127779j = vVar.f172000x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = vVar.f172002z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM127779j);
            DateTime dateTimeMo133364c = this.dateAndTimeProvider.mo133364c();
            C39829a c39829a = this.btHrTimestampStore;
            vVar.f171999w = null;
            vVar.f172002z = 1;
            objM127779j = c39829a.m127779j(dateTimeMo133364c, vVar);
            if (objM127779j == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM127779j);
        }
        Boolean bool = (Boolean) objM127779j;
        if (bool.booleanValue() && !this.hasLoggedBtHrTimerFinished) {
            this.hasLoggedBtHrTimerFinished = true;
            this.analyticsHelper.m133828a(new AbstractC41177a.a(null, 1, null));
        }
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: f0 */
    public final Object m127829f0(File file, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        e0 e0Var;
        String name;
        if (interfaceC30057d instanceof e0) {
            e0Var = (e0) interfaceC30057d;
            int i13 = e0Var.f171885E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                e0Var.f171885E = i13 - Integer.MIN_VALUE;
            } else {
                e0Var = new e0(interfaceC30057d);
            }
        } else {
            e0Var = new e0(interfaceC30057d);
        }
        Object objUploadRawDataFromThirdParty = e0Var.f171888y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = e0Var.f171885E;
        boolean z4 = false;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objUploadRawDataFromThirdParty);
                this.logger.mo85216g("Trying to submit HR data", new AbstractC30556a.a[0]);
                this.fileWriter.m77508b();
                C34844u0 c34844u0 = AbstractC34846v0.Companion;
                C39412p c39412p = C34818h0.f146589e;
                C34818h0 c34818h0M5373J = AbstractC1772c1.m5373J(DfuBaseService.MIME_TYPE_OCTET_STREAM);
                c34844u0.getClass();
                C34834p0 c34834p0M109924a = C34844u0.m109924a(file, c34818h0M5373J);
                WhoopLabsApi whoopLabsApi = this.whoopLabsApi;
                C39830b c39830bM127851D = m127851D();
                if (c39830bM127851D == null || (name = c39830bM127851D.getName()) == null) {
                    name = "Unknown";
                }
                e0Var.f171886w = file;
                e0Var.f171887x = null;
                e0Var.f171885E = 1;
                objUploadRawDataFromThirdParty = whoopLabsApi.uploadRawDataFromThirdParty(c34834p0M109924a, name, 37, e0Var);
                if (objUploadRawDataFromThirdParty == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                file = (File) e0Var.f171886w;
                AbstractC34132o.m107864I(objUploadRawDataFromThirdParty);
            }
            C29218v0 c29218v0 = (C29218v0) objUploadRawDataFromThirdParty;
            if (!c29218v0.f118269a.f146788Q) {
                throw new HttpException(c29218v0);
            }
            this.logger.mo85216g("HR data uploaded successfully, " + file.length() + " bytes", new AbstractC30556a.a[0]);
            this.fileWriter.m77510d(file);
            this.analyticsHelper.m133828a(new AbstractC41177a.b(null, 1, null));
            z4 = true;
            return Boolean.valueOf(z4);
        } catch (Exception e5) {
            this.logger.mo85222m(AbstractC11266d.m30461o("Couldn't upload HR data: ", e5.getMessage()), new AbstractC30556a.a[0]);
            AbstractC3006f0.m8721o(getCoroutineContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b3, code lost:
    
        if (r12 == r1) goto L37;
     */
    /* JADX INFO: renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m127831g0(java.io.File r11, q83.InterfaceC30057d<? super java.lang.Boolean> r12) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yw2.C39836h.m127831g0(java.io.File, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:39:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:43:0x0113  */
    /* JADX WARN: Code duplicated, block: B:47:0x0124 A[Catch: Exception -> 0x0048, TryCatch #0 {Exception -> 0x0048, blocks: (B:16:0x0043, B:64:0x016d, B:45:0x0120, B:47:0x0124, B:50:0x012c, B:53:0x0134, B:56:0x013c, B:59:0x0144, B:61:0x014a), top: B:68:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0129  */
    /* JADX WARN: Code duplicated, block: B:50:0x012c A[Catch: Exception -> 0x0048, TryCatch #0 {Exception -> 0x0048, blocks: (B:16:0x0043, B:64:0x016d, B:45:0x0120, B:47:0x0124, B:50:0x012c, B:53:0x0134, B:56:0x013c, B:59:0x0144, B:61:0x014a), top: B:68:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0131  */
    /* JADX WARN: Code duplicated, block: B:53:0x0134 A[Catch: Exception -> 0x0048, TryCatch #0 {Exception -> 0x0048, blocks: (B:16:0x0043, B:64:0x016d, B:45:0x0120, B:47:0x0124, B:50:0x012c, B:53:0x0134, B:56:0x013c, B:59:0x0144, B:61:0x014a), top: B:68:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0139  */
    /* JADX WARN: Code duplicated, block: B:56:0x013c A[Catch: Exception -> 0x0048, TryCatch #0 {Exception -> 0x0048, blocks: (B:16:0x0043, B:64:0x016d, B:45:0x0120, B:47:0x0124, B:50:0x012c, B:53:0x0134, B:56:0x013c, B:59:0x0144, B:61:0x014a), top: B:68:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0141  */
    /* JADX WARN: Code duplicated, block: B:59:0x0144 A[Catch: Exception -> 0x0048, TryCatch #0 {Exception -> 0x0048, blocks: (B:16:0x0043, B:64:0x016d, B:45:0x0120, B:47:0x0124, B:50:0x012c, B:53:0x0134, B:56:0x013c, B:59:0x0144, B:61:0x014a), top: B:68:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0149  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x016a, code lost:
    
        if (r0 == r2) goto L63;
     */
    /* JADX INFO: renamed from: h0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m127833h0(com.whoop.whooplabs.data.room.entity.LastKnownStrapInfo r19, q83.InterfaceC30057d<? super java.lang.Boolean> r20) {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yw2.C39836h.m127833h0(com.whoop.whooplabs.data.room.entity.LastKnownStrapInfo, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i0 */
    public final Object m127835i0(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        h0 h0Var;
        Integer bthrAdditionalCollectionLength;
        if (interfaceC30057d instanceof h0) {
            h0Var = (h0) interfaceC30057d;
            int i13 = h0Var.f171924F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                h0Var.f171924F = i13 - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(interfaceC30057d);
            }
        } else {
            h0Var = new h0(interfaceC30057d);
        }
        Object objM127777h = h0Var.f171928z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = h0Var.f171924F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM127777h);
            LabsCampaign labsCampaign = this.campaign;
            if (labsCampaign == null || (bthrAdditionalCollectionLength = labsCampaign.getBthrAdditionalCollectionLength()) == null) {
                return Boolean.TRUE;
            }
            int iIntValue = bthrAdditionalCollectionLength.intValue();
            this.btHrSubmissionScheduler.mo86814a(iIntValue);
            this.btHrPeriodicCheckScheduler.mo86811a();
            DateTime dateTimePlusHours = this.dateAndTimeProvider.mo133364c().plusHours(iIntValue);
            this.logger.mo85216g("Timestamp to stop BTHR: " + dateTimePlusHours.getMillis() + " (" + dateTimePlusHours + ")", new AbstractC30556a.a[0]);
            C39829a c39829a = this.btHrTimestampStore;
            long millis = dateTimePlusHours.getMillis();
            h0Var.f171927y = null;
            h0Var.f171925w = iIntValue;
            h0Var.f171926x = 0;
            h0Var.f171924F = 1;
            objM127777h = c39829a.m127777h(millis, h0Var);
            if (objM127777h == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM127777h);
        }
        if (!((Boolean) objM127777h).booleanValue()) {
            return Boolean.FALSE;
        }
        this.hasLoggedBtHrTimerFinished = false;
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x0091 A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:21:0x004f, B:34:0x008d, B:36:0x0091, B:37:0x0095, B:39:0x00a0, B:41:0x00a8, B:44:0x00b3, B:50:0x00c9), top: B:57:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a0 A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:21:0x004f, B:34:0x008d, B:36:0x0091, B:37:0x0095, B:39:0x00a0, B:41:0x00a8, B:44:0x00b3, B:50:0x00c9), top: B:57:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j0 */
    public final Object m127837j0(InterfaceC30057d<? super Boolean> interfaceC30057d) throws Throwable {
        i0 i0Var;
        InterfaceC25435a interfaceC25435a;
        int i13;
        InterfaceC25435a interfaceC25435a2;
        Throwable th3;
        C39836h c39836h;
        InterfaceC25435a interfaceC25435a3;
        int i14;
        int i15;
        WhoopLabsHrDevice no_hr_device;
        File outputFile;
        if (interfaceC30057d instanceof i0) {
            i0Var = (i0) interfaceC30057d;
            int i16 = i0Var.f171933G;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                i0Var.f171933G = i16 - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(interfaceC30057d);
            }
        } else {
            i0Var = new i0(interfaceC30057d);
        }
        Object objM127831g0 = i0Var.f171931E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i17 = i0Var.f171933G;
        try {
            if (i17 == 0) {
                AbstractC34132o.m107864I(objM127831g0);
                interfaceC25435a = this.bthrUploadMutex;
                i0Var.f171934w = interfaceC25435a;
                i0Var.f171936y = 0;
                i0Var.f171933G = 1;
                if (interfaceC25435a.mo68211b(i0Var) != enumC31071a) {
                    i13 = 0;
                }
                return enumC31071a;
            }
            if (i17 != 1) {
                if (i17 == 2) {
                    i15 = i0Var.f171937z;
                    i14 = i0Var.f171936y;
                    c39836h = (C39836h) i0Var.f171935x;
                    interfaceC25435a3 = (InterfaceC25435a) i0Var.f171934w;
                    try {
                        AbstractC34132o.m107864I(objM127831g0);
                        no_hr_device = (WhoopLabsHrDevice) objM127831g0;
                        if (no_hr_device == null) {
                            no_hr_device = WhoopLabsHrDeviceKt.getNO_HR_DEVICE();
                        }
                        c39836h.m127823b0(no_hr_device);
                        outputFile = this.fileWriter.getOutputFile();
                        if (outputFile == null) {
                            outputFile = this.fileWriter.m77513h();
                        }
                        if (outputFile != null && outputFile.length() != 0) {
                            i0Var.f171934w = interfaceC25435a3;
                            i0Var.f171935x = null;
                            i0Var.f171936y = i14;
                            i0Var.f171937z = i15;
                            i0Var.f171933G = 3;
                            objM127831g0 = m127831g0(outputFile, i0Var);
                            if (objM127831g0 != enumC31071a) {
                                interfaceC25435a2 = interfaceC25435a3;
                                interfaceC25435a2.mo68214i(null);
                                return objM127831g0;
                            }
                            return enumC31071a;
                        }
                        this.logger.mo85216g("Nothing to upload", new AbstractC30556a.a[0]);
                        Boolean bool = Boolean.TRUE;
                        interfaceC25435a3.mo68214i(null);
                        return bool;
                    } catch (Throwable th4) {
                        th3 = th4;
                        interfaceC25435a2 = interfaceC25435a3;
                    }
                } else {
                    if (i17 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC25435a2 = (InterfaceC25435a) i0Var.f171934w;
                    try {
                        AbstractC34132o.m107864I(objM127831g0);
                        interfaceC25435a2.mo68214i(null);
                        return objM127831g0;
                    } catch (Throwable th5) {
                        th3 = th5;
                    }
                }
                interfaceC25435a2.mo68214i(null);
                throw th3;
            }
            i13 = i0Var.f171936y;
            InterfaceC25435a interfaceC25435a4 = (InterfaceC25435a) i0Var.f171934w;
            AbstractC34132o.m107864I(objM127831g0);
            interfaceC25435a = interfaceC25435a4;
            C13732c c13732c = this.labsRepository;
            i0Var.f171934w = interfaceC25435a;
            i0Var.f171935x = this;
            i0Var.f171936y = i13;
            i0Var.f171937z = 0;
            i0Var.f171933G = 2;
            Object objM38991k = c13732c.m38991k(i0Var);
            if (objM38991k != enumC31071a) {
                c39836h = this;
                interfaceC25435a3 = interfaceC25435a;
                objM127831g0 = objM38991k;
                i14 = i13;
                i15 = 0;
                no_hr_device = (WhoopLabsHrDevice) objM127831g0;
                if (no_hr_device == null) {
                    no_hr_device = WhoopLabsHrDeviceKt.getNO_HR_DEVICE();
                }
                c39836h.m127823b0(no_hr_device);
                outputFile = this.fileWriter.getOutputFile();
                if (outputFile == null) {
                    outputFile = this.fileWriter.m77513h();
                }
                if (outputFile != null) {
                    i0Var.f171934w = interfaceC25435a3;
                    i0Var.f171935x = null;
                    i0Var.f171936y = i14;
                    i0Var.f171937z = i15;
                    i0Var.f171933G = 3;
                    objM127831g0 = m127831g0(outputFile, i0Var);
                    if (objM127831g0 != enumC31071a) {
                        interfaceC25435a2 = interfaceC25435a3;
                        interfaceC25435a2.mo68214i(null);
                        return objM127831g0;
                    }
                }
                this.logger.mo85216g("Nothing to upload", new AbstractC30556a.a[0]);
                Boolean bool2 = Boolean.TRUE;
                interfaceC25435a3.mo68214i(null);
                return bool2;
            }
            return enumC31071a;
        } catch (Throwable th6) {
            interfaceC25435a2 = interfaceC25435a;
            th3 = th6;
        }
    }

    /* JADX INFO: renamed from: s */
    private final Object m127844s(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        boolean zM65745e = AbstractC22676k.m65745e(m127813K().getHrDeviceId(), WhoopLabsHrDeviceKt.NO_HR_DEVICE_ID);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM65745e) {
            InterfaceC34116n interfaceC34116n = this.logger;
            String hrDeviceId = m127813K().getHrDeviceId();
            String fileName = m127813K().getFileName();
            String strM82463a = this.versionHelper.m82463a();
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Going to try to reconnect to ", hrDeviceId, ", filename ", fileName, " ");
            sbM32001t.append(strM82463a);
            interfaceC34116n.mo85216g(sbM32001t.toString(), new AbstractC30556a.a[0]);
            String hrDeviceId2 = m127813K().getHrDeviceId();
            String fileName2 = m127813K().getFileName();
            AbstractC22676k.m65747g(fileName2);
            Object objM127872v = m127872v(hrDeviceId2, fileName2, interfaceC30057d);
            if (objM127872v == EnumC31071a.f128113w) {
                return objM127872v;
            }
        }
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x0094  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:? A[LOOP:0: B:25:0x008e->B:36:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: t */
    public final Object m127845t(InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        c cVar;
        LabsCampaign labsCampaign;
        int i13;
        Iterator it;
        LabsCampaign labsCampaign2;
        int i14;
        int i15;
        C13732c c13732c;
        ProtocolStepResult protocolStepResult;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i16 = cVar.f171867L;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                cVar.f171867L = i16 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object obj = cVar.f171865J;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i17 = cVar.f171867L;
        if (i17 == 0) {
            AbstractC34132o.m107864I(obj);
            LabsCampaign labsCampaign3 = this.campaign;
            if (labsCampaign3 != null) {
                InterfaceC30063j interfaceC30063jMo54465b = this.dispatcherFactory.mo54465b();
                d dVar = new d(labsCampaign3, null);
                cVar.f171868w = labsCampaign3;
                cVar.f171862G = 0;
                cVar.f171867L = 1;
                Object objM8705K = AbstractC3006f0.m8705K(interfaceC30063jMo54465b, dVar, cVar);
                if (objM8705K != enumC31071a) {
                    labsCampaign = labsCampaign3;
                    obj = objM8705K;
                    i13 = 0;
                }
                return enumC31071a;
            }
            return C23454a0.f92919a;
        }
        if (i17 == 1) {
            i13 = cVar.f171862G;
            labsCampaign = (LabsCampaign) cVar.f171868w;
            AbstractC34132o.m107864I(obj);
        } else {
            if (i17 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i15 = cVar.f171863H;
            i14 = cVar.f171862G;
            it = (Iterator) cVar.f171871z;
            labsCampaign2 = (LabsCampaign) cVar.f171868w;
            AbstractC34132o.m107864I(obj);
        }
        while (it.hasNext()) {
            ProtocolStepWithOptions protocolStepWithOptions = (ProtocolStepWithOptions) it.next();
            c13732c = this.labsRepository;
            protocolStepResult = new ProtocolStepResult(labsCampaign2.getCampaignId(), protocolStepWithOptions.getProtocolStep().getId(), protocolStepWithOptions.getProtocolStep().getOrder(), null, null, null, false, null, null, null, null, 2040, null);
            cVar.f171868w = labsCampaign2;
            cVar.f171869x = null;
            cVar.f171870y = null;
            cVar.f171871z = it;
            cVar.f171860E = null;
            cVar.f171861F = null;
            cVar.f171862G = i14;
            cVar.f171863H = i15;
            cVar.f171864I = 0;
            cVar.f171867L = 2;
            if (c13732c.m38999s(protocolStepResult, cVar) == enumC31071a) {
                return enumC31071a;
            }
        }
        return C23454a0.f92919a;
        RemoteCampaign remoteCampaign = (RemoteCampaign) obj;
        if (remoteCampaign != null) {
            it = remoteCampaign.getProtocolSteps().iterator();
            labsCampaign2 = labsCampaign;
            i14 = i13;
            i15 = 0;
            while (it.hasNext()) {
                ProtocolStepWithOptions protocolStepWithOptions2 = (ProtocolStepWithOptions) it.next();
                c13732c = this.labsRepository;
                protocolStepResult = new ProtocolStepResult(labsCampaign2.getCampaignId(), protocolStepWithOptions2.getProtocolStep().getId(), protocolStepWithOptions2.getProtocolStep().getOrder(), null, null, null, false, null, null, null, null, 2040, null);
                cVar.f171868w = labsCampaign2;
                cVar.f171869x = null;
                cVar.f171870y = null;
                cVar.f171871z = it;
                cVar.f171860E = null;
                cVar.f171861F = null;
                cVar.f171862G = i14;
                cVar.f171863H = i15;
                cVar.f171864I = 0;
                cVar.f171867L = 2;
                if (c13732c.m38999s(protocolStepResult, cVar) == enumC31071a) {
                    return enumC31071a;
                }
            }
        } else {
            this.logger.mo85222m(AbstractC11266d.m30456j(labsCampaign.getCampaignId(), "Couldn't create step results for campaign ", ", campaign not found in db ", this.versionHelper.m82463a()), new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: u */
    public final Object m127846u(InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        e eVar;
        LabsProtocol labsProtocol;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f171884z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f171884z = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object obj = eVar.f171882x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar.f171884z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                LabsCampaign labsCampaign = this.campaign;
                LabsProtocol protocol = labsCampaign != null ? labsCampaign.getProtocol() : null;
                if (protocol != null && m127856I().getPdfFileName() == null) {
                    this.logger.mo85228t("protocol not null and study filename is null; protocol pdf URL " + protocol.getPdfUrl() + " " + this.versionHelper.m82463a(), new AbstractC30556a.a[0]);
                    InterfaceC30063j interfaceC30063jMo54465b = this.dispatcherFactory.mo54465b();
                    f fVar = new f(protocol, null);
                    eVar.f171881w = protocol;
                    eVar.f171884z = 1;
                    Object objM8705K = AbstractC3006f0.m8705K(interfaceC30063jMo54465b, fVar, eVar);
                    if (objM8705K == enumC31071a) {
                        return enumC31071a;
                    }
                    labsProtocol = protocol;
                    obj = objM8705K;
                }
                return C23454a0.f92919a;
            }
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            labsProtocol = (LabsProtocol) eVar.f171881w;
            AbstractC34132o.m107864I(obj);
            AbstractC34799a1 abstractC34799a1 = (AbstractC34799a1) obj;
            File fileM85164h = this.fileManager.m85164h("protocol_" + labsProtocol.getProtocolId() + ".pdf", abstractC34799a1);
            abstractC34799a1.close();
            this.logger.mo85228t("output file name " + fileM85164h.getName() + " path " + fileM85164h.getPath() + " absPath " + fileM85164h.getAbsolutePath() + " " + this.versionHelper.m82463a(), new AbstractC30556a.a[0]);
            m127866a0(WhoopLabsStudy.copy$default(m127856I(), 0, null, null, false, null, 0, fileM85164h.getPath(), 0, false, 447, null));
            this.logger.mo85228t("updated study with " + m127856I().getPdfFileName() + " " + this.versionHelper.m82463a(), new AbstractC30556a.a[0]);
        } catch (Exception e5) {
            this.logger.mo85230v(AbstractC11266d.m30461o("Error downloading and saving protocol PDF ", this.versionHelper.m82463a()), e5, new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    private final Object m127847z(String str, InterfaceC30057d<? super String> interfaceC30057d) {
        int i13 = this.userId;
        String strM125926K = AbstractC39421y.m125926K(str, ":", "", false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(i13);
        sb4.append("_");
        sb4.append(strM125926K);
        sb4.append("_");
        return AbstractC11266d.m30457k(jCurrentTimeMillis, ".log", sb4);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final InterfaceC13075p1 getBtHrMissing() {
        return this.btHrMissing;
    }

    /* JADX INFO: renamed from: B */
    public final C28199s0<TextResource> m127849B() {
        return this.errorAction;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final C26046e getFileWriter() {
        return this.fileWriter;
    }

    /* JADX INFO: renamed from: D */
    public final C39830b m127851D() {
        return (C39830b) this.hrDevice.getValue(this, f171810k0[2]);
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final HrDeviceConnection getHrDeviceConnection() {
        return this.hrDeviceConnection;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final InterfaceC13075p1 getHrDeviceFlow() {
        return this.hrDeviceFlow;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final DateTime getLastBtHrReceivedTime() {
        return this.lastBtHrReceivedTime;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final C28196r0 getStopSelfAction() {
        return this.stopSelfAction;
    }

    /* JADX INFO: renamed from: I */
    public final WhoopLabsStudy m127856I() {
        return (WhoopLabsStudy) this.study.getValue(this, f171810k0[0]);
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final InterfaceC13075p1 getStudyFlow() {
        return this.studyFlow;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0073  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: M */
    public final Object m127858M(String str, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        k kVar;
        String str2;
        String str3;
        String str4 = str;
        if (interfaceC30057d instanceof k) {
            kVar = (k) interfaceC30057d;
            int i13 = kVar.f171944E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                kVar.f171944E = i13 - Integer.MIN_VALUE;
            } else {
                kVar = new k(interfaceC30057d);
            }
        } else {
            kVar = new k(interfaceC30057d);
        }
        Object objM127847z = kVar.f171947y;
        Object obj = EnumC31071a.f128113w;
        int i14 = kVar.f171944E;
        boolean z4 = true;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM127847z);
            kVar.f171945w = str4;
            kVar.f171944E = 1;
            objM127847z = m127847z(str4, kVar);
            if (objM127847z != obj) {
            }
            return obj;
        }
        if (i14 == 1) {
            str4 = (String) kVar.f171945w;
            AbstractC34132o.m107864I(objM127847z);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = (String) kVar.f171946x;
            str2 = (String) kVar.f171945w;
            AbstractC34132o.m107864I(objM127847z);
        }
        if (((Boolean) objM127847z).booleanValue()) {
            WhoopLabsHrDevice whoopLabsHrDeviceM127813K = m127813K();
            C39830b c39830bM127851D = m127851D();
            AbstractC22676k.m65747g(c39830bM127851D);
            m127823b0(whoopLabsHrDeviceM127813K.copy(str2, c39830bM127851D.getName(), str3));
            m127866a0(WhoopLabsStudy.copy$default(m127856I(), 0, null, null, true, null, 0, null, 0, false, 503, null));
        } else {
            z4 = false;
        }
        return Boolean.valueOf(z4);
        String str5 = (String) objM127847z;
        kVar.f171945w = str4;
        kVar.f171946x = str5;
        kVar.f171944E = 2;
        Object objM127872v = m127872v(str4, str5, kVar);
        if (objM127872v != obj) {
            str2 = str4;
            str3 = str5;
            objM127847z = objM127872v;
            if (((Boolean) objM127847z).booleanValue()) {
                WhoopLabsHrDevice whoopLabsHrDeviceM127813K2 = m127813K();
                C39830b c39830bM127851D2 = m127851D();
                AbstractC22676k.m65747g(c39830bM127851D2);
                m127823b0(whoopLabsHrDeviceM127813K2.copy(str2, c39830bM127851D2.getName(), str3));
                m127866a0(WhoopLabsStudy.copy$default(m127856I(), 0, null, null, true, null, 0, null, 0, false, 503, null));
            } else {
                z4 = false;
            }
            return Boolean.valueOf(z4);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: O */
    public final Object m127859O(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        m mVar;
        C39836h c39836h;
        C39836h c39836h2;
        if (interfaceC30057d instanceof m) {
            mVar = (m) interfaceC30057d;
            int i13 = mVar.f171962z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                mVar.f171962z = i13 - Integer.MIN_VALUE;
            } else {
                mVar = new m(interfaceC30057d);
            }
        } else {
            mVar = new m(interfaceC30057d);
        }
        Object objM38991k = mVar.f171960x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = mVar.f171962z;
        if (i14 != 0) {
            if (i14 == 1) {
                c39836h = (C39836h) mVar.f171959w;
                AbstractC34132o.m107864I(objM38991k);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c39836h2 = (C39836h) mVar.f171959w;
                AbstractC34132o.m107864I(objM38991k);
            }
            c39836h2.lastBtHrReceivedTime = (DateTime) objM38991k;
            return C23454a0.f92919a;
        }
        AbstractC34132o.m107864I(objM38991k);
        if (this.featureFlagChecker.isFeatureEnabled("dwl-android-connection-maintainer-fix")) {
            InterfaceC3027k1 interfaceC3027k1 = this.bthrCollectionJob;
            if (interfaceC3027k1 == null || !interfaceC3027k1.isActive()) {
                this.bthrCollectionJob = AbstractC3006f0.m8732z(this, null, null, new n(null), 3);
            }
        } else {
            AbstractC3006f0.m8732z(this, null, null, new o(null), 3);
        }
        C13732c c13732c = this.labsRepository;
        mVar.f171959w = this;
        mVar.f171962z = 1;
        objM38991k = c13732c.m38991k(mVar);
        if (objM38991k != enumC31071a) {
            c39836h = this;
        }
        return enumC31071a;
        WhoopLabsHrDevice no_hr_device = (WhoopLabsHrDevice) objM38991k;
        if (no_hr_device == null) {
            no_hr_device = WhoopLabsHrDeviceKt.getNO_HR_DEVICE();
        }
        c39836h.m127823b0(no_hr_device);
        C39829a c39829a = this.btHrTimestampStore;
        mVar.f171959w = this;
        mVar.f171962z = 2;
        objM38991k = c39829a.m127776g(mVar);
        if (objM38991k != enumC31071a) {
            c39836h2 = this;
            c39836h2.lastBtHrReceivedTime = (DateTime) objM38991k;
            return C23454a0.f92919a;
        }
        return enumC31071a;
    }

    /* JADX INFO: renamed from: P */
    public final void m127860P() {
        InterfaceC3027k1 interfaceC3027k1 = this.bthrCollectionJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        this.bthrCollectionJob = null;
        this.supervisorJob.cancel((CancellationException) null);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008f  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cf A[PHI: r2
      0x00cf: PHI (r2v13 java.lang.Object) = (r2v10 java.lang.Object), (r2v1 java.lang.Object) binds: [B:31:0x00cc, B:16:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:46:0x0101  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010a, code lost:
    
        if (m127820Y(r3) == r4) goto L48;
     */
    /* JADX INFO: renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m127861Q(com.whoop.whooplabs.data.domain.LabsCampaign r21, q83.InterfaceC30057d<? super l83.C23454a0> r22) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yw2.C39836h.m127861Q(com.whoop.whooplabs.data.domain.LabsCampaign, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: R */
    public final Object m127862R(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        q qVar;
        C39836h c39836h;
        if (interfaceC30057d instanceof q) {
            qVar = (q) interfaceC30057d;
            int i13 = qVar.f171977z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                qVar.f171977z = i13 - Integer.MIN_VALUE;
            } else {
                qVar = new q(interfaceC30057d);
            }
        } else {
            qVar = new q(interfaceC30057d);
        }
        Object objM127776g = qVar.f171975x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = qVar.f171977z;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM127776g);
            C39829a c39829a = this.btHrTimestampStore;
            qVar.f171974w = this;
            qVar.f171977z = 1;
            objM127776g = c39829a.m127776g(qVar);
            if (objM127776g != enumC31071a) {
                c39836h = this;
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            c39836h = (C39836h) qVar.f171974w;
            AbstractC34132o.m107864I(objM127776g);
        } else if (i14 == 2) {
            AbstractC34132o.m107864I(objM127776g);
            if (((Boolean) objM127776g).booleanValue() && m127814L()) {
                qVar.f171977z = 3;
                if (m127864T(qVar) == enumC31071a) {
                    return enumC31071a;
                }
            }
        } else {
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM127776g);
        }
        return c23454a0;
        c39836h.lastBtHrReceivedTime = (DateTime) objM127776g;
        C39829a c39829a2 = this.btHrTimestampStore;
        qVar.f171974w = null;
        qVar.f171977z = 2;
        objM127776g = c39829a2.m127774d(qVar);
        if (objM127776g != enumC31071a) {
            if (((Boolean) objM127776g).booleanValue()) {
                qVar.f171977z = 3;
                if (m127864T(qVar) == enumC31071a) {
                }
            }
            return c23454a0;
        }
        return enumC31071a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x020a  */
    /* JADX WARN: Code duplicated, block: B:102:0x0218  */
    /* JADX WARN: Code duplicated, block: B:104:0x0220  */
    /* JADX WARN: Code duplicated, block: B:106:0x0228  */
    /* JADX WARN: Code duplicated, block: B:117:0x0258  */
    /* JADX WARN: Code duplicated, block: B:120:0x0269  */
    /* JADX WARN: Code duplicated, block: B:122:0x026f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0122  */
    /* JADX WARN: Code duplicated, block: B:62:0x0126  */
    /* JADX WARN: Code duplicated, block: B:63:0x0131  */
    /* JADX WARN: Code duplicated, block: B:65:0x0134  */
    /* JADX WARN: Code duplicated, block: B:68:0x0141  */
    /* JADX WARN: Code duplicated, block: B:70:0x0145  */
    /* JADX WARN: Code duplicated, block: B:71:0x0150  */
    /* JADX WARN: Code duplicated, block: B:73:0x0153  */
    /* JADX WARN: Code duplicated, block: B:76:0x0160  */
    /* JADX WARN: Code duplicated, block: B:78:0x0168 A[Catch: Exception -> 0x017a, TRY_ENTER, TryCatch #0 {Exception -> 0x017a, blocks: (B:19:0x0086, B:81:0x0177, B:78:0x0168), top: B:129:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x0175  */
    /* JADX WARN: Code duplicated, block: B:81:0x0177 A[Catch: Exception -> 0x017a, PHI: r13
      0x0177: PHI (r13v83 java.lang.Object) = (r13v82 java.lang.Object), (r13v1 java.lang.Object) binds: [B:79:0x0173, B:19:0x0086] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x017a, blocks: (B:19:0x0086, B:81:0x0177, B:78:0x0168), top: B:129:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0185  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c3 A[PHI: r13
      0x01c3: PHI (r13v6 java.lang.Object) = (r13v5 java.lang.Object), (r13v1 java.lang.Object) binds: [B:86:0x01bf, B:17:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:95:0x01df A[PHI: r13
      0x01df: PHI (r13v12 java.lang.Object) = (r13v10 java.lang.Object), (r13v1 java.lang.Object) binds: [B:93:0x01db, B:16:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x01e7  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v20 java.lang.Object, still in use, count: 2, list:
          (r2v20 java.lang.Object) from 0x00c8: PHI (r2 I:??) = (r2v17 java.lang.Object), (r2v20 java.lang.Object) binds: [B:35:0x00c7, B:131:0x00c8] A[DONT_GENERATE, DONT_INLINE]
          (r2v20 java.lang.Object) from 0x00bc: CHECK_CAST (java.lang.String) (r2v20 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX INFO: renamed from: S */
    public final java.lang.Object m127863S(q83.InterfaceC30057d<? super java.lang.Boolean> r13) {
        /*
            Method dump skipped, instruction units count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yw2.C39836h.m127863S(q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: T */
    public final Object m127864T(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        if (this.featureFlagChecker.isFeatureEnabled("dwl-android-connection-maintainer-fix")) {
            C26044c c26044c = this.hrConnectionMaintainer;
            if (c26044c != null) {
                c26044c.m77484r();
            }
            this.hrDeviceConnection.m28604r(false);
        } else {
            HrDeviceConnection.m28593s(this.hrDeviceConnection, false, 1, null);
            C26044c c26044c2 = this.hrConnectionMaintainer;
            if (c26044c2 != null) {
                c26044c2.m77484r();
            }
        }
        Object objM127844s = m127844s(interfaceC30057d);
        return objM127844s == EnumC31071a.f128113w ? objM127844s : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Z */
    public final void m127865Z(C39830b c39830b) {
        this.hrDevice.setValue(this, f171810k0[2], c39830b);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m127866a0(WhoopLabsStudy whoopLabsStudy) {
        AbstractC22676k.m65750j(whoopLabsStudy, "<set-?>");
        this.study.setValue(this, f171810k0[0], whoopLabsStudy);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0105  */
    /* JADX WARN: Code duplicated, block: B:52:0x011a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0123  */
    /* JADX WARN: Code duplicated, block: B:57:0x0139  */
    /* JADX WARN: Code duplicated, block: B:60:0x0146  */
    /* JADX WARN: Code duplicated, block: B:63:0x0168  */
    /* JADX WARN: Code duplicated, block: B:66:0x0171  */
    /* JADX WARN: Code duplicated, block: B:68:0x0187  */
    /* JADX WARN: Code duplicated, block: B:69:0x0188 A[PHI: r2 r5
      0x0188: PHI (r2v6 java.util.List) = (r2v20 java.util.List), (r2v21 java.util.List) binds: [B:59:0x0144, B:68:0x0187] A[DONT_GENERATE, DONT_INLINE]
      0x0188: PHI (r5v5 com.whoop.whooplabs.data.domain.LabsCampaign) = (r5v3 com.whoop.whooplabs.data.domain.LabsCampaign), (r5v7 com.whoop.whooplabs.data.domain.LabsCampaign) binds: [B:59:0x0144, B:68:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x0199  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:84:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d7, code lost:
    
        if (r11 == r1) goto L80;
     */
    /* JADX INFO: renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m127867d0(q83.InterfaceC30057d<? super java.lang.Boolean> r11) {
        /*
            Method dump skipped, instruction units count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yw2.C39836h.m127867d0(q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX INFO: renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m127868e0(q83.InterfaceC30057d<? super l83.C23454a0> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof yw2.C39836h.a0
            if (r0 == 0) goto L13
            r0 = r7
            yw2.h$a0 r0 = (yw2.C39836h.a0) r0
            int r1 = r0.f171853y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f171853y = r1
            goto L18
        L13:
            yw2.h$a0 r0 = new yw2.h$a0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f171851w
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f171853y
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            p505ts.AbstractC34132o.m107864I(r7)
            goto L62
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            p505ts.AbstractC34132o.m107864I(r7)
            goto L43
        L37:
            p505ts.AbstractC34132o.m107864I(r7)
            r0.f171853y = r5
            java.lang.Object r7 = r6.m127825c0(r0)
            if (r7 != r1) goto L43
            goto L61
        L43:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L57
            bc3.c0 r7 = r6.applicationScope
            yw2.h$b0 r0 = new yw2.h$b0
            r0.<init>(r3)
            r1 = 3
            bc3.AbstractC3006f0.m8732z(r7, r3, r3, r0, r1)
            goto L7c
        L57:
            yw2.a r7 = r6.btHrTimestampStore
            r0.f171853y = r4
            java.lang.Object r7 = r7.m127774d(r0)
            if (r7 != r1) goto L62
        L61:
            return r1
        L62:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L7c
            boolean r7 = r6.m127814L()
            if (r7 == 0) goto L7c
            ec3.p1 r7 = r6.btHrMissing
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            ec3.h2 r7 = (ec3.C13045h2) r7
            r7.getClass()
            r7.m36571k(r3, r0)
        L7c:
            l83.a0 r7 = l83.C23454a0.f92919a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yw2.C39836h.m127868e0(q83.d):java.lang.Object");
    }

    @Override // bc3.InterfaceC2994c0
    public InterfaceC30063j getCoroutineContext() {
        return this.dispatcherFactory.getDefault().plus(this.supervisorJob);
    }

    @Override // of3.InterfaceC27903a
    public /* bridge */ C26669a getKoin() {
        return AbstractC34132o.m107856A(this);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0081  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        if (r10 == r1) goto L36;
     */
    /* JADX INFO: renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m127869k0(q83.InterfaceC30057d<? super l83.C23454a0> r10) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yw2.C39836h.m127869k0(q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: q */
    public final void m127870q(String note) {
        AbstractC3006f0.m8732z(this, this.dispatcherFactory.mo54465b(), null, new a(note, null), 2);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0096  */
    /* JADX WARN: Code duplicated, block: B:40:0x009a  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ec, code lost:
    
        if (m127818W(r11, r0) == r1) goto L55;
     */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m127871r(q83.InterfaceC30057d<? super l83.C23454a0> r11) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yw2.C39836h.m127871r(q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: v */
    public final Object m127872v(String str, String str2, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        g gVar;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f171898E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f171898E = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        Object objM28606v = gVar.f171901y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = gVar.f171898E;
        boolean z4 = true;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM28606v);
                this.hrDeviceConnection.m28607z();
                Object objM122602a = getKoin().f106046a.f159364d.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C26044c.class), null);
                ((C26044c) objM122602a).m77483q(this.hrDeviceConnection);
                this.hrConnectionMaintainer = (C26044c) objM122602a;
                this.logger.mo85216g("set up connectionMaintainer " + this.versionHelper.m82463a(), new AbstractC30556a.a[0]);
                HrDeviceConnection hrDeviceConnection = this.hrDeviceConnection;
                gVar.f171899w = null;
                gVar.f171900x = str2;
                gVar.f171898E = 1;
                objM28606v = hrDeviceConnection.m28606v(str, gVar);
                if (objM28606v == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) gVar.f171900x;
                AbstractC34132o.m107864I(objM28606v);
            }
            this.logger.mo85216g("Connected to device " + this.versionHelper.m82463a(), new AbstractC30556a.a[0]);
            m127865Z(C39830b.INSTANCE.m127789a((BluetoothDevice) objM28606v));
            this.fileWriter.m77514j(str2);
            this.logger.mo85216g("opened file for writing " + this.versionHelper.m82463a(), new AbstractC30556a.a[0]);
        } catch (HrDeviceConnection.HrDeviceConnectionException e5) {
            m127816U(new TextResource.C8688b(AbstractC39833e.f171728m, new TextResource.AbstractC8690d.a(e5.getError().toString())));
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b1 A[Catch: all -> 0x00b6, TryCatch #1 {all -> 0x00b6, blocks: (B:40:0x00ad, B:42:0x00b1, B:45:0x00ba, B:47:0x00c5, B:49:0x00cd, B:52:0x00d8, B:66:0x0113, B:36:0x0097), top: B:73:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c5 A[Catch: all -> 0x00b6, TryCatch #1 {all -> 0x00b6, blocks: (B:40:0x00ad, B:42:0x00b1, B:45:0x00ba, B:47:0x00c5, B:49:0x00cd, B:52:0x00d8, B:66:0x0113, B:36:0x0097), top: B:73:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f3 A[Catch: all -> 0x005b, TRY_LEAVE, TryCatch #2 {all -> 0x005b, blocks: (B:22:0x0056, B:56:0x00eb, B:58:0x00f3), top: B:74:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0107  */
    /* JADX WARN: Code duplicated, block: B:62:0x0109  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: w */
    public final Object m127873w(InterfaceC30057d<? super Boolean> interfaceC30057d) throws Throwable {
        h hVar;
        InterfaceC25435a interfaceC25435a;
        int i13;
        InterfaceC25435a interfaceC25435a2;
        C39836h c39836h;
        int i14;
        int i15;
        WhoopLabsHrDevice no_hr_device;
        File outputFile;
        int i16;
        InterfaceC25435a interfaceC25435a3;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i17 = hVar.f171918G;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                hVar.f171918G = i17 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        Object objM38991k = hVar.f171916E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i18 = hVar.f171918G;
        boolean z4 = true;
        try {
            if (i18 == 0) {
                AbstractC34132o.m107864I(objM38991k);
                InterfaceC25435a interfaceC25435a4 = this.bthrUploadMutex;
                hVar.f171919w = interfaceC25435a4;
                hVar.f171921y = 0;
                hVar.f171918G = 1;
                if (interfaceC25435a4.mo68211b(hVar) != enumC31071a) {
                    interfaceC25435a = interfaceC25435a4;
                    i13 = 0;
                }
                return enumC31071a;
            }
            if (i18 != 1) {
                if (i18 != 2) {
                    if (i18 != 3) {
                        if (i18 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC25435a2 = (InterfaceC25435a) hVar.f171919w;
                        try {
                            AbstractC34132o.m107864I(objM38991k);
                            Boolean boolValueOf = Boolean.valueOf(z4);
                            interfaceC25435a2.mo68214i(null);
                            return boolValueOf;
                        } catch (Throwable th3) {
                            th = th3;
                            interfaceC25435a2.mo68214i(null);
                            throw th;
                        }
                    }
                    i15 = hVar.f171922z;
                    i16 = hVar.f171921y;
                    interfaceC25435a3 = (InterfaceC25435a) hVar.f171919w;
                    try {
                        AbstractC34132o.m107864I(objM38991k);
                        if (((Boolean) objM38991k).booleanValue()) {
                            m127874x();
                            hVar.f171919w = interfaceC25435a3;
                            hVar.f171920x = null;
                            hVar.f171921y = i16;
                            hVar.f171922z = i15;
                            hVar.f171918G = 4;
                            if (m127817V(hVar) != enumC31071a) {
                                interfaceC25435a2 = interfaceC25435a3;
                            }
                            return enumC31071a;
                        }
                        interfaceC25435a2 = interfaceC25435a3;
                        z4 = false;
                        Boolean boolValueOf2 = Boolean.valueOf(z4);
                        interfaceC25435a2.mo68214i(null);
                        return boolValueOf2;
                    } catch (Throwable th4) {
                        th = th4;
                        interfaceC25435a2 = interfaceC25435a3;
                        interfaceC25435a2.mo68214i(null);
                        throw th;
                    }
                }
                i15 = hVar.f171922z;
                i14 = hVar.f171921y;
                C39836h c39836h2 = (C39836h) hVar.f171920x;
                InterfaceC25435a interfaceC25435a5 = (InterfaceC25435a) hVar.f171919w;
                try {
                    AbstractC34132o.m107864I(objM38991k);
                    c39836h = c39836h2;
                    interfaceC25435a = interfaceC25435a5;
                    no_hr_device = (WhoopLabsHrDevice) objM38991k;
                    if (no_hr_device == null) {
                        no_hr_device = WhoopLabsHrDeviceKt.getNO_HR_DEVICE();
                    }
                    c39836h.m127823b0(no_hr_device);
                    outputFile = this.fileWriter.getOutputFile();
                    if (outputFile == null) {
                        outputFile = this.fileWriter.m77513h();
                    }
                    if (outputFile != null && outputFile.length() != 0) {
                        hVar.f171919w = interfaceC25435a;
                        hVar.f171920x = null;
                        hVar.f171921y = i14;
                        hVar.f171922z = i15;
                        hVar.f171918G = 3;
                        objM38991k = m127829f0(outputFile, hVar);
                        if (objM38991k != enumC31071a) {
                            i16 = i14;
                            interfaceC25435a3 = interfaceC25435a;
                            if (((Boolean) objM38991k).booleanValue()) {
                                m127874x();
                                hVar.f171919w = interfaceC25435a3;
                                hVar.f171920x = null;
                                hVar.f171921y = i16;
                                hVar.f171922z = i15;
                                hVar.f171918G = 4;
                                if (m127817V(hVar) != enumC31071a) {
                                    interfaceC25435a2 = interfaceC25435a3;
                                }
                            } else {
                                interfaceC25435a2 = interfaceC25435a3;
                                z4 = false;
                            }
                            Boolean boolValueOf3 = Boolean.valueOf(z4);
                            interfaceC25435a2.mo68214i(null);
                            return boolValueOf3;
                        }
                        return enumC31071a;
                    }
                    this.logger.mo85216g("Nothing to upload", new AbstractC30556a.a[0]);
                    Boolean bool = Boolean.TRUE;
                    interfaceC25435a.mo68214i(null);
                    return bool;
                } catch (Throwable th5) {
                    th = th5;
                    interfaceC25435a2 = interfaceC25435a5;
                    interfaceC25435a2.mo68214i(null);
                    throw th;
                }
            }
            i13 = hVar.f171921y;
            interfaceC25435a = (InterfaceC25435a) hVar.f171919w;
            AbstractC34132o.m107864I(objM38991k);
            C13732c c13732c = this.labsRepository;
            hVar.f171919w = interfaceC25435a;
            hVar.f171920x = this;
            hVar.f171921y = i13;
            hVar.f171922z = 0;
            hVar.f171918G = 2;
            objM38991k = c13732c.m38991k(hVar);
            if (objM38991k != enumC31071a) {
                c39836h = this;
                i14 = i13;
                i15 = 0;
                no_hr_device = (WhoopLabsHrDevice) objM38991k;
                if (no_hr_device == null) {
                    no_hr_device = WhoopLabsHrDeviceKt.getNO_HR_DEVICE();
                }
                c39836h.m127823b0(no_hr_device);
                outputFile = this.fileWriter.getOutputFile();
                if (outputFile == null) {
                    outputFile = this.fileWriter.m77513h();
                }
                if (outputFile != null) {
                    hVar.f171919w = interfaceC25435a;
                    hVar.f171920x = null;
                    hVar.f171921y = i14;
                    hVar.f171922z = i15;
                    hVar.f171918G = 3;
                    objM38991k = m127829f0(outputFile, hVar);
                    if (objM38991k != enumC31071a) {
                        i16 = i14;
                        interfaceC25435a3 = interfaceC25435a;
                        if (((Boolean) objM38991k).booleanValue()) {
                            m127874x();
                            hVar.f171919w = interfaceC25435a3;
                            hVar.f171920x = null;
                            hVar.f171921y = i16;
                            hVar.f171922z = i15;
                            hVar.f171918G = 4;
                            if (m127817V(hVar) != enumC31071a) {
                                interfaceC25435a2 = interfaceC25435a3;
                            }
                        } else {
                            interfaceC25435a2 = interfaceC25435a3;
                            z4 = false;
                        }
                        Boolean boolValueOf4 = Boolean.valueOf(z4);
                        interfaceC25435a2.mo68214i(null);
                        return boolValueOf4;
                    }
                }
                this.logger.mo85216g("Nothing to upload", new AbstractC30556a.a[0]);
                Boolean bool2 = Boolean.TRUE;
                interfaceC25435a.mo68214i(null);
                return bool2;
            }
            return enumC31071a;
        } catch (Throwable th6) {
            th = th6;
            interfaceC25435a2 = interfaceC25435a;
            interfaceC25435a2.mo68214i(null);
            throw th;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m127874x() {
        m127866a0(WhoopLabsStudy.copy$default(m127856I(), 0, null, null, false, null, 0, null, 0, false, 503, null));
        this.hrDeviceConnection.m28605t();
        C26044c c26044c = this.hrConnectionMaintainer;
        if (c26044c != null) {
            c26044c.m77484r();
        }
        this.fileWriter.m77508b();
        this.fileWriter.m77509c();
        m127823b0(WhoopLabsHrDeviceKt.getNO_HR_DEVICE());
        m127865Z(null);
        InterfaceC13075p1 interfaceC13075p1 = this.btHrMissing;
        Boolean bool = Boolean.FALSE;
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, bool);
        this.lastBtHrReceivedTime = null;
        AbstractC3006f0.m8732z(this, null, null, new i(null), 3);
    }

    /* JADX INFO: renamed from: y */
    public final void m127875y() {
        m127866a0(m127856I().ended(this.dateAndTimeProvider.mo133364c()));
    }
}
