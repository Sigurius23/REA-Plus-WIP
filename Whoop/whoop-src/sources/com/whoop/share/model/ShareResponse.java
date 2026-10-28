package com.whoop.share.model;

import c13.AbstractC3855a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ga1.C15620a;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import m83.C25272z;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ@\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00060"}, m65681d2 = {"Lcom/whoop/share/model/ShareResponse;", "", "", "title", "", "analyticProperties", "", "Lcom/whoop/share/model/ShareAsset;", "assets", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Map;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$share_release", "(Lcom/whoop/share/model/ShareResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lcom/whoop/share/model/ShareResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/Map;", "getAnalyticProperties", "Ljava/util/List;", "getAssets", "Companion", "$serializer", "share_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ShareResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final Map<String, String> analyticProperties;
    private final List<ShareAsset> assets;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/share/model/ShareResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/share/model/ShareResponse;", "serializer", "()Lwc3/c;", "share_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ShareResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C15620a(5)), AbstractC30060g.m92087G(enumC23463i, new C15620a(6))};
    }

    public ShareResponse() {
        this((String) null, (Map) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(ShareAsset$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShareResponse copy$default(ShareResponse shareResponse, String str, Map map, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = shareResponse.title;
        }
        if ((i13 & 2) != 0) {
            map = shareResponse.analyticProperties;
        }
        if ((i13 & 4) != 0) {
            list = shareResponse.assets;
        }
        return shareResponse.copy(str, map, list);
    }

    public static final /* synthetic */ void write$Self$share_release(ShareResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.title, "")) {
            output.encodeStringElement(serialDesc, 0, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.analyticProperties, C25272z.f99163w)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.analyticProperties);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && AbstractC22676k.m65745e(self.assets, C25271y.f99162w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.assets);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final Map<String, String> component2() {
        return this.analyticProperties;
    }

    public final List<ShareAsset> component3() {
        return this.assets;
    }

    public final ShareResponse copy(String title, Map<String, String> analyticProperties, List<ShareAsset> assets) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(analyticProperties, "analyticProperties");
        AbstractC22676k.m65750j(assets, "assets");
        return new ShareResponse(title, analyticProperties, assets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareResponse)) {
            return false;
        }
        ShareResponse shareResponse = (ShareResponse) other;
        return AbstractC22676k.m65745e(this.title, shareResponse.title) && AbstractC22676k.m65745e(this.analyticProperties, shareResponse.analyticProperties) && AbstractC22676k.m65745e(this.assets, shareResponse.assets);
    }

    public final Map<String, String> getAnalyticProperties() {
        return this.analyticProperties;
    }

    public final List<ShareAsset> getAssets() {
        return this.assets;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.assets.hashCode() + AbstractC3855a.m11821e(this.analyticProperties, this.title.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.title;
        Map<String, String> map = this.analyticProperties;
        return AbstractC3855a.m11829m(AbstractC36095b.m114686n("ShareResponse(title=", str, ", analyticProperties=", ", assets=", map), this.assets, ")");
    }

    public /* synthetic */ ShareResponse(int i13, String str, Map map, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.title = (i13 & 1) == 0 ? "" : str;
        if ((i13 & 2) == 0) {
            this.analyticProperties = C25272z.f99163w;
        } else {
            this.analyticProperties = map;
        }
        if ((i13 & 4) == 0) {
            this.assets = C25271y.f99162w;
        } else {
            this.assets = list;
        }
    }

    public ShareResponse(String title, Map<String, String> analyticProperties, List<ShareAsset> assets) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(analyticProperties, "analyticProperties");
        AbstractC22676k.m65750j(assets, "assets");
        this.title = title;
        this.analyticProperties = analyticProperties;
        this.assets = assets;
    }

    public /* synthetic */ ShareResponse(String str, Map map, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? C25272z.f99163w : map, (i13 & 4) != 0 ? C25271y.f99162w : list);
    }
}
