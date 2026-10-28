package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import d13.AbstractC11478a;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import live.hms.video.utils.HMSConstantsKt;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p565vy.InterfaceC36562b;
import p664yy.C39880t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000545678B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J(\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00100\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010 ¨\u00069"}, m65681d2 = {"Lcom/stripe/android/model/ConsentUi;", "Lvy/b;", "Lcom/stripe/android/model/ConsentUi$ConsentPane;", "consentPane", "Lcom/stripe/android/model/ConsentUi$ConsentSection;", "consentSection", "<init>", "(Lcom/stripe/android/model/ConsentUi$ConsentPane;Lcom/stripe/android/model/ConsentUi$ConsentSection;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/stripe/android/model/ConsentUi$ConsentPane;Lcom/stripe/android/model/ConsentUi$ConsentSection;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$payments_model_release", "(Lcom/stripe/android/model/ConsentUi;Lzc3/c;Lyc3/g;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/stripe/android/model/ConsentUi$ConsentPane;", "component2", "()Lcom/stripe/android/model/ConsentUi$ConsentSection;", "copy", "(Lcom/stripe/android/model/ConsentUi$ConsentPane;Lcom/stripe/android/model/ConsentUi$ConsentSection;)Lcom/stripe/android/model/ConsentUi;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/model/ConsentUi$ConsentPane;", "getConsentPane", "getConsentPane$annotations", "()V", "Lcom/stripe/android/model/ConsentUi$ConsentSection;", "getConsentSection", "getConsentSection$annotations", "Companion", "ConsentPane", "ConsentSection", "Icon", "$serializer", "com/stripe/android/model/a", "payments-model_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ConsentUi implements InterfaceC36562b {
    private final ConsentPane consentPane;
    private final ConsentSection consentSection;
    public static final C5642a Companion = new C5642a();
    public static final Parcelable.Creator<ConsentUi> CREATOR = new C5655j();

    @Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0003>?@B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010!JF\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010!J\u0010\u0010*\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b*\u0010\u001fJ\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00100\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010!R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00104\u0012\u0004\b6\u00103\u001a\u0004\b5\u0010#R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00100\u0012\u0004\b8\u00103\u001a\u0004\b7\u0010!R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00100\u0012\u0004\b:\u00103\u001a\u0004\b9\u0010!R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00100\u0012\u0004\b<\u00103\u001a\u0004\b;\u0010!¨\u0006A"}, m65681d2 = {"Lcom/stripe/android/model/ConsentUi$ConsentPane;", "Lvy/b;", "", "title", "Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;", "scopesSection", "disclaimer", "denyButtonLabel", "allowButtonLabel", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$payments_model_release", "(Lcom/stripe/android/model/ConsentUi$ConsentPane;Lzc3/c;Lyc3/g;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/ConsentUi$ConsentPane;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;", "getScopesSection", "getScopesSection$annotations", "getDisclaimer", "getDisclaimer$annotations", "getDenyButtonLabel", "getDenyButtonLabel$annotations", "getAllowButtonLabel", "getAllowButtonLabel$annotations", "Companion", "ScopesSection", "$serializer", "com/stripe/android/model/b", "payments-model_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class ConsentPane implements InterfaceC36562b {
        private final String allowButtonLabel;
        private final String denyButtonLabel;
        private final String disclaimer;
        private final ScopesSection scopesSection;
        private final String title;
        public static final C5644b Companion = new C5644b();
        public static final Parcelable.Creator<ConsentPane> CREATOR = new C5646c();

        @Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 22\u00020\u0001:\u0003345B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J*\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b%\u0010\u001dJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001fR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010/\u0012\u0004\b1\u0010.\u001a\u0004\b0\u0010!¨\u00066"}, m65681d2 = {"Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;", "Lvy/b;", "", "header", "", "Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$Scope;", "scopes", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$payments_model_release", "(Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;Lzc3/c;Lyc3/g;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHeader", "getHeader$annotations", "()V", "Ljava/util/List;", "getScopes", "getScopes$annotations", "Companion", "Scope", "$serializer", "com/stripe/android/model/d", "payments-model_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
        @InterfaceC37144i
        public static final /* data */ class ScopesSection implements InterfaceC36562b {
            private final String header;
            private final List<Scope> scopes;
            public static final C5648d Companion = new C5648d();
            public static final Parcelable.Creator<ScopesSection> CREATOR = new C5650e();
            private static final InterfaceC37138c[] $childSerializers = {null, new ArrayListSerializer(ConsentUi$ConsentPane$ScopesSection$Scope$$serializer.INSTANCE)};

            @Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000267B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J0\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010!J\u0010\u0010&\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b&\u0010\u001dJ\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00100\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010!R \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00100\u0012\u0004\b4\u0010/\u001a\u0004\b3\u0010!¨\u00068"}, m65681d2 = {"Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$Scope;", "Lvy/b;", "Lcom/stripe/android/model/ConsentUi$Icon;", "icon", "", "header", "description", "<init>", "(Lcom/stripe/android/model/ConsentUi$Icon;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/stripe/android/model/ConsentUi$Icon;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$payments_model_release", "(Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$Scope;Lzc3/c;Lyc3/g;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/stripe/android/model/ConsentUi$Icon;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/stripe/android/model/ConsentUi$Icon;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/ConsentUi$ConsentPane$ScopesSection$Scope;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/model/ConsentUi$Icon;", "getIcon", "getIcon$annotations", "()V", "Ljava/lang/String;", "getHeader", "getHeader$annotations", "getDescription", "getDescription$annotations", "Companion", "$serializer", "com/stripe/android/model/f", "payments-model_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
            @InterfaceC37144i
            public static final /* data */ class Scope implements InterfaceC36562b {
                private final String description;
                private final String header;
                private final Icon icon;
                public static final C5651f Companion = new C5651f();
                public static final Parcelable.Creator<Scope> CREATOR = new C5652g();

                public /* synthetic */ Scope(int i13, Icon icon, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                    if (7 != (i13 & 7)) {
                        PluginExceptionsKt.throwMissingFieldException(i13, 7, ConsentUi$ConsentPane$ScopesSection$Scope$$serializer.INSTANCE.getDescriptor());
                    }
                    this.icon = icon;
                    this.header = str;
                    this.description = str2;
                }

                public static /* synthetic */ Scope copy$default(Scope scope, Icon icon, String str, String str2, int i13, Object obj) {
                    if ((i13 & 1) != 0) {
                        icon = scope.icon;
                    }
                    if ((i13 & 2) != 0) {
                        str = scope.header;
                    }
                    if ((i13 & 4) != 0) {
                        str2 = scope.description;
                    }
                    return scope.copy(icon, str, str2);
                }

                @InterfaceC37143h("description")
                @InterfaceC37144i(with = C39880t.class)
                public static /* synthetic */ void getDescription$annotations() {
                }

                @InterfaceC37143h("header")
                public static /* synthetic */ void getHeader$annotations() {
                }

                @InterfaceC37143h("icon")
                public static /* synthetic */ void getIcon$annotations() {
                }

                public static final /* synthetic */ void write$Self$payments_model_release(Scope self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
                    output.encodeSerializableElement(serialDesc, 0, ConsentUi$Icon$$serializer.INSTANCE, self.icon);
                    output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.header);
                    output.encodeSerializableElement(serialDesc, 2, C39880t.f172196a, self.description);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final Icon getIcon() {
                    return this.icon;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final String getHeader() {
                    return this.header;
                }

                /* JADX INFO: renamed from: component3, reason: from getter */
                public final String getDescription() {
                    return this.description;
                }

                public final Scope copy(Icon icon, String header, String description) {
                    AbstractC22676k.m65750j(icon, "icon");
                    AbstractC22676k.m65750j(description, "description");
                    return new Scope(icon, header, description);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Scope)) {
                        return false;
                    }
                    Scope scope = (Scope) other;
                    return AbstractC22676k.m65745e(this.icon, scope.icon) && AbstractC22676k.m65745e(this.header, scope.header) && AbstractC22676k.m65745e(this.description, scope.description);
                }

                public final String getDescription() {
                    return this.description;
                }

                public final String getHeader() {
                    return this.header;
                }

                public final Icon getIcon() {
                    return this.icon;
                }

                public int hashCode() {
                    int iHashCode = this.icon.hashCode() * 31;
                    String str = this.header;
                    return this.description.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
                }

                public String toString() {
                    Icon icon = this.icon;
                    String str = this.header;
                    String str2 = this.description;
                    StringBuilder sb4 = new StringBuilder("Scope(icon=");
                    sb4.append(icon);
                    sb4.append(", header=");
                    sb4.append(str);
                    sb4.append(", description=");
                    return AbstractC25012a.m73376i(str2, ")", sb4);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    AbstractC22676k.m65750j(dest, "dest");
                    this.icon.writeToParcel(dest, flags);
                    dest.writeString(this.header);
                    dest.writeString(this.description);
                }

                public Scope(Icon icon, String str, String description) {
                    AbstractC22676k.m65750j(icon, "icon");
                    AbstractC22676k.m65750j(description, "description");
                    this.icon = icon;
                    this.header = str;
                    this.description = description;
                }
            }

            public /* synthetic */ ScopesSection(int i13, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i13 & 3)) {
                    PluginExceptionsKt.throwMissingFieldException(i13, 3, ConsentUi$ConsentPane$ScopesSection$$serializer.INSTANCE.getDescriptor());
                }
                this.header = str;
                this.scopes = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ScopesSection copy$default(ScopesSection scopesSection, String str, List list, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = scopesSection.header;
                }
                if ((i13 & 2) != 0) {
                    list = scopesSection.scopes;
                }
                return scopesSection.copy(str, list);
            }

            @InterfaceC37143h("header")
            public static /* synthetic */ void getHeader$annotations() {
            }

            @InterfaceC37143h("scopes")
            public static /* synthetic */ void getScopes$annotations() {
            }

            public static final /* synthetic */ void write$Self$payments_model_release(ScopesSection self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
                InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
                output.encodeStringElement(serialDesc, 0, self.header);
                output.encodeSerializableElement(serialDesc, 1, interfaceC37138cArr[1], self.scopes);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getHeader() {
                return this.header;
            }

            public final List<Scope> component2() {
                return this.scopes;
            }

            public final ScopesSection copy(String header, List<Scope> scopes) {
                AbstractC22676k.m65750j(header, "header");
                AbstractC22676k.m65750j(scopes, "scopes");
                return new ScopesSection(header, scopes);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ScopesSection)) {
                    return false;
                }
                ScopesSection scopesSection = (ScopesSection) other;
                return AbstractC22676k.m65745e(this.header, scopesSection.header) && AbstractC22676k.m65745e(this.scopes, scopesSection.scopes);
            }

            public final String getHeader() {
                return this.header;
            }

            public final List<Scope> getScopes() {
                return this.scopes;
            }

            public int hashCode() {
                return this.scopes.hashCode() + (this.header.hashCode() * 31);
            }

            public String toString() {
                return AbstractC36095b.m114679g("ScopesSection(header=", this.header, ", scopes=", ")", this.scopes);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                AbstractC22676k.m65750j(dest, "dest");
                dest.writeString(this.header);
                Iterator itM30863o = AbstractC11478a.m30863o(this.scopes, dest);
                while (itM30863o.hasNext()) {
                    ((Scope) itM30863o.next()).writeToParcel(dest, flags);
                }
            }

            public ScopesSection(String header, List<Scope> scopes) {
                AbstractC22676k.m65750j(header, "header");
                AbstractC22676k.m65750j(scopes, "scopes");
                this.header = header;
                this.scopes = scopes;
            }
        }

        public /* synthetic */ ConsentPane(int i13, String str, ScopesSection scopesSection, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if (31 != (i13 & 31)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 31, ConsentUi$ConsentPane$$serializer.INSTANCE.getDescriptor());
            }
            this.title = str;
            this.scopesSection = scopesSection;
            this.disclaimer = str2;
            this.denyButtonLabel = str3;
            this.allowButtonLabel = str4;
        }

        public static /* synthetic */ ConsentPane copy$default(ConsentPane consentPane, String str, ScopesSection scopesSection, String str2, String str3, String str4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = consentPane.title;
            }
            if ((i13 & 2) != 0) {
                scopesSection = consentPane.scopesSection;
            }
            if ((i13 & 4) != 0) {
                str2 = consentPane.disclaimer;
            }
            if ((i13 & 8) != 0) {
                str3 = consentPane.denyButtonLabel;
            }
            if ((i13 & 16) != 0) {
                str4 = consentPane.allowButtonLabel;
            }
            String str5 = str4;
            String str6 = str2;
            return consentPane.copy(str, scopesSection, str6, str3, str5);
        }

        @InterfaceC37143h("allow_button_label")
        public static /* synthetic */ void getAllowButtonLabel$annotations() {
        }

        @InterfaceC37143h("deny_button_label")
        public static /* synthetic */ void getDenyButtonLabel$annotations() {
        }

        @InterfaceC37143h("disclaimer")
        @InterfaceC37144i(with = C39880t.class)
        public static /* synthetic */ void getDisclaimer$annotations() {
        }

        @InterfaceC37143h("scopes_section")
        public static /* synthetic */ void getScopesSection$annotations() {
        }

        @InterfaceC37143h("title")
        public static /* synthetic */ void getTitle$annotations() {
        }

        public static final /* synthetic */ void write$Self$payments_model_release(ConsentPane self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.title);
            output.encodeSerializableElement(serialDesc, 1, ConsentUi$ConsentPane$ScopesSection$$serializer.INSTANCE, self.scopesSection);
            output.encodeNullableSerializableElement(serialDesc, 2, C39880t.f172196a, self.disclaimer);
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.denyButtonLabel);
            output.encodeStringElement(serialDesc, 4, self.allowButtonLabel);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final ScopesSection getScopesSection() {
            return this.scopesSection;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getDisclaimer() {
            return this.disclaimer;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getDenyButtonLabel() {
            return this.denyButtonLabel;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getAllowButtonLabel() {
            return this.allowButtonLabel;
        }

        public final ConsentPane copy(String title, ScopesSection scopesSection, String disclaimer, String denyButtonLabel, String allowButtonLabel) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(scopesSection, "scopesSection");
            AbstractC22676k.m65750j(allowButtonLabel, "allowButtonLabel");
            return new ConsentPane(title, scopesSection, disclaimer, denyButtonLabel, allowButtonLabel);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConsentPane)) {
                return false;
            }
            ConsentPane consentPane = (ConsentPane) other;
            return AbstractC22676k.m65745e(this.title, consentPane.title) && AbstractC22676k.m65745e(this.scopesSection, consentPane.scopesSection) && AbstractC22676k.m65745e(this.disclaimer, consentPane.disclaimer) && AbstractC22676k.m65745e(this.denyButtonLabel, consentPane.denyButtonLabel) && AbstractC22676k.m65745e(this.allowButtonLabel, consentPane.allowButtonLabel);
        }

        public final String getAllowButtonLabel() {
            return this.allowButtonLabel;
        }

        public final String getDenyButtonLabel() {
            return this.denyButtonLabel;
        }

        public final String getDisclaimer() {
            return this.disclaimer;
        }

        public final ScopesSection getScopesSection() {
            return this.scopesSection;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = (this.scopesSection.hashCode() + (this.title.hashCode() * 31)) * 31;
            String str = this.disclaimer;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.denyButtonLabel;
            return this.allowButtonLabel.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public String toString() {
            String str = this.title;
            ScopesSection scopesSection = this.scopesSection;
            String str2 = this.disclaimer;
            String str3 = this.denyButtonLabel;
            String str4 = this.allowButtonLabel;
            StringBuilder sb4 = new StringBuilder("ConsentPane(title=");
            sb4.append(str);
            sb4.append(", scopesSection=");
            sb4.append(scopesSection);
            sb4.append(", disclaimer=");
            AbstractC11266d.m30444B(sb4, str2, ", denyButtonLabel=", str3, ", allowButtonLabel=");
            return AbstractC25012a.m73376i(str4, ")", sb4);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC22676k.m65750j(dest, "dest");
            dest.writeString(this.title);
            this.scopesSection.writeToParcel(dest, flags);
            dest.writeString(this.disclaimer);
            dest.writeString(this.denyButtonLabel);
            dest.writeString(this.allowButtonLabel);
        }

        public ConsentPane(String title, ScopesSection scopesSection, String str, String str2, String allowButtonLabel) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(scopesSection, "scopesSection");
            AbstractC22676k.m65750j(allowButtonLabel, "allowButtonLabel");
            this.title = title;
            this.scopesSection = scopesSection;
            this.disclaimer = str;
            this.denyButtonLabel = str2;
            this.allowButtonLabel = allowButtonLabel;
        }
    }

    @Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u001c¨\u0006-"}, m65681d2 = {"Lcom/stripe/android/model/ConsentUi$ConsentSection;", "Lvy/b;", "", "disclaimer", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$payments_model_release", "(Lcom/stripe/android/model/ConsentUi$ConsentSection;Lzc3/c;Lyc3/g;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/stripe/android/model/ConsentUi$ConsentSection;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDisclaimer", "getDisclaimer$annotations", "()V", "Companion", "$serializer", "com/stripe/android/model/h", "payments-model_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class ConsentSection implements InterfaceC36562b {
        private final String disclaimer;
        public static final C5653h Companion = new C5653h();
        public static final Parcelable.Creator<ConsentSection> CREATOR = new C5654i();

        public /* synthetic */ ConsentSection(int i13, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i13 & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 1, ConsentUi$ConsentSection$$serializer.INSTANCE.getDescriptor());
            }
            this.disclaimer = str;
        }

        public static /* synthetic */ ConsentSection copy$default(ConsentSection consentSection, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = consentSection.disclaimer;
            }
            return consentSection.copy(str);
        }

        @InterfaceC37143h("disclaimer")
        @InterfaceC37144i(with = C39880t.class)
        public static /* synthetic */ void getDisclaimer$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDisclaimer() {
            return this.disclaimer;
        }

        public final ConsentSection copy(String disclaimer) {
            AbstractC22676k.m65750j(disclaimer, "disclaimer");
            return new ConsentSection(disclaimer);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConsentSection) && AbstractC22676k.m65745e(this.disclaimer, ((ConsentSection) other).disclaimer);
        }

        public final String getDisclaimer() {
            return this.disclaimer;
        }

        public int hashCode() {
            return this.disclaimer.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ConsentSection(disclaimer=", this.disclaimer, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC22676k.m65750j(dest, "dest");
            dest.writeString(this.disclaimer);
        }

        public ConsentSection(String disclaimer) {
            AbstractC22676k.m65750j(disclaimer, "disclaimer");
            this.disclaimer = disclaimer;
        }
    }

    @Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u001c¨\u0006-"}, m65681d2 = {"Lcom/stripe/android/model/ConsentUi$Icon;", "Lvy/b;", "", HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY, "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$payments_model_release", "(Lcom/stripe/android/model/ConsentUi$Icon;Lzc3/c;Lyc3/g;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/stripe/android/model/ConsentUi$Icon;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDefault", "getDefault$annotations", "()V", "Companion", "$serializer", "com/stripe/android/model/k", "payments-model_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class Icon implements InterfaceC36562b {
        private final String default;
        public static final C5656k Companion = new C5656k();
        public static final Parcelable.Creator<Icon> CREATOR = new C5657l();

        public /* synthetic */ Icon(int i13, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i13 & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 1, ConsentUi$Icon$$serializer.INSTANCE.getDescriptor());
            }
            this.default = str;
        }

        public static /* synthetic */ Icon copy$default(Icon icon, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = icon.default;
            }
            return icon.copy(str);
        }

        @InterfaceC37143h(HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY)
        public static /* synthetic */ void getDefault$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDefault() {
            return this.default;
        }

        public final Icon copy(String str) {
            AbstractC22676k.m65750j(str, "default");
            return new Icon(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Icon) && AbstractC22676k.m65745e(this.default, ((Icon) other).default);
        }

        public final String getDefault() {
            return this.default;
        }

        public int hashCode() {
            return this.default.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Icon(default=", this.default, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC22676k.m65750j(dest, "dest");
            dest.writeString(this.default);
        }

        public Icon(String str) {
            AbstractC22676k.m65750j(str, "default");
            this.default = str;
        }
    }

    public /* synthetic */ ConsentUi(int i13, ConsentPane consentPane, ConsentSection consentSection, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, ConsentUi$$serializer.INSTANCE.getDescriptor());
        }
        this.consentPane = consentPane;
        this.consentSection = consentSection;
    }

    public static /* synthetic */ ConsentUi copy$default(ConsentUi consentUi, ConsentPane consentPane, ConsentSection consentSection, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            consentPane = consentUi.consentPane;
        }
        if ((i13 & 2) != 0) {
            consentSection = consentUi.consentSection;
        }
        return consentUi.copy(consentPane, consentSection);
    }

    @InterfaceC37143h("consent_pane")
    public static /* synthetic */ void getConsentPane$annotations() {
    }

    @InterfaceC37143h("consent_section")
    public static /* synthetic */ void getConsentSection$annotations() {
    }

    public static final /* synthetic */ void write$Self$payments_model_release(ConsentUi self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, ConsentUi$ConsentPane$$serializer.INSTANCE, self.consentPane);
        output.encodeNullableSerializableElement(serialDesc, 1, ConsentUi$ConsentSection$$serializer.INSTANCE, self.consentSection);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ConsentPane getConsentPane() {
        return this.consentPane;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ConsentSection getConsentSection() {
        return this.consentSection;
    }

    public final ConsentUi copy(ConsentPane consentPane, ConsentSection consentSection) {
        return new ConsentUi(consentPane, consentSection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsentUi)) {
            return false;
        }
        ConsentUi consentUi = (ConsentUi) other;
        return AbstractC22676k.m65745e(this.consentPane, consentUi.consentPane) && AbstractC22676k.m65745e(this.consentSection, consentUi.consentSection);
    }

    public final ConsentPane getConsentPane() {
        return this.consentPane;
    }

    public final ConsentSection getConsentSection() {
        return this.consentSection;
    }

    public int hashCode() {
        ConsentPane consentPane = this.consentPane;
        int iHashCode = (consentPane == null ? 0 : consentPane.hashCode()) * 31;
        ConsentSection consentSection = this.consentSection;
        return iHashCode + (consentSection != null ? consentSection.hashCode() : 0);
    }

    public String toString() {
        return "ConsentUi(consentPane=" + this.consentPane + ", consentSection=" + this.consentSection + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        ConsentPane consentPane = this.consentPane;
        if (consentPane == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            consentPane.writeToParcel(dest, flags);
        }
        ConsentSection consentSection = this.consentSection;
        if (consentSection == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            consentSection.writeToParcel(dest, flags);
        }
    }

    public ConsentUi(ConsentPane consentPane, ConsentSection consentSection) {
        this.consentPane = consentPane;
        this.consentSection = consentSection;
    }
}
