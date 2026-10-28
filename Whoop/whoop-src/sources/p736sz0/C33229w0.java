package p736sz0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4351m;
import com.whoop.navigation.C9598e;
import java.util.List;
import p715kotlin.jvm.functions.Function1;
import uz1.AbstractC35423a;
import uz1.EnumC35424b;
import zv2.AbstractC41172h;

/* JADX INFO: renamed from: sz0.w0 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C33229w0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f138561E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f138562F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f138563G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f138564H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f138565w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f138566x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f138567y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Modifier f138568z;

    public /* synthetic */ C33229w0(int i13, int i14, int i15, Modifier modifier, String str, List list, Function1 function1) {
        this.f138563G = list;
        this.f138566x = i13;
        this.f138568z = modifier;
        this.f138564H = str;
        this.f138567y = function1;
        this.f138561E = i14;
        this.f138562F = i15;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f138565w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC33231x0.m105428m((List) this.f138563G, this.f138566x, this.f138568z, (String) this.f138564H, this.f138567y, this.f138561E, this.f138562F, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC35423a.m112400e(this.f138566x, (C9598e) this.f138563G, this.f138567y, this.f138568z, (EnumC35424b) this.f138564H, this.f138561E, this.f138562F, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC41172h.m133784E(this.f138568z, (List) this.f138563G, this.f138566x, this.f138567y, (C2886a) this.f138564H, this.f138561E, this.f138562F, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C33229w0(int i13, C9598e c9598e, Function1 function1, Modifier modifier, EnumC35424b enumC35424b, int i14, int i15) {
        this.f138566x = i13;
        this.f138563G = c9598e;
        this.f138567y = function1;
        this.f138568z = modifier;
        this.f138564H = enumC35424b;
        this.f138561E = i14;
        this.f138562F = i15;
    }

    public /* synthetic */ C33229w0(Modifier modifier, List list, int i13, Function1 function1, C2886a c2886a, int i14, int i15) {
        this.f138568z = modifier;
        this.f138563G = list;
        this.f138566x = i13;
        this.f138567y = function1;
        this.f138564H = c2886a;
        this.f138561E = i14;
        this.f138562F = i15;
    }
}
