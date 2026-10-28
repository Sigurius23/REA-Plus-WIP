package com.whoop.trends.data.model;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.EnumC28166h0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import wi0.C37312d;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u0019¨\u0006,"}, m65681d2 = {"Lcom/whoop/trends/data/model/NavigationItemV3;", "", "Lor2/h0;", "graphKey", "", "name", "<init>", "(Lor2/h0;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILor2/h0;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$trends_release", "(Lcom/whoop/trends/data/model/NavigationItemV3;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lor2/h0;", "component2", "()Ljava/lang/String;", "copy", "(Lor2/h0;Ljava/lang/String;)Lcom/whoop/trends/data/model/NavigationItemV3;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lor2/h0;", "getGraphKey", "getGraphKey$annotations", "()V", "Ljava/lang/String;", "getName", "getName$annotations", "Companion", "$serializer", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class NavigationItemV3 {
    public static final int $stable = 0;

    @SerializedName("graph_key")
    private final EnumC28166h0 graphKey;

    @SerializedName("name_display")
    private final String name;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C37312d(27)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/trends/data/model/NavigationItemV3$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/trends/data/model/NavigationItemV3;", "serializer", "()Lwc3/c;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return NavigationItemV3$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ NavigationItemV3(int i13, EnumC28166h0 enumC28166h0, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, NavigationItemV3$$serializer.INSTANCE.getDescriptor());
        }
        this.graphKey = enumC28166h0;
        this.name = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.util.GraphKey", EnumC28166h0.values());
    }

    public static /* synthetic */ NavigationItemV3 copy$default(NavigationItemV3 navigationItemV3, EnumC28166h0 enumC28166h0, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC28166h0 = navigationItemV3.graphKey;
        }
        if ((i13 & 2) != 0) {
            str = navigationItemV3.name;
        }
        return navigationItemV3.copy(enumC28166h0, str);
    }

    @InterfaceC37143h("graph_key")
    public static /* synthetic */ void getGraphKey$annotations() {
    }

    @InterfaceC37143h("name_display")
    public static /* synthetic */ void getName$annotations() {
    }

    public static final /* synthetic */ void write$Self$trends_release(NavigationItemV3 self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.graphKey);
        output.encodeStringElement(serialDesc, 1, self.name);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EnumC28166h0 getGraphKey() {
        return this.graphKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final NavigationItemV3 copy(EnumC28166h0 graphKey, String name) {
        AbstractC22676k.m65750j(graphKey, "graphKey");
        AbstractC22676k.m65750j(name, "name");
        return new NavigationItemV3(graphKey, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationItemV3)) {
            return false;
        }
        NavigationItemV3 navigationItemV3 = (NavigationItemV3) other;
        return this.graphKey == navigationItemV3.graphKey && AbstractC22676k.m65745e(this.name, navigationItemV3.name);
    }

    public final EnumC28166h0 getGraphKey() {
        return this.graphKey;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() + (this.graphKey.hashCode() * 31);
    }

    public String toString() {
        return "NavigationItemV3(graphKey=" + this.graphKey + ", name=" + this.name + ")";
    }

    public NavigationItemV3(EnumC28166h0 graphKey, String name) {
        AbstractC22676k.m65750j(graphKey, "graphKey");
        AbstractC22676k.m65750j(name, "name");
        this.graphKey = graphKey;
        this.name = name;
    }
}
