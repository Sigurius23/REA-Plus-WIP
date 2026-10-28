package com.whoop.core.details.network.model;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0018¨\u0006'"}, m65681d2 = {"Lcom/whoop/core/details/network/model/StrapLocation;", "", "", "strapLocation", "", "strapLocationTitleDisplay", "<init>", "(ILjava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_details_release", "(Lcom/whoop/core/details/network/model/StrapLocation;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/whoop/core/details/network/model/StrapLocation;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getStrapLocation", "Ljava/lang/String;", "getStrapLocationTitleDisplay", "Companion", "$serializer", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StrapLocation {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int strapLocation;
    private final String strapLocationTitleDisplay;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/core/details/network/model/StrapLocation$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/core/details/network/model/StrapLocation;", "serializer", "()Lwc3/c;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StrapLocation$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StrapLocation(int i13, int i14, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, StrapLocation$$serializer.INSTANCE.getDescriptor());
        }
        this.strapLocation = i14;
        this.strapLocationTitleDisplay = str;
    }

    public static /* synthetic */ StrapLocation copy$default(StrapLocation strapLocation, int i13, String str, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = strapLocation.strapLocation;
        }
        if ((i14 & 2) != 0) {
            str = strapLocation.strapLocationTitleDisplay;
        }
        return strapLocation.copy(i13, str);
    }

    public static final /* synthetic */ void write$Self$core_details_release(StrapLocation self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.strapLocation);
        output.encodeStringElement(serialDesc, 1, self.strapLocationTitleDisplay);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStrapLocation() {
        return this.strapLocation;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStrapLocationTitleDisplay() {
        return this.strapLocationTitleDisplay;
    }

    public final StrapLocation copy(int strapLocation, String strapLocationTitleDisplay) {
        AbstractC22676k.m65750j(strapLocationTitleDisplay, "strapLocationTitleDisplay");
        return new StrapLocation(strapLocation, strapLocationTitleDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrapLocation)) {
            return false;
        }
        StrapLocation strapLocation = (StrapLocation) other;
        return this.strapLocation == strapLocation.strapLocation && AbstractC22676k.m65745e(this.strapLocationTitleDisplay, strapLocation.strapLocationTitleDisplay);
    }

    public final int getStrapLocation() {
        return this.strapLocation;
    }

    public final String getStrapLocationTitleDisplay() {
        return this.strapLocationTitleDisplay;
    }

    public int hashCode() {
        return this.strapLocationTitleDisplay.hashCode() + (Integer.hashCode(this.strapLocation) * 31);
    }

    public String toString() {
        return AbstractC30007c.m91838h(this.strapLocation, "StrapLocation(strapLocation=", ", strapLocationTitleDisplay=", this.strapLocationTitleDisplay, ")");
    }

    public StrapLocation(int i13, String strapLocationTitleDisplay) {
        AbstractC22676k.m65750j(strapLocationTitleDisplay, "strapLocationTitleDisplay");
        this.strapLocation = i13;
        this.strapLocationTitleDisplay = strapLocationTitleDisplay;
    }
}
