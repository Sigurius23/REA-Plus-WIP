package tu1;

import c13.AbstractC3855a;
import com.whoop.design.util.TextResource;
import java.util.List;
import jh3.AbstractC21702c;
import ly0.C24802f;
import n21.C26191e;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: tu1.g */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001c\u0010(R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010(R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b8\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b)\u0010(R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\b8\u0006¢\u0006\f\n\u0004\b!\u0010'\u001a\u0004\b\u001f\u0010(¨\u0006+"}, m65681d2 = {"Ltu1/g;", "Lm91/u;", "", "id", "Lcom/whoop/design/util/TextResource;", "title", "Ltu1/b;", "cardInfoState", "", "Lly0/f;", "arrowStatStates", "Ltu1/h;", "graphScrubState", "Ln21/e;", "graphLegendState", "cardContentStates", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ltu1/b;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "c", "Ltu1/b;", "()Ltu1/b;", "d", "Ljava/util/List;", "()Ljava/util/List;", "e", "f", "last-night-sleep_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34194g implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C34189b cardInfoState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C24802f> arrowStatStates;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<C34195h> graphScrubState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final List<C26191e> graphLegendState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<InterfaceC25312u> cardContentStates;

    /* JADX WARN: Multi-variable type inference failed */
    public C34194g(String id4, TextResource title, C34189b cardInfoState, List<C24802f> arrowStatStates, List<C34195h> graphScrubState, List<C26191e> graphLegendState, List<? extends InterfaceC25312u> cardContentStates) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(cardInfoState, "cardInfoState");
        AbstractC22676k.m65750j(arrowStatStates, "arrowStatStates");
        AbstractC22676k.m65750j(graphScrubState, "graphScrubState");
        AbstractC22676k.m65750j(graphLegendState, "graphLegendState");
        AbstractC22676k.m65750j(cardContentStates, "cardContentStates");
        this.id = id4;
        this.title = title;
        this.cardInfoState = cardInfoState;
        this.arrowStatStates = arrowStatStates;
        this.graphScrubState = graphScrubState;
        this.graphLegendState = graphLegendState;
        this.cardContentStates = cardContentStates;
    }

    /* JADX INFO: renamed from: a */
    public final List<C24802f> m108063a() {
        return this.arrowStatStates;
    }

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC25312u> m108064b() {
        return this.cardContentStates;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C34189b getCardInfoState() {
        return this.cardInfoState;
    }

    /* JADX INFO: renamed from: e */
    public final List<C26191e> m108066e() {
        return this.graphLegendState;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34194g)) {
            return false;
        }
        C34194g c34194g = (C34194g) other;
        return AbstractC22676k.m65745e(this.id, c34194g.id) && AbstractC22676k.m65745e(this.title, c34194g.title) && AbstractC22676k.m65745e(this.cardInfoState, c34194g.cardInfoState) && AbstractC22676k.m65745e(this.arrowStatStates, c34194g.arrowStatStates) && AbstractC22676k.m65745e(this.graphScrubState, c34194g.graphScrubState) && AbstractC22676k.m65745e(this.graphLegendState, c34194g.graphLegendState) && AbstractC22676k.m65745e(this.cardContentStates, c34194g.cardContentStates);
    }

    /* JADX INFO: renamed from: f */
    public final List<C34195h> m108067f() {
        return this.graphScrubState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.cardContentStates.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b((this.cardInfoState.hashCode() + AbstractC31061c.m95625a(this.id.hashCode() * 31, this.title, 31)) * 31, 31, this.arrowStatStates), 31, this.graphScrubState), 31, this.graphLegendState);
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.title;
        C34189b c34189b = this.cardInfoState;
        List<C24802f> list = this.arrowStatStates;
        List<C34195h> list2 = this.graphScrubState;
        List<C26191e> list3 = this.graphLegendState;
        List<InterfaceC25312u> list4 = this.cardContentStates;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("DetailsGraphingCardState(id=", str, ", title=", textResource, ", cardInfoState=");
        sbM91847q.append(c34189b);
        sbM91847q.append(", arrowStatStates=");
        sbM91847q.append(list);
        sbM91847q.append(", graphScrubState=");
        AbstractC21702c.m61148s(sbM91847q, list2, ", graphLegendState=", list3, ", cardContentStates=");
        return AbstractC3855a.m11829m(sbM91847q, list4, ")");
    }
}
