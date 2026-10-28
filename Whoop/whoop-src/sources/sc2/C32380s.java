package sc2;

import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1630u0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c52.AbstractC4251b;
import c93.InterfaceC4351m;
import ci2.InterfaceC4733b;
import com.whoop.connectivityCore.batteryPack.models.BatteryPackType;
import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.data.repositories.StringsRepository;
import com.whoop.domain.model.MetricsProcessedTime;
import com.whoop.domain.model.WhoopStrapInfo;
import com.whoop.p069ui.views.C10627a;
import com.whoop.p069ui.views.EnumC10628b;
import dt0.InterfaceC12361d;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import f93.InterfaceC14292d;
import gy0.AbstractC16277f;
import hc3.C17171d;
import hi0.AbstractC17305c;
import hi0.AbstractC17306d;
import hi0.AbstractC17311i;
import hi0.AbstractC17312j;
import hi0.AbstractC17313k;
import hj0.AbstractC17356o;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import jk0.InterfaceC21750d;
import kn2.EnumC22601c;
import l73.AbstractC23412c;
import l83.C23454a0;
import l83.C23465k;
import lm0.C24506a;
import lm0.EnumC24508c;
import m32.EnumC25009e;
import m73.AbstractC25214b;
import m73.C25217e;
import or2.AbstractC28188o1;
import or2.C28150c;
import or2.C28180m;
import or2.C28196r0;
import or2.C28199s0;
import or2.C28204u;
import or2.C28205u0;
import org.joda.time.DateTime;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import q92.C30076h;
import qr2.AbstractC30556a;
import r73.AbstractC31056a;
import r83.EnumC31071a;
import rv1.C31842a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.C32970n;
import st0.EnumC32978v;
import t73.C33589b;
import td1.EnumC33707e;
import td1.InterfaceC33704b;
import tj0.EnumC33865b;
import tj0.InterfaceC33864a;
import tr2.InterfaceC34116n;
import vu1.AbstractC36510a;
import w73.C36920f;
import w73.C36930p;
import wb3.AbstractC37056f;
import ws0.C37605a;
import xs0.C38637a;
import xs0.InterfaceC38638b;
import y42.C39228j;
import y42.InterfaceC39219a;
import yg2.C39531f;
import z82.C40191e;
import zg3.C40634a;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: sc2.s */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 c2\u00020\u0001:\u0002Ï\u0001B\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020%2\b\b\u0002\u0010$\u001a\u00020 ¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020%¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020%¢\u0006\u0004\b*\u0010)J\u0015\u0010-\u001a\u00020%2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020%2\u0006\u0010/\u001a\u00020+¢\u0006\u0004\b0\u0010.J\r\u00101\u001a\u00020%¢\u0006\u0004\b1\u0010)J\u0017\u00104\u001a\u00020%2\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b4\u00105J\u0015\u00108\u001a\u00020%2\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020+H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020%H\u0002¢\u0006\u0004\b<\u0010)J\u000f\u0010=\u001a\u00020%H\u0002¢\u0006\u0004\b=\u0010)J\u000f\u0010>\u001a\u00020%H\u0002¢\u0006\u0004\b>\u0010)J\u000f\u0010?\u001a\u00020%H\u0002¢\u0006\u0004\b?\u0010)J\u0017\u0010B\u001a\u00020%2\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020%2\u0006\u0010D\u001a\u00020@H\u0002¢\u0006\u0004\bE\u0010CJ\u000f\u0010F\u001a\u00020%H\u0002¢\u0006\u0004\bF\u0010)J\u0017\u0010I\u001a\u00020%2\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020%H\u0002¢\u0006\u0004\bK\u0010)J\u000f\u0010L\u001a\u00020%H\u0002¢\u0006\u0004\bL\u0010)J\u000f\u0010M\u001a\u00020%H\u0002¢\u0006\u0004\bM\u0010)J\u000f\u0010N\u001a\u00020%H\u0002¢\u0006\u0004\bN\u0010)J\u000f\u0010O\u001a\u00020%H\u0002¢\u0006\u0004\bO\u0010)J\u000f\u0010P\u001a\u00020%H\u0002¢\u0006\u0004\bP\u0010)J\u001b\u0010S\u001a\u00020\u00142\n\b\u0002\u0010R\u001a\u0004\u0018\u00010QH\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020%H\u0002¢\u0006\u0004\bU\u0010)J\u000f\u0010V\u001a\u00020%H\u0002¢\u0006\u0004\bV\u0010)J\u000f\u0010W\u001a\u00020+H\u0002¢\u0006\u0004\bW\u0010;J\u0019\u0010[\u001a\u00020Z2\b\u0010Y\u001a\u0004\u0018\u00010XH\u0002¢\u0006\u0004\b[\u0010\\J\u000f\u0010^\u001a\u00020]H\u0002¢\u0006\u0004\b^\u0010_J\u0017\u0010a\u001a\u00020\u00142\u0006\u0010`\u001a\u00020\u0014H\u0002¢\u0006\u0004\ba\u0010bJ\u0017\u0010c\u001a\u0002022\u0006\u0010`\u001a\u00020\u0014H\u0002¢\u0006\u0004\bc\u0010dJ\u0017\u0010e\u001a\u00020%2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\be\u0010.J\u000f\u0010g\u001a\u00020fH\u0002¢\u0006\u0004\bg\u0010hR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0015\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001f\u0010\u008b\u0001\u001a\u0002028\u0016X\u0096D¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R5\u0010\u0094\u0001\u001a\u00030\u008c\u00012\b\u0010\u008d\u0001\u001a\u00030\u008c\u00018B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R2\u0010\u0099\u0001\u001a\u00020]2\u0007\u0010\u008d\u0001\u001a\u00020]8B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0006\b\u0095\u0001\u0010\u008f\u0001\u001a\u0005\b\u0096\u0001\u0010_\"\u0006\b\u0097\u0001\u0010\u0098\u0001R$\u0010\u009f\u0001\u001a\n\u0012\u0005\u0012\u00030\u008c\u00010\u009a\u00018\u0006¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001d\u0010¥\u0001\u001a\u00030 \u00018\u0006¢\u0006\u0010\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001R\u001d\u0010¨\u0001\u001a\u00030 \u00018\u0006¢\u0006\u0010\n\u0006\b¦\u0001\u0010¢\u0001\u001a\u0006\b§\u0001\u0010¤\u0001R\u001d\u0010«\u0001\u001a\u00030 \u00018\u0006¢\u0006\u0010\n\u0006\b©\u0001\u0010¢\u0001\u001a\u0006\bª\u0001\u0010¤\u0001R&\u0010¯\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¬\u00010\u009a\u00018\u0006¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010\u009c\u0001\u001a\u0006\b®\u0001\u0010\u009e\u0001R\u001d\u0010²\u0001\u001a\u00030 \u00018\u0006¢\u0006\u0010\n\u0006\b°\u0001\u0010¢\u0001\u001a\u0006\b±\u0001\u0010¤\u0001R\u001d\u0010µ\u0001\u001a\u00030 \u00018\u0006¢\u0006\u0010\n\u0006\b³\u0001\u0010¢\u0001\u001a\u0006\b´\u0001\u0010¤\u0001R\u001f\u0010º\u0001\u001a\n\u0012\u0005\u0012\u00030·\u00010¶\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u0019\u0010¼\u0001\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010©\u0001R\u0016\u0010½\u0001\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bU\u0010©\u0001R\u0017\u0010¾\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010qR\u0018\u0010¿\u0001\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bV\u0010©\u0001R\u001a\u0010Á\u0001\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b0\u0010À\u0001R\u0013\u0010Ã\u0001\u001a\u00020+8F¢\u0006\u0007\u001a\u0005\bÂ\u0001\u0010;R\u001c\u0010Å\u0001\u001a\n\u0012\u0005\u0012\u00030·\u00010\u009a\u00018F¢\u0006\b\u001a\u0006\bÄ\u0001\u0010\u009e\u0001R\u001a\u0010É\u0001\u001a\u0005\u0018\u00010Æ\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÇ\u0001\u0010È\u0001R\u0016\u0010Ë\u0001\u001a\u00020+8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÊ\u0001\u0010;R\u0017\u0010Î\u0001\u001a\u00020X8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÌ\u0001\u0010Í\u0001¨\u0006Ð\u0001"}, m65681d2 = {"Lsc2/s;", "Lhj0/o;", "Ltd1/b;", "whoopStrapProxy", "Lor2/c;", "appDiagnostics", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "featureFlagRepository", "Lzr2/a;", "timeProvider", "Lq92/h;", "whoopStrapSharedPrefs", "Lz82/e;", "eventDispatcher", "Lor2/u0;", "localizedDateTimeFormatter", "Llm0/a;", "bleStateChangeReceiver", "Lrv1/a;", "membershipRepository", "", "sdkVersion", "Ldt0/d;", "dataSyncService", "Lci2/b;", "whoopStrapProvider", "Lcom/whoop/data/repositories/StringsRepository;", "stringsRepository", "Ly42/j;", "puffinManager", "Lxs0/b;", "batteryPackService", "Lor2/m;", "closableScope", "<init>", "(Ltd1/b;Lor2/c;Lcom/whoop/data/repositories/FeatureFlagRepository;Lzr2/a;Lq92/h;Lz82/e;Lor2/u0;Llm0/a;Lrv1/a;ILdt0/d;Lci2/b;Lcom/whoop/data/repositories/StringsRepository;Ly42/j;Lxs0/b;Lor2/m;)V", "scope", "Ll83/a0;", "h1", "(Lor2/m;)V", "j1", "()V", "d1", "", "enabled", "f1", "(Z)V", "shouldDisable", "i0", "g1", "", "newName", "e1", "(Ljava/lang/String;)V", "Lm32/e;", "result", "c1", "(Lm32/e;)V", "C0", "()Z", "k1", "l1", "g0", "W0", "Lxs0/a;", "state", "o1", "(Lxs0/a;)V", "info", "B0", "P0", "Ly42/a;", "puffin", "X0", "(Ly42/a;)V", "O0", "Y0", "Q0", "R0", "K0", "G0", "Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;", "powerPackType", "w0", "(Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;)I", "f0", "h0", "D0", "Lcom/whoop/domain/model/MetricsProcessedTime;", "metricsProcessedTime", "Lsc2/e;", "q0", "(Lcom/whoop/domain/model/MetricsProcessedTime;)Lsc2/e;", "Lcom/whoop/ui/views/a;", "p0", "()Lcom/whoop/ui/views/a;", "chargePercent", "t0", "(I)I", "j0", "(I)Ljava/lang/String;", "p1", "Lkn2/c;", "y0", "()Lkn2/c;", "E", "Ltd1/b;", "F", "Lor2/c;", "G", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "H", "Lzr2/a;", "I", "Lq92/h;", "J", "Lz82/e;", "K", "Lor2/u0;", "L", "Llm0/a;", "M", "Lrv1/a;", "N", "Ldt0/d;", "O", "Lci2/b;", "P", "Lcom/whoop/data/repositories/StringsRepository;", "Q", "Ly42/j;", "R", "Lxs0/b;", "S", "Lor2/m;", "T", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "logTag", "Lsc2/v;", "<set-?>", "U", "Lf93/d;", "l0", "()Lsc2/v;", "n1", "(Lsc2/v;)V", "currentStrapSettingsViewState", "V", "k0", "m1", "(Lcom/whoop/ui/views/a;)V", "currentBatteryIndicatorViewState", "Landroidx/lifecycle/p0;", "W", "Landroidx/lifecycle/p0;", "z0", "()Landroidx/lifecycle/p0;", "viewStateLiveData", "Lor2/r0;", "X", "Lor2/r0;", "n0", "()Lor2/r0;", "goToEditDeviceNameLiveData", "Y", "o0", "goToPairStrapBle", "Z", "getGoToFirmwareUpdate", "goToFirmwareUpdate", "Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;", "a0", "r0", "membershipStatus", "b0", "u0", "requestBluetoothPermissionsAndroid12AndAbove", "c0", "s0", "navigateToAppInfoAction", "Lor2/s0;", "Lsc2/f;", "d0", "Lor2/s0;", "_strapAnimation", "e0", "shouldAnimateInitialBatteryState", "isAndroid12orHigher", "puffinBatteryChargePercent", "isPuffinReady", "Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;", "batteryPackType", "E0", "isDeviceSettingsOverlayEnabled", "v0", "strapAnimation", "Ljk0/d;", "A0", "()Ljk0/d;", "whoopStrap", "F0", "isStrapReady", "m0", "()Lcom/whoop/domain/model/MetricsProcessedTime;", "dssMetricsProcessedTime", "a", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32380s extends AbstractC17356o {

    /* JADX INFO: renamed from: k0 */
    static final /* synthetic */ InterfaceC21493z[] f133997k0;

    /* JADX INFO: renamed from: l0 */
    public static final int f133998l0;

    /* JADX INFO: renamed from: m0 */
    private static boolean f133999m0;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC33704b whoopStrapProxy;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C28150c appDiagnostics;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final FeatureFlagRepository featureFlagRepository;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC41070a timeProvider;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final C30076h whoopStrapSharedPrefs;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final C40191e eventDispatcher;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final C28205u0 localizedDateTimeFormatter;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final C24506a bleStateChangeReceiver;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final C31842a membershipRepository;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final InterfaceC12361d dataSyncService;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final StringsRepository stringsRepository;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final C39228j puffinManager;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final InterfaceC38638b batteryPackService;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private C28180m closableScope;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final InterfaceC14292d currentStrapSettingsViewState;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private final InterfaceC14292d currentBatteryIndicatorViewState;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private final AbstractC1615p0 viewStateLiveData;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private final C28196r0 goToEditDeviceNameLiveData;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private final C28196r0 goToPairStrapBle;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private final C28196r0 goToFirmwareUpdate;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    private final AbstractC1615p0 membershipStatus;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    private final C28196r0 requestBluetoothPermissionsAndroid12AndAbove;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    private final C28196r0 navigateToAppInfoAction;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    private final C28199s0<C32367f> _strapAnimation;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    private boolean shouldAnimateInitialBatteryState;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    private final boolean isAndroid12orHigher;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    private int puffinBatteryChargePercent;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    private boolean isPuffinReady;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    private BatteryPackType batteryPackType;

    /* JADX INFO: renamed from: sc2.s$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f134031a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f134032b;

        static {
            int[] iArr = new int[BatteryPackType.values().length];
            try {
                iArr[BatteryPackType.PUFFIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BatteryPackType.PENGUIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f134031a = iArr;
            int[] iArr2 = new int[EnumC32978v.values().length];
            try {
                iArr2[EnumC32978v.GEN_4.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EnumC32978v.GOOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC32978v.MAVERICK.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f134032b = iArr2;
        }
    }

    /* JADX INFO: renamed from: sc2.s$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.strap.StrapSettingsViewModel$observeBluetoothStatus$1", m100430f = "StrapSettingsViewModel.kt", m100431l = {340}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f134033w;

        /* JADX INFO: renamed from: sc2.s$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.settings.strap.StrapSettingsViewModel$observeBluetoothStatus$1$1", m100430f = "StrapSettingsViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Llm0/c;", "it", "Ll83/a0;", "<anonymous>", "(Llm0/c;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f134035w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C32380s f134036x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C32380s c32380s, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f134036x = c32380s;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f134036x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(EnumC24508c enumC24508c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(enumC24508c, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f134035w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                this.f134036x.m100871f0();
                return C23454a0.f92919a;
            }
        }

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C32380s.this.new c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f134033w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM71349d = C32380s.this.bleStateChangeReceiver.getBluetoothStateFlow();
                a aVar = new a(C32380s.this, null);
                this.f134033w = 1;
                if (AbstractC13091v.m36604n(interfaceC13058lM71349d, aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: sc2.s$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.strap.StrapSettingsViewModel$observeChargingInfo$1", m100430f = "StrapSettingsViewModel.kt", m100431l = {295}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f134037w;

        /* JADX INFO: renamed from: sc2.s$d$a */
        @InterfaceC32271e(m100429c = "com.whoop.settings.strap.StrapSettingsViewModel$observeChargingInfo$1$1", m100430f = "StrapSettingsViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lxs0/a;", "it", "Ll83/a0;", "<anonymous>", "(Lxs0/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f134039w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f134040x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C32380s f134041y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C32380s c32380s, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f134041y = c32380s;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f134041y, interfaceC30057d);
                aVar.f134040x = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C38637a c38637a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(c38637a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                C38637a c38637a = (C38637a) this.f134040x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f134039w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                this.f134041y.m49136n().mo85216g("Got a Battery Pack Event " + c38637a, new AbstractC30556a.a[0]);
                this.f134041y.m100819B0(c38637a);
                return C23454a0.f92919a;
            }
        }

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C32380s.this.new d(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f134037w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lMo53811a = C32380s.this.batteryPackService.mo53811a();
                a aVar = new a(C32380s.this, null);
                this.f134037w = 1;
                if (AbstractC13091v.m36604n(interfaceC13058lMo53811a, aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: sc2.s$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.strap.StrapSettingsViewModel$observeDataSyncHighWatermark$1", m100430f = "StrapSettingsViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f134042w;

        /* JADX INFO: renamed from: sc2.s$e$a */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f134044w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C32380s f134045x;

            /* JADX INFO: renamed from: sc2.s$e$a$a, reason: collision with other inner class name */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42317a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f134046w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ C32380s f134047x;

                /* JADX INFO: renamed from: sc2.s$e$a$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.settings.strap.StrapSettingsViewModel$observeDataSyncHighWatermark$1$invokeSuspend$$inlined$map$1$2", m100430f = "StrapSettingsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C42318a extends AbstractC32269c {

                    /* JADX INFO: renamed from: E */
                    Object f134048E;

                    /* JADX INFO: renamed from: F */
                    Object f134049F;

                    /* JADX INFO: renamed from: G */
                    Object f134050G;

                    /* JADX INFO: renamed from: H */
                    int f134051H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f134052w;

                    /* JADX INFO: renamed from: x */
                    int f134053x;

                    /* JADX INFO: renamed from: y */
                    Object f134054y;

                    public C42318a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f134052w = obj;
                        this.f134053x |= Integer.MIN_VALUE;
                        return C42317a.this.emit(null, this);
                    }
                }

                public C42317a(InterfaceC13062m interfaceC13062m, C32380s c32380s) {
                    this.f134046w = interfaceC13062m;
                    this.f134047x = c32380s;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C42318a c42318a;
                    if (interfaceC30057d instanceof C42318a) {
                        c42318a = (C42318a) interfaceC30057d;
                        int i13 = c42318a.f134053x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c42318a.f134053x = i13 - Integer.MIN_VALUE;
                        } else {
                            c42318a = new C42318a(interfaceC30057d);
                        }
                    } else {
                        c42318a = new C42318a(interfaceC30057d);
                    }
                    Object obj2 = c42318a.f134052w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c42318a.f134053x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f134046w;
                        C32366e c32366eM100886q0 = this.f134047x.m100886q0(new MetricsProcessedTime(((Number) obj).longValue()));
                        c42318a.f134054y = null;
                        c42318a.f134048E = null;
                        c42318a.f134049F = null;
                        c42318a.f134050G = null;
                        c42318a.f134051H = 0;
                        c42318a.f134053x = 1;
                        if (interfaceC13062m.emit(c32366eM100886q0, c42318a) == enumC31071a) {
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

            public a(InterfaceC13058l interfaceC13058l, C32380s c32380s) {
                this.f134044w = interfaceC13058l;
                this.f134045x = c32380s;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f134044w.collect(new C42317a(interfaceC13062m, this.f134045x), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public static final C23454a0 m100914i(C32380s c32380s, C32366e c32366e) {
            C32383v c32383vM100878l0 = c32380s.m100878l0();
            AbstractC22676k.m65747g(c32366e);
            c32380s.m100882n1(C32383v.m100919b(c32383vM100878l0, 0, 0, false, false, 0, false, null, 0, false, null, c32366e, false, 3071, null));
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public static final void m100915j(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C32380s.this.new e(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f134042w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C36920f c36920fM118982g = AbstractC37056f.m118982g(new a(C32380s.this.dataSyncService.getHighWaterMark(), C32380s.this));
            C25217e c25217e = AbstractC25214b.f99025a;
            if (c25217e == null) {
                throw new NullPointerException("scheduler == null");
            }
            int i13 = 0;
            c36920fM118982g.m67904a(c25217e).m67905c(new C33589b(new C32382u(new C32381t(C32380s.this, i13), i13), AbstractC31056a.f128065d));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sc2.s$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.strap.StrapSettingsViewModel$observePuffinBatteryPackInfo$1", m100430f = "StrapSettingsViewModel.kt", m100431l = {239}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f134056w;

        /* JADX INFO: renamed from: sc2.s$f$a */
        @InterfaceC32271e(m100429c = "com.whoop.settings.strap.StrapSettingsViewModel$observePuffinBatteryPackInfo$1$1", m100430f = "StrapSettingsViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ly42/a;", "puffin", "Ll83/a0;", "<anonymous>", "(Ly42/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f134058w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f134059x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C32380s f134060y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C32380s c32380s, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f134060y = c32380s;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f134060y, interfaceC30057d);
                aVar.f134059x = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC39219a interfaceC39219a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC39219a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                InterfaceC39219a interfaceC39219a = (InterfaceC39219a) this.f134059x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f134058w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                this.f134060y.m100860X0(interfaceC39219a);
                return C23454a0.f92919a;
            }
        }

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C32380s.this.new f(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f134056w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM36610t = AbstractC13091v.m36610t(C32380s.this.puffinManager.m124994e());
                a aVar = new a(C32380s.this, null);
                this.f134056w = 1;
                if (AbstractC13091v.m36604n(interfaceC13058lM36610t, aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: sc2.s$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.strap.StrapSettingsViewModel$observePuffinChargeStatus$1", m100430f = "StrapSettingsViewModel.kt", m100431l = {308}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f134061w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC39219a f134062x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C32380s f134063y;

        /* JADX INFO: renamed from: sc2.s$g$a */
        @InterfaceC32271e(m100429c = "com.whoop.settings.strap.StrapSettingsViewModel$observePuffinChargeStatus$1$1", m100430f = "StrapSettingsViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lws0/a;", "batteryLevel", "Ll83/a0;", "<anonymous>", "(Lws0/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f134064w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f134065x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C32380s f134066y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C32380s c32380s, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f134066y = c32380s;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f134066y, interfaceC30057d);
                aVar.f134065x = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C37605a c37605a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(c37605a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                C37605a c37605a = (C37605a) this.f134065x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f134064w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                this.f134066y.puffinBatteryChargePercent = c37605a.getLevel();
                this.f134066y.m100871f0();
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC39219a interfaceC39219a, C32380s c32380s, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f134062x = interfaceC39219a;
            this.f134063y = c32380s;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new g(this.f134062x, this.f134063y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f134061w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lMo124932A = this.f134062x.getBatteryLevelFlow();
                a aVar = new a(this.f134063y, null);
                this.f134061w = 1;
                if (AbstractC13091v.m36604n(interfaceC13058lMo124932A, aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: sc2.s$h */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.strap.StrapSettingsViewModel$observePuffinChargeStatus$2", m100430f = "StrapSettingsViewModel.kt", m100431l = {318}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f134067w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC39219a f134069y;

        /* JADX INFO: renamed from: sc2.s$h$a */
        @InterfaceC32271e(m100429c = "com.whoop.settings.strap.StrapSettingsViewModel$observePuffinChargeStatus$2$1", m100430f = "StrapSettingsViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lxs0/a;", "batteryPackEvent", "Lc52/b;", "connectionStatus", "Ll83/k;", "<anonymous>", "(Lxs0/a;Lc52/b;)Ll83/k;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function3 {

            /* JADX INFO: renamed from: w */
            int f134070w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f134071x;

            /* JADX INFO: renamed from: y */
            /* synthetic */ Object f134072y;

            public a(InterfaceC30057d<? super a> interfaceC30057d) {
                super(3, interfaceC30057d);
            }

            @Override // p715kotlin.jvm.functions.Function3
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C38637a c38637a, AbstractC4251b abstractC4251b, InterfaceC30057d<? super C23465k> interfaceC30057d) {
                a aVar = new a(interfaceC30057d);
                aVar.f134071x = c38637a;
                aVar.f134072y = abstractC4251b;
                return aVar.invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                C38637a c38637a = (C38637a) this.f134071x;
                AbstractC4251b abstractC4251b = (AbstractC4251b) this.f134072y;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f134070w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return new C23465k(c38637a, abstractC4251b);
            }
        }

        /* JADX INFO: renamed from: sc2.s$h$b */
        @InterfaceC32271e(m100429c = "com.whoop.settings.strap.StrapSettingsViewModel$observePuffinChargeStatus$2$2", m100430f = "StrapSettingsViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Ll83/k;", "Lxs0/a;", "Lc52/b;", "<destruct>", "Ll83/a0;", "<anonymous>", "(Ll83/k;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f134073w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f134074x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C32380s f134075y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C32380s c32380s, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f134075y = c32380s;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                b bVar = new b(this.f134075y, interfaceC30057d);
                bVar.f134074x = obj;
                return bVar;
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                C23465k c23465k = (C23465k) this.f134074x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f134073w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                C38637a c38637a = (C38637a) c23465k.f92937w;
                AbstractC4251b abstractC4251b = (AbstractC4251b) c23465k.f92938x;
                if (c38637a.getIsChargingStrap() && AbstractC22676k.m65745e(abstractC4251b, AbstractC4251b.f.f17287a) && c38637a.getBatteryPackType() == BatteryPackType.PUFFIN) {
                    this.f134075y.isPuffinReady = true;
                    this.f134075y.batteryPackType = c38637a.getBatteryPackType();
                    this.f134075y.m100871f0();
                } else if (AbstractC22676k.m65745e(abstractC4251b, AbstractC4251b.c.f17284a) || !c38637a.getIsChargingStrap()) {
                    this.f134075y.isPuffinReady = false;
                    this.f134075y.batteryPackType = null;
                    this.f134075y.m100871f0();
                }
                return C23454a0.f92919a;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(C23465k c23465k, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((b) create(c23465k, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC39219a interfaceC39219a, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f134069y = interfaceC39219a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C32380s.this.new h(this.f134069y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f134067w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13060l1 c13060l1 = new C13060l1(C32380s.this.batteryPackService.mo53811a(), this.f134069y.getConnectionStatus(), new a(null), 1);
                b bVar = new b(C32380s.this, null);
                this.f134067w = 1;
                if (AbstractC13091v.m36604n(c13060l1, bVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: sc2.s$i */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.strap.StrapSettingsViewModel$onEditNameResult$1", m100430f = "StrapSettingsViewModel.kt", m100431l = {210}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f134076w;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C32380s.this.new i(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f134076w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC33704b interfaceC33704b = C32380s.this.whoopStrapProxy;
                this.f134076w = 1;
                if (interfaceC33704b.mo106490c(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: sc2.s$j */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.strap.StrapSettingsViewModel$refreshMembershipInfo$1", m100430f = "StrapSettingsViewModel.kt", m100431l = {146}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f134078w;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C32380s.this.new j(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f134078w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (C32380s.this.featureFlagRepository.isFeatureEnabled("refetch-membership-info-device-settings-action")) {
                    C31842a c31842a = C32380s.this.membershipRepository;
                    this.f134078w = 1;
                    if (c31842a.m98950u(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: sc2.s$k */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0006\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\b\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"sc2/s$k", "Lf93/d;", "", "thisRef", "Lj93/z;", "property", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "value", "Ll83/a0;", "setValue", "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements InterfaceC14292d {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private C32383v value;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C32380s f134081x;

        /* JADX WARN: Multi-variable type inference failed */
        public k(Object obj, C32380s c32380s) {
            this.f134081x = c32380s;
            this.value = obj;
        }

        @Override // f93.InterfaceC14291c
        public C32383v getValue(Object thisRef, InterfaceC21493z property) {
            AbstractC22676k.m65750j(property, "property");
            return this.value;
        }

        @Override // f93.InterfaceC14292d
        public void setValue(Object thisRef, InterfaceC21493z property, C32383v value) {
            AbstractC22676k.m65750j(property, "property");
            this.value = value;
            C32380s c32380s = this.f134081x;
            c32380s.m49140v(c32380s.getViewStateLiveData(), value);
        }
    }

    /* JADX INFO: renamed from: sc2.s$l */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0006\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\b\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"sc2/s$l", "Lf93/d;", "", "thisRef", "Lj93/z;", "property", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "value", "Ll83/a0;", "setValue", "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements InterfaceC14292d {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private C10627a value;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C32380s f134083x;

        /* JADX WARN: Multi-variable type inference failed */
        public l(Object obj, C32380s c32380s) {
            this.f134083x = c32380s;
            this.value = obj;
        }

        @Override // f93.InterfaceC14291c
        public C10627a getValue(Object thisRef, InterfaceC21493z property) {
            AbstractC22676k.m65750j(property, "property");
            return this.value;
        }

        @Override // f93.InterfaceC14292d
        public void setValue(Object thisRef, InterfaceC21493z property, C10627a value) {
            AbstractC22676k.m65750j(property, "property");
            this.value = value;
            C32380s c32380s = this.f134083x;
            c32380s.m100882n1(C32383v.m100919b(c32380s.m100878l0(), 0, 0, false, false, 0, false, null, 0, false, value, null, false, 3583, null));
        }
    }

    static {
        C22686q c22686q = new C22686q(C32380s.class, "currentStrapSettingsViewState", "getCurrentStrapSettingsViewState()Lcom/whoop/settings/strap/StrapSettingsViewState;", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f133997k0 = new InterfaceC21493z[]{c22673i0.mutableProperty1(c22686q), AbstractC11895b.m31990i(C32380s.class, "currentBatteryIndicatorViewState", "getCurrentBatteryIndicatorViewState()Lcom/whoop/ui/views/BatteryIndicatorViewState;", 0, c22673i0)};
        INSTANCE = new Companion(null);
        f133998l0 = 8;
        f133999m0 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C32380s(InterfaceC33704b whoopStrapProxy, C28150c appDiagnostics, FeatureFlagRepository featureFlagRepository, InterfaceC41070a timeProvider, C30076h whoopStrapSharedPrefs, C40191e eventDispatcher, C28205u0 localizedDateTimeFormatter, C24506a bleStateChangeReceiver, C31842a membershipRepository, int i13, InterfaceC12361d dataSyncService, InterfaceC4733b whoopStrapProvider, StringsRepository stringsRepository, C39228j puffinManager, InterfaceC38638b batteryPackService, C28180m closableScope) {
        super(closableScope);
        AbstractC22676k.m65750j(whoopStrapProxy, "whoopStrapProxy");
        AbstractC22676k.m65750j(appDiagnostics, "appDiagnostics");
        AbstractC22676k.m65750j(featureFlagRepository, "featureFlagRepository");
        AbstractC22676k.m65750j(timeProvider, "timeProvider");
        AbstractC22676k.m65750j(whoopStrapSharedPrefs, "whoopStrapSharedPrefs");
        AbstractC22676k.m65750j(eventDispatcher, "eventDispatcher");
        AbstractC22676k.m65750j(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        AbstractC22676k.m65750j(bleStateChangeReceiver, "bleStateChangeReceiver");
        AbstractC22676k.m65750j(membershipRepository, "membershipRepository");
        AbstractC22676k.m65750j(dataSyncService, "dataSyncService");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(stringsRepository, "stringsRepository");
        AbstractC22676k.m65750j(puffinManager, "puffinManager");
        AbstractC22676k.m65750j(batteryPackService, "batteryPackService");
        AbstractC22676k.m65750j(closableScope, "closableScope");
        this.whoopStrapProxy = whoopStrapProxy;
        this.appDiagnostics = appDiagnostics;
        this.featureFlagRepository = featureFlagRepository;
        this.timeProvider = timeProvider;
        this.whoopStrapSharedPrefs = whoopStrapSharedPrefs;
        this.eventDispatcher = eventDispatcher;
        this.localizedDateTimeFormatter = localizedDateTimeFormatter;
        this.bleStateChangeReceiver = bleStateChangeReceiver;
        this.membershipRepository = membershipRepository;
        this.dataSyncService = dataSyncService;
        this.whoopStrapProvider = whoopStrapProvider;
        this.stringsRepository = stringsRepository;
        this.puffinManager = puffinManager;
        this.batteryPackService = batteryPackService;
        this.closableScope = closableScope;
        this.logTag = "StrapSettingsViewModel";
        int i14 = 0;
        boolean z4 = false;
        boolean z13 = false;
        this.currentStrapSettingsViewState = new k(new C32383v(0, i14, z4, false, 0, z13, null, 0, false, null, null, false, 4095, null), this);
        this.currentBatteryIndicatorViewState = new l(new C10627a(i14, z4, null, 0 == true ? 1 : 0, z13, false, null, null, 255, 0 == true ? 1 : 0), this);
        this.viewStateLiveData = new C1630u0(m100878l0());
        this.goToEditDeviceNameLiveData = new C28196r0();
        this.goToPairStrapBle = new C28196r0();
        this.goToFirmwareUpdate = new C28196r0();
        this.membershipStatus = membershipRepository.m98946G();
        this.requestBluetoothPermissionsAndroid12AndAbove = new C28196r0();
        this.navigateToAppInfoAction = new C28196r0();
        this._strapAnimation = new C28199s0<>();
        this.isAndroid12orHigher = i13 >= 31;
        this.puffinBatteryChargePercent = -1;
    }

    /* JADX INFO: renamed from: A0 */
    private final InterfaceC21750d m100817A0() {
        return (InterfaceC21750d) AbstractC18489d0.m53367h(this.whoopStrapProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public final void m100819B0(C38637a info) {
        EnumC32368g enumC32368g;
        this.batteryPackType = info.getBatteryPackType();
        m100871f0();
        if (f133999m0) {
            f133999m0 = false;
            m100883o1(info);
            return;
        }
        int iM100889w0 = m100889w0(info.getBatteryPackType());
        if (info.getIsChargingStrap()) {
            enumC32368g = EnumC32368g.SHOW_SLIDING_IN_ANIMATION;
        } else {
            C32367f c32367f = (C32367f) this._strapAnimation.getValue();
            iM100889w0 = c32367f != null ? c32367f.getAnimation() : m100889w0(info.getBatteryPackType());
            enumC32368g = EnumC32368g.SHOW_SLIDING_OUT_ANIMATION;
        }
        this._strapAnimation.m85347e(new C32367f(iM100889w0, enumC32368g));
    }

    /* JADX INFO: renamed from: C0 */
    private final boolean m100821C0() {
        return this.appDiagnostics.m85179b("android.permission.BLUETOOTH_CONNECT") && this.appDiagnostics.m85179b("android.permission.BLUETOOTH_SCAN");
    }

    /* JADX INFO: renamed from: D0 */
    private final boolean m100823D0() {
        return this.appDiagnostics.m85180c();
    }

    /* JADX INFO: renamed from: F0 */
    private final boolean m100826F0() {
        return this.whoopStrapProxy.mo106484A() == EnumC33707e.READY;
    }

    /* JADX INFO: renamed from: G0 */
    private final void m100828G0() {
        int i13 = 2;
        getSubscriptions().m75179c(this.whoopStrapProxy.getChargeStatus().m65152g().m122677k().m122652B(C40634a.m131874a()).m122662L(new C32378q(new C32381t(this, 5), i13), new C32379r(this, i13)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final C23454a0 m100830H0(C32380s c32380s, Boolean bool) {
        if (c32380s.m100826F0()) {
            c32380s.m100882n1(c32380s.shouldAnimateInitialBatteryState ? C32383v.m100919b(c32380s.m100878l0(), 0, 0, false, false, 0, false, null, 0, false, null, null, true, 2047, null) : C32383v.m100919b(c32380s.m100878l0(), 0, 0, false, false, 0, false, null, 0, false, null, null, false, 2047, null));
            c32380s.shouldAnimateInitialBatteryState = true;
            C10627a c10627aM100876k0 = c32380s.m100876k0();
            AbstractC22676k.m65747g(bool);
            c32380s.m100881m1(C10627a.m27476b(c10627aM100876k0, 0, bool.booleanValue(), null, false, false, false, null, null, 253, null));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final void m100832I0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final void m100833J0(C32380s c32380s, Throwable th3) {
        InterfaceC34116n interfaceC34116nM49136n = c32380s.m49136n();
        AbstractC22676k.m65747g(th3);
        interfaceC34116nM49136n.mo85230v("Something went wrong observing charging status", th3, new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: K0 */
    private final void m100835K0() {
        int i13 = 0;
        getSubscriptions().m75179c(this.whoopStrapProxy.getBatteryLevel().m65140j().m122677k().m122652B(C40634a.m131874a()).m122662L(new C32378q(new C32381t(this, 2), i13), new C32379r(this, i13)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final C23454a0 m100837L0(C32380s c32380s, Byte b6) {
        if (c32380s.m100826F0()) {
            c32380s.m100881m1(C10627a.m27476b(c32380s.m100876k0(), b6 != null ? b6.byteValue() : (byte) -1, false, null, false, false, false, null, null, 254, null));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final void m100839M0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final void m100841N0(C32380s c32380s, Throwable th3) {
        InterfaceC34116n interfaceC34116nM49136n = c32380s.m49136n();
        AbstractC22676k.m65747g(th3);
        interfaceC34116nM49136n.mo85230v("Something went wrong observing battery level", th3, new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: O0 */
    private final void m100843O0() {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new c(null), 3);
    }

    /* JADX INFO: renamed from: P0 */
    private final void m100845P0() {
        AbstractC3006f0.m8732z(this.closableScope, null, null, new d(null), 3);
    }

    /* JADX INFO: renamed from: Q0 */
    private final void m100847Q0() {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new e(null), 3);
    }

    /* JADX INFO: renamed from: R0 */
    private final void m100849R0() {
        InterfaceC33864a interfaceC33864aMo106492e = this.whoopStrapProxy.mo106492e();
        if (interfaceC33864aMo106492e != null) {
            AbstractC23412c abstractC23412cMo24768c = interfaceC33864aMo106492e.mo24768c();
            C25217e c25217e = AbstractC25214b.f99025a;
            if (c25217e == null) {
                throw new NullPointerException("scheduler == null");
            }
            C36930p c36930pM67904a = abstractC23412cMo24768c.m67904a(c25217e);
            C33589b c33589b = new C33589b(new C32382u(new C32381t(this, 3), 1), new C32382u(new C32381t(this, 4), 2));
            c36930pM67904a.m67905c(c33589b);
            getDisposables().mo78293a(c33589b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final C23454a0 m100851S0(C32380s c32380s, EnumC33865b enumC33865b) {
        c32380s.m100885p1(enumC33865b == EnumC33865b.ENABLED);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final void m100852T0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final C23454a0 m100854U0(C32380s c32380s, Throwable th3) {
        InterfaceC34116n interfaceC34116nM49136n = c32380s.m49136n();
        AbstractC22676k.m65747g(th3);
        interfaceC34116nM49136n.mo85230v("Something went wrong observing HR Broadcast State", th3, new AbstractC30556a.a[0]);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final void m100856V0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W0 */
    private final void m100858W0() {
        EnumC32978v whoopDeviceType;
        WhoopStrapInfo whoopStrapInfoMo106493f = this.whoopStrapProxy.mo106493f();
        if (whoopStrapInfoMo106493f == null || (whoopDeviceType = whoopStrapInfoMo106493f.getWhoopDeviceType()) == null || !whoopDeviceType.isMaverickOrGoose()) {
            return;
        }
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new f(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public final void m100860X0(InterfaceC39219a puffin) {
        C17171d c17171dM8708b = AbstractC3006f0.m8708b(AbstractC1640x1.m5043b(this).f105042w.plus(AbstractC3006f0.m8710d()));
        AbstractC3006f0.m8732z(c17171dM8708b, null, null, new g(puffin, this, null), 3);
        AbstractC3006f0.m8732z(c17171dM8708b, null, null, new h(puffin, null), 3);
    }

    /* JADX INFO: renamed from: Y0 */
    private final void m100862Y0() {
        int i13 = 1;
        getSubscriptions().m75179c(this.whoopStrapProxy.mo106496i().m122652B(C40634a.m131874a()).m122662L(new C32378q(new C32381t(this, 1), i13), new C32379r(this, i13)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final C23454a0 m100864Z0(C32380s c32380s, EnumC33707e enumC33707e) {
        c32380s.m100871f0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final void m100865a1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final void m100867b1(C32380s c32380s, Throwable th3) {
        InterfaceC34116n interfaceC34116nM49136n = c32380s.m49136n();
        AbstractC22676k.m65747g(th3);
        interfaceC34116nM49136n.mo85230v("Something went wrong observing strap status", th3, new AbstractC30556a.a[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public final void m100871f0() {
        if (this.isAndroid12orHigher && !m100821C0()) {
            this.requestBluetoothPermissionsAndroid12AndAbove.m85330e();
            return;
        }
        C32366e c32366eM100886q0 = m100886q0(m100880m0());
        if (!m100823D0()) {
            m100882n1(C32383v.m100919b(m100878l0(), 0, 8, false, false, 0, false, null, 0, false, null, c32366eM100886q0, false, 3064, null));
            return;
        }
        if (this.whoopStrapProxy.mo106484A() == EnumC33707e.READY) {
            m100872g0();
            m100873h0();
            m100881m1(m100884p0());
            m100882n1(C32383v.m100919b(m100878l0(), 8, 0, false, false, 0, false, null, m100890x0(this, null, 1, null), false, null, c32366eM100886q0, false, 2936, null));
            return;
        }
        m100882n1(C32383v.m100919b(m100878l0(), 8, 0, true, false, 0, false, this.whoopStrapSharedPrefs.m92197c(), 0, false, null, c32366eM100886q0, false, 2968, null));
        int i13 = 0;
        EnumC22601c enumC22601c = null;
        C39531f c39531f = null;
        BatteryPackType batteryPackType = null;
        m100881m1(new C10627a(i13, false, enumC22601c, false, false, false, c39531f, batteryPackType, 255, null));
    }

    /* JADX INFO: renamed from: g0 */
    private final void m100872g0() {
        m100881m1(C10627a.m27476b(m100876k0(), 0, false, m100892y0(), false, false, false, null, null, 251, null));
        m100882n1(C32383v.m100919b(m100878l0(), 0, 0, false, false, 0, m100826F0() && AbstractC28188o1.m85314d(m100878l0().getConnectedDeviceName()), null, 0, false, null, null, false, 4063, null));
    }

    /* JADX INFO: renamed from: h0 */
    private final void m100873h0() {
        String strM92197c;
        InterfaceC21750d interfaceC21750dM100817A0 = m100817A0();
        if (interfaceC21750dM100817A0 == null || (strM92197c = interfaceC21750dM100817A0.getAdvertisingName()) == null) {
            strM92197c = this.whoopStrapSharedPrefs.m92197c();
        }
        String str = strM92197c;
        m100882n1(C32383v.m100919b(m100878l0(), 0, 0, false, false, 0, (str == null || str.length() == 0 || !m100826F0()) ? false : true, str, 0, false, null, null, false, 3999, null));
    }

    /* JADX INFO: renamed from: i1 */
    public static /* synthetic */ void m100874i1(C32380s c32380s, C28180m c28180m, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c28180m = new C28180m(null, 1, null);
        }
        c32380s.m100900h1(c28180m);
    }

    /* JADX INFO: renamed from: j0 */
    private final String m100875j0(int chargePercent) {
        return AbstractC2875y.m8299l(chargePercent < 0 ? this.stringsRepository.getString(AbstractC17312j.f66920D) : String.valueOf(chargePercent), this.stringsRepository.getString(AbstractC16277f.f62235F1));
    }

    /* JADX INFO: renamed from: k0 */
    private final C10627a m100876k0() {
        return (C10627a) this.currentBatteryIndicatorViewState.getValue(this, f133997k0[1]);
    }

    /* JADX INFO: renamed from: k1 */
    private final void m100877k1() {
        AbstractC3006f0.m8732z(this.closableScope, null, null, new j(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public final C32383v m100878l0() {
        return (C32383v) this.currentStrapSettingsViewState.getValue(this, f133997k0[0]);
    }

    /* JADX INFO: renamed from: l1 */
    private final void m100879l1() {
        f133999m0 = true;
        this._strapAnimation.setValue(new C32367f(m100890x0(this, null, 1, null), EnumC32368g.NOT_CHARGING));
    }

    /* JADX INFO: renamed from: m0 */
    private final MetricsProcessedTime m100880m0() {
        return new MetricsProcessedTime(((Number) this.dataSyncService.getHighWaterMark().getValue()).longValue());
    }

    /* JADX INFO: renamed from: m1 */
    private final void m100881m1(C10627a c10627a) {
        this.currentBatteryIndicatorViewState.setValue(this, f133997k0[1], c10627a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public final void m100882n1(C32383v c32383v) {
        this.currentStrapSettingsViewState.setValue(this, f133997k0[0], c32383v);
    }

    /* JADX INFO: renamed from: o1 */
    private final void m100883o1(C38637a state) {
        if (state.getIsChargingStrap()) {
            this._strapAnimation.m85347e(new C32367f(m100889w0(state.getBatteryPackType()), EnumC32368g.CHARGING));
        } else {
            this._strapAnimation.m85347e(new C32367f(m100890x0(this, null, 1, null), EnumC32368g.NOT_CHARGING));
        }
    }

    /* JADX INFO: renamed from: p0 */
    private final C10627a m100884p0() {
        EnumC32978v whoopDeviceType;
        byte bM65135d = this.whoopStrapProxy.getBatteryLevel().getUserDisplayPercent();
        boolean zM65149d = this.whoopStrapProxy.getChargeStatus().m65149d();
        EnumC22601c enumC22601cM100892y0 = m100892y0();
        WhoopStrapInfo whoopStrapInfoMo106493f = this.whoopStrapProxy.mo106493f();
        boolean zIsMaverickOrGoose = (whoopStrapInfoMo106493f == null || (whoopDeviceType = whoopStrapInfoMo106493f.getWhoopDeviceType()) == null) ? false : whoopDeviceType.isMaverickOrGoose();
        boolean z4 = this.isPuffinReady;
        int i13 = this.puffinBatteryChargePercent;
        return new C10627a(bM65135d, zM65149d, enumC22601cM100892y0, zIsMaverickOrGoose, true, z4, new C39531f(i13, m100875j0(i13), m100887t0(this.puffinBatteryChargePercent), this.isPuffinReady), this.batteryPackType);
    }

    /* JADX INFO: renamed from: p1 */
    private final void m100885p1(boolean enabled) {
        m100882n1(C32383v.m100919b(m100878l0(), 0, 0, false, enabled, enabled ? AbstractC17313k.f67040b : AbstractC17313k.f67039a, false, null, 0, false, null, null, false, 4071, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public final C32366e m100886q0(MetricsProcessedTime metricsProcessedTime) {
        if (metricsProcessedTime == null || metricsProcessedTime.getMillis() == 0) {
            return new C32366e(0, 0, 0, new C23465k("N/A", Boolean.FALSE), 7, null);
        }
        DateTime dateTime = metricsProcessedTime.getTime().toDateTime();
        C28205u0 c28205u0 = this.localizedDateTimeFormatter;
        AbstractC22676k.m65747g(dateTime);
        String strM85381g = c28205u0.m85381g(dateTime, true);
        C28204u.Companion aVar = C28204u.INSTANCE;
        if (!aVar.m85370m(dateTime.getMillis())) {
            strM85381g = AbstractC2875y.m8299l(aVar.m85366i().print(dateTime), strM85381g);
        }
        boolean z4 = this.timeProvider.mo133363b() - dateTime.getMillis() > aVar.m85365h();
        if (!this.whoopStrapProxy.mo106484A().isReady()) {
            if (z4) {
                return new C32366e(0, AbstractC17306d.f66535f, AbstractC17305c.f66528i, new C23465k(strM85381g, Boolean.valueOf(z4)), 1, null);
            }
            return new C32366e(0, 0, 0, new C23465k(strM85381g, Boolean.valueOf(z4)), 7, null);
        }
        if (!z4) {
            return new C32366e(0, 0, 0, new C23465k(strM85381g, Boolean.valueOf(z4)), 7, null);
        }
        if (this.appDiagnostics.m85182e()) {
            return new C32366e(AbstractC17312j.f66928H, AbstractC17311i.f66904a, 0, new C23465k(strM85381g, Boolean.valueOf(z4)), 4, null);
        }
        return new C32366e(0, AbstractC17306d.f66535f, AbstractC17305c.f66528i, new C23465k(strM85381g, Boolean.valueOf(z4)), 1, null);
    }

    /* JADX INFO: renamed from: t0 */
    private final int m100887t0(int chargePercent) {
        return chargePercent < 0 ? AbstractC36510a.f156023c0 : EnumC10628b.INSTANCE.m27487b(chargePercent).getColorResId();
    }

    /* JADX INFO: renamed from: w0 */
    private final int m100889w0(BatteryPackType powerPackType) {
        InterfaceC21750d interfaceC21750dM100817A0 = m100817A0();
        EnumC32978v enumC32978vMo24752w0 = interfaceC21750dM100817A0 != null ? interfaceC21750dM100817A0.mo24752w0() : null;
        int i13 = enumC32978vMo24752w0 == null ? -1 : b.f134032b[enumC32978vMo24752w0.ordinal()];
        if (i13 == 1) {
            return AbstractC17311i.f66905b;
        }
        if (i13 == 2) {
            int i14 = powerPackType == null ? -1 : b.f134031a[powerPackType.ordinal()];
            if (i14 != -1 && i14 != 1) {
                if (i14 == 2) {
                    return AbstractC17311i.f66906c;
                }
                throw new NoWhenBranchMatchedException();
            }
            return AbstractC17311i.f66907d;
        }
        if (i13 != 3) {
            return AbstractC17311i.f66905b;
        }
        int i15 = powerPackType == null ? -1 : b.f134031a[powerPackType.ordinal()];
        if (i15 != -1 && i15 != 1) {
            if (i15 == 2) {
                return AbstractC17311i.f66910g;
            }
            throw new NoWhenBranchMatchedException();
        }
        return AbstractC17311i.f66911h;
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ int m100890x0(C32380s c32380s, BatteryPackType batteryPackType, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            batteryPackType = null;
        }
        return c32380s.m100889w0(batteryPackType);
    }

    /* JADX INFO: renamed from: y0 */
    private final EnumC22601c m100892y0() {
        InterfaceC21750d interfaceC21750dM100817A0 = m100817A0();
        EnumC32978v enumC32978vMo24752w0 = interfaceC21750dM100817A0 != null ? interfaceC21750dM100817A0.mo24752w0() : null;
        InterfaceC21750d interfaceC21750dM100817A1 = m100817A0();
        if (!AbstractC22676k.m65745e(interfaceC21750dM100817A1 != null ? interfaceC21750dM100817A1.getConnectionState() : null, C32970n.f137298a)) {
            return EnumC22601c.DISCONNECTED;
        }
        if (enumC32978vMo24752w0 == EnumC32978v.GEN_4) {
            return EnumC22601c.HARVARD;
        }
        if (enumC32978vMo24752w0 == EnumC32978v.MAVERICK) {
            return EnumC22601c.MAVERICK;
        }
        return enumC32978vMo24752w0 == EnumC32978v.GOOSE ? EnumC22601c.GOOSE : EnumC22601c.DISCONNECTED;
    }

    /* JADX INFO: renamed from: E0 */
    public final boolean m100894E0() {
        return this.featureFlagRepository.isFeatureEnabled("device-settings-charging-education-overlay");
    }

    /* JADX INFO: renamed from: c1 */
    public final void m100895c1(EnumC25009e result) {
        AbstractC22676k.m65750j(result, "result");
        if (result.werePermissionsGranted()) {
            m100871f0();
        } else {
            this.navigateToAppInfoAction.m85330e();
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final void m100896d1() {
        if (m100826F0()) {
            this.eventDispatcher.m129044m();
            this.goToEditDeviceNameLiveData.m85330e();
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final void m100897e1(String newName) {
        if (AbstractC28188o1.m85314d(newName)) {
            m100882n1(C32383v.m100919b(m100878l0(), 0, 0, false, false, 0, false, newName, 0, false, null, null, false, 4031, null));
            AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new i(null), 3);
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final void m100898f1(boolean enabled) {
        if (enabled) {
            InterfaceC33864a interfaceC33864aMo106492e = this.whoopStrapProxy.mo106492e();
            if (interfaceC33864aMo106492e != null) {
                interfaceC33864aMo106492e.mo24767b();
            }
        } else {
            InterfaceC33864a interfaceC33864aMo106492e2 = this.whoopStrapProxy.mo106492e();
            if (interfaceC33864aMo106492e2 != null) {
                interfaceC33864aMo106492e2.mo24766a();
            }
        }
        this.eventDispatcher.m129001M(Boolean.valueOf(enabled), this.whoopStrapProxy.mo106491d().analyticsName());
        m100885p1(enabled);
    }

    /* JADX INFO: renamed from: g1 */
    public final void m100899g1() {
        this.goToPairStrapBle.m85330e();
    }

    /* JADX INFO: renamed from: h1 */
    public final void m100900h1(C28180m scope) {
        AbstractC22676k.m65750j(scope, "scope");
        if (!AbstractC3006f0.m8729w(this.closableScope)) {
            this.closableScope.close();
            this.closableScope = scope;
        }
        m100877k1();
        m100862Y0();
        m100843O0();
        m100872g0();
        m100847Q0();
        m100835K0();
        m100828G0();
        m100849R0();
        m100873h0();
        m100871f0();
        m100858W0();
        m100845P0();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m100901i0(boolean shouldDisable) {
        if (shouldDisable) {
            InterfaceC33864a interfaceC33864aMo106492e = this.whoopStrapProxy.mo106492e();
            if (interfaceC33864aMo106492e != null) {
                interfaceC33864aMo106492e.mo24766a();
            }
            m100885p1(false);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final void m100902j1() {
        m100879l1();
        if (AbstractC3006f0.m8729w(this.closableScope)) {
            this.closableScope.close();
        }
        getSubscriptions().m75180d();
        this.shouldAnimateInitialBatteryState = false;
    }

    /* JADX INFO: renamed from: n0, reason: from getter */
    public final C28196r0 getGoToEditDeviceNameLiveData() {
        return this.goToEditDeviceNameLiveData;
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    /* JADX INFO: renamed from: o0, reason: from getter */
    public final C28196r0 getGoToPairStrapBle() {
        return this.goToPairStrapBle;
    }

    /* JADX INFO: renamed from: r0, reason: from getter */
    public final AbstractC1615p0 getMembershipStatus() {
        return this.membershipStatus;
    }

    /* JADX INFO: renamed from: s0, reason: from getter */
    public final C28196r0 getNavigateToAppInfoAction() {
        return this.navigateToAppInfoAction;
    }

    /* JADX INFO: renamed from: u0, reason: from getter */
    public final C28196r0 getRequestBluetoothPermissionsAndroid12AndAbove() {
        return this.requestBluetoothPermissionsAndroid12AndAbove;
    }

    /* JADX INFO: renamed from: v0 */
    public final AbstractC1615p0 m100908v0() {
        return this._strapAnimation;
    }

    /* JADX INFO: renamed from: z0, reason: from getter */
    public final AbstractC1615p0 getViewStateLiveData() {
        return this.viewStateLiveData;
    }

    public /* synthetic */ C32380s(InterfaceC33704b interfaceC33704b, C28150c c28150c, FeatureFlagRepository featureFlagRepository, InterfaceC41070a interfaceC41070a, C30076h c30076h, C40191e c40191e, C28205u0 c28205u0, C24506a c24506a, C31842a c31842a, int i13, InterfaceC12361d interfaceC12361d, InterfaceC4733b interfaceC4733b, StringsRepository stringsRepository, C39228j c39228j, InterfaceC38638b interfaceC38638b, C28180m c28180m, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC33704b, c28150c, featureFlagRepository, interfaceC41070a, c30076h, c40191e, c28205u0, c24506a, c31842a, i13, interfaceC12361d, interfaceC4733b, stringsRepository, c39228j, interfaceC38638b, (i14 & 32768) != 0 ? new C28180m(null, 1, null) : c28180m);
    }
}
