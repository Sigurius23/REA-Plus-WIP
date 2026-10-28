package so1;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: so1.z */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u001b"}, m65681d2 = {"Lso1/z;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "topTitleDisplay", "topContentDisplay", "bottomTitleDisplay", "bottomContentDisplay", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "c", "d", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32842z implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f136862e = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource topTitleDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource topContentDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource bottomTitleDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource bottomContentDisplay;

    public C32842z(TextResource topTitleDisplay, TextResource topContentDisplay, TextResource bottomTitleDisplay, TextResource bottomContentDisplay) {
        AbstractC22676k.m65750j(topTitleDisplay, "topTitleDisplay");
        AbstractC22676k.m65750j(topContentDisplay, "topContentDisplay");
        AbstractC22676k.m65750j(bottomTitleDisplay, "bottomTitleDisplay");
        AbstractC22676k.m65750j(bottomContentDisplay, "bottomContentDisplay");
        this.topTitleDisplay = topTitleDisplay;
        this.topContentDisplay = topContentDisplay;
        this.bottomTitleDisplay = bottomTitleDisplay;
        this.bottomContentDisplay = bottomContentDisplay;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getBottomContentDisplay() {
        return this.bottomContentDisplay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getBottomTitleDisplay() {
        return this.bottomTitleDisplay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTopContentDisplay() {
        return this.topContentDisplay;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTopTitleDisplay() {
        return this.topTitleDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32842z)) {
            return false;
        }
        C32842z c32842z = (C32842z) other;
        return AbstractC22676k.m65745e(this.topTitleDisplay, c32842z.topTitleDisplay) && AbstractC22676k.m65745e(this.topContentDisplay, c32842z.topContentDisplay) && AbstractC22676k.m65745e(this.bottomTitleDisplay, c32842z.bottomTitleDisplay) && AbstractC22676k.m65745e(this.bottomContentDisplay, c32842z.bottomContentDisplay);
    }

    public int hashCode() {
        return this.bottomContentDisplay.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.topTitleDisplay.hashCode() * 31, this.topContentDisplay, 31), this.bottomTitleDisplay, 31);
    }

    public String toString() {
        TextResource textResource = this.topTitleDisplay;
        TextResource textResource2 = this.topContentDisplay;
        return AbstractC33745d.m106655n(AbstractC33745d.m106658q("MciMedicalDisclaimerViewState(topTitleDisplay=", textResource, ", topContentDisplay=", textResource2, ", bottomTitleDisplay="), this.bottomTitleDisplay, ", bottomContentDisplay=", this.bottomContentDisplay, ")");
    }
}
