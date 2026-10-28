package com.whoop.archv2.feature.domain;

import com.whoop.whoopaction.domain.models.LoadingTreatment;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y82.EnumC39339b;

/* JADX INFO: renamed from: com.whoop.archv2.feature.domain.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0001\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/b;", "", "a", "b", "c", "d", "e", "Lcom/whoop/archv2/feature/domain/b$a;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC5994b {

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.b$a */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/b$a;", "Lcom/whoop/archv2/feature/domain/b;", "Lcom/whoop/archv2/feature/domain/b$b;", "Lcom/whoop/archv2/feature/domain/b$c;", "Lcom/whoop/archv2/feature/domain/b$d;", "Lcom/whoop/archv2/feature/domain/b$e;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface a extends InterfaceC5994b {
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.b$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/b$b;", "Lcom/whoop/archv2/feature/domain/b$a;", "Lcom/whoop/whoopaction/domain/models/LoadingTreatment;", "treatment", "<init>", "(Lcom/whoop/whoopaction/domain/models/LoadingTreatment;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/whoopaction/domain/models/LoadingTreatment;", "()Lcom/whoop/whoopaction/domain/models/LoadingTreatment;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements a {

        /* JADX INFO: renamed from: b */
        public static final int f23688b = LoadingTreatment.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final LoadingTreatment treatment;

        public b(LoadingTreatment loadingTreatment) {
            this.treatment = loadingTreatment;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LoadingTreatment getTreatment() {
            return this.treatment;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.treatment, ((b) other).treatment);
        }

        public int hashCode() {
            LoadingTreatment loadingTreatment = this.treatment;
            if (loadingTreatment == null) {
                return 0;
            }
            return loadingTreatment.hashCode();
        }

        public String toString() {
            return "Loading(treatment=" + this.treatment + ")";
        }

        public /* synthetic */ b(LoadingTreatment loadingTreatment, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : loadingTreatment);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.b$c */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/b$c;", "Lcom/whoop/archv2/feature/domain/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements a {

        /* JADX INFO: renamed from: a */
        public static final c f23690a = new c();

        private c() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return -492159;
        }

        public String toString() {
            return "NetworkError";
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.b$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/b$d;", "Lcom/whoop/archv2/feature/domain/b$a;", "", "statusCode", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int statusCode;

        public d(int i13) {
            this.statusCode = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getStatusCode() {
            return this.statusCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && this.statusCode == ((d) other).statusCode;
        }

        public int hashCode() {
            return Integer.hashCode(this.statusCode);
        }

        public String toString() {
            return AbstractC2875y.m8296i(this.statusCode, "RequestFailed(statusCode=", ")");
        }

        public /* synthetic */ d(int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this((i14 & 1) != 0 ? 0 : i13);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.domain.b$e */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/archv2/feature/domain/b$e;", "Lcom/whoop/archv2/feature/domain/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements a {

        /* JADX INFO: renamed from: a */
        public static final e f23692a = new e();

        private e() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof e);
        }

        public int hashCode() {
            return 1676586652;
        }

        public String toString() {
            return EnumC39339b.RESULT_SUCCESS;
        }
    }
}
