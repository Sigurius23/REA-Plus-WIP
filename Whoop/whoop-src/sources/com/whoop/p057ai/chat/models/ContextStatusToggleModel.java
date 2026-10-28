package com.whoop.p057ai.chat.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!JB\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b1\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010!¨\u00067"}, m65681d2 = {"Lcom/whoop/ai/chat/models/ContextStatusToggleModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "currentState", "Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;", "activeState", "inactiveState", "Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;", "errorState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/ai/chat/models/ContextStatusToggleModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;", "component4", "component5", "()Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;)Lcom/whoop/ai/chat/models/ContextStatusToggleModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getCurrentState", "Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;", "getActiveState", "getInactiveState", "Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;", "getErrorState", "Companion", "$serializer", "a", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ContextStatusToggleModel implements DesignSystemModel {
    private final ContextStatusToggleStateModel activeState;
    private final String currentState;
    private final ContextStatusToggleErrorStateModel errorState;
    private final String id;
    private final ContextStatusToggleStateModel inactiveState;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.ai.chat.models.ContextStatusToggleModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/ai/chat/models/ContextStatusToggleModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/ai/chat/models/ContextStatusToggleModel;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ContextStatusToggleModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ContextStatusToggleModel(int i13, String str, String str2, ContextStatusToggleStateModel contextStatusToggleStateModel, ContextStatusToggleStateModel contextStatusToggleStateModel2, ContextStatusToggleErrorStateModel contextStatusToggleErrorStateModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, ContextStatusToggleModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.currentState = str2;
        this.activeState = contextStatusToggleStateModel;
        this.inactiveState = contextStatusToggleStateModel2;
        this.errorState = contextStatusToggleErrorStateModel;
    }

    public static /* synthetic */ ContextStatusToggleModel copy$default(ContextStatusToggleModel contextStatusToggleModel, String str, String str2, ContextStatusToggleStateModel contextStatusToggleStateModel, ContextStatusToggleStateModel contextStatusToggleStateModel2, ContextStatusToggleErrorStateModel contextStatusToggleErrorStateModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = contextStatusToggleModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = contextStatusToggleModel.currentState;
        }
        if ((i13 & 4) != 0) {
            contextStatusToggleStateModel = contextStatusToggleModel.activeState;
        }
        if ((i13 & 8) != 0) {
            contextStatusToggleStateModel2 = contextStatusToggleModel.inactiveState;
        }
        if ((i13 & 16) != 0) {
            contextStatusToggleErrorStateModel = contextStatusToggleModel.errorState;
        }
        ContextStatusToggleErrorStateModel contextStatusToggleErrorStateModel2 = contextStatusToggleErrorStateModel;
        ContextStatusToggleStateModel contextStatusToggleStateModel3 = contextStatusToggleStateModel;
        return contextStatusToggleModel.copy(str, str2, contextStatusToggleStateModel3, contextStatusToggleStateModel2, contextStatusToggleErrorStateModel2);
    }

    public static final /* synthetic */ void write$Self$bot_release(ContextStatusToggleModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.currentState);
        ContextStatusToggleStateModel$$serializer contextStatusToggleStateModel$$serializer = ContextStatusToggleStateModel$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 2, contextStatusToggleStateModel$$serializer, self.activeState);
        output.encodeSerializableElement(serialDesc, 3, contextStatusToggleStateModel$$serializer, self.inactiveState);
        output.encodeSerializableElement(serialDesc, 4, ContextStatusToggleErrorStateModel$$serializer.INSTANCE, self.errorState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrentState() {
        return this.currentState;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ContextStatusToggleStateModel getActiveState() {
        return this.activeState;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ContextStatusToggleStateModel getInactiveState() {
        return this.inactiveState;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ContextStatusToggleErrorStateModel getErrorState() {
        return this.errorState;
    }

    public final ContextStatusToggleModel copy(String id4, String currentState, ContextStatusToggleStateModel activeState, ContextStatusToggleStateModel inactiveState, ContextStatusToggleErrorStateModel errorState) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(currentState, "currentState");
        AbstractC22676k.m65750j(activeState, "activeState");
        AbstractC22676k.m65750j(inactiveState, "inactiveState");
        AbstractC22676k.m65750j(errorState, "errorState");
        return new ContextStatusToggleModel(id4, currentState, activeState, inactiveState, errorState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContextStatusToggleModel)) {
            return false;
        }
        ContextStatusToggleModel contextStatusToggleModel = (ContextStatusToggleModel) other;
        return AbstractC22676k.m65745e(this.id, contextStatusToggleModel.id) && AbstractC22676k.m65745e(this.currentState, contextStatusToggleModel.currentState) && AbstractC22676k.m65745e(this.activeState, contextStatusToggleModel.activeState) && AbstractC22676k.m65745e(this.inactiveState, contextStatusToggleModel.inactiveState) && AbstractC22676k.m65745e(this.errorState, contextStatusToggleModel.errorState);
    }

    public final ContextStatusToggleStateModel getActiveState() {
        return this.activeState;
    }

    public final String getCurrentState() {
        return this.currentState;
    }

    public final ContextStatusToggleErrorStateModel getErrorState() {
        return this.errorState;
    }

    public final String getId() {
        return this.id;
    }

    public final ContextStatusToggleStateModel getInactiveState() {
        return this.inactiveState;
    }

    public int hashCode() {
        return this.errorState.hashCode() + ((this.inactiveState.hashCode() + ((this.activeState.hashCode() + AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.currentState)) * 31)) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.currentState;
        ContextStatusToggleStateModel contextStatusToggleStateModel = this.activeState;
        ContextStatusToggleStateModel contextStatusToggleStateModel2 = this.inactiveState;
        ContextStatusToggleErrorStateModel contextStatusToggleErrorStateModel = this.errorState;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ContextStatusToggleModel(id=", str, ", currentState=", str2, ", activeState=");
        sbM32001t.append(contextStatusToggleStateModel);
        sbM32001t.append(", inactiveState=");
        sbM32001t.append(contextStatusToggleStateModel2);
        sbM32001t.append(", errorState=");
        sbM32001t.append(contextStatusToggleErrorStateModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ContextStatusToggleModel(String id4, String currentState, ContextStatusToggleStateModel activeState, ContextStatusToggleStateModel inactiveState, ContextStatusToggleErrorStateModel errorState) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(currentState, "currentState");
        AbstractC22676k.m65750j(activeState, "activeState");
        AbstractC22676k.m65750j(inactiveState, "inactiveState");
        AbstractC22676k.m65750j(errorState, "errorState");
        this.id = id4;
        this.currentState = currentState;
        this.activeState = activeState;
        this.inactiveState = inactiveState;
        this.errorState = errorState;
    }
}
