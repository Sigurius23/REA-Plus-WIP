package com.whoop.p057ai.chat.domain.formwidget;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.whoopaction.domain.models.Action;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/c;", "", "<init>", "()V", "e", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "d", "b", "c", "a", "f", "Lcom/whoop/ai/chat/domain/formwidget/c$a;", "Lcom/whoop/ai/chat/domain/formwidget/c$b;", "Lcom/whoop/ai/chat/domain/formwidget/c$c;", "Lcom/whoop/ai/chat/domain/formwidget/c$d;", "Lcom/whoop/ai/chat/domain/formwidget/c$e;", "Lcom/whoop/ai/chat/domain/formwidget/c$f;", "Lcom/whoop/ai/chat/domain/formwidget/c$g;", "Lcom/whoop/ai/chat/domain/formwidget/c$h;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC5935c {

    /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.c$a */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/c$a;", "Lcom/whoop/ai/chat/domain/formwidget/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC5935c {

        /* JADX INFO: renamed from: a */
        public static final a f23279a = new a();

        private a() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 1205272638;
        }

        public String toString() {
            return "ClearSubmitResult";
        }
    }

    /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.c$b */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/c$b;", "Lcom/whoop/ai/chat/domain/formwidget/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC5935c {

        /* JADX INFO: renamed from: a */
        public static final b f23280a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return 630118515;
        }

        public String toString() {
            return "GoBack";
        }
    }

    /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.c$c */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/c$c;", "Lcom/whoop/ai/chat/domain/formwidget/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC5935c {

        /* JADX INFO: renamed from: a */
        public static final c f23281a = new c();

        private c() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return -1771207751;
        }

        public String toString() {
            return "GoForward";
        }
    }

    /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.c$d */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\rR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0018\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/c$d;", "Lcom/whoop/ai/chat/domain/formwidget/c;", "", "formId", "questionId", "", "Lcom/whoop/ai/chat/domain/formwidget/h;", "selections", "Lcom/whoop/whoopaction/domain/models/Action;", "onAnswer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC5935c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String formId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String questionId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<C5940h> selections;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final Action onAnswer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String formId, String questionId, List<C5940h> selections, Action action) {
            super(null);
            AbstractC22676k.m65750j(formId, "formId");
            AbstractC22676k.m65750j(questionId, "questionId");
            AbstractC22676k.m65750j(selections, "selections");
            this.formId = formId;
            this.questionId = questionId;
            this.selections = selections;
            this.onAnswer = action;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFormId() {
            return this.formId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Action getOnAnswer() {
            return this.onAnswer;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getQuestionId() {
            return this.questionId;
        }

        /* JADX INFO: renamed from: d */
        public final List<C5940h> m17742d() {
            return this.selections;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.formId, dVar.formId) && AbstractC22676k.m65745e(this.questionId, dVar.questionId) && AbstractC22676k.m65745e(this.selections, dVar.selections) && AbstractC22676k.m65745e(this.onAnswer, dVar.onAnswer);
        }

        public int hashCode() {
            int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30450d(this.formId.hashCode() * 31, 31, this.questionId), 31, this.selections);
            Action action = this.onAnswer;
            return iM31983b + (action == null ? 0 : action.hashCode());
        }

        public String toString() {
            String str = this.formId;
            String str2 = this.questionId;
            List<C5940h> list = this.selections;
            Action action = this.onAnswer;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("PersistAnswers(formId=", str, ", questionId=", str2, ", selections=");
            sbM32001t.append(list);
            sbM32001t.append(", onAnswer=");
            sbM32001t.append(action);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }
    }

    /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.c$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/c$e;", "Lcom/whoop/ai/chat/domain/formwidget/c;", "", "formKey", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC5935c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String formKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String formKey) {
            super(null);
            AbstractC22676k.m65750j(formKey, "formKey");
            this.formKey = formKey;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFormKey() {
            return this.formKey;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && AbstractC22676k.m65745e(this.formKey, ((e) other).formKey);
        }

        public int hashCode() {
            return this.formKey.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Refresh(formKey=", this.formKey, ")");
        }
    }

    /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.c$f */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/c$f;", "Lcom/whoop/ai/chat/domain/formwidget/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC5935c {

        /* JADX INFO: renamed from: a */
        public static final f f23287a = new f();

        private f() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof f);
        }

        public int hashCode() {
            return -246860213;
        }

        public String toString() {
            return "Reset";
        }
    }

    /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.c$g */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/c$g;", "Lcom/whoop/ai/chat/domain/formwidget/c;", "Lcom/whoop/design/models/DesignSystemModel;", "widget", "<init>", "(Lcom/whoop/design/models/DesignSystemModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/models/DesignSystemModel;", "()Lcom/whoop/design/models/DesignSystemModel;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC5935c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final DesignSystemModel widget;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(DesignSystemModel widget) {
            super(null);
            AbstractC22676k.m65750j(widget, "widget");
            this.widget = widget;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DesignSystemModel getWidget() {
            return this.widget;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && AbstractC22676k.m65745e(this.widget, ((g) other).widget);
        }

        public int hashCode() {
            return this.widget.hashCode();
        }

        public String toString() {
            return "Seed(widget=" + this.widget + ")";
        }
    }

    /* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.c$h */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u0010R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b\u001a\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b\u001c\u0010$¨\u0006%"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/c$h;", "Lcom/whoop/ai/chat/domain/formwidget/c;", "", "formId", "questionId", "", "Lcom/whoop/ai/chat/domain/formwidget/h;", "selections", "", "isFinalQuestion", "Lcom/whoop/whoopaction/domain/models/Action;", "onAnswer", "onComplete", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/whoopaction/domain/models/Action;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "Ljava/util/List;", "e", "()Ljava/util/List;", "Z", "f", "()Z", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC5935c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String formId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String questionId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final List<C5940h> selections;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean isFinalQuestion;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final Action onAnswer;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final Action onComplete;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String formId, String questionId, List<C5940h> selections, boolean z4, Action action, Action action2) {
            super(null);
            AbstractC22676k.m65750j(formId, "formId");
            AbstractC22676k.m65750j(questionId, "questionId");
            AbstractC22676k.m65750j(selections, "selections");
            this.formId = formId;
            this.questionId = questionId;
            this.selections = selections;
            this.isFinalQuestion = z4;
            this.onAnswer = action;
            this.onComplete = action2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFormId() {
            return this.formId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Action getOnAnswer() {
            return this.onAnswer;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Action getOnComplete() {
            return this.onComplete;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getQuestionId() {
            return this.questionId;
        }

        /* JADX INFO: renamed from: e */
        public final List<C5940h> m17749e() {
            return this.selections;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return AbstractC22676k.m65745e(this.formId, hVar.formId) && AbstractC22676k.m65745e(this.questionId, hVar.questionId) && AbstractC22676k.m65745e(this.selections, hVar.selections) && this.isFinalQuestion == hVar.isFinalQuestion && AbstractC22676k.m65745e(this.onAnswer, hVar.onAnswer) && AbstractC22676k.m65745e(this.onComplete, hVar.onComplete);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsFinalQuestion() {
            return this.isFinalQuestion;
        }

        public int hashCode() {
            int iM8289b = AbstractC2875y.m8289b(AbstractC11895b.m31983b(AbstractC11266d.m30450d(this.formId.hashCode() * 31, 31, this.questionId), 31, this.selections), 31, this.isFinalQuestion);
            Action action = this.onAnswer;
            int iHashCode = (iM8289b + (action == null ? 0 : action.hashCode())) * 31;
            Action action2 = this.onComplete;
            return iHashCode + (action2 != null ? action2.hashCode() : 0);
        }

        public String toString() {
            String str = this.formId;
            String str2 = this.questionId;
            List<C5940h> list = this.selections;
            boolean z4 = this.isFinalQuestion;
            Action action = this.onAnswer;
            Action action2 = this.onComplete;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Submit(formId=", str, ", questionId=", str2, ", selections=");
            AbstractC26725a.m79512p(", isFinalQuestion=", ", onAnswer=", sbM32001t, list, z4);
            sbM32001t.append(action);
            sbM32001t.append(", onComplete=");
            sbM32001t.append(action2);
            sbM32001t.append(")");
            return sbM32001t.toString();
        }
    }

    public /* synthetic */ AbstractC5935c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC5935c() {
    }
}
