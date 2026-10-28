package ik1;

import androidx.core.app.NotificationCompat;
import com.whoop.healthspan.domain.models.LockedContentViewState;
import com.whoop.metrics.common.ScreenState;
import ep0.C13404j;
import fy1.InterfaceC14875k;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ik1.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lik1/h;", "Lfy1/k;", "<init>", "()V", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "b", "a", "c", "Lik1/h$a;", "Lik1/h$b;", "Lik1/h$c;", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18611h implements InterfaceC14875k {

    /* JADX INFO: renamed from: ik1.h$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lik1/h$a;", "Lik1/h;", "<init>", "()V", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC18611h {

        /* JADX INFO: renamed from: b */
        public static final a f72765b = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ik1.h$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lik1/h$b;", "Lik1/h;", "<init>", "()V", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC18611h {

        /* JADX INFO: renamed from: b */
        public static final b f72766b = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ik1.h$c */
    @Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJH\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\"\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, m65681d2 = {"Lik1/h$c;", "Lik1/h;", "Lik1/i;", NotificationCompat.CATEGORY_NAVIGATION, "Lik1/d;", "content", "Lcom/whoop/healthspan/domain/models/LockedContentViewState;", "lockedContent", "", "hasNavigatedToOnboarding", "Lep0/j;", "screenContextMetadata", "<init>", "(Lik1/i;Lik1/d;Lcom/whoop/healthspan/domain/models/LockedContentViewState;ZLep0/j;)V", "b", "(Lik1/i;Lik1/d;Lcom/whoop/healthspan/domain/models/LockedContentViewState;ZLep0/j;)Lik1/h$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lik1/i;", "g", "()Lik1/i;", "c", "Lik1/d;", "d", "()Lik1/d;", "Lcom/whoop/healthspan/domain/models/LockedContentViewState;", "f", "()Lcom/whoop/healthspan/domain/models/LockedContentViewState;", "e", "Z", "()Z", "Lep0/j;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lep0/j;", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC18611h {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C18612i navigation;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C18607d content;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final LockedContentViewState lockedContent;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final boolean hasNavigatedToOnboarding;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C13404j screenContextMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C18612i navigation, C18607d c18607d, LockedContentViewState lockedContentViewState, boolean z4, C13404j c13404j) {
            super(null);
            AbstractC22676k.m65750j(navigation, "navigation");
            this.navigation = navigation;
            this.content = c18607d;
            this.lockedContent = lockedContentViewState;
            this.hasNavigatedToOnboarding = z4;
            this.screenContextMetadata = c13404j;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ c m53861c(c cVar, C18612i c18612i, C18607d c18607d, LockedContentViewState lockedContentViewState, boolean z4, C13404j c13404j, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                c18612i = cVar.navigation;
            }
            if ((i13 & 2) != 0) {
                c18607d = cVar.content;
            }
            if ((i13 & 4) != 0) {
                lockedContentViewState = cVar.lockedContent;
            }
            if ((i13 & 8) != 0) {
                z4 = cVar.hasNavigatedToOnboarding;
            }
            if ((i13 & 16) != 0) {
                c13404j = cVar.screenContextMetadata;
            }
            C13404j c13404j2 = c13404j;
            LockedContentViewState lockedContentViewState2 = lockedContentViewState;
            return cVar.m53862b(c18612i, c18607d, lockedContentViewState2, z4, c13404j2);
        }

        /* JADX INFO: renamed from: b */
        public final c m53862b(C18612i navigation, C18607d content, LockedContentViewState lockedContent, boolean hasNavigatedToOnboarding, C13404j screenContextMetadata) {
            AbstractC22676k.m65750j(navigation, "navigation");
            return new c(navigation, content, lockedContent, hasNavigatedToOnboarding, screenContextMetadata);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C18607d getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getHasNavigatedToOnboarding() {
            return this.hasNavigatedToOnboarding;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.navigation, cVar.navigation) && AbstractC22676k.m65745e(this.content, cVar.content) && AbstractC22676k.m65745e(this.lockedContent, cVar.lockedContent) && this.hasNavigatedToOnboarding == cVar.hasNavigatedToOnboarding && AbstractC22676k.m65745e(this.screenContextMetadata, cVar.screenContextMetadata);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final LockedContentViewState getLockedContent() {
            return this.lockedContent;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final C18612i getNavigation() {
            return this.navigation;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final C13404j getScreenContextMetadata() {
            return this.screenContextMetadata;
        }

        public int hashCode() {
            int iHashCode = this.navigation.hashCode() * 31;
            C18607d c18607d = this.content;
            int iHashCode2 = (iHashCode + (c18607d == null ? 0 : c18607d.hashCode())) * 31;
            LockedContentViewState lockedContentViewState = this.lockedContent;
            int iM8289b = AbstractC2875y.m8289b((iHashCode2 + (lockedContentViewState == null ? 0 : lockedContentViewState.hashCode())) * 31, 31, this.hasNavigatedToOnboarding);
            C13404j c13404j = this.screenContextMetadata;
            return iM8289b + (c13404j != null ? c13404j.hashCode() : 0);
        }

        public String toString() {
            return "Success(navigation=" + this.navigation + ", content=" + this.content + ", lockedContent=" + this.lockedContent + ", hasNavigatedToOnboarding=" + this.hasNavigatedToOnboarding + ", screenContextMetadata=" + this.screenContextMetadata + ")";
        }
    }

    public /* synthetic */ AbstractC18611h(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // fy1.InterfaceC14875k
    public ScreenState getState() {
        if (this instanceof b) {
            return ScreenState.LOADING;
        }
        if (this instanceof a) {
            return ScreenState.ERROR;
        }
        if (this instanceof c) {
            return ScreenState.SUCCESS;
        }
        throw new NoWhenBranchMatchedException();
    }

    private AbstractC18611h() {
    }
}
