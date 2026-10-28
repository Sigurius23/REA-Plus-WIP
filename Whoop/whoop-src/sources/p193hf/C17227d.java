package p193hf;

import java.util.Iterator;
import p184h5.C16927z;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hf.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C17227d extends C16927z {

    /* JADX INFO: renamed from: z */
    public final Iterator f66201z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17227d(Iterator src, Function1 src2Dest) {
        super(src, src2Dest);
        AbstractC22676k.m65750j(src, "src");
        AbstractC22676k.m65750j(src2Dest, "src2Dest");
        this.f66201z = src;
    }

    @Override // p184h5.C16927z, java.util.Iterator
    public final void remove() {
        this.f66201z.remove();
    }
}
