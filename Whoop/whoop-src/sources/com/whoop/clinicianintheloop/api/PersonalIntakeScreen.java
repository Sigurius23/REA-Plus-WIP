package com.whoop.clinicianintheloop.api;

import com.whoop.design.models.items.form.FormTextFieldModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import go0.InterfaceC16013c;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001b¨\u0006."}, m65681d2 = {"Lcom/whoop/clinicianintheloop/api/PersonalIntakeScreen;", "Lgo0/c;", "", "title", "subtitle", "Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;", "personalIntakeForm", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$clinician_in_the_loop_release", "(Lcom/whoop/clinicianintheloop/api/PersonalIntakeScreen;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;)Lcom/whoop/clinicianintheloop/api/PersonalIntakeScreen;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/whoop/clinicianintheloop/api/PersonalIntakeForm;", "getPersonalIntakeForm", "Companion", "$serializer", "a", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PersonalIntakeScreen implements InterfaceC16013c {
    private final PersonalIntakeForm personalIntakeForm;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = FormTextFieldModel.$stable;

    /* JADX INFO: renamed from: com.whoop.clinicianintheloop.api.PersonalIntakeScreen$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/api/PersonalIntakeScreen$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/clinicianintheloop/api/PersonalIntakeScreen;", "serializer", "()Lwc3/c;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PersonalIntakeScreen$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PersonalIntakeScreen(int i13, String str, String str2, PersonalIntakeForm personalIntakeForm, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, PersonalIntakeScreen$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.subtitle = str2;
        this.personalIntakeForm = personalIntakeForm;
    }

    public static /* synthetic */ PersonalIntakeScreen copy$default(PersonalIntakeScreen personalIntakeScreen, String str, String str2, PersonalIntakeForm personalIntakeForm, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = personalIntakeScreen.title;
        }
        if ((i13 & 2) != 0) {
            str2 = personalIntakeScreen.subtitle;
        }
        if ((i13 & 4) != 0) {
            personalIntakeForm = personalIntakeScreen.personalIntakeForm;
        }
        return personalIntakeScreen.copy(str, str2, personalIntakeForm);
    }

    public static final /* synthetic */ void write$Self$clinician_in_the_loop_release(PersonalIntakeScreen self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.subtitle);
        output.encodeSerializableElement(serialDesc, 2, PersonalIntakeForm$$serializer.INSTANCE, self.personalIntakeForm);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PersonalIntakeForm getPersonalIntakeForm() {
        return this.personalIntakeForm;
    }

    public final PersonalIntakeScreen copy(String title, String subtitle, PersonalIntakeForm personalIntakeForm) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(personalIntakeForm, "personalIntakeForm");
        return new PersonalIntakeScreen(title, subtitle, personalIntakeForm);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalIntakeScreen)) {
            return false;
        }
        PersonalIntakeScreen personalIntakeScreen = (PersonalIntakeScreen) other;
        return AbstractC22676k.m65745e(this.title, personalIntakeScreen.title) && AbstractC22676k.m65745e(this.subtitle, personalIntakeScreen.subtitle) && AbstractC22676k.m65745e(this.personalIntakeForm, personalIntakeScreen.personalIntakeForm);
    }

    public final PersonalIntakeForm getPersonalIntakeForm() {
        return this.personalIntakeForm;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        return this.personalIntakeForm.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        PersonalIntakeForm personalIntakeForm = this.personalIntakeForm;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PersonalIntakeScreen(title=", str, ", subtitle=", str2, ", personalIntakeForm=");
        sbM32001t.append(personalIntakeForm);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public PersonalIntakeScreen(String title, String str, PersonalIntakeForm personalIntakeForm) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(personalIntakeForm, "personalIntakeForm");
        this.title = title;
        this.subtitle = str;
        this.personalIntakeForm = personalIntakeForm;
    }
}
