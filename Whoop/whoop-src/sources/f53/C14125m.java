package f53;

import c93.InterfaceC4351m;
import ec3.InterfaceC13062m;
import l83.InterfaceC23459e;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.InterfaceC22666f;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: f53.m */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C14125m implements InterfaceC13062m, InterfaceC22666f {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f50776w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4351m f50777x;

    public C14125m(int i13, InterfaceC4351m function) {
        this.f50776w = i13;
        switch (i13) {
            case 1:
                AbstractC22676k.m65750j(function, "function");
                this.f50777x = function;
                break;
            default:
                AbstractC22676k.m65750j(function, "function");
                this.f50777x = function;
                break;
        }
    }

    @Override // ec3.InterfaceC13062m
    public final /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f50776w) {
            case 0:
                break;
        }
        return this.f50777x.invoke(obj, interfaceC30057d);
    }

    public final boolean equals(Object obj) {
        switch (this.f50776w) {
            case 0:
                if (!(obj instanceof InterfaceC13062m) || !(obj instanceof InterfaceC22666f)) {
                    return false;
                }
                return AbstractC22676k.m65745e(this.f50777x, ((InterfaceC22666f) obj).getFunctionDelegate());
            default:
                if (!(obj instanceof InterfaceC13062m) || !(obj instanceof InterfaceC22666f)) {
                    return false;
                }
                return AbstractC22676k.m65745e(this.f50777x, ((InterfaceC22666f) obj).getFunctionDelegate());
        }
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22666f
    public final InterfaceC23459e getFunctionDelegate() {
        switch (this.f50776w) {
            case 0:
                break;
        }
        return this.f50777x;
    }

    public final int hashCode() {
        switch (this.f50776w) {
            case 0:
                break;
        }
        return this.f50777x.hashCode();
    }
}
