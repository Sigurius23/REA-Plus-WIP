package m93;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m93.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C25342j extends AbstractC25357y {
    @Override // m93.InterfaceC25339g
    public final Object call(Object[] args) {
        AbstractC22676k.m65750j(args, "args");
        mo74412c(args);
        return ((Constructor) this.f99382a).newInstance(Arrays.copyOf(args, args.length));
    }
}
