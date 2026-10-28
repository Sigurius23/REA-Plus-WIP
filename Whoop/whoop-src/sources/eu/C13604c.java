package eu;

import android.location.Location;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import l83.C23454a0;
import p591wp.C37487h;
import p591wp.C37490k;
import p591wp.C37491l;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: eu.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C13604c extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public static final C13604c f48137E;

    /* JADX INFO: renamed from: F */
    public static final C13604c f48138F;

    /* JADX INFO: renamed from: G */
    public static final C13604c f48139G;

    /* JADX INFO: renamed from: H */
    public static final C13604c f48140H;

    /* JADX INFO: renamed from: I */
    public static final C13604c f48141I;

    /* JADX INFO: renamed from: J */
    public static final C13604c f48142J;

    /* JADX INFO: renamed from: K */
    public static final C13604c f48143K;

    /* JADX INFO: renamed from: L */
    public static final C13604c f48144L;

    /* JADX INFO: renamed from: M */
    public static final C13604c f48145M;

    /* JADX INFO: renamed from: N */
    public static final C13604c f48146N;

    /* JADX INFO: renamed from: O */
    public static final C13604c f48147O;

    /* JADX INFO: renamed from: P */
    public static final C13604c f48148P;

    /* JADX INFO: renamed from: x */
    public static final C13604c f48149x;

    /* JADX INFO: renamed from: y */
    public static final C13604c f48150y;

    /* JADX INFO: renamed from: z */
    public static final C13604c f48151z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f48152w;

    static {
        int i13 = 1;
        f48149x = new C13604c(i13, 0);
        f48150y = new C13604c(i13, 1);
        f48151z = new C13604c(i13, 2);
        f48137E = new C13604c(i13, 3);
        f48138F = new C13604c(i13, 4);
        f48139G = new C13604c(i13, 5);
        f48140H = new C13604c(i13, 6);
        f48141I = new C13604c(i13, 7);
        f48142J = new C13604c(i13, 8);
        f48143K = new C13604c(i13, 9);
        f48144L = new C13604c(i13, 10);
        f48145M = new C13604c(i13, 11);
        f48146N = new C13604c(i13, 12);
        f48147O = new C13604c(i13, 13);
        f48148P = new C13604c(i13, 14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13604c(int i13, int i14) {
        super(i13);
        this.f48152w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f48152w) {
            case 0:
                CameraPosition it = (CameraPosition) obj;
                AbstractC22676k.m65750j(it, "it");
                return new C13612g(it);
            case 1:
                AbstractC22676k.m65750j((LatLng) obj, "it");
                return C23454a0.f92919a;
            case 2:
                AbstractC22676k.m65750j((LatLng) obj, "it");
                return C23454a0.f92919a;
            case 3:
                AbstractC22676k.m65750j((Location) obj, "it");
                return C23454a0.f92919a;
            case 4:
                AbstractC22676k.m65750j((C37490k) obj, "it");
                return C23454a0.f92919a;
            case 5:
                AbstractC22676k.m65750j((LatLng) obj, "it");
                return C23454a0.f92919a;
            case 6:
                AbstractC22676k.m65750j((LatLng) obj, "it");
                return C23454a0.f92919a;
            case 7:
                AbstractC22676k.m65750j((Location) obj, "it");
                return C23454a0.f92919a;
            case 8:
                AbstractC22676k.m65750j((C37490k) obj, "it");
                return C23454a0.f92919a;
            case 9:
                AbstractC22676k.m65750j((C37487h) obj, "it");
                return Boolean.FALSE;
            case 10:
                AbstractC22676k.m65750j((C37487h) obj, "it");
                return C23454a0.f92919a;
            case 11:
                AbstractC22676k.m65750j((C37487h) obj, "it");
                return C23454a0.f92919a;
            case 12:
                AbstractC22676k.m65750j((C37487h) obj, "it");
                return C23454a0.f92919a;
            case 13:
                LatLng it3 = (LatLng) obj;
                AbstractC22676k.m65750j(it3, "it");
                return new C13619j0(it3);
            default:
                AbstractC22676k.m65750j((C37491l) obj, "it");
                return C23454a0.f92919a;
        }
    }
}
