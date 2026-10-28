package nj0;

import java.util.Map;
import java.util.UUID;
import nh3.AbstractC26725a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: nj0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lnj0/b;", "", "", "Lnj0/c;", "Ljava/util/UUID;", "uuids", "<init>", "(Ljava/util/Map;)V", "role", "a", "(Lnj0/c;)Ljava/util/UUID;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "whoop-ble-api"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26746b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<EnumC26747c, UUID> uuids;

    public C26746b(Map<EnumC26747c, UUID> uuids) {
        AbstractC22676k.m65750j(uuids, "uuids");
        this.uuids = uuids;
    }

    /* JADX INFO: renamed from: a */
    public final UUID m79609a(EnumC26747c role) {
        AbstractC22676k.m65750j(role, "role");
        return this.uuids.get(role);
    }

    /* JADX INFO: renamed from: b */
    public final Map<EnumC26747c, UUID> m79610b() {
        return this.uuids;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C26746b) && AbstractC22676k.m65745e(this.uuids, ((C26746b) other).uuids);
    }

    public int hashCode() {
        return this.uuids.hashCode();
    }

    public String toString() {
        return AbstractC26725a.m79504h("CharacteristicMap(uuids=", ")", this.uuids);
    }
}
