package com.whoop.p069ui.drawer.strapsettings.connectstrap;

import android.R;
import android.content.ComponentCallbacks;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.transition.Slide;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.C1271a;
import androidx.fragment.app.RunnableC1283d;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.InterfaceC1583f2;
import b13.ViewOnClickListenerC2292a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import bc3.InterfaceC3061u;
import bi.AbstractC3269g;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ch.C4588i;
import ci2.InterfaceC4733b;
import com.whoop.data.remote.domain.response.onboarding.OnboardingInfo;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.domain.exception.ConnectivityException;
import com.whoop.domain.model.WhoopStrapInfo;
import com.whoop.p069ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity;
import com.whoop.p069ui.home.redesign.view.MainActivity;
import com.whoop.pairing.membershipAdjustment.MembershipAdjustmentFragment;
import com.whoop.service.rearchitect.BleWhoopStrapService;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fc3.C14380k;
import fi0.InterfaceC14515a;
import hi0.AbstractC17306d;
import hi0.AbstractC17307e;
import hi0.AbstractC17310h;
import hi0.AbstractC17312j;
import hj0.AbstractActivityC17360s;
import ii0.AbstractC18537c;
import in2.InterfaceC18732d;
import io.sentry.android.core.RunnableC20151r0;
import j02.InterfaceC21153l0;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import jf3.C21647a;
import jk0.InterfaceC21750d;
import jo.ViewOnClickListenerC21821j;
import l73.AbstractC23417h;
import l83.C23454a0;
import l83.C23465k;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lh3.C24082e;
import lr.RunnableC24693e;
import mh3.C25566c;
import mi1.C25575d;
import mk0.EnumC25628a;
import mm.C25680d;
import n73.C26442a;
import n73.InterfaceC26443b;
import nf3.C26669a;
import o52.C27566m0;
import or2.InterfaceC28172j0;
import org.koin.core.error.ScopeNotCreatedException;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p161g.AbstractC14911n;
import p161g.C14899c0;
import p161g.C14901d0;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p184h5.C16905q1;
import p314m.C24844i;
import p319m4.AbstractC25012a;
import p399pb.InterfaceC29049f;
import p479s4.AbstractC32122c;
import p505ts.AbstractC34132o;
import p543v4.C35643b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22673i0;
import pf.AbstractC29125c;
import q73.EnumC30025d;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import q92.C30071c;
import q92.C30076h;
import qm2.AbstractC30495l;
import qm2.AbstractC30500q;
import qm2.C30484a;
import qm2.C30491h;
import qm2.C30492i;
import qm2.C30493j;
import qm2.C30496m;
import qm2.C30498o;
import qm2.C30501r;
import qm2.C30503t;
import qm2.C30504u;
import qm2.EnumC30499p;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.AbstractC32962f;
import st0.AbstractC32977u;
import st0.C32963g;
import st0.C32965i;
import st0.C32969m;
import st0.C32970n;
import st0.EnumC32978v;
import t73.C33588a;
import tr2.InterfaceC34116n;
import ug.AbstractC34924m;
import ur2.C35199a;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import w73.C36922h;
import w73.C36923i;
import xf3.C38266c;
import xg3.C38280g;
import z82.C40196j;
import zg3.C40634a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t*\u0002§\u0001\b\u0007\u0018\u0000 ±\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004²\u0001³\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\bH\u0014¢\u0006\u0004\b\r\u0010\u0005J\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0005J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0005J\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0005J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0011J\u000f\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u0005J\u000f\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u0005J\u000f\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u0005J\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u0011J\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010\u0011J\u000f\u0010 \u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010\u0005J\u0017\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\bH\u0002¢\u0006\u0004\b%\u0010\u0005J\u000f\u0010&\u001a\u00020\bH\u0002¢\u0006\u0004\b&\u0010\u0005J\u000f\u0010'\u001a\u00020\bH\u0002¢\u0006\u0004\b'\u0010\u0005J\u000f\u0010(\u001a\u00020\bH\u0002¢\u0006\u0004\b(\u0010\u0005JA\u00100\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010)2\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u00010+2\b\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010/\u001a\u00020\u0013H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\bH\u0002¢\u0006\u0004\b2\u0010\u0005J/\u00103\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010)2\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u00010+H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\bH\u0002¢\u0006\u0004\b5\u0010\u0005J\u000f\u00106\u001a\u00020\bH\u0002¢\u0006\u0004\b6\u0010\u0005J\u000f\u00107\u001a\u00020\bH\u0002¢\u0006\u0004\b7\u0010\u0005J\u000f\u00108\u001a\u00020\bH\u0002¢\u0006\u0004\b8\u0010\u0005J\u000f\u00109\u001a\u00020\bH\u0002¢\u0006\u0004\b9\u0010\u0005J\u000f\u0010:\u001a\u00020\bH\u0002¢\u0006\u0004\b:\u0010\u0005J\u000f\u0010;\u001a\u00020\bH\u0002¢\u0006\u0004\b;\u0010\u0005J\u0011\u0010=\u001a\u0004\u0018\u00010<H\u0002¢\u0006\u0004\b=\u0010>R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010I\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010@R\u0016\u0010K\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010@R\u0016\u0010O\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010\\\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\"\u0010d\u001a\u00020]8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001b\u0010j\u001a\u00020e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u001b\u0010o\u001a\u00020k8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010g\u001a\u0004\bm\u0010nR\u001b\u0010t\u001a\u00020p8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010g\u001a\u0004\br\u0010sR\u0014\u0010x\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010|\u001a\u00020y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0019\u0010\u0080\u0001\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0082\u0001\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010[R\u0017\u0010\u0085\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b[\u0010\u0084\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001f\u0010\u009d\u0001\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u009a\u0001\u0010g\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001f\u0010¢\u0001\u001a\n\u0012\u0005\u0012\u00030\u009f\u00010\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u001a\u0010¦\u0001\u001a\u00030£\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0018\u0010ª\u0001\u001a\u00030§\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0018\u0010®\u0001\u001a\u00030«\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u0016\u0010°\u0001\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¯\u0001\u0010\u0015¨\u0006´\u0001"}, m65681d2 = {"Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;", "Lhj0/s;", "Lbc3/c0;", "Lcom/whoop/service/rearchitect/BleWhoopStrapService$c;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "onStop", "onDestroy", "Ljk0/d;", "whoopStrap", "C", "(Ljk0/d;)V", "q", "", "p", "()Ljava/lang/String;", "u0", "g1", "L0", "strap", "c1", "i1", "R0", "t1", "T0", "M0", "Z0", "Lst0/i;", "error", "W0", "(Lst0/i;)V", "X0", "o1", "G0", "n1", "Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;", "onboardingInfo", "", "eventMetadata", "Lst0/v;", "strapGen", "serialNumber", "l1", "(Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;Ljava/util/Map;Lst0/v;Ljava/lang/String;)V", "J0", "I0", "(Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;Ljava/util/Map;)V", "x0", "Y0", "w0", "e1", "j1", "r1", "F0", "", "H0", "()Ljava/lang/Boolean;", "Lqm2/m;", "I", "Lqm2/m;", "selectedBluetoothDevice", "Ltr2/n;", "J", "Ltr2/n;", "log", "", "K", "indexConnecting", "L", "indexConnected", "Ln73/b;", "M", "Ln73/b;", "serviceConnectionDisposable", "Lmh3/c;", "N", "Lmh3/c;", "compositeSubscription", "Ln73/a;", "O", "Ln73/a;", "compositeDisposable", "P", "Ljk0/d;", "Q", "Z", "movingToDialog", "Lqm2/o;", "R", "Lqm2/o;", "B0", "()Lqm2/o;", "f1", "(Lqm2/o;)V", "intentBuilder", "Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;", "S", "Ll83/h;", "E0", "()Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;", "viewModel", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "T", "A0", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lfi0/a;", "U", "y0", "()Lfi0/a;", "analytics", "Lbc3/u;", "V", "Lbc3/u;", "job", "Lin2/d;", "W", "Lin2/d;", "dispatcherFactory", "Lbc3/k1;", "X", "Lbc3/k1;", "timeoutJob", "Y", "serviceHasWhoopStrap", "Lz82/j;", "Lz82/j;", "onboardingTracker", "Lrr2/c;", "a0", "Lrr2/c;", "crashReporter", "Lor2/j0;", "b0", "Lor2/j0;", "idleIndicator", "Lq92/h;", "c0", "Lq92/h;", "whoopStrapSharedPrefs", "Lmi1/d;", "d0", "Lmi1/d;", "hapticsWrapper", "Lci2/b;", "e0", "Lci2/b;", "whoopStrapProvider", "f0", "D0", "()Z", "strapUnlockEnabled", "Llh3/e;", "Lqm2/l;", "g0", "Llh3/e;", "newBleConnectStrapViewEvents", "Lii0/c;", "h0", "Lii0/c;", "binding", "com/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$e", "i0", "Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$e;", "serviceConnection", "Lq83/j;", "getCoroutineContext", "()Lq83/j;", "coroutineContext", "C0", "strapGenerationForAnalytic", "j0", "b", "a", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class BleConnectStrapActivity extends AbstractActivityC17360s implements InterfaceC2994c0, BleWhoopStrapService.InterfaceC10005c {

    /* JADX INFO: renamed from: k0 */
    public static final int f31842k0 = 8;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private C30496m selectedBluetoothDevice;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private int indexConnected;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private InterfaceC21750d whoopStrap;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private boolean movingToDialog;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public C30498o intentBuilder;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final InterfaceC23462h analytics;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private final InterfaceC3061u job;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private final InterfaceC18732d dispatcherFactory;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private volatile InterfaceC3027k1 timeoutJob;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private boolean serviceHasWhoopStrap;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private final C40196j onboardingTracker;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    private final InterfaceC28172j0 idleIndicator;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    private final C30076h whoopStrapSharedPrefs;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    private final C25575d hapticsWrapper;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    private final InterfaceC23462h strapUnlockEnabled;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    private final C24082e newBleConnectStrapViewEvents;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    private AbstractC18537c binding;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    private final ServiceConnectionC10524e serviceConnection;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC34116n log = InterfaceC34116n.INSTANCE.m107848a("BleConnectStrapActivity");

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private int indexConnecting = 1;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private InterfaceC26443b serviceConnectionDisposable = EnumC30025d.f122538w;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final C25566c compositeSubscription = new C25566c();

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final C26442a compositeDisposable = new C26442a();

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10530k(this, null, new C10529j(this), null));

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity$b */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$b;", "Lqm2/o;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10521b extends C30498o {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10521b(Context context) {
            super(context, (Class<?>) BleConnectStrapActivity.class);
            AbstractC22676k.m65750j(context, "context");
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity$c */
    @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity$observeCommandCapableStrap$1", m100430f = "BleConnectStrapActivity.kt", m100431l = {226}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10522c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f31870w;

        /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity$observeCommandCapableStrap$1$1", m100430f = "BleConnectStrapActivity.kt", m100431l = {233}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f31872w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ BleConnectStrapActivity f31873x;

            /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity$c$a$a, reason: collision with other inner class name */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41427a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ BleConnectStrapActivity f31874w;

                public C41427a(BleConnectStrapActivity bleConnectStrapActivity) {
                    this.f31874w = bleConnectStrapActivity;
                }

                @Override // ec3.InterfaceC13062m
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(C23465k c23465k, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    InterfaceC21750d interfaceC21750d = (InterfaceC21750d) c23465k.f92937w;
                    AbstractC32962f abstractC32962f = (AbstractC32962f) c23465k.f92938x;
                    this.f31874w.m27092e1();
                    if (AbstractC22676k.m65745e(abstractC32962f, C32970n.f137298a) || AbstractC22676k.m65745e(abstractC32962f, C32969m.f137297a)) {
                        this.f31874w.m27088c1(interfaceC21750d);
                    } else if (AbstractC22676k.m65745e(abstractC32962f, C32963g.f137291a)) {
                        this.f31874w.serviceHasWhoopStrap = false;
                        this.f31874w.whoopStrap = null;
                        this.f31874w.m27078X0();
                    } else if (abstractC32962f instanceof C32965i) {
                        this.f31874w.m27076W0((C32965i) abstractC32962f);
                    } else {
                        this.f31874w.m27109n1();
                    }
                    return C23454a0.f92919a;
                }
            }

            /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity$c$a$b */
            @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity$observeCommandCapableStrap$1$1$invokeSuspend$$inlined$flatMapLatest$1", m100430f = "BleConnectStrapActivity.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class b extends AbstractC32275i implements Function3 {

                /* JADX INFO: renamed from: w */
                int f31875w;

                /* JADX INFO: renamed from: x */
                private /* synthetic */ Object f31876x;

                /* JADX INFO: renamed from: y */
                /* synthetic */ Object f31877y;

                public b(InterfaceC30057d interfaceC30057d) {
                    super(3, interfaceC30057d);
                }

                public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC21750d interfaceC21750d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    b bVar = new b(interfaceC30057d);
                    bVar.f31876x = interfaceC13062m;
                    bVar.f31877y = interfaceC21750d;
                    return bVar.invokeSuspend(C23454a0.f92919a);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i13 = this.f31875w;
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f31876x;
                        InterfaceC21750d interfaceC21750d = (InterfaceC21750d) this.f31877y;
                        c cVar = new c(interfaceC21750d.getConnectionStateFlow(), interfaceC21750d);
                        this.f31876x = null;
                        this.f31877y = null;
                        this.f31875w = 1;
                        if (AbstractC13091v.m36613w(interfaceC13062m, cVar, this) == enumC31071a) {
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
                    return invoke((InterfaceC13062m) obj, (InterfaceC21750d) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
                }
            }

            /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity$c$a$c */
            @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class c implements InterfaceC13058l {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13058l f31878w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ InterfaceC21750d f31879x;

                /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity$c$a$c$a, reason: collision with other inner class name */
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C41428a<T> implements InterfaceC13062m {

                    /* JADX INFO: renamed from: w */
                    final /* synthetic */ InterfaceC13062m f31880w;

                    /* JADX INFO: renamed from: x */
                    final /* synthetic */ InterfaceC21750d f31881x;

                    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity$c$a$c$a$a, reason: collision with other inner class name */
                    @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity$observeCommandCapableStrap$1$1$invokeSuspend$lambda$0$$inlined$map$1$2", m100430f = "BleConnectStrapActivity.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                    public static final class C41429a extends AbstractC32269c {

                        /* JADX INFO: renamed from: E */
                        Object f31882E;

                        /* JADX INFO: renamed from: F */
                        Object f31883F;

                        /* JADX INFO: renamed from: G */
                        Object f31884G;

                        /* JADX INFO: renamed from: H */
                        int f31885H;

                        /* JADX INFO: renamed from: w */
                        /* synthetic */ Object f31886w;

                        /* JADX INFO: renamed from: x */
                        int f31887x;

                        /* JADX INFO: renamed from: y */
                        Object f31888y;

                        public C41429a(InterfaceC30057d interfaceC30057d) {
                            super(interfaceC30057d);
                        }

                        @Override // s83.AbstractC32267a
                        public final Object invokeSuspend(Object obj) {
                            this.f31886w = obj;
                            this.f31887x |= Integer.MIN_VALUE;
                            return C41428a.this.emit(null, this);
                        }
                    }

                    public C41428a(InterfaceC13062m interfaceC13062m, InterfaceC21750d interfaceC21750d) {
                        this.f31880w = interfaceC13062m;
                        this.f31881x = interfaceC21750d;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // ec3.InterfaceC13062m
                    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                        C41429a c41429a;
                        if (interfaceC30057d instanceof C41429a) {
                            c41429a = (C41429a) interfaceC30057d;
                            int i13 = c41429a.f31887x;
                            if ((i13 & Integer.MIN_VALUE) != 0) {
                                c41429a.f31887x = i13 - Integer.MIN_VALUE;
                            } else {
                                c41429a = new C41429a(interfaceC30057d);
                            }
                        } else {
                            c41429a = new C41429a(interfaceC30057d);
                        }
                        Object obj2 = c41429a.f31886w;
                        EnumC31071a enumC31071a = EnumC31071a.f128113w;
                        int i14 = c41429a.f31887x;
                        if (i14 == 0) {
                            AbstractC34132o.m107864I(obj2);
                            InterfaceC13062m interfaceC13062m = this.f31880w;
                            C23465k c23465k = new C23465k(this.f31881x, (AbstractC32962f) obj);
                            c41429a.f31888y = null;
                            c41429a.f31882E = null;
                            c41429a.f31883F = null;
                            c41429a.f31884G = null;
                            c41429a.f31885H = 0;
                            c41429a.f31887x = 1;
                            if (interfaceC13062m.emit(c23465k, c41429a) == enumC31071a) {
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

                public c(InterfaceC13058l interfaceC13058l, InterfaceC21750d interfaceC21750d) {
                    this.f31878w = interfaceC13058l;
                    this.f31879x = interfaceC21750d;
                }

                @Override // ec3.InterfaceC13058l
                public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                    Object objCollect = this.f31878w.collect(new C41428a(interfaceC13062m, this.f31879x), interfaceC30057d);
                    return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BleConnectStrapActivity bleConnectStrapActivity, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f31873x = bleConnectStrapActivity;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f31873x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f31872w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C14380k c14380kM36590P = AbstractC13091v.m36590P(new C4588i(this.f31873x.whoopStrapProvider.mo14817a(), 2), new b(null));
                    C41427a c41427a = new C41427a(this.f31873x);
                    this.f31872w = 1;
                    if (c14380kM36590P.collect(c41427a, this) == enumC31071a) {
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

        public C10522c(InterfaceC30057d<? super C10522c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return BleConnectStrapActivity.this.new C10522c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10522c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f31870w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                BleConnectStrapActivity bleConnectStrapActivity = BleConnectStrapActivity.this;
                EnumC1635w enumC1635w = EnumC1635w.f6328z;
                a aVar = new a(bleConnectStrapActivity, null);
                this.f31870w = 1;
                if (AbstractC1613o1.m5023m(bleConnectStrapActivity, enumC1635w, aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity$d */
    @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity$resetTimeout$1", m100430f = "BleConnectStrapActivity.kt", m100431l = {604, 610}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10523d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f31890w;

        /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity$d$a */
        @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity$resetTimeout$1$1", m100430f = "BleConnectStrapActivity.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f31892w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ BleConnectStrapActivity f31893x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BleConnectStrapActivity bleConnectStrapActivity, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f31893x = bleConnectStrapActivity;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f31893x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f31892w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                this.f31893x.m27080Y0();
                return C23454a0.f92919a;
            }
        }

        public C10523d(InterfaceC30057d<? super C10523d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return BleConnectStrapActivity.this.new C10523d(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10523d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
        
            if (bc3.AbstractC3006f0.m8705K(r7, r3, r6) == r0) goto L26;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r6.f31890w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1d
                if (r1 == r3) goto L19
                if (r1 != r2) goto L11
                p505ts.AbstractC34132o.m107864I(r7)
                goto L8c
            L11:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L19:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L2b
            L1d:
                p505ts.AbstractC34132o.m107864I(r7)
                r6.f31890w = r3
                r4 = 20000(0x4e20, double:9.8813E-320)
                java.lang.Object r7 = bc3.AbstractC3034m0.m8782b(r4, r6)
                if (r7 != r0) goto L2b
                goto L8b
            L2b:
                com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity r7 = com.whoop.p069ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity.this
                bc3.k1 r7 = com.whoop.p069ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity.m27094g0(r7)
                if (r7 == 0) goto L8c
                boolean r7 = r7.isActive()
                if (r7 != r3) goto L8c
                com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity r7 = com.whoop.p069ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity.this
                tr2.n r7 = com.whoop.p069ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity.m27089d0(r7)
                r1 = 0
                qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r1]
                java.lang.String r3 = "Failing due to timeout"
                r7.mo85226q(r3, r1)
                com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity r7 = com.whoop.p069ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity.this
                qm2.m r7 = com.whoop.p069ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity.m27091e0(r7)
                r1 = 0
                if (r7 == 0) goto L72
                com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity r7 = com.whoop.p069ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity.this
                z82.e r7 = r7.m49099s()
                com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity r4 = com.whoop.p069ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity.this
                qm2.m r4 = com.whoop.p069ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity.m27091e0(r4)
                if (r4 == 0) goto L6c
                java.lang.String r4 = r4.getStrapGen()
                com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity r5 = com.whoop.p069ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity.this
                java.lang.Boolean r5 = com.whoop.p069ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity.m27100j0(r5)
                r7.m129027b0(r3, r4, r5)
                goto L72
            L6c:
                java.lang.String r7 = "selectedBluetoothDevice"
                p715kotlin.jvm.internal.AbstractC22676k.m65757q(r7)
                throw r1
            L72:
                com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity r7 = com.whoop.p069ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity.this
                in2.d r7 = com.whoop.p069ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity.m27083a0(r7)
                q83.j r7 = r7.mo54464a()
                com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity$d$a r3 = new com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity$d$a
                com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity r4 = com.whoop.p069ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity.this
                r3.<init>(r4, r1)
                r6.f31890w = r2
                java.lang.Object r7 = bc3.AbstractC3006f0.m8705K(r7, r3, r6)
                if (r7 != r0) goto L8c
            L8b:
                return r0
            L8c:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.p069ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity.C10523d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity$e */
    @Metadata(m65680d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"com/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$e", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "className", "Landroid/os/IBinder;", NotificationCompat.CATEGORY_SERVICE, "Ll83/a0;", "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "name", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class ServiceConnectionC10524e implements ServiceConnection {
        public ServiceConnectionC10524e() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName className, IBinder service) {
            AbstractC22676k.m65750j(className, "className");
            AbstractC22676k.m65750j(service, "service");
            try {
                BleWhoopStrapService.BinderC10003a binderC10003a = (BleWhoopStrapService.BinderC10003a) service;
                BleConnectStrapActivity.this.log.mo85228t("serviceConnection onServiceConnected", new AbstractC30556a.a[0]);
                BleConnectStrapActivity bleConnectStrapActivity = BleConnectStrapActivity.this;
                bleConnectStrapActivity.serviceConnectionDisposable = binderC10003a.m24623c(bleConnectStrapActivity);
                if (BleConnectStrapActivity.this.serviceHasWhoopStrap) {
                    return;
                }
                C30496m c30496m = BleConnectStrapActivity.this.selectedBluetoothDevice;
                if (c30496m != null) {
                    binderC10003a.m24626h(c30496m.getBluetoothDevice());
                } else {
                    AbstractC22676k.m65757q("selectedBluetoothDevice");
                    throw null;
                }
            } catch (ClassCastException e5) {
                BleConnectStrapActivity.this.log.mo85230v("Failed to cast service binder: " + service + " to BleWhoopStrapServiceBinder", e5, new AbstractC30556a.a[0]);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            AbstractC22676k.m65750j(name, "name");
            BleConnectStrapActivity.this.log.mo85228t("serviceConnection onServiceDisconnected", new AbstractC30556a.a[0]);
            BleConnectStrapActivity.this.whoopStrap = null;
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity$f */
    @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity$showConnected$1", m100430f = "BleConnectStrapActivity.kt", m100431l = {480}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10525f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f31895w;

        public C10525f(InterfaceC30057d<? super C10525f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return BleConnectStrapActivity.this.new C10525f(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10525f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f31895w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C25575d c25575d = BleConnectStrapActivity.this.hapticsWrapper;
                this.f31895w = 1;
                if (c25575d.m75196f(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity$g */
    @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity$showConnected$2$1", m100430f = "BleConnectStrapActivity.kt", m100431l = {514}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10526g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f31897w;

        public C10526g(InterfaceC30057d<? super C10526g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final C23454a0 m27132h(BleConnectStrapActivity bleConnectStrapActivity) {
            bleConnectStrapActivity.setResult(-1);
            bleConnectStrapActivity.finish();
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return BleConnectStrapActivity.this.new C10526g(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10526g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f31897w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C10535e c10535eM27042E0 = BleConnectStrapActivity.this.m27042E0();
                this.f31897w = 1;
                obj = c10535eM27042E0.m27168I(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC10536f abstractC10536f = (AbstractC10536f) obj;
            if (AbstractC22676k.m65745e(abstractC10536f, AbstractC10536f.c.f31958a)) {
                BleConnectStrapActivity.this.m27050J0();
            } else if (AbstractC22676k.m65745e(abstractC10536f, AbstractC10536f.b.f31957a)) {
                if (BleConnectStrapActivity.this.m27039A0().isFeatureEnabled("membership-adjustment-android")) {
                    C10535e c10535eM27042E1 = BleConnectStrapActivity.this.m27042E0();
                    final BleConnectStrapActivity bleConnectStrapActivity = BleConnectStrapActivity.this;
                    c10535eM27042E1.m27167E(new InterfaceC4339a() { // from class: com.whoop.ui.drawer.strapsettings.connectstrap.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            return BleConnectStrapActivity.C10526g.m27132h(bleConnectStrapActivity);
                        }
                    });
                } else {
                    BleConnectStrapActivity.this.m27042E0().m27166D();
                    BleConnectStrapActivity.this.setResult(-1);
                    BleConnectStrapActivity.this.finish();
                }
            } else {
                if (!AbstractC22676k.m65745e(abstractC10536f, AbstractC10536f.a.f31956a)) {
                    throw new NoWhenBranchMatchedException();
                }
                BleConnectStrapActivity.this.m27042E0().m27169K();
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity$h */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10527h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31899w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31900x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31901y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10527h(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31899w = componentCallbacks;
            this.f31900x = interfaceC35951a;
            this.f31901y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f31899w;
            InterfaceC35951a interfaceC35951a = this.f31900x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31901y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity$i */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10528i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31902w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31903x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31904y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10528i(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31902w = componentCallbacks;
            this.f31903x = interfaceC35951a;
            this.f31904y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [fi0.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC14515a invoke() {
            ComponentCallbacks componentCallbacks = this.f31902w;
            InterfaceC35951a interfaceC35951a = this.f31903x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31904y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity$j */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10529j extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31905w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10529j(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f31905w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f31905w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity$k */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10530k extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31906w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31907x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31908y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f31909z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10530k(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f31906w = componentCallbacks;
            this.f31907x = interfaceC35951a;
            this.f31908y = interfaceC4339a;
            this.f31909z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, com.whoop.ui.drawer.strapsettings.connectstrap.e] */
        @Override // c93.InterfaceC4339a
        public final C10535e invoke() {
            return AbstractC34132o.m107857B(this.f31906w, this.f31907x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C10535e.class), this.f31908y, this.f31909z);
        }
    }

    public BleConnectStrapActivity() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i, new C10527h(this, null, null));
        this.analytics = AbstractC30060g.m92087G(enumC23463i, new C10528i(this, null, null));
        this.job = AbstractC3006f0.m8710d();
        C38266c c38266cM88492A = AbstractC29125c.m88492A(this);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        this.dispatcherFactory = (InterfaceC18732d) c38266cM88492A.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null);
        this.onboardingTracker = (C40196j) AbstractC29125c.m88492A(this).m122602a(null, c22673i0.getOrCreateKotlinClass(C40196j.class), null);
        this.crashReporter = (InterfaceC31766c) AbstractC29125c.m88492A(this).m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null);
        this.idleIndicator = (InterfaceC28172j0) AbstractC29125c.m88492A(this).m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC28172j0.class), null);
        this.whoopStrapSharedPrefs = (C30076h) AbstractC29125c.m88492A(this).m122602a(null, c22673i0.getOrCreateKotlinClass(C30076h.class), null);
        this.hapticsWrapper = (C25575d) AbstractC29125c.m88492A(this).m122602a(null, c22673i0.getOrCreateKotlinClass(C25575d.class), null);
        this.whoopStrapProvider = (InterfaceC4733b) AbstractC29125c.m88492A(this).m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4733b.class), null);
        this.strapUnlockEnabled = AbstractC30060g.m92088H(new C30491h(this, 0));
        this.newBleConnectStrapViewEvents = C24082e.m71000Y();
        this.serviceConnection = new ServiceConnectionC10524e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public final FeatureFlagChecker m27039A0() {
        return (FeatureFlagChecker) this.featureFlagChecker.getValue();
    }

    /* JADX INFO: renamed from: C0 */
    private final String m27040C0() {
        C30496m c30496m = this.selectedBluetoothDevice;
        if (c30496m == null) {
            return "";
        }
        if (c30496m != null) {
            return c30496m.getStrapGen();
        }
        AbstractC22676k.m65757q("selectedBluetoothDevice");
        throw null;
    }

    /* JADX INFO: renamed from: D0 */
    private final boolean m27041D0() {
        return ((Boolean) this.strapUnlockEnabled.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public final C10535e m27042E0() {
        return (C10535e) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: F0 */
    private final void m27043F0() {
        finish();
    }

    /* JADX INFO: renamed from: G0 */
    private final void m27044G0() {
        AbstractC18537c abstractC18537c = this.binding;
        if (abstractC18537c == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC18537c.f72234q.setTransitionName("whoopLogo");
        AbstractC18537c abstractC18537c2 = this.binding;
        if (abstractC18537c2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC18537c2.f72222e.getRoot().setTransitionName("backArrow");
        AbstractC18537c abstractC18537c3 = this.binding;
        if (abstractC18537c3 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        FrameLayout root = abstractC18537c3.f72222e.getRoot();
        AbstractC22676k.m65748h(root, "null cannot be cast to non-null type android.view.ViewGroup");
        root.setTransitionGroup(true);
        AbstractC18537c abstractC18537c4 = this.binding;
        if (abstractC18537c4 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC18537c4.f72227j.setTransitionGroup(true);
        AbstractC18537c abstractC18537c5 = this.binding;
        if (abstractC18537c5 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC18537c5.f72231n.setTransitionGroup(true);
        Slide slide = new Slide(8388613);
        AbstractC18537c abstractC18537c6 = this.binding;
        if (abstractC18537c6 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        slide.excludeTarget((View) abstractC18537c6.f72234q, true);
        AbstractC18537c abstractC18537c7 = this.binding;
        if (abstractC18537c7 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        slide.excludeTarget((View) abstractC18537c7.f72222e.getRoot(), true);
        slide.excludeTarget(R.id.navigationBarBackground, true);
        getWindow().setEnterTransition(slide);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public final Boolean m27046H0() {
        if (this.onboardingTracker.m129079d()) {
            return Boolean.TRUE;
        }
        return null;
    }

    /* JADX INFO: renamed from: I0 */
    private final void m27048I0(OnboardingInfo onboardingInfo, Map<String, String> eventMetadata) {
        if (onboardingInfo == null || eventMetadata == null) {
            return;
        }
        m49099s().m129071z0(eventMetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public final void m27050J0() {
        WhoopStrapInfo whoopStrapInfoMo24726f;
        WhoopStrapInfo whoopStrapInfoMo24726f2;
        InterfaceC21750d interfaceC21750d = this.whoopStrap;
        String serialNumber = (interfaceC21750d == null || (whoopStrapInfoMo24726f2 = interfaceC21750d.get_strapInfo()) == null) ? null : whoopStrapInfoMo24726f2.getSerialNumber();
        InterfaceC21750d interfaceC21750d2 = this.whoopStrap;
        String strapSignature = (interfaceC21750d2 == null || (whoopStrapInfoMo24726f = interfaceC21750d2.get_strapInfo()) == null) ? null : whoopStrapInfoMo24726f.getStrapSignature();
        MembershipAdjustmentFragment membershipAdjustmentFragment = new MembershipAdjustmentFragment();
        Bundle bundle = new Bundle();
        bundle.putString("strapSerial", serialNumber);
        bundle.putString("strapSignature", strapSignature);
        membershipAdjustmentFragment.setArguments(bundle);
        AbstractC1329o1 supportFragmentManager = getSupportFragmentManager();
        C1271a c1271aM94758g = AbstractC30802r.m94758g(supportFragmentManager, supportFragmentManager);
        c1271aM94758g.m4068e(AbstractC17307e.f66685Y, membershipAdjustmentFragment, null);
        c1271aM94758g.m4067c(null);
        c1271aM94758g.m4046j();
        getSupportFragmentManager().m4170g0("membership_adjustment_fragment_cancel_result", this, new C30493j(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final void m27052K0(BleConnectStrapActivity bleConnectStrapActivity, String str, Bundle bundle) {
        AbstractC22676k.m65750j(str, "<unused var>");
        AbstractC22676k.m65750j(bundle, "<unused var>");
        bleConnectStrapActivity.compositeSubscription.m75180d();
        bleConnectStrapActivity.compositeDisposable.m78296d();
        bleConnectStrapActivity.setResult(-1);
        bleConnectStrapActivity.finish();
    }

    /* JADX INFO: renamed from: L0 */
    private final void m27054L0() {
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C10522c(null), 3);
    }

    /* JADX INFO: renamed from: M0 */
    private final void m27056M0(InterfaceC21750d strap) {
        C26442a c26442a = this.compositeDisposable;
        AbstractC23417h abstractC23417hMo24753x = strap.mo24753x();
        C25680d c25680d = new C25680d(new C30492i(this, 0), 22);
        C25680d c25680d2 = new C25680d(new C30492i(this, 1), 23);
        abstractC23417hMo24753x.getClass();
        C33588a c33588a = new C33588a(c25680d, c25680d2);
        try {
            ((C36923i) abstractC23417hMo24753x).f157985a.m67905c(new C36922h(c33588a));
            c26442a.mo78293a(c33588a);
        } catch (NullPointerException e5) {
            throw e5;
        } catch (Throwable th3) {
            AbstractC3269g.m9495a0(th3);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th3);
            throw nullPointerException;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final C23454a0 m27058N0(BleConnectStrapActivity bleConnectStrapActivity, EnumC25628a enumC25628a) {
        bleConnectStrapActivity.m27125w0();
        bleConnectStrapActivity.m49099s().m129027b0(enumC25628a.toFailureMessage(), bleConnectStrapActivity.m27040C0(), bleConnectStrapActivity.m27046H0());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final void m27060O0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final C23454a0 m27062P0(BleConnectStrapActivity bleConnectStrapActivity, Throwable th3) {
        InterfaceC34116n interfaceC34116n = bleConnectStrapActivity.log;
        AbstractC22676k.m65747g(th3);
        interfaceC34116n.mo85230v("Something went wrong observing latest strap error", th3, new AbstractC30556a.a[0]);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final void m27064Q0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R0 */
    private final void m27066R0() {
        m27042E0().getViewStateLiveData().observe(this, new AbstractC10533c.a(new C30492i(this, 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final C23454a0 m27068S0(BleConnectStrapActivity bleConnectStrapActivity, AbstractC30500q abstractC30500q) {
        String serialNumber;
        WhoopStrapInfo whoopStrapInfoMo24726f;
        bleConnectStrapActivity.idleIndicator.mo85209b();
        if (abstractC30500q instanceof C30504u) {
            C30504u c30504u = (C30504u) abstractC30500q;
            OnboardingInfo onboardingInfoM93420b = c30504u.getOnboardingInfo();
            Map<String, String> mapM93419a = c30504u.m93419a();
            EnumC32978v enumC32978vM93421c = c30504u.getStrapGen();
            InterfaceC21750d interfaceC21750d = bleConnectStrapActivity.whoopStrap;
            if (interfaceC21750d == null || (whoopStrapInfoMo24726f = interfaceC21750d.get_strapInfo()) == null || (serialNumber = whoopStrapInfoMo24726f.getSerialNumber()) == null) {
                serialNumber = "";
            }
            bleConnectStrapActivity.m27105l1(onboardingInfoM93420b, mapM93419a, enumC32978vM93421c, serialNumber);
        } else if (abstractC30500q instanceof C30501r) {
            bleConnectStrapActivity.m27117r1();
        } else {
            if (!(abstractC30500q instanceof C30484a)) {
                throw new NoWhenBranchMatchedException();
            }
            bleConnectStrapActivity.m27101j1();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: T0 */
    private final void m27070T0(InterfaceC21750d strap) {
        C30071c c30071c = new C30071c();
        strap.mo104073M(c30071c);
        this.compositeSubscription.m75179c(c30071c.m92172c().m122652B(C40634a.m131874a()).m122661K(new C27566m0(new C30492i(this, 2), 13)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final C23454a0 m27072U0(BleConnectStrapActivity bleConnectStrapActivity, AbstractC32962f abstractC32962f) {
        bleConnectStrapActivity.m27092e1();
        if (AbstractC22676k.m65745e(abstractC32962f, C32970n.f137298a)) {
            bleConnectStrapActivity.m27082Z0();
        } else if (AbstractC22676k.m65745e(abstractC32962f, C32963g.f137291a)) {
            bleConnectStrapActivity.m27078X0();
        } else if (abstractC32962f instanceof C32965i) {
            bleConnectStrapActivity.m27076W0((C32965i) abstractC32962f);
        } else {
            bleConnectStrapActivity.m27109n1();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final void m27074V0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public final void m27076W0(C32965i error) {
        this.log.mo85222m(AbstractC11266d.m30461o("Received connection error: ", error.getMessage()), new AbstractC30556a.a[0]);
        if (error.getCode() == 67) {
            m27111o1();
            return;
        }
        m27125w0();
        this.log.mo85226q(AbstractC2875y.m8295h(error.getCode(), "Failing due to error "), new AbstractC30556a.a[0]);
        m27080Y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public final void m27078X0() {
        m27125w0();
        m27080Y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public final void m27080Y0() {
        this.log.mo85216g("onFailure", new AbstractC30556a.a[0]);
        if (this.movingToDialog) {
            return;
        }
        this.movingToDialog = true;
        this.log.mo85216g("Moving to Connection Failed Dialog", new AbstractC30556a.a[0]);
        this.compositeSubscription.m75180d();
        this.compositeDisposable.m78296d();
        setResult(101);
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z0 */
    private final void m27082Z0() {
        this.idleIndicator.mo85208a();
        C24082e c24082e = this.newBleConnectStrapViewEvents;
        InterfaceC21750d interfaceC21750d = this.whoopStrap;
        Throwable th3 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        WhoopStrapInfo whoopStrapInfoMo24726f = interfaceC21750d != null ? interfaceC21750d.get_strapInfo() : null;
        InterfaceC21750d interfaceC21750d2 = this.whoopStrap;
        c24082e.onNext(new C30503t(whoopStrapInfoMo24726f, interfaceC21750d2 != null ? interfaceC21750d2.mo24752w0() : null));
        InterfaceC21750d interfaceC21750d3 = this.whoopStrap;
        int iMo104072C = interfaceC21750d3 != null ? interfaceC21750d3.mo104072C() : 0;
        int i13 = 2;
        if (iMo104072C == 0) {
            InterfaceC31766c.m98634e(this.crashReporter, new ConnectivityException("No MTU Negotiated!", th3, i13, objArr5 == true ? 1 : 0), null, 2, null);
        } else if (iMo104072C < 180) {
            InterfaceC31766c.m98634e(this.crashReporter, new ConnectivityException("Negotiated MTU < 180!", objArr4 == true ? 1 : 0, i13, objArr3 == true ? 1 : 0), null, 2, null);
        } else if (iMo104072C < 247) {
            InterfaceC31766c.m98634e(this.crashReporter, new ConnectivityException("Negotiated MTU < 247", objArr2 == true ? 1 : 0, i13, objArr == true ? 1 : 0), null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final void m27084a1(BleConnectStrapActivity bleConnectStrapActivity) {
        bleConnectStrapActivity.m27109n1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final void m27086b1(BleConnectStrapActivity bleConnectStrapActivity, InterfaceC21750d interfaceC21750d, InterfaceC21750d interfaceC21750d2) {
        bleConnectStrapActivity.newBleConnectStrapViewEvents.onNext(new C30503t(interfaceC21750d.get_strapInfo(), interfaceC21750d2.mo24752w0()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public final void m27088c1(InterfaceC21750d strap) {
        C30496m c30496m = this.selectedBluetoothDevice;
        if (c30496m == null) {
            AbstractC22676k.m65757q("selectedBluetoothDevice");
            throw null;
        }
        if (!AbstractC22676k.m65745e(c30496m.getAddress(), strap.getAddress())) {
            this.log.mo85222m("Whoop strap received is different than what the user wants to connect!", new AbstractC30556a.a[0]);
            return;
        }
        InterfaceC21750d interfaceC21750d = this.whoopStrap;
        if (AbstractC22676k.m65745e(interfaceC21750d != null ? interfaceC21750d.getAddress() : null, strap.getAddress())) {
            return;
        }
        this.serviceHasWhoopStrap = true;
        this.whoopStrap = strap;
        m27056M0(strap);
        runOnUiThread(new RunnableC20151r0(28, this, strap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final void m27090d1(BleConnectStrapActivity bleConnectStrapActivity, InterfaceC21750d interfaceC21750d) {
        bleConnectStrapActivity.newBleConnectStrapViewEvents.onNext(new C30503t(interfaceC21750d.get_strapInfo(), interfaceC21750d.mo24752w0()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public final void m27092e1() {
        InterfaceC3027k1 interfaceC3027k1 = this.timeoutJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        this.timeoutJob = AbstractC3006f0.m8732z(this, this.dispatcherFactory.getDefault(), null, new C10523d(null), 2);
    }

    /* JADX INFO: renamed from: g1 */
    private final void m27095g1() {
        BleWhoopStrapService.INSTANCE.m24627a(this, this.serviceConnection, this.whoopStrapSharedPrefs.m92195a());
        m27121t1();
        AbstractC18537c abstractC18537c = this.binding;
        if (abstractC18537c == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC18537c.f72222e.getRoot().setOnClickListener(new ViewOnClickListenerC21821j(this, 12));
        C10535e c10535eM27042E0 = m27042E0();
        boolean z4 = !m27128B0().m93411y();
        C38280g<AbstractC30495l> c38280gM122655E = this.newBleConnectStrapViewEvents.m122655E();
        AbstractC22676k.m65749i(c38280gM122655E, "onBackpressureBuffer(...)");
        c10535eM27042E0.m27165A(z4, c38280gM122655E);
        m27044G0();
        m27109n1();
        m27066R0();
        if (m27041D0()) {
            m27054L0();
        }
        m27099i1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public static final void m27097h1(BleConnectStrapActivity bleConnectStrapActivity, View view) {
        bleConnectStrapActivity.setResult(0);
        bleConnectStrapActivity.supportFinishAfterTransition();
    }

    /* JADX INFO: renamed from: i1 */
    private final void m27099i1() {
        AbstractC18537c abstractC18537c = this.binding;
        if (abstractC18537c != null) {
            abstractC18537c.f72220c.setImageDrawable(AbstractC32122c.getDrawable(this, AbstractC17306d.f66538i));
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    /* JADX INFO: renamed from: j1 */
    private final void m27101j1() {
        AbstractC18537c abstractC18537c = this.binding;
        if (abstractC18537c == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC18537c.f72232o.setVisibility(0);
        AbstractC18537c abstractC18537c2 = this.binding;
        if (abstractC18537c2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC18537c2.f72232o.setErrorState(EnumC30499p.ACCOUNT_ERROR);
        AbstractC18537c abstractC18537c3 = this.binding;
        if (abstractC18537c3 != null) {
            abstractC18537c3.f72232o.setRetryClickListener(new C30491h(this, 1));
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public static final C23454a0 m27103k1(BleConnectStrapActivity bleConnectStrapActivity) {
        AbstractC18537c abstractC18537c = bleConnectStrapActivity.binding;
        if (abstractC18537c == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC18537c.f72232o.setVisibility(8);
        if (bleConnectStrapActivity.whoopStrap != null) {
            bleConnectStrapActivity.m27126x0();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l1 */
    private final void m27105l1(OnboardingInfo onboardingInfo, Map<String, String> eventMetadata, EnumC32978v strapGen, String serialNumber) {
        String strM104089b = strapGen != null ? EnumC32978v.INSTANCE.m104089b(strapGen) : null;
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C10525f(null), 3);
        m49099s().m129029c0(strM104089b, m27046H0(), serialNumber);
        m27048I0(onboardingInfo, eventMetadata);
        if (this.onboardingTracker.m129079d()) {
            m49099s().m129022Y(strM104089b, Boolean.TRUE, serialNumber);
        }
        m27125w0();
        setResult(-1);
        if (onboardingInfo == null || onboardingInfo.getNumScooterTrialMonths() <= 0 || m27039A0().isFeatureEnabled(OnboardingFeatureFlag.HIDE_SCOOTER_TRIAL_TEXT_OVERRIDE)) {
            AbstractC18537c abstractC18537c = this.binding;
            if (abstractC18537c == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            TextView textView = abstractC18537c.f72228k;
            int i13 = AbstractC17312j.f66990i;
            C30496m c30496m = this.selectedBluetoothDevice;
            if (c30496m == null) {
                AbstractC22676k.m65757q("selectedBluetoothDevice");
                throw null;
            }
            textView.setText(getString(i13, c30496m.getName()));
            AbstractC18537c abstractC18537c2 = this.binding;
            if (abstractC18537c2 == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            abstractC18537c2.f72226i.setText(AbstractC17312j.f66987h);
        } else {
            AbstractC18537c abstractC18537c3 = this.binding;
            if (abstractC18537c3 == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            abstractC18537c3.f72228k.setText(getResources().getQuantityString(AbstractC17310h.f66903a, onboardingInfo.getNumScooterTrialMonths(), Integer.valueOf(onboardingInfo.getNumScooterTrialMonths())));
            AbstractC18537c abstractC18537c4 = this.binding;
            if (abstractC18537c4 == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            abstractC18537c4.f72226i.setText(getString(AbstractC17312j.f66939M0));
            AbstractC18537c abstractC18537c5 = this.binding;
            if (abstractC18537c5 == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            abstractC18537c5.f72223f.setText(getString(AbstractC17312j.f66937L0));
        }
        AbstractC18537c abstractC18537c6 = this.binding;
        if (abstractC18537c6 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC18537c6.f72223f.setVisibility(0);
        AbstractC18537c abstractC18537c7 = this.binding;
        if (abstractC18537c7 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC18537c7.f72223f.setOnClickListener(new ViewOnClickListenerC2292a(9, onboardingInfo, this));
        AbstractC18537c abstractC18537c8 = this.binding;
        if (abstractC18537c8 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC18537c8.f72231n.setDisplayedChild(this.indexConnected);
        m49099s().m128980B0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public static final void m27107m1(OnboardingInfo onboardingInfo, BleConnectStrapActivity bleConnectStrapActivity, View view) {
        if (onboardingInfo != null) {
            bleConnectStrapActivity.m27043F0();
        } else {
            AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(bleConnectStrapActivity), null, null, bleConnectStrapActivity.new C10526g(null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public final void m27109n1() {
        C30496m c30496m = this.selectedBluetoothDevice;
        if (c30496m == null) {
            AbstractC22676k.m65757q("selectedBluetoothDevice");
            throw null;
        }
        if (AbstractC22676k.m65745e(c30496m.getName(), getApplicationContext().getString(AbstractC17312j.f67010o1))) {
            InterfaceC14515a.m41418i(m27127y0(), "Connectivity", "Pairing", null, "Null Bluetooth Device name", null, null, 52, null);
        }
        setResult(0);
        AbstractC18537c abstractC18537c = this.binding;
        if (abstractC18537c == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC18537c.f72228k.setText(AbstractC17312j.f66996k);
        AbstractC18537c abstractC18537c2 = this.binding;
        if (abstractC18537c2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        TextView textView = abstractC18537c2.f72226i;
        int i13 = AbstractC17312j.f66993j;
        C30496m c30496m2 = this.selectedBluetoothDevice;
        if (c30496m2 == null) {
            AbstractC22676k.m65757q("selectedBluetoothDevice");
            throw null;
        }
        textView.setText(getString(i13, c30496m2.getName()));
        AbstractC18537c abstractC18537c3 = this.binding;
        if (abstractC18537c3 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC18537c3.f72223f.setVisibility(4);
        AbstractC18537c abstractC18537c4 = this.binding;
        if (abstractC18537c4 != null) {
            abstractC18537c4.f72231n.setDisplayedChild(this.indexConnecting);
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    /* JADX INFO: renamed from: o1 */
    private final void m27111o1() {
        this.log.mo85216g("Showing invalid strap dialog", new AbstractC30556a.a[0]);
        C24844i c24844i = new C24844i(this);
        c24844i.m72849b(AbstractC17312j.f67026u);
        c24844i.m72848a(AbstractC17312j.f67023t);
        c24844i.f97324a.f97268m = false;
        final int i13 = 0;
        final int i14 = 1;
        c24844i.setPositiveButton(AbstractC17312j.f67037z, new DialogInterface.OnClickListener(this) { // from class: qm2.k

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ BleConnectStrapActivity f125327x;

            {
                this.f125327x = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i15) {
                switch (i13) {
                    case 0:
                        BleConnectStrapActivity.m27113p1(this.f125327x, dialogInterface, i15);
                        break;
                    default:
                        BleConnectStrapActivity.m27115q1(this.f125327x, dialogInterface, i15);
                        break;
                }
            }
        }).setNegativeButton(AbstractC17312j.f67035y, new DialogInterface.OnClickListener(this) { // from class: qm2.k

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ BleConnectStrapActivity f125327x;

            {
                this.f125327x = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i15) {
                switch (i14) {
                    case 0:
                        BleConnectStrapActivity.m27113p1(this.f125327x, dialogInterface, i15);
                        break;
                    default:
                        BleConnectStrapActivity.m27115q1(this.f125327x, dialogInterface, i15);
                        break;
                }
            }
        }).m72850c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public static final void m27113p1(BleConnectStrapActivity bleConnectStrapActivity, DialogInterface dialogInterface, int i13) {
        ((C35199a) AbstractC29125c.m88492A(bleConnectStrapActivity).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35199a.class), null)).m111535n(bleConnectStrapActivity);
        bleConnectStrapActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public static final void m27115q1(BleConnectStrapActivity bleConnectStrapActivity, DialogInterface dialogInterface, int i13) {
        if (!bleConnectStrapActivity.m27128B0().m93411y()) {
            Intent intent = new Intent(bleConnectStrapActivity, (Class<?>) MainActivity.class);
            intent.setFlags(603979776);
            intent.setData(Uri.parse("https://whoop.com/LOG_IN"));
            bleConnectStrapActivity.startActivity(intent);
        }
        bleConnectStrapActivity.finish();
    }

    /* JADX INFO: renamed from: r1 */
    private final void m27117r1() {
        AbstractC18537c abstractC18537c = this.binding;
        if (abstractC18537c == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC18537c.f72232o.setVisibility(0);
        AbstractC18537c abstractC18537c2 = this.binding;
        if (abstractC18537c2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC18537c2.f72232o.setErrorState(EnumC30499p.NO_NETWORK);
        AbstractC18537c abstractC18537c3 = this.binding;
        if (abstractC18537c3 != null) {
            abstractC18537c3.f72232o.setRetryClickListener(new C30491h(this, 2));
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public static final C23454a0 m27119s1(BleConnectStrapActivity bleConnectStrapActivity) {
        AbstractC18537c abstractC18537c = bleConnectStrapActivity.binding;
        if (abstractC18537c == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC18537c.f72232o.setVisibility(8);
        if (bleConnectStrapActivity.whoopStrap != null) {
            bleConnectStrapActivity.m27126x0();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t1 */
    private final void m27121t1() {
        AbstractC18537c abstractC18537c = this.binding;
        if (abstractC18537c != null) {
            abstractC18537c.f72233p.setVisibility(8);
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    /* JADX INFO: renamed from: u0 */
    private final void m27122u0() {
        C25680d c25680d = new C25680d(this, 24);
        AbstractC18537c abstractC18537c = this.binding;
        if (abstractC18537c == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        View root = abstractC18537c.getRoot();
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16877h0.m47517l(root, c25680d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public static final boolean m27123u1(BleConnectStrapActivity bleConnectStrapActivity) {
        return AbstractC32977u.m104087a(bleConnectStrapActivity.m27039A0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final C16905q1 m27124v0(BleConnectStrapActivity bleConnectStrapActivity, View view, C16905q1 windowInsets) {
        AbstractC22676k.m65750j(view, "<unused var>");
        AbstractC22676k.m65750j(windowInsets, "windowInsets");
        C35643b c35643bMo47530g = windowInsets.f64864a.mo47530g(7);
        AbstractC22676k.m65749i(c35643bMo47530g, "getInsets(...)");
        AbstractC18537c abstractC18537c = bleConnectStrapActivity.binding;
        if (abstractC18537c == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        LinearLayout connectStrapContainer = abstractC18537c.f72224g;
        AbstractC22676k.m65749i(connectStrapContainer, "connectStrapContainer");
        ViewGroup.LayoutParams layoutParams = connectStrapContainer.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = c35643bMo47530g.f151450b;
        marginLayoutParams.bottomMargin = c35643bMo47530g.f151452d;
        connectStrapContainer.setLayoutParams(marginLayoutParams);
        return C16905q1.f64863b;
    }

    /* JADX INFO: renamed from: w0 */
    private final void m27125w0() {
        InterfaceC3027k1 interfaceC3027k1 = this.timeoutJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
    }

    /* JADX INFO: renamed from: x0 */
    private final void m27126x0() {
        String serialNumber;
        String strapSignature;
        InterfaceC21750d interfaceC21750d = this.whoopStrap;
        if (interfaceC21750d != null) {
            WhoopStrapInfo whoopStrapInfoMo24726f = interfaceC21750d.get_strapInfo();
            this.idleIndicator.mo85208a();
            C10535e c10535eM27042E0 = m27042E0();
            String str = "";
            if (whoopStrapInfoMo24726f == null || (serialNumber = whoopStrapInfoMo24726f.getSerialNumber()) == null) {
                serialNumber = "";
            }
            if (whoopStrapInfoMo24726f != null && (strapSignature = whoopStrapInfoMo24726f.getStrapSignature()) != null) {
                str = strapSignature;
            }
            c10535eM27042E0.m27170y(serialNumber, str, interfaceC21750d.mo24752w0());
        }
    }

    /* JADX INFO: renamed from: y0 */
    private final InterfaceC14515a m27127y0() {
        return (InterfaceC14515a) this.analytics.getValue();
    }

    /* JADX INFO: renamed from: B0 */
    public final C30498o m27128B0() {
        C30498o c30498o = this.intentBuilder;
        if (c30498o != null) {
            return c30498o;
        }
        AbstractC22676k.m65757q("intentBuilder");
        throw null;
    }

    @Override // com.whoop.service.rearchitect.BleWhoopStrapService.InterfaceC10005c
    /* JADX INFO: renamed from: C */
    public void mo13710C(InterfaceC21750d whoopStrap) {
        AbstractC22676k.m65750j(whoopStrap, "whoopStrap");
        if (m27041D0()) {
            return;
        }
        this.log.mo85216g("onServiceReady", new AbstractC30556a.a[0]);
        C30496m c30496m = this.selectedBluetoothDevice;
        if (c30496m == null) {
            AbstractC22676k.m65757q("selectedBluetoothDevice");
            throw null;
        }
        if (!AbstractC22676k.m65745e(c30496m.getAddress(), whoopStrap.getAddress())) {
            this.log.mo85222m("Whoop strap received from service class is different than what the user wants to connect!", new AbstractC30556a.a[0]);
            return;
        }
        this.serviceHasWhoopStrap = true;
        this.whoopStrap = whoopStrap;
        if (AbstractC22676k.m65745e(whoopStrap.getConnectionState(), C32970n.f137298a)) {
            this.log.mo85228t("Showing CONNECTED on screen because current connection state: " + whoopStrap.getConnectionState(), new AbstractC30556a.a[0]);
            runOnUiThread(new RunnableC1283d(this, whoopStrap, whoopStrap, 19));
        } else {
            runOnUiThread(new RunnableC24693e(this, 12));
            this.log.mo85216g(AbstractC25012a.m73374g(System.identityHashCode(whoopStrap), "Sending connect command to ", whoopStrap.getName(), " "), new AbstractC30556a.a[0]);
            whoopStrap.mo104074O();
        }
        m27070T0(whoopStrap);
        m27056M0(whoopStrap);
    }

    /* JADX INFO: renamed from: f1 */
    public final void m27129f1(C30498o c30498o) {
        AbstractC22676k.m65750j(c30498o, "<set-?>");
        this.intentBuilder = c30498o;
    }

    @Override // bc3.InterfaceC2994c0
    public InterfaceC30063j getCoroutineContext() {
        return this.dispatcherFactory.mo54464a().plus(this.job);
    }

    @Override // hj0.AbstractActivityC17360s, hj0.AbstractActivityC17361t, hj0.AbstractActivityC17347f, androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        C14899c0 c14899c0 = C14899c0.f55571y;
        AbstractC14911n.m43003a(this, new C14901d0(0, 0, 2, c14899c0), new C14901d0(0, 0, 2, c14899c0));
        this.log.mo85228t("onCreate", new AbstractC30556a.a[0]);
        super.onCreate(savedInstanceState);
        m27129f1(new C30498o(this, getIntent()));
        AbstractC18537c abstractC18537cM53755c = AbstractC18537c.m53755c(getLayoutInflater());
        AbstractC22676k.m65749i(abstractC18537cM53755c, "inflate(...)");
        this.binding = abstractC18537cM53755c;
        setContentView(abstractC18537cM53755c.getRoot());
        try {
            C26669a c26669aM110120B = AbstractC34924m.m110120B(this);
            c26669aM110120B.getClass();
            C38266c c38266c = (C38266c) c26669aM110120B.f106046a.f159363c.get("connectStrapScopeId");
            if (c38266c == null) {
                throw new ScopeNotCreatedException("No scope found for id 'connectStrapScopeId'");
            }
            C35953c c35953c = new C35953c("bleStrap");
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            Object obj = ((AtomicReference) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AtomicReference.class), c35953c)).get();
            AbstractC22676k.m65749i(obj, "get(...)");
            this.selectedBluetoothDevice = (C30496m) obj;
            m27095g1();
            ((InterfaceC21153l0) AbstractC29125c.m88492A(this).m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21153l0.class), null)).mo59004J("BleConnectStrapActivity");
            m27122u0();
        } catch (ScopeNotCreatedException unused) {
            this.log.mo85226q("Scope connectStrapScopeId does not exist; redirecting to Home activity", new AbstractC30556a.a[0]);
            Intent intent = new Intent(this, (Class<?>) MainActivity.class);
            intent.addFlags(67108864);
            startActivity(intent);
            finish();
        }
    }

    @Override // hj0.AbstractActivityC17347f, p314m.AbstractActivityC24852m, androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.log.mo85228t("onDestroy", new AbstractC30556a.a[0]);
        AbstractC18537c abstractC18537c = this.binding;
        if (abstractC18537c == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC18537c.f72229l.m27401f();
        this.serviceConnectionDisposable.dispose();
    }

    @Override // p314m.AbstractActivityC24852m, androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onStart() {
        super.onStart();
        this.log.mo85228t("onStart", new AbstractC30556a.a[0]);
        m27092e1();
    }

    @Override // p314m.AbstractActivityC24852m, androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onStop() {
        super.onStop();
        this.log.mo85228t("onStop", new AbstractC30556a.a[0]);
        m27125w0();
        this.compositeSubscription.m75180d();
        this.compositeDisposable.m78296d();
    }

    @Override // hj0.AbstractActivityC17347f
    /* JADX INFO: renamed from: p */
    public String mo19335p() {
        return "Pairing";
    }

    @Override // com.whoop.service.rearchitect.BleWhoopStrapService.InterfaceC10005c
    /* JADX INFO: renamed from: q */
    public void mo13718q() {
        if (m27041D0()) {
            return;
        }
        this.serviceHasWhoopStrap = false;
        this.whoopStrap = null;
    }
}
