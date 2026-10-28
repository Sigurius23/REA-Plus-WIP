package com.whoop.p057ai.chat.domain.formwidget;

import c13.AbstractC3855a;
import com.whoop.design.models.DesignSystemModel;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import m83.C25272z;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0013Jp\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b(\u0010\u0019R)\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f8\u0006¢\u0006\f\n\u0004\b*\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b/\u00101\u001a\u0004\b,\u0010\u0017¨\u00062"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/d;", "", "Lcom/whoop/ai/chat/domain/formwidget/b;", "currentDialogType", "Lcom/whoop/design/models/DesignSystemModel;", "widget", "Lcom/whoop/ai/chat/domain/formwidget/j;", "submitState", "Lcom/whoop/ai/chat/domain/formwidget/i;", "pendingResult", "", "currentQuestionIndex", "", "", "", "Lcom/whoop/ai/chat/domain/formwidget/h;", "savedAnswers", "moderationError", "<init>", "(Lcom/whoop/ai/chat/domain/formwidget/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/ai/chat/domain/formwidget/j;Lcom/whoop/ai/chat/domain/formwidget/i;ILjava/util/Map;Ljava/lang/String;)V", "a", "(Lcom/whoop/ai/chat/domain/formwidget/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/ai/chat/domain/formwidget/j;Lcom/whoop/ai/chat/domain/formwidget/i;ILjava/util/Map;Ljava/lang/String;)Lcom/whoop/ai/chat/domain/formwidget/d;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/ai/chat/domain/formwidget/b;", "c", "()Lcom/whoop/ai/chat/domain/formwidget/b;", "b", "Lcom/whoop/design/models/DesignSystemModel;", "i", "()Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/ai/chat/domain/formwidget/j;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/ai/chat/domain/formwidget/j;", "d", "Lcom/whoop/ai/chat/domain/formwidget/i;", "f", "()Lcom/whoop/ai/chat/domain/formwidget/i;", "e", "I", "Ljava/util/Map;", "g", "()Ljava/util/Map;", "Ljava/lang/String;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C5936d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC5934b currentDialogType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final DesignSystemModel widget;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC5942j submitState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC5941i pendingResult;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int currentQuestionIndex;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Map<String, List<C5940h>> savedAnswers;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String moderationError;

    /* JADX WARN: Multi-variable type inference failed */
    public C5936d(InterfaceC5934b interfaceC5934b, DesignSystemModel designSystemModel, InterfaceC5942j submitState, InterfaceC5941i interfaceC5941i, int i13, Map<String, ? extends List<C5940h>> savedAnswers, String str) {
        AbstractC22676k.m65750j(submitState, "submitState");
        AbstractC22676k.m65750j(savedAnswers, "savedAnswers");
        this.currentDialogType = interfaceC5934b;
        this.widget = designSystemModel;
        this.submitState = submitState;
        this.pendingResult = interfaceC5941i;
        this.currentQuestionIndex = i13;
        this.savedAnswers = savedAnswers;
        this.moderationError = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C5936d m17751b(C5936d c5936d, InterfaceC5934b interfaceC5934b, DesignSystemModel designSystemModel, InterfaceC5942j interfaceC5942j, InterfaceC5941i interfaceC5941i, int i13, Map map, String str, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            interfaceC5934b = c5936d.currentDialogType;
        }
        if ((i14 & 2) != 0) {
            designSystemModel = c5936d.widget;
        }
        if ((i14 & 4) != 0) {
            interfaceC5942j = c5936d.submitState;
        }
        if ((i14 & 8) != 0) {
            interfaceC5941i = c5936d.pendingResult;
        }
        if ((i14 & 16) != 0) {
            i13 = c5936d.currentQuestionIndex;
        }
        if ((i14 & 32) != 0) {
            map = c5936d.savedAnswers;
        }
        if ((i14 & 64) != 0) {
            str = c5936d.moderationError;
        }
        Map map2 = map;
        String str2 = str;
        int i15 = i13;
        InterfaceC5942j interfaceC5942j2 = interfaceC5942j;
        return c5936d.m17752a(interfaceC5934b, designSystemModel, interfaceC5942j2, interfaceC5941i, i15, map2, str2);
    }

    /* JADX INFO: renamed from: a */
    public final C5936d m17752a(InterfaceC5934b currentDialogType, DesignSystemModel widget, InterfaceC5942j submitState, InterfaceC5941i pendingResult, int currentQuestionIndex, Map<String, ? extends List<C5940h>> savedAnswers, String moderationError) {
        AbstractC22676k.m65750j(submitState, "submitState");
        AbstractC22676k.m65750j(savedAnswers, "savedAnswers");
        return new C5936d(currentDialogType, widget, submitState, pendingResult, currentQuestionIndex, savedAnswers, moderationError);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InterfaceC5934b getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getCurrentQuestionIndex() {
        return this.currentQuestionIndex;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getModerationError() {
        return this.moderationError;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C5936d)) {
            return false;
        }
        C5936d c5936d = (C5936d) other;
        return AbstractC22676k.m65745e(this.currentDialogType, c5936d.currentDialogType) && AbstractC22676k.m65745e(this.widget, c5936d.widget) && AbstractC22676k.m65745e(this.submitState, c5936d.submitState) && AbstractC22676k.m65745e(this.pendingResult, c5936d.pendingResult) && this.currentQuestionIndex == c5936d.currentQuestionIndex && AbstractC22676k.m65745e(this.savedAnswers, c5936d.savedAnswers) && AbstractC22676k.m65745e(this.moderationError, c5936d.moderationError);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final InterfaceC5941i getPendingResult() {
        return this.pendingResult;
    }

    /* JADX INFO: renamed from: g */
    public final Map<String, List<C5940h>> m17757g() {
        return this.savedAnswers;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final InterfaceC5942j getSubmitState() {
        return this.submitState;
    }

    public int hashCode() {
        InterfaceC5934b interfaceC5934b = this.currentDialogType;
        int iHashCode = (interfaceC5934b == null ? 0 : interfaceC5934b.hashCode()) * 31;
        DesignSystemModel designSystemModel = this.widget;
        int iHashCode2 = (this.submitState.hashCode() + ((iHashCode + (designSystemModel == null ? 0 : designSystemModel.hashCode())) * 31)) * 31;
        InterfaceC5941i interfaceC5941i = this.pendingResult;
        int iM11821e = AbstractC3855a.m11821e(this.savedAnswers, AbstractC11266d.m30448b(this.currentQuestionIndex, (iHashCode2 + (interfaceC5941i == null ? 0 : interfaceC5941i.hashCode())) * 31, 31), 31);
        String str = this.moderationError;
        return iM11821e + (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final DesignSystemModel getWidget() {
        return this.widget;
    }

    public String toString() {
        InterfaceC5934b interfaceC5934b = this.currentDialogType;
        DesignSystemModel designSystemModel = this.widget;
        InterfaceC5942j interfaceC5942j = this.submitState;
        InterfaceC5941i interfaceC5941i = this.pendingResult;
        int i13 = this.currentQuestionIndex;
        Map<String, List<C5940h>> map = this.savedAnswers;
        String str = this.moderationError;
        StringBuilder sb4 = new StringBuilder("FormWidgetDomainState(currentDialogType=");
        sb4.append(interfaceC5934b);
        sb4.append(", widget=");
        sb4.append(designSystemModel);
        sb4.append(", submitState=");
        sb4.append(interfaceC5942j);
        sb4.append(", pendingResult=");
        sb4.append(interfaceC5941i);
        sb4.append(", currentQuestionIndex=");
        sb4.append(i13);
        sb4.append(", savedAnswers=");
        sb4.append(map);
        sb4.append(", moderationError=");
        return AbstractC25012a.m73376i(str, ")", sb4);
    }

    public /* synthetic */ C5936d(InterfaceC5934b interfaceC5934b, DesignSystemModel designSystemModel, InterfaceC5942j interfaceC5942j, InterfaceC5941i interfaceC5941i, int i13, Map map, String str, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : interfaceC5934b, (i14 & 2) != 0 ? null : designSystemModel, (i14 & 4) != 0 ? InterfaceC5942j.c.f23434a : interfaceC5942j, (i14 & 8) != 0 ? null : interfaceC5941i, (i14 & 16) != 0 ? 0 : i13, (i14 & 32) != 0 ? C25272z.f99163w : map, (i14 & 64) != 0 ? null : str);
    }
}
