package m83;

import c93.InterfaceC4351m;
import java.util.Iterator;
import p715kotlin.jvm.internal.AbstractC22681m0;
import s83.AbstractC32274h;
import v63.AbstractC35745c;
import xb3.InterfaceC38174i;
import yb3.C39405i;

/* JADX INFO: renamed from: m83.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C25264r implements InterfaceC38174i {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f99157a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f99158b;

    public /* synthetic */ C25264r(Object obj, int i13) {
        this.f99157a = i13;
        this.f99158b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [c93.m, s83.h] */
    @Override // xb3.InterfaceC38174i
    public final Iterator iterator() {
        switch (this.f99157a) {
            case 0:
                return AbstractC22681m0.m65777h((Object[]) this.f99158b);
            case 1:
                return ((Iterable) this.f99158b).iterator();
            case 2:
                return AbstractC35745c.m113247i((AbstractC32274h) this.f99158b);
            case 3:
                return (Iterator) this.f99158b;
            default:
                return new C39405i((CharSequence) this.f99158b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C25264r(InterfaceC4351m interfaceC4351m) {
        this.f99157a = 2;
        this.f99158b = (AbstractC32274h) interfaceC4351m;
    }
}
