package com.whoop.advancedlabs.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001d¨\u00061"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/AllRecordingsResponse;", "", "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "navigationBar", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsBiomarkerHistory;", "recordHistory", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAllRecordingBottomSheet;", "bottomSheet", "<init>", "(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsBiomarkerHistory;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAllRecordingBottomSheet;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/advancedlabs/domain/models/NavigationBarModel;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsBiomarkerHistory;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAllRecordingBottomSheet;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/AllRecordingsResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "component2", "()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsBiomarkerHistory;", "component3", "()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAllRecordingBottomSheet;", "copy", "(Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsBiomarkerHistory;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAllRecordingBottomSheet;)Lcom/whoop/advancedlabs/domain/models/AllRecordingsResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "getNavigationBar", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsBiomarkerHistory;", "getRecordHistory", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAllRecordingBottomSheet;", "getBottomSheet", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AllRecordingsResponse {
    private final AdvancedLabsAllRecordingBottomSheet bottomSheet;
    private final NavigationBarModel navigationBar;
    private final AdvancedLabsBiomarkerHistory recordHistory;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/AllRecordingsResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/AllRecordingsResponse;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AllRecordingsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AllRecordingsResponse(int i13, NavigationBarModel navigationBarModel, AdvancedLabsBiomarkerHistory advancedLabsBiomarkerHistory, AdvancedLabsAllRecordingBottomSheet advancedLabsAllRecordingBottomSheet, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, AllRecordingsResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.navigationBar = navigationBarModel;
        this.recordHistory = advancedLabsBiomarkerHistory;
        this.bottomSheet = advancedLabsAllRecordingBottomSheet;
    }

    public static /* synthetic */ AllRecordingsResponse copy$default(AllRecordingsResponse allRecordingsResponse, NavigationBarModel navigationBarModel, AdvancedLabsBiomarkerHistory advancedLabsBiomarkerHistory, AdvancedLabsAllRecordingBottomSheet advancedLabsAllRecordingBottomSheet, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            navigationBarModel = allRecordingsResponse.navigationBar;
        }
        if ((i13 & 2) != 0) {
            advancedLabsBiomarkerHistory = allRecordingsResponse.recordHistory;
        }
        if ((i13 & 4) != 0) {
            advancedLabsAllRecordingBottomSheet = allRecordingsResponse.bottomSheet;
        }
        return allRecordingsResponse.copy(navigationBarModel, advancedLabsBiomarkerHistory, advancedLabsAllRecordingBottomSheet);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(AllRecordingsResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, NavigationBarModel$$serializer.INSTANCE, self.navigationBar);
        output.encodeSerializableElement(serialDesc, 1, AdvancedLabsBiomarkerHistory$$serializer.INSTANCE, self.recordHistory);
        output.encodeNullableSerializableElement(serialDesc, 2, AdvancedLabsAllRecordingBottomSheet$$serializer.INSTANCE, self.bottomSheet);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NavigationBarModel getNavigationBar() {
        return this.navigationBar;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AdvancedLabsBiomarkerHistory getRecordHistory() {
        return this.recordHistory;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AdvancedLabsAllRecordingBottomSheet getBottomSheet() {
        return this.bottomSheet;
    }

    public final AllRecordingsResponse copy(NavigationBarModel navigationBar, AdvancedLabsBiomarkerHistory recordHistory, AdvancedLabsAllRecordingBottomSheet bottomSheet) {
        AbstractC22676k.m65750j(navigationBar, "navigationBar");
        AbstractC22676k.m65750j(recordHistory, "recordHistory");
        return new AllRecordingsResponse(navigationBar, recordHistory, bottomSheet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllRecordingsResponse)) {
            return false;
        }
        AllRecordingsResponse allRecordingsResponse = (AllRecordingsResponse) other;
        return AbstractC22676k.m65745e(this.navigationBar, allRecordingsResponse.navigationBar) && AbstractC22676k.m65745e(this.recordHistory, allRecordingsResponse.recordHistory) && AbstractC22676k.m65745e(this.bottomSheet, allRecordingsResponse.bottomSheet);
    }

    public final AdvancedLabsAllRecordingBottomSheet getBottomSheet() {
        return this.bottomSheet;
    }

    public final NavigationBarModel getNavigationBar() {
        return this.navigationBar;
    }

    public final AdvancedLabsBiomarkerHistory getRecordHistory() {
        return this.recordHistory;
    }

    public int hashCode() {
        int iHashCode = (this.recordHistory.hashCode() + (this.navigationBar.hashCode() * 31)) * 31;
        AdvancedLabsAllRecordingBottomSheet advancedLabsAllRecordingBottomSheet = this.bottomSheet;
        return iHashCode + (advancedLabsAllRecordingBottomSheet == null ? 0 : advancedLabsAllRecordingBottomSheet.hashCode());
    }

    public String toString() {
        return "AllRecordingsResponse(navigationBar=" + this.navigationBar + ", recordHistory=" + this.recordHistory + ", bottomSheet=" + this.bottomSheet + ")";
    }

    public AllRecordingsResponse(NavigationBarModel navigationBar, AdvancedLabsBiomarkerHistory recordHistory, AdvancedLabsAllRecordingBottomSheet advancedLabsAllRecordingBottomSheet) {
        AbstractC22676k.m65750j(navigationBar, "navigationBar");
        AbstractC22676k.m65750j(recordHistory, "recordHistory");
        this.navigationBar = navigationBar;
        this.recordHistory = recordHistory;
        this.bottomSheet = advancedLabsAllRecordingBottomSheet;
    }
}
