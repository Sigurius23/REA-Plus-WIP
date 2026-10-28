package com.whoop.user.journey.model.yearinreview;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJL\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u001a¨\u00062"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;", "", "", "leftStat", "leftText", "rightStat", "rightText", "leftStyle", "rightStyle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$user_journey_release", "(Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLeftStat", "getLeftText", "getRightStat", "getRightText", "getLeftStyle", "getRightStyle", "Companion", "$serializer", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ComparisonFooter {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String leftStat;
    private final String leftStyle;
    private final String leftText;
    private final String rightStat;
    private final String rightStyle;
    private final String rightText;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;", "serializer", "()Lwc3/c;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ComparisonFooter$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ComparisonFooter(int i13, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, ComparisonFooter$$serializer.INSTANCE.getDescriptor());
        }
        this.leftStat = str;
        this.leftText = str2;
        this.rightStat = str3;
        this.rightText = str4;
        this.leftStyle = str5;
        this.rightStyle = str6;
    }

    public static /* synthetic */ ComparisonFooter copy$default(ComparisonFooter comparisonFooter, String str, String str2, String str3, String str4, String str5, String str6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = comparisonFooter.leftStat;
        }
        if ((i13 & 2) != 0) {
            str2 = comparisonFooter.leftText;
        }
        if ((i13 & 4) != 0) {
            str3 = comparisonFooter.rightStat;
        }
        if ((i13 & 8) != 0) {
            str4 = comparisonFooter.rightText;
        }
        if ((i13 & 16) != 0) {
            str5 = comparisonFooter.leftStyle;
        }
        if ((i13 & 32) != 0) {
            str6 = comparisonFooter.rightStyle;
        }
        String str7 = str5;
        String str8 = str6;
        return comparisonFooter.copy(str, str2, str3, str4, str7, str8);
    }

    public static final /* synthetic */ void write$Self$user_journey_release(ComparisonFooter self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.leftStat);
        output.encodeStringElement(serialDesc, 1, self.leftText);
        output.encodeStringElement(serialDesc, 2, self.rightStat);
        output.encodeStringElement(serialDesc, 3, self.rightText);
        output.encodeStringElement(serialDesc, 4, self.leftStyle);
        output.encodeStringElement(serialDesc, 5, self.rightStyle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLeftStat() {
        return this.leftStat;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLeftText() {
        return this.leftText;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRightStat() {
        return this.rightStat;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRightText() {
        return this.rightText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLeftStyle() {
        return this.leftStyle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRightStyle() {
        return this.rightStyle;
    }

    public final ComparisonFooter copy(String leftStat, String leftText, String rightStat, String rightText, String leftStyle, String rightStyle) {
        AbstractC22676k.m65750j(leftStat, "leftStat");
        AbstractC22676k.m65750j(leftText, "leftText");
        AbstractC22676k.m65750j(rightStat, "rightStat");
        AbstractC22676k.m65750j(rightText, "rightText");
        AbstractC22676k.m65750j(leftStyle, "leftStyle");
        AbstractC22676k.m65750j(rightStyle, "rightStyle");
        return new ComparisonFooter(leftStat, leftText, rightStat, rightText, leftStyle, rightStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComparisonFooter)) {
            return false;
        }
        ComparisonFooter comparisonFooter = (ComparisonFooter) other;
        return AbstractC22676k.m65745e(this.leftStat, comparisonFooter.leftStat) && AbstractC22676k.m65745e(this.leftText, comparisonFooter.leftText) && AbstractC22676k.m65745e(this.rightStat, comparisonFooter.rightStat) && AbstractC22676k.m65745e(this.rightText, comparisonFooter.rightText) && AbstractC22676k.m65745e(this.leftStyle, comparisonFooter.leftStyle) && AbstractC22676k.m65745e(this.rightStyle, comparisonFooter.rightStyle);
    }

    public final String getLeftStat() {
        return this.leftStat;
    }

    public final String getLeftStyle() {
        return this.leftStyle;
    }

    public final String getLeftText() {
        return this.leftText;
    }

    public final String getRightStat() {
        return this.rightStat;
    }

    public final String getRightStyle() {
        return this.rightStyle;
    }

    public final String getRightText() {
        return this.rightText;
    }

    public int hashCode() {
        return this.rightStyle.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.leftStat.hashCode() * 31, 31, this.leftText), 31, this.rightStat), 31, this.rightText), 31, this.leftStyle);
    }

    public String toString() {
        String str = this.leftStat;
        String str2 = this.leftText;
        String str3 = this.rightStat;
        String str4 = this.rightText;
        String str5 = this.leftStyle;
        String str6 = this.rightStyle;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ComparisonFooter(leftStat=", str, ", leftText=", str2, ", rightStat=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", rightText=", str4, ", leftStyle=");
        return AbstractC11266d.m30464r(sbM32001t, str5, ", rightStyle=", str6, ")");
    }

    public ComparisonFooter(String leftStat, String leftText, String rightStat, String rightText, String leftStyle, String rightStyle) {
        AbstractC22676k.m65750j(leftStat, "leftStat");
        AbstractC22676k.m65750j(leftText, "leftText");
        AbstractC22676k.m65750j(rightStat, "rightStat");
        AbstractC22676k.m65750j(rightText, "rightText");
        AbstractC22676k.m65750j(leftStyle, "leftStyle");
        AbstractC22676k.m65750j(rightStyle, "rightStyle");
        this.leftStat = leftStat;
        this.leftText = leftText;
        this.rightStat = rightStat;
        this.rightText = rightText;
        this.leftStyle = leftStyle;
        this.rightStyle = rightStyle;
    }
}
