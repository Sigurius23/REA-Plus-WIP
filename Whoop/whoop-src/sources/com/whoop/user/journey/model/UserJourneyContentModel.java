package com.whoop.user.journey.model;

import al0.C0974i;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B#\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001a¨\u0006,"}, m65681d2 = {"Lcom/whoop/user/journey/model/UserJourneyContentModel;", "", "", "Lcom/whoop/user/journey/model/UserJourneyStep;", "steps", "Lcom/whoop/user/journey/model/HeaderContentModel;", "header", "<init>", "(Ljava/util/List;Lcom/whoop/user/journey/model/HeaderContentModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/whoop/user/journey/model/HeaderContentModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$user_journey_release", "(Lcom/whoop/user/journey/model/UserJourneyContentModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lcom/whoop/user/journey/model/HeaderContentModel;", "copy", "(Ljava/util/List;Lcom/whoop/user/journey/model/HeaderContentModel;)Lcom/whoop/user/journey/model/UserJourneyContentModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSteps", "Lcom/whoop/user/journey/model/HeaderContentModel;", "getHeader", "Companion", "$serializer", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UserJourneyContentModel {
    private final HeaderContentModel header;
    private final List<UserJourneyStep> steps;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C0974i(24)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/user/journey/model/UserJourneyContentModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/user/journey/model/UserJourneyContentModel;", "serializer", "()Lwc3/c;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return UserJourneyContentModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserJourneyContentModel() {
        this((List) null, (HeaderContentModel) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(UserJourneyStep.class), new C37140e(c22673i0.getOrCreateKotlinClass(UserJourneyStep.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserJourneyContentModel copy$default(UserJourneyContentModel userJourneyContentModel, List list, HeaderContentModel headerContentModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = userJourneyContentModel.steps;
        }
        if ((i13 & 2) != 0) {
            headerContentModel = userJourneyContentModel.header;
        }
        return userJourneyContentModel.copy(list, headerContentModel);
    }

    public static final /* synthetic */ void write$Self$user_journey_release(UserJourneyContentModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.steps, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.steps);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.header == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, HeaderContentModel$$serializer.INSTANCE, self.header);
    }

    public final List<UserJourneyStep> component1() {
        return this.steps;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HeaderContentModel getHeader() {
        return this.header;
    }

    public final UserJourneyContentModel copy(List<? extends UserJourneyStep> steps, HeaderContentModel header) {
        AbstractC22676k.m65750j(steps, "steps");
        return new UserJourneyContentModel(steps, header);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserJourneyContentModel)) {
            return false;
        }
        UserJourneyContentModel userJourneyContentModel = (UserJourneyContentModel) other;
        return AbstractC22676k.m65745e(this.steps, userJourneyContentModel.steps) && AbstractC22676k.m65745e(this.header, userJourneyContentModel.header);
    }

    public final HeaderContentModel getHeader() {
        return this.header;
    }

    public final List<UserJourneyStep> getSteps() {
        return this.steps;
    }

    public int hashCode() {
        int iHashCode = this.steps.hashCode() * 31;
        HeaderContentModel headerContentModel = this.header;
        return iHashCode + (headerContentModel == null ? 0 : headerContentModel.hashCode());
    }

    public String toString() {
        return "UserJourneyContentModel(steps=" + this.steps + ", header=" + this.header + ")";
    }

    public /* synthetic */ UserJourneyContentModel(int i13, List list, HeaderContentModel headerContentModel, SerializationConstructorMarker serializationConstructorMarker) {
        this.steps = (i13 & 1) == 0 ? C25271y.f99162w : list;
        if ((i13 & 2) == 0) {
            this.header = null;
        } else {
            this.header = headerContentModel;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserJourneyContentModel(List<? extends UserJourneyStep> steps, HeaderContentModel headerContentModel) {
        AbstractC22676k.m65750j(steps, "steps");
        this.steps = steps;
        this.header = headerContentModel;
    }

    public /* synthetic */ UserJourneyContentModel(List list, HeaderContentModel headerContentModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list, (i13 & 2) != 0 ? null : headerContentModel);
    }
}
