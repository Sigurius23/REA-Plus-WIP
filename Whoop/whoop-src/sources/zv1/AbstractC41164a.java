package zv1;

import com.whoop.membership.dunning.domain.models.CycleDataDunningBottomSheetModel;
import com.whoop.membership.dunning.domain.models.PaymentsOptionsDunningBottomSheetModel;
import com.whoop.navigation.C9598e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: zv1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lzv1/a;", "", "<init>", "()V", "a", "b", "Lzv1/a$a;", "Lzv1/a$b;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC41164a {

    /* JADX INFO: renamed from: zv1.a$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lzv1/a$a;", "Lzv1/a;", "Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetModel;", "content", "<init>", "(Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetModel;", "()Lcom/whoop/membership/dunning/domain/models/CycleDataDunningBottomSheetModel;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC41164a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final CycleDataDunningBottomSheetModel content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CycleDataDunningBottomSheetModel content) {
            super(null);
            AbstractC22676k.m65750j(content, "content");
            this.content = content;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CycleDataDunningBottomSheetModel getContent() {
            return this.content;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.content, ((a) other).content);
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            return "CycleDataDunningBottomSheet(content=" + this.content + ")";
        }
    }

    /* JADX INFO: renamed from: zv1.a$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lzv1/a$b;", "Lzv1/a;", "Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetModel;", "content", "<init>", "(Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetModel;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetModel;", "()Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetModel;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC41164a {

        /* JADX INFO: renamed from: b */
        public static final int f177580b = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final PaymentsOptionsDunningBottomSheetModel content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PaymentsOptionsDunningBottomSheetModel content) {
            super(null);
            AbstractC22676k.m65750j(content, "content");
            this.content = content;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PaymentsOptionsDunningBottomSheetModel getContent() {
            return this.content;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.content, ((b) other).content);
        }

        public int hashCode() {
            return this.content.hashCode();
        }

        public String toString() {
            return "PaymentsOptionsDunningBottomSheet(content=" + this.content + ")";
        }
    }

    public /* synthetic */ AbstractC41164a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC41164a() {
    }
}
