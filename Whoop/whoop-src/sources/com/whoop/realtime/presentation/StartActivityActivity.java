package com.whoop.realtime.presentation;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.ActivityCompat;
import androidx.databinding.AbstractC1168a0;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.C1172c0;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.C1271a;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1633v0;
import as2.AbstractC1953c;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.location.AccuracyLevel;
import com.mapbox.common.location.DeviceLocationProvider;
import com.mapbox.common.location.IntervalSettings;
import com.mapbox.common.location.LocationError;
import com.mapbox.common.location.LocationProvider;
import com.mapbox.common.location.LocationProviderRequest;
import com.mapbox.common.location.LocationService;
import com.mapbox.common.location.LocationServiceFactory;
import com.mapbox.maps.C5489R;
import com.mapbox.maps.ImageHolder;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.Style;
import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.data.repositories.UserRepository;
import com.whoop.p069ui.AbstractC10538f;
import com.whoop.p069ui.LockableNestedScrollView;
import com.whoop.p069ui.WhoopSwitch;
import com.whoop.p069ui.activities.realtime.SportCategory;
import com.whoop.p069ui.views.ColoredImageView;
import com.whoop.realtime.presentation.StartActivityActivity;
import com.whoop.realtime.presentation.views.DayStrainView;
import com.whoop.realtime.presentation.views.StrainCoachGoalPicker;
import com.whoop.realtime.service.C9907b;
import com.whoop.service.network.model.Sport;
import com.whoop.service.network.model.UserState;
import com.whoop.weeklyplan.api.WeeklyPlanApiKt;
import ge3.AbstractC15751g;
import hj0.AbstractActivityC17347f;
import hj0.C17358q;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21153l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import jf3.C21647a;
import k52.AbstractC22206b;
import k52.AbstractC22207c;
import k52.AbstractC22209e;
import k52.AbstractC22210f;
import k52.AbstractC22211g;
import l52.C23359a;
import l73.AbstractC23412c;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23459e;
import l83.InterfaceC23462h;
import live.hms.video.utils.HMSConstantsKt;
import lm2.C24517c;
import lm2.C24518d;
import lm2.InterfaceC24516b;
import lv.C24756a;
import m02.InterfaceC24882a;
import m52.AbstractC25081a;
import m52.AbstractC25093m;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import mm.C25680d;
import n73.InterfaceC26443b;
import nf1.AbstractC26664e;
import nf1.AbstractC26666g;
import nr0.C27072e;
import nu.C27135b;
import nu.InterfaceC27134a;
import nx1.C27219a;
import ny0.C27266m;
import o52.C27554g0;
import o52.C27564l0;
import o52.C27566m0;
import o52.C27572p0;
import o52.C27574q0;
import o52.C27576r0;
import o52.C27578s0;
import o52.C27580t0;
import o52.DialogInterfaceOnClickListenerC27570o0;
import o52.InterfaceC27543b;
import o52.InterfaceC27547d;
import o52.InterfaceC27562k0;
import o52.ViewStubOnInflateListenerC27579t;
import od1.C27843f;
import or2.C28216y;
import or2.C28217y0;
import p031b9.AbstractC2875y;
import p087db.C11845e;
import p088dc.AbstractC11895b;
import p127ev.C13662c;
import p127ev.EnumC13677r;
import p127ev.InterfaceC13669j;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p184h5.C16899o1;
import p184h5.C16905q1;
import p289kv.C22841d;
import p314m.C24836e;
import p314m.C24844i;
import p383ov.C28393o;
import p383ov.InterfaceC28381c;
import p399pb.InterfaceC29049f;
import p406pv.C29572a;
import p432qo.C30523a;
import p470rv.C31833m;
import p479s4.AbstractC32122c;
import p503tp.C34039j;
import p503tp.C34040k;
import p503tp.C34042m;
import p505ts.AbstractC34132o;
import p543v4.C35643b;
import p627xv.C38666g;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.jvm.internal.InterfaceC22666f;
import p92.C29020i;
import pf.AbstractC29125c;
import pg3.C29218v0;
import q52.AbstractC29986d;
import q52.C29984b;
import q73.EnumC30025d;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r73.AbstractC31056a;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import t73.C33589b;
import tr2.InterfaceC34116n;
import tv.C34199b;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import vu.C36500a;
import vu.C36502c;
import vu1.AbstractC36510a;
import wb3.AbstractC37056f;
import xf3.C38266c;
import z82.C40191e;
import z82.InterfaceC40188b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000¾\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 á\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002Õ\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0014¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\t2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J)\u0010&\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00132\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\tH\u0016¢\u0006\u0004\b(\u0010\u0006J\u000f\u0010)\u001a\u00020\tH\u0002¢\u0006\u0004\b)\u0010\u0006J\u0017\u0010,\u001a\u00020\t2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\tH\u0002¢\u0006\u0004\b.\u0010\u0006J\u000f\u0010/\u001a\u00020\tH\u0003¢\u0006\u0004\b/\u0010\u0006J\u000f\u00100\u001a\u00020\tH\u0002¢\u0006\u0004\b0\u0010\u0006J\u000f\u00101\u001a\u00020\tH\u0002¢\u0006\u0004\b1\u0010\u0006J%\u00102\u001a\u00020\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u001b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b2\u00103J\u001d\u00105\u001a\u00020\t2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00100\u001bH\u0002¢\u0006\u0004\b5\u0010\u001eJ\u001d\u00106\u001a\u00020\t2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00100\u001bH\u0002¢\u0006\u0004\b6\u0010\u001eJ\u000f\u00107\u001a\u00020\tH\u0002¢\u0006\u0004\b7\u0010\u0006J\u000f\u00108\u001a\u00020\tH\u0002¢\u0006\u0004\b8\u0010\u0006J\u0017\u0010:\u001a\u00020\t2\u0006\u00109\u001a\u00020*H\u0002¢\u0006\u0004\b:\u0010-J\u000f\u0010;\u001a\u00020\tH\u0002¢\u0006\u0004\b;\u0010\u0006J\u000f\u0010<\u001a\u00020\tH\u0002¢\u0006\u0004\b<\u0010\u0006J\u000f\u0010=\u001a\u00020\tH\u0002¢\u0006\u0004\b=\u0010\u0006J\u000f\u0010>\u001a\u00020\tH\u0002¢\u0006\u0004\b>\u0010\u0006J\u000f\u0010?\u001a\u00020\tH\u0002¢\u0006\u0004\b?\u0010\u0006J\u0010\u0010@\u001a\u00020\tH\u0082@¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020\t2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020\t2\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020\t2\u0006\u0010J\u001a\u00020FH\u0002¢\u0006\u0004\bK\u0010IJ\u0017\u0010M\u001a\u00020\u001f2\u0006\u0010L\u001a\u00020BH\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u00020\t2\u0006\u0010O\u001a\u00020\u001fH\u0002¢\u0006\u0004\bP\u0010\"J\u000f\u0010Q\u001a\u00020\tH\u0002¢\u0006\u0004\bQ\u0010\u0006J\u000f\u0010R\u001a\u00020\tH\u0002¢\u0006\u0004\bR\u0010\u0006J\u000f\u0010S\u001a\u00020\tH\u0002¢\u0006\u0004\bS\u0010\u0006J\u000f\u0010T\u001a\u00020\tH\u0002¢\u0006\u0004\bT\u0010\u0006J\u000f\u0010U\u001a\u00020\tH\u0002¢\u0006\u0004\bU\u0010\u0006J\u000f\u0010V\u001a\u00020\tH\u0002¢\u0006\u0004\bV\u0010\u0006J\u000f\u0010W\u001a\u00020\tH\u0002¢\u0006\u0004\bW\u0010\u0006J\u000f\u0010X\u001a\u00020\tH\u0002¢\u0006\u0004\bX\u0010\u0006J\u000f\u0010Y\u001a\u00020\tH\u0002¢\u0006\u0004\bY\u0010\u0006J\u000f\u0010Z\u001a\u00020\tH\u0002¢\u0006\u0004\bZ\u0010\u0006J\u000f\u0010[\u001a\u00020\tH\u0002¢\u0006\u0004\b[\u0010\u0006R\"\u0010c\u001a\u00020\\8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u0014\u0010g\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u001b\u0010m\u001a\u00020h8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u0018\u0010q\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010t\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0018\u0010x\u001a\u0004\u0018\u00010u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010{\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010}\u001a\u00020n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010pR\u0016\u0010\u007f\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010]R\u0018\u0010\u0081\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010]R\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009d\u0001\u001a\u00030\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0017\u0010 \u0001\u001a\u00030\u009e\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bz\u0010\u009f\u0001R\u001c\u0010¤\u0001\u001a\u0005\u0018\u00010¡\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u001a\u0010¨\u0001\u001a\u00030¥\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u001c\u0010¬\u0001\u001a\u0005\u0018\u00010©\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u001a\u0010°\u0001\u001a\u00030\u00ad\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u0018\u0010²\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b±\u0001\u0010zR\u001a\u0010¶\u0001\u001a\u00030³\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u001a\u0010º\u0001\u001a\u00030·\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u001a\u0010¾\u0001\u001a\u00030»\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R!\u0010Ã\u0001\u001a\n\u0012\u0005\u0012\u00030À\u00010¿\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R\u001a\u0010Ç\u0001\u001a\u00030Ä\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u0018\u0010Ê\u0001\u001a\u00030À\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÈ\u0001\u0010É\u0001R\u0018\u0010Î\u0001\u001a\u00030Ë\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÌ\u0001\u0010Í\u0001R\u0018\u0010Ò\u0001\u001a\u00030Ï\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R\u0018\u0010Ô\u0001\u001a\u00030À\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÓ\u0001\u0010É\u0001R\u0018\u0010Ö\u0001\u001a\u00030À\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÕ\u0001\u0010É\u0001R\u0019\u0010Ù\u0001\u001a\u0004\u0018\u00010\u00138BX\u0082\u0004¢\u0006\b\u001a\u0006\b×\u0001\u0010Ø\u0001R\u0019\u0010Ü\u0001\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÚ\u0001\u0010Û\u0001R\u0018\u0010à\u0001\u001a\u00030Ý\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÞ\u0001\u0010ß\u0001¨\u0006â\u0001"}, m65681d2 = {"Lcom/whoop/realtime/presentation/StartActivityActivity;", "Lhj0/f;", "Lnu/a;", "Lo52/k0;", "Lo52/d;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "onPostCreate", "onStart", "onResume", "onDestroy", "", "p", "()Ljava/lang/String;", "", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "", "permissionsToExplain", "e", "(Ljava/util/List;)V", "", "granted", "b", "(Z)V", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "c", "X0", "Llm2/b;", "addableActivity", "R1", "(Llm2/b;)V", "z1", "B0", "O0", "E1", "N0", "(Ljava/util/List;[I)V", "deniedPermissions", "W1", "Z1", "E0", "K1", "activity", "Z0", "e2", "G0", "F0", "D1", "W0", "i2", "(Lq83/d;)Ljava/lang/Object;", "", "toAlpha", "H0", "(F)V", "", WeeklyPlanApiKt.GOAL, "l2", "(D)V", "estimate", "h2", "goalPercent", "T0", "(F)Z", "value", "Q1", "g2", "f2", "U0", "c1", "a1", "J1", "L1", "I1", "c2", "H1", "C0", "Lcom/mapbox/maps/MapboxMap;", "I", "Lcom/mapbox/maps/MapboxMap;", "getMapboxMap", "()Lcom/mapbox/maps/MapboxMap;", "P1", "(Lcom/mapbox/maps/MapboxMap;)V", "mapboxMap", "Ltr2/n;", "J", "Ltr2/n;", "logger", "Lo52/s0;", "K", "Ll83/h;", "M0", "()Lo52/s0;", "startActivityViewModel", "Landroid/animation/ValueAnimator;", "L", "Landroid/animation/ValueAnimator;", "miniDialCrossfader", "M", "Llm2/b;", "selectedActivity", "Lnu/b;", "N", "Lnu/b;", "permissionsManager", "O", "Z", "gpsPermitted", "P", "mapFader", "Q", "originalButtonContainerBottomPadding", "R", "originalToolbarContainerTopPadding", "Lor2/y;", "S", "Lor2/y;", "externalLinkNavigator", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "T", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "featureFlagRepository", "Lor2/y0;", "U", "Lor2/y0;", "locationServicesHelper", "Lz82/b;", "V", "Lz82/b;", "analyticsManager", "Lod1/f;", "W", "Lod1/f;", "cycleMgr", "Ll52/a;", "X", "Ll52/a;", "mapboxManager", "Lcom/whoop/data/repositories/UserRepository;", "Y", "Lcom/whoop/data/repositories/UserRepository;", "userRepository", "Lm02/a;", "Lm02/a;", "homeNavigator", "Lcom/mapbox/common/location/LocationProvider;", "a0", "Lcom/mapbox/common/location/LocationProvider;", "locationProvider", "Ln73/b;", "b0", "Ln73/b;", "gpsStateDisposable", "Lm52/m;", "c0", "Lm52/m;", "gpsMapBinding", "Lo52/r0;", "d0", "Lo52/r0;", "callback", "e0", "isMapInflated", "Lcom/whoop/realtime/presentation/m;", "f0", "Lcom/whoop/realtime/presentation/m;", "strainCoachController", "Lp92/i;", "g0", "Lp92/i;", "realTimeStreamController", "Lo52/b;", "h0", "Lo52/b;", "activitySelector", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/view/View;", "i0", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bottomSheetBehavior", "Lm52/a;", "j0", "Lm52/a;", "binding", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Landroid/view/View;", "containerView", "Landroid/widget/TextView;", "d", "()Landroid/widget/TextView;", "titleView", "Landroid/widget/ImageView;", "f", "()Landroid/widget/ImageView;", "iconView", "g", "arrowView", "a", "toolbarContainer", "L0", "()Ljava/lang/Integer;", "sportId", "J0", "()Ljava/lang/Boolean;", "autoStartActivity", "Ltp/j;", "K0", "()Ltp/j;", "locationSettingsRequest", "k0", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class StartActivityActivity extends AbstractActivityC17347f implements InterfaceC27134a, InterfaceC27562k0, InterfaceC27547d {

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l0 */
    public static final int f28872l0 = 8;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public MapboxMap mapboxMap;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private ValueAnimator miniDialCrossfader;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private InterfaceC24516b selectedActivity;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private C27135b permissionsManager;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private int originalButtonContainerBottomPadding;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private int originalToolbarContainerTopPadding;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private final C28216y externalLinkNavigator;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private final FeatureFlagRepository featureFlagRepository;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final C28217y0 locationServicesHelper;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private final InterfaceC40188b analyticsManager;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private final C27843f cycleMgr;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private final C23359a mapboxManager;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private final UserRepository userRepository;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private final InterfaceC24882a homeNavigator;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    private LocationProvider locationProvider;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    private InterfaceC26443b gpsStateDisposable;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    private AbstractC25093m gpsMapBinding;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    private C27576r0 callback;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    private boolean isMapInflated;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    private C9889m strainCoachController;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    private C29020i realTimeStreamController;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    private InterfaceC27543b activitySelector;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    private BottomSheetBehavior<View> bottomSheetBehavior;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    private AbstractC25081a binding;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC34116n logger = InterfaceC34116n.INSTANCE.m107848a("StartActivityKotlinActivity");

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC23462h startActivityViewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C9875n(this, null, new C9874m(this), null));

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private boolean gpsPermitted = true;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private ValueAnimator mapFader = new ValueAnimator();

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.StartActivityActivity$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u0014\u0010\u0016\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000eR\u0014\u0010\u0018\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000eR\u0014\u0010\u0019\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000bR\u0014\u0010\u001a\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, m65681d2 = {"Lcom/whoop/realtime/presentation/StartActivityActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lhj0/q;", "a", "(Landroid/content/Context;)Lhj0/q;", "", "REQUEST_LOCATION_SETTINGS", "I", "", "FRAGMENT_TAG", "Ljava/lang/String;", "", "MAP_FADE_MS", "J", "COMPASS_MARGIN", "DEFAULT_INTERVAL_IN_MILLISECONDS", "DEFAULT_MAX_WAIT_TIME", "SPORT_ID_PARAM", "AUTO_START_PARAM", "STRESS_SESSION", "STRESS_SESSION_TYPE", "LOCATION_PERMISSION_REQUEST_CODE", "BLUETOOTH_PERMISSIONS_REQUEST_CODE", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C17358q m24004a(Context context) {
            return new C17358q(context, (Class<?>) StartActivityActivity.class);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.StartActivityActivity$b */
    @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.StartActivityActivity$onActivitySelected$2", m100430f = "StartActivityActivity.kt", m100431l = {751}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9863b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f28901w;

        public C9863b(InterfaceC30057d<? super C9863b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return StartActivityActivity.this.new C9863b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C9863b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f28901w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                StartActivityActivity startActivityActivity = StartActivityActivity.this;
                this.f28901w = 1;
                if (startActivityActivity.m23958i2(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.StartActivityActivity$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, m65681d2 = {"com/whoop/realtime/presentation/StartActivityActivity$c", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animation", "Ll83/a0;", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationRepeat", "onAnimationCancel", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9864c implements Animator.AnimatorListener {
        public C9864c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            AbstractC22676k.m65750j(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            AbstractC22676k.m65750j(animation, "animation");
            AbstractC25081a abstractC25081a = StartActivityActivity.this.binding;
            if (abstractC25081a == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            abstractC25081a.f98268t.setVisibility(8);
            StartActivityActivity.this.miniDialCrossfader = null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            AbstractC22676k.m65750j(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            AbstractC22676k.m65750j(animation, "animation");
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.StartActivityActivity$d */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, m65681d2 = {"com/whoop/realtime/presentation/StartActivityActivity$d", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animation", "Ll83/a0;", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationRepeat", "onAnimationCancel", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9865d implements Animator.AnimatorListener {
        public C9865d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            AbstractC22676k.m65750j(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            AbstractC22676k.m65750j(animation, "animation");
            AbstractC25081a abstractC25081a = StartActivityActivity.this.binding;
            if (abstractC25081a == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            abstractC25081a.f98269u.setVisibility(8);
            StartActivityActivity.this.miniDialCrossfader = null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            AbstractC22676k.m65750j(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            AbstractC22676k.m65750j(animation, "animation");
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.StartActivityActivity$e */
    @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.StartActivityActivity$onMapInit$3", m100430f = "StartActivityActivity.kt", m100431l = {470}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9866e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f28905w;

        public C9866e(InterfaceC30057d<? super C9866e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return StartActivityActivity.this.new C9866e(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C9866e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f28905w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                StartActivityActivity startActivityActivity = StartActivityActivity.this;
                this.f28905w = 1;
                if (startActivityActivity.m23958i2(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.StartActivityActivity$f */
    @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.StartActivityActivity$onPermissionResult$1", m100430f = "StartActivityActivity.kt", m100431l = {558}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9867f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f28907w;

        public C9867f(InterfaceC30057d<? super C9867f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return StartActivityActivity.this.new C9867f(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C9867f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f28907w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                StartActivityActivity startActivityActivity = StartActivityActivity.this;
                this.f28907w = 1;
                if (startActivityActivity.m23958i2(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.StartActivityActivity$g */
    @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.StartActivityActivity$onResume$1", m100430f = "StartActivityActivity.kt", m100431l = {425}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9868g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f28909w;

        public C9868g(InterfaceC30057d<? super C9868g> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return StartActivityActivity.this.new C9868g(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C9868g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f28909w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                StartActivityActivity startActivityActivity = StartActivityActivity.this;
                this.f28909w = 1;
                if (startActivityActivity.m23958i2(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.StartActivityActivity$h */
    @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.StartActivityActivity$onTrackRouteToggle$1", m100430f = "StartActivityActivity.kt", m100431l = {809}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9869h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f28911w;

        public C9869h(InterfaceC30057d<? super C9869h> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return StartActivityActivity.this.new C9869h(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C9869h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f28911w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                StartActivityActivity startActivityActivity = StartActivityActivity.this;
                this.f28911w = 1;
                if (startActivityActivity.m23958i2(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.StartActivityActivity$i */
    @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.StartActivityActivity$onTrackRouteToggle$2", m100430f = "StartActivityActivity.kt", m100431l = {828}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9870i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f28913w;

        public C9870i(InterfaceC30057d<? super C9870i> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return StartActivityActivity.this.new C9870i(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C9870i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f28913w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                StartActivityActivity startActivityActivity = StartActivityActivity.this;
                this.f28913w = 1;
                if (startActivityActivity.m23958i2(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.StartActivityActivity$j */
    @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.StartActivityActivity$promptLocationPermissionDialog$2$1", m100430f = "StartActivityActivity.kt", m100431l = {586}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9871j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f28915w;

        public C9871j(InterfaceC30057d<? super C9871j> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return StartActivityActivity.this.new C9871j(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C9871j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f28915w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                StartActivityActivity startActivityActivity = StartActivityActivity.this;
                this.f28915w = 1;
                if (startActivityActivity.m23958i2(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.StartActivityActivity$k */
    @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.StartActivityActivity$refreshRestingHeartRateForConsistency$1", m100430f = "StartActivityActivity.kt", m100431l = {1178}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9872k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f28917w;

        public C9872k(InterfaceC30057d<? super C9872k> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return StartActivityActivity.this.new C9872k(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C9872k) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f28917w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                UserRepository userRepository = StartActivityActivity.this.userRepository;
                this.f28917w = 1;
                if (userRepository.getRestingHeartRate(true, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.StartActivityActivity$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9873l implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f28919w;

        public C9873l(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f28919w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f28919w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28919w.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.StartActivityActivity$m */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9874m extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28920w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9874m(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f28920w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f28920w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.StartActivityActivity$n */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9875n extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f28921w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28922x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28923y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f28924z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9875n(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f28921w = componentCallbacks;
            this.f28922x = interfaceC35951a;
            this.f28923y = interfaceC4339a;
            this.f28924z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, o52.s0] */
        @Override // c93.InterfaceC4339a
        public final C27578s0 invoke() {
            return AbstractC34132o.m107857B(this.f28921w, this.f28922x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27578s0.class), this.f28923y, this.f28924z);
        }
    }

    /* JADX INFO: renamed from: com.whoop.realtime.presentation.StartActivityActivity$o */
    @InterfaceC32271e(m100429c = "com.whoop.realtime.presentation.StartActivityActivity", m100430f = "StartActivityActivity.kt", m100431l = {844}, m100432m = "updateGpsStatus", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9876o extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        int f28925w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f28926x;

        /* JADX INFO: renamed from: z */
        int f28928z;

        public C9876o(InterfaceC30057d<? super C9876o> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f28926x = obj;
            this.f28928z |= Integer.MIN_VALUE;
            return StartActivityActivity.this.m23958i2(this);
        }
    }

    public StartActivityActivity() {
        C38266c c38266cM88492A = AbstractC29125c.m88492A(this);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        this.externalLinkNavigator = (C28216y) c38266cM88492A.m122602a(null, c22673i0.getOrCreateKotlinClass(C28216y.class), null);
        this.featureFlagRepository = (FeatureFlagRepository) AbstractC29125c.m88492A(this).m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagRepository.class), null);
        this.locationServicesHelper = (C28217y0) AbstractC29125c.m88492A(this).m122602a(null, c22673i0.getOrCreateKotlinClass(C28217y0.class), null);
        this.analyticsManager = (InterfaceC40188b) AbstractC29125c.m88492A(this).m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40188b.class), null);
        this.cycleMgr = (C27843f) AbstractC29125c.m88492A(this).m122602a(null, c22673i0.getOrCreateKotlinClass(C27843f.class), null);
        this.mapboxManager = (C23359a) AbstractC29125c.m88492A(this).m122602a(new C27072e(this, 11), c22673i0.getOrCreateKotlinClass(C23359a.class), null);
        this.userRepository = (UserRepository) AbstractC29125c.m88492A(this).m122602a(null, c22673i0.getOrCreateKotlinClass(UserRepository.class), null);
        this.homeNavigator = (InterfaceC24882a) AbstractC29125c.m88492A(this).m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC24882a.class), null);
        this.gpsStateDisposable = EnumC30025d.f122538w;
    }

    /* JADX INFO: renamed from: A1 */
    private static final C23454a0 m23859A1(C24756a updateSettings) {
        AbstractC22676k.m65750j(updateSettings, "$this$updateSettings");
        updateSettings.f96797a = true;
        updateSettings.f96798b = 8388611;
        updateSettings.f96799c = 16.0f;
        updateSettings.f96800d = 16.0f;
        updateSettings.f96801e = 0.0f;
        updateSettings.f96802f = 0.0f;
        return C23454a0.f92919a;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: B0 */
    private final void m23860B0() {
        m23898O0();
        LocationService orCreate = LocationServiceFactory.getOrCreate();
        AbstractC22676k.m65749i(orCreate, "getOrCreate(...)");
        Expected<LocationError, DeviceLocationProvider> deviceLocationProvider = orCreate.getDeviceLocationProvider(new LocationProviderRequest.Builder().interval(new IntervalSettings.Builder().interval(1000L).maximumInterval(1000L).build()).accuracy(AccuracyLevel.HIGH).build());
        if (deviceLocationProvider.isValue()) {
            this.locationProvider = deviceLocationProvider.getValue();
        }
        C27576r0 c27576r0 = new C27576r0(this);
        this.callback = c27576r0;
        LocationProvider locationProvider = this.locationProvider;
        if (locationProvider != null) {
            Looper mainLooper = Looper.getMainLooper();
            AbstractC22676k.m65749i(mainLooper, "getMainLooper(...)");
            locationProvider.addLocationObserver(c27576r0, mainLooper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B1 */
    public static final C23454a0 m23861B1(InterfaceC28381c gesturesPlugin) {
        AbstractC22676k.m65750j(gesturesPlugin, "$this$gesturesPlugin");
        C28393o c28393o = (C28393o) gesturesPlugin;
        C29572a c29572aM90661b = c28393o.f114558u0.m90661b();
        m23863C1(c29572aM90661b);
        c28393o.f114558u0 = c29572aM90661b.m90660a();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C0 */
    private final void m23862C0() {
        AbstractC25081a abstractC25081a = this.binding;
        if (abstractC25081a == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        CoordinatorLayout coordinatorLayout = abstractC25081a.f98271w;
        C27572p0 c27572p0 = new C27572p0(this);
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16877h0.m47517l(coordinatorLayout, c27572p0);
    }

    /* JADX INFO: renamed from: C1 */
    private static final C23454a0 m23863C1(C29572a updateSettings) {
        AbstractC22676k.m65750j(updateSettings, "$this$updateSettings");
        updateSettings.f120645c = false;
        updateSettings.f120651i = true;
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final C16905q1 m23865D0(StartActivityActivity startActivityActivity, View view, C16905q1 windowInsets) {
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(windowInsets, "windowInsets");
        C16899o1 c16899o1 = windowInsets.f64864a;
        C35643b c35643bMo47530g = c16899o1.mo47530g(1);
        AbstractC22676k.m65749i(c35643bMo47530g, "getInsets(...)");
        C35643b c35643bMo47530g2 = c16899o1.mo47530g(2);
        AbstractC22676k.m65749i(c35643bMo47530g2, "getInsets(...)");
        AbstractC25081a abstractC25081a = startActivityActivity.binding;
        if (abstractC25081a == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        LinearLayout toolbarContainer = abstractC25081a.f98248N;
        AbstractC22676k.m65749i(toolbarContainer, "toolbarContainer");
        toolbarContainer.setPadding(toolbarContainer.getPaddingLeft(), c35643bMo47530g.f151450b + startActivityActivity.originalToolbarContainerTopPadding, toolbarContainer.getPaddingRight(), toolbarContainer.getPaddingBottom());
        AbstractC25081a abstractC25081a2 = startActivityActivity.binding;
        if (abstractC25081a2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        LinearLayout bottomButtonsContainer = abstractC25081a2.f98254f;
        AbstractC22676k.m65749i(bottomButtonsContainer, "bottomButtonsContainer");
        bottomButtonsContainer.setPadding(bottomButtonsContainer.getPaddingLeft(), bottomButtonsContainer.getPaddingTop(), bottomButtonsContainer.getPaddingRight(), c35643bMo47530g2.f151452d + startActivityActivity.originalButtonContainerBottomPadding);
        return windowInsets;
    }

    /* JADX INFO: renamed from: D1 */
    private final void m23866D1() {
        C27578s0 c27578s0M23892M0 = m23892M0();
        AbstractC25081a abstractC25081a = this.binding;
        if (abstractC25081a == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        c27578s0M23892M0.m83281H(abstractC25081a.f98265q.isChecked());
        if (m23892M0().m83278D()) {
            m23884J1();
        }
        InterfaceC24516b interfaceC24516b = this.selectedActivity;
        if ((interfaceC24516b instanceof C24518d) && ((C24518d) interfaceC24516b).m71421k() != null) {
            AbstractC25081a abstractC25081a2 = this.binding;
            if (abstractC25081a2 == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            WhoopSwitch gpsSwitch = abstractC25081a2.f98265q;
            AbstractC22676k.m65749i(gpsSwitch, "gpsSwitch");
            if (gpsSwitch.getVisibility() == 0) {
                InterfaceC24516b interfaceC24516b2 = this.selectedActivity;
                AbstractC22676k.m65748h(interfaceC24516b2, "null cannot be cast to non-null type com.whoop.ui.activities.AddableSport");
                Sport sportM71421k = ((C24518d) interfaceC24516b2).m71421k();
                if (sportM71421k == null || SportCategory.RESTORATIVE == sportM71421k.getCategory()) {
                    AbstractC25081a abstractC25081a3 = this.binding;
                    if (abstractC25081a3 == null) {
                        AbstractC22676k.m65757q("binding");
                        throw null;
                    }
                    abstractC25081a3.f98265q.setThumbColor(getColor(AbstractC22206b.f86248g));
                } else {
                    AbstractC25081a abstractC25081a4 = this.binding;
                    if (abstractC25081a4 == null) {
                        AbstractC22676k.m65757q("binding");
                        throw null;
                    }
                    abstractC25081a4.f98265q.setThumbColor(getColor(AbstractC22206b.f86242a));
                }
                C40191e c40191eM49099s = m49099s();
                InterfaceC24516b interfaceC24516b3 = this.selectedActivity;
                AbstractC22676k.m65748h(interfaceC24516b3, "null cannot be cast to non-null type com.whoop.ui.activities.AddableSport");
                Sport sportM71421k2 = ((C24518d) interfaceC24516b3).m71421k();
                AbstractC22676k.m65747g(sportM71421k2);
                String name = sportM71421k2.getName();
                AbstractC25081a abstractC25081a5 = this.binding;
                if (abstractC25081a5 == null) {
                    AbstractC22676k.m65757q("binding");
                    throw null;
                }
                c40191eM49099s.m128988F0(name, abstractC25081a5.f98265q.isChecked());
            }
        }
        AbstractC25081a abstractC25081a6 = this.binding;
        if (abstractC25081a6 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        if (!abstractC25081a6.f98265q.isChecked()) {
            this.gpsPermitted = false;
            AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C9870i(null), 3);
            return;
        }
        if (AbstractC32122c.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            this.gpsPermitted = true;
            AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C9869h(null), 3);
            m23892M0().m83281H(true);
            m23921W0();
            return;
        }
        if (!ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.ACCESS_FINE_LOCATION")) {
            m23869E1();
            return;
        }
        if (this.permissionsManager == null) {
            this.permissionsManager = new C27135b(this);
        }
        C27135b c27135b = this.permissionsManager;
        AbstractC22676k.m65747g(c27135b);
        c27135b.m81596a(this);
    }

    /* JADX INFO: renamed from: E0 */
    private final void m23868E0() {
        AbstractC25081a abstractC25081a = this.binding;
        if (abstractC25081a == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        boolean zIsChecked = abstractC25081a.f98265q.isChecked();
        boolean z4 = true;
        boolean z13 = AbstractC32122c.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") == 0;
        boolean z14 = !zIsChecked || z13;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 31) {
            boolean z15 = AbstractC32122c.checkSelfPermission(this, "android.permission.BLUETOOTH_SCAN") == 0;
            boolean z16 = AbstractC32122c.checkSelfPermission(this, "android.permission.BLUETOOTH_CONNECT") == 0;
            z4 = z15 && z16;
            this.logger.mo85216g("Bluetooth Check: SCAN granted: " + z15 + ", CONNECT granted: " + z16, new AbstractC30556a.a[0]);
        } else {
            this.logger.mo85216g("Bluetooth Check: Not on Android S+ or permissions not configured as needed by this path.", new AbstractC30556a.a[0]);
        }
        InterfaceC34116n interfaceC34116n = this.logger;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("Permission Check Summary: Location Required: ", ", Location Granted: ", ", Effective Location Granted: ", zIsChecked, z13);
        sbM32002u.append(z14);
        sbM32002u.append(", Bluetooth Granted: ");
        sbM32002u.append(z4);
        interfaceC34116n.mo85216g(sbM32002u.toString(), new AbstractC30556a.a[0]);
        if (z14 && z4) {
            this.logger.mo85216g("All required permissions GRANTED. Proceeding to startActivityInternal.", new AbstractC30556a.a[0]);
            m23940c2();
            return;
        }
        String strM8299l = (!zIsChecked || z13) ? "Missing:" : "Missing: LOCATION";
        if (i13 >= 31 && !z4) {
            strM8299l = AbstractC2875y.m8299l(strM8299l, " BLUETOOTH");
        }
        this.logger.mo85226q(AbstractC11895b.m31996o("checkAllPermissionsAndProceed found missing permissions. ", strM8299l, ". Requesting again."), new AbstractC30556a.a[0]);
        m23887K1();
    }

    /* JADX INFO: renamed from: E1 */
    private final void m23869E1() {
        C24844i c24844i = new C24844i(this, AbstractC22211g.f86543f);
        c24844i.f97324a.f97268m = false;
        c24844i.m72848a(AbstractC22210f.f86471d1);
        c24844i.setPositiveButton(AbstractC22210f.f86450V, new DialogInterfaceOnClickListenerC27570o0(this, 2)).setNegativeButton(AbstractC22210f.f86495l1, new DialogInterfaceOnClickListenerC27570o0(this, 4)).m72850c();
    }

    /* JADX INFO: renamed from: F0 */
    private final void m23871F0() {
        C29020i c29020i = this.realTimeStreamController;
        if (c29020i != null) {
            c29020i.m88252b();
        } else {
            AbstractC22676k.m65757q("realTimeStreamController");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F1 */
    public static final void m23872F1(StartActivityActivity startActivityActivity, DialogInterface dialogInterface, int i13) {
        Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", startActivityActivity.getPackageName(), null));
        AbstractC22676k.m65749i(data, "setData(...)");
        startActivityActivity.startActivity(data);
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: G0 */
    private final void m23874G0() {
        C29020i c29020i = this.realTimeStreamController;
        if (c29020i != null) {
            if (c29020i != null) {
                c29020i.m88251a();
            } else {
                AbstractC22676k.m65757q("realTimeStreamController");
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G1 */
    public static final void m23875G1(StartActivityActivity startActivityActivity, DialogInterface dialogInterface, int i13) {
        startActivityActivity.gpsPermitted = false;
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(startActivityActivity), null, null, startActivityActivity.new C9871j(null), 3);
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: H0 */
    private final void m23877H0(float toAlpha) {
        AbstractC25093m abstractC25093m = this.gpsMapBinding;
        if (abstractC25093m != null) {
            this.mapFader.cancel();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(abstractC25093m.f98343a.getAlpha(), toAlpha);
            AbstractC22676k.m65749i(valueAnimatorOfFloat, "ofFloat(...)");
            this.mapFader = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(400L);
            this.mapFader.addUpdateListener(new C11845e(abstractC25093m, 6));
            this.mapFader.start();
        }
    }

    /* JADX INFO: renamed from: H1 */
    private final void m23878H1() {
        if (this.featureFlagRepository.isFeatureEnabled(FeatureFlagRepositoryKt.START_ACTIVITY_SKIP_COUNTDOWN_TIMER_START_RECORDING)) {
            AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C9872k(null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final void m23880I0(AbstractC25093m abstractC25093m, ValueAnimator animation) {
        AbstractC22676k.m65750j(animation, "animation");
        MapView mapView = abstractC25093m.f98343a;
        Object animatedValue = animation.getAnimatedValue();
        AbstractC22676k.m65748h(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        mapView.setAlpha(((Float) animatedValue).floatValue());
    }

    /* JADX INFO: renamed from: I1 */
    private final void m23881I1() {
        AbstractC25081a abstractC25081a = this.binding;
        if (abstractC25081a == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC25081a.f98244J.setText(getString(AbstractC22210f.f86537z1));
        AbstractC25081a abstractC25081a2 = this.binding;
        if (abstractC25081a2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC25081a2.f98245K.setText(getString(AbstractC22210f.f86537z1));
        AbstractC25081a abstractC25081a3 = this.binding;
        if (abstractC25081a3 != null) {
            abstractC25081a3.f98235A.setContentDescription(getString(AbstractC22210f.f86474e1));
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    /* JADX INFO: renamed from: J0 */
    private final Boolean m23883J0() {
        Intent intent = getIntent();
        if (intent != null) {
            return Boolean.valueOf(intent.getBooleanExtra("auto_start", false));
        }
        return null;
    }

    /* JADX INFO: renamed from: J1 */
    private final void m23884J1() {
        if (this.locationServicesHelper.m85444e()) {
            return;
        }
        m23890L1();
    }

    /* JADX INFO: renamed from: K0 */
    private final C34039j m23886K0() {
        LocationRequest locationRequestM15625b = LocationRequest.m15625b();
        locationRequestM15625b.m15629i(HMSConstantsKt.TIMEOUT_FOR_LOW_SPEED_INDICATOR_MILLIS);
        locationRequestM15625b.m15628h(2000L);
        locationRequestM15625b.f20585w = 100;
        ArrayList arrayList = new ArrayList();
        arrayList.add(locationRequestM15625b);
        return new C34039j(arrayList, true, false, null);
    }

    /* JADX INFO: renamed from: K1 */
    private final void m23887K1() {
        boolean z4;
        ArrayList arrayList = new ArrayList();
        AbstractC25081a abstractC25081a = this.binding;
        if (abstractC25081a == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        if (!abstractC25081a.f98265q.isChecked() || AbstractC32122c.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            z4 = false;
        } else if (this.permissionsManager == null || AbstractC32122c.checkSelfPermission(this, "android.permission.ACCESS_COARSE_LOCATION") == 0 || AbstractC32122c.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            arrayList.add("android.permission.ACCESS_FINE_LOCATION");
            z4 = false;
        } else {
            C27135b c27135b = this.permissionsManager;
            AbstractC22676k.m65747g(c27135b);
            c27135b.m81596a(this);
            z4 = true;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            if (AbstractC32122c.checkSelfPermission(this, "android.permission.BLUETOOTH_SCAN") != 0) {
                arrayList.add("android.permission.BLUETOOTH_SCAN");
            }
            if (AbstractC32122c.checkSelfPermission(this, "android.permission.BLUETOOTH_CONNECT") != 0) {
                arrayList.add("android.permission.BLUETOOTH_CONNECT");
            }
        }
        if (!arrayList.isEmpty()) {
            ActivityCompat.requestPermissions(this, (String[]) arrayList.toArray(new String[0]), arrayList.contains("android.permission.ACCESS_FINE_LOCATION") ? 1001 : 1002);
        } else {
            if (z4) {
                return;
            }
            m23868E0();
        }
    }

    /* JADX INFO: renamed from: L0 */
    private final Integer m23889L0() {
        Intent intent = getIntent();
        if (intent != null) {
            return Integer.valueOf(intent.getIntExtra("sport_id", -1));
        }
        return null;
    }

    /* JADX INFO: renamed from: L1 */
    private final void m23890L1() {
        Task taskM93542c = new C30523a(this).m93542c(m23886K0());
        taskM93542c.addOnSuccessListener(this, new C25680d(new C27564l0(this, 5), 11));
        taskM93542c.addOnFailureListener(this, new C27572p0(this));
    }

    /* JADX INFO: renamed from: M0 */
    private final C27578s0 m23892M0() {
        return (C27578s0) this.startActivityViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M1 */
    public static final C23454a0 m23893M1(StartActivityActivity startActivityActivity, C34040k locationSettingsResponse) {
        boolean z4;
        AbstractC22676k.m65750j(locationSettingsResponse, "locationSettingsResponse");
        C34042m c34042m = locationSettingsResponse.f142707a.f142709x;
        if (c34042m == null || !(((z4 = c34042m.f142715z) || c34042m.f142710E) && c34042m != null && z4)) {
            startActivityActivity.logger.mo85216g("Location service is enabled but location/gps is not available", new AbstractC30556a.a[0]);
        } else {
            Toast.makeText(startActivityActivity, startActivityActivity.getString(AbstractC22210f.f86465b1), 0).show();
            startActivityActivity.logger.mo85216g("Location service is enabled", new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: N0 */
    private final void m23895N0(List<String> permissions, int[] grantResults) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = permissions.iterator();
        boolean z4 = false;
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (ActivityCompat.shouldShowRequestPermissionRationale(this, (String) it3.next())) {
                            z4 = true;
                            break;
                        }
                    }
                }
                if (z4) {
                    m23922W1(arrayList);
                    return;
                } else {
                    m23931Z1(arrayList);
                    return;
                }
            }
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            if (((i13 < 0 || i13 >= grantResults.length) ? -1 : grantResults[i13]) == -1) {
                arrayList.add(next);
            }
            i13 = i14;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N1 */
    public static final void m23896N1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: O0 */
    private final void m23898O0() {
        C31833m c31833m;
        MapView mapView;
        AbstractC25093m abstractC25093m = this.gpsMapBinding;
        if (abstractC25093m == null || (mapView = abstractC25093m.f98343a) == null) {
            c31833m = null;
        } else {
            InterfaceC13669j plugin = mapView.getPlugin("MAPBOX_LOCATION_COMPONENT_PLUGIN_ID");
            AbstractC22676k.m65747g(plugin);
            c31833m = (C31833m) plugin;
        }
        if (c31833m != null) {
            c31833m.m98891j(new C27266m(24));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O1 */
    public static final void m23899O1(StartActivityActivity startActivityActivity, Exception exc) {
        if (exc instanceof ResolvableApiException) {
            try {
                ((ResolvableApiException) exc).m15592c(startActivityActivity, 215);
            } catch (IntentSender.SendIntentException e5) {
                startActivityActivity.logger.mo85230v("Exception occurred during while requesting location service permissions", e5, new AbstractC30556a.a[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final C23454a0 m23901P0(C34199b updateSettings) {
        AbstractC22676k.m65750j(updateSettings, "$this$updateSettings");
        updateSettings.f143461l = EnumC13677r.f48475x;
        updateSettings.f143460k = true;
        updateSettings.f143451b = true;
        ImageHolder.Companion companion = ImageHolder.INSTANCE;
        ImageHolder imageHolderFrom = companion.from(C5489R.drawable.mapbox_user_icon);
        ImageHolder imageHolderFrom2 = companion.from(C5489R.drawable.mapbox_user_stroke_icon);
        ImageHolder imageHolderFrom3 = companion.from(AbstractC22207c.f86274o);
        C36502c c36502c = new C36502c("interpolate");
        m23903Q0(c36502c);
        updateSettings.f143450a = new C13662c(imageHolderFrom, imageHolderFrom2, imageHolderFrom3, c36502c.m116999b().toJson(), 16);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Q0 */
    private static final C23454a0 m23903Q0(C36502c interpolate) {
        AbstractC22676k.m65750j(interpolate, "$this$interpolate");
        ArrayList arrayList = interpolate.f155939b;
        arrayList.add(new C36500a("linear").m116999b());
        arrayList.add(new C36500a("zoom").m116999b());
        m23906R0(interpolate);
        m23909S0(interpolate);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Q1 */
    private final void m23904Q1(boolean value) {
        if (value) {
            AbstractC25081a abstractC25081a = this.binding;
            if (abstractC25081a == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            if (abstractC25081a.f98236B.isChecked()) {
                C9889m c9889m = this.strainCoachController;
                if (c9889m == null) {
                    AbstractC22676k.m65757q("strainCoachController");
                    throw null;
                }
                if (c9889m.m24134g() > 0.0d) {
                    AbstractC25081a abstractC25081a2 = this.binding;
                    if (abstractC25081a2 == null) {
                        AbstractC22676k.m65757q("binding");
                        throw null;
                    }
                    abstractC25081a2.f98243I.setEnabled(true);
                    AbstractC25081a abstractC25081a3 = this.binding;
                    if (abstractC25081a3 != null) {
                        abstractC25081a3.f98243I.setAlpha(1.0f);
                        return;
                    } else {
                        AbstractC22676k.m65757q("binding");
                        throw null;
                    }
                }
            }
        }
        AbstractC25081a abstractC25081a4 = this.binding;
        if (abstractC25081a4 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC25081a4.f98243I.setEnabled(false);
        AbstractC25081a abstractC25081a5 = this.binding;
        if (abstractC25081a5 != null) {
            abstractC25081a5.f98243I.setAlpha(0.2f);
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    /* JADX INFO: renamed from: R0 */
    private static final C23454a0 m23906R0(C36500a stop) {
        AbstractC22676k.m65750j(stop, "$this$stop");
        stop.m117000c(0.0d);
        stop.m117000c(0.6d);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: R1 */
    private final void m23907R1(InterfaceC24516b addableActivity) {
        if (addableActivity instanceof C24517c) {
            m49097o(this.cycleMgr.m83944o(UserState.States.SLEEP, com.whoop.data.remote.domain.request.UserState.Sleep).m122661K(new C27566m0(new C27564l0(this, 6), 4)));
        } else if (addableActivity instanceof C24518d) {
            m49097o(this.cycleMgr.m83944o("workout", com.whoop.data.remote.domain.request.UserState.Workout).m122661K(new C27566m0(new C27564l0(this, 7), 5)));
        }
    }

    /* JADX INFO: renamed from: S0 */
    private static final C23454a0 m23909S0(C36500a stop) {
        AbstractC22676k.m65750j(stop, "$this$stop");
        stop.m117000c(20.0d);
        stop.m117000c(1.0d);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S1 */
    public static final C23454a0 m23910S1(StartActivityActivity startActivityActivity, C29218v0 c29218v0) {
        startActivityActivity.logger.mo85216g("Starting Strain Coach - User state is set to SLEEP", new AbstractC30556a.a[0]);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: T0 */
    private final boolean m23912T0(float goalPercent) {
        double d3 = ((double) goalPercent) * 21.0d;
        C9889m c9889m = this.strainCoachController;
        if (c9889m != null) {
            return Math.abs(d3 - c9889m.m24134g()) < 0.10000000149011612d;
        }
        AbstractC22676k.m65757q("strainCoachController");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T1 */
    public static final void m23913T1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: U0 */
    private final void m23915U0() {
        C9889m c9889m = this.strainCoachController;
        if (c9889m == null) {
            AbstractC22676k.m65757q("strainCoachController");
            throw null;
        }
        float fM24134g = (float) (c9889m.m24134g() / 21.0d);
        AbstractC25081a abstractC25081a = this.binding;
        if (abstractC25081a != null) {
            abstractC25081a.f98262n.m24199v(fM24134g);
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U1 */
    public static final C23454a0 m23916U1(StartActivityActivity startActivityActivity, C29218v0 c29218v0) {
        startActivityActivity.logger.mo85216g("Starting Strain Coach - User state is set to WORKOUT", new AbstractC30556a.a[0]);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final C34911a m23918V0(StartActivityActivity startActivityActivity) {
        return AbstractC15751g.m44431K(startActivityActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V1 */
    public static final void m23919V1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: W0 */
    private final void m23921W0() {
        if (this.isMapInflated || !this.mapboxManager.m67651b()) {
            return;
        }
        AbstractC25081a abstractC25081a = this.binding;
        if (abstractC25081a == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ViewStub viewStub = abstractC25081a.f98264p.f5325a;
        if (viewStub != null) {
            viewStub.inflate();
        }
        this.isMapInflated = true;
    }

    /* JADX INFO: renamed from: W1 */
    private final void m23922W1(List<String> deniedPermissions) {
        String string = getString(AbstractC22210f.f86480g1, AbstractC25265s.m74110N0(deniedPermissions, null, null, null, null, 63));
        AbstractC22676k.m65749i(string, "getString(...)");
        C24844i c24844i = new C24844i(this);
        c24844i.m72849b(AbstractC22210f.f86486i1);
        C24836e c24836e = c24844i.f97324a;
        c24836e.f97261f = string;
        c24836e.f97268m = false;
        c24844i.setPositiveButton(AbstractC22210f.f86483h1, new DialogInterfaceOnClickListenerC27570o0(this, 0)).setNegativeButton(AbstractC22210f.f86495l1, new DialogInterfaceOnClickListenerC27570o0(this, 1)).m72850c();
    }

    /* JADX INFO: renamed from: X0 */
    private final void m23924X0() {
        m23892M0().getStartActivityViewModelEvent().observe(this, new C9873l(new C27564l0(this, 4)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X1 */
    public static final void m23925X1(StartActivityActivity startActivityActivity, DialogInterface dialogInterface, int i13) {
        startActivityActivity.m23887K1();
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final C23454a0 m23927Y0(StartActivityActivity startActivityActivity, C27580t0 startActivityViewModelEvent) {
        AbstractC22676k.m65750j(startActivityViewModelEvent, "startActivityViewModelEvent");
        if (startActivityViewModelEvent.getStrainRecoveryMapper() != null) {
            C9889m c9889m = startActivityActivity.strainCoachController;
            if (c9889m == null) {
                AbstractC22676k.m65757q("strainCoachController");
                throw null;
            }
            c9889m.m24140n(startActivityViewModelEvent.getStrainRecoveryMapper(), startActivityViewModelEvent.getCycleMetadata());
        }
        C9889m c9889m2 = startActivityActivity.strainCoachController;
        if (c9889m2 == null) {
            AbstractC22676k.m65757q("strainCoachController");
            throw null;
        }
        c9889m2.m24129D(startActivityViewModelEvent.getStrainCoachStates());
        AbstractC25081a abstractC25081a = startActivityActivity.binding;
        if (abstractC25081a == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        DayStrainView dayStrainView = abstractC25081a.f98261m;
        C9889m c9889m3 = startActivityActivity.strainCoachController;
        if (c9889m3 != null) {
            dayStrainView.m24153k(c9889m3, startActivityViewModelEvent.getStrainRecoveryMapper(), startActivityViewModelEvent.getStrainCoachStates());
            return C23454a0.f92919a;
        }
        AbstractC22676k.m65757q("strainCoachController");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y1 */
    public static final void m23928Y1(StartActivityActivity startActivityActivity, DialogInterface dialogInterface, int i13) {
        Toast.makeText(startActivityActivity, AbstractC22210f.f86477f1, 0).show();
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: Z0 */
    private final void m23930Z0(InterfaceC24516b activity) {
        String strM83276B;
        this.selectedActivity = activity;
        boolean z4 = activity instanceof C24518d;
        if (activity instanceof C24517c) {
            AbstractC25081a abstractC25081a = this.binding;
            if (abstractC25081a == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            abstractC25081a.f98272x.setPillColor(getColor(AbstractC22206b.f86247f));
            AbstractC25081a abstractC25081a2 = this.binding;
            if (abstractC25081a2 == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            abstractC25081a2.f98272x.setText(((C24517c) activity).m71418s() ? AbstractC22210f.f86432M : AbstractC22210f.f86434N);
            AbstractC25081a abstractC25081a3 = this.binding;
            if (abstractC25081a3 == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            abstractC25081a3.f98267s.m27434m();
            m23946e2();
        } else if (z4) {
            C24518d c24518d = (C24518d) activity;
            Sport sportM71421k = c24518d.m71421k();
            boolean z13 = sportM71421k != null && SportCategory.RESTORATIVE == sportM71421k.getCategory();
            if (m23892M0().m83279F(c24518d.m71421k()) && (strM83276B = m23892M0().m83276B(c24518d.m71421k())) != null) {
                Uri uriBuild = Uri.parse("stress-session").buildUpon().appendQueryParameter("sessionType", strM83276B).build();
                InterfaceC24882a interfaceC24882a = this.homeNavigator;
                AbstractC22676k.m65747g(uriBuild);
                interfaceC24882a.mo58971a(this, uriBuild);
            }
            if (z13) {
                m23946e2();
                AbstractC25081a abstractC25081a4 = this.binding;
                if (abstractC25081a4 == null) {
                    AbstractC22676k.m65757q("binding");
                    throw null;
                }
                abstractC25081a4.f98272x.setPillColor(getColor(AbstractC22206b.f86246e));
                AbstractC25081a abstractC25081a5 = this.binding;
                if (abstractC25081a5 == null) {
                    AbstractC22676k.m65757q("binding");
                    throw null;
                }
                abstractC25081a5.f98267s.m27433l();
            } else {
                if (this.featureFlagRepository.isFeatureEnabled(OnboardingFeatureFlag.HOME_XP)) {
                    AbstractC25081a abstractC25081a6 = this.binding;
                    if (abstractC25081a6 == null) {
                        AbstractC22676k.m65757q("binding");
                        throw null;
                    }
                    abstractC25081a6.f98272x.setPillColor(getColor(AbstractC22206b.f86242a));
                } else {
                    AbstractC25081a abstractC25081a7 = this.binding;
                    if (abstractC25081a7 == null) {
                        AbstractC22676k.m65757q("binding");
                        throw null;
                    }
                    abstractC25081a7.f98272x.setPillColor(getColor(AbstractC22206b.f86248g));
                }
                AbstractC25081a abstractC25081a8 = this.binding;
                if (abstractC25081a8 == null) {
                    AbstractC22676k.m65757q("binding");
                    throw null;
                }
                abstractC25081a8.f98272x.setText(AbstractC22210f.f86436O);
                AbstractC25081a abstractC25081a9 = this.binding;
                if (abstractC25081a9 == null) {
                    AbstractC22676k.m65757q("binding");
                    throw null;
                }
                abstractC25081a9.f98267s.m27435n();
                m23946e2();
            }
        }
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C9863b(null), 3);
        C9889m c9889m = this.strainCoachController;
        if (c9889m == null) {
            AbstractC22676k.m65757q("strainCoachController");
            throw null;
        }
        c9889m.m24127B(activity);
        m23915U0();
        AbstractC25081a abstractC25081a10 = this.binding;
        if (abstractC25081a10 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        TextView textView = abstractC25081a10.f98237C;
        C9889m c9889m2 = this.strainCoachController;
        if (c9889m2 != null) {
            textView.setText(c9889m2.m24131d(this));
        } else {
            AbstractC22676k.m65757q("strainCoachController");
            throw null;
        }
    }

    /* JADX INFO: renamed from: Z1 */
    private final void m23931Z1(List<String> deniedPermissions) {
        String string = getString(AbstractC22210f.f86492k1, AbstractC25265s.m74110N0(deniedPermissions, null, null, null, null, 63));
        AbstractC22676k.m65749i(string, "getString(...)");
        C24844i c24844i = new C24844i(this);
        c24844i.m72849b(AbstractC22210f.f86486i1);
        C24836e c24836e = c24844i.f97324a;
        c24836e.f97261f = string;
        c24836e.f97268m = false;
        c24844i.setPositiveButton(AbstractC22210f.f86450V, new DialogInterfaceOnClickListenerC27570o0(this, 3)).setNegativeButton(AbstractC22210f.f86495l1, new DialogInterfaceOnClickListenerC27570o0(this, 5)).m72850c();
    }

    /* JADX INFO: renamed from: a1 */
    private final void m23933a1() {
        C9889m c9889m = this.strainCoachController;
        if (c9889m == null) {
            AbstractC22676k.m65757q("strainCoachController");
            throw null;
        }
        if (c9889m.getStrainCoachState() != C9889m.b.LOCKED) {
            ValueAnimator valueAnimator = this.miniDialCrossfader;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            AbstractC25081a abstractC25081a = this.binding;
            if (abstractC25081a == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            ImageButton lockedCoachHelpButton = abstractC25081a.f98268t;
            AbstractC22676k.m65749i(lockedCoachHelpButton, "lockedCoachHelpButton");
            if (lockedCoachHelpButton.getVisibility() == 0) {
                AbstractC25081a abstractC25081a2 = this.binding;
                if (abstractC25081a2 == null) {
                    AbstractC22676k.m65757q("binding");
                    throw null;
                }
                abstractC25081a2.f98269u.setVisibility(0);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new C27574q0(this, 1));
                valueAnimatorOfFloat.addListener(new C9864c());
                valueAnimatorOfFloat.setDuration(getResources().getInteger(AbstractC26664e.f106001b));
                valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                valueAnimatorOfFloat.start();
                this.miniDialCrossfader = valueAnimatorOfFloat;
            }
            this.analyticsManager.mo41424f("Recording Data", "Strain Coach", "Hide", "Start Activity - Show Strain Coach");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public static final void m23934a2(StartActivityActivity startActivityActivity, DialogInterface dialogInterface, int i13) {
        Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", startActivityActivity.getPackageName(), null));
        AbstractC22676k.m65749i(data, "setData(...)");
        startActivityActivity.startActivity(data);
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final void m23936b1(StartActivityActivity startActivityActivity, ValueAnimator animation) {
        AbstractC22676k.m65750j(animation, "animation");
        AbstractC25081a abstractC25081a = startActivityActivity.binding;
        if (abstractC25081a == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        LinearLayout linearLayout = abstractC25081a.f98269u;
        Object animatedValue = animation.getAnimatedValue();
        AbstractC22676k.m65748h(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        linearLayout.setAlpha(((Float) animatedValue).floatValue());
        AbstractC25081a abstractC25081a2 = startActivityActivity.binding;
        if (abstractC25081a2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ImageButton imageButton = abstractC25081a2.f98268t;
        Object animatedValue2 = animation.getAnimatedValue();
        AbstractC22676k.m65748h(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        imageButton.setAlpha(1.0f - ((Float) animatedValue2).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public static final void m23937b2(StartActivityActivity startActivityActivity, DialogInterface dialogInterface, int i13) {
        Toast.makeText(startActivityActivity, AbstractC22210f.f86489j1, 0).show();
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: c1 */
    private final void m23939c1() {
        C9889m c9889m = this.strainCoachController;
        if (c9889m == null) {
            AbstractC22676k.m65757q("strainCoachController");
            throw null;
        }
        if (c9889m.getStrainCoachState() != C9889m.b.LOCKED) {
            ValueAnimator valueAnimator = this.miniDialCrossfader;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                valueAnimator.removeAllUpdateListeners();
            }
            AbstractC25081a abstractC25081a = this.binding;
            if (abstractC25081a == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            LinearLayout miniDialContainer = abstractC25081a.f98269u;
            AbstractC22676k.m65749i(miniDialContainer, "miniDialContainer");
            if (miniDialContainer.getVisibility() == 0) {
                AbstractC25081a abstractC25081a2 = this.binding;
                if (abstractC25081a2 == null) {
                    AbstractC22676k.m65757q("binding");
                    throw null;
                }
                abstractC25081a2.f98268t.setVisibility(0);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new C27574q0(this, 0));
                valueAnimatorOfFloat.addListener(new C9865d());
                valueAnimatorOfFloat.setDuration(getResources().getInteger(AbstractC26664e.f106001b));
                valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                valueAnimatorOfFloat.start();
                this.miniDialCrossfader = valueAnimatorOfFloat;
            }
            this.analyticsManager.mo41425g("Strain Coach");
            this.analyticsManager.mo41424f("Recording Data", "Strain Coach", "Show", "Start Activity - Show Strain Coach");
        }
    }

    /* JADX INFO: renamed from: c2 */
    private final void m23940c2() {
        InterfaceC27543b interfaceC27543b = this.activitySelector;
        if (interfaceC27543b == null) {
            AbstractC22676k.m65757q("activitySelector");
            throw null;
        }
        InterfaceC24516b interfaceC24516bMo24076b = interfaceC27543b.mo24076b();
        if (interfaceC24516bMo24076b == null) {
            ((InterfaceC31766c) AbstractC29125c.m88492A(this).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC31766c.class), null)).mo98626g(new NullPointerException("select activity was null when trying to start activity"), null);
            return;
        }
        InterfaceC27543b interfaceC27543b2 = this.activitySelector;
        if (interfaceC27543b2 == null) {
            AbstractC22676k.m65757q("activitySelector");
            throw null;
        }
        String strMo24081q = interfaceC27543b2.mo24081q();
        InterfaceC24516b interfaceC24516b = this.selectedActivity;
        C24518d c24518d = interfaceC24516b instanceof C24518d ? (C24518d) interfaceC24516b : null;
        if ((c24518d != null ? c24518d.m71421k() : null) != null) {
            C40191e c40191eM49099s = m49099s();
            Sport sportM71421k = c24518d.m71421k();
            AbstractC22676k.m65747g(sportM71421k);
            c40191eM49099s.m129069y0(sportM71421k.getName(), m23892M0().m83278D(), strMo24081q);
        } else {
            m49099s().m129059t0(C40191e.m128973f(interfaceC24516bMo24076b), strMo24081q);
        }
        m23907R1(interfaceC24516bMo24076b);
        RealTimeRecordActivity.C9845b c9845bM23855u = RealTimeRecordActivity.INSTANCE.m23843b(this, (C29020i) AbstractC29125c.m88492A(this).m122602a(new C27219a(7), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29020i.class), null)).m23855u(interfaceC24516bMo24076b);
        C9889m c9889m = this.strainCoachController;
        if (c9889m == null) {
            AbstractC22676k.m65757q("strainCoachController");
            throw null;
        }
        RealTimeRecordActivity.C9845b c9845bM23857w = c9845bM23855u.m23857w(c9889m.m24135h());
        C9889m c9889m2 = this.strainCoachController;
        if (c9889m2 == null) {
            AbstractC22676k.m65757q("strainCoachController");
            throw null;
        }
        RealTimeRecordActivity.C9845b c9845bM23856v = c9845bM23857w.m23851A(c9889m2.getPickedStrainGoal()).m23856v(m23892M0().m83278D());
        c9845bM23856v.m49154m();
        finish();
        c9845bM23856v.m49151j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final void m23942d1(StartActivityActivity startActivityActivity, ValueAnimator animation) {
        AbstractC22676k.m65750j(animation, "animation");
        AbstractC25081a abstractC25081a = startActivityActivity.binding;
        if (abstractC25081a == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        LinearLayout linearLayout = abstractC25081a.f98269u;
        Object animatedValue = animation.getAnimatedValue();
        AbstractC22676k.m65748h(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        linearLayout.setAlpha(1.0f - ((Float) animatedValue).floatValue());
        AbstractC25081a abstractC25081a2 = startActivityActivity.binding;
        if (abstractC25081a2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ImageButton imageButton = abstractC25081a2.f98268t;
        Object animatedValue2 = animation.getAnimatedValue();
        AbstractC22676k.m65748h(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
        imageButton.setAlpha(((Float) animatedValue2).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public static final C34911a m23943d2() {
        return AbstractC15751g.m44431K(54);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public static final C34911a m23945e1() {
        return AbstractC15751g.m44431K(54);
    }

    /* JADX INFO: renamed from: e2 */
    private final void m23946e2() {
        AbstractC25081a abstractC25081a = this.binding;
        if (abstractC25081a == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC25081a.f98274z.setVisibility(0);
        AbstractC25081a abstractC25081a2 = this.binding;
        if (abstractC25081a2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC25081a2.f98254f.setBackgroundColor(getColor(AbstractC36510a.f156035n));
        if (this.featureFlagRepository.isFeatureEnabled(OnboardingFeatureFlag.HOME_XP)) {
            AbstractC25081a abstractC25081a3 = this.binding;
            if (abstractC25081a3 == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            abstractC25081a3.f98272x.setPillColor(getColor(AbstractC22206b.f86242a));
            AbstractC25081a abstractC25081a4 = this.binding;
            if (abstractC25081a4 == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            abstractC25081a4.f98272x.setStrokeColor(getColor(AbstractC22206b.f86242a));
        } else {
            AbstractC25081a abstractC25081a5 = this.binding;
            if (abstractC25081a5 == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            abstractC25081a5.f98272x.setPillColor(getColor(AbstractC36510a.f156021b0));
            AbstractC25081a abstractC25081a6 = this.binding;
            if (abstractC25081a6 == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            abstractC25081a6.f98272x.setStrokeColor(getColor(AbstractC36510a.f156021b0));
        }
        AbstractC25081a abstractC25081a7 = this.binding;
        if (abstractC25081a7 != null) {
            abstractC25081a7.f98272x.setText(getString(AbstractC22210f.f86522u1));
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public static final C34911a m23948f1() {
        return AbstractC15751g.m44431K(50);
    }

    /* JADX INFO: renamed from: f2 */
    private final void m23949f2() {
        AbstractC25081a abstractC25081a = this.binding;
        if (abstractC25081a == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        if (abstractC25081a.f98236B.isChecked()) {
            AbstractC25081a abstractC25081a2 = this.binding;
            if (abstractC25081a2 == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            abstractC25081a2.f98236B.setChecked(false);
        }
        AbstractC25081a abstractC25081a3 = this.binding;
        if (abstractC25081a3 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        if (abstractC25081a3.f98262n.getStrainGoal() > 0.0f) {
            AbstractC25081a abstractC25081a4 = this.binding;
            if (abstractC25081a4 == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            abstractC25081a4.f98262n.m24199v(0.0f);
        }
        m23904Q1(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public static final C23454a0 m23951g1(StartActivityActivity startActivityActivity, int i13) {
        startActivityActivity.logger.mo85216g(AbstractC2875y.m8295h(i13, "STRAINCOACH: BottomSheetBehavior state change: "), new AbstractC30556a.a[0]);
        if (i13 == 3) {
            startActivityActivity.m23939c1();
        } else if (i13 == 4) {
            startActivityActivity.m23933a1();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g2 */
    private final void m23952g2() {
        AbstractC25081a abstractC25081a = this.binding;
        if (abstractC25081a == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        if (abstractC25081a.f98236B.isChecked()) {
            return;
        }
        C9889m c9889m = this.strainCoachController;
        if (c9889m == null) {
            AbstractC22676k.m65757q("strainCoachController");
            throw null;
        }
        if (c9889m.getStrainCoachState() != C9889m.b.LOCKED) {
            AbstractC25081a abstractC25081a2 = this.binding;
            if (abstractC25081a2 != null) {
                abstractC25081a2.f98236B.setChecked(true);
            } else {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public static final void m23954h1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h2 */
    private final void m23955h2(double estimate) {
        AbstractC25081a abstractC25081a = this.binding;
        if (abstractC25081a != null) {
            abstractC25081a.f98261m.setEstimatedDayStrain(estimate);
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public static final C23454a0 m23957i1(StartActivityActivity startActivityActivity, boolean z4) {
        BottomSheetBehavior<View> bottomSheetBehavior = startActivityActivity.bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.f20783K = !z4;
            return C23454a0.f92919a;
        }
        AbstractC22676k.m65757q("bottomSheetBehavior");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i2 */
    public final Object m23958i2(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C9876o c9876o;
        int i13;
        int i14;
        int i15;
        if (interfaceC30057d instanceof C9876o) {
            c9876o = (C9876o) interfaceC30057d;
            int i16 = c9876o.f28928z;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                c9876o.f28928z = i16 - Integer.MIN_VALUE;
            } else {
                c9876o = new C9876o(interfaceC30057d);
            }
        } else {
            c9876o = new C9876o(interfaceC30057d);
        }
        Object obj = c9876o.f28926x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i17 = c9876o.f28928z;
        if (i17 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC24516b interfaceC24516b = this.selectedActivity;
            if (interfaceC24516b != null) {
                if (interfaceC24516b instanceof C24518d) {
                    Sport sportM71421k = ((C24518d) interfaceC24516b).m71421k();
                    AbstractC22676k.m65747g(sportM71421k);
                    if (sportM71421k.getHasGps()) {
                        i13 = 1;
                    } else {
                        i13 = 0;
                    }
                } else {
                    i13 = 0;
                }
                C27578s0 c27578s0M23892M0 = m23892M0();
                c9876o.f28925w = i13;
                c9876o.f28928z = 1;
                Object objM83280G = c27578s0M23892M0.m83280G(c9876o);
                if (objM83280G == enumC31071a) {
                    return enumC31071a;
                }
                i14 = i13;
                obj = objM83280G;
            }
            return C23454a0.f92919a;
        }
        if (i17 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i14 = c9876o.f28925w;
        AbstractC34132o.m107864I(obj);
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i18 = 4;
        if (this.gpsPermitted && zBooleanValue) {
            AbstractC25081a abstractC25081a = this.binding;
            if (abstractC25081a == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            boolean zIsChecked = abstractC25081a.f98265q.isChecked();
            if (this.gpsStateDisposable.isDisposed()) {
                InterfaceC27543b interfaceC27543b = this.activitySelector;
                if (interfaceC27543b == null) {
                    AbstractC22676k.m65757q("activitySelector");
                    throw null;
                }
                AbstractC23412c abstractC23412cMo24082r = interfaceC27543b.mo24082r();
                C25680d c25680d = new C25680d(new C27564l0(this, 0), 10);
                abstractC23412cMo24082r.getClass();
                C33589b c33589b = new C33589b(c25680d, AbstractC31056a.f128065d);
                abstractC23412cMo24082r.m67905c(c33589b);
                this.gpsStateDisposable = c33589b;
            }
            if (i14 != 0) {
                m23877H0(zIsChecked ? 1.0f : 0.0f);
            }
            AbstractC25093m abstractC25093m = this.gpsMapBinding;
            if (abstractC25093m != null) {
                MapView gpsMap = abstractC25093m.f98343a;
                AbstractC22676k.m65749i(gpsMap, "gpsMap");
                if (i14 == 0) {
                    i15 = 8;
                } else {
                    AbstractC25081a abstractC25081a2 = this.binding;
                    if (abstractC25081a2 == null) {
                        AbstractC22676k.m65757q("binding");
                        throw null;
                    }
                    if (abstractC25081a2.f98265q.isChecked()) {
                        i15 = 0;
                    } else {
                        i15 = 8;
                    }
                }
                gpsMap.setVisibility(i15);
            }
            AbstractC25081a abstractC25081a3 = this.binding;
            if (abstractC25081a3 == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            LinearLayout gpsSwitchContainer = abstractC25081a3.f98266r;
            AbstractC22676k.m65749i(gpsSwitchContainer, "gpsSwitchContainer");
            gpsSwitchContainer.setVisibility(i14 == 0 ? 4 : 0);
            AbstractC25081a abstractC25081a4 = this.binding;
            if (abstractC25081a4 == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            ImageView nonGpsBackground = abstractC25081a4.f98270v;
            AbstractC22676k.m65749i(nonGpsBackground, "nonGpsBackground");
            nonGpsBackground.setVisibility(4);
        } else {
            AbstractC25081a abstractC25081a5 = this.binding;
            if (abstractC25081a5 == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            if (abstractC25081a5.f98265q.isChecked()) {
                AbstractC25081a abstractC25081a6 = this.binding;
                if (abstractC25081a6 == null) {
                    AbstractC22676k.m65757q("binding");
                    throw null;
                }
                abstractC25081a6.f98265q.setChecked(false);
                m23892M0().m83281H(false);
            }
            AbstractC25093m abstractC25093m2 = this.gpsMapBinding;
            if (abstractC25093m2 != null) {
                MapView gpsMap2 = abstractC25093m2.f98343a;
                AbstractC22676k.m65749i(gpsMap2, "gpsMap");
                gpsMap2.setVisibility(4);
            }
            AbstractC25081a abstractC25081a7 = this.binding;
            if (abstractC25081a7 == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            LinearLayout gpsSwitchContainer2 = abstractC25081a7.f98266r;
            AbstractC22676k.m65749i(gpsSwitchContainer2, "gpsSwitchContainer");
            if (zBooleanValue && i14 != 0) {
                i18 = 0;
            }
            gpsSwitchContainer2.setVisibility(i18);
            AbstractC25081a abstractC25081a8 = this.binding;
            if (abstractC25081a8 == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            ImageView nonGpsBackground2 = abstractC25081a8.f98270v;
            AbstractC22676k.m65749i(nonGpsBackground2, "nonGpsBackground");
            nonGpsBackground2.setVisibility(0);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public static final C23454a0 m23960j1(StartActivityActivity startActivityActivity, double d3) {
        startActivityActivity.m23967l2(d3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX INFO: renamed from: j2 */
    public static final C23454a0 m23961j2(StartActivityActivity startActivityActivity, Boolean bool) {
        boolean z4;
        if (bool.booleanValue()) {
            AbstractC25081a abstractC25081a = startActivityActivity.binding;
            if (abstractC25081a == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            if (abstractC25081a.f98265q.isChecked()) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        startActivityActivity.m23892M0().m83281H(z4);
        AbstractC25093m abstractC25093m = startActivityActivity.gpsMapBinding;
        if (abstractC25093m != null) {
            MapView gpsMap = abstractC25093m.f98343a;
            AbstractC22676k.m65749i(gpsMap, "gpsMap");
            gpsMap.setVisibility(z4 ? 0 : 4);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public static final void m23963k1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public static final void m23964k2(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public static final C23454a0 m23966l1(StartActivityActivity startActivityActivity, double d3) {
        startActivityActivity.m23955h2(d3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l2 */
    private final void m23967l2(double goal) {
        float f13 = (float) (goal / 21.0d);
        String string = goal == 0.0d ? getString(AbstractC22210f.f86519t1) : AbstractC10538f.m27183h(goal);
        AbstractC22676k.m65747g(string);
        AbstractC25081a abstractC25081a = this.binding;
        if (abstractC25081a == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC25081a.f98246L.setText(string);
        AbstractC25081a abstractC25081a2 = this.binding;
        if (abstractC25081a2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC25081a2.f98241G.setProgress(f13);
        AbstractC25081a abstractC25081a3 = this.binding;
        if (abstractC25081a3 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC25081a3.f98242H.setText(string);
        AbstractC25081a abstractC25081a4 = this.binding;
        if (abstractC25081a4 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        TextView textView = abstractC25081a4.f98238D;
        C9889m c9889m = this.strainCoachController;
        if (c9889m == null) {
            AbstractC22676k.m65757q("strainCoachController");
            throw null;
        }
        textView.setText(c9889m.m24139m(this));
        AbstractC25081a abstractC25081a5 = this.binding;
        if (abstractC25081a5 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        TextView textView2 = abstractC25081a5.f98237C;
        C9889m c9889m2 = this.strainCoachController;
        if (c9889m2 == null) {
            AbstractC22676k.m65757q("strainCoachController");
            throw null;
        }
        textView2.setText(c9889m2.m24131d(this));
        AbstractC25081a abstractC25081a6 = this.binding;
        if (abstractC25081a6 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        if (!abstractC25081a6.f98262n.getAnimating()) {
            if (f13 > 0.0f) {
                m23952g2();
            }
            m23904Q1(!m23912T0(f13));
        }
        AbstractC25081a abstractC25081a7 = this.binding;
        if (abstractC25081a7 != null) {
            abstractC25081a7.f98261m.setActivityStrain(goal);
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public static final void m23969m1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public static final C23454a0 m23971n1(StartActivityActivity startActivityActivity, Boolean bool) {
        AbstractC25081a abstractC25081a = startActivityActivity.binding;
        if (abstractC25081a == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        LockableNestedScrollView lockableNestedScrollView = abstractC25081a.f98259k;
        AbstractC22676k.m65747g(bool);
        lockableNestedScrollView.setLock(bool.booleanValue());
        if (!bool.booleanValue()) {
            AbstractC25081a abstractC25081a2 = startActivityActivity.binding;
            if (abstractC25081a2 == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            if (((double) abstractC25081a2.f98262n.getStrainGoal()) * 21.0d < 0.10000000149011612d) {
                startActivityActivity.m23949f2();
            }
        }
        if (!bool.booleanValue()) {
            startActivityActivity.analyticsManager.mo41424f("Recording Data", "Strain Coach", "Adjust", "Start Activity - Adjust Target Strain");
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public static final void m23973o1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public static final void m23975p1(StartActivityActivity startActivityActivity, View view) {
        C28216y c28216y = startActivityActivity.externalLinkNavigator;
        String string = startActivityActivity.getString(AbstractC26666g.f106013d);
        AbstractC22676k.m65749i(string, "getString(...)");
        C28216y.m85414y(c28216y, startActivityActivity, string, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public static final void m23977q1(StartActivityActivity startActivityActivity, ViewStub viewStub, View view) {
        MapView mapView;
        AbstractC25093m abstractC25093m = (AbstractC25093m) AbstractC1177g.m3730a(view);
        startActivityActivity.gpsMapBinding = abstractC25093m;
        if (abstractC25093m != null && (mapView = abstractC25093m.f98343a) != null) {
            startActivityActivity.m23995P1(mapView.getMapboxMapDeprecated());
        }
        startActivityActivity.m23994z1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public static final void m23979r1(StartActivityActivity startActivityActivity, View view) {
        startActivityActivity.externalLinkNavigator.m85432u(startActivityActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public static final C23454a0 m23981s1(C9886j c9886j, View it) {
        AbstractC22676k.m65750j(it, "it");
        c9886j.m24083t0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public static final C23454a0 m23983t1(StartActivityActivity startActivityActivity, InterfaceC24516b addableActivity) {
        Sport sportM71421k;
        AbstractC22676k.m65750j(addableActivity, "addableActivity");
        startActivityActivity.m23930Z0(addableActivity);
        startActivityActivity.m49099s().m129037i0(C40191e.m128973f(addableActivity));
        Integer numValueOf = null;
        C24518d c24518d = addableActivity instanceof C24518d ? (C24518d) addableActivity : null;
        if (AbstractC22676k.m65745e(startActivityActivity.m23883J0(), Boolean.TRUE)) {
            Integer numM23889L0 = startActivityActivity.m23889L0();
            if (c24518d != null && (sportM71421k = c24518d.m71421k()) != null) {
                numValueOf = Integer.valueOf(sportM71421k.getId());
            }
            if (AbstractC22676k.m65745e(numM23889L0, numValueOf)) {
                startActivityActivity.m23887K1();
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public static final void m23985u1(StartActivityActivity startActivityActivity, View view) {
        startActivityActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public static final void m23987v1(StartActivityActivity startActivityActivity, View view) {
        startActivityActivity.m23887K1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w1 */
    public static final void m23989w1(StartActivityActivity startActivityActivity, View view) {
        startActivityActivity.m23915U0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static final void m23991x1(StartActivityActivity startActivityActivity, View view) {
        BottomSheetBehavior<View> bottomSheetBehavior = startActivityActivity.bottomSheetBehavior;
        if (bottomSheetBehavior == null) {
            AbstractC22676k.m65757q("bottomSheetBehavior");
            throw null;
        }
        if (bottomSheetBehavior.f20784L == 4) {
            AbstractC25081a abstractC25081a = startActivityActivity.binding;
            if (abstractC25081a == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            if (abstractC25081a.f98236B.isChecked()) {
                BottomSheetBehavior<View> bottomSheetBehavior2 = startActivityActivity.bottomSheetBehavior;
                if (bottomSheetBehavior2 == null) {
                    AbstractC22676k.m65757q("bottomSheetBehavior");
                    throw null;
                }
                bottomSheetBehavior2.m15701W(3);
            }
        }
        C9889m c9889m = startActivityActivity.strainCoachController;
        if (c9889m == null) {
            AbstractC22676k.m65757q("strainCoachController");
            throw null;
        }
        if (c9889m.getStrainCoachState() != C9889m.b.LOCKED) {
            AbstractC25081a abstractC25081a2 = startActivityActivity.binding;
            if (abstractC25081a2 == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            if (abstractC25081a2.f98236B.isChecked()) {
                C9889m c9889m2 = startActivityActivity.strainCoachController;
                if (c9889m2 == null) {
                    AbstractC22676k.m65757q("strainCoachController");
                    throw null;
                }
                if (c9889m2.m24134g() > 0.0d) {
                    startActivityActivity.m23952g2();
                    startActivityActivity.m23915U0();
                } else {
                    startActivityActivity.m23949f2();
                    AbstractC25081a abstractC25081a3 = startActivityActivity.binding;
                    if (abstractC25081a3 == null) {
                        AbstractC22676k.m65757q("binding");
                        throw null;
                    }
                    abstractC25081a3.f98262n.m24197B();
                }
            } else {
                startActivityActivity.m23949f2();
            }
        }
        InterfaceC40188b interfaceC40188b = startActivityActivity.analyticsManager;
        AbstractC25081a abstractC25081a4 = startActivityActivity.binding;
        if (abstractC25081a4 != null) {
            interfaceC40188b.mo41424f("Recording Data", "Strain Coach", abstractC25081a4.f98236B.isChecked() ? "On" : "Off", "Start Activity - Toggle Strain Coach");
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y1 */
    public static final void m23993y1(StartActivityActivity startActivityActivity, Boolean bool) {
        startActivityActivity.m23866D1();
    }

    /* JADX INFO: renamed from: z1 */
    private final void m23994z1() {
        MapView mapView;
        if (AbstractC32122c.checkSelfPermission(this, "android.permission.ACCESS_COARSE_LOCATION") != 0 && AbstractC32122c.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            C27135b c27135b = new C27135b(this);
            c27135b.m81596a(this);
            this.permissionsManager = c27135b;
            return;
        }
        AbstractC25093m abstractC25093m = this.gpsMapBinding;
        if (abstractC25093m != null && (mapView = abstractC25093m.f98343a) != null) {
            InterfaceC13669j plugin = mapView.getPlugin("MAPBOX_COMPASS_PLUGIN_ID");
            AbstractC22676k.m65747g(plugin);
            C22841d c22841d = (C22841d) plugin;
            C24756a c24756aM72492b = c22841d.f90049H.m72492b();
            m23859A1(c24756aM72492b);
            c22841d.f90049H = c24756aM72492b.m72491a();
            c22841d.m66223b();
            InterfaceC13669j plugin2 = mapView.getPlugin("MAPBOX_SCALEBAR_PLUGIN_ID");
            AbstractC22676k.m65747g(plugin2);
            ((C38666g) plugin2).m124001h();
        }
        MapboxMap mapboxMap = getMapboxMap();
        MapboxMap.loadStyle$default(mapboxMap, Style.MAPBOX_STREETS, (Style.OnStyleLoaded) null, 2, (Object) null);
        mapboxMap.gesturesPlugin(new C27266m(23));
        m23860B0();
        this.gpsPermitted = true;
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C9866e(null), 3);
    }

    /* JADX INFO: renamed from: P1 */
    public void m23995P1(MapboxMap mapboxMap) {
        AbstractC22676k.m65750j(mapboxMap, "<set-?>");
        this.mapboxMap = mapboxMap;
    }

    @Override // o52.InterfaceC27562k0
    /* JADX INFO: renamed from: a */
    public View mo23996a() {
        AbstractC25081a abstractC25081a = this.binding;
        if (abstractC25081a == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        LinearLayout toolbarContainer = abstractC25081a.f98248N;
        AbstractC22676k.m65749i(toolbarContainer, "toolbarContainer");
        return toolbarContainer;
    }

    @Override // nu.InterfaceC27134a
    /* JADX INFO: renamed from: b */
    public void mo23997b(boolean granted) {
        if (granted) {
            this.gpsPermitted = true;
            m23868E0();
        } else {
            m23895N0(AbstractC37056f.m118958J("android.permission.ACCESS_FINE_LOCATION"), new int[]{-1});
            this.gpsPermitted = false;
        }
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C9867f(null), 3);
        m49099s().m129011R(this.gpsPermitted);
    }

    @Override // o52.InterfaceC27547d
    /* JADX INFO: renamed from: c */
    public void mo23998c() {
        C27576r0 c27576r0 = this.callback;
        if (c27576r0 != null) {
            LocationProvider locationProvider = this.locationProvider;
            if (locationProvider != null) {
                if (c27576r0 == null) {
                    AbstractC22676k.m65757q("callback");
                    throw null;
                }
                locationProvider.removeLocationObserver(c27576r0);
            }
            this.logger.mo85216g("LocationObserver is removed", new AbstractC30556a.a[0]);
        }
    }

    @Override // o52.InterfaceC27562k0
    /* JADX INFO: renamed from: d */
    public TextView mo23999d() {
        AbstractC25081a abstractC25081a = this.binding;
        if (abstractC25081a == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        TextView activityTitle = abstractC25081a.f98253e;
        AbstractC22676k.m65749i(activityTitle, "activityTitle");
        return activityTitle;
    }

    @Override // nu.InterfaceC27134a
    /* JADX INFO: renamed from: e */
    public void mo24000e(List<String> permissionsToExplain) {
        AbstractC22676k.m65750j(permissionsToExplain, "permissionsToExplain");
    }

    @Override // o52.InterfaceC27562k0
    /* JADX INFO: renamed from: f */
    public ImageView mo24001f() {
        AbstractC25081a abstractC25081a = this.binding;
        if (abstractC25081a == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ColoredImageView activityIcon = abstractC25081a.f98250b;
        AbstractC22676k.m65749i(activityIcon, "activityIcon");
        return activityIcon;
    }

    @Override // o52.InterfaceC27562k0
    /* JADX INFO: renamed from: g */
    public View mo24002g() {
        AbstractC25081a abstractC25081a = this.binding;
        if (abstractC25081a == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ColoredImageView toolBarArrow = abstractC25081a.f98247M;
        AbstractC22676k.m65749i(toolBarArrow, "toolBarArrow");
        return toolBarArrow;
    }

    @Override // o52.InterfaceC27547d
    public MapboxMap getMapboxMap() {
        MapboxMap mapboxMap = this.mapboxMap;
        if (mapboxMap != null) {
            return mapboxMap;
        }
        AbstractC22676k.m65757q("mapboxMap");
        throw null;
    }

    @Override // o52.InterfaceC27562k0
    /* JADX INFO: renamed from: h */
    public View mo24003h() {
        AbstractC25081a abstractC25081a = this.binding;
        if (abstractC25081a == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        FragmentContainerView activityListFragment = abstractC25081a.f98251c;
        AbstractC22676k.m65749i(activityListFragment, "activityListFragment");
        return activityListFragment;
    }

    @Override // hj0.AbstractActivityC17347f, androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (215 != requestCode) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        if (resultCode == 0) {
            Toast.makeText(this, getString(AbstractC22210f.f86468c1), 0).show();
            AbstractC25081a abstractC25081a = this.binding;
            if (abstractC25081a != null) {
                abstractC25081a.f98265q.setChecked(false);
            } else {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
        }
    }

    @Override // hj0.AbstractActivityC17347f, androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (C9907b.m24265x(this)) {
            RealTimeRecordActivity.INSTANCE.m23843b(this, (C29020i) AbstractC15751g.m44472y(C29020i.class, null, new C27219a(8))).m49154m();
            finish();
            return;
        }
        m23924X0();
        C27219a c27219a = new C27219a(6);
        C38266c c38266cM88492A = AbstractC29125c.m88492A(this);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        this.realTimeStreamController = (C29020i) c38266cM88492A.m122602a(c27219a, c22673i0.getOrCreateKotlinClass(C29020i.class), null);
        this.strainCoachController = new C9889m(this);
        m49096B();
        AbstractC1168a0 abstractC1168a0M3733d = AbstractC1177g.m3733d(this, AbstractC22209e.f86390b);
        AbstractC22676k.m65749i(abstractC1168a0M3733d, "setContentView(...)");
        AbstractC25081a abstractC25081a = (AbstractC25081a) abstractC1168a0M3733d;
        this.binding = abstractC25081a;
        this.originalButtonContainerBottomPadding = abstractC25081a.f98254f.getPaddingBottom();
        AbstractC25081a abstractC25081a2 = this.binding;
        if (abstractC25081a2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        this.originalToolbarContainerTopPadding = abstractC25081a2.f98248N.getPaddingTop();
        m23862C0();
        AbstractC25081a abstractC25081a3 = this.binding;
        if (abstractC25081a3 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        C1172c0 c1172c0 = abstractC25081a3.f98264p;
        ViewStubOnInflateListenerC27579t viewStubOnInflateListenerC27579t = new ViewStubOnInflateListenerC27579t(this, 1);
        if (c1172c0.f5325a != null) {
            c1172c0.f5328d = viewStubOnInflateListenerC27579t;
        }
        AbstractC1329o1 supportFragmentManager = getSupportFragmentManager();
        AbstractC22676k.m65749i(supportFragmentManager, "getSupportFragmentManager(...)");
        C9886j c9886j = (C9886j) supportFragmentManager.m4140E("selectActivityFragment");
        if (c9886j == null) {
            c9886j = new C9886j();
        }
        c9886j.mo24078g(m23889L0());
        if (!c9886j.isAdded()) {
            C1271a c1271a = new C1271a(supportFragmentManager);
            AbstractC25081a abstractC25081a4 = this.binding;
            if (abstractC25081a4 == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            c1271a.mo4042d(abstractC25081a4.f98251c.getId(), c9886j, "selectActivityFragment", 1);
            c1271a.m4046j();
        }
        this.activitySelector = c9886j;
        c9886j.m24080i0();
        AbstractC25081a abstractC25081a5 = this.binding;
        if (abstractC25081a5 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        LinearLayout activityContainer = abstractC25081a5.f98249a;
        AbstractC22676k.m65749i(activityContainer, "activityContainer");
        AbstractC1953c.m5963a(activityContainer, new C27554g0(c9886j, 5));
        InterfaceC27543b interfaceC27543b = this.activitySelector;
        if (interfaceC27543b == null) {
            AbstractC22676k.m65757q("activitySelector");
            throw null;
        }
        interfaceC27543b.mo24078g(m23889L0());
        InterfaceC27543b interfaceC27543b2 = this.activitySelector;
        if (interfaceC27543b2 == null) {
            AbstractC22676k.m65757q("activitySelector");
            throw null;
        }
        interfaceC27543b2.mo24077f(new C27564l0(this, 3));
        AbstractC25081a abstractC25081a6 = this.binding;
        if (abstractC25081a6 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        final int i13 = 2;
        abstractC25081a6.f98255g.setOnClickListener(new View.OnClickListener(this) { // from class: o52.n0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ StartActivityActivity f111000x;

            {
                this.f111000x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        StartActivityActivity.m23975p1(this.f111000x, view);
                        break;
                    case 1:
                        StartActivityActivity.m23979r1(this.f111000x, view);
                        break;
                    case 2:
                        StartActivityActivity.m23985u1(this.f111000x, view);
                        break;
                    case 3:
                        StartActivityActivity.m23987v1(this.f111000x, view);
                        break;
                    case 4:
                        StartActivityActivity.m23989w1(this.f111000x, view);
                        break;
                    default:
                        StartActivityActivity.m23991x1(this.f111000x, view);
                        break;
                }
            }
        });
        AbstractC25081a abstractC25081a7 = this.binding;
        if (abstractC25081a7 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        final int i14 = 3;
        abstractC25081a7.f98272x.setOnClickListener(new View.OnClickListener(this) { // from class: o52.n0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ StartActivityActivity f111000x;

            {
                this.f111000x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        StartActivityActivity.m23975p1(this.f111000x, view);
                        break;
                    case 1:
                        StartActivityActivity.m23979r1(this.f111000x, view);
                        break;
                    case 2:
                        StartActivityActivity.m23985u1(this.f111000x, view);
                        break;
                    case 3:
                        StartActivityActivity.m23987v1(this.f111000x, view);
                        break;
                    case 4:
                        StartActivityActivity.m23989w1(this.f111000x, view);
                        break;
                    default:
                        StartActivityActivity.m23991x1(this.f111000x, view);
                        break;
                }
            }
        });
        AbstractC25081a abstractC25081a8 = this.binding;
        if (abstractC25081a8 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        final int i15 = 4;
        abstractC25081a8.f98243I.setOnClickListener(new View.OnClickListener(this) { // from class: o52.n0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ StartActivityActivity f111000x;

            {
                this.f111000x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        StartActivityActivity.m23975p1(this.f111000x, view);
                        break;
                    case 1:
                        StartActivityActivity.m23979r1(this.f111000x, view);
                        break;
                    case 2:
                        StartActivityActivity.m23985u1(this.f111000x, view);
                        break;
                    case 3:
                        StartActivityActivity.m23987v1(this.f111000x, view);
                        break;
                    case 4:
                        StartActivityActivity.m23989w1(this.f111000x, view);
                        break;
                    default:
                        StartActivityActivity.m23991x1(this.f111000x, view);
                        break;
                }
            }
        });
        AbstractC25081a abstractC25081a9 = this.binding;
        if (abstractC25081a9 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        final int i16 = 5;
        abstractC25081a9.f98236B.setOnClickListener(new View.OnClickListener(this) { // from class: o52.n0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ StartActivityActivity f111000x;

            {
                this.f111000x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        StartActivityActivity.m23975p1(this.f111000x, view);
                        break;
                    case 1:
                        StartActivityActivity.m23979r1(this.f111000x, view);
                        break;
                    case 2:
                        StartActivityActivity.m23985u1(this.f111000x, view);
                        break;
                    case 3:
                        StartActivityActivity.m23987v1(this.f111000x, view);
                        break;
                    case 4:
                        StartActivityActivity.m23989w1(this.f111000x, view);
                        break;
                    default:
                        StartActivityActivity.m23991x1(this.f111000x, view);
                        break;
                }
            }
        });
        AbstractC25081a abstractC25081a10 = this.binding;
        if (abstractC25081a10 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC25081a10.f98265q.setOnCheckedChangeListener(new C27566m0(this, 3));
        AbstractC25081a abstractC25081a11 = this.binding;
        if (abstractC25081a11 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        AbstractC29986d.m91712b(abstractC25081a11.f98271w, AbstractC22206b.f86250i, AbstractC22206b.f86249h, 0.0f, 0.0f, AbstractC29986d.f122453a);
        AbstractC25081a abstractC25081a12 = this.binding;
        if (abstractC25081a12 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        BottomSheetBehavior<View> bottomSheetBehaviorM15688O = BottomSheetBehavior.m15688O(abstractC25081a12.f98274z);
        this.bottomSheetBehavior = bottomSheetBehaviorM15688O;
        m49097o(new C29984b(bottomSheetBehaviorM15688O).m91708d().m122661K(new C27566m0(new C27564l0(this, 8), 6)));
        BottomSheetBehavior<View> bottomSheetBehavior = this.bottomSheetBehavior;
        if (bottomSheetBehavior == null) {
            AbstractC22676k.m65757q("bottomSheetBehavior");
            throw null;
        }
        bottomSheetBehavior.m15701W(4);
        InterfaceC27543b interfaceC27543b3 = this.activitySelector;
        if (interfaceC27543b3 == null) {
            AbstractC22676k.m65757q("activitySelector");
            throw null;
        }
        interfaceC27543b3.mo24079i(new C27564l0(this, 9));
        AbstractC25081a abstractC25081a13 = this.binding;
        if (abstractC25081a13 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC25081a13.f98246L.setText("--");
        C9889m c9889m = this.strainCoachController;
        if (c9889m == null) {
            AbstractC22676k.m65757q("strainCoachController");
            throw null;
        }
        m49097o(c9889m.getPickedStrainGoalSubject().m122657G().m122661K(new C27566m0(new C27564l0(this, 10), 0)));
        C9889m c9889m2 = this.strainCoachController;
        if (c9889m2 == null) {
            AbstractC22676k.m65757q("strainCoachController");
            throw null;
        }
        m49097o(c9889m2.getEstimatedDayStrainSubject().m122657G().m122661K(new C27566m0(new C27564l0(this, 1), 1)));
        AbstractC25081a abstractC25081a14 = this.binding;
        if (abstractC25081a14 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        m49097o(abstractC25081a14.f98262n.getScrollSubject().m122661K(new C27566m0(new C27564l0(this, 2), 2)));
        AbstractC25081a abstractC25081a15 = this.binding;
        if (abstractC25081a15 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        final int i17 = 0;
        abstractC25081a15.f98261m.getOptimalTrainingLink().setOnClickListener(new View.OnClickListener(this) { // from class: o52.n0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ StartActivityActivity f111000x;

            {
                this.f111000x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        StartActivityActivity.m23975p1(this.f111000x, view);
                        break;
                    case 1:
                        StartActivityActivity.m23979r1(this.f111000x, view);
                        break;
                    case 2:
                        StartActivityActivity.m23985u1(this.f111000x, view);
                        break;
                    case 3:
                        StartActivityActivity.m23987v1(this.f111000x, view);
                        break;
                    case 4:
                        StartActivityActivity.m23989w1(this.f111000x, view);
                        break;
                    default:
                        StartActivityActivity.m23991x1(this.f111000x, view);
                        break;
                }
            }
        });
        AbstractC25081a abstractC25081a16 = this.binding;
        if (abstractC25081a16 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        final int i18 = 1;
        abstractC25081a16.f98268t.setOnClickListener(new View.OnClickListener(this) { // from class: o52.n0

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ StartActivityActivity f111000x;

            {
                this.f111000x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        StartActivityActivity.m23975p1(this.f111000x, view);
                        break;
                    case 1:
                        StartActivityActivity.m23979r1(this.f111000x, view);
                        break;
                    case 2:
                        StartActivityActivity.m23985u1(this.f111000x, view);
                        break;
                    case 3:
                        StartActivityActivity.m23987v1(this.f111000x, view);
                        break;
                    case 4:
                        StartActivityActivity.m23989w1(this.f111000x, view);
                        break;
                    default:
                        StartActivityActivity.m23991x1(this.f111000x, view);
                        break;
                }
            }
        });
        C9889m c9889m3 = this.strainCoachController;
        if (c9889m3 == null) {
            AbstractC22676k.m65757q("strainCoachController");
            throw null;
        }
        AbstractC25081a abstractC25081a17 = this.binding;
        if (abstractC25081a17 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        LinearLayout strainCoachSheet = abstractC25081a17.f98274z;
        AbstractC22676k.m65749i(strainCoachSheet, "strainCoachSheet");
        c9889m3.m24142p(strainCoachSheet);
        AbstractC25081a abstractC25081a18 = this.binding;
        if (abstractC25081a18 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        LinearLayout coachActiveContainer = abstractC25081a18.f98256h;
        AbstractC22676k.m65749i(coachActiveContainer, "coachActiveContainer");
        c9889m3.m24149y(coachActiveContainer);
        AbstractC25081a abstractC25081a19 = this.binding;
        if (abstractC25081a19 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        FrameLayout coachLockedContainer = abstractC25081a19.f98257i;
        AbstractC22676k.m65749i(coachLockedContainer, "coachLockedContainer");
        c9889m3.m24145s(coachLockedContainer);
        AbstractC25081a abstractC25081a20 = this.binding;
        if (abstractC25081a20 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        StrainCoachGoalPicker goalPicker = abstractC25081a20.f98262n;
        AbstractC22676k.m65749i(goalPicker, "goalPicker");
        c9889m3.m24148v(goalPicker);
        AbstractC25081a abstractC25081a21 = this.binding;
        if (abstractC25081a21 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        WhoopSwitch strainCoachSwitch = abstractC25081a21.f98236B;
        AbstractC22676k.m65749i(strainCoachSwitch, "strainCoachSwitch");
        c9889m3.m24147u(strainCoachSwitch);
        AbstractC25081a abstractC25081a22 = this.binding;
        if (abstractC25081a22 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        LinearLayout miniDialContainer = abstractC25081a22.f98269u;
        AbstractC22676k.m65749i(miniDialContainer, "miniDialContainer");
        c9889m3.m24146t(miniDialContainer);
        AbstractC25081a abstractC25081a23 = this.binding;
        if (abstractC25081a23 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        ImageButton lockedCoachHelpButton = abstractC25081a23.f98268t;
        AbstractC22676k.m65749i(lockedCoachHelpButton, "lockedCoachHelpButton");
        c9889m3.m24144r(lockedCoachHelpButton);
        AbstractC25081a abstractC25081a24 = this.binding;
        if (abstractC25081a24 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        TextView coachLockedText = abstractC25081a24.f98258j;
        AbstractC22676k.m65749i(coachLockedText, "coachLockedText");
        c9889m3.m24143q(coachLockedText);
        m23892M0().init();
        AbstractC25081a abstractC25081a25 = this.binding;
        if (abstractC25081a25 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC25081a25.f98265q.setChecked(m23892M0().m83278D());
        m23881I1();
        ((InterfaceC21153l0) AbstractC29125c.m88492A(this).m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21153l0.class), null)).mo59004J("StartActivityActivity");
        m23878H1();
    }

    @Override // hj0.AbstractActivityC17347f, p314m.AbstractActivityC24852m, androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        mo23998c();
        if (this.realTimeStreamController != null) {
            m23871F0();
        }
        InterfaceC27543b interfaceC27543b = this.activitySelector;
        if (interfaceC27543b != null) {
            interfaceC27543b.mo24075a();
        }
        this.gpsStateDisposable.dispose();
    }

    @Override // p314m.AbstractActivityC24852m, android.app.Activity
    public void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        InterfaceC27543b interfaceC27543b = this.activitySelector;
        if (interfaceC27543b == null) {
            AbstractC22676k.m65757q("activitySelector");
            throw null;
        }
        InterfaceC24516b interfaceC24516bMo24076b = interfaceC27543b.mo24076b();
        if (interfaceC24516bMo24076b != null) {
            m23930Z0(interfaceC24516bMo24076b);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        AbstractC22676k.m65750j(permissions, "permissions");
        AbstractC22676k.m65750j(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 1001 || requestCode == 1002) {
            if (grantResults.length != 0) {
                for (int i13 : grantResults) {
                    if (i13 == 0) {
                    }
                }
                m23868E0();
                return;
            }
            m23895N0(AbstractC25260n.m74049W0(permissions), grantResults);
            return;
        }
        C27135b c27135b = this.permissionsManager;
        if (c27135b == null || requestCode != 0) {
            return;
        }
        int length = permissions.length;
        boolean z4 = false;
        for (int i14 = 0; i14 < length; i14++) {
            String str = permissions[i14];
            if (AbstractC22676k.m65745e(str, "android.permission.ACCESS_FINE_LOCATION") || AbstractC22676k.m65745e(str, "android.permission.ACCESS_COARSE_LOCATION")) {
                z4 = z4 || grantResults[i14] == 0;
            }
        }
        c27135b.f108536a.mo23997b(z4);
    }

    @Override // hj0.AbstractActivityC17347f, androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onResume() {
        super.onResume();
        this.gpsPermitted = (AbstractC32122c.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") == 0) || (AbstractC32122c.checkSelfPermission(this, "android.permission.ACCESS_COARSE_LOCATION") == 0 || AbstractC32122c.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") == 0);
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C9868g(null), 3);
    }

    @Override // p314m.AbstractActivityC24852m, androidx.fragment.app.AbstractActivityC1340r0, android.app.Activity
    public void onStart() {
        super.onStart();
        m23874G0();
    }

    @Override // hj0.AbstractActivityC17347f
    /* JADX INFO: renamed from: p */
    public String mo19335p() {
        return "Activity Start";
    }
}
