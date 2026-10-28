package y42;

import a52.C0394a;
import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.AbstractC3028k2;
import bc3.AbstractC3050q0;
import bc3.AbstractC3076z;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3018i0;
import bk0.C3347a;
import c52.AbstractC4250a;
import c52.C4253d;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.strapMetadata.util.DataStorePreferenceKeys;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import ec3.InterfaceC13087t1;
import fk0.C14552h;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kh2.AbstractC22486a;
import l83.C23454a0;
import l83.C23468n;
import l83.InterfaceC23462h;
import lt0.AbstractC24726c;
import m83.C25272z;
import p000.AbstractC11266d;
import p007a6.InterfaceC0422g;
import p088dc.AbstractC11895b;
import p138f6.C14132d;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import qt0.InterfaceC30585a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sj2.InterfaceC32564a;
import st0.EnumC32978v;
import tr2.InterfaceC34116n;
import us0.EnumC35206b;
import us0.InterfaceC35205a;
import us0.InterfaceC35208d;
import us0.InterfaceC35209e;
import vk0.InterfaceC36075a;
import vk0.InterfaceC36076b;
import vk0.InterfaceC36079e;
import vk0.InterfaceC36081g;
import vk0.InterfaceC36083i;
import ws0.C37605a;
import xj0.AbstractC38334b;
import ys0.InterfaceC39750a;
import z42.C40077a;
import z42.C40078b;
import z42.C40079c;
import z42.C40080d;
import zj0.C40727h;

/* JADX INFO: renamed from: y42.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000¸\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0091\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 \u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020)H\u0016¢\u0006\u0004\b,\u0010-J%\u00104\u001a\b\u0012\u0004\u0012\u000203022\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020)¢\u0006\u0004\b6\u0010-J0\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=0<2\u0006\u0010/\u001a\u0002072\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0096@¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020)2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020)2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\bB\u0010AJ\u0017\u0010C\u001a\u00020)2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\bC\u0010AJ\u0017\u0010D\u001a\u00020)2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\bD\u0010AJ\u0017\u0010E\u001a\u00020)2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\bE\u0010AJ\u0017\u0010F\u001a\u00020)2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\bF\u0010AJ\u0017\u0010G\u001a\u00020)2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\bG\u0010AJ'\u0010K\u001a\u00020)2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020\bH\u0016¢\u0006\u0004\bK\u0010LJ\u001d\u0010P\u001a\u00020:2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020N0MH\u0016¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020)2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\bR\u0010AJ\u000f\u0010S\u001a\u00020)H\u0016¢\u0006\u0004\bS\u0010-J\u000f\u0010T\u001a\u00020)H\u0002¢\u0006\u0004\bT\u0010-J$\u0010W\u001a\u0004\u0018\u00010=2\u0006\u0010V\u001a\u00020U2\b\b\u0002\u0010;\u001a\u00020:H\u0082@¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020)H\u0002¢\u0006\u0004\bY\u0010-J\u0017\u0010\\\u001a\u00020)2\u0006\u0010[\u001a\u00020ZH\u0002¢\u0006\u0004\b\\\u0010]J\u001b\u0010a\u001a\u000e\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020`0^H\u0002¢\u0006\u0004\ba\u0010bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010yR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0015\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bF\u0010\u0080\u0001R\u001b\u0010\u0083\u0001\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001b\u0010\u0085\u0001\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0082\u0001R\u001b\u0010\u0087\u0001\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0082\u0001R\u001b\u0010\u0089\u0001\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0082\u0001R\u001b\u0010\u008b\u0001\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0082\u0001R \u0010\u008f\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u008d\u00010\u008c\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bG\u0010\u008e\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0090\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R!\u0010\u0099\u0001\u001a\u00030\u0094\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R'\u0010 \u0001\u001a\n\u0012\u0005\u0012\u00030\u009b\u00010\u009a\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R'\u0010§\u0001\u001a\n\u0012\u0005\u0012\u00030¢\u00010¡\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R'\u0010«\u0001\u001a\n\u0012\u0005\u0012\u00030¨\u00010¡\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b©\u0001\u0010¤\u0001\u001a\u0006\bª\u0001\u0010¦\u0001R&\u0010®\u0001\u001a\n\u0012\u0005\u0012\u00030¬\u00010¡\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u00ad\u0001\u0010¤\u0001\u001a\u0005\bz\u0010¦\u0001R\u001f\u0010±\u0001\u001a\n\u0012\u0005\u0012\u00030¯\u00010\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010\u008e\u0001R'\u0010´\u0001\u001a\n\u0012\u0005\u0012\u00030¯\u00010¡\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b²\u0001\u0010¤\u0001\u001a\u0006\b³\u0001\u0010¦\u0001R\u0019\u0010¶\u0001\u001a\u0005\u0018\u00010\u008d\u00018VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b~\u0010µ\u0001¨\u0006·\u0001"}, m65681d2 = {"Ly42/h;", "Ly42/a;", "Lys0/a$a;", "Lvk0/i;", "Ltr2/n;", "logger", "Landroid/content/Context;", "context", "", "macAddress", "Ly42/e;", "connectionStateManager", "Landroid/bluetooth/BluetoothDevice;", "bluetoothDevice", "Lbc3/c0;", "coroutineScope", "Lbc3/z;", "threadSafeDispatcher", "Lus0/e;", "connectivityAnalytics", "Lz42/a;", "commandCharacteristicCallback", "Lz42/c;", "eventCharacteristicCallback", "Lz42/b;", "dataCharacteristicCallback", "Lz42/d;", "memfaultCharacteristicCallback", "Lvk0/b;", "bleTaskExecutor", "Lqt0/a;", "bleScanner", "La6/g;", "Lf6/f;", "dataStorePreferences", "Lus0/a;", "backgroundUsageAggregator", "<init>", "(Ltr2/n;Landroid/content/Context;Ljava/lang/String;Ly42/e;Landroid/bluetooth/BluetoothDevice;Lbc3/c0;Lbc3/z;Lus0/e;Lz42/a;Lz42/c;Lz42/b;Lz42/d;Lvk0/b;Lqt0/a;La6/g;Lus0/a;)V", "Lus0/d$c;", "source", "Ll83/a0;", "C", "(Lus0/d$c;)V", "i1", "()V", "Lvk0/a;", "task", "Lsj2/a;", "executionPriority", "Lbc3/i0;", "Lvk0/e;", "a", "(Lvk0/a;Lsj2/a;)Lbc3/i0;", "l1", "Lvk0/g;", "Lkotlin/time/Duration;", "timeout", "", "dualResponse", "Ll83/n;", "Lzj0/h;", "i", "(Lvk0/g;JZLq83/d;)Ljava/lang/Object;", "v0", "(Landroid/bluetooth/BluetoothDevice;)V", "m", "q", "C0", "L", "P", "V", "", NotificationCompat.CATEGORY_STATUS, "message", "X0", "(Landroid/bluetooth/BluetoothDevice;ILjava/lang/String;)V", "", "Landroid/bluetooth/BluetoothGattService;", "services", "c1", "(Ljava/util/List;)Z", "c", "F0", "m1", "Lxj0/b;", "blePacket", "o1", "(Lxj0/b;ZLq83/d;)Ljava/lang/Object;", "n1", "Lus0/d;", "connMetric", "p1", "(Lus0/d;)V", "", "Landroid/bluetooth/BluetoothGattCharacteristic;", "Lys0/a$b;", "k1", "()Ljava/util/Map;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ltr2/n;", "x", "Landroid/content/Context;", "y", "Ljava/lang/String;", "z", "Ly42/e;", "E", "Landroid/bluetooth/BluetoothDevice;", "F", "Lbc3/c0;", "G", "Lbc3/z;", "H", "Lus0/e;", "I", "Lz42/a;", "J", "Lz42/c;", "K", "Lz42/b;", "Lz42/d;", "M", "Lvk0/b;", "N", "Lqt0/a;", "O", "La6/g;", "Lus0/a;", "Q", "Landroid/bluetooth/BluetoothGattCharacteristic;", "cmdToPuffinCharacteristic", "R", "cmdFromPuffinCharacteristic", "S", "eventFromPuffinCharacteristic", "T", "dataFromPuffinCharacteristic", "U", "memfaultCharacteristic", "Lec3/p1;", "Lc52/d;", "Lec3/p1;", "puffinMetaDataStateFlow", "Ljava/util/concurrent/atomic/AtomicInteger;", "W", "Ljava/util/concurrent/atomic/AtomicInteger;", "sequenceNumber", "Ly42/d;", "X", "Ll83/h;", "j1", "()Ly42/d;", "bleHandler", "Lec3/t1;", "Lc52/b;", "Y", "Lec3/t1;", "l", "()Lec3/t1;", "connectionStatus", "Lec3/l;", "Llt0/c;", "Z", "Lec3/l;", "getEventPacketsFlow", "()Lec3/l;", "eventPacketsFlow", "Llt0/k;", "a0", "s", "dataPacketsFlow", "", "b0", "memfaultFlow", "Lws0/a;", "c0", "_batteryLevelFlow", "d0", "A", "batteryLevelFlow", "()Lc52/d;", "batteryPackMetadata", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39226h implements InterfaceC39219a, InterfaceC39750a.a, InterfaceC36083i {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final BluetoothDevice bluetoothDevice;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final AbstractC3076z threadSafeDispatcher;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC35209e connectivityAnalytics;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final C40077a commandCharacteristicCallback;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final C40079c eventCharacteristicCallback;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final C40078b dataCharacteristicCallback;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final C40080d memfaultCharacteristicCallback;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final InterfaceC36076b bleTaskExecutor;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final InterfaceC30585a bleScanner;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final InterfaceC0422g dataStorePreferences;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final InterfaceC35205a backgroundUsageAggregator;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private BluetoothGattCharacteristic cmdToPuffinCharacteristic;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private BluetoothGattCharacteristic cmdFromPuffinCharacteristic;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private BluetoothGattCharacteristic eventFromPuffinCharacteristic;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private BluetoothGattCharacteristic dataFromPuffinCharacteristic;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private BluetoothGattCharacteristic memfaultCharacteristic;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private final InterfaceC13075p1 puffinMetaDataStateFlow;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private final AtomicInteger sequenceNumber;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private final InterfaceC23462h bleHandler;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private final InterfaceC13087t1 connectionStatus;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private final InterfaceC13058l eventPacketsFlow;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    private final InterfaceC13058l dataPacketsFlow;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    private final InterfaceC13058l memfaultFlow;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    private final InterfaceC13075p1 _batteryLevelFlow;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    private final InterfaceC13058l batteryLevelFlow;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String macAddress;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C39223e connectionStateManager;

    /* JADX INFO: renamed from: y42.h$a */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.ble.PuffinImpl$observePuffinEventPacketsFlow$1", m100430f = "PuffinImpl.kt", m100431l = {156}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f168607w;

        /* JADX INFO: renamed from: y42.h$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42675a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C39226h f168609w;

            public C42675a(C39226h c39226h) {
                this.f168609w = c39226h;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC24726c abstractC24726c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (abstractC24726c instanceof C14552h) {
                    ((C13045h2) this.f168609w._batteryLevelFlow).m36570j(((C14552h) abstractC24726c).getBatteryLevel());
                }
                return C23454a0.f92919a;
            }
        }

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39226h.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f168607w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13087t1 interfaceC13087t1M128467c = C39226h.this.eventCharacteristicCallback.getPuffinEventResponseFlow();
                C42675a c42675a = new C42675a(C39226h.this);
                this.f168607w = 1;
                if (interfaceC13087t1M128467c.collect(c42675a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: y42.h$b */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.ble.PuffinImpl$onDeviceReady$1", m100430f = "PuffinImpl.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f168610w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39226h.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f168610w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C39226h.this.m124979n1();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: y42.h$c */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.ble.PuffinImpl$registerCharsForNotificationAndExchangeHelloPacket$1", m100430f = "PuffinImpl.kt", m100431l = {402, 338}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f168612w;

        /* JADX INFO: renamed from: x */
        int f168613x;

        /* JADX INFO: renamed from: y */
        int f168614y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39226h.this.new c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x008c A[Catch: Exception -> 0x008f, TRY_LEAVE, TryCatch #1 {Exception -> 0x008f, blocks: (B:29:0x0088, B:31:0x008c, B:27:0x0080, B:13:0x0042, B:10:0x0023, B:17:0x005d, B:20:0x0064, B:22:0x0068, B:24:0x0073, B:25:0x007a, B:26:0x007f, B:14:0x004f), top: B:44:0x0008, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:34:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:36:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:37:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:40:0x0115  */
        /* JADX WARN: Instruction removed from duplicated block: B:37:0x00d2, please report this as an issue */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C3347a c3347a;
            InterfaceC0422g interfaceC0422g;
            C14132d pref_auxiliary_device_id;
            String strM9663a0;
            C3347a c3347a2;
            C40727h commandResponse;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f168614y;
            try {
                try {
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        C39226h.this.logger.mo85216g("Puffin Connection Step: 4 Sending Get Hello Command Packet Request Starting...", new AbstractC30556a.a[0]);
                        C39226h.this.connectionStateManager.m124960e(AbstractC4250a.f.f17280a);
                        InterfaceC3018i0 interfaceC3018i0Mo124936a = C39226h.this.mo124936a(new C0394a(), InterfaceC32564a.a.f134904a);
                        this.f168612w = null;
                        this.f168613x = 0;
                        this.f168614y = 1;
                        obj = interfaceC3018i0Mo124936a.await(this);
                        if (obj == enumC31071a) {
                        }
                        return enumC31071a;
                    }
                    if (i13 == 1) {
                        AbstractC34132o.m107864I(obj);
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c3347a2 = (C3347a) this.f168612w;
                        AbstractC34132o.m107864I(obj);
                    }
                    InterfaceC13075p1 interfaceC13075p1 = C39226h.this.puffinMetaDataStateFlow;
                    C4253d c4253d = new C4253d(c3347a2.m9661Z(), c3347a2.m9663a0(), c3347a2.m9666d(), c3347a2.getColorWay(), C39226h.this.macAddress);
                    C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
                    c13045h2.getClass();
                    c13045h2.m36571k(null, c4253d);
                    C39226h.this.m124981p1(new InterfaceC35208d.d(EnumC32978v.PUFFIN, InterfaceC35208d.b.SUCCESS, null, 4, null));
                    C39226h.this.connectionStateManager.m124960e(AbstractC4250a.g.f17281a);
                    return C23454a0.f92919a;
                    InterfaceC36079e interfaceC36079e = (InterfaceC36079e) obj;
                    if (!(interfaceC36079e instanceof InterfaceC36079e.a)) {
                        if (!(interfaceC36079e instanceof InterfaceC36079e.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (((InterfaceC36079e.b) interfaceC36079e).getCommandResponse() instanceof C3347a) {
                            commandResponse = ((InterfaceC36079e.b) interfaceC36079e).getCommandResponse();
                        }
                        if (commandResponse instanceof C3347a) {
                            c3347a = (C3347a) commandResponse;
                        } else {
                            c3347a = null;
                        }
                        if (c3347a == null) {
                            C39226h.this.logger.mo85216g("Puffin Connection Step: Success hello exchange " + c3347a, new AbstractC30556a.a[0]);
                            ((C13045h2) C39226h.this._batteryLevelFlow).m36570j(c3347a.m9659X());
                            interfaceC0422g = C39226h.this.dataStorePreferences;
                            pref_auxiliary_device_id = DataStorePreferenceKeys.INSTANCE.getPREF_AUXILIARY_DEVICE_ID();
                            strM9663a0 = c3347a.m9663a0();
                            this.f168612w = c3347a;
                            this.f168614y = 2;
                            if (AbstractC22486a.m64987c(interfaceC0422g, pref_auxiliary_device_id, strM9663a0, this) != enumC31071a) {
                                c3347a2 = c3347a;
                                InterfaceC13075p1 interfaceC13075p2 = C39226h.this.puffinMetaDataStateFlow;
                                C4253d c4253d2 = new C4253d(c3347a2.m9661Z(), c3347a2.m9663a0(), c3347a2.m9666d(), c3347a2.getColorWay(), C39226h.this.macAddress);
                                C13045h2 c13045h3 = (C13045h2) interfaceC13075p2;
                                c13045h3.getClass();
                                c13045h3.m36571k(null, c4253d2);
                                C39226h.this.m124981p1(new InterfaceC35208d.d(EnumC32978v.PUFFIN, InterfaceC35208d.b.SUCCESS, null, 4, null));
                                C39226h.this.connectionStateManager.m124960e(AbstractC4250a.g.f17281a);
                            }
                            return enumC31071a;
                        }
                        C39226h.this.connectionStateManager.m124960e(new AbstractC4250a.e("Puffin Connection Step: 4 Failed hello exchange"));
                        C39226h.this.m124981p1(new InterfaceC35208d.d(EnumC32978v.PUFFIN, InterfaceC35208d.b.FAIL, "Puffin Connection Step: 4 Failed hello exchange"));
                        C39226h.this.m124982i1();
                        return C23454a0.f92919a;
                    }
                } catch (Exception unused) {
                    AbstractC3006f0.m8721o(getContext());
                }
                commandResponse = null;
                if (commandResponse instanceof C3347a) {
                    c3347a = (C3347a) commandResponse;
                } else {
                    c3347a = null;
                }
            } catch (Exception unused2) {
                C39226h.this.logger.mo85222m("Puffin Connection Step: 4 Failed to send hello response packet", new AbstractC30556a.a[0]);
                C39226h.this.m124981p1(new InterfaceC35208d.d(EnumC32978v.PUFFIN, InterfaceC35208d.b.FAIL, "Puffin Connection Step: 4 Failed to send hello response packet"));
            }
            if (c3347a == null) {
                C39226h.this.logger.mo85216g("Puffin Connection Step: Success hello exchange " + c3347a, new AbstractC30556a.a[0]);
                ((C13045h2) C39226h.this._batteryLevelFlow).m36570j(c3347a.m9659X());
                interfaceC0422g = C39226h.this.dataStorePreferences;
                pref_auxiliary_device_id = DataStorePreferenceKeys.INSTANCE.getPREF_AUXILIARY_DEVICE_ID();
                strM9663a0 = c3347a.m9663a0();
                this.f168612w = c3347a;
                this.f168614y = 2;
                if (AbstractC22486a.m64987c(interfaceC0422g, pref_auxiliary_device_id, strM9663a0, this) != enumC31071a) {
                    c3347a2 = c3347a;
                    InterfaceC13075p1 interfaceC13075p3 = C39226h.this.puffinMetaDataStateFlow;
                    C4253d c4253d3 = new C4253d(c3347a2.m9661Z(), c3347a2.m9663a0(), c3347a2.m9666d(), c3347a2.getColorWay(), C39226h.this.macAddress);
                    C13045h2 c13045h4 = (C13045h2) interfaceC13075p3;
                    c13045h4.getClass();
                    c13045h4.m36571k(null, c4253d3);
                    C39226h.this.m124981p1(new InterfaceC35208d.d(EnumC32978v.PUFFIN, InterfaceC35208d.b.SUCCESS, null, 4, null));
                    C39226h.this.connectionStateManager.m124960e(AbstractC4250a.g.f17281a);
                }
                return enumC31071a;
            }
            C39226h.this.connectionStateManager.m124960e(new AbstractC4250a.e("Puffin Connection Step: 4 Failed hello exchange"));
            C39226h.this.m124981p1(new InterfaceC35208d.d(EnumC32978v.PUFFIN, InterfaceC35208d.b.FAIL, "Puffin Connection Step: 4 Failed hello exchange"));
            C39226h.this.m124982i1();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: y42.h$d */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.ble.PuffinImpl", m100430f = "PuffinImpl.kt", m100431l = {181, 183}, m100432m = "sendCommandToPuffin", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f168617F;

        /* JADX INFO: renamed from: w */
        Object f168618w;

        /* JADX INFO: renamed from: x */
        Object f168619x;

        /* JADX INFO: renamed from: y */
        boolean f168620y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f168621z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f168621z = obj;
            this.f168617F |= Integer.MIN_VALUE;
            return C39226h.this.m124980o1(null, false, this);
        }
    }

    /* JADX INFO: renamed from: y42.h$e */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.ble.PuffinImpl$sendCommandToPuffin$3", m100430f = "PuffinImpl.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lzj0/h;", "it", "", "<anonymous>", "(Lzj0/h;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f168622w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f168623x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC38334b f168624y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC38334b abstractC38334b, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f168624y = abstractC38334b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(this.f168624y, interfaceC30057d);
            eVar.f168623x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C40727h c40727h, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((e) create(c40727h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C40727h c40727h = (C40727h) this.f168623x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f168622w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return Boolean.valueOf(c40727h.m132196U() == this.f168624y.mo114594s(EnumC32978v.PUFFIN) && c40727h.m132195T() == this.f168624y.mo72387N());
        }
    }

    /* JADX INFO: renamed from: y42.h$f */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.ble.PuffinImpl$sendCommandToPuffin$4", m100430f = "PuffinImpl.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lzj0/h;", "it", "", "<anonymous>", "(Lzj0/h;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f168625w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f168626x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC38334b f168627y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractC38334b abstractC38334b, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f168627y = abstractC38334b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = new f(this.f168627y, interfaceC30057d);
            fVar.f168626x = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C40727h c40727h, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((f) create(c40727h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C40727h c40727h = (C40727h) this.f168626x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f168625w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return Boolean.valueOf(c40727h.m132196U() == this.f168627y.mo114594s(EnumC32978v.PUFFIN) && c40727h.m132195T() == this.f168627y.mo72387N());
        }
    }

    /* JADX INFO: renamed from: y42.h$g */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.ble.PuffinImpl", m100430f = "PuffinImpl.kt", m100431l = {147}, m100432m = "sendTaskAndAwaitResponse-JXpvp54", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f168628E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f168629F;

        /* JADX INFO: renamed from: H */
        int f168631H;

        /* JADX INFO: renamed from: w */
        Object f168632w;

        /* JADX INFO: renamed from: x */
        long f168633x;

        /* JADX INFO: renamed from: y */
        boolean f168634y;

        /* JADX INFO: renamed from: z */
        int f168635z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f168629F = obj;
            this.f168631H |= Integer.MIN_VALUE;
            Object objMo79830i = C39226h.this.mo79830i(null, 0L, false, this);
            return objMo79830i == EnumC31071a.f128113w ? objMo79830i : new C23468n(objMo79830i);
        }
    }

    /* JADX INFO: renamed from: y42.h$h */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.ble.PuffinImpl$sendTaskAndAwaitResponse$2$1", m100430f = "PuffinImpl.kt", m100431l = {148}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lzj0/h;", "<anonymous>", "(Lbc3/c0;)Lzj0/h;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f168636w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC36081g f168638y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f168639z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC36081g interfaceC36081g, boolean z4, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f168638y = interfaceC36081g;
            this.f168639z = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C39226h.this.new h(this.f168638y, this.f168639z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C40727h> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Exception {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f168636w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C39226h c39226h = C39226h.this;
            InterfaceC36081g interfaceC36081g = this.f168638y;
            AbstractC22676k.m65748h(interfaceC36081g, "null cannot be cast to non-null type com.whoop.ble.packets.commandpackets.CommandPacket");
            boolean z4 = this.f168639z;
            this.f168636w = 1;
            Object objM124980o1 = c39226h.m124980o1((AbstractC38334b) interfaceC36081g, z4, this);
            return objM124980o1 == enumC31071a ? enumC31071a : objM124980o1;
        }
    }

    public C39226h(InterfaceC34116n logger, Context context, String macAddress, C39223e connectionStateManager, BluetoothDevice bluetoothDevice, InterfaceC2994c0 coroutineScope, AbstractC3076z threadSafeDispatcher, InterfaceC35209e connectivityAnalytics, C40077a commandCharacteristicCallback, C40079c eventCharacteristicCallback, C40078b dataCharacteristicCallback, C40080d memfaultCharacteristicCallback, InterfaceC36076b bleTaskExecutor, InterfaceC30585a bleScanner, InterfaceC0422g dataStorePreferences, InterfaceC35205a backgroundUsageAggregator) {
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(macAddress, "macAddress");
        AbstractC22676k.m65750j(connectionStateManager, "connectionStateManager");
        AbstractC22676k.m65750j(bluetoothDevice, "bluetoothDevice");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(threadSafeDispatcher, "threadSafeDispatcher");
        AbstractC22676k.m65750j(connectivityAnalytics, "connectivityAnalytics");
        AbstractC22676k.m65750j(commandCharacteristicCallback, "commandCharacteristicCallback");
        AbstractC22676k.m65750j(eventCharacteristicCallback, "eventCharacteristicCallback");
        AbstractC22676k.m65750j(dataCharacteristicCallback, "dataCharacteristicCallback");
        AbstractC22676k.m65750j(memfaultCharacteristicCallback, "memfaultCharacteristicCallback");
        AbstractC22676k.m65750j(bleTaskExecutor, "bleTaskExecutor");
        AbstractC22676k.m65750j(bleScanner, "bleScanner");
        AbstractC22676k.m65750j(dataStorePreferences, "dataStorePreferences");
        AbstractC22676k.m65750j(backgroundUsageAggregator, "backgroundUsageAggregator");
        this.logger = logger;
        this.context = context;
        this.macAddress = macAddress;
        this.connectionStateManager = connectionStateManager;
        this.bluetoothDevice = bluetoothDevice;
        this.coroutineScope = coroutineScope;
        this.threadSafeDispatcher = threadSafeDispatcher;
        this.connectivityAnalytics = connectivityAnalytics;
        this.commandCharacteristicCallback = commandCharacteristicCallback;
        this.eventCharacteristicCallback = eventCharacteristicCallback;
        this.dataCharacteristicCallback = dataCharacteristicCallback;
        this.memfaultCharacteristicCallback = memfaultCharacteristicCallback;
        this.bleTaskExecutor = bleTaskExecutor;
        this.bleScanner = bleScanner;
        this.dataStorePreferences = dataStorePreferences;
        this.backgroundUsageAggregator = backgroundUsageAggregator;
        this.puffinMetaDataStateFlow = AbstractC13091v.m36593c(null);
        this.sequenceNumber = new AtomicInteger(0);
        this.bleHandler = AbstractC30060g.m92088H(new InterfaceC4339a() { // from class: y42.g
            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                return C39226h.m124974h1(this.f168576w);
            }
        });
        this.connectionStatus = connectionStateManager.getConnectionState();
        this.eventPacketsFlow = eventCharacteristicCallback.getPuffinEventResponseFlow();
        this.dataPacketsFlow = dataCharacteristicCallback.getPuffinDataFlow();
        this.memfaultFlow = memfaultCharacteristicCallback.getPuffinMemfaultResponseFlow();
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new C37605a(0));
        this._batteryLevelFlow = c13045h2M36593c;
        this.batteryLevelFlow = AbstractC13091v.m36598h(c13045h2M36593c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public static final C39222d m124974h1(C39226h c39226h) {
        return new C39222d(null, c39226h.context, c39226h, c39226h.bleScanner, c39226h.coroutineScope, 1, null);
    }

    /* JADX INFO: renamed from: j1 */
    private final C39222d m124976j1() {
        return (C39222d) this.bleHandler.getValue();
    }

    /* JADX INFO: renamed from: k1 */
    private final Map<BluetoothGattCharacteristic, InterfaceC39750a.b> m124977k1() {
        if (this.cmdFromPuffinCharacteristic == null || this.eventFromPuffinCharacteristic == null || this.dataFromPuffinCharacteristic == null) {
            this.logger.mo85222m("Either cmdFromPuffinCharacteristic or eventFromPuffinCharacteristic or dataFromPuffinCharacteristic or all were null. Returning Empty hashmap", new AbstractC30556a.a[0]);
            return C25272z.f99163w;
        }
        HashMap map = new HashMap(4);
        try {
            BluetoothGattCharacteristic bluetoothGattCharacteristic = this.cmdFromPuffinCharacteristic;
            AbstractC22676k.m65748h(bluetoothGattCharacteristic, "null cannot be cast to non-null type android.bluetooth.BluetoothGattCharacteristic");
            map.put(bluetoothGattCharacteristic, this.commandCharacteristicCallback);
            BluetoothGattCharacteristic bluetoothGattCharacteristic2 = this.eventFromPuffinCharacteristic;
            AbstractC22676k.m65748h(bluetoothGattCharacteristic2, "null cannot be cast to non-null type android.bluetooth.BluetoothGattCharacteristic");
            map.put(bluetoothGattCharacteristic2, this.eventCharacteristicCallback);
            BluetoothGattCharacteristic bluetoothGattCharacteristic3 = this.dataFromPuffinCharacteristic;
            AbstractC22676k.m65748h(bluetoothGattCharacteristic3, "null cannot be cast to non-null type android.bluetooth.BluetoothGattCharacteristic");
            map.put(bluetoothGattCharacteristic3, this.dataCharacteristicCallback);
            BluetoothGattCharacteristic bluetoothGattCharacteristic4 = this.memfaultCharacteristic;
            AbstractC22676k.m65748h(bluetoothGattCharacteristic4, "null cannot be cast to non-null type android.bluetooth.BluetoothGattCharacteristic");
            map.put(bluetoothGattCharacteristic4, this.memfaultCharacteristicCallback);
            return map;
        } catch (Exception e5) {
            this.logger.mo85230v("Something went wrong, returning empty HashMap", e5, new AbstractC30556a.a[0]);
            map.clear();
            return map;
        }
    }

    /* JADX INFO: renamed from: m1 */
    private final void m124978m1() {
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public final void m124979n1() {
        this.backgroundUsageAggregator.mo111546m(EnumC35206b.PUFFIN_CONNECTION_EVENT_OCCURRED);
        Map<BluetoothGattCharacteristic, InterfaceC39750a.b> mapM124977k1 = m124977k1();
        this.logger.mo85216g("Puffin Connection Step: 3 Registering for Notifications", new AbstractC30556a.a[0]);
        if (m124976j1().mo100525b(mapM124977k1)) {
            this.logger.mo85216g("Puffin Connection Step: 3 Registered for Notifications", new AbstractC30556a.a[0]);
            AbstractC3006f0.m8732z(this.coroutineScope, null, null, new c(null), 3);
        } else {
            this.logger.mo85222m("Puffin Connection Step: 3 Failed to register for Notifications", new AbstractC30556a.a[0]);
            this.connectionStateManager.m124960e(new AbstractC4250a.e("Failed to register for Notifications"));
            m124981p1(new InterfaceC35208d.d(EnumC32978v.PUFFIN, InterfaceC35208d.b.FAIL, "Puffin Connection Step: 3 Failed to register for Notifications"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0119, code lost:
    
        if (r14 == r3) goto L38;
     */
    /* JADX INFO: renamed from: o1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m124980o1(xj0.AbstractC38334b r12, boolean r13, q83.InterfaceC30057d<? super zj0.C40727h> r14) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y42.C39226h.m124980o1(xj0.b, boolean, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public final void m124981p1(InterfaceC35208d connMetric) {
        this.connectivityAnalytics.mo71178a(connMetric);
    }

    @Override // y42.InterfaceC39219a
    /* JADX INFO: renamed from: A, reason: from getter */
    public InterfaceC13058l getBatteryLevelFlow() {
        return this.batteryLevelFlow;
    }

    @Override // y42.InterfaceC39219a
    /* JADX INFO: renamed from: C */
    public void mo124933C(InterfaceC35208d.c source) {
        AbstractC22676k.m65750j(source, "source");
        this.logger.mo85216g(AbstractC11266d.m30461o("Connecting to Puffin ", this.macAddress), new AbstractC30556a.a[0]);
        m124976j1().mo100530x(this.bluetoothDevice);
        m124981p1(new InterfaceC35208d.a(EnumC32978v.PUFFIN, source));
    }

    @Override // ys0.InterfaceC39750a.a
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: C0 */
    public void mo106372C0(BluetoothDevice bluetoothDevice) {
        AbstractC22676k.m65750j(bluetoothDevice, "bluetoothDevice");
        if (AbstractC22676k.m65745e(bluetoothDevice.getAddress(), this.macAddress)) {
            this.logger.mo85216g(AbstractC31061c.m95640p("OnConnecting to ", this.macAddress, " ", bluetoothDevice.getName()), new AbstractC30556a.a[0]);
            this.connectionStateManager.m124960e(AbstractC4250a.b.f17276a);
        }
    }

    @Override // ys0.InterfaceC39750a.a
    /* JADX INFO: renamed from: F0 */
    public void mo106374F0() {
        this.backgroundUsageAggregator.mo111546m(EnumC35206b.PUFFIN_CONNECTION_EVENT_OCCURRED);
        this.logger.mo85228t("onServicesInvalidated", new AbstractC30556a.a[0]);
    }

    @Override // ys0.InterfaceC39750a.a
    /* JADX INFO: renamed from: L */
    public void mo106376L(BluetoothDevice bluetoothDevice) {
        AbstractC22676k.m65750j(bluetoothDevice, "bluetoothDevice");
        if (AbstractC22676k.m65745e(bluetoothDevice.getAddress(), this.macAddress)) {
            this.backgroundUsageAggregator.mo111546m(EnumC35206b.PUFFIN_CONNECTION_EVENT_OCCURRED);
            this.logger.mo85228t("Puffin Connection Step: 1 BLE Connect Complete", new AbstractC30556a.a[0]);
            this.connectionStateManager.m124960e(AbstractC4250a.a.f17275a);
            this.logger.mo85228t("Puffin Connection Step: 2 Discovering Services...", new AbstractC30556a.a[0]);
            this.connectionStateManager.m124960e(AbstractC4250a.d.f17278a);
            m124976j1().mo100531y(false);
        }
    }

    @Override // y42.InterfaceC39219a
    /* JADX INFO: renamed from: M, reason: from getter */
    public InterfaceC13058l getMemfaultFlow() {
        return this.memfaultFlow;
    }

    @Override // y42.InterfaceC39219a
    /* JADX INFO: renamed from: O */
    public C4253d mo124935O() {
        return (C4253d) ((C13045h2) this.puffinMetaDataStateFlow).getValue();
    }

    @Override // ys0.InterfaceC39750a.a
    /* JADX INFO: renamed from: P */
    public void mo106380P(BluetoothDevice bluetoothDevice) {
        AbstractC22676k.m65750j(bluetoothDevice, "bluetoothDevice");
        if (AbstractC22676k.m65745e(bluetoothDevice.getAddress(), this.macAddress)) {
            this.logger.mo85228t(AbstractC11895b.m31994m(Thread.currentThread().getId(), "Puffin onDisconnecting thread id = "), new AbstractC30556a.a[0]);
        }
    }

    @Override // ys0.InterfaceC39750a.a
    /* JADX INFO: renamed from: V */
    public void mo106384V(BluetoothDevice bluetoothDevice) {
        AbstractC22676k.m65750j(bluetoothDevice, "bluetoothDevice");
        if (AbstractC22676k.m65745e(bluetoothDevice.getAddress(), this.macAddress)) {
            this.logger.mo85228t(AbstractC11895b.m31994m(Thread.currentThread().getId(), "Puffin onDisconnected thread id = "), new AbstractC30556a.a[0]);
            this.cmdFromPuffinCharacteristic = null;
            this.cmdToPuffinCharacteristic = null;
            this.eventFromPuffinCharacteristic = null;
            this.dataFromPuffinCharacteristic = null;
            this.memfaultCharacteristic = null;
            this.backgroundUsageAggregator.mo111546m(EnumC35206b.PUFFIN_CONNECTION_EVENT_OCCURRED);
            this.connectionStateManager.m124960e(AbstractC4250a.c.f17277a);
        }
    }

    @Override // ys0.InterfaceC39750a.a
    /* JADX INFO: renamed from: X0 */
    public void mo106387X0(BluetoothDevice bluetoothDevice, int status, String message) {
        AbstractC22676k.m65750j(bluetoothDevice, "bluetoothDevice");
        AbstractC22676k.m65750j(message, "message");
        if (AbstractC22676k.m65745e(bluetoothDevice.getAddress(), this.macAddress)) {
            this.backgroundUsageAggregator.mo111546m(EnumC35206b.PUFFIN_CONNECTION_EVENT_OCCURRED);
            this.logger.mo85222m(AbstractC31061c.m95640p("Error connecting to Puffin ", this.macAddress, ": ", message), new AbstractC30556a.a[0]);
            this.connectionStateManager.m124960e(new AbstractC4250a.e(message));
        }
    }

    @Override // y42.InterfaceC39219a
    /* JADX INFO: renamed from: a */
    public InterfaceC3018i0 mo124936a(InterfaceC36075a task, InterfaceC32564a executionPriority) {
        AbstractC22676k.m65750j(task, "task");
        AbstractC22676k.m65750j(executionPriority, "executionPriority");
        return this.bleTaskExecutor.mo114576a(task, executionPriority, this, EnumC32978v.PUFFIN);
    }

    @Override // ys0.InterfaceC39750a.a
    /* JADX INFO: renamed from: c */
    public void mo106391c(BluetoothDevice bluetoothDevice) {
        AbstractC22676k.m65750j(bluetoothDevice, "bluetoothDevice");
        if (AbstractC22676k.m65745e(bluetoothDevice.getAddress(), this.macAddress)) {
            this.logger.mo85228t("Puffin onDeviceReady", new AbstractC30556a.a[0]);
            AbstractC3006f0.m8732z(this.coroutineScope, this.threadSafeDispatcher, null, new b(null), 2);
        }
    }

    @Override // ys0.InterfaceC39750a.a
    /* JADX INFO: renamed from: c1 */
    public boolean mo106392c1(List<? extends BluetoothGattService> services) {
        Object next;
        AbstractC22676k.m65750j(services, "services");
        for (BluetoothGattService bluetoothGattService : services) {
            this.logger.mo85219j("Service - " + bluetoothGattService.getUuid(), new AbstractC30556a.a[0]);
            Iterator<T> it = EnumC32978v.INSTANCE.m104090c().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC22676k.m65745e(((EnumC32978v) next).getServiceId(), bluetoothGattService.getUuid()));
            EnumC32978v enumC32978v = (EnumC32978v) next;
            if (enumC32978v != null) {
                this.logger.mo85228t("onAreRequiredServicesSupported found the Puffin Service " + enumC32978v.getServiceId(), new AbstractC30556a.a[0]);
                BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(enumC32978v.getCharCmdToStrap());
                this.cmdToPuffinCharacteristic = characteristic;
                if (characteristic == null) {
                    this.logger.mo85226q("Could not find cmdToPuffin characteristic", new AbstractC30556a.a[0]);
                }
                BluetoothGattCharacteristic characteristic2 = bluetoothGattService.getCharacteristic(enumC32978v.getCharCmdFromStrap());
                this.cmdFromPuffinCharacteristic = characteristic2;
                if (characteristic2 == null) {
                    this.logger.mo85226q("Could not find cmdFromPuffin characteristic", new AbstractC30556a.a[0]);
                }
                BluetoothGattCharacteristic characteristic3 = bluetoothGattService.getCharacteristic(enumC32978v.getCharEventsFromStrap());
                this.eventFromPuffinCharacteristic = characteristic3;
                if (characteristic3 == null) {
                    this.logger.mo85226q("Could not find eventFromPuffin characteristic", new AbstractC30556a.a[0]);
                }
                BluetoothGattCharacteristic characteristic4 = bluetoothGattService.getCharacteristic(enumC32978v.getCharDataFromStrap());
                this.dataFromPuffinCharacteristic = characteristic4;
                if (characteristic4 == null) {
                    this.logger.mo85226q("Could not find dataFromPuffin characteristic", new AbstractC30556a.a[0]);
                }
                BluetoothGattCharacteristic characteristic5 = bluetoothGattService.getCharacteristic(enumC32978v.getCharMemFault());
                this.memfaultCharacteristic = characteristic5;
                if (characteristic5 != null) {
                    return true;
                }
                this.logger.mo85226q("Could not find memfault characteristic for Puffin", new AbstractC30556a.a[0]);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // vk0.InterfaceC36083i
    /* JADX INFO: renamed from: i */
    public Object mo79830i(InterfaceC36081g interfaceC36081g, long j7, boolean z4, InterfaceC30057d<? super C23468n> interfaceC30057d) {
        g gVar;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f168631H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f168631H = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        Object objM8749c = gVar.f168629F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = gVar.f168631H;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM8749c);
                h hVar = new h(interfaceC36081g, z4, null);
                gVar.f168632w = null;
                gVar.f168633x = j7;
                gVar.f168634y = z4;
                gVar.f168635z = 0;
                gVar.f168628E = 0;
                gVar.f168631H = 1;
                objM8749c = AbstractC3028k2.m8749c(j7, hVar, gVar);
                if (objM8749c == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM8749c);
            }
            return (C40727h) objM8749c;
        } catch (CancellationException e5) {
            throw e5;
        } catch (Exception e13) {
            return AbstractC34132o.m107888l(e13);
        }
    }

    /* JADX INFO: renamed from: i1 */
    public void m124982i1() {
        this.logger.mo85216g(AbstractC11266d.m30461o("Disconnecting from Puffin ", this.macAddress), new AbstractC30556a.a[0]);
        m124976j1().mo100526d(this.bluetoothDevice);
    }

    @Override // y42.InterfaceC39219a
    /* JADX INFO: renamed from: l, reason: from getter */
    public InterfaceC13087t1 getConnectionStatus() {
        return this.connectionStatus;
    }

    /* JADX INFO: renamed from: l1 */
    public final void m124983l1() {
        m124978m1();
    }

    @Override // ys0.InterfaceC39750a.a
    /* JADX INFO: renamed from: m */
    public void mo106394m(BluetoothDevice bluetoothDevice) {
        AbstractC22676k.m65750j(bluetoothDevice, "bluetoothDevice");
    }

    @Override // ys0.InterfaceC39750a.a
    /* JADX INFO: renamed from: q */
    public void mo106395q(BluetoothDevice bluetoothDevice) {
        AbstractC22676k.m65750j(bluetoothDevice, "bluetoothDevice");
    }

    @Override // y42.InterfaceC39219a
    /* JADX INFO: renamed from: s, reason: from getter */
    public InterfaceC13058l getDataPacketsFlow() {
        return this.dataPacketsFlow;
    }

    @Override // ys0.InterfaceC39750a.a
    /* JADX INFO: renamed from: v0 */
    public void mo106399v0(BluetoothDevice bluetoothDevice) {
        AbstractC22676k.m65750j(bluetoothDevice, "bluetoothDevice");
    }

    public C39226h(InterfaceC34116n interfaceC34116n, Context context, String str, C39223e c39223e, BluetoothDevice bluetoothDevice, InterfaceC2994c0 interfaceC2994c0, AbstractC3076z abstractC3076z, InterfaceC35209e interfaceC35209e, C40077a c40077a, C40079c c40079c, C40078b c40078b, C40080d c40080d, InterfaceC36076b interfaceC36076b, InterfaceC30585a interfaceC30585a, InterfaceC0422g interfaceC0422g, InterfaceC35205a interfaceC35205a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC34116n.INSTANCE.m107848a("PuffinImpl") : interfaceC34116n, context, str, c39223e, bluetoothDevice, interfaceC2994c0, (i13 & 64) != 0 ? AbstractC3076z.limitedParallelism$default(AbstractC3050q0.f12077a, 1, null, 2, null) : abstractC3076z, interfaceC35209e, c40077a, c40079c, c40078b, c40080d, interfaceC36076b, interfaceC30585a, interfaceC0422g, interfaceC35205a);
    }
}
