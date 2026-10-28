package o52;

import a00.C0072g;
import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.HandlerThread;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.databinding.AbstractC1177g;
import androidx.databinding.C1172c0;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.InterfaceC1633v0;
import bh3.InterfaceC3255b;
import bl2.C3374c;
import bv.C3668c;
import bv.C3669d;
import c93.InterfaceC4339a;
import com.bumptech.glide.C4964f;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.bumptech.glide.ComponentCallbacks2C4966h;
import com.mapbox.geojson.LineString;
import com.mapbox.geojson.Point;
import com.mapbox.maps.C5489R;
import com.mapbox.maps.C5499a;
import com.mapbox.maps.CameraBoundsOptions;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CustomGeometrySourceOptions;
import com.mapbox.maps.CustomRasterSourceOptions;
import com.mapbox.maps.ImageHolder;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.Style;
import com.squareup.wire.AbstractC5583n;
import com.whoop.data.local.room.entity.GpsDto;
import com.whoop.domain.model.UnitSystem;
import com.whoop.domain.model.User;
import com.whoop.domain.model.UserProfile;
import com.whoop.p069ui.AbstractC10538f;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.realtime.presentation.RealTimeRecordActivity;
import com.whoop.realtime.presentation.views.RealTimeCell;
import com.whoop.service.network.model.Sport;
import com.whoop.service.network.model.UserSessionDto;
import e50.C12723b;
import hj0.AbstractC17348g;
import io.getstream.chat.android.client.ChatClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import k52.AbstractC22207c;
import l52.C23359a;
import l83.C23454a0;
import l83.C23465k;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m52.AbstractC25087g;
import m52.AbstractC25095o;
import m83.AbstractC25247g0;
import ny0.C27266m;
import or2.C28187o0;
import p021av.AbstractC2091e;
import p021av.C2087a;
import p048ce.AbstractC4482w;
import p099dv.C12380a;
import p127ev.C13662c;
import p127ev.EnumC13677r;
import p127ev.InterfaceC13669j;
import p383ov.C28393o;
import p383ov.InterfaceC28381c;
import p406pv.C29572a;
import p470rv.C31833m;
import p470rv.InterfaceC31840t;
import p479s4.AbstractC32122c;
import p626xu.C38651a;
import p627xv.C38666g;
import p660yu.C39783a;
import p693zu.C41146a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p92.C29019h;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import tv.C34199b;
import vf3.InterfaceC35951a;
import vu.C36500a;
import vu.C36502c;
import vu1.AbstractC36510a;
import yb3.AbstractC39414r;
import zg3.C40634a;

/* JADX INFO: renamed from: o52.w */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 z2\u00020\u0001:\u0001{B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020!H\u0002¢\u0006\u0004\b&\u0010$J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000eH\u0002¢\u0006\u0004\b+\u0010\u0003J\u0013\u0010-\u001a\u00020,*\u00020\u001dH\u0002¢\u0006\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8\u0002X\u0082D¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020/8\u0002X\u0082D¢\u0006\u0006\n\u0004\b3\u00101R\u0014\u00108\u001a\u0002058\u0002X\u0082D¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010:\u001a\u0002058\u0002X\u0082D¢\u0006\u0006\n\u0004\b9\u00107R\u0014\u0010<\u001a\u0002058\u0002X\u0082D¢\u0006\u0006\n\u0004\b;\u00107R\u0014\u0010>\u001a\u0002058\u0002X\u0082D¢\u0006\u0006\n\u0004\b=\u00107R\u0014\u0010@\u001a\u0002058\u0002X\u0082D¢\u0006\u0006\n\u0004\b?\u00107R\u0014\u0010B\u001a\u0002058\u0002X\u0082D¢\u0006\u0006\n\u0004\bA\u00107R\u0014\u0010D\u001a\u0002058\u0002X\u0082D¢\u0006\u0006\n\u0004\bC\u00107R\u0014\u0010F\u001a\u00020!8\u0002X\u0082D¢\u0006\u0006\n\u0004\bE\u00100R\u0014\u0010H\u001a\u00020!8\u0002X\u0082D¢\u0006\u0006\n\u0004\bG\u00100R\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010O\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u00109R\u0014\u0010Q\u001a\u00020!8\u0002X\u0082D¢\u0006\u0006\n\u0004\bP\u00100R\u0014\u0010S\u001a\u00020!8\u0002X\u0082D¢\u0006\u0006\n\u0004\bR\u00100R\u0014\u0010U\u001a\u00020!8\u0002X\u0082D¢\u0006\u0006\n\u0004\bT\u00100R\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010]\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R$\u0010c\u001a\u0012\u0012\u0004\u0012\u00020_0^j\b\u0012\u0004\u0012\u00020_``8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010g\u001a\u00020d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u001b\u0010k\u001a\u00020h8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010i\u001a\u0004\be\u0010jR\u0016\u0010l\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010;R\u0016\u0010o\u001a\u00020m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010nR\u0016\u0010s\u001a\u00020p8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bq\u0010rR\u0018\u0010v\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010uR\u0014\u0010y\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010x¨\u0006|"}, m65681d2 = {"Lo52/w;", "Lhj0/g;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onDestroy", "e0", "Lp92/h;", "controller", "o0", "(Lp92/h;)V", "", "Lcom/whoop/data/local/room/entity/GpsDto;", "gpsPoints", "n0", "(Ljava/util/List;)V", "Lp92/h$a;", "point", "d0", "(Lp92/h$a;)V", "", "meters", "a0", "(F)V", "metersPerSecond", "m0", "", "millis", "b0", "(J)V", "E0", "", "Z", "(Lp92/h$a;)Z", "", "F", "Ljava/lang/String;", "ROUTE_SOURCE_ID", "G", "ROUTE_LAYER_ID", "", "H", "D", "MAX_ZOOM", "I", "MIN_ZOOM", "J", "DEFAULT_ZOOM", "K", "SCALE_EXPERSSION_STOP_ONE_INPUT", "L", "SCALE_EXPERSSION_STOP_ONE_OUTPUT", "M", "SCALE_EXPERSSION_STOP_TWO_INPUT", "N", "SCALE_EXPERSSION_STOP_TWO_OUTPUT", "O", "MAP_LINE_WIDTH", "P", "MAP_LINE_OPACITY", "Lzu/a;", "Q", "Lzu/a;", "MAP_LINE_JOIN", "", "R", "MAP_LINE_COLOR", "S", "METERS_PER_MILE", "T", "MINUTES_PER_MILE_AT_1_METER_PER_SECOND", "U", "MINUTES_PER_KM_AT_1_METER_PER_SECOND", "Ltr2/n;", "V", "Ltr2/n;", "logger", "Lcom/mapbox/maps/MapboxMap;", "W", "Lcom/mapbox/maps/MapboxMap;", "mapboxMap", "Ljava/util/ArrayList;", "Lcom/mapbox/geojson/Point;", "Lkotlin/collections/ArrayList;", "X", "Ljava/util/ArrayList;", "routePoints", "Lcom/whoop/domain/model/UnitSystem;", "Y", "Lcom/whoop/domain/model/UnitSystem;", "unitSystem", "Ll52/a;", "Ll83/h;", "()Ll52/a;", "mapboxManager", "lastDuration", "Lor2/o0;", "Lor2/o0;", "kalmanFilter", "Lm52/g;", "c0", "Lm52/g;", "binding", "Lm52/o;", "Lm52/o;", "gpsMapBinding", "Lrv/t;", "Lrv/t;", "onIndicatorPositionChangedListener", "f0", "a", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27585w extends AbstractC17348g {

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g0 */
    public static final int f111047g0 = 8;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final double SCALE_EXPERSSION_STOP_ONE_INPUT;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private MapboxMap mapboxMap;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    private long lastDuration;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    private AbstractC25087g binding;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    private AbstractC25095o gpsMapBinding;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final String ROUTE_SOURCE_ID = "ROUTE_SOURCE";

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final String ROUTE_LAYER_ID = "ROUTE_LAYER";

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final double MAX_ZOOM = 16.0d;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final double MIN_ZOOM = 12.0d;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final double DEFAULT_ZOOM = 14.0d;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final double SCALE_EXPERSSION_STOP_ONE_OUTPUT = 0.6d;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final double SCALE_EXPERSSION_STOP_TWO_INPUT = 20.0d;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final double SCALE_EXPERSSION_STOP_TWO_OUTPUT = 1.0d;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final float MAP_LINE_WIDTH = 3.0f;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final float MAP_LINE_OPACITY = 0.5f;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final C41146a MAP_LINE_JOIN = C41146a.f177378a;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final int MAP_LINE_COLOR = AbstractC36510a.f156020b;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private final float METERS_PER_MILE = 1609.34f;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private final float MINUTES_PER_MILE_AT_1_METER_PER_SECOND = 26.8224f;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final float MINUTES_PER_KM_AT_1_METER_PER_SECOND = 16.666666f;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private final InterfaceC34116n logger = InterfaceC34116n.INSTANCE.m107848a("RealTimeMapFragment");

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private final ArrayList<Point> routePoints = new ArrayList<>();

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private UnitSystem unitSystem = UnitSystem.METRIC;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private final InterfaceC23462h mapboxManager = AbstractC30060g.m92087G(EnumC23463i.f92933w, new c(this, null, null));

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    private C28187o0 kalmanFilter = new C28187o0();

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    private final InterfaceC31840t onIndicatorPositionChangedListener = new C27573q(this, 0);

    /* JADX INFO: renamed from: o52.w$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lo52/w$a;", "", "<init>", "()V", "Lcom/whoop/service/network/model/Sport;", "sport", "Lo52/w;", "a", "(Lcom/whoop/service/network/model/Sport;)Lo52/w;", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C27585w m83341a(Sport sport) {
            C27585w c27585w = new C27585w();
            Bundle bundle = new Bundle();
            bundle.putParcelable("sports", sport);
            c27585w.setArguments(bundle);
            return c27585w;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: o52.w$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f111074a;

        static {
            int[] iArr = new int[UnitSystem.values().length];
            try {
                iArr[UnitSystem.IMPERIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f111074a = iArr;
        }
    }

    /* JADX INFO: renamed from: o52.w$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f111075w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f111076x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f111077y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f111075w = componentCallbacks;
            this.f111076x = interfaceC35951a;
            this.f111077y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, l52.a] */
        @Override // c93.InterfaceC4339a
        public final C23359a invoke() {
            ComponentCallbacks componentCallbacks = this.f111075w;
            InterfaceC35951a interfaceC35951a = this.f111076x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f111077y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C23359a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final C23454a0 m83287A0(C27585w c27585w, Long l7) {
        AbstractC22676k.m65747g(l7);
        c27585w.m83316b0(l7.longValue());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final void m83288B0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public static final C23454a0 m83289C0(C27585w c27585w, C29019h c29019h) {
        AbstractC22676k.m65747g(c29019h);
        c27585w.m83329o0(c29019h);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final void m83290D0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: E0 */
    private final void m83292E0() {
        MapboxMap mapboxMap = this.mapboxMap;
        if (mapboxMap != null) {
            mapboxMap.getStyle(new C5499a(this, 3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x0149  */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x0149, please report this as an issue */
    /* JADX INFO: renamed from: F0 */
    public static final void m83294F0(C27585w c27585w, Style style) {
        Object objM16778f0;
        AbstractC2091e c3669d;
        AbstractC2091e c2087a;
        AbstractC22676k.m65750j(style, "style");
        String sourceId = c27585w.ROUTE_SOURCE_ID;
        AbstractC22676k.m65750j(sourceId, "sourceId");
        AbstractC2091e abstractC2091e = null;
        try {
            objM16778f0 = AbstractC5583n.m16778f0(style.getStyleSourceProperty(sourceId, "type"));
        } catch (RuntimeException unused) {
            objM16778f0 = null;
        }
        String str = (String) objM16778f0;
        if (str != null) {
            switch (str) {
                case "raster-array":
                    HashMap map = new HashMap();
                    HashMap map2 = new HashMap();
                    c3669d = new C3669d(sourceId, 1);
                    c3669d.m6605d().putAll(map);
                    c3669d.m6606f().putAll(map2);
                    c3669d.f8262d = style;
                    break;
                case "custom-geometry":
                    CustomGeometrySourceOptions customGeometrySourceOptionsBuild = new CustomGeometrySourceOptions.Builder().build();
                    AbstractC22676k.m65749i(customGeometrySourceOptionsBuild, "Builder().build()");
                    c2087a = new C2087a(sourceId, customGeometrySourceOptionsBuild);
                    c2087a.f8262d = style;
                    c3669d = c2087a;
                    break;
                case "raster":
                    HashMap map3 = new HashMap();
                    HashMap map4 = new HashMap();
                    c3669d = new C3669d(sourceId, 3);
                    c3669d.m6605d().putAll(map3);
                    c3669d.m6606f().putAll(map4);
                    c3669d.f8262d = style;
                    break;
                case "vector":
                    HashMap map5 = new HashMap();
                    HashMap map6 = new HashMap();
                    c3669d = new C3669d(sourceId, 4);
                    c3669d.m6605d().putAll(map5);
                    c3669d.m6606f().putAll(map6);
                    c3669d.f8262d = style;
                    break;
                case "custom-raster":
                    CustomRasterSourceOptions customRasterSourceOptionsBuild = new CustomRasterSourceOptions.Builder().build();
                    AbstractC22676k.m65749i(customRasterSourceOptionsBuild, "Builder().build()");
                    c2087a = new C2087a(sourceId, customRasterSourceOptionsBuild);
                    c2087a.f8262d = style;
                    c3669d = c2087a;
                    break;
                case "geojson":
                    C0072g c0072g = new C0072g(sourceId);
                    ((HashMap) c0072g.f224y).put("data", new C39783a("data", AbstractC4482w.m14004n0("")));
                    c3669d = new C3668c(c0072g);
                    c3669d.f8262d = style;
                    break;
                case "image":
                    HashMap map7 = new HashMap();
                    HashMap map8 = new HashMap();
                    c3669d = new C3669d(sourceId, 0);
                    c3669d.m6605d().putAll(map7);
                    c3669d.m6606f().putAll(map8);
                    c3669d.f8262d = style;
                    break;
                case "raster-dem":
                    HashMap map9 = new HashMap();
                    HashMap map10 = new HashMap();
                    c3669d = new C3669d(sourceId, 2);
                    c3669d.m6605d().putAll(map9);
                    c3669d.m6606f().putAll(map10);
                    c3669d.f8262d = style;
                    break;
                default:
                    MapboxLogger.logE("StyleSourcePlugin", "Source type: " + str + " unknown.");
                    c3669d = null;
                    break;
            }
        } else {
            c3669d = null;
        }
        if (c3669d instanceof C3668c) {
            abstractC2091e = c3669d;
        } else {
            MapboxLogger.logW("StyleSourcePlugin", "Given sourceId = " + sourceId + " is not requested type in getSourceAs.");
        }
        C3668c c3668c = (C3668c) abstractC2091e;
        if (c3668c != null) {
            LineString lineStringFromLngLats = LineString.fromLngLats(c27585w.routePoints);
            AbstractC22676k.m65749i(lineStringFromLngLats, "fromLngLats(...)");
            HandlerThread handlerThread = C3668c.f14922i;
            c3668c.m11336g(lineStringFromLngLats, "");
        }
    }

    /* JADX INFO: renamed from: Y */
    private final C23359a m83313Y() {
        return (C23359a) this.mapboxManager.getValue();
    }

    /* JADX INFO: renamed from: Z */
    private final boolean m83314Z(C29019h.a aVar) {
        return (aVar.getLocation().getLatitude() == 0.0d || aVar.getLocation().getLongitude() == 0.0d) ? false : true;
    }

    /* JADX INFO: renamed from: a0 */
    private final void m83315a0(float meters) {
        String strConcat = b.f111074a[this.unitSystem.ordinal()] == 1 ? String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(meters / this.METERS_PER_MILE)}, 1)).concat("mi") : String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(meters / 1000)}, 1)).concat("km");
        AbstractC25087g abstractC25087g = this.binding;
        if (abstractC25087g == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        RealTimeCell realTimeCell = abstractC25087g.f98322d;
        SpannableString spannableString = new SpannableString(strConcat);
        spannableString.setSpan(new RelativeSizeSpan(0.6f), strConcat.length() - 2, strConcat.length(), 33);
        realTimeCell.setValueText(spannableString);
    }

    /* JADX INFO: renamed from: b0 */
    private final void m83316b0(long millis) {
        String strM27177b;
        int i13;
        this.lastDuration = millis;
        if (millis < 3600000) {
            strM27177b = AbstractC10538f.m27180e(Long.valueOf(millis));
            i13 = 3;
        } else {
            strM27177b = AbstractC10538f.m27177b(Long.valueOf(millis));
            i13 = 0;
        }
        AbstractC25087g abstractC25087g = this.binding;
        if (abstractC25087g == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        RealTimeCell realTimeCell = abstractC25087g.f98323e;
        SpannableString spannableString = new SpannableString(strM27177b);
        spannableString.setSpan(new RelativeSizeSpan(0.6f), strM27177b.length() - i13, strM27177b.length(), 33);
        realTimeCell.setValueText(spannableString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final void m83317c0(C27585w c27585w, Point it) {
        MapView mapView;
        MapView mapView2;
        MapboxMap mapboxMapDeprecated;
        AbstractC22676k.m65750j(it, "it");
        MapboxMap mapboxMap = c27585w.mapboxMap;
        if (mapboxMap != null) {
            CameraOptions cameraOptionsBuild = new CameraOptions.Builder().center(it).build();
            AbstractC22676k.m65749i(cameraOptionsBuild, "build(...)");
            mapboxMap.setCamera(cameraOptionsBuild);
        }
        AbstractC25095o abstractC25095o = c27585w.gpsMapBinding;
        if (abstractC25095o == null || (mapView = abstractC25095o.f98348a) == null) {
            return;
        }
        InterfaceC13669j plugin = mapView.getPlugin("MAPBOX_GESTURES_PLUGIN_ID");
        AbstractC22676k.m65747g(plugin);
        InterfaceC28381c interfaceC28381c = (InterfaceC28381c) plugin;
        AbstractC25095o abstractC25095o2 = c27585w.gpsMapBinding;
        ScreenCoordinate screenCoordinatePixelForCoordinate = (abstractC25095o2 == null || (mapView2 = abstractC25095o2.f98348a) == null || (mapboxMapDeprecated = mapView2.getMapboxMapDeprecated()) == null) ? null : mapboxMapDeprecated.pixelForCoordinate(it);
        C28393o c28393o = (C28393o) interfaceC28381c;
        if (AbstractC22676k.m65745e(c28393o.f114558u0.f120665J, screenCoordinatePixelForCoordinate)) {
            return;
        }
        C29572a c29572aM90661b = c28393o.f114558u0.m90661b();
        c29572aM90661b.f120652j = screenCoordinatePixelForCoordinate;
        c28393o.f114558u0 = c29572aM90661b.m90660a();
    }

    /* JADX INFO: renamed from: d0 */
    private final void m83318d0(C29019h.a point) {
        this.routePoints.add(Point.fromLngLat(point.getLocation().getLongitude(), point.getLocation().getLatitude()));
        m83292E0();
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: e0 */
    private final void m83319e0() {
        C31833m c31833m;
        MapView mapView;
        MapView mapView2;
        AbstractC25095o abstractC25095o = this.gpsMapBinding;
        if (abstractC25095o != null && (mapView2 = abstractC25095o.f98348a) != null) {
            InterfaceC13669j plugin = mapView2.getPlugin("MAPBOX_SCALEBAR_PLUGIN_ID");
            AbstractC22676k.m65747g(plugin);
            ((C38666g) plugin).m124001h();
        }
        final MapboxMap mapboxMap = this.mapboxMap;
        if (mapboxMap != null) {
            mapboxMap.loadStyle(Style.MAPBOX_STREETS, new Style.OnStyleLoaded() { // from class: o52.u
                @Override // com.mapbox.maps.Style.OnStyleLoaded
                public final void onStyleLoaded(Style style) {
                    C27585w.m83320f0(mapboxMap, this, style);
                }
            });
            mapboxMap.gesturesPlugin(new C27266m(19));
            CameraBoundsOptions cameraBoundsOptionsBuild = new CameraBoundsOptions.Builder().maxZoom(Double.valueOf(this.MAX_ZOOM)).minZoom(Double.valueOf(this.MIN_ZOOM)).build();
            AbstractC22676k.m65749i(cameraBoundsOptionsBuild, "build(...)");
            mapboxMap.setBounds(cameraBoundsOptionsBuild);
            CameraOptions cameraOptionsBuild = new CameraOptions.Builder().zoom(Double.valueOf(this.DEFAULT_ZOOM)).build();
            AbstractC22676k.m65749i(cameraOptionsBuild, "build(...)");
            mapboxMap.setCamera(cameraOptionsBuild);
        }
        AbstractC25095o abstractC25095o2 = this.gpsMapBinding;
        if (abstractC25095o2 == null || (mapView = abstractC25095o2.f98348a) == null) {
            c31833m = null;
        } else {
            InterfaceC13669j plugin2 = mapView.getPlugin("MAPBOX_LOCATION_COMPONENT_PLUGIN_ID");
            AbstractC22676k.m65747g(plugin2);
            c31833m = (C31833m) plugin2;
        }
        if (c31833m != null) {
            c31833m.m98891j(new C27575r(this, 5));
        }
        if (c31833m != null) {
            InterfaceC31840t listener = this.onIndicatorPositionChangedListener;
            AbstractC22676k.m65750j(listener, "listener");
            c31833m.f131883G.add(listener);
            Point point = c31833m.f131882F;
            if (point != null) {
                listener.mo83270a(point);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final void m83320f0(MapboxMap mapboxMap, C27585w c27585w, Style it) {
        AbstractC22676k.m65750j(it, "it");
        C0072g c0072g = new C0072g(c27585w.ROUTE_SOURCE_ID);
        ((HashMap) c0072g.f224y).put("data", new C39783a("data", AbstractC4482w.m14004n0("")));
        C3668c c3668c = new C3668c(c0072g);
        AbstractC22676k.m65750j(mapboxMap, "<this>");
        c3668c.mo6603b(mapboxMap);
        C38651a c38651a = new C38651a(c27585w.ROUTE_LAYER_ID, c27585w.ROUTE_SOURCE_ID);
        c38651a.m123904b(new C39783a("line-width", Double.valueOf(c27585w.MAP_LINE_WIDTH)));
        c38651a.m123904b(new C39783a("line-opacity", Double.valueOf(c27585w.MAP_LINE_OPACITY)));
        int color = AbstractC32122c.getColor(c27585w.requireContext(), c27585w.MAP_LINE_COLOR);
        C12380a c12380a = new C12380a(color, ((double) ((color >> 24) & 255)) / 255.0d);
        C36500a c36500a = new C36500a("rgba");
        c12380a.invoke(c36500a);
        c38651a.m123904b(new C39783a("line-color", c36500a.m116999b()));
        C41146a lineJoin = c27585w.MAP_LINE_JOIN;
        AbstractC22676k.m65750j(lineJoin, "lineJoin");
        c38651a.m123904b(new C39783a("line-join", lineJoin));
        c38651a.m123903a(mapboxMap, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C23454a0 m83321g0(InterfaceC28381c gesturesPlugin) {
        AbstractC22676k.m65750j(gesturesPlugin, "$this$gesturesPlugin");
        C28393o c28393o = (C28393o) gesturesPlugin;
        C29572a c29572aM90661b = c28393o.f114558u0.m90661b();
        m83322h0(c29572aM90661b);
        c28393o.f114558u0 = c29572aM90661b.m90660a();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h0 */
    private static final C23454a0 m83322h0(C29572a updateSettings) {
        AbstractC22676k.m65750j(updateSettings, "$this$updateSettings");
        updateSettings.f120645c = false;
        updateSettings.f120643a = false;
        updateSettings.f120651i = true;
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m83323i0(C27585w c27585w, C34199b updateSettings) {
        AbstractC22676k.m65750j(updateSettings, "$this$updateSettings");
        updateSettings.f143461l = EnumC13677r.f48475x;
        updateSettings.f143460k = true;
        updateSettings.f143451b = true;
        ImageHolder.Companion companion = ImageHolder.INSTANCE;
        ImageHolder imageHolderFrom = companion.from(C5489R.drawable.mapbox_user_icon);
        ImageHolder imageHolderFrom2 = companion.from(C5489R.drawable.mapbox_user_stroke_icon);
        ImageHolder imageHolderFrom3 = companion.from(AbstractC22207c.f86274o);
        C36502c c36502c = new C36502c("interpolate");
        m83324j0(c27585w, c36502c);
        updateSettings.f143450a = new C13662c(imageHolderFrom, imageHolderFrom2, imageHolderFrom3, c36502c.m116999b().toJson(), 16);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j0 */
    private static final C23454a0 m83324j0(C27585w c27585w, C36502c interpolate) {
        AbstractC22676k.m65750j(interpolate, "$this$interpolate");
        ArrayList arrayList = interpolate.f155939b;
        arrayList.add(new C36500a("linear").m116999b());
        arrayList.add(new C36500a("zoom").m116999b());
        m83325k0(c27585w, interpolate);
        m83326l0(c27585w, interpolate);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k0 */
    private static final C23454a0 m83325k0(C27585w c27585w, C36500a stop) {
        AbstractC22676k.m65750j(stop, "$this$stop");
        stop.m117000c(c27585w.SCALE_EXPERSSION_STOP_ONE_INPUT);
        stop.m117000c(c27585w.SCALE_EXPERSSION_STOP_ONE_OUTPUT);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l0 */
    private static final C23454a0 m83326l0(C27585w c27585w, C36500a stop) {
        AbstractC22676k.m65750j(stop, "$this$stop");
        stop.m117000c(c27585w.SCALE_EXPERSSION_STOP_TWO_INPUT);
        stop.m117000c(c27585w.SCALE_EXPERSSION_STOP_TWO_OUTPUT);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m0 */
    private final void m83327m0(float metersPerSecond) {
        Object objValueOf;
        try {
            UnitSystem unitSystem = this.unitSystem;
            int[] iArr = b.f111074a;
            float f13 = ((iArr[unitSystem.ordinal()] == 1 ? this.MINUTES_PER_MILE_AT_1_METER_PER_SECOND : this.MINUTES_PER_KM_AT_1_METER_PER_SECOND) / metersPerSecond) * 60.0f;
            if (60.0f > f13 || f13 > 3000.0f || this.lastDuration <= ChatClient.RESOLVE_DEPENDENCY_TIMEOUT) {
                AbstractC25087g abstractC25087g = this.binding;
                if (abstractC25087g != null) {
                    abstractC25087g.f98324f.setValueText("--:--");
                    return;
                } else {
                    AbstractC22676k.m65757q("binding");
                    throw null;
                }
            }
            int i13 = (int) (f13 / 60.0f);
            int i14 = (int) (f13 % 60.0f);
            if (i14 < 0 || i14 >= 10) {
                objValueOf = Integer.valueOf(i14);
            } else {
                objValueOf = UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE + i14;
            }
            String str = i13 + ":" + AbstractC39414r.m125866L0(2, objValueOf.toString()) + "/" + (iArr[this.unitSystem.ordinal()] == 1 ? "mi" : "km");
            AbstractC25087g abstractC25087g2 = this.binding;
            if (abstractC25087g2 == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            RealTimeCell realTimeCell = abstractC25087g2.f98324f;
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new RelativeSizeSpan(0.6f), str.length() - 3, str.length(), 33);
            realTimeCell.setValueText(spannableString);
        } catch (Exception e5) {
            this.logger.mo85230v("onPaceUpdate - Error while updating pace ", e5, new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: n0 */
    private final void m83328n0(List<GpsDto> gpsPoints) {
        if (gpsPoints != null && !gpsPoints.isEmpty()) {
            this.routePoints.clear();
        }
        this.kalmanFilter.m85310b();
        for (GpsDto gpsDto : gpsPoints) {
            if (m83314Z(gpsDto.toRoutePoint())) {
                C29019h.a aVarM85309a = this.kalmanFilter.m85309a(gpsDto.toRoutePoint());
                this.routePoints.add(Point.fromLngLat(aVarM85309a.getLocation().getLongitude(), aVarM85309a.getLocation().getLatitude()));
            }
        }
        m83292E0();
    }

    /* JADX INFO: renamed from: o0 */
    private final void m83329o0(C29019h controller) {
        final AbstractC1615p0 abstractC1615p0M88232H = controller.m88232H();
        abstractC1615p0M88232H.observe(getViewLifecycleOwner(), new InterfaceC1633v0() { // from class: o52.v
            @Override // androidx.lifecycle.InterfaceC1633v0
            public final void onChanged(Object obj) {
                C27585w.m83330p0(this.f111044w, abstractC1615p0M88232H, (List) obj);
            }
        });
        final int i13 = 0;
        m49109z(controller.m88241S().m122652B(C40634a.m131874a()).m122662L(new C3374c(new C27575r(this, 0), 22), new InterfaceC3255b(this) { // from class: o52.s

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C27585w f111021x;

            {
                this.f111021x = this;
            }

            @Override // bh3.InterfaceC3255b
            /* JADX INFO: renamed from: b */
            public final void mo9472b(Object obj) {
                switch (i13) {
                    case 0:
                        C27585w.m83333s0(this.f111021x, (Throwable) obj);
                        break;
                    case 1:
                        C27585w.m83336v0(this.f111021x, (Throwable) obj);
                        break;
                    default:
                        C27585w.m83339y0(this.f111021x, (Throwable) obj);
                        break;
                }
            }
        }));
        final int i14 = 1;
        m49109z(controller.m88235L().m122652B(C40634a.m131874a()).m122662L(new C3374c(new C27575r(this, 1), 23), new InterfaceC3255b(this) { // from class: o52.s

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C27585w f111021x;

            {
                this.f111021x = this;
            }

            @Override // bh3.InterfaceC3255b
            /* JADX INFO: renamed from: b */
            public final void mo9472b(Object obj) {
                switch (i14) {
                    case 0:
                        C27585w.m83333s0(this.f111021x, (Throwable) obj);
                        break;
                    case 1:
                        C27585w.m83336v0(this.f111021x, (Throwable) obj);
                        break;
                    default:
                        C27585w.m83339y0(this.f111021x, (Throwable) obj);
                        break;
                }
            }
        }));
        final int i15 = 2;
        m49109z(controller.m88242U().m122652B(C40634a.m131874a()).m122662L(new C3374c(new C27575r(this, 2), 24), new InterfaceC3255b(this) { // from class: o52.s

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C27585w f111021x;

            {
                this.f111021x = this;
            }

            @Override // bh3.InterfaceC3255b
            /* JADX INFO: renamed from: b */
            public final void mo9472b(Object obj) {
                switch (i15) {
                    case 0:
                        C27585w.m83333s0(this.f111021x, (Throwable) obj);
                        break;
                    case 1:
                        C27585w.m83336v0(this.f111021x, (Throwable) obj);
                        break;
                    default:
                        C27585w.m83339y0(this.f111021x, (Throwable) obj);
                        break;
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final void m83330p0(C27585w c27585w, AbstractC1615p0 abstractC1615p0, List it) {
        AbstractC22676k.m65750j(it, "it");
        if (it.isEmpty()) {
            return;
        }
        c27585w.m83328n0(it);
        abstractC1615p0.removeObservers(c27585w.getViewLifecycleOwner());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C23454a0 m83331q0(C27585w c27585w, C29019h.a aVar) {
        AbstractC22676k.m65747g(aVar);
        c27585w.m83318d0(aVar);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final void m83332r0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final void m83333s0(C27585w c27585w, Throwable th3) {
        InterfaceC34116n interfaceC34116n = c27585w.logger;
        AbstractC22676k.m65747g(th3);
        interfaceC34116n.mo85230v("Error occurred while updating location", th3, new AbstractC30556a.a[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final C23454a0 m83334t0(C27585w c27585w, Float f13) {
        AbstractC22676k.m65747g(f13);
        c27585w.m83315a0(f13.floatValue());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final void m83335u0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final void m83336v0(C27585w c27585w, Throwable th3) {
        InterfaceC34116n interfaceC34116n = c27585w.logger;
        AbstractC22676k.m65747g(th3);
        interfaceC34116n.mo85230v("Error occurred while updating distance", th3, new AbstractC30556a.a[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final C23454a0 m83337w0(C27585w c27585w, Float f13) {
        AbstractC22676k.m65747g(f13);
        c27585w.m83327m0(f13.floatValue());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final void m83338x0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final void m83339y0(C27585w c27585w, Throwable th3) {
        InterfaceC34116n interfaceC34116n = c27585w.logger;
        AbstractC22676k.m65747g(th3);
        interfaceC34116n.mo85230v("Error occurred while updating pace", th3, new AbstractC30556a.a[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final void m83340z0(C27585w c27585w, ViewStub viewStub, View view) {
        MapView mapView;
        AbstractC25095o abstractC25095o = (AbstractC25095o) AbstractC1177g.m3730a(view);
        c27585w.gpsMapBinding = abstractC25095o;
        c27585w.mapboxMap = (abstractC25095o == null || (mapView = abstractC25095o.f98348a) == null) ? null : mapView.getMapboxMapDeprecated();
        c27585w.m83319e0();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        AbstractC25087g abstractC25087gM73584c = AbstractC25087g.m73584c(inflater, container, false);
        AbstractC22676k.m65749i(abstractC25087gM73584c, "inflate(...)");
        this.binding = abstractC25087gM73584c;
        abstractC25087gM73584c.getRoot().setTag(2);
        AbstractC25087g abstractC25087g = this.binding;
        if (abstractC25087g == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        View root = abstractC25087g.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // hj0.AbstractC17348g, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onDestroy() {
        MapView mapView;
        super.onDestroy();
        AbstractC25095o abstractC25095o = this.gpsMapBinding;
        if (abstractC25095o == null || (mapView = abstractC25095o.f98348a) == null) {
            return;
        }
        InterfaceC13669j plugin = mapView.getPlugin("MAPBOX_LOCATION_COMPONENT_PLUGIN_ID");
        AbstractC22676k.m65747g(plugin);
        InterfaceC31840t listener = this.onIndicatorPositionChangedListener;
        AbstractC22676k.m65750j(listener, "listener");
        ((C31833m) plugin).f131883G.remove(listener);
    }

    @Override // hj0.AbstractC17348g, androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        getEventDispatcher().m129034f0("Activity Recording", AbstractC25247g0.m73989X(new C23465k("Label", "map")));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        UnitSystem unitSystem;
        Object objValueOf;
        Sport sport;
        UserProfile profile;
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        User userM84055f = C12723b.m35566a().m35572g().m84055f();
        if (userM84055f == null || (profile = userM84055f.getProfile()) == null || (unitSystem = profile.getUnitSystem()) == null) {
            unitSystem = UnitSystem.METRIC;
        }
        this.unitSystem = unitSystem;
        AbstractC25087g abstractC25087g = this.binding;
        if (abstractC25087g == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        C1172c0 c1172c0 = abstractC25087g.f98325g;
        ViewStubOnInflateListenerC27579t viewStubOnInflateListenerC27579t = new ViewStubOnInflateListenerC27579t(this, 0);
        if (c1172c0.f5325a != null) {
            c1172c0.f5328d = viewStubOnInflateListenerC27579t;
        }
        if (m83313Y().m67651b()) {
            AbstractC25087g abstractC25087g2 = this.binding;
            if (abstractC25087g2 == null) {
                AbstractC22676k.m65757q("binding");
                throw null;
            }
            ViewStub viewStub = abstractC25087g2.f98325g.f5325a;
            if (viewStub != null) {
                viewStub.inflate();
            }
        }
        AbstractActivityC1340r0 activity = getActivity();
        AbstractC22676k.m65748h(activity, "null cannot be cast to non-null type com.whoop.realtime.presentation.RealTimeRecordActivity");
        m49109z(((RealTimeRecordActivity) activity).getTimerSubject().m122652B(C40634a.m131874a()).m122661K(new C3374c(new C27575r(this, 3), 25)));
        AbstractActivityC1340r0 activity2 = getActivity();
        AbstractC22676k.m65748h(activity2, "null cannot be cast to non-null type com.whoop.realtime.presentation.RealTimeRecordActivity");
        m49109z(((RealTimeRecordActivity) activity2).m23840Q0().m122652B(C40634a.m131874a()).m122661K(new C3374c(new C27575r(this, 4), 26)));
        AbstractC25087g abstractC25087g3 = this.binding;
        if (abstractC25087g3 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC25087g3.f98322d.getValue().setAllCaps(false);
        AbstractC25087g abstractC25087g4 = this.binding;
        if (abstractC25087g4 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        abstractC25087g4.f98324f.getValue().setAllCaps(false);
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = requireActivity();
        ComponentCallbacks2C4966h componentCallbacks2C4966hM75569h = ComponentCallbacks2C4960b.m15528d(abstractActivityC1340r0RequireActivity).m75569h(abstractActivityC1340r0RequireActivity);
        Bundle arguments = getArguments();
        if (arguments == null || (sport = (Sport) arguments.getParcelable("sports")) == null || (objValueOf = sport.getIconUrl()) == null) {
            objValueOf = Integer.valueOf(AbstractC22207c.f86266g);
        }
        C4964f c4964fM15545i = componentCallbacks2C4966hM75569h.m15545i(Drawable.class);
        c4964fM15545i.f20321Y = objValueOf;
        c4964fM15545i.f20323a0 = true;
        C4964f c4964f = (C4964f) c4964fM15545i.m89319j(AbstractC22207c.f86266g);
        AbstractC25087g abstractC25087g5 = this.binding;
        if (abstractC25087g5 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        c4964f.m15537y(abstractC25087g5.f98324f.getIcon());
        AbstractC25087g abstractC25087g6 = this.binding;
        if (abstractC25087g6 != null) {
            abstractC25087g6.f98324f.getIcon().setColorFilter(AbstractC32122c.getColor(requireContext(), AbstractC36510a.f156043v));
        } else {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
    }
}
