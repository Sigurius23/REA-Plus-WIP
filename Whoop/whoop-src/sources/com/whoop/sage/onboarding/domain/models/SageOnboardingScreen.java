package com.whoop.sage.onboarding.domain.models;

import h72.C16997b;
import h72.EnumC16996a;
import j72.EnumC21402g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001#B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f¨\u0006$"}, m65681d2 = {"Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;", "", "Lj72/g;", "id", "Lh72/a;", "type", "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;", "content", "<init>", "(Lj72/g;Lh72/a;Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;)V", "component1", "()Lj72/g;", "component2", "()Lh72/a;", "component3", "()Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;", "copy", "(Lj72/g;Lh72/a;Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;)Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj72/g;", "getId", "Lh72/a;", "getType", "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingContent;", "getContent", "Companion", "a", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i(with = C16997b.class)
public final /* data */ class SageOnboardingScreen {
    private final SageOnboardingContent content;
    private final EnumC21402g id;
    private final EnumC16996a type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.sage.onboarding.domain.models.SageOnboardingScreen$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingScreen;", "serializer", "()Lwc3/c;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return new C16997b();
        }

        private Companion() {
        }
    }

    public SageOnboardingScreen(EnumC21402g id4, EnumC16996a type, SageOnboardingContent content) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(content, "content");
        this.id = id4;
        this.type = type;
        this.content = content;
    }

    public static /* synthetic */ SageOnboardingScreen copy$default(SageOnboardingScreen sageOnboardingScreen, EnumC21402g enumC21402g, EnumC16996a enumC16996a, SageOnboardingContent sageOnboardingContent, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC21402g = sageOnboardingScreen.id;
        }
        if ((i13 & 2) != 0) {
            enumC16996a = sageOnboardingScreen.type;
        }
        if ((i13 & 4) != 0) {
            sageOnboardingContent = sageOnboardingScreen.content;
        }
        return sageOnboardingScreen.copy(enumC21402g, enumC16996a, sageOnboardingContent);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EnumC21402g getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EnumC16996a getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SageOnboardingContent getContent() {
        return this.content;
    }

    public final SageOnboardingScreen copy(EnumC21402g id4, EnumC16996a type, SageOnboardingContent content) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(content, "content");
        return new SageOnboardingScreen(id4, type, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SageOnboardingScreen)) {
            return false;
        }
        SageOnboardingScreen sageOnboardingScreen = (SageOnboardingScreen) other;
        return this.id == sageOnboardingScreen.id && this.type == sageOnboardingScreen.type && AbstractC22676k.m65745e(this.content, sageOnboardingScreen.content);
    }

    public final SageOnboardingContent getContent() {
        return this.content;
    }

    public final EnumC21402g getId() {
        return this.id;
    }

    public final EnumC16996a getType() {
        return this.type;
    }

    public int hashCode() {
        return this.content.hashCode() + ((this.type.hashCode() + (this.id.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "SageOnboardingScreen(id=" + this.id + ", type=" + this.type + ", content=" + this.content + ")";
    }
}
