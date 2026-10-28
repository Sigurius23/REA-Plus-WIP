package k71;

import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import c13.AbstractC3855a;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import d13.AbstractC11478a;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p01.C28582b;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import p81.C28971c;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import y00.AbstractC38963t7;
import y71.C39274g;

/* JADX INFO: renamed from: k71.m */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b>\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\b\b\u0002\u0010&\u001a\u00020%\u0012\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f¢\u0006\u0004\b(\u0010)J \u0002\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010&\u001a\u00020%2\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020\u00112\b\u00101\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b2\u00103R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010-R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b:\u00108\u001a\u0004\b;\u0010-R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\bE\u0010CR\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u000e\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bB\u0010N\u001a\u0004\b:\u0010OR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bL\u0010Q\u001a\u0004\bT\u0010SR\u0017\u0010\u0014\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bU\u0010Q\u001a\u0004\bV\u0010SR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bH\u0010W\u001a\u0004\bU\u0010XR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\bJ\u0010[R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bV\u0010\\\u001a\u0004\b@\u0010]R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\bE\u0010=\u001a\u0004\b^\u0010?R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b_\u0010=\u001a\u0004\bP\u0010?R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b^\u0010`\u001a\u0004\bY\u0010aR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b;\u0010b\u001a\u0004\bD\u0010cR\u0019\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\f\n\u0004\b>\u0010d\u001a\u0004\bF\u0010eR\u0019\u0010$\u001a\u0004\u0018\u00010#8\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\bh\u0010j\u001a\u0004\bf\u0010kR\u001f\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bR\u0010G\u001a\u0004\b_\u0010I¨\u0006l"}, m65681d2 = {"Lk71/m;", "Lm91/u;", "", NotificationCompat.CATEGORY_EVENT, "", "id", "testTag", "Lcom/whoop/design/util/TextResource;", "title", "Lk71/d;", "firstLegendState", "secondLegendState", "", "legendStates", "graphItem", "Ly81/f;", "backgroundColor", "", "useAiGradientBackground", "useTransparentBackground", "preserveLabelCasing", "Ly71/g;", "icon", "Lgz0/m0;", "endIcon", "Lk71/c;", "checkmarkStyle", "subText", "footerText", "Lk71/p;", "planProgressStatusState", "Lp01/b;", "circularProgress", "Lcom/whoop/navigation/e;", "destination", "Lp81/c;", "unlockTrendsCardState", "Lk71/d0;", "titleStyle", "subItems", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lk71/d;Lk71/d;Ljava/util/List;Lm91/u;Ly81/f;ZZZLy71/g;Lgz0/m0;Lk71/c;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk71/p;Lp01/b;Lcom/whoop/navigation/e;Lp81/c;Lk71/d0;Ljava/util/List;)V", "a", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lk71/d;Lk71/d;Ljava/util/List;Lm91/u;Ly81/f;ZZZLy71/g;Lgz0/m0;Lk71/c;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk71/p;Lp01/b;Lcom/whoop/navigation/e;Lp81/c;Lk71/d0;Ljava/util/List;)Lk71/m;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getEvent", "()Ljava/lang/Object;", "b", "Ljava/lang/String;", "getId", "c", "s", "d", "Lcom/whoop/design/util/TextResource;", "t", "()Lcom/whoop/design/util/TextResource;", "e", "Lk71/d;", "i", "()Lk71/d;", "f", "p", "g", "Ljava/util/List;", "m", "()Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lm91/u;", "k", "()Lm91/u;", "Ly81/f;", "()Ly81/f;", "j", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "()Z", "x", "l", "o", "Ly71/g;", "()Ly71/g;", "n", "Lgz0/m0;", "()Lgz0/m0;", "Lk71/c;", "()Lk71/c;", "r", "q", "Lk71/p;", "()Lk71/p;", "Lp01/b;", "()Lp01/b;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "u", "Lp81/c;", "v", "()Lp81/c;", "Lk71/d0;", "()Lk71/d0;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22256m implements InterfaceC25312u {

    /* JADX INFO: renamed from: x */
    public static final int f86768x = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object event;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String testTag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C22246d firstLegendState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C22246d secondLegendState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<C22246d> legendStates;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC25312u graphItem;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final EnumC39333f backgroundColor;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean useAiGradientBackground;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean useTransparentBackground;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean preserveLabelCasing;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C39274g icon;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final EnumC16313m0 endIcon;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final EnumC22244c checkmarkStyle;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final TextResource subText;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final TextResource footerText;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final C22259p planProgressStatusState;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final C28582b circularProgress;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final C28971c unlockTrendsCardState;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final EnumC22247d0 titleStyle;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final List<InterfaceC25312u> subItems;

    /* JADX WARN: Multi-variable type inference failed */
    public C22256m(Object event, String str, String str2, TextResource title, C22246d c22246d, C22246d c22246d2, List<C22246d> list, InterfaceC25312u graphItem, EnumC39333f backgroundColor, boolean z4, boolean z13, boolean z14, C39274g c39274g, EnumC16313m0 enumC16313m0, EnumC22244c enumC22244c, TextResource textResource, TextResource textResource2, C22259p c22259p, C28582b c28582b, C9598e c9598e, C28971c c28971c, EnumC22247d0 titleStyle, List<? extends InterfaceC25312u> list2) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(graphItem, "graphItem");
        AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
        AbstractC22676k.m65750j(titleStyle, "titleStyle");
        this.event = event;
        this.id = str;
        this.testTag = str2;
        this.title = title;
        this.firstLegendState = c22246d;
        this.secondLegendState = c22246d2;
        this.legendStates = list;
        this.graphItem = graphItem;
        this.backgroundColor = backgroundColor;
        this.useAiGradientBackground = z4;
        this.useTransparentBackground = z13;
        this.preserveLabelCasing = z14;
        this.icon = c39274g;
        this.endIcon = enumC16313m0;
        this.checkmarkStyle = enumC22244c;
        this.subText = textResource;
        this.footerText = textResource2;
        this.planProgressStatusState = c22259p;
        this.circularProgress = c28582b;
        this.destination = c9598e;
        this.unlockTrendsCardState = c28971c;
        this.titleStyle = titleStyle;
        this.subItems = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C22256m m63894b(C22256m c22256m, Object obj, String str, String str2, TextResource textResource, C22246d c22246d, C22246d c22246d2, List list, InterfaceC25312u interfaceC25312u, EnumC39333f enumC39333f, boolean z4, boolean z13, boolean z14, C39274g c39274g, EnumC16313m0 enumC16313m0, EnumC22244c enumC22244c, TextResource textResource2, TextResource textResource3, C22259p c22259p, C28582b c28582b, C9598e c9598e, C28971c c28971c, EnumC22247d0 enumC22247d0, List list2, int i13, Object obj2) {
        List list3;
        EnumC22247d0 enumC22247d1;
        Object obj3 = (i13 & 1) != 0 ? c22256m.event : obj;
        String str3 = (i13 & 2) != 0 ? c22256m.id : str;
        String str4 = (i13 & 4) != 0 ? c22256m.testTag : str2;
        TextResource textResource4 = (i13 & 8) != 0 ? c22256m.title : textResource;
        C22246d c22246d3 = (i13 & 16) != 0 ? c22256m.firstLegendState : c22246d;
        C22246d c22246d4 = (i13 & 32) != 0 ? c22256m.secondLegendState : c22246d2;
        List list4 = (i13 & 64) != 0 ? c22256m.legendStates : list;
        InterfaceC25312u interfaceC25312u2 = (i13 & 128) != 0 ? c22256m.graphItem : interfaceC25312u;
        EnumC39333f enumC39333f2 = (i13 & 256) != 0 ? c22256m.backgroundColor : enumC39333f;
        boolean z15 = (i13 & 512) != 0 ? c22256m.useAiGradientBackground : z4;
        boolean z16 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c22256m.useTransparentBackground : z13;
        boolean z17 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c22256m.preserveLabelCasing : z14;
        C39274g c39274g2 = (i13 & 4096) != 0 ? c22256m.icon : c39274g;
        EnumC16313m0 enumC16313m1 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c22256m.endIcon : enumC16313m0;
        Object obj4 = obj3;
        EnumC22244c enumC22244c2 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c22256m.checkmarkStyle : enumC22244c;
        TextResource textResource5 = (i13 & 32768) != 0 ? c22256m.subText : textResource2;
        TextResource textResource6 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? c22256m.footerText : textResource3;
        C22259p c22259p2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? c22256m.planProgressStatusState : c22259p;
        C28582b c28582b2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? c22256m.circularProgress : c28582b;
        C9598e c9598e2 = (i13 & 524288) != 0 ? c22256m.destination : c9598e;
        C28971c c28971c2 = (i13 & 1048576) != 0 ? c22256m.unlockTrendsCardState : c28971c;
        EnumC22247d0 enumC22247d2 = (i13 & 2097152) != 0 ? c22256m.titleStyle : enumC22247d0;
        if ((i13 & 4194304) != 0) {
            enumC22247d1 = enumC22247d2;
            list3 = c22256m.subItems;
        } else {
            list3 = list2;
            enumC22247d1 = enumC22247d2;
        }
        return c22256m.m63895a(obj4, str3, str4, textResource4, c22246d3, c22246d4, list4, interfaceC25312u2, enumC39333f2, z15, z16, z17, c39274g2, enumC16313m1, enumC22244c2, textResource5, textResource6, c22259p2, c28582b2, c9598e2, c28971c2, enumC22247d1, list3);
    }

    /* JADX INFO: renamed from: a */
    public final C22256m m63895a(Object event, String id4, String testTag, TextResource title, C22246d firstLegendState, C22246d secondLegendState, List<C22246d> legendStates, InterfaceC25312u graphItem, EnumC39333f backgroundColor, boolean useAiGradientBackground, boolean useTransparentBackground, boolean preserveLabelCasing, C39274g icon, EnumC16313m0 endIcon, EnumC22244c checkmarkStyle, TextResource subText, TextResource footerText, C22259p planProgressStatusState, C28582b circularProgress, C9598e destination, C28971c unlockTrendsCardState, EnumC22247d0 titleStyle, List<? extends InterfaceC25312u> subItems) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(graphItem, "graphItem");
        AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
        AbstractC22676k.m65750j(titleStyle, "titleStyle");
        return new C22256m(event, id4, testTag, title, firstLegendState, secondLegendState, legendStates, graphItem, backgroundColor, useAiGradientBackground, useTransparentBackground, preserveLabelCasing, icon, endIcon, checkmarkStyle, subText, footerText, planProgressStatusState, circularProgress, destination, unlockTrendsCardState, titleStyle, subItems);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC39333f getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC22244c getCheckmarkStyle() {
        return this.checkmarkStyle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22256m)) {
            return false;
        }
        C22256m c22256m = (C22256m) other;
        return AbstractC22676k.m65745e(this.event, c22256m.event) && AbstractC22676k.m65745e(this.id, c22256m.id) && AbstractC22676k.m65745e(this.testTag, c22256m.testTag) && AbstractC22676k.m65745e(this.title, c22256m.title) && AbstractC22676k.m65745e(this.firstLegendState, c22256m.firstLegendState) && AbstractC22676k.m65745e(this.secondLegendState, c22256m.secondLegendState) && AbstractC22676k.m65745e(this.legendStates, c22256m.legendStates) && AbstractC22676k.m65745e(this.graphItem, c22256m.graphItem) && this.backgroundColor == c22256m.backgroundColor && this.useAiGradientBackground == c22256m.useAiGradientBackground && this.useTransparentBackground == c22256m.useTransparentBackground && this.preserveLabelCasing == c22256m.preserveLabelCasing && AbstractC22676k.m65745e(this.icon, c22256m.icon) && this.endIcon == c22256m.endIcon && this.checkmarkStyle == c22256m.checkmarkStyle && AbstractC22676k.m65745e(this.subText, c22256m.subText) && AbstractC22676k.m65745e(this.footerText, c22256m.footerText) && AbstractC22676k.m65745e(this.planProgressStatusState, c22256m.planProgressStatusState) && AbstractC22676k.m65745e(this.circularProgress, c22256m.circularProgress) && AbstractC22676k.m65745e(this.destination, c22256m.destination) && AbstractC22676k.m65745e(this.unlockTrendsCardState, c22256m.unlockTrendsCardState) && this.titleStyle == c22256m.titleStyle && AbstractC22676k.m65745e(this.subItems, c22256m.subItems);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C28582b getCircularProgress() {
        return this.circularProgress;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    @Override // p720m91.InterfaceC25312u
    /* JADX INFO: renamed from: getEvent, reason: from getter */
    public Object getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String() {
        return this.event;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final EnumC16313m0 getEndIcon() {
        return this.endIcon;
    }

    public int hashCode() {
        int iHashCode = this.event.hashCode() * 31;
        String str = this.id;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.testTag;
        int iM95625a = AbstractC31061c.m95625a((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, this.title, 31);
        C22246d c22246d = this.firstLegendState;
        int iHashCode3 = (iM95625a + (c22246d == null ? 0 : c22246d.hashCode())) * 31;
        C22246d c22246d2 = this.secondLegendState;
        int iHashCode4 = (iHashCode3 + (c22246d2 == null ? 0 : c22246d2.hashCode())) * 31;
        List<C22246d> list = this.legendStates;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC21702c.m61132c(this.backgroundColor, AbstractC11478a.m30851c(this.graphItem, (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31, 31), 31), 31, this.useAiGradientBackground), 31, this.useTransparentBackground), 31, this.preserveLabelCasing);
        C39274g c39274g = this.icon;
        int iHashCode5 = (iM8289b + (c39274g == null ? 0 : c39274g.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.endIcon;
        int iHashCode6 = (iHashCode5 + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        EnumC22244c enumC22244c = this.checkmarkStyle;
        int iHashCode7 = (iHashCode6 + (enumC22244c == null ? 0 : enumC22244c.hashCode())) * 31;
        TextResource textResource = this.subText;
        int iHashCode8 = (iHashCode7 + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.footerText;
        int iHashCode9 = (iHashCode8 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        C22259p c22259p = this.planProgressStatusState;
        int iHashCode10 = (iHashCode9 + (c22259p == null ? 0 : c22259p.hashCode())) * 31;
        C28582b c28582b = this.circularProgress;
        int iHashCode11 = (iHashCode10 + (c28582b == null ? 0 : c28582b.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode12 = (iHashCode11 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        C28971c c28971c = this.unlockTrendsCardState;
        int iHashCode13 = (this.titleStyle.hashCode() + ((iHashCode12 + (c28971c == null ? 0 : c28971c.hashCode())) * 31)) * 31;
        List<InterfaceC25312u> list2 = this.subItems;
        return iHashCode13 + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C22246d getFirstLegendState() {
        return this.firstLegendState;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getFooterText() {
        return this.footerText;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final InterfaceC25312u getGraphItem() {
        return this.graphItem;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C39274g getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: m */
    public final List<C22246d> m63905m() {
        return this.legendStates;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final C22259p getPlanProgressStatusState() {
        return this.planProgressStatusState;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getPreserveLabelCasing() {
        return this.preserveLabelCasing;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final C22246d getSecondLegendState() {
        return this.secondLegendState;
    }

    /* JADX INFO: renamed from: q */
    public final List<InterfaceC25312u> m63909q() {
        return this.subItems;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final TextResource getSubText() {
        return this.subText;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getTestTag() {
        return this.testTag;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public String toString() {
        Object obj = this.event;
        String str = this.id;
        String str2 = this.testTag;
        TextResource textResource = this.title;
        C22246d c22246d = this.firstLegendState;
        C22246d c22246d2 = this.secondLegendState;
        List<C22246d> list = this.legendStates;
        InterfaceC25312u interfaceC25312u = this.graphItem;
        EnumC39333f enumC39333f = this.backgroundColor;
        boolean z4 = this.useAiGradientBackground;
        boolean z13 = this.useTransparentBackground;
        boolean z14 = this.preserveLabelCasing;
        C39274g c39274g = this.icon;
        EnumC16313m0 enumC16313m0 = this.endIcon;
        EnumC22244c enumC22244c = this.checkmarkStyle;
        TextResource textResource2 = this.subText;
        TextResource textResource3 = this.footerText;
        C22259p c22259p = this.planProgressStatusState;
        C28582b c28582b = this.circularProgress;
        C9598e c9598e = this.destination;
        C28971c c28971c = this.unlockTrendsCardState;
        EnumC22247d0 enumC22247d0 = this.titleStyle;
        List<InterfaceC25312u> list2 = this.subItems;
        StringBuilder sb4 = new StringBuilder("GraphingCardState(event=");
        sb4.append(obj);
        sb4.append(", id=");
        sb4.append(str);
        sb4.append(", testTag=");
        AbstractC30007c.m91826A(sb4, str2, ", title=", textResource, ", firstLegendState=");
        sb4.append(c22246d);
        sb4.append(", secondLegendState=");
        sb4.append(c22246d2);
        sb4.append(", legendStates=");
        sb4.append(list);
        sb4.append(", graphItem=");
        sb4.append(interfaceC25312u);
        sb4.append(", backgroundColor=");
        sb4.append(enumC39333f);
        sb4.append(", useAiGradientBackground=");
        sb4.append(z4);
        sb4.append(", useTransparentBackground=");
        AbstractC38963t7.m124392v(sb4, z13, ", preserveLabelCasing=", z14, ", icon=");
        sb4.append(c39274g);
        sb4.append(", endIcon=");
        sb4.append(enumC16313m0);
        sb4.append(", checkmarkStyle=");
        sb4.append(enumC22244c);
        sb4.append(", subText=");
        sb4.append(textResource2);
        sb4.append(", footerText=");
        sb4.append(textResource3);
        sb4.append(", planProgressStatusState=");
        sb4.append(c22259p);
        sb4.append(", circularProgress=");
        sb4.append(c28582b);
        sb4.append(", destination=");
        sb4.append(c9598e);
        sb4.append(", unlockTrendsCardState=");
        sb4.append(c28971c);
        sb4.append(", titleStyle=");
        sb4.append(enumC22247d0);
        sb4.append(", subItems=");
        return AbstractC3855a.m11829m(sb4, list2, ")");
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final EnumC22247d0 getTitleStyle() {
        return this.titleStyle;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final C28971c getUnlockTrendsCardState() {
        return this.unlockTrendsCardState;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final boolean getUseAiGradientBackground() {
        return this.useAiGradientBackground;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getUseTransparentBackground() {
        return this.useTransparentBackground;
    }

    public /* synthetic */ C22256m(Object obj, String str, String str2, TextResource textResource, C22246d c22246d, C22246d c22246d2, List list, InterfaceC25312u interfaceC25312u, EnumC39333f enumC39333f, boolean z4, boolean z13, boolean z14, C39274g c39274g, EnumC16313m0 enumC16313m0, EnumC22244c enumC22244c, TextResource textResource2, TextResource textResource3, C22259p c22259p, C28582b c28582b, C9598e c9598e, C28971c c28971c, EnumC22247d0 enumC22247d0, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C23454a0.f92919a : obj, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? null : str2, textResource, (i13 & 16) != 0 ? null : c22246d, (i13 & 32) != 0 ? null : c22246d2, (i13 & 64) != 0 ? null : list, interfaceC25312u, (i13 & 256) != 0 ? EnumC39333f.WHITE_5 : enumC39333f, (i13 & 512) != 0 ? false : z4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z13, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z14, (i13 & 4096) != 0 ? null : c39274g, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : enumC16313m0, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : enumC22244c, (32768 & i13) != 0 ? null : textResource2, (65536 & i13) != 0 ? null : textResource3, (131072 & i13) != 0 ? null : c22259p, (262144 & i13) != 0 ? null : c28582b, (524288 & i13) != 0 ? null : c9598e, (1048576 & i13) != 0 ? null : c28971c, (2097152 & i13) != 0 ? EnumC22247d0.DEFAULT : enumC22247d0, (i13 & 4194304) != 0 ? null : list2);
    }
}
