.class public final Lvm2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj02/o0;
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvm2/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c8\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u00084\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u00cf\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u000e\u0008\u0002\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020\'\u0012\u0006\u0010*\u001a\u00020)\u0012\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u00a2\u0006\u0004\u00081\u00102J\r\u00104\u001a\u000203\u00a2\u0006\u0004\u00084\u00105J\u001b\u00109\u001a\u0004\u0018\u0001082\n\u0008\u0002\u00107\u001a\u0004\u0018\u000106\u00a2\u0006\u0004\u00089\u0010:J\r\u0010<\u001a\u00020;\u00a2\u0006\u0004\u0008<\u0010=J\u0017\u0010A\u001a\u00020@2\u0006\u0010?\u001a\u00020>H\u0016\u00a2\u0006\u0004\u0008A\u0010BJ\u0017\u0010C\u001a\u00020@2\u0006\u0010?\u001a\u00020>H\u0016\u00a2\u0006\u0004\u0008C\u0010BJ\u0017\u0010E\u001a\u00020@2\u0006\u0010D\u001a\u000208H\u0000\u00a2\u0006\u0004\u0008E\u0010FJ\u0019\u0010G\u001a\u00020;2\u0008\u00107\u001a\u0004\u0018\u00010>H\u0016\u00a2\u0006\u0004\u0008G\u0010HJ\u0017\u0010J\u001a\u00020@2\u0006\u0010I\u001a\u000208H\u0016\u00a2\u0006\u0004\u0008J\u0010FJ\u0015\u0010M\u001a\u00020;2\u0006\u0010L\u001a\u00020K\u00a2\u0006\u0004\u0008M\u0010NJ\r\u0010O\u001a\u000203\u00a2\u0006\u0004\u0008O\u00105J\u0017\u0010R\u001a\u00020;2\u0008\u0010Q\u001a\u0004\u0018\u00010P\u00a2\u0006\u0004\u0008R\u0010SJ$\u0010Y\u001a\u00020X2\u0006\u0010U\u001a\u00020T2\n\u0008\u0002\u0010W\u001a\u0004\u0018\u00010VH\u0086@\u00a2\u0006\u0004\u0008Y\u0010ZJ\u0017\u0010]\u001a\u0002032\u0006\u0010\\\u001a\u00020[H\u0016\u00a2\u0006\u0004\u0008]\u0010^J#\u0010c\u001a\u0004\u0018\u00010P2\u0006\u0010`\u001a\u00020_2\u0008\u0010b\u001a\u0004\u0018\u00010aH\u0002\u00a2\u0006\u0004\u0008c\u0010dJ\u0017\u0010e\u001a\u00020@2\u0006\u0010I\u001a\u000208H\u0002\u00a2\u0006\u0004\u0008e\u0010FJ\u0013\u0010f\u001a\u00020;*\u00020>H\u0002\u00a2\u0006\u0004\u0008f\u0010HJ\u0017\u0010g\u001a\u00020@2\u0006\u0010?\u001a\u00020>H\u0002\u00a2\u0006\u0004\u0008g\u0010BJ\u001b\u0010k\u001a\u00020h*\u00020h2\u0006\u0010j\u001a\u00020iH\u0002\u00a2\u0006\u0004\u0008k\u0010lJ\u001b\u0010o\u001a\u000208*\u0002082\u0006\u0010n\u001a\u00020mH\u0002\u00a2\u0006\u0004\u0008o\u0010pJ\u001d\u0010s\u001a\u000208*\u0002082\u0008\u0010r\u001a\u0004\u0018\u00010qH\u0002\u00a2\u0006\u0004\u0008s\u0010tJ\u001f\u0010v\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020P0u*\u00020mH\u0002\u00a2\u0006\u0004\u0008v\u0010wJ\u001b\u0010z\u001a\u0004\u0018\u00010y2\u0008\u0010x\u001a\u0004\u0018\u00010PH\u0002\u00a2\u0006\u0004\u0008z\u0010{J\u0015\u0010|\u001a\u0004\u0018\u00010y*\u00020mH\u0002\u00a2\u0006\u0004\u0008|\u0010}J*\u0010\u0080\u0001\u001a\u00020~*\u00020~2\u0012\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020P0uH\u0002\u00a2\u0006\u0006\u0008\u0080\u0001\u0010\u0081\u0001J%\u0010\u0083\u0001\u001a\u00020@2\u0007\u0010\u0082\u0001\u001a\u00020P2\u0008\u0010D\u001a\u0004\u0018\u000108H\u0002\u00a2\u0006\u0006\u0008\u0083\u0001\u0010\u0084\u0001J\u001c\u0010\u0086\u0001\u001a\u00020;2\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010PH\u0002\u00a2\u0006\u0005\u0008\u0086\u0001\u0010SJ\u001b\u0010\u0088\u0001\u001a\u0002032\u0007\u0010\u0087\u0001\u001a\u00020>H\u0002\u00a2\u0006\u0006\u0008\u0088\u0001\u0010\u0089\u0001J\u001a\u0010\u008a\u0001\u001a\u00020;2\u0006\u0010D\u001a\u000208H\u0002\u00a2\u0006\u0006\u0008\u008a\u0001\u0010\u008b\u0001J\u0016\u0010\u008c\u0001\u001a\u00020;*\u00020@H\u0002\u00a2\u0006\u0006\u0008\u008c\u0001\u0010\u008d\u0001J#\u0010\u008f\u0001\u001a\u0002032\u0006\u0010I\u001a\u0002082\u0007\u0010\u008e\u0001\u001a\u00020@H\u0002\u00a2\u0006\u0006\u0008\u008f\u0001\u0010\u0090\u0001J4\u0010\u0093\u0001\u001a\u00020;2\u0006\u0010I\u001a\u0002082\u0007\u0010\u0091\u0001\u001a\u00020;2\u000f\u0008\u0002\u0010\u0092\u0001\u001a\u0008\u0012\u0004\u0012\u0002030\u0005H\u0002\u00a2\u0006\u0006\u0008\u0093\u0001\u0010\u0094\u0001J\u0019\u0010\u0095\u0001\u001a\u00020@2\u0006\u0010I\u001a\u000208H\u0002\u00a2\u0006\u0005\u0008\u0095\u0001\u0010FJ\u001b\u0010\u0097\u0001\u001a\u00020@2\u0007\u0010I\u001a\u00030\u0096\u0001H\u0002\u00a2\u0006\u0006\u0008\u0097\u0001\u0010\u0098\u0001J\u001b\u0010\u009a\u0001\u001a\u00020@2\u0007\u0010I\u001a\u00030\u0099\u0001H\u0002\u00a2\u0006\u0006\u0008\u009a\u0001\u0010\u009b\u0001J\u0012\u0010\u009c\u0001\u001a\u00020@H\u0002\u00a2\u0006\u0006\u0008\u009c\u0001\u0010\u009d\u0001J\u0012\u0010\u009e\u0001\u001a\u00020@H\u0002\u00a2\u0006\u0006\u0008\u009e\u0001\u0010\u009d\u0001J\u0012\u0010\u009f\u0001\u001a\u00020@H\u0002\u00a2\u0006\u0006\u0008\u009f\u0001\u0010\u009d\u0001J\u0012\u0010\u00a0\u0001\u001a\u00020@H\u0002\u00a2\u0006\u0006\u0008\u00a0\u0001\u0010\u009d\u0001J\u001b\u0010\u00a2\u0001\u001a\u00020@2\u0007\u0010I\u001a\u00030\u00a1\u0001H\u0002\u00a2\u0006\u0006\u0008\u00a2\u0001\u0010\u00a3\u0001J\u0012\u0010\u00a4\u0001\u001a\u00020@H\u0002\u00a2\u0006\u0006\u0008\u00a4\u0001\u0010\u009d\u0001J\u001b\u0010\u00a6\u0001\u001a\u00020@2\u0007\u0010I\u001a\u00030\u00a5\u0001H\u0002\u00a2\u0006\u0006\u0008\u00a6\u0001\u0010\u00a7\u0001J\u0012\u0010\u00a8\u0001\u001a\u00020@H\u0002\u00a2\u0006\u0006\u0008\u00a8\u0001\u0010\u009d\u0001J\u0012\u0010\u00a9\u0001\u001a\u00020@H\u0002\u00a2\u0006\u0006\u0008\u00a9\u0001\u0010\u009d\u0001J\u001b\u0010\u00ab\u0001\u001a\u00020@2\u0007\u0010\u00aa\u0001\u001a\u00020PH\u0002\u00a2\u0006\u0006\u0008\u00ab\u0001\u0010\u00ac\u0001J\u0012\u0010\u00ad\u0001\u001a\u00020@H\u0002\u00a2\u0006\u0006\u0008\u00ad\u0001\u0010\u009d\u0001J\u001b\u0010\u00af\u0001\u001a\u00020@2\u0007\u0010I\u001a\u00030\u00ae\u0001H\u0002\u00a2\u0006\u0006\u0008\u00af\u0001\u0010\u00b0\u0001J\u001b\u0010\u00b2\u0001\u001a\u00020@2\u0007\u0010I\u001a\u00030\u00b1\u0001H\u0002\u00a2\u0006\u0006\u0008\u00b2\u0001\u0010\u00b3\u0001J\u001b\u0010\u00b5\u0001\u001a\u00020@2\u0007\u0010\u00b4\u0001\u001a\u00020PH\u0002\u00a2\u0006\u0006\u0008\u00b5\u0001\u0010\u00ac\u0001J\u001b\u0010\u00b7\u0001\u001a\u00020@2\u0007\u0010D\u001a\u00030\u00b6\u0001H\u0002\u00a2\u0006\u0006\u0008\u00b7\u0001\u0010\u00b8\u0001J\u0012\u0010\u00b9\u0001\u001a\u00020@H\u0002\u00a2\u0006\u0006\u0008\u00b9\u0001\u0010\u009d\u0001J\u0012\u0010\u00ba\u0001\u001a\u00020@H\u0002\u00a2\u0006\u0006\u0008\u00ba\u0001\u0010\u009d\u0001J<\u0010\u00c1\u0001\u001a\u00020@2\u000c\u0008\u0002\u0010\u00bc\u0001\u001a\u0005\u0018\u00010\u00bb\u00012\u000c\u0008\u0002\u0010\u00be\u0001\u001a\u0005\u0018\u00010\u00bd\u00012\u000c\u0008\u0002\u0010\u00c0\u0001\u001a\u0005\u0018\u00010\u00bf\u0001H\u0002\u00a2\u0006\u0006\u0008\u00c1\u0001\u0010\u00c2\u0001J,\u0010\u00c3\u0001\u001a\u00020@2\u000c\u0008\u0002\u0010\u00bc\u0001\u001a\u0005\u0018\u00010\u00bb\u00012\n\u0008\u0002\u0010x\u001a\u0004\u0018\u00010PH\u0002\u00a2\u0006\u0006\u0008\u00c3\u0001\u0010\u00c4\u0001J.\u0010\u00c5\u0001\u001a\u00020@2\u000c\u0008\u0002\u0010\u00bc\u0001\u001a\u0005\u0018\u00010\u00bb\u00012\u000c\u0008\u0002\u0010\u00c0\u0001\u001a\u0005\u0018\u00010\u00bf\u0001H\u0002\u00a2\u0006\u0006\u0008\u00c5\u0001\u0010\u00c6\u0001JI\u0010\u00c8\u0001\u001a\u00020@2\u000c\u0008\u0002\u0010\u00bc\u0001\u001a\u0005\u0018\u00010\u00bb\u00012\u000c\u0008\u0002\u0010\u00be\u0001\u001a\u0005\u0018\u00010\u00bd\u00012\u000c\u0008\u0002\u0010\u00c0\u0001\u001a\u0005\u0018\u00010\u00bf\u00012\u000b\u0008\u0002\u0010\u00c7\u0001\u001a\u0004\u0018\u00010PH\u0002\u00a2\u0006\u0006\u0008\u00c8\u0001\u0010\u00c9\u0001J\u001d\u0010\u00cb\u0001\u001a\u00020@2\t\u0010\u00ca\u0001\u001a\u0004\u0018\u00010PH\u0002\u00a2\u0006\u0006\u0008\u00cb\u0001\u0010\u00ac\u0001J\u001b\u0010\u00cd\u0001\u001a\u00020@2\u0007\u0010D\u001a\u00030\u00cc\u0001H\u0002\u00a2\u0006\u0006\u0008\u00cd\u0001\u0010\u00ce\u0001J\u001b\u0010\u00d0\u0001\u001a\u00020@2\u0007\u0010D\u001a\u00030\u00cf\u0001H\u0002\u00a2\u0006\u0006\u0008\u00d0\u0001\u0010\u00d1\u0001J\u001b\u0010\u00d3\u0001\u001a\u00020@2\u0007\u0010D\u001a\u00030\u00d2\u0001H\u0002\u00a2\u0006\u0006\u0008\u00d3\u0001\u0010\u00d4\u0001J\u001b\u0010\u00d6\u0001\u001a\u00020@2\u0007\u0010D\u001a\u00030\u00d5\u0001H\u0002\u00a2\u0006\u0006\u0008\u00d6\u0001\u0010\u00d7\u0001J\u001b\u0010\u00d9\u0001\u001a\u00020@2\u0007\u0010D\u001a\u00030\u00d8\u0001H\u0002\u00a2\u0006\u0006\u0008\u00d9\u0001\u0010\u00da\u0001J\u001b\u0010\u00dc\u0001\u001a\u0002032\u0007\u0010D\u001a\u00030\u00db\u0001H\u0002\u00a2\u0006\u0006\u0008\u00dc\u0001\u0010\u00dd\u0001J\u001f\u0010\u00df\u0001\u001a\u00020@2\u000b\u0008\u0002\u0010\u00de\u0001\u001a\u0004\u0018\u00010PH\u0002\u00a2\u0006\u0006\u0008\u00df\u0001\u0010\u00ac\u0001J\u0012\u0010\u00e0\u0001\u001a\u00020@H\u0002\u00a2\u0006\u0006\u0008\u00e0\u0001\u0010\u009d\u0001J\u001b\u0010\u00e2\u0001\u001a\u00020@2\u0007\u0010I\u001a\u00030\u00e1\u0001H\u0002\u00a2\u0006\u0006\u0008\u00e2\u0001\u0010\u00e3\u0001J%\u0010\u00e7\u0001\u001a\u00020@2\u0007\u0010\u00e4\u0001\u001a\u00020P2\u0008\u0010\u00e6\u0001\u001a\u00030\u00e5\u0001H\u0002\u00a2\u0006\u0006\u0008\u00e7\u0001\u0010\u00e8\u0001J,\u0010\u00ea\u0001\u001a\u00020@2\u000b\u0008\u0002\u0010\u00e9\u0001\u001a\u0004\u0018\u00010P2\u000b\u0008\u0002\u0010\u00ca\u0001\u001a\u0004\u0018\u00010PH\u0002\u00a2\u0006\u0006\u0008\u00ea\u0001\u0010\u00eb\u0001J\u001b\u0010\u00ed\u0001\u001a\u00020@2\u0007\u0010\u00ec\u0001\u001a\u00020;H\u0002\u00a2\u0006\u0006\u0008\u00ed\u0001\u0010\u00ee\u0001J\u001f\u0010\u00ef\u0001\u001a\u00020@2\u000b\u0008\u0002\u0010\u00ca\u0001\u001a\u0004\u0018\u00010PH\u0002\u00a2\u0006\u0006\u0008\u00ef\u0001\u0010\u00ac\u0001J&\u0010\u00f1\u0001\u001a\u00020@2\u0007\u0010\u00f0\u0001\u001a\u00020P2\t\u0010\u00ca\u0001\u001a\u0004\u0018\u00010PH\u0002\u00a2\u0006\u0006\u0008\u00f1\u0001\u0010\u00eb\u0001J3\u0010\u00f4\u0001\u001a\u00020@2\u0007\u0010\u00f2\u0001\u001a\u00020;2\t\u0010\u00f3\u0001\u001a\u0004\u0018\u00010P2\u000b\u0008\u0002\u0010\u00ca\u0001\u001a\u0004\u0018\u00010PH\u0002\u00a2\u0006\u0006\u0008\u00f4\u0001\u0010\u00f5\u0001J&\u0010\u00f7\u0001\u001a\u00020@2\u0007\u0010\u00f6\u0001\u001a\u00020P2\t\u0010\u00ca\u0001\u001a\u0004\u0018\u00010PH\u0002\u00a2\u0006\u0006\u0008\u00f7\u0001\u0010\u00eb\u0001J\u001b\u0010\u00f9\u0001\u001a\u00020@2\u0007\u0010\u00f8\u0001\u001a\u00020PH\u0002\u00a2\u0006\u0006\u0008\u00f9\u0001\u0010\u00ac\u0001J\u001b\u0010\u00fb\u0001\u001a\u00020@2\u0007\u0010\u00fa\u0001\u001a\u00020PH\u0002\u00a2\u0006\u0006\u0008\u00fb\u0001\u0010\u00ac\u0001J\u001b\u0010\u00fc\u0001\u001a\u00020@2\u0007\u0010\u00ca\u0001\u001a\u00020PH\u0002\u00a2\u0006\u0006\u0008\u00fc\u0001\u0010\u00ac\u0001J\u0012\u0010\u00fd\u0001\u001a\u00020@H\u0002\u00a2\u0006\u0006\u0008\u00fd\u0001\u0010\u009d\u0001J%\u0010\u00fe\u0001\u001a\u0002032\u0008\u0010W\u001a\u0004\u0018\u00010V2\u0007\u0010\u008e\u0001\u001a\u00020XH\u0002\u00a2\u0006\u0006\u0008\u00fe\u0001\u0010\u00ff\u0001R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008e\u0010\u0080\u0002R\u001c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0081\u0002\u0010\u0082\u0002R\u0015\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008c\u0010\u0083\u0002R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008|\u0010\u0084\u0002R\u0016\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0085\u0002\u0010\u0086\u0002R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008a\u0001\u0010\u0087\u0002R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008c\u0001\u0010\u0088\u0002R\u0015\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008<\u0010\u0089\u0002R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00fe\u0001\u0010\u008a\u0002R\u001c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008b\u0002\u0010\u008c\u0002R\u0015\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008O\u0010\u008d\u0002R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008f\u0001\u0010\u008e\u0002R\u0015\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008E\u0010\u008f\u0002R\u0016\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00cd\u0001\u0010\u0090\u0002R\u0016\u0010\"\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00d0\u0001\u0010\u0091\u0002R\u0016\u0010$\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00f1\u0001\u0010\u0092\u0002R\u0016\u0010&\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00ef\u0001\u0010\u0093\u0002R\u0016\u0010(\u001a\u00020\'8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00d6\u0001\u0010\u0094\u0002R\u0016\u0010*\u001a\u00020)8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00ab\u0001\u0010\u0095\u0002R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0096\u0002\u0010\u0097\u0002R\u0016\u0010.\u001a\u00020-8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00d3\u0001\u0010\u0098\u0002R\u0016\u00100\u001a\u00020/8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00b5\u0001\u0010\u0099\u0002R\u0018\u0010\u009c\u0002\u001a\u00030\u009a\u00028\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00e0\u0001\u0010\u009b\u0002R\u0018\u0010\u009e\u0002\u001a\u00030\u00bf\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0097\u0001\u0010\u009d\u0002R\u0018\u0010\u009f\u0002\u001a\u00030\u00bf\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00fc\u0001\u0010\u009d\u0002\u00a8\u0006\u00a0\u0002"
    }
    d2 = {
        "Lvm2/d;",
        "Lj02/o0;",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "Landroidx/fragment/app/r0;",
        "context",
        "Lkotlin/Function0;",
        "Leb/a0;",
        "navController",
        "Lor2/y;",
        "externalLinkNavigator",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lwe1/a;",
        "entitlementChecker",
        "Ln92/b;",
        "customActionHandler",
        "Lj02/i0;",
        "navDeepLinkRequestHelper",
        "Ljava/time/Clock;",
        "clock",
        "Lcom/whoop/navigation/a;",
        "deepLinkNavigationParser",
        "",
        "Lj02/k0;",
        "navigationProviders",
        "Lo02/d;",
        "navigationReducer",
        "Lhj0/d;",
        "appLifecycle",
        "Lj02/l0;",
        "navigationReporter",
        "Lji0/f;",
        "bffBottomNavConfigSource",
        "Lvm2/a;",
        "appConfigurationTabResolver",
        "Lvm2/m;",
        "tabRootResolver",
        "Lvm2/f;",
        "bffDefaultTabResolver",
        "Lvm2/j;",
        "launchRedirectGate",
        "Lyp0/a;",
        "communityAccessChecker",
        "Ldp0/g;",
        "globalCoachManager",
        "Lj02/e;",
        "bffBottomNavTabEventPublisher",
        "Lvm2/l;",
        "navigationMetricsReporter",
        "<init>",
        "(Landroidx/fragment/app/r0;Lc93/a;Lor2/y;Lcom/whoop/data/repositories/FeatureFlagChecker;Lwe1/a;Ln92/b;Lj02/i0;Ljava/time/Clock;Lcom/whoop/navigation/a;Ljava/util/List;Lo02/d;Lhj0/d;Lj02/l0;Lji0/f;Lvm2/a;Lvm2/m;Lvm2/f;Lvm2/j;Lyp0/a;Ldp0/g;Lj02/e;Lvm2/l;)V",
        "Ll83/a0;",
        "D",
        "()V",
        "Leb/n0;",
        "destination",
        "Lj02/m0;",
        "t",
        "(Leb/n0;)Lj02/m0;",
        "",
        "H",
        "()Z",
        "Lcom/whoop/navigation/e;",
        "navigationAction",
        "Lj02/p0;",
        "a",
        "(Lcom/whoop/navigation/e;)Lj02/p0;",
        "d",
        "screen",
        "M",
        "(Lj02/m0;)Lj02/p0;",
        "e",
        "(Lcom/whoop/navigation/e;)Z",
        "navigationScreen",
        "b",
        "Lcom/whoop/appconfiguration/TabConfiguration;",
        "tab",
        "L0",
        "(Lcom/whoop/appconfiguration/TabConfiguration;)Z",
        "K",
        "",
        "selectedTabId",
        "B",
        "(Ljava/lang/String;)Z",
        "Lcom/whoop/domain/model/WhoopUri;",
        "whoopUri",
        "Landroid/content/Intent;",
        "intent",
        "Lj02/l;",
        "C",
        "(Lcom/whoop/domain/model/WhoopUri;Landroid/content/Intent;Lq83/d;)Ljava/lang/Object;",
        "Landroidx/lifecycle/g0;",
        "owner",
        "onStart",
        "(Landroidx/lifecycle/g0;)V",
        "",
        "destinationId",
        "Landroid/os/Bundle;",
        "arguments",
        "y",
        "(ILandroid/os/Bundle;)Ljava/lang/String;",
        "w",
        "P0",
        "v",
        "Lj02/m0$m1;",
        "Leb/q;",
        "replacedEntry",
        "q",
        "(Lj02/m0$m1;Leb/q;)Lj02/m0$m1;",
        "Lcom/whoop/navigation/NavigationScreenModel;",
        "parameters",
        "U0",
        "(Lj02/m0;Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;",
        "Lcom/whoop/navigation/AiAction;",
        "aiAction",
        "T0",
        "(Lj02/m0;Lcom/whoop/navigation/AiAction;)Lj02/m0;",
        "",
        "A",
        "(Lcom/whoop/navigation/NavigationScreenModel;)Ljava/util/Map;",
        "shareCode",
        "Lcom/whoop/navigation/GenericCachePolicy;",
        "r",
        "(Ljava/lang/String;)Lcom/whoop/navigation/GenericCachePolicy;",
        "z",
        "(Lcom/whoop/navigation/NavigationScreenModel;)Lcom/whoop/navigation/GenericCachePolicy;",
        "Lcom/whoop/navigation/models/ApiRequest;",
        "queryParams",
        "o",
        "(Lcom/whoop/navigation/models/ApiRequest;Ljava/util/Map;)Lcom/whoop/navigation/models/ApiRequest;",
        "tabId",
        "R0",
        "(Ljava/lang/String;Lj02/m0;)Lj02/p0;",
        "sourceOverride",
        "S0",
        "action",
        "O0",
        "(Lcom/whoop/navigation/e;)V",
        "F",
        "(Lj02/m0;)Z",
        "G",
        "(Lj02/p0;)Z",
        "result",
        "L",
        "(Lj02/m0;Lj02/p0;)V",
        "noopFixEnabled",
        "onAiActionHandled",
        "Q0",
        "(Lj02/m0;ZLc93/a;)Z",
        "E0",
        "Lj02/m0$q1;",
        "X",
        "(Lj02/m0$q1;)Lj02/p0;",
        "Lj02/m0$g2;",
        "h0",
        "(Lj02/m0$g2;)Lj02/p0;",
        "g0",
        "()Lj02/p0;",
        "m0",
        "u0",
        "p0",
        "Lj02/m0$m4;",
        "q0",
        "(Lj02/m0$m4;)Lj02/p0;",
        "r0",
        "Lj02/m0$o4;",
        "s0",
        "(Lj02/m0$o4;)Lj02/p0;",
        "t0",
        "l0",
        "entryPoint",
        "S",
        "(Ljava/lang/String;)Lj02/p0;",
        "i0",
        "Lj02/m0$i2;",
        "j0",
        "(Lj02/m0$i2;)Lj02/p0;",
        "Lj02/m0$j2;",
        "k0",
        "(Lj02/m0$j2;)Lj02/p0;",
        "url",
        "V",
        "Lj02/m0$y5;",
        "C0",
        "(Lj02/m0$y5;)Lj02/p0;",
        "v0",
        "D0",
        "Leb/p0;",
        "navDirections",
        "Leb/k0;",
        "navDeepLinkRequest",
        "Leb/x0;",
        "navOptions",
        "M0",
        "(Leb/p0;Leb/k0;Leb/x0;)Lj02/p0;",
        "F0",
        "(Leb/p0;Ljava/lang/String;)Lj02/p0;",
        "H0",
        "(Leb/p0;Leb/x0;)Lj02/p0;",
        "settingsSource",
        "J0",
        "(Leb/p0;Leb/k0;Leb/x0;Ljava/lang/String;)Lj02/p0;",
        "source",
        "N0",
        "Lj02/m0$e;",
        "N",
        "(Lj02/m0$e;)Lj02/p0;",
        "Lj02/m0$f;",
        "O",
        "(Lj02/m0$f;)Lj02/p0;",
        "Lj02/m0$c1;",
        "U",
        "(Lj02/m0$c1;)Lj02/p0;",
        "Lj02/m0$r0;",
        "R",
        "(Lj02/m0$r0;)Lj02/p0;",
        "Lj02/m0$e2;",
        "f0",
        "(Lj02/m0$e2;)Lj02/p0;",
        "Lj02/m0$f5;",
        "y0",
        "(Lj02/m0$f5;)V",
        "openTab",
        "w0",
        "W",
        "Lj02/m0$w1;",
        "Z",
        "(Lj02/m0$w1;)Lj02/p0;",
        "gaugeType",
        "Ljava/time/LocalDate;",
        "selectedDate",
        "o0",
        "(Ljava/lang/String;Ljava/time/LocalDate;)Lj02/p0;",
        "cycle",
        "x0",
        "(Ljava/lang/String;Ljava/lang/String;)Lj02/p0;",
        "showOnboarding",
        "b0",
        "(Z)Lj02/p0;",
        "Q",
        "detailId",
        "P",
        "navigateToPresets",
        "scrollId",
        "A0",
        "(ZLjava/lang/String;Ljava/lang/String;)Lj02/p0;",
        "integrationId",
        "d0",
        "pillar",
        "c0",
        "code",
        "e0",
        "Y",
        "z0",
        "I",
        "(Landroid/content/Intent;Lj02/l;)V",
        "Landroidx/fragment/app/r0;",
        "x",
        "Lc93/a;",
        "Lor2/y;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "E",
        "Lwe1/a;",
        "Ln92/b;",
        "Lj02/i0;",
        "Ljava/time/Clock;",
        "Lcom/whoop/navigation/a;",
        "J",
        "Ljava/util/List;",
        "Lo02/d;",
        "Lhj0/d;",
        "Lj02/l0;",
        "Lji0/f;",
        "Lvm2/a;",
        "Lvm2/m;",
        "Lvm2/f;",
        "Lvm2/j;",
        "Lyp0/a;",
        "T",
        "Ldp0/g;",
        "Lj02/e;",
        "Lvm2/l;",
        "Ltr2/n;",
        "Ltr2/n;",
        "logger",
        "Leb/x0;",
        "bottomNavButtonPressOptions",
        "bffTabNavOptions",
        "app_prodStandardRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final E:Lwe1/a;

.field private final F:Ln92/b;

.field private final G:Lj02/i0;

.field private final H:Ljava/time/Clock;

.field private final I:Lcom/whoop/navigation/a;

.field private final J:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lj02/k0;",
            ">;"
        }
    .end annotation
.end field

.field private final K:Lo02/d;

.field private final L:Lhj0/d;

.field private final M:Lj02/l0;

.field private final N:Lji0/f;

.field private final O:Lvm2/a;

.field private final P:Lvm2/m;

.field private final Q:Lvm2/f;

.field private final R:Lvm2/j;

.field private final S:Lyp0/a;

.field private final T:Ldp0/g;

.field private final U:Lj02/e;

.field private final V:Lvm2/l;

.field private final W:Ltr2/n;

.field private final X:Leb/x0;

.field private final Y:Leb/x0;

.field private final w:Landroidx/fragment/app/r0;

.field private final x:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final y:Lor2/y;

.field private final z:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/r0;Lc93/a;Lor2/y;Lcom/whoop/data/repositories/FeatureFlagChecker;Lwe1/a;Ln92/b;Lj02/i0;Ljava/time/Clock;Lcom/whoop/navigation/a;Ljava/util/List;Lo02/d;Lhj0/d;Lj02/l0;Lji0/f;Lvm2/a;Lvm2/m;Lvm2/f;Lvm2/j;Lyp0/a;Ldp0/g;Lj02/e;Lvm2/l;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/r0;",
            "Lc93/a;",
            "Lor2/y;",
            "Lcom/whoop/data/repositories/FeatureFlagChecker;",
            "Lwe1/a;",
            "Ln92/b;",
            "Lj02/i0;",
            "Ljava/time/Clock;",
            "Lcom/whoop/navigation/a;",
            "Ljava/util/List<",
            "+",
            "Lj02/k0;",
            ">;",
            "Lo02/d;",
            "Lhj0/d;",
            "Lj02/l0;",
            "Lji0/f;",
            "Lvm2/a;",
            "Lvm2/m;",
            "Lvm2/f;",
            "Lvm2/j;",
            "Lyp0/a;",
            "Ldp0/g;",
            "Lj02/e;",
            "Lvm2/l;",
            ")V"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    const-string v0, "context"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navController"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "externalLinkNavigator"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entitlementChecker"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customActionHandler"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navDeepLinkRequestHelper"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clock"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deepLinkNavigationParser"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationProviders"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationReducer"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appLifecycle"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationReporter"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bffBottomNavConfigSource"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appConfigurationTabResolver"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tabRootResolver"

    move-object/from16 v15, p16

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bffDefaultTabResolver"

    move-object/from16 v15, p17

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "launchRedirectGate"

    move-object/from16 v15, p18

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "communityAccessChecker"

    move-object/from16 v15, p19

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bffBottomNavTabEventPublisher"

    move-object/from16 v15, p21

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationMetricsReporter"

    move-object/from16 v15, p22

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p0

    .line 2
    iput-object v1, v0, Lvm2/d;->w:Landroidx/fragment/app/r0;

    .line 3
    iput-object v2, v0, Lvm2/d;->x:Lc93/a;

    .line 4
    iput-object v3, v0, Lvm2/d;->y:Lor2/y;

    .line 5
    iput-object v4, v0, Lvm2/d;->z:Lcom/whoop/data/repositories/FeatureFlagChecker;

    .line 6
    iput-object v5, v0, Lvm2/d;->E:Lwe1/a;

    .line 7
    iput-object v6, v0, Lvm2/d;->F:Ln92/b;

    .line 8
    iput-object v7, v0, Lvm2/d;->G:Lj02/i0;

    .line 9
    iput-object v8, v0, Lvm2/d;->H:Ljava/time/Clock;

    .line 10
    iput-object v9, v0, Lvm2/d;->I:Lcom/whoop/navigation/a;

    .line 11
    iput-object v10, v0, Lvm2/d;->J:Ljava/util/List;

    .line 12
    iput-object v11, v0, Lvm2/d;->K:Lo02/d;

    .line 13
    iput-object v12, v0, Lvm2/d;->L:Lhj0/d;

    .line 14
    iput-object v13, v0, Lvm2/d;->M:Lj02/l0;

    .line 15
    iput-object v14, v0, Lvm2/d;->N:Lji0/f;

    move-object/from16 v1, p15

    .line 16
    iput-object v1, v0, Lvm2/d;->O:Lvm2/a;

    move-object/from16 v1, p16

    .line 17
    iput-object v1, v0, Lvm2/d;->P:Lvm2/m;

    move-object/from16 v1, p17

    .line 18
    iput-object v1, v0, Lvm2/d;->Q:Lvm2/f;

    move-object/from16 v1, p18

    .line 19
    iput-object v1, v0, Lvm2/d;->R:Lvm2/j;

    move-object/from16 v1, p19

    .line 20
    iput-object v1, v0, Lvm2/d;->S:Lyp0/a;

    move-object/from16 v1, p20

    .line 21
    iput-object v1, v0, Lvm2/d;->T:Ldp0/g;

    move-object/from16 v1, p21

    .line 22
    iput-object v1, v0, Lvm2/d;->U:Lj02/e;

    .line 23
    iput-object v15, v0, Lvm2/d;->V:Lvm2/l;

    .line 24
    sget-object v1, Ltr2/n;->a:Ltr2/n$a;

    const-string v2, "AppNavigator"

    invoke-virtual {v1, v2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v1

    iput-object v1, v0, Lvm2/d;->W:Ltr2/n;

    .line 25
    sget v1, Lhi0/e;->D2:I

    .line 26
    new-instance v2, Leb/x0;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, -0x1

    move v8, v7

    move v9, v7

    move v10, v7

    move/from16 p4, v1

    move-object/from16 p1, v2

    move/from16 p2, v3

    move/from16 p3, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    invoke-direct/range {p1 .. p10}, Leb/x0;-><init>(ZZIZZIIII)V

    move-object/from16 v1, p1

    .line 27
    iput-object v1, v0, Lvm2/d;->X:Leb/x0;

    .line 28
    sget v1, Lhi0/e;->E2:I

    .line 29
    new-instance v2, Leb/x0;

    move/from16 p4, v1

    move-object/from16 p1, v2

    invoke-direct/range {p1 .. p10}, Leb/x0;-><init>(ZZIZZIIII)V

    move-object/from16 v1, p1

    .line 30
    iput-object v1, v0, Lvm2/d;->Y:Leb/x0;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/fragment/app/r0;Lc93/a;Lor2/y;Lcom/whoop/data/repositories/FeatureFlagChecker;Lwe1/a;Ln92/b;Lj02/i0;Ljava/time/Clock;Lcom/whoop/navigation/a;Ljava/util/List;Lo02/d;Lhj0/d;Lj02/l0;Lji0/f;Lvm2/a;Lvm2/m;Lvm2/f;Lvm2/j;Lyp0/a;Ldp0/g;Lj02/e;Lvm2/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 26

    move/from16 v0, p23

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    .line 31
    new-instance v1, Lm83/p;

    const/16 v2, 0x14

    move-object/from16 v4, p1

    invoke-direct {v1, v4, v2}, Lm83/p;-><init>(Ljava/lang/Object;I)V

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object/from16 v4, p1

    move-object/from16 v5, p2

    :goto_0
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_1

    .line 32
    new-instance v1, Lj02/i0;

    invoke-direct {v1}, Lj02/i0;-><init>()V

    move-object v10, v1

    goto :goto_1

    :cond_1
    move-object/from16 v10, p7

    :goto_1
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_2

    .line 33
    invoke-static {}, Ljava/time/Clock;->systemDefaultZone()Ljava/time/Clock;

    move-result-object v1

    const-string v2, "systemDefaultZone(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v11, v1

    goto :goto_2

    :cond_2
    move-object/from16 v11, p8

    :goto_2
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_3

    .line 34
    sget-object v1, Lm83/y;->w:Lm83/y;

    move-object v13, v1

    goto :goto_3

    :cond_3
    move-object/from16 v13, p10

    :goto_3
    const/high16 v1, 0x80000

    and-int/2addr v0, v1

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    move-object/from16 v23, v0

    :goto_4
    move-object/from16 v3, p0

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v12, p9

    move-object/from16 v14, p11

    move-object/from16 v15, p12

    move-object/from16 v16, p13

    move-object/from16 v17, p14

    move-object/from16 v18, p15

    move-object/from16 v19, p16

    move-object/from16 v20, p17

    move-object/from16 v21, p18

    move-object/from16 v22, p19

    move-object/from16 v24, p21

    move-object/from16 v25, p22

    goto :goto_5

    :cond_4
    move-object/from16 v23, p20

    goto :goto_4

    .line 35
    :goto_5
    invoke-direct/range {v3 .. v25}, Lvm2/d;-><init>(Landroidx/fragment/app/r0;Lc93/a;Lor2/y;Lcom/whoop/data/repositories/FeatureFlagChecker;Lwe1/a;Ln92/b;Lj02/i0;Ljava/time/Clock;Lcom/whoop/navigation/a;Ljava/util/List;Lo02/d;Lhj0/d;Lj02/l0;Lji0/f;Lvm2/a;Lvm2/m;Lvm2/f;Lvm2/j;Lyp0/a;Ldp0/g;Lj02/e;Lvm2/l;)V

    return-void
.end method

.method private final A(Lcom/whoop/navigation/NavigationScreenModel;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/navigation/NavigationScreenModel;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/navigation/CommunityScreenModel;

    sget-object v1, Lm83/z;->w:Lm83/z;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/whoop/navigation/CommunityScreenModel;

    invoke-virtual {p1}, Lcom/whoop/navigation/CommunityScreenModel;->getShareCode()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v0, "share_code"

    invoke-static {v0, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    return-object v1

    :cond_1
    return-object p1

    :cond_2
    return-object v1
.end method

.method private final A0(ZLjava/lang/String;Ljava/lang/String;)Lj02/p0;
    .locals 10

    new-instance v0, Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "android-app://com.whoop/weeklyPlan?navigateToPresets="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, "&scrollId="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz p3, :cond_0

    const-string p1, "&source="

    invoke-virtual {p1, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object p1, p0, Lvm2/d;->G:Lj02/i0;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "toString(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    invoke-static {}, Lor2/c1;->b()Leb/x0;

    move-result-object p2

    iget v6, p2, Leb/x0;->f:I

    invoke-static {}, Lor2/c1;->b()Leb/x0;

    move-result-object p2

    iget v7, p2, Leb/x0;->g:I

    invoke-static {}, Lor2/c1;->b()Leb/x0;

    move-result-object p2

    iget v8, p2, Leb/x0;->h:I

    invoke-static {}, Lor2/c1;->b()Leb/x0;

    move-result-object p2

    iget v9, p2, Leb/x0;->i:I

    new-instance v0, Leb/x0;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v9}, Leb/x0;-><init>(ZZIZZIIII)V

    const/4 p2, 0x0

    invoke-direct {p0, p2, p1, v0}, Lvm2/d;->M0(Leb/p0;Leb/k0;Leb/x0;)Lj02/p0;

    sget-object p1, Lj02/p0$a;->a:Lj02/p0$a;

    return-object p1
.end method

.method public static synthetic B0(Lvm2/d;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lj02/p0;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lvm2/d;->A0(ZLjava/lang/String;Ljava/lang/String;)Lj02/p0;

    move-result-object p0

    return-object p0
.end method

.method private final C0(Lj02/m0$y5;)Lj02/p0;
    .locals 10

    iget-object v0, p0, Lvm2/d;->w:Landroidx/fragment/app/r0;

    invoke-virtual {p1}, Lj02/m0$y5;->c()J

    move-result-wide v1

    invoke-virtual {p1}, Lj02/m0$y5;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lj02/m0$y5;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lj02/m0$y5;->d()D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {p1}, Lj02/m0$y5;->f()I

    move-result v6

    invoke-virtual {p1}, Lj02/m0$y5;->g()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {p1}, Lj02/m0$y5;->i()Z

    move-result v8

    invoke-virtual {p1}, Lj02/m0$y5;->b()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/whoop/whooplive/selfie/SelfieActivity;->i1(Landroid/content/Context;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Double;ILjava/lang/Long;ZI)Lcom/whoop/whooplive/selfie/SelfieActivity$g;

    move-result-object p1

    const-string v0, "intentBuilder(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lhj0/q;->e()Lhj0/q;

    move-result-object p1

    invoke-virtual {p1}, Lhj0/q;->m()V

    sget-object p1, Lj02/p0$f;->a:Lj02/p0$f;

    return-object p1
.end method

.method private final D0()Lj02/p0;
    .locals 2

    iget-object v0, p0, Lvm2/d;->G:Lj02/i0;

    const-string v1, "android-app://com.whoop/customizeOverview"

    invoke-virtual {v0, v1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v0

    iget-object v1, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/a0;

    invoke-virtual {v1, v0}, Leb/a0;->s(Leb/k0;)V

    sget-object v0, Lj02/p0$d;->a:Lj02/p0$d;

    return-object v0
.end method

.method private static final E(Lvm2/d;Leb/a0;Leb/n0;Landroid/os/Bundle;)V
    .locals 3

    const-string v0, "controller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destination"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lcom/whoop/navigation/d;->m(Leb/a0;Ltr2/n;ILjava/lang/Object;)V

    iget-object v2, p0, Lvm2/d;->R:Lvm2/j;

    invoke-virtual {v2}, Lvm2/j;->a()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0, p2}, Lvm2/d;->t(Leb/n0;)Lj02/m0;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object p2, p0, Lvm2/d;->V:Lvm2/l;

    invoke-virtual {p1}, Leb/a0;->m()Leb/q;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p1, Leb/q;->x:Leb/n0;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Leb/n0;->g()Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-virtual {p2, v0}, Lvm2/l;->b(Ljava/lang/String;)V

    invoke-virtual {p0, v2}, Lvm2/d;->M(Lj02/m0;)Lj02/p0;

    return-void

    :cond_1
    invoke-static {p1}, Lcom/whoop/navigation/d;->k(Leb/a0;)Z

    move-result p1

    iget p2, p2, Leb/n0;->H:I

    invoke-direct {p0, p2, p3}, Lvm2/d;->y(ILandroid/os/Bundle;)Ljava/lang/String;

    move-result-object p2

    if-nez p1, :cond_2

    move-object v0, p2

    :cond_2
    if-eqz v0, :cond_3

    iget-object p2, p0, Lvm2/d;->U:Lj02/e;

    new-instance p3, Lj02/d$d;

    invoke-direct {p3, v0}, Lj02/d$d;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Lj02/e;->c(Lj02/d;)V

    :cond_3
    if-nez p1, :cond_5

    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v1, 0x0

    :cond_5
    :goto_0
    iget-object p0, p0, Lvm2/d;->U:Lj02/e;

    new-instance p1, Lj02/d$c;

    invoke-direct {p1, v1}, Lj02/d$c;-><init>(Z)V

    invoke-virtual {p0, p1}, Lj02/e;->c(Lj02/d;)V

    return-void
.end method

.method private final E0(Lj02/m0;)Lj02/p0;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    instance-of v1, v7, Lj02/m0$e;

    if-eqz v1, :cond_0

    move-object v1, v7

    check-cast v1, Lj02/m0$e;

    invoke-direct {v0, v1}, Lvm2/d;->N(Lj02/m0$e;)Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_0
    instance-of v1, v7, Lj02/m0$f;

    if-eqz v1, :cond_1

    move-object v1, v7

    check-cast v1, Lj02/m0$f;

    invoke-direct {v0, v1}, Lvm2/d;->O(Lj02/m0$f;)Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_1
    instance-of v1, v7, Lj02/m0$d0;

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eqz v1, :cond_7

    move-object v1, v7

    check-cast v1, Lj02/m0$d0;

    invoke-virtual {v1}, Lj02/m0$d0;->d()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lj02/m0$d0;->e()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lj02/m0$d0;->b()Lj02/j;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lj02/j;->d()Ljava/lang/String;

    move-result-object v4

    move-object v10, v4

    goto :goto_0

    :cond_2
    move-object v10, v3

    :goto_0
    invoke-virtual {v1}, Lj02/m0$d0;->b()Lj02/j;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lj02/j;->c()Ljava/lang/String;

    move-result-object v4

    move-object v11, v4

    goto :goto_1

    :cond_3
    move-object v11, v3

    :goto_1
    invoke-virtual {v1}, Lj02/m0$d0;->b()Lj02/j;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lj02/j;->a()Ljava/lang/String;

    move-result-object v4

    move-object v12, v4

    goto :goto_2

    :cond_4
    move-object v12, v3

    :goto_2
    invoke-virtual {v1}, Lj02/m0$d0;->b()Lj02/j;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Lj02/j;->b()Ljava/lang/String;

    move-result-object v4

    move-object v13, v4

    goto :goto_3

    :cond_5
    move-object v13, v3

    :goto_3
    invoke-virtual {v1}, Lj02/m0$d0;->c()Lcom/whoop/navigation/e;

    move-result-object v1

    if-eqz v1, :cond_6

    sget-object v4, Lsm2/b;->a:Lsm2/b;

    invoke-virtual {v4, v1}, Lsm2/b;->b(Lcom/whoop/navigation/e;)Ljava/lang/String;

    move-result-object v1

    move-object v14, v1

    goto :goto_4

    :cond_6
    move-object v14, v3

    :goto_4
    invoke-static/range {v8 .. v14}, Lhi0/b;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lhi0/b$i;

    move-result-object v1

    invoke-static {v0, v1, v3, v2, v3}, Lvm2/d;->I0(Lvm2/d;Leb/p0;Leb/x0;ILjava/lang/Object;)Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_7
    instance-of v1, v7, Lj02/m0$o0;

    const/4 v4, 0x1

    if-eqz v1, :cond_8

    move-object v1, v7

    check-cast v1, Lj02/m0$o0;

    invoke-virtual {v1}, Lj02/m0$o0;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v3, v1, v4, v3}, Lvm2/d;->G0(Lvm2/d;Leb/p0;Ljava/lang/String;ILjava/lang/Object;)Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_8
    instance-of v1, v7, Lj02/m0$b3;

    if-eqz v1, :cond_9

    move-object v1, v7

    check-cast v1, Lj02/m0$b3;

    invoke-virtual {v1}, Lj02/m0$b3;->c()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Lvm2/d;->K0(Lvm2/d;Leb/p0;Leb/k0;Leb/x0;Ljava/lang/String;ILjava/lang/Object;)Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_9
    instance-of v1, v7, Lj02/m0$j4;

    if-eqz v1, :cond_a

    move-object v1, v7

    check-cast v1, Lj02/m0$j4;

    invoke-virtual {v1}, Lj02/m0$j4;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lvm2/d;->N0(Ljava/lang/String;)Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_a
    instance-of v1, v7, Lj02/m0$r0;

    if-eqz v1, :cond_b

    move-object v1, v7

    check-cast v1, Lj02/m0$r0;

    invoke-direct {v0, v1}, Lvm2/d;->R(Lj02/m0$r0;)Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_b
    instance-of v1, v7, Lj02/m0$u0;

    if-eqz v1, :cond_c

    invoke-direct {v0}, Lvm2/d;->D0()Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_c
    instance-of v1, v7, Lj02/m0$c1;

    if-eqz v1, :cond_d

    move-object v1, v7

    check-cast v1, Lj02/m0$c1;

    invoke-direct {v0, v1}, Lvm2/d;->U(Lj02/m0$c1;)Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_d
    instance-of v1, v7, Lj02/m0$j1;

    const-string v5, "android-app://com.whoop/settings/myAccountFragment"

    if-eqz v1, :cond_10

    iget-object v1, v0, Lvm2/d;->z:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v2, "maverick-membership-management-android"

    invoke-interface {v1, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_e

    const-string v1, "android-app://com.whoop/membershipManagement?openFamilyPlan=true"

    goto :goto_5

    :cond_e
    const-string v1, "android-app://com.whoop/settings/myAccountFragment?openFamilyPlan=true"

    :goto_5
    iget-object v4, v0, Lvm2/d;->G:Lj02/i0;

    invoke-virtual {v4, v1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v1

    iget-object v4, v0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v4}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Leb/a0;

    sget v6, Lhi0/e;->x:I

    iget-object v7, v0, Lvm2/d;->X:Leb/x0;

    invoke-virtual {v4, v6, v3, v7}, Leb/a0;->p(ILandroid/os/Bundle;Leb/x0;)V

    iget-object v3, v0, Lvm2/d;->z:Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-interface {v3, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_f

    iget-object v2, v0, Lvm2/d;->G:Lj02/i0;

    invoke-virtual {v2, v5}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v2

    iget-object v3, v0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Leb/a0;

    invoke-virtual {v3, v2}, Leb/a0;->s(Leb/k0;)V

    :cond_f
    iget-object v2, v0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leb/a0;

    invoke-virtual {v2, v1}, Leb/a0;->s(Leb/k0;)V

    sget-object v1, Lj02/p0$e;->a:Lj02/p0$e;

    return-object v1

    :cond_10
    instance-of v1, v7, Lj02/m0$g1;

    if-eqz v1, :cond_11

    move-object v1, v7

    check-cast v1, Lj02/m0$g1;

    invoke-virtual {v1}, Lj02/m0$g1;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lvm2/d;->V(Ljava/lang/String;)Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_11
    instance-of v1, v7, Lj02/m0$l1;

    if-eqz v1, :cond_12

    sget-object v1, Lj02/p0$f;->a:Lj02/p0$f;

    goto/16 :goto_d

    :cond_12
    instance-of v1, v7, Lj02/m0$q1;

    if-eqz v1, :cond_13

    move-object v1, v7

    check-cast v1, Lj02/m0$q1;

    invoke-direct {v0, v1}, Lvm2/d;->X(Lj02/m0$q1;)Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_13
    instance-of v1, v7, Lj02/m0$u1;

    if-eqz v1, :cond_14

    move-object v1, v7

    check-cast v1, Lj02/m0$u1;

    invoke-virtual {v1}, Lj02/m0$u1;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lvm2/d;->Y(Ljava/lang/String;)Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_14
    instance-of v1, v7, Lj02/m0$w1;

    if-eqz v1, :cond_15

    move-object v1, v7

    check-cast v1, Lj02/m0$w1;

    invoke-direct {v0, v1}, Lvm2/d;->Z(Lj02/m0$w1;)Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_15
    instance-of v1, v7, Lj02/m0$x1;

    if-eqz v1, :cond_16

    move-object v1, v7

    check-cast v1, Lj02/m0$x1;

    invoke-virtual {v1}, Lj02/m0$x1;->b()Z

    move-result v1

    invoke-direct {v0, v1}, Lvm2/d;->b0(Z)Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_16
    instance-of v1, v7, Lj02/m0$z1;

    if-eqz v1, :cond_17

    invoke-static {}, Lhi0/b;->m()Leb/p0;

    move-result-object v1

    invoke-static {v0, v1, v3, v2, v3}, Lvm2/d;->I0(Lvm2/d;Leb/p0;Leb/x0;ILjava/lang/Object;)Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_17
    instance-of v1, v7, Lj02/m0$y1;

    if-eqz v1, :cond_18

    move-object v1, v7

    check-cast v1, Lj02/m0$y1;

    invoke-virtual {v1}, Lj02/m0$y1;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lvm2/d;->c0(Ljava/lang/String;)Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_18
    instance-of v1, v7, Lj02/m0$d2;

    if-eqz v1, :cond_19

    move-object v1, v7

    check-cast v1, Lj02/m0$d2;

    invoke-virtual {v1}, Lj02/m0$d2;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lj02/m0$d2;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lvm2/d;->d0(Ljava/lang/String;Ljava/lang/String;)Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_19
    instance-of v1, v7, Lj02/m0$e2;

    if-eqz v1, :cond_1a

    move-object v1, v7

    check-cast v1, Lj02/m0$e2;

    invoke-direct {v0, v1}, Lvm2/d;->f0(Lj02/m0$e2;)Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_1a
    instance-of v1, v7, Lj02/m0$g2;

    if-eqz v1, :cond_1b

    move-object v1, v7

    check-cast v1, Lj02/m0$g2;

    invoke-direct {v0, v1}, Lvm2/d;->h0(Lj02/m0$g2;)Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_1b
    instance-of v1, v7, Lj02/m0$f2;

    if-eqz v1, :cond_1c

    invoke-direct {v0}, Lvm2/d;->g0()Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_1c
    instance-of v1, v7, Lj02/m0$h2;

    if-eqz v1, :cond_1d

    invoke-direct {v0}, Lvm2/d;->i0()Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_1d
    instance-of v1, v7, Lj02/m0$i2;

    if-eqz v1, :cond_1e

    move-object v1, v7

    check-cast v1, Lj02/m0$i2;

    invoke-direct {v0, v1}, Lvm2/d;->j0(Lj02/m0$i2;)Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_1e
    instance-of v1, v7, Lj02/m0$j2;

    if-eqz v1, :cond_1f

    move-object v1, v7

    check-cast v1, Lj02/m0$j2;

    invoke-direct {v0, v1}, Lvm2/d;->k0(Lj02/m0$j2;)Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_1f
    instance-of v1, v7, Lj02/m0$k2;

    if-eqz v1, :cond_20

    invoke-direct {v0}, Lvm2/d;->l0()Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_20
    instance-of v1, v7, Lj02/m0$l2;

    if-eqz v1, :cond_21

    invoke-direct {v0}, Lvm2/d;->m0()Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_21
    instance-of v1, v7, Lj02/m0$n2;

    if-eqz v1, :cond_22

    iget-object v1, v0, Lvm2/d;->G:Lj02/i0;

    const-string v2, "android-app://com.whoop/whoopProCheckoutFragment"

    invoke-virtual {v1, v2}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v1

    iget-object v2, v0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leb/a0;

    invoke-virtual {v2, v1}, Leb/a0;->s(Leb/k0;)V

    sget-object v1, Lj02/p0$e;->a:Lj02/p0$e;

    goto/16 :goto_d

    :cond_22
    instance-of v1, v7, Lj02/m0$o2;

    if-eqz v1, :cond_23

    sget-object v1, Lcom/whoop/profile/navigation/LevelsNavigationHelper;->INSTANCE:Lcom/whoop/profile/navigation/LevelsNavigationHelper;

    move-object v2, v7

    check-cast v2, Lj02/m0$o2;

    invoke-virtual {v1, v2}, Lcom/whoop/profile/navigation/LevelsNavigationHelper;->convertToMemberLevelProfileViewData(Lj02/m0$o2;)Lcom/whoop/domain/model/memberlevels/MemberLevelProfileViewData;

    move-result-object v1

    iget-object v2, v0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leb/a0;

    sget v3, Lcom/whoop/profile/R$id;->profile_levels_graph:I

    new-instance v4, Ll83/k;

    const-string v5, "memberLevelData"

    invoke-direct {v4, v5, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object v1

    new-instance v4, Leb/w0;

    invoke-direct {v4}, Leb/w0;-><init>()V

    invoke-static {v4}, Lor2/c1;->f(Leb/w0;)Leb/w0;

    move-result-object v4

    invoke-virtual {v4}, Leb/w0;->a()Leb/x0;

    move-result-object v4

    invoke-virtual {v2, v3, v1, v4}, Leb/a0;->p(ILandroid/os/Bundle;Leb/x0;)V

    sget-object v1, Lj02/p0$g;->a:Lj02/p0$g;

    goto/16 :goto_d

    :cond_23
    instance-of v1, v7, Lj02/m0$s2;

    if-eqz v1, :cond_24

    iget-object v1, v0, Lvm2/d;->G:Lj02/i0;

    const-string v2, "android-app://com.whoop/activation"

    invoke-virtual {v1, v2}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v1

    iget-object v2, v0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leb/a0;

    invoke-virtual {v2, v1}, Leb/a0;->s(Leb/k0;)V

    sget-object v1, Lj02/p0$d;->a:Lj02/p0$d;

    goto/16 :goto_d

    :cond_24
    instance-of v1, v7, Lj02/m0$e3;

    if-eqz v1, :cond_25

    iget-object v1, v0, Lvm2/d;->G:Lj02/i0;

    invoke-virtual {v1, v5}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v1

    iget-object v2, v0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leb/a0;

    invoke-virtual {v2, v1}, Leb/a0;->s(Leb/k0;)V

    sget-object v1, Lj02/p0$d;->a:Lj02/p0$d;

    goto/16 :goto_d

    :cond_25
    instance-of v1, v7, Lj02/m0$g3;

    if-eqz v1, :cond_26

    new-instance v1, Landroid/content/Intent;

    iget-object v2, v0, Lvm2/d;->w:Landroidx/fragment/app/r0;

    const-class v3, Lcom/whoop/video/VideoActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    move-object v2, v7

    check-cast v2, Lj02/m0$g3;

    invoke-virtual {v2}, Lj02/m0$g3;->b()Ljava/lang/String;

    move-result-object v2

    const-string v3, "videoUrl"

    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "SHOULD_SUBTITLES_DEFAULT_TO_OFF"

    invoke-virtual {v1, v2, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    iget-object v2, v0, Lvm2/d;->w:Landroidx/fragment/app/r0;

    invoke-virtual {v2, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    sget-object v1, Lj02/p0$f;->a:Lj02/p0$f;

    goto/16 :goto_d

    :cond_26
    instance-of v1, v7, Lj02/m0$f3;

    const-string v2, "&entryPoint="

    const-string v5, ""

    const-string v6, "UTF-8"

    if-eqz v1, :cond_2a

    iget-object v1, v0, Lvm2/d;->z:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v3, "android-encode-education-path-with-spaces"

    invoke-interface {v1, v3}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_27

    move-object v1, v7

    check-cast v1, Lj02/m0$f3;

    invoke-virtual {v1}, Lj02/m0$f3;->f()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_6

    :cond_27
    move-object v1, v7

    check-cast v1, Lj02/m0$f3;

    invoke-virtual {v1}, Lj02/m0$f3;->f()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v6}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_6
    move-object v3, v7

    check-cast v3, Lj02/m0$f3;

    invoke-virtual {v3}, Lj02/m0$f3;->h()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_29

    invoke-static {v4, v6}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_28

    goto :goto_7

    :cond_28
    move-object v5, v4

    :cond_29
    :goto_7
    invoke-virtual {v3}, Lj02/m0$f3;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lj02/m0$f3;->d()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, Lj02/m0$f3;->g()Ljava/lang/String;

    move-result-object v3

    iget-object v8, v0, Lvm2/d;->G:Lj02/i0;

    const-string v9, "&eventName="

    const-string v10, "&contentType="

    const-string v11, "android-app://com.whoop/education?path="

    invoke-static {v11, v1, v9, v4, v10}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v9, "&articleId="

    invoke-static {v4, v5, v9, v1, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&screenName="

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v2

    const/16 v5, 0xd

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lvm2/d;->K0(Lvm2/d;Leb/p0;Leb/k0;Leb/x0;Ljava/lang/String;ILjava/lang/Object;)Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_2a
    instance-of v1, v7, Lj02/m0$l3;

    if-eqz v1, :cond_2b

    move-object v1, v7

    check-cast v1, Lj02/m0$l3;

    invoke-virtual {v1}, Lj02/m0$l3;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lj02/m0$l3;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lj02/m0$l3;->b()J

    move-result-wide v4

    iget-object v1, v0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/a0;

    iget-object v6, v0, Lvm2/d;->G:Lj02/i0;

    const-string v8, "?entryPoint="

    const-string v9, "&cycleId="

    const-string v10, "android-app://com.whoop/onboardingStoriesFragmentRedesign/"

    invoke-static {v10, v2, v8, v3, v9}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v2

    invoke-virtual {v1, v2}, Leb/a0;->s(Leb/k0;)V

    sget-object v1, Lj02/p0$d;->a:Lj02/p0$d;

    goto/16 :goto_d

    :cond_2b
    instance-of v1, v7, Lj02/m0$y4;

    if-eqz v1, :cond_35

    move-object v1, v7

    check-cast v1, Lj02/m0$y4;

    invoke-virtual {v1}, Lj02/m0$y4;->e()Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1}, Lj02/m0$y4;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lj02/m0$y4;->b()Ljava/lang/String;

    move-result-object v6

    if-nez v3, :cond_2d

    if-eqz v4, :cond_2c

    goto :goto_8

    :cond_2c
    invoke-virtual {v1}, Lj02/m0$y4;->d()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lvm2/d;->w0(Ljava/lang/String;)Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_2d
    :goto_8
    if-eqz v3, :cond_2e

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    goto :goto_9

    :cond_2e
    const-wide/16 v8, -0x1

    :goto_9
    if-eqz v4, :cond_2f

    invoke-virtual {v2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_30

    :cond_2f
    move-object v2, v5

    :cond_30
    if-eqz v6, :cond_31

    const-string v3, "&activityId="

    invoke-virtual {v3, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_32

    :cond_31
    move-object v3, v5

    :cond_32
    invoke-virtual {v1}, Lj02/m0$y4;->d()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_34

    invoke-static {v4}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v6, "&openTab="

    invoke-static {v6, v4}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_33

    goto :goto_a

    :cond_33
    move-object v5, v4

    :cond_34
    :goto_a
    iget-object v4, v0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v4}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Leb/a0;

    iget-object v6, v0, Lvm2/d;->G:Lj02/i0;

    invoke-virtual {v1}, Lj02/m0$y4;->f()Z

    move-result v1

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "android-app://com.whoop/workout/template?templateId="

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v8, "&isFromWhoopCoach="

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v1

    invoke-virtual {v4, v1}, Leb/a0;->s(Leb/k0;)V

    sget-object v1, Lj02/p0$d;->a:Lj02/p0$d;

    goto/16 :goto_d

    :cond_35
    instance-of v1, v7, Lj02/m0$q3;

    const-string v2, "&source="

    if-eqz v1, :cond_39

    move-object v1, v7

    check-cast v1, Lj02/m0$q3;

    invoke-virtual {v1}, Lj02/m0$q3;->b()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_36

    iget-object v5, v0, Lvm2/d;->G:Lj02/i0;

    invoke-virtual {v1}, Lj02/m0$q3;->c()Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "android-app://com.whoop/pregnancyInsights?date="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v2

    if-nez v2, :cond_37

    :cond_36
    iget-object v2, v0, Lvm2/d;->G:Lj02/i0;

    invoke-virtual {v1}, Lj02/m0$q3;->c()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "android-app://com.whoop/pregnancyInsights?source="

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v2

    :cond_37
    new-instance v1, Leb/w0;

    invoke-direct {v1}, Leb/w0;-><init>()V

    iput-boolean v4, v1, Leb/w0;->a:Z

    iget-object v3, v0, Lvm2/d;->z:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v4, "android-health-push-navigation"

    invoke-interface {v3, v4}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_38

    invoke-static {v1}, Lor2/c1;->f(Leb/w0;)Leb/w0;

    move-result-object v1

    invoke-virtual {v1}, Leb/w0;->a()Leb/x0;

    move-result-object v1

    goto :goto_b

    :cond_38
    invoke-virtual {v1}, Leb/w0;->a()Leb/x0;

    move-result-object v1

    :goto_b
    iget-object v3, v0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Leb/a0;

    invoke-virtual {v3, v2, v1}, Leb/a0;->t(Leb/k0;Leb/x0;)V

    sget-object v1, Lj02/p0$d;->a:Lj02/p0$d;

    goto/16 :goto_d

    :cond_39
    instance-of v1, v7, Lj02/m0$r3;

    if-eqz v1, :cond_3a

    iget-object v1, v0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/a0;

    iget-object v3, v0, Lvm2/d;->G:Lj02/i0;

    move-object v4, v7

    check-cast v4, Lj02/m0$r3;

    invoke-virtual {v4}, Lj02/m0$r3;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Lj02/m0$r3;->c()Ljava/lang/String;

    move-result-object v4

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v8, "android-app://com.whoop/pregnancySettingsFragment?pregnancyScreen="

    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v2

    invoke-virtual {v1, v2}, Leb/a0;->s(Leb/k0;)V

    sget-object v1, Lj02/p0$d;->a:Lj02/p0$d;

    goto/16 :goto_d

    :cond_3a
    instance-of v1, v7, Lj02/m0$s3;

    if-eqz v1, :cond_3b

    iget-object v1, v0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/a0;

    iget-object v2, v0, Lvm2/d;->G:Lj02/i0;

    move-object v3, v7

    check-cast v3, Lj02/m0$s3;

    invoke-virtual {v3}, Lj02/m0$s3;->b()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "android-app://com.whoop/pregnancyInsights?id="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v2

    invoke-virtual {v1, v2}, Leb/a0;->s(Leb/k0;)V

    sget-object v1, Lj02/p0$d;->a:Lj02/p0$d;

    goto/16 :goto_d

    :cond_3b
    instance-of v1, v7, Lj02/m0$y3;

    if-eqz v1, :cond_3c

    iget-object v1, v0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/a0;

    iget-object v2, v0, Lvm2/d;->G:Lj02/i0;

    const-string v3, "android-app://com.whoop/reactivationModal"

    invoke-virtual {v2, v3}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v2

    invoke-virtual {v1, v2}, Leb/a0;->s(Leb/k0;)V

    sget-object v1, Lj02/p0$d;->a:Lj02/p0$d;

    goto/16 :goto_d

    :cond_3c
    instance-of v1, v7, Lj02/m0$k4;

    if-eqz v1, :cond_3d

    move-object v1, v7

    check-cast v1, Lj02/m0$k4;

    invoke-virtual {v1}, Lj02/m0$k4;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lj02/m0$k4;->c()Ljava/time/LocalDate;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lvm2/d;->o0(Ljava/lang/String;Ljava/time/LocalDate;)Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_3d
    instance-of v1, v7, Lj02/m0$l4;

    if-eqz v1, :cond_3e

    invoke-direct {v0}, Lvm2/d;->p0()Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_3e
    instance-of v1, v7, Lj02/m0$m4;

    if-eqz v1, :cond_3f

    move-object v1, v7

    check-cast v1, Lj02/m0$m4;

    invoke-direct {v0, v1}, Lvm2/d;->q0(Lj02/m0$m4;)Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_3f
    instance-of v1, v7, Lj02/m0$n4;

    if-eqz v1, :cond_40

    invoke-direct {v0}, Lvm2/d;->r0()Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_40
    instance-of v1, v7, Lj02/m0$o4;

    if-eqz v1, :cond_41

    move-object v1, v7

    check-cast v1, Lj02/m0$o4;

    invoke-direct {v0, v1}, Lvm2/d;->s0(Lj02/m0$o4;)Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_41
    instance-of v1, v7, Lj02/m0$p4;

    if-eqz v1, :cond_42

    invoke-direct {v0}, Lvm2/d;->t0()Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_42
    sget-object v1, Lj02/m0$q4;->b:Lj02/m0$q4;

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_43

    invoke-direct {v0}, Lvm2/d;->u0()Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_43
    instance-of v1, v7, Lj02/m0$r4;

    if-eqz v1, :cond_44

    iget-object v1, v0, Lvm2/d;->G:Lj02/i0;

    move-object v2, v7

    check-cast v2, Lj02/m0$r4;

    invoke-virtual {v2}, Lj02/m0$r4;->b()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "whoop://com.whoop/sleepCoachFragment/?entryPoint=Home&clickType=tile&isFromHome=true&sourcePillar="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v1

    sget v14, Lnf1/a;->g:I

    sget v15, Lnf1/a;->i:I

    sget v16, Lnf1/a;->f:I

    sget v17, Lnf1/a;->k:I

    new-instance v8, Leb/x0;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, -0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v8 .. v17}, Leb/x0;-><init>(ZZIZZIIII)V

    invoke-direct {v0, v3, v1, v8}, Lvm2/d;->M0(Leb/p0;Leb/k0;Leb/x0;)Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_44
    instance-of v1, v7, Lj02/m0$t4;

    if-eqz v1, :cond_47

    sget-object v1, Lcom/whoop/realtime/presentation/StartActivityActivity;->k0:Lcom/whoop/realtime/presentation/StartActivityActivity$a;

    iget-object v2, v0, Lvm2/d;->w:Landroidx/fragment/app/r0;

    invoke-virtual {v1, v2}, Lcom/whoop/realtime/presentation/StartActivityActivity$a;->a(Landroid/content/Context;)Lhj0/q;

    move-result-object v1

    invoke-virtual {v1}, Lhj0/q;->e()Lhj0/q;

    move-result-object v1

    invoke-virtual {v1}, Lhj0/q;->f()Landroid/content/Intent;

    move-result-object v1

    move-object v2, v7

    check-cast v2, Lj02/m0$t4;

    invoke-virtual {v2}, Lj02/m0$t4;->c()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_45

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    const-string v4, "sport_id"

    invoke-virtual {v1, v4, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    :cond_45
    invoke-virtual {v2}, Lj02/m0$t4;->b()Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v2, :cond_46

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const-string v3, "auto_start"

    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :cond_46
    iget-object v2, v0, Lvm2/d;->w:Landroidx/fragment/app/r0;

    invoke-virtual {v2, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    sget-object v1, Lj02/p0$f;->a:Lj02/p0$f;

    goto/16 :goto_d

    :cond_47
    instance-of v1, v7, Lj02/m0$v4;

    if-eqz v1, :cond_48

    move-object v1, v7

    check-cast v1, Lj02/m0$v4;

    invoke-virtual {v1}, Lj02/m0$v4;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lj02/m0$v4;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lj02/m0$v4;->d()Ljava/lang/String;

    move-result-object v1

    const-string v4, "&scope="

    const-string v5, "&state="

    const-string v6, "android-app://com.whoop/strava/navigation?code="

    invoke-static {v6, v2, v4, v3, v5}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Lvm2/d;->G:Lj02/i0;

    invoke-virtual {v2, v1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v2

    const/16 v5, 0xd

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lvm2/d;->K0(Lvm2/d;Leb/p0;Leb/k0;Leb/x0;Ljava/lang/String;ILjava/lang/Object;)Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_48
    instance-of v1, v7, Lj02/m0$c5;

    if-eqz v1, :cond_49

    move-object v1, v7

    check-cast v1, Lj02/m0$c5;

    invoke-virtual {v1}, Lj02/m0$c5;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lj02/m0$c5;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lvm2/d;->x0(Ljava/lang/String;Ljava/lang/String;)Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_49
    instance-of v1, v7, Lj02/m0$f5;

    if-eqz v1, :cond_4a

    move-object v1, v7

    check-cast v1, Lj02/m0$f5;

    invoke-direct {v0, v1}, Lvm2/d;->y0(Lj02/m0$f5;)V

    sget-object v1, Lj02/p0$f;->a:Lj02/p0$f;

    goto/16 :goto_d

    :cond_4a
    instance-of v1, v7, Lj02/m0$d5;

    if-eqz v1, :cond_4b

    invoke-direct {v0}, Lvm2/d;->W()Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_4b
    instance-of v1, v7, Lj02/m0$o5;

    if-eqz v1, :cond_4c

    iget-object v1, v0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/a0;

    iget-object v2, v0, Lvm2/d;->G:Lj02/i0;

    const-string v3, "android-app://com.whoop/upcycle_landing"

    invoke-virtual {v2, v3}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v2

    invoke-virtual {v1, v2}, Leb/a0;->s(Leb/k0;)V

    sget-object v1, Lj02/p0$d;->a:Lj02/p0$d;

    goto/16 :goto_d

    :cond_4c
    instance-of v1, v7, Lj02/m0$y5;

    if-eqz v1, :cond_4d

    move-object v1, v7

    check-cast v1, Lj02/m0$y5;

    invoke-direct {v0, v1}, Lvm2/d;->C0(Lj02/m0$y5;)Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_4d
    instance-of v1, v7, Lj02/m0$f0;

    if-eqz v1, :cond_4e

    move-object v1, v7

    check-cast v1, Lj02/m0$f0;

    invoke-virtual {v1}, Lj02/m0$f0;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lvm2/d;->Q(Ljava/lang/String;)Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_4e
    instance-of v1, v7, Lj02/m0$e0;

    if-eqz v1, :cond_4f

    move-object v1, v7

    check-cast v1, Lj02/m0$e0;

    invoke-virtual {v1}, Lj02/m0$e0;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lj02/m0$e0;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lvm2/d;->P(Ljava/lang/String;Ljava/lang/String;)Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_4f
    sget-object v1, Lj02/m0$u4;->b:Lj02/m0$u4;

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_50

    invoke-direct {v0}, Lvm2/d;->v0()Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_50
    instance-of v1, v7, Lj02/m0$g5;

    if-eqz v1, :cond_51

    iget-object v1, v0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/a0;

    iget-object v2, v0, Lvm2/d;->G:Lj02/i0;

    move-object v3, v7

    check-cast v3, Lj02/m0$g5;

    invoke-virtual {v3}, Lj02/m0$g5;->b()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "android-app://com.whoop/coaching/sleepcoach/turnOffAlarmWarningFragment?notificationTileId="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v2

    invoke-virtual {v1, v2}, Leb/a0;->s(Leb/k0;)V

    sget-object v1, Lj02/p0$d;->a:Lj02/p0$d;

    goto/16 :goto_d

    :cond_51
    instance-of v1, v7, Lj02/m0$s0;

    if-eqz v1, :cond_52

    move-object v1, v7

    check-cast v1, Lj02/m0$s0;

    invoke-virtual {v1}, Lj02/m0$s0;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lvm2/d;->S(Ljava/lang/String;)Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_52
    sget-object v1, Lj02/m0$n0;->b:Lj02/m0$n0;

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_53

    iget-object v1, v0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/a0;

    iget-object v2, v0, Lvm2/d;->G:Lj02/i0;

    const-string v3, "android-app://com.whoop/ai-coach-settings"

    invoke-virtual {v2, v3}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v2

    invoke-virtual {v1, v2}, Leb/a0;->s(Leb/k0;)V

    sget-object v1, Lj02/p0$d;->a:Lj02/p0$d;

    goto/16 :goto_d

    :cond_53
    sget-object v1, Lj02/m0$q5;->b:Lj02/m0$q5;

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_54

    iget-object v1, v0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/a0;

    iget-object v2, v0, Lvm2/d;->G:Lj02/i0;

    const-string v3, "android-app://com.whoop/userJourneyFragment"

    invoke-virtual {v2, v3}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v2

    invoke-virtual {v1, v2}, Leb/a0;->s(Leb/k0;)V

    sget-object v1, Lj02/p0$d;->a:Lj02/p0$d;

    goto/16 :goto_d

    :cond_54
    instance-of v1, v7, Lj02/m0$t5;

    if-eqz v1, :cond_55

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lvm2/d;->B0(Lvm2/d;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_55
    instance-of v1, v7, Lj02/m0$r5;

    const-string v4, "&analyticsSource="

    if-eqz v1, :cond_56

    iget-object v1, v0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/a0;

    iget-object v2, v0, Lvm2/d;->G:Lj02/i0;

    move-object v3, v7

    check-cast v3, Lj02/m0$r5;

    invoke-virtual {v3}, Lj02/m0$r5;->c()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v3}, Lj02/m0$r5;->b()Ljava/lang/String;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v8, "android-app://com.whoop/customizePlan?planEditScreens="

    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v2

    invoke-virtual {v1, v2}, Leb/a0;->s(Leb/k0;)V

    sget-object v1, Lj02/p0$d;->a:Lj02/p0$d;

    goto/16 :goto_d

    :cond_56
    instance-of v1, v7, Lj02/m0$s5;

    if-eqz v1, :cond_57

    move-object v1, v7

    check-cast v1, Lj02/m0$s5;

    invoke-virtual {v1}, Lj02/m0$s5;->c()Z

    move-result v2

    invoke-virtual {v1}, Lj02/m0$s5;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lj02/m0$s5;->d()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v2, v3, v1}, Lvm2/d;->A0(ZLjava/lang/String;Ljava/lang/String;)Lj02/p0;

    sget-object v1, Lj02/p0$d;->a:Lj02/p0$d;

    goto/16 :goto_d

    :cond_57
    instance-of v1, v7, Lj02/m0$u5;

    const-string v8, "toString(...)"

    if-eqz v1, :cond_64

    invoke-static {}, Lor2/c1;->b()Leb/x0;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    move-object v5, v7

    check-cast v5, Lj02/m0$u5;

    invoke-virtual {v5}, Lj02/m0$u5;->k()Z

    move-result v9

    invoke-virtual {v5}, Lj02/m0$u5;->m()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5}, Lj02/m0$u5;->l()Z

    move-result v11

    invoke-virtual {v5}, Lj02/m0$u5;->b()Ljava/lang/String;

    move-result-object v12

    const-string v13, "&planName="

    const-string v14, "&noPlanShowMetricSelection="

    const-string v15, "android-app://com.whoop/hubAndSpoke?locked="

    invoke-static {v15, v13, v10, v14, v9}, Lev/n;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Lj02/m0$u5;->j()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_58

    invoke-static {v4, v6}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "&initialSelection="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_58
    invoke-virtual {v5}, Lj02/m0$u5;->e()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_59

    const-string v9, "&date="

    invoke-virtual {v9, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_59
    invoke-virtual {v5}, Lj02/m0$u5;->p()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_5a

    invoke-virtual {v2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5a
    invoke-virtual {v5}, Lj02/m0$u5;->o()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5b

    const-string v4, "&presetPlanCategory="

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5b
    invoke-virtual {v5}, Lj02/m0$u5;->n()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5c

    invoke-static {v2, v6}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v9, "&planTitle="

    invoke-direct {v4, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5c
    invoke-virtual {v5}, Lj02/m0$u5;->f()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5d

    invoke-static {v2, v6}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v9, "&description="

    invoke-direct {v4, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5d
    invoke-virtual {v5}, Lj02/m0$u5;->i()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5e

    invoke-static {v2, v6}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v9, "&explanationTitle="

    invoke-direct {v4, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5e
    invoke-virtual {v5}, Lj02/m0$u5;->h()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5f

    invoke-static {v2, v6}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v6, "&explanation="

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5f
    invoke-virtual {v5}, Lj02/m0$u5;->q()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_60

    const-string v4, "&templateId="

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_60
    invoke-virtual {v5}, Lj02/m0$u5;->d()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_61

    const-string v4, "&category="

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_61
    invoke-virtual {v5}, Lj02/m0$u5;->c()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_62

    const-string v4, "&carouselPlacement="

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_62
    invoke-virtual {v5}, Lj02/m0$u5;->g()Lj02/v;

    move-result-object v2

    if-eqz v2, :cond_63

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "&dismissalType="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_63
    iget-object v2, v0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leb/a0;

    iget-object v4, v0, Lvm2/d;->G:Lj02/i0;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Leb/a0;->t(Leb/k0;Leb/x0;)V

    sget-object v1, Lj02/p0$d;->a:Lj02/p0$d;

    goto/16 :goto_d

    :cond_64
    instance-of v1, v7, Lj02/m0$v5;

    if-eqz v1, :cond_65

    iget-object v1, v0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/a0;

    iget-object v2, v0, Lvm2/d;->G:Lj02/i0;

    sget-object v3, Lvt2/c;->a:Lvt2/c;

    move-object v4, v7

    check-cast v4, Lj02/m0$v5;

    invoke-virtual {v4}, Lj02/m0$v5;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lvt2/c;->a(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v2

    invoke-virtual {v1, v2}, Leb/a0;->s(Leb/k0;)V

    sget-object v1, Lj02/p0$d;->a:Lj02/p0$d;

    goto/16 :goto_d

    :cond_65
    instance-of v1, v7, Lj02/m0$w5;

    if-eqz v1, :cond_66

    invoke-direct {v0}, Lvm2/d;->z0()Lj02/p0;

    move-result-object v1

    goto/16 :goto_d

    :cond_66
    instance-of v1, v7, Lj02/m0$x5;

    if-eqz v1, :cond_6a

    new-instance v1, Landroid/net/Uri$Builder;

    invoke-direct {v1}, Landroid/net/Uri$Builder;-><init>()V

    const-string v2, "android-app"

    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    const-string v2, "com.whoop"

    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    const-string v2, "whooplabs"

    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v1

    move-object v2, v7

    check-cast v2, Lj02/m0$x5;

    invoke-virtual {v2}, Lj02/m0$x5;->c()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_67

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    const-string v4, "campaignId"

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v4, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    :cond_67
    invoke-virtual {v2}, Lj02/m0$x5;->d()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_68

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    const-string v4, "sessionId"

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v4, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    :cond_68
    invoke-virtual {v2}, Lj02/m0$x5;->b()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_69

    const-string v3, "campaignFilter"

    invoke-virtual {v1, v3, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    :cond_69
    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v1

    iget-object v2, v0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leb/a0;

    iget-object v3, v0, Lvm2/d;->G:Lj02/i0;

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v1

    invoke-virtual {v2, v1}, Leb/a0;->s(Leb/k0;)V

    sget-object v1, Lj02/p0$d;->a:Lj02/p0$d;

    goto/16 :goto_d

    :cond_6a
    instance-of v1, v7, Lj02/m0$a6;

    if-eqz v1, :cond_6b

    iget-object v1, v0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/a0;

    iget-object v2, v0, Lvm2/d;->G:Lj02/i0;

    move-object v3, v7

    check-cast v3, Lj02/m0$a6;

    invoke-virtual {v3}, Lj02/m0$a6;->b()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "android-app://com.whoop/userJourneyFragment?year="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v2

    invoke-virtual {v1, v2}, Leb/a0;->s(Leb/k0;)V

    sget-object v1, Lj02/p0$d;->a:Lj02/p0$d;

    goto/16 :goto_d

    :cond_6b
    instance-of v1, v7, Lj02/m0$b6;

    if-eqz v1, :cond_6c

    iget-object v1, v0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/a0;

    iget-object v2, v0, Lvm2/d;->G:Lj02/i0;

    const-string v3, "android-app://com.whoop/yearinreviewshare"

    invoke-virtual {v2, v3}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v2

    sget v14, Lnf1/a;->e:I

    sget v17, Lnf1/a;->p:I

    new-instance v8, Leb/x0;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, -0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    move v15, v11

    move/from16 v16, v11

    invoke-direct/range {v8 .. v17}, Leb/x0;-><init>(ZZIZZIIII)V

    invoke-virtual {v1, v2, v8}, Leb/a0;->t(Leb/k0;Leb/x0;)V

    sget-object v1, Lj02/p0$d;->a:Lj02/p0$d;

    goto/16 :goto_d

    :cond_6c
    instance-of v1, v7, Lj02/m0$j0;

    if-eqz v1, :cond_6d

    iget-object v1, v0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/a0;

    iget-object v2, v0, Lvm2/d;->G:Lj02/i0;

    move-object v3, v7

    check-cast v3, Lj02/m0$j0;

    invoke-virtual {v3}, Lj02/m0$j0;->b()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "android-app://com.whoop/challengeDetails?name="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v2

    invoke-virtual {v1, v2}, Leb/a0;->s(Leb/k0;)V

    sget-object v1, Lj02/p0$d;->a:Lj02/p0$d;

    goto :goto_d

    :cond_6d
    instance-of v1, v7, Lj02/m0$z5;

    if-eqz v1, :cond_70

    move-object v1, v7

    check-cast v1, Lj02/m0$z5;

    invoke-virtual {v1}, Lj02/m0$z5;->c()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_6e

    invoke-static {v4}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :cond_6e
    if-nez v3, :cond_6f

    goto :goto_c

    :cond_6f
    move-object v5, v3

    :goto_c
    iget-object v2, v0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leb/a0;

    iget-object v3, v0, Lvm2/d;->G:Lj02/i0;

    invoke-virtual {v1}, Lj02/m0$z5;->b()Ljava/lang/String;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v6, "android-app://com.whoop/whoopShare?path="

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v1

    invoke-virtual {v2, v1}, Leb/a0;->s(Leb/k0;)V

    sget-object v1, Lj02/p0$d;->a:Lj02/p0$d;

    goto :goto_d

    :cond_70
    sget-object v1, Lj02/m0$j3;->b:Lj02/m0$j3;

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_71

    sget-object v1, Lj02/p0$c;->a:Lj02/p0$c;

    goto :goto_d

    :cond_71
    sget-object v1, Lj02/p0$h;->a:Lj02/p0$h;

    :goto_d
    iget-object v2, v0, Lvm2/d;->W:Ltr2/n;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-interface {v3}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Navigation to "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " resulted in "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    new-array v4, v4, [Lqr2/a$a;

    invoke-interface {v2, v3, v4}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v1
.end method

.method private final F(Lj02/m0;)Z
    .locals 1

    instance-of v0, p1, Lj02/m0$z1;

    if-nez v0, :cond_0

    instance-of p1, p1, Lj02/m0$y1;

    if-eqz p1, :cond_1

    :cond_0
    iget-object p1, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Leb/a0;

    invoke-virtual {p1}, Leb/a0;->i()Leb/n0;

    move-result-object p1

    if-eqz p1, :cond_1

    iget p1, p1, Leb/n0;->H:I

    sget v0, Lhi0/e;->D2:I

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private final F0(Leb/p0;Ljava/lang/String;)Lj02/p0;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-object v3, v0, Lvm2/d;->S:Lyp0/a;

    invoke-interface {v3}, Lyp0/a;->a()Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v1, Lcom/whoop/navigation/AppScreen$m1;->w:Lcom/whoop/navigation/AppScreen$m1;

    new-instance v2, Lj02/v0;

    const-string v3, "community"

    invoke-direct {v2, v3}, Lj02/v0;-><init>(Ljava/lang/String;)V

    new-instance v3, Lcom/whoop/navigation/CommunityUnavailableScreenModel;

    const-string v4, "followers-service/v1/error/medicare"

    const-string v5, "COMMUNITY"

    invoke-direct {v3, v4, v5}, Lcom/whoop/navigation/CommunityUnavailableScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Lcom/whoop/navigation/e;

    invoke-direct {v4, v1, v3, v2}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;)V

    invoke-virtual {v0, v4}, Lvm2/d;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    goto :goto_3

    :cond_0
    if-eqz v1, :cond_1

    iget-object v2, v0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leb/a0;

    invoke-virtual {v2, v1}, Leb/a0;->v(Leb/p0;)V

    goto :goto_3

    :cond_1
    sget-object v1, Lm92/d;->a:Lm92/d;

    iget-object v3, v0, Lvm2/d;->z:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iget-object v4, v0, Lvm2/d;->E:Lwe1/a;

    invoke-virtual {v1, v3, v4}, Lm92/d;->a(Lcom/whoop/data/repositories/FeatureFlagChecker;Lwe1/a;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_4

    if-eqz v2, :cond_3

    invoke-static {v2}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "followers-service/v1/followers-home?share_code="

    invoke-static {v4, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    move-object v5, v1

    goto :goto_2

    :cond_3
    :goto_1
    const-string v1, "followers-service/v1/followers-home"

    goto :goto_0

    :goto_2
    new-instance v4, Lcom/whoop/navigation/models/ApiRequest;

    sget-object v6, Lcom/whoop/navigation/models/GenericHttpMethod;->GET:Lcom/whoop/navigation/models/GenericHttpMethod;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/whoop/navigation/models/ApiRequest;-><init>(Ljava/lang/String;Lcom/whoop/navigation/models/GenericHttpMethod;Lkotlinx/serialization/json/JsonElement;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Lcom/whoop/analytics/MetricEventModel;

    const-string v1, "community_followers_home"

    const/4 v5, 0x2

    invoke-direct {v12, v1, v3, v5, v3}, Lcom/whoop/analytics/MetricEventModel;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v14, v0, Lvm2/d;->X:Leb/x0;

    invoke-direct {v0, v2}, Lvm2/d;->r(Ljava/lang/String;)Lcom/whoop/navigation/GenericCachePolicy;

    move-result-object v9

    new-instance v6, Lj02/m0$e5;

    const/16 v16, 0x158

    const/16 v17, 0x0

    const-string v7, "COMMUNITY"

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    move-object v8, v4

    invoke-direct/range {v6 .. v17}, Lj02/m0$e5;-><init>(Ljava/lang/String;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/GenericCachePolicy;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/models/GenericInteraction;Leb/x0;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v6}, Lvm2/d;->b(Lj02/m0;)Lj02/p0;

    goto :goto_3

    :cond_4
    iget-object v1, v0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/a0;

    sget v2, Lhi0/e;->s:I

    iget-object v4, v0, Lvm2/d;->X:Leb/x0;

    invoke-virtual {v1, v2, v3, v4}, Leb/a0;->p(ILandroid/os/Bundle;Leb/x0;)V

    :goto_3
    sget-object v1, Lj02/p0$b;->a:Lj02/p0$b;

    return-object v1
.end method

.method private final G(Lj02/p0;)Z
    .locals 1

    instance-of v0, p1, Lj02/p0$c;

    if-nez v0, :cond_0

    instance-of v0, p1, Lj02/p0$f;

    if-nez v0, :cond_0

    instance-of p1, p1, Lj02/p0$h;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static synthetic G0(Lvm2/d;Leb/p0;Ljava/lang/String;ILjava/lang/Object;)Lj02/p0;
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    :cond_1
    invoke-direct {p0, p1, p2}, Lvm2/d;->F0(Leb/p0;Ljava/lang/String;)Lj02/p0;

    move-result-object p0

    return-object p0
.end method

.method private final H0(Leb/p0;Leb/x0;)Lj02/p0;
    .locals 11

    if-eqz p1, :cond_0

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1}, Leb/p0;->a()I

    move-result v1

    invoke-interface {p1}, Leb/p0;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, v1, p1, p2}, Leb/a0;->p(ILandroid/os/Bundle;Leb/x0;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Leb/a0;

    sget p2, Lhi0/e;->v:I

    new-instance v0, Ll83/k;

    const-string v1, "destinationPillar"

    const-string v2, "OVERVIEW"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object v0

    sget v4, Lhi0/e;->D2:I

    new-instance v1, Leb/x0;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, -0x1

    move v8, v7

    move v9, v7

    move v10, v7

    invoke-direct/range {v1 .. v10}, Leb/x0;-><init>(ZZIZZIIII)V

    invoke-virtual {p1, p2, v0, v1}, Leb/a0;->p(ILandroid/os/Bundle;Leb/x0;)V

    :goto_0
    sget-object p1, Lj02/p0$d;->a:Lj02/p0$d;

    return-object p1
.end method

.method private final I(Landroid/content/Intent;Lj02/l;)V
    .locals 5

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "push_source_id"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    instance-of p2, p2, Lj02/b;

    if-eqz p2, :cond_2

    :goto_0
    return-void

    :cond_2
    const-string p2, "push_type"

    invoke-virtual {p1, p2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v1, "unknown"

    if-nez p2, :cond_3

    move-object p2, v1

    :cond_3
    const-string v2, "push_channel_id"

    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    move-object v1, p1

    :goto_1
    iget-object p1, p0, Lvm2/d;->W:Ltr2/n;

    const-string v2, "] [type="

    const-string v3, "] [channel_id="

    const-string v4, "Push Notification with [id="

    invoke-static {v4, v0, v2, p2, v3}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v0, "] failed to open - Failed to create a destination from deep link"

    invoke-static {v1, v0, p2}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public static synthetic I0(Lvm2/d;Leb/p0;Leb/x0;ILjava/lang/Object;)Lj02/p0;
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    :cond_1
    invoke-direct {p0, p1, p2}, Lvm2/d;->H0(Leb/p0;Leb/x0;)Lj02/p0;

    move-result-object p0

    return-object p0
.end method

.method private final J0(Leb/p0;Leb/k0;Leb/x0;Ljava/lang/String;)Lj02/p0;
    .locals 1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Leb/a0;

    invoke-virtual {p2, p1}, Leb/a0;->v(Leb/p0;)V

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    iget-object p1, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Leb/a0;

    invoke-virtual {p1, p2, p3}, Leb/a0;->t(Leb/k0;Leb/x0;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Leb/a0;

    sget p2, Lhi0/e;->x:I

    new-instance p3, Ll83/k;

    const-string v0, "settingsSource"

    invoke-direct {p3, v0, p4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {p3}, [Ll83/k;

    move-result-object p3

    invoke-static {p3}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object p3

    iget-object p4, p0, Lvm2/d;->X:Leb/x0;

    invoke-virtual {p1, p2, p3, p4}, Leb/a0;->p(ILandroid/os/Bundle;Leb/x0;)V

    :goto_0
    sget-object p1, Lj02/p0$e;->a:Lj02/p0$e;

    return-object p1
.end method

.method public static synthetic K0(Lvm2/d;Leb/p0;Leb/k0;Leb/x0;Ljava/lang/String;ILjava/lang/Object;)Lj02/p0;
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move-object p4, v0

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lvm2/d;->J0(Leb/p0;Leb/k0;Leb/x0;Ljava/lang/String;)Lj02/p0;

    move-result-object p0

    return-object p0
.end method

.method private final L(Lj02/m0;Lj02/p0;)V
    .locals 0

    invoke-direct {p0, p2}, Lvm2/d;->G(Lj02/p0;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lvm2/d;->P:Lvm2/m;

    invoke-virtual {p2, p1}, Lvm2/m;->a(Lj02/m0;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lvm2/d;->K()V

    :cond_0
    return-void
.end method

.method private final M0(Leb/p0;Leb/k0;Leb/x0;)Lj02/p0;
    .locals 0

    if-eqz p1, :cond_0

    iget-object p2, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Leb/a0;

    invoke-virtual {p2, p1}, Leb/a0;->v(Leb/p0;)V

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    iget-object p1, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Leb/a0;

    invoke-virtual {p1, p2, p3}, Leb/a0;->t(Leb/k0;Leb/x0;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lvm2/d;->G:Lj02/i0;

    const-string p2, "whoop://com.whoop/sleepCoachFragment/?entryPoint=BottomNav&clickType=tab"

    invoke-virtual {p1, p2}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    iget-object p2, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Leb/a0;

    iget-object p3, p0, Lvm2/d;->X:Leb/x0;

    invoke-virtual {p2, p1, p3}, Leb/a0;->t(Leb/k0;Leb/x0;)V

    :goto_0
    sget-object p1, Lj02/p0$a;->a:Lj02/p0$a;

    return-object p1
.end method

.method private final N(Lj02/m0$e;)Lj02/p0;
    .locals 7

    invoke-virtual {p1}, Lj02/m0$e;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lj02/a;->a(Ljava/lang/String;)Lcom/whoop/navigation/ActivityDetailType;

    move-result-object v0

    sget-object v1, Lvm2/d$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_6

    const/4 v1, 0x2

    const-string v2, "Cardio"

    const-string v3, "android-activity-push-navigation"

    const-string v4, "Overview"

    if-eq v0, v1, :cond_4

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Lj02/m0$e;->e()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v4, v0

    :goto_0
    invoke-virtual {p1}, Lj02/m0$e;->d()Z

    move-result v0

    invoke-virtual {p1}, Lj02/m0$e;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, v2, v0, p1}, Lhi0/b;->l(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lhi0/b$h;

    move-result-object p1

    iget-object v0, p0, Lvm2/d;->z:Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-interface {v0, v3}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Lor2/c1;->c(Z)Leb/x0;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lvm2/d;->H0(Leb/p0;Leb/x0;)Lj02/p0;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    invoke-virtual {p1}, Lj02/m0$e;->e()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    move-object v4, v0

    :goto_1
    invoke-virtual {p1}, Lj02/m0$e;->d()Z

    move-result v0

    invoke-virtual {p1}, Lj02/m0$e;->b()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Recovery"

    invoke-static {v4, v1, v0, p1}, Lhi0/b;->l(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lhi0/b$h;

    move-result-object p1

    iget-object v0, p0, Lvm2/d;->z:Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-interface {v0, v3}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Lor2/c1;->c(Z)Leb/x0;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lvm2/d;->H0(Leb/p0;Leb/x0;)Lj02/p0;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-virtual {p1}, Lj02/m0$e;->e()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    goto :goto_2

    :cond_5
    move-object v4, v0

    :goto_2
    invoke-virtual {p1}, Lj02/m0$e;->d()Z

    move-result v0

    invoke-virtual {p1}, Lj02/m0$e;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, v2, v0, p1}, Lhi0/b;->l(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lhi0/b$h;

    move-result-object p1

    iget-object v0, p0, Lvm2/d;->z:Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-interface {v0, v3}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Lor2/c1;->c(Z)Leb/x0;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lvm2/d;->H0(Leb/p0;Leb/x0;)Lj02/p0;

    move-result-object p1

    return-object p1

    :cond_6
    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    iget-object v1, p0, Lvm2/d;->G:Lj02/i0;

    invoke-virtual {p1}, Lj02/m0$e;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lj02/m0$e;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lj02/m0$e;->d()Z

    move-result p1

    const-string v4, "&source="

    const-string v5, "&newHome="

    const-string v6, "android-app://com.whoop/coreDetails/sleepDetails?sleepIdV2="

    invoke-static {v6, v2, v4, v3, v5}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    new-instance v1, Leb/w0;

    invoke-direct {v1}, Leb/w0;-><init>()V

    invoke-static {v1}, Lor2/c1;->f(Leb/w0;)Leb/w0;

    move-result-object v1

    invoke-virtual {v1}, Leb/w0;->a()Leb/x0;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Leb/a0;->t(Leb/k0;Leb/x0;)V

    sget-object p1, Lj02/p0$d;->a:Lj02/p0$d;

    return-object p1
.end method

.method private final N0(Ljava/lang/String;)Lj02/p0;
    .locals 5

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    sget v1, Lhi0/e;->x:I

    new-instance v2, Ll83/k;

    const-string v3, "navigationStyle"

    const-string v4, "PRESENT"

    invoke-direct {v2, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    const-string v4, "settingsSource"

    invoke-direct {v3, v4, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v3}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object p1

    new-instance v2, Leb/w0;

    invoke-direct {v2}, Leb/w0;-><init>()V

    invoke-static {v2}, Lor2/c1;->d(Leb/w0;)Leb/w0;

    move-result-object v2

    invoke-virtual {v2}, Leb/w0;->a()Leb/x0;

    move-result-object v2

    invoke-virtual {v0, v1, p1, v2}, Leb/a0;->p(ILandroid/os/Bundle;Leb/x0;)V

    sget-object p1, Lj02/p0$e;->a:Lj02/p0$e;

    return-object p1
.end method

.method private final O(Lj02/m0$f;)Lj02/p0;
    .locals 9

    invoke-virtual {p1}, Lj02/m0$f;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ln82/a;->SLEEP:Ln82/a;

    :goto_0
    invoke-virtual {v0}, Ln82/a;->getValue()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_0
    sget-object v0, Ln82/a;->ALL:Ln82/a;

    goto :goto_0

    :goto_1
    invoke-virtual {p1}, Lj02/m0$f;->d()Ljava/time/LocalDateTime;

    move-result-object v1

    const-string v2, "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'"

    if-eqz v1, :cond_1

    invoke-static {v2}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/time/LocalDateTime;->format(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    :cond_1
    invoke-virtual {p1}, Lj02/m0$f;->b()Ljava/time/LocalDate;

    move-result-object v1

    iget-object v3, p0, Lvm2/d;->H:Ljava/time/Clock;

    invoke-static {v3}, Ljava/time/LocalTime;->now(Ljava/time/Clock;)Ljava/time/LocalTime;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/time/LocalDate;->atTime(Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    move-result-object v1

    invoke-static {v2}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/time/LocalDateTime;->format(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_2
    invoke-virtual {p1}, Lj02/m0$f;->e()Ljava/time/LocalDateTime;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-static {v2}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/time/LocalDateTime;->format(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_4

    :cond_3
    invoke-virtual {p1}, Lj02/m0$f;->b()Ljava/time/LocalDate;

    move-result-object v3

    iget-object v4, p0, Lvm2/d;->H:Ljava/time/Clock;

    invoke-static {v4}, Ljava/time/LocalTime;->now(Ljava/time/Clock;)Ljava/time/LocalTime;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/time/LocalDate;->atTime(Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    move-result-object v3

    const-wide/16 v4, 0x1

    invoke-virtual {v3, v4, v5}, Ljava/time/LocalDateTime;->minusHours(J)Ljava/time/LocalDateTime;

    move-result-object v3

    invoke-static {v2}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/time/LocalDateTime;->format(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_4
    iget-object v2, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leb/a0;

    iget-object v4, p0, Lvm2/d;->G:Lj02/i0;

    invoke-virtual {p1}, Lj02/m0$f;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lj02/m0$f;->f()Z

    move-result p1

    const-string v6, "&startDate="

    const-string v7, "&endDate="

    const-string v8, "android-app://com.whoop/editActivity/AddActivity?screenType="

    invoke-static {v8, v0, v6, v3, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "&internalActivityName="

    const-string v6, "&GDCflow="

    invoke-static {v0, v1, v3, v5, v6}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    invoke-virtual {v2, p1}, Leb/a0;->s(Leb/k0;)V

    sget-object p1, Lj02/p0$d;->a:Lj02/p0$d;

    return-object p1
.end method

.method private final O0(Lcom/whoop/navigation/e;)V
    .locals 2

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    sget-object v1, Lcom/whoop/navigation/AppScreen$g4;->w:Lcom/whoop/navigation/AppScreen$g4;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lvm2/d;->e(Lcom/whoop/navigation/e;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lvm2/d;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void
.end method

.method private final P(Ljava/lang/String;Ljava/lang/String;)Lj02/p0;
    .locals 10

    iget-object v0, p0, Lvm2/d;->G:Lj02/i0;

    if-nez p2, :cond_0

    const-string p2, ""

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "android-app://com.whoop/behavior_impact_details?impactId="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "?isNew=false?source="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    new-instance v0, Leb/x0;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v6, v3

    move v7, v3

    move v8, v3

    move v9, v3

    invoke-direct/range {v0 .. v9}, Leb/x0;-><init>(ZZIZZIIII)V

    iget-object p2, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Leb/a0;

    invoke-virtual {p2, p1, v0}, Leb/a0;->t(Leb/k0;Leb/x0;)V

    sget-object p1, Lj02/p0$a;->a:Lj02/p0$a;

    return-object p1
.end method

.method private final P0(Lcom/whoop/navigation/e;)Z
    .locals 1

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->e()Lj02/v0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj02/v0;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    sget-object v0, Lvm2/k;->a:Lvm2/k;

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvm2/k;->a(Lcom/whoop/navigation/AppScreen;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method private final Q(Ljava/lang/String;)Lj02/p0;
    .locals 3

    iget-object v0, p0, Lvm2/d;->G:Lj02/i0;

    if-nez p1, :cond_0

    const-string p1, "Notification"

    :cond_0
    const-string v1, "android-app://com.whoop/behavior_impact?source="

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    new-instance v0, Leb/w0;

    invoke-direct {v0}, Leb/w0;-><init>()V

    const/4 v1, 0x1

    iput-boolean v1, v0, Leb/w0;->a:Z

    iget-object v1, p0, Lvm2/d;->z:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v2, "android-health-push-navigation"

    invoke-interface {v1, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Lor2/c1;->f(Leb/w0;)Leb/w0;

    move-result-object v0

    invoke-virtual {v0}, Leb/w0;->a()Leb/x0;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Leb/w0;->a()Leb/x0;

    move-result-object v0

    :goto_0
    const/4 v1, 0x0

    invoke-direct {p0, v1, p1, v0}, Lvm2/d;->M0(Leb/p0;Leb/k0;Leb/x0;)Lj02/p0;

    sget-object p1, Lj02/p0$a;->a:Lj02/p0$a;

    return-object p1
.end method

.method private final Q0(Lj02/m0;ZLc93/a;)Z
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj02/m0;",
            "Z",
            "Lc93/a;",
            ")Z"
        }
    .end annotation

    invoke-virtual {p1}, Lj02/m0;->a()Lcom/whoop/navigation/AiAction;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v2, p0, Lvm2/d;->z:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v3, "wce-dynamic-bdn-deeplink-support"

    invoke-interface {v2, v3}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    return v1

    :cond_1
    invoke-interface {p3}, Lc93/a;->invoke()Ljava/lang/Object;

    iget-object v3, p0, Lvm2/d;->T:Ldp0/g;

    const/4 p3, 0x1

    if-eqz v3, :cond_2

    invoke-static {v0, p3}, Lcom/whoop/coacheverywherecommon/models/a;->b(Lcom/whoop/navigation/AiAction;Z)Lep0/j;

    move-result-object v7

    const/4 v8, 0x3

    const/4 v9, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v9}, Ldp0/g;->f(Ldp0/g;JLjava/lang/String;Lep0/j;ILjava/lang/Object;)V

    :cond_2
    instance-of v0, p1, Lj02/m0$p;

    if-eqz v0, :cond_3

    return v1

    :cond_3
    instance-of v0, p1, Lj02/m0$z1;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    invoke-virtual {v0}, Leb/a0;->i()Leb/n0;

    move-result-object v0

    if-eqz v0, :cond_4

    iget v0, v0, Leb/n0;->H:I

    sget v2, Lhi0/e;->D2:I

    if-ne v0, v2, :cond_4

    return p3

    :cond_4
    if-eqz p2, :cond_5

    instance-of p2, p1, Lj02/m0$d2;

    if-eqz p2, :cond_5

    iget-object p2, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Leb/a0;

    invoke-virtual {p2}, Leb/a0;->i()Leb/n0;

    move-result-object p2

    if-eqz p2, :cond_5

    iget p2, p2, Leb/n0;->H:I

    sget v0, Lhi0/e;->I2:I

    if-ne p2, v0, :cond_5

    return p3

    :cond_5
    iget-object p2, p0, Lvm2/d;->T:Ldp0/g;

    if-eqz p2, :cond_6

    invoke-interface {p2}, Ldp0/g;->y()Lj02/m0;

    move-result-object p2

    if-eqz p2, :cond_6

    invoke-static {p1, p2}, Lvm2/n;->b(Lj02/m0;Lj02/m0;)Z

    move-result p1

    if-ne p1, p3, :cond_6

    return p3

    :cond_6
    return v1
.end method

.method private final R(Lj02/m0$r0;)Lj02/p0;
    .locals 14

    invoke-virtual {p1}, Lj02/m0$r0;->b()Ljava/lang/String;

    move-result-object p1

    const-string v0, "PAIR_STRAP"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lvm2/d;->w:Landroidx/fragment/app/r0;

    invoke-static {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/a;->a(Landroid/content/Context;)Lqm2/o;

    move-result-object p1

    invoke-virtual {p1}, Lqm2/o;->s()Lqm2/o;

    move-result-object p1

    invoke-virtual {p1}, Lhj0/q;->m()V

    sget-object p1, Lj02/p0$f;->a:Lj02/p0$f;

    return-object p1

    :cond_0
    iget-object p1, p0, Lvm2/d;->G:Lj02/i0;

    const-string v0, "whoop://com.whoop/settings/newStrapSettings"

    invoke-virtual {p1, v0}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v3

    sget v10, Lnf1/a;->e:I

    new-instance v4, Leb/x0;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, -0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    move v11, v7

    move v12, v7

    move v13, v7

    invoke-direct/range {v4 .. v13}, Leb/x0;-><init>(ZZIZZIIII)V

    const/16 v6, 0x9

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v7}, Lvm2/d;->K0(Lvm2/d;Leb/p0;Leb/k0;Leb/x0;Ljava/lang/String;ILjava/lang/Object;)Lj02/p0;

    move-result-object p1

    return-object p1
.end method

.method private final R0(Ljava/lang/String;Lj02/m0;)Lj02/p0;
    .locals 5

    if-eqz p2, :cond_1

    iget-object v0, p0, Lvm2/d;->N:Lji0/f;

    invoke-interface {v0, p1}, Lji0/f;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lvm2/d;->U:Lj02/e;

    new-instance v1, Lj02/d$d;

    invoke-direct {v1, p1}, Lj02/d$d;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lj02/e;->c(Lj02/d;)V

    iget-object p1, p0, Lvm2/d;->Y:Leb/x0;

    invoke-static {p2, p1}, Lvm2/e;->a(Lj02/m0;Leb/x0;)Lj02/m0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lvm2/d;->M(Lj02/m0;)Lj02/p0;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lvm2/d;->W:Ltr2/n;

    const/4 v1, 0x0

    if-eqz p2, :cond_2

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    move v2, v1

    :goto_1
    const-string v3, "Unknown BFF tab requested: tabId="

    const-string v4, ", hasScreen="

    invoke-static {v3, p1, v4, v2}, Ld13/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v2

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lvm2/d;->U:Lj02/e;

    new-instance v1, Lj02/d$e;

    invoke-direct {v1, p1}, Lj02/d$e;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lj02/e;->c(Lj02/d;)V

    if-eqz p2, :cond_4

    invoke-virtual {p0, p2}, Lvm2/d;->b(Lj02/m0;)Lj02/p0;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    return-object p1

    :cond_4
    :goto_2
    sget-object p1, Lj02/p0$h;->a:Lj02/p0$h;

    return-object p1
.end method

.method private final S(Ljava/lang/String;)Lj02/p0;
    .locals 4

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    iget-object v1, p0, Lvm2/d;->G:Lj02/i0;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "android-app://com.whoop/contentSearchFragment?entryPoint="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    invoke-virtual {v0, p1}, Leb/a0;->s(Leb/k0;)V

    sget-object p1, Lj02/p0$d;->a:Lj02/p0$d;

    return-object p1
.end method

.method private final S0(Ljava/lang/String;)Z
    .locals 5

    iget-object v0, p0, Lvm2/d;->N:Lji0/f;

    invoke-interface {v0}, Lji0/f;->d()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lcom/whoop/appconfiguration/TabConfiguration;

    invoke-virtual {v3}, Lcom/whoop/appconfiguration/TabConfiguration;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v3

    goto :goto_0

    :cond_1
    move-object v3, v2

    :goto_0
    sget-object v4, Lcom/whoop/navigation/AppScreen$g4;->w:Lcom/whoop/navigation/AppScreen$g4;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_2
    move-object v1, v2

    :goto_1
    check-cast v1, Lcom/whoop/appconfiguration/TabConfiguration;

    if-nez v1, :cond_3

    const/4 p1, 0x0

    return p1

    :cond_3
    iget-object v0, p0, Lvm2/d;->O:Lvm2/a;

    invoke-virtual {v0, v1}, Lvm2/a;->a(Lcom/whoop/appconfiguration/TabConfiguration;)Lj02/m0;

    move-result-object v0

    if-eqz p1, :cond_4

    instance-of v3, v0, Lj02/m0$i3;

    if-eqz v3, :cond_4

    check-cast v0, Lj02/m0$i3;

    const/4 v3, 0x2

    invoke-static {v0, p1, v2, v3, v2}, Lj02/m0$i3;->c(Lj02/m0$i3;Ljava/lang/String;Leb/x0;ILjava/lang/Object;)Lj02/m0$i3;

    move-result-object v0

    :cond_4
    invoke-virtual {v1}, Lcom/whoop/appconfiguration/TabConfiguration;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, v0}, Lvm2/d;->R0(Ljava/lang/String;Lj02/m0;)Lj02/p0;

    const/4 p1, 0x1

    return p1
.end method

.method private final T0(Lj02/m0;Lcom/whoop/navigation/AiAction;)Lj02/m0;
    .locals 13

    if-eqz p2, :cond_4

    invoke-virtual {p1}, Lj02/m0;->a()Lcom/whoop/navigation/AiAction;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v1, p1, Lj02/m0$z1;

    if-eqz v1, :cond_1

    move-object v0, p1

    check-cast v0, Lj02/m0$z1;

    invoke-virtual {v0, p2}, Lj02/m0$z1;->b(Lcom/whoop/navigation/AiAction;)Lj02/m0$z1;

    move-result-object v0

    return-object v0

    :cond_1
    instance-of v1, p1, Lj02/m0$m1;

    if-eqz v1, :cond_2

    move-object v0, p1

    check-cast v0, Lj02/m0$m1;

    const/16 v11, 0x3df

    const/4 v12, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v6, p2

    invoke-static/range {v0 .. v12}, Lj02/m0$m1;->c(Lj02/m0$m1;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/GenericCachePolicy;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/AiAction;Lcom/whoop/navigation/models/GenericInteraction;Leb/x0;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lj02/m0$m1;

    move-result-object v0

    return-object v0

    :cond_2
    instance-of v1, p1, Lj02/m0$e5;

    if-eqz v1, :cond_3

    move-object v0, p1

    check-cast v0, Lj02/m0$e5;

    const/16 v10, 0xff

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v9, p2

    invoke-static/range {v0 .. v11}, Lj02/m0$e5;->c(Lj02/m0$e5;Ljava/lang/String;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/GenericCachePolicy;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/models/GenericInteraction;Leb/x0;Lcom/whoop/navigation/AiAction;ILjava/lang/Object;)Lj02/m0$e5;

    move-result-object v0

    return-object v0

    :cond_3
    iget-object v2, p0, Lvm2/d;->W:Ltr2/n;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-interface {v3}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "withAiAction: dropping ai_action for unsupported screen type "

    invoke-static {v4, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    new-array v4, v4, [Lqr2/a$a;

    invoke-interface {v2, v3, v4}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_4
    :goto_0
    return-object p1
.end method

.method private final U(Lj02/m0$c1;)Lj02/p0;
    .locals 11

    invoke-virtual {p1}, Lj02/m0$c1;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    if-nez v0, :cond_0

    move-object v0, v1

    :cond_0
    invoke-virtual {p1}, Lj02/m0$c1;->b()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    move-object v2, v1

    :cond_1
    invoke-virtual {p1}, Lj02/m0$c1;->c()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    move-object v1, v3

    :goto_0
    invoke-virtual {p1}, Lj02/m0$c1;->e()Lorg/joda/time/LocalDateTime;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    sget-object v5, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->Companion:Lcom/whoop/data/remote/domain/dto/DateTimeRange$Companion;

    invoke-virtual {v5}, Lcom/whoop/data/remote/domain/dto/DateTimeRange$Companion;->getDateTimeFormatter()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v5

    invoke-virtual {v3, v5}, Lorg/joda/time/base/AbstractPartial;->toString(Lorg/joda/time/format/DateTimeFormatter;)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_3
    move-object v3, v4

    :goto_1
    invoke-virtual {p1}, Lj02/m0$c1;->g()Lorg/joda/time/LocalDateTime;

    move-result-object v5

    if-eqz v5, :cond_4

    sget-object v4, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->Companion:Lcom/whoop/data/remote/domain/dto/DateTimeRange$Companion;

    invoke-virtual {v4}, Lcom/whoop/data/remote/domain/dto/DateTimeRange$Companion;->getDateTimeFormatter()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v4

    invoke-virtual {v5, v4}, Lorg/joda/time/base/AbstractPartial;->toString(Lorg/joda/time/format/DateTimeFormatter;)Ljava/lang/String;

    move-result-object v4

    :cond_4
    iget-object v5, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v5}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Leb/a0;

    iget-object v6, p0, Lvm2/d;->G:Lj02/i0;

    invoke-virtual {p1}, Lj02/m0$c1;->f()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lj02/m0$c1;->h()Z

    move-result p1

    const-string v8, "&endDate="

    const-string v9, "&internalActivityName="

    const-string v10, "android-app://com.whoop/editActivity/EditActivity?startDate="

    invoke-static {v10, v4, v8, v3, v9}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "&activityId="

    const-string v8, "&activityType="

    invoke-static {v3, v1, v4, v2, v8}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "&flow="

    const-string v2, "&isDeletable="

    invoke-static {v3, v0, v1, v7, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v6, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    invoke-virtual {v5, p1}, Leb/a0;->s(Leb/k0;)V

    sget-object p1, Lj02/p0$d;->a:Lj02/p0$d;

    return-object p1
.end method

.method private final U0(Lj02/m0;Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct {v0, v2}, Lvm2/d;->A(Lcom/whoop/navigation/NavigationScreenModel;)Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {v0, v2}, Lvm2/d;->z(Lcom/whoop/navigation/NavigationScreenModel;)Lcom/whoop/navigation/GenericCachePolicy;

    move-result-object v2

    instance-of v4, v1, Lj02/m0$m1;

    if-eqz v4, :cond_2

    move-object v5, v1

    check-cast v5, Lj02/m0$m1;

    invoke-virtual {v5}, Lj02/m0$m1;->l()Lcom/whoop/navigation/models/ApiRequest;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Lvm2/d;->o(Lcom/whoop/navigation/models/ApiRequest;Ljava/util/Map;)Lcom/whoop/navigation/models/ApiRequest;

    move-result-object v6

    if-nez v2, :cond_1

    invoke-virtual {v5}, Lj02/m0$m1;->e()Lcom/whoop/navigation/GenericCachePolicy;

    move-result-object v2

    :cond_1
    move-object v7, v2

    const/16 v16, 0x3fc

    const/16 v17, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v5 .. v17}, Lj02/m0$m1;->c(Lj02/m0$m1;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/GenericCachePolicy;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/AiAction;Lcom/whoop/navigation/models/GenericInteraction;Leb/x0;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lj02/m0$m1;

    move-result-object v1

    return-object v1

    :cond_2
    instance-of v4, v1, Lj02/m0$e5;

    if-eqz v4, :cond_4

    move-object v5, v1

    check-cast v5, Lj02/m0$e5;

    invoke-virtual {v5}, Lj02/m0$e5;->j()Lcom/whoop/navigation/models/ApiRequest;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Lvm2/d;->o(Lcom/whoop/navigation/models/ApiRequest;Ljava/util/Map;)Lcom/whoop/navigation/models/ApiRequest;

    move-result-object v7

    if-nez v2, :cond_3

    invoke-virtual {v5}, Lj02/m0$e5;->e()Lcom/whoop/navigation/GenericCachePolicy;

    move-result-object v2

    :cond_3
    move-object v8, v2

    const/16 v15, 0x1f9

    const/16 v16, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v5 .. v16}, Lj02/m0$e5;->c(Lj02/m0$e5;Ljava/lang/String;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/GenericCachePolicy;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/models/GenericInteraction;Leb/x0;Lcom/whoop/navigation/AiAction;ILjava/lang/Object;)Lj02/m0$e5;

    move-result-object v1

    :cond_4
    :goto_0
    return-object v1
.end method

.method private final V(Ljava/lang/String;)Lj02/p0;
    .locals 6

    iget-object v0, p0, Lvm2/d;->y:Lor2/y;

    iget-object v1, p0, Lvm2/d;->w:Landroidx/fragment/app/r0;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v2, p1

    invoke-static/range {v0 .. v5}, Lor2/y;->y(Lor2/y;Landroid/app/Activity;Ljava/lang/String;ZILjava/lang/Object;)V

    sget-object p1, Lj02/p0$f;->a:Lj02/p0$f;

    return-object p1
.end method

.method private final W()Lj02/p0;
    .locals 4

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lvm2/d;->w:Landroidx/fragment/app/r0;

    sget v2, Lnf1/g;->h:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const-string v1, "com.android.vending"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    :try_start_0
    iget-object v1, p0, Lvm2/d;->w:Landroidx/fragment/app/r0;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lvm2/d;->W:Ltr2/n;

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    const-string v3, "Failed to navigate to Play Store!"

    invoke-interface {v1, v3, v0, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iget-object v0, p0, Lvm2/d;->w:Landroidx/fragment/app/r0;

    sget v1, Lhi0/j;->t0:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :goto_0
    sget-object v0, Lj02/p0$f;->a:Lj02/p0$f;

    return-object v0
.end method

.method private final X(Lj02/m0$q1;)Lj02/p0;
    .locals 4

    new-instance v0, Landroid/net/Uri$Builder;

    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    const-string v1, "android-app"

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "com.whoop"

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v1, "composableHealthMonitor"

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->path(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {p1}, Lj02/m0$q1;->f()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "source"

    invoke-virtual {v0, v2, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    :cond_0
    invoke-virtual {p1}, Lj02/m0$q1;->d()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lj02/m0$q1;->e()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lj02/m0$q1;->d()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "initialHr"

    invoke-virtual {v0, v2, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    invoke-virtual {p1}, Lj02/m0$q1;->e()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "initialHrZone"

    invoke-virtual {v0, v1, p1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    :cond_1
    iget-object p1, p0, Lvm2/d;->z:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "android-health-push-navigation"

    invoke-interface {p1, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Lor2/c1;->c(Z)Leb/x0;

    move-result-object p1

    iget-object v1, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/a0;

    iget-object v2, p0, Lvm2/d;->G:Lj02/i0;

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "toString(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v0

    invoke-virtual {v1, v0, p1}, Leb/a0;->t(Leb/k0;Leb/x0;)V

    sget-object p1, Lj02/p0$d;->a:Lj02/p0$d;

    return-object p1
.end method

.method private final Y(Ljava/lang/String;)Lj02/p0;
    .locals 3

    iget-object v0, p0, Lvm2/d;->G:Lj02/i0;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "android-app://com.whoop/heart_screener?source="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    iget-object v0, p0, Lvm2/d;->z:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "android-health-push-navigation"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Lor2/c1;->c(Z)Leb/x0;

    move-result-object v0

    iget-object v1, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/a0;

    invoke-virtual {v1, p1, v0}, Leb/a0;->t(Leb/k0;Leb/x0;)V

    sget-object p1, Lj02/p0$a;->a:Lj02/p0$a;

    return-object p1
.end method

.method private final Z(Lj02/m0$w1;)Lj02/p0;
    .locals 7

    invoke-virtual {p1}, Lj02/m0$w1;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const-string v2, "getString(...)"

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "ECG_INAPP"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    iget-object v0, p0, Lvm2/d;->G:Lj02/i0;

    invoke-virtual {p1}, Lj02/m0$w1;->b()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "android-app://com.whoop/education?path=ECG_INAPP&entryPoint="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    invoke-virtual {v0, p1}, Leb/a0;->s(Leb/k0;)V

    goto/16 :goto_0

    :sswitch_1
    const-string v1, "HOW_WHOOP_COACH_WORKS_EDUCATION"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    iget-object v0, p0, Lvm2/d;->G:Lj02/i0;

    invoke-virtual {p1}, Lj02/m0$w1;->b()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "android-app://com.whoop/education?path=HOW_WHOOP_COACH_WORKS_EDUCATION&entryPoint="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    invoke-virtual {v0, p1}, Leb/a0;->s(Leb/k0;)V

    goto/16 :goto_0

    :sswitch_2
    const-string v1, "TRIAL_INFORMATION"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, Lvm2/d;->G:Lj02/i0;

    invoke-virtual {p1}, Lj02/m0$w1;->b()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "android-app://com.whoop/education?path=TRIAL_INFORMATION&entryPoint="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    invoke-virtual {v0, p1}, Leb/a0;->s(Leb/k0;)V

    goto/16 :goto_0

    :sswitch_3
    const-string v1, "WHOOP_COACH_DATA_PRIVACY"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    iget-object v0, p0, Lvm2/d;->G:Lj02/i0;

    invoke-virtual {p1}, Lj02/m0$w1;->b()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "android-app://com.whoop/education?path=WHOOP_COACH_DATA_PRIVACY&entryPoint="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&screenName=WHOOP_COACH"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    invoke-virtual {v0, p1}, Leb/a0;->s(Leb/k0;)V

    goto/16 :goto_0

    :sswitch_4
    const-string v1, "ARRHYTHMIA_INAPP"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lvm2/d;->G:Lj02/i0;

    invoke-virtual {p1}, Lj02/m0$w1;->b()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "android-app://com.whoop/education?path=ARRHYTHMIA_INAPP&entryPoint="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    invoke-virtual {v0, p1}, Leb/a0;->s(Leb/k0;)V

    goto/16 :goto_0

    :sswitch_5
    const-string v1, "SLEEP"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    iget-object v0, p0, Lvm2/d;->z:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "mx-native-education-sleep-android"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lvm2/d;->G:Lj02/i0;

    invoke-virtual {p1}, Lj02/m0$w1;->b()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "android-app://com.whoop/education?path=SLEEP_EDUCATION&entryPoint="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&screenName=Sleep"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    invoke-virtual {v0, p1}, Leb/a0;->s(Leb/k0;)V

    goto/16 :goto_0

    :cond_6
    iget-object v1, p0, Lvm2/d;->y:Lor2/y;

    move-object v3, v2

    iget-object v2, p0, Lvm2/d;->w:Landroidx/fragment/app/r0;

    sget p1, Lhi0/j;->d1:I

    invoke-virtual {v2, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lor2/y;->y(Lor2/y;Landroid/app/Activity;Ljava/lang/String;ZILjava/lang/Object;)V

    goto/16 :goto_0

    :sswitch_6
    move-object v3, v2

    const-string v1, "RECOVERY"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_0

    :cond_7
    iget-object v0, p0, Lvm2/d;->z:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "mx-native-education-recovery-android"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lvm2/d;->G:Lj02/i0;

    invoke-virtual {p1}, Lj02/m0$w1;->b()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "android-app://com.whoop/education?path=RECOVERY_EDUCATION&entryPoint="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&screenName=Recovery"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    invoke-virtual {v0, p1}, Leb/a0;->s(Leb/k0;)V

    goto/16 :goto_0

    :cond_8
    iget-object v1, p0, Lvm2/d;->y:Lor2/y;

    iget-object v2, p0, Lvm2/d;->w:Landroidx/fragment/app/r0;

    sget p1, Lhi0/j;->Q0:I

    invoke-virtual {v2, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lor2/y;->y(Lor2/y;Landroid/app/Activity;Ljava/lang/String;ZILjava/lang/Object;)V

    goto/16 :goto_0

    :sswitch_7
    const-string v1, "DEVICE_BATTERY"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_0

    :cond_9
    iget-object v0, p0, Lvm2/d;->G:Lj02/i0;

    invoke-virtual {p1}, Lj02/m0$w1;->b()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "android-app://com.whoop/education?path=CHARGE_EDUCATION&entryPoint="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&screenName=New_Home"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    invoke-virtual {v0, p1}, Leb/a0;->s(Leb/k0;)V

    goto/16 :goto_0

    :sswitch_8
    const-string v1, "PREGNANCY_INSIGHTS_DATA_PRIVACY"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_0

    :cond_a
    invoke-virtual {p1}, Lj02/m0$w1;->d()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_e

    iget-object v1, p0, Lvm2/d;->y:Lor2/y;

    iget-object v2, p0, Lvm2/d;->w:Landroidx/fragment/app/r0;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lor2/y;->y(Lor2/y;Landroid/app/Activity;Ljava/lang/String;ZILjava/lang/Object;)V

    goto/16 :goto_0

    :sswitch_9
    const-string p1, "NEW_HOME_INTRODUCTION"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto :goto_0

    :cond_b
    iget-object p1, p0, Lvm2/d;->G:Lj02/i0;

    const-string v0, "android-app://com.whoop/education?path=NEW_HOME_INTRODUCTION&entryPoint=New_Home_Screen&screenName=New_Home"

    invoke-virtual {p1, v0}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    invoke-virtual {v0, p1}, Leb/a0;->s(Leb/k0;)V

    goto :goto_0

    :sswitch_a
    move-object v3, v2

    const-string v1, "STRAIN"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_0

    :cond_c
    iget-object v0, p0, Lvm2/d;->z:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "mx-native-education-strain-android"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, p0, Lvm2/d;->G:Lj02/i0;

    invoke-virtual {p1}, Lj02/m0$w1;->b()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "android-app://com.whoop/education?path=STRAIN_EDUCATION&entryPoint="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&screenName=Strain"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    invoke-virtual {v0, p1}, Leb/a0;->s(Leb/k0;)V

    goto :goto_0

    :cond_d
    iget-object v1, p0, Lvm2/d;->y:Lor2/y;

    iget-object v2, p0, Lvm2/d;->w:Landroidx/fragment/app/r0;

    sget p1, Lhi0/j;->g1:I

    invoke-virtual {v2, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lor2/y;->y(Lor2/y;Landroid/app/Activity;Ljava/lang/String;ZILjava/lang/Object;)V

    :cond_e
    :goto_0
    sget-object p1, Lj02/p0$f;->a:Lj02/p0$f;

    return-object p1

    :sswitch_data_0
    .sparse-switch
        -0x6d97ca8b -> :sswitch_a
        -0x47a96985 -> :sswitch_9
        -0x36cc25fb -> :sswitch_8
        -0x2399c2fc -> :sswitch_7
        -0xfb906b -> :sswitch_6
        0x4b536b7 -> :sswitch_5
        0x53081dc -> :sswitch_4
        0x13272db8 -> :sswitch_3
        0x50d3bd43 -> :sswitch_2
        0x652b2f57 -> :sswitch_1
        0x7880a266 -> :sswitch_0
    .end sparse-switch
.end method

.method private final b0(Z)Lj02/p0;
    .locals 3

    iget-object v0, p0, Lvm2/d;->G:Lj02/i0;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "android-app://com.whoop/customizeHome?showOnboarding="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    invoke-virtual {v0, p1}, Leb/a0;->s(Leb/k0;)V

    sget-object p1, Lj02/p0$d;->a:Lj02/p0$d;

    return-object p1
.end method

.method private final c0(Ljava/lang/String;)Lj02/p0;
    .locals 11

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toUpperCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, -0x6d97ca8b

    if-eq v1, v2, :cond_2

    const v2, -0xfb906b

    if-eq v1, v2, :cond_1

    const v2, 0x4b536b7

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "SLEEP"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_1
    const-string v1, "RECOVERY"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_2
    const-string v1, "STRAIN"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    iget-object v0, p0, Lvm2/d;->G:Lj02/i0;

    const-string v1, "android-app://com.whoop/home?destinationPillar="

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    goto :goto_1

    :cond_4
    :goto_0
    iget-object p1, p0, Lvm2/d;->G:Lj02/i0;

    const-string v0, "android-app://com.whoop/home"

    invoke-virtual {p1, v0}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    :goto_1
    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    sget v7, Lnf1/a;->e:I

    new-instance v1, Leb/x0;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v8, v4

    move v9, v4

    move v10, v4

    invoke-direct/range {v1 .. v10}, Leb/x0;-><init>(ZZIZZIIII)V

    invoke-virtual {v0, p1, v1}, Leb/a0;->t(Leb/k0;Leb/x0;)V

    sget-object p1, Lj02/p0$d;->a:Lj02/p0$d;

    return-object p1
.end method

.method private final d0(Ljava/lang/String;Ljava/lang/String;)Lj02/p0;
    .locals 2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "android-app://com.whoop/settings/integrations"

    goto :goto_1

    :cond_0
    const-string v0, "android-app://com.whoop/settings/integrations?integrationId="

    if-eqz p2, :cond_2

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const-string v1, "&source="

    invoke-static {v0, p1, v1, p2}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_2
    :goto_0
    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_1
    iget-object p2, p0, Lvm2/d;->G:Lj02/i0;

    invoke-virtual {p2, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    iget-object p2, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Leb/a0;

    invoke-virtual {p2, p1}, Leb/a0;->s(Leb/k0;)V

    sget-object p1, Lj02/p0$d;->a:Lj02/p0$d;

    return-object p1
.end method

.method private final e0(Ljava/lang/String;)Lj02/p0;
    .locals 3

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lvm2/d;->w:Landroidx/fragment/app/r0;

    const-class v2, Lcom/whoop/community/presentation/login/InviteCodeActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "inviteCode"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "joinTeam"

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    iget-object p1, p0, Lvm2/d;->w:Landroidx/fragment/app/r0;

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    sget-object p1, Lj02/p0$f;->a:Lj02/p0$f;

    return-object p1
.end method

.method public static synthetic f(Lvm2/d;Leb/a0;Leb/n0;Landroid/os/Bundle;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lvm2/d;->E(Lvm2/d;Leb/a0;Leb/n0;Landroid/os/Bundle;)V

    return-void
.end method

.method private final f0(Lj02/m0$e2;)Lj02/p0;
    .locals 6

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    invoke-virtual {v0}, Leb/a0;->i()Leb/n0;

    move-result-object v0

    if-eqz v0, :cond_0

    iget v0, v0, Leb/n0;->H:I

    sget v1, Lpr1/b;->a:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    invoke-virtual {v0}, Leb/a0;->z()Z

    :cond_0
    invoke-virtual {p1}, Lj02/m0$e2;->f()J

    move-result-wide v0

    invoke-static {v0, v1}, Lhi0/b;->o(J)Lhi0/b$j;

    move-result-object v0

    invoke-virtual {p1}, Lj02/m0$e2;->e()Ljava/time/LocalDate;

    move-result-object v1

    invoke-static {}, Ljava/time/ZoneId;->systemDefault()Ljava/time/ZoneId;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/time/LocalDate;->atStartOfDay(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    move-result-object v1

    invoke-interface {v1}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    move-result-object v1

    invoke-virtual {v1}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lhi0/b$j;->x(J)Lhi0/b$j;

    invoke-virtual {p1}, Lj02/m0$e2;->e()Ljava/time/LocalDate;

    move-result-object v1

    invoke-static {}, Ljava/time/LocalDate;->now()Ljava/time/LocalDate;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-wide/16 v2, -0x1

    if-eqz v1, :cond_2

    :cond_1
    move-wide v4, v2

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lj02/m0$e2;->d()Ljava/time/LocalDate;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {}, Ljava/time/ZoneId;->systemDefault()Ljava/time/ZoneId;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/time/LocalDate;->atStartOfDay(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v4

    :goto_0
    invoke-virtual {v0, v4, v5}, Lhi0/b$j;->w(J)Lhi0/b$j;

    invoke-virtual {p1}, Lj02/m0$e2;->k()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    goto :goto_1

    :cond_3
    move-wide v4, v2

    :goto_1
    invoke-virtual {v0, v4, v5}, Lhi0/b$j;->t(J)Lhi0/b$j;

    invoke-virtual {p1}, Lj02/m0$e2;->j()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    :cond_4
    invoke-virtual {v0, v2, v3}, Lhi0/b$j;->s(J)Lhi0/b$j;

    invoke-virtual {p1}, Lj02/m0$e2;->o()Z

    move-result v1

    invoke-virtual {v0, v1}, Lhi0/b$j;->o(Z)Lhi0/b$j;

    invoke-virtual {p1}, Lj02/m0$e2;->m()Z

    move-result v1

    invoke-virtual {v0, v1}, Lhi0/b$j;->p(Z)Lhi0/b$j;

    invoke-virtual {p1}, Lj02/m0$e2;->i()Z

    move-result v1

    invoke-virtual {v0, v1}, Lhi0/b$j;->r(Z)Lhi0/b$j;

    invoke-virtual {p1}, Lj02/m0$e2;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lhi0/b$j;->q(Ljava/lang/String;)Lhi0/b$j;

    invoke-virtual {p1}, Lj02/m0$e2;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lhi0/b$j;->v(Ljava/lang/String;)Lhi0/b$j;

    invoke-virtual {p1}, Lj02/m0$e2;->g()Z

    move-result v1

    invoke-virtual {v0, v1}, Lhi0/b$j;->n(Z)Lhi0/b$j;

    invoke-virtual {p1}, Lj02/m0$e2;->l()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {p1}, Lj02/m0$e2;->e()Ljava/time/LocalDate;

    move-result-object p1

    invoke-virtual {p1}, Ljava/time/LocalDate;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_5
    invoke-virtual {v0, v1}, Lhi0/b$j;->u(Ljava/lang/String;)Lhi0/b$j;

    const/4 p1, 0x2

    const/4 v1, 0x0

    invoke-static {p0, v0, v1, p1, v1}, Lvm2/d;->I0(Lvm2/d;Leb/p0;Leb/x0;ILjava/lang/Object;)Lj02/p0;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic g(Landroidx/fragment/app/r0;)Leb/a0;
    .locals 0

    invoke-static {p0}, Lvm2/d;->n(Landroidx/fragment/app/r0;)Leb/a0;

    move-result-object p0

    return-object p0
.end method

.method private final g0()Lj02/p0;
    .locals 3

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    iget-object v1, p0, Lvm2/d;->G:Lj02/i0;

    const-string v2, "android-app://com.whoop/labradorAboutFragment"

    invoke-virtual {v1, v2}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v1

    invoke-virtual {v0, v1}, Leb/a0;->s(Leb/k0;)V

    sget-object v0, Lj02/p0$a;->a:Lj02/p0$a;

    return-object v0
.end method

.method private final h0(Lj02/m0$g2;)Lj02/p0;
    .locals 7

    invoke-virtual {p1}, Lj02/m0$g2;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lj02/m0$g2;->c()Z

    move-result v1

    invoke-virtual {p1}, Lj02/m0$g2;->d()Z

    move-result p1

    iget-object v2, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leb/a0;

    iget-object v3, p0, Lvm2/d;->G:Lj02/i0;

    const-string v4, "&showSaveButton="

    const-string v5, "&isNewReading="

    const-string v6, "android-app://com.whoop/labradorDetailsFragment?id="

    invoke-static {v6, v0, v4, v5, v1}, Lm4/a;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    invoke-virtual {v2, p1}, Leb/a0;->s(Leb/k0;)V

    sget-object p1, Lj02/p0$a;->a:Lj02/p0$a;

    return-object p1
.end method

.method private final i0()Lj02/p0;
    .locals 3

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    iget-object v1, p0, Lvm2/d;->G:Lj02/i0;

    const-string v2, "android-app://com.whoop/labradorDeviceLocationFragment"

    invoke-virtual {v1, v2}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v1

    invoke-virtual {v0, v1}, Leb/a0;->s(Leb/k0;)V

    sget-object v0, Lj02/p0$e;->a:Lj02/p0$e;

    return-object v0
.end method

.method public static synthetic j(Lkotlin/jvm/internal/b0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvm2/d;->n0(Lkotlin/jvm/internal/b0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final j0(Lj02/m0$i2;)Lj02/p0;
    .locals 4

    invoke-virtual {p1}, Lj02/m0$i2;->c()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    iget-object v1, p0, Lvm2/d;->G:Lj02/i0;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "android-app://com.whoop/labradorEligibility?entryPoint="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    invoke-virtual {v0, p1}, Leb/a0;->s(Leb/k0;)V

    sget-object p1, Lj02/p0$a;->a:Lj02/p0$a;

    return-object p1
.end method

.method private final k0(Lj02/m0$j2;)Lj02/p0;
    .locals 5

    invoke-virtual {p1}, Lj02/m0$j2;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lht1/e;->values()[Lht1/e;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-interface {v3}, Lxr2/a;->getSerializedValue()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_2

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    iget-object v1, p0, Lvm2/d;->G:Lj02/i0;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "android-app://com.whoop/labradorReading?selectedWrist="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    invoke-virtual {v0, p1}, Leb/a0;->s(Leb/k0;)V

    goto :goto_2

    :cond_2
    iget-object p1, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Leb/a0;

    iget-object v0, p0, Lvm2/d;->G:Lj02/i0;

    const-string v1, "android-app://com.whoop/labradorDeviceLocationFragment"

    invoke-virtual {v0, v1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v0

    invoke-virtual {p1, v0}, Leb/a0;->s(Leb/k0;)V

    :goto_2
    sget-object p1, Lj02/p0$a;->a:Lj02/p0$a;

    return-object p1
.end method

.method public static synthetic l(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lvm2/d;->p(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method private final l0()Lj02/p0;
    .locals 3

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    iget-object v1, p0, Lvm2/d;->G:Lj02/i0;

    const-string v2, "android-app://com.whoop/labradorRegistrationFragment"

    invoke-virtual {v1, v2}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v1

    invoke-virtual {v0, v1}, Leb/a0;->s(Leb/k0;)V

    sget-object v0, Lj02/p0$a;->a:Lj02/p0$a;

    return-object v0
.end method

.method private final m0()Lj02/p0;
    .locals 3

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    iget-object v1, p0, Lvm2/d;->G:Lj02/i0;

    const-string v2, "android-app://com.whoop/labradorResultsFragment"

    invoke-virtual {v1, v2}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v1

    invoke-virtual {v0, v1}, Leb/a0;->s(Leb/k0;)V

    sget-object v0, Lj02/p0$a;->a:Lj02/p0$a;

    return-object v0
.end method

.method private static final n(Landroidx/fragment/app/r0;)Leb/a0;
    .locals 2

    sget v0, Lhi0/e;->Q1:I

    const-string v1, "<this>"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, v0}, Ldt/b;->r(Landroid/app/Activity;I)Leb/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final n0(Lkotlin/jvm/internal/b0;)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lkotlin/jvm/internal/b0;->w:Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final o(Lcom/whoop/navigation/models/ApiRequest;Ljava/util/Map;)Lcom/whoop/navigation/models/ApiRequest;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/navigation/models/ApiRequest;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/whoop/navigation/models/ApiRequest;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/whoop/navigation/models/ApiRequest;->getPath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0x3f

    invoke-static {v0, v2, v1}, Lyb3/r;->T(Ljava/lang/CharSequence;CZ)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v2, 0x26

    :cond_0
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    move-object v3, p2

    check-cast v3, Ljava/lang/Iterable;

    new-instance v7, Lve0/d;

    const/16 p2, 0xc

    invoke-direct {v7, p2}, Lve0/d;-><init>(I)V

    const/16 v8, 0x1e

    const-string v4, "&"

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/whoop/navigation/models/ApiRequest;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0, p2}, Ldc/b;->k(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v3, p1

    invoke-static/range {v3 .. v8}, Lcom/whoop/navigation/models/ApiRequest;->copy$default(Lcom/whoop/navigation/models/ApiRequest;Ljava/lang/String;Lcom/whoop/navigation/models/GenericHttpMethod;Lkotlinx/serialization/json/JsonElement;ILjava/lang/Object;)Lcom/whoop/navigation/models/ApiRequest;

    move-result-object p1

    return-object p1
.end method

.method private final o0(Ljava/lang/String;Ljava/time/LocalDate;)Lj02/p0;
    .locals 3

    new-instance v0, Lpq0/e;

    invoke-direct {v0}, Lpq0/e;-><init>()V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "GlobalShareDialogSelectedPillar"

    invoke-virtual {v1, v2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "GlobalShareDialogSelectedDate"

    invoke-virtual {p2}, Ljava/time/LocalDate;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroidx/fragment/app/m0;->setArguments(Landroid/os/Bundle;)V

    iget-object p1, p0, Lvm2/d;->w:Landroidx/fragment/app/r0;

    invoke-virtual {p1}, Landroidx/fragment/app/r0;->getSupportFragmentManager()Landroidx/fragment/app/o1;

    move-result-object p1

    const-string p2, "GlobalShareDialogFragmentTag"

    invoke-virtual {v0, p1, p2}, Landroidx/fragment/app/y;->show(Landroidx/fragment/app/o1;Ljava/lang/String;)V

    sget-object p1, Lj02/p0$f;->a:Lj02/p0$f;

    return-object p1
.end method

.method private static final p(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final p0()Lj02/p0;
    .locals 3

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    iget-object v1, p0, Lvm2/d;->G:Lj02/i0;

    const-string v2, "android-app://com.whoop/shepherdAboutFragment"

    invoke-virtual {v1, v2}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v1

    invoke-virtual {v0, v1}, Leb/a0;->s(Leb/k0;)V

    sget-object v0, Lj02/p0$a;->a:Lj02/p0$a;

    return-object v0
.end method

.method private final q(Lj02/m0$m1;Leb/q;)Lj02/m0$m1;
    .locals 13

    invoke-static {p2}, Lcom/whoop/navigation/d;->n(Leb/q;)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lr80/c;->g()Leb/w0;

    move-result-object v0

    iget-object p2, p2, Leb/q;->x:Leb/n0;

    iget p2, p2, Leb/n0;->H:I

    const/4 v1, 0x1

    invoke-static {v0, p2, v1}, Leb/w0;->b(Leb/w0;IZ)V

    invoke-virtual {v0}, Leb/w0;->a()Leb/x0;

    move-result-object v8

    const/16 v11, 0x37b

    const/4 v12, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v12}, Lj02/m0$m1;->c(Lj02/m0$m1;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/GenericCachePolicy;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/AiAction;Lcom/whoop/navigation/models/GenericInteraction;Leb/x0;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lj02/m0$m1;

    move-result-object p1

    return-object p1
.end method

.method private final q0(Lj02/m0$m4;)Lj02/p0;
    .locals 5

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    iget-object v1, p0, Lvm2/d;->G:Lj02/i0;

    invoke-virtual {p1}, Lj02/m0$m4;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lj02/m0$m4;->c()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "android-app://com.whoop/shepherdDetails?date="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "&education_name="

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    invoke-virtual {v0, p1}, Leb/a0;->s(Leb/k0;)V

    sget-object p1, Lj02/p0$a;->a:Lj02/p0$a;

    return-object p1
.end method

.method private final r(Ljava/lang/String;)Lcom/whoop/navigation/GenericCachePolicy;
    .locals 6

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Lcom/whoop/navigation/GenericCachePolicy;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/navigation/GenericCachePolicy;-><init>(ZLjava/lang/String;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final r0()Lj02/p0;
    .locals 3

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    iget-object v1, p0, Lvm2/d;->G:Lj02/i0;

    const-string v2, "android-app://com.whoop/settings/shepherdNotificationHistoryFragment"

    invoke-virtual {v1, v2}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v1

    invoke-virtual {v0, v1}, Leb/a0;->s(Leb/k0;)V

    sget-object v0, Lj02/p0$e;->a:Lj02/p0$e;

    return-object v0
.end method

.method private final s0(Lj02/m0$o4;)Lj02/p0;
    .locals 4

    invoke-virtual {p1}, Lj02/m0$o4;->c()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    iget-object v1, p0, Lvm2/d;->G:Lj02/i0;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "android-app://com.whoop/shepherdOnboarding?entryPoint="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    invoke-virtual {v0, p1}, Leb/a0;->s(Leb/k0;)V

    sget-object p1, Lj02/p0$a;->a:Lj02/p0$a;

    return-object p1
.end method

.method private final t0()Lj02/p0;
    .locals 3

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    iget-object v1, p0, Lvm2/d;->G:Lj02/i0;

    const-string v2, "android-app://com.whoop/shepherdRegistrationFragment"

    invoke-virtual {v1, v2}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v1

    invoke-virtual {v0, v1}, Leb/a0;->s(Leb/k0;)V

    sget-object v0, Lj02/p0$a;->a:Lj02/p0$a;

    return-object v0
.end method

.method public static synthetic u(Lvm2/d;Leb/n0;ILjava/lang/Object;)Lj02/m0;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lvm2/d;->t(Leb/n0;)Lj02/m0;

    move-result-object p0

    return-object p0
.end method

.method private final u0()Lj02/p0;
    .locals 3

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    iget-object v1, p0, Lvm2/d;->G:Lj02/i0;

    const-string v2, "android-app://com.whoop/settings/shepherdNotificationHistoryFragment"

    invoke-virtual {v1, v2}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v1

    invoke-virtual {v0, v1}, Leb/a0;->s(Leb/k0;)V

    sget-object v0, Lj02/p0$e;->a:Lj02/p0$e;

    return-object v0
.end method

.method private final v(Lcom/whoop/navigation/e;)Lj02/p0;
    .locals 4

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    sget-object v1, Lj02/v;->AUTO:Lj02/v;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lcom/whoop/navigation/d;->f(Leb/a0;Lj02/v;Ltr2/n;ILjava/lang/Object;)Z

    invoke-virtual {p0, p1}, Lvm2/d;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    move-result-object p1

    return-object p1
.end method

.method private final v0()Lj02/p0;
    .locals 3

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    iget-object v1, p0, Lvm2/d;->G:Lj02/i0;

    const-string v2, "android-app://com.whoop/stealth-mode"

    invoke-virtual {v1, v2}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v1

    invoke-virtual {v0, v1}, Leb/a0;->s(Leb/k0;)V

    sget-object v0, Lj02/p0$d;->a:Lj02/p0$d;

    return-object v0
.end method

.method private final w(Lj02/m0;)Lj02/p0;
    .locals 3

    iget-object v0, p0, Lvm2/d;->J:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj02/k0;

    invoke-interface {v1, p1}, Lj02/k0;->provideNavigationData(Lj02/m0;)Lj02/j0;

    move-result-object v1

    instance-of v2, v1, Lj02/j0$c;

    if-eqz v2, :cond_1

    iget-object p1, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Leb/a0;

    check-cast v1, Lj02/j0$c;

    invoke-virtual {v1}, Lj02/j0$c;->a()Leb/k0;

    move-result-object v0

    invoke-virtual {v1}, Lj02/j0$c;->b()Leb/x0;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Leb/a0;->t(Leb/k0;Leb/x0;)V

    invoke-virtual {v1}, Lj02/j0$c;->c()Lj02/p0;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object v2, Lj02/j0$b;->a:Lj02/j0$b;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v0, p0, Lvm2/d;->W:Ltr2/n;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to parse "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " into deeplink"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lj02/p0$c;->a:Lj02/p0$c;

    return-object p1

    :cond_2
    sget-object v2, Lj02/j0$d;->a:Lj02/j0$d;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    sget-object p1, Lj02/j0$a;->a:Lj02/j0$a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lj02/p0$f;->a:Lj02/p0$f;

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    sget-object p1, Lj02/p0$h;->a:Lj02/p0$h;

    return-object p1
.end method

.method private final w0(Ljava/lang/String;)Lj02/p0;
    .locals 2

    invoke-static {}, Lhi0/b;->p()Lhi0/b$k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lhi0/b$k;->d(Ljava/lang/String;)Lhi0/b$k;

    const/4 p1, 0x0

    const/4 v1, 0x2

    invoke-static {p0, v0, p1, v1, p1}, Lvm2/d;->I0(Lvm2/d;Leb/p0;Leb/x0;ILjava/lang/Object;)Lj02/p0;

    move-result-object p1

    return-object p1
.end method

.method private final x0(Ljava/lang/String;Ljava/lang/String;)Lj02/p0;
    .locals 11

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    iget-object v1, p0, Lvm2/d;->G:Lj02/i0;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "android-app://com.whoop/tiltGraphRevamp?date="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&source="

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    sget v7, Lnf1/a;->f:I

    new-instance v1, Leb/x0;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v8, v4

    move v9, v4

    move v10, v4

    invoke-direct/range {v1 .. v10}, Leb/x0;-><init>(ZZIZZIIII)V

    invoke-virtual {v0, p1, v1}, Leb/a0;->t(Leb/k0;Leb/x0;)V

    sget-object p1, Lj02/p0$d;->a:Lj02/p0$d;

    return-object p1
.end method

.method private final y(ILandroid/os/Bundle;)Ljava/lang/String;
    .locals 2

    sget v0, Lhi0/e;->D2:I

    if-ne p1, v0, :cond_0

    sget-object p1, Lvm2/k;->a:Lvm2/k;

    sget-object p2, Lcom/whoop/navigation/AppScreen$u2;->w:Lcom/whoop/navigation/AppScreen$u2;

    invoke-virtual {p1, p2}, Lvm2/k;->a(Lcom/whoop/navigation/AppScreen;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    sget v0, Lhi0/e;->g5:I

    const/4 v1, 0x0

    if-ne p1, v0, :cond_5

    if-eqz p2, :cond_1

    const-string p1, "selectedTab"

    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    sparse-switch p2, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string p2, "HEALTH"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    sget-object p1, Lvm2/k;->a:Lvm2/k;

    sget-object p2, Lcom/whoop/navigation/AppScreen$q2;->w:Lcom/whoop/navigation/AppScreen$q2;

    invoke-virtual {p1, p2}, Lvm2/k;->a(Lcom/whoop/navigation/AppScreen;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :sswitch_1
    const-string p2, "COMMUNITY"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    sget-object p1, Lvm2/k;->a:Lvm2/k;

    sget-object p2, Lcom/whoop/navigation/AppScreen$m1;->w:Lcom/whoop/navigation/AppScreen$m1;

    invoke-virtual {p1, p2}, Lvm2/k;->a(Lcom/whoop/navigation/AppScreen;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :sswitch_2
    const-string p2, "MORE"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    sget-object p1, Lvm2/k;->a:Lvm2/k;

    sget-object p2, Lcom/whoop/navigation/AppScreen$b4;->w:Lcom/whoop/navigation/AppScreen$b4;

    invoke-virtual {p1, p2}, Lvm2/k;->a(Lcom/whoop/navigation/AppScreen;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :sswitch_3
    const-string p2, "HOME"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object p1, Lvm2/k;->a:Lvm2/k;

    sget-object p2, Lcom/whoop/navigation/AppScreen$u2;->w:Lcom/whoop/navigation/AppScreen$u2;

    invoke-virtual {p1, p2}, Lvm2/k;->a(Lcom/whoop/navigation/AppScreen;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_5
    :goto_1
    return-object v1

    :sswitch_data_0
    .sparse-switch
        0x21ecdf -> :sswitch_3
        0x243355 -> :sswitch_2
        0x4ddd3fc9 -> :sswitch_1
        0x7ec7f65c -> :sswitch_0
    .end sparse-switch
.end method

.method private final y0(Lj02/m0$f5;)V
    .locals 8

    iget-object v0, p0, Lvm2/d;->G:Lj02/i0;

    invoke-virtual {p1}, Lj02/m0$f5;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lj02/m0$f5;->b()Ljava/time/LocalDate;

    move-result-object v2

    invoke-virtual {p1}, Lj02/m0$f5;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lj02/m0$f5;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lj02/m0$f5;->c()I

    move-result v5

    invoke-virtual {p1}, Lj02/m0$f5;->e()Z

    move-result p1

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "android-app://com.whoop/trends?trendKey="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&date="

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "&source="

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&pillar="

    const-string v2, "&duration="

    invoke-static {v6, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "&sendTileProperties="

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object p1

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    invoke-static {}, Lor2/c1;->b()Leb/x0;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Leb/a0;->t(Leb/k0;Leb/x0;)V

    return-void
.end method

.method private final z(Lcom/whoop/navigation/NavigationScreenModel;)Lcom/whoop/navigation/GenericCachePolicy;
    .locals 1

    instance-of v0, p1, Lcom/whoop/navigation/CommunityScreenModel;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/whoop/navigation/CommunityScreenModel;

    invoke-virtual {p1}, Lcom/whoop/navigation/CommunityScreenModel;->getShareCode()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lvm2/d;->r(Ljava/lang/String;)Lcom/whoop/navigation/GenericCachePolicy;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final z0()Lj02/p0;
    .locals 3

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    iget-object v1, p0, Lvm2/d;->G:Lj02/i0;

    const-string v2, "android-app://com.whoop/whatToExpect"

    invoke-virtual {v1, v2}, Lj02/i0;->a(Ljava/lang/String;)Leb/k0;

    move-result-object v1

    invoke-virtual {v0, v1}, Leb/a0;->s(Leb/k0;)V

    sget-object v0, Lj02/p0$d;->a:Lj02/p0$d;

    return-object v0
.end method


# virtual methods
.method public final B(Ljava/lang/String;)Z
    .locals 3

    invoke-virtual {p0}, Lvm2/d;->H()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lvm2/d;->N:Lji0/f;

    invoke-interface {v0}, Lji0/f;->b()Lcom/whoop/appconfiguration/TabConfiguration;

    move-result-object v0

    if-eqz p1, :cond_2

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/whoop/appconfiguration/TabConfiguration;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v0}, Lvm2/d;->L0(Lcom/whoop/appconfiguration/TabConfiguration;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    return v1
.end method

.method public final C(Lcom/whoop/domain/model/WhoopUri;Landroid/content/Intent;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/domain/model/WhoopUri;",
            "Landroid/content/Intent;",
            "Lq83/d<",
            "-",
            "Lj02/l;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lvm2/d$b;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lvm2/d$b;

    iget v1, v0, Lvm2/d$b;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lvm2/d$b;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lvm2/d$b;

    invoke-direct {v0, p0, p3}, Lvm2/d$b;-><init>(Lvm2/d;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lvm2/d$b;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lvm2/d$b;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lvm2/d$b;->x:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Landroid/content/Intent;

    iget-object p1, v0, Lvm2/d$b;->w:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/domain/model/WhoopUri;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Lvm2/d;->I:Lcom/whoop/navigation/a;

    const/4 v2, 0x0

    iput-object v2, v0, Lvm2/d$b;->w:Ljava/lang/Object;

    iput-object p2, v0, Lvm2/d$b;->x:Ljava/lang/Object;

    iput v3, v0, Lvm2/d$b;->E:I

    invoke-virtual {p3, p1, v0}, Lcom/whoop/navigation/a;->b(Lcom/whoop/domain/model/WhoopUri;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Lj02/l;

    iget-object p1, p0, Lvm2/d;->W:Ltr2/n;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "handling deep link got "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    instance-of p1, p3, Lj02/q0;

    if-eqz p1, :cond_4

    iget-object p1, p0, Lvm2/d;->F:Ln92/b;

    move-object v0, p3

    check-cast v0, Lj02/q0;

    invoke-virtual {v0}, Lj02/q0;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v3, p0}, Ln92/b;->s(Ljava/lang/String;ZLj02/o0;)Ln92/a;

    goto :goto_2

    :cond_4
    instance-of p1, p3, Lj02/b;

    if-eqz p1, :cond_5

    move-object p1, p3

    check-cast p1, Lj02/b;

    invoke-virtual {p1}, Lj02/b;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {p0, p1}, Lvm2/d;->O0(Lcom/whoop/navigation/e;)V

    goto :goto_2

    :cond_5
    instance-of p1, p3, Lj02/f0;

    if-eqz p1, :cond_6

    move-object p1, p3

    check-cast p1, Lj02/f0;

    invoke-virtual {p1}, Lj02/f0;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lvm2/d;->e0(Ljava/lang/String;)Lj02/p0;

    goto :goto_2

    :cond_6
    sget-object p1, Lj02/e0;->a:Lj02/e0;

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    :goto_2
    invoke-direct {p0, p2, p3}, Lvm2/d;->I(Landroid/content/Intent;Lj02/l;)V

    return-object p3

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final D()V
    .locals 4

    iget-object v0, p0, Lvm2/d;->L:Lhj0/d;

    invoke-virtual {v0, p0}, Lhj0/d;->c(Landroidx/lifecycle/f0;)V

    iget-object v0, p0, Lvm2/d;->M:Lj02/l0;

    iget-object v1, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/a0;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lj02/l0;->k(Lj02/l0;Leb/a0;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    new-instance v1, Lvm2/c;

    invoke-direct {v1, p0}, Lvm2/c;-><init>(Lvm2/d;)V

    invoke-virtual {v0, v1}, Leb/a0;->b(Leb/u;)V

    return-void
.end method

.method public final H()Z
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/a0;

    invoke-virtual {v1}, Leb/a0;->i()Leb/n0;

    move-result-object v2

    if-eqz v2, :cond_0

    iget v2, v2, Leb/n0;->H:I

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_3

    :catch_1
    move-exception v1

    goto :goto_4

    :cond_0
    move v2, v0

    :goto_0
    invoke-static {v1}, Lcom/whoop/navigation/d;->k(Leb/a0;)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {v1}, Leb/a0;->h()Leb/q;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-direct {p0, v2, v1}, Lvm2/d;->y(ILandroid/os/Bundle;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    return v0

    :cond_3
    :goto_2
    const/4 v0, 0x1

    return v0

    :goto_3
    iget-object v2, p0, Lvm2/d;->W:Ltr2/n;

    const-string v3, "AppNavigator.isOnTabRoot: nav host view not yet available"

    new-array v4, v0, [Lqr2/a$a;

    invoke-interface {v2, v3, v1, v4}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_5

    :goto_4
    iget-object v2, p0, Lvm2/d;->W:Ltr2/n;

    const-string v3, "AppNavigator.isOnTabRoot: NavController unavailable"

    new-array v4, v0, [Lqr2/a$a;

    invoke-interface {v2, v3, v1, v4}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :goto_5
    return v0
.end method

.method public final K()V
    .locals 3

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    invoke-virtual {v0}, Leb/a0;->h()Leb/q;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Leb/q;->b()Landroidx/lifecycle/k1;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "bff_is_tab_root"

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v2, v1}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lvm2/d;->U:Lj02/e;

    new-instance v1, Lj02/d$c;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lj02/d$c;-><init>(Z)V

    invoke-virtual {v0, v1}, Lj02/e;->c(Lj02/d;)V

    return-void
.end method

.method public final L0(Lcom/whoop/appconfiguration/TabConfiguration;)Z
    .locals 3

    const-string v0, "tab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lvm2/d;->O:Lvm2/a;

    invoke-virtual {v0, p1}, Lvm2/a;->a(Lcom/whoop/appconfiguration/TabConfiguration;)Lj02/m0;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lvm2/d;->W:Ltr2/n;

    invoke-virtual {p1}, Lcom/whoop/appconfiguration/TabConfiguration;->getId()Ljava/lang/String;

    move-result-object p1

    const-string v1, "BFF tab \'"

    const-string v2, "\' has no resolvable destination; tile tap is a no-op"

    invoke-static {v1, p1, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v2, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v2}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return v1

    :cond_0
    instance-of v1, v0, Lj02/m0$b3;

    if-eqz v1, :cond_1

    check-cast v0, Lj02/m0$b3;

    const-string v1, "tab_bar"

    invoke-virtual {v0, v1}, Lj02/m0$b3;->b(Ljava/lang/String;)Lj02/m0$b3;

    move-result-object v0

    :cond_1
    iget-object v1, p0, Lvm2/d;->Y:Leb/x0;

    invoke-static {v0, v1}, Lvm2/e;->a(Lj02/m0;Leb/x0;)Lj02/m0;

    move-result-object v0

    invoke-virtual {p0, v0}, Lvm2/d;->M(Lj02/m0;)Lj02/p0;

    move-result-object v0

    invoke-direct {p0, v0}, Lvm2/d;->G(Lj02/p0;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v1, p0, Lvm2/d;->U:Lj02/e;

    new-instance v2, Lj02/d$d;

    invoke-virtual {p1}, Lcom/whoop/appconfiguration/TabConfiguration;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lj02/d$d;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lj02/e;->c(Lj02/d;)V

    :cond_2
    return v0
.end method

.method public final M(Lj02/m0;)Lj02/p0;
    .locals 1

    const-string v0, "screen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lvm2/d;->b(Lj02/m0;)Lj02/p0;

    move-result-object p1

    invoke-direct {p0, p1}, Lvm2/d;->G(Lj02/p0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lvm2/d;->K()V

    :cond_0
    return-object p1
.end method

.method public a(Lcom/whoop/navigation/e;)Lj02/p0;
    .locals 9

    const-string v0, "navigationAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lvm2/d;->K:Lo02/d;

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v1

    invoke-interface {v0, v1}, Lo02/d;->a(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;

    move-result-object v0

    instance-of v1, v0, Lj02/m0;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lj02/m0;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_8

    instance-of v3, v0, Lj02/m0$j3;

    if-eqz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {p1}, Lcom/whoop/navigation/e;->e()Lj02/v0;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lj02/v0;->a()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_2
    move-object v3, v2

    :goto_1
    sget-object v4, Lvm2/k;->a:Lvm2/k;

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v5

    invoke-virtual {v4, v5}, Lvm2/k;->a(Lcom/whoop/navigation/AppScreen;)Ljava/lang/String;

    move-result-object v4

    const-string v5, " screen="

    if-eqz v3, :cond_4

    iget-object v2, p0, Lvm2/d;->W:Ltr2/n;

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object p1

    if-nez v4, :cond_3

    const-string v4, "no tab"

    :cond_3
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "deeplink-migration: tab from backend: tab="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " (LegacyTabScreenMapping bypassed, would have given "

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-static {v4, p1, v6}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v2, p1, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0, v3, v0}, Lvm2/d;->R0(Ljava/lang/String;Lj02/m0;)Lj02/p0;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v3

    sget-object v6, Lcom/whoop/navigation/AppScreen$b4;->w:Lcom/whoop/navigation/AppScreen$b4;

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    if-eqz v4, :cond_5

    iget-object v3, p0, Lvm2/d;->N:Lji0/f;

    invoke-interface {v3, v4}, Lji0/f;->a(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_5

    iget-object p1, p0, Lvm2/d;->V:Lvm2/l;

    invoke-virtual {p1, v4}, Lvm2/l;->a(Ljava/lang/String;)V

    new-instance p1, Lj02/m0$j4;

    const/4 v0, 0x1

    invoke-direct {p1, v2, v0, v2}, Lj02/m0$j4;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, p1}, Lvm2/d;->b(Lj02/m0;)Lj02/p0;

    move-result-object p1

    return-object p1

    :cond_5
    if-eqz v4, :cond_7

    iget-object v3, p0, Lvm2/d;->V:Lvm2/l;

    invoke-virtual {v3, v4}, Lvm2/l;->a(Ljava/lang/String;)V

    iget-object v3, p0, Lvm2/d;->W:Ltr2/n;

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "deeplink-migration: tab from LegacyTabScreenMapping: tab="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " (backend sent no tab)"

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v3, v5, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v1, p0, Lvm2/d;->N:Lji0/f;

    invoke-interface {v1, v4}, Lji0/f;->c(Ljava/lang/String;)Lcom/whoop/appconfiguration/TabConfiguration;

    move-result-object v1

    if-eqz v1, :cond_6

    iget-object v3, p0, Lvm2/d;->O:Lvm2/a;

    invoke-virtual {v3, v1}, Lvm2/a;->a(Lcom/whoop/appconfiguration/TabConfiguration;)Lj02/m0;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object p1

    invoke-direct {p0, v1, p1}, Lvm2/d;->U0(Lj02/m0;Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {v0}, Lj02/m0;->a()Lcom/whoop/navigation/AiAction;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lvm2/d;->T0(Lj02/m0;Lcom/whoop/navigation/AiAction;)Lj02/m0;

    move-result-object v2

    :cond_6
    invoke-direct {p0, v4, v2}, Lvm2/d;->R0(Ljava/lang/String;Lj02/m0;)Lj02/p0;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-virtual {p0, v0}, Lvm2/d;->b(Lj02/m0;)Lj02/p0;

    move-result-object p1

    return-object p1

    :cond_8
    :goto_2
    iget-object v0, p0, Lvm2/d;->W:Ltr2/n;

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "navigateToDestination: NavigationReducer could not map screen=\'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\'"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lj02/p0$h;->a:Lj02/p0$h;

    return-object p1
.end method

.method public b(Lj02/m0;)Lj02/p0;
    .locals 6

    const-string v0, "navigationScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lvm2/d;->z:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "aix-app-navigator-noop-fix"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    new-instance v1, Lkotlin/jvm/internal/b0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-boolean v0, v1, Lkotlin/jvm/internal/b0;->w:Z

    new-instance v2, Lm83/p;

    const/16 v3, 0x13

    invoke-direct {v2, v1, v3}, Lm83/p;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p0, p1, v0, v2}, Lvm2/d;->Q0(Lj02/m0;ZLc93/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lvm2/d;->P:Lvm2/m;

    invoke-virtual {v0, p1}, Lvm2/m;->a(Lj02/m0;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lvm2/d;->K()V

    :cond_0
    sget-object p1, Lj02/p0$h;->a:Lj02/p0$h;

    return-object p1

    :cond_1
    invoke-direct {p0, p1}, Lvm2/d;->w(Lj02/m0;)Lj02/p0;

    move-result-object v0

    sget-object v2, Lj02/p0$h;->a:Lj02/p0$h;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-direct {p0, p1}, Lvm2/d;->E0(Lj02/m0;)Lj02/p0;

    move-result-object v0

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lvm2/d;->W:Ltr2/n;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-interface {v3}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Composite navigation to "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " resulted in "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    new-array v4, v4, [Lqr2/a$a;

    invoke-interface {v2, v3, v4}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_0
    iget-boolean v1, v1, Lkotlin/jvm/internal/b0;->w:Z

    if-eqz v1, :cond_3

    iget-object v1, p0, Lvm2/d;->T:Ldp0/g;

    if-eqz v1, :cond_3

    invoke-interface {v1, p1}, Ldp0/g;->z(Lj02/m0;)V

    :cond_3
    invoke-direct {p0, p1, v0}, Lvm2/d;->L(Lj02/m0;Lj02/p0;)V

    return-object v0
.end method

.method public d(Lcom/whoop/navigation/e;)Lj02/p0;
    .locals 3

    const-string v0, "navigationAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lvm2/d;->K:Lo02/d;

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v1

    invoke-interface {v0, v1}, Lo02/d;->a(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;

    move-result-object v0

    instance-of v1, v0, Lj02/m0$m1;

    if-eqz v1, :cond_0

    check-cast v0, Lj02/m0$m1;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/a0;

    invoke-virtual {v1}, Leb/a0;->h()Leb/q;

    move-result-object v1

    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    invoke-direct {p0, p1}, Lvm2/d;->P0(Lcom/whoop/navigation/e;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-direct {p0, v0, v1}, Lvm2/d;->q(Lj02/m0$m1;Leb/q;)Lj02/m0$m1;

    move-result-object p1

    invoke-virtual {p0, p1}, Lvm2/d;->b(Lj02/m0;)Lj02/p0;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_1
    invoke-direct {p0, p1}, Lvm2/d;->v(Lcom/whoop/navigation/e;)Lj02/p0;

    move-result-object p1

    return-object p1
.end method

.method public e(Lcom/whoop/navigation/e;)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    instance-of v1, p1, Lcom/whoop/navigation/NativeStoreScreenModel;

    if-eqz v1, :cond_1

    check-cast p1, Lcom/whoop/navigation/NativeStoreScreenModel;

    goto :goto_1

    :cond_1
    move-object p1, v0

    :goto_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/whoop/navigation/NativeStoreScreenModel;->getSource()Ljava/lang/String;

    move-result-object v0

    :cond_2
    invoke-direct {p0, v0}, Lvm2/d;->S0(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public bridge onCreate(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onCreate(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onDestroy(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onDestroy(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onPause(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onPause(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onResume(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onResume(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public onStart(Landroidx/lifecycle/g0;)V
    .locals 2

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object p1, p0, Lvm2/d;->M:Lj02/l0;

    iget-object v0, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leb/a0;

    invoke-virtual {v0}, Leb/a0;->i()Leb/n0;

    move-result-object v0

    invoke-interface {p1, v0}, Lj02/l0;->a0(Leb/n0;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    return-void

    :catch_0
    iget-object p1, p0, Lvm2/d;->W:Ltr2/n;

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "App started, but failed to find destination for nav tag due to IllegalArgumentException"

    invoke-interface {p1, v1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    :catch_1
    return-void
.end method

.method public bridge onStop(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStop(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public final t(Leb/n0;)Lj02/m0;
    .locals 2

    if-nez p1, :cond_0

    iget-object p1, p0, Lvm2/d;->x:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Leb/a0;

    invoke-virtual {p1}, Leb/a0;->i()Leb/n0;

    move-result-object p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_2

    iget p1, p1, Leb/n0;->H:I

    sget v1, Lhi0/e;->D2:I

    if-ne p1, v1, :cond_2

    iget-object p1, p0, Lvm2/d;->Q:Lvm2/f;

    invoke-virtual {p1}, Lvm2/f;->a()Lj02/m0;

    move-result-object p1

    if-nez p1, :cond_1

    return-object v0

    :cond_1
    invoke-direct {p0, p1}, Lvm2/d;->F(Lj02/m0;)Z

    move-result v1

    if-nez v1, :cond_2

    return-object p1

    :cond_2
    return-object v0
.end method
