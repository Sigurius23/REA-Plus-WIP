package pb2;

import com.whoop.navigation.C9598e;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: pb2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lpb2/a;", "", "<init>", "()V", "a", "b", "Lpb2/a$a;", "Lpb2/a$b;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29058a {

    /* JADX INFO: renamed from: pb2.a$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lpb2/a$a;", "Lpb2/a;", "<init>", "()V", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC29058a {

        /* JADX INFO: renamed from: a */
        public static final a f117575a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: pb2.a$b */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\n¨\u0006\u0019"}, m65681d2 = {"Lpb2/a$b;", "Lpb2/a;", "Lcom/whoop/navigation/e;", "action", "", "trackId", "promotion", "<init>", "(Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "b", "Ljava/lang/String;", "c", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC29058a {

        /* JADX INFO: renamed from: d */
        public static final int f117576d = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e action;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String trackId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String promotion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C9598e action, String trackId, String str) {
            super(null);
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(trackId, "trackId");
            this.action = action;
            this.trackId = trackId;
            this.promotion = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C9598e getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPromotion() {
            return this.promotion;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTrackId() {
            return this.trackId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.action, bVar.action) && AbstractC22676k.m65745e(this.trackId, bVar.trackId) && AbstractC22676k.m65745e(this.promotion, bVar.promotion);
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.action.hashCode() * 31, 31, this.trackId);
            String str = this.promotion;
            return iM30450d + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            C9598e c9598e = this.action;
            String str = this.trackId;
            String str2 = this.promotion;
            StringBuilder sb4 = new StringBuilder("NavigationActionEvent(action=");
            sb4.append(c9598e);
            sb4.append(", trackId=");
            sb4.append(str);
            sb4.append(", promotion=");
            return AbstractC25012a.m73376i(str2, ")", sb4);
        }
    }

    public /* synthetic */ AbstractC29058a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC29058a() {
    }
}
