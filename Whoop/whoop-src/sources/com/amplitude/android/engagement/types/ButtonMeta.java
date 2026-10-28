package com.amplitude.android.engagement.types;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import p305lj.C24416a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000278BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rBS\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÇ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJR\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010 R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b5\u0010\u001e¨\u00069"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/ButtonMeta;", "", "", "label", "Lcom/amplitude/android/engagement/types/Action;", "action", "Lcom/amplitude/android/engagement/types/ButtonType;", "buttonType", "", "Lcom/amplitude/android/engagement/types/NudgeConditionalAction;", "conditionalActions", "defaultAction", "<init>", "(Ljava/lang/String;Lcom/amplitude/android/engagement/types/Action;Lcom/amplitude/android/engagement/types/ButtonType;Ljava/util/List;Lcom/amplitude/android/engagement/types/Action;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/amplitude/android/engagement/types/Action;Lcom/amplitude/android/engagement/types/ButtonType;Ljava/util/List;Lcom/amplitude/android/engagement/types/Action;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/ButtonMeta;Lzc3/c;Lyc3/g;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/amplitude/android/engagement/types/Action;", "component3", "()Lcom/amplitude/android/engagement/types/ButtonType;", "component4", "()Ljava/util/List;", "component5", "copy", "(Ljava/lang/String;Lcom/amplitude/android/engagement/types/Action;Lcom/amplitude/android/engagement/types/ButtonType;Ljava/util/List;Lcom/amplitude/android/engagement/types/Action;)Lcom/amplitude/android/engagement/types/ButtonMeta;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "Lcom/amplitude/android/engagement/types/Action;", "getAction", "Lcom/amplitude/android/engagement/types/ButtonType;", "getButtonType", "Ljava/util/List;", "getConditionalActions", "getDefaultAction", "Companion", "$serializer", "com/amplitude/android/engagement/types/h", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ButtonMeta {
    private static final InterfaceC37138c[] $childSerializers;
    public static final int $stable = 8;
    public static final C4892h Companion = new C4892h();
    private final Action action;
    private final ButtonType buttonType;
    private final List<NudgeConditionalAction> conditionalActions;
    private final Action defaultAction;
    private final String label;

    static {
        C24416a c24416a = Action.Companion;
        $childSerializers = new InterfaceC37138c[]{null, c24416a.serializer(), ButtonType.Companion.serializer(), new ArrayListSerializer(NudgeConditionalAction$$serializer.INSTANCE), c24416a.serializer()};
    }

    public ButtonMeta() {
        this((String) null, (Action) null, (ButtonType) null, (List) null, (Action) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ButtonMeta copy$default(ButtonMeta buttonMeta, String str, Action action, ButtonType buttonType, List list, Action action2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = buttonMeta.label;
        }
        if ((i13 & 2) != 0) {
            action = buttonMeta.action;
        }
        if ((i13 & 4) != 0) {
            buttonType = buttonMeta.buttonType;
        }
        if ((i13 & 8) != 0) {
            list = buttonMeta.conditionalActions;
        }
        if ((i13 & 16) != 0) {
            action2 = buttonMeta.defaultAction;
        }
        Action action3 = action2;
        ButtonType buttonType2 = buttonType;
        return buttonMeta.copy(str, action, buttonType2, list, action3);
    }

    public static final /* synthetic */ void write$Self(ButtonMeta self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.label != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.label);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.action != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, interfaceC37138cArr[1], self.action);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.buttonType != ButtonType.PRIMARY) {
            output.encodeNullableSerializableElement(serialDesc, 2, interfaceC37138cArr[2], self.buttonType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.conditionalActions != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, interfaceC37138cArr[3], self.conditionalActions);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.defaultAction == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, interfaceC37138cArr[4], self.defaultAction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ButtonType getButtonType() {
        return this.buttonType;
    }

    public final List<NudgeConditionalAction> component4() {
        return this.conditionalActions;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Action getDefaultAction() {
        return this.defaultAction;
    }

    public final ButtonMeta copy(String label, Action action, ButtonType buttonType, List<NudgeConditionalAction> conditionalActions, Action defaultAction) {
        return new ButtonMeta(label, action, buttonType, conditionalActions, defaultAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonMeta)) {
            return false;
        }
        ButtonMeta buttonMeta = (ButtonMeta) other;
        return AbstractC22676k.m65745e(this.label, buttonMeta.label) && AbstractC22676k.m65745e(this.action, buttonMeta.action) && this.buttonType == buttonMeta.buttonType && AbstractC22676k.m65745e(this.conditionalActions, buttonMeta.conditionalActions) && AbstractC22676k.m65745e(this.defaultAction, buttonMeta.defaultAction);
    }

    public final Action getAction() {
        return this.action;
    }

    public final ButtonType getButtonType() {
        return this.buttonType;
    }

    public final List<NudgeConditionalAction> getConditionalActions() {
        return this.conditionalActions;
    }

    public final Action getDefaultAction() {
        return this.defaultAction;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        String str = this.label;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Action action = this.action;
        int iHashCode2 = (iHashCode + (action == null ? 0 : action.hashCode())) * 31;
        ButtonType buttonType = this.buttonType;
        int iHashCode3 = (iHashCode2 + (buttonType == null ? 0 : buttonType.hashCode())) * 31;
        List<NudgeConditionalAction> list = this.conditionalActions;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Action action2 = this.defaultAction;
        return iHashCode4 + (action2 != null ? action2.hashCode() : 0);
    }

    public String toString() {
        return "ButtonMeta(label=" + this.label + ", action=" + this.action + ", buttonType=" + this.buttonType + ", conditionalActions=" + this.conditionalActions + ", defaultAction=" + this.defaultAction + ')';
    }

    @InterfaceC23457c
    public /* synthetic */ ButtonMeta(int i13, String str, Action action, ButtonType buttonType, List list, Action action2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.label = null;
        } else {
            this.label = str;
        }
        if ((i13 & 2) == 0) {
            this.action = null;
        } else {
            this.action = action;
        }
        if ((i13 & 4) == 0) {
            this.buttonType = ButtonType.PRIMARY;
        } else {
            this.buttonType = buttonType;
        }
        if ((i13 & 8) == 0) {
            this.conditionalActions = null;
        } else {
            this.conditionalActions = list;
        }
        if ((i13 & 16) == 0) {
            this.defaultAction = null;
        } else {
            this.defaultAction = action2;
        }
    }

    public ButtonMeta(String str, Action action, ButtonType buttonType, List<NudgeConditionalAction> list, Action action2) {
        this.label = str;
        this.action = action;
        this.buttonType = buttonType;
        this.conditionalActions = list;
        this.defaultAction = action2;
    }

    public /* synthetic */ ButtonMeta(String str, Action action, ButtonType buttonType, List list, Action action2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : action, (i13 & 4) != 0 ? ButtonType.PRIMARY : buttonType, (i13 & 8) != 0 ? null : list, (i13 & 16) != 0 ? null : action2);
    }
}
