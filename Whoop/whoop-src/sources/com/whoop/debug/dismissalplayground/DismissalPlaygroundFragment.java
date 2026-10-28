package com.whoop.debug.dismissalplayground;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.navigation.AbstractC9597d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.EnumC21172v;
import j93.InterfaceC21467g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import oe2.C27878c;
import or2.AbstractC28152c1;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p114eb.AbstractC12939a0;
import p114eb.C12977n0;
import p114eb.C12982q;
import p114eb.C12985r0;
import p114eb.C12995w0;
import p114eb.C12997x0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import px0.AbstractC29593c;
import px0.C29591a;
import px0.C29592b;
import px0.C29594d;
import px0.C29595e;
import px0.C29596f;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 02\u00020\u0001:\u000212B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\u0004*\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010*\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u0004*\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u0004*\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u0004*\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020 *\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b!\u0010\"J+\u0010)\u001a\u00020(2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010'\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b)\u0010*R\u001b\u0010/\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00065²\u0006\u0012\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\nX\u008a\u0084\u0002²\u0006\u0012\u00104\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/debug/dismissalplayground/DismissalPlaygroundFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "", "style", "Ll83/a0;", "J", "(Ljava/lang/String;)V", "Lj02/v;", "type", "F", "(Lj02/v;)V", "Leb/a0;", "K", "(Leb/a0;Lj02/v;)Ljava/lang/String;", "", "Leb/q;", "entries", "Lpx0/f;", "U", "(Leb/a0;Ljava/util/List;)Ljava/util/List;", "R", "(Leb/a0;Ljava/util/List;)Ljava/lang/String;", "S", "(Leb/a0;)Ljava/lang/String;", "E", "(Leb/q;)Ljava/lang/String;", "", "I", "(Leb/q;)Z", "Landroid/os/Bundle;", "Lcom/whoop/debug/dismissalplayground/DismissalPlaygroundFragment$b;", "G", "(Landroid/os/Bundle;)Lcom/whoop/debug/dismissalplayground/DismissalPlaygroundFragment$b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "H", "()Lcom/whoop/debug/dismissalplayground/DismissalPlaygroundFragment$b;", "screenArgs", "x", "b", "a", "logLines", "backStack", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DismissalPlaygroundFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: y */
    public static final int f25557y = 8;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h screenArgs = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C29591a(this, 0));

    /* JADX INFO: renamed from: com.whoop.debug.dismissalplayground.DismissalPlaygroundFragment$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000b¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/debug/dismissalplayground/DismissalPlaygroundFragment$a;", "", "<init>", "()V", "", "label", "style", "Landroid/net/Uri;", "a", "(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;", "ARG_LABEL", "Ljava/lang/String;", "ARG_NAVIGATION_STYLE", "DEFAULT_LABEL", "STYLE_PUSH", "STYLE_PRESENT", "STYLE_ROOT", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ Uri m20046b(Companion companion, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = "Screen 1";
            }
            if ((i13 & 2) != 0) {
                str2 = "PUSH";
            }
            return companion.m20047a(str, str2);
        }

        /* JADX INFO: renamed from: a */
        public final Uri m20047a(String label, String style) {
            AbstractC22676k.m65750j(label, "label");
            AbstractC22676k.m65750j(style, "style");
            return Uri.parse("android-app://com.whoop/dismissalPlayground?label=" + AbstractC39421y.m125926K(label, " ", "%20", false) + "&navigationStyle=" + style);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.debug.dismissalplayground.DismissalPlaygroundFragment$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C6686c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f25561a;

        static {
            int[] iArr = new int[EnumC21172v.values().length];
            try {
                iArr[EnumC21172v.DISMISS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC21172v.DISMISS_WITHOUT_ANIMATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC21172v.AUTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC21172v.POP_TO_ROOT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC21172v.POP_CURRENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f25561a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.whoop.debug.dismissalplayground.DismissalPlaygroundFragment$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C6687d extends C22672i implements Function1 {
        public C6687d(Object obj) {
            super(1, 0, DismissalPlaygroundFragment.class, obj, "dismissWith", "dismissWith(Lcom/whoop/navigation/DismissalType;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m20050a(EnumC21172v p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((DismissalPlaygroundFragment) this.receiver).m20028F(p13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m20050a((EnumC21172v) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.debug.dismissalplayground.DismissalPlaygroundFragment$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C6688e extends C22672i implements InterfaceC4339a {
        public C6688e(Object obj) {
            super(0, 0, C29592b.class, obj, "clear", "clear()V");
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134156invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134156invoke() {
            ((C29592b) this.receiver).m90727a();
        }
    }

    /* JADX INFO: renamed from: E */
    private final String m20027E(C12982q c12982q) {
        String string;
        Bundle bundleM36479a = c12982q.m36479a();
        if (bundleM36479a != null && (string = bundleM36479a.getString("label")) != null) {
            return string;
        }
        C12977n0 c12977n0 = c12982q.f44844x;
        CharSequence charSequence = c12977n0.f44825z;
        return charSequence != null ? charSequence.toString() : AbstractC2875y.m8295h(c12977n0.f44819H, "destination ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public final void m20028F(EnumC21172v type) {
        String strM20027E;
        String str;
        AbstractC12939a0 abstractC12939a0M16799z = AbstractC5583n.m16799z(this);
        String strM20033K = m20033K(abstractC12939a0M16799z, type);
        boolean zM23114f = AbstractC9597d.m23114f(abstractC12939a0M16799z, type, null, 2, null);
        C12982q c12982qM36393h = abstractC12939a0M16799z.m36393h();
        if (c12982qM36393h == null || (strM20027E = m20027E(c12982qM36393h)) == null) {
            strM20027E = "nothing";
        }
        C29592b c29592b = C29592b.f120827a;
        if (zM23114f) {
            str = type + " from " + m20030H().getLabel() + " -> landed on " + strM20027E;
        } else {
            str = type + " from " + m20030H().getLabel() + " -> NO-OP (" + strM20033K + ")";
        }
        c29592b.m90730d(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    private final C6685b m20029G(Bundle bundle) {
        if (bundle == null) {
            return new C6685b(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
        String string = bundle.getString("label");
        if (string == null) {
            string = "";
        }
        if (string.length() == 0) {
            string = "Screen 1";
        }
        String string2 = bundle.getString("navigationStyle");
        String str = string2 != null ? string2 : "";
        if (str.length() == 0) {
            str = "PUSH";
        }
        return new C6685b(string, str);
    }

    /* JADX INFO: renamed from: H */
    private final C6685b m20030H() {
        return (C6685b) this.screenArgs.getValue();
    }

    /* JADX INFO: renamed from: I */
    private final boolean m20031I(C12982q c12982q) {
        Bundle bundleM36479a = c12982q.m36479a();
        return AbstractC39421y.m125921F(bundleM36479a != null ? bundleM36479a.getString("navigationStyle") : null, "PRESENT", true);
    }

    /* JADX INFO: renamed from: J */
    private final void m20032J(String style) {
        C29592b c29592b = C29592b.f120827a;
        String strM90729c = c29592b.m90729c();
        C12995w0 c12995w0 = new C12995w0();
        if (AbstractC22676k.m65745e(style, "PRESENT")) {
            AbstractC28152c1.m85186d(c12995w0);
        } else {
            AbstractC28152c1.m85188f(c12995w0);
        }
        C12997x0 c12997x0M36508a = c12995w0.m36508a();
        c29592b.m90730d(style + " " + strM90729c + " on top of " + m20030H().getLabel());
        AbstractC5583n.m16799z(this).m36403r(INSTANCE.m20047a(strM90729c, style), c12997x0M36508a);
    }

    /* JADX INFO: renamed from: K */
    private final String m20033K(AbstractC12939a0 abstractC12939a0, EnumC21172v enumC21172v) {
        C12982q c12982qM36393h = abstractC12939a0.m36393h();
        boolean z4 = false;
        if (c12982qM36393h != null && m20031I(c12982qM36393h)) {
            z4 = true;
        }
        int i13 = C6686c.f25561a[enumC21172v.ordinal()];
        if (i13 == 1 || i13 == 2 || i13 == 3) {
            return AbstractC11266d.m30462p("isInPresentedFlow=", AbstractC9597d.m23117i(abstractC12939a0));
        }
        if (i13 == 4) {
            return AbstractC9597d.m23117i(abstractC12939a0) ? "already at the entry that opened this flow" : AbstractC2875y.m8299l(m20041S(abstractC12939a0), " is not on the back stack");
        }
        if (i13 == 5) {
            return z4 ? "at the flow entry - a pop cannot leave the flow, dismiss it instead" : "nothing below this screen to pop";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m20034L(DismissalPlaygroundFragment dismissalPlaygroundFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C29592b c29592b = C29592b.f120827a;
            InterfaceC28601c1 interfaceC28601c1M87261o = AbstractC28683x.m87261o(c29592b.m90728b(), c28655q, 0);
            AbstractC12939a0 abstractC12939a0M16799z = AbstractC5583n.m16799z(dismissalPlaygroundFragment);
            InterfaceC28601c1 interfaceC28601c1M87261o2 = AbstractC28683x.m87261o(abstractC12939a0M16799z.f44688i, c28655q, 0);
            C29594d c29594d = new C29594d(dismissalPlaygroundFragment.m20030H().getLabel(), dismissalPlaygroundFragment.m20030H().getNavigationStyle(), dismissalPlaygroundFragment.m20043U(abstractC12939a0M16799z, m20036N(interfaceC28601c1M87261o2)), dismissalPlaygroundFragment.m20040R(abstractC12939a0M16799z, m20036N(interfaceC28601c1M87261o2)), m20035M(interfaceC28601c1M87261o));
            boolean zM87157i = c28655q.m87157i(dismissalPlaygroundFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C29591a(dismissalPlaygroundFragment, 1);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(dismissalPlaygroundFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C29591a(dismissalPlaygroundFragment, 2);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
            boolean zM87157i3 = c28655q.m87157i(dismissalPlaygroundFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C6687d(dismissalPlaygroundFragment);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function1 = (Function1) ((InterfaceC21467g) objM87133R3);
            boolean zM87157i4 = c28655q.m87157i(c29592b);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i4 || objM87133R4 == c28676v0) {
                objM87133R4 = new C6688e(c29592b);
                c28655q.m87172p0(objM87133R4);
            }
            InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) ((InterfaceC21467g) objM87133R4);
            boolean zM87157i5 = c28655q.m87157i(dismissalPlaygroundFragment);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i5 || objM87133R5 == c28676v0) {
                objM87133R5 = new C29591a(dismissalPlaygroundFragment, 3);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC29593c.m90754o(c29594d, interfaceC4339a, interfaceC4339a2, function1, interfaceC4339a3, (InterfaceC4339a) objM87133R5, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: M */
    private static final List<String> m20035M(InterfaceC28670t2 interfaceC28670t2) {
        return (List) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: N */
    private static final List<C12982q> m20036N(InterfaceC28670t2 interfaceC28670t2) {
        return (List) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m20037O(DismissalPlaygroundFragment dismissalPlaygroundFragment) {
        dismissalPlaygroundFragment.m20032J("PUSH");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m20038P(DismissalPlaygroundFragment dismissalPlaygroundFragment) {
        dismissalPlaygroundFragment.m20032J("PRESENT");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m20039Q(DismissalPlaygroundFragment dismissalPlaygroundFragment) {
        AbstractC5583n.m16799z(dismissalPlaygroundFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: R */
    private final String m20040R(AbstractC12939a0 abstractC12939a0, List<C12982q> list) {
        String strM20041S = m20041S(abstractC12939a0);
        List<C12982q> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((C12982q) it.next()).f44844x.f44819H == abstractC12939a0.m36396k().f44856M) {
                    return AbstractC11266d.m30461o("POP_TO_ROOT goes to ", strM20041S);
                }
            }
        }
        return AbstractC11895b.m31996o("POP_TO_ROOT targets ", strM20041S, ", which is NOT on the stack - it would do nothing");
    }

    /* JADX INFO: renamed from: S */
    private final String m20041S(AbstractC12939a0 abstractC12939a0) {
        CharSequence charSequence;
        String string;
        int i13 = abstractC12939a0.m36396k().f44856M;
        C12985r0 c12985r0M36396k = abstractC12939a0.m36396k();
        C12977n0 c12977n0M36486r = c12985r0M36396k.m36486r(i13, c12985r0M36396k, null, false);
        return (c12977n0M36486r == null || (charSequence = c12977n0M36486r.f44825z) == null || (string = charSequence.toString()) == null) ? AbstractC2875y.m8295h(i13, "destination ") : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C6685b m20042T(DismissalPlaygroundFragment dismissalPlaygroundFragment) {
        return dismissalPlaygroundFragment.m20029G(dismissalPlaygroundFragment.getArguments());
    }

    /* JADX INFO: renamed from: U */
    private final List<C29596f> m20043U(AbstractC12939a0 abstractC12939a0, List<C12982q> list) {
        int iNextIndex;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!(((C12982q) obj).f44844x instanceof C12985r0)) {
                arrayList.add(obj);
            }
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (m20031I((C12982q) listIterator.previous())) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        ArrayList<C29595e> arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            String str = "PRESENT";
            if (!it.hasNext()) {
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (C29595e c29595e : arrayList2) {
                    if (AbstractC22676k.m65745e(c29595e.getStyle(), "PRESENT") && !arrayList4.isEmpty()) {
                        arrayList3.add(arrayList4);
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(c29595e);
                }
                if (!arrayList4.isEmpty()) {
                    arrayList3.add(arrayList4);
                }
                ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(arrayList3, 10));
                for (Object obj2 : arrayList3) {
                    int i15 = i13 + 1;
                    if (i13 < 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    List list2 = (List) obj2;
                    boolean zM65745e = AbstractC22676k.m65745e(((C29595e) AbstractC25265s.m74096F0(list2)).getStyle(), "PRESENT");
                    arrayList5.add(new C29596f((zM65745e && i13 == AbstractC37056f.m118951C(arrayList3)) ? "presented flow - DISMISS closes this" : zM65745e ? "presented flow" : "app stack", zM65745e, list2));
                    i13 = i15;
                }
                return arrayList5;
            }
            Object next = it.next();
            int i16 = i14 + 1;
            if (i14 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            C12982q c12982q = (C12982q) next;
            String strValueOf = String.valueOf(i14);
            String strM20027E = m20027E(c12982q);
            if (c12982q.f44844x.f44819H == abstractC12939a0.m36396k().f44856M) {
                str = "ROOT";
            } else if (!m20031I(c12982q)) {
                str = "PUSH";
            }
            arrayList2.add(new C29595e(strValueOf, strM20027E, str, i14 == iNextIndex, i14 == AbstractC37056f.m118951C(arrayList)));
            i14 = i16;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C27878c(this, 21), true, 1110857880));
    }

    /* JADX INFO: renamed from: com.whoop.debug.dismissalplayground.DismissalPlaygroundFragment$b */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/debug/dismissalplayground/DismissalPlaygroundFragment$b;", "", "", "label", "navigationStyle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class C6685b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String label;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String navigationStyle;

        public C6685b(String label, String navigationStyle) {
            AbstractC22676k.m65750j(label, "label");
            AbstractC22676k.m65750j(navigationStyle, "navigationStyle");
            this.label = label;
            this.navigationStyle = navigationStyle;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getNavigationStyle() {
            return this.navigationStyle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C6685b)) {
                return false;
            }
            C6685b c6685b = (C6685b) other;
            return AbstractC22676k.m65745e(this.label, c6685b.label) && AbstractC22676k.m65745e(this.navigationStyle, c6685b.navigationStyle);
        }

        public int hashCode() {
            return this.navigationStyle.hashCode() + (this.label.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("PlaygroundArgs(label=", this.label, ", navigationStyle=", this.navigationStyle, ")");
        }

        public /* synthetic */ C6685b(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "Screen 1" : str, (i13 & 2) != 0 ? "PUSH" : str2);
        }
    }
}
