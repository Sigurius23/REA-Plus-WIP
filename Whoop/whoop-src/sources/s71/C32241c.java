package s71;

import com.whoop.design.util.TextResource;
import java.util.List;
import o21.C27465c;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: s71.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, m65681d2 = {"Ls71/c;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "header", "", "Lo21/c;", "cards", "magnitudeCallout", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "Ljava/util/List;", "()Ljava/util/List;", "c", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32241c implements InterfaceC25312u {

    /* JADX INFO: renamed from: d */
    public static final int f133491d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource header;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C27465c> cards;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource magnitudeCallout;

    public C32241c(TextResource header, List<C27465c> cards, TextResource magnitudeCallout) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(cards, "cards");
        AbstractC22676k.m65750j(magnitudeCallout, "magnitudeCallout");
        this.header = header;
        this.cards = cards;
        this.magnitudeCallout = magnitudeCallout;
    }

    /* JADX INFO: renamed from: a */
    public final List<C27465c> m100317a() {
        return this.cards;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getMagnitudeCallout() {
        return this.magnitudeCallout;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32241c)) {
            return false;
        }
        C32241c c32241c = (C32241c) other;
        return AbstractC22676k.m65745e(this.header, c32241c.header) && AbstractC22676k.m65745e(this.cards, c32241c.cards) && AbstractC22676k.m65745e(this.magnitudeCallout, c32241c.magnitudeCallout);
    }

    public int hashCode() {
        return this.magnitudeCallout.hashCode() + AbstractC11895b.m31983b(this.header.hashCode() * 31, 31, this.cards);
    }

    public String toString() {
        TextResource textResource = this.header;
        List<C27465c> list = this.cards;
        return AbstractC30007c.m91841k(AbstractC33745d.m106657p(textResource, "ImpactMagnitudeTileState(header=", ", cards=", ", magnitudeCallout=", list), this.magnitudeCallout, ")");
    }
}
