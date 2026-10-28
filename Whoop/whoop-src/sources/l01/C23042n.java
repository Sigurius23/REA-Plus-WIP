package l01;

import androidx.profileinstaller.ProfileVerifier;
import b91.EnumC2888c;
import gz0.EnumC16313m0;
import hy0.C17750h1;
import i91.AbstractC18247a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import kd1.AbstractC22403o;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.C27256h;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.C25306o;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: l01.n */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b4\b\u0087\b\u0018\u00002\u00020\u0001Bñ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0086\u0002\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020!2\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u00102\u001a\u0004\b3\u0010*R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b<\u00102\u001a\u0004\b=\u0010*R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bB\u00109\u001a\u0004\bC\u0010;R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bD\u00102\u001a\u0004\bE\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u00102\u001a\u0004\bB\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\bG\u0010*R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bE\u0010L\u001a\u0004\b>\u0010MR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bN\u0010L\u001a\u0004\bO\u0010MR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bH\u0010RR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bO\u0010S\u001a\u0004\bF\u0010TR\u001f\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bP\u0010WR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bX\u0010ZR\u0017\u0010\u001d\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b[\u0010Y\u001a\u0004\bU\u0010ZR\u0017\u0010\u001e\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bJ\u0010Y\u001a\u0004\bN\u0010ZR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\bC\u0010\\\u001a\u0004\bD\u0010]R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b=\u0010^\u001a\u0004\b[\u0010_R\u0019\u0010$\u001a\u0004\u0018\u00010#8\u0006¢\u0006\f\n\u0004\b:\u0010`\u001a\u0004\b8\u0010a¨\u0006b"}, m65681d2 = {"Ll01/n;", "Lm91/u;", "", "id", "Lgz0/m0;", "endIcon", "Lkd1/o;", "titleImage", "title", "Lb91/c;", "titleTypography", "tierImage", "header", "category", "trackingValue", "Ll01/t;", "style", "Lny0/h;", "cardButton", "secondCardButton", "Ll01/d;", "featureList", "Ll01/b;", "descriptionCard", "", "Lm91/o;", "items", "", "sectionTopPadding", "sectionBottomPadding", "interItemPadding", "Li91/a;", "checkmarkBackground", "", "shouldShowDivider", "Lhy0/h1;", "badge", "<init>", "(Ljava/lang/String;Lgz0/m0;Lkd1/o;Ljava/lang/String;Lb91/c;Lkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll01/t;Lny0/h;Lny0/h;Ll01/d;Ll01/b;Ljava/util/List;FFFLi91/a;ZLhy0/h1;)V", "a", "(Ljava/lang/String;Lgz0/m0;Lkd1/o;Ljava/lang/String;Lb91/c;Lkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll01/t;Lny0/h;Lny0/h;Ll01/d;Ll01/b;Ljava/util/List;FFFLi91/a;ZLhy0/h1;)Ll01/n;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "b", "Lgz0/m0;", "i", "()Lgz0/m0;", "c", "Lkd1/o;", "u", "()Lkd1/o;", "d", "t", "e", "Lb91/c;", "v", "()Lb91/c;", "f", "s", "g", "k", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "j", "Ll01/t;", "r", "()Ll01/t;", "Lny0/h;", "()Lny0/h;", "l", "n", "m", "Ll01/d;", "()Ll01/d;", "Ll01/b;", "()Ll01/b;", "o", "Ljava/util/List;", "()Ljava/util/List;", "p", "F", "()F", "q", "Li91/a;", "()Li91/a;", "Z", "()Z", "Lhy0/h1;", "()Lhy0/h1;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23042n implements InterfaceC25312u {

    /* JADX INFO: renamed from: v */
    public static final int f90836v = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 endIcon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o titleImage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC2888c titleTypography;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AbstractC22403o tierImage;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String header;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final String category;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String trackingValue;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final EnumC23048t style;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C27256h cardButton;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C27256h secondCardButton;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C23032d featureList;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final C23030b descriptionCard;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final List<C25306o> items;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final float sectionTopPadding;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final float sectionBottomPadding;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final float interItemPadding;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final AbstractC18247a checkmarkBackground;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final boolean shouldShowDivider;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final C17750h1 badge;

    public C23042n(String str, EnumC16313m0 enumC16313m0, AbstractC22403o titleImage, String str2, EnumC2888c titleTypography, AbstractC22403o abstractC22403o, String str3, String str4, String str5, EnumC23048t enumC23048t, C27256h c27256h, C27256h c27256h2, C23032d c23032d, C23030b c23030b, List<C25306o> list, float f13, float f14, float f15, AbstractC18247a abstractC18247a, boolean z4, C17750h1 c17750h1) {
        AbstractC22676k.m65750j(titleImage, "titleImage");
        AbstractC22676k.m65750j(titleTypography, "titleTypography");
        this.id = str;
        this.endIcon = enumC16313m0;
        this.titleImage = titleImage;
        this.title = str2;
        this.titleTypography = titleTypography;
        this.tierImage = abstractC22403o;
        this.header = str3;
        this.category = str4;
        this.trackingValue = str5;
        this.style = enumC23048t;
        this.cardButton = c27256h;
        this.secondCardButton = c27256h2;
        this.featureList = c23032d;
        this.descriptionCard = c23030b;
        this.items = list;
        this.sectionTopPadding = f13;
        this.sectionBottomPadding = f14;
        this.interItemPadding = f15;
        this.checkmarkBackground = abstractC18247a;
        this.shouldShowDivider = z4;
        this.badge = c17750h1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C23042n m66921b(C23042n c23042n, String str, EnumC16313m0 enumC16313m0, AbstractC22403o abstractC22403o, String str2, EnumC2888c enumC2888c, AbstractC22403o abstractC22403o2, String str3, String str4, String str5, EnumC23048t enumC23048t, C27256h c27256h, C27256h c27256h2, C23032d c23032d, C23030b c23030b, List list, float f13, float f14, float f15, AbstractC18247a abstractC18247a, boolean z4, C17750h1 c17750h1, int i13, Object obj) {
        C17750h1 c17750h2;
        boolean z13;
        String str6 = (i13 & 1) != 0 ? c23042n.id : str;
        EnumC16313m0 enumC16313m1 = (i13 & 2) != 0 ? c23042n.endIcon : enumC16313m0;
        AbstractC22403o abstractC22403o3 = (i13 & 4) != 0 ? c23042n.titleImage : abstractC22403o;
        String str7 = (i13 & 8) != 0 ? c23042n.title : str2;
        EnumC2888c enumC2888c2 = (i13 & 16) != 0 ? c23042n.titleTypography : enumC2888c;
        AbstractC22403o abstractC22403o4 = (i13 & 32) != 0 ? c23042n.tierImage : abstractC22403o2;
        String str8 = (i13 & 64) != 0 ? c23042n.header : str3;
        String str9 = (i13 & 128) != 0 ? c23042n.category : str4;
        String str10 = (i13 & 256) != 0 ? c23042n.trackingValue : str5;
        EnumC23048t enumC23048t2 = (i13 & 512) != 0 ? c23042n.style : enumC23048t;
        C27256h c27256h3 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c23042n.cardButton : c27256h;
        C27256h c27256h4 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c23042n.secondCardButton : c27256h2;
        C23032d c23032d2 = (i13 & 4096) != 0 ? c23042n.featureList : c23032d;
        C23030b c23030b2 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c23042n.descriptionCard : c23030b;
        String str11 = str6;
        List list2 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c23042n.items : list;
        float f16 = (i13 & 32768) != 0 ? c23042n.sectionTopPadding : f13;
        float f17 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? c23042n.sectionBottomPadding : f14;
        float f18 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? c23042n.interItemPadding : f15;
        AbstractC18247a abstractC18247a2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? c23042n.checkmarkBackground : abstractC18247a;
        boolean z14 = (i13 & 524288) != 0 ? c23042n.shouldShowDivider : z4;
        if ((i13 & 1048576) != 0) {
            z13 = z14;
            c17750h2 = c23042n.badge;
        } else {
            c17750h2 = c17750h1;
            z13 = z14;
        }
        return c23042n.m66922a(str11, enumC16313m1, abstractC22403o3, str7, enumC2888c2, abstractC22403o4, str8, str9, str10, enumC23048t2, c27256h3, c27256h4, c23032d2, c23030b2, list2, f16, f17, f18, abstractC18247a2, z13, c17750h2);
    }

    /* JADX INFO: renamed from: a */
    public final C23042n m66922a(String id4, EnumC16313m0 endIcon, AbstractC22403o titleImage, String title, EnumC2888c titleTypography, AbstractC22403o tierImage, String header, String category, String trackingValue, EnumC23048t style, C27256h cardButton, C27256h secondCardButton, C23032d featureList, C23030b descriptionCard, List<C25306o> items, float sectionTopPadding, float sectionBottomPadding, float interItemPadding, AbstractC18247a checkmarkBackground, boolean shouldShowDivider, C17750h1 badge) {
        AbstractC22676k.m65750j(titleImage, "titleImage");
        AbstractC22676k.m65750j(titleTypography, "titleTypography");
        return new C23042n(id4, endIcon, titleImage, title, titleTypography, tierImage, header, category, trackingValue, style, cardButton, secondCardButton, featureList, descriptionCard, items, sectionTopPadding, sectionBottomPadding, interItemPadding, checkmarkBackground, shouldShowDivider, badge);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C17750h1 getBadge() {
        return this.badge;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C27256h getCardButton() {
        return this.cardButton;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23042n)) {
            return false;
        }
        C23042n c23042n = (C23042n) other;
        return AbstractC22676k.m65745e(this.id, c23042n.id) && this.endIcon == c23042n.endIcon && AbstractC22676k.m65745e(this.titleImage, c23042n.titleImage) && AbstractC22676k.m65745e(this.title, c23042n.title) && this.titleTypography == c23042n.titleTypography && AbstractC22676k.m65745e(this.tierImage, c23042n.tierImage) && AbstractC22676k.m65745e(this.header, c23042n.header) && AbstractC22676k.m65745e(this.category, c23042n.category) && AbstractC22676k.m65745e(this.trackingValue, c23042n.trackingValue) && this.style == c23042n.style && AbstractC22676k.m65745e(this.cardButton, c23042n.cardButton) && AbstractC22676k.m65745e(this.secondCardButton, c23042n.secondCardButton) && AbstractC22676k.m65745e(this.featureList, c23042n.featureList) && AbstractC22676k.m65745e(this.descriptionCard, c23042n.descriptionCard) && AbstractC22676k.m65745e(this.items, c23042n.items) && Float.compare(this.sectionTopPadding, c23042n.sectionTopPadding) == 0 && Float.compare(this.sectionBottomPadding, c23042n.sectionBottomPadding) == 0 && Float.compare(this.interItemPadding, c23042n.interItemPadding) == 0 && AbstractC22676k.m65745e(this.checkmarkBackground, c23042n.checkmarkBackground) && this.shouldShowDivider == c23042n.shouldShowDivider && AbstractC22676k.m65745e(this.badge, c23042n.badge);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final AbstractC18247a getCheckmarkBackground() {
        return this.checkmarkBackground;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C23030b getDescriptionCard() {
        return this.descriptionCard;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        EnumC16313m0 enumC16313m0 = this.endIcon;
        int iM91833c = AbstractC30007c.m91833c(this.titleImage, (iHashCode + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31, 31);
        String str2 = this.title;
        int iHashCode2 = (this.titleTypography.hashCode() + ((iM91833c + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        AbstractC22403o abstractC22403o = this.tierImage;
        int iHashCode3 = (iHashCode2 + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31;
        String str3 = this.header;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.category;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.trackingValue;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        EnumC23048t enumC23048t = this.style;
        int iHashCode7 = (iHashCode6 + (enumC23048t == null ? 0 : enumC23048t.hashCode())) * 31;
        C27256h c27256h = this.cardButton;
        int iHashCode8 = (iHashCode7 + (c27256h == null ? 0 : c27256h.hashCode())) * 31;
        C27256h c27256h2 = this.secondCardButton;
        int iHashCode9 = (iHashCode8 + (c27256h2 == null ? 0 : c27256h2.hashCode())) * 31;
        C23032d c23032d = this.featureList;
        int iHashCode10 = (iHashCode9 + (c23032d == null ? 0 : c23032d.hashCode())) * 31;
        C23030b c23030b = this.descriptionCard;
        int iHashCode11 = (iHashCode10 + (c23030b == null ? 0 : c23030b.hashCode())) * 31;
        List<C25306o> list = this.items;
        int iM30447a = AbstractC11266d.m30447a(this.interItemPadding, AbstractC11266d.m30447a(this.sectionBottomPadding, AbstractC11266d.m30447a(this.sectionTopPadding, (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31, 31), 31), 31);
        AbstractC18247a abstractC18247a = this.checkmarkBackground;
        int iM8289b = AbstractC2875y.m8289b((iM30447a + (abstractC18247a == null ? 0 : abstractC18247a.hashCode())) * 31, 31, this.shouldShowDivider);
        C17750h1 c17750h1 = this.badge;
        return iM8289b + (c17750h1 != null ? c17750h1.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final EnumC16313m0 getEndIcon() {
        return this.endIcon;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C23032d getFeatureList() {
        return this.featureList;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final float getInterItemPadding() {
        return this.interItemPadding;
    }

    /* JADX INFO: renamed from: m */
    public final List<C25306o> m66932m() {
        return this.items;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final C27256h getSecondCardButton() {
        return this.secondCardButton;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final float getSectionBottomPadding() {
        return this.sectionBottomPadding;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final float getSectionTopPadding() {
        return this.sectionTopPadding;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getShouldShowDivider() {
        return this.shouldShowDivider;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final EnumC23048t getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final AbstractC22403o getTierImage() {
        return this.tierImage;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public String toString() {
        String str = this.id;
        EnumC16313m0 enumC16313m0 = this.endIcon;
        AbstractC22403o abstractC22403o = this.titleImage;
        String str2 = this.title;
        EnumC2888c enumC2888c = this.titleTypography;
        AbstractC22403o abstractC22403o2 = this.tierImage;
        String str3 = this.header;
        String str4 = this.category;
        String str5 = this.trackingValue;
        EnumC23048t enumC23048t = this.style;
        C27256h c27256h = this.cardButton;
        C27256h c27256h2 = this.secondCardButton;
        C23032d c23032d = this.featureList;
        C23030b c23030b = this.descriptionCard;
        List<C25306o> list = this.items;
        float f13 = this.sectionTopPadding;
        float f14 = this.sectionBottomPadding;
        float f15 = this.interItemPadding;
        AbstractC18247a abstractC18247a = this.checkmarkBackground;
        boolean z4 = this.shouldShowDivider;
        C17750h1 c17750h1 = this.badge;
        StringBuilder sbM61141l = AbstractC21702c.m61141l("UpsellCardFeaturesState(id=", str, ", endIcon=", enumC16313m0, ", titleImage=");
        sbM61141l.append(abstractC22403o);
        sbM61141l.append(", title=");
        sbM61141l.append(str2);
        sbM61141l.append(", titleTypography=");
        sbM61141l.append(enumC2888c);
        sbM61141l.append(", tierImage=");
        sbM61141l.append(abstractC22403o2);
        sbM61141l.append(", header=");
        AbstractC11266d.m30444B(sbM61141l, str3, ", category=", str4, ", trackingValue=");
        sbM61141l.append(str5);
        sbM61141l.append(", style=");
        sbM61141l.append(enumC23048t);
        sbM61141l.append(", cardButton=");
        sbM61141l.append(c27256h);
        sbM61141l.append(", secondCardButton=");
        sbM61141l.append(c27256h2);
        sbM61141l.append(", featureList=");
        sbM61141l.append(c23032d);
        sbM61141l.append(", descriptionCard=");
        sbM61141l.append(c23030b);
        sbM61141l.append(", items=");
        sbM61141l.append(list);
        sbM61141l.append(", sectionTopPadding=");
        sbM61141l.append(f13);
        sbM61141l.append(", sectionBottomPadding=");
        AbstractC30802r.m94772u(sbM61141l, f14, ", interItemPadding=", f15, ", checkmarkBackground=");
        sbM61141l.append(abstractC18247a);
        sbM61141l.append(", shouldShowDivider=");
        sbM61141l.append(z4);
        sbM61141l.append(", badge=");
        sbM61141l.append(c17750h1);
        sbM61141l.append(")");
        return sbM61141l.toString();
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final AbstractC22403o getTitleImage() {
        return this.titleImage;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final EnumC2888c getTitleTypography() {
        return this.titleTypography;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getTrackingValue() {
        return this.trackingValue;
    }

    public /* synthetic */ C23042n(String str, EnumC16313m0 enumC16313m0, AbstractC22403o abstractC22403o, String str2, EnumC2888c enumC2888c, AbstractC22403o abstractC22403o2, String str3, String str4, String str5, EnumC23048t enumC23048t, C27256h c27256h, C27256h c27256h2, C23032d c23032d, C23030b c23030b, List list, float f13, float f14, float f15, AbstractC18247a abstractC18247a, boolean z4, C17750h1 c17750h1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, enumC16313m0, abstractC22403o, str2, (i13 & 16) != 0 ? EnumC2888c.B2 : enumC2888c, abstractC22403o2, (i13 & 64) != 0 ? null : str3, (i13 & 128) != 0 ? null : str4, (i13 & 256) != 0 ? null : str5, enumC23048t, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : c27256h, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : c27256h2, (i13 & 4096) != 0 ? null : c23032d, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : c23030b, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : list, (32768 & i13) != 0 ? 0.0f : f13, (65536 & i13) != 0 ? 0.0f : f14, (131072 & i13) != 0 ? 12.0f : f15, (262144 & i13) != 0 ? null : abstractC18247a, (524288 & i13) != 0 ? true : z4, (i13 & 1048576) != 0 ? null : c17750h1);
    }
}
