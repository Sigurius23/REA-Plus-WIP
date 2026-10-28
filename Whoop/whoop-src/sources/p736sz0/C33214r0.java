package p736sz0;

import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: sz0.r0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lsz0/r0;", "Lm91/u;", "", "id", "", "value", "Lsz0/v1;", "type", "<init>", "(Ljava/lang/String;ILsz0/v1;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "I", "c", "Lsz0/v1;", "()Lsz0/v1;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33214r0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC33227v1 type;

    public C33214r0(String id4, int i13, EnumC33227v1 type) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(type, "type");
        this.id = id4;
        this.value = i13;
        this.type = type;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC33227v1 getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33214r0)) {
            return false;
        }
        C33214r0 c33214r0 = (C33214r0) other;
        return AbstractC22676k.m65745e(this.id, c33214r0.id) && this.value == c33214r0.value && this.type == c33214r0.type;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.type.hashCode() + AbstractC11266d.m30448b(this.value, this.id.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.id;
        int i13 = this.value;
        EnumC33227v1 enumC33227v1 = this.type;
        StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "RowSelected(id=", str, ", value=", ", type=");
        sbM30467u.append(enumC33227v1);
        sbM30467u.append(")");
        return sbM30467u.toString();
    }
}
