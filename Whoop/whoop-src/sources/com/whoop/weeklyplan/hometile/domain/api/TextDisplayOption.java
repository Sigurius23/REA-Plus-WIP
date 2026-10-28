package com.whoop.weeklyplan.hometile.domain.api;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import dq2.C12293a;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ.\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0018J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001c¨\u0006-"}, m65681d2 = {"Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayOption;", "", "", "value", "", "label", "Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;", "style", "<init>", "(ILjava/lang/String;Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayOption;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;", "copy", "(ILjava/lang/String;Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;)Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayOption;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getValue", "Ljava/lang/String;", "getLabel", "Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;", "getStyle", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TextDisplayOption {
    public static final int $stable = 0;
    private final String label;
    private final TextDisplayStyle style;
    private final int value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C12293a(13))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayOption$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayOption;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TextDisplayOption$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextDisplayOption(int i13, int i14, String str, TextDisplayStyle textDisplayStyle, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, TextDisplayOption$$serializer.INSTANCE.getDescriptor());
        }
        this.value = i14;
        this.label = str;
        this.style = textDisplayStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.weeklyplan.hometile.domain.api.TextDisplayStyle", TextDisplayStyle.values());
    }

    public static /* synthetic */ TextDisplayOption copy$default(TextDisplayOption textDisplayOption, int i13, String str, TextDisplayStyle textDisplayStyle, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = textDisplayOption.value;
        }
        if ((i14 & 2) != 0) {
            str = textDisplayOption.label;
        }
        if ((i14 & 4) != 0) {
            textDisplayStyle = textDisplayOption.style;
        }
        return textDisplayOption.copy(i13, str, textDisplayStyle);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(TextDisplayOption self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeIntElement(serialDesc, 0, self.value);
        output.encodeStringElement(serialDesc, 1, self.label);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.style);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextDisplayStyle getStyle() {
        return this.style;
    }

    public final TextDisplayOption copy(int value, String label, TextDisplayStyle style) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(style, "style");
        return new TextDisplayOption(value, label, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextDisplayOption)) {
            return false;
        }
        TextDisplayOption textDisplayOption = (TextDisplayOption) other;
        return this.value == textDisplayOption.value && AbstractC22676k.m65745e(this.label, textDisplayOption.label) && this.style == textDisplayOption.style;
    }

    public final String getLabel() {
        return this.label;
    }

    public final TextDisplayStyle getStyle() {
        return this.style;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.style.hashCode() + AbstractC11266d.m30450d(Integer.hashCode(this.value) * 31, 31, this.label);
    }

    public String toString() {
        int i13 = this.value;
        String str = this.label;
        TextDisplayStyle textDisplayStyle = this.style;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "TextDisplayOption(value=", ", label=", str, ", style=");
        sbM53373n.append(textDisplayStyle);
        sbM53373n.append(")");
        return sbM53373n.toString();
    }

    public TextDisplayOption(int i13, String label, TextDisplayStyle style) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(style, "style");
        this.value = i13;
        this.label = label;
        this.style = style;
    }
}
