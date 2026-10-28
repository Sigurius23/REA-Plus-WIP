package j62;

import com.whoop.referafriend.domain.models.TrialsTutorialModel;
import java.util.List;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j62.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u0016\u0010\u000e¨\u0006 "}, m65681d2 = {"Lj62/h;", "", "", "title", "", "Lj62/g;", "trialItems", "Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;", "tutorialContent", "skipCtaText", "continueCtaText", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;", "e", "()Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21383h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C21382g> trialItems;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TrialsTutorialModel tutorialContent;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String skipCtaText;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String continueCtaText;

    public C21383h(String title, List<C21382g> trialItems, TrialsTutorialModel tutorialContent, String skipCtaText, String continueCtaText) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(trialItems, "trialItems");
        AbstractC22676k.m65750j(tutorialContent, "tutorialContent");
        AbstractC22676k.m65750j(skipCtaText, "skipCtaText");
        AbstractC22676k.m65750j(continueCtaText, "continueCtaText");
        this.title = title;
        this.trialItems = trialItems;
        this.tutorialContent = tutorialContent;
        this.skipCtaText = skipCtaText;
        this.continueCtaText = continueCtaText;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getContinueCtaText() {
        return this.continueCtaText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSkipCtaText() {
        return this.skipCtaText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: d */
    public final List<C21382g> m60027d() {
        return this.trialItems;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TrialsTutorialModel getTutorialContent() {
        return this.tutorialContent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21383h)) {
            return false;
        }
        C21383h c21383h = (C21383h) other;
        return AbstractC22676k.m65745e(this.title, c21383h.title) && AbstractC22676k.m65745e(this.trialItems, c21383h.trialItems) && AbstractC22676k.m65745e(this.tutorialContent, c21383h.tutorialContent) && AbstractC22676k.m65745e(this.skipCtaText, c21383h.skipCtaText) && AbstractC22676k.m65745e(this.continueCtaText, c21383h.continueCtaText);
    }

    public int hashCode() {
        return this.continueCtaText.hashCode() + AbstractC11266d.m30450d((this.tutorialContent.hashCode() + AbstractC11895b.m31983b(this.title.hashCode() * 31, 31, this.trialItems)) * 31, 31, this.skipCtaText);
    }

    public String toString() {
        String str = this.title;
        List<C21382g> list = this.trialItems;
        TrialsTutorialModel trialsTutorialModel = this.tutorialContent;
        String str2 = this.skipCtaText;
        String str3 = this.continueCtaText;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("TrialsRafHubDomainState(title=", str, ", trialItems=", ", tutorialContent=", list);
        sbM94766o.append(trialsTutorialModel);
        sbM94766o.append(", skipCtaText=");
        sbM94766o.append(str2);
        sbM94766o.append(", continueCtaText=");
        return AbstractC25012a.m73376i(str3, ")", sbM94766o);
    }
}
