package l92;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: l92.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0004¨\u0006\u001f"}, m65681d2 = {"Ll92/b;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "a", "Ljava/util/List;", "getIds", "()Ljava/util/List;", "ids", "b", "Ljava/lang/String;", "getSummary", "summary", "c", "Z", "isRequired", "()Z", "d", "isExpansionRequired", "e", "getExpansion", "expansion", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23544b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<String> ids;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("summary")
    private final String summary;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("required")
    private final boolean isRequired;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("expansion_required")
    private final boolean isExpansionRequired;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String expansion;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23544b)) {
            return false;
        }
        C23544b c23544b = (C23544b) other;
        return AbstractC22676k.m65745e(this.ids, c23544b.ids) && AbstractC22676k.m65745e(this.summary, c23544b.summary) && this.isRequired == c23544b.isRequired && this.isExpansionRequired == c23544b.isExpansionRequired && AbstractC22676k.m65745e(this.expansion, c23544b.expansion);
    }

    public int hashCode() {
        return this.expansion.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.ids.hashCode() * 31, 31, this.summary), 31, this.isRequired), 31, this.isExpansionRequired);
    }

    public String toString() {
        List<String> list = this.ids;
        String str = this.summary;
        boolean z4 = this.isRequired;
        boolean z13 = this.isExpansionRequired;
        String str2 = this.expansion;
        StringBuilder sbM79507k = AbstractC26725a.m79507k("TermModel(ids=", ", summary=", str, ", isRequired=", list);
        AbstractC38963t7.m124392v(sbM79507k, z4, ", isExpansionRequired=", z13, ", expansion=");
        return AbstractC25012a.m73376i(str2, ")", sbM79507k);
    }
}
