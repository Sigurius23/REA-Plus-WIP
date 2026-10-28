package c43;

import java.util.ArrayList;
import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c43.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C4186b {

    /* JADX INFO: renamed from: a */
    public final List f17024a;

    /* JADX INFO: renamed from: b */
    public final C4187c f17025b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f17026c;

    /* JADX INFO: renamed from: d */
    public final C4188d f17027d;

    public C4186b(List blockedUsersIds, C4187c c4187c, ArrayList arrayList, C4188d c4188d) {
        AbstractC22676k.m65750j(blockedUsersIds, "blockedUsersIds");
        this.f17024a = blockedUsersIds;
        this.f17025b = c4187c;
        this.f17026c = arrayList;
        this.f17027d = c4188d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4186b)) {
            return false;
        }
        C4186b c4186b = (C4186b) obj;
        return AbstractC22676k.m65745e(this.f17024a, c4186b.f17024a) && this.f17025b.equals(c4186b.f17025b) && this.f17026c.equals(c4186b.f17026c) && AbstractC22676k.m65745e(this.f17027d, c4186b.f17027d);
    }

    public final int hashCode() {
        int iHashCode = (this.f17026c.hashCode() + ((this.f17025b.hashCode() + (this.f17024a.hashCode() * 31)) * 31)) * 31;
        C4188d c4188d = this.f17027d;
        return iHashCode + (c4188d == null ? 0 : c4188d.hashCode());
    }

    public final String toString() {
        return "CallData(blockedUsersIds=" + this.f17024a + ", call=" + this.f17025b + ", members=" + this.f17026c + ", ownMembership=" + this.f17027d + ")";
    }
}
