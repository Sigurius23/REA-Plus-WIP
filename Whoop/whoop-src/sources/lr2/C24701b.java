package lr2;

import com.whoop.design.util.TextResource;
import com.whoop.user.journey.model.UserJourneyFooterStyle;
import java.util.List;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.InterfaceC24673e;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: lr2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001a\u0010#R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010\u0012R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b!\u0010\u0014¨\u0006*"}, m65681d2 = {"Llr2/b;", "Llr2/d;", "", "Llr2/a;", "contentSections", "Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "footerStyle", "Llq2/e;", "backgroundStyle", "", "userJourneyStepName", "Lcom/whoop/design/util/TextResource;", "footerNote", "", "animatableComponentCount", "<init>", "(Ljava/util/List;Lcom/whoop/user/journey/model/UserJourneyFooterStyle;Llq2/e;Ljava/lang/String;Lcom/whoop/design/util/TextResource;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "()Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "c", "Llq2/e;", "()Llq2/e;", "d", "Ljava/lang/String;", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "I", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24701b implements InterfaceC24703d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C24700a> contentSections;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final UserJourneyFooterStyle footerStyle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC24673e backgroundStyle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String userJourneyStepName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource footerNote;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int animatableComponentCount;

    public C24701b(List<C24700a> contentSections, UserJourneyFooterStyle footerStyle, InterfaceC24673e backgroundStyle, String userJourneyStepName, TextResource textResource, int i13) {
        AbstractC22676k.m65750j(contentSections, "contentSections");
        AbstractC22676k.m65750j(footerStyle, "footerStyle");
        AbstractC22676k.m65750j(backgroundStyle, "backgroundStyle");
        AbstractC22676k.m65750j(userJourneyStepName, "userJourneyStepName");
        this.contentSections = contentSections;
        this.footerStyle = footerStyle;
        this.backgroundStyle = backgroundStyle;
        this.userJourneyStepName = userJourneyStepName;
        this.footerNote = textResource;
        this.animatableComponentCount = i13;
    }

    @Override // lr2.InterfaceC24703d
    /* JADX INFO: renamed from: a, reason: from getter */
    public InterfaceC24673e getBackgroundStyle() {
        return this.backgroundStyle;
    }

    @Override // lr2.InterfaceC24703d
    /* JADX INFO: renamed from: b, reason: from getter */
    public UserJourneyFooterStyle getFooterStyle() {
        return this.footerStyle;
    }

    @Override // lr2.InterfaceC24703d
    /* JADX INFO: renamed from: c, reason: from getter */
    public int getAnimatableComponentCount() {
        return this.animatableComponentCount;
    }

    @Override // lr2.InterfaceC24703d
    /* JADX INFO: renamed from: d, reason: from getter */
    public String getUserJourneyStepName() {
        return this.userJourneyStepName;
    }

    /* JADX INFO: renamed from: e */
    public final List<C24700a> m72308e() {
        return this.contentSections;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24701b)) {
            return false;
        }
        C24701b c24701b = (C24701b) other;
        return AbstractC22676k.m65745e(this.contentSections, c24701b.contentSections) && this.footerStyle == c24701b.footerStyle && AbstractC22676k.m65745e(this.backgroundStyle, c24701b.backgroundStyle) && AbstractC22676k.m65745e(this.userJourneyStepName, c24701b.userJourneyStepName) && AbstractC22676k.m65745e(this.footerNote, c24701b.footerNote) && this.animatableComponentCount == c24701b.animatableComponentCount;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getFooterNote() {
        return this.footerNote;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC30007c.m91834d(this.backgroundStyle, (this.footerStyle.hashCode() + (this.contentSections.hashCode() * 31)) * 31, 31), 31, this.userJourneyStepName);
        TextResource textResource = this.footerNote;
        return Integer.hashCode(this.animatableComponentCount) + ((iM30450d + (textResource == null ? 0 : textResource.hashCode())) * 31);
    }

    public String toString() {
        return "InReviewDesignItemStepState(contentSections=" + this.contentSections + ", footerStyle=" + this.footerStyle + ", backgroundStyle=" + this.backgroundStyle + ", userJourneyStepName=" + this.userJourneyStepName + ", footerNote=" + this.footerNote + ", animatableComponentCount=" + this.animatableComponentCount + ")";
    }
}
