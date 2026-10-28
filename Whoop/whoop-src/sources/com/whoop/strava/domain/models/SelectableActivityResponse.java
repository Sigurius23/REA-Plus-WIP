package com.whoop.strava.domain.models;

import androidx.annotation.Keep;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJB\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b.\u0010\u001e¨\u00062"}, m65681d2 = {"Lcom/whoop/strava/domain/models/SelectableActivityResponse;", "", "", "activityNameDisplay", "activityNameInternal", "activityIconUrl", "", "selected", "popular", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$strava_release", "(Lcom/whoop/strava/domain/models/SelectableActivityResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/whoop/strava/domain/models/SelectableActivityResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getActivityNameDisplay", "getActivityNameInternal", "getActivityIconUrl", "Z", "getSelected", "getPopular", "Companion", "$serializer", "a", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SelectableActivityResponse {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String activityIconUrl;
    private final String activityNameDisplay;
    private final String activityNameInternal;
    private final boolean popular;
    private final boolean selected;

    /* JADX INFO: renamed from: com.whoop.strava.domain.models.SelectableActivityResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/strava/domain/models/SelectableActivityResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/strava/domain/models/SelectableActivityResponse;", "serializer", "()Lwc3/c;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SelectableActivityResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SelectableActivityResponse(int i13, String str, String str2, String str3, boolean z4, boolean z13, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, SelectableActivityResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.activityNameDisplay = str;
        this.activityNameInternal = str2;
        this.activityIconUrl = str3;
        this.selected = z4;
        this.popular = z13;
    }

    public static /* synthetic */ SelectableActivityResponse copy$default(SelectableActivityResponse selectableActivityResponse, String str, String str2, String str3, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = selectableActivityResponse.activityNameDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = selectableActivityResponse.activityNameInternal;
        }
        if ((i13 & 4) != 0) {
            str3 = selectableActivityResponse.activityIconUrl;
        }
        if ((i13 & 8) != 0) {
            z4 = selectableActivityResponse.selected;
        }
        if ((i13 & 16) != 0) {
            z13 = selectableActivityResponse.popular;
        }
        boolean z14 = z13;
        String str4 = str3;
        return selectableActivityResponse.copy(str, str2, str4, z4, z14);
    }

    public static final /* synthetic */ void write$Self$strava_release(SelectableActivityResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.activityNameDisplay);
        output.encodeStringElement(serialDesc, 1, self.activityNameInternal);
        output.encodeStringElement(serialDesc, 2, self.activityIconUrl);
        output.encodeBooleanElement(serialDesc, 3, self.selected);
        output.encodeBooleanElement(serialDesc, 4, self.popular);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getActivityNameDisplay() {
        return this.activityNameDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getActivityNameInternal() {
        return this.activityNameInternal;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getActivityIconUrl() {
        return this.activityIconUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getPopular() {
        return this.popular;
    }

    public final SelectableActivityResponse copy(String activityNameDisplay, String activityNameInternal, String activityIconUrl, boolean selected, boolean popular) {
        AbstractC22676k.m65750j(activityNameDisplay, "activityNameDisplay");
        AbstractC22676k.m65750j(activityNameInternal, "activityNameInternal");
        AbstractC22676k.m65750j(activityIconUrl, "activityIconUrl");
        return new SelectableActivityResponse(activityNameDisplay, activityNameInternal, activityIconUrl, selected, popular);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectableActivityResponse)) {
            return false;
        }
        SelectableActivityResponse selectableActivityResponse = (SelectableActivityResponse) other;
        return AbstractC22676k.m65745e(this.activityNameDisplay, selectableActivityResponse.activityNameDisplay) && AbstractC22676k.m65745e(this.activityNameInternal, selectableActivityResponse.activityNameInternal) && AbstractC22676k.m65745e(this.activityIconUrl, selectableActivityResponse.activityIconUrl) && this.selected == selectableActivityResponse.selected && this.popular == selectableActivityResponse.popular;
    }

    public final String getActivityIconUrl() {
        return this.activityIconUrl;
    }

    public final String getActivityNameDisplay() {
        return this.activityNameDisplay;
    }

    public final String getActivityNameInternal() {
        return this.activityNameInternal;
    }

    public final boolean getPopular() {
        return this.popular;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public int hashCode() {
        return Boolean.hashCode(this.popular) + AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.activityNameDisplay.hashCode() * 31, 31, this.activityNameInternal), 31, this.activityIconUrl), 31, this.selected);
    }

    public String toString() {
        String str = this.activityNameDisplay;
        String str2 = this.activityNameInternal;
        String str3 = this.activityIconUrl;
        boolean z4 = this.selected;
        boolean z13 = this.popular;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SelectableActivityResponse(activityNameDisplay=", str, ", activityNameInternal=", str2, ", activityIconUrl=");
        AbstractC38963t7.m124390t(sbM32001t, str3, ", selected=", z4, ", popular=");
        return AbstractC18489d0.m53372m(sbM32001t, z13, ")");
    }

    public SelectableActivityResponse(String activityNameDisplay, String activityNameInternal, String activityIconUrl, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(activityNameDisplay, "activityNameDisplay");
        AbstractC22676k.m65750j(activityNameInternal, "activityNameInternal");
        AbstractC22676k.m65750j(activityIconUrl, "activityIconUrl");
        this.activityNameDisplay = activityNameDisplay;
        this.activityNameInternal = activityNameInternal;
        this.activityIconUrl = activityIconUrl;
        this.selected = z4;
        this.popular = z13;
    }
}
