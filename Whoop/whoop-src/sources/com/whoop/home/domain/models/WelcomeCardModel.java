package com.whoop.home.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 $2\u00020\u0001:\u0002%$B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBU\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b#\u0010\u001c¨\u0006&"}, m65681d2 = {"Lcom/whoop/home/domain/models/WelcomeCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "endIcon", "dayStrainDisplay", "dayStrainSubtitleDisplay", "", "dayStrainGaugeFillPercentage", "strainHelpIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$home_release", "(Lcom/whoop/home/domain/models/WelcomeCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getEndIcon", "getDayStrainDisplay", "getDayStrainSubtitleDisplay", "D", "getDayStrainGaugeFillPercentage", "()D", "getStrainHelpIcon", "Companion", "$serializer", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final class WelcomeCardModel implements DesignSystemModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String dayStrainDisplay;
    private final double dayStrainGaugeFillPercentage;
    private final String dayStrainSubtitleDisplay;
    private final String endIcon;
    private final String strainHelpIcon;
    private final String title;

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/home/domain/models/WelcomeCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/home/domain/models/WelcomeCardModel;", "serializer", "()Lwc3/c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WelcomeCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WelcomeCardModel(int i13, String str, String str2, String str3, String str4, double d3, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, WelcomeCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.endIcon = str2;
        this.dayStrainDisplay = str3;
        this.dayStrainSubtitleDisplay = str4;
        this.dayStrainGaugeFillPercentage = d3;
        this.strainHelpIcon = str5;
    }

    public static final /* synthetic */ void write$Self$home_release(WelcomeCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.endIcon);
        output.encodeStringElement(serialDesc, 2, self.dayStrainDisplay);
        output.encodeStringElement(serialDesc, 3, self.dayStrainSubtitleDisplay);
        output.encodeDoubleElement(serialDesc, 4, self.dayStrainGaugeFillPercentage);
        output.encodeStringElement(serialDesc, 5, self.strainHelpIcon);
    }

    public final String getDayStrainDisplay() {
        return this.dayStrainDisplay;
    }

    public final double getDayStrainGaugeFillPercentage() {
        return this.dayStrainGaugeFillPercentage;
    }

    public final String getDayStrainSubtitleDisplay() {
        return this.dayStrainSubtitleDisplay;
    }

    public final String getEndIcon() {
        return this.endIcon;
    }

    public final String getStrainHelpIcon() {
        return this.strainHelpIcon;
    }

    public final String getTitle() {
        return this.title;
    }

    public WelcomeCardModel(String title, String str, String dayStrainDisplay, String dayStrainSubtitleDisplay, double d3, String strainHelpIcon) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(dayStrainDisplay, "dayStrainDisplay");
        AbstractC22676k.m65750j(dayStrainSubtitleDisplay, "dayStrainSubtitleDisplay");
        AbstractC22676k.m65750j(strainHelpIcon, "strainHelpIcon");
        this.title = title;
        this.endIcon = str;
        this.dayStrainDisplay = dayStrainDisplay;
        this.dayStrainSubtitleDisplay = dayStrainSubtitleDisplay;
        this.dayStrainGaugeFillPercentage = d3;
        this.strainHelpIcon = strainHelpIcon;
    }
}
