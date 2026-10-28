package eu2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.google.android.gms.maps.model.LatLngBounds;
import eu.C13612g;
import ih0.AbstractC18502l;
import l83.InterfaceC23459e;
import p412q3.C29891y;
import p715kotlin.jvm.functions.Function1;
import p745y81.InterfaceC39332e;
import w41.AbstractC36826z;
import x41.AbstractC37959g;

/* JADX INFO: renamed from: eu2.i */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C13652i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f48392E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ boolean f48393F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC23459e f48394G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f48395H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f48396I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f48397J;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f48398w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f48399x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f48400y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f48401z;

    public /* synthetic */ C13652i(Modifier modifier, String str, boolean z4, InterfaceC39332e interfaceC39332e, boolean z13, boolean z14, InterfaceC4339a interfaceC4339a, int i13, int i14) {
        this.f48396I = modifier;
        this.f48399x = str;
        this.f48401z = z4;
        this.f48397J = interfaceC39332e;
        this.f48392E = z13;
        this.f48393F = z14;
        this.f48394G = interfaceC4339a;
        this.f48400y = i13;
        this.f48395H = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f48398w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC13653j.m38497i((Modifier) this.f48396I, (String) this.f48399x, this.f48401z, (InterfaceC39332e) this.f48397J, this.f48392E, this.f48393F, (InterfaceC4339a) this.f48394G, this.f48400y, this.f48395H, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC18502l.m53581a0((String) this.f48399x, (C29891y) this.f48396I, (Function1) this.f48397J, this.f48400y, this.f48401z, this.f48392E, this.f48393F, (InterfaceC4339a) this.f48394G, this.f48395H, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC37959g.m121569j((AbstractC36826z.a) this.f48396I, this.f48401z, this.f48392E, this.f48393F, (C13612g) this.f48399x, this.f48400y, (LatLngBounds) this.f48397J, (Function1) this.f48394G, this.f48395H, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C13652i(String str, C29891y c29891y, Function1 function1, int i13, boolean z4, boolean z13, boolean z14, InterfaceC4339a interfaceC4339a, int i14) {
        this.f48399x = str;
        this.f48396I = c29891y;
        this.f48397J = function1;
        this.f48400y = i13;
        this.f48401z = z4;
        this.f48392E = z13;
        this.f48393F = z14;
        this.f48394G = interfaceC4339a;
        this.f48395H = i14;
    }

    public /* synthetic */ C13652i(AbstractC36826z.a aVar, boolean z4, boolean z13, boolean z14, C13612g c13612g, int i13, LatLngBounds latLngBounds, Function1 function1, int i14) {
        this.f48396I = aVar;
        this.f48401z = z4;
        this.f48392E = z13;
        this.f48393F = z14;
        this.f48399x = c13612g;
        this.f48400y = i13;
        this.f48397J = latLngBounds;
        this.f48394G = function1;
        this.f48395H = i14;
    }
}
