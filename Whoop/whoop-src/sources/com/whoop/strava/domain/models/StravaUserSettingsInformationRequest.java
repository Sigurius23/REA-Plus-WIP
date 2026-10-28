package com.whoop.strava.domain.models;

import androidx.annotation.Keep;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import d13.AbstractC11478a;
import hb1.C17089l;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBO\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"JJ\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b%\u0010\u001eJ\u0010\u0010&\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00022\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\"¨\u00067"}, m65681d2 = {"Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;", "", "", "shareToStrava", "shareAllActivities", "", "templateName", "", "sharedActivityNames", "importActivities", "<init>", "(ZZLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZZLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$strava_release", "(Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Z", "component2", "component3", "()Ljava/lang/String;", "component4", "()Ljava/util/List;", "component5", "()Ljava/lang/Boolean;", "copy", "(ZZLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShareToStrava", "getShareAllActivities", "Ljava/lang/String;", "getTemplateName", "Ljava/util/List;", "getSharedActivityNames", "Ljava/lang/Boolean;", "getImportActivities", "Companion", "$serializer", "a", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StravaUserSettingsInformationRequest {
    private final Boolean importActivities;
    private final boolean shareAllActivities;
    private final boolean shareToStrava;
    private final List<String> sharedActivityNames;
    private final String templateName;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C17089l(9)), null};

    /* JADX INFO: renamed from: com.whoop.strava.domain.models.StravaUserSettingsInformationRequest$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;", "serializer", "()Lwc3/c;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StravaUserSettingsInformationRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StravaUserSettingsInformationRequest(int i13, boolean z4, boolean z13, String str, List list, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, StravaUserSettingsInformationRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.shareToStrava = z4;
        this.shareAllActivities = z13;
        this.templateName = str;
        this.sharedActivityNames = list;
        if ((i13 & 16) == 0) {
            this.importActivities = null;
        } else {
            this.importActivities = bool;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StravaUserSettingsInformationRequest copy$default(StravaUserSettingsInformationRequest stravaUserSettingsInformationRequest, boolean z4, boolean z13, String str, List list, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = stravaUserSettingsInformationRequest.shareToStrava;
        }
        if ((i13 & 2) != 0) {
            z13 = stravaUserSettingsInformationRequest.shareAllActivities;
        }
        if ((i13 & 4) != 0) {
            str = stravaUserSettingsInformationRequest.templateName;
        }
        if ((i13 & 8) != 0) {
            list = stravaUserSettingsInformationRequest.sharedActivityNames;
        }
        if ((i13 & 16) != 0) {
            bool = stravaUserSettingsInformationRequest.importActivities;
        }
        Boolean bool2 = bool;
        String str2 = str;
        return stravaUserSettingsInformationRequest.copy(z4, z13, str2, list, bool2);
    }

    public static final /* synthetic */ void write$Self$strava_release(StravaUserSettingsInformationRequest self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeBooleanElement(serialDesc, 0, self.shareToStrava);
        output.encodeBooleanElement(serialDesc, 1, self.shareAllActivities);
        output.encodeStringElement(serialDesc, 2, self.templateName);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.sharedActivityNames);
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.importActivities == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, BooleanSerializer.INSTANCE, self.importActivities);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShareToStrava() {
        return this.shareToStrava;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShareAllActivities() {
        return this.shareAllActivities;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTemplateName() {
        return this.templateName;
    }

    public final List<String> component4() {
        return this.sharedActivityNames;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getImportActivities() {
        return this.importActivities;
    }

    public final StravaUserSettingsInformationRequest copy(boolean shareToStrava, boolean shareAllActivities, String templateName, List<String> sharedActivityNames, Boolean importActivities) {
        AbstractC22676k.m65750j(templateName, "templateName");
        AbstractC22676k.m65750j(sharedActivityNames, "sharedActivityNames");
        return new StravaUserSettingsInformationRequest(shareToStrava, shareAllActivities, templateName, sharedActivityNames, importActivities);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StravaUserSettingsInformationRequest)) {
            return false;
        }
        StravaUserSettingsInformationRequest stravaUserSettingsInformationRequest = (StravaUserSettingsInformationRequest) other;
        return this.shareToStrava == stravaUserSettingsInformationRequest.shareToStrava && this.shareAllActivities == stravaUserSettingsInformationRequest.shareAllActivities && AbstractC22676k.m65745e(this.templateName, stravaUserSettingsInformationRequest.templateName) && AbstractC22676k.m65745e(this.sharedActivityNames, stravaUserSettingsInformationRequest.sharedActivityNames) && AbstractC22676k.m65745e(this.importActivities, stravaUserSettingsInformationRequest.importActivities);
    }

    public final Boolean getImportActivities() {
        return this.importActivities;
    }

    public final boolean getShareAllActivities() {
        return this.shareAllActivities;
    }

    public final boolean getShareToStrava() {
        return this.shareToStrava;
    }

    public final List<String> getSharedActivityNames() {
        return this.sharedActivityNames;
    }

    public final String getTemplateName() {
        return this.templateName;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC2875y.m8289b(Boolean.hashCode(this.shareToStrava) * 31, 31, this.shareAllActivities), 31, this.templateName), 31, this.sharedActivityNames);
        Boolean bool = this.importActivities;
        return iM31983b + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        boolean z4 = this.shareToStrava;
        boolean z13 = this.shareAllActivities;
        String str = this.templateName;
        List<String> list = this.sharedActivityNames;
        Boolean bool = this.importActivities;
        StringBuilder sbM32002u = AbstractC11895b.m32002u("StravaUserSettingsInformationRequest(shareToStrava=", ", shareAllActivities=", ", templateName=", z4, z13);
        AbstractC36095b.m114694v(str, ", sharedActivityNames=", ", importActivities=", sbM32002u, list);
        return AbstractC11478a.m30858j(sbM32002u, bool, ")");
    }

    public StravaUserSettingsInformationRequest(boolean z4, boolean z13, String templateName, List<String> sharedActivityNames, Boolean bool) {
        AbstractC22676k.m65750j(templateName, "templateName");
        AbstractC22676k.m65750j(sharedActivityNames, "sharedActivityNames");
        this.shareToStrava = z4;
        this.shareAllActivities = z13;
        this.templateName = templateName;
        this.sharedActivityNames = sharedActivityNames;
        this.importActivities = bool;
    }

    public /* synthetic */ StravaUserSettingsInformationRequest(boolean z4, boolean z13, String str, List list, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, z13, str, list, (i13 & 16) != 0 ? null : bool);
    }
}
