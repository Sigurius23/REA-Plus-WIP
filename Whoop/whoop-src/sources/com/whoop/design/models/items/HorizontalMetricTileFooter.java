package com.whoop.design.models.items;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import md1.C25452a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ<\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b,\u0010\u001c¨\u0006/"}, m65681d2 = {"Lcom/whoop/design/models/items/HorizontalMetricTileFooter;", "", "Lcom/whoop/design/util/TextResource;", "startTitle", "endTitle", "", "icon", NotificationCompat.CATEGORY_STATUS, "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/HorizontalMetricTileFooter;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "()Ljava/lang/String;", "component4", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/HorizontalMetricTileFooter;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getStartTitle", "getEndTitle", "Ljava/lang/String;", "getIcon", "getStatus", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HorizontalMetricTileFooter {
    private final TextResource endTitle;
    private final String icon;
    private final TextResource startTitle;
    private final String status;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/HorizontalMetricTileFooter$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/HorizontalMetricTileFooter;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HorizontalMetricTileFooter$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HorizontalMetricTileFooter(int i13, TextResource textResource, TextResource textResource2, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, HorizontalMetricTileFooter$$serializer.INSTANCE.getDescriptor());
        }
        this.startTitle = textResource;
        this.endTitle = textResource2;
        this.icon = str;
        this.status = str2;
    }

    public static /* synthetic */ HorizontalMetricTileFooter copy$default(HorizontalMetricTileFooter horizontalMetricTileFooter, TextResource textResource, TextResource textResource2, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = horizontalMetricTileFooter.startTitle;
        }
        if ((i13 & 2) != 0) {
            textResource2 = horizontalMetricTileFooter.endTitle;
        }
        if ((i13 & 4) != 0) {
            str = horizontalMetricTileFooter.icon;
        }
        if ((i13 & 8) != 0) {
            str2 = horizontalMetricTileFooter.status;
        }
        return horizontalMetricTileFooter.copy(textResource, textResource2, str, str2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(HorizontalMetricTileFooter self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        C25452a c25452a = C25452a.f99689a;
        output.encodeNullableSerializableElement(serialDesc, 0, c25452a, self.startTitle);
        output.encodeNullableSerializableElement(serialDesc, 1, c25452a, self.endTitle);
        output.encodeStringElement(serialDesc, 2, self.icon);
        output.encodeStringElement(serialDesc, 3, self.status);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getStartTitle() {
        return this.startTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getEndTitle() {
        return this.endTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final HorizontalMetricTileFooter copy(TextResource startTitle, TextResource endTitle, String icon, String status) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(status, "status");
        return new HorizontalMetricTileFooter(startTitle, endTitle, icon, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HorizontalMetricTileFooter)) {
            return false;
        }
        HorizontalMetricTileFooter horizontalMetricTileFooter = (HorizontalMetricTileFooter) other;
        return AbstractC22676k.m65745e(this.startTitle, horizontalMetricTileFooter.startTitle) && AbstractC22676k.m65745e(this.endTitle, horizontalMetricTileFooter.endTitle) && AbstractC22676k.m65745e(this.icon, horizontalMetricTileFooter.icon) && AbstractC22676k.m65745e(this.status, horizontalMetricTileFooter.status);
    }

    public final TextResource getEndTitle() {
        return this.endTitle;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final TextResource getStartTitle() {
        return this.startTitle;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        TextResource textResource = this.startTitle;
        int iHashCode = (textResource == null ? 0 : textResource.hashCode()) * 31;
        TextResource textResource2 = this.endTitle;
        return this.status.hashCode() + AbstractC11266d.m30450d((iHashCode + (textResource2 != null ? textResource2.hashCode() : 0)) * 31, 31, this.icon);
    }

    public String toString() {
        TextResource textResource = this.startTitle;
        TextResource textResource2 = this.endTitle;
        return AbstractC11266d.m30464r(AbstractC33745d.m106658q("HorizontalMetricTileFooter(startTitle=", textResource, ", endTitle=", textResource2, ", icon="), this.icon, ", status=", this.status, ")");
    }

    public HorizontalMetricTileFooter(TextResource textResource, TextResource textResource2, String icon, String status) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(status, "status");
        this.startTitle = textResource;
        this.endTitle = textResource2;
        this.icon = icon;
        this.status = status;
    }
}
