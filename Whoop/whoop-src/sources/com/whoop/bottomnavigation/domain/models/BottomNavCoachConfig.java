package com.whoop.bottomnavigation.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ga1.C15620a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import te0.AbstractC33745d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u0016¨\u0006'"}, m65681d2 = {"Lcom/whoop/bottomnavigation/domain/models/BottomNavCoachConfig;", "", "", "Lcom/whoop/bottomnavigation/domain/models/BottomNavCoachTab;", "tabs", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bottom_navigation_release", "(Lcom/whoop/bottomnavigation/domain/models/BottomNavCoachConfig;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/whoop/bottomnavigation/domain/models/BottomNavCoachConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getTabs", "Companion", "$serializer", "a", "bottom-navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BottomNavCoachConfig {
    private final List<BottomNavCoachTab> tabs;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C15620a(28))};

    /* JADX INFO: renamed from: com.whoop.bottomnavigation.domain.models.BottomNavCoachConfig$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/bottomnavigation/domain/models/BottomNavCoachConfig$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/bottomnavigation/domain/models/BottomNavCoachConfig;", "serializer", "()Lwc3/c;", "bottom-navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BottomNavCoachConfig$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BottomNavCoachConfig() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(BottomNavCoachTab$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BottomNavCoachConfig copy$default(BottomNavCoachConfig bottomNavCoachConfig, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = bottomNavCoachConfig.tabs;
        }
        return bottomNavCoachConfig.copy(list);
    }

    public static final /* synthetic */ void write$Self$bottom_navigation_release(BottomNavCoachConfig self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && AbstractC22676k.m65745e(self.tabs, C25271y.f99162w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.tabs);
    }

    public final List<BottomNavCoachTab> component1() {
        return this.tabs;
    }

    public final BottomNavCoachConfig copy(List<BottomNavCoachTab> tabs) {
        AbstractC22676k.m65750j(tabs, "tabs");
        return new BottomNavCoachConfig(tabs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BottomNavCoachConfig) && AbstractC22676k.m65745e(this.tabs, ((BottomNavCoachConfig) other).tabs);
    }

    public final List<BottomNavCoachTab> getTabs() {
        return this.tabs;
    }

    public int hashCode() {
        return this.tabs.hashCode();
    }

    public String toString() {
        return AbstractC33745d.m106654m("BottomNavCoachConfig(tabs=", ")", this.tabs);
    }

    public /* synthetic */ BottomNavCoachConfig(int i13, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.tabs = C25271y.f99162w;
        } else {
            this.tabs = list;
        }
    }

    public BottomNavCoachConfig(List<BottomNavCoachTab> tabs) {
        AbstractC22676k.m65750j(tabs, "tabs");
        this.tabs = tabs;
    }

    public /* synthetic */ BottomNavCoachConfig(List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list);
    }
}
