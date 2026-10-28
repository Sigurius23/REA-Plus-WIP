package rq2;

import com.whoop.design.util.TextResource;
import com.whoop.user.journey.model.UserJourneyFooterStyle;
import java.util.List;
import kd1.AbstractC22403o;
import lr2.InterfaceC24703d;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p717lq2.InterfaceC24673e;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: rq2.s */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,¨\u0006-"}, m65681d2 = {"Lrq2/s;", "Llr2/d;", "Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "footerStyle", "Llq2/e;", "backgroundStyle", "", "userJourneyStepName", "Lkd1/o;", "backgroundImage", "", "Lcom/whoop/design/util/TextResource;", "text", "", "fontSize", "<init>", "(Lcom/whoop/user/journey/model/UserJourneyFooterStyle;Llq2/e;Ljava/lang/String;Lkd1/o;Ljava/util/List;F)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "b", "()Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "Llq2/e;", "()Llq2/e;", "c", "Ljava/lang/String;", "d", "Lkd1/o;", "e", "()Lkd1/o;", "Ljava/util/List;", "g", "()Ljava/util/List;", "f", "F", "()F", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31749s implements InterfaceC24703d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final UserJourneyFooterStyle footerStyle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC24673e backgroundStyle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String userJourneyStepName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC22403o backgroundImage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<TextResource> text;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float fontSize;

    /* JADX WARN: Multi-variable type inference failed */
    public C31749s(UserJourneyFooterStyle footerStyle, InterfaceC24673e backgroundStyle, String userJourneyStepName, AbstractC22403o abstractC22403o, List<? extends TextResource> text, float f13) {
        AbstractC22676k.m65750j(footerStyle, "footerStyle");
        AbstractC22676k.m65750j(backgroundStyle, "backgroundStyle");
        AbstractC22676k.m65750j(userJourneyStepName, "userJourneyStepName");
        AbstractC22676k.m65750j(text, "text");
        this.footerStyle = footerStyle;
        this.backgroundStyle = backgroundStyle;
        this.userJourneyStepName = userJourneyStepName;
        this.backgroundImage = abstractC22403o;
        this.text = text;
        this.fontSize = f13;
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
    /* JADX INFO: renamed from: c */
    public /* bridge */ int mo5920c() {
        return super.mo5920c();
    }

    @Override // lr2.InterfaceC24703d
    /* JADX INFO: renamed from: d, reason: from getter */
    public String getUserJourneyStepName() {
        return this.userJourneyStepName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AbstractC22403o getBackgroundImage() {
        return this.backgroundImage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31749s)) {
            return false;
        }
        C31749s c31749s = (C31749s) other;
        return this.footerStyle == c31749s.footerStyle && AbstractC22676k.m65745e(this.backgroundStyle, c31749s.backgroundStyle) && AbstractC22676k.m65745e(this.userJourneyStepName, c31749s.userJourneyStepName) && AbstractC22676k.m65745e(this.backgroundImage, c31749s.backgroundImage) && AbstractC22676k.m65745e(this.text, c31749s.text) && Float.compare(this.fontSize, c31749s.fontSize) == 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getFontSize() {
        return this.fontSize;
    }

    /* JADX INFO: renamed from: g */
    public final List<TextResource> m98543g() {
        return this.text;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC30007c.m91834d(this.backgroundStyle, this.footerStyle.hashCode() * 31, 31), 31, this.userJourneyStepName);
        AbstractC22403o abstractC22403o = this.backgroundImage;
        return Float.hashCode(this.fontSize) + AbstractC11895b.m31983b((iM30450d + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31, 31, this.text);
    }

    public String toString() {
        return "LongTextStepState(footerStyle=" + this.footerStyle + ", backgroundStyle=" + this.backgroundStyle + ", userJourneyStepName=" + this.userJourneyStepName + ", backgroundImage=" + this.backgroundImage + ", text=" + this.text + ", fontSize=" + this.fontSize + ")";
    }

    public /* synthetic */ C31749s(UserJourneyFooterStyle userJourneyFooterStyle, InterfaceC24673e interfaceC24673e, String str, AbstractC22403o abstractC22403o, List list, float f13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(userJourneyFooterStyle, interfaceC24673e, str, (i13 & 8) != 0 ? null : abstractC22403o, list, (i13 & 32) != 0 ? 7.0f : f13);
    }
}
