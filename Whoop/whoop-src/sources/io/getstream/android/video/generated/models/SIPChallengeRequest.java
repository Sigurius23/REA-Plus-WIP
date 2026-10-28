package io.getstream.android.video.generated.models;

import java.util.List;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b+\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BÑ\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013\u0012\u0010\b\u0003\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013¢\u0006\u0002\u0010\u0015J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013HÆ\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÚ\u0001\u0010:\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00132\u0010\b\u0003\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020\u000e2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010&\u001a\u0004\b(\u0010%R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0017¨\u0006A"}, m65681d2 = {"Lio/getstream/android/video/generated/models/SIPChallengeRequest;", "", "a1", "", "algorithm", "charset", "cnonce", "method", "nc", "nonce", "opaque", "realm", "response", "stale", "", "uri", "userhash", "username", "domain", "", "qop", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getA1", "()Ljava/lang/String;", "getAlgorithm", "getCharset", "getCnonce", "getDomain", "()Ljava/util/List;", "getMethod", "getNc", "getNonce", "getOpaque", "getQop", "getRealm", "getResponse", "getStale", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUri", "getUserhash", "getUsername", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lio/getstream/android/video/generated/models/SIPChallengeRequest;", "equals", "other", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class SIPChallengeRequest {
    private final String a1;
    private final String algorithm;
    private final String charset;
    private final String cnonce;
    private final List<String> domain;
    private final String method;
    private final String nc;
    private final String nonce;
    private final String opaque;
    private final List<String> qop;
    private final String realm;
    private final String response;
    private final Boolean stale;
    private final String uri;
    private final Boolean userhash;
    private final String username;

    public SIPChallengeRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getA1() {
        return this.a1;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getResponse() {
        return this.response;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getStale() {
        return this.stale;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getUserhash() {
        return this.userhash;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    public final List<String> component15() {
        return this.domain;
    }

    public final List<String> component16() {
        return this.qop;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAlgorithm() {
        return this.algorithm;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCharset() {
        return this.charset;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCnonce() {
        return this.cnonce;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNc() {
        return this.nc;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getOpaque() {
        return this.opaque;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRealm() {
        return this.realm;
    }

    public final SIPChallengeRequest copy(@InterfaceC30731q(name = "a1") String a5, @InterfaceC30731q(name = "algorithm") String algorithm, @InterfaceC30731q(name = "charset") String charset, @InterfaceC30731q(name = "cnonce") String cnonce, @InterfaceC30731q(name = "method") String method, @InterfaceC30731q(name = "nc") String nc4, @InterfaceC30731q(name = "nonce") String nonce, @InterfaceC30731q(name = "opaque") String opaque, @InterfaceC30731q(name = "realm") String realm, @InterfaceC30731q(name = "response") String response, @InterfaceC30731q(name = "stale") Boolean stale, @InterfaceC30731q(name = "uri") String uri, @InterfaceC30731q(name = "userhash") Boolean userhash, @InterfaceC30731q(name = "username") String username, @InterfaceC30731q(name = "domain") List<String> domain, @InterfaceC30731q(name = "qop") List<String> qop) {
        return new SIPChallengeRequest(a5, algorithm, charset, cnonce, method, nc4, nonce, opaque, realm, response, stale, uri, userhash, username, domain, qop);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SIPChallengeRequest)) {
            return false;
        }
        SIPChallengeRequest sIPChallengeRequest = (SIPChallengeRequest) other;
        return AbstractC22676k.m65745e(this.a1, sIPChallengeRequest.a1) && AbstractC22676k.m65745e(this.algorithm, sIPChallengeRequest.algorithm) && AbstractC22676k.m65745e(this.charset, sIPChallengeRequest.charset) && AbstractC22676k.m65745e(this.cnonce, sIPChallengeRequest.cnonce) && AbstractC22676k.m65745e(this.method, sIPChallengeRequest.method) && AbstractC22676k.m65745e(this.nc, sIPChallengeRequest.nc) && AbstractC22676k.m65745e(this.nonce, sIPChallengeRequest.nonce) && AbstractC22676k.m65745e(this.opaque, sIPChallengeRequest.opaque) && AbstractC22676k.m65745e(this.realm, sIPChallengeRequest.realm) && AbstractC22676k.m65745e(this.response, sIPChallengeRequest.response) && AbstractC22676k.m65745e(this.stale, sIPChallengeRequest.stale) && AbstractC22676k.m65745e(this.uri, sIPChallengeRequest.uri) && AbstractC22676k.m65745e(this.userhash, sIPChallengeRequest.userhash) && AbstractC22676k.m65745e(this.username, sIPChallengeRequest.username) && AbstractC22676k.m65745e(this.domain, sIPChallengeRequest.domain) && AbstractC22676k.m65745e(this.qop, sIPChallengeRequest.qop);
    }

    public final String getA1() {
        return this.a1;
    }

    public final String getAlgorithm() {
        return this.algorithm;
    }

    public final String getCharset() {
        return this.charset;
    }

    public final String getCnonce() {
        return this.cnonce;
    }

    public final List<String> getDomain() {
        return this.domain;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getNc() {
        return this.nc;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final String getOpaque() {
        return this.opaque;
    }

    public final List<String> getQop() {
        return this.qop;
    }

    public final String getRealm() {
        return this.realm;
    }

    public final String getResponse() {
        return this.response;
    }

    public final Boolean getStale() {
        return this.stale;
    }

    public final String getUri() {
        return this.uri;
    }

    public final Boolean getUserhash() {
        return this.userhash;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        String str = this.a1;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.algorithm;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.charset;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cnonce;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.method;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.nc;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.nonce;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.opaque;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.realm;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.response;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool = this.stale;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str11 = this.uri;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Boolean bool2 = this.userhash;
        int iHashCode13 = (iHashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str12 = this.username;
        int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        List<String> list = this.domain;
        int iHashCode15 = (iHashCode14 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.qop;
        return iHashCode15 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        String str = this.a1;
        String str2 = this.algorithm;
        String str3 = this.charset;
        String str4 = this.cnonce;
        String str5 = this.method;
        String str6 = this.nc;
        String str7 = this.nonce;
        String str8 = this.opaque;
        String str9 = this.realm;
        String str10 = this.response;
        Boolean bool = this.stale;
        String str11 = this.uri;
        Boolean bool2 = this.userhash;
        String str12 = this.username;
        List<String> list = this.domain;
        List<String> list2 = this.qop;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SIPChallengeRequest(a1=", str, ", algorithm=", str2, ", charset=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", cnonce=", str4, ", method=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", nc=", str6, ", nonce=");
        AbstractC11266d.m30444B(sbM32001t, str7, ", opaque=", str8, ", realm=");
        AbstractC11266d.m30444B(sbM32001t, str9, ", response=", str10, ", stale=");
        AbstractC13673n.m38576w(bool, ", uri=", str11, ", userhash=", sbM32001t);
        AbstractC13673n.m38576w(bool2, ", username=", str12, ", domain=", sbM32001t);
        return AbstractC30007c.m91843m(sbM32001t, list, ", qop=", list2, ")");
    }

    public SIPChallengeRequest(@InterfaceC30731q(name = "a1") String str, @InterfaceC30731q(name = "algorithm") String str2, @InterfaceC30731q(name = "charset") String str3, @InterfaceC30731q(name = "cnonce") String str4, @InterfaceC30731q(name = "method") String str5, @InterfaceC30731q(name = "nc") String str6, @InterfaceC30731q(name = "nonce") String str7, @InterfaceC30731q(name = "opaque") String str8, @InterfaceC30731q(name = "realm") String str9, @InterfaceC30731q(name = "response") String str10, @InterfaceC30731q(name = "stale") Boolean bool, @InterfaceC30731q(name = "uri") String str11, @InterfaceC30731q(name = "userhash") Boolean bool2, @InterfaceC30731q(name = "username") String str12, @InterfaceC30731q(name = "domain") List<String> list, @InterfaceC30731q(name = "qop") List<String> list2) {
        this.a1 = str;
        this.algorithm = str2;
        this.charset = str3;
        this.cnonce = str4;
        this.method = str5;
        this.nc = str6;
        this.nonce = str7;
        this.opaque = str8;
        this.realm = str9;
        this.response = str10;
        this.stale = bool;
        this.uri = str11;
        this.userhash = bool2;
        this.username = str12;
        this.domain = list;
        this.qop = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SIPChallengeRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, Boolean bool2, String str12, List list, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        String str13 = (i13 & 1) != 0 ? null : str;
        String str14 = (i13 & 2) != 0 ? null : str2;
        String str15 = (i13 & 4) != 0 ? null : str3;
        String str16 = (i13 & 8) != 0 ? null : str4;
        String str17 = (i13 & 16) != 0 ? null : str5;
        String str18 = (i13 & 32) != 0 ? null : str6;
        String str19 = (i13 & 64) != 0 ? null : str7;
        String str20 = (i13 & 128) != 0 ? null : str8;
        String str21 = (i13 & 256) != 0 ? null : str9;
        String str22 = (i13 & 512) != 0 ? null : str10;
        Boolean bool3 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : bool;
        String str23 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str11;
        Boolean bool4 = (i13 & 4096) != 0 ? null : bool2;
        String str24 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0 ? str12 : null;
        int i14 = i13 & DfuBaseService.ERROR_CONNECTION_MASK;
        C25271y c25271y = C25271y.f99162w;
        this(str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, bool3, str23, bool4, str24, i14 != 0 ? c25271y : list, (i13 & 32768) != 0 ? c25271y : list2);
    }
}
