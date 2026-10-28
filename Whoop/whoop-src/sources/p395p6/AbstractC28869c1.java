package p395p6;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.RemoteViews;
import com.whoop.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25272z;
import ov2.C28402f;
import p008a7.AbstractC0514e;
import p008a7.C0510a;
import p008a7.C0511b;
import p008a7.C0512c;
import p008a7.C0513d;
import p031b9.AbstractC2875y;
import p079d2.AbstractC11480b;
import p088dc.AbstractC11894a;
import p335n6.InterfaceC26398o;
import p545v6.C35712a;
import p545v6.C35713b;
import p545v6.C35714c;
import p545v6.C35725n;
import p545v6.C35733v;
import p550vd.AbstractC35903f;
import p715kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: p6.c1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC28869c1 {

    /* JADX INFO: renamed from: a */
    public static final Object f116844a = AbstractC25247g0.m73990Y(new C23465k(EnumC28881g1.f116909z, Integer.valueOf(R.layout.glance_text)), new C23465k(EnumC28881g1.f116880E, Integer.valueOf(R.layout.glance_list)), new C23465k(EnumC28881g1.f116881F, Integer.valueOf(R.layout.glance_check_box)), new C23465k(EnumC28881g1.f116882G, Integer.valueOf(R.layout.glance_check_box_backport)), new C23465k(EnumC28881g1.f116883H, Integer.valueOf(R.layout.glance_button)), new C23465k(EnumC28881g1.f116893R, Integer.valueOf(R.layout.glance_swtch)), new C23465k(EnumC28881g1.f116894S, Integer.valueOf(R.layout.glance_swtch_backport)), new C23465k(EnumC28881g1.f116884I, Integer.valueOf(R.layout.glance_frame)), new C23465k(EnumC28881g1.f116895T, Integer.valueOf(R.layout.glance_image_crop)), new C23465k(EnumC28881g1.f116898W, Integer.valueOf(R.layout.glance_image_crop_decorative)), new C23465k(EnumC28881g1.f116896U, Integer.valueOf(R.layout.glance_image_fit)), new C23465k(EnumC28881g1.f116899X, Integer.valueOf(R.layout.glance_image_fit_decorative)), new C23465k(EnumC28881g1.f116897V, Integer.valueOf(R.layout.glance_image_fill_bounds)), new C23465k(EnumC28881g1.f116900Y, Integer.valueOf(R.layout.glance_image_fill_bounds_decorative)), new C23465k(EnumC28881g1.f116885J, Integer.valueOf(R.layout.glance_linear_progress_indicator)), new C23465k(EnumC28881g1.f116886K, Integer.valueOf(R.layout.glance_circular_progress_indicator)), new C23465k(EnumC28881g1.f116887L, Integer.valueOf(R.layout.glance_vertical_grid_one_column)), new C23465k(EnumC28881g1.f116888M, Integer.valueOf(R.layout.glance_vertical_grid_two_columns)), new C23465k(EnumC28881g1.f116889N, Integer.valueOf(R.layout.glance_vertical_grid_three_columns)), new C23465k(EnumC28881g1.f116890O, Integer.valueOf(R.layout.glance_vertical_grid_four_columns)), new C23465k(EnumC28881g1.f116891P, Integer.valueOf(R.layout.glance_vertical_grid_five_columns)), new C23465k(EnumC28881g1.f116892Q, Integer.valueOf(R.layout.glance_vertical_grid_auto_fit)), new C23465k(EnumC28881g1.f116901Z, Integer.valueOf(R.layout.glance_radio_button)), new C23465k(EnumC28881g1.f116902a0, Integer.valueOf(R.layout.glance_radio_button_backport)));

    /* JADX INFO: renamed from: b */
    public static final int f116845b;

    /* JADX INFO: renamed from: c */
    public static final int f116846c;

    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, java.util.Map] */
    static {
        int size = AbstractC28865b0.f116808f.size();
        f116845b = size;
        f116846c = Build.VERSION.SDK_INT >= 31 ? AbstractC28865b0.f116810h : AbstractC28865b0.f116810h / size;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public static final C28896l1 m87787a(C28932x1 c28932x1, InterfaceC26398o interfaceC26398o, int i13) {
        Context context = c28932x1.f117049a;
        Integer numValueOf = Integer.valueOf(R.id.rootStubId);
        int i14 = 0;
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 31) {
            int i16 = AbstractC28865b0.f116810h;
            if (i13 >= i16) {
                throw new IllegalArgumentException(AbstractC2875y.m8294g(i16, i13, "Index of the root view cannot be more than ", ", currently ").toString());
            }
            EnumC28872d1 enumC28872d1 = EnumC28872d1.f116857w;
            C28926v1 c28926v1 = new C28926v1(enumC28872d1, enumC28872d1);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), AbstractC28865b0.f116809g + i13);
            C35733v c35733v = (C35733v) interfaceC26398o.mo78097a(null, C28866b1.f116832z);
            int i17 = R.id.rootView;
            if (c35733v != null) {
                AbstractC35903f.m114012g(remoteViews, c35733v, R.id.rootView);
            }
            C35725n c35725n = (C35725n) interfaceC26398o.mo78097a(null, C28866b1.f116813E);
            if (c35725n != null) {
                AbstractC35903f.m114011f(remoteViews, c35725n, R.id.rootView);
            }
            if (i15 >= 33) {
                remoteViews.removeAllViews(R.id.rootView);
            }
            return new C28896l1(remoteViews, new C28931x0(i17, i15 >= 33 ? C25272z.f99163w : AbstractC25247g0.m73989X(new C23465k(0, AbstractC25247g0.m73989X(new C23465k(c28926v1, numValueOf)))), i14, 2));
        }
        int i18 = f116845b * i13;
        int i19 = AbstractC28865b0.f116810h;
        if (i18 >= i19) {
            throw new IllegalArgumentException(("Index of the root view cannot be more than " + (i19 / 4) + ", currently " + i13).toString());
        }
        C35733v c35733v2 = (C35733v) interfaceC26398o.mo78097a(null, C28866b1.f116830x);
        AbstractC0514e abstractC0514e = C0513d.f1722a;
        AbstractC0514e abstractC0514e2 = c35733v2 != null ? c35733v2.f151984a : abstractC0514e;
        C35725n c35725n2 = (C35725n) interfaceC26398o.mo78097a(null, C28866b1.f116831y);
        if (c35725n2 != null) {
            abstractC0514e = c35725n2.f151971a;
        }
        C0512c c0512c = C0512c.f1721a;
        EnumC28872d1 enumC28872d2 = abstractC0514e2.equals(c0512c) ? EnumC28872d1.f116860z : EnumC28872d1.f116857w;
        EnumC28872d1 enumC28872d3 = abstractC0514e.equals(c0512c) ? EnumC28872d1.f116860z : EnumC28872d1.f116857w;
        EnumC28872d1 enumC28872d4 = EnumC28872d1.f116858x;
        C28926v1 c28926v2 = new C28926v1(enumC28872d2 == enumC28872d4 ? EnumC28872d1.f116857w : enumC28872d2, enumC28872d3 == enumC28872d4 ? EnumC28872d1.f116857w : enumC28872d3);
        Integer num = (Integer) AbstractC28865b0.f116808f.get(c28926v2);
        if (num != null) {
            return new C28896l1(new RemoteViews(context.getPackageName(), i18 + AbstractC28865b0.f116809g + num.intValue()), new C28931x0(i14, AbstractC25247g0.m73989X(new C23465k(0, AbstractC25247g0.m73989X(new C23465k(c28926v2, numValueOf)))), i14, 3));
        }
        throw new IllegalStateException("Cannot find root element for size [" + enumC28872d2 + ", " + enumC28872d3 + ']');
    }

    /* JADX INFO: renamed from: b */
    public static final C28931x0 m87788b(RemoteViews remoteViews, C28932x1 c28932x1, EnumC28881g1 enumC28881g1, int i13, InterfaceC26398o interfaceC26398o, C35712a c35712a, C35713b c35713b) {
        int iIntValue;
        if (i13 > 10) {
            Log.e("GlanceAppWidget", "Truncated " + enumC28881g1 + " container from " + i13 + " to 10 elements", new IllegalArgumentException(enumC28881g1 + " container cannot have more than 10 elements"));
        }
        int i14 = i13 <= 10 ? i13 : 10;
        Integer numM87792f = m87792f(enumC28881g1, interfaceC26398o);
        if (numM87792f != null) {
            iIntValue = numM87792f.intValue();
        } else {
            C28912r c28912r = (C28912r) AbstractC28865b0.f116803a.get(new C28915s(enumC28881g1, i14, c35712a, c35713b));
            Integer numValueOf = c28912r != null ? Integer.valueOf(c28912r.f117013a) : null;
            if (numValueOf == null) {
                throw new IllegalArgumentException("Cannot find container " + enumC28881g1 + " with " + i13 + " children");
            }
            iIntValue = numValueOf.intValue();
        }
        Map map = (Map) AbstractC28865b0.f116804b.get(enumC28881g1);
        if (map == null) {
            throw new IllegalArgumentException("Cannot find generated children for " + enumC28881g1);
        }
        C28931x0 c28931x0M87790d = m87790d(remoteViews, c28932x1, iIntValue, interfaceC26398o);
        int i15 = c28931x0M87790d.f117046a;
        C28931x0 c28931x0 = new C28931x0(map, i15, c28931x0M87790d.f117047b);
        if (Build.VERSION.SDK_INT >= 33) {
            remoteViews.removeAllViews(i15);
        }
        return c28931x0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: c */
    public static final C28931x0 m87789c(RemoteViews remoteViews, C28932x1 c28932x1, EnumC28881g1 enumC28881g1, InterfaceC26398o interfaceC26398o) {
        Integer numM87792f = m87792f(enumC28881g1, interfaceC26398o);
        if (numM87792f != null || (numM87792f = (Integer) f116844a.get(enumC28881g1)) != null) {
            return m87790d(remoteViews, c28932x1, numM87792f.intValue(), interfaceC26398o);
        }
        throw new IllegalArgumentException("Cannot use `insertView` with a container like " + enumC28881g1);
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: d */
    public static final C28931x0 m87790d(RemoteViews remoteViews, C28932x1 c28932x1, int i13, InterfaceC26398o interfaceC26398o) {
        Integer numValueOf;
        int iIntValue;
        int i14 = c28932x1.f117053e;
        Map map = null;
        C35733v c35733v = (C35733v) interfaceC26398o.mo78097a(null, C28866b1.f116814F);
        AbstractC0514e abstractC0514e = C0513d.f1722a;
        AbstractC0514e abstractC0514e2 = c35733v != null ? c35733v.f151984a : abstractC0514e;
        C35725n c35725n = (C35725n) interfaceC26398o.mo78097a(null, C28866b1.f116815G);
        if (c35725n != null) {
            abstractC0514e = c35725n.f151971a;
        }
        if (interfaceC26398o.mo78098b(new C28402f(26))) {
            numValueOf = null;
        } else {
            if (c28932x1.f117057i.getAndSet(true)) {
                throw new IllegalStateException("At most one view can be set as AppWidgetBackground.");
            }
            numValueOf = Integer.valueOf(android.R.id.background);
        }
        int i15 = Build.VERSION.SDK_INT;
        int i16 = 6;
        int i17 = 0;
        if (i15 >= 33) {
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                int iIncrementAndGet = c28932x1.f117055g.incrementAndGet();
                if (iIncrementAndGet >= AbstractC28865b0.f116812j) {
                    throw new IllegalStateException("There are too many views");
                }
                iIntValue = iIncrementAndGet + AbstractC28865b0.f116811i;
            }
            RemoteViews remoteViewsM30890p = AbstractC11480b.m30890p(i13, iIntValue, c28932x1.f117049a.getPackageName());
            int i18 = c28932x1.f117056h.f117046a;
            if (i15 >= 31) {
                AbstractC11480b.m30875a(remoteViews, i18, remoteViewsM30890p, i14);
            } else {
                remoteViews.addView(i18, remoteViewsM30890p);
            }
            return new C28931x0(iIntValue, map, i17, i16);
        }
        if (i15 >= 31) {
            C0511b c0511b = C0511b.f1720a;
            return new C28931x0(AbstractC11894a.m31937E(remoteViews, c28932x1, m87791e(remoteViews, c28932x1, i14, abstractC0514e2.equals(c0511b) ? EnumC28872d1.f116859y : EnumC28872d1.f116857w, abstractC0514e.equals(c0511b) ? EnumC28872d1.f116859y : EnumC28872d1.f116857w), i13, numValueOf), map, i17, i16);
        }
        EnumC28872d1 enumC28872d1M87793g = m87793g(abstractC0514e2);
        EnumC28872d1 enumC28872d1M87793g2 = m87793g(abstractC0514e);
        int iM87791e = m87791e(remoteViews, c28932x1, i14, enumC28872d1M87793g, enumC28872d1M87793g2);
        EnumC28872d1 enumC28872d1 = EnumC28872d1.f116858x;
        if (enumC28872d1M87793g != enumC28872d1 && enumC28872d1M87793g2 != enumC28872d1) {
            return new C28931x0(AbstractC11894a.m31937E(remoteViews, c28932x1, iM87791e, i13, numValueOf), map, i17, i16);
        }
        C28863a1 c28863a1 = (C28863a1) AbstractC28865b0.f116807e.get(new C28926v1(enumC28872d1M87793g, enumC28872d1M87793g2));
        if (c28863a1 != null) {
            return new C28931x0(AbstractC11894a.m31937E(remoteViews, c28932x1, R.id.glanceViewStub, i13, numValueOf), map, AbstractC11894a.m31937E(remoteViews, c28932x1, iM87791e, c28863a1.f116801a, null), 4);
        }
        throw new IllegalArgumentException("Could not find complex layout for width=" + enumC28872d1M87793g + ", height=" + enumC28872d1M87793g2);
    }

    /* JADX INFO: renamed from: e */
    public static final int m87791e(RemoteViews remoteViews, C28932x1 c28932x1, int i13, EnumC28872d1 enumC28872d1, EnumC28872d1 enumC28872d2) {
        EnumC28872d1 enumC28872d3 = EnumC28872d1.f116858x;
        C28926v1 c28926v1 = new C28926v1(enumC28872d1 == enumC28872d3 ? EnumC28872d1.f116857w : enumC28872d1, enumC28872d2 == enumC28872d3 ? EnumC28872d1.f116857w : enumC28872d2);
        Map map = (Map) c28932x1.f117056h.f117048c.get(Integer.valueOf(i13));
        if (map == null) {
            throw new IllegalStateException(AbstractC2875y.m8295h(i13, "Parent doesn't have child position "));
        }
        Integer num = (Integer) map.get(c28926v1);
        if (num == null) {
            throw new IllegalStateException("No child for position " + i13 + " and size " + enumC28872d1 + " x " + enumC28872d2);
        }
        int iIntValue = num.intValue();
        Collection collectionValues = map.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((Number) obj).intValue() != iIntValue) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC11894a.m31937E(remoteViews, c28932x1, ((Number) it.next()).intValue(), R.layout.glance_deleted_view, Integer.valueOf(R.id.deletedViewId));
        }
        return iIntValue;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: f */
    public static final Integer m87792f(EnumC28881g1 enumC28881g1, InterfaceC26398o interfaceC26398o) {
        if (Build.VERSION.SDK_INT >= 33) {
            C28861a c28861a = (C28861a) interfaceC26398o.mo78097a(null, C28866b1.f116816H);
            C35733v c35733v = (C35733v) interfaceC26398o.mo78097a(null, C28866b1.f116817I);
            C0511b c0511b = C0511b.f1720a;
            boolean zEquals = c35733v != null ? c35733v.f151984a.equals(c0511b) : false;
            C35725n c35725n = (C35725n) interfaceC26398o.mo78097a(null, C28866b1.f116818J);
            boolean zEquals2 = c35725n != null ? c35725n.f151971a.equals(c0511b) : false;
            if (c28861a != null) {
                C35714c c35714c = c28861a.f116799a;
                C28863a1 c28863a1 = (C28863a1) AbstractC28865b0.f116805c.get(new C28906p(enumC28881g1, c35714c.f151949a, c35714c.f151950b));
                if (c28863a1 != null) {
                    return Integer.valueOf(c28863a1.f116801a);
                }
                throw new IllegalArgumentException("Cannot find " + enumC28881g1 + " with alignment " + c35714c);
            }
            if (zEquals || zEquals2) {
                C28863a1 c28863a2 = (C28863a1) AbstractC28865b0.f116806d.get(new C28902n1(enumC28881g1, zEquals, zEquals2));
                if (c28863a2 != null) {
                    return Integer.valueOf(c28863a2.f116801a);
                }
                throw new IllegalArgumentException("Cannot find " + enumC28881g1 + " with defaultWeight set");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static final EnumC28872d1 m87793g(AbstractC0514e abstractC0514e) {
        if (abstractC0514e instanceof C0513d) {
            return EnumC28872d1.f116857w;
        }
        if (abstractC0514e instanceof C0511b) {
            return EnumC28872d1.f116859y;
        }
        if (abstractC0514e instanceof C0512c) {
            return EnumC28872d1.f116860z;
        }
        if (abstractC0514e instanceof C0510a) {
            return EnumC28872d1.f116858x;
        }
        throw new NoWhenBranchMatchedException();
    }
}
