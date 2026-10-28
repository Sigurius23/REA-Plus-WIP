package com.whoop.hormonalinsights.postpartum.domain.models;

import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import zn1.C40906a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004J\n\u0010!\u001a\u00020\tHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006#"}, m65681d2 = {"Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;", "", "id", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "type", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenType;", "content", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;", "navigationTitle", "", "navigationSubtitle", "<init>", "(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenType;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "getType", "()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenType;", "getContent", "()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;", "getNavigationTitle", "()Ljava/lang/String;", "getNavigationSubtitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i(with = C40906a.class)
public final /* data */ class HormonalScreen {
    private final HormonalScreenContent content;
    private final HormonalScreenId id;
    private final String navigationSubtitle;
    private final String navigationTitle;
    private final HormonalScreenType type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return C40906a.f176311a;
        }

        private Companion() {
        }
    }

    public HormonalScreen(HormonalScreenId id4, HormonalScreenType type, HormonalScreenContent content, String navigationTitle, String str) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(content, "content");
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        this.id = id4;
        this.type = type;
        this.content = content;
        this.navigationTitle = navigationTitle;
        this.navigationSubtitle = str;
    }

    public static /* synthetic */ HormonalScreen copy$default(HormonalScreen hormonalScreen, HormonalScreenId hormonalScreenId, HormonalScreenType hormonalScreenType, HormonalScreenContent hormonalScreenContent, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            hormonalScreenId = hormonalScreen.id;
        }
        if ((i13 & 2) != 0) {
            hormonalScreenType = hormonalScreen.type;
        }
        if ((i13 & 4) != 0) {
            hormonalScreenContent = hormonalScreen.content;
        }
        if ((i13 & 8) != 0) {
            str = hormonalScreen.navigationTitle;
        }
        if ((i13 & 16) != 0) {
            str2 = hormonalScreen.navigationSubtitle;
        }
        String str3 = str2;
        HormonalScreenContent hormonalScreenContent2 = hormonalScreenContent;
        return hormonalScreen.copy(hormonalScreenId, hormonalScreenType, hormonalScreenContent2, str, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HormonalScreenId getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HormonalScreenType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HormonalScreenContent getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNavigationSubtitle() {
        return this.navigationSubtitle;
    }

    public final HormonalScreen copy(HormonalScreenId id4, HormonalScreenType type, HormonalScreenContent content, String navigationTitle, String navigationSubtitle) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(content, "content");
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        return new HormonalScreen(id4, type, content, navigationTitle, navigationSubtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HormonalScreen)) {
            return false;
        }
        HormonalScreen hormonalScreen = (HormonalScreen) other;
        return this.id == hormonalScreen.id && this.type == hormonalScreen.type && AbstractC22676k.m65745e(this.content, hormonalScreen.content) && AbstractC22676k.m65745e(this.navigationTitle, hormonalScreen.navigationTitle) && AbstractC22676k.m65745e(this.navigationSubtitle, hormonalScreen.navigationSubtitle);
    }

    public final HormonalScreenContent getContent() {
        return this.content;
    }

    public final HormonalScreenId getId() {
        return this.id;
    }

    public final String getNavigationSubtitle() {
        return this.navigationSubtitle;
    }

    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    public final HormonalScreenType getType() {
        return this.type;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.content.hashCode() + ((this.type.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31, 31, this.navigationTitle);
        String str = this.navigationSubtitle;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        HormonalScreenId hormonalScreenId = this.id;
        HormonalScreenType hormonalScreenType = this.type;
        HormonalScreenContent hormonalScreenContent = this.content;
        String str = this.navigationTitle;
        String str2 = this.navigationSubtitle;
        StringBuilder sb4 = new StringBuilder("HormonalScreen(id=");
        sb4.append(hormonalScreenId);
        sb4.append(", type=");
        sb4.append(hormonalScreenType);
        sb4.append(", content=");
        sb4.append(hormonalScreenContent);
        sb4.append(", navigationTitle=");
        sb4.append(str);
        sb4.append(", navigationSubtitle=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }
}
