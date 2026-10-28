package t92;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PowerManager;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.RunnableC1605m;
import bc3.AbstractC3006f0;
import bc3.AbstractC3028k2;
import bc3.C3033m;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3025k;
import c83.AbstractC4309a;
import c92.C4329a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.ConnectivityFeatureFlagsKt;
import com.whoop.data.repositories.FeatureFlagChecker;
import dk0.AbstractC12109i;
import dk0.C12108h;
import dk0.C12110j;
import dk0.C12111k;
import ec3.InterfaceC13058l;
import g83.AbstractC15583i;
import g83.C15578d;
import g83.C15582h;
import ge3.AbstractC15751g;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import java.time.Instant;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import jy1.C22047a;
import kotlinx.coroutines.TimeoutCancellationException;
import l83.C23454a0;
import l83.C23468n;
import l83.EnumC23463i;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import lr.RunnableC24693e;
import lt0.AbstractC24726c;
import lt0.C24725b;
import lt0.C24736m;
import lt0.InterfaceC24724a;
import m32.InterfaceC25005a;
import m83.C25262p;
import m83.C25272z;
import mk0.EnumC25628a;
import mt0.C25932b;
import mt0.C25933c;
import mt0.C25934d;
import mt0.C25935e;
import mt0.C25936f;
import mt0.C25938h;
import nf3.C26669a;
import nk0.InterfaceC26794a;
import nt0.AbstractC27120h;
import nt0.C27117e;
import of3.InterfaceC27903a;
import or2.C28162g;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p714k80.C22275d;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.TypeCastException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;
import pk0.InterfaceC29333c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import q92.C30069a;
import q92.C30073e;
import q92.C30076h;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import r92.AbstractC31104a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.AbstractC32962f;
import st0.C32958b;
import st0.C32959c;
import st0.C32960d;
import st0.C32961e;
import st0.C32963g;
import st0.C32964h;
import st0.C32965i;
import st0.C32967k;
import st0.C32969m;
import st0.C32970n;
import st0.EnumC32978v;
import st0.InterfaceC32968l;
import tr2.InterfaceC34116n;
import tt0.AbstractC34156a;
import uk0.C35047a;
import us0.EnumC35206b;
import us0.InterfaceC35205a;
import us0.InterfaceC35208d;
import us0.InterfaceC35209e;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import vj0.AbstractC36067b;
import vk0.C36082h;
import vk0.InterfaceC36081g;
import wb3.AbstractC37056f;
import wj0.EnumC37318b;
import xf3.C38266c;
import xj0.AbstractC38334b;
import xj0.C38395z;
import ys0.InterfaceC39750a;
import zj0.C40727h;

/* JADX INFO: renamed from: t92.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u008e\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\b\f*\f\u009c\u0002 \u0002¤\u0002¨\u0002¬\u0002¯\u0002\b&\u0018\u0000 ¸\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004\u0098\u0001¹\u0002BI\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0018H\u0004¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u0018H\u0004¢\u0006\u0004\b\u001f\u0010\u001cJ\u001d\u0010#\u001a\u00020\u00182\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0016¢\u0006\u0004\b#\u0010$J\u001d\u0010%\u001a\u00020\u00182\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0016¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\u0018H\u0016¢\u0006\u0004\b&\u0010\u001cJ\u000f\u0010'\u001a\u00020\u0018H\u0016¢\u0006\u0004\b'\u0010\u001cJ\u0017\u0010*\u001a\u00020\u00182\u0006\u0010)\u001a\u00020(H&¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0004¢\u0006\u0004\b-\u0010.J!\u00104\u001a\u0004\u0018\u0001032\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0017¢\u0006\u0004\b4\u00105J0\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=0<2\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0096@¢\u0006\u0004\b>\u0010?J*\u0010B\u001a\u0004\u0018\u00010=2\u0006\u0010A\u001a\u00020@2\u0006\u00109\u001a\u0002012\u0006\u0010;\u001a\u00020:H\u0097@¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bF\u0010EJ\u0017\u0010G\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bG\u0010EJ\u0017\u0010H\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bH\u0010EJ\u0017\u0010I\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bI\u0010EJ\u0017\u0010J\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bJ\u0010EJ\u0017\u0010K\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bK\u0010EJ'\u0010O\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010L\u001a\u00020(2\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PJ\u001d\u0010T\u001a\u00020:2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020R0QH\u0016¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u00020\u00182\u0006\u0010V\u001a\u00020=H\u0016¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\bY\u0010EJ\u000f\u0010Z\u001a\u00020\u0018H\u0016¢\u0006\u0004\bZ\u0010\u001cJ\u000f\u0010[\u001a\u00020\u0018H\u0002¢\u0006\u0004\b[\u0010\u001cJ\u000f\u0010\\\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\\\u0010\u001cJ\u000f\u0010]\u001a\u00020\u0018H\u0002¢\u0006\u0004\b]\u0010\u001cJ\u000f\u0010^\u001a\u00020\u0018H\u0002¢\u0006\u0004\b^\u0010\u001cJ\u000f\u0010_\u001a\u00020\u0018H\u0002¢\u0006\u0004\b_\u0010\u001cJ\u000f\u0010`\u001a\u00020\u0018H\u0002¢\u0006\u0004\b`\u0010\u001cJ\u0017\u0010b\u001a\u00020\u00182\u0006\u0010a\u001a\u00020!H\u0002¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020\u0018H\u0002¢\u0006\u0004\bd\u0010\u001cJ\u000f\u0010e\u001a\u00020\u0018H\u0002¢\u0006\u0004\be\u0010\u001cJ\"\u0010f\u001a\u0004\u0018\u00010=2\u0006\u00100\u001a\u00020/2\u0006\u0010;\u001a\u00020:H\u0083@¢\u0006\u0004\bf\u0010gJ\u001d\u0010h\u001a\u00020:2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020R0QH\u0002¢\u0006\u0004\bh\u0010UJ\u001b\u0010l\u001a\u000e\u0012\u0004\u0012\u00020j\u0012\u0004\u0012\u00020k0iH\u0002¢\u0006\u0004\bl\u0010mJ\u0019\u0010p\u001a\u0004\u0018\u00010/2\u0006\u0010o\u001a\u00020nH\u0002¢\u0006\u0004\bp\u0010qJ\u0019\u0010s\u001a\u0004\u0018\u00010r2\u0006\u0010o\u001a\u00020nH\u0002¢\u0006\u0004\bs\u0010tJ\u0019\u0010u\u001a\u0004\u0018\u00010r2\u0006\u0010o\u001a\u00020nH\u0002¢\u0006\u0004\bu\u0010tR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010ER\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001e\u0010\u0013\u001a\u00020\u00128\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0017\u0010\u0089\u0001\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R(\u0010\u008f\u0001\u001a\u00020:8\u0004@\u0004X\u0084\u000e¢\u0006\u0017\n\u0005\b4\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0019\u0010\u0091\u0001\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u008a\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001f\u0010\u009a\u0001\u001a\u00020M8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001f\u0010\u009d\u0001\u001a\u00020M8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010\u0097\u0001\u001a\u0006\b\u009c\u0001\u0010\u0099\u0001R\u0018\u0010\u009f\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\bI\u0010\u009e\u0001R\u001c\u0010¤\u0001\u001a\u00030 \u00018\u0006¢\u0006\u000f\n\u0005\b#\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R\u0019\u0010§\u0001\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R \u0010¬\u0001\u001a\u00030¨\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b&\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001R \u0010°\u0001\u001a\u00030\u00ad\u00018DX\u0084\u0084\u0002¢\u0006\u000f\n\u0005\bJ\u0010©\u0001\u001a\u0006\b®\u0001\u0010¯\u0001R!\u0010³\u0001\u001a\u00030\u00ad\u00018DX\u0084\u0084\u0002¢\u0006\u0010\n\u0006\b±\u0001\u0010©\u0001\u001a\u0006\b²\u0001\u0010¯\u0001R!\u0010¶\u0001\u001a\u00030\u00ad\u00018DX\u0084\u0084\u0002¢\u0006\u0010\n\u0006\b´\u0001\u0010©\u0001\u001a\u0006\bµ\u0001\u0010¯\u0001R!\u0010»\u0001\u001a\u00030·\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¸\u0001\u0010©\u0001\u001a\u0006\b¹\u0001\u0010º\u0001R!\u0010À\u0001\u001a\u00030¼\u00018DX\u0084\u0084\u0002¢\u0006\u0010\n\u0006\b½\u0001\u0010©\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001R!\u0010Å\u0001\u001a\u00030Á\u00018DX\u0084\u0084\u0002¢\u0006\u0010\n\u0006\bÂ\u0001\u0010©\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u001f\u0010È\u0001\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bK\u0010©\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001R!\u0010Í\u0001\u001a\u00030É\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÊ\u0001\u0010©\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001R!\u0010Ò\u0001\u001a\u00030Î\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÏ\u0001\u0010©\u0001\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R!\u0010×\u0001\u001a\u00030Ó\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÔ\u0001\u0010©\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001R/\u0010Ý\u0001\u001a\u0012\u0012\r\u0012\u000b Ù\u0001*\u0004\u0018\u00010=0=0Ø\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010Ú\u0001\u001a\u0006\bÛ\u0001\u0010Ü\u0001R1\u0010ä\u0001\u001a\u0014\u0012\u000f\u0012\r Ù\u0001*\u0005\u0018\u00010ß\u00010ß\u00010Þ\u00018\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\bà\u0001\u0010á\u0001\u001a\u0006\bâ\u0001\u0010ã\u0001R&\u0010ê\u0001\u001a\t\u0012\u0004\u0012\u00020!0å\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bæ\u0001\u0010ç\u0001\u001a\u0006\bè\u0001\u0010é\u0001R\u0018\u0010î\u0001\u001a\u00030ë\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bì\u0001\u0010í\u0001R\u0019\u0010ï\u0001\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bè\u0001\u0010\u008a\u0001R8\u0010÷\u0001\u001a\u0005\u0018\u00010ß\u00012\n\u0010ð\u0001\u001a\u0005\u0018\u00010ß\u00018\u0004@DX\u0084\u000e¢\u0006\u0018\n\u0006\bñ\u0001\u0010ò\u0001\u001a\u0006\bó\u0001\u0010ô\u0001\"\u0006\bõ\u0001\u0010ö\u0001R)\u0010þ\u0001\u001a\u00030ø\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0017\n\u0005\b%\u0010ù\u0001\u001a\u0006\bú\u0001\u0010û\u0001\"\u0006\bü\u0001\u0010ý\u0001R\u001b\u0010\u0081\u0002\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÿ\u0001\u0010\u0080\u0002R\u001b\u0010\u0083\u0002\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0002\u0010\u0080\u0002R\u001b\u0010\u0085\u0002\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0002\u0010\u0080\u0002R\u001b\u0010\u0087\u0002\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0002\u0010\u0080\u0002R\u001b\u0010\u0089\u0002\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0002\u0010\u0080\u0002R\u0019\u0010\u008b\u0002\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0002\u0010\u008a\u0001R\u0019\u0010\u008d\u0002\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0002\u0010\u008a\u0001R\u001a\u0010\u0091\u0002\u001a\u00030\u008e\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0002\u0010\u0090\u0002R\u001a\u0010\u0093\u0002\u001a\u00030\u008e\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0002\u0010\u0090\u0002R\u0018\u0010\u0097\u0002\u001a\u00030\u0094\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0002\u0010\u0096\u0002R \u0010\u009b\u0002\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0098\u0002\u0010©\u0001\u001a\u0006\b\u0099\u0002\u0010\u009a\u0002R\u0018\u0010\u009f\u0002\u001a\u00030\u009c\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0002\u0010\u009e\u0002R\u0018\u0010£\u0002\u001a\u00030 \u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0002\u0010¢\u0002R\u0018\u0010§\u0002\u001a\u00030¤\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0002\u0010¦\u0002R\u0018\u0010«\u0002\u001a\u00030¨\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0002\u0010ª\u0002R\u0017\u0010®\u0002\u001a\u00030¬\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bD\u0010\u00ad\u0002R\u0018\u0010²\u0002\u001a\u00030¯\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0002\u0010±\u0002R\u0017\u0010´\u0002\u001a\u00020(8VX\u0096\u0004¢\u0006\b\u001a\u0006\b³\u0002\u0010Ç\u0001R\u0017\u0010·\u0002\u001a\u00020!8VX\u0096\u0004¢\u0006\b\u001a\u0006\bµ\u0002\u0010¶\u0002¨\u0006º\u0002"}, m65681d2 = {"Lt92/b;", "", "Lys0/a$a;", "Lnk0/a$b;", "Lof3/a;", "Landroid/content/Context;", "context", "Landroid/bluetooth/BluetoothDevice;", "bluetoothDevice", "Ljava/lang/Class;", "Lys0/a;", "bleHandlerImpl", "Lq92/h;", "whoopStrapSharedPrefs", "Landroid/os/HandlerThread;", "toStrapThread", "Lin2/d;", "dispatcherFactory", "Lbc3/c0;", "scope", "<init>", "(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Ljava/lang/Class;Lq92/h;Landroid/os/HandlerThread;Lin2/d;Lbc3/c0;)V", "Landroid/os/Handler;", "handler", "Ll83/a0;", "t2", "(Landroid/os/Handler;)V", "k2", "()V", "z1", "A1", "l2", "Lc83/a;", "Lst0/f;", "callback", "M", "(Lc83/a;)V", "f0", "O", "D1", "", "step", "F1", "(I)V", "", "Y1", "()B", "Llt0/c;", "blePacket", "", "delay", "Lnk0/a$a;", "G", "(Llt0/c;J)Lnk0/a$a;", "Lvk0/g;", "task", "Lkotlin/time/Duration;", "timeout", "", "dualResponse", "Ll83/n;", "Lzj0/h;", "i", "(Lvk0/g;JZLq83/d;)Ljava/lang/Object;", "Lxj0/b;", "commandPacket", "E0", "(Lxj0/b;JZLq83/d;)Ljava/lang/Object;", "v0", "(Landroid/bluetooth/BluetoothDevice;)V", "m", "q", "C0", "L", "P", "V", NotificationCompat.CATEGORY_STATUS, "", "message", "X0", "(Landroid/bluetooth/BluetoothDevice;ILjava/lang/String;)V", "", "Landroid/bluetooth/BluetoothGattService;", "services", "c1", "(Ljava/util/List;)Z", "commandResponsePacket", "a2", "(Lzj0/h;)V", "c", "F0", "j2", "w2", "i2", "g2", "m2", "v2", "state", "C1", "(Lst0/f;)V", "Z1", "h2", "p2", "(Llt0/c;ZLq83/d;)Ljava/lang/Object;", "y1", "", "Landroid/bluetooth/BluetoothGattCharacteristic;", "Lys0/a$b;", "I1", "()Ljava/util/Map;", "", "packetBytes", "d2", "([B)Llt0/c;", "Llt0/m;", "f2", "([B)Llt0/m;", "e2", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "x", "Landroid/bluetooth/BluetoothDevice;", "A", "()Landroid/bluetooth/BluetoothDevice;", "setBluetoothDevice", "y", "Lq92/h;", "z", "Landroid/os/HandlerThread;", "E", "Lbc3/c0;", "S1", "()Lbc3/c0;", "F", "Ljava/lang/Object;", "connectionLockObj", "Z", "getConnectionRequestLocked", "()Z", "setConnectionRequestLocked", "(Z)V", "connectionRequestLocked", "H", "forceRediscoverServicesOnConnect", "Ltr2/n;", "I", "Ltr2/n;", "log", "J", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "address", "K", "getName", "name", "Landroid/os/Handler;", "strapHandler", "Lq92/a;", "Lq92/a;", "U1", "()Lq92/a;", "stateMachine", "N", "B", "sequenceNumber", "Liy1/c;", "Ll83/h;", "Q1", "()Liy1/c;", "metricsInteractor", "Lpk0/c;", "J1", "()Lpk0/c;", "commandPacketReader", "Q", "N1", "dataPacketReader", "R", "O1", "eventPacketReader", "Lm32/a;", "S", "R1", "()Lm32/a;", "permissionChecker", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "T", "P1", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lq92/e;", "U", "V1", "()Lq92/e;", "strapSignatureDataStoreHelper", "T1", "()I", "sdkVersion", "Lvk0/h;", "W", "L1", "()Lvk0/h;", "crpDataDogMetrics", "Lus0/e;", "X", "K1", "()Lus0/e;", "connectionAnalyticsHelper", "Lus0/a;", "Y", "G1", "()Lus0/a;", "backgroundUsageAggregator", "Lg83/d;", "kotlin.jvm.PlatformType", "Lg83/d;", "X1", "()Lg83/d;", "whoopStrapCommandCallbacks", "Lg83/i;", "Lmk0/a;", "a0", "Lg83/i;", "M1", "()Lg83/i;", "currentConnectionFailureMessageSubject", "Lec3/l;", "b0", "Lec3/l;", "d0", "()Lec3/l;", "connectionStateFlow", "Lrr2/c;", "c0", "Lrr2/c;", "nonFatalHandler", "recentlyDidForceDiscoverServices", "value", "e0", "Lmk0/a;", "getLatestConnectionError", "()Lmk0/a;", "r2", "(Lmk0/a;)V", "latestConnectionError", "Lst0/v;", "Lst0/v;", "W1", "()Lst0/v;", "s2", "(Lst0/v;)V", "whoopDeviceType", "g0", "Landroid/bluetooth/BluetoothGattCharacteristic;", "cmdToStrapCharacteristic", "h0", "cmdFromStrapCharacteristic", "i0", "eventFromStrapCharacteristic", "j0", "dataFromStrapCharacteristic", "k0", "memfaultCharacteristic", "l0", "isBluetoothReceiverRegistered", "m0", "isIdleModeReceiverRegistered", "Ljava/util/concurrent/atomic/AtomicBoolean;", "n0", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isBluetoothOn", "o0", "isIdleModeOn", "Lc92/a;", "p0", "Lc92/a;", "bluetoothHelper", "q0", "H1", "()Lys0/a;", "bleHandler", "t92/b$c", "r0", "Lt92/b$c;", "bluetoothStateChangeReceiver", "t92/b$h", "s0", "Lt92/b$h;", "idleModeChangeReceiver", "t92/b$d", "t0", "Lt92/b$d;", "cmdFromStrapCharacteristicNotifCallback", "t92/b$g", "u0", "Lt92/b$g;", "eventFromStrapCharacteristicNotifCallback", "t92/b$f", "Lt92/b$f;", "dataFromStrapCharacteristicNotifCallback", "t92/b$i", "w0", "Lt92/b$i;", "memfaultCharacteristicNotificationCallback", "C", "mtu", "getConnectionState", "()Lst0/f;", "connectionState", "x0", "b", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33664b implements InterfaceC32968l, InterfaceC26794a, InterfaceC39750a.a, InterfaceC26794a.b, InterfaceC27903a {

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: y0 */
    private static final Object f140483y0 = new Object();

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final Object connectionLockObj;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private boolean connectionRequestLocked;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private boolean forceRediscoverServicesOnConnect;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC34116n log;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final String address;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private Handler strapHandler;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final C30069a stateMachine;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private byte sequenceNumber;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final InterfaceC23462h metricsInteractor;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final InterfaceC23462h commandPacketReader;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final InterfaceC23462h dataPacketReader;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final InterfaceC23462h eventPacketReader;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private final InterfaceC23462h permissionChecker;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final InterfaceC23462h strapSignatureDataStoreHelper;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private final InterfaceC23462h sdkVersion;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private final InterfaceC23462h crpDataDogMetrics;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private final InterfaceC23462h connectionAnalyticsHelper;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private final InterfaceC23462h backgroundUsageAggregator;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private final C15578d whoopStrapCommandCallbacks;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    private final AbstractC15583i currentConnectionFailureMessageSubject;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    private final InterfaceC13058l connectionStateFlow;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    private final InterfaceC31766c nonFatalHandler;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    private boolean recentlyDidForceDiscoverServices;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    private EnumC25628a latestConnectionError;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    private EnumC32978v whoopDeviceType;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    private BluetoothGattCharacteristic cmdToStrapCharacteristic;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    private BluetoothGattCharacteristic cmdFromStrapCharacteristic;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    private BluetoothGattCharacteristic eventFromStrapCharacteristic;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    private BluetoothGattCharacteristic dataFromStrapCharacteristic;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    private BluetoothGattCharacteristic memfaultCharacteristic;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    private boolean isBluetoothReceiverRegistered;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    private boolean isIdleModeReceiverRegistered;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    private AtomicBoolean isBluetoothOn;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    private AtomicBoolean isIdleModeOn;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    private final C4329a bluetoothHelper;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    private final InterfaceC23462h bleHandler;

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    private final c bluetoothStateChangeReceiver;

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    private final h idleModeChangeReceiver;

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    private final d cmdFromStrapCharacteristicNotifCallback;

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    private final g eventFromStrapCharacteristicNotifCallback;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    private final f dataFromStrapCharacteristicNotifCallback;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    private final i memfaultCharacteristicNotificationCallback;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private BluetoothDevice bluetoothDevice;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C30076h whoopStrapSharedPrefs;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private HandlerThread toStrapThread;

    /* JADX INFO: renamed from: t92.b$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lt92/b$a;", "", "<init>", "()V", "lockObj", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "", "strapHandlerThreadName", "Ljava/lang/String;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Object m106401a() {
            return AbstractC33664b.f140483y0;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: t92.b$b */
    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lt92/b$b;", "Lnk0/a$a;", "Llt0/c;", "blePacket", "Lst0/v;", "strapGen", "<init>", "(Lt92/b;Llt0/c;Lst0/v;)V", "Ll83/a0;", "run", "()V", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public final class b extends InterfaceC26794a.a {

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC33664b f140533z;

        /* JADX INFO: renamed from: t92.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f140534a;

            static {
                int[] iArr = new int[EnumC32978v.values().length];
                try {
                    iArr[EnumC32978v.GEN_4.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC32978v.MAVERICK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC32978v.PUFFIN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC32978v.GOOSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC32978v.MONUMENT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC32978v.SYMPHONY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f140534a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC33664b abstractC33664b, AbstractC24726c blePacket, EnumC32978v strapGen) {
            super(blePacket, strapGen);
            AbstractC22676k.m65750j(blePacket, "blePacket");
            AbstractC22676k.m65750j(strapGen, "strapGen");
            this.f140533z = abstractC33664b;
        }

        @Override // java.lang.Runnable
        public void run() {
            C25932b c25932bM76714a;
            if (getBlePacket() instanceof AbstractC38334b) {
                m79834d(this.f140533z.m106389Y1());
            }
            if (!(getBlePacket() instanceof C38395z) || this.f140533z.m106381P1().isFeatureEnabled(ConnectivityFeatureFlagsKt.DROID_ENABLE_FW_UPDATE_VERBOSE_LOGGING)) {
                this.f140533z.log.mo85216g("outgoing BlePacket: " + getBlePacket() + " with data " + getBlePacket().m72401O(), new AbstractC30556a.a[0]);
            }
            switch (a.f140534a[getStrapGen().ordinal()]) {
                case 1:
                    c25932bM76714a = C25932b.INSTANCE.m76714a(new C25933c(getBlePacket().getPayload()));
                    break;
                case 2:
                    c25932bM76714a = C25932b.INSTANCE.m76714a(new C25935e(getBlePacket().getPayload()));
                    break;
                case 3:
                    c25932bM76714a = C25932b.INSTANCE.m76714a(new C25936f(getBlePacket().getPayload()));
                    break;
                case 4:
                    c25932bM76714a = C25932b.INSTANCE.m76714a(new C25934d(getBlePacket().getPayload()));
                    break;
                case 5:
                case 6:
                    c25932bM76714a = C25932b.INSTANCE.m76714a(new C25938h(getBlePacket().getPayload()));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            this.f140533z.m106324G1().mo111546m(EnumC35206b.OTHER_STRAP_BLUETOOTH_CALLBACK_OCCURRED);
            BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f140533z.cmdToStrapCharacteristic;
            if (bluetoothGattCharacteristic != null) {
                AbstractC33664b abstractC33664b = this.f140533z;
                InterfaceC39750a interfaceC39750aM106325H1 = abstractC33664b.m106325H1();
                byte[] bArrArray = c25932bM76714a.m76710f().array();
                AbstractC22676k.m65748h(bArrArray, "null cannot be cast to non-null type kotlin.ByteArray");
                String str = interfaceC39750aM106325H1.mo100532z(bluetoothGattCharacteristic, bArrArray) ? "successful" : "unsuccessful";
                if (!(getBlePacket() instanceof C38395z) || abstractC33664b.m106381P1().isFeatureEnabled(ConnectivityFeatureFlagsKt.DROID_ENABLE_FW_UPDATE_VERBOSE_LOGGING)) {
                    InterfaceC34116n interfaceC34116n = abstractC33664b.log;
                    C35047a c35047a = C35047a.f148537a;
                    byte[] bArrArray2 = c25932bM76714a.m76710f().array();
                    AbstractC22676k.m65748h(bArrArray2, "null cannot be cast to non-null type kotlin.ByteArray");
                    interfaceC34116n.mo85228t(AbstractC31061c.m95640p("Writing the BlePacket: ", c35047a.m110781a(bArrArray2), " was ", str), new AbstractC30556a.a[0]);
                }
            }
        }
    }

    /* JADX INFO: renamed from: t92.b$c */
    @Metadata(m65680d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"t92/b$c", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Ll83/a0;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(intent, "intent");
            if (intent.getAction() == null) {
                AbstractC33664b.this.log.mo85222m("intent or intent.getAction is null", new AbstractC30556a.a[0]);
                return;
            }
            AbstractC33664b abstractC33664b = AbstractC33664b.this;
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
            if (intExtra == 10) {
                abstractC33664b.log.mo85222m("Bluetooth is switched OFF", new AbstractC30556a.a[0]);
                abstractC33664b.isBluetoothOn.set(false);
            } else {
                if (intExtra != 12) {
                    return;
                }
                abstractC33664b.log.mo85222m("Bluetooth is switched ON", new AbstractC30556a.a[0]);
                abstractC33664b.isBluetoothOn.set(true);
                abstractC33664b.m106351m2();
            }
        }
    }

    /* JADX INFO: renamed from: t92.b$d */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"t92/b$d", "Lys0/a$b;", "", "data", "Ll83/a0;", "a", "([B)V", "", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC39750a.b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String name = "cmdFromStrapCharacteristicNotifCallback";

        public d() {
        }

        @Override // ys0.InterfaceC39750a.b
        /* JADX INFO: renamed from: a */
        public void mo106402a(byte[] data) {
            AbstractC22676k.m65750j(data, "data");
            AbstractC24726c abstractC24726cM106335d2 = AbstractC33664b.this.m106335d2(data);
            if (abstractC24726cM106335d2 instanceof C40727h) {
                AbstractC33664b.this.m106390a2((C40727h) abstractC24726cM106335d2);
            }
        }

        @Override // ys0.InterfaceC39750a.b
        public String getName() {
            return this.name;
        }
    }

    /* JADX INFO: renamed from: t92.b$e */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.gatt.WhoopStrapGatt$createDataDogEvent$1", m100430f = "WhoopStrapGatt.kt", m100431l = {485}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f140538w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC32962f f140540y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC32962f abstractC32962f, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f140540y = abstractC32962f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return AbstractC33664b.this.new e(this.f140540y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f140538w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC21030c interfaceC21030cM106329Q1 = AbstractC33664b.this.m106329Q1();
                C22047a c22047a = new C22047a(0, "connectivity.ble.statemachine.connectionRequestDropped", null, AbstractC37056f.m118958J("State:" + this.f140540y), null, 17, null);
                this.f140538w = 1;
                if (interfaceC21030cM106329Q1.mo58700a(c22047a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: t92.b$f */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"t92/b$f", "Lys0/a$b;", "", "data", "Ll83/a0;", "a", "([B)V", "", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC39750a.b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String name = "dataFromStrapCharacteristicNotifCallback";

        public f() {
        }

        @Override // ys0.InterfaceC39750a.b
        /* JADX INFO: renamed from: a */
        public void mo106402a(byte[] data) {
            AbstractC22676k.m65750j(data, "data");
            C24736m c24736mM106337e2 = AbstractC33664b.this.m106337e2(data);
            if (c24736mM106337e2 != null) {
                AbstractC24726c abstractC24726cM72429b = c24736mM106337e2.getPacket();
                if (abstractC24726cM72429b instanceof AbstractC12109i) {
                    AbstractC33664b.this.mo24737l(c24736mM106337e2);
                    return;
                }
                if (abstractC24726cM72429b instanceof C12111k) {
                    AbstractC33664b abstractC33664b = AbstractC33664b.this;
                    AbstractC24726c abstractC24726cM72429b2 = c24736mM106337e2.getPacket();
                    AbstractC22676k.m65748h(abstractC24726cM72429b2, "null cannot be cast to non-null type com.whoop.ble.packets.datapacket.RealTimeDataPacket");
                    abstractC33664b.mo24706T0((C12111k) abstractC24726cM72429b2);
                    return;
                }
                if (abstractC24726cM72429b instanceof C12108h) {
                    AbstractC33664b abstractC33664b2 = AbstractC33664b.this;
                    AbstractC24726c abstractC24726cM72429b3 = c24736mM106337e2.getPacket();
                    AbstractC22676k.m65748h(abstractC24726cM72429b3, "null cannot be cast to non-null type com.whoop.ble.packets.datapacket.ImuStreamDataPacket");
                    abstractC33664b2.mo24747s((C12108h) abstractC24726cM72429b3);
                    return;
                }
                if (abstractC24726cM72429b instanceof C12110j) {
                    AbstractC33664b abstractC33664b3 = AbstractC33664b.this;
                    AbstractC24726c abstractC24726cM72429b4 = c24736mM106337e2.getPacket();
                    AbstractC22676k.m65748h(abstractC24726cM72429b4, "null cannot be cast to non-null type com.whoop.ble.packets.datapacket.R17LabradorFilteredDataPacket");
                    abstractC33664b3.mo24703R0((C12110j) abstractC24726cM72429b4);
                    return;
                }
                if (!(abstractC24726cM72429b instanceof C24725b)) {
                    AbstractC33664b.this.mo24713Z(c24736mM106337e2);
                    return;
                }
                AbstractC24726c abstractC24726cM72429b5 = c24736mM106337e2.getPacket();
                AbstractC22676k.m65748h(abstractC24726cM72429b5, "null cannot be cast to non-null type com.whoop.connectivityCore.packets.BleDataPacket");
                C24725b c24725b = (C24725b) abstractC24726cM72429b5;
                if (c24725b.m72392U() == 21 && c24725b.m72397Z() == 43) {
                    AbstractC27120h abstractC27120hM81509a = AbstractC27120h.INSTANCE.m81509a(AbstractC33664b.this.getWhoopDeviceType(), c24736mM106337e2, c24725b);
                    AbstractC22676k.m65748h(abstractC27120hM81509a, "null cannot be cast to non-null type com.whoop.connectivityCore.packets.datapacket.rawdata.R21MaverickDatapacket");
                    AbstractC33664b.this.mo24714a0(AbstractC36067b.m114547a((C27117e) abstractC27120hM81509a));
                }
            }
        }

        @Override // ys0.InterfaceC39750a.b
        public String getName() {
            return this.name;
        }
    }

    /* JADX INFO: renamed from: t92.b$g */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"t92/b$g", "Lys0/a$b;", "", "data", "Ll83/a0;", "a", "([B)V", "", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC39750a.b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String name = "eventFromStrapCharacteristicNotifCallback";

        public g() {
        }

        @Override // ys0.InterfaceC39750a.b
        /* JADX INFO: renamed from: a */
        public void mo106402a(byte[] data) {
            AbstractC22676k.m65750j(data, "data");
            C24736m c24736mM106339f2 = AbstractC33664b.this.m106339f2(data);
            if (c24736mM106339f2 != null) {
                AbstractC33664b.this.mo24719c0(c24736mM106339f2);
            }
        }

        @Override // ys0.InterfaceC39750a.b
        public String getName() {
            return this.name;
        }
    }

    /* JADX INFO: renamed from: t92.b$h */
    @Metadata(m65680d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"t92/b$h", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Ll83/a0;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends BroadcastReceiver {
        public h() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Object systemService = context != null ? context.getSystemService("power") : null;
            AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            if (((PowerManager) systemService).isDeviceIdleMode()) {
                AbstractC33664b.this.log.mo85228t("The app is in IDLE Mode!!", new AbstractC30556a.a[0]);
                AbstractC33664b.this.isIdleModeOn.set(true);
            } else {
                AbstractC33664b.this.log.mo85228t("The app is out of IDLE Mode!", new AbstractC30556a.a[0]);
                AbstractC33664b.this.m106351m2();
                AbstractC33664b.this.isIdleModeOn.set(false);
            }
        }
    }

    /* JADX INFO: renamed from: t92.b$i */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"t92/b$i", "Lys0/a$b;", "", "data", "Ll83/a0;", "a", "([B)V", "", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC39750a.b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String name = "memfaultCharacteristicNotificationCallback";

        public i() {
        }

        @Override // ys0.InterfaceC39750a.b
        /* JADX INFO: renamed from: a */
        public void mo106402a(byte[] data) {
            AbstractC22676k.m65750j(data, "data");
            AbstractC33664b.this.mo24733j0(data);
        }

        @Override // ys0.InterfaceC39750a.b
        public String getName() {
            return this.name;
        }
    }

    /* JADX INFO: renamed from: t92.b$j */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.gatt.WhoopStrapGatt$removeInternalCachedDevice$1", m100430f = "WhoopStrapGatt.kt", m100431l = {352}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f140548w;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return AbstractC33664b.this.new j(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f140548w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C30073e c30073eM106385V1 = AbstractC33664b.this.m106385V1();
                this.f140548w = 1;
                if (c30073eM106385V1.m92182b(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: t92.b$k */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.gatt.WhoopStrapGatt", m100430f = "WhoopStrapGatt.kt", m100431l = {628}, m100432m = "sendCommandToStrapSuspend$suspendImpl", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        long f140550E;

        /* JADX INFO: renamed from: F */
        long f140551F;

        /* JADX INFO: renamed from: G */
        boolean f140552G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f140553H;

        /* JADX INFO: renamed from: J */
        int f140555J;

        /* JADX INFO: renamed from: w */
        Object f140556w;

        /* JADX INFO: renamed from: x */
        Object f140557x;

        /* JADX INFO: renamed from: y */
        Object f140558y;

        /* JADX INFO: renamed from: z */
        Object f140559z;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f140553H = obj;
            this.f140555J |= Integer.MIN_VALUE;
            return AbstractC33664b.m106355o2(AbstractC33664b.this, null, 0L, false, this);
        }
    }

    /* JADX INFO: renamed from: t92.b$l */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.gatt.WhoopStrapGatt$sendCommandToStrapSuspend$2", m100430f = "WhoopStrapGatt.kt", m100431l = {629}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lzj0/h;", "<anonymous>", "(Lbc3/c0;)Lzj0/h;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ AbstractC38334b f140560E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ boolean f140561F;

        /* JADX INFO: renamed from: w */
        Object f140562w;

        /* JADX INFO: renamed from: x */
        int f140563x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C22669g0 f140564y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC33664b f140565z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(C22669g0 c22669g0, AbstractC33664b abstractC33664b, AbstractC38334b abstractC38334b, boolean z4, InterfaceC30057d<? super l> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f140564y = c22669g0;
            this.f140565z = abstractC33664b;
            this.f140560E = abstractC38334b;
            this.f140561F = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new l(this.f140564y, this.f140565z, this.f140560E, this.f140561F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C40727h> interfaceC30057d) {
            return ((l) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C22669g0 c22669g0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f140563x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C22669g0 c22669g1 = this.f140564y;
                AbstractC33664b abstractC33664b = this.f140565z;
                AbstractC38334b abstractC38334b = this.f140560E;
                boolean z4 = this.f140561F;
                this.f140562w = c22669g1;
                this.f140563x = 1;
                Object objM106357p2 = abstractC33664b.m106357p2(abstractC38334b, z4, this);
                if (objM106357p2 == enumC31071a) {
                    return enumC31071a;
                }
                c22669g0 = c22669g1;
                obj = objM106357p2;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c22669g0 = (C22669g0) this.f140562w;
                AbstractC34132o.m107864I(obj);
            }
            c22669g0.f89336w = obj;
            return this.f140564y.f89336w;
        }
    }

    /* JADX INFO: renamed from: t92.b$m */
    @Metadata(m65680d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u0005¨\u0006\u000e"}, m65681d2 = {"t92/b$m", "Lc83/a;", "Lzj0/h;", "Ll83/a0;", "a", "()V", "commandResponsePacket", "c", "(Lzj0/h;)V", "", "throwable", "onError", "(Ljava/lang/Throwable;)V", "onComplete", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m extends AbstractC4309a {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC3025k f140566E;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC24726c f140568y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f140569z;

        /* JADX INFO: renamed from: t92.b$m$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f140570a;

            static {
                int[] iArr = new int[EnumC37318b.values().length];
                try {
                    iArr[EnumC37318b.FAILURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC37318b.SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC37318b.UNSUPPORTED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC37318b.PENDING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f140570a = iArr;
            }
        }

        public m(AbstractC24726c abstractC24726c, boolean z4, InterfaceC3025k interfaceC3025k) {
            this.f140568y = abstractC24726c;
            this.f140569z = z4;
            this.f140566E = interfaceC3025k;
        }

        @Override // c83.AbstractC4309a
        /* JADX INFO: renamed from: a */
        public void mo13590a() {
            InterfaceC26794a.m79826Q0(AbstractC33664b.this, this.f140568y, 0L, 2, null);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0036  */
        @Override // l73.InterfaceC23413d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(C40727h commandResponsePacket) {
            boolean z4;
            AbstractC22676k.m65750j(commandResponsePacket, "commandResponsePacket");
            boolean z13 = this.f140568y.mo72387N() == commandResponsePacket.m132195T();
            if (commandResponsePacket.m132195T() == 0) {
                AbstractC24726c abstractC24726c = this.f140568y;
                if ((abstractC24726c instanceof AbstractC38334b) && ((AbstractC38334b) abstractC24726c).mo114594s(AbstractC33664b.this.getWhoopDeviceType()) == commandResponsePacket.m132193Q()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else {
                z4 = false;
            }
            if (!z13 && z4) {
                AbstractC33664b.this.log.mo85226q("Seq#0 workaround: matched by command type instead of sequence number for " + commandResponsePacket.m132193Q(), new AbstractC30556a.a[0]);
            }
            if (z13 || z4) {
                AbstractC24726c abstractC24726c2 = this.f140568y;
                if ((abstractC24726c2 instanceof AbstractC38334b) && ((AbstractC38334b) abstractC24726c2).mo114594s(AbstractC33664b.this.getWhoopDeviceType()) != commandResponsePacket.m132193Q()) {
                    AbstractC33664b.this.log.mo85222m("sendCommandToStrapWithTimeout found ERRONEOUSLY MATCHING COMMAND NUMBERS to CommandNumbers: [" + ((AbstractC38334b) this.f140568y).mo114594s(AbstractC33664b.this.getWhoopDeviceType()) + " | " + commandResponsePacket.m132193Q() + "]", new AbstractC30556a.a[0]);
                    AbstractC33664b.this.log.mo85228t("Disposing the whoopStrapCommandCallbacks subscription", new AbstractC30556a.a[0]);
                    dispose();
                    return;
                }
                AbstractC33664b.this.log.mo85228t(AbstractC2875y.m8295h(this.f140568y.mo72387N(), "sendCommandToStrapWithTimeout matched sequenceNumber "), new AbstractC30556a.a[0]);
                if (!this.f140569z) {
                    this.f140566E.resumeWith(commandResponsePacket);
                    dispose();
                    return;
                }
                int i13 = a.f140570a[commandResponsePacket.m132197V().ordinal()];
                if (i13 == 1 || i13 == 2 || i13 == 3) {
                    this.f140566E.resumeWith(commandResponsePacket);
                    dispose();
                } else if (i13 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }

        @Override // l73.InterfaceC23413d
        public void onComplete() {
            this.f140566E.resumeWith(null);
            dispose();
        }

        @Override // l73.InterfaceC23413d
        public void onError(Throwable throwable) {
            AbstractC22676k.m65750j(throwable, "throwable");
            this.f140566E.cancel(throwable);
            dispose();
        }
    }

    /* JADX INFO: renamed from: t92.b$n */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.gatt.WhoopStrapGatt", m100430f = "WhoopStrapGatt.kt", m100431l = {578}, m100432m = "sendTaskAndAwaitResponse-JXpvp54$suspendImpl", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f140571E;

        /* JADX INFO: renamed from: F */
        int f140572F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f140573G;

        /* JADX INFO: renamed from: I */
        int f140575I;

        /* JADX INFO: renamed from: w */
        Object f140576w;

        /* JADX INFO: renamed from: x */
        Object f140577x;

        /* JADX INFO: renamed from: y */
        long f140578y;

        /* JADX INFO: renamed from: z */
        boolean f140579z;

        public n(InterfaceC30057d<? super n> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f140573G = obj;
            this.f140575I |= Integer.MIN_VALUE;
            Object objM106359q2 = AbstractC33664b.m106359q2(AbstractC33664b.this, null, 0L, false, this);
            return objM106359q2 == EnumC31071a.f128113w ? objM106359q2 : new C23468n(objM106359q2);
        }
    }

    /* JADX INFO: renamed from: t92.b$o */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class o extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f140580w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f140581x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f140582y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f140580w = interfaceC27903a;
            this.f140581x = interfaceC35951a;
            this.f140582y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, us0.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC35205a invoke() {
            InterfaceC27903a interfaceC27903a = this.f140580w;
            InterfaceC35951a interfaceC35951a = this.f140581x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f140582y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC35205a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: t92.b$p */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class p extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f140583w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f140584x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f140585y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f140583w = interfaceC27903a;
            this.f140584x = interfaceC35951a;
            this.f140585y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [iy1.c, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21030c invoke() {
            InterfaceC27903a interfaceC27903a = this.f140583w;
            InterfaceC35951a interfaceC35951a = this.f140584x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f140585y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21030c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: t92.b$q */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class q extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f140586w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f140587x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f140588y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f140586w = interfaceC27903a;
            this.f140587x = interfaceC35951a;
            this.f140588y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, pk0.c] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC29333c invoke() {
            InterfaceC27903a interfaceC27903a = this.f140586w;
            InterfaceC35951a interfaceC35951a = this.f140587x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f140588y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC29333c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: t92.b$r */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class r extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f140589w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f140590x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f140591y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f140589w = interfaceC27903a;
            this.f140590x = interfaceC35951a;
            this.f140591y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, pk0.c] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC29333c invoke() {
            InterfaceC27903a interfaceC27903a = this.f140589w;
            InterfaceC35951a interfaceC35951a = this.f140590x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f140591y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC29333c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: t92.b$s */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class s extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f140592w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f140593x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f140594y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f140592w = interfaceC27903a;
            this.f140593x = interfaceC35951a;
            this.f140594y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, pk0.c] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC29333c invoke() {
            InterfaceC27903a interfaceC27903a = this.f140592w;
            InterfaceC35951a interfaceC35951a = this.f140593x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f140594y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC29333c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: t92.b$t */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class t extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f140595w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f140596x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f140597y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f140595w = interfaceC27903a;
            this.f140596x = interfaceC35951a;
            this.f140597y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, m32.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC25005a invoke() {
            InterfaceC27903a interfaceC27903a = this.f140595w;
            InterfaceC35951a interfaceC35951a = this.f140596x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f140597y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC25005a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: t92.b$u */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class u extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f140598w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f140599x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f140600y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f140598w = interfaceC27903a;
            this.f140599x = interfaceC35951a;
            this.f140600y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            InterfaceC27903a interfaceC27903a = this.f140598w;
            InterfaceC35951a interfaceC35951a = this.f140599x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f140600y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: t92.b$v */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class v extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f140601w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f140602x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f140603y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f140601w = interfaceC27903a;
            this.f140602x = interfaceC35951a;
            this.f140603y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, q92.e] */
        @Override // c93.InterfaceC4339a
        public final C30073e invoke() {
            InterfaceC27903a interfaceC27903a = this.f140601w;
            InterfaceC35951a interfaceC35951a = this.f140602x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f140603y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C30073e.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: t92.b$w */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class w extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f140604w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f140605x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f140606y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f140604w = interfaceC27903a;
            this.f140605x = interfaceC35951a;
            this.f140606y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, vk0.h] */
        @Override // c93.InterfaceC4339a
        public final C36082h invoke() {
            InterfaceC27903a interfaceC27903a = this.f140604w;
            InterfaceC35951a interfaceC35951a = this.f140605x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f140606y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C36082h.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: t92.b$x */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class x extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f140607w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f140608x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f140609y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f140607w = interfaceC27903a;
            this.f140608x = interfaceC35951a;
            this.f140609y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, us0.e] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC35209e invoke() {
            InterfaceC27903a interfaceC27903a = this.f140607w;
            InterfaceC35951a interfaceC35951a = this.f140608x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f140609y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC35209e.class), interfaceC35951a);
        }
    }

    public AbstractC33664b(Context context, BluetoothDevice bluetoothDevice, Class<? extends InterfaceC39750a> bleHandlerImpl, C30076h whoopStrapSharedPrefs, HandlerThread toStrapThread, InterfaceC18732d dispatcherFactory, InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(bluetoothDevice, "bluetoothDevice");
        AbstractC22676k.m65750j(bleHandlerImpl, "bleHandlerImpl");
        AbstractC22676k.m65750j(whoopStrapSharedPrefs, "whoopStrapSharedPrefs");
        AbstractC22676k.m65750j(toStrapThread, "toStrapThread");
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        AbstractC22676k.m65750j(scope, "scope");
        this.context = context;
        this.bluetoothDevice = bluetoothDevice;
        this.whoopStrapSharedPrefs = whoopStrapSharedPrefs;
        this.toStrapThread = toStrapThread;
        this.scope = scope;
        this.connectionLockObj = new Object();
        this.log = InterfaceC34116n.INSTANCE.m107848a("WhoopStrapGatt");
        String address = this.bluetoothDevice.getAddress();
        AbstractC22676k.m65749i(address, "getAddress(...)");
        this.address = address;
        this.name = AbstractC34156a.m107933a(this.bluetoothDevice);
        C30069a c30069a = C30069a.f122700w;
        this.stateMachine = c30069a;
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.metricsInteractor = AbstractC30060g.m92087G(enumC23463i, new p(this, null, null));
        this.commandPacketReader = AbstractC30060g.m92087G(enumC23463i, new q(this, null, null));
        this.dataPacketReader = AbstractC30060g.m92087G(enumC23463i, new r(this, null, null));
        this.eventPacketReader = AbstractC30060g.m92087G(enumC23463i, new s(this, null, null));
        this.permissionChecker = AbstractC30060g.m92087G(enumC23463i, new t(this, null, null));
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i, new u(this, null, null));
        this.strapSignatureDataStoreHelper = AbstractC30060g.m92087G(enumC23463i, new v(this, null, null));
        this.sdkVersion = AbstractC30060g.m92088H(new C25262p(this, 14));
        this.crpDataDogMetrics = AbstractC30060g.m92087G(enumC23463i, new w(this, null, null));
        this.connectionAnalyticsHelper = AbstractC30060g.m92087G(enumC23463i, new x(this, null, null));
        this.backgroundUsageAggregator = AbstractC30060g.m92087G(enumC23463i, new o(this, null, null));
        this.whoopStrapCommandCallbacks = new C15578d();
        this.currentConnectionFailureMessageSubject = new C15582h(new C15578d());
        this.connectionStateFlow = c30069a.m92162e();
        C38266c c38266c = getKoin().f106046a.f159364d;
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        this.nonFatalHandler = (InterfaceC31766c) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null);
        this.whoopDeviceType = EnumC32978v.GEN_4;
        this.isBluetoothOn = new AtomicBoolean(true);
        this.isIdleModeOn = new AtomicBoolean(false);
        this.bluetoothHelper = (C4329a) getKoin().f106046a.f159364d.m122602a(null, c22673i0.getOrCreateKotlinClass(C4329a.class), null);
        this.bleHandler = AbstractC30060g.m92088H(new C22275d(9, this, bleHandlerImpl));
        this.bluetoothStateChangeReceiver = new c();
        this.idleModeChangeReceiver = new h();
        this.cmdFromStrapCharacteristicNotifCallback = new d();
        this.eventFromStrapCharacteristicNotifCallback = new g();
        this.dataFromStrapCharacteristicNotifCallback = new f();
        this.memfaultCharacteristicNotificationCallback = new i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B1 */
    public static final void m106321B1(AbstractC33664b abstractC33664b) {
        abstractC33664b.log.mo85216g(AbstractC2875y.m8296i(System.identityHashCode(abstractC33664b), "(", ") WhoopStrapGatt object"), new AbstractC30556a.a[0]);
        AbstractC32962f abstractC32962fM92165k = abstractC33664b.stateMachine.m92165k();
        if (AbstractC22676k.m65745e(abstractC32962fM92165k, C32963g.f137291a) || (abstractC32962fM92165k instanceof C32965i)) {
            abstractC33664b.log.mo85216g("Connection Step: --- CONNECT_ASYNC_PAIR_SYNC_REG_SYNC ---", new AbstractC30556a.a[0]);
            abstractC33664b.m106332Z1();
            return;
        }
        abstractC33664b.log.mo85216g("Received command to connect, but connection state is " + abstractC32962fM92165k + ". Connection attempt cancelled.", new AbstractC30556a.a[0]);
        abstractC33664b.m106322C1(abstractC32962fM92165k);
    }

    /* JADX INFO: renamed from: C1 */
    private final void m106322C1(AbstractC32962f state) {
        AbstractC3006f0.m8732z(this.scope, null, null, new e(state, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E1 */
    public static final void m106323E1(AbstractC33664b abstractC33664b) {
        abstractC33664b.m106325H1().mo100526d(abstractC33664b.bluetoothDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G1 */
    public final InterfaceC35205a m106324G1() {
        return (InterfaceC35205a) this.backgroundUsageAggregator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H1 */
    public final InterfaceC39750a m106325H1() {
        return (InterfaceC39750a) this.bleHandler.getValue();
    }

    /* JADX INFO: renamed from: I1 */
    private final Map<BluetoothGattCharacteristic, InterfaceC39750a.b> m106326I1() {
        if (this.cmdFromStrapCharacteristic == null || this.eventFromStrapCharacteristic == null || this.dataFromStrapCharacteristic == null) {
            this.log.mo85222m("Either cmdFromStrapCharacteristic or eventFromStrapCharacteristic or dataFromStrapCharacteristic or all were null. Returning Empty hashmap", new AbstractC30556a.a[0]);
            return C25272z.f99163w;
        }
        HashMap map = new HashMap(3);
        try {
            BluetoothGattCharacteristic bluetoothGattCharacteristic = this.cmdFromStrapCharacteristic;
            AbstractC22676k.m65748h(bluetoothGattCharacteristic, "null cannot be cast to non-null type android.bluetooth.BluetoothGattCharacteristic");
            map.put(bluetoothGattCharacteristic, this.cmdFromStrapCharacteristicNotifCallback);
            BluetoothGattCharacteristic bluetoothGattCharacteristic2 = this.eventFromStrapCharacteristic;
            AbstractC22676k.m65748h(bluetoothGattCharacteristic2, "null cannot be cast to non-null type android.bluetooth.BluetoothGattCharacteristic");
            map.put(bluetoothGattCharacteristic2, this.eventFromStrapCharacteristicNotifCallback);
            BluetoothGattCharacteristic bluetoothGattCharacteristic3 = this.dataFromStrapCharacteristic;
            AbstractC22676k.m65748h(bluetoothGattCharacteristic3, "null cannot be cast to non-null type android.bluetooth.BluetoothGattCharacteristic");
            map.put(bluetoothGattCharacteristic3, this.dataFromStrapCharacteristicNotifCallback);
            BluetoothGattCharacteristic bluetoothGattCharacteristic4 = this.memfaultCharacteristic;
            if (bluetoothGattCharacteristic4 == null) {
                this.log.mo85222m("Memfault characteristic is null!", new AbstractC30556a.a[0]);
                return map;
            }
            AbstractC22676k.m65748h(bluetoothGattCharacteristic4, "null cannot be cast to non-null type android.bluetooth.BluetoothGattCharacteristic");
            map.put(bluetoothGattCharacteristic4, this.memfaultCharacteristicNotificationCallback);
            return map;
        } catch (TypeCastException e5) {
            this.log.mo85230v("Caught a type cast exception, returning empty HashMap", e5, new AbstractC30556a.a[0]);
            map.clear();
            return map;
        } catch (Exception e13) {
            this.log.mo85230v("Something went wrong, returning empty HashMap", e13, new AbstractC30556a.a[0]);
            map.clear();
            return map;
        }
    }

    /* JADX INFO: renamed from: K1 */
    private final InterfaceC35209e m106327K1() {
        return (InterfaceC35209e) this.connectionAnalyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: L1 */
    private final C36082h m106328L1() {
        return (C36082h) this.crpDataDogMetrics.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q1 */
    public final InterfaceC21030c m106329Q1() {
        return (InterfaceC21030c) this.metricsInteractor.getValue();
    }

    /* JADX INFO: renamed from: R1 */
    private final InterfaceC25005a m106330R1() {
        return (InterfaceC25005a) this.permissionChecker.getValue();
    }

    /* JADX INFO: renamed from: T1 */
    private final int m106331T1() {
        return ((Number) this.sdkVersion.getValue()).intValue();
    }

    /* JADX INFO: renamed from: Z1 */
    private final void m106332Z1() {
        this.log.mo85216g("Connection Step: 1 BLE Asynchronous Connect Starting...", new AbstractC30556a.a[0]);
        m106396r2(null);
        m106325H1().mo100530x(this.bluetoothDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public static final void m106333b2(AbstractC33664b abstractC33664b) {
        abstractC33664b.m106343h2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public static final void m106334c2(AbstractC33664b abstractC33664b, BluetoothDevice bluetoothDevice) {
        abstractC33664b.log.mo85216g("Connection Step: 3 BLE Bonding Starting...", new AbstractC30556a.a[0]);
        if (!abstractC33664b.m106325H1().mo100524a(bluetoothDevice)) {
            abstractC33664b.m106396r2(EnumC25628a.BLE_BONDING_FAILED);
        } else {
            abstractC33664b.log.mo85216g("Connection Step: 3 BLE Bonding Complete", new AbstractC30556a.a[0]);
            abstractC33664b.m106343h2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public final AbstractC24726c m106335d2(byte[] packetBytes) {
        m106324G1().mo111546m(EnumC35206b.STRAP_PACKET_RECEIVED);
        C24736m c24736mMo89258a = m106375J1().mo89258a(packetBytes, this.whoopDeviceType);
        if (c24736mMo89258a != null) {
            return c24736mMo89258a.getPacket();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public final C24736m m106337e2(byte[] packetBytes) {
        m106324G1().mo111546m(EnumC35206b.STRAP_PACKET_RECEIVED);
        return m106378N1().mo89258a(packetBytes, this.whoopDeviceType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f2 */
    public final C24736m m106339f2(byte[] packetBytes) {
        m106324G1().mo111546m(EnumC35206b.STRAP_PACKET_RECEIVED);
        return m106379O1().mo89258a(packetBytes, this.whoopDeviceType);
    }

    /* JADX INFO: renamed from: g2 */
    private final void m106341g2() {
        try {
            this.log.mo85228t("Registering for Bluetooth State Change receiver in WhoopStrapGatt class", new AbstractC30556a.a[0]);
            this.context.registerReceiver(this.bluetoothStateChangeReceiver, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
            this.isBluetoothReceiverRegistered = true;
        } catch (Exception unused) {
            this.isBluetoothReceiverRegistered = false;
            this.log.mo85222m("Something went wrong when trying to register for BluetoothStateChangeReceiver", new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: h2 */
    private final void m106343h2() {
        Map<BluetoothGattCharacteristic, InterfaceC39750a.b> mapM106326I1 = m106326I1();
        this.log.mo85216g("Connection Step: 4  BLE Characteristic Notification Registration Starting...", new AbstractC30556a.a[0]);
        m106324G1().mo111546m(EnumC35206b.STRAP_CONNECTION_EVENT_OCCURRED);
        if (!m106325H1().mo100525b(mapM106326I1)) {
            m106396r2(mapM106326I1.isEmpty() ? EnumC25628a.CHARACTERISTIC_NOTIFICATIONS_EMPTY : EnumC25628a.CHARACTERISTIC_NOTIFICATIONS_FAILED);
            return;
        }
        this.log.mo85216g("Connection Step: 4 BLE Characteristic Notification Registration Complete", new AbstractC30556a.a[0]);
        try {
            this.log.mo85216g("Thread.sleep(500)", new AbstractC30556a.a[0]);
            Thread.sleep(500L);
        } catch (InterruptedException e5) {
            InterfaceC34116n interfaceC34116n = this.log;
            e5.printStackTrace();
            interfaceC34116n.mo85222m("Thread was interrupted during sleep: " + C23454a0.f92919a + "!", new AbstractC30556a.a[0]);
        }
        if (this.recentlyDidForceDiscoverServices) {
            this.recentlyDidForceDiscoverServices = false;
        } else {
            mo24689F1(5);
        }
    }

    /* JADX INFO: renamed from: i2 */
    private final void m106345i2() {
        try {
            this.log.mo85228t("Registering for IDLE Mode change receiver in WhoopStrapGatt class", new AbstractC30556a.a[0]);
            this.context.registerReceiver(this.idleModeChangeReceiver, new IntentFilter("android.os.action.DEVICE_IDLE_MODE_CHANGED"));
            this.isIdleModeReceiverRegistered = true;
        } catch (Exception unused) {
            this.isIdleModeReceiverRegistered = false;
            this.log.mo85222m("Something went wrong when trying to register receiver for Idle mode!", new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: j2 */
    private final void m106347j2() {
        if (!this.isBluetoothReceiverRegistered) {
            m106341g2();
        }
        if (this.isIdleModeReceiverRegistered) {
            return;
        }
        m106345i2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m2 */
    public final void m106351m2() {
        this.log.mo85228t("Resetting BLE State Machine's timeout property", new AbstractC30556a.a[0]);
        this.stateMachine.m92167p(false);
        this.stateMachine.m92168q(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n2 */
    public static final int m106353n2(AbstractC33664b abstractC33664b) {
        return ((C28162g) abstractC33664b.getKoin().f106046a.f159364d.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28162g.class), null)).getSdkInt();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:50:0x0104  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @InterfaceC23457c
    /* JADX INFO: renamed from: o2 */
    public static Object m106355o2(AbstractC33664b abstractC33664b, AbstractC38334b abstractC38334b, long j7, boolean z4, InterfaceC30057d<? super C40727h> interfaceC30057d) throws Throwable {
        k kVar;
        C22669g0 c22669g0;
        String str;
        long j13;
        AbstractC33664b abstractC33664b2 = abstractC33664b;
        if (interfaceC30057d instanceof k) {
            kVar = (k) interfaceC30057d;
            int i13 = kVar.f140555J;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                kVar.f140555J = i13 - Integer.MIN_VALUE;
            } else {
                kVar = abstractC33664b2.new k(interfaceC30057d);
            }
        } else {
            kVar = abstractC33664b2.new k(interfaceC30057d);
        }
        k kVar2 = kVar;
        Object objM8748b = kVar2.f140553H;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = kVar2.f140555J;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8748b);
            InterfaceC24724a interfaceC24724aMo114594s = abstractC38334b.mo114594s(abstractC33664b2.whoopDeviceType);
            String strCommandName = interfaceC24724aMo114594s != null ? interfaceC24724aMo114594s.commandName() : null;
            if (strCommandName == null) {
                strCommandName = "";
            }
            String str2 = strCommandName;
            C22669g0 c22669g1 = new C22669g0();
            long epochMilli = Instant.now().toEpochMilli();
            try {
                abstractC33664b2.m106328L1().m114603i(str2, abstractC33664b2.whoopDeviceType);
                l lVar = new l(c22669g1, abstractC33664b2, abstractC38334b, z4, null);
                kVar2.f140556w = abstractC33664b2;
                kVar2.f140557x = null;
                kVar2.f140558y = str2;
                kVar2.f140559z = c22669g1;
                kVar2.f140550E = j7;
                kVar2.f140552G = z4;
                kVar2.f140551F = epochMilli;
                kVar2.f140555J = 1;
                objM8748b = AbstractC3028k2.m8748b(j7, lVar, kVar2);
                if (objM8748b == enumC31071a) {
                    return enumC31071a;
                }
                c22669g0 = c22669g1;
                str = str2;
                j13 = epochMilli;
                C40727h c40727h = (C40727h) objM8748b;
                C36082h c36082hM106328L1 = abstractC33664b2.m106328L1();
                C40727h c40727h2 = (C40727h) c22669g0.f89336w;
                c36082hM106328L1.m114602h(str, c40727h2 != null ? c40727h2.m132198W() : false, j13, Instant.now().toEpochMilli(), abstractC33664b2.whoopDeviceType);
                return c40727h;
            } catch (TimeoutCancellationException unused) {
                c22669g0 = c22669g1;
                str = str2;
                j13 = epochMilli;
            } catch (Throwable th3) {
                th = th3;
                c22669g0 = c22669g1;
                str = str2;
                j13 = epochMilli;
                C36082h c36082hM106328L2 = abstractC33664b2.m106328L1();
                C40727h c40727h3 = (C40727h) c22669g0.f89336w;
                c36082hM106328L2.m114602h(str, c40727h3 != null ? c40727h3.m132198W() : false, j13, Instant.now().toEpochMilli(), abstractC33664b2.whoopDeviceType);
                throw th;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j14 = kVar2.f140551F;
            c22669g0 = (C22669g0) kVar2.f140559z;
            str = (String) kVar2.f140558y;
            AbstractC33664b abstractC33664b3 = (AbstractC33664b) kVar2.f140556w;
            try {
                AbstractC34132o.m107864I(objM8748b);
                j13 = j14;
                abstractC33664b2 = abstractC33664b3;
                try {
                    try {
                        C40727h c40727h4 = (C40727h) objM8748b;
                        C36082h c36082hM106328L3 = abstractC33664b2.m106328L1();
                        C40727h c40727h5 = (C40727h) c22669g0.f89336w;
                        c36082hM106328L3.m114602h(str, c40727h5 != null ? c40727h5.m132198W() : false, j13, Instant.now().toEpochMilli(), abstractC33664b2.whoopDeviceType);
                        return c40727h4;
                    } catch (TimeoutCancellationException unused2) {
                        abstractC33664b2.m106328L1().m114604j(str, abstractC33664b2.whoopDeviceType);
                        C36082h c36082hM106328L4 = abstractC33664b2.m106328L1();
                        C40727h c40727h6 = (C40727h) c22669g0.f89336w;
                        c36082hM106328L4.m114602h(str, c40727h6 != null ? c40727h6.m132198W() : false, j13, Instant.now().toEpochMilli(), abstractC33664b2.whoopDeviceType);
                        return null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    C36082h c36082hM106328L5 = abstractC33664b2.m106328L1();
                    C40727h c40727h7 = (C40727h) c22669g0.f89336w;
                    c36082hM106328L5.m114602h(str, c40727h7 != null ? c40727h7.m132198W() : false, j13, Instant.now().toEpochMilli(), abstractC33664b2.whoopDeviceType);
                    throw th;
                }
            } catch (TimeoutCancellationException unused3) {
                j13 = j14;
                abstractC33664b2 = abstractC33664b3;
            } catch (Throwable th5) {
                th = th5;
                j13 = j14;
                abstractC33664b2 = abstractC33664b3;
                C36082h c36082hM106328L6 = abstractC33664b2.m106328L1();
                C40727h c40727h8 = (C40727h) c22669g0.f89336w;
                c36082hM106328L6.m114602h(str, c40727h8 != null ? c40727h8.m132198W() : false, j13, Instant.now().toEpochMilli(), abstractC33664b2.whoopDeviceType);
                throw th;
            }
        }
        abstractC33664b2.m106328L1().m114604j(str, abstractC33664b2.whoopDeviceType);
        C36082h c36082hM106328L7 = abstractC33664b2.m106328L1();
        C40727h c40727h9 = (C40727h) c22669g0.f89336w;
        c36082hM106328L7.m114602h(str, c40727h9 != null ? c40727h9.m132198W() : false, j13, Instant.now().toEpochMilli(), abstractC33664b2.whoopDeviceType);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: p2 */
    public final Object m106357p2(AbstractC24726c abstractC24726c, boolean z4, InterfaceC30057d<? super C40727h> interfaceC30057d) {
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        getWhoopStrapCommandCallbacks().m67905c(new m(abstractC24726c, z4, c3033m));
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: q2 */
    public static Object m106359q2(AbstractC33664b abstractC33664b, InterfaceC36081g interfaceC36081g, long j7, boolean z4, InterfaceC30057d<? super C23468n> interfaceC30057d) {
        n nVar;
        if (interfaceC30057d instanceof n) {
            nVar = (n) interfaceC30057d;
            int i13 = nVar.f140575I;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                nVar.f140575I = i13 - Integer.MIN_VALUE;
            } else {
                nVar = abstractC33664b.new n(interfaceC30057d);
            }
        } else {
            nVar = abstractC33664b.new n(interfaceC30057d);
        }
        n nVar2 = nVar;
        Object objMo79828E0 = nVar2.f140573G;
        Object obj = EnumC31071a.f128113w;
        int i14 = nVar2.f140575I;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objMo79828E0);
                AbstractC22676k.m65748h(interfaceC36081g, "null cannot be cast to non-null type com.whoop.ble.packets.commandpackets.CommandPacket");
                long jM134273getInWholeMillisecondsimpl = Duration.m134273getInWholeMillisecondsimpl(j7);
                nVar2.f140576w = null;
                nVar2.f140577x = null;
                nVar2.f140578y = j7;
                nVar2.f140579z = z4;
                nVar2.f140571E = 0;
                nVar2.f140572F = 0;
                nVar2.f140575I = 1;
                objMo79828E0 = abstractC33664b.mo79828E0((AbstractC38334b) interfaceC36081g, jM134273getInWholeMillisecondsimpl, z4, nVar2);
                if (objMo79828E0 == obj) {
                    return obj;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objMo79828E0);
            }
            return (C40727h) objMo79828E0;
        } catch (CancellationException e5) {
            throw e5;
        } catch (Exception e13) {
            return AbstractC34132o.m107888l(e13);
        }
    }

    /* JADX INFO: renamed from: u2 */
    public static /* synthetic */ void m106364u2(AbstractC33664b abstractC33664b, Handler handler, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
        }
        if ((i13 & 1) != 0) {
            handler = null;
        }
        abstractC33664b.m106398t2(handler);
    }

    /* JADX INFO: renamed from: v2 */
    private final void m106366v2() {
        this.log.mo85216g("Removing callbacks and messages from current strap handler}", new AbstractC30556a.a[0]);
        Handler handler = this.strapHandler;
        if (handler == null) {
            AbstractC22676k.m65757q("strapHandler");
            throw null;
        }
        handler.removeCallbacksAndMessages(null);
        InterfaceC34116n interfaceC34116n = this.log;
        StringBuilder sbM32000s = AbstractC11895b.m32000s("Quitting the ", this.toStrapThread.getName(), this.toStrapThread.getId(), " (");
        sbM32000s.append(") thread");
        interfaceC34116n.mo85216g(sbM32000s.toString(), new AbstractC30556a.a[0]);
        this.toStrapThread.quit();
        InterfaceC34116n interfaceC34116n2 = this.log;
        StringBuilder sbM32000s2 = AbstractC11895b.m32000s(".quit() successful on ", this.toStrapThread.getName(), this.toStrapThread.getId(), " (");
        sbM32000s2.append(")");
        interfaceC34116n2.mo85228t(sbM32000s2.toString(), new AbstractC30556a.a[0]);
        this.log.mo85228t("Calling close on Nordic to unregister listeners", new AbstractC30556a.a[0]);
        m106371A1();
        this.log.mo85228t("Transitioning the state machine to FAULTY state", new AbstractC30556a.a[0]);
        m106368w2();
        this.stateMachine.m92169r(C32967k.f137296a);
    }

    /* JADX INFO: renamed from: w2 */
    private final void m106368w2() {
        if (this.isBluetoothReceiverRegistered) {
            this.log.mo85228t("Unregistering the broadcast receiver for Bluetooth in WhoopStrapGatt class", new AbstractC30556a.a[0]);
            this.isBluetoothReceiverRegistered = false;
            try {
                this.context.unregisterReceiver(this.bluetoothStateChangeReceiver);
            } catch (Exception e5) {
                this.log.mo85230v("Caught an exception while unregistering for Bluetooth State Change Receiver", e5, new AbstractC30556a.a[0]);
            }
        }
        if (this.isIdleModeReceiverRegistered) {
            this.log.mo85228t("Unregistering the broadcast receiver for IDLE mode in WhoopStrapGatt class", new AbstractC30556a.a[0]);
            this.isIdleModeReceiverRegistered = false;
            try {
                this.context.unregisterReceiver(this.idleModeChangeReceiver);
            } catch (Exception e13) {
                this.log.mo85230v("Caught an exception while unregistering for Idle Mode Change Receiver", e13, new AbstractC30556a.a[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static final InterfaceC39750a m106369x1(AbstractC33664b abstractC33664b, Class cls) {
        AbstractC31104a.Companion aVar = AbstractC31104a.INSTANCE;
        Context context = abstractC33664b.context;
        C35953c c35953c = new C35953c("testFlag");
        C38266c c38266c = abstractC33664b.getKoin().f106046a.f159364d;
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return aVar.m95858a(context, cls, abstractC33664b, ((Boolean) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(Boolean.class), c35953c)).booleanValue(), abstractC33664b.bluetoothHelper, abstractC33664b.nonFatalHandler, abstractC33664b.m106330R1(), (List) abstractC33664b.getKoin().f106046a.f159364d.m122602a(null, c22673i0.getOrCreateKotlinClass(List.class), new C35953c("bluetooth-device-permissions")), abstractC33664b.m106331T1(), abstractC33664b.m106381P1());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y1 */
    private final boolean m106370y1(List<? extends BluetoothGattService> services) {
        InterfaceC35208d.c cVar;
        Object next;
        Object[] objArr;
        for (BluetoothGattService bluetoothGattService : services) {
            this.log.mo85219j("Service - " + bluetoothGattService.getUuid(), new AbstractC30556a.a[0]);
            Iterator<T> it = EnumC32978v.INSTANCE.m104088a().iterator();
            do {
                cVar = null;
                objArr = 0;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC22676k.m65745e(((EnumC32978v) next).getServiceId(), bluetoothGattService.getUuid()));
            EnumC32978v enumC32978v = (EnumC32978v) next;
            if (enumC32978v != null) {
                this.log.mo85228t("onAreRequiredServicesSupported found the Whoop Strap Service " + enumC32978v.getServiceId(), new AbstractC30556a.a[0]);
                this.whoopDeviceType = enumC32978v;
                BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(enumC32978v.getCharCmdToStrap());
                this.cmdToStrapCharacteristic = characteristic;
                if (characteristic == null) {
                    this.log.mo85226q("Could not find cmdToStrap characteristic", new AbstractC30556a.a[0]);
                }
                BluetoothGattCharacteristic characteristic2 = bluetoothGattService.getCharacteristic(enumC32978v.getCharCmdFromStrap());
                this.cmdFromStrapCharacteristic = characteristic2;
                if (characteristic2 == null) {
                    this.log.mo85226q("Could not find cmdFromStrap characteristic", new AbstractC30556a.a[0]);
                }
                BluetoothGattCharacteristic characteristic3 = bluetoothGattService.getCharacteristic(enumC32978v.getCharEventsFromStrap());
                this.eventFromStrapCharacteristic = characteristic3;
                if (characteristic3 == null) {
                    this.log.mo85226q("Could not find eventFromStrap characteristic", new AbstractC30556a.a[0]);
                }
                BluetoothGattCharacteristic characteristic4 = bluetoothGattService.getCharacteristic(enumC32978v.getCharDataFromStrap());
                this.dataFromStrapCharacteristic = characteristic4;
                if (characteristic4 == null) {
                    this.log.mo85226q("Could not find dataFromStrap characteristic", new AbstractC30556a.a[0]);
                }
                BluetoothGattCharacteristic characteristic5 = bluetoothGattService.getCharacteristic(enumC32978v.getCharMemFault());
                this.memfaultCharacteristic = characteristic5;
                if (characteristic5 == null) {
                    this.log.mo85226q("Could not find memfault characteristic", new AbstractC30556a.a[0]);
                }
                m106327K1().mo71178a(new InterfaceC35208d.a(this.whoopDeviceType, cVar, 2, objArr == true ? 1 : 0));
                return true;
            }
        }
        return false;
    }

    @Override // st0.InterfaceC32968l
    /* JADX INFO: renamed from: A, reason: from getter */
    public final BluetoothDevice getBluetoothDevice() {
        return this.bluetoothDevice;
    }

    /* JADX INFO: renamed from: A1 */
    public final void m106371A1() {
        this.log.mo85228t("Closing Nordic", new AbstractC30556a.a[0]);
        m106325H1().mo100528v();
    }

    @Override // st0.InterfaceC32968l
    /* JADX INFO: renamed from: C */
    public int mo104072C() {
        return m106325H1().getMaxTransmissionUnit();
    }

    @Override // ys0.InterfaceC39750a.a
    /* JADX INFO: renamed from: C0 */
    public void mo106372C0(BluetoothDevice bluetoothDevice) {
        AbstractC22676k.m65750j(bluetoothDevice, "bluetoothDevice");
        if (AbstractC22676k.m65745e(bluetoothDevice.getAddress(), getAddress())) {
            this.log.mo85216g("onConnecting", new AbstractC30556a.a[0]);
            this.stateMachine.m92169r(C32961e.f137290a);
        }
    }

    /* JADX INFO: renamed from: D1 */
    public void m106373D1() {
        Handler handler = this.strapHandler;
        if (handler != null) {
            handler.post(new RunnableC24693e(this, 22));
        } else {
            AbstractC22676k.m65757q("strapHandler");
            throw null;
        }
    }

    @Override // nk0.InterfaceC26794a
    @InterfaceC23457c
    /* JADX INFO: renamed from: E0 */
    public Object mo79828E0(AbstractC38334b abstractC38334b, long j7, boolean z4, InterfaceC30057d<? super C40727h> interfaceC30057d) {
        return m106355o2(this, abstractC38334b, j7, z4, interfaceC30057d);
    }

    @Override // ys0.InterfaceC39750a.a
    /* JADX INFO: renamed from: F0 */
    public void mo106374F0() {
        m106324G1().mo111546m(EnumC35206b.STRAP_CONNECTION_EVENT_OCCURRED);
        this.log.mo85228t("onServicesInvalidated", new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: F1 */
    public abstract void mo24689F1(int step);

    @Override // nk0.InterfaceC26794a
    @InterfaceC23457c
    /* JADX INFO: renamed from: G */
    public InterfaceC26794a.a mo79829G(AbstractC24726c blePacket, long delay) {
        AbstractC22676k.m65750j(blePacket, "blePacket");
        if (this.cmdToStrapCharacteristic == null) {
            return null;
        }
        b bVar = new b(this, blePacket, this.whoopDeviceType);
        if (delay > 0) {
            Handler handler = this.strapHandler;
            if (handler != null) {
                handler.postDelayed(bVar, delay);
                return bVar;
            }
            AbstractC22676k.m65757q("strapHandler");
            throw null;
        }
        Handler handler2 = this.strapHandler;
        if (handler2 != null) {
            handler2.post(bVar);
            return bVar;
        }
        AbstractC22676k.m65757q("strapHandler");
        throw null;
    }

    /* JADX INFO: renamed from: J1 */
    public final InterfaceC29333c m106375J1() {
        return (InterfaceC29333c) this.commandPacketReader.getValue();
    }

    @Override // ys0.InterfaceC39750a.a
    /* JADX INFO: renamed from: L */
    public void mo106376L(BluetoothDevice bluetoothDevice) {
        AbstractC22676k.m65750j(bluetoothDevice, "bluetoothDevice");
        if (AbstractC22676k.m65745e(bluetoothDevice.getAddress(), getAddress())) {
            this.log.mo85216g("Connection Step: 1 BLE Connect Complete", new AbstractC30556a.a[0]);
            this.stateMachine.m92169r(C32960d.f137289a);
            m106324G1().mo111546m(EnumC35206b.STRAP_CONNECTION_EVENT_OCCURRED);
            this.log.mo85216g("Connection Step: 2 BLE Service Discovery Starting...", new AbstractC30556a.a[0]);
            m106325H1().mo100531y(this.forceRediscoverServicesOnConnect);
            this.recentlyDidForceDiscoverServices = this.forceRediscoverServicesOnConnect;
        }
    }

    @Override // st0.InterfaceC32968l
    /* JADX INFO: renamed from: M */
    public void mo104073M(AbstractC4309a callback) {
        AbstractC22676k.m65750j(callback, "callback");
        this.stateMachine.m92160b(callback);
    }

    /* JADX INFO: renamed from: M1, reason: from getter */
    public final AbstractC15583i getCurrentConnectionFailureMessageSubject() {
        return this.currentConnectionFailureMessageSubject;
    }

    /* JADX INFO: renamed from: N1 */
    public final InterfaceC29333c m106378N1() {
        return (InterfaceC29333c) this.dataPacketReader.getValue();
    }

    @Override // st0.InterfaceC32968l
    /* JADX INFO: renamed from: O */
    public void mo104074O() {
        synchronized (this.connectionLockObj) {
            if (this.connectionRequestLocked) {
                this.log.mo85216g("Received command to connect, but connection request is locked because of Firmware Update. Connection attempt cancelled.", new AbstractC30556a.a[0]);
                m106351m2();
                return;
            }
            Thread.State state = this.toStrapThread.getState();
            this.log.mo85228t("Current State of " + this.toStrapThread.getName() + " is " + state, new AbstractC30556a.a[0]);
            Thread.State state2 = Thread.State.RUNNABLE;
            if (state != state2 && this.stateMachine.m92163f() && !AbstractC22676k.m65745e(this.stateMachine.m92165k(), C32970n.f137298a) && !AbstractC22676k.m65745e(this.stateMachine.m92165k(), C32969m.f137297a)) {
                this.log.mo85228t("Reinitializing Looper thread and Handler so that the user doesn't have to force quit!", new AbstractC30556a.a[0]);
                Handler handler = this.strapHandler;
                if (handler == null) {
                    AbstractC22676k.m65757q("strapHandler");
                    throw null;
                }
                handler.removeCallbacksAndMessages(null);
                this.toStrapThread.quit();
                HandlerThread handlerThread = new HandlerThread("Whoop Strap Handler");
                this.toStrapThread = handlerThread;
                handlerThread.start();
                this.strapHandler = new Handler(this.toStrapThread.getLooper());
            } else {
                if (this.stateMachine.m92163f() && !AbstractC22676k.m65745e(this.stateMachine.m92165k(), C32970n.f137298a) && !AbstractC22676k.m65745e(this.stateMachine.m92165k(), C32969m.f137297a) && this.isBluetoothOn.get() && !this.isIdleModeOn.get() && state != state2) {
                    this.log.mo85222m(this.toStrapThread.getName() + " " + this.toStrapThread.getId() + " is in " + this.toStrapThread.getState() + " state for too long. Starting the tearDown() process", new AbstractC30556a.a[0]);
                    m106366v2();
                    return;
                }
                if (this.stateMachine.m92163f() && AbstractC22676k.m65745e(this.stateMachine.m92165k(), C32961e.f137290a)) {
                    this.log.mo85228t("State machine has timeout and is stuck in Connecting; resetting back to Disconnected state", new AbstractC30556a.a[0]);
                    m106351m2();
                    this.stateMachine.m92169r(C32963g.f137291a);
                }
            }
            try {
                Handler handler2 = this.strapHandler;
                if (handler2 != null) {
                    handler2.post(new RunnableC33663a(this, 0));
                } else {
                    AbstractC22676k.m65757q("strapHandler");
                    throw null;
                }
            } catch (IllegalStateException unused) {
                InterfaceC34116n interfaceC34116n = this.log;
                Handler handler3 = this.strapHandler;
                if (handler3 == null) {
                    AbstractC22676k.m65757q("strapHandler");
                    throw null;
                }
                interfaceC34116n.mo85228t("StrapHandler thread is alive? " + handler3.getLooper().getThread().isAlive(), new AbstractC30556a.a[0]);
            }
        }
    }

    /* JADX INFO: renamed from: O1 */
    public final InterfaceC29333c m106379O1() {
        return (InterfaceC29333c) this.eventPacketReader.getValue();
    }

    @Override // ys0.InterfaceC39750a.a
    /* JADX INFO: renamed from: P */
    public void mo106380P(BluetoothDevice bluetoothDevice) {
        AbstractC22676k.m65750j(bluetoothDevice, "bluetoothDevice");
        if (AbstractC22676k.m65745e(bluetoothDevice.getAddress(), getAddress())) {
            this.log.mo85228t(AbstractC11895b.m31994m(Thread.currentThread().getId(), "onDisconnecting thread id = "), new AbstractC30556a.a[0]);
            this.stateMachine.m92169r(C32964h.f137292a);
        }
    }

    /* JADX INFO: renamed from: P1 */
    public final FeatureFlagChecker m106381P1() {
        return (FeatureFlagChecker) this.featureFlagChecker.getValue();
    }

    /* JADX INFO: renamed from: S1, reason: from getter */
    public final InterfaceC2994c0 getScope() {
        return this.scope;
    }

    /* JADX INFO: renamed from: U1, reason: from getter */
    public final C30069a getStateMachine() {
        return this.stateMachine;
    }

    @Override // ys0.InterfaceC39750a.a
    /* JADX INFO: renamed from: V */
    public void mo106384V(BluetoothDevice bluetoothDevice) {
        AbstractC22676k.m65750j(bluetoothDevice, "bluetoothDevice");
        if (AbstractC22676k.m65745e(bluetoothDevice.getAddress(), getAddress())) {
            this.cmdToStrapCharacteristic = null;
            this.cmdFromStrapCharacteristic = null;
            this.eventFromStrapCharacteristic = null;
            this.dataFromStrapCharacteristic = null;
            this.log.mo85228t("onDisconnected thread id = " + Thread.currentThread().getId() + " " + Thread.currentThread().getName(), new AbstractC30556a.a[0]);
            this.stateMachine.m92169r(C32963g.f137291a);
            Handler handler = this.strapHandler;
            if (handler == null) {
                AbstractC22676k.m65757q("strapHandler");
                throw null;
            }
            handler.removeCallbacksAndMessages(null);
            this.log.mo85216g("Cleared all messages from strapHandler after transitioning to Disconnected", new AbstractC30556a.a[0]);
            m106327K1().mo71178a(new InterfaceC35208d.e(this.whoopDeviceType));
            m106324G1().mo111546m(EnumC35206b.STRAP_CONNECTION_EVENT_OCCURRED);
        }
    }

    /* JADX INFO: renamed from: V1 */
    public final C30073e m106385V1() {
        return (C30073e) this.strapSignatureDataStoreHelper.getValue();
    }

    /* JADX INFO: renamed from: W1, reason: from getter */
    public final EnumC32978v getWhoopDeviceType() {
        return this.whoopDeviceType;
    }

    @Override // ys0.InterfaceC39750a.a
    /* JADX INFO: renamed from: X0 */
    public void mo106387X0(BluetoothDevice bluetoothDevice, int status, String message) {
        AbstractC22676k.m65750j(bluetoothDevice, "bluetoothDevice");
        AbstractC22676k.m65750j(message, "message");
        if (AbstractC22676k.m65745e(bluetoothDevice.getAddress(), getAddress())) {
            this.stateMachine.m92169r(new C32965i(status, message));
            m106324G1().mo111546m(EnumC35206b.STRAP_CONNECTION_EVENT_OCCURRED);
        }
    }

    /* JADX INFO: renamed from: X1, reason: from getter */
    public final C15578d getWhoopStrapCommandCallbacks() {
        return this.whoopStrapCommandCallbacks;
    }

    /* JADX INFO: renamed from: Y1 */
    public final byte m106389Y1() {
        byte b6;
        synchronized (f140483y0) {
            b6 = this.sequenceNumber;
            this.sequenceNumber = (byte) (b6 + 1);
        }
        return b6;
    }

    @Override // st0.InterfaceC32968l
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: a2 */
    public void m106390a2(C40727h commandResponsePacket) {
        AbstractC22676k.m65750j(commandResponsePacket, "commandResponsePacket");
        this.whoopStrapCommandCallbacks.onNext(commandResponsePacket);
    }

    @Override // ys0.InterfaceC39750a.a
    /* JADX INFO: renamed from: c */
    public void mo106391c(BluetoothDevice bluetoothDevice) {
        AbstractC22676k.m65750j(bluetoothDevice, "bluetoothDevice");
        if (AbstractC22676k.m65745e(bluetoothDevice.getAddress(), getAddress())) {
            this.log.mo85216g("onReady called by BleManager", new AbstractC30556a.a[0]);
            if (!m106325H1().mo100527k()) {
                Handler handler = this.strapHandler;
                if (handler != null) {
                    handler.post(new RunnableC1605m(28, this, bluetoothDevice));
                    return;
                } else {
                    AbstractC22676k.m65757q("strapHandler");
                    throw null;
                }
            }
            this.log.mo85216g("Connection Step: 3 Bonding Complete", new AbstractC30556a.a[0]);
            if (!this.recentlyDidForceDiscoverServices) {
                this.stateMachine.m92169r(C32958b.f137287a);
            }
            this.log.mo85228t("Connection Step: 3 BLE Registering Characteristics for Notification Delayed...", new AbstractC30556a.a[0]);
            Handler handler2 = this.strapHandler;
            if (handler2 != null) {
                handler2.postDelayed(new RunnableC33663a(this, 1), 600L);
            } else {
                AbstractC22676k.m65757q("strapHandler");
                throw null;
            }
        }
    }

    @Override // ys0.InterfaceC39750a.a
    /* JADX INFO: renamed from: c1 */
    public boolean mo106392c1(List<? extends BluetoothGattService> services) {
        AbstractC22676k.m65750j(services, "services");
        this.log.mo85228t(AbstractC2875y.m8296i(services.size(), "onAreRequiredServicesSupported ", " services present"), new AbstractC30556a.a[0]);
        return m106370y1(services);
    }

    @Override // st0.InterfaceC32968l
    /* JADX INFO: renamed from: d0, reason: from getter */
    public InterfaceC13058l getConnectionStateFlow() {
        return this.connectionStateFlow;
    }

    @Override // st0.InterfaceC32968l
    /* JADX INFO: renamed from: f0 */
    public void mo104077f0(AbstractC4309a callback) {
        AbstractC22676k.m65750j(callback, "callback");
        this.stateMachine.m92166m(callback);
    }

    @Override // st0.InterfaceC32968l
    public AbstractC32962f getConnectionState() {
        return this.stateMachine.m92165k();
    }

    @Override // of3.InterfaceC27903a
    public /* bridge */ C26669a getKoin() {
        return AbstractC34132o.m107856A(this);
    }

    @Override // st0.InterfaceC32968l
    public String getName() {
        return this.name;
    }

    @Override // nk0.InterfaceC26794a, vk0.InterfaceC36083i
    /* JADX INFO: renamed from: i */
    public Object mo79830i(InterfaceC36081g interfaceC36081g, long j7, boolean z4, InterfaceC30057d<? super C23468n> interfaceC30057d) {
        return m106359q2(this, interfaceC36081g, j7, z4, interfaceC30057d);
    }

    /* JADX INFO: renamed from: k2 */
    public void mo24736k2() {
        this.stateMachine.m92161d();
        m106371A1();
    }

    /* JADX INFO: renamed from: l2 */
    public final void m106393l2() {
        this.whoopStrapSharedPrefs.m92196b();
        AbstractC3006f0.m8732z(this.scope, null, null, new j(null), 3);
    }

    @Override // ys0.InterfaceC39750a.a
    /* JADX INFO: renamed from: m */
    public void mo106394m(BluetoothDevice bluetoothDevice) {
        AbstractC22676k.m65750j(bluetoothDevice, "bluetoothDevice");
        if (AbstractC22676k.m65745e(bluetoothDevice.getAddress(), getAddress())) {
            this.log.mo85216g("Connection Step: Bonding Complete", new AbstractC30556a.a[0]);
            this.stateMachine.m92169r(C32958b.f137287a);
            m106324G1().mo111546m(EnumC35206b.STRAP_CONNECTION_EVENT_OCCURRED);
        }
    }

    @Override // ys0.InterfaceC39750a.a
    /* JADX INFO: renamed from: q */
    public void mo106395q(BluetoothDevice bluetoothDevice) {
        AbstractC22676k.m65750j(bluetoothDevice, "bluetoothDevice");
        m106351m2();
        m106324G1().mo111546m(EnumC35206b.STRAP_CONNECTION_EVENT_OCCURRED);
    }

    /* JADX INFO: renamed from: r2 */
    public final void m106396r2(EnumC25628a enumC25628a) {
        this.latestConnectionError = enumC25628a;
        if (enumC25628a != null) {
            this.log.mo85222m(enumC25628a.toFailureMessage(), new AbstractC30556a.a[0]);
            this.currentConnectionFailureMessageSubject.onNext(enumC25628a);
        }
    }

    /* JADX INFO: renamed from: s2 */
    public final void m106397s2(EnumC32978v enumC32978v) {
        AbstractC22676k.m65750j(enumC32978v, "<set-?>");
        this.whoopDeviceType = enumC32978v;
    }

    /* JADX INFO: renamed from: t2 */
    public final void m106398t2(Handler handler) {
        this.toStrapThread.start();
        if (handler == null) {
            handler = new Handler(this.toStrapThread.getLooper());
        }
        this.strapHandler = handler;
        InterfaceC34116n interfaceC34116n = this.log;
        StringBuilder sbM32000s = AbstractC11895b.m32000s("Started a Handler thread: ", this.toStrapThread.getName(), this.toStrapThread.getId(), " (");
        sbM32000s.append(")");
        interfaceC34116n.mo85216g(sbM32000s.toString(), new AbstractC30556a.a[0]);
        m106347j2();
        this.isBluetoothOn.set(this.bluetoothHelper.m13653f());
        if (AbstractC22676k.m65745e(this.stateMachine.m92164j(), C32967k.f137296a)) {
            this.stateMachine.m92167p(false);
            this.stateMachine.m92169r(C32963g.f137291a);
            mo104074O();
        }
    }

    @Override // ys0.InterfaceC39750a.a
    /* JADX INFO: renamed from: v0 */
    public void mo106399v0(BluetoothDevice bluetoothDevice) {
        AbstractC22676k.m65750j(bluetoothDevice, "bluetoothDevice");
        if (AbstractC22676k.m65745e(bluetoothDevice.getAddress(), getAddress())) {
            this.log.mo85228t("onBonding", new AbstractC30556a.a[0]);
            this.stateMachine.m92169r(C32959c.f137288a);
        }
    }

    /* JADX INFO: renamed from: z1 */
    public void m106400z1() {
        this.stateMachine.m92169r(C32963g.f137291a);
        Handler handler = this.strapHandler;
        if (handler == null) {
            AbstractC22676k.m65757q("strapHandler");
            throw null;
        }
        handler.removeCallbacksAndMessages(null);
        InterfaceC34116n interfaceC34116n = this.log;
        StringBuilder sbM32000s = AbstractC11895b.m32000s("Quitting the ", this.toStrapThread.getName(), this.toStrapThread.getId(), " (");
        sbM32000s.append(") thread");
        interfaceC34116n.mo85216g(sbM32000s.toString(), new AbstractC30556a.a[0]);
        this.toStrapThread.quit();
        m106371A1();
        m106368w2();
    }
}
