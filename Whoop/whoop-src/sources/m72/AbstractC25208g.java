package m72;

import com.whoop.metrics.common.ScreenState;
import fy1.InterfaceC14875k;
import hy0.C17750h1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: m72.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lm72/g;", "Lfy1/k;", "<init>", "()V", "Lcom/whoop/metrics/common/ScreenState;", "getState", "()Lcom/whoop/metrics/common/ScreenState;", "state", "b", "a", "c", "Lm72/g$a;", "Lm72/g$b;", "Lm72/g$c;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25208g implements InterfaceC14875k {

    /* JADX INFO: renamed from: m72.g$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lm72/g$a;", "Lm72/g;", "<init>", "()V", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC25208g {

        /* JADX INFO: renamed from: b */
        public static final a f99003b = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: m72.g$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lm72/g$b;", "Lm72/g;", "<init>", "()V", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC25208g {

        /* JADX INFO: renamed from: b */
        public static final b f99004b = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: m72.g$c */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJT\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b$\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u001f\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, m65681d2 = {"Lm72/g$c;", "Lm72/g;", "", "navigationTitle", "Lhy0/h1;", "navigationTag", "Lm72/a;", "content", "Lm72/c;", "lockedContent", "", "hasNavigatedToOnboarding", "Lm72/d;", "sageBottomSheetState", "<init>", "(Ljava/lang/String;Lhy0/h1;Lm72/a;Lm72/c;ZLm72/d;)V", "b", "(Ljava/lang/String;Lhy0/h1;Lm72/a;Lm72/c;ZLm72/d;)Lm72/g$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "Lhy0/h1;", "g", "()Lhy0/h1;", "d", "Lm72/a;", "()Lm72/a;", "e", "Lm72/c;", "f", "()Lm72/c;", "Z", "()Z", "Lm72/d;", "i", "()Lm72/d;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC25208g {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String navigationTitle;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C17750h1 navigationTag;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C25202a content;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C25204c lockedContent;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final boolean hasNavigatedToOnboarding;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final C25205d sageBottomSheetState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String navigationTitle, C17750h1 c17750h1, C25202a c25202a, C25204c c25204c, boolean z4, C25205d c25205d) {
            super(null);
            AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
            this.navigationTitle = navigationTitle;
            this.navigationTag = c17750h1;
            this.content = c25202a;
            this.lockedContent = c25204c;
            this.hasNavigatedToOnboarding = z4;
            this.sageBottomSheetState = c25205d;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ c m73819c(c cVar, String str, C17750h1 c17750h1, C25202a c25202a, C25204c c25204c, boolean z4, C25205d c25205d, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = cVar.navigationTitle;
            }
            if ((i13 & 2) != 0) {
                c17750h1 = cVar.navigationTag;
            }
            if ((i13 & 4) != 0) {
                c25202a = cVar.content;
            }
            if ((i13 & 8) != 0) {
                c25204c = cVar.lockedContent;
            }
            if ((i13 & 16) != 0) {
                z4 = cVar.hasNavigatedToOnboarding;
            }
            if ((i13 & 32) != 0) {
                c25205d = cVar.sageBottomSheetState;
            }
            boolean z13 = z4;
            C25205d c25205d2 = c25205d;
            return cVar.m73820b(str, c17750h1, c25202a, c25204c, z13, c25205d2);
        }

        /* JADX INFO: renamed from: b */
        public final c m73820b(String navigationTitle, C17750h1 navigationTag, C25202a content, C25204c lockedContent, boolean hasNavigatedToOnboarding, C25205d sageBottomSheetState) {
            AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
            return new c(navigationTitle, navigationTag, content, lockedContent, hasNavigatedToOnboarding, sageBottomSheetState);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C25202a getContent() {
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
            return AbstractC22676k.m65745e(this.navigationTitle, cVar.navigationTitle) && AbstractC22676k.m65745e(this.navigationTag, cVar.navigationTag) && AbstractC22676k.m65745e(this.content, cVar.content) && AbstractC22676k.m65745e(this.lockedContent, cVar.lockedContent) && this.hasNavigatedToOnboarding == cVar.hasNavigatedToOnboarding && AbstractC22676k.m65745e(this.sageBottomSheetState, cVar.sageBottomSheetState);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final C25204c getLockedContent() {
            return this.lockedContent;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final C17750h1 getNavigationTag() {
            return this.navigationTag;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getNavigationTitle() {
            return this.navigationTitle;
        }

        public int hashCode() {
            int iHashCode = this.navigationTitle.hashCode() * 31;
            C17750h1 c17750h1 = this.navigationTag;
            int iHashCode2 = (iHashCode + (c17750h1 == null ? 0 : c17750h1.hashCode())) * 31;
            C25202a c25202a = this.content;
            int iHashCode3 = (iHashCode2 + (c25202a == null ? 0 : c25202a.hashCode())) * 31;
            C25204c c25204c = this.lockedContent;
            int iM8289b = AbstractC2875y.m8289b((iHashCode3 + (c25204c == null ? 0 : c25204c.hashCode())) * 31, 31, this.hasNavigatedToOnboarding);
            C25205d c25205d = this.sageBottomSheetState;
            return iM8289b + (c25205d != null ? c25205d.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final C25205d getSageBottomSheetState() {
            return this.sageBottomSheetState;
        }

        public String toString() {
            return "Success(navigationTitle=" + this.navigationTitle + ", navigationTag=" + this.navigationTag + ", content=" + this.content + ", lockedContent=" + this.lockedContent + ", hasNavigatedToOnboarding=" + this.hasNavigatedToOnboarding + ", sageBottomSheetState=" + this.sageBottomSheetState + ")";
        }
    }

    public /* synthetic */ AbstractC25208g(DefaultConstructorMarker defaultConstructorMarker) {
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

    private AbstractC25208g() {
    }
}
