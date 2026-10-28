package p326mf;

import java.util.LinkedHashMap;
import java.util.Map;
import p004a2.AbstractC0152a;
import p097ds.AbstractC12313p;
import p715kotlin.jvm.internal.AbstractC22676k;
import vg.InterfaceC35957d;

/* JADX INFO: renamed from: mf.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C25483c extends AbstractC0152a implements InterfaceC35957d {

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f99808y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25483c(int i13) {
        super(3);
        this.f99808y = i13;
    }

    /* JADX INFO: renamed from: Q */
    public C25484d m74900Q() {
        Map values = (Map) this.f475x;
        AbstractC22676k.m65750j(values, "values");
        return new C25484d(values);
    }

    @Override // vg.InterfaceC35957d
    /* JADX INFO: renamed from: a */
    public final Object mo14238a() {
        switch (this.f99808y) {
            case 0:
                LinkedHashMap linkedHashMapM34249A = AbstractC12313p.m34249A((Map) this.f475x);
                C25483c c25483c = new C25483c(0);
                ((Map) c25483c.f475x).putAll(linkedHashMapM34249A);
                return c25483c;
            default:
                LinkedHashMap linkedHashMapM34249A2 = AbstractC12313p.m34249A((Map) this.f475x);
                C25483c c25483c2 = new C25483c(1);
                ((Map) c25483c2.f475x).putAll(linkedHashMapM34249A2);
                return c25483c2;
        }
    }

    public String toString() {
        switch (this.f99808y) {
            case 1:
                return "HeadersBuilder " + ((Map) this.f475x).entrySet() + ' ';
            default:
                return super.toString();
        }
    }
}
