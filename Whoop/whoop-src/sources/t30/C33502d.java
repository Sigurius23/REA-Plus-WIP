package t30;

import a20.C0167g;
import androidx.lifecycle.InterfaceC1633v0;
import l83.InterfaceC23459e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.InterfaceC22666f;

/* JADX INFO: renamed from: t30.d */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C33502d implements InterfaceC1633v0, InterfaceC22666f {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f139859w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f139860x;

    public /* synthetic */ C33502d(Function1 function1, int i13) {
        this.f139859w = i13;
        this.f139860x = function1;
    }

    public final boolean equals(Object obj) {
        switch (this.f139859w) {
            case 0:
                if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                    return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
                }
                return false;
            case 1:
                if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                    return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                    return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22666f
    public final InterfaceC23459e getFunctionDelegate() {
        switch (this.f139859w) {
            case 0:
                return this.f139860x;
            case 1:
                return this.f139860x;
            default:
                return (C0167g) this.f139860x;
        }
    }

    public final int hashCode() {
        switch (this.f139859w) {
            case 0:
                break;
            case 1:
                break;
        }
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.InterfaceC1633v0
    public final /* synthetic */ void onChanged(Object obj) {
        switch (this.f139859w) {
            case 0:
                this.f139860x.invoke(obj);
                break;
            case 1:
                this.f139860x.invoke(obj);
                break;
            default:
                ((C0167g) this.f139860x).invoke(obj);
                break;
        }
    }
}
