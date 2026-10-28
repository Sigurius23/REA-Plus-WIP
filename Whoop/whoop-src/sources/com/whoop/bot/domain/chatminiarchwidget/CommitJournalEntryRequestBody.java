package com.whoop.bot.domain.chatminiarchwidget;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0081\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ4\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001d¨\u0006/"}, m65681d2 = {"Lcom/whoop/bot/domain/chatminiarchwidget/CommitJournalEntryRequestBody;", "", "", "answeredYes", "", "magnitudeValue", "", "timeInput", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/bot/domain/chatminiarchwidget/CommitJournalEntryRequestBody;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/Double;", "component3", "()Ljava/lang/String;", "copy", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;)Lcom/whoop/bot/domain/chatminiarchwidget/CommitJournalEntryRequestBody;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getAnsweredYes", "Ljava/lang/Double;", "getMagnitudeValue", "Ljava/lang/String;", "getTimeInput", "Companion", "$serializer", "a", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CommitJournalEntryRequestBody {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Boolean answeredYes;
    private final Double magnitudeValue;
    private final String timeInput;

    /* JADX INFO: renamed from: com.whoop.bot.domain.chatminiarchwidget.CommitJournalEntryRequestBody$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/bot/domain/chatminiarchwidget/CommitJournalEntryRequestBody$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/bot/domain/chatminiarchwidget/CommitJournalEntryRequestBody;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CommitJournalEntryRequestBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CommitJournalEntryRequestBody() {
        this((Boolean) null, (Double) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CommitJournalEntryRequestBody copy$default(CommitJournalEntryRequestBody commitJournalEntryRequestBody, Boolean bool, Double d3, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            bool = commitJournalEntryRequestBody.answeredYes;
        }
        if ((i13 & 2) != 0) {
            d3 = commitJournalEntryRequestBody.magnitudeValue;
        }
        if ((i13 & 4) != 0) {
            str = commitJournalEntryRequestBody.timeInput;
        }
        return commitJournalEntryRequestBody.copy(bool, d3, str);
    }

    public static final /* synthetic */ void write$Self$bot_release(CommitJournalEntryRequestBody self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.answeredYes != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, BooleanSerializer.INSTANCE, self.answeredYes);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.magnitudeValue != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, DoubleSerializer.INSTANCE, self.magnitudeValue);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.timeInput == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.timeInput);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getAnsweredYes() {
        return this.answeredYes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getMagnitudeValue() {
        return this.magnitudeValue;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTimeInput() {
        return this.timeInput;
    }

    public final CommitJournalEntryRequestBody copy(Boolean answeredYes, Double magnitudeValue, String timeInput) {
        return new CommitJournalEntryRequestBody(answeredYes, magnitudeValue, timeInput);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommitJournalEntryRequestBody)) {
            return false;
        }
        CommitJournalEntryRequestBody commitJournalEntryRequestBody = (CommitJournalEntryRequestBody) other;
        return AbstractC22676k.m65745e(this.answeredYes, commitJournalEntryRequestBody.answeredYes) && AbstractC22676k.m65745e(this.magnitudeValue, commitJournalEntryRequestBody.magnitudeValue) && AbstractC22676k.m65745e(this.timeInput, commitJournalEntryRequestBody.timeInput);
    }

    public final Boolean getAnsweredYes() {
        return this.answeredYes;
    }

    public final Double getMagnitudeValue() {
        return this.magnitudeValue;
    }

    public final String getTimeInput() {
        return this.timeInput;
    }

    public int hashCode() {
        Boolean bool = this.answeredYes;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d3 = this.magnitudeValue;
        int iHashCode2 = (iHashCode + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str = this.timeInput;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        Boolean bool = this.answeredYes;
        Double d3 = this.magnitudeValue;
        String str = this.timeInput;
        StringBuilder sb4 = new StringBuilder("CommitJournalEntryRequestBody(answeredYes=");
        sb4.append(bool);
        sb4.append(", magnitudeValue=");
        sb4.append(d3);
        sb4.append(", timeInput=");
        return AbstractC25012a.m73376i(str, ")", sb4);
    }

    public /* synthetic */ CommitJournalEntryRequestBody(int i13, Boolean bool, Double d3, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.answeredYes = null;
        } else {
            this.answeredYes = bool;
        }
        if ((i13 & 2) == 0) {
            this.magnitudeValue = null;
        } else {
            this.magnitudeValue = d3;
        }
        if ((i13 & 4) == 0) {
            this.timeInput = null;
        } else {
            this.timeInput = str;
        }
    }

    public CommitJournalEntryRequestBody(Boolean bool, Double d3, String str) {
        this.answeredYes = bool;
        this.magnitudeValue = d3;
        this.timeInput = str;
    }

    public /* synthetic */ CommitJournalEntryRequestBody(Boolean bool, Double d3, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : bool, (i13 & 2) != 0 ? null : d3, (i13 & 4) != 0 ? null : str);
    }
}
