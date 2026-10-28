package com.whoop.pregnancy.api;

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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010'\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b-\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b.\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b/\u0010\u0019¨\u00063"}, m65681d2 = {"Lcom/whoop/pregnancy/api/DueDateOptionsDto;", "", "", "title", "button", "currentDate", "maxDate", "minDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$pregnancy_release", "(Lcom/whoop/pregnancy/api/DueDateOptionsDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/pregnancy/api/DueDateOptionsDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getButton", "getButton$annotations", "getCurrentDate", "getMaxDate", "getMinDate", "Companion", "$serializer", "a", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DueDateOptionsDto {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String button;
    private final String currentDate;
    private final String maxDate;
    private final String minDate;
    private final String title;

    /* JADX INFO: renamed from: com.whoop.pregnancy.api.DueDateOptionsDto$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/pregnancy/api/DueDateOptionsDto$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/pregnancy/api/DueDateOptionsDto;", "serializer", "()Lwc3/c;", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DueDateOptionsDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DueDateOptionsDto(int i13, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, DueDateOptionsDto$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.button = str2;
        this.currentDate = str3;
        this.maxDate = str4;
        this.minDate = str5;
    }

    public static /* synthetic */ DueDateOptionsDto copy$default(DueDateOptionsDto dueDateOptionsDto, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = dueDateOptionsDto.title;
        }
        if ((i13 & 2) != 0) {
            str2 = dueDateOptionsDto.button;
        }
        if ((i13 & 4) != 0) {
            str3 = dueDateOptionsDto.currentDate;
        }
        if ((i13 & 8) != 0) {
            str4 = dueDateOptionsDto.maxDate;
        }
        if ((i13 & 16) != 0) {
            str5 = dueDateOptionsDto.minDate;
        }
        String str6 = str5;
        String str7 = str3;
        return dueDateOptionsDto.copy(str, str2, str7, str4, str6);
    }

    @InterfaceC37143h("button_display")
    public static /* synthetic */ void getButton$annotations() {
    }

    @InterfaceC37143h("title_display")
    public static /* synthetic */ void getTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$pregnancy_release(DueDateOptionsDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.button);
        output.encodeStringElement(serialDesc, 2, self.currentDate);
        output.encodeStringElement(serialDesc, 3, self.maxDate);
        output.encodeStringElement(serialDesc, 4, self.minDate);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrentDate() {
        return this.currentDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMaxDate() {
        return this.maxDate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMinDate() {
        return this.minDate;
    }

    public final DueDateOptionsDto copy(String title, String button, String currentDate, String maxDate, String minDate) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(button, "button");
        AbstractC22676k.m65750j(currentDate, "currentDate");
        AbstractC22676k.m65750j(maxDate, "maxDate");
        AbstractC22676k.m65750j(minDate, "minDate");
        return new DueDateOptionsDto(title, button, currentDate, maxDate, minDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DueDateOptionsDto)) {
            return false;
        }
        DueDateOptionsDto dueDateOptionsDto = (DueDateOptionsDto) other;
        return AbstractC22676k.m65745e(this.title, dueDateOptionsDto.title) && AbstractC22676k.m65745e(this.button, dueDateOptionsDto.button) && AbstractC22676k.m65745e(this.currentDate, dueDateOptionsDto.currentDate) && AbstractC22676k.m65745e(this.maxDate, dueDateOptionsDto.maxDate) && AbstractC22676k.m65745e(this.minDate, dueDateOptionsDto.minDate);
    }

    public final String getButton() {
        return this.button;
    }

    public final String getCurrentDate() {
        return this.currentDate;
    }

    public final String getMaxDate() {
        return this.maxDate;
    }

    public final String getMinDate() {
        return this.minDate;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.minDate.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.button), 31, this.currentDate), 31, this.maxDate);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.button;
        String str3 = this.currentDate;
        String str4 = this.maxDate;
        String str5 = this.minDate;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DueDateOptionsDto(title=", str, ", button=", str2, ", currentDate=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", maxDate=", str4, ", minDate=");
        return AbstractC25012a.m73376i(str5, ")", sbM32001t);
    }

    public DueDateOptionsDto(String title, String button, String currentDate, String maxDate, String minDate) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(button, "button");
        AbstractC22676k.m65750j(currentDate, "currentDate");
        AbstractC22676k.m65750j(maxDate, "maxDate");
        AbstractC22676k.m65750j(minDate, "minDate");
        this.title = title;
        this.button = button;
        this.currentDate = currentDate;
        this.maxDate = maxDate;
        this.minDate = minDate;
    }
}
