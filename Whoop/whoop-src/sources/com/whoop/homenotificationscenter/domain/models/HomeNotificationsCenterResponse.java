package com.whoop.homenotificationscenter.domain.models;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import ma1.C25371a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0019¨\u0006,"}, m65681d2 = {"Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;", "", "", "Lcom/whoop/design/models/DesignSystemModel;", "notificationCards", "", "count", "<init>", "(Ljava/util/List;I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$home_notifications_center_release", "(Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()I", "copy", "(Ljava/util/List;I)Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getNotificationCards", "getNotificationCards$annotations", "()V", "I", "getCount", "Companion", "$serializer", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HomeNotificationsCenterResponse {

    @SerializedName("count")
    private final int count;

    @SerializedName("cards")
    private final List<DesignSystemModel> notificationCards;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C25371a(29)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/homenotificationscenter/domain/models/HomeNotificationsCenterResponse;", "serializer", "()Lwc3/c;", "home-notifications-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HomeNotificationsCenterResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HomeNotificationsCenterResponse(int i13, List list, int i14, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, HomeNotificationsCenterResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.notificationCards = list;
        this.count = i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeNotificationsCenterResponse copy$default(HomeNotificationsCenterResponse homeNotificationsCenterResponse, List list, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            list = homeNotificationsCenterResponse.notificationCards;
        }
        if ((i14 & 2) != 0) {
            i13 = homeNotificationsCenterResponse.count;
        }
        return homeNotificationsCenterResponse.copy(list, i13);
    }

    @InterfaceC37143h("cards")
    public static /* synthetic */ void getNotificationCards$annotations() {
    }

    public static final /* synthetic */ void write$Self$home_notifications_center_release(HomeNotificationsCenterResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.notificationCards);
        output.encodeIntElement(serialDesc, 1, self.count);
    }

    public final List<DesignSystemModel> component1() {
        return this.notificationCards;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    public final HomeNotificationsCenterResponse copy(List<? extends DesignSystemModel> notificationCards, int count) {
        AbstractC22676k.m65750j(notificationCards, "notificationCards");
        return new HomeNotificationsCenterResponse(notificationCards, count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeNotificationsCenterResponse)) {
            return false;
        }
        HomeNotificationsCenterResponse homeNotificationsCenterResponse = (HomeNotificationsCenterResponse) other;
        return AbstractC22676k.m65745e(this.notificationCards, homeNotificationsCenterResponse.notificationCards) && this.count == homeNotificationsCenterResponse.count;
    }

    public final int getCount() {
        return this.count;
    }

    public final List<DesignSystemModel> getNotificationCards() {
        return this.notificationCards;
    }

    public int hashCode() {
        return Integer.hashCode(this.count) + (this.notificationCards.hashCode() * 31);
    }

    public String toString() {
        return "HomeNotificationsCenterResponse(notificationCards=" + this.notificationCards + ", count=" + this.count + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomeNotificationsCenterResponse(List<? extends DesignSystemModel> notificationCards, int i13) {
        AbstractC22676k.m65750j(notificationCards, "notificationCards");
        this.notificationCards = notificationCards;
        this.count = i13;
    }
}
