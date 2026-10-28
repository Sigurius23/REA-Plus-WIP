package i21;

import java.util.UUID;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i21.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Li21/a;", "", "", "isNew", "Ljava/util/UUID;", "uuid", "<init>", "(ZLjava/util/UUID;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Ljava/util/UUID;", "()Ljava/util/UUID;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17991a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isNew;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final UUID uuid;

    public C17991a(boolean z4, UUID uuid) {
        AbstractC22676k.m65750j(uuid, "uuid");
        this.isNew = z4;
        this.uuid = uuid;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final UUID getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsNew() {
        return this.isNew;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17991a)) {
            return false;
        }
        C17991a c17991a = (C17991a) other;
        return this.isNew == c17991a.isNew && AbstractC22676k.m65745e(this.uuid, c17991a.uuid);
    }

    public int hashCode() {
        return this.uuid.hashCode() + (Boolean.hashCode(this.isNew) * 31);
    }

    public String toString() {
        return "ClickCallBack(isNew=" + this.isNew + ", uuid=" + this.uuid + ")";
    }
}
