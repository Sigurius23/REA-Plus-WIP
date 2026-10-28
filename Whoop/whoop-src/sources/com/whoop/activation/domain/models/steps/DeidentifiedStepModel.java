package com.whoop.activation.domain.models.steps;

import com.whoop.activation.domain.models.ActivationFlowStepModel;
import com.whoop.activation.domain.models.FooterAlignment;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.ProgressButtonModel;
import com.whoop.design.models.ProgressButtonModel$$serializer;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import md1.C25452a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import r70.C31049a;
import r80.AbstractC31061c;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0002BABU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Bq\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0010\u0010%\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b%\u0010\"J\u0010\u0010&\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0012\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b)\u0010*Jl\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b-\u0010\"J\u0010\u0010.\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b6\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b9\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b:\u0010\"R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b;\u0010\"R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b<\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\b>\u0010(R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\b@\u0010*¨\u0006C"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/DeidentifiedStepModel;", "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "title", "", "subtitle", "body", "navigationBarText", "mobileScreenName", "analyticsName", "Lcom/whoop/design/models/ProgressButtonModel;", "progressCircle", "", "footerButtons", "<init>", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/steps/DeidentifiedStepModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "()Lcom/whoop/design/models/ProgressButtonModel;", "component8", "()Ljava/util/List;", "copy", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;)Lcom/whoop/activation/domain/models/steps/DeidentifiedStepModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getTitle", "Ljava/lang/String;", "getSubtitle", "getBody", "getNavigationBarText", "getMobileScreenName", "getAnalyticsName", "Lcom/whoop/design/models/ProgressButtonModel;", "getProgressCircle", "Ljava/util/List;", "getFooterButtons", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DeidentifiedStepModel implements ActivationFlowStepModel, DesignSystemModel {
    private final String analyticsName;
    private final TextResource body;
    private final List<DesignSystemModel> footerButtons;
    private final String mobileScreenName;
    private final String navigationBarText;
    private final ProgressButtonModel progressCircle;
    private final String subtitle;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C31049a(0))};

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/steps/DeidentifiedStepModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/steps/DeidentifiedStepModel;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DeidentifiedStepModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DeidentifiedStepModel(int i13, TextResource textResource, String str, TextResource textResource2, String str2, String str3, String str4, ProgressButtonModel progressButtonModel, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, DeidentifiedStepModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = textResource;
        this.subtitle = str;
        this.body = textResource2;
        this.navigationBarText = str2;
        this.mobileScreenName = str3;
        this.analyticsName = str4;
        this.progressCircle = progressButtonModel;
        if ((i13 & 128) == 0) {
            this.footerButtons = C25271y.f99162w;
        } else {
            this.footerButtons = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeidentifiedStepModel copy$default(DeidentifiedStepModel deidentifiedStepModel, TextResource textResource, String str, TextResource textResource2, String str2, String str3, String str4, ProgressButtonModel progressButtonModel, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = deidentifiedStepModel.title;
        }
        if ((i13 & 2) != 0) {
            str = deidentifiedStepModel.subtitle;
        }
        if ((i13 & 4) != 0) {
            textResource2 = deidentifiedStepModel.body;
        }
        if ((i13 & 8) != 0) {
            str2 = deidentifiedStepModel.navigationBarText;
        }
        if ((i13 & 16) != 0) {
            str3 = deidentifiedStepModel.mobileScreenName;
        }
        if ((i13 & 32) != 0) {
            str4 = deidentifiedStepModel.analyticsName;
        }
        if ((i13 & 64) != 0) {
            progressButtonModel = deidentifiedStepModel.progressCircle;
        }
        if ((i13 & 128) != 0) {
            list = deidentifiedStepModel.footerButtons;
        }
        ProgressButtonModel progressButtonModel2 = progressButtonModel;
        List list2 = list;
        String str5 = str3;
        String str6 = str4;
        return deidentifiedStepModel.copy(textResource, str, textResource2, str2, str5, str6, progressButtonModel2, list2);
    }

    public static final /* synthetic */ void write$Self$activation_release(DeidentifiedStepModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.title);
        output.encodeStringElement(serialDesc, 1, self.subtitle);
        output.encodeSerializableElement(serialDesc, 2, c25452a, self.body);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.getNavigationBarText());
        output.encodeStringElement(serialDesc, 4, self.getMobileScreenName());
        output.encodeStringElement(serialDesc, 5, self.getAnalyticsName());
        output.encodeNullableSerializableElement(serialDesc, 6, ProgressButtonModel$$serializer.INSTANCE, self.getProgressCircle());
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && AbstractC22676k.m65745e(self.getFooterButtons(), C25271y.f99162w)) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.getFooterButtons());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNavigationBarText() {
        return this.navigationBarText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMobileScreenName() {
        return this.mobileScreenName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ProgressButtonModel getProgressCircle() {
        return this.progressCircle;
    }

    public final List<DesignSystemModel> component8() {
        return this.footerButtons;
    }

    public final DeidentifiedStepModel copy(TextResource title, String subtitle, TextResource body, String navigationBarText, String mobileScreenName, String analyticsName, ProgressButtonModel progressCircle, List<? extends DesignSystemModel> footerButtons) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(mobileScreenName, "mobileScreenName");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        return new DeidentifiedStepModel(title, subtitle, body, navigationBarText, mobileScreenName, analyticsName, progressCircle, footerButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeidentifiedStepModel)) {
            return false;
        }
        DeidentifiedStepModel deidentifiedStepModel = (DeidentifiedStepModel) other;
        return AbstractC22676k.m65745e(this.title, deidentifiedStepModel.title) && AbstractC22676k.m65745e(this.subtitle, deidentifiedStepModel.subtitle) && AbstractC22676k.m65745e(this.body, deidentifiedStepModel.body) && AbstractC22676k.m65745e(this.navigationBarText, deidentifiedStepModel.navigationBarText) && AbstractC22676k.m65745e(this.mobileScreenName, deidentifiedStepModel.mobileScreenName) && AbstractC22676k.m65745e(this.analyticsName, deidentifiedStepModel.analyticsName) && AbstractC22676k.m65745e(this.progressCircle, deidentifiedStepModel.progressCircle) && AbstractC22676k.m65745e(this.footerButtons, deidentifiedStepModel.footerButtons);
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public String getAnalyticsName() {
        return this.analyticsName;
    }

    public final TextResource getBody() {
        return this.body;
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public /* bridge */ FooterAlignment getFooterAlignment() {
        return super.getFooterAlignment();
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public List<DesignSystemModel> getFooterButtons() {
        return this.footerButtons;
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public String getMobileScreenName() {
        return this.mobileScreenName;
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public String getNavigationBarText() {
        return this.navigationBarText;
    }

    @Override // com.whoop.activation.domain.models.ActivationFlowStepModel
    public ProgressButtonModel getProgressCircle() {
        return this.progressCircle;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle), this.body, 31);
        String str = this.navigationBarText;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iM95625a + (str == null ? 0 : str.hashCode())) * 31, 31, this.mobileScreenName), 31, this.analyticsName);
        ProgressButtonModel progressButtonModel = this.progressCircle;
        int iHashCode = (iM30450d + (progressButtonModel == null ? 0 : progressButtonModel.hashCode())) * 31;
        List<DesignSystemModel> list = this.footerButtons;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        String str = this.subtitle;
        TextResource textResource2 = this.body;
        String str2 = this.navigationBarText;
        String str3 = this.mobileScreenName;
        String str4 = this.analyticsName;
        ProgressButtonModel progressButtonModel = this.progressCircle;
        List<DesignSystemModel> list = this.footerButtons;
        StringBuilder sbM91845o = AbstractC30007c.m91845o("DeidentifiedStepModel(title=", textResource, ", subtitle=", str, ", body=");
        AbstractC30007c.m91856z(sbM91845o, textResource2, ", navigationBarText=", str2, ", mobileScreenName=");
        AbstractC11266d.m30444B(sbM91845o, str3, ", analyticsName=", str4, ", progressCircle=");
        sbM91845o.append(progressButtonModel);
        sbM91845o.append(", footerButtons=");
        sbM91845o.append(list);
        sbM91845o.append(")");
        return sbM91845o.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeidentifiedStepModel(TextResource title, String subtitle, TextResource body, String str, String mobileScreenName, String analyticsName, ProgressButtonModel progressButtonModel, List<? extends DesignSystemModel> list) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(mobileScreenName, "mobileScreenName");
        AbstractC22676k.m65750j(analyticsName, "analyticsName");
        this.title = title;
        this.subtitle = subtitle;
        this.body = body;
        this.navigationBarText = str;
        this.mobileScreenName = mobileScreenName;
        this.analyticsName = analyticsName;
        this.progressCircle = progressButtonModel;
        this.footerButtons = list;
    }

    public /* synthetic */ DeidentifiedStepModel(TextResource textResource, String str, TextResource textResource2, String str2, String str3, String str4, ProgressButtonModel progressButtonModel, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, str, textResource2, str2, str3, str4, progressButtonModel, (i13 & 128) != 0 ? C25271y.f99162w : list);
    }
}
