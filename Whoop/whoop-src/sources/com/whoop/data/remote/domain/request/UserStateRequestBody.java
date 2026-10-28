package com.whoop.data.remote.domain.request;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlin.C2012k;
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

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006%"}, m65681d2 = {"Lcom/whoop/data/remote/domain/request/UserStateRequestBody;", "", "Lcom/whoop/data/remote/domain/request/UserState;", "state", "<init>", "(Lcom/whoop/data/remote/domain/request/UserState;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/data/remote/domain/request/UserState;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/request/UserStateRequestBody;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/data/remote/domain/request/UserState;", "copy", "(Lcom/whoop/data/remote/domain/request/UserState;)Lcom/whoop/data/remote/domain/request/UserStateRequestBody;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/data/remote/domain/request/UserState;", "getState", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UserStateRequestBody {

    @SerializedName("state")
    private final UserState state;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C2012k(16))};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/request/UserStateRequestBody$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/request/UserStateRequestBody;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return UserStateRequestBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ UserStateRequestBody(int i13, UserState userState, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, UserStateRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.state = userState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return UserState.INSTANCE.serializer();
    }

    public static /* synthetic */ UserStateRequestBody copy$default(UserStateRequestBody userStateRequestBody, UserState userState, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            userState = userStateRequestBody.state;
        }
        return userStateRequestBody.copy(userState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UserState getState() {
        return this.state;
    }

    public final UserStateRequestBody copy(UserState state) {
        AbstractC22676k.m65750j(state, "state");
        return new UserStateRequestBody(state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UserStateRequestBody) && this.state == ((UserStateRequestBody) other).state;
    }

    public final UserState getState() {
        return this.state;
    }

    public int hashCode() {
        return this.state.hashCode();
    }

    public String toString() {
        return "UserStateRequestBody(state=" + this.state + ")";
    }

    public UserStateRequestBody(UserState state) {
        AbstractC22676k.m65750j(state, "state");
        this.state = state;
    }
}
