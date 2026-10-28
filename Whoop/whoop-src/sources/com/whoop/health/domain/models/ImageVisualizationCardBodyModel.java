package com.whoop.health.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import sh2.C32513d;
import te0.AbstractC33745d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 22\u00020\u0001:\u000232B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J@\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010 ¨\u00064"}, m65681d2 = {"Lcom/whoop/health/domain/models/ImageVisualizationCardBodyModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "subtitle", "title", "", "Lcom/whoop/health/domain/models/ImageVisualizationTrend;", "trends", "", "imageUrl", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$health_release", "(Lcom/whoop/health/domain/models/ImageVisualizationCardBodyModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/String;", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;)Lcom/whoop/health/domain/models/ImageVisualizationCardBodyModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getSubtitle", "getTitle", "Ljava/util/List;", "getTrends", "Ljava/lang/String;", "getImageUrl", "Companion", "$serializer", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ImageVisualizationCardBodyModel implements DesignSystemModel {
    private final String imageUrl;
    private final TextResource subtitle;
    private final TextResource title;
    private final List<ImageVisualizationTrend> trends;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C32513d(9)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/health/domain/models/ImageVisualizationCardBodyModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/health/domain/models/ImageVisualizationCardBodyModel;", "serializer", "()Lwc3/c;", "health_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ImageVisualizationCardBodyModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ImageVisualizationCardBodyModel(int i13, TextResource textResource, TextResource textResource2, List list, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, ImageVisualizationCardBodyModel$$serializer.INSTANCE.getDescriptor());
        }
        this.subtitle = textResource;
        this.title = textResource2;
        this.trends = list;
        this.imageUrl = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ImageVisualizationTrend$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImageVisualizationCardBodyModel copy$default(ImageVisualizationCardBodyModel imageVisualizationCardBodyModel, TextResource textResource, TextResource textResource2, List list, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = imageVisualizationCardBodyModel.subtitle;
        }
        if ((i13 & 2) != 0) {
            textResource2 = imageVisualizationCardBodyModel.title;
        }
        if ((i13 & 4) != 0) {
            list = imageVisualizationCardBodyModel.trends;
        }
        if ((i13 & 8) != 0) {
            str = imageVisualizationCardBodyModel.imageUrl;
        }
        return imageVisualizationCardBodyModel.copy(textResource, textResource2, list, str);
    }

    public static final /* synthetic */ void write$Self$health_release(ImageVisualizationCardBodyModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        C25452a c25452a = C25452a.f99689a;
        output.encodeNullableSerializableElement(serialDesc, 0, c25452a, self.subtitle);
        output.encodeSerializableElement(serialDesc, 1, c25452a, self.title);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.trends);
        output.encodeStringElement(serialDesc, 3, self.imageUrl);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public final List<ImageVisualizationTrend> component3() {
        return this.trends;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final ImageVisualizationCardBodyModel copy(TextResource subtitle, TextResource title, List<ImageVisualizationTrend> trends, String imageUrl) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(trends, "trends");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        return new ImageVisualizationCardBodyModel(subtitle, title, trends, imageUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageVisualizationCardBodyModel)) {
            return false;
        }
        ImageVisualizationCardBodyModel imageVisualizationCardBodyModel = (ImageVisualizationCardBodyModel) other;
        return AbstractC22676k.m65745e(this.subtitle, imageVisualizationCardBodyModel.subtitle) && AbstractC22676k.m65745e(this.title, imageVisualizationCardBodyModel.title) && AbstractC22676k.m65745e(this.trends, imageVisualizationCardBodyModel.trends) && AbstractC22676k.m65745e(this.imageUrl, imageVisualizationCardBodyModel.imageUrl);
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public final List<ImageVisualizationTrend> getTrends() {
        return this.trends;
    }

    public int hashCode() {
        TextResource textResource = this.subtitle;
        return this.imageUrl.hashCode() + AbstractC11895b.m31983b(AbstractC31061c.m95625a((textResource == null ? 0 : textResource.hashCode()) * 31, this.title, 31), 31, this.trends);
    }

    public String toString() {
        TextResource textResource = this.subtitle;
        TextResource textResource2 = this.title;
        return AbstractC38963t7.m124377g(", imageUrl=", this.imageUrl, ")", AbstractC33745d.m106658q("ImageVisualizationCardBodyModel(subtitle=", textResource, ", title=", textResource2, ", trends="), this.trends);
    }

    public ImageVisualizationCardBodyModel(TextResource textResource, TextResource title, List<ImageVisualizationTrend> trends, String imageUrl) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(trends, "trends");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        this.subtitle = textResource;
        this.title = title;
        this.trends = trends;
        this.imageUrl = imageUrl;
    }
}
