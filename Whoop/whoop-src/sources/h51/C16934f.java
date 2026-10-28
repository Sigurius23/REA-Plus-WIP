package h51;

import androidx.core.app.NotificationCompat;
import b91.EnumC2888c;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.AbstractC22403o;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import y00.AbstractC38963t7;
import y71.C39274g;

/* JADX INFO: renamed from: h51.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\u009e\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010)\u001a\u0004\b4\u0010+R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b,\u00107R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b=\u0010;R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00108\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b<\u0010@R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b:\u0010A\u001a\u0004\b5\u0010BR\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bC\u0010-\u001a\u0004\b>\u0010/R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b=\u0010D\u001a\u0004\b8\u0010ER\u0017\u0010\u0017\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b*\u00109\u001a\u0004\bC\u0010;¨\u0006F"}, m65681d2 = {"Lh51/f;", "Lm91/u;", "", NotificationCompat.CATEGORY_EVENT, "Lcom/whoop/design/util/TextResource;", "title", "Li91/a;", "titleColor", "Lb91/c;", "titleTypography", "actionButtonText", "Ly71/g;", "actionButtonIcon", "", "showActionButton", "showTitle", "", "items", "Ly81/e;", "backgroundColor", "onBoardingBarColor", "Lkd1/o;", "backgroundImage", "showBottomSpacer", "<init>", "(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Li91/a;Lb91/c;Lcom/whoop/design/util/TextResource;Ly71/g;ZZLjava/util/List;Ly81/e;Li91/a;Lkd1/o;Z)V", "a", "(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Li91/a;Lb91/c;Lcom/whoop/design/util/TextResource;Ly71/g;ZZLjava/util/List;Ly81/e;Li91/a;Lkd1/o;Z)Lh51/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getEvent", "()Ljava/lang/Object;", "b", "Lcom/whoop/design/util/TextResource;", "m", "()Lcom/whoop/design/util/TextResource;", "c", "Li91/a;", "n", "()Li91/a;", "d", "Lb91/c;", "o", "()Lb91/c;", "e", "f", "Ly71/g;", "()Ly71/g;", "g", "Z", "j", "()Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "l", "i", "Ljava/util/List;", "()Ljava/util/List;", "Ly81/e;", "()Ly81/e;", "k", "Lkd1/o;", "()Lkd1/o;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16934f implements InterfaceC25312u {

    /* JADX INFO: renamed from: n */
    public static final int f64958n = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object event;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC18247a titleColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC2888c titleTypography;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource actionButtonText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C39274g actionButtonIcon;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean showActionButton;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean showTitle;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC39332e backgroundColor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final AbstractC18247a onBoardingBarColor;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final AbstractC22403o backgroundImage;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final boolean showBottomSpacer;

    /* JADX INFO: renamed from: h51.f$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f64972w = new a();

        /* JADX INFO: renamed from: a */
        public final long m47691a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite50();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m47691a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: h51.f$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f64973w = new b();

        /* JADX INFO: renamed from: a */
        public final long m47692a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getTransparent();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m47692a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: h51.f$c */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f64974w = new c();

        /* JADX INFO: renamed from: a */
        public final long m47693a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getTransparent();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m47693a((C39336i) obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C16934f(Object event, TextResource title, AbstractC18247a titleColor, EnumC2888c enumC2888c, TextResource actionButtonText, C39274g c39274g, boolean z4, boolean z13, List<? extends InterfaceC25312u> items, InterfaceC39332e backgroundColor, AbstractC18247a onBoardingBarColor, AbstractC22403o abstractC22403o, boolean z14) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(titleColor, "titleColor");
        AbstractC22676k.m65750j(actionButtonText, "actionButtonText");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
        AbstractC22676k.m65750j(onBoardingBarColor, "onBoardingBarColor");
        this.event = event;
        this.title = title;
        this.titleColor = titleColor;
        this.titleTypography = enumC2888c;
        this.actionButtonText = actionButtonText;
        this.actionButtonIcon = c39274g;
        this.showActionButton = z4;
        this.showTitle = z13;
        this.items = items;
        this.backgroundColor = backgroundColor;
        this.onBoardingBarColor = onBoardingBarColor;
        this.backgroundImage = abstractC22403o;
        this.showBottomSpacer = z14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C16934f m47677b(C16934f c16934f, Object obj, TextResource textResource, AbstractC18247a abstractC18247a, EnumC2888c enumC2888c, TextResource textResource2, C39274g c39274g, boolean z4, boolean z13, List list, InterfaceC39332e interfaceC39332e, AbstractC18247a abstractC18247a2, AbstractC22403o abstractC22403o, boolean z14, int i13, Object obj2) {
        if ((i13 & 1) != 0) {
            obj = c16934f.event;
        }
        return c16934f.m47678a(obj, (i13 & 2) != 0 ? c16934f.title : textResource, (i13 & 4) != 0 ? c16934f.titleColor : abstractC18247a, (i13 & 8) != 0 ? c16934f.titleTypography : enumC2888c, (i13 & 16) != 0 ? c16934f.actionButtonText : textResource2, (i13 & 32) != 0 ? c16934f.actionButtonIcon : c39274g, (i13 & 64) != 0 ? c16934f.showActionButton : z4, (i13 & 128) != 0 ? c16934f.showTitle : z13, (i13 & 256) != 0 ? c16934f.items : list, (i13 & 512) != 0 ? c16934f.backgroundColor : interfaceC39332e, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c16934f.onBoardingBarColor : abstractC18247a2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c16934f.backgroundImage : abstractC22403o, (i13 & 4096) != 0 ? c16934f.showBottomSpacer : z14);
    }

    /* JADX INFO: renamed from: a */
    public final C16934f m47678a(Object event, TextResource title, AbstractC18247a titleColor, EnumC2888c titleTypography, TextResource actionButtonText, C39274g actionButtonIcon, boolean showActionButton, boolean showTitle, List<? extends InterfaceC25312u> items, InterfaceC39332e backgroundColor, AbstractC18247a onBoardingBarColor, AbstractC22403o backgroundImage, boolean showBottomSpacer) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(titleColor, "titleColor");
        AbstractC22676k.m65750j(actionButtonText, "actionButtonText");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
        AbstractC22676k.m65750j(onBoardingBarColor, "onBoardingBarColor");
        return new C16934f(event, title, titleColor, titleTypography, actionButtonText, actionButtonIcon, showActionButton, showTitle, items, backgroundColor, onBoardingBarColor, backgroundImage, showBottomSpacer);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C39274g getActionButtonIcon() {
        return this.actionButtonIcon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getActionButtonText() {
        return this.actionButtonText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16934f)) {
            return false;
        }
        C16934f c16934f = (C16934f) other;
        return AbstractC22676k.m65745e(this.event, c16934f.event) && AbstractC22676k.m65745e(this.title, c16934f.title) && AbstractC22676k.m65745e(this.titleColor, c16934f.titleColor) && this.titleTypography == c16934f.titleTypography && AbstractC22676k.m65745e(this.actionButtonText, c16934f.actionButtonText) && AbstractC22676k.m65745e(this.actionButtonIcon, c16934f.actionButtonIcon) && this.showActionButton == c16934f.showActionButton && this.showTitle == c16934f.showTitle && AbstractC22676k.m65745e(this.items, c16934f.items) && AbstractC22676k.m65745e(this.backgroundColor, c16934f.backgroundColor) && AbstractC22676k.m65745e(this.onBoardingBarColor, c16934f.onBoardingBarColor) && AbstractC22676k.m65745e(this.backgroundImage, c16934f.backgroundImage) && this.showBottomSpacer == c16934f.showBottomSpacer;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC39332e getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final AbstractC22403o getBackgroundImage() {
        return this.backgroundImage;
    }

    @Override // p720m91.InterfaceC25312u
    public Object getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: h */
    public final List<InterfaceC25312u> m47683h() {
        return this.items;
    }

    public int hashCode() {
        int iHashCode = (this.titleColor.hashCode() + AbstractC31061c.m95625a(this.event.hashCode() * 31, this.title, 31)) * 31;
        EnumC2888c enumC2888c = this.titleTypography;
        int iM95625a = AbstractC31061c.m95625a((iHashCode + (enumC2888c == null ? 0 : enumC2888c.hashCode())) * 31, this.actionButtonText, 31);
        C39274g c39274g = this.actionButtonIcon;
        int iHashCode2 = (this.onBoardingBarColor.hashCode() + AbstractC33745d.m106648g(this.backgroundColor, AbstractC11895b.m31983b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM95625a + (c39274g == null ? 0 : c39274g.hashCode())) * 31, 31, this.showActionButton), 31, this.showTitle), 31, this.items), 31)) * 31;
        AbstractC22403o abstractC22403o = this.backgroundImage;
        return Boolean.hashCode(this.showBottomSpacer) + ((iHashCode2 + (abstractC22403o != null ? abstractC22403o.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final AbstractC18247a getOnBoardingBarColor() {
        return this.onBoardingBarColor;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getShowActionButton() {
        return this.showActionButton;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getShowBottomSpacer() {
        return this.showBottomSpacer;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getShowTitle() {
        return this.showTitle;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final AbstractC18247a getTitleColor() {
        return this.titleColor;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final EnumC2888c getTitleTypography() {
        return this.titleTypography;
    }

    public String toString() {
        Object obj = this.event;
        TextResource textResource = this.title;
        AbstractC18247a abstractC18247a = this.titleColor;
        EnumC2888c enumC2888c = this.titleTypography;
        TextResource textResource2 = this.actionButtonText;
        C39274g c39274g = this.actionButtonIcon;
        boolean z4 = this.showActionButton;
        boolean z13 = this.showTitle;
        List<InterfaceC25312u> list = this.items;
        InterfaceC39332e interfaceC39332e = this.backgroundColor;
        AbstractC18247a abstractC18247a2 = this.onBoardingBarColor;
        AbstractC22403o abstractC22403o = this.backgroundImage;
        boolean z14 = this.showBottomSpacer;
        StringBuilder sb4 = new StringBuilder("TileCarouselState(event=");
        sb4.append(obj);
        sb4.append(", title=");
        sb4.append(textResource);
        sb4.append(", titleColor=");
        sb4.append(abstractC18247a);
        sb4.append(", titleTypography=");
        sb4.append(enumC2888c);
        sb4.append(", actionButtonText=");
        sb4.append(textResource2);
        sb4.append(", actionButtonIcon=");
        sb4.append(c39274g);
        sb4.append(", showActionButton=");
        AbstractC38963t7.m124392v(sb4, z4, ", showTitle=", z13, ", items=");
        sb4.append(list);
        sb4.append(", backgroundColor=");
        sb4.append(interfaceC39332e);
        sb4.append(", onBoardingBarColor=");
        sb4.append(abstractC18247a2);
        sb4.append(", backgroundImage=");
        sb4.append(abstractC22403o);
        sb4.append(", showBottomSpacer=");
        return AbstractC18489d0.m53372m(sb4, z14, ")");
    }

    public /* synthetic */ C16934f(Object obj, TextResource textResource, AbstractC18247a abstractC18247a, EnumC2888c enumC2888c, TextResource textResource2, C39274g c39274g, boolean z4, boolean z13, List list, InterfaceC39332e interfaceC39332e, AbstractC18247a abstractC18247a2, AbstractC22403o abstractC22403o, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C23454a0.f92919a : obj, textResource, (i13 & 4) != 0 ? AbstractC18249c.m52574l(a.f64972w) : abstractC18247a, (i13 & 8) != 0 ? null : enumC2888c, (i13 & 16) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 32) != 0 ? null : c39274g, (i13 & 64) != 0 ? false : z4, (i13 & 128) != 0 ? true : z13, list, (i13 & 512) != 0 ? p745y81.Function1.m125323a(b.f64973w) : interfaceC39332e, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? AbstractC18249c.m52574l(c.f64974w) : abstractC18247a2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : abstractC22403o, (i13 & 4096) != 0 ? true : z14);
    }
}
