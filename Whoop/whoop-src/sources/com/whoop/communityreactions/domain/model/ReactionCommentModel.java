package com.whoop.communityreactions.domain.model;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ej1.C13228a;
import es0.EnumC13588a;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;<BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010&JZ\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b3\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b4\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b5\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010&¨\u0006="}, m65681d2 = {"Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "avatar", "name", "badge", "text", "Les0/a;", "renderStyle", "Lcom/whoop/navigation/models/GenericInteraction;", "longPressAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Les0/a;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Les0/a;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$community_reactions_arch_mini_release", "(Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;Lzc3/c;Lyc3/g;)V", "write$Self", "toString", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "()Les0/a;", "component7", "()Lcom/whoop/navigation/models/GenericInteraction;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Les0/a;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getAvatar", "getName", "getBadge", "getText", "Les0/a;", "getRenderStyle", "Lcom/whoop/navigation/models/GenericInteraction;", "getLongPressAction", "Companion", "$serializer", "a", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ReactionCommentModel implements DesignSystemModel {
    private final String avatar;
    private final String badge;
    private final String id;
    private final GenericInteraction longPressAction;
    private final String name;
    private final EnumC13588a renderStyle;
    private final String text;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericInteraction.$stable;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C13228a(21)), null};

    /* JADX INFO: renamed from: com.whoop.communityreactions.domain.model.ReactionCommentModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/communityreactions/domain/model/ReactionCommentModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/communityreactions/domain/model/ReactionCommentModel;", "serializer", "()Lwc3/c;", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ReactionCommentModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ReactionCommentModel(int i13, String str, String str2, String str3, String str4, String str5, EnumC13588a enumC13588a, GenericInteraction genericInteraction, SerializationConstructorMarker serializationConstructorMarker) {
        if (95 != (i13 & 95)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 95, ReactionCommentModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.avatar = str2;
        this.name = str3;
        this.badge = str4;
        this.text = str5;
        if ((i13 & 32) == 0) {
            this.renderStyle = EnumC13588a.TEXT;
        } else {
            this.renderStyle = enumC13588a;
        }
        this.longPressAction = genericInteraction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.communityreactions.domain.model.ReactionRenderStyle", EnumC13588a.values());
    }

    public static /* synthetic */ ReactionCommentModel copy$default(ReactionCommentModel reactionCommentModel, String str, String str2, String str3, String str4, String str5, EnumC13588a enumC13588a, GenericInteraction genericInteraction, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = reactionCommentModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = reactionCommentModel.avatar;
        }
        if ((i13 & 4) != 0) {
            str3 = reactionCommentModel.name;
        }
        if ((i13 & 8) != 0) {
            str4 = reactionCommentModel.badge;
        }
        if ((i13 & 16) != 0) {
            str5 = reactionCommentModel.text;
        }
        if ((i13 & 32) != 0) {
            enumC13588a = reactionCommentModel.renderStyle;
        }
        if ((i13 & 64) != 0) {
            genericInteraction = reactionCommentModel.longPressAction;
        }
        EnumC13588a enumC13588a2 = enumC13588a;
        GenericInteraction genericInteraction2 = genericInteraction;
        String str6 = str5;
        String str7 = str3;
        return reactionCommentModel.copy(str, str2, str7, str4, str6, enumC13588a2, genericInteraction2);
    }

    public static final /* synthetic */ void write$Self$community_reactions_arch_mini_release(ReactionCommentModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.avatar);
        output.encodeStringElement(serialDesc, 2, self.name);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.badge);
        output.encodeStringElement(serialDesc, 4, self.text);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.renderStyle != EnumC13588a.TEXT) {
            output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.renderStyle);
        }
        output.encodeNullableSerializableElement(serialDesc, 6, GenericInteraction$$serializer.INSTANCE, self.longPressAction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBadge() {
        return this.badge;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final EnumC13588a getRenderStyle() {
        return this.renderStyle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final GenericInteraction getLongPressAction() {
        return this.longPressAction;
    }

    public final ReactionCommentModel copy(String id4, String avatar, String name, String badge, String text, EnumC13588a renderStyle, GenericInteraction longPressAction) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(avatar, "avatar");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(renderStyle, "renderStyle");
        return new ReactionCommentModel(id4, avatar, name, badge, text, renderStyle, longPressAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReactionCommentModel)) {
            return false;
        }
        ReactionCommentModel reactionCommentModel = (ReactionCommentModel) other;
        return AbstractC22676k.m65745e(this.id, reactionCommentModel.id) && AbstractC22676k.m65745e(this.avatar, reactionCommentModel.avatar) && AbstractC22676k.m65745e(this.name, reactionCommentModel.name) && AbstractC22676k.m65745e(this.badge, reactionCommentModel.badge) && AbstractC22676k.m65745e(this.text, reactionCommentModel.text) && this.renderStyle == reactionCommentModel.renderStyle && AbstractC22676k.m65745e(this.longPressAction, reactionCommentModel.longPressAction);
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getBadge() {
        return this.badge;
    }

    public final String getId() {
        return this.id;
    }

    public final GenericInteraction getLongPressAction() {
        return this.longPressAction;
    }

    public final String getName() {
        return this.name;
    }

    public final EnumC13588a getRenderStyle() {
        return this.renderStyle;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.avatar), 31, this.name);
        String str = this.badge;
        int iHashCode = (this.renderStyle.hashCode() + AbstractC11266d.m30450d((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.text)) * 31;
        GenericInteraction genericInteraction = this.longPressAction;
        return iHashCode + (genericInteraction != null ? genericInteraction.hashCode() : 0);
    }

    public String toString() {
        return "ReactionCommentModel(id=" + this.id + ", renderStyle=" + this.renderStyle + ")";
    }

    public ReactionCommentModel(String id4, String avatar, String name, String str, String text, EnumC13588a renderStyle, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(avatar, "avatar");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(renderStyle, "renderStyle");
        this.id = id4;
        this.avatar = avatar;
        this.name = name;
        this.badge = str;
        this.text = text;
        this.renderStyle = renderStyle;
        this.longPressAction = genericInteraction;
    }

    public /* synthetic */ ReactionCommentModel(String str, String str2, String str3, String str4, String str5, EnumC13588a enumC13588a, GenericInteraction genericInteraction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i13 & 32) != 0 ? EnumC13588a.TEXT : enumC13588a, genericInteraction);
    }
}
