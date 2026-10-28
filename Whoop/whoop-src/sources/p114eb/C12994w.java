package p114eb;

import l83.C23454a0;
import m83.C25258m;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22659b0;

/* JADX INFO: renamed from: eb.w */
/* JADX INFO: loaded from: classes.dex */
public final class C12994w extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C25258m f44886E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C22659b0 f44887w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C22659b0 f44888x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC12939a0 f44889y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f44890z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12994w(C22659b0 c22659b0, C22659b0 c22659b1, AbstractC12939a0 abstractC12939a0, boolean z4, C25258m c25258m) {
        super(1);
        this.f44887w = c22659b0;
        this.f44888x = c22659b1;
        this.f44889y = abstractC12939a0;
        this.f44890z = z4;
        this.f44886E = c25258m;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C12982q entry = (C12982q) obj;
        AbstractC22676k.m65750j(entry, "entry");
        this.f44887w.f89329w = true;
        this.f44888x.f89329w = true;
        this.f44889y.m36378E(entry, this.f44890z, this.f44886E);
        return C23454a0.f92919a;
    }
}
