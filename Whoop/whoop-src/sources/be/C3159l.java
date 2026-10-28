package be;

import aws.sdk.kotlin.runtime.config.imds.EC2MetadataError;
import bi.AbstractC3269g;
import gg.AbstractC15818e;
import gg.C15815b;
import gg.C15821h;
import gg.EnumC15819f;
import p000.C17820i;
import p326mf.C25500t;
import p326mf.EnumC25499s;
import p550vd.AbstractC35903f;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: be.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C3159l extends C15821h {

    /* JADX INFO: renamed from: y */
    public final InterfaceC30063j f12363y;

    public C3159l(InterfaceC30063j callContext) {
        AbstractC22676k.m65750j(callContext, "callContext");
        this.f12363y = callContext;
    }

    @Override // gg.C15821h
    /* JADX INFO: renamed from: a */
    public final AbstractC15818e mo9058a(Throwable ex3) {
        AbstractC22676k.m65750j(ex3, "ex");
        if (!(ex3 instanceof EC2MetadataError)) {
            return null;
        }
        C25500t c25500t = ((EC2MetadataError) ex3).f8397z;
        if (AbstractC3269g.m9506m(c25500t) != EnumC25499s.SERVER_ERROR && !c25500t.equals(C25500t.f99850d)) {
            String qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C3159l.class).getQualifiedName();
            if (qualifiedName == null) {
                throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object");
            }
            AbstractC35903f.m113984B(this.f12363y, qualifiedName).mo396u(null, new C17820i(21, c25500t, ex3));
            return null;
        }
        return new C15815b(EnumC15819f.f59711w);
    }
}
