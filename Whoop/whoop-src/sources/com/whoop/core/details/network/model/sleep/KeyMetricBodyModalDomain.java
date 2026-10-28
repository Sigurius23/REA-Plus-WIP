package com.whoop.core.details.network.model.sleep;

import androidx.compose.runtime.Composer;
import b91.C2889d;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import i93.C18284j;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import or2.C28173j1;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p208i2.C17924z0;
import p294l3.C23245b0;
import p294l3.C23248d;
import p294l3.C23254g;
import p294l3.C23267m0;
import p392p3.AbstractC28771i;
import p392p3.C28776n;
import p392p3.C28777o;
import p392p3.C28780r;
import p478s3.C32096b;
import p571w3.C36765a;
import p571w3.C36776l;
import p571w3.C36780p;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.C39336i;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import x81.C38072d;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ@\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u001b¨\u0006/"}, m65681d2 = {"Lcom/whoop/core/details/network/model/sleep/KeyMetricBodyModalDomain;", "", "", "calibrationBodyDisplay", "metricDescriptionDisplay", "individualMetricDisplay", "individualMetricRangeDisplay", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_details_release", "(Lcom/whoop/core/details/network/model/sleep/KeyMetricBodyModalDomain;Lzc3/c;Lyc3/g;)V", "write$Self", "Ll3/g;", "formatForSleepDetailsKeyMetricModal", "(Landroidx/compose/runtime/Composer;I)Ll3/g;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/core/details/network/model/sleep/KeyMetricBodyModalDomain;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCalibrationBodyDisplay", "getMetricDescriptionDisplay", "getIndividualMetricDisplay", "getIndividualMetricRangeDisplay", "Companion", "$serializer", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class KeyMetricBodyModalDomain {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String calibrationBodyDisplay;
    private final String individualMetricDisplay;
    private final String individualMetricRangeDisplay;
    private final String metricDescriptionDisplay;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/core/details/network/model/sleep/KeyMetricBodyModalDomain$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/core/details/network/model/sleep/KeyMetricBodyModalDomain;", "serializer", "()Lwc3/c;", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return KeyMetricBodyModalDomain$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public KeyMetricBodyModalDomain() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ KeyMetricBodyModalDomain copy$default(KeyMetricBodyModalDomain keyMetricBodyModalDomain, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = keyMetricBodyModalDomain.calibrationBodyDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = keyMetricBodyModalDomain.metricDescriptionDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = keyMetricBodyModalDomain.individualMetricDisplay;
        }
        if ((i13 & 8) != 0) {
            str4 = keyMetricBodyModalDomain.individualMetricRangeDisplay;
        }
        return keyMetricBodyModalDomain.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$core_details_release(KeyMetricBodyModalDomain self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.calibrationBodyDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.calibrationBodyDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.metricDescriptionDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.metricDescriptionDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.individualMetricDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.individualMetricDisplay);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.individualMetricRangeDisplay == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.individualMetricRangeDisplay);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCalibrationBodyDisplay() {
        return this.calibrationBodyDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMetricDescriptionDisplay() {
        return this.metricDescriptionDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIndividualMetricDisplay() {
        return this.individualMetricDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIndividualMetricRangeDisplay() {
        return this.individualMetricRangeDisplay;
    }

    public final KeyMetricBodyModalDomain copy(String calibrationBodyDisplay, String metricDescriptionDisplay, String individualMetricDisplay, String individualMetricRangeDisplay) {
        return new KeyMetricBodyModalDomain(calibrationBodyDisplay, metricDescriptionDisplay, individualMetricDisplay, individualMetricRangeDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyMetricBodyModalDomain)) {
            return false;
        }
        KeyMetricBodyModalDomain keyMetricBodyModalDomain = (KeyMetricBodyModalDomain) other;
        return AbstractC22676k.m65745e(this.calibrationBodyDisplay, keyMetricBodyModalDomain.calibrationBodyDisplay) && AbstractC22676k.m65745e(this.metricDescriptionDisplay, keyMetricBodyModalDomain.metricDescriptionDisplay) && AbstractC22676k.m65745e(this.individualMetricDisplay, keyMetricBodyModalDomain.individualMetricDisplay) && AbstractC22676k.m65745e(this.individualMetricRangeDisplay, keyMetricBodyModalDomain.individualMetricRangeDisplay);
    }

    public final C23254g formatForSleepDetailsKeyMetricModal(Composer composer, int i13) {
        C38072d c38072d = C38072d.f163053a;
        int i14 = C38072d.f163054b;
        C2889d c2889dM121952e = c38072d.m121952e(composer, i14);
        C39336i c39336iM121949b = c38072d.m121949b(composer, i14);
        C23248d c23248d = new C23248d();
        int iM67307i = c23248d.m67307i(new C23245b0(5, null, 510));
        try {
            int iM67308j = c23248d.m67308j(C23267m0.m67325a(c2889dM121952e.getB2().getStyle().f92255a, c39336iM121949b.getWhite50(), null, 65534));
            try {
                String metricDescriptionDisplay = getMetricDescriptionDisplay();
                if (metricDescriptionDisplay != null) {
                    c23248d.m67300b(metricDescriptionDisplay.concat("\n\n"));
                }
                String calibrationBodyDisplay = getCalibrationBodyDisplay();
                if (calibrationBodyDisplay != null) {
                    c23248d.m67300b(calibrationBodyDisplay.concat("\n\n"));
                }
                String individualMetricDisplay = getIndividualMetricDisplay();
                if (individualMetricDisplay != null) {
                    C28173j1 c28173j1 = C28173j1.f113890a;
                    int i15 = 0;
                    for (C18284j c18284j : c28173j1.m85283a(individualMetricDisplay, c28173j1.m85284b())) {
                        int i16 = c18284j.f71133w;
                        int i17 = c18284j.f71134x;
                        String strSubstring = individualMetricDisplay.substring(i15, i16);
                        AbstractC22676k.m65749i(strSubstring, "substring(...)");
                        c23248d.m67300b(strSubstring);
                        int iM67308j2 = c23248d.m67308j(new C23267m0(c39336iM121949b.getBrandWhite(), 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65534));
                        try {
                            String strSubstring2 = individualMetricDisplay.substring(c18284j.f71133w + 2, i17 - 1);
                            AbstractC22676k.m65749i(strSubstring2, "substring(...)");
                            c23248d.m67300b(strSubstring2);
                            c23248d.m67304f(iM67308j2);
                            i15 = i17 + 1;
                        } catch (Throwable th3) {
                            c23248d.m67304f(iM67308j2);
                            throw th3;
                        }
                    }
                    String strSubstring3 = individualMetricDisplay.substring(i15, individualMetricDisplay.length());
                    AbstractC22676k.m65749i(strSubstring3, "substring(...)");
                    c23248d.m67300b(strSubstring3 + "\n\n");
                }
                String individualMetricRangeDisplay = getIndividualMetricRangeDisplay();
                if (individualMetricRangeDisplay != null) {
                    c23248d.m67300b(individualMetricRangeDisplay);
                }
                c23248d.m67304f(iM67308j);
                c23248d.m67304f(iM67307i);
                return c23248d.m67309k();
            } catch (Throwable th4) {
                c23248d.m67304f(iM67308j);
                throw th4;
            }
        } catch (Throwable th5) {
            c23248d.m67304f(iM67307i);
            throw th5;
        }
    }

    public final String getCalibrationBodyDisplay() {
        return this.calibrationBodyDisplay;
    }

    public final String getIndividualMetricDisplay() {
        return this.individualMetricDisplay;
    }

    public final String getIndividualMetricRangeDisplay() {
        return this.individualMetricRangeDisplay;
    }

    public final String getMetricDescriptionDisplay() {
        return this.metricDescriptionDisplay;
    }

    public int hashCode() {
        String str = this.calibrationBodyDisplay;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.metricDescriptionDisplay;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.individualMetricDisplay;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.individualMetricRangeDisplay;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.calibrationBodyDisplay;
        String str2 = this.metricDescriptionDisplay;
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("KeyMetricBodyModalDomain(calibrationBodyDisplay=", str, ", metricDescriptionDisplay=", str2, ", individualMetricDisplay="), this.individualMetricDisplay, ", individualMetricRangeDisplay=", this.individualMetricRangeDisplay, ")");
    }

    public /* synthetic */ KeyMetricBodyModalDomain(int i13, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.calibrationBodyDisplay = null;
        } else {
            this.calibrationBodyDisplay = str;
        }
        if ((i13 & 2) == 0) {
            this.metricDescriptionDisplay = null;
        } else {
            this.metricDescriptionDisplay = str2;
        }
        if ((i13 & 4) == 0) {
            this.individualMetricDisplay = null;
        } else {
            this.individualMetricDisplay = str3;
        }
        if ((i13 & 8) == 0) {
            this.individualMetricRangeDisplay = null;
        } else {
            this.individualMetricRangeDisplay = str4;
        }
    }

    public KeyMetricBodyModalDomain(String str, String str2, String str3, String str4) {
        this.calibrationBodyDisplay = str;
        this.metricDescriptionDisplay = str2;
        this.individualMetricDisplay = str3;
        this.individualMetricRangeDisplay = str4;
    }

    public /* synthetic */ KeyMetricBodyModalDomain(String str, String str2, String str3, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4);
    }
}
