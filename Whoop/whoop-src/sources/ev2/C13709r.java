package ev2;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import dv2.InterfaceC12394e;
import l83.InterfaceC23462h;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: ev2.r */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C13709r implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f48603w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f48604x;

    public /* synthetic */ C13709r(Object obj, int i13) {
        this.f48603w = i13;
        this.f48604x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f48603w) {
            case 0:
                return AbstractC13712u.m38766X0((InterfaceC23462h) this.f48604x, (String) obj, (String) obj2, (String) obj3);
            default:
                return AbstractC13712u.m38799j0((InterfaceC12394e.b) this.f48604x, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    }
}
