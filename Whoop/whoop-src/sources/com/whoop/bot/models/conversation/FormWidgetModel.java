package com.whoop.bot.models.conversation;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.whoopaction.domain.models.Action;
import java.lang.annotation.Annotation;
import java.util.List;
import jl0.C21769a;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
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
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u0000 @2\u00020\u0001:\u0002A@Bc\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010Bq\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001fJl\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b7\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b8\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010$R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b?\u0010\u001f¨\u0006B"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/FormWidgetModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "userFormId", "authoritativeFormId", "key", NotificationCompat.CATEGORY_STATUS, "", "version", "", "Lcom/whoop/bot/models/conversation/FormQuestionModel;", "questions", "Lcom/whoop/whoopaction/domain/models/Action;", "onComplete", "completedAnswerDisplay", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/bot/models/conversation/FormWidgetModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/lang/Integer;", "component6", "()Ljava/util/List;", "component7", "()Lcom/whoop/whoopaction/domain/models/Action;", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)Lcom/whoop/bot/models/conversation/FormWidgetModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUserFormId", "getAuthoritativeFormId", "getKey", "getStatus", "Ljava/lang/Integer;", "getVersion", "Ljava/util/List;", "getQuestions", "Lcom/whoop/whoopaction/domain/models/Action;", "getOnComplete", "getCompletedAnswerDisplay", "Companion", "$serializer", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FormWidgetModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final String authoritativeFormId;
    private final String completedAnswerDisplay;
    private final String key;
    private final Action onComplete;
    private final List<FormQuestionModel> questions;
    private final String status;
    private final String userFormId;
    private final Integer version;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/FormWidgetModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/bot/models/conversation/FormWidgetModel;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FormWidgetModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C21769a(7)), AbstractC30060g.m92087G(enumC23463i, new C21769a(8)), null};
    }

    public FormWidgetModel() {
        this((String) null, (String) null, (String) null, (String) null, (Integer) null, (List) null, (Action) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(FormQuestionModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(Action.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(Action.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormWidgetModel copy$default(FormWidgetModel formWidgetModel, String str, String str2, String str3, String str4, Integer num, List list, Action action, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = formWidgetModel.userFormId;
        }
        if ((i13 & 2) != 0) {
            str2 = formWidgetModel.authoritativeFormId;
        }
        if ((i13 & 4) != 0) {
            str3 = formWidgetModel.key;
        }
        if ((i13 & 8) != 0) {
            str4 = formWidgetModel.status;
        }
        if ((i13 & 16) != 0) {
            num = formWidgetModel.version;
        }
        if ((i13 & 32) != 0) {
            list = formWidgetModel.questions;
        }
        if ((i13 & 64) != 0) {
            action = formWidgetModel.onComplete;
        }
        if ((i13 & 128) != 0) {
            str5 = formWidgetModel.completedAnswerDisplay;
        }
        Action action2 = action;
        String str6 = str5;
        Integer num2 = num;
        List list2 = list;
        return formWidgetModel.copy(str, str2, str3, str4, num2, list2, action2, str6);
    }

    public static final /* synthetic */ void write$Self$bot_release(FormWidgetModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.userFormId, "")) {
            output.encodeStringElement(serialDesc, 0, self.userFormId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.authoritativeFormId, "")) {
            output.encodeStringElement(serialDesc, 1, self.authoritativeFormId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.key, "")) {
            output.encodeStringElement(serialDesc, 2, self.key);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.status, "")) {
            output.encodeStringElement(serialDesc, 3, self.status);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.version != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, IntSerializer.INSTANCE, self.version);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !AbstractC22676k.m65745e(self.questions, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.questions);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.onComplete != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.onComplete);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.completedAnswerDisplay == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.completedAnswerDisplay);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserFormId() {
        return this.userFormId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthoritativeFormId() {
        return this.authoritativeFormId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }

    public final List<FormQuestionModel> component6() {
        return this.questions;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Action getOnComplete() {
        return this.onComplete;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCompletedAnswerDisplay() {
        return this.completedAnswerDisplay;
    }

    public final FormWidgetModel copy(String userFormId, String authoritativeFormId, String key, String status, Integer version, List<FormQuestionModel> questions, Action onComplete, String completedAnswerDisplay) {
        AbstractC22676k.m65750j(userFormId, "userFormId");
        AbstractC22676k.m65750j(authoritativeFormId, "authoritativeFormId");
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(questions, "questions");
        return new FormWidgetModel(userFormId, authoritativeFormId, key, status, version, questions, onComplete, completedAnswerDisplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormWidgetModel)) {
            return false;
        }
        FormWidgetModel formWidgetModel = (FormWidgetModel) other;
        return AbstractC22676k.m65745e(this.userFormId, formWidgetModel.userFormId) && AbstractC22676k.m65745e(this.authoritativeFormId, formWidgetModel.authoritativeFormId) && AbstractC22676k.m65745e(this.key, formWidgetModel.key) && AbstractC22676k.m65745e(this.status, formWidgetModel.status) && AbstractC22676k.m65745e(this.version, formWidgetModel.version) && AbstractC22676k.m65745e(this.questions, formWidgetModel.questions) && AbstractC22676k.m65745e(this.onComplete, formWidgetModel.onComplete) && AbstractC22676k.m65745e(this.completedAnswerDisplay, formWidgetModel.completedAnswerDisplay);
    }

    public final String getAuthoritativeFormId() {
        return this.authoritativeFormId;
    }

    public final String getCompletedAnswerDisplay() {
        return this.completedAnswerDisplay;
    }

    public final String getKey() {
        return this.key;
    }

    public final Action getOnComplete() {
        return this.onComplete;
    }

    public final List<FormQuestionModel> getQuestions() {
        return this.questions;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getUserFormId() {
        return this.userFormId;
    }

    public final Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.userFormId.hashCode() * 31, 31, this.authoritativeFormId), 31, this.key), 31, this.status);
        Integer num = this.version;
        int iM31983b = AbstractC11895b.m31983b((iM30450d + (num == null ? 0 : num.hashCode())) * 31, 31, this.questions);
        Action action = this.onComplete;
        int iHashCode = (iM31983b + (action == null ? 0 : action.hashCode())) * 31;
        String str = this.completedAnswerDisplay;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.userFormId;
        String str2 = this.authoritativeFormId;
        String str3 = this.key;
        String str4 = this.status;
        Integer num = this.version;
        List<FormQuestionModel> list = this.questions;
        Action action = this.onComplete;
        String str5 = this.completedAnswerDisplay;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("FormWidgetModel(userFormId=", str, ", authoritativeFormId=", str2, ", key=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", status=", str4, ", version=");
        sbM32001t.append(num);
        sbM32001t.append(", questions=");
        sbM32001t.append(list);
        sbM32001t.append(", onComplete=");
        sbM32001t.append(action);
        sbM32001t.append(", completedAnswerDisplay=");
        sbM32001t.append(str5);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ FormWidgetModel(int i13, String str, String str2, String str3, String str4, Integer num, List list, Action action, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.userFormId = "";
        } else {
            this.userFormId = str;
        }
        if ((i13 & 2) == 0) {
            this.authoritativeFormId = "";
        } else {
            this.authoritativeFormId = str2;
        }
        if ((i13 & 4) == 0) {
            this.key = "";
        } else {
            this.key = str3;
        }
        if ((i13 & 8) == 0) {
            this.status = "";
        } else {
            this.status = str4;
        }
        if ((i13 & 16) == 0) {
            this.version = null;
        } else {
            this.version = num;
        }
        if ((i13 & 32) == 0) {
            this.questions = C25271y.f99162w;
        } else {
            this.questions = list;
        }
        if ((i13 & 64) == 0) {
            this.onComplete = null;
        } else {
            this.onComplete = action;
        }
        if ((i13 & 128) == 0) {
            this.completedAnswerDisplay = null;
        } else {
            this.completedAnswerDisplay = str5;
        }
    }

    public FormWidgetModel(String userFormId, String authoritativeFormId, String key, String status, Integer num, List<FormQuestionModel> questions, Action action, String str) {
        AbstractC22676k.m65750j(userFormId, "userFormId");
        AbstractC22676k.m65750j(authoritativeFormId, "authoritativeFormId");
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(questions, "questions");
        this.userFormId = userFormId;
        this.authoritativeFormId = authoritativeFormId;
        this.key = key;
        this.status = status;
        this.version = num;
        this.questions = questions;
        this.onComplete = action;
        this.completedAnswerDisplay = str;
    }

    public /* synthetic */ FormWidgetModel(String str, String str2, String str3, String str4, Integer num, List list, Action action, String str5, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "" : str4, (i13 & 16) != 0 ? null : num, (i13 & 32) != 0 ? C25271y.f99162w : list, (i13 & 64) != 0 ? null : action, (i13 & 128) != 0 ? null : str5);
    }
}
