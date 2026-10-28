package c43;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: c43.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C4188d implements Serializable {

    /* JADX INFO: renamed from: E */
    public final List f17037E;

    /* JADX INFO: renamed from: F */
    public final Date f17038F;

    /* JADX INFO: renamed from: G */
    public final Date f17039G;

    /* JADX INFO: renamed from: w */
    public final String f17040w;

    /* JADX INFO: renamed from: x */
    public final String f17041x;

    /* JADX INFO: renamed from: y */
    public final String f17042y;

    /* JADX INFO: renamed from: z */
    public final String f17043z;

    public C4188d(String id4, String str, String str2, String str3, List list, Date date, Date date2) {
        AbstractC22676k.m65750j(id4, "id");
        this.f17040w = id4;
        this.f17041x = str;
        this.f17042y = str2;
        this.f17043z = str3;
        this.f17037E = list;
        this.f17038F = date;
        this.f17039G = date2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4188d)) {
            return false;
        }
        C4188d c4188d = (C4188d) obj;
        return AbstractC22676k.m65745e(this.f17040w, c4188d.f17040w) && this.f17041x.equals(c4188d.f17041x) && AbstractC22676k.m65745e(this.f17042y, c4188d.f17042y) && this.f17043z.equals(c4188d.f17043z) && this.f17037E.equals(c4188d.f17037E) && this.f17038F.equals(c4188d.f17038F) && this.f17039G.equals(c4188d.f17039G);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.f17040w.hashCode() * 31, 31, this.f17041x);
        String str = this.f17042y;
        return this.f17039G.hashCode() + AbstractC38963t7.m124373c(this.f17038F, AbstractC11895b.m31983b(AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 961, this.f17043z), 961, this.f17037E), 31);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CallUser(id=", this.f17040w, ", name=", this.f17041x, ", role=");
        AbstractC11266d.m30444B(sbM32001t, this.f17042y, ", imageUrl=", this.f17043z, ", isLocalUser=null, teams=");
        sbM32001t.append(this.f17037E);
        sbM32001t.append(", state=null, createdAt=");
        sbM32001t.append(this.f17038F);
        sbM32001t.append(", updatedAt=");
        return AbstractC13673n.m38564k(sbM32001t, this.f17039G, ")");
    }
}
