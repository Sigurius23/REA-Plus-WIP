package lr2;

import c13.AbstractC3855a;
import com.whoop.user.journey.model.yearinreview.SectionType;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lr2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Llr2/a;", "", "Lcom/whoop/user/journey/model/yearinreview/SectionType;", "sectionType", "", "sectionId", "", "Lm91/u;", "items", "<init>", "(Lcom/whoop/user/journey/model/yearinreview/SectionType;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/user/journey/model/yearinreview/SectionType;", "c", "()Lcom/whoop/user/journey/model/yearinreview/SectionType;", "b", "Ljava/lang/String;", "Ljava/util/List;", "()Ljava/util/List;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24700a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final SectionType sectionType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String sectionId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX WARN: Multi-variable type inference failed */
    public C24700a(SectionType sectionType, String str, List<? extends InterfaceC25312u> items) {
        AbstractC22676k.m65750j(sectionType, "sectionType");
        AbstractC22676k.m65750j(items, "items");
        this.sectionType = sectionType;
        this.sectionId = str;
        this.items = items;
    }

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC25312u> m72305a() {
        return this.items;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSectionId() {
        return this.sectionId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final SectionType getSectionType() {
        return this.sectionType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24700a)) {
            return false;
        }
        C24700a c24700a = (C24700a) other;
        return this.sectionType == c24700a.sectionType && AbstractC22676k.m65745e(this.sectionId, c24700a.sectionId) && AbstractC22676k.m65745e(this.items, c24700a.items);
    }

    public int hashCode() {
        int iHashCode = this.sectionType.hashCode() * 31;
        String str = this.sectionId;
        return this.items.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        SectionType sectionType = this.sectionType;
        String str = this.sectionId;
        List<InterfaceC25312u> list = this.items;
        StringBuilder sb4 = new StringBuilder("ContentSectionState(sectionType=");
        sb4.append(sectionType);
        sb4.append(", sectionId=");
        sb4.append(str);
        sb4.append(", items=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }
}
