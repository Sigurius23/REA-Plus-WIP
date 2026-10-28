package xk1;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xk1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lxk1/a;", "", "", "sectionTitle", "articleUrl", "title", "Lxk1/f;", "questionType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxk1/f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "Lxk1/f;", "getQuestionType", "()Lxk1/f;", "help-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38427a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String sectionTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String articleUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC38432f questionType;

    public C38427a(String sectionTitle, String articleUrl, String title, EnumC38432f questionType) {
        AbstractC22676k.m65750j(sectionTitle, "sectionTitle");
        AbstractC22676k.m65750j(articleUrl, "articleUrl");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(questionType, "questionType");
        this.sectionTitle = sectionTitle;
        this.articleUrl = articleUrl;
        this.title = title;
        this.questionType = questionType;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getArticleUrl() {
        return this.articleUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSectionTitle() {
        return this.sectionTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38427a)) {
            return false;
        }
        C38427a c38427a = (C38427a) other;
        return AbstractC22676k.m65745e(this.sectionTitle, c38427a.sectionTitle) && AbstractC22676k.m65745e(this.articleUrl, c38427a.articleUrl) && AbstractC22676k.m65745e(this.title, c38427a.title) && this.questionType == c38427a.questionType;
    }

    public int hashCode() {
        return this.questionType.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.sectionTitle.hashCode() * 31, 31, this.articleUrl), 31, this.title);
    }

    public String toString() {
        String str = this.sectionTitle;
        String str2 = this.articleUrl;
        String str3 = this.title;
        EnumC38432f enumC38432f = this.questionType;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("BrowseAllSection(sectionTitle=", str, ", articleUrl=", str2, ", title=");
        sbM32001t.append(str3);
        sbM32001t.append(", questionType=");
        sbM32001t.append(enumC38432f);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
