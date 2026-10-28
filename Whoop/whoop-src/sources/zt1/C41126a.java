package zt1;

import c13.AbstractC3855a;
import com.whoop.design.util.TextResource;
import java.util.List;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: zt1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lzt1/a;", "", "Lcom/whoop/design/util/TextResource;", "dateName", "", "key", "", "Lzt1/b;", "readings", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/lang/String;", "c", "Ljava/util/List;", "()Ljava/util/List;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C41126a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource dateName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String key;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C41127b> readings;

    public C41126a(TextResource dateName, String key, List<C41127b> readings) {
        AbstractC22676k.m65750j(dateName, "dateName");
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(readings, "readings");
        this.dateName = dateName;
        this.key = key;
        this.readings = readings;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getDateName() {
        return this.dateName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: c */
    public final List<C41127b> m133518c() {
        return this.readings;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C41126a)) {
            return false;
        }
        C41126a c41126a = (C41126a) other;
        return AbstractC22676k.m65745e(this.dateName, c41126a.dateName) && AbstractC22676k.m65745e(this.key, c41126a.key) && AbstractC22676k.m65745e(this.readings, c41126a.readings);
    }

    public int hashCode() {
        return this.readings.hashCode() + AbstractC11266d.m30450d(this.dateName.hashCode() * 31, 31, this.key);
    }

    public String toString() {
        TextResource textResource = this.dateName;
        String str = this.key;
        return AbstractC3855a.m11829m(AbstractC30007c.m91845o("LabradorReadingGroupViewState(dateName=", textResource, ", key=", str, ", readings="), this.readings, ")");
    }
}
