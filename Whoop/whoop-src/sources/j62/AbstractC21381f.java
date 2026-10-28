package j62;

import com.whoop.navigation.C9598e;
import com.whoop.referafriend.domain.models.PromotionRewardModalContentModel;
import com.whoop.referafriend.domain.models.PromotionTermsModalContentModel;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: j62.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lj62/f;", "", "<init>", "()V", "a", "b", "Lj62/f$a;", "Lj62/f$b;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21381f {

    /* JADX INFO: renamed from: j62.f$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lj62/f$a;", "Lj62/f;", "Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;", "content", "<init>", "(Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;", "()Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC21381f {

        /* JADX INFO: renamed from: b */
        public static final int f81796b = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final PromotionRewardModalContentModel content;

        public a(PromotionRewardModalContentModel promotionRewardModalContentModel) {
            super(null);
            this.content = promotionRewardModalContentModel;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PromotionRewardModalContentModel getContent() {
            return this.content;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.content, ((a) other).content);
        }

        public int hashCode() {
            PromotionRewardModalContentModel promotionRewardModalContentModel = this.content;
            if (promotionRewardModalContentModel == null) {
                return 0;
            }
            return promotionRewardModalContentModel.hashCode();
        }

        public String toString() {
            return "PromotionRewardModal(content=" + this.content + ")";
        }
    }

    /* JADX INFO: renamed from: j62.f$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lj62/f$b;", "Lj62/f;", "Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;", "content", "<init>", "(Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;", "()Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC21381f {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final PromotionTermsModalContentModel content;

        public b(PromotionTermsModalContentModel promotionTermsModalContentModel) {
            super(null);
            this.content = promotionTermsModalContentModel;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PromotionTermsModalContentModel getContent() {
            return this.content;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.content, ((b) other).content);
        }

        public int hashCode() {
            PromotionTermsModalContentModel promotionTermsModalContentModel = this.content;
            if (promotionTermsModalContentModel == null) {
                return 0;
            }
            return promotionTermsModalContentModel.hashCode();
        }

        public String toString() {
            return "PromotionTermsModal(content=" + this.content + ")";
        }
    }

    public /* synthetic */ AbstractC21381f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC21381f() {
    }
}
