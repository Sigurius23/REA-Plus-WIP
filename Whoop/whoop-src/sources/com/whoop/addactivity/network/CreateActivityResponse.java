package com.whoop.addactivity.network;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;<BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rBi\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001cJ`\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001cJ\u0010\u0010(\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b(\u0010 J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010 R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b3\u0010\u001cR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010-\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010\u001cR \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010-\u0012\u0004\b8\u00106\u001a\u0004\b7\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b9\u0010\u001c¨\u0006="}, m65681d2 = {"Lcom/whoop/addactivity/network/CreateActivityResponse;", "", "", "createdAt", "updatedAt", "id", "", "userId", "during", "timeZoneOffset", "state", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/addactivity/network/CreateActivityResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()I", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/addactivity/network/CreateActivityResponse;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCreatedAt", "getUpdatedAt", "getId", "I", "getUserId", "getDuring", "getTimeZoneOffset", "getTimeZoneOffset$annotations", "()V", "getState", "getState$annotations", "getSource", "Companion", "$serializer", "a", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CreateActivityResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("created_at")
    private final String createdAt;

    @SerializedName("during")
    private final String during;

    @SerializedName("id")
    private final String id;

    @SerializedName("source")
    private final String source;

    @SerializedName("score_state")
    private final String state;

    @SerializedName("timezone_offset")
    private final String timeZoneOffset;

    @SerializedName("updated_at")
    private final String updatedAt;

    @SerializedName("user_id")
    private final int userId;

    /* JADX INFO: renamed from: com.whoop.addactivity.network.CreateActivityResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/addactivity/network/CreateActivityResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/addactivity/network/CreateActivityResponse;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CreateActivityResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CreateActivityResponse(int i13, String str, String str2, String str3, int i14, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (223 != (i13 & 223)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 223, CreateActivityResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.createdAt = str;
        this.updatedAt = str2;
        this.id = str3;
        this.userId = i14;
        this.during = str4;
        if ((i13 & 32) == 0) {
            this.timeZoneOffset = "+0000";
        } else {
            this.timeZoneOffset = str5;
        }
        this.state = str6;
        this.source = str7;
    }

    public static /* synthetic */ CreateActivityResponse copy$default(CreateActivityResponse createActivityResponse, String str, String str2, String str3, int i13, String str4, String str5, String str6, String str7, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = createActivityResponse.createdAt;
        }
        if ((i14 & 2) != 0) {
            str2 = createActivityResponse.updatedAt;
        }
        if ((i14 & 4) != 0) {
            str3 = createActivityResponse.id;
        }
        if ((i14 & 8) != 0) {
            i13 = createActivityResponse.userId;
        }
        if ((i14 & 16) != 0) {
            str4 = createActivityResponse.during;
        }
        if ((i14 & 32) != 0) {
            str5 = createActivityResponse.timeZoneOffset;
        }
        if ((i14 & 64) != 0) {
            str6 = createActivityResponse.state;
        }
        if ((i14 & 128) != 0) {
            str7 = createActivityResponse.source;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        return createActivityResponse.copy(str, str2, str3, i13, str10, str11, str8, str9);
    }

    @InterfaceC37143h("score_state")
    public static /* synthetic */ void getState$annotations() {
    }

    @InterfaceC37143h("timezone_offset")
    public static /* synthetic */ void getTimeZoneOffset$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_release(CreateActivityResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.createdAt);
        output.encodeStringElement(serialDesc, 1, self.updatedAt);
        output.encodeStringElement(serialDesc, 2, self.id);
        output.encodeIntElement(serialDesc, 3, self.userId);
        output.encodeStringElement(serialDesc, 4, self.during);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !AbstractC22676k.m65745e(self.timeZoneOffset, "+0000")) {
            output.encodeStringElement(serialDesc, 5, self.timeZoneOffset);
        }
        output.encodeStringElement(serialDesc, 6, self.state);
        output.encodeStringElement(serialDesc, 7, self.source);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDuring() {
        return this.during;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTimeZoneOffset() {
        return this.timeZoneOffset;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final CreateActivityResponse copy(String createdAt, String updatedAt, String id4, int userId, String during, String timeZoneOffset, String state, String source) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(during, "during");
        AbstractC22676k.m65750j(timeZoneOffset, "timeZoneOffset");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(source, "source");
        return new CreateActivityResponse(createdAt, updatedAt, id4, userId, during, timeZoneOffset, state, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateActivityResponse)) {
            return false;
        }
        CreateActivityResponse createActivityResponse = (CreateActivityResponse) other;
        return AbstractC22676k.m65745e(this.createdAt, createActivityResponse.createdAt) && AbstractC22676k.m65745e(this.updatedAt, createActivityResponse.updatedAt) && AbstractC22676k.m65745e(this.id, createActivityResponse.id) && this.userId == createActivityResponse.userId && AbstractC22676k.m65745e(this.during, createActivityResponse.during) && AbstractC22676k.m65745e(this.timeZoneOffset, createActivityResponse.timeZoneOffset) && AbstractC22676k.m65745e(this.state, createActivityResponse.state) && AbstractC22676k.m65745e(this.source, createActivityResponse.source);
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getDuring() {
        return this.during;
    }

    public final String getId() {
        return this.id;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getState() {
        return this.state;
    }

    public final String getTimeZoneOffset() {
        return this.timeZoneOffset;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.source.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.userId, AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.createdAt.hashCode() * 31, 31, this.updatedAt), 31, this.id), 31), 31, this.during), 31, this.timeZoneOffset), 31, this.state);
    }

    public String toString() {
        String str = this.createdAt;
        String str2 = this.updatedAt;
        String str3 = this.id;
        int i13 = this.userId;
        String str4 = this.during;
        String str5 = this.timeZoneOffset;
        String str6 = this.state;
        String str7 = this.source;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CreateActivityResponse(createdAt=", str, ", updatedAt=", str2, ", id=");
        AbstractC11266d.m30470x(i13, str3, ", userId=", ", during=", sbM32001t);
        AbstractC11266d.m30444B(sbM32001t, str4, ", timeZoneOffset=", str5, ", state=");
        return AbstractC11266d.m30464r(sbM32001t, str6, ", source=", str7, ")");
    }

    public CreateActivityResponse(String createdAt, String updatedAt, String id4, int i13, String during, String timeZoneOffset, String state, String source) {
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(during, "during");
        AbstractC22676k.m65750j(timeZoneOffset, "timeZoneOffset");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(source, "source");
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.id = id4;
        this.userId = i13;
        this.during = during;
        this.timeZoneOffset = timeZoneOffset;
        this.state = state;
        this.source = source;
    }

    public /* synthetic */ CreateActivityResponse(String str, String str2, String str3, int i13, String str4, String str5, String str6, String str7, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i13, str4, (i14 & 32) != 0 ? "+0000" : str5, str6, str7);
    }
}
