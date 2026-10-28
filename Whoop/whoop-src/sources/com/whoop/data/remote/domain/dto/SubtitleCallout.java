package com.whoop.data.remote.domain.dto;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.LongSerializer;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001cR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010'\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010\u0019¨\u00062"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/SubtitleCallout;", "", "", "icon", "title", "", "prevCycleId", "prevEntryDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/SubtitleCallout;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Long;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/SubtitleCallout;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "getTitle", "Ljava/lang/Long;", "getPrevCycleId", "getPrevCycleId$annotations", "()V", "getPrevEntryDate", "getPrevEntryDate$annotations", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SubtitleCallout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("icon")
    private final String icon;

    @SerializedName("previous_cycle_id")
    private final Long prevCycleId;

    @SerializedName("previous_entry_date")
    private final String prevEntryDate;

    @SerializedName("title")
    private final String title;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/SubtitleCallout$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/SubtitleCallout;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SubtitleCallout$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SubtitleCallout(int i13, String str, String str2, Long l7, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, SubtitleCallout$$serializer.INSTANCE.getDescriptor());
        }
        this.icon = str;
        this.title = str2;
        this.prevCycleId = l7;
        this.prevEntryDate = str3;
    }

    public static /* synthetic */ SubtitleCallout copy$default(SubtitleCallout subtitleCallout, String str, String str2, Long l7, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = subtitleCallout.icon;
        }
        if ((i13 & 2) != 0) {
            str2 = subtitleCallout.title;
        }
        if ((i13 & 4) != 0) {
            l7 = subtitleCallout.prevCycleId;
        }
        if ((i13 & 8) != 0) {
            str3 = subtitleCallout.prevEntryDate;
        }
        return subtitleCallout.copy(str, str2, l7, str3);
    }

    @InterfaceC37143h("previous_cycle_id")
    public static /* synthetic */ void getPrevCycleId$annotations() {
    }

    @InterfaceC37143h("previous_entry_date")
    public static /* synthetic */ void getPrevEntryDate$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_release(SubtitleCallout self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.icon);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeNullableSerializableElement(serialDesc, 2, LongSerializer.INSTANCE, self.prevCycleId);
        output.encodeStringElement(serialDesc, 3, self.prevEntryDate);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getPrevCycleId() {
        return this.prevCycleId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPrevEntryDate() {
        return this.prevEntryDate;
    }

    public final SubtitleCallout copy(String icon, String title, Long prevCycleId, String prevEntryDate) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(prevEntryDate, "prevEntryDate");
        return new SubtitleCallout(icon, title, prevCycleId, prevEntryDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubtitleCallout)) {
            return false;
        }
        SubtitleCallout subtitleCallout = (SubtitleCallout) other;
        return AbstractC22676k.m65745e(this.icon, subtitleCallout.icon) && AbstractC22676k.m65745e(this.title, subtitleCallout.title) && AbstractC22676k.m65745e(this.prevCycleId, subtitleCallout.prevCycleId) && AbstractC22676k.m65745e(this.prevEntryDate, subtitleCallout.prevEntryDate);
    }

    public final String getIcon() {
        return this.icon;
    }

    public final Long getPrevCycleId() {
        return this.prevCycleId;
    }

    public final String getPrevEntryDate() {
        return this.prevEntryDate;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.icon.hashCode() * 31, 31, this.title);
        Long l7 = this.prevCycleId;
        return this.prevEntryDate.hashCode() + ((iM30450d + (l7 == null ? 0 : l7.hashCode())) * 31);
    }

    public String toString() {
        String str = this.icon;
        String str2 = this.title;
        Long l7 = this.prevCycleId;
        String str3 = this.prevEntryDate;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SubtitleCallout(icon=", str, ", title=", str2, ", prevCycleId=");
        sbM32001t.append(l7);
        sbM32001t.append(", prevEntryDate=");
        sbM32001t.append(str3);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public SubtitleCallout(String icon, String title, Long l7, String prevEntryDate) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(prevEntryDate, "prevEntryDate");
        this.icon = icon;
        this.title = title;
        this.prevCycleId = l7;
        this.prevEntryDate = prevEntryDate;
    }
}
