package ld0;

import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import java.util.List;
import kd1.AbstractC22403o;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: ld0.s */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0017\u0010#¨\u0006$"}, m65681d2 = {"Lld0/s;", "Lm91/u;", "Lkd1/o;", "image", "", "items", "Lgz0/m0;", "rightIcon", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Lkd1/o;Ljava/util/List;Lgz0/m0;Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "b", "()Lkd1/o;", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lgz0/m0;", "e", "()Lgz0/m0;", "d", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23860s implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<InterfaceC25312u> items;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC16313m0 rightIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX WARN: Multi-variable type inference failed */
    public C23860s(AbstractC22403o image, List<? extends InterfaceC25312u> items, EnumC16313m0 rightIcon, C9598e c9598e) {
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(rightIcon, "rightIcon");
        this.image = image;
        this.items = items;
        this.rightIcon = rightIcon;
        this.destination = c9598e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: c */
    public final List<InterfaceC25312u> m70112c() {
        return this.items;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC16313m0 getRightIcon() {
        return this.rightIcon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23860s)) {
            return false;
        }
        C23860s c23860s = (C23860s) other;
        return AbstractC22676k.m65745e(this.image, c23860s.image) && AbstractC22676k.m65745e(this.items, c23860s.items) && this.rightIcon == c23860s.rightIcon && AbstractC22676k.m65745e(this.destination, c23860s.destination);
    }

    public int hashCode() {
        int iM48500b = AbstractC17176i.m48500b(this.rightIcon, AbstractC11895b.m31983b(this.image.hashCode() * 31, 31, this.items), 31);
        C9598e c9598e = this.destination;
        return iM48500b + (c9598e == null ? 0 : c9598e.hashCode());
    }

    public String toString() {
        return "SpecializedPanelUpsellTileViewState(image=" + this.image + ", items=" + this.items + ", rightIcon=" + this.rightIcon + ", destination=" + this.destination + ")";
    }
}
