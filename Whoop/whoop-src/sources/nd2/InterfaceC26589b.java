package nd2;

import com.whoop.shepherd.feature.about.domain.models.ShepherdAboutResponse;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: nd2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lnd2/b;", "", "c", "a", "b", "Lnd2/b$a;", "Lnd2/b$b;", "Lnd2/b$c;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC26589b {

    /* JADX INFO: renamed from: nd2.b$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lnd2/b$a;", "Lnd2/b;", "<init>", "()V", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC26589b {

        /* JADX INFO: renamed from: a */
        public static final a f105742a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: nd2.b$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lnd2/b$b;", "Lnd2/b;", "Lcom/whoop/shepherd/feature/about/domain/models/ShepherdAboutResponse;", "response", "<init>", "(Lcom/whoop/shepherd/feature/about/domain/models/ShepherdAboutResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/shepherd/feature/about/domain/models/ShepherdAboutResponse;", "()Lcom/whoop/shepherd/feature/about/domain/models/ShepherdAboutResponse;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC26589b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ShepherdAboutResponse response;

        public b(ShepherdAboutResponse response) {
            AbstractC22676k.m65750j(response, "response");
            this.response = response;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ShepherdAboutResponse getResponse() {
            return this.response;
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
            return "LoadAboutSuccess(response=" + this.response + ")";
        }
    }

    /* JADX INFO: renamed from: nd2.b$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lnd2/b$c;", "Lnd2/b;", "<init>", "()V", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC26589b {

        /* JADX INFO: renamed from: a */
        public static final c f105744a = new c();

        private c() {
        }
    }
}
