package fp1;

import com.whoop.hormonalinsights.postpartum.domain.models.PostPartumResponse;
import com.whoop.hormonalinsights.postpartum.domain.models.PostPartumScreenType;
import live.hms.video.media.tracks.HMSTrackSource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fp1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, m65681d2 = {"Lfp1/e;", "", "b", "d", "c", "a", "f", "e", "Lfp1/e$a;", "Lfp1/e$b;", "Lfp1/e$c;", "Lfp1/e$d;", "Lfp1/e$e;", "Lfp1/e$f;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC14677e {

    /* JADX INFO: renamed from: fp1.e$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\t¨\u0006\u0017"}, m65681d2 = {"Lfp1/e$a;", "Lfp1/e;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;", HMSTrackSource.SCREEN, "", "id", "<init>", "(Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;", "b", "()Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;", "Ljava/lang/String;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC14677e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final PostPartumScreenType screen;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String id;

        public a(PostPartumScreenType screen, String id4) {
            AbstractC22676k.m65750j(screen, "screen");
            AbstractC22676k.m65750j(id4, "id");
            this.screen = screen;
            this.id = id4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final PostPartumScreenType getScreen() {
            return this.screen;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.screen == aVar.screen && AbstractC22676k.m65745e(this.id, aVar.id);
        }

        public int hashCode() {
            return this.id.hashCode() + (this.screen.hashCode() * 31);
        }

        public String toString() {
            return "Error(screen=" + this.screen + ", id=" + this.id + ")";
        }
    }

    /* JADX INFO: renamed from: fp1.e$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lfp1/e$b;", "Lfp1/e;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC14677e {

        /* JADX INFO: renamed from: a */
        public static final b f54201a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: fp1.e$c */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lfp1/e$c;", "Lfp1/e;", "", "isStealthModeOn", "Lfp1/g;", "progressResult", "Lfp1/d;", "saveRequest", "<init>", "(ZLfp1/g;Lfp1/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "Lfp1/g;", "()Lfp1/g;", "Lfp1/d;", "()Lfp1/d;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC14677e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isStealthModeOn;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C14679g progressResult;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C14676d saveRequest;

        public c(boolean z4, C14679g progressResult, C14676d saveRequest) {
            AbstractC22676k.m65750j(progressResult, "progressResult");
            AbstractC22676k.m65750j(saveRequest, "saveRequest");
            this.isStealthModeOn = z4;
            this.progressResult = progressResult;
            this.saveRequest = saveRequest;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C14679g getProgressResult() {
            return this.progressResult;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C14676d getSaveRequest() {
            return this.saveRequest;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsStealthModeOn() {
            return this.isStealthModeOn;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return this.isStealthModeOn == cVar.isStealthModeOn && AbstractC22676k.m65745e(this.progressResult, cVar.progressResult) && AbstractC22676k.m65745e(this.saveRequest, cVar.saveRequest);
        }

        public int hashCode() {
            return this.saveRequest.hashCode() + ((this.progressResult.hashCode() + (Boolean.hashCode(this.isStealthModeOn) * 31)) * 31);
        }

        public String toString() {
            return "SaveError(isStealthModeOn=" + this.isStealthModeOn + ", progressResult=" + this.progressResult + ", saveRequest=" + this.saveRequest + ")";
        }
    }

    /* JADX INFO: renamed from: fp1.e$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lfp1/e$d;", "Lfp1/e;", "<init>", "()V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC14677e {

        /* JADX INFO: renamed from: a */
        public static final d f54205a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: fp1.e$e */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lfp1/e$e;", "Lfp1/e;", "Lfp1/g;", "progressResult", "Lfp1/d;", "saveRequest", "<init>", "(Lfp1/g;Lfp1/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfp1/g;", "()Lfp1/g;", "b", "Lfp1/d;", "()Lfp1/d;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements InterfaceC14677e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C14679g progressResult;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C14676d saveRequest;

        public e(C14679g progressResult, C14676d saveRequest) {
            AbstractC22676k.m65750j(progressResult, "progressResult");
            AbstractC22676k.m65750j(saveRequest, "saveRequest");
            this.progressResult = progressResult;
            this.saveRequest = saveRequest;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C14679g getProgressResult() {
            return this.progressResult;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C14676d getSaveRequest() {
            return this.saveRequest;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.progressResult, eVar.progressResult) && AbstractC22676k.m65745e(this.saveRequest, eVar.saveRequest);
        }

        public int hashCode() {
            return this.saveRequest.hashCode() + (this.progressResult.hashCode() * 31);
        }

        public String toString() {
            return "Saving(progressResult=" + this.progressResult + ", saveRequest=" + this.saveRequest + ")";
        }
    }

    /* JADX INFO: renamed from: fp1.e$f */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Lfp1/e$f;", "Lfp1/e;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;", "response", "Lfp1/g;", "progressResult", "Lfp1/d;", "saveRequest", "<init>", "(Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;Lfp1/g;Lfp1/d;)V", "a", "(Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;Lfp1/g;Lfp1/d;)Lfp1/e$f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;", "d", "()Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumResponse;", "b", "Lfp1/g;", "c", "()Lfp1/g;", "Lfp1/d;", "e", "()Lfp1/d;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f implements InterfaceC14677e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final PostPartumResponse response;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C14679g progressResult;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C14676d saveRequest;

        public f(PostPartumResponse response, C14679g progressResult, C14676d saveRequest) {
            AbstractC22676k.m65750j(response, "response");
            AbstractC22676k.m65750j(progressResult, "progressResult");
            AbstractC22676k.m65750j(saveRequest, "saveRequest");
            this.response = response;
            this.progressResult = progressResult;
            this.saveRequest = saveRequest;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ f m41965b(f fVar, PostPartumResponse postPartumResponse, C14679g c14679g, C14676d c14676d, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                postPartumResponse = fVar.response;
            }
            if ((i13 & 2) != 0) {
                c14679g = fVar.progressResult;
            }
            if ((i13 & 4) != 0) {
                c14676d = fVar.saveRequest;
            }
            return fVar.m41966a(postPartumResponse, c14679g, c14676d);
        }

        /* JADX INFO: renamed from: a */
        public final f m41966a(PostPartumResponse response, C14679g progressResult, C14676d saveRequest) {
            AbstractC22676k.m65750j(response, "response");
            AbstractC22676k.m65750j(progressResult, "progressResult");
            AbstractC22676k.m65750j(saveRequest, "saveRequest");
            return new f(response, progressResult, saveRequest);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C14679g getProgressResult() {
            return this.progressResult;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final PostPartumResponse getResponse() {
            return this.response;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C14676d getSaveRequest() {
            return this.saveRequest;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return AbstractC22676k.m65745e(this.response, fVar.response) && AbstractC22676k.m65745e(this.progressResult, fVar.progressResult) && AbstractC22676k.m65745e(this.saveRequest, fVar.saveRequest);
        }

        public int hashCode() {
            return this.saveRequest.hashCode() + ((this.progressResult.hashCode() + (this.response.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "Success(response=" + this.response + ", progressResult=" + this.progressResult + ", saveRequest=" + this.saveRequest + ")";
        }
    }
}
