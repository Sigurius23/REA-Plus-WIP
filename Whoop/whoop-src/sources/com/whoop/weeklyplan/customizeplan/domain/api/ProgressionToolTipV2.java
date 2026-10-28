package com.whoop.weeklyplan.customizeplan.domain.api;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import jh3.AbstractC21702c;
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

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBU\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!JL\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001bR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001bR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b1\u0010/\u001a\u0004\b0\u0010\u001bR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b3\u0010/\u001a\u0004\b2\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b\t\u0010!¨\u00067"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;", "", "", "title", "description", "currentBarCopy", "weeklyIncreaseCopy", "targetBarCopy", "", "isOptimal", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getDescription", "getCurrentBarCopy", "getCurrentBarCopy$annotations", "()V", "getWeeklyIncreaseCopy", "getWeeklyIncreaseCopy$annotations", "getTargetBarCopy", "getTargetBarCopy$annotations", "Z", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProgressionToolTipV2 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String currentBarCopy;
    private final String description;
    private final boolean isOptimal;
    private final String targetBarCopy;
    private final String title;
    private final String weeklyIncreaseCopy;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/ProgressionToolTipV2;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ProgressionToolTipV2$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ProgressionToolTipV2(int i13, String str, String str2, String str3, String str4, String str5, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, ProgressionToolTipV2$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.description = str2;
        this.currentBarCopy = str3;
        this.weeklyIncreaseCopy = str4;
        this.targetBarCopy = str5;
        this.isOptimal = z4;
    }

    public static /* synthetic */ ProgressionToolTipV2 copy$default(ProgressionToolTipV2 progressionToolTipV2, String str, String str2, String str3, String str4, String str5, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = progressionToolTipV2.title;
        }
        if ((i13 & 2) != 0) {
            str2 = progressionToolTipV2.description;
        }
        if ((i13 & 4) != 0) {
            str3 = progressionToolTipV2.currentBarCopy;
        }
        if ((i13 & 8) != 0) {
            str4 = progressionToolTipV2.weeklyIncreaseCopy;
        }
        if ((i13 & 16) != 0) {
            str5 = progressionToolTipV2.targetBarCopy;
        }
        if ((i13 & 32) != 0) {
            z4 = progressionToolTipV2.isOptimal;
        }
        String str6 = str5;
        boolean z13 = z4;
        return progressionToolTipV2.copy(str, str2, str3, str4, str6, z13);
    }

    @InterfaceC37143h("current_bar")
    public static /* synthetic */ void getCurrentBarCopy$annotations() {
    }

    @InterfaceC37143h("target_bar")
    public static /* synthetic */ void getTargetBarCopy$annotations() {
    }

    @InterfaceC37143h("weekly_increase")
    public static /* synthetic */ void getWeeklyIncreaseCopy$annotations() {
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(ProgressionToolTipV2 self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.description);
        output.encodeStringElement(serialDesc, 2, self.currentBarCopy);
        output.encodeStringElement(serialDesc, 3, self.weeklyIncreaseCopy);
        output.encodeStringElement(serialDesc, 4, self.targetBarCopy);
        output.encodeBooleanElement(serialDesc, 5, self.isOptimal);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrentBarCopy() {
        return this.currentBarCopy;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getWeeklyIncreaseCopy() {
        return this.weeklyIncreaseCopy;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTargetBarCopy() {
        return this.targetBarCopy;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsOptimal() {
        return this.isOptimal;
    }

    public final ProgressionToolTipV2 copy(String title, String description, String currentBarCopy, String weeklyIncreaseCopy, String targetBarCopy, boolean isOptimal) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(currentBarCopy, "currentBarCopy");
        AbstractC22676k.m65750j(weeklyIncreaseCopy, "weeklyIncreaseCopy");
        AbstractC22676k.m65750j(targetBarCopy, "targetBarCopy");
        return new ProgressionToolTipV2(title, description, currentBarCopy, weeklyIncreaseCopy, targetBarCopy, isOptimal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressionToolTipV2)) {
            return false;
        }
        ProgressionToolTipV2 progressionToolTipV2 = (ProgressionToolTipV2) other;
        return AbstractC22676k.m65745e(this.title, progressionToolTipV2.title) && AbstractC22676k.m65745e(this.description, progressionToolTipV2.description) && AbstractC22676k.m65745e(this.currentBarCopy, progressionToolTipV2.currentBarCopy) && AbstractC22676k.m65745e(this.weeklyIncreaseCopy, progressionToolTipV2.weeklyIncreaseCopy) && AbstractC22676k.m65745e(this.targetBarCopy, progressionToolTipV2.targetBarCopy) && this.isOptimal == progressionToolTipV2.isOptimal;
    }

    public final String getCurrentBarCopy() {
        return this.currentBarCopy;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTargetBarCopy() {
        return this.targetBarCopy;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getWeeklyIncreaseCopy() {
        return this.weeklyIncreaseCopy;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isOptimal) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.description), 31, this.currentBarCopy), 31, this.weeklyIncreaseCopy), 31, this.targetBarCopy);
    }

    public final boolean isOptimal() {
        return this.isOptimal;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        String str3 = this.currentBarCopy;
        String str4 = this.weeklyIncreaseCopy;
        String str5 = this.targetBarCopy;
        boolean z4 = this.isOptimal;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ProgressionToolTipV2(title=", str, ", description=", str2, ", currentBarCopy=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", weeklyIncreaseCopy=", str4, ", targetBarCopy=");
        return AbstractC21702c.m61137h(sbM32001t, str5, ", isOptimal=", z4, ")");
    }

    public ProgressionToolTipV2(String title, String description, String currentBarCopy, String weeklyIncreaseCopy, String targetBarCopy, boolean z4) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(currentBarCopy, "currentBarCopy");
        AbstractC22676k.m65750j(weeklyIncreaseCopy, "weeklyIncreaseCopy");
        AbstractC22676k.m65750j(targetBarCopy, "targetBarCopy");
        this.title = title;
        this.description = description;
        this.currentBarCopy = currentBarCopy;
        this.weeklyIncreaseCopy = weeklyIncreaseCopy;
        this.targetBarCopy = targetBarCopy;
        this.isOptimal = z4;
    }
}
