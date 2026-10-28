package com.whoop.membership.returns.domain.models;

import gz0.EnumC16313m0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/membership/returns/domain/models/InstructionDomainHolder;", "", "Lgz0/m0;", "icon", "", "markdownText", "<init>", "(Lgz0/m0;Ljava/lang/String;)V", "component1", "()Lgz0/m0;", "component2", "()Ljava/lang/String;", "copy", "(Lgz0/m0;Ljava/lang/String;)Lcom/whoop/membership/returns/domain/models/InstructionDomainHolder;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lgz0/m0;", "getIcon", "Ljava/lang/String;", "getMarkdownText", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class InstructionDomainHolder {
    public static final int $stable = 0;
    private final EnumC16313m0 icon;
    private final String markdownText;

    public InstructionDomainHolder(EnumC16313m0 icon, String markdownText) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(markdownText, "markdownText");
        this.icon = icon;
        this.markdownText = markdownText;
    }

    public static /* synthetic */ InstructionDomainHolder copy$default(InstructionDomainHolder instructionDomainHolder, EnumC16313m0 enumC16313m0, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC16313m0 = instructionDomainHolder.icon;
        }
        if ((i13 & 2) != 0) {
            str = instructionDomainHolder.markdownText;
        }
        return instructionDomainHolder.copy(enumC16313m0, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMarkdownText() {
        return this.markdownText;
    }

    public final InstructionDomainHolder copy(EnumC16313m0 icon, String markdownText) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(markdownText, "markdownText");
        return new InstructionDomainHolder(icon, markdownText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstructionDomainHolder)) {
            return false;
        }
        InstructionDomainHolder instructionDomainHolder = (InstructionDomainHolder) other;
        return this.icon == instructionDomainHolder.icon && AbstractC22676k.m65745e(this.markdownText, instructionDomainHolder.markdownText);
    }

    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    public final String getMarkdownText() {
        return this.markdownText;
    }

    public int hashCode() {
        return this.markdownText.hashCode() + (this.icon.hashCode() * 31);
    }

    public String toString() {
        return "InstructionDomainHolder(icon=" + this.icon + ", markdownText=" + this.markdownText + ")";
    }
}
