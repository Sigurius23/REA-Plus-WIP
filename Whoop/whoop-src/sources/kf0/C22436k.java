package kf0;

import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: kf0.k */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\b\u0010\tJB\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001a\u0010\rR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lkf0/k;", "Lm91/u;", "", "id", "headerText", "bodyText", "", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lkf0/k;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "f", "c", "d", "Ljava/util/List;", "e", "()Ljava/util/List;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22436k implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String headerText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String bodyText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<InterfaceC25312u> content;

    /* JADX WARN: Multi-variable type inference failed */
    public C22436k(String id4, String str, String str2, List<? extends InterfaceC25312u> content) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(content, "content");
        this.id = id4;
        this.headerText = str;
        this.bodyText = str2;
        this.content = content;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C22436k m64731b(C22436k c22436k, String str, String str2, String str3, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c22436k.id;
        }
        if ((i13 & 2) != 0) {
            str2 = c22436k.headerText;
        }
        if ((i13 & 4) != 0) {
            str3 = c22436k.bodyText;
        }
        if ((i13 & 8) != 0) {
            list = c22436k.content;
        }
        return c22436k.m64732a(str, str2, str3, list);
    }

    /* JADX INFO: renamed from: a */
    public final C22436k m64732a(String id4, String headerText, String bodyText, List<? extends InterfaceC25312u> content) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(content, "content");
        return new C22436k(id4, headerText, bodyText, content);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBodyText() {
        return this.bodyText;
    }

    /* JADX INFO: renamed from: e */
    public final List<InterfaceC25312u> m64734e() {
        return this.content;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22436k)) {
            return false;
        }
        C22436k c22436k = (C22436k) other;
        return AbstractC22676k.m65745e(this.id, c22436k.id) && AbstractC22676k.m65745e(this.headerText, c22436k.headerText) && AbstractC22676k.m65745e(this.bodyText, c22436k.bodyText) && AbstractC22676k.m65745e(this.content, c22436k.content);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getHeaderText() {
        return this.headerText;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.headerText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bodyText;
        return this.content.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.headerText;
        return AbstractC30007c.m91840j(this.bodyText, ", content=", ")", AbstractC11895b.m32001t("AdvancedLabsSectionState(id=", str, ", headerText=", str2, ", bodyText="), this.content);
    }
}
