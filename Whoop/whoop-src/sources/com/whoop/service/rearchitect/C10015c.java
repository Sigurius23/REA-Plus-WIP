package com.whoop.service.rearchitect;

import ad3.C0783z;
import ak0.C0940b;
import ak0.C0941c;
import ak0.C0945g;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.HandlerThread;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3018i0;
import c92.C4329a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ca2.InterfaceC4366f;
import com.whoop.connectivityCore.batteryPack.models.BatteryPackType;
import com.whoop.data.featureFlags.CoreFeatureFlagsKt;
import com.whoop.domain.exception.BluetoothDeviceNameMissingException;
import com.whoop.domain.model.WhoopStrapInfo;
import com.whoop.domain.model.haptics.AlarmHapticsPattern;
import com.whoop.personalrecords.miniarch.domain.PersonalRecordsApiKt;
import dc3.EnumC11916a;
import dk0.C12108h;
import dk0.C12110j;
import dk0.C12111k;
import e83.AbstractC12858c;
import e83.C12857b;
import e83.C12861f;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13096w1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13075p1;
import ec3.InterfaceC13087t1;
import ek0.C13271a;
import ek0.C13272a0;
import ek0.C13273b;
import ek0.C13274b0;
import ek0.C13275c;
import ek0.C13277d;
import ek0.C13278d0;
import ek0.C13279e;
import ek0.C13280e0;
import ek0.C13285j;
import ek0.C13286k;
import ek0.C13288m;
import ek0.C13289n;
import ek0.C13291p;
import ek0.C13292q;
import ek0.C13294s;
import ek0.C13295t;
import ek0.C13297v;
import ek0.C13299x;
import ek0.C13300y;
import ek0.C13301z;
import fk2.C14554a;
import g83.AbstractC15583i;
import g83.C15576b;
import g83.C15578d;
import in2.C18729a;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21461d;
import j93.InterfaceC21493z;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import jk0.C21753g;
import jk0.EnumC21747a;
import jk0.InterfaceC21750d;
import js0.AbstractC21909c;
import js0.C21908b;
import kk0.C22538a;
import kk0.C22539b;
import l73.AbstractC23410a;
import l73.AbstractC23412c;
import l73.AbstractC23417h;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import lk0.AbstractC24489a;
import lk0.AbstractC24490b;
import lt0.AbstractC24726c;
import lt0.AbstractC24734k;
import lt0.C24736m;
import ma1.C25371a;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import mk0.EnumC25628a;
import n73.C26442a;
import nk0.InterfaceC26794a;
import of3.InterfaceC27903a;
import oh2.C27940c;
import oh2.InterfaceC27939b;
import oh3.AbstractC27946d;
import or2.C28213x;
import ot0.C28323a;
import p000.AbstractC11266d;
import p007a6.C0410c;
import p031b9.AbstractC2875y;
import p037bu.C3632c;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22693x;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import q92.AbstractC30075g;
import q92.C30070b;
import q92.C30073e;
import q92.C30076h;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import rt0.InterfaceC31800b;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sj2.InterfaceC32564a;
import st0.AbstractC32977u;
import st0.C32963g;
import st0.C32965i;
import st0.C32966j;
import st0.C32969m;
import st0.C32970n;
import st0.C32971o;
import st0.EnumC32973q;
import st0.EnumC32978v;
import st0.InterfaceC32972p;
import t92.AbstractC33664b;
import td1.EnumC33703a;
import tj0.EnumC33865b;
import tj0.InterfaceC33864a;
import us0.InterfaceC35208d;
import us0.InterfaceC35209e;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import vh2.InterfaceC36049d;
import vh2.InterfaceC36053h;
import vk0.C36086l;
import vk0.InterfaceC36076b;
import vk0.InterfaceC36079e;
import vk0.InterfaceC36081g;
import vk0.InterfaceC36084j;
import vk0.InterfaceC36085k;
import w73.C36923i;
import w73.C36926l;
import wj0.EnumC37318b;
import ws0.C37605a;
import xf3.C38266c;
import xj0.AbstractC38364l;
import xj0.C38335b0;
import xj0.C38345e1;
import xj0.C38346f;
import xj0.C38348f1;
import xj0.C38349g;
import xj0.C38350g0;
import xj0.C38351g1;
import xj0.C38352h;
import xj0.C38354h1;
import xj0.C38355i;
import xj0.C38357i1;
import xj0.C38359j0;
import xj0.C38360j1;
import xj0.C38361k;
import xj0.C38363k1;
import xj0.C38366l1;
import xj0.C38367m;
import xj0.C38373o;
import xj0.C38376p0;
import xj0.C38380r0;
import xj0.C38382s0;
import xj0.C38386u0;
import xj0.C38388v0;
import y42.C39228j;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;
import yj0.C39587a;
import yj0.C39588b;
import yj0.C39589c;
import ys0.InterfaceC39750a;
import z82.InterfaceC40188b;
import ze1.AbstractC40586b;
import zj0.C40717d1;
import zj0.C40720e1;
import zj0.C40723f1;
import zj0.C40726g1;
import zj0.C40727h;
import zj0.C40735j1;
import zj0.C40736k;
import zj0.C40739l;
import zj0.C40746o;
import zj0.C40751q0;
import zj0.C40758u;
import zj0.C40761v0;
import zj0.InterfaceC40724g;
import zj0.InterfaceC40756t;

/* JADX INFO: renamed from: com.whoop.service.rearchitect.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u009a\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0016*\u0004Ð\u0002Û\u0002\u0018\u0000 \u008c\u00032\u00020\u00012\u00020\u0002:\u0006£\u0002\u008d\u0003\u008e\u0003B]\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b\u001f\u0010 J%\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010\u0019\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020&2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020&2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b-\u0010,J\u0017\u00100\u001a\u00020&2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020&2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b2\u00101J\u0017\u00105\u001a\u00020&2\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020&2\u0006\u00108\u001a\u000207H\u0017¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020&2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020&2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020&2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\bC\u00101J\u0017\u0010F\u001a\u00020&2\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ\u0015\u0010J\u001a\b\u0012\u0004\u0012\u00020I0HH\u0016¢\u0006\u0004\bJ\u0010KJ\u0015\u0010L\u001a\b\u0012\u0004\u0012\u00020I0HH\u0016¢\u0006\u0004\bL\u0010KJ\u0015\u0010M\u001a\b\u0012\u0004\u0012\u00020I0HH\u0016¢\u0006\u0004\bM\u0010KJ+\u0010S\u001a\b\u0012\u0004\u0012\u00020P0R2\u0014\u0010Q\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020P0O0NH\u0016¢\u0006\u0004\bS\u0010TJ\u0015\u0010V\u001a\b\u0012\u0004\u0012\u00020P0UH\u0017¢\u0006\u0004\bV\u0010WJ\u0015\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0XH\u0017¢\u0006\u0004\bZ\u0010[J\u0015\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\\H\u0016¢\u0006\u0004\b^\u0010_J-\u0010b\u001a\b\u0012\u0004\u0012\u00028\u00000U\"\b\b\u0000\u0010`*\u0002032\f\u0010a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016¢\u0006\u0004\bb\u0010cJ\u0015\u0010d\u001a\b\u0012\u0004\u0012\u00020D0RH\u0016¢\u0006\u0004\bd\u0010eJ!\u0010j\u001a\u0004\u0018\u00010i2\u0006\u0010g\u001a\u00020f2\u0006\u0010h\u001a\u00020\u001aH\u0016¢\u0006\u0004\bj\u0010kJ\"\u0010m\u001a\u0004\u0018\u00010l2\u0006\u0010g\u001a\u00020f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\bm\u0010nJ\"\u0010p\u001a\u0004\u0018\u00010o2\u0006\u0010g\u001a\u00020f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\bp\u0010nJ\u000f\u0010q\u001a\u00020&H\u0016¢\u0006\u0004\bq\u0010(J\u000f\u0010r\u001a\u00020&H\u0016¢\u0006\u0004\br\u0010(J\u0018\u0010s\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\bs\u0010tJ\u0018\u0010u\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\bu\u0010tJ\"\u0010y\u001a\u0004\u0018\u00010x2\u0006\u0010w\u001a\u00020v2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0004\by\u0010zJ5\u0010\u0080\u0001\u001a\u0004\u0018\u00010x2\u0006\u0010|\u001a\u00020{2\u0006\u0010~\u001a\u00020}2\u0006\u0010\u007f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J&\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0082\u00012\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010|\u001a\u00020{H\u0096@¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J(\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u00012\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0086\u0001\u001a\u00030\u0085\u0001H\u0096@¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001d\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008a\u00012\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0005\b\u008b\u0001\u0010tJ\u001c\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0005\b\u008c\u0001\u0010tJ'\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u001e2\b\u0010\u008e\u0001\u001a\u00030\u008d\u00012\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J0\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0093\u00012\u0007\u0010\u0091\u0001\u001a\u00020{2\u0007\u0010\u0092\u0001\u001a\u00020{2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u001d\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0096\u00012\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0005\b\u0097\u0001\u0010tJ(\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009a\u00012\b\u0010\u0099\u0001\u001a\u00030\u0098\u00012\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J(\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u009e\u00012\b\u0010\u0099\u0001\u001a\u00030\u009d\u00012\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J%\u0010¢\u0001\u001a\u0004\u0018\u00010\u001e2\u0007\u0010¡\u0001\u001a\u00020f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0005\b¢\u0001\u0010nJ&\u0010¤\u0001\u001a\u0005\u0018\u00010£\u00012\u0007\u0010¡\u0001\u001a\u00020f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0005\b¤\u0001\u0010nJ&\u0010¦\u0001\u001a\u0005\u0018\u00010¥\u00012\u0007\u0010¡\u0001\u001a\u00020f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0005\b¦\u0001\u0010nJ&\u0010©\u0001\u001a\u0005\u0018\u00010¨\u00012\u0007\u0010§\u0001\u001a\u00020f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0005\b©\u0001\u0010nJ\u001a\u0010ª\u0001\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0005\bª\u0001\u0010tJ(\u0010\u00ad\u0001\u001a\u0005\u0018\u00010¬\u00012\b\u0010\u0099\u0001\u001a\u00030«\u00012\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J#\u0010¯\u0001\u001a\u00020&2\u0007\u0010¡\u0001\u001a\u00020f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@¢\u0006\u0005\b¯\u0001\u0010nJ\u0012\u0010°\u0001\u001a\u00020fH\u0016¢\u0006\u0006\b°\u0001\u0010±\u0001J\u0011\u0010²\u0001\u001a\u00020&H\u0016¢\u0006\u0005\b²\u0001\u0010(J\u0011\u0010³\u0001\u001a\u00020&H\u0016¢\u0006\u0005\b³\u0001\u0010(J\u001b\u0010µ\u0001\u001a\u00020&2\u0007\u0010´\u0001\u001a\u00020{H\u0016¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\u0011\u0010·\u0001\u001a\u00020&H\u0016¢\u0006\u0005\b·\u0001\u0010(J,\u0010º\u0001\u001a\u0005\u0018\u00010¬\u00012\t\b\u0002\u0010¸\u0001\u001a\u00020{2\t\b\u0002\u0010¹\u0001\u001a\u00020\u001aH\u0087@¢\u0006\u0006\bº\u0001\u0010»\u0001J\u000f\u0010¼\u0001\u001a\u00020&¢\u0006\u0005\b¼\u0001\u0010(J%\u0010½\u0001\u001a\u0004\u0018\u00010\u001e2\u0007\u0010¡\u0001\u001a\u00020f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0005\b½\u0001\u0010nJ&\u0010¿\u0001\u001a\u0005\u0018\u00010¾\u00012\u0007\u0010¡\u0001\u001a\u00020f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0005\b¿\u0001\u0010nJ\u0011\u0010À\u0001\u001a\u00020&H\u0002¢\u0006\u0005\bÀ\u0001\u0010(J\u001d\u0010Ã\u0001\u001a\u00020&2\b\u0010Â\u0001\u001a\u00030Á\u0001H\u0082@¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J\u0011\u0010Å\u0001\u001a\u00020&H\u0002¢\u0006\u0005\bÅ\u0001\u0010(J\u001c\u0010Ç\u0001\u001a\u00020&2\b\u0010Æ\u0001\u001a\u00030\u008d\u0001H\u0002¢\u0006\u0006\bÇ\u0001\u0010È\u0001J\u0016\u0010É\u0001\u001a\u0005\u0018\u00010Á\u0001H\u0082@¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001J\u0016\u0010Ì\u0001\u001a\u0005\u0018\u00010Ë\u0001H\u0082@¢\u0006\u0006\bÌ\u0001\u0010Ê\u0001J1\u0010Ð\u0001\u001a\u00030Ï\u00012\b\u0010\u008e\u0001\u001a\u00030\u008d\u00012\b\u0010\u0099\u0001\u001a\u00030Á\u00012\b\u0010Î\u0001\u001a\u00030Í\u0001H\u0002¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001J\u001d\u0010Ó\u0001\u001a\u00030\u008d\u00012\b\u0010Ò\u0001\u001a\u00030Ï\u0001H\u0002¢\u0006\u0006\bÓ\u0001\u0010Ô\u0001J\u0011\u0010Õ\u0001\u001a\u00020&H\u0002¢\u0006\u0005\bÕ\u0001\u0010(R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b+\u0010Ø\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÙ\u0001\u0010Ú\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÛ\u0001\u0010Ü\u0001R!\u0010á\u0001\u001a\u00030Ý\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010Þ\u0001\u001a\u0006\bß\u0001\u0010à\u0001R!\u0010ç\u0001\u001a\u00030â\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bã\u0001\u0010ä\u0001\u001a\u0006\bå\u0001\u0010æ\u0001R'\u0010ì\u0001\u001a\u0012\u0012\r\u0012\u000b é\u0001*\u0004\u0018\u00010P0P0è\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bê\u0001\u0010ë\u0001R'\u0010ï\u0001\u001a\u0012\u0012\r\u0012\u000b é\u0001*\u0004\u0018\u00010Y0Y0í\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010î\u0001R!\u0010ô\u0001\u001a\u00030ð\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bñ\u0001\u0010ä\u0001\u001a\u0006\bò\u0001\u0010ó\u0001R&\u0010õ\u0001\u001a\u0012\u0012\r\u0012\u000b é\u0001*\u0004\u0018\u00010.0.0è\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b-\u0010ë\u0001R'\u0010÷\u0001\u001a\u0012\u0012\r\u0012\u000b é\u0001*\u0004\u0018\u00010.0.0è\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bö\u0001\u0010ë\u0001R'\u0010ù\u0001\u001a\u0012\u0012\r\u0012\u000b é\u0001*\u0004\u0018\u000103030è\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bø\u0001\u0010ë\u0001R&\u0010ú\u0001\u001a\u0012\u0012\r\u0012\u000b é\u0001*\u0004\u0018\u00010.0.0è\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bd\u0010ë\u0001R'\u0010ü\u0001\u001a\u0012\u0012\r\u0012\u000b é\u0001*\u0004\u0018\u00010D0D0è\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bû\u0001\u0010ë\u0001R\u0018\u0010ÿ\u0001\u001a\u00030ý\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010þ\u0001R\u0017\u0010\u0082\u0002\u001a\u00030\u0080\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bj\u0010\u0081\u0002R \u0010\u0086\u0002\u001a\u00030\u0083\u00028BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\br\u0010ä\u0001\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002R!\u0010\u008b\u0002\u001a\u00030\u0087\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0088\u0002\u0010ä\u0001\u001a\u0006\b\u0089\u0002\u0010\u008a\u0002R\u001f\u0010\u008e\u0002\u001a\t\u0018\u00010\u008c\u0002R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bA\u0010\u008d\u0002R!\u0010\u0092\u0002\u001a\u00030\u008f\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0094\u0001\u0010ä\u0001\u001a\u0006\b\u0090\u0002\u0010\u0091\u0002R \u0010\u0096\u0002\u001a\u00030\u0093\u00028BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b5\u0010ä\u0001\u001a\u0006\b\u0094\u0002\u0010\u0095\u0002R!\u0010\u009a\u0002\u001a\u00030\u0097\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010ä\u0001\u001a\u0006\b\u0098\u0002\u0010\u0099\u0002R\u0017\u0010\u009c\u0002\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010\u009b\u0002R\u001c\u0010\u009f\u0002\u001a\u0005\u0018\u00010Ï\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0002\u0010\u009e\u0002R \u0010¥\u0002\u001a\u00030 \u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¡\u0002\u0010¢\u0002\u001a\u0006\b£\u0002\u0010¤\u0002R \u0010«\u0002\u001a\u00030¦\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b§\u0002\u0010¨\u0002\u001a\u0006\b©\u0002\u0010ª\u0002R$\u0010±\u0002\u001a\u00070¬\u0002R\u00020\u00008\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u00ad\u0002\u0010®\u0002\u001a\u0006\b¯\u0002\u0010°\u0002R,\u0010·\u0002\u001a\u00030²\u00022\b\u0010³\u0002\u001a\u00030²\u00028\u0002@BX\u0082\u000e¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010´\u0002\"\u0006\bµ\u0002\u0010¶\u0002R\u001f\u0010»\u0002\u001a\n\u0012\u0005\u0012\u00030²\u00020¸\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0002\u0010º\u0002R'\u0010Á\u0002\u001a\n\u0012\u0005\u0012\u00030²\u00020¼\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b½\u0002\u0010¾\u0002\u001a\u0006\b¿\u0002\u0010À\u0002R0\u0010Ä\u0002\u001a\u0005\u0018\u00010\u008d\u00012\n\u0010³\u0002\u001a\u0005\u0018\u00010\u008d\u00018\u0016@RX\u0096\u000e¢\u0006\u0010\n\u0006\bª\u0001\u0010Â\u0002\u001a\u0006\bû\u0001\u0010Ã\u0002R)\u0010Ç\u0002\u001a\u00020f2\u0007\u0010³\u0002\u001a\u00020f8\u0016@RX\u0096\u000e¢\u0006\u000f\n\u0005\bÅ\u0002\u00102\u001a\u0006\bÆ\u0002\u0010±\u0001R\u001e\u0010É\u0002\u001a\t\u0012\u0004\u0012\u00020f0¸\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0002\u0010º\u0002R \u0010Ï\u0002\u001a\u00030Ê\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bË\u0002\u0010Ì\u0002\u001a\u0006\bÍ\u0002\u0010Î\u0002R\u0018\u0010Ó\u0002\u001a\u00030Ð\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÑ\u0002\u0010Ò\u0002R'\u0010Ú\u0002\u001a\u00030Ô\u00028\u0006X\u0087\u0004¢\u0006\u0017\n\u0006\bÕ\u0002\u0010Ö\u0002\u0012\u0005\bÙ\u0002\u0010(\u001a\u0006\b×\u0002\u0010Ø\u0002R\u0018\u0010Þ\u0002\u001a\u00030Û\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÜ\u0002\u0010Ý\u0002R\u0018\u0010â\u0002\u001a\u00030ß\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bà\u0002\u0010á\u0002R%\u0010ç\u0002\u001a\t\u0012\u0004\u0012\u0002070ã\u00028\u0002X\u0083\u0004¢\u0006\u000f\n\u0006\bä\u0002\u0010å\u0002\u0012\u0005\bæ\u0002\u0010(R\u001f\u0010ê\u0002\u001a\n\u0012\u0005\u0012\u00030è\u00020ã\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bé\u0002\u0010å\u0002R\u001e\u0010ì\u0002\u001a\t\u0012\u0004\u0012\u00020?0ã\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bë\u0002\u0010å\u0002R\u001e\u0010î\u0002\u001a\t\u0012\u0004\u0012\u00020;0ã\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bí\u0002\u0010å\u0002R\u0018\u0010ð\u0002\u001a\u00020f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bï\u0002\u00102R$\u0010ó\u0002\u001a\b\u0012\u0004\u0012\u00020;0R8\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\bñ\u0002\u0010ò\u0002\u001a\u0005\b¹\u0002\u0010eR\u001a\u0010Ò\u0001\u001a\u0005\u0018\u00010Ï\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bô\u0002\u0010õ\u0002R\u0018\u0010ø\u0002\u001a\u00030²\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bö\u0002\u0010÷\u0002R\u001f\u0010ý\u0002\u001a\u00030ù\u00028VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bü\u0002\u0010(\u001a\u0006\bú\u0002\u0010û\u0002R\u0018\u0010\u0080\u0003\u001a\u00030Í\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bþ\u0002\u0010ÿ\u0002R\u0017\u0010\u0082\u0003\u001a\u00020f8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0081\u0003\u0010±\u0001R#\u0010\u0085\u0003\u001a\b\u0012\u0004\u0012\u0002070R8VX\u0097\u0004¢\u0006\u000e\u0012\u0005\b\u0084\u0003\u0010(\u001a\u0005\b\u0083\u0003\u0010eR\u001d\u0010\u0086\u0003\u001a\t\u0012\u0005\u0012\u00030è\u00020R8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b§\u0002\u0010eR\u001c\u0010\u0087\u0003\u001a\b\u0012\u0004\u0012\u00020?0R8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bñ\u0001\u0010eR\u0017\u0010\u0089\u0003\u001a\u00020f8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0088\u0003\u0010±\u0001R\u0017\u0010\u008b\u0003\u001a\u00020f8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008a\u0003\u0010±\u0001¨\u0006\u008f\u0003"}, m65681d2 = {"Lcom/whoop/service/rearchitect/c;", "Lt92/b;", "Ljk0/d;", "Landroid/content/Context;", "context", "Landroid/bluetooth/BluetoothDevice;", "bluetoothDevice", "Ljava/lang/Class;", "Lys0/a;", "bleHandlerImpl", "Lin2/d;", "dispatcherFactory", "Lz82/b;", "analyticsManager", "Lq92/h;", "whoopStrapSharedPrefs", "Landroid/os/HandlerThread;", "handlerThread", "Lmc3/a;", "mutex", "Lbc3/c0;", "scope", "<init>", "(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Ljava/lang/Class;Lin2/d;Lz82/b;Lq92/h;Landroid/os/HandlerThread;Lmc3/a;Lbc3/c0;)V", "Lvk0/g;", "task", "", "timeout", "Lsj2/a;", "executionPriority", "Lzj0/h;", "g0", "(Lvk0/g;JLsj2/a;Lq83/d;)Ljava/lang/Object;", "Lvk0/j;", "Lbc3/i0;", "Lvk0/e;", "u", "(Lvk0/j;Lsj2/a;)Lbc3/i0;", "Ll83/a0;", "k2", "()V", "Llk0/a;", "callback", "A0", "(Llk0/a;)V", "I0", "Llt0/m;", "receivedPacket", "c0", "(Llt0/m;)V", "Z", "Ldk0/k;", "realTimeDataPacket", "T0", "(Ldk0/k;)V", "Ldk0/h;", "imuStreamDataPacket", "s", "(Ldk0/h;)V", "Lrt0/b$b;", "imuData", "a0", "(Lrt0/b$b;)V", "Ldk0/j;", "r17LabradorFilteredDataPacket", "R0", "(Ldk0/j;)V", "l", "", "chunk", "j0", "([B)V", "Lec3/t1;", "Llt0/k;", "x0", "()Lec3/t1;", "N", "o0", "", "Lj93/d;", "Lot0/a;", "filterPacketList", "Lec3/l;", "v", "(Ljava/util/Set;)Lec3/l;", "Ll73/c;", "K", "()Ll73/c;", "Ll73/a;", "Lek0/u;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ll73/a;", "Ll73/h;", "Lmk0/a;", "x", "()Ll73/h;", "T", "realTimeDataType", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ljava/lang/Class;)Ll73/c;", "L0", "()Lec3/l;", "", "turnOn", "delay", "Lnk0/a$a;", "O0", "(ZJ)Lnk0/a$a;", "Lzj0/j1;", "e0", "(ZJLq83/d;)Ljava/lang/Object;", "Lzj0/d1;", "U", "n0", "P0", "X", "(JLq83/d;)Ljava/lang/Object;", "p0", "Lfk2/a;", "timeStamp", "Lzj0/v0;", "b0", "(Lfk2/a;JLq83/d;)Ljava/lang/Object;", "", "strapAlarmId", "Lcom/whoop/domain/model/haptics/AlarmHapticsPattern;", "alarmHapticsPattern", "alarmTimeMillis", "D0", "(ILcom/whoop/domain/model/haptics/AlarmHapticsPattern;JJLq83/d;)Ljava/lang/Object;", "Lzj0/m;", "E", "(JILq83/d;)Ljava/lang/Object;", "Lxj0/i0;", "params", "Lzj0/p0;", "t", "(JLxj0/i0;Lq83/d;)Ljava/lang/Object;", "Lzj0/j;", "U0", "a1", "", "name", "H", "(Ljava/lang/String;JLq83/d;)Ljava/lang/Object;", "intervalSeconds", "durationSeconds", "Lak0/b;", "S0", "(IIJLq83/d;)Ljava/lang/Object;", "Lzj0/k;", "p", "Lyj0/b;", "packet", "Lak0/g;", "S", "(Lyj0/b;JLq83/d;)Ljava/lang/Object;", "Lxj0/j0;", "Lzj0/q0;", "F", "(Lxj0/j0;JLq83/d;)Ljava/lang/Object;", "enable", "o", "Lzj0/e1;", "Y", "Lzj0/g1;", "N0", "enabled", "Lzj0/f1;", "h0", "d1", "Lxj0/k;", "Lzj0/o;", "I", "(Lxj0/k;JLq83/d;)Ljava/lang/Object;", "V0", "c3", "()Z", "G0", "C3", "step", "F1", "(I)V", "i0", "retries", "delayMillis", "d3", "(IJLq83/d;)Ljava/lang/Object;", "y3", "D3", "", "B3", PersonalRecordsApiKt.VERSION, "Lzj0/t;", "hello", "r3", "(Lzj0/t;Lq83/d;)Ljava/lang/Object;", "F3", "action", "w3", "(Ljava/lang/String;)V", "z3", "(Lq83/d;)Ljava/lang/Object;", "Lzj0/u;", "A3", "Lst0/v;", "gen", "Lcom/whoop/domain/model/WhoopStrapInfo;", "b3", "(Ljava/lang/String;Lzj0/t;Lst0/v;)Lcom/whoop/domain/model/WhoopStrapInfo;", "strapInfo", "o3", "(Lcom/whoop/domain/model/WhoopStrapInfo;)Ljava/lang/String;", "x3", "z0", "Lin2/d;", "Lz82/b;", "B0", "Lq92/h;", "C0", "Lmc3/a;", "Loh3/d;", "Lq92/b;", "l3", "()Loh3/d;", "log", "Lrr2/c;", "E0", "Ll83/h;", "h3", "()Lrr2/c;", "crashReporter", "Lg83/d;", "kotlin.jvm.PlatformType", "F0", "Lg83/d;", "strapAlarmEventPubSub", "Le83/c;", "Le83/c;", "highFreqSyncEventPubSub", "Lca2/f;", "H0", "k3", "()Lca2/f;", "historySyncRouter", "whoopStrapEventsCallbacks", "J0", "whoopStrapDataCallbacks", "K0", "whoopStrapRealTimeDataCallbacks", "whoopStrapMetadataCallbacks", "M0", "whoopStrapMemfaultCallbacks", "Ln73/a;", "Ln73/a;", "callbacksCompositeDisposables", "Lc92/a;", "Lc92/a;", "bluetoothHelper", "Lvk0/b;", "f3", "()Lvk0/b;", "bleTaskExecutor", "Ljs0/c;", "Q0", "g3", "()Ljs0/c;", "configRepo", "Lcom/whoop/service/rearchitect/c$a;", "Lcom/whoop/service/rearchitect/c$a;", "clockSynchronizer", "Lus0/e;", "K1", "()Lus0/e;", "connectionAnalyticsHelper", "Ly42/j;", "m3", "()Ly42/j;", "puffinManager", "Lvh2/d;", "p3", "()Lvh2/d;", "strapUnlockService", "J", "longRunningTaskTimeout", "W0", "Lcom/whoop/domain/model/WhoopStrapInfo;", "_strapInfo", "Lkk0/a;", "X0", "Lkk0/a;", "b", "()Lkk0/a;", "batteryLevel", "Lkk0/b;", "Y0", "Lkk0/b;", "n", "()Lkk0/b;", "chargeStatus", "Lcom/whoop/service/rearchitect/c$c;", "Z0", "Lcom/whoop/service/rearchitect/c$c;", "j3", "()Lcom/whoop/service/rearchitect/c$c;", "genericHrProfileController", "Lws0/a;", "value", "Lws0/a;", "E3", "(Lws0/a;)V", "_whoopBatteryLevel", "Lec3/p1;", "b1", "Lec3/p1;", "_whoopBatteryLevelFlow", "Lec3/f2;", "c1", "Lec3/f2;", "q3", "()Lec3/f2;", "whoopBatteryLevelFlow", "Ljava/lang/String;", "()Ljava/lang/String;", "advertisingName", "e1", "j", "batteryPackOn", "f1", "_ecgStatusFlow", "Ljk0/g;", "g1", "Ljk0/g;", "n3", "()Ljk0/g;", "strapBodyStatus", "com/whoop/service/rearchitect/c$e", "h1", "Lcom/whoop/service/rearchitect/c$e;", "commandResponseCallback", "Llk0/b;", "i1", "Llk0/b;", "getEventCallback", "()Llk0/b;", "getEventCallback$annotations", "eventCallback", "com/whoop/service/rearchitect/c$f", "j1", "Lcom/whoop/service/rearchitect/c$f;", "connectionCallback", "Lor2/x;", "k1", "Lor2/x;", "helloPacketFailCounter", "Lec3/o1;", "l1", "Lec3/o1;", "getImuStreamFlow$annotations", "imuStreamFlow", "Lsj0/a;", "m1", "hrRealtimeStreamFlow", "n1", "ecgFilteredDataFlow", "o1", "realTimeImuStreamFlow", "p1", "historyLocked", "q1", "Lec3/l;", "realTimeImuDataStreamFlow", "f", "()Lcom/whoop/domain/model/WhoopStrapInfo;", "k", "()Lws0/a;", "whoopBatteryLevel", "Ltd1/a;", "d", "()Ltd1/a;", "getStrapGeneration$annotations", "strapGeneration", "w0", "()Lst0/v;", "strapGen", "i3", "ecgOn", "q0", "getImuDataStreamFlow$annotations", "imuDataStreamFlow", "hrRealtimeDataStreamFlow", "observeEcgFilteredPacketsFlow", "s3", "isHarvard", "t3", "isMaverick", "r1", "c", "a", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10015c extends AbstractC33664b implements InterfaceC21750d {

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    private final InterfaceC40188b analyticsManager;

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    private final C30076h whoopStrapSharedPrefs;

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    private final InterfaceC25435a mutex;

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    private final C30070b log;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    private final InterfaceC23462h crashReporter;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    private final C15578d strapAlarmEventPubSub;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    private final AbstractC12858c highFreqSyncEventPubSub;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    private final InterfaceC23462h historySyncRouter;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    private final C15578d whoopStrapEventsCallbacks;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    private final C15578d whoopStrapDataCallbacks;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    private final C15578d whoopStrapRealTimeDataCallbacks;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    private final C15578d whoopStrapMetadataCallbacks;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    private final C15578d whoopStrapMemfaultCallbacks;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    private final C26442a callbacksCompositeDisposables;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    private final C4329a bluetoothHelper;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private final InterfaceC23462h bleTaskExecutor;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    private final InterfaceC23462h configRepo;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    private a clockSynchronizer;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    private final InterfaceC23462h connectionAnalyticsHelper;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    private final InterfaceC23462h puffinManager;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    private final InterfaceC23462h strapUnlockService;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    private final long longRunningTaskTimeout;

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    private WhoopStrapInfo _strapInfo;

    /* JADX INFO: renamed from: X0, reason: from kotlin metadata */
    private final C22538a batteryLevel;

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    private final C22539b chargeStatus;

    /* JADX INFO: renamed from: Z0, reason: from kotlin metadata */
    private final c genericHrProfileController;

    /* JADX INFO: renamed from: a1, reason: from kotlin metadata */
    private C37605a _whoopBatteryLevel;

    /* JADX INFO: renamed from: b1, reason: from kotlin metadata */
    private final InterfaceC13075p1 _whoopBatteryLevelFlow;

    /* JADX INFO: renamed from: c1, reason: from kotlin metadata */
    private final InterfaceC13037f2 whoopBatteryLevelFlow;

    /* JADX INFO: renamed from: d1, reason: from kotlin metadata */
    private String advertisingName;

    /* JADX INFO: renamed from: e1, reason: from kotlin metadata */
    private boolean batteryPackOn;

    /* JADX INFO: renamed from: f1, reason: from kotlin metadata */
    private final InterfaceC13075p1 _ecgStatusFlow;

    /* JADX INFO: renamed from: g1, reason: from kotlin metadata */
    private final C21753g strapBodyStatus;

    /* JADX INFO: renamed from: h1, reason: from kotlin metadata */
    private final e commandResponseCallback;

    /* JADX INFO: renamed from: i1, reason: from kotlin metadata */
    private final AbstractC24490b eventCallback;

    /* JADX INFO: renamed from: j1, reason: from kotlin metadata */
    private final f connectionCallback;

    /* JADX INFO: renamed from: k1, reason: from kotlin metadata */
    private final C28213x helloPacketFailCounter;

    /* JADX INFO: renamed from: l1, reason: from kotlin metadata */
    private final InterfaceC13072o1 imuStreamFlow;

    /* JADX INFO: renamed from: m1, reason: from kotlin metadata */
    private final InterfaceC13072o1 hrRealtimeStreamFlow;

    /* JADX INFO: renamed from: n1, reason: from kotlin metadata */
    private final InterfaceC13072o1 ecgFilteredDataFlow;

    /* JADX INFO: renamed from: o1, reason: from kotlin metadata */
    private final InterfaceC13072o1 realTimeImuStreamFlow;

    /* JADX INFO: renamed from: p1, reason: from kotlin metadata */
    private boolean historyLocked;

    /* JADX INFO: renamed from: q1, reason: from kotlin metadata */
    private final InterfaceC13058l realTimeImuDataStreamFlow;

    /* JADX INFO: renamed from: z0, reason: from kotlin metadata */
    private final InterfaceC18732d dispatcherFactory;

    /* JADX INFO: renamed from: s1 */
    static final /* synthetic */ InterfaceC21493z[] f29766s1 = {AbstractC22671h0.f89337a.property1(new C22693x(C10015c.class, "log", "getLog()Ltimber/log/Timber$Tree;", 0))};

    /* JADX INFO: renamed from: r1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t1 */
    private static final AtomicBoolean f29767t1 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$a */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/service/rearchitect/c$a;", "", "<init>", "(Lcom/whoop/service/rearchitect/c;)V", "Lfk2/a;", "strapTimeParam", "", "b", "(Lfk2/a;Lq83/d;)Ljava/lang/Object;", "timeStamp", "a", "(Lfk2/a;)Z", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public final class a {

        /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap$ClockSynchronizer", m100430f = "WhoopStrap.kt", m100431l = {1629, 1638}, m100432m = "synchronizeClocks", m100433v = 2)
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41410a extends AbstractC32269c {

            /* JADX INFO: renamed from: F */
            int f29814F;

            /* JADX INFO: renamed from: w */
            Object f29815w;

            /* JADX INFO: renamed from: x */
            Object f29816x;

            /* JADX INFO: renamed from: y */
            int f29817y;

            /* JADX INFO: renamed from: z */
            /* synthetic */ Object f29818z;

            public C41410a(InterfaceC30057d<? super C41410a> interfaceC30057d) {
                super(interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                this.f29818z = obj;
                this.f29814F |= Integer.MIN_VALUE;
                return a.this.m24758b(null, this);
            }
        }

        /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$a$b */
        /* JADX INFO: loaded from: classes10.dex */
        @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap$ClockSynchronizer$synchronizeClocks$getClockResponse$1", m100430f = "WhoopStrap.kt", m100431l = {1630}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lzj0/g;", "<anonymous>", "(Lbc3/c0;)Lzj0/g;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f29819w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C10015c f29820x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C10015c c10015c, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f29820x = c10015c;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f29820x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC40724g> interfaceC30057d) {
                return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f29819w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C10015c c10015c = this.f29820x;
                    C38367m c38367m = new C38367m(this.f29820x.mo24752w0());
                    this.f29819w = 1;
                    obj = InterfaceC26794a.m79827T(c10015c, c38367m, 0L, false, this, 6, null);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                if (obj instanceof InterfaceC40724g) {
                    return (InterfaceC40724g) obj;
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$a$c */
        /* JADX INFO: loaded from: classes10.dex */
        @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap$ClockSynchronizer$synchronizeClocks$setClockResponse$1", m100430f = "WhoopStrap.kt", m100431l = {1639}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lzj0/h;", "<anonymous>", "(Lbc3/c0;)Lzj0/h;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class c extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f29821w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C10015c f29822x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(C10015c c10015c, InterfaceC30057d<? super c> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f29822x = c10015c;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new c(this.f29822x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C40727h> interfaceC30057d) {
                return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f29821w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C10015c c10015c = this.f29822x;
                C38388v0 c38388v0 = new C38388v0(new C14554a(), this.f29822x.mo24752w0());
                this.f29821w = 1;
                Object objM79827T = InterfaceC26794a.m79827T(c10015c, c38388v0, 0L, false, this, 6, null);
                return objM79827T == enumC31071a ? enumC31071a : objM79827T;
            }
        }

        public a() {
        }

        /* JADX INFO: renamed from: a */
        public final boolean m24757a(C14554a timeStamp) {
            AbstractC22676k.m65750j(timeStamp, "timeStamp");
            C14554a.b bVarM41577c = timeStamp.m41577c(C14554a.m41574g());
            C10015c.this.m24669l3().mo84372m("RTC time delta = {" + bVarM41577c + "}", new Object[0]);
            return bVarM41577c.m41589f() >= 2;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x005b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:20:0x005d  */
        /* JADX WARN: Code duplicated, block: B:29:0x0097 A[PHI: r2 r11
          0x0097: PHI (r2v4 int) = (r2v2 int), (r2v2 int), (r2v5 int) binds: [B:24:0x008c, B:26:0x0092, B:36:0x00ce] A[DONT_GENERATE, DONT_INLINE]
          0x0097: PHI (r11v6 fk2.a) = (r11v2 fk2.a), (r11v2 fk2.a), (r11v8 fk2.a) binds: [B:24:0x008c, B:26:0x0092, B:36:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:30:0x0099 A[PHI: r2 r11
          0x0099: PHI (r2v1 int) = (r2v2 int), (r2v3 int) binds: [B:28:0x0095, B:19:0x005b] A[DONT_GENERATE, DONT_INLINE]
          0x0099: PHI (r11v1 fk2.a) = (r11v3 fk2.a), (r11v4 fk2.a) binds: [B:28:0x0095, B:19:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:32:0x009f  */
        /* JADX WARN: Code duplicated, block: B:41:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
        
            if (r12 == r1) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00c9, code lost:
        
            if (r12 == r1) goto L34;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x008c -> B:29:0x0097). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0092 -> B:29:0x0097). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c9 -> B:35:0x00cc). Please report as a decompilation issue!!! */
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object m24758b(fk2.C14554a r11, q83.InterfaceC30057d<? super java.lang.Boolean> r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 240
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.service.rearchitect.C10015c.a.m24758b(fk2.a, q83.d):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$a0 */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap", m100430f = "WhoopStrap.kt", m100431l = {842}, m100432m = "sendSetAlarmTimeCommand", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a0 extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f29823E;

        /* JADX INFO: renamed from: w */
        Object f29824w;

        /* JADX INFO: renamed from: x */
        long f29825x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f29826y;

        public a0(InterfaceC30057d<? super a0> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f29826y = obj;
            this.f29823E |= Integer.MIN_VALUE;
            return C10015c.this.mo24717b0(null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$b, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0019\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Lcom/whoop/service/rearchitect/c$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/bluetooth/BluetoothDevice;", "bluetoothDevice", "Ljava/lang/Class;", "Lys0/a;", "bleHandlerImpl", "Lin2/d;", "dispatcherFactory", "Lz82/b;", "analyticsManager", "Lq92/h;", "whoopStrapSharedPrefs", "Landroid/os/HandlerThread;", "handlerThread", "Lbc3/c0;", "scope", "Lcom/whoop/service/rearchitect/c;", "a", "(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Ljava/lang/Class;Lin2/d;Lz82/b;Lq92/h;Landroid/os/HandlerThread;Lbc3/c0;)Lcom/whoop/service/rearchitect/c;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isOnBody", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "isOnBody$annotations", "", "HIGH_FREQ_JOB", "Ljava/lang/String;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static C10015c m24759b(Companion companion, Context context, BluetoothDevice bluetoothDevice, Class cls, InterfaceC18732d interfaceC18732d, InterfaceC40188b interfaceC40188b, C30076h c30076h, HandlerThread handlerThread, InterfaceC2994c0 interfaceC2994c0, int i13, Object obj) {
            return companion.m24760a(context, bluetoothDevice, cls, interfaceC18732d, interfaceC40188b, c30076h, (i13 & 64) != 0 ? new HandlerThread("Whoop Strap Handler") : handlerThread, (i13 & 128) != 0 ? AbstractC3006f0.m8708b(AbstractC12889b.m36254T(AbstractC3006f0.m8710d(), interfaceC18732d.getMain())) : interfaceC2994c0);
        }

        /* JADX INFO: renamed from: a */
        public final C10015c m24760a(Context context, BluetoothDevice bluetoothDevice, Class<? extends InterfaceC39750a> bleHandlerImpl, InterfaceC18732d dispatcherFactory, InterfaceC40188b analyticsManager, C30076h whoopStrapSharedPrefs, HandlerThread handlerThread, InterfaceC2994c0 scope) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(bluetoothDevice, "bluetoothDevice");
            AbstractC22676k.m65750j(bleHandlerImpl, "bleHandlerImpl");
            AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
            AbstractC22676k.m65750j(analyticsManager, "analyticsManager");
            AbstractC22676k.m65750j(whoopStrapSharedPrefs, "whoopStrapSharedPrefs");
            AbstractC22676k.m65750j(handlerThread, "handlerThread");
            AbstractC22676k.m65750j(scope, "scope");
            C10015c c10015c = new C10015c(context, bluetoothDevice, bleHandlerImpl, dispatcherFactory, analyticsManager, whoopStrapSharedPrefs, handlerThread, null, scope, 128, null);
            AbstractC33664b.m106364u2(c10015c, null, 1, null);
            return c10015c;
        }

        /* JADX INFO: renamed from: c */
        public final AtomicBoolean m24761c() {
            return C10015c.f29767t1;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$b0 */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap", m100430f = "WhoopStrap.kt", m100431l = {768}, m100432m = "sendToggleGenericHeartRateProfileCommand", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b0 extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f29828E;

        /* JADX INFO: renamed from: w */
        boolean f29829w;

        /* JADX INFO: renamed from: x */
        long f29830x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f29831y;

        public b0(InterfaceC30057d<? super b0> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f29831y = obj;
            this.f29828E |= Integer.MIN_VALUE;
            return C10015c.this.mo24707U(false, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$c */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/service/rearchitect/c$c;", "Ltj0/a;", "<init>", "(Lcom/whoop/service/rearchitect/c;)V", "Ll73/c;", "Ltj0/b;", "c", "()Ll73/c;", "Ll83/a0;", "b", "()V", "a", "Lzj0/t;", "packet", "g", "(Lzj0/t;)V", "Lg83/b;", "Ll83/h;", "f", "()Lg83/b;", "stateSubject", "", "Ljava/lang/Object;", "lock", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public final class c implements InterfaceC33864a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC23462h stateSubject = AbstractC30060g.m92088H(new C25371a(18));

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Object lock = new Object();

        /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$c$a */
        /* JADX INFO: loaded from: classes10.dex */
        @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap$NordicGenericHrProfileController$disable$1$1", m100430f = "WhoopStrap.kt", m100431l = {1581}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f29836w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C10015c f29837x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ c f29838y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C10015c c10015c, c cVar, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f29837x = c10015c;
                this.f29838y = cVar;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f29837x, this.f29838y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                a aVar;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f29836w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C10015c c10015c = this.f29837x;
                    this.f29836w = 1;
                    aVar = this;
                    obj = InterfaceC21750d.m61376W0(c10015c, false, 0L, aVar, 2, null);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    aVar = this;
                }
                C40717d1 c40717d1 = (C40717d1) obj;
                if (c40717d1 == null || !c40717d1.m132198W()) {
                    if (EnumC37318b.FAILURE == (c40717d1 != null ? c40717d1.m132197V() : null)) {
                        aVar.f29837x.m24669l3().mo84371h(AbstractC11266d.m30461o("Generic HR Profile disable failed with data: ", AbstractC40586b.m131617b(c40717d1.m132194S())), new Object[0]);
                    } else {
                        aVar.f29837x.m24669l3().mo84371h("Generic HR Profile disable failed. No response", new Object[0]);
                    }
                } else {
                    aVar.f29837x.m24669l3().mo84371h("Generic HR Profile disabled", new Object[0]);
                    aVar.f29838y.m24764f().onNext(EnumC33865b.DISABLED);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$c$b */
        /* JADX INFO: loaded from: classes10.dex */
        @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap$NordicGenericHrProfileController$enable$1$1", m100430f = "WhoopStrap.kt", m100431l = {1562}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f29839w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C10015c f29840x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ c f29841y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C10015c c10015c, c cVar, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f29840x = c10015c;
                this.f29841y = cVar;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f29840x, this.f29841y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                b bVar;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f29839w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C10015c c10015c = this.f29840x;
                    this.f29839w = 1;
                    bVar = this;
                    obj = InterfaceC21750d.m61376W0(c10015c, true, 0L, bVar, 2, null);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    bVar = this;
                }
                C40717d1 c40717d1 = (C40717d1) obj;
                if (c40717d1 == null || !c40717d1.m132198W()) {
                    if (EnumC37318b.FAILURE == (c40717d1 != null ? c40717d1.m132197V() : null)) {
                        bVar.f29840x.m24669l3().mo84371h(AbstractC11266d.m30461o("Generic HR Profile enable failed with data: ", AbstractC40586b.m131617b(c40717d1.m132194S())), new Object[0]);
                    } else {
                        bVar.f29840x.m24669l3().mo84371h("Generic HR Profile enable failed. No response", new Object[0]);
                    }
                } else {
                    bVar.f29840x.m24669l3().mo84371h("Generic HR Profile enabled", new Object[0]);
                    bVar.f29841y.m24764f().onNext(EnumC33865b.ENABLED);
                }
                return C23454a0.f92919a;
            }
        }

        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public final C15576b m24764f() {
            Object value = this.stateSubject.getValue();
            AbstractC22676k.m65749i(value, "getValue(...)");
            return (C15576b) value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final C15576b m24765h() {
            return new C15576b();
        }

        @Override // tj0.InterfaceC33864a
        /* JADX INFO: renamed from: a */
        public void mo24766a() {
            Object obj = this.lock;
            C10015c c10015c = C10015c.this;
            synchronized (obj) {
                c10015c.m24669l3().mo84371h("Disabling Generic HR profile", new Object[0]);
                AbstractC3006f0.m8732z(c10015c.getScope(), null, null, new a(c10015c, this, null), 3);
            }
        }

        @Override // tj0.InterfaceC33864a
        /* JADX INFO: renamed from: b */
        public void mo24767b() {
            Object obj = this.lock;
            C10015c c10015c = C10015c.this;
            synchronized (obj) {
                c10015c.m24669l3().mo84371h("Enabling Generic HR profile", new Object[0]);
                AbstractC3006f0.m8732z(c10015c.getScope(), null, null, new b(c10015c, this, null), 3);
            }
        }

        @Override // tj0.InterfaceC33864a
        /* JADX INFO: renamed from: c */
        public AbstractC23412c mo24768c() {
            return m24764f();
        }

        /* JADX INFO: renamed from: g */
        public final void m24769g(InterfaceC40756t packet) {
            AbstractC22676k.m65750j(packet, "packet");
            synchronized (this.lock) {
                try {
                    m24764f().onNext(packet.getHrBroadcastState() ? EnumC33865b.ENABLED : EnumC33865b.DISABLED);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$c0 */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap", m100430f = "WhoopStrap.kt", m100431l = {756}, m100432m = "sendToggleRealtimeHeartRateCommandSuspend", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c0 extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f29842E;

        /* JADX INFO: renamed from: w */
        boolean f29843w;

        /* JADX INFO: renamed from: x */
        long f29844x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f29845y;

        public c0(InterfaceC30057d<? super c0> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f29845y = obj;
            this.f29842E |= Integer.MIN_VALUE;
            return C10015c.this.mo24725e0(false, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f29847a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f29848b;

        static {
            int[] iArr = new int[EnumC32978v.values().length];
            try {
                iArr[EnumC32978v.PUFFIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC32978v.MONUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC32978v.SYMPHONY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC32978v.GEN_4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC32978v.GOOSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC32978v.MAVERICK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f29847a = iArr;
            int[] iArr2 = new int[EnumC32973q.values().length];
            try {
                iArr2[EnumC32973q.LOCKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC32973q.UNLOCKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f29848b = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$d0 */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap", m100430f = "WhoopStrap.kt", m100431l = {1097, 1098, 1101}, m100432m = "sendTurnOnOffRawDataRealtime", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d0 extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f29849E;

        /* JADX INFO: renamed from: w */
        boolean f29850w;

        /* JADX INFO: renamed from: x */
        long f29851x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f29852y;

        public d0(InterfaceC30057d<? super d0> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f29852y = obj;
            this.f29849E |= Integer.MIN_VALUE;
            return C10015c.this.mo24741o(false, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$e */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"com/whoop/service/rearchitect/c$e", "Llk0/a;", "Lak0/c;", "getAdvertisingNameHarvardResponsePacket", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lak0/c;)V", "Lzj0/l;", "getAdvertisingNameResponsePacket", "g", "(Lzj0/l;)V", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC24489a {
        /* JADX WARN: Multi-variable type inference failed */
        public e() {
            super(null, 1, 0 == true ? 1 : 0);
        }

        @Override // lk0.AbstractC24489a
        /* JADX INFO: renamed from: g */
        public void mo24770g(C40739l getAdvertisingNameResponsePacket) {
            AbstractC22676k.m65750j(getAdvertisingNameResponsePacket, "getAdvertisingNameResponsePacket");
            C10015c.this.advertisingName = getAdvertisingNameResponsePacket.m132229X();
            String advertisingName = C10015c.this.getAdvertisingName();
            if (advertisingName != null) {
                C10015c.this.whoopStrapSharedPrefs.m92204j(advertisingName);
            }
        }

        @Override // lk0.AbstractC24489a
        /* JADX INFO: renamed from: h */
        public void mo24771h(C0941c getAdvertisingNameHarvardResponsePacket) {
            AbstractC22676k.m65750j(getAdvertisingNameHarvardResponsePacket, "getAdvertisingNameHarvardResponsePacket");
            C10015c.this.advertisingName = getAdvertisingNameHarvardResponsePacket.m2370X();
            String advertisingName = C10015c.this.getAdvertisingName();
            if (advertisingName != null) {
                C10015c.this.whoopStrapSharedPrefs.m92204j(advertisingName);
            }
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$e0 */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap", m100430f = "WhoopStrap.kt", m100431l = {1212, 1213, 1214, 1215}, m100432m = "setPersistentRawDataAndReboot", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e0 extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f29855E;

        /* JADX INFO: renamed from: w */
        boolean f29856w;

        /* JADX INFO: renamed from: x */
        long f29857x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f29858y;

        public e0(InterfaceC30057d<? super e0> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f29858y = obj;
            this.f29855E |= Integer.MIN_VALUE;
            return C10015c.this.mo24709V0(false, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$f */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m65681d2 = {"com/whoop/service/rearchitect/c$f", "Lq92/g;", "Ll83/a0;", "l", "()V", "n", "p", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC30075g {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC2994c0 f29860E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(InterfaceC2994c0 interfaceC2994c0) {
            super(null, 1, 0 == true ? 1 : 0);
            this.f29860E = interfaceC2994c0;
        }

        @Override // q92.AbstractC30075g
        /* JADX INFO: renamed from: l */
        public void mo24772l() {
            C10015c.this._strapInfo = null;
            AbstractC3006f0.m8718l(this.f29860E.getCoroutineContext());
        }

        @Override // q92.AbstractC30075g
        /* JADX INFO: renamed from: n */
        public void mo24773n() {
            C10015c.this.m24669l3().mo84371h("on exchanging hello", new Object[0]);
        }

        @Override // q92.AbstractC30075g
        /* JADX INFO: renamed from: p */
        public void mo24774p() {
            C10015c.this.m24669l3().mo84371h("on setting rtc", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$f0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f29862w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f29863x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f29864y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f29862w = interfaceC27903a;
            this.f29863x = interfaceC35951a;
            this.f29864y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, rr2.c] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC31766c invoke() {
            InterfaceC27903a interfaceC27903a = this.f29862w;
            InterfaceC35951a interfaceC35951a = this.f29863x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f29864y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC31766c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$g */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap$doInitializeWhenReady$1", m100430f = "WhoopStrap.kt", m100431l = {1271, 1330, 1331, 1334, 1338}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        Object f29865E;

        /* JADX INFO: renamed from: F */
        Object f29866F;

        /* JADX INFO: renamed from: G */
        int f29867G;

        /* JADX INFO: renamed from: H */
        int f29868H;

        /* JADX INFO: renamed from: I */
        int f29869I;

        /* JADX INFO: renamed from: J */
        int f29870J;

        /* JADX INFO: renamed from: K */
        int f29871K;

        /* JADX INFO: renamed from: M */
        final /* synthetic */ int f29873M;

        /* JADX INFO: renamed from: w */
        Object f29874w;

        /* JADX INFO: renamed from: x */
        Object f29875x;

        /* JADX INFO: renamed from: y */
        Object f29876y;

        /* JADX INFO: renamed from: z */
        Object f29877z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i13, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f29873M = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C10015c.this.new g(this.f29873M, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:68:0x0332  */
        /* JADX WARN: Code duplicated, block: B:71:0x0355  */
        /* JADX WARN: Code duplicated, block: B:75:0x03c0 A[PHI: r0 r3 r4 r5 r11 r12 r13 r14
          0x03c0: PHI (r0v34 int) = (r0v33 int), (r0v47 int) binds: [B:73:0x03bd, B:12:0x003d] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r3v33 int) = (r3v32 int), (r3v41 int) binds: [B:73:0x03bd, B:12:0x003d] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r4v25 int) = (r4v24 int), (r4v33 int) binds: [B:73:0x03bd, B:12:0x003d] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r5v10 int) = (r9v0 int), (r5v19 int) binds: [B:73:0x03bd, B:12:0x003d] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r11v8 int) = (r11v7 int), (r11v15 int) binds: [B:73:0x03bd, B:12:0x003d] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r12v18 com.whoop.service.rearchitect.c$a) = (r12v17 com.whoop.service.rearchitect.c$a), (r12v28 com.whoop.service.rearchitect.c$a) binds: [B:73:0x03bd, B:12:0x003d] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r13v11 zj0.t) = (r13v10 zj0.t), (r13v22 zj0.t) binds: [B:73:0x03bd, B:12:0x003d] A[DONT_GENERATE, DONT_INLINE]
          0x03c0: PHI (r14v7 com.whoop.service.rearchitect.c) = (r14v6 com.whoop.service.rearchitect.c), (r14v14 com.whoop.service.rearchitect.c) binds: [B:73:0x03bd, B:12:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:78:0x03f7  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC40756t interfaceC40756t;
            C10015c c10015c;
            int i13;
            int i14;
            a aVar;
            Object objM24758b;
            InterfaceC40756t interfaceC40756t2;
            WhoopStrapInfo whoopStrapInfo;
            int i15;
            int i16;
            int i17;
            EnumC32978v enumC32978vMo132247c;
            WhoopStrapInfo whoopStrapInfo2;
            InterfaceC40756t interfaceC40756t3;
            C10015c c10015c2;
            C30073e c30073eM106385V1;
            String strapSignature;
            Object objM24683z3;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i18 = this.f29871K;
            C23454a0 c23454a0 = C23454a0.f92919a;
            int i19 = 1;
            try {
                if (i18 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C10015c.this.getStateMachine().m92169r(C32966j.f137295a);
                    C10015c.this.m24669l3().mo84371h(AbstractC2875y.m8296i(this.f29873M, "Connection Step: ", " BLE Synchronously sending Get Hello Command Packet Request Starting..."), new Object[0]);
                    C10015c c10015c3 = C10015c.this;
                    this.f29871K = 1;
                    objM24683z3 = c10015c3.m24683z3(this);
                    if (objM24683z3 == enumC31071a) {
                    }
                    return enumC31071a;
                }
                if (i18 == 1) {
                    AbstractC34132o.m107864I(obj);
                    objM24683z3 = obj;
                } else if (i18 == 2) {
                    i16 = this.f29870J;
                    i15 = this.f29869I;
                    int i24 = this.f29868H;
                    i13 = this.f29867G;
                    aVar = (a) this.f29865E;
                    whoopStrapInfo = (WhoopStrapInfo) this.f29877z;
                    interfaceC40756t2 = (InterfaceC40756t) this.f29876y;
                    c10015c = (C10015c) this.f29875x;
                    AbstractC34132o.m107864I(obj);
                    i17 = i24;
                    objM24758b = obj;
                    if (((Boolean) objM24758b).booleanValue()) {
                        this.f29874w = null;
                        this.f29875x = c10015c;
                        this.f29876y = interfaceC40756t2;
                        this.f29877z = whoopStrapInfo;
                        this.f29865E = aVar;
                        this.f29866F = null;
                        this.f29867G = i13;
                        this.f29868H = i17;
                        this.f29869I = i15;
                        this.f29870J = i16;
                        this.f29871K = 3;
                        if (c10015c.mo24715a1(5000L, this) != enumC31071a) {
                            whoopStrapInfo2 = whoopStrapInfo;
                            interfaceC40756t3 = interfaceC40756t2;
                            c10015c2 = c10015c;
                            c10015c2.m24645K1().mo71178a(new InterfaceC35208d.d(c10015c2.mo24752w0(), InterfaceC35208d.b.SUCCESS, null, 4, null));
                            c10015c2.whoopStrapSharedPrefs.m92203i(c10015c2.getBluetoothDevice(), whoopStrapInfo2.getWhoopDeviceType(), c10015c2.getAdvertisingName(), whoopStrapInfo2.getSerialNumber(), whoopStrapInfo2.getMaximVersion().mo84319a(), whoopStrapInfo2.getBluetoothVersion().mo84319a());
                            c30073eM106385V1 = c10015c2.m106385V1();
                            strapSignature = whoopStrapInfo2.getStrapSignature();
                            this.f29874w = null;
                            this.f29875x = c10015c2;
                            this.f29876y = interfaceC40756t3;
                            this.f29877z = null;
                            this.f29865E = aVar;
                            this.f29866F = null;
                            this.f29867G = i13;
                            this.f29868H = i17;
                            this.f29869I = i15;
                            this.f29870J = i16;
                            this.f29871K = 4;
                            if (c30073eM106385V1.m92184d(strapSignature, this) != enumC31071a) {
                                c10015c2.m24669l3().mo84371h(AbstractC2875y.m8296i(i13 + i19, "Connection Step: ", " BLE Synchronous Clock Synchronization Completed Successfully"), new Object[0]);
                                c10015c2.helloPacketFailCounter.m85402c();
                                c10015c2.m106396r2(null);
                                this.f29874w = null;
                                this.f29875x = null;
                                this.f29876y = null;
                                this.f29877z = aVar;
                                this.f29865E = null;
                                this.f29866F = null;
                                this.f29867G = i17;
                                this.f29868H = i15;
                                this.f29869I = i16;
                                this.f29871K = 5;
                                if (c10015c2.m24673r3(interfaceC40756t3, this) == enumC31071a) {
                                }
                            }
                        }
                        return enumC31071a;
                    }
                    c10015c.m24645K1().mo71178a(new InterfaceC35208d.d(c10015c.mo24752w0(), InterfaceC35208d.b.FAIL, null, 4, null));
                    c10015c.m106396r2(EnumC25628a.SET_RTC_FAILED);
                    c10015c.m106373D1();
                } else {
                    if (i18 == 3) {
                        i16 = this.f29870J;
                        int i25 = this.f29869I;
                        int i26 = this.f29868H;
                        int i27 = this.f29867G;
                        a aVar2 = (a) this.f29865E;
                        WhoopStrapInfo whoopStrapInfo3 = (WhoopStrapInfo) this.f29877z;
                        InterfaceC40756t interfaceC40756t4 = (InterfaceC40756t) this.f29876y;
                        C10015c c10015c4 = (C10015c) this.f29875x;
                        AbstractC34132o.m107864I(obj);
                        c10015c2 = c10015c4;
                        i15 = i25;
                        i17 = i26;
                        whoopStrapInfo2 = whoopStrapInfo3;
                        i13 = i27;
                        aVar = aVar2;
                        interfaceC40756t3 = interfaceC40756t4;
                        c10015c2.m24645K1().mo71178a(new InterfaceC35208d.d(c10015c2.mo24752w0(), InterfaceC35208d.b.SUCCESS, null, 4, null));
                        c10015c2.whoopStrapSharedPrefs.m92203i(c10015c2.getBluetoothDevice(), whoopStrapInfo2.getWhoopDeviceType(), c10015c2.getAdvertisingName(), whoopStrapInfo2.getSerialNumber(), whoopStrapInfo2.getMaximVersion().mo84319a(), whoopStrapInfo2.getBluetoothVersion().mo84319a());
                        c30073eM106385V1 = c10015c2.m106385V1();
                        strapSignature = whoopStrapInfo2.getStrapSignature();
                        this.f29874w = null;
                        this.f29875x = c10015c2;
                        this.f29876y = interfaceC40756t3;
                        this.f29877z = null;
                        this.f29865E = aVar;
                        this.f29866F = null;
                        this.f29867G = i13;
                        this.f29868H = i17;
                        this.f29869I = i15;
                        this.f29870J = i16;
                        this.f29871K = 4;
                        if (c30073eM106385V1.m92184d(strapSignature, this) != enumC31071a) {
                            c10015c2.m24669l3().mo84371h(AbstractC2875y.m8296i(i13 + i19, "Connection Step: ", " BLE Synchronous Clock Synchronization Completed Successfully"), new Object[0]);
                            c10015c2.helloPacketFailCounter.m85402c();
                            c10015c2.m106396r2(null);
                            this.f29874w = null;
                            this.f29875x = null;
                            this.f29876y = null;
                            this.f29877z = aVar;
                            this.f29865E = null;
                            this.f29866F = null;
                            this.f29867G = i17;
                            this.f29868H = i15;
                            this.f29869I = i16;
                            this.f29871K = 5;
                            if (c10015c2.m24673r3(interfaceC40756t3, this) == enumC31071a) {
                            }
                        }
                        return enumC31071a;
                    }
                    if (i18 == 4) {
                        i16 = this.f29870J;
                        i15 = this.f29869I;
                        i17 = this.f29868H;
                        int i28 = this.f29867G;
                        aVar = (a) this.f29865E;
                        interfaceC40756t3 = (InterfaceC40756t) this.f29876y;
                        c10015c2 = (C10015c) this.f29875x;
                        AbstractC34132o.m107864I(obj);
                        i13 = i28;
                        i19 = 1;
                        c10015c2.m24669l3().mo84371h(AbstractC2875y.m8296i(i13 + i19, "Connection Step: ", " BLE Synchronous Clock Synchronization Completed Successfully"), new Object[0]);
                        c10015c2.helloPacketFailCounter.m85402c();
                        c10015c2.m106396r2(null);
                        this.f29874w = null;
                        this.f29875x = null;
                        this.f29876y = null;
                        this.f29877z = aVar;
                        this.f29865E = null;
                        this.f29866F = null;
                        this.f29867G = i17;
                        this.f29868H = i15;
                        this.f29869I = i16;
                        this.f29871K = 5;
                        if (c10015c2.m24673r3(interfaceC40756t3, this) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i18 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                }
                return c23454a0;
                interfaceC40756t = (InterfaceC40756t) objM24683z3;
            } catch (Exception e5) {
                C10015c.this.m24669l3().mo84370d(e5, "Failed to send hello response packet", new Object[0]);
                C10015c.this.m24645K1().mo71178a(new InterfaceC35208d.d(C10015c.this.mo24752w0(), InterfaceC35208d.b.FAIL, null, 4, null));
                interfaceC40756t = null;
            }
            if (interfaceC40756t == null) {
                C10015c.this.m24645K1().mo71178a(new InterfaceC35208d.d(C10015c.this.mo24752w0(), InterfaceC35208d.b.FAIL, null, 4, null));
                C10015c.this.m106396r2(EnumC25628a.HELLO_PACKET_EXCHANGE_FAILED);
                C10015c.this.helloPacketFailCounter.m85401b();
                C10015c.this.m24669l3().mo84367a(AbstractC2875y.m8295h(C10015c.this.helloPacketFailCounter.m85400a(), "After incrementing failure counter for hello packet, current count now at "), new Object[0]);
                if (C10015c.this.m106381P1().isFeatureEnabled(CoreFeatureFlagsKt.DROID_REMOVE_BOND_ON_HELLO_PACKET_FAILURE) || C10015c.this.helloPacketFailCounter.m85400a() < 5) {
                    C10015c.this.m24685C3();
                } else {
                    C10015c.this.m24669l3().mo84373n("Threshold reached for the failure count, deleting bond information", new Object[0]);
                    C10015c.this.helloPacketFailCounter.m85402c();
                    C10015c.this.m24720c3();
                }
            } else {
                c10015c = C10015c.this;
                i13 = this.f29873M;
                c10015c.m24669l3().mo84371h(AbstractC11266d.m30456j(i13, "Connection Step: ", " BLE Synchronous send got Hello Command Response Packet Successfully: ", interfaceC40756t.mo132212G()), new Object[0]);
                c10015c.m24669l3().mo84371h(AbstractC2875y.m8296i(i13 + 1, "Connection Step: ", " BLE Synchronous Clock Synchronization Starting..."), new Object[0]);
                if (c10015c.getBluetoothDevice().getName() == null) {
                    c10015c.m24645K1().mo71178a(new InterfaceC35208d.d(c10015c.mo24752w0(), InterfaceC35208d.b.FAIL, null, 4, null));
                    c10015c.m24667h3().mo98626g(new BluetoothDeviceNameMissingException(), "Disconnecting due to missing bluetooth device name");
                    c10015c.m106373D1();
                    return c23454a0;
                }
                if ((interfaceC40756t instanceof InterfaceC40756t.b) && (enumC32978vMo132247c = ((InterfaceC40756t.b) interfaceC40756t).mo132247c()) != null) {
                    c10015c.m106397s2(enumC32978vMo132247c);
                }
                C10015c.INSTANCE.m24761c().set(interfaceC40756t.getIsOnBody());
                c10015c.mo24695J().m61389b(interfaceC40756t.getIsOnBody() ? EnumC21747a.STRAP_ON_BODY : EnumC21747a.STRAP_OFF_BODY);
                String name = c10015c.getBluetoothDevice().getName();
                AbstractC22676k.m65749i(name, "getName(...)");
                c10015c._strapInfo = c10015c.m24663b3(name, interfaceC40756t, c10015c.mo24752w0());
                c10015c.getBatteryLevel().m65134c(interfaceC40756t.getBatteryLevel());
                c10015c.m24638E3(interfaceC40756t.getWhoopBatteryLevel());
                c10015c.getChargeStatus().m65148c(interfaceC40756t.getChargingStatus());
                WhoopStrapInfo whoopStrapInfo4 = c10015c._strapInfo;
                AbstractC22676k.m65747g(whoopStrapInfo4);
                String serialNumber = whoopStrapInfo4.getSerialNumber();
                int i29 = 0;
                while (true) {
                    if (i29 >= serialNumber.length()) {
                        i14 = 1;
                        break;
                    }
                    if (serialNumber.charAt(i29) != '0') {
                        i14 = 0;
                        break;
                    }
                    i29++;
                }
                if (i14 != 0) {
                    c10015c.m24755y3();
                    c10015c.m24645K1().mo71178a(new InterfaceC35208d.d(c10015c.mo24752w0(), InterfaceC35208d.b.FAIL, null, 4, null));
                }
                if (!whoopStrapInfo4.areCpuIdAndSerialValid()) {
                    String strM24671o3 = c10015c.m24671o3(whoopStrapInfo4);
                    c10015c.m24669l3().mo84368b("Invalid strap: " + c10015c._strapInfo, new Object[0]);
                    c10015c.getStateMachine().m92169r(new C32965i(67, strM24671o3));
                    c10015c.m24645K1().mo71178a(new InterfaceC35208d.d(c10015c.mo24752w0(), InterfaceC35208d.b.FAIL, null, 4, null));
                    c10015c.m106373D1();
                    return c23454a0;
                }
                c10015c.mo24724e().m24769g(interfaceC40756t);
                c10015c.getStateMachine().m92169r(C32971o.f137299a);
                aVar = c10015c.clockSynchronizer;
                if (aVar != null) {
                    C14554a time = interfaceC40756t.getTime();
                    this.f29874w = null;
                    this.f29875x = c10015c;
                    this.f29876y = interfaceC40756t;
                    this.f29877z = whoopStrapInfo4;
                    this.f29865E = aVar;
                    this.f29866F = null;
                    this.f29867G = i13;
                    this.f29868H = 0;
                    this.f29869I = i14;
                    this.f29870J = 0;
                    this.f29871K = 2;
                    objM24758b = aVar.m24758b(time, this);
                    if (objM24758b != enumC31071a) {
                        interfaceC40756t2 = interfaceC40756t;
                        whoopStrapInfo = whoopStrapInfo4;
                        i15 = i14;
                        i16 = 0;
                        i17 = 0;
                        if (((Boolean) objM24758b).booleanValue()) {
                            this.f29874w = null;
                            this.f29875x = c10015c;
                            this.f29876y = interfaceC40756t2;
                            this.f29877z = whoopStrapInfo;
                            this.f29865E = aVar;
                            this.f29866F = null;
                            this.f29867G = i13;
                            this.f29868H = i17;
                            this.f29869I = i15;
                            this.f29870J = i16;
                            this.f29871K = 3;
                            if (c10015c.mo24715a1(5000L, this) != enumC31071a) {
                                whoopStrapInfo2 = whoopStrapInfo;
                                interfaceC40756t3 = interfaceC40756t2;
                                c10015c2 = c10015c;
                                c10015c2.m24645K1().mo71178a(new InterfaceC35208d.d(c10015c2.mo24752w0(), InterfaceC35208d.b.SUCCESS, null, 4, null));
                                c10015c2.whoopStrapSharedPrefs.m92203i(c10015c2.getBluetoothDevice(), whoopStrapInfo2.getWhoopDeviceType(), c10015c2.getAdvertisingName(), whoopStrapInfo2.getSerialNumber(), whoopStrapInfo2.getMaximVersion().mo84319a(), whoopStrapInfo2.getBluetoothVersion().mo84319a());
                                c30073eM106385V1 = c10015c2.m106385V1();
                                strapSignature = whoopStrapInfo2.getStrapSignature();
                                this.f29874w = null;
                                this.f29875x = c10015c2;
                                this.f29876y = interfaceC40756t3;
                                this.f29877z = null;
                                this.f29865E = aVar;
                                this.f29866F = null;
                                this.f29867G = i13;
                                this.f29868H = i17;
                                this.f29869I = i15;
                                this.f29870J = i16;
                                this.f29871K = 4;
                                if (c30073eM106385V1.m92184d(strapSignature, this) != enumC31071a) {
                                    c10015c2.m24669l3().mo84371h(AbstractC2875y.m8296i(i13 + i19, "Connection Step: ", " BLE Synchronous Clock Synchronization Completed Successfully"), new Object[0]);
                                    c10015c2.helloPacketFailCounter.m85402c();
                                    c10015c2.m106396r2(null);
                                    this.f29874w = null;
                                    this.f29875x = null;
                                    this.f29876y = null;
                                    this.f29877z = aVar;
                                    this.f29865E = null;
                                    this.f29866F = null;
                                    this.f29867G = i17;
                                    this.f29868H = i15;
                                    this.f29869I = i16;
                                    this.f29871K = 5;
                                    if (c10015c2.m24673r3(interfaceC40756t3, this) == enumC31071a) {
                                    }
                                }
                            }
                        } else {
                            c10015c.m24645K1().mo71178a(new InterfaceC35208d.d(c10015c.mo24752w0(), InterfaceC35208d.b.FAIL, null, 4, null));
                            c10015c.m106396r2(EnumC25628a.SET_RTC_FAILED);
                            c10015c.m106373D1();
                        }
                    }
                    return enumC31071a;
                }
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$g0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f29878w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f29879x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f29880y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f29878w = interfaceC27903a;
            this.f29879x = interfaceC35951a;
            this.f29880y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [ca2.f, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC4366f invoke() {
            InterfaceC27903a interfaceC27903a = this.f29878w;
            InterfaceC35951a interfaceC35951a = this.f29879x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f29880y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC4366f.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$h */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"com/whoop/service/rearchitect/c$h", "Llk0/b;", "Llt0/m;", "returnedObj", "Ll83/a0;", "f", "(Llt0/m;)V", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC24490b {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC2994c0 f29881E;

        /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$h$a */
        /* JADX INFO: loaded from: classes10.dex */
        @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap$eventCallback$1$handleCallback$1", m100430f = "WhoopStrap.kt", m100431l = {407}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f29883w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C10015c f29884x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C10015c c10015c, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f29884x = c10015c;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f29884x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) throws Throwable {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f29883w;
                try {
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        a aVar = this.f29884x.clockSynchronizer;
                        if (aVar != null) {
                            this.f29883w = 1;
                            obj = aVar.m24758b(null, this);
                            if (obj == enumC31071a) {
                                return enumC31071a;
                            }
                        }
                        return C23454a0.f92919a;
                    }
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                } catch (Exception e5) {
                    this.f29884x.m24669l3().mo84370d(e5, "Failed sync clock after RtcLostEventPacket", new Object[0]);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$h$b */
        /* JADX INFO: loaded from: classes10.dex */
        @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap$eventCallback$1$handleCallback$2", m100430f = "WhoopStrap.kt", m100431l = {472}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f29885w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C10015c f29886x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ AbstractC24726c f29887y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C10015c c10015c, AbstractC24726c abstractC24726c, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f29886x = c10015c;
                this.f29887y = abstractC24726c;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f29886x, this.f29887y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f29885w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C39228j c39228jM24670m3 = this.f29886x.m24670m3();
                    String strM37332T = ((C13277d) this.f29887y).m37332T();
                    InterfaceC35208d.c cVar = InterfaceC35208d.c.SLIDE_IN;
                    this.f29885w = 1;
                    if (c39228jM24670m3.m124992c(strM37332T, cVar, this) == enumC31071a) {
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
        public h(InterfaceC2994c0 interfaceC2994c0) {
            super(null, 1, null);
            this.f29881E = interfaceC2994c0;
        }

        @Override // en0.AbstractC13363a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo24775d(C24736m returnedObj) {
            C27940c hardwareVersion;
            C27940c hardwareVersion2;
            AbstractC22676k.m65750j(returnedObj, "returnedObj");
            AbstractC24726c packet = returnedObj.getPacket();
            if (packet instanceof C13273b) {
                C13273b c13273b = (C13273b) packet;
                C10015c.this.getBatteryLevel().m65134c(c13273b.m37321b());
                C10015c.this.m24638E3(new C37605a(c13273b.m37321b().getUserDisplayPercent()));
                if (C10015c.this.m24674s3()) {
                    C10015c.this.getChargeStatus().m65148c(c13273b.m37320T());
                    return;
                }
                return;
            }
            if (packet instanceof C13286k) {
                WhoopStrapInfo whoopStrapInfo = C10015c.this._strapInfo;
                if (whoopStrapInfo == null || (hardwareVersion2 = whoopStrapInfo.getHardwareVersion()) == null || ((int) hardwareVersion2.getHardwareFamily()) != 6) {
                    return;
                }
                C10015c.this.getChargeStatus().m65153j();
                return;
            }
            if (packet instanceof C13285j) {
                WhoopStrapInfo whoopStrapInfo2 = C10015c.this._strapInfo;
                if (whoopStrapInfo2 == null || (hardwareVersion = whoopStrapInfo2.getHardwareVersion()) == null || ((int) hardwareVersion.getHardwareFamily()) != 6) {
                    return;
                }
                C10015c.this.getChargeStatus().m65154k();
                return;
            }
            if (packet instanceof C13288m) {
                C10015c.this.m24669l3().mo84367a("Double tap sync", new Object[0]);
                InterfaceC4366f.m13753c(C10015c.this.m24668k3(), C10015c.this, null, 2, null);
                return;
            }
            if (packet instanceof C13289n) {
                C10015c.this.m24669l3().mo84367a("Flash init sync", new Object[0]);
                InterfaceC4366f.m13753c(C10015c.this.m24668k3(), C10015c.this, null, 2, null);
                return;
            }
            if (packet instanceof C13300y) {
                C10015c.this.m24669l3().mo84367a("Condition report sync", new Object[0]);
                C13300y c13300y = (C13300y) packet;
                C10015c.this.getBatteryLevel().m65141m((byte) c13300y.m37345X());
                InterfaceC4366f.m13753c(C10015c.this.m24668k3(), C10015c.this, null, 2, null);
                C10015c.this.mo24695J().m61389b(c13300y.m37346Z() ? EnumC21747a.STRAP_ON_BODY : EnumC21747a.STRAP_OFF_BODY);
                return;
            }
            if (packet instanceof C13299x) {
                AbstractC3006f0.m8732z(this.f29881E, null, null, new a(C10015c.this, null), 3);
                return;
            }
            if (packet instanceof C13272a0) {
                C10015c.this.strapAlarmEventPubSub.onNext(packet);
                return;
            }
            if (packet instanceof C13271a) {
                C10015c.this.strapAlarmEventPubSub.onNext(packet);
                return;
            }
            if (packet instanceof C13301z) {
                C10015c.this.strapAlarmEventPubSub.onNext(packet);
                return;
            }
            if (packet instanceof C13274b0) {
                C10015c.this.strapAlarmEventPubSub.onNext(packet);
                return;
            }
            if (packet instanceof C13297v) {
                C10015c.this.m24669l3().mo84372m("Received a HighFreqSyncPromptEventPacket", new Object[0]);
                C10015c.this.m24669l3().mo84372m("Triggering 1 minute sync based on the High Freq Sync Prompt", new Object[0]);
                C10015c.this.m24668k3().mo13756d(C10015c.this, "HighFreqJob");
                return;
            }
            if (packet instanceof C13295t) {
                C10015c.this.m24669l3().mo84367a("emitting HighFreqSyncEnabledPacket " + packet, new Object[0]);
                C10015c.this.highFreqSyncEventPubSub.onNext(packet);
                return;
            }
            if (packet instanceof C13294s) {
                C10015c.this.m24669l3().mo84367a("emitting HighFreqSyncDisabledPacket " + packet, new Object[0]);
                C10015c.this.highFreqSyncEventPubSub.onNext(packet);
                return;
            }
            if (packet instanceof C13280e0) {
                C10015c.INSTANCE.m24761c().set(true);
                C10015c.this.mo24695J().m61389b(EnumC21747a.STRAP_ON_BODY);
                return;
            }
            if (packet instanceof C13278d0) {
                C10015c.INSTANCE.m24761c().set(false);
                C10015c.this.mo24695J().m61389b(EnumC21747a.STRAP_OFF_BODY);
                return;
            }
            if (packet instanceof C13275c) {
                if (C10015c.this.m24675t3()) {
                    C10015c.this.getChargeStatus().m65153j();
                }
                C10015c.this.batteryPackOn = true;
                return;
            }
            if (packet instanceof C13279e) {
                if (C10015c.this.m24675t3()) {
                    C10015c.this.getChargeStatus().m65154k();
                }
                C10015c.this.batteryPackOn = false;
                return;
            }
            if (packet instanceof C13291p) {
                C10015c.this.m24669l3().mo84367a("Received Haptics Fired Event", new Object[0]);
                return;
            }
            if (packet instanceof C13292q) {
                C13292q c13292q = (C13292q) packet;
                C10015c.this.m24669l3().mo84367a("Received Haptics terminated event, Revision - " + c13292q.getRevision() + ", Termination Code - " + c13292q.getTerminationCode(), new Object[0]);
                return;
            }
            if (packet instanceof C13277d) {
                C10015c.this.m24669l3().mo84367a("Received Battery Pack Info event - " + packet, new Object[0]);
                C13277d c13277d = (C13277d) packet;
                if (c13277d.getHardwareFamily() == BatteryPackType.PUFFIN) {
                    if (AbstractC38364l.m122922a(c13277d.m37332T())) {
                        AbstractC3006f0.m8732z(this.f29881E, null, null, new b(C10015c.this, packet, null), 3);
                    } else {
                        C10015c.this.m24678w3("Puffin name was empty in Battery Pack Slid-On Event from Strap");
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$h0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f29888w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f29889x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f29890y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f29888w = interfaceC27903a;
            this.f29889x = interfaceC35951a;
            this.f29890y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, vk0.b] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC36076b invoke() {
            InterfaceC27903a interfaceC27903a = this.f29888w;
            InterfaceC35951a interfaceC35951a = this.f29889x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f29890y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC36076b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$i */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap", m100430f = "WhoopStrap.kt", m100431l = {1421, 1427}, m100432m = "getBatteryPackInfoWithRetry", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        long f29891E;

        /* JADX INFO: renamed from: F */
        Object f29892F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f29893G;

        /* JADX INFO: renamed from: I */
        int f29895I;

        /* JADX INFO: renamed from: w */
        int f29896w;

        /* JADX INFO: renamed from: x */
        int f29897x;

        /* JADX INFO: renamed from: y */
        int f29898y;

        /* JADX INFO: renamed from: z */
        int f29899z;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f29893G = obj;
            this.f29895I |= Integer.MIN_VALUE;
            return C10015c.this.m24723d3(0, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$i0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f29900w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f29901x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f29902y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f29900w = interfaceC27903a;
            this.f29901x = interfaceC35951a;
            this.f29902y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, js0.c] */
        @Override // c93.InterfaceC4339a
        public final AbstractC21909c invoke() {
            InterfaceC27903a interfaceC27903a = this.f29900w;
            InterfaceC35951a interfaceC35951a = this.f29901x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f29902y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC21909c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$j */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap", m100430f = "WhoopStrap.kt", m100431l = {1369}, m100432m = "handleLockStateAndTransitionToReady", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f29903E;

        /* JADX INFO: renamed from: w */
        Object f29904w;

        /* JADX INFO: renamed from: x */
        Object f29905x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f29906y;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f29906y = obj;
            this.f29903E |= Integer.MIN_VALUE;
            return C10015c.this.m24673r3(null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$j0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f29908w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f29909x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f29910y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f29908w = interfaceC27903a;
            this.f29909x = interfaceC35951a;
            this.f29910y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, us0.e] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC35209e invoke() {
            InterfaceC27903a interfaceC27903a = this.f29908w;
            InterfaceC35951a interfaceC35951a = this.f29909x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f29910y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC35209e.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$k */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f29911w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Set f29912x;

        /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$k$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f29913w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ Set f29914x;

            /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$k$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap$observeFilteredEventPacketsFlow$$inlined$filter$1$2", m100430f = "WhoopStrap.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41411a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f29916F;

                /* JADX INFO: renamed from: G */
                Object f29917G;

                /* JADX INFO: renamed from: H */
                int f29918H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f29919w;

                /* JADX INFO: renamed from: x */
                int f29920x;

                /* JADX INFO: renamed from: y */
                Object f29921y;

                /* JADX INFO: renamed from: z */
                Object f29922z;

                public C41411a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f29919w = obj;
                    this.f29920x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, Set set) {
                this.f29913w = interfaceC13062m;
                this.f29914x = set;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41411a c41411a;
                if (interfaceC30057d instanceof C41411a) {
                    c41411a = (C41411a) interfaceC30057d;
                    int i13 = c41411a.f29920x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41411a.f29920x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41411a = new C41411a(interfaceC30057d);
                    }
                } else {
                    c41411a = new C41411a(interfaceC30057d);
                }
                Object obj2 = c41411a.f29919w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41411a.f29920x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f29913w;
                    C28323a c28323a = (C28323a) obj;
                    Set set = this.f29914x;
                    if (!(set instanceof Collection) || !set.isEmpty()) {
                        Iterator<T> it = set.iterator();
                        while (it.hasNext()) {
                            if (((InterfaceC21461d) it.next()).isInstance(c28323a)) {
                                c41411a.f29921y = null;
                                c41411a.f29922z = null;
                                c41411a.f29916F = null;
                                c41411a.f29917G = null;
                                c41411a.f29918H = 0;
                                c41411a.f29920x = 1;
                                if (interfaceC13062m.emit(obj, c41411a) != enumC31071a) {
                                    break;
                                }
                                return enumC31071a;
                            }
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

        public k(InterfaceC13058l interfaceC13058l, Set set) {
            this.f29911w = interfaceC13058l;
            this.f29912x = set;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f29911w.collect(new a(interfaceC13062m, this.f29912x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$k0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f29923w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f29924x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f29925y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f29923w = interfaceC27903a;
            this.f29924x = interfaceC35951a;
            this.f29925y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, y42.j] */
        @Override // c93.InterfaceC4339a
        public final C39228j invoke() {
            InterfaceC27903a interfaceC27903a = this.f29923w;
            InterfaceC35951a interfaceC35951a = this.f29924x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f29925y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39228j.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$l */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f29926w;

        /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$l$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f29927w;

            /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$l$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap$observeFilteredEventPacketsFlow$$inlined$filterIsInstance$1$2", m100430f = "WhoopStrap.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41412a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f29929F;

                /* JADX INFO: renamed from: G */
                Object f29930G;

                /* JADX INFO: renamed from: H */
                int f29931H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f29932w;

                /* JADX INFO: renamed from: x */
                int f29933x;

                /* JADX INFO: renamed from: y */
                Object f29934y;

                /* JADX INFO: renamed from: z */
                Object f29935z;

                public C41412a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f29932w = obj;
                    this.f29933x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f29927w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41412a c41412a;
                if (interfaceC30057d instanceof C41412a) {
                    c41412a = (C41412a) interfaceC30057d;
                    int i13 = c41412a.f29933x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41412a.f29933x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41412a = new C41412a(interfaceC30057d);
                    }
                } else {
                    c41412a = new C41412a(interfaceC30057d);
                }
                Object obj2 = c41412a.f29932w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41412a.f29933x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f29927w;
                    if (obj instanceof C28323a) {
                        c41412a.f29934y = null;
                        c41412a.f29935z = null;
                        c41412a.f29929F = null;
                        c41412a.f29930G = null;
                        c41412a.f29931H = 0;
                        c41412a.f29933x = 1;
                        if (interfaceC13062m.emit(obj, c41412a) == enumC31071a) {
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

        public l(InterfaceC13058l interfaceC13058l) {
            this.f29926w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f29926w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$l0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f29936w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f29937x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f29938y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f29936w = interfaceC27903a;
            this.f29937x = interfaceC35951a;
            this.f29938y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, vh2.d] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC36049d invoke() {
            InterfaceC27903a interfaceC27903a = this.f29936w;
            InterfaceC35951a interfaceC35951a = this.f29937x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f29938y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC36049d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$m */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f29939w;

        /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$m$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f29940w;

            /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$m$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap$observeFilteredEventPacketsFlow$$inlined$map$1$2", m100430f = "WhoopStrap.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41413a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f29941E;

                /* JADX INFO: renamed from: F */
                Object f29942F;

                /* JADX INFO: renamed from: G */
                Object f29943G;

                /* JADX INFO: renamed from: H */
                int f29944H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f29945w;

                /* JADX INFO: renamed from: x */
                int f29946x;

                /* JADX INFO: renamed from: y */
                Object f29947y;

                public C41413a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f29945w = obj;
                    this.f29946x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f29940w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41413a c41413a;
                if (interfaceC30057d instanceof C41413a) {
                    c41413a = (C41413a) interfaceC30057d;
                    int i13 = c41413a.f29946x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41413a.f29946x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41413a = new C41413a(interfaceC30057d);
                    }
                } else {
                    c41413a = new C41413a(interfaceC30057d);
                }
                Object obj2 = c41413a.f29945w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41413a.f29946x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f29940w;
                    AbstractC24726c packet = ((AbstractC24734k) obj).getPacket();
                    c41413a.f29947y = null;
                    c41413a.f29941E = null;
                    c41413a.f29942F = null;
                    c41413a.f29943G = null;
                    c41413a.f29944H = 0;
                    c41413a.f29946x = 1;
                    if (interfaceC13062m.emit(packet, c41413a) == enumC31071a) {
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

        public m(InterfaceC13058l interfaceC13058l) {
            this.f29939w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f29939w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$m0 */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap", m100430f = "WhoopStrap.kt", m100431l = {555}, m100432m = "submitCommandTask", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m0 extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f29950F;

        /* JADX INFO: renamed from: w */
        Object f29951w;

        /* JADX INFO: renamed from: x */
        Object f29952x;

        /* JADX INFO: renamed from: y */
        long f29953y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f29954z;

        public m0(InterfaceC30057d<? super m0> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f29954z = obj;
            this.f29950F |= Integer.MIN_VALUE;
            return C10015c.this.mo24727g0(null, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$n */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap", m100430f = "WhoopStrap.kt", m100431l = {1077}, m100432m = "runHapticsPatternMaverick", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f29955E;

        /* JADX INFO: renamed from: w */
        Object f29956w;

        /* JADX INFO: renamed from: x */
        long f29957x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f29958y;

        public n(InterfaceC30057d<? super n> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f29958y = obj;
            this.f29955E |= Integer.MIN_VALUE;
            return C10015c.this.mo24688F(null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$n0 */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap", m100430f = "WhoopStrap.kt", m100431l = {1190}, m100432m = "toggleHistoricalOpticalDataPacket", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n0 extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f29960E;

        /* JADX INFO: renamed from: w */
        boolean f29961w;

        /* JADX INFO: renamed from: x */
        long f29962x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f29963y;

        public n0(InterfaceC30057d<? super n0> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f29963y = obj;
            this.f29960E |= Integer.MIN_VALUE;
            return C10015c.this.mo24729h0(false, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$o */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap", m100430f = "WhoopStrap.kt", m100431l = {906, 911}, m100432m = "sendDisableAlarmCommand", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        long f29965w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f29966x;

        /* JADX INFO: renamed from: z */
        int f29968z;

        public o(InterfaceC30057d<? super o> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f29966x = obj;
            this.f29968z |= Integer.MIN_VALUE;
            return C10015c.this.mo24708U0(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$o0 */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap$transitionToReady$1", m100430f = "WhoopStrap.kt", m100431l = {1404, 1409}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class o0 extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f29969w;

        /* JADX INFO: renamed from: x */
        int f29970x;

        public o0(InterfaceC30057d<? super o0> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C10015c.this.new o0(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((o0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0091, code lost:
        
            if (r1.m124992c(r11, r3, r10) == r0) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r10.f29970x
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r10.f29969w
                zj0.o r0 = (zj0.C40746o) r0
                p505ts.AbstractC34132o.m107864I(r11)
                r7 = r10
                goto L94
            L16:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1e:
                p505ts.AbstractC34132o.m107864I(r11)
                r7 = r10
                goto L38
            L23:
                p505ts.AbstractC34132o.m107864I(r11)
                r11 = r3
                com.whoop.service.rearchitect.c r3 = com.whoop.service.rearchitect.C10015c.this
                r10.f29970x = r11
                r4 = 0
                r5 = 0
                r8 = 3
                r9 = 0
                r7 = r10
                java.lang.Object r11 = com.whoop.service.rearchitect.C10015c.m24664e3(r3, r4, r5, r7, r8, r9)
                if (r11 != r0) goto L38
                goto L93
            L38:
                zj0.o r11 = (zj0.C40746o) r11
                r1 = 0
                if (r11 != 0) goto L4b
                com.whoop.service.rearchitect.c r11 = com.whoop.service.rearchitect.C10015c.this
                oh3.d r11 = com.whoop.service.rearchitect.C10015c.m24641G2(r11)
                java.lang.String r0 = "After successful strap connection, failed to get BatteryPackInfoPacket"
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r11.mo84368b(r0, r1)
                goto L94
            L4b:
                com.whoop.connectivityCore.batteryPack.models.BatteryPackType r3 = r11.getHardwareFamily()
                com.whoop.connectivityCore.batteryPack.models.BatteryPackType r4 = com.whoop.connectivityCore.batteryPack.models.BatteryPackType.PUFFIN
                if (r3 != r4) goto L94
                com.whoop.service.rearchitect.c r3 = com.whoop.service.rearchitect.C10015c.this
                oh3.d r3 = com.whoop.service.rearchitect.C10015c.m24641G2(r3)
                com.whoop.connectivityCore.batteryPack.models.BatteryPackType r4 = r11.getHardwareFamily()
                java.lang.String r5 = r11.m132234Y()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r8 = "Sending connect command to "
                r6.<init>(r8)
                r6.append(r4)
                java.lang.String r4 = " "
                r6.append(r4)
                r6.append(r5)
                java.lang.String r4 = r6.toString()
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r3.mo84371h(r4, r1)
                com.whoop.service.rearchitect.c r1 = com.whoop.service.rearchitect.C10015c.this
                y42.j r1 = com.whoop.service.rearchitect.C10015c.m24642H2(r1)
                java.lang.String r11 = r11.m132233X()
                us0.d$c r3 = us0.InterfaceC35208d.c.STRAP_CONNECTION
                r4 = 0
                r7.f29969w = r4
                r7.f29970x = r2
                java.lang.Object r11 = r1.m124992c(r11, r3, r10)
                if (r11 != r0) goto L94
            L93:
                return r0
            L94:
                l83.a0 r11 = l83.C23454a0.f92919a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.service.rearchitect.C10015c.o0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$p */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap", m100430f = "WhoopStrap.kt", m100431l = {1060}, m100432m = "sendExitHighFreqSyncCommand", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        long f29972w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f29973x;

        /* JADX INFO: renamed from: z */
        int f29975z;

        public p(InterfaceC30057d<? super p> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f29973x = obj;
            this.f29975z |= Integer.MIN_VALUE;
            return C10015c.this.mo24743p(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$q */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap", m100430f = "WhoopStrap.kt", m100431l = {856, 861}, m100432m = "sendGetAlarmTimeCommand", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f29976E;

        /* JADX INFO: renamed from: w */
        long f29977w;

        /* JADX INFO: renamed from: x */
        int f29978x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f29979y;

        public q(InterfaceC30057d<? super q> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f29979y = obj;
            this.f29976E |= Integer.MIN_VALUE;
            return C10015c.this.mo24687E(0L, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$r */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap", m100430f = "WhoopStrap.kt", m100431l = {1200}, m100432m = "sendGetBatteryPackInfoCommand", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f29981E;

        /* JADX INFO: renamed from: w */
        Object f29982w;

        /* JADX INFO: renamed from: x */
        long f29983x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f29984y;

        public r(InterfaceC30057d<? super r> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f29984y = obj;
            this.f29981E |= Integer.MIN_VALUE;
            return C10015c.this.mo24693I(null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$s */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap", m100430f = "WhoopStrap.kt", m100431l = {1454, 1469, 1479, 1486}, m100432m = "sendHelloCommand", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f29986w;

        /* JADX INFO: renamed from: y */
        int f29988y;

        public s(InterfaceC30057d<? super s> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f29986w = obj;
            this.f29988y |= Integer.MIN_VALUE;
            return C10015c.this.m24683z3(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$t */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap", m100430f = "WhoopStrap.kt", m100431l = {1055}, m100432m = "sendHighFreqHistorySyncCommand", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f29990F;

        /* JADX INFO: renamed from: w */
        int f29991w;

        /* JADX INFO: renamed from: x */
        int f29992x;

        /* JADX INFO: renamed from: y */
        long f29993y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f29994z;

        public t(InterfaceC30057d<? super t> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f29994z = obj;
            this.f29990F |= Integer.MIN_VALUE;
            return C10015c.this.mo24705S0(0, 0, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$u */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap", m100430f = "WhoopStrap.kt", m100431l = {1118}, m100432m = "sendHistoricalImuStreamCommand", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f29995E;

        /* JADX INFO: renamed from: w */
        boolean f29996w;

        /* JADX INFO: renamed from: x */
        long f29997x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f29998y;

        public u(InterfaceC30057d<? super u> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f29998y = obj;
            this.f29995E |= Integer.MIN_VALUE;
            return C10015c.this.mo24711Y(false, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$v */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap", m100430f = "WhoopStrap.kt", m100431l = {1124}, m100432m = "sendImuDataStreamCommand", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f30000E;

        /* JADX INFO: renamed from: w */
        boolean f30001w;

        /* JADX INFO: renamed from: x */
        long f30002x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f30003y;

        public v(InterfaceC30057d<? super v> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f30003y = obj;
            this.f30000E |= Integer.MIN_VALUE;
            return C10015c.this.mo24700N0(false, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$w */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap", m100430f = "WhoopStrap.kt", m100431l = {1128}, m100432m = "sendOpticalDataStreamCommand", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f30005E;

        /* JADX INFO: renamed from: w */
        boolean f30006w;

        /* JADX INFO: renamed from: x */
        long f30007x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f30008y;

        public w(InterfaceC30057d<? super w> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f30008y = obj;
            this.f30005E |= Integer.MIN_VALUE;
            return C10015c.this.m24633B3(false, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$x */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap", m100430f = "WhoopStrap.kt", m100431l = {883, 889}, m100432m = "sendRunAlarmCommand", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class x extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f30010E;

        /* JADX INFO: renamed from: w */
        long f30011w;

        /* JADX INFO: renamed from: x */
        Object f30012x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f30013y;

        public x(InterfaceC30057d<? super x> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f30013y = obj;
            this.f30010E |= Integer.MIN_VALUE;
            return C10015c.this.mo24748t(0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$y */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap", m100430f = "WhoopStrap.kt", m100431l = {1070}, m100432m = "sendRunHapticsPattern", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f30015E;

        /* JADX INFO: renamed from: w */
        Object f30016w;

        /* JADX INFO: renamed from: x */
        long f30017x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f30018y;

        public y(InterfaceC30057d<? super y> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f30018y = obj;
            this.f30015E |= Integer.MIN_VALUE;
            return C10015c.this.mo24704S(null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.rearchitect.c$z */
    @InterfaceC32271e(m100429c = "com.whoop.service.rearchitect.WhoopStrap", m100430f = "WhoopStrap.kt", m100431l = {846}, m100432m = "sendSetAlarmInfoById", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class z extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f30020E;

        /* JADX INFO: renamed from: G */
        int f30022G;

        /* JADX INFO: renamed from: w */
        int f30023w;

        /* JADX INFO: renamed from: x */
        Object f30024x;

        /* JADX INFO: renamed from: y */
        long f30025y;

        /* JADX INFO: renamed from: z */
        long f30026z;

        public z(InterfaceC30057d<? super z> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f30020E = obj;
            this.f30022G |= Integer.MIN_VALUE;
            return C10015c.this.mo24686D0(0, null, 0L, 0L, this);
        }
    }

    private C10015c(Context context, BluetoothDevice bluetoothDevice, Class<? extends InterfaceC39750a> cls, InterfaceC18732d interfaceC18732d, InterfaceC40188b interfaceC40188b, C30076h c30076h, HandlerThread handlerThread, InterfaceC25435a interfaceC25435a, InterfaceC2994c0 interfaceC2994c0) {
        super(context, bluetoothDevice, cls, c30076h, handlerThread, interfaceC18732d, interfaceC2994c0);
        this.dispatcherFactory = interfaceC18732d;
        this.analyticsManager = interfaceC40188b;
        this.whoopStrapSharedPrefs = c30076h;
        this.mutex = interfaceC25435a;
        this.log = new C30070b("WhoopStrap");
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        Object objM125868N0 = null;
        this.crashReporter = AbstractC30060g.m92087G(enumC23463i, new f0(this, null, null));
        this.strapAlarmEventPubSub = new C15578d();
        this.highFreqSyncEventPubSub = new C12861f(new C12857b());
        this.historySyncRouter = AbstractC30060g.m92087G(enumC23463i, new g0(this, null, null));
        C15578d c15578d = new C15578d();
        this.whoopStrapEventsCallbacks = c15578d;
        this.whoopStrapDataCallbacks = new C15578d();
        this.whoopStrapRealTimeDataCallbacks = new C15578d();
        this.whoopStrapMetadataCallbacks = new C15578d();
        this.whoopStrapMemfaultCallbacks = new C15578d();
        C26442a c26442a = new C26442a();
        this.callbacksCompositeDisposables = c26442a;
        C38266c c38266c = getKoin().f106046a.f159364d;
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        this.bluetoothHelper = (C4329a) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C4329a.class), null);
        this.bleTaskExecutor = AbstractC30060g.m92087G(enumC23463i, new h0(this, new C35953c("strapBleExecutor"), null));
        this.configRepo = AbstractC30060g.m92087G(enumC23463i, new i0(this, null, null));
        this.connectionAnalyticsHelper = AbstractC30060g.m92087G(enumC23463i, new j0(this, null, null));
        this.puffinManager = AbstractC30060g.m92087G(enumC23463i, new k0(this, null, null));
        this.strapUnlockService = AbstractC30060g.m92087G(enumC23463i, new l0(this, null, null));
        AbstractC21909c abstractC21909cM24666g3 = m24666g3();
        C36086l c36086l = C36086l.f154182a;
        C21908b configurations = abstractC21909cM24666g3.getConfigurations();
        Object name = c36086l.getName();
        Object defaultValue = c36086l.getDefaultValue();
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Long.class);
        if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
            String str = (String) configurations.get(name);
            if (str != null) {
                objM125868N0 = AbstractC39421y.m125932Q(str);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
            String str2 = (String) configurations.get(name);
            if (str2 != null) {
                objM125868N0 = AbstractC39421y.m125933R(str2);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
            String str3 = (String) configurations.get(name);
            if (str3 != null) {
                objM125868N0 = AbstractC39420x.m125915y(str3);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
            String str4 = (String) configurations.get(name);
            if (str4 != null) {
                objM125868N0 = AbstractC39420x.m125914x(str4);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
            String str5 = (String) configurations.get(name);
            if (str5 != null) {
                objM125868N0 = AbstractC39414r.m125868N0(str5);
            }
        } else {
            objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
        }
        defaultValue = objM125868N0 != null ? objM125868N0 : defaultValue;
        if (defaultValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }
        this.longRunningTaskTimeout = ((Long) defaultValue).longValue();
        this.batteryLevel = new C22538a();
        this.chargeStatus = new C22539b();
        this.genericHrProfileController = new c();
        C37605a c37605a = new C37605a(50);
        this._whoopBatteryLevel = c37605a;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(c37605a);
        this._whoopBatteryLevelFlow = c13045h2M36593c;
        this.whoopBatteryLevelFlow = AbstractC13091v.m36598h(c13045h2M36593c);
        this._ecgStatusFlow = AbstractC13091v.m36593c(Boolean.FALSE);
        this.strapBodyStatus = new C21753g();
        e eVar = new e();
        this.commandResponseCallback = eVar;
        h hVar = new h(interfaceC2994c0);
        this.eventCallback = hVar;
        f fVar = new f(interfaceC2994c0);
        this.connectionCallback = fVar;
        this.helloPacketFailCounter = new C28213x();
        EnumC11916a enumC11916a = EnumC11916a.f38983x;
        this.imuStreamFlow = AbstractC13091v.m36592b(0, 10, enumC11916a, 1);
        this.hrRealtimeStreamFlow = AbstractC13091v.m36592b(0, 10, enumC11916a, 1);
        this.ecgFilteredDataFlow = AbstractC13091v.m36592b(0, 100, enumC11916a, 1);
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 1, enumC11916a, 1);
        this.realTimeImuStreamFlow = c13096w1M36592b;
        mo104073M(fVar);
        mo24684A0(eVar);
        c15578d.m67905c(hVar);
        c26442a.mo78293a(hVar);
        this.realTimeImuDataStreamFlow = AbstractC13091v.m36597g(c13096w1M36592b);
    }

    /* JADX INFO: renamed from: A3 */
    private final Object m24631A3(InterfaceC30057d<? super C40758u> interfaceC30057d) {
        Object objMo24727g0 = mo24727g0(new C38373o(), 5000L, InterfaceC32564a.a.f134904a, interfaceC30057d);
        return objMo24727g0 == EnumC31071a.f128113w ? objMo24727g0 : (C40758u) objMo24727g0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: B3 */
    public final Object m24633B3(boolean z4, long j7, InterfaceC30057d<Object> interfaceC30057d) {
        w wVar;
        if (interfaceC30057d instanceof w) {
            wVar = (w) interfaceC30057d;
            int i13 = wVar.f30005E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                wVar.f30005E = i13 - Integer.MIN_VALUE;
            } else {
                wVar = new w(interfaceC30057d);
            }
        } else {
            wVar = new w(interfaceC30057d);
        }
        w wVar2 = wVar;
        Object obj = wVar2.f30008y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = wVar2.f30005E;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return null;
        }
        AbstractC34132o.m107864I(obj);
        if (!m24731i3()) {
            C38357i1 c38357i1 = new C38357i1(z4);
            wVar2.f30006w = z4;
            wVar2.f30007x = j7;
            wVar2.f30005E = 1;
            if (InterfaceC21750d.m61379l0(this, c38357i1, j7, null, wVar2, 4, null) == enumC31071a) {
                return enumC31071a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: D3 */
    private final Object m24636D3(boolean z4, long j7, InterfaceC30057d<? super C40727h> interfaceC30057d) {
        if (m24731i3()) {
            return null;
        }
        return mo24727g0(new C38376p0(z4), j7, InterfaceC32564a.a.f134904a, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E3 */
    public final void m24638E3(C37605a c37605a) {
        this._whoopBatteryLevel = c37605a;
        ((C13045h2) this._whoopBatteryLevelFlow).m36570j(c37605a);
    }

    /* JADX INFO: renamed from: F3 */
    private final void m24640F3() {
        getStateMachine().m92169r(C32970n.f137298a);
        if (mo24752w0().isMaverickOrGoose() && getChargeStatus().m65149d()) {
            AbstractC3006f0.m8732z(getScope(), null, null, new o0(null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K1 */
    public final InterfaceC35209e m24645K1() {
        return (InterfaceC35209e) this.connectionAnalyticsHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b3 */
    public final WhoopStrapInfo m24663b3(String name, InterfaceC40756t packet, EnumC32978v gen) {
        return new WhoopStrapInfo(name, packet.getVersionHash(), packet.getBatteryLevel(), packet.getSerial(), packet.getStrapSignature(), packet.getFirmwareVersion(), packet instanceof InterfaceC40756t.a ? ((InterfaceC40756t.a) packet).mo132246v() : new InterfaceC27939b.b(0L, 0L, 0L, 0L), packet.mo132213a(), packet.getSigProcVersion(), packet.getStrapSignature(), gen);
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ Object m24664e3(C10015c c10015c, int i13, long j7, InterfaceC30057d interfaceC30057d, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = 5;
        }
        if ((i14 & 2) != 0) {
            j7 = 5000;
        }
        return c10015c.m24723d3(i13, j7, interfaceC30057d);
    }

    /* JADX INFO: renamed from: f3 */
    private final InterfaceC36076b m24665f3() {
        return (InterfaceC36076b) this.bleTaskExecutor.getValue();
    }

    /* JADX INFO: renamed from: g3 */
    private final AbstractC21909c m24666g3() {
        return (AbstractC21909c) this.configRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h3 */
    public final InterfaceC31766c m24667h3() {
        return (InterfaceC31766c) this.crashReporter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k3 */
    public final InterfaceC4366f m24668k3() {
        return (InterfaceC4366f) this.historySyncRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l3 */
    public final AbstractC27946d m24669l3() {
        return this.log.getValue(this, f29766s1[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m3 */
    public final C39228j m24670m3() {
        return (C39228j) this.puffinManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o3 */
    public final String m24671o3(WhoopStrapInfo strapInfo) {
        boolean isCpuIdValid = strapInfo.getIsCpuIdValid();
        boolean isSerialNumberValid = strapInfo.getIsSerialNumberValid();
        if (!isCpuIdValid) {
            return !isSerialNumberValid ? AbstractC31061c.m95640p("Invalid strap cpu ", strapInfo.getCpuId(), " and serial ", strapInfo.getSerialNumber()) : AbstractC11266d.m30461o("Invalid strap cpu ", strapInfo.getCpuId());
        }
        if (isSerialNumberValid) {
            throw new IllegalStateException("What was invalid?");
        }
        return AbstractC11266d.m30461o("Invalid strap serial ", strapInfo.getSerialNumber());
    }

    /* JADX INFO: renamed from: p3 */
    private final InterfaceC36049d m24672p3() {
        return (InterfaceC36049d) this.strapUnlockService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r3 */
    public final Object m24673r3(InterfaceC40756t interfaceC40756t, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        j jVar;
        if (interfaceC30057d instanceof j) {
            jVar = (j) interfaceC30057d;
            int i13 = jVar.f29903E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                jVar.f29903E = i13 - Integer.MIN_VALUE;
            } else {
                jVar = new j(interfaceC30057d);
            }
        } else {
            jVar = new j(interfaceC30057d);
        }
        Object objMo114451d = jVar.f29906y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = jVar.f29903E;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo114451d);
            boolean z4 = interfaceC40756t instanceof InterfaceC40756t.b;
            InterfaceC40756t.b bVar = z4 ? (InterfaceC40756t.b) interfaceC40756t : null;
            InterfaceC32972p interfaceC32972pMo132248m = bVar != null ? bVar.getLockInfo() : null;
            if (!AbstractC32977u.m104087a(m106381P1()) || !z4 || !(interfaceC32972pMo132248m instanceof InterfaceC32972p.b)) {
                m24640F3();
                return c23454a0;
            }
            InterfaceC32972p.b bVar2 = (InterfaceC32972p.b) interfaceC32972pMo132248m;
            int i15 = d.f29848b[bVar2.getState().ordinal()];
            if (i15 == 1) {
                m24669l3().mo84371h(AbstractC31061c.m95636l(bVar2.getCounterSeconds(), "Connection Step: Strap reported Locked (counter=", "s); attempting unlock"), new Object[0]);
                getStateMachine().m92169r(C32969m.f137297a);
                jVar.f29904w = null;
                jVar.f29905x = null;
                jVar.f29903E = 1;
                objMo114451d = m24672p3().mo114451d(this, (InterfaceC40756t.b) interfaceC40756t, jVar);
                if (objMo114451d == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i15 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                m24640F3();
                m24672p3().mo114448a(getScope(), this, (InterfaceC40756t.b) interfaceC40756t);
            }
            return c23454a0;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(objMo114451d);
        InterfaceC36053h interfaceC36053h = (InterfaceC36053h) objMo114451d;
        if (AbstractC22676k.m65745e(interfaceC36053h, InterfaceC36053h.c.f153919a)) {
            m24669l3().mo84371h("Connection Step: Strap unlocked; transitioning to Ready", new Object[0]);
            m24640F3();
        } else {
            if (!(interfaceC36053h instanceof InterfaceC36053h.a)) {
                throw new NoWhenBranchMatchedException();
            }
            m24669l3().mo84373n("Connection Step: Strap unlock failed (" + ((InterfaceC36053h.a) interfaceC36053h).getReason() + "); remaining Locked", new Object[0]);
        }
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s3 */
    public final boolean m24674s3() {
        C27940c hardwareVersion;
        WhoopStrapInfo whoopStrapInfo = get_strapInfo();
        return (whoopStrapInfo == null || (hardwareVersion = whoopStrapInfo.getHardwareVersion()) == null || ((int) hardwareVersion.getHardwareFamily()) != 6) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t3 */
    public final boolean m24675t3() {
        C27940c hardwareVersion;
        WhoopStrapInfo whoopStrapInfo = get_strapInfo();
        return (whoopStrapInfo == null || (hardwareVersion = whoopStrapInfo.getHardwareVersion()) == null || ((int) hardwareVersion.getHardwareFamily()) != 13) ? false : true;
    }

    /* JADX INFO: renamed from: u3 */
    public static final AtomicBoolean m24676u3() {
        return INSTANCE.m24761c();
    }

    /* JADX INFO: renamed from: v3 */
    private final void m24677v3() {
        mo104077f0(this.connectionCallback);
        this.callbacksCompositeDisposables.m78296d();
        getStateMachine().m92161d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w3 */
    public final void m24678w3(String action) {
        this.analyticsManager.mo41421c("Pairing - Connection Attempt", "Connectivity", this.whoopStrapSharedPrefs.m92198d(), this.whoopStrapSharedPrefs.m92199e(), this.whoopStrapSharedPrefs.m92200f(), action, null, "No Attempt", null);
    }

    /* JADX INFO: renamed from: x3 */
    private final void m24680x3() {
        this.analyticsManager.mo41421c("Bond Deleted", "Connectivity", this.whoopStrapSharedPrefs.m92198d(), this.whoopStrapSharedPrefs.m92199e(), this.whoopStrapSharedPrefs.m92200f(), null, "Phone", null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        if (r12 == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c4, code lost:
    
        if (r12 == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d6, code lost:
    
        if (r12 == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f2, code lost:
    
        if (r12 == r0) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m24683z3(q83.InterfaceC30057d<? super zj0.InterfaceC40756t> r12) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.service.rearchitect.C10015c.m24683z3(q83.d):java.lang.Object");
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: A0 */
    public void mo24684A0(AbstractC24489a callback) {
        AbstractC22676k.m65750j(callback, "callback");
        C26442a c26442a = this.callbacksCompositeDisposables;
        getWhoopStrapCommandCallbacks().m67905c(callback);
        c26442a.mo78293a(callback);
    }

    /* JADX INFO: renamed from: C3 */
    public void m24685C3() {
        m106373D1();
        getStateMachine().m92169r(C32963g.f137291a);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: D0 */
    public Object mo24686D0(int i13, AlarmHapticsPattern alarmHapticsPattern, long j7, long j13, InterfaceC30057d<? super C40761v0> interfaceC30057d) {
        z zVar;
        if (interfaceC30057d instanceof z) {
            zVar = (z) interfaceC30057d;
            int i14 = zVar.f30022G;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                zVar.f30022G = i14 - Integer.MIN_VALUE;
            } else {
                zVar = new z(interfaceC30057d);
            }
        } else {
            zVar = new z(interfaceC30057d);
        }
        z zVar2 = zVar;
        Object objM61379l0 = zVar2.f30020E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = zVar2.f30022G;
        if (i15 == 0) {
            AbstractC34132o.m107864I(objM61379l0);
            C38382s0 c38382s0 = new C38382s0(i13, alarmHapticsPattern, j7);
            zVar2.f30024x = null;
            zVar2.f30023w = i13;
            zVar2.f30025y = j7;
            zVar2.f30026z = j13;
            zVar2.f30022G = 1;
            objM61379l0 = InterfaceC21750d.m61379l0(this, c38382s0, j13, null, zVar2, 4, null);
            if (objM61379l0 == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM61379l0);
        }
        if (objM61379l0 instanceof C40761v0) {
            return (C40761v0) objM61379l0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r14 == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        if (r14 == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
    
        return r0;
     */
    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo24687E(long r11, int r13, q83.InterfaceC30057d<? super zj0.C40742m> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.whoop.service.rearchitect.C10015c.q
            if (r0 == 0) goto L14
            r0 = r14
            com.whoop.service.rearchitect.c$q r0 = (com.whoop.service.rearchitect.C10015c.q) r0
            int r1 = r0.f29976E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f29976E = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.whoop.service.rearchitect.c$q r0 = new com.whoop.service.rearchitect.c$q
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f29979y
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f29976E
            r2 = 2
            r3 = 1
            r9 = 0
            if (r1 == 0) goto L39
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            p505ts.AbstractC34132o.m107864I(r14)
            goto L6b
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            p505ts.AbstractC34132o.m107864I(r14)
            goto L8d
        L39:
            p505ts.AbstractC34132o.m107864I(r14)
            st0.v r14 = r10.mo24752w0()
            int[] r1 = com.whoop.service.rearchitect.C10015c.d.f29847a
            int r14 = r14.ordinal()
            r14 = r1[r14]
            switch(r14) {
                case 1: goto L94;
                case 2: goto L94;
                case 3: goto L94;
                case 4: goto L73;
                case 5: goto L51;
                case 6: goto L51;
                default: goto L4b;
            }
        L4b:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L51:
            xj0.j r14 = new xj0.j
            lt0.j r1 = lt0.EnumC24733j.REVISION_4
            r14.<init>(r1, r13)
            r6.f29977w = r11
            r6.f29978x = r13
            r6.f29976E = r2
            r5 = 0
            r7 = 4
            r8 = 0
            r1 = r10
            r3 = r11
            r2 = r14
            java.lang.Object r14 = jk0.InterfaceC21750d.m61379l0(r1, r2, r3, r5, r6, r7, r8)
            if (r14 != r0) goto L6b
            goto L8c
        L6b:
            boolean r11 = r14 instanceof zj0.C40742m
            if (r11 == 0) goto L72
            zj0.m r14 = (zj0.C40742m) r14
            return r14
        L72:
            return r9
        L73:
            xj0.j r14 = new xj0.j
            lt0.j r4 = lt0.EnumC24733j.REVISION_1
            r14.<init>(r4)
            r6.f29977w = r11
            r6.f29978x = r13
            r6.f29976E = r3
            r5 = 0
            r7 = 4
            r8 = 0
            r1 = r10
            r3 = r11
            r2 = r14
            java.lang.Object r14 = jk0.InterfaceC21750d.m61379l0(r1, r2, r3, r5, r6, r7, r8)
            if (r14 != r0) goto L8d
        L8c:
            return r0
        L8d:
            boolean r11 = r14 instanceof zj0.C40742m
            if (r11 == 0) goto L94
            zj0.m r14 = (zj0.C40742m) r14
            return r14
        L94:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.service.rearchitect.C10015c.mo24687E(long, int, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: F */
    public Object mo24688F(C38359j0 c38359j0, long j7, InterfaceC30057d<? super C40751q0> interfaceC30057d) {
        n nVar;
        if (interfaceC30057d instanceof n) {
            nVar = (n) interfaceC30057d;
            int i13 = nVar.f29955E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                nVar.f29955E = i13 - Integer.MIN_VALUE;
            } else {
                nVar = new n(interfaceC30057d);
            }
        } else {
            nVar = new n(interfaceC30057d);
        }
        n nVar2 = nVar;
        Object objMo24727g0 = nVar2.f29958y;
        Object obj = EnumC31071a.f128113w;
        int i14 = nVar2.f29955E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo24727g0);
            int i15 = d.f29847a[mo24752w0().ordinal()];
            if (i15 != 5 && i15 != 6) {
                return null;
            }
            InterfaceC32564a interfaceC32564a = InterfaceC32564a.a.f134904a;
            nVar2.f29956w = null;
            nVar2.f29957x = j7;
            nVar2.f29955E = 1;
            objMo24727g0 = mo24727g0(c38359j0, j7, interfaceC32564a, nVar2);
            if (objMo24727g0 == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo24727g0);
        }
        if (objMo24727g0 instanceof C40751q0) {
            return (C40751q0) objMo24727g0;
        }
        return null;
    }

    @Override // t92.AbstractC33664b
    /* JADX INFO: renamed from: F1 */
    public void mo24689F1(int step) {
        this.clockSynchronizer = new a();
        AbstractC3006f0.m8732z(getScope(), null, null, new g(step, null), 3);
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: G0 */
    public void mo24690G0() {
        m24685C3();
        this._strapInfo = null;
        m106393l2();
        m24677v3();
        AbstractC3006f0.m8714h(getScope(), null);
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: H */
    public Object mo24691H(String str, long j7, InterfaceC30057d<? super C40727h> interfaceC30057d) {
        int i13 = d.f29847a[mo24752w0().ordinal()];
        if (i13 == 4) {
            return InterfaceC21750d.m61379l0(this, new C39589c(str), j7, null, interfaceC30057d, 4, null);
        }
        if (i13 == 5 || i13 == 6) {
            return InterfaceC21750d.m61379l0(this, new C38380r0(str), j7, null, interfaceC30057d, 4, null);
        }
        return null;
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: H0 */
    public InterfaceC13058l mo24692H0() {
        return AbstractC13091v.m36597g(this.ecgFilteredDataFlow);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: I */
    public Object mo24693I(C38361k c38361k, long j7, InterfaceC30057d<? super C40746o> interfaceC30057d) {
        r rVar;
        if (interfaceC30057d instanceof r) {
            rVar = (r) interfaceC30057d;
            int i13 = rVar.f29981E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                rVar.f29981E = i13 - Integer.MIN_VALUE;
            } else {
                rVar = new r(interfaceC30057d);
            }
        } else {
            rVar = new r(interfaceC30057d);
        }
        r rVar2 = rVar;
        Object objM61379l0 = rVar2.f29984y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = rVar2.f29981E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM61379l0);
            int i15 = d.f29847a[mo24752w0().ordinal()];
            if (i15 != 5 && i15 != 6) {
                m24669l3().mo84368b("Trying to send GetBatteryPackInfoCommand on an unsupported device", new Object[0]);
                return null;
            }
            C38361k c38361k2 = new C38361k();
            rVar2.f29982w = null;
            rVar2.f29983x = j7;
            rVar2.f29981E = 1;
            objM61379l0 = InterfaceC21750d.m61379l0(this, c38361k2, j7, null, rVar2, 4, null);
            if (objM61379l0 == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM61379l0);
        }
        if (objM61379l0 instanceof C40746o) {
            return (C40746o) objM61379l0;
        }
        return null;
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: I0 */
    public void mo24694I0(AbstractC24489a callback) {
        AbstractC22676k.m65750j(callback, "callback");
        this.callbacksCompositeDisposables.mo78295c(callback);
    }

    @Override // jk0.InterfaceC21750d
    @InterfaceC23457c
    /* JADX INFO: renamed from: K */
    public AbstractC23412c mo24696K() {
        return this.strapAlarmEventPubSub;
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: L0 */
    public InterfaceC13058l mo24697L0() {
        C15578d c15578d = this.whoopStrapMemfaultCallbacks;
        c15578d.getClass();
        Class<byte[]> cls = byte[].class;
        return AbstractC13091v.m36600j(new C0410c(new C36926l(new C36926l(c15578d, new C0783z(cls, 28), 0), new C3632c(cls), 1), null, 21));
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: M0, reason: from getter */
    public String getAdvertisingName() {
        return this.advertisingName;
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: N */
    public InterfaceC13087t1 mo24699N() {
        return m106378N1().mo89259b();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: N0 */
    public Object mo24700N0(boolean z4, long j7, InterfaceC30057d<? super C40726g1> interfaceC30057d) {
        v vVar;
        if (interfaceC30057d instanceof v) {
            vVar = (v) interfaceC30057d;
            int i13 = vVar.f30000E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                vVar.f30000E = i13 - Integer.MIN_VALUE;
            } else {
                vVar = new v(interfaceC30057d);
            }
        } else {
            vVar = new v(interfaceC30057d);
        }
        v vVar2 = vVar;
        Object objM61379l0 = vVar2.f30003y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = vVar2.f30000E;
        EnumC32978v enumC32978v = null;
        Object[] objArr = 0;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM61379l0);
            if (!m24731i3()) {
                C38354h1 c38354h1 = new C38354h1(z4, enumC32978v, 2, objArr == true ? 1 : 0);
                vVar2.f30001w = z4;
                vVar2.f30002x = j7;
                vVar2.f30000E = 1;
                objM61379l0 = InterfaceC21750d.m61379l0(this, c38354h1, j7, null, vVar2, 4, null);
                if (objM61379l0 == enumC31071a) {
                    return enumC31071a;
                }
            }
            return null;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(objM61379l0);
        if (objM61379l0 instanceof C40726g1) {
            return (C40726g1) objM61379l0;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: O0 */
    public InterfaceC26794a.a mo24701O0(boolean turnOn, long delay) {
        EnumC32978v enumC32978v = null;
        Object[] objArr = 0;
        if (m24731i3()) {
            return null;
        }
        return mo79829G(new C38366l1(turnOn, enumC32978v, 2, objArr == true ? 1 : 0), delay);
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: P0 */
    public void mo24702P0() {
        synchronized (AbstractC33664b.INSTANCE.m106401a()) {
            m24669l3().mo84367a("History sync object unlocked!", new Object[0]);
            this.historyLocked = false;
        }
    }

    @Override // nk0.InterfaceC26794a.b
    /* JADX INFO: renamed from: R0 */
    public void mo24703R0(C12110j r17LabradorFilteredDataPacket) {
        AbstractC22676k.m65750j(r17LabradorFilteredDataPacket, "r17LabradorFilteredDataPacket");
        this.ecgFilteredDataFlow.mo36564a(r17LabradorFilteredDataPacket);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: S */
    public Object mo24704S(C39588b c39588b, long j7, InterfaceC30057d<? super C0945g> interfaceC30057d) {
        y yVar;
        if (interfaceC30057d instanceof y) {
            yVar = (y) interfaceC30057d;
            int i13 = yVar.f30015E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                yVar.f30015E = i13 - Integer.MIN_VALUE;
            } else {
                yVar = new y(interfaceC30057d);
            }
        } else {
            yVar = new y(interfaceC30057d);
        }
        y yVar2 = yVar;
        Object objMo24727g0 = yVar2.f30018y;
        Object obj = EnumC31071a.f128113w;
        int i14 = yVar2.f30015E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo24727g0);
            m24669l3().mo84367a("Sending Run Haptics Pattern command to the strap", new Object[0]);
            InterfaceC32564a interfaceC32564a = InterfaceC32564a.a.f134904a;
            yVar2.f30016w = null;
            yVar2.f30017x = j7;
            yVar2.f30015E = 1;
            objMo24727g0 = mo24727g0(c39588b, j7, interfaceC32564a, yVar2);
            if (objMo24727g0 == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo24727g0);
        }
        if (objMo24727g0 instanceof C0945g) {
            return (C0945g) objMo24727g0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: S0 */
    public Object mo24705S0(int i13, int i14, long j7, InterfaceC30057d<? super C0940b> interfaceC30057d) {
        t tVar;
        if (interfaceC30057d instanceof t) {
            tVar = (t) interfaceC30057d;
            int i15 = tVar.f29990F;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                tVar.f29990F = i15 - Integer.MIN_VALUE;
            } else {
                tVar = new t(interfaceC30057d);
            }
        } else {
            tVar = new t(interfaceC30057d);
        }
        t tVar2 = tVar;
        Object objM61379l0 = tVar2.f29994z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i16 = tVar2.f29990F;
        if (i16 == 0) {
            AbstractC34132o.m107864I(objM61379l0);
            m24669l3().mo84367a("Sending High Freq History Sync Command to the strap", new Object[0]);
            C38346f c38346f = new C38346f(i13, i14);
            tVar2.f29991w = i13;
            tVar2.f29992x = i14;
            tVar2.f29993y = j7;
            tVar2.f29990F = 1;
            objM61379l0 = InterfaceC21750d.m61379l0(this, c38346f, j7, null, tVar2, 4, null);
            if (objM61379l0 == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM61379l0);
        }
        if (objM61379l0 instanceof C0940b) {
            return (C0940b) objM61379l0;
        }
        return null;
    }

    @Override // nk0.InterfaceC26794a.b
    /* JADX INFO: renamed from: T0 */
    public void mo24706T0(C12111k realTimeDataPacket) {
        AbstractC22676k.m65750j(realTimeDataPacket, "realTimeDataPacket");
        this.whoopStrapRealTimeDataCallbacks.onNext(realTimeDataPacket);
        this.hrRealtimeStreamFlow.mo36564a(realTimeDataPacket.m33470R());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: U */
    public Object mo24707U(boolean z4, long j7, InterfaceC30057d<? super C40717d1> interfaceC30057d) {
        b0 b0Var;
        if (interfaceC30057d instanceof b0) {
            b0Var = (b0) interfaceC30057d;
            int i13 = b0Var.f29828E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                b0Var.f29828E = i13 - Integer.MIN_VALUE;
            } else {
                b0Var = new b0(interfaceC30057d);
            }
        } else {
            b0Var = new b0(interfaceC30057d);
        }
        b0 b0Var2 = b0Var;
        Object objM79827T = b0Var2.f29831y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = b0Var2.f29828E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM79827T);
            C38345e1 c38345e1 = new C38345e1(z4);
            b0Var2.f29829w = z4;
            b0Var2.f29830x = j7;
            b0Var2.f29828E = 1;
            objM79827T = InterfaceC26794a.m79827T(this, c38345e1, j7, false, b0Var2, 4, null);
            if (objM79827T == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM79827T);
        }
        if (objM79827T instanceof C40717d1) {
            return (C40717d1) objM79827T;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        if (r15 == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0087, code lost:
    
        if (r15 == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        return r0;
     */
    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: U0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo24708U0(long r13, q83.InterfaceC30057d<? super zj0.C40733j> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.whoop.service.rearchitect.C10015c.o
            if (r0 == 0) goto L14
            r0 = r15
            com.whoop.service.rearchitect.c$o r0 = (com.whoop.service.rearchitect.C10015c.o) r0
            int r1 = r0.f29968z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f29968z = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.whoop.service.rearchitect.c$o r0 = new com.whoop.service.rearchitect.c$o
            r0.<init>(r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.f29966x
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f29968z
            r2 = 2
            r3 = 1
            r9 = 0
            if (r1 == 0) goto L39
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            p505ts.AbstractC34132o.m107864I(r15)
            goto L69
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            p505ts.AbstractC34132o.m107864I(r15)
            goto L8a
        L39:
            p505ts.AbstractC34132o.m107864I(r15)
            st0.v r15 = r12.mo24752w0()
            int[] r1 = com.whoop.service.rearchitect.C10015c.d.f29847a
            int r15 = r15.ordinal()
            r15 = r1[r15]
            switch(r15) {
                case 1: goto L91;
                case 2: goto L91;
                case 3: goto L91;
                case 4: goto L71;
                case 5: goto L51;
                case 6: goto L51;
                default: goto L4b;
            }
        L4b:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L51:
            r15 = r2
            xj0.d r2 = new xj0.d
            lt0.j r1 = lt0.EnumC24733j.REVISION_2
            r2.<init>(r1)
            r6.f29965w = r13
            r6.f29968z = r15
            r5 = 0
            r7 = 4
            r8 = 0
            r1 = r12
            r3 = r13
            java.lang.Object r15 = jk0.InterfaceC21750d.m61379l0(r1, r2, r3, r5, r6, r7, r8)
            if (r15 != r0) goto L69
            goto L89
        L69:
            boolean r13 = r15 instanceof zj0.C40733j
            if (r13 == 0) goto L70
            zj0.j r15 = (zj0.C40733j) r15
            return r15
        L70:
            return r9
        L71:
            r10 = r13
            r13 = r3
            r3 = r10
            xj0.d r2 = new xj0.d
            lt0.j r14 = lt0.EnumC24733j.REVISION_1
            r2.<init>(r14)
            r6.f29965w = r3
            r6.f29968z = r13
            r5 = 0
            r7 = 4
            r8 = 0
            r1 = r12
            java.lang.Object r15 = jk0.InterfaceC21750d.m61379l0(r1, r2, r3, r5, r6, r7, r8)
            if (r15 != r0) goto L8a
        L89:
            return r0
        L8a:
            boolean r13 = r15 instanceof zj0.C40733j
            if (r13 == 0) goto L91
            zj0.j r15 = (zj0.C40733j) r15
            return r15
        L91:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.service.rearchitect.C10015c.mo24708U0(long, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: V0 */
    public Object mo24709V0(boolean z4, long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        e0 e0Var;
        long j13;
        long j14;
        long j15;
        C38350g0 c38350g0;
        boolean z13 = z4;
        if (interfaceC30057d instanceof e0) {
            e0Var = (e0) interfaceC30057d;
            int i13 = e0Var.f29855E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                e0Var.f29855E = i13 - Integer.MIN_VALUE;
            } else {
                e0Var = new e0(interfaceC30057d);
            }
        } else {
            e0Var = new e0(interfaceC30057d);
        }
        e0 e0Var2 = e0Var;
        Object obj = e0Var2.f29858y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = e0Var2.f29855E;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (mo24752w0() == EnumC32978v.MAVERICK || mo24752w0() == EnumC32978v.GOOSE) {
                C38360j1 c38360j1 = new C38360j1(z13);
                e0Var2.f29856w = z13;
                e0Var2.f29857x = j7;
                e0Var2.f29855E = 1;
                if (InterfaceC21750d.m61379l0(this, c38360j1, j7, null, e0Var2, 4, null) != enumC31071a) {
                    j13 = j7;
                }
                return enumC31071a;
            }
            return c23454a0;
        }
        if (i14 == 1) {
            long j16 = e0Var2.f29857x;
            z13 = e0Var2.f29856w;
            AbstractC34132o.m107864I(obj);
            j13 = j16;
        } else {
            if (i14 == 2) {
                j14 = e0Var2.f29857x;
                z13 = e0Var2.f29856w;
                AbstractC34132o.m107864I(obj);
                e0Var2.f29856w = z13;
                e0Var2.f29857x = j14;
                e0Var2.f29855E = 3;
                if (AbstractC3034m0.m8782b(1000L, e0Var2) != enumC31071a) {
                }
                return enumC31071a;
            }
            if (i14 != 3) {
                if (i14 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            }
            j14 = e0Var2.f29857x;
            z13 = e0Var2.f29856w;
            AbstractC34132o.m107864I(obj);
        }
        j15 = j14;
        c38350g0 = new C38350g0();
        e0Var2.f29856w = z13;
        e0Var2.f29857x = j15;
        e0Var2.f29855E = 4;
        if (InterfaceC21750d.m61379l0(this, c38350g0, j15, null, e0Var2, 4, null) != enumC31071a) {
            return enumC31071a;
        }
        return c23454a0;
        C38363k1 c38363k1 = new C38363k1(z13);
        e0Var2.f29856w = z13;
        e0Var2.f29857x = j13;
        e0Var2.f29855E = 2;
        if (InterfaceC21750d.m61379l0(this, c38363k1, j13, null, e0Var2, 4, null) != enumC31071a) {
            j14 = j13;
            e0Var2.f29856w = z13;
            e0Var2.f29857x = j14;
            e0Var2.f29855E = 3;
            if (AbstractC3034m0.m8782b(1000L, e0Var2) != enumC31071a) {
                j15 = j14;
                c38350g0 = new C38350g0();
                e0Var2.f29856w = z13;
                e0Var2.f29857x = j15;
                e0Var2.f29855E = 4;
                if (InterfaceC21750d.m61379l0(this, c38350g0, j15, null, e0Var2, 4, null) != enumC31071a) {
                    return c23454a0;
                }
            }
        }
        return enumC31071a;
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: X */
    public Object mo24710X(long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo24727g0 = mo24727g0(C38352h.INSTANCE.m122906a(), j7, InterfaceC32564a.a.f134904a, interfaceC30057d);
        return objMo24727g0 == EnumC31071a.f128113w ? objMo24727g0 : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: Y */
    public Object mo24711Y(boolean z4, long j7, InterfaceC30057d<? super C40720e1> interfaceC30057d) {
        u uVar;
        if (interfaceC30057d instanceof u) {
            uVar = (u) interfaceC30057d;
            int i13 = uVar.f29995E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                uVar.f29995E = i13 - Integer.MIN_VALUE;
            } else {
                uVar = new u(interfaceC30057d);
            }
        } else {
            uVar = new u(interfaceC30057d);
        }
        u uVar2 = uVar;
        Object objM61379l0 = uVar2.f29998y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = uVar2.f29995E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM61379l0);
            switch (d.f29847a[mo24752w0().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return null;
                case 5:
                case 6:
                    C38348f1 c38348f1 = new C38348f1(z4);
                    uVar2.f29996w = z4;
                    uVar2.f29997x = j7;
                    uVar2.f29995E = 1;
                    objM61379l0 = InterfaceC21750d.m61379l0(this, c38348f1, j7, null, uVar2, 4, null);
                    if (objM61379l0 == enumC31071a) {
                        return enumC31071a;
                    }
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM61379l0);
        }
        if (objM61379l0 instanceof C40720e1) {
            return (C40720e1) objM61379l0;
        }
        return null;
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: Y0 */
    public InterfaceC13058l mo24712Y0() {
        return AbstractC13091v.m36597g(this.hrRealtimeStreamFlow);
    }

    @Override // nk0.InterfaceC26794a.b
    /* JADX INFO: renamed from: Z */
    public void mo24713Z(C24736m receivedPacket) {
        AbstractC22676k.m65750j(receivedPacket, "receivedPacket");
        this.whoopStrapDataCallbacks.onNext(receivedPacket);
    }

    @Override // nk0.InterfaceC26794a.b
    /* JADX INFO: renamed from: a0 */
    public void mo24714a0(InterfaceC31800b.b imuData) {
        AbstractC22676k.m65750j(imuData, "imuData");
        this.realTimeImuStreamFlow.mo36564a(imuData);
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: a1 */
    public Object mo24715a1(long j7, InterfaceC30057d<? super C40727h> interfaceC30057d) {
        int i13 = d.f29847a[mo24752w0().ordinal()];
        if (i13 == 4) {
            return mo24727g0(new C39587a(), j7, InterfaceC32564a.a.f134904a, interfaceC30057d);
        }
        if (i13 == 5 || i13 == 6) {
            return mo24727g0(new C38355i(), j7, InterfaceC32564a.a.f134904a, interfaceC30057d);
        }
        return null;
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: b, reason: from getter */
    public C22538a getBatteryLevel() {
        return this.batteryLevel;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: b0 */
    public Object mo24717b0(C14554a c14554a, long j7, InterfaceC30057d<? super C40761v0> interfaceC30057d) {
        a0 a0Var;
        if (interfaceC30057d instanceof a0) {
            a0Var = (a0) interfaceC30057d;
            int i13 = a0Var.f29823E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                a0Var.f29823E = i13 - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(interfaceC30057d);
            }
        } else {
            a0Var = new a0(interfaceC30057d);
        }
        a0 a0Var2 = a0Var;
        Object objM61379l0 = a0Var2.f29826y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = a0Var2.f29823E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM61379l0);
            C38386u0 c38386u0 = new C38386u0(c14554a);
            a0Var2.f29824w = null;
            a0Var2.f29825x = j7;
            a0Var2.f29823E = 1;
            objM61379l0 = InterfaceC21750d.m61379l0(this, c38386u0, j7, null, a0Var2, 4, null);
            if (objM61379l0 == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM61379l0);
        }
        if (objM61379l0 instanceof C40761v0) {
            return (C40761v0) objM61379l0;
        }
        return null;
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: b1, reason: from getter */
    public InterfaceC13058l getRealTimeImuDataStreamFlow() {
        return this.realTimeImuDataStreamFlow;
    }

    @Override // nk0.InterfaceC26794a.b
    /* JADX INFO: renamed from: c0 */
    public void mo24719c0(C24736m receivedPacket) {
        AbstractC22676k.m65750j(receivedPacket, "receivedPacket");
        this.whoopStrapEventsCallbacks.onNext(receivedPacket);
    }

    /* JADX INFO: renamed from: c3 */
    public boolean m24720c3() {
        m24685C3();
        m24680x3();
        return this.bluetoothHelper.m13655h(getBluetoothDevice());
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: d */
    public EnumC33703a mo24721d() {
        C27940c hardwareVersion;
        EnumC33703a.Companion aVar = EnumC33703a.INSTANCE;
        WhoopStrapInfo whoopStrapInfo = get_strapInfo();
        return aVar.m106480a((whoopStrapInfo == null || (hardwareVersion = whoopStrapInfo.getHardwareVersion()) == null) ? null : Long.valueOf(hardwareVersion.getHardwareFamily()));
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: d1 */
    public Object mo24722d1(long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo24727g0 = mo24727g0(new C38335b0(), j7, InterfaceC32564a.a.f134904a, interfaceC30057d);
        return objMo24727g0 == EnumC31071a.f128113w ? objMo24727g0 : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x0082  */
    /* JADX WARN: Code duplicated, block: B:24:0x008b  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00e1 -> B:31:0x00e4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: d3 */
    public final java.lang.Object m24723d3(int r17, long r18, q83.InterfaceC30057d<? super zj0.C40746o> r20) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.service.rearchitect.C10015c.m24723d3(int, long, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: e0 */
    public Object mo24725e0(boolean z4, long j7, InterfaceC30057d<? super C40735j1> interfaceC30057d) {
        c0 c0Var;
        if (interfaceC30057d instanceof c0) {
            c0Var = (c0) interfaceC30057d;
            int i13 = c0Var.f29842E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0Var.f29842E = i13 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(interfaceC30057d);
            }
        } else {
            c0Var = new c0(interfaceC30057d);
        }
        c0 c0Var2 = c0Var;
        Object objM61379l0 = c0Var2.f29845y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c0Var2.f29842E;
        EnumC32978v enumC32978v = null;
        Object[] objArr = 0;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM61379l0);
            if (m24731i3()) {
                return null;
            }
            C38366l1 c38366l1 = new C38366l1(z4, enumC32978v, 2, objArr == true ? 1 : 0);
            c0Var2.f29843w = z4;
            c0Var2.f29844x = j7;
            c0Var2.f29842E = 1;
            objM61379l0 = InterfaceC21750d.m61379l0(this, c38366l1, j7, null, c0Var2, 4, null);
            if (objM61379l0 == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM61379l0);
        }
        if (objM61379l0 instanceof C40735j1) {
            return (C40735j1) objM61379l0;
        }
        return null;
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: f, reason: from getter */
    public WhoopStrapInfo get_strapInfo() {
        return this._strapInfo;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: g0 */
    public Object mo24727g0(InterfaceC36081g interfaceC36081g, long j7, InterfaceC32564a interfaceC32564a, InterfaceC30057d<? super C40727h> interfaceC30057d) {
        m0 m0Var;
        if (interfaceC30057d instanceof m0) {
            m0Var = (m0) interfaceC30057d;
            int i13 = m0Var.f29950F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                m0Var.f29950F = i13 - Integer.MIN_VALUE;
            } else {
                m0Var = new m0(interfaceC30057d);
            }
        } else {
            m0Var = new m0(interfaceC30057d);
        }
        Object objAwait = m0Var.f29954z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = m0Var.f29950F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objAwait);
            InterfaceC3018i0 interfaceC3018i0Mo114576a = m24665f3().mo114576a(interfaceC36081g, interfaceC32564a, this, getWhoopDeviceType());
            m0Var.f29951w = null;
            m0Var.f29952x = null;
            m0Var.f29953y = j7;
            m0Var.f29950F = 1;
            objAwait = interfaceC3018i0Mo114576a.await(m0Var);
            if (objAwait == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objAwait);
        }
        InterfaceC36079e interfaceC36079e = (InterfaceC36079e) objAwait;
        if (interfaceC36079e instanceof InterfaceC36079e.a) {
            return null;
        }
        if (interfaceC36079e instanceof InterfaceC36079e.b) {
            return ((InterfaceC36079e.b) interfaceC36079e).getCommandResponse();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // jk0.InterfaceC21750d
    @InterfaceC23457c
    /* JADX INFO: renamed from: h */
    public AbstractC23410a mo24728h() {
        return this.highFreqSyncEventPubSub;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: h0 */
    public Object mo24729h0(boolean z4, long j7, InterfaceC30057d<? super C40723f1> interfaceC30057d) {
        n0 n0Var;
        if (interfaceC30057d instanceof n0) {
            n0Var = (n0) interfaceC30057d;
            int i13 = n0Var.f29960E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                n0Var.f29960E = i13 - Integer.MIN_VALUE;
            } else {
                n0Var = new n0(interfaceC30057d);
            }
        } else {
            n0Var = new n0(interfaceC30057d);
        }
        n0 n0Var2 = n0Var;
        Object objM61379l0 = n0Var2.f29963y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = n0Var2.f29960E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM61379l0);
            C38351g1 c38351g1 = new C38351g1(z4);
            n0Var2.f29961w = z4;
            n0Var2.f29962x = j7;
            n0Var2.f29960E = 1;
            objM61379l0 = InterfaceC21750d.m61379l0(this, c38351g1, j7, null, n0Var2, 4, null);
            if (objM61379l0 == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM61379l0);
        }
        if (objM61379l0 instanceof C40723f1) {
            return (C40723f1) objM61379l0;
        }
        return null;
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: i0 */
    public void mo24730i0() {
        if (AbstractC22676k.m65745e(getStateMachine().m92165k(), C32969m.f137297a)) {
            m24669l3().mo84371h("Strap unlocked; transitioning to Ready", new Object[0]);
            m24640F3();
            return;
        }
        m24669l3().mo84373n("onStrapUnlocked ignored; connection state is " + getStateMachine().m92165k() + ", not Locked", new Object[0]);
    }

    /* JADX INFO: renamed from: i3 */
    public boolean m24731i3() {
        return ((Boolean) ((C13045h2) this._ecgStatusFlow).getValue()).booleanValue();
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: j, reason: from getter */
    public boolean getBatteryPackOn() {
        return this.batteryPackOn;
    }

    @Override // nk0.InterfaceC26794a.b
    /* JADX INFO: renamed from: j0 */
    public void mo24733j0(byte[] chunk) {
        AbstractC22676k.m65750j(chunk, "chunk");
        this.whoopStrapMemfaultCallbacks.onNext(chunk);
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: j3, reason: from getter and merged with bridge method [inline-methods] */
    public c mo24724e() {
        return this.genericHrProfileController;
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: k, reason: from getter */
    public C37605a get_whoopBatteryLevel() {
        return this._whoopBatteryLevel;
    }

    @Override // t92.AbstractC33664b
    /* JADX INFO: renamed from: k2 */
    public void mo24736k2() {
        m24669l3().mo84367a("Releasing Whoop Strap resources", new Object[0]);
        super.mo24736k2();
        mo104077f0(this.connectionCallback);
        this.callbacksCompositeDisposables.m78296d();
        AbstractC3006f0.m8714h(getScope(), null);
    }

    @Override // nk0.InterfaceC26794a.b
    /* JADX INFO: renamed from: l */
    public void mo24737l(C24736m receivedPacket) {
        AbstractC22676k.m65750j(receivedPacket, "receivedPacket");
        this.whoopStrapMetadataCallbacks.onNext(receivedPacket);
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: n, reason: from getter */
    public C22539b getChargeStatus() {
        return this.chargeStatus;
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: n0 */
    public void mo24739n0() {
        synchronized (AbstractC33664b.INSTANCE.m106401a()) {
            m24669l3().mo84367a("History sync object locked!", new Object[0]);
            this.historyLocked = true;
        }
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: n3, reason: from getter and merged with bridge method [inline-methods] */
    public C21753g mo24695J() {
        return this.strapBodyStatus;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        if (r10 == r1) goto L33;
     */
    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo24741o(boolean r7, long r8, q83.InterfaceC30057d<? super zj0.C40727h> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.whoop.service.rearchitect.C10015c.d0
            if (r0 == 0) goto L13
            r0 = r10
            com.whoop.service.rearchitect.c$d0 r0 = (com.whoop.service.rearchitect.C10015c.d0) r0
            int r1 = r0.f29849E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29849E = r1
            goto L18
        L13:
            com.whoop.service.rearchitect.c$d0 r0 = new com.whoop.service.rearchitect.c$d0
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f29852y
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f29849E
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            p505ts.AbstractC34132o.m107864I(r10)
            return r10
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            p505ts.AbstractC34132o.m107864I(r10)
            goto L73
        L39:
            long r8 = r0.f29851x
            boolean r7 = r0.f29850w
            p505ts.AbstractC34132o.m107864I(r10)
            goto L66
        L41:
            p505ts.AbstractC34132o.m107864I(r10)
            st0.v r10 = r6.mo24752w0()
            int[] r2 = com.whoop.service.rearchitect.C10015c.d.f29847a
            int r10 = r10.ordinal()
            r10 = r2[r10]
            switch(r10) {
                case 1: goto L84;
                case 2: goto L84;
                case 3: goto L84;
                case 4: goto L76;
                case 5: goto L59;
                case 6: goto L59;
                default: goto L53;
            }
        L53:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L59:
            r0.f29850w = r7
            r0.f29851x = r8
            r0.f29849E = r5
            java.lang.Object r10 = r6.mo24700N0(r7, r8, r0)
            if (r10 != r1) goto L66
            goto L82
        L66:
            r0.f29850w = r7
            r0.f29851x = r8
            r0.f29849E = r4
            java.lang.Object r10 = r6.m24633B3(r7, r8, r0)
            if (r10 != r1) goto L73
            goto L82
        L73:
            zj0.h r10 = (zj0.C40727h) r10
            return r10
        L76:
            r0.f29850w = r7
            r0.f29851x = r8
            r0.f29849E = r3
            java.lang.Object r7 = r6.m24636D3(r7, r8, r0)
            if (r7 != r1) goto L83
        L82:
            return r1
        L83:
            return r7
        L84:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.service.rearchitect.C10015c.mo24741o(boolean, long, q83.d):java.lang.Object");
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: o0 */
    public InterfaceC13087t1 mo24742o0() {
        return m106379O1().mo89259b();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: p */
    public Object mo24743p(long j7, InterfaceC30057d<? super C40736k> interfaceC30057d) {
        p pVar;
        if (interfaceC30057d instanceof p) {
            pVar = (p) interfaceC30057d;
            int i13 = pVar.f29975z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                pVar.f29975z = i13 - Integer.MIN_VALUE;
            } else {
                pVar = new p(interfaceC30057d);
            }
        } else {
            pVar = new p(interfaceC30057d);
        }
        p pVar2 = pVar;
        Object objM61379l0 = pVar2.f29973x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = pVar2.f29975z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM61379l0);
            m24669l3().mo84367a("Sending Exit High Freq Sync Command to the strap", new Object[0]);
            C38349g c38349g = new C38349g();
            pVar2.f29972w = j7;
            pVar2.f29975z = 1;
            objM61379l0 = InterfaceC21750d.m61379l0(this, c38349g, j7, null, pVar2, 4, null);
            if (objM61379l0 == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM61379l0);
        }
        if (objM61379l0 instanceof C40736k) {
            return (C40736k) objM61379l0;
        }
        return null;
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: p0 */
    public Object mo24744p0(long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo24727g0 = mo24727g0(new C38350g0(), j7, InterfaceC32564a.a.f134904a, interfaceC30057d);
        return objMo24727g0 == EnumC31071a.f128113w ? objMo24727g0 : C23454a0.f92919a;
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: q0 */
    public InterfaceC13058l mo24745q0() {
        return AbstractC13091v.m36597g(this.imuStreamFlow);
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: q3, reason: from getter and merged with bridge method [inline-methods] */
    public InterfaceC13037f2 mo24756z() {
        return this.whoopBatteryLevelFlow;
    }

    @Override // nk0.InterfaceC26794a.b
    @InterfaceC23457c
    /* JADX INFO: renamed from: s */
    public void mo24747s(C12108h imuStreamDataPacket) {
        AbstractC22676k.m65750j(imuStreamDataPacket, "imuStreamDataPacket");
        this.imuStreamFlow.mo36564a(imuStreamDataPacket);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
    
        if (r14 == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0098, code lost:
    
        if (r14 == r0) goto L36;
     */
    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo24748t(long r11, xj0.AbstractC38356i0 r13, q83.InterfaceC30057d<? super zj0.C40749p0> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.whoop.service.rearchitect.C10015c.x
            if (r0 == 0) goto L14
            r0 = r14
            com.whoop.service.rearchitect.c$x r0 = (com.whoop.service.rearchitect.C10015c.x) r0
            int r1 = r0.f30010E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f30010E = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.whoop.service.rearchitect.c$x r0 = new com.whoop.service.rearchitect.c$x
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f30013y
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f30010E
            r2 = 2
            r3 = 1
            r7 = 0
            if (r1 == 0) goto L41
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r11 = r6.f30012x
            xj0.i0 r11 = (xj0.AbstractC38356i0) r11
            p505ts.AbstractC34132o.m107864I(r14)
            goto L79
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            java.lang.Object r11 = r6.f30012x
            xj0.i0 r11 = (xj0.AbstractC38356i0) r11
            p505ts.AbstractC34132o.m107864I(r14)
            goto L9b
        L41:
            p505ts.AbstractC34132o.m107864I(r14)
            boolean r14 = r10.m24731i3()
            if (r14 != 0) goto La2
            st0.v r14 = r10.mo24752w0()
            int[] r1 = com.whoop.service.rearchitect.C10015c.d.f29847a
            int r14 = r14.ordinal()
            r14 = r1[r14]
            r1 = 4
            if (r14 == r1) goto L81
            r1 = 5
            if (r14 == r1) goto L60
            r1 = 6
            if (r14 == r1) goto L60
            return r7
        L60:
            r14 = r2
            xj0.h0 r2 = new xj0.h0
            lt0.j r1 = lt0.EnumC24733j.REVISION_2
            r2.<init>(r1, r13)
            sj2.a$a r5 = sj2.InterfaceC32564a.a.f134904a
            r6.f30012x = r7
            r6.f30011w = r11
            r6.f30010E = r14
            r1 = r10
            r3 = r11
            java.lang.Object r14 = r1.mo24727g0(r2, r3, r5, r6)
            if (r14 != r0) goto L79
            goto L9a
        L79:
            boolean r11 = r14 instanceof zj0.C40749p0
            if (r11 == 0) goto L80
            zj0.p0 r14 = (zj0.C40749p0) r14
            return r14
        L80:
            return r7
        L81:
            r8 = r11
            r11 = r3
            r3 = r8
            xj0.h0 r2 = new xj0.h0
            lt0.j r12 = lt0.EnumC24733j.REVISION_1
            r2.<init>(r12, r13)
            sj2.a$a r5 = sj2.InterfaceC32564a.a.f134904a
            r6.f30012x = r7
            r6.f30011w = r3
            r6.f30010E = r11
            r1 = r10
            java.lang.Object r14 = r1.mo24727g0(r2, r3, r5, r6)
            if (r14 != r0) goto L9b
        L9a:
            return r0
        L9b:
            boolean r11 = r14 instanceof zj0.C40749p0
            if (r11 == 0) goto La2
            zj0.p0 r14 = (zj0.C40749p0) r14
            return r14
        La2:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.service.rearchitect.C10015c.mo24748t(long, xj0.i0, q83.d):java.lang.Object");
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: u */
    public InterfaceC3018i0 mo24749u(InterfaceC36084j task, InterfaceC32564a executionPriority) {
        AbstractC22676k.m65750j(task, "task");
        AbstractC22676k.m65750j(executionPriority, "executionPriority");
        ((C13045h2) task.getServiceFlow()).m36570j(InterfaceC36085k.a.f154178a);
        return m24665f3().mo114576a(task, executionPriority, this, getWhoopDeviceType());
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: v */
    public InterfaceC13058l mo24750v(Set<? extends InterfaceC21461d> filterPacketList) {
        AbstractC22676k.m65750j(filterPacketList, "filterPacketList");
        return new k(new l(new m(m106379O1().mo89259b())), filterPacketList);
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: w */
    public <T extends C12111k> AbstractC23412c mo24751w(Class<T> realTimeDataType) {
        AbstractC22676k.m65750j(realTimeDataType, "realTimeDataType");
        C15578d c15578d = this.whoopStrapRealTimeDataCallbacks;
        c15578d.getClass();
        return new C36926l(new C36926l(c15578d, new C0783z(realTimeDataType, 28), 0), new C3632c(realTimeDataType), 1);
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: w0 */
    public EnumC32978v mo24752w0() {
        return getWhoopDeviceType();
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: x */
    public AbstractC23417h mo24753x() {
        AbstractC15583i currentConnectionFailureMessageSubject = getCurrentConnectionFailureMessageSubject();
        currentConnectionFailureMessageSubject.getClass();
        return new C36923i(currentConnectionFailureMessageSubject);
    }

    @Override // jk0.InterfaceC21750d
    /* JADX INFO: renamed from: x0 */
    public InterfaceC13087t1 mo24754x0() {
        return m106375J1().mo89259b();
    }

    /* JADX INFO: renamed from: y3 */
    public final void m24755y3() {
        String strM92198d;
        String strM92199e;
        InterfaceC27939b bluetoothVersion;
        InterfaceC27939b maximVersion;
        WhoopStrapInfo whoopStrapInfo = get_strapInfo();
        if (whoopStrapInfo == null || (maximVersion = whoopStrapInfo.getMaximVersion()) == null || (strM92198d = maximVersion.mo84319a()) == null) {
            strM92198d = this.whoopStrapSharedPrefs.m92198d();
        }
        String str = strM92198d;
        WhoopStrapInfo whoopStrapInfo2 = get_strapInfo();
        if (whoopStrapInfo2 == null || (bluetoothVersion = whoopStrapInfo2.getBluetoothVersion()) == null || (strM92199e = bluetoothVersion.mo84319a()) == null) {
            strM92199e = this.whoopStrapSharedPrefs.m92199e();
        }
        this.analyticsManager.mo41421c("EEPROM Failure", "Connectivity", str, strM92199e, this.whoopStrapSharedPrefs.m92200f(), null, null, null, null);
    }

    public /* synthetic */ C10015c(Context context, BluetoothDevice bluetoothDevice, Class cls, InterfaceC18732d interfaceC18732d, InterfaceC40188b interfaceC40188b, C30076h c30076h, HandlerThread handlerThread, InterfaceC25435a interfaceC25435a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, bluetoothDevice, cls, (i13 & 8) != 0 ? new C18729a() : interfaceC18732d, interfaceC40188b, c30076h, handlerThread, (i13 & 128) != 0 ? AbstractC25438d.m74669a() : interfaceC25435a, interfaceC2994c0);
    }
}
