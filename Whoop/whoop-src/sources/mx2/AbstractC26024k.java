package mx2;

import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: mx2.k */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lmx2/k;", "", "<init>", "()V", "d", "a", "e", "b", "c", "Lmx2/k$a;", "Lmx2/k$b;", "Lmx2/k$c;", "Lmx2/k$d;", "Lmx2/k$e;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26024k {

    /* JADX INFO: renamed from: mx2.k$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\bR\u0011\u0010\u0017\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\bR\u0011\u0010\u0019\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\bR\u0011\u0010\u001b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\b¨\u0006\u001c"}, m65681d2 = {"Lmx2/k$a;", "Lmx2/k;", "Lmx2/b;", "action", "<init>", "(Lmx2/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx2/b;", "()Lmx2/b;", "e", "title", "b", "body", "d", "positiveCta", "c", "negativeCta", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC26024k {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC26015b action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC26015b action) {
            super(null);
            AbstractC22676k.m65750j(action, "action");
            this.action = action;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC26015b getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b */
        public final String m77408b() {
            return this.action.getModalConfig().getBody();
        }

        /* JADX INFO: renamed from: c */
        public final String m77409c() {
            return this.action.getModalConfig().getNegativeCta();
        }

        /* JADX INFO: renamed from: d */
        public final String m77410d() {
            return this.action.getModalConfig().getPositiveCta();
        }

        /* JADX INFO: renamed from: e */
        public final String m77411e() {
            return this.action.getModalConfig().getTitle();
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.action, ((a) other).action);
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        public String toString() {
            return "AwaitingUserConfirmation(action=" + this.action + ")";
        }
    }

    /* JADX INFO: renamed from: mx2.k$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lmx2/k$d;", "Lmx2/k;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC26024k {

        /* JADX INFO: renamed from: a */
        public static final d f102940a = new d();

        private d() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: mx2.k$e */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\bR\u0011\u0010\u0017\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\bR\u0011\u0010\u0019\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\bR\u0011\u0010\u001b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\b¨\u0006\u001c"}, m65681d2 = {"Lmx2/k$e;", "Lmx2/k;", "Lmx2/b;", "action", "<init>", "(Lmx2/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx2/b;", "()Lmx2/b;", "e", "title", "b", "body", "d", "positiveCta", "c", "negativeCta", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC26024k {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC26015b action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC26015b action) {
            super(null);
            AbstractC22676k.m65750j(action, "action");
            this.action = action;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InterfaceC26015b getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b */
        public final String m77425b() {
            return this.action.getErrorConfig().getBody();
        }

        /* JADX INFO: renamed from: c */
        public final String m77426c() {
            return this.action.getErrorConfig().getNegativeCta();
        }

        /* JADX INFO: renamed from: d */
        public final String m77427d() {
            return this.action.getErrorConfig().getPositiveCta();
        }

        /* JADX INFO: renamed from: e */
        public final String m77428e() {
            return this.action.getErrorConfig().getTitle();
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && AbstractC22676k.m65745e(this.action, ((e) other).action);
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        public String toString() {
            return "ShowingError(action=" + this.action + ")";
        }
    }

    public /* synthetic */ AbstractC26024k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC26024k() {
    }

    /* JADX INFO: renamed from: mx2.k$b */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\r¨\u0006\u001f"}, m65681d2 = {"Lmx2/k$b;", "Lmx2/k;", "Lmx2/b;", "originalAction", "Lmx2/i;", "feedbackConfig", "", "selectedReason", "<init>", "(Lmx2/b;Lmx2/i;Ljava/lang/String;)V", "a", "(Lmx2/b;Lmx2/i;Ljava/lang/String;)Lmx2/k$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmx2/b;", "d", "()Lmx2/b;", "b", "Lmx2/i;", "c", "()Lmx2/i;", "Ljava/lang/String;", "e", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC26024k {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC26015b originalAction;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C26022i feedbackConfig;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String selectedReason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC26015b originalAction, C26022i feedbackConfig, String str) {
            super(null);
            AbstractC22676k.m65750j(originalAction, "originalAction");
            AbstractC22676k.m65750j(feedbackConfig, "feedbackConfig");
            this.originalAction = originalAction;
            this.feedbackConfig = feedbackConfig;
            this.selectedReason = str;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ b m77412b(b bVar, InterfaceC26015b interfaceC26015b, C26022i c26022i, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                interfaceC26015b = bVar.originalAction;
            }
            if ((i13 & 2) != 0) {
                c26022i = bVar.feedbackConfig;
            }
            if ((i13 & 4) != 0) {
                str = bVar.selectedReason;
            }
            return bVar.m77413a(interfaceC26015b, c26022i, str);
        }

        /* JADX INFO: renamed from: a */
        public final b m77413a(InterfaceC26015b originalAction, C26022i feedbackConfig, String selectedReason) {
            AbstractC22676k.m65750j(originalAction, "originalAction");
            AbstractC22676k.m65750j(feedbackConfig, "feedbackConfig");
            return new b(originalAction, feedbackConfig, selectedReason);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C26022i getFeedbackConfig() {
            return this.feedbackConfig;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final InterfaceC26015b getOriginalAction() {
            return this.originalAction;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getSelectedReason() {
            return this.selectedReason;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.originalAction, bVar.originalAction) && AbstractC22676k.m65745e(this.feedbackConfig, bVar.feedbackConfig) && AbstractC22676k.m65745e(this.selectedReason, bVar.selectedReason);
        }

        public int hashCode() {
            int iHashCode = (this.feedbackConfig.hashCode() + (this.originalAction.hashCode() * 31)) * 31;
            String str = this.selectedReason;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            InterfaceC26015b interfaceC26015b = this.originalAction;
            C26022i c26022i = this.feedbackConfig;
            String str = this.selectedReason;
            StringBuilder sb4 = new StringBuilder("CollectingCancelReason(originalAction=");
            sb4.append(interfaceC26015b);
            sb4.append(", feedbackConfig=");
            sb4.append(c26022i);
            sb4.append(", selectedReason=");
            return AbstractC25012a.m73376i(str, ")", sb4);
        }

        public /* synthetic */ b(InterfaceC26015b interfaceC26015b, C26022i c26022i, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC26015b, c26022i, (i13 & 4) != 0 ? null : str);
        }
    }

    /* JADX INFO: renamed from: mx2.k$c */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJB\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b\"\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b\u001f\u0010\u000f¨\u0006#"}, m65681d2 = {"Lmx2/k$c;", "Lmx2/k;", "Lmx2/b;", "originalAction", "Lmx2/i;", "feedbackConfig", "", "selectedReasonDisplayText", "reasonKey", "additionalText", "<init>", "(Lmx2/b;Lmx2/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "(Lmx2/b;Lmx2/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lmx2/k$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmx2/b;", "e", "()Lmx2/b;", "b", "Lmx2/i;", "d", "()Lmx2/i;", "c", "Ljava/lang/String;", "g", "f", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC26024k {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC26015b originalAction;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C26022i feedbackConfig;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String selectedReasonDisplayText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String reasonKey;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String additionalText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC26015b originalAction, C26022i feedbackConfig, String selectedReasonDisplayText, String reasonKey, String additionalText) {
            super(null);
            AbstractC22676k.m65750j(originalAction, "originalAction");
            AbstractC22676k.m65750j(feedbackConfig, "feedbackConfig");
            AbstractC22676k.m65750j(selectedReasonDisplayText, "selectedReasonDisplayText");
            AbstractC22676k.m65750j(reasonKey, "reasonKey");
            AbstractC22676k.m65750j(additionalText, "additionalText");
            this.originalAction = originalAction;
            this.feedbackConfig = feedbackConfig;
            this.selectedReasonDisplayText = selectedReasonDisplayText;
            this.reasonKey = reasonKey;
            this.additionalText = additionalText;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ c m77417b(c cVar, InterfaceC26015b interfaceC26015b, C26022i c26022i, String str, String str2, String str3, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                interfaceC26015b = cVar.originalAction;
            }
            if ((i13 & 2) != 0) {
                c26022i = cVar.feedbackConfig;
            }
            if ((i13 & 4) != 0) {
                str = cVar.selectedReasonDisplayText;
            }
            if ((i13 & 8) != 0) {
                str2 = cVar.reasonKey;
            }
            if ((i13 & 16) != 0) {
                str3 = cVar.additionalText;
            }
            String str4 = str3;
            String str5 = str;
            return cVar.m77418a(interfaceC26015b, c26022i, str5, str2, str4);
        }

        /* JADX INFO: renamed from: a */
        public final c m77418a(InterfaceC26015b originalAction, C26022i feedbackConfig, String selectedReasonDisplayText, String reasonKey, String additionalText) {
            AbstractC22676k.m65750j(originalAction, "originalAction");
            AbstractC22676k.m65750j(feedbackConfig, "feedbackConfig");
            AbstractC22676k.m65750j(selectedReasonDisplayText, "selectedReasonDisplayText");
            AbstractC22676k.m65750j(reasonKey, "reasonKey");
            AbstractC22676k.m65750j(additionalText, "additionalText");
            return new c(originalAction, feedbackConfig, selectedReasonDisplayText, reasonKey, additionalText);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getAdditionalText() {
            return this.additionalText;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C26022i getFeedbackConfig() {
            return this.feedbackConfig;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final InterfaceC26015b getOriginalAction() {
            return this.originalAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.originalAction, cVar.originalAction) && AbstractC22676k.m65745e(this.feedbackConfig, cVar.feedbackConfig) && AbstractC22676k.m65745e(this.selectedReasonDisplayText, cVar.selectedReasonDisplayText) && AbstractC22676k.m65745e(this.reasonKey, cVar.reasonKey) && AbstractC22676k.m65745e(this.additionalText, cVar.additionalText);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getReasonKey() {
            return this.reasonKey;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getSelectedReasonDisplayText() {
            return this.selectedReasonDisplayText;
        }

        public int hashCode() {
            return this.additionalText.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.feedbackConfig.hashCode() + (this.originalAction.hashCode() * 31)) * 31, 31, this.selectedReasonDisplayText), 31, this.reasonKey);
        }

        public String toString() {
            InterfaceC26015b interfaceC26015b = this.originalAction;
            C26022i c26022i = this.feedbackConfig;
            String str = this.selectedReasonDisplayText;
            String str2 = this.reasonKey;
            String str3 = this.additionalText;
            StringBuilder sb4 = new StringBuilder("CollectingCancelReasonWithText(originalAction=");
            sb4.append(interfaceC26015b);
            sb4.append(", feedbackConfig=");
            sb4.append(c26022i);
            sb4.append(", selectedReasonDisplayText=");
            AbstractC11266d.m30444B(sb4, str, ", reasonKey=", str2, ", additionalText=");
            return AbstractC25012a.m73376i(str3, ")", sb4);
        }

        public /* synthetic */ c(InterfaceC26015b interfaceC26015b, C26022i c26022i, String str, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC26015b, c26022i, str, str2, (i13 & 16) != 0 ? "" : str3);
        }
    }
}
