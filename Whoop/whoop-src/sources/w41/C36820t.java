package w41;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import c93.InterfaceC4354p;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: w41.t */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36820t {

    /* JADX INFO: renamed from: a */
    public static final C36820t f157503a = new C36820t();

    /* JADX INFO: renamed from: b */
    private static InterfaceC4354p f157504b = new C37816b(new C36819s(), false, 2120769036);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m118039c(Modifier modifier, C36823w userLocation, boolean z4, InterfaceC4351m overlay, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(userLocation, "userLocation");
        AbstractC22676k.m65750j(overlay, "overlay");
        if ((i13 & 6) == 0) {
            i14 = (((C28655q) composer).m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= ((C28655q) composer).m87153g(userLocation) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= ((C28655q) composer).m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= ((C28655q) composer).m87157i(overlay) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            AbstractC36800a.m117930j(modifier, userLocation, z4, overlay, c28655q, i14 & 8190);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC4354p m118040b() {
        return f157504b;
    }
}
