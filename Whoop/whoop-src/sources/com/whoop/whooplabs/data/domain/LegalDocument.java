package com.whoop.whooplabs.data.domain;

import android.os.Parcel;
import android.os.Parcelable;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J:\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b%\u0010\u0014¨\u0006&"}, m65681d2 = {"Lcom/whoop/whooplabs/data/domain/LegalDocument;", "Landroid/os/Parcelable;", "", "legalId", "", "name", "pdfUrl", "pdfFileName", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/whooplabs/data/domain/LegalDocument;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getLegalId", "Ljava/lang/String;", "getName", "getPdfUrl", "getPdfFileName", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class LegalDocument implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<LegalDocument> CREATOR = new Creator();
    private final int legalId;
    private final String name;
    private final String pdfFileName;
    private final String pdfUrl;

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Creator implements Parcelable.Creator<LegalDocument> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LegalDocument createFromParcel(Parcel parcel) {
            AbstractC22676k.m65750j(parcel, "parcel");
            return new LegalDocument(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LegalDocument[] newArray(int i13) {
            return new LegalDocument[i13];
        }
    }

    public LegalDocument(int i13, String name, String pdfUrl, String str) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(pdfUrl, "pdfUrl");
        this.legalId = i13;
        this.name = name;
        this.pdfUrl = pdfUrl;
        this.pdfFileName = str;
    }

    public static /* synthetic */ LegalDocument copy$default(LegalDocument legalDocument, int i13, String str, String str2, String str3, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = legalDocument.legalId;
        }
        if ((i14 & 2) != 0) {
            str = legalDocument.name;
        }
        if ((i14 & 4) != 0) {
            str2 = legalDocument.pdfUrl;
        }
        if ((i14 & 8) != 0) {
            str3 = legalDocument.pdfFileName;
        }
        return legalDocument.copy(i13, str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLegalId() {
        return this.legalId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPdfUrl() {
        return this.pdfUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPdfFileName() {
        return this.pdfFileName;
    }

    public final LegalDocument copy(int legalId, String name, String pdfUrl, String pdfFileName) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(pdfUrl, "pdfUrl");
        return new LegalDocument(legalId, name, pdfUrl, pdfFileName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegalDocument)) {
            return false;
        }
        LegalDocument legalDocument = (LegalDocument) other;
        return this.legalId == legalDocument.legalId && AbstractC22676k.m65745e(this.name, legalDocument.name) && AbstractC22676k.m65745e(this.pdfUrl, legalDocument.pdfUrl) && AbstractC22676k.m65745e(this.pdfFileName, legalDocument.pdfFileName);
    }

    public final int getLegalId() {
        return this.legalId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPdfFileName() {
        return this.pdfFileName;
    }

    public final String getPdfUrl() {
        return this.pdfUrl;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(Integer.hashCode(this.legalId) * 31, 31, this.name), 31, this.pdfUrl);
        String str = this.pdfFileName;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        int i13 = this.legalId;
        String str = this.name;
        return AbstractC11266d.m30464r(AbstractC18489d0.m53373n(i13, "LegalDocument(legalId=", ", name=", str, ", pdfUrl="), this.pdfUrl, ", pdfFileName=", this.pdfFileName, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.legalId);
        dest.writeString(this.name);
        dest.writeString(this.pdfUrl);
        dest.writeString(this.pdfFileName);
    }

    public /* synthetic */ LegalDocument(int i13, String str, String str2, String str3, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, str, str2, (i14 & 8) != 0 ? null : str3);
    }
}
