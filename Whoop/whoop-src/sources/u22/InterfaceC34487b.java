package u22;

import com.whoop.payments.feature.paymentmethodmanagement.domain.models.PaymentMethodManagementDismissModalContentModel;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: u22.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\u0002\u000b\f¨\u0006\rÀ\u0006\u0003"}, m65681d2 = {"Lu22/b;", "", "e", "a", "b", "c", "d", "f", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "Lu22/b$b;", "Lu22/b$e;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC34487b {

    /* JADX INFO: renamed from: u22.b$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lu22/b$a;", "Lu22/b$e;", "Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementDismissModalContentModel;", "data", "<init>", "(Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementDismissModalContentModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementDismissModalContentModel;", "()Lcom/whoop/payments/feature/paymentmethodmanagement/domain/models/PaymentMethodManagementDismissModalContentModel;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final PaymentMethodManagementDismissModalContentModel data;

        public a(PaymentMethodManagementDismissModalContentModel data) {
            AbstractC22676k.m65750j(data, "data");
            this.data = data;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PaymentMethodManagementDismissModalContentModel getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.data, ((a) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "DismissDialog(data=" + this.data + ")";
        }
    }

    /* JADX INFO: renamed from: u22.b$b */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lu22/b$b;", "Lu22/b;", "Lu22/b$c;", "Lu22/b$d;", "Lu22/b$f;", "Lu22/b$g;", "Lu22/b$h;", "Lu22/b$i;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface b extends InterfaceC34487b {
    }

    /* JADX INFO: renamed from: u22.b$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lu22/b$c;", "Lu22/b$b;", "<init>", "()V", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements b {

        /* JADX INFO: renamed from: a */
        public static final c f144866a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: u22.b$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lu22/b$d;", "Lu22/b$b;", "<init>", "()V", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements b {

        /* JADX INFO: renamed from: a */
        public static final d f144867a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: u22.b$e */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, m65681d2 = {"Lu22/b$e;", "Lu22/b;", "Lu22/b$a;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface e extends InterfaceC34487b {
    }

    /* JADX INFO: renamed from: u22.b$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lu22/b$f;", "Lu22/b$b;", "<init>", "()V", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements b {

        /* JADX INFO: renamed from: a */
        public static final f f144868a = new f();

        private f() {
        }
    }

    /* JADX INFO: renamed from: u22.b$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lu22/b$g;", "Lu22/b$b;", "<init>", "()V", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements b {

        /* JADX INFO: renamed from: a */
        public static final g f144869a = new g();

        private g() {
        }
    }

    /* JADX INFO: renamed from: u22.b$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lu22/b$h;", "Lu22/b$b;", "<init>", "()V", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements b {

        /* JADX INFO: renamed from: a */
        public static final h f144870a = new h();

        private h() {
        }
    }

    /* JADX INFO: renamed from: u22.b$i */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lu22/b$i;", "Lu22/b$b;", "<init>", "()V", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements b {

        /* JADX INFO: renamed from: a */
        public static final i f144871a = new i();

        private i() {
        }
    }
}
