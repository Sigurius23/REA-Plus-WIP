package com.whoop.navigation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.client.api.QueryParams;
import j00.C21118u;
import java.util.Map;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import te0.AbstractC33745d;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBE\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ>\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001d¨\u00063"}, m65681d2 = {"Lcom/whoop/navigation/AuthenticatedWebViewModel;", "Lcom/whoop/navigation/CommonNavigationScreenModel;", "", QueryParams.URL, "", "confirmDismissContent", "Lcom/whoop/navigation/e;", "onDismissDestination", "<init>", "(Ljava/lang/String;Ljava/util/Map;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Map;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/AuthenticatedWebViewModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "component3", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Ljava/util/Map;Lcom/whoop/navigation/e;)Lcom/whoop/navigation/AuthenticatedWebViewModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "Ljava/util/Map;", "getConfirmDismissContent", "Lcom/whoop/navigation/e;", "getOnDismissDestination", "getOnDismissDestination$annotations", "()V", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AuthenticatedWebViewModel implements CommonNavigationScreenModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final Map<String, String> confirmDismissContent;
    private final C9598e onDismissDestination;
    private final String url;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.navigation.AuthenticatedWebViewModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/AuthenticatedWebViewModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/AuthenticatedWebViewModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AuthenticatedWebViewModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C21118u(5)), AbstractC30060g.m92087G(enumC23463i, new C21118u(6))};
    }

    public AuthenticatedWebViewModel() {
        this((String) null, (Map) null, (C9598e) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthenticatedWebViewModel copy$default(AuthenticatedWebViewModel authenticatedWebViewModel, String str, Map map, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = authenticatedWebViewModel.url;
        }
        if ((i13 & 2) != 0) {
            map = authenticatedWebViewModel.confirmDismissContent;
        }
        if ((i13 & 4) != 0) {
            c9598e = authenticatedWebViewModel.onDismissDestination;
        }
        return authenticatedWebViewModel.copy(str, map, c9598e);
    }

    public static /* synthetic */ void getOnDismissDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$navigation_release(AuthenticatedWebViewModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.url, "")) {
            output.encodeStringElement(serialDesc, 0, self.url);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.confirmDismissContent != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.confirmDismissContent);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.onDismissDestination == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.onDismissDestination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final Map<String, String> component2() {
        return this.confirmDismissContent;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final C9598e getOnDismissDestination() {
        return this.onDismissDestination;
    }

    public final AuthenticatedWebViewModel copy(String url, Map<String, String> confirmDismissContent, C9598e onDismissDestination) {
        AbstractC22676k.m65750j(url, "url");
        return new AuthenticatedWebViewModel(url, confirmDismissContent, onDismissDestination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthenticatedWebViewModel)) {
            return false;
        }
        AuthenticatedWebViewModel authenticatedWebViewModel = (AuthenticatedWebViewModel) other;
        return AbstractC22676k.m65745e(this.url, authenticatedWebViewModel.url) && AbstractC22676k.m65745e(this.confirmDismissContent, authenticatedWebViewModel.confirmDismissContent) && AbstractC22676k.m65745e(this.onDismissDestination, authenticatedWebViewModel.onDismissDestination);
    }

    public final Map<String, String> getConfirmDismissContent() {
        return this.confirmDismissContent;
    }

    public final C9598e getOnDismissDestination() {
        return this.onDismissDestination;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = this.url.hashCode() * 31;
        Map<String, String> map = this.confirmDismissContent;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        C9598e c9598e = this.onDismissDestination;
        return iHashCode2 + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        String str = this.url;
        Map<String, String> map = this.confirmDismissContent;
        return AbstractC33745d.m106656o(AbstractC36095b.m114686n("AuthenticatedWebViewModel(url=", str, ", confirmDismissContent=", ", onDismissDestination=", map), this.onDismissDestination, ")");
    }

    public /* synthetic */ AuthenticatedWebViewModel(int i13, String str, Map map, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        this.url = (i13 & 1) == 0 ? "" : str;
        if ((i13 & 2) == 0) {
            this.confirmDismissContent = null;
        } else {
            this.confirmDismissContent = map;
        }
        if ((i13 & 4) == 0) {
            this.onDismissDestination = null;
        } else {
            this.onDismissDestination = c9598e;
        }
    }

    public AuthenticatedWebViewModel(String url, Map<String, String> map, C9598e c9598e) {
        AbstractC22676k.m65750j(url, "url");
        this.url = url;
        this.confirmDismissContent = map;
        this.onDismissDestination = c9598e;
    }

    public /* synthetic */ AuthenticatedWebViewModel(String str, Map map, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? null : map, (i13 & 4) != 0 ? null : c9598e);
    }
}
