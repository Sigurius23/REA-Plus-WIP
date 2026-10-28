package com.whoop.design.models.items;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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
import w91.C36959f;
import w91.C36960g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fBa\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0010\u0010$\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b$\u0010!J\\\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\n\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001cJ\u0010\u0010(\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b6\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b7\u0010!R\u0017\u0010\n\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b8\u0010!¨\u0006;"}, m65681d2 = {"Lcom/whoop/design/models/items/JournalEntryWidgetModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "title", "Lcom/whoop/design/models/items/JournalEntryStatus;", NotificationCompat.CATEGORY_STATUS, "answeredYesQuestion", "magnitudeQuestion", "timeQuestion", "button", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/JournalEntryStatus;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/JournalEntryStatus;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/JournalEntryWidgetModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/items/JournalEntryStatus;", "component4", "()Lcom/whoop/design/models/DesignSystemModel;", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/JournalEntryStatus;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/items/JournalEntryWidgetModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getTitle", "Lcom/whoop/design/models/items/JournalEntryStatus;", "getStatus", "Lcom/whoop/design/models/DesignSystemModel;", "getAnsweredYesQuestion", "getMagnitudeQuestion", "getTimeQuestion", "getButton", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class JournalEntryWidgetModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final DesignSystemModel answeredYesQuestion;
    private final DesignSystemModel button;
    private final String id;
    private final DesignSystemModel magnitudeQuestion;
    private final JournalEntryStatus status;
    private final DesignSystemModel timeQuestion;
    private final String title;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/JournalEntryWidgetModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/JournalEntryWidgetModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return JournalEntryWidgetModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C36959f(27)), AbstractC30060g.m92087G(enumC23463i, new C36959f(28)), AbstractC30060g.m92087G(enumC23463i, new C36959f(29)), AbstractC30060g.m92087G(enumC23463i, new C36960g(0)), AbstractC30060g.m92087G(enumC23463i, new C36960g(1))};
    }

    public /* synthetic */ JournalEntryWidgetModel(int i13, String str, String str2, JournalEntryStatus journalEntryStatus, DesignSystemModel designSystemModel, DesignSystemModel designSystemModel2, DesignSystemModel designSystemModel3, DesignSystemModel designSystemModel4, SerializationConstructorMarker serializationConstructorMarker) {
        if (64 != (i13 & 64)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 64, JournalEntryWidgetModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i13 & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i13 & 4) == 0) {
            this.status = JournalEntryStatus.EDITABLE;
        } else {
            this.status = journalEntryStatus;
        }
        if ((i13 & 8) == 0) {
            this.answeredYesQuestion = null;
        } else {
            this.answeredYesQuestion = designSystemModel;
        }
        if ((i13 & 16) == 0) {
            this.magnitudeQuestion = null;
        } else {
            this.magnitudeQuestion = designSystemModel2;
        }
        if ((i13 & 32) == 0) {
            this.timeQuestion = null;
        } else {
            this.timeQuestion = designSystemModel3;
        }
        this.button = designSystemModel4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return JournalEntryStatus.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$1() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$2() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$3() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]);
    }

    public static /* synthetic */ JournalEntryWidgetModel copy$default(JournalEntryWidgetModel journalEntryWidgetModel, String str, String str2, JournalEntryStatus journalEntryStatus, DesignSystemModel designSystemModel, DesignSystemModel designSystemModel2, DesignSystemModel designSystemModel3, DesignSystemModel designSystemModel4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = journalEntryWidgetModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = journalEntryWidgetModel.title;
        }
        if ((i13 & 4) != 0) {
            journalEntryStatus = journalEntryWidgetModel.status;
        }
        if ((i13 & 8) != 0) {
            designSystemModel = journalEntryWidgetModel.answeredYesQuestion;
        }
        if ((i13 & 16) != 0) {
            designSystemModel2 = journalEntryWidgetModel.magnitudeQuestion;
        }
        if ((i13 & 32) != 0) {
            designSystemModel3 = journalEntryWidgetModel.timeQuestion;
        }
        if ((i13 & 64) != 0) {
            designSystemModel4 = journalEntryWidgetModel.button;
        }
        DesignSystemModel designSystemModel5 = designSystemModel3;
        DesignSystemModel designSystemModel6 = designSystemModel4;
        DesignSystemModel designSystemModel7 = designSystemModel2;
        JournalEntryStatus journalEntryStatus2 = journalEntryStatus;
        return journalEntryWidgetModel.copy(str, str2, journalEntryStatus2, designSystemModel, designSystemModel7, designSystemModel5, designSystemModel6);
    }

    public static final /* synthetic */ void write$Self$design_models_release(JournalEntryWidgetModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.id, "")) {
            output.encodeStringElement(serialDesc, 0, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.title, "")) {
            output.encodeStringElement(serialDesc, 1, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.status != JournalEntryStatus.EDITABLE) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.status);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.answeredYesQuestion != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.answeredYesQuestion);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.magnitudeQuestion != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.magnitudeQuestion);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.timeQuestion != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.timeQuestion);
        }
        output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.button);
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
    public final JournalEntryStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DesignSystemModel getAnsweredYesQuestion() {
        return this.answeredYesQuestion;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DesignSystemModel getMagnitudeQuestion() {
        return this.magnitudeQuestion;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DesignSystemModel getTimeQuestion() {
        return this.timeQuestion;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final DesignSystemModel getButton() {
        return this.button;
    }

    public final JournalEntryWidgetModel copy(String id4, String title, JournalEntryStatus status, DesignSystemModel answeredYesQuestion, DesignSystemModel magnitudeQuestion, DesignSystemModel timeQuestion, DesignSystemModel button) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(button, "button");
        return new JournalEntryWidgetModel(id4, title, status, answeredYesQuestion, magnitudeQuestion, timeQuestion, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JournalEntryWidgetModel)) {
            return false;
        }
        JournalEntryWidgetModel journalEntryWidgetModel = (JournalEntryWidgetModel) other;
        return AbstractC22676k.m65745e(this.id, journalEntryWidgetModel.id) && AbstractC22676k.m65745e(this.title, journalEntryWidgetModel.title) && this.status == journalEntryWidgetModel.status && AbstractC22676k.m65745e(this.answeredYesQuestion, journalEntryWidgetModel.answeredYesQuestion) && AbstractC22676k.m65745e(this.magnitudeQuestion, journalEntryWidgetModel.magnitudeQuestion) && AbstractC22676k.m65745e(this.timeQuestion, journalEntryWidgetModel.timeQuestion) && AbstractC22676k.m65745e(this.button, journalEntryWidgetModel.button);
    }

    public final DesignSystemModel getAnsweredYesQuestion() {
        return this.answeredYesQuestion;
    }

    public final DesignSystemModel getButton() {
        return this.button;
    }

    public final String getId() {
        return this.id;
    }

    public final DesignSystemModel getMagnitudeQuestion() {
        return this.magnitudeQuestion;
    }

    public final JournalEntryStatus getStatus() {
        return this.status;
    }

    public final DesignSystemModel getTimeQuestion() {
        return this.timeQuestion;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = (this.status.hashCode() + AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.title)) * 31;
        DesignSystemModel designSystemModel = this.answeredYesQuestion;
        int iHashCode2 = (iHashCode + (designSystemModel == null ? 0 : designSystemModel.hashCode())) * 31;
        DesignSystemModel designSystemModel2 = this.magnitudeQuestion;
        int iHashCode3 = (iHashCode2 + (designSystemModel2 == null ? 0 : designSystemModel2.hashCode())) * 31;
        DesignSystemModel designSystemModel3 = this.timeQuestion;
        return this.button.hashCode() + ((iHashCode3 + (designSystemModel3 != null ? designSystemModel3.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        JournalEntryStatus journalEntryStatus = this.status;
        DesignSystemModel designSystemModel = this.answeredYesQuestion;
        DesignSystemModel designSystemModel2 = this.magnitudeQuestion;
        DesignSystemModel designSystemModel3 = this.timeQuestion;
        DesignSystemModel designSystemModel4 = this.button;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("JournalEntryWidgetModel(id=", str, ", title=", str2, ", status=");
        sbM32001t.append(journalEntryStatus);
        sbM32001t.append(", answeredYesQuestion=");
        sbM32001t.append(designSystemModel);
        sbM32001t.append(", magnitudeQuestion=");
        sbM32001t.append(designSystemModel2);
        sbM32001t.append(", timeQuestion=");
        sbM32001t.append(designSystemModel3);
        sbM32001t.append(", button=");
        sbM32001t.append(designSystemModel4);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public JournalEntryWidgetModel(String id4, String title, JournalEntryStatus status, DesignSystemModel designSystemModel, DesignSystemModel designSystemModel2, DesignSystemModel designSystemModel3, DesignSystemModel button) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(button, "button");
        this.id = id4;
        this.title = title;
        this.status = status;
        this.answeredYesQuestion = designSystemModel;
        this.magnitudeQuestion = designSystemModel2;
        this.timeQuestion = designSystemModel3;
        this.button = button;
    }

    public /* synthetic */ JournalEntryWidgetModel(String str, String str2, JournalEntryStatus journalEntryStatus, DesignSystemModel designSystemModel, DesignSystemModel designSystemModel2, DesignSystemModel designSystemModel3, DesignSystemModel designSystemModel4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? JournalEntryStatus.EDITABLE : journalEntryStatus, (i13 & 8) != 0 ? null : designSystemModel, (i13 & 16) != 0 ? null : designSystemModel2, (i13 & 32) != 0 ? null : designSystemModel3, designSystemModel4);
    }
}
