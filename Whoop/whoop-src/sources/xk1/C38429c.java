package xk1;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xk1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b\u001b\u0010\u0011R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u000f¨\u0006#"}, m65681d2 = {"Lxk1/c;", "", "", "title", "subTitle", "Lxk1/f;", "questionType", "", "leftIcon", "rightIcon", "articleLink", "previewText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lxk1/f;IILjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "d", "c", "Lxk1/f;", "getQuestionType", "()Lxk1/f;", "I", "f", "g", "getPreviewText", "help-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38429c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String subTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC38432f questionType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int leftIcon;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int rightIcon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String articleLink;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String previewText;

    public C38429c(String title, String subTitle, EnumC38432f questionType, int i13, int i14, String str, String previewText) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subTitle, "subTitle");
        AbstractC22676k.m65750j(questionType, "questionType");
        AbstractC22676k.m65750j(previewText, "previewText");
        this.title = title;
        this.subTitle = subTitle;
        this.questionType = questionType;
        this.leftIcon = i13;
        this.rightIcon = i14;
        this.articleLink = str;
        this.previewText = previewText;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getArticleLink() {
        return this.articleLink;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getLeftIcon() {
        return this.leftIcon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getRightIcon() {
        return this.rightIcon;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38429c)) {
            return false;
        }
        C38429c c38429c = (C38429c) other;
        return AbstractC22676k.m65745e(this.title, c38429c.title) && AbstractC22676k.m65745e(this.subTitle, c38429c.subTitle) && this.questionType == c38429c.questionType && this.leftIcon == c38429c.leftIcon && this.rightIcon == c38429c.rightIcon && AbstractC22676k.m65745e(this.articleLink, c38429c.articleLink) && AbstractC22676k.m65745e(this.previewText, c38429c.previewText);
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.rightIcon, AbstractC11266d.m30448b(this.leftIcon, (this.questionType.hashCode() + AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subTitle)) * 31, 31), 31);
        String str = this.articleLink;
        return this.previewText.hashCode() + ((iM30448b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subTitle;
        EnumC38432f enumC38432f = this.questionType;
        int i13 = this.leftIcon;
        int i14 = this.rightIcon;
        String str3 = this.articleLink;
        String str4 = this.previewText;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CommonQuestionCard(title=", str, ", subTitle=", str2, ", questionType=");
        sbM32001t.append(enumC38432f);
        sbM32001t.append(", leftIcon=");
        sbM32001t.append(i13);
        sbM32001t.append(", rightIcon=");
        AbstractC11895b.m31979B(i14, ", articleLink=", str3, ", previewText=", sbM32001t);
        return AbstractC25012a.m73376i(str4, ")", sbM32001t);
    }
}
