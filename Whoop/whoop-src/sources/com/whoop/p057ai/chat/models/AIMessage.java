package com.whoop.p057ai.chat.models;

import c13.AbstractC3855a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.service.network.model.UserState;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.UUID;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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
import xa1.C38138a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ4\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0019R&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001c¨\u00060"}, m65681d2 = {"Lcom/whoop/ai/chat/models/AIMessage;", "", "", "id", "role", "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/ai/chat/models/AIMessage;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/ai/chat/models/AIMessage;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getRole", "Ljava/util/List;", "getItems", "getItems$annotations", "()V", "Companion", "$serializer", "a", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AIMessage {
    private final String id;
    private final List<DesignSystemModel> items;
    private final String role;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C38138a(14))};

    /* JADX INFO: renamed from: com.whoop.ai.chat.models.AIMessage$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/ai/chat/models/AIMessage$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/ai/chat/models/AIMessage;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AIMessage$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AIMessage() {
        this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(List.class), new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0])), new InterfaceC37138c[]{new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0])});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AIMessage copy$default(AIMessage aIMessage, String str, String str2, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = aIMessage.id;
        }
        if ((i13 & 2) != 0) {
            str2 = aIMessage.role;
        }
        if ((i13 & 4) != 0) {
            list = aIMessage.items;
        }
        return aIMessage.copy(str, str2, list);
    }

    public static /* synthetic */ void getItems$annotations() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public static final /* synthetic */ void write$Self$bot_release(AIMessage self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0)) {
            output.encodeStringElement(serialDesc, 0, self.id);
        } else {
            String str = self.id;
            String string = UUID.randomUUID().toString();
            AbstractC22676k.m65749i(string, "toString(...)");
            if (!AbstractC22676k.m65745e(str, string)) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.role, UserState.Sources.USER)) {
            output.encodeStringElement(serialDesc, 1, self.role);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && AbstractC22676k.m65745e(self.items, C25271y.f99162w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.items);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    public final List<DesignSystemModel> component3() {
        return this.items;
    }

    public final AIMessage copy(String id4, String role, List<? extends DesignSystemModel> items) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(role, "role");
        AbstractC22676k.m65750j(items, "items");
        return new AIMessage(id4, role, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AIMessage)) {
            return false;
        }
        AIMessage aIMessage = (AIMessage) other;
        return AbstractC22676k.m65745e(this.id, aIMessage.id) && AbstractC22676k.m65745e(this.role, aIMessage.role) && AbstractC22676k.m65745e(this.items, aIMessage.items);
    }

    public final String getId() {
        return this.id;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final String getRole() {
        return this.role;
    }

    public int hashCode() {
        return this.items.hashCode() + AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.role);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.role;
        return AbstractC3855a.m11829m(AbstractC11895b.m32001t("AIMessage(id=", str, ", role=", str2, ", items="), this.items, ")");
    }

    public /* synthetic */ AIMessage(int i13, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.id = (i13 & 1) == 0 ? AbstractC11895b.m31995n("toString(...)") : str;
        if ((i13 & 2) == 0) {
            this.role = UserState.Sources.USER;
        } else {
            this.role = str2;
        }
        if ((i13 & 4) == 0) {
            this.items = C25271y.f99162w;
        } else {
            this.items = list;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AIMessage(String id4, String role, List<? extends DesignSystemModel> items) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(role, "role");
        AbstractC22676k.m65750j(items, "items");
        this.id = id4;
        this.role = role;
        this.items = items;
    }

    public /* synthetic */ AIMessage(String str, String str2, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC11895b.m31995n("toString(...)") : str, (i13 & 2) != 0 ? UserState.Sources.USER : str2, (i13 & 4) != 0 ? C25271y.f99162w : list);
    }
}
