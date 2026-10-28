package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import md1.C25452a;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001b¨\u0006-"}, m65681d2 = {"Lcom/whoop/design/models/items/GlassTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "title", "description", "", "icon", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/GlassTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "()Ljava/lang/String;", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Lcom/whoop/design/models/items/GlassTileModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getTitle", "getDescription", "Ljava/lang/String;", "getIcon", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GlassTileModel implements DesignSystemModel {
    private final TextResource description;
    private final String icon;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/GlassTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/GlassTileModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GlassTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public GlassTileModel() {
        this((TextResource) null, (TextResource) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ GlassTileModel copy$default(GlassTileModel glassTileModel, TextResource textResource, TextResource textResource2, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = glassTileModel.title;
        }
        if ((i13 & 2) != 0) {
            textResource2 = glassTileModel.description;
        }
        if ((i13 & 4) != 0) {
            str = glassTileModel.icon;
        }
        return glassTileModel.copy(textResource, textResource2, str);
    }

    public static final /* synthetic */ void write$Self$design_models_release(GlassTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.title, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 0, C25452a.f99689a, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.description, AbstractC8693b.m21267a())) {
            output.encodeSerializableElement(serialDesc, 1, C25452a.f99689a, self.description);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && AbstractC22676k.m65745e(self.icon, "")) {
            return;
        }
        output.encodeStringElement(serialDesc, 2, self.icon);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    public final GlassTileModel copy(TextResource title, TextResource description, String icon) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(icon, "icon");
        return new GlassTileModel(title, description, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlassTileModel)) {
            return false;
        }
        GlassTileModel glassTileModel = (GlassTileModel) other;
        return AbstractC22676k.m65745e(this.title, glassTileModel.title) && AbstractC22676k.m65745e(this.description, glassTileModel.description) && AbstractC22676k.m65745e(this.icon, glassTileModel.icon);
    }

    public final TextResource getDescription() {
        return this.description;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.icon.hashCode() + AbstractC31061c.m95625a(this.title.hashCode() * 31, this.description, 31);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.icon, ")", AbstractC33745d.m106658q("GlassTileModel(title=", this.title, ", description=", this.description, ", icon="));
    }

    public /* synthetic */ GlassTileModel(int i13, TextResource textResource, TextResource textResource2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.title = (i13 & 1) == 0 ? AbstractC8693b.m21267a() : textResource;
        if ((i13 & 2) == 0) {
            this.description = AbstractC8693b.m21267a();
        } else {
            this.description = textResource2;
        }
        if ((i13 & 4) == 0) {
            this.icon = "";
        } else {
            this.icon = str;
        }
    }

    public GlassTileModel(TextResource title, TextResource description, String icon) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(icon, "icon");
        this.title = title;
        this.description = description;
        this.icon = icon;
    }

    public /* synthetic */ GlassTileModel(TextResource textResource, TextResource textResource2, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 4) != 0 ? "" : str);
    }
}
