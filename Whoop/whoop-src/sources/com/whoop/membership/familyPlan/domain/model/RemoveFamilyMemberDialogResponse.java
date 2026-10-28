package com.whoop.membership.familyPlan.domain.model;

import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.InfoCalloutTileModel$$serializer;
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
import ri2.C31469a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ>\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b0\u0010\u001f¨\u00064"}, m65681d2 = {"Lcom/whoop/membership/familyPlan/domain/model/RemoveFamilyMemberDialogResponse;", "", "", "title", "", "Lcom/whoop/design/models/InfoCalloutTileModel;", "callouts", "Lcom/whoop/membership/familyPlan/domain/model/Cta;", "primaryCta", "secondaryCta", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/membership/familyPlan/domain/model/Cta;Lcom/whoop/membership/familyPlan/domain/model/Cta;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/membership/familyPlan/domain/model/Cta;Lcom/whoop/membership/familyPlan/domain/model/Cta;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$membership_release", "(Lcom/whoop/membership/familyPlan/domain/model/RemoveFamilyMemberDialogResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/membership/familyPlan/domain/model/Cta;", "component4", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/membership/familyPlan/domain/model/Cta;Lcom/whoop/membership/familyPlan/domain/model/Cta;)Lcom/whoop/membership/familyPlan/domain/model/RemoveFamilyMemberDialogResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getCallouts", "Lcom/whoop/membership/familyPlan/domain/model/Cta;", "getPrimaryCta", "getSecondaryCta", "Companion", "$serializer", "a", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class RemoveFamilyMemberDialogResponse {
    private final List<InfoCalloutTileModel> callouts;
    private final Cta primaryCta;
    private final Cta secondaryCta;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C31469a(28)), null, null};

    /* JADX INFO: renamed from: com.whoop.membership.familyPlan.domain.model.RemoveFamilyMemberDialogResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/membership/familyPlan/domain/model/RemoveFamilyMemberDialogResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/membership/familyPlan/domain/model/RemoveFamilyMemberDialogResponse;", "serializer", "()Lwc3/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return RemoveFamilyMemberDialogResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ RemoveFamilyMemberDialogResponse(int i13, String str, List list, Cta cta, Cta cta2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, RemoveFamilyMemberDialogResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.callouts = list;
        this.primaryCta = cta;
        this.secondaryCta = cta2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(InfoCalloutTileModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RemoveFamilyMemberDialogResponse copy$default(RemoveFamilyMemberDialogResponse removeFamilyMemberDialogResponse, String str, List list, Cta cta, Cta cta2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = removeFamilyMemberDialogResponse.title;
        }
        if ((i13 & 2) != 0) {
            list = removeFamilyMemberDialogResponse.callouts;
        }
        if ((i13 & 4) != 0) {
            cta = removeFamilyMemberDialogResponse.primaryCta;
        }
        if ((i13 & 8) != 0) {
            cta2 = removeFamilyMemberDialogResponse.secondaryCta;
        }
        return removeFamilyMemberDialogResponse.copy(str, list, cta, cta2);
    }

    public static final /* synthetic */ void write$Self$membership_release(RemoveFamilyMemberDialogResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.callouts);
        Cta$$serializer cta$$serializer = Cta$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 2, cta$$serializer, self.primaryCta);
        output.encodeSerializableElement(serialDesc, 3, cta$$serializer, self.secondaryCta);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<InfoCalloutTileModel> component2() {
        return this.callouts;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Cta getPrimaryCta() {
        return this.primaryCta;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Cta getSecondaryCta() {
        return this.secondaryCta;
    }

    public final RemoveFamilyMemberDialogResponse copy(String title, List<InfoCalloutTileModel> callouts, Cta primaryCta, Cta secondaryCta) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(callouts, "callouts");
        AbstractC22676k.m65750j(primaryCta, "primaryCta");
        AbstractC22676k.m65750j(secondaryCta, "secondaryCta");
        return new RemoveFamilyMemberDialogResponse(title, callouts, primaryCta, secondaryCta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoveFamilyMemberDialogResponse)) {
            return false;
        }
        RemoveFamilyMemberDialogResponse removeFamilyMemberDialogResponse = (RemoveFamilyMemberDialogResponse) other;
        return AbstractC22676k.m65745e(this.title, removeFamilyMemberDialogResponse.title) && AbstractC22676k.m65745e(this.callouts, removeFamilyMemberDialogResponse.callouts) && AbstractC22676k.m65745e(this.primaryCta, removeFamilyMemberDialogResponse.primaryCta) && AbstractC22676k.m65745e(this.secondaryCta, removeFamilyMemberDialogResponse.secondaryCta);
    }

    public final List<InfoCalloutTileModel> getCallouts() {
        return this.callouts;
    }

    public final Cta getPrimaryCta() {
        return this.primaryCta;
    }

    public final Cta getSecondaryCta() {
        return this.secondaryCta;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.secondaryCta.hashCode() + ((this.primaryCta.hashCode() + AbstractC11895b.m31983b(this.title.hashCode() * 31, 31, this.callouts)) * 31);
    }

    public String toString() {
        String str = this.title;
        List<InfoCalloutTileModel> list = this.callouts;
        Cta cta = this.primaryCta;
        Cta cta2 = this.secondaryCta;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("RemoveFamilyMemberDialogResponse(title=", str, ", callouts=", ", primaryCta=", list);
        sbM94766o.append(cta);
        sbM94766o.append(", secondaryCta=");
        sbM94766o.append(cta2);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public RemoveFamilyMemberDialogResponse(String title, List<InfoCalloutTileModel> callouts, Cta primaryCta, Cta secondaryCta) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(callouts, "callouts");
        AbstractC22676k.m65750j(primaryCta, "primaryCta");
        AbstractC22676k.m65750j(secondaryCta, "secondaryCta");
        this.title = title;
        this.callouts = callouts;
        this.primaryCta = primaryCta;
        this.secondaryCta = secondaryCta;
    }
}
