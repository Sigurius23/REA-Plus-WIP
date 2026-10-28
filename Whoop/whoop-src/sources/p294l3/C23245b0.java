package p294l3;

import p000.AbstractC11266d;
import p448r3.AbstractC30895a;
import p571w3.C36768d;
import p571w3.C36769e;
import p571w3.C36773i;
import p571w3.C36775k;
import p571w3.C36777m;
import p571w3.C36781q;
import p571w3.C36783s;
import p636y3.C39183o;
import p636y3.C39184p;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l3.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23245b0 implements InterfaceC23244b {

    /* JADX INFO: renamed from: a */
    public final int f92104a;

    /* JADX INFO: renamed from: b */
    public final int f92105b;

    /* JADX INFO: renamed from: c */
    public final long f92106c;

    /* JADX INFO: renamed from: d */
    public final C36781q f92107d;

    /* JADX INFO: renamed from: e */
    public final C23251e0 f92108e;

    /* JADX INFO: renamed from: f */
    public final C36773i f92109f;

    /* JADX INFO: renamed from: g */
    public final int f92110g;

    /* JADX INFO: renamed from: h */
    public final int f92111h;

    /* JADX INFO: renamed from: i */
    public final C36783s f92112i;

    public C23245b0(int i13, int i14, long j7, C36781q c36781q, C23251e0 c23251e0, C36773i c36773i, int i15, int i16, C36783s c36783s) {
        this.f92104a = i13;
        this.f92105b = i14;
        this.f92106c = j7;
        this.f92107d = c36781q;
        this.f92108e = c23251e0;
        this.f92109f = c36773i;
        this.f92110g = i15;
        this.f92111h = i16;
        this.f92112i = c36783s;
        if (C39183o.m124803a(j7, C39183o.f168428c) || C39183o.m124805c(j7) >= 0.0f) {
            return;
        }
        AbstractC30895a.m95017c("lineHeight can't be negative (" + C39183o.m124805c(j7) + ')');
    }

    /* JADX INFO: renamed from: a */
    public final C23245b0 m67296a(C23245b0 c23245b0) {
        return c23245b0 == null ? this : AbstractC23247c0.m67298a(this, c23245b0.f92104a, c23245b0.f92105b, c23245b0.f92106c, c23245b0.f92107d, c23245b0.f92108e, c23245b0.f92109f, c23245b0.f92110g, c23245b0.f92111h, c23245b0.f92112i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23245b0)) {
            return false;
        }
        C23245b0 c23245b0 = (C23245b0) obj;
        return this.f92104a == c23245b0.f92104a && this.f92105b == c23245b0.f92105b && C39183o.m124803a(this.f92106c, c23245b0.f92106c) && AbstractC22676k.m65745e(this.f92107d, c23245b0.f92107d) && AbstractC22676k.m65745e(this.f92108e, c23245b0.f92108e) && AbstractC22676k.m65745e(this.f92109f, c23245b0.f92109f) && this.f92110g == c23245b0.f92110g && this.f92111h == c23245b0.f92111h && AbstractC22676k.m65745e(this.f92112i, c23245b0.f92112i);
    }

    public final int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.f92105b, Integer.hashCode(this.f92104a) * 31, 31);
        C39184p[] c39184pArr = C39183o.f168427b;
        int iM30451e = AbstractC11266d.m30451e(iM30448b, this.f92106c, 31);
        C36781q c36781q = this.f92107d;
        int iHashCode = (iM30451e + (c36781q != null ? c36781q.hashCode() : 0)) * 31;
        C23251e0 c23251e0 = this.f92108e;
        int iHashCode2 = (iHashCode + (c23251e0 != null ? c23251e0.hashCode() : 0)) * 31;
        C36773i c36773i = this.f92109f;
        int iM30448b2 = AbstractC11266d.m30448b(this.f92111h, AbstractC11266d.m30448b(this.f92110g, (iHashCode2 + (c36773i != null ? c36773i.hashCode() : 0)) * 31, 31), 31);
        C36783s c36783s = this.f92112i;
        return iM30448b2 + (c36783s != null ? c36783s.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) C36775k.m117881a(this.f92104a)) + ", textDirection=" + ((Object) C36777m.m117882a(this.f92105b)) + ", lineHeight=" + ((Object) C39183o.m124807e(this.f92106c)) + ", textIndent=" + this.f92107d + ", platformStyle=" + this.f92108e + ", lineHeightStyle=" + this.f92109f + ", lineBreak=" + ((Object) C36769e.m117878a(this.f92110g)) + ", hyphens=" + ((Object) C36768d.m117877a(this.f92111h)) + ", textMotion=" + this.f92112i + ')';
    }

    public C23245b0(int i13, C36781q c36781q, int i14) {
        this((i14 & 1) != 0 ? Integer.MIN_VALUE : i13, Integer.MIN_VALUE, C39183o.f168428c, (i14 & 8) != 0 ? null : c36781q, null, null, 0, Integer.MIN_VALUE, null);
    }
}
