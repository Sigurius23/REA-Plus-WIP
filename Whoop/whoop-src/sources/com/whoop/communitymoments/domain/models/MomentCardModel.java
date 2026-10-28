package com.whoop.communitymoments.domain.models;

import b91.EnumC2888c;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import ur0.C35180a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yb3.AbstractC39414r;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0006JKLMNOBW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012Bk\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\"J\u0012\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b.\u0010/Jn\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b2\u0010\"J\u0010\u00103\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00108\u001a\u0002072\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b=\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b>\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010?\u001a\u0004\b@\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\bB\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010C\u001a\u0004\bD\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010E\u001a\u0004\bF\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010G\u001a\u0004\bH\u0010/¨\u0006P"}, m65681d2 = {"Lcom/whoop/communitymoments/domain/models/MomentCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;", "fillMode", "imageUrl", "Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;", "dateBadge", "Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;", "profile", "Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;", "badge", "Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;", "footer", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "<init>", "(Ljava/lang/String;Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;Ljava/lang/String;Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;Ljava/lang/String;Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$community_moments_release", "(Lcom/whoop/communitymoments/domain/models/MomentCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;", "component3", "component4", "()Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;", "component5", "()Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;", "component6", "()Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;", "component7", "()Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;", "component8", "()Lcom/whoop/navigation/models/GenericInteraction;", "copy", "(Ljava/lang/String;Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;Ljava/lang/String;Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/communitymoments/domain/models/MomentCardModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/whoop/communitymoments/domain/models/MomentCardFillMode;", "getFillMode", "getImageUrl", "Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;", "getDateBadge", "Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;", "getProfile", "Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;", "getBadge", "Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;", "getFooter", "Lcom/whoop/navigation/models/GenericInteraction;", "getInteraction", "Companion", "DateBadge", ProfileAnalyticsKt.PROFILE, "Badge", "Footer", "$serializer", "a", "community-moments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MomentCardModel implements DesignSystemModel {
    private final Badge badge;
    private final DateBadge dateBadge;
    private final MomentCardFillMode fillMode;
    private final Footer footer;
    private final String id;
    private final String imageUrl;
    private final GenericInteraction interaction;
    private final Profile profile;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericInteraction.$stable;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C35180a(6)), null, null, null, null, null, null};

    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0015¨\u0006$"}, m65681d2 = {"Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;", "", "", "text", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$community_moments_release", "(Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Companion", "$serializer", "a", "community-moments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class Badge {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String text;

        /* JADX INFO: renamed from: com.whoop.communitymoments.domain.models.MomentCardModel$Badge$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/communitymoments/domain/models/MomentCardModel$Badge;", "serializer", "()Lwc3/c;", "community-moments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return MomentCardModel$Badge$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Badge(int i13, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i13 & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 1, MomentCardModel$Badge$$serializer.INSTANCE.getDescriptor());
            }
            this.text = str;
        }

        public static /* synthetic */ Badge copy$default(Badge badge, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = badge.text;
            }
            return badge.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final Badge copy(String text) {
            AbstractC22676k.m65750j(text, "text");
            return new Badge(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Badge) && AbstractC22676k.m65745e(this.text, ((Badge) other).text);
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Badge(text=", this.text, ")");
        }

        public Badge(String text) {
            AbstractC22676k.m65750j(text, "text");
            this.text = text;
        }
    }

    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006'"}, m65681d2 = {"Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;", "", "", "dateDay", "dateMonth", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$community_moments_release", "(Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDateDay", "getDateMonth", "Companion", "$serializer", "a", "community-moments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class DateBadge {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String dateDay;
        private final String dateMonth;

        /* JADX INFO: renamed from: com.whoop.communitymoments.domain.models.MomentCardModel$DateBadge$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/communitymoments/domain/models/MomentCardModel$DateBadge;", "serializer", "()Lwc3/c;", "community-moments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return MomentCardModel$DateBadge$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ DateBadge(int i13, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i13 & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 3, MomentCardModel$DateBadge$$serializer.INSTANCE.getDescriptor());
            }
            this.dateDay = str;
            this.dateMonth = str2;
        }

        public static /* synthetic */ DateBadge copy$default(DateBadge dateBadge, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = dateBadge.dateDay;
            }
            if ((i13 & 2) != 0) {
                str2 = dateBadge.dateMonth;
            }
            return dateBadge.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$community_moments_release(DateBadge self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.dateDay);
            output.encodeStringElement(serialDesc, 1, self.dateMonth);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDateDay() {
            return this.dateDay;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDateMonth() {
            return this.dateMonth;
        }

        public final DateBadge copy(String dateDay, String dateMonth) {
            AbstractC22676k.m65750j(dateDay, "dateDay");
            AbstractC22676k.m65750j(dateMonth, "dateMonth");
            return new DateBadge(dateDay, dateMonth);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DateBadge)) {
                return false;
            }
            DateBadge dateBadge = (DateBadge) other;
            return AbstractC22676k.m65745e(this.dateDay, dateBadge.dateDay) && AbstractC22676k.m65745e(this.dateMonth, dateBadge.dateMonth);
        }

        public final String getDateDay() {
            return this.dateDay;
        }

        public final String getDateMonth() {
            return this.dateMonth;
        }

        public int hashCode() {
            return this.dateMonth.hashCode() + (this.dateDay.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("DateBadge(dateDay=", this.dateDay, ", dateMonth=", this.dateMonth, ")");
        }

        public DateBadge(String dateDay, String dateMonth) {
            AbstractC22676k.m65750j(dateDay, "dateDay");
            AbstractC22676k.m65750j(dateMonth, "dateMonth");
            this.dateDay = dateDay;
            this.dateMonth = dateMonth;
        }
    }

    @Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJL\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b/\u0010\u001e¨\u00063"}, m65681d2 = {"Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;", "", "", "iconUrl", "title", "subtitle", "Lb91/c;", "titleTypography", "subtitleTypography", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb91/c;Lb91/c;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb91/c;Lb91/c;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$community_moments_release", "(Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lb91/c;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb91/c;Lb91/c;)Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIconUrl", "getTitle", "getSubtitle", "Lb91/c;", "getTitleTypography", "getSubtitleTypography", "Companion", "$serializer", "a", "community-moments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class Footer {
        private static final InterfaceC23462h[] $childSerializers;
        public static final int $stable = 0;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String iconUrl;
        private final String subtitle;
        private final EnumC2888c subtitleTypography;
        private final String title;
        private final EnumC2888c titleTypography;

        /* JADX INFO: renamed from: com.whoop.communitymoments.domain.models.MomentCardModel$Footer$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/communitymoments/domain/models/MomentCardModel$Footer;", "serializer", "()Lwc3/c;", "community-moments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return MomentCardModel$Footer$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        static {
            EnumC23463i enumC23463i = EnumC23463i.f92934x;
            $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C35180a(7)), AbstractC30060g.m92087G(enumC23463i, new C35180a(8))};
        }

        public /* synthetic */ Footer(int i13, String str, String str2, String str3, EnumC2888c enumC2888c, EnumC2888c enumC2888c2, SerializationConstructorMarker serializationConstructorMarker) {
            if (31 != (i13 & 31)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 31, MomentCardModel$Footer$$serializer.INSTANCE.getDescriptor());
            }
            this.iconUrl = str;
            this.title = str2;
            this.subtitle = str3;
            this.titleTypography = enumC2888c;
            this.subtitleTypography = enumC2888c2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
            return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.theme.typography.WhoopTextStyle", EnumC2888c.values());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
            return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.theme.typography.WhoopTextStyle", EnumC2888c.values());
        }

        public static /* synthetic */ Footer copy$default(Footer footer, String str, String str2, String str3, EnumC2888c enumC2888c, EnumC2888c enumC2888c2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = footer.iconUrl;
            }
            if ((i13 & 2) != 0) {
                str2 = footer.title;
            }
            if ((i13 & 4) != 0) {
                str3 = footer.subtitle;
            }
            if ((i13 & 8) != 0) {
                enumC2888c = footer.titleTypography;
            }
            if ((i13 & 16) != 0) {
                enumC2888c2 = footer.subtitleTypography;
            }
            EnumC2888c enumC2888c3 = enumC2888c2;
            String str4 = str3;
            return footer.copy(str, str2, str4, enumC2888c, enumC2888c3);
        }

        public static final /* synthetic */ void write$Self$community_moments_release(Footer self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.iconUrl);
            output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.title);
            output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.subtitle);
            output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.titleTypography);
            output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.subtitleTypography);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final EnumC2888c getTitleTypography() {
            return this.titleTypography;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final EnumC2888c getSubtitleTypography() {
            return this.subtitleTypography;
        }

        public final Footer copy(String iconUrl, String title, String subtitle, EnumC2888c titleTypography, EnumC2888c subtitleTypography) {
            return new Footer(iconUrl, title, subtitle, titleTypography, subtitleTypography);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Footer)) {
                return false;
            }
            Footer footer = (Footer) other;
            return AbstractC22676k.m65745e(this.iconUrl, footer.iconUrl) && AbstractC22676k.m65745e(this.title, footer.title) && AbstractC22676k.m65745e(this.subtitle, footer.subtitle) && this.titleTypography == footer.titleTypography && this.subtitleTypography == footer.subtitleTypography;
        }

        public final String getIconUrl() {
            return this.iconUrl;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final EnumC2888c getSubtitleTypography() {
            return this.subtitleTypography;
        }

        public final String getTitle() {
            return this.title;
        }

        public final EnumC2888c getTitleTypography() {
            return this.titleTypography;
        }

        public int hashCode() {
            String str = this.iconUrl;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.title;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.subtitle;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            EnumC2888c enumC2888c = this.titleTypography;
            int iHashCode4 = (iHashCode3 + (enumC2888c == null ? 0 : enumC2888c.hashCode())) * 31;
            EnumC2888c enumC2888c2 = this.subtitleTypography;
            return iHashCode4 + (enumC2888c2 != null ? enumC2888c2.hashCode() : 0);
        }

        public String toString() {
            String str = this.iconUrl;
            String str2 = this.title;
            String str3 = this.subtitle;
            EnumC2888c enumC2888c = this.titleTypography;
            EnumC2888c enumC2888c2 = this.subtitleTypography;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Footer(iconUrl=", str, ", title=", str2, ", subtitle=");
            sbM32001t.append(str3);
            sbM32001t.append(", titleTypography=");
            sbM32001t.append(enumC2888c);
            sbM32001t.append(", subtitleTypography=");
            sbM32001t.append(enumC2888c2);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }

        public Footer(String str, String str2, String str3, EnumC2888c enumC2888c, EnumC2888c enumC2888c2) {
            this.iconUrl = str;
            this.title = str2;
            this.subtitle = str3;
            this.titleTypography = enumC2888c;
            this.subtitleTypography = enumC2888c2;
        }
    }

    @Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ>\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001e¨\u00060"}, m65681d2 = {"Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;", "", "", "title", "subtitle", "avatar", "Lcom/whoop/navigation/models/GenericInteraction;", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$community_moments_release", "(Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;Lzc3/c;Lyc3/g;)V", "write$Self", "toString", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "()Lcom/whoop/navigation/models/GenericInteraction;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "getAvatar", "Lcom/whoop/navigation/models/GenericInteraction;", "getAction", "Companion", "$serializer", "a", "community-moments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class Profile {
        private final GenericInteraction action;
        private final String avatar;
        private final String subtitle;
        private final String title;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = GenericInteraction.$stable;

        /* JADX INFO: renamed from: com.whoop.communitymoments.domain.models.MomentCardModel$Profile$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/communitymoments/domain/models/MomentCardModel$Profile;", "serializer", "()Lwc3/c;", "community-moments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return MomentCardModel$Profile$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Profile(int i13, String str, String str2, String str3, GenericInteraction genericInteraction, SerializationConstructorMarker serializationConstructorMarker) {
            if (15 != (i13 & 15)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 15, MomentCardModel$Profile$$serializer.INSTANCE.getDescriptor());
            }
            this.title = str;
            this.subtitle = str2;
            this.avatar = str3;
            this.action = genericInteraction;
        }

        public static /* synthetic */ Profile copy$default(Profile profile, String str, String str2, String str3, GenericInteraction genericInteraction, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = profile.title;
            }
            if ((i13 & 2) != 0) {
                str2 = profile.subtitle;
            }
            if ((i13 & 4) != 0) {
                str3 = profile.avatar;
            }
            if ((i13 & 8) != 0) {
                genericInteraction = profile.action;
            }
            return profile.copy(str, str2, str3, genericInteraction);
        }

        public static final /* synthetic */ void write$Self$community_moments_release(Profile self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.title);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.subtitle);
            output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.avatar);
            output.encodeNullableSerializableElement(serialDesc, 3, GenericInteraction$$serializer.INSTANCE, self.action);
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

        public final Profile copy(String title, String subtitle, String avatar, GenericInteraction action) {
            AbstractC22676k.m65750j(title, "title");
            return new Profile(title, subtitle, avatar, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Profile)) {
                return false;
            }
            Profile profile = (Profile) other;
            return AbstractC22676k.m65745e(this.title, profile.title) && AbstractC22676k.m65745e(this.subtitle, profile.subtitle) && AbstractC22676k.m65745e(this.avatar, profile.avatar) && AbstractC22676k.m65745e(this.action, profile.action);
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

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.avatar;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            GenericInteraction genericInteraction = this.action;
            return iHashCode3 + (genericInteraction != null ? genericInteraction.hashCode() : 0);
        }

        public String toString() {
            String str = this.avatar;
            return AbstractC30802r.m94762k("Profile(hasAvatar=", ", hasAction=", ")", !(str == null || AbstractC39414r.m125890i0(str)), this.action != null);
        }

        public Profile(String title, String str, String str2, GenericInteraction genericInteraction) {
            AbstractC22676k.m65750j(title, "title");
            this.title = title;
            this.subtitle = str;
            this.avatar = str2;
            this.action = genericInteraction;
        }
    }

    /* JADX INFO: renamed from: com.whoop.communitymoments.domain.models.MomentCardModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/communitymoments/domain/models/MomentCardModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/communitymoments/domain/models/MomentCardModel;", "serializer", "()Lwc3/c;", "community-moments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MomentCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MomentCardModel(int i13, String str, MomentCardFillMode momentCardFillMode, String str2, DateBadge dateBadge, Profile profile, Badge badge, Footer footer, GenericInteraction genericInteraction, SerializationConstructorMarker serializationConstructorMarker) {
        if (253 != (i13 & 253)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 253, MomentCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        if ((i13 & 2) == 0) {
            this.fillMode = MomentCardFillMode.FIT_CONTENT;
        } else {
            this.fillMode = momentCardFillMode;
        }
        this.imageUrl = str2;
        this.dateBadge = dateBadge;
        this.profile = profile;
        this.badge = badge;
        this.footer = footer;
        this.interaction = genericInteraction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return MomentCardFillMode.INSTANCE.serializer();
    }

    public static /* synthetic */ MomentCardModel copy$default(MomentCardModel momentCardModel, String str, MomentCardFillMode momentCardFillMode, String str2, DateBadge dateBadge, Profile profile, Badge badge, Footer footer, GenericInteraction genericInteraction, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = momentCardModel.id;
        }
        if ((i13 & 2) != 0) {
            momentCardFillMode = momentCardModel.fillMode;
        }
        if ((i13 & 4) != 0) {
            str2 = momentCardModel.imageUrl;
        }
        if ((i13 & 8) != 0) {
            dateBadge = momentCardModel.dateBadge;
        }
        if ((i13 & 16) != 0) {
            profile = momentCardModel.profile;
        }
        if ((i13 & 32) != 0) {
            badge = momentCardModel.badge;
        }
        if ((i13 & 64) != 0) {
            footer = momentCardModel.footer;
        }
        if ((i13 & 128) != 0) {
            genericInteraction = momentCardModel.interaction;
        }
        Footer footer2 = footer;
        GenericInteraction genericInteraction2 = genericInteraction;
        Profile profile2 = profile;
        Badge badge2 = badge;
        return momentCardModel.copy(str, momentCardFillMode, str2, dateBadge, profile2, badge2, footer2, genericInteraction2);
    }

    public static final /* synthetic */ void write$Self$community_moments_release(MomentCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.fillMode != MomentCardFillMode.FIT_CONTENT) {
            output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.fillMode);
        }
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.imageUrl);
        output.encodeNullableSerializableElement(serialDesc, 3, MomentCardModel$DateBadge$$serializer.INSTANCE, self.dateBadge);
        output.encodeNullableSerializableElement(serialDesc, 4, MomentCardModel$Profile$$serializer.INSTANCE, self.profile);
        output.encodeNullableSerializableElement(serialDesc, 5, MomentCardModel$Badge$$serializer.INSTANCE, self.badge);
        output.encodeNullableSerializableElement(serialDesc, 6, MomentCardModel$Footer$$serializer.INSTANCE, self.footer);
        output.encodeNullableSerializableElement(serialDesc, 7, GenericInteraction$$serializer.INSTANCE, self.interaction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MomentCardFillMode getFillMode() {
        return this.fillMode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DateBadge getDateBadge() {
        return this.dateBadge;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Profile getProfile() {
        return this.profile;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Badge getBadge() {
        return this.badge;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Footer getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public final MomentCardModel copy(String id4, MomentCardFillMode fillMode, String imageUrl, DateBadge dateBadge, Profile profile, Badge badge, Footer footer, GenericInteraction interaction) {
        AbstractC22676k.m65750j(id4, "id");
        return new MomentCardModel(id4, fillMode, imageUrl, dateBadge, profile, badge, footer, interaction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MomentCardModel)) {
            return false;
        }
        MomentCardModel momentCardModel = (MomentCardModel) other;
        return AbstractC22676k.m65745e(this.id, momentCardModel.id) && this.fillMode == momentCardModel.fillMode && AbstractC22676k.m65745e(this.imageUrl, momentCardModel.imageUrl) && AbstractC22676k.m65745e(this.dateBadge, momentCardModel.dateBadge) && AbstractC22676k.m65745e(this.profile, momentCardModel.profile) && AbstractC22676k.m65745e(this.badge, momentCardModel.badge) && AbstractC22676k.m65745e(this.footer, momentCardModel.footer) && AbstractC22676k.m65745e(this.interaction, momentCardModel.interaction);
    }

    public final Badge getBadge() {
        return this.badge;
    }

    public final DateBadge getDateBadge() {
        return this.dateBadge;
    }

    public final MomentCardFillMode getFillMode() {
        return this.fillMode;
    }

    public final Footer getFooter() {
        return this.footer;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public final Profile getProfile() {
        return this.profile;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        MomentCardFillMode momentCardFillMode = this.fillMode;
        int iHashCode2 = (iHashCode + (momentCardFillMode == null ? 0 : momentCardFillMode.hashCode())) * 31;
        String str = this.imageUrl;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        DateBadge dateBadge = this.dateBadge;
        int iHashCode4 = (iHashCode3 + (dateBadge == null ? 0 : dateBadge.hashCode())) * 31;
        Profile profile = this.profile;
        int iHashCode5 = (iHashCode4 + (profile == null ? 0 : profile.hashCode())) * 31;
        Badge badge = this.badge;
        int iHashCode6 = (iHashCode5 + (badge == null ? 0 : badge.hashCode())) * 31;
        Footer footer = this.footer;
        int iHashCode7 = (iHashCode6 + (footer == null ? 0 : footer.hashCode())) * 31;
        GenericInteraction genericInteraction = this.interaction;
        return iHashCode7 + (genericInteraction != null ? genericInteraction.hashCode() : 0);
    }

    public String toString() {
        return "MomentCardModel(id=" + this.id + ", fillMode=" + this.fillMode + ", imageUrl=" + this.imageUrl + ", dateBadge=" + this.dateBadge + ", profile=" + this.profile + ", badge=" + this.badge + ", footer=" + this.footer + ", interaction=" + this.interaction + ")";
    }

    public MomentCardModel(String id4, MomentCardFillMode momentCardFillMode, String str, DateBadge dateBadge, Profile profile, Badge badge, Footer footer, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(id4, "id");
        this.id = id4;
        this.fillMode = momentCardFillMode;
        this.imageUrl = str;
        this.dateBadge = dateBadge;
        this.profile = profile;
        this.badge = badge;
        this.footer = footer;
        this.interaction = genericInteraction;
    }

    public /* synthetic */ MomentCardModel(String str, MomentCardFillMode momentCardFillMode, String str2, DateBadge dateBadge, Profile profile, Badge badge, Footer footer, GenericInteraction genericInteraction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? MomentCardFillMode.FIT_CONTENT : momentCardFillMode, str2, dateBadge, profile, badge, footer, genericInteraction);
    }
}
