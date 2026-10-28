package nc;

import mc.C25408e;
import p114eb.AbstractC12979o0;
import p218ic.C18389w;
import p218ic.EnumC18390x;
import p420qc.C30207q;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: nc.f */
/* JADX INFO: loaded from: classes.dex */
public final class C26562f extends AbstractC26558b {

    /* JADX INFO: renamed from: b */
    public final int f105576b;

    static {
        AbstractC22676k.m65749i(C18389w.m52887f("NetworkNotRoamingCtrlr"), "tagWithPrefix(...)");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26562f(AbstractC12979o0 tracker) {
        super(tracker);
        AbstractC22676k.m65750j(tracker, "tracker");
        this.f105576b = 7;
    }

    @Override // nc.InterfaceC26560d
    /* JADX INFO: renamed from: b */
    public final boolean mo74595b(C30207q workSpec) {
        AbstractC22676k.m65750j(workSpec, "workSpec");
        return workSpec.f123643j.f71465a == EnumC18390x.f71563z;
    }

    @Override // nc.AbstractC26558b
    /* JADX INFO: renamed from: c */
    public final int mo78687c() {
        return this.f105576b;
    }

    @Override // nc.AbstractC26558b
    /* JADX INFO: renamed from: d */
    public final boolean mo78688d(Object obj) {
        C25408e value = (C25408e) obj;
        AbstractC22676k.m65750j(value, "value");
        return (value.f99504a && value.f99507d && !value.f99508e) ? false : true;
    }
}
