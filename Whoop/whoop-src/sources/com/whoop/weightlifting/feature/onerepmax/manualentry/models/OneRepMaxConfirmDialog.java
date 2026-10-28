package com.whoop.weightlifting.feature.onerepmax.manualentry.models;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.AnalyticEventModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.whoopaction.domain.models.Action;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
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
import xo1.C38492a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?@BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eBk\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001eJd\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b4\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b5\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b6\u0010\u001eR \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00107\u0012\u0004\b9\u0010:\u001a\u0004\b8\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b=\u0010\u001e¨\u0006A"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxConfirmDialog;", "", "", "id", "title", "description", "primaryButton", "secondaryButton", "Lcom/whoop/whoopaction/domain/models/Action;", "primaryAction", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "valuePrompt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weightlifting_release", "(Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxConfirmDialog;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/whoop/whoopaction/domain/models/Action;", "component7", "()Lcom/whoop/analytics/AnalyticEventModel;", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/lang/String;)Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxConfirmDialog;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getTitle", "getDescription", "getPrimaryButton", "getSecondaryButton", "Lcom/whoop/whoopaction/domain/models/Action;", "getPrimaryAction", "getPrimaryAction$annotations", "()V", "Lcom/whoop/analytics/AnalyticEventModel;", "getAnalyticEvent", "getValuePrompt", "Companion", "$serializer", "a", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class OneRepMaxConfirmDialog {
    private final AnalyticEventModel analyticEvent;
    private final String description;
    private final String id;
    private final Action primaryAction;
    private final String primaryButton;
    private final String secondaryButton;
    private final String title;
    private final String valuePrompt;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C38492a(13)), null, null};

    /* JADX INFO: renamed from: com.whoop.weightlifting.feature.onerepmax.manualentry.models.OneRepMaxConfirmDialog$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxConfirmDialog$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxConfirmDialog;", "serializer", "()Lwc3/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return OneRepMaxConfirmDialog$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ OneRepMaxConfirmDialog(int i13, String str, String str2, String str3, String str4, String str5, Action action, AnalyticEventModel analyticEventModel, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, OneRepMaxConfirmDialog$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.title = str2;
        this.description = str3;
        this.primaryButton = str4;
        this.secondaryButton = str5;
        this.primaryAction = action;
        if ((i13 & 64) == 0) {
            this.analyticEvent = null;
        } else {
            this.analyticEvent = analyticEventModel;
        }
        if ((i13 & 128) == 0) {
            this.valuePrompt = null;
        } else {
            this.valuePrompt = str6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(Action.class), new C37140e(c22673i0.getOrCreateKotlinClass(Action.class), new Annotation[0]), new InterfaceC37138c[0]);
    }

    public static /* synthetic */ OneRepMaxConfirmDialog copy$default(OneRepMaxConfirmDialog oneRepMaxConfirmDialog, String str, String str2, String str3, String str4, String str5, Action action, AnalyticEventModel analyticEventModel, String str6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = oneRepMaxConfirmDialog.id;
        }
        if ((i13 & 2) != 0) {
            str2 = oneRepMaxConfirmDialog.title;
        }
        if ((i13 & 4) != 0) {
            str3 = oneRepMaxConfirmDialog.description;
        }
        if ((i13 & 8) != 0) {
            str4 = oneRepMaxConfirmDialog.primaryButton;
        }
        if ((i13 & 16) != 0) {
            str5 = oneRepMaxConfirmDialog.secondaryButton;
        }
        if ((i13 & 32) != 0) {
            action = oneRepMaxConfirmDialog.primaryAction;
        }
        if ((i13 & 64) != 0) {
            analyticEventModel = oneRepMaxConfirmDialog.analyticEvent;
        }
        if ((i13 & 128) != 0) {
            str6 = oneRepMaxConfirmDialog.valuePrompt;
        }
        AnalyticEventModel analyticEventModel2 = analyticEventModel;
        String str7 = str6;
        String str8 = str5;
        Action action2 = action;
        return oneRepMaxConfirmDialog.copy(str, str2, str3, str4, str8, action2, analyticEventModel2, str7);
    }

    public static /* synthetic */ void getPrimaryAction$annotations() {
    }

    public static final /* synthetic */ void write$Self$weightlifting_release(OneRepMaxConfirmDialog self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.description);
        output.encodeStringElement(serialDesc, 3, self.primaryButton);
        output.encodeStringElement(serialDesc, 4, self.secondaryButton);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.primaryAction);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.analyticEvent != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, AnalyticEventModel$$serializer.INSTANCE, self.analyticEvent);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.valuePrompt == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.valuePrompt);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
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
    public final String getPrimaryButton() {
        return this.primaryButton;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSecondaryButton() {
        return this.secondaryButton;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Action getPrimaryAction() {
        return this.primaryAction;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getValuePrompt() {
        return this.valuePrompt;
    }

    public final OneRepMaxConfirmDialog copy(String id4, String title, String description, String primaryButton, String secondaryButton, Action primaryAction, AnalyticEventModel analyticEvent, String valuePrompt) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(primaryButton, "primaryButton");
        AbstractC22676k.m65750j(secondaryButton, "secondaryButton");
        AbstractC22676k.m65750j(primaryAction, "primaryAction");
        return new OneRepMaxConfirmDialog(id4, title, description, primaryButton, secondaryButton, primaryAction, analyticEvent, valuePrompt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneRepMaxConfirmDialog)) {
            return false;
        }
        OneRepMaxConfirmDialog oneRepMaxConfirmDialog = (OneRepMaxConfirmDialog) other;
        return AbstractC22676k.m65745e(this.id, oneRepMaxConfirmDialog.id) && AbstractC22676k.m65745e(this.title, oneRepMaxConfirmDialog.title) && AbstractC22676k.m65745e(this.description, oneRepMaxConfirmDialog.description) && AbstractC22676k.m65745e(this.primaryButton, oneRepMaxConfirmDialog.primaryButton) && AbstractC22676k.m65745e(this.secondaryButton, oneRepMaxConfirmDialog.secondaryButton) && AbstractC22676k.m65745e(this.primaryAction, oneRepMaxConfirmDialog.primaryAction) && AbstractC22676k.m65745e(this.analyticEvent, oneRepMaxConfirmDialog.analyticEvent) && AbstractC22676k.m65745e(this.valuePrompt, oneRepMaxConfirmDialog.valuePrompt);
    }

    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final Action getPrimaryAction() {
        return this.primaryAction;
    }

    public final String getPrimaryButton() {
        return this.primaryButton;
    }

    public final String getSecondaryButton() {
        return this.secondaryButton;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getValuePrompt() {
        return this.valuePrompt;
    }

    public int hashCode() {
        int iHashCode = (this.primaryAction.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.title), 31, this.description), 31, this.primaryButton), 31, this.secondaryButton)) * 31;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        int iHashCode2 = (iHashCode + (analyticEventModel == null ? 0 : analyticEventModel.hashCode())) * 31;
        String str = this.valuePrompt;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.description;
        String str4 = this.primaryButton;
        String str5 = this.secondaryButton;
        Action action = this.primaryAction;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        String str6 = this.valuePrompt;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("OneRepMaxConfirmDialog(id=", str, ", title=", str2, ", description=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", primaryButton=", str4, ", secondaryButton=");
        sbM32001t.append(str5);
        sbM32001t.append(", primaryAction=");
        sbM32001t.append(action);
        sbM32001t.append(", analyticEvent=");
        sbM32001t.append(analyticEventModel);
        sbM32001t.append(", valuePrompt=");
        sbM32001t.append(str6);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public OneRepMaxConfirmDialog(String id4, String title, String description, String primaryButton, String secondaryButton, Action primaryAction, AnalyticEventModel analyticEventModel, String str) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(primaryButton, "primaryButton");
        AbstractC22676k.m65750j(secondaryButton, "secondaryButton");
        AbstractC22676k.m65750j(primaryAction, "primaryAction");
        this.id = id4;
        this.title = title;
        this.description = description;
        this.primaryButton = primaryButton;
        this.secondaryButton = secondaryButton;
        this.primaryAction = primaryAction;
        this.analyticEvent = analyticEventModel;
        this.valuePrompt = str;
    }

    public /* synthetic */ OneRepMaxConfirmDialog(String str, String str2, String str3, String str4, String str5, Action action, AnalyticEventModel analyticEventModel, String str6, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, action, (i13 & 64) != 0 ? null : analyticEventModel, (i13 & 128) != 0 ? null : str6);
    }
}
