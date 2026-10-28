package jc0;

import c41.C4092p2;
import com.whoop.advancedlabs.feature.hormonalcontext.domain.models.HormonalContextScreenId;
import com.whoop.metrics.common.ScreenState;
import fy1.InterfaceC14875k;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kd1.AbstractC22403o;
import ny0.C27256h;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: jc0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u001d\u001e\u0016\u001f\u0013B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, m65681d2 = {"Ljc0/d;", "Lfy1/k;", "Ljc0/d$a;", "fullScreenModal", "Ljc0/d$e;", "screenContent", "<init>", "(Ljc0/d$a;Ljc0/d$e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljc0/d$a;", "()Ljc0/d$a;", "c", "Ljc0/d$e;", "()Ljc0/d$e;", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "a", "e", "d", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21604d implements InterfaceC14875k {

    /* JADX INFO: renamed from: d */
    public static final int f82901d = C33211q0.f138501k;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final a fullScreenModal;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final e screenContent;

    /* JADX INFO: renamed from: jc0.d$b */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Ljc0/d$b;", "", "", "title", "content", "Lny0/h;", "primaryButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lny0/h;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lny0/h;", "()Lny0/h;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: d */
        public static final int f82909d = C27256h.f109055z;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String content;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C27256h primaryButton;

        public b(String title, String content, C27256h primaryButton) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(content, "content");
            AbstractC22676k.m65750j(primaryButton, "primaryButton");
            this.title = title;
            this.content = content;
            this.primaryButton = primaryButton;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C27256h getPrimaryButton() {
            return this.primaryButton;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.title, bVar.title) && AbstractC22676k.m65745e(this.content, bVar.content) && AbstractC22676k.m65745e(this.primaryButton, bVar.primaryButton);
        }

        public int hashCode() {
            return this.primaryButton.hashCode() + AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.content);
        }

        public String toString() {
            String str = this.title;
            String str2 = this.content;
            C27256h c27256h = this.primaryButton;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("HormonalContextBottomSheet(title=", str, ", content=", str2, ", primaryButton=");
            sbM32001t.append(c27256h);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }
    }

    /* JADX INFO: renamed from: jc0.d$c */
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m65681d2 = {"Ljc0/d$c;", "", "<init>", "()V", "a", "Ljc0/d$c$a;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class c {

        /* JADX INFO: renamed from: jc0.d$c$a */
        @Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00152\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b&\u00103R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010'\u001a\u0004\b)\u0010\u001eR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010'\u001a\u0004\b5\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b6\u00108R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b4\u0010;R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b<\u0010'\u001a\u0004\b<\u0010\u001eR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b1\u0010\u001eR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010'\u001a\u0004\b9\u0010\u001eR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b(\u0010>\u001a\u0004\b\u0016\u0010?R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u0010'\u001a\u0004\b=\u0010\u001eR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bE\u0010>\u001a\u0004\b@\u0010?¨\u0006F"}, m65681d2 = {"Ljc0/d$c$a;", "Ljc0/d$c;", "", "title", "subtitle", "Lkd1/o;", "imageUrl", "Lc41/p2;", "infoCallout", "Ljc0/d$b;", "bottomSheet", "footerText", "optionsHeader", "Lgz0/m0;", "optionsHeaderIcon", "", "Ljc0/d$d;", "options", "selectedOptionId", "nextButtonTitle", "saveButtonTitle", "", "isButtonEnabled", "testId", "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;", "currentScreenId", "isFirstScreen", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lc41/p2;Ljc0/d$b;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "m", "b", "k", "c", "Lkd1/o;", "()Lkd1/o;", "d", "Lc41/p2;", "()Lc41/p2;", "e", "Ljc0/d$b;", "()Ljc0/d$b;", "f", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lgz0/m0;", "()Lgz0/m0;", "i", "Ljava/util/List;", "()Ljava/util/List;", "j", "l", "Z", "()Z", "n", "o", "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;", "getCurrentScreenId", "()Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;", "p", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a extends c {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String title;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final String subtitle;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final AbstractC22403o imageUrl;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final C4092p2 infoCallout;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private final b bottomSheet;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            private final String footerText;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata */
            private final String optionsHeader;

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            private final EnumC16313m0 optionsHeaderIcon;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            private final List<d> options;

            /* JADX INFO: renamed from: j, reason: from kotlin metadata */
            private final String selectedOptionId;

            /* JADX INFO: renamed from: k, reason: from kotlin metadata */
            private final String nextButtonTitle;

            /* JADX INFO: renamed from: l, reason: from kotlin metadata */
            private final String saveButtonTitle;

            /* JADX INFO: renamed from: m, reason: from kotlin metadata */
            private final boolean isButtonEnabled;

            /* JADX INFO: renamed from: n, reason: from kotlin metadata */
            private final String testId;

            /* JADX INFO: renamed from: o, reason: from kotlin metadata */
            private final HormonalContextScreenId currentScreenId;

            /* JADX INFO: renamed from: p, reason: from kotlin metadata */
            private final boolean isFirstScreen;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String title, String str, AbstractC22403o abstractC22403o, C4092p2 c4092p2, b bVar, String str2, String optionsHeader, EnumC16313m0 optionsHeaderIcon, List<d> options, String str3, String nextButtonTitle, String saveButtonTitle, boolean z4, String testId, HormonalContextScreenId currentScreenId, boolean z13) {
                super(null);
                AbstractC22676k.m65750j(title, "title");
                AbstractC22676k.m65750j(optionsHeader, "optionsHeader");
                AbstractC22676k.m65750j(optionsHeaderIcon, "optionsHeaderIcon");
                AbstractC22676k.m65750j(options, "options");
                AbstractC22676k.m65750j(nextButtonTitle, "nextButtonTitle");
                AbstractC22676k.m65750j(saveButtonTitle, "saveButtonTitle");
                AbstractC22676k.m65750j(testId, "testId");
                AbstractC22676k.m65750j(currentScreenId, "currentScreenId");
                this.title = title;
                this.subtitle = str;
                this.imageUrl = abstractC22403o;
                this.infoCallout = c4092p2;
                this.bottomSheet = bVar;
                this.footerText = str2;
                this.optionsHeader = optionsHeader;
                this.optionsHeaderIcon = optionsHeaderIcon;
                this.options = options;
                this.selectedOptionId = str3;
                this.nextButtonTitle = nextButtonTitle;
                this.saveButtonTitle = saveButtonTitle;
                this.isButtonEnabled = z4;
                this.testId = testId;
                this.currentScreenId = currentScreenId;
                this.isFirstScreen = z13;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final b getBottomSheet() {
                return this.bottomSheet;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getFooterText() {
                return this.footerText;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final AbstractC22403o getImageUrl() {
                return this.imageUrl;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final C4092p2 getInfoCallout() {
                return this.infoCallout;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final String getNextButtonTitle() {
                return this.nextButtonTitle;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof a)) {
                    return false;
                }
                a aVar = (a) other;
                return AbstractC22676k.m65745e(this.title, aVar.title) && AbstractC22676k.m65745e(this.subtitle, aVar.subtitle) && AbstractC22676k.m65745e(this.imageUrl, aVar.imageUrl) && AbstractC22676k.m65745e(this.infoCallout, aVar.infoCallout) && AbstractC22676k.m65745e(this.bottomSheet, aVar.bottomSheet) && AbstractC22676k.m65745e(this.footerText, aVar.footerText) && AbstractC22676k.m65745e(this.optionsHeader, aVar.optionsHeader) && this.optionsHeaderIcon == aVar.optionsHeaderIcon && AbstractC22676k.m65745e(this.options, aVar.options) && AbstractC22676k.m65745e(this.selectedOptionId, aVar.selectedOptionId) && AbstractC22676k.m65745e(this.nextButtonTitle, aVar.nextButtonTitle) && AbstractC22676k.m65745e(this.saveButtonTitle, aVar.saveButtonTitle) && this.isButtonEnabled == aVar.isButtonEnabled && AbstractC22676k.m65745e(this.testId, aVar.testId) && this.currentScreenId == aVar.currentScreenId && this.isFirstScreen == aVar.isFirstScreen;
            }

            /* JADX INFO: renamed from: f */
            public final List<d> m60750f() {
                return this.options;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getOptionsHeader() {
                return this.optionsHeader;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final EnumC16313m0 getOptionsHeaderIcon() {
                return this.optionsHeaderIcon;
            }

            public int hashCode() {
                int iHashCode = this.title.hashCode() * 31;
                String str = this.subtitle;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                AbstractC22403o abstractC22403o = this.imageUrl;
                int iHashCode3 = (iHashCode2 + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31;
                C4092p2 c4092p2 = this.infoCallout;
                int iHashCode4 = (iHashCode3 + (c4092p2 == null ? 0 : c4092p2.hashCode())) * 31;
                b bVar = this.bottomSheet;
                int iHashCode5 = (iHashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31;
                String str2 = this.footerText;
                int iM31983b = AbstractC11895b.m31983b(AbstractC17176i.m48500b(this.optionsHeaderIcon, AbstractC11266d.m30450d((iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.optionsHeader), 31), 31, this.options);
                String str3 = this.selectedOptionId;
                return Boolean.hashCode(this.isFirstScreen) + ((this.currentScreenId.hashCode() + AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM31983b + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.nextButtonTitle), 31, this.saveButtonTitle), 31, this.isButtonEnabled), 31, this.testId)) * 31);
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final String getSaveButtonTitle() {
                return this.saveButtonTitle;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final String getSelectedOptionId() {
                return this.selectedOptionId;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final String getTestId() {
                return this.testId;
            }

            /* JADX INFO: renamed from: m, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* JADX INFO: renamed from: n, reason: from getter */
            public final boolean getIsFirstScreen() {
                return this.isFirstScreen;
            }

            public String toString() {
                String str = this.title;
                String str2 = this.subtitle;
                AbstractC22403o abstractC22403o = this.imageUrl;
                C4092p2 c4092p2 = this.infoCallout;
                b bVar = this.bottomSheet;
                String str3 = this.footerText;
                String str4 = this.optionsHeader;
                EnumC16313m0 enumC16313m0 = this.optionsHeaderIcon;
                List<d> list = this.options;
                String str5 = this.selectedOptionId;
                String str6 = this.nextButtonTitle;
                String str7 = this.saveButtonTitle;
                boolean z4 = this.isButtonEnabled;
                String str8 = this.testId;
                HormonalContextScreenId hormonalContextScreenId = this.currentScreenId;
                boolean z13 = this.isFirstScreen;
                StringBuilder sbM32001t = AbstractC11895b.m32001t("SingleSelect(title=", str, ", subtitle=", str2, ", imageUrl=");
                sbM32001t.append(abstractC22403o);
                sbM32001t.append(", infoCallout=");
                sbM32001t.append(c4092p2);
                sbM32001t.append(", bottomSheet=");
                sbM32001t.append(bVar);
                sbM32001t.append(", footerText=");
                sbM32001t.append(str3);
                sbM32001t.append(", optionsHeader=");
                sbM32001t.append(str4);
                sbM32001t.append(", optionsHeaderIcon=");
                sbM32001t.append(enumC16313m0);
                sbM32001t.append(", options=");
                AbstractC17176i.m48511m(", selectedOptionId=", str5, ", nextButtonTitle=", sbM32001t, list);
                AbstractC11266d.m30444B(sbM32001t, str6, ", saveButtonTitle=", str7, ", isButtonEnabled=");
                AbstractC38963t7.m124391u(sbM32001t, z4, ", testId=", str8, ", currentScreenId=");
                sbM32001t.append(hormonalContextScreenId);
                sbM32001t.append(", isFirstScreen=");
                sbM32001t.append(z13);
                sbM32001t.append(")");
                return sbM32001t.toString();
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    /* JADX INFO: renamed from: jc0.d$d */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Ljc0/d$d;", "", "", "id", "title", "subtitle", "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;", "nextScreenId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;", "()Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String subtitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final HormonalContextScreenId nextScreenId;

        public d(String id4, String title, String str, HormonalContextScreenId hormonalContextScreenId) {
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(title, "title");
            this.id = id4;
            this.title = title;
            this.subtitle = str;
            this.nextScreenId = hormonalContextScreenId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final HormonalContextScreenId getNextScreenId() {
            return this.nextScreenId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.id, dVar.id) && AbstractC22676k.m65745e(this.title, dVar.title) && AbstractC22676k.m65745e(this.subtitle, dVar.subtitle) && this.nextScreenId == dVar.nextScreenId;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.title);
            String str = this.subtitle;
            int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
            HormonalContextScreenId hormonalContextScreenId = this.nextScreenId;
            return iHashCode + (hormonalContextScreenId != null ? hormonalContextScreenId.hashCode() : 0);
        }

        public String toString() {
            String str = this.id;
            String str2 = this.title;
            String str3 = this.subtitle;
            HormonalContextScreenId hormonalContextScreenId = this.nextScreenId;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("MultipleChoiceOptionViewState(id=", str, ", title=", str2, ", subtitle=");
            sbM32001t.append(str3);
            sbM32001t.append(", nextScreenId=");
            sbM32001t.append(hormonalContextScreenId);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }
    }

    /* JADX INFO: renamed from: jc0.d$e */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Ljc0/d$e;", "", "Ljc0/d$c;", "content", "<init>", "(Ljc0/d$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljc0/d$c;", "()Ljc0/d$c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final c content;

        public e(c cVar) {
            this.content = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final c getContent() {
            return this.content;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && AbstractC22676k.m65745e(this.content, ((e) other).content);
        }

        public int hashCode() {
            c cVar = this.content;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public String toString() {
            return "ScreenContent(content=" + this.content + ")";
        }
    }

    public C21604d(a aVar, e eVar) {
        this.fullScreenModal = aVar;
        this.screenContent = eVar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getFullScreenModal() {
        return this.fullScreenModal;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e getScreenContent() {
        return this.screenContent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21604d)) {
            return false;
        }
        C21604d c21604d = (C21604d) other;
        return AbstractC22676k.m65745e(this.fullScreenModal, c21604d.fullScreenModal) && AbstractC22676k.m65745e(this.screenContent, c21604d.screenContent);
    }

    @Override // fy1.InterfaceC14875k
    public ScreenState getState() {
        a aVar = this.fullScreenModal;
        if (aVar == null) {
            return this.screenContent != null ? ScreenState.SUCCESS : ScreenState.UNKNOWN;
        }
        AbstractC33208p0 type = aVar.getState().getType();
        if (type instanceof AbstractC33208p0.c) {
            return ScreenState.LOADING;
        }
        return type instanceof AbstractC33208p0.b ? ScreenState.ERROR : ScreenState.OTHER;
    }

    public int hashCode() {
        a aVar = this.fullScreenModal;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        e eVar = this.screenContent;
        return iHashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    public String toString() {
        return "HormonalContextViewState(fullScreenModal=" + this.fullScreenModal + ", screenContent=" + this.screenContent + ")";
    }

    public /* synthetic */ C21604d(a aVar, e eVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : aVar, (i13 & 2) != 0 ? null : eVar);
    }

    /* JADX INFO: renamed from: jc0.d$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Ljc0/d$a;", "", "Lsz0/q0;", "state", "Ljc0/a;", "primaryClickEvent", "secondaryClickEvent", "backClickEvent", "<init>", "(Lsz0/q0;Ljc0/a;Ljc0/a;Ljc0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsz0/q0;", "d", "()Lsz0/q0;", "b", "Ljc0/a;", "()Ljc0/a;", "c", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: e */
        public static final int f82904e = C33211q0.f138501k;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C33211q0 state;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC21601a primaryClickEvent;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final InterfaceC21601a secondaryClickEvent;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC21601a backClickEvent;

        public a(C33211q0 state, InterfaceC21601a interfaceC21601a, InterfaceC21601a interfaceC21601a2, InterfaceC21601a interfaceC21601a3) {
            AbstractC22676k.m65750j(state, "state");
            this.state = state;
            this.primaryClickEvent = interfaceC21601a;
            this.secondaryClickEvent = interfaceC21601a2;
            this.backClickEvent = interfaceC21601a3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC21601a getBackClickEvent() {
            return this.backClickEvent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC21601a getPrimaryClickEvent() {
            return this.primaryClickEvent;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC21601a getSecondaryClickEvent() {
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
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.state, aVar.state) && AbstractC22676k.m65745e(this.primaryClickEvent, aVar.primaryClickEvent) && AbstractC22676k.m65745e(this.secondaryClickEvent, aVar.secondaryClickEvent) && AbstractC22676k.m65745e(this.backClickEvent, aVar.backClickEvent);
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            InterfaceC21601a interfaceC21601a = this.primaryClickEvent;
            int iHashCode2 = (iHashCode + (interfaceC21601a == null ? 0 : interfaceC21601a.hashCode())) * 31;
            InterfaceC21601a interfaceC21601a2 = this.secondaryClickEvent;
            int iHashCode3 = (iHashCode2 + (interfaceC21601a2 == null ? 0 : interfaceC21601a2.hashCode())) * 31;
            InterfaceC21601a interfaceC21601a3 = this.backClickEvent;
            return iHashCode3 + (interfaceC21601a3 != null ? interfaceC21601a3.hashCode() : 0);
        }

        public String toString() {
            return "FullScreenModal(state=" + this.state + ", primaryClickEvent=" + this.primaryClickEvent + ", secondaryClickEvent=" + this.secondaryClickEvent + ", backClickEvent=" + this.backClickEvent + ")";
        }

        public /* synthetic */ a(C33211q0 c33211q0, InterfaceC21601a interfaceC21601a, InterfaceC21601a interfaceC21601a2, InterfaceC21601a interfaceC21601a3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(c33211q0, (i13 & 2) != 0 ? null : interfaceC21601a, (i13 & 4) != 0 ? null : interfaceC21601a2, (i13 & 8) != 0 ? null : interfaceC21601a3);
        }
    }
}
