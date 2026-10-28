package com.whoop.sage.domain.models;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.models.items.TagModel$$serializer;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import dx2.C12430a;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JP\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010 R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b3\u0010\u001cR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00104\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010#¨\u0006:"}, m65681d2 = {"Lcom/whoop/sage/domain/models/SageBottomSheetModel;", "", "", "icon", "title", "description", "Lcom/whoop/design/models/items/TagModel;", "tag", "buttonText", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sage_release", "(Lcom/whoop/sage/domain/models/SageBottomSheetModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/design/models/items/TagModel;", "component5", "component6", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/sage/domain/models/SageBottomSheetModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "getTitle", "getDescription", "Lcom/whoop/design/models/items/TagModel;", "getTag", "getButtonText", "Lcom/whoop/navigation/e;", "getNavigation", "getNavigation$annotations", "()V", "Companion", "$serializer", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SageBottomSheetModel {
    private final String buttonText;
    private final String description;
    private final String icon;
    private final C9598e navigation;
    private final TagModel tag;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d | TagModel.$stable;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C12430a(22))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sage/domain/models/SageBottomSheetModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sage/domain/models/SageBottomSheetModel;", "serializer", "()Lwc3/c;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SageBottomSheetModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SageBottomSheetModel(int i13, String str, String str2, String str3, TagModel tagModel, String str4, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, SageBottomSheetModel$$serializer.INSTANCE.getDescriptor());
        }
        this.icon = str;
        this.title = str2;
        this.description = str3;
        this.tag = tagModel;
        this.buttonText = str4;
        if ((i13 & 32) == 0) {
            this.navigation = null;
        } else {
            this.navigation = c9598e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ SageBottomSheetModel copy$default(SageBottomSheetModel sageBottomSheetModel, String str, String str2, String str3, TagModel tagModel, String str4, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sageBottomSheetModel.icon;
        }
        if ((i13 & 2) != 0) {
            str2 = sageBottomSheetModel.title;
        }
        if ((i13 & 4) != 0) {
            str3 = sageBottomSheetModel.description;
        }
        if ((i13 & 8) != 0) {
            tagModel = sageBottomSheetModel.tag;
        }
        if ((i13 & 16) != 0) {
            str4 = sageBottomSheetModel.buttonText;
        }
        if ((i13 & 32) != 0) {
            c9598e = sageBottomSheetModel.navigation;
        }
        String str5 = str4;
        C9598e c9598e2 = c9598e;
        return sageBottomSheetModel.copy(str, str2, str3, tagModel, str5, c9598e2);
    }

    public static /* synthetic */ void getNavigation$annotations() {
    }

    public static final /* synthetic */ void write$Self$sage_release(SageBottomSheetModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.icon);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.description);
        output.encodeNullableSerializableElement(serialDesc, 3, TagModel$$serializer.INSTANCE, self.tag);
        output.encodeStringElement(serialDesc, 4, self.buttonText);
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.navigation == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.navigation);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TagModel getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final C9598e getNavigation() {
        return this.navigation;
    }

    public final SageBottomSheetModel copy(String icon, String title, String description, TagModel tag, String buttonText, C9598e navigation) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(buttonText, "buttonText");
        return new SageBottomSheetModel(icon, title, description, tag, buttonText, navigation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SageBottomSheetModel)) {
            return false;
        }
        SageBottomSheetModel sageBottomSheetModel = (SageBottomSheetModel) other;
        return AbstractC22676k.m65745e(this.icon, sageBottomSheetModel.icon) && AbstractC22676k.m65745e(this.title, sageBottomSheetModel.title) && AbstractC22676k.m65745e(this.description, sageBottomSheetModel.description) && AbstractC22676k.m65745e(this.tag, sageBottomSheetModel.tag) && AbstractC22676k.m65745e(this.buttonText, sageBottomSheetModel.buttonText) && AbstractC22676k.m65745e(this.navigation, sageBottomSheetModel.navigation);
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final C9598e getNavigation() {
        return this.navigation;
    }

    public final TagModel getTag() {
        return this.tag;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.icon.hashCode() * 31, 31, this.title), 31, this.description);
        TagModel tagModel = this.tag;
        int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (tagModel == null ? 0 : tagModel.hashCode())) * 31, 31, this.buttonText);
        C9598e c9598e = this.navigation;
        return iM30450d2 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        String str = this.icon;
        String str2 = this.title;
        String str3 = this.description;
        TagModel tagModel = this.tag;
        String str4 = this.buttonText;
        C9598e c9598e = this.navigation;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SageBottomSheetModel(icon=", str, ", title=", str2, ", description=");
        sbM32001t.append(str3);
        sbM32001t.append(", tag=");
        sbM32001t.append(tagModel);
        sbM32001t.append(", buttonText=");
        return AbstractC13673n.m38563j(sbM32001t, str4, ", navigation=", c9598e, ")");
    }

    public SageBottomSheetModel(String icon, String title, String description, TagModel tagModel, String buttonText, C9598e c9598e) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(buttonText, "buttonText");
        this.icon = icon;
        this.title = title;
        this.description = description;
        this.tag = tagModel;
        this.buttonText = buttonText;
        this.navigation = c9598e;
    }

    public /* synthetic */ SageBottomSheetModel(String str, String str2, String str3, TagModel tagModel, String str4, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, tagModel, str4, (i13 & 32) != 0 ? null : c9598e);
    }
}
