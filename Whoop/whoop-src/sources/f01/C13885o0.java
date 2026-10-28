package f01;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j71.C21395c;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: f01.o0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0086\u0001\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b#\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u00100\u001a\u0004\b1\u00102R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b(\u00105R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b*\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b7\u00109\u001a\u0004\b3\u0010:R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b;\u0010/R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006?"}, m65681d2 = {"Lf01/o0;", "Lm91/u;", "", "cardName", "Lcom/whoop/design/util/TextResource;", "title", "Lgz0/m0;", "endIcon", "rightItem", "Lj71/c;", "graph", "Lf01/k0;", "body", "Lf01/p0;", "footer", "Lcom/whoop/navigation/e;", "destination", "navigationTag", "", "subItems", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lm91/u;Lj71/c;Lf01/k0;Lf01/p0;Lcom/whoop/navigation/e;Lm91/u;Ljava/util/List;)V", "a", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lm91/u;Lj71/c;Lf01/k0;Lf01/p0;Lcom/whoop/navigation/e;Lm91/u;Ljava/util/List;)Lf01/o0;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "Lcom/whoop/design/util/TextResource;", "m", "()Lcom/whoop/design/util/TextResource;", "c", "Lgz0/m0;", "g", "()Lgz0/m0;", "d", "Lm91/u;", "k", "()Lm91/u;", "Lj71/c;", "i", "()Lj71/c;", "f", "Lf01/k0;", "()Lf01/k0;", "Lf01/p0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lf01/p0;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "j", "Ljava/util/List;", "l", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C13885o0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: k */
    public static final int f49515k = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String cardName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC16313m0 endIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC25312u rightItem;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C21395c graph;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C13873k0 body;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C13888p0 footer;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC25312u navigationTag;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final List<InterfaceC25312u> subItems;

    /* JADX WARN: Multi-variable type inference failed */
    public C13885o0(String cardName, TextResource title, EnumC16313m0 enumC16313m0, InterfaceC25312u interfaceC25312u, C21395c graph, C13873k0 body, C13888p0 c13888p0, C9598e c9598e, InterfaceC25312u interfaceC25312u2, List<? extends InterfaceC25312u> list) {
        AbstractC22676k.m65750j(cardName, "cardName");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(graph, "graph");
        AbstractC22676k.m65750j(body, "body");
        this.cardName = cardName;
        this.title = title;
        this.endIcon = enumC16313m0;
        this.rightItem = interfaceC25312u;
        this.graph = graph;
        this.body = body;
        this.footer = c13888p0;
        this.destination = c9598e;
        this.navigationTag = interfaceC25312u2;
        this.subItems = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C13885o0 m39452b(C13885o0 c13885o0, String str, TextResource textResource, EnumC16313m0 enumC16313m0, InterfaceC25312u interfaceC25312u, C21395c c21395c, C13873k0 c13873k0, C13888p0 c13888p0, C9598e c9598e, InterfaceC25312u interfaceC25312u2, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c13885o0.cardName;
        }
        if ((i13 & 2) != 0) {
            textResource = c13885o0.title;
        }
        if ((i13 & 4) != 0) {
            enumC16313m0 = c13885o0.endIcon;
        }
        if ((i13 & 8) != 0) {
            interfaceC25312u = c13885o0.rightItem;
        }
        if ((i13 & 16) != 0) {
            c21395c = c13885o0.graph;
        }
        if ((i13 & 32) != 0) {
            c13873k0 = c13885o0.body;
        }
        if ((i13 & 64) != 0) {
            c13888p0 = c13885o0.footer;
        }
        if ((i13 & 128) != 0) {
            c9598e = c13885o0.destination;
        }
        if ((i13 & 256) != 0) {
            interfaceC25312u2 = c13885o0.navigationTag;
        }
        if ((i13 & 512) != 0) {
            list = c13885o0.subItems;
        }
        InterfaceC25312u interfaceC25312u3 = interfaceC25312u2;
        List list2 = list;
        C13888p0 c13888p1 = c13888p0;
        C9598e c9598e2 = c9598e;
        C21395c c21395c2 = c21395c;
        C13873k0 c13873k1 = c13873k0;
        return c13885o0.m39453a(str, textResource, enumC16313m0, interfaceC25312u, c21395c2, c13873k1, c13888p1, c9598e2, interfaceC25312u3, list2);
    }

    /* JADX INFO: renamed from: a */
    public final C13885o0 m39453a(String cardName, TextResource title, EnumC16313m0 endIcon, InterfaceC25312u rightItem, C21395c graph, C13873k0 body, C13888p0 footer, C9598e destination, InterfaceC25312u navigationTag, List<? extends InterfaceC25312u> subItems) {
        AbstractC22676k.m65750j(cardName, "cardName");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(graph, "graph");
        AbstractC22676k.m65750j(body, "body");
        return new C13885o0(cardName, title, endIcon, rightItem, graph, body, footer, destination, navigationTag, subItems);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C13873k0 getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCardName() {
        return this.cardName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13885o0)) {
            return false;
        }
        C13885o0 c13885o0 = (C13885o0) other;
        return AbstractC22676k.m65745e(this.cardName, c13885o0.cardName) && AbstractC22676k.m65745e(this.title, c13885o0.title) && this.endIcon == c13885o0.endIcon && AbstractC22676k.m65745e(this.rightItem, c13885o0.rightItem) && AbstractC22676k.m65745e(this.graph, c13885o0.graph) && AbstractC22676k.m65745e(this.body, c13885o0.body) && AbstractC22676k.m65745e(this.footer, c13885o0.footer) && AbstractC22676k.m65745e(this.destination, c13885o0.destination) && AbstractC22676k.m65745e(this.navigationTag, c13885o0.navigationTag) && AbstractC22676k.m65745e(this.subItems, c13885o0.subItems);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final EnumC16313m0 getEndIcon() {
        return this.endIcon;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C13888p0 getFooter() {
        return this.footer;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.cardName.hashCode() * 31, this.title, 31);
        EnumC16313m0 enumC16313m0 = this.endIcon;
        int iHashCode = (iM95625a + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        InterfaceC25312u interfaceC25312u = this.rightItem;
        int iHashCode2 = (this.body.hashCode() + ((this.graph.hashCode() + ((iHashCode + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode())) * 31)) * 31)) * 31;
        C13888p0 c13888p0 = this.footer;
        int iHashCode3 = (iHashCode2 + (c13888p0 == null ? 0 : c13888p0.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode4 = (iHashCode3 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        InterfaceC25312u interfaceC25312u2 = this.navigationTag;
        int iHashCode5 = (iHashCode4 + (interfaceC25312u2 == null ? 0 : interfaceC25312u2.hashCode())) * 31;
        List<InterfaceC25312u> list = this.subItems;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C21395c getGraph() {
        return this.graph;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final InterfaceC25312u getNavigationTag() {
        return this.navigationTag;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final InterfaceC25312u getRightItem() {
        return this.rightItem;
    }

    /* JADX INFO: renamed from: l */
    public final List<InterfaceC25312u> m39462l() {
        return this.subItems;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public String toString() {
        String str = this.cardName;
        TextResource textResource = this.title;
        EnumC16313m0 enumC16313m0 = this.endIcon;
        InterfaceC25312u interfaceC25312u = this.rightItem;
        C21395c c21395c = this.graph;
        C13873k0 c13873k0 = this.body;
        C13888p0 c13888p0 = this.footer;
        C9598e c9598e = this.destination;
        InterfaceC25312u interfaceC25312u2 = this.navigationTag;
        List<InterfaceC25312u> list = this.subItems;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("GraphDescriptionCardState(cardName=", str, ", title=", textResource, ", endIcon=");
        sbM91847q.append(enumC16313m0);
        sbM91847q.append(", rightItem=");
        sbM91847q.append(interfaceC25312u);
        sbM91847q.append(", graph=");
        sbM91847q.append(c21395c);
        sbM91847q.append(", body=");
        sbM91847q.append(c13873k0);
        sbM91847q.append(", footer=");
        sbM91847q.append(c13888p0);
        sbM91847q.append(", destination=");
        sbM91847q.append(c9598e);
        sbM91847q.append(", navigationTag=");
        sbM91847q.append(interfaceC25312u2);
        sbM91847q.append(", subItems=");
        sbM91847q.append(list);
        sbM91847q.append(")");
        return sbM91847q.toString();
    }
}
