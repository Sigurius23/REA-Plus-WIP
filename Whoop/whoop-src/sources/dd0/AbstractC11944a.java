package dd0;

import com.whoop.advancedlabs.multiconsentscreen.domain.models.ConsentAction;
import com.whoop.advancedlabs.multiconsentscreen.domain.models.MultiConsentRequest;
import com.whoop.navigation.C9598e;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: dd0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Ldd0/a;", "", "<init>", "()V", "a", "d", "e", "b", "c", "Ldd0/a$a;", "Ldd0/a$b;", "Ldd0/a$c;", "Ldd0/a$d;", "Ldd0/a$e;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11944a {

    /* JADX INFO: renamed from: dd0.a$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, m65681d2 = {"Ldd0/a$a;", "Ldd0/a;", "Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;", "consentAction", "", "testType", "<init>", "(Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;", "()Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/ConsentAction;", "b", "Ljava/lang/String;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC11944a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ConsentAction consentAction;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String testType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ConsentAction consentAction, String str) {
            super(null);
            AbstractC22676k.m65750j(consentAction, "consentAction");
            this.consentAction = consentAction;
            this.testType = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ConsentAction getConsentAction() {
            return this.consentAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTestType() {
            return this.testType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.consentAction == aVar.consentAction && AbstractC22676k.m65745e(this.testType, aVar.testType);
        }

        public int hashCode() {
            int iHashCode = this.consentAction.hashCode() * 31;
            String str = this.testType;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "LoadData(consentAction=" + this.consentAction + ", testType=" + this.testType + ")";
        }
    }

    /* JADX INFO: renamed from: dd0.a$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldd0/a$b;", "Ldd0/a;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC11944a {

        /* JADX INFO: renamed from: a */
        public static final b f39048a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: dd0.a$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ldd0/a$c;", "Ldd0/a;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC11944a {

        /* JADX INFO: renamed from: a */
        public static final c f39049a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: dd0.a$d */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Ldd0/a$d;", "Ldd0/a;", "Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentRequest;", "request", "Lcom/whoop/navigation/e;", "finalNavigationAction", "<init>", "(Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentRequest;Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentRequest;", "b", "()Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentRequest;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC11944a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final MultiConsentRequest request;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C9598e finalNavigationAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MultiConsentRequest request, C9598e c9598e) {
            super(null);
            AbstractC22676k.m65750j(request, "request");
            this.request = request;
            this.finalNavigationAction = c9598e;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C9598e getFinalNavigationAction() {
            return this.finalNavigationAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final MultiConsentRequest getRequest() {
            return this.request;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.request, dVar.request) && AbstractC22676k.m65745e(this.finalNavigationAction, dVar.finalNavigationAction);
        }

        public int hashCode() {
            int iHashCode = this.request.hashCode() * 31;
            C9598e c9598e = this.finalNavigationAction;
            return iHashCode + (c9598e == null ? 0 : c9598e.hashCode());
        }

        public String toString() {
            return "SubmitConsent(request=" + this.request + ", finalNavigationAction=" + this.finalNavigationAction + ")";
        }
    }

    /* JADX INFO: renamed from: dd0.a$e */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Ldd0/a$e;", "Ldd0/a;", "", "pageIndex", "checkboxIndex", "", "isChecked", "<init>", "(IIZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "Z", "()Z", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC11944a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int pageIndex;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int checkboxIndex;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final boolean isChecked;

        public e(int i13, int i14, boolean z4) {
            super(null);
            this.pageIndex = i13;
            this.checkboxIndex = i14;
            this.isChecked = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCheckboxIndex() {
            return this.checkboxIndex;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getPageIndex() {
            return this.pageIndex;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsChecked() {
            return this.isChecked;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return this.pageIndex == eVar.pageIndex && this.checkboxIndex == eVar.checkboxIndex && this.isChecked == eVar.isChecked;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isChecked) + AbstractC11266d.m30448b(this.checkboxIndex, Integer.hashCode(this.pageIndex) * 31, 31);
        }

        public String toString() {
            int i13 = this.pageIndex;
            int i14 = this.checkboxIndex;
            return AbstractC18489d0.m53372m(AbstractC11266d.m30465s(i13, i14, "UpdateCheckboxState(pageIndex=", ", checkboxIndex=", ", isChecked="), this.isChecked, ")");
        }
    }

    public /* synthetic */ AbstractC11944a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC11944a() {
    }
}
