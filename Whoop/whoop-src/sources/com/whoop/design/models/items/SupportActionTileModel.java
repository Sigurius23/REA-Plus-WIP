package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.UUID;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import md1.C25452a;
import o91.C27690g;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B8\u0012\u001b\b\u0002\u0010\u0007\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB9\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001c\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010!JA\u0010\"\u001a\u00020\u00002\u001b\b\u0002\u0010\u0007\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R*\u0010\u0007\u001a\u00150\u0002j\u0002`\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010!¨\u00064"}, m65681d2 = {"Lcom/whoop/design/models/items/SupportActionTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Ljava/util/UUID;", "Lcom/whoop/design/json/serializers/SerializableUUID;", "Lwc3/i;", "with", "Lo91/g;", "id", "", "icon", "Lcom/whoop/design/util/TextResource;", "title", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/whoop/design/util/TextResource;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/UUID;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/SupportActionTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/UUID;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/whoop/design/util/TextResource;", "copy", "(Ljava/util/UUID;Ljava/lang/String;Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/models/items/SupportActionTileModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getId", "Ljava/lang/String;", "getIcon", "Lcom/whoop/design/util/TextResource;", "getTitle", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SupportActionTileModel implements DesignSystemModel {
    private final String icon;
    private final UUID id;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/SupportActionTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/SupportActionTileModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SupportActionTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SupportActionTileModel() {
        this((UUID) null, (String) null, (TextResource) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SupportActionTileModel copy$default(SupportActionTileModel supportActionTileModel, UUID uuid, String str, TextResource textResource, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            uuid = supportActionTileModel.id;
        }
        if ((i13 & 2) != 0) {
            str = supportActionTileModel.icon;
        }
        if ((i13 & 4) != 0) {
            textResource = supportActionTileModel.title;
        }
        return supportActionTileModel.copy(uuid, str, textResource);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public static final /* synthetic */ void write$Self$design_models_release(SupportActionTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0)) {
            output.encodeSerializableElement(serialDesc, 0, C27690g.f111466a, self.id);
        } else {
            UUID uuid = self.id;
            UUID uuidRandomUUID = UUID.randomUUID();
            AbstractC22676k.m65749i(uuidRandomUUID, "randomUUID(...)");
            if (!AbstractC22676k.m65745e(uuid, uuidRandomUUID)) {
                output.encodeSerializableElement(serialDesc, 0, C27690g.f111466a, self.id);
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.icon, "")) {
            output.encodeStringElement(serialDesc, 1, self.icon);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && AbstractC22676k.m65745e(self.title, AbstractC8693b.m21267a())) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 2, C25452a.f99689a, self.title);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public final SupportActionTileModel copy(UUID id4, String icon, TextResource title) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        return new SupportActionTileModel(id4, icon, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportActionTileModel)) {
            return false;
        }
        SupportActionTileModel supportActionTileModel = (SupportActionTileModel) other;
        return AbstractC22676k.m65745e(this.id, supportActionTileModel.id) && AbstractC22676k.m65745e(this.icon, supportActionTileModel.icon) && AbstractC22676k.m65745e(this.title, supportActionTileModel.title);
    }

    public final String getIcon() {
        return this.icon;
    }

    public final UUID getId() {
        return this.id;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.icon);
    }

    public String toString() {
        UUID uuid = this.id;
        String str = this.icon;
        TextResource textResource = this.title;
        StringBuilder sb4 = new StringBuilder("SupportActionTileModel(id=");
        sb4.append(uuid);
        sb4.append(", icon=");
        sb4.append(str);
        sb4.append(", title=");
        return AbstractC30007c.m91841k(sb4, textResource, ")");
    }

    public /* synthetic */ SupportActionTileModel(int i13, UUID uuid, String str, TextResource textResource, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            uuid = UUID.randomUUID();
            AbstractC22676k.m65749i(uuid, "randomUUID(...)");
        }
        this.id = uuid;
        if ((i13 & 2) == 0) {
            this.icon = "";
        } else {
            this.icon = str;
        }
        if ((i13 & 4) == 0) {
            this.title = AbstractC8693b.m21267a();
        } else {
            this.title = textResource;
        }
    }

    public SupportActionTileModel(UUID id4, String icon, TextResource title) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        this.id = id4;
        this.icon = icon;
        this.title = title;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SupportActionTileModel(UUID uuid, String str, TextResource textResource, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 1) != 0) {
            uuid = UUID.randomUUID();
            AbstractC22676k.m65749i(uuid, "randomUUID(...)");
        }
        this(uuid, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource);
    }
}
