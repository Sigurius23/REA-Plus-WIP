package w41;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4355q;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: w41.v */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36822v {

    /* JADX INFO: renamed from: a */
    public static final C36822v f157505a = new C36822v();

    /* JADX INFO: renamed from: b */
    private static InterfaceC4355q f157506b = new C37816b(new C36821u(), false, 1365208459);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m118042c(AbstractC36826z mapState, Modifier modifier, boolean z4, C36806f c36806f, boolean z13, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(mapState, "mapState");
        AbstractC22676k.m65750j(modifier, "modifier");
        if ((i13 & 6) == 0) {
            i14 = (((C28655q) composer).m87153g(mapState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= ((C28655q) composer).m87153g(modifier) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= ((C28655q) composer).m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= ((C28655q) composer).m87153g(c36806f) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= ((C28655q) composer).m87155h(z13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (74899 & i14) != 74898)) {
            AbstractC36811k.m118000n(mapState, modifier, z4, c36806f, z13, c28655q, 65534 & i14, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC4355q m118043b() {
        return f157506b;
    }
}
