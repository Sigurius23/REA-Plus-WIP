package t71;

import c13.AbstractC3855a;
import c41.C4115s4;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import java.util.List;
import jh3.AbstractC21702c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import y11.C39065r;

/* JADX INFO: renamed from: t71.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lt71/g;", "", "b", "a", "Lt71/g$a;", "Lt71/g$b;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC33570g {

    /* JADX INFO: renamed from: t71.g$b */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lt71/g$b;", "Lt71/g;", "Lcom/whoop/design/util/TextResource;", "label", "Ly81/f;", "labelColor", "Ly11/r;", "horizontalImpactBarViewState", "<init>", "(Lcom/whoop/design/util/TextResource;Ly81/f;Ly11/r;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "Ly81/f;", "c", "()Ly81/f;", "Ly11/r;", "()Ly11/r;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC33570g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource label;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC39333f labelColor;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C39065r horizontalImpactBarViewState;

        public b(TextResource label, EnumC39333f labelColor, C39065r horizontalImpactBarViewState) {
            AbstractC22676k.m65750j(label, "label");
            AbstractC22676k.m65750j(labelColor, "labelColor");
            AbstractC22676k.m65750j(horizontalImpactBarViewState, "horizontalImpactBarViewState");
            this.label = label;
            this.labelColor = labelColor;
            this.horizontalImpactBarViewState = horizontalImpactBarViewState;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C39065r getHorizontalImpactBarViewState() {
            return this.horizontalImpactBarViewState;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC39333f getLabelColor() {
            return this.labelColor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.label, bVar.label) && this.labelColor == bVar.labelColor && AbstractC22676k.m65745e(this.horizontalImpactBarViewState, bVar.horizontalImpactBarViewState);
        }

        public int hashCode() {
            return this.horizontalImpactBarViewState.hashCode() + AbstractC21702c.m61132c(this.labelColor, this.label.hashCode() * 31, 31);
        }

        public String toString() {
            return "RecoveryActivityUnlock(label=" + this.label + ", labelColor=" + this.labelColor + ", horizontalImpactBarViewState=" + this.horizontalImpactBarViewState + ")";
        }
    }

    /* JADX INFO: renamed from: t71.g$a */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lt71/g$a;", "Lt71/g;", "Lcom/whoop/design/util/TextResource;", "label", "Ly81/f;", "labelColor", "", "Lc41/s4;", "emptyStateTileStates", "<init>", "(Lcom/whoop/design/util/TextResource;Ly81/f;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "Ly81/f;", "c", "()Ly81/f;", "Ljava/util/List;", "()Ljava/util/List;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC33570g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource label;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final EnumC39333f labelColor;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<C4115s4> emptyStateTileStates;

        public a(TextResource label, EnumC39333f labelColor, List<C4115s4> emptyStateTileStates) {
            AbstractC22676k.m65750j(label, "label");
            AbstractC22676k.m65750j(labelColor, "labelColor");
            AbstractC22676k.m65750j(emptyStateTileStates, "emptyStateTileStates");
            this.label = label;
            this.labelColor = labelColor;
            this.emptyStateTileStates = emptyStateTileStates;
        }

        /* JADX INFO: renamed from: a */
        public final List<C4115s4> m106013a() {
            return this.emptyStateTileStates;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final EnumC39333f getLabelColor() {
            return this.labelColor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.label, aVar.label) && this.labelColor == aVar.labelColor && AbstractC22676k.m65745e(this.emptyStateTileStates, aVar.emptyStateTileStates);
        }

        public int hashCode() {
            return this.emptyStateTileStates.hashCode() + AbstractC21702c.m61132c(this.labelColor, this.label.hashCode() * 31, 31);
        }

        public String toString() {
            TextResource textResource = this.label;
            EnumC39333f enumC39333f = this.labelColor;
            List<C4115s4> list = this.emptyStateTileStates;
            StringBuilder sb4 = new StringBuilder("RecoveryActivityLock(label=");
            sb4.append(textResource);
            sb4.append(", labelColor=");
            sb4.append(enumC39333f);
            sb4.append(", emptyStateTileStates=");
            return AbstractC3855a.m11829m(sb4, list, ")");
        }

        public /* synthetic */ a(TextResource textResource, EnumC39333f enumC39333f, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? EnumC39333f.WHITE_30 : enumC39333f, list);
        }
    }
}
