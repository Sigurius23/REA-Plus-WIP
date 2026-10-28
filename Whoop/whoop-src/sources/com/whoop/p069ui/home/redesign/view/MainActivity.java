package com.whoop.p069ui.home.redesign.view;

import android.animation.ValueAnimator;
import android.companion.CompanionDeviceManager;
import android.content.ComponentCallbacks;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.widget.VideoView;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.AbstractC3006f0;
import bc3.C3000d2;
import bc3.C3033m;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3025k;
import bc3.InterfaceC3027k1;
import c41.C4065l3;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.airbnb.lottie.LottieAnimationView;
import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.domain.model.AndroidUri;
import com.whoop.domain.model.Logout;
import com.whoop.domain.model.WhoopUri;
import com.whoop.p069ui.home.redesign.view.MainActivity;
import com.whoop.service.push.C9984a;
import com.whoop.service.rearchitect.BleWhoopStrapService;
import d91.AbstractC11814b;
import dp0.InterfaceC12251g;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import ec3.C13052j1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ei0.InterfaceC13218a;
import ge3.AbstractC15751g;
import h92.C17029a;
import hi0.AbstractC17307e;
import hi0.AbstractC17311i;
import hj0.AbstractC17342a;
import hj0.C17359r;
import hj0.InterfaceC17346e;
import i92.C18259d;
import ii0.AbstractC18545g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21155m0;
import j02.C21138e;
import j02.C21139e0;
import j02.C21140f;
import j02.C21167s0;
import j02.InterfaceC21136d;
import j02.InterfaceC21159o0;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import jf3.C21647a;
import jk0.InterfaceC21750d;
import l80.InterfaceC23444u;
import l83.C23454a0;
import l83.C23465k;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import live.hms.video.media.tracks.HMSTrackSource;
import ll1.C24502b;
import m32.EnumC25009e;
import m32.InterfaceC25007c;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import n73.InterfaceC26443b;
import n92.C26480b;
import n92.EnumC26479a;
import od1.InterfaceC27837a0;
import p014aj.C0929d;
import p081d5.C11706c;
import p098dt.AbstractC12350b;
import p114eb.C12977n0;
import p161g.AbstractC14917t;
import p314m.AbstractActivityC24852m;
import p390p1.C28655q;
import p399pb.InterfaceC29049f;
import p426qi.C30398s;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q73.EnumC30025d;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import q92.C30076h;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rl1.C31511a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import uf3.C34911a;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import vm2.C36157b;
import vm2.C36159d;
import vm2.C36163h;
import vm2.C36165j;
import vm2.EnumC36164i;
import wm2.C37392b;
import xm2.AbstractC38460a;
import xm2.AbstractC38461b;
import xm2.C38462c;
import ym2.AbstractC39658f;
import ym2.C39653a;
import ym2.C39654b;
import ym2.InterfaceC39659g;
import yr2.InterfaceC39736a;
import zm2.AbstractC40896a;
import zs0.InterfaceC41076a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000²\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0002Â\u0001\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\f\u0010\u0005J\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0011\u0010\u0005J\u000f\u0010\u0012\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\u0005J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0005J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u0005J\u0018\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b#\u0010\"J\u0017\u0010$\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b$\u0010\"J\u0010\u0010%\u001a\u00020\bH\u0082@¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bH\u0082@¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020\bH\u0002¢\u0006\u0004\b(\u0010\u0005J\u000f\u0010)\u001a\u00020\bH\u0002¢\u0006\u0004\b)\u0010\u0005J\u0017\u0010,\u001a\u00020\b2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b.\u0010\u001bJ\u0010\u0010/\u001a\u00020\bH\u0082@¢\u0006\u0004\b/\u0010&J(\u00104\u001a\u00020\b2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u00182\u0006\u00103\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\bH\u0002¢\u0006\u0004\b6\u0010\u0005J\u0019\u00107\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b7\u0010\u0010J\u0019\u00108\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b8\u0010\u0010J\u0017\u00109\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b9\u0010\u0010J\u0017\u0010:\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b:\u0010\u0010J\u0017\u0010;\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b;\u0010\u0010J\u0010\u0010<\u001a\u00020\bH\u0082@¢\u0006\u0004\b<\u0010&J\u0013\u0010>\u001a\u00020\b*\u00020=H\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\bH\u0002¢\u0006\u0004\b@\u0010\u0005J\u000f\u0010A\u001a\u00020\bH\u0002¢\u0006\u0004\bA\u0010\u0005R\u001b\u0010G\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001b\u0010L\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010D\u001a\u0004\bJ\u0010KR\u001b\u0010Q\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010D\u001a\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010D\u001a\u0004\bT\u0010UR\u001b\u0010[\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010D\u001a\u0004\bY\u0010ZR\u001b\u0010`\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010D\u001a\u0004\b^\u0010_R\u001b\u0010e\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010D\u001a\u0004\bc\u0010dR\u001b\u0010j\u001a\u00020f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010D\u001a\u0004\bh\u0010iR\u001b\u0010o\u001a\u00020k8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010D\u001a\u0004\bm\u0010nR\u001b\u0010t\u001a\u00020p8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010D\u001a\u0004\br\u0010sR\u001b\u0010y\u001a\u00020u8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010D\u001a\u0004\bw\u0010xR\u001b\u0010~\u001a\u00020z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010D\u001a\u0004\b|\u0010}R\u001f\u0010\u0083\u0001\u001a\u00020\u007f8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0080\u0001\u0010D\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R \u0010\u0088\u0001\u001a\u00030\u0084\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0085\u0001\u0010D\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0019\u0010\u008b\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0019\u0010\u008d\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008a\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R \u0010\u0096\u0001\u001a\u00030\u0092\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0093\u0001\u0010D\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R \u0010\u009b\u0001\u001a\u00030\u0097\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0098\u0001\u0010D\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001R \u0010 \u0001\u001a\u00030\u009c\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u009d\u0001\u0010D\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R \u0010¥\u0001\u001a\u00030¡\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¢\u0001\u0010D\u001a\u0006\b£\u0001\u0010¤\u0001R\u0018\u0010©\u0001\u001a\u00030¦\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u001a\u0010\u00ad\u0001\u001a\u00030ª\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u001a\u0010±\u0001\u001a\u00030®\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u0019\u0010³\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010\u008a\u0001R\u001c\u0010¶\u0001\u001a\u0005\u0018\u00010´\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010µ\u0001R\u001f\u0010º\u0001\u001a\u00030·\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b#\u0010D\u001a\u0006\b¸\u0001\u0010¹\u0001R\u001e\u0010½\u0001\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b$\u0010D\u001a\u0006\b»\u0001\u0010¼\u0001R\u001c\u0010Á\u0001\u001a\u0005\u0018\u00010¾\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001R\u0018\u0010Å\u0001\u001a\u00030Â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R\u0018\u0010É\u0001\u001a\u00030Æ\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÇ\u0001\u0010È\u0001¨\u0006Ê\u0001"}, m65681d2 = {"Lcom/whoop/ui/home/redesign/view/MainActivity;", "Lm/m;", "Lcom/whoop/service/rearchitect/BleWhoopStrapService$c;", "Ll80/u;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "i", "onResume", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onPause", "onDestroy", "Ljk0/d;", "whoopStrap", "C", "(Ljk0/d;)V", "q", "", "isFirstCreate", "Y0", "(Z)V", "Z0", "Q0", "(ZLq83/d;)Ljava/lang/Object;", "Lbc3/c0;", "scope", "e0", "(Lbc3/c0;)V", "a0", "b0", "X0", "(Lq83/d;)Ljava/lang/Object;", "k0", "N0", "H0", "Landroid/animation/ValueAnimator;", "valueAnimator", "S0", "(Landroid/animation/ValueAnimator;)V", "T0", "W0", "Lj02/m0;", HMSTrackSource.SCREEN, "asTabRoot", "homeFlashFixEnabled", "P0", "(Lj02/m0;ZZLq83/d;)Ljava/lang/Object;", "G0", "J0", "I0", "M0", "K0", "L0", "O0", "Landroid/widget/VideoView;", "g0", "(Landroid/widget/VideoView;)V", "b1", "c1", "Lod1/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "C0", "()Lod1/a0;", "userSessionManager", "Lhj0/e;", "x", "q0", "()Lhj0/e;", "applicationLifecycleListener", "Lll1/b;", "y", "A0", "()Lll1/b;", "requiredPermissionTracker", "Lq92/h;", "z", "F0", "()Lq92/h;", "whoopStrapSharedPrefs", "Lym2/g;", "E", "E0", "()Lym2/g;", "whoopSplashState", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "F", "t0", "()Lcom/whoop/data/repositories/FeatureFlagRepository;", "featureFlagRepository", "Lcom/whoop/service/push/a;", "G", "o0", "()Lcom/whoop/service/push/a;", "appNotificationInitializer", "Ldp0/g;", "H", "u0", "()Ldp0/g;", "globalCoachManager", "Lei0/a;", "I", "l0", "()Lei0/a;", "amplitudeEngagementClient", "Lh92/a;", "J", "getDeepLinkParser", "()Lh92/a;", "deepLinkParser", "Lj02/s0;", "K", "x0", "()Lj02/s0;", "pairingCompletionNavigator", "Lzs0/a;", "L", "s0", "()Lzs0/a;", "companionDeviceInteractor", "Lvm2/b;", "M", "m0", "()Lvm2/b;", "appDestinationHelper", "Lvm2/j;", "N", "v0", "()Lvm2/j;", "launchRedirectGate", "O", "Z", "launchHadDeepLink", "P", "appNavigatorReady", "Lmc3/a;", "Q", "Lmc3/a;", "appNavigatorSetupMutex", "Lj02/e;", "R", "r0", "()Lj02/e;", "bffBottomNavTabEventPublisher", "Lvm2/d;", "S", "n0", "()Lvm2/d;", "appNavigator", "Lm32/c;", "T", "y0", "()Lm32/c;", "requiredPermissionHelper", "Lwm2/b;", "U", "D0", "()Lwm2/b;", "viewModel", "Ltr2/n;", "V", "Ltr2/n;", "logger", "Lii0/g;", "W", "Lii0/g;", "activityBinding", "Ln73/b;", "X", "Ln73/b;", "serviceConnectionDisposable", "Y", "serviceHasWhoopStrap", "Landroid/os/Vibrator;", "Landroid/os/Vibrator;", "vibrator", "Lyr2/a;", "B0", "()Lyr2/a;", "splashVideoHelper", "p0", "()Lbc3/c0;", "applicationCoroutineScope", "Lbc3/k1;", "c0", "Lbc3/k1;", "deepLinkJob", "com/whoop/ui/home/redesign/view/MainActivity$r", "d0", "Lcom/whoop/ui/home/redesign/view/MainActivity$r;", "serviceConnection", "Lj02/o0;", "w0", "()Lj02/o0;", "navigator", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class MainActivity extends AbstractActivityC24852m implements BleWhoopStrapService.InterfaceC10005c, InterfaceC23444u {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h whoopSplashState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagRepository;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h appNotificationInitializer;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h globalCoachManager;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC23462h amplitudeEngagementClient;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC23462h deepLinkParser;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC23462h pairingCompletionNavigator;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC23462h companionDeviceInteractor;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final InterfaceC23462h appDestinationHelper;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final InterfaceC23462h launchRedirectGate;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private boolean launchHadDeepLink;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private volatile boolean appNavigatorReady;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final InterfaceC25435a appNavigatorSetupMutex;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final InterfaceC23462h bffBottomNavTabEventPublisher;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private final InterfaceC23462h appNavigator;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private final InterfaceC23462h requiredPermissionHelper;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private AbstractC18545g activityBinding;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private InterfaceC26443b serviceConnectionDisposable;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private boolean serviceHasWhoopStrap;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private Vibrator vibrator;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    private final InterfaceC23462h splashVideoHelper;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    private final InterfaceC23462h applicationCoroutineScope;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    private InterfaceC3027k1 deepLinkJob;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    private final ServiceConnectionC10582r serviceConnection;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h userSessionManager;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h applicationLifecycleListener;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h requiredPermissionTracker;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h whoopStrapSharedPrefs;

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C10550a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f32054a;

        static {
            int[] iArr = new int[EnumC36164i.values().length];
            try {
                iArr[EnumC36164i.AMP_PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC36164i.NAV_DEEPLINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC36164i.ITERABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC36164i.PAIRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC36164i.URI_DEEPLINK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f32054a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$a0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10551a0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32055w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32056x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32057y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10551a0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32055w = componentCallbacks;
            this.f32056x = interfaceC35951a;
            this.f32057y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, vm2.d] */
        @Override // c93.InterfaceC4339a
        public final C36159d invoke() {
            ComponentCallbacks componentCallbacks = this.f32055w;
            InterfaceC35951a interfaceC35951a = this.f32056x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32057y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C36159d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$b */
    @InterfaceC32271e(m100429c = "com.whoop.ui.home.redesign.view.MainActivity$collectLogoutEvents$1", m100430f = "MainActivity.kt", m100431l = {282}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lcom/whoop/domain/model/Logout;", "it", "Ll83/a0;", "<anonymous>", "(Lcom/whoop/domain/model/Logout;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10552b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f32058w;

        public C10552b(InterfaceC30057d<? super C10552b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MainActivity.this.new C10552b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Logout logout, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10552b) create(logout, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws UnsupportedEncodingException {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f32058w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                MainActivity.this.m27313u0().mo34147w();
                InterfaceC39659g interfaceC39659gM27241E0 = MainActivity.this.m27241E0();
                this.f32058w = 1;
                if (interfaceC39659gM27241E0.mo126789a(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            MainActivity.this.m27247H0();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$b0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10553b0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32060w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32061x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32062y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10553b0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32060w = componentCallbacks;
            this.f32061x = interfaceC35951a;
            this.f32062y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, m32.c] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC25007c invoke() {
            ComponentCallbacks componentCallbacks = this.f32060w;
            InterfaceC35951a interfaceC35951a = this.f32061x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32062y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC25007c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$c */
    @InterfaceC32271e(m100429c = "com.whoop.ui.home.redesign.view.MainActivity$collectMfaEnforcementEvents$3", m100430f = "MainActivity.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"", "it", "Ll83/a0;", "<anonymous>", "(Ljava/lang/String;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10554c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f32063w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f32064x;

        public C10554c(InterfaceC30057d<? super C10554c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C10554c c10554c = MainActivity.this.new C10554c(interfaceC30057d);
            c10554c.f32064x = obj;
            return c10554c;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws UnsupportedEncodingException {
            String str = (String) this.f32064x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f32063w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            MainActivity.this.m27300n0().mo59393b(new AbstractC21155m0.c3("enforcement", str));
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10554c) create(str, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$c0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10555c0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32066w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32067x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32068y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10555c0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32066w = componentCallbacks;
            this.f32067x = interfaceC35951a;
            this.f32068y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yr2.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC39736a invoke() {
            ComponentCallbacks componentCallbacks = this.f32066w;
            InterfaceC35951a interfaceC35951a = this.f32067x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32068y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC39736a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$d */
    @InterfaceC32271e(m100429c = "com.whoop.ui.home.redesign.view.MainActivity$collectNavEvents$1", m100430f = "MainActivity.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lxm2/a;", "it", "Ll83/a0;", "<anonymous>", "(Lxm2/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10556d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f32069w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f32070x;

        public C10556d(InterfaceC30057d<? super C10556d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C10556d c10556d = MainActivity.this.new C10556d(interfaceC30057d);
            c10556d.f32070x = obj;
            return c10556d;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC38460a abstractC38460a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10556d) create(abstractC38460a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws UnsupportedEncodingException {
            AbstractC38460a abstractC38460a = (AbstractC38460a) this.f32070x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f32069w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!(abstractC38460a instanceof AbstractC38460a.b)) {
                MainActivity.this.logger.mo85222m("Could not find the navigation event for " + abstractC38460a, new AbstractC30556a.a[0]);
            } else if (MainActivity.this.getIntent().getData() != null) {
                MainActivity.this.m27239D0().m119746o(new AbstractC38461b.a(null));
                MainActivity.this.getIntent().setData(null);
                C36159d c36159dM27300n0 = MainActivity.this.m27300n0();
                AbstractC38460a.b bVar = (AbstractC38460a.b) abstractC38460a;
                C38462c c38462cM123251a = bVar.getAuthParams();
                String strM123253a = c38462cM123251a != null ? c38462cM123251a.getCode() : null;
                C38462c c38462cM123251a2 = bVar.getAuthParams();
                String strM123255c = c38462cM123251a2 != null ? c38462cM123251a2.getState() : null;
                C38462c c38462cM123251a3 = bVar.getAuthParams();
                c36159dM27300n0.mo59393b(new AbstractC21155m0.v4(strM123253a, strM123255c, c38462cM123251a3 != null ? c38462cM123251a3.getScope() : null));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$d0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10557d0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32072w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32073x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32074y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10557d0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32072w = componentCallbacks;
            this.f32073x = interfaceC35951a;
            this.f32074y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [bc3.c0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC2994c0 invoke() {
            ComponentCallbacks componentCallbacks = this.f32072w;
            InterfaceC35951a interfaceC35951a = this.f32073x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32074y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC2994c0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ui.home.redesign.view.MainActivity", m100430f = "MainActivity.kt", m100431l = {640, 315}, m100432m = "ensureAppNavigatorReady", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10558e extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f32076F;

        /* JADX INFO: renamed from: w */
        Object f32077w;

        /* JADX INFO: renamed from: x */
        int f32078x;

        /* JADX INFO: renamed from: y */
        int f32079y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f32080z;

        public C10558e(InterfaceC30057d<? super C10558e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f32080z = obj;
            this.f32076F |= Integer.MIN_VALUE;
            return MainActivity.this.m27297k0(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$e0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10559e0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32081w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32082x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32083y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10559e0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32081w = componentCallbacks;
            this.f32082x = interfaceC35951a;
            this.f32083y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od1.a0] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC27837a0 invoke() {
            ComponentCallbacks componentCallbacks = this.f32081w;
            InterfaceC35951a interfaceC35951a = this.f32082x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32083y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC27837a0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ui.home.redesign.view.MainActivity$handleIntentsWhenNavigatorReady$1", m100430f = "MainActivity.kt", m100431l = {442}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10560f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f32084w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f32085x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Intent f32087z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10560f(Intent intent, InterfaceC30057d<? super C10560f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f32087z = intent;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C10560f c10560f = MainActivity.this.new C10560f(this.f32087z, interfaceC30057d);
            c10560f.f32085x = obj;
            return c10560f;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10560f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f32085x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f32084w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    MainActivity mainActivity = MainActivity.this;
                    this.f32085x = interfaceC2994c0;
                    this.f32084w = 1;
                    if (mainActivity.m27297k0(this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                MainActivity.this.m27249I0(this.f32087z);
            } catch (Exception e5) {
                AbstractC3006f0.m8721o(interfaceC2994c0.getCoroutineContext());
                MainActivity.this.logger.mo85213c("Skipping this intent; app navigator setup failed, will retry on next intent", e5, new AbstractC30556a.a[0]);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$f0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10561f0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32088w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32089x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32090y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10561f0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32088w = componentCallbacks;
            this.f32089x = interfaceC35951a;
            this.f32090y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hj0.e, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC17346e invoke() {
            ComponentCallbacks componentCallbacks = this.f32088w;
            InterfaceC35951a interfaceC35951a = this.f32089x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32090y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC17346e.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$g */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ui.home.redesign.view.MainActivity$handleUriDeeplink$2$1", m100430f = "MainActivity.kt", m100431l = {489}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10562g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f32091w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AndroidUri f32093y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Intent f32094z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10562g(AndroidUri androidUri, Intent intent, InterfaceC30057d<? super C10562g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f32093y = androidUri;
            this.f32094z = intent;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MainActivity.this.new C10562g(this.f32093y, this.f32094z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10562g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f32091w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C36159d c36159dM27300n0 = MainActivity.this.m27300n0();
                AndroidUri androidUri = this.f32093y;
                Intent intent = this.f32094z;
                this.f32091w = 1;
                obj = c36159dM27300n0.m115092C(androidUri, intent, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            if (!(obj instanceof C21139e0)) {
                this.f32094z.setData(null);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$g0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10563g0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32095w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32096x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32097y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10563g0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32095w = componentCallbacks;
            this.f32096x = interfaceC35951a;
            this.f32097y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ll1.b] */
        @Override // c93.InterfaceC4339a
        public final C24502b invoke() {
            ComponentCallbacks componentCallbacks = this.f32095w;
            InterfaceC35951a interfaceC35951a = this.f32096x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32097y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C24502b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$h */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"com/whoop/ui/home/redesign/view/MainActivity$h", "Lg/t;", "Ll83/a0;", "d", "()V", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10564h extends AbstractC14917t {
        public C10564h() {
            super(true);
        }

        @Override // p161g.AbstractC14917t
        /* JADX INFO: renamed from: d */
        public void mo4073d() {
            if (MainActivity.this.m27300n0().m115091B(((C21140f) MainActivity.this.m27307r0().getNavInput().getValue()).getSelectedTabId())) {
                return;
            }
            m43013j(false);
            MainActivity.this.getOnBackPressedDispatcher().m43018d();
            m43013j(true);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$h0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10565h0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32099w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32100x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32101y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10565h0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32099w = componentCallbacks;
            this.f32100x = interfaceC35951a;
            this.f32101y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, q92.h] */
        @Override // c93.InterfaceC4339a
        public final C30076h invoke() {
            ComponentCallbacks componentCallbacks = this.f32099w;
            InterfaceC35951a interfaceC35951a = this.f32100x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32101y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C30076h.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$i */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10566i implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f32102w;

        /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$i$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f32103w;

            /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$i$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.ui.home.redesign.view.MainActivity$monitorForBluetoothPermissions$$inlined$filter$1$2", m100430f = "MainActivity.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41430a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f32105F;

                /* JADX INFO: renamed from: G */
                Object f32106G;

                /* JADX INFO: renamed from: H */
                int f32107H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f32108w;

                /* JADX INFO: renamed from: x */
                int f32109x;

                /* JADX INFO: renamed from: y */
                Object f32110y;

                /* JADX INFO: renamed from: z */
                Object f32111z;

                public C41430a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f32108w = obj;
                    this.f32109x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f32103w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41430a c41430a;
                if (interfaceC30057d instanceof C41430a) {
                    c41430a = (C41430a) interfaceC30057d;
                    int i13 = c41430a.f32109x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41430a.f32109x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41430a = new C41430a(interfaceC30057d);
                    }
                } else {
                    c41430a = new C41430a(interfaceC30057d);
                }
                Object obj2 = c41430a.f32108w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41430a.f32109x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f32103w;
                    if (((Boolean) obj).booleanValue()) {
                        c41430a.f32110y = null;
                        c41430a.f32111z = null;
                        c41430a.f32105F = null;
                        c41430a.f32106G = null;
                        c41430a.f32107H = 0;
                        c41430a.f32109x = 1;
                        if (interfaceC13062m.emit(obj, c41430a) == enumC31071a) {
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

        public C10566i(InterfaceC13058l interfaceC13058l) {
            this.f32102w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f32102w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$i0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10567i0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32112w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32113x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32114y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10567i0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32112w = componentCallbacks;
            this.f32113x = interfaceC35951a;
            this.f32114y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ym2.g] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC39659g invoke() {
            ComponentCallbacks componentCallbacks = this.f32112w;
            InterfaceC35951a interfaceC35951a = this.f32113x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32114y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC39659g.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10568j<T> implements InterfaceC13062m {

        /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$j$a */
        /* JADX INFO: loaded from: classes10.dex */
        @InterfaceC32271e(m100429c = "com.whoop.ui.home.redesign.view.MainActivity$monitorForBluetoothPermissions$3", m100430f = "MainActivity.kt", m100431l = {537}, m100432m = "emit", m100433v = 2)
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32269c {

            /* JADX INFO: renamed from: w */
            boolean f32116w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f32117x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C10568j<T> f32118y;

            /* JADX INFO: renamed from: z */
            int f32119z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(C10568j<? super T> c10568j, InterfaceC30057d<? super a> interfaceC30057d) {
                super(interfaceC30057d);
                this.f32118y = c10568j;
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                this.f32117x = obj;
                this.f32119z |= Integer.MIN_VALUE;
                return this.f32118y.m27326b(false, this);
            }
        }

        public C10568j() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX INFO: renamed from: b */
        public final Object m27326b(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar;
            if (interfaceC30057d instanceof a) {
                aVar = (a) interfaceC30057d;
                int i13 = aVar.f32119z;
                if ((i13 & Integer.MIN_VALUE) != 0) {
                    aVar.f32119z = i13 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, interfaceC30057d);
                }
            } else {
                aVar = new a(this, interfaceC30057d);
            }
            Object objM73347s = aVar.f32117x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = aVar.f32119z;
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM73347s);
                InterfaceC25007c interfaceC25007cM27320y0 = MainActivity.this.m27320y0();
                aVar.f32116w = z4;
                aVar.f32119z = 1;
                objM73347s = InterfaceC25007c.m73347s(interfaceC25007cM27320y0, false, aVar, 1, null);
                if (objM73347s == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM73347s);
            }
            if (((EnumC25009e) objM73347s).werePermissionsGranted() && MainActivity.this.m27243F0().m92195a() != null) {
                BleWhoopStrapService.Companion companion = BleWhoopStrapService.INSTANCE;
                MainActivity mainActivity = MainActivity.this;
                companion.m24627a(mainActivity, mainActivity.serviceConnection, MainActivity.this.m27243F0().m92195a());
            }
            return C23454a0.f92919a;
        }

        @Override // ec3.InterfaceC13062m
        public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
            return m27326b(((Boolean) obj).booleanValue(), interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$j0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10569j0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32120w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32121x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32122y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10569j0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32120w = componentCallbacks;
            this.f32121x = interfaceC35951a;
            this.f32122y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagRepository, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagRepository invoke() {
            ComponentCallbacks componentCallbacks = this.f32120w;
            InterfaceC35951a interfaceC35951a = this.f32121x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32122y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagRepository.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$k */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class RunnableC10570k implements Runnable {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC3025k f32123w;

        public RunnableC10570k(InterfaceC3025k interfaceC3025k) {
            this.f32123w = interfaceC3025k;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f32123w.resumeWith(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$k0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10571k0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32124w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32125x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32126y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10571k0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32124w = componentCallbacks;
            this.f32125x = interfaceC35951a;
            this.f32126y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.service.push.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C9984a invoke() {
            ComponentCallbacks componentCallbacks = this.f32124w;
            InterfaceC35951a interfaceC35951a = this.f32125x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32126y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9984a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$l */
    @InterfaceC32271e(m100429c = "com.whoop.ui.home.redesign.view.MainActivity$onActivityCreated$2", m100430f = "MainActivity.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10572l extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f32127w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f32128x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f32130z;

        /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$l$a */
        @InterfaceC32271e(m100429c = "com.whoop.ui.home.redesign.view.MainActivity$onActivityCreated$2$1", m100430f = "MainActivity.kt", m100431l = {239}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f32131w;

            /* JADX INFO: renamed from: x */
            private /* synthetic */ Object f32132x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ MainActivity f32133y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ boolean f32134z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MainActivity mainActivity, boolean z4, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f32133y = mainActivity;
                this.f32134z = z4;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f32133y, this.f32134z, interfaceC30057d);
                aVar.f32132x = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) throws UnsupportedEncodingException {
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f32132x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f32131w;
                try {
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        MainActivity mainActivity = this.f32133y;
                        this.f32132x = interfaceC2994c0;
                        this.f32131w = 1;
                        if (mainActivity.m27297k0(this) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                } catch (Exception e5) {
                    AbstractC3006f0.m8721o(interfaceC2994c0.getCoroutineContext());
                    this.f32133y.logger.mo85230v("App navigator setup failed", e5, new AbstractC30556a.a[0]);
                }
                this.f32133y.m27281Y0(this.f32134z);
                if (!this.f32134z) {
                    this.f32133y.m27315v0().m115106c();
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10572l(boolean z4, InterfaceC30057d<? super C10572l> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f32130z = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C10572l c10572l = MainActivity.this.new C10572l(this.f32130z, interfaceC30057d);
            c10572l.f32128x = obj;
            return c10572l;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10572l) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f32128x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f32127w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new a(MainActivity.this, this.f32130z, null), 3);
            MainActivity.this.m27291e0(interfaceC2994c0);
            MainActivity.this.m27284a0(interfaceC2994c0);
            MainActivity.this.m27286b0(interfaceC2994c0);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$l0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10573l0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32135w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32136x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32137y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10573l0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32135w = componentCallbacks;
            this.f32136x = interfaceC35951a;
            this.f32137y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [dp0.g, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC12251g invoke() {
            ComponentCallbacks componentCallbacks = this.f32135w;
            InterfaceC35951a interfaceC35951a = this.f32136x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32137y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC12251g.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$m */
    @InterfaceC32271e(m100429c = "com.whoop.ui.home.redesign.view.MainActivity$onCreate$3", m100430f = "MainActivity.kt", m100431l = {187}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10574m extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f32138w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f32140y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10574m(boolean z4, InterfaceC30057d<? super C10574m> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f32140y = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MainActivity.this.new C10574m(this.f32140y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10574m) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f32138w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                MainActivity mainActivity = MainActivity.this;
                boolean z4 = this.f32140y;
                this.f32138w = 1;
                if (mainActivity.m27265Q0(z4, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$m0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10575m0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32141w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32142x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32143y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10575m0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32141w = componentCallbacks;
            this.f32142x = interfaceC35951a;
            this.f32143y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [ei0.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC13218a invoke() {
            ComponentCallbacks componentCallbacks = this.f32141w;
            InterfaceC35951a interfaceC35951a = this.f32142x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32143y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC13218a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$n */
    @InterfaceC32271e(m100429c = "com.whoop.ui.home.redesign.view.MainActivity$onCreate$5", m100430f = "MainActivity.kt", m100431l = {199, 200}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10576n extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f32144w;

        public C10576n(InterfaceC30057d<? super C10576n> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MainActivity.this.new C10576n(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10576n) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
        
            if (r5.m27261O0(r4) == r0) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r4.f32144w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r5)
                goto L39
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L2e
            L1c:
                p505ts.AbstractC34132o.m107864I(r5)
                com.whoop.ui.home.redesign.view.MainActivity r5 = com.whoop.p069ui.home.redesign.view.MainActivity.this
                ym2.g r5 = com.whoop.p069ui.home.redesign.view.MainActivity.m27262P(r5)
                r4.f32144w = r3
                java.lang.Object r5 = r5.mo126789a(r4)
                if (r5 != r0) goto L2e
                goto L38
            L2e:
                com.whoop.ui.home.redesign.view.MainActivity r5 = com.whoop.p069ui.home.redesign.view.MainActivity.this
                r4.f32144w = r2
                java.lang.Object r5 = com.whoop.p069ui.home.redesign.view.MainActivity.m27270T(r5, r4)
                if (r5 != r0) goto L39
            L38:
                return r0
            L39:
                l83.a0 r5 = l83.C23454a0.f92919a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.p069ui.home.redesign.view.MainActivity.C10576n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$n0 */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10577n0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32146w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10577n0(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f32146w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f32146w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$o */
    @InterfaceC32271e(m100429c = "com.whoop.ui.home.redesign.view.MainActivity$onSplashFinished$1", m100430f = "MainActivity.kt", m100431l = {358}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10578o extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f32147w;

        public C10578o(InterfaceC30057d<? super C10578o> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MainActivity.this.new C10578o(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10578o) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f32147w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    MainActivity mainActivity = MainActivity.this;
                    this.f32147w = 1;
                    if (mainActivity.m27277W0(this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                AbstractC18545g abstractC18545g = MainActivity.this.activityBinding;
                if (abstractC18545g == null) {
                    AbstractC22676k.m65757q("activityBinding");
                    throw null;
                }
                LottieAnimationView splashView = abstractC18545g.f72276e;
                AbstractC22676k.m65749i(splashView, "splashView");
                splashView.setVisibility(8);
                AbstractC18545g abstractC18545g2 = MainActivity.this.activityBinding;
                if (abstractC18545g2 == null) {
                    AbstractC22676k.m65757q("activityBinding");
                    throw null;
                }
                VideoView splashVideoView = abstractC18545g2.f72275d;
                AbstractC22676k.m65749i(splashVideoView, "splashVideoView");
                splashVideoView.setVisibility(8);
                return C23454a0.f92919a;
            } catch (Throwable th3) {
                AbstractC18545g abstractC18545g3 = MainActivity.this.activityBinding;
                if (abstractC18545g3 == null) {
                    AbstractC22676k.m65757q("activityBinding");
                    throw null;
                }
                LottieAnimationView splashView2 = abstractC18545g3.f72276e;
                AbstractC22676k.m65749i(splashView2, "splashView");
                splashView2.setVisibility(8);
                AbstractC18545g abstractC18545g4 = MainActivity.this.activityBinding;
                if (abstractC18545g4 == null) {
                    AbstractC22676k.m65757q("activityBinding");
                    throw null;
                }
                VideoView splashVideoView2 = abstractC18545g4.f72275d;
                AbstractC22676k.m65749i(splashVideoView2, "splashVideoView");
                splashVideoView2.setVisibility(8);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$o0 */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10579o0 extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32149w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32150x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32151y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f32152z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10579o0(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f32149w = componentCallbacks;
            this.f32150x = interfaceC35951a;
            this.f32151y = interfaceC4339a;
            this.f32152z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, wm2.b] */
        @Override // c93.InterfaceC4339a
        public final C37392b invoke() {
            return AbstractC34132o.m107857B(this.f32149w, this.f32150x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37392b.class), this.f32151y, this.f32152z);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$p */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.ui.home.redesign.view.MainActivity$onSplashFinished$2", m100430f = "MainActivity.kt", m100431l = {370}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10580p extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f32153w;

        public C10580p(InterfaceC30057d<? super C10580p> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MainActivity.this.new C10580p(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10580p) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f32153w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                MainActivity mainActivity = MainActivity.this;
                this.f32153w = 1;
                if (mainActivity.m27277W0(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$q */
    @InterfaceC32271e(m100429c = "com.whoop.ui.home.redesign.view.MainActivity", m100430f = "MainActivity.kt", m100431l = {380, 381, 388}, m100432m = "routeAuthenticatedUserViaAppDestination", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10581q extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f32156F;

        /* JADX INFO: renamed from: w */
        boolean f32157w;

        /* JADX INFO: renamed from: x */
        Object f32158x;

        /* JADX INFO: renamed from: y */
        int f32159y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f32160z;

        public C10581q(InterfaceC30057d<? super C10581q> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f32160z = obj;
            this.f32156F |= Integer.MIN_VALUE;
            return MainActivity.this.m27277W0(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$r */
    @Metadata(m65680d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"com/whoop/ui/home/redesign/view/MainActivity$r", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "className", "Landroid/os/IBinder;", NotificationCompat.CATEGORY_SERVICE, "Ll83/a0;", "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "name", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class ServiceConnectionC10582r implements ServiceConnection {
        public ServiceConnectionC10582r() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName className, IBinder service) {
            AbstractC22676k.m65750j(className, "className");
            AbstractC22676k.m65750j(service, "service");
            try {
                BleWhoopStrapService.BinderC10003a binderC10003a = (BleWhoopStrapService.BinderC10003a) service;
                MainActivity mainActivity = MainActivity.this;
                mainActivity.serviceConnectionDisposable = binderC10003a.m24623c(mainActivity);
                if (MainActivity.this.serviceHasWhoopStrap) {
                    return;
                }
                binderC10003a.m24626h(MainActivity.this.m27243F0().m92195a());
            } catch (ClassCastException e5) {
                MainActivity.this.logger.mo85218i("Issue with strap service connection", e5, new AbstractC30556a.a[0]);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            AbstractC22676k.m65750j(name, "name");
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$s */
    @InterfaceC32271e(m100429c = "com.whoop.ui.home.redesign.view.MainActivity", m100430f = "MainActivity.kt", m100431l = {304}, m100432m = "setupAppNavigator", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10583s extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f32162w;

        /* JADX INFO: renamed from: y */
        int f32164y;

        public C10583s(InterfaceC30057d<? super C10583s> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f32162w = obj;
            this.f32164y |= Integer.MIN_VALUE;
            return MainActivity.this.m27279X0(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$t */
    @InterfaceC32271e(m100429c = "com.whoop.ui.home.redesign.view.MainActivity$setupView$1", m100430f = "MainActivity.kt", m100431l = {223}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10584t extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f32165w;

        public C10584t(InterfaceC30057d<? super C10584t> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MainActivity.this.new C10584t(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10584t) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f32165w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC39736a interfaceC39736aM27236B0 = MainActivity.this.m27236B0();
                this.f32165w = 1;
                if (interfaceC39736aM27236B0.mo127149b(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$u */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10585u extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32167w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32168x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32169y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10585u(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32167w = componentCallbacks;
            this.f32168x = interfaceC35951a;
            this.f32169y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [h92.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C17029a invoke() {
            ComponentCallbacks componentCallbacks = this.f32167w;
            InterfaceC35951a interfaceC35951a = this.f32168x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32169y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17029a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$v */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10586v extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32170w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32171x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32172y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10586v(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32170w = componentCallbacks;
            this.f32171x = interfaceC35951a;
            this.f32172y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.s0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C21167s0 invoke() {
            ComponentCallbacks componentCallbacks = this.f32170w;
            InterfaceC35951a interfaceC35951a = this.f32171x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32172y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21167s0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$w */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10587w extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32173w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32174x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32175y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10587w(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32173w = componentCallbacks;
            this.f32174x = interfaceC35951a;
            this.f32175y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, zs0.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC41076a invoke() {
            ComponentCallbacks componentCallbacks = this.f32173w;
            InterfaceC35951a interfaceC35951a = this.f32174x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32175y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC41076a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$x */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10588x extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32176w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32177x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32178y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10588x(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32176w = componentCallbacks;
            this.f32177x = interfaceC35951a;
            this.f32178y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, vm2.b] */
        @Override // c93.InterfaceC4339a
        public final C36157b invoke() {
            ComponentCallbacks componentCallbacks = this.f32176w;
            InterfaceC35951a interfaceC35951a = this.f32177x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32178y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C36157b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$y */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10589y extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32179w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32180x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32181y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10589y(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32179w = componentCallbacks;
            this.f32180x = interfaceC35951a;
            this.f32181y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, vm2.j] */
        @Override // c93.InterfaceC4339a
        public final C36165j invoke() {
            ComponentCallbacks componentCallbacks = this.f32179w;
            InterfaceC35951a interfaceC35951a = this.f32180x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32181y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C36165j.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.home.redesign.view.MainActivity$z */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10590z extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32182w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32183x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32184y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10590z(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32182w = componentCallbacks;
            this.f32183x = interfaceC35951a;
            this.f32184y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.e, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C21138e invoke() {
            ComponentCallbacks componentCallbacks = this.f32182w;
            InterfaceC35951a interfaceC35951a = this.f32183x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32184y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21138e.class), interfaceC35951a);
        }
    }

    public MainActivity() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.userSessionManager = AbstractC30060g.m92087G(enumC23463i, new C10559e0(this, null, null));
        this.applicationLifecycleListener = AbstractC30060g.m92087G(enumC23463i, new C10561f0(this, null, null));
        this.requiredPermissionTracker = AbstractC30060g.m92087G(enumC23463i, new C10563g0(this, null, null));
        this.whoopStrapSharedPrefs = AbstractC30060g.m92087G(enumC23463i, new C10565h0(this, null, null));
        this.whoopSplashState = AbstractC30060g.m92087G(enumC23463i, new C10567i0(this, null, null));
        this.featureFlagRepository = AbstractC30060g.m92087G(enumC23463i, new C10569j0(this, null, null));
        this.appNotificationInitializer = AbstractC30060g.m92087G(enumC23463i, new C10571k0(this, null, null));
        this.globalCoachManager = AbstractC30060g.m92087G(enumC23463i, new C10573l0(this, null, null));
        this.amplitudeEngagementClient = AbstractC30060g.m92087G(enumC23463i, new C10575m0(this, null, null));
        this.deepLinkParser = AbstractC30060g.m92087G(enumC23463i, new C10585u(this, null, null));
        this.pairingCompletionNavigator = AbstractC30060g.m92087G(enumC23463i, new C10586v(this, null, null));
        this.companionDeviceInteractor = AbstractC30060g.m92087G(enumC23463i, new C10587w(this, null, new C39654b(this, 0)));
        this.appDestinationHelper = AbstractC30060g.m92087G(enumC23463i, new C10588x(this, null, null));
        this.launchRedirectGate = AbstractC30060g.m92087G(enumC23463i, new C10589y(this, null, null));
        this.appNavigatorSetupMutex = AbstractC25438d.m74669a();
        this.bffBottomNavTabEventPublisher = AbstractC30060g.m92087G(enumC23463i, new C10590z(this, null, null));
        this.appNavigator = AbstractC30060g.m92087G(enumC23463i, new C10551a0(this, null, new C39654b(this, 1)));
        this.requiredPermissionHelper = AbstractC30060g.m92087G(enumC23463i, new C10553b0(this, new C35953c("required-permissions-helper"), new C39654b(this, 2)));
        this.viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10579o0(this, null, new C10577n0(this), null));
        this.logger = InterfaceC34116n.INSTANCE.m107848a("MainActivity");
        this.serviceConnectionDisposable = EnumC30025d.f122538w;
        this.splashVideoHelper = AbstractC30060g.m92087G(enumC23463i, new C10555c0(this, null, null));
        this.applicationCoroutineScope = AbstractC30060g.m92087G(enumC23463i, new C10557d0(this, null, null));
        this.serviceConnection = new ServiceConnectionC10582r();
    }

    /* JADX INFO: renamed from: A0 */
    private final C24502b m27234A0() {
        return (C24502b) this.requiredPermissionTracker.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public final InterfaceC39736a m27236B0() {
        return (InterfaceC39736a) this.splashVideoHelper.getValue();
    }

    /* JADX INFO: renamed from: C0 */
    private final InterfaceC27837a0 m27237C0() {
        return (InterfaceC27837a0) this.userSessionManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public final C37392b m27239D0() {
        return (C37392b) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public final InterfaceC39659g m27241E0() {
        return (InterfaceC39659g) this.whoopSplashState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public final C30076h m27243F0() {
        return (C30076h) this.whoopStrapSharedPrefs.getValue();
    }

    /* JADX INFO: renamed from: G0 */
    private final void m27245G0() throws UnsupportedEncodingException {
        boolean zIsFeatureEnabled = m27311t0().isFeatureEnabled("pop-to-home-graph");
        int i13 = zIsFeatureEnabled ? AbstractC17307e.f66568E2 : AbstractC17307e.f66562D2;
        this.logger.mo85228t("POP_TO_HOME_GRAPH enabled=" + zIsFeatureEnabled + ", popUpToId=" + i13, new AbstractC30556a.a[0]);
        m27300n0().mo59393b(new AbstractC21155m0.d(Integer.valueOf(i13), null, null, 6, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public final void m27247H0() throws UnsupportedEncodingException {
        m27309s0().mo41836c();
        m27245G0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public final void m27249I0(Intent intent) throws UnsupportedEncodingException {
        if (intent == null) {
            return;
        }
        InterfaceC3027k1 interfaceC3027k1 = this.deepLinkJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        EnumC36164i enumC36164iM115103a = C36163h.f154739a.m115103a(intent);
        int i13 = enumC36164iM115103a == null ? -1 : C10550a.f32054a[enumC36164iM115103a.ordinal()];
        if (i13 != -1) {
            if (i13 == 1) {
                m27298l0().mo37118b(intent);
                return;
            }
            if (i13 != 2) {
                if (i13 == 3) {
                    m27253K0(intent);
                } else if (i13 == 4) {
                    m27255L0(intent);
                } else {
                    if (i13 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    m27257M0(intent);
                }
            }
        }
    }

    /* JADX INFO: renamed from: J0 */
    private final void m27251J0(Intent intent) {
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C10560f(intent, null), 3);
    }

    /* JADX INFO: renamed from: K0 */
    private final void m27253K0(Intent intent) {
        String stringExtra = intent.getStringExtra("iterableNavType");
        if (stringExtra == null || stringExtra.length() == 0) {
            return;
        }
        intent.removeExtra("iterableNavType");
        EnumC26479a enumC26479aM78502t = C26480b.m78502t((C26480b) AbstractC29125c.m88492A(this).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C26480b.class), null), stringExtra, AbstractC12350b.m34597r(this, AbstractC17307e.f66639Q1), false, m27300n0(), 4, null);
        this.logger.mo85228t("forwarded iterable navigation resulted in " + enumC26479aM78502t, new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: L0 */
    private final void m27255L0(Intent intent) {
        String stringExtra = intent.getStringExtra("pairing_completion_destination");
        if (stringExtra == null || stringExtra.length() == 0) {
            return;
        }
        intent.removeExtra("pairing_completion_destination");
        m27318x0().m59411a(stringExtra, m27300n0());
    }

    /* JADX INFO: renamed from: M0 */
    private final void m27257M0(Intent intent) throws UnsupportedEncodingException {
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        String path = data.getPath();
        if (path != null) {
            int iHashCode = path.hashCode();
            if (iHashCode != -1214617345) {
                if (iHashCode == -973618307 && path.equals("stress-session")) {
                    String stringExtra = intent.getStringExtra("sessionType");
                    if (stringExtra == null) {
                        stringExtra = data.getQueryParameter("sessionType");
                    }
                    if (stringExtra != null) {
                        m27300n0().mo59393b(new AbstractC21155m0.z4(stringExtra));
                        intent.setData(null);
                        return;
                    }
                    return;
                }
            } else if (path.equals("/strava_integration")) {
                m27239D0().m119746o(new AbstractC38461b.a(intent.getData()));
                return;
            }
        }
        AndroidUri androidUri = WhoopUri.INSTANCE.parse(data);
        if (androidUri != null) {
            if (C17029a.INSTANCE.m48093a(androidUri)) {
                AbstractC18545g abstractC18545g = this.activityBinding;
                if (abstractC18545g == null) {
                    AbstractC22676k.m65757q("activityBinding");
                    throw null;
                }
                LottieAnimationView splashView = abstractC18545g.f72276e;
                AbstractC22676k.m65749i(splashView, "splashView");
                splashView.setVisibility(8);
                AbstractC18545g abstractC18545g2 = this.activityBinding;
                if (abstractC18545g2 == null) {
                    AbstractC22676k.m65757q("activityBinding");
                    throw null;
                }
                VideoView splashVideoView = abstractC18545g2.f72275d;
                AbstractC22676k.m65749i(splashVideoView, "splashVideoView");
                splashVideoView.setVisibility(8);
            }
            this.deepLinkJob = AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C10562g(androidUri, intent, null), 3);
        }
    }

    /* JADX INFO: renamed from: N0 */
    private final void m27259N0() {
        getOnBackPressedDispatcher().m43015a(this, new C10564h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public final Object m27261O0(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objCollect = new C10566i(m27234A0().getShouldRequestPermissionFlow()).collect(new C10568j(), interfaceC30057d);
        return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: P0 */
    private final Object m27263P0(AbstractC21155m0 abstractC21155m0, boolean z4, boolean z13, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws UnsupportedEncodingException {
        if (z4) {
            m27300n0().m115097M(abstractC21155m0);
        } else {
            m27300n0().mo59393b(abstractC21155m0);
        }
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!z13) {
            return c23454a0;
        }
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        AbstractC18545g abstractC18545g = this.activityBinding;
        if (abstractC18545g == null) {
            AbstractC22676k.m65757q("activityBinding");
            throw null;
        }
        abstractC18545g.getRoot().post(new RunnableC10570k(c3033m));
        Object objM8773r = c3033m.m8773r();
        return objM8773r == EnumC31071a.f128113w ? objM8773r : c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public final Object m27265Q0(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C10572l c10572l = new C10572l(z4, null);
        C3000d2 c3000d2 = new C3000d2(interfaceC30057d.getContext(), interfaceC30057d, 0);
        Object objM36266c0 = AbstractC12889b.m36266c0(c3000d2, true, c3000d2, c10572l);
        return objM36266c0 == EnumC31071a.f128113w ? objM36266c0 : C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final C23454a0 m27267R0(MainActivity mainActivity, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC40896a.m132551c(mainActivity.m27300n0(), null, c28655q, 0, 2);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: S0 */
    private final void m27269S0(ValueAnimator valueAnimator) throws UnsupportedEncodingException {
        if (valueAnimator.getAnimatedFraction() == 1.0f) {
            m27273U0(this, false, 1, null);
        }
    }

    /* JADX INFO: renamed from: T0 */
    private final void m27271T0(boolean isFirstCreate) throws UnsupportedEncodingException {
        m27241E0().mo126790b(true);
        if (m27237C0().mo83921q() == null) {
            m27247H0();
            return;
        }
        if (isFirstCreate && m27311t0().isFeatureEnabled(OnboardingFeatureFlag.FIX_HOME_FLASH_ON_REENTRY)) {
            AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C10578o(null), 3);
            return;
        }
        AbstractC18545g abstractC18545g = this.activityBinding;
        if (abstractC18545g == null) {
            AbstractC22676k.m65757q("activityBinding");
            throw null;
        }
        LottieAnimationView splashView = abstractC18545g.f72276e;
        AbstractC22676k.m65749i(splashView, "splashView");
        splashView.setVisibility(8);
        AbstractC18545g abstractC18545g2 = this.activityBinding;
        if (abstractC18545g2 == null) {
            AbstractC22676k.m65757q("activityBinding");
            throw null;
        }
        VideoView splashVideoView = abstractC18545g2.f72275d;
        AbstractC22676k.m65749i(splashVideoView, "splashVideoView");
        splashVideoView.setVisibility(8);
        if (isFirstCreate) {
            AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C10580p(null), 3);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ void m27273U0(MainActivity mainActivity, boolean z4, int i13, Object obj) throws UnsupportedEncodingException {
        if ((i13 & 1) != 0) {
            z4 = true;
        }
        mainActivity.m27271T0(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final C34911a m27275V0(MainActivity mainActivity) {
        return AbstractC15751g.m44431K(mainActivity.getActivityResultRegistry(), ((C31511a) AbstractC29125c.m88492A(mainActivity).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C31511a.class), null)).m97091a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (m27263P0(r3, r10, r2, r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a5, code lost:
    
        if (m27263P0(r10, true, r2, r0) == r1) goto L42;
     */
    /* JADX INFO: renamed from: W0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m27277W0(q83.InterfaceC30057d<? super l83.C23454a0> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.whoop.p069ui.home.redesign.view.MainActivity.C10581q
            if (r0 == 0) goto L13
            r0 = r10
            com.whoop.ui.home.redesign.view.MainActivity$q r0 = (com.whoop.p069ui.home.redesign.view.MainActivity.C10581q) r0
            int r1 = r0.f32156F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32156F = r1
            goto L18
        L13:
            com.whoop.ui.home.redesign.view.MainActivity$q r0 = new com.whoop.ui.home.redesign.view.MainActivity$q
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f32160z
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f32156F
            r3 = 3
            r4 = 2
            l83.a0 r5 = l83.C23454a0.f92919a
            r6 = 1
            if (r2 == 0) goto L49
            if (r2 == r6) goto L43
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r0 = r0.f32158x
            j02.m0 r0 = (j02.AbstractC21155m0) r0
        L2f:
            p505ts.AbstractC34132o.m107864I(r10)     // Catch: java.lang.Throwable -> L33
            goto L82
        L33:
            r10 = move-exception
            goto La8
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3e:
            java.lang.Object r0 = r0.f32158x
            vm2.g r0 = (vm2.C36162g) r0
            goto L2f
        L43:
            boolean r2 = r0.f32157w
            p505ts.AbstractC34132o.m107864I(r10)     // Catch: java.lang.Throwable -> L33
            goto L65
        L49:
            p505ts.AbstractC34132o.m107864I(r10)
            com.whoop.data.repositories.FeatureFlagRepository r10 = r9.m27311t0()     // Catch: java.lang.Throwable -> L33
            com.whoop.data.repositories.OnboardingFeatureFlag r2 = com.whoop.data.repositories.OnboardingFeatureFlag.FIX_HOME_FLASH_ON_REENTRY     // Catch: java.lang.Throwable -> L33
            boolean r2 = r10.isFeatureEnabled(r2)     // Catch: java.lang.Throwable -> L33
            vm2.b r10 = r9.m27299m0()     // Catch: java.lang.Throwable -> L33
            r0.f32157w = r2     // Catch: java.lang.Throwable -> L33
            r0.f32156F = r6     // Catch: java.lang.Throwable -> L33
            java.lang.Object r10 = r10.m115013a(r0)     // Catch: java.lang.Throwable -> L33
            if (r10 != r1) goto L65
            goto La7
        L65:
            vm2.g r10 = (vm2.C36162g) r10     // Catch: java.lang.Throwable -> L33
            r7 = 0
            r8 = 0
            if (r10 == 0) goto L8a
            j02.m0 r3 = r10.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String()     // Catch: java.lang.Throwable -> L33
            boolean r10 = r10.getIsTabRoot()     // Catch: java.lang.Throwable -> L33
            r0.f32158x = r8     // Catch: java.lang.Throwable -> L33
            r0.f32157w = r2     // Catch: java.lang.Throwable -> L33
            r0.f32159y = r7     // Catch: java.lang.Throwable -> L33
            r0.f32156F = r4     // Catch: java.lang.Throwable -> L33
            java.lang.Object r10 = r9.m27263P0(r3, r10, r2, r0)     // Catch: java.lang.Throwable -> L33
            if (r10 != r1) goto L82
            goto La7
        L82:
            vm2.j r10 = r9.m27315v0()
            r10.m115106c()
            return r5
        L8a:
            boolean r10 = r9.launchHadDeepLink     // Catch: java.lang.Throwable -> L33
            if (r10 == 0) goto L8f
            goto L82
        L8f:
            vm2.d r10 = r9.m27300n0()     // Catch: java.lang.Throwable -> L33
            j02.m0 r10 = vm2.C36159d.m115080u(r10, r8, r6, r8)     // Catch: java.lang.Throwable -> L33
            if (r10 == 0) goto L82
            r0.f32158x = r8     // Catch: java.lang.Throwable -> L33
            r0.f32157w = r2     // Catch: java.lang.Throwable -> L33
            r0.f32159y = r7     // Catch: java.lang.Throwable -> L33
            r0.f32156F = r3     // Catch: java.lang.Throwable -> L33
            java.lang.Object r10 = r9.m27263P0(r10, r6, r2, r0)     // Catch: java.lang.Throwable -> L33
            if (r10 != r1) goto L82
        La7:
            return r1
        La8:
            vm2.j r0 = r9.m27315v0()
            r0.m115106c()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.p069ui.home.redesign.view.MainActivity.m27277W0(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: X0 */
    public final Object m27279X0(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C10583s c10583s;
        if (interfaceC30057d instanceof C10583s) {
            c10583s = (C10583s) interfaceC30057d;
            int i13 = c10583s.f32164y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c10583s.f32164y = i13 - Integer.MIN_VALUE;
            } else {
                c10583s = new C10583s(interfaceC30057d);
            }
        } else {
            c10583s = new C10583s(interfaceC30057d);
        }
        Object obj = c10583s.f32162w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c10583s.f32164y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            AbstractC18545g abstractC18545g = this.activityBinding;
            if (abstractC18545g == null) {
                AbstractC22676k.m65757q("activityBinding");
                throw null;
            }
            AbstractComponentCallbacksC1320m0 fragment = abstractC18545g.f72273b.getFragment();
            c10583s.f32164y = 1;
            if (AbstractC17342a.m49084a(fragment, c10583s) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        m27300n0().m115093D();
        m27259N0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public final void m27281Y0(boolean isFirstCreate) throws UnsupportedEncodingException {
        if (m27241E0().mo126791c()) {
            m27271T0(isFirstCreate);
            return;
        }
        try {
            if (m27236B0().mo127151d()) {
                m27287b1();
            } else {
                m27283Z0();
            }
        } catch (Exception unused) {
            m27283Z0();
        }
        AbstractC3006f0.m8732z(m27304p0(), null, null, new C10584t(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C34911a m27282Z(MainActivity mainActivity) {
        return AbstractC15751g.m44431K(mainActivity);
    }

    /* JADX INFO: renamed from: Z0 */
    private final void m27283Z0() {
        AbstractC18545g abstractC18545g = this.activityBinding;
        if (abstractC18545g == null) {
            AbstractC22676k.m65757q("activityBinding");
            throw null;
        }
        VideoView splashVideoView = abstractC18545g.f72275d;
        AbstractC22676k.m65749i(splashVideoView, "splashVideoView");
        splashVideoView.setVisibility(8);
        AbstractC18545g abstractC18545g2 = this.activityBinding;
        if (abstractC18545g2 == null) {
            AbstractC22676k.m65757q("activityBinding");
            throw null;
        }
        LottieAnimationView lottieAnimationView = abstractC18545g2.f72276e;
        lottieAnimationView.f20245E.f124770x.addUpdateListener(new C30398s(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public final void m27284a0(InterfaceC2994c0 scope) {
        AbstractC13091v.m36582H(new C13052j1(m27237C0().getLogoutFlow(), new C10552b(null), 0), scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final void m27285a1(MainActivity mainActivity, ValueAnimator it) throws UnsupportedEncodingException {
        AbstractC22676k.m65750j(it, "it");
        mainActivity.m27269S0(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public final void m27286b0(InterfaceC2994c0 scope) {
        AbstractC13091v.m36582H(new C13052j1(AbstractC39658f.m126788a(((C18259d) AbstractC29125c.m88492A(this).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C18259d.class), null)).getEnforcementEvents(), new C39654b(this, 3), new C39654b(this, 4)), new C10554c(null), 0), scope);
    }

    /* JADX INFO: renamed from: b1 */
    private final void m27287b1() {
        AbstractC18545g abstractC18545g = this.activityBinding;
        if (abstractC18545g == null) {
            AbstractC22676k.m65757q("activityBinding");
            throw null;
        }
        VideoView splashVideoView = abstractC18545g.f72275d;
        AbstractC22676k.m65749i(splashVideoView, "splashVideoView");
        splashVideoView.setVisibility(0);
        AbstractC18545g abstractC18545g2 = this.activityBinding;
        if (abstractC18545g2 == null) {
            AbstractC22676k.m65757q("activityBinding");
            throw null;
        }
        VideoView splashVideoView2 = abstractC18545g2.f72275d;
        AbstractC22676k.m65749i(splashVideoView2, "splashVideoView");
        m27293g0(splashVideoView2);
        AbstractC18545g abstractC18545g3 = this.activityBinding;
        if (abstractC18545g3 == null) {
            AbstractC22676k.m65757q("activityBinding");
            throw null;
        }
        abstractC18545g3.f72275d.start();
        this.logger.mo85228t("Splash video started", new AbstractC30556a.a[0]);
        AbstractC18545g abstractC18545g4 = this.activityBinding;
        if (abstractC18545g4 == null) {
            AbstractC22676k.m65757q("activityBinding");
            throw null;
        }
        LottieAnimationView splashView = abstractC18545g4.f72276e;
        AbstractC22676k.m65749i(splashView, "splashView");
        splashView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final boolean m27288c0(MainActivity mainActivity) {
        return ((FeatureFlagRepository) AbstractC29125c.m88492A(mainActivity).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagRepository.class), null)).isFeatureEnabled(OnboardingFeatureFlag.MFA_DOUBLE_POP);
    }

    /* JADX INFO: renamed from: c1 */
    private final void m27289c1() {
        try {
            List<C23465k> listMo127148a = m27236B0().mo127148a();
            Vibrator vibrator = this.vibrator;
            if (vibrator != null) {
                List<C23465k> list = listMo127148a;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((Number) ((C23465k) it.next()).f92937w).longValue()));
                }
                long[] jArrM74095E1 = AbstractC25265s.m74095E1(arrayList);
                List<C23465k> list2 = listMo127148a;
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                Iterator<T> it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(Integer.valueOf(((Number) ((C23465k) it3.next()).f92938x).intValue()));
                }
                vibrator.vibrate(VibrationEffect.createWaveform(jArrM74095E1, AbstractC25265s.m74091C1(arrayList2), -1));
            }
            this.logger.mo85228t("Haptics triggered for splash video", new AbstractC30556a.a[0]);
        } catch (Exception e5) {
            this.logger.mo85218i("Failed to trigger haptics for splash video", e5, new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final boolean m27290d0(MainActivity mainActivity) {
        int i13 = AbstractC17307e.f66639Q1;
        AbstractC22676k.m65750j(mainActivity, "<this>");
        C12977n0 c12977n0M36394i = AbstractC12350b.m34597r(mainActivity, i13).m36394i();
        return c12977n0M36394i != null && c12977n0M36394i.f44819H == AbstractC17307e.f66729e3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public final void m27291e0(InterfaceC2994c0 scope) {
        AbstractC13091v.m36582H(new C13052j1(m27239D0().getNavigationEvents(), new C10556d(null), 0), scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C34911a m27292f0(MainActivity mainActivity) {
        return AbstractC15751g.m44431K(mainActivity.getSystemService(CompanionDeviceManager.class));
    }

    /* JADX INFO: renamed from: g0 */
    private final void m27293g0(VideoView videoView) {
        videoView.setVisibility(0);
        videoView.setHapticFeedbackEnabled(true);
        videoView.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: ym2.c
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i13, int i14) {
                return MainActivity.m27294h0(this.f170607a, mediaPlayer, i13, i14);
            }
        });
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: ym2.d
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) throws UnsupportedEncodingException {
                MainActivity.m27295i0(this.f170608a, mediaPlayer);
            }
        });
        videoView.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: ym2.e
            @Override // android.media.MediaPlayer.OnInfoListener
            public final boolean onInfo(MediaPlayer mediaPlayer, int i13, int i14) {
                return MainActivity.m27296j0(this.f170609a, mediaPlayer, i13, i14);
            }
        });
        videoView.setVideoURI(Uri.parse("android.resource://" + getApplicationContext().getPackageName() + "/" + AbstractC17311i.f66912i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final boolean m27294h0(MainActivity mainActivity, MediaPlayer mediaPlayer, int i13, int i14) throws UnsupportedEncodingException {
        m27273U0(mainActivity, false, 1, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final void m27295i0(MainActivity mainActivity, MediaPlayer mediaPlayer) throws UnsupportedEncodingException {
        Vibrator vibrator = mainActivity.vibrator;
        if (vibrator != null) {
            vibrator.cancel();
        }
        m27273U0(mainActivity, false, 1, null);
        mainActivity.m27236B0().mo127150c("complete");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final boolean m27296j0(MainActivity mainActivity, MediaPlayer mediaPlayer, int i13, int i14) {
        if (i13 != 3) {
            return false;
        }
        mainActivity.m27289c1();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: k0 */
    public final Object m27297k0(InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        C10558e c10558e;
        InterfaceC25435a interfaceC25435a;
        int i13;
        InterfaceC25435a interfaceC25435a2;
        Throwable th3;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (interfaceC30057d instanceof C10558e) {
            c10558e = (C10558e) interfaceC30057d;
            int i14 = c10558e.f32076F;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c10558e.f32076F = i14 - Integer.MIN_VALUE;
            } else {
                c10558e = new C10558e(interfaceC30057d);
            }
        } else {
            c10558e = new C10558e(interfaceC30057d);
        }
        Object obj = c10558e.f32080z;
        Object obj2 = EnumC31071a.f128113w;
        int i15 = c10558e.f32076F;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj);
                if (this.appNavigatorReady) {
                    return c23454a0;
                }
                interfaceC25435a = this.appNavigatorSetupMutex;
                c10558e.f32077w = interfaceC25435a;
                c10558e.f32078x = 0;
                c10558e.f32076F = 1;
                if (interfaceC25435a.mo68211b(c10558e) != obj2) {
                    i13 = 0;
                }
                return obj2;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC25435a2 = (InterfaceC25435a) c10558e.f32077w;
                try {
                    AbstractC34132o.m107864I(obj);
                    this.appNavigatorReady = true;
                    interfaceC25435a2.mo68214i(null);
                    return c23454a0;
                } catch (Throwable th4) {
                    th3 = th4;
                    interfaceC25435a2.mo68214i(null);
                    throw th3;
                }
            }
            i13 = c10558e.f32078x;
            InterfaceC25435a interfaceC25435a3 = (InterfaceC25435a) c10558e.f32077w;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a3;
            if (this.appNavigatorReady) {
                interfaceC25435a.mo68214i(null);
                return c23454a0;
            }
            c10558e.f32077w = interfaceC25435a;
            c10558e.f32078x = i13;
            c10558e.f32079y = 0;
            c10558e.f32076F = 2;
            if (m27279X0(c10558e) != obj2) {
                interfaceC25435a2 = interfaceC25435a;
                this.appNavigatorReady = true;
                interfaceC25435a2.mo68214i(null);
                return c23454a0;
            }
            return obj2;
        } catch (Throwable th5) {
            interfaceC25435a2 = interfaceC25435a;
            th3 = th5;
            interfaceC25435a2.mo68214i(null);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: l0 */
    private final InterfaceC13218a m27298l0() {
        return (InterfaceC13218a) this.amplitudeEngagementClient.getValue();
    }

    /* JADX INFO: renamed from: m0 */
    private final C36157b m27299m0() {
        return (C36157b) this.appDestinationHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public final C36159d m27300n0() {
        return (C36159d) this.appNavigator.getValue();
    }

    /* JADX INFO: renamed from: o0 */
    private final C9984a m27302o0() {
        return (C9984a) this.appNotificationInitializer.getValue();
    }

    /* JADX INFO: renamed from: p0 */
    private final InterfaceC2994c0 m27304p0() {
        return (InterfaceC2994c0) this.applicationCoroutineScope.getValue();
    }

    /* JADX INFO: renamed from: q0 */
    private final InterfaceC17346e m27305q0() {
        return (InterfaceC17346e) this.applicationLifecycleListener.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public final C21138e m27307r0() {
        return (C21138e) this.bffBottomNavTabEventPublisher.getValue();
    }

    /* JADX INFO: renamed from: s0 */
    private final InterfaceC41076a m27309s0() {
        return (InterfaceC41076a) this.companionDeviceInteractor.getValue();
    }

    /* JADX INFO: renamed from: t0 */
    private final FeatureFlagRepository m27311t0() {
        return (FeatureFlagRepository) this.featureFlagRepository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public final InterfaceC12251g m27313u0() {
        return (InterfaceC12251g) this.globalCoachManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public final C36165j m27315v0() {
        return (C36165j) this.launchRedirectGate.getValue();
    }

    /* JADX INFO: renamed from: x0 */
    private final C21167s0 m27318x0() {
        return (C21167s0) this.pairingCompletionNavigator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public final InterfaceC25007c m27320y0() {
        return (InterfaceC25007c) this.requiredPermissionHelper.getValue();
    }

    @Override // com.whoop.service.rearchitect.BleWhoopStrapService.InterfaceC10005c
    /* JADX INFO: renamed from: C */
    public void mo13710C(InterfaceC21750d whoopStrap) {
        AbstractC22676k.m65750j(whoopStrap, "whoopStrap");
        whoopStrap.mo104074O();
    }

    @Override // l80.InterfaceC23444u
    /* JADX INFO: renamed from: i */
    public void mo27322i() {
        AbstractC18545g abstractC18545g = this.activityBinding;
        if (abstractC18545g == null) {
            AbstractC22676k.m65757q("activityBinding");
            throw null;
        }
        LottieAnimationView splashView = abstractC18545g.f72276e;
        AbstractC22676k.m65749i(splashView, "splashView");
        splashView.setVisibility(8);
        AbstractC18545g abstractC18545g2 = this.activityBinding;
        if (abstractC18545g2 == null) {
            AbstractC22676k.m65757q("activityBinding");
            throw null;
        }
        VideoView splashVideoView = abstractC18545g2.f72275d;
        AbstractC22676k.m65749i(splashVideoView, "splashVideoView");
        splashVideoView.setVisibility(8);
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        boolean z4 = false;
        boolean z13 = savedInstanceState == null;
        (Build.VERSION.SDK_INT >= 31 ? new C11706c(this) : new C0929d(this)).mo2356p();
        super.onCreate(savedInstanceState);
        getLifecycle().mo4986a(new C17359r(this.logger));
        if (z13) {
            m27307r0().m58980c(InterfaceC21136d.b.f80207a);
            m27315v0().m115105b();
            m27313u0().mo34150z(null);
        }
        if (z13) {
            C36163h c36163h = C36163h.f154739a;
            Intent intent = getIntent();
            AbstractC22676k.m65749i(intent, "getIntent(...)");
            EnumC36164i enumC36164iM115103a = c36163h.m115103a(intent);
            if (enumC36164iM115103a != null && enumC36164iM115103a != EnumC36164i.AMP_PREVIEW) {
                z4 = true;
            }
        }
        this.launchHadDeepLink = z4;
        AbstractC18545g abstractC18545gM53759c = AbstractC18545g.m53759c(getLayoutInflater());
        AbstractC22676k.m65749i(abstractC18545gM53759c, "inflate(...)");
        setContentView(abstractC18545gM53759c.getRoot());
        this.activityBinding = abstractC18545gM53759c;
        this.vibrator = (Vibrator) getSystemService(Vibrator.class);
        AbstractC1613o1.m5020j(this).m4972a(new C10574m(z13, null));
        AbstractC18545g abstractC18545g = this.activityBinding;
        if (abstractC18545g == null) {
            AbstractC22676k.m65757q("activityBinding");
            throw null;
        }
        ComposeView floatingNavComposeView = abstractC18545g.f72272a;
        AbstractC22676k.m65749i(floatingNavComposeView, "floatingNavComposeView");
        AbstractC11814b.m31673c(floatingNavComposeView, new C37816b(new C4065l3(this, 14), true, -1438154309));
        AbstractC18545g abstractC18545g2 = this.activityBinding;
        if (abstractC18545g2 == null) {
            AbstractC22676k.m65757q("activityBinding");
            throw null;
        }
        ComposeView globalCoachOverlayComposeView = abstractC18545g2.f72274c;
        AbstractC22676k.m65749i(globalCoachOverlayComposeView, "globalCoachOverlayComposeView");
        AbstractC11814b.m31673c(globalCoachOverlayComposeView, C39653a.f170603a.m126787b());
        getLifecycle().mo4986a(m27320y0());
        AbstractC1613o1.m5020j(this).m4973b(new C10576n(null));
        m27302o0().m24509a(this);
    }

    @Override // p314m.AbstractActivityC24852m, androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.serviceConnectionDisposable.dispose();
    }

    @Override // p161g.AbstractActivityC14909l, android.app.Activity
    public void onNewIntent(Intent intent) {
        AbstractC22676k.m65750j(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        m27251J0(intent);
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onPause() throws UnsupportedEncodingException {
        super.onPause();
        m27305q0().onActivityPaused(this);
        AbstractC18545g abstractC18545g = this.activityBinding;
        if (abstractC18545g == null) {
            AbstractC22676k.m65757q("activityBinding");
            throw null;
        }
        VideoView splashVideoView = abstractC18545g.f72275d;
        AbstractC22676k.m65749i(splashVideoView, "splashVideoView");
        if (splashVideoView.getVisibility() == 0) {
            Vibrator vibrator = this.vibrator;
            if (vibrator != null) {
                vibrator.cancel();
            }
            m27273U0(this, false, 1, null);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onResume() {
        super.onResume();
        m27305q0().onActivityResumed(this);
        m27251J0(getIntent());
    }

    @Override // com.whoop.service.rearchitect.BleWhoopStrapService.InterfaceC10005c
    /* JADX INFO: renamed from: q */
    public void mo13718q() {
    }

    /* JADX INFO: renamed from: w0 */
    public final InterfaceC21159o0 m27323w0() {
        return m27300n0();
    }
}
