package uw0;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d13.AbstractC11478a;
import km0.C22581e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p736sz0.AbstractC33208p0;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: uw0.p */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Luw0/p;", "", "Luw0/p$a;", "fullScreenModal", "Lkm0/e;", "bottomSheetViewState", "<init>", "(Luw0/p$a;Lkm0/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Luw0/p$a;", "b", "()Luw0/p$a;", "Lkm0/e;", "()Lkm0/e;", "custombottomsheet_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35306p {

    /* JADX INFO: renamed from: c */
    public static final int f150384c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final a fullScreenModal;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C22581e bottomSheetViewState;

    static {
        int i13 = C22581e.f88865n;
        int i14 = TextResource.$stable;
        f150384c = i13 | i14 | i14 | AbstractC33208p0.f138461d;
    }

    public C35306p(a aVar, C22581e c22581e) {
        this.fullScreenModal = aVar;
        this.bottomSheetViewState = c22581e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C22581e getBottomSheetViewState() {
        return this.bottomSheetViewState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getFullScreenModal() {
        return this.fullScreenModal;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35306p)) {
            return false;
        }
        C35306p c35306p = (C35306p) other;
        return AbstractC22676k.m65745e(this.fullScreenModal, c35306p.fullScreenModal) && AbstractC22676k.m65745e(this.bottomSheetViewState, c35306p.bottomSheetViewState);
    }

    public int hashCode() {
        a aVar = this.fullScreenModal;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        C22581e c22581e = this.bottomSheetViewState;
        return iHashCode + (c22581e != null ? c22581e.hashCode() : 0);
    }

    public String toString() {
        return "CustomBottomSheetViewState(fullScreenModal=" + this.fullScreenModal + ", bottomSheetViewState=" + this.bottomSheetViewState + ")";
    }

    public /* synthetic */ C35306p(a aVar, C22581e c22581e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : aVar, (i13 & 2) != 0 ? null : c22581e);
    }

    /* JADX INFO: renamed from: uw0.p$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0014\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Luw0/p$a;", "", "Lsz0/p0;", "type", "Lcom/whoop/design/util/TextResource;", "supportText", "primaryButtonText", "", "removeBackgroundModifier", "<init>", "(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/p0;", "d", "()Lsz0/p0;", "b", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "Z", "()Z", "custombottomsheet_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: e */
        public static final int f150387e = TextResource.$stable | AbstractC33208p0.f138461d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC33208p0 type;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource supportText;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource primaryButtonText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean removeBackgroundModifier;

        public a(AbstractC33208p0 type, TextResource supportText, TextResource primaryButtonText, boolean z4) {
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(supportText, "supportText");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            this.type = type;
            this.supportText = supportText;
            this.primaryButtonText = primaryButtonText;
            this.removeBackgroundModifier = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getRemoveBackgroundModifier() {
            return this.removeBackgroundModifier;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getSupportText() {
            return this.supportText;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final AbstractC33208p0 getType() {
            return this.type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.type, aVar.type) && AbstractC22676k.m65745e(this.supportText, aVar.supportText) && AbstractC22676k.m65745e(this.primaryButtonText, aVar.primaryButtonText) && this.removeBackgroundModifier == aVar.removeBackgroundModifier;
        }

        public int hashCode() {
            return Boolean.hashCode(this.removeBackgroundModifier) + AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.type.hashCode() * 31, this.supportText, 31), this.primaryButtonText, 31);
        }

        public String toString() {
            AbstractC33208p0 abstractC33208p0 = this.type;
            TextResource textResource = this.supportText;
            TextResource textResource2 = this.primaryButtonText;
            boolean z4 = this.removeBackgroundModifier;
            StringBuilder sbM30862n = AbstractC11478a.m30862n("FullScreenModal(type=", abstractC33208p0, ", supportText=", textResource, ", primaryButtonText=");
            sbM30862n.append(textResource2);
            sbM30862n.append(", removeBackgroundModifier=");
            sbM30862n.append(z4);
            sbM30862n.append(")");
            return sbM30862n.toString();
        }

        public /* synthetic */ a(AbstractC33208p0 abstractC33208p0, TextResource textResource, TextResource textResource2, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractC33208p0, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 8) != 0 ? true : z4);
        }
    }
}
