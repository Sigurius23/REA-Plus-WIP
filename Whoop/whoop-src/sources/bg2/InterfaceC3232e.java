package bg2;

import java.util.List;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: bg2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lbg2/e;", "", "b", "a", "Lbg2/e$a;", "Lbg2/e$b;", "sms_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC3232e {

    /* JADX INFO: renamed from: bg2.e$a */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lbg2/e$a;", "Lbg2/e;", "", "Lbg2/a;", "contactPhoneNumbers", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "sms_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC3232e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final List<C3228a> contactPhoneNumbers;

        public a(List<C3228a> contactPhoneNumbers) {
            AbstractC22676k.m65750j(contactPhoneNumbers, "contactPhoneNumbers");
            this.contactPhoneNumbers = contactPhoneNumbers;
        }

        /* JADX INFO: renamed from: a */
        public final List<C3228a> m9352a() {
            return this.contactPhoneNumbers;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.contactPhoneNumbers, ((a) other).contactPhoneNumbers);
        }

        public int hashCode() {
            return this.contactPhoneNumbers.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106654m("LaunchSaveContact(contactPhoneNumbers=", ")", this.contactPhoneNumbers);
        }
    }

    /* JADX INFO: renamed from: bg2.e$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lbg2/e$b;", "Lbg2/e;", "", "destinationPhoneNumber", "prefilledBody", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "sms_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC3232e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String destinationPhoneNumber;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String prefilledBody;

        public b(String destinationPhoneNumber, String prefilledBody) {
            AbstractC22676k.m65750j(destinationPhoneNumber, "destinationPhoneNumber");
            AbstractC22676k.m65750j(prefilledBody, "prefilledBody");
            this.destinationPhoneNumber = destinationPhoneNumber;
            this.prefilledBody = prefilledBody;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDestinationPhoneNumber() {
            return this.destinationPhoneNumber;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPrefilledBody() {
            return this.prefilledBody;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.destinationPhoneNumber, bVar.destinationPhoneNumber) && AbstractC22676k.m65745e(this.prefilledBody, bVar.prefilledBody);
        }

        public int hashCode() {
            return this.prefilledBody.hashCode() + (this.destinationPhoneNumber.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("LaunchTextWhoop(destinationPhoneNumber=", this.destinationPhoneNumber, ", prefilledBody=", this.prefilledBody, ")");
        }
    }
}
