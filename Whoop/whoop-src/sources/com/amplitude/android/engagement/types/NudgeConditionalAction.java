package com.amplitude.android.engagement.types;

import ad3.C0760d0;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonPrimitive;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB;\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ.\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001c¨\u00063"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/NudgeConditionalAction;", "", "Lcom/amplitude/android/engagement/types/OperatorType;", "operator", "Lkotlinx/serialization/json/JsonPrimitive;", "operand", "Lcom/amplitude/android/engagement/types/Action;", "action", "<init>", "(Lcom/amplitude/android/engagement/types/OperatorType;Lkotlinx/serialization/json/JsonPrimitive;Lcom/amplitude/android/engagement/types/Action;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/amplitude/android/engagement/types/OperatorType;Lkotlinx/serialization/json/JsonPrimitive;Lcom/amplitude/android/engagement/types/Action;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/NudgeConditionalAction;Lzc3/c;Lyc3/g;)V", "component1", "()Lcom/amplitude/android/engagement/types/OperatorType;", "component2", "()Lkotlinx/serialization/json/JsonPrimitive;", "component3", "()Lcom/amplitude/android/engagement/types/Action;", "copy", "(Lcom/amplitude/android/engagement/types/OperatorType;Lkotlinx/serialization/json/JsonPrimitive;Lcom/amplitude/android/engagement/types/Action;)Lcom/amplitude/android/engagement/types/NudgeConditionalAction;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/amplitude/android/engagement/types/OperatorType;", "getOperator", "getOperator$annotations", "()V", "Lkotlinx/serialization/json/JsonPrimitive;", "getOperand", "Lcom/amplitude/android/engagement/types/Action;", "getAction", "Companion", "$serializer", "com/amplitude/android/engagement/types/s0", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class NudgeConditionalAction {
    public static final int $stable = 8;
    private final Action action;
    private final JsonPrimitive operand;
    private final OperatorType operator;
    public static final C4932s0 Companion = new C4932s0();
    private static final InterfaceC37138c[] $childSerializers = {OperatorType.Companion.serializer(), null, Action.Companion.serializer()};

    @InterfaceC23457c
    public /* synthetic */ NudgeConditionalAction(int i13, @InterfaceC37143h("operator") OperatorType operatorType, JsonPrimitive jsonPrimitive, Action action, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, NudgeConditionalAction$$serializer.INSTANCE.getDescriptor());
        }
        this.operator = operatorType;
        this.operand = jsonPrimitive;
        this.action = action;
    }

    public static /* synthetic */ NudgeConditionalAction copy$default(NudgeConditionalAction nudgeConditionalAction, OperatorType operatorType, JsonPrimitive jsonPrimitive, Action action, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            operatorType = nudgeConditionalAction.operator;
        }
        if ((i13 & 2) != 0) {
            jsonPrimitive = nudgeConditionalAction.operand;
        }
        if ((i13 & 4) != 0) {
            action = nudgeConditionalAction.action;
        }
        return nudgeConditionalAction.copy(operatorType, jsonPrimitive, action);
    }

    @InterfaceC37143h("operator")
    public static /* synthetic */ void getOperator$annotations() {
    }

    public static final /* synthetic */ void write$Self(NudgeConditionalAction self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, interfaceC37138cArr[0], self.operator);
        output.encodeSerializableElement(serialDesc, 1, C0760d0.f2766a, self.operand);
        output.encodeSerializableElement(serialDesc, 2, interfaceC37138cArr[2], self.action);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OperatorType getOperator() {
        return this.operator;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JsonPrimitive getOperand() {
        return this.operand;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    public final NudgeConditionalAction copy(OperatorType operator, JsonPrimitive operand, Action action) {
        AbstractC22676k.m65750j(operator, "operator");
        AbstractC22676k.m65750j(operand, "operand");
        AbstractC22676k.m65750j(action, "action");
        return new NudgeConditionalAction(operator, operand, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NudgeConditionalAction)) {
            return false;
        }
        NudgeConditionalAction nudgeConditionalAction = (NudgeConditionalAction) other;
        return this.operator == nudgeConditionalAction.operator && AbstractC22676k.m65745e(this.operand, nudgeConditionalAction.operand) && AbstractC22676k.m65745e(this.action, nudgeConditionalAction.action);
    }

    public final Action getAction() {
        return this.action;
    }

    public final JsonPrimitive getOperand() {
        return this.operand;
    }

    public final OperatorType getOperator() {
        return this.operator;
    }

    public int hashCode() {
        return this.action.hashCode() + ((this.operand.hashCode() + (this.operator.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "NudgeConditionalAction(operator=" + this.operator + ", operand=" + this.operand + ", action=" + this.action + ')';
    }

    public NudgeConditionalAction(OperatorType operator, JsonPrimitive operand, Action action) {
        AbstractC22676k.m65750j(operator, "operator");
        AbstractC22676k.m65750j(operand, "operand");
        AbstractC22676k.m65750j(action, "action");
        this.operator = operator;
        this.operand = operand;
        this.action = action;
    }
}
