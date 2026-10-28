package p556vm;

import p309lo.AbstractC24567y;
import p527um.InterfaceC35071a;

/* JADX INFO: renamed from: vm.i */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC36142i implements InterfaceC35071a {

    /* JADX INFO: renamed from: a */
    public static final boolean f154645a;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z4;
        if ("Amazon".equals(AbstractC24567y.f95877c)) {
            String str = AbstractC24567y.f95878d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        f154645a = z4;
    }
}
