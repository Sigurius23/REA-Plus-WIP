package com.whoop.shepherd.feature.detail.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0019¨\u0006+"}, m65681d2 = {"Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;", "", "", "title", "Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailByDate;", "historyDetailByDate", "<init>", "(Ljava/lang/String;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailByDate;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailByDate;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$shepherd_release", "(Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailByDate;", "copy", "(Ljava/lang/String;Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailByDate;)Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailByDate;", "getHistoryDetailByDate", "getHistoryDetailByDate$annotations", "()V", "Companion", "$serializer", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ShepherdHistoryDetailBox {

    @SerializedName("afib_details")
    private final ShepherdHistoryDetailByDate historyDetailByDate;

    @SerializedName("title")
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailBox;", "serializer", "()Lwc3/c;", "shepherd_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ShepherdHistoryDetailBox$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ShepherdHistoryDetailBox(int i13, String str, ShepherdHistoryDetailByDate shepherdHistoryDetailByDate, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, ShepherdHistoryDetailBox$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.historyDetailByDate = shepherdHistoryDetailByDate;
    }

    public static /* synthetic */ ShepherdHistoryDetailBox copy$default(ShepherdHistoryDetailBox shepherdHistoryDetailBox, String str, ShepherdHistoryDetailByDate shepherdHistoryDetailByDate, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = shepherdHistoryDetailBox.title;
        }
        if ((i13 & 2) != 0) {
            shepherdHistoryDetailByDate = shepherdHistoryDetailBox.historyDetailByDate;
        }
        return shepherdHistoryDetailBox.copy(str, shepherdHistoryDetailByDate);
    }

    @InterfaceC37143h("afib_details")
    public static /* synthetic */ void getHistoryDetailByDate$annotations() {
    }

    public static final /* synthetic */ void write$Self$shepherd_release(ShepherdHistoryDetailBox self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeNullableSerializableElement(serialDesc, 1, ShepherdHistoryDetailByDate$$serializer.INSTANCE, self.historyDetailByDate);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ShepherdHistoryDetailByDate getHistoryDetailByDate() {
        return this.historyDetailByDate;
    }

    public final ShepherdHistoryDetailBox copy(String title, ShepherdHistoryDetailByDate historyDetailByDate) {
        AbstractC22676k.m65750j(title, "title");
        return new ShepherdHistoryDetailBox(title, historyDetailByDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShepherdHistoryDetailBox)) {
            return false;
        }
        ShepherdHistoryDetailBox shepherdHistoryDetailBox = (ShepherdHistoryDetailBox) other;
        return AbstractC22676k.m65745e(this.title, shepherdHistoryDetailBox.title) && AbstractC22676k.m65745e(this.historyDetailByDate, shepherdHistoryDetailBox.historyDetailByDate);
    }

    public final ShepherdHistoryDetailByDate getHistoryDetailByDate() {
        return this.historyDetailByDate;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        ShepherdHistoryDetailByDate shepherdHistoryDetailByDate = this.historyDetailByDate;
        return iHashCode + (shepherdHistoryDetailByDate == null ? 0 : shepherdHistoryDetailByDate.hashCode());
    }

    public String toString() {
        return "ShepherdHistoryDetailBox(title=" + this.title + ", historyDetailByDate=" + this.historyDetailByDate + ")";
    }

    public ShepherdHistoryDetailBox(String title, ShepherdHistoryDetailByDate shepherdHistoryDetailByDate) {
        AbstractC22676k.m65750j(title, "title");
        this.title = title;
        this.historyDetailByDate = shepherdHistoryDetailByDate;
    }
}
