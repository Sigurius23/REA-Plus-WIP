package k50;

import com.whoop.domain.model.UnitSystem;
import ih0.AbstractC18489d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: k50.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011¨\u0006\u001e"}, m65681d2 = {"Lk50/c;", "", "", "stateKey", "Lk50/d;", "kind", "", "canonicalValue", "<init>", "(Ljava/lang/String;Lk50/d;I)V", "Lcom/whoop/domain/model/UnitSystem;", "unit", "b", "(Lcom/whoop/domain/model/UnitSystem;)I", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Lk50/d;", "getKind", "()Lk50/d;", "c", "I", "getCanonicalValue", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22200c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String stateKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC22201d kind;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int canonicalValue;

    public C22200c(String stateKey, EnumC22201d kind, int i13) {
        AbstractC22676k.m65750j(stateKey, "stateKey");
        AbstractC22676k.m65750j(kind, "kind");
        this.stateKey = stateKey;
        this.kind = kind;
        this.canonicalValue = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getStateKey() {
        return this.stateKey;
    }

    /* JADX INFO: renamed from: b */
    public final int m63659b(UnitSystem unit) {
        AbstractC22676k.m65750j(unit, "unit");
        return this.kind.fromCanonical(this.canonicalValue, unit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22200c)) {
            return false;
        }
        C22200c c22200c = (C22200c) other;
        return AbstractC22676k.m65745e(this.stateKey, c22200c.stateKey) && this.kind == c22200c.kind && this.canonicalValue == c22200c.canonicalValue;
    }

    public int hashCode() {
        return Integer.hashCode(this.canonicalValue) + ((this.kind.hashCode() + (this.stateKey.hashCode() * 31)) * 31);
    }

    public String toString() {
        String str = this.stateKey;
        EnumC22201d enumC22201d = this.kind;
        int i13 = this.canonicalValue;
        StringBuilder sb4 = new StringBuilder("ForeignMeasurement(stateKey=");
        sb4.append(str);
        sb4.append(", kind=");
        sb4.append(enumC22201d);
        sb4.append(", canonicalValue=");
        return AbstractC18489d0.m53371l(sb4, i13, ")");
    }
}
