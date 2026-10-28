package p457rc;

import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p218ic.C18389w;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: rc.f */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC31223f {

    /* JADX INFO: renamed from: a */
    public static final int[] f128600a = {13, 15, 14};

    /* JADX INFO: renamed from: a */
    public static C31222e m96162a(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i13 : iArr) {
            try {
                builder.addCapability(i13);
            } catch (IllegalArgumentException e5) {
                C18389w c18389wM52886d = C18389w.m52886d();
                String str = C31222e.f128598b;
                String str2 = C31222e.f128598b;
                String strM95639o = AbstractC31061c.m95639o("Ignoring adding capability '", i13, '\'');
                if (c18389wM52886d.f71556a <= 5) {
                    Log.w(str2, strM95639o, e5);
                }
            }
        }
        for (int i14 = 0; i14 < 3; i14++) {
            int i15 = f128600a[i14];
            if (!AbstractC25260n.m74054Z(iArr, i15)) {
                try {
                    builder.removeCapability(i15);
                } catch (IllegalArgumentException e13) {
                    C18389w c18389wM52886d2 = C18389w.m52886d();
                    String str3 = C31222e.f128598b;
                    String str4 = C31222e.f128598b;
                    String strM95639o2 = AbstractC31061c.m95639o("Ignoring removing default capability '", i15, '\'');
                    if (c18389wM52886d2.f71556a <= 5) {
                        Log.w(str4, strM95639o2, e13);
                    }
                }
            }
        }
        for (int i16 : iArr2) {
            builder.addTransportType(i16);
        }
        NetworkRequest networkRequestBuild = builder.build();
        AbstractC22676k.m65749i(networkRequestBuild, "build(...)");
        return new C31222e(networkRequestBuild);
    }

    /* JADX INFO: renamed from: b */
    public static final int[] m96163b(NetworkRequest networkRequest) {
        AbstractC22676k.m65750j(networkRequest, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC31221d.m96160a(networkRequest);
        }
        int[] iArr = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < 30; i13++) {
            int i14 = iArr[i13];
            if (networkRequest.hasCapability(i14)) {
                arrayList.add(Integer.valueOf(i14));
            }
        }
        return AbstractC25265s.m74091C1(arrayList);
    }

    /* JADX INFO: renamed from: c */
    public static final int[] m96164c(NetworkRequest networkRequest) {
        AbstractC22676k.m65750j(networkRequest, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC31221d.m96161b(networkRequest);
        }
        int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < 10; i13++) {
            int i14 = iArr[i13];
            if (networkRequest.hasTransport(i14)) {
                arrayList.add(Integer.valueOf(i14));
            }
        }
        return AbstractC25265s.m74091C1(arrayList);
    }
}
