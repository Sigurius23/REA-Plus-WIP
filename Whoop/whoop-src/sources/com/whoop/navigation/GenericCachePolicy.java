package com.whoop.navigation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import j00.C21118u;
import java.util.Set;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25235a0;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tB=\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ6\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001d¨\u0006/"}, m65681d2 = {"Lcom/whoop/navigation/GenericCachePolicy;", "", "", "enabled", "", "cacheKey", "", "scopes", "<init>", "(ZLjava/lang/String;Ljava/util/Set;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/String;Ljava/util/Set;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/GenericCachePolicy;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/Set;", "copy", "(ZLjava/lang/String;Ljava/util/Set;)Lcom/whoop/navigation/GenericCachePolicy;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getEnabled", "Ljava/lang/String;", "getCacheKey", "Ljava/util/Set;", "getScopes", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GenericCachePolicy {
    private final String cacheKey;
    private final boolean enabled;
    private final Set<String> scopes;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C21118u(20))};

    /* JADX INFO: renamed from: com.whoop.navigation.GenericCachePolicy$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/GenericCachePolicy$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/GenericCachePolicy;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GenericCachePolicy$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public GenericCachePolicy() {
        this(false, (String) null, (Set) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new LinkedHashSetSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GenericCachePolicy copy$default(GenericCachePolicy genericCachePolicy, boolean z4, String str, Set set, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = genericCachePolicy.enabled;
        }
        if ((i13 & 2) != 0) {
            str = genericCachePolicy.cacheKey;
        }
        if ((i13 & 4) != 0) {
            set = genericCachePolicy.scopes;
        }
        return genericCachePolicy.copy(z4, str, set);
    }

    public static final /* synthetic */ void write$Self$navigation_release(GenericCachePolicy self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !self.enabled) {
            output.encodeBooleanElement(serialDesc, 0, self.enabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.cacheKey != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.cacheKey);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && AbstractC22676k.m65745e(self.scopes, C25235a0.f99113w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.scopes);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCacheKey() {
        return this.cacheKey;
    }

    public final Set<String> component3() {
        return this.scopes;
    }

    public final GenericCachePolicy copy(boolean enabled, String cacheKey, Set<String> scopes) {
        AbstractC22676k.m65750j(scopes, "scopes");
        return new GenericCachePolicy(enabled, cacheKey, scopes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenericCachePolicy)) {
            return false;
        }
        GenericCachePolicy genericCachePolicy = (GenericCachePolicy) other;
        return this.enabled == genericCachePolicy.enabled && AbstractC22676k.m65745e(this.cacheKey, genericCachePolicy.cacheKey) && AbstractC22676k.m65745e(this.scopes, genericCachePolicy.scopes);
    }

    public final String getCacheKey() {
        return this.cacheKey;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final Set<String> getScopes() {
        return this.scopes;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.enabled) * 31;
        String str = this.cacheKey;
        return this.scopes.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        boolean z4 = this.enabled;
        String str = this.cacheKey;
        Set<String> set = this.scopes;
        StringBuilder sbM38567n = AbstractC13673n.m38567n("GenericCachePolicy(enabled=", ", cacheKey=", str, ", scopes=", z4);
        sbM38567n.append(set);
        sbM38567n.append(")");
        return sbM38567n.toString();
    }

    public /* synthetic */ GenericCachePolicy(int i13, boolean z4, String str, Set set, SerializationConstructorMarker serializationConstructorMarker) {
        this.enabled = (i13 & 1) == 0 ? true : z4;
        if ((i13 & 2) == 0) {
            this.cacheKey = null;
        } else {
            this.cacheKey = str;
        }
        if ((i13 & 4) == 0) {
            this.scopes = C25235a0.f99113w;
        } else {
            this.scopes = set;
        }
    }

    public GenericCachePolicy(boolean z4, String str, Set<String> scopes) {
        AbstractC22676k.m65750j(scopes, "scopes");
        this.enabled = z4;
        this.cacheKey = str;
        this.scopes = scopes;
    }

    public /* synthetic */ GenericCachePolicy(boolean z4, String str, Set set, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? true : z4, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? C25235a0.f99113w : set);
    }
}
