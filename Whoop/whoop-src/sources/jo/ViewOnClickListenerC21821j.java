package jo;

import android.animation.TypeEvaluator;
import android.view.View;
import android.widget.ListPopupWindow;
import androidx.health.platform.client.proto.C1533u;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.MercatorCoordinate;
import com.mapbox.maps.Size;
import com.mapbox.maps.util.CameraOptionsUtils;
import com.stripe.android.view.CardBrandView;
import com.whoop.android.R;
import com.whoop.community.presentation.login.JoinTeamActivity;
import com.whoop.community.presentation.p059ui.PillRadioGroup;
import com.whoop.community.presentation.teams.C6378e;
import com.whoop.community.presentation.teams.JoinTeamConfirmationActivity;
import com.whoop.p069ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity;
import com.whoop.whooplive.selfie.SelfieActivity;
import e93.AbstractC12888a;
import e93.AbstractC12889b;
import io.C18744f;
import io.C18745g;
import io.C20708t;
import io.C20709u;
import io.getstream.chat.android.p226ui.feature.channels.header.ChannelListHeaderView;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.internal.ReactionsAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import jq0.C21887b;
import mp0.C25831h0;
import o52.C27548d0;
import o52.C27563l;
import p000.AbstractC11266d;
import p087db.C11842c0;
import p157fv.C14802h;
import p157fv.C14803i;
import p157fv.C14808n;
import p157fv.C14810p;
import p157fv.EnumC14804j;
import p157fv.InterfaceC14795a;
import p176gv.AbstractC16218d;
import p176gv.C16219e;
import p176gv.C16220f;
import p176gv.C16221g;
import p176gv.C16222h;
import p176gv.C16223i;
import p186h8.C16999a;
import p289kv.C22839b;
import p289kv.C22841d;
import p309lo.AbstractC24555m;
import p309lo.AbstractC24567y;
import p465rm.C31571u;
import p465rm.InterfaceC31519b1;
import p690zr.AbstractC41032j0;
import p690zr.C41029i0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import rq0.C31656c1;
import wb3.AbstractC37056f;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: jo.j */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ViewOnClickListenerC21821j implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f84141w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f84142x;

    public /* synthetic */ ViewOnClickListenerC21821j(Object obj, int i13) {
        this.f84141w = i13;
        this.f84142x = obj;
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [fv.l] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        double dMax;
        int i13 = this.f84141w;
        Object obj = this.f84142x;
        switch (i13) {
            case 0:
                C21830s c21830s = ((C21822k) obj).f84144e;
                InterfaceC31519b1 interfaceC31519b1 = c21830s.f84215r0;
                if (interfaceC31519b1 == null) {
                    return;
                }
                C18744f c18744fM97213g0 = ((C31571u) interfaceC31519b1).m97213g0();
                HashMap map = new HashMap(c18744fM97213g0.f77575X.f77530w);
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    if (AbstractC24555m.m71613g(((C20708t) it.next()).f77527w.f136262y[0].f130077L) == 1) {
                        it.remove();
                    }
                }
                C20709u c20709u = new C20709u(map);
                HashSet hashSet = new HashSet(c18744fM97213g0.f77576Y);
                hashSet.remove(1);
                InterfaceC31519b1 interfaceC31519b2 = c21830s.f84215r0;
                int i14 = AbstractC24567y.f95875a;
                C18745g c18745g = new C18745g(c18744fM97213g0);
                c18745g.f77554x = c20709u;
                c18745g.mo54512c(hashSet);
                ((C31571u) interfaceC31519b2).m97227v0(c18745g.mo54511a());
                c21830s.f84171J0.f38748c[1] = c21830s.getResources().getString(R.string.exo_track_selection_auto);
                c21830s.f84175L0.dismiss();
                return;
            case 1:
                C21826o c21826o = (C21826o) obj;
                C21830s c21830s2 = c21826o.f84149d;
                int adapterPosition = c21826o.getAdapterPosition();
                if (adapterPosition == 0) {
                    c21830s2.m61759d(c21830s2.f84173K0);
                    return;
                } else if (adapterPosition == 1) {
                    c21830s2.m61759d(c21830s2.f84183P0);
                    return;
                } else {
                    c21830s2.f84175L0.dismiss();
                    return;
                }
            case 2:
                C21830s c21830s3 = ((C21822k) obj).f84144e;
                InterfaceC31519b1 interfaceC31519b3 = c21830s3.f84215r0;
                if (interfaceC31519b3 != null) {
                    C18744f c18744fM97213g1 = ((C31571u) interfaceC31519b3).m97213g0();
                    InterfaceC31519b1 interfaceC31519b4 = c21830s3.f84215r0;
                    c18744fM97213g1.getClass();
                    C18745g c18745g2 = new C18745g(c18744fM97213g1);
                    C41029i0 c41029i0 = new C41029i0(4);
                    AbstractC41032j0 abstractC41032j0 = c18744fM97213g1.f77576Y;
                    abstractC41032j0.getClass();
                    c41029i0.m133224c(abstractC41032j0);
                    c41029i0.m133222a(3);
                    c18745g2.mo54512c(c41029i0.m133261f());
                    ((C31571u) interfaceC31519b4).m97227v0(c18745g2.mo54511a());
                    c21830s3.f84175L0.dismiss();
                    return;
                }
                return;
            case 3:
                C11842c0 c11842c0 = (C11842c0) obj;
                c11842c0.m31794i();
                if (view.getId() == R.id.exo_overflow_show) {
                    c11842c0.f38609q.start();
                    return;
                } else {
                    if (view.getId() == R.id.exo_overflow_hide) {
                        c11842c0.f38610r.start();
                        return;
                    }
                    return;
                }
            case 4:
                C21887b.m62109b((C21887b) obj, view);
                return;
            case 5:
                C22841d c22841d = ((C22839b) obj).f90044w;
                if (c22841d != null) {
                    Double dValueOf = Double.valueOf(0.0d);
                    if (c22841d.f90049H.f96815K) {
                        InterfaceC14795a interfaceC14795a = c22841d.f90047F;
                        if (interfaceC14795a != null) {
                            CameraOptions cameraOptionsBuild = new CameraOptions.Builder().bearing(dValueOf).build();
                            AbstractC22676k.m65749i(cameraOptionsBuild, "Builder().bearing(DEFAULT_BEARING).build()");
                            C14810p c14810p = new C14810p("Maps-Compass", 300L, null);
                            C14802h c14802h = (C14802h) interfaceC14795a;
                            if (CameraOptionsUtils.isEmpty(cameraOptionsBuild)) {
                                MapboxLogger.logW("Mbgl-CameraManager", "No-op flyTo camera high-level animation as CameraOptions.isEmpty == true.");
                            } else {
                                final C14808n c14808n = c14802h.f54948U;
                                if (c14808n == null) {
                                    AbstractC22676k.m65757q("cameraAnimationsFactory");
                                    throw null;
                                }
                                C16999a c16999a = C14808n.f54986d;
                                MapboxMap mapboxMap = c14808n.f54988a;
                                MapboxMap mapboxMap2 = c14808n.f54989b;
                                MapboxMap mapboxMap3 = c14808n.f54990c;
                                CameraState cameraState = mapboxMap3.getCameraState();
                                EdgeInsets padding = cameraState.getPadding();
                                AbstractC22676k.m65749i(padding, "currentCameraState.padding");
                                EdgeInsets padding2 = cameraOptionsBuild.getPadding();
                                if (padding2 == null) {
                                    padding2 = padding;
                                }
                                Point center = cameraOptionsBuild.getCenter();
                                if (center == null) {
                                    center = cameraState.getCenter();
                                }
                                AbstractC22676k.m65749i(center, "cameraOptions.center ?: currentCameraState.center");
                                Point pointM121461M = AbstractC37926s0.m121461M(center);
                                Double zoom = cameraOptionsBuild.getZoom();
                                if (zoom == null) {
                                    zoom = Double.valueOf(cameraState.getZoom());
                                }
                                double dDoubleValue = zoom.doubleValue();
                                Double bearing = cameraOptionsBuild.getBearing();
                                if (bearing == null) {
                                    bearing = Double.valueOf(cameraState.getBearing());
                                }
                                double dDoubleValue2 = bearing.doubleValue();
                                double pitch = cameraState.getPitch();
                                Double pitch2 = cameraOptionsBuild.getPitch();
                                if (pitch2 == null) {
                                    pitch2 = Double.valueOf(pitch);
                                }
                                double dDoubleValue3 = pitch2.doubleValue();
                                double bearing2 = cameraState.getBearing();
                                EdgeInsets edgeInsets = padding2;
                                final double dPow = Math.pow(2.0d, cameraState.getZoom());
                                final double dLog = Math.log(dPow) / AbstractC12888a.f44372a;
                                double dM36282l = AbstractC12889b.m36282l(dDoubleValue, mapboxMap3.getBounds().getMinZoom(), mapboxMap3.getBounds().getMaxZoom());
                                Point center2 = cameraState.getCenter();
                                AbstractC22676k.m65749i(center2, "currentCameraState.center");
                                Point pointM121458J = AbstractC37926s0.m121458J(AbstractC37926s0.m121461M(center2), pointM121461M);
                                final MercatorCoordinate mercatorCoordinateProject = mapboxMap2.project(pointM121458J, dPow);
                                final MercatorCoordinate mercatorCoordinateProject2 = mapboxMap2.project(pointM121461M, dPow);
                                Size size = mapboxMap.getSize();
                                float pixelRatio = mapboxMap.getMapOptions().getPixelRatio();
                                if (size.getWidth() == edgeInsets.getRight() + edgeInsets.getLeft() || size.getHeight() == edgeInsets.getTop() + edgeInsets.getBottom()) {
                                    double d3 = pixelRatio;
                                    dMax = Math.max(((double) size.getWidth()) / d3, ((double) size.getHeight()) / d3);
                                } else {
                                    double d14 = pixelRatio;
                                    dMax = Math.max(((((double) size.getWidth()) - edgeInsets.getLeft()) - edgeInsets.getRight()) / d14, ((((double) size.getHeight()) - edgeInsets.getTop()) - edgeInsets.getBottom()) / d14);
                                }
                                final double d15 = dMax;
                                final double dPow2 = d15 / Math.pow(2.0d, dM36282l - dLog);
                                final double dHypot = Math.hypot(AbstractC37926s0.m121449A(mercatorCoordinateProject2, mercatorCoordinateProject).getX(), AbstractC37926s0.m121449A(mercatorCoordinateProject2, mercatorCoordinateProject).getY());
                                final double dM42555a = dHypot == 0.0d ? Double.POSITIVE_INFINITY : C14808n.m42555a(0, dPow2, d15, dHypot);
                                double dM42555a2 = dHypot != 0.0d ? C14808n.m42555a(1, dPow2, d15, dHypot) : Double.POSITIVE_INFINITY;
                                boolean z4 = Math.abs(dHypot) < 1.0E-6d || Double.isInfinite(dM42555a) || Double.isInfinite(dM42555a2);
                                final double dAbs = (z4 ? Math.abs(Math.log(dPow2 / d15)) : dM42555a2 - dM42555a) / 1.42d;
                                final boolean z13 = z4;
                                TypeEvaluator typeEvaluator = new TypeEvaluator() { // from class: fv.k
                                    @Override // android.animation.TypeEvaluator
                                    public final Object evaluate(float f13, Object obj2, Object obj3) {
                                        double dTanh;
                                        if (Float.isNaN(f13)) {
                                            f13 = 0.0f;
                                        }
                                        double d16 = ((double) f13) * dAbs;
                                        if (f13 == 1.0f) {
                                            dTanh = 1.0d;
                                        } else if (z13) {
                                            dTanh = 0.0d;
                                        } else {
                                            double d17 = dM42555a;
                                            dTanh = ((((Math.tanh((1.42d * d16) + d17) * Math.cosh(d17)) - Math.sinh(d17)) * d15) / 2.0164d) / dHypot;
                                        }
                                        MercatorCoordinate mercatorCoordinate = mercatorCoordinateProject;
                                        double x3 = mercatorCoordinate.getX();
                                        MercatorCoordinate mercatorCoordinate2 = mercatorCoordinateProject2;
                                        return c14808n.f54989b.unproject(new MercatorCoordinate(((mercatorCoordinate2.getX() - mercatorCoordinate.getX()) * dTanh) + x3, ((mercatorCoordinate2.getY() - mercatorCoordinate.getY()) * dTanh) + mercatorCoordinate.getY()), dPow);
                                    }
                                };
                                Object[] targets = Arrays.copyOf(new Point[]{pointM121461M}, 1);
                                AbstractC22676k.m65750j(targets, "targets");
                                C14803i c14803i = new C14803i(Arrays.copyOf(targets, targets.length), pointM121458J, null);
                                HashMap map2 = C14808n.f54987e;
                                C16220f c16220f = new C16220f(typeEvaluator, c14803i, (Function1) map2.get(EnumC14804j.f54960w));
                                ?? r14 = new TypeEvaluator(c14808n, dAbs, dLog, z13, dPow2, d15, dM42555a) { // from class: fv.l

                                    /* JADX INFO: renamed from: a */
                                    public final /* synthetic */ double f54973a;

                                    /* JADX INFO: renamed from: b */
                                    public final /* synthetic */ double f54974b;

                                    /* JADX INFO: renamed from: c */
                                    public final /* synthetic */ boolean f54975c;

                                    /* JADX INFO: renamed from: d */
                                    public final /* synthetic */ double f54976d;

                                    /* JADX INFO: renamed from: e */
                                    public final /* synthetic */ double f54977e;

                                    /* JADX INFO: renamed from: f */
                                    public final /* synthetic */ double f54978f;

                                    {
                                        this.f54973a = dAbs;
                                        this.f54974b = dLog;
                                        this.f54975c = z13;
                                        this.f54976d = dPow2;
                                        this.f54977e = d15;
                                        this.f54978f = dM42555a;
                                    }

                                    @Override // android.animation.TypeEvaluator
                                    public final Object evaluate(float f13, Object obj2, Object obj3) {
                                        double dCosh;
                                        if (Float.isNaN(f13)) {
                                            f13 = 0.0f;
                                        }
                                        double d16 = ((double) f13) * this.f54973a;
                                        double d17 = 1;
                                        if (this.f54975c) {
                                            dCosh = Math.exp(((double) (this.f54976d < this.f54977e ? -1 : 1)) * 1.42d * d16);
                                        } else {
                                            double d18 = this.f54978f;
                                            dCosh = Math.cosh(d18) / Math.cosh((1.42d * d16) + d18);
                                        }
                                        return Double.valueOf((Math.log(d17 / dCosh) / AbstractC12888a.f44372a) + this.f54974b);
                                    }
                                };
                                Object[] targets2 = Arrays.copyOf(new Double[]{Double.valueOf(dM36282l)}, 1);
                                AbstractC22676k.m65750j(targets2, "targets");
                                ArrayList arrayListM118964P = AbstractC37056f.m118964P(c16220f, new C16223i(r14, new C14803i(Arrays.copyOf(targets2, targets2.length), Double.valueOf(dLog), null), (Function1) map2.get(EnumC14804j.f54961x)));
                                if (dDoubleValue2 != bearing2) {
                                    Object[] targets3 = Arrays.copyOf(new Double[]{Double.valueOf(dDoubleValue2)}, 1);
                                    AbstractC22676k.m65750j(targets3, "targets");
                                    arrayListM118964P.add(new C16219e(new C14803i(Arrays.copyOf(targets3, targets3.length), Double.valueOf(bearing2), null), (Function1) map2.get(EnumC14804j.f54962y)));
                                }
                                if (dDoubleValue3 != pitch) {
                                    Object[] targets4 = Arrays.copyOf(new Double[]{Double.valueOf(dDoubleValue3)}, 1);
                                    AbstractC22676k.m65750j(targets4, "targets");
                                    arrayListM118964P.add(new C16222h(new C14803i(Arrays.copyOf(targets4, targets4.length), Double.valueOf(pitch), null), (Function1) map2.get(EnumC14804j.f54963z)));
                                }
                                if (!edgeInsets.equals(padding)) {
                                    Object[] targets5 = Arrays.copyOf(new EdgeInsets[]{edgeInsets}, 1);
                                    AbstractC22676k.m65750j(targets5, "targets");
                                    arrayListM118964P.add(new C16221g(new C14803i(Arrays.copyOf(targets5, targets5.length), padding, null), (Function1) map2.get(EnumC14804j.f54958F)));
                                }
                                Object[] array = arrayListM118964P.toArray(new AbstractC16218d[0]);
                                AbstractC22676k.m65748h(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                c14802h.m42554l((AbstractC16218d[]) array, c14810p, null);
                            }
                        } else {
                            MapboxMap mapboxMap4 = c22841d.f90054z;
                            if (mapboxMap4 == null) {
                                AbstractC22676k.m65757q("mapCameraManager");
                                throw null;
                            }
                            CameraOptions cameraOptionsBuild2 = new CameraOptions.Builder().bearing(dValueOf).build();
                            AbstractC22676k.m65749i(cameraOptionsBuild2, "Builder().bearing(DEFAULT_BEARING).build()");
                            mapboxMap4.setCamera(cameraOptionsBuild2);
                        }
                        Iterator it3 = c22841d.f90050I.iterator();
                        if (it3.hasNext()) {
                            throw AbstractC11266d.m30454h(it3);
                        }
                        return;
                    }
                    return;
                }
                return;
            case 6:
                C25831h0.m76227o0((C25831h0) obj, view);
                return;
            case 7:
                C27563l.m83177N((C27563l) obj, view);
                return;
            case 8:
                C27548d0.m83124Y((C27548d0) obj, view);
                return;
            case 9:
                ((JoinTeamActivity) obj).m19349U(view);
                return;
            case 10:
                int i15 = ChannelListHeaderView.f74479w;
                ((ChannelListHeaderView.ActionButtonClickListener) obj).onClick();
                return;
            case 11:
                int i16 = ChannelListHeaderView.f74479w;
                ((ChannelListHeaderView.UserAvatarClickListener) obj).onUserAvatarClick();
                return;
            case 12:
                BleConnectStrapActivity.m27097h1((BleConnectStrapActivity) obj, view);
                return;
            case 13:
                ((JoinTeamConfirmationActivity) obj).m19417N(view);
                return;
            case 14:
                C6378e.m19527a0((C6378e) obj, view);
                return;
            case 15:
                C31656c1.m97911f((C31656c1) obj, view);
                return;
            case 16:
                ListPopupWindow listPopupWindow = ((CardBrandView) obj).f22476y;
                if (listPopupWindow.isShowing()) {
                    listPopupWindow.dismiss();
                    return;
                } else {
                    listPopupWindow.show();
                    return;
                }
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                PillRadioGroup.m19538g((PillRadioGroup) obj, view);
                return;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                ((SelfieActivity) obj).m28872t1(view);
                return;
            default:
                ReactionsAdapter.ReactionViewHolder._init_$lambda$1((ReactionsAdapter.ReactionViewHolder) obj, view);
                return;
        }
    }
}
