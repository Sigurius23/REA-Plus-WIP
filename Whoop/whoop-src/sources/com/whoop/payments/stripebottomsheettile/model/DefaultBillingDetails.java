package com.whoop.payments.stripebottomsheettile.model;

import androidx.core.app.NotificationCompat;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, m65681d2 = {"Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;", "", "Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingAddress;", "address", "", NotificationCompat.CATEGORY_EMAIL, "<init>", "(Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingAddress;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/payments/stripebottomsheettile/model/DefaultBillingAddress;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$payments_release", "(Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingAddress;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingAddress;Ljava/lang/String;)Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingAddress;", "getAddress", "Ljava/lang/String;", "getEmail", "Companion", "$serializer", "a", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DefaultBillingDetails {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final DefaultBillingAddress address;
    private final String email;

    /* JADX INFO: renamed from: com.whoop.payments.stripebottomsheettile.model.DefaultBillingDetails$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;", "serializer", "()Lwc3/c;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DefaultBillingDetails$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultBillingDetails() {
        this((DefaultBillingAddress) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ DefaultBillingDetails copy$default(DefaultBillingDetails defaultBillingDetails, DefaultBillingAddress defaultBillingAddress, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            defaultBillingAddress = defaultBillingDetails.address;
        }
        if ((i13 & 2) != 0) {
            str = defaultBillingDetails.email;
        }
        return defaultBillingDetails.copy(defaultBillingAddress, str);
    }

    public static final /* synthetic */ void write$Self$payments_release(DefaultBillingDetails self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.address != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, DefaultBillingAddress$$serializer.INSTANCE, self.address);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.email == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.email);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DefaultBillingAddress getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public final DefaultBillingDetails copy(DefaultBillingAddress address, String email) {
        return new DefaultBillingDetails(address, email);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultBillingDetails)) {
            return false;
        }
        DefaultBillingDetails defaultBillingDetails = (DefaultBillingDetails) other;
        return AbstractC22676k.m65745e(this.address, defaultBillingDetails.address) && AbstractC22676k.m65745e(this.email, defaultBillingDetails.email);
    }

    public final DefaultBillingAddress getAddress() {
        return this.address;
    }

    public final String getEmail() {
        return this.email;
    }

    public int hashCode() {
        DefaultBillingAddress defaultBillingAddress = this.address;
        int iHashCode = (defaultBillingAddress == null ? 0 : defaultBillingAddress.hashCode()) * 31;
        String str = this.email;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "DefaultBillingDetails(address=" + this.address + ", email=" + this.email + ")";
    }

    public /* synthetic */ DefaultBillingDetails(int i13, DefaultBillingAddress defaultBillingAddress, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.address = null;
        } else {
            this.address = defaultBillingAddress;
        }
        if ((i13 & 2) == 0) {
            this.email = null;
        } else {
            this.email = str;
        }
    }

    public DefaultBillingDetails(DefaultBillingAddress defaultBillingAddress, String str) {
        this.address = defaultBillingAddress;
        this.email = str;
    }

    public /* synthetic */ DefaultBillingDetails(DefaultBillingAddress defaultBillingAddress, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : defaultBillingAddress, (i13 & 2) != 0 ? null : str);
    }
}
