package com.whoop.archv2.model.template;

import cb1.C4387a;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.ScreenAnalyticEventModel;
import com.whoop.design.models.items.NavigationBarModel;
import com.whoop.design.models.items.NavigationBarModel$$serializer;
import com.whoop.design.models.modal.LifecycleInteractions;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0019¨\u0006-"}, m65681d2 = {"Lcom/whoop/archv2/model/template/NavigationTemplate;", "Lcom/whoop/archv2/model/template/ScreenTemplate;", "Lcom/whoop/design/models/items/NavigationBarModel;", "navigationBar", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Lcom/whoop/design/models/items/NavigationBarModel;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/NavigationBarModel;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$arch_v2_release", "(Lcom/whoop/archv2/model/template/NavigationTemplate;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/NavigationBarModel;", "component2", "()Lcom/whoop/navigation/e;", "copy", "(Lcom/whoop/design/models/items/NavigationBarModel;Lcom/whoop/navigation/e;)Lcom/whoop/archv2/model/template/NavigationTemplate;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/NavigationBarModel;", "getNavigationBar", "Lcom/whoop/navigation/e;", "getDestination", "Companion", "$serializer", "a", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class NavigationTemplate implements ScreenTemplate {
    private final C9598e destination;
    private final NavigationBarModel navigationBar;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d | NavigationBarModel.$stable;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C4387a(28))};

    /* JADX INFO: renamed from: com.whoop.archv2.model.template.NavigationTemplate$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/archv2/model/template/NavigationTemplate$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/archv2/model/template/NavigationTemplate;", "serializer", "()Lwc3/c;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return NavigationTemplate$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NavigationTemplate() {
        this((NavigationBarModel) null, (C9598e) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ NavigationTemplate copy$default(NavigationTemplate navigationTemplate, NavigationBarModel navigationBarModel, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            navigationBarModel = navigationTemplate.navigationBar;
        }
        if ((i13 & 2) != 0) {
            c9598e = navigationTemplate.destination;
        }
        return navigationTemplate.copy(navigationBarModel, c9598e);
    }

    public static final /* synthetic */ void write$Self$arch_v2_release(NavigationTemplate self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.navigationBar != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, NavigationBarModel$$serializer.INSTANCE, self.navigationBar);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1)) {
            if (AbstractC22676k.m65745e(self.destination, new C9598e(null, null, null, 7, null))) {
                return;
            }
        }
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NavigationBarModel getNavigationBar() {
        return this.navigationBar;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final NavigationTemplate copy(NavigationBarModel navigationBar, C9598e destination) {
        AbstractC22676k.m65750j(destination, "destination");
        return new NavigationTemplate(navigationBar, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationTemplate)) {
            return false;
        }
        NavigationTemplate navigationTemplate = (NavigationTemplate) other;
        return AbstractC22676k.m65745e(this.navigationBar, navigationTemplate.navigationBar) && AbstractC22676k.m65745e(this.destination, navigationTemplate.destination);
    }

    @Override // com.whoop.archv2.model.template.ScreenTemplate
    public /* bridge */ AnalyticEventModel failureAnalyticEvent(ScreenAnalyticEventModel screenAnalyticEventModel) {
        return super.failureAnalyticEvent(screenAnalyticEventModel);
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    @Override // com.whoop.archv2.model.template.ScreenTemplate
    public /* bridge */ LifecycleInteractions getLifecycleInteractions() {
        return super.getLifecycleInteractions();
    }

    public final NavigationBarModel getNavigationBar() {
        return this.navigationBar;
    }

    public int hashCode() {
        NavigationBarModel navigationBarModel = this.navigationBar;
        return this.destination.hashCode() + ((navigationBarModel == null ? 0 : navigationBarModel.hashCode()) * 31);
    }

    public String toString() {
        return "NavigationTemplate(navigationBar=" + this.navigationBar + ", destination=" + this.destination + ")";
    }

    public /* synthetic */ NavigationTemplate(int i13, NavigationBarModel navigationBarModel, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        this.navigationBar = (i13 & 1) == 0 ? null : navigationBarModel;
        if ((i13 & 2) == 0) {
            this.destination = new C9598e(null, null, null, 7, null);
        } else {
            this.destination = c9598e;
        }
    }

    public NavigationTemplate(NavigationBarModel navigationBarModel, C9598e destination) {
        AbstractC22676k.m65750j(destination, "destination");
        this.navigationBar = navigationBarModel;
        this.destination = destination;
    }

    public /* synthetic */ NavigationTemplate(NavigationBarModel navigationBarModel, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : navigationBarModel, (i13 & 2) != 0 ? new C9598e(null, null, null, 7, null) : c9598e);
    }
}
