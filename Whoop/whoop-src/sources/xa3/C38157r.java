package xa3;

import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: xa3.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C38157r extends EnumC38159t {
    public C38157r() {
        super("HTML", 1);
    }

    @Override // xa3.EnumC38159t
    /* JADX INFO: renamed from: a */
    public final String mo122223a(String string) {
        AbstractC22676k.m65750j(string, "string");
        return AbstractC39421y.m125926K(AbstractC39421y.m125926K(string, "<", "&lt;", false), ">", "&gt;", false);
    }
}
