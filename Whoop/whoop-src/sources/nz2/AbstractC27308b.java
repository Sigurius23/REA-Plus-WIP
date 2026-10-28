package nz2;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import tr2.InterfaceC34116n;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: nz2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"", "component", "Ltr2/n;", "a", "(Ljava/lang/String;)Ltr2/n;", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27308b {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC34116n m82458a(String component) {
        AbstractC22676k.m65750j(component, "component");
        if (AbstractC39414r.m125890i0(component)) {
            throw new IllegalArgumentException("Logger component must not be blank");
        }
        return InterfaceC34116n.INSTANCE.m107848a("DWL/".concat(component));
    }
}
