package com.whoop.clinicianintheloop.api;

import com.whoop.design.models.items.ImageUrlModel;
import com.whoop.design.models.items.ImageUrlModel$$serializer;
import com.whoop.design.models.items.TextAreaModel;
import com.whoop.design.models.items.TextAreaModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gm2.C15999a;
import go0.InterfaceC16013c;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00029:B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBS\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$JL\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u001fJ\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b3\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010$¨\u0006;"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/api/TextEntryScreen;", "Lgo0/c;", "Lcom/whoop/design/models/items/ImageUrlModel;", "image", "", "title", "subtitle", "", "Lcom/whoop/design/models/items/TextAreaModel;", "textAreas", "Lcom/whoop/clinicianintheloop/api/IntakeCheckbox;", "checkbox", "<init>", "(Lcom/whoop/design/models/items/ImageUrlModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/clinicianintheloop/api/IntakeCheckbox;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/ImageUrlModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/clinicianintheloop/api/IntakeCheckbox;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$clinician_in_the_loop_release", "(Lcom/whoop/clinicianintheloop/api/TextEntryScreen;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/ImageUrlModel;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/List;", "component5", "()Lcom/whoop/clinicianintheloop/api/IntakeCheckbox;", "copy", "(Lcom/whoop/design/models/items/ImageUrlModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/clinicianintheloop/api/IntakeCheckbox;)Lcom/whoop/clinicianintheloop/api/TextEntryScreen;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/ImageUrlModel;", "getImage", "Ljava/lang/String;", "getTitle", "getSubtitle", "Ljava/util/List;", "getTextAreas", "Lcom/whoop/clinicianintheloop/api/IntakeCheckbox;", "getCheckbox", "Companion", "$serializer", "a", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TextEntryScreen implements InterfaceC16013c {
    private final IntakeCheckbox checkbox;
    private final ImageUrlModel image;
    private final String subtitle;
    private final List<TextAreaModel> textAreas;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C15999a(15)), null};

    /* JADX INFO: renamed from: com.whoop.clinicianintheloop.api.TextEntryScreen$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/api/TextEntryScreen$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/clinicianintheloop/api/TextEntryScreen;", "serializer", "()Lwc3/c;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TextEntryScreen$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextEntryScreen(int i13, ImageUrlModel imageUrlModel, String str, String str2, List list, IntakeCheckbox intakeCheckbox, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, TextEntryScreen$$serializer.INSTANCE.getDescriptor());
        }
        this.image = imageUrlModel;
        this.title = str;
        this.subtitle = str2;
        this.textAreas = list;
        this.checkbox = intakeCheckbox;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(TextAreaModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextEntryScreen copy$default(TextEntryScreen textEntryScreen, ImageUrlModel imageUrlModel, String str, String str2, List list, IntakeCheckbox intakeCheckbox, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            imageUrlModel = textEntryScreen.image;
        }
        if ((i13 & 2) != 0) {
            str = textEntryScreen.title;
        }
        if ((i13 & 4) != 0) {
            str2 = textEntryScreen.subtitle;
        }
        if ((i13 & 8) != 0) {
            list = textEntryScreen.textAreas;
        }
        if ((i13 & 16) != 0) {
            intakeCheckbox = textEntryScreen.checkbox;
        }
        IntakeCheckbox intakeCheckbox2 = intakeCheckbox;
        String str3 = str2;
        return textEntryScreen.copy(imageUrlModel, str, str3, list, intakeCheckbox2);
    }

    public static final /* synthetic */ void write$Self$clinician_in_the_loop_release(TextEntryScreen self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, ImageUrlModel$$serializer.INSTANCE, self.image);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.subtitle);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.textAreas);
        output.encodeNullableSerializableElement(serialDesc, 4, IntakeCheckbox$$serializer.INSTANCE, self.checkbox);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ImageUrlModel getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<TextAreaModel> component4() {
        return this.textAreas;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final IntakeCheckbox getCheckbox() {
        return this.checkbox;
    }

    public final TextEntryScreen copy(ImageUrlModel image, String title, String subtitle, List<TextAreaModel> textAreas, IntakeCheckbox checkbox) {
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(textAreas, "textAreas");
        return new TextEntryScreen(image, title, subtitle, textAreas, checkbox);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextEntryScreen)) {
            return false;
        }
        TextEntryScreen textEntryScreen = (TextEntryScreen) other;
        return AbstractC22676k.m65745e(this.image, textEntryScreen.image) && AbstractC22676k.m65745e(this.title, textEntryScreen.title) && AbstractC22676k.m65745e(this.subtitle, textEntryScreen.subtitle) && AbstractC22676k.m65745e(this.textAreas, textEntryScreen.textAreas) && AbstractC22676k.m65745e(this.checkbox, textEntryScreen.checkbox);
    }

    public final IntakeCheckbox getCheckbox() {
        return this.checkbox;
    }

    public final ImageUrlModel getImage() {
        return this.image;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<TextAreaModel> getTextAreas() {
        return this.textAreas;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.image.hashCode() * 31, 31, this.title);
        String str = this.subtitle;
        int iM31983b = AbstractC11895b.m31983b((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.textAreas);
        IntakeCheckbox intakeCheckbox = this.checkbox;
        return iM31983b + (intakeCheckbox != null ? intakeCheckbox.hashCode() : 0);
    }

    public String toString() {
        ImageUrlModel imageUrlModel = this.image;
        String str = this.title;
        String str2 = this.subtitle;
        List<TextAreaModel> list = this.textAreas;
        IntakeCheckbox intakeCheckbox = this.checkbox;
        StringBuilder sb4 = new StringBuilder("TextEntryScreen(image=");
        sb4.append(imageUrlModel);
        sb4.append(", title=");
        sb4.append(str);
        sb4.append(", subtitle=");
        AbstractC36095b.m114694v(str2, ", textAreas=", ", checkbox=", sb4, list);
        sb4.append(intakeCheckbox);
        sb4.append(")");
        return sb4.toString();
    }

    public TextEntryScreen(ImageUrlModel image, String title, String str, List<TextAreaModel> textAreas, IntakeCheckbox intakeCheckbox) {
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(textAreas, "textAreas");
        this.image = image;
        this.title = title;
        this.subtitle = str;
        this.textAreas = textAreas;
        this.checkbox = intakeCheckbox;
    }
}
