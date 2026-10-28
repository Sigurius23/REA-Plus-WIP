package nc;

import mc.C25408e;
import p114eb.AbstractC12979o0;
import p218ic.C18389w;
import p218ic.EnumC18390x;
import p420qc.C30207q;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: nc.e */
/* JADX INFO: loaded from: classes.dex */
public final class C26561e extends AbstractC26558b {

    /* JADX INFO: renamed from: b */
    public final int f105575b;

    static {
        AbstractC22676k.m65749i(C18389w.m52887f("NetworkMeteredCtrlr"), "tagWithPrefix(...)");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26561e(AbstractC12979o0 tracker) {
        super(tracker);
        AbstractC22676k.m65750j(tracker, "tracker");
        this.f105575b = 7;
    }

    @Override // nc.InterfaceC26560d
    /* JADX INFO: renamed from: b */
    public final boolean mo74595b(C30207q workSpec) {
        AbstractC22676k.m65750j(workSpec, "workSpec");
        return workSpec.f123643j.f71465a == EnumC18390x.f71557E;
    }

    @Override // nc.AbstractC26558b
    /* JADX INFO: renamed from: c */
    public final int mo78687c() {
        return this.f105575b;
    }

    @Override // nc.AbstractC26558b
    /* JADX INFO: renamed from: d */
    public final boolean mo78688d(Object obj) {
        C25408e value = (C25408e) obj;
        AbstractC22676k.m65750j(value, "value");
        return (value.f99504a && value.f99506c && !value.f99508e) ? false : true;
    }
}
