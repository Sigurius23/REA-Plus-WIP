package p748zc1;

import com.mapbox.maps.MapboxMap;
import ih0.AbstractC18489d0;
import java.util.List;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import w71.AbstractC36882f0;

/* JADX INFO: renamed from: zc1.n2 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0016\u0010\"¨\u0006#"}, m65681d2 = {"Lzc1/n2;", "", "", "id", "", "question", "context", "group", "Lw71/f0;", "type", "", MapboxMap.QFE_CHILDREN, "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lw71/f0;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Ljava/lang/String;", "d", "getGroup", "e", "Lw71/f0;", "()Lw71/f0;", "f", "Ljava/util/List;", "()Ljava/util/List;", "design-showcase_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40410n2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String question;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String group;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC36882f0 type;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<C40410n2> children;

    public C40410n2(int i13, String question, String context, String group, AbstractC36882f0 type, List<C40410n2> children) {
        AbstractC22676k.m65750j(question, "question");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(group, "group");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(children, "children");
        this.id = i13;
        this.question = question;
        this.context = context;
        this.group = group;
        this.type = type;
        this.children = children;
    }

    /* JADX INFO: renamed from: a */
    public final List<C40410n2> m130430a() {
        return this.children;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getQuestion() {
        return this.question;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AbstractC36882f0 getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40410n2)) {
            return false;
        }
        C40410n2 c40410n2 = (C40410n2) other;
        return this.id == c40410n2.id && AbstractC22676k.m65745e(this.question, c40410n2.question) && AbstractC22676k.m65745e(this.context, c40410n2.context) && AbstractC22676k.m65745e(this.group, c40410n2.group) && AbstractC22676k.m65745e(this.type, c40410n2.type) && AbstractC22676k.m65745e(this.children, c40410n2.children);
    }

    public int hashCode() {
        return this.children.hashCode() + ((this.type.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(Integer.hashCode(this.id) * 31, 31, this.question), 31, this.context), 31, this.group)) * 31);
    }

    public String toString() {
        int i13 = this.id;
        String str = this.question;
        String str2 = this.context;
        String str3 = this.group;
        AbstractC36882f0 abstractC36882f0 = this.type;
        List<C40410n2> list = this.children;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "GalleryQuestion(id=", ", question=", str, ", context=");
        AbstractC11266d.m30444B(sbM53373n, str2, ", group=", str3, ", type=");
        sbM53373n.append(abstractC36882f0);
        sbM53373n.append(", children=");
        sbM53373n.append(list);
        sbM53373n.append(")");
        return sbM53373n.toString();
    }
}
