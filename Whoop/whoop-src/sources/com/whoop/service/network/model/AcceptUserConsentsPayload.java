package com.whoop.service.network.model;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/service/network/model/AcceptUserConsentsPayload;", "", NotificationCompat.CATEGORY_EMAIL, "", "consentsAccepted", "", "region", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getConsentsAccepted", "()Ljava/util/List;", "getRegion", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class AcceptUserConsentsPayload {

    @SerializedName("consents_accepted")
    private final List<String> consentsAccepted;
    private final String email;
    private final String region;

    public AcceptUserConsentsPayload(String email, List<String> consentsAccepted, String region) {
        AbstractC22676k.m65750j(email, "email");
        AbstractC22676k.m65750j(consentsAccepted, "consentsAccepted");
        AbstractC22676k.m65750j(region, "region");
        this.email = email;
        this.consentsAccepted = consentsAccepted;
        this.region = region;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AcceptUserConsentsPayload copy$default(AcceptUserConsentsPayload acceptUserConsentsPayload, String str, List list, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = acceptUserConsentsPayload.email;
        }
        if ((i13 & 2) != 0) {
            list = acceptUserConsentsPayload.consentsAccepted;
        }
        if ((i13 & 4) != 0) {
            str2 = acceptUserConsentsPayload.region;
        }
        return acceptUserConsentsPayload.copy(str, list, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public final List<String> component2() {
        return this.consentsAccepted;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    public final AcceptUserConsentsPayload copy(String email, List<String> consentsAccepted, String region) {
        AbstractC22676k.m65750j(email, "email");
        AbstractC22676k.m65750j(consentsAccepted, "consentsAccepted");
        AbstractC22676k.m65750j(region, "region");
        return new AcceptUserConsentsPayload(email, consentsAccepted, region);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcceptUserConsentsPayload)) {
            return false;
        }
        AcceptUserConsentsPayload acceptUserConsentsPayload = (AcceptUserConsentsPayload) other;
        return AbstractC22676k.m65745e(this.email, acceptUserConsentsPayload.email) && AbstractC22676k.m65745e(this.consentsAccepted, acceptUserConsentsPayload.consentsAccepted) && AbstractC22676k.m65745e(this.region, acceptUserConsentsPayload.region);
    }

    public final List<String> getConsentsAccepted() {
        return this.consentsAccepted;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getRegion() {
        return this.region;
    }

    public int hashCode() {
        return this.region.hashCode() + AbstractC11895b.m31983b(this.email.hashCode() * 31, 31, this.consentsAccepted);
    }

    public String toString() {
        return AbstractC25012a.m73376i(this.region, ")", AbstractC30802r.m94766o("AcceptUserConsentsPayload(email=", this.email, ", consentsAccepted=", ", region=", this.consentsAccepted));
    }
}
