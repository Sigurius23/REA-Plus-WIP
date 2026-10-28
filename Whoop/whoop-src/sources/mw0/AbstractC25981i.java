package mw0;

import c41.C4141w2;
import com.whoop.design.util.TextResource;
import ep0.C13404j;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j71.C21395c;
import java.util.List;
import k71.C22257n;
import l83.C23465k;
import no.nordicsemi.android.dfu.DfuBaseService;
import nw0.AbstractC27201h;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import vz0.C36613b;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: mw0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lmw0/i;", "", "<init>", "()V", "d", "e", "c", "a", "b", "Lmw0/i$a;", "Lmw0/i$b;", "Lmw0/i$c;", "Lmw0/i$d;", "Lmw0/i$e;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25981i {

    /* JADX INFO: renamed from: mw0.i$a */
    @Metadata(m65680d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001BÁ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u00142\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b-\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b9\u00103\u001a\u0004\b;\u00105R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b<\u00103\u001a\u0004\b<\u00105R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b;\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b2\u0010BR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b@\u0010ER\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b>\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b0\u0010F\u001a\u0004\bI\u0010HR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b4\u0010J\u001a\u0004\b6\u0010KR%\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b7\u0010L\u001a\u0004\b.\u0010MR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\bG\u0010N\u001a\u0004\b+\u0010OR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\bI\u0010P\u001a\u0004\bC\u0010Q¨\u0006R"}, m65681d2 = {"Lmw0/i$a;", "Lmw0/i;", "", "mainIcon", "Lmw0/l;", "statsSectionState", "Lcom/whoop/design/util/TextResource;", "toolbarTimeWindowText", "toolbarTitle", "", "Lc41/w2;", "metricsCarousel", "metricsTitle", "metricsSubtitle", "Lnw0/h;", "showDialog", "Lk71/n;", "heartRateBarGraphContainerState", "Lmw0/a;", "missingHrData", "", "isNap", "isNapToSleepAvailable", "Lj71/c;", "hrGraphState", "Ll83/k;", "Lorg/joda/time/LocalDateTime;", "editBounds", "Lvz0/b;", "additionalInfoText", "Lep0/j;", "screenContextMetadata", "<init>", "(ILmw0/l;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lnw0/h;Lk71/n;Lmw0/a;ZZLj71/c;Ll83/k;Lvz0/b;Lep0/j;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "e", "b", "Lmw0/l;", "l", "()Lmw0/l;", "c", "Lcom/whoop/design/util/TextResource;", "m", "()Lcom/whoop/design/util/TextResource;", "d", "n", "Ljava/util/List;", "f", "()Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "Lnw0/h;", "k", "()Lnw0/h;", "i", "Lk71/n;", "()Lk71/n;", "j", "Lmw0/a;", "()Lmw0/a;", "Z", "o", "()Z", "p", "Lj71/c;", "()Lj71/c;", "Ll83/k;", "()Ll83/k;", "Lvz0/b;", "()Lvz0/b;", "Lep0/j;", "()Lep0/j;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC25981i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int mainIcon;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C25984l statsSectionState;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource toolbarTimeWindowText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource toolbarTitle;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final List<C4141w2> metricsCarousel;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final TextResource metricsTitle;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final TextResource metricsSubtitle;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final AbstractC27201h showDialog;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final C22257n heartRateBarGraphContainerState;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final C25973a missingHrData;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final boolean isNap;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final boolean isNapToSleepAvailable;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final C21395c hrGraphState;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final C23465k editBounds;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final C36613b additionalInfoText;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private final C13404j screenContextMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i13, C25984l statsSectionState, TextResource textResource, TextResource textResource2, List<C4141w2> metricsCarousel, TextResource metricsTitle, TextResource metricsSubtitle, AbstractC27201h abstractC27201h, C22257n c22257n, C25973a c25973a, boolean z4, boolean z13, C21395c hrGraphState, C23465k c23465k, C36613b c36613b, C13404j c13404j) {
            super(null);
            AbstractC22676k.m65750j(statsSectionState, "statsSectionState");
            AbstractC22676k.m65750j(metricsCarousel, "metricsCarousel");
            AbstractC22676k.m65750j(metricsTitle, "metricsTitle");
            AbstractC22676k.m65750j(metricsSubtitle, "metricsSubtitle");
            AbstractC22676k.m65750j(hrGraphState, "hrGraphState");
            this.mainIcon = i13;
            this.statsSectionState = statsSectionState;
            this.toolbarTimeWindowText = textResource;
            this.toolbarTitle = textResource2;
            this.metricsCarousel = metricsCarousel;
            this.metricsTitle = metricsTitle;
            this.metricsSubtitle = metricsSubtitle;
            this.showDialog = abstractC27201h;
            this.heartRateBarGraphContainerState = c22257n;
            this.missingHrData = c25973a;
            this.isNap = z4;
            this.isNapToSleepAvailable = z13;
            this.hrGraphState = hrGraphState;
            this.editBounds = c23465k;
            this.additionalInfoText = c36613b;
            this.screenContextMetadata = c13404j;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C36613b getAdditionalInfoText() {
            return this.additionalInfoText;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C23465k getEditBounds() {
            return this.editBounds;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C22257n getHeartRateBarGraphContainerState() {
            return this.heartRateBarGraphContainerState;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C21395c getHrGraphState() {
            return this.hrGraphState;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getMainIcon() {
            return this.mainIcon;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.mainIcon == aVar.mainIcon && AbstractC22676k.m65745e(this.statsSectionState, aVar.statsSectionState) && AbstractC22676k.m65745e(this.toolbarTimeWindowText, aVar.toolbarTimeWindowText) && AbstractC22676k.m65745e(this.toolbarTitle, aVar.toolbarTitle) && AbstractC22676k.m65745e(this.metricsCarousel, aVar.metricsCarousel) && AbstractC22676k.m65745e(this.metricsTitle, aVar.metricsTitle) && AbstractC22676k.m65745e(this.metricsSubtitle, aVar.metricsSubtitle) && AbstractC22676k.m65745e(this.showDialog, aVar.showDialog) && AbstractC22676k.m65745e(this.heartRateBarGraphContainerState, aVar.heartRateBarGraphContainerState) && AbstractC22676k.m65745e(this.missingHrData, aVar.missingHrData) && this.isNap == aVar.isNap && this.isNapToSleepAvailable == aVar.isNapToSleepAvailable && AbstractC22676k.m65745e(this.hrGraphState, aVar.hrGraphState) && AbstractC22676k.m65745e(this.editBounds, aVar.editBounds) && AbstractC22676k.m65745e(this.additionalInfoText, aVar.additionalInfoText) && AbstractC22676k.m65745e(this.screenContextMetadata, aVar.screenContextMetadata);
        }

        /* JADX INFO: renamed from: f */
        public final List<C4141w2> m77044f() {
            return this.metricsCarousel;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final TextResource getMetricsSubtitle() {
            return this.metricsSubtitle;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final TextResource getMetricsTitle() {
            return this.metricsTitle;
        }

        public int hashCode() {
            int iHashCode = (this.statsSectionState.hashCode() + (Integer.hashCode(this.mainIcon) * 31)) * 31;
            TextResource textResource = this.toolbarTimeWindowText;
            int iHashCode2 = (iHashCode + (textResource == null ? 0 : textResource.hashCode())) * 31;
            TextResource textResource2 = this.toolbarTitle;
            int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11895b.m31983b((iHashCode2 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31, 31, this.metricsCarousel), this.metricsTitle, 31), this.metricsSubtitle, 31);
            AbstractC27201h abstractC27201h = this.showDialog;
            int iHashCode3 = (iM95625a + (abstractC27201h == null ? 0 : abstractC27201h.hashCode())) * 31;
            C22257n c22257n = this.heartRateBarGraphContainerState;
            int iHashCode4 = (iHashCode3 + (c22257n == null ? 0 : c22257n.hashCode())) * 31;
            C25973a c25973a = this.missingHrData;
            int iHashCode5 = (this.hrGraphState.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode4 + (c25973a == null ? 0 : c25973a.hashCode())) * 31, 31, this.isNap), 31, this.isNapToSleepAvailable)) * 31;
            C23465k c23465k = this.editBounds;
            int iHashCode6 = (iHashCode5 + (c23465k == null ? 0 : c23465k.hashCode())) * 31;
            C36613b c36613b = this.additionalInfoText;
            int iHashCode7 = (iHashCode6 + (c36613b == null ? 0 : c36613b.hashCode())) * 31;
            C13404j c13404j = this.screenContextMetadata;
            return iHashCode7 + (c13404j != null ? c13404j.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final C25973a getMissingHrData() {
            return this.missingHrData;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final C13404j getScreenContextMetadata() {
            return this.screenContextMetadata;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final AbstractC27201h getShowDialog() {
            return this.showDialog;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final C25984l getStatsSectionState() {
            return this.statsSectionState;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final TextResource getToolbarTimeWindowText() {
            return this.toolbarTimeWindowText;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final TextResource getToolbarTitle() {
            return this.toolbarTitle;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final boolean getIsNap() {
            return this.isNap;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final boolean getIsNapToSleepAvailable() {
            return this.isNapToSleepAvailable;
        }

        public String toString() {
            int i13 = this.mainIcon;
            C25984l c25984l = this.statsSectionState;
            TextResource textResource = this.toolbarTimeWindowText;
            TextResource textResource2 = this.toolbarTitle;
            List<C4141w2> list = this.metricsCarousel;
            TextResource textResource3 = this.metricsTitle;
            TextResource textResource4 = this.metricsSubtitle;
            AbstractC27201h abstractC27201h = this.showDialog;
            C22257n c22257n = this.heartRateBarGraphContainerState;
            C25973a c25973a = this.missingHrData;
            boolean z4 = this.isNap;
            boolean z13 = this.isNapToSleepAvailable;
            C21395c c21395c = this.hrGraphState;
            C23465k c23465k = this.editBounds;
            C36613b c36613b = this.additionalInfoText;
            C13404j c13404j = this.screenContextMetadata;
            StringBuilder sb4 = new StringBuilder("Complete(mainIcon=");
            sb4.append(i13);
            sb4.append(", statsSectionState=");
            sb4.append(c25984l);
            sb4.append(", toolbarTimeWindowText=");
            AbstractC30007c.m91855y(sb4, textResource, ", toolbarTitle=", textResource2, ", metricsCarousel=");
            AbstractC30007c.m91852v(textResource3, ", metricsTitle=", ", metricsSubtitle=", sb4, list);
            sb4.append(textResource4);
            sb4.append(", showDialog=");
            sb4.append(abstractC27201h);
            sb4.append(", heartRateBarGraphContainerState=");
            sb4.append(c22257n);
            sb4.append(", missingHrData=");
            sb4.append(c25973a);
            sb4.append(", isNap=");
            AbstractC38963t7.m124392v(sb4, z4, ", isNapToSleepAvailable=", z13, ", hrGraphState=");
            sb4.append(c21395c);
            sb4.append(", editBounds=");
            sb4.append(c23465k);
            sb4.append(", additionalInfoText=");
            sb4.append(c36613b);
            sb4.append(", screenContextMetadata=");
            sb4.append(c13404j);
            sb4.append(")");
            return sb4.toString();
        }
    }

    /* JADX INFO: renamed from: mw0.i$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\n¨\u0006\u0019"}, m65681d2 = {"Lmw0/i$b;", "Lmw0/i;", "Lcom/whoop/design/util/TextResource;", "errorTitle", "errorBody", "", "sleepIdV2", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "c", "Ljava/lang/String;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC25981i {

        /* JADX INFO: renamed from: d */
        public static final int f102661d = TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource errorTitle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource errorBody;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String sleepIdV2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TextResource errorTitle, TextResource errorBody, String sleepIdV2) {
            super(null);
            AbstractC22676k.m65750j(errorTitle, "errorTitle");
            AbstractC22676k.m65750j(errorBody, "errorBody");
            AbstractC22676k.m65750j(sleepIdV2, "sleepIdV2");
            this.errorTitle = errorTitle;
            this.errorBody = errorBody;
            this.sleepIdV2 = sleepIdV2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextResource getErrorBody() {
            return this.errorBody;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextResource getErrorTitle() {
            return this.errorTitle;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSleepIdV2() {
            return this.sleepIdV2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.errorTitle, bVar.errorTitle) && AbstractC22676k.m65745e(this.errorBody, bVar.errorBody) && AbstractC22676k.m65745e(this.sleepIdV2, bVar.sleepIdV2);
        }

        public int hashCode() {
            return this.sleepIdV2.hashCode() + AbstractC31061c.m95625a(this.errorTitle.hashCode() * 31, this.errorBody, 31);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.sleepIdV2, ")", AbstractC33745d.m106658q("Failure(errorTitle=", this.errorTitle, ", errorBody=", this.errorBody, ", sleepIdV2="));
        }
    }

    /* JADX INFO: renamed from: mw0.i$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lmw0/i$d;", "Lmw0/i;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC25981i {

        /* JADX INFO: renamed from: a */
        public static final d f102677a = new d();

        private d() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: mw0.i$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lmw0/i$e;", "Lmw0/i;", "<init>", "()V", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC25981i {

        /* JADX INFO: renamed from: a */
        public static final e f102678a = new e();

        private e() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC25981i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC25981i() {
    }

    /* JADX INFO: renamed from: mw0.i$c */
    @Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b/\u00102R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b.\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b)\u00108R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b4\u00109\u001a\u0004\b6\u0010:R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b'\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b+\u0010;\u001a\u0004\b>\u0010=R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b<\u0010?\u001a\u0004\b-\u0010@R%\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b>\u0010A\u001a\u0004\b%\u0010B¨\u0006C"}, m65681d2 = {"Lmw0/i$c;", "Lmw0/i;", "Lmw0/l;", "statsSectionState", "Lcom/whoop/design/util/TextResource;", "toolbarTitle", "metricsTitle", "metricsSubtitle", "", "Lc41/w2;", "metricsCarousel", "Lnw0/h;", "showDialog", "Lk71/n;", "heartRateBarGraphContainerState", "Lmw0/a;", "missingHrData", "", "isNap", "isNapToSleepAvailable", "Lj71/c;", "hrGraphState", "Ll83/k;", "Lorg/joda/time/LocalDateTime;", "editBounds", "<init>", "(Lmw0/l;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lnw0/h;Lk71/n;Lmw0/a;ZZLj71/c;Ll83/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lmw0/l;", "i", "()Lmw0/l;", "b", "Lcom/whoop/design/util/TextResource;", "j", "()Lcom/whoop/design/util/TextResource;", "c", "f", "d", "e", "Ljava/util/List;", "()Ljava/util/List;", "Lnw0/h;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lnw0/h;", "g", "Lk71/n;", "()Lk71/n;", "Lmw0/a;", "()Lmw0/a;", "Z", "k", "()Z", "l", "Lj71/c;", "()Lj71/c;", "Ll83/k;", "()Ll83/k;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC25981i {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C25984l statsSectionState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource toolbarTitle;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource metricsTitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource metricsSubtitle;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final List<C4141w2> metricsCarousel;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final AbstractC27201h showDialog;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final C22257n heartRateBarGraphContainerState;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final C25973a missingHrData;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final boolean isNap;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final boolean isNapToSleepAvailable;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final C21395c hrGraphState;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final C23465k editBounds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C25984l statsSectionState, TextResource toolbarTitle, TextResource metricsTitle, TextResource metricsSubtitle, List<C4141w2> metricsCarousel, AbstractC27201h abstractC27201h, C22257n c22257n, C25973a c25973a, boolean z4, boolean z13, C21395c hrGraphState, C23465k c23465k) {
            super(null);
            AbstractC22676k.m65750j(statsSectionState, "statsSectionState");
            AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
            AbstractC22676k.m65750j(metricsTitle, "metricsTitle");
            AbstractC22676k.m65750j(metricsSubtitle, "metricsSubtitle");
            AbstractC22676k.m65750j(metricsCarousel, "metricsCarousel");
            AbstractC22676k.m65750j(hrGraphState, "hrGraphState");
            this.statsSectionState = statsSectionState;
            this.toolbarTitle = toolbarTitle;
            this.metricsTitle = metricsTitle;
            this.metricsSubtitle = metricsSubtitle;
            this.metricsCarousel = metricsCarousel;
            this.showDialog = abstractC27201h;
            this.heartRateBarGraphContainerState = c22257n;
            this.missingHrData = c25973a;
            this.isNap = z4;
            this.isNapToSleepAvailable = z13;
            this.hrGraphState = hrGraphState;
            this.editBounds = c23465k;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C23465k getEditBounds() {
            return this.editBounds;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C22257n getHeartRateBarGraphContainerState() {
            return this.heartRateBarGraphContainerState;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C21395c getHrGraphState() {
            return this.hrGraphState;
        }

        /* JADX INFO: renamed from: d */
        public final List<C4141w2> m77061d() {
            return this.metricsCarousel;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final TextResource getMetricsSubtitle() {
            return this.metricsSubtitle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.statsSectionState, cVar.statsSectionState) && AbstractC22676k.m65745e(this.toolbarTitle, cVar.toolbarTitle) && AbstractC22676k.m65745e(this.metricsTitle, cVar.metricsTitle) && AbstractC22676k.m65745e(this.metricsSubtitle, cVar.metricsSubtitle) && AbstractC22676k.m65745e(this.metricsCarousel, cVar.metricsCarousel) && AbstractC22676k.m65745e(this.showDialog, cVar.showDialog) && AbstractC22676k.m65745e(this.heartRateBarGraphContainerState, cVar.heartRateBarGraphContainerState) && AbstractC22676k.m65745e(this.missingHrData, cVar.missingHrData) && this.isNap == cVar.isNap && this.isNapToSleepAvailable == cVar.isNapToSleepAvailable && AbstractC22676k.m65745e(this.hrGraphState, cVar.hrGraphState) && AbstractC22676k.m65745e(this.editBounds, cVar.editBounds);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextResource getMetricsTitle() {
            return this.metricsTitle;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final C25973a getMissingHrData() {
            return this.missingHrData;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final AbstractC27201h getShowDialog() {
            return this.showDialog;
        }

        public int hashCode() {
            int iM31983b = AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.statsSectionState.hashCode() * 31, this.toolbarTitle, 31), this.metricsTitle, 31), this.metricsSubtitle, 31), 31, this.metricsCarousel);
            AbstractC27201h abstractC27201h = this.showDialog;
            int iHashCode = (iM31983b + (abstractC27201h == null ? 0 : abstractC27201h.hashCode())) * 31;
            C22257n c22257n = this.heartRateBarGraphContainerState;
            int iHashCode2 = (iHashCode + (c22257n == null ? 0 : c22257n.hashCode())) * 31;
            C25973a c25973a = this.missingHrData;
            int iHashCode3 = (this.hrGraphState.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode2 + (c25973a == null ? 0 : c25973a.hashCode())) * 31, 31, this.isNap), 31, this.isNapToSleepAvailable)) * 31;
            C23465k c23465k = this.editBounds;
            return iHashCode3 + (c23465k != null ? c23465k.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final C25984l getStatsSectionState() {
            return this.statsSectionState;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final TextResource getToolbarTitle() {
            return this.toolbarTitle;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final boolean getIsNap() {
            return this.isNap;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final boolean getIsNapToSleepAvailable() {
            return this.isNapToSleepAvailable;
        }

        public String toString() {
            C25984l c25984l = this.statsSectionState;
            TextResource textResource = this.toolbarTitle;
            TextResource textResource2 = this.metricsTitle;
            TextResource textResource3 = this.metricsSubtitle;
            List<C4141w2> list = this.metricsCarousel;
            AbstractC27201h abstractC27201h = this.showDialog;
            C22257n c22257n = this.heartRateBarGraphContainerState;
            C25973a c25973a = this.missingHrData;
            boolean z4 = this.isNap;
            boolean z13 = this.isNapToSleepAvailable;
            C21395c c21395c = this.hrGraphState;
            C23465k c23465k = this.editBounds;
            StringBuilder sb4 = new StringBuilder("IncompleteSleep(statsSectionState=");
            sb4.append(c25984l);
            sb4.append(", toolbarTitle=");
            sb4.append(textResource);
            sb4.append(", metricsTitle=");
            AbstractC30007c.m91855y(sb4, textResource2, ", metricsSubtitle=", textResource3, ", metricsCarousel=");
            sb4.append(list);
            sb4.append(", showDialog=");
            sb4.append(abstractC27201h);
            sb4.append(", heartRateBarGraphContainerState=");
            sb4.append(c22257n);
            sb4.append(", missingHrData=");
            sb4.append(c25973a);
            sb4.append(", isNap=");
            AbstractC38963t7.m124392v(sb4, z4, ", isNapToSleepAvailable=", z13, ", hrGraphState=");
            sb4.append(c21395c);
            sb4.append(", editBounds=");
            sb4.append(c23465k);
            sb4.append(")");
            return sb4.toString();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ c(C25984l c25984l, TextResource textResource, TextResource textResource2, TextResource textResource3, List list, AbstractC27201h abstractC27201h, C22257n c22257n, C25973a c25973a, boolean z4, boolean z13, C21395c c21395c, C23465k c23465k, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            AbstractC27201h abstractC27201h2 = (i13 & 32) != 0 ? null : abstractC27201h;
            C22257n c22257n2 = (i13 & 64) != 0 ? null : c22257n;
            C25973a c25973a2 = (i13 & 128) != 0 ? null : c25973a;
            boolean z14 = (i13 & 256) != 0 ? false : z4;
            this(c25984l, textResource, textResource2, textResource3, list, abstractC27201h2, c22257n2, c25973a2, z14, (i13 & 512) != 0 ? z14 : z13, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? new C21395c(null, null, null, null, 15, null) : c21395c, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : c23465k);
        }
    }
}
