package p516u8;

import p499t9.C33650s;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: u8.r */
/* JADX INFO: loaded from: classes5.dex */
public class C34614r {

    /* JADX INFO: renamed from: a */
    public final long f145805a;

    static {
        new C34614r(new C33650s());
        AbstractC38065t.m121892F(0);
        AbstractC38065t.m121892F(1);
        AbstractC38065t.m121892F(2);
        AbstractC38065t.m121892F(3);
        AbstractC38065t.m121892F(4);
        AbstractC38065t.m121892F(5);
        AbstractC38065t.m121892F(6);
    }

    public C34614r(C33650s c33650s) {
        int i13 = AbstractC38065t.f163031a;
        this.f145805a = c33650s.f140436a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C34614r) && this.f145805a == ((C34614r) obj).f145805a;
    }

    public final int hashCode() {
        long j7 = this.f145805a;
        return ((((int) 0) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 29791;
    }
}
