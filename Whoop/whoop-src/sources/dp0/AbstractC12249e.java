package dp0;

import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: dp0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Ldp0/e;", "", "<init>", "()V", "f", "g", "b", "a", "e", "c", "d", "Ldp0/e$a;", "Ldp0/e$b;", "Ldp0/e$c;", "Ldp0/e$d;", "Ldp0/e$e;", "Ldp0/e$f;", "Ldp0/e$g;", "coach-everywhere-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12249e {

    /* JADX INFO: renamed from: dp0.e$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Ldp0/e$a;", "Ldp0/e;", "", "screenName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "coach-everywhere-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC12249e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String screenName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String screenName) {
            super(null);
            AbstractC22676k.m65750j(screenName, "screenName");
            this.screenName = screenName;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getScreenName() {
            return this.screenName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.screenName, ((a) other).screenName);
        }

        public int hashCode() {
            return this.screenName.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ClickGetStarted(screenName=", this.screenName, ")");
        }
    }

    /* JADX INFO: renamed from: dp0.e$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Ldp0/e$b;", "Ldp0/e;", "", "screenName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "coach-everywhere-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC12249e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String screenName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String screenName) {
            super(null);
            AbstractC22676k.m65750j(screenName, "screenName");
            this.screenName = screenName;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getScreenName() {
            return this.screenName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.screenName, ((b) other).screenName);
        }

        public int hashCode() {
            return this.screenName.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ClickNext(screenName=", this.screenName, ")");
        }
    }

    /* JADX INFO: renamed from: dp0.e$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Ldp0/e$c;", "Ldp0/e;", "", "screenIdentifier", "", "wasTextCutoff", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "coach-everywhere-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC12249e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String screenIdentifier;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean wasTextCutoff;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String screenIdentifier, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(screenIdentifier, "screenIdentifier");
            this.screenIdentifier = screenIdentifier;
            this.wasTextCutoff = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getScreenIdentifier() {
            return this.screenIdentifier;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getWasTextCutoff() {
            return this.wasTextCutoff;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.screenIdentifier, cVar.screenIdentifier) && this.wasTextCutoff == cVar.wasTextCutoff;
        }

        public int hashCode() {
            return Boolean.hashCode(this.wasTextCutoff) + (this.screenIdentifier.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79503g("DrawerCollapsed(screenIdentifier=", this.screenIdentifier, ", wasTextCutoff=", ")", this.wasTextCutoff);
        }
    }

    /* JADX INFO: renamed from: dp0.e$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\t¨\u0006\u0016"}, m65681d2 = {"Ldp0/e$d;", "Ldp0/e;", "", "screenIdentifier", "drawerState", "dismissType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "coach-everywhere-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC12249e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String screenIdentifier;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String drawerState;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String dismissType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String screenIdentifier, String drawerState, String dismissType) {
            super(null);
            AbstractC22676k.m65750j(screenIdentifier, "screenIdentifier");
            AbstractC22676k.m65750j(drawerState, "drawerState");
            AbstractC22676k.m65750j(dismissType, "dismissType");
            this.screenIdentifier = screenIdentifier;
            this.drawerState = drawerState;
            this.dismissType = dismissType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDismissType() {
            return this.dismissType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDrawerState() {
            return this.drawerState;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getScreenIdentifier() {
            return this.screenIdentifier;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.screenIdentifier, dVar.screenIdentifier) && AbstractC22676k.m65745e(this.drawerState, dVar.drawerState) && AbstractC22676k.m65745e(this.dismissType, dVar.dismissType);
        }

        public int hashCode() {
            return this.dismissType.hashCode() + AbstractC11266d.m30450d(this.screenIdentifier.hashCode() * 31, 31, this.drawerState);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.dismissType, ")", AbstractC11895b.m32001t("DrawerDismissed(screenIdentifier=", this.screenIdentifier, ", drawerState=", this.drawerState, ", dismissType="));
        }
    }

    /* JADX INFO: renamed from: dp0.e$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Ldp0/e$e;", "Ldp0/e;", "", "screenIdentifier", "", "wasTextCutoff", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "coach-everywhere-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC12249e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String screenIdentifier;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean wasTextCutoff;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String screenIdentifier, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(screenIdentifier, "screenIdentifier");
            this.screenIdentifier = screenIdentifier;
            this.wasTextCutoff = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getScreenIdentifier() {
            return this.screenIdentifier;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getWasTextCutoff() {
            return this.wasTextCutoff;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.screenIdentifier, eVar.screenIdentifier) && this.wasTextCutoff == eVar.wasTextCutoff;
        }

        public int hashCode() {
            return Boolean.hashCode(this.wasTextCutoff) + (this.screenIdentifier.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79503g("DrawerExpanded(screenIdentifier=", this.screenIdentifier, ", wasTextCutoff=", ")", this.wasTextCutoff);
        }
    }

    /* JADX INFO: renamed from: dp0.e$f */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Ldp0/e$f;", "Ldp0/e;", "", "source", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "coach-everywhere-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC12249e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String source;

        public f(String str) {
            super(null);
            this.source = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && AbstractC22676k.m65745e(this.source, ((f) other).source);
        }

        public int hashCode() {
            String str = this.source;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("EnterOnboarding(source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: dp0.e$g */
    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Ldp0/e$g;", "Ldp0/e;", "", "screenName", "", "stepNumber", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "coach-everywhere-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC12249e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String screenName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int stepNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String screenName, int i13) {
            super(null);
            AbstractC22676k.m65750j(screenName, "screenName");
            this.screenName = screenName;
            this.stepNumber = i13;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getScreenName() {
            return this.screenName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getStepNumber() {
            return this.stepNumber;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return AbstractC22676k.m65745e(this.screenName, gVar.screenName) && this.stepNumber == gVar.stepNumber;
        }

        public int hashCode() {
            return Integer.hashCode(this.stepNumber) + (this.screenName.hashCode() * 31);
        }

        public String toString() {
            return AbstractC11895b.m31993l(this.stepNumber, "ViewStep(screenName=", this.screenName, ", stepNumber=", ")");
        }
    }

    public /* synthetic */ AbstractC12249e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC12249e() {
    }
}
