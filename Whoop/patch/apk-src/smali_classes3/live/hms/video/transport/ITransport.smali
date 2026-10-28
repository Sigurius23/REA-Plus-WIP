.class public interface abstract Llive/hms/video/transport/ITransport;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/transport/ITransport$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ca\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0003\u0010\u0004JZ\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u00a6@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012JV\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00052\u0008\u0008\u0002\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0016\u0008\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0018H\u00a6@\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJK\u0010#\u001a\u00020\u00102\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\u0008\u0002\u0010\"\u001a\u0004\u0018\u00010\u0005H&\u00a2\u0006\u0004\u0008#\u0010$J\u000f\u0010%\u001a\u00020\nH&\u00a2\u0006\u0004\u0008%\u0010&J\u0018\u0010(\u001a\u00020\u00102\u0006\u0010\'\u001a\u00020\nH\u00a6@\u00a2\u0006\u0004\u0008(\u0010)J(\u0010-\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\nH\u00a6@\u00a2\u0006\u0004\u0008-\u0010.J*\u00100\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u00052\u0008\u0010/\u001a\u0004\u0018\u00010\u001eH\u00a6@\u00a2\u0006\u0004\u00080\u00101J*\u00109\u001a\u0004\u0018\u0001082\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u00a6@\u00a2\u0006\u0004\u00089\u0010:J\u000f\u0010;\u001a\u00020\u0010H&\u00a2\u0006\u0004\u0008;\u0010<J6\u0010A\u001a\u0004\u0018\u0001082\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042\u0008\u0010>\u001a\u0004\u0018\u00010=2\u0008\u0010@\u001a\u0004\u0018\u00010?H\u00a6@\u00a2\u0006\u0004\u0008A\u0010BJ3\u0010F\u001a\u00020E2\u0006\u00103\u001a\u0002022\u0008\u0010>\u001a\u0004\u0018\u00010=2\u0006\u0010D\u001a\u00020C2\u0008\u0010@\u001a\u0004\u0018\u00010?H&\u00a2\u0006\u0004\u0008F\u0010GJ\u0017\u0010H\u001a\u00020\u00102\u0006\u0010D\u001a\u00020CH&\u00a2\u0006\u0004\u0008H\u0010IJ\u0018\u0010K\u001a\u00020\u00102\u0006\u0010J\u001a\u000208H\u00a6@\u00a2\u0006\u0004\u0008K\u0010LJ\u0010\u0010M\u001a\u00020\u0010H\u00a6@\u00a2\u0006\u0004\u0008M\u0010NJ$\u0010R\u001a\u0008\u0012\u0004\u0012\u0002080Q2\u000c\u0010P\u001a\u0008\u0012\u0004\u0012\u0002080OH\u00a6@\u00a2\u0006\u0004\u0008R\u0010SJ\u001e\u0010T\u001a\u00020\u00102\u000c\u0010P\u001a\u0008\u0012\u0004\u0012\u0002080OH\u00a6@\u00a2\u0006\u0004\u0008T\u0010SJ\u0018\u0010X\u001a\u00020W2\u0006\u0010V\u001a\u00020UH\u00a6@\u00a2\u0006\u0004\u0008X\u0010YJ\u0012\u0010[\u001a\u0004\u0018\u00010ZH\u00a6@\u00a2\u0006\u0004\u0008[\u0010NJ\u0012\u0010\\\u001a\u0004\u0018\u00010ZH\u00a6@\u00a2\u0006\u0004\u0008\\\u0010NJ \u0010^\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010]\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0004\u0008^\u0010_J \u0010a\u001a\u00020\n2\u0006\u0010]\u001a\u00020\u00052\u0006\u0010`\u001a\u00020\nH\u00a6@\u00a2\u0006\u0004\u0008a\u0010bJ(\u0010e\u001a\u00020\u00102\u0006\u0010c\u001a\u0002082\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010d\u001a\u00020\nH\u00a6@\u00a2\u0006\u0004\u0008e\u0010fJD\u0010e\u001a\u00020\u00102\u0006\u0010d\u001a\u00020\n2\u0008\u0010g\u001a\u0004\u0018\u0001062\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u000e\u0010h\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010Q2\u0006\u0010/\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0004\u0008e\u0010iJ\u0018\u0010l\u001a\u00020\u00102\u0006\u0010k\u001a\u00020jH\u00a6@\u00a2\u0006\u0004\u0008l\u0010mJ\u001a\u0010o\u001a\u00020\u00102\u0008\u0010k\u001a\u0004\u0018\u00010nH\u00a6@\u00a2\u0006\u0004\u0008o\u0010pJ\u001a\u0010q\u001a\u00020\u00102\u0008\u0010k\u001a\u0004\u0018\u00010nH\u00a6@\u00a2\u0006\u0004\u0008q\u0010pJ\u0010\u0010r\u001a\u00020\u0010H\u00a6@\u00a2\u0006\u0004\u0008r\u0010NJ\u0018\u0010t\u001a\u00020\u00102\u0006\u0010s\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0004\u0008t\u0010uJ\u0018\u0010w\u001a\u00020\u00102\u0006\u0010v\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0004\u0008w\u0010uJ\u001a\u0010z\u001a\u00020y2\u0008\u0010x\u001a\u0004\u0018\u00010\u0005H\u00a6@\u00a2\u0006\u0004\u0008z\u0010uJ\"\u0010}\u001a\u00020|2\u0006\u0010x\u001a\u00020\u00052\u0008\u0010v\u001a\u0004\u0018\u00010{H\u00a6@\u00a2\u0006\u0004\u0008}\u0010~J\"\u0010\u0081\u0001\u001a\u00020\u00102\r\u0010\u0080\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u007f0QH\u00a6@\u00a2\u0006\u0006\u0008\u0081\u0001\u0010\u0082\u0001J?\u0010\u0088\u0001\u001a\u00020\u00102\u000e\u0010\u0084\u0001\u001a\t\u0012\u0005\u0012\u00030\u0083\u00010Q2\u0008\u0010\u0085\u0001\u001a\u00030\u0083\u00012\u0006\u0010,\u001a\u00020\n2\u0008\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u00a6@\u00a2\u0006\u0006\u0008\u0088\u0001\u0010\u0089\u0001J2\u0010\u0090\u0001\u001a\u00020\u00102\u0008\u0010\u008b\u0001\u001a\u00030\u008a\u00012\n\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008c\u00012\u0008\u0010\u008f\u0001\u001a\u00030\u008e\u0001H&\u00a2\u0006\u0006\u0008\u0090\u0001\u0010\u0091\u0001J#\u0010\u0094\u0001\u001a\u00030\u0093\u00012\r\u0010\u0092\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00050QH\u00a6@\u00a2\u0006\u0006\u0008\u0094\u0001\u0010\u0082\u0001J\u0011\u0010\u0095\u0001\u001a\u00020\u0010H&\u00a2\u0006\u0005\u0008\u0095\u0001\u0010<J\u001d\u0010\u0098\u0001\u001a\u00030\u0097\u00012\u0007\u0010V\u001a\u00030\u0096\u0001H\u00a6@\u00a2\u0006\u0006\u0008\u0098\u0001\u0010\u0099\u0001J\u001d\u0010\u009c\u0001\u001a\u00030\u009b\u00012\u0007\u0010V\u001a\u00030\u009a\u0001H\u00a6@\u00a2\u0006\u0006\u0008\u009c\u0001\u0010\u009d\u0001J\u001b\u0010\u009f\u0001\u001a\u00020\u00102\u0007\u0010\u009e\u0001\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0005\u0008\u009f\u0001\u0010uJ\u001b\u0010\u00a0\u0001\u001a\u00020\u00102\u0007\u0010\u009e\u0001\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0005\u0008\u00a0\u0001\u0010uJ\u001e\u0010\u00a2\u0001\u001a\u00030\u00a3\u00012\u0008\u0010\u00a2\u0001\u001a\u00030\u00a1\u0001H\u00a6@\u00a2\u0006\u0006\u0008\u00a2\u0001\u0010\u00a4\u0001J\u001e\u0010\u00a8\u0001\u001a\u00030\u00a7\u00012\u0008\u0010\u00a6\u0001\u001a\u00030\u00a5\u0001H\u00a6@\u00a2\u0006\u0006\u0008\u00a8\u0001\u0010\u00a9\u0001J\u001e\u0010\u00ad\u0001\u001a\u00030\u00ac\u00012\u0008\u0010\u00ab\u0001\u001a\u00030\u00aa\u0001H\u00a6@\u00a2\u0006\u0006\u0008\u00ad\u0001\u0010\u00ae\u0001J\u001c\u0010\u00b0\u0001\u001a\u00030\u00af\u00012\u0007\u0010\u009e\u0001\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0005\u0008\u00b0\u0001\u0010uJ\u001e\u0010\u00b3\u0001\u001a\u00030\u00b2\u00012\u0008\u0010\u00ab\u0001\u001a\u00030\u00b1\u0001H\u00a6@\u00a2\u0006\u0006\u0008\u00b3\u0001\u0010\u00b4\u0001J3\u0010\u00bb\u0001\u001a\u00030\u00ba\u00012\u0008\u0010\u00b6\u0001\u001a\u00030\u00b5\u00012\u0008\u0010\u00b8\u0001\u001a\u00030\u00b7\u00012\t\u0010\u00b9\u0001\u001a\u0004\u0018\u00010\u0005H\u00a6@\u00a2\u0006\u0006\u0008\u00bb\u0001\u0010\u00bc\u0001J\u001e\u0010\u00c0\u0001\u001a\u00030\u00bf\u00012\u0008\u0010\u00be\u0001\u001a\u00030\u00bd\u0001H\u00a6@\u00a2\u0006\u0006\u0008\u00c0\u0001\u0010\u00c1\u0001J\u001c\u0010\u00c4\u0001\u001a\u00030\u00c3\u00012\u0007\u0010\u00c2\u0001\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0005\u0008\u00c4\u0001\u0010uJ0\u0010\u00c9\u0001\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00052\n\u0010\u00c6\u0001\u001a\u0005\u0018\u00010\u00c5\u00012\u0008\u0010\u00c8\u0001\u001a\u00030\u00c7\u0001H&\u00a2\u0006\u0006\u0008\u00c9\u0001\u0010\u00ca\u0001J\u001c\u0010\u00cd\u0001\u001a\u00030\u00cc\u00012\u0007\u0010\u00cb\u0001\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0005\u0008\u00cd\u0001\u0010uJ\u001c\u0010\u00ce\u0001\u001a\u00030\u00cc\u00012\u0007\u0010\u00cb\u0001\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0005\u0008\u00ce\u0001\u0010uJ#\u0010\u00cf\u0001\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00052\u0007\u0010\u00cb\u0001\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0005\u0008\u00cf\u0001\u0010_J#\u0010\u00d0\u0001\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00052\u0007\u0010\u00cb\u0001\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0005\u0008\u00d0\u0001\u0010_JS\u0010\u00d7\u0001\u001a\u00030\u00d6\u00012\t\u0010\u00cb\u0001\u001a\u0004\u0018\u00010\u00052\t\u0010\u00d1\u0001\u001a\u0004\u0018\u00010\u00052\u001d\u0010\u00d4\u0001\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00d2\u0001j\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00d3\u00012\u0008\u0010\u00d5\u0001\u001a\u00030\u00b7\u0001H\u00a6@\u00a2\u0006\u0006\u0008\u00d7\u0001\u0010\u00d8\u0001J\'\u0010\u00da\u0001\u001a\u00030\u00d6\u00012\u0007\u0010\u00d9\u0001\u001a\u00020\u00052\u0008\u0010\u00d5\u0001\u001a\u00030\u00b7\u0001H\u00a6@\u00a2\u0006\u0006\u0008\u00da\u0001\u0010\u00db\u0001J\u001d\u0010\u00de\u0001\u001a\u00020\u00102\u0008\u0010\u00dd\u0001\u001a\u00030\u00dc\u0001H\u00a6@\u00a2\u0006\u0006\u0008\u00de\u0001\u0010\u00df\u0001J\u001d\u0010\u00e0\u0001\u001a\u00020\u00102\u0008\u0010\u00dd\u0001\u001a\u00030\u00dc\u0001H\u00a6@\u00a2\u0006\u0006\u0008\u00e0\u0001\u0010\u00df\u0001J,\u0010\u00e3\u0001\u001a\u00020\u00102\u0006\u00105\u001a\u0002042\u0007\u0010\u00e1\u0001\u001a\u00020\n2\u0007\u0010\u00e2\u0001\u001a\u00020\nH&\u00a2\u0006\u0006\u0008\u00e3\u0001\u0010\u00e4\u0001J\u0012\u0010\u00e5\u0001\u001a\u00020\u0010H\u00a6@\u00a2\u0006\u0005\u0008\u00e5\u0001\u0010NJ\u0012\u0010\u00e6\u0001\u001a\u00020\u0010H\u00a6@\u00a2\u0006\u0005\u0008\u00e6\u0001\u0010NJ$\u0010\u00e8\u0001\u001a\u00020\u00102\u0007\u0010\u00e1\u0001\u001a\u00020\n2\u0007\u0010\u00e7\u0001\u001a\u00020\nH&\u00a2\u0006\u0006\u0008\u00e8\u0001\u0010\u00e9\u0001J\u001b\u0010\u00eb\u0001\u001a\u00020\u00102\u0007\u0010\u00ea\u0001\u001a\u00020\nH\u00a6@\u00a2\u0006\u0005\u0008\u00eb\u0001\u0010)J1\u0010\u00f0\u0001\u001a\u00030\u00ef\u00012\u0007\u0010\u00ec\u0001\u001a\u00020\u00052\u0008\u0010\u00d5\u0001\u001a\u00030\u00b7\u00012\u0008\u0010\u00ee\u0001\u001a\u00030\u00ed\u0001H\u00a6@\u00a2\u0006\u0006\u0008\u00f0\u0001\u0010\u00f1\u0001J\u001b\u0010\u00f3\u0001\u001a\u00020\u00102\u0007\u0010\u00f2\u0001\u001a\u00020\u0005H&\u00a2\u0006\u0006\u0008\u00f3\u0001\u0010\u00f4\u0001J\u0012\u0010\u00f5\u0001\u001a\u00020\u0010H\u00a6@\u00a2\u0006\u0005\u0008\u00f5\u0001\u0010NJ&\u0010\u00f7\u0001\u001a\u00020\u00102\u0008\u0010\u00f6\u0001\u001a\u00030\u00b7\u00012\u0008\u0010\u0087\u0001\u001a\u00030\u0086\u0001H&\u00a2\u0006\u0006\u0008\u00f7\u0001\u0010\u00f8\u0001J\u001c\u0010\u00f9\u0001\u001a\u00020\u00102\u0008\u0010\u0087\u0001\u001a\u00030\u0086\u0001H&\u00a2\u0006\u0006\u0008\u00f9\u0001\u0010\u00fa\u0001R\"\u0010\u00ff\u0001\u001a\u00030\u00ed\u00018&@&X\u00a6\u000e\u00a2\u0006\u0010\u001a\u0006\u0008\u00fb\u0001\u0010\u00fc\u0001\"\u0006\u0008\u00fd\u0001\u0010\u00fe\u0001R\"\u0010\u0082\u0002\u001a\u00030\u00ed\u00018&@&X\u00a6\u000e\u00a2\u0006\u0010\u001a\u0006\u0008\u0080\u0002\u0010\u00fc\u0001\"\u0006\u0008\u0081\u0002\u0010\u00fe\u0001R\u0018\u0010\u0086\u0002\u001a\u00030\u0083\u00028&X\u00a6\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0084\u0002\u0010\u0085\u0002R\u0018\u0010\u00b6\u0001\u001a\u00030\u0087\u00028&X\u00a6\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0088\u0002\u0010\u0089\u0002\u00a8\u0006\u008a\u0002"
    }
    d2 = {
        "Llive/hms/video/transport/ITransport;",
        "",
        "Llive/hms/video/factories/noisecancellation/NoiseCancellation;",
        "noiseCancellation",
        "()Llive/hms/video/factories/noisecancellation/NoiseCancellation;",
        "",
        "authToken",
        "peerId",
        "peerName",
        "data",
        "",
        "serverSideSubscribeDegradation",
        "shouldSendOffer",
        "endpoint",
        "simulcastEnabled",
        "iceGatheringOnAnyAddressPorts",
        "Ll83/a0;",
        "join",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZZLq83/d;)Ljava/lang/Object;",
        "token",
        "Llive/hms/video/sdk/models/enums/RetrySchedulerState;",
        "source",
        "Llive/hms/video/sdk/models/PerformanceMeasurement;",
        "performanceMeasurement",
        "Lkotlin/Function1;",
        "Llive/hms/video/signal/init/InitConfig;",
        "initSdkStoreFlags",
        "connect",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/enums/RetrySchedulerState;Llive/hms/video/sdk/models/PerformanceMeasurement;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;",
        "sessionId",
        "Llive/hms/video/sdk/models/HMSPeer;",
        "hmsPeer",
        "Llive/hms/video/sdk/models/HMSRoom;",
        "hmsRoom",
        "websocketUrl",
        "updateAnalyticsParams",
        "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/models/HMSRoom;Ljava/lang/String;)V",
        "isSocketConnectionOpen",
        "()Z",
        "notifyServer",
        "leave",
        "(ZLq83/d;)Ljava/lang/Object;",
        "forPeerId",
        "toRoleName",
        "force",
        "roleChangeRequest",
        "(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;",
        "requestedBy",
        "roleChangeAccept",
        "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Lq83/d;)Ljava/lang/Object;",
        "Landroid/content/Context;",
        "context",
        "Llive/hms/video/media/settings/HMSTrackSettings;",
        "hmsTrackSettings",
        "Llive/hms/video/media/tracks/HMSTrackType;",
        "hmsTrackType",
        "Llive/hms/video/media/tracks/HMSTrack;",
        "getLocalTrackByType",
        "(Landroid/content/Context;Llive/hms/video/media/settings/HMSTrackSettings;Llive/hms/video/media/tracks/HMSTrackType;Lq83/d;)Ljava/lang/Object;",
        "removeTrackFromStream",
        "()V",
        "Landroid/content/Intent;",
        "mediaProjectionPermissionResultData",
        "Landroid/app/Notification;",
        "screenShareNotification",
        "getScreenShareTrack",
        "(Landroid/content/Context;Llive/hms/video/media/settings/HMSTrackSettings;Landroid/content/Intent;Landroid/app/Notification;Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/sdk/models/enums/AudioMixingMode;",
        "audioMixingMode",
        "Llive/hms/video/media/capturers/HMSCapturer;",
        "getAudioShareCapturer",
        "(Landroid/content/Context;Landroid/content/Intent;Llive/hms/video/sdk/models/enums/AudioMixingMode;Landroid/app/Notification;)Llive/hms/video/media/capturers/HMSCapturer;",
        "setAudioMixingMode",
        "(Llive/hms/video/sdk/models/enums/AudioMixingMode;)V",
        "track",
        "publishScreenshare",
        "(Llive/hms/video/media/tracks/HMSTrack;Lq83/d;)Ljava/lang/Object;",
        "unpublishScreenshare",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "tracks",
        "",
        "publish",
        "([Llive/hms/video/media/tracks/HMSTrack;Lq83/d;)Ljava/lang/Object;",
        "unpublish",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams;",
        "params",
        "Llive/hms/video/sdk/models/HMSMessageSendResponse;",
        "sendMessage",
        "(Llive/hms/video/signal/jsonrpc/models/HMSParams;Lq83/d;)Ljava/lang/Object;",
        "Lhms/webrtc/RTCStatsReport;",
        "getPublishPacketStats",
        "getSubscribePacketStats",
        "reason",
        "removePeerRequest",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "lock",
        "endRoom",
        "(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;",
        "hmsTrack",
        "mute",
        "changeTrackState",
        "(Llive/hms/video/media/tracks/HMSTrack;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;",
        "type",
        "roles",
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
        "name",
        "changeName",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
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
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/sdk/models/role/HMSRole;",
        "ofRoles",
        "toRole",
        "Llive/hms/video/sdk/HMSActionResultListener;",
        "hmsActionResultListener",
        "bulkRoleChangeRequest",
        "(Ljava/util/List;Llive/hms/video/sdk/models/role/HMSRole;ZLlive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/signal/init/TokenRequest;",
        "tokenRequest",
        "Llive/hms/video/signal/init/TokenRequestOptions;",
        "tokenRequestOptions",
        "Llive/hms/video/signal/init/HMSTokenListener;",
        "hmsTokenListener",
        "getAuthTokenByRoomCode",
        "(Llive/hms/video/signal/init/TokenRequest;Llive/hms/video/signal/init/TokenRequestOptions;Llive/hms/video/signal/init/HMSTokenListener;)V",
        "tags",
        "Llive/hms/video/sessionstore/SetMetadataListenerResult;",
        "setMetadataListener",
        "deInitLocalStreams",
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
        "Llive/hms/video/polls/models/HmsPollState;",
        "state",
        "",
        "count",
        "start",
        "Llive/hms/video/polls/network/PollListResponse;",
        "pollGetList",
        "(Llive/hms/video/polls/models/HmsPollState;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;",
        "options",
        "Llive/hms/video/whiteboard/network/HMSCreateWhiteBoardResponse;",
        "createWhiteBoard",
        "(Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;Lq83/d;)Ljava/lang/Object;",
        "id",
        "Llive/hms/video/whiteboard/network/HMSGetWhiteBoardResponse;",
        "getWhiteBoard",
        "Llive/hms/video/signal/init/LayoutRequestOptions;",
        "layoutRequestOptions",
        "Llive/hms/video/signal/init/HMSLayoutListener;",
        "hmsLayoutConfigListener",
        "getLayoutConfigByToken",
        "(Ljava/lang/String;Llive/hms/video/signal/init/LayoutRequestOptions;Llive/hms/video/signal/init/HMSLayoutListener;)V",
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
        "findPeers",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ILq83/d;)Ljava/lang/Object;",
        "iteratorId",
        "peerIteratorNext",
        "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/sdk/models/TranscriptionsMode;",
        "mode",
        "startRealTimeTranscription",
        "(Llive/hms/video/sdk/models/TranscriptionsMode;Lq83/d;)Ljava/lang/Object;",
        "stopRealTimeTranscription",
        "isSimulcastEnabled",
        "isSoftwareEchoCancellationEnabled",
        "initializePeerConnectionFactoryIfNeeded",
        "(Llive/hms/video/media/settings/HMSTrackSettings;ZZ)V",
        "renegotiationICE",
        "disposePeerConnectionFactory",
        "serverSoftwareEchoCancellationEnabled",
        "initHmsPeerConnectionFactory",
        "(ZZ)V",
        "isBackground",
        "reInitPeerConnectionFactory",
        "query",
        "",
        "offset",
        "Llive/hms/video/sdk/models/PeerNameSearchResponse;",
        "peerNameSearch",
        "(Ljava/lang/String;IJLq83/d;)Ljava/lang/Object;",
        "nodeId",
        "setNodeInfo",
        "(Ljava/lang/String;)V",
        "initPeerConnections",
        "audioResourceId",
        "streamAndPlayAudioFromRawFile",
        "(ILlive/hms/video/sdk/HMSActionResultListener;)V",
        "stopAudioFromRawFile",
        "(Llive/hms/video/sdk/HMSActionResultListener;)V",
        "getTimeAfterJoinResponse",
        "()J",
        "setTimeAfterJoinResponse",
        "(J)V",
        "timeAfterJoinResponse",
        "getTimeAfterWSOpen",
        "setTimeAfterWSOpen",
        "timeAfterWSOpen",
        "Llive/hms/video/events/AnalyticsEventsService;",
        "getAnalyticsEventsService",
        "()Llive/hms/video/events/AnalyticsEventsService;",
        "analyticsEventsService",
        "Llive/hms/video/transport/models/TransportState;",
        "getState",
        "()Llive/hms/video/transport/models/TransportState;",
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


# virtual methods
.method public abstract bulkRoleChangeRequest(Ljava/util/List;Llive/hms/video/sdk/models/role/HMSRole;ZLlive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract changeMetadata(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract changeName(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract changeSessionMetadata(Ljava/lang/String;Lcom/google/gson/JsonElement;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract changeTrackState(Llive/hms/video/media/tracks/HMSTrack;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract changeTrackState(ZLlive/hms/video/media/tracks/HMSTrackType;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract connect(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/enums/RetrySchedulerState;Llive/hms/video/sdk/models/PerformanceMeasurement;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Llive/hms/video/sdk/models/enums/RetrySchedulerState;",
            "Llive/hms/video/sdk/models/PerformanceMeasurement;",
            "Lkotlin/jvm/functions/Function1;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/signal/init/InitConfig;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract createPoll(Llive/hms/video/signal/jsonrpc/models/HMSParams$SetPollParams;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract createQuestion(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsSet;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract createWhiteBoard(Llive/hms/video/signal/jsonrpc/models/HMSParams$Options;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract deInitLocalStreams()V
.end method

.method public abstract disposePeerConnectionFactory(Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract endRoom(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract findPeers(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ILq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract getAnalyticsEventsService()Llive/hms/video/events/AnalyticsEventsService;
.end method

.method public abstract getAudioShareCapturer(Landroid/content/Context;Landroid/content/Intent;Llive/hms/video/sdk/models/enums/AudioMixingMode;Landroid/app/Notification;)Llive/hms/video/media/capturers/HMSCapturer;
.end method

.method public abstract getAuthTokenByRoomCode(Llive/hms/video/signal/init/TokenRequest;Llive/hms/video/signal/init/TokenRequestOptions;Llive/hms/video/signal/init/HMSTokenListener;)V
.end method

.method public abstract getLayoutConfigByToken(Ljava/lang/String;Llive/hms/video/signal/init/LayoutRequestOptions;Llive/hms/video/signal/init/HMSLayoutListener;)V
.end method

.method public abstract getLocalTrackByType(Landroid/content/Context;Llive/hms/video/media/settings/HMSTrackSettings;Llive/hms/video/media/tracks/HMSTrackType;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Llive/hms/video/media/settings/HMSTrackSettings;",
            "Llive/hms/video/media/tracks/HMSTrackType;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/media/tracks/HMSTrack;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getPublishPacketStats(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lhms/webrtc/RTCStatsReport;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getScreenShareTrack(Landroid/content/Context;Llive/hms/video/media/settings/HMSTrackSettings;Landroid/content/Intent;Landroid/app/Notification;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Llive/hms/video/media/settings/HMSTrackSettings;",
            "Landroid/content/Intent;",
            "Landroid/app/Notification;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/media/tracks/HMSTrack;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getSessionMetadata(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract getState()Llive/hms/video/transport/models/TransportState;
.end method

.method public abstract getSubscribePacketStats(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lhms/webrtc/RTCStatsReport;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getTimeAfterJoinResponse()J
.end method

.method public abstract getTimeAfterWSOpen()J
.end method

.method public abstract getWhiteBoard(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract groupAdd(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract groupJoin(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract groupLeave(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract groupRemove(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract initHmsPeerConnectionFactory(ZZ)V
.end method

.method public abstract initPeerConnections(Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract initializePeerConnectionFactoryIfNeeded(Llive/hms/video/media/settings/HMSTrackSettings;ZZ)V
.end method

.method public abstract isSocketConnectionOpen()Z
.end method

.method public abstract join(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZZLq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZZ",
            "Ljava/lang/String;",
            "ZZ",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract leave(ZLq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract noiseCancellation()Llive/hms/video/factories/noisecancellation/NoiseCancellation;
.end method

.method public abstract peerIteratorNext(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract peerNameSearch(Ljava/lang/String;IJLq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract pollAddResponse(Llive/hms/video/polls/HMSPollResponseBuilder;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract pollGetLeaderboard(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollLeaderboardQuery;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract pollGetList(Llive/hms/video/polls/models/HmsPollState;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract pollGetResponses(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollResponsesQuery;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract pollGetResults(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract pollQuestionsGet(Llive/hms/video/signal/jsonrpc/models/HMSParams$PollQuestionsGet;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract pollStart(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract pollStop(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract publish([Llive/hms/video/media/tracks/HMSTrack;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Llive/hms/video/media/tracks/HMSTrack;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "+",
            "Llive/hms/video/media/tracks/HMSTrack;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract publishScreenshare(Llive/hms/video/media/tracks/HMSTrack;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/media/tracks/HMSTrack;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract reInitPeerConnectionFactory(ZLq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract removePeerRequest(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract removeTrackFromStream()V
.end method

.method public abstract renegotiationICE(Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract roleChangeAccept(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract roleChangeRequest(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract sendMessage(Llive/hms/video/signal/jsonrpc/models/HMSParams;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract setAudioMixingMode(Llive/hms/video/sdk/models/enums/AudioMixingMode;)V
.end method

.method public abstract setHlsSessionMetadata(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract setMetadataListener(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract setNodeInfo(Ljava/lang/String;)V
.end method

.method public abstract setTimeAfterJoinResponse(J)V
.end method

.method public abstract setTimeAfterWSOpen(J)V
.end method

.method public abstract startHLSStreaming(Llive/hms/video/sdk/models/HMSHLSConfig;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract startRealTimeTranscription(Llive/hms/video/sdk/models/TranscriptionsMode;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract startRtmpOrRecording(Llive/hms/video/sdk/models/HMSRecordingConfig;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract stopAudioFromRawFile(Llive/hms/video/sdk/HMSActionResultListener;)V
.end method

.method public abstract stopHLSStreaming(Llive/hms/video/sdk/models/HMSHLSConfig;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract stopRealTimeTranscription(Llive/hms/video/sdk/models/TranscriptionsMode;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract stopRtmpAndRecording(Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract streamAndPlayAudioFromRawFile(ILlive/hms/video/sdk/HMSActionResultListener;)V
.end method

.method public abstract unpublish([Llive/hms/video/media/tracks/HMSTrack;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Llive/hms/video/media/tracks/HMSTrack;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract unpublishScreenshare(Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract updateAnalyticsParams(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Llive/hms/video/sdk/models/HMSRoom;Ljava/lang/String;)V
.end method
