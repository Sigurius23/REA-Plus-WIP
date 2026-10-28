package jn1;

import com.whoop.design.util.TextResource;
import e41.C12704i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: jn1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Ljn1/d;", "", "<init>", "()V", "b", "a", "d", "c", "Ljn1/d$a;", "Ljn1/d$b;", "Ljn1/d$c;", "Ljn1/d$d;", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21805d {

    /* JADX INFO: renamed from: jn1.d$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Ljn1/d$a;", "Ljn1/d;", "Lcom/whoop/design/util/TextResource;", "title", "description", "primaryButtonText", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC21805d {

        /* JADX INFO: renamed from: d */
        public static final int f84046d = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource description;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource primaryButtonText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TextResource title, TextResource description, TextResource primaryButtonText) {
            super(null);
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(primaryButtonText, "primaryButtonText");
            this.title = title;
            this.description = description;
            this.primaryButtonText = primaryButtonText;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.title, aVar.title) && AbstractC22676k.m65745e(this.description, aVar.description) && AbstractC22676k.m65745e(this.primaryButtonText, aVar.primaryButtonText);
        }

        public int hashCode() {
            return this.primaryButtonText.hashCode() + AbstractC31061c.m95625a(this.title.hashCode() * 31, this.description, 31);
        }

        public String toString() {
            TextResource textResource = this.title;
            TextResource textResource2 = this.description;
            return AbstractC30007c.m91841k(AbstractC33745d.m106658q("Error(title=", textResource, ", description=", textResource2, ", primaryButtonText="), this.primaryButtonText, ")");
        }
    }

    /* JADX INFO: renamed from: jn1.d$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljn1/d$b;", "Ljn1/d;", "<init>", "()V", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC21805d {

        /* JADX INFO: renamed from: a */
        public static final b f84050a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: jn1.d$c */
    @Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b$\u0010#R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b%\u0010#R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001d\u0010)R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010)R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b*\u0010)R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b&\u0010,\u001a\u0004\b'\u0010-R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b.\u0010-¨\u0006/"}, m65681d2 = {"Ljn1/d$c;", "Ljn1/d;", "Ljn1/a;", "gaugeExplainerViewState", "Lcom/whoop/design/util/TextResource;", "description", "errorMessage", "pinnedKeyStatsHeader", "unpinnedKeyStatsHeader", "", "Le41/i;", "chosenKeyStats", "unchosenKeyStats", "toggleKeyStats", "", "shouldShowErrorText", "isProcessing", "<init>", "(Ljn1/a;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljn1/a;", "d", "()Ljn1/a;", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "c", "e", "i", "f", "Ljava/util/List;", "()Ljava/util/List;", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Z", "()Z", "j", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC21805d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C21802a gaugeExplainerViewState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource description;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource errorMessage;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource pinnedKeyStatsHeader;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource unpinnedKeyStatsHeader;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final List<C12704i> chosenKeyStats;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final List<C12704i> unchosenKeyStats;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final List<C12704i> toggleKeyStats;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final boolean shouldShowErrorText;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final boolean isProcessing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C21802a gaugeExplainerViewState, TextResource description, TextResource errorMessage, TextResource pinnedKeyStatsHeader, TextResource unpinnedKeyStatsHeader, List<C12704i> chosenKeyStats, List<C12704i> unchosenKeyStats, List<C12704i> toggleKeyStats, boolean z4, boolean z13) {
            super(null);
            AbstractC22676k.m65750j(gaugeExplainerViewState, "gaugeExplainerViewState");
            AbstractC22676k.m65750j(description, "description");
            AbstractC22676k.m65750j(errorMessage, "errorMessage");
            AbstractC22676k.m65750j(pinnedKeyStatsHeader, "pinnedKeyStatsHeader");
            AbstractC22676k.m65750j(unpinnedKeyStatsHeader, "unpinnedKeyStatsHeader");
            AbstractC22676k.m65750j(chosenKeyStats, "chosenKeyStats");
            AbstractC22676k.m65750j(unchosenKeyStats, "unchosenKeyStats");
            AbstractC22676k.m65750j(toggleKeyStats, "toggleKeyStats");
            this.gaugeExplainerViewState = gaugeExplainerViewState;
            this.description = description;
            this.errorMessage = errorMessage;
            this.pinnedKeyStatsHeader = pinnedKeyStatsHeader;
            this.unpinnedKeyStatsHeader = unpinnedKeyStatsHeader;
            this.chosenKeyStats = chosenKeyStats;
            this.unchosenKeyStats = unchosenKeyStats;
            this.toggleKeyStats = toggleKeyStats;
            this.shouldShowErrorText = z4;
            this.isProcessing = z13;
        }

        /* JADX INFO: renamed from: a */
        public final List<C12704i> m61722a() {
            return this.chosenKeyStats;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getErrorMessage() {
            return this.errorMessage;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C21802a getGaugeExplainerViewState() {
            return this.gaugeExplainerViewState;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextResource getPinnedKeyStatsHeader() {
            return this.pinnedKeyStatsHeader;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.gaugeExplainerViewState, cVar.gaugeExplainerViewState) && AbstractC22676k.m65745e(this.description, cVar.description) && AbstractC22676k.m65745e(this.errorMessage, cVar.errorMessage) && AbstractC22676k.m65745e(this.pinnedKeyStatsHeader, cVar.pinnedKeyStatsHeader) && AbstractC22676k.m65745e(this.unpinnedKeyStatsHeader, cVar.unpinnedKeyStatsHeader) && AbstractC22676k.m65745e(this.chosenKeyStats, cVar.chosenKeyStats) && AbstractC22676k.m65745e(this.unchosenKeyStats, cVar.unchosenKeyStats) && AbstractC22676k.m65745e(this.toggleKeyStats, cVar.toggleKeyStats) && this.shouldShowErrorText == cVar.shouldShowErrorText && this.isProcessing == cVar.isProcessing;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getShouldShowErrorText() {
            return this.shouldShowErrorText;
        }

        /* JADX INFO: renamed from: g */
        public final List<C12704i> m61728g() {
            return this.toggleKeyStats;
        }

        /* JADX INFO: renamed from: h */
        public final List<C12704i> m61729h() {
            return this.unchosenKeyStats;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isProcessing) + AbstractC2875y.m8289b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.gaugeExplainerViewState.hashCode() * 31, this.description, 31), this.errorMessage, 31), this.pinnedKeyStatsHeader, 31), this.unpinnedKeyStatsHeader, 31), 31, this.chosenKeyStats), 31, this.unchosenKeyStats), 31, this.toggleKeyStats), 31, this.shouldShowErrorText);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final TextResource getUnpinnedKeyStatsHeader() {
            return this.unpinnedKeyStatsHeader;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getIsProcessing() {
            return this.isProcessing;
        }

        public String toString() {
            C21802a c21802a = this.gaugeExplainerViewState;
            TextResource textResource = this.description;
            TextResource textResource2 = this.errorMessage;
            TextResource textResource3 = this.pinnedKeyStatsHeader;
            TextResource textResource4 = this.unpinnedKeyStatsHeader;
            List<C12704i> list = this.chosenKeyStats;
            List<C12704i> list2 = this.unchosenKeyStats;
            List<C12704i> list3 = this.toggleKeyStats;
            boolean z4 = this.shouldShowErrorText;
            boolean z13 = this.isProcessing;
            StringBuilder sb4 = new StringBuilder("Reordering(gaugeExplainerViewState=");
            sb4.append(c21802a);
            sb4.append(", description=");
            sb4.append(textResource);
            sb4.append(", errorMessage=");
            AbstractC30007c.m91855y(sb4, textResource2, ", pinnedKeyStatsHeader=", textResource3, ", unpinnedKeyStatsHeader=");
            AbstractC21702c.m61143n(textResource4, ", chosenKeyStats=", ", unchosenKeyStats=", sb4, list);
            AbstractC21702c.m61148s(sb4, list2, ", toggleKeyStats=", list3, ", shouldShowErrorText=");
            return AbstractC36095b.m114682j(sb4, z4, ", isProcessing=", z13, ")");
        }
    }

    /* JADX INFO: renamed from: jn1.d$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ljn1/d$d;", "Ljn1/d;", "<init>", "()V", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC21805d {

        /* JADX INFO: renamed from: a */
        public static final d f84061a = new d();

        private d() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC21805d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC21805d() {
    }
}
