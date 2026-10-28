package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import md1.C25452a;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0018R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001b¨\u00060"}, m65681d2 = {"Lcom/whoop/design/models/items/DividerModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "dividerType", "headerPosition", "Lcom/whoop/design/util/TextResource;", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/DividerModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/util/TextResource;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/models/items/DividerModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDividerType", "getDividerType$annotations", "()V", "getHeaderPosition", "getHeaderPosition$annotations", "Lcom/whoop/design/util/TextResource;", "getTitle", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DividerModel implements DesignSystemModel {
    private final String dividerType;
    private final String headerPosition;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/DividerModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/DividerModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DividerModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public DividerModel() {
        this((String) null, (String) null, (TextResource) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ DividerModel copy$default(DividerModel dividerModel, String str, String str2, TextResource textResource, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = dividerModel.dividerType;
        }
        if ((i13 & 2) != 0) {
            str2 = dividerModel.headerPosition;
        }
        if ((i13 & 4) != 0) {
            textResource = dividerModel.title;
        }
        return dividerModel.copy(str, str2, textResource);
    }

    @InterfaceC37143h("divider_type")
    public static /* synthetic */ void getDividerType$annotations() {
    }

    @InterfaceC37143h("header_position")
    public static /* synthetic */ void getHeaderPosition$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(DividerModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.dividerType, "SOLID")) {
            output.encodeStringElement(serialDesc, 0, self.dividerType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.headerPosition != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.headerPosition);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && AbstractC22676k.m65745e(self.title, AbstractC8693b.m21267a())) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 2, C25452a.f99689a, self.title);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDividerType() {
        return this.dividerType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHeaderPosition() {
        return this.headerPosition;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public final DividerModel copy(String dividerType, String headerPosition, TextResource title) {
        AbstractC22676k.m65750j(dividerType, "dividerType");
        AbstractC22676k.m65750j(title, "title");
        return new DividerModel(dividerType, headerPosition, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DividerModel)) {
            return false;
        }
        DividerModel dividerModel = (DividerModel) other;
        return AbstractC22676k.m65745e(this.dividerType, dividerModel.dividerType) && AbstractC22676k.m65745e(this.headerPosition, dividerModel.headerPosition) && AbstractC22676k.m65745e(this.title, dividerModel.title);
    }

    public final String getDividerType() {
        return this.dividerType;
    }

    public final String getHeaderPosition() {
        return this.headerPosition;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.dividerType.hashCode() * 31;
        String str = this.headerPosition;
        return this.title.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.dividerType;
        String str2 = this.headerPosition;
        return AbstractC30007c.m91841k(AbstractC11895b.m32001t("DividerModel(dividerType=", str, ", headerPosition=", str2, ", title="), this.title, ")");
    }

    public /* synthetic */ DividerModel(int i13, String str, String str2, TextResource textResource, SerializationConstructorMarker serializationConstructorMarker) {
        this.dividerType = (i13 & 1) == 0 ? "SOLID" : str;
        if ((i13 & 2) == 0) {
            this.headerPosition = null;
        } else {
            this.headerPosition = str2;
        }
        if ((i13 & 4) == 0) {
            this.title = AbstractC8693b.m21267a();
        } else {
            this.title = textResource;
        }
    }

    public DividerModel(String dividerType, String str, TextResource title) {
        AbstractC22676k.m65750j(dividerType, "dividerType");
        AbstractC22676k.m65750j(title, "title");
        this.dividerType = dividerType;
        this.headerPosition = str;
        this.title = title;
    }

    public /* synthetic */ DividerModel(String str, String str2, TextResource textResource, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "SOLID" : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource);
    }
}
