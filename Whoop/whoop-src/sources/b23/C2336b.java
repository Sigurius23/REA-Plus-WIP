package b23;

import java.util.Iterator;
import java.util.List;
import m83.AbstractC25260n;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b23.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2336b implements InterfaceC2344j {

    /* JADX INFO: renamed from: a */
    public final List f9258a;

    public C2336b(InterfaceC2344j... interfaceC2344jArr) {
        this.f9258a = AbstractC25260n.m74049W0(interfaceC2344jArr);
    }

    @Override // b23.InterfaceC2344j
    public final void log(EnumC2341g enumC2341g, String tag, String message, Throwable th3) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(message, "message");
        Iterator it = this.f9258a.iterator();
        while (it.hasNext()) {
            ((InterfaceC2344j) it.next()).log(enumC2341g, tag, message, th3);
        }
    }
}
