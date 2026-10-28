package iw0;

import com.whoop.design.util.TextResource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: iw0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Liw0/a;", "", "Lcom/whoop/design/util/TextResource;", "volumeDisplay", "tonnageDisplay", "intensityDisplay", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C20957a {

    /* JADX INFO: renamed from: d */
    public static final int f79173d = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource volumeDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource tonnageDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource intensityDisplay;

    public C20957a(TextResource volumeDisplay, TextResource tonnageDisplay, TextResource textResource) {
        AbstractC22676k.m65750j(volumeDisplay, "volumeDisplay");
        AbstractC22676k.m65750j(tonnageDisplay, "tonnageDisplay");
        this.volumeDisplay = volumeDisplay;
        this.tonnageDisplay = tonnageDisplay;
        this.intensityDisplay = textResource;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getIntensityDisplay() {
        return this.intensityDisplay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getTonnageDisplay() {
        return this.tonnageDisplay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getVolumeDisplay() {
        return this.volumeDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20957a)) {
            return false;
        }
        C20957a c20957a = (C20957a) other;
        return AbstractC22676k.m65745e(this.volumeDisplay, c20957a.volumeDisplay) && AbstractC22676k.m65745e(this.tonnageDisplay, c20957a.tonnageDisplay) && AbstractC22676k.m65745e(this.intensityDisplay, c20957a.intensityDisplay);
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.volumeDisplay.hashCode() * 31, this.tonnageDisplay, 31);
        TextResource textResource = this.intensityDisplay;
        return iM95625a + (textResource == null ? 0 : textResource.hashCode());
    }

    public String toString() {
        TextResource textResource = this.volumeDisplay;
        TextResource textResource2 = this.tonnageDisplay;
        return AbstractC30007c.m91841k(AbstractC33745d.m106658q("BottomStats(volumeDisplay=", textResource, ", tonnageDisplay=", textResource2, ", intensityDisplay="), this.intensityDisplay, ")");
    }
}
