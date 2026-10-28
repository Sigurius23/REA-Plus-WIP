package com.whoop.whoopaction.domain.models;

import com.whoop.activation.domain.models.ActivationFlowSignupBodyKt;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.weeklyplan.customizeplan.domain.api.C10717a;
import java.util.Map;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25272z;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import uw2.C35316a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\r\u0010\u000eBc\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u0004*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010 J\u0012\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u001c\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\nHÆ\u0003¢\u0006\u0004\b(\u0010)J`\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\nHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b7\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b8\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010'R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010)¨\u0006?"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/AuthAction;", "Lcom/whoop/whoopaction/domain/models/Action;", "Lcom/whoop/whoopaction/domain/models/AuthOperation;", "operation", "", "username", "password", "mfaCode", "Lcom/whoop/navigation/models/GenericInteraction;", "onSuccess", "", "Lcom/whoop/whoopaction/domain/models/ActionErrorCode;", "onError", "<init>", "(Lcom/whoop/whoopaction/domain/models/AuthOperation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/whoopaction/domain/models/AuthOperation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "redacted", "(Ljava/lang/String;)Ljava/lang/String;", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whoop_action_release", "(Lcom/whoop/whoopaction/domain/models/AuthAction;Lzc3/c;Lyc3/g;)V", "write$Self", "toString", "()Ljava/lang/String;", "component1", "()Lcom/whoop/whoopaction/domain/models/AuthOperation;", "component2", "component3", "component4", "component5", "()Lcom/whoop/navigation/models/GenericInteraction;", "component6", "()Ljava/util/Map;", "copy", "(Lcom/whoop/whoopaction/domain/models/AuthOperation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;)Lcom/whoop/whoopaction/domain/models/AuthAction;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/whoopaction/domain/models/AuthOperation;", "getOperation", "Ljava/lang/String;", "getUsername", "getPassword", "getMfaCode", "Lcom/whoop/navigation/models/GenericInteraction;", "getOnSuccess", "Ljava/util/Map;", "getOnError", "Companion", "$serializer", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AuthAction implements Action {
    private static final InterfaceC23462h[] $childSerializers;
    private final String mfaCode;
    private final Map<ActionErrorCode, GenericInteraction> onError;
    private final GenericInteraction onSuccess;
    private final AuthOperation operation;
    private final String password;
    private final String username;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whoopaction/domain/models/AuthAction$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whoopaction/domain/models/AuthAction;", "serializer", "()Lwc3/c;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AuthAction$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C10717a(10)), null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C10717a(11))};
    }

    public AuthAction() {
        this((AuthOperation) null, (String) null, (String) null, (String) null, (GenericInteraction) null, (Map) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return AuthOperation.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new LinkedHashMapSerializer(C35316a.f150501a, GenericInteraction$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthAction copy$default(AuthAction authAction, AuthOperation authOperation, String str, String str2, String str3, GenericInteraction genericInteraction, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            authOperation = authAction.operation;
        }
        if ((i13 & 2) != 0) {
            str = authAction.username;
        }
        if ((i13 & 4) != 0) {
            str2 = authAction.password;
        }
        if ((i13 & 8) != 0) {
            str3 = authAction.mfaCode;
        }
        if ((i13 & 16) != 0) {
            genericInteraction = authAction.onSuccess;
        }
        if ((i13 & 32) != 0) {
            map = authAction.onError;
        }
        GenericInteraction genericInteraction2 = genericInteraction;
        Map map2 = map;
        return authAction.copy(authOperation, str, str2, str3, genericInteraction2, map2);
    }

    private final String redacted(String str) {
        return str == null ? "null" : ActivationFlowSignupBodyKt.REDACTED;
    }

    public static final /* synthetic */ void write$Self$whoop_action_release(AuthAction self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.operation != AuthOperation.UNKNOWN) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.operation);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.username != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.username);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.password != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.password);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.mfaCode != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.mfaCode);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.onSuccess != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, GenericInteraction$$serializer.INSTANCE, self.onSuccess);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && AbstractC22676k.m65745e(self.onError, C25272z.f99163w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.onError);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AuthOperation getOperation() {
        return this.operation;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMfaCode() {
        return this.mfaCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final GenericInteraction getOnSuccess() {
        return this.onSuccess;
    }

    public final Map<ActionErrorCode, GenericInteraction> component6() {
        return this.onError;
    }

    public final AuthAction copy(AuthOperation operation, String username, String password, String mfaCode, GenericInteraction onSuccess, Map<ActionErrorCode, GenericInteraction> onError) {
        AbstractC22676k.m65750j(operation, "operation");
        AbstractC22676k.m65750j(onError, "onError");
        return new AuthAction(operation, username, password, mfaCode, onSuccess, onError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthAction)) {
            return false;
        }
        AuthAction authAction = (AuthAction) other;
        return this.operation == authAction.operation && AbstractC22676k.m65745e(this.username, authAction.username) && AbstractC22676k.m65745e(this.password, authAction.password) && AbstractC22676k.m65745e(this.mfaCode, authAction.mfaCode) && AbstractC22676k.m65745e(this.onSuccess, authAction.onSuccess) && AbstractC22676k.m65745e(this.onError, authAction.onError);
    }

    public final String getMfaCode() {
        return this.mfaCode;
    }

    public final Map<ActionErrorCode, GenericInteraction> getOnError() {
        return this.onError;
    }

    public final GenericInteraction getOnSuccess() {
        return this.onSuccess;
    }

    public final AuthOperation getOperation() {
        return this.operation;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int iHashCode = this.operation.hashCode() * 31;
        String str = this.username;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.password;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mfaCode;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        GenericInteraction genericInteraction = this.onSuccess;
        return this.onError.hashCode() + ((iHashCode4 + (genericInteraction != null ? genericInteraction.hashCode() : 0)) * 31);
    }

    public String toString() {
        AuthOperation authOperation = this.operation;
        String strRedacted = redacted(this.username);
        String strRedacted2 = redacted(this.password);
        String strRedacted3 = redacted(this.mfaCode);
        GenericInteraction genericInteraction = this.onSuccess;
        Map<ActionErrorCode, GenericInteraction> map = this.onError;
        StringBuilder sb4 = new StringBuilder("AuthAction(operation=");
        sb4.append(authOperation);
        sb4.append(", username=");
        sb4.append(strRedacted);
        sb4.append(", password=");
        AbstractC11266d.m30444B(sb4, strRedacted2, ", mfaCode=", strRedacted3, ", onSuccess=");
        sb4.append(genericInteraction);
        sb4.append(", onError=");
        sb4.append(map);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ AuthAction(int i13, AuthOperation authOperation, String str, String str2, String str3, GenericInteraction genericInteraction, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        this.operation = (i13 & 1) == 0 ? AuthOperation.UNKNOWN : authOperation;
        if ((i13 & 2) == 0) {
            this.username = null;
        } else {
            this.username = str;
        }
        if ((i13 & 4) == 0) {
            this.password = null;
        } else {
            this.password = str2;
        }
        if ((i13 & 8) == 0) {
            this.mfaCode = null;
        } else {
            this.mfaCode = str3;
        }
        if ((i13 & 16) == 0) {
            this.onSuccess = null;
        } else {
            this.onSuccess = genericInteraction;
        }
        if ((i13 & 32) == 0) {
            this.onError = C25272z.f99163w;
        } else {
            this.onError = map;
        }
    }

    public AuthAction(AuthOperation operation, String str, String str2, String str3, GenericInteraction genericInteraction, Map<ActionErrorCode, GenericInteraction> onError) {
        AbstractC22676k.m65750j(operation, "operation");
        AbstractC22676k.m65750j(onError, "onError");
        this.operation = operation;
        this.username = str;
        this.password = str2;
        this.mfaCode = str3;
        this.onSuccess = genericInteraction;
        this.onError = onError;
    }

    public /* synthetic */ AuthAction(AuthOperation authOperation, String str, String str2, String str3, GenericInteraction genericInteraction, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AuthOperation.UNKNOWN : authOperation, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : genericInteraction, (i13 & 32) != 0 ? C25272z.f99163w : map);
    }
}
