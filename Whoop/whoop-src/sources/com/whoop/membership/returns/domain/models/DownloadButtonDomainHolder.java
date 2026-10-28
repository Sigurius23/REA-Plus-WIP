package com.whoop.membership.returns.domain.models;

import io.getstream.chat.android.client.api.QueryParams;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/membership/returns/domain/models/DownloadButtonDomainHolder;", "", "text", "", QueryParams.URL, "filePath", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getUrl", "getFilePath", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class DownloadButtonDomainHolder {
    public static final int $stable = 0;
    private final String filePath;
    private final String text;
    private final String url;

    public DownloadButtonDomainHolder(String text, String url, String str) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(url, "url");
        this.text = text;
        this.url = url;
        this.filePath = str;
    }

    public static /* synthetic */ DownloadButtonDomainHolder copy$default(DownloadButtonDomainHolder downloadButtonDomainHolder, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = downloadButtonDomainHolder.text;
        }
        if ((i13 & 2) != 0) {
            str2 = downloadButtonDomainHolder.url;
        }
        if ((i13 & 4) != 0) {
            str3 = downloadButtonDomainHolder.filePath;
        }
        return downloadButtonDomainHolder.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    public final DownloadButtonDomainHolder copy(String text, String url, String filePath) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(url, "url");
        return new DownloadButtonDomainHolder(text, url, filePath);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownloadButtonDomainHolder)) {
            return false;
        }
        DownloadButtonDomainHolder downloadButtonDomainHolder = (DownloadButtonDomainHolder) other;
        return AbstractC22676k.m65745e(this.text, downloadButtonDomainHolder.text) && AbstractC22676k.m65745e(this.url, downloadButtonDomainHolder.url) && AbstractC22676k.m65745e(this.filePath, downloadButtonDomainHolder.filePath);
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.text.hashCode() * 31, 31, this.url);
        String str = this.filePath;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.filePath, ")", AbstractC11895b.m32001t("DownloadButtonDomainHolder(text=", this.text, ", url=", this.url, ", filePath="));
    }

    public /* synthetic */ DownloadButtonDomainHolder(String str, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : str3);
    }
}
