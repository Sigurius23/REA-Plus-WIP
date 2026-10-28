package com.whoop.whooplabs.data.remote.domain.dto;

import com.whoop.whooplabs.data.domain.LegalDocument;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0005HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001b"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/LegalDocumentDto;", "", "legalId", "", "name", "", "pdfUrl", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getLegalId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "()Ljava/lang/String;", "getPdfUrl", "toLegalDocument", "Lcom/whoop/whooplabs/data/domain/LegalDocument;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/whooplabs/data/remote/domain/dto/LegalDocumentDto;", "equals", "", "other", "hashCode", "toString", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class LegalDocumentDto {
    public static final int $stable = 0;
    private final Integer legalId;
    private final String name;
    private final String pdfUrl;

    public LegalDocumentDto(Integer num, String str, String str2) {
        this.legalId = num;
        this.name = str;
        this.pdfUrl = str2;
    }

    public static /* synthetic */ LegalDocumentDto copy$default(LegalDocumentDto legalDocumentDto, Integer num, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = legalDocumentDto.legalId;
        }
        if ((i13 & 2) != 0) {
            str = legalDocumentDto.name;
        }
        if ((i13 & 4) != 0) {
            str2 = legalDocumentDto.pdfUrl;
        }
        return legalDocumentDto.copy(num, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getLegalId() {
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

    public final LegalDocumentDto copy(Integer legalId, String name, String pdfUrl) {
        return new LegalDocumentDto(legalId, name, pdfUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegalDocumentDto)) {
            return false;
        }
        LegalDocumentDto legalDocumentDto = (LegalDocumentDto) other;
        return AbstractC22676k.m65745e(this.legalId, legalDocumentDto.legalId) && AbstractC22676k.m65745e(this.name, legalDocumentDto.name) && AbstractC22676k.m65745e(this.pdfUrl, legalDocumentDto.pdfUrl);
    }

    public final Integer getLegalId() {
        return this.legalId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPdfUrl() {
        return this.pdfUrl;
    }

    public int hashCode() {
        Integer num = this.legalId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pdfUrl;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final LegalDocument toLegalDocument() {
        Integer num = this.legalId;
        AbstractC22676k.m65747g(num);
        int iIntValue = num.intValue();
        String str = this.name;
        AbstractC22676k.m65747g(str);
        String str2 = this.pdfUrl;
        AbstractC22676k.m65747g(str2);
        return new LegalDocument(iIntValue, str, str2, null, 8, null);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.pdfUrl, ")", AbstractC31061c.m95643s("LegalDocumentDto(legalId=", ", name=", this.legalId, this.name, ", pdfUrl="));
    }
}
