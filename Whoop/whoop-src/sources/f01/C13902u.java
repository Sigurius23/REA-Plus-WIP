package f01;

import androidx.core.app.NotificationCompat;
import d13.AbstractC11478a;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import m51.InterfaceC25079a;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: f01.u */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0001\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001b\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u0012R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b$\u0010 \u001a\u0004\b\u001d\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b!\u0010'R\u0017\u0010\t\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b+\u0010\u0012R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b\u001a\u00102¨\u00063"}, m65681d2 = {"Lf01/u;", "Lm91/u;", "", "id", "title", "Lgz0/m0;", "endIcon", "Lf01/q0;", "headerContent", "item", "cardName", "", NotificationCompat.CATEGORY_EVENT, "Lm51/a;", "background", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lf01/q0;Lm91/u;Ljava/lang/String;Ljava/lang/Object;Lm51/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "f", "getTitle$annotations", "()V", "c", "Lgz0/m0;", "()Lgz0/m0;", "getEndIcon$annotations", "d", "Lf01/q0;", "()Lf01/q0;", "e", "Lm91/u;", "()Lm91/u;", "getCardName", "g", "Ljava/lang/Object;", "getEvent", "()Ljava/lang/Object;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lm51/a;", "()Lm51/a;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13902u implements InterfaceC25312u {

    /* JADX INFO: renamed from: i */
    public static final int f49578i = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC16313m0 endIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C13891q0 headerContent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC25312u item;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String cardName;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Object event;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC25079a background;

    public C13902u(String id4, String str, EnumC16313m0 enumC16313m0, C13891q0 c13891q0, InterfaceC25312u item, String str2, Object event, InterfaceC25079a interfaceC25079a) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(item, "item");
        AbstractC22676k.m65750j(event, "event");
        this.id = id4;
        this.title = str;
        this.endIcon = enumC16313m0;
        this.headerContent = c13891q0;
        this.item = item;
        this.cardName = str2;
        this.event = event;
        this.background = interfaceC25079a;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC25079a getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getEndIcon() {
        return this.endIcon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C13891q0 getHeaderContent() {
        return this.headerContent;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC25312u getItem() {
        return this.item;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13902u)) {
            return false;
        }
        C13902u c13902u = (C13902u) other;
        return AbstractC22676k.m65745e(this.id, c13902u.id) && AbstractC22676k.m65745e(this.title, c13902u.title) && this.endIcon == c13902u.endIcon && AbstractC22676k.m65745e(this.headerContent, c13902u.headerContent) && AbstractC22676k.m65745e(this.item, c13902u.item) && AbstractC22676k.m65745e(this.cardName, c13902u.cardName) && AbstractC22676k.m65745e(this.event, c13902u.event) && AbstractC22676k.m65745e(this.background, c13902u.background);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Override // p720m91.InterfaceC25312u
    public Object getEvent() {
        return this.event;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.endIcon;
        int iHashCode3 = (iHashCode2 + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        C13891q0 c13891q0 = this.headerContent;
        int iM30851c = AbstractC11478a.m30851c(this.item, (iHashCode3 + (c13891q0 == null ? 0 : c13891q0.hashCode())) * 31, 31);
        String str2 = this.cardName;
        int iM106644c = AbstractC33745d.m106644c((iM30851c + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.event);
        InterfaceC25079a interfaceC25079a = this.background;
        return iM106644c + (interfaceC25079a != null ? interfaceC25079a.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        EnumC16313m0 enumC16313m0 = this.endIcon;
        C13891q0 c13891q0 = this.headerContent;
        InterfaceC25312u interfaceC25312u = this.item;
        String str3 = this.cardName;
        Object obj = this.event;
        InterfaceC25079a interfaceC25079a = this.background;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CardContainerViewState(id=", str, ", title=", str2, ", endIcon=");
        sbM32001t.append(enumC16313m0);
        sbM32001t.append(", headerContent=");
        sbM32001t.append(c13891q0);
        sbM32001t.append(", item=");
        sbM32001t.append(interfaceC25312u);
        sbM32001t.append(", cardName=");
        sbM32001t.append(str3);
        sbM32001t.append(", event=");
        sbM32001t.append(obj);
        sbM32001t.append(", background=");
        sbM32001t.append(interfaceC25079a);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ C13902u(String str, String str2, EnumC16313m0 enumC16313m0, C13891q0 c13891q0, InterfaceC25312u interfaceC25312u, String str3, Object obj, InterfaceC25079a interfaceC25079a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, enumC16313m0, (i13 & 8) != 0 ? null : c13891q0, interfaceC25312u, (i13 & 32) != 0 ? null : str3, (i13 & 64) != 0 ? C23454a0.f92919a : obj, (i13 & 128) != 0 ? null : interfaceC25079a);
    }
}
