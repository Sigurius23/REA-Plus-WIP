package i82;

import ih0.AbstractC18489d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: i82.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Li82/b;", "", "Li82/e;", "start", "end", "", "hideAllButtons", "<init>", "(Li82/e;Li82/e;Z)V", "a", "(Li82/e;Li82/e;Z)Li82/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Li82/e;", "d", "()Li82/e;", "b", "c", "Z", "()Z", "search-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18218b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC18221e start;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC18221e end;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean hideAllButtons;

    public C18218b(EnumC18221e enumC18221e, EnumC18221e enumC18221e2, boolean z4) {
        this.start = enumC18221e;
        this.end = enumC18221e2;
        this.hideAllButtons = z4;
    }

    /* JADX INFO: renamed from: a */
    public final C18218b m52417a(EnumC18221e start, EnumC18221e end, boolean hideAllButtons) {
        return new C18218b(start, end, hideAllButtons);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC18221e getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getHideAllButtons() {
        return this.hideAllButtons;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC18221e getStart() {
        return this.start;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18218b)) {
            return false;
        }
        C18218b c18218b = (C18218b) other;
        return this.start == c18218b.start && this.end == c18218b.end && this.hideAllButtons == c18218b.hideAllButtons;
    }

    public int hashCode() {
        EnumC18221e enumC18221e = this.start;
        int iHashCode = (enumC18221e == null ? 0 : enumC18221e.hashCode()) * 31;
        EnumC18221e enumC18221e2 = this.end;
        return Boolean.hashCode(this.hideAllButtons) + ((iHashCode + (enumC18221e2 != null ? enumC18221e2.hashCode() : 0)) * 31);
    }

    public String toString() {
        EnumC18221e enumC18221e = this.start;
        EnumC18221e enumC18221e2 = this.end;
        boolean z4 = this.hideAllButtons;
        StringBuilder sb4 = new StringBuilder("FollowerRequestItemUiStages(start=");
        sb4.append(enumC18221e);
        sb4.append(", end=");
        sb4.append(enumC18221e2);
        sb4.append(", hideAllButtons=");
        return AbstractC18489d0.m53372m(sb4, z4, ")");
    }

    public /* synthetic */ C18218b(EnumC18221e enumC18221e, EnumC18221e enumC18221e2, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : enumC18221e, (i13 & 2) != 0 ? null : enumC18221e2, (i13 & 4) != 0 ? false : z4);
    }
}
