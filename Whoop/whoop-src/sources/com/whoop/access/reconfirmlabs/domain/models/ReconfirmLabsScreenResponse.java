package com.whoop.access.reconfirmlabs.domain.models;

import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.InfoCalloutTileModel$$serializer;
import com.whoop.design.models.ProgressButtonModel;
import com.whoop.design.models.ProgressButtonModel$$serializer;
import com.whoop.design.models.tiles.EmptyTileModel;
import com.whoop.design.models.tiles.EmptyTileModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=>BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBa\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'JZ\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b4\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b5\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b7\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010'¨\u0006?"}, m65681d2 = {"Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;", "", "", "id", "imageUrl", "title", "subtitle", "Lcom/whoop/design/models/tiles/EmptyTileModel;", "tile", "Lcom/whoop/design/models/ProgressButtonModel;", "progressButton", "Lcom/whoop/design/models/InfoCalloutTileModel;", "callout", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/tiles/EmptyTileModel;Lcom/whoop/design/models/ProgressButtonModel;Lcom/whoop/design/models/InfoCalloutTileModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/tiles/EmptyTileModel;Lcom/whoop/design/models/ProgressButtonModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$access_release", "(Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/whoop/design/models/tiles/EmptyTileModel;", "component6", "()Lcom/whoop/design/models/ProgressButtonModel;", "component7", "()Lcom/whoop/design/models/InfoCalloutTileModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/tiles/EmptyTileModel;Lcom/whoop/design/models/ProgressButtonModel;Lcom/whoop/design/models/InfoCalloutTileModel;)Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getImageUrl", "getTitle", "getSubtitle", "Lcom/whoop/design/models/tiles/EmptyTileModel;", "getTile", "Lcom/whoop/design/models/ProgressButtonModel;", "getProgressButton", "Lcom/whoop/design/models/InfoCalloutTileModel;", "getCallout", "Companion", "$serializer", "a", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ReconfirmLabsScreenResponse {
    private final InfoCalloutTileModel callout;
    private final String id;
    private final String imageUrl;
    private final ProgressButtonModel progressButton;
    private final String subtitle;
    private final EmptyTileModel tile;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = (InfoCalloutTileModel.$stable | ProgressButtonModel.$stable) | EmptyTileModel.$stable;

    /* JADX INFO: renamed from: com.whoop.access.reconfirmlabs.domain.models.ReconfirmLabsScreenResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/access/reconfirmlabs/domain/models/ReconfirmLabsScreenResponse;", "serializer", "()Lwc3/c;", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ReconfirmLabsScreenResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ReconfirmLabsScreenResponse(int i13, String str, String str2, String str3, String str4, EmptyTileModel emptyTileModel, ProgressButtonModel progressButtonModel, InfoCalloutTileModel infoCalloutTileModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, ReconfirmLabsScreenResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.imageUrl = str2;
        this.title = str3;
        this.subtitle = str4;
        this.tile = emptyTileModel;
        this.progressButton = progressButtonModel;
        this.callout = infoCalloutTileModel;
    }

    public static /* synthetic */ ReconfirmLabsScreenResponse copy$default(ReconfirmLabsScreenResponse reconfirmLabsScreenResponse, String str, String str2, String str3, String str4, EmptyTileModel emptyTileModel, ProgressButtonModel progressButtonModel, InfoCalloutTileModel infoCalloutTileModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = reconfirmLabsScreenResponse.id;
        }
        if ((i13 & 2) != 0) {
            str2 = reconfirmLabsScreenResponse.imageUrl;
        }
        if ((i13 & 4) != 0) {
            str3 = reconfirmLabsScreenResponse.title;
        }
        if ((i13 & 8) != 0) {
            str4 = reconfirmLabsScreenResponse.subtitle;
        }
        if ((i13 & 16) != 0) {
            emptyTileModel = reconfirmLabsScreenResponse.tile;
        }
        if ((i13 & 32) != 0) {
            progressButtonModel = reconfirmLabsScreenResponse.progressButton;
        }
        if ((i13 & 64) != 0) {
            infoCalloutTileModel = reconfirmLabsScreenResponse.callout;
        }
        ProgressButtonModel progressButtonModel2 = progressButtonModel;
        InfoCalloutTileModel infoCalloutTileModel2 = infoCalloutTileModel;
        EmptyTileModel emptyTileModel2 = emptyTileModel;
        String str5 = str3;
        return reconfirmLabsScreenResponse.copy(str, str2, str5, str4, emptyTileModel2, progressButtonModel2, infoCalloutTileModel2);
    }

    public static final /* synthetic */ void write$Self$access_release(ReconfirmLabsScreenResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.imageUrl);
        output.encodeStringElement(serialDesc, 2, self.title);
        output.encodeStringElement(serialDesc, 3, self.subtitle);
        output.encodeSerializableElement(serialDesc, 4, EmptyTileModel$$serializer.INSTANCE, self.tile);
        output.encodeSerializableElement(serialDesc, 5, ProgressButtonModel$$serializer.INSTANCE, self.progressButton);
        output.encodeNullableSerializableElement(serialDesc, 6, InfoCalloutTileModel$$serializer.INSTANCE, self.callout);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
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
    public final EmptyTileModel getTile() {
        return this.tile;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ProgressButtonModel getProgressButton() {
        return this.progressButton;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final InfoCalloutTileModel getCallout() {
        return this.callout;
    }

    public final ReconfirmLabsScreenResponse copy(String id4, String imageUrl, String title, String subtitle, EmptyTileModel tile, ProgressButtonModel progressButton, InfoCalloutTileModel callout) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(tile, "tile");
        AbstractC22676k.m65750j(progressButton, "progressButton");
        return new ReconfirmLabsScreenResponse(id4, imageUrl, title, subtitle, tile, progressButton, callout);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReconfirmLabsScreenResponse)) {
            return false;
        }
        ReconfirmLabsScreenResponse reconfirmLabsScreenResponse = (ReconfirmLabsScreenResponse) other;
        return AbstractC22676k.m65745e(this.id, reconfirmLabsScreenResponse.id) && AbstractC22676k.m65745e(this.imageUrl, reconfirmLabsScreenResponse.imageUrl) && AbstractC22676k.m65745e(this.title, reconfirmLabsScreenResponse.title) && AbstractC22676k.m65745e(this.subtitle, reconfirmLabsScreenResponse.subtitle) && AbstractC22676k.m65745e(this.tile, reconfirmLabsScreenResponse.tile) && AbstractC22676k.m65745e(this.progressButton, reconfirmLabsScreenResponse.progressButton) && AbstractC22676k.m65745e(this.callout, reconfirmLabsScreenResponse.callout);
    }

    public final InfoCalloutTileModel getCallout() {
        return this.callout;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final ProgressButtonModel getProgressButton() {
        return this.progressButton;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final EmptyTileModel getTile() {
        return this.tile;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.imageUrl;
        int iHashCode2 = (this.progressButton.hashCode() + ((this.tile.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.title), 31, this.subtitle)) * 31)) * 31;
        InfoCalloutTileModel infoCalloutTileModel = this.callout;
        return iHashCode2 + (infoCalloutTileModel != null ? infoCalloutTileModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.imageUrl;
        String str3 = this.title;
        String str4 = this.subtitle;
        EmptyTileModel emptyTileModel = this.tile;
        ProgressButtonModel progressButtonModel = this.progressButton;
        InfoCalloutTileModel infoCalloutTileModel = this.callout;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ReconfirmLabsScreenResponse(id=", str, ", imageUrl=", str2, ", title=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", subtitle=", str4, ", tile=");
        sbM32001t.append(emptyTileModel);
        sbM32001t.append(", progressButton=");
        sbM32001t.append(progressButtonModel);
        sbM32001t.append(", callout=");
        sbM32001t.append(infoCalloutTileModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ReconfirmLabsScreenResponse(String id4, String str, String title, String subtitle, EmptyTileModel tile, ProgressButtonModel progressButton, InfoCalloutTileModel infoCalloutTileModel) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(tile, "tile");
        AbstractC22676k.m65750j(progressButton, "progressButton");
        this.id = id4;
        this.imageUrl = str;
        this.title = title;
        this.subtitle = subtitle;
        this.tile = tile;
        this.progressButton = progressButton;
        this.callout = infoCalloutTileModel;
    }
}
