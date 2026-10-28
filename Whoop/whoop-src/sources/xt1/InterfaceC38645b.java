package xt1;

import com.whoop.labrador.feature.results.domain.model.PaginatedLabradorResultsModel;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y82.EnumC39339b;

/* JADX INFO: renamed from: xt1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0003\n\u000b\f¨\u0006\rÀ\u0006\u0003"}, m65681d2 = {"Lxt1/b;", "", "e", "c", "d", "f", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "b", "g", "a", "Lxt1/b$c;", "Lxt1/b$d;", "Lxt1/b$e;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC38645b {

    /* JADX INFO: renamed from: xt1.b$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lxt1/b$a;", "Lxt1/b$d;", "Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;", "response", "<init>", "(Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;)V", "", "toString", "()Ljava/lang/String;", "b", "(Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;)Lxt1/b$a;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;", "()Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final PaginatedLabradorResultsModel response;

        public a(PaginatedLabradorResultsModel response) {
            AbstractC22676k.m65750j(response, "response");
            this.response = response;
        }

        @Override // xt1.InterfaceC38645b.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public PaginatedLabradorResultsModel getResponse() {
            return this.response;
        }

        /* JADX INFO: renamed from: b */
        public final a m123855b(PaginatedLabradorResultsModel response) {
            AbstractC22676k.m65750j(response, "response");
            return new a(response);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.response, ((a) other).response);
        }

        public int hashCode() {
            return this.response.hashCode();
        }

        public String toString() {
            return "BottomError";
        }
    }

    /* JADX INFO: renamed from: xt1.b$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lxt1/b$b;", "Lxt1/b$d;", "Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;", "response", "<init>", "(Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;)V", "", "toString", "()Ljava/lang/String;", "b", "(Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;)Lxt1/b$b;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;", "()Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final PaginatedLabradorResultsModel response;

        public b(PaginatedLabradorResultsModel response) {
            AbstractC22676k.m65750j(response, "response");
            this.response = response;
        }

        @Override // xt1.InterfaceC38645b.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public PaginatedLabradorResultsModel getResponse() {
            return this.response;
        }

        /* JADX INFO: renamed from: b */
        public final b m123856b(PaginatedLabradorResultsModel response) {
            AbstractC22676k.m65750j(response, "response");
            return new b(response);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.response, ((b) other).response);
        }

        public int hashCode() {
            return this.response.hashCode();
        }

        public String toString() {
            return "BottomLoading";
        }
    }

    /* JADX INFO: renamed from: xt1.b$c */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lxt1/b$c;", "Lxt1/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC38645b {

        /* JADX INFO: renamed from: a */
        public static final c f166209a = new c();

        private c() {
        }

        public String toString() {
            return "FullScreenError";
        }
    }

    /* JADX INFO: renamed from: xt1.b$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0005\u0006\u0007\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, m65681d2 = {"Lxt1/b$d;", "Lxt1/b;", "Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;", "a", "()Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;", "response", "Lxt1/b$a;", "Lxt1/b$b;", "Lxt1/b$f;", "Lxt1/b$g;", "Lxt1/b$h;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface d extends InterfaceC38645b {
        /* JADX INFO: renamed from: a */
        PaginatedLabradorResultsModel getResponse();
    }

    /* JADX INFO: renamed from: xt1.b$e */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lxt1/b$e;", "Lxt1/b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC38645b {

        /* JADX INFO: renamed from: a */
        public static final e f166210a = new e();

        private e() {
        }

        public String toString() {
            return "LoadingInitial";
        }
    }

    /* JADX INFO: renamed from: xt1.b$f */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lxt1/b$f;", "Lxt1/b$d;", "Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;", "response", "<init>", "(Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;", "()Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f implements d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final PaginatedLabradorResultsModel response;

        public f(PaginatedLabradorResultsModel response) {
            AbstractC22676k.m65750j(response, "response");
            this.response = response;
        }

        @Override // xt1.InterfaceC38645b.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public PaginatedLabradorResultsModel getResponse() {
            return this.response;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && AbstractC22676k.m65745e(this.response, ((f) other).response);
        }

        public int hashCode() {
            return this.response.hashCode();
        }

        public String toString() {
            return EnumC39339b.RESULT_SUCCESS;
        }
    }

    /* JADX INFO: renamed from: xt1.b$g */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lxt1/b$g;", "Lxt1/b$d;", "Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;", "response", "<init>", "(Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;", "()Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g implements d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final PaginatedLabradorResultsModel response;

        public g(PaginatedLabradorResultsModel response) {
            AbstractC22676k.m65750j(response, "response");
            this.response = response;
        }

        @Override // xt1.InterfaceC38645b.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public PaginatedLabradorResultsModel getResponse() {
            return this.response;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && AbstractC22676k.m65745e(this.response, ((g) other).response);
        }

        public int hashCode() {
            return this.response.hashCode();
        }

        public String toString() {
            return "TopError";
        }
    }

    /* JADX INFO: renamed from: xt1.b$h */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lxt1/b$h;", "Lxt1/b$d;", "Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;", "response", "<init>", "(Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;", "()Lcom/whoop/labrador/feature/results/domain/model/PaginatedLabradorResultsModel;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h implements d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final PaginatedLabradorResultsModel response;

        public h(PaginatedLabradorResultsModel response) {
            AbstractC22676k.m65750j(response, "response");
            this.response = response;
        }

        @Override // xt1.InterfaceC38645b.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public PaginatedLabradorResultsModel getResponse() {
            return this.response;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof h) && AbstractC22676k.m65745e(this.response, ((h) other).response);
        }

        public int hashCode() {
            return this.response.hashCode();
        }

        public String toString() {
            return "TopLoading";
        }
    }
}
