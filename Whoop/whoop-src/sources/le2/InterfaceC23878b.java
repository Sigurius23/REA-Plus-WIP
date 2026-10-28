package le2;

import com.whoop.shepherd.feature.welcome.domain.models.ShepherdWelcomeScreenResponse;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: le2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lle2/b;", "", "b", "a", "c", "Lle2/b$a;", "Lle2/b$b;", "Lle2/b$c;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC23878b {

    /* JADX INFO: renamed from: le2.b$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lle2/b$a;", "Lle2/b;", "<init>", "()V", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC23878b {

        /* JADX INFO: renamed from: a */
        public static final a f94416a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: le2.b$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lle2/b$b;", "Lle2/b;", "<init>", "()V", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC23878b {

        /* JADX INFO: renamed from: a */
        public static final b f94417a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: le2.b$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lle2/b$c;", "Lle2/b;", "Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeScreenResponse;", "welcomeScreenResponse", "<init>", "(Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeScreenResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeScreenResponse;", "()Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeScreenResponse;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC23878b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ShepherdWelcomeScreenResponse welcomeScreenResponse;

        public c(ShepherdWelcomeScreenResponse welcomeScreenResponse) {
            AbstractC22676k.m65750j(welcomeScreenResponse, "welcomeScreenResponse");
            this.welcomeScreenResponse = welcomeScreenResponse;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ShepherdWelcomeScreenResponse getWelcomeScreenResponse() {
            return this.welcomeScreenResponse;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.welcomeScreenResponse, ((c) other).welcomeScreenResponse);
        }

        public int hashCode() {
            return this.welcomeScreenResponse.hashCode();
        }

        public String toString() {
            return "Success(welcomeScreenResponse=" + this.welcomeScreenResponse + ")";
        }
    }
}
