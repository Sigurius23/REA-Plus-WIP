package com.whoop.activation.domain.models;

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
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0010J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0010JF\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010'R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b)\u0010\u0010¨\u0006,"}, m65681d2 = {"Lcom/whoop/activation/domain/models/FinishAccountCreationBody;", "", "", "firstName", "lastName", "username", "country", "adminDivision", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/FinishAccountCreationBody;Lzc3/c;Lyc3/g;)V", "write$Self", "toString", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/activation/domain/models/FinishAccountCreationBody;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCountry", "getAdminDivision", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FinishAccountCreationBody {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("admin_division")
    private final String adminDivision;

    @SerializedName("country")
    private final String country;

    @SerializedName("first_name")
    private final String firstName;

    @SerializedName("last_name")
    private final String lastName;

    @SerializedName("username")
    private final String username;

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/FinishAccountCreationBody$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/FinishAccountCreationBody;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FinishAccountCreationBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ FinishAccountCreationBody(int i13, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i13 & 11)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 11, FinishAccountCreationBody$$serializer.INSTANCE.getDescriptor());
        }
        this.firstName = str;
        this.lastName = str2;
        if ((i13 & 4) == 0) {
            this.username = null;
        } else {
            this.username = str3;
        }
        this.country = str4;
        if ((i13 & 16) == 0) {
            this.adminDivision = null;
        } else {
            this.adminDivision = str5;
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final String getUsername() {
        return this.username;
    }

    public static /* synthetic */ FinishAccountCreationBody copy$default(FinishAccountCreationBody finishAccountCreationBody, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = finishAccountCreationBody.firstName;
        }
        if ((i13 & 2) != 0) {
            str2 = finishAccountCreationBody.lastName;
        }
        if ((i13 & 4) != 0) {
            str3 = finishAccountCreationBody.username;
        }
        if ((i13 & 8) != 0) {
            str4 = finishAccountCreationBody.country;
        }
        if ((i13 & 16) != 0) {
            str5 = finishAccountCreationBody.adminDivision;
        }
        String str6 = str5;
        String str7 = str3;
        return finishAccountCreationBody.copy(str, str2, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$activation_release(FinishAccountCreationBody self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.firstName);
        output.encodeStringElement(serialDesc, 1, self.lastName);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.username != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.username);
        }
        output.encodeStringElement(serialDesc, 3, self.country);
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.adminDivision == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.adminDivision);
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAdminDivision() {
        return this.adminDivision;
    }

    public final FinishAccountCreationBody copy(String firstName, String lastName, String username, String country, String adminDivision) {
        AbstractC22676k.m65750j(firstName, "firstName");
        AbstractC22676k.m65750j(lastName, "lastName");
        AbstractC22676k.m65750j(country, "country");
        return new FinishAccountCreationBody(firstName, lastName, username, country, adminDivision);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinishAccountCreationBody)) {
            return false;
        }
        FinishAccountCreationBody finishAccountCreationBody = (FinishAccountCreationBody) other;
        return AbstractC22676k.m65745e(this.firstName, finishAccountCreationBody.firstName) && AbstractC22676k.m65745e(this.lastName, finishAccountCreationBody.lastName) && AbstractC22676k.m65745e(this.username, finishAccountCreationBody.username) && AbstractC22676k.m65745e(this.country, finishAccountCreationBody.country) && AbstractC22676k.m65745e(this.adminDivision, finishAccountCreationBody.adminDivision);
    }

    public final String getAdminDivision() {
        return this.adminDivision;
    }

    public final String getCountry() {
        return this.country;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.firstName.hashCode() * 31, 31, this.lastName);
        String str = this.username;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.country);
        String str2 = this.adminDivision;
        return iM30450d2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return AbstractC2875y.m8300m("FinishAccountCreationBody(firstName='REDACTED', lastName='REDACTED', country='", this.country, "', adminDivision=", this.adminDivision, ")");
    }

    public FinishAccountCreationBody(String firstName, String lastName, String str, String country, String str2) {
        AbstractC22676k.m65750j(firstName, "firstName");
        AbstractC22676k.m65750j(lastName, "lastName");
        AbstractC22676k.m65750j(country, "country");
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = str;
        this.country = country;
        this.adminDivision = str2;
    }

    public /* synthetic */ FinishAccountCreationBody(String str, String str2, String str3, String str4, String str5, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : str3, str4, (i13 & 16) != 0 ? null : str5);
    }
}
