package com.whoop.whooplabs.data.domain;

import android.os.Parcel;
import android.os.Parcelable;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b\"\u0010\u0013¨\u0006#"}, m65681d2 = {"Lcom/whoop/whooplabs/data/domain/LabsProtocol;", "Landroid/os/Parcelable;", "", "protocolId", "", "protocolName", "pdfUrl", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "()Ljava/lang/String;", "component3", "copy", "(ILjava/lang/String;Ljava/lang/String;)Lcom/whoop/whooplabs/data/domain/LabsProtocol;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getProtocolId", "Ljava/lang/String;", "getProtocolName", "getPdfUrl", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class LabsProtocol implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<LabsProtocol> CREATOR = new Creator();
    private final String pdfUrl;
    private final int protocolId;
    private final String protocolName;

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<LabsProtocol> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LabsProtocol createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new LabsProtocol(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LabsProtocol[] newArray(int i13) {
            return new LabsProtocol[i13];
        }
    }

    public LabsProtocol(int i13, String protocolName, String pdfUrl) {
        AbstractC22676k.m65750j(protocolName, "protocolName");
        AbstractC22676k.m65750j(pdfUrl, "pdfUrl");
        this.protocolId = i13;
        this.protocolName = protocolName;
        this.pdfUrl = pdfUrl;
    }

    public static /* synthetic */ LabsProtocol copy$default(LabsProtocol labsProtocol, int i13, String str, String str2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = labsProtocol.protocolId;
        }
        if ((i14 & 2) != 0) {
            str = labsProtocol.protocolName;
        }
        if ((i14 & 4) != 0) {
            str2 = labsProtocol.pdfUrl;
        }
        return labsProtocol.copy(i13, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getProtocolId() {
        return this.protocolId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProtocolName() {
        return this.protocolName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPdfUrl() {
        return this.pdfUrl;
    }

    public final LabsProtocol copy(int protocolId, String protocolName, String pdfUrl) {
        AbstractC22676k.m65750j(protocolName, "protocolName");
        AbstractC22676k.m65750j(pdfUrl, "pdfUrl");
        return new LabsProtocol(protocolId, protocolName, pdfUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabsProtocol)) {
            return false;
        }
        LabsProtocol labsProtocol = (LabsProtocol) other;
        return this.protocolId == labsProtocol.protocolId && AbstractC22676k.m65745e(this.protocolName, labsProtocol.protocolName) && AbstractC22676k.m65745e(this.pdfUrl, labsProtocol.pdfUrl);
    }

    public final String getPdfUrl() {
        return this.pdfUrl;
    }

    public final int getProtocolId() {
        return this.protocolId;
    }

    public final String getProtocolName() {
        return this.protocolName;
    }

    public int hashCode() {
        return this.pdfUrl.hashCode() + AbstractC11266d.m30450d(Integer.hashCode(this.protocolId) * 31, 31, this.protocolName);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.pdfUrl, ")", AbstractC18489d0.m53373n(this.protocolId, "LabsProtocol(protocolId=", ", protocolName=", this.protocolName, ", pdfUrl="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.protocolId);
        dest.writeString(this.protocolName);
        dest.writeString(this.pdfUrl);
    }
}
