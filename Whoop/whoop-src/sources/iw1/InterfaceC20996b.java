package iw1;

import com.whoop.membership.extensions.domain.models.CheckoutPayload;
import com.whoop.membership.extensions.domain.models.NativeOrderDetails;
import com.whoop.membership.extensions.domain.models.OrderOption;
import com.whoop.membership.extensions.domain.models.ProgressContent;
import com.whoop.membership.extensions.domain.models.StepPrefetchContent;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import lw1.C24774j;
import lw1.C24775k;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: iw1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\t\u0003\fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, m65681d2 = {"Liw1/b;", "Liw1/i;", "", "a", "()Ljava/lang/String;", "promoCode", "getPath", "path", "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "b", "()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "payloadV2", "c", "Liw1/b$a;", "Liw1/b$b;", "Liw1/b$c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC20996b extends InterfaceC21003i {

    /* JADX INFO: renamed from: iw1.b$a */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b\u001a\u0010!¨\u0006\""}, m65681d2 = {"Liw1/b$a;", "Liw1/b;", "Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "content", "", "promoCode", "payload", "path", "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "payloadV2", "<init>", "(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "e", "()Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "b", "Ljava/lang/String;", "c", "getPayload", "d", "getPath", "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC20996b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ProgressContent content;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String promoCode;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String payload;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String path;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final CheckoutPayload payloadV2;

        public a(ProgressContent progressContent, String str, String payload, String str2, CheckoutPayload checkoutPayload) {
            AbstractC22676k.m65750j(payload, "payload");
            this.content = progressContent;
            this.promoCode = str;
            this.payload = payload;
            this.path = str2;
            this.payloadV2 = checkoutPayload;
        }

        @Override // iw1.InterfaceC20996b
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getPromoCode() {
            return this.promoCode;
        }

        @Override // iw1.InterfaceC20996b
        /* JADX INFO: renamed from: b, reason: from getter */
        public CheckoutPayload getPayloadV2() {
            return this.payloadV2;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ProgressContent getContent() {
            return this.content;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.content, aVar.content) && AbstractC22676k.m65745e(this.promoCode, aVar.promoCode) && AbstractC22676k.m65745e(this.payload, aVar.payload) && AbstractC22676k.m65745e(this.path, aVar.path) && AbstractC22676k.m65745e(this.payloadV2, aVar.payloadV2);
        }

        @Override // iw1.InterfaceC20996b
        public String getPath() {
            return this.path;
        }

        public int hashCode() {
            ProgressContent progressContent = this.content;
            int iHashCode = (progressContent == null ? 0 : progressContent.hashCode()) * 31;
            String str = this.promoCode;
            int iM30450d = AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.payload);
            String str2 = this.path;
            int iHashCode2 = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
            CheckoutPayload checkoutPayload = this.payloadV2;
            return iHashCode2 + (checkoutPayload != null ? checkoutPayload.hashCode() : 0);
        }

        public String toString() {
            ProgressContent progressContent = this.content;
            String str = this.promoCode;
            String str2 = this.payload;
            String str3 = this.path;
            CheckoutPayload checkoutPayload = this.payloadV2;
            StringBuilder sb4 = new StringBuilder("Error(content=");
            sb4.append(progressContent);
            sb4.append(", promoCode=");
            sb4.append(str);
            sb4.append(", payload=");
            AbstractC11266d.m30444B(sb4, str2, ", path=", str3, ", payloadV2=");
            sb4.append(checkoutPayload);
            sb4.append(")");
            return sb4.toString();
        }
    }

    /* JADX INFO: renamed from: iw1.b$b */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b\u001a\u0010!¨\u0006\""}, m65681d2 = {"Liw1/b$b;", "Liw1/b;", "Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "content", "", "promoCode", "payload", "path", "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "payloadV2", "<init>", "(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "e", "()Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "b", "Ljava/lang/String;", "c", "getPayload", "d", "getPath", "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC20996b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ProgressContent content;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String promoCode;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String payload;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String path;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final CheckoutPayload payloadV2;

        public b(ProgressContent progressContent, String str, String payload, String str2, CheckoutPayload checkoutPayload) {
            AbstractC22676k.m65750j(payload, "payload");
            this.content = progressContent;
            this.promoCode = str;
            this.payload = payload;
            this.path = str2;
            this.payloadV2 = checkoutPayload;
        }

        @Override // iw1.InterfaceC20996b
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getPromoCode() {
            return this.promoCode;
        }

        @Override // iw1.InterfaceC20996b
        /* JADX INFO: renamed from: b, reason: from getter */
        public CheckoutPayload getPayloadV2() {
            return this.payloadV2;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ProgressContent getContent() {
            return this.content;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.content, bVar.content) && AbstractC22676k.m65745e(this.promoCode, bVar.promoCode) && AbstractC22676k.m65745e(this.payload, bVar.payload) && AbstractC22676k.m65745e(this.path, bVar.path) && AbstractC22676k.m65745e(this.payloadV2, bVar.payloadV2);
        }

        @Override // iw1.InterfaceC20996b
        public String getPath() {
            return this.path;
        }

        public int hashCode() {
            ProgressContent progressContent = this.content;
            int iHashCode = (progressContent == null ? 0 : progressContent.hashCode()) * 31;
            String str = this.promoCode;
            int iM30450d = AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.payload);
            String str2 = this.path;
            int iHashCode2 = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
            CheckoutPayload checkoutPayload = this.payloadV2;
            return iHashCode2 + (checkoutPayload != null ? checkoutPayload.hashCode() : 0);
        }

        public String toString() {
            ProgressContent progressContent = this.content;
            String str = this.promoCode;
            String str2 = this.payload;
            String str3 = this.path;
            CheckoutPayload checkoutPayload = this.payloadV2;
            StringBuilder sb4 = new StringBuilder("Loading(content=");
            sb4.append(progressContent);
            sb4.append(", promoCode=");
            sb4.append(str);
            sb4.append(", payload=");
            AbstractC11266d.m30444B(sb4, str2, ", path=", str3, ", payloadV2=");
            sb4.append(checkoutPayload);
            sb4.append(")");
            return sb4.toString();
        }
    }

    /* JADX INFO: renamed from: iw1.b$c */
    @Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b,\u00102R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010&\u001a\u0004\b%\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010&\u001a\u0004\b3\u0010\u001cR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b9\u0010\u001cR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010&\u001a\u0004\b7\u0010\u001cR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b;\u0010\u001cR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b5\u0010<\u001a\u0004\b8\u0010=R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010&\u001a\u0004\b>\u0010\u001cR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010?\u001a\u0004\b(\u0010@R%\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b:\u0010C¨\u0006D"}, m65681d2 = {"Liw1/b$c;", "Liw1/b;", "", "title", "Llw1/j;", "paymentOptions", "Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;", "orderDetails", "", "Lcom/whoop/membership/extensions/domain/models/OrderOption;", "orderOptions", "Llw1/k;", "promoCodeViewState", "promoCode", "checkoutCtaTitle", "securityFooter", "disclaimerFooterMarkdown", "payload", "Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;", "nextStepPrefetchContent", "path", "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "payloadV2", "", "payloadReactivations", "<init>", "(Ljava/lang/String;Llw1/j;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;Ljava/util/List;Llw1/k;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;Ljava/lang/String;Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "m", "b", "Llw1/j;", "j", "()Llw1/j;", "c", "Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;", "d", "Ljava/util/List;", "()Ljava/util/List;", "e", "Llw1/k;", "k", "()Llw1/k;", "f", "g", "l", "i", "getPayload", "Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;", "()Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;", "getPath", "Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;", "n", "Ljava/util/Map;", "()Ljava/util/Map;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC20996b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C24774j paymentOptions;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final NativeOrderDetails orderDetails;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<OrderOption> orderOptions;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C24775k promoCodeViewState;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final String promoCode;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String checkoutCtaTitle;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final String securityFooter;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final String disclaimerFooterMarkdown;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final String payload;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final StepPrefetchContent nextStepPrefetchContent;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final String path;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final CheckoutPayload payloadV2;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final Map<String, String> payloadReactivations;

        public c(String title, C24774j paymentOptions, NativeOrderDetails orderDetails, List<OrderOption> orderOptions, C24775k c24775k, String str, String checkoutCtaTitle, String securityFooter, String disclaimerFooterMarkdown, String payload, StepPrefetchContent nextStepPrefetchContent, String str2, CheckoutPayload checkoutPayload, Map<String, String> map) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(paymentOptions, "paymentOptions");
            AbstractC22676k.m65750j(orderDetails, "orderDetails");
            AbstractC22676k.m65750j(orderOptions, "orderOptions");
            AbstractC22676k.m65750j(checkoutCtaTitle, "checkoutCtaTitle");
            AbstractC22676k.m65750j(securityFooter, "securityFooter");
            AbstractC22676k.m65750j(disclaimerFooterMarkdown, "disclaimerFooterMarkdown");
            AbstractC22676k.m65750j(payload, "payload");
            AbstractC22676k.m65750j(nextStepPrefetchContent, "nextStepPrefetchContent");
            this.title = title;
            this.paymentOptions = paymentOptions;
            this.orderDetails = orderDetails;
            this.orderOptions = orderOptions;
            this.promoCodeViewState = c24775k;
            this.promoCode = str;
            this.checkoutCtaTitle = checkoutCtaTitle;
            this.securityFooter = securityFooter;
            this.disclaimerFooterMarkdown = disclaimerFooterMarkdown;
            this.payload = payload;
            this.nextStepPrefetchContent = nextStepPrefetchContent;
            this.path = str2;
            this.payloadV2 = checkoutPayload;
            this.payloadReactivations = map;
        }

        @Override // iw1.InterfaceC20996b
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getPromoCode() {
            return this.promoCode;
        }

        @Override // iw1.InterfaceC20996b
        /* JADX INFO: renamed from: b, reason: from getter */
        public CheckoutPayload getPayloadV2() {
            return this.payloadV2;
        }

        /* JADX INFO: renamed from: c */
        public final List<OrderOption> m58511c() {
            return this.orderOptions;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getCheckoutCtaTitle() {
            return this.checkoutCtaTitle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.title, cVar.title) && AbstractC22676k.m65745e(this.paymentOptions, cVar.paymentOptions) && AbstractC22676k.m65745e(this.orderDetails, cVar.orderDetails) && AbstractC22676k.m65745e(this.orderOptions, cVar.orderOptions) && AbstractC22676k.m65745e(this.promoCodeViewState, cVar.promoCodeViewState) && AbstractC22676k.m65745e(this.promoCode, cVar.promoCode) && AbstractC22676k.m65745e(this.checkoutCtaTitle, cVar.checkoutCtaTitle) && AbstractC22676k.m65745e(this.securityFooter, cVar.securityFooter) && AbstractC22676k.m65745e(this.disclaimerFooterMarkdown, cVar.disclaimerFooterMarkdown) && AbstractC22676k.m65745e(this.payload, cVar.payload) && AbstractC22676k.m65745e(this.nextStepPrefetchContent, cVar.nextStepPrefetchContent) && AbstractC22676k.m65745e(this.path, cVar.path) && AbstractC22676k.m65745e(this.payloadV2, cVar.payloadV2) && AbstractC22676k.m65745e(this.payloadReactivations, cVar.payloadReactivations);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getDisclaimerFooterMarkdown() {
            return this.disclaimerFooterMarkdown;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final StepPrefetchContent getNextStepPrefetchContent() {
            return this.nextStepPrefetchContent;
        }

        @Override // iw1.InterfaceC20996b
        public String getPath() {
            return this.path;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final NativeOrderDetails getOrderDetails() {
            return this.orderDetails;
        }

        public int hashCode() {
            int iM31983b = AbstractC11895b.m31983b((this.orderDetails.hashCode() + ((this.paymentOptions.hashCode() + (this.title.hashCode() * 31)) * 31)) * 31, 31, this.orderOptions);
            C24775k c24775k = this.promoCodeViewState;
            int iHashCode = (iM31983b + (c24775k == null ? 0 : c24775k.hashCode())) * 31;
            String str = this.promoCode;
            int iHashCode2 = (this.nextStepPrefetchContent.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.checkoutCtaTitle), 31, this.securityFooter), 31, this.disclaimerFooterMarkdown), 31, this.payload)) * 31;
            String str2 = this.path;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            CheckoutPayload checkoutPayload = this.payloadV2;
            int iHashCode4 = (iHashCode3 + (checkoutPayload == null ? 0 : checkoutPayload.hashCode())) * 31;
            Map<String, String> map = this.payloadReactivations;
            return iHashCode4 + (map != null ? map.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i */
        public final Map<String, String> m58516i() {
            return this.payloadReactivations;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final C24774j getPaymentOptions() {
            return this.paymentOptions;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final C24775k getPromoCodeViewState() {
            return this.promoCodeViewState;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getSecurityFooter() {
            return this.securityFooter;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public String toString() {
            String str = this.title;
            C24774j c24774j = this.paymentOptions;
            NativeOrderDetails nativeOrderDetails = this.orderDetails;
            List<OrderOption> list = this.orderOptions;
            C24775k c24775k = this.promoCodeViewState;
            String str2 = this.promoCode;
            String str3 = this.checkoutCtaTitle;
            String str4 = this.securityFooter;
            String str5 = this.disclaimerFooterMarkdown;
            String str6 = this.payload;
            StepPrefetchContent stepPrefetchContent = this.nextStepPrefetchContent;
            String str7 = this.path;
            CheckoutPayload checkoutPayload = this.payloadV2;
            Map<String, String> map = this.payloadReactivations;
            StringBuilder sb4 = new StringBuilder("Success(title=");
            sb4.append(str);
            sb4.append(", paymentOptions=");
            sb4.append(c24774j);
            sb4.append(", orderDetails=");
            sb4.append(nativeOrderDetails);
            sb4.append(", orderOptions=");
            sb4.append(list);
            sb4.append(", promoCodeViewState=");
            sb4.append(c24775k);
            sb4.append(", promoCode=");
            sb4.append(str2);
            sb4.append(", checkoutCtaTitle=");
            AbstractC11266d.m30444B(sb4, str3, ", securityFooter=", str4, ", disclaimerFooterMarkdown=");
            AbstractC11266d.m30444B(sb4, str5, ", payload=", str6, ", nextStepPrefetchContent=");
            sb4.append(stepPrefetchContent);
            sb4.append(", path=");
            sb4.append(str7);
            sb4.append(", payloadV2=");
            sb4.append(checkoutPayload);
            sb4.append(", payloadReactivations=");
            sb4.append(map);
            sb4.append(")");
            return sb4.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    String getPromoCode();

    /* JADX INFO: renamed from: b */
    CheckoutPayload getPayloadV2();

    String getPath();
}
