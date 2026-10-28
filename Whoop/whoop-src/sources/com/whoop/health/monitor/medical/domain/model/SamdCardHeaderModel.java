package com.whoop.health.monitor.medical.domain.model;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import wi0.C37312d;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 02\u00020\u0001:\u000210B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ>\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b-\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001f¨\u00062"}, m65681d2 = {"Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;", "", "Lcom/whoop/design/util/TextResource;", "title", "", "subtitle", "icon", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$kennel_release", "(Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/whoop/navigation/e;", "copy", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getTitle", "Ljava/lang/String;", "getSubtitle", "getIcon", "Lcom/whoop/navigation/e;", "getDestination", "Companion", "$serializer", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SamdCardHeaderModel {
    private final C9598e destination;
    private final String icon;
    private final String subtitle;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d | TextResource.$stable;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C37312d(9))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/health/monitor/medical/domain/model/SamdCardHeaderModel;", "serializer", "()Lwc3/c;", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SamdCardHeaderModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SamdCardHeaderModel() {
        this((TextResource) null, (String) null, (String) null, (C9598e) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ SamdCardHeaderModel copy$default(SamdCardHeaderModel samdCardHeaderModel, TextResource textResource, String str, String str2, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = samdCardHeaderModel.title;
        }
        if ((i13 & 2) != 0) {
            str = samdCardHeaderModel.subtitle;
        }
        if ((i13 & 4) != 0) {
            str2 = samdCardHeaderModel.icon;
        }
        if ((i13 & 8) != 0) {
            c9598e = samdCardHeaderModel.destination;
        }
        return samdCardHeaderModel.copy(textResource, str, str2, c9598e);
    }

    public static final /* synthetic */ void write$Self$kennel_release(SamdCardHeaderModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.title, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 0, C25452a.f99689a, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.subtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.icon);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.destination == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final SamdCardHeaderModel copy(TextResource title, String subtitle, String icon, C9598e destination) {
        AbstractC22676k.m65750j(title, "title");
        return new SamdCardHeaderModel(title, subtitle, icon, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SamdCardHeaderModel)) {
            return false;
        }
        SamdCardHeaderModel samdCardHeaderModel = (SamdCardHeaderModel) other;
        return AbstractC22676k.m65745e(this.title, samdCardHeaderModel.title) && AbstractC22676k.m65745e(this.subtitle, samdCardHeaderModel.subtitle) && AbstractC22676k.m65745e(this.icon, samdCardHeaderModel.icon) && AbstractC22676k.m65745e(this.destination, samdCardHeaderModel.destination);
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C9598e c9598e = this.destination;
        return iHashCode3 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        String str = this.subtitle;
        return AbstractC13673n.m38563j(AbstractC30007c.m91845o("SamdCardHeaderModel(title=", textResource, ", subtitle=", str, ", icon="), this.icon, ", destination=", this.destination, ")");
    }

    public /* synthetic */ SamdCardHeaderModel(int i13, TextResource textResource, String str, String str2, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        this.title = (i13 & 1) == 0 ? AbstractC8693b.m21267a() : textResource;
        if ((i13 & 2) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str;
        }
        if ((i13 & 4) == 0) {
            this.icon = null;
        } else {
            this.icon = str2;
        }
        if ((i13 & 8) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
    }

    public SamdCardHeaderModel(TextResource title, String str, String str2, C9598e c9598e) {
        AbstractC22676k.m65750j(title, "title");
        this.title = title;
        this.subtitle = str;
        this.icon = str2;
        this.destination = c9598e;
    }

    public /* synthetic */ SamdCardHeaderModel(TextResource textResource, String str, String str2, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : c9598e);
    }
}
