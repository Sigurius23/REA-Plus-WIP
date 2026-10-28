package com.whoop.user.journey.model;

import al0.C0974i;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001a¨\u0006,"}, m65681d2 = {"Lcom/whoop/user/journey/model/UserJourneyContentModelV2;", "", "Lcom/whoop/user/journey/model/LandingContent;", "landing", "", "Lcom/whoop/user/journey/model/UserJourneySection;", "sections", "<init>", "(Lcom/whoop/user/journey/model/LandingContent;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/user/journey/model/LandingContent;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$user_journey_release", "(Lcom/whoop/user/journey/model/UserJourneyContentModelV2;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/user/journey/model/LandingContent;", "component2", "()Ljava/util/List;", "copy", "(Lcom/whoop/user/journey/model/LandingContent;Ljava/util/List;)Lcom/whoop/user/journey/model/UserJourneyContentModelV2;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/user/journey/model/LandingContent;", "getLanding", "Ljava/util/List;", "getSections", "Companion", "$serializer", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UserJourneyContentModelV2 {
    private final LandingContent landing;
    private final List<UserJourneySection> sections;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C0974i(25))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/user/journey/model/UserJourneyContentModelV2$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/user/journey/model/UserJourneyContentModelV2;", "serializer", "()Lwc3/c;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return UserJourneyContentModelV2$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ UserJourneyContentModelV2(int i13, LandingContent landingContent, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, UserJourneyContentModelV2$$serializer.INSTANCE.getDescriptor());
        }
        this.landing = landingContent;
        this.sections = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(UserJourneySection$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserJourneyContentModelV2 copy$default(UserJourneyContentModelV2 userJourneyContentModelV2, LandingContent landingContent, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            landingContent = userJourneyContentModelV2.landing;
        }
        if ((i13 & 2) != 0) {
            list = userJourneyContentModelV2.sections;
        }
        return userJourneyContentModelV2.copy(landingContent, list);
    }

    public static final /* synthetic */ void write$Self$user_journey_release(UserJourneyContentModelV2 self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, LandingContent$$serializer.INSTANCE, self.landing);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.sections);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LandingContent getLanding() {
        return this.landing;
    }

    public final List<UserJourneySection> component2() {
        return this.sections;
    }

    public final UserJourneyContentModelV2 copy(LandingContent landing, List<UserJourneySection> sections) {
        AbstractC22676k.m65750j(landing, "landing");
        AbstractC22676k.m65750j(sections, "sections");
        return new UserJourneyContentModelV2(landing, sections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserJourneyContentModelV2)) {
            return false;
        }
        UserJourneyContentModelV2 userJourneyContentModelV2 = (UserJourneyContentModelV2) other;
        return AbstractC22676k.m65745e(this.landing, userJourneyContentModelV2.landing) && AbstractC22676k.m65745e(this.sections, userJourneyContentModelV2.sections);
    }

    public final LandingContent getLanding() {
        return this.landing;
    }

    public final List<UserJourneySection> getSections() {
        return this.sections;
    }

    public int hashCode() {
        return this.sections.hashCode() + (this.landing.hashCode() * 31);
    }

    public String toString() {
        return "UserJourneyContentModelV2(landing=" + this.landing + ", sections=" + this.sections + ")";
    }

    public UserJourneyContentModelV2(LandingContent landing, List<UserJourneySection> sections) {
        AbstractC22676k.m65750j(landing, "landing");
        AbstractC22676k.m65750j(sections, "sections");
        this.landing = landing;
        this.sections = sections;
    }
}
