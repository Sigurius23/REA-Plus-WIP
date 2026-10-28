package com.amplitude.android.engagement.types;

import androidx.core.app.NotificationCompat;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.InterfaceC23457c;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tB?\b\u0017\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J8\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b)\u0010\u0017¨\u0006-"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/GuideOrSurvey;", "", "", "id", "", "title", NotificationCompat.CATEGORY_STATUS, "step", "<init>", "(ILjava/lang/String;Ljava/lang/String;I)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/GuideOrSurvey;Lzc3/c;Lyc3/g;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(ILjava/lang/String;Ljava/lang/String;I)Lcom/amplitude/android/engagement/types/GuideOrSurvey;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getTitle", "getStatus", "getStep", "Companion", "$serializer", "com/amplitude/android/engagement/types/b0", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GuideOrSurvey {
    public static final int $stable = 0;
    public static final C4869b0 Companion = new C4869b0();
    private final int id;
    private final String status;
    private final int step;
    private final String title;

    @InterfaceC23457c
    public /* synthetic */ GuideOrSurvey(int i13, int i14, String str, String str2, int i15, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, GuideOrSurvey$$serializer.INSTANCE.getDescriptor());
        }
        this.id = i14;
        this.title = str;
        this.status = str2;
        if ((i13 & 8) == 0) {
            this.step = 0;
        } else {
            this.step = i15;
        }
    }

    public static /* synthetic */ GuideOrSurvey copy$default(GuideOrSurvey guideOrSurvey, int i13, String str, String str2, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = guideOrSurvey.id;
        }
        if ((i15 & 2) != 0) {
            str = guideOrSurvey.title;
        }
        if ((i15 & 4) != 0) {
            str2 = guideOrSurvey.status;
        }
        if ((i15 & 8) != 0) {
            i14 = guideOrSurvey.step;
        }
        return guideOrSurvey.copy(i13, str, str2, i14);
    }

    public static final /* synthetic */ void write$Self(GuideOrSurvey self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.status);
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.step == 0) {
            return;
        }
        output.encodeIntElement(serialDesc, 3, self.step);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getStep() {
        return this.step;
    }

    public final GuideOrSurvey copy(int id4, String title, String status, int step) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(status, "status");
        return new GuideOrSurvey(id4, title, status, step);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuideOrSurvey)) {
            return false;
        }
        GuideOrSurvey guideOrSurvey = (GuideOrSurvey) other;
        return this.id == guideOrSurvey.id && AbstractC22676k.m65745e(this.title, guideOrSurvey.title) && AbstractC22676k.m65745e(this.status, guideOrSurvey.status) && this.step == guideOrSurvey.step;
    }

    public final int getId() {
        return this.id;
    }

    public final String getStatus() {
        return this.status;
    }

    public final int getStep() {
        return this.step;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Integer.hashCode(this.step) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(Integer.hashCode(this.id) * 31, 31, this.title), 31, this.status);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("GuideOrSurvey(id=");
        sb4.append(this.id);
        sb4.append(", title=");
        sb4.append(this.title);
        sb4.append(", status=");
        sb4.append(this.status);
        sb4.append(", step=");
        return AbstractC11895b.m31999r(sb4, this.step, ')');
    }

    public GuideOrSurvey(int i13, String title, String status, int i14) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(status, "status");
        this.id = i13;
        this.title = title;
        this.status = status;
        this.step = i14;
    }

    public /* synthetic */ GuideOrSurvey(int i13, String str, String str2, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, str, str2, (i15 & 8) != 0 ? 0 : i14);
    }
}
