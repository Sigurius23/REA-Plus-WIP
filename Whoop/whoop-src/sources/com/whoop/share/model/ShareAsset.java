package com.whoop.share.model;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ga1.C15620a;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJJ\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b3\u0010\u001c¨\u00066"}, m65681d2 = {"Lcom/whoop/share/model/ShareAsset;", "", "", "id", "fileName", "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "Lcom/whoop/share/model/ShareBackground;", "background", "style", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/share/model/ShareBackground;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/share/model/ShareBackground;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$share_release", "(Lcom/whoop/share/model/ShareAsset;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()Lcom/whoop/share/model/ShareBackground;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/share/model/ShareBackground;Ljava/lang/String;)Lcom/whoop/share/model/ShareAsset;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getFileName", "Ljava/util/List;", "getItems", "Lcom/whoop/share/model/ShareBackground;", "getBackground", "getStyle", "Companion", "$serializer", "share_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ShareAsset {
    private final ShareBackground background;
    private final String fileName;
    private final String id;
    private final List<DesignSystemModel> items;
    private final String style;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C15620a(4)), null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/share/model/ShareAsset$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/share/model/ShareAsset;", "serializer", "()Lwc3/c;", "share_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ShareAsset$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ShareAsset(int i13, String str, String str2, List list, ShareBackground shareBackground, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, ShareAsset$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        if ((i13 & 2) == 0) {
            this.fileName = "whoop_share";
        } else {
            this.fileName = str2;
        }
        if ((i13 & 4) == 0) {
            this.items = C25271y.f99162w;
        } else {
            this.items = list;
        }
        if ((i13 & 8) == 0) {
            this.background = ShareBackground.INSTANCE.getNone();
        } else {
            this.background = shareBackground;
        }
        if ((i13 & 16) == 0) {
            this.style = null;
        } else {
            this.style = str3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShareAsset copy$default(ShareAsset shareAsset, String str, String str2, List list, ShareBackground shareBackground, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = shareAsset.id;
        }
        if ((i13 & 2) != 0) {
            str2 = shareAsset.fileName;
        }
        if ((i13 & 4) != 0) {
            list = shareAsset.items;
        }
        if ((i13 & 8) != 0) {
            shareBackground = shareAsset.background;
        }
        if ((i13 & 16) != 0) {
            str3 = shareAsset.style;
        }
        String str4 = str3;
        List list2 = list;
        return shareAsset.copy(str, str2, list2, shareBackground, str4);
    }

    public static final /* synthetic */ void write$Self$share_release(ShareAsset self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.fileName, "whoop_share")) {
            output.encodeStringElement(serialDesc, 1, self.fileName);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.items, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.items);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.background, ShareBackground.INSTANCE.getNone())) {
            output.encodeSerializableElement(serialDesc, 3, ShareBackground$$serializer.INSTANCE, self.background);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.style == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.style);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    public final List<DesignSystemModel> component3() {
        return this.items;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ShareBackground getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    public final ShareAsset copy(String id4, String fileName, List<? extends DesignSystemModel> items, ShareBackground background, String style) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(fileName, "fileName");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(background, "background");
        return new ShareAsset(id4, fileName, items, background, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareAsset)) {
            return false;
        }
        ShareAsset shareAsset = (ShareAsset) other;
        return AbstractC22676k.m65745e(this.id, shareAsset.id) && AbstractC22676k.m65745e(this.fileName, shareAsset.fileName) && AbstractC22676k.m65745e(this.items, shareAsset.items) && AbstractC22676k.m65745e(this.background, shareAsset.background) && AbstractC22676k.m65745e(this.style, shareAsset.style);
    }

    public final ShareBackground getBackground() {
        return this.background;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getId() {
        return this.id;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final String getStyle() {
        return this.style;
    }

    public int hashCode() {
        int iHashCode = (this.background.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.fileName), 31, this.items)) * 31;
        String str = this.style;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.id;
        String str2 = this.fileName;
        List<DesignSystemModel> list = this.items;
        ShareBackground shareBackground = this.background;
        String str3 = this.style;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ShareAsset(id=", str, ", fileName=", str2, ", items=");
        sbM32001t.append(list);
        sbM32001t.append(", background=");
        sbM32001t.append(shareBackground);
        sbM32001t.append(", style=");
        return AbstractC25012a.m73376i(str3, ")", sbM32001t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShareAsset(String id4, String fileName, List<? extends DesignSystemModel> items, ShareBackground background, String str) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(fileName, "fileName");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(background, "background");
        this.id = id4;
        this.fileName = fileName;
        this.items = items;
        this.background = background;
        this.style = str;
    }

    public /* synthetic */ ShareAsset(String str, String str2, List list, ShareBackground shareBackground, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? "whoop_share" : str2, (i13 & 4) != 0 ? C25271y.f99162w : list, (i13 & 8) != 0 ? ShareBackground.INSTANCE.getNone() : shareBackground, (i13 & 16) != 0 ? null : str3);
    }
}
