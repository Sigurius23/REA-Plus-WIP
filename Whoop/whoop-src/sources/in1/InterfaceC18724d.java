package in1;

import com.whoop.design.util.TextResource;
import dn1.EnumC12223g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: in1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lin1/d;", "", "b", "c", "a", "Lin1/d$a;", "Lin1/d$b;", "Lin1/d$c;", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC18724d {

    /* JADX INFO: renamed from: in1.d$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lin1/d$a;", "Lin1/d;", "Ldn1/g;", "errorType", "<init>", "(Ldn1/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldn1/g;", "()Ldn1/g;", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC18724d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC12223g errorType;

        public a(EnumC12223g errorType) {
            AbstractC22676k.m65750j(errorType, "errorType");
            this.errorType = errorType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC12223g getErrorType() {
            return this.errorType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.errorType == ((a) other).errorType;
        }

        public int hashCode() {
            return this.errorType.hashCode();
        }

        public String toString() {
            return "Error(errorType=" + this.errorType + ")";
        }
    }

    /* JADX INFO: renamed from: in1.d$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lin1/d$b;", "Lin1/d;", "<init>", "()V", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC18724d {

        /* JADX INFO: renamed from: a */
        public static final b f73582a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: in1.d$c */
    @Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010!R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b#\u0010&\u001a\u0004\b\u001b\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b$\u0010*R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b\"\u0010,¨\u0006-"}, m65681d2 = {"Lin1/d$c;", "Lin1/d;", "Lcom/whoop/design/util/TextResource;", "toolbarHeader", "Lin1/h;", "placeholderGaugeViewState", "Lin1/f;", "pinnedSection", "unpinnedSection", "primaryButtonText", "Lin1/e;", "editableGaugeMetricsViewState", "Lin1/g;", "savingState", "<init>", "(Lcom/whoop/design/util/TextResource;Lin1/h;Lin1/f;Lin1/f;Lcom/whoop/design/util/TextResource;Lin1/e;Lin1/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "getToolbarHeader", "()Lcom/whoop/design/util/TextResource;", "b", "Lin1/f;", "()Lin1/f;", "c", "e", "d", "getPrimaryButtonText", "Lin1/e;", "()Lin1/e;", "f", "Lin1/g;", "()Lin1/g;", "Lin1/h;", "()Lin1/h;", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC18724d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource toolbarHeader;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C18726f pinnedSection;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C18726f unpinnedSection;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource primaryButtonText;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C18725e editableGaugeMetricsViewState;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final EnumC18727g savingState;

        public c(TextResource toolbarHeader, AbstractC18728h abstractC18728h, C18726f pinnedSection, C18726f unpinnedSection, TextResource primaryButtonText, C18725e editableGaugeMetricsViewState, EnumC18727g enumC18727g) {
            AbstractC22676k.m65750j(toolbarHeader, "toolbarHeader");
            AbstractC22676k.m65750j(pinnedSection, "pinnedSection");
            AbstractC22676k.m65750j(unpinnedSection, "unpinnedSection");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            AbstractC22676k.m65750j(editableGaugeMetricsViewState, "editableGaugeMetricsViewState");
            this.toolbarHeader = toolbarHeader;
            this.pinnedSection = pinnedSection;
            this.unpinnedSection = unpinnedSection;
            this.primaryButtonText = primaryButtonText;
            this.editableGaugeMetricsViewState = editableGaugeMetricsViewState;
            this.savingState = enumC18727g;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C18725e getEditableGaugeMetricsViewState() {
            return this.editableGaugeMetricsViewState;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C18726f getPinnedSection() {
            return this.pinnedSection;
        }

        /* JADX INFO: renamed from: c */
        public final AbstractC18728h m54457c() {
            return null;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final EnumC18727g getSavingState() {
            return this.savingState;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C18726f getUnpinnedSection() {
            return this.unpinnedSection;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.toolbarHeader, cVar.toolbarHeader) && AbstractC22676k.m65745e(this.pinnedSection, cVar.pinnedSection) && AbstractC22676k.m65745e(this.unpinnedSection, cVar.unpinnedSection) && AbstractC22676k.m65745e(this.primaryButtonText, cVar.primaryButtonText) && AbstractC22676k.m65745e(this.editableGaugeMetricsViewState, cVar.editableGaugeMetricsViewState) && this.savingState == cVar.savingState;
        }

        public int hashCode() {
            int iHashCode = (this.editableGaugeMetricsViewState.hashCode() + AbstractC31061c.m95625a((this.unpinnedSection.hashCode() + ((this.pinnedSection.hashCode() + (this.toolbarHeader.hashCode() * 961)) * 31)) * 31, this.primaryButtonText, 31)) * 31;
            EnumC18727g enumC18727g = this.savingState;
            return iHashCode + (enumC18727g == null ? 0 : enumC18727g.hashCode());
        }

        public String toString() {
            return "ScreenContent(toolbarHeader=" + this.toolbarHeader + ", placeholderGaugeViewState=null, pinnedSection=" + this.pinnedSection + ", unpinnedSection=" + this.unpinnedSection + ", primaryButtonText=" + this.primaryButtonText + ", editableGaugeMetricsViewState=" + this.editableGaugeMetricsViewState + ", savingState=" + this.savingState + ")";
        }
    }
}
