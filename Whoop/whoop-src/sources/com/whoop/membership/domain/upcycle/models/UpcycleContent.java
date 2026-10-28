package com.whoop.membership.domain.upcycle.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import ut2.C35231a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ6\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00060"}, m65681d2 = {"Lcom/whoop/membership/domain/upcycle/models/UpcycleContent;", "", "", "title", "", "Lcom/whoop/membership/domain/upcycle/models/LineItem;", "lineItems", "Lcom/whoop/membership/domain/upcycle/models/Cta;", "cta", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/membership/domain/upcycle/models/Cta;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/membership/domain/upcycle/models/Cta;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$membership_release", "(Lcom/whoop/membership/domain/upcycle/models/UpcycleContent;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/membership/domain/upcycle/models/Cta;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/membership/domain/upcycle/models/Cta;)Lcom/whoop/membership/domain/upcycle/models/UpcycleContent;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getLineItems", "Lcom/whoop/membership/domain/upcycle/models/Cta;", "getCta", "Companion", "$serializer", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class UpcycleContent {
    private final Cta cta;
    private final List<LineItem> lineItems;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C35231a(12)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/membership/domain/upcycle/models/UpcycleContent$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/membership/domain/upcycle/models/UpcycleContent;", "serializer", "()Lwc3/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return UpcycleContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ UpcycleContent(int i13, String str, List list, Cta cta, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, UpcycleContent$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.lineItems = list;
        this.cta = cta;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(LineItem$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpcycleContent copy$default(UpcycleContent upcycleContent, String str, List list, Cta cta, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = upcycleContent.title;
        }
        if ((i13 & 2) != 0) {
            list = upcycleContent.lineItems;
        }
        if ((i13 & 4) != 0) {
            cta = upcycleContent.cta;
        }
        return upcycleContent.copy(str, list, cta);
    }

    public static final /* synthetic */ void write$Self$membership_release(UpcycleContent self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.lineItems);
        output.encodeNullableSerializableElement(serialDesc, 2, Cta$$serializer.INSTANCE, self.cta);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<LineItem> component2() {
        return this.lineItems;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Cta getCta() {
        return this.cta;
    }

    public final UpcycleContent copy(String title, List<LineItem> lineItems, Cta cta) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(lineItems, "lineItems");
        return new UpcycleContent(title, lineItems, cta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpcycleContent)) {
            return false;
        }
        UpcycleContent upcycleContent = (UpcycleContent) other;
        return AbstractC22676k.m65745e(this.title, upcycleContent.title) && AbstractC22676k.m65745e(this.lineItems, upcycleContent.lineItems) && AbstractC22676k.m65745e(this.cta, upcycleContent.cta);
    }

    public final Cta getCta() {
        return this.cta;
    }

    public final List<LineItem> getLineItems() {
        return this.lineItems;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.title.hashCode() * 31, 31, this.lineItems);
        Cta cta = this.cta;
        return iM31983b + (cta == null ? 0 : cta.hashCode());
    }

    public String toString() {
        String str = this.title;
        List<LineItem> list = this.lineItems;
        Cta cta = this.cta;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("UpcycleContent(title=", str, ", lineItems=", ", cta=", list);
        sbM94766o.append(cta);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public UpcycleContent(String title, List<LineItem> lineItems, Cta cta) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(lineItems, "lineItems");
        this.title = title;
        this.lineItems = lineItems;
        this.cta = cta;
    }
}
