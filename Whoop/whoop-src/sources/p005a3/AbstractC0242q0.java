package p005a3;

import androidx.compose.p018ui.node.Owner;
import p031b9.AbstractC2875y;
import p549vb.AbstractC35862g;
import p636y3.C39172d;

/* JADX INFO: renamed from: a3.q0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0242q0 {

    /* JADX INFO: renamed from: a */
    public static final C39172d f830a = AbstractC35862g.m113838a();

    /* JADX INFO: renamed from: a */
    public static final Owner m750a(C0230n0 c0230n0) {
        Owner owner = c0230n0.f765M;
        if (owner != null) {
            return owner;
        }
        throw AbstractC2875y.m8310w("LayoutNode should be attached to an owner");
    }
}
