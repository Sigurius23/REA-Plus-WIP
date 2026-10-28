package com.whoop.whoopaction.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.weeklyplan.customizeplan.domain.api.C10717a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
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
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001a¨\u0006+"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/LoadingTreatment;", "", "", "", "messages", "", "messageCycleIntervalSeconds", "<init>", "(Ljava/util/List;F)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;FLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whoop_action_release", "(Lcom/whoop/whoopaction/domain/models/LoadingTreatment;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()F", "copy", "(Ljava/util/List;F)Lcom/whoop/whoopaction/domain/models/LoadingTreatment;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getMessages", "F", "getMessageCycleIntervalSeconds", "Companion", "$serializer", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LoadingTreatment {
    private final float messageCycleIntervalSeconds;
    private final List<String> messages;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C10717a(15)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/LoadingTreatment$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whoopaction/domain/models/LoadingTreatment;", "serializer", "()Lwc3/c;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LoadingTreatment$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LoadingTreatment(int i13, List list, float f13, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, LoadingTreatment$$serializer.INSTANCE.getDescriptor());
        }
        this.messages = list;
        this.messageCycleIntervalSeconds = f13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LoadingTreatment copy$default(LoadingTreatment loadingTreatment, List list, float f13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = loadingTreatment.messages;
        }
        if ((i13 & 2) != 0) {
            f13 = loadingTreatment.messageCycleIntervalSeconds;
        }
        return loadingTreatment.copy(list, f13);
    }

    public static final /* synthetic */ void write$Self$whoop_action_release(LoadingTreatment self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.messages);
        output.encodeFloatElement(serialDesc, 1, self.messageCycleIntervalSeconds);
    }

    public final List<String> component1() {
        return this.messages;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getMessageCycleIntervalSeconds() {
        return this.messageCycleIntervalSeconds;
    }

    public final LoadingTreatment copy(List<String> messages, float messageCycleIntervalSeconds) {
        AbstractC22676k.m65750j(messages, "messages");
        return new LoadingTreatment(messages, messageCycleIntervalSeconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadingTreatment)) {
            return false;
        }
        LoadingTreatment loadingTreatment = (LoadingTreatment) other;
        return AbstractC22676k.m65745e(this.messages, loadingTreatment.messages) && Float.compare(this.messageCycleIntervalSeconds, loadingTreatment.messageCycleIntervalSeconds) == 0;
    }

    public final float getMessageCycleIntervalSeconds() {
        return this.messageCycleIntervalSeconds;
    }

    public final List<String> getMessages() {
        return this.messages;
    }

    public int hashCode() {
        return Float.hashCode(this.messageCycleIntervalSeconds) + (this.messages.hashCode() * 31);
    }

    public String toString() {
        return "LoadingTreatment(messages=" + this.messages + ", messageCycleIntervalSeconds=" + this.messageCycleIntervalSeconds + ")";
    }

    public LoadingTreatment(List<String> messages, float f13) {
        AbstractC22676k.m65750j(messages, "messages");
        this.messages = messages;
        this.messageCycleIntervalSeconds = f13;
    }
}
