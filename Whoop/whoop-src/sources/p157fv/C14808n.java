package p157fv;

import android.view.animation.PathInterpolator;
import com.mapbox.maps.MapboxMap;
import java.util.HashMap;
import p127ev.C13668i;
import p186h8.C16999a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fv.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C14808n {

    /* JADX INFO: renamed from: d */
    public static final C16999a f54986d;

    /* JADX INFO: renamed from: e */
    public static final HashMap f54987e;

    /* JADX INFO: renamed from: a */
    public final MapboxMap f54988a;

    /* JADX INFO: renamed from: b */
    public final MapboxMap f54989b;

    /* JADX INFO: renamed from: c */
    public final MapboxMap f54990c;

    static {
        new PathInterpolator(0.0f, 0.0f, 0.25f, 1.0f);
        f54986d = new C16999a(1);
        HashMap map = new HashMap();
        map.put(EnumC14804j.f54957E, C14807m.f54982x);
        map.put(EnumC14804j.f54962y, C14807m.f54983y);
        map.put(EnumC14804j.f54958F, C14807m.f54984z);
        map.put(EnumC14804j.f54963z, C14807m.f54979E);
        map.put(EnumC14804j.f54960w, C14807m.f54980F);
        map.put(EnumC14804j.f54961x, C14807m.f54981G);
        f54987e = map;
    }

    public C14808n(C13668i mapDelegateProvider) {
        AbstractC22676k.m65750j(mapDelegateProvider, "mapDelegateProvider");
        this.f54988a = (MapboxMap) mapDelegateProvider.f48457d;
        this.f54989b = (MapboxMap) mapDelegateProvider.f48456c;
        this.f54990c = (MapboxMap) mapDelegateProvider.f48455b;
    }

    /* JADX INFO: renamed from: a */
    public static final double m42555a(int i13, double d3, double d14, double d15) {
        double d16 = (((double) (i13 == 0 ? 1 : -1)) * 2.0164d * 2.0164d * d15 * d15) + ((d3 * d3) - (d14 * d14));
        double d17 = 2;
        if (i13 == 0) {
            d3 = d14;
        }
        double d18 = d16 / (((d17 * d3) * 2.0164d) * d15);
        return Math.log(Math.sqrt((d18 * d18) + ((double) 1)) - d18);
    }
}
