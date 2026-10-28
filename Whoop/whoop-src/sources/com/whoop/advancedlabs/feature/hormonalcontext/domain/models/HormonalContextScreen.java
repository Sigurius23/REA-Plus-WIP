package com.whoop.advancedlabs.feature.hormonalcontext.domain.models;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m65681d2 = {"Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen;", "", "id", "", "type", "content", "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenContent;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenContent;)V", "getId", "()Ljava/lang/String;", "getType", "getContent", "()Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenContent;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i(with = HormonalContextScreenSerializer.class)
public final /* data */ class HormonalContextScreen {
    private final HormonalContextScreenContent content;
    private final String id;
    private final String type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreen;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HormonalContextScreenSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public HormonalContextScreen(String id4, String type, HormonalContextScreenContent content) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(content, "content");
        this.id = id4;
        this.type = type;
        this.content = content;
    }

    public static /* synthetic */ HormonalContextScreen copy$default(HormonalContextScreen hormonalContextScreen, String str, String str2, HormonalContextScreenContent hormonalContextScreenContent, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = hormonalContextScreen.id;
        }
        if ((i13 & 2) != 0) {
            str2 = hormonalContextScreen.type;
        }
        if ((i13 & 4) != 0) {
            hormonalContextScreenContent = hormonalContextScreen.content;
        }
        return hormonalContextScreen.copy(str, str2, hormonalContextScreenContent);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HormonalContextScreenContent getContent() {
        return this.content;
    }

    public final HormonalContextScreen copy(String id4, String type, HormonalContextScreenContent content) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(content, "content");
        return new HormonalContextScreen(id4, type, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HormonalContextScreen)) {
            return false;
        }
        HormonalContextScreen hormonalContextScreen = (HormonalContextScreen) other;
        return AbstractC22676k.m65745e(this.id, hormonalContextScreen.id) && AbstractC22676k.m65745e(this.type, hormonalContextScreen.type) && AbstractC22676k.m65745e(this.content, hormonalContextScreen.content);
    }

    public final HormonalContextScreenContent getContent() {
        return this.content;
    }

    public final String getId() {
        return this.id;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.content.hashCode() + AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.type);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.type;
        HormonalContextScreenContent hormonalContextScreenContent = this.content;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HormonalContextScreen(id=", str, ", type=", str2, ", content=");
        sbM32001t.append(hormonalContextScreenContent);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
