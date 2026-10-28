package com.whoop.navigation;

import com.mapbox.common.HttpHeaders;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\u0018¨\u0006."}, m65681d2 = {"Lcom/whoop/navigation/InterdayJournalScreenModel;", "Lcom/whoop/navigation/CommonNavigationScreenModel;", "", HttpHeaders.DATE, "", "cycleId", "source", "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;JLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/InterdayJournalScreenModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "copy", "(Ljava/lang/String;JLjava/lang/String;)Lcom/whoop/navigation/InterdayJournalScreenModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDate", "J", "getCycleId", "getSource", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class InterdayJournalScreenModel implements CommonNavigationScreenModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long cycleId;
    private final String date;
    private final String source;

    /* JADX INFO: renamed from: com.whoop.navigation.InterdayJournalScreenModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/InterdayJournalScreenModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/InterdayJournalScreenModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return InterdayJournalScreenModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ InterdayJournalScreenModel(int i13, String str, long j7, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, InterdayJournalScreenModel$$serializer.INSTANCE.getDescriptor());
        }
        this.date = str;
        this.cycleId = j7;
        this.source = str2;
    }

    public static /* synthetic */ InterdayJournalScreenModel copy$default(InterdayJournalScreenModel interdayJournalScreenModel, String str, long j7, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = interdayJournalScreenModel.date;
        }
        if ((i13 & 2) != 0) {
            j7 = interdayJournalScreenModel.cycleId;
        }
        if ((i13 & 4) != 0) {
            str2 = interdayJournalScreenModel.source;
        }
        return interdayJournalScreenModel.copy(str, j7, str2);
    }

    public static final /* synthetic */ void write$Self$navigation_release(InterdayJournalScreenModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.date);
        output.encodeLongElement(serialDesc, 1, self.cycleId);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.source);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getCycleId() {
        return this.cycleId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final InterdayJournalScreenModel copy(String date, long cycleId, String source) {
        AbstractC22676k.m65750j(date, "date");
        return new InterdayJournalScreenModel(date, cycleId, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InterdayJournalScreenModel)) {
            return false;
        }
        InterdayJournalScreenModel interdayJournalScreenModel = (InterdayJournalScreenModel) other;
        return AbstractC22676k.m65745e(this.date, interdayJournalScreenModel.date) && this.cycleId == interdayJournalScreenModel.cycleId && AbstractC22676k.m65745e(this.source, interdayJournalScreenModel.source);
    }

    public final long getCycleId() {
        return this.cycleId;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        int iM30451e = AbstractC11266d.m30451e(this.date.hashCode() * 31, this.cycleId, 31);
        String str = this.source;
        return iM30451e + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.date;
        long j7 = this.cycleId;
        return AbstractC2875y.m8304q(AbstractC11895b.m32000s("InterdayJournalScreenModel(date=", str, j7, ", cycleId="), ", source=", this.source, ")");
    }

    public InterdayJournalScreenModel(String date, long j7, String str) {
        AbstractC22676k.m65750j(date, "date");
        this.date = date;
        this.cycleId = j7;
        this.source = str;
    }
}
