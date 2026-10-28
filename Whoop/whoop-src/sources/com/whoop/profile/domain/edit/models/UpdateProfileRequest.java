package com.whoop.profile.domain.edit.models;

import androidx.core.app.NotificationCompat;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.profile.domain.models.Gender;
import com.whoop.profile.domain.models.PhysiologicalBaseline;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import qv1.C30654e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u0000 \\2\u00020\u0001:\u0002]\\B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014B\u0099\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJ\u0010\u0010#\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001bJ\u009a\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u001bJ\u0010\u0010.\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103J'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001¢\u0006\u0004\b:\u0010;R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010=\u0012\u0004\b?\u0010@\u001a\u0004\b>\u0010\u001bR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010=\u0012\u0004\bB\u0010@\u001a\u0004\bA\u0010\u001bR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010=\u0012\u0004\bD\u0010@\u001a\u0004\bC\u0010\u001bR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010=\u0012\u0004\bF\u0010@\u001a\u0004\bE\u0010\u001bR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010=\u0012\u0004\bH\u0010@\u001a\u0004\bG\u0010\u001bR\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010=\u0012\u0004\bJ\u0010@\u001a\u0004\bI\u0010\u001bR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010=\u0012\u0004\bL\u0010@\u001a\u0004\bK\u0010\u001bR \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010=\u0012\u0004\bN\u0010@\u001a\u0004\bM\u0010\u001bR \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010O\u0012\u0004\bQ\u0010@\u001a\u0004\bP\u0010$R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010R\u0012\u0004\bT\u0010@\u001a\u0004\bS\u0010&R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010U\u0012\u0004\bW\u0010@\u001a\u0004\bV\u0010(R \u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010U\u0012\u0004\bY\u0010@\u001a\u0004\bX\u0010(R \u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010=\u0012\u0004\b[\u0010@\u001a\u0004\bZ\u0010\u001b¨\u0006^"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;", "", "", NotificationCompat.CATEGORY_EMAIL, "username", "firstName", "lastName", "country", "state", "city", "birthday", "Lcom/whoop/profile/domain/models/Gender;", "gender", "Lcom/whoop/profile/domain/models/PhysiologicalBaseline;", "physiologicalBaseline", "", "height", "weight", "unitSystem", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;FFLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;FFLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Lcom/whoop/profile/domain/models/Gender;", "component10", "()Lcom/whoop/profile/domain/models/PhysiologicalBaseline;", "component11", "()F", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;FFLjava/lang/String;)Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$profile_release", "(Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getEmail", "getEmail$annotations", "()V", "getUsername", "getUsername$annotations", "getFirstName", "getFirstName$annotations", "getLastName", "getLastName$annotations", "getCountry", "getCountry$annotations", "getState", "getState$annotations", "getCity", "getCity$annotations", "getBirthday", "getBirthday$annotations", "Lcom/whoop/profile/domain/models/Gender;", "getGender", "getGender$annotations", "Lcom/whoop/profile/domain/models/PhysiologicalBaseline;", "getPhysiologicalBaseline", "getPhysiologicalBaseline$annotations", "F", "getHeight", "getHeight$annotations", "getWeight", "getWeight$annotations", "getUnitSystem", "getUnitSystem$annotations", "Companion", "$serializer", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UpdateProfileRequest {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String birthday;
    private final String city;
    private final String country;
    private final String email;
    private final String firstName;
    private final Gender gender;
    private final float height;
    private final String lastName;
    private final PhysiologicalBaseline physiologicalBaseline;
    private final String state;
    private final String unitSystem;
    private final String username;
    private final float weight;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;", "serializer", "()Lwc3/c;", "profile_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return UpdateProfileRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C30654e(14)), AbstractC30060g.m92087G(enumC23463i, new C30654e(15)), null, null, null};
    }

    public /* synthetic */ UpdateProfileRequest(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Gender gender, PhysiologicalBaseline physiologicalBaseline, float f13, float f14, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if (7583 != (i13 & 7583)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7583, UpdateProfileRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.email = str;
        this.username = str2;
        this.firstName = str3;
        this.lastName = str4;
        this.country = str5;
        if ((i13 & 32) == 0) {
            this.state = null;
        } else {
            this.state = str6;
        }
        if ((i13 & 64) == 0) {
            this.city = null;
        } else {
            this.city = str7;
        }
        this.birthday = str8;
        this.gender = gender;
        if ((i13 & 512) == 0) {
            this.physiologicalBaseline = null;
        } else {
            this.physiologicalBaseline = physiologicalBaseline;
        }
        this.height = f13;
        this.weight = f14;
        this.unitSystem = str9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return Gender.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return PhysiologicalBaseline.INSTANCE.serializer();
    }

    public static /* synthetic */ UpdateProfileRequest copy$default(UpdateProfileRequest updateProfileRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Gender gender, PhysiologicalBaseline physiologicalBaseline, float f13, float f14, String str9, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = updateProfileRequest.email;
        }
        return updateProfileRequest.copy(str, (i13 & 2) != 0 ? updateProfileRequest.username : str2, (i13 & 4) != 0 ? updateProfileRequest.firstName : str3, (i13 & 8) != 0 ? updateProfileRequest.lastName : str4, (i13 & 16) != 0 ? updateProfileRequest.country : str5, (i13 & 32) != 0 ? updateProfileRequest.state : str6, (i13 & 64) != 0 ? updateProfileRequest.city : str7, (i13 & 128) != 0 ? updateProfileRequest.birthday : str8, (i13 & 256) != 0 ? updateProfileRequest.gender : gender, (i13 & 512) != 0 ? updateProfileRequest.physiologicalBaseline : physiologicalBaseline, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? updateProfileRequest.height : f13, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? updateProfileRequest.weight : f14, (i13 & 4096) != 0 ? updateProfileRequest.unitSystem : str9);
    }

    @InterfaceC37143h("birthday")
    public static /* synthetic */ void getBirthday$annotations() {
    }

    @InterfaceC37143h("city")
    public static /* synthetic */ void getCity$annotations() {
    }

    @InterfaceC37143h("country")
    public static /* synthetic */ void getCountry$annotations() {
    }

    @InterfaceC37143h(NotificationCompat.CATEGORY_EMAIL)
    public static /* synthetic */ void getEmail$annotations() {
    }

    @InterfaceC37143h("first_name")
    public static /* synthetic */ void getFirstName$annotations() {
    }

    @InterfaceC37143h("gender")
    public static /* synthetic */ void getGender$annotations() {
    }

    @InterfaceC37143h("height")
    public static /* synthetic */ void getHeight$annotations() {
    }

    @InterfaceC37143h("last_name")
    public static /* synthetic */ void getLastName$annotations() {
    }

    @InterfaceC37143h("physiological_baseline")
    public static /* synthetic */ void getPhysiologicalBaseline$annotations() {
    }

    @InterfaceC37143h("state")
    public static /* synthetic */ void getState$annotations() {
    }

    @InterfaceC37143h("unit_system")
    public static /* synthetic */ void getUnitSystem$annotations() {
    }

    @InterfaceC37143h("username")
    public static /* synthetic */ void getUsername$annotations() {
    }

    @InterfaceC37143h("weight")
    public static /* synthetic */ void getWeight$annotations() {
    }

    public static final /* synthetic */ void write$Self$profile_release(UpdateProfileRequest self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.email);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.username);
        output.encodeStringElement(serialDesc, 2, self.firstName);
        output.encodeStringElement(serialDesc, 3, self.lastName);
        output.encodeStringElement(serialDesc, 4, self.country);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.state != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.state);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.city != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.city);
        }
        output.encodeStringElement(serialDesc, 7, self.birthday);
        output.encodeSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.gender);
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.physiologicalBaseline != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, (InterfaceC37145j) interfaceC23462hArr[9].getValue(), self.physiologicalBaseline);
        }
        output.encodeFloatElement(serialDesc, 10, self.height);
        output.encodeFloatElement(serialDesc, 11, self.weight);
        output.encodeStringElement(serialDesc, 12, self.unitSystem);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final PhysiologicalBaseline getPhysiologicalBaseline() {
        return this.physiologicalBaseline;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getUnitSystem() {
        return this.unitSystem;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBirthday() {
        return this.birthday;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Gender getGender() {
        return this.gender;
    }

    public final UpdateProfileRequest copy(String email, String username, String firstName, String lastName, String country, String state, String city, String birthday, Gender gender, PhysiologicalBaseline physiologicalBaseline, float height, float weight, String unitSystem) {
        AbstractC22676k.m65750j(email, "email");
        AbstractC22676k.m65750j(firstName, "firstName");
        AbstractC22676k.m65750j(lastName, "lastName");
        AbstractC22676k.m65750j(country, "country");
        AbstractC22676k.m65750j(birthday, "birthday");
        AbstractC22676k.m65750j(gender, "gender");
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        return new UpdateProfileRequest(email, username, firstName, lastName, country, state, city, birthday, gender, physiologicalBaseline, height, weight, unitSystem);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateProfileRequest)) {
            return false;
        }
        UpdateProfileRequest updateProfileRequest = (UpdateProfileRequest) other;
        return AbstractC22676k.m65745e(this.email, updateProfileRequest.email) && AbstractC22676k.m65745e(this.username, updateProfileRequest.username) && AbstractC22676k.m65745e(this.firstName, updateProfileRequest.firstName) && AbstractC22676k.m65745e(this.lastName, updateProfileRequest.lastName) && AbstractC22676k.m65745e(this.country, updateProfileRequest.country) && AbstractC22676k.m65745e(this.state, updateProfileRequest.state) && AbstractC22676k.m65745e(this.city, updateProfileRequest.city) && AbstractC22676k.m65745e(this.birthday, updateProfileRequest.birthday) && this.gender == updateProfileRequest.gender && this.physiologicalBaseline == updateProfileRequest.physiologicalBaseline && Float.compare(this.height, updateProfileRequest.height) == 0 && Float.compare(this.weight, updateProfileRequest.weight) == 0 && AbstractC22676k.m65745e(this.unitSystem, updateProfileRequest.unitSystem);
    }

    public final String getBirthday() {
        return this.birthday;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final Gender getGender() {
        return this.gender;
    }

    public final float getHeight() {
        return this.height;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final PhysiologicalBaseline getPhysiologicalBaseline() {
        return this.physiologicalBaseline;
    }

    public final String getState() {
        return this.state;
    }

    public final String getUnitSystem() {
        return this.unitSystem;
    }

    public final String getUsername() {
        return this.username;
    }

    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int iHashCode = this.email.hashCode() * 31;
        String str = this.username;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.firstName), 31, this.lastName), 31, this.country);
        String str2 = this.state;
        int iHashCode2 = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.city;
        int iHashCode3 = (this.gender.hashCode() + AbstractC11266d.m30450d((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.birthday)) * 31;
        PhysiologicalBaseline physiologicalBaseline = this.physiologicalBaseline;
        return this.unitSystem.hashCode() + AbstractC11266d.m30447a(this.weight, AbstractC11266d.m30447a(this.height, (iHashCode3 + (physiologicalBaseline != null ? physiologicalBaseline.hashCode() : 0)) * 31, 31), 31);
    }

    public String toString() {
        String str = this.email;
        String str2 = this.username;
        String str3 = this.firstName;
        String str4 = this.lastName;
        String str5 = this.country;
        String str6 = this.state;
        String str7 = this.city;
        String str8 = this.birthday;
        Gender gender = this.gender;
        PhysiologicalBaseline physiologicalBaseline = this.physiologicalBaseline;
        float f13 = this.height;
        float f14 = this.weight;
        String str9 = this.unitSystem;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("UpdateProfileRequest(email=", str, ", username=", str2, ", firstName=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", lastName=", str4, ", country=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", state=", str6, ", city=");
        AbstractC11266d.m30444B(sbM32001t, str7, ", birthday=", str8, ", gender=");
        sbM32001t.append(gender);
        sbM32001t.append(", physiologicalBaseline=");
        sbM32001t.append(physiologicalBaseline);
        sbM32001t.append(", height=");
        AbstractC30802r.m94772u(sbM32001t, f13, ", weight=", f14, ", unitSystem=");
        return AbstractC25012a.m73376i(str9, ")", sbM32001t);
    }

    public UpdateProfileRequest(String email, String str, String firstName, String lastName, String country, String str2, String str3, String birthday, Gender gender, PhysiologicalBaseline physiologicalBaseline, float f13, float f14, String unitSystem) {
        AbstractC22676k.m65750j(email, "email");
        AbstractC22676k.m65750j(firstName, "firstName");
        AbstractC22676k.m65750j(lastName, "lastName");
        AbstractC22676k.m65750j(country, "country");
        AbstractC22676k.m65750j(birthday, "birthday");
        AbstractC22676k.m65750j(gender, "gender");
        AbstractC22676k.m65750j(unitSystem, "unitSystem");
        this.email = email;
        this.username = str;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.state = str2;
        this.city = str3;
        this.birthday = birthday;
        this.gender = gender;
        this.physiologicalBaseline = physiologicalBaseline;
        this.height = f13;
        this.weight = f14;
        this.unitSystem = unitSystem;
    }

    public /* synthetic */ UpdateProfileRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Gender gender, PhysiologicalBaseline physiologicalBaseline, float f13, float f14, String str9, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i13 & 32) != 0 ? null : str6, (i13 & 64) != 0 ? null : str7, str8, gender, (i13 & 512) != 0 ? null : physiologicalBaseline, f13, f14, str9);
    }
}
