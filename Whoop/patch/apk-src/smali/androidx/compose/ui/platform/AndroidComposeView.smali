.class public final Landroidx/compose/ui/platform/AndroidComposeView;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/node/Owner;
.implements Lg2/a0;
.implements La3/h2;
.implements Lu2/f;
.implements Landroidx/lifecycle/DefaultLifecycleObserver;
.implements La3/z1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0019\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0003\u00a6\u0002\u0018J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0011\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00102\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J!\u0010\u001a\u001a\u00020\u00102\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00100\u0017\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020 8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$R+\u0010.\u001a\u00020&2\u0006\u0010\'\u001a\u00020&8V@RX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+\"\u0004\u0008,\u0010-R\u001a\u00104\u001a\u00020/8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00080\u00101\u001a\u0004\u00082\u00103R*\u0010=\u001a\u0002052\u0006\u00106\u001a\u0002058\u0016@VX\u0096\u000e\u00a2\u0006\u0012\n\u0004\u00087\u00108\u001a\u0004\u00089\u0010:\"\u0004\u0008;\u0010<R\u001a\u0010C\u001a\u00020>8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008?\u0010@\u001a\u0004\u0008A\u0010BR\u001a\u0010I\u001a\u00020D8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008E\u0010F\u001a\u0004\u0008G\u0010HR\u0017\u0010O\u001a\u00020J8\u0006\u00a2\u0006\u000c\n\u0004\u0008K\u0010L\u001a\u0004\u0008M\u0010NR \u0010W\u001a\u00020P8\u0016X\u0096\u0004\u00a2\u0006\u0012\n\u0004\u0008Q\u0010R\u0012\u0004\u0008U\u0010V\u001a\u0004\u0008S\u0010TR \u0010]\u001a\u0008\u0012\u0004\u0012\u00020P0X8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008Y\u0010Z\u001a\u0004\u0008[\u0010\\R\u001a\u0010c\u001a\u00020^8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008_\u0010`\u001a\u0004\u0008a\u0010bR\u001a\u0010i\u001a\u00020d8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008e\u0010f\u001a\u0004\u0008g\u0010hR\u001a\u0010o\u001a\u00020j8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008k\u0010l\u001a\u0004\u0008m\u0010nR\"\u0010w\u001a\u00020p8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008q\u0010r\u001a\u0004\u0008s\u0010t\"\u0004\u0008u\u0010vR\u001a\u0010}\u001a\u00020x8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008y\u0010z\u001a\u0004\u0008{\u0010|R\u001e\u0010\u0083\u0001\u001a\u00020~8\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0005\u0008\u007f\u0010\u0080\u0001\u001a\u0006\u0008\u0081\u0001\u0010\u0082\u0001R \u0010\u0089\u0001\u001a\u00030\u0084\u00018\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0085\u0001\u0010\u0086\u0001\u001a\u0006\u0008\u0087\u0001\u0010\u0088\u0001R5\u0010\u0090\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u008a\u0001\u0012\u0004\u0012\u00020\u00100\u00178\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0017\n\u0006\u0008\u008b\u0001\u0010\u008c\u0001\u001a\u0006\u0008\u008d\u0001\u0010\u008e\u0001\"\u0005\u0008\u008f\u0001\u0010\u001bR\"\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0000X\u0080\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0092\u0001\u0010\u0093\u0001\u001a\u0006\u0008\u0094\u0001\u0010\u0095\u0001R \u0010\u009c\u0001\u001a\u00030\u0097\u00018\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u0098\u0001\u0010\u0099\u0001\u001a\u0006\u0008\u009a\u0001\u0010\u009b\u0001R \u0010\u00a2\u0001\u001a\u00030\u009d\u00018\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u009e\u0001\u0010\u009f\u0001\u001a\u0006\u0008\u00a0\u0001\u0010\u00a1\u0001R \u0010\u00a8\u0001\u001a\u00030\u00a3\u00018\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00a4\u0001\u0010\u00a5\u0001\u001a\u0006\u0008\u00a6\u0001\u0010\u00a7\u0001R1\u0010\u00b1\u0001\u001a\u00030\u00a9\u00018V@\u0016X\u0096\u000e\u00a2\u0006\u001f\n\u0006\u0008\u00aa\u0001\u0010\u00ab\u0001\u0012\u0005\u0008\u00b0\u0001\u0010V\u001a\u0006\u0008\u00ac\u0001\u0010\u00ad\u0001\"\u0006\u0008\u00ae\u0001\u0010\u00af\u0001R/\u0010\u00b8\u0001\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u001e\n\u0006\u0008\u00b2\u0001\u0010\u00b3\u0001\u0012\u0005\u0008\u00b7\u0001\u0010V\u001a\u0006\u0008\u00b4\u0001\u0010\u00b5\u0001\"\u0005\u0008\u00b6\u0001\u0010\u0012R5\u0010\u00be\u0001\u001a\u0004\u0018\u00010\u00182\u0008\u0010\'\u001a\u0004\u0018\u00010\u00188B@BX\u0082\u008e\u0002\u00a2\u0006\u0017\n\u0005\u0008\u00b9\u0001\u0010)\u001a\u0006\u0008\u00ba\u0001\u0010\u00bb\u0001\"\u0006\u0008\u00bc\u0001\u0010\u00bd\u0001R\"\u0010\u00c2\u0001\u001a\u0004\u0018\u00010\u00188FX\u0086\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u00bf\u0001\u0010\u00c0\u0001\u001a\u0006\u0008\u00c1\u0001\u0010\u00bb\u0001R\'\u0010\u00c9\u0001\u001a\u00030\u00c3\u00018\u0016X\u0097\u0004\u00a2\u0006\u0017\n\u0006\u0008\u00c4\u0001\u0010\u00c5\u0001\u0012\u0005\u0008\u00c8\u0001\u0010V\u001a\u0006\u0008\u00c6\u0001\u0010\u00c7\u0001R \u0010\u00cf\u0001\u001a\u00030\u00ca\u00018\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00cb\u0001\u0010\u00cc\u0001\u001a\u0006\u0008\u00cd\u0001\u0010\u00ce\u0001R\'\u0010\u00d6\u0001\u001a\u00030\u00d0\u00018\u0016X\u0097\u0004\u00a2\u0006\u0017\n\u0006\u0008\u00d1\u0001\u0010\u00d2\u0001\u0012\u0005\u0008\u00d5\u0001\u0010V\u001a\u0006\u0008\u00d3\u0001\u0010\u00d4\u0001R3\u0010\u00dd\u0001\u001a\u00030\u00d7\u00012\u0007\u0010\'\u001a\u00030\u00d7\u00018V@RX\u0096\u008e\u0002\u00a2\u0006\u0017\n\u0005\u0008\u00d8\u0001\u0010)\u001a\u0006\u0008\u00d9\u0001\u0010\u00da\u0001\"\u0006\u0008\u00db\u0001\u0010\u00dc\u0001R3\u0010\u00e4\u0001\u001a\u00030\u00de\u00012\u0007\u0010\'\u001a\u00030\u00de\u00018V@RX\u0096\u008e\u0002\u00a2\u0006\u0017\n\u0005\u0008\u00df\u0001\u0010)\u001a\u0006\u0008\u00e0\u0001\u0010\u00e1\u0001\"\u0006\u0008\u00e2\u0001\u0010\u00e3\u0001R \u0010\u00ea\u0001\u001a\u00030\u00e5\u00018\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00e6\u0001\u0010\u00e7\u0001\u001a\u0006\u0008\u00e8\u0001\u0010\u00e9\u0001R \u0010\u00f0\u0001\u001a\u00030\u00eb\u00018\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00ec\u0001\u0010\u00ed\u0001\u001a\u0006\u0008\u00ee\u0001\u0010\u00ef\u0001R \u0010\u00f6\u0001\u001a\u00030\u00f1\u00018\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00f2\u0001\u0010\u00f3\u0001\u001a\u0006\u0008\u00f4\u0001\u0010\u00f5\u0001R \u0010\u00fc\u0001\u001a\u00030\u00f7\u00018\u0016X\u0096\u0004\u00a2\u0006\u0010\n\u0006\u0008\u00f8\u0001\u0010\u00f9\u0001\u001a\u0006\u0008\u00fa\u0001\u0010\u00fb\u0001R\u0017\u0010\u00ff\u0001\u001a\u00020\u001d8VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00fd\u0001\u0010\u00fe\u0001R\u0018\u0010\u0083\u0002\u001a\u00030\u0080\u00028VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0081\u0002\u0010\u0082\u0002R*\u0010\u0084\u0002\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0017\n\u0006\u0008\u0084\u0002\u0010\u0085\u0002\u001a\u0006\u0008\u0086\u0002\u0010\u0087\u0002\"\u0005\u0008\u0088\u0002\u0010\u0016R\u001a\u0010\u008c\u0002\u001a\u0005\u0018\u00010\u0089\u00028VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u008a\u0002\u0010\u008b\u0002R\u001a\u0010\u0090\u0002\u001a\u0005\u0018\u00010\u008d\u00028VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u008e\u0002\u0010\u008f\u0002R\u0018\u0010\u0094\u0002\u001a\u00030\u0091\u00028@X\u0080\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0092\u0002\u0010\u0093\u0002R\u0017\u0010\u0096\u0002\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0095\u0002\u0010\u00b5\u0001R\u0018\u0010\u0098\u0002\u001a\u00030\u00a9\u00018VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0097\u0002\u0010\u00ad\u0001R\u0018\u0010\u009c\u0002\u001a\u00030\u0099\u00028VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u009a\u0002\u0010\u009b\u0002R\u0018\u0010\u00a0\u0002\u001a\u00030\u009d\u00028VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u009e\u0002\u0010\u009f\u0002R\u0018\u0010\u00a2\u0002\u001a\u00030\u00a9\u00018@X\u0080\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00a1\u0002\u0010\u00ad\u0001R\u0019\u0010\u00a5\u0002\u001a\u0004\u0018\u00010\u00008VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00a3\u0002\u0010\u00a4\u0002\u00a8\u0006\u00a7\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/platform/AndroidComposeView;",
        "Landroid/view/ViewGroup;",
        "Landroidx/compose/ui/node/Owner;",
        "Lg2/a0;",
        "",
        "Lu2/f;",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "La3/z1;",
        "",
        "getImportantForAutofill",
        "()I",
        "Lh2/c;",
        "getEmbeddedViewFocusRect",
        "()Lh2/c;",
        "",
        "intervalMillis",
        "Ll83/a0;",
        "setAccessibilityEventBatchIntervalMillis",
        "(J)V",
        "La3/g2;",
        "handler",
        "setUncaughtExceptionHandler",
        "(La3/g2;)V",
        "Lkotlin/Function1;",
        "Lb3/o;",
        "callback",
        "setOnViewTreeOwnersAvailable",
        "(Lkotlin/jvm/functions/Function1;)V",
        "accessibilityId",
        "Landroid/view/View;",
        "findViewByAccessibilityIdTraversal",
        "(I)Landroid/view/View;",
        "La3/p0;",
        "y",
        "La3/p0;",
        "getSharedDrawScope",
        "()La3/p0;",
        "sharedDrawScope",
        "Ly3/c;",
        "<set-?>",
        "z",
        "Lp1/c1;",
        "getDensity",
        "()Ly3/c;",
        "setDensity",
        "(Ly3/c;)V",
        "density",
        "Lg2/k;",
        "G",
        "Lg2/k;",
        "getFocusOwner",
        "()Lg2/k;",
        "focusOwner",
        "Lq83/j;",
        "value",
        "H",
        "Lq83/j;",
        "getCoroutineContext",
        "()Lq83/j;",
        "setCoroutineContext",
        "(Lq83/j;)V",
        "coroutineContext",
        "Le2/a;",
        "I",
        "Le2/a;",
        "getDragAndDropManager",
        "()Le2/a;",
        "dragAndDropManager",
        "Lb3/j3;",
        "L",
        "Lb3/j3;",
        "getViewConfiguration",
        "()Lb3/j3;",
        "viewConfiguration",
        "Ly2/q;",
        "M",
        "Ly2/q;",
        "getInsetsListener",
        "()Ly2/q;",
        "insetsListener",
        "La3/n0;",
        "N",
        "La3/n0;",
        "getRoot",
        "()La3/n0;",
        "getRoot$annotations",
        "()V",
        "root",
        "La0/g0;",
        "O",
        "La0/g0;",
        "getLayoutNodes",
        "()La0/g0;",
        "layoutNodes",
        "Lj3/b;",
        "P",
        "Lj3/b;",
        "getRectManager",
        "()Lj3/b;",
        "rectManager",
        "La3/h2;",
        "Q",
        "La3/h2;",
        "getRootForTest",
        "()La3/h2;",
        "rootForTest",
        "Li3/r;",
        "R",
        "Li3/r;",
        "getSemanticsOwner",
        "()Li3/r;",
        "semanticsOwner",
        "Ld2/d;",
        "T",
        "Ld2/d;",
        "getContentCaptureManager$ui_release",
        "()Ld2/d;",
        "setContentCaptureManager$ui_release",
        "(Ld2/d;)V",
        "contentCaptureManager",
        "Lb3/h;",
        "U",
        "Lb3/h;",
        "getAccessibilityManager",
        "()Lb3/h;",
        "accessibilityManager",
        "Li2/f0;",
        "V",
        "Li2/f0;",
        "getGraphicsContext",
        "()Li2/f0;",
        "graphicsContext",
        "Lc2/m;",
        "W",
        "Lc2/m;",
        "getAutofillTree",
        "()Lc2/m;",
        "autofillTree",
        "Landroid/content/res/Configuration;",
        "g0",
        "Lkotlin/jvm/functions/Function1;",
        "getConfigurationChangeObserver",
        "()Lkotlin/jvm/functions/Function1;",
        "setConfigurationChangeObserver",
        "configurationChangeObserver",
        "Lc2/d;",
        "i0",
        "Lc2/d;",
        "get_autofillManager$ui_release",
        "()Lc2/d;",
        "_autofillManager",
        "Lb3/j;",
        "k0",
        "Lb3/j;",
        "getClipboardManager",
        "()Lb3/j;",
        "clipboardManager",
        "Lb3/i;",
        "l0",
        "Lb3/i;",
        "getClipboard",
        "()Lb3/i;",
        "clipboard",
        "La3/c2;",
        "m0",
        "La3/c2;",
        "getSnapshotObserver",
        "()La3/c2;",
        "snapshotObserver",
        "",
        "n0",
        "Z",
        "getShowLayoutBounds",
        "()Z",
        "setShowLayoutBounds",
        "(Z)V",
        "getShowLayoutBounds$annotations",
        "showLayoutBounds",
        "x0",
        "J",
        "getLastMatrixRecalculationAnimationTime$ui_release",
        "()J",
        "setLastMatrixRecalculationAnimationTime$ui_release",
        "getLastMatrixRecalculationAnimationTime$ui_release$annotations",
        "lastMatrixRecalculationAnimationTime",
        "A0",
        "get_viewTreeOwners",
        "()Lb3/o;",
        "set_viewTreeOwners",
        "(Lb3/o;)V",
        "_viewTreeOwners",
        "B0",
        "Lp1/t2;",
        "getViewTreeOwners",
        "viewTreeOwners",
        "Lq3/z;",
        "H0",
        "Lq3/z;",
        "getTextInputService",
        "()Lq3/z;",
        "getTextInputService$annotations",
        "textInputService",
        "Lb3/x2;",
        "J0",
        "Lb3/x2;",
        "getSoftwareKeyboardController",
        "()Lb3/x2;",
        "softwareKeyboardController",
        "Lp3/g;",
        "K0",
        "Lp3/g;",
        "getFontLoader",
        "()Lp3/g;",
        "getFontLoader$annotations",
        "fontLoader",
        "Lp3/h;",
        "L0",
        "getFontFamilyResolver",
        "()Lp3/h;",
        "setFontFamilyResolver",
        "(Lp3/h;)V",
        "fontFamilyResolver",
        "Ly3/m;",
        "N0",
        "getLayoutDirection",
        "()Ly3/m;",
        "setLayoutDirection",
        "(Ly3/m;)V",
        "layoutDirection",
        "Lq2/a;",
        "O0",
        "Lq2/a;",
        "getHapticFeedBack",
        "()Lq2/a;",
        "hapticFeedBack",
        "Lz2/d;",
        "Q0",
        "Lz2/d;",
        "getModifierLocalManager",
        "()Lz2/d;",
        "modifierLocalManager",
        "Lb3/z2;",
        "R0",
        "Lb3/z2;",
        "getTextToolbar",
        "()Lb3/z2;",
        "textToolbar",
        "Lu2/p;",
        "g1",
        "Lu2/p;",
        "getPointerIconService",
        "()Lu2/p;",
        "pointerIconService",
        "getView",
        "()Landroid/view/View;",
        "view",
        "Lb3/m3;",
        "getWindowInfo",
        "()Lb3/m3;",
        "windowInfo",
        "uncaughtExceptionHandler",
        "La3/g2;",
        "getUncaughtExceptionHandler$ui_release",
        "()La3/g2;",
        "setUncaughtExceptionHandler$ui_release",
        "Lc2/h;",
        "getAutofill",
        "()Lc2/h;",
        "autofill",
        "Lc2/k;",
        "getAutofillManager",
        "()Lc2/k;",
        "autofillManager",
        "Lb3/h1;",
        "getAndroidViewsHandler$ui_release",
        "()Lb3/h1;",
        "androidViewsHandler",
        "getMeasureIteration",
        "measureIteration",
        "getHasPendingMeasureOrLayout",
        "hasPendingMeasureOrLayout",
        "Ly2/i1;",
        "getPlacementScope",
        "()Ly2/i1;",
        "placementScope",
        "Lr2/b;",
        "getInputModeManager",
        "()Lr2/b;",
        "inputModeManager",
        "getScrollCaptureInProgress$ui_release",
        "scrollCaptureInProgress",
        "getOutOfFrameExecutor",
        "()Landroidx/compose/ui/platform/AndroidComposeView;",
        "outOfFrameExecutor",
        "b3/o0",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static h1:Ljava/lang/Class;

.field public static i1:Ljava/lang/reflect/Method;

.field public static j1:Ljava/lang/reflect/Method;

.field public static final k1:La0/q0;

.field public static l1:Lb3/n;

.field public static m1:Ljava/lang/reflect/Method;


# instance fields
.field public final A0:Lp1/k1;

.field public final B0:Lp1/f0;

.field public C0:Lkotlin/jvm/functions/Function1;

.field public final D0:Lb3/k;

.field public final E:Landroid/view/View;

.field public final E0:Lb3/l;

.field public final F:Z

.field public final F0:Lb3/m;

.field public final G:Lg2/l;

.field public final G0:Lq3/b0;

.field public H:Lq83/j;

.field public final H0:Lq3/z;

.field public final I:Le2/a;

.field public final I0:Ljava/util/concurrent/atomic/AtomicReference;

.field public final J:Lb3/n2;

.field public final J0:Lb3/x1;

.field public final K:Li2/w;

.field public final K0:Lb3/h2;

.field public final L:Lb3/f1;

.field public final L0:Lp1/k1;

.field public final M:Ly2/q;

.field public M0:I

.field public final N:La3/n0;

.field public final N0:Lp1/k1;

.field public final O:La0/g0;

.field public final O0:Lb3/w1;

.field public final P:Lj3/b;

.field public final P0:Lr2/c;

.field public final Q:Landroidx/compose/ui/platform/AndroidComposeView;

.field public final Q0:Lz2/d;

.field public final R:Li3/r;

.field public final R0:Lb3/y0;

.field public final S:Lb3/h0;

.field public S0:Landroid/view/MotionEvent;

.field public T:Ld2/d;

.field public T0:J

.field public final U:Lb3/h;

.field public final U0:Lwe/o;

.field public final V:Li2/f;

.field public final V0:La0/q0;

.field public final W:Lc2/m;

.field public W0:F

.field public X0:F

.field public final Y0:Landroidx/databinding/s;

.field public final Z0:Landroidx/lifecycle/z0;

.field public final a0:Ljava/util/ArrayList;

.field public a1:Z

.field public b0:Ljava/util/ArrayList;

.field public final b1:Lb3/w;

.field public c0:Z

.field public final c1:Lb3/o1;

.field public d0:Z

.field public d1:Z

.field public final e0:Lu2/g;

.field public final e1:Lh3/j;

.field public final f0:Ll2/a;

.field public f1:Landroid/view/View;

.field public g0:Lkotlin/jvm/functions/Function1;

.field public final g1:Lb3/x;

.field public final h0:Lc2/a;

.field public final i0:Lc2/d;

.field public j0:Z

.field public final k0:Lb3/j;

.field public final l0:Lb3/i;

.field public final m0:La3/c2;

.field public n0:Z

.field public o0:Lb3/h1;

.field public p0:Ly3/a;

.field public q0:Z

.field public final r0:La3/e1;

.field public s0:J

.field public final t0:[I

.field public final u0:[F

.field public final v0:[F

.field public w:J

.field public final w0:[F

.field public final x:Z

.field public x0:J

.field public final y:La3/p0;

.field public y0:Z

.field public final z:Lp1/k1;

.field public z0:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La0/q0;

    invoke-direct {v0}, La0/q0;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/AndroidComposeView;->k1:La0/q0;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lq83/j;)V
    .locals 16

    move-object/from16 v2, p0

    move-object/from16 v8, p1

    invoke-direct/range {p0 .. p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    iput-wide v0, v2, Landroidx/compose/ui/platform/AndroidComposeView;->w:J

    const/4 v9, 0x1

    iput-boolean v9, v2, Landroidx/compose/ui/platform/AndroidComposeView;->x:Z

    new-instance v0, La3/p0;

    invoke-direct {v0}, La3/p0;-><init>()V

    iput-object v0, v2, Landroidx/compose/ui/platform/AndroidComposeView;->y:La3/p0;

    invoke-static {v8}, Lva3/g;->a(Landroid/content/Context;)Ly3/e;

    move-result-object v0

    sget-object v10, Lp1/v0;->z:Lp1/v0;

    new-instance v1, Lp1/k1;

    invoke-direct {v1, v0, v10}, Lp1/k1;-><init>(Ljava/lang/Object;Lp1/o2;)V

    iput-object v1, v2, Landroidx/compose/ui/platform/AndroidComposeView;->z:Lp1/k1;

    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x23

    if-lt v11, v0, :cond_0

    move v13, v9

    goto :goto_0

    :cond_0
    const/4 v13, 0x0

    :goto_0
    iput-boolean v13, v2, Landroidx/compose/ui/platform/AndroidComposeView;->F:Z

    new-instance v7, Li3/e;

    invoke-direct {v7}, Lb2/v;-><init>()V

    new-instance v14, Landroidx/compose/ui/semantics/EmptySemanticsElement;

    invoke-direct {v14, v7}, Landroidx/compose/ui/semantics/EmptySemanticsElement;-><init>(Li3/e;)V

    new-instance v15, Landroidx/compose/ui/platform/AndroidComposeView$bringIntoViewNode$1;

    invoke-direct {v15, v2}, Landroidx/compose/ui/platform/AndroidComposeView$bringIntoViewNode$1;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;)V

    new-instance v0, Lg2/l;

    invoke-direct {v0, v2, v2}, Lg2/l;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/ui/platform/AndroidComposeView;)V

    iput-object v0, v2, Landroidx/compose/ui/platform/AndroidComposeView;->G:Lg2/l;

    move-object/from16 v0, p2

    iput-object v0, v2, Landroidx/compose/ui/platform/AndroidComposeView;->H:Lq83/j;

    new-instance v0, Le2/a;

    move-object v1, v0

    new-instance v0, Lb3/s;

    const-string v6, "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z"

    const/4 v2, 0x0

    move-object v3, v1

    const/4 v1, 0x3

    move-object v4, v3

    const-class v3, Landroidx/compose/ui/platform/AndroidComposeView;

    const-string v5, "startDrag"

    move-object v12, v4

    move-object/from16 v4, p0

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    move-object v2, v4

    invoke-direct {v12, v0}, Le2/a;-><init>(Lb3/s;)V

    iput-object v12, v2, Landroidx/compose/ui/platform/AndroidComposeView;->I:Le2/a;

    new-instance v0, Lb3/n2;

    invoke-direct {v0}, Lb3/n2;-><init>()V

    iput-object v0, v2, Landroidx/compose/ui/platform/AndroidComposeView;->J:Lb3/n2;

    new-instance v0, Lb3/p;

    invoke-direct {v0, v2, v9}, Lb3/p;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;I)V

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v0}, Landroidx/compose/ui/input/key/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {}, Landroidx/compose/ui/input/rotary/a;->a()Landroidx/compose/ui/Modifier;

    move-result-object v1

    new-instance v3, Li2/w;

    invoke-direct {v3}, Li2/w;-><init>()V

    iput-object v3, v2, Landroidx/compose/ui/platform/AndroidComposeView;->K:Li2/w;

    new-instance v3, Lb3/f1;

    invoke-static {v8}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v4

    invoke-direct {v3, v4}, Lb3/f1;-><init>(Landroid/view/ViewConfiguration;)V

    iput-object v3, v2, Landroidx/compose/ui/platform/AndroidComposeView;->L:Lb3/f1;

    new-instance v3, Ly2/q;

    invoke-direct {v3}, Ly2/q;-><init>()V

    iput-object v3, v2, Landroidx/compose/ui/platform/AndroidComposeView;->M:Ly2/q;

    new-instance v4, La3/n0;

    const/4 v12, 0x3

    invoke-direct {v4, v12}, La3/n0;-><init>(I)V

    sget-object v5, Ly2/n1;->b:Ly2/n1;

    invoke-virtual {v4, v5}, La3/n0;->D0(Ly2/r0;)V

    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->getDensity()Ly3/c;

    move-result-object v5

    invoke-virtual {v4, v5}, La3/n0;->A0(Ly3/c;)V

    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->getViewConfiguration()Lb3/j3;

    move-result-object v5

    invoke-virtual {v4, v5}, La3/n0;->F0(Lb3/j3;)V

    invoke-static {v3}, Landroidx/compose/ui/layout/c;->b(Ly2/q;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-interface {v3, v14}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-interface {v3, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-interface {v1, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lg2/k;

    move-result-object v1

    check-cast v1, Lg2/l;

    iget-object v1, v1, Lg2/l;->e:Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$1;

    invoke-interface {v0, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->getDragAndDropManager()Le2/a;

    move-result-object v1

    iget-object v1, v1, Le2/a;->c:Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager$modifier$1;

    invoke-interface {v0, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-interface {v0, v15}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v4, v0}, La3/n0;->E0(Landroidx/compose/ui/Modifier;)V

    iput-object v4, v2, Landroidx/compose/ui/platform/AndroidComposeView;->N:La3/n0;

    sget-object v0, La0/t;->a:La0/g0;

    new-instance v0, La0/g0;

    invoke-direct {v0}, La0/g0;-><init>()V

    iput-object v0, v2, Landroidx/compose/ui/platform/AndroidComposeView;->O:La0/g0;

    new-instance v0, Lj3/b;

    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->getLayoutNodes()La0/g0;

    invoke-direct {v0}, Lj3/b;-><init>()V

    iput-object v0, v2, Landroidx/compose/ui/platform/AndroidComposeView;->P:Lj3/b;

    iput-object v2, v2, Landroidx/compose/ui/platform/AndroidComposeView;->Q:Landroidx/compose/ui/platform/AndroidComposeView;

    new-instance v0, Li3/r;

    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La3/n0;

    move-result-object v1

    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->getLayoutNodes()La0/g0;

    move-result-object v3

    invoke-direct {v0, v1, v7, v3}, Li3/r;-><init>(La3/n0;Li3/e;La0/g0;)V

    iput-object v0, v2, Landroidx/compose/ui/platform/AndroidComposeView;->R:Li3/r;

    new-instance v14, Lb3/h0;

    invoke-direct {v14, v2}, Lb3/h0;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;)V

    iput-object v14, v2, Landroidx/compose/ui/platform/AndroidComposeView;->S:Lb3/h0;

    new-instance v15, Ld2/d;

    new-instance v0, Landroidx/room/u0;

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v1, 0x0

    const-class v3, Lb3/o0;

    const-string v4, "getContentCaptureSessionCompat"

    const-string v5, "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;"

    invoke-direct/range {v0 .. v7}, Landroidx/room/u0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-direct {v15, v2, v0}, Ld2/d;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/room/u0;)V

    iput-object v15, v2, Landroidx/compose/ui/platform/AndroidComposeView;->T:Ld2/d;

    new-instance v0, Lb3/h;

    invoke-direct {v0, v8}, Lb3/h;-><init>(Landroid/content/Context;)V

    iput-object v0, v2, Landroidx/compose/ui/platform/AndroidComposeView;->U:Lb3/h;

    new-instance v0, Li2/f;

    invoke-direct {v0, v2}, Li2/f;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;)V

    iput-object v0, v2, Landroidx/compose/ui/platform/AndroidComposeView;->V:Li2/f;

    new-instance v0, Lc2/m;

    invoke-direct {v0}, Lc2/m;-><init>()V

    iput-object v0, v2, Landroidx/compose/ui/platform/AndroidComposeView;->W:Lc2/m;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, v2, Landroidx/compose/ui/platform/AndroidComposeView;->a0:Ljava/util/ArrayList;

    new-instance v0, Lu2/g;

    invoke-direct {v0}, Lu2/g;-><init>()V

    iput-object v0, v2, Landroidx/compose/ui/platform/AndroidComposeView;->e0:Lu2/g;

    new-instance v0, Ll2/a;

    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La3/n0;

    move-result-object v1

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Ll2/a;->b:Ljava/lang/Object;

    new-instance v3, Lu2/d;

    iget-object v1, v1, La3/n0;->e0:La3/l1;

    iget-object v1, v1, La3/l1;->d:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/node/a;

    invoke-direct {v3, v1}, Lu2/d;-><init>(Ly2/y;)V

    iput-object v3, v0, Ll2/a;->c:Ljava/lang/Object;

    new-instance v1, Lbu/c;

    const/16 v3, 0x1b

    invoke-direct {v1, v3}, Lbu/c;-><init>(I)V

    iput-object v1, v0, Ll2/a;->d:Ljava/lang/Object;

    new-instance v1, La3/v;

    invoke-direct {v1}, La3/v;-><init>()V

    iput-object v1, v0, Ll2/a;->e:Ljava/lang/Object;

    iput-object v0, v2, Landroidx/compose/ui/platform/AndroidComposeView;->f0:Ll2/a;

    sget-object v0, Lb3/r;->x:Lb3/r;

    iput-object v0, v2, Landroidx/compose/ui/platform/AndroidComposeView;->g0:Lkotlin/jvm/functions/Function1;

    new-instance v0, Lc2/a;

    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->getAutofillTree()Lc2/m;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lc2/a;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;Lc2/m;)V

    iput-object v0, v2, Landroidx/compose/ui/platform/AndroidComposeView;->h0:Lc2/a;

    const-class v0, Landroid/view/autofill/AutofillManager;

    invoke-virtual {v8, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/autofill/AutofillManager;

    if-eqz v0, :cond_a

    new-instance v1, Lc2/d;

    move-object v3, v1

    new-instance v1, Lad3/z;

    invoke-direct {v1, v0, v12}, Lad3/z;-><init>(Ljava/lang/Object;I)V

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Li3/r;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRectManager()Lj3/b;

    move-result-object v4

    invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    move-object v0, v3

    move-object/from16 v3, p0

    invoke-direct/range {v0 .. v5}, Lc2/d;-><init>(Lad3/z;Li3/r;Landroidx/compose/ui/platform/AndroidComposeView;Lj3/b;Ljava/lang/String;)V

    move-object v2, v3

    iput-object v0, v2, Landroidx/compose/ui/platform/AndroidComposeView;->i0:Lc2/d;

    new-instance v0, Lb3/j;

    invoke-direct {v0, v8}, Lb3/j;-><init>(Landroid/content/Context;)V

    iput-object v0, v2, Landroidx/compose/ui/platform/AndroidComposeView;->k0:Lb3/j;

    new-instance v0, Lb3/i;

    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->getClipboardManager()Lb3/j;

    move-result-object v1

    invoke-direct {v0, v1}, Lb3/i;-><init>(Lb3/j;)V

    iput-object v0, v2, Landroidx/compose/ui/platform/AndroidComposeView;->l0:Lb3/i;

    new-instance v0, La3/c2;

    new-instance v1, Lb3/p;

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lb3/p;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;I)V

    invoke-direct {v0, v1}, La3/c2;-><init>(Lb3/p;)V

    iput-object v0, v2, Landroidx/compose/ui/platform/AndroidComposeView;->m0:La3/c2;

    new-instance v0, La3/e1;

    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La3/n0;

    move-result-object v1

    invoke-direct {v0, v1}, La3/e1;-><init>(La3/n0;)V

    iput-object v0, v2, Landroidx/compose/ui/platform/AndroidComposeView;->r0:La3/e1;

    const v0, 0x7fffffff

    int-to-long v0, v0

    const/16 v4, 0x20

    shl-long v4, v0, v4

    const-wide v6, 0xffffffffL

    and-long/2addr v0, v6

    or-long/2addr v0, v4

    iput-wide v0, v2, Landroidx/compose/ui/platform/AndroidComposeView;->s0:J

    const/4 v0, 0x0

    filled-new-array {v0, v0}, [I

    move-result-object v1

    iput-object v1, v2, Landroidx/compose/ui/platform/AndroidComposeView;->t0:[I

    invoke-static {}, Li2/l0;->a()[F

    move-result-object v0

    iput-object v0, v2, Landroidx/compose/ui/platform/AndroidComposeView;->u0:[F

    invoke-static {}, Li2/l0;->a()[F

    move-result-object v1

    iput-object v1, v2, Landroidx/compose/ui/platform/AndroidComposeView;->v0:[F

    invoke-static {}, Li2/l0;->a()[F

    move-result-object v1

    iput-object v1, v2, Landroidx/compose/ui/platform/AndroidComposeView;->w0:[F

    const-wide/16 v4, -0x1

    iput-wide v4, v2, Landroidx/compose/ui/platform/AndroidComposeView;->x0:J

    const-wide v4, 0x7f8000007f800000L    # 1.404448428688076E306

    iput-wide v4, v2, Landroidx/compose/ui/platform/AndroidComposeView;->z0:J

    const/4 v1, 0x0

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    iput-object v4, v2, Landroidx/compose/ui/platform/AndroidComposeView;->A0:Lp1/k1;

    new-instance v4, Lb3/w;

    invoke-direct {v4, v2, v3}, Lb3/w;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;I)V

    invoke-static {v4}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v4

    iput-object v4, v2, Landroidx/compose/ui/platform/AndroidComposeView;->B0:Lp1/f0;

    new-instance v4, Lb3/k;

    const/4 v5, 0x0

    invoke-direct {v4, v2, v5}, Lb3/k;-><init>(Ljava/lang/Object;I)V

    iput-object v4, v2, Landroidx/compose/ui/platform/AndroidComposeView;->D0:Lb3/k;

    new-instance v4, Lb3/l;

    invoke-direct {v4, v2}, Lb3/l;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;)V

    iput-object v4, v2, Landroidx/compose/ui/platform/AndroidComposeView;->E0:Lb3/l;

    new-instance v4, Lb3/m;

    invoke-direct {v4, v2}, Lb3/m;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;)V

    iput-object v4, v2, Landroidx/compose/ui/platform/AndroidComposeView;->F0:Lb3/m;

    new-instance v4, Lq3/b0;

    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->getView()Landroid/view/View;

    move-result-object v5

    invoke-direct {v4, v5, v2}, Lq3/b0;-><init>(Landroid/view/View;Landroidx/compose/ui/platform/AndroidComposeView;)V

    iput-object v4, v2, Landroidx/compose/ui/platform/AndroidComposeView;->G0:Lq3/b0;

    new-instance v5, Lq3/z;

    invoke-direct {v5, v4}, Lq3/z;-><init>(Lq3/t;)V

    iput-object v5, v2, Landroidx/compose/ui/platform/AndroidComposeView;->H0:Lq3/z;

    new-instance v4, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v4, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v4, v2, Landroidx/compose/ui/platform/AndroidComposeView;->I0:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v4, Lb3/x1;

    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->getTextInputService()Lq3/z;

    move-result-object v5

    invoke-direct {v4, v5}, Lb3/x1;-><init>(Lq3/z;)V

    iput-object v4, v2, Landroidx/compose/ui/platform/AndroidComposeView;->J0:Lb3/x1;

    new-instance v4, Lb3/h2;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iput-object v4, v2, Landroidx/compose/ui/platform/AndroidComposeView;->K0:Lb3/h2;

    invoke-static {v8}, Lge3/g;->q(Landroid/content/Context;)Lp3/j;

    move-result-object v4

    new-instance v5, Lp1/k1;

    invoke-direct {v5, v4, v10}, Lp1/k1;-><init>(Ljava/lang/Object;Lp1/o2;)V

    iput-object v5, v2, Landroidx/compose/ui/platform/AndroidComposeView;->L0:Lp1/k1;

    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    const/16 v5, 0x1f

    if-lt v11, v5, :cond_1

    invoke-static {v4}, Lb23/h;->a(Landroid/content/res/Configuration;)I

    move-result v4

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    iput v4, v2, Landroidx/compose/ui/platform/AndroidComposeView;->M0:I

    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result v4

    if-eqz v4, :cond_3

    if-eq v4, v9, :cond_2

    move-object v4, v1

    goto :goto_2

    :cond_2
    sget-object v4, Ly3/m;->x:Ly3/m;

    goto :goto_2

    :cond_3
    sget-object v4, Ly3/m;->w:Ly3/m;

    :goto_2
    if-nez v4, :cond_4

    sget-object v4, Ly3/m;->w:Ly3/m;

    :cond_4
    invoke-static {v4}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    iput-object v4, v2, Landroidx/compose/ui/platform/AndroidComposeView;->N0:Lp1/k1;

    new-instance v4, Lb3/w1;

    invoke-direct {v4, v2, v9}, Lb3/w1;-><init>(Landroid/view/View;I)V

    iput-object v4, v2, Landroidx/compose/ui/platform/AndroidComposeView;->O0:Lb3/w1;

    new-instance v4, Lr2/c;

    invoke-virtual {v2}, Landroid/view/View;->isInTouchMode()Z

    move-result v6

    if-eqz v6, :cond_5

    move v6, v9

    goto :goto_3

    :cond_5
    move v6, v3

    :goto_3
    new-instance v7, Lb3/p;

    const/4 v10, 0x0

    invoke-direct {v7, v2, v10}, Lb3/p;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;I)V

    invoke-direct {v4, v6, v7}, Lr2/c;-><init>(ILb3/p;)V

    iput-object v4, v2, Landroidx/compose/ui/platform/AndroidComposeView;->P0:Lr2/c;

    new-instance v4, Lz2/d;

    invoke-direct {v4, v2}, Lz2/d;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;)V

    iput-object v4, v2, Landroidx/compose/ui/platform/AndroidComposeView;->Q0:Lz2/d;

    new-instance v4, Lb3/y0;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    new-instance v6, Laa3/i1;

    new-instance v7, La3/l0;

    invoke-direct {v7, v4, v12}, La3/l0;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v6, v7}, Laa3/i1;-><init>(La3/l0;)V

    sget-object v6, Lb3/a3;->w:[Lb3/a3;

    iput-object v4, v2, Landroidx/compose/ui/platform/AndroidComposeView;->R0:Lb3/y0;

    new-instance v4, Lwe/o;

    const/4 v6, 0x4

    const/4 v10, 0x0

    invoke-direct {v4, v6, v10}, Lwe/o;-><init>(IZ)V

    iput-object v4, v2, Landroidx/compose/ui/platform/AndroidComposeView;->U0:Lwe/o;

    new-instance v4, La0/q0;

    invoke-direct {v4}, La0/q0;-><init>()V

    iput-object v4, v2, Landroidx/compose/ui/platform/AndroidComposeView;->V0:La0/q0;

    new-instance v4, Landroidx/databinding/s;

    invoke-direct {v4, v2, v9}, Landroidx/databinding/s;-><init>(Ljava/lang/Object;I)V

    iput-object v4, v2, Landroidx/compose/ui/platform/AndroidComposeView;->Y0:Landroidx/databinding/s;

    new-instance v4, Landroidx/lifecycle/z0;

    invoke-direct {v4, v2, v3}, Landroidx/lifecycle/z0;-><init>(Ljava/lang/Object;I)V

    iput-object v4, v2, Landroidx/compose/ui/platform/AndroidComposeView;->Z0:Landroidx/lifecycle/z0;

    new-instance v3, Lb3/w;

    invoke-direct {v3, v2, v9}, Lb3/w;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;I)V

    iput-object v3, v2, Landroidx/compose/ui/platform/AndroidComposeView;->b1:Lb3/w;

    const/16 v3, 0x1d

    if-ge v11, v3, :cond_6

    new-instance v4, Lxl/a;

    invoke-direct {v4, v0}, Lxl/a;-><init>([F)V

    goto :goto_4

    :cond_6
    new-instance v4, Lb3/p1;

    invoke-direct {v4}, Lb3/p1;-><init>()V

    :goto_4
    iput-object v4, v2, Landroidx/compose/ui/platform/AndroidComposeView;->c1:Lb3/o1;

    iget-object v0, v2, Landroidx/compose/ui/platform/AndroidComposeView;->T:Ld2/d;

    invoke-virtual {v2, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    const/4 v10, 0x0

    invoke-virtual {v2, v10}, Landroid/view/View;->setWillNotDraw(Z)V

    invoke-virtual {v2, v9}, Landroid/view/View;->setFocusable(Z)V

    sget-object v0, Lb3/n0;->a:Lb3/n0;

    invoke-virtual {v0, v2, v9, v10}, Lb3/n0;->a(Landroid/view/View;IZ)V

    invoke-virtual {v2, v9}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    invoke-virtual {v2, v10}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    invoke-static {v2, v14}, Lh5/p0;->n(Landroid/view/View;Lh5/b;)V

    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->getDragAndDropManager()Le2/a;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnDragListener(Landroid/view/View$OnDragListener;)V

    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La3/n0;

    move-result-object v0

    invoke-virtual {v0, v2}, La3/n0;->c(Landroidx/compose/ui/node/Owner;)V

    if-lt v11, v3, :cond_7

    sget-object v0, Lb3/i0;->a:Lb3/i0;

    invoke-virtual {v0, v2}, Lb3/i0;->a(Landroid/view/View;)V

    :cond_7
    if-eqz v13, :cond_8

    new-instance v0, Landroid/view/View;

    invoke-direct {v0, v8}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v3, v9, v9}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v3, 0x7f0a076b

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v3, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iput-object v0, v2, Landroidx/compose/ui/platform/AndroidComposeView;->E:Landroid/view/View;

    const/4 v3, -0x1

    invoke-virtual {v2, v0, v3}, Landroidx/compose/ui/platform/AndroidComposeView;->addView(Landroid/view/View;I)V

    :cond_8
    if-lt v11, v5, :cond_9

    new-instance v1, Lh3/j;

    invoke-direct {v1}, Lh3/j;-><init>()V

    :cond_9
    iput-object v1, v2, Landroidx/compose/ui/platform/AndroidComposeView;->e1:Lh3/j;

    new-instance v0, Lb3/x;

    invoke-direct {v0, v2}, Lb3/x;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;)V

    iput-object v0, v2, Landroidx/compose/ui/platform/AndroidComposeView;->g1:Lb3/x;

    return-void

    :cond_a
    const-string v0, "Autofill service could not be located."

    invoke-static {v0}, Lb9/y;->w(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    move-result-object v0

    throw v0
.end method

.method public static final a(Landroidx/compose/ui/platform/AndroidComposeView;ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)V
    .locals 2

    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->S:Lb3/h0;

    iget-object v0, p0, Lb3/h0;->G:Ljava/lang/String;

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    iget-object p0, p0, Lb3/h0;->E:La0/e0;

    invoke-virtual {p0, p1}, La0/e0;->d(I)I

    move-result p0

    if-eq p0, v1, :cond_1

    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {p1, p3, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    return-void

    :cond_0
    iget-object v0, p0, Lb3/h0;->H:Ljava/lang/String;

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p0, p0, Lb3/h0;->F:La0/e0;

    invoke-virtual {p0, p1}, La0/e0;->d(I)I

    move-result p0

    if-eq p0, v1, :cond_1

    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {p1, p3, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_1
    return-void
.end method

.method public static final synthetic b(Landroid/view/MotionEvent;Landroidx/compose/ui/platform/AndroidComposeView;)Z
    .locals 0

    invoke-super {p1, p0}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic c(Landroidx/compose/ui/platform/AndroidComposeView;Landroid/view/KeyEvent;)Z
    .locals 0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic d(Landroidx/compose/ui/platform/AndroidComposeView;)Lb3/o;
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->get_viewTreeOwners()Lb3/o;

    move-result-object p0

    return-object p0
.end method

.method public static e(Landroid/view/ViewGroup;)V
    .locals 4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    instance-of v3, v2, Landroidx/compose/ui/platform/AndroidComposeView;

    if-eqz v3, :cond_0

    check-cast v2, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->A()V

    goto :goto_1

    :cond_0
    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_1

    check-cast v2, Landroid/view/ViewGroup;

    invoke-static {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->e(Landroid/view/ViewGroup;)V

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static f(I)J
    .locals 4

    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p0

    const/high16 v1, -0x80000000

    const/16 v2, 0x20

    const/4 v3, 0x0

    if-eq v0, v1, :cond_2

    if-eqz v0, :cond_1

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v0, v1, :cond_0

    int-to-long v0, p0

    shl-long v2, v0, v2

    or-long/2addr v0, v2

    return-wide v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0

    :cond_1
    int-to-long v0, v3

    shl-long/2addr v0, v2

    const p0, 0x7fffffff

    int-to-long v2, p0

    or-long/2addr v0, v2

    return-wide v0

    :cond_2
    int-to-long v0, v3

    shl-long/2addr v0, v2

    int-to-long v2, p0

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public static synthetic getFontLoader$annotations()V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    return-void
.end method

.method public static synthetic getLastMatrixRecalculationAnimationTime$ui_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getRoot$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getShowLayoutBounds$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getTextInputService$annotations()V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    return-void
.end method

.method private final get_viewTreeOwners()Lb3/o;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->A0:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb3/o;

    return-object v0
.end method

.method public static j(Landroid/view/View;I)Landroid/view/View;
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    const/4 v2, 0x0

    if-ge v0, v1, :cond_2

    const-class v0, Landroid/view/View;

    const-string v1, "getAccessibilityViewId"

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v0, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    check-cast p0, Landroid/view/ViewGroup;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->j(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_1

    return-object v3

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v2
.end method

.method public static o(La3/n0;)V
    .locals 3

    invoke-virtual {p0}, La3/n0;->Q()V

    invoke-virtual {p0}, La3/n0;->M()Lr1/c;

    move-result-object p0

    iget-object v0, p0, Lr1/c;->w:[Ljava/lang/Object;

    iget p0, p0, Lr1/c;->y:I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p0, :cond_0

    aget-object v2, v0, v1

    check-cast v2, La3/n0;

    invoke-static {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->o(La3/n0;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static q(Landroid/view/MotionEvent;)Z
    .locals 8

    invoke-virtual {p0}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/high16 v4, 0x7f800000    # Float.POSITIVE_INFINITY

    if-ge v0, v4, :cond_0

    invoke-virtual {p0}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    and-int/2addr v0, v1

    if-ge v0, v4, :cond_0

    invoke-virtual {p0}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    and-int/2addr v0, v1

    if-ge v0, v4, :cond_0

    invoke-virtual {p0}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    and-int/2addr v0, v1

    if-ge v0, v4, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    if-nez v0, :cond_3

    invoke-virtual {p0}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v5

    move v6, v3

    :goto_1
    if-ge v6, v5, :cond_3

    invoke-virtual {p0, v6}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    and-int/2addr v0, v1

    if-ge v0, v4, :cond_2

    invoke-virtual {p0, v6}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    and-int/2addr v0, v1

    if-ge v0, v4, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x1d

    if-lt v0, v7, :cond_1

    sget-object v0, Lb3/p2;->a:Lb3/p2;

    invoke-virtual {v0, p0, v6}, Lb3/p2;->a(Landroid/view/MotionEvent;I)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    move v0, v2

    goto :goto_3

    :cond_2
    :goto_2
    move v0, v3

    :goto_3
    if-nez v0, :cond_3

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_3
    return v0
.end method

.method private setDensity(Ly3/c;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->z:Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private setFontFamilyResolver(Lp3/h;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->L0:Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private setLayoutDirection(Ly3/m;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->N0:Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final set_viewTreeOwners(Lb3/o;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->A0:Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final A()V
    .locals 10

    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->j0:Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSnapshotObserver()La3/c2;

    move-result-object v0

    iget-object v0, v0, La3/c2;->a:Lz1/v;

    iget-object v3, v0, Lz1/v;->g:Ljava/lang/Object;

    monitor-enter v3

    :try_start_0
    iget-object v0, v0, Lz1/v;->f:Lr1/c;

    iget v4, v0, Lr1/c;->y:I

    move v5, v2

    move v6, v5

    :goto_0
    if-ge v5, v4, :cond_2

    iget-object v7, v0, Lr1/c;->w:[Ljava/lang/Object;

    aget-object v7, v7, v5

    check-cast v7, Lz1/u;

    invoke-virtual {v7}, Lz1/u;->e()V

    iget-object v7, v7, Lz1/u;->f:La0/v0;

    invoke-virtual {v7}, La0/v0;->j()Z

    move-result v7

    if-nez v7, :cond_0

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_0
    if-lez v6, :cond_1

    iget-object v7, v0, Lr1/c;->w:[Ljava/lang/Object;

    sub-int v8, v5, v6

    aget-object v9, v7, v5

    aput-object v9, v7, v8

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    iget-object v5, v0, Lr1/c;->w:[Ljava/lang/Object;

    sub-int v6, v4, v6

    invoke-static {v5, v6, v4, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    iput v6, v0, Lr1/c;->y:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v3

    iput-boolean v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->j0:Z

    goto :goto_3

    :goto_2
    monitor-exit v3

    throw v0

    :cond_3
    :goto_3
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->o0:Lb3/h1;

    if-eqz v0, :cond_4

    invoke-static {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->e(Landroid/view/ViewGroup;)V

    :cond_4
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->i0:Lc2/d;

    if-eqz v0, :cond_6

    iget-object v3, v0, Lc2/d;->h:La0/h0;

    iget v4, v3, La0/h0;->d:I

    if-nez v4, :cond_5

    iget-boolean v4, v0, Lc2/d;->i:Z

    if-eqz v4, :cond_5

    iget-object v4, v0, Lc2/d;->a:Lad3/z;

    iget-object v4, v4, Lad3/z;->x:Ljava/lang/Object;

    check-cast v4, Landroid/view/autofill/AutofillManager;

    invoke-virtual {v4}, Landroid/view/autofill/AutofillManager;->commit()V

    iput-boolean v2, v0, Lc2/d;->i:Z

    :cond_5
    iget v3, v3, La0/h0;->d:I

    if-eqz v3, :cond_6

    const/4 v3, 0x1

    iput-boolean v3, v0, Lc2/d;->i:Z

    :cond_6
    :goto_4
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->V0:La0/q0;

    invoke-virtual {v0}, La0/q0;->h()Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->V0:La0/q0;

    invoke-virtual {v0, v2}, La0/q0;->e(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->V0:La0/q0;

    iget v0, v0, La0/q0;->b:I

    move v3, v2

    :goto_5
    if-ge v3, v0, :cond_9

    iget-object v4, p0, Landroidx/compose/ui/platform/AndroidComposeView;->V0:La0/q0;

    invoke-virtual {v4, v3}, La0/q0;->e(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc93/a;

    iget-object v5, p0, Landroidx/compose/ui/platform/AndroidComposeView;->V0:La0/q0;

    if-ltz v3, :cond_8

    iget v6, v5, La0/q0;->b:I

    if-ge v3, v6, :cond_8

    iget-object v5, v5, La0/q0;->a:[Ljava/lang/Object;

    aget-object v6, v5, v3

    aput-object v1, v5, v3

    if-eqz v4, :cond_7

    invoke-interface {v4}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_7
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_8
    invoke-virtual {v5, v3}, La0/q0;->m(I)V

    throw v1

    :cond_9
    iget-object v3, p0, Landroidx/compose/ui/platform/AndroidComposeView;->V0:La0/q0;

    invoke-virtual {v3, v2, v0}, La0/q0;->k(II)V

    goto :goto_4

    :cond_a
    return-void
.end method

.method public final B(La3/n0;)V
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->S:Lb3/h0;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lb3/h0;->A:Z

    invoke-virtual {v0}, Lb3/h0;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Lb3/h0;->w(La3/n0;)V

    :goto_0
    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->T:Ld2/d;

    iput-boolean v1, p1, Ld2/d;->G:Z

    invoke-virtual {p1}, Ld2/d;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p1, Ld2/d;->H:Ldc3/h;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-interface {p1, v0}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public final C(La3/n0;ZZZ)V
    .locals 4

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->r0:La3/e1;

    if-eqz p2, :cond_b

    iget-object p2, v0, La3/e1;->b:La3/p;

    iget-object v1, p1, La3/n0;->G:La3/n0;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope"

    invoke-static {v1}, Lx2/a;->b(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p1}, La3/n0;->v()La3/h0;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_a

    if-eq v1, v2, :cond_c

    const/4 v3, 0x2

    if-eq v1, v3, :cond_a

    const/4 v3, 0x3

    if-eq v1, v3, :cond_a

    const/4 v3, 0x4

    if-ne v1, v3, :cond_9

    invoke-virtual {p1}, La3/n0;->x()Z

    move-result v1

    if-eqz v1, :cond_1

    if-nez p3, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {p1}, La3/n0;->g0()V

    invoke-virtual {p1}, La3/n0;->h0()V

    iget-boolean p3, p1, La3/n0;->o0:Z

    if-eqz p3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, La3/n0;->a0()Ljava/lang/Boolean;

    move-result-object p3

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_3

    invoke-static {p1}, La3/e1;->h(La3/n0;)Z

    move-result p3

    if-eqz p3, :cond_4

    :cond_3
    invoke-virtual {p1}, La3/n0;->G()La3/n0;

    move-result-object p3

    if-eqz p3, :cond_7

    invoke-virtual {p3}, La3/n0;->x()Z

    move-result p3

    if-ne p3, v2, :cond_7

    :cond_4
    invoke-virtual {p1}, La3/n0;->Y()Z

    move-result p3

    if-nez p3, :cond_5

    invoke-static {p1}, La3/e1;->i(La3/n0;)Z

    move-result p3

    if-eqz p3, :cond_8

    :cond_5
    invoke-virtual {p1}, La3/n0;->G()La3/n0;

    move-result-object p3

    if-eqz p3, :cond_6

    invoke-virtual {p3}, La3/n0;->A()Z

    move-result p3

    if-ne p3, v2, :cond_6

    goto :goto_1

    :cond_6
    sget-object p3, La3/y;->y:La3/y;

    invoke-virtual {p2, p1, p3}, La3/p;->b(La3/n0;La3/y;)V

    goto :goto_1

    :cond_7
    sget-object p3, La3/y;->w:La3/y;

    invoke-virtual {p2, p1, p3}, La3/p;->b(La3/n0;La3/y;)V

    :cond_8
    :goto_1
    iget-boolean p2, v0, La3/e1;->d:Z

    if-nez p2, :cond_c

    if-eqz p4, :cond_c

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->I(La3/n0;)V

    return-void

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_a
    iget-object p2, v0, La3/e1;->h:Lr1/c;

    new-instance p4, La3/d1;

    invoke-direct {p4, p1, v2, p3}, La3/d1;-><init>(La3/n0;ZZ)V

    invoke-virtual {p2, p4}, Lr1/c;->b(Ljava/lang/Object;)V

    return-void

    :cond_b
    invoke-virtual {v0, p1, p3}, La3/e1;->p(La3/n0;Z)Z

    move-result p2

    if-eqz p2, :cond_c

    if-eqz p4, :cond_c

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->I(La3/n0;)V

    :cond_c
    :goto_2
    return-void
.end method

.method public final D(La3/n0;ZZ)V
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x4

    const/4 v2, 0x3

    const/4 v3, 0x2

    iget-object v4, p0, Landroidx/compose/ui/platform/AndroidComposeView;->r0:La3/e1;

    const/4 v5, 0x1

    if-eqz p2, :cond_b

    iget-object p2, v4, La3/e1;->b:La3/p;

    invoke-virtual {p1}, La3/n0;->v()La3/h0;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    if-eqz v6, :cond_1

    if-eq v6, v5, :cond_13

    if-eq v6, v3, :cond_1

    if-eq v6, v2, :cond_13

    if-ne v6, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p1}, La3/n0;->x()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p1}, La3/n0;->w()Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_2
    if-nez p3, :cond_3

    goto/16 :goto_6

    :cond_3
    invoke-virtual {p1}, La3/n0;->f0()V

    invoke-virtual {p1}, La3/n0;->e0()V

    iget-boolean p3, p1, La3/n0;->o0:Z

    if-eqz p3, :cond_4

    goto/16 :goto_6

    :cond_4
    invoke-virtual {p1}, La3/n0;->G()La3/n0;

    move-result-object p3

    invoke-virtual {p1}, La3/n0;->a0()Ljava/lang/Boolean;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    if-eqz p3, :cond_5

    invoke-virtual {p3}, La3/n0;->x()Z

    move-result v1

    if-ne v1, v5, :cond_5

    goto :goto_1

    :cond_5
    if-eqz p3, :cond_6

    invoke-virtual {p3}, La3/n0;->w()Z

    move-result v1

    if-ne v1, v5, :cond_6

    goto :goto_1

    :cond_6
    sget-object p3, La3/y;->x:La3/y;

    invoke-virtual {p2, p1, p3}, La3/p;->b(La3/n0;La3/y;)V

    goto :goto_2

    :cond_7
    :goto_1
    invoke-virtual {p1}, La3/n0;->Y()Z

    move-result v1

    if-eqz v1, :cond_a

    if-eqz p3, :cond_8

    invoke-virtual {p3}, La3/n0;->u()Z

    move-result v1

    if-ne v1, v5, :cond_8

    goto :goto_2

    :cond_8
    if-eqz p3, :cond_9

    invoke-virtual {p3}, La3/n0;->A()Z

    move-result p3

    if-ne p3, v5, :cond_9

    goto :goto_2

    :cond_9
    sget-object p3, La3/y;->z:La3/y;

    invoke-virtual {p2, p1, p3}, La3/p;->b(La3/n0;La3/y;)V

    :cond_a
    :goto_2
    iget-boolean p1, v4, La3/e1;->d:Z

    if-nez p1, :cond_13

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->I(La3/n0;)V

    return-void

    :cond_b
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, La3/n0;->v()La3/h0;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    if-eqz p2, :cond_13

    if-eq p2, v5, :cond_13

    if-eq p2, v3, :cond_13

    if-eq p2, v2, :cond_13

    if-ne p2, v1, :cond_12

    invoke-virtual {p1}, La3/n0;->G()La3/n0;

    move-result-object p2

    if-eqz p2, :cond_d

    invoke-virtual {p2}, La3/n0;->Y()Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_3

    :cond_c
    const/4 v1, 0x0

    goto :goto_4

    :cond_d
    :goto_3
    move v1, v5

    :goto_4
    if-nez p3, :cond_e

    invoke-virtual {p1}, La3/n0;->A()Z

    move-result p3

    if-nez p3, :cond_13

    invoke-virtual {p1}, La3/n0;->u()Z

    move-result p3

    if-eqz p3, :cond_e

    invoke-virtual {p1}, La3/n0;->Y()Z

    move-result p3

    if-ne p3, v1, :cond_e

    invoke-virtual {p1}, La3/n0;->Y()Z

    move-result p3

    invoke-virtual {p1}, La3/n0;->Z()Z

    move-result v2

    if-ne p3, v2, :cond_e

    goto :goto_6

    :cond_e
    invoke-virtual {p1}, La3/n0;->e0()V

    iget-boolean p3, p1, La3/n0;->o0:Z

    if-eqz p3, :cond_f

    goto :goto_6

    :cond_f
    invoke-virtual {p1}, La3/n0;->Z()Z

    move-result p3

    if-eqz p3, :cond_13

    if-eqz v1, :cond_13

    if-eqz p2, :cond_10

    invoke-virtual {p2}, La3/n0;->u()Z

    move-result p3

    if-ne p3, v5, :cond_10

    goto :goto_5

    :cond_10
    if-eqz p2, :cond_11

    invoke-virtual {p2}, La3/n0;->A()Z

    move-result p2

    if-ne p2, v5, :cond_11

    goto :goto_5

    :cond_11
    iget-object p2, v4, La3/e1;->b:La3/p;

    sget-object p3, La3/y;->z:La3/y;

    invoke-virtual {p2, p1, p3}, La3/p;->b(La3/n0;La3/y;)V

    :goto_5
    iget-boolean p1, v4, La3/e1;->d:Z

    if-nez p1, :cond_13

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->I(La3/n0;)V

    return-void

    :cond_12
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_13
    :goto_6
    return-void
.end method

.method public final E()V
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->S:Lb3/h0;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lb3/h0;->A:Z

    invoke-virtual {v0}, Lb3/h0;->v()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-boolean v2, v0, Lb3/h0;->L:Z

    if-nez v2, :cond_0

    iput-boolean v1, v0, Lb3/h0;->L:Z

    iget-object v2, v0, Lb3/h0;->l:Landroid/os/Handler;

    iget-object v0, v0, Lb3/h0;->N:Landroidx/lifecycle/z0;

    invoke-virtual {v2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->T:Ld2/d;

    iput-boolean v1, v0, Ld2/d;->G:Z

    invoke-virtual {v0}, Ld2/d;->e()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-boolean v2, v0, Ld2/d;->N:Z

    if-nez v2, :cond_1

    iput-boolean v1, v0, Ld2/d;->N:Z

    iget-object v1, v0, Ld2/d;->I:Landroid/os/Handler;

    iget-object v0, v0, Ld2/d;->O:Landroidx/lifecycle/z0;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method

.method public final F()V
    .locals 6

    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->y0:Z

    if-nez v0, :cond_1

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->x0:J

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    iput-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->x0:J

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->c1:Lb3/o1;

    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->v0:[F

    invoke-interface {v0, p0, v1}, Lb3/o1;->h(Landroid/view/View;[F)V

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->w0:[F

    invoke-static {v1, v0}, Lb3/o0;->m([F[F)Z

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    move-object v1, p0

    :goto_0
    instance-of v2, v0, Landroid/view/ViewGroup;

    if-eqz v2, :cond_0

    move-object v1, v0

    check-cast v1, Landroid/view/View;

    move-object v0, v1

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->t0:[I

    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 v2, 0x0

    aget v3, v0, v2

    int-to-float v3, v3

    const/4 v4, 0x1

    aget v5, v0, v4

    int-to-float v5, v5

    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    aget v1, v0, v2

    int-to-float v1, v1

    aget v0, v0, v4

    int-to-float v0, v0

    sub-float/2addr v3, v1

    sub-float/2addr v5, v0

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    const/16 v4, 0x20

    shl-long/2addr v0, v4

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    iput-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->z0:J

    :cond_1
    return-void
.end method

.method public final G(Landroid/view/MotionEvent;)V
    .locals 9

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->x0:J

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->c1:Lb3/o1;

    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->v0:[F

    invoke-interface {v0, p0, v1}, Lb3/o1;->h(Landroid/view/View;[F)V

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->w0:[F

    invoke-static {v1, v0}, Lb3/o0;->m([F[F)Z

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v3, v0

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v5, v0

    const/16 v0, 0x20

    shl-long v2, v3, v0

    const-wide v7, 0xffffffffL

    and-long v4, v5, v7

    or-long/2addr v2, v4

    invoke-static {v2, v3, v1}, Li2/l0;->b(J[F)J

    move-result-wide v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v3

    shr-long v4, v1, v0

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    sub-float/2addr v3, v4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    and-long/2addr v1, v7

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    sub-float/2addr p1, v1

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v3, p1

    shl-long v0, v1, v0

    and-long v2, v3, v7

    or-long/2addr v0, v2

    iput-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->z0:J

    return-void
.end method

.method public final H()Z
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x82

    const/4 v1, 0x0

    invoke-super {p0, v0, v1}, Landroid/view/ViewGroup;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result v0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final I(La3/n0;)V
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_5

    if-eqz p1, :cond_2

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, La3/n0;->B()La3/j0;

    move-result-object v0

    sget-object v1, La3/j0;->w:La3/j0;

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->q0:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, La3/n0;->G()La3/n0;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, v0, La3/n0;->e0:La3/l1;

    iget-object v0, v0, La3/l1;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/node/a;

    iget-wide v0, v0, Ly2/j1;->z:J

    invoke-static {v0, v1}, Ly3/a;->g(J)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v0, v1}, Ly3/a;->f(J)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, La3/n0;->G()La3/n0;

    move-result-object p1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La3/n0;

    move-result-object v0

    if-ne p1, v0, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p1

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void

    :cond_4
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_5
    return-void
.end method

.method public final K(J)J
    .locals 6

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->F()V

    const/16 v0, 0x20

    shr-long v1, p1, v0

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    iget-wide v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->z0:J

    shr-long/2addr v2, v0

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    sub-float/2addr v1, v2

    const-wide v2, 0xffffffffL

    and-long/2addr p1, v2

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    iget-wide v4, p0, Landroidx/compose/ui/platform/AndroidComposeView;->z0:J

    and-long/2addr v4, v2

    long-to-int p2, v4

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    sub-float/2addr p1, p2

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    int-to-long v4, p2

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long p1, p1

    shl-long v0, v4, v0

    and-long/2addr p1, v2

    or-long/2addr p1, v0

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->w0:[F

    invoke-static {p1, p2, v0}, Li2/l0;->b(J[F)J

    move-result-wide p1

    return-wide p1
.end method

.method public final L(Landroid/view/MotionEvent;)I
    .locals 7

    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->d1:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->d1:Z

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getMetaState()I

    move-result v0

    iget-object v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->J:Lb3/n2;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lb3/n3;->a:Lp1/k1;

    invoke-static {}, Lio/sentry/config/a;->B()Lp1/k1;

    move-result-object v2

    new-instance v3, Lu2/z;

    invoke-direct {v3, v0}, Lu2/z;-><init>(I)V

    invoke-virtual {v2, v3}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->e0:Lu2/g;

    invoke-virtual {v0, p1, p0}, Lu2/g;->a(Landroid/view/MotionEvent;Landroidx/compose/ui/platform/AndroidComposeView;)Lso/q;

    move-result-object v2

    iget-object v3, p0, Landroidx/compose/ui/platform/AndroidComposeView;->f0:Ll2/a;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Lso/q;->e()Ljava/util/List;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-ltz v4, :cond_3

    :goto_0
    add-int/lit8 v5, v4, -0x1

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Lu2/t;

    invoke-virtual {v6}, Lu2/t;->a()Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_2

    :cond_1
    if-gez v5, :cond_2

    goto :goto_1

    :cond_2
    move v4, v5

    goto :goto_0

    :cond_3
    :goto_1
    const/4 v4, 0x0

    :goto_2
    check-cast v4, Lu2/t;

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lu2/t;->e()J

    move-result-wide v4

    iput-wide v4, p0, Landroidx/compose/ui/platform/AndroidComposeView;->w:J

    :cond_4
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->r(Landroid/view/MotionEvent;)Z

    move-result v1

    invoke-virtual {v3, v2, p0, v1}, Ll2/a;->a(Lso/q;Landroidx/compose/ui/platform/AndroidComposeView;Z)I

    move-result v1

    invoke-virtual {v2}, Lso/q;->g()V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    if-eqz v2, :cond_5

    const/4 v3, 0x5

    if-ne v2, v3, :cond_6

    :cond_5
    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_7

    :cond_6
    return v1

    :cond_7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iget-object v2, v0, Lu2/g;->c:Landroid/util/SparseBooleanArray;

    invoke-virtual {v2, p1}, Landroid/util/SparseBooleanArray;->delete(I)V

    iget-object v0, v0, Lu2/g;->b:Landroid/util/SparseLongArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseLongArray;->delete(I)V

    return v1

    :cond_8
    iget-boolean p1, v3, Ll2/a;->a:Z

    if-nez p1, :cond_9

    iget-object p1, v3, Ll2/a;->d:Ljava/lang/Object;

    check-cast p1, Lbu/c;

    iget-object p1, p1, Lbu/c;->w:Ljava/lang/Object;

    check-cast p1, La0/y;

    invoke-virtual {p1}, La0/y;->a()V

    iget-object p1, v3, Ll2/a;->c:Ljava/lang/Object;

    check-cast p1, Lu2/d;

    invoke-virtual {p1}, Lu2/d;->c()V

    :cond_9
    invoke-static {v1, v1, v1}, Lu2/d0;->a(ZZZ)I

    move-result p1

    return p1
.end method

.method public final M(Landroid/view/MotionEvent;IJZ)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v5, p2

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    const/4 v3, -0x1

    const/4 v6, 0x1

    if-eq v2, v6, :cond_1

    const/4 v7, 0x6

    if-eq v2, v7, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v3

    goto :goto_0

    :cond_1
    const/16 v2, 0x9

    if-eq v5, v2, :cond_2

    const/16 v2, 0xa

    if-eq v5, v2, :cond_2

    const/4 v3, 0x0

    :cond_2
    :goto_0
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v2

    if-ltz v3, :cond_3

    move v7, v6

    goto :goto_1

    :cond_3
    const/4 v7, 0x0

    :goto_1
    sub-int/2addr v2, v7

    if-nez v2, :cond_4

    return-void

    :cond_4
    new-array v7, v2, [Landroid/view/MotionEvent$PointerProperties;

    const/4 v8, 0x0

    :goto_2
    if-ge v8, v2, :cond_5

    new-instance v9, Landroid/view/MotionEvent$PointerProperties;

    invoke-direct {v9}, Landroid/view/MotionEvent$PointerProperties;-><init>()V

    aput-object v9, v7, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_5
    new-array v8, v2, [Landroid/view/MotionEvent$PointerCoords;

    const/4 v9, 0x0

    :goto_3
    if-ge v9, v2, :cond_6

    new-instance v10, Landroid/view/MotionEvent$PointerCoords;

    invoke-direct {v10}, Landroid/view/MotionEvent$PointerCoords;-><init>()V

    aput-object v10, v8, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_6
    const/4 v9, 0x0

    :goto_4
    if-ge v9, v2, :cond_9

    if-ltz v3, :cond_8

    if-ge v9, v3, :cond_7

    goto :goto_5

    :cond_7
    move v10, v6

    goto :goto_6

    :cond_8
    :goto_5
    const/4 v10, 0x0

    :goto_6
    add-int/2addr v10, v9

    aget-object v11, v7, v9

    invoke-virtual {v1, v10, v11}, Landroid/view/MotionEvent;->getPointerProperties(ILandroid/view/MotionEvent$PointerProperties;)V

    aget-object v11, v8, v9

    invoke-virtual {v1, v10, v11}, Landroid/view/MotionEvent;->getPointerCoords(ILandroid/view/MotionEvent$PointerCoords;)V

    iget v10, v11, Landroid/view/MotionEvent$PointerCoords;->x:F

    iget v12, v11, Landroid/view/MotionEvent$PointerCoords;->y:F

    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v10

    int-to-long v13, v10

    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v10

    int-to-long v4, v10

    const/16 v10, 0x20

    shl-long/2addr v13, v10

    const-wide v15, 0xffffffffL

    and-long/2addr v4, v15

    or-long/2addr v4, v13

    invoke-virtual {v0, v4, v5}, Landroidx/compose/ui/platform/AndroidComposeView;->v(J)J

    move-result-wide v4

    shr-long v13, v4, v10

    long-to-int v10, v13

    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v10

    iput v10, v11, Landroid/view/MotionEvent$PointerCoords;->x:F

    and-long/2addr v4, v15

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    iput v4, v11, Landroid/view/MotionEvent$PointerCoords;->y:F

    add-int/lit8 v9, v9, 0x1

    move/from16 v5, p2

    goto :goto_4

    :cond_9
    if-eqz p5, :cond_a

    const/4 v10, 0x0

    goto :goto_7

    :cond_a
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v4

    move v10, v4

    :goto_7
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getDownTime()J

    move-result-wide v3

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v11

    cmp-long v3, v3, v11

    if-nez v3, :cond_b

    move-wide/from16 v3, p3

    goto :goto_8

    :cond_b
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getDownTime()J

    move-result-wide v3

    :goto_8
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getMetaState()I

    move-result v9

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getXPrecision()F

    move-result v11

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getYPrecision()F

    move-result v12

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getDeviceId()I

    move-result v13

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEdgeFlags()I

    move-result v14

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getSource()I

    move-result v15

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getFlags()I

    move-result v16

    move/from16 v5, p2

    move v6, v2

    move-wide v1, v3

    move-wide/from16 v3, p3

    invoke-static/range {v1 .. v16}, Landroid/view/MotionEvent;->obtain(JJII[Landroid/view/MotionEvent$PointerProperties;[Landroid/view/MotionEvent$PointerCoords;IIFFIIII)Landroid/view/MotionEvent;

    move-result-object v1

    iget-object v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->e0:Lu2/g;

    invoke-virtual {v2, v1, v0}, Lu2/g;->a(Landroid/view/MotionEvent;Landroidx/compose/ui/platform/AndroidComposeView;)Lso/q;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v3, v0, Landroidx/compose/ui/platform/AndroidComposeView;->f0:Ll2/a;

    const/4 v4, 0x1

    invoke-virtual {v3, v2, v0, v4}, Ll2/a;->a(Lso/q;Landroidx/compose/ui/platform/AndroidComposeView;Z)I

    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    return-void
.end method

.method public final N(Lc93/m;Ls83/c;)V
    .locals 5

    instance-of v0, p2, Lb3/z;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lb3/z;

    iget v1, v0, Lb3/z;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lb3/z;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lb3/z;

    invoke-direct {v0, p0, p2}, Lb3/z;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lb3/z;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lb3/z;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, La0/a1;

    const/4 v2, 0x7

    invoke-direct {p2, p0, v2}, La0/a1;-><init>(Ljava/lang/Object;I)V

    iput v3, v0, Lb3/z;->y:I

    new-instance v2, Lb2/y;

    const/4 v3, 0x0

    iget-object v4, p0, Landroidx/compose/ui/platform/AndroidComposeView;->I0:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v2, p2, v4, p1, v3}, Lb2/y;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/concurrent/atomic/AtomicReference;Lc93/m;Lq83/d;)V

    invoke-static {v2, v0}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-void

    :cond_3
    :goto_1
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public final O()V
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/ui/platform/AndroidComposeView;->t0:[I

    invoke-virtual {v0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-wide v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->s0:J

    const/16 v4, 0x20

    shr-long v5, v2, v4

    long-to-int v5, v5

    const-wide v6, 0xffffffffL

    and-long/2addr v2, v6

    long-to-int v2, v2

    const/4 v3, 0x0

    aget v8, v1, v3

    const/4 v9, 0x1

    if-ne v5, v8, :cond_0

    aget v10, v1, v9

    if-ne v2, v10, :cond_0

    iget-wide v10, v0, Landroidx/compose/ui/platform/AndroidComposeView;->x0:J

    const-wide/16 v12, 0x0

    cmp-long v10, v10, v12

    if-gez v10, :cond_1

    :cond_0
    aget v1, v1, v9

    int-to-long v10, v8

    shl-long/2addr v10, v4

    int-to-long v12, v1

    and-long/2addr v12, v6

    or-long/2addr v10, v12

    iput-wide v10, v0, Landroidx/compose/ui/platform/AndroidComposeView;->s0:J

    const v1, 0x7fffffff

    if-eq v5, v1, :cond_1

    if-eq v2, v1, :cond_1

    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La3/n0;

    move-result-object v1

    invoke-virtual {v1}, La3/n0;->t()La3/r0;

    move-result-object v1

    iget-object v1, v1, La3/r0;->p:La3/g1;

    invoke-virtual {v1}, La3/g1;->H0()V

    move v1, v9

    goto :goto_0

    :cond_1
    move v1, v3

    :goto_0
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->F()V

    iget-object v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->f1:Landroid/view/View;

    if-nez v2, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v2

    iput-object v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->f1:Landroid/view/View;

    :cond_2
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRectManager()Lj3/b;

    move-result-object v5

    iget-wide v10, v0, Landroidx/compose/ui/platform/AndroidComposeView;->s0:J

    iget-wide v12, v0, Landroidx/compose/ui/platform/AndroidComposeView;->z0:J

    invoke-static {v12, v13}, Lvo/b;->C(J)J

    move-result-wide v12

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v8

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v14, v0, Landroidx/compose/ui/platform/AndroidComposeView;->v0:[F

    invoke-static {v14}, Ljc/x;->d([F)I

    move-result v15

    iget-object v3, v5, Lj3/b;->b:Lj3/e;

    and-int/lit8 v15, v15, 0x2

    if-nez v15, :cond_3

    :goto_1
    move-wide/from16 v16, v6

    goto :goto_2

    :cond_3
    const/4 v14, 0x0

    goto :goto_1

    :goto_2
    iget-wide v6, v3, Lj3/e;->d:J

    invoke-static {v12, v13, v6, v7}, Ly3/j;->b(JJ)Z

    move-result v6

    if-nez v6, :cond_4

    iput-wide v12, v3, Lj3/e;->d:J

    move v6, v9

    goto :goto_3

    :cond_4
    const/4 v6, 0x0

    :goto_3
    iget-wide v12, v3, Lj3/e;->e:J

    invoke-static {v10, v11, v12, v13}, Ly3/j;->b(JJ)Z

    move-result v7

    if-nez v7, :cond_5

    iput-wide v10, v3, Lj3/e;->e:J

    move v6, v9

    :cond_5
    if-eqz v14, :cond_6

    iput-object v14, v3, Lj3/e;->g:[F

    move v6, v9

    :cond_6
    int-to-long v7, v8

    shl-long/2addr v7, v4

    int-to-long v10, v2

    and-long v10, v10, v16

    or-long/2addr v7, v10

    iget-wide v10, v3, Lj3/e;->f:J

    cmp-long v2, v7, v10

    if-eqz v2, :cond_7

    iput-wide v7, v3, Lj3/e;->f:J

    move v6, v9

    :cond_7
    if-nez v6, :cond_9

    iget-boolean v2, v5, Lj3/b;->e:Z

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    const/4 v3, 0x0

    goto :goto_5

    :cond_9
    :goto_4
    move v3, v9

    :goto_5
    iput-boolean v3, v5, Lj3/b;->e:Z

    iget-object v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->r0:La3/e1;

    invoke-virtual {v2, v1}, La3/e1;->a(Z)V

    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRectManager()Lj3/b;

    move-result-object v1

    invoke-virtual {v1}, Lj3/b;->b()V

    return-void
.end method

.method public final P(F)V
    .locals 2

    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->F:Z

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    cmpl-float v1, p1, v0

    if-lez v1, :cond_1

    iget v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->W0:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->W0:F

    cmpl-float v0, p1, v0

    if-lez v0, :cond_3

    :cond_0
    iput p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->W0:F

    return-void

    :cond_1
    cmpg-float v0, p1, v0

    if-gez v0, :cond_3

    iget v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->X0:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_2

    iget v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->X0:F

    cmpg-float v0, p1, v0

    if-gez v0, :cond_3

    :cond_2
    iput p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->X0:F

    :cond_3
    return-void
.end method

.method public final addView(Landroid/view/View;)V
    .locals 1

    const/4 v0, -0x1

    .line 1
    invoke-virtual {p0, p1, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public final addView(Landroid/view/View;I)V
    .locals 2

    .line 2
    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    :cond_0
    const/4 v1, 0x1

    .line 3
    invoke-virtual {p0, p1, p2, v0, v1}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z

    return-void
.end method

.method public final addView(Landroid/view/View;II)V
    .locals 1

    .line 4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 5
    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 6
    iput p3, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    const/4 p2, 0x1

    const/4 p3, -0x1

    .line 7
    invoke-virtual {p0, p1, p3, v0, p2}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z

    return-void
.end method

.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, p1, p2, p3, v0}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z

    return-void
.end method

.method public final addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    const/4 v0, -0x1

    const/4 v1, 0x1

    .line 9
    invoke-virtual {p0, p1, v0, p2, v1}, Landroid/view/ViewGroup;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)Z

    return-void
.end method

.method public final autofill(Landroid/util/SparseArray;)V
    .locals 6

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->i0:Lc2/d;

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_5

    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/autofill/AutofillValue;

    invoke-static {v4}, Lc2/i;->e(Landroid/view/autofill/AutofillValue;)Z

    move-result v5

    if-eqz v5, :cond_1

    iget-object v5, v0, Lc2/d;->b:Li3/r;

    iget-object v5, v5, Li3/r;->c:La0/s;

    invoke-virtual {v5, v3}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La3/n0;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, La3/n0;->I()Li3/l;

    move-result-object v3

    if-eqz v3, :cond_4

    sget-object v5, Li3/k;->g:Li3/y;

    iget-object v3, v3, Li3/l;->w:La0/v0;

    invoke-virtual {v3, v5}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_0

    const/4 v3, 0x0

    :cond_0
    check-cast v3, Li3/a;

    if-eqz v3, :cond_4

    iget-object v3, v3, Li3/a;->b:Ll83/e;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    if-eqz v3, :cond_4

    new-instance v5, Ll3/g;

    invoke-static {v4}, Lc2/i;->h(Landroid/view/autofill/AutofillValue;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v5, v4}, Ll3/g;-><init>(Ljava/lang/String;)V

    invoke-interface {v3, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    goto :goto_1

    :cond_1
    invoke-static {v4}, Lc2/i;->c(Landroid/view/autofill/AutofillValue;)Z

    move-result v3

    const-string v5, "ComposeAutofillManager"

    if-eqz v3, :cond_2

    const-string v3, "Auto filling Date fields is not yet supported."

    invoke-static {v5, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_2
    invoke-static {v4}, Lc2/i;->d(Landroid/view/autofill/AutofillValue;)Z

    move-result v3

    if-eqz v3, :cond_3

    const-string v3, "Auto filling dropdown lists is not yet supported."

    invoke-static {v5, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_3
    invoke-static {v4}, Lc2/i;->f(Landroid/view/autofill/AutofillValue;)Z

    move-result v3

    if-eqz v3, :cond_4

    const-string v3, "Auto filling toggle fields are not yet supported."

    invoke-static {v5, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->h0:Lc2/a;

    if-eqz v0, :cond_6

    invoke-static {v0, p1}, Lx43/j;->R(Lc2/a;Landroid/util/SparseArray;)V

    :cond_6
    return-void
.end method

.method public final canScrollHorizontally(I)Z
    .locals 4

    const/4 v0, 0x0

    iget-wide v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->w:J

    iget-object v3, p0, Landroidx/compose/ui/platform/AndroidComposeView;->S:Lb3/h0;

    invoke-virtual {v3, p1, v1, v2, v0}, Lb3/h0;->m(IJZ)Z

    move-result p1

    return p1
.end method

.method public final canScrollVertically(I)Z
    .locals 4

    const/4 v0, 0x1

    iget-wide v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->w:J

    iget-object v3, p0, Landroidx/compose/ui/platform/AndroidComposeView;->S:Lb3/h0;

    invoke-virtual {v3, p1, v1, v2, v0}, Lb3/h0;->m(IJZ)Z

    move-result p1

    return p1
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 6

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La3/n0;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->o(La3/n0;)V

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->w(Z)V

    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v1

    invoke-virtual {v1}, Lz1/f;->m()V

    iput-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->c0:Z

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->K:Li2/w;

    iget-object v1, v0, Li2/w;->a:Li2/c;

    iget-object v2, v1, Li2/c;->a:Landroid/graphics/Canvas;

    iput-object p1, v1, Li2/c;->a:Landroid/graphics/Canvas;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La3/n0;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v1, v4}, La3/n0;->k(Li2/v;Ll2/c;)V

    iget-object v0, v0, Li2/w;->a:Li2/c;

    iput-object v2, v0, Li2/c;->a:Landroid/graphics/Canvas;

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->a0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La3/a2;

    check-cast v5, Lb3/f2;

    invoke-virtual {v5}, Lb3/f2;->g()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    sget v1, Lb3/l3;->w:I

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iput-boolean v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->c0:Z

    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->b0:Ljava/util/ArrayList;

    if-eqz v1, :cond_2

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    :cond_2
    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->F:Z

    if-eqz v0, :cond_5

    iget v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->W0:F

    invoke-static {p0, v0}, Lb3/j1;->a(Landroid/view/View;F)V

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->E:Landroid/view/View;

    if-eqz v0, :cond_4

    iget v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->X0:F

    invoke-static {v0, v1}, Lb3/j1;->a(Landroid/view/View;F)V

    iget v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->X0:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/view/View;->getDrawingTime()J

    move-result-wide v1

    invoke-virtual {p0, p1, v0, v1, v2}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    :cond_3
    const/high16 p1, 0x7fc00000    # Float.NaN

    iput p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->W0:F

    iput p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->X0:F

    goto :goto_1

    :cond_4
    const-string p1, "frameRateCategoryView"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_5
    :goto_1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRectManager()Lj3/b;

    move-result-object p1

    invoke-virtual {p1}, Lj3/b;->b()V

    return-void
.end method

.method public final dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 13

    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->a1:Z

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Z0:Landroidx/lifecycle/z0;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v3

    if-ne v3, v1, :cond_0

    iput-boolean v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->a1:Z

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/lifecycle/z0;->run()V

    :cond_1
    :goto_0
    invoke-static {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->q(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_40

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_20

    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v3, 0x0

    const/16 v4, 0x10

    const-string v5, "visitAncestors called on an unattached node"

    const/4 v6, 0x1

    if-ne v0, v1, :cond_33

    const/high16 v0, 0x400000

    invoke-virtual {p1, v0}, Landroid/view/InputEvent;->isFromSource(I)Z

    move-result v0

    if-eqz v0, :cond_31

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    const/16 v1, 0x1a

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getAxisValue(I)F

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    invoke-static {v0}, Lvp/c;->T(Landroid/view/ViewConfiguration;)F

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    invoke-static {v0}, Lvp/c;->M(Landroid/view/ViewConfiguration;)F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getDeviceId()I

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lg2/k;

    move-result-object v0

    new-instance v1, La3/z0;

    const/4 v7, 0x2

    invoke-direct {v1, v7, p0, p1}, La3/z0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    check-cast v0, Lg2/l;

    iget-object p1, v0, Lg2/l;->d:Lg2/h;

    iget-boolean p1, p1, Lg2/h;->e:Z

    if-eqz p1, :cond_3

    const-string p1, "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated."

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    return v2

    :cond_3
    iget-object p1, v0, Lg2/l;->c:Lg2/x;

    invoke-static {p1}, Lg2/g;->h(Lg2/x;)Lg2/x;

    move-result-object p1

    if-eqz p1, :cond_10

    iget-object v0, p1, Lb2/v;->w:Lb2/v;

    iget-boolean v0, v0, Lb2/v;->N:Z

    if-nez v0, :cond_4

    invoke-static {v5}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_4
    iget-object v0, p1, Lb2/v;->w:Lb2/v;

    invoke-static {p1}, La3/g;->p(La3/n;)La3/n0;

    move-result-object p1

    :goto_1
    if-eqz p1, :cond_f

    iget-object v7, p1, La3/n0;->e0:La3/l1;

    iget-object v7, v7, La3/l1;->g:Ljava/lang/Object;

    check-cast v7, Lb2/v;

    iget v7, v7, Lb2/v;->z:I

    and-int/lit16 v7, v7, 0x4000

    if-eqz v7, :cond_d

    :goto_2
    if-eqz v0, :cond_d

    iget v7, v0, Lb2/v;->y:I

    and-int/lit16 v7, v7, 0x4000

    if-eqz v7, :cond_c

    move-object v7, v0

    move-object v8, v3

    :goto_3
    if-eqz v7, :cond_c

    instance-of v9, v7, Lw2/a;

    if-eqz v9, :cond_5

    goto :goto_6

    :cond_5
    iget v9, v7, Lb2/v;->y:I

    and-int/lit16 v9, v9, 0x4000

    if-eqz v9, :cond_b

    instance-of v9, v7, La3/o;

    if-eqz v9, :cond_b

    move-object v9, v7

    check-cast v9, La3/o;

    iget-object v9, v9, La3/o;->P:Lb2/v;

    move v10, v2

    :goto_4
    if-eqz v9, :cond_a

    iget v11, v9, Lb2/v;->y:I

    and-int/lit16 v11, v11, 0x4000

    if-eqz v11, :cond_9

    add-int/lit8 v10, v10, 0x1

    if-ne v10, v6, :cond_6

    move-object v7, v9

    goto :goto_5

    :cond_6
    if-nez v8, :cond_7

    new-instance v8, Lr1/c;

    new-array v11, v4, [Lb2/v;

    invoke-direct {v8, v11}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_7
    if-eqz v7, :cond_8

    invoke-virtual {v8, v7}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v7, v3

    :cond_8
    invoke-virtual {v8, v9}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_9
    :goto_5
    iget-object v9, v9, Lb2/v;->F:Lb2/v;

    goto :goto_4

    :cond_a
    if-ne v10, v6, :cond_b

    goto :goto_3

    :cond_b
    invoke-static {v8}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v7

    goto :goto_3

    :cond_c
    iget-object v0, v0, Lb2/v;->E:Lb2/v;

    goto :goto_2

    :cond_d
    invoke-virtual {p1}, La3/n0;->G()La3/n0;

    move-result-object p1

    if-eqz p1, :cond_e

    iget-object v0, p1, La3/n0;->e0:La3/l1;

    if-eqz v0, :cond_e

    iget-object v0, v0, La3/l1;->f:Ljava/lang/Object;

    check-cast v0, La3/l2;

    goto :goto_1

    :cond_e
    move-object v0, v3

    goto :goto_1

    :cond_f
    move-object v7, v3

    :goto_6
    check-cast v7, Lw2/a;

    goto :goto_7

    :cond_10
    move-object v7, v3

    :goto_7
    if-eqz v7, :cond_32

    move-object p1, v7

    check-cast p1, Lb2/v;

    iget-object v0, p1, Lb2/v;->w:Lb2/v;

    iget-boolean v0, v0, Lb2/v;->N:Z

    if-nez v0, :cond_11

    invoke-static {v5}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_11
    iget-object v0, p1, Lb2/v;->w:Lb2/v;

    iget-object v0, v0, Lb2/v;->E:Lb2/v;

    invoke-static {v7}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v5

    move-object v7, v3

    :goto_8
    if-eqz v5, :cond_1d

    iget-object v8, v5, La3/n0;->e0:La3/l1;

    iget-object v8, v8, La3/l1;->g:Ljava/lang/Object;

    check-cast v8, Lb2/v;

    iget v8, v8, Lb2/v;->z:I

    and-int/lit16 v8, v8, 0x4000

    if-eqz v8, :cond_1b

    :goto_9
    if-eqz v0, :cond_1b

    iget v8, v0, Lb2/v;->y:I

    and-int/lit16 v8, v8, 0x4000

    if-eqz v8, :cond_1a

    move-object v8, v0

    move-object v9, v3

    :goto_a
    if-eqz v8, :cond_1a

    instance-of v10, v8, Lw2/a;

    if-eqz v10, :cond_13

    if-nez v7, :cond_12

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    :cond_12
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_13
    iget v10, v8, Lb2/v;->y:I

    and-int/lit16 v10, v10, 0x4000

    if-eqz v10, :cond_19

    instance-of v10, v8, La3/o;

    if-eqz v10, :cond_19

    move-object v10, v8

    check-cast v10, La3/o;

    iget-object v10, v10, La3/o;->P:Lb2/v;

    move v11, v2

    :goto_b
    if-eqz v10, :cond_18

    iget v12, v10, Lb2/v;->y:I

    and-int/lit16 v12, v12, 0x4000

    if-eqz v12, :cond_17

    add-int/lit8 v11, v11, 0x1

    if-ne v11, v6, :cond_14

    move-object v8, v10

    goto :goto_c

    :cond_14
    if-nez v9, :cond_15

    new-instance v9, Lr1/c;

    new-array v12, v4, [Lb2/v;

    invoke-direct {v9, v12}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_15
    if-eqz v8, :cond_16

    invoke-virtual {v9, v8}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v8, v3

    :cond_16
    invoke-virtual {v9, v10}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_17
    :goto_c
    iget-object v10, v10, Lb2/v;->F:Lb2/v;

    goto :goto_b

    :cond_18
    if-ne v11, v6, :cond_19

    goto :goto_a

    :cond_19
    :goto_d
    invoke-static {v9}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v8

    goto :goto_a

    :cond_1a
    iget-object v0, v0, Lb2/v;->E:Lb2/v;

    goto :goto_9

    :cond_1b
    invoke-virtual {v5}, La3/n0;->G()La3/n0;

    move-result-object v5

    if-eqz v5, :cond_1c

    iget-object v0, v5, La3/n0;->e0:La3/l1;

    if-eqz v0, :cond_1c

    iget-object v0, v0, La3/l1;->f:Ljava/lang/Object;

    check-cast v0, La3/l2;

    goto :goto_8

    :cond_1c
    move-object v0, v3

    goto :goto_8

    :cond_1d
    if-eqz v7, :cond_1f

    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1f

    :goto_e
    add-int/lit8 v5, v0, -0x1

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw2/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-gez v5, :cond_1e

    goto :goto_f

    :cond_1e
    move v0, v5

    goto :goto_e

    :cond_1f
    :goto_f
    iget-object v0, p1, Lb2/v;->w:Lb2/v;

    move-object v5, v3

    :goto_10
    if-eqz v0, :cond_27

    instance-of v8, v0, Lw2/a;

    if-eqz v8, :cond_20

    check-cast v0, Lw2/a;

    goto :goto_13

    :cond_20
    iget v8, v0, Lb2/v;->y:I

    and-int/lit16 v8, v8, 0x4000

    if-eqz v8, :cond_26

    instance-of v8, v0, La3/o;

    if-eqz v8, :cond_26

    move-object v8, v0

    check-cast v8, La3/o;

    iget-object v8, v8, La3/o;->P:Lb2/v;

    move v9, v2

    :goto_11
    if-eqz v8, :cond_25

    iget v10, v8, Lb2/v;->y:I

    and-int/lit16 v10, v10, 0x4000

    if-eqz v10, :cond_24

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v6, :cond_21

    move-object v0, v8

    goto :goto_12

    :cond_21
    if-nez v5, :cond_22

    new-instance v5, Lr1/c;

    new-array v10, v4, [Lb2/v;

    invoke-direct {v5, v10}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_22
    if-eqz v0, :cond_23

    invoke-virtual {v5, v0}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v0, v3

    :cond_23
    invoke-virtual {v5, v8}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_24
    :goto_12
    iget-object v8, v8, Lb2/v;->F:Lb2/v;

    goto :goto_11

    :cond_25
    if-ne v9, v6, :cond_26

    goto :goto_10

    :cond_26
    :goto_13
    invoke-static {v5}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v0

    goto :goto_10

    :cond_27
    invoke-virtual {v1}, La3/z0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_28

    goto/16 :goto_19

    :cond_28
    iget-object p1, p1, Lb2/v;->w:Lb2/v;

    move-object v0, v3

    :goto_14
    if-eqz p1, :cond_30

    instance-of v1, p1, Lw2/a;

    if-eqz v1, :cond_29

    check-cast p1, Lw2/a;

    goto :goto_17

    :cond_29
    iget v1, p1, Lb2/v;->y:I

    and-int/lit16 v1, v1, 0x4000

    if-eqz v1, :cond_2f

    instance-of v1, p1, La3/o;

    if-eqz v1, :cond_2f

    move-object v1, p1

    check-cast v1, La3/o;

    iget-object v1, v1, La3/o;->P:Lb2/v;

    move v5, v2

    :goto_15
    if-eqz v1, :cond_2e

    iget v8, v1, Lb2/v;->y:I

    and-int/lit16 v8, v8, 0x4000

    if-eqz v8, :cond_2d

    add-int/lit8 v5, v5, 0x1

    if-ne v5, v6, :cond_2a

    move-object p1, v1

    goto :goto_16

    :cond_2a
    if-nez v0, :cond_2b

    new-instance v0, Lr1/c;

    new-array v8, v4, [Lb2/v;

    invoke-direct {v0, v8}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_2b
    if-eqz p1, :cond_2c

    invoke-virtual {v0, p1}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object p1, v3

    :cond_2c
    invoke-virtual {v0, v1}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_2d
    :goto_16
    iget-object v1, v1, Lb2/v;->F:Lb2/v;

    goto :goto_15

    :cond_2e
    if-ne v5, v6, :cond_2f

    goto :goto_14

    :cond_2f
    :goto_17
    invoke-static {v0}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object p1

    goto :goto_14

    :cond_30
    if-eqz v7, :cond_32

    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result p1

    move v0, v2

    :goto_18
    if-ge v0, p1, :cond_32

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw2/a;

    iget-object v1, v1, Lw2/a;->O:Lb3/r;

    add-int/lit8 v0, v0, 0x1

    goto :goto_18

    :cond_31
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->n(Landroid/view/MotionEvent;)I

    move-result p1

    and-int/2addr p1, v6

    if-eqz p1, :cond_32

    :goto_19
    return v6

    :cond_32
    return v2

    :cond_33
    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Landroid/view/InputEvent;->isFromSource(I)Z

    move-result v0

    if-nez v0, :cond_3f

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lg2/k;

    move-result-object v0

    check-cast v0, Lg2/l;

    iget-object v1, v0, Lg2/l;->d:Lg2/h;

    iget-boolean v1, v1, Lg2/h;->e:Z

    if-eqz v1, :cond_34

    const-string v0, "FocusRelatedWarning: Dispatching indirect touch event while the focus system is invalidated."

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto/16 :goto_1f

    :cond_34
    iget-object v0, v0, Lg2/l;->c:Lg2/x;

    invoke-static {v0}, Lg2/g;->h(Lg2/x;)Lg2/x;

    move-result-object v0

    if-eqz v0, :cond_3f

    iget-object v1, v0, Lb2/v;->w:Lb2/v;

    iget-boolean v1, v1, Lb2/v;->N:Z

    if-nez v1, :cond_35

    invoke-static {v5}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_35
    iget-object v1, v0, Lb2/v;->w:Lb2/v;

    invoke-static {v0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v0

    :goto_1a
    if-eqz v0, :cond_3f

    iget-object v5, v0, La3/n0;->e0:La3/l1;

    iget-object v5, v5, La3/l1;->g:Ljava/lang/Object;

    check-cast v5, Lb2/v;

    iget v5, v5, Lb2/v;->z:I

    const/high16 v7, 0x200000

    and-int/2addr v5, v7

    if-eqz v5, :cond_3d

    :goto_1b
    if-eqz v1, :cond_3d

    iget v5, v1, Lb2/v;->y:I

    and-int/2addr v5, v7

    if-eqz v5, :cond_3c

    move-object v5, v1

    move-object v8, v3

    :goto_1c
    if-eqz v5, :cond_3c

    iget v9, v5, Lb2/v;->y:I

    and-int/2addr v9, v7

    if-eqz v9, :cond_3b

    instance-of v9, v5, La3/o;

    if-eqz v9, :cond_3b

    move-object v9, v5

    check-cast v9, La3/o;

    iget-object v9, v9, La3/o;->P:Lb2/v;

    move v10, v2

    :goto_1d
    if-eqz v9, :cond_3a

    iget v11, v9, Lb2/v;->y:I

    and-int/2addr v11, v7

    if-eqz v11, :cond_39

    add-int/lit8 v10, v10, 0x1

    if-ne v10, v6, :cond_36

    move-object v5, v9

    goto :goto_1e

    :cond_36
    if-nez v8, :cond_37

    new-instance v8, Lr1/c;

    new-array v11, v4, [Lb2/v;

    invoke-direct {v8, v11}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_37
    if-eqz v5, :cond_38

    invoke-virtual {v8, v5}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v5, v3

    :cond_38
    invoke-virtual {v8, v9}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_39
    :goto_1e
    iget-object v9, v9, Lb2/v;->F:Lb2/v;

    goto :goto_1d

    :cond_3a
    if-ne v10, v6, :cond_3b

    goto :goto_1c

    :cond_3b
    invoke-static {v8}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v5

    goto :goto_1c

    :cond_3c
    iget-object v1, v1, Lb2/v;->E:Lb2/v;

    goto :goto_1b

    :cond_3d
    invoke-virtual {v0}, La3/n0;->G()La3/n0;

    move-result-object v0

    if-eqz v0, :cond_3e

    iget-object v1, v0, La3/n0;->e0:La3/l1;

    if-eqz v1, :cond_3e

    iget-object v1, v1, La3/l1;->f:Ljava/lang/Object;

    check-cast v1, La3/l2;

    goto :goto_1a

    :cond_3e
    move-object v1, v3

    goto :goto_1a

    :cond_3f
    :goto_1f
    invoke-super {p0, p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_40
    :goto_20
    invoke-super {p0, p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public final dispatchHoverEvent(Landroid/view/MotionEvent;)Z
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-boolean v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->a1:Z

    iget-object v3, v0, Landroidx/compose/ui/platform/AndroidComposeView;->Z0:Landroidx/lifecycle/z0;

    if-eqz v2, :cond_0

    invoke-virtual {v0, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    invoke-virtual {v3}, Landroidx/lifecycle/z0;->run()V

    :cond_0
    invoke-static {v1}, Landroidx/compose/ui/platform/AndroidComposeView;->q(Landroid/view/MotionEvent;)Z

    move-result v2

    const/4 v4, 0x0

    if-nez v2, :cond_12

    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_5

    :cond_1
    iget-object v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->S:Lb3/h0;

    iget-object v5, v2, Lb3/h0;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    iget-object v6, v2, Lb3/h0;->g:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {v6}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v7

    const/16 v8, 0xa

    const/4 v9, 0x7

    const/4 v10, 0x1

    if-eqz v7, :cond_c

    invoke-virtual {v6}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getAction()I

    move-result v6

    const/16 v7, 0x100

    const/16 v11, 0x80

    const/4 v12, 0x0

    const/16 v13, 0xc

    const/high16 v14, -0x80000000

    if-eq v6, v9, :cond_5

    const/16 v15, 0x9

    if-eq v6, v15, :cond_5

    if-eq v6, v8, :cond_2

    goto/16 :goto_3

    :cond_2
    iget v6, v2, Lb3/h0;->e:I

    if-eq v6, v14, :cond_4

    if-ne v6, v14, :cond_3

    goto/16 :goto_3

    :cond_3
    iput v14, v2, Lb3/h0;->e:I

    invoke-static {v2, v14, v11, v12, v13}, Lb3/h0;->E(Lb3/h0;IILjava/lang/Integer;I)V

    invoke-static {v2, v6, v7, v12, v13}, Lb3/h0;->E(Lb3/h0;IILjava/lang/Integer;I)V

    goto/16 :goto_3

    :cond_4
    invoke-virtual {v5}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui_release()Lb3/h1;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    goto/16 :goto_3

    :cond_5
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    move-result v6

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    move-result v15

    invoke-virtual {v5, v10}, Landroidx/compose/ui/platform/AndroidComposeView;->w(Z)V

    new-instance v20, La3/v;

    invoke-direct/range {v20 .. v20}, La3/v;-><init>()V

    invoke-virtual {v5}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La3/n0;

    move-result-object v14

    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    int-to-long v8, v6

    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    move-wide/from16 v16, v8

    int-to-long v7, v6

    const/16 v6, 0x20

    shl-long v16, v16, v6

    const-wide v18, 0xffffffffL

    and-long v6, v7, v18

    or-long v6, v16, v6

    iget-object v8, v14, La3/n0;->e0:La3/l1;

    iget-object v9, v8, La3/l1;->e:Ljava/lang/Object;

    check-cast v9, Landroidx/compose/ui/node/NodeCoordinator;

    sget-object v14, Landroidx/compose/ui/node/NodeCoordinator;->k0:Li2/x0;

    invoke-virtual {v9, v6, v7}, Landroidx/compose/ui/node/NodeCoordinator;->d1(J)J

    move-result-wide v18

    iget-object v6, v8, La3/l1;->e:Ljava/lang/Object;

    move-object/from16 v16, v6

    check-cast v16, Landroidx/compose/ui/node/NodeCoordinator;

    sget-object v17, Landroidx/compose/ui/node/NodeCoordinator;->o0:La3/e;

    const/16 v21, 0x1

    const/16 v22, 0x1

    invoke-virtual/range {v16 .. v22}, Landroidx/compose/ui/node/NodeCoordinator;->l1(La3/e;JLa3/v;IZ)V

    move-object/from16 v6, v20

    invoke-static {v6}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v7

    :goto_0
    const/4 v8, -0x1

    if-ge v8, v7, :cond_6

    iget-object v8, v6, La3/v;->w:La0/q0;

    invoke-virtual {v8, v7}, La0/q0;->e(I)Ljava/lang/Object;

    move-result-object v8

    const-string v9, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Lb2/v;

    invoke-static {v8}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v8

    invoke-virtual {v5}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui_release()Lb3/h1;

    move-result-object v9

    invoke-virtual {v9}, Lb3/h1;->getLayoutNodeToHolder()Ljava/util/HashMap;

    move-result-object v9

    invoke-virtual {v9, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lb4/l;

    if-eqz v9, :cond_7

    :cond_6
    const/high16 v14, -0x80000000

    goto :goto_2

    :cond_7
    iget-object v9, v8, La3/n0;->e0:La3/l1;

    const/16 v14, 0x8

    invoke-virtual {v9, v14}, La3/l1;->j(I)Z

    move-result v9

    if-nez v9, :cond_8

    goto :goto_1

    :cond_8
    iget v9, v8, La3/n0;->x:I

    invoke-virtual {v2, v9}, Lb3/h0;->A(I)I

    move-result v9

    invoke-static {v8, v4}, Li3/s;->a(La3/n0;Z)Li3/p;

    move-result-object v8

    invoke-static {v8}, Li3/s;->f(Li3/p;)Z

    move-result v14

    if-nez v14, :cond_9

    goto :goto_1

    :cond_9
    invoke-virtual {v8}, Li3/p;->k()Li3/l;

    move-result-object v8

    sget-object v14, Li3/u;->z:Li3/y;

    iget-object v8, v8, Li3/l;->w:La0/v0;

    invoke-virtual {v8, v14}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    :goto_1
    add-int/lit8 v7, v7, -0x1

    goto :goto_0

    :cond_a
    move v14, v9

    :goto_2
    invoke-virtual {v5}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui_release()Lb3/h1;

    move-result-object v5

    invoke-virtual {v5, v1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    iget v5, v2, Lb3/h0;->e:I

    if-ne v5, v14, :cond_b

    goto :goto_3

    :cond_b
    iput v14, v2, Lb3/h0;->e:I

    invoke-static {v2, v14, v11, v12, v13}, Lb3/h0;->E(Lb3/h0;IILjava/lang/Integer;I)V

    const/16 v15, 0x100

    invoke-static {v2, v5, v15, v12, v13}, Lb3/h0;->E(Lb3/h0;IILjava/lang/Integer;I)V

    :cond_c
    :goto_3
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    const/4 v5, 0x7

    if-eq v2, v5, :cond_10

    const/16 v5, 0xa

    if-eq v2, v5, :cond_d

    goto :goto_4

    :cond_d
    invoke-virtual/range {p0 .. p1}, Landroidx/compose/ui/platform/AndroidComposeView;->r(Landroid/view/MotionEvent;)Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-virtual {v1, v4}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v2

    const/4 v5, 0x3

    if-ne v2, v5, :cond_e

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_5

    :cond_e
    iget-object v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->S0:Landroid/view/MotionEvent;

    if-eqz v2, :cond_f

    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    :cond_f
    invoke-static {v1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v1

    iput-object v1, v0, Landroidx/compose/ui/platform/AndroidComposeView;->S0:Landroid/view/MotionEvent;

    iput-boolean v10, v0, Landroidx/compose/ui/platform/AndroidComposeView;->a1:Z

    const-wide/16 v1, 0x8

    invoke-virtual {v0, v3, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return v4

    :cond_10
    invoke-virtual/range {p0 .. p1}, Landroidx/compose/ui/platform/AndroidComposeView;->t(Landroid/view/MotionEvent;)Z

    move-result v2

    if-nez v2, :cond_11

    goto :goto_5

    :cond_11
    :goto_4
    invoke-virtual/range {p0 .. p1}, Landroidx/compose/ui/platform/AndroidComposeView;->n(Landroid/view/MotionEvent;)I

    move-result v1

    and-int/2addr v1, v10

    if-eqz v1, :cond_12

    return v10

    :cond_12
    :goto_5
    return v4
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 4

    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    move-result v0

    iget-object v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->J:Lb3/n2;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lb3/n3;->a:Lp1/k1;

    invoke-static {}, Lio/sentry/config/a;->B()Lp1/k1;

    move-result-object v2

    new-instance v3, Lu2/z;

    invoke-direct {v3, v0}, Lu2/z;-><init>(I)V

    invoke-virtual {v2, v3}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lg2/k;

    move-result-object v0

    sget-object v2, Lg2/j;->w:Lg2/j;

    check-cast v0, Lg2/l;

    invoke-virtual {v0, p1, v2}, Lg2/l;->f(Landroid/view/KeyEvent;Lc93/a;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    return v1

    :cond_2
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lg2/k;

    move-result-object v0

    new-instance v2, La3/z0;

    invoke-direct {v2, v1, p0, p1}, La3/z0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    check-cast v0, Lg2/l;

    invoke-virtual {v0, p1, v2}, Lg2/l;->f(Landroid/view/KeyEvent;Lc93/a;)Z

    move-result p1

    return p1
.end method

.method public final dispatchKeyEventPreIme(Landroid/view/KeyEvent;)Z
    .locals 11

    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_b

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lg2/k;

    move-result-object v0

    check-cast v0, Lg2/l;

    iget-object v3, v0, Lg2/l;->d:Lg2/h;

    iget-boolean v3, v3, Lg2/h;->e:Z

    if-eqz v3, :cond_0

    const-string v0, "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated."

    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    iget-object v0, v0, Lg2/l;->c:Lg2/x;

    invoke-static {v0}, Lg2/g;->h(Lg2/x;)Lg2/x;

    move-result-object v0

    if-eqz v0, :cond_b

    iget-object v3, v0, Lb2/v;->w:Lb2/v;

    iget-boolean v3, v3, Lb2/v;->N:Z

    if-nez v3, :cond_1

    const-string v3, "visitAncestors called on an unattached node"

    invoke-static {v3}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_1
    iget-object v3, v0, Lb2/v;->w:Lb2/v;

    invoke-static {v0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_b

    iget-object v4, v0, La3/n0;->e0:La3/l1;

    iget-object v4, v4, La3/l1;->g:Ljava/lang/Object;

    check-cast v4, Lb2/v;

    iget v4, v4, Lb2/v;->z:I

    const/high16 v5, 0x20000

    and-int/2addr v4, v5

    const/4 v6, 0x0

    if-eqz v4, :cond_9

    :goto_1
    if-eqz v3, :cond_9

    iget v4, v3, Lb2/v;->y:I

    and-int/2addr v4, v5

    if-eqz v4, :cond_8

    move-object v4, v3

    move-object v7, v6

    :goto_2
    if-eqz v4, :cond_8

    iget v8, v4, Lb2/v;->y:I

    and-int/2addr v8, v5

    if-eqz v8, :cond_7

    instance-of v8, v4, La3/o;

    if-eqz v8, :cond_7

    move-object v8, v4

    check-cast v8, La3/o;

    iget-object v8, v8, La3/o;->P:Lb2/v;

    move v9, v1

    :goto_3
    if-eqz v8, :cond_6

    iget v10, v8, Lb2/v;->y:I

    and-int/2addr v10, v5

    if-eqz v10, :cond_5

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v2, :cond_2

    move-object v4, v8

    goto :goto_4

    :cond_2
    if-nez v7, :cond_3

    new-instance v7, Lr1/c;

    const/16 v10, 0x10

    new-array v10, v10, [Lb2/v;

    invoke-direct {v7, v10}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_3
    if-eqz v4, :cond_4

    invoke-virtual {v7, v4}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v4, v6

    :cond_4
    invoke-virtual {v7, v8}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_5
    :goto_4
    iget-object v8, v8, Lb2/v;->F:Lb2/v;

    goto :goto_3

    :cond_6
    if-ne v9, v2, :cond_7

    goto :goto_2

    :cond_7
    invoke-static {v7}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v4

    goto :goto_2

    :cond_8
    iget-object v3, v3, Lb2/v;->E:Lb2/v;

    goto :goto_1

    :cond_9
    invoke-virtual {v0}, La3/n0;->G()La3/n0;

    move-result-object v0

    if-eqz v0, :cond_a

    iget-object v3, v0, La3/n0;->e0:La3/l1;

    if-eqz v3, :cond_a

    iget-object v3, v3, La3/l1;->f:Ljava/lang/Object;

    check-cast v3, La3/l2;

    goto :goto_0

    :cond_a
    move-object v3, v6

    goto :goto_0

    :cond_b
    :goto_5
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEventPreIme(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_c

    return v2

    :cond_c
    return v1
.end method

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->a1:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Z0:Landroidx/lifecycle/z0;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->S0:Landroid/view/MotionEvent;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2}, Landroid/view/MotionEvent;->getSource()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v4

    if-ne v3, v4, :cond_1

    invoke-virtual {v2, v1}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v2

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v3

    if-eq v2, v3, :cond_0

    goto :goto_0

    :cond_0
    iput-boolean v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->a1:Z

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {v0}, Landroidx/lifecycle/z0;->run()V

    :cond_2
    :goto_1
    invoke-static {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->q(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_4

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->t(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->n(Landroid/view/MotionEvent;)I

    move-result p1

    and-int/lit8 v0, p1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_5
    and-int/2addr p1, v2

    if-eqz p1, :cond_6

    return v2

    :cond_6
    :goto_2
    return v1
.end method

.method public final findViewByAccessibilityIdTraversal(I)Landroid/view/View;
    .locals 3

    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    const-class v0, Landroid/view/View;

    const-string v1, "findViewByAccessibilityIdTraversal"

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Landroid/view/View;

    if-eqz v0, :cond_1

    check-cast p1, Landroid/view/View;

    return-object p1

    :cond_0
    invoke-static {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->j(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final focusSearch(Landroid/view/View;I)Landroid/view/View;
    .locals 7

    if-eqz p1, :cond_a

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->r0:La3/e1;

    iget-boolean v0, v0, La3/e1;->c:Z

    if-eqz v0, :cond_0

    goto/16 :goto_5

    :cond_0
    sget-object v0, Lb3/d2;->f:Lat/b;

    invoke-static {}, Ldc/a;->A()Lb3/d2;

    move-result-object v0

    invoke-virtual {v0, p2, p1, p0}, Lb3/d2;->b(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    if-ne p1, p0, :cond_2

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lg2/k;

    move-result-object v1

    check-cast v1, Lg2/l;

    iget-object v1, v1, Lg2/l;->c:Lg2/x;

    invoke-static {v1}, Lg2/g;->h(Lg2/x;)Lg2/x;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, Lg2/g;->k(Lg2/x;)Lh2/c;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_3

    invoke-static {p1, p0}, Ljc/x;->l(Landroid/view/View;Landroidx/compose/ui/platform/AndroidComposeView;)Lh2/c;

    move-result-object v1

    goto :goto_1

    :cond_2
    invoke-static {p1, p0}, Ljc/x;->l(Landroid/view/View;Landroidx/compose/ui/platform/AndroidComposeView;)Lh2/c;

    move-result-object v1

    :cond_3
    :goto_1
    invoke-static {p2}, Ljc/x;->v0(I)Lg2/d;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lg2/d;->d()I

    move-result v2

    goto :goto_2

    :cond_4
    const/4 v2, 0x6

    :goto_2
    new-instance v3, Lkotlin/jvm/internal/g0;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lg2/k;

    move-result-object v4

    new-instance v5, Lb3/t;

    const/4 v6, 0x0

    invoke-direct {v5, v3, v6}, Lb3/t;-><init>(Lkotlin/jvm/internal/g0;I)V

    check-cast v4, Lg2/l;

    invoke-virtual {v4, v2, v1, v5}, Lg2/l;->g(ILh2/c;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    move-result-object v4

    if-nez v4, :cond_5

    goto :goto_3

    :cond_5
    iget-object v4, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-nez v4, :cond_6

    if-nez v0, :cond_9

    :goto_3
    return-object p1

    :cond_6
    if-nez v0, :cond_7

    goto :goto_4

    :cond_7
    invoke-static {v2}, Lg2/g;->v(I)Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_8
    iget-object p1, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p1, Lg2/x;

    invoke-static {p1}, Lg2/g;->k(Lg2/x;)Lh2/c;

    move-result-object p1

    invoke-static {v0, p0}, Ljc/x;->l(Landroid/view/View;Landroidx/compose/ui/platform/AndroidComposeView;)Lh2/c;

    move-result-object p2

    invoke-static {p1, p2, v1, v2}, Lg2/g;->w(Lh2/c;Lh2/c;Lh2/c;I)Z

    move-result p1

    if-eqz p1, :cond_9

    :goto_4
    return-object p0

    :cond_9
    return-object v0

    :cond_a
    :goto_5
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final g(Lc93/m;La3/o1;Ll2/c;)La3/a2;
    .locals 9

    if-eqz p3, :cond_0

    new-instance v0, Lb3/f2;

    const/4 v2, 0x0

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v1, p3

    invoke-direct/range {v0 .. v5}, Lb3/f2;-><init>(Ll2/c;Li2/f0;Landroidx/compose/ui/platform/AndroidComposeView;Lc93/m;Lc93/a;)V

    return-object v0

    :cond_0
    move-object v4, p1

    move-object v5, p2

    :cond_1
    move-object v3, p0

    iget-object p1, v3, Landroidx/compose/ui/platform/AndroidComposeView;->U0:Lwe/o;

    iget-object p2, p1, Lwe/o;->x:Ljava/lang/Object;

    check-cast p2, Ljava/lang/ref/ReferenceQueue;

    iget-object p1, p1, Lwe/o;->w:Ljava/lang/Object;

    check-cast p1, Lr1/c;

    invoke-virtual {p2}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p1, p2}, Lr1/c;->k(Ljava/lang/Object;)Z

    :cond_2
    if-nez p2, :cond_1

    :cond_3
    iget p2, p1, Lr1/c;->y:I

    const/4 p3, 0x0

    if-eqz p2, :cond_4

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {p1, p2}, Lr1/c;->l(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/ref/Reference;

    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_3

    goto :goto_0

    :cond_4
    move-object p2, p3

    :goto_0
    check-cast p2, La3/a2;

    if-eqz p2, :cond_8

    move-object p1, p2

    check-cast p1, Lb3/f2;

    iget-object v0, p1, Lb3/f2;->x:Li2/f0;

    if-eqz v0, :cond_7

    iget-object v1, p1, Lb3/f2;->w:Ll2/c;

    iget-boolean v1, v1, Ll2/c;->s:Z

    if-nez v1, :cond_5

    const-string v1, "layer should have been released before reuse"

    invoke-static {v1}, Lx2/a;->a(Ljava/lang/String;)V

    :cond_5
    invoke-interface {v0}, Li2/f0;->a()Ll2/c;

    move-result-object v0

    iput-object v0, p1, Lb3/f2;->w:Ll2/c;

    const/4 v0, 0x0

    iput-boolean v0, p1, Lb3/f2;->G:Z

    iput-object v4, p1, Lb3/f2;->z:Lc93/m;

    iput-object v5, p1, Lb3/f2;->E:Lc93/a;

    iput-boolean v0, p1, Lb3/f2;->Q:Z

    iput-boolean v0, p1, Lb3/f2;->R:Z

    const/4 v1, 0x1

    iput-boolean v1, p1, Lb3/f2;->S:Z

    iget-object v1, p1, Lb3/f2;->H:[F

    invoke-static {v1}, Li2/l0;->d([F)V

    iget-object v1, p1, Lb3/f2;->I:[F

    if-eqz v1, :cond_6

    invoke-static {v1}, Li2/l0;->d([F)V

    :cond_6
    sget-wide v1, Li2/e1;->b:J

    iput-wide v1, p1, Lb3/f2;->O:J

    iput-boolean v0, p1, Lb3/f2;->T:Z

    const v1, 0x7fffffff

    int-to-long v1, v1

    const/16 v4, 0x20

    shl-long v4, v1, v4

    const-wide v6, 0xffffffffL

    and-long/2addr v1, v6

    or-long/2addr v1, v4

    iput-wide v1, p1, Lb3/f2;->F:J

    iput-object p3, p1, Lb3/f2;->P:Li2/p0;

    iput v0, p1, Lb3/f2;->N:I

    return-object p2

    :cond_7
    const-string p1, "currently reuse is only supported when we manage the layer lifecycle"

    invoke-static {p1}, Lb9/y;->w(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    move-result-object p1

    throw p1

    :cond_8
    new-instance v3, Lb3/f2;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getGraphicsContext()Li2/f0;

    move-result-object p1

    invoke-interface {p1}, Li2/f0;->a()Ll2/c;

    move-result-object p1

    move-object v8, v5

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getGraphicsContext()Li2/f0;

    move-result-object v5

    move-object v6, p0

    move-object v7, v4

    move-object v4, p1

    invoke-direct/range {v3 .. v8}, Lb3/f2;-><init>(Ll2/c;Li2/f0;Landroidx/compose/ui/platform/AndroidComposeView;Lc93/m;Lc93/a;)V

    return-object v3
.end method

.method public bridge synthetic getAccessibilityManager()Lb3/g;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getAccessibilityManager()Lb3/h;

    move-result-object v0

    return-object v0
.end method

.method public getAccessibilityManager()Lb3/h;
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->U:Lb3/h;

    return-object v0
.end method

.method public final getAndroidViewsHandler$ui_release()Lb3/h1;
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->o0:Lb3/h1;

    if-nez v0, :cond_0

    new-instance v0, Lb3/h1;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lb3/h1;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->o0:Lb3/h1;

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->addView(Landroid/view/View;I)V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->o0:Lb3/h1;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0
.end method

.method public getAutofill()Lc2/h;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->h0:Lc2/a;

    return-object v0
.end method

.method public getAutofillManager()Lc2/k;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->i0:Lc2/d;

    return-object v0
.end method

.method public getAutofillTree()Lc2/m;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->W:Lc2/m;

    return-object v0
.end method

.method public getClipboard()Lb3/i;
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->l0:Lb3/i;

    return-object v0
.end method

.method public bridge synthetic getClipboard()Lb3/r1;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getClipboard()Lb3/i;

    move-result-object v0

    return-object v0
.end method

.method public getClipboardManager()Lb3/j;
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->k0:Lb3/j;

    return-object v0
.end method

.method public bridge synthetic getClipboardManager()Lb3/s1;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getClipboardManager()Lb3/j;

    move-result-object v0

    return-object v0
.end method

.method public final getConfigurationChangeObserver()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->g0:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getContentCaptureManager$ui_release()Ld2/d;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->T:Ld2/d;

    return-object v0
.end method

.method public getCoroutineContext()Lq83/j;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->H:Lq83/j;

    return-object v0
.end method

.method public getDensity()Ly3/c;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->z:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/c;

    return-object v0
.end method

.method public getDragAndDropManager()Le2/a;
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->I:Le2/a;

    return-object v0
.end method

.method public bridge synthetic getDragAndDropManager()Le2/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getDragAndDropManager()Le2/a;

    move-result-object v0

    return-object v0
.end method

.method public getEmbeddedViewFocusRect()Lh2/c;
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lg2/k;

    move-result-object v0

    check-cast v0, Lg2/l;

    iget-object v0, v0, Lg2/l;->c:Lg2/x;

    invoke-static {v0}, Lg2/g;->h(Lg2/x;)Lg2/x;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lg2/g;->k(Lg2/x;)Lh2/c;

    move-result-object v0

    return-object v0

    :cond_0
    return-object v1

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0, p0}, Ljc/x;->l(Landroid/view/View;Landroidx/compose/ui/platform/AndroidComposeView;)Lh2/c;

    move-result-object v0

    return-object v0

    :cond_2
    return-object v1
.end method

.method public getFocusOwner()Lg2/k;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->G:Lg2/l;

    return-object v0
.end method

.method public final getFocusedRect(Landroid/graphics/Rect;)V
    .locals 4

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getEmbeddedViewFocusRect()Lh2/c;

    move-result-object v0

    if-eqz v0, :cond_0

    iget v1, v0, Lh2/c;->a:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iput v1, p1, Landroid/graphics/Rect;->left:I

    iget v1, v0, Lh2/c;->b:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iput v1, p1, Landroid/graphics/Rect;->top:I

    iget v1, v0, Lh2/c;->c:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iput v1, p1, Landroid/graphics/Rect;->right:I

    iget v0, v0, Lh2/c;->d:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lg2/k;

    move-result-object v0

    sget-object v1, Lb3/u;->w:Lb3/u;

    check-cast v0, Lg2/l;

    const/4 v2, 0x6

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3, v1}, Lg2/l;->g(ILh2/c;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/high16 v0, -0x80000000

    invoke-virtual {p1, v0, v0, v0, v0}, Landroid/graphics/Rect;->set(IIII)V

    return-void

    :cond_1
    invoke-super {p0, p1}, Landroid/view/View;->getFocusedRect(Landroid/graphics/Rect;)V

    return-void
.end method

.method public getFontFamilyResolver()Lp3/h;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->L0:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp3/h;

    return-object v0
.end method

.method public getFontLoader()Lp3/g;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->K0:Lb3/h2;

    return-object v0
.end method

.method public getGraphicsContext()Li2/f0;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->V:Li2/f;

    return-object v0
.end method

.method public getHapticFeedBack()Lq2/a;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->O0:Lb3/w1;

    return-object v0
.end method

.method public getHasPendingMeasureOrLayout()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->r0:La3/e1;

    iget-object v0, v0, La3/e1;->b:La3/p;

    invoke-virtual {v0}, La3/p;->D()Z

    move-result v0

    return v0
.end method

.method public getImportantForAutofill()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getInputModeManager()Lr2/b;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->P0:Lr2/c;

    return-object v0
.end method

.method public final getInsetsListener()Ly2/q;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->M:Ly2/q;

    return-object v0
.end method

.method public final getLastMatrixRecalculationAnimationTime$ui_release()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->x0:J

    return-wide v0
.end method

.method public getLayoutDirection()Ly3/m;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->N0:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/m;

    return-object v0
.end method

.method public getLayoutNodes()La0/g0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La0/g0;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->O:La0/g0;

    return-object v0
.end method

.method public bridge synthetic getLayoutNodes()La0/s;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getLayoutNodes()La0/g0;

    move-result-object v0

    return-object v0
.end method

.method public getMeasureIteration()J
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->r0:La3/e1;

    iget-boolean v1, v0, La3/e1;->c:Z

    if-nez v1, :cond_0

    const-string v1, "measureIteration should be only used during the measure/layout pass"

    invoke-static {v1}, Lx2/a;->a(Ljava/lang/String;)V

    :cond_0
    iget-wide v0, v0, La3/e1;->g:J

    return-wide v0
.end method

.method public getModifierLocalManager()Lz2/d;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Q0:Lz2/d;

    return-object v0
.end method

.method public bridge synthetic getOutOfFrameExecutor()La3/z1;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getOutOfFrameExecutor()Landroidx/compose/ui/platform/AndroidComposeView;

    move-result-object v0

    return-object v0
.end method

.method public getOutOfFrameExecutor()Landroidx/compose/ui/platform/AndroidComposeView;
    .locals 1

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getPlacementScope()Ly2/i1;
    .locals 2

    sget v0, Ly2/l1;->b:I

    new-instance v0, Ly2/o0;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Ly2/o0;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method public getPointerIconService()Lu2/p;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->g1:Lb3/x;

    return-object v0
.end method

.method public getRectManager()Lj3/b;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->P:Lj3/b;

    return-object v0
.end method

.method public getRoot()La3/n0;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->N:La3/n0;

    return-object v0
.end method

.method public getRootForTest()La3/h2;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->Q:Landroidx/compose/ui/platform/AndroidComposeView;

    return-object v0
.end method

.method public final getScrollCaptureInProgress$ui_release()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->e1:Lh3/j;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lh3/j;->a:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getSemanticsOwner()Li3/r;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->R:Li3/r;

    return-object v0
.end method

.method public getSharedDrawScope()La3/p0;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->y:La3/p0;

    return-object v0
.end method

.method public getShowLayoutBounds()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    sget-object v0, Lb3/i1;->a:Lb3/i1;

    invoke-virtual {v0, p0}, Lb3/i1;->a(Landroid/view/View;)Z

    move-result v0

    return v0

    :cond_0
    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->n0:Z

    return v0
.end method

.method public getSnapshotObserver()La3/c2;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->m0:La3/c2;

    return-object v0
.end method

.method public getSoftwareKeyboardController()Lb3/x2;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->J0:Lb3/x1;

    return-object v0
.end method

.method public getTextInputService()Lq3/z;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->H0:Lq3/z;

    return-object v0
.end method

.method public getTextToolbar()Lb3/z2;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->R0:Lb3/y0;

    return-object v0
.end method

.method public final getUncaughtExceptionHandler$ui_release()La3/g2;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getView()Landroid/view/View;
    .locals 0

    return-object p0
.end method

.method public getViewConfiguration()Lb3/j3;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->L:Lb3/f1;

    return-object v0
.end method

.method public final getViewTreeOwners()Lb3/o;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->B0:Lp1/f0;

    invoke-virtual {v0}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb3/o;

    return-object v0
.end method

.method public getWindowInfo()Lb3/m3;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->J:Lb3/n2;

    return-object v0
.end method

.method public final get_autofillManager$ui_release()Lc2/d;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->i0:Lc2/d;

    return-object v0
.end method

.method public final l(La3/n0;Z)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->r0:La3/e1;

    invoke-virtual {v0, p1, p2}, La3/e1;->f(La3/n0;Z)V

    return-void
.end method

.method public final n(Landroid/view/MotionEvent;)I
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget-object v2, v1, Landroidx/compose/ui/platform/AndroidComposeView;->Y0:Landroidx/databinding/s;

    invoke-virtual {v1, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    const/4 v7, 0x0

    :try_start_0
    invoke-virtual/range {p0 .. p1}, Landroidx/compose/ui/platform/AndroidComposeView;->G(Landroid/view/MotionEvent;)V

    const/4 v8, 0x1

    iput-boolean v8, v1, Landroidx/compose/ui/platform/AndroidComposeView;->y0:Z

    invoke-virtual {v1, v7}, Landroidx/compose/ui/platform/AndroidComposeView;->w(Z)V

    const-string v2, "AndroidOwner:onTouch"

    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v9

    iget-object v2, v1, Landroidx/compose/ui/platform/AndroidComposeView;->S0:Landroid/view/MotionEvent;

    const/4 v10, 0x3

    if-eqz v2, :cond_0

    invoke-virtual {v2, v7}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne v3, v10, :cond_0

    move v11, v8

    goto :goto_0

    :cond_0
    move v11, v7

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_d

    :goto_0
    const/16 v12, 0xa

    iget-object v13, v1, Landroidx/compose/ui/platform/AndroidComposeView;->f0:Ll2/a;

    if-eqz v2, :cond_5

    :try_start_2
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getSource()I

    move-result v3

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getSource()I

    move-result v4

    if-ne v3, v4, :cond_2

    invoke-virtual {v2, v7}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v3

    invoke-virtual {v0, v7}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v4

    if-eq v3, v4, :cond_1

    goto :goto_1

    :cond_1
    move v3, v7

    goto :goto_2

    :cond_2
    :goto_1
    move v3, v8

    :goto_2
    if-eqz v3, :cond_5

    invoke-virtual {v2}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v3

    if-eqz v3, :cond_4

    :cond_3
    move-object v14, v2

    goto :goto_3

    :cond_4
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v3

    if-eqz v3, :cond_3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_3

    const/4 v4, 0x6

    if-eq v3, v4, :cond_3

    invoke-virtual {v2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v3

    if-eq v3, v12, :cond_5

    if-eqz v11, :cond_5

    invoke-virtual {v2}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v4

    const/4 v6, 0x1

    const/16 v3, 0xa

    invoke-virtual/range {v1 .. v6}, Landroidx/compose/ui/platform/AndroidComposeView;->M(Landroid/view/MotionEvent;IJZ)V

    move-object v14, v2

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object/from16 v1, p0

    goto/16 :goto_d

    :cond_5
    move-object v14, v2

    goto :goto_4

    :goto_3
    iget-boolean v1, v13, Ll2/a;->a:Z

    if-nez v1, :cond_6

    iget-object v1, v13, Ll2/a;->d:Ljava/lang/Object;

    check-cast v1, Lbu/c;

    iget-object v1, v1, Lbu/c;->w:Ljava/lang/Object;

    check-cast v1, La0/y;

    invoke-virtual {v1}, La0/y;->a()V

    iget-object v1, v13, Ll2/a;->c:Ljava/lang/Object;

    check-cast v1, Lu2/d;

    invoke-virtual {v1}, Lu2/d;->c()V

    :cond_6
    :goto_4
    invoke-virtual {v0, v7}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v1

    if-ne v1, v10, :cond_7

    move v1, v8

    goto :goto_5

    :cond_7
    move v1, v7

    :goto_5
    const/16 v15, 0x9

    if-nez v11, :cond_8

    if-eqz v1, :cond_8

    if-eq v9, v10, :cond_8

    if-eq v9, v15, :cond_8

    invoke-virtual/range {p0 .. p1}, Landroidx/compose/ui/platform/AndroidComposeView;->r(Landroid/view/MotionEvent;)Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const/4 v6, 0x1

    const/16 v3, 0x9

    move-object/from16 v1, p0

    move-object v2, v0

    :try_start_3
    invoke-virtual/range {v1 .. v6}, Landroidx/compose/ui/platform/AndroidComposeView;->M(Landroid/view/MotionEvent;IJZ)V

    goto :goto_6

    :cond_8
    move-object/from16 v1, p0

    :goto_6
    if-eqz v14, :cond_9

    invoke-virtual {v14}, Landroid/view/MotionEvent;->recycle()V

    :cond_9
    iget-object v0, v1, Landroidx/compose/ui/platform/AndroidComposeView;->S0:Landroid/view/MotionEvent;

    if-eqz v0, :cond_14

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-ne v0, v12, :cond_14

    iget-object v0, v1, Landroidx/compose/ui/platform/AndroidComposeView;->S0:Landroid/view/MotionEvent;

    if-eqz v0, :cond_a

    invoke-virtual {v0, v7}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    goto :goto_7

    :cond_a
    const/4 v0, -0x1

    :goto_7
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    iget-object v3, v1, Landroidx/compose/ui/platform/AndroidComposeView;->e0:Lu2/g;

    if-ne v2, v15, :cond_b

    :try_start_4
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getHistorySize()I

    move-result v2

    if-nez v2, :cond_b

    if-ltz v0, :cond_14

    iget-object v2, v3, Lu2/g;->c:Landroid/util/SparseBooleanArray;

    invoke-virtual {v2, v0}, Landroid/util/SparseBooleanArray;->delete(I)V

    iget-object v2, v3, Lu2/g;->b:Landroid/util/SparseLongArray;

    invoke-virtual {v2, v0}, Landroid/util/SparseLongArray;->delete(I)V

    goto/16 :goto_c

    :cond_b
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    if-nez v2, :cond_14

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getHistorySize()I

    move-result v2

    if-nez v2, :cond_14

    iget-object v2, v1, Landroidx/compose/ui/platform/AndroidComposeView;->S0:Landroid/view/MotionEvent;

    const/high16 v4, 0x7fc00000    # Float.NaN

    if-eqz v2, :cond_c

    invoke-virtual {v2}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    goto :goto_8

    :cond_c
    move v2, v4

    :goto_8
    iget-object v5, v1, Landroidx/compose/ui/platform/AndroidComposeView;->S0:Landroid/view/MotionEvent;

    if-eqz v5, :cond_d

    invoke-virtual {v5}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    :cond_d
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v5

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v6

    cmpg-float v2, v2, v5

    if-nez v2, :cond_e

    cmpg-float v2, v4, v6

    if-nez v2, :cond_e

    move v2, v7

    goto :goto_9

    :cond_e
    move v2, v8

    :goto_9
    iget-object v4, v1, Landroidx/compose/ui/platform/AndroidComposeView;->S0:Landroid/view/MotionEvent;

    if-eqz v4, :cond_f

    invoke-virtual {v4}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v4

    goto :goto_a

    :cond_f
    const-wide/16 v4, -0x1

    :goto_a
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v9

    cmp-long v4, v4, v9

    if-eqz v4, :cond_10

    move v4, v8

    goto :goto_b

    :cond_10
    move v4, v7

    :goto_b
    if-nez v2, :cond_11

    if-eqz v4, :cond_14

    :cond_11
    if-ltz v0, :cond_12

    iget-object v2, v3, Lu2/g;->c:Landroid/util/SparseBooleanArray;

    invoke-virtual {v2, v0}, Landroid/util/SparseBooleanArray;->delete(I)V

    iget-object v2, v3, Lu2/g;->b:Landroid/util/SparseLongArray;

    invoke-virtual {v2, v0}, Landroid/util/SparseLongArray;->delete(I)V

    :cond_12
    iget-object v0, v13, Ll2/a;->c:Ljava/lang/Object;

    check-cast v0, Lu2/d;

    iget-boolean v2, v0, Lu2/d;->d:Z

    if-eqz v2, :cond_13

    iput-boolean v8, v0, Lu2/d;->d:Z

    goto :goto_c

    :cond_13
    iget-object v0, v0, Lu2/d;->g:Lu2/j;

    iget-object v0, v0, Lu2/j;->a:Lr1/c;

    invoke-virtual {v0}, Lr1/c;->g()V

    :cond_14
    :goto_c
    invoke-static/range {p1 .. p1}, Landroid/view/MotionEvent;->obtainNoHistory(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v0

    iput-object v0, v1, Landroidx/compose/ui/platform/AndroidComposeView;->S0:Landroid/view/MotionEvent;

    invoke-virtual/range {p0 .. p1}, Landroidx/compose/ui/platform/AndroidComposeView;->L(Landroid/view/MotionEvent;)I

    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    iput-boolean v7, v1, Landroidx/compose/ui/platform/AndroidComposeView;->y0:Z

    return v0

    :catchall_2
    move-exception v0

    goto :goto_e

    :goto_d
    :try_start_6
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :goto_e
    iput-boolean v7, v1, Landroidx/compose/ui/platform/AndroidComposeView;->y0:Z

    throw v0
.end method

.method public final onAttachedToWindow()V
    .locals 7

    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-ge v0, v1, :cond_0

    invoke-static {}, Lb3/o0;->k()Z

    move-result v1

    invoke-virtual {p0, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->setShowLayoutBounds(Z)V

    :cond_0
    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->M:Ly2/q;

    invoke-virtual {v1, p0}, Ly2/q;->onViewAttachedToWindow(Landroid/view/View;)V

    const/16 v1, 0x1c

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-le v0, v1, :cond_6

    sget-object v0, Landroidx/compose/ui/platform/AndroidComposeView;->l1:Lb3/n;

    if-nez v0, :cond_5

    new-instance v0, Lb3/n;

    invoke-direct {v0, v2}, Lb3/n;-><init>(I)V

    sput-object v0, Landroidx/compose/ui/platform/AndroidComposeView;->l1:Lb3/n;

    invoke-static {}, Landroid/os/StrictMode;->getVmPolicy()Landroid/os/StrictMode$VmPolicy;

    move-result-object v1

    :try_start_0
    sget-object v4, Landroidx/compose/ui/platform/AndroidComposeView;->h1:Ljava/lang/Class;

    if-nez v4, :cond_1

    const-string v4, "android.os.SystemProperties"

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    sput-object v4, Landroidx/compose/ui/platform/AndroidComposeView;->h1:Ljava/lang/Class;

    :cond_1
    sget-object v4, Landroidx/compose/ui/platform/AndroidComposeView;->j1:Ljava/lang/reflect/Method;

    if-nez v4, :cond_3

    sget-object v4, Landroid/os/StrictMode$VmPolicy;->LAX:Landroid/os/StrictMode$VmPolicy;

    invoke-static {v4}, Landroid/os/StrictMode;->setVmPolicy(Landroid/os/StrictMode$VmPolicy;)V

    sget-object v4, Landroidx/compose/ui/platform/AndroidComposeView;->h1:Ljava/lang/Class;

    if-eqz v4, :cond_2

    const-string v5, "addChangeCallback"

    const-class v6, Ljava/lang/Runnable;

    filled-new-array {v6}, [Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    goto :goto_0

    :cond_2
    move-object v4, v3

    :goto_0
    sput-object v4, Landroidx/compose/ui/platform/AndroidComposeView;->j1:Ljava/lang/reflect/Method;

    :cond_3
    sget-object v4, Landroidx/compose/ui/platform/AndroidComposeView;->j1:Ljava/lang/reflect/Method;

    if-eqz v4, :cond_4

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v3, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_4
    invoke-static {v1}, Landroid/os/StrictMode;->setVmPolicy(Landroid/os/StrictMode$VmPolicy;)V

    :cond_5
    sget-object v0, Landroidx/compose/ui/platform/AndroidComposeView;->k1:La0/q0;

    monitor-enter v0

    :try_start_1
    invoke-virtual {v0, p0}, La0/q0;->a(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v0

    goto :goto_1

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1

    :cond_6
    :goto_1
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->J:Lb3/n2;

    invoke-virtual {p0}, Landroid/view/View;->hasWindowFocus()Z

    move-result v1

    iget-object v0, v0, Lb3/n2;->c:Lp1/k1;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->J:Lb3/n2;

    new-instance v1, Lb3/w;

    invoke-direct {v1, p0, v2}, Lb3/w;-><init>(Landroidx/compose/ui/platform/AndroidComposeView;I)V

    iget-object v2, v0, Lb3/n2;->b:Lp1/k1;

    if-nez v2, :cond_7

    iput-object v1, v0, Lb3/n2;->a:Lc93/a;

    :cond_7
    if-eqz v2, :cond_8

    invoke-static {p0}, Lce/w;->v(Landroidx/compose/ui/platform/AndroidComposeView;)J

    move-result-wide v0

    new-instance v4, Ly3/l;

    invoke-direct {v4, v0, v1}, Ly3/l;-><init>(J)V

    invoke-virtual {v2, v4}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_8
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La3/n0;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->p(La3/n0;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La3/n0;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->o(La3/n0;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSnapshotObserver()La3/c2;

    move-result-object v0

    iget-object v0, v0, La3/c2;->a:Lz1/v;

    invoke-virtual {v0}, Lz1/v;->e()V

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->h0:Lc2/a;

    if-eqz v0, :cond_9

    sget-object v1, Lc2/j;->a:Lc2/j;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lc2/a;->c:Landroid/view/autofill/AutofillManager;

    invoke-virtual {v0, v1}, Landroid/view/autofill/AutofillManager;->registerCallback(Landroid/view/autofill/AutofillManager$AutofillCallback;)V

    :cond_9
    invoke-static {p0}, Landroidx/lifecycle/o1;->g(Landroid/view/View;)Landroidx/lifecycle/g0;

    move-result-object v0

    invoke-static {p0}, Lts/o;->t(Landroid/view/View;)Lpb/f;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getViewTreeOwners()Lb3/o;

    move-result-object v2

    if-eqz v2, :cond_a

    if-eqz v0, :cond_d

    if-eqz v1, :cond_d

    iget-object v4, v2, Lb3/o;->a:Landroidx/lifecycle/g0;

    if-ne v0, v4, :cond_a

    if-eq v1, v4, :cond_d

    :cond_a
    if-eqz v0, :cond_14

    if-eqz v1, :cond_13

    if-eqz v2, :cond_b

    iget-object v2, v2, Lb3/o;->a:Landroidx/lifecycle/g0;

    invoke-interface {v2}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v2

    if-eqz v2, :cond_b

    invoke-virtual {v2, p0}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    :cond_b
    invoke-interface {v0}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v2

    invoke-virtual {v2, p0}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    new-instance v2, Lb3/o;

    invoke-direct {v2, v0, v1}, Lb3/o;-><init>(Landroidx/lifecycle/g0;Lpb/f;)V

    invoke-direct {p0, v2}, Landroidx/compose/ui/platform/AndroidComposeView;->set_viewTreeOwners(Lb3/o;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->C0:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_c

    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    iput-object v3, p0, Landroidx/compose/ui/platform/AndroidComposeView;->C0:Lkotlin/jvm/functions/Function1;

    :cond_d
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->P0:Lr2/c;

    invoke-virtual {p0}, Landroid/view/View;->isInTouchMode()Z

    move-result v1

    if-eqz v1, :cond_e

    const/4 v1, 0x1

    goto :goto_2

    :cond_e
    const/4 v1, 0x2

    :goto_2
    iget-object v0, v0, Lr2/c;->a:Lp1/k1;

    new-instance v2, Lr2/a;

    invoke-direct {v2, v1}, Lr2/a;-><init>(I)V

    invoke-virtual {v0, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getViewTreeOwners()Lb3/o;

    move-result-object v0

    if-eqz v0, :cond_f

    iget-object v0, v0, Lb3/o;->a:Landroidx/lifecycle/g0;

    invoke-interface {v0}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v3

    :cond_f
    if-eqz v3, :cond_12

    invoke-virtual {v3, p0}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->T:Ld2/d;

    invoke-virtual {v3, v0}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->D0:Lb3/k;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->E0:Lb3/l;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->F0:Lb3/m;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnTouchModeChangeListener(Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_10

    sget-object v0, Lb3/l0;->a:Lb3/l0;

    invoke-virtual {v0, p0}, Lb3/l0;->b(Landroid/view/View;)V

    :cond_10
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->i0:Lc2/d;

    if-eqz v0, :cond_11

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lg2/k;

    move-result-object v1

    check-cast v1, Lg2/l;

    iget-object v1, v1, Lg2/l;->g:La0/q0;

    invoke-virtual {v1, v0}, La0/q0;->a(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Li3/r;

    move-result-object v1

    iget-object v1, v1, Li3/r;->d:La0/q0;

    invoke-virtual {v1, v0}, La0/q0;->a(Ljava/lang/Object;)V

    :cond_11
    return-void

    :cond_12
    const-string v0, "No lifecycle owner exists"

    invoke-static {v0}, Lb9/y;->w(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    move-result-object v0

    throw v0

    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Composed into the View which doesn\'t propagateViewTreeSavedStateRegistryOwner!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Composed into the View which doesn\'t propagate ViewTreeLifecycleOwner!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final onCheckIsTextEditor()Z
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->I0:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb2/x;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lb2/x;->b:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    check-cast v0, Lb3/x0;

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->G0:Lq3/b0;

    iget-boolean v0, v0, Lq3/b0;->d:Z

    return v0

    :cond_1
    iget-object v0, v0, Lb3/x0;->z:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb2/x;

    if-eqz v0, :cond_2

    iget-object v1, v0, Lb2/x;->b:Ljava/lang/Object;

    :cond_2
    check-cast v1, Lb3/i2;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lb3/i2;->b()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    return v1

    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 5

    invoke-super {p0, p1}, Landroid/view/View;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lva3/g;->a(Landroid/content/Context;)Ly3/e;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->setDensity(Ly3/c;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->J:Lb3/n2;

    iget-object v0, v0, Lb3/n2;->b:Lp1/k1;

    if-eqz v0, :cond_0

    invoke-static {p0}, Lce/w;->v(Landroidx/compose/ui/platform/AndroidComposeView;)J

    move-result-wide v1

    new-instance v3, Ly3/l;

    invoke-direct {v3, v1, v2}, Ly3/l;-><init>(J)V

    invoke-virtual {v0, v3}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x1f

    if-lt v0, v2, :cond_1

    invoke-static {p1}, Lb23/h;->a(Landroid/content/res/Configuration;)I

    move-result v3

    goto :goto_0

    :cond_1
    move v3, v1

    :goto_0
    iget v4, p0, Landroidx/compose/ui/platform/AndroidComposeView;->M0:I

    if-eq v3, v4, :cond_3

    if-lt v0, v2, :cond_2

    invoke-static {p1}, Lb23/h;->a(Landroid/content/res/Configuration;)I

    move-result v1

    :cond_2
    iput v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->M0:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->q(Landroid/content/Context;)Lp3/j;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/AndroidComposeView;->setFontFamilyResolver(Lp3/h;)V

    :cond_3
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->g0:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 14

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->I0:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb2/x;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lb2/x;->b:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    check-cast v0, Lb3/x0;

    if-nez v0, :cond_1a

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->G0:Lq3/b0;

    iget-boolean v2, v0, Lq3/b0;->d:Z

    if-nez v2, :cond_1

    goto/16 :goto_7

    :cond_1
    iget-object v1, v0, Lq3/b0;->h:Lq3/l;

    iget-object v2, v0, Lq3/b0;->g:Lq3/y;

    iget v3, v1, Lq3/l;->e:I

    iget-boolean v4, v1, Lq3/l;->a:Z

    const/4 v5, 0x1

    const/4 v6, 0x4

    const/4 v7, 0x7

    const/4 v8, 0x5

    const/4 v9, 0x6

    const/4 v10, 0x3

    const/4 v11, 0x2

    if-ne v3, v5, :cond_3

    if-eqz v4, :cond_2

    :goto_1
    move v12, v9

    goto :goto_2

    :cond_2
    const/4 v12, 0x0

    goto :goto_2

    :cond_3
    if-nez v3, :cond_4

    move v12, v5

    goto :goto_2

    :cond_4
    if-ne v3, v11, :cond_5

    move v12, v11

    goto :goto_2

    :cond_5
    if-ne v3, v9, :cond_6

    move v12, v8

    goto :goto_2

    :cond_6
    if-ne v3, v8, :cond_7

    move v12, v7

    goto :goto_2

    :cond_7
    if-ne v3, v10, :cond_8

    move v12, v10

    goto :goto_2

    :cond_8
    if-ne v3, v6, :cond_9

    move v12, v6

    goto :goto_2

    :cond_9
    if-ne v3, v7, :cond_19

    goto :goto_1

    :goto_2
    iput v12, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    iget v13, v1, Lq3/l;->d:I

    if-ne v13, v5, :cond_a

    iput v5, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    goto :goto_3

    :cond_a
    if-ne v13, v11, :cond_b

    iput v5, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    const/high16 v6, -0x80000000

    or-int/2addr v6, v12

    iput v6, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    goto :goto_3

    :cond_b
    if-ne v13, v10, :cond_c

    iput v11, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    goto :goto_3

    :cond_c
    if-ne v13, v6, :cond_d

    iput v10, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    goto :goto_3

    :cond_d
    if-ne v13, v8, :cond_e

    const/16 v6, 0x11

    iput v6, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    goto :goto_3

    :cond_e
    if-ne v13, v9, :cond_f

    const/16 v6, 0x21

    iput v6, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    goto :goto_3

    :cond_f
    if-ne v13, v7, :cond_10

    const/16 v6, 0x81

    iput v6, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    goto :goto_3

    :cond_10
    const/16 v6, 0x8

    if-ne v13, v6, :cond_11

    const/16 v6, 0x12

    iput v6, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    goto :goto_3

    :cond_11
    const/16 v6, 0x9

    if-ne v13, v6, :cond_18

    const/16 v6, 0x2002

    iput v6, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    :goto_3
    if-nez v4, :cond_12

    iget v4, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    and-int/lit8 v6, v4, 0x1

    if-ne v6, v5, :cond_12

    const/high16 v6, 0x20000

    or-int/2addr v4, v6

    iput v4, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    if-ne v3, v5, :cond_12

    iget v3, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    const/high16 v4, 0x40000000    # 2.0f

    or-int/2addr v3, v4

    iput v3, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    :cond_12
    iget v3, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    and-int/lit8 v4, v3, 0x1

    if-ne v4, v5, :cond_16

    iget v4, v1, Lq3/l;->b:I

    if-ne v4, v5, :cond_13

    or-int/lit16 v3, v3, 0x1000

    iput v3, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    goto :goto_4

    :cond_13
    if-ne v4, v11, :cond_14

    or-int/lit16 v3, v3, 0x2000

    iput v3, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    goto :goto_4

    :cond_14
    if-ne v4, v10, :cond_15

    or-int/lit16 v3, v3, 0x4000

    iput v3, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    :cond_15
    :goto_4
    iget-boolean v1, v1, Lq3/l;->c:Z

    if-eqz v1, :cond_16

    iget v1, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    const v3, 0x8000

    or-int/2addr v1, v3

    iput v1, p1, Landroid/view/inputmethod/EditorInfo;->inputType:I

    :cond_16
    iget-wide v3, v2, Lq3/y;->b:J

    sget v1, Ll3/u0;->c:I

    const/16 v1, 0x20

    shr-long v5, v3, v1

    long-to-int v1, v5

    iput v1, p1, Landroid/view/inputmethod/EditorInfo;->initialSelStart:I

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    long-to-int v1, v3

    iput v1, p1, Landroid/view/inputmethod/EditorInfo;->initialSelEnd:I

    iget-object v1, v2, Lq3/y;->a:Ll3/g;

    iget-object v1, v1, Ll3/g;->x:Ljava/lang/String;

    invoke-static {p1, v1}, Lvd/e;->a0(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    iget v1, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    const/high16 v2, 0x2000000

    or-int/2addr v1, v2

    iput v1, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    invoke-static {}, Lh6/j;->d()Z

    move-result v1

    if-nez v1, :cond_17

    goto :goto_5

    :cond_17
    invoke-static {}, Lh6/j;->a()Lh6/j;

    move-result-object v1

    invoke-virtual {v1, p1}, Lh6/j;->i(Landroid/view/inputmethod/EditorInfo;)V

    :goto_5
    iget-object p1, v0, Lq3/b0;->g:Lq3/y;

    iget-object v1, v0, Lq3/b0;->h:Lq3/l;

    iget-boolean v1, v1, Lq3/l;->c:Z

    new-instance v2, Lla/b;

    const/16 v3, 0x1c

    invoke-direct {v2, v0, v3}, Lla/b;-><init>(Ljava/lang/Object;I)V

    new-instance v3, Lq3/u;

    invoke-direct {v3, p1, v2, v1}, Lq3/u;-><init>(Lq3/y;Lla/b;Z)V

    iget-object p1, v0, Lq3/b0;->i:Ljava/util/ArrayList;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v3

    :cond_18
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Invalid Keyboard Type"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_19
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "invalid ImeAction"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1a
    iget-object v0, v0, Lb3/x0;->z:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb2/x;

    if-eqz v0, :cond_1b

    iget-object v0, v0, Lb2/x;->b:Ljava/lang/Object;

    goto :goto_6

    :cond_1b
    move-object v0, v1

    :goto_6
    check-cast v0, Lb3/i2;

    if-eqz v0, :cond_1c

    invoke-virtual {v0, p1}, Lb3/i2;->a(Landroid/view/inputmethod/EditorInfo;)Lq3/o;

    move-result-object p1

    return-object p1

    :cond_1c
    :goto_7
    return-object v1
.end method

.method public final onCreateVirtualViewTranslationRequests([J[ILjava/util/function/Consumer;)V
    .locals 0

    iget-object p2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->T:Ld2/d;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2, p1, p3}, Ld2/b;->m(Ld2/d;[JLjava/util/function/Consumer;)V

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 4

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->M:Ly2/q;

    invoke-virtual {v0, p0}, Ly2/q;->onViewDetachedFromWindow(Landroid/view/View;)V

    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->F:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->E:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    const-string v0, "frameRateCategoryView"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-le v0, v2, :cond_2

    sget-object v2, Landroidx/compose/ui/platform/AndroidComposeView;->k1:La0/q0;

    monitor-enter v2

    :try_start_0
    invoke-virtual {v2, p0}, La0/q0;->i(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0

    :cond_2
    :goto_1
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSnapshotObserver()La3/c2;

    move-result-object v2

    iget-object v2, v2, La3/c2;->a:Lz1/v;

    iget-object v3, v2, Lz1/v;->h:Lvd1/c;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lvd1/c;->a()V

    :cond_3
    invoke-virtual {v2}, Lz1/v;->a()V

    iget-object v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->J:Lb3/n2;

    iget-object v3, v2, Lb3/n2;->b:Lp1/k1;

    if-nez v3, :cond_4

    iput-object v1, v2, Lb3/n2;->a:Lc93/a;

    :cond_4
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getViewTreeOwners()Lb3/o;

    move-result-object v2

    if-eqz v2, :cond_5

    iget-object v1, v2, Lb3/o;->a:Landroidx/lifecycle/g0;

    invoke-interface {v1}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v1

    :cond_5
    if-eqz v1, :cond_9

    iget-object v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->T:Ld2/d;

    invoke-virtual {v1, v2}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    invoke-virtual {v1, p0}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->h0:Lc2/a;

    if-eqz v1, :cond_6

    sget-object v2, Lc2/j;->a:Lc2/j;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v1, Lc2/a;->c:Landroid/view/autofill/AutofillManager;

    invoke-virtual {v1, v2}, Landroid/view/autofill/AutofillManager;->unregisterCallback(Landroid/view/autofill/AutofillManager$AutofillCallback;)V

    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    iget-object v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->D0:Lb3/k;

    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    iget-object v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->E0:Lb3/l;

    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    iget-object v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->F0:Lb3/m;

    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->removeOnTouchModeChangeListener(Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;)V

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_7

    sget-object v0, Lb3/l0;->a:Lb3/l0;

    invoke-virtual {v0, p0}, Lb3/l0;->a(Landroid/view/View;)V

    :cond_7
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->i0:Lc2/d;

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Li3/r;

    move-result-object v1

    iget-object v1, v1, Li3/r;->d:La0/q0;

    invoke-virtual {v1, v0}, La0/q0;->i(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lg2/k;

    move-result-object v1

    check-cast v1, Lg2/l;

    iget-object v1, v1, Lg2/l;->g:La0/q0;

    invoke-virtual {v1, v0}, La0/q0;->i(Ljava/lang/Object;)Z

    :cond_8
    return-void

    :cond_9
    const-string v0, "No lifecycle owner exists"

    invoke-static {v0}, Lb9/y;->w(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    move-result-object v0

    throw v0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    return-void
.end method

.method public final onFocusChanged(ZILandroid/graphics/Rect;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroid/view/View;->onFocusChanged(ZILandroid/graphics/Rect;)V

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lg2/k;

    move-result-object p1

    check-cast p1, Lg2/l;

    iget-object p1, p1, Lg2/l;->c:Lg2/x;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lg2/g;->e(Lg2/x;Z)Z

    :cond_0
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->x0:J

    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->r0:La3/e1;

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->b1:Lb3/w;

    invoke-virtual {p1, v0}, La3/e1;->j(Lb3/w;)Z

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->p0:Ly3/a;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->O()V

    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->o0:Lb3/h1;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui_release()Lb3/h1;

    move-result-object p1

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    const/4 p2, 0x0

    invoke-virtual {p1, p2, p2, p4, p5}, Landroid/view/View;->layout(IIII)V

    :cond_0
    return-void
.end method

.method public final onMeasure(II)V
    .locals 8

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->r0:La3/e1;

    const-string v1, "AndroidOwner:onMeasure"

    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La3/n0;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroidx/compose/ui/platform/AndroidComposeView;->p(La3/n0;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :cond_0
    :goto_0
    invoke-static {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->f(I)J

    move-result-wide v1

    const/16 p1, 0x20

    ushr-long v3, v1, p1

    long-to-int v3, v3

    const-wide v4, 0xffffffffL

    and-long/2addr v1, v4

    long-to-int v1, v1

    invoke-static {p2}, Landroidx/compose/ui/platform/AndroidComposeView;->f(I)J

    move-result-wide v6

    ushr-long p1, v6, p1

    long-to-int p1, p1

    and-long/2addr v4, v6

    long-to-int p2, v4

    invoke-static {v3, v1, p1, p2}, Lva3/l;->m(IIII)J

    move-result-wide p1

    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->p0:Ly3/a;

    if-nez v1, :cond_1

    new-instance v1, Ly3/a;

    invoke-direct {v1, p1, p2}, Ly3/a;-><init>(J)V

    iput-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->p0:Ly3/a;

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->q0:Z

    goto :goto_1

    :cond_1
    iget-wide v1, v1, Ly3/a;->a:J

    invoke-static {v1, v2, p1, p2}, Ly3/a;->c(JJ)Z

    move-result v1

    if-nez v1, :cond_2

    const/4 v1, 0x1

    iput-boolean v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->q0:Z

    :cond_2
    :goto_1
    invoke-virtual {v0, p1, p2}, La3/e1;->q(J)V

    invoke-virtual {v0}, La3/e1;->l()V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La3/n0;

    move-result-object p1

    invoke-virtual {p1}, La3/n0;->J()I

    move-result p1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La3/n0;

    move-result-object p2

    invoke-virtual {p2}, La3/n0;->s()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->o0:Lb3/h1;

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getAndroidViewsHandler$ui_release()Lb3/h1;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La3/n0;

    move-result-object p2

    invoke-virtual {p2}, La3/n0;->J()I

    move-result p2

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La3/n0;

    move-result-object v1

    invoke-virtual {v1}, La3/n0;->s()I

    move-result v1

    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p1, p2, v0}, Landroid/view/View;->measure(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :goto_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1
.end method

.method public final onProvideAutofillVirtualStructure(Landroid/view/ViewStructure;I)V
    .locals 10

    if-eqz p1, :cond_6

    iget-object p2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->i0:Lc2/d;

    if-eqz p2, :cond_5

    iget-object v0, p2, Lc2/d;->b:Li3/r;

    iget-object v0, v0, Li3/r;->a:La3/n0;

    iget-object v1, p2, Lc2/d;->g:Landroid/view/autofill/AutofillId;

    iget-object v2, p2, Lc2/d;->e:Ljava/lang/String;

    iget-object p2, p2, Lc2/d;->d:Lj3/b;

    invoke-static {p1, v0, v1, v2, p2}, Lbp/b;->F(Landroid/view/ViewStructure;La3/n0;Landroid/view/autofill/AutofillId;Ljava/lang/String;Lj3/b;)V

    sget-object v3, La0/b1;->a:[Ljava/lang/Object;

    new-instance v3, La0/q0;

    const/4 v4, 0x2

    invoke-direct {v3, v4}, La0/q0;-><init>(I)V

    invoke-virtual {v3, v0}, La0/q0;->a(Ljava/lang/Object;)V

    invoke-virtual {v3, p1}, La0/q0;->a(Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {v3}, La0/q0;->h()Z

    move-result v0

    if-eqz v0, :cond_5

    iget v0, v3, La0/q0;->b:I

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v3, v0}, La0/q0;->j(I)Ljava/lang/Object;

    move-result-object v0

    const-string v4, "null cannot be cast to non-null type android.view.ViewStructure"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/ViewStructure;

    iget v4, v3, La0/q0;->b:I

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {v3, v4}, La0/q0;->j(I)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, La3/n0;

    invoke-virtual {v4}, La3/n0;->q()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v5

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_0

    move-object v7, v4

    check-cast v7, Lr1/b;

    invoke-virtual {v7, v6}, Lr1/b;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, La3/n0;

    iget-boolean v8, v7, La3/n0;->o0:Z

    if-nez v8, :cond_4

    invoke-virtual {v7}, La3/n0;->X()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-virtual {v7}, La3/n0;->Y()Z

    move-result v8

    if-nez v8, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v7}, La3/n0;->I()Li3/l;

    move-result-object v8

    if-eqz v8, :cond_3

    iget-object v8, v8, Li3/l;->w:La0/v0;

    sget-object v9, Li3/k;->g:Li3/y;

    invoke-virtual {v8, v9}, La0/v0;->b(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2

    sget-object v9, Li3/u;->q:Li3/y;

    invoke-virtual {v8, v9}, La0/v0;->b(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2

    sget-object v9, Li3/u;->r:Li3/y;

    invoke-virtual {v8, v9}, La0/v0;->b(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    :cond_2
    invoke-static {v0}, Lc2/i;->a(Landroid/view/ViewStructure;)I

    move-result v8

    invoke-static {v0, v8}, Lc2/i;->g(Landroid/view/ViewStructure;I)Landroid/view/ViewStructure;

    move-result-object v8

    invoke-static {v8, v7, v1, v2, p2}, Lbp/b;->F(Landroid/view/ViewStructure;La3/n0;Landroid/view/autofill/AutofillId;Ljava/lang/String;Lj3/b;)V

    invoke-virtual {v3, v7}, La0/q0;->a(Ljava/lang/Object;)V

    invoke-virtual {v3, v8}, La0/q0;->a(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-virtual {v3, v7}, La0/q0;->a(Ljava/lang/Object;)V

    invoke-virtual {v3, v0}, La0/q0;->a(Ljava/lang/Object;)V

    :cond_4
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_5
    iget-object p2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->h0:Lc2/a;

    if-eqz p2, :cond_6

    invoke-static {p2, p1}, Lx43/j;->S(Lc2/a;Landroid/view/ViewStructure;)V

    :cond_6
    return-void
.end method

.method public final onResolvePointerIcon(Landroid/view/MotionEvent;I)Landroid/view/PointerIcon;
    .locals 2

    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v0

    const/16 v1, 0x2002

    invoke-virtual {p1, v1}, Landroid/view/InputEvent;->isFromSource(I)Z

    move-result v1

    if-nez v1, :cond_1

    const/16 v1, 0x4002

    invoke-virtual {p1, v1}, Landroid/view/InputEvent;->isFromSource(I)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getPointerIconService()Lu2/p;

    move-result-object v0

    check-cast v0, Lb3/x;

    iget-object v0, v0, Lb3/x;->a:Lu2/o;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v0}, Lb3/m0;->b(Landroid/content/Context;Lu2/o;)Landroid/view/PointerIcon;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onResolvePointerIcon(Landroid/view/MotionEvent;I)Landroid/view/PointerIcon;

    move-result-object p1

    return-object p1
.end method

.method public final onResume(Landroidx/lifecycle/g0;)V
    .locals 1

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1e

    if-ge p1, v0, :cond_0

    invoke-static {}, Lb3/o0;->k()Z

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->setShowLayoutBounds(Z)V

    :cond_0
    return-void
.end method

.method public final onRtlPropertiesChanged(I)V
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->x:Z

    if-eqz v0, :cond_3

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    sget-object p1, Ly3/m;->x:Ly3/m;

    goto :goto_0

    :cond_1
    sget-object p1, Ly3/m;->w:Ly3/m;

    :goto_0
    if-nez p1, :cond_2

    sget-object p1, Ly3/m;->w:Ly3/m;

    :cond_2
    invoke-direct {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->setLayoutDirection(Ly3/m;)V

    :cond_3
    return-void
.end method

.method public final onScrollCaptureSearch(Landroid/graphics/Rect;Landroid/graphics/Point;Ljava/util/function/Consumer;)V
    .locals 1

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1f

    if-lt p1, p2, :cond_0

    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->e1:Lh3/j;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Li3/r;

    move-result-object p2

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getCoroutineContext()Lq83/j;

    move-result-object v0

    invoke-virtual {p1, p0, p2, v0, p3}, Lh3/j;->a(Landroidx/compose/ui/platform/AndroidComposeView;Li3/r;Lq83/j;Ljava/util/function/Consumer;)V

    :cond_0
    return-void
.end method

.method public final onVirtualViewTranslationResponses(Landroid/util/LongSparseArray;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->T:Ld2/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, p1}, Ld2/b;->o(Ld2/d;Landroid/util/LongSparseArray;)V

    return-void
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->J:Lb3/n2;

    iget-object v0, v0, Lb3/n2;->c:Lp1/k1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->d1:Z

    invoke-super {p0, p1}, Landroid/view/View;->onWindowFocusChanged(Z)V

    if-eqz p1, :cond_0

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1e

    if-ge p1, v0, :cond_0

    invoke-static {}, Lb3/o0;->k()Z

    move-result p1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getShowLayoutBounds()Z

    move-result v0

    if-eq v0, p1, :cond_0

    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->setShowLayoutBounds(Z)V

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La3/n0;

    move-result-object p1

    invoke-static {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->o(La3/n0;)V

    :cond_0
    return-void
.end method

.method public final p(La3/n0;)V
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->r0:La3/e1;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, La3/e1;->p(La3/n0;Z)Z

    invoke-virtual {p1}, La3/n0;->M()Lr1/c;

    move-result-object p1

    iget-object v0, p1, Lr1/c;->w:[Ljava/lang/Object;

    iget p1, p1, Lr1/c;->y:I

    :goto_0
    if-ge v1, p1, :cond_0

    aget-object v2, v0, v1

    check-cast v2, La3/n0;

    invoke-virtual {p0, v2}, Landroidx/compose/ui/platform/AndroidComposeView;->p(La3/n0;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final r(Landroid/view/MotionEvent;)Z
    .locals 3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    const/4 v1, 0x0

    cmpg-float v2, v1, v0

    if-gtz v2, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    cmpg-float v0, v0, v2

    if-gtz v0, :cond_0

    cmpg-float v0, v1, p1

    if-gtz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    cmpg-float p1, p1, v0

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final requestFocus(ILandroid/graphics/Rect;)Z
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lg2/k;

    move-result-object v0

    check-cast v0, Lg2/l;

    iget-object v0, v0, Lg2/l;->c:Lg2/x;

    invoke-virtual {v0}, Lg2/x;->Z0()Lg2/w;

    move-result-object v0

    invoke-virtual {v0}, Lg2/w;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result p1

    return p1

    :cond_1
    invoke-static {p1}, Ljc/x;->v0(I)Lg2/d;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lg2/d;->d()I

    move-result p1

    goto :goto_0

    :cond_2
    const/4 p1, 0x7

    :goto_0
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getFocusOwner()Lg2/k;

    move-result-object v0

    if-eqz p2, :cond_3

    invoke-static {p2}, Li2/w0;->J(Landroid/graphics/Rect;)Lh2/c;

    move-result-object p2

    goto :goto_1

    :cond_3
    const/4 p2, 0x0

    :goto_1
    new-instance v1, Lb3/y;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lb3/y;-><init>(II)V

    check-cast v0, Lg2/l;

    invoke-virtual {v0, p1, p2, v1}, Lg2/l;->g(ILh2/c;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    move-result-object p1

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public setAccessibilityEventBatchIntervalMillis(J)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->S:Lb3/h0;

    iput-wide p1, v0, Lb3/h0;->h:J

    return-void
.end method

.method public final setConfigurationChangeObserver(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->g0:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setContentCaptureManager$ui_release(Ld2/d;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->T:Ld2/d;

    return-void
.end method

.method public setCoroutineContext(Lq83/j;)V
    .locals 10

    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->H:Lq83/j;

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La3/n0;

    move-result-object p1

    iget-object p1, p1, La3/n0;->e0:La3/l1;

    iget-object p1, p1, La3/l1;->g:Ljava/lang/Object;

    check-cast p1, Lb2/v;

    instance-of v0, p1, Lu2/h0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lu2/h0;

    invoke-virtual {v0}, Lu2/h0;->Z0()V

    :cond_0
    iget-object v0, p1, Lb2/v;->w:Lb2/v;

    iget-boolean v0, v0, Lb2/v;->N:Z

    if-nez v0, :cond_1

    const-string v0, "visitSubtreeIf called on an unattached node"

    invoke-static {v0}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_1
    new-instance v0, Lr1/c;

    const/16 v1, 0x10

    new-array v2, v1, [Lb2/v;

    invoke-direct {v0, v2}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iget-object p1, p1, Lb2/v;->w:Lb2/v;

    iget-object v2, p1, Lb2/v;->F:Lb2/v;

    if-nez v2, :cond_2

    invoke-static {v0, p1}, La3/g;->a(Lr1/c;Lb2/v;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v0, v2}, Lr1/c;->b(Ljava/lang/Object;)V

    :goto_0
    iget p1, v0, Lr1/c;->y:I

    if-eqz p1, :cond_c

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v0, p1}, Lr1/c;->l(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb2/v;

    iget v2, p1, Lb2/v;->z:I

    and-int/2addr v2, v1

    if-eqz v2, :cond_b

    move-object v2, p1

    :goto_1
    if-eqz v2, :cond_b

    iget v3, v2, Lb2/v;->y:I

    and-int/2addr v3, v1

    if-eqz v3, :cond_a

    const/4 v3, 0x0

    move-object v4, v2

    move-object v5, v3

    :goto_2
    if-eqz v4, :cond_a

    instance-of v6, v4, La3/f2;

    if-eqz v6, :cond_3

    check-cast v4, La3/f2;

    instance-of v6, v4, Lu2/h0;

    if-eqz v6, :cond_9

    check-cast v4, Lu2/h0;

    invoke-virtual {v4}, Lu2/h0;->Z0()V

    goto :goto_5

    :cond_3
    iget v6, v4, Lb2/v;->y:I

    and-int/2addr v6, v1

    if-eqz v6, :cond_9

    instance-of v6, v4, La3/o;

    if-eqz v6, :cond_9

    move-object v6, v4

    check-cast v6, La3/o;

    iget-object v6, v6, La3/o;->P:Lb2/v;

    const/4 v7, 0x0

    :goto_3
    const/4 v8, 0x1

    if-eqz v6, :cond_8

    iget v9, v6, Lb2/v;->y:I

    and-int/2addr v9, v1

    if-eqz v9, :cond_7

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v8, :cond_4

    move-object v4, v6

    goto :goto_4

    :cond_4
    if-nez v5, :cond_5

    new-instance v5, Lr1/c;

    new-array v8, v1, [Lb2/v;

    invoke-direct {v5, v8}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_5
    if-eqz v4, :cond_6

    invoke-virtual {v5, v4}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v4, v3

    :cond_6
    invoke-virtual {v5, v6}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_7
    :goto_4
    iget-object v6, v6, Lb2/v;->F:Lb2/v;

    goto :goto_3

    :cond_8
    if-ne v7, v8, :cond_9

    goto :goto_2

    :cond_9
    :goto_5
    invoke-static {v5}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v4

    goto :goto_2

    :cond_a
    iget-object v2, v2, Lb2/v;->F:Lb2/v;

    goto :goto_1

    :cond_b
    invoke-static {v0, p1}, La3/g;->a(Lr1/c;Lb2/v;)V

    goto :goto_0

    :cond_c
    return-void
.end method

.method public final setLastMatrixRecalculationAnimationTime$ui_release(J)V
    .locals 0

    iput-wide p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->x0:J

    return-void
.end method

.method public final setOnViewTreeOwnersAvailable(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getViewTreeOwners()Lb3/o;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_1

    iput-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->C0:Lkotlin/jvm/functions/Function1;

    :cond_1
    return-void
.end method

.method public setShowLayoutBounds(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->n0:Z

    return-void
.end method

.method public setUncaughtExceptionHandler(La3/g2;)V
    .locals 0

    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->r0:La3/e1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final setUncaughtExceptionHandler$ui_release(La3/g2;)V
    .locals 0

    return-void
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final t(Landroid/view/MotionEvent;)Z
    .locals 4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->S0:Landroid/view/MotionEvent;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v3

    if-ne v2, v3, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v2

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawX()F

    move-result v3

    cmpg-float v2, v2, v3

    if-nez v2, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    cmpg-float p1, p1, v0

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    return v1
.end method

.method public final u([F)V
    .locals 5

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->F()V

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->v0:[F

    invoke-static {p1, v0}, Li2/l0;->f([F[F)V

    iget-wide v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->z0:J

    const/16 v2, 0x20

    shr-long/2addr v0, v2

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    iget-wide v1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->z0:J

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    iget-object v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->u0:[F

    invoke-static {v2}, Li2/l0;->d([F)V

    invoke-static {v2, v0, v1}, Li2/l0;->g([FFF)V

    invoke-static {p1, v2}, Lb3/o0;->n([F[F)V

    return-void
.end method

.method public final v(J)J
    .locals 7

    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->F()V

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->v0:[F

    invoke-static {p1, p2, v0}, Li2/l0;->b(J[F)J

    move-result-wide p1

    const/16 v0, 0x20

    shr-long v1, p1, v0

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    iget-wide v2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->z0:J

    shr-long/2addr v2, v0

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    add-float/2addr v2, v1

    const-wide v3, 0xffffffffL

    and-long/2addr p1, v3

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    iget-wide v5, p0, Landroidx/compose/ui/platform/AndroidComposeView;->z0:J

    and-long/2addr v5, v3

    long-to-int p2, v5

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    add-float/2addr p2, p1

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v1, p1

    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long p1, p1

    shl-long v0, v1, v0

    and-long/2addr p1, v3

    or-long/2addr p1, v0

    return-wide p1
.end method

.method public final w(Z)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->r0:La3/e1;

    iget-object v1, v0, La3/e1;->b:La3/p;

    invoke-virtual {v1}, La3/p;->D()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, v0, La3/e1;->e:Lcom/google/crypto/tink/internal/l0;

    iget-object v1, v1, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v1, Lr1/c;

    iget v1, v1, Lr1/c;->y:I

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    const-string v1, "AndroidOwner:measureAndLayout"

    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    if-eqz p1, :cond_2

    :try_start_0
    iget-object p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->b1:Lb3/w;

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_1
    invoke-virtual {v0, p1}, La3/e1;->j(Lb3/w;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_3
    const/4 p1, 0x0

    invoke-virtual {v0, p1}, La3/e1;->a(Z)V

    iget-boolean v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->d0:Z

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->dispatchOnGlobalLayout()V

    iput-boolean p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->d0:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :goto_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1
.end method

.method public final y(La3/n0;J)V
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->r0:La3/e1;

    const-string v1, "AndroidOwner:measureAndLayout"

    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {v0, p1, p2, p3}, La3/e1;->k(La3/n0;J)V

    iget-object p1, v0, La3/e1;->b:La3/p;

    invoke-virtual {p1}, La3/p;->D()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, La3/e1;->a(Z)V

    iget-boolean p2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->d0:Z

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/ViewTreeObserver;->dispatchOnGlobalLayout()V

    iput-boolean p1, p0, Landroidx/compose/ui/platform/AndroidComposeView;->d0:Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRectManager()Lj3/b;

    move-result-object p1

    invoke-virtual {p1}, Lj3/b;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1
.end method

.method public final z(La3/a2;Z)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeView;->a0:Ljava/util/ArrayList;

    if-nez p2, :cond_1

    iget-boolean p2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->c0:Z

    if-nez p2, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object p2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->b0:Ljava/util/ArrayList;

    if-eqz p2, :cond_0

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void

    :cond_1
    iget-boolean p2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->c0:Z

    if-nez p2, :cond_2

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void

    :cond_2
    iget-object p2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->b0:Ljava/util/ArrayList;

    if-nez p2, :cond_3

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Landroidx/compose/ui/platform/AndroidComposeView;->b0:Ljava/util/ArrayList;

    :cond_3
    invoke-interface {p2, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void
.end method
