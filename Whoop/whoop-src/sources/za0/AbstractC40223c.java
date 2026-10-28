package za0;

import com.whoop.advancedlabs.domain.models.BiomarkerDetailsResponse;
import java.util.Set;
import m83.C25235a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: za0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m65681d2 = {"Lza0/c;", "", "<init>", "()V", "c", "a", "b", "d", "Lza0/c$a;", "Lza0/c$b;", "Lza0/c$c;", "Lza0/c$d;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40223c {

    /* JADX INFO: renamed from: za0.c$a */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lza0/c$a;", "Lza0/c;", "", "biomarkerId", "Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;", "currentResponse", "", "dismissedCardIds", "<init>", "(Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;Ljava/util/Set;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;", "()Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;", "c", "Ljava/util/Set;", "()Ljava/util/Set;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC40223c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String biomarkerId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final BiomarkerDetailsResponse currentResponse;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Set<String> dismissedCardIds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String biomarkerId, BiomarkerDetailsResponse currentResponse, Set<String> dismissedCardIds) {
            super(null);
            AbstractC22676k.m65750j(biomarkerId, "biomarkerId");
            AbstractC22676k.m65750j(currentResponse, "currentResponse");
            AbstractC22676k.m65750j(dismissedCardIds, "dismissedCardIds");
            this.biomarkerId = biomarkerId;
            this.currentResponse = currentResponse;
            this.dismissedCardIds = dismissedCardIds;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBiomarkerId() {
            return this.biomarkerId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BiomarkerDetailsResponse getCurrentResponse() {
            return this.currentResponse;
        }

        /* JADX INFO: renamed from: c */
        public final Set<String> m129122c() {
            return this.dismissedCardIds;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.biomarkerId, aVar.biomarkerId) && AbstractC22676k.m65745e(this.currentResponse, aVar.currentResponse) && AbstractC22676k.m65745e(this.dismissedCardIds, aVar.dismissedCardIds);
        }

        public int hashCode() {
            return this.dismissedCardIds.hashCode() + ((this.currentResponse.hashCode() + (this.biomarkerId.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "DateSelectorLoading(biomarkerId=" + this.biomarkerId + ", currentResponse=" + this.currentResponse + ", dismissedCardIds=" + this.dismissedCardIds + ")";
        }
    }

    /* JADX INFO: renamed from: za0.c$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lza0/c$b;", "Lza0/c;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC40223c {

        /* JADX INFO: renamed from: a */
        public static final b f173688a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: za0.c$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lza0/c$c;", "Lza0/c;", "<init>", "()V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC40223c {

        /* JADX INFO: renamed from: a */
        public static final c f173689a = new c();

        private c() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: za0.c$d */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lza0/c$d;", "Lza0/c;", "", "biomarkerId", "Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;", "response", "", "dismissedCardIds", "<init>", "(Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;Ljava/util/Set;)V", "a", "(Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;Ljava/util/Set;)Lza0/c$d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;", "e", "()Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;", "Ljava/util/Set;", "d", "()Ljava/util/Set;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC40223c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String biomarkerId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final BiomarkerDetailsResponse response;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Set<String> dismissedCardIds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String biomarkerId, BiomarkerDetailsResponse response, Set<String> dismissedCardIds) {
            super(null);
            AbstractC22676k.m65750j(biomarkerId, "biomarkerId");
            AbstractC22676k.m65750j(response, "response");
            AbstractC22676k.m65750j(dismissedCardIds, "dismissedCardIds");
            this.biomarkerId = biomarkerId;
            this.response = response;
            this.dismissedCardIds = dismissedCardIds;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ d m129123b(d dVar, String str, BiomarkerDetailsResponse biomarkerDetailsResponse, Set set, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = dVar.biomarkerId;
            }
            if ((i13 & 2) != 0) {
                biomarkerDetailsResponse = dVar.response;
            }
            if ((i13 & 4) != 0) {
                set = dVar.dismissedCardIds;
            }
            return dVar.m129124a(str, biomarkerDetailsResponse, set);
        }

        /* JADX INFO: renamed from: a */
        public final d m129124a(String biomarkerId, BiomarkerDetailsResponse response, Set<String> dismissedCardIds) {
            AbstractC22676k.m65750j(biomarkerId, "biomarkerId");
            AbstractC22676k.m65750j(response, "response");
            AbstractC22676k.m65750j(dismissedCardIds, "dismissedCardIds");
            return new d(biomarkerId, response, dismissedCardIds);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getBiomarkerId() {
            return this.biomarkerId;
        }

        /* JADX INFO: renamed from: d */
        public final Set<String> m129126d() {
            return this.dismissedCardIds;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final BiomarkerDetailsResponse getResponse() {
            return this.response;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.biomarkerId, dVar.biomarkerId) && AbstractC22676k.m65745e(this.response, dVar.response) && AbstractC22676k.m65745e(this.dismissedCardIds, dVar.dismissedCardIds);
        }

        public int hashCode() {
            return this.dismissedCardIds.hashCode() + ((this.response.hashCode() + (this.biomarkerId.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "Success(biomarkerId=" + this.biomarkerId + ", response=" + this.response + ", dismissedCardIds=" + this.dismissedCardIds + ")";
        }

        public /* synthetic */ d(String str, BiomarkerDetailsResponse biomarkerDetailsResponse, Set set, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, biomarkerDetailsResponse, (i13 & 4) != 0 ? C25235a0.f99113w : set);
        }
    }

    public /* synthetic */ AbstractC40223c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC40223c() {
    }
}
