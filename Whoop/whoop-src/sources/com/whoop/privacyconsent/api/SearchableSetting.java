package com.whoop.privacyconsent.api;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006'"}, m65681d2 = {"Lcom/whoop/privacyconsent/api/SearchableSetting;", "", "", "searchable", "mutualCommunitySharing", "<init>", "(ZZ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$privacy_consent_release", "(Lcom/whoop/privacyconsent/api/SearchableSetting;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/whoop/privacyconsent/api/SearchableSetting;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getSearchable", "getMutualCommunitySharing", "Companion", "$serializer", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SearchableSetting {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean mutualCommunitySharing;
    private final boolean searchable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/privacyconsent/api/SearchableSetting$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/privacyconsent/api/SearchableSetting;", "serializer", "()Lwc3/c;", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SearchableSetting$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SearchableSetting(int i13, boolean z4, boolean z13, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, SearchableSetting$$serializer.INSTANCE.getDescriptor());
        }
        this.searchable = z4;
        this.mutualCommunitySharing = z13;
    }

    public static /* synthetic */ SearchableSetting copy$default(SearchableSetting searchableSetting, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = searchableSetting.searchable;
        }
        if ((i13 & 2) != 0) {
            z13 = searchableSetting.mutualCommunitySharing;
        }
        return searchableSetting.copy(z4, z13);
    }

    public static final /* synthetic */ void write$Self$privacy_consent_release(SearchableSetting self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.searchable);
        output.encodeBooleanElement(serialDesc, 1, self.mutualCommunitySharing);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSearchable() {
        return this.searchable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getMutualCommunitySharing() {
        return this.mutualCommunitySharing;
    }

    public final SearchableSetting copy(boolean searchable, boolean mutualCommunitySharing) {
        return new SearchableSetting(searchable, mutualCommunitySharing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchableSetting)) {
            return false;
        }
        SearchableSetting searchableSetting = (SearchableSetting) other;
        return this.searchable == searchableSetting.searchable && this.mutualCommunitySharing == searchableSetting.mutualCommunitySharing;
    }

    public final boolean getMutualCommunitySharing() {
        return this.mutualCommunitySharing;
    }

    public final boolean getSearchable() {
        return this.searchable;
    }

    public int hashCode() {
        return Boolean.hashCode(this.mutualCommunitySharing) + (Boolean.hashCode(this.searchable) * 31);
    }

    public String toString() {
        return AbstractC30802r.m94762k("SearchableSetting(searchable=", ", mutualCommunitySharing=", ")", this.searchable, this.mutualCommunitySharing);
    }

    public SearchableSetting(boolean z4, boolean z13) {
        this.searchable = z4;
        this.mutualCommunitySharing = z13;
    }
}
