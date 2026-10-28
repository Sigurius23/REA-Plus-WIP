package gd0;

import com.whoop.advancedlabs.multiconsentscreen.domain.models.MultiConsentRequest;
import com.whoop.metrics.common.ScreenState;
import com.whoop.navigation.C9598e;
import fy1.InterfaceC14875k;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pb0.AbstractC29053d;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: gd0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lgd0/c;", "Lfy1/k;", "<init>", "()V", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "c", "b", "a", "e", "d", "Lgd0/c$a;", "Lgd0/c$b;", "Lgd0/c$c;", "Lgd0/c$d;", "Lgd0/c$e;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15713c implements InterfaceC14875k {

    /* JADX INFO: renamed from: gd0.c$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgd0/c$a;", "Lgd0/c;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC15713c {

        /* JADX INFO: renamed from: b */
        public static final a f59203b = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: gd0.c$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgd0/c$b;", "Lgd0/c;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC15713c {

        /* JADX INFO: renamed from: b */
        public static final b f59204b = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: gd0.c$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgd0/c$c;", "Lgd0/c;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC15713c {

        /* JADX INFO: renamed from: b */
        public static final c f59205b = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: gd0.c$d */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lgd0/c$d;", "Lgd0/c;", "Lcom/whoop/navigation/e;", "finalNavigationAction", "<init>", "(Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC15713c {

        /* JADX INFO: renamed from: c */
        public static final int f59206c = C9598e.f28134d;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C9598e finalNavigationAction;

        public d(C9598e c9598e) {
            super(null);
            this.finalNavigationAction = c9598e;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C9598e getFinalNavigationAction() {
            return this.finalNavigationAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.finalNavigationAction, ((d) other).finalNavigationAction);
        }

        public int hashCode() {
            C9598e c9598e = this.finalNavigationAction;
            if (c9598e == null) {
                return 0;
            }
            return c9598e.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106650i("SaveSuccess(finalNavigationAction=", this.finalNavigationAction, ")");
        }
    }

    /* JADX INFO: renamed from: gd0.c$e */
    @Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012 \b\u0002\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJb\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2 \b\u0002\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b0\u000bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b'\u0010\u0016R/\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b0\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\"\u0010)¨\u0006*"}, m65681d2 = {"Lgd0/c$e;", "Lgd0/c;", "", "Lpb0/d$a;", "consentForms", "Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentRequest;", "submitRequest", "Lcom/whoop/navigation/e;", "finalNavigationAction", "", "currentPageIndex", "", "", "checkboxStates", "<init>", "(Ljava/util/List;Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentRequest;Lcom/whoop/navigation/e;ILjava/util/Map;)V", "b", "(Ljava/util/List;Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentRequest;Lcom/whoop/navigation/e;ILjava/util/Map;)Lgd0/c$e;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "e", "()Ljava/util/List;", "c", "Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentRequest;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/advancedlabs/multiconsentscreen/domain/models/MultiConsentRequest;", "d", "Lcom/whoop/navigation/e;", "g", "()Lcom/whoop/navigation/e;", "I", "f", "Ljava/util/Map;", "()Ljava/util/Map;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC15713c {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<AbstractC29053d.a> consentForms;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final MultiConsentRequest submitRequest;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C9598e finalNavigationAction;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final int currentPageIndex;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final Map<Integer, Map<Integer, Boolean>> checkboxStates;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(List<AbstractC29053d.a> consentForms, MultiConsentRequest submitRequest, C9598e c9598e, int i13, Map<Integer, ? extends Map<Integer, Boolean>> checkboxStates) {
            super(null);
            AbstractC22676k.m65750j(consentForms, "consentForms");
            AbstractC22676k.m65750j(submitRequest, "submitRequest");
            AbstractC22676k.m65750j(checkboxStates, "checkboxStates");
            this.consentForms = consentForms;
            this.submitRequest = submitRequest;
            this.finalNavigationAction = c9598e;
            this.currentPageIndex = i13;
            this.checkboxStates = checkboxStates;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: c */
        public static /* synthetic */ e m44289c(e eVar, List list, MultiConsentRequest multiConsentRequest, C9598e c9598e, int i13, Map map, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                list = eVar.consentForms;
            }
            if ((i14 & 2) != 0) {
                multiConsentRequest = eVar.submitRequest;
            }
            if ((i14 & 4) != 0) {
                c9598e = eVar.finalNavigationAction;
            }
            if ((i14 & 8) != 0) {
                i13 = eVar.currentPageIndex;
            }
            if ((i14 & 16) != 0) {
                map = eVar.checkboxStates;
            }
            Map map2 = map;
            C9598e c9598e2 = c9598e;
            return eVar.m44290b(list, multiConsentRequest, c9598e2, i13, map2);
        }

        /* JADX INFO: renamed from: b */
        public final e m44290b(List<AbstractC29053d.a> consentForms, MultiConsentRequest submitRequest, C9598e finalNavigationAction, int currentPageIndex, Map<Integer, ? extends Map<Integer, Boolean>> checkboxStates) {
            AbstractC22676k.m65750j(consentForms, "consentForms");
            AbstractC22676k.m65750j(submitRequest, "submitRequest");
            AbstractC22676k.m65750j(checkboxStates, "checkboxStates");
            return new e(consentForms, submitRequest, finalNavigationAction, currentPageIndex, checkboxStates);
        }

        /* JADX INFO: renamed from: d */
        public final Map<Integer, Map<Integer, Boolean>> m44291d() {
            return this.checkboxStates;
        }

        /* JADX INFO: renamed from: e */
        public final List<AbstractC29053d.a> m44292e() {
            return this.consentForms;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.consentForms, eVar.consentForms) && AbstractC22676k.m65745e(this.submitRequest, eVar.submitRequest) && AbstractC22676k.m65745e(this.finalNavigationAction, eVar.finalNavigationAction) && this.currentPageIndex == eVar.currentPageIndex && AbstractC22676k.m65745e(this.checkboxStates, eVar.checkboxStates);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getCurrentPageIndex() {
            return this.currentPageIndex;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final C9598e getFinalNavigationAction() {
            return this.finalNavigationAction;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final MultiConsentRequest getSubmitRequest() {
            return this.submitRequest;
        }

        public int hashCode() {
            int iHashCode = (this.submitRequest.hashCode() + (this.consentForms.hashCode() * 31)) * 31;
            C9598e c9598e = this.finalNavigationAction;
            return this.checkboxStates.hashCode() + AbstractC11266d.m30448b(this.currentPageIndex, (iHashCode + (c9598e == null ? 0 : c9598e.hashCode())) * 31, 31);
        }

        public String toString() {
            List<AbstractC29053d.a> list = this.consentForms;
            MultiConsentRequest multiConsentRequest = this.submitRequest;
            C9598e c9598e = this.finalNavigationAction;
            int i13 = this.currentPageIndex;
            Map<Integer, Map<Integer, Boolean>> map = this.checkboxStates;
            StringBuilder sb4 = new StringBuilder("Success(consentForms=");
            sb4.append(list);
            sb4.append(", submitRequest=");
            sb4.append(multiConsentRequest);
            sb4.append(", finalNavigationAction=");
            sb4.append(c9598e);
            sb4.append(", currentPageIndex=");
            sb4.append(i13);
            sb4.append(", checkboxStates=");
            return AbstractC13673n.m38565l(sb4, map, ")");
        }
    }

    public /* synthetic */ AbstractC15713c(DefaultConstructorMarker defaultConstructorMarker) {
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
        if (!(this instanceof a) && !(this instanceof e) && !(this instanceof d)) {
            throw new NoWhenBranchMatchedException();
        }
        return ScreenState.SUCCESS;
    }

    private AbstractC15713c() {
    }
}
