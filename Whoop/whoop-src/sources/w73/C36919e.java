package w73;

import io.reactivex.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.atomic.AtomicReference;
import l73.InterfaceC23413d;
import n73.InterfaceC26443b;
import p088dc.AbstractC11895b;
import p249jc.AbstractC21598x;
import p73.InterfaceC28961b;
import q73.EnumC30024c;

/* JADX INFO: renamed from: w73.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C36919e extends AtomicReference implements InterfaceC26443b, InterfaceC28961b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f157974w;

    /* JADX INFO: renamed from: x */
    public final Object f157975x;

    public /* synthetic */ C36919e(Object obj, int i13) {
        this.f157974w = i13;
        this.f157975x = obj;
    }

    /* JADX INFO: renamed from: a */
    public boolean m118548a(Throwable th3) {
        if (isDisposed()) {
            return false;
        }
        try {
            ((InterfaceC23413d) this.f157975x).onError(th3);
            return true;
        } finally {
            EnumC30024c.m91915a(this);
        }
    }

    @Override // p73.InterfaceC28961b
    public void accept(Object obj) {
        AbstractC21598x.m60677d0(new OnErrorNotImplementedException((Throwable) obj));
    }

    @Override // n73.InterfaceC26443b
    public final void dispose() {
        switch (this.f157974w) {
            case 0:
                EnumC30024c.m91915a(this);
                break;
            default:
                EnumC30024c.m91915a(this);
                break;
        }
    }

    @Override // n73.InterfaceC26443b
    public final boolean isDisposed() {
        switch (this.f157974w) {
            case 0:
                return ((InterfaceC26443b) get()) == EnumC30024c.f122536w;
            default:
                return get() == EnumC30024c.f122536w;
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        switch (this.f157974w) {
            case 0:
                return AbstractC11895b.m31997p(C36919e.class.getSimpleName(), "{", super.toString(), "}");
            default:
                return super.toString();
        }
    }
}
