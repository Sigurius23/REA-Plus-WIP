package v01;

import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: v01.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lv01/d;", "", "Lcom/whoop/design/util/TextResource;", "title", "", "value", "", "isSelected", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "b", "Ljava/lang/String;", "c", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35502d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isSelected;

    public C35502d(TextResource title, String value, boolean z4) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(value, "value");
        this.title = title;
        this.value = value;
        this.isSelected = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35502d)) {
            return false;
        }
        C35502d c35502d = (C35502d) other;
        return AbstractC22676k.m65745e(this.title, c35502d.title) && AbstractC22676k.m65745e(this.value, c35502d.value) && this.isSelected == c35502d.isSelected;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSelected) + AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.value);
    }

    public String toString() {
        TextResource textResource = this.title;
        String str = this.value;
        return AbstractC18489d0.m53372m(AbstractC30007c.m91845o("CommunityFilterSortOption(title=", textResource, ", value=", str, ", isSelected="), this.isSelected, ")");
    }
}
