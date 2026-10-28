package com.whoop.whooplabs.data.domain;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import ih0.AbstractC18489d0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m83.C25271y;
import org.joda.time.LocalDateTime;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u0000 K2\u00020\u0001:\u0001KBw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0019\u0010\u0016J\r\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJ\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010$J\u0012\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010,J\u0018\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b0\u00101J\u0088\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b4\u0010$J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u0010\u001bJ\u001a\u00108\u001a\u00020\u00142\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b8\u00109R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b=\u0010$R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b>\u0010$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b?\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010@\u001a\u0004\bA\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010B\u001a\u0004\bC\u0010*R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010D\u001a\u0004\bE\u0010,R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\bF\u0010,R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010G\u001a\u0004\bH\u0010/R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010I\u001a\u0004\bJ\u00101¨\u0006L"}, m65681d2 = {"Lcom/whoop/whooplabs/data/domain/LabsCampaign;", "Landroid/os/Parcelable;", "", "campaignId", "", "description", "name", "subtitle", "Lorg/joda/time/LocalDateTime;", "participationCooldownDate", "Lcom/whoop/whooplabs/data/domain/LabsProtocol;", "protocol", "additionalCollectionLength", "bthrAdditionalCollectionLength", "", "dataTypes", "Lcom/whoop/whooplabs/data/domain/LabsSession;", "session", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalDateTime;Lcom/whoop/whooplabs/data/domain/LabsProtocol;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/whoop/whooplabs/data/domain/LabsSession;)V", "", "containsRawData", "()Ljava/lang/Boolean;", "containsPpg", "containsLabrador", "containsImuData", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lorg/joda/time/LocalDateTime;", "component6", "()Lcom/whoop/whooplabs/data/domain/LabsProtocol;", "component7", "()Ljava/lang/Integer;", "component8", "component9", "()Ljava/util/List;", "component10", "()Lcom/whoop/whooplabs/data/domain/LabsSession;", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalDateTime;Lcom/whoop/whooplabs/data/domain/LabsProtocol;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/whoop/whooplabs/data/domain/LabsSession;)Lcom/whoop/whooplabs/data/domain/LabsCampaign;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getCampaignId", "Ljava/lang/String;", "getDescription", "getName", "getSubtitle", "Lorg/joda/time/LocalDateTime;", "getParticipationCooldownDate", "Lcom/whoop/whooplabs/data/domain/LabsProtocol;", "getProtocol", "Ljava/lang/Integer;", "getAdditionalCollectionLength", "getBthrAdditionalCollectionLength", "Ljava/util/List;", "getDataTypes", "Lcom/whoop/whooplabs/data/domain/LabsSession;", "getSession", "Companion", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class LabsCampaign implements Parcelable {
    public static final String IMU_ENTRY = "imu_data";
    public static final String LABRADOR_ENTRY = "labrador";
    public static final String PPG_ENTRY = "ppg_data";
    public static final String RAW_ENTRY = "raw_data";
    private final Integer additionalCollectionLength;
    private final Integer bthrAdditionalCollectionLength;
    private final int campaignId;
    private final List<String> dataTypes;
    private final String description;
    private final String name;
    private final LocalDateTime participationCooldownDate;
    private final LabsProtocol protocol;
    private final LabsSession session;
    private final String subtitle;
    public static final int $stable = 8;
    public static final Parcelable.Creator<LabsCampaign> CREATOR = new Creator();

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<LabsCampaign> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LabsCampaign createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new LabsCampaign(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), (LocalDateTime) parcel.readSerializable(), parcel.readInt() == 0 ? null : LabsProtocol.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.createStringArrayList(), parcel.readInt() != 0 ? LabsSession.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LabsCampaign[] newArray(int i13) {
            return new LabsCampaign[i13];
        }
    }

    public LabsCampaign(int i13, String description, String name, String str, LocalDateTime localDateTime, LabsProtocol labsProtocol, Integer num, Integer num2, List<String> list, LabsSession labsSession) {
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(name, "name");
        this.campaignId = i13;
        this.description = description;
        this.name = name;
        this.subtitle = str;
        this.participationCooldownDate = localDateTime;
        this.protocol = labsProtocol;
        this.additionalCollectionLength = num;
        this.bthrAdditionalCollectionLength = num2;
        this.dataTypes = list;
        this.session = labsSession;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LabsCampaign copy$default(LabsCampaign labsCampaign, int i13, String str, String str2, String str3, LocalDateTime localDateTime, LabsProtocol labsProtocol, Integer num, Integer num2, List list, LabsSession labsSession, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = labsCampaign.campaignId;
        }
        if ((i14 & 2) != 0) {
            str = labsCampaign.description;
        }
        if ((i14 & 4) != 0) {
            str2 = labsCampaign.name;
        }
        if ((i14 & 8) != 0) {
            str3 = labsCampaign.subtitle;
        }
        if ((i14 & 16) != 0) {
            localDateTime = labsCampaign.participationCooldownDate;
        }
        if ((i14 & 32) != 0) {
            labsProtocol = labsCampaign.protocol;
        }
        if ((i14 & 64) != 0) {
            num = labsCampaign.additionalCollectionLength;
        }
        if ((i14 & 128) != 0) {
            num2 = labsCampaign.bthrAdditionalCollectionLength;
        }
        if ((i14 & 256) != 0) {
            list = labsCampaign.dataTypes;
        }
        if ((i14 & 512) != 0) {
            labsSession = labsCampaign.session;
        }
        List list2 = list;
        LabsSession labsSession2 = labsSession;
        Integer num3 = num;
        Integer num4 = num2;
        LocalDateTime localDateTime2 = localDateTime;
        LabsProtocol labsProtocol2 = labsProtocol;
        return labsCampaign.copy(i13, str, str2, str3, localDateTime2, labsProtocol2, num3, num4, list2, labsSession2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCampaignId() {
        return this.campaignId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final LabsSession getSession() {
        return this.session;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final LocalDateTime getParticipationCooldownDate() {
        return this.participationCooldownDate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final LabsProtocol getProtocol() {
        return this.protocol;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getAdditionalCollectionLength() {
        return this.additionalCollectionLength;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getBthrAdditionalCollectionLength() {
        return this.bthrAdditionalCollectionLength;
    }

    public final List<String> component9() {
        return this.dataTypes;
    }

    public final Boolean containsImuData() {
        List<String> list = this.dataTypes;
        if (list != null) {
            return Boolean.valueOf(list.contains(IMU_ENTRY));
        }
        return null;
    }

    public final Boolean containsLabrador() {
        List<String> list = this.dataTypes;
        if (list == null) {
            return null;
        }
        List<String> list2 = list;
        boolean z4 = false;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (AbstractC39421y.m125930O((String) it.next(), LABRADOR_ENTRY, false)) {
                    z4 = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z4);
    }

    public final Boolean containsPpg() {
        List<String> list = this.dataTypes;
        if (list != null) {
            return Boolean.valueOf(list.contains(PPG_ENTRY));
        }
        return null;
    }

    public final Boolean containsRawData() {
        List<String> list = this.dataTypes;
        if (list != null) {
            return Boolean.valueOf(list.contains(RAW_ENTRY));
        }
        return null;
    }

    public final LabsCampaign copy(int campaignId, String description, String name, String subtitle, LocalDateTime participationCooldownDate, LabsProtocol protocol, Integer additionalCollectionLength, Integer bthrAdditionalCollectionLength, List<String> dataTypes, LabsSession session) {
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(name, "name");
        return new LabsCampaign(campaignId, description, name, subtitle, participationCooldownDate, protocol, additionalCollectionLength, bthrAdditionalCollectionLength, dataTypes, session);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabsCampaign)) {
            return false;
        }
        LabsCampaign labsCampaign = (LabsCampaign) other;
        return this.campaignId == labsCampaign.campaignId && AbstractC22676k.m65745e(this.description, labsCampaign.description) && AbstractC22676k.m65745e(this.name, labsCampaign.name) && AbstractC22676k.m65745e(this.subtitle, labsCampaign.subtitle) && AbstractC22676k.m65745e(this.participationCooldownDate, labsCampaign.participationCooldownDate) && AbstractC22676k.m65745e(this.protocol, labsCampaign.protocol) && AbstractC22676k.m65745e(this.additionalCollectionLength, labsCampaign.additionalCollectionLength) && AbstractC22676k.m65745e(this.bthrAdditionalCollectionLength, labsCampaign.bthrAdditionalCollectionLength) && AbstractC22676k.m65745e(this.dataTypes, labsCampaign.dataTypes) && AbstractC22676k.m65745e(this.session, labsCampaign.session);
    }

    public final Integer getAdditionalCollectionLength() {
        return this.additionalCollectionLength;
    }

    public final Integer getBthrAdditionalCollectionLength() {
        return this.bthrAdditionalCollectionLength;
    }

    public final int getCampaignId() {
        return this.campaignId;
    }

    public final List<String> getDataTypes() {
        return this.dataTypes;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public final LocalDateTime getParticipationCooldownDate() {
        return this.participationCooldownDate;
    }

    public final LabsProtocol getProtocol() {
        return this.protocol;
    }

    public final LabsSession getSession() {
        return this.session;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(Integer.hashCode(this.campaignId) * 31, 31, this.description), 31, this.name);
        String str = this.subtitle;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        LocalDateTime localDateTime = this.participationCooldownDate;
        int iHashCode2 = (iHashCode + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        LabsProtocol labsProtocol = this.protocol;
        int iHashCode3 = (iHashCode2 + (labsProtocol == null ? 0 : labsProtocol.hashCode())) * 31;
        Integer num = this.additionalCollectionLength;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.bthrAdditionalCollectionLength;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<String> list = this.dataTypes;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        LabsSession labsSession = this.session;
        return iHashCode6 + (labsSession != null ? labsSession.hashCode() : 0);
    }

    public String toString() {
        int i13 = this.campaignId;
        String str = this.description;
        String str2 = this.name;
        String str3 = this.subtitle;
        LocalDateTime localDateTime = this.participationCooldownDate;
        LabsProtocol labsProtocol = this.protocol;
        Integer num = this.additionalCollectionLength;
        Integer num2 = this.bthrAdditionalCollectionLength;
        List<String> list = this.dataTypes;
        LabsSession labsSession = this.session;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "LabsCampaign(campaignId=", ", description=", str, ", name=");
        AbstractC11266d.m30444B(sbM53373n, str2, ", subtitle=", str3, ", participationCooldownDate=");
        sbM53373n.append(localDateTime);
        sbM53373n.append(", protocol=");
        sbM53373n.append(labsProtocol);
        sbM53373n.append(", additionalCollectionLength=");
        AbstractC31061c.m95621A(sbM53373n, num, ", bthrAdditionalCollectionLength=", num2, ", dataTypes=");
        sbM53373n.append(list);
        sbM53373n.append(", session=");
        sbM53373n.append(labsSession);
        sbM53373n.append(")");
        return sbM53373n.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.campaignId);
        dest.writeString(this.description);
        dest.writeString(this.name);
        dest.writeString(this.subtitle);
        dest.writeSerializable(this.participationCooldownDate);
        LabsProtocol labsProtocol = this.protocol;
        if (labsProtocol == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            labsProtocol.writeToParcel(dest, flags);
        }
        Integer num = this.additionalCollectionLength;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        Integer num2 = this.bthrAdditionalCollectionLength;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num2);
        }
        dest.writeStringList(this.dataTypes);
        LabsSession labsSession = this.session;
        if (labsSession == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            labsSession.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ LabsCampaign(int i13, String str, String str2, String str3, LocalDateTime localDateTime, LabsProtocol labsProtocol, Integer num, Integer num2, List list, LabsSession labsSession, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, str, str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : localDateTime, labsProtocol, (i14 & 64) != 0 ? null : num, (i14 & 128) != 0 ? null : num2, (i14 & 256) != 0 ? C25271y.f99162w : list, (i14 & 512) != 0 ? null : labsSession);
    }
}
