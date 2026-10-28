package com.whoop.p069ui.drawer.strapsettings.connectstrap;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.companion.CompanionDeviceManager;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.activity.result.contract.ActivityResultContracts$StartIntentSenderForResult;
import androidx.compose.runtime.Composer;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.recyclerview.widget.LinearLayoutManager;
import aq0.C1904o;
import as2.AbstractC1953c;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c92.AbstractC4337i;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.AnalyticsUserRepository;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.LanguageRepository;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.data.repositories.TroubleConnectingSupportArticleUrl;
import com.whoop.domain.exception.CompanionDevicePairingException;
import com.whoop.p069ui.home.redesign.view.MainActivity;
import com.whoop.p069ui.pills.StrokedPillButton;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge3.AbstractC15751g;
import hi0.AbstractC17312j;
import hj0.AbstractActivityC17360s;
import ii0.AbstractC18533a;
import ii0.AbstractC18538c0;
import in2.AbstractC18737i;
import j02.AbstractC21130a1;
import j02.InterfaceC21153l0;
import j93.InterfaceC21461d;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import jf3.C21647a;
import js0.AbstractC21909c;
import js0.C21908b;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m32.EnumC25009e;
import m32.InterfaceC25007c;
import m83.AbstractC25265s;
import mh3.AbstractC25568e;
import mm.C25680d;
import mx.AbstractC25990c;
import nf1.AbstractC26660a;
import nf3.C26669a;
import o52.C27566m0;
import or2.AbstractC28189p;
import or2.C28216y;
import or2.C28217y0;
import org.koin.core.error.ScopeAlreadyCreatedException;
import p031b9.AbstractC2875y;
import p108e4.AbstractC12667a;
import p114eb.AbstractC12939a0;
import p114eb.C12991u0;
import p161g.AbstractC14911n;
import p179h.AbstractC16348f;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16880i0;
import p184h5.AbstractC16901p0;
import p184h5.C16905q1;
import p236j.AbstractC21065d;
import p236j.C21062a;
import p236j.C21073l;
import p320m5.C25067k;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p399pb.InterfaceC29049f;
import p426qi.EnumC30384g0;
import p505ts.AbstractC34132o;
import p543v4.C35643b;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22673i0;
import p726ps0.Function0;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qm2.C30485b;
import qm2.C30486c;
import qm2.C30487d;
import qm2.C30488e;
import qm2.C30489f;
import qm2.C30490g;
import qm2.C30496m;
import qm2.C30498o;
import qm2.C30502s;
import qm2.EnumC30497n;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rm2.AbstractC31605e;
import rm2.EnumC31606f;
import rr2.InterfaceC31766c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u00.C34377e;
import uf3.C34911a;
import ug.AbstractC34924m;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import wf3.C37247a;
import x81.AbstractC38073e;
import xf3.C38266c;
import xg3.C38280g;
import xg3.InterfaceC38293t;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005*\u0002¢\u0001\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0015¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\u0003J\u001d\u0010%\u001a\u00020\u0006*\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u000fH\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0006H\u0002¢\u0006\u0004\b-\u0010\u0003J\u000f\u0010.\u001a\u00020\u0006H\u0002¢\u0006\u0004\b.\u0010\u0003J\u0017\u00100\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0012H\u0002¢\u0006\u0004\b0\u0010 J\u000f\u00101\u001a\u00020\u0006H\u0002¢\u0006\u0004\b1\u0010\u0003J\u000f\u00102\u001a\u00020\u0006H\u0002¢\u0006\u0004\b2\u0010\u0003J\u000f\u00103\u001a\u00020\u0006H\u0002¢\u0006\u0004\b3\u0010\u0003J\u000f\u00104\u001a\u00020\u0006H\u0002¢\u0006\u0004\b4\u0010\u0003J\u000f\u00105\u001a\u00020\u0006H\u0002¢\u0006\u0004\b5\u0010\u0003J\u0017\u00108\u001a\u00020\u00062\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0006H\u0002¢\u0006\u0004\b:\u0010\u0003J\u000f\u0010;\u001a\u00020\u0006H\u0002¢\u0006\u0004\b;\u0010\u0003J\u000f\u0010<\u001a\u00020\u0006H\u0002¢\u0006\u0004\b<\u0010\u0003J\u000f\u0010=\u001a\u00020\u0006H\u0002¢\u0006\u0004\b=\u0010\u0003J\u000f\u0010>\u001a\u00020\u0006H\u0002¢\u0006\u0004\b>\u0010\u0003J\u0017\u0010A\u001a\u00020\u00062\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u000fH\u0002¢\u0006\u0004\bC\u0010)J!\u0010F\u001a\u00020\u00062\u0006\u0010D\u001a\u00020\u000f2\b\u0010E\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0006H\u0002¢\u0006\u0004\bH\u0010\u0003J\u000f\u0010I\u001a\u00020\u0006H\u0002¢\u0006\u0004\bI\u0010\u0003J\u000f\u0010J\u001a\u00020\u0006H\u0002¢\u0006\u0004\bJ\u0010\u0003R\u0016\u0010N\u001a\u00020K8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR\u001c\u0010[\u001a\b\u0012\u0004\u0012\u00020X0W8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010_\u001a\u00020\\8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b]\u0010^R\u001e\u0010d\u001a\n a*\u0004\u0018\u00010`0`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u001b\u0010j\u001a\u00020e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u001b\u0010o\u001a\u00020k8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010g\u001a\u0004\bm\u0010nR\u001b\u0010t\u001a\u00020p8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010g\u001a\u0004\br\u0010sR\u0016\u0010x\u001a\u00020u8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bv\u0010wR\u001b\u0010}\u001a\u00020y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010g\u001a\u0004\b{\u0010|R\u0018\u0010\u0081\u0001\u001a\u00020~8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R \u0010\u0086\u0001\u001a\u00030\u0082\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0083\u0001\u0010g\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R \u0010\u008b\u0001\u001a\u00030\u0087\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0088\u0001\u0010g\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R \u0010\u0090\u0001\u001a\u00030\u008c\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008d\u0001\u0010g\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R \u0010\u0095\u0001\u001a\u00030\u0091\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0092\u0001\u0010g\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u001e\u0010\u0098\u0001\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010g\u001a\u0005\b\u0097\u0001\u0010,R\u0019\u0010\u009a\u0001\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u0099\u0001R\u0018\u0010\u009c\u0001\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009b\u0001\u0010LR\u001f\u0010¡\u0001\u001a\n\u0012\u0005\u0012\u00030\u009e\u00010\u009d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0018\u0010¥\u0001\u001a\u00030¢\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001¨\u0006¦\u0001"}, m65681d2 = {"Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;", "Lhj0/s;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "onStop", "onDestroy", "finish", "t0", "u0", "", "p", "()Ljava/lang/String;", "", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "J0", "(I)V", "q0", "Landroid/view/View;", "Lh5/q1;", "insets", "s0", "(Landroid/view/View;Lh5/q1;)V", "address", "x1", "(Ljava/lang/String;)V", "", "O0", "()Z", "M0", "r1", "resourceId", "Q0", "S0", "m1", "g1", "h1", "i1", "Lqm2/g;", "viewState", "L0", "(Lqm2/g;)V", "w1", "K0", "y1", "f1", "R0", "Landroid/bluetooth/BluetoothDevice;", "device", "y0", "(Landroid/bluetooth/BluetoothDevice;)V", "A0", "strapGeneration", "name", "w0", "(Ljava/lang/String;Ljava/lang/String;)V", "e1", "d1", "c1", "Lcom/whoop/ui/drawer/strapsettings/connectstrap/d;", "I", "Lcom/whoop/ui/drawer/strapsettings/connectstrap/d;", "deviceAdapter", "Ltr2/n;", "J", "Ltr2/n;", "logger", "Lxf3/c;", "K", "Lxf3/c;", "pairingScope", "Ljava/util/concurrent/atomic/AtomicReference;", "Lqm2/m;", "L", "Ljava/util/concurrent/atomic/AtomicReference;", "clickedDevice", "Leb/u0;", "M", "Leb/u0;", "navigationHost", "Lxg3/t;", "kotlin.jvm.PlatformType", "N", "Lxg3/t;", "scannedDeviceNamesLogging", "Lqm2/f;", "O", "Ll83/h;", "I0", "()Lqm2/f;", "viewModel", "Lcom/whoop/data/repositories/AnalyticsUserRepository;", "P", "B0", "()Lcom/whoop/data/repositories/AnalyticsUserRepository;", "analyticsUserRepository", "Lcom/whoop/data/repositories/LanguageRepository;", "Q", "H0", "()Lcom/whoop/data/repositories/LanguageRepository;", "languageRepository", "Lqm2/o;", "R", "Lqm2/o;", "intentBuilder", "Lrr2/c;", "S", "E0", "()Lrr2/c;", "crashReporter", "Lii0/a;", "T", "Lii0/a;", "chooseBleDeviceBinding", "Lm32/c;", "U", "C0", "()Lm32/c;", "bluetoothPermissionHelper", "Ljs0/c;", "V", "D0", "()Ljs0/c;", "configurationRepository", "Lor2/y;", "W", "F0", "()Lor2/y;", "externalLinkNavigator", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "X", "G0", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Y", "P0", "isTest", "Z", "companionDevicePairingTimedOut", "a0", "currentStrapAnimation", "Lj/d;", "Lj/l;", "b0", "Lj/d;", "connectStrapActivityResultHandler", "com/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity$b", "c0", "Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity$b;", "receiver", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class BleChooseStrapActivity extends AbstractActivityC17360s {

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private C10534d deviceAdapter;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private C38266c pairingScope;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private AtomicReference<C30496m> clickedDevice;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private C12991u0 navigationHost;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsUserRepository;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final InterfaceC23462h languageRepository;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private C30498o intentBuilder;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private final InterfaceC23462h crashReporter;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private AbstractC18533a chooseBleDeviceBinding;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final InterfaceC23462h bluetoothPermissionHelper;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private final InterfaceC23462h configurationRepository;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private final InterfaceC23462h externalLinkNavigator;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private final InterfaceC23462h isTest;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private volatile boolean companionDevicePairingTimedOut;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    private int currentStrapAnimation;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    private final AbstractC21065d connectStrapActivityResultHandler;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    private final C10507b receiver;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC34116n logger = InterfaceC34116n.INSTANCE.m107848a("BleChooseStrapActivity");

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private InterfaceC38293t scannedDeviceNamesLogging = AbstractC25568e.f100262a;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10518m(this, null, new C10517l(this), null));

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.BleChooseStrapActivity$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m65681d2 = {"com/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "core-ktx_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class ViewOnAttachStateChangeListenerC10506a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ View f31803w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ BleChooseStrapActivity f31804x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ View f31805y;

        public ViewOnAttachStateChangeListenerC10506a(View view, BleChooseStrapActivity bleChooseStrapActivity, View view2) {
            this.f31803w = view;
            this.f31804x = bleChooseStrapActivity;
            this.f31805y = view2;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f31803w.removeOnAttachStateChangeListener(this);
            BleChooseStrapActivity bleChooseStrapActivity = this.f31804x;
            View view2 = this.f31805y;
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            bleChooseStrapActivity.m27023s0(view2, AbstractC16880i0.m47522a(view2));
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.BleChooseStrapActivity$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"com/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity$b", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Ll83/a0;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10507b extends BroadcastReceiver {
        public C10507b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(intent, "intent");
            String action = intent.getAction();
            if (action != null) {
                BleChooseStrapActivity.this.m26953I0().m93372R(action);
            } else {
                BleChooseStrapActivity.this.logger.mo85222m("intent or intent.getAction is null", new AbstractC30556a.a[0]);
            }
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.BleChooseStrapActivity$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ui.drawer.strapsettings.connectstrap.BleChooseStrapActivity$requestBluetoothPermissions$1", m100430f = "BleChooseStrapActivity.kt", m100431l = {388}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10508c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f31807w;

        /* JADX INFO: renamed from: x */
        int f31808x;

        public C10508c(InterfaceC30057d<? super C10508c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return BleChooseStrapActivity.this.new C10508c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10508c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C30489f c30489f;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f31808x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C30489f c30489fM26953I0 = BleChooseStrapActivity.this.m26953I0();
                InterfaceC25007c interfaceC25007cM26945C0 = BleChooseStrapActivity.this.m26945C0();
                this.f31807w = c30489fM26953I0;
                this.f31808x = 1;
                Object objM73347s = InterfaceC25007c.m73347s(interfaceC25007cM26945C0, false, this, 1, null);
                if (objM73347s == enumC31071a) {
                    return enumC31071a;
                }
                c30489f = c30489fM26953I0;
                obj = objM73347s;
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c30489f = (C30489f) this.f31807w;
                AbstractC34132o.m107864I(obj);
            }
            c30489f.m93375W((EnumC25009e) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.BleChooseStrapActivity$d */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10509d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31810w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31811x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31812y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10509d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31810w = componentCallbacks;
            this.f31811x = interfaceC35951a;
            this.f31812y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.AnalyticsUserRepository, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final AnalyticsUserRepository invoke() {
            ComponentCallbacks componentCallbacks = this.f31810w;
            InterfaceC35951a interfaceC35951a = this.f31811x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31812y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AnalyticsUserRepository.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.BleChooseStrapActivity$e */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10510e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31813w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31814x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31815y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10510e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31813w = componentCallbacks;
            this.f31814x = interfaceC35951a;
            this.f31815y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.LanguageRepository, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final LanguageRepository invoke() {
            ComponentCallbacks componentCallbacks = this.f31813w;
            InterfaceC35951a interfaceC35951a = this.f31814x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31815y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(LanguageRepository.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.BleChooseStrapActivity$f */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10511f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31816w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31817x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31818y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10511f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31816w = componentCallbacks;
            this.f31817x = interfaceC35951a;
            this.f31818y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, rr2.c] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC31766c invoke() {
            ComponentCallbacks componentCallbacks = this.f31816w;
            InterfaceC35951a interfaceC35951a = this.f31817x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31818y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC31766c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.BleChooseStrapActivity$g */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10512g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31819w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31820x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31821y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10512g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31819w = componentCallbacks;
            this.f31820x = interfaceC35951a;
            this.f31821y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, m32.c] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC25007c invoke() {
            ComponentCallbacks componentCallbacks = this.f31819w;
            InterfaceC35951a interfaceC35951a = this.f31820x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31821y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC25007c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.BleChooseStrapActivity$h */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10513h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31822w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31823x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31824y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10513h(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31822w = componentCallbacks;
            this.f31823x = interfaceC35951a;
            this.f31824y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, js0.c] */
        @Override // c93.InterfaceC4339a
        public final AbstractC21909c invoke() {
            ComponentCallbacks componentCallbacks = this.f31822w;
            InterfaceC35951a interfaceC35951a = this.f31823x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31824y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC21909c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.BleChooseStrapActivity$i */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10514i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31825w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31826x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31827y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10514i(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31825w = componentCallbacks;
            this.f31826x = interfaceC35951a;
            this.f31827y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.y] */
        @Override // c93.InterfaceC4339a
        public final C28216y invoke() {
            ComponentCallbacks componentCallbacks = this.f31825w;
            InterfaceC35951a interfaceC35951a = this.f31826x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31827y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28216y.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.BleChooseStrapActivity$j */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10515j extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31828w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31829x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31830y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10515j(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31828w = componentCallbacks;
            this.f31829x = interfaceC35951a;
            this.f31830y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f31828w;
            InterfaceC35951a interfaceC35951a = this.f31829x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31830y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.BleChooseStrapActivity$k */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10516k extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31831w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31832x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31833y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10516k(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31831w = componentCallbacks;
            this.f31832x = interfaceC35951a;
            this.f31833y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Boolean, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final Boolean invoke() {
            ComponentCallbacks componentCallbacks = this.f31831w;
            InterfaceC35951a interfaceC35951a = this.f31832x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f31833y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Boolean.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.BleChooseStrapActivity$l */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10517l extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31834w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10517l(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f31834w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f31834w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.BleChooseStrapActivity$m */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10518m extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f31835w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31836x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31837y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f31838z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10518m(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f31835w = componentCallbacks;
            this.f31836x = interfaceC35951a;
            this.f31837y = interfaceC4339a;
            this.f31838z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, qm2.f] */
        @Override // c93.InterfaceC4339a
        public final C30489f invoke() {
            return AbstractC34132o.m107857B(this.f31835w, this.f31836x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C30489f.class), this.f31837y, this.f31838z);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.BleChooseStrapActivity$n */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"com/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity$n", "Landroid/companion/CompanionDeviceManager$Callback;", "Landroid/content/IntentSender;", "chooserLauncher", "Ll83/a0;", "onDeviceFound", "(Landroid/content/IntentSender;)V", "", "error", "onFailure", "(Ljava/lang/CharSequence;)V", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10519n extends CompanionDeviceManager.Callback {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f31840b;

        public C10519n(String str) {
            this.f31840b = str;
        }

        @Override // android.companion.CompanionDeviceManager.Callback
        public void onDeviceFound(IntentSender chooserLauncher) {
            AbstractC22676k.m65750j(chooserLauncher, "chooserLauncher");
            if (BleChooseStrapActivity.this.companionDevicePairingTimedOut) {
                BleChooseStrapActivity.this.logger.mo85226q("Companion Device Pairing timed out, but we found a device after the timeout window", new AbstractC30556a.a[0]);
            } else {
                BleChooseStrapActivity.this.connectStrapActivityResultHandler.mo4052a(new C21073l(chooserLauncher, null, 0, 0), null);
            }
        }

        @Override // android.companion.CompanionDeviceManager.Callback
        public void onFailure(CharSequence error) {
            BleChooseStrapActivity.this.companionDevicePairingTimedOut = true;
            InterfaceC31766c.m98634e(BleChooseStrapActivity.this.m26947E0(), new CompanionDevicePairingException("Association Failed: " + ((Object) error)), null, 2, null);
            BleChooseStrapActivity.this.m26953I0().m93373S(EnumC30497n.COMPANION_DEVICE_PAIRING_TIMED_OUT, this.f31840b);
        }
    }

    public BleChooseStrapActivity() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.analyticsUserRepository = AbstractC30060g.m92087G(enumC23463i, new C10509d(this, null, null));
        this.languageRepository = AbstractC30060g.m92087G(enumC23463i, new C10510e(this, null, null));
        this.crashReporter = AbstractC30060g.m92087G(enumC23463i, new C10511f(this, null, null));
        this.bluetoothPermissionHelper = AbstractC30060g.m92087G(enumC23463i, new C10512g(this, null, new C30487d(this, 7)));
        this.configurationRepository = AbstractC30060g.m92087G(enumC23463i, new C10513h(this, null, null));
        this.externalLinkNavigator = AbstractC30060g.m92087G(enumC23463i, new C10514i(this, null, null));
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i, new C10515j(this, null, null));
        this.isTest = AbstractC30060g.m92087G(enumC23463i, new C10516k(this, new C35953c("testFlag"), null));
        this.currentStrapAnimation = -1;
        this.connectStrapActivityResultHandler = registerForActivityResult(new ActivityResultContracts$StartIntentSenderForResult(), new C1904o(this, 11));
        this.receiver = new C10507b();
    }

    /* JADX INFO: renamed from: A0 */
    private final void m26941A0(String address) {
        C10534d<C30502s> c10534d = this.deviceAdapter;
        if (c10534d == null) {
            AbstractC22676k.m65757q("deviceAdapter");
            throw null;
        }
        for (C30502s c30502s : c10534d) {
            if (AbstractC22676k.m65745e(c30502s.getAddress(), address)) {
                m27033y0(c30502s.getDevice());
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A1 */
    public static final void m26942A1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B0 */
    private final AnalyticsUserRepository m26943B0() {
        return (AnalyticsUserRepository) this.analyticsUserRepository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B1 */
    public static final void m26944B1(BleChooseStrapActivity bleChooseStrapActivity, Throwable th3) {
        InterfaceC34116n interfaceC34116n = bleChooseStrapActivity.logger;
        AbstractC22676k.m65747g(th3);
        interfaceC34116n.mo85230v("error logging device count", th3, new AbstractC30556a.a[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public final InterfaceC25007c m26945C0() {
        return (InterfaceC25007c) this.bluetoothPermissionHelper.getValue();
    }

    /* JADX INFO: renamed from: D0 */
    private final AbstractC21909c m26946D0() {
        return (AbstractC21909c) this.configurationRepository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public final InterfaceC31766c m26947E0() {
        return (InterfaceC31766c) this.crashReporter.getValue();
    }

    /* JADX INFO: renamed from: F0 */
    private final C28216y m26948F0() {
        return (C28216y) this.externalLinkNavigator.getValue();
    }

    /* JADX INFO: renamed from: G0 */
    private final FeatureFlagChecker m26949G0() {
        return (FeatureFlagChecker) this.featureFlagChecker.getValue();
    }

    /* JADX INFO: renamed from: H0 */
    private final LanguageRepository m26951H0() {
        return (LanguageRepository) this.languageRepository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public final C30489f m26953I0() {
        return (C30489f) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: K0 */
    private final void m26956K0() {
        AbstractC18533a abstractC18533a = this.chooseBleDeviceBinding;
        if (abstractC18533a == null) {
            AbstractC22676k.m65757q("chooseBleDeviceBinding");
            throw null;
        }
        AbstractC18538c0 abstractC18538c0 = abstractC18533a.f72203c;
        abstractC18538c0.f72238d.setVisibility(0);
        abstractC18538c0.f72237c.setVisibility(8);
        abstractC18538c0.f72238d.setInAnimation(this, AbstractC26660a.f105960e);
        abstractC18538c0.f72238d.setOutAnimation(this, AbstractC26660a.f105969n);
        abstractC18538c0.f72238d.startFlipping();
    }

    /* JADX INFO: renamed from: L0 */
    private final void m26958L0(C30490g viewState) {
        AbstractC18533a abstractC18533a = this.chooseBleDeviceBinding;
        if (abstractC18533a == null) {
            AbstractC22676k.m65757q("chooseBleDeviceBinding");
            throw null;
        }
        abstractC18533a.f72203c.f72239e.setText(viewState.getConnectStrapTitleResourceId());
        if (viewState.getShouldShowPairCopyCarousel()) {
            m26956K0();
            return;
        }
        AbstractC18533a abstractC18533a2 = this.chooseBleDeviceBinding;
        if (abstractC18533a2 == null) {
            AbstractC22676k.m65757q("chooseBleDeviceBinding");
            throw null;
        }
        abstractC18533a2.f72203c.f72237c.setText(viewState.getConnectStrapSubtitleResourceId());
        AbstractC18533a abstractC18533a3 = this.chooseBleDeviceBinding;
        if (abstractC18533a3 == null) {
            AbstractC22676k.m65757q("chooseBleDeviceBinding");
            throw null;
        }
        abstractC18533a3.f72203c.f72238d.setVisibility(8);
        AbstractC18533a abstractC18533a4 = this.chooseBleDeviceBinding;
        if (abstractC18533a4 != null) {
            abstractC18533a4.f72203c.f72237c.setVisibility(0);
        } else {
            AbstractC22676k.m65757q("chooseBleDeviceBinding");
            throw null;
        }
    }

    /* JADX INFO: renamed from: M0 */
    private final void m26960M0() {
        this.deviceAdapter = new C10534d();
        AbstractC18533a abstractC18533a = this.chooseBleDeviceBinding;
        if (abstractC18533a == null) {
            AbstractC22676k.m65757q("chooseBleDeviceBinding");
            throw null;
        }
        abstractC18533a.f72203c.f72242h.setLayoutManager(new LinearLayoutManager(1));
        C10534d c10534d = this.deviceAdapter;
        if (c10534d == null) {
            AbstractC22676k.m65757q("deviceAdapter");
            throw null;
        }
        AbstractC18533a abstractC18533a2 = this.chooseBleDeviceBinding;
        if (abstractC18533a2 == null) {
            AbstractC22676k.m65757q("chooseBleDeviceBinding");
            throw null;
        }
        AbstractC12667a.m35467s(c10534d, abstractC18533a2.f72203c.f72242h).m77090a(new C25680d(this, 21));
        m27022r1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final void m26962N0(BleChooseStrapActivity bleChooseStrapActivity, AbstractC25990c abstractC25990c, C30502s c30502s, C10534d.a aVar, int i13) {
        bleChooseStrapActivity.m26953I0().m93377Y(c30502s.getAddress());
    }

    /* JADX INFO: renamed from: O0 */
    private final boolean m26964O0() {
        return getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: P0 */
    private final boolean m26966P0() {
        return ((Boolean) this.isTest.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: Q0 */
    private final void m26968Q0(int resourceId) {
        if (resourceId == this.currentStrapAnimation) {
            return;
        }
        AbstractC18533a abstractC18533a = this.chooseBleDeviceBinding;
        if (abstractC18533a == null) {
            AbstractC22676k.m65757q("chooseBleDeviceBinding");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = abstractC18533a.f72208h.getLayoutParams();
        AbstractC22676k.m65748h(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(0, marginLayoutParams.topMargin, 0, 0);
        AbstractC18533a abstractC18533a2 = this.chooseBleDeviceBinding;
        if (abstractC18533a2 == null) {
            AbstractC22676k.m65757q("chooseBleDeviceBinding");
            throw null;
        }
        abstractC18533a2.f72208h.setTag(Integer.valueOf(resourceId));
        AbstractC18533a abstractC18533a3 = this.chooseBleDeviceBinding;
        if (abstractC18533a3 == null) {
            AbstractC22676k.m65757q("chooseBleDeviceBinding");
            throw null;
        }
        abstractC18533a3.f72208h.setRenderMode(EnumC30384g0.f124676x);
        if (!m26966P0()) {
            AbstractC18533a abstractC18533a4 = this.chooseBleDeviceBinding;
            if (abstractC18533a4 == null) {
                AbstractC22676k.m65757q("chooseBleDeviceBinding");
                throw null;
            }
            abstractC18533a4.f72208h.setAnimation(resourceId);
            AbstractC18533a abstractC18533a5 = this.chooseBleDeviceBinding;
            if (abstractC18533a5 == null) {
                AbstractC22676k.m65757q("chooseBleDeviceBinding");
                throw null;
            }
            abstractC18533a5.f72208h.m15514d();
        }
        this.currentStrapAnimation = resourceId;
    }

    /* JADX INFO: renamed from: R0 */
    private final void m26970R0() {
        Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", getPackageName(), null));
        AbstractC22676k.m65749i(data, "setData(...)");
        startActivity(data);
    }

    /* JADX INFO: renamed from: S0 */
    private final void m26972S0() {
        m26953I0().getScannedWhoopDevices().observe(this, new AbstractC10531a.a(new C30485b(this, 7)));
        m26953I0().getRequestNewBlePermissionEvent().m85329c(this, new C30487d(this, 8));
        m26953I0().getNavigateToAppInfoAction().m85329c(this, new C30487d(this, 9));
        m26953I0().getViewStateLiveData().observe(this, new AbstractC10531a.a(new C30485b(this, 8)));
        m26953I0().m93369I().m85346c(this, new C30485b(this, 1));
        m26953I0().m93365E().m85346c(this, new C30485b(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final C23454a0 m26974T0(BleChooseStrapActivity bleChooseStrapActivity, List list) {
        C10534d c10534d = bleChooseStrapActivity.deviceAdapter;
        if (c10534d == null) {
            AbstractC22676k.m65757q("deviceAdapter");
            throw null;
        }
        c10534d.m72638W(list);
        bleChooseStrapActivity.m27030w1();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final C23454a0 m26976U0(BleChooseStrapActivity bleChooseStrapActivity) {
        bleChooseStrapActivity.m27000g1();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final C23454a0 m26978V0(BleChooseStrapActivity bleChooseStrapActivity) {
        bleChooseStrapActivity.m26970R0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final C23454a0 m26980W0(BleChooseStrapActivity bleChooseStrapActivity, C30490g c30490g) {
        AbstractC18533a abstractC18533a = bleChooseStrapActivity.chooseBleDeviceBinding;
        if (abstractC18533a == null) {
            AbstractC22676k.m65757q("chooseBleDeviceBinding");
            throw null;
        }
        abstractC18533a.f72205e.getRoot().setVisibility(c30490g.getLocationServicesVisibility());
        AbstractC18533a abstractC18533a2 = bleChooseStrapActivity.chooseBleDeviceBinding;
        if (abstractC18533a2 == null) {
            AbstractC22676k.m65757q("chooseBleDeviceBinding");
            throw null;
        }
        abstractC18533a2.f72201a.getRoot().setVisibility(c30490g.getAppLocationPermissionVisibility());
        AbstractC18533a abstractC18533a3 = bleChooseStrapActivity.chooseBleDeviceBinding;
        if (abstractC18533a3 == null) {
            AbstractC22676k.m65757q("chooseBleDeviceBinding");
            throw null;
        }
        abstractC18533a3.f72204d.getRoot().setVisibility(c30490g.getBluetoothVisibility());
        AbstractC18533a abstractC18533a4 = bleChooseStrapActivity.chooseBleDeviceBinding;
        if (abstractC18533a4 == null) {
            AbstractC22676k.m65757q("chooseBleDeviceBinding");
            throw null;
        }
        abstractC18533a4.f72208h.setVisibility(c30490g.getStrapImageVisibility());
        AbstractC18533a abstractC18533a5 = bleChooseStrapActivity.chooseBleDeviceBinding;
        if (abstractC18533a5 == null) {
            AbstractC22676k.m65757q("chooseBleDeviceBinding");
            throw null;
        }
        abstractC18533a5.f72203c.getRoot().setVisibility(c30490g.getGen4DeviceLayoutVisibility());
        bleChooseStrapActivity.m26968Q0(c30490g.getStrapImageResourceId());
        bleChooseStrapActivity.m26958L0(c30490g);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final C23454a0 m26982X0(BleChooseStrapActivity bleChooseStrapActivity, String it) {
        AbstractC22676k.m65750j(it, "it");
        bleChooseStrapActivity.m27032x1(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final C23454a0 m26984Y0(BleChooseStrapActivity bleChooseStrapActivity, String it) {
        AbstractC22676k.m65750j(it, "it");
        bleChooseStrapActivity.m26941A0(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final C23454a0 m26986Z0(BleChooseStrapActivity bleChooseStrapActivity, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            bleChooseStrapActivity.navigationHost = AbstractC21130a1.m58963a("BleChooseStrapNavHost", null, c28655q, 6, 2);
            EnumC31606f.Companion aVar = EnumC31606f.INSTANCE;
            C30498o c30498o = bleChooseStrapActivity.intentBuilder;
            if (c30498o == null) {
                AbstractC22676k.m65757q("intentBuilder");
                throw null;
            }
            String strM93408v = c30498o.m93408v();
            AbstractC22676k.m65749i(strM93408v, "getDestination(...)");
            EnumC31606f enumC31606fM97637a = aVar.m97637a(strM93408v);
            C12991u0 c12991u0 = bleChooseStrapActivity.navigationHost;
            if (c12991u0 == null) {
                AbstractC22676k.m65757q("navigationHost");
                throw null;
            }
            AbstractC18533a abstractC18533a = bleChooseStrapActivity.chooseBleDeviceBinding;
            if (abstractC18533a == null) {
                AbstractC22676k.m65757q("chooseBleDeviceBinding");
                throw null;
            }
            boolean zM87157i = c28655q.m87157i(bleChooseStrapActivity);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C30487d(bleChooseStrapActivity, 0);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(bleChooseStrapActivity);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C30487d(bleChooseStrapActivity, 1);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC31605e.m97576R(enumC31606fM97637a, c12991u0, abstractC18533a, interfaceC4339a, (InterfaceC4339a) objM87133R2, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final C23454a0 m26988a1(BleChooseStrapActivity bleChooseStrapActivity) {
        bleChooseStrapActivity.m26992c1();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final C23454a0 m26990b1(BleChooseStrapActivity bleChooseStrapActivity) {
        bleChooseStrapActivity.supportFinishAfterTransition();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c1 */
    private final void m26992c1() {
        if (m26966P0()) {
            return;
        }
        Locale allowedLanguage = m26951H0().getAllowedLanguage();
        C28216y c28216yM26948F0 = m26948F0();
        AbstractC21909c abstractC21909cM26946D0 = m26946D0();
        TroubleConnectingSupportArticleUrl troubleConnectingSupportArticleUrl = new TroubleConnectingSupportArticleUrl(allowedLanguage);
        C21908b configurations = abstractC21909cM26946D0.getConfigurations();
        String name = troubleConnectingSupportArticleUrl.getName();
        Object defaultValue = troubleConnectingSupportArticleUrl.getDefaultValue();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(String.class);
        Object objM125868N0 = null;
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
        if (objM125868N0 != null) {
            defaultValue = objM125868N0;
        }
        if (defaultValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        C28216y.m85414y(c28216yM26948F0, this, (String) defaultValue, false, 4, null);
    }

    /* JADX INFO: renamed from: d1 */
    private final void m26994d1() {
        registerReceiver(this.receiver, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
    }

    /* JADX INFO: renamed from: e1 */
    private final void m26996e1() {
        IntentFilter intentFilter = new IntentFilter("android.location.PROVIDERS_CHANGED");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        registerReceiver(this.receiver, intentFilter);
    }

    /* JADX INFO: renamed from: f1 */
    private final void m26998f1() {
        this.logger.mo85216g("No location permissions granted... requesting...", new AbstractC30556a.a[0]);
        ActivityCompat.requestPermissions(this, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 2131);
    }

    /* JADX INFO: renamed from: g1 */
    private final void m27000g1() {
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C10508c(null), 3);
    }

    /* JADX INFO: renamed from: h1 */
    private final void m27002h1() {
        startActivity(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
    }

    /* JADX INFO: renamed from: i1 */
    private final void m27004i1() {
        C28217y0 c28217y0 = (C28217y0) AbstractC29125c.m88492A(this).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28217y0.class), null);
        if (c28217y0.m85444e()) {
            this.logger.mo85216g("Location services are enabled; proceeding with scan", new AbstractC30556a.a[0]);
        } else {
            C28217y0.m85439g(c28217y0, this, null, new C30487d(this, 2), new C30487d(this, 3), new C30487d(this, 4), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public static final C23454a0 m27006j1(BleChooseStrapActivity bleChooseStrapActivity) {
        bleChooseStrapActivity.m26953I0().m93374V();
        bleChooseStrapActivity.logger.mo85216g("User approved location services enable request; proceeding", new AbstractC30556a.a[0]);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public static final C23454a0 m27008k1(BleChooseStrapActivity bleChooseStrapActivity) {
        AbstractC18737i.m54478c(bleChooseStrapActivity, AbstractC17312j.f66960X);
        bleChooseStrapActivity.logger.mo85216g("Error enabling location services", new AbstractC30556a.a[0]);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public static final C23454a0 m27010l1(BleChooseStrapActivity bleChooseStrapActivity) {
        AbstractC18737i.m54478c(bleChooseStrapActivity, AbstractC17312j.f66941N0);
        bleChooseStrapActivity.logger.mo85216g("User canceled location services enable request; showed message", new AbstractC30556a.a[0]);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m1 */
    private final void m27012m1() {
        AbstractC18533a abstractC18533a = this.chooseBleDeviceBinding;
        if (abstractC18533a == null) {
            AbstractC22676k.m65757q("chooseBleDeviceBinding");
            throw null;
        }
        ImageView backIv = abstractC18533a.f72202b;
        AbstractC22676k.m65749i(backIv, "backIv");
        AbstractC1953c.m5963a(backIv, new C30485b(this, 3));
        AbstractC18533a abstractC18533a2 = this.chooseBleDeviceBinding;
        if (abstractC18533a2 == null) {
            AbstractC22676k.m65757q("chooseBleDeviceBinding");
            throw null;
        }
        StrokedPillButton enableLocationServicesButton = abstractC18533a2.f72205e.f72277a;
        AbstractC22676k.m65749i(enableLocationServicesButton, "enableLocationServicesButton");
        AbstractC1953c.m5963a(enableLocationServicesButton, new C30485b(this, 4));
        AbstractC18533a abstractC18533a3 = this.chooseBleDeviceBinding;
        if (abstractC18533a3 == null) {
            AbstractC22676k.m65757q("chooseBleDeviceBinding");
            throw null;
        }
        StrokedPillButton enableBluetoothButtonNew = abstractC18533a3.f72204d.f72261b;
        AbstractC22676k.m65749i(enableBluetoothButtonNew, "enableBluetoothButtonNew");
        AbstractC1953c.m5963a(enableBluetoothButtonNew, new C30485b(this, 5));
        AbstractC18533a abstractC18533a4 = this.chooseBleDeviceBinding;
        if (abstractC18533a4 == null) {
            AbstractC22676k.m65757q("chooseBleDeviceBinding");
            throw null;
        }
        StrokedPillButton allowLocationPermissionsButtonNew = abstractC18533a4.f72201a.f72209a;
        AbstractC22676k.m65749i(allowLocationPermissionsButtonNew, "allowLocationPermissionsButtonNew");
        AbstractC1953c.m5963a(allowLocationPermissionsButtonNew, new C30485b(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public static final C23454a0 m27014n1(BleChooseStrapActivity bleChooseStrapActivity, View it) {
        AbstractC22676k.m65750j(it, "it");
        C12991u0 c12991u0 = bleChooseStrapActivity.navigationHost;
        if (c12991u0 == null) {
            AbstractC22676k.m65757q("navigationHost");
            throw null;
        }
        if (!c12991u0.m36410z()) {
            bleChooseStrapActivity.supportFinishAfterTransition();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public static final C23454a0 m27016o1(BleChooseStrapActivity bleChooseStrapActivity, View it) {
        AbstractC22676k.m65750j(it, "it");
        bleChooseStrapActivity.m27004i1();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public static final C23454a0 m27018p1(BleChooseStrapActivity bleChooseStrapActivity, View it) {
        AbstractC22676k.m65750j(it, "it");
        bleChooseStrapActivity.m27002h1();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q0 */
    private final void m27019q0() {
        AbstractC18533a abstractC18533a = this.chooseBleDeviceBinding;
        if (abstractC18533a == null) {
            AbstractC22676k.m65757q("chooseBleDeviceBinding");
            throw null;
        }
        View root = abstractC18533a.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        C30486c c30486c = new C30486c(0, this, root);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16877h0.m47517l(root, c30486c);
        if (root.isAttachedToWindow()) {
            m27023s0(root, AbstractC16880i0.m47522a(root));
        } else {
            root.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC10506a(root, this, root));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public static final C23454a0 m27020q1(BleChooseStrapActivity bleChooseStrapActivity, View it) {
        AbstractC22676k.m65750j(it, "it");
        bleChooseStrapActivity.m26998f1();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C16905q1 m27021r0(BleChooseStrapActivity bleChooseStrapActivity, View view, View view2, C16905q1 insets) {
        AbstractC22676k.m65750j(view2, "<unused var>");
        AbstractC22676k.m65750j(insets, "insets");
        bleChooseStrapActivity.m27023s0(view, insets);
        return insets;
    }

    /* JADX INFO: renamed from: r1 */
    private final void m27022r1() {
        AbstractC18533a abstractC18533a = this.chooseBleDeviceBinding;
        if (abstractC18533a != null) {
            abstractC18533a.f72203c.f72235a.setContent(new C37816b(new C30488e(this, 0), true, 1520163663));
        } else {
            AbstractC22676k.m65757q("chooseBleDeviceBinding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public final void m27023s0(View view, C16905q1 c16905q1) {
        if (c16905q1 == null) {
            return;
        }
        C35643b c35643bMo47530g = c16905q1.f64864a.mo47530g(135);
        AbstractC22676k.m65749i(c35643bMo47530g, "getInsets(...)");
        view.setPadding(c35643bMo47530g.f151449a, c35643bMo47530g.f151450b, c35643bMo47530g.f151451c, c35643bMo47530g.f151452d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public static final C23454a0 m27024s1(BleChooseStrapActivity bleChooseStrapActivity, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC38073e.m121966n(null, null, null, null, AbstractC37817c.m121344e(1525911370, c28655q, new C30488e(bleChooseStrapActivity, 1)), c28655q, 24576, 15);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public static final C23454a0 m27025t1(BleChooseStrapActivity bleChooseStrapActivity, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM87157i = c28655q.m87157i(bleChooseStrapActivity);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C30487d(bleChooseStrapActivity, 5);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(bleChooseStrapActivity);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C30487d(bleChooseStrapActivity, 6);
                c28655q.m87172p0(objM87133R2);
            }
            Function0.m90138b(interfaceC4339a, (InterfaceC4339a) objM87133R2, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public static final C23454a0 m27026u1(BleChooseStrapActivity bleChooseStrapActivity) {
        C12991u0 c12991u0 = bleChooseStrapActivity.navigationHost;
        if (c12991u0 == null) {
            AbstractC22676k.m65757q("navigationHost");
            throw null;
        }
        AbstractC12939a0.m36374y(c12991u0, "DONT_SEE_YOUR_DEVICE", null, 6);
        bleChooseStrapActivity.m26953I0().m93385m0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final C34911a m27027v0(BleChooseStrapActivity bleChooseStrapActivity) {
        return AbstractC15751g.m44431K(bleChooseStrapActivity.getActivityResultRegistry());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public static final C23454a0 m27028v1(BleChooseStrapActivity bleChooseStrapActivity) {
        C12991u0 c12991u0 = bleChooseStrapActivity.navigationHost;
        if (c12991u0 == null) {
            AbstractC22676k.m65757q("navigationHost");
            throw null;
        }
        AbstractC12939a0.m36374y(c12991u0, "TAKE_OFF_YOUR_WHOOP", null, 6);
        bleChooseStrapActivity.m26953I0().m93384l0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w0 */
    private final void m27029w0(String strapGeneration, String name) {
        this.logger.mo85228t("User selected a BLE Peripheral from the BLE scan results", new AbstractC30556a.a[0]);
        m26953I0().m93383k0();
        m26953I0().m93381d0(strapGeneration, name);
        BleConnectStrapActivity.C10521b c10521bM27137a = AbstractC10533c.m27137a(this);
        C30498o c30498o = this.intentBuilder;
        if (c30498o != null) {
            c10521bM27137a.m93406t(c30498o).m49155n(this, 2233);
        } else {
            AbstractC22676k.m65757q("intentBuilder");
            throw null;
        }
    }

    /* JADX INFO: renamed from: w1 */
    private final void m27030w1() {
        C10534d c10534d = this.deviceAdapter;
        if (c10534d == null) {
            AbstractC22676k.m65757q("deviceAdapter");
            throw null;
        }
        if (c10534d.mo72642f() != 0) {
            m26953I0().m93386n0();
        } else {
            this.logger.mo85222m("Unable to find devices. Displaying need help button to user", new AbstractC30556a.a[0]);
            m26953I0().m93387o0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final void m27031x0(BleChooseStrapActivity bleChooseStrapActivity, C21062a it) {
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116n = bleChooseStrapActivity.logger;
        int i13 = it.f79915w;
        interfaceC34116n.mo85228t(AbstractC2875y.m8295h(i13, "Choose strap result code: "), new AbstractC30556a.a[0]);
        if (i13 != -1) {
            if (i13 != 0) {
                return;
            }
            C30489f.m93356U(bleChooseStrapActivity.m26953I0(), EnumC30497n.COMPANION_DEVICE_PAIRING_CANCELLED, null, 2, null);
            return;
        }
        bleChooseStrapActivity.logger.mo85228t("RESULT_OK", new AbstractC30556a.a[0]);
        Intent intent = it.f79916x;
        BluetoothDevice bluetoothDeviceM85318c = intent != null ? AbstractC28189p.m85318c(intent) : null;
        if (bluetoothDeviceM85318c == null) {
            InterfaceC31766c.m98634e(bleChooseStrapActivity.m26947E0(), new CompanionDevicePairingException("selected device was null"), null, 2, null);
        } else {
            bleChooseStrapActivity.m26953I0().m93373S(EnumC30497n.COMPANION_DEVICE_PAIRING_SUCCESS, bluetoothDeviceM85318c.getAddress());
        }
    }

    /* JADX INFO: renamed from: x1 */
    private final void m27032x1(String address) {
        String str;
        try {
            this.companionDevicePairingTimedOut = false;
            str = address;
            try {
                AbstractC28189p.m85317b(this, str, new C10519n(address), 0L, 4, null);
            } catch (CompanionDevicePairingException e5) {
                e = e5;
                CompanionDevicePairingException companionDevicePairingException = e;
                if (AbstractC22676k.m65745e(companionDevicePairingException.getMessage(), "Companion Device Manager is null!")) {
                    m26953I0().m93373S(EnumC30497n.COMPANION_DEVICE_MANAGER_NULL, str);
                } else {
                    InterfaceC31766c.m98634e(m26947E0(), companionDevicePairingException, null, 2, null);
                }
            }
        } catch (CompanionDevicePairingException e13) {
            e = e13;
            str = address;
        }
    }

    /* JADX INFO: renamed from: y0 */
    private final void m27033y0(BluetoothDevice device) {
        AtomicReference<C30496m> atomicReference = this.clickedDevice;
        if (atomicReference == null) {
            AbstractC22676k.m65757q("clickedDevice");
            throw null;
        }
        String address = device.getAddress();
        AbstractC22676k.m65749i(address, "getAddress(...)");
        String name = device.getName();
        if (name == null) {
            name = getApplicationContext().getString(AbstractC17312j.f67010o1);
            AbstractC22676k.m65749i(name, "getString(...)");
        }
        atomicReference.set(new C30496m(device, address, name, AbstractC4337i.m13733a(device)));
        m27029w0(AbstractC4337i.m13733a(device), device.getName());
    }

    /* JADX INFO: renamed from: y1 */
    private final void m27034y1() {
        this.scannedDeviceNamesLogging = C38280g.m122647t(4L, TimeUnit.SECONDS).m122662L(new C27566m0(new C30485b(this, 0), 10), new C27566m0(this, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z1 */
    public static final C23454a0 m27035z1(BleChooseStrapActivity bleChooseStrapActivity, Long l7) {
        InterfaceC34116n interfaceC34116n = bleChooseStrapActivity.logger;
        List list = (List) bleChooseStrapActivity.m26953I0().getScannedWhoopDevices().getValue();
        interfaceC34116n.mo85216g("Devices found: " + (list != null ? Integer.valueOf(list.size()) : null), new AbstractC30556a.a[0]);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: J0 */
    public final void m27036J0(int resultCode) {
        if (resultCode != -1) {
            if (resultCode != 101) {
                return;
            }
            C12991u0 c12991u0 = this.navigationHost;
            if (c12991u0 != null) {
                AbstractC12939a0.m36374y(c12991u0, "CONNECTION_FAILURE", null, 6);
                return;
            } else {
                AbstractC22676k.m65757q("navigationHost");
                throw null;
            }
        }
        C30498o c30498o = this.intentBuilder;
        if (c30498o == null) {
            AbstractC22676k.m65757q("intentBuilder");
            throw null;
        }
        String strM93407u = c30498o.m93407u();
        if (!m26949G0().isFeatureEnabled(OnboardingFeatureFlag.PAIRING_COMPLETION_DESTINATION_NAV) || strM93407u == null || strM93407u.length() == 0) {
            setResult(-1);
        } else {
            Intent intent = new Intent(this, (Class<?>) MainActivity.class);
            intent.addFlags(603979776);
            intent.putExtra("pairing_completion_destination", strM93407u);
            startActivity(intent);
        }
        finish();
    }

    @Override // hj0.AbstractActivityC17347f, android.app.Activity
    public void finish() {
        super.finish();
        m27038u0();
    }

    @Override // hj0.AbstractActivityC17347f, androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 2233) {
            m27036J0(resultCode);
        }
    }

    @Override // hj0.AbstractActivityC17360s, hj0.AbstractActivityC17361t, hj0.AbstractActivityC17347f, androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"NewApi"})
    public void onCreate(Bundle savedInstanceState) throws ScopeAlreadyCreatedException {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            m27037t0();
        }
        AbstractC14911n.m43003a(this, C34377e.m108675q(), C34377e.m108675q());
        AbstractC18533a abstractC18533aM53749c = AbstractC18533a.m53749c(getLayoutInflater());
        AbstractC22676k.m65749i(abstractC18533aM53749c, "inflate(...)");
        this.chooseBleDeviceBinding = abstractC18533aM53749c;
        this.intentBuilder = new C30498o(this, getIntent());
        AbstractC16348f.m46559a(this, new C37816b(new C30488e(this, 2), true, -1671632830));
        m27019q0();
        C26669a c26669aM110120B = AbstractC34924m.m110120B(this);
        C35953c c35953c = new C35953c("scopeConnectStrap");
        c26669aM110120B.getClass();
        C37247a c37247a = c26669aM110120B.f106046a;
        C38266c c38266c = (C38266c) c37247a.f159363c.get("connectStrapScopeId");
        if (c38266c == null) {
            c26669aM110120B.f106048c.m92138J(new C25067k(c35953c, 3));
            ConcurrentHashMap concurrentHashMap = c37247a.f159363c;
            C26669a c26669a = c37247a.f159361a;
            HashSet hashSet = c37247a.f159362b;
            if (!hashSet.contains(c35953c)) {
                c26669a.f106048c.m92136C("Warning: Scope '" + c35953c + "' not defined. Creating it");
                hashSet.add(c35953c);
            }
            if (concurrentHashMap.containsKey("connectStrapScopeId")) {
                throw new ScopeAlreadyCreatedException("Scope with id 'connectStrapScopeId' is already created");
            }
            C38266c c38266c2 = new C38266c(c35953c, "connectStrapScopeId", false, c26669a);
            AbstractC25265s.m74139o0(c38266c2.f164062e, new C38266c[]{c37247a.f159364d});
            concurrentHashMap.put("connectStrapScopeId", c38266c2);
            c38266c = c38266c2;
        }
        this.pairingScope = c38266c;
        C35953c c35953c2 = new C35953c("bleStrap");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        this.clickedDevice = (AtomicReference) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AtomicReference.class), c35953c2);
        m27012m1();
        m26960M0();
        m26972S0();
        m26996e1();
        m26994d1();
        AnalyticsUserRepository analyticsUserRepositoryM26943B0 = m26943B0();
        C30498o c30498o = this.intentBuilder;
        if (c30498o == null) {
            AbstractC22676k.m65757q("intentBuilder");
            throw null;
        }
        analyticsUserRepositoryM26943B0.setNewUser(true ^ c30498o.m93411y());
        getLifecycle().mo4986a(m26945C0());
        ((InterfaceC21153l0) AbstractC29125c.m88492A(this).m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21153l0.class), null)).mo59004J("BleChooseStrapActivity");
    }

    @Override // hj0.AbstractActivityC17347f, p314m.AbstractActivityC24852m, androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.receiver);
        if (isChangingConfigurations()) {
            return;
        }
        C38266c c38266c = this.pairingScope;
        if (c38266c == null) {
            AbstractC22676k.m65757q("pairingScope");
            throw null;
        }
        C25067k c25067k = new C25067k(c38266c, 15);
        synchronized (c38266c) {
            c25067k.invoke();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        AbstractC22676k.m65750j(permissions, "permissions");
        AbstractC22676k.m65750j(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.ACCESS_FINE_LOCATION") || m26953I0().m93371M()) {
            m26953I0().m93376X(requestCode);
        } else {
            m26970R0();
        }
    }

    @Override // p314m.AbstractActivityC24852m, androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onStart() {
        super.onStart();
        m26953I0().m93378Z();
        m27034y1();
    }

    @Override // p314m.AbstractActivityC24852m, androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onStop() {
        super.onStop();
        m26953I0().m93379b0();
        this.scannedDeviceNamesLogging.mo14750b();
    }

    @Override // hj0.AbstractActivityC17347f
    /* JADX INFO: renamed from: p */
    public String mo19335p() {
        return "Pairing";
    }

    /* JADX INFO: renamed from: t0 */
    public final void m27037t0() {
        if (m26964O0()) {
            overridePendingTransition(AbstractC26660a.f105961f, AbstractC26660a.f105966k);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m27038u0() {
        if (m26964O0()) {
            overridePendingTransition(AbstractC26660a.f105962g, AbstractC26660a.f105965j);
        }
    }
}
