package ky2;

import androidx.core.app.NotificationCompat;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.whooplabs.feature.navigation.AbstractC10840c;
import d13.AbstractC11478a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Set;
import jh3.AbstractC21702c;
import kd1.AbstractC22403o;
import m83.C25235a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: ky2.g */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, m65681d2 = {"Lky2/g;", "", "d", "b", "e", "c", "f", "a", "Lky2/g$a;", "Lky2/g$b;", "Lky2/g$c;", "Lky2/g$d;", "Lky2/g$e;", "Lky2/g$f;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC22898g {

    /* JADX INFO: renamed from: ky2.g$a */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0012\u000fBE\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\b\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0016\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0012\u0010 \u0082\u0001\u0002!\"¨\u0006#"}, m65681d2 = {"Lky2/g$a;", "Lky2/g;", "", "questionId", "Lcom/whoop/design/util/TextResource;", "toolbarTitle", "toolbarSubTitle", "", "isPositiveButtonEnabled", "Lky2/l;", "submitting", "Lky2/k;", "submitted", "<init>", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLky2/l;Lky2/k;)V", "a", "I", "()I", "b", "Lcom/whoop/design/util/TextResource;", "getToolbarTitle", "()Lcom/whoop/design/util/TextResource;", "c", "getToolbarSubTitle", "d", "Z", "()Z", "e", "Lky2/l;", "()Lky2/l;", "f", "Lky2/k;", "()Lky2/k;", "Lky2/g$a$a;", "Lky2/g$a$b;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class a implements InterfaceC22898g {

        /* JADX INFO: renamed from: g */
        public static final int f90391g;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int questionId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource toolbarTitle;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource toolbarSubTitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean isPositiveButtonEnabled;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C22903l submitting;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C22902k submitted;

        static {
            int i13 = C9598e.f28134d;
            int i14 = TextResource.$stable;
            f90391g = i13 | i14 | i14 | i14 | i14 | i14 | i14;
        }

        public /* synthetic */ a(int i13, TextResource textResource, TextResource textResource2, boolean z4, C22903l c22903l, C22902k c22902k, DefaultConstructorMarker defaultConstructorMarker) {
            this(i13, textResource, textResource2, z4, c22903l, c22902k);
        }

        /* JADX INFO: renamed from: a */
        public abstract int getQuestionId();

        /* JADX INFO: renamed from: b */
        public abstract C22902k getSubmitted();

        /* JADX INFO: renamed from: c */
        public abstract C22903l getSubmitting();

        private a(int i13, TextResource textResource, TextResource textResource2, boolean z4, C22903l c22903l, C22902k c22902k) {
            this.questionId = i13;
            this.toolbarTitle = textResource;
            this.toolbarSubTitle = textResource2;
            this.isPositiveButtonEnabled = z4;
            this.submitting = c22903l;
            this.submitted = c22902k;
        }

        /* JADX INFO: renamed from: ky2.g$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0094\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u00101\u001a\u0004\b2\u00103R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010&\u001a\u0004\b%\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b5\u0010&\u001a\u0004\b6\u0010(R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010\u001bR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b\"\u0010<R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00148\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b)\u0010?¨\u0006@"}, m65681d2 = {"Lky2/g$a$a;", "Lky2/g$a;", "", "questionId", "Lcom/whoop/design/util/TextResource;", "toolbarTitle", "toolbarSubTitle", "", "isPositiveButtonEnabled", "Lky2/l;", "submitting", "Lky2/k;", "submitted", "positiveButton", "negativeButton", "", "content", "", "Lky2/i;", "options", "", "selectedOptionKeys", "<init>", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLky2/l;Lky2/k;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/util/Set;)V", "d", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLky2/l;Lky2/k;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/util/Set;)Lky2/g$a$a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "I", "a", "i", "Lcom/whoop/design/util/TextResource;", "l", "()Lcom/whoop/design/util/TextResource;", "j", "k", "Z", "m", "()Z", "Lky2/l;", "c", "()Lky2/l;", "Lky2/k;", "b", "()Lky2/k;", "n", "o", "g", "p", "Ljava/lang/String;", "f", "q", "Ljava/util/List;", "()Ljava/util/List;", "r", "Ljava/util/Set;", "()Ljava/util/Set;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C41939a extends a {

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            private final int questionId;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            private final TextResource toolbarTitle;

            /* JADX INFO: renamed from: j, reason: from kotlin metadata */
            private final TextResource toolbarSubTitle;

            /* JADX INFO: renamed from: k, reason: from kotlin metadata */
            private final boolean isPositiveButtonEnabled;

            /* JADX INFO: renamed from: l, reason: from kotlin metadata */
            private final C22903l submitting;

            /* JADX INFO: renamed from: m, reason: from kotlin metadata */
            private final C22902k submitted;

            /* JADX INFO: renamed from: n, reason: from kotlin metadata */
            private final TextResource positiveButton;

            /* JADX INFO: renamed from: o, reason: from kotlin metadata */
            private final TextResource negativeButton;

            /* JADX INFO: renamed from: p, reason: from kotlin metadata */
            private final String content;

            /* JADX INFO: renamed from: q, reason: from kotlin metadata */
            private final List<C22900i> options;

            /* JADX INFO: renamed from: r, reason: from kotlin metadata */
            private final Set<String> selectedOptionKeys;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41939a(int i13, TextResource toolbarTitle, TextResource textResource, boolean z4, C22903l c22903l, C22902k c22902k, TextResource positiveButton, TextResource textResource2, String str, List<C22900i> options, Set<String> selectedOptionKeys) {
                super(i13, toolbarTitle, textResource, z4, c22903l, c22902k, null);
                AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
                AbstractC22676k.m65750j(positiveButton, "positiveButton");
                AbstractC22676k.m65750j(options, "options");
                AbstractC22676k.m65750j(selectedOptionKeys, "selectedOptionKeys");
                this.questionId = i13;
                this.toolbarTitle = toolbarTitle;
                this.toolbarSubTitle = textResource;
                this.isPositiveButtonEnabled = z4;
                this.submitting = c22903l;
                this.submitted = c22902k;
                this.positiveButton = positiveButton;
                this.negativeButton = textResource2;
                this.content = str;
                this.options = options;
                this.selectedOptionKeys = selectedOptionKeys;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: e */
            public static /* synthetic */ C41939a m66581e(C41939a c41939a, int i13, TextResource textResource, TextResource textResource2, boolean z4, C22903l c22903l, C22902k c22902k, TextResource textResource3, TextResource textResource4, String str, List list, Set set, int i14, Object obj) {
                if ((i14 & 1) != 0) {
                    i13 = c41939a.questionId;
                }
                if ((i14 & 2) != 0) {
                    textResource = c41939a.toolbarTitle;
                }
                if ((i14 & 4) != 0) {
                    textResource2 = c41939a.toolbarSubTitle;
                }
                if ((i14 & 8) != 0) {
                    z4 = c41939a.isPositiveButtonEnabled;
                }
                if ((i14 & 16) != 0) {
                    c22903l = c41939a.submitting;
                }
                if ((i14 & 32) != 0) {
                    c22902k = c41939a.submitted;
                }
                if ((i14 & 64) != 0) {
                    textResource3 = c41939a.positiveButton;
                }
                if ((i14 & 128) != 0) {
                    textResource4 = c41939a.negativeButton;
                }
                if ((i14 & 256) != 0) {
                    str = c41939a.content;
                }
                if ((i14 & 512) != 0) {
                    list = c41939a.options;
                }
                if ((i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                    set = c41939a.selectedOptionKeys;
                }
                List list2 = list;
                Set set2 = set;
                TextResource textResource5 = textResource4;
                String str2 = str;
                C22902k c22902k2 = c22902k;
                TextResource textResource6 = textResource3;
                C22903l c22903l2 = c22903l;
                TextResource textResource7 = textResource2;
                return c41939a.m66582d(i13, textResource, textResource7, z4, c22903l2, c22902k2, textResource6, textResource5, str2, list2, set2);
            }

            @Override // ky2.InterfaceC22898g.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public int getQuestionId() {
                return this.questionId;
            }

            @Override // ky2.InterfaceC22898g.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public C22902k getSubmitted() {
                return this.submitted;
            }

            @Override // ky2.InterfaceC22898g.a
            /* JADX INFO: renamed from: c, reason: from getter */
            public C22903l getSubmitting() {
                return this.submitting;
            }

            /* JADX INFO: renamed from: d */
            public final C41939a m66582d(int questionId, TextResource toolbarTitle, TextResource toolbarSubTitle, boolean isPositiveButtonEnabled, C22903l submitting, C22902k submitted, TextResource positiveButton, TextResource negativeButton, String content, List<C22900i> options, Set<String> selectedOptionKeys) {
                AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
                AbstractC22676k.m65750j(positiveButton, "positiveButton");
                AbstractC22676k.m65750j(options, "options");
                AbstractC22676k.m65750j(selectedOptionKeys, "selectedOptionKeys");
                return new C41939a(questionId, toolbarTitle, toolbarSubTitle, isPositiveButtonEnabled, submitting, submitted, positiveButton, negativeButton, content, options, selectedOptionKeys);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C41939a)) {
                    return false;
                }
                C41939a c41939a = (C41939a) other;
                return this.questionId == c41939a.questionId && AbstractC22676k.m65745e(this.toolbarTitle, c41939a.toolbarTitle) && AbstractC22676k.m65745e(this.toolbarSubTitle, c41939a.toolbarSubTitle) && this.isPositiveButtonEnabled == c41939a.isPositiveButtonEnabled && AbstractC22676k.m65745e(this.submitting, c41939a.submitting) && AbstractC22676k.m65745e(this.submitted, c41939a.submitted) && AbstractC22676k.m65745e(this.positiveButton, c41939a.positiveButton) && AbstractC22676k.m65745e(this.negativeButton, c41939a.negativeButton) && AbstractC22676k.m65745e(this.content, c41939a.content) && AbstractC22676k.m65745e(this.options, c41939a.options) && AbstractC22676k.m65745e(this.selectedOptionKeys, c41939a.selectedOptionKeys);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getContent() {
                return this.content;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final TextResource getNegativeButton() {
                return this.negativeButton;
            }

            /* JADX INFO: renamed from: h */
            public final List<C22900i> m66585h() {
                return this.options;
            }

            public int hashCode() {
                int iM95625a = AbstractC31061c.m95625a(Integer.hashCode(this.questionId) * 31, this.toolbarTitle, 31);
                TextResource textResource = this.toolbarSubTitle;
                int iM8289b = AbstractC2875y.m8289b((iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31, 31, this.isPositiveButtonEnabled);
                C22903l c22903l = this.submitting;
                int iHashCode = (iM8289b + (c22903l == null ? 0 : c22903l.hashCode())) * 31;
                C22902k c22902k = this.submitted;
                int iM95625a2 = AbstractC31061c.m95625a((iHashCode + (c22902k == null ? 0 : c22902k.hashCode())) * 31, this.positiveButton, 31);
                TextResource textResource2 = this.negativeButton;
                int iHashCode2 = (iM95625a2 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
                String str = this.content;
                return this.selectedOptionKeys.hashCode() + AbstractC11895b.m31983b((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.options);
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final TextResource getPositiveButton() {
                return this.positiveButton;
            }

            /* JADX INFO: renamed from: j */
            public final Set<String> m66587j() {
                return this.selectedOptionKeys;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public TextResource getToolbarSubTitle() {
                return this.toolbarSubTitle;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public TextResource getToolbarTitle() {
                return this.toolbarTitle;
            }

            /* JADX INFO: renamed from: m, reason: from getter */
            public boolean getIsPositiveButtonEnabled() {
                return this.isPositiveButtonEnabled;
            }

            public String toString() {
                int i13 = this.questionId;
                TextResource textResource = this.toolbarTitle;
                TextResource textResource2 = this.toolbarSubTitle;
                boolean z4 = this.isPositiveButtonEnabled;
                C22903l c22903l = this.submitting;
                C22902k c22902k = this.submitted;
                TextResource textResource3 = this.positiveButton;
                TextResource textResource4 = this.negativeButton;
                String str = this.content;
                List<C22900i> list = this.options;
                Set<String> set = this.selectedOptionKeys;
                StringBuilder sbM91844n = AbstractC30007c.m91844n("CampaignScreeningCheckViewState(questionId=", i13, ", toolbarTitle=", textResource, ", toolbarSubTitle=");
                AbstractC33745d.m106664w(textResource2, ", isPositiveButtonEnabled=", ", submitting=", sbM91844n, z4);
                sbM91844n.append(c22903l);
                sbM91844n.append(", submitted=");
                sbM91844n.append(c22902k);
                sbM91844n.append(", positiveButton=");
                AbstractC30007c.m91855y(sbM91844n, textResource3, ", negativeButton=", textResource4, ", content=");
                AbstractC36095b.m114694v(str, ", options=", ", selectedOptionKeys=", sbM91844n, list);
                sbM91844n.append(set);
                sbM91844n.append(")");
                return sbM91844n.toString();
            }

            public /* synthetic */ C41939a(int i13, TextResource textResource, TextResource textResource2, boolean z4, C22903l c22903l, C22902k c22902k, TextResource textResource3, TextResource textResource4, String str, List list, Set set, int i14, DefaultConstructorMarker defaultConstructorMarker) {
                this(i13, textResource, textResource2, (i14 & 8) != 0 ? true : z4, (i14 & 16) != 0 ? null : c22903l, (i14 & 32) != 0 ? null : c22902k, textResource3, textResource4, str, list, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? C25235a0.f99113w : set);
            }
        }

        /* JADX INFO: renamed from: ky2.g$a$b */
        @Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0090\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u00100\u001a\u0004\b1\u00102R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010%\u001a\u0004\b$\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b4\u0010%\u001a\u0004\b5\u0010'R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u001aR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b!\u0010;R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b(\u0010>¨\u0006?"}, m65681d2 = {"Lky2/g$a$b;", "Lky2/g$a;", "", "questionId", "Lcom/whoop/design/util/TextResource;", "toolbarTitle", "toolbarSubTitle", "", "isPositiveButtonEnabled", "Lky2/l;", "submitting", "Lky2/k;", "submitted", "positiveButton", "negativeButton", "", "content", "", "Lky2/i;", "options", "selectedOptionIndex", "<init>", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLky2/l;Lky2/k;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)V", "d", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLky2/l;Lky2/k;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)Lky2/g$a$b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "I", "a", "i", "Lcom/whoop/design/util/TextResource;", "l", "()Lcom/whoop/design/util/TextResource;", "j", "k", "Z", "m", "()Z", "Lky2/l;", "c", "()Lky2/l;", "Lky2/k;", "b", "()Lky2/k;", "n", "o", "g", "p", "Ljava/lang/String;", "f", "q", "Ljava/util/List;", "()Ljava/util/List;", "r", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b extends a {

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            private final int questionId;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            private final TextResource toolbarTitle;

            /* JADX INFO: renamed from: j, reason: from kotlin metadata */
            private final TextResource toolbarSubTitle;

            /* JADX INFO: renamed from: k, reason: from kotlin metadata */
            private final boolean isPositiveButtonEnabled;

            /* JADX INFO: renamed from: l, reason: from kotlin metadata */
            private final C22903l submitting;

            /* JADX INFO: renamed from: m, reason: from kotlin metadata */
            private final C22902k submitted;

            /* JADX INFO: renamed from: n, reason: from kotlin metadata */
            private final TextResource positiveButton;

            /* JADX INFO: renamed from: o, reason: from kotlin metadata */
            private final TextResource negativeButton;

            /* JADX INFO: renamed from: p, reason: from kotlin metadata */
            private final String content;

            /* JADX INFO: renamed from: q, reason: from kotlin metadata */
            private final List<C22900i> options;

            /* JADX INFO: renamed from: r, reason: from kotlin metadata */
            private final Integer selectedOptionIndex;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i13, TextResource toolbarTitle, TextResource textResource, boolean z4, C22903l c22903l, C22902k c22902k, TextResource positiveButton, TextResource textResource2, String str, List<C22900i> options, Integer num) {
                super(i13, toolbarTitle, textResource, z4, c22903l, c22902k, null);
                AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
                AbstractC22676k.m65750j(positiveButton, "positiveButton");
                AbstractC22676k.m65750j(options, "options");
                this.questionId = i13;
                this.toolbarTitle = toolbarTitle;
                this.toolbarSubTitle = textResource;
                this.isPositiveButtonEnabled = z4;
                this.submitting = c22903l;
                this.submitted = c22902k;
                this.positiveButton = positiveButton;
                this.negativeButton = textResource2;
                this.content = str;
                this.options = options;
                this.selectedOptionIndex = num;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: e */
            public static /* synthetic */ b m66591e(b bVar, int i13, TextResource textResource, TextResource textResource2, boolean z4, C22903l c22903l, C22902k c22902k, TextResource textResource3, TextResource textResource4, String str, List list, Integer num, int i14, Object obj) {
                if ((i14 & 1) != 0) {
                    i13 = bVar.questionId;
                }
                if ((i14 & 2) != 0) {
                    textResource = bVar.toolbarTitle;
                }
                if ((i14 & 4) != 0) {
                    textResource2 = bVar.toolbarSubTitle;
                }
                if ((i14 & 8) != 0) {
                    z4 = bVar.isPositiveButtonEnabled;
                }
                if ((i14 & 16) != 0) {
                    c22903l = bVar.submitting;
                }
                if ((i14 & 32) != 0) {
                    c22902k = bVar.submitted;
                }
                if ((i14 & 64) != 0) {
                    textResource3 = bVar.positiveButton;
                }
                if ((i14 & 128) != 0) {
                    textResource4 = bVar.negativeButton;
                }
                if ((i14 & 256) != 0) {
                    str = bVar.content;
                }
                if ((i14 & 512) != 0) {
                    list = bVar.options;
                }
                if ((i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                    num = bVar.selectedOptionIndex;
                }
                List list2 = list;
                Integer num2 = num;
                TextResource textResource5 = textResource4;
                String str2 = str;
                C22902k c22902k2 = c22902k;
                TextResource textResource6 = textResource3;
                C22903l c22903l2 = c22903l;
                TextResource textResource7 = textResource2;
                return bVar.m66592d(i13, textResource, textResource7, z4, c22903l2, c22902k2, textResource6, textResource5, str2, list2, num2);
            }

            @Override // ky2.InterfaceC22898g.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public int getQuestionId() {
                return this.questionId;
            }

            @Override // ky2.InterfaceC22898g.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public C22902k getSubmitted() {
                return this.submitted;
            }

            @Override // ky2.InterfaceC22898g.a
            /* JADX INFO: renamed from: c, reason: from getter */
            public C22903l getSubmitting() {
                return this.submitting;
            }

            /* JADX INFO: renamed from: d */
            public final b m66592d(int questionId, TextResource toolbarTitle, TextResource toolbarSubTitle, boolean isPositiveButtonEnabled, C22903l submitting, C22902k submitted, TextResource positiveButton, TextResource negativeButton, String content, List<C22900i> options, Integer selectedOptionIndex) {
                AbstractC22676k.m65750j(toolbarTitle, "toolbarTitle");
                AbstractC22676k.m65750j(positiveButton, "positiveButton");
                AbstractC22676k.m65750j(options, "options");
                return new b(questionId, toolbarTitle, toolbarSubTitle, isPositiveButtonEnabled, submitting, submitted, positiveButton, negativeButton, content, options, selectedOptionIndex);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof b)) {
                    return false;
                }
                b bVar = (b) other;
                return this.questionId == bVar.questionId && AbstractC22676k.m65745e(this.toolbarTitle, bVar.toolbarTitle) && AbstractC22676k.m65745e(this.toolbarSubTitle, bVar.toolbarSubTitle) && this.isPositiveButtonEnabled == bVar.isPositiveButtonEnabled && AbstractC22676k.m65745e(this.submitting, bVar.submitting) && AbstractC22676k.m65745e(this.submitted, bVar.submitted) && AbstractC22676k.m65745e(this.positiveButton, bVar.positiveButton) && AbstractC22676k.m65745e(this.negativeButton, bVar.negativeButton) && AbstractC22676k.m65745e(this.content, bVar.content) && AbstractC22676k.m65745e(this.options, bVar.options) && AbstractC22676k.m65745e(this.selectedOptionIndex, bVar.selectedOptionIndex);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getContent() {
                return this.content;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final TextResource getNegativeButton() {
                return this.negativeButton;
            }

            /* JADX INFO: renamed from: h */
            public final List<C22900i> m66595h() {
                return this.options;
            }

            public int hashCode() {
                int iM95625a = AbstractC31061c.m95625a(Integer.hashCode(this.questionId) * 31, this.toolbarTitle, 31);
                TextResource textResource = this.toolbarSubTitle;
                int iM8289b = AbstractC2875y.m8289b((iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31, 31, this.isPositiveButtonEnabled);
                C22903l c22903l = this.submitting;
                int iHashCode = (iM8289b + (c22903l == null ? 0 : c22903l.hashCode())) * 31;
                C22902k c22902k = this.submitted;
                int iM95625a2 = AbstractC31061c.m95625a((iHashCode + (c22902k == null ? 0 : c22902k.hashCode())) * 31, this.positiveButton, 31);
                TextResource textResource2 = this.negativeButton;
                int iHashCode2 = (iM95625a2 + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
                String str = this.content;
                int iM31983b = AbstractC11895b.m31983b((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.options);
                Integer num = this.selectedOptionIndex;
                return iM31983b + (num != null ? num.hashCode() : 0);
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final TextResource getPositiveButton() {
                return this.positiveButton;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final Integer getSelectedOptionIndex() {
                return this.selectedOptionIndex;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public TextResource getToolbarSubTitle() {
                return this.toolbarSubTitle;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public TextResource getToolbarTitle() {
                return this.toolbarTitle;
            }

            /* JADX INFO: renamed from: m, reason: from getter */
            public boolean getIsPositiveButtonEnabled() {
                return this.isPositiveButtonEnabled;
            }

            public String toString() {
                int i13 = this.questionId;
                TextResource textResource = this.toolbarTitle;
                TextResource textResource2 = this.toolbarSubTitle;
                boolean z4 = this.isPositiveButtonEnabled;
                C22903l c22903l = this.submitting;
                C22902k c22902k = this.submitted;
                TextResource textResource3 = this.positiveButton;
                TextResource textResource4 = this.negativeButton;
                String str = this.content;
                List<C22900i> list = this.options;
                Integer num = this.selectedOptionIndex;
                StringBuilder sbM91844n = AbstractC30007c.m91844n("CampaignScreeningRadioViewState(questionId=", i13, ", toolbarTitle=", textResource, ", toolbarSubTitle=");
                AbstractC33745d.m106664w(textResource2, ", isPositiveButtonEnabled=", ", submitting=", sbM91844n, z4);
                sbM91844n.append(c22903l);
                sbM91844n.append(", submitted=");
                sbM91844n.append(c22902k);
                sbM91844n.append(", positiveButton=");
                AbstractC30007c.m91855y(sbM91844n, textResource3, ", negativeButton=", textResource4, ", content=");
                AbstractC36095b.m114694v(str, ", options=", ", selectedOptionIndex=", sbM91844n, list);
                return AbstractC11478a.m30859k(sbM91844n, num, ")");
            }

            public /* synthetic */ b(int i13, TextResource textResource, TextResource textResource2, boolean z4, C22903l c22903l, C22902k c22902k, TextResource textResource3, TextResource textResource4, String str, List list, Integer num, int i14, DefaultConstructorMarker defaultConstructorMarker) {
                this(i13, textResource, textResource2, (i14 & 8) != 0 ? true : z4, (i14 & 16) != 0 ? null : c22903l, (i14 & 32) != 0 ? null : c22902k, textResource3, textResource4, str, list, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : num);
            }
        }
    }

    /* JADX INFO: renamed from: ky2.g$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lky2/g$b;", "Lky2/g;", "", "campaignId", "sessionId", "<init>", "(ILjava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements InterfaceC22898g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int campaignId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Integer sessionId;

        public b(int i13, Integer num) {
            this.campaignId = i13;
            this.sessionId = num;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCampaignId() {
            return this.campaignId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getSessionId() {
            return this.sessionId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.campaignId == bVar.campaignId && AbstractC22676k.m65745e(this.sessionId, bVar.sessionId);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.campaignId) * 31;
            Integer num = this.sessionId;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "ErrorLoading(campaignId=" + this.campaignId + ", sessionId=" + this.sessionId + ")";
        }
    }

    /* JADX INFO: renamed from: ky2.g$c */
    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJP\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b!\u0010&¨\u0006'"}, m65681d2 = {"Lky2/g$c;", "Lky2/g;", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "positiveButton", "negativeButton", "Lky2/l;", "submitting", "Lky2/k;", "submitted", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lky2/l;Lky2/k;)V", "a", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lky2/l;Lky2/k;)Lky2/g$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/design/util/TextResource;", "b", "g", "c", "d", "e", "Lky2/l;", "f", "()Lky2/l;", "Lky2/k;", "()Lky2/k;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements InterfaceC22898g {

        /* JADX INFO: renamed from: g */
        public static final int f90422g;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final TextResource subtitle;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource positiveButton;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource negativeButton;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C22903l submitting;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C22902k submitted;

        static {
            int i13 = C9598e.f28134d;
            int i14 = TextResource.$stable;
            f90422g = i13 | i14 | i14 | i14 | i14 | i14 | i14 | i14 | i14;
        }

        public c(TextResource title, TextResource subtitle, TextResource positiveButton, TextResource negativeButton, C22903l c22903l, C22902k c22902k) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            AbstractC22676k.m65750j(positiveButton, "positiveButton");
            AbstractC22676k.m65750j(negativeButton, "negativeButton");
            this.title = title;
            this.subtitle = subtitle;
            this.positiveButton = positiveButton;
            this.negativeButton = negativeButton;
            this.submitting = c22903l;
            this.submitted = c22902k;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ c m66603b(c cVar, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, C22903l c22903l, C22902k c22902k, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                textResource = cVar.title;
            }
            if ((i13 & 2) != 0) {
                textResource2 = cVar.subtitle;
            }
            if ((i13 & 4) != 0) {
                textResource3 = cVar.positiveButton;
            }
            if ((i13 & 8) != 0) {
                textResource4 = cVar.negativeButton;
            }
            if ((i13 & 16) != 0) {
                c22903l = cVar.submitting;
            }
            if ((i13 & 32) != 0) {
                c22902k = cVar.submitted;
            }
            C22903l c22903l2 = c22903l;
            C22902k c22902k2 = c22902k;
            return cVar.m66604a(textResource, textResource2, textResource3, textResource4, c22903l2, c22902k2);
        }

        /* JADX INFO: renamed from: a */
        public final c m66604a(TextResource title, TextResource subtitle, TextResource positiveButton, TextResource negativeButton, C22903l submitting, C22902k submitted) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            AbstractC22676k.m65750j(positiveButton, "positiveButton");
            AbstractC22676k.m65750j(negativeButton, "negativeButton");
            return new c(title, subtitle, positiveButton, negativeButton, submitting, submitted);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getNegativeButton() {
            return this.negativeButton;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextResource getPositiveButton() {
            return this.positiveButton;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final C22902k getSubmitted() {
            return this.submitted;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.title, cVar.title) && AbstractC22676k.m65745e(this.subtitle, cVar.subtitle) && AbstractC22676k.m65745e(this.positiveButton, cVar.positiveButton) && AbstractC22676k.m65745e(this.negativeButton, cVar.negativeButton) && AbstractC22676k.m65745e(this.submitting, cVar.submitting) && AbstractC22676k.m65745e(this.submitted, cVar.submitted);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final C22903l getSubmitting() {
            return this.submitting;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final TextResource getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.subtitle, 31), this.positiveButton, 31), this.negativeButton, 31);
            C22903l c22903l = this.submitting;
            int iHashCode = (iM95625a + (c22903l == null ? 0 : c22903l.hashCode())) * 31;
            C22902k c22902k = this.submitted;
            return iHashCode + (c22902k != null ? c22902k.hashCode() : 0);
        }

        public String toString() {
            TextResource textResource = this.title;
            TextResource textResource2 = this.subtitle;
            TextResource textResource3 = this.positiveButton;
            TextResource textResource4 = this.negativeButton;
            C22903l c22903l = this.submitting;
            C22902k c22902k = this.submitted;
            StringBuilder sbM106658q = AbstractC33745d.m106658q("ErrorSubmitting(title=", textResource, ", subtitle=", textResource2, ", positiveButton=");
            AbstractC30007c.m91855y(sbM106658q, textResource3, ", negativeButton=", textResource4, ", submitting=");
            sbM106658q.append(c22903l);
            sbM106658q.append(", submitted=");
            sbM106658q.append(c22902k);
            sbM106658q.append(")");
            return sbM106658q.toString();
        }

        public /* synthetic */ c(TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, C22903l c22903l, C22902k c22902k, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(textResource, textResource2, textResource3, textResource4, (i13 & 16) != 0 ? null : c22903l, (i13 & 32) != 0 ? null : c22902k);
        }
    }

    /* JADX INFO: renamed from: ky2.g$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lky2/g$d;", "Lky2/g;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC22898g {

        /* JADX INFO: renamed from: a */
        public static final d f90429a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: ky2.g$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lky2/g$e;", "Lky2/g;", "", "campaignId", "sessionId", "<init>", "(ILjava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e implements InterfaceC22898g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int campaignId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Integer sessionId;

        public e(int i13, Integer num) {
            this.campaignId = i13;
            this.sessionId = num;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCampaignId() {
            return this.campaignId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getSessionId() {
            return this.sessionId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return this.campaignId == eVar.campaignId && AbstractC22676k.m65745e(this.sessionId, eVar.sessionId);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.campaignId) * 31;
            Integer num = this.sessionId;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "SkipScreening(campaignId=" + this.campaignId + ", sessionId=" + this.sessionId + ")";
        }
    }

    /* JADX INFO: renamed from: ky2.g$f */
    @Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b\u001f\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001a\u0010(R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b&\u0010+¨\u0006,"}, m65681d2 = {"Lky2/g$f;", "Lky2/g;", "", "campaignId", "icon", "Ly81/f;", "iconColor", "", "content", "Lcom/whoop/design/util/TextResource;", "cta", "Lkd1/o;", "backgroundImage", "Lcom/whoop/whooplabs/feature/navigation/c;", NotificationCompat.CATEGORY_NAVIGATION, "<init>", "(IILy81/f;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/whooplabs/feature/navigation/c;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getCampaignId", "b", "d", "c", "Ly81/f;", "e", "()Ly81/f;", "Ljava/lang/String;", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "f", "Lkd1/o;", "()Lkd1/o;", "g", "Lcom/whoop/whooplabs/feature/navigation/c;", "()Lcom/whoop/whooplabs/feature/navigation/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f implements InterfaceC22898g {

        /* JADX INFO: renamed from: h */
        public static final int f90432h = AbstractC22403o.f87638a | TextResource.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final int campaignId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int icon;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final EnumC39333f iconColor;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String content;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource cta;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final AbstractC22403o backgroundImage;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final AbstractC10840c navigation;

        public f(int i13, int i14, EnumC39333f iconColor, String content, TextResource cta, AbstractC22403o backgroundImage, AbstractC10840c navigation) {
            AbstractC22676k.m65750j(iconColor, "iconColor");
            AbstractC22676k.m65750j(content, "content");
            AbstractC22676k.m65750j(cta, "cta");
            AbstractC22676k.m65750j(backgroundImage, "backgroundImage");
            AbstractC22676k.m65750j(navigation, "navigation");
            this.campaignId = i13;
            this.icon = i14;
            this.iconColor = iconColor;
            this.content = content;
            this.cta = cta;
            this.backgroundImage = backgroundImage;
            this.navigation = navigation;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AbstractC22403o getBackgroundImage() {
            return this.backgroundImage;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextResource getCta() {
            return this.cta;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final EnumC39333f getIconColor() {
            return this.iconColor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            return this.campaignId == fVar.campaignId && this.icon == fVar.icon && this.iconColor == fVar.iconColor && AbstractC22676k.m65745e(this.content, fVar.content) && AbstractC22676k.m65745e(this.cta, fVar.cta) && AbstractC22676k.m65745e(this.backgroundImage, fVar.backgroundImage) && AbstractC22676k.m65745e(this.navigation, fVar.navigation);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final AbstractC10840c getNavigation() {
            return this.navigation;
        }

        public int hashCode() {
            return this.navigation.hashCode() + AbstractC30007c.m91833c(this.backgroundImage, AbstractC31061c.m95625a(AbstractC11266d.m30450d(AbstractC21702c.m61132c(this.iconColor, AbstractC11266d.m30448b(this.icon, Integer.hashCode(this.campaignId) * 31, 31), 31), 31, this.content), this.cta, 31), 31);
        }

        public String toString() {
            int i13 = this.campaignId;
            int i14 = this.icon;
            EnumC39333f enumC39333f = this.iconColor;
            String str = this.content;
            TextResource textResource = this.cta;
            AbstractC22403o abstractC22403o = this.backgroundImage;
            AbstractC10840c abstractC10840c = this.navigation;
            StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "Submitted(campaignId=", ", icon=", ", iconColor=");
            sbM30465s.append(enumC39333f);
            sbM30465s.append(", content=");
            sbM30465s.append(str);
            sbM30465s.append(", cta=");
            sbM30465s.append(textResource);
            sbM30465s.append(", backgroundImage=");
            sbM30465s.append(abstractC22403o);
            sbM30465s.append(", navigation=");
            sbM30465s.append(abstractC10840c);
            sbM30465s.append(")");
            return sbM30465s.toString();
        }
    }
}
