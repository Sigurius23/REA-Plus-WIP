package dn1;

import com.whoop.homecustomization.domain.models.CustomizeOverviewResponse;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: dn1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, m65681d2 = {"Ldn1/f;", "Ldn1/c;", "Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;", "a", "()Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;", "response", "b", "c", "Ldn1/f$a;", "Ldn1/f$b;", "Ldn1/f$c;", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC12222f extends InterfaceC12219c {

    /* JADX INFO: renamed from: dn1.f$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ldn1/f$a;", "Ldn1/f;", "Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;", "response", "<init>", "(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;", "()Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC12222f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final CustomizeOverviewResponse response;

        public a(CustomizeOverviewResponse response) {
            AbstractC22676k.m65750j(response, "response");
            this.response = response;
        }

        @Override // dn1.InterfaceC12222f
        /* JADX INFO: renamed from: a, reason: from getter */
        public CustomizeOverviewResponse getResponse() {
            return this.response;
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
            return "Error(response=" + this.response + ")";
        }
    }

    /* JADX INFO: renamed from: dn1.f$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ldn1/f$b;", "Ldn1/f;", "Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;", "response", "<init>", "(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;", "()Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC12222f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final CustomizeOverviewResponse response;

        public b(CustomizeOverviewResponse response) {
            AbstractC22676k.m65750j(response, "response");
            this.response = response;
        }

        @Override // dn1.InterfaceC12222f
        /* JADX INFO: renamed from: a, reason: from getter */
        public CustomizeOverviewResponse getResponse() {
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
            return "Saving(response=" + this.response + ")";
        }
    }

    /* JADX INFO: renamed from: dn1.f$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ldn1/f$c;", "Ldn1/f;", "Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;", "response", "<init>", "(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;", "()Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;", "home-customization_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC12222f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final CustomizeOverviewResponse response;

        public c(CustomizeOverviewResponse response) {
            AbstractC22676k.m65750j(response, "response");
            this.response = response;
        }

        @Override // dn1.InterfaceC12222f
        /* JADX INFO: renamed from: a, reason: from getter */
        public CustomizeOverviewResponse getResponse() {
            return this.response;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.response, ((c) other).response);
        }

        public int hashCode() {
            return this.response.hashCode();
        }

        public String toString() {
            return "Success(response=" + this.response + ")";
        }
    }

    /* JADX INFO: renamed from: a */
    CustomizeOverviewResponse getResponse();
}
