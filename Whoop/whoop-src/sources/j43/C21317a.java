package j43;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import androidx.compose.p018ui.node.NodeCoordinator;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.health.platform.client.proto.C1533u;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.room.C1778e;
import bc3.AbstractC2995c1;
import bc3.AbstractC3006f0;
import bc3.AbstractC3076z;
import bc3.C3033m;
import bc3.InterfaceC2994c0;
import c33.AbstractC3945l;
import c33.C3938e;
import com.amplitude.android.engagement.C4861a;
import com.google.crypto.tink.internal.C5101l0;
import com.mapbox.maps.ScreenCoordinate;
import com.squareup.wire.AbstractC5579j;
import com.squareup.wire.AbstractC5581l;
import ih0.AbstractC18489d0;
import io.getstream.video.android.core.notifications.internal.service.CallService;
import java.io.Closeable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import l83.C23454a0;
import l83.C23470p;
import m83.AbstractC25260n;
import n23.AbstractC26202e;
import p025b1.C2214e;
import p080d4.C11653l;
import p108e4.AbstractC12682p;
import p119ej.C13225b;
import p181h2.C16617b;
import p197hj.EnumC17339v;
import p209i3.C18034p;
import p241j3.C21266c;
import p282kk.C22533b;
import p342nj.C26737b;
import p390p1.C28624i0;
import p406pv.C29572a;
import p450r5.C30931e;
import p450r5.RunnableC30927a;
import p450r5.RunnableC30928b;
import p479s4.AbstractC32122c;
import p480s5.C32198a;
import p507tx.C34231b;
import p512u2.C34460g0;
import p553vj.C36065b;
import p635y2.C39092f1;
import p635y2.C39144x;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.InterfaceC30061h;
import stream.video.sfu.models.Error;
import stream.video.sfu.models.ParticipantSource;
import t23.C33392g2;
import ud3.InterfaceC34821j;
import v53.C35709c;
import y33.C39202e;
import y53.AbstractC39243c;
import z40.AbstractC40058e;
import z53.C40115g;
import zd3.C40571o;

/* JADX INFO: renamed from: j43.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C21317a extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f81517w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f81518x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21317a(Object obj, int i13) {
        super(1);
        this.f81517w = i13;
        this.f81518x = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v9, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r9v0, types: [q83.d] */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f81517w;
        int i14 = 2;
        int i15 = 0;
        String strMo77807a = 0;
        screenCoordinate = null;
        ScreenCoordinate screenCoordinate = null;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = this.f81518x;
        switch (i13) {
            case 0:
                AbstractC26202e abstractC26202e = (AbstractC26202e) obj;
                CallService callService = (CallService) obj2;
                strMo77807a = abstractC26202e != null ? abstractC26202e.mo77807a() : 0;
                C23470p c23470p = CallService.f74912I;
                callService.m55785e(strMo77807a);
                return c23454a0;
            case 1:
                ParticipantSource source = (ParticipantSource) obj;
                AbstractC22676k.m65750j(source, "source");
                int iM74085z0 = AbstractC25260n.m74085z0((ParticipantSource[]) obj2, source);
                if (iM74085z0 == -1) {
                    iM74085z0 = Integer.MAX_VALUE;
                }
                return Integer.valueOf(iM74085z0);
            case 2:
                ((C22533b) obj2).f88565h.mo32218s(((Boolean) obj).booleanValue() ? "#!upload" : "#!maxRetryAttemptReached");
                return c23454a0;
            case 3:
                C36065b withDensity = (C36065b) obj;
                AbstractC22676k.m65750j(withDensity, "$this$withDensity");
                C18034p c18034p = (C18034p) obj2;
                int iM47189e = (int) C16617b.m47189e(c18034p.m51788m());
                int iM47190f = (int) C16617b.m47190f(c18034p.m51788m());
                int iM47189e2 = (int) C16617b.m47189e(c18034p.m51788m());
                NodeCoordinator nodeCoordinatorM51780d = c18034p.m51780d();
                int i16 = iM47189e2 + ((int) ((nodeCoordinatorM51780d != null ? nodeCoordinatorM51780d.f168213y : 0L) >> 32));
                int iM47190f2 = (int) C16617b.m47190f(c18034p.m51788m());
                NodeCoordinator nodeCoordinatorM51780d2 = c18034p.m51780d();
                return withDensity.m114535b(new Rect(iM47189e, iM47190f, i16, iM47190f2 + ((int) ((nodeCoordinatorM51780d2 != null ? nodeCoordinatorM51780d2.f168213y : 0L) & 4294967295L))));
            case 4:
                ((Boolean) obj).getClass();
                C4861a c4861a = (C4861a) obj2;
                C5101l0 c5101l0 = C4861a.f20259o;
                if (4 <= ((EnumC17339v) c5101l0.f21444y).f67150w) {
                    c5101l0.m16045Z(EnumC17339v.DEBUG, "AmplitudeEngagement.sdk[internal]#toggleBypassCustomThrottles()");
                }
                c4861a.f20263d.m53801a("globalThis.nudgeActions.toggleBypassCustomThrottles()", null);
                return c23454a0;
            case 5:
                C29572a GesturesSettings = (C29572a) obj;
                AbstractC22676k.m65750j(GesturesSettings, "$this$GesturesSettings");
                TypedArray typedArray = (TypedArray) obj2;
                GesturesSettings.f120643a = typedArray.getBoolean(43, true);
                GesturesSettings.f120644b = typedArray.getBoolean(39, true);
                GesturesSettings.f120645c = typedArray.getBoolean(45, true);
                GesturesSettings.f120646d = typedArray.getBoolean(47, true);
                GesturesSettings.f120647e = typedArray.getBoolean(40, true);
                int i17 = AbstractC12682p.m35486f(3)[typedArray.getInt(46, 2)];
                AbstractC18489d0.m53382w(i17, "<set-?>");
                GesturesSettings.f120648f = i17;
                GesturesSettings.f120649g = typedArray.getBoolean(31, true);
                GesturesSettings.f120650h = typedArray.getBoolean(32, true);
                GesturesSettings.f120651i = typedArray.getBoolean(41, true);
                if (typedArray.hasValue(33) && typedArray.hasValue(34)) {
                    screenCoordinate = new ScreenCoordinate(typedArray.getFloat(33, 0.0f), typedArray.getFloat(34, 0.0f));
                }
                GesturesSettings.f120652j = screenCoordinate;
                GesturesSettings.f120653k = typedArray.getBoolean(38, true);
                GesturesSettings.f120654l = typedArray.getBoolean(42, true);
                GesturesSettings.f120655m = typedArray.getBoolean(44, true);
                GesturesSettings.f120656n = typedArray.getBoolean(36, true);
                GesturesSettings.f120657o = typedArray.getBoolean(35, true);
                GesturesSettings.f120658p = typedArray.getFloat(48, 1.0f);
                GesturesSettings.f120659q = typedArray.getBoolean(37, true);
                return c23454a0;
            case 6:
                C28624i0 DisposableEffect = (C28624i0) obj;
                AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
                return new C2214e((ExoPlayer) obj2, 11);
            case 7:
                GetCredentialException e5 = (GetCredentialException) obj;
                AbstractC22676k.m65750j(e5, "e");
                C30931e c30931e = (C30931e) obj2;
                c30931e.m95140f().execute(new RunnableC30927a(c30931e, e5, i15));
                return c23454a0;
            case 8:
                String it = (String) obj;
                AbstractC22676k.m65750j(it, "it");
                ((AbstractC22680m) obj2).invoke(it);
                return c23454a0;
            case 9:
                CreateCredentialException e13 = (CreateCredentialException) obj;
                AbstractC22676k.m65750j(e13, "e");
                C32198a c32198a = (C32198a) obj2;
                Executor executor = c32198a.f133336f;
                if (executor != null) {
                    executor.execute(new RunnableC30928b(8, c32198a, e13));
                    return c23454a0;
                }
                AbstractC22676k.m65757q("executor");
                throw null;
            case 10:
                C3938e it3 = (C3938e) obj;
                AbstractC22676k.m65750j(it3, "it");
                AbstractC3945l abstractC3945l = (AbstractC3945l) obj2;
                AbstractC40058e abstractC40058eMo11992a = abstractC3945l != null ? abstractC3945l.mo11992a() : null;
                InterfaceC2994c0 interfaceC2994c0M11991a = it3.m11991a();
                if (interfaceC2994c0M11991a != null) {
                    AbstractC3006f0.m8732z(interfaceC2994c0M11991a, null, null, new C1778e(it3, abstractC40058eMo11992a, strMo77807a, i14), 3);
                }
                return c23454a0;
            case 11:
                String it4 = (String) obj;
                AbstractC22676k.m65750j(it4, "it");
                return it4.length() == 0 ? (String) ((C33392g2) obj2).f139445x.getValue() : it4;
            case 12:
                AbstractC22676k.m65750j((Throwable) obj, "it");
                ((C40571o) ((InterfaceC34821j) obj2)).cancel();
                return c23454a0;
            case 13:
                AbstractC5579j builder = (AbstractC5579j) obj;
                AbstractC22676k.m65750j(builder, "builder");
                return ((Field) obj2).get(builder);
            case 14:
                AbstractC5581l instance = (AbstractC5581l) obj;
                AbstractC22676k.m65750j(instance, "instance");
                return ((Method) obj2).invoke(instance, null);
            case 15:
                AbstractC5581l instance2 = (AbstractC5581l) obj;
                AbstractC22676k.m65750j(instance2, "instance");
                return ((C34231b) obj2).f143599b.get(instance2);
            case 16:
                Throwable th3 = (Throwable) obj;
                C34460g0 c34460g0 = (C34460g0) obj2;
                C3033m c3033m = c34460g0.f144777y;
                if (c3033m != null) {
                    c3033m.cancel(th3);
                }
                c34460g0.f144777y = null;
                return c23454a0;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                String permission = (String) obj;
                AbstractC22676k.m65750j(permission, "permission");
                return Integer.valueOf(AbstractC32122c.checkSelfPermission((Context) obj2, permission));
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                AbstractC22676k.m65750j((C13225b) obj, "it");
                return obj2;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                if (((Throwable) obj) != null) {
                    AbstractC3006f0.m8714h(((C35709c) obj2).f151932w, null);
                }
                return c23454a0;
            case 20:
                C36065b withDensity2 = (C36065b) obj;
                AbstractC22676k.m65750j(withDensity2, "$this$withDensity");
                return ((C26737b) obj2).invoke(withDensity2);
            case 21:
                C21266c c21266c = (C21266c) obj;
                C39144x c39144x = (C39144x) obj2;
                c39144x.f168294O.f168289a.setValue(c21266c);
                c39144x.f168296Q = c21266c;
                return c23454a0;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                C39092f1 c39092f1 = (C39092f1) obj2;
                c39092f1.m124617X0((C21266c) obj, c39092f1.f168177V);
                return c23454a0;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                Error it5 = (Error) obj;
                AbstractC22676k.m65750j(it5, "it");
                ((C39202e) obj2).f168484b.invoke(it5);
                return c23454a0;
            case 24:
                InterfaceC30061h interfaceC30061h = (AbstractC3076z) ((C40115g) ((AbstractC39243c) obj2)).f173158z.getValue();
                try {
                    if (interfaceC30061h instanceof AbstractC2995c1) {
                        ((AbstractC2995c1) interfaceC30061h).close();
                    } else if (interfaceC30061h instanceof Closeable) {
                        ((Closeable) interfaceC30061h).close();
                    }
                    break;
                } catch (Throwable unused) {
                }
                return c23454a0;
            case 25:
                ((C11653l) obj2).cancel(false);
                return c23454a0;
            default:
                ConnectivityManager callWithSecurityExceptionHandling = (ConnectivityManager) obj;
                AbstractC22676k.m65750j(callWithSecurityExceptionHandling, "$this$callWithSecurityExceptionHandling");
                callWithSecurityExceptionHandling.unregisterNetworkCallback((ConnectivityManager.NetworkCallback) obj2);
                return c23454a0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C21317a(Function1 function1) {
        super(1);
        this.f81517w = 8;
        this.f81518x = (AbstractC22680m) function1;
    }
}
