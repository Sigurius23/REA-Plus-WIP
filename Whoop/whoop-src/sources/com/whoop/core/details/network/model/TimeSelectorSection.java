package com.whoop.core.details.network.model;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b(\u0010\u0017¨\u0006+"}, m65681d2 = {"Lcom/whoop/core/details/network/model/TimeSelectorSection;", "", "", "formattedTimeDisplay", "initialValue", "selectedTimeTitleDisplay", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_details_release", "(Lcom/whoop/core/details/network/model/TimeSelectorSection;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/core/details/network/model/TimeSelectorSection;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFormattedTimeDisplay", "getInitialValue", "getInitialValue$annotations", "()V", "getSelectedTimeTitleDisplay", "Companion", "$serializer", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TimeSelectorSection {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String formattedTimeDisplay;
    private final String initialValue;
    private final String selectedTimeTitleDisplay;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/core/details/network/model/TimeSelectorSection$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/core/details/network/model/TimeSelectorSection;", "serializer", "()Lwc3/c;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TimeSelectorSection$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TimeSelectorSection(int i13, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, TimeSelectorSection$$serializer.INSTANCE.getDescriptor());
        }
        this.formattedTimeDisplay = str;
        this.initialValue = str2;
        this.selectedTimeTitleDisplay = str3;
    }

    public static /* synthetic */ TimeSelectorSection copy$default(TimeSelectorSection timeSelectorSection, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = timeSelectorSection.formattedTimeDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = timeSelectorSection.initialValue;
        }
        if ((i13 & 4) != 0) {
            str3 = timeSelectorSection.selectedTimeTitleDisplay;
        }
        return timeSelectorSection.copy(str, str2, str3);
    }

    @InterfaceC37143h("initial_time")
    public static /* synthetic */ void getInitialValue$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_details_release(TimeSelectorSection self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.formattedTimeDisplay);
        output.encodeStringElement(serialDesc, 1, self.initialValue);
        output.encodeStringElement(serialDesc, 2, self.selectedTimeTitleDisplay);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFormattedTimeDisplay() {
        return this.formattedTimeDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInitialValue() {
        return this.initialValue;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSelectedTimeTitleDisplay() {
        return this.selectedTimeTitleDisplay;
    }

    public final TimeSelectorSection copy(String formattedTimeDisplay, String initialValue, String selectedTimeTitleDisplay) {
        AbstractC22676k.m65750j(formattedTimeDisplay, "formattedTimeDisplay");
        AbstractC22676k.m65750j(initialValue, "initialValue");
        AbstractC22676k.m65750j(selectedTimeTitleDisplay, "selectedTimeTitleDisplay");
        return new TimeSelectorSection(formattedTimeDisplay, initialValue, selectedTimeTitleDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeSelectorSection)) {
            return false;
        }
        TimeSelectorSection timeSelectorSection = (TimeSelectorSection) other;
        return AbstractC22676k.m65745e(this.formattedTimeDisplay, timeSelectorSection.formattedTimeDisplay) && AbstractC22676k.m65745e(this.initialValue, timeSelectorSection.initialValue) && AbstractC22676k.m65745e(this.selectedTimeTitleDisplay, timeSelectorSection.selectedTimeTitleDisplay);
    }

    public final String getFormattedTimeDisplay() {
        return this.formattedTimeDisplay;
    }

    public final String getInitialValue() {
        return this.initialValue;
    }

    public final String getSelectedTimeTitleDisplay() {
        return this.selectedTimeTitleDisplay;
    }

    public int hashCode() {
        return this.selectedTimeTitleDisplay.hashCode() + AbstractC11266d.m30450d(this.formattedTimeDisplay.hashCode() * 31, 31, this.initialValue);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.selectedTimeTitleDisplay, ")", AbstractC11895b.m32001t("TimeSelectorSection(formattedTimeDisplay=", this.formattedTimeDisplay, ", initialValue=", this.initialValue, ", selectedTimeTitleDisplay="));
    }

    public TimeSelectorSection(String formattedTimeDisplay, String initialValue, String selectedTimeTitleDisplay) {
        AbstractC22676k.m65750j(formattedTimeDisplay, "formattedTimeDisplay");
        AbstractC22676k.m65750j(initialValue, "initialValue");
        AbstractC22676k.m65750j(selectedTimeTitleDisplay, "selectedTimeTitleDisplay");
        this.formattedTimeDisplay = formattedTimeDisplay;
        this.initialValue = initialValue;
        this.selectedTimeTitleDisplay = selectedTimeTitleDisplay;
    }
}
