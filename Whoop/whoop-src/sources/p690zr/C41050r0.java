package p690zr;

import java.io.Serializable;
import java.util.ArrayList;
import p658yr.InterfaceC39722i;

/* JADX INFO: renamed from: zr.r0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C41050r0 implements InterfaceC39722i, Serializable {

    /* JADX INFO: renamed from: w */
    public final int f177044w;

    public C41050r0() {
        AbstractC41047q.m133273c(2, "expectedValuesPerKey");
        this.f177044w = 2;
    }

    @Override // p658yr.InterfaceC39722i
    public final Object get() {
        return new ArrayList(this.f177044w);
    }
}
