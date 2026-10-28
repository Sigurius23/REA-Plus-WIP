package com.whoop.advancedlabs.feature.hormonalcontext.domain.models;

import com.whoop.design.models.items.CardButtonModel;
import com.whoop.design.models.items.CardButtonModel$$serializer;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006,"}, m65681d2 = {"Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextBottomSheet;", "", "", "title", "content", "Lcom/whoop/design/models/items/CardButtonModel;", "primaryButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CardButtonModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CardButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextBottomSheet;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/items/CardButtonModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CardButtonModel;)Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextBottomSheet;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getContent", "Lcom/whoop/design/models/items/CardButtonModel;", "getPrimaryButton", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HormonalContextBottomSheet {
    private final String content;
    private final CardButtonModel primaryButton;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = CardButtonModel.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextBottomSheet$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextBottomSheet;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HormonalContextBottomSheet$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HormonalContextBottomSheet(int i13, String str, String str2, CardButtonModel cardButtonModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, HormonalContextBottomSheet$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.content = str2;
        this.primaryButton = cardButtonModel;
    }

    public static /* synthetic */ HormonalContextBottomSheet copy$default(HormonalContextBottomSheet hormonalContextBottomSheet, String str, String str2, CardButtonModel cardButtonModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = hormonalContextBottomSheet.title;
        }
        if ((i13 & 2) != 0) {
            str2 = hormonalContextBottomSheet.content;
        }
        if ((i13 & 4) != 0) {
            cardButtonModel = hormonalContextBottomSheet.primaryButton;
        }
        return hormonalContextBottomSheet.copy(str, str2, cardButtonModel);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(HormonalContextBottomSheet self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.content);
        output.encodeSerializableElement(serialDesc, 2, CardButtonModel$$serializer.INSTANCE, self.primaryButton);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CardButtonModel getPrimaryButton() {
        return this.primaryButton;
    }

    public final HormonalContextBottomSheet copy(String title, String content, CardButtonModel primaryButton) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(content, "content");
        AbstractC22676k.m65750j(primaryButton, "primaryButton");
        return new HormonalContextBottomSheet(title, content, primaryButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HormonalContextBottomSheet)) {
            return false;
        }
        HormonalContextBottomSheet hormonalContextBottomSheet = (HormonalContextBottomSheet) other;
        return AbstractC22676k.m65745e(this.title, hormonalContextBottomSheet.title) && AbstractC22676k.m65745e(this.content, hormonalContextBottomSheet.content) && AbstractC22676k.m65745e(this.primaryButton, hormonalContextBottomSheet.primaryButton);
    }

    public final String getContent() {
        return this.content;
    }

    public final CardButtonModel getPrimaryButton() {
        return this.primaryButton;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.primaryButton.hashCode() + AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.content);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.content;
        CardButtonModel cardButtonModel = this.primaryButton;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HormonalContextBottomSheet(title=", str, ", content=", str2, ", primaryButton=");
        sbM32001t.append(cardButtonModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public HormonalContextBottomSheet(String title, String content, CardButtonModel primaryButton) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(content, "content");
        AbstractC22676k.m65750j(primaryButton, "primaryButton");
        this.title = title;
        this.content = content;
        this.primaryButton = primaryButton;
    }
}
