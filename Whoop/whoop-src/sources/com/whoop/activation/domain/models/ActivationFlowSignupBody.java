package com.whoop.activation.domain.models;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBa\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010\u0012J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0012J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0012JZ\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010+R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b-\u0010\u0012¨\u00060"}, m65681d2 = {"Lcom/whoop/activation/domain/models/ActivationFlowSignupBody;", "", "", NotificationCompat.CATEGORY_EMAIL, "password", "username", "firstName", "lastName", "country", "adminDivision", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/ActivationFlowSignupBody;Lzc3/c;Lyc3/g;)V", "write$Self", "toString", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/activation/domain/models/ActivationFlowSignupBody;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCountry", "getAdminDivision", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ActivationFlowSignupBody {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("admin_division")
    private final String adminDivision;

    @SerializedName("country")
    private final String country;

    @SerializedName(NotificationCompat.CATEGORY_EMAIL)
    private final String email;

    @SerializedName("first_name")
    private final String firstName;

    @SerializedName("last_name")
    private final String lastName;

    @SerializedName("password")
    private final String password;

    @SerializedName("username")
    private final String username;

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/ActivationFlowSignupBody$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/ActivationFlowSignupBody;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ActivationFlowSignupBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ActivationFlowSignupBody(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (59 != (i13 & 59)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 59, ActivationFlowSignupBody$$serializer.INSTANCE.getDescriptor());
        }
        this.email = str;
        this.password = str2;
        if ((i13 & 4) == 0) {
            this.username = null;
        } else {
            this.username = str3;
        }
        this.firstName = str4;
        this.lastName = str5;
        this.country = str6;
        if ((i13 & 64) == 0) {
            this.adminDivision = null;
        } else {
            this.adminDivision = str7;
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final String getPassword() {
        return this.password;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final String getUsername() {
        return this.username;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    private final String getLastName() {
        return this.lastName;
    }

    public static /* synthetic */ ActivationFlowSignupBody copy$default(ActivationFlowSignupBody activationFlowSignupBody, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = activationFlowSignupBody.email;
        }
        if ((i13 & 2) != 0) {
            str2 = activationFlowSignupBody.password;
        }
        if ((i13 & 4) != 0) {
            str3 = activationFlowSignupBody.username;
        }
        if ((i13 & 8) != 0) {
            str4 = activationFlowSignupBody.firstName;
        }
        if ((i13 & 16) != 0) {
            str5 = activationFlowSignupBody.lastName;
        }
        if ((i13 & 32) != 0) {
            str6 = activationFlowSignupBody.country;
        }
        if ((i13 & 64) != 0) {
            str7 = activationFlowSignupBody.adminDivision;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return activationFlowSignupBody.copy(str, str2, str11, str4, str10, str8, str9);
    }

    public static final /* synthetic */ void write$Self$activation_release(ActivationFlowSignupBody self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.email);
        output.encodeStringElement(serialDesc, 1, self.password);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.username != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.username);
        }
        output.encodeStringElement(serialDesc, 3, self.firstName);
        output.encodeStringElement(serialDesc, 4, self.lastName);
        output.encodeStringElement(serialDesc, 5, self.country);
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.adminDivision == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.adminDivision);
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAdminDivision() {
        return this.adminDivision;
    }

    public final ActivationFlowSignupBody copy(String email, String password, String username, String firstName, String lastName, String country, String adminDivision) {
        AbstractC22676k.m65750j(email, "email");
        AbstractC22676k.m65750j(password, "password");
        AbstractC22676k.m65750j(firstName, "firstName");
        AbstractC22676k.m65750j(lastName, "lastName");
        AbstractC22676k.m65750j(country, "country");
        return new ActivationFlowSignupBody(email, password, username, firstName, lastName, country, adminDivision);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivationFlowSignupBody)) {
            return false;
        }
        ActivationFlowSignupBody activationFlowSignupBody = (ActivationFlowSignupBody) other;
        return AbstractC22676k.m65745e(this.email, activationFlowSignupBody.email) && AbstractC22676k.m65745e(this.password, activationFlowSignupBody.password) && AbstractC22676k.m65745e(this.username, activationFlowSignupBody.username) && AbstractC22676k.m65745e(this.firstName, activationFlowSignupBody.firstName) && AbstractC22676k.m65745e(this.lastName, activationFlowSignupBody.lastName) && AbstractC22676k.m65745e(this.country, activationFlowSignupBody.country) && AbstractC22676k.m65745e(this.adminDivision, activationFlowSignupBody.adminDivision);
    }

    public final String getAdminDivision() {
        return this.adminDivision;
    }

    public final String getCountry() {
        return this.country;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.email.hashCode() * 31, 31, this.password);
        String str = this.username;
        int iM30450d2 = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.firstName), 31, this.lastName), 31, this.country);
        String str2 = this.adminDivision;
        return iM30450d2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return AbstractC2875y.m8300m("ActivationFlowSignupBody(email='REDACTED', password='REDACTED', username='REDACTED', firstName='REDACTED', lastName='REDACTED', country='", this.country, "', adminDivision=", this.adminDivision, ")");
    }

    public ActivationFlowSignupBody(String email, String password, String str, String firstName, String lastName, String country, String str2) {
        AbstractC22676k.m65750j(email, "email");
        AbstractC22676k.m65750j(password, "password");
        AbstractC22676k.m65750j(firstName, "firstName");
        AbstractC22676k.m65750j(lastName, "lastName");
        AbstractC22676k.m65750j(country, "country");
        this.email = email;
        this.password = password;
        this.username = str;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.adminDivision = str2;
    }

    public /* synthetic */ ActivationFlowSignupBody(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : str3, str4, str5, str6, (i13 & 64) != 0 ? null : str7);
    }
}
