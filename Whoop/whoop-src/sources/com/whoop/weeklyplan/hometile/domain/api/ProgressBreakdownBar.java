package com.whoop.weeklyplan.hometile.domain.api;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u001a¨\u0006*"}, m65681d2 = {"Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;", "", "", "percentString", "percentSubtitle", "", "percentValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;I)Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPercentString", "getPercentSubtitle", "I", "getPercentValue", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProgressBreakdownBar {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String percentString;
    private final String percentSubtitle;
    private final int percentValue;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ProgressBreakdownBar$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ProgressBreakdownBar(int i13, String str, String str2, int i14, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, ProgressBreakdownBar$$serializer.INSTANCE.getDescriptor());
        }
        this.percentString = str;
        this.percentSubtitle = str2;
        this.percentValue = i14;
    }

    public static /* synthetic */ ProgressBreakdownBar copy$default(ProgressBreakdownBar progressBreakdownBar, String str, String str2, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = progressBreakdownBar.percentString;
        }
        if ((i14 & 2) != 0) {
            str2 = progressBreakdownBar.percentSubtitle;
        }
        if ((i14 & 4) != 0) {
            i13 = progressBreakdownBar.percentValue;
        }
        return progressBreakdownBar.copy(str, str2, i13);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(ProgressBreakdownBar self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.percentString);
        output.encodeStringElement(serialDesc, 1, self.percentSubtitle);
        output.encodeIntElement(serialDesc, 2, self.percentValue);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPercentString() {
        return this.percentString;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPercentSubtitle() {
        return this.percentSubtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPercentValue() {
        return this.percentValue;
    }

    public final ProgressBreakdownBar copy(String percentString, String percentSubtitle, int percentValue) {
        AbstractC22676k.m65750j(percentString, "percentString");
        AbstractC22676k.m65750j(percentSubtitle, "percentSubtitle");
        return new ProgressBreakdownBar(percentString, percentSubtitle, percentValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressBreakdownBar)) {
            return false;
        }
        ProgressBreakdownBar progressBreakdownBar = (ProgressBreakdownBar) other;
        return AbstractC22676k.m65745e(this.percentString, progressBreakdownBar.percentString) && AbstractC22676k.m65745e(this.percentSubtitle, progressBreakdownBar.percentSubtitle) && this.percentValue == progressBreakdownBar.percentValue;
    }

    public final String getPercentString() {
        return this.percentString;
    }

    public final String getPercentSubtitle() {
        return this.percentSubtitle;
    }

    public final int getPercentValue() {
        return this.percentValue;
    }

    public int hashCode() {
        return Integer.hashCode(this.percentValue) + AbstractC11266d.m30450d(this.percentString.hashCode() * 31, 31, this.percentSubtitle);
    }

    public String toString() {
        String str = this.percentString;
        String str2 = this.percentSubtitle;
        return AbstractC18489d0.m53371l(AbstractC11895b.m32001t("ProgressBreakdownBar(percentString=", str, ", percentSubtitle=", str2, ", percentValue="), this.percentValue, ")");
    }

    public ProgressBreakdownBar(String percentString, String percentSubtitle, int i13) {
        AbstractC22676k.m65750j(percentString, "percentString");
        AbstractC22676k.m65750j(percentSubtitle, "percentSubtitle");
        this.percentString = percentString;
        this.percentSubtitle = percentSubtitle;
        this.percentValue = i13;
    }
}
