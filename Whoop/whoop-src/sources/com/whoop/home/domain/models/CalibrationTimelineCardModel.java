package com.whoop.home.domain.models;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc2.C39434a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ8\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010\u001f¨\u00065"}, m65681d2 = {"Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "title", "body", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel;", "circularProgressIndicator", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$home_release", "(Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "()Lcom/whoop/navigation/e;", "component4", "()Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel;", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel;)Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getTitle", "getBody", "Lcom/whoop/navigation/e;", "getNavigation", "Lcom/whoop/home/domain/models/CircularProgressIndicatorHomeModel;", "getCircularProgressIndicator", "Companion", "$serializer", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CalibrationTimelineCardModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final TextResource body;
    private final CircularProgressIndicatorHomeModel circularProgressIndicator;
    private final C9598e navigation;
    private final TextResource title;

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/home/domain/models/CalibrationTimelineCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/home/domain/models/CalibrationTimelineCardModel;", "serializer", "()Lwc3/c;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CalibrationTimelineCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        int i13 = TextResource.$stable;
        $stable = i13 | C9598e.f28134d | i13 | i13;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C39434a(13)), null};
    }

    public /* synthetic */ CalibrationTimelineCardModel(int i13, TextResource textResource, TextResource textResource2, C9598e c9598e, CircularProgressIndicatorHomeModel circularProgressIndicatorHomeModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, CalibrationTimelineCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = textResource;
        this.body = textResource2;
        this.navigation = c9598e;
        this.circularProgressIndicator = circularProgressIndicatorHomeModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ CalibrationTimelineCardModel copy$default(CalibrationTimelineCardModel calibrationTimelineCardModel, TextResource textResource, TextResource textResource2, C9598e c9598e, CircularProgressIndicatorHomeModel circularProgressIndicatorHomeModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = calibrationTimelineCardModel.title;
        }
        if ((i13 & 2) != 0) {
            textResource2 = calibrationTimelineCardModel.body;
        }
        if ((i13 & 4) != 0) {
            c9598e = calibrationTimelineCardModel.navigation;
        }
        if ((i13 & 8) != 0) {
            circularProgressIndicatorHomeModel = calibrationTimelineCardModel.circularProgressIndicator;
        }
        return calibrationTimelineCardModel.copy(textResource, textResource2, c9598e, circularProgressIndicatorHomeModel);
    }

    public static final /* synthetic */ void write$Self$home_release(CalibrationTimelineCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.title);
        output.encodeSerializableElement(serialDesc, 1, c25452a, self.body);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.navigation);
        output.encodeSerializableElement(serialDesc, 3, CircularProgressIndicatorHomeModel$$serializer.INSTANCE, self.circularProgressIndicator);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final C9598e getNavigation() {
        return this.navigation;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CircularProgressIndicatorHomeModel getCircularProgressIndicator() {
        return this.circularProgressIndicator;
    }

    public final CalibrationTimelineCardModel copy(TextResource title, TextResource body, C9598e navigation, CircularProgressIndicatorHomeModel circularProgressIndicator) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(navigation, "navigation");
        AbstractC22676k.m65750j(circularProgressIndicator, "circularProgressIndicator");
        return new CalibrationTimelineCardModel(title, body, navigation, circularProgressIndicator);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalibrationTimelineCardModel)) {
            return false;
        }
        CalibrationTimelineCardModel calibrationTimelineCardModel = (CalibrationTimelineCardModel) other;
        return AbstractC22676k.m65745e(this.title, calibrationTimelineCardModel.title) && AbstractC22676k.m65745e(this.body, calibrationTimelineCardModel.body) && AbstractC22676k.m65745e(this.navigation, calibrationTimelineCardModel.navigation) && AbstractC22676k.m65745e(this.circularProgressIndicator, calibrationTimelineCardModel.circularProgressIndicator);
    }

    public final TextResource getBody() {
        return this.body;
    }

    public final CircularProgressIndicatorHomeModel getCircularProgressIndicator() {
        return this.circularProgressIndicator;
    }

    public final C9598e getNavigation() {
        return this.navigation;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.circularProgressIndicator.hashCode() + AbstractC36095b.m114673a(this.navigation, AbstractC31061c.m95625a(this.title.hashCode() * 31, this.body, 31), 31);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.body;
        C9598e c9598e = this.navigation;
        CircularProgressIndicatorHomeModel circularProgressIndicatorHomeModel = this.circularProgressIndicator;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("CalibrationTimelineCardModel(title=", textResource, ", body=", textResource2, ", navigation=");
        sbM106658q.append(c9598e);
        sbM106658q.append(", circularProgressIndicator=");
        sbM106658q.append(circularProgressIndicatorHomeModel);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public CalibrationTimelineCardModel(TextResource title, TextResource body, C9598e navigation, CircularProgressIndicatorHomeModel circularProgressIndicator) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(navigation, "navigation");
        AbstractC22676k.m65750j(circularProgressIndicator, "circularProgressIndicator");
        this.title = title;
        this.body = body;
        this.navigation = navigation;
        this.circularProgressIndicator = circularProgressIndicator;
    }
}
