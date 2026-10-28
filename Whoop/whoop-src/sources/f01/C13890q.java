package f01;

import androidx.profileinstaller.ProfileVerifier;
import com.whoop.navigation.C9598e;
import com.whoop.whoopaction.domain.models.Action;
import gz0.EnumC16313m0;
import hy0.C17750h1;
import hy0.EnumC17729c0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import kd1.AbstractC22403o;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.C27256h;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: f01.q */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b1\b\u0087\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u00132\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010$R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b+\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b.\u0010?R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b;\u0010@\u001a\u0004\bA\u0010BR\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b3\u0010C\u001a\u0004\bD\u0010ER\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b7\u0010C\u001a\u0004\b=\u0010ER\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bD\u0010F\u001a\u0004\bG\u0010HR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\b9\u0010KR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bG\u0010L\u001a\u0004\b5\u0010MR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\b0\u0010PR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bA\u0010Q\u001a\u0004\bN\u0010RR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bI\u0010UR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b/\u0010V\u001a\u0004\bS\u0010W¨\u0006X"}, m65681d2 = {"Lf01/q;", "Lm91/u;", "", "id", "titleDisplay", "bodyDisplay", "Lkd1/o;", "imageUrl", "Lhy0/c0;", "imageUrlAlignment", "", "imageSize", "Lny0/h;", "button", "Lhy0/h1;", "tag", "", "items", "expandedItems", "", "shouldShowExpandedItems", "Lgz0/m0;", "dismissIcon", "Lcom/whoop/whoopaction/domain/models/Action;", "dismissAction", "Lcom/whoop/navigation/e;", "destination", "Lf01/p;", "style", "Lf01/o;", "price", "Ly81/f;", "titleColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lhy0/c0;Ljava/lang/Integer;Lny0/h;Lhy0/h1;Ljava/util/List;Ljava/util/List;ZLgz0/m0;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/e;Lf01/p;Lf01/o;Ly81/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "q", "c", "d", "Lkd1/o;", "i", "()Lkd1/o;", "e", "Lhy0/c0;", "j", "()Lhy0/c0;", "f", "Ljava/lang/Integer;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ljava/lang/Integer;", "g", "Lny0/h;", "()Lny0/h;", "Lhy0/h1;", "o", "()Lhy0/h1;", "Ljava/util/List;", "k", "()Ljava/util/List;", "Z", "m", "()Z", "l", "Lgz0/m0;", "()Lgz0/m0;", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "n", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "Lf01/p;", "()Lf01/p;", "p", "Lf01/o;", "()Lf01/o;", "Ly81/f;", "()Ly81/f;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13890q implements InterfaceC25312u {

    /* JADX INFO: renamed from: r */
    public static final int f49539r = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String titleDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String bodyDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC22403o imageUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC17729c0 imageUrlAlignment;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Integer imageSize;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C27256h button;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C17750h1 tag;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final List<InterfaceC25312u> expandedItems;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean shouldShowExpandedItems;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final EnumC16313m0 dismissIcon;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Action dismissAction;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final EnumC13887p style;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final C13884o price;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final EnumC39333f titleColor;

    /* JADX WARN: Multi-variable type inference failed */
    public C13890q(String id4, String titleDisplay, String bodyDisplay, AbstractC22403o abstractC22403o, EnumC17729c0 enumC17729c0, Integer num, C27256h c27256h, C17750h1 c17750h1, List<? extends InterfaceC25312u> list, List<? extends InterfaceC25312u> list2, boolean z4, EnumC16313m0 enumC16313m0, Action action, C9598e c9598e, EnumC13887p style, C13884o c13884o, EnumC39333f enumC39333f) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(bodyDisplay, "bodyDisplay");
        AbstractC22676k.m65750j(style, "style");
        this.id = id4;
        this.titleDisplay = titleDisplay;
        this.bodyDisplay = bodyDisplay;
        this.imageUrl = abstractC22403o;
        this.imageUrlAlignment = enumC17729c0;
        this.imageSize = num;
        this.button = c27256h;
        this.tag = c17750h1;
        this.items = list;
        this.expandedItems = list2;
        this.shouldShowExpandedItems = z4;
        this.dismissIcon = enumC16313m0;
        this.dismissAction = action;
        this.destination = c9598e;
        this.style = style;
        this.price = c13884o;
        this.titleColor = enumC39333f;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBodyDisplay() {
        return this.bodyDisplay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C27256h getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Action getDismissAction() {
        return this.dismissAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13890q)) {
            return false;
        }
        C13890q c13890q = (C13890q) other;
        return AbstractC22676k.m65745e(this.id, c13890q.id) && AbstractC22676k.m65745e(this.titleDisplay, c13890q.titleDisplay) && AbstractC22676k.m65745e(this.bodyDisplay, c13890q.bodyDisplay) && AbstractC22676k.m65745e(this.imageUrl, c13890q.imageUrl) && this.imageUrlAlignment == c13890q.imageUrlAlignment && AbstractC22676k.m65745e(this.imageSize, c13890q.imageSize) && AbstractC22676k.m65745e(this.button, c13890q.button) && AbstractC22676k.m65745e(this.tag, c13890q.tag) && AbstractC22676k.m65745e(this.items, c13890q.items) && AbstractC22676k.m65745e(this.expandedItems, c13890q.expandedItems) && this.shouldShowExpandedItems == c13890q.shouldShowExpandedItems && this.dismissIcon == c13890q.dismissIcon && AbstractC22676k.m65745e(this.dismissAction, c13890q.dismissAction) && AbstractC22676k.m65745e(this.destination, c13890q.destination) && this.style == c13890q.style && AbstractC22676k.m65745e(this.price, c13890q.price) && this.titleColor == c13890q.titleColor;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC16313m0 getDismissIcon() {
        return this.dismissIcon;
    }

    /* JADX INFO: renamed from: g */
    public final List<InterfaceC25312u> m39505g() {
        return this.expandedItems;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getImageSize() {
        return this.imageSize;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.titleDisplay), 31, this.bodyDisplay);
        AbstractC22403o abstractC22403o = this.imageUrl;
        int iHashCode = (iM30450d + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31;
        EnumC17729c0 enumC17729c0 = this.imageUrlAlignment;
        int iHashCode2 = (iHashCode + (enumC17729c0 == null ? 0 : enumC17729c0.hashCode())) * 31;
        Integer num = this.imageSize;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        C27256h c27256h = this.button;
        int iHashCode4 = (iHashCode3 + (c27256h == null ? 0 : c27256h.hashCode())) * 31;
        C17750h1 c17750h1 = this.tag;
        int iHashCode5 = (iHashCode4 + (c17750h1 == null ? 0 : c17750h1.hashCode())) * 31;
        List<InterfaceC25312u> list = this.items;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<InterfaceC25312u> list2 = this.expandedItems;
        int iM8289b = AbstractC2875y.m8289b((iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.shouldShowExpandedItems);
        EnumC16313m0 enumC16313m0 = this.dismissIcon;
        int iHashCode7 = (iM8289b + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        Action action = this.dismissAction;
        int iHashCode8 = (iHashCode7 + (action == null ? 0 : action.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode9 = (this.style.hashCode() + ((iHashCode8 + (c9598e == null ? 0 : c9598e.hashCode())) * 31)) * 31;
        C13884o c13884o = this.price;
        int iHashCode10 = (iHashCode9 + (c13884o == null ? 0 : c13884o.hashCode())) * 31;
        EnumC39333f enumC39333f = this.titleColor;
        return iHashCode10 + (enumC39333f != null ? enumC39333f.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final AbstractC22403o getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final EnumC17729c0 getImageUrlAlignment() {
        return this.imageUrlAlignment;
    }

    /* JADX INFO: renamed from: k */
    public final List<InterfaceC25312u> m39509k() {
        return this.items;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C13884o getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getShouldShowExpandedItems() {
        return this.shouldShowExpandedItems;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final EnumC13887p getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final C17750h1 getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final EnumC39333f getTitleColor() {
        return this.titleColor;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.titleDisplay;
        String str3 = this.bodyDisplay;
        AbstractC22403o abstractC22403o = this.imageUrl;
        EnumC17729c0 enumC17729c0 = this.imageUrlAlignment;
        Integer num = this.imageSize;
        C27256h c27256h = this.button;
        C17750h1 c17750h1 = this.tag;
        List<InterfaceC25312u> list = this.items;
        List<InterfaceC25312u> list2 = this.expandedItems;
        boolean z4 = this.shouldShowExpandedItems;
        EnumC16313m0 enumC16313m0 = this.dismissIcon;
        Action action = this.dismissAction;
        C9598e c9598e = this.destination;
        EnumC13887p enumC13887p = this.style;
        C13884o c13884o = this.price;
        EnumC39333f enumC39333f = this.titleColor;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ButtonCardViewState(id=", str, ", titleDisplay=", str2, ", bodyDisplay=");
        sbM32001t.append(str3);
        sbM32001t.append(", imageUrl=");
        sbM32001t.append(abstractC22403o);
        sbM32001t.append(", imageUrlAlignment=");
        sbM32001t.append(enumC17729c0);
        sbM32001t.append(", imageSize=");
        sbM32001t.append(num);
        sbM32001t.append(", button=");
        sbM32001t.append(c27256h);
        sbM32001t.append(", tag=");
        sbM32001t.append(c17750h1);
        sbM32001t.append(", items=");
        AbstractC21702c.m61148s(sbM32001t, list, ", expandedItems=", list2, ", shouldShowExpandedItems=");
        sbM32001t.append(z4);
        sbM32001t.append(", dismissIcon=");
        sbM32001t.append(enumC16313m0);
        sbM32001t.append(", dismissAction=");
        sbM32001t.append(action);
        sbM32001t.append(", destination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", style=");
        sbM32001t.append(enumC13887p);
        sbM32001t.append(", price=");
        sbM32001t.append(c13884o);
        sbM32001t.append(", titleColor=");
        return AbstractC21702c.m61138i(sbM32001t, enumC39333f, ")");
    }

    public /* synthetic */ C13890q(String str, String str2, String str3, AbstractC22403o abstractC22403o, EnumC17729c0 enumC17729c0, Integer num, C27256h c27256h, C17750h1 c17750h1, List list, List list2, boolean z4, EnumC16313m0 enumC16313m0, Action action, C9598e c9598e, EnumC13887p enumC13887p, C13884o c13884o, EnumC39333f enumC39333f, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i13 & 8) != 0 ? null : abstractC22403o, (i13 & 16) != 0 ? EnumC17729c0.TRAILING : enumC17729c0, (i13 & 32) != 0 ? null : num, (i13 & 64) != 0 ? null : c27256h, (i13 & 128) != 0 ? null : c17750h1, (i13 & 256) != 0 ? null : list, (i13 & 512) != 0 ? null : list2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : enumC16313m0, (i13 & 4096) != 0 ? null : action, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : c9598e, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? EnumC13887p.DEFAULT : enumC13887p, (32768 & i13) != 0 ? null : c13884o, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? null : enumC39333f);
    }
}
