.class public final Llive/hms/video/signal/jsonrpc/JSONRpcSignal;
.super Llive/hms/video/signal/jsonrpc/HMSWebSocketListener;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/signal/ISignal;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;,
        Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Companion;,
        Llive/hms/video/signal/jsonrpc/JSONRpcSignal$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00aa\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0003\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0000\u0018\u0000 \u00f1\u00012\u00020\u00012\u00020\u0002:\u0004\u00f1\u0001\u00f2\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001e\u0010\u000b\u001a\u00020\n2\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0096@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010JD\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u0013H\u0096@\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ.\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u00072\u0006\u0010\u001e\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\u0016\u0010\u001fJ\u001f\u0010 \u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"H\u0016\u00a2\u0006\u0004\u0008#\u0010$J\u0018\u0010(\u001a\u00020\'2\u0006\u0010&\u001a\u00020%H\u0096@\u00a2\u0006\u0004\u0008(\u0010)J\u001d\u0010*\u001a\u00020\u000e2\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u0007H\u0016\u00a2\u0006\u0004\u0008*\u0010+J\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008-\u0010.J6\u00105\u001a\u00020\u000e2\u000c\u00100\u001a\u0008\u0012\u0004\u0012\u00020/0\u00072\u0006\u00101\u001a\u00020/2\u0006\u00102\u001a\u00020\u00132\u0006\u00104\u001a\u000203H\u0096@\u00a2\u0006\u0004\u00085\u00106J(\u00109\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\u00082\u0006\u00102\u001a\u00020\u00132\u0006\u00108\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u00089\u0010:J*\u0010>\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u00082\u0006\u00108\u001a\u00020\u00082\u0008\u0010=\u001a\u0004\u0018\u00010<H\u0096@\u00a2\u0006\u0004\u0008>\u0010?J \u0010B\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020\u00082\u0006\u0010A\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008B\u0010CJ \u0010E\u001a\u00020\u00132\u0006\u0010A\u001a\u00020\u00082\u0006\u0010D\u001a\u00020\u0013H\u0096@\u00a2\u0006\u0004\u0008E\u0010FJ(\u0010J\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020G2\u0006\u0010@\u001a\u00020\u00082\u0006\u0010I\u001a\u00020\u0013H\u0096@\u00a2\u0006\u0004\u0008J\u0010KJD\u0010J\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020\u00132\u0008\u0010M\u001a\u0004\u0018\u00010L2\u0008\u0010N\u001a\u0004\u0018\u00010\u00082\u000e\u0010O\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00072\u0006\u0010P\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008J\u0010QJ\u0018\u0010T\u001a\u00020\u000e2\u0006\u0010S\u001a\u00020RH\u0096@\u00a2\u0006\u0004\u0008T\u0010UJ\u001a\u0010W\u001a\u00020\u000e2\u0008\u0010S\u001a\u0004\u0018\u00010VH\u0096@\u00a2\u0006\u0004\u0008W\u0010XJ\u001a\u0010Y\u001a\u00020\u000e2\u0008\u0010S\u001a\u0004\u0018\u00010VH\u0096@\u00a2\u0006\u0004\u0008Y\u0010XJ\u0010\u0010Z\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0004\u0008Z\u0010[J\u0018\u0010\\\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\\\u0010\u0010J\u0018\u0010^\u001a\u00020\u000e2\u0006\u0010]\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008^\u0010\u0010J\u001a\u0010a\u001a\u00020`2\u0008\u0010_\u001a\u0004\u0018\u00010\u0008H\u0096@\u00a2\u0006\u0004\u0008a\u0010\u0010J\"\u0010d\u001a\u00020c2\u0006\u0010_\u001a\u00020\u00082\u0008\u0010]\u001a\u0004\u0018\u00010bH\u0096@\u00a2\u0006\u0004\u0008d\u0010eJ\u001e\u0010h\u001a\u00020\u000e2\u000c\u0010g\u001a\u0008\u0012\u0004\u0012\u00020f0\u0007H\u0096@\u00a2\u0006\u0004\u0008h\u0010\u000cJ\u0017\u0010j\u001a\u00020\u000e2\u0006\u0010j\u001a\u00020iH\u0016\u00a2\u0006\u0004\u0008j\u0010kJ\u000f\u0010l\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008l\u0010mJ\u001f\u0010r\u001a\u00020\u000e2\u0006\u0010o\u001a\u00020n2\u0006\u0010q\u001a\u00020pH\u0016\u00a2\u0006\u0004\u0008r\u0010sJ)\u0010v\u001a\u00020\u000e2\u0006\u0010o\u001a\u00020n2\u0006\u0010u\u001a\u00020t2\u0008\u0010q\u001a\u0004\u0018\u00010pH\u0016\u00a2\u0006\u0004\u0008v\u0010wJ\u001f\u0010y\u001a\u00020\u000e2\u0006\u0010o\u001a\u00020n2\u0006\u0010x\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008y\u0010zJ\'\u0010}\u001a\u00020\u000e2\u0006\u0010o\u001a\u00020n2\u0006\u0010|\u001a\u00020{2\u0006\u0010A\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008}\u0010~J\u001c\u0010\u0081\u0001\u001a\u00030\u0080\u00012\u0006\u0010&\u001a\u00020\u007fH\u0096@\u00a2\u0006\u0006\u0008\u0081\u0001\u0010\u0082\u0001J\u001d\u0010\u0085\u0001\u001a\u00030\u0084\u00012\u0007\u0010&\u001a\u00030\u0083\u0001H\u0096@\u00a2\u0006\u0006\u0008\u0085\u0001\u0010\u0086\u0001J\u001b\u0010\u0088\u0001\u001a\u00020\u000e2\u0007\u0010\u0087\u0001\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0005\u0008\u0088\u0001\u0010\u0010J\u001b\u0010\u0089\u0001\u001a\u00020\u000e2\u0007\u0010\u0087\u0001\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0005\u0008\u0089\u0001\u0010\u0010J\u001e\u0010\u008b\u0001\u001a\u00030\u008c\u00012\u0008\u0010\u008b\u0001\u001a\u00030\u008a\u0001H\u0096@\u00a2\u0006\u0006\u0008\u008b\u0001\u0010\u008d\u0001J\u001e\u0010\u0091\u0001\u001a\u00030\u0090\u00012\u0008\u0010\u008f\u0001\u001a\u00030\u008e\u0001H\u0096@\u00a2\u0006\u0006\u0008\u0091\u0001\u0010\u0092\u0001J\u001e\u0010\u0096\u0001\u001a\u00030\u0095\u00012\u0008\u0010\u0094\u0001\u001a\u00030\u0093\u0001H\u0096@\u00a2\u0006\u0006\u0008\u0096\u0001\u0010\u0097\u0001J\u001c\u0010\u0099\u0001\u001a\u00030\u0098\u00012\u0007\u0010\u0087\u0001\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0005\u0008\u0099\u0001\u0010\u0010J\u001e\u0010\u009c\u0001\u001a\u00030\u009b\u00012\u0008\u0010\u0094\u0001\u001a\u00030\u009a\u0001H\u0096@\u00a2\u0006\u0006\u0008\u009c\u0001\u0010\u009d\u0001J\u001e\u0010\u00a1\u0001\u001a\u00030\u00a0\u00012\u0008\u0010\u009f\u0001\u001a\u00030\u009e\u0001H\u0096@\u00a2\u0006\u0006\u0008\u00a1\u0001\u0010\u00a2\u0001J\u001c\u0010\u00a5\u0001\u001a\u00030\u00a4\u00012\u0007\u0010\u00a3\u0001\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0005\u0008\u00a5\u0001\u0010\u0010J2\u0010\u00ab\u0001\u001a\u00030\u00aa\u00012\u0008\u0010\u00a7\u0001\u001a\u00030\u00a6\u00012\u0007\u0010\u00a8\u0001\u001a\u00020{2\t\u0010\u00a9\u0001\u001a\u0004\u0018\u00010\u0008H\u0096@\u00a2\u0006\u0006\u0008\u00ab\u0001\u0010\u00ac\u0001J\u001c\u0010\u00af\u0001\u001a\u00030\u00ae\u00012\u0007\u0010\u00ad\u0001\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0005\u0008\u00af\u0001\u0010\u0010J\u001c\u0010\u00b0\u0001\u001a\u00030\u00ae\u00012\u0007\u0010\u00ad\u0001\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0005\u0008\u00b0\u0001\u0010\u0010J#\u0010\u00b1\u0001\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020\u00082\u0007\u0010\u00ad\u0001\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0005\u0008\u00b1\u0001\u0010CJ#\u0010\u00b2\u0001\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020\u00082\u0007\u0010\u00ad\u0001\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0005\u0008\u00b2\u0001\u0010CJR\u0010\u00b9\u0001\u001a\u00030\u00b8\u00012\t\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u00082\t\u0010\u00b3\u0001\u001a\u0004\u0018\u00010\u00082\u001d\u0010\u00b6\u0001\u001a\u0018\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00b4\u0001j\u000b\u0012\u0004\u0012\u00020\u0008\u0018\u0001`\u00b5\u00012\u0007\u0010\u00b7\u0001\u001a\u00020{H\u0096@\u00a2\u0006\u0006\u0008\u00b9\u0001\u0010\u00ba\u0001J&\u0010\u00bc\u0001\u001a\u00030\u00b8\u00012\u0007\u0010\u00bb\u0001\u001a\u00020\u00082\u0007\u0010\u00b7\u0001\u001a\u00020{H\u0096@\u00a2\u0006\u0006\u0008\u00bc\u0001\u0010\u00bd\u0001J\u001d\u0010\u00c0\u0001\u001a\u00020\u000e2\u0008\u0010\u00bf\u0001\u001a\u00030\u00be\u0001H\u0096@\u00a2\u0006\u0006\u0008\u00c0\u0001\u0010\u00c1\u0001J\u001d\u0010\u00c2\u0001\u001a\u00020\u000e2\u0008\u0010\u00bf\u0001\u001a\u00030\u00be\u0001H\u0096@\u00a2\u0006\u0006\u0008\u00c2\u0001\u0010\u00c1\u0001J0\u0010\u00c7\u0001\u001a\u00030\u00c6\u00012\u0007\u0010\u00c3\u0001\u001a\u00020\u00082\u0007\u0010\u00b7\u0001\u001a\u00020{2\u0008\u0010\u00c5\u0001\u001a\u00030\u00c4\u0001H\u0096@\u00a2\u0006\u0006\u0008\u00c7\u0001\u0010\u00c8\u0001J<\u0010\u00ce\u0001\u001a\u00028\u0000\"\u0005\u0008\u0000\u0010\u00c9\u00012\u0008\u0010\u00cb\u0001\u001a\u00030\u00ca\u00012\u0006\u0010&\u001a\u00020%2\u000e\u0010\u00cd\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u00cc\u0001H\u0082@\u00a2\u0006\u0006\u0008\u00ce\u0001\u0010\u00cf\u0001J:\u0010\u00d4\u0001\u001a\u00020\u000e2\t\u0010\u00d0\u0001\u001a\u0004\u0018\u00010n2\u0007\u0010\u00d1\u0001\u001a\u00020\u00082\u0012\u0008\u0002\u0010\u00d3\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00d2\u0001H\u0002\u00a2\u0006\u0006\u0008\u00d4\u0001\u0010\u00d5\u0001J$\u0010\u00d6\u0001\u001a\u00020\u000e2\u0008\u0010\u00cb\u0001\u001a\u00030\u00ca\u00012\u0006\u0010&\u001a\u00020%H\u0002\u00a2\u0006\u0006\u0008\u00d6\u0001\u0010\u00d7\u0001R\u001d\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0005\u0008\u0004\u0010\u00d8\u0001\u001a\u0006\u0008\u00d9\u0001\u0010\u00da\u0001R\u0019\u0010\u00db\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00db\u0001\u0010\u00dc\u0001R \u0010\u00dd\u0001\u001a\t\u0012\u0004\u0012\u00020\u00130\u00d2\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00dd\u0001\u0010\u00de\u0001R \u0010\u00df\u0001\u001a\t\u0012\u0004\u0012\u00020\u00130\u00d2\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00df\u0001\u0010\u00de\u0001R\u001b\u0010\u00d0\u0001\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00d0\u0001\u0010\u00e0\u0001R%\u0010\u00e3\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0005\u0012\u00030\u00e2\u00010\u00e1\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00e3\u0001\u0010\u00e4\u0001R!\u0010\u00ea\u0001\u001a\u00030\u00e5\u00018BX\u0082\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u00e6\u0001\u0010\u00e7\u0001\u001a\u0006\u0008\u00e8\u0001\u0010\u00e9\u0001R\u001e\u0010\u00eb\u0001\u001a\t\u0012\u0004\u0012\u00020\"0\u00b4\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00eb\u0001\u0010\u00ec\u0001R\u0019\u0010\u00ed\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00ed\u0001\u0010\u00dc\u0001R\u0019\u0010\u00ee\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00ee\u0001\u0010\u00dc\u0001R\u0017\u0010\u00ef\u0001\u001a\u00020\u00138VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00ef\u0001\u0010\u00f0\u0001\u00a8\u0006\u00f3\u0001"
    }
    d2 = {
        "Llive/hms/video/signal/jsonrpc/JSONRpcSignal;",
        "Llive/hms/video/signal/ISignal;",
        "Llive/hms/video/signal/jsonrpc/HMSWebSocketListener;",
        "Llive/hms/video/signal/ISignalEventsObserver;",
        "observer",
        "<init>",
        "(Llive/hms/video/signal/ISignalEventsObserver;)V",
        "",
        "",
        "tags",
        "Llive/hms/video/sessionstore/SetMetadataListenerResult;",
        "setMetadataListener",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "uri",
        "Ll83/a0;",
        "open",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "name",
        "data",
        "",
        "serverSideSubscribeDegradation",
        "Llive/hms/video/connection/models/HMSSessionDescription;",
        "offer",
        "Llive/hms/video/sdk/models/IRetryAttemptTracking;",
        "retryAttemptTracking",
        "simulcastEnabled",
        "join",
        "(Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/connection/models/HMSSessionDescription;Llive/hms/video/sdk/models/IRetryAttemptTracking;ZLq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/sdk/models/HMSNotifications$Track;",
        "tracks",
        "nodeInfo",
        "(Llive/hms/video/connection/models/HMSSessionDescription;Ljava/util/List;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "answer",
        "(Llive/hms/video/connection/models/HMSSessionDescription;Ljava/lang/String;)V",
        "Llive/hms/video/connection/models/HMSTrickle;",
        "trickle",
        "(Llive/hms/video/connection/models/HMSTrickle;)V",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams;",
        "params",
        "Llive/hms/video/sdk/models/HMSMessageSendResponse;",
        "sendMessage",
        "(Llive/hms/video/signal/jsonrpc/models/HMSParams;Lq83/d;)Ljava/lang/Object;",
        "trackUpdate",
        "(Ljava/util/List;)V",
        "notifyServer",
        "leave",
        "(Z)V",
        "Llive/hms/video/sdk/models/role/HMSRole;",
        "ofRoles",
        "toRole",
        "force",
        "Llive/hms/video/sdk/HMSActionResultListener;",
        "hmsActionResultListener",
        "bulkRoleChangeRequest",
        "(Ljava/util/List;Llive/hms/video/sdk/models/role/HMSRole;ZLlive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;",
        "forPeerId",
        "role",
        "roleChangeRequest",
        "(Ljava/lang/String;ZLjava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "token",
        "Llive/hms/video/sdk/models/HMSPeer;",
        "requestedBy",
        "roleChangeAccept",
        "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Lq83/d;)Ljava/lang/Object;",
        "peerId",
        "reason",
        "removePeer",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "lock",
        "endRoom",
        "(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/media/tracks/HMSTrack;",
        "hmsTrack",
        "mute",
        "changeTrackState",
        "(Llive/hms/video/media/tracks/HMSTrack;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/media/tracks/HMSTrackType;",
        "type",
        "source",
        "roles",
        "requestedByPeerId",
        "(ZLlive/hms/video/media/tracks/HMSTrackType;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/sdk/models/HMSRecordingConfig;",
        "config",
        "startRtmpOrRecording",
        "(Llive/hms/video/sdk/models/HMSRecordingConfig;Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/sdk/models/HMSHLSConfig;",
        "startHLSStreaming",
        "(Llive/hms/video/sdk/models/HMSHLSConfig;Lq83/d;)Ljava/lang/Object;",
        "stopHLSStreaming",
        "stopRtmpAndRecording",
        "(Lq83/d;)Ljava/lang/Object;",
        "changeName",
        "metadata",
        "changeMetadata",
        "key",
        "Llive/hms/video/sessionstore/SessionMetadataResult;",
        "getSessionMetadata",
        "Lcom/google/gson/JsonElement;",
        "Llive/hms/video/sessionstore/SetSessionMetadataResult;",
        "changeSessionMetadata",
        "(Ljava/lang/String;Lcom/google/gson/JsonElement;Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/sdk/models/HMSHLSTimedMetadata;",
        "metadataModelList",
        "setHlsSessionMetadata",
        "Llive/hms/video/events/AnalyticsEvent;",
        "event",
        "(Llive/hms/video/events/AnalyticsEvent;)V",
        "close",
        "()V",
        "Lud3/e1;",
        "webSocket",
        "Lud3/x0;",
        "response",
        "onOpen",
        "(Lud3/e1;Lud3/x0;)V",
        "",
        "t",
        "onFailure",
        "(Lud3/e1;Ljava/lang/Throwable;Lud3/x0;)V",
        "text",
        "onMessage",
        "(Lud3/e1;Ljava/lang/String;)V",
        "",
        "code",
        "onClosed",
        "(Lud3/e1;ILjava/lang/String;)V",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$SetPollParams;",
        "Llive/hms/video/polls/network/PollCreateResponse;",
        "createPoll",
        "(Llive/hms/video/signal/jsonrpc/models/HMSParams$SetPollParams;Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsSet;",
        "Llive/hms/video/polls/network/SetQuestionsResponse;",
        "createQuestion",
        "(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsSet;Lq83/d;)Ljava/lang/Object;",
        "pollId",
        "pollStart",
        "pollStop",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsGet;",
        "pollQuestionsGet",
        "Llive/hms/video/polls/network/PollQuestionGetResponse;",
        "(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsGet;Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/polls/HMSPollResponseBuilder;",
        "hmsPollResponseBuilder",
        "Llive/hms/video/polls/models/answer/PollAnswerResponse;",
        "pollAddResponse",
        "(Llive/hms/video/polls/HMSPollResponseBuilder;Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;",
        "param",
        "Llive/hms/video/polls/network/PollGetResponsesReply;",
        "pollGetResponses",
        "(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/polls/network/PollResultsResponse;",
        "pollGetResults",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollLeaderboardQuery;",
        "Llive/hms/video/polls/network/PollLeaderboardResponse;",
        "pollGetLeaderboard",
        "(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollLeaderboardQuery;Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;",
        "options",
        "Llive/hms/video/whiteboard/network/HMSCreateWhiteBoardResponse;",
        "createWhiteBoard",
        "(Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;Lq83/d;)Ljava/lang/Object;",
        "id",
        "Llive/hms/video/whiteboard/network/HMSGetWhiteBoardResponse;",
        "getWhiteBoard",
        "Llive/hms/video/polls/models/HmsPollState;",
        "state",
        "count",
        "start",
        "Llive/hms/video/polls/network/PollListResponse;",
        "pollGetList",
        "(Llive/hms/video/polls/models/HmsPollState;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "groupName",
        "Llive/hms/video/groups/GroupJoinLeaveResponse;",
        "groupJoin",
        "groupLeave",
        "groupAdd",
        "groupRemove",
        "roleName",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "peerIds",
        "limit",
        "Llive/hms/video/sdk/models/FindPeerResponse;",
        "findPeer",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ILq83/d;)Ljava/lang/Object;",
        "iteratorId",
        "peerIteratorNext",
        "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/sdk/models/TranscriptionsMode;",
        "mode",
        "startRealTimeTranscription",
        "(Llive/hms/video/sdk/models/TranscriptionsMode;Lq83/d;)Ljava/lang/Object;",
        "stopRealTimeTranscription",
        "query",
        "",
        "offset",
        "Llive/hms/video/sdk/models/PeerNameSearchResponse;",
        "peerNameSearch",
        "(Ljava/lang/String;IJLq83/d;)Ljava/lang/Object;",
        "T",
        "Llive/hms/video/signal/HMSSignalMethod;",
        "method",
        "Ljava/lang/Class;",
        "c",
        "call",
        "(Llive/hms/video/signal/HMSSignalMethod;Llive/hms/video/signal/jsonrpc/models/HMSParams;Ljava/lang/Class;Lq83/d;)Ljava/lang/Object;",
        "socket",
        "message",
        "Lbc3/s;",
        "deferred",
        "sendSocketMessage",
        "(Lud3/e1;Ljava/lang/String;Lbc3/s;)V",
        "notify",
        "(Llive/hms/video/signal/HMSSignalMethod;Llive/hms/video/signal/jsonrpc/models/HMSParams;)V",
        "Llive/hms/video/signal/ISignalEventsObserver;",
        "getObserver",
        "()Llive/hms/video/signal/ISignalEventsObserver;",
        "_isConnected",
        "Z",
        "webSocketOpenDeferred",
        "Lbc3/s;",
        "onRoleChangeDeferred",
        "Lud3/e1;",
        "Ljava/util/HashMap;",
        "Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;",
        "callbacks",
        "Ljava/util/HashMap;",
        "Lmc3/a;",
        "mutex$delegate",
        "Ll83/h;",
        "getMutex",
        "()Lmc3/a;",
        "mutex",
        "pendingTrickle",
        "Ljava/util/ArrayList;",
        "isJoinCompleted",
        "isLeaveInProgress",
        "isConnected",
        "()Z",
        "Companion",
        "Callback",
        "lib_release"
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
.field public static final Companion:Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Companion;

.field public static final TAG:Ljava/lang/String; = "JsonRPCSignal"


# instance fields
.field private _isConnected:Z

.field private final callbacks:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;",
            ">;"
        }
    .end annotation
.end field

.field private isJoinCompleted:Z

.field private isLeaveInProgress:Z

.field private final mutex$delegate:Ll83/h;

.field private final observer:Llive/hms/video/signal/ISignalEventsObserver;

.field private onRoleChangeDeferred:Lbc3/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc3/s;"
        }
    .end annotation
.end field

.field private final pendingTrickle:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Llive/hms/video/connection/models/HMSTrickle;",
            ">;"
        }
    .end annotation
.end field

.field private socket:Lud3/e1;

.field private webSocketOpenDeferred:Lbc3/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc3/s;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->Companion:Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Companion;

    return-void
.end method

.method public constructor <init>(Llive/hms/video/signal/ISignalEventsObserver;)V
    .locals 1

    const-string v0, "observer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Llive/hms/video/signal/jsonrpc/HMSWebSocketListener;-><init>()V

    iput-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->observer:Llive/hms/video/signal/ISignalEventsObserver;

    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->webSocketOpenDeferred:Lbc3/s;

    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->onRoleChangeDeferred:Lbc3/s;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->callbacks:Ljava/util/HashMap;

    new-instance p1, Llh1/a;

    const/16 v0, 0xb

    invoke-direct {p1, v0}, Llh1/a;-><init>(I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->mutex$delegate:Ll83/h;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->pendingTrickle:Ljava/util/ArrayList;

    return-void
.end method

.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->close$lambda$2()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$call(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/HMSSignalMethod;Llive/hms/video/signal/jsonrpc/models/HMSParams;Ljava/lang/Class;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->call(Llive/hms/video/signal/HMSSignalMethod;Llive/hms/video/signal/jsonrpc/models/HMSParams;Ljava/lang/Class;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMutex(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;)Lmc3/a;
    .locals 0

    invoke-direct {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getMutex()Lmc3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Lmc3/a;
    .locals 1

    invoke-static {}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->mutex_delegate$lambda$0()Lmc3/a;

    move-result-object v0

    return-object v0
.end method

.method private final call(Llive/hms/video/signal/HMSSignalMethod;Llive/hms/video/signal/jsonrpc/models/HMSParams;Ljava/lang/Class;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Llive/hms/video/signal/HMSSignalMethod;",
            "Llive/hms/video/signal/jsonrpc/models/HMSParams;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lq83/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "Sending ws message: [size="

    instance-of v1, p4, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$call$1;

    if-eqz v1, :cond_0

    move-object v1, p4

    check-cast v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$call$1;

    iget v2, v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$call$1;->label:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$call$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$call$1;

    invoke-direct {v1, p0, p4}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$call$1;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Lq83/d;)V

    :goto_0
    iget-object p4, v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$call$1;->result:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$call$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object p1, v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$call$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p2, v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$call$1;->L$1:Ljava/lang/Object;

    move-object p3, p2

    check-cast p3, Ljava/lang/Class;

    iget-object p2, v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$call$1;->L$0:Ljava/lang/Object;

    check-cast p2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;

    :try_start_0
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlin/UninitializedPropertyAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p3, v0

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p4, Llive/hms/video/utils/IdHelper;->INSTANCE:Llive/hms/video/utils/IdHelper;

    invoke-virtual {p4}, Llive/hms/video/utils/IdHelper;->makeCallSignalId()Ljava/lang/String;

    move-result-object p4

    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object v3

    new-instance v5, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;

    invoke-direct {v5, p4, p1, p2}, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;-><init>(Ljava/lang/String;Llive/hms/video/signal/HMSSignalMethod;Llive/hms/video/signal/jsonrpc/models/HMSParams;)V

    invoke-virtual {v5}, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->toJson()Ljava/lang/String;

    move-result-object p2

    iget-object v5, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->callbacks:Ljava/util/HashMap;

    new-instance v6, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;

    invoke-direct {v6, v3, p2, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;-><init>(Lbc3/s;Ljava/lang/String;Llive/hms/video/signal/HMSSignalMethod;)V

    invoke-interface {v5, p4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_1
    const-string p1, "JsonRPCSignal"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "] "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->socket:Lud3/e1;

    invoke-direct {p0, p1, p2, v3}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->sendSocketMessage(Lud3/e1;Ljava/lang/String;Lbc3/s;)V

    iput-object p0, v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$call$1;->L$0:Ljava/lang/Object;

    iput-object p3, v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$call$1;->L$1:Ljava/lang/Object;

    iput-object p4, v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$call$1;->L$2:Ljava/lang/Object;

    iput v4, v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$call$1;->label:I

    invoke-virtual {v3, v1}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Lkotlin/UninitializedPropertyAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v2, :cond_3

    return-object v2

    :cond_3
    move-object p2, p4

    move-object p4, p1

    move-object p1, p2

    move-object p2, p0

    :goto_1
    :try_start_2
    check-cast p4, Ljava/lang/String;

    iget-object v0, p2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->callbacks:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Llive/hms/video/utils/GsonUtils;->INSTANCE:Llive/hms/video/utils/GsonUtils;

    invoke-virtual {v0}, Llive/hms/video/utils/GsonUtils;->getGson()Lcom/google/gson/Gson;

    move-result-object v0

    invoke-virtual {v0, p4, p3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p3
    :try_end_2
    .catch Lkotlin/UninitializedPropertyAccessException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object p2, p2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->callbacks:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p3

    :catchall_1
    move-exception v0

    move-object p3, v0

    move-object p2, p0

    move-object p1, p4

    goto :goto_2

    :catch_0
    move-object p2, p0

    move-object p1, p4

    :catch_1
    :try_start_3
    sget-object v0, Llive/hms/video/error/ErrorFactory$GenericErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$GenericErrors;

    sget-object v1, Llive/hms/video/error/ErrorFactory$Action;->NONE:Llive/hms/video/error/ErrorFactory$Action;

    const-string v2, "Websocket was either not initialized or not connected"

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Llive/hms/video/error/ErrorFactory$GenericErrors;->NotConnected$default(Llive/hms/video/error/ErrorFactory$GenericErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object p3

    throw p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_2
    iget-object p2, p2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->callbacks:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    throw p3
.end method

.method private static final close$lambda$2()Ll83/a0;
    .locals 2

    const-string v0, "JsonRPCSignal"

    const-string v1, "Socket is null, Cannot close"

    invoke-static {v0, v1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private final getMutex()Lmc3/a;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->mutex$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmc3/a;

    return-object v0
.end method

.method private static final mutex_delegate$lambda$0()Lmc3/a;
    .locals 1

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object v0

    return-object v0
.end method

.method private final notify(Llive/hms/video/signal/HMSSignalMethod;Llive/hms/video/signal/jsonrpc/models/HMSParams;)V
    .locals 1

    new-instance v0, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;

    invoke-direct {v0, p1, p2}, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;-><init>(Llive/hms/video/signal/HMSSignalMethod;Llive/hms/video/signal/jsonrpc/models/HMSParams;)V

    invoke-virtual {v0}, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->toJson()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Sending ws message: [size="

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "] "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "JsonRPCSignal"

    invoke-static {v0, p2}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->socket:Lud3/e1;

    const/4 v0, 0x0

    invoke-direct {p0, p2, p1, v0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->sendSocketMessage(Lud3/e1;Ljava/lang/String;Lbc3/s;)V

    return-void
.end method

.method private final sendSocketMessage(Lud3/e1;Ljava/lang/String;Lbc3/s;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lud3/e1;",
            "Ljava/lang/String;",
            "Lbc3/s;",
            ")V"
        }
    .end annotation

    if-nez p1, :cond_0

    if-eqz p3, :cond_0

    sget-object v0, Llive/hms/video/error/ErrorFactory$WebSocketConnectionErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$WebSocketConnectionErrors;

    sget-object v1, Llive/hms/video/error/ErrorFactory$Action;->NONE:Llive/hms/video/error/ErrorFactory$Action;

    const/16 v5, 0xc

    const/4 v6, 0x0

    const-string v2, "Websocket is not ready yet or has been destroyed"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Llive/hms/video/error/ErrorFactory$WebSocketConnectionErrors;->WebSocketNotAvailable$default(Llive/hms/video/error/ErrorFactory$WebSocketConnectionErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object p1

    check-cast p3, Lbc3/t;

    invoke-virtual {p3, p1}, Lbc3/t;->completeExceptionally(Ljava/lang/Throwable;)Z

    return-void

    :cond_0
    if-eqz p1, :cond_1

    check-cast p1, Lle3/g;

    invoke-virtual {p1, p2}, Lle3/g;->h(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    if-eqz p3, :cond_2

    sget-object v0, Llive/hms/video/error/ErrorFactory$WebSocketConnectionErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$WebSocketConnectionErrors;

    sget-object v1, Llive/hms/video/error/ErrorFactory$Action;->NONE:Llive/hms/video/error/ErrorFactory$Action;

    const/16 v5, 0xc

    const/4 v6, 0x0

    const-string v2, "WebSocket Disconnected"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Llive/hms/video/error/ErrorFactory$WebSocketConnectionErrors;->WebSocketConnectionLost$default(Llive/hms/video/error/ErrorFactory$WebSocketConnectionErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object p1

    check-cast p3, Lbc3/t;

    invoke-virtual {p3, p1}, Lbc3/t;->completeExceptionally(Ljava/lang/Throwable;)Z

    :cond_2
    return-void
.end method

.method public static synthetic sendSocketMessage$default(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Lud3/e1;Ljava/lang/String;Lbc3/s;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->sendSocketMessage(Lud3/e1;Ljava/lang/String;Lbc3/s;)V

    return-void
.end method


# virtual methods
.method public answer(Llive/hms/video/connection/models/HMSSessionDescription;Ljava/lang/String;)V
    .locals 1

    const-string v0, "answer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nodeInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Llive/hms/video/signal/HMSSignalMethod;->ANSWER:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Answer;

    invoke-direct {v0, p1}, Llive/hms/video/signal/jsonrpc/models/HMSParams$Answer;-><init>(Llive/hms/video/connection/models/HMSSessionDescription;)V

    invoke-direct {p0, p2, v0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->notify(Llive/hms/video/signal/HMSSignalMethod;Llive/hms/video/signal/jsonrpc/models/HMSParams;)V

    return-void
.end method

.method public bulkRoleChangeRequest(Ljava/util/List;Llive/hms/video/sdk/models/role/HMSRole;ZLlive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/role/HMSRole;",
            ">;",
            "Llive/hms/video/sdk/models/role/HMSRole;",
            "Z",
            "Llive/hms/video/sdk/HMSActionResultListener;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$bulkRoleChangeRequest$2;

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move v3, p3

    invoke-direct/range {v0 .. v5}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$bulkRoleChangeRequest$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Ljava/util/List;ZLlive/hms/video/sdk/models/role/HMSRole;Lq83/d;)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$bulkRoleChangeRequest$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    invoke-direct {v1, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$bulkRoleChangeRequest$3;-><init>(Ljava/lang/Object;)V

    const/16 v7, 0x3c

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p5

    invoke-static/range {v0 .. v8}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public changeMetadata(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeMetadata$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeMetadata$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Ljava/lang/String;Lq83/d;)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeMetadata$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    invoke-direct {v1, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeMetadata$3;-><init>(Ljava/lang/Object;)V

    const/16 v7, 0x3c

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p2

    invoke-static/range {v0 .. v8}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public changeName(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeName$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeName$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Ljava/lang/String;Lq83/d;)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeName$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    invoke-direct {v1, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeName$3;-><init>(Ljava/lang/Object;)V

    const/16 v7, 0x3c

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p2

    invoke-static/range {v0 .. v8}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public changeSessionMetadata(Ljava/lang/String;Lcom/google/gson/JsonElement;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/gson/JsonElement;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sessionstore/SetSessionMetadataResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/signal/jsonrpc/models/HMSParams$SetSessionMetadata;

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v6}, Llive/hms/video/signal/jsonrpc/models/HMSParams$SetSessionMetadata;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Long;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeSessionMetadata$2;

    const/4 p1, 0x0

    invoke-direct {v1, p0, v0, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeSessionMetadata$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/jsonrpc/models/HMSParams$SetSessionMetadata;Lq83/d;)V

    new-instance v2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeSessionMetadata$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    invoke-direct {v2, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeSessionMetadata$3;-><init>(Ljava/lang/Object;)V

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p3

    invoke-static/range {v1 .. v9}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public changeTrackState(Llive/hms/video/media/tracks/HMSTrack;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/media/tracks/HMSTrack;",
            "Ljava/lang/String;",
            "Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeTrackState$2;

    const/4 v5, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v2, p2

    move v4, p3

    invoke-direct/range {v0 .. v5}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeTrackState$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Ljava/lang/String;Llive/hms/video/media/tracks/HMSTrack;ZLq83/d;)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeTrackState$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    invoke-direct {v1, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeTrackState$3;-><init>(Ljava/lang/Object;)V

    const/16 v7, 0x3c

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p4

    invoke-static/range {v0 .. v8}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    .line 2
    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public changeTrackState(ZLlive/hms/video/media/tracks/HMSTrackType;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Llive/hms/video/media/tracks/HMSTrackType;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 3
    new-instance v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeTrackState$5;

    const/4 v6, 0x0

    move-object v1, p0

    move v5, p1

    move-object v3, p2

    move-object v4, p3

    move-object v2, p4

    invoke-direct/range {v0 .. v6}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeTrackState$5;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Ljava/util/List;Llive/hms/video/media/tracks/HMSTrackType;Ljava/lang/String;ZLq83/d;)V

    .line 4
    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeTrackState$6;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    invoke-direct {v1, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeTrackState$6;-><init>(Ljava/lang/Object;)V

    const/16 v7, 0x3c

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p6

    .line 5
    invoke-static/range {v0 .. v8}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    .line 6
    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public close()V
    .locals 4

    const-string v0, "close: closing socket"

    const-string v1, "JsonRPCSignal"

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->socket:Lud3/e1;

    if-eqz v0, :cond_0

    const-string v2, "Closing"

    check-cast v0, Lle3/g;

    const/16 v3, 0x3e8

    invoke-virtual {v0, v3, v2}, Lle3/g;->b(ILjava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Llh1/a;

    const/16 v2, 0xc

    invoke-direct {v0, v2}, Llh1/a;-><init>(I)V

    :goto_0
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "Successfully closed"

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    const-string v0, "Could not close socket"

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    const/4 v0, 0x0

    iput-object v0, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->socket:Lud3/e1;

    return-void
.end method

.method public createPoll(Llive/hms/video/signal/jsonrpc/models/HMSParams$SetPollParams;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/signal/jsonrpc/models/HMSParams$SetPollParams;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/polls/network/PollCreateResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$createPoll$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$createPoll$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/jsonrpc/models/HMSParams$SetPollParams;Lq83/d;)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$createPoll$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    invoke-direct {v1, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$createPoll$3;-><init>(Ljava/lang/Object;)V

    const/16 v7, 0x3c

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p2

    invoke-static/range {v0 .. v8}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public createQuestion(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsSet;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsSet;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/polls/network/SetQuestionsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$createQuestion$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$createQuestion$1;

    iget v1, v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$createQuestion$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$createQuestion$1;->label:I

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_0
    new-instance v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$createQuestion$1;

    invoke-direct {v0, p0, p2}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$createQuestion$1;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v7, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$createQuestion$1;->result:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v7, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$createQuestion$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Params: "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Llive/hms/video/utils/ExtensionUtilsKt;->toJsonObject(Ljava/lang/Object;)Lcom/google/gson/JsonObject;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v1, "PollsSetQuestionz"

    invoke-static {v1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$createQuestion$result$1;

    const/4 p2, 0x0

    invoke-direct {v1, p0, p1, p2}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$createQuestion$result$1;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsSet;Lq83/d;)V

    move p1, v2

    new-instance v2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$createQuestion$result$2;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p2

    invoke-direct {v2, p2}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$createQuestion$result$2;-><init>(Ljava/lang/Object;)V

    iput p1, v7, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$createQuestion$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v8, 0x3c

    const/4 v9, 0x0

    invoke-static/range {v1 .. v9}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p2, Lcom/google/gson/JsonObject;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Setz: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "PollsSetQuestions"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Llive/hms/video/utils/GsonUtils;->INSTANCE:Llive/hms/video/utils/GsonUtils;

    invoke-virtual {p1}, Llive/hms/video/utils/GsonUtils;->getGson()Lcom/google/gson/Gson;

    move-result-object p1

    const-class v0, Llive/hms/video/polls/network/SetQuestionsResponse;

    invoke-virtual {p1, p2, v0}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "fromJson(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public createWhiteBoard(Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/whiteboard/network/HMSCreateWhiteBoardResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$createWhiteBoard$2;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object v0

    invoke-direct {v1, v0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$createWhiteBoard$2;-><init>(Ljava/lang/Object;)V

    new-instance v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$createWhiteBoard$3;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$createWhiteBoard$3;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;Lq83/d;)V

    const/16 v7, 0x1c

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p2

    invoke-static/range {v0 .. v8}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public endRoom(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$endRoom$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$endRoom$1;

    iget v1, v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$endRoom$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$endRoom$1;->label:I

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_0
    new-instance v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$endRoom$1;

    invoke-direct {v0, p0, p3}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$endRoom$1;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p3, v7, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$endRoom$1;->result:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v7, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$endRoom$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$endRoom$2;

    const/4 p3, 0x0

    invoke-direct {v1, p0, p2, p1, p3}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$endRoom$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;ZLjava/lang/String;Lq83/d;)V

    move p1, v2

    new-instance v2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$endRoom$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p2

    invoke-direct {v2, p2}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$endRoom$3;-><init>(Ljava/lang/Object;)V

    iput p1, v7, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$endRoom$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v8, 0x3c

    const/4 v9, 0x0

    invoke-static/range {v1 .. v9}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public event(Llive/hms/video/events/AnalyticsEvent;)V
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/signal/HMSSignalMethod;->ANALYTICS:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v1, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;->Companion:Llive/hms/video/signal/jsonrpc/models/HMSParams$Event$Companion;

    invoke-virtual {v1, p1}, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event$Companion;->from(Llive/hms/video/events/AnalyticsEvent;)Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->notify(Llive/hms/video/signal/HMSSignalMethod;Llive/hms/video/signal/jsonrpc/models/HMSParams;)V

    return-void
.end method

.method public findPeer(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ILq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;I",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sdk/models/FindPeerResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/signal/jsonrpc/models/HMSParams$FindPeer;

    invoke-direct {v0, p1, p2, p3, p4}, Llive/hms/video/signal/jsonrpc/models/HMSParams$FindPeer;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;I)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$findPeer$2;

    const/4 p1, 0x0

    invoke-direct {v1, p0, v0, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$findPeer$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/jsonrpc/models/HMSParams$FindPeer;Lq83/d;)V

    new-instance v2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$findPeer$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    invoke-direct {v2, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$findPeer$3;-><init>(Ljava/lang/Object;)V

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p5

    invoke-static/range {v1 .. v9}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getObserver()Llive/hms/video/signal/ISignalEventsObserver;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->observer:Llive/hms/video/signal/ISignalEventsObserver;

    return-object v0
.end method

.method public getSessionMetadata(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sessionstore/SessionMetadataResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$getSessionMetadata$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$getSessionMetadata$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Ljava/lang/String;Lq83/d;)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$getSessionMetadata$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    invoke-direct {v1, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$getSessionMetadata$3;-><init>(Ljava/lang/Object;)V

    const/16 v7, 0x3c

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p2

    invoke-static/range {v0 .. v8}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getWhiteBoard(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/whiteboard/network/HMSGetWhiteBoardResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$getWhiteBoard$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$getWhiteBoard$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Ljava/lang/String;Lq83/d;)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$getWhiteBoard$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    invoke-direct {v1, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$getWhiteBoard$3;-><init>(Ljava/lang/Object;)V

    const/16 v7, 0x3c

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p2

    invoke-static/range {v0 .. v8}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public groupAdd(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/signal/jsonrpc/models/HMSParams$GroupAdd;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v2, p1

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Llive/hms/video/signal/jsonrpc/models/HMSParams$GroupAdd;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$groupAdd$2;

    const/4 p1, 0x0

    invoke-direct {v1, p0, v0, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$groupAdd$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/jsonrpc/models/HMSParams$GroupAdd;Lq83/d;)V

    new-instance v2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$groupAdd$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    invoke-direct {v2, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$groupAdd$3;-><init>(Ljava/lang/Object;)V

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v7, p3

    invoke-static/range {v1 .. v9}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public groupJoin(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/groups/GroupJoinLeaveResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/signal/jsonrpc/models/HMSParams$GroupJoin;

    invoke-direct {v0, p1}, Llive/hms/video/signal/jsonrpc/models/HMSParams$GroupJoin;-><init>(Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$groupJoin$2;

    const/4 p1, 0x0

    invoke-direct {v1, p0, v0, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$groupJoin$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/jsonrpc/models/HMSParams$GroupJoin;Lq83/d;)V

    new-instance v2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$groupJoin$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    invoke-direct {v2, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$groupJoin$3;-><init>(Ljava/lang/Object;)V

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p2

    invoke-static/range {v1 .. v9}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public groupLeave(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/groups/GroupJoinLeaveResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/signal/jsonrpc/models/HMSParams$GroupLeave;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, p1, v2, v1, v2}, Llive/hms/video/signal/jsonrpc/models/HMSParams$GroupLeave;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$groupLeave$2;

    invoke-direct {v3, p0, v0, v2}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$groupLeave$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/jsonrpc/models/HMSParams$GroupLeave;Lq83/d;)V

    new-instance v4, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$groupLeave$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    invoke-direct {v4, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$groupLeave$3;-><init>(Ljava/lang/Object;)V

    const/16 v10, 0x3c

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v9, p2

    invoke-static/range {v3 .. v11}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public groupRemove(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/signal/jsonrpc/models/HMSParams$GroupRemove;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v2, p1

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Llive/hms/video/signal/jsonrpc/models/HMSParams$GroupRemove;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$groupRemove$2;

    const/4 p1, 0x0

    invoke-direct {v1, p0, v0, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$groupRemove$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/jsonrpc/models/HMSParams$GroupRemove;Lq83/d;)V

    new-instance v2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$groupRemove$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    invoke-direct {v2, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$groupRemove$3;-><init>(Ljava/lang/Object;)V

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v7, p3

    invoke-static/range {v1 .. v9}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public isConnected()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->_isConnected:Z

    return v0
.end method

.method public join(Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/connection/models/HMSSessionDescription;Llive/hms/video/sdk/models/IRetryAttemptTracking;ZLq83/d;)Ljava/lang/Object;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Llive/hms/video/connection/models/HMSSessionDescription;",
            "Llive/hms/video/sdk/models/IRetryAttemptTracking;",
            "Z",
            "Lq83/d<",
            "-",
            "Llive/hms/video/connection/models/HMSSessionDescription;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p7

    instance-of v2, v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$1;

    iget v3, v2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$1;->label:I

    :goto_0
    move-object v9, v2

    goto :goto_1

    :cond_0
    new-instance v2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$1;

    invoke-direct {v2, v0, v1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$1;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v1, v9, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$1;->result:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v9, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$1;->label:I

    const/4 v12, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v12, :cond_1

    iget-object v2, v9, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$1;->L$0:Ljava/lang/Object;

    check-cast v2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v13, Llive/hms/video/signal/jsonrpc/models/HMSParams$Join;

    const/16 v20, 0x8

    const/16 v21, 0x0

    const/16 v17, 0x0

    move-object/from16 v14, p1

    move-object/from16 v15, p2

    move/from16 v18, p3

    move-object/from16 v16, p4

    move/from16 v19, p6

    invoke-direct/range {v13 .. v21}, Llive/hms/video/signal/jsonrpc/models/HMSParams$Join;-><init>(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/connection/models/HMSSessionDescription;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$res$1;

    const/4 v1, 0x0

    invoke-direct {v3, v0, v13, v1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$res$1;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/jsonrpc/models/HMSParams$Join;Lq83/d;)V

    new-instance v4, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$res$2;

    invoke-virtual {v0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object v1

    invoke-direct {v4, v1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$res$2;-><init>(Ljava/lang/Object;)V

    sget-object v6, Llive/hms/video/sdk/models/EVENT_TYPE;->JOIN_RETRIES:Llive/hms/video/sdk/models/EVENT_TYPE;

    iput-object v0, v9, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$1;->L$0:Ljava/lang/Object;

    iput v12, v9, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$1;->label:I

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/16 v10, 0x24

    const/4 v11, 0x0

    move-object/from16 v7, p5

    invoke-static/range {v3 .. v11}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_3

    return-object v2

    :cond_3
    move-object v2, v0

    :goto_2
    check-cast v1, Llive/hms/video/connection/models/HMSSessionDescription;

    iput-boolean v12, v2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->isJoinCompleted:Z

    iget-object v3, v2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->pendingTrickle:Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Llive/hms/video/connection/models/HMSTrickle;

    invoke-virtual {v2, v4}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->trickle(Llive/hms/video/connection/models/HMSTrickle;)V

    goto :goto_3

    :cond_4
    iget-object v2, v2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->pendingTrickle:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    return-object v1
.end method

.method public leave(Z)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->isLeaveInProgress:Z

    if-eqz p1, :cond_0

    sget-object p1, Llive/hms/video/signal/HMSSignalMethod;->LEAVE:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Leave;

    const-string v1, "1.0"

    invoke-direct {v0, v1}, Llive/hms/video/signal/jsonrpc/models/HMSParams$Leave;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1, v0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->notify(Llive/hms/video/signal/HMSSignalMethod;Llive/hms/video/signal/jsonrpc/models/HMSParams;)V

    :cond_0
    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->close()V

    return-void
.end method

.method public offer(Llive/hms/video/connection/models/HMSSessionDescription;Ljava/util/List;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/connection/models/HMSSessionDescription;",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/HMSNotifications$Track;",
            ">;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/connection/models/HMSSessionDescription;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llive/hms/video/sdk/models/HMSNotifications$Track;

    invoke-virtual {p1}, Llive/hms/video/connection/models/HMSSessionDescription;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$Track;->getTrackId()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$Track;->getTrackId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    new-instance p2, Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;

    invoke-direct {p2, p1, v0, p3}, Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;-><init>(Llive/hms/video/connection/models/HMSSessionDescription;Ljava/util/HashMap;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$offer$2;

    const/4 p1, 0x0

    invoke-direct {v1, p0, p2, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$offer$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/jsonrpc/models/HMSParams$SendOffer;Lq83/d;)V

    new-instance v2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$offer$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    invoke-direct {v2, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$offer$3;-><init>(Ljava/lang/Object;)V

    const/16 v8, 0x38

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p4

    invoke-static/range {v1 .. v9}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public onClosed(Lud3/e1;ILjava/lang/String;)V
    .locals 1

    const-string v0, "webSocket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reason"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Llive/hms/video/signal/jsonrpc/HMSWebSocketListener;->onClosed(Lud3/e1;ILjava/lang/String;)V

    sget-object p1, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    const-string p2, "onClosed signal with reason = "

    invoke-virtual {p2, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "JsonRPCSignal"

    invoke-virtual {p1, p3, p2}, Llive/hms/video/utils/HMSLogger;->w(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->isLeaveInProgress:Z

    iput-boolean p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->_isConnected:Z

    return-void
.end method

.method public onFailure(Lud3/e1;Ljava/lang/Throwable;Lud3/x0;)V
    .locals 9

    const-string v0, "webSocket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "t"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    const-string v1, "JsonRPCSignal"

    const-string v2, "OnFailure of web socket"

    invoke-virtual {v0, v1, v2}, Llive/hms/video/utils/HMSLogger;->w(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->_isConnected:Z

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->onRoleChangeDeferred:Lbc3/s;

    check-cast v1, Lbc3/t1;

    invoke-virtual {v1}, Lbc3/t1;->isActive()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->onRoleChangeDeferred:Lbc3/s;

    check-cast v1, Lbc3/t;

    invoke-virtual {v1, p2}, Lbc3/t;->completeExceptionally(Ljava/lang/Throwable;)Z

    :cond_0
    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object v1

    iput-object v1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->onRoleChangeDeferred:Lbc3/s;

    iget-boolean v1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->isLeaveInProgress:Z

    if-eqz v1, :cond_1

    iput-boolean v0, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->isLeaveInProgress:Z

    return-void

    :cond_1
    invoke-super {p0, p1, p2, p3}, Llive/hms/video/signal/jsonrpc/HMSWebSocketListener;->onFailure(Lud3/e1;Ljava/lang/Throwable;Lud3/x0;)V

    sget-object v2, Llive/hms/video/error/ErrorFactory$WebSocketConnectionErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$WebSocketConnectionErrors;

    sget-object v3, Llive/hms/video/error/ErrorFactory$Action;->NONE:Llive/hms/video/error/ErrorFactory$Action;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    const-string p1, "WebSocket Disconnected"

    :cond_2
    move-object v4, p1

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v5, p2

    invoke-static/range {v2 .. v8}, Llive/hms/video/error/ErrorFactory$WebSocketConnectionErrors;->WebSocketConnectionLost$default(Llive/hms/video/error/ErrorFactory$WebSocketConnectionErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object p1

    move-object v4, v5

    if-eqz p3, :cond_5

    iget v1, p3, Lud3/x0;->z:I

    const/16 p2, 0x191

    if-eq v1, p2, :cond_3

    const/16 p2, 0x193

    if-ne v1, p2, :cond_5

    :cond_3
    sget-object v0, Llive/hms/video/error/ErrorFactory$APIErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$APIErrors;

    sget-object v2, Llive/hms/video/error/ErrorFactory$Action;->INIT:Llive/hms/video/error/ErrorFactory$Action;

    iget-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->socket:Lud3/e1;

    if-eqz p1, :cond_4

    check-cast p1, Lle3/g;

    iget-object p1, p1, Lle3/g;->a:Lud3/o0;

    if-eqz p1, :cond_4

    iget-object p1, p1, Lud3/o0;->a:Lud3/e0;

    goto :goto_0

    :cond_4
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ll83/k;

    const-string v3, "endpoint"

    invoke-direct {p2, v3, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget p1, p3, Lud3/x0;->z:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance v3, Ll83/k;

    const-string v5, "response_code"

    invoke-direct {v3, v5, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p3}, Lud3/x0;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p3, Ll83/k;

    const-string v5, "response"

    invoke-direct {p3, v5, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {p2, v3, p3}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->V([Ll83/k;)Ljava/util/HashMap;

    move-result-object v5

    const-string v3, "Token Not Authorized"

    invoke-virtual/range {v0 .. v5}, Llive/hms/video/error/ErrorFactory$APIErrors;->HTTPError(ILlive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;)Llive/hms/video/error/HMSException;

    move-result-object p1

    :cond_5
    iget-object p2, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->webSocketOpenDeferred:Lbc3/s;

    check-cast p2, Lbc3/t1;

    invoke-virtual {p2}, Lbc3/t1;->isCompleted()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p2

    invoke-interface {p2, p1}, Llive/hms/video/signal/ISignalEventsObserver;->onFailure(Llive/hms/video/error/HMSException;)V

    return-void

    :cond_6
    iget-object p2, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->webSocketOpenDeferred:Lbc3/s;

    check-cast p2, Lbc3/t;

    invoke-virtual {p2, p1}, Lbc3/t;->completeExceptionally(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public onMessage(Lud3/e1;Ljava/lang/String;)V
    .locals 11

    const-string v0, "webSocket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Llive/hms/video/signal/jsonrpc/HMSWebSocketListener;->onMessage(Lud3/e1;Ljava/lang/String;)V

    sget-object p1, Llive/hms/video/utils/GsonUtils;->INSTANCE:Llive/hms/video/utils/GsonUtils;

    invoke-virtual {p1}, Llive/hms/video/utils/GsonUtils;->getGson()Lcom/google/gson/Gson;

    move-result-object p1

    const-class v0, Lcom/google/gson/JsonObject;

    invoke-virtual {p1, p2, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/gson/JsonObject;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "message on ws : "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "JsonRPCSignal"

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-virtual {p1, v0}, Lcom/google/gson/JsonObject;->has(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x2

    const-string v4, "] "

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    invoke-virtual {p1, v0}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->callbacks:Ljava/util/HashMap;

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->callbacks:Ljava/util/HashMap;

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;

    const-string v2, "result"

    invoke-virtual {p1, v2}, Lcom/google/gson/JsonObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;->getDeferred()Lbc3/s;

    move-result-object p2

    invoke-virtual {p1, v2}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "toString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lbc3/t;

    invoke-virtual {p2, p1}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    return-void

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Server Side Error: [size="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "error"

    invoke-virtual {p1, p2}, Lcom/google/gson/JsonObject;->getAsJsonObject(Ljava/lang/String;)Lcom/google/gson/JsonObject;

    move-result-object p1

    sget-object v1, Llive/hms/video/error/ErrorFactory$WebsocketMethodErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$WebsocketMethodErrors;

    const-string p2, "code"

    invoke-virtual {p1, p2}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/gson/JsonElement;->getAsInt()I

    move-result v2

    invoke-virtual {v0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;->getMethod()Llive/hms/video/signal/HMSSignalMethod;

    move-result-object p2

    invoke-virtual {p2}, Llive/hms/video/signal/HMSSignalMethod;->toErrorAction()Llive/hms/video/error/ErrorFactory$Action;

    move-result-object v3

    const-string p2, "message"

    invoke-virtual {p1, p2}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v4

    const-string p1, "getAsString(...)"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Llive/hms/video/error/ErrorFactory$WebsocketMethodErrors;->ServerErrors$default(Llive/hms/video/error/ErrorFactory$WebsocketMethodErrors;ILlive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object p1

    invoke-virtual {v0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;->getDeferred()Lbc3/s;

    move-result-object p2

    check-cast p2, Lbc3/t;

    invoke-virtual {p2, p1}, Lbc3/t;->completeExceptionally(Ljava/lang/Throwable;)Z

    return-void

    :cond_1
    sget-object p2, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    invoke-static {v1}, Llive/hms/video/utils/CoroutineExceptionTrackerKt;->exceptionSurfacer(Ljava/lang/String;)Lkotlinx/coroutines/CoroutineExceptionHandler;

    move-result-object v0

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$1;

    invoke-direct {v1, p0, p1, v5}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$1;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Lcom/google/gson/JsonObject;Lq83/d;)V

    invoke-static {p2, v0, v5, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_2
    const-string v0, "method"

    invoke-virtual {p1, v0}, Lcom/google/gson/JsonObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-virtual {p1, v0}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v2

    const-string v6, "on-policy-change"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    iget-object v7, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->onRoleChangeDeferred:Lbc3/s;

    check-cast v7, Lbc3/t1;

    invoke-virtual {v7}, Lbc3/t1;->isCompleted()Z

    move-result v7

    if-nez v7, :cond_3

    iget-object v7, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->onRoleChangeDeferred:Lbc3/s;

    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    check-cast v7, Lbc3/t;

    invoke-virtual {v7, v8}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    :cond_3
    sget-object v7, Llive/hms/video/signal/HMSSignalMethod;->Companion:Llive/hms/video/signal/HMSSignalMethod$Companion;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v7, v2}, Llive/hms/video/signal/HMSSignalMethod$Companion;->from(Ljava/lang/String;)Llive/hms/video/signal/HMSSignalMethod;

    move-result-object v2

    sget-object v7, Llive/hms/video/signal/HMSSignalMethod;->SDK_NOTIFICATION:Llive/hms/video/signal/HMSSignalMethod;

    const-string v8, "Ignoring unsupported notification: "

    const-string v9, "getAsJsonObject(...)"

    const-string v10, "params"

    if-ne v2, v7, :cond_9

    invoke-virtual {p1, v0}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_4
    move-object p2, v5

    :goto_0
    if-nez p2, :cond_5

    sget-object p2, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Ignoring notification with no method: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v1, p1}, Llive/hms/video/utils/HMSLogger;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_5
    sget-object v0, Llive/hms/video/sdk/models/HMSNotifications;->Companion:Llive/hms/video/sdk/models/HMSNotifications$Companion;

    invoke-virtual {p1, v10}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object v2

    invoke-static {v2, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p2, v2}, Llive/hms/video/sdk/models/HMSNotifications$Companion;->from(Ljava/lang/String;Lcom/google/gson/JsonObject;)Llive/hms/video/sdk/models/HMSNotifications;

    move-result-object v0

    instance-of v0, v0, Llive/hms/video/sdk/models/HMSNotifications$Unsupported;

    if-eqz v0, :cond_6

    sget-object p2, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v1, p1}, Llive/hms/video/utils/HMSLogger;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_6
    const-string v0, "node-info"

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-virtual {p2, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_1

    :cond_7
    sget-object p2, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    invoke-static {v1}, Llive/hms/video/utils/CoroutineExceptionTrackerKt;->exceptionSurfacer(Ljava/lang/String;)Lkotlinx/coroutines/CoroutineExceptionHandler;

    move-result-object v0

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$3;

    invoke-direct {v1, p0, p1, v5}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$3;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Lcom/google/gson/JsonObject;Lq83/d;)V

    invoke-static {p2, v0, v5, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_8
    :goto_1
    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    invoke-static {v1}, Llive/hms/video/utils/CoroutineExceptionTrackerKt;->exceptionSurfacer(Ljava/lang/String;)Lkotlinx/coroutines/CoroutineExceptionHandler;

    move-result-object v1

    new-instance v2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;

    invoke-direct {v2, p0, p2, p1, v5}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Ljava/lang/String;Lcom/google/gson/JsonObject;Lq83/d;)V

    invoke-static {v0, v1, v5, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_9
    sget-object v0, Llive/hms/video/signal/jsonrpc/models/HMSParams;->Companion:Llive/hms/video/signal/jsonrpc/models/HMSParams$Companion;

    invoke-virtual {p1, v10}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object v6

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2, v6}, Llive/hms/video/signal/jsonrpc/models/HMSParams$Companion;->fromReceivedParams(Llive/hms/video/signal/HMSSignalMethod;Lcom/google/gson/JsonObject;)Llive/hms/video/signal/jsonrpc/models/HMSParams;

    move-result-object v0

    instance-of v6, v0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Unsupported;

    if-eqz v6, :cond_a

    sget-object p2, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v10}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v1, p1}, Llive/hms/video/utils/HMSLogger;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_a
    sget-object p1, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "[method="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, "] Received params="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v1, v6}, Llive/hms/video/utils/HMSLogger;->v(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v6, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v6, v6, v7

    const/4 v7, 0x1

    const/4 v8, 0x3

    if-eq v6, v7, :cond_d

    if-eq v6, v3, :cond_c

    if-eq v6, v8, :cond_b

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Received unknown "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " message from server, [size="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v1, p2}, Llive/hms/video/utils/HMSLogger;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_b
    sget-object p1, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance p2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$6;

    invoke-direct {p2, v0, p0, v2, v5}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$6;-><init>(Llive/hms/video/signal/jsonrpc/models/HMSParams;Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/HMSSignalMethod;Lq83/d;)V

    invoke-static {p1, v5, v5, p2, v8}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_c
    sget-object p1, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance p2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$5;

    invoke-direct {p2, p0, v0, v5}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$5;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/jsonrpc/models/HMSParams;Lq83/d;)V

    invoke-static {p1, v5, v5, p2, v8}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_d
    sget-object p1, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance p2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$4;

    invoke-direct {p2, p0, v0, v5}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$4;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/jsonrpc/models/HMSParams;Lq83/d;)V

    invoke-static {p1, v5, v5, p2, v8}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_e
    sget-object p2, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "WebSocket message has no `method` or `id` field, message="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v1, p1}, Llive/hms/video/utils/HMSLogger;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onOpen(Lud3/e1;Lud3/x0;)V
    .locals 1

    const-string v0, "webSocket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "response"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Llive/hms/video/signal/jsonrpc/HMSWebSocketListener;->onOpen(Lud3/e1;Lud3/x0;)V

    iget-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->webSocketOpenDeferred:Lbc3/s;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    check-cast p1, Lbc3/t;

    invoke-virtual {p1, p2}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    return-void
.end method

.method public open(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$open$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$open$1;

    iget v1, v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$open$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$open$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$open$1;

    invoke-direct {v0, p0, p2}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$open$1;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$open$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$open$1;->label:I

    const-string v3, "JsonRPCSignal"

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$open$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v0, v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$open$1;->L$0:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v2, "open: Connecting WebSocket to endpoint="

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " \u23f0"

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v3, p2}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->webSocketOpenDeferred:Lbc3/s;

    check-cast p2, Lbc3/t1;

    invoke-virtual {p2}, Lbc3/t1;->isCompleted()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object p2

    iput-object p2, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->webSocketOpenDeferred:Lbc3/s;

    :cond_3
    sget-object p2, Llive/hms/video/factories/OkHttpFactory;->INSTANCE:Llive/hms/video/factories/OkHttpFactory;

    invoke-virtual {p2, p1, p0}, Llive/hms/video/factories/OkHttpFactory;->makeWebSocket(Ljava/lang/String;Lud3/f1;)Lud3/e1;

    move-result-object p2

    iput-object p2, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->socket:Lud3/e1;

    iget-object p2, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->webSocketOpenDeferred:Lbc3/s;

    iput-object p0, v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$open$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$open$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$open$1;->label:I

    check-cast p2, Lbc3/t;

    invoke-virtual {p2, v0}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v0, p0

    :goto_1
    iput-boolean v4, v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->_isConnected:Z

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "open: WebSocket connected to endpoint="

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " \u2705"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public peerIteratorNext(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sdk/models/FindPeerResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PeerIteratorNext;

    invoke-direct {v0, p1, p2}, Llive/hms/video/signal/jsonrpc/models/HMSParams$PeerIteratorNext;-><init>(Ljava/lang/String;I)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$peerIteratorNext$2;

    const/4 p1, 0x0

    invoke-direct {v1, p0, v0, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$peerIteratorNext$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/jsonrpc/models/HMSParams$PeerIteratorNext;Lq83/d;)V

    new-instance v2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$peerIteratorNext$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    invoke-direct {v2, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$peerIteratorNext$3;-><init>(Ljava/lang/Object;)V

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p3

    invoke-static/range {v1 .. v9}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public peerNameSearch(Ljava/lang/String;IJLq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "IJ",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sdk/models/PeerNameSearchResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PeerNameSearch;

    invoke-direct {v0, p1, p2, p3, p4}, Llive/hms/video/signal/jsonrpc/models/HMSParams$PeerNameSearch;-><init>(Ljava/lang/String;IJ)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$peerNameSearch$2;

    const/4 p1, 0x0

    invoke-direct {v1, p0, v0, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$peerNameSearch$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/jsonrpc/models/HMSParams$PeerNameSearch;Lq83/d;)V

    new-instance v2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$peerNameSearch$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    invoke-direct {v2, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$peerNameSearch$3;-><init>(Ljava/lang/Object;)V

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p5

    invoke-static/range {v1 .. v9}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public pollAddResponse(Llive/hms/video/polls/HMSPollResponseBuilder;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/polls/HMSPollResponseBuilder;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/polls/models/answer/PollAnswerResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponseSet;

    invoke-virtual {p1}, Llive/hms/video/polls/HMSPollResponseBuilder;->getHmsPoll()Llive/hms/video/polls/models/HmsPoll;

    move-result-object v1

    invoke-virtual {v1}, Llive/hms/video/polls/models/HmsPoll;->getPollId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Llive/hms/video/polls/HMSPollResponseBuilder;->getAllAnswers$lib_release()Ljava/util/List;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponseSet;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollAddResponse$2;

    const/4 p1, 0x0

    invoke-direct {v1, p0, v0, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollAddResponse$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponseSet;Lq83/d;)V

    new-instance v2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollAddResponse$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    invoke-direct {v2, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollAddResponse$3;-><init>(Ljava/lang/Object;)V

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v7, p2

    invoke-static/range {v1 .. v9}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public pollGetLeaderboard(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollLeaderboardQuery;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollLeaderboardQuery;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/polls/network/PollLeaderboardResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetLeaderboard$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetLeaderboard$1;

    iget v1, v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetLeaderboard$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetLeaderboard$1;->label:I

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_0
    new-instance v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetLeaderboard$1;

    invoke-direct {v0, p0, p2}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetLeaderboard$1;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v7, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetLeaderboard$1;->result:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v7, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetLeaderboard$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetLeaderboard$r$1;

    const/4 p2, 0x0

    invoke-direct {v1, p0, p1, p2}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetLeaderboard$r$1;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/jsonrpc/models/HMSParams$PollLeaderboardQuery;Lq83/d;)V

    move p1, v2

    new-instance v2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetLeaderboard$r$2;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p2

    invoke-direct {v2, p2}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetLeaderboard$r$2;-><init>(Ljava/lang/Object;)V

    iput p1, v7, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetLeaderboard$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v8, 0x3c

    const/4 v9, 0x0

    invoke-static/range {v1 .. v9}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p2, Lcom/google/gson/JsonObject;

    sget-object p1, Llive/hms/video/utils/GsonUtils;->INSTANCE:Llive/hms/video/utils/GsonUtils;

    invoke-virtual {p1}, Llive/hms/video/utils/GsonUtils;->getGson()Lcom/google/gson/Gson;

    move-result-object p1

    const-class v0, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;

    invoke-virtual {p1, p2, v0}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;

    invoke-virtual {p1}, Llive/hms/video/polls/network/HMSPollLeaderboardResponse;->mapToPollLeaderboardResponse()Llive/hms/video/polls/network/PollLeaderboardResponse;

    move-result-object p1

    return-object p1
.end method

.method public pollGetList(Llive/hms/video/polls/models/HmsPollState;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/polls/models/HmsPollState;",
            "I",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/polls/network/PollListResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v3, p1

    move v1, p2

    move-object v2, p3

    invoke-direct/range {v0 .. v6}, Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;-><init>(ILjava/lang/String;Llive/hms/video/polls/models/HmsPollState;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetList$2;

    const/4 p1, 0x0

    invoke-direct {v1, p0, v0, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetList$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/jsonrpc/models/HMSParams$PollListQuery;Lq83/d;)V

    new-instance v2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetList$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    invoke-direct {v2, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetList$3;-><init>(Ljava/lang/Object;)V

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p4

    invoke-static/range {v1 .. v9}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public pollGetResponses(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/polls/network/PollGetResponsesReply;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetResponses$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetResponses$1;

    iget v1, v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetResponses$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetResponses$1;->label:I

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_0
    new-instance v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetResponses$1;

    invoke-direct {v0, p0, p2}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetResponses$1;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v7, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetResponses$1;->result:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v7, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetResponses$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetResponses$2;

    const/4 p2, 0x0

    invoke-direct {v1, p0, p1, p2}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetResponses$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;Lq83/d;)V

    move p1, v2

    new-instance v2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetResponses$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p2

    invoke-direct {v2, p2}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetResponses$3;-><init>(Ljava/lang/Object;)V

    iput p1, v7, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetResponses$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v8, 0x3c

    const/4 v9, 0x0

    invoke-static/range {v1 .. v9}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p2, Lcom/google/gson/JsonObject;

    const-string p1, "PrintingResponses"

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Llive/hms/video/utils/GsonUtils;->INSTANCE:Llive/hms/video/utils/GsonUtils;

    invoke-virtual {p1}, Llive/hms/video/utils/GsonUtils;->getGson()Lcom/google/gson/Gson;

    move-result-object p1

    const-class v0, Llive/hms/video/polls/network/PollGetResponsesReply;

    invoke-virtual {p1, p2, v0}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llive/hms/video/polls/network/PollGetResponsesReply;

    const-string p2, "let(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public pollGetResults(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/polls/network/PollResultsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetResults$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetResults$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Ljava/lang/String;Lq83/d;)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetResults$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    invoke-direct {v1, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollGetResults$3;-><init>(Ljava/lang/Object;)V

    const/16 v7, 0x3c

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p2

    invoke-static/range {v0 .. v8}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public pollQuestionsGet(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsGet;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsGet;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/polls/network/PollQuestionGetResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollQuestionsGet$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollQuestionsGet$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsGet;Lq83/d;)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollQuestionsGet$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    invoke-direct {v1, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollQuestionsGet$3;-><init>(Ljava/lang/Object;)V

    const/16 v7, 0x3c

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p2

    invoke-static/range {v0 .. v8}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public pollStart(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollStart$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollStart$1;

    iget v1, v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollStart$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollStart$1;->label:I

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_0
    new-instance v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollStart$1;

    invoke-direct {v0, p0, p2}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollStart$1;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v7, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollStart$1;->result:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v7, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollStart$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p2, "PollStart"

    const-string v1, "starting"

    invoke-static {p2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollStart$result$1;

    const/4 p2, 0x0

    invoke-direct {v1, p0, p1, p2}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollStart$result$1;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Ljava/lang/String;Lq83/d;)V

    move p1, v2

    new-instance v2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollStart$result$2;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p2

    invoke-direct {v2, p2}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollStart$result$2;-><init>(Ljava/lang/Object;)V

    iput p1, v7, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollStart$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v8, 0x3c

    const/4 v9, 0x0

    invoke-static/range {v1 .. v9}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p2, Lcom/google/gson/JsonObject;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Start: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "WebsocketMessageZ"

    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public pollStop(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollStop$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollStop$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Ljava/lang/String;Lq83/d;)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollStop$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    invoke-direct {v1, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$pollStop$3;-><init>(Ljava/lang/Object;)V

    const/16 v7, 0x3c

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p2

    invoke-static/range {v0 .. v8}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public removePeer(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$removePeer$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$removePeer$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$removePeer$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    invoke-direct {v1, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$removePeer$3;-><init>(Ljava/lang/Object;)V

    const/16 v7, 0x3c

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p3

    invoke-static/range {v0 .. v8}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public roleChangeAccept(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Llive/hms/video/sdk/models/HMSPeer;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$roleChangeAccept$2;

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$roleChangeAccept$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Lq83/d;)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$roleChangeAccept$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    invoke-direct {v1, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$roleChangeAccept$3;-><init>(Ljava/lang/Object;)V

    const/16 v7, 0x3c

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p4

    invoke-static/range {v0 .. v8}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public roleChangeRequest(Ljava/lang/String;ZLjava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$roleChangeRequest$2;

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$roleChangeRequest$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Ljava/lang/String;ZLjava/lang/String;Lq83/d;)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$roleChangeRequest$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    invoke-direct {v1, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$roleChangeRequest$3;-><init>(Ljava/lang/Object;)V

    const/16 v7, 0x3c

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p4

    invoke-static/range {v0 .. v8}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public sendMessage(Llive/hms/video/signal/jsonrpc/models/HMSParams;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/signal/jsonrpc/models/HMSParams;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sdk/models/HMSMessageSendResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$sendMessage$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$sendMessage$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/jsonrpc/models/HMSParams;Lq83/d;)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$sendMessage$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    invoke-direct {v1, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$sendMessage$3;-><init>(Ljava/lang/Object;)V

    const/16 v7, 0x3c

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p2

    invoke-static/range {v0 .. v8}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public setHlsSessionMetadata(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/HMSHLSTimedMetadata;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$setHlsSessionMetadata$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$setHlsSessionMetadata$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Ljava/util/List;Lq83/d;)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$setHlsSessionMetadata$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    invoke-direct {v1, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$setHlsSessionMetadata$3;-><init>(Ljava/lang/Object;)V

    const/16 v7, 0x3c

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p2

    invoke-static/range {v0 .. v8}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public setMetadataListener(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sessionstore/SetMetadataListenerResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/signal/jsonrpc/models/HMSParams$ListenMetadataChangeRequest;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, p1, v2, v1, v2}, Llive/hms/video/signal/jsonrpc/models/HMSParams$ListenMetadataChangeRequest;-><init>(Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$setMetadataListener$2;

    invoke-direct {v3, p0, v0, v2}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$setMetadataListener$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/jsonrpc/models/HMSParams$ListenMetadataChangeRequest;Lq83/d;)V

    new-instance v4, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$setMetadataListener$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    invoke-direct {v4, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$setMetadataListener$3;-><init>(Ljava/lang/Object;)V

    const/16 v10, 0x3c

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v9, p2

    invoke-static/range {v3 .. v11}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public startHLSStreaming(Llive/hms/video/sdk/models/HMSHLSConfig;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/HMSHLSConfig;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$startHLSStreaming$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$startHLSStreaming$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/sdk/models/HMSHLSConfig;Lq83/d;)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$startHLSStreaming$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    invoke-direct {v1, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$startHLSStreaming$3;-><init>(Ljava/lang/Object;)V

    const/16 v7, 0x3c

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p2

    invoke-static/range {v0 .. v8}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public startRealTimeTranscription(Llive/hms/video/sdk/models/TranscriptionsMode;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/TranscriptionsMode;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/signal/jsonrpc/models/HMSParams$StartTranscription;

    invoke-direct {v0, p1}, Llive/hms/video/signal/jsonrpc/models/HMSParams$StartTranscription;-><init>(Llive/hms/video/sdk/models/TranscriptionsMode;)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$startRealTimeTranscription$2;

    const/4 p1, 0x0

    invoke-direct {v1, p0, v0, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$startRealTimeTranscription$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/jsonrpc/models/HMSParams$StartTranscription;Lq83/d;)V

    new-instance v2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$startRealTimeTranscription$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    invoke-direct {v2, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$startRealTimeTranscription$3;-><init>(Ljava/lang/Object;)V

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p2

    invoke-static/range {v1 .. v9}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public startRtmpOrRecording(Llive/hms/video/sdk/models/HMSRecordingConfig;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/HMSRecordingConfig;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$startRtmpOrRecording$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$startRtmpOrRecording$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/sdk/models/HMSRecordingConfig;Lq83/d;)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$startRtmpOrRecording$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    invoke-direct {v1, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$startRtmpOrRecording$3;-><init>(Ljava/lang/Object;)V

    const/16 v7, 0x3c

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p2

    invoke-static/range {v0 .. v8}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public stopHLSStreaming(Llive/hms/video/sdk/models/HMSHLSConfig;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/HMSHLSConfig;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$stopHLSStreaming$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$stopHLSStreaming$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/sdk/models/HMSHLSConfig;Lq83/d;)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$stopHLSStreaming$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    invoke-direct {v1, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$stopHLSStreaming$3;-><init>(Ljava/lang/Object;)V

    const/16 v7, 0x3c

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p2

    invoke-static/range {v0 .. v8}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public stopRealTimeTranscription(Llive/hms/video/sdk/models/TranscriptionsMode;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/TranscriptionsMode;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/signal/jsonrpc/models/HMSParams$StopTranscription;

    invoke-direct {v0, p1}, Llive/hms/video/signal/jsonrpc/models/HMSParams$StopTranscription;-><init>(Llive/hms/video/sdk/models/TranscriptionsMode;)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$stopRealTimeTranscription$2;

    const/4 p1, 0x0

    invoke-direct {v1, p0, v0, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$stopRealTimeTranscription$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/jsonrpc/models/HMSParams$StopTranscription;Lq83/d;)V

    new-instance v2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$stopRealTimeTranscription$3;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    invoke-direct {v2, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$stopRealTimeTranscription$3;-><init>(Ljava/lang/Object;)V

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p2

    invoke-static/range {v1 .. v9}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public stopRtmpAndRecording(Lq83/d;)Ljava/lang/Object;
    .locals 10
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

    instance-of v0, p1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$stopRtmpAndRecording$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$stopRtmpAndRecording$1;

    iget v1, v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$stopRtmpAndRecording$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$stopRtmpAndRecording$1;->label:I

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_0
    new-instance v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$stopRtmpAndRecording$1;

    invoke-direct {v0, p0, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$stopRtmpAndRecording$1;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v7, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$stopRtmpAndRecording$1;->result:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v7, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$stopRtmpAndRecording$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$stopRtmpAndRecording$result$1;

    const/4 p1, 0x0

    invoke-direct {v1, p0, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$stopRtmpAndRecording$result$1;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Lq83/d;)V

    move p1, v2

    new-instance v2, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$stopRtmpAndRecording$result$2;

    invoke-virtual {p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object v3

    invoke-direct {v2, v3}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$stopRtmpAndRecording$result$2;-><init>(Ljava/lang/Object;)V

    iput p1, v7, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$stopRtmpAndRecording$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v8, 0x3c

    const/4 v9, 0x0

    invoke-static/range {v1 .. v9}, Llive/hms/video/utils/ExtensionUtilsKt;->withRetry$default(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p1, Lorg/json/JSONObject;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Result was "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "JsonRPCSignal"

    invoke-static {v0, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public trackUpdate(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/HMSNotifications$Track;",
            ">;)V"
        }
    .end annotation

    const-string v0, "tracks"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llive/hms/video/sdk/models/HMSNotifications$Track;

    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSNotifications$Track;->getTrackId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$TrackUpdate;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, v0, v2, v1, v2}, Llive/hms/video/signal/jsonrpc/models/HMSParams$TrackUpdate;-><init>(Ljava/util/HashMap;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v0, Llive/hms/video/signal/HMSSignalMethod;->TRACK_UPDATE:Llive/hms/video/signal/HMSSignalMethod;

    invoke-direct {p0, v0, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->notify(Llive/hms/video/signal/HMSSignalMethod;Llive/hms/video/signal/jsonrpc/models/HMSParams;)V

    return-void
.end method

.method public trickle(Llive/hms/video/connection/models/HMSTrickle;)V
    .locals 2

    const-string v0, "trickle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->isJoinCompleted:Z

    if-eqz v0, :cond_0

    sget-object v0, Llive/hms/video/signal/HMSSignalMethod;->TRICKLE:Llive/hms/video/signal/HMSSignalMethod;

    sget-object v1, Llive/hms/video/signal/jsonrpc/models/HMSParams$Trickle;->Companion:Llive/hms/video/signal/jsonrpc/models/HMSParams$Trickle$Companion;

    invoke-virtual {v1, p1}, Llive/hms/video/signal/jsonrpc/models/HMSParams$Trickle$Companion;->from(Llive/hms/video/connection/models/HMSTrickle;)Llive/hms/video/signal/jsonrpc/models/HMSParams$Trickle;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->notify(Llive/hms/video/signal/HMSSignalMethod;Llive/hms/video/signal/jsonrpc/models/HMSParams;)V

    return-void

    :cond_0
    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->pendingTrickle:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
