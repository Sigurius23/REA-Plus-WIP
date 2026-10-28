package hq1;

import com.whoop.design.models.DesignSystemModel;
import java.util.List;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hq1.g */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\n¨\u0006\u0017"}, m65681d2 = {"Lhq1/g;", "", "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "", "sectionType", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17568g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<DesignSystemModel> items;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String sectionType;

    /* JADX WARN: Multi-variable type inference failed */
    public C17568g(List<? extends DesignSystemModel> items, String str) {
        AbstractC22676k.m65750j(items, "items");
        this.items = items;
        this.sectionType = str;
    }

    /* JADX INFO: renamed from: a */
    public final List<DesignSystemModel> m50010a() {
        return this.items;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSectionType() {
        return this.sectionType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C17568g)) {
            return false;
        }
        C17568g c17568g = (C17568g) other;
        return AbstractC22676k.m65745e(this.items, c17568g.items) && AbstractC22676k.m65745e(this.sectionType, c17568g.sectionType);
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        String str = this.sectionType;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return AbstractC30802r.m94761j("ImpactDetailsSection(items=", ", sectionType=", this.sectionType, ")", this.items);
    }
}
