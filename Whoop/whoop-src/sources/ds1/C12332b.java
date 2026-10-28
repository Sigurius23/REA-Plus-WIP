package ds1;

import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ds1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\r¨\u0006\u001f"}, m65681d2 = {"Lds1/b;", "", "Lds1/a;", "type", "", "title", "question", "", "questionId", "value", "<init>", "(Lds1/a;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lds1/a;", "c", "()Lds1/a;", "b", "Ljava/lang/String;", "getQuestion", "d", "I", "e", "getValue", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12332b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12331a type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String question;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int questionId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String value;

    public C12332b(AbstractC12331a abstractC12331a, String title, String question, int i13, String value) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(question, "question");
        AbstractC22676k.m65750j(value, "value");
        this.type = abstractC12331a;
        this.title = title;
        this.question = question;
        this.questionId = i13;
        this.value = value;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getQuestionId() {
        return this.questionId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC12331a getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12332b)) {
            return false;
        }
        C12332b c12332b = (C12332b) other;
        return AbstractC22676k.m65745e(this.type, c12332b.type) && AbstractC22676k.m65745e(this.title, c12332b.title) && AbstractC22676k.m65745e(this.question, c12332b.question) && this.questionId == c12332b.questionId && AbstractC22676k.m65745e(this.value, c12332b.value);
    }

    public int hashCode() {
        AbstractC12331a abstractC12331a = this.type;
        return this.value.hashCode() + AbstractC11266d.m30448b(this.questionId, AbstractC11266d.m30450d(AbstractC11266d.m30450d((abstractC12331a == null ? 0 : abstractC12331a.hashCode()) * 31, 31, this.title), 31, this.question), 31);
    }

    public String toString() {
        AbstractC12331a abstractC12331a = this.type;
        String str = this.title;
        String str2 = this.question;
        int i13 = this.questionId;
        String str3 = this.value;
        StringBuilder sb4 = new StringBuilder("BottomSheetInfo(type=");
        sb4.append(abstractC12331a);
        sb4.append(", title=");
        sb4.append(str);
        sb4.append(", question=");
        AbstractC11266d.m30470x(i13, str2, ", questionId=", ", value=", sb4);
        return AbstractC25012a.m73376i(str3, ")", sb4);
    }

    public /* synthetic */ C12332b(AbstractC12331a abstractC12331a, String str, String str2, int i13, String str3, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC12331a, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? "" : str2, (i14 & 8) != 0 ? -1 : i13, (i14 & 16) != 0 ? "" : str3);
    }
}
