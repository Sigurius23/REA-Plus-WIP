package com.whoop.universalcheckout.features.receipt.domain.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001b¨\u0006-"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReimbursementTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "subtitle", "Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReimbursementTile;", "tile", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReimbursementTile;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReimbursementTile;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReimbursementTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReimbursementTile;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReimbursementTile;)Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReimbursementTileModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReimbursementTile;", "getTile", "Companion", "$serializer", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ReimbursementTileModel implements DesignSystemModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String subtitle;
    private final ReimbursementTile tile;
    private final String title;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReimbursementTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/receipt/domain/models/items/ReimbursementTileModel;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ReimbursementTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ReimbursementTileModel(int i13, String str, String str2, ReimbursementTile reimbursementTile, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, ReimbursementTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.subtitle = str2;
        this.tile = reimbursementTile;
    }

    public static /* synthetic */ ReimbursementTileModel copy$default(ReimbursementTileModel reimbursementTileModel, String str, String str2, ReimbursementTile reimbursementTile, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = reimbursementTileModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = reimbursementTileModel.subtitle;
        }
        if ((i13 & 4) != 0) {
            reimbursementTile = reimbursementTileModel.tile;
        }
        return reimbursementTileModel.copy(str, str2, reimbursementTile);
    }

    public static final /* synthetic */ void write$Self$universal_checkout_release(ReimbursementTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.subtitle);
        output.encodeSerializableElement(serialDesc, 2, ReimbursementTile$$serializer.INSTANCE, self.tile);
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
    public final ReimbursementTile getTile() {
        return this.tile;
    }

    public final ReimbursementTileModel copy(String title, String subtitle, ReimbursementTile tile) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(tile, "tile");
        return new ReimbursementTileModel(title, subtitle, tile);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReimbursementTileModel)) {
            return false;
        }
        ReimbursementTileModel reimbursementTileModel = (ReimbursementTileModel) other;
        return AbstractC22676k.m65745e(this.title, reimbursementTileModel.title) && AbstractC22676k.m65745e(this.subtitle, reimbursementTileModel.subtitle) && AbstractC22676k.m65745e(this.tile, reimbursementTileModel.tile);
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final ReimbursementTile getTile() {
        return this.tile;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.tile.hashCode() + AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        ReimbursementTile reimbursementTile = this.tile;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ReimbursementTileModel(title=", str, ", subtitle=", str2, ", tile=");
        sbM32001t.append(reimbursementTile);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ReimbursementTileModel(String title, String subtitle, ReimbursementTile tile) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(tile, "tile");
        this.title = title;
        this.subtitle = subtitle;
        this.tile = tile;
    }
}
