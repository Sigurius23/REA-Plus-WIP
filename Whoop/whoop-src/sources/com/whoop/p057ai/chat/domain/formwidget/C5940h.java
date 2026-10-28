package com.whoop.p057ai.chat.domain.formwidget;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.whoop.ai.chat.domain.formwidget.h */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0015\u0010\n¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/ai/chat/domain/formwidget/h;", "", "", "optionId", "label", "value", "userInputText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C5940h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String optionId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String value;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String userInputText;

    public C5940h(String optionId, String label, String value, String str) {
        AbstractC22676k.m65750j(optionId, "optionId");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(value, "value");
        this.optionId = optionId;
        this.label = label;
        this.value = value;
        this.userInputText = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getOptionId() {
        return this.optionId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getUserInputText() {
        return this.userInputText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C5940h)) {
            return false;
        }
        C5940h c5940h = (C5940h) other;
        return AbstractC22676k.m65745e(this.optionId, c5940h.optionId) && AbstractC22676k.m65745e(this.label, c5940h.label) && AbstractC22676k.m65745e(this.value, c5940h.value) && AbstractC22676k.m65745e(this.userInputText, c5940h.userInputText);
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.optionId.hashCode() * 31, 31, this.label), 31, this.value);
        String str = this.userInputText;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.optionId;
        String str2 = this.label;
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("SelectedOption(optionId=", str, ", label=", str2, ", value="), this.value, ", userInputText=", this.userInputText, ")");
    }

    public /* synthetic */ C5940h(String str, String str2, String str3, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i13 & 8) != 0 ? null : str4);
    }
}
