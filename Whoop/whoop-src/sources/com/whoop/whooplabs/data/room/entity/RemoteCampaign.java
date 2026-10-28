package com.whoop.whooplabs.data.room.entity;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import com.whoop.whooplabs.data.domain.LabsCampaign;
import com.whoop.whooplabs.data.domain.LegalDocument;
import com.whoop.whooplabs.data.domain.ProtocolStepWithOptions;
import d13.AbstractC11478a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nh3.AbstractC26725a;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J:\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\rJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0015R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0017R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b(\u0010\u0017¨\u0006)"}, m65681d2 = {"Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;", "Landroid/os/Parcelable;", "Lcom/whoop/whooplabs/data/domain/LabsCampaign;", "campaign", "", "Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;", "protocolSteps", "Lcom/whoop/whooplabs/data/domain/LegalDocument;", "legalDocuments", "<init>", "(Lcom/whoop/whooplabs/data/domain/LabsCampaign;Ljava/util/List;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/whoop/whooplabs/data/domain/LabsCampaign;", "component2", "()Ljava/util/List;", "component3", "copy", "(Lcom/whoop/whooplabs/data/domain/LabsCampaign;Ljava/util/List;Ljava/util/List;)Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/whooplabs/data/domain/LabsCampaign;", "getCampaign", "Ljava/util/List;", "getProtocolSteps", "getLegalDocuments", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class RemoteCampaign implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<RemoteCampaign> CREATOR = new Creator();
    private final LabsCampaign campaign;
    private final List<LegalDocument> legalDocuments;
    private final List<ProtocolStepWithOptions> protocolSteps;

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<RemoteCampaign> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RemoteCampaign createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            LabsCampaign labsCampaignCreateFromParcel = LabsCampaign.CREATOR.createFromParcel(parcel);
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iM79498b = 0;
            int iM79498b2 = 0;
            while (iM79498b2 != i13) {
                iM79498b2 = AbstractC26725a.m79498b(ProtocolStepWithOptions.CREATOR, parcel, arrayList, iM79498b2, 1);
            }
            int i14 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i14);
            while (iM79498b != i14) {
                iM79498b = AbstractC26725a.m79498b(LegalDocument.CREATOR, parcel, arrayList2, iM79498b, 1);
            }
            return new RemoteCampaign(labsCampaignCreateFromParcel, arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RemoteCampaign[] newArray(int i13) {
            return new RemoteCampaign[i13];
        }
    }

    public RemoteCampaign(LabsCampaign campaign, List<ProtocolStepWithOptions> protocolSteps, List<LegalDocument> legalDocuments) {
        AbstractC22676k.m65750j(campaign, "campaign");
        AbstractC22676k.m65750j(protocolSteps, "protocolSteps");
        AbstractC22676k.m65750j(legalDocuments, "legalDocuments");
        this.campaign = campaign;
        this.protocolSteps = protocolSteps;
        this.legalDocuments = legalDocuments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RemoteCampaign copy$default(RemoteCampaign remoteCampaign, LabsCampaign labsCampaign, List list, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            labsCampaign = remoteCampaign.campaign;
        }
        if ((i13 & 2) != 0) {
            list = remoteCampaign.protocolSteps;
        }
        if ((i13 & 4) != 0) {
            list2 = remoteCampaign.legalDocuments;
        }
        return remoteCampaign.copy(labsCampaign, list, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LabsCampaign getCampaign() {
        return this.campaign;
    }

    public final List<ProtocolStepWithOptions> component2() {
        return this.protocolSteps;
    }

    public final List<LegalDocument> component3() {
        return this.legalDocuments;
    }

    public final RemoteCampaign copy(LabsCampaign campaign, List<ProtocolStepWithOptions> protocolSteps, List<LegalDocument> legalDocuments) {
        AbstractC22676k.m65750j(campaign, "campaign");
        AbstractC22676k.m65750j(protocolSteps, "protocolSteps");
        AbstractC22676k.m65750j(legalDocuments, "legalDocuments");
        return new RemoteCampaign(campaign, protocolSteps, legalDocuments);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteCampaign)) {
            return false;
        }
        RemoteCampaign remoteCampaign = (RemoteCampaign) other;
        return AbstractC22676k.m65745e(this.campaign, remoteCampaign.campaign) && AbstractC22676k.m65745e(this.protocolSteps, remoteCampaign.protocolSteps) && AbstractC22676k.m65745e(this.legalDocuments, remoteCampaign.legalDocuments);
    }

    public final LabsCampaign getCampaign() {
        return this.campaign;
    }

    public final List<LegalDocument> getLegalDocuments() {
        return this.legalDocuments;
    }

    public final List<ProtocolStepWithOptions> getProtocolSteps() {
        return this.protocolSteps;
    }

    public int hashCode() {
        return this.legalDocuments.hashCode() + AbstractC11895b.m31983b(this.campaign.hashCode() * 31, 31, this.protocolSteps);
    }

    public String toString() {
        LabsCampaign labsCampaign = this.campaign;
        List<ProtocolStepWithOptions> list = this.protocolSteps;
        List<LegalDocument> list2 = this.legalDocuments;
        StringBuilder sb4 = new StringBuilder("RemoteCampaign(campaign=");
        sb4.append(labsCampaign);
        sb4.append(", protocolSteps=");
        sb4.append(list);
        sb4.append(", legalDocuments=");
        return AbstractC3855a.m11829m(sb4, list2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        this.campaign.writeToParcel(dest, flags);
        Iterator itM30863o = AbstractC11478a.m30863o(this.protocolSteps, dest);
        while (itM30863o.hasNext()) {
            ((ProtocolStepWithOptions) itM30863o.next()).writeToParcel(dest, flags);
        }
        Iterator itM30863o2 = AbstractC11478a.m30863o(this.legalDocuments, dest);
        while (itM30863o2.hasNext()) {
            ((LegalDocument) itM30863o2.next()).writeToParcel(dest, flags);
        }
    }
}
