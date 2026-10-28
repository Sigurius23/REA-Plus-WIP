package p359o7;

import j93.InterfaceC21461d;
import java.util.Set;
import m83.C25235a0;
import p319m4.AbstractC25012a;
import p416q7.C30008a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: o7.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C27626b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC21461d f111163a;

    /* JADX INFO: renamed from: b */
    public final C30008a f111164b;

    /* JADX INFO: renamed from: c */
    public final Set f111165c;

    public C27626b(InterfaceC21461d recordType, C30008a c30008a) {
        AbstractC22676k.m65750j(recordType, "recordType");
        this.f111163a = recordType;
        this.f111164b = c30008a;
        this.f111165c = C25235a0.f99113w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C27626b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type androidx.health.connect.client.request.ReadRecordsRequest<*>");
        C27626b c27626b = (C27626b) obj;
        return AbstractC22676k.m65745e(this.f111163a, c27626b.f111163a) && this.f111164b.equals(c27626b.f111164b) && this.f111165c.equals(c27626b.f111165c);
    }

    public final int hashCode() {
        return (((Boolean.hashCode(true) + AbstractC25012a.m73368a(this.f111165c, (this.f111164b.hashCode() + (this.f111163a.hashCode() * 31)) * 31, 31)) * 31) + 1000) * 31;
    }
}
