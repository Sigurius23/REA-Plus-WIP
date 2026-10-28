.class public final Lcom/whoop/realtime/presentation/StartActivityActivity;
.super Lhj0/f;
.source "SourceFile"

# interfaces
.implements Lnu/a;
.implements Lo52/k0;
.implements Lo52/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/realtime/presentation/StartActivityActivity$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00be\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u00e1\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u00d5\u0001B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0014\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0019\u0010\u000c\u001a\u00020\t2\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0014\u00a2\u0006\u0004\u0008\u000c\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0014\u00a2\u0006\u0004\u0008\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\tH\u0014\u00a2\u0006\u0004\u0008\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\tH\u0014\u00a2\u0006\u0004\u0008\u000f\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0010H\u0014\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J-\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\t2\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u001bH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\u0008!\u0010\"J)\u0010&\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00132\u0008\u0010%\u001a\u0004\u0018\u00010$H\u0016\u00a2\u0006\u0004\u0008&\u0010\'J\u000f\u0010(\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008(\u0010\u0006J\u000f\u0010)\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008)\u0010\u0006J\u0017\u0010,\u001a\u00020\t2\u0006\u0010+\u001a\u00020*H\u0002\u00a2\u0006\u0004\u0008,\u0010-J\u000f\u0010.\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008.\u0010\u0006J\u000f\u0010/\u001a\u00020\tH\u0003\u00a2\u0006\u0004\u0008/\u0010\u0006J\u000f\u00100\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u00080\u0010\u0006J\u000f\u00101\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u00081\u0010\u0006J%\u00102\u001a\u00020\t2\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u001b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u00082\u00103J\u001d\u00105\u001a\u00020\t2\u000c\u00104\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u001bH\u0002\u00a2\u0006\u0004\u00085\u0010\u001eJ\u001d\u00106\u001a\u00020\t2\u000c\u00104\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u001bH\u0002\u00a2\u0006\u0004\u00086\u0010\u001eJ\u000f\u00107\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u00087\u0010\u0006J\u000f\u00108\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u00088\u0010\u0006J\u0017\u0010:\u001a\u00020\t2\u0006\u00109\u001a\u00020*H\u0002\u00a2\u0006\u0004\u0008:\u0010-J\u000f\u0010;\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008;\u0010\u0006J\u000f\u0010<\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008<\u0010\u0006J\u000f\u0010=\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008=\u0010\u0006J\u000f\u0010>\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008>\u0010\u0006J\u000f\u0010?\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008?\u0010\u0006J\u0010\u0010@\u001a\u00020\tH\u0082@\u00a2\u0006\u0004\u0008@\u0010AJ\u0017\u0010D\u001a\u00020\t2\u0006\u0010C\u001a\u00020BH\u0002\u00a2\u0006\u0004\u0008D\u0010EJ\u0017\u0010H\u001a\u00020\t2\u0006\u0010G\u001a\u00020FH\u0002\u00a2\u0006\u0004\u0008H\u0010IJ\u0017\u0010K\u001a\u00020\t2\u0006\u0010J\u001a\u00020FH\u0002\u00a2\u0006\u0004\u0008K\u0010IJ\u0017\u0010M\u001a\u00020\u001f2\u0006\u0010L\u001a\u00020BH\u0002\u00a2\u0006\u0004\u0008M\u0010NJ\u0017\u0010P\u001a\u00020\t2\u0006\u0010O\u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008P\u0010\"J\u000f\u0010Q\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008Q\u0010\u0006J\u000f\u0010R\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008R\u0010\u0006J\u000f\u0010S\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008S\u0010\u0006J\u000f\u0010T\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008T\u0010\u0006J\u000f\u0010U\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008U\u0010\u0006J\u000f\u0010V\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008V\u0010\u0006J\u000f\u0010W\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008W\u0010\u0006J\u000f\u0010X\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008X\u0010\u0006J\u000f\u0010Y\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008Y\u0010\u0006J\u000f\u0010Z\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008Z\u0010\u0006J\u000f\u0010[\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008[\u0010\u0006R\"\u0010c\u001a\u00020\\8\u0016@\u0016X\u0096.\u00a2\u0006\u0012\n\u0004\u0008]\u0010^\u001a\u0004\u0008_\u0010`\"\u0004\u0008a\u0010bR\u0014\u0010g\u001a\u00020d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008e\u0010fR\u001b\u0010m\u001a\u00020h8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008i\u0010j\u001a\u0004\u0008k\u0010lR\u0018\u0010q\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008o\u0010pR\u0018\u0010t\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008r\u0010sR\u0018\u0010x\u001a\u0004\u0018\u00010u8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008v\u0010wR\u0016\u0010{\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008y\u0010zR\u0016\u0010}\u001a\u00020n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008|\u0010pR\u0016\u0010\u007f\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008~\u0010]R\u0018\u0010\u0081\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0080\u0001\u0010]R\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009d\u0001\u001a\u00030\u009a\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u009b\u0001\u0010\u009c\u0001R\u0017\u0010\u00a0\u0001\u001a\u00030\u009e\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008z\u0010\u009f\u0001R\u001c\u0010\u00a4\u0001\u001a\u0005\u0018\u00010\u00a1\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00a2\u0001\u0010\u00a3\u0001R\u001a\u0010\u00a8\u0001\u001a\u00030\u00a5\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00a6\u0001\u0010\u00a7\u0001R\u001c\u0010\u00ac\u0001\u001a\u0005\u0018\u00010\u00a9\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00aa\u0001\u0010\u00ab\u0001R\u001a\u0010\u00b0\u0001\u001a\u00030\u00ad\u00018\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u00ae\u0001\u0010\u00af\u0001R\u0018\u0010\u00b2\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u00b1\u0001\u0010zR\u001a\u0010\u00b6\u0001\u001a\u00030\u00b3\u00018\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u00b4\u0001\u0010\u00b5\u0001R\u001a\u0010\u00ba\u0001\u001a\u00030\u00b7\u00018\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u00b8\u0001\u0010\u00b9\u0001R\u001a\u0010\u00be\u0001\u001a\u00030\u00bb\u00018\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u00bc\u0001\u0010\u00bd\u0001R!\u0010\u00c3\u0001\u001a\n\u0012\u0005\u0012\u00030\u00c0\u00010\u00bf\u00018\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u00c1\u0001\u0010\u00c2\u0001R\u001a\u0010\u00c7\u0001\u001a\u00030\u00c4\u00018\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u00c5\u0001\u0010\u00c6\u0001R\u0018\u0010\u00ca\u0001\u001a\u00030\u00c0\u00018VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00c8\u0001\u0010\u00c9\u0001R\u0018\u0010\u00ce\u0001\u001a\u00030\u00cb\u00018VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00cc\u0001\u0010\u00cd\u0001R\u0018\u0010\u00d2\u0001\u001a\u00030\u00cf\u00018VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00d0\u0001\u0010\u00d1\u0001R\u0018\u0010\u00d4\u0001\u001a\u00030\u00c0\u00018VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00d3\u0001\u0010\u00c9\u0001R\u0018\u0010\u00d6\u0001\u001a\u00030\u00c0\u00018VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00d5\u0001\u0010\u00c9\u0001R\u0019\u0010\u00d9\u0001\u001a\u0004\u0018\u00010\u00138BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00d7\u0001\u0010\u00d8\u0001R\u0019\u0010\u00dc\u0001\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00da\u0001\u0010\u00db\u0001R\u0018\u0010\u00e0\u0001\u001a\u00030\u00dd\u00018BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00de\u0001\u0010\u00df\u0001\u00a8\u0006\u00e2\u0001"
    }
    d2 = {
        "Lcom/whoop/realtime/presentation/StartActivityActivity;",
        "Lhj0/f;",
        "Lnu/a;",
        "Lo52/k0;",
        "Lo52/d;",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Ll83/a0;",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "onPostCreate",
        "onStart",
        "onResume",
        "onDestroy",
        "",
        "p",
        "()Ljava/lang/String;",
        "",
        "requestCode",
        "",
        "permissions",
        "",
        "grantResults",
        "onRequestPermissionsResult",
        "(I[Ljava/lang/String;[I)V",
        "",
        "permissionsToExplain",
        "e",
        "(Ljava/util/List;)V",
        "",
        "granted",
        "b",
        "(Z)V",
        "resultCode",
        "Landroid/content/Intent;",
        "data",
        "onActivityResult",
        "(IILandroid/content/Intent;)V",
        "c",
        "X0",
        "Llm2/b;",
        "addableActivity",
        "R1",
        "(Llm2/b;)V",
        "z1",
        "B0",
        "O0",
        "E1",
        "N0",
        "(Ljava/util/List;[I)V",
        "deniedPermissions",
        "W1",
        "Z1",
        "E0",
        "K1",
        "activity",
        "Z0",
        "e2",
        "G0",
        "F0",
        "D1",
        "W0",
        "i2",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "toAlpha",
        "H0",
        "(F)V",
        "",
        "goal",
        "l2",
        "(D)V",
        "estimate",
        "h2",
        "goalPercent",
        "T0",
        "(F)Z",
        "value",
        "Q1",
        "g2",
        "f2",
        "U0",
        "c1",
        "a1",
        "J1",
        "L1",
        "I1",
        "c2",
        "H1",
        "C0",
        "Lcom/mapbox/maps/MapboxMap;",
        "I",
        "Lcom/mapbox/maps/MapboxMap;",
        "getMapboxMap",
        "()Lcom/mapbox/maps/MapboxMap;",
        "P1",
        "(Lcom/mapbox/maps/MapboxMap;)V",
        "mapboxMap",
        "Ltr2/n;",
        "J",
        "Ltr2/n;",
        "logger",
        "Lo52/s0;",
        "K",
        "Ll83/h;",
        "M0",
        "()Lo52/s0;",
        "startActivityViewModel",
        "Landroid/animation/ValueAnimator;",
        "L",
        "Landroid/animation/ValueAnimator;",
        "miniDialCrossfader",
        "M",
        "Llm2/b;",
        "selectedActivity",
        "Lnu/b;",
        "N",
        "Lnu/b;",
        "permissionsManager",
        "O",
        "Z",
        "gpsPermitted",
        "P",
        "mapFader",
        "Q",
        "originalButtonContainerBottomPadding",
        "R",
        "originalToolbarContainerTopPadding",
        "Lor2/y;",
        "S",
        "Lor2/y;",
        "externalLinkNavigator",
        "Lcom/whoop/data/repositories/FeatureFlagRepository;",
        "T",
        "Lcom/whoop/data/repositories/FeatureFlagRepository;",
        "featureFlagRepository",
        "Lor2/y0;",
        "U",
        "Lor2/y0;",
        "locationServicesHelper",
        "Lz82/b;",
        "V",
        "Lz82/b;",
        "analyticsManager",
        "Lod1/f;",
        "W",
        "Lod1/f;",
        "cycleMgr",
        "Ll52/a;",
        "X",
        "Ll52/a;",
        "mapboxManager",
        "Lcom/whoop/data/repositories/UserRepository;",
        "Y",
        "Lcom/whoop/data/repositories/UserRepository;",
        "userRepository",
        "Lm02/a;",
        "Lm02/a;",
        "homeNavigator",
        "Lcom/mapbox/common/location/LocationProvider;",
        "a0",
        "Lcom/mapbox/common/location/LocationProvider;",
        "locationProvider",
        "Ln73/b;",
        "b0",
        "Ln73/b;",
        "gpsStateDisposable",
        "Lm52/m;",
        "c0",
        "Lm52/m;",
        "gpsMapBinding",
        "Lo52/r0;",
        "d0",
        "Lo52/r0;",
        "callback",
        "e0",
        "isMapInflated",
        "Lcom/whoop/realtime/presentation/m;",
        "f0",
        "Lcom/whoop/realtime/presentation/m;",
        "strainCoachController",
        "Lp92/i;",
        "g0",
        "Lp92/i;",
        "realTimeStreamController",
        "Lo52/b;",
        "h0",
        "Lo52/b;",
        "activitySelector",
        "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;",
        "Landroid/view/View;",
        "i0",
        "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;",
        "bottomSheetBehavior",
        "Lm52/a;",
        "j0",
        "Lm52/a;",
        "binding",
        "h",
        "()Landroid/view/View;",
        "containerView",
        "Landroid/widget/TextView;",
        "d",
        "()Landroid/widget/TextView;",
        "titleView",
        "Landroid/widget/ImageView;",
        "f",
        "()Landroid/widget/ImageView;",
        "iconView",
        "g",
        "arrowView",
        "a",
        "toolbarContainer",
        "L0",
        "()Ljava/lang/Integer;",
        "sportId",
        "J0",
        "()Ljava/lang/Boolean;",
        "autoStartActivity",
        "Ltp/j;",
        "K0",
        "()Ltp/j;",
        "locationSettingsRequest",
        "k0",
        "realtime-activity_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final k0:Lcom/whoop/realtime/presentation/StartActivityActivity$a;

.field public static final l0:I


# instance fields
.field public I:Lcom/mapbox/maps/MapboxMap;

.field private final J:Ltr2/n;

.field private final K:Ll83/h;

.field private L:Landroid/animation/ValueAnimator;

.field private M:Llm2/b;

.field private N:Lnu/b;

.field private O:Z

.field private P:Landroid/animation/ValueAnimator;

.field private Q:I

.field private R:I

.field private final S:Lor2/y;

.field private final T:Lcom/whoop/data/repositories/FeatureFlagRepository;

.field private final U:Lor2/y0;

.field private final V:Lz82/b;

.field private final W:Lod1/f;

.field private final X:Ll52/a;

.field private final Y:Lcom/whoop/data/repositories/UserRepository;

.field private final Z:Lm02/a;

.field private a0:Lcom/mapbox/common/location/LocationProvider;

.field private b0:Ln73/b;

.field private c0:Lm52/m;

.field private d0:Lo52/r0;

.field private e0:Z

.field private f0:Lcom/whoop/realtime/presentation/m;

.field private g0:Lp92/i;

.field private h0:Lo52/b;

.field private i0:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/material/bottomsheet/BottomSheetBehavior<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private j0:Lm52/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/realtime/presentation/StartActivityActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/realtime/presentation/StartActivityActivity$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/realtime/presentation/StartActivityActivity;->k0:Lcom/whoop/realtime/presentation/StartActivityActivity$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/realtime/presentation/StartActivityActivity;->l0:I

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Lhj0/f;-><init>()V

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "StartActivityKotlinActivity"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->J:Ltr2/n;

    new-instance v0, Lcom/whoop/realtime/presentation/StartActivityActivity$m;

    invoke-direct {v0, p0}, Lcom/whoop/realtime/presentation/StartActivityActivity$m;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/realtime/presentation/StartActivityActivity$n;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/realtime/presentation/StartActivityActivity$n;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->K:Ll83/h;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->O:Z

    new-instance v0, Landroid/animation/ValueAnimator;

    invoke-direct {v0}, Landroid/animation/ValueAnimator;-><init>()V

    iput-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->P:Landroid/animation/ValueAnimator;

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lor2/y;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lor2/y;

    iput-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->S:Lor2/y;

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v0

    const-class v2, Lcom/whoop/data/repositories/FeatureFlagRepository;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/repositories/FeatureFlagRepository;

    iput-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->T:Lcom/whoop/data/repositories/FeatureFlagRepository;

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v0

    const-class v2, Lor2/y0;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lor2/y0;

    iput-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->U:Lor2/y0;

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v0

    const-class v2, Lz82/b;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz82/b;

    iput-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->V:Lz82/b;

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v0

    const-class v2, Lod1/f;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lod1/f;

    iput-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->W:Lod1/f;

    new-instance v0, Lnr0/e;

    const/16 v2, 0xb

    invoke-direct {v0, p0, v2}, Lnr0/e;-><init>(Ljava/lang/Object;I)V

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v2

    const-class v4, Ll52/a;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v2, v0, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll52/a;

    iput-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->X:Ll52/a;

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v0

    const-class v2, Lcom/whoop/data/repositories/UserRepository;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/repositories/UserRepository;

    iput-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->Y:Lcom/whoop/data/repositories/UserRepository;

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v0

    const-class v2, Lm02/a;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm02/a;

    iput-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->Z:Lm02/a;

    sget-object v0, Lq73/d;->w:Lq73/d;

    iput-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->b0:Ln73/b;

    return-void
.end method

.method public static final synthetic A0(Lcom/whoop/realtime/presentation/StartActivityActivity;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->i2(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final A1(Llv/a;)Ll83/a0;
    .locals 1

    const-string v0, "$this$updateSettings"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Llv/a;->a:Z

    const v0, 0x800003

    iput v0, p0, Llv/a;->b:I

    const/high16 v0, 0x41800000    # 16.0f

    iput v0, p0, Llv/a;->c:F

    iput v0, p0, Llv/a;->d:F

    const/4 v0, 0x0

    iput v0, p0, Llv/a;->e:F

    iput v0, p0, Llv/a;->f:F

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final B0()V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->O0()V

    invoke-static {}, Lcom/mapbox/common/location/LocationServiceFactory;->getOrCreate()Lcom/mapbox/common/location/LocationService;

    move-result-object v0

    const-string v1, "getOrCreate(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/mapbox/common/location/LocationProviderRequest$Builder;

    invoke-direct {v1}, Lcom/mapbox/common/location/LocationProviderRequest$Builder;-><init>()V

    new-instance v2, Lcom/mapbox/common/location/IntervalSettings$Builder;

    invoke-direct {v2}, Lcom/mapbox/common/location/IntervalSettings$Builder;-><init>()V

    const-wide/16 v3, 0x3e8

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/mapbox/common/location/IntervalSettings$Builder;->interval(Ljava/lang/Long;)Lcom/mapbox/common/location/IntervalSettings$Builder;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/mapbox/common/location/IntervalSettings$Builder;->maximumInterval(Ljava/lang/Long;)Lcom/mapbox/common/location/IntervalSettings$Builder;

    move-result-object v2

    invoke-virtual {v2}, Lcom/mapbox/common/location/IntervalSettings$Builder;->build()Lcom/mapbox/common/location/IntervalSettings;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/mapbox/common/location/LocationProviderRequest$Builder;->interval(Lcom/mapbox/common/location/IntervalSettings;)Lcom/mapbox/common/location/LocationProviderRequest$Builder;

    move-result-object v1

    sget-object v2, Lcom/mapbox/common/location/AccuracyLevel;->HIGH:Lcom/mapbox/common/location/AccuracyLevel;

    invoke-virtual {v1, v2}, Lcom/mapbox/common/location/LocationProviderRequest$Builder;->accuracy(Lcom/mapbox/common/location/AccuracyLevel;)Lcom/mapbox/common/location/LocationProviderRequest$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/mapbox/common/location/LocationProviderRequest$Builder;->build()Lcom/mapbox/common/location/LocationProviderRequest;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/mapbox/common/location/LocationService;->getDeviceLocationProvider(Lcom/mapbox/common/location/LocationProviderRequest;)Lcom/mapbox/bindgen/Expected;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/bindgen/Expected;->isValue()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/mapbox/bindgen/Expected;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mapbox/common/location/LocationProvider;

    iput-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->a0:Lcom/mapbox/common/location/LocationProvider;

    :cond_0
    new-instance v0, Lo52/r0;

    invoke-direct {v0, p0}, Lo52/r0;-><init>(Lo52/d;)V

    iput-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->d0:Lo52/r0;

    iget-object v1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->a0:Lcom/mapbox/common/location/LocationProvider;

    if-eqz v1, :cond_1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    const-string v3, "getMainLooper(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v0, v2}, Lcom/mapbox/common/location/LocationProvider;->addLocationObserver(Lcom/mapbox/common/location/LocationObserver;Landroid/os/Looper;)V

    :cond_1
    return-void
.end method

.method private static final B1(Lov/c;)Ll83/a0;
    .locals 1

    const-string v0, "$this$gesturesPlugin"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lov/o;

    iget-object v0, p0, Lov/o;->u0:Lpv/b;

    invoke-virtual {v0}, Lpv/b;->b()Lpv/a;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->C1(Lpv/a;)Ll83/a0;

    invoke-virtual {v0}, Lpv/a;->a()Lpv/b;

    move-result-object v0

    iput-object v0, p0, Lov/o;->u0:Lpv/b;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final C0()V
    .locals 3

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lm52/a;->w:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    new-instance v1, Lo52/p0;

    invoke-direct {v1, p0}, Lo52/p0;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;)V

    sget-object v2, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {v0, v1}, Lh5/h0;->l(Landroid/view/View;Lh5/u;)V

    return-void

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private static final C1(Lpv/a;)Ll83/a0;
    .locals 1

    const-string v0, "$this$updateSettings"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lpv/a;->c:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lpv/a;->i:Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic D(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->b1(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method private static final D0(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 7

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "windowInsets"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p2, Lh5/q1;->a:Lh5/o1;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lh5/o1;->g(I)Lv4/b;

    move-result-object v0

    const-string v1, "getInsets(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x2

    invoke-virtual {p1, v2}, Lh5/o1;->g(I)Lv4/b;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    const/4 v2, 0x0

    const-string v3, "binding"

    if-eqz v1, :cond_1

    iget-object v1, v1, Lm52/a;->N:Landroid/widget/LinearLayout;

    const-string v4, "toolbarContainer"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, v0, Lv4/b;->b:I

    iget v4, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->R:I

    add-int/2addr v0, v4

    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    move-result v5

    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    move-result v6

    invoke-virtual {v1, v4, v0, v5, v6}, Landroid/view/View;->setPadding(IIII)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lm52/a;->f:Landroid/widget/LinearLayout;

    const-string v1, "bottomButtonsContainer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget p1, p1, Lv4/b;->d:I

    iget p0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->Q:I

    add-int/2addr p1, p0

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result p0

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    invoke-virtual {v0, p0, v1, v2, p1}, Landroid/view/View;->setPadding(IIII)V

    return-object p2

    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method private final D1()V
    .locals 5

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->M0()Lo52/s0;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    const-string v2, "binding"

    const/4 v3, 0x0

    if-eqz v1, :cond_c

    iget-object v1, v1, Lm52/a;->q:Lcom/whoop/ui/WhoopSwitch;

    invoke-virtual {v1}, Lcom/whoop/ui/WhoopSwitch;->isChecked()Z

    move-result v1

    invoke-virtual {v0, v1}, Lo52/s0;->H(Z)V

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->M0()Lo52/s0;

    move-result-object v0

    invoke-virtual {v0}, Lo52/s0;->D()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->J1()V

    :cond_0
    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->M:Llm2/b;

    instance-of v1, v0, Llm2/d;

    if-eqz v1, :cond_6

    check-cast v0, Llm2/d;

    invoke-virtual {v0}, Llm2/d;->k()Lcom/whoop/service/network/model/Sport;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_5

    iget-object v0, v0, Lm52/a;->q:Lcom/whoop/ui/WhoopSwitch;

    const-string v1, "gpsSwitch"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->M:Llm2/b;

    const-string v1, "null cannot be cast to non-null type com.whoop.ui.activities.AddableSport"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Llm2/d;

    invoke-virtual {v0}, Llm2/d;->k()Lcom/whoop/service/network/model/Sport;

    move-result-object v0

    if-eqz v0, :cond_2

    sget-object v4, Lcom/whoop/ui/activities/realtime/SportCategory;->RESTORATIVE:Lcom/whoop/ui/activities/realtime/SportCategory;

    invoke-virtual {v0}, Lcom/whoop/service/network/model/Sport;->getCategory()Lcom/whoop/ui/activities/realtime/SportCategory;

    move-result-object v0

    if-eq v4, v0, :cond_2

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lm52/a;->q:Lcom/whoop/ui/WhoopSwitch;

    sget v4, Lk52/b;->a:I

    invoke-virtual {p0, v4}, Landroid/content/Context;->getColor(I)I

    move-result v4

    invoke-virtual {v0, v4}, Lcom/whoop/ui/WhoopSwitch;->setThumbColor(I)V

    goto :goto_0

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_2
    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_4

    iget-object v0, v0, Lm52/a;->q:Lcom/whoop/ui/WhoopSwitch;

    sget v4, Lk52/b;->g:I

    invoke-virtual {p0, v4}, Landroid/content/Context;->getColor(I)I

    move-result v4

    invoke-virtual {v0, v4}, Lcom/whoop/ui/WhoopSwitch;->setThumbColor(I)V

    :goto_0
    invoke-virtual {p0}, Lhj0/f;->s()Lz82/e;

    move-result-object v0

    iget-object v4, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->M:Llm2/b;

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Llm2/d;

    invoke-virtual {v4}, Llm2/d;->k()Lcom/whoop/service/network/model/Sport;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/whoop/service/network/model/Sport;->getName()Ljava/lang/String;

    move-result-object v1

    iget-object v4, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v4, :cond_3

    iget-object v4, v4, Lm52/a;->q:Lcom/whoop/ui/WhoopSwitch;

    invoke-virtual {v4}, Lcom/whoop/ui/WhoopSwitch;->isChecked()Z

    move-result v4

    invoke-virtual {v0, v1, v4}, Lz82/e;->F0(Ljava/lang/String;Z)V

    goto :goto_1

    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_6
    :goto_1
    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_b

    iget-object v0, v0, Lm52/a;->q:Lcom/whoop/ui/WhoopSwitch;

    invoke-virtual {v0}, Lcom/whoop/ui/WhoopSwitch;->isChecked()Z

    move-result v0

    const/4 v1, 0x3

    if-eqz v0, :cond_a

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {p0, v0}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_7

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->O:Z

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v2

    new-instance v4, Lcom/whoop/realtime/presentation/StartActivityActivity$h;

    invoke-direct {v4, p0, v3}, Lcom/whoop/realtime/presentation/StartActivityActivity$h;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;Lq83/d;)V

    invoke-static {v2, v3, v3, v4, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->M0()Lo52/s0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lo52/s0;->H(Z)V

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->W0()V

    return-void

    :cond_7
    invoke-static {p0, v0}, Landroidx/core/app/ActivityCompat;->shouldShowRequestPermissionRationale(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->E1()V

    return-void

    :cond_8
    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->N:Lnu/b;

    if-nez v0, :cond_9

    new-instance v0, Lnu/b;

    invoke-direct {v0, p0}, Lnu/b;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;)V

    iput-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->N:Lnu/b;

    :cond_9
    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->N:Lnu/b;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p0}, Lnu/b;->a(Lcom/whoop/realtime/presentation/StartActivityActivity;)V

    return-void

    :cond_a
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->O:Z

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v2, Lcom/whoop/realtime/presentation/StartActivityActivity$i;

    invoke-direct {v2, p0, v3}, Lcom/whoop/realtime/presentation/StartActivityActivity$i;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;Lq83/d;)V

    invoke-static {v0, v3, v3, v2, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_b
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_c
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3
.end method

.method public static synthetic E()Luf3/a;
    .locals 1

    invoke-static {}, Lcom/whoop/realtime/presentation/StartActivityActivity;->d2()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private final E0()V
    .locals 12

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_a

    iget-object v0, v0, Lm52/a;->q:Lcom/whoop/ui/WhoopSwitch;

    invoke-virtual {v0}, Lcom/whoop/ui/WhoopSwitch;->isChecked()Z

    move-result v0

    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {p0, v1}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    if-eqz v0, :cond_2

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move v4, v3

    goto :goto_2

    :cond_2
    :goto_1
    move v4, v2

    :goto_2
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1f

    if-lt v5, v6, :cond_6

    const-string v7, "android.permission.BLUETOOTH_SCAN"

    invoke-static {p0, v7}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v7

    if-nez v7, :cond_3

    move v7, v2

    goto :goto_3

    :cond_3
    move v7, v3

    :goto_3
    const-string v8, "android.permission.BLUETOOTH_CONNECT"

    invoke-static {p0, v8}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v8

    if-nez v8, :cond_4

    move v8, v2

    goto :goto_4

    :cond_4
    move v8, v3

    :goto_4
    if-eqz v7, :cond_5

    if-eqz v8, :cond_5

    goto :goto_5

    :cond_5
    move v2, v3

    :goto_5
    iget-object v9, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->J:Ltr2/n;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Bluetooth Check: SCAN granted: "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v7, ", CONNECT granted: "

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    new-array v8, v3, [Lqr2/a$a;

    invoke-interface {v9, v7, v8}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_6

    :cond_6
    iget-object v7, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->J:Ltr2/n;

    const-string v8, "Bluetooth Check: Not on Android S+ or permissions not configured as needed by this path."

    new-array v9, v3, [Lqr2/a$a;

    invoke-interface {v7, v8, v9}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_6
    iget-object v7, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->J:Ltr2/n;

    const-string v8, ", Location Granted: "

    const-string v9, ", Effective Location Granted: "

    const-string v10, "Permission Check Summary: Location Required: "

    invoke-static {v10, v8, v9, v0, v1}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v9, ", Bluetooth Granted: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    new-array v9, v3, [Lqr2/a$a;

    invoke-interface {v7, v8, v9}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    if-eqz v4, :cond_7

    if-eqz v2, :cond_7

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->J:Ltr2/n;

    const-string v1, "All required permissions GRANTED. Proceeding to startActivityInternal."

    new-array v2, v3, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->c2()V

    return-void

    :cond_7
    if-eqz v0, :cond_8

    if-nez v1, :cond_8

    const-string v0, "Missing: LOCATION"

    goto :goto_7

    :cond_8
    const-string v0, "Missing:"

    :goto_7
    if-lt v5, v6, :cond_9

    if-nez v2, :cond_9

    const-string v1, " BLUETOOTH"

    invoke-static {v0, v1}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_9
    iget-object v1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->J:Ltr2/n;

    const-string v2, "checkAllPermissionsAndProceed found missing permissions. "

    const-string v4, ". Requesting again."

    invoke-static {v2, v0, v4}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v2, v3, [Lqr2/a$a;

    invoke-interface {v1, v0, v2}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->K1()V

    return-void

    :cond_a
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private final E1()V
    .locals 4

    new-instance v0, Lm/i;

    sget v1, Lk52/g;->f:I

    invoke-direct {v0, p0, v1}, Lm/i;-><init>(Landroid/content/Context;I)V

    const/4 v1, 0x0

    iget-object v2, v0, Lm/i;->a:Lm/e;

    iput-boolean v1, v2, Lm/e;->m:Z

    sget v1, Lk52/f;->d1:I

    invoke-virtual {v0, v1}, Lm/i;->a(I)V

    sget v1, Lk52/f;->V:I

    new-instance v2, Lo52/o0;

    const/4 v3, 0x2

    invoke-direct {v2, p0, v3}, Lo52/o0;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;I)V

    invoke-virtual {v0, v1, v2}, Lm/i;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Lm/i;

    move-result-object v0

    sget v1, Lk52/f;->l1:I

    new-instance v2, Lo52/o0;

    const/4 v3, 0x4

    invoke-direct {v2, p0, v3}, Lo52/o0;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;I)V

    invoke-virtual {v0, v1, v2}, Lm/i;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Lm/i;

    move-result-object v0

    invoke-virtual {v0}, Lm/i;->c()Lm/j;

    return-void
.end method

.method public static synthetic F(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/realtime/presentation/StartActivityActivity;->a2(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method private final F0()V
    .locals 1

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->g0:Lp92/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lp92/i;->b()V

    return-void

    :cond_0
    const-string v0, "realTimeStreamController"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private static final F1(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/content/DialogInterface;I)V
    .locals 3

    new-instance p2, Landroid/content/Intent;

    const-string v0, "android.settings.APPLICATION_DETAILS_SETTINGS"

    invoke-direct {p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "package"

    invoke-static {v2, v0, v1}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object p2

    const-string v0, "setData(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method

.method public static synthetic G(Lo52/l0;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->N1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private final G0()V
    .locals 1

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->g0:Lp92/i;

    if-eqz v0, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lp92/i;->a()V

    return-void

    :cond_0
    const-string v0, "realTimeStreamController"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0

    :cond_1
    return-void
.end method

.method private static final G1(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/content/DialogInterface;I)V
    .locals 2

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->O:Z

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object p2

    new-instance v0, Lcom/whoop/realtime/presentation/StartActivityActivity$j;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/whoop/realtime/presentation/StartActivityActivity$j;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;Lq83/d;)V

    const/4 p0, 0x3

    invoke-static {p2, v1, v1, v0, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method

.method public static synthetic H(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->u1(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/view/View;)V

    return-void
.end method

.method private final H0(F)V
    .locals 4

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->c0:Lm52/m;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->P:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    iget-object v1, v0, Lm52/m;->a:Lcom/mapbox/maps/MapView;

    invoke-virtual {v1}, Landroid/view/View;->getAlpha()F

    move-result v1

    const/4 v2, 0x2

    new-array v2, v2, [F

    const/4 v3, 0x0

    aput v1, v2, v3

    const/4 v1, 0x1

    aput p1, v2, v1

    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p1

    const-string v1, "ofFloat(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->P:Landroid/animation/ValueAnimator;

    const-wide/16 v1, 0x190

    invoke-virtual {p1, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->P:Landroid/animation/ValueAnimator;

    new-instance v1, Ldb/e;

    const/4 v2, 0x6

    invoke-direct {v1, v0, v2}, Ldb/e;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->P:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    :cond_0
    return-void
.end method

.method private final H1()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->T:Lcom/whoop/data/repositories/FeatureFlagRepository;

    const-string v1, "start-activity-skip-countdown-timer-start-recording"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v1, Lcom/whoop/realtime/presentation/StartActivityActivity$k;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/realtime/presentation/StartActivityActivity$k;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    return-void
.end method

.method public static synthetic I(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/view/ViewStub;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/realtime/presentation/StartActivityActivity;->q1(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/view/ViewStub;Landroid/view/View;)V

    return-void
.end method

.method private static final I0(Lm52/m;Landroid/animation/ValueAnimator;)V
    .locals 1

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lm52/m;->a:Lcom/mapbox/maps/MapView;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method private final I1()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-eqz v0, :cond_2

    iget-object v0, v0, Lm52/a;->J:Landroid/widget/TextView;

    sget v3, Lk52/f;->z1:I

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lm52/a;->K:Landroid/widget/TextView;

    sget v3, Lk52/f;->z1:I

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lm52/a;->A:Landroid/widget/ImageView;

    sget v1, Lk52/f;->e1:I

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public static synthetic J(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->d1(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method private final J0()Ljava/lang/Boolean;
    .locals 3

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "auto_start"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private final J1()V
    .locals 1

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->U:Lor2/y0;

    invoke-virtual {v0}, Lor2/y0;->e()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->L1()V

    :cond_0
    return-void
.end method

.method public static synthetic K(Ltv/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->P0(Ltv/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final K0()Ltp/j;
    .locals 5

    invoke-static {}, Lcom/google/android/gms/location/LocationRequest;->b()Lcom/google/android/gms/location/LocationRequest;

    move-result-object v0

    const-wide/16 v1, 0xbb8

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/location/LocationRequest;->i(J)V

    const-wide/16 v1, 0x7d0

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/location/LocationRequest;->h(J)V

    const/16 v1, 0x64

    iput v1, v0, Lcom/google/android/gms/location/LocationRequest;->w:I

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Ltp/j;

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v0, v1, v3, v4, v2}, Ltp/j;-><init>(Ljava/util/ArrayList;ZZLtp/c0;)V

    return-object v0
.end method

.method private final K1()V
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v1, :cond_9

    iget-object v1, v1, Lm52/a;->q:Lcom/whoop/ui/WhoopSwitch;

    invoke-virtual {v1}, Lcom/whoop/ui/WhoopSwitch;->isChecked()Z

    move-result v1

    const-string v2, "android.permission.ACCESS_FINE_LOCATION"

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    invoke-static {p0, v2}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->N:Lnu/b;

    if-eqz v1, :cond_2

    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {p0, v1}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0, v2}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->N:Lnu/b;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1, p0}, Lnu/b;->a(Lcom/whoop/realtime/presentation/StartActivityActivity;)V

    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    :goto_0
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    move v1, v3

    :goto_1
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1f

    if-lt v4, v5, :cond_5

    const-string v4, "android.permission.BLUETOOTH_SCAN"

    invoke-static {p0, v4}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    const-string v4, "android.permission.BLUETOOTH_CONNECT"

    invoke-static {p0, v4}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_7

    new-array v1, v3, [Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v0, 0x3e9

    goto :goto_2

    :cond_6
    const/16 v0, 0x3ea

    :goto_2
    invoke-static {p0, v1, v0}, Landroidx/core/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    return-void

    :cond_7
    if-nez v1, :cond_8

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->E0()V

    :cond_8
    return-void

    :cond_9
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public static synthetic L(Lov/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->B1(Lov/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final L0()Ljava/lang/Integer;
    .locals 3

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "sport_id"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private final L1()V
    .locals 4

    new-instance v0, Lqo/a;

    invoke-direct {v0, p0}, Lqo/a;-><init>(Landroid/app/Activity;)V

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->K0()Ltp/j;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqo/a;->c(Ltp/j;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v1, Lo52/l0;

    const/4 v2, 0x5

    invoke-direct {v1, p0, v2}, Lo52/l0;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;I)V

    new-instance v2, Lmm/d;

    const/16 v3, 0xb

    invoke-direct {v2, v1, v3}, Lmm/d;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, p0, v2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Landroid/app/Activity;Lcq/f;)Lcom/google/android/gms/tasks/Task;

    new-instance v1, Lo52/p0;

    invoke-direct {v1, p0}, Lo52/p0;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;)V

    invoke-virtual {v0, p0, v1}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Landroid/app/Activity;Lcq/e;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public static synthetic M(Lcom/whoop/realtime/presentation/StartActivityActivity;Ljava/lang/Boolean;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->y1(Lcom/whoop/realtime/presentation/StartActivityActivity;Ljava/lang/Boolean;)V

    return-void
.end method

.method private final M0()Lo52/s0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->K:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo52/s0;

    return-object v0
.end method

.method private static final M1(Lcom/whoop/realtime/presentation/StartActivityActivity;Ltp/k;)Ll83/a0;
    .locals 3

    const-string v0, "locationSettingsResponse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Ltp/k;->a:Ltp/l;

    iget-object p1, p1, Ltp/l;->x:Ltp/m;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-boolean v1, p1, Ltp/m;->z:Z

    if-nez v1, :cond_0

    iget-boolean v2, p1, Ltp/m;->E:Z

    if-eqz v2, :cond_1

    :cond_0
    if-eqz p1, :cond_1

    const/4 p1, 0x1

    if-ne v1, p1, :cond_1

    sget p1, Lk52/f;->b1:I

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    iget-object p0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->J:Ltr2/n;

    const-string p1, "Location service is enabled"

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p0, p1, v0}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_0

    :cond_1
    iget-object p0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->J:Ltr2/n;

    const-string p1, "Location service is enabled but location/gps is not available"

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p0, p1, v0}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic N(Lo52/l0;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->k2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private final N0(Ljava/util/List;[I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;[I)V"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v5, v2, 0x1

    if-ltz v2, :cond_3

    move-object v6, v3

    check-cast v6, Ljava/lang/String;

    const/4 v6, -0x1

    if-ltz v2, :cond_0

    array-length v7, p2

    if-ge v2, v7, :cond_0

    aget v2, p2, v2

    goto :goto_1

    :cond_0
    move v2, v6

    :goto_1
    if-ne v2, v6, :cond_1

    goto :goto_2

    :cond_1
    move v4, v1

    :goto_2
    if-eqz v4, :cond_2

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_2
    move v2, v5

    goto :goto_0

    :cond_3
    invoke-static {}, Lwb3/f;->d0()V

    const/4 p1, 0x0

    throw p1

    :cond_4
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_3

    :cond_5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-static {p0, p2}, Landroidx/core/app/ActivityCompat;->shouldShowRequestPermissionRationale(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_6

    move v1, v4

    :cond_7
    :goto_3
    if-eqz v1, :cond_8

    invoke-direct {p0, v0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->W1(Ljava/util/List;)V

    return-void

    :cond_8
    invoke-direct {p0, v0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->Z1(Ljava/util/List;)V

    return-void
.end method

.method private static final N1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic O(Lcom/whoop/realtime/presentation/StartActivityActivity;Ljava/lang/Boolean;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->j2(Lcom/whoop/realtime/presentation/StartActivityActivity;Ljava/lang/Boolean;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final O0()V
    .locals 3

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->c0:Lm52/m;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lm52/m;->a:Lcom/mapbox/maps/MapView;

    if-eqz v0, :cond_0

    const-string v1, "MAPBOX_LOCATION_COMPONENT_PLUGIN_ID"

    invoke-interface {v0, v1}, Lmv/f;->getPlugin(Ljava/lang/String;)Lev/j;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v0, Lrv/m;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    new-instance v1, Lny0/m;

    const/16 v2, 0x18

    invoke-direct {v1, v2}, Lny0/m;-><init>(I)V

    invoke-virtual {v0, v1}, Lrv/m;->j(Lkotlin/jvm/functions/Function1;)V

    :cond_1
    return-void
.end method

.method private static final O1(Lcom/whoop/realtime/presentation/StartActivityActivity;Ljava/lang/Exception;)V
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/common/api/ResolvableApiException;

    if-eqz v0, :cond_0

    :try_start_0
    check-cast p1, Lcom/google/android/gms/common/api/ResolvableApiException;

    const/16 v0, 0xd7

    invoke-virtual {p1, p0, v0}, Lcom/google/android/gms/common/api/ResolvableApiException;->c(Landroid/app/Activity;I)V
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->J:Ltr2/n;

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "Exception occurred during while requesting location service permissions"

    invoke-interface {p0, v1, p1, v0}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_0
    return-void
.end method

.method public static synthetic P(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->x1(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/view/View;)V

    return-void
.end method

.method private static final P0(Ltv/b;)Ll83/a0;
    .locals 7

    const-string v0, "$this$updateSettings"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lev/r;->x:Lev/r;

    iput-object v0, p0, Ltv/b;->l:Lev/r;

    const/4 v0, 0x1

    iput-boolean v0, p0, Ltv/b;->k:Z

    iput-boolean v0, p0, Ltv/b;->b:Z

    new-instance v1, Lev/c;

    sget-object v0, Lcom/mapbox/maps/ImageHolder;->Companion:Lcom/mapbox/maps/ImageHolder$Companion;

    sget v2, Lcom/mapbox/maps/R$drawable;->mapbox_user_icon:I

    invoke-virtual {v0, v2}, Lcom/mapbox/maps/ImageHolder$Companion;->from(I)Lcom/mapbox/maps/ImageHolder;

    move-result-object v2

    sget v3, Lcom/mapbox/maps/R$drawable;->mapbox_user_stroke_icon:I

    invoke-virtual {v0, v3}, Lcom/mapbox/maps/ImageHolder$Companion;->from(I)Lcom/mapbox/maps/ImageHolder;

    move-result-object v3

    sget v4, Lk52/c;->o:I

    invoke-virtual {v0, v4}, Lcom/mapbox/maps/ImageHolder$Companion;->from(I)Lcom/mapbox/maps/ImageHolder;

    move-result-object v4

    new-instance v0, Lvu/c;

    const-string v5, "interpolate"

    invoke-direct {v0, v5}, Lvu/a;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->Q0(Lvu/c;)Ll83/a0;

    invoke-virtual {v0}, Lvu/a;->b()Lvu/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/bindgen/Value;->toJson()Ljava/lang/String;

    move-result-object v5

    const/16 v6, 0x10

    invoke-direct/range {v1 .. v6}, Lev/c;-><init>(Lcom/mapbox/maps/ImageHolder;Lcom/mapbox/maps/ImageHolder;Lcom/mapbox/maps/ImageHolder;Ljava/lang/String;I)V

    iput-object v1, p0, Ltv/b;->a:Lev/e;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic Q()Luf3/a;
    .locals 1

    invoke-static {}, Lcom/whoop/realtime/presentation/StartActivityActivity;->f1()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private static final Q0(Lvu/c;)Ll83/a0;
    .locals 3

    const-string v0, "$this$interpolate"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lvu/a;->b:Ljava/util/ArrayList;

    new-instance v1, Lvu/a;

    const-string v2, "linear"

    invoke-direct {v1, v2}, Lvu/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lvu/a;->b()Lvu/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lvu/a;

    const-string v2, "zoom"

    invoke-direct {v1, v2}, Lvu/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lvu/a;->b()Lvu/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->R0(Lvu/a;)Ll83/a0;

    invoke-static {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->S0(Lvu/a;)Ll83/a0;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final Q1(Z)V
    .locals 6

    const-string v0, "binding"

    const/4 v1, 0x0

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz p1, :cond_3

    iget-object p1, p1, Lm52/a;->B:Lcom/whoop/ui/WhoopSwitch;

    invoke-virtual {p1}, Lcom/whoop/ui/WhoopSwitch;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->f0:Lcom/whoop/realtime/presentation/m;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/whoop/realtime/presentation/m;->g()D

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmpl-double p1, v2, v4

    if-lez p1, :cond_4

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz p1, :cond_1

    iget-object p1, p1, Lm52/a;->I:Landroid/widget/ImageButton;

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Landroid/view/View;->setEnabled(Z)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lm52/a;->I:Landroid/widget/ImageButton;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    return-void

    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    const-string p1, "strainCoachController"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_3
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_4
    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz p1, :cond_6

    iget-object p1, p1, Lm52/a;->I:Landroid/widget/ImageButton;

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Landroid/view/View;->setEnabled(Z)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz p1, :cond_5

    iget-object p1, p1, Lm52/a;->I:Landroid/widget/ImageButton;

    const v0, 0x3e4ccccd    # 0.2f

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    return-void

    :cond_5
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_6
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public static synthetic R(Lcom/whoop/realtime/presentation/StartActivityActivity;Ltp/k;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->M1(Lcom/whoop/realtime/presentation/StartActivityActivity;Ltp/k;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final R0(Lvu/a;)Ll83/a0;
    .locals 2

    const-string v0, "$this$stop"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lvu/a;->c(D)V

    const-wide v0, 0x3fe3333333333333L    # 0.6

    invoke-virtual {p0, v0, v1}, Lvu/a;->c(D)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final R1(Llm2/b;)V
    .locals 3

    instance-of v0, p1, Llm2/c;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->W:Lod1/f;

    const-string v0, "sleep"

    sget-object v1, Lcom/whoop/data/remote/domain/request/UserState;->Sleep:Lcom/whoop/data/remote/domain/request/UserState;

    invoke-virtual {p1, v0, v1}, Lod1/f;->o(Ljava/lang/String;Lcom/whoop/data/remote/domain/request/UserState;)Lxg3/g;

    move-result-object p1

    new-instance v0, Lo52/l0;

    const/4 v1, 0x6

    invoke-direct {v0, p0, v1}, Lo52/l0;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;I)V

    new-instance v1, Lo52/m0;

    const/4 v2, 0x4

    invoke-direct {v1, v0, v2}, Lo52/m0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v1}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object p1

    invoke-virtual {p0, p1}, Lhj0/f;->o(Lxg3/t;)V

    return-void

    :cond_0
    instance-of p1, p1, Llm2/d;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->W:Lod1/f;

    const-string v0, "workout"

    sget-object v1, Lcom/whoop/data/remote/domain/request/UserState;->Workout:Lcom/whoop/data/remote/domain/request/UserState;

    invoke-virtual {p1, v0, v1}, Lod1/f;->o(Ljava/lang/String;Lcom/whoop/data/remote/domain/request/UserState;)Lxg3/g;

    move-result-object p1

    new-instance v0, Lo52/l0;

    const/4 v1, 0x7

    invoke-direct {v0, p0, v1}, Lo52/l0;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;I)V

    new-instance v1, Lo52/m0;

    const/4 v2, 0x5

    invoke-direct {v1, v0, v2}, Lo52/m0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v1}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object p1

    invoke-virtual {p0, p1}, Lhj0/f;->o(Lxg3/t;)V

    :cond_1
    return-void
.end method

.method public static synthetic S(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/realtime/presentation/StartActivityActivity;->Y1(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method private static final S0(Lvu/a;)Ll83/a0;
    .locals 2

    const-string v0, "$this$stop"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/high16 v0, 0x4034000000000000L    # 20.0

    invoke-virtual {p0, v0, v1}, Lvu/a;->c(D)V

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    invoke-virtual {p0, v0, v1}, Lvu/a;->c(D)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final S1(Lcom/whoop/realtime/presentation/StartActivityActivity;Lpg3/v0;)Ll83/a0;
    .locals 1

    iget-object p0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->J:Ltr2/n;

    const/4 p1, 0x0

    new-array p1, p1, [Lqr2/a$a;

    const-string v0, "Starting Strain Coach - User state is set to SLEEP"

    invoke-interface {p0, v0, p1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic T(Lcom/whoop/realtime/presentation/StartActivityActivity;Ljava/lang/Boolean;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->n1(Lcom/whoop/realtime/presentation/StartActivityActivity;Ljava/lang/Boolean;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final T0(F)Z
    .locals 4

    float-to-double v0, p1

    const-wide/high16 v2, 0x4035000000000000L    # 21.0

    mul-double/2addr v0, v2

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->f0:Lcom/whoop/realtime/presentation/m;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/whoop/realtime/presentation/m;->g()D

    move-result-wide v2

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide v2, 0x3fb99999a0000000L    # 0.10000000149011612

    cmpg-double p1, v0, v2

    if-gez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    const-string p1, "strainCoachController"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method private static final T1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic U(Lo52/l0;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->k1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private final U0()V
    .locals 6

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->f0:Lcom/whoop/realtime/presentation/m;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/realtime/presentation/m;->g()D

    move-result-wide v2

    const-wide/high16 v4, 0x4035000000000000L    # 21.0

    div-double/2addr v2, v4

    double-to-float v0, v2

    iget-object v2, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v2, :cond_0

    iget-object v1, v2, Lm52/a;->n:Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;

    invoke-virtual {v1, v0}, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->v(F)V

    return-void

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    const-string v0, "strainCoachController"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method private static final U1(Lcom/whoop/realtime/presentation/StartActivityActivity;Lpg3/v0;)Ll83/a0;
    .locals 1

    iget-object p0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->J:Ltr2/n;

    const/4 p1, 0x0

    new-array p1, p1, [Lqr2/a$a;

    const-string v0, "Starting Strain Coach - User state is set to WORKOUT"

    invoke-interface {p0, v0, p1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic V(Lcom/whoop/realtime/presentation/StartActivityActivity;Lpg3/v0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->U1(Lcom/whoop/realtime/presentation/StartActivityActivity;Lpg3/v0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final V0(Lcom/whoop/realtime/presentation/StartActivityActivity;)Luf3/a;
    .locals 0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final V1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic W(Lcom/whoop/realtime/presentation/StartActivityActivity;Llm2/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->t1(Lcom/whoop/realtime/presentation/StartActivityActivity;Llm2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final W0()V
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->e0:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->X:Ll52/a;

    invoke-virtual {v0}, Ll52/a;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lm52/a;->p:Landroidx/databinding/c0;

    iget-object v0, v0, Landroidx/databinding/c0;->a:Landroid/view/ViewStub;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->e0:Z

    return-void

    :cond_1
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0

    :cond_2
    return-void
.end method

.method private final W1(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    const/4 v4, 0x0

    const/16 v5, 0x3f

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    sget v0, Lk52/f;->g1:I

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "getString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lm/i;

    invoke-direct {v0, p0}, Lm/i;-><init>(Landroid/content/Context;)V

    sget v1, Lk52/f;->i1:I

    invoke-virtual {v0, v1}, Lm/i;->b(I)V

    iget-object v1, v0, Lm/i;->a:Lm/e;

    iput-object p1, v1, Lm/e;->f:Ljava/lang/CharSequence;

    const/4 p1, 0x0

    iput-boolean p1, v1, Lm/e;->m:Z

    sget p1, Lk52/f;->h1:I

    new-instance v1, Lo52/o0;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lo52/o0;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;I)V

    invoke-virtual {v0, p1, v1}, Lm/i;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Lm/i;

    move-result-object p1

    sget v0, Lk52/f;->l1:I

    new-instance v1, Lo52/o0;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lo52/o0;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;I)V

    invoke-virtual {p1, v0, v1}, Lm/i;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Lm/i;

    move-result-object p1

    invoke-virtual {p1}, Lm/i;->c()Lm/j;

    return-void
.end method

.method public static synthetic X(Lo52/l0;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->h1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private final X0()V
    .locals 3

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->M0()Lo52/s0;

    move-result-object v0

    invoke-virtual {v0}, Lo52/s0;->C()Landroidx/lifecycle/p0;

    move-result-object v0

    new-instance v1, Lo52/l0;

    const/4 v2, 0x4

    invoke-direct {v1, p0, v2}, Lo52/l0;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;I)V

    new-instance v2, Lcom/whoop/realtime/presentation/StartActivityActivity$l;

    invoke-direct {v2, v1}, Lcom/whoop/realtime/presentation/StartActivityActivity$l;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    return-void
.end method

.method private static final X1(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->K1()V

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method

.method public static synthetic Y(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->w1(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/view/View;)V

    return-void
.end method

.method private static final Y0(Lcom/whoop/realtime/presentation/StartActivityActivity;Lo52/t0;)Ll83/a0;
    .locals 5

    const-string v0, "startActivityViewModelEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lo52/t0;->c()Lp92/j;

    move-result-object v0

    const-string v1, "strainCoachController"

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->f0:Lcom/whoop/realtime/presentation/m;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lo52/t0;->c()Lp92/j;

    move-result-object v3

    invoke-virtual {p1}, Lo52/t0;->a()Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lcom/whoop/realtime/presentation/m;->n(Lp92/j;Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;)V

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->f0:Lcom/whoop/realtime/presentation/m;

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lo52/t0;->b()Lo52/v0;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/whoop/realtime/presentation/m;->D(Lo52/v0;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_3

    iget-object v0, v0, Lm52/a;->m:Lcom/whoop/realtime/presentation/views/DayStrainView;

    iget-object p0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->f0:Lcom/whoop/realtime/presentation/m;

    if-eqz p0, :cond_2

    invoke-virtual {p1}, Lo52/t0;->c()Lp92/j;

    move-result-object v1

    invoke-virtual {p1}, Lo52/t0;->b()Lo52/v0;

    move-result-object p1

    invoke-virtual {v0, p0, v1, p1}, Lcom/whoop/realtime/presentation/views/DayStrainView;->k(Lcom/whoop/realtime/presentation/m;Lp92/j;Lo52/v0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_3
    const-string p0, "binding"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_4
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method private static final Y1(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/content/DialogInterface;I)V
    .locals 1

    sget p2, Lk52/f;->f1:I

    const/4 v0, 0x0

    invoke-static {p0, p2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method

.method public static synthetic Z(Lcom/whoop/realtime/presentation/j;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->s1(Lcom/whoop/realtime/presentation/j;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final Z0(Llm2/b;)V
    .locals 6

    iput-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->M:Llm2/b;

    instance-of v0, p1, Llm2/c;

    instance-of v1, p1, Llm2/d;

    const-string v2, "binding"

    const/4 v3, 0x0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_3

    iget-object v0, v0, Lm52/a;->x:Lcom/whoop/ui/pills/StrokedPillButton;

    sget v1, Lk52/b;->f:I

    invoke-virtual {p0, v1}, Landroid/content/Context;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/whoop/ui/pills/StrokedPillButton;->setPillColor(I)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lm52/a;->x:Lcom/whoop/ui/pills/StrokedPillButton;

    move-object v1, p1

    check-cast v1, Llm2/c;

    invoke-virtual {v1}, Llm2/c;->s()Z

    move-result v1

    if-eqz v1, :cond_0

    sget v1, Lk52/f;->M:I

    goto :goto_0

    :cond_0
    sget v1, Lk52/f;->N:I

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lm52/a;->s:Lcom/whoop/ui/views/LiveHeartRateView;

    invoke-virtual {v0}, Lcom/whoop/ui/views/LiveHeartRateView;->m()V

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->e2()V

    goto/16 :goto_3

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_4
    if-eqz v1, :cond_f

    move-object v0, p1

    check-cast v0, Llm2/d;

    invoke-virtual {v0}, Llm2/d;->k()Lcom/whoop/service/network/model/Sport;

    move-result-object v1

    if-eqz v1, :cond_5

    sget-object v4, Lcom/whoop/ui/activities/realtime/SportCategory;->RESTORATIVE:Lcom/whoop/ui/activities/realtime/SportCategory;

    invoke-virtual {v1}, Lcom/whoop/service/network/model/Sport;->getCategory()Lcom/whoop/ui/activities/realtime/SportCategory;

    move-result-object v1

    if-ne v4, v1, :cond_5

    const/4 v1, 0x1

    goto :goto_1

    :cond_5
    const/4 v1, 0x0

    :goto_1
    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->M0()Lo52/s0;

    move-result-object v4

    invoke-virtual {v0}, Llm2/d;->k()Lcom/whoop/service/network/model/Sport;

    move-result-object v5

    invoke-virtual {v4, v5}, Lo52/s0;->F(Lcom/whoop/service/network/model/Sport;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->M0()Lo52/s0;

    move-result-object v4

    invoke-virtual {v0}, Llm2/d;->k()Lcom/whoop/service/network/model/Sport;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo52/s0;->B(Lcom/whoop/service/network/model/Sport;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    const-string v4, "stress-session"

    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-virtual {v4}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v4

    const-string v5, "sessionType"

    invoke-virtual {v4, v5, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    iget-object v4, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->Z:Lm02/a;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v4, p0, v0}, Lm02/a;->a(Landroid/content/Context;Landroid/net/Uri;)V

    :cond_6
    if-nez v1, :cond_c

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->T:Lcom/whoop/data/repositories/FeatureFlagRepository;

    sget-object v1, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->HOME_XP:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_7

    iget-object v0, v0, Lm52/a;->x:Lcom/whoop/ui/pills/StrokedPillButton;

    sget v1, Lk52/b;->a:I

    invoke-virtual {p0, v1}, Landroid/content/Context;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/whoop/ui/pills/StrokedPillButton;->setPillColor(I)V

    goto :goto_2

    :cond_7
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_8
    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_b

    iget-object v0, v0, Lm52/a;->x:Lcom/whoop/ui/pills/StrokedPillButton;

    sget v1, Lk52/b;->g:I

    invoke-virtual {p0, v1}, Landroid/content/Context;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/whoop/ui/pills/StrokedPillButton;->setPillColor(I)V

    :goto_2
    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_a

    iget-object v0, v0, Lm52/a;->x:Lcom/whoop/ui/pills/StrokedPillButton;

    sget v1, Lk52/f;->O:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_9

    iget-object v0, v0, Lm52/a;->s:Lcom/whoop/ui/views/LiveHeartRateView;

    invoke-virtual {v0}, Lcom/whoop/ui/views/LiveHeartRateView;->n()V

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->e2()V

    goto :goto_3

    :cond_9
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_a
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_b
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_c
    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->e2()V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_e

    iget-object v0, v0, Lm52/a;->x:Lcom/whoop/ui/pills/StrokedPillButton;

    sget v1, Lk52/b;->e:I

    invoke-virtual {p0, v1}, Landroid/content/Context;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/whoop/ui/pills/StrokedPillButton;->setPillColor(I)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_d

    iget-object v0, v0, Lm52/a;->s:Lcom/whoop/ui/views/LiveHeartRateView;

    invoke-virtual {v0}, Lcom/whoop/ui/views/LiveHeartRateView;->l()V

    goto :goto_3

    :cond_d
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_e
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_f
    :goto_3
    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v1, Lcom/whoop/realtime/presentation/StartActivityActivity$b;

    invoke-direct {v1, p0, v3}, Lcom/whoop/realtime/presentation/StartActivityActivity$b;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;Lq83/d;)V

    const/4 v4, 0x3

    invoke-static {v0, v3, v3, v1, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->f0:Lcom/whoop/realtime/presentation/m;

    const-string v1, "strainCoachController"

    if-eqz v0, :cond_12

    invoke-virtual {v0, p1}, Lcom/whoop/realtime/presentation/m;->B(Llm2/b;)V

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->U0()V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz p1, :cond_11

    iget-object p1, p1, Lm52/a;->C:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->f0:Lcom/whoop/realtime/presentation/m;

    if-eqz v0, :cond_10

    invoke-virtual {v0, p0}, Lcom/whoop/realtime/presentation/m;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_10
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_11
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_12
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3
.end method

.method private final Z1(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    const/4 v4, 0x0

    const/16 v5, 0x3f

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    sget v0, Lk52/f;->k1:I

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "getString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lm/i;

    invoke-direct {v0, p0}, Lm/i;-><init>(Landroid/content/Context;)V

    sget v1, Lk52/f;->i1:I

    invoke-virtual {v0, v1}, Lm/i;->b(I)V

    iget-object v1, v0, Lm/i;->a:Lm/e;

    iput-object p1, v1, Lm/e;->f:Ljava/lang/CharSequence;

    const/4 p1, 0x0

    iput-boolean p1, v1, Lm/e;->m:Z

    sget p1, Lk52/f;->V:I

    new-instance v1, Lo52/o0;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Lo52/o0;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;I)V

    invoke-virtual {v0, p1, v1}, Lm/i;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Lm/i;

    move-result-object p1

    sget v0, Lk52/f;->l1:I

    new-instance v1, Lo52/o0;

    const/4 v2, 0x5

    invoke-direct {v1, p0, v2}, Lo52/o0;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;I)V

    invoke-virtual {p1, v0, v1}, Lm/i;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Lm/i;

    move-result-object p1

    invoke-virtual {p1}, Lm/i;->c()Lm/j;

    return-void
.end method

.method public static synthetic a0(Lcom/whoop/realtime/presentation/StartActivityActivity;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->V0(Lcom/whoop/realtime/presentation/StartActivityActivity;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private final a1()V
    .locals 5

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->f0:Lcom/whoop/realtime/presentation/m;

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/whoop/realtime/presentation/m;->l()Lcom/whoop/realtime/presentation/m$b;

    move-result-object v0

    sget-object v2, Lcom/whoop/realtime/presentation/m$b;->LOCKED:Lcom/whoop/realtime/presentation/m$b;

    if-eq v0, v2, :cond_4

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->L:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_0
    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    const-string v2, "binding"

    if-eqz v0, :cond_3

    iget-object v0, v0, Lm52/a;->t:Landroid/widget/ImageButton;

    const-string v3, "lockedCoachHelpButton"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lm52/a;->u:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    new-instance v1, Lo52/q0;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lo52/q0;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;I)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance v1, Lcom/whoop/realtime/presentation/StartActivityActivity$c;

    invoke-direct {v1, p0}, Lcom/whoop/realtime/presentation/StartActivityActivity$c;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {p0}, Lm/m;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lnf1/e;->b:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    iput-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->L:Landroid/animation/ValueAnimator;

    goto :goto_0

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->V:Lz82/b;

    const-string v1, "Hide"

    const-string v2, "Start Activity - Show Strain Coach"

    const-string v3, "Recording Data"

    const-string v4, "Strain Coach"

    invoke-interface {v0, v3, v4, v1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_4
    return-void

    :cond_5
    const-string v0, "strainCoachController"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private static final a2(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/content/DialogInterface;I)V
    .locals 3

    new-instance p2, Landroid/content/Intent;

    const-string v0, "android.settings.APPLICATION_DETAILS_SETTINGS"

    invoke-direct {p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "package"

    invoke-static {v2, v0, v1}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object p2

    const-string v0, "setData(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method

.method public static synthetic b0(Lcom/whoop/realtime/presentation/StartActivityActivity;D)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/realtime/presentation/StartActivityActivity;->l1(Lcom/whoop/realtime/presentation/StartActivityActivity;D)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b1(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/animation/ValueAnimator;)V
    .locals 5

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-eqz v0, :cond_1

    iget-object v0, v0, Lm52/a;->u:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-virtual {v0, v3}, Landroid/view/View;->setAlpha(F)V

    iget-object p0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz p0, :cond_0

    iget-object p0, p0, Lm52/a;->t:Landroid/widget/ImageButton;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, p1

    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    return-void

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method private static final b2(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/content/DialogInterface;I)V
    .locals 1

    sget p2, Lk52/f;->j1:I

    const/4 v0, 0x0

    invoke-static {p0, p2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method

.method public static synthetic c0(Lcom/whoop/realtime/presentation/StartActivityActivity;D)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/realtime/presentation/StartActivityActivity;->j1(Lcom/whoop/realtime/presentation/StartActivityActivity;D)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final c1()V
    .locals 5

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->f0:Lcom/whoop/realtime/presentation/m;

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/whoop/realtime/presentation/m;->l()Lcom/whoop/realtime/presentation/m$b;

    move-result-object v0

    sget-object v2, Lcom/whoop/realtime/presentation/m$b;->LOCKED:Lcom/whoop/realtime/presentation/m$b;

    if-eq v0, v2, :cond_4

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->L:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->removeAllUpdateListeners()V

    :cond_0
    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    const-string v2, "binding"

    if-eqz v0, :cond_3

    iget-object v0, v0, Lm52/a;->u:Landroid/widget/LinearLayout;

    const-string v3, "miniDialContainer"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lm52/a;->t:Landroid/widget/ImageButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    new-instance v2, Lo52/q0;

    invoke-direct {v2, p0, v1}, Lo52/q0;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;I)V

    invoke-virtual {v0, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance v1, Lcom/whoop/realtime/presentation/StartActivityActivity$d;

    invoke-direct {v1, p0}, Lcom/whoop/realtime/presentation/StartActivityActivity$d;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {p0}, Lm/m;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lnf1/e;->b:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v1, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    iput-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->L:Landroid/animation/ValueAnimator;

    goto :goto_0

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->V:Lz82/b;

    const-string v1, "Strain Coach"

    invoke-interface {v0, v1}, Lfi0/a;->g(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->V:Lz82/b;

    const-string v2, "Show"

    const-string v3, "Start Activity - Show Strain Coach"

    const-string v4, "Recording Data"

    invoke-interface {v0, v4, v1, v2, v3}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_4
    return-void

    :cond_5
    const-string v0, "strainCoachController"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private final c2()V
    .locals 6

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->h0:Lo52/b;

    const-string v1, "activitySelector"

    const/4 v2, 0x0

    if-eqz v0, :cond_7

    invoke-interface {v0}, Lo52/b;->b()Llm2/b;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v0

    const-class v1, Lrr2/c;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrr2/c;

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v3, "select activity was null when trying to start activity"

    invoke-direct {v1, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1, v2}, Lrr2/c;->g(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v3, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->h0:Lo52/b;

    if-eqz v3, :cond_6

    invoke-interface {v3}, Lo52/b;->q()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->M:Llm2/b;

    instance-of v4, v3, Llm2/d;

    if-eqz v4, :cond_1

    check-cast v3, Llm2/d;

    goto :goto_0

    :cond_1
    move-object v3, v2

    :goto_0
    if-eqz v3, :cond_2

    invoke-virtual {v3}, Llm2/d;->k()Lcom/whoop/service/network/model/Sport;

    move-result-object v4

    goto :goto_1

    :cond_2
    move-object v4, v2

    :goto_1
    if-eqz v4, :cond_3

    invoke-virtual {p0}, Lhj0/f;->s()Lz82/e;

    move-result-object v4

    invoke-virtual {v3}, Llm2/d;->k()Lcom/whoop/service/network/model/Sport;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lcom/whoop/service/network/model/Sport;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->M0()Lo52/s0;

    move-result-object v5

    invoke-virtual {v5}, Lo52/s0;->D()Z

    move-result v5

    invoke-virtual {v4, v3, v5, v1}, Lz82/e;->y0(Ljava/lang/String;ZLjava/lang/String;)V

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, Lhj0/f;->s()Lz82/e;

    move-result-object v3

    invoke-static {v0}, Lz82/e;->f(Llm2/b;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v1}, Lz82/e;->t0(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    invoke-direct {p0, v0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->R1(Llm2/b;)V

    new-instance v1, Lnx1/a;

    const/4 v3, 0x7

    invoke-direct {v1, v3}, Lnx1/a;-><init>(I)V

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v3

    const-class v4, Lp92/i;

    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v5, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v3, v1, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp92/i;

    sget-object v3, Lcom/whoop/realtime/presentation/RealTimeRecordActivity;->u0:Lcom/whoop/realtime/presentation/RealTimeRecordActivity$a;

    invoke-virtual {v3, p0, v1}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$a;->b(Landroid/content/Context;Lp92/i;)Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;->u(Llm2/b;)Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->f0:Lcom/whoop/realtime/presentation/m;

    const-string v3, "strainCoachController"

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lcom/whoop/realtime/presentation/m;->h()Lcom/whoop/domain/model/StrainRecoveryMapping;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;->w(Lcom/whoop/domain/model/StrainRecoveryMapping;)Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->f0:Lcom/whoop/realtime/presentation/m;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/whoop/realtime/presentation/m;->k()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;->A(D)Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;

    move-result-object v0

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->M0()Lo52/s0;

    move-result-object v1

    invoke-virtual {v1}, Lo52/s0;->D()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;->v(Z)Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;

    move-result-object v0

    invoke-virtual {v0}, Lhj0/q;->m()V

    invoke-virtual {p0}, Lhj0/f;->finish()V

    invoke-virtual {v0}, Lhj0/q;->j()V

    return-void

    :cond_4
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_5
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_6
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_7
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method public static synthetic d0(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/realtime/presentation/StartActivityActivity;->b2(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method private static final d1(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/animation/ValueAnimator;)V
    .locals 6

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-eqz v0, :cond_1

    iget-object v0, v0, Lm52/a;->u:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    const/high16 v5, 0x3f800000    # 1.0f

    sub-float/2addr v5, v3

    invoke-virtual {v0, v5}, Landroid/view/View;->setAlpha(F)V

    iget-object p0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz p0, :cond_0

    iget-object p0, p0, Lm52/a;->t:Landroid/widget/ImageButton;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    return-void

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method private static final d2()Luf3/a;
    .locals 1

    const/16 v0, 0x36

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e0(Lcom/whoop/realtime/presentation/StartActivityActivity;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->i1(Lcom/whoop/realtime/presentation/StartActivityActivity;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final e1()Luf3/a;
    .locals 1

    const/16 v0, 0x36

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private final e2()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-eqz v0, :cond_7

    iget-object v0, v0, Lm52/a;->z:Landroid/widget/LinearLayout;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_6

    iget-object v0, v0, Lm52/a;->f:Landroid/widget/LinearLayout;

    sget v3, Lvu1/a;->n:I

    invoke-virtual {p0, v3}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->T:Lcom/whoop/data/repositories/FeatureFlagRepository;

    sget-object v3, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->HOME_XP:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {v0, v3}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lm52/a;->x:Lcom/whoop/ui/pills/StrokedPillButton;

    sget v3, Lk52/b;->a:I

    invoke-virtual {p0, v3}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/whoop/ui/pills/StrokedPillButton;->setPillColor(I)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lm52/a;->x:Lcom/whoop/ui/pills/StrokedPillButton;

    sget v3, Lk52/b;->a:I

    invoke-virtual {p0, v3}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/whoop/ui/pills/StrokedPillButton;->setStrokeColor(I)V

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_5

    iget-object v0, v0, Lm52/a;->x:Lcom/whoop/ui/pills/StrokedPillButton;

    sget v3, Lvu1/a;->b0:I

    invoke-virtual {p0, v3}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/whoop/ui/pills/StrokedPillButton;->setPillColor(I)V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_4

    iget-object v0, v0, Lm52/a;->x:Lcom/whoop/ui/pills/StrokedPillButton;

    sget v3, Lvu1/a;->b0:I

    invoke-virtual {p0, v3}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Lcom/whoop/ui/pills/StrokedPillButton;->setStrokeColor(I)V

    :goto_0
    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_3

    iget-object v0, v0, Lm52/a;->x:Lcom/whoop/ui/pills/StrokedPillButton;

    sget v1, Lk52/f;->u1:I

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_7
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public static synthetic f0(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/realtime/presentation/StartActivityActivity;->F1(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method private static final f1()Luf3/a;
    .locals 1

    const/16 v0, 0x32

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private final f2()V
    .locals 5

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-eqz v0, :cond_5

    iget-object v0, v0, Lm52/a;->B:Lcom/whoop/ui/WhoopSwitch;

    invoke-virtual {v0}, Lcom/whoop/ui/WhoopSwitch;->isChecked()Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lm52/a;->B:Lcom/whoop/ui/WhoopSwitch;

    invoke-virtual {v0, v3}, Lcom/whoop/ui/WhoopSwitch;->setChecked(Z)V

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_4

    iget-object v0, v0, Lm52/a;->n:Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;

    invoke-virtual {v0}, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->getStrainGoal()F

    move-result v0

    const/4 v4, 0x0

    cmpl-float v0, v0, v4

    if-lez v0, :cond_3

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lm52/a;->n:Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;

    invoke-virtual {v0, v4}, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->v(F)V

    goto :goto_1

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_3
    :goto_1
    invoke-direct {p0, v3}, Lcom/whoop/realtime/presentation/StartActivityActivity;->Q1(Z)V

    return-void

    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public static synthetic g0(Lo52/l0;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->m1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private static final g1(Lcom/whoop/realtime/presentation/StartActivityActivity;I)Ll83/a0;
    .locals 3

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->J:Ltr2/n;

    const-string v1, "STRAINCOACH: BottomSheetBehavior state change: "

    invoke-static {p1, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->a1()V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->c1()V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final g2()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    const-string v1, "binding"

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    iget-object v0, v0, Lm52/a;->B:Lcom/whoop/ui/WhoopSwitch;

    invoke-virtual {v0}, Lcom/whoop/ui/WhoopSwitch;->isChecked()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->f0:Lcom/whoop/realtime/presentation/m;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/realtime/presentation/m;->l()Lcom/whoop/realtime/presentation/m$b;

    move-result-object v0

    sget-object v3, Lcom/whoop/realtime/presentation/m$b;->LOCKED:Lcom/whoop/realtime/presentation/m$b;

    if-eq v0, v3, :cond_2

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lm52/a;->B:Lcom/whoop/ui/WhoopSwitch;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/whoop/ui/WhoopSwitch;->setChecked(Z)V

    return-void

    :cond_0
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_1
    const-string v0, "strainCoachController"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_2
    return-void

    :cond_3
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method public static synthetic h0(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/realtime/presentation/StartActivityActivity;->D0(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/view/View;Lh5/q1;)Lh5/q1;

    move-result-object p0

    return-object p0
.end method

.method private static final h1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final h2(D)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lm52/a;->m:Lcom/whoop/realtime/presentation/views/DayStrainView;

    invoke-virtual {v0, p1, p2}, Lcom/whoop/realtime/presentation/views/DayStrainView;->setEstimatedDayStrain(D)V

    return-void

    :cond_0
    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public static synthetic i0(Lcom/whoop/realtime/presentation/StartActivityActivity;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->g1(Lcom/whoop/realtime/presentation/StartActivityActivity;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final i1(Lcom/whoop/realtime/presentation/StartActivityActivity;Z)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->i0:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    if-eqz p0, :cond_0

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_0
    const-string p0, "bottomSheetBehavior"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method private final i2(Lq83/d;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/realtime/presentation/StartActivityActivity$o;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/realtime/presentation/StartActivityActivity$o;

    iget v1, v0, Lcom/whoop/realtime/presentation/StartActivityActivity$o;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/realtime/presentation/StartActivityActivity$o;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/realtime/presentation/StartActivityActivity$o;

    invoke-direct {v0, p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity$o;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/realtime/presentation/StartActivityActivity$o;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/realtime/presentation/StartActivityActivity$o;->z:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget v0, v0, Lcom/whoop/realtime/presentation/StartActivityActivity$o;->w:I

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->M:Llm2/b;

    if-eqz p1, :cond_19

    instance-of v2, p1, Llm2/d;

    if-eqz v2, :cond_3

    check-cast p1, Llm2/d;

    invoke-virtual {p1}, Llm2/d;->k()Lcom/whoop/service/network/model/Sport;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/whoop/service/network/model/Sport;->getHasGps()Z

    move-result p1

    if-eqz p1, :cond_3

    move p1, v3

    goto :goto_1

    :cond_3
    move p1, v4

    :goto_1
    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->M0()Lo52/s0;

    move-result-object v2

    iput p1, v0, Lcom/whoop/realtime/presentation/StartActivityActivity$o;->w:I

    iput v3, v0, Lcom/whoop/realtime/presentation/StartActivityActivity$o;->z:I

    invoke-virtual {v2, v0}, Lo52/s0;->G(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_4

    return-object v1

    :cond_4
    move-object v12, v0

    move v0, p1

    move-object p1, v12

    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-boolean v1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->O:Z

    const/4 v2, 0x0

    const-string v3, "nonGpsBackground"

    const-string v5, "gpsSwitchContainer"

    const-string v6, "gpsMap"

    const/4 v7, 0x4

    const-string v8, "binding"

    if-eqz v1, :cond_10

    if-eqz p1, :cond_10

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz p1, :cond_f

    iget-object p1, p1, Lm52/a;->q:Lcom/whoop/ui/WhoopSwitch;

    invoke-virtual {p1}, Lcom/whoop/ui/WhoopSwitch;->isChecked()Z

    move-result p1

    iget-object v1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->b0:Ln73/b;

    invoke-interface {v1}, Ln73/b;->isDisposed()Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->h0:Lo52/b;

    if-eqz v1, :cond_5

    invoke-interface {v1}, Lo52/b;->r()Ll73/c;

    move-result-object v1

    new-instance v9, Lo52/l0;

    const/4 v10, 0x0

    invoke-direct {v9, p0, v10}, Lo52/l0;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;I)V

    new-instance v10, Lmm/d;

    const/16 v11, 0xa

    invoke-direct {v10, v9, v11}, Lmm/d;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v9, Lt73/b;

    sget-object v11, Lr73/a;->d:Ljc/a;

    invoke-direct {v9, v10, v11}, Lt73/b;-><init>(Lp73/b;Lp73/b;)V

    invoke-virtual {v1, v9}, Ll73/c;->c(Ll73/d;)V

    iput-object v9, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->b0:Ln73/b;

    goto :goto_3

    :cond_5
    const-string p1, "activitySelector"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_6
    :goto_3
    if-eqz v0, :cond_8

    if-eqz p1, :cond_7

    const/high16 p1, 0x3f800000    # 1.0f

    goto :goto_4

    :cond_7
    const/4 p1, 0x0

    :goto_4
    invoke-direct {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->H0(F)V

    :cond_8
    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->c0:Lm52/m;

    if-eqz p1, :cond_b

    iget-object p1, p1, Lm52/m;->a:Lcom/mapbox/maps/MapView;

    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v0, :cond_a

    iget-object v1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v1, :cond_9

    iget-object v1, v1, Lm52/a;->q:Lcom/whoop/ui/WhoopSwitch;

    invoke-virtual {v1}, Lcom/whoop/ui/WhoopSwitch;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_a

    move v1, v4

    goto :goto_5

    :cond_9
    invoke-static {v8}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_a
    const/16 v1, 0x8

    :goto_5
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_b
    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz p1, :cond_e

    iget-object p1, p1, Lm52/a;->r:Landroid/widget/LinearLayout;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v0, :cond_c

    move v4, v7

    :cond_c
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz p1, :cond_d

    iget-object p1, p1, Lm52/a;->v:Landroid/widget/ImageView;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v7}, Landroid/view/View;->setVisibility(I)V

    goto :goto_8

    :cond_d
    invoke-static {v8}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_e
    invoke-static {v8}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_f
    invoke-static {v8}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v1, :cond_18

    iget-object v1, v1, Lm52/a;->q:Lcom/whoop/ui/WhoopSwitch;

    invoke-virtual {v1}, Lcom/whoop/ui/WhoopSwitch;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_12

    iget-object v1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v1, :cond_11

    iget-object v1, v1, Lm52/a;->q:Lcom/whoop/ui/WhoopSwitch;

    invoke-virtual {v1, v4}, Lcom/whoop/ui/WhoopSwitch;->setChecked(Z)V

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->M0()Lo52/s0;

    move-result-object v1

    invoke-virtual {v1, v4}, Lo52/s0;->H(Z)V

    goto :goto_6

    :cond_11
    invoke-static {v8}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_12
    :goto_6
    iget-object v1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->c0:Lm52/m;

    if-eqz v1, :cond_13

    iget-object v1, v1, Lm52/m;->a:Lcom/mapbox/maps/MapView;

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    :cond_13
    iget-object v1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v1, :cond_17

    iget-object v1, v1, Lm52/a;->r:Landroid/widget/LinearLayout;

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_15

    if-nez v0, :cond_14

    goto :goto_7

    :cond_14
    move v7, v4

    :cond_15
    :goto_7
    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz p1, :cond_16

    iget-object p1, p1, Lm52/a;->v:Landroid/widget/ImageView;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    goto :goto_8

    :cond_16
    invoke-static {v8}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_17
    invoke-static {v8}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_18
    invoke-static {v8}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_19
    :goto_8
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public static synthetic j0(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/realtime/presentation/StartActivityActivity;->G1(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method private static final j1(Lcom/whoop/realtime/presentation/StartActivityActivity;D)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/realtime/presentation/StartActivityActivity;->l2(D)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j2(Lcom/whoop/realtime/presentation/StartActivityActivity;Ljava/lang/Boolean;)Ll83/a0;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lm52/a;->q:Lcom/whoop/ui/WhoopSwitch;

    invoke-virtual {p1}, Lcom/whoop/ui/WhoopSwitch;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const-string p0, "binding"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    :cond_1
    move p1, v0

    :goto_0
    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->M0()Lo52/s0;

    move-result-object v1

    invoke-virtual {v1, p1}, Lo52/s0;->H(Z)V

    iget-object p0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->c0:Lm52/m;

    if-eqz p0, :cond_3

    iget-object p0, p0, Lm52/m;->a:Lcom/mapbox/maps/MapView;

    const-string v1, "gpsMap"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_2

    const/4 v0, 0x4

    :cond_2
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic k0(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/realtime/presentation/StartActivityActivity;->X1(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method private static final k1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final k2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic l0()Luf3/a;
    .locals 1

    invoke-static {}, Lcom/whoop/realtime/presentation/StartActivityActivity;->e1()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private static final l1(Lcom/whoop/realtime/presentation/StartActivityActivity;D)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/realtime/presentation/StartActivityActivity;->h2(D)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final l2(D)V
    .locals 6

    const-wide/high16 v0, 0x4035000000000000L    # 21.0

    div-double v0, p1, v0

    double-to-float v0, v0

    const-wide/16 v1, 0x0

    cmpg-double v1, p1, v1

    if-nez v1, :cond_0

    sget v1, Lk52/f;->t1:I

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Lcom/whoop/ui/f;->h(D)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    const-string v3, "binding"

    const/4 v4, 0x0

    if-eqz v2, :cond_b

    iget-object v2, v2, Lm52/a;->L:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v2, :cond_a

    iget-object v2, v2, Lm52/a;->G:Lcom/whoop/ui/ProgressDial;

    invoke-virtual {v2, v0}, Lcom/whoop/ui/ProgressDial;->setProgress(F)V

    iget-object v2, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v2, :cond_9

    iget-object v2, v2, Lm52/a;->H:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v1, :cond_8

    iget-object v1, v1, Lm52/a;->D:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->f0:Lcom/whoop/realtime/presentation/m;

    const-string v5, "strainCoachController"

    if-eqz v2, :cond_7

    invoke-virtual {v2, p0}, Lcom/whoop/realtime/presentation/m;->m(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v1, :cond_6

    iget-object v1, v1, Lm52/a;->C:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->f0:Lcom/whoop/realtime/presentation/m;

    if-eqz v2, :cond_5

    invoke-virtual {v2, p0}, Lcom/whoop/realtime/presentation/m;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v1, :cond_4

    iget-object v1, v1, Lm52/a;->n:Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;

    invoke-virtual {v1}, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->y()Z

    move-result v1

    if-nez v1, :cond_2

    const/4 v1, 0x0

    cmpl-float v1, v0, v1

    if-lez v1, :cond_1

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->g2()V

    :cond_1
    invoke-direct {p0, v0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->T0(F)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->Q1(Z)V

    :cond_2
    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_3

    iget-object v0, v0, Lm52/a;->m:Lcom/whoop/realtime/presentation/views/DayStrainView;

    invoke-virtual {v0, p1, p2}, Lcom/whoop/realtime/presentation/views/DayStrainView;->setActivityStrain(D)V

    return-void

    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_4
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_5
    invoke-static {v5}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_6
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_7
    invoke-static {v5}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_8
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_9
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_a
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_b
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4
.end method

.method public static synthetic m0(Lcom/whoop/realtime/presentation/StartActivityActivity;Lpg3/v0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->S1(Lcom/whoop/realtime/presentation/StartActivityActivity;Lpg3/v0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final m1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic n0(Lo52/l0;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->o1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private static final n1(Lcom/whoop/realtime/presentation/StartActivityActivity;Ljava/lang/Boolean;)Ll83/a0;
    .locals 4

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-eqz v0, :cond_3

    iget-object v0, v0, Lm52/a;->k:Lcom/whoop/ui/LockableNestedScrollView;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v0, v3}, Lcom/whoop/ui/LockableNestedScrollView;->setLock(Z)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lm52/a;->n:Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;

    invoke-virtual {v0}, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->getStrainGoal()F

    move-result v0

    float-to-double v0, v0

    const-wide/high16 v2, 0x4035000000000000L    # 21.0

    mul-double/2addr v0, v2

    const-wide v2, 0x3fb99999a0000000L    # 0.10000000149011612

    cmpg-double v0, v0, v2

    if-gez v0, :cond_1

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->f2()V

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->V:Lz82/b;

    const-string p1, "Adjust"

    const-string v0, "Start Activity - Adjust Target Strain"

    const-string v1, "Recording Data"

    const-string v2, "Strain Coach"

    invoke-interface {p0, v1, v2, p1, v0}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public static synthetic o0(Lo52/l0;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->T1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private static final o1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic p0(Lcom/whoop/realtime/presentation/StartActivityActivity;Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->O1(Lcom/whoop/realtime/presentation/StartActivityActivity;Ljava/lang/Exception;)V

    return-void
.end method

.method private static final p1(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/view/View;)V
    .locals 6

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->S:Lor2/y;

    sget p1, Lnf1/g;->d:I

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string p1, "getString(...)"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v5}, Lor2/y;->y(Lor2/y;Landroid/app/Activity;Ljava/lang/String;ZILjava/lang/Object;)V

    return-void
.end method

.method public static synthetic q0(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->p1(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/view/View;)V

    return-void
.end method

.method private static final q1(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/view/ViewStub;Landroid/view/View;)V
    .locals 0

    invoke-static {p2}, Landroidx/databinding/g;->a(Landroid/view/View;)Landroidx/databinding/a0;

    move-result-object p1

    check-cast p1, Lm52/m;

    iput-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->c0:Lm52/m;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lm52/m;->a:Lcom/mapbox/maps/MapView;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/mapbox/maps/MapView;->getMapboxMap()Lcom/mapbox/maps/MapboxMap;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->P1(Lcom/mapbox/maps/MapboxMap;)V

    :cond_0
    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->z1()V

    return-void
.end method

.method public static synthetic r0(Lo52/l0;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->V1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private static final r1(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->S:Lor2/y;

    invoke-virtual {p1, p0}, Lor2/y;->u(Landroid/app/Activity;)V

    return-void
.end method

.method public static synthetic s0(Lcom/whoop/realtime/presentation/StartActivityActivity;Lo52/t0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->Y0(Lcom/whoop/realtime/presentation/StartActivityActivity;Lo52/t0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final s1(Lcom/whoop/realtime/presentation/j;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/realtime/presentation/j;->t0()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic t0(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->r1(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/view/View;)V

    return-void
.end method

.method private static final t1(Lcom/whoop/realtime/presentation/StartActivityActivity;Llm2/b;)Ll83/a0;
    .locals 3

    const-string v0, "addableActivity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->Z0(Llm2/b;)V

    invoke-virtual {p0}, Lhj0/f;->s()Lz82/e;

    move-result-object v0

    invoke-static {p1}, Lz82/e;->f(Llm2/b;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lz82/e;->i0(Ljava/lang/String;)V

    instance-of v0, p1, Llm2/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Llm2/d;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->J0()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->L0()Ljava/lang/Integer;

    move-result-object v0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Llm2/d;->k()Lcom/whoop/service/network/model/Sport;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/whoop/service/network/model/Sport;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_1
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->K1()V

    :cond_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic u0(Lm52/m;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->I0(Lm52/m;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method private static final u1(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lhj0/f;->finish()V

    return-void
.end method

.method public static synthetic v0(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->v1(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/view/View;)V

    return-void
.end method

.method private static final v1(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->K1()V

    return-void
.end method

.method public static final synthetic w0(Lcom/whoop/realtime/presentation/StartActivityActivity;)Lm52/a;
    .locals 0

    iget-object p0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    return-object p0
.end method

.method private static final w1(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->U0()V

    return-void
.end method

.method public static final synthetic x0(Lcom/whoop/realtime/presentation/StartActivityActivity;)Lcom/whoop/data/repositories/UserRepository;
    .locals 0

    iget-object p0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->Y:Lcom/whoop/data/repositories/UserRepository;

    return-object p0
.end method

.method private static final x1(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/view/View;)V
    .locals 8

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->i0:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    const-string v0, "bottomSheetBehavior"

    const/4 v1, 0x0

    if-eqz p1, :cond_c

    iget p1, p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:I

    const/4 v2, 0x4

    const-string v3, "binding"

    if-ne p1, v2, :cond_2

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz p1, :cond_1

    iget-object p1, p1, Lm52/a;->B:Lcom/whoop/ui/WhoopSwitch;

    invoke-virtual {p1}, Lcom/whoop/ui/WhoopSwitch;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->i0:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    if-eqz p1, :cond_0

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->W(I)V

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->f0:Lcom/whoop/realtime/presentation/m;

    const-string v0, "strainCoachController"

    if-eqz p1, :cond_b

    invoke-virtual {p1}, Lcom/whoop/realtime/presentation/m;->l()Lcom/whoop/realtime/presentation/m$b;

    move-result-object p1

    sget-object v2, Lcom/whoop/realtime/presentation/m$b;->LOCKED:Lcom/whoop/realtime/presentation/m$b;

    if-eq p1, v2, :cond_8

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz p1, :cond_7

    iget-object p1, p1, Lm52/a;->B:Lcom/whoop/ui/WhoopSwitch;

    invoke-virtual {p1}, Lcom/whoop/ui/WhoopSwitch;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->f0:Lcom/whoop/realtime/presentation/m;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/whoop/realtime/presentation/m;->g()D

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmpl-double p1, v4, v6

    if-lez p1, :cond_3

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->g2()V

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->U0()V

    goto :goto_1

    :cond_3
    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->f2()V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz p1, :cond_4

    iget-object p1, p1, Lm52/a;->n:Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;

    invoke-virtual {p1}, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->B()V

    goto :goto_1

    :cond_4
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_5
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_6
    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->f2()V

    goto :goto_1

    :cond_7
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_8
    :goto_1
    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->V:Lz82/b;

    iget-object p0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz p0, :cond_a

    iget-object p0, p0, Lm52/a;->B:Lcom/whoop/ui/WhoopSwitch;

    invoke-virtual {p0}, Lcom/whoop/ui/WhoopSwitch;->isChecked()Z

    move-result p0

    if-eqz p0, :cond_9

    const-string p0, "On"

    goto :goto_2

    :cond_9
    const-string p0, "Off"

    :goto_2
    const-string v0, "Start Activity - Toggle Strain Coach"

    const-string v1, "Recording Data"

    const-string v2, "Strain Coach"

    invoke-interface {p1, v1, v2, p0, v0}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_a
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_b
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_c
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public static final synthetic y0(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/animation/ValueAnimator;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->L:Landroid/animation/ValueAnimator;

    return-void
.end method

.method private static final y1(Lcom/whoop/realtime/presentation/StartActivityActivity;Ljava/lang/Boolean;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->D1()V

    return-void
.end method

.method private final z1()V
    .locals 4

    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {p0, v0}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {p0, v0}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_2

    :goto_0
    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->c0:Lm52/m;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lm52/m;->a:Lcom/mapbox/maps/MapView;

    if-eqz v0, :cond_1

    const-string v1, "MAPBOX_COMPASS_PLUGIN_ID"

    invoke-interface {v0, v1}, Lmv/f;->getPlugin(Ljava/lang/String;)Lev/j;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v1, Lkv/d;

    iget-object v2, v1, Lkv/d;->H:Llv/b;

    invoke-virtual {v2}, Llv/b;->b()Llv/a;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/realtime/presentation/StartActivityActivity;->A1(Llv/a;)Ll83/a0;

    invoke-virtual {v2}, Llv/a;->a()Llv/b;

    move-result-object v2

    iput-object v2, v1, Lkv/d;->H:Llv/b;

    invoke-virtual {v1}, Lkv/d;->b()V

    const-string v1, "MAPBOX_SCALEBAR_PLUGIN_ID"

    invoke-interface {v0, v1}, Lmv/f;->getPlugin(Ljava/lang/String;)Lev/j;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v0, Lxv/g;

    invoke-virtual {v0}, Lxv/g;->h()V

    :cond_1
    invoke-virtual {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->getMapboxMap()Lcom/mapbox/maps/MapboxMap;

    move-result-object v0

    const-string v1, "mapbox://styles/mapbox/streets-v12"

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2, v3}, Lcom/mapbox/maps/MapboxMap;->loadStyle$default(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Lcom/mapbox/maps/Style$OnStyleLoaded;ILjava/lang/Object;)V

    new-instance v1, Lny0/m;

    const/16 v2, 0x17

    invoke-direct {v1, v2}, Lny0/m;-><init>(I)V

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/MapboxMap;->gesturesPlugin(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->B0()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->O:Z

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v1, Lcom/whoop/realtime/presentation/StartActivityActivity$e;

    invoke-direct {v1, p0, v3}, Lcom/whoop/realtime/presentation/StartActivityActivity$e;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {v0, v3, v3, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_2
    new-instance v0, Lnu/b;

    invoke-direct {v0, p0}, Lnu/b;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;)V

    invoke-virtual {v0, p0}, Lnu/b;->a(Lcom/whoop/realtime/presentation/StartActivityActivity;)V

    iput-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->N:Lnu/b;

    return-void
.end method


# virtual methods
.method public P1(Lcom/mapbox/maps/MapboxMap;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->I:Lcom/mapbox/maps/MapboxMap;

    return-void
.end method

.method public a()Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lm52/a;->N:Landroid/widget/LinearLayout;

    const-string v1, "toolbarContainer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public b(Z)V
    .locals 3

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->O:Z

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->E0()V

    goto :goto_0

    :cond_0
    const-string p1, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const/4 v0, -0x1

    filled-new-array {v0}, [I

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->N0(Ljava/util/List;[I)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->O:Z

    :goto_0
    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object p1

    new-instance v0, Lcom/whoop/realtime/presentation/StartActivityActivity$f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/whoop/realtime/presentation/StartActivityActivity$f;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {p1, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-virtual {p0}, Lhj0/f;->s()Lz82/e;

    move-result-object p1

    iget-boolean v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->O:Z

    invoke-virtual {p1, v0}, Lz82/e;->R(Z)V

    return-void
.end method

.method public c()V
    .locals 3

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->d0:Lo52/r0;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->a0:Lcom/mapbox/common/location/LocationProvider;

    if-eqz v1, :cond_1

    if-eqz v0, :cond_0

    invoke-interface {v1, v0}, Lcom/mapbox/common/location/LocationProvider;->removeLocationObserver(Lcom/mapbox/common/location/LocationObserver;)V

    goto :goto_0

    :cond_0
    const-string v0, "callback"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->J:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "LocationObserver is removed"

    invoke-interface {v0, v2, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_2
    return-void
.end method

.method public d()Landroid/widget/TextView;
    .locals 2

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lm52/a;->e:Landroid/widget/TextView;

    const-string v1, "activityTitle"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public e(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "permissionsToExplain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public f()Landroid/widget/ImageView;
    .locals 2

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lm52/a;->b:Lcom/whoop/ui/views/ColoredImageView;

    const-string v1, "activityIcon"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public g()Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lm52/a;->M:Lcom/whoop/ui/views/ColoredImageView;

    const-string v1, "toolBarArrow"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public getMapboxMap()Lcom/mapbox/maps/MapboxMap;
    .locals 1

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->I:Lcom/mapbox/maps/MapboxMap;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mapboxMap"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public h()Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lm52/a;->c:Landroidx/fragment/app/FragmentContainerView;

    const-string v1, "activityListFragment"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    const/16 v0, 0xd7

    if-ne v0, p1, :cond_2

    if-nez p2, :cond_1

    sget p1, Lk52/f;->c1:I

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lm52/a;->q:Lcom/whoop/ui/WhoopSwitch;

    invoke-virtual {p1, p2}, Lcom/whoop/ui/WhoopSwitch;->setChecked(Z)V

    return-void

    :cond_0
    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    return-void

    :cond_2
    invoke-super {p0, p1, p2, p3}, Lhj0/f;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 10

    invoke-super {p0, p1}, Lhj0/f;->onCreate(Landroid/os/Bundle;)V

    invoke-static {p0}, Lcom/whoop/realtime/service/b;->x(Landroid/content/Context;)Z

    move-result p1

    const-class v0, Lp92/i;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    new-instance p1, Lnx1/a;

    const/16 v2, 0x8

    invoke-direct {p1, v2}, Lnx1/a;-><init>(I)V

    invoke-static {v0, v1, p1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp92/i;

    sget-object v0, Lcom/whoop/realtime/presentation/RealTimeRecordActivity;->u0:Lcom/whoop/realtime/presentation/RealTimeRecordActivity$a;

    invoke-virtual {v0, p0, p1}, Lcom/whoop/realtime/presentation/RealTimeRecordActivity$a;->b(Landroid/content/Context;Lp92/i;)Lcom/whoop/realtime/presentation/RealTimeRecordActivity$b;

    move-result-object p1

    invoke-virtual {p1}, Lhj0/q;->m()V

    invoke-virtual {p0}, Lhj0/f;->finish()V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->X0()V

    new-instance p1, Lnx1/a;

    const/4 v2, 0x6

    invoke-direct {p1, v2}, Lnx1/a;-><init>(I)V

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v2

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {v2, p1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp92/i;

    iput-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->g0:Lp92/i;

    new-instance p1, Lcom/whoop/realtime/presentation/m;

    invoke-direct {p1, p0}, Lcom/whoop/realtime/presentation/m;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->f0:Lcom/whoop/realtime/presentation/m;

    invoke-virtual {p0}, Lhj0/f;->B()V

    sget p1, Lk52/e;->b:I

    invoke-static {p0, p1}, Landroidx/databinding/g;->d(Lm/m;I)Landroidx/databinding/a0;

    move-result-object p1

    const-string v0, "setContentView(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lm52/a;

    iput-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    iget-object p1, p1, Lm52/a;->f:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    move-result p1

    iput p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->Q:I

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    const-string v0, "binding"

    if-eqz p1, :cond_22

    iget-object p1, p1, Lm52/a;->N:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    move-result p1

    iput p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->R:I

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->C0()V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz p1, :cond_21

    iget-object p1, p1, Lm52/a;->p:Landroidx/databinding/c0;

    new-instance v2, Lo52/t;

    const/4 v4, 0x1

    invoke-direct {v2, p0, v4}, Lo52/t;-><init>(Ljava/lang/Object;I)V

    iget-object v4, p1, Landroidx/databinding/c0;->a:Landroid/view/ViewStub;

    if-eqz v4, :cond_1

    iput-object v2, p1, Landroidx/databinding/c0;->d:Landroid/view/ViewStub$OnInflateListener;

    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/r0;->getSupportFragmentManager()Landroidx/fragment/app/o1;

    move-result-object p1

    const-string v2, "getSupportFragmentManager(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "selectActivityFragment"

    invoke-virtual {p1, v2}, Landroidx/fragment/app/o1;->E(Ljava/lang/String;)Landroidx/fragment/app/m0;

    move-result-object v4

    check-cast v4, Lcom/whoop/realtime/presentation/j;

    if-nez v4, :cond_2

    new-instance v4, Lcom/whoop/realtime/presentation/j;

    invoke-direct {v4}, Lcom/whoop/realtime/presentation/j;-><init>()V

    :cond_2
    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->L0()Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/whoop/realtime/presentation/j;->g(Ljava/lang/Integer;)V

    invoke-virtual {v4}, Landroidx/fragment/app/m0;->isAdded()Z

    move-result v5

    if-nez v5, :cond_4

    new-instance v5, Landroidx/fragment/app/a;

    invoke-direct {v5, p1}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/o1;)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz p1, :cond_3

    iget-object p1, p1, Lm52/a;->c:Landroidx/fragment/app/FragmentContainerView;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const/4 v6, 0x1

    invoke-virtual {v5, p1, v4, v2, v6}, Landroidx/fragment/app/a;->d(ILandroidx/fragment/app/m0;Ljava/lang/String;I)V

    invoke-virtual {v5}, Landroidx/fragment/app/a;->j()I

    goto :goto_0

    :cond_3
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_4
    :goto_0
    iput-object v4, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->h0:Lo52/b;

    invoke-virtual {v4}, Lcom/whoop/realtime/presentation/j;->i0()V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz p1, :cond_20

    iget-object p1, p1, Lm52/a;->a:Landroid/widget/LinearLayout;

    const-string v2, "activityContainer"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lo52/g0;

    const/4 v5, 0x5

    invoke-direct {v2, v4, v5}, Lo52/g0;-><init>(Lcom/whoop/realtime/presentation/j;I)V

    invoke-static {p1, v2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->h0:Lo52/b;

    const-string v2, "activitySelector"

    if-eqz p1, :cond_1f

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->L0()Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p1, v4}, Lo52/b;->g(Ljava/lang/Integer;)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->h0:Lo52/b;

    if-eqz p1, :cond_1e

    new-instance v4, Lo52/l0;

    const/4 v5, 0x3

    invoke-direct {v4, p0, v5}, Lo52/l0;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;I)V

    invoke-interface {p1, v4}, Lo52/b;->f(Lkotlin/jvm/functions/Function1;)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz p1, :cond_1d

    iget-object p1, p1, Lm52/a;->g:Landroid/widget/ImageView;

    new-instance v4, Lo52/n0;

    const/4 v5, 0x2

    invoke-direct {v4, p0, v5}, Lo52/n0;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;I)V

    invoke-virtual {p1, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz p1, :cond_1c

    iget-object p1, p1, Lm52/a;->x:Lcom/whoop/ui/pills/StrokedPillButton;

    new-instance v4, Lo52/n0;

    const/4 v5, 0x3

    invoke-direct {v4, p0, v5}, Lo52/n0;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;I)V

    invoke-virtual {p1, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz p1, :cond_1b

    iget-object p1, p1, Lm52/a;->I:Landroid/widget/ImageButton;

    new-instance v4, Lo52/n0;

    const/4 v5, 0x4

    invoke-direct {v4, p0, v5}, Lo52/n0;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;I)V

    invoke-virtual {p1, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz p1, :cond_1a

    iget-object p1, p1, Lm52/a;->B:Lcom/whoop/ui/WhoopSwitch;

    new-instance v4, Lo52/n0;

    const/4 v5, 0x5

    invoke-direct {v4, p0, v5}, Lo52/n0;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;I)V

    invoke-virtual {p1, v4}, Lcom/whoop/ui/WhoopSwitch;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz p1, :cond_19

    iget-object p1, p1, Lm52/a;->q:Lcom/whoop/ui/WhoopSwitch;

    new-instance v4, Lo52/m0;

    const/4 v5, 0x3

    invoke-direct {v4, p0, v5}, Lo52/m0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v4}, Lcom/whoop/ui/WhoopSwitch;->setOnCheckedChangeListener(Lbh3/b;)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz p1, :cond_18

    iget-object v4, p1, Lm52/a;->w:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    sget v5, Lk52/b;->i:I

    sget v6, Lk52/b;->h:I

    const/4 v8, 0x0

    sget-object v9, Lq52/d;->a:Lq52/d$c;

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lq52/d;->b(Landroid/view/View;IIFFLq52/d$c;)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz p1, :cond_17

    iget-object p1, p1, Lm52/a;->z:Landroid/widget/LinearLayout;

    invoke-static {p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->O(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->i0:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    new-instance v4, Lq52/b;

    invoke-direct {v4, p1}, Lq52/b;-><init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V

    invoke-virtual {v4}, Lq52/b;->d()Lxg3/g;

    move-result-object p1

    new-instance v4, Lo52/l0;

    const/16 v5, 0x8

    invoke-direct {v4, p0, v5}, Lo52/l0;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;I)V

    new-instance v5, Lo52/m0;

    const/4 v6, 0x6

    invoke-direct {v5, v4, v6}, Lo52/m0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v5}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object p1

    invoke-virtual {p0, p1}, Lhj0/f;->o(Lxg3/t;)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->i0:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    if-eqz p1, :cond_16

    const/4 v4, 0x4

    invoke-virtual {p1, v4}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->W(I)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->h0:Lo52/b;

    if-eqz p1, :cond_15

    new-instance v2, Lo52/l0;

    const/16 v4, 0x9

    invoke-direct {v2, p0, v4}, Lo52/l0;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;I)V

    invoke-interface {p1, v2}, Lo52/b;->i(Lkotlin/jvm/functions/Function1;)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz p1, :cond_14

    iget-object p1, p1, Lm52/a;->L:Landroid/widget/TextView;

    const-string v2, "--"

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->f0:Lcom/whoop/realtime/presentation/m;

    const-string v2, "strainCoachController"

    if-eqz p1, :cond_13

    invoke-virtual {p1}, Lcom/whoop/realtime/presentation/m;->A()Llh3/e;

    move-result-object p1

    invoke-virtual {p1}, Lxg3/g;->G()Lxg3/g;

    move-result-object p1

    new-instance v4, Lo52/l0;

    const/16 v5, 0xa

    invoke-direct {v4, p0, v5}, Lo52/l0;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;I)V

    new-instance v5, Lo52/m0;

    const/4 v6, 0x0

    invoke-direct {v5, v4, v6}, Lo52/m0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v5}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object p1

    invoke-virtual {p0, p1}, Lhj0/f;->o(Lxg3/t;)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->f0:Lcom/whoop/realtime/presentation/m;

    if-eqz p1, :cond_12

    invoke-virtual {p1}, Lcom/whoop/realtime/presentation/m;->z()Llh3/e;

    move-result-object p1

    invoke-virtual {p1}, Lxg3/g;->G()Lxg3/g;

    move-result-object p1

    new-instance v4, Lo52/l0;

    const/4 v5, 0x1

    invoke-direct {v4, p0, v5}, Lo52/l0;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;I)V

    new-instance v5, Lo52/m0;

    const/4 v6, 0x1

    invoke-direct {v5, v4, v6}, Lo52/m0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v5}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object p1

    invoke-virtual {p0, p1}, Lhj0/f;->o(Lxg3/t;)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz p1, :cond_11

    iget-object p1, p1, Lm52/a;->n:Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;

    invoke-virtual {p1}, Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;->z()Llh3/e;

    move-result-object p1

    new-instance v4, Lo52/l0;

    const/4 v5, 0x2

    invoke-direct {v4, p0, v5}, Lo52/l0;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;I)V

    new-instance v5, Lo52/m0;

    const/4 v6, 0x2

    invoke-direct {v5, v4, v6}, Lo52/m0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v5}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object p1

    invoke-virtual {p0, p1}, Lhj0/f;->o(Lxg3/t;)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz p1, :cond_10

    iget-object p1, p1, Lm52/a;->m:Lcom/whoop/realtime/presentation/views/DayStrainView;

    invoke-virtual {p1}, Lcom/whoop/realtime/presentation/views/DayStrainView;->getOptimalTrainingLink()Landroid/widget/TextView;

    move-result-object p1

    new-instance v4, Lo52/n0;

    const/4 v5, 0x0

    invoke-direct {v4, p0, v5}, Lo52/n0;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;I)V

    invoke-virtual {p1, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz p1, :cond_f

    iget-object p1, p1, Lm52/a;->t:Landroid/widget/ImageButton;

    new-instance v4, Lo52/n0;

    const/4 v5, 0x1

    invoke-direct {v4, p0, v5}, Lo52/n0;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;I)V

    invoke-virtual {p1, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->f0:Lcom/whoop/realtime/presentation/m;

    if-eqz p1, :cond_e

    iget-object v2, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v2, :cond_d

    iget-object v2, v2, Lm52/a;->z:Landroid/widget/LinearLayout;

    const-string v4, "strainCoachSheet"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Lcom/whoop/realtime/presentation/m;->p(Landroid/view/View;)V

    iget-object v2, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v2, :cond_c

    iget-object v2, v2, Lm52/a;->h:Landroid/widget/LinearLayout;

    const-string v4, "coachActiveContainer"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Lcom/whoop/realtime/presentation/m;->y(Landroid/view/View;)V

    iget-object v2, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v2, :cond_b

    iget-object v2, v2, Lm52/a;->i:Landroid/widget/FrameLayout;

    const-string v4, "coachLockedContainer"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Lcom/whoop/realtime/presentation/m;->s(Landroid/view/View;)V

    iget-object v2, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v2, :cond_a

    iget-object v2, v2, Lm52/a;->n:Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;

    const-string v4, "goalPicker"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Lcom/whoop/realtime/presentation/m;->v(Lcom/whoop/realtime/presentation/views/StrainCoachGoalPicker;)V

    iget-object v2, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v2, :cond_9

    iget-object v2, v2, Lm52/a;->B:Lcom/whoop/ui/WhoopSwitch;

    const-string v4, "strainCoachSwitch"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Lcom/whoop/realtime/presentation/m;->u(Lcom/whoop/ui/WhoopSwitch;)V

    iget-object v2, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v2, :cond_8

    iget-object v2, v2, Lm52/a;->u:Landroid/widget/LinearLayout;

    const-string v4, "miniDialContainer"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Lcom/whoop/realtime/presentation/m;->t(Landroid/view/View;)V

    iget-object v2, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v2, :cond_7

    iget-object v2, v2, Lm52/a;->t:Landroid/widget/ImageButton;

    const-string v4, "lockedCoachHelpButton"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Lcom/whoop/realtime/presentation/m;->r(Landroid/widget/ImageButton;)V

    iget-object v2, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz v2, :cond_6

    iget-object v2, v2, Lm52/a;->j:Landroid/widget/TextView;

    const-string v4, "coachLockedText"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Lcom/whoop/realtime/presentation/m;->q(Landroid/widget/TextView;)V

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->M0()Lo52/s0;

    move-result-object p1

    invoke-virtual {p1}, Lo52/s0;->init()V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->j0:Lm52/a;

    if-eqz p1, :cond_5

    iget-object p1, p1, Lm52/a;->q:Lcom/whoop/ui/WhoopSwitch;

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->M0()Lo52/s0;

    move-result-object v0

    invoke-virtual {v0}, Lo52/s0;->D()Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/whoop/ui/WhoopSwitch;->setChecked(Z)V

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->I1()V

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object p1

    const-class v0, Lj02/l0;

    invoke-virtual {v3, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p1, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj02/l0;

    const-string v0, "StartActivityActivity"

    invoke-interface {p1, v0}, Lj02/l0;->J(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->H1()V

    return-void

    :cond_5
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_6
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_7
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_8
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_9
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_a
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_b
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_c
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_d
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_e
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_f
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_10
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_11
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_12
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_13
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_14
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_15
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_16
    const-string p1, "bottomSheetBehavior"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_17
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_18
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_19
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1a
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1b
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1c
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1d
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1e
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1f
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_20
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_21
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_22
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lhj0/f;->onDestroy()V

    invoke-virtual {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->c()V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->g0:Lp92/i;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->F0()V

    :cond_0
    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->h0:Lo52/b;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lo52/b;->a()V

    :cond_1
    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->b0:Ln73/b;

    invoke-interface {v0}, Ln73/b;->dispose()V

    return-void
.end method

.method public onPostCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Lm/m;->onPostCreate(Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->h0:Lo52/b;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lo52/b;->b()Llm2/b;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lcom/whoop/realtime/presentation/StartActivityActivity;->Z0(Llm2/b;)V

    :cond_0
    return-void

    :cond_1
    const-string p1, "activitySelector"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 6

    const-string v0, "permissions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "grantResults"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/r0;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    const/16 v0, 0x3e9

    const/4 v1, 0x0

    if-eq p1, v0, :cond_6

    const/16 v0, 0x3ea

    if-eq p1, v0, :cond_6

    iget-object v0, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->N:Lnu/b;

    if-eqz v0, :cond_5

    if-nez p1, :cond_5

    array-length p1, p2

    move v2, v1

    move v3, v2

    :goto_0
    if-ge v2, p1, :cond_4

    aget-object v4, p2, v2

    const-string v5, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    const-string v5, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    :cond_0
    if-nez v3, :cond_2

    aget v3, p3, v2

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    move v3, v1

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v3, 0x1

    :cond_3
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    iget-object p1, v0, Lnu/b;->a:Lcom/whoop/realtime/presentation/StartActivityActivity;

    invoke-interface {p1, v3}, Lnu/a;->b(Z)V

    :cond_5
    return-void

    :cond_6
    array-length p1, p3

    if-nez p1, :cond_7

    goto :goto_4

    :cond_7
    array-length p1, p3

    :goto_3
    if-ge v1, p1, :cond_9

    aget v0, p3, v1

    if-nez v0, :cond_8

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_8
    :goto_4
    invoke-static {p2}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1, p3}, Lcom/whoop/realtime/presentation/StartActivityActivity;->N0(Ljava/util/List;[I)V

    return-void

    :cond_9
    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->E0()V

    return-void
.end method

.method public onResume()V
    .locals 5

    invoke-super {p0}, Lhj0/f;->onResume()V

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {p0, v0}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    const-string v4, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {p0, v4}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p0, v0}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_2

    :goto_1
    move v0, v3

    goto :goto_2

    :cond_2
    move v0, v2

    :goto_2
    if-nez v1, :cond_3

    if-eqz v0, :cond_4

    :cond_3
    move v2, v3

    :cond_4
    iput-boolean v2, p0, Lcom/whoop/realtime/presentation/StartActivityActivity;->O:Z

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v1, Lcom/whoop/realtime/presentation/StartActivityActivity$g;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/realtime/presentation/StartActivityActivity$g;-><init>(Lcom/whoop/realtime/presentation/StartActivityActivity;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public onStart()V
    .locals 0

    invoke-super {p0}, Lm/m;->onStart()V

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/StartActivityActivity;->G0()V

    return-void
.end method

.method public p()Ljava/lang/String;
    .locals 1

    const-string v0, "Activity Start"

    return-object v0
.end method
