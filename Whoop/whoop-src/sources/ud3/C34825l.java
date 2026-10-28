package ud3;

import androidx.room.AbstractC1772c1;
import java.util.ArrayList;
import java.util.Set;
import m83.AbstractC25265s;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ud3.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C34825l {

    /* JADX INFO: renamed from: c */
    public static final C34825l f146638c = new C34825l(AbstractC25265s.m74103I1(new ArrayList()), null);

    /* JADX INFO: renamed from: a */
    public final Set f146639a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1772c1 f146640b;

    public C34825l(Set set, AbstractC1772c1 abstractC1772c1) {
        this.f146639a = set;
        this.f146640b = abstractC1772c1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C34825l)) {
            return false;
        }
        C34825l c34825l = (C34825l) obj;
        return AbstractC22676k.m65745e(c34825l.f146639a, this.f146639a) && AbstractC22676k.m65745e(c34825l.f146640b, this.f146640b);
    }

    public final int hashCode() {
        int iM73368a = AbstractC25012a.m73368a(this.f146639a, 1517, 41);
        AbstractC1772c1 abstractC1772c1 = this.f146640b;
        return iM73368a + (abstractC1772c1 != null ? abstractC1772c1.hashCode() : 0);
    }
}
