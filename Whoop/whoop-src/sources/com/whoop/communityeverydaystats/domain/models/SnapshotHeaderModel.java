package com.whoop.communityeverydaystats.domain.models;

import c13.AbstractC3855a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.FabMenuModel;
import com.whoop.design.models.items.FabMenuModel$$serializer;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xo1.C38492a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 52\u00020\u0001:\u0003678B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"JP\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010 R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010\"¨\u00069"}, m65681d2 = {"Lcom/whoop/communityeverydaystats/domain/models/SnapshotHeaderModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "subtitle", "avatar", "Lcom/whoop/navigation/models/GenericInteraction;", "action", "", "Lcom/whoop/communityeverydaystats/domain/models/SnapshotHeaderModel$TrailingButton;", "trailingButtons", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$community_everyday_stats_release", "(Lcom/whoop/communityeverydaystats/domain/models/SnapshotHeaderModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/navigation/models/GenericInteraction;", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;)Lcom/whoop/communityeverydaystats/domain/models/SnapshotHeaderModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "getAvatar", "Lcom/whoop/navigation/models/GenericInteraction;", "getAction", "Ljava/util/List;", "getTrailingButtons", "Companion", "TrailingButton", "$serializer", "a", "community-everyday-stats_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SnapshotHeaderModel implements DesignSystemModel {
    private final GenericInteraction action;
    private final String avatar;
    private final String subtitle;
    private final String title;
    private final List<TrailingButton> trailingButtons;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C38492a(8))};

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u00060"}, m65681d2 = {"Lcom/whoop/communityeverydaystats/domain/models/SnapshotHeaderModel$TrailingButton;", "", "", "icon", "Lcom/whoop/navigation/models/GenericInteraction;", "action", "Lcom/whoop/design/models/items/FabMenuModel;", "menu", "<init>", "(Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/FabMenuModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/FabMenuModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$community_everyday_stats_release", "(Lcom/whoop/communityeverydaystats/domain/models/SnapshotHeaderModel$TrailingButton;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/navigation/models/GenericInteraction;", "component3", "()Lcom/whoop/design/models/items/FabMenuModel;", "copy", "(Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/design/models/items/FabMenuModel;)Lcom/whoop/communityeverydaystats/domain/models/SnapshotHeaderModel$TrailingButton;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "Lcom/whoop/navigation/models/GenericInteraction;", "getAction", "Lcom/whoop/design/models/items/FabMenuModel;", "getMenu", "Companion", "$serializer", "a", "community-everyday-stats_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class TrailingButton {
        private final GenericInteraction action;
        private final String icon;
        private final FabMenuModel menu;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = FabMenuModel.$stable | GenericInteraction.$stable;

        /* JADX INFO: renamed from: com.whoop.communityeverydaystats.domain.models.SnapshotHeaderModel$TrailingButton$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/communityeverydaystats/domain/models/SnapshotHeaderModel$TrailingButton$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/communityeverydaystats/domain/models/SnapshotHeaderModel$TrailingButton;", "serializer", "()Lwc3/c;", "community-everyday-stats_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return SnapshotHeaderModel$TrailingButton$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ TrailingButton(int i13, String str, GenericInteraction genericInteraction, FabMenuModel fabMenuModel, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i13 & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 7, SnapshotHeaderModel$TrailingButton$$serializer.INSTANCE.getDescriptor());
            }
            this.icon = str;
            this.action = genericInteraction;
            this.menu = fabMenuModel;
        }

        public static /* synthetic */ TrailingButton copy$default(TrailingButton trailingButton, String str, GenericInteraction genericInteraction, FabMenuModel fabMenuModel, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = trailingButton.icon;
            }
            if ((i13 & 2) != 0) {
                genericInteraction = trailingButton.action;
            }
            if ((i13 & 4) != 0) {
                fabMenuModel = trailingButton.menu;
            }
            return trailingButton.copy(str, genericInteraction, fabMenuModel);
        }

        public static final /* synthetic */ void write$Self$community_everyday_stats_release(TrailingButton self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.icon);
            output.encodeSerializableElement(serialDesc, 1, GenericInteraction$$serializer.INSTANCE, self.action);
            output.encodeNullableSerializableElement(serialDesc, 2, FabMenuModel$$serializer.INSTANCE, self.menu);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final GenericInteraction getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final FabMenuModel getMenu() {
            return this.menu;
        }

        public final TrailingButton copy(String icon, GenericInteraction action, FabMenuModel menu) {
            AbstractC22676k.m65750j(icon, "icon");
            AbstractC22676k.m65750j(action, "action");
            return new TrailingButton(icon, action, menu);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrailingButton)) {
                return false;
            }
            TrailingButton trailingButton = (TrailingButton) other;
            return AbstractC22676k.m65745e(this.icon, trailingButton.icon) && AbstractC22676k.m65745e(this.action, trailingButton.action) && AbstractC22676k.m65745e(this.menu, trailingButton.menu);
        }

        public final GenericInteraction getAction() {
            return this.action;
        }

        public final String getIcon() {
            return this.icon;
        }

        public final FabMenuModel getMenu() {
            return this.menu;
        }

        public int hashCode() {
            int iHashCode = (this.action.hashCode() + (this.icon.hashCode() * 31)) * 31;
            FabMenuModel fabMenuModel = this.menu;
            return iHashCode + (fabMenuModel == null ? 0 : fabMenuModel.hashCode());
        }

        public String toString() {
            return "TrailingButton(icon=" + this.icon + ", action=" + this.action + ", menu=" + this.menu + ")";
        }

        public TrailingButton(String icon, GenericInteraction action, FabMenuModel fabMenuModel) {
            AbstractC22676k.m65750j(icon, "icon");
            AbstractC22676k.m65750j(action, "action");
            this.icon = icon;
            this.action = action;
            this.menu = fabMenuModel;
        }
    }

    /* JADX INFO: renamed from: com.whoop.communityeverydaystats.domain.models.SnapshotHeaderModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/communityeverydaystats/domain/models/SnapshotHeaderModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/communityeverydaystats/domain/models/SnapshotHeaderModel;", "serializer", "()Lwc3/c;", "community-everyday-stats_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SnapshotHeaderModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SnapshotHeaderModel(int i13, String str, String str2, String str3, GenericInteraction genericInteraction, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, SnapshotHeaderModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.subtitle = str2;
        this.avatar = str3;
        this.action = genericInteraction;
        this.trailingButtons = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(SnapshotHeaderModel$TrailingButton$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SnapshotHeaderModel copy$default(SnapshotHeaderModel snapshotHeaderModel, String str, String str2, String str3, GenericInteraction genericInteraction, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = snapshotHeaderModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = snapshotHeaderModel.subtitle;
        }
        if ((i13 & 4) != 0) {
            str3 = snapshotHeaderModel.avatar;
        }
        if ((i13 & 8) != 0) {
            genericInteraction = snapshotHeaderModel.action;
        }
        if ((i13 & 16) != 0) {
            list = snapshotHeaderModel.trailingButtons;
        }
        List list2 = list;
        String str4 = str3;
        return snapshotHeaderModel.copy(str, str2, str4, genericInteraction, list2);
    }

    public static final /* synthetic */ void write$Self$community_everyday_stats_release(SnapshotHeaderModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.avatar);
        output.encodeNullableSerializableElement(serialDesc, 3, GenericInteraction$$serializer.INSTANCE, self.action);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.trailingButtons);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final GenericInteraction getAction() {
        return this.action;
    }

    public final List<TrailingButton> component5() {
        return this.trailingButtons;
    }

    public final SnapshotHeaderModel copy(String title, String subtitle, String avatar, GenericInteraction action, List<TrailingButton> trailingButtons) {
        AbstractC22676k.m65750j(title, "title");
        return new SnapshotHeaderModel(title, subtitle, avatar, action, trailingButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SnapshotHeaderModel)) {
            return false;
        }
        SnapshotHeaderModel snapshotHeaderModel = (SnapshotHeaderModel) other;
        return AbstractC22676k.m65745e(this.title, snapshotHeaderModel.title) && AbstractC22676k.m65745e(this.subtitle, snapshotHeaderModel.subtitle) && AbstractC22676k.m65745e(this.avatar, snapshotHeaderModel.avatar) && AbstractC22676k.m65745e(this.action, snapshotHeaderModel.action) && AbstractC22676k.m65745e(this.trailingButtons, snapshotHeaderModel.trailingButtons);
    }

    public final GenericInteraction getAction() {
        return this.action;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<TrailingButton> getTrailingButtons() {
        return this.trailingButtons;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avatar;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        GenericInteraction genericInteraction = this.action;
        int iHashCode4 = (iHashCode3 + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        List<TrailingButton> list = this.trailingButtons;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.avatar;
        GenericInteraction genericInteraction = this.action;
        List<TrailingButton> list = this.trailingButtons;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SnapshotHeaderModel(title=", str, ", subtitle=", str2, ", avatar=");
        sbM32001t.append(str3);
        sbM32001t.append(", action=");
        sbM32001t.append(genericInteraction);
        sbM32001t.append(", trailingButtons=");
        return AbstractC3855a.m11829m(sbM32001t, list, ")");
    }

    public SnapshotHeaderModel(String title, String str, String str2, GenericInteraction genericInteraction, List<TrailingButton> list) {
        AbstractC22676k.m65750j(title, "title");
        this.title = title;
        this.subtitle = str;
        this.avatar = str2;
        this.action = genericInteraction;
        this.trailingButtons = list;
    }
}
