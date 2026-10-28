package iq0;

import jh3.AbstractC21702c;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: iq0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ8\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001c\u0010\u000e¨\u0006\u001d"}, m65681d2 = {"Liq0/g;", "", "", "count", "", "hasSelfReaction", "isVisible", "", "type", "<init>", "(IZZLjava/lang/String;)V", "a", "(IZZLjava/lang/String;)Liq0/g;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "c", "b", "Z", "d", "()Z", "f", "Ljava/lang/String;", "e", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20828g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int count;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean hasSelfReaction;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isVisible;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String type;

    public C20828g(int i13, boolean z4, boolean z13, String type) {
        AbstractC22676k.m65750j(type, "type");
        this.count = i13;
        this.hasSelfReaction = z4;
        this.isVisible = z13;
        this.type = type;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C20828g m57446b(C20828g c20828g, int i13, boolean z4, boolean z13, String str, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = c20828g.count;
        }
        if ((i14 & 2) != 0) {
            z4 = c20828g.hasSelfReaction;
        }
        if ((i14 & 4) != 0) {
            z13 = c20828g.isVisible;
        }
        if ((i14 & 8) != 0) {
            str = c20828g.type;
        }
        return c20828g.m57447a(i13, z4, z13, str);
    }

    /* JADX INFO: renamed from: a */
    public final C20828g m57447a(int count, boolean hasSelfReaction, boolean isVisible, String type) {
        AbstractC22676k.m65750j(type, "type");
        return new C20828g(count, hasSelfReaction, isVisible, type);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getHasSelfReaction() {
        return this.hasSelfReaction;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20828g)) {
            return false;
        }
        C20828g c20828g = (C20828g) other;
        return this.count == c20828g.count && this.hasSelfReaction == c20828g.hasSelfReaction && this.isVisible == c20828g.isVisible && AbstractC22676k.m65745e(this.type, c20828g.type);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public int hashCode() {
        return this.type.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(Integer.hashCode(this.count) * 31, 31, this.hasSelfReaction), 31, this.isVisible);
    }

    public String toString() {
        int i13 = this.count;
        boolean z4 = this.hasSelfReaction;
        boolean z13 = this.isVisible;
        String str = this.type;
        StringBuilder sb4 = new StringBuilder("ChatReactionViewState(count=");
        sb4.append(i13);
        sb4.append(", hasSelfReaction=");
        sb4.append(z4);
        sb4.append(", isVisible=");
        return AbstractC21702c.m61139j(sb4, z13, ", type=", str, ")");
    }

    public /* synthetic */ C20828g(int i13, boolean z4, boolean z13, String str, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i13, (i14 & 2) != 0 ? false : z4, (i14 & 4) != 0 ? false : z13, str);
    }
}
