package yl2;

import androidx.core.app.NotificationCompat;
import c93.InterfaceC4339a;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.IntegrationsScreenModel;
import com.whoop.navigation.NavigationScreenModel;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import l83.C23454a0;
import ny0.C27256h;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import s01.C32048d;
import te0.AbstractC33745d;
import wr0.C37550r;
import y71.C39282o;
import yb3.AbstractC39414r;
import yc2.C39434a;

/* JADX INFO: renamed from: yl2.k */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 52\u00020\u0001:\u00020.B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u001f\u0010#\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00192\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u001b\u0010&\u001a\u00020%*\u00020%2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103¨\u00066"}, m65681d2 = {"Lyl2/k;", "", "Lj02/o0;", "navigator", "Leb/a0;", "navController", "Lkotlin/Function0;", "Ll83/a0;", "onWhoopCoach", "onFragmentBack", "<init>", "(Lj02/o0;Leb/a0;Lc93/a;Lc93/a;)V", "Lm91/u;", "itemViewState", "Lyl2/k$b;", "u", "(Lm91/u;)Lyl2/k$b;", "o", "(Lm91/u;)V", "Lyl2/g$b;", "scope", "q", "(Lyl2/g$b;)V", "Lcom/whoop/navigation/e;", "navAction", "", "entryPoint", "p", "(Lcom/whoop/navigation/e;Ljava/lang/String;)V", "m", "()V", "n", "exerciseId", "", "isExerciseDetailsV2ExperimentEnabled", "l", "(Ljava/lang/String;Z)V", "Lcom/whoop/navigation/NavigationScreenModel;", "F", "(Lcom/whoop/navigation/NavigationScreenModel;Ljava/lang/String;)Lcom/whoop/navigation/NavigationScreenModel;", "Lyl2/g;", NotificationCompat.CATEGORY_EVENT, "r", "(Lyl2/g;)Lyl2/k$b;", "E", "(Lyl2/g;)V", "a", "Lj02/o0;", "b", "Leb/a0;", "c", "Lc93/a;", "d", "e", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39644k {

    /* JADX INFO: renamed from: f */
    public static final int f170556f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC4339a onWhoopCoach;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC4339a onFragmentBack;

    /* JADX INFO: renamed from: yl2.k$b */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\n\u0007\u000b\fB\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, m65681d2 = {"Lyl2/k$b;", "", "Lkotlin/Function0;", "Ll83/a0;", "action", "<init>", "(Lc93/a;)V", "a", "Lc93/a;", "()Lc93/a;", "d", "b", "c", "Lyl2/k$b$a;", "Lyl2/k$b$b;", "Lyl2/k$b$c;", "Lyl2/k$b$d;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC4339a action;

        /* JADX INFO: renamed from: yl2.k$b$a */
        @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lyl2/k$b$a;", "Lyl2/k$b;", "Lkotlin/Function0;", "Ll83/a0;", "action", "<init>", "(Lc93/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lc93/a;", "a", "()Lc93/a;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final InterfaceC4339a action;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC4339a action) {
                super(action, null);
                AbstractC22676k.m65750j(action, "action");
                this.action = action;
            }

            @Override // yl2.C39644k.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public InterfaceC4339a getAction() {
                return this.action;
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
                return AbstractC33745d.m106653l("GoToMenuItemDestination(action=", ")", this.action);
            }
        }

        /* JADX INFO: renamed from: yl2.k$b$b, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lyl2/k$b$b;", "Lyl2/k$b;", "Lkotlin/Function0;", "Ll83/a0;", "action", "<init>", "(Lc93/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lc93/a;", "a", "()Lc93/a;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C42703b extends b {

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final InterfaceC4339a action;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42703b(InterfaceC4339a action) {
                super(action, null);
                AbstractC22676k.m65750j(action, "action");
                this.action = action;
            }

            @Override // yl2.C39644k.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public InterfaceC4339a getAction() {
                return this.action;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof C42703b) && AbstractC22676k.m65745e(this.action, ((C42703b) other).action);
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            public String toString() {
                return AbstractC33745d.m106653l("GoToRecordedData(action=", ")", this.action);
            }
        }

        /* JADX INFO: renamed from: yl2.k$b$c */
        @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lyl2/k$b$c;", "Lyl2/k$b;", "Lkotlin/Function0;", "Ll83/a0;", "action", "<init>", "(Lc93/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lc93/a;", "a", "()Lc93/a;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class c extends b {

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final InterfaceC4339a action;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(InterfaceC4339a action) {
                super(action, null);
                AbstractC22676k.m65750j(action, "action");
                this.action = action;
            }

            @Override // yl2.C39644k.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public InterfaceC4339a getAction() {
                return this.action;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof c) && AbstractC22676k.m65745e(this.action, ((c) other).action);
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            public String toString() {
                return AbstractC33745d.m106653l("GoToWhoopCoach(action=", ")", this.action);
            }
        }

        /* JADX INFO: renamed from: yl2.k$b$d */
        @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lyl2/k$b$d;", "Lyl2/k$b;", "Lkotlin/Function0;", "Ll83/a0;", "action", "<init>", "(Lc93/a;)V", "b", "Lc93/a;", "a", "()Lc93/a;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class d extends b {

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final InterfaceC4339a action;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(InterfaceC4339a action) {
                super(action, null);
                AbstractC22676k.m65750j(action, "action");
                this.action = action;
            }

            @Override // yl2.C39644k.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public InterfaceC4339a getAction() {
                return this.action;
            }
        }

        public /* synthetic */ b(InterfaceC4339a interfaceC4339a, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC4339a);
        }

        /* JADX INFO: renamed from: a */
        public abstract InterfaceC4339a getAction();

        private b(InterfaceC4339a interfaceC4339a) {
            this.action = interfaceC4339a;
        }
    }

    /* JADX INFO: renamed from: yl2.k$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f170566a;

        static {
            int[] iArr = new int[AbstractC39640g.b.values().length];
            try {
                iArr[AbstractC39640g.b.Fragment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC39640g.b.Compose.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f170566a = iArr;
        }
    }

    public C39644k(InterfaceC21159o0 navigator, AbstractC12939a0 navController, InterfaceC4339a onWhoopCoach, InterfaceC4339a onFragmentBack) {
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(onWhoopCoach, "onWhoopCoach");
        AbstractC22676k.m65750j(onFragmentBack, "onFragmentBack");
        this.navigator = navigator;
        this.navController = navController;
        this.onWhoopCoach = onWhoopCoach;
        this.onFragmentBack = onFragmentBack;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m126728A() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m126729B(C39644k c39644k, InterfaceC25312u interfaceC25312u) {
        c39644k.m126748p(((C27256h) interfaceC25312u).getDestination(), "TRENDS");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m126730C() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m126731D() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F */
    private final NavigationScreenModel m126732F(NavigationScreenModel navigationScreenModel, String str) {
        return navigationScreenModel instanceof IntegrationsScreenModel ? IntegrationsScreenModel.copy$default((IntegrationsScreenModel) navigationScreenModel, null, str, null, 5, null) : navigationScreenModel;
    }

    /* JADX INFO: renamed from: l */
    private final void m126744l(String exerciseId, boolean isExerciseDetailsV2ExperimentEnabled) {
        if (AbstractC39414r.m125890i0(exerciseId)) {
            return;
        }
        this.navigator.mo59393b(new AbstractC21155m0.e1(exerciseId, false, "TRENDS", null, isExerciseDetailsV2ExperimentEnabled, 8, null));
    }

    /* JADX INFO: renamed from: m */
    private final void m126745m() {
        AbstractC12939a0.m36374y(this.navController, "ALL_DATA", null, 6);
    }

    /* JADX INFO: renamed from: n */
    private final void m126746n() {
        AbstractC12939a0.m36374y(this.navController, "REPORT_DATA", null, 6);
    }

    /* JADX INFO: renamed from: o */
    private final void m126747o(InterfaceC25312u itemViewState) {
        if (itemViewState instanceof C39635b) {
            C39635b c39635b = (C39635b) itemViewState;
            m126744l(c39635b.getExerciseId(), c39635b.getIsExerciseDetailsV2ExperimentEnabled());
            return;
        }
        if (itemViewState instanceof C39645l) {
            m126745m();
            return;
        }
        if (itemViewState instanceof C32048d) {
            C9598e c9598eM99591c = ((C32048d) itemViewState).getDestination();
            if (c9598eM99591c != null) {
                m126748p(c9598eM99591c, "TRENDS");
                return;
            } else {
                this.onWhoopCoach.invoke();
                return;
            }
        }
        if (itemViewState instanceof C39282o) {
            C9598e destination = ((C39282o) itemViewState).getDestination();
            if (AbstractC22676k.m65745e(destination != null ? destination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() : null, AppScreen.C9309f5.f27604w)) {
                m126746n();
                return;
            }
            return;
        }
        if (itemViewState instanceof C27256h) {
            C27256h c27256h = (C27256h) itemViewState;
            if (AbstractC22676k.m65745e(c27256h.getDestination().getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w)) {
                return;
            }
            m126748p(c27256h.getDestination(), "TRENDS");
        }
    }

    /* JADX INFO: renamed from: p */
    private final void m126748p(C9598e navAction, String entryPoint) {
        this.navigator.mo59392a(C9598e.m23127b(navAction, null, m126732F(navAction.getParameters(), entryPoint), null, 5, null));
    }

    /* JADX INFO: renamed from: q */
    private final void m126749q(AbstractC39640g.b scope) {
        int i13 = c.f170566a[scope.ordinal()];
        if (i13 == 1) {
            this.onFragmentBack.invoke();
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.navController.m36410z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m126750s(C39644k c39644k, AbstractC39640g abstractC39640g) {
        c39644k.navigator.mo59392a(((AbstractC39640g.c) abstractC39640g).getNavAction());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m126751t(C39644k c39644k, AbstractC39640g abstractC39640g) {
        c39644k.m126749q(((AbstractC39640g.d) abstractC39640g).getScope());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    private final b m126752u(InterfaceC25312u itemViewState) {
        if (itemViewState instanceof C39635b) {
            return new b.a(new C37550r(25, this, (C39635b) itemViewState));
        }
        if (itemViewState instanceof C39645l) {
            final int i13 = 0;
            return new b.C42703b(new InterfaceC4339a(this) { // from class: yl2.j

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ C39644k f170554x;

                {
                    this.f170554x = this;
                }

                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i13) {
                        case 0:
                            return C39644k.m126754w(this.f170554x);
                        case 1:
                            return C39644k.m126756y(this.f170554x);
                        default:
                            return C39644k.m126757z(this.f170554x);
                    }
                }
            });
        }
        if (itemViewState instanceof C32048d) {
            C9598e c9598eM99591c = ((C32048d) itemViewState).getDestination();
            if (c9598eM99591c != null) {
                return new b.a(new C37550r(26, this, c9598eM99591c));
            }
            final int i14 = 1;
            return new b.c(new InterfaceC4339a(this) { // from class: yl2.j

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ C39644k f170554x;

                {
                    this.f170554x = this;
                }

                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i14) {
                        case 0:
                            return C39644k.m126754w(this.f170554x);
                        case 1:
                            return C39644k.m126756y(this.f170554x);
                        default:
                            return C39644k.m126757z(this.f170554x);
                    }
                }
            });
        }
        if (!(itemViewState instanceof C39282o)) {
            if (!(itemViewState instanceof C27256h)) {
                return new b.a(new C39434a(27));
            }
            C27256h c27256h = (C27256h) itemViewState;
            return !AbstractC22676k.m65745e(c27256h.getDestination().getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w) ? new b.a(new C37550r(27, this, c27256h)) : new b.a(new C39434a(29));
        }
        C9598e destination = ((C39282o) itemViewState).getDestination();
        if (!AbstractC22676k.m65745e(destination != null ? destination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() : null, AppScreen.C9309f5.f27604w)) {
            return new b.a(new C39434a(28));
        }
        final int i15 = 2;
        return new b.C42703b(new InterfaceC4339a(this) { // from class: yl2.j

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C39644k f170554x;

            {
                this.f170554x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return C39644k.m126754w(this.f170554x);
                    case 1:
                        return C39644k.m126756y(this.f170554x);
                    default:
                        return C39644k.m126757z(this.f170554x);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m126753v(C39644k c39644k, InterfaceC25312u interfaceC25312u) {
        C39635b c39635b = (C39635b) interfaceC25312u;
        c39644k.m126744l(c39635b.getExerciseId(), c39635b.getIsExerciseDetailsV2ExperimentEnabled());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m126754w(C39644k c39644k) {
        c39644k.m126745m();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m126755x(C39644k c39644k, C9598e c9598e) {
        c39644k.m126748p(c9598e, "TRENDS");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m126756y(C39644k c39644k) {
        c39644k.onWhoopCoach.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m126757z(C39644k c39644k) {
        c39644k.m126746n();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E */
    public final void m126758E(AbstractC39640g event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC39640g.c) {
            AbstractC39640g.c cVar = (AbstractC39640g.c) event;
            m126748p(cVar.getNavAction(), cVar.getEntryPoint());
        } else if (event instanceof AbstractC39640g.a) {
            m126747o(((AbstractC39640g.a) event).getItemViewState());
        } else {
            if (!(event instanceof AbstractC39640g.d)) {
                throw new NoWhenBranchMatchedException();
            }
            m126749q(((AbstractC39640g.d) event).getScope());
        }
    }

    /* JADX INFO: renamed from: r */
    public final b m126759r(final AbstractC39640g event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC39640g.c) {
            final int i13 = 0;
            return new b.a(new InterfaceC4339a(this) { // from class: yl2.i

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ C39644k f170551x;

                {
                    this.f170551x = this;
                }

                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i13) {
                        case 0:
                            return C39644k.m126750s(this.f170551x, event);
                        default:
                            return C39644k.m126751t(this.f170551x, event);
                    }
                }
            });
        }
        if (event instanceof AbstractC39640g.a) {
            return m126752u(((AbstractC39640g.a) event).getItemViewState());
        }
        if (!(event instanceof AbstractC39640g.d)) {
            throw new NoWhenBranchMatchedException();
        }
        final int i14 = 1;
        return new b.d(new InterfaceC4339a(this) { // from class: yl2.i

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C39644k f170551x;

            {
                this.f170551x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return C39644k.m126750s(this.f170551x, event);
                    default:
                        return C39644k.m126751t(this.f170551x, event);
                }
            }
        });
    }
}
