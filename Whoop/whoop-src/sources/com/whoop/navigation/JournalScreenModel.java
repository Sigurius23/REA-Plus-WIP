package com.whoop.navigation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import p000.AbstractC11266d;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB5\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u00060"}, m65681d2 = {"Lcom/whoop/navigation/JournalScreenModel;", "Lcom/whoop/navigation/CommonNavigationScreenModel;", "", "cycleId", "", "source", "", "shouldShowOnboarding", "<init>", "(JLjava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLjava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/JournalScreenModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "()Z", "copy", "(JLjava/lang/String;Z)Lcom/whoop/navigation/JournalScreenModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getCycleId", "Ljava/lang/String;", "getSource", "Z", "getShouldShowOnboarding", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
@InterfaceC37144i
public final /* data */ class JournalScreenModel implements CommonNavigationScreenModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long cycleId;
    private final boolean shouldShowOnboarding;
    private final String source;

    /* JADX INFO: renamed from: com.whoop.navigation.JournalScreenModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/JournalScreenModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/JournalScreenModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return JournalScreenModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ JournalScreenModel(int i13, long j7, String str, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, JournalScreenModel$$serializer.INSTANCE.getDescriptor());
        }
        this.cycleId = j7;
        this.source = str;
        this.shouldShowOnboarding = z4;
    }

    public static /* synthetic */ JournalScreenModel copy$default(JournalScreenModel journalScreenModel, long j7, String str, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = journalScreenModel.cycleId;
        }
        if ((i13 & 2) != 0) {
            str = journalScreenModel.source;
        }
        if ((i13 & 4) != 0) {
            z4 = journalScreenModel.shouldShowOnboarding;
        }
        return journalScreenModel.copy(j7, str, z4);
    }

    public static final /* synthetic */ void write$Self$navigation_release(JournalScreenModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeLongElement(serialDesc, 0, self.cycleId);
        output.encodeStringElement(serialDesc, 1, self.source);
        output.encodeBooleanElement(serialDesc, 2, self.shouldShowOnboarding);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getCycleId() {
        return this.cycleId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShouldShowOnboarding() {
        return this.shouldShowOnboarding;
    }

    public final JournalScreenModel copy(long cycleId, String source, boolean shouldShowOnboarding) {
        AbstractC22676k.m65750j(source, "source");
        return new JournalScreenModel(cycleId, source, shouldShowOnboarding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JournalScreenModel)) {
            return false;
        }
        JournalScreenModel journalScreenModel = (JournalScreenModel) other;
        return this.cycleId == journalScreenModel.cycleId && AbstractC22676k.m65745e(this.source, journalScreenModel.source) && this.shouldShowOnboarding == journalScreenModel.shouldShowOnboarding;
    }

    public final long getCycleId() {
        return this.cycleId;
    }

    public final boolean getShouldShowOnboarding() {
        return this.shouldShowOnboarding;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldShowOnboarding) + AbstractC11266d.m30450d(Long.hashCode(this.cycleId) * 31, 31, this.source);
    }

    public String toString() {
        long j7 = this.cycleId;
        String str = this.source;
        boolean z4 = this.shouldShowOnboarding;
        StringBuilder sbM114685m = AbstractC36095b.m114685m("JournalScreenModel(cycleId=", ", source=", j7, str);
        sbM114685m.append(", shouldShowOnboarding=");
        sbM114685m.append(z4);
        sbM114685m.append(")");
        return sbM114685m.toString();
    }

    public JournalScreenModel(long j7, String source, boolean z4) {
        AbstractC22676k.m65750j(source, "source");
        this.cycleId = j7;
        this.source = source;
        this.shouldShowOnboarding = z4;
    }
}
