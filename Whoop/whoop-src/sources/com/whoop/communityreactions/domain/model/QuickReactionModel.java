package com.whoop.communityreactions.domain.model;

import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, m65681d2 = {"Lcom/whoop/communityreactions/domain/model/QuickReactionModel;", "", "", "emoji", "Lcom/whoop/navigation/models/GenericInteraction;", "action", "<init>", "(Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$community_reactions_arch_mini_release", "(Lcom/whoop/communityreactions/domain/model/QuickReactionModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/navigation/models/GenericInteraction;", "copy", "(Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/communityreactions/domain/model/QuickReactionModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEmoji", "Lcom/whoop/navigation/models/GenericInteraction;", "getAction", "Companion", "$serializer", "a", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class QuickReactionModel {
    private final GenericInteraction action;
    private final String emoji;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericInteraction.$stable;

    /* JADX INFO: renamed from: com.whoop.communityreactions.domain.model.QuickReactionModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/communityreactions/domain/model/QuickReactionModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/communityreactions/domain/model/QuickReactionModel;", "serializer", "()Lwc3/c;", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return QuickReactionModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ QuickReactionModel(int i13, String str, GenericInteraction genericInteraction, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, QuickReactionModel$$serializer.INSTANCE.getDescriptor());
        }
        this.emoji = str;
        this.action = genericInteraction;
    }

    public static /* synthetic */ QuickReactionModel copy$default(QuickReactionModel quickReactionModel, String str, GenericInteraction genericInteraction, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = quickReactionModel.emoji;
        }
        if ((i13 & 2) != 0) {
            genericInteraction = quickReactionModel.action;
        }
        return quickReactionModel.copy(str, genericInteraction);
    }

    public static final /* synthetic */ void write$Self$community_reactions_arch_mini_release(QuickReactionModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.emoji);
        output.encodeSerializableElement(serialDesc, 1, GenericInteraction$$serializer.INSTANCE, self.action);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEmoji() {
        return this.emoji;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final GenericInteraction getAction() {
        return this.action;
    }

    public final QuickReactionModel copy(String emoji, GenericInteraction action) {
        AbstractC22676k.m65750j(emoji, "emoji");
        AbstractC22676k.m65750j(action, "action");
        return new QuickReactionModel(emoji, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuickReactionModel)) {
            return false;
        }
        QuickReactionModel quickReactionModel = (QuickReactionModel) other;
        return AbstractC22676k.m65745e(this.emoji, quickReactionModel.emoji) && AbstractC22676k.m65745e(this.action, quickReactionModel.action);
    }

    public final GenericInteraction getAction() {
        return this.action;
    }

    public final String getEmoji() {
        return this.emoji;
    }

    public int hashCode() {
        return this.action.hashCode() + (this.emoji.hashCode() * 31);
    }

    public String toString() {
        return "QuickReactionModel(emoji=" + this.emoji + ", action=" + this.action + ")";
    }

    public QuickReactionModel(String emoji, GenericInteraction action) {
        AbstractC22676k.m65750j(emoji, "emoji");
        AbstractC22676k.m65750j(action, "action");
        this.emoji = emoji;
        this.action = action;
    }
}
