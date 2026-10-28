package p209i3;

import c93.InterfaceC4339a;
import j93.InterfaceC21493z;
import l83.C23454a0;
import p088dc.AbstractC11895b;
import p271k3.EnumC22167a;
import p294l3.C23254g;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22686q;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: i3.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18041w {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InterfaceC21493z[] f70062a;

    static {
        C22686q c22686q = new C22686q(AbstractC18041w.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f70062a = new InterfaceC21493z[]{c22673i0.mutableProperty1(c22686q), AbstractC11895b.m31990i(AbstractC18041w.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1, c22673i0), AbstractC11895b.m31990i(AbstractC18041w.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1, c22673i0), AbstractC11895b.m31990i(AbstractC18041w.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, c22673i0), AbstractC11895b.m31990i(AbstractC18041w.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, c22673i0), AbstractC11895b.m31990i(AbstractC18041w.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, c22673i0), AbstractC11895b.m31990i(AbstractC18041w.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, c22673i0), AbstractC11895b.m31990i(AbstractC18041w.class, "isSensitiveData", "isSensitiveData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, c22673i0), AbstractC11895b.m31990i(AbstractC18041w.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1, c22673i0), AbstractC11895b.m31990i(AbstractC18041w.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", 1, c22673i0), AbstractC11895b.m31990i(AbstractC18041w.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1, c22673i0), AbstractC11895b.m31990i(AbstractC18041w.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1, c22673i0), AbstractC11895b.m31990i(AbstractC18041w.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1, c22673i0), AbstractC11895b.m31990i(AbstractC18041w.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, c22673i0), AbstractC11895b.m31990i(AbstractC18041w.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1, c22673i0), AbstractC11895b.m31990i(AbstractC18041w.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1, c22673i0), AbstractC11895b.m31990i(AbstractC18041w.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, c22673i0), AbstractC11895b.m31990i(AbstractC18041w.class, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1, c22673i0), AbstractC11895b.m31990i(AbstractC18041w.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1, c22673i0), AbstractC11895b.m31990i(AbstractC18041w.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1, c22673i0), AbstractC11895b.m31990i(AbstractC18041w.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, c22673i0), AbstractC11895b.m31990i(AbstractC18041w.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, c22673i0), AbstractC11895b.m31990i(AbstractC18041w.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1, c22673i0), AbstractC11895b.m31990i(AbstractC18041w.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1, c22673i0), AbstractC11895b.m31990i(AbstractC18041w.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1, c22673i0), AbstractC11895b.m31990i(AbstractC18041w.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, c22673i0), AbstractC11895b.m31990i(AbstractC18041w.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, c22673i0), AbstractC11895b.m31990i(AbstractC18041w.class, "shape", "getShape(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/graphics/Shape;", 1, c22673i0), AbstractC11895b.m31990i(AbstractC18041w.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1, c22673i0)};
        C18043y c18043y = AbstractC18039u.f70034a;
        C18043y c18043y2 = AbstractC18029k.f69954a;
    }

    /* JADX INFO: renamed from: a */
    public static final void m51802a(InterfaceC18044z interfaceC18044z) {
        C18043y c18043y = AbstractC18039u.f70034a;
        ((C18030l) interfaceC18044z).m51772e(AbstractC18039u.f70042i, C23454a0.f92919a);
    }

    /* JADX INFO: renamed from: b */
    public static void m51803b(InterfaceC18044z interfaceC18044z, Function1 function1) {
        ((C18030l) interfaceC18044z).m51772e(AbstractC18029k.f69954a, new C18017a(null, function1));
    }

    /* JADX INFO: renamed from: c */
    public static void m51804c(InterfaceC18044z interfaceC18044z, InterfaceC4339a interfaceC4339a) {
        ((C18030l) interfaceC18044z).m51772e(AbstractC18029k.f69955b, new C18017a(null, interfaceC4339a));
    }

    /* JADX INFO: renamed from: d */
    public static final void m51805d(InterfaceC18044z interfaceC18044z) {
        C18043y c18043y = AbstractC18039u.f70045l;
        InterfaceC21493z interfaceC21493z = f70062a[5];
        c18043y.m51817a(interfaceC18044z, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: e */
    public static final void m51806e(String str, InterfaceC18044z interfaceC18044z) {
        C18043y c18043y = AbstractC18039u.f70034a;
        ((C18030l) interfaceC18044z).m51772e(AbstractC18039u.f70034a, AbstractC37056f.m118958J(str));
    }

    /* JADX INFO: renamed from: f */
    public static final void m51807f(InterfaceC18044z interfaceC18044z, int i13) {
        C18043y c18043y = AbstractC18039u.f70043j;
        InterfaceC21493z interfaceC21493z = f70062a[3];
        c18043y.m51817a(interfaceC18044z, new C18024f(i13));
    }

    /* JADX INFO: renamed from: g */
    public static final void m51808g(String str, InterfaceC18044z interfaceC18044z) {
        C18043y c18043y = AbstractC18039u.f70037d;
        InterfaceC21493z interfaceC21493z = f70062a[2];
        c18043y.m51817a(interfaceC18044z, str);
    }

    /* JADX INFO: renamed from: h */
    public static final void m51809h(InterfaceC18044z interfaceC18044z, C18026h c18026h) {
        C18043y c18043y = AbstractC18039u.f70036c;
        InterfaceC21493z interfaceC21493z = f70062a[1];
        c18043y.m51817a(interfaceC18044z, c18026h);
    }

    /* JADX INFO: renamed from: i */
    public static final void m51810i(InterfaceC18044z interfaceC18044z, int i13) {
        C18043y c18043y = AbstractC18039u.f70057x;
        InterfaceC21493z interfaceC21493z = f70062a[13];
        c18043y.m51817a(interfaceC18044z, new C18027i(i13));
    }

    /* JADX INFO: renamed from: j */
    public static final void m51811j(boolean z4, InterfaceC18044z interfaceC18044z) {
        C18043y c18043y = AbstractC18039u.f70026H;
        InterfaceC21493z interfaceC21493z = f70062a[21];
        c18043y.m51817a(interfaceC18044z, Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: k */
    public static final void m51812k(String str, InterfaceC18044z interfaceC18044z) {
        C18043y c18043y = AbstractC18039u.f70058y;
        InterfaceC21493z interfaceC21493z = f70062a[14];
        c18043y.m51817a(interfaceC18044z, str);
    }

    /* JADX INFO: renamed from: l */
    public static final void m51813l(InterfaceC18044z interfaceC18044z, C23254g c23254g) {
        C18043y c18043y = AbstractC18039u.f70034a;
        ((C18030l) interfaceC18044z).m51772e(AbstractC18039u.f70019A, AbstractC37056f.m118958J(c23254g));
    }

    /* JADX INFO: renamed from: m */
    public static final void m51814m(InterfaceC18044z interfaceC18044z, EnumC22167a enumC22167a) {
        C18043y c18043y = AbstractC18039u.f70027I;
        InterfaceC21493z interfaceC21493z = f70062a[24];
        c18043y.m51817a(interfaceC18044z, enumC22167a);
    }

    /* JADX INFO: renamed from: n */
    public static final void m51815n(InterfaceC18044z interfaceC18044z) {
        C18043y c18043y = AbstractC18039u.f70046m;
        InterfaceC21493z interfaceC21493z = f70062a[6];
        c18043y.m51817a(interfaceC18044z, Boolean.TRUE);
    }
}
