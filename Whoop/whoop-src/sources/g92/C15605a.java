package g92;

import java.util.List;
import nt0.AbstractC27120h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g92.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lg92/a;", "", "", "Lnt0/h;", "rawData", "", "revision", "<init>", "(Ljava/util/List;S)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "S", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C15605a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<AbstractC27120h> rawData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final short revision;

    /* JADX WARN: Multi-variable type inference failed */
    public C15605a(List<? extends AbstractC27120h> rawData, short s13) {
        AbstractC22676k.m65750j(rawData, "rawData");
        this.rawData = rawData;
        this.revision = s13;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15605a)) {
            return false;
        }
        C15605a c15605a = (C15605a) other;
        return AbstractC22676k.m65745e(this.rawData, c15605a.rawData) && this.revision == c15605a.revision;
    }

    public int hashCode() {
        return Short.hashCode(this.revision) + (this.rawData.hashCode() * 31);
    }

    public String toString() {
        return "DataPackets(rawData=" + this.rawData + ", revision=" + ((int) this.revision) + ")";
    }
}
