package sr1;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: sr1.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0013\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lsr1/h;", "", "", "questionId", "", "title", "questionTitle", "Lsr1/a;", "componentToShow", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lsr1/a;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "Ljava/lang/String;", "d", "c", "Lsr1/a;", "()Lsr1/a;", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32916h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Integer questionId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String questionTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC32909a componentToShow;

    public C32916h(Integer num, String str, String str2, AbstractC32909a abstractC32909a) {
        this.questionId = num;
        this.title = str;
        this.questionTitle = str2;
        this.componentToShow = abstractC32909a;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC32909a getComponentToShow() {
        return this.componentToShow;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getQuestionId() {
        return this.questionId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getQuestionTitle() {
        return this.questionTitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32916h)) {
            return false;
        }
        C32916h c32916h = (C32916h) other;
        return AbstractC22676k.m65745e(this.questionId, c32916h.questionId) && AbstractC22676k.m65745e(this.title, c32916h.title) && AbstractC22676k.m65745e(this.questionTitle, c32916h.questionTitle) && AbstractC22676k.m65745e(this.componentToShow, c32916h.componentToShow);
    }

    public int hashCode() {
        Integer num = this.questionId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.questionTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AbstractC32909a abstractC32909a = this.componentToShow;
        return iHashCode3 + (abstractC32909a != null ? abstractC32909a.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.questionId;
        String str = this.title;
        String str2 = this.questionTitle;
        AbstractC32909a abstractC32909a = this.componentToShow;
        StringBuilder sbM95643s = AbstractC31061c.m95643s("Sheet(questionId=", ", title=", num, str, ", questionTitle=");
        sbM95643s.append(str2);
        sbM95643s.append(", componentToShow=");
        sbM95643s.append(abstractC32909a);
        sbM95643s.append(")");
        return sbM95643s.toString();
    }

    public /* synthetic */ C32916h(Integer num, String str, String str2, AbstractC32909a abstractC32909a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : abstractC32909a);
    }
}
