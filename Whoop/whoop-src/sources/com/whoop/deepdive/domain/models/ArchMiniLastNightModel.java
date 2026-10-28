package com.whoop.deepdive.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.HeaderModel;
import com.whoop.design.models.items.HeaderModel$$serializer;
import com.whoop.design.models.items.HeaderStyle;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006*"}, m65681d2 = {"Lcom/whoop/deepdive/domain/models/ArchMiniLastNightModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "path", "Lcom/whoop/design/models/items/HeaderModel;", "headerSection", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/items/HeaderModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/items/HeaderModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$deep_dive_release", "(Lcom/whoop/deepdive/domain/models/ArchMiniLastNightModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/items/HeaderModel;", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/items/HeaderModel;)Lcom/whoop/deepdive/domain/models/ArchMiniLastNightModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPath", "Lcom/whoop/design/models/items/HeaderModel;", "getHeaderSection", "Companion", "$serializer", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ArchMiniLastNightModel implements DesignSystemModel {
    private final HeaderModel headerSection;
    private final String path;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = HeaderModel.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/deepdive/domain/models/ArchMiniLastNightModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/deepdive/domain/models/ArchMiniLastNightModel;", "serializer", "()Lwc3/c;", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ArchMiniLastNightModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArchMiniLastNightModel() {
        this((String) null, (HeaderModel) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ ArchMiniLastNightModel copy$default(ArchMiniLastNightModel archMiniLastNightModel, String str, HeaderModel headerModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = archMiniLastNightModel.path;
        }
        if ((i13 & 2) != 0) {
            headerModel = archMiniLastNightModel.headerSection;
        }
        return archMiniLastNightModel.copy(str, headerModel);
    }

    public static final /* synthetic */ void write$Self$deep_dive_release(ArchMiniLastNightModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.path, "")) {
            output.encodeStringElement(serialDesc, 0, self.path);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1)) {
            if (AbstractC22676k.m65745e(self.headerSection, new HeaderModel((String) null, (TextResource) null, (TextResource) null, (TextResource) null, (TextResource) null, (String) null, (String) null, (String) null, (HeaderStyle) null, (String) null, (String) null, (String) null, false, (C9598e) null, (TextResource) null, 32767, (DefaultConstructorMarker) null))) {
                return;
            }
        }
        output.encodeSerializableElement(serialDesc, 1, HeaderModel$$serializer.INSTANCE, self.headerSection);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HeaderModel getHeaderSection() {
        return this.headerSection;
    }

    public final ArchMiniLastNightModel copy(String path, HeaderModel headerSection) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(headerSection, "headerSection");
        return new ArchMiniLastNightModel(path, headerSection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArchMiniLastNightModel)) {
            return false;
        }
        ArchMiniLastNightModel archMiniLastNightModel = (ArchMiniLastNightModel) other;
        return AbstractC22676k.m65745e(this.path, archMiniLastNightModel.path) && AbstractC22676k.m65745e(this.headerSection, archMiniLastNightModel.headerSection);
    }

    public final HeaderModel getHeaderSection() {
        return this.headerSection;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return this.headerSection.hashCode() + (this.path.hashCode() * 31);
    }

    public String toString() {
        return "ArchMiniLastNightModel(path=" + this.path + ", headerSection=" + this.headerSection + ")";
    }

    public /* synthetic */ ArchMiniLastNightModel(int i13, String str, HeaderModel headerModel, SerializationConstructorMarker serializationConstructorMarker) {
        this.path = (i13 & 1) == 0 ? "" : str;
        if ((i13 & 2) == 0) {
            this.headerSection = new HeaderModel((String) null, (TextResource) null, (TextResource) null, (TextResource) null, (TextResource) null, (String) null, (String) null, (String) null, (HeaderStyle) null, (String) null, (String) null, (String) null, false, (C9598e) null, (TextResource) null, 32767, (DefaultConstructorMarker) null);
        } else {
            this.headerSection = headerModel;
        }
    }

    public ArchMiniLastNightModel(String path, HeaderModel headerSection) {
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(headerSection, "headerSection");
        this.path = path;
        this.headerSection = headerSection;
    }

    public /* synthetic */ ArchMiniLastNightModel(String str, HeaderModel headerModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? new HeaderModel((String) null, (TextResource) null, (TextResource) null, (TextResource) null, (TextResource) null, (String) null, (String) null, (String) null, (HeaderStyle) null, (String) null, (String) null, (String) null, false, (C9598e) null, (TextResource) null, 32767, (DefaultConstructorMarker) null) : headerModel);
    }
}
