package wb0;

import com.whoop.metrics.common.ScreenState;
import com.whoop.navigation.C9598e;
import fy1.InterfaceC14875k;
import hy0.C17736e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import ny0.C27238a0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: wb0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lwb0/i;", "Lfy1/k;", "<init>", "()V", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "c", "b", "e", "a", "d", "Lwb0/i$a;", "Lwb0/i$b;", "Lwb0/i$c;", "Lwb0/i$d;", "Lwb0/i$e;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37038i implements InterfaceC14875k {

    /* JADX INFO: renamed from: wb0.i$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lwb0/i$a;", "Lwb0/i;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC37038i {

        /* JADX INFO: renamed from: b */
        public static final a f158484b = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: wb0.i$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lwb0/i$b;", "Lwb0/i;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC37038i {

        /* JADX INFO: renamed from: b */
        public static final b f158485b = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: wb0.i$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lwb0/i$c;", "Lwb0/i;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC37038i {

        /* JADX INFO: renamed from: b */
        public static final c f158486b = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: wb0.i$d */
    @Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b1\u0010/R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b.\u00106\u001a\u0004\b(\u00107R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b4\u00106\u001a\u0004\b%\u00107R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b'\u00108\u001a\u0004\b2\u00109R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b1\u00108\u001a\u0004\b0\u00109R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010\u001dR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b>\u0010&\u001a\u0004\b*\u0010\u001dR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b)\u0010?\u001a\u0004\b>\u0010@R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b<\u0010A\u001a\u0004\b:\u0010B¨\u0006C"}, m65681d2 = {"Lwb0/i$d;", "Lwb0/i;", "", "navigationTitle", "title", "searchPlaceholder", "Lhy0/e;", "includedItemsHeader", "notIncludedItemsHeader", "", "Lwb0/f;", "items", "Lny0/a0;", "button", "bottomSheetButton", "Lwb0/e;", "exitDialog", "deleteDialog", "", "isAiConfirmation", "calculationEducationTitle", "calculationEducationDescription", "Lwb0/j;", "testDeletedModal", "Lwb0/d;", "pendingDependencyWarning", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lhy0/e;Lhy0/e;Ljava/util/List;Lny0/a0;Lny0/a0;Lwb0/e;Lwb0/e;ZLjava/lang/String;Ljava/lang/String;Lwb0/j;Lwb0/d;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "j", "c", "o", "d", "m", "e", "Lhy0/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lhy0/e;", "f", "k", "g", "Ljava/util/List;", "i", "()Ljava/util/List;", "Lny0/a0;", "()Lny0/a0;", "Lwb0/e;", "()Lwb0/e;", "l", "Z", "p", "()Z", "n", "Lwb0/j;", "()Lwb0/j;", "Lwb0/d;", "()Lwb0/d;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC37038i {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String navigationTitle;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String searchPlaceholder;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C17736e includedItemsHeader;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C17736e notIncludedItemsHeader;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final List<C37035f> items;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final C27238a0 button;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final C27238a0 bottomSheetButton;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final C37034e exitDialog;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final C37034e deleteDialog;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final boolean isAiConfirmation;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final String calculationEducationTitle;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final String calculationEducationDescription;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final C37039j testDeletedModal;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private final C37033d pendingDependencyWarning;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String navigationTitle, String title, String searchPlaceholder, C17736e includedItemsHeader, C17736e notIncludedItemsHeader, List<C37035f> items, C27238a0 button, C27238a0 bottomSheetButton, C37034e exitDialog, C37034e deleteDialog, boolean z4, String str, String str2, C37039j c37039j, C37033d c37033d) {
            super(null);
            AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(searchPlaceholder, "searchPlaceholder");
            AbstractC22676k.m65750j(includedItemsHeader, "includedItemsHeader");
            AbstractC22676k.m65750j(notIncludedItemsHeader, "notIncludedItemsHeader");
            AbstractC22676k.m65750j(items, "items");
            AbstractC22676k.m65750j(button, "button");
            AbstractC22676k.m65750j(bottomSheetButton, "bottomSheetButton");
            AbstractC22676k.m65750j(exitDialog, "exitDialog");
            AbstractC22676k.m65750j(deleteDialog, "deleteDialog");
            this.navigationTitle = navigationTitle;
            this.title = title;
            this.searchPlaceholder = searchPlaceholder;
            this.includedItemsHeader = includedItemsHeader;
            this.notIncludedItemsHeader = notIncludedItemsHeader;
            this.items = items;
            this.button = button;
            this.bottomSheetButton = bottomSheetButton;
            this.exitDialog = exitDialog;
            this.deleteDialog = deleteDialog;
            this.isAiConfirmation = z4;
            this.calculationEducationTitle = str;
            this.calculationEducationDescription = str2;
            this.testDeletedModal = c37039j;
            this.pendingDependencyWarning = c37033d;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C27238a0 getBottomSheetButton() {
            return this.bottomSheetButton;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C27238a0 getButton() {
            return this.button;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getCalculationEducationDescription() {
            return this.calculationEducationDescription;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getCalculationEducationTitle() {
            return this.calculationEducationTitle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.navigationTitle, dVar.navigationTitle) && AbstractC22676k.m65745e(this.title, dVar.title) && AbstractC22676k.m65745e(this.searchPlaceholder, dVar.searchPlaceholder) && AbstractC22676k.m65745e(this.includedItemsHeader, dVar.includedItemsHeader) && AbstractC22676k.m65745e(this.notIncludedItemsHeader, dVar.notIncludedItemsHeader) && AbstractC22676k.m65745e(this.items, dVar.items) && AbstractC22676k.m65745e(this.button, dVar.button) && AbstractC22676k.m65745e(this.bottomSheetButton, dVar.bottomSheetButton) && AbstractC22676k.m65745e(this.exitDialog, dVar.exitDialog) && AbstractC22676k.m65745e(this.deleteDialog, dVar.deleteDialog) && this.isAiConfirmation == dVar.isAiConfirmation && AbstractC22676k.m65745e(this.calculationEducationTitle, dVar.calculationEducationTitle) && AbstractC22676k.m65745e(this.calculationEducationDescription, dVar.calculationEducationDescription) && AbstractC22676k.m65745e(this.testDeletedModal, dVar.testDeletedModal) && AbstractC22676k.m65745e(this.pendingDependencyWarning, dVar.pendingDependencyWarning);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final C37034e getDeleteDialog() {
            return this.deleteDialog;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final C37034e getExitDialog() {
            return this.exitDialog;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final C17736e getIncludedItemsHeader() {
            return this.includedItemsHeader;
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b((this.deleteDialog.hashCode() + ((this.exitDialog.hashCode() + ((this.bottomSheetButton.hashCode() + ((this.button.hashCode() + AbstractC11895b.m31983b((this.notIncludedItemsHeader.hashCode() + ((this.includedItemsHeader.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.navigationTitle.hashCode() * 31, 31, this.title), 31, this.searchPlaceholder)) * 31)) * 31, 31, this.items)) * 31)) * 31)) * 31)) * 31, 31, this.isAiConfirmation);
            String str = this.calculationEducationTitle;
            int iHashCode = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.calculationEducationDescription;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            C37039j c37039j = this.testDeletedModal;
            int iHashCode3 = (iHashCode2 + (c37039j == null ? 0 : c37039j.hashCode())) * 31;
            C37033d c37033d = this.pendingDependencyWarning;
            return iHashCode3 + (c37033d != null ? c37033d.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i */
        public final List<C37035f> m118888i() {
            return this.items;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getNavigationTitle() {
            return this.navigationTitle;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final C17736e getNotIncludedItemsHeader() {
            return this.notIncludedItemsHeader;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final C37033d getPendingDependencyWarning() {
            return this.pendingDependencyWarning;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getSearchPlaceholder() {
            return this.searchPlaceholder;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final C37039j getTestDeletedModal() {
            return this.testDeletedModal;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final boolean getIsAiConfirmation() {
            return this.isAiConfirmation;
        }

        public String toString() {
            String str = this.navigationTitle;
            String str2 = this.title;
            String str3 = this.searchPlaceholder;
            C17736e c17736e = this.includedItemsHeader;
            C17736e c17736e2 = this.notIncludedItemsHeader;
            List<C37035f> list = this.items;
            C27238a0 c27238a0 = this.button;
            C27238a0 c27238a1 = this.bottomSheetButton;
            C37034e c37034e = this.exitDialog;
            C37034e c37034e2 = this.deleteDialog;
            boolean z4 = this.isAiConfirmation;
            String str4 = this.calculationEducationTitle;
            String str5 = this.calculationEducationDescription;
            C37039j c37039j = this.testDeletedModal;
            C37033d c37033d = this.pendingDependencyWarning;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Success(navigationTitle=", str, ", title=", str2, ", searchPlaceholder=");
            sbM32001t.append(str3);
            sbM32001t.append(", includedItemsHeader=");
            sbM32001t.append(c17736e);
            sbM32001t.append(", notIncludedItemsHeader=");
            sbM32001t.append(c17736e2);
            sbM32001t.append(", items=");
            sbM32001t.append(list);
            sbM32001t.append(", button=");
            sbM32001t.append(c27238a0);
            sbM32001t.append(", bottomSheetButton=");
            sbM32001t.append(c27238a1);
            sbM32001t.append(", exitDialog=");
            sbM32001t.append(c37034e);
            sbM32001t.append(", deleteDialog=");
            sbM32001t.append(c37034e2);
            sbM32001t.append(", isAiConfirmation=");
            AbstractC38963t7.m124391u(sbM32001t, z4, ", calculationEducationTitle=", str4, ", calculationEducationDescription=");
            sbM32001t.append(str5);
            sbM32001t.append(", testDeletedModal=");
            sbM32001t.append(c37039j);
            sbM32001t.append(", pendingDependencyWarning=");
            sbM32001t.append(c37033d);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }
    }

    /* JADX INFO: renamed from: wb0.i$e */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lwb0/i$e;", "Lwb0/i;", "", "", "biomarkersAdded", "biomarkersRemoved", "biomarkerEdited", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "d", "e", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC37038i {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<String> biomarkersAdded;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<String> biomarkersRemoved;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<String> biomarkerEdited;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C9598e destination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<String> biomarkersAdded, List<String> biomarkersRemoved, List<String> biomarkerEdited, C9598e c9598e) {
            super(null);
            AbstractC22676k.m65750j(biomarkersAdded, "biomarkersAdded");
            AbstractC22676k.m65750j(biomarkersRemoved, "biomarkersRemoved");
            AbstractC22676k.m65750j(biomarkerEdited, "biomarkerEdited");
            this.biomarkersAdded = biomarkersAdded;
            this.biomarkersRemoved = biomarkersRemoved;
            this.biomarkerEdited = biomarkerEdited;
            this.destination = c9598e;
        }

        /* JADX INFO: renamed from: b */
        public final List<String> m118896b() {
            return this.biomarkerEdited;
        }

        /* JADX INFO: renamed from: c */
        public final List<String> m118897c() {
            return this.biomarkersAdded;
        }

        /* JADX INFO: renamed from: d */
        public final List<String> m118898d() {
            return this.biomarkersRemoved;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C9598e getDestination() {
            return this.destination;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.biomarkersAdded, eVar.biomarkersAdded) && AbstractC22676k.m65745e(this.biomarkersRemoved, eVar.biomarkersRemoved) && AbstractC22676k.m65745e(this.biomarkerEdited, eVar.biomarkerEdited) && AbstractC22676k.m65745e(this.destination, eVar.destination);
        }

        public int hashCode() {
            int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b(this.biomarkersAdded.hashCode() * 31, 31, this.biomarkersRemoved), 31, this.biomarkerEdited);
            C9598e c9598e = this.destination;
            return iM31983b + (c9598e == null ? 0 : c9598e.hashCode());
        }

        public String toString() {
            List<String> list = this.biomarkersAdded;
            List<String> list2 = this.biomarkersRemoved;
            List<String> list3 = this.biomarkerEdited;
            C9598e c9598e = this.destination;
            StringBuilder sbM124380j = AbstractC38963t7.m124380j("UpdateSuccess(biomarkersAdded=", ", biomarkersRemoved=", list, ", biomarkerEdited=", list2);
            sbM124380j.append(list3);
            sbM124380j.append(", destination=");
            sbM124380j.append(c9598e);
            sbM124380j.append(")");
            return sbM124380j.toString();
        }
    }

    public /* synthetic */ AbstractC37038i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // fy1.InterfaceC14875k
    public ScreenState getState() {
        if (this instanceof c) {
            return ScreenState.LOADING;
        }
        if (this instanceof b) {
            return ScreenState.ERROR;
        }
        if (!(this instanceof d) && !(this instanceof e) && !(this instanceof a)) {
            throw new NoWhenBranchMatchedException();
        }
        return ScreenState.SUCCESS;
    }

    private AbstractC37038i() {
    }
}
