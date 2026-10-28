package rq2;

import com.whoop.user.journey.model.UserJourneyFooterStyle;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import lr2.InterfaceC24703d;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.C24670b;
import p717lq2.InterfaceC24673e;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: rq2.q */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\"\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\u0010R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b%\u0010\u0010R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b#\u0010'¨\u0006("}, m65681d2 = {"Lrq2/q;", "Llr2/d;", "Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "footerStyle", "Llq2/e;", "backgroundStyle", "", "userJourneyStepName", "year", "greetingName", "greetingBody", "Llq2/b;", "footnote", "<init>", "(Lcom/whoop/user/journey/model/UserJourneyFooterStyle;Llq2/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llq2/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "b", "()Lcom/whoop/user/journey/model/UserJourneyFooterStyle;", "Llq2/e;", "()Llq2/e;", "c", "Ljava/lang/String;", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "g", "f", "Llq2/b;", "()Llq2/b;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31745q implements InterfaceC24703d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final UserJourneyFooterStyle footerStyle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC24673e backgroundStyle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String userJourneyStepName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String year;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String greetingName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String greetingBody;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C24670b footnote;

    public C31745q(UserJourneyFooterStyle footerStyle, InterfaceC24673e backgroundStyle, String userJourneyStepName, String year, String greetingName, String greetingBody, C24670b footnote) {
        AbstractC22676k.m65750j(footerStyle, "footerStyle");
        AbstractC22676k.m65750j(backgroundStyle, "backgroundStyle");
        AbstractC22676k.m65750j(userJourneyStepName, "userJourneyStepName");
        AbstractC22676k.m65750j(year, "year");
        AbstractC22676k.m65750j(greetingName, "greetingName");
        AbstractC22676k.m65750j(greetingBody, "greetingBody");
        AbstractC22676k.m65750j(footnote, "footnote");
        this.footerStyle = footerStyle;
        this.backgroundStyle = backgroundStyle;
        this.userJourneyStepName = userJourneyStepName;
        this.year = year;
        this.greetingName = greetingName;
        this.greetingBody = greetingBody;
        this.footnote = footnote;
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
    public final C24670b getFootnote() {
        return this.footnote;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31745q)) {
            return false;
        }
        C31745q c31745q = (C31745q) other;
        return this.footerStyle == c31745q.footerStyle && AbstractC22676k.m65745e(this.backgroundStyle, c31745q.backgroundStyle) && AbstractC22676k.m65745e(this.userJourneyStepName, c31745q.userJourneyStepName) && AbstractC22676k.m65745e(this.year, c31745q.year) && AbstractC22676k.m65745e(this.greetingName, c31745q.greetingName) && AbstractC22676k.m65745e(this.greetingBody, c31745q.greetingBody) && AbstractC22676k.m65745e(this.footnote, c31745q.footnote);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getGreetingBody() {
        return this.greetingBody;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getGreetingName() {
        return this.greetingName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getYear() {
        return this.year;
    }

    public int hashCode() {
        return this.footnote.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC30007c.m91834d(this.backgroundStyle, this.footerStyle.hashCode() * 31, 31), 31, this.userJourneyStepName), 31, this.year), 31, this.greetingName), 31, this.greetingBody);
    }

    public String toString() {
        UserJourneyFooterStyle userJourneyFooterStyle = this.footerStyle;
        InterfaceC24673e interfaceC24673e = this.backgroundStyle;
        String str = this.userJourneyStepName;
        String str2 = this.year;
        String str3 = this.greetingName;
        String str4 = this.greetingBody;
        C24670b c24670b = this.footnote;
        StringBuilder sb4 = new StringBuilder("IntroUserJourneyStepState(footerStyle=");
        sb4.append(userJourneyFooterStyle);
        sb4.append(", backgroundStyle=");
        sb4.append(interfaceC24673e);
        sb4.append(", userJourneyStepName=");
        AbstractC11266d.m30444B(sb4, str, ", year=", str2, ", greetingName=");
        AbstractC11266d.m30444B(sb4, str3, ", greetingBody=", str4, ", footnote=");
        sb4.append(c24670b);
        sb4.append(")");
        return sb4.toString();
    }
}
