package g61;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g61.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"Lg61/e;", "", "Lg61/a;", "id", "", "icon", "", "positionX", "positionY", "<init>", "(Lg61/a;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lg61/a;", "b", "()Lg61/a;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "c", "Ljava/lang/Float;", "()Ljava/lang/Float;", "d", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C15532e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC15528a id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Integer icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Float positionX;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Float positionY;

    public C15532e(EnumC15528a enumC15528a, Integer num, Float f13, Float f14) {
        this.id = enumC15528a;
        this.icon = num;
        this.positionX = f13;
        this.positionY = f14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC15528a getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Float getPositionX() {
        return this.positionX;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Float getPositionY() {
        return this.positionY;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15532e)) {
            return false;
        }
        C15532e c15532e = (C15532e) other;
        return this.id == c15532e.id && AbstractC22676k.m65745e(this.icon, c15532e.icon) && AbstractC22676k.m65745e(this.positionX, c15532e.positionX) && AbstractC22676k.m65745e(this.positionY, c15532e.positionY);
    }

    public int hashCode() {
        EnumC15528a enumC15528a = this.id;
        int iHashCode = (enumC15528a == null ? 0 : enumC15528a.hashCode()) * 31;
        Integer num = this.icon;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Float f13 = this.positionX;
        int iHashCode3 = (iHashCode2 + (f13 == null ? 0 : f13.hashCode())) * 31;
        Float f14 = this.positionY;
        return iHashCode3 + (f14 != null ? f14.hashCode() : 0);
    }

    public String toString() {
        return "GraphButtonState(id=" + this.id + ", icon=" + this.icon + ", positionX=" + this.positionX + ", positionY=" + this.positionY + ")";
    }
}
