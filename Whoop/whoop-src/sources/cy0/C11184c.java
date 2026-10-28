package cy0;

import com.whoop.deepdive.domain.models.DeepDiveSectionSpacingType;
import com.whoop.design.util.TextResource;
import ep0.C13404j;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import nh3.AbstractC26725a;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p736sz0.C33211q0;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import tu1.C34188a;

/* JADX INFO: renamed from: cy0.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u001a\u001d\u0014\u0017B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"Lcy0/c;", "", "Ltu1/a;", "bottomSheet", "Lcy0/c$c;", "fullScreenModal", "Lcy0/c$d;", "screenContent", "<init>", "(Ltu1/a;Lcy0/c$c;Lcy0/c$d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltu1/a;", "()Ltu1/a;", "b", "Lcy0/c$c;", "()Lcy0/c$c;", "c", "Lcy0/c$d;", "()Lcy0/c$d;", "d", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11184c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C34188a bottomSheet;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final c fullScreenModal;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final d screenContent;

    /* JADX INFO: renamed from: cy0.c$a */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lcy0/c$a;", "", "", "Lm91/u;", "itemViewState", "Lcom/whoop/deepdive/domain/models/DeepDiveSectionSpacingType;", "insetBottom", "", "isAdjacentToInfoCallout", "<init>", "(Ljava/util/List;Lcom/whoop/deepdive/domain/models/DeepDiveSectionSpacingType;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lcom/whoop/deepdive/domain/models/DeepDiveSectionSpacingType;", "()Lcom/whoop/deepdive/domain/models/DeepDiveSectionSpacingType;", "c", "Z", "()Z", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<InterfaceC25312u> itemViewState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final DeepDiveSectionSpacingType insetBottom;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean isAdjacentToInfoCallout;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends InterfaceC25312u> itemViewState, DeepDiveSectionSpacingType insetBottom, boolean z4) {
            AbstractC22676k.m65750j(itemViewState, "itemViewState");
            AbstractC22676k.m65750j(insetBottom, "insetBottom");
            this.itemViewState = itemViewState;
            this.insetBottom = insetBottom;
            this.isAdjacentToInfoCallout = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DeepDiveSectionSpacingType getInsetBottom() {
            return this.insetBottom;
        }

        /* JADX INFO: renamed from: b */
        public final List<InterfaceC25312u> m30315b() {
            return this.itemViewState;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsAdjacentToInfoCallout() {
            return this.isAdjacentToInfoCallout;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.itemViewState, aVar.itemViewState) && this.insetBottom == aVar.insetBottom && this.isAdjacentToInfoCallout == aVar.isAdjacentToInfoCallout;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isAdjacentToInfoCallout) + ((this.insetBottom.hashCode() + (this.itemViewState.hashCode() * 31)) * 31);
        }

        public String toString() {
            List<InterfaceC25312u> list = this.itemViewState;
            DeepDiveSectionSpacingType deepDiveSectionSpacingType = this.insetBottom;
            boolean z4 = this.isAdjacentToInfoCallout;
            StringBuilder sb4 = new StringBuilder("ComponentItem(itemViewState=");
            sb4.append(list);
            sb4.append(", insetBottom=");
            sb4.append(deepDiveSectionSpacingType);
            sb4.append(", isAdjacentToInfoCallout=");
            return AbstractC18489d0.m53372m(sb4, z4, ")");
        }
    }

    /* JADX INFO: renamed from: cy0.c$b */
    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001a\u0010'R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010(\u001a\u0004\b\"\u0010)R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010(\u001a\u0004\b$\u0010)¨\u0006*"}, m65681d2 = {"Lcy0/c$b;", "", "Lgz0/m0;", "leftIcon", "Lcom/whoop/design/util/TextResource;", "title", "leftIconContentDescription", "rightIconContentDescription", "rightIcon", "Lm91/u;", "endItem", "Lcy0/a;", "onLeftClick", "onRightClick", "<init>", "(Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lm91/u;Lcy0/a;Lcy0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgz0/m0;", "b", "()Lgz0/m0;", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "c", "d", "g", "e", "f", "Lm91/u;", "()Lm91/u;", "Lcy0/a;", "()Lcy0/a;", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC16313m0 leftIcon;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource leftIconContentDescription;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource rightIconContentDescription;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final EnumC16313m0 rightIcon;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final InterfaceC25312u endItem;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final InterfaceC11182a onLeftClick;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final InterfaceC11182a onRightClick;

        public b(EnumC16313m0 leftIcon, TextResource title, TextResource leftIconContentDescription, TextResource rightIconContentDescription, EnumC16313m0 rightIcon, InterfaceC25312u interfaceC25312u, InterfaceC11182a onLeftClick, InterfaceC11182a onRightClick) {
            AbstractC22676k.m65750j(leftIcon, "leftIcon");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(leftIconContentDescription, "leftIconContentDescription");
            AbstractC22676k.m65750j(rightIconContentDescription, "rightIconContentDescription");
            AbstractC22676k.m65750j(rightIcon, "rightIcon");
            AbstractC22676k.m65750j(onLeftClick, "onLeftClick");
            AbstractC22676k.m65750j(onRightClick, "onRightClick");
            this.leftIcon = leftIcon;
            this.title = title;
            this.leftIconContentDescription = leftIconContentDescription;
            this.rightIconContentDescription = rightIconContentDescription;
            this.rightIcon = rightIcon;
            this.endItem = interfaceC25312u;
            this.onLeftClick = onLeftClick;
            this.onRightClick = onRightClick;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC25312u getEndItem() {
            return this.endItem;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final EnumC16313m0 getLeftIcon() {
            return this.leftIcon;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getLeftIconContentDescription() {
            return this.leftIconContentDescription;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final InterfaceC11182a getOnLeftClick() {
            return this.onLeftClick;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final InterfaceC11182a getOnRightClick() {
            return this.onRightClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.leftIcon == bVar.leftIcon && AbstractC22676k.m65745e(this.title, bVar.title) && AbstractC22676k.m65745e(this.leftIconContentDescription, bVar.leftIconContentDescription) && AbstractC22676k.m65745e(this.rightIconContentDescription, bVar.rightIconContentDescription) && this.rightIcon == bVar.rightIcon && AbstractC22676k.m65745e(this.endItem, bVar.endItem) && AbstractC22676k.m65745e(this.onLeftClick, bVar.onLeftClick) && AbstractC22676k.m65745e(this.onRightClick, bVar.onRightClick);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final EnumC16313m0 getRightIcon() {
            return this.rightIcon;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final TextResource getRightIconContentDescription() {
            return this.rightIconContentDescription;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iM48500b = AbstractC17176i.m48500b(this.rightIcon, AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.leftIcon.hashCode() * 31, this.title, 31), this.leftIconContentDescription, 31), this.rightIconContentDescription, 31), 31);
            InterfaceC25312u interfaceC25312u = this.endItem;
            return this.onRightClick.hashCode() + ((this.onLeftClick.hashCode() + ((iM48500b + (interfaceC25312u == null ? 0 : interfaceC25312u.hashCode())) * 31)) * 31);
        }

        public String toString() {
            EnumC16313m0 enumC16313m0 = this.leftIcon;
            TextResource textResource = this.title;
            TextResource textResource2 = this.leftIconContentDescription;
            TextResource textResource3 = this.rightIconContentDescription;
            EnumC16313m0 enumC16313m1 = this.rightIcon;
            InterfaceC25312u interfaceC25312u = this.endItem;
            InterfaceC11182a interfaceC11182a = this.onLeftClick;
            InterfaceC11182a interfaceC11182a2 = this.onRightClick;
            StringBuilder sb4 = new StringBuilder("DeepDiveToolbar(leftIcon=");
            sb4.append(enumC16313m0);
            sb4.append(", title=");
            sb4.append(textResource);
            sb4.append(", leftIconContentDescription=");
            AbstractC30007c.m91855y(sb4, textResource2, ", rightIconContentDescription=", textResource3, ", rightIcon=");
            sb4.append(enumC16313m1);
            sb4.append(", endItem=");
            sb4.append(interfaceC25312u);
            sb4.append(", onLeftClick=");
            sb4.append(interfaceC11182a);
            sb4.append(", onRightClick=");
            sb4.append(interfaceC11182a2);
            sb4.append(")");
            return sb4.toString();
        }
    }

    /* JADX INFO: renamed from: cy0.c$d */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u0017\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b\u001a\u0010$¨\u0006%"}, m65681d2 = {"Lcy0/c$d;", "", "", "source", "Lcy0/c$b;", "toolbar", "", "Lcy0/c$a;", "items", "", "isInHomeCalibrationExperimentTestGroup", "Lep0/j;", "screenContextMetadata", "<init>", "(Ljava/lang/String;Lcy0/c$b;Ljava/util/List;ZLep0/j;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lcy0/c$b;", "d", "()Lcy0/c$b;", "Ljava/util/List;", "()Ljava/util/List;", "Z", "e", "()Z", "Lep0/j;", "()Lep0/j;", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String source;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final b toolbar;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<a> items;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean isInHomeCalibrationExperimentTestGroup;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C13404j screenContextMetadata;

        public d(String source, b toolbar, List<a> items, boolean z4, C13404j c13404j) {
            AbstractC22676k.m65750j(source, "source");
            AbstractC22676k.m65750j(toolbar, "toolbar");
            AbstractC22676k.m65750j(items, "items");
            this.source = source;
            this.toolbar = toolbar;
            this.items = items;
            this.isInHomeCalibrationExperimentTestGroup = z4;
            this.screenContextMetadata = c13404j;
        }

        /* JADX INFO: renamed from: a */
        public final List<a> m30329a() {
            return this.items;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C13404j getScreenContextMetadata() {
            return this.screenContextMetadata;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final b getToolbar() {
            return this.toolbar;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsInHomeCalibrationExperimentTestGroup() {
            return this.isInHomeCalibrationExperimentTestGroup;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.source, dVar.source) && AbstractC22676k.m65745e(this.toolbar, dVar.toolbar) && AbstractC22676k.m65745e(this.items, dVar.items) && this.isInHomeCalibrationExperimentTestGroup == dVar.isInHomeCalibrationExperimentTestGroup && AbstractC22676k.m65745e(this.screenContextMetadata, dVar.screenContextMetadata);
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(AbstractC11895b.m31983b((this.toolbar.hashCode() + (this.source.hashCode() * 31)) * 31, 31, this.items), 31, this.isInHomeCalibrationExperimentTestGroup);
            C13404j c13404j = this.screenContextMetadata;
            return iM8289b + (c13404j == null ? 0 : c13404j.hashCode());
        }

        public String toString() {
            String str = this.source;
            b bVar = this.toolbar;
            List<a> list = this.items;
            boolean z4 = this.isInHomeCalibrationExperimentTestGroup;
            C13404j c13404j = this.screenContextMetadata;
            StringBuilder sb4 = new StringBuilder("ScreenContent(source=");
            sb4.append(str);
            sb4.append(", toolbar=");
            sb4.append(bVar);
            sb4.append(", items=");
            AbstractC26725a.m79512p(", isInHomeCalibrationExperimentTestGroup=", ", screenContextMetadata=", sb4, list, z4);
            sb4.append(c13404j);
            sb4.append(")");
            return sb4.toString();
        }
    }

    public C11184c(C34188a c34188a, c cVar, d dVar) {
        this.bottomSheet = c34188a;
        this.fullScreenModal = cVar;
        this.screenContent = dVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C34188a getBottomSheet() {
        return this.bottomSheet;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getFullScreenModal() {
        return this.fullScreenModal;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getScreenContent() {
        return this.screenContent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11184c)) {
            return false;
        }
        C11184c c11184c = (C11184c) other;
        return AbstractC22676k.m65745e(this.bottomSheet, c11184c.bottomSheet) && AbstractC22676k.m65745e(this.fullScreenModal, c11184c.fullScreenModal) && AbstractC22676k.m65745e(this.screenContent, c11184c.screenContent);
    }

    public int hashCode() {
        C34188a c34188a = this.bottomSheet;
        int iHashCode = (c34188a == null ? 0 : c34188a.hashCode()) * 31;
        c cVar = this.fullScreenModal;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        d dVar = this.screenContent;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }

    public String toString() {
        return "DeepDiveViewState(bottomSheet=" + this.bottomSheet + ", fullScreenModal=" + this.fullScreenModal + ", screenContent=" + this.screenContent + ")";
    }

    /* JADX INFO: renamed from: cy0.c$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lcy0/c$c;", "", "Lsz0/q0;", "state", "Lcy0/a;", "primaryClickEvent", "secondaryClickEvent", "backClickEvent", "<init>", "(Lsz0/q0;Lcy0/a;Lcy0/a;Lcy0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/q0;", "d", "()Lsz0/q0;", "b", "Lcy0/a;", "()Lcy0/a;", "c", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: e */
        public static final int f35864e = C33211q0.f138501k;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C33211q0 state;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC11182a primaryClickEvent;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC11182a secondaryClickEvent;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC11182a backClickEvent;

        public c(C33211q0 state, InterfaceC11182a interfaceC11182a, InterfaceC11182a interfaceC11182a2, InterfaceC11182a interfaceC11182a3) {
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
            this.primaryClickEvent = interfaceC11182a;
            this.secondaryClickEvent = interfaceC11182a2;
            this.backClickEvent = interfaceC11182a3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC11182a getBackClickEvent() {
            return this.backClickEvent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC11182a getPrimaryClickEvent() {
            return this.primaryClickEvent;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC11182a getSecondaryClickEvent() {
            return this.secondaryClickEvent;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C33211q0 getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.state, cVar.state) && AbstractC22676k.m65745e(this.primaryClickEvent, cVar.primaryClickEvent) && AbstractC22676k.m65745e(this.secondaryClickEvent, cVar.secondaryClickEvent) && AbstractC22676k.m65745e(this.backClickEvent, cVar.backClickEvent);
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            InterfaceC11182a interfaceC11182a = this.primaryClickEvent;
            int iHashCode2 = (iHashCode + (interfaceC11182a == null ? 0 : interfaceC11182a.hashCode())) * 31;
            InterfaceC11182a interfaceC11182a2 = this.secondaryClickEvent;
            int iHashCode3 = (iHashCode2 + (interfaceC11182a2 == null ? 0 : interfaceC11182a2.hashCode())) * 31;
            InterfaceC11182a interfaceC11182a3 = this.backClickEvent;
            return iHashCode3 + (interfaceC11182a3 != null ? interfaceC11182a3.hashCode() : 0);
        }

        public String toString() {
            return "FullScreenModal(state=" + this.state + ", primaryClickEvent=" + this.primaryClickEvent + ", secondaryClickEvent=" + this.secondaryClickEvent + ", backClickEvent=" + this.backClickEvent + ")";
        }

        public /* synthetic */ c(C33211q0 c33211q0, InterfaceC11182a interfaceC11182a, InterfaceC11182a interfaceC11182a2, InterfaceC11182a interfaceC11182a3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c33211q0, (i13 & 2) != 0 ? null : interfaceC11182a, (i13 & 4) != 0 ? null : interfaceC11182a2, (i13 & 8) != 0 ? null : interfaceC11182a3);
        }
    }

    public /* synthetic */ C11184c(C34188a c34188a, c cVar, d dVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : c34188a, (i13 & 2) != 0 ? null : cVar, (i13 & 4) != 0 ? null : dVar);
    }
}
