package eu;

import c93.InterfaceC4339a;
import com.google.android.gms.maps.GoogleMapOptions;
import l83.C23454a0;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: eu.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C13628o extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public static final C13628o f48301E;

    /* JADX INFO: renamed from: F */
    public static final C13628o f48302F;

    /* JADX INFO: renamed from: x */
    public static final C13628o f48303x;

    /* JADX INFO: renamed from: y */
    public static final C13628o f48304y;

    /* JADX INFO: renamed from: z */
    public static final C13628o f48305z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f48306w;

    static {
        int i13 = 0;
        f48303x = new C13628o(i13, 0);
        f48304y = new C13628o(i13, 1);
        f48305z = new C13628o(i13, 2);
        f48301E = new C13628o(i13, 3);
        f48302F = new C13628o(i13, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13628o(int i13, int i14) {
        super(i13);
        this.f48306w = i14;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f48306w) {
            case 0:
                return new GoogleMapOptions();
            case 1:
                return C23454a0.f92919a;
            case 2:
                return Boolean.FALSE;
            case 3:
                return C23454a0.f92919a;
            default:
                return Boolean.FALSE;
        }
    }
}
