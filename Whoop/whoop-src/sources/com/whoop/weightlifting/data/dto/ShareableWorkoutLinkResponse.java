package com.whoop.weightlifting.data.dto;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.client.api.QueryParams;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u0017R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010#\u0012\u0004\b*\u0010&\u001a\u0004\b)\u0010\u0017¨\u0006-"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/ShareableWorkoutLinkResponse;", "", "", QueryParams.URL, "name", "sharedWorkoutId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/data/dto/ShareableWorkoutLinkResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/weightlifting/data/dto/ShareableWorkoutLinkResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "getUrl$annotations", "()V", "getName", "getName$annotations", "getSharedWorkoutId", "getSharedWorkoutId$annotations", "Companion", "$serializer", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ShareableWorkoutLinkResponse {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("name")
    private final String name;

    @SerializedName("shared_workout_id")
    private final String sharedWorkoutId;

    @SerializedName(QueryParams.URL)
    private final String url;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/data/dto/ShareableWorkoutLinkResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/data/dto/ShareableWorkoutLinkResponse;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ShareableWorkoutLinkResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ShareableWorkoutLinkResponse(int i13, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, ShareableWorkoutLinkResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.url = str;
        this.name = str2;
        this.sharedWorkoutId = str3;
    }

    public static /* synthetic */ ShareableWorkoutLinkResponse copy$default(ShareableWorkoutLinkResponse shareableWorkoutLinkResponse, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = shareableWorkoutLinkResponse.url;
        }
        if ((i13 & 2) != 0) {
            str2 = shareableWorkoutLinkResponse.name;
        }
        if ((i13 & 4) != 0) {
            str3 = shareableWorkoutLinkResponse.sharedWorkoutId;
        }
        return shareableWorkoutLinkResponse.copy(str, str2, str3);
    }

    @InterfaceC37143h("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @InterfaceC37143h("shared_workout_id")
    public static /* synthetic */ void getSharedWorkoutId$annotations() {
    }

    @InterfaceC37143h(QueryParams.URL)
    public static /* synthetic */ void getUrl$annotations() {
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(ShareableWorkoutLinkResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.url);
        output.encodeStringElement(serialDesc, 1, self.name);
        output.encodeStringElement(serialDesc, 2, self.sharedWorkoutId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSharedWorkoutId() {
        return this.sharedWorkoutId;
    }

    public final ShareableWorkoutLinkResponse copy(String url, String name, String sharedWorkoutId) {
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(sharedWorkoutId, "sharedWorkoutId");
        return new ShareableWorkoutLinkResponse(url, name, sharedWorkoutId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareableWorkoutLinkResponse)) {
            return false;
        }
        ShareableWorkoutLinkResponse shareableWorkoutLinkResponse = (ShareableWorkoutLinkResponse) other;
        return AbstractC22676k.m65745e(this.url, shareableWorkoutLinkResponse.url) && AbstractC22676k.m65745e(this.name, shareableWorkoutLinkResponse.name) && AbstractC22676k.m65745e(this.sharedWorkoutId, shareableWorkoutLinkResponse.sharedWorkoutId);
    }

    public final String getName() {
        return this.name;
    }

    public final String getSharedWorkoutId() {
        return this.sharedWorkoutId;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.sharedWorkoutId.hashCode() + AbstractC11266d.m30450d(this.url.hashCode() * 31, 31, this.name);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.sharedWorkoutId, ")", AbstractC11895b.m32001t("ShareableWorkoutLinkResponse(url=", this.url, ", name=", this.name, ", sharedWorkoutId="));
    }

    public ShareableWorkoutLinkResponse(String url, String name, String sharedWorkoutId) {
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(sharedWorkoutId, "sharedWorkoutId");
        this.url = url;
        this.name = name;
        this.sharedWorkoutId = sharedWorkoutId;
    }
}
