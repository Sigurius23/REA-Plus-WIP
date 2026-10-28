package mx2;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: mx2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0011\u0003\u0007\u0014R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012\u0082\u0001\u0004\u0016\u0017\u0018\u0019¨\u0006\u001aÀ\u0006\u0003"}, m65681d2 = {"Lmx2/b;", "", "", "b", "()I", "campaignId", "Lmx2/l;", "d", "()Lmx2/l;", "modalConfig", "f", "errorConfig", "Lmx2/i;", "e", "()Lmx2/i;", "cancelScreenConfig", "Lmx2/m;", "a", "()Lmx2/m;", "submitConfig", "c", "successConfig", "Lmx2/b$a;", "Lmx2/b$b;", "Lmx2/b$c;", "Lmx2/b$d;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC26015b {
    /* JADX INFO: renamed from: a */
    C26026m getSubmitConfig();

    /* JADX INFO: renamed from: b */
    int getCampaignId();

    /* JADX INFO: renamed from: c */
    C26026m getSuccessConfig();

    /* JADX INFO: renamed from: d */
    C26025l getModalConfig();

    /* JADX INFO: renamed from: e */
    C26022i getCancelScreenConfig();

    /* JADX INFO: renamed from: f */
    C26025l getErrorConfig();

    /* JADX INFO: renamed from: mx2.b$b */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJR\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b\u001a\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010%\u001a\u0004\b \u0010&¨\u0006'"}, m65681d2 = {"Lmx2/b$b;", "Lmx2/b;", "", "campaignId", "Lmx2/l;", "modalConfig", "errorConfig", "Lmx2/i;", "cancelScreenConfig", "Lmx2/m;", "submitConfig", "successConfig", "<init>", "(ILmx2/l;Lmx2/l;Lmx2/i;Lmx2/m;Lmx2/m;)V", "g", "(ILmx2/l;Lmx2/l;Lmx2/i;Lmx2/m;Lmx2/m;)Lmx2/b$b;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lmx2/l;", "d", "()Lmx2/l;", "c", "f", "Lmx2/i;", "e", "()Lmx2/i;", "Lmx2/m;", "()Lmx2/m;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC26015b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int campaignId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C26025l modalConfig;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C26025l errorConfig;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C26022i cancelScreenConfig;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C26026m submitConfig;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C26026m successConfig;

        public b(int i13, C26025l modalConfig, C26025l errorConfig, C26022i c26022i, C26026m c26026m, C26026m c26026m2) {
            AbstractC22676k.m65750j(modalConfig, "modalConfig");
            AbstractC22676k.m65750j(errorConfig, "errorConfig");
            this.campaignId = i13;
            this.modalConfig = modalConfig;
            this.errorConfig = errorConfig;
            this.cancelScreenConfig = c26022i;
            this.submitConfig = c26026m;
            this.successConfig = c26026m2;
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ b m77318h(b bVar, int i13, C26025l c26025l, C26025l c26025l2, C26022i c26022i, C26026m c26026m, C26026m c26026m2, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i13 = bVar.campaignId;
            }
            if ((i14 & 2) != 0) {
                c26025l = bVar.modalConfig;
            }
            if ((i14 & 4) != 0) {
                c26025l2 = bVar.errorConfig;
            }
            if ((i14 & 8) != 0) {
                c26022i = bVar.cancelScreenConfig;
            }
            if ((i14 & 16) != 0) {
                c26026m = bVar.submitConfig;
            }
            if ((i14 & 32) != 0) {
                c26026m2 = bVar.successConfig;
            }
            C26026m c26026m3 = c26026m;
            C26026m c26026m4 = c26026m2;
            return bVar.m77319g(i13, c26025l, c26025l2, c26022i, c26026m3, c26026m4);
        }

        @Override // mx2.InterfaceC26015b
        /* JADX INFO: renamed from: a, reason: from getter */
        public C26026m getSubmitConfig() {
            return this.submitConfig;
        }

        @Override // mx2.InterfaceC26015b
        /* JADX INFO: renamed from: b, reason: from getter */
        public int getCampaignId() {
            return this.campaignId;
        }

        @Override // mx2.InterfaceC26015b
        /* JADX INFO: renamed from: c, reason: from getter */
        public C26026m getSuccessConfig() {
            return this.successConfig;
        }

        @Override // mx2.InterfaceC26015b
        /* JADX INFO: renamed from: d, reason: from getter */
        public C26025l getModalConfig() {
            return this.modalConfig;
        }

        @Override // mx2.InterfaceC26015b
        /* JADX INFO: renamed from: e, reason: from getter */
        public C26022i getCancelScreenConfig() {
            return this.cancelScreenConfig;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.campaignId == bVar.campaignId && AbstractC22676k.m65745e(this.modalConfig, bVar.modalConfig) && AbstractC22676k.m65745e(this.errorConfig, bVar.errorConfig) && AbstractC22676k.m65745e(this.cancelScreenConfig, bVar.cancelScreenConfig) && AbstractC22676k.m65745e(this.submitConfig, bVar.submitConfig) && AbstractC22676k.m65745e(this.successConfig, bVar.successConfig);
        }

        @Override // mx2.InterfaceC26015b
        /* JADX INFO: renamed from: f, reason: from getter */
        public C26025l getErrorConfig() {
            return this.errorConfig;
        }

        /* JADX INFO: renamed from: g */
        public final b m77319g(int campaignId, C26025l modalConfig, C26025l errorConfig, C26022i cancelScreenConfig, C26026m submitConfig, C26026m successConfig) {
            AbstractC22676k.m65750j(modalConfig, "modalConfig");
            AbstractC22676k.m65750j(errorConfig, "errorConfig");
            return new b(campaignId, modalConfig, errorConfig, cancelScreenConfig, submitConfig, successConfig);
        }

        public int hashCode() {
            int iHashCode = (this.errorConfig.hashCode() + ((this.modalConfig.hashCode() + (Integer.hashCode(this.campaignId) * 31)) * 31)) * 31;
            C26022i c26022i = this.cancelScreenConfig;
            int iHashCode2 = (iHashCode + (c26022i == null ? 0 : c26022i.hashCode())) * 31;
            C26026m c26026m = this.submitConfig;
            int iHashCode3 = (iHashCode2 + (c26026m == null ? 0 : c26026m.hashCode())) * 31;
            C26026m c26026m2 = this.successConfig;
            return iHashCode3 + (c26026m2 != null ? c26026m2.hashCode() : 0);
        }

        public String toString() {
            return "CancelTaskDomain(campaignId=" + this.campaignId + ", modalConfig=" + this.modalConfig + ", errorConfig=" + this.errorConfig + ", cancelScreenConfig=" + this.cancelScreenConfig + ", submitConfig=" + this.submitConfig + ", successConfig=" + this.successConfig + ")";
        }

        public /* synthetic */ b(int i13, C26025l c26025l, C26025l c26025l2, C26022i c26022i, C26026m c26026m, C26026m c26026m2, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(i13, c26025l, c26025l2, (i14 & 8) != 0 ? null : c26022i, (i14 & 16) != 0 ? null : c26026m, (i14 & 32) != 0 ? null : c26026m2);
        }
    }

    /* JADX INFO: renamed from: mx2.b$c */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJN\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b \u0010&R\u001a\u0010\u000b\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010%\u001a\u0004\b\u001a\u0010&¨\u0006'"}, m65681d2 = {"Lmx2/b$c;", "Lmx2/b;", "", "campaignId", "Lmx2/l;", "modalConfig", "errorConfig", "Lmx2/i;", "cancelScreenConfig", "Lmx2/m;", "successConfig", "submitConfig", "<init>", "(ILmx2/l;Lmx2/l;Lmx2/i;Lmx2/m;Lmx2/m;)V", "g", "(ILmx2/l;Lmx2/l;Lmx2/i;Lmx2/m;Lmx2/m;)Lmx2/b$c;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lmx2/l;", "d", "()Lmx2/l;", "c", "f", "Lmx2/i;", "e", "()Lmx2/i;", "Lmx2/m;", "()Lmx2/m;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC26015b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int campaignId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C26025l modalConfig;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C26025l errorConfig;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C26022i cancelScreenConfig;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C26026m successConfig;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C26026m submitConfig;

        public c(int i13, C26025l modalConfig, C26025l errorConfig, C26022i c26022i, C26026m successConfig, C26026m submitConfig) {
            AbstractC22676k.m65750j(modalConfig, "modalConfig");
            AbstractC22676k.m65750j(errorConfig, "errorConfig");
            AbstractC22676k.m65750j(successConfig, "successConfig");
            AbstractC22676k.m65750j(submitConfig, "submitConfig");
            this.campaignId = i13;
            this.modalConfig = modalConfig;
            this.errorConfig = errorConfig;
            this.cancelScreenConfig = c26022i;
            this.successConfig = successConfig;
            this.submitConfig = submitConfig;
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ c m77320h(c cVar, int i13, C26025l c26025l, C26025l c26025l2, C26022i c26022i, C26026m c26026m, C26026m c26026m2, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i13 = cVar.campaignId;
            }
            if ((i14 & 2) != 0) {
                c26025l = cVar.modalConfig;
            }
            if ((i14 & 4) != 0) {
                c26025l2 = cVar.errorConfig;
            }
            if ((i14 & 8) != 0) {
                c26022i = cVar.cancelScreenConfig;
            }
            if ((i14 & 16) != 0) {
                c26026m = cVar.successConfig;
            }
            if ((i14 & 32) != 0) {
                c26026m2 = cVar.submitConfig;
            }
            C26026m c26026m3 = c26026m;
            C26026m c26026m4 = c26026m2;
            return cVar.m77321g(i13, c26025l, c26025l2, c26022i, c26026m3, c26026m4);
        }

        @Override // mx2.InterfaceC26015b
        /* JADX INFO: renamed from: a, reason: from getter */
        public C26026m getSubmitConfig() {
            return this.submitConfig;
        }

        @Override // mx2.InterfaceC26015b
        /* JADX INFO: renamed from: b, reason: from getter */
        public int getCampaignId() {
            return this.campaignId;
        }

        @Override // mx2.InterfaceC26015b
        /* JADX INFO: renamed from: c, reason: from getter */
        public C26026m getSuccessConfig() {
            return this.successConfig;
        }

        @Override // mx2.InterfaceC26015b
        /* JADX INFO: renamed from: d, reason: from getter */
        public C26025l getModalConfig() {
            return this.modalConfig;
        }

        @Override // mx2.InterfaceC26015b
        /* JADX INFO: renamed from: e, reason: from getter */
        public C26022i getCancelScreenConfig() {
            return this.cancelScreenConfig;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return this.campaignId == cVar.campaignId && AbstractC22676k.m65745e(this.modalConfig, cVar.modalConfig) && AbstractC22676k.m65745e(this.errorConfig, cVar.errorConfig) && AbstractC22676k.m65745e(this.cancelScreenConfig, cVar.cancelScreenConfig) && AbstractC22676k.m65745e(this.successConfig, cVar.successConfig) && AbstractC22676k.m65745e(this.submitConfig, cVar.submitConfig);
        }

        @Override // mx2.InterfaceC26015b
        /* JADX INFO: renamed from: f, reason: from getter */
        public C26025l getErrorConfig() {
            return this.errorConfig;
        }

        /* JADX INFO: renamed from: g */
        public final c m77321g(int campaignId, C26025l modalConfig, C26025l errorConfig, C26022i cancelScreenConfig, C26026m successConfig, C26026m submitConfig) {
            AbstractC22676k.m65750j(modalConfig, "modalConfig");
            AbstractC22676k.m65750j(errorConfig, "errorConfig");
            AbstractC22676k.m65750j(successConfig, "successConfig");
            AbstractC22676k.m65750j(submitConfig, "submitConfig");
            return new c(campaignId, modalConfig, errorConfig, cancelScreenConfig, successConfig, submitConfig);
        }

        public int hashCode() {
            int iHashCode = (this.errorConfig.hashCode() + ((this.modalConfig.hashCode() + (Integer.hashCode(this.campaignId) * 31)) * 31)) * 31;
            C26022i c26022i = this.cancelScreenConfig;
            return this.submitConfig.hashCode() + ((this.successConfig.hashCode() + ((iHashCode + (c26022i == null ? 0 : c26022i.hashCode())) * 31)) * 31);
        }

        public String toString() {
            return "DisconnectChestStrapDomain(campaignId=" + this.campaignId + ", modalConfig=" + this.modalConfig + ", errorConfig=" + this.errorConfig + ", cancelScreenConfig=" + this.cancelScreenConfig + ", successConfig=" + this.successConfig + ", submitConfig=" + this.submitConfig + ")";
        }

        public /* synthetic */ c(int i13, C26025l c26025l, C26025l c26025l2, C26022i c26022i, C26026m c26026m, C26026m c26026m2, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(i13, c26025l, c26025l2, (i14 & 8) != 0 ? null : c26022i, c26026m, c26026m2);
        }
    }

    /* JADX INFO: renamed from: mx2.b$d */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJR\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b\u001a\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010%\u001a\u0004\b \u0010&¨\u0006'"}, m65681d2 = {"Lmx2/b$d;", "Lmx2/b;", "", "campaignId", "Lmx2/l;", "modalConfig", "errorConfig", "Lmx2/i;", "cancelScreenConfig", "Lmx2/m;", "submitConfig", "successConfig", "<init>", "(ILmx2/l;Lmx2/l;Lmx2/i;Lmx2/m;Lmx2/m;)V", "g", "(ILmx2/l;Lmx2/l;Lmx2/i;Lmx2/m;Lmx2/m;)Lmx2/b$d;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lmx2/l;", "d", "()Lmx2/l;", "c", "f", "Lmx2/i;", "e", "()Lmx2/i;", "Lmx2/m;", "()Lmx2/m;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements InterfaceC26015b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int campaignId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C26025l modalConfig;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C26025l errorConfig;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C26022i cancelScreenConfig;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C26026m submitConfig;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C26026m successConfig;

        public d(int i13, C26025l modalConfig, C26025l errorConfig, C26022i c26022i, C26026m c26026m, C26026m c26026m2) {
            AbstractC22676k.m65750j(modalConfig, "modalConfig");
            AbstractC22676k.m65750j(errorConfig, "errorConfig");
            this.campaignId = i13;
            this.modalConfig = modalConfig;
            this.errorConfig = errorConfig;
            this.cancelScreenConfig = c26022i;
            this.submitConfig = c26026m;
            this.successConfig = c26026m2;
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ d m77322h(d dVar, int i13, C26025l c26025l, C26025l c26025l2, C26022i c26022i, C26026m c26026m, C26026m c26026m2, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i13 = dVar.campaignId;
            }
            if ((i14 & 2) != 0) {
                c26025l = dVar.modalConfig;
            }
            if ((i14 & 4) != 0) {
                c26025l2 = dVar.errorConfig;
            }
            if ((i14 & 8) != 0) {
                c26022i = dVar.cancelScreenConfig;
            }
            if ((i14 & 16) != 0) {
                c26026m = dVar.submitConfig;
            }
            if ((i14 & 32) != 0) {
                c26026m2 = dVar.successConfig;
            }
            C26026m c26026m3 = c26026m;
            C26026m c26026m4 = c26026m2;
            return dVar.m77323g(i13, c26025l, c26025l2, c26022i, c26026m3, c26026m4);
        }

        @Override // mx2.InterfaceC26015b
        /* JADX INFO: renamed from: a, reason: from getter */
        public C26026m getSubmitConfig() {
            return this.submitConfig;
        }

        @Override // mx2.InterfaceC26015b
        /* JADX INFO: renamed from: b, reason: from getter */
        public int getCampaignId() {
            return this.campaignId;
        }

        @Override // mx2.InterfaceC26015b
        /* JADX INFO: renamed from: c, reason: from getter */
        public C26026m getSuccessConfig() {
            return this.successConfig;
        }

        @Override // mx2.InterfaceC26015b
        /* JADX INFO: renamed from: d, reason: from getter */
        public C26025l getModalConfig() {
            return this.modalConfig;
        }

        @Override // mx2.InterfaceC26015b
        /* JADX INFO: renamed from: e, reason: from getter */
        public C26022i getCancelScreenConfig() {
            return this.cancelScreenConfig;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return this.campaignId == dVar.campaignId && AbstractC22676k.m65745e(this.modalConfig, dVar.modalConfig) && AbstractC22676k.m65745e(this.errorConfig, dVar.errorConfig) && AbstractC22676k.m65745e(this.cancelScreenConfig, dVar.cancelScreenConfig) && AbstractC22676k.m65745e(this.submitConfig, dVar.submitConfig) && AbstractC22676k.m65745e(this.successConfig, dVar.successConfig);
        }

        @Override // mx2.InterfaceC26015b
        /* JADX INFO: renamed from: f, reason: from getter */
        public C26025l getErrorConfig() {
            return this.errorConfig;
        }

        /* JADX INFO: renamed from: g */
        public final d m77323g(int campaignId, C26025l modalConfig, C26025l errorConfig, C26022i cancelScreenConfig, C26026m submitConfig, C26026m successConfig) {
            AbstractC22676k.m65750j(modalConfig, "modalConfig");
            AbstractC22676k.m65750j(errorConfig, "errorConfig");
            return new d(campaignId, modalConfig, errorConfig, cancelScreenConfig, submitConfig, successConfig);
        }

        public int hashCode() {
            int iHashCode = (this.errorConfig.hashCode() + ((this.modalConfig.hashCode() + (Integer.hashCode(this.campaignId) * 31)) * 31)) * 31;
            C26022i c26022i = this.cancelScreenConfig;
            int iHashCode2 = (iHashCode + (c26022i == null ? 0 : c26022i.hashCode())) * 31;
            C26026m c26026m = this.submitConfig;
            int iHashCode3 = (iHashCode2 + (c26026m == null ? 0 : c26026m.hashCode())) * 31;
            C26026m c26026m2 = this.successConfig;
            return iHashCode3 + (c26026m2 != null ? c26026m2.hashCode() : 0);
        }

        public String toString() {
            return "UnknownDomain(campaignId=" + this.campaignId + ", modalConfig=" + this.modalConfig + ", errorConfig=" + this.errorConfig + ", cancelScreenConfig=" + this.cancelScreenConfig + ", submitConfig=" + this.submitConfig + ", successConfig=" + this.successConfig + ")";
        }

        public /* synthetic */ d(int i13, C26025l c26025l, C26025l c26025l2, C26022i c26022i, C26026m c26026m, C26026m c26026m2, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(i13, c26025l, c26025l2, (i14 & 8) != 0 ? null : c26022i, (i14 & 16) != 0 ? null : c26026m, (i14 & 32) != 0 ? null : c26026m2);
        }
    }

    /* JADX INFO: renamed from: mx2.b$a */
    @Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ^\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b\u001c\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010'\u001a\u0004\b\"\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, m65681d2 = {"Lmx2/b$a;", "Lmx2/b;", "", "campaignId", "Lmx2/l;", "modalConfig", "errorConfig", "Lmx2/i;", "cancelScreenConfig", "Lmx2/m;", "submitConfig", "successConfig", "Lmx2/a;", "feedback", "<init>", "(ILmx2/l;Lmx2/l;Lmx2/i;Lmx2/m;Lmx2/m;Lmx2/a;)V", "g", "(ILmx2/l;Lmx2/l;Lmx2/i;Lmx2/m;Lmx2/m;Lmx2/a;)Lmx2/b$a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lmx2/l;", "d", "()Lmx2/l;", "c", "f", "Lmx2/i;", "e", "()Lmx2/i;", "Lmx2/m;", "()Lmx2/m;", "Lmx2/a;", "i", "()Lmx2/a;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC26015b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int campaignId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C26025l modalConfig;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C26025l errorConfig;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C26022i cancelScreenConfig;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C26026m submitConfig;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C26026m successConfig;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final C26014a feedback;

        public a(int i13, C26025l modalConfig, C26025l errorConfig, C26022i c26022i, C26026m c26026m, C26026m c26026m2, C26014a c26014a) {
            AbstractC22676k.m65750j(modalConfig, "modalConfig");
            AbstractC22676k.m65750j(errorConfig, "errorConfig");
            this.campaignId = i13;
            this.modalConfig = modalConfig;
            this.errorConfig = errorConfig;
            this.cancelScreenConfig = c26022i;
            this.submitConfig = c26026m;
            this.successConfig = c26026m2;
            this.feedback = c26014a;
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ a m77315h(a aVar, int i13, C26025l c26025l, C26025l c26025l2, C26022i c26022i, C26026m c26026m, C26026m c26026m2, C26014a c26014a, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i13 = aVar.campaignId;
            }
            if ((i14 & 2) != 0) {
                c26025l = aVar.modalConfig;
            }
            if ((i14 & 4) != 0) {
                c26025l2 = aVar.errorConfig;
            }
            if ((i14 & 8) != 0) {
                c26022i = aVar.cancelScreenConfig;
            }
            if ((i14 & 16) != 0) {
                c26026m = aVar.submitConfig;
            }
            if ((i14 & 32) != 0) {
                c26026m2 = aVar.successConfig;
            }
            if ((i14 & 64) != 0) {
                c26014a = aVar.feedback;
            }
            C26026m c26026m3 = c26026m2;
            C26014a c26014a2 = c26014a;
            C26026m c26026m4 = c26026m;
            C26025l c26025l3 = c26025l2;
            return aVar.m77316g(i13, c26025l, c26025l3, c26022i, c26026m4, c26026m3, c26014a2);
        }

        @Override // mx2.InterfaceC26015b
        /* JADX INFO: renamed from: a, reason: from getter */
        public C26026m getSubmitConfig() {
            return this.submitConfig;
        }

        @Override // mx2.InterfaceC26015b
        /* JADX INFO: renamed from: b, reason: from getter */
        public int getCampaignId() {
            return this.campaignId;
        }

        @Override // mx2.InterfaceC26015b
        /* JADX INFO: renamed from: c, reason: from getter */
        public C26026m getSuccessConfig() {
            return this.successConfig;
        }

        @Override // mx2.InterfaceC26015b
        /* JADX INFO: renamed from: d, reason: from getter */
        public C26025l getModalConfig() {
            return this.modalConfig;
        }

        @Override // mx2.InterfaceC26015b
        /* JADX INFO: renamed from: e, reason: from getter */
        public C26022i getCancelScreenConfig() {
            return this.cancelScreenConfig;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.campaignId == aVar.campaignId && AbstractC22676k.m65745e(this.modalConfig, aVar.modalConfig) && AbstractC22676k.m65745e(this.errorConfig, aVar.errorConfig) && AbstractC22676k.m65745e(this.cancelScreenConfig, aVar.cancelScreenConfig) && AbstractC22676k.m65745e(this.submitConfig, aVar.submitConfig) && AbstractC22676k.m65745e(this.successConfig, aVar.successConfig) && AbstractC22676k.m65745e(this.feedback, aVar.feedback);
        }

        @Override // mx2.InterfaceC26015b
        /* JADX INFO: renamed from: f, reason: from getter */
        public C26025l getErrorConfig() {
            return this.errorConfig;
        }

        /* JADX INFO: renamed from: g */
        public final a m77316g(int campaignId, C26025l modalConfig, C26025l errorConfig, C26022i cancelScreenConfig, C26026m submitConfig, C26026m successConfig, C26014a feedback) {
            AbstractC22676k.m65750j(modalConfig, "modalConfig");
            AbstractC22676k.m65750j(errorConfig, "errorConfig");
            return new a(campaignId, modalConfig, errorConfig, cancelScreenConfig, submitConfig, successConfig, feedback);
        }

        public int hashCode() {
            int iHashCode = (this.errorConfig.hashCode() + ((this.modalConfig.hashCode() + (Integer.hashCode(this.campaignId) * 31)) * 31)) * 31;
            C26022i c26022i = this.cancelScreenConfig;
            int iHashCode2 = (iHashCode + (c26022i == null ? 0 : c26022i.hashCode())) * 31;
            C26026m c26026m = this.submitConfig;
            int iHashCode3 = (iHashCode2 + (c26026m == null ? 0 : c26026m.hashCode())) * 31;
            C26026m c26026m2 = this.successConfig;
            int iHashCode4 = (iHashCode3 + (c26026m2 == null ? 0 : c26026m2.hashCode())) * 31;
            C26014a c26014a = this.feedback;
            return iHashCode4 + (c26014a != null ? c26014a.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final C26014a getFeedback() {
            return this.feedback;
        }

        public String toString() {
            return "CancelEnrollmentDomain(campaignId=" + this.campaignId + ", modalConfig=" + this.modalConfig + ", errorConfig=" + this.errorConfig + ", cancelScreenConfig=" + this.cancelScreenConfig + ", submitConfig=" + this.submitConfig + ", successConfig=" + this.successConfig + ", feedback=" + this.feedback + ")";
        }

        public /* synthetic */ a(int i13, C26025l c26025l, C26025l c26025l2, C26022i c26022i, C26026m c26026m, C26026m c26026m2, C26014a c26014a, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(i13, c26025l, c26025l2, (i14 & 8) != 0 ? null : c26022i, (i14 & 16) != 0 ? null : c26026m, (i14 & 32) != 0 ? null : c26026m2, (i14 & 64) != 0 ? null : c26014a);
        }
    }
}
