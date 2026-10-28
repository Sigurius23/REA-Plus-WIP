package com.whoop.referafriend.domain.models;

import androidx.core.app.FrameMetricsAggregator;
import com.google.gson.annotations.SerializedName;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import j93.InterfaceC21461d;
import java.lang.annotation.Annotation;
import java.util.List;
import jx2.C22038b;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37142g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0004\u0012\u0013\u0014\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0003\u0015\u0016\u0017¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/referafriend/domain/models/RafHubType;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/whoop/referafriend/domain/models/RafHubType;Lzc3/c;Lyc3/g;)V", "Companion", "Basic", "Full", "Trials", "Lcom/whoop/referafriend/domain/models/RafHubType$Basic;", "Lcom/whoop/referafriend/domain/models/RafHubType$Full;", "Lcom/whoop/referafriend/domain/models/RafHubType$Trials;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public abstract class RafHubType {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C22038b(6));

    @Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010\"JN\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u001eJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b3\u0010\u001eR \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00104\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010\"R\"\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00104\u0012\u0004\b9\u00107\u001a\u0004\b8\u0010\"¨\u0006<"}, m65681d2 = {"Lcom/whoop/referafriend/domain/models/RafHubType$Basic;", "Lcom/whoop/referafriend/domain/models/RafHubType;", "Lcom/whoop/referafriend/domain/models/BasicRafStyle;", "style", "", "icon", "title", "subtitle", "Lcom/whoop/referafriend/domain/models/RafHubCTA;", "primaryCta", "secondaryCta", "<init>", "(Lcom/whoop/referafriend/domain/models/BasicRafStyle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/referafriend/domain/models/RafHubCTA;Lcom/whoop/referafriend/domain/models/RafHubCTA;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/referafriend/domain/models/BasicRafStyle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/referafriend/domain/models/RafHubCTA;Lcom/whoop/referafriend/domain/models/RafHubCTA;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$refer_a_friend_release", "(Lcom/whoop/referafriend/domain/models/RafHubType$Basic;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/referafriend/domain/models/BasicRafStyle;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lcom/whoop/referafriend/domain/models/RafHubCTA;", "component6", "copy", "(Lcom/whoop/referafriend/domain/models/BasicRafStyle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/referafriend/domain/models/RafHubCTA;Lcom/whoop/referafriend/domain/models/RafHubCTA;)Lcom/whoop/referafriend/domain/models/RafHubType$Basic;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/referafriend/domain/models/BasicRafStyle;", "getStyle", "Ljava/lang/String;", "getIcon", "getTitle", "getSubtitle", "Lcom/whoop/referafriend/domain/models/RafHubCTA;", "getPrimaryCta", "getPrimaryCta$annotations", "()V", "getSecondaryCta", "getSecondaryCta$annotations", "Companion", "$serializer", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class Basic extends RafHubType {
        private final String icon;

        @SerializedName("primary_cta")
        private final RafHubCTA primaryCta;

        @SerializedName("secondary_cta")
        private final RafHubCTA secondaryCta;
        private final BasicRafStyle style;
        private final String subtitle;
        private final String title;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = C9598e.f28134d;
        private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C22038b(7)), null, null, null, null, null};

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/referafriend/domain/models/RafHubType$Basic$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/referafriend/domain/models/RafHubType$Basic;", "serializer", "()Lwc3/c;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return RafHubType$Basic$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Basic(int i13, BasicRafStyle basicRafStyle, String str, String str2, String str3, RafHubCTA rafHubCTA, RafHubCTA rafHubCTA2, SerializationConstructorMarker serializationConstructorMarker) {
            super(i13, serializationConstructorMarker);
            if (63 != (i13 & 63)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 63, RafHubType$Basic$$serializer.INSTANCE.getDescriptor());
            }
            this.style = basicRafStyle;
            this.icon = str;
            this.title = str2;
            this.subtitle = str3;
            this.primaryCta = rafHubCTA;
            this.secondaryCta = rafHubCTA2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
            return BasicRafStyle.INSTANCE.serializer();
        }

        public static /* synthetic */ Basic copy$default(Basic basic, BasicRafStyle basicRafStyle, String str, String str2, String str3, RafHubCTA rafHubCTA, RafHubCTA rafHubCTA2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                basicRafStyle = basic.style;
            }
            if ((i13 & 2) != 0) {
                str = basic.icon;
            }
            if ((i13 & 4) != 0) {
                str2 = basic.title;
            }
            if ((i13 & 8) != 0) {
                str3 = basic.subtitle;
            }
            if ((i13 & 16) != 0) {
                rafHubCTA = basic.primaryCta;
            }
            if ((i13 & 32) != 0) {
                rafHubCTA2 = basic.secondaryCta;
            }
            RafHubCTA rafHubCTA3 = rafHubCTA;
            RafHubCTA rafHubCTA4 = rafHubCTA2;
            return basic.copy(basicRafStyle, str, str2, str3, rafHubCTA3, rafHubCTA4);
        }

        @InterfaceC37143h("primary_cta")
        public static /* synthetic */ void getPrimaryCta$annotations() {
        }

        @InterfaceC37143h("secondary_cta")
        public static /* synthetic */ void getSecondaryCta$annotations() {
        }

        public static final /* synthetic */ void write$Self$refer_a_friend_release(Basic self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            RafHubType.write$Self(self, output, serialDesc);
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.style);
            output.encodeStringElement(serialDesc, 1, self.icon);
            output.encodeStringElement(serialDesc, 2, self.title);
            output.encodeStringElement(serialDesc, 3, self.subtitle);
            RafHubCTA$$serializer rafHubCTA$$serializer = RafHubCTA$$serializer.INSTANCE;
            output.encodeSerializableElement(serialDesc, 4, rafHubCTA$$serializer, self.primaryCta);
            output.encodeNullableSerializableElement(serialDesc, 5, rafHubCTA$$serializer, self.secondaryCta);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final BasicRafStyle getStyle() {
            return this.style;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final RafHubCTA getPrimaryCta() {
            return this.primaryCta;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final RafHubCTA getSecondaryCta() {
            return this.secondaryCta;
        }

        public final Basic copy(BasicRafStyle style, String icon, String title, String subtitle, RafHubCTA primaryCta, RafHubCTA secondaryCta) {
            AbstractC22676k.m65750j(style, "style");
            AbstractC22676k.m65750j(icon, "icon");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            AbstractC22676k.m65750j(primaryCta, "primaryCta");
            return new Basic(style, icon, title, subtitle, primaryCta, secondaryCta);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Basic)) {
                return false;
            }
            Basic basic = (Basic) other;
            return this.style == basic.style && AbstractC22676k.m65745e(this.icon, basic.icon) && AbstractC22676k.m65745e(this.title, basic.title) && AbstractC22676k.m65745e(this.subtitle, basic.subtitle) && AbstractC22676k.m65745e(this.primaryCta, basic.primaryCta) && AbstractC22676k.m65745e(this.secondaryCta, basic.secondaryCta);
        }

        public final String getIcon() {
            return this.icon;
        }

        public final RafHubCTA getPrimaryCta() {
            return this.primaryCta;
        }

        public final RafHubCTA getSecondaryCta() {
            return this.secondaryCta;
        }

        public final BasicRafStyle getStyle() {
            return this.style;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = (this.primaryCta.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.style.hashCode() * 31, 31, this.icon), 31, this.title), 31, this.subtitle)) * 31;
            RafHubCTA rafHubCTA = this.secondaryCta;
            return iHashCode + (rafHubCTA == null ? 0 : rafHubCTA.hashCode());
        }

        public String toString() {
            BasicRafStyle basicRafStyle = this.style;
            String str = this.icon;
            String str2 = this.title;
            String str3 = this.subtitle;
            RafHubCTA rafHubCTA = this.primaryCta;
            RafHubCTA rafHubCTA2 = this.secondaryCta;
            StringBuilder sb4 = new StringBuilder("Basic(style=");
            sb4.append(basicRafStyle);
            sb4.append(", icon=");
            sb4.append(str);
            sb4.append(", title=");
            AbstractC11266d.m30444B(sb4, str2, ", subtitle=", str3, ", primaryCta=");
            sb4.append(rafHubCTA);
            sb4.append(", secondaryCta=");
            sb4.append(rafHubCTA2);
            sb4.append(")");
            return sb4.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Basic(BasicRafStyle style, String icon, String title, String subtitle, RafHubCTA primaryCta, RafHubCTA rafHubCTA) {
            super(null);
            AbstractC22676k.m65750j(style, "style");
            AbstractC22676k.m65750j(icon, "icon");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            AbstractC22676k.m65750j(primaryCta, "primaryCta");
            this.style = style;
            this.icon = icon;
            this.title = title;
            this.subtitle = subtitle;
            this.primaryCta = primaryCta;
            this.secondaryCta = rafHubCTA;
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/referafriend/domain/models/RafHubType$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/referafriend/domain/models/RafHubType;", "serializer", "()Lwc3/c;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ InterfaceC37138c get$cachedSerializer() {
            return (InterfaceC37138c) RafHubType.$cachedSerializer$delegate.getValue();
        }

        public final InterfaceC37138c serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    @Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0002IHBW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Bu\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b!\u0010\"Jr\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0017J\u0010\u0010&\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,J'\u00105\u001a\u0002022\u0006\u0010-\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0001¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0017R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00106\u0012\u0004\b9\u0010:\u001a\u0004\b8\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b;\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b<\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b=\u0010\u0017R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010>\u0012\u0004\b@\u0010:\u001a\u0004\b?\u0010\u001dR\"\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010>\u0012\u0004\bB\u0010:\u001a\u0004\bA\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010C\u001a\u0004\bD\u0010 R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010E\u0012\u0004\bG\u0010:\u001a\u0004\bF\u0010\"¨\u0006J"}, m65681d2 = {"Lcom/whoop/referafriend/domain/models/RafHubType$Full;", "Lcom/whoop/referafriend/domain/models/RafHubType;", "", "header", "navigationBarText", "icon", "title", "subtitle", "Lcom/whoop/referafriend/domain/models/RafHubCTA;", "primaryCta", "secondaryCta", "Lcom/whoop/referafriend/domain/models/Promotion;", "promotion", "Lcom/whoop/referafriend/domain/models/RafHowItWorksModel;", "howItWorks", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/referafriend/domain/models/RafHubCTA;Lcom/whoop/referafriend/domain/models/RafHubCTA;Lcom/whoop/referafriend/domain/models/Promotion;Lcom/whoop/referafriend/domain/models/RafHowItWorksModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/referafriend/domain/models/RafHubCTA;Lcom/whoop/referafriend/domain/models/RafHubCTA;Lcom/whoop/referafriend/domain/models/Promotion;Lcom/whoop/referafriend/domain/models/RafHowItWorksModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/whoop/referafriend/domain/models/RafHubCTA;", "component7", "component8", "()Lcom/whoop/referafriend/domain/models/Promotion;", "component9", "()Lcom/whoop/referafriend/domain/models/RafHowItWorksModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/referafriend/domain/models/RafHubCTA;Lcom/whoop/referafriend/domain/models/RafHubCTA;Lcom/whoop/referafriend/domain/models/Promotion;Lcom/whoop/referafriend/domain/models/RafHowItWorksModel;)Lcom/whoop/referafriend/domain/models/RafHubType$Full;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$refer_a_friend_release", "(Lcom/whoop/referafriend/domain/models/RafHubType$Full;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getHeader", "getNavigationBarText", "getNavigationBarText$annotations", "()V", "getIcon", "getTitle", "getSubtitle", "Lcom/whoop/referafriend/domain/models/RafHubCTA;", "getPrimaryCta", "getPrimaryCta$annotations", "getSecondaryCta", "getSecondaryCta$annotations", "Lcom/whoop/referafriend/domain/models/Promotion;", "getPromotion", "Lcom/whoop/referafriend/domain/models/RafHowItWorksModel;", "getHowItWorks", "getHowItWorks$annotations", "Companion", "$serializer", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class Full extends RafHubType {
        private final String header;

        @SerializedName("how_it_works")
        private final RafHowItWorksModel howItWorks;
        private final String icon;

        @SerializedName("navigation_bar_text")
        private final String navigationBarText;

        @SerializedName("primary_cta")
        private final RafHubCTA primaryCta;
        private final Promotion promotion;

        @SerializedName("secondary_cta")
        private final RafHubCTA secondaryCta;
        private final String subtitle;
        private final String title;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/referafriend/domain/models/RafHubType$Full$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/referafriend/domain/models/RafHubType$Full;", "serializer", "()Lwc3/c;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return RafHubType$Full$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Full(int i13, String str, String str2, String str3, String str4, String str5, RafHubCTA rafHubCTA, RafHubCTA rafHubCTA2, Promotion promotion, RafHowItWorksModel rafHowItWorksModel, SerializationConstructorMarker serializationConstructorMarker) {
            super(i13, serializationConstructorMarker);
            if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
                PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, RafHubType$Full$$serializer.INSTANCE.getDescriptor());
            }
            this.header = str;
            this.navigationBarText = str2;
            this.icon = str3;
            this.title = str4;
            this.subtitle = str5;
            this.primaryCta = rafHubCTA;
            this.secondaryCta = rafHubCTA2;
            this.promotion = promotion;
            this.howItWorks = rafHowItWorksModel;
        }

        public static /* synthetic */ Full copy$default(Full full, String str, String str2, String str3, String str4, String str5, RafHubCTA rafHubCTA, RafHubCTA rafHubCTA2, Promotion promotion, RafHowItWorksModel rafHowItWorksModel, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = full.header;
            }
            if ((i13 & 2) != 0) {
                str2 = full.navigationBarText;
            }
            if ((i13 & 4) != 0) {
                str3 = full.icon;
            }
            if ((i13 & 8) != 0) {
                str4 = full.title;
            }
            if ((i13 & 16) != 0) {
                str5 = full.subtitle;
            }
            if ((i13 & 32) != 0) {
                rafHubCTA = full.primaryCta;
            }
            if ((i13 & 64) != 0) {
                rafHubCTA2 = full.secondaryCta;
            }
            if ((i13 & 128) != 0) {
                promotion = full.promotion;
            }
            if ((i13 & 256) != 0) {
                rafHowItWorksModel = full.howItWorks;
            }
            Promotion promotion2 = promotion;
            RafHowItWorksModel rafHowItWorksModel2 = rafHowItWorksModel;
            RafHubCTA rafHubCTA3 = rafHubCTA;
            RafHubCTA rafHubCTA4 = rafHubCTA2;
            String str6 = str5;
            String str7 = str3;
            return full.copy(str, str2, str7, str4, str6, rafHubCTA3, rafHubCTA4, promotion2, rafHowItWorksModel2);
        }

        @InterfaceC37143h("how_it_works")
        public static /* synthetic */ void getHowItWorks$annotations() {
        }

        @InterfaceC37143h("navigation_bar_text")
        public static /* synthetic */ void getNavigationBarText$annotations() {
        }

        @InterfaceC37143h("primary_cta")
        public static /* synthetic */ void getPrimaryCta$annotations() {
        }

        @InterfaceC37143h("secondary_cta")
        public static /* synthetic */ void getSecondaryCta$annotations() {
        }

        public static final /* synthetic */ void write$Self$refer_a_friend_release(Full self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            RafHubType.write$Self(self, output, serialDesc);
            output.encodeStringElement(serialDesc, 0, self.header);
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.navigationBarText);
            output.encodeStringElement(serialDesc, 2, self.icon);
            output.encodeStringElement(serialDesc, 3, self.title);
            output.encodeStringElement(serialDesc, 4, self.subtitle);
            RafHubCTA$$serializer rafHubCTA$$serializer = RafHubCTA$$serializer.INSTANCE;
            output.encodeSerializableElement(serialDesc, 5, rafHubCTA$$serializer, self.primaryCta);
            output.encodeNullableSerializableElement(serialDesc, 6, rafHubCTA$$serializer, self.secondaryCta);
            output.encodeNullableSerializableElement(serialDesc, 7, Promotion$$serializer.INSTANCE, self.promotion);
            output.encodeNullableSerializableElement(serialDesc, 8, RafHowItWorksModel$$serializer.INSTANCE, self.howItWorks);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getHeader() {
            return this.header;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getNavigationBarText() {
            return this.navigationBarText;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final RafHubCTA getPrimaryCta() {
            return this.primaryCta;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final RafHubCTA getSecondaryCta() {
            return this.secondaryCta;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Promotion getPromotion() {
            return this.promotion;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final RafHowItWorksModel getHowItWorks() {
            return this.howItWorks;
        }

        public final Full copy(String header, String navigationBarText, String icon, String title, String subtitle, RafHubCTA primaryCta, RafHubCTA secondaryCta, Promotion promotion, RafHowItWorksModel howItWorks) {
            AbstractC22676k.m65750j(header, "header");
            AbstractC22676k.m65750j(icon, "icon");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            AbstractC22676k.m65750j(primaryCta, "primaryCta");
            return new Full(header, navigationBarText, icon, title, subtitle, primaryCta, secondaryCta, promotion, howItWorks);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Full)) {
                return false;
            }
            Full full = (Full) other;
            return AbstractC22676k.m65745e(this.header, full.header) && AbstractC22676k.m65745e(this.navigationBarText, full.navigationBarText) && AbstractC22676k.m65745e(this.icon, full.icon) && AbstractC22676k.m65745e(this.title, full.title) && AbstractC22676k.m65745e(this.subtitle, full.subtitle) && AbstractC22676k.m65745e(this.primaryCta, full.primaryCta) && AbstractC22676k.m65745e(this.secondaryCta, full.secondaryCta) && AbstractC22676k.m65745e(this.promotion, full.promotion) && AbstractC22676k.m65745e(this.howItWorks, full.howItWorks);
        }

        public final String getHeader() {
            return this.header;
        }

        public final RafHowItWorksModel getHowItWorks() {
            return this.howItWorks;
        }

        public final String getIcon() {
            return this.icon;
        }

        public final String getNavigationBarText() {
            return this.navigationBarText;
        }

        public final RafHubCTA getPrimaryCta() {
            return this.primaryCta;
        }

        public final Promotion getPromotion() {
            return this.promotion;
        }

        public final RafHubCTA getSecondaryCta() {
            return this.secondaryCta;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.header.hashCode() * 31;
            String str = this.navigationBarText;
            int iHashCode2 = (this.primaryCta.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.icon), 31, this.title), 31, this.subtitle)) * 31;
            RafHubCTA rafHubCTA = this.secondaryCta;
            int iHashCode3 = (iHashCode2 + (rafHubCTA == null ? 0 : rafHubCTA.hashCode())) * 31;
            Promotion promotion = this.promotion;
            int iHashCode4 = (iHashCode3 + (promotion == null ? 0 : promotion.hashCode())) * 31;
            RafHowItWorksModel rafHowItWorksModel = this.howItWorks;
            return iHashCode4 + (rafHowItWorksModel != null ? rafHowItWorksModel.hashCode() : 0);
        }

        public String toString() {
            String str = this.header;
            String str2 = this.navigationBarText;
            String str3 = this.icon;
            String str4 = this.title;
            String str5 = this.subtitle;
            RafHubCTA rafHubCTA = this.primaryCta;
            RafHubCTA rafHubCTA2 = this.secondaryCta;
            Promotion promotion = this.promotion;
            RafHowItWorksModel rafHowItWorksModel = this.howItWorks;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Full(header=", str, ", navigationBarText=", str2, ", icon=");
            AbstractC11266d.m30444B(sbM32001t, str3, ", title=", str4, ", subtitle=");
            sbM32001t.append(str5);
            sbM32001t.append(", primaryCta=");
            sbM32001t.append(rafHubCTA);
            sbM32001t.append(", secondaryCta=");
            sbM32001t.append(rafHubCTA2);
            sbM32001t.append(", promotion=");
            sbM32001t.append(promotion);
            sbM32001t.append(", howItWorks=");
            sbM32001t.append(rafHowItWorksModel);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Full(String header, String str, String icon, String title, String subtitle, RafHubCTA primaryCta, RafHubCTA rafHubCTA, Promotion promotion, RafHowItWorksModel rafHowItWorksModel) {
            super(null);
            AbstractC22676k.m65750j(header, "header");
            AbstractC22676k.m65750j(icon, "icon");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            AbstractC22676k.m65750j(primaryCta, "primaryCta");
            this.header = header;
            this.navigationBarText = str;
            this.icon = icon;
            this.title = title;
            this.subtitle = subtitle;
            this.primaryCta = primaryCta;
            this.secondaryCta = rafHubCTA;
            this.promotion = promotion;
            this.howItWorks = rafHowItWorksModel;
        }
    }

    @Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJH\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u001eR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00103\u0012\u0004\b5\u00102\u001a\u0004\b4\u0010 R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010-\u0012\u0004\b7\u00102\u001a\u0004\b6\u0010\u001cR \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010-\u0012\u0004\b9\u00102\u001a\u0004\b8\u0010\u001c¨\u0006<"}, m65681d2 = {"Lcom/whoop/referafriend/domain/models/RafHubType$Trials;", "Lcom/whoop/referafriend/domain/models/RafHubType;", "", "title", "", "Lcom/whoop/referafriend/domain/models/TrialsItemModel;", "trialItems", "Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;", "tutorialContent", "skipCtaText", "continueCtaText", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$refer_a_friend_release", "(Lcom/whoop/referafriend/domain/models/RafHubType$Trials;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/referafriend/domain/models/RafHubType$Trials;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getTrialItems", "getTrialItems$annotations", "()V", "Lcom/whoop/referafriend/domain/models/TrialsTutorialModel;", "getTutorialContent", "getTutorialContent$annotations", "getSkipCtaText", "getSkipCtaText$annotations", "getContinueCtaText", "getContinueCtaText$annotations", "Companion", "$serializer", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class Trials extends RafHubType {

        @SerializedName("continue_cta_text")
        private final String continueCtaText;

        @SerializedName("skip_cta_text")
        private final String skipCtaText;
        private final String title;

        @SerializedName("trial_items")
        private final List<TrialsItemModel> trialItems;

        @SerializedName("tutorial_content")
        private final TrialsTutorialModel tutorialContent;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;
        private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C22038b(8)), null, null, null};

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/referafriend/domain/models/RafHubType$Trials$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/referafriend/domain/models/RafHubType$Trials;", "serializer", "()Lwc3/c;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final InterfaceC37138c serializer() {
                return RafHubType$Trials$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Trials(int i13, String str, List list, TrialsTutorialModel trialsTutorialModel, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            super(i13, serializationConstructorMarker);
            if (31 != (i13 & 31)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 31, RafHubType$Trials$$serializer.INSTANCE.getDescriptor());
            }
            this.title = str;
            this.trialItems = list;
            this.tutorialContent = trialsTutorialModel;
            this.skipCtaText = str2;
            this.continueCtaText = str3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
            return new ArrayListSerializer(TrialsItemModel$$serializer.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Trials copy$default(Trials trials, String str, List list, TrialsTutorialModel trialsTutorialModel, String str2, String str3, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = trials.title;
            }
            if ((i13 & 2) != 0) {
                list = trials.trialItems;
            }
            if ((i13 & 4) != 0) {
                trialsTutorialModel = trials.tutorialContent;
            }
            if ((i13 & 8) != 0) {
                str2 = trials.skipCtaText;
            }
            if ((i13 & 16) != 0) {
                str3 = trials.continueCtaText;
            }
            String str4 = str3;
            TrialsTutorialModel trialsTutorialModel2 = trialsTutorialModel;
            return trials.copy(str, list, trialsTutorialModel2, str2, str4);
        }

        @InterfaceC37143h("continue_cta_text")
        public static /* synthetic */ void getContinueCtaText$annotations() {
        }

        @InterfaceC37143h("skip_cta_text")
        public static /* synthetic */ void getSkipCtaText$annotations() {
        }

        @InterfaceC37143h("trial_items")
        public static /* synthetic */ void getTrialItems$annotations() {
        }

        @InterfaceC37143h("tutorial_content")
        public static /* synthetic */ void getTutorialContent$annotations() {
        }

        public static final /* synthetic */ void write$Self$refer_a_friend_release(Trials self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            RafHubType.write$Self(self, output, serialDesc);
            InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.title);
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.trialItems);
            output.encodeSerializableElement(serialDesc, 2, TrialsTutorialModel$$serializer.INSTANCE, self.tutorialContent);
            output.encodeStringElement(serialDesc, 3, self.skipCtaText);
            output.encodeStringElement(serialDesc, 4, self.continueCtaText);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final List<TrialsItemModel> component2() {
            return this.trialItems;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final TrialsTutorialModel getTutorialContent() {
            return this.tutorialContent;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getSkipCtaText() {
            return this.skipCtaText;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getContinueCtaText() {
            return this.continueCtaText;
        }

        public final Trials copy(String title, List<TrialsItemModel> trialItems, TrialsTutorialModel tutorialContent, String skipCtaText, String continueCtaText) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(trialItems, "trialItems");
            AbstractC22676k.m65750j(tutorialContent, "tutorialContent");
            AbstractC22676k.m65750j(skipCtaText, "skipCtaText");
            AbstractC22676k.m65750j(continueCtaText, "continueCtaText");
            return new Trials(title, trialItems, tutorialContent, skipCtaText, continueCtaText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Trials)) {
                return false;
            }
            Trials trials = (Trials) other;
            return AbstractC22676k.m65745e(this.title, trials.title) && AbstractC22676k.m65745e(this.trialItems, trials.trialItems) && AbstractC22676k.m65745e(this.tutorialContent, trials.tutorialContent) && AbstractC22676k.m65745e(this.skipCtaText, trials.skipCtaText) && AbstractC22676k.m65745e(this.continueCtaText, trials.continueCtaText);
        }

        public final String getContinueCtaText() {
            return this.continueCtaText;
        }

        public final String getSkipCtaText() {
            return this.skipCtaText;
        }

        public final String getTitle() {
            return this.title;
        }

        public final List<TrialsItemModel> getTrialItems() {
            return this.trialItems;
        }

        public final TrialsTutorialModel getTutorialContent() {
            return this.tutorialContent;
        }

        public int hashCode() {
            return this.continueCtaText.hashCode() + AbstractC11266d.m30450d((this.tutorialContent.hashCode() + AbstractC11895b.m31983b(this.title.hashCode() * 31, 31, this.trialItems)) * 31, 31, this.skipCtaText);
        }

        public String toString() {
            String str = this.title;
            List<TrialsItemModel> list = this.trialItems;
            TrialsTutorialModel trialsTutorialModel = this.tutorialContent;
            String str2 = this.skipCtaText;
            String str3 = this.continueCtaText;
            StringBuilder sbM94766o = AbstractC30802r.m94766o("Trials(title=", str, ", trialItems=", ", tutorialContent=", list);
            sbM94766o.append(trialsTutorialModel);
            sbM94766o.append(", skipCtaText=");
            sbM94766o.append(str2);
            sbM94766o.append(", continueCtaText=");
            return AbstractC25012a.m73376i(str3, ")", sbM94766o);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Trials(String title, List<TrialsItemModel> trialItems, TrialsTutorialModel tutorialContent, String skipCtaText, String continueCtaText) {
            super(null);
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(trialItems, "trialItems");
            AbstractC22676k.m65750j(tutorialContent, "tutorialContent");
            AbstractC22676k.m65750j(skipCtaText, "skipCtaText");
            AbstractC22676k.m65750j(continueCtaText, "continueCtaText");
            this.title = title;
            this.trialItems = trialItems;
            this.tutorialContent = tutorialContent;
            this.skipCtaText = skipCtaText;
            this.continueCtaText = continueCtaText;
        }
    }

    public /* synthetic */ RafHubType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _init_$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37142g("com.whoop.referafriend.domain.models.RafHubType", c22673i0.getOrCreateKotlinClass(RafHubType.class), new InterfaceC21461d[]{c22673i0.getOrCreateKotlinClass(Basic.class), c22673i0.getOrCreateKotlinClass(Full.class), c22673i0.getOrCreateKotlinClass(Trials.class)}, new InterfaceC37138c[]{RafHubType$Basic$$serializer.INSTANCE, RafHubType$Full$$serializer.INSTANCE, RafHubType$Trials$$serializer.INSTANCE}, new Annotation[0]);
    }

    public static final /* synthetic */ void write$Self(RafHubType self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
    }

    private RafHubType() {
    }

    public /* synthetic */ RafHubType(int i13, SerializationConstructorMarker serializationConstructorMarker) {
    }
}
