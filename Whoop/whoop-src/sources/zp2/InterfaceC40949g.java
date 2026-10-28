package zp2;

import com.whoop.user.journey.model.UserJourneyContentModel;
import com.whoop.user.journey.model.UserJourneyContentModelV2;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zp2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0003\u0006R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lzp2/g;", "", "Lzp2/k;", "a", "()Lzp2/k;", "progressResult", "b", "Lzp2/g$a;", "Lzp2/g$b;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC40949g {

    /* JADX INFO: renamed from: zp2.g$a */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lzp2/g$a;", "Lzp2/g;", "Lzp2/k;", "progressResult", "Lcom/whoop/user/journey/model/UserJourneyContentModel;", "contentModel", "<init>", "(Lzp2/k;Lcom/whoop/user/journey/model/UserJourneyContentModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzp2/k;", "()Lzp2/k;", "b", "Lcom/whoop/user/journey/model/UserJourneyContentModel;", "()Lcom/whoop/user/journey/model/UserJourneyContentModel;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC40949g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C40953k progressResult;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final UserJourneyContentModel contentModel;

        public a(C40953k progressResult, UserJourneyContentModel contentModel) {
            AbstractC22676k.m65750j(progressResult, "progressResult");
            AbstractC22676k.m65750j(contentModel, "contentModel");
            this.progressResult = progressResult;
            this.contentModel = contentModel;
        }

        @Override // zp2.InterfaceC40949g
        /* JADX INFO: renamed from: a, reason: from getter */
        public C40953k getProgressResult() {
            return this.progressResult;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final UserJourneyContentModel getContentModel() {
            return this.contentModel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.progressResult, aVar.progressResult) && AbstractC22676k.m65745e(this.contentModel, aVar.contentModel);
        }

        public int hashCode() {
            return this.contentModel.hashCode() + (this.progressResult.hashCode() * 31);
        }

        public String toString() {
            return "V1(progressResult=" + this.progressResult + ", contentModel=" + this.contentModel + ")";
        }
    }

    /* JADX INFO: renamed from: zp2.g$b */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\r¨\u0006\u001f"}, m65681d2 = {"Lzp2/g$b;", "Lzp2/g;", "Lzp2/k;", "progressResult", "Lcom/whoop/user/journey/model/UserJourneyContentModelV2;", "contentModelV2", "", "submittedTimeCapsuleText", "<init>", "(Lzp2/k;Lcom/whoop/user/journey/model/UserJourneyContentModelV2;Ljava/lang/String;)V", "b", "(Lzp2/k;Lcom/whoop/user/journey/model/UserJourneyContentModelV2;Ljava/lang/String;)Lzp2/g$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzp2/k;", "()Lzp2/k;", "Lcom/whoop/user/journey/model/UserJourneyContentModelV2;", "d", "()Lcom/whoop/user/journey/model/UserJourneyContentModelV2;", "c", "Ljava/lang/String;", "e", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC40949g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C40953k progressResult;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final UserJourneyContentModelV2 contentModelV2;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String submittedTimeCapsuleText;

        public b(C40953k progressResult, UserJourneyContentModelV2 contentModelV2, String str) {
            AbstractC22676k.m65750j(progressResult, "progressResult");
            AbstractC22676k.m65750j(contentModelV2, "contentModelV2");
            this.progressResult = progressResult;
            this.contentModelV2 = contentModelV2;
            this.submittedTimeCapsuleText = str;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ b m132882c(b bVar, C40953k c40953k, UserJourneyContentModelV2 userJourneyContentModelV2, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                c40953k = bVar.progressResult;
            }
            if ((i13 & 2) != 0) {
                userJourneyContentModelV2 = bVar.contentModelV2;
            }
            if ((i13 & 4) != 0) {
                str = bVar.submittedTimeCapsuleText;
            }
            return bVar.m132883b(c40953k, userJourneyContentModelV2, str);
        }

        @Override // zp2.InterfaceC40949g
        /* JADX INFO: renamed from: a, reason: from getter */
        public C40953k getProgressResult() {
            return this.progressResult;
        }

        /* JADX INFO: renamed from: b */
        public final b m132883b(C40953k progressResult, UserJourneyContentModelV2 contentModelV2, String submittedTimeCapsuleText) {
            AbstractC22676k.m65750j(progressResult, "progressResult");
            AbstractC22676k.m65750j(contentModelV2, "contentModelV2");
            return new b(progressResult, contentModelV2, submittedTimeCapsuleText);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final UserJourneyContentModelV2 getContentModelV2() {
            return this.contentModelV2;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getSubmittedTimeCapsuleText() {
            return this.submittedTimeCapsuleText;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.progressResult, bVar.progressResult) && AbstractC22676k.m65745e(this.contentModelV2, bVar.contentModelV2) && AbstractC22676k.m65745e(this.submittedTimeCapsuleText, bVar.submittedTimeCapsuleText);
        }

        public int hashCode() {
            int iHashCode = (this.contentModelV2.hashCode() + (this.progressResult.hashCode() * 31)) * 31;
            String str = this.submittedTimeCapsuleText;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            C40953k c40953k = this.progressResult;
            UserJourneyContentModelV2 userJourneyContentModelV2 = this.contentModelV2;
            String str = this.submittedTimeCapsuleText;
            StringBuilder sb4 = new StringBuilder("V2(progressResult=");
            sb4.append(c40953k);
            sb4.append(", contentModelV2=");
            sb4.append(userJourneyContentModelV2);
            sb4.append(", submittedTimeCapsuleText=");
            return AbstractC25012a.m73376i(str, ")", sb4);
        }
    }

    /* JADX INFO: renamed from: a */
    C40953k getProgressResult();
}
