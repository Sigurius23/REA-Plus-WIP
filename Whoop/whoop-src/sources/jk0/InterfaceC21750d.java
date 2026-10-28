package jk0;

import ak0.C0940b;
import ak0.C0945g;
import bc3.InterfaceC3018i0;
import com.whoop.domain.model.WhoopStrapInfo;
import com.whoop.domain.model.haptics.AlarmHapticsPattern;
import dk0.C12111k;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13087t1;
import fk2.C14554a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21461d;
import java.util.Set;
import kk0.C22538a;
import kk0.C22539b;
import l73.AbstractC23410a;
import l73.AbstractC23412c;
import l73.AbstractC23417h;
import l83.C23454a0;
import l83.InterfaceC23457c;
import lk0.AbstractC24489a;
import nk0.InterfaceC26794a;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import sj2.InterfaceC32564a;
import st0.EnumC32978v;
import st0.InterfaceC32968l;
import td1.EnumC33703a;
import tj0.InterfaceC33864a;
import vk0.InterfaceC36081g;
import vk0.InterfaceC36084j;
import ws0.C37605a;
import xj0.AbstractC38356i0;
import xj0.C38359j0;
import xj0.C38361k;
import yj0.C39588b;
import zj0.C40717d1;
import zj0.C40720e1;
import zj0.C40723f1;
import zj0.C40726g1;
import zj0.C40727h;
import zj0.C40733j;
import zj0.C40735j1;
import zj0.C40736k;
import zj0.C40742m;
import zj0.C40746o;
import zj0.C40749p0;
import zj0.C40751q0;
import zj0.C40761v0;

/* JADX INFO: renamed from: jk0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000¦\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J,\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0017\u0010\u0016J-\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\b\b\u0000\u0010\u0019*\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH&¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001cH'¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&H&¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&H&¢\u0006\u0004\b*\u0010)J\u0015\u0010+\u001a\b\u0012\u0004\u0012\u00020'0&H&¢\u0006\u0004\b+\u0010)J+\u0010/\u001a\b\u0012\u0004\u0012\u00020#0\u001f2\u0014\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020#0-0,H&¢\u0006\u0004\b/\u00100J\u0015\u00103\u001a\b\u0012\u0004\u0012\u00020201H'¢\u0006\u0004\b3\u00104J\u0015\u00107\u001a\b\u0012\u0004\u0012\u00020605H&¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0002H&¢\u0006\u0004\b9\u0010\u0004J#\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010;\u001a\u00020:2\b\b\u0002\u0010<\u001a\u00020\u0007H&¢\u0006\u0004\b>\u0010?J$\u0010A\u001a\u0004\u0018\u00010@2\u0006\u0010;\u001a\u00020:2\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\bA\u0010BJ$\u0010D\u001a\u0004\u0018\u00010C2\u0006\u0010;\u001a\u00020:2\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\bD\u0010BJ\u000f\u0010E\u001a\u00020\u0002H&¢\u0006\u0004\bE\u0010\u0004J\u000f\u0010F\u001a\u00020\u0002H&¢\u0006\u0004\bF\u0010\u0004J\u001a\u0010G\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\bG\u0010HJ\u001a\u0010I\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\bI\u0010HJ$\u0010M\u001a\u0004\u0018\u00010L2\u0006\u0010K\u001a\u00020J2\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\bM\u0010NJ4\u0010T\u001a\u0004\u0018\u00010L2\u0006\u0010P\u001a\u00020O2\u0006\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\bT\u0010UJ&\u0010W\u001a\u0004\u0018\u00010V2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010P\u001a\u00020OH¦@¢\u0006\u0004\bW\u0010XJ$\u0010\\\u001a\u0004\u0018\u00010[2\b\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020YH¦@¢\u0006\u0004\b\\\u0010]J\u001c\u0010_\u001a\u0004\u0018\u00010^2\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b_\u0010HJ\u001c\u0010`\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b`\u0010HJ$\u0010c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010b\u001a\u00020a2\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\bc\u0010dJ,\u0010h\u001a\u0004\u0018\u00010g2\u0006\u0010e\u001a\u00020O2\u0006\u0010f\u001a\u00020O2\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\bh\u0010iJ\u001c\u0010k\u001a\u0004\u0018\u00010j2\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\bk\u0010HJ$\u0010o\u001a\u0004\u0018\u00010n2\u0006\u0010m\u001a\u00020l2\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\bo\u0010pJ$\u0010s\u001a\u0004\u0018\u00010r2\u0006\u0010m\u001a\u00020q2\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\bs\u0010tJ$\u0010w\u001a\u0004\u0018\u00010v2\u0006\u0010m\u001a\u00020u2\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\bw\u0010xJ$\u0010z\u001a\u0004\u0018\u00010\u000b2\u0006\u0010y\u001a\u00020:2\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\bz\u0010BJ$\u0010|\u001a\u0004\u0018\u00010{2\u0006\u0010y\u001a\u00020:2\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b|\u0010BJ$\u0010~\u001a\u0004\u0018\u00010}2\u0006\u0010y\u001a\u00020:2\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b~\u0010BJ'\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u00012\u0006\u0010\u007f\u001a\u00020:2\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0005\b\u0081\u0001\u0010BJ\u001c\u0010\u0082\u0001\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0005\b\u0082\u0001\u0010HJ$\u0010\u0083\u0001\u001a\u00020\u00022\u0006\u0010y\u001a\u00020:2\b\b\u0002\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0005\b\u0083\u0001\u0010BR\u001a\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0084\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u0088\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008c\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0090\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0019\u0010\u0096\u0001\u001a\u0004\u0018\u00010a8&X¦\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0017\u0010\u0099\u0001\u001a\u00020:8&X¦\u0004¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009d\u0001\u001a\u00030\u009a\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001d\u0010\u009f\u0001\u001a\t\u0012\u0005\u0012\u00030\u009a\u00010\u001f8&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010\"R\u001f\u0010¤\u0001\u001a\u00030 \u00018&X§\u0004¢\u0006\u000f\u0012\u0005\b£\u0001\u0010\u0004\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0018\u0010¨\u0001\u001a\u00030¥\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R\u0018\u0010¬\u0001\u001a\u00030©\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001R$\u0010°\u0001\u001a\t\u0012\u0005\u0012\u00030\u00ad\u00010\u001f8&X§\u0004¢\u0006\u000e\u0012\u0005\b¯\u0001\u0010\u0004\u001a\u0005\b®\u0001\u0010\"R\u001d\u0010³\u0001\u001a\t\u0012\u0005\u0012\u00030±\u00010\u001f8&X¦\u0004¢\u0006\u0007\u001a\u0005\b²\u0001\u0010\"R\u001d\u0010¶\u0001\u001a\t\u0012\u0005\u0012\u00030´\u00010\u001f8&X¦\u0004¢\u0006\u0007\u001a\u0005\bµ\u0001\u0010\"R\u001d\u0010¹\u0001\u001a\t\u0012\u0005\u0012\u00030·\u00010\u001f8&X¦\u0004¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010\"¨\u0006º\u0001À\u0006\u0003"}, m65681d2 = {"Ljk0/d;", "", "Ll83/a0;", "i0", "()V", "Lvk0/g;", "task", "", "timeout", "Lsj2/a;", "executionPriority", "Lzj0/h;", "g0", "(Lvk0/g;JLsj2/a;Lq83/d;)Ljava/lang/Object;", "Lvk0/j;", "Lbc3/i0;", "Lvk0/e;", "u", "(Lvk0/j;Lsj2/a;)Lbc3/i0;", "Llk0/a;", "callback", "A0", "(Llk0/a;)V", "I0", "Ldk0/k;", "T", "Ljava/lang/Class;", "realTimeDataType", "Ll73/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ljava/lang/Class;)Ll73/c;", "Lec3/l;", "", "L0", "()Lec3/l;", "Lot0/a;", "K", "()Ll73/c;", "Lec3/t1;", "Llt0/k;", "N", "()Lec3/t1;", "x0", "o0", "", "Lj93/d;", "filterPacketList", "v", "(Ljava/util/Set;)Lec3/l;", "Ll73/a;", "Lek0/u;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ll73/a;", "Ll73/h;", "Lmk0/a;", "x", "()Ll73/h;", "G0", "", "turnOn", "delay", "Lnk0/a$a;", "O0", "(ZJ)Lnk0/a$a;", "Lzj0/j1;", "e0", "(ZJLq83/d;)Ljava/lang/Object;", "Lzj0/d1;", "U", "n0", "P0", "X", "(JLq83/d;)Ljava/lang/Object;", "p0", "Lfk2/a;", "timeStamp", "Lzj0/v0;", "b0", "(Lfk2/a;JLq83/d;)Ljava/lang/Object;", "", "strapAlarmId", "Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;", "alarmHapticsPattern", "alarmTimeMillis", "D0", "(ILcom/whoop/domain/model/haptics/AlarmHapticsPattern;JJLq83/d;)Ljava/lang/Object;", "Lzj0/m;", "E", "(JILq83/d;)Ljava/lang/Object;", "Lxj0/i0;", "params", "Lzj0/p0;", "t", "(JLxj0/i0;Lq83/d;)Ljava/lang/Object;", "Lzj0/j;", "U0", "a1", "", "name", "H", "(Ljava/lang/String;JLq83/d;)Ljava/lang/Object;", "intervalSeconds", "durationSeconds", "Lak0/b;", "S0", "(IIJLq83/d;)Ljava/lang/Object;", "Lzj0/k;", "p", "Lyj0/b;", "packet", "Lak0/g;", "S", "(Lyj0/b;JLq83/d;)Ljava/lang/Object;", "Lxj0/j0;", "Lzj0/q0;", "F", "(Lxj0/j0;JLq83/d;)Ljava/lang/Object;", "Lxj0/k;", "Lzj0/o;", "I", "(Lxj0/k;JLq83/d;)Ljava/lang/Object;", "enable", "o", "Lzj0/e1;", "Y", "Lzj0/g1;", "N0", "enabled", "Lzj0/f1;", "h0", "d1", "V0", "Lcom/whoop/domain/model/WhoopStrapInfo;", "f", "()Lcom/whoop/domain/model/WhoopStrapInfo;", "strapInfo", "Lkk0/a;", "b", "()Lkk0/a;", "batteryLevel", "Lkk0/b;", "n", "()Lkk0/b;", "chargeStatus", "Ltj0/a;", "e", "()Ltj0/a;", "genericHrProfileController", "M0", "()Ljava/lang/String;", "advertisingName", "j", "()Z", "batteryPackOn", "Lws0/a;", "k", "()Lws0/a;", "whoopBatteryLevel", "z", "whoopBatteryLevelFlow", "Ltd1/a;", "d", "()Ltd1/a;", "getStrapGeneration$annotations", "strapGeneration", "Ljk0/f;", "J", "()Ljk0/f;", "strapBodyStatus", "Lst0/v;", "w0", "()Lst0/v;", "strapGen", "Ldk0/h;", "q0", "getImuDataStreamFlow$annotations", "imuDataStreamFlow", "Lrt0/b$b;", "b1", "realTimeImuDataStreamFlow", "Lsj0/a;", "Y0", "hrRealtimeDataStreamFlow", "Ldk0/j;", "H0", "observeEcgFilteredPacketsFlow", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC21750d extends InterfaceC32968l, InterfaceC26794a {
    /* JADX INFO: renamed from: B */
    static /* synthetic */ Object m61368B(InterfaceC21750d interfaceC21750d, long j7, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendExitHighFreqSyncCommand");
        }
        if ((i13 & 1) != 0) {
            j7 = 5000;
        }
        return interfaceC21750d.mo24743p(j7, interfaceC30057d);
    }

    /* JADX INFO: renamed from: B0 */
    static /* synthetic */ Object m61369B0(InterfaceC21750d interfaceC21750d, C14554a c14554a, long j7, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendSetAlarmTimeCommand");
        }
        if ((i13 & 2) != 0) {
            j7 = 5000;
        }
        return interfaceC21750d.mo24717b0(c14554a, j7, interfaceC30057d);
    }

    /* JADX INFO: renamed from: D */
    static /* synthetic */ Object m61370D(InterfaceC21750d interfaceC21750d, boolean z4, long j7, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendToggleRealtimeHeartRateCommandSuspend");
        }
        if ((i13 & 2) != 0) {
            j7 = 5000;
        }
        return interfaceC21750d.mo24725e0(z4, j7, interfaceC30057d);
    }

    /* JADX INFO: renamed from: J0 */
    static /* synthetic */ Object m61371J0(InterfaceC21750d interfaceC21750d, long j7, AbstractC38356i0 abstractC38356i0, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendRunAlarmCommand");
        }
        if ((i13 & 1) != 0) {
            j7 = 5000;
        }
        return interfaceC21750d.mo24748t(j7, abstractC38356i0, interfaceC30057d);
    }

    /* JADX INFO: renamed from: K0 */
    static /* synthetic */ Object m61372K0(InterfaceC21750d interfaceC21750d, long j7, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendForceTrimLevelCommand");
        }
        if ((i13 & 1) != 0) {
            j7 = 5000;
        }
        return interfaceC21750d.mo24710X(j7, interfaceC30057d);
    }

    /* JADX INFO: renamed from: Q */
    static /* synthetic */ Object m61373Q(InterfaceC21750d interfaceC21750d, String str, long j7, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendUpdateAdvertisingNameCommand");
        }
        if ((i13 & 2) != 0) {
            j7 = 5000;
        }
        return interfaceC21750d.mo24691H(str, j7, interfaceC30057d);
    }

    /* JADX INFO: renamed from: R */
    static /* synthetic */ Object m61374R(InterfaceC21750d interfaceC21750d, C39588b c39588b, long j7, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendRunHapticsPattern");
        }
        if ((i13 & 2) != 0) {
            j7 = 5000;
        }
        return interfaceC21750d.mo24704S(c39588b, j7, interfaceC30057d);
    }

    /* JADX INFO: renamed from: W */
    static /* synthetic */ Object m61375W(InterfaceC21750d interfaceC21750d, long j7, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendPowerCycleCommand");
        }
        if ((i13 & 1) != 0) {
            j7 = 5000;
        }
        return interfaceC21750d.mo24722d1(j7, interfaceC30057d);
    }

    /* JADX INFO: renamed from: W0 */
    static /* synthetic */ Object m61376W0(InterfaceC21750d interfaceC21750d, boolean z4, long j7, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendToggleGenericHeartRateProfileCommand");
        }
        if ((i13 & 2) != 0) {
            j7 = 2000;
        }
        return interfaceC21750d.mo24707U(z4, j7, interfaceC30057d);
    }

    /* JADX INFO: renamed from: Z0 */
    static /* synthetic */ Object m61377Z0(InterfaceC21750d interfaceC21750d, boolean z4, long j7, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setPersistentRawDataAndReboot");
        }
        if ((i13 & 2) != 0) {
            j7 = 5000;
        }
        return interfaceC21750d.mo24709V0(z4, j7, interfaceC30057d);
    }

    /* JADX INFO: renamed from: k0 */
    static /* synthetic */ Object m61378k0(InterfaceC21750d interfaceC21750d, long j7, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendRebootStrapCommand");
        }
        if ((i13 & 1) != 0) {
            j7 = 5000;
        }
        return interfaceC21750d.mo24744p0(j7, interfaceC30057d);
    }

    /* JADX INFO: renamed from: l0 */
    static /* synthetic */ Object m61379l0(InterfaceC21750d interfaceC21750d, InterfaceC36081g interfaceC36081g, long j7, InterfaceC32564a interfaceC32564a, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitCommandTask");
        }
        if ((i13 & 4) != 0) {
            interfaceC32564a = InterfaceC32564a.c.f134908a;
        }
        return interfaceC21750d.mo24727g0(interfaceC36081g, j7, interfaceC32564a, interfaceC30057d);
    }

    /* JADX INFO: renamed from: m0 */
    static /* synthetic */ Object m61380m0(InterfaceC21750d interfaceC21750d, boolean z4, long j7, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendImuDataStreamCommand");
        }
        if ((i13 & 2) != 0) {
            j7 = 5000;
        }
        return interfaceC21750d.mo24700N0(z4, j7, interfaceC30057d);
    }

    /* JADX INFO: renamed from: r */
    static /* synthetic */ Object m61381r(InterfaceC21750d interfaceC21750d, long j7, int i13, InterfaceC30057d interfaceC30057d, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendGetAlarmTimeCommand");
        }
        if ((i14 & 1) != 0) {
            j7 = 5000;
        }
        if ((i14 & 2) != 0) {
            i13 = 0;
        }
        return interfaceC21750d.mo24687E(j7, i13, interfaceC30057d);
    }

    /* JADX INFO: renamed from: s0 */
    static /* synthetic */ Object m61382s0(InterfaceC21750d interfaceC21750d, long j7, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendGetAdvertisingNameCommand");
        }
        if ((i13 & 1) != 0) {
            j7 = 5000;
        }
        return interfaceC21750d.mo24715a1(j7, interfaceC30057d);
    }

    /* JADX INFO: renamed from: t0 */
    static /* synthetic */ Object m61383t0(InterfaceC21750d interfaceC21750d, long j7, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendDisableAlarmCommand");
        }
        if ((i13 & 1) != 0) {
            j7 = 5000;
        }
        return interfaceC21750d.mo24708U0(j7, interfaceC30057d);
    }

    /* JADX INFO: renamed from: u0 */
    static /* synthetic */ Object m61384u0(InterfaceC21750d interfaceC21750d, int i13, AlarmHapticsPattern alarmHapticsPattern, long j7, long j13, InterfaceC30057d interfaceC30057d, int i14, Object obj) {
        if (obj == null) {
            return interfaceC21750d.mo24686D0(i13, alarmHapticsPattern, j7, (i14 & 8) != 0 ? 5000L : j13, interfaceC30057d);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendSetAlarmInfoById");
    }

    /* JADX INFO: renamed from: y */
    static /* synthetic */ Object m61385y(InterfaceC21750d interfaceC21750d, C38361k c38361k, long j7, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendGetBatteryPackInfoCommand");
        }
        if ((i13 & 2) != 0) {
            j7 = 5000;
        }
        return interfaceC21750d.mo24693I(c38361k, j7, interfaceC30057d);
    }

    /* JADX INFO: renamed from: y0 */
    static /* synthetic */ Object m61386y0(InterfaceC21750d interfaceC21750d, int i13, int i14, long j7, InterfaceC30057d interfaceC30057d, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendHighFreqHistorySyncCommand");
        }
        if ((i15 & 4) != 0) {
            j7 = 5000;
        }
        return interfaceC21750d.mo24705S0(i13, i14, j7, interfaceC30057d);
    }

    /* JADX INFO: renamed from: z0 */
    static /* synthetic */ Object m61387z0(InterfaceC21750d interfaceC21750d, C38359j0 c38359j0, long j7, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: runHapticsPatternMaverick");
        }
        if ((i13 & 2) != 0) {
            j7 = 5000;
        }
        return interfaceC21750d.mo24688F(c38359j0, j7, interfaceC30057d);
    }

    /* JADX INFO: renamed from: A0 */
    void mo24684A0(AbstractC24489a callback);

    /* JADX INFO: renamed from: D0 */
    Object mo24686D0(int i13, AlarmHapticsPattern alarmHapticsPattern, long j7, long j13, InterfaceC30057d<? super C40761v0> interfaceC30057d);

    /* JADX INFO: renamed from: E */
    Object mo24687E(long j7, int i13, InterfaceC30057d<? super C40742m> interfaceC30057d);

    /* JADX INFO: renamed from: F */
    Object mo24688F(C38359j0 c38359j0, long j7, InterfaceC30057d<? super C40751q0> interfaceC30057d);

    /* JADX INFO: renamed from: G0 */
    void mo24690G0();

    /* JADX INFO: renamed from: H */
    Object mo24691H(String str, long j7, InterfaceC30057d<? super C40727h> interfaceC30057d);

    /* JADX INFO: renamed from: H0 */
    InterfaceC13058l mo24692H0();

    /* JADX INFO: renamed from: I */
    Object mo24693I(C38361k c38361k, long j7, InterfaceC30057d<? super C40746o> interfaceC30057d);

    /* JADX INFO: renamed from: I0 */
    void mo24694I0(AbstractC24489a callback);

    /* JADX INFO: renamed from: J */
    InterfaceC21752f mo24695J();

    @InterfaceC23457c
    /* JADX INFO: renamed from: K */
    AbstractC23412c mo24696K();

    /* JADX INFO: renamed from: L0 */
    InterfaceC13058l mo24697L0();

    /* JADX INFO: renamed from: M0 */
    String getAdvertisingName();

    /* JADX INFO: renamed from: N */
    InterfaceC13087t1 mo24699N();

    /* JADX INFO: renamed from: N0 */
    Object mo24700N0(boolean z4, long j7, InterfaceC30057d<? super C40726g1> interfaceC30057d);

    /* JADX INFO: renamed from: O0 */
    InterfaceC26794a.a mo24701O0(boolean turnOn, long delay);

    /* JADX INFO: renamed from: P0 */
    void mo24702P0();

    /* JADX INFO: renamed from: S */
    Object mo24704S(C39588b c39588b, long j7, InterfaceC30057d<? super C0945g> interfaceC30057d);

    /* JADX INFO: renamed from: S0 */
    Object mo24705S0(int i13, int i14, long j7, InterfaceC30057d<? super C0940b> interfaceC30057d);

    /* JADX INFO: renamed from: U */
    Object mo24707U(boolean z4, long j7, InterfaceC30057d<? super C40717d1> interfaceC30057d);

    /* JADX INFO: renamed from: U0 */
    Object mo24708U0(long j7, InterfaceC30057d<? super C40733j> interfaceC30057d);

    /* JADX INFO: renamed from: V0 */
    Object mo24709V0(boolean z4, long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: X */
    Object mo24710X(long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: Y */
    Object mo24711Y(boolean z4, long j7, InterfaceC30057d<? super C40720e1> interfaceC30057d);

    /* JADX INFO: renamed from: Y0 */
    InterfaceC13058l mo24712Y0();

    /* JADX INFO: renamed from: a1 */
    Object mo24715a1(long j7, InterfaceC30057d<? super C40727h> interfaceC30057d);

    /* JADX INFO: renamed from: b */
    C22538a getBatteryLevel();

    /* JADX INFO: renamed from: b0 */
    Object mo24717b0(C14554a c14554a, long j7, InterfaceC30057d<? super C40761v0> interfaceC30057d);

    /* JADX INFO: renamed from: b1 */
    InterfaceC13058l getRealTimeImuDataStreamFlow();

    /* JADX INFO: renamed from: d */
    EnumC33703a mo24721d();

    /* JADX INFO: renamed from: d1 */
    Object mo24722d1(long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: e */
    InterfaceC33864a mo24724e();

    /* JADX INFO: renamed from: e0 */
    Object mo24725e0(boolean z4, long j7, InterfaceC30057d<? super C40735j1> interfaceC30057d);

    /* JADX INFO: renamed from: f */
    WhoopStrapInfo get_strapInfo();

    /* JADX INFO: renamed from: g0 */
    Object mo24727g0(InterfaceC36081g interfaceC36081g, long j7, InterfaceC32564a interfaceC32564a, InterfaceC30057d<? super C40727h> interfaceC30057d);

    @InterfaceC23457c
    /* JADX INFO: renamed from: h */
    AbstractC23410a mo24728h();

    /* JADX INFO: renamed from: h0 */
    Object mo24729h0(boolean z4, long j7, InterfaceC30057d<? super C40723f1> interfaceC30057d);

    /* JADX INFO: renamed from: i0 */
    void mo24730i0();

    /* JADX INFO: renamed from: j */
    boolean getBatteryPackOn();

    /* JADX INFO: renamed from: k */
    C37605a get_whoopBatteryLevel();

    /* JADX INFO: renamed from: n */
    C22539b getChargeStatus();

    /* JADX INFO: renamed from: n0 */
    void mo24739n0();

    /* JADX INFO: renamed from: o */
    Object mo24741o(boolean z4, long j7, InterfaceC30057d<? super C40727h> interfaceC30057d);

    /* JADX INFO: renamed from: o0 */
    InterfaceC13087t1 mo24742o0();

    /* JADX INFO: renamed from: p */
    Object mo24743p(long j7, InterfaceC30057d<? super C40736k> interfaceC30057d);

    /* JADX INFO: renamed from: p0 */
    Object mo24744p0(long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: q0 */
    InterfaceC13058l mo24745q0();

    /* JADX INFO: renamed from: t */
    Object mo24748t(long j7, AbstractC38356i0 abstractC38356i0, InterfaceC30057d<? super C40749p0> interfaceC30057d);

    /* JADX INFO: renamed from: u */
    InterfaceC3018i0 mo24749u(InterfaceC36084j task, InterfaceC32564a executionPriority);

    /* JADX INFO: renamed from: v */
    InterfaceC13058l mo24750v(Set<? extends InterfaceC21461d> filterPacketList);

    /* JADX INFO: renamed from: w */
    <T extends C12111k> AbstractC23412c mo24751w(Class<T> realTimeDataType);

    /* JADX INFO: renamed from: w0 */
    EnumC32978v mo24752w0();

    /* JADX INFO: renamed from: x */
    AbstractC23417h mo24753x();

    /* JADX INFO: renamed from: x0 */
    InterfaceC13087t1 mo24754x0();

    /* JADX INFO: renamed from: z */
    InterfaceC13058l mo24756z();
}
