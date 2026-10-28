package com.whoop.hormonalinsights.postpartum.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gm2.C15999a;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 JD\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u001cJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b/\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010 ¨\u00064"}, m65681d2 = {"Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;", "", "title", "", "minValue", "maxValue", "buttonTitle", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "nextId", "<init>", "(Ljava/lang/String;IILjava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;IILjava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "copy", "(Ljava/lang/String;IILjava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;)Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "I", "getMinValue", "getMaxValue", "getButtonTitle", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "getNextId", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HormonalNumberPickerScreen implements HormonalScreenContent {
    public static final int $stable = 0;
    private final String buttonTitle;
    private final int maxValue;
    private final int minValue;
    private final HormonalScreenId nextId;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C15999a(29))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalNumberPickerScreen;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HormonalNumberPickerScreen$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HormonalNumberPickerScreen(int i13, String str, int i14, int i15, String str2, HormonalScreenId hormonalScreenId, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, HormonalNumberPickerScreen$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.minValue = i14;
        this.maxValue = i15;
        this.buttonTitle = str2;
        this.nextId = hormonalScreenId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId", HormonalScreenId.values());
    }

    public static /* synthetic */ HormonalNumberPickerScreen copy$default(HormonalNumberPickerScreen hormonalNumberPickerScreen, String str, int i13, int i14, String str2, HormonalScreenId hormonalScreenId, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = hormonalNumberPickerScreen.title;
        }
        if ((i15 & 2) != 0) {
            i13 = hormonalNumberPickerScreen.minValue;
        }
        if ((i15 & 4) != 0) {
            i14 = hormonalNumberPickerScreen.maxValue;
        }
        if ((i15 & 8) != 0) {
            str2 = hormonalNumberPickerScreen.buttonTitle;
        }
        if ((i15 & 16) != 0) {
            hormonalScreenId = hormonalNumberPickerScreen.nextId;
        }
        HormonalScreenId hormonalScreenId2 = hormonalScreenId;
        int i16 = i14;
        return hormonalNumberPickerScreen.copy(str, i13, i16, str2, hormonalScreenId2);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(HormonalNumberPickerScreen self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeIntElement(serialDesc, 1, self.minValue);
        output.encodeIntElement(serialDesc, 2, self.maxValue);
        output.encodeStringElement(serialDesc, 3, self.buttonTitle);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.nextId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMinValue() {
        return this.minValue;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMaxValue() {
        return this.maxValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final HormonalScreenId getNextId() {
        return this.nextId;
    }

    public final HormonalNumberPickerScreen copy(String title, int minValue, int maxValue, String buttonTitle, HormonalScreenId nextId) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        return new HormonalNumberPickerScreen(title, minValue, maxValue, buttonTitle, nextId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HormonalNumberPickerScreen)) {
            return false;
        }
        HormonalNumberPickerScreen hormonalNumberPickerScreen = (HormonalNumberPickerScreen) other;
        return AbstractC22676k.m65745e(this.title, hormonalNumberPickerScreen.title) && this.minValue == hormonalNumberPickerScreen.minValue && this.maxValue == hormonalNumberPickerScreen.maxValue && AbstractC22676k.m65745e(this.buttonTitle, hormonalNumberPickerScreen.buttonTitle) && this.nextId == hormonalNumberPickerScreen.nextId;
    }

    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final int getMinValue() {
        return this.minValue;
    }

    public final HormonalScreenId getNextId() {
        return this.nextId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.maxValue, AbstractC11266d.m30448b(this.minValue, this.title.hashCode() * 31, 31), 31), 31, this.buttonTitle);
        HormonalScreenId hormonalScreenId = this.nextId;
        return iM30450d + (hormonalScreenId == null ? 0 : hormonalScreenId.hashCode());
    }

    public String toString() {
        String str = this.title;
        int i13 = this.minValue;
        int i14 = this.maxValue;
        String str2 = this.buttonTitle;
        HormonalScreenId hormonalScreenId = this.nextId;
        StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "HormonalNumberPickerScreen(title=", str, ", minValue=", ", maxValue=");
        AbstractC11895b.m31979B(i14, ", buttonTitle=", str2, ", nextId=", sbM30467u);
        sbM30467u.append(hormonalScreenId);
        sbM30467u.append(")");
        return sbM30467u.toString();
    }

    public HormonalNumberPickerScreen(String title, int i13, int i14, String buttonTitle, HormonalScreenId hormonalScreenId) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        this.title = title;
        this.minValue = i13;
        this.maxValue = i14;
        this.buttonTitle = buttonTitle;
        this.nextId = hormonalScreenId;
    }
}
