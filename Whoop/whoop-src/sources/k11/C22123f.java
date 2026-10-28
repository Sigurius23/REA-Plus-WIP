package k11;

import com.whoop.analytics.AnalyticEventModel;
import f01.EnumC13892q1;
import hy0.C17750h1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.C27256h;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: k11.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u009e\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b*\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b-\u0010<\u001a\u0004\b2\u0010=R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b4\u0010>\u001a\u0004\b6\u0010?R\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b7\u0010>\u001a\u0004\b)\u0010?R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b:\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b0\u0010C\u001a\u0004\b8\u0010D¨\u0006E"}, m65681d2 = {"Lk11/f;", "Lm91/u;", "", "id", "title", "body", "Lkd1/o;", "image", "Lhy0/h1;", "tag", "Lny0/h;", "primaryButtonState", "secondaryButtonState", "Lf01/q1;", "style", "Lk11/a;", "buttonConfiguration", "", "fillHeight", "autoPad", "Lcom/whoop/analytics/AnalyticEventModel;", "viewedAnalyticEvent", "Ly3/f;", "horizontalPadding", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lhy0/h1;Lny0/h;Lny0/h;Lf01/q1;Lk11/a;ZZLcom/whoop/analytics/AnalyticEventModel;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lhy0/h1;Lny0/h;Lny0/h;Lf01/q1;Lk11/a;ZZLcom/whoop/analytics/AnalyticEventModel;F)Lk11/f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "n", "c", "e", "d", "Lkd1/o;", "i", "()Lkd1/o;", "Lhy0/h1;", "m", "()Lhy0/h1;", "f", "Lny0/h;", "j", "()Lny0/h;", "g", "k", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lf01/q1;", "l", "()Lf01/q1;", "Lk11/a;", "()Lk11/a;", "Z", "()Z", "Lcom/whoop/analytics/AnalyticEventModel;", "o", "()Lcom/whoop/analytics/AnalyticEventModel;", "F", "()F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22123f implements InterfaceC25312u {

    /* JADX INFO: renamed from: n */
    public static final int f85827n = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String body;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C17750h1 tag;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C27256h primaryButtonState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C27256h secondaryButtonState;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final EnumC13892q1 style;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final EnumC22118a buttonConfiguration;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean fillHeight;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean autoPad;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final AnalyticEventModel viewedAnalyticEvent;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final float horizontalPadding;

    public /* synthetic */ C22123f(String str, String str2, String str3, AbstractC22403o abstractC22403o, C17750h1 c17750h1, C27256h c27256h, C27256h c27256h2, EnumC13892q1 enumC13892q1, EnumC22118a enumC22118a, boolean z4, boolean z13, AnalyticEventModel analyticEventModel, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, abstractC22403o, c17750h1, c27256h, c27256h2, enumC13892q1, enumC22118a, z4, z13, analyticEventModel, f13);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C22123f m63348b(C22123f c22123f, String str, String str2, String str3, AbstractC22403o abstractC22403o, C17750h1 c17750h1, C27256h c27256h, C27256h c27256h2, EnumC13892q1 enumC13892q1, EnumC22118a enumC22118a, boolean z4, boolean z13, AnalyticEventModel analyticEventModel, float f13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c22123f.id;
        }
        return c22123f.m63349a(str, (i13 & 2) != 0 ? c22123f.title : str2, (i13 & 4) != 0 ? c22123f.body : str3, (i13 & 8) != 0 ? c22123f.image : abstractC22403o, (i13 & 16) != 0 ? c22123f.tag : c17750h1, (i13 & 32) != 0 ? c22123f.primaryButtonState : c27256h, (i13 & 64) != 0 ? c22123f.secondaryButtonState : c27256h2, (i13 & 128) != 0 ? c22123f.style : enumC13892q1, (i13 & 256) != 0 ? c22123f.buttonConfiguration : enumC22118a, (i13 & 512) != 0 ? c22123f.fillHeight : z4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c22123f.autoPad : z13, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c22123f.viewedAnalyticEvent : analyticEventModel, (i13 & 4096) != 0 ? c22123f.horizontalPadding : f13);
    }

    /* JADX INFO: renamed from: a */
    public final C22123f m63349a(String id4, String title, String body, AbstractC22403o image, C17750h1 tag, C27256h primaryButtonState, C27256h secondaryButtonState, EnumC13892q1 style, EnumC22118a buttonConfiguration, boolean fillHeight, boolean autoPad, AnalyticEventModel viewedAnalyticEvent, float horizontalPadding) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(style, "style");
        return new C22123f(id4, title, body, image, tag, primaryButtonState, secondaryButtonState, style, buttonConfiguration, fillHeight, autoPad, viewedAnalyticEvent, horizontalPadding, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getAutoPad() {
        return this.autoPad;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22123f)) {
            return false;
        }
        C22123f c22123f = (C22123f) other;
        return AbstractC22676k.m65745e(this.id, c22123f.id) && AbstractC22676k.m65745e(this.title, c22123f.title) && AbstractC22676k.m65745e(this.body, c22123f.body) && AbstractC22676k.m65745e(this.image, c22123f.image) && AbstractC22676k.m65745e(this.tag, c22123f.tag) && AbstractC22676k.m65745e(this.primaryButtonState, c22123f.primaryButtonState) && AbstractC22676k.m65745e(this.secondaryButtonState, c22123f.secondaryButtonState) && this.style == c22123f.style && this.buttonConfiguration == c22123f.buttonConfiguration && this.fillHeight == c22123f.fillHeight && this.autoPad == c22123f.autoPad && AbstractC22676k.m65745e(this.viewedAnalyticEvent, c22123f.viewedAnalyticEvent) && C39174f.m124782b(this.horizontalPadding, c22123f.horizontalPadding);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC22118a getButtonConfiguration() {
        return this.buttonConfiguration;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getFillHeight() {
        return this.fillHeight;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getHorizontalPadding() {
        return this.horizontalPadding;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.title), 31, this.body);
        AbstractC22403o abstractC22403o = this.image;
        int iHashCode = (iM30450d + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31;
        C17750h1 c17750h1 = this.tag;
        int iHashCode2 = (iHashCode + (c17750h1 == null ? 0 : c17750h1.hashCode())) * 31;
        C27256h c27256h = this.primaryButtonState;
        int iHashCode3 = (iHashCode2 + (c27256h == null ? 0 : c27256h.hashCode())) * 31;
        C27256h c27256h2 = this.secondaryButtonState;
        int iHashCode4 = (this.style.hashCode() + ((iHashCode3 + (c27256h2 == null ? 0 : c27256h2.hashCode())) * 31)) * 31;
        EnumC22118a enumC22118a = this.buttonConfiguration;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode4 + (enumC22118a == null ? 0 : enumC22118a.hashCode())) * 31, 31, this.fillHeight), 31, this.autoPad);
        AnalyticEventModel analyticEventModel = this.viewedAnalyticEvent;
        return Float.hashCode(this.horizontalPadding) + ((iM8289b + (analyticEventModel != null ? analyticEventModel.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C27256h getPrimaryButtonState() {
        return this.primaryButtonState;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final C27256h getSecondaryButtonState() {
        return this.secondaryButtonState;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final EnumC13892q1 getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final C17750h1 getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final AnalyticEventModel getViewedAnalyticEvent() {
        return this.viewedAnalyticEvent;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.body;
        AbstractC22403o abstractC22403o = this.image;
        C17750h1 c17750h1 = this.tag;
        C27256h c27256h = this.primaryButtonState;
        C27256h c27256h2 = this.secondaryButtonState;
        EnumC13892q1 enumC13892q1 = this.style;
        EnumC22118a enumC22118a = this.buttonConfiguration;
        boolean z4 = this.fillHeight;
        boolean z13 = this.autoPad;
        AnalyticEventModel analyticEventModel = this.viewedAnalyticEvent;
        String strM124783c = C39174f.m124783c(this.horizontalPadding);
        StringBuilder sbM32001t = AbstractC11895b.m32001t("EmptyTileViewState(id=", str, ", title=", str2, ", body=");
        sbM32001t.append(str3);
        sbM32001t.append(", image=");
        sbM32001t.append(abstractC22403o);
        sbM32001t.append(", tag=");
        sbM32001t.append(c17750h1);
        sbM32001t.append(", primaryButtonState=");
        sbM32001t.append(c27256h);
        sbM32001t.append(", secondaryButtonState=");
        sbM32001t.append(c27256h2);
        sbM32001t.append(", style=");
        sbM32001t.append(enumC13892q1);
        sbM32001t.append(", buttonConfiguration=");
        sbM32001t.append(enumC22118a);
        sbM32001t.append(", fillHeight=");
        sbM32001t.append(z4);
        sbM32001t.append(", autoPad=");
        sbM32001t.append(z13);
        sbM32001t.append(", viewedAnalyticEvent=");
        sbM32001t.append(analyticEventModel);
        sbM32001t.append(", horizontalPadding=");
        return AbstractC25012a.m73376i(strM124783c, ")", sbM32001t);
    }

    private C22123f(String id4, String title, String body, AbstractC22403o abstractC22403o, C17750h1 c17750h1, C27256h c27256h, C27256h c27256h2, EnumC13892q1 style, EnumC22118a enumC22118a, boolean z4, boolean z13, AnalyticEventModel analyticEventModel, float f13) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(style, "style");
        this.id = id4;
        this.title = title;
        this.body = body;
        this.image = abstractC22403o;
        this.tag = c17750h1;
        this.primaryButtonState = c27256h;
        this.secondaryButtonState = c27256h2;
        this.style = style;
        this.buttonConfiguration = enumC22118a;
        this.fillHeight = z4;
        this.autoPad = z13;
        this.viewedAnalyticEvent = analyticEventModel;
        this.horizontalPadding = f13;
    }

    public /* synthetic */ C22123f(String str, String str2, String str3, AbstractC22403o abstractC22403o, C17750h1 c17750h1, C27256h c27256h, C27256h c27256h2, EnumC13892q1 enumC13892q1, EnumC22118a enumC22118a, boolean z4, boolean z13, AnalyticEventModel analyticEventModel, float f13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i13 & 8) != 0 ? null : abstractC22403o, c17750h1, (i13 & 32) != 0 ? null : c27256h, (i13 & 64) != 0 ? null : c27256h2, (i13 & 128) != 0 ? EnumC13892q1.OUTLINED : enumC13892q1, (i13 & 256) != 0 ? null : enumC22118a, (i13 & 512) != 0 ? false : z4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? true : z13, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : analyticEventModel, (i13 & 4096) != 0 ? AbstractC22124g.m63362a() : f13, null);
    }
}
