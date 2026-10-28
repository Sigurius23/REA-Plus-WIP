package p516u8;

import java.util.Objects;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: u8.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C34612q {

    /* JADX INFO: renamed from: a */
    public final String f145801a;

    /* JADX INFO: renamed from: b */
    public final String f145802b;

    static {
        AbstractC38065t.m121892F(0);
        AbstractC38065t.m121892F(1);
    }

    public C34612q(String str, String str2) {
        this.f145801a = AbstractC38065t.m121897K(str);
        this.f145802b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C34612q.class == obj.getClass()) {
            C34612q c34612q = (C34612q) obj;
            if (Objects.equals(this.f145801a, c34612q.f145801a) && Objects.equals(this.f145802b, c34612q.f145802b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f145802b.hashCode() * 31;
        String str = this.f145801a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
