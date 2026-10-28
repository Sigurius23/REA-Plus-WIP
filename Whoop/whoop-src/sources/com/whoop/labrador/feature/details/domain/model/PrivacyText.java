package com.whoop.labrador.feature.details.domain.model;

import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/labrador/feature/details/domain/model/PrivacyText;", "", "title", "", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class PrivacyText {
    public static final int $stable = 0;
    private final String description;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public PrivacyText() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PrivacyText copy$default(PrivacyText privacyText, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = privacyText.title;
        }
        if ((i13 & 2) != 0) {
            str2 = privacyText.description;
        }
        return privacyText.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final PrivacyText copy(String title, String description) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        return new PrivacyText(title, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrivacyText)) {
            return false;
        }
        PrivacyText privacyText = (PrivacyText) other;
        return AbstractC22676k.m65745e(this.title, privacyText.title) && AbstractC22676k.m65745e(this.description, privacyText.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.description.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return AbstractC2875y.m8300m("PrivacyText(title=", this.title, ", description=", this.description, ")");
    }

    public PrivacyText(String title, String description) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        this.title = title;
        this.description = description;
    }

    public /* synthetic */ PrivacyText(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2);
    }
}
